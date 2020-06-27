package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object frauddetector {
  type BatchCreateVariableErrorList     = js.Array[BatchCreateVariableError]
  type BatchGetVariableErrorList        = js.Array[BatchGetVariableError]
  type CsvIndexToVariableMap            = js.Dictionary[String]
  type DetectorList                     = js.Array[Detector]
  type DetectorVersionMaxResults        = Int
  type DetectorVersionSummaryList       = js.Array[DetectorVersionSummary]
  type DetectorsMaxResults              = Int
  type EventAttributeMap                = js.Dictionary[attributeValue]
  type ExternalModelEndpointDataBlobMap = js.Dictionary[ModelEndpointDataBlob]
  type ExternalModelList                = js.Array[ExternalModel]
  type ExternalModelsMaxResults         = Int
  type IsOpaque                         = Boolean
  type JsonKeyToVariableMap             = js.Dictionary[String]
  type LabelMapper                      = js.Dictionary[ListOfStrings]
  type ListOfModelScores                = js.Array[ModelScores]
  type ListOfModelVersions              = js.Array[ModelVersion]
  type ListOfStrings                    = js.Array[String]
  type MaxResults                       = Int
  type MetricsMap                       = js.Dictionary[String]
  type ModelList                        = js.Array[Model]
  type ModelPredictionMap               = js.Dictionary[Float]
  type ModelVariableIndex               = Int
  type ModelVariablesList               = js.Array[ModelVariable]
  type ModelVersionDetailList           = js.Array[ModelVersionDetail]
  type NameList                         = js.Array[String]
  type NonEmptyListOfStrings            = js.Array[String]
  type OutcomeList                      = js.Array[Outcome]
  type OutcomesMaxResults               = Int
  type RuleDetailList                   = js.Array[RuleDetail]
  type RuleList                         = js.Array[Rule]
  type RulesMaxResults                  = Int
  type VariableEntryList                = js.Array[VariableEntry]
  type VariableList                     = js.Array[Variable]
  type VariablesMaxResults              = Int
  type attributeKey                     = String
  type attributeValue                   = String
  type blob                             = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type contentType                      = String
  type description                      = String
  type iamRoleArn                       = String
  type identifier                       = String
  type nonEmptyString                   = String
  type ruleExpression                   = String
  type s3BucketLocation                 = String
  type time                             = String

  implicit final class FraudDetectorOps(private val service: FraudDetector) extends AnyVal {

    @inline def batchCreateVariableFuture(params: BatchCreateVariableRequest): Future[BatchCreateVariableResult] =
      service.batchCreateVariable(params).promise().toFuture
    @inline def batchGetVariableFuture(params: BatchGetVariableRequest): Future[BatchGetVariableResult] =
      service.batchGetVariable(params).promise().toFuture
    @inline def createDetectorVersionFuture(params: CreateDetectorVersionRequest): Future[CreateDetectorVersionResult] =
      service.createDetectorVersion(params).promise().toFuture
    @inline def createModelVersionFuture(params: CreateModelVersionRequest): Future[CreateModelVersionResult] =
      service.createModelVersion(params).promise().toFuture
    @inline def createRuleFuture(params: CreateRuleRequest): Future[CreateRuleResult] =
      service.createRule(params).promise().toFuture
    @inline def createVariableFuture(params: CreateVariableRequest): Future[CreateVariableResult] =
      service.createVariable(params).promise().toFuture
    @inline def deleteDetectorVersionFuture(params: DeleteDetectorVersionRequest): Future[DeleteDetectorVersionResult] =
      service.deleteDetectorVersion(params).promise().toFuture
    @inline def deleteEventFuture(params: DeleteEventRequest): Future[DeleteEventResult] =
      service.deleteEvent(params).promise().toFuture
    @inline def describeDetectorFuture(params: DescribeDetectorRequest): Future[DescribeDetectorResult] =
      service.describeDetector(params).promise().toFuture
    @inline def describeModelVersionsFuture(params: DescribeModelVersionsRequest): Future[DescribeModelVersionsResult] =
      service.describeModelVersions(params).promise().toFuture
    @inline def getDetectorVersionFuture(params: GetDetectorVersionRequest): Future[GetDetectorVersionResult] =
      service.getDetectorVersion(params).promise().toFuture
    @inline def getDetectorsFuture(params: GetDetectorsRequest): Future[GetDetectorsResult] =
      service.getDetectors(params).promise().toFuture
    @inline def getExternalModelsFuture(params: GetExternalModelsRequest): Future[GetExternalModelsResult] =
      service.getExternalModels(params).promise().toFuture
    @inline def getModelVersionFuture(params: GetModelVersionRequest): Future[GetModelVersionResult] =
      service.getModelVersion(params).promise().toFuture
    @inline def getModelsFuture(params: GetModelsRequest): Future[GetModelsResult] =
      service.getModels(params).promise().toFuture
    @inline def getOutcomesFuture(params: GetOutcomesRequest): Future[GetOutcomesResult] =
      service.getOutcomes(params).promise().toFuture
    @inline def getPredictionFuture(params: GetPredictionRequest): Future[GetPredictionResult] =
      service.getPrediction(params).promise().toFuture
    @inline def getRulesFuture(params: GetRulesRequest): Future[GetRulesResult] =
      service.getRules(params).promise().toFuture
    @inline def getVariablesFuture(params: GetVariablesRequest): Future[GetVariablesResult] =
      service.getVariables(params).promise().toFuture
    @inline def putDetectorFuture(params: PutDetectorRequest): Future[PutDetectorResult] =
      service.putDetector(params).promise().toFuture
    @inline def putExternalModelFuture(params: PutExternalModelRequest): Future[PutExternalModelResult] =
      service.putExternalModel(params).promise().toFuture
    @inline def putModelFuture(params: PutModelRequest): Future[PutModelResult] =
      service.putModel(params).promise().toFuture
    @inline def putOutcomeFuture(params: PutOutcomeRequest): Future[PutOutcomeResult] =
      service.putOutcome(params).promise().toFuture
    @inline def updateDetectorVersionFuture(params: UpdateDetectorVersionRequest): Future[UpdateDetectorVersionResult] =
      service.updateDetectorVersion(params).promise().toFuture
    @inline def updateDetectorVersionMetadataFuture(
        params: UpdateDetectorVersionMetadataRequest
    ): Future[UpdateDetectorVersionMetadataResult] = service.updateDetectorVersionMetadata(params).promise().toFuture
    @inline def updateDetectorVersionStatusFuture(
        params: UpdateDetectorVersionStatusRequest
    ): Future[UpdateDetectorVersionStatusResult] = service.updateDetectorVersionStatus(params).promise().toFuture
    @inline def updateModelVersionFuture(params: UpdateModelVersionRequest): Future[UpdateModelVersionResult] =
      service.updateModelVersion(params).promise().toFuture
    @inline def updateRuleMetadataFuture(params: UpdateRuleMetadataRequest): Future[UpdateRuleMetadataResult] =
      service.updateRuleMetadata(params).promise().toFuture
    @inline def updateRuleVersionFuture(params: UpdateRuleVersionRequest): Future[UpdateRuleVersionResult] =
      service.updateRuleVersion(params).promise().toFuture
    @inline def updateVariableFuture(params: UpdateVariableRequest): Future[UpdateVariableResult] =
      service.updateVariable(params).promise().toFuture
  }
}

