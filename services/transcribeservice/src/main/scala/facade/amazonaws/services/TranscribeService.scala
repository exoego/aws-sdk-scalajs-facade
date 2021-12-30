package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object transcribeservice {
  type DataAccessRoleArn = String
  type DateTime = js.Date
  type FailureReason = String
  type IdentifiedLanguageScore = Float
  type KMSKeyId = String
  type LanguageOptions = js.Array[LanguageCode]
  type MaxAlternatives = Int
  type MaxResults = Int
  type MaxSpeakers = Int
  type MediaSampleRateHertz = Int
  type MedicalTranscriptionJobSummaries = js.Array[MedicalTranscriptionJobSummary]
  type ModelName = String
  type Models = js.Array[LanguageModel]
  type NextToken = String
  type OutputBucketName = String
  type OutputKey = String
  type Phrase = String
  type Phrases = js.Array[Phrase]
  type TranscriptionJobName = String
  type TranscriptionJobSummaries = js.Array[TranscriptionJobSummary]
  type Uri = String
  type Vocabularies = js.Array[VocabularyInfo]
  type VocabularyFilterName = String
  type VocabularyFilters = js.Array[VocabularyFilterInfo]
  type VocabularyName = String
  type Word = String
  type Words = js.Array[Word]

  final class TranscribeServiceOps(private val service: TranscribeService) extends AnyVal {

    @inline def createLanguageModelFuture(params: CreateLanguageModelRequest): Future[CreateLanguageModelResponse] = service.createLanguageModel(params).promise().toFuture
    @inline def createMedicalVocabularyFuture(params: CreateMedicalVocabularyRequest): Future[CreateMedicalVocabularyResponse] = service.createMedicalVocabulary(params).promise().toFuture
    @inline def createVocabularyFilterFuture(params: CreateVocabularyFilterRequest): Future[CreateVocabularyFilterResponse] = service.createVocabularyFilter(params).promise().toFuture
    @inline def createVocabularyFuture(params: CreateVocabularyRequest): Future[CreateVocabularyResponse] = service.createVocabulary(params).promise().toFuture
    @inline def deleteLanguageModelFuture(params: DeleteLanguageModelRequest): Future[js.Object] = service.deleteLanguageModel(params).promise().toFuture
    @inline def deleteMedicalTranscriptionJobFuture(params: DeleteMedicalTranscriptionJobRequest): Future[js.Object] = service.deleteMedicalTranscriptionJob(params).promise().toFuture
    @inline def deleteMedicalVocabularyFuture(params: DeleteMedicalVocabularyRequest): Future[js.Object] = service.deleteMedicalVocabulary(params).promise().toFuture
    @inline def deleteTranscriptionJobFuture(params: DeleteTranscriptionJobRequest): Future[js.Object] = service.deleteTranscriptionJob(params).promise().toFuture
    @inline def deleteVocabularyFilterFuture(params: DeleteVocabularyFilterRequest): Future[js.Object] = service.deleteVocabularyFilter(params).promise().toFuture
    @inline def deleteVocabularyFuture(params: DeleteVocabularyRequest): Future[js.Object] = service.deleteVocabulary(params).promise().toFuture
    @inline def describeLanguageModelFuture(params: DescribeLanguageModelRequest): Future[DescribeLanguageModelResponse] = service.describeLanguageModel(params).promise().toFuture
    @inline def getMedicalTranscriptionJobFuture(params: GetMedicalTranscriptionJobRequest): Future[GetMedicalTranscriptionJobResponse] = service.getMedicalTranscriptionJob(params).promise().toFuture
    @inline def getMedicalVocabularyFuture(params: GetMedicalVocabularyRequest): Future[GetMedicalVocabularyResponse] = service.getMedicalVocabulary(params).promise().toFuture
    @inline def getTranscriptionJobFuture(params: GetTranscriptionJobRequest): Future[GetTranscriptionJobResponse] = service.getTranscriptionJob(params).promise().toFuture
    @inline def getVocabularyFilterFuture(params: GetVocabularyFilterRequest): Future[GetVocabularyFilterResponse] = service.getVocabularyFilter(params).promise().toFuture
    @inline def getVocabularyFuture(params: GetVocabularyRequest): Future[GetVocabularyResponse] = service.getVocabulary(params).promise().toFuture
    @inline def listLanguageModelsFuture(params: ListLanguageModelsRequest): Future[ListLanguageModelsResponse] = service.listLanguageModels(params).promise().toFuture
    @inline def listMedicalTranscriptionJobsFuture(params: ListMedicalTranscriptionJobsRequest): Future[ListMedicalTranscriptionJobsResponse] = service.listMedicalTranscriptionJobs(params).promise().toFuture
    @inline def listMedicalVocabulariesFuture(params: ListMedicalVocabulariesRequest): Future[ListMedicalVocabulariesResponse] = service.listMedicalVocabularies(params).promise().toFuture
    @inline def listTranscriptionJobsFuture(params: ListTranscriptionJobsRequest): Future[ListTranscriptionJobsResponse] = service.listTranscriptionJobs(params).promise().toFuture
    @inline def listVocabulariesFuture(params: ListVocabulariesRequest): Future[ListVocabulariesResponse] = service.listVocabularies(params).promise().toFuture
    @inline def listVocabularyFiltersFuture(params: ListVocabularyFiltersRequest): Future[ListVocabularyFiltersResponse] = service.listVocabularyFilters(params).promise().toFuture
    @inline def startMedicalTranscriptionJobFuture(params: StartMedicalTranscriptionJobRequest): Future[StartMedicalTranscriptionJobResponse] = service.startMedicalTranscriptionJob(params).promise().toFuture
    @inline def startTranscriptionJobFuture(params: StartTranscriptionJobRequest): Future[StartTranscriptionJobResponse] = service.startTranscriptionJob(params).promise().toFuture
    @inline def updateMedicalVocabularyFuture(params: UpdateMedicalVocabularyRequest): Future[UpdateMedicalVocabularyResponse] = service.updateMedicalVocabulary(params).promise().toFuture
    @inline def updateVocabularyFilterFuture(params: UpdateVocabularyFilterRequest): Future[UpdateVocabularyFilterResponse] = service.updateVocabularyFilter(params).promise().toFuture
    @inline def updateVocabularyFuture(params: UpdateVocabularyRequest): Future[UpdateVocabularyResponse] = service.updateVocabulary(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/transcribeservice", JSImport.Namespace, "AWS.TranscribeService")
  class TranscribeService() extends js.Object {
    def this(config: AWSConfig) = this()

    def createLanguageModel(params: CreateLanguageModelRequest): Request[CreateLanguageModelResponse] = js.native
    def createMedicalVocabulary(params: CreateMedicalVocabularyRequest): Request[CreateMedicalVocabularyResponse] = js.native
    def createVocabulary(params: CreateVocabularyRequest): Request[CreateVocabularyResponse] = js.native
    def createVocabularyFilter(params: CreateVocabularyFilterRequest): Request[CreateVocabularyFilterResponse] = js.native
    def deleteLanguageModel(params: DeleteLanguageModelRequest): Request[js.Object] = js.native
    def deleteMedicalTranscriptionJob(params: DeleteMedicalTranscriptionJobRequest): Request[js.Object] = js.native
    def deleteMedicalVocabulary(params: DeleteMedicalVocabularyRequest): Request[js.Object] = js.native
    def deleteTranscriptionJob(params: DeleteTranscriptionJobRequest): Request[js.Object] = js.native
    def deleteVocabulary(params: DeleteVocabularyRequest): Request[js.Object] = js.native
    def deleteVocabularyFilter(params: DeleteVocabularyFilterRequest): Request[js.Object] = js.native
    def describeLanguageModel(params: DescribeLanguageModelRequest): Request[DescribeLanguageModelResponse] = js.native
    def getMedicalTranscriptionJob(params: GetMedicalTranscriptionJobRequest): Request[GetMedicalTranscriptionJobResponse] = js.native
    def getMedicalVocabulary(params: GetMedicalVocabularyRequest): Request[GetMedicalVocabularyResponse] = js.native
    def getTranscriptionJob(params: GetTranscriptionJobRequest): Request[GetTranscriptionJobResponse] = js.native
    def getVocabulary(params: GetVocabularyRequest): Request[GetVocabularyResponse] = js.native
    def getVocabularyFilter(params: GetVocabularyFilterRequest): Request[GetVocabularyFilterResponse] = js.native
    def listLanguageModels(params: ListLanguageModelsRequest): Request[ListLanguageModelsResponse] = js.native
    def listMedicalTranscriptionJobs(params: ListMedicalTranscriptionJobsRequest): Request[ListMedicalTranscriptionJobsResponse] = js.native
    def listMedicalVocabularies(params: ListMedicalVocabulariesRequest): Request[ListMedicalVocabulariesResponse] = js.native
    def listTranscriptionJobs(params: ListTranscriptionJobsRequest): Request[ListTranscriptionJobsResponse] = js.native
    def listVocabularies(params: ListVocabulariesRequest): Request[ListVocabulariesResponse] = js.native
    def listVocabularyFilters(params: ListVocabularyFiltersRequest): Request[ListVocabularyFiltersResponse] = js.native
    def startMedicalTranscriptionJob(params: StartMedicalTranscriptionJobRequest): Request[StartMedicalTranscriptionJobResponse] = js.native
    def startTranscriptionJob(params: StartTranscriptionJobRequest): Request[StartTranscriptionJobResponse] = js.native
    def updateMedicalVocabulary(params: UpdateMedicalVocabularyRequest): Request[UpdateMedicalVocabularyResponse] = js.native
    def updateVocabulary(params: UpdateVocabularyRequest): Request[UpdateVocabularyResponse] = js.native
    def updateVocabularyFilter(params: UpdateVocabularyFilterRequest): Request[UpdateVocabularyFilterResponse] = js.native
  }
  object TranscribeService {
    @inline implicit def toOps(service: TranscribeService): TranscribeServiceOps = {
      new TranscribeServiceOps(service)
    }
  }

  /** Settings for content redaction within a transcription job.
    */
  @js.native
  trait ContentRedaction extends js.Object {
    var RedactionOutput: RedactionOutput
    var RedactionType: RedactionType
  }

  object ContentRedaction {
    @inline
    def apply(
        RedactionOutput: RedactionOutput,
        RedactionType: RedactionType
    ): ContentRedaction = {
      val __obj = js.Dynamic.literal(
        "RedactionOutput" -> RedactionOutput.asInstanceOf[js.Any],
        "RedactionType" -> RedactionType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ContentRedaction]
    }
  }

  @js.native
  trait CreateLanguageModelRequest extends js.Object {
    var BaseModelName: BaseModelName
    var InputDataConfig: InputDataConfig
    var LanguageCode: CLMLanguageCode
    var ModelName: ModelName
  }

  object CreateLanguageModelRequest {
    @inline
    def apply(
        BaseModelName: BaseModelName,
        InputDataConfig: InputDataConfig,
        LanguageCode: CLMLanguageCode,
        ModelName: ModelName
    ): CreateLanguageModelRequest = {
      val __obj = js.Dynamic.literal(
        "BaseModelName" -> BaseModelName.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateLanguageModelRequest]
    }
  }

  @js.native
  trait CreateLanguageModelResponse extends js.Object {
    var BaseModelName: js.UndefOr[BaseModelName]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var LanguageCode: js.UndefOr[CLMLanguageCode]
    var ModelName: js.UndefOr[ModelName]
    var ModelStatus: js.UndefOr[ModelStatus]
  }

  object CreateLanguageModelResponse {
    @inline
    def apply(
        BaseModelName: js.UndefOr[BaseModelName] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        LanguageCode: js.UndefOr[CLMLanguageCode] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        ModelStatus: js.UndefOr[ModelStatus] = js.undefined
    ): CreateLanguageModelResponse = {
      val __obj = js.Dynamic.literal()
      BaseModelName.foreach(__v => __obj.updateDynamic("BaseModelName")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      ModelStatus.foreach(__v => __obj.updateDynamic("ModelStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLanguageModelResponse]
    }
  }

  @js.native
  trait CreateMedicalVocabularyRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyFileUri: Uri
    var VocabularyName: VocabularyName
  }

  object CreateMedicalVocabularyRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        VocabularyFileUri: Uri,
        VocabularyName: VocabularyName
    ): CreateMedicalVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "VocabularyFileUri" -> VocabularyFileUri.asInstanceOf[js.Any],
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateMedicalVocabularyRequest]
    }
  }

  @js.native
  trait CreateMedicalVocabularyResponse extends js.Object {
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object CreateMedicalVocabularyResponse {
    @inline
    def apply(
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): CreateMedicalVocabularyResponse = {
      val __obj = js.Dynamic.literal()
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.updateDynamic("VocabularyState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMedicalVocabularyResponse]
    }
  }

  @js.native
  trait CreateVocabularyFilterRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyFilterName: VocabularyFilterName
    var VocabularyFilterFileUri: js.UndefOr[Uri]
    var Words: js.UndefOr[Words]
  }

  object CreateVocabularyFilterRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        VocabularyFilterName: VocabularyFilterName,
        VocabularyFilterFileUri: js.UndefOr[Uri] = js.undefined,
        Words: js.UndefOr[Words] = js.undefined
    ): CreateVocabularyFilterRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "VocabularyFilterName" -> VocabularyFilterName.asInstanceOf[js.Any]
      )

      VocabularyFilterFileUri.foreach(__v => __obj.updateDynamic("VocabularyFilterFileUri")(__v.asInstanceOf[js.Any]))
      Words.foreach(__v => __obj.updateDynamic("Words")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVocabularyFilterRequest]
    }
  }

  @js.native
  trait CreateVocabularyFilterResponse extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyFilterName: js.UndefOr[VocabularyFilterName]
  }

  object CreateVocabularyFilterResponse {
    @inline
    def apply(
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyFilterName: js.UndefOr[VocabularyFilterName] = js.undefined
    ): CreateVocabularyFilterResponse = {
      val __obj = js.Dynamic.literal()
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyFilterName.foreach(__v => __obj.updateDynamic("VocabularyFilterName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVocabularyFilterResponse]
    }
  }

  @js.native
  trait CreateVocabularyRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyName: VocabularyName
    var Phrases: js.UndefOr[Phrases]
    var VocabularyFileUri: js.UndefOr[Uri]
  }

  object CreateVocabularyRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        VocabularyName: VocabularyName,
        Phrases: js.UndefOr[Phrases] = js.undefined,
        VocabularyFileUri: js.UndefOr[Uri] = js.undefined
    ): CreateVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )

      Phrases.foreach(__v => __obj.updateDynamic("Phrases")(__v.asInstanceOf[js.Any]))
      VocabularyFileUri.foreach(__v => __obj.updateDynamic("VocabularyFileUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVocabularyRequest]
    }
  }

  @js.native
  trait CreateVocabularyResponse extends js.Object {
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object CreateVocabularyResponse {
    @inline
    def apply(
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): CreateVocabularyResponse = {
      val __obj = js.Dynamic.literal()
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.updateDynamic("VocabularyState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVocabularyResponse]
    }
  }

  @js.native
  trait DeleteLanguageModelRequest extends js.Object {
    var ModelName: ModelName
  }

  object DeleteLanguageModelRequest {
    @inline
    def apply(
        ModelName: ModelName
    ): DeleteLanguageModelRequest = {
      val __obj = js.Dynamic.literal(
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLanguageModelRequest]
    }
  }

  @js.native
  trait DeleteMedicalTranscriptionJobRequest extends js.Object {
    var MedicalTranscriptionJobName: TranscriptionJobName
  }

  object DeleteMedicalTranscriptionJobRequest {
    @inline
    def apply(
        MedicalTranscriptionJobName: TranscriptionJobName
    ): DeleteMedicalTranscriptionJobRequest = {
      val __obj = js.Dynamic.literal(
        "MedicalTranscriptionJobName" -> MedicalTranscriptionJobName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMedicalTranscriptionJobRequest]
    }
  }

  @js.native
  trait DeleteMedicalVocabularyRequest extends js.Object {
    var VocabularyName: VocabularyName
  }

  object DeleteMedicalVocabularyRequest {
    @inline
    def apply(
        VocabularyName: VocabularyName
    ): DeleteMedicalVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMedicalVocabularyRequest]
    }
  }

  @js.native
  trait DeleteTranscriptionJobRequest extends js.Object {
    var TranscriptionJobName: TranscriptionJobName
  }

  object DeleteTranscriptionJobRequest {
    @inline
    def apply(
        TranscriptionJobName: TranscriptionJobName
    ): DeleteTranscriptionJobRequest = {
      val __obj = js.Dynamic.literal(
        "TranscriptionJobName" -> TranscriptionJobName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTranscriptionJobRequest]
    }
  }

  @js.native
  trait DeleteVocabularyFilterRequest extends js.Object {
    var VocabularyFilterName: VocabularyFilterName
  }

  object DeleteVocabularyFilterRequest {
    @inline
    def apply(
        VocabularyFilterName: VocabularyFilterName
    ): DeleteVocabularyFilterRequest = {
      val __obj = js.Dynamic.literal(
        "VocabularyFilterName" -> VocabularyFilterName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVocabularyFilterRequest]
    }
  }

  @js.native
  trait DeleteVocabularyRequest extends js.Object {
    var VocabularyName: VocabularyName
  }

  object DeleteVocabularyRequest {
    @inline
    def apply(
        VocabularyName: VocabularyName
    ): DeleteVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVocabularyRequest]
    }
  }

  @js.native
  trait DescribeLanguageModelRequest extends js.Object {
    var ModelName: ModelName
  }

  object DescribeLanguageModelRequest {
    @inline
    def apply(
        ModelName: ModelName
    ): DescribeLanguageModelRequest = {
      val __obj = js.Dynamic.literal(
        "ModelName" -> ModelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLanguageModelRequest]
    }
  }

  @js.native
  trait DescribeLanguageModelResponse extends js.Object {
    var LanguageModel: js.UndefOr[LanguageModel]
  }

  object DescribeLanguageModelResponse {
    @inline
    def apply(
        LanguageModel: js.UndefOr[LanguageModel] = js.undefined
    ): DescribeLanguageModelResponse = {
      val __obj = js.Dynamic.literal()
      LanguageModel.foreach(__v => __obj.updateDynamic("LanguageModel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLanguageModelResponse]
    }
  }

  @js.native
  trait GetMedicalTranscriptionJobRequest extends js.Object {
    var MedicalTranscriptionJobName: TranscriptionJobName
  }

  object GetMedicalTranscriptionJobRequest {
    @inline
    def apply(
        MedicalTranscriptionJobName: TranscriptionJobName
    ): GetMedicalTranscriptionJobRequest = {
      val __obj = js.Dynamic.literal(
        "MedicalTranscriptionJobName" -> MedicalTranscriptionJobName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMedicalTranscriptionJobRequest]
    }
  }

  @js.native
  trait GetMedicalTranscriptionJobResponse extends js.Object {
    var MedicalTranscriptionJob: js.UndefOr[MedicalTranscriptionJob]
  }

  object GetMedicalTranscriptionJobResponse {
    @inline
    def apply(
        MedicalTranscriptionJob: js.UndefOr[MedicalTranscriptionJob] = js.undefined
    ): GetMedicalTranscriptionJobResponse = {
      val __obj = js.Dynamic.literal()
      MedicalTranscriptionJob.foreach(__v => __obj.updateDynamic("MedicalTranscriptionJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMedicalTranscriptionJobResponse]
    }
  }

  @js.native
  trait GetMedicalVocabularyRequest extends js.Object {
    var VocabularyName: VocabularyName
  }

  object GetMedicalVocabularyRequest {
    @inline
    def apply(
        VocabularyName: VocabularyName
    ): GetMedicalVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMedicalVocabularyRequest]
    }
  }

  @js.native
  trait GetMedicalVocabularyResponse extends js.Object {
    var DownloadUri: js.UndefOr[Uri]
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object GetMedicalVocabularyResponse {
    @inline
    def apply(
        DownloadUri: js.UndefOr[Uri] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): GetMedicalVocabularyResponse = {
      val __obj = js.Dynamic.literal()
      DownloadUri.foreach(__v => __obj.updateDynamic("DownloadUri")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.updateDynamic("VocabularyState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMedicalVocabularyResponse]
    }
  }

  @js.native
  trait GetTranscriptionJobRequest extends js.Object {
    var TranscriptionJobName: TranscriptionJobName
  }

  object GetTranscriptionJobRequest {
    @inline
    def apply(
        TranscriptionJobName: TranscriptionJobName
    ): GetTranscriptionJobRequest = {
      val __obj = js.Dynamic.literal(
        "TranscriptionJobName" -> TranscriptionJobName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTranscriptionJobRequest]
    }
  }

  @js.native
  trait GetTranscriptionJobResponse extends js.Object {
    var TranscriptionJob: js.UndefOr[TranscriptionJob]
  }

  object GetTranscriptionJobResponse {
    @inline
    def apply(
        TranscriptionJob: js.UndefOr[TranscriptionJob] = js.undefined
    ): GetTranscriptionJobResponse = {
      val __obj = js.Dynamic.literal()
      TranscriptionJob.foreach(__v => __obj.updateDynamic("TranscriptionJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTranscriptionJobResponse]
    }
  }

  @js.native
  trait GetVocabularyFilterRequest extends js.Object {
    var VocabularyFilterName: VocabularyFilterName
  }

  object GetVocabularyFilterRequest {
    @inline
    def apply(
        VocabularyFilterName: VocabularyFilterName
    ): GetVocabularyFilterRequest = {
      val __obj = js.Dynamic.literal(
        "VocabularyFilterName" -> VocabularyFilterName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVocabularyFilterRequest]
    }
  }

  @js.native
  trait GetVocabularyFilterResponse extends js.Object {
    var DownloadUri: js.UndefOr[Uri]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyFilterName: js.UndefOr[VocabularyFilterName]
  }

  object GetVocabularyFilterResponse {
    @inline
    def apply(
        DownloadUri: js.UndefOr[Uri] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyFilterName: js.UndefOr[VocabularyFilterName] = js.undefined
    ): GetVocabularyFilterResponse = {
      val __obj = js.Dynamic.literal()
      DownloadUri.foreach(__v => __obj.updateDynamic("DownloadUri")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyFilterName.foreach(__v => __obj.updateDynamic("VocabularyFilterName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVocabularyFilterResponse]
    }
  }

  @js.native
  trait GetVocabularyRequest extends js.Object {
    var VocabularyName: VocabularyName
  }

  object GetVocabularyRequest {
    @inline
    def apply(
        VocabularyName: VocabularyName
    ): GetVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVocabularyRequest]
    }
  }

  @js.native
  trait GetVocabularyResponse extends js.Object {
    var DownloadUri: js.UndefOr[Uri]
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object GetVocabularyResponse {
    @inline
    def apply(
        DownloadUri: js.UndefOr[Uri] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): GetVocabularyResponse = {
      val __obj = js.Dynamic.literal()
      DownloadUri.foreach(__v => __obj.updateDynamic("DownloadUri")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.updateDynamic("VocabularyState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVocabularyResponse]
    }
  }

  /** The object that contains the Amazon S3 object location and access role required to train and tune your custom language model.
    */
  @js.native
  trait InputDataConfig extends js.Object {
    var DataAccessRoleArn: DataAccessRoleArn
    var S3Uri: Uri
    var TuningDataS3Uri: js.UndefOr[Uri]
  }

  object InputDataConfig {
    @inline
    def apply(
        DataAccessRoleArn: DataAccessRoleArn,
        S3Uri: Uri,
        TuningDataS3Uri: js.UndefOr[Uri] = js.undefined
    ): InputDataConfig = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      TuningDataS3Uri.foreach(__v => __obj.updateDynamic("TuningDataS3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDataConfig]
    }
  }

  /** Provides information about when a transcription job should be executed.
    */
  @js.native
  trait JobExecutionSettings extends js.Object {
    var AllowDeferredExecution: js.UndefOr[Boolean]
    var DataAccessRoleArn: js.UndefOr[DataAccessRoleArn]
  }

  object JobExecutionSettings {
    @inline
    def apply(
        AllowDeferredExecution: js.UndefOr[Boolean] = js.undefined,
        DataAccessRoleArn: js.UndefOr[DataAccessRoleArn] = js.undefined
    ): JobExecutionSettings = {
      val __obj = js.Dynamic.literal()
      AllowDeferredExecution.foreach(__v => __obj.updateDynamic("AllowDeferredExecution")(__v.asInstanceOf[js.Any]))
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecutionSettings]
    }
  }

  /** The structure used to describe a custom language model.
    */
  @js.native
  trait LanguageModel extends js.Object {
    var BaseModelName: js.UndefOr[BaseModelName]
    var CreateTime: js.UndefOr[DateTime]
    var FailureReason: js.UndefOr[FailureReason]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var LanguageCode: js.UndefOr[CLMLanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var ModelName: js.UndefOr[ModelName]
    var ModelStatus: js.UndefOr[ModelStatus]
    var UpgradeAvailability: js.UndefOr[Boolean]
  }

  object LanguageModel {
    @inline
    def apply(
        BaseModelName: js.UndefOr[BaseModelName] = js.undefined,
        CreateTime: js.UndefOr[DateTime] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        LanguageCode: js.UndefOr[CLMLanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        ModelName: js.UndefOr[ModelName] = js.undefined,
        ModelStatus: js.UndefOr[ModelStatus] = js.undefined,
        UpgradeAvailability: js.UndefOr[Boolean] = js.undefined
    ): LanguageModel = {
      val __obj = js.Dynamic.literal()
      BaseModelName.foreach(__v => __obj.updateDynamic("BaseModelName")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ModelName.foreach(__v => __obj.updateDynamic("ModelName")(__v.asInstanceOf[js.Any]))
      ModelStatus.foreach(__v => __obj.updateDynamic("ModelStatus")(__v.asInstanceOf[js.Any]))
      UpgradeAvailability.foreach(__v => __obj.updateDynamic("UpgradeAvailability")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LanguageModel]
    }
  }

  @js.native
  trait ListLanguageModelsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[ModelName]
    var NextToken: js.UndefOr[NextToken]
    var StatusEquals: js.UndefOr[ModelStatus]
  }

  object ListLanguageModelsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[ModelName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StatusEquals: js.UndefOr[ModelStatus] = js.undefined
    ): ListLanguageModelsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusEquals.foreach(__v => __obj.updateDynamic("StatusEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLanguageModelsRequest]
    }
  }

  @js.native
  trait ListLanguageModelsResponse extends js.Object {
    var Models: js.UndefOr[Models]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLanguageModelsResponse {
    @inline
    def apply(
        Models: js.UndefOr[Models] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLanguageModelsResponse = {
      val __obj = js.Dynamic.literal()
      Models.foreach(__v => __obj.updateDynamic("Models")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLanguageModelsResponse]
    }
  }

  @js.native
  trait ListMedicalTranscriptionJobsRequest extends js.Object {
    var JobNameContains: js.UndefOr[TranscriptionJobName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
  }

  object ListMedicalTranscriptionJobsRequest {
    @inline
    def apply(
        JobNameContains: js.UndefOr[TranscriptionJobName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
    ): ListMedicalTranscriptionJobsRequest = {
      val __obj = js.Dynamic.literal()
      JobNameContains.foreach(__v => __obj.updateDynamic("JobNameContains")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMedicalTranscriptionJobsRequest]
    }
  }

  @js.native
  trait ListMedicalTranscriptionJobsResponse extends js.Object {
    var MedicalTranscriptionJobSummaries: js.UndefOr[MedicalTranscriptionJobSummaries]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
  }

  object ListMedicalTranscriptionJobsResponse {
    @inline
    def apply(
        MedicalTranscriptionJobSummaries: js.UndefOr[MedicalTranscriptionJobSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
    ): ListMedicalTranscriptionJobsResponse = {
      val __obj = js.Dynamic.literal()
      MedicalTranscriptionJobSummaries.foreach(__v => __obj.updateDynamic("MedicalTranscriptionJobSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMedicalTranscriptionJobsResponse]
    }
  }

  @js.native
  trait ListMedicalVocabulariesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[VocabularyName]
    var NextToken: js.UndefOr[NextToken]
    var StateEquals: js.UndefOr[VocabularyState]
  }

  object ListMedicalVocabulariesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[VocabularyName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StateEquals: js.UndefOr[VocabularyState] = js.undefined
    ): ListMedicalVocabulariesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StateEquals.foreach(__v => __obj.updateDynamic("StateEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMedicalVocabulariesRequest]
    }
  }

  @js.native
  trait ListMedicalVocabulariesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[VocabularyState]
    var Vocabularies: js.UndefOr[Vocabularies]
  }

  object ListMedicalVocabulariesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[VocabularyState] = js.undefined,
        Vocabularies: js.UndefOr[Vocabularies] = js.undefined
    ): ListMedicalVocabulariesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Vocabularies.foreach(__v => __obj.updateDynamic("Vocabularies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMedicalVocabulariesResponse]
    }
  }

  @js.native
  trait ListTranscriptionJobsRequest extends js.Object {
    var JobNameContains: js.UndefOr[TranscriptionJobName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
  }

  object ListTranscriptionJobsRequest {
    @inline
    def apply(
        JobNameContains: js.UndefOr[TranscriptionJobName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
    ): ListTranscriptionJobsRequest = {
      val __obj = js.Dynamic.literal()
      JobNameContains.foreach(__v => __obj.updateDynamic("JobNameContains")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTranscriptionJobsRequest]
    }
  }

  @js.native
  trait ListTranscriptionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
    var TranscriptionJobSummaries: js.UndefOr[TranscriptionJobSummaries]
  }

  object ListTranscriptionJobsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[TranscriptionJobStatus] = js.undefined,
        TranscriptionJobSummaries: js.UndefOr[TranscriptionJobSummaries] = js.undefined
    ): ListTranscriptionJobsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TranscriptionJobSummaries.foreach(__v => __obj.updateDynamic("TranscriptionJobSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTranscriptionJobsResponse]
    }
  }

  @js.native
  trait ListVocabulariesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[VocabularyName]
    var NextToken: js.UndefOr[NextToken]
    var StateEquals: js.UndefOr[VocabularyState]
  }

  object ListVocabulariesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[VocabularyName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StateEquals: js.UndefOr[VocabularyState] = js.undefined
    ): ListVocabulariesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StateEquals.foreach(__v => __obj.updateDynamic("StateEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVocabulariesRequest]
    }
  }

  @js.native
  trait ListVocabulariesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[VocabularyState]
    var Vocabularies: js.UndefOr[Vocabularies]
  }

  object ListVocabulariesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[VocabularyState] = js.undefined,
        Vocabularies: js.UndefOr[Vocabularies] = js.undefined
    ): ListVocabulariesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Vocabularies.foreach(__v => __obj.updateDynamic("Vocabularies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVocabulariesResponse]
    }
  }

  @js.native
  trait ListVocabularyFiltersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[VocabularyFilterName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListVocabularyFiltersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NameContains: js.UndefOr[VocabularyFilterName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListVocabularyFiltersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NameContains.foreach(__v => __obj.updateDynamic("NameContains")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVocabularyFiltersRequest]
    }
  }

  @js.native
  trait ListVocabularyFiltersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var VocabularyFilters: js.UndefOr[VocabularyFilters]
  }

  object ListVocabularyFiltersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        VocabularyFilters: js.UndefOr[VocabularyFilters] = js.undefined
    ): ListVocabularyFiltersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VocabularyFilters.foreach(__v => __obj.updateDynamic("VocabularyFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVocabularyFiltersResponse]
    }
  }

  /** Describes the input media file in a transcription request.
    */
  @js.native
  trait Media extends js.Object {
    var MediaFileUri: js.UndefOr[Uri]
  }

  object Media {
    @inline
    def apply(
        MediaFileUri: js.UndefOr[Uri] = js.undefined
    ): Media = {
      val __obj = js.Dynamic.literal()
      MediaFileUri.foreach(__v => __obj.updateDynamic("MediaFileUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Media]
    }
  }

  /** Identifies the location of a medical transcript.
    */
  @js.native
  trait MedicalTranscript extends js.Object {
    var TranscriptFileUri: js.UndefOr[Uri]
  }

  object MedicalTranscript {
    @inline
    def apply(
        TranscriptFileUri: js.UndefOr[Uri] = js.undefined
    ): MedicalTranscript = {
      val __obj = js.Dynamic.literal()
      TranscriptFileUri.foreach(__v => __obj.updateDynamic("TranscriptFileUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MedicalTranscript]
    }
  }

  /** The data structure that contains the information for a medical transcription job.
    */
  @js.native
  trait MedicalTranscriptionJob extends js.Object {
    var CompletionTime: js.UndefOr[DateTime]
    var CreationTime: js.UndefOr[DateTime]
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Media: js.UndefOr[Media]
    var MediaFormat: js.UndefOr[MediaFormat]
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz]
    var MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName]
    var Settings: js.UndefOr[MedicalTranscriptionSetting]
    var Specialty: js.UndefOr[Specialty]
    var StartTime: js.UndefOr[DateTime]
    var Transcript: js.UndefOr[MedicalTranscript]
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus]
    var Type: js.UndefOr[Type]
  }

  object MedicalTranscriptionJob {
    @inline
    def apply(
        CompletionTime: js.UndefOr[DateTime] = js.undefined,
        CreationTime: js.UndefOr[DateTime] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Media: js.UndefOr[Media] = js.undefined,
        MediaFormat: js.UndefOr[MediaFormat] = js.undefined,
        MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined,
        MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined,
        Settings: js.UndefOr[MedicalTranscriptionSetting] = js.undefined,
        Specialty: js.UndefOr[Specialty] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        Transcript: js.UndefOr[MedicalTranscript] = js.undefined,
        TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): MedicalTranscriptionJob = {
      val __obj = js.Dynamic.literal()
      CompletionTime.foreach(__v => __obj.updateDynamic("CompletionTime")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Media.foreach(__v => __obj.updateDynamic("Media")(__v.asInstanceOf[js.Any]))
      MediaFormat.foreach(__v => __obj.updateDynamic("MediaFormat")(__v.asInstanceOf[js.Any]))
      MediaSampleRateHertz.foreach(__v => __obj.updateDynamic("MediaSampleRateHertz")(__v.asInstanceOf[js.Any]))
      MedicalTranscriptionJobName.foreach(__v => __obj.updateDynamic("MedicalTranscriptionJobName")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      Specialty.foreach(__v => __obj.updateDynamic("Specialty")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Transcript.foreach(__v => __obj.updateDynamic("Transcript")(__v.asInstanceOf[js.Any]))
      TranscriptionJobStatus.foreach(__v => __obj.updateDynamic("TranscriptionJobStatus")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MedicalTranscriptionJob]
    }
  }

  /** Provides summary information about a transcription job.
    */
  @js.native
  trait MedicalTranscriptionJobSummary extends js.Object {
    var CompletionTime: js.UndefOr[DateTime]
    var CreationTime: js.UndefOr[DateTime]
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName]
    var OutputLocationType: js.UndefOr[OutputLocationType]
    var Specialty: js.UndefOr[Specialty]
    var StartTime: js.UndefOr[DateTime]
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus]
    var Type: js.UndefOr[Type]
  }

  object MedicalTranscriptionJobSummary {
    @inline
    def apply(
        CompletionTime: js.UndefOr[DateTime] = js.undefined,
        CreationTime: js.UndefOr[DateTime] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined,
        OutputLocationType: js.UndefOr[OutputLocationType] = js.undefined,
        Specialty: js.UndefOr[Specialty] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): MedicalTranscriptionJobSummary = {
      val __obj = js.Dynamic.literal()
      CompletionTime.foreach(__v => __obj.updateDynamic("CompletionTime")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      MedicalTranscriptionJobName.foreach(__v => __obj.updateDynamic("MedicalTranscriptionJobName")(__v.asInstanceOf[js.Any]))
      OutputLocationType.foreach(__v => __obj.updateDynamic("OutputLocationType")(__v.asInstanceOf[js.Any]))
      Specialty.foreach(__v => __obj.updateDynamic("Specialty")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      TranscriptionJobStatus.foreach(__v => __obj.updateDynamic("TranscriptionJobStatus")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MedicalTranscriptionJobSummary]
    }
  }

  /** Optional settings for the <a>StartMedicalTranscriptionJob</a> operation.
    */
  @js.native
  trait MedicalTranscriptionSetting extends js.Object {
    var ChannelIdentification: js.UndefOr[Boolean]
    var MaxAlternatives: js.UndefOr[MaxAlternatives]
    var MaxSpeakerLabels: js.UndefOr[MaxSpeakers]
    var ShowAlternatives: js.UndefOr[Boolean]
    var ShowSpeakerLabels: js.UndefOr[Boolean]
    var VocabularyName: js.UndefOr[VocabularyName]
  }

  object MedicalTranscriptionSetting {
    @inline
    def apply(
        ChannelIdentification: js.UndefOr[Boolean] = js.undefined,
        MaxAlternatives: js.UndefOr[MaxAlternatives] = js.undefined,
        MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.undefined,
        ShowAlternatives: js.UndefOr[Boolean] = js.undefined,
        ShowSpeakerLabels: js.UndefOr[Boolean] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined
    ): MedicalTranscriptionSetting = {
      val __obj = js.Dynamic.literal()
      ChannelIdentification.foreach(__v => __obj.updateDynamic("ChannelIdentification")(__v.asInstanceOf[js.Any]))
      MaxAlternatives.foreach(__v => __obj.updateDynamic("MaxAlternatives")(__v.asInstanceOf[js.Any]))
      MaxSpeakerLabels.foreach(__v => __obj.updateDynamic("MaxSpeakerLabels")(__v.asInstanceOf[js.Any]))
      ShowAlternatives.foreach(__v => __obj.updateDynamic("ShowAlternatives")(__v.asInstanceOf[js.Any]))
      ShowSpeakerLabels.foreach(__v => __obj.updateDynamic("ShowSpeakerLabels")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MedicalTranscriptionSetting]
    }
  }

  /** The object used to call your custom language model to your transcription job.
    */
  @js.native
  trait ModelSettings extends js.Object {
    var LanguageModelName: js.UndefOr[ModelName]
  }

  object ModelSettings {
    @inline
    def apply(
        LanguageModelName: js.UndefOr[ModelName] = js.undefined
    ): ModelSettings = {
      val __obj = js.Dynamic.literal()
      LanguageModelName.foreach(__v => __obj.updateDynamic("LanguageModelName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelSettings]
    }
  }

  /** Provides optional settings for the <code>StartTranscriptionJob</code> operation.
    */
  @js.native
  trait Settings extends js.Object {
    var ChannelIdentification: js.UndefOr[Boolean]
    var MaxAlternatives: js.UndefOr[MaxAlternatives]
    var MaxSpeakerLabels: js.UndefOr[MaxSpeakers]
    var ShowAlternatives: js.UndefOr[Boolean]
    var ShowSpeakerLabels: js.UndefOr[Boolean]
    var VocabularyFilterMethod: js.UndefOr[VocabularyFilterMethod]
    var VocabularyFilterName: js.UndefOr[VocabularyFilterName]
    var VocabularyName: js.UndefOr[VocabularyName]
  }

  object Settings {
    @inline
    def apply(
        ChannelIdentification: js.UndefOr[Boolean] = js.undefined,
        MaxAlternatives: js.UndefOr[MaxAlternatives] = js.undefined,
        MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.undefined,
        ShowAlternatives: js.UndefOr[Boolean] = js.undefined,
        ShowSpeakerLabels: js.UndefOr[Boolean] = js.undefined,
        VocabularyFilterMethod: js.UndefOr[VocabularyFilterMethod] = js.undefined,
        VocabularyFilterName: js.UndefOr[VocabularyFilterName] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined
    ): Settings = {
      val __obj = js.Dynamic.literal()
      ChannelIdentification.foreach(__v => __obj.updateDynamic("ChannelIdentification")(__v.asInstanceOf[js.Any]))
      MaxAlternatives.foreach(__v => __obj.updateDynamic("MaxAlternatives")(__v.asInstanceOf[js.Any]))
      MaxSpeakerLabels.foreach(__v => __obj.updateDynamic("MaxSpeakerLabels")(__v.asInstanceOf[js.Any]))
      ShowAlternatives.foreach(__v => __obj.updateDynamic("ShowAlternatives")(__v.asInstanceOf[js.Any]))
      ShowSpeakerLabels.foreach(__v => __obj.updateDynamic("ShowSpeakerLabels")(__v.asInstanceOf[js.Any]))
      VocabularyFilterMethod.foreach(__v => __obj.updateDynamic("VocabularyFilterMethod")(__v.asInstanceOf[js.Any]))
      VocabularyFilterName.foreach(__v => __obj.updateDynamic("VocabularyFilterName")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Settings]
    }
  }

  @js.native
  trait StartMedicalTranscriptionJobRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Media: Media
    var MedicalTranscriptionJobName: TranscriptionJobName
    var OutputBucketName: OutputBucketName
    var Specialty: Specialty
    var Type: Type
    var MediaFormat: js.UndefOr[MediaFormat]
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz]
    var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId]
    var OutputKey: js.UndefOr[OutputKey]
    var Settings: js.UndefOr[MedicalTranscriptionSetting]
  }

  object StartMedicalTranscriptionJobRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        Media: Media,
        MedicalTranscriptionJobName: TranscriptionJobName,
        OutputBucketName: OutputBucketName,
        Specialty: Specialty,
        Type: Type,
        MediaFormat: js.UndefOr[MediaFormat] = js.undefined,
        MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined,
        OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.undefined,
        OutputKey: js.UndefOr[OutputKey] = js.undefined,
        Settings: js.UndefOr[MedicalTranscriptionSetting] = js.undefined
    ): StartMedicalTranscriptionJobRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Media" -> Media.asInstanceOf[js.Any],
        "MedicalTranscriptionJobName" -> MedicalTranscriptionJobName.asInstanceOf[js.Any],
        "OutputBucketName" -> OutputBucketName.asInstanceOf[js.Any],
        "Specialty" -> Specialty.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      MediaFormat.foreach(__v => __obj.updateDynamic("MediaFormat")(__v.asInstanceOf[js.Any]))
      MediaSampleRateHertz.foreach(__v => __obj.updateDynamic("MediaSampleRateHertz")(__v.asInstanceOf[js.Any]))
      OutputEncryptionKMSKeyId.foreach(__v => __obj.updateDynamic("OutputEncryptionKMSKeyId")(__v.asInstanceOf[js.Any]))
      OutputKey.foreach(__v => __obj.updateDynamic("OutputKey")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMedicalTranscriptionJobRequest]
    }
  }

  @js.native
  trait StartMedicalTranscriptionJobResponse extends js.Object {
    var MedicalTranscriptionJob: js.UndefOr[MedicalTranscriptionJob]
  }

  object StartMedicalTranscriptionJobResponse {
    @inline
    def apply(
        MedicalTranscriptionJob: js.UndefOr[MedicalTranscriptionJob] = js.undefined
    ): StartMedicalTranscriptionJobResponse = {
      val __obj = js.Dynamic.literal()
      MedicalTranscriptionJob.foreach(__v => __obj.updateDynamic("MedicalTranscriptionJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMedicalTranscriptionJobResponse]
    }
  }

  @js.native
  trait StartTranscriptionJobRequest extends js.Object {
    var Media: Media
    var TranscriptionJobName: TranscriptionJobName
    var ContentRedaction: js.UndefOr[ContentRedaction]
    var IdentifyLanguage: js.UndefOr[Boolean]
    var JobExecutionSettings: js.UndefOr[JobExecutionSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageOptions: js.UndefOr[LanguageOptions]
    var MediaFormat: js.UndefOr[MediaFormat]
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz]
    var ModelSettings: js.UndefOr[ModelSettings]
    var OutputBucketName: js.UndefOr[OutputBucketName]
    var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId]
    var OutputKey: js.UndefOr[OutputKey]
    var Settings: js.UndefOr[Settings]
  }

  object StartTranscriptionJobRequest {
    @inline
    def apply(
        Media: Media,
        TranscriptionJobName: TranscriptionJobName,
        ContentRedaction: js.UndefOr[ContentRedaction] = js.undefined,
        IdentifyLanguage: js.UndefOr[Boolean] = js.undefined,
        JobExecutionSettings: js.UndefOr[JobExecutionSettings] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageOptions: js.UndefOr[LanguageOptions] = js.undefined,
        MediaFormat: js.UndefOr[MediaFormat] = js.undefined,
        MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined,
        ModelSettings: js.UndefOr[ModelSettings] = js.undefined,
        OutputBucketName: js.UndefOr[OutputBucketName] = js.undefined,
        OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.undefined,
        OutputKey: js.UndefOr[OutputKey] = js.undefined,
        Settings: js.UndefOr[Settings] = js.undefined
    ): StartTranscriptionJobRequest = {
      val __obj = js.Dynamic.literal(
        "Media" -> Media.asInstanceOf[js.Any],
        "TranscriptionJobName" -> TranscriptionJobName.asInstanceOf[js.Any]
      )

      ContentRedaction.foreach(__v => __obj.updateDynamic("ContentRedaction")(__v.asInstanceOf[js.Any]))
      IdentifyLanguage.foreach(__v => __obj.updateDynamic("IdentifyLanguage")(__v.asInstanceOf[js.Any]))
      JobExecutionSettings.foreach(__v => __obj.updateDynamic("JobExecutionSettings")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageOptions.foreach(__v => __obj.updateDynamic("LanguageOptions")(__v.asInstanceOf[js.Any]))
      MediaFormat.foreach(__v => __obj.updateDynamic("MediaFormat")(__v.asInstanceOf[js.Any]))
      MediaSampleRateHertz.foreach(__v => __obj.updateDynamic("MediaSampleRateHertz")(__v.asInstanceOf[js.Any]))
      ModelSettings.foreach(__v => __obj.updateDynamic("ModelSettings")(__v.asInstanceOf[js.Any]))
      OutputBucketName.foreach(__v => __obj.updateDynamic("OutputBucketName")(__v.asInstanceOf[js.Any]))
      OutputEncryptionKMSKeyId.foreach(__v => __obj.updateDynamic("OutputEncryptionKMSKeyId")(__v.asInstanceOf[js.Any]))
      OutputKey.foreach(__v => __obj.updateDynamic("OutputKey")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTranscriptionJobRequest]
    }
  }

  @js.native
  trait StartTranscriptionJobResponse extends js.Object {
    var TranscriptionJob: js.UndefOr[TranscriptionJob]
  }

  object StartTranscriptionJobResponse {
    @inline
    def apply(
        TranscriptionJob: js.UndefOr[TranscriptionJob] = js.undefined
    ): StartTranscriptionJobResponse = {
      val __obj = js.Dynamic.literal()
      TranscriptionJob.foreach(__v => __obj.updateDynamic("TranscriptionJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTranscriptionJobResponse]
    }
  }

  /** Identifies the location of a transcription.
    */
  @js.native
  trait Transcript extends js.Object {
    var RedactedTranscriptFileUri: js.UndefOr[Uri]
    var TranscriptFileUri: js.UndefOr[Uri]
  }

  object Transcript {
    @inline
    def apply(
        RedactedTranscriptFileUri: js.UndefOr[Uri] = js.undefined,
        TranscriptFileUri: js.UndefOr[Uri] = js.undefined
    ): Transcript = {
      val __obj = js.Dynamic.literal()
      RedactedTranscriptFileUri.foreach(__v => __obj.updateDynamic("RedactedTranscriptFileUri")(__v.asInstanceOf[js.Any]))
      TranscriptFileUri.foreach(__v => __obj.updateDynamic("TranscriptFileUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Transcript]
    }
  }

  /** Describes an asynchronous transcription job that was created with the <code>StartTranscriptionJob</code> operation.
    */
  @js.native
  trait TranscriptionJob extends js.Object {
    var CompletionTime: js.UndefOr[DateTime]
    var ContentRedaction: js.UndefOr[ContentRedaction]
    var CreationTime: js.UndefOr[DateTime]
    var FailureReason: js.UndefOr[FailureReason]
    var IdentifiedLanguageScore: js.UndefOr[IdentifiedLanguageScore]
    var IdentifyLanguage: js.UndefOr[Boolean]
    var JobExecutionSettings: js.UndefOr[JobExecutionSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageOptions: js.UndefOr[LanguageOptions]
    var Media: js.UndefOr[Media]
    var MediaFormat: js.UndefOr[MediaFormat]
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz]
    var ModelSettings: js.UndefOr[ModelSettings]
    var Settings: js.UndefOr[Settings]
    var StartTime: js.UndefOr[DateTime]
    var Transcript: js.UndefOr[Transcript]
    var TranscriptionJobName: js.UndefOr[TranscriptionJobName]
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus]
  }

  object TranscriptionJob {
    @inline
    def apply(
        CompletionTime: js.UndefOr[DateTime] = js.undefined,
        ContentRedaction: js.UndefOr[ContentRedaction] = js.undefined,
        CreationTime: js.UndefOr[DateTime] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        IdentifiedLanguageScore: js.UndefOr[IdentifiedLanguageScore] = js.undefined,
        IdentifyLanguage: js.UndefOr[Boolean] = js.undefined,
        JobExecutionSettings: js.UndefOr[JobExecutionSettings] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageOptions: js.UndefOr[LanguageOptions] = js.undefined,
        Media: js.UndefOr[Media] = js.undefined,
        MediaFormat: js.UndefOr[MediaFormat] = js.undefined,
        MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined,
        ModelSettings: js.UndefOr[ModelSettings] = js.undefined,
        Settings: js.UndefOr[Settings] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        Transcript: js.UndefOr[Transcript] = js.undefined,
        TranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined,
        TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus] = js.undefined
    ): TranscriptionJob = {
      val __obj = js.Dynamic.literal()
      CompletionTime.foreach(__v => __obj.updateDynamic("CompletionTime")(__v.asInstanceOf[js.Any]))
      ContentRedaction.foreach(__v => __obj.updateDynamic("ContentRedaction")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      IdentifiedLanguageScore.foreach(__v => __obj.updateDynamic("IdentifiedLanguageScore")(__v.asInstanceOf[js.Any]))
      IdentifyLanguage.foreach(__v => __obj.updateDynamic("IdentifyLanguage")(__v.asInstanceOf[js.Any]))
      JobExecutionSettings.foreach(__v => __obj.updateDynamic("JobExecutionSettings")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageOptions.foreach(__v => __obj.updateDynamic("LanguageOptions")(__v.asInstanceOf[js.Any]))
      Media.foreach(__v => __obj.updateDynamic("Media")(__v.asInstanceOf[js.Any]))
      MediaFormat.foreach(__v => __obj.updateDynamic("MediaFormat")(__v.asInstanceOf[js.Any]))
      MediaSampleRateHertz.foreach(__v => __obj.updateDynamic("MediaSampleRateHertz")(__v.asInstanceOf[js.Any]))
      ModelSettings.foreach(__v => __obj.updateDynamic("ModelSettings")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Transcript.foreach(__v => __obj.updateDynamic("Transcript")(__v.asInstanceOf[js.Any]))
      TranscriptionJobName.foreach(__v => __obj.updateDynamic("TranscriptionJobName")(__v.asInstanceOf[js.Any]))
      TranscriptionJobStatus.foreach(__v => __obj.updateDynamic("TranscriptionJobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranscriptionJob]
    }
  }

  /** Provides a summary of information about a transcription job.
    */
  @js.native
  trait TranscriptionJobSummary extends js.Object {
    var CompletionTime: js.UndefOr[DateTime]
    var ContentRedaction: js.UndefOr[ContentRedaction]
    var CreationTime: js.UndefOr[DateTime]
    var FailureReason: js.UndefOr[FailureReason]
    var IdentifiedLanguageScore: js.UndefOr[IdentifiedLanguageScore]
    var IdentifyLanguage: js.UndefOr[Boolean]
    var LanguageCode: js.UndefOr[LanguageCode]
    var ModelSettings: js.UndefOr[ModelSettings]
    var OutputLocationType: js.UndefOr[OutputLocationType]
    var StartTime: js.UndefOr[DateTime]
    var TranscriptionJobName: js.UndefOr[TranscriptionJobName]
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus]
  }

  object TranscriptionJobSummary {
    @inline
    def apply(
        CompletionTime: js.UndefOr[DateTime] = js.undefined,
        ContentRedaction: js.UndefOr[ContentRedaction] = js.undefined,
        CreationTime: js.UndefOr[DateTime] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        IdentifiedLanguageScore: js.UndefOr[IdentifiedLanguageScore] = js.undefined,
        IdentifyLanguage: js.UndefOr[Boolean] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        ModelSettings: js.UndefOr[ModelSettings] = js.undefined,
        OutputLocationType: js.UndefOr[OutputLocationType] = js.undefined,
        StartTime: js.UndefOr[DateTime] = js.undefined,
        TranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined,
        TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus] = js.undefined
    ): TranscriptionJobSummary = {
      val __obj = js.Dynamic.literal()
      CompletionTime.foreach(__v => __obj.updateDynamic("CompletionTime")(__v.asInstanceOf[js.Any]))
      ContentRedaction.foreach(__v => __obj.updateDynamic("ContentRedaction")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      IdentifiedLanguageScore.foreach(__v => __obj.updateDynamic("IdentifiedLanguageScore")(__v.asInstanceOf[js.Any]))
      IdentifyLanguage.foreach(__v => __obj.updateDynamic("IdentifyLanguage")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      ModelSettings.foreach(__v => __obj.updateDynamic("ModelSettings")(__v.asInstanceOf[js.Any]))
      OutputLocationType.foreach(__v => __obj.updateDynamic("OutputLocationType")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      TranscriptionJobName.foreach(__v => __obj.updateDynamic("TranscriptionJobName")(__v.asInstanceOf[js.Any]))
      TranscriptionJobStatus.foreach(__v => __obj.updateDynamic("TranscriptionJobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranscriptionJobSummary]
    }
  }

  @js.native
  trait UpdateMedicalVocabularyRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyName: VocabularyName
    var VocabularyFileUri: js.UndefOr[Uri]
  }

  object UpdateMedicalVocabularyRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        VocabularyName: VocabularyName,
        VocabularyFileUri: js.UndefOr[Uri] = js.undefined
    ): UpdateMedicalVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )

      VocabularyFileUri.foreach(__v => __obj.updateDynamic("VocabularyFileUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMedicalVocabularyRequest]
    }
  }

  @js.native
  trait UpdateMedicalVocabularyResponse extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object UpdateMedicalVocabularyResponse {
    @inline
    def apply(
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): UpdateMedicalVocabularyResponse = {
      val __obj = js.Dynamic.literal()
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.updateDynamic("VocabularyState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMedicalVocabularyResponse]
    }
  }

  @js.native
  trait UpdateVocabularyFilterRequest extends js.Object {
    var VocabularyFilterName: VocabularyFilterName
    var VocabularyFilterFileUri: js.UndefOr[Uri]
    var Words: js.UndefOr[Words]
  }

  object UpdateVocabularyFilterRequest {
    @inline
    def apply(
        VocabularyFilterName: VocabularyFilterName,
        VocabularyFilterFileUri: js.UndefOr[Uri] = js.undefined,
        Words: js.UndefOr[Words] = js.undefined
    ): UpdateVocabularyFilterRequest = {
      val __obj = js.Dynamic.literal(
        "VocabularyFilterName" -> VocabularyFilterName.asInstanceOf[js.Any]
      )

      VocabularyFilterFileUri.foreach(__v => __obj.updateDynamic("VocabularyFilterFileUri")(__v.asInstanceOf[js.Any]))
      Words.foreach(__v => __obj.updateDynamic("Words")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVocabularyFilterRequest]
    }
  }

  @js.native
  trait UpdateVocabularyFilterResponse extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyFilterName: js.UndefOr[VocabularyFilterName]
  }

  object UpdateVocabularyFilterResponse {
    @inline
    def apply(
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyFilterName: js.UndefOr[VocabularyFilterName] = js.undefined
    ): UpdateVocabularyFilterResponse = {
      val __obj = js.Dynamic.literal()
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyFilterName.foreach(__v => __obj.updateDynamic("VocabularyFilterName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVocabularyFilterResponse]
    }
  }

  @js.native
  trait UpdateVocabularyRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyName: VocabularyName
    var Phrases: js.UndefOr[Phrases]
    var VocabularyFileUri: js.UndefOr[Uri]
  }

  object UpdateVocabularyRequest {
    @inline
    def apply(
        LanguageCode: LanguageCode,
        VocabularyName: VocabularyName,
        Phrases: js.UndefOr[Phrases] = js.undefined,
        VocabularyFileUri: js.UndefOr[Uri] = js.undefined
    ): UpdateVocabularyRequest = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "VocabularyName" -> VocabularyName.asInstanceOf[js.Any]
      )

      Phrases.foreach(__v => __obj.updateDynamic("Phrases")(__v.asInstanceOf[js.Any]))
      VocabularyFileUri.foreach(__v => __obj.updateDynamic("VocabularyFileUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVocabularyRequest]
    }
  }

  @js.native
  trait UpdateVocabularyResponse extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object UpdateVocabularyResponse {
    @inline
    def apply(
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): UpdateVocabularyResponse = {
      val __obj = js.Dynamic.literal()
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.updateDynamic("VocabularyState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVocabularyResponse]
    }
  }

  /** Provides information about a vocabulary filter.
    */
  @js.native
  trait VocabularyFilterInfo extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyFilterName: js.UndefOr[VocabularyFilterName]
  }

  object VocabularyFilterInfo {
    @inline
    def apply(
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyFilterName: js.UndefOr[VocabularyFilterName] = js.undefined
    ): VocabularyFilterInfo = {
      val __obj = js.Dynamic.literal()
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyFilterName.foreach(__v => __obj.updateDynamic("VocabularyFilterName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VocabularyFilterInfo]
    }
  }

  /** Provides information about a custom vocabulary.
    */
  @js.native
  trait VocabularyInfo extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  object VocabularyInfo {
    @inline
    def apply(
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModifiedTime: js.UndefOr[DateTime] = js.undefined,
        VocabularyName: js.UndefOr[VocabularyName] = js.undefined,
        VocabularyState: js.UndefOr[VocabularyState] = js.undefined
    ): VocabularyInfo = {
      val __obj = js.Dynamic.literal()
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      VocabularyState.foreach(__v => __obj.updateDynamic("VocabularyState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VocabularyInfo]
    }
  }
}
