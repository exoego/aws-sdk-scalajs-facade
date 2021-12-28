package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object frauddetector {
  type BatchCreateVariableErrorList = js.Array[BatchCreateVariableError]
  type BatchGetVariableErrorList = js.Array[BatchGetVariableError]
  type BatchPredictionList = js.Array[BatchPrediction]
  type CsvIndexToVariableMap = js.Dictionary[String]
  type DetectorList = js.Array[Detector]
  type DetectorVersionMaxResults = Int
  type DetectorVersionSummaryList = js.Array[DetectorVersionSummary]
  type DetectorsMaxResults = Int
  type EventVariableMap = js.Dictionary[variableValue]
  type ExternalModelEndpointDataBlobMap = js.Dictionary[ModelEndpointDataBlob]
  type ExternalModelList = js.Array[ExternalModel]
  type ExternalModelsMaxResults = Int
  type JsonKeyToVariableMap = js.Dictionary[String]
  type KmsEncryptionKeyArn = String
  type ListOfModelScores = js.Array[ModelScores]
  type ListOfModelVersions = js.Array[ModelVersion]
  type ListOfRuleResults = js.Array[RuleResult]
  type ListOfStrings = js.Array[String]
  type ModelPredictionMap = js.Dictionary[Float]
  type NameList = js.Array[String]
  type NonEmptyListOfStrings = js.Array[String]
  type OutcomeList = js.Array[Outcome]
  type OutcomesMaxResults = Int
  type RuleDetailList = js.Array[RuleDetail]
  type RuleList = js.Array[Rule]
  type RulesMaxResults = Int
  type TagsMaxResults = Int
  type UseEventVariables = Boolean
  type VariableEntryList = js.Array[VariableEntry]
  type VariableList = js.Array[Variable]
  type VariablesMaxResults = Int
  type batchPredictionsMaxPageSize = Int
  type blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type contentType = String
  type description = String
  type entityTypeList = js.Array[EntityType]
  type entityTypesMaxResults = Int
  type eventTypeList = js.Array[EventType]
  type eventTypesMaxResults = Int
  type fieldValidationMessageList = js.Array[FieldValidationMessage]
  type fileValidationMessageList = js.Array[FileValidationMessage]
  type floatVersionString = String
  type fraudDetectorArn = String
  type iamRoleArn = String
  type identifier = String
  type labelList = js.Array[Label]
  type labelMapper = js.Dictionary[ListOfStrings]
  type labelsMaxResults = Int
  type listOfEntities = js.Array[Entity]
  type metricDataPointsList = js.Array[MetricDataPoint]
  type modelIdentifier = String
  type modelList = js.Array[Model]
  type modelVersionDetailList = js.Array[ModelVersionDetail]
  type modelsMaxPageSize = Int
  type nonEmptyString = String
  type ruleExpression = String
  type s3BucketLocation = String
  type sageMakerEndpointIdentifier = String
  type tagKey = String
  type tagKeyList = js.Array[tagKey]
  type tagList = js.Array[Tag]
  type tagValue = String
  type time = String
  type variableName = String
  type variableValue = String
  type wholeNumberVersionString = String

  final class FraudDetectorOps(private val service: FraudDetector) extends AnyVal {

    @inline def batchCreateVariableFuture(params: BatchCreateVariableRequest): Future[BatchCreateVariableResult] = service.batchCreateVariable(params).promise().toFuture
    @inline def batchGetVariableFuture(params: BatchGetVariableRequest): Future[BatchGetVariableResult] = service.batchGetVariable(params).promise().toFuture
    @inline def cancelBatchPredictionJobFuture(params: CancelBatchPredictionJobRequest): Future[CancelBatchPredictionJobResult] = service.cancelBatchPredictionJob(params).promise().toFuture
    @inline def createBatchPredictionJobFuture(params: CreateBatchPredictionJobRequest): Future[CreateBatchPredictionJobResult] = service.createBatchPredictionJob(params).promise().toFuture
    @inline def createDetectorVersionFuture(params: CreateDetectorVersionRequest): Future[CreateDetectorVersionResult] = service.createDetectorVersion(params).promise().toFuture
    @inline def createModelFuture(params: CreateModelRequest): Future[CreateModelResult] = service.createModel(params).promise().toFuture
    @inline def createModelVersionFuture(params: CreateModelVersionRequest): Future[CreateModelVersionResult] = service.createModelVersion(params).promise().toFuture
    @inline def createRuleFuture(params: CreateRuleRequest): Future[CreateRuleResult] = service.createRule(params).promise().toFuture
    @inline def createVariableFuture(params: CreateVariableRequest): Future[CreateVariableResult] = service.createVariable(params).promise().toFuture
    @inline def deleteBatchPredictionJobFuture(params: DeleteBatchPredictionJobRequest): Future[DeleteBatchPredictionJobResult] = service.deleteBatchPredictionJob(params).promise().toFuture
    @inline def deleteDetectorFuture(params: DeleteDetectorRequest): Future[DeleteDetectorResult] = service.deleteDetector(params).promise().toFuture
    @inline def deleteDetectorVersionFuture(params: DeleteDetectorVersionRequest): Future[DeleteDetectorVersionResult] = service.deleteDetectorVersion(params).promise().toFuture
    @inline def deleteEntityTypeFuture(params: DeleteEntityTypeRequest): Future[DeleteEntityTypeResult] = service.deleteEntityType(params).promise().toFuture
    @inline def deleteEventFuture(params: DeleteEventRequest): Future[DeleteEventResult] = service.deleteEvent(params).promise().toFuture
    @inline def deleteEventTypeFuture(params: DeleteEventTypeRequest): Future[DeleteEventTypeResult] = service.deleteEventType(params).promise().toFuture
    @inline def deleteExternalModelFuture(params: DeleteExternalModelRequest): Future[DeleteExternalModelResult] = service.deleteExternalModel(params).promise().toFuture
    @inline def deleteLabelFuture(params: DeleteLabelRequest): Future[DeleteLabelResult] = service.deleteLabel(params).promise().toFuture
    @inline def deleteModelFuture(params: DeleteModelRequest): Future[DeleteModelResult] = service.deleteModel(params).promise().toFuture
    @inline def deleteModelVersionFuture(params: DeleteModelVersionRequest): Future[DeleteModelVersionResult] = service.deleteModelVersion(params).promise().toFuture
    @inline def deleteOutcomeFuture(params: DeleteOutcomeRequest): Future[DeleteOutcomeResult] = service.deleteOutcome(params).promise().toFuture
    @inline def deleteRuleFuture(params: DeleteRuleRequest): Future[DeleteRuleResult] = service.deleteRule(params).promise().toFuture
    @inline def deleteVariableFuture(params: DeleteVariableRequest): Future[DeleteVariableResult] = service.deleteVariable(params).promise().toFuture
    @inline def describeDetectorFuture(params: DescribeDetectorRequest): Future[DescribeDetectorResult] = service.describeDetector(params).promise().toFuture
    @inline def describeModelVersionsFuture(params: DescribeModelVersionsRequest): Future[DescribeModelVersionsResult] = service.describeModelVersions(params).promise().toFuture
    @inline def getBatchPredictionJobsFuture(params: GetBatchPredictionJobsRequest): Future[GetBatchPredictionJobsResult] = service.getBatchPredictionJobs(params).promise().toFuture
    @inline def getDetectorVersionFuture(params: GetDetectorVersionRequest): Future[GetDetectorVersionResult] = service.getDetectorVersion(params).promise().toFuture
    @inline def getDetectorsFuture(params: GetDetectorsRequest): Future[GetDetectorsResult] = service.getDetectors(params).promise().toFuture
    @inline def getEntityTypesFuture(params: GetEntityTypesRequest): Future[GetEntityTypesResult] = service.getEntityTypes(params).promise().toFuture
    @inline def getEventPredictionFuture(params: GetEventPredictionRequest): Future[GetEventPredictionResult] = service.getEventPrediction(params).promise().toFuture
    @inline def getEventTypesFuture(params: GetEventTypesRequest): Future[GetEventTypesResult] = service.getEventTypes(params).promise().toFuture
    @inline def getExternalModelsFuture(params: GetExternalModelsRequest): Future[GetExternalModelsResult] = service.getExternalModels(params).promise().toFuture
    @inline def getKMSEncryptionKeyFuture(): Future[GetKMSEncryptionKeyResult] = service.getKMSEncryptionKey().promise().toFuture
    @inline def getLabelsFuture(params: GetLabelsRequest): Future[GetLabelsResult] = service.getLabels(params).promise().toFuture
    @inline def getModelVersionFuture(params: GetModelVersionRequest): Future[GetModelVersionResult] = service.getModelVersion(params).promise().toFuture
    @inline def getModelsFuture(params: GetModelsRequest): Future[GetModelsResult] = service.getModels(params).promise().toFuture
    @inline def getOutcomesFuture(params: GetOutcomesRequest): Future[GetOutcomesResult] = service.getOutcomes(params).promise().toFuture
    @inline def getRulesFuture(params: GetRulesRequest): Future[GetRulesResult] = service.getRules(params).promise().toFuture
    @inline def getVariablesFuture(params: GetVariablesRequest): Future[GetVariablesResult] = service.getVariables(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = service.listTagsForResource(params).promise().toFuture
    @inline def putDetectorFuture(params: PutDetectorRequest): Future[PutDetectorResult] = service.putDetector(params).promise().toFuture
    @inline def putEntityTypeFuture(params: PutEntityTypeRequest): Future[PutEntityTypeResult] = service.putEntityType(params).promise().toFuture
    @inline def putEventTypeFuture(params: PutEventTypeRequest): Future[PutEventTypeResult] = service.putEventType(params).promise().toFuture
    @inline def putExternalModelFuture(params: PutExternalModelRequest): Future[PutExternalModelResult] = service.putExternalModel(params).promise().toFuture
    @inline def putKMSEncryptionKeyFuture(params: PutKMSEncryptionKeyRequest): Future[PutKMSEncryptionKeyResult] = service.putKMSEncryptionKey(params).promise().toFuture
    @inline def putLabelFuture(params: PutLabelRequest): Future[PutLabelResult] = service.putLabel(params).promise().toFuture
    @inline def putOutcomeFuture(params: PutOutcomeRequest): Future[PutOutcomeResult] = service.putOutcome(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] = service.untagResource(params).promise().toFuture
    @inline def updateDetectorVersionFuture(params: UpdateDetectorVersionRequest): Future[UpdateDetectorVersionResult] = service.updateDetectorVersion(params).promise().toFuture
    @inline def updateDetectorVersionMetadataFuture(params: UpdateDetectorVersionMetadataRequest): Future[UpdateDetectorVersionMetadataResult] = service.updateDetectorVersionMetadata(params).promise().toFuture
    @inline def updateDetectorVersionStatusFuture(params: UpdateDetectorVersionStatusRequest): Future[UpdateDetectorVersionStatusResult] = service.updateDetectorVersionStatus(params).promise().toFuture
    @inline def updateModelFuture(params: UpdateModelRequest): Future[UpdateModelResult] = service.updateModel(params).promise().toFuture
    @inline def updateModelVersionFuture(params: UpdateModelVersionRequest): Future[UpdateModelVersionResult] = service.updateModelVersion(params).promise().toFuture
    @inline def updateModelVersionStatusFuture(params: UpdateModelVersionStatusRequest): Future[UpdateModelVersionStatusResult] = service.updateModelVersionStatus(params).promise().toFuture
    @inline def updateRuleMetadataFuture(params: UpdateRuleMetadataRequest): Future[UpdateRuleMetadataResult] = service.updateRuleMetadata(params).promise().toFuture
    @inline def updateRuleVersionFuture(params: UpdateRuleVersionRequest): Future[UpdateRuleVersionResult] = service.updateRuleVersion(params).promise().toFuture
    @inline def updateVariableFuture(params: UpdateVariableRequest): Future[UpdateVariableResult] = service.updateVariable(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/frauddetector", JSImport.Namespace, "AWS.FraudDetector")
  class FraudDetector() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCreateVariable(params: BatchCreateVariableRequest): Request[BatchCreateVariableResult] = js.native
    def batchGetVariable(params: BatchGetVariableRequest): Request[BatchGetVariableResult] = js.native
    def cancelBatchPredictionJob(params: CancelBatchPredictionJobRequest): Request[CancelBatchPredictionJobResult] = js.native
    def createBatchPredictionJob(params: CreateBatchPredictionJobRequest): Request[CreateBatchPredictionJobResult] = js.native
    def createDetectorVersion(params: CreateDetectorVersionRequest): Request[CreateDetectorVersionResult] = js.native
    def createModel(params: CreateModelRequest): Request[CreateModelResult] = js.native
    def createModelVersion(params: CreateModelVersionRequest): Request[CreateModelVersionResult] = js.native
    def createRule(params: CreateRuleRequest): Request[CreateRuleResult] = js.native
    def createVariable(params: CreateVariableRequest): Request[CreateVariableResult] = js.native
    def deleteBatchPredictionJob(params: DeleteBatchPredictionJobRequest): Request[DeleteBatchPredictionJobResult] = js.native
    def deleteDetector(params: DeleteDetectorRequest): Request[DeleteDetectorResult] = js.native
    def deleteDetectorVersion(params: DeleteDetectorVersionRequest): Request[DeleteDetectorVersionResult] = js.native
    def deleteEntityType(params: DeleteEntityTypeRequest): Request[DeleteEntityTypeResult] = js.native
    def deleteEvent(params: DeleteEventRequest): Request[DeleteEventResult] = js.native
    def deleteEventType(params: DeleteEventTypeRequest): Request[DeleteEventTypeResult] = js.native
    def deleteExternalModel(params: DeleteExternalModelRequest): Request[DeleteExternalModelResult] = js.native
    def deleteLabel(params: DeleteLabelRequest): Request[DeleteLabelResult] = js.native
    def deleteModel(params: DeleteModelRequest): Request[DeleteModelResult] = js.native
    def deleteModelVersion(params: DeleteModelVersionRequest): Request[DeleteModelVersionResult] = js.native
    def deleteOutcome(params: DeleteOutcomeRequest): Request[DeleteOutcomeResult] = js.native
    def deleteRule(params: DeleteRuleRequest): Request[DeleteRuleResult] = js.native
    def deleteVariable(params: DeleteVariableRequest): Request[DeleteVariableResult] = js.native
    def describeDetector(params: DescribeDetectorRequest): Request[DescribeDetectorResult] = js.native
    def describeModelVersions(params: DescribeModelVersionsRequest): Request[DescribeModelVersionsResult] = js.native
    def getBatchPredictionJobs(params: GetBatchPredictionJobsRequest): Request[GetBatchPredictionJobsResult] = js.native
    def getDetectorVersion(params: GetDetectorVersionRequest): Request[GetDetectorVersionResult] = js.native
    def getDetectors(params: GetDetectorsRequest): Request[GetDetectorsResult] = js.native
    def getEntityTypes(params: GetEntityTypesRequest): Request[GetEntityTypesResult] = js.native
    def getEventPrediction(params: GetEventPredictionRequest): Request[GetEventPredictionResult] = js.native
    def getEventTypes(params: GetEventTypesRequest): Request[GetEventTypesResult] = js.native
    def getExternalModels(params: GetExternalModelsRequest): Request[GetExternalModelsResult] = js.native
    def getKMSEncryptionKey(): Request[GetKMSEncryptionKeyResult] = js.native
    def getLabels(params: GetLabelsRequest): Request[GetLabelsResult] = js.native
    def getModelVersion(params: GetModelVersionRequest): Request[GetModelVersionResult] = js.native
    def getModels(params: GetModelsRequest): Request[GetModelsResult] = js.native
    def getOutcomes(params: GetOutcomesRequest): Request[GetOutcomesResult] = js.native
    def getRules(params: GetRulesRequest): Request[GetRulesResult] = js.native
    def getVariables(params: GetVariablesRequest): Request[GetVariablesResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def putDetector(params: PutDetectorRequest): Request[PutDetectorResult] = js.native
    def putEntityType(params: PutEntityTypeRequest): Request[PutEntityTypeResult] = js.native
    def putEventType(params: PutEventTypeRequest): Request[PutEventTypeResult] = js.native
    def putExternalModel(params: PutExternalModelRequest): Request[PutExternalModelResult] = js.native
    def putKMSEncryptionKey(params: PutKMSEncryptionKeyRequest): Request[PutKMSEncryptionKeyResult] = js.native
    def putLabel(params: PutLabelRequest): Request[PutLabelResult] = js.native
    def putOutcome(params: PutOutcomeRequest): Request[PutOutcomeResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult] = js.native
    def updateDetectorVersion(params: UpdateDetectorVersionRequest): Request[UpdateDetectorVersionResult] = js.native
    def updateDetectorVersionMetadata(params: UpdateDetectorVersionMetadataRequest): Request[UpdateDetectorVersionMetadataResult] = js.native
    def updateDetectorVersionStatus(params: UpdateDetectorVersionStatusRequest): Request[UpdateDetectorVersionStatusResult] = js.native
    def updateModel(params: UpdateModelRequest): Request[UpdateModelResult] = js.native
    def updateModelVersion(params: UpdateModelVersionRequest): Request[UpdateModelVersionResult] = js.native
    def updateModelVersionStatus(params: UpdateModelVersionStatusRequest): Request[UpdateModelVersionStatusResult] = js.native
    def updateRuleMetadata(params: UpdateRuleMetadataRequest): Request[UpdateRuleMetadataResult] = js.native
    def updateRuleVersion(params: UpdateRuleVersionRequest): Request[UpdateRuleVersionResult] = js.native
    def updateVariable(params: UpdateVariableRequest): Request[UpdateVariableResult] = js.native
  }
  object FraudDetector {
    @inline implicit def toOps(service: FraudDetector): FraudDetectorOps = {
      new FraudDetectorOps(service)
    }
  }

  /** Provides the error of the batch create variable API.
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
    var tags: js.UndefOr[tagList]
  }

  object BatchCreateVariableRequest {
    @inline
    def apply(
        variableEntries: VariableEntryList,
        tags: js.UndefOr[tagList] = js.undefined
    ): BatchCreateVariableRequest = {
      val __obj = js.Dynamic.literal(
        "variableEntries" -> variableEntries.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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

  /** Provides the error of the batch get variable API.
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

  /** The batch prediction details.
    */
  @js.native
  trait BatchPrediction extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var completionTime: js.UndefOr[time]
    var detectorName: js.UndefOr[identifier]
    var detectorVersion: js.UndefOr[floatVersionString]
    var eventTypeName: js.UndefOr[identifier]
    var failureReason: js.UndefOr[String]
    var iamRoleArn: js.UndefOr[iamRoleArn]
    var inputPath: js.UndefOr[s3BucketLocation]
    var jobId: js.UndefOr[identifier]
    var lastHeartbeatTime: js.UndefOr[time]
    var outputPath: js.UndefOr[s3BucketLocation]
    var processedRecordsCount: js.UndefOr[Int]
    var startTime: js.UndefOr[time]
    var status: js.UndefOr[AsyncJobStatus]
    var totalRecordsCount: js.UndefOr[Int]
  }

  object BatchPrediction {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        completionTime: js.UndefOr[time] = js.undefined,
        detectorName: js.UndefOr[identifier] = js.undefined,
        detectorVersion: js.UndefOr[floatVersionString] = js.undefined,
        eventTypeName: js.UndefOr[identifier] = js.undefined,
        failureReason: js.UndefOr[String] = js.undefined,
        iamRoleArn: js.UndefOr[iamRoleArn] = js.undefined,
        inputPath: js.UndefOr[s3BucketLocation] = js.undefined,
        jobId: js.UndefOr[identifier] = js.undefined,
        lastHeartbeatTime: js.UndefOr[time] = js.undefined,
        outputPath: js.UndefOr[s3BucketLocation] = js.undefined,
        processedRecordsCount: js.UndefOr[Int] = js.undefined,
        startTime: js.UndefOr[time] = js.undefined,
        status: js.UndefOr[AsyncJobStatus] = js.undefined,
        totalRecordsCount: js.UndefOr[Int] = js.undefined
    ): BatchPrediction = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      detectorName.foreach(__v => __obj.updateDynamic("detectorName")(__v.asInstanceOf[js.Any]))
      detectorVersion.foreach(__v => __obj.updateDynamic("detectorVersion")(__v.asInstanceOf[js.Any]))
      eventTypeName.foreach(__v => __obj.updateDynamic("eventTypeName")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      iamRoleArn.foreach(__v => __obj.updateDynamic("iamRoleArn")(__v.asInstanceOf[js.Any]))
      inputPath.foreach(__v => __obj.updateDynamic("inputPath")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      lastHeartbeatTime.foreach(__v => __obj.updateDynamic("lastHeartbeatTime")(__v.asInstanceOf[js.Any]))
      outputPath.foreach(__v => __obj.updateDynamic("outputPath")(__v.asInstanceOf[js.Any]))
      processedRecordsCount.foreach(__v => __obj.updateDynamic("processedRecordsCount")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      totalRecordsCount.foreach(__v => __obj.updateDynamic("totalRecordsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPrediction]
    }
  }

  @js.native
  trait CancelBatchPredictionJobRequest extends js.Object {
    var jobId: identifier
  }

  object CancelBatchPredictionJobRequest {
    @inline
    def apply(
        jobId: identifier
    ): CancelBatchPredictionJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelBatchPredictionJobRequest]
    }
  }

  @js.native
  trait CancelBatchPredictionJobResult extends js.Object

  object CancelBatchPredictionJobResult {
    @inline
    def apply(): CancelBatchPredictionJobResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelBatchPredictionJobResult]
    }
  }

  @js.native
  trait CreateBatchPredictionJobRequest extends js.Object {
    var detectorName: identifier
    var eventTypeName: identifier
    var iamRoleArn: iamRoleArn
    var inputPath: s3BucketLocation
    var jobId: identifier
    var outputPath: s3BucketLocation
    var detectorVersion: js.UndefOr[wholeNumberVersionString]
    var tags: js.UndefOr[tagList]
  }

  object CreateBatchPredictionJobRequest {
    @inline
    def apply(
        detectorName: identifier,
        eventTypeName: identifier,
        iamRoleArn: iamRoleArn,
        inputPath: s3BucketLocation,
        jobId: identifier,
        outputPath: s3BucketLocation,
        detectorVersion: js.UndefOr[wholeNumberVersionString] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): CreateBatchPredictionJobRequest = {
      val __obj = js.Dynamic.literal(
        "detectorName" -> detectorName.asInstanceOf[js.Any],
        "eventTypeName" -> eventTypeName.asInstanceOf[js.Any],
        "iamRoleArn" -> iamRoleArn.asInstanceOf[js.Any],
        "inputPath" -> inputPath.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any],
        "outputPath" -> outputPath.asInstanceOf[js.Any]
      )

      detectorVersion.foreach(__v => __obj.updateDynamic("detectorVersion")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBatchPredictionJobRequest]
    }
  }

  @js.native
  trait CreateBatchPredictionJobResult extends js.Object

  object CreateBatchPredictionJobResult {
    @inline
    def apply(): CreateBatchPredictionJobResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateBatchPredictionJobResult]
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
    var tags: js.UndefOr[tagList]
  }

  object CreateDetectorVersionRequest {
    @inline
    def apply(
        detectorId: identifier,
        rules: RuleList,
        description: js.UndefOr[description] = js.undefined,
        externalModelEndpoints: js.UndefOr[ListOfStrings] = js.undefined,
        modelVersions: js.UndefOr[ListOfModelVersions] = js.undefined,
        ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): CreateDetectorVersionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "rules" -> rules.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      externalModelEndpoints.foreach(__v => __obj.updateDynamic("externalModelEndpoints")(__v.asInstanceOf[js.Any]))
      modelVersions.foreach(__v => __obj.updateDynamic("modelVersions")(__v.asInstanceOf[js.Any]))
      ruleExecutionMode.foreach(__v => __obj.updateDynamic("ruleExecutionMode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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
  trait CreateModelRequest extends js.Object {
    var eventTypeName: String
    var modelId: modelIdentifier
    var modelType: ModelTypeEnum
    var description: js.UndefOr[description]
    var tags: js.UndefOr[tagList]
  }

  object CreateModelRequest {
    @inline
    def apply(
        eventTypeName: String,
        modelId: modelIdentifier,
        modelType: ModelTypeEnum,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): CreateModelRequest = {
      val __obj = js.Dynamic.literal(
        "eventTypeName" -> eventTypeName.asInstanceOf[js.Any],
        "modelId" -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelRequest]
    }
  }

  @js.native
  trait CreateModelResult extends js.Object

  object CreateModelResult {
    @inline
    def apply(): CreateModelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateModelResult]
    }
  }

  @js.native
  trait CreateModelVersionRequest extends js.Object {
    var modelId: modelIdentifier
    var modelType: ModelTypeEnum
    var trainingDataSchema: TrainingDataSchema
    var trainingDataSource: TrainingDataSourceEnum
    var externalEventsDetail: js.UndefOr[ExternalEventsDetail]
    var tags: js.UndefOr[tagList]
  }

  object CreateModelVersionRequest {
    @inline
    def apply(
        modelId: modelIdentifier,
        modelType: ModelTypeEnum,
        trainingDataSchema: TrainingDataSchema,
        trainingDataSource: TrainingDataSourceEnum,
        externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): CreateModelVersionRequest = {
      val __obj = js.Dynamic.literal(
        "modelId" -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any],
        "trainingDataSchema" -> trainingDataSchema.asInstanceOf[js.Any],
        "trainingDataSource" -> trainingDataSource.asInstanceOf[js.Any]
      )

      externalEventsDetail.foreach(__v => __obj.updateDynamic("externalEventsDetail")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelVersionRequest]
    }
  }

  @js.native
  trait CreateModelVersionResult extends js.Object {
    var modelId: js.UndefOr[modelIdentifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[nonEmptyString]
    var status: js.UndefOr[String]
  }

  object CreateModelVersionResult {
    @inline
    def apply(
        modelId: js.UndefOr[modelIdentifier] = js.undefined,
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
    var tags: js.UndefOr[tagList]
  }

  object CreateRuleRequest {
    @inline
    def apply(
        detectorId: identifier,
        expression: ruleExpression,
        language: Language,
        outcomes: NonEmptyListOfStrings,
        ruleId: identifier,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): CreateRuleRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "expression" -> expression.asInstanceOf[js.Any],
        "language" -> language.asInstanceOf[js.Any],
        "outcomes" -> outcomes.asInstanceOf[js.Any],
        "ruleId" -> ruleId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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
    var tags: js.UndefOr[tagList]
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
        tags: js.UndefOr[tagList] = js.undefined,
        variableType: js.UndefOr[String] = js.undefined
    ): CreateVariableRequest = {
      val __obj = js.Dynamic.literal(
        "dataSource" -> dataSource.asInstanceOf[js.Any],
        "dataType" -> dataType.asInstanceOf[js.Any],
        "defaultValue" -> defaultValue.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      variableType.foreach(__v => __obj.updateDynamic("variableType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVariableRequest]
    }
  }

  @js.native
  trait CreateVariableResult extends js.Object

  object CreateVariableResult {
    @inline
    def apply(): CreateVariableResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateVariableResult]
    }
  }

  /** The model training validation messages.
    */
  @js.native
  trait DataValidationMetrics extends js.Object {
    var fieldLevelMessages: js.UndefOr[fieldValidationMessageList]
    var fileLevelMessages: js.UndefOr[fileValidationMessageList]
  }

  object DataValidationMetrics {
    @inline
    def apply(
        fieldLevelMessages: js.UndefOr[fieldValidationMessageList] = js.undefined,
        fileLevelMessages: js.UndefOr[fileValidationMessageList] = js.undefined
    ): DataValidationMetrics = {
      val __obj = js.Dynamic.literal()
      fieldLevelMessages.foreach(__v => __obj.updateDynamic("fieldLevelMessages")(__v.asInstanceOf[js.Any]))
      fileLevelMessages.foreach(__v => __obj.updateDynamic("fileLevelMessages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataValidationMetrics]
    }
  }

  @js.native
  trait DeleteBatchPredictionJobRequest extends js.Object {
    var jobId: identifier
  }

  object DeleteBatchPredictionJobRequest {
    @inline
    def apply(
        jobId: identifier
    ): DeleteBatchPredictionJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBatchPredictionJobRequest]
    }
  }

  @js.native
  trait DeleteBatchPredictionJobResult extends js.Object

  object DeleteBatchPredictionJobResult {
    @inline
    def apply(): DeleteBatchPredictionJobResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteBatchPredictionJobResult]
    }
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
  trait DeleteDetectorResult extends js.Object

  object DeleteDetectorResult {
    @inline
    def apply(): DeleteDetectorResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDetectorResult]
    }
  }

  @js.native
  trait DeleteDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: wholeNumberVersionString
  }

  object DeleteDetectorVersionRequest {
    @inline
    def apply(
        detectorId: identifier,
        detectorVersionId: wholeNumberVersionString
    ): DeleteDetectorVersionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId" -> detectorVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDetectorVersionRequest]
    }
  }

  @js.native
  trait DeleteDetectorVersionResult extends js.Object

  object DeleteDetectorVersionResult {
    @inline
    def apply(): DeleteDetectorVersionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDetectorVersionResult]
    }
  }

  @js.native
  trait DeleteEntityTypeRequest extends js.Object {
    var name: identifier
  }

  object DeleteEntityTypeRequest {
    @inline
    def apply(
        name: identifier
    ): DeleteEntityTypeRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEntityTypeRequest]
    }
  }

  @js.native
  trait DeleteEntityTypeResult extends js.Object

  object DeleteEntityTypeResult {
    @inline
    def apply(): DeleteEntityTypeResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEntityTypeResult]
    }
  }

  @js.native
  trait DeleteEventRequest extends js.Object {
    var eventId: identifier
    var eventTypeName: identifier
  }

  object DeleteEventRequest {
    @inline
    def apply(
        eventId: identifier,
        eventTypeName: identifier
    ): DeleteEventRequest = {
      val __obj = js.Dynamic.literal(
        "eventId" -> eventId.asInstanceOf[js.Any],
        "eventTypeName" -> eventTypeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventRequest]
    }
  }

  @js.native
  trait DeleteEventResult extends js.Object

  object DeleteEventResult {
    @inline
    def apply(): DeleteEventResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEventResult]
    }
  }

  @js.native
  trait DeleteEventTypeRequest extends js.Object {
    var name: identifier
  }

  object DeleteEventTypeRequest {
    @inline
    def apply(
        name: identifier
    ): DeleteEventTypeRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventTypeRequest]
    }
  }

  @js.native
  trait DeleteEventTypeResult extends js.Object

  object DeleteEventTypeResult {
    @inline
    def apply(): DeleteEventTypeResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEventTypeResult]
    }
  }

  @js.native
  trait DeleteExternalModelRequest extends js.Object {
    var modelEndpoint: sageMakerEndpointIdentifier
  }

  object DeleteExternalModelRequest {
    @inline
    def apply(
        modelEndpoint: sageMakerEndpointIdentifier
    ): DeleteExternalModelRequest = {
      val __obj = js.Dynamic.literal(
        "modelEndpoint" -> modelEndpoint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteExternalModelRequest]
    }
  }

  @js.native
  trait DeleteExternalModelResult extends js.Object

  object DeleteExternalModelResult {
    @inline
    def apply(): DeleteExternalModelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteExternalModelResult]
    }
  }

  @js.native
  trait DeleteLabelRequest extends js.Object {
    var name: identifier
  }

  object DeleteLabelRequest {
    @inline
    def apply(
        name: identifier
    ): DeleteLabelRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLabelRequest]
    }
  }

  @js.native
  trait DeleteLabelResult extends js.Object

  object DeleteLabelResult {
    @inline
    def apply(): DeleteLabelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLabelResult]
    }
  }

  @js.native
  trait DeleteModelRequest extends js.Object {
    var modelId: modelIdentifier
    var modelType: ModelTypeEnum
  }

  object DeleteModelRequest {
    @inline
    def apply(
        modelId: modelIdentifier,
        modelType: ModelTypeEnum
    ): DeleteModelRequest = {
      val __obj = js.Dynamic.literal(
        "modelId" -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelRequest]
    }
  }

  @js.native
  trait DeleteModelResult extends js.Object

  object DeleteModelResult {
    @inline
    def apply(): DeleteModelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteModelResult]
    }
  }

  @js.native
  trait DeleteModelVersionRequest extends js.Object {
    var modelId: modelIdentifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: floatVersionString
  }

  object DeleteModelVersionRequest {
    @inline
    def apply(
        modelId: modelIdentifier,
        modelType: ModelTypeEnum,
        modelVersionNumber: floatVersionString
    ): DeleteModelVersionRequest = {
      val __obj = js.Dynamic.literal(
        "modelId" -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any],
        "modelVersionNumber" -> modelVersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelVersionRequest]
    }
  }

  @js.native
  trait DeleteModelVersionResult extends js.Object

  object DeleteModelVersionResult {
    @inline
    def apply(): DeleteModelVersionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteModelVersionResult]
    }
  }

  @js.native
  trait DeleteOutcomeRequest extends js.Object {
    var name: identifier
  }

  object DeleteOutcomeRequest {
    @inline
    def apply(
        name: identifier
    ): DeleteOutcomeRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteOutcomeRequest]
    }
  }

  @js.native
  trait DeleteOutcomeResult extends js.Object

  object DeleteOutcomeResult {
    @inline
    def apply(): DeleteOutcomeResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteOutcomeResult]
    }
  }

  @js.native
  trait DeleteRuleRequest extends js.Object {
    var rule: Rule
  }

  object DeleteRuleRequest {
    @inline
    def apply(
        rule: Rule
    ): DeleteRuleRequest = {
      val __obj = js.Dynamic.literal(
        "rule" -> rule.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRuleRequest]
    }
  }

  @js.native
  trait DeleteRuleResult extends js.Object

  object DeleteRuleResult {
    @inline
    def apply(): DeleteRuleResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRuleResult]
    }
  }

  @js.native
  trait DeleteVariableRequest extends js.Object {
    var name: String
  }

  object DeleteVariableRequest {
    @inline
    def apply(
        name: String
    ): DeleteVariableRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVariableRequest]
    }
  }

  @js.native
  trait DeleteVariableResult extends js.Object

  object DeleteVariableResult {
    @inline
    def apply(): DeleteVariableResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteVariableResult]
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
    var arn: js.UndefOr[fraudDetectorArn]
    var detectorId: js.UndefOr[identifier]
    var detectorVersionSummaries: js.UndefOr[DetectorVersionSummaryList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeDetectorResult {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        detectorId: js.UndefOr[identifier] = js.undefined,
        detectorVersionSummaries: js.UndefOr[DetectorVersionSummaryList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeDetectorResult = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      detectorId.foreach(__v => __obj.updateDynamic("detectorId")(__v.asInstanceOf[js.Any]))
      detectorVersionSummaries.foreach(__v => __obj.updateDynamic("detectorVersionSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDetectorResult]
    }
  }

  @js.native
  trait DescribeModelVersionsRequest extends js.Object {
    var maxResults: js.UndefOr[modelsMaxPageSize]
    var modelId: js.UndefOr[modelIdentifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[floatVersionString]
    var nextToken: js.UndefOr[String]
  }

  object DescribeModelVersionsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[modelsMaxPageSize] = js.undefined,
        modelId: js.UndefOr[modelIdentifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        modelVersionNumber: js.UndefOr[floatVersionString] = js.undefined,
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
    var modelVersionDetails: js.UndefOr[modelVersionDetailList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeModelVersionsResult {
    @inline
    def apply(
        modelVersionDetails: js.UndefOr[modelVersionDetailList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeModelVersionsResult = {
      val __obj = js.Dynamic.literal()
      modelVersionDetails.foreach(__v => __obj.updateDynamic("modelVersionDetails")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeModelVersionsResult]
    }
  }

  /** The detector.
    */
  @js.native
  trait Detector extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var detectorId: js.UndefOr[identifier]
    var eventTypeName: js.UndefOr[identifier]
    var lastUpdatedTime: js.UndefOr[time]
  }

  object Detector {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        detectorId: js.UndefOr[identifier] = js.undefined,
        eventTypeName: js.UndefOr[identifier] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined
    ): Detector = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      detectorId.foreach(__v => __obj.updateDynamic("detectorId")(__v.asInstanceOf[js.Any]))
      eventTypeName.foreach(__v => __obj.updateDynamic("eventTypeName")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Detector]
    }
  }

  /** The summary of the detector version.
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

  /** The entity details.
    */
  @js.native
  trait Entity extends js.Object {
    var entityId: identifier
    var entityType: String
  }

  object Entity {
    @inline
    def apply(
        entityId: identifier,
        entityType: String
    ): Entity = {
      val __obj = js.Dynamic.literal(
        "entityId" -> entityId.asInstanceOf[js.Any],
        "entityType" -> entityType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Entity]
    }
  }

  /** The entity type details.
    */
  @js.native
  trait EntityType extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var lastUpdatedTime: js.UndefOr[time]
    var name: js.UndefOr[String]
  }

  object EntityType {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): EntityType = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityType]
    }
  }

  /** The event type details.
    */
  @js.native
  trait EventType extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var entityTypes: js.UndefOr[NonEmptyListOfStrings]
    var eventVariables: js.UndefOr[ListOfStrings]
    var labels: js.UndefOr[ListOfStrings]
    var lastUpdatedTime: js.UndefOr[time]
    var name: js.UndefOr[String]
  }

  object EventType {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        entityTypes: js.UndefOr[NonEmptyListOfStrings] = js.undefined,
        eventVariables: js.UndefOr[ListOfStrings] = js.undefined,
        labels: js.UndefOr[ListOfStrings] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): EventType = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      entityTypes.foreach(__v => __obj.updateDynamic("entityTypes")(__v.asInstanceOf[js.Any]))
      eventVariables.foreach(__v => __obj.updateDynamic("eventVariables")(__v.asInstanceOf[js.Any]))
      labels.foreach(__v => __obj.updateDynamic("labels")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventType]
    }
  }

  /** Details for the external events data used for model version training.
    */
  @js.native
  trait ExternalEventsDetail extends js.Object {
    var dataAccessRoleArn: iamRoleArn
    var dataLocation: s3BucketLocation
  }

  object ExternalEventsDetail {
    @inline
    def apply(
        dataAccessRoleArn: iamRoleArn,
        dataLocation: s3BucketLocation
    ): ExternalEventsDetail = {
      val __obj = js.Dynamic.literal(
        "dataAccessRoleArn" -> dataAccessRoleArn.asInstanceOf[js.Any],
        "dataLocation" -> dataLocation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExternalEventsDetail]
    }
  }

  /** The Amazon SageMaker model.
    */
  @js.native
  trait ExternalModel extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var inputConfiguration: js.UndefOr[ModelInputConfiguration]
    var invokeModelEndpointRoleArn: js.UndefOr[String]
    var lastUpdatedTime: js.UndefOr[time]
    var modelEndpoint: js.UndefOr[String]
    var modelEndpointStatus: js.UndefOr[ModelEndpointStatus]
    var modelSource: js.UndefOr[ModelSource]
    var outputConfiguration: js.UndefOr[ModelOutputConfiguration]
  }

  object ExternalModel {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        inputConfiguration: js.UndefOr[ModelInputConfiguration] = js.undefined,
        invokeModelEndpointRoleArn: js.UndefOr[String] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        modelEndpoint: js.UndefOr[String] = js.undefined,
        modelEndpointStatus: js.UndefOr[ModelEndpointStatus] = js.undefined,
        modelSource: js.UndefOr[ModelSource] = js.undefined,
        outputConfiguration: js.UndefOr[ModelOutputConfiguration] = js.undefined
    ): ExternalModel = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      inputConfiguration.foreach(__v => __obj.updateDynamic("inputConfiguration")(__v.asInstanceOf[js.Any]))
      invokeModelEndpointRoleArn.foreach(__v => __obj.updateDynamic("invokeModelEndpointRoleArn")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      modelEndpoint.foreach(__v => __obj.updateDynamic("modelEndpoint")(__v.asInstanceOf[js.Any]))
      modelEndpointStatus.foreach(__v => __obj.updateDynamic("modelEndpointStatus")(__v.asInstanceOf[js.Any]))
      modelSource.foreach(__v => __obj.updateDynamic("modelSource")(__v.asInstanceOf[js.Any]))
      outputConfiguration.foreach(__v => __obj.updateDynamic("outputConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExternalModel]
    }
  }

  /** The message details.
    */
  @js.native
  trait FieldValidationMessage extends js.Object {
    var content: js.UndefOr[String]
    var fieldName: js.UndefOr[String]
    var identifier: js.UndefOr[String]
    var title: js.UndefOr[String]
    var `type`: js.UndefOr[String]
  }

  object FieldValidationMessage {
    @inline
    def apply(
        content: js.UndefOr[String] = js.undefined,
        fieldName: js.UndefOr[String] = js.undefined,
        identifier: js.UndefOr[String] = js.undefined,
        title: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): FieldValidationMessage = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      fieldName.foreach(__v => __obj.updateDynamic("fieldName")(__v.asInstanceOf[js.Any]))
      identifier.foreach(__v => __obj.updateDynamic("identifier")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldValidationMessage]
    }
  }

  /** The message details.
    */
  @js.native
  trait FileValidationMessage extends js.Object {
    var content: js.UndefOr[String]
    var title: js.UndefOr[String]
    var `type`: js.UndefOr[String]
  }

  object FileValidationMessage {
    @inline
    def apply(
        content: js.UndefOr[String] = js.undefined,
        title: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): FileValidationMessage = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileValidationMessage]
    }
  }

  @js.native
  trait GetBatchPredictionJobsRequest extends js.Object {
    var jobId: js.UndefOr[identifier]
    var maxResults: js.UndefOr[batchPredictionsMaxPageSize]
    var nextToken: js.UndefOr[String]
  }

  object GetBatchPredictionJobsRequest {
    @inline
    def apply(
        jobId: js.UndefOr[identifier] = js.undefined,
        maxResults: js.UndefOr[batchPredictionsMaxPageSize] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetBatchPredictionJobsRequest = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBatchPredictionJobsRequest]
    }
  }

  @js.native
  trait GetBatchPredictionJobsResult extends js.Object {
    var batchPredictions: js.UndefOr[BatchPredictionList]
    var nextToken: js.UndefOr[String]
  }

  object GetBatchPredictionJobsResult {
    @inline
    def apply(
        batchPredictions: js.UndefOr[BatchPredictionList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetBatchPredictionJobsResult = {
      val __obj = js.Dynamic.literal()
      batchPredictions.foreach(__v => __obj.updateDynamic("batchPredictions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBatchPredictionJobsResult]
    }
  }

  @js.native
  trait GetDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: wholeNumberVersionString
  }

  object GetDetectorVersionRequest {
    @inline
    def apply(
        detectorId: identifier,
        detectorVersionId: wholeNumberVersionString
    ): GetDetectorVersionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId" -> detectorVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDetectorVersionRequest]
    }
  }

  @js.native
  trait GetDetectorVersionResult extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var detectorId: js.UndefOr[identifier]
    var detectorVersionId: js.UndefOr[wholeNumberVersionString]
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
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        detectorId: js.UndefOr[identifier] = js.undefined,
        detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.undefined,
        externalModelEndpoints: js.UndefOr[ListOfStrings] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        modelVersions: js.UndefOr[ListOfModelVersions] = js.undefined,
        ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.undefined,
        rules: js.UndefOr[RuleList] = js.undefined,
        status: js.UndefOr[DetectorVersionStatus] = js.undefined
    ): GetDetectorVersionResult = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
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
  trait GetEntityTypesRequest extends js.Object {
    var maxResults: js.UndefOr[entityTypesMaxResults]
    var name: js.UndefOr[identifier]
    var nextToken: js.UndefOr[String]
  }

  object GetEntityTypesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[entityTypesMaxResults] = js.undefined,
        name: js.UndefOr[identifier] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetEntityTypesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntityTypesRequest]
    }
  }

  @js.native
  trait GetEntityTypesResult extends js.Object {
    var entityTypes: js.UndefOr[entityTypeList]
    var nextToken: js.UndefOr[String]
  }

  object GetEntityTypesResult {
    @inline
    def apply(
        entityTypes: js.UndefOr[entityTypeList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetEntityTypesResult = {
      val __obj = js.Dynamic.literal()
      entityTypes.foreach(__v => __obj.updateDynamic("entityTypes")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntityTypesResult]
    }
  }

  @js.native
  trait GetEventPredictionRequest extends js.Object {
    var detectorId: String
    var entities: listOfEntities
    var eventId: String
    var eventTimestamp: String
    var eventTypeName: String
    var eventVariables: EventVariableMap
    var detectorVersionId: js.UndefOr[wholeNumberVersionString]
    var externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap]
  }

  object GetEventPredictionRequest {
    @inline
    def apply(
        detectorId: String,
        entities: listOfEntities,
        eventId: String,
        eventTimestamp: String,
        eventTypeName: String,
        eventVariables: EventVariableMap,
        detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.undefined,
        externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap] = js.undefined
    ): GetEventPredictionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "entities" -> entities.asInstanceOf[js.Any],
        "eventId" -> eventId.asInstanceOf[js.Any],
        "eventTimestamp" -> eventTimestamp.asInstanceOf[js.Any],
        "eventTypeName" -> eventTypeName.asInstanceOf[js.Any],
        "eventVariables" -> eventVariables.asInstanceOf[js.Any]
      )

      detectorVersionId.foreach(__v => __obj.updateDynamic("detectorVersionId")(__v.asInstanceOf[js.Any]))
      externalModelEndpointDataBlobs.foreach(__v => __obj.updateDynamic("externalModelEndpointDataBlobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventPredictionRequest]
    }
  }

  @js.native
  trait GetEventPredictionResult extends js.Object {
    var modelScores: js.UndefOr[ListOfModelScores]
    var ruleResults: js.UndefOr[ListOfRuleResults]
  }

  object GetEventPredictionResult {
    @inline
    def apply(
        modelScores: js.UndefOr[ListOfModelScores] = js.undefined,
        ruleResults: js.UndefOr[ListOfRuleResults] = js.undefined
    ): GetEventPredictionResult = {
      val __obj = js.Dynamic.literal()
      modelScores.foreach(__v => __obj.updateDynamic("modelScores")(__v.asInstanceOf[js.Any]))
      ruleResults.foreach(__v => __obj.updateDynamic("ruleResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventPredictionResult]
    }
  }

  @js.native
  trait GetEventTypesRequest extends js.Object {
    var maxResults: js.UndefOr[eventTypesMaxResults]
    var name: js.UndefOr[identifier]
    var nextToken: js.UndefOr[String]
  }

  object GetEventTypesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[eventTypesMaxResults] = js.undefined,
        name: js.UndefOr[identifier] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetEventTypesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventTypesRequest]
    }
  }

  @js.native
  trait GetEventTypesResult extends js.Object {
    var eventTypes: js.UndefOr[eventTypeList]
    var nextToken: js.UndefOr[String]
  }

  object GetEventTypesResult {
    @inline
    def apply(
        eventTypes: js.UndefOr[eventTypeList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetEventTypesResult = {
      val __obj = js.Dynamic.literal()
      eventTypes.foreach(__v => __obj.updateDynamic("eventTypes")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventTypesResult]
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
  trait GetKMSEncryptionKeyResult extends js.Object {
    var kmsKey: js.UndefOr[KMSKey]
  }

  object GetKMSEncryptionKeyResult {
    @inline
    def apply(
        kmsKey: js.UndefOr[KMSKey] = js.undefined
    ): GetKMSEncryptionKeyResult = {
      val __obj = js.Dynamic.literal()
      kmsKey.foreach(__v => __obj.updateDynamic("kmsKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetKMSEncryptionKeyResult]
    }
  }

  @js.native
  trait GetLabelsRequest extends js.Object {
    var maxResults: js.UndefOr[labelsMaxResults]
    var name: js.UndefOr[identifier]
    var nextToken: js.UndefOr[String]
  }

  object GetLabelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[labelsMaxResults] = js.undefined,
        name: js.UndefOr[identifier] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetLabelsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLabelsRequest]
    }
  }

  @js.native
  trait GetLabelsResult extends js.Object {
    var labels: js.UndefOr[labelList]
    var nextToken: js.UndefOr[String]
  }

  object GetLabelsResult {
    @inline
    def apply(
        labels: js.UndefOr[labelList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): GetLabelsResult = {
      val __obj = js.Dynamic.literal()
      labels.foreach(__v => __obj.updateDynamic("labels")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLabelsResult]
    }
  }

  @js.native
  trait GetModelVersionRequest extends js.Object {
    var modelId: modelIdentifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: floatVersionString
  }

  object GetModelVersionRequest {
    @inline
    def apply(
        modelId: modelIdentifier,
        modelType: ModelTypeEnum,
        modelVersionNumber: floatVersionString
    ): GetModelVersionRequest = {
      val __obj = js.Dynamic.literal(
        "modelId" -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any],
        "modelVersionNumber" -> modelVersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetModelVersionRequest]
    }
  }

  @js.native
  trait GetModelVersionResult extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var externalEventsDetail: js.UndefOr[ExternalEventsDetail]
    var modelId: js.UndefOr[modelIdentifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[floatVersionString]
    var status: js.UndefOr[String]
    var trainingDataSchema: js.UndefOr[TrainingDataSchema]
    var trainingDataSource: js.UndefOr[TrainingDataSourceEnum]
  }

  object GetModelVersionResult {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined,
        modelId: js.UndefOr[modelIdentifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        modelVersionNumber: js.UndefOr[floatVersionString] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        trainingDataSchema: js.UndefOr[TrainingDataSchema] = js.undefined,
        trainingDataSource: js.UndefOr[TrainingDataSourceEnum] = js.undefined
    ): GetModelVersionResult = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      externalEventsDetail.foreach(__v => __obj.updateDynamic("externalEventsDetail")(__v.asInstanceOf[js.Any]))
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      modelVersionNumber.foreach(__v => __obj.updateDynamic("modelVersionNumber")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      trainingDataSchema.foreach(__v => __obj.updateDynamic("trainingDataSchema")(__v.asInstanceOf[js.Any]))
      trainingDataSource.foreach(__v => __obj.updateDynamic("trainingDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelVersionResult]
    }
  }

  @js.native
  trait GetModelsRequest extends js.Object {
    var maxResults: js.UndefOr[modelsMaxPageSize]
    var modelId: js.UndefOr[modelIdentifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var nextToken: js.UndefOr[String]
  }

  object GetModelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[modelsMaxPageSize] = js.undefined,
        modelId: js.UndefOr[modelIdentifier] = js.undefined,
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
    var models: js.UndefOr[modelList]
    var nextToken: js.UndefOr[String]
  }

  object GetModelsResult {
    @inline
    def apply(
        models: js.UndefOr[modelList] = js.undefined,
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
  trait GetRulesRequest extends js.Object {
    var detectorId: identifier
    var maxResults: js.UndefOr[RulesMaxResults]
    var nextToken: js.UndefOr[String]
    var ruleId: js.UndefOr[identifier]
    var ruleVersion: js.UndefOr[wholeNumberVersionString]
  }

  object GetRulesRequest {
    @inline
    def apply(
        detectorId: identifier,
        maxResults: js.UndefOr[RulesMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        ruleId: js.UndefOr[identifier] = js.undefined,
        ruleVersion: js.UndefOr[wholeNumberVersionString] = js.undefined
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

  /** The KMS key details.
    */
  @js.native
  trait KMSKey extends js.Object {
    var kmsEncryptionKeyArn: js.UndefOr[KmsEncryptionKeyArn]
  }

  object KMSKey {
    @inline
    def apply(
        kmsEncryptionKeyArn: js.UndefOr[KmsEncryptionKeyArn] = js.undefined
    ): KMSKey = {
      val __obj = js.Dynamic.literal()
      kmsEncryptionKeyArn.foreach(__v => __obj.updateDynamic("kmsEncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KMSKey]
    }
  }

  /** The label details.
    */
  @js.native
  trait Label extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var lastUpdatedTime: js.UndefOr[time]
    var name: js.UndefOr[String]
  }

  object Label {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): Label = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Label]
    }
  }

  /** The label schema.
    */
  @js.native
  trait LabelSchema extends js.Object {
    var labelMapper: labelMapper
  }

  object LabelSchema {
    @inline
    def apply(
        labelMapper: labelMapper
    ): LabelSchema = {
      val __obj = js.Dynamic.literal(
        "labelMapper" -> labelMapper.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LabelSchema]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceARN: fraudDetectorArn
    var maxResults: js.UndefOr[TagsMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceARN: fraudDetectorArn,
        maxResults: js.UndefOr[TagsMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceARN" -> resourceARN.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var nextToken: js.UndefOr[String]
    var tags: js.UndefOr[tagList]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /** Model performance metrics data points.
    */
  @js.native
  trait MetricDataPoint extends js.Object {
    var fpr: js.UndefOr[Float]
    var precision: js.UndefOr[Float]
    var threshold: js.UndefOr[Float]
    var tpr: js.UndefOr[Float]
  }

  object MetricDataPoint {
    @inline
    def apply(
        fpr: js.UndefOr[Float] = js.undefined,
        precision: js.UndefOr[Float] = js.undefined,
        threshold: js.UndefOr[Float] = js.undefined,
        tpr: js.UndefOr[Float] = js.undefined
    ): MetricDataPoint = {
      val __obj = js.Dynamic.literal()
      fpr.foreach(__v => __obj.updateDynamic("fpr")(__v.asInstanceOf[js.Any]))
      precision.foreach(__v => __obj.updateDynamic("precision")(__v.asInstanceOf[js.Any]))
      threshold.foreach(__v => __obj.updateDynamic("threshold")(__v.asInstanceOf[js.Any]))
      tpr.foreach(__v => __obj.updateDynamic("tpr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDataPoint]
    }
  }

  /** The model.
    */
  @js.native
  trait Model extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var eventTypeName: js.UndefOr[String]
    var lastUpdatedTime: js.UndefOr[time]
    var modelId: js.UndefOr[modelIdentifier]
    var modelType: js.UndefOr[ModelTypeEnum]
  }

  object Model {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        eventTypeName: js.UndefOr[String] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        modelId: js.UndefOr[modelIdentifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined
    ): Model = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      eventTypeName.foreach(__v => __obj.updateDynamic("eventTypeName")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Model]
    }
  }

  /** A pre-formed Amazon SageMaker model input you can include if your detector version includes an imported Amazon SageMaker model endpoint with pass-through input configuration.
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

  /** The Amazon SageMaker model input configuration.
    */
  @js.native
  trait ModelInputConfiguration extends js.Object {
    var useEventVariables: UseEventVariables
    var csvInputTemplate: js.UndefOr[String]
    var eventTypeName: js.UndefOr[identifier]
    var format: js.UndefOr[ModelInputDataFormat]
    var jsonInputTemplate: js.UndefOr[String]
  }

  object ModelInputConfiguration {
    @inline
    def apply(
        useEventVariables: UseEventVariables,
        csvInputTemplate: js.UndefOr[String] = js.undefined,
        eventTypeName: js.UndefOr[identifier] = js.undefined,
        format: js.UndefOr[ModelInputDataFormat] = js.undefined,
        jsonInputTemplate: js.UndefOr[String] = js.undefined
    ): ModelInputConfiguration = {
      val __obj = js.Dynamic.literal(
        "useEventVariables" -> useEventVariables.asInstanceOf[js.Any]
      )

      csvInputTemplate.foreach(__v => __obj.updateDynamic("csvInputTemplate")(__v.asInstanceOf[js.Any]))
      eventTypeName.foreach(__v => __obj.updateDynamic("eventTypeName")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      jsonInputTemplate.foreach(__v => __obj.updateDynamic("jsonInputTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelInputConfiguration]
    }
  }

  /** Provides the Amazon Sagemaker model output configuration.
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

  /** The fraud prediction scores.
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

  /** The model version.
    */
  @js.native
  trait ModelVersion extends js.Object {
    var modelId: modelIdentifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: nonEmptyString
    var arn: js.UndefOr[fraudDetectorArn]
  }

  object ModelVersion {
    @inline
    def apply(
        modelId: modelIdentifier,
        modelType: ModelTypeEnum,
        modelVersionNumber: nonEmptyString,
        arn: js.UndefOr[fraudDetectorArn] = js.undefined
    ): ModelVersion = {
      val __obj = js.Dynamic.literal(
        "modelId" -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any],
        "modelVersionNumber" -> modelVersionNumber.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelVersion]
    }
  }

  /** The details of the model version.
    */
  @js.native
  trait ModelVersionDetail extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var externalEventsDetail: js.UndefOr[ExternalEventsDetail]
    var lastUpdatedTime: js.UndefOr[time]
    var modelId: js.UndefOr[modelIdentifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[floatVersionString]
    var status: js.UndefOr[String]
    var trainingDataSchema: js.UndefOr[TrainingDataSchema]
    var trainingDataSource: js.UndefOr[TrainingDataSourceEnum]
    var trainingResult: js.UndefOr[TrainingResult]
  }

  object ModelVersionDetail {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        modelId: js.UndefOr[modelIdentifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        modelVersionNumber: js.UndefOr[floatVersionString] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        trainingDataSchema: js.UndefOr[TrainingDataSchema] = js.undefined,
        trainingDataSource: js.UndefOr[TrainingDataSourceEnum] = js.undefined,
        trainingResult: js.UndefOr[TrainingResult] = js.undefined
    ): ModelVersionDetail = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      externalEventsDetail.foreach(__v => __obj.updateDynamic("externalEventsDetail")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      modelVersionNumber.foreach(__v => __obj.updateDynamic("modelVersionNumber")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      trainingDataSchema.foreach(__v => __obj.updateDynamic("trainingDataSchema")(__v.asInstanceOf[js.Any]))
      trainingDataSource.foreach(__v => __obj.updateDynamic("trainingDataSource")(__v.asInstanceOf[js.Any]))
      trainingResult.foreach(__v => __obj.updateDynamic("trainingResult")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelVersionDetail]
    }
  }

  /** The outcome.
    */
  @js.native
  trait Outcome extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var lastUpdatedTime: js.UndefOr[time]
    var name: js.UndefOr[identifier]
  }

  object Outcome {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        name: js.UndefOr[identifier] = js.undefined
    ): Outcome = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
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
    var eventTypeName: identifier
    var description: js.UndefOr[description]
    var tags: js.UndefOr[tagList]
  }

  object PutDetectorRequest {
    @inline
    def apply(
        detectorId: identifier,
        eventTypeName: identifier,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): PutDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "eventTypeName" -> eventTypeName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDetectorRequest]
    }
  }

  @js.native
  trait PutDetectorResult extends js.Object

  object PutDetectorResult {
    @inline
    def apply(): PutDetectorResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutDetectorResult]
    }
  }

  @js.native
  trait PutEntityTypeRequest extends js.Object {
    var name: identifier
    var description: js.UndefOr[description]
    var tags: js.UndefOr[tagList]
  }

  object PutEntityTypeRequest {
    @inline
    def apply(
        name: identifier,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): PutEntityTypeRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEntityTypeRequest]
    }
  }

  @js.native
  trait PutEntityTypeResult extends js.Object

  object PutEntityTypeResult {
    @inline
    def apply(): PutEntityTypeResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutEntityTypeResult]
    }
  }

  @js.native
  trait PutEventTypeRequest extends js.Object {
    var entityTypes: NonEmptyListOfStrings
    var eventVariables: NonEmptyListOfStrings
    var name: identifier
    var description: js.UndefOr[description]
    var labels: js.UndefOr[ListOfStrings]
    var tags: js.UndefOr[tagList]
  }

  object PutEventTypeRequest {
    @inline
    def apply(
        entityTypes: NonEmptyListOfStrings,
        eventVariables: NonEmptyListOfStrings,
        name: identifier,
        description: js.UndefOr[description] = js.undefined,
        labels: js.UndefOr[ListOfStrings] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): PutEventTypeRequest = {
      val __obj = js.Dynamic.literal(
        "entityTypes" -> entityTypes.asInstanceOf[js.Any],
        "eventVariables" -> eventVariables.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      labels.foreach(__v => __obj.updateDynamic("labels")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventTypeRequest]
    }
  }

  @js.native
  trait PutEventTypeResult extends js.Object

  object PutEventTypeResult {
    @inline
    def apply(): PutEventTypeResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutEventTypeResult]
    }
  }

  @js.native
  trait PutExternalModelRequest extends js.Object {
    var inputConfiguration: ModelInputConfiguration
    var invokeModelEndpointRoleArn: String
    var modelEndpoint: sageMakerEndpointIdentifier
    var modelEndpointStatus: ModelEndpointStatus
    var modelSource: ModelSource
    var outputConfiguration: ModelOutputConfiguration
    var tags: js.UndefOr[tagList]
  }

  object PutExternalModelRequest {
    @inline
    def apply(
        inputConfiguration: ModelInputConfiguration,
        invokeModelEndpointRoleArn: String,
        modelEndpoint: sageMakerEndpointIdentifier,
        modelEndpointStatus: ModelEndpointStatus,
        modelSource: ModelSource,
        outputConfiguration: ModelOutputConfiguration,
        tags: js.UndefOr[tagList] = js.undefined
    ): PutExternalModelRequest = {
      val __obj = js.Dynamic.literal(
        "inputConfiguration" -> inputConfiguration.asInstanceOf[js.Any],
        "invokeModelEndpointRoleArn" -> invokeModelEndpointRoleArn.asInstanceOf[js.Any],
        "modelEndpoint" -> modelEndpoint.asInstanceOf[js.Any],
        "modelEndpointStatus" -> modelEndpointStatus.asInstanceOf[js.Any],
        "modelSource" -> modelSource.asInstanceOf[js.Any],
        "outputConfiguration" -> outputConfiguration.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutExternalModelRequest]
    }
  }

  @js.native
  trait PutExternalModelResult extends js.Object

  object PutExternalModelResult {
    @inline
    def apply(): PutExternalModelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutExternalModelResult]
    }
  }

  @js.native
  trait PutKMSEncryptionKeyRequest extends js.Object {
    var kmsEncryptionKeyArn: KmsEncryptionKeyArn
  }

  object PutKMSEncryptionKeyRequest {
    @inline
    def apply(
        kmsEncryptionKeyArn: KmsEncryptionKeyArn
    ): PutKMSEncryptionKeyRequest = {
      val __obj = js.Dynamic.literal(
        "kmsEncryptionKeyArn" -> kmsEncryptionKeyArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutKMSEncryptionKeyRequest]
    }
  }

  @js.native
  trait PutKMSEncryptionKeyResult extends js.Object

  object PutKMSEncryptionKeyResult {
    @inline
    def apply(): PutKMSEncryptionKeyResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutKMSEncryptionKeyResult]
    }
  }

  @js.native
  trait PutLabelRequest extends js.Object {
    var name: identifier
    var description: js.UndefOr[description]
    var tags: js.UndefOr[tagList]
  }

  object PutLabelRequest {
    @inline
    def apply(
        name: identifier,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): PutLabelRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLabelRequest]
    }
  }

  @js.native
  trait PutLabelResult extends js.Object

  object PutLabelResult {
    @inline
    def apply(): PutLabelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutLabelResult]
    }
  }

  @js.native
  trait PutOutcomeRequest extends js.Object {
    var name: identifier
    var description: js.UndefOr[description]
    var tags: js.UndefOr[tagList]
  }

  object PutOutcomeRequest {
    @inline
    def apply(
        name: identifier,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): PutOutcomeRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutOutcomeRequest]
    }
  }

  @js.native
  trait PutOutcomeResult extends js.Object

  object PutOutcomeResult {
    @inline
    def apply(): PutOutcomeResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutOutcomeResult]
    }
  }

  /** A rule.
    */
  @js.native
  trait Rule extends js.Object {
    var detectorId: identifier
    var ruleId: identifier
    var ruleVersion: wholeNumberVersionString
  }

  object Rule {
    @inline
    def apply(
        detectorId: identifier,
        ruleId: identifier,
        ruleVersion: wholeNumberVersionString
    ): Rule = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "ruleId" -> ruleId.asInstanceOf[js.Any],
        "ruleVersion" -> ruleVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Rule]
    }
  }

  /** The details of the rule.
    */
  @js.native
  trait RuleDetail extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
    var createdTime: js.UndefOr[time]
    var description: js.UndefOr[description]
    var detectorId: js.UndefOr[identifier]
    var expression: js.UndefOr[ruleExpression]
    var language: js.UndefOr[Language]
    var lastUpdatedTime: js.UndefOr[time]
    var outcomes: js.UndefOr[NonEmptyListOfStrings]
    var ruleId: js.UndefOr[identifier]
    var ruleVersion: js.UndefOr[wholeNumberVersionString]
  }

  object RuleDetail {
    @inline
    def apply(
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
        createdTime: js.UndefOr[time] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        detectorId: js.UndefOr[identifier] = js.undefined,
        expression: js.UndefOr[ruleExpression] = js.undefined,
        language: js.UndefOr[Language] = js.undefined,
        lastUpdatedTime: js.UndefOr[time] = js.undefined,
        outcomes: js.UndefOr[NonEmptyListOfStrings] = js.undefined,
        ruleId: js.UndefOr[identifier] = js.undefined,
        ruleVersion: js.UndefOr[wholeNumberVersionString] = js.undefined
    ): RuleDetail = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
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

  /** The rule results.
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

  /** A key and value pair.
    */
  @js.native
  trait Tag extends js.Object {
    var key: tagKey
    var value: tagValue
  }

  object Tag {
    @inline
    def apply(
        key: tagKey,
        value: tagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceARN: fraudDetectorArn
    var tags: tagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceARN: fraudDetectorArn,
        tags: tagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceARN" -> resourceARN.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResult extends js.Object

  object TagResourceResult {
    @inline
    def apply(): TagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResult]
    }
  }

  /** The training data schema.
    */
  @js.native
  trait TrainingDataSchema extends js.Object {
    var labelSchema: LabelSchema
    var modelVariables: ListOfStrings
  }

  object TrainingDataSchema {
    @inline
    def apply(
        labelSchema: LabelSchema,
        modelVariables: ListOfStrings
    ): TrainingDataSchema = {
      val __obj = js.Dynamic.literal(
        "labelSchema" -> labelSchema.asInstanceOf[js.Any],
        "modelVariables" -> modelVariables.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrainingDataSchema]
    }
  }

  /** The training metric details.
    */
  @js.native
  trait TrainingMetrics extends js.Object {
    var auc: js.UndefOr[Float]
    var metricDataPoints: js.UndefOr[metricDataPointsList]
  }

  object TrainingMetrics {
    @inline
    def apply(
        auc: js.UndefOr[Float] = js.undefined,
        metricDataPoints: js.UndefOr[metricDataPointsList] = js.undefined
    ): TrainingMetrics = {
      val __obj = js.Dynamic.literal()
      auc.foreach(__v => __obj.updateDynamic("auc")(__v.asInstanceOf[js.Any]))
      metricDataPoints.foreach(__v => __obj.updateDynamic("metricDataPoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingMetrics]
    }
  }

  /** The training result details.
    */
  @js.native
  trait TrainingResult extends js.Object {
    var dataValidationMetrics: js.UndefOr[DataValidationMetrics]
    var trainingMetrics: js.UndefOr[TrainingMetrics]
  }

  object TrainingResult {
    @inline
    def apply(
        dataValidationMetrics: js.UndefOr[DataValidationMetrics] = js.undefined,
        trainingMetrics: js.UndefOr[TrainingMetrics] = js.undefined
    ): TrainingResult = {
      val __obj = js.Dynamic.literal()
      dataValidationMetrics.foreach(__v => __obj.updateDynamic("dataValidationMetrics")(__v.asInstanceOf[js.Any]))
      trainingMetrics.foreach(__v => __obj.updateDynamic("trainingMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrainingResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceARN: fraudDetectorArn
    var tagKeys: tagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceARN: fraudDetectorArn,
        tagKeys: tagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceARN" -> resourceARN.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResult extends js.Object

  object UntagResourceResult {
    @inline
    def apply(): UntagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResult]
    }
  }

  @js.native
  trait UpdateDetectorVersionMetadataRequest extends js.Object {
    var description: description
    var detectorId: identifier
    var detectorVersionId: wholeNumberVersionString
  }

  object UpdateDetectorVersionMetadataRequest {
    @inline
    def apply(
        description: description,
        detectorId: identifier,
        detectorVersionId: wholeNumberVersionString
    ): UpdateDetectorVersionMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "description" -> description.asInstanceOf[js.Any],
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId" -> detectorVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDetectorVersionMetadataRequest]
    }
  }

  @js.native
  trait UpdateDetectorVersionMetadataResult extends js.Object

  object UpdateDetectorVersionMetadataResult {
    @inline
    def apply(): UpdateDetectorVersionMetadataResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDetectorVersionMetadataResult]
    }
  }

  @js.native
  trait UpdateDetectorVersionRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: wholeNumberVersionString
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
        detectorVersionId: wholeNumberVersionString,
        externalModelEndpoints: ListOfStrings,
        rules: RuleList,
        description: js.UndefOr[description] = js.undefined,
        modelVersions: js.UndefOr[ListOfModelVersions] = js.undefined,
        ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.undefined
    ): UpdateDetectorVersionRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId" -> detectorVersionId.asInstanceOf[js.Any],
        "externalModelEndpoints" -> externalModelEndpoints.asInstanceOf[js.Any],
        "rules" -> rules.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      modelVersions.foreach(__v => __obj.updateDynamic("modelVersions")(__v.asInstanceOf[js.Any]))
      ruleExecutionMode.foreach(__v => __obj.updateDynamic("ruleExecutionMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDetectorVersionRequest]
    }
  }

  @js.native
  trait UpdateDetectorVersionResult extends js.Object

  object UpdateDetectorVersionResult {
    @inline
    def apply(): UpdateDetectorVersionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDetectorVersionResult]
    }
  }

  @js.native
  trait UpdateDetectorVersionStatusRequest extends js.Object {
    var detectorId: identifier
    var detectorVersionId: wholeNumberVersionString
    var status: DetectorVersionStatus
  }

  object UpdateDetectorVersionStatusRequest {
    @inline
    def apply(
        detectorId: identifier,
        detectorVersionId: wholeNumberVersionString,
        status: DetectorVersionStatus
    ): UpdateDetectorVersionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "detectorId" -> detectorId.asInstanceOf[js.Any],
        "detectorVersionId" -> detectorVersionId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDetectorVersionStatusRequest]
    }
  }

  @js.native
  trait UpdateDetectorVersionStatusResult extends js.Object

  object UpdateDetectorVersionStatusResult {
    @inline
    def apply(): UpdateDetectorVersionStatusResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDetectorVersionStatusResult]
    }
  }

  @js.native
  trait UpdateModelRequest extends js.Object {
    var modelId: modelIdentifier
    var modelType: ModelTypeEnum
    var description: js.UndefOr[description]
  }

  object UpdateModelRequest {
    @inline
    def apply(
        modelId: modelIdentifier,
        modelType: ModelTypeEnum,
        description: js.UndefOr[description] = js.undefined
    ): UpdateModelRequest = {
      val __obj = js.Dynamic.literal(
        "modelId" -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateModelRequest]
    }
  }

  @js.native
  trait UpdateModelResult extends js.Object

  object UpdateModelResult {
    @inline
    def apply(): UpdateModelResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateModelResult]
    }
  }

  @js.native
  trait UpdateModelVersionRequest extends js.Object {
    var majorVersionNumber: wholeNumberVersionString
    var modelId: modelIdentifier
    var modelType: ModelTypeEnum
    var externalEventsDetail: js.UndefOr[ExternalEventsDetail]
    var tags: js.UndefOr[tagList]
  }

  object UpdateModelVersionRequest {
    @inline
    def apply(
        majorVersionNumber: wholeNumberVersionString,
        modelId: modelIdentifier,
        modelType: ModelTypeEnum,
        externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): UpdateModelVersionRequest = {
      val __obj = js.Dynamic.literal(
        "majorVersionNumber" -> majorVersionNumber.asInstanceOf[js.Any],
        "modelId" -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any]
      )

      externalEventsDetail.foreach(__v => __obj.updateDynamic("externalEventsDetail")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateModelVersionRequest]
    }
  }

  @js.native
  trait UpdateModelVersionResult extends js.Object {
    var modelId: js.UndefOr[modelIdentifier]
    var modelType: js.UndefOr[ModelTypeEnum]
    var modelVersionNumber: js.UndefOr[floatVersionString]
    var status: js.UndefOr[String]
  }

  object UpdateModelVersionResult {
    @inline
    def apply(
        modelId: js.UndefOr[modelIdentifier] = js.undefined,
        modelType: js.UndefOr[ModelTypeEnum] = js.undefined,
        modelVersionNumber: js.UndefOr[floatVersionString] = js.undefined,
        status: js.UndefOr[String] = js.undefined
    ): UpdateModelVersionResult = {
      val __obj = js.Dynamic.literal()
      modelId.foreach(__v => __obj.updateDynamic("modelId")(__v.asInstanceOf[js.Any]))
      modelType.foreach(__v => __obj.updateDynamic("modelType")(__v.asInstanceOf[js.Any]))
      modelVersionNumber.foreach(__v => __obj.updateDynamic("modelVersionNumber")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateModelVersionResult]
    }
  }

  @js.native
  trait UpdateModelVersionStatusRequest extends js.Object {
    var modelId: modelIdentifier
    var modelType: ModelTypeEnum
    var modelVersionNumber: floatVersionString
    var status: ModelVersionStatus
  }

  object UpdateModelVersionStatusRequest {
    @inline
    def apply(
        modelId: modelIdentifier,
        modelType: ModelTypeEnum,
        modelVersionNumber: floatVersionString,
        status: ModelVersionStatus
    ): UpdateModelVersionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "modelId" -> modelId.asInstanceOf[js.Any],
        "modelType" -> modelType.asInstanceOf[js.Any],
        "modelVersionNumber" -> modelVersionNumber.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateModelVersionStatusRequest]
    }
  }

  @js.native
  trait UpdateModelVersionStatusResult extends js.Object

  object UpdateModelVersionStatusResult {
    @inline
    def apply(): UpdateModelVersionStatusResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateModelVersionStatusResult]
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
        "rule" -> rule.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRuleMetadataRequest]
    }
  }

  @js.native
  trait UpdateRuleMetadataResult extends js.Object

  object UpdateRuleMetadataResult {
    @inline
    def apply(): UpdateRuleMetadataResult = {
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
    var tags: js.UndefOr[tagList]
  }

  object UpdateRuleVersionRequest {
    @inline
    def apply(
        expression: ruleExpression,
        language: Language,
        outcomes: NonEmptyListOfStrings,
        rule: Rule,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[tagList] = js.undefined
    ): UpdateRuleVersionRequest = {
      val __obj = js.Dynamic.literal(
        "expression" -> expression.asInstanceOf[js.Any],
        "language" -> language.asInstanceOf[js.Any],
        "outcomes" -> outcomes.asInstanceOf[js.Any],
        "rule" -> rule.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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
  trait UpdateVariableResult extends js.Object

  object UpdateVariableResult {
    @inline
    def apply(): UpdateVariableResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateVariableResult]
    }
  }

  /** The variable.
    */
  @js.native
  trait Variable extends js.Object {
    var arn: js.UndefOr[fraudDetectorArn]
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
        arn: js.UndefOr[fraudDetectorArn] = js.undefined,
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
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
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

  /** A variable in the list of variables for the batch create variable request.
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
