package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
  type ListOfRuleResults                = js.Array[RuleResult]
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
    @inline def deleteDetectorFuture(params: DeleteDetectorRequest): Future[DeleteDetectorResult] =
      service.deleteDetector(params).promise().toFuture
    @inline def deleteDetectorVersionFuture(params: DeleteDetectorVersionRequest): Future[DeleteDetectorVersionResult] =
      service.deleteDetectorVersion(params).promise().toFuture
    @inline def deleteEventFuture(params: DeleteEventRequest): Future[DeleteEventResult] =
      service.deleteEvent(params).promise().toFuture
    @inline def deleteRuleVersionFuture(params: DeleteRuleVersionRequest): Future[DeleteRuleVersionResult] =
      service.deleteRuleVersion(params).promise().toFuture
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
    def deleteDetector(params: DeleteDetectorRequest): Request[DeleteDetectorResult]                      = js.native
    def deleteDetectorVersion(params: DeleteDetectorVersionRequest): Request[DeleteDetectorVersionResult] = js.native
    def deleteEvent(params: DeleteEventRequest): Request[DeleteEventResult]                               = js.native
    def deleteRuleVersion(params: DeleteRuleVersionRequest): Request[DeleteRuleVersionResult]             = js.native
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
  trait BatchCreateVariableError extends js.Object {
    var code: js.UndefOr[Int]
    var message: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  object BatchCreateVariableError {
    @inline
    def apply(
        code: js.UndefOr[Int] = js.undefined,
        message: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): BatchCreateVariableError = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateVariableError]
    }
  }

  @js.native
  trait BatchCreateVariableRequest extends js.Object {
    var variableEntries: VariableEntryList
  }

  object BatchCreateVariableRequest {
    @inline
    def apply(
        variableEntries: VariableEntryList
    ): BatchCreateVariableRequest = {
      val __obj = js.Dynamic.literal(
        "variableEntries" -> variableEntries.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchCreateVariableRequest]
    }
  }

  @js.native
  trait BatchCreateVariableResult extends js.Object {
    var errors: js.UndefOr[BatchCreateVariableErrorList]
  }

  object BatchCreateVariableResult {
    @inline
    def apply(
        errors: js.UndefOr[BatchCreateVariableErrorList] = js.undefined
    ): BatchCreateVariableResult = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateVariableResult]
    }
  }

  /**
    * Provides the error of the batch get variable API.
    */
  @js.native
  trait BatchGetVariableError extends js.Object {
    var code: js.UndefOr[Int]
    var message: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  object BatchGetVariableError {
    @inline
    def apply(
        code: js.UndefOr[Int] = js.undefined,
        message: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): BatchGetVariableError = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetVariableError]
    }
  }

  @js.native
  trait BatchGetVariableRequest extends js.Object {
    var names: NameList
  }

  object BatchGetVariableRequest {
    @inline
    def apply(
        names: NameList
    ): BatchGetVariableRequest = {
      val __obj = js.Dynamic.literal(
        "names" -> names.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetVariableRequest]
    }
  }

  @js.native
  trait BatchGetVariableResult extends js.Object {
    var errors: js.UndefOr[BatchGetVariableErrorList]
    var variables: js.UndefOr[VariableList]
  }

  object BatchGetVariableResult {
    @inline
    def apply(
        errors: js.UndefOr[BatchGetVariableErrorList] = js.undefined,
        variables: js.UndefOr[VariableList] = js.undefined
    ): BatchGetVariableResult = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      variables.foreach(__v => __obj.updateDynamic("variables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetVariableResult]
    }
  }

  @js.native
  trait CreateDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var rules: RuleList
    var description: js.UndefOr[description]
    var externalModelEndpoints: js.UndefOr[ListOfStrings]
    var modelVersions: js.UndefOr[ListOfModelVersions]
    var ruleExecutionMode: js.UndefOr[RuleExecutionMode]
  }

  object CreateDetectorVersionRequest {
    @inline
    def apply(
        detectorId: identifier,
        rules: RuleList,
        description: js.UndefOr[description] = js.undefined,
        externalModelEndpoints: js.UndefOr[ListOfStrings] = js.undefined,
        modelVersions: js.UndefOr[ListOfModelVersions] = js.undefined,
        ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.undefined
    ): CreateDetectorVersionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "rules"      -> rules.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      externalModelEndpoints.foreach(__v => __obj.updateDynamic("externalModelEndpoints")(__v.asInstanceOf[js.Any]))
      modelVersions.foreach(__v => __obj.updateDynamic("modelVersions")(__v.asInstanceOf[js.Any]))
      ruleExecutionMode.foreach(__v => __obj.updateDynamic("ruleExecutionMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDetectorVersionRequest]
    }
  }

  @js.native
  trait CreateDetectorVersionResult extends js.Object {
    var detectorId: js.UndefOr[identifier]
    var detectorVersionId: js.UndefOr[nonEmptyString]
    var status: js.UndefOr[DetectorVersionStatus]
  }

  object CreateDetectorVersionResult {
    @inline
    def apply(
        detectorId: js.UndefOr[identifier] = js.undefined,
        detectorVersionId: js.UndefOr[nonEmptyString] = js.undefined,
        status: js.UndefOr[DetectorVersionStatus] = js.undefined
    ): CreateDetectorVersionResult = {
      val __obj = js.Dynamic.literal()
      detectorId.foreach(__v => __obj.updateDynamic("detectorId")(__v.asInstanceOf[js.Any]))
      detectorVersionId.foreach(__v => __obj.updateDynamic("detectorVersionId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDetectorVersionResult]
    }
  }

  @js.native
  trait CreateModelVersionRequest extends js.Object {
    var modelId: identifier
    var modelType: ModelTypeEnum
    var description: js.UndefOr[description]
  }

  object CreateModelVersionRequest {
    @inline
    def apply(
        modelId: identifier,
        modelType: ModelTypeEnum,
        description: js.UndefOr[description] = js.undefined
    ): CreateModelVersionRequest = {
      val __obj = js.Dynamic.literal(
        "modelId"   -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelVersionRequest]
    }
  }

  @js.native
  trait CreateModelVersionResult extends js.Object {
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[nonEmptyString]
    var status: js.UndefOr[String]
  }

  object CreateModelVersionResult {
    @inline
    def apply(
        modelId: js.UndefOr[identifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        modelVersionNumber: js.UndefOr[nonEmptyString] = js.undefined,
        status: js.UndefOr[String] = js.undefined
    ): CreateModelVersionResult = {
      val __obj = js.Dynamic.literal()
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      modelVersionNumber.foreach(__v => __obj.updateDynamic("modelVersionNumber")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelVersionResult]
    }
  }

  @js.native
  trait CreateRuleRequest extends js.Object {
    var detectorId: identifier
    var expression: ruleExpression
    var language: Language
    var outcomes: NonEmptyListOfStrings
    var ruleId: identifier
    var description: js.UndefOr[description]
  }

  object CreateRuleRequest {
    @inline
    def apply(
        detectorId: identifier,
        expression: ruleExpression,
        language: Language,
        outcomes: NonEmptyListOfStrings,
        ruleId: identifier,
        description: js.UndefOr[description] = js.undefined
    ): CreateRuleRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "expression" -> expression.asInstanceOf[js.Any],
        "language"   -> language.asInstanceOf[js.Any],
        "outcomes"   -> outcomes.asInstanceOf[js.Any],
        "ruleId"     -> ruleId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleRequest]
    }
  }

  @js.native
  trait CreateRuleResult extends js.Object {
    var rule: js.UndefOr[Rule]
  }

  object CreateRuleResult {
    @inline
    def apply(
        rule: js.UndefOr[Rule] = js.undefined
    ): CreateRuleResult = {
      val __obj = js.Dynamic.literal()
      rule.foreach(__v => __obj.updateDynamic("rule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleResult]
    }
  }

  @js.native
  trait CreateVariableRequest extends js.Object {
    var dataSource: DataSource
    var dataType: DataType
    var defaultValue: String
    var name: String
    var description: js.UndefOr[String]
    var variableType: js.UndefOr[String]
  }

  object CreateVariableRequest {
    @inline
    def apply(
        dataSource: DataSource,
        dataType: DataType,
        defaultValue: String,
        name: String,
        description: js.UndefOr[String] = js.undefined,
        variableType: js.UndefOr[String] = js.undefined
    ): CreateVariableRequest = {
      val __obj = js.Dynamic.literal(
        "dataSource"   -> dataSource.asInstanceOf[js.Any],
        "dataType"     -> dataType.asInstanceOf[js.Any],
        "defaultValue" -> defaultValue.asInstanceOf[js.Any],
        "name"         -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      variableType.foreach(__v => __obj.updateDynamic("variableType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVariableRequest]
    }
  }

  @js.native
  trait CreateVariableResult extends js.Object {}

  object CreateVariableResult {
    @inline
    def apply(
    ): CreateVariableResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateVariableResult]
    }
  }

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
  trait DeleteDetectorRequest extends js.Object {
    var detectorId: identifier
  }

  object DeleteDetectorRequest {
    @inline
    def apply(
        detectorId: identifier
    ): DeleteDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDetectorRequest]
    }
  }

  @js.native
  trait DeleteDetectorResult extends js.Object {}

  object DeleteDetectorResult {
    @inline
    def apply(
    ): DeleteDetectorResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteDetectorResult]
    }
  }

  @js.native
  trait DeleteDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
  }

  object DeleteDetectorVersionRequest {
    @inline
    def apply(
        detectorId: identifier,
        detectorVersionId: nonEmptyString
    ): DeleteDetectorVersionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId"        -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId" -> detectorVersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDetectorVersionRequest]
    }
  }

  @js.native
  trait DeleteDetectorVersionResult extends js.Object {}

  object DeleteDetectorVersionResult {
    @inline
    def apply(
    ): DeleteDetectorVersionResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteDetectorVersionResult]
    }
  }

  @js.native
  trait DeleteEventRequest extends js.Object {
    var eventId: String
  }

  object DeleteEventRequest {
    @inline
    def apply(
        eventId: String
    ): DeleteEventRequest = {
      val __obj = js.Dynamic.literal(
        "eventId" -> eventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEventRequest]
    }
  }

  @js.native
  trait DeleteEventResult extends js.Object {}

  object DeleteEventResult {
    @inline
    def apply(
    ): DeleteEventResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteEventResult]
    }
  }

  @js.native
  trait DeleteRuleVersionRequest extends js.Object {
    var detectorId: identifier
    var ruleId: identifier
    var ruleVersion: nonEmptyString
  }

  object DeleteRuleVersionRequest {
    @inline
    def apply(
        detectorId: identifier,
        ruleId: identifier,
        ruleVersion: nonEmptyString
    ): DeleteRuleVersionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId"  -> detectorId.asInstanceOf[js.Any],
        "ruleId"      -> ruleId.asInstanceOf[js.Any],
        "ruleVersion" -> ruleVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRuleVersionRequest]
    }
  }

  @js.native
  trait DeleteRuleVersionResult extends js.Object {}

  object DeleteRuleVersionResult {
    @inline
    def apply(
    ): DeleteRuleVersionResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteRuleVersionResult]
    }
  }

  @js.native
  trait DescribeDetectorRequest extends js.Object {
    var detectorId: identifier
    var maxResults: js.UndefOr[DetectorVersionMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object DescribeDetectorRequest {
    @inline
    def apply(
        detectorId: identifier,
        maxResults: js.UndefOr[DetectorVersionMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorRequest]
    }
  }

  @js.native
  trait DescribeDetectorResult extends js.Object {
    var detectorId: js.UndefOr[identifier]
    var detectorVersionSummaries: js.UndefOr[DetectorVersionSummaryList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeDetectorResult {
    @inline
    def apply(
        detectorId: js.UndefOr[identifier] = js.undefined,
        detectorVersionSummaries: js.UndefOr[DetectorVersionSummaryList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeDetectorResult = {
      val __obj = js.Dynamic.literal()
      detectorId.foreach(__v => __obj.updateDynamic("detectorId")(__v.asInstanceOf[js.Any]))
      detectorVersionSummaries.foreach(__v => __obj.updateDynamic("detectorVersionSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorResult]
    }
  }

  @js.native
  trait DescribeModelVersionsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[nonEmptyString]
    var nextToken: js.UndefOr[String]
  }

  object DescribeModelVersionsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        modelId: js.UndefOr[identifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        modelVersionNumber: js.UndefOr[nonEmptyString] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeModelVersionsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      modelVersionNumber.foreach(__v => __obj.updateDynamic("modelVersionNumber")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelVersionsRequest]
    }
  }

  @js.native
  trait DescribeModelVersionsResult extends js.Object {
    var modelVersionDetails: js.UndefOr[ModelVersionDetailList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeModelVersionsResult {
    @inline
    def apply(
        modelVersionDetails: js.UndefOr[ModelVersionDetailList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeModelVersionsResult = {
      val __obj = js.Dynamic.literal()
      modelVersionDetails.foreach(__v => __obj.updateDynamic("modelVersionDetails")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelVersionsResult]
    }
  }

  /**
    * The detector.
    */
  @js.native
  trait Detector extends js.Object {
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var detectorId: js.UndefOr[identifier]
    var lastUpdatedTime: js.UndefOr[time]
  }

  object Detector {
    @inline
    def apply(
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        detectorId: js.UndefOr[identifier] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined
    ): Detector = {
      val __obj = js.Dynamic.literal()
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      detectorId.foreach(__v => __obj.updateDynamic("detectorId")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Detector]
    }
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
  trait DetectorVersionSummary extends js.Object {
    var description: js.UndefOr[description]
    var detectorVersionId: js.UndefOr[nonEmptyString]
    var lastUpdatedTime: js.UndefOr[time]
    var status: js.UndefOr[DetectorVersionStatus]
  }

  object DetectorVersionSummary {
    @inline
    def apply(
        description: js.UndefOr[description] = js.undefined,
        detectorVersionId: js.UndefOr[nonEmptyString] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        status: js.UndefOr[DetectorVersionStatus] = js.undefined
    ): DetectorVersionSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      detectorVersionId.foreach(__v => __obj.updateDynamic("detectorVersionId")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectorVersionSummary]
    }
  }

  /**
    * The Amazon SageMaker model.
    */
  @js.native
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

  object ExternalModel {
    @inline
    def apply(
        createdTime: js.UndefOr[time] = js.undefined,
        inputConfiguration: js.UndefOr[ModelInputConfiguration] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        modelEndpoint: js.UndefOr[String] = js.undefined,
        modelEndpointStatus: js.UndefOr[ModelEndpointStatus] = js.undefined,
        modelSource: js.UndefOr[ModelSource] = js.undefined,
        outputConfiguration: js.UndefOr[ModelOutputConfiguration] = js.undefined,
        role: js.UndefOr[Role] = js.undefined
    ): ExternalModel = {
      val __obj = js.Dynamic.literal()
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      inputConfiguration.foreach(__v => __obj.updateDynamic("inputConfiguration")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      modelEndpoint.foreach(__v => __obj.updateDynamic("modelEndpoint")(__v.asInstanceOf[js.Any]))
      modelEndpointStatus.foreach(__v => __obj.updateDynamic("modelEndpointStatus")(__v.asInstanceOf[js.Any]))
      modelSource.foreach(__v => __obj.updateDynamic("modelSource")(__v.asInstanceOf[js.Any]))
      outputConfiguration.foreach(__v => __obj.updateDynamic("outputConfiguration")(__v.asInstanceOf[js.Any]))
      role.foreach(__v => __obj.updateDynamic("role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExternalModel]
    }
  }

  @js.native
  trait GetDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
  }

  object GetDetectorVersionRequest {
    @inline
    def apply(
        detectorId: identifier,
        detectorVersionId: nonEmptyString
    ): GetDetectorVersionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId"        -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId" -> detectorVersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDetectorVersionRequest]
    }
  }

  @js.native
  trait GetDetectorVersionResult extends js.Object {
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var detectorId: js.UndefOr[identifier]
    var detectorVersionId: js.UndefOr[nonEmptyString]
    var externalModelEndpoints: js.UndefOr[ListOfStrings]
    var lastUpdatedTime: js.UndefOr[time]
    var modelVersions: js.UndefOr[ListOfModelVersions]
    var ruleExecutionMode: js.UndefOr[RuleExecutionMode]
    var rules: js.UndefOr[RuleList]
    var status: js.UndefOr[DetectorVersionStatus]
  }

  object GetDetectorVersionResult {
    @inline
    def apply(
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        detectorId: js.UndefOr[identifier] = js.undefined,
        detectorVersionId: js.UndefOr[nonEmptyString] = js.undefined,
        externalModelEndpoints: js.UndefOr[ListOfStrings] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        modelVersions: js.UndefOr[ListOfModelVersions] = js.undefined,
        ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.undefined,
        rules: js.UndefOr[RuleList] = js.undefined,
        status: js.UndefOr[DetectorVersionStatus] = js.undefined
    ): GetDetectorVersionResult = {
      val __obj = js.Dynamic.literal()
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      detectorId.foreach(__v => __obj.updateDynamic("detectorId")(__v.asInstanceOf[js.Any]))
      detectorVersionId.foreach(__v => __obj.updateDynamic("detectorVersionId")(__v.asInstanceOf[js.Any]))
      externalModelEndpoints.foreach(__v => __obj.updateDynamic("externalModelEndpoints")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      modelVersions.foreach(__v => __obj.updateDynamic("modelVersions")(__v.asInstanceOf[js.Any]))
      ruleExecutionMode.foreach(__v => __obj.updateDynamic("ruleExecutionMode")(__v.asInstanceOf[js.Any]))
      rules.foreach(__v => __obj.updateDynamic("rules")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDetectorVersionResult]
    }
  }

  @js.native
  trait GetDetectorsRequest extends js.Object {
    var detectorId: js.UndefOr[identifier]
    var maxResults: js.UndefOr[DetectorsMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object GetDetectorsRequest {
    @inline
    def apply(
        detectorId: js.UndefOr[identifier] = js.undefined,
        maxResults: js.UndefOr[DetectorsMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetDetectorsRequest = {
      val __obj = js.Dynamic.literal()
      detectorId.foreach(__v => __obj.updateDynamic("detectorId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDetectorsRequest]
    }
  }

  @js.native
  trait GetDetectorsResult extends js.Object {
    var detectors: js.UndefOr[DetectorList]
    var nextToken: js.UndefOr[String]
  }

  object GetDetectorsResult {
    @inline
    def apply(
        detectors: js.UndefOr[DetectorList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetDetectorsResult = {
      val __obj = js.Dynamic.literal()
      detectors.foreach(__v => __obj.updateDynamic("detectors")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDetectorsResult]
    }
  }

  @js.native
  trait GetExternalModelsRequest extends js.Object {
    var maxResults: js.UndefOr[ExternalModelsMaxResults]
    var modelEndpoint: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
  }

  object GetExternalModelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ExternalModelsMaxResults] = js.undefined,
        modelEndpoint: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetExternalModelsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      modelEndpoint.foreach(__v => __obj.updateDynamic("modelEndpoint")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExternalModelsRequest]
    }
  }

  @js.native
  trait GetExternalModelsResult extends js.Object {
    var externalModels: js.UndefOr[ExternalModelList]
    var nextToken: js.UndefOr[String]
  }

  object GetExternalModelsResult {
    @inline
    def apply(
        externalModels: js.UndefOr[ExternalModelList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetExternalModelsResult = {
      val __obj = js.Dynamic.literal()
      externalModels.foreach(__v => __obj.updateDynamic("externalModels")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExternalModelsResult]
    }
  }

  @js.native
  trait GetModelVersionRequest extends js.Object {
    var modelId: identifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: nonEmptyString
  }

  object GetModelVersionRequest {
    @inline
    def apply(
        modelId: identifier,
        modelType: ModelTypeEnum,
        modelVersionNumber: nonEmptyString
    ): GetModelVersionRequest = {
      val __obj = js.Dynamic.literal(
        "modelId"            -> modelId.asInstanceOf[js.Any],
        "modelType"          -> modelType.asInstanceOf[js.Any],
        "modelVersionNumber" -> modelVersionNumber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetModelVersionRequest]
    }
  }

  @js.native
  trait GetModelVersionResult extends js.Object {
    var description: js.UndefOr[description]
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[nonEmptyString]
    var status: js.UndefOr[String]
  }

  object GetModelVersionResult {
    @inline
    def apply(
        description: js.UndefOr[description] = js.undefined,
        modelId: js.UndefOr[identifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        modelVersionNumber: js.UndefOr[nonEmptyString] = js.undefined,
        status: js.UndefOr[String] = js.undefined
    ): GetModelVersionResult = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      modelVersionNumber.foreach(__v => __obj.updateDynamic("modelVersionNumber")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelVersionResult]
    }
  }

  @js.native
  trait GetModelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var modelId: js.UndefOr[identifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var nextToken: js.UndefOr[String]
  }

  object GetModelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        modelId: js.UndefOr[identifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetModelsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelsRequest]
    }
  }

  @js.native
  trait GetModelsResult extends js.Object {
    var models: js.UndefOr[ModelList]
    var nextToken: js.UndefOr[String]
  }

  object GetModelsResult {
    @inline
    def apply(
        models: js.UndefOr[ModelList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetModelsResult = {
      val __obj = js.Dynamic.literal()
      models.foreach(__v => __obj.updateDynamic("models")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelsResult]
    }
  }

  @js.native
  trait GetOutcomesRequest extends js.Object {
    var maxResults: js.UndefOr[OutcomesMaxResults]
    var name: js.UndefOr[identifier]
    var nextToken: js.UndefOr[String]
  }

  object GetOutcomesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[OutcomesMaxResults] = js.undefined,
        name: js.UndefOr[identifier] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetOutcomesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOutcomesRequest]
    }
  }

  @js.native
  trait GetOutcomesResult extends js.Object {
    var nextToken: js.UndefOr[String]
    var outcomes: js.UndefOr[OutcomeList]
  }

  object GetOutcomesResult {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        outcomes: js.UndefOr[OutcomeList] = js.undefined
    ): GetOutcomesResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      outcomes.foreach(__v => __obj.updateDynamic("outcomes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOutcomesResult]
    }
  }

  @js.native
  trait GetPredictionRequest extends js.Object {
    var detectorId: String
    var eventId: String
    var detectorVersionId: js.UndefOr[String]
    var eventAttributes: js.UndefOr[EventAttributeMap]
    var externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap]
  }

  object GetPredictionRequest {
    @inline
    def apply(
        detectorId: String,
        eventId: String,
        detectorVersionId: js.UndefOr[String] = js.undefined,
        eventAttributes: js.UndefOr[EventAttributeMap] = js.undefined,
        externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap] = js.undefined
    ): GetPredictionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "eventId"    -> eventId.asInstanceOf[js.Any]
      )

      detectorVersionId.foreach(__v => __obj.updateDynamic("detectorVersionId")(__v.asInstanceOf[js.Any]))
      eventAttributes.foreach(__v => __obj.updateDynamic("eventAttributes")(__v.asInstanceOf[js.Any]))
      externalModelEndpointDataBlobs.foreach(__v =>
        __obj.updateDynamic("externalModelEndpointDataBlobs")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetPredictionRequest]
    }
  }

  @js.native
  trait GetPredictionResult extends js.Object {
    var modelScores: js.UndefOr[ListOfModelScores]
    var outcomes: js.UndefOr[ListOfStrings]
    var ruleResults: js.UndefOr[ListOfRuleResults]
  }

  object GetPredictionResult {
    @inline
    def apply(
        modelScores: js.UndefOr[ListOfModelScores] = js.undefined,
        outcomes: js.UndefOr[ListOfStrings] = js.undefined,
        ruleResults: js.UndefOr[ListOfRuleResults] = js.undefined
    ): GetPredictionResult = {
      val __obj = js.Dynamic.literal()
      modelScores.foreach(__v => __obj.updateDynamic("modelScores")(__v.asInstanceOf[js.Any]))
      outcomes.foreach(__v => __obj.updateDynamic("outcomes")(__v.asInstanceOf[js.Any]))
      ruleResults.foreach(__v => __obj.updateDynamic("ruleResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPredictionResult]
    }
  }

  @js.native
  trait GetRulesRequest extends js.Object {
    var detectorId: identifier
    var maxResults: js.UndefOr[RulesMaxResults]
    var nextToken: js.UndefOr[String]
    var ruleId: js.UndefOr[identifier]
    var ruleVersion: js.UndefOr[nonEmptyString]
  }

  object GetRulesRequest {
    @inline
    def apply(
        detectorId: identifier,
        maxResults: js.UndefOr[RulesMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        ruleId: js.UndefOr[identifier] = js.undefined,
        ruleVersion: js.UndefOr[nonEmptyString] = js.undefined
    ): GetRulesRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      ruleId.foreach(__v => __obj.updateDynamic("ruleId")(__v.asInstanceOf[js.Any]))
      ruleVersion.foreach(__v => __obj.updateDynamic("ruleVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRulesRequest]
    }
  }

  @js.native
  trait GetRulesResult extends js.Object {
    var nextToken: js.UndefOr[String]
    var ruleDetails: js.UndefOr[RuleDetailList]
  }

  object GetRulesResult {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        ruleDetails: js.UndefOr[RuleDetailList] = js.undefined
    ): GetRulesResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      ruleDetails.foreach(__v => __obj.updateDynamic("ruleDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRulesResult]
    }
  }

  @js.native
  trait GetVariablesRequest extends js.Object {
    var maxResults: js.UndefOr[VariablesMaxResults]
    var name: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
  }

  object GetVariablesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[VariablesMaxResults] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetVariablesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVariablesRequest]
    }
  }

  @js.native
  trait GetVariablesResult extends js.Object {
    var nextToken: js.UndefOr[String]
    var variables: js.UndefOr[VariableList]
  }

  object GetVariablesResult {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        variables: js.UndefOr[VariableList] = js.undefined
    ): GetVariablesResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      variables.foreach(__v => __obj.updateDynamic("variables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVariablesResult]
    }
  }

  /**
    * The label schema.
    */
  @js.native
  trait LabelSchema extends js.Object {
    var labelKey: String
    var labelMapper: LabelMapper
  }

  object LabelSchema {
    @inline
    def apply(
        labelKey: String,
        labelMapper: LabelMapper
    ): LabelSchema = {
      val __obj = js.Dynamic.literal(
        "labelKey"    -> labelKey.asInstanceOf[js.Any],
        "labelMapper" -> labelMapper.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LabelSchema]
    }
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

  object Model {
    @inline
    def apply(
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        labelSchema: js.UndefOr[LabelSchema] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        modelId: js.UndefOr[identifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        modelVariables: js.UndefOr[ModelVariablesList] = js.undefined,
        trainingDataSource: js.UndefOr[TrainingDataSource] = js.undefined
    ): Model = {
      val __obj = js.Dynamic.literal()
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      labelSchema.foreach(__v => __obj.updateDynamic("labelSchema")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      modelVariables.foreach(__v => __obj.updateDynamic("modelVariables")(__v.asInstanceOf[js.Any]))
      trainingDataSource.foreach(__v => __obj.updateDynamic("trainingDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Model]
    }
  }

  /**
    * A pre-formed Amazon SageMaker model input you can include if your detector version includes an imported Amazon SageMaker model endpoint with pass-through input configuration.
    */
  @js.native
  trait ModelEndpointDataBlob extends js.Object {
    var byteBuffer: js.UndefOr[blob]
    var contentType: js.UndefOr[contentType]
  }

  object ModelEndpointDataBlob {
    @inline
    def apply(
        byteBuffer: js.UndefOr[blob] = js.undefined,
        contentType: js.UndefOr[contentType] = js.undefined
    ): ModelEndpointDataBlob = {
      val __obj = js.Dynamic.literal()
      byteBuffer.foreach(__v => __obj.updateDynamic("byteBuffer")(__v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelEndpointDataBlob]
    }
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
  trait ModelInputConfiguration extends js.Object {
    var isOpaque: IsOpaque
    var csvInputTemplate: js.UndefOr[String]
    var format: js.UndefOr[ModelInputDataFormat]
    var jsonInputTemplate: js.UndefOr[String]
  }

  object ModelInputConfiguration {
    @inline
    def apply(
        isOpaque: IsOpaque,
        csvInputTemplate: js.UndefOr[String] = js.undefined,
        format: js.UndefOr[ModelInputDataFormat] = js.undefined,
        jsonInputTemplate: js.UndefOr[String] = js.undefined
    ): ModelInputConfiguration = {
      val __obj = js.Dynamic.literal(
        "isOpaque" -> isOpaque.asInstanceOf[js.Any]
      )

      csvInputTemplate.foreach(__v => __obj.updateDynamic("csvInputTemplate")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      jsonInputTemplate.foreach(__v => __obj.updateDynamic("jsonInputTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelInputConfiguration]
    }
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
  trait ModelOutputConfiguration extends js.Object {
    var format: ModelOutputDataFormat
    var csvIndexToVariableMap: js.UndefOr[CsvIndexToVariableMap]
    var jsonKeyToVariableMap: js.UndefOr[JsonKeyToVariableMap]
  }

  object ModelOutputConfiguration {
    @inline
    def apply(
        format: ModelOutputDataFormat,
        csvIndexToVariableMap: js.UndefOr[CsvIndexToVariableMap] = js.undefined,
        jsonKeyToVariableMap: js.UndefOr[JsonKeyToVariableMap] = js.undefined
    ): ModelOutputConfiguration = {
      val __obj = js.Dynamic.literal(
        "format" -> format.asInstanceOf[js.Any]
      )

      csvIndexToVariableMap.foreach(__v => __obj.updateDynamic("csvIndexToVariableMap")(__v.asInstanceOf[js.Any]))
      jsonKeyToVariableMap.foreach(__v => __obj.updateDynamic("jsonKeyToVariableMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelOutputConfiguration]
    }
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
  trait ModelScores extends js.Object {
    var modelVersion: js.UndefOr[ModelVersion]
    var scores: js.UndefOr[ModelPredictionMap]
  }

  object ModelScores {
    @inline
    def apply(
        modelVersion: js.UndefOr[ModelVersion] = js.undefined,
        scores: js.UndefOr[ModelPredictionMap] = js.undefined
    ): ModelScores = {
      val __obj = js.Dynamic.literal()
      modelVersion.foreach(__v => __obj.updateDynamic("modelVersion")(__v.asInstanceOf[js.Any]))
      scores.foreach(__v => __obj.updateDynamic("scores")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelScores]
    }
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
  trait ModelVariable extends js.Object {
    var name: String
    var index: js.UndefOr[ModelVariableIndex]
  }

  object ModelVariable {
    @inline
    def apply(
        name: String,
        index: js.UndefOr[ModelVariableIndex] = js.undefined
    ): ModelVariable = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      index.foreach(__v => __obj.updateDynamic("index")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelVariable]
    }
  }

  /**
    * The model version.
    */
  @js.native
  trait ModelVersion extends js.Object {
    var modelId: identifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: nonEmptyString
  }

  object ModelVersion {
    @inline
    def apply(
        modelId: identifier,
        modelType: ModelTypeEnum,
        modelVersionNumber: nonEmptyString
    ): ModelVersion = {
      val __obj = js.Dynamic.literal(
        "modelId"            -> modelId.asInstanceOf[js.Any],
        "modelType"          -> modelType.asInstanceOf[js.Any],
        "modelVersionNumber" -> modelVersionNumber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModelVersion]
    }
  }

  /**
    * Provides the model version details.
    */
  @js.native
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

  object ModelVersionDetail {
    @inline
    def apply(
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        labelSchema: js.UndefOr[LabelSchema] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        modelId: js.UndefOr[identifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        modelVariables: js.UndefOr[ModelVariablesList] = js.undefined,
        modelVersionNumber: js.UndefOr[nonEmptyString] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        trainingDataSource: js.UndefOr[TrainingDataSource] = js.undefined,
        trainingMetrics: js.UndefOr[MetricsMap] = js.undefined,
        validationMetrics: js.UndefOr[MetricsMap] = js.undefined
    ): ModelVersionDetail = {
      val __obj = js.Dynamic.literal()
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      labelSchema.foreach(__v => __obj.updateDynamic("labelSchema")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      modelVariables.foreach(__v => __obj.updateDynamic("modelVariables")(__v.asInstanceOf[js.Any]))
      modelVersionNumber.foreach(__v => __obj.updateDynamic("modelVersionNumber")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      trainingDataSource.foreach(__v => __obj.updateDynamic("trainingDataSource")(__v.asInstanceOf[js.Any]))
      trainingMetrics.foreach(__v => __obj.updateDynamic("trainingMetrics")(__v.asInstanceOf[js.Any]))
      validationMetrics.foreach(__v => __obj.updateDynamic("validationMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelVersionDetail]
    }
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
  trait Outcome extends js.Object {
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var lastUpdatedTime: js.UndefOr[time]
    var name: js.UndefOr[identifier]
  }

  object Outcome {
    @inline
    def apply(
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        name: js.UndefOr[identifier] = js.undefined
    ): Outcome = {
      val __obj = js.Dynamic.literal()
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Outcome]
    }
  }

  @js.native
  trait PutDetectorRequest extends js.Object {
    var detectorId: identifier
    var description: js.UndefOr[description]
  }

  object PutDetectorRequest {
    @inline
    def apply(
        detectorId: identifier,
        description: js.UndefOr[description] = js.undefined
    ): PutDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDetectorRequest]
    }
  }

  @js.native
  trait PutDetectorResult extends js.Object {}

  object PutDetectorResult {
    @inline
    def apply(
    ): PutDetectorResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutDetectorResult]
    }
  }

  @js.native
  trait PutExternalModelRequest extends js.Object {
    var inputConfiguration: ModelInputConfiguration
    var modelEndpoint: String
    var modelEndpointStatus: ModelEndpointStatus
    var modelSource: ModelSource
    var outputConfiguration: ModelOutputConfiguration
    var role: Role
  }

  object PutExternalModelRequest {
    @inline
    def apply(
        inputConfiguration: ModelInputConfiguration,
        modelEndpoint: String,
        modelEndpointStatus: ModelEndpointStatus,
        modelSource: ModelSource,
        outputConfiguration: ModelOutputConfiguration,
        role: Role
    ): PutExternalModelRequest = {
      val __obj = js.Dynamic.literal(
        "inputConfiguration"  -> inputConfiguration.asInstanceOf[js.Any],
        "modelEndpoint"       -> modelEndpoint.asInstanceOf[js.Any],
        "modelEndpointStatus" -> modelEndpointStatus.asInstanceOf[js.Any],
        "modelSource"         -> modelSource.asInstanceOf[js.Any],
        "outputConfiguration" -> outputConfiguration.asInstanceOf[js.Any],
        "role"                -> role.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutExternalModelRequest]
    }
  }

  @js.native
  trait PutExternalModelResult extends js.Object {}

  object PutExternalModelResult {
    @inline
    def apply(
    ): PutExternalModelResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutExternalModelResult]
    }
  }

  @js.native
  trait PutModelRequest extends js.Object {
    var labelSchema: LabelSchema
    var modelId: identifier
    var modelType: ModelTypeEnum
    var modelVariables: ModelVariablesList
    var trainingDataSource: TrainingDataSource
    var description: js.UndefOr[description]
  }

  object PutModelRequest {
    @inline
    def apply(
        labelSchema: LabelSchema,
        modelId: identifier,
        modelType: ModelTypeEnum,
        modelVariables: ModelVariablesList,
        trainingDataSource: TrainingDataSource,
        description: js.UndefOr[description] = js.undefined
    ): PutModelRequest = {
      val __obj = js.Dynamic.literal(
        "labelSchema"        -> labelSchema.asInstanceOf[js.Any],
        "modelId"            -> modelId.asInstanceOf[js.Any],
        "modelType"          -> modelType.asInstanceOf[js.Any],
        "modelVariables"     -> modelVariables.asInstanceOf[js.Any],
        "trainingDataSource" -> trainingDataSource.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutModelRequest]
    }
  }

  @js.native
  trait PutModelResult extends js.Object {}

  object PutModelResult {
    @inline
    def apply(
    ): PutModelResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutModelResult]
    }
  }

  @js.native
  trait PutOutcomeRequest extends js.Object {
    var name: identifier
    var description: js.UndefOr[description]
  }

  object PutOutcomeRequest {
    @inline
    def apply(
        name: identifier,
        description: js.UndefOr[description] = js.undefined
    ): PutOutcomeRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutOutcomeRequest]
    }
  }

  @js.native
  trait PutOutcomeResult extends js.Object {}

  object PutOutcomeResult {
    @inline
    def apply(
    ): PutOutcomeResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutOutcomeResult]
    }
  }

  /**
    * The role used to invoke external model endpoints.
    */
  @js.native
  trait Role extends js.Object {
    var arn: String
    var name: String
  }

  object Role {
    @inline
    def apply(
        arn: String,
        name: String
    ): Role = {
      val __obj = js.Dynamic.literal(
        "arn"  -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Role]
    }
  }

  /**
    * A rule.
    */
  @js.native
  trait Rule extends js.Object {
    var detectorId: identifier
    var ruleId: identifier
    var ruleVersion: nonEmptyString
  }

  object Rule {
    @inline
    def apply(
        detectorId: identifier,
        ruleId: identifier,
        ruleVersion: nonEmptyString
    ): Rule = {
      val __obj = js.Dynamic.literal(
        "detectorId"  -> detectorId.asInstanceOf[js.Any],
        "ruleId"      -> ruleId.asInstanceOf[js.Any],
        "ruleVersion" -> ruleVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Rule]
    }
  }

  /**
    * The details of the rule.
    */
  @js.native
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

  object RuleDetail {
    @inline
    def apply(
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        detectorId: js.UndefOr[identifier] = js.undefined,
        expression: js.UndefOr[ruleExpression] = js.undefined,
        language: js.UndefOr[Language] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        outcomes: js.UndefOr[NonEmptyListOfStrings] = js.undefined,
        ruleId: js.UndefOr[identifier] = js.undefined,
        ruleVersion: js.UndefOr[nonEmptyString] = js.undefined
    ): RuleDetail = {
      val __obj = js.Dynamic.literal()
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      detectorId.foreach(__v => __obj.updateDynamic("detectorId")(__v.asInstanceOf[js.Any]))
      expression.foreach(__v => __obj.updateDynamic("expression")(__v.asInstanceOf[js.Any]))
      language.foreach(__v => __obj.updateDynamic("language")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      outcomes.foreach(__v => __obj.updateDynamic("outcomes")(__v.asInstanceOf[js.Any]))
      ruleId.foreach(__v => __obj.updateDynamic("ruleId")(__v.asInstanceOf[js.Any]))
      ruleVersion.foreach(__v => __obj.updateDynamic("ruleVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleDetail]
    }
  }

  @js.native
  sealed trait RuleExecutionMode extends js.Any
  object RuleExecutionMode extends js.Object {
    val ALL_MATCHED   = "ALL_MATCHED".asInstanceOf[RuleExecutionMode]
    val FIRST_MATCHED = "FIRST_MATCHED".asInstanceOf[RuleExecutionMode]

    val values = js.Object.freeze(js.Array(ALL_MATCHED, FIRST_MATCHED))
  }

  /**
    * The rule results.
    */
  @js.native
  trait RuleResult extends js.Object {
    var outcomes: js.UndefOr[ListOfStrings]
    var ruleId: js.UndefOr[String]
  }

  object RuleResult {
    @inline
    def apply(
        outcomes: js.UndefOr[ListOfStrings] = js.undefined,
        ruleId: js.UndefOr[String] = js.undefined
    ): RuleResult = {
      val __obj = js.Dynamic.literal()
      outcomes.foreach(__v => __obj.updateDynamic("outcomes")(__v.asInstanceOf[js.Any]))
      ruleId.foreach(__v => __obj.updateDynamic("ruleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleResult]
    }
  }

  /**
    * The training data source.
    */
  @js.native
  trait TrainingDataSource extends js.Object {
    var dataAccessRoleArn: iamRoleArn
    var dataLocation: s3BucketLocation
  }

  object TrainingDataSource {
    @inline
    def apply(
        dataAccessRoleArn: iamRoleArn,
        dataLocation: s3BucketLocation
    ): TrainingDataSource = {
      val __obj = js.Dynamic.literal(
        "dataAccessRoleArn" -> dataAccessRoleArn.asInstanceOf[js.Any],
        "dataLocation"      -> dataLocation.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TrainingDataSource]
    }
  }

  @js.native
  trait UpdateDetectorVersionMetadataRequest extends js.Object {
    var description: description
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
  }

  object UpdateDetectorVersionMetadataRequest {
    @inline
    def apply(
        description: description,
        detectorId: identifier,
        detectorVersionId: nonEmptyString
    ): UpdateDetectorVersionMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "description"       -> description.asInstanceOf[js.Any],
        "detectorId"        -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId" -> detectorVersionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateDetectorVersionMetadataRequest]
    }
  }

  @js.native
  trait UpdateDetectorVersionMetadataResult extends js.Object {}

  object UpdateDetectorVersionMetadataResult {
    @inline
    def apply(
    ): UpdateDetectorVersionMetadataResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateDetectorVersionMetadataResult]
    }
  }

  @js.native
  trait UpdateDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
    var externalModelEndpoints: ListOfStrings
    var rules: RuleList
    var description: js.UndefOr[description]
    var modelVersions: js.UndefOr[ListOfModelVersions]
    var ruleExecutionMode: js.UndefOr[RuleExecutionMode]
  }

  object UpdateDetectorVersionRequest {
    @inline
    def apply(
        detectorId: identifier,
        detectorVersionId: nonEmptyString,
        externalModelEndpoints: ListOfStrings,
        rules: RuleList,
        description: js.UndefOr[description] = js.undefined,
        modelVersions: js.UndefOr[ListOfModelVersions] = js.undefined,
        ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.undefined
    ): UpdateDetectorVersionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId"             -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId"      -> detectorVersionId.asInstanceOf[js.Any],
        "externalModelEndpoints" -> externalModelEndpoints.asInstanceOf[js.Any],
        "rules"                  -> rules.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      modelVersions.foreach(__v => __obj.updateDynamic("modelVersions")(__v.asInstanceOf[js.Any]))
      ruleExecutionMode.foreach(__v => __obj.updateDynamic("ruleExecutionMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDetectorVersionRequest]
    }
  }

  @js.native
  trait UpdateDetectorVersionResult extends js.Object {}

  object UpdateDetectorVersionResult {
    @inline
    def apply(
    ): UpdateDetectorVersionResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateDetectorVersionResult]
    }
  }

  @js.native
  trait UpdateDetectorVersionStatusRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: nonEmptyString
    var status: DetectorVersionStatus
  }

  object UpdateDetectorVersionStatusRequest {
    @inline
    def apply(
        detectorId: identifier,
        detectorVersionId: nonEmptyString,
        status: DetectorVersionStatus
    ): UpdateDetectorVersionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId"        -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId" -> detectorVersionId.asInstanceOf[js.Any],
        "status"            -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateDetectorVersionStatusRequest]
    }
  }

  @js.native
  trait UpdateDetectorVersionStatusResult extends js.Object {}

  object UpdateDetectorVersionStatusResult {
    @inline
    def apply(
    ): UpdateDetectorVersionStatusResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateDetectorVersionStatusResult]
    }
  }

  @js.native
  trait UpdateModelVersionRequest extends js.Object {
    var description: description
    var modelId: identifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: nonEmptyString
    var status: ModelVersionStatus
  }

  object UpdateModelVersionRequest {
    @inline
    def apply(
        description: description,
        modelId: identifier,
        modelType: ModelTypeEnum,
        modelVersionNumber: nonEmptyString,
        status: ModelVersionStatus
    ): UpdateModelVersionRequest = {
      val __obj = js.Dynamic.literal(
        "description"        -> description.asInstanceOf[js.Any],
        "modelId"            -> modelId.asInstanceOf[js.Any],
        "modelType"          -> modelType.asInstanceOf[js.Any],
        "modelVersionNumber" -> modelVersionNumber.asInstanceOf[js.Any],
        "status"             -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateModelVersionRequest]
    }
  }

  @js.native
  trait UpdateModelVersionResult extends js.Object {}

  object UpdateModelVersionResult {
    @inline
    def apply(
    ): UpdateModelVersionResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateModelVersionResult]
    }
  }

  @js.native
  trait UpdateRuleMetadataRequest extends js.Object {
    var description: description
    var rule: Rule
  }

  object UpdateRuleMetadataRequest {
    @inline
    def apply(
        description: description,
        rule: Rule
    ): UpdateRuleMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "description" -> description.asInstanceOf[js.Any],
        "rule"        -> rule.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateRuleMetadataRequest]
    }
  }

  @js.native
  trait UpdateRuleMetadataResult extends js.Object {}

  object UpdateRuleMetadataResult {
    @inline
    def apply(
    ): UpdateRuleMetadataResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateRuleMetadataResult]
    }
  }

  @js.native
  trait UpdateRuleVersionRequest extends js.Object {
    var expression: ruleExpression
    var language: Language
    var outcomes: NonEmptyListOfStrings
    var rule: Rule
    var description: js.UndefOr[description]
  }

  object UpdateRuleVersionRequest {
    @inline
    def apply(
        expression: ruleExpression,
        language: Language,
        outcomes: NonEmptyListOfStrings,
        rule: Rule,
        description: js.UndefOr[description] = js.undefined
    ): UpdateRuleVersionRequest = {
      val __obj = js.Dynamic.literal(
        "expression" -> expression.asInstanceOf[js.Any],
        "language"   -> language.asInstanceOf[js.Any],
        "outcomes"   -> outcomes.asInstanceOf[js.Any],
        "rule"       -> rule.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuleVersionRequest]
    }
  }

  @js.native
  trait UpdateRuleVersionResult extends js.Object {
    var rule: js.UndefOr[Rule]
  }

  object UpdateRuleVersionResult {
    @inline
    def apply(
        rule: js.UndefOr[Rule] = js.undefined
    ): UpdateRuleVersionResult = {
      val __obj = js.Dynamic.literal()
      rule.foreach(__v => __obj.updateDynamic("rule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuleVersionResult]
    }
  }

  @js.native
  trait UpdateVariableRequest extends js.Object {
    var name: String
    var defaultValue: js.UndefOr[String]
    var description: js.UndefOr[String]
    var variableType: js.UndefOr[String]
  }

  object UpdateVariableRequest {
    @inline
    def apply(
        name: String,
        defaultValue: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        variableType: js.UndefOr[String] = js.undefined
    ): UpdateVariableRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      variableType.foreach(__v => __obj.updateDynamic("variableType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVariableRequest]
    }
  }

  @js.native
  trait UpdateVariableResult extends js.Object {}

  object UpdateVariableResult {
    @inline
    def apply(
    ): UpdateVariableResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateVariableResult]
    }
  }

  /**
    * The variable.
    */
  @js.native
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

  object Variable {
    @inline
    def apply(
        createdTime: js.UndefOr[time] = js.undefined,
        dataSource: js.UndefOr[DataSource] = js.undefined,
        dataType: js.UndefOr[DataType] = js.undefined,
        defaultValue: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        variableType: js.UndefOr[String] = js.undefined
    ): Variable = {
      val __obj = js.Dynamic.literal()
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      dataType.foreach(__v => __obj.updateDynamic("dataType")(__v.asInstanceOf[js.Any]))
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      variableType.foreach(__v => __obj.updateDynamic("variableType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Variable]
    }
  }

  /**
    * The variable entry in a list.
    */
  @js.native
  trait VariableEntry extends js.Object {
    var dataSource: js.UndefOr[String]
    var dataType: js.UndefOr[String]
    var defaultValue: js.UndefOr[String]
    var description: js.UndefOr[String]
    var name: js.UndefOr[String]
    var variableType: js.UndefOr[String]
  }

  object VariableEntry {
    @inline
    def apply(
        dataSource: js.UndefOr[String] = js.undefined,
        dataType: js.UndefOr[String] = js.undefined,
        defaultValue: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        variableType: js.UndefOr[String] = js.undefined
    ): VariableEntry = {
      val __obj = js.Dynamic.literal()
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      dataType.foreach(__v => __obj.updateDynamic("dataType")(__v.asInstanceOf[js.Any]))
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      variableType.foreach(__v => __obj.updateDynamic("variableType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VariableEntry]
    }
  }
}