package frauddetector {
  @js.native
  @JSImport("aws-sdk", "FraudDetector")
  class FraudDetector() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCreateVariable(params: BatchCreateVariableRequest): Request[BatchCreateVariableResult]       = js.native
    def batchGetVariable(params: BatchGetVariableRequest): Request[BatchGetVariableResult]                = js.native
    def createDetectorVersion(params: CreateDetectorVersionRequest): Request[CreateDetectorVersionResult] = js.native
    def createModelVersion(params: CreateModelVersionRequest): Request[CreateModelVersionResult]          = js.native
    def createRule(params: CreateRuleRequest): Request[CreateRuleResult]                                  = js.native
    def createVariable(params: CreateVariableRequest): Request[CreateVariableResult]                      = js.native
    def deleteDetectorVersion(params: DeleteDetectorVersionRequest): Request[DeleteDetectorVersionResult] = js.native
    def deleteEvent(params: DeleteEventRequest): Request[DeleteEventResult]                               = js.native
    def describeDetector(params: DescribeDetectorRequest): Request[DescribeDetectorResult]                = js.native
    def describeModelVersions(params: DescribeModelVersionsRequest): Request[DescribeModelVersionsResult] = js.native
    def getDetectorVersion(params: GetDetectorVersionRequest): Request[GetDetectorVersionResult]          = js.native
    def getDetectors(params: GetDetectorsRequest): Request[GetDetectorsResult]                            = js.native
    def getExternalModels(params: GetExternalModelsRequest): Request[GetExternalModelsResult]             = js.native
    def getModelVersion(params: GetModelVersionRequest): Request[GetModelVersionResult]                   = js.native
    def getModels(params: GetModelsRequest): Request[GetModelsResult]                                     = js.native
    def getOutcomes(params: GetOutcomesRequest): Request[GetOutcomesResult]                               = js.native
    def getPrediction(params: GetPredictionRequest): Request[GetPredictionResult]                         = js.native
    def getRules(params: GetRulesRequest): Request[GetRulesResult]                                        = js.native
    def getVariables(params: GetVariablesRequest): Request[GetVariablesResult]                            = js.native
    def putDetector(params: PutDetectorRequest): Request[PutDetectorResult]                               = js.native
    def putExternalModel(params: PutExternalModelRequest): Request[PutExternalModelResult]                = js.native
    def putModel(params: PutModelRequest): Request[PutModelResult]                                        = js.native
    def putOutcome(params: PutOutcomeRequest): Request[PutOutcomeResult]                                  = js.native
    def updateDetectorVersion(params: UpdateDetectorVersionRequest): Request[UpdateDetectorVersionResult] = js.native
    def updateDetectorVersionMetadata(
        params: UpdateDetectorVersionMetadataRequest
    ): Request[UpdateDetectorVersionMetadataResult] = js.native
    def updateDetectorVersionStatus(
        params: UpdateDetectorVersionStatusRequest
    ): Request[UpdateDetectorVersionStatusResult]                                                = js.native
    def updateModelVersion(params: UpdateModelVersionRequest): Request[UpdateModelVersionResult] = js.native
    def updateRuleMetadata(params: UpdateRuleMetadataRequest): Request[UpdateRuleMetadataResult] = js.native
    def updateRuleVersion(params: UpdateRuleVersionRequest): Request[UpdateRuleVersionResult]    = js.native
    def updateVariable(params: UpdateVariableRequest): Request[UpdateVariableResult]             = js.native
  }

  /**
    * Provides the error of the batch create variable API.
    */
  @js.native
  @Factory
  trait BatchCreateVariableError extends js.Object {
    var code: js.UndefOr[Int]
    var message: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait BatchCreateVariableRequest extends js.Object {
    var variableEntries: VariableEntryList
  }

  @js.native
  @Factory
  trait BatchCreateVariableResult extends js.Object {
    var errors: js.UndefOr[BatchCreateVariableErrorList]
  }

  /**
    * Provides the error of the batch get variable API.
    */
  @js.native
  @Factory
  trait BatchGetVariableError extends js.Object {
    var code: js.UndefOr[Int]
    var message: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait BatchGetVariableRequest extends js.Object {
    var names: NameList
  }

  @js.native
  @Factory
  trait BatchGetVariableResult extends js.Object {
    var errors: js.UndefOr[BatchGetVariableErrorList]
    var variables: js.UndefOr[VariableList]
  }

  @js.native
  @Factory
  trait CreateDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var rules: RuleList
    var description: js.UndefOr[description]
    var externalModelEndpoints: js.UndefOr[ListOfStrings]
    var modelVersions: js.UndefOr[ListOfModelVersions]
  }

  @js.native
  @Factory
  trait CreateDetectorVersionResult extends js.Object {
    var detectorId: js.UndefOr[identifier]
    var detectorVersionId: js.UndefOr[nonEmptyString]
    var status: js.UndefOr[DetectorVersionStatus]
  }

  @js.native
  @Factory
  trait CreateModelVersionRequest extends js.Object {
    var modelId: identifier
    var modelType: ModelTypeEnum
    var description: js.UndefOr[description]
  }

  @js.native
  @Factory
  trait CreateModelVersionResult extends js.Object {
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[nonEmptyString]
    var status: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateRuleRequest extends js.Object {
    var detectorId: identifier
    var expression: ruleExpression
    var language: Language
    var outcomes: NonEmptyListOfStrings
    var ruleId: identifier
    var description: js.UndefOr[description]
  }

  @js.native
  @Factory
  trait CreateRuleResult extends js.Object {
    var rule: js.UndefOr[Rule]
  }

  @js.native
  @Factory
  trait CreateVariableRequest extends js.Object {
    var dataSource: DataSource
    var dataType: DataType
    var defaultValue: String
    var name: String
    var description: js.UndefOr[String]
    var variableType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateVariableResult extends js.Object {}

  @js.native
  sealed trait DataSource extends js.Any
  object DataSource extends js.Object {
    val EVENT                = "EVENT".asInstanceOf[DataSource]
    val MODEL_SCORE          = "MODEL_SCORE".asInstanceOf[DataSource]
    val EXTERNAL_MODEL_SCORE = "EXTERNAL_MODEL_SCORE".asInstanceOf[DataSource]

    val values = js.Object.freeze(js.Array(EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE))
  }

  @js.native
  sealed trait DataType extends js.Any
  object DataType extends js.Object {
    val STRING  = "STRING".asInstanceOf[DataType]
    val INTEGER = "INTEGER".asInstanceOf[DataType]
    val FLOAT   = "FLOAT".asInstanceOf[DataType]
    val BOOLEAN = "BOOLEAN".asInstanceOf[DataType]

    val values = js.Object.freeze(js.Array(STRING, INTEGER, FLOAT, BOOLEAN))
  }

  @js.native
  @Factory
  trait DeleteDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
  }

  @js.native
  @Factory
  trait DeleteDetectorVersionResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteEventRequest extends js.Object {
    var eventId: String
  }

  @js.native
  @Factory
  trait DeleteEventResult extends js.Object {}

  @js.native
  @Factory
  trait DescribeDetectorRequest extends js.Object {
    var detectorId: identifier
    var maxResults: js.UndefOr[DetectorVersionMaxResults]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeDetectorResult extends js.Object {
    var detectorId: js.UndefOr[identifier]
    var detectorVersionSummaries: js.UndefOr[DetectorVersionSummaryList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeModelVersionsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[nonEmptyString]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeModelVersionsResult extends js.Object {
    var modelVersionDetails: js.UndefOr[ModelVersionDetailList]
    var nextToken: js.UndefOr[String]
  }

  /**
    * The detector.
    */
  @js.native
  @Factory
  trait Detector extends js.Object {
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var detectorId: js.UndefOr[identifier]
    var lastUpdatedTime: js.UndefOr[time]
  }

  @js.native
  sealed trait DetectorVersionStatus extends js.Any
  object DetectorVersionStatus extends js.Object {
    val DRAFT    = "DRAFT".asInstanceOf[DetectorVersionStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[DetectorVersionStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[DetectorVersionStatus]

    val values = js.Object.freeze(js.Array(DRAFT, ACTIVE, INACTIVE))
  }

  /**
    * The summary of the detector version.
    */
  @js.native
  @Factory
  trait DetectorVersionSummary extends js.Object {
    var description: js.UndefOr[description]
    var detectorVersionId: js.UndefOr[nonEmptyString]
    var lastUpdatedTime: js.UndefOr[time]
    var status: js.UndefOr[DetectorVersionStatus]
  }

  /**
    * The Amazon SageMaker model.
    */
  @js.native
  @Factory
  trait ExternalModel extends js.Object {
    var createdTime: js.UndefOr[time]
    var inputConfiguration: js.UndefOr[ModelInputConfiguration]
    var lastUpdatedTime: js.UndefOr[time]
    var modelEndpoint: js.UndefOr[String]
    var modelEndpointStatus: js.UndefOr[ModelEndpointStatus]
    var modelSource: js.UndefOr[ModelSource]
    var outputConfiguration: js.UndefOr[ModelOutputConfiguration]
    var role: js.UndefOr[Role]
  }

  @js.native
  @Factory
  trait GetDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
  }

  @js.native
  @Factory
  trait GetDetectorVersionResult extends js.Object {
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var detectorId: js.UndefOr[identifier]
    var detectorVersionId: js.UndefOr[nonEmptyString]
    var externalModelEndpoints: js.UndefOr[ListOfStrings]
    var lastUpdatedTime: js.UndefOr[time]
    var modelVersions: js.UndefOr[ListOfModelVersions]
    var rules: js.UndefOr[RuleList]
    var status: js.UndefOr[DetectorVersionStatus]
  }

  @js.native
  @Factory
  trait GetDetectorsRequest extends js.Object {
    var detectorId: js.UndefOr[identifier]
    var maxResults: js.UndefOr[DetectorsMaxResults]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDetectorsResult extends js.Object {
    var detectors: js.UndefOr[DetectorList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetExternalModelsRequest extends js.Object {
    var maxResults: js.UndefOr[ExternalModelsMaxResults]
    var modelEndpoint: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetExternalModelsResult extends js.Object {
    var externalModels: js.UndefOr[ExternalModelList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetModelVersionRequest extends js.Object {
    var modelId: identifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: nonEmptyString
  }

  @js.native
  @Factory
  trait GetModelVersionResult extends js.Object {
    var description: js.UndefOr[description]
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[nonEmptyString]
    var status: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetModelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetModelsResult extends js.Object {
    var models: js.UndefOr[ModelList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetOutcomesRequest extends js.Object {
    var maxResults: js.UndefOr[OutcomesMaxResults]
    var name: js.UndefOr[identifier]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetOutcomesResult extends js.Object {
    var nextToken: js.UndefOr[String]
    var outcomes: js.UndefOr[OutcomeList]
  }

  @js.native
  @Factory
  trait GetPredictionRequest extends js.Object {
    var detectorId: String
    var eventId: String
    var detectorVersionId: js.UndefOr[String]
    var eventAttributes: js.UndefOr[EventAttributeMap]
    var externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap]
  }

  @js.native
  @Factory
  trait GetPredictionResult extends js.Object {
    var modelScores: js.UndefOr[ListOfModelScores]
    var outcomes: js.UndefOr[ListOfStrings]
  }

  @js.native
  @Factory
  trait GetRulesRequest extends js.Object {
    var detectorId: identifier
    var maxResults: js.UndefOr[RulesMaxResults]
    var nextToken: js.UndefOr[String]
    var ruleId: js.UndefOr[identifier]
    var ruleVersion: js.UndefOr[nonEmptyString]
  }

  @js.native
  @Factory
  trait GetRulesResult extends js.Object {
    var nextToken: js.UndefOr[String]
    var ruleDetails: js.UndefOr[RuleDetailList]
  }

  @js.native
  @Factory
  trait GetVariablesRequest extends js.Object {
    var maxResults: js.UndefOr[VariablesMaxResults]
    var name: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetVariablesResult extends js.Object {
    var nextToken: js.UndefOr[String]
    var variables: js.UndefOr[VariableList]
  }

  /**
    * The label schema.
    */
  @js.native
  @Factory
  trait LabelSchema extends js.Object {
    var labelKey: String
    var labelMapper: LabelMapper
  }

  @js.native
  sealed trait Language extends js.Any
  object Language extends js.Object {
    val DETECTORPL = "DETECTORPL".asInstanceOf[Language]

    val values = js.Object.freeze(js.Array(DETECTORPL))
  }

  /**
    * The model.
    */
  @js.native
  @Factory
  trait Model extends js.Object {
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var labelSchema: js.UndefOr[LabelSchema]
    var lastUpdatedTime: js.UndefOr[time]
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVariables: js.UndefOr[ModelVariablesList]
    var trainingDataSource: js.UndefOr[TrainingDataSource]
  }

  /**
    * A pre-formed Amazon SageMaker model input you can include if your detector version includes an imported Amazon SageMaker model endpoint with pass-through input configuration.
    */
  @js.native
  @Factory
  trait ModelEndpointDataBlob extends js.Object {
    var byteBuffer: js.UndefOr[blob]
    var contentType: js.UndefOr[contentType]
  }

  @js.native
  sealed trait ModelEndpointStatus extends js.Any
  object ModelEndpointStatus extends js.Object {
    val ASSOCIATED  = "ASSOCIATED".asInstanceOf[ModelEndpointStatus]
    val DISSOCIATED = "DISSOCIATED".asInstanceOf[ModelEndpointStatus]

    val values = js.Object.freeze(js.Array(ASSOCIATED, DISSOCIATED))
  }

  /**
    * The model input configuration.
    */
  @js.native
  @Factory
  trait ModelInputConfiguration extends js.Object {
    var isOpaque: IsOpaque
    var csvInputTemplate: js.UndefOr[String]
    var format: js.UndefOr[ModelInputDataFormat]
    var jsonInputTemplate: js.UndefOr[String]
  }

  @js.native
  sealed trait ModelInputDataFormat extends js.Any
  object ModelInputDataFormat extends js.Object {
    val TEXT_CSV         = "TEXT_CSV".asInstanceOf[ModelInputDataFormat]
    val APPLICATION_JSON = "APPLICATION_JSON".asInstanceOf[ModelInputDataFormat]

    val values = js.Object.freeze(js.Array(TEXT_CSV, APPLICATION_JSON))
  }

  /**
    * Provides the model output configuration.
    */
  @js.native
  @Factory
  trait ModelOutputConfiguration extends js.Object {
    var format: ModelOutputDataFormat
    var csvIndexToVariableMap: js.UndefOr[CsvIndexToVariableMap]
    var jsonKeyToVariableMap: js.UndefOr[JsonKeyToVariableMap]
  }

  @js.native
  sealed trait ModelOutputDataFormat extends js.Any
  object ModelOutputDataFormat extends js.Object {
    val TEXT_CSV              = "TEXT_CSV".asInstanceOf[ModelOutputDataFormat]
    val APPLICATION_JSONLINES = "APPLICATION_JSONLINES".asInstanceOf[ModelOutputDataFormat]

    val values = js.Object.freeze(js.Array(TEXT_CSV, APPLICATION_JSONLINES))
  }

  /**
    * The fraud prediction scores.
    */
  @js.native
  @Factory
  trait ModelScores extends js.Object {
    var modelVersion: js.UndefOr[ModelVersion]
    var scores: js.UndefOr[ModelPredictionMap]
  }

  @js.native
  sealed trait ModelSource extends js.Any
  object ModelSource extends js.Object {
    val SAGEMAKER = "SAGEMAKER".asInstanceOf[ModelSource]

    val values = js.Object.freeze(js.Array(SAGEMAKER))
  }

  @js.native
  sealed trait ModelTypeEnum extends js.Any
  object ModelTypeEnum extends js.Object {
    val ONLINE_FRAUD_INSIGHTS = "ONLINE_FRAUD_INSIGHTS".asInstanceOf[ModelTypeEnum]

    val values = js.Object.freeze(js.Array(ONLINE_FRAUD_INSIGHTS))
  }

  /**
    * The model variable.&gt;
    */
  @js.native
  @Factory
  trait ModelVariable extends js.Object {
    var name: String
    var index: js.UndefOr[ModelVariableIndex]
  }

  /**
    * The model version.
    */
  @js.native
  @Factory
  trait ModelVersion extends js.Object {
    var modelId: identifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: nonEmptyString
  }

  /**
    * Provides the model version details.
    */
  @js.native
  @Factory
  trait ModelVersionDetail extends js.Object {
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var labelSchema: js.UndefOr[LabelSchema]
    var lastUpdatedTime: js.UndefOr[time]
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVariables: js.UndefOr[ModelVariablesList]
    var modelVersionNumber: js.UndefOr[nonEmptyString]
    var status: js.UndefOr[String]
    var trainingDataSource: js.UndefOr[TrainingDataSource]
    var trainingMetrics: js.UndefOr[MetricsMap]
    var validationMetrics: js.UndefOr[MetricsMap]
  }

  @js.native
  sealed trait ModelVersionStatus extends js.Any
  object ModelVersionStatus extends js.Object {
    val TRAINING_IN_PROGRESS   = "TRAINING_IN_PROGRESS".asInstanceOf[ModelVersionStatus]
    val TRAINING_COMPLETE      = "TRAINING_COMPLETE".asInstanceOf[ModelVersionStatus]
    val ACTIVATE_REQUESTED     = "ACTIVATE_REQUESTED".asInstanceOf[ModelVersionStatus]
    val ACTIVATE_IN_PROGRESS   = "ACTIVATE_IN_PROGRESS".asInstanceOf[ModelVersionStatus]
    val ACTIVE                 = "ACTIVE".asInstanceOf[ModelVersionStatus]
    val INACTIVATE_IN_PROGRESS = "INACTIVATE_IN_PROGRESS".asInstanceOf[ModelVersionStatus]
    val INACTIVE               = "INACTIVE".asInstanceOf[ModelVersionStatus]
    val ERROR                  = "ERROR".asInstanceOf[ModelVersionStatus]

    val values = js.Object.freeze(
      js.Array(
        TRAINING_IN_PROGRESS,
        TRAINING_COMPLETE,
        ACTIVATE_REQUESTED,
        ACTIVATE_IN_PROGRESS,
        ACTIVE,
        INACTIVATE_IN_PROGRESS,
        INACTIVE,
        ERROR
      )
    )
  }

  /**
    * The outcome.
    */
  @js.native
  @Factory
  trait Outcome extends js.Object {
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var lastUpdatedTime: js.UndefOr[time]
    var name: js.UndefOr[identifier]
  }

  @js.native
  @Factory
  trait PutDetectorRequest extends js.Object {
    var detectorId: identifier
    var description: js.UndefOr[description]
  }

  @js.native
  @Factory
  trait PutDetectorResult extends js.Object {}

  @js.native
  @Factory
  trait PutExternalModelRequest extends js.Object {
    var inputConfiguration: ModelInputConfiguration
    var modelEndpoint: String
    var modelEndpointStatus: ModelEndpointStatus
    var modelSource: ModelSource
    var outputConfiguration: ModelOutputConfiguration
    var role: Role
  }

  @js.native
  @Factory
  trait PutExternalModelResult extends js.Object {}

  @js.native
  @Factory
  trait PutModelRequest extends js.Object {
    var labelSchema: LabelSchema
    var modelId: identifier
    var modelType: ModelTypeEnum
    var modelVariables: ModelVariablesList
    var trainingDataSource: TrainingDataSource
    var description: js.UndefOr[description]
  }

  @js.native
  @Factory
  trait PutModelResult extends js.Object {}

  @js.native
  @Factory
  trait PutOutcomeRequest extends js.Object {
    var name: identifier
    var description: js.UndefOr[description]
  }

  @js.native
  @Factory
  trait PutOutcomeResult extends js.Object {}

  /**
    * The role used to invoke external model endpoints.
    */
  @js.native
  @Factory
  trait Role extends js.Object {
    var arn: String
    var name: String
  }

  /**
    * A rule.
    */
  @js.native
  @Factory
  trait Rule extends js.Object {
    var detectorId: identifier
    var ruleId: identifier
    var ruleVersion: nonEmptyString
  }

  /**
    * The details of the rule.
    */
  @js.native
  @Factory
  trait RuleDetail extends js.Object {
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var detectorId: js.UndefOr[identifier]
    var expression: js.UndefOr[ruleExpression]
    var language: js.UndefOr[Language]
    var lastUpdatedTime: js.UndefOr[time]
    var outcomes: js.UndefOr[NonEmptyListOfStrings]
    var ruleId: js.UndefOr[identifier]
    var ruleVersion: js.UndefOr[nonEmptyString]
  }

  /**
    * The training data source.
    */
  @js.native
  @Factory
  trait TrainingDataSource extends js.Object {
    var dataAccessRoleArn: iamRoleArn
    var dataLocation: s3BucketLocation
  }

  @js.native
  @Factory
  trait UpdateDetectorVersionMetadataRequest extends js.Object {
    var description: description
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
  }

  @js.native
  @Factory
  trait UpdateDetectorVersionMetadataResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
    var externalModelEndpoints: ListOfStrings
    var rules: RuleList
    var description: js.UndefOr[description]
    var modelVersions: js.UndefOr[ListOfModelVersions]
  }

  @js.native
  @Factory
  trait UpdateDetectorVersionResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateDetectorVersionStatusRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
    var status: DetectorVersionStatus
  }

  @js.native
  @Factory
  trait UpdateDetectorVersionStatusResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateModelVersionRequest extends js.Object {
    var description: description
    var modelId: identifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: nonEmptyString
    var status: ModelVersionStatus
  }

  @js.native
  @Factory
  trait UpdateModelVersionResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateRuleMetadataRequest extends js.Object {
    var description: description
    var rule: Rule
  }

  @js.native
  @Factory
  trait UpdateRuleMetadataResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateRuleVersionRequest extends js.Object {
    var expression: ruleExpression
    var language: Language
    var outcomes: NonEmptyListOfStrings
    var rule: Rule
    var description: js.UndefOr[description]
  }

  @js.native
  @Factory
  trait UpdateRuleVersionResult extends js.Object {
    var rule: js.UndefOr[Rule]
  }

  @js.native
  @Factory
  trait UpdateVariableRequest extends js.Object {
    var name: String
    var defaultValue: js.UndefOr[String]
    var description: js.UndefOr[String]
    var variableType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateVariableResult extends js.Object {}

  /**
    * The variable.
    */
  @js.native
  @Factory
  trait Variable extends js.Object {
    var createdTime: js.UndefOr[time]
    var dataSource: js.UndefOr[DataSource]
    var dataType: js.UndefOr[DataType]
    var defaultValue: js.UndefOr[String]
    var description: js.UndefOr[String]
    var lastUpdatedTime: js.UndefOr[time]
    var name: js.UndefOr[String]
    var variableType: js.UndefOr[String]
  }

  /**
    * The variable entry in a list.
    */
  @js.native
  @Factory
  trait VariableEntry extends js.Object {
    var dataSource: js.UndefOr[String]
    var dataType: js.UndefOr[String]
    var defaultValue: js.UndefOr[String]
    var description: js.UndefOr[String]
    var name: js.UndefOr[String]
    var variableType: js.UndefOr[String]
  }
}
