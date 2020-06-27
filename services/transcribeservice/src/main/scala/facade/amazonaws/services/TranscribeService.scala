package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object transcribeservice {
  type DataAccessRoleArn         = String
  type DateTime                  = js.Date
  type FailureReason             = String
  type KMSKeyId                  = String
  type MaxAlternatives           = Int
  type MaxResults                = Int
  type MaxSpeakers               = Int
  type MediaSampleRateHertz      = Int
  type NextToken                 = String
  type OutputBucketName          = String
  type Phrase                    = String
  type Phrases                   = js.Array[Phrase]
  type TranscriptionJobName      = String
  type TranscriptionJobSummaries = js.Array[TranscriptionJobSummary]
  type Uri                       = String
  type Vocabularies              = js.Array[VocabularyInfo]
  type VocabularyFilterName      = String
  type VocabularyFilters         = js.Array[VocabularyFilterInfo]
  type VocabularyName            = String
  type Word                      = String
  type Words                     = js.Array[Word]

  implicit final class TranscribeServiceOps(private val service: TranscribeService) extends AnyVal {

    @inline def createVocabularyFilterFuture(
        params: CreateVocabularyFilterRequest
    ): Future[CreateVocabularyFilterResponse] = service.createVocabularyFilter(params).promise().toFuture
    @inline def createVocabularyFuture(params: CreateVocabularyRequest): Future[CreateVocabularyResponse] =
      service.createVocabulary(params).promise().toFuture
    @inline def deleteTranscriptionJobFuture(params: DeleteTranscriptionJobRequest): Future[js.Object] =
      service.deleteTranscriptionJob(params).promise().toFuture
    @inline def deleteVocabularyFilterFuture(params: DeleteVocabularyFilterRequest): Future[js.Object] =
      service.deleteVocabularyFilter(params).promise().toFuture
    @inline def deleteVocabularyFuture(params: DeleteVocabularyRequest): Future[js.Object] =
      service.deleteVocabulary(params).promise().toFuture
    @inline def getTranscriptionJobFuture(params: GetTranscriptionJobRequest): Future[GetTranscriptionJobResponse] =
      service.getTranscriptionJob(params).promise().toFuture
    @inline def getVocabularyFilterFuture(params: GetVocabularyFilterRequest): Future[GetVocabularyFilterResponse] =
      service.getVocabularyFilter(params).promise().toFuture
    @inline def getVocabularyFuture(params: GetVocabularyRequest): Future[GetVocabularyResponse] =
      service.getVocabulary(params).promise().toFuture
    @inline def listTranscriptionJobsFuture(
        params: ListTranscriptionJobsRequest
    ): Future[ListTranscriptionJobsResponse] = service.listTranscriptionJobs(params).promise().toFuture
    @inline def listVocabulariesFuture(params: ListVocabulariesRequest): Future[ListVocabulariesResponse] =
      service.listVocabularies(params).promise().toFuture
    @inline def listVocabularyFiltersFuture(
        params: ListVocabularyFiltersRequest
    ): Future[ListVocabularyFiltersResponse] = service.listVocabularyFilters(params).promise().toFuture
    @inline def startTranscriptionJobFuture(
        params: StartTranscriptionJobRequest
    ): Future[StartTranscriptionJobResponse] = service.startTranscriptionJob(params).promise().toFuture
    @inline def updateVocabularyFilterFuture(
        params: UpdateVocabularyFilterRequest
    ): Future[UpdateVocabularyFilterResponse] = service.updateVocabularyFilter(params).promise().toFuture
    @inline def updateVocabularyFuture(params: UpdateVocabularyRequest): Future[UpdateVocabularyResponse] =
      service.updateVocabulary(params).promise().toFuture
  }
}

package transcribeservice {
  @js.native
  @JSImport("aws-sdk", "TranscribeService")
  class TranscribeService() extends js.Object {
    def this(config: AWSConfig) = this()

    def createVocabulary(params: CreateVocabularyRequest): Request[CreateVocabularyResponse] = js.native
    def createVocabularyFilter(params: CreateVocabularyFilterRequest): Request[CreateVocabularyFilterResponse] =
      js.native
    def deleteTranscriptionJob(params: DeleteTranscriptionJobRequest): Request[js.Object]                   = js.native
    def deleteVocabulary(params: DeleteVocabularyRequest): Request[js.Object]                               = js.native
    def deleteVocabularyFilter(params: DeleteVocabularyFilterRequest): Request[js.Object]                   = js.native
    def getTranscriptionJob(params: GetTranscriptionJobRequest): Request[GetTranscriptionJobResponse]       = js.native
    def getVocabulary(params: GetVocabularyRequest): Request[GetVocabularyResponse]                         = js.native
    def getVocabularyFilter(params: GetVocabularyFilterRequest): Request[GetVocabularyFilterResponse]       = js.native
    def listTranscriptionJobs(params: ListTranscriptionJobsRequest): Request[ListTranscriptionJobsResponse] = js.native
    def listVocabularies(params: ListVocabulariesRequest): Request[ListVocabulariesResponse]                = js.native
    def listVocabularyFilters(params: ListVocabularyFiltersRequest): Request[ListVocabularyFiltersResponse] = js.native
    def startTranscriptionJob(params: StartTranscriptionJobRequest): Request[StartTranscriptionJobResponse] = js.native
    def updateVocabulary(params: UpdateVocabularyRequest): Request[UpdateVocabularyResponse]                = js.native
    def updateVocabularyFilter(params: UpdateVocabularyFilterRequest): Request[UpdateVocabularyFilterResponse] =
      js.native
  }

  @js.native
  @Factory
  trait CreateVocabularyFilterRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyFilterName: VocabularyFilterName
    var VocabularyFilterFileUri: js.UndefOr[Uri]
    var Words: js.UndefOr[Words]
  }

  @js.native
  @Factory
  trait CreateVocabularyFilterResponse extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyFilterName: js.UndefOr[VocabularyFilterName]
  }

  @js.native
  @Factory
  trait CreateVocabularyRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyName: VocabularyName
    var Phrases: js.UndefOr[Phrases]
    var VocabularyFileUri: js.UndefOr[Uri]
  }

  @js.native
  @Factory
  trait CreateVocabularyResponse extends js.Object {
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  @js.native
  @Factory
  trait DeleteTranscriptionJobRequest extends js.Object {
    var TranscriptionJobName: TranscriptionJobName
  }

  @js.native
  @Factory
  trait DeleteVocabularyFilterRequest extends js.Object {
    var VocabularyFilterName: VocabularyFilterName
  }

  @js.native
  @Factory
  trait DeleteVocabularyRequest extends js.Object {
    var VocabularyName: VocabularyName
  }

  @js.native
  @Factory
  trait GetTranscriptionJobRequest extends js.Object {
    var TranscriptionJobName: TranscriptionJobName
  }

  @js.native
  @Factory
  trait GetTranscriptionJobResponse extends js.Object {
    var TranscriptionJob: js.UndefOr[TranscriptionJob]
  }

  @js.native
  @Factory
  trait GetVocabularyFilterRequest extends js.Object {
    var VocabularyFilterName: VocabularyFilterName
  }

  @js.native
  @Factory
  trait GetVocabularyFilterResponse extends js.Object {
    var DownloadUri: js.UndefOr[Uri]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyFilterName: js.UndefOr[VocabularyFilterName]
  }

  @js.native
  @Factory
  trait GetVocabularyRequest extends js.Object {
    var VocabularyName: VocabularyName
  }

  @js.native
  @Factory
  trait GetVocabularyResponse extends js.Object {
    var DownloadUri: js.UndefOr[Uri]
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  /**
    * Provides information about when a transcription job should be executed.
    */
  @js.native
  @Factory
  trait JobExecutionSettings extends js.Object {
    var AllowDeferredExecution: js.UndefOr[Boolean]
    var DataAccessRoleArn: js.UndefOr[DataAccessRoleArn]
  }

  @js.native
  sealed trait LanguageCode extends js.Any
  object LanguageCode extends js.Object {
    val `en-US` = "en-US".asInstanceOf[LanguageCode]
    val `es-US` = "es-US".asInstanceOf[LanguageCode]
    val `en-AU` = "en-AU".asInstanceOf[LanguageCode]
    val `fr-CA` = "fr-CA".asInstanceOf[LanguageCode]
    val `en-GB` = "en-GB".asInstanceOf[LanguageCode]
    val `de-DE` = "de-DE".asInstanceOf[LanguageCode]
    val `pt-BR` = "pt-BR".asInstanceOf[LanguageCode]
    val `fr-FR` = "fr-FR".asInstanceOf[LanguageCode]
    val `it-IT` = "it-IT".asInstanceOf[LanguageCode]
    val `ko-KR` = "ko-KR".asInstanceOf[LanguageCode]
    val `es-ES` = "es-ES".asInstanceOf[LanguageCode]
    val `en-IN` = "en-IN".asInstanceOf[LanguageCode]
    val `hi-IN` = "hi-IN".asInstanceOf[LanguageCode]
    val `ar-SA` = "ar-SA".asInstanceOf[LanguageCode]
    val `ru-RU` = "ru-RU".asInstanceOf[LanguageCode]
    val `zh-CN` = "zh-CN".asInstanceOf[LanguageCode]
    val `nl-NL` = "nl-NL".asInstanceOf[LanguageCode]
    val `id-ID` = "id-ID".asInstanceOf[LanguageCode]
    val `ta-IN` = "ta-IN".asInstanceOf[LanguageCode]
    val `fa-IR` = "fa-IR".asInstanceOf[LanguageCode]
    val `en-IE` = "en-IE".asInstanceOf[LanguageCode]
    val `en-AB` = "en-AB".asInstanceOf[LanguageCode]
    val `en-WL` = "en-WL".asInstanceOf[LanguageCode]
    val `pt-PT` = "pt-PT".asInstanceOf[LanguageCode]
    val `te-IN` = "te-IN".asInstanceOf[LanguageCode]
    val `tr-TR` = "tr-TR".asInstanceOf[LanguageCode]
    val `de-CH` = "de-CH".asInstanceOf[LanguageCode]
    val `he-IL` = "he-IL".asInstanceOf[LanguageCode]
    val `ms-MY` = "ms-MY".asInstanceOf[LanguageCode]
    val `ja-JP` = "ja-JP".asInstanceOf[LanguageCode]
    val `ar-AE` = "ar-AE".asInstanceOf[LanguageCode]

    val values = js.Object.freeze(
      js.Array(
        `en-US`,
        `es-US`,
        `en-AU`,
        `fr-CA`,
        `en-GB`,
        `de-DE`,
        `pt-BR`,
        `fr-FR`,
        `it-IT`,
        `ko-KR`,
        `es-ES`,
        `en-IN`,
        `hi-IN`,
        `ar-SA`,
        `ru-RU`,
        `zh-CN`,
        `nl-NL`,
        `id-ID`,
        `ta-IN`,
        `fa-IR`,
        `en-IE`,
        `en-AB`,
        `en-WL`,
        `pt-PT`,
        `te-IN`,
        `tr-TR`,
        `de-CH`,
        `he-IL`,
        `ms-MY`,
        `ja-JP`,
        `ar-AE`
      )
    )
  }

  @js.native
  @Factory
  trait ListTranscriptionJobsRequest extends js.Object {
    var JobNameContains: js.UndefOr[TranscriptionJobName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
  }

  @js.native
  @Factory
  trait ListTranscriptionJobsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
    var TranscriptionJobSummaries: js.UndefOr[TranscriptionJobSummaries]
  }

  @js.native
  @Factory
  trait ListVocabulariesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[VocabularyName]
    var NextToken: js.UndefOr[NextToken]
    var StateEquals: js.UndefOr[VocabularyState]
  }

  @js.native
  @Factory
  trait ListVocabulariesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TranscriptionJobStatus]
    var Vocabularies: js.UndefOr[Vocabularies]
  }

  @js.native
  @Factory
  trait ListVocabularyFiltersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NameContains: js.UndefOr[VocabularyFilterName]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListVocabularyFiltersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var VocabularyFilters: js.UndefOr[VocabularyFilters]
  }

  /**
    * Describes the input media file in a transcription request.
    */
  @js.native
  @Factory
  trait Media extends js.Object {
    var MediaFileUri: js.UndefOr[Uri]
  }

  @js.native
  sealed trait MediaFormat extends js.Any
  object MediaFormat extends js.Object {
    val mp3  = "mp3".asInstanceOf[MediaFormat]
    val mp4  = "mp4".asInstanceOf[MediaFormat]
    val wav  = "wav".asInstanceOf[MediaFormat]
    val flac = "flac".asInstanceOf[MediaFormat]

    val values = js.Object.freeze(js.Array(mp3, mp4, wav, flac))
  }

  @js.native
  sealed trait OutputLocationType extends js.Any
  object OutputLocationType extends js.Object {
    val CUSTOMER_BUCKET = "CUSTOMER_BUCKET".asInstanceOf[OutputLocationType]
    val SERVICE_BUCKET  = "SERVICE_BUCKET".asInstanceOf[OutputLocationType]

    val values = js.Object.freeze(js.Array(CUSTOMER_BUCKET, SERVICE_BUCKET))
  }

  /**
    * Provides optional settings for the <code>StartTranscriptionJob</code> operation.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait StartTranscriptionJobRequest extends js.Object {
    var LanguageCode: LanguageCode
    var Media: Media
    var TranscriptionJobName: TranscriptionJobName
    var JobExecutionSettings: js.UndefOr[JobExecutionSettings]
    var MediaFormat: js.UndefOr[MediaFormat]
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz]
    var OutputBucketName: js.UndefOr[OutputBucketName]
    var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId]
    var Settings: js.UndefOr[Settings]
  }

  @js.native
  @Factory
  trait StartTranscriptionJobResponse extends js.Object {
    var TranscriptionJob: js.UndefOr[TranscriptionJob]
  }

  /**
    * Identifies the location of a transcription.
    */
  @js.native
  @Factory
  trait Transcript extends js.Object {
    var TranscriptFileUri: js.UndefOr[Uri]
  }

  /**
    * Describes an asynchronous transcription job that was created with the <code>StartTranscriptionJob</code> operation.
    */
  @js.native
  @Factory
  trait TranscriptionJob extends js.Object {
    var CompletionTime: js.UndefOr[DateTime]
    var CreationTime: js.UndefOr[DateTime]
    var FailureReason: js.UndefOr[FailureReason]
    var JobExecutionSettings: js.UndefOr[JobExecutionSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Media: js.UndefOr[Media]
    var MediaFormat: js.UndefOr[MediaFormat]
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz]
    var Settings: js.UndefOr[Settings]
    var StartTime: js.UndefOr[DateTime]
    var Transcript: js.UndefOr[Transcript]
    var TranscriptionJobName: js.UndefOr[TranscriptionJobName]
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus]
  }

  @js.native
  sealed trait TranscriptionJobStatus extends js.Any
  object TranscriptionJobStatus extends js.Object {
    val QUEUED      = "QUEUED".asInstanceOf[TranscriptionJobStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TranscriptionJobStatus]
    val FAILED      = "FAILED".asInstanceOf[TranscriptionJobStatus]
    val COMPLETED   = "COMPLETED".asInstanceOf[TranscriptionJobStatus]

    val values = js.Object.freeze(js.Array(QUEUED, IN_PROGRESS, FAILED, COMPLETED))
  }

  /**
    * Provides a summary of information about a transcription job.
    */
  @js.native
  @Factory
  trait TranscriptionJobSummary extends js.Object {
    var CompletionTime: js.UndefOr[DateTime]
    var CreationTime: js.UndefOr[DateTime]
    var FailureReason: js.UndefOr[FailureReason]
    var LanguageCode: js.UndefOr[LanguageCode]
    var OutputLocationType: js.UndefOr[OutputLocationType]
    var StartTime: js.UndefOr[DateTime]
    var TranscriptionJobName: js.UndefOr[TranscriptionJobName]
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus]
  }

  @js.native
  @Factory
  trait UpdateVocabularyFilterRequest extends js.Object {
    var VocabularyFilterName: VocabularyFilterName
    var VocabularyFilterFileUri: js.UndefOr[Uri]
    var Words: js.UndefOr[Words]
  }

  @js.native
  @Factory
  trait UpdateVocabularyFilterResponse extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyFilterName: js.UndefOr[VocabularyFilterName]
  }

  @js.native
  @Factory
  trait UpdateVocabularyRequest extends js.Object {
    var LanguageCode: LanguageCode
    var VocabularyName: VocabularyName
    var Phrases: js.UndefOr[Phrases]
    var VocabularyFileUri: js.UndefOr[Uri]
  }

  @js.native
  @Factory
  trait UpdateVocabularyResponse extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  /**
    * Provides information about a vocabulary filter.
    */
  @js.native
  @Factory
  trait VocabularyFilterInfo extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyFilterName: js.UndefOr[VocabularyFilterName]
  }

  @js.native
  sealed trait VocabularyFilterMethod extends js.Any
  object VocabularyFilterMethod extends js.Object {
    val remove = "remove".asInstanceOf[VocabularyFilterMethod]
    val mask   = "mask".asInstanceOf[VocabularyFilterMethod]

    val values = js.Object.freeze(js.Array(remove, mask))
  }

  /**
    * Provides information about a custom vocabulary.
    */
  @js.native
  @Factory
  trait VocabularyInfo extends js.Object {
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModifiedTime: js.UndefOr[DateTime]
    var VocabularyName: js.UndefOr[VocabularyName]
    var VocabularyState: js.UndefOr[VocabularyState]
  }

  @js.native
  sealed trait VocabularyState extends js.Any
  object VocabularyState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[VocabularyState]
    val READY   = "READY".asInstanceOf[VocabularyState]
    val FAILED  = "FAILED".asInstanceOf[VocabularyState]

    val values = js.Object.freeze(js.Array(PENDING, READY, FAILED))
  }
}
