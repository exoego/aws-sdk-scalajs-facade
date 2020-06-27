package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object translate {
  type AppliedTerminologyList           = js.Array[AppliedTerminology]
  type BoundedLengthString              = String
  type ClientTokenString                = String
  type ContentType                      = String
  type Description                      = String
  type EncryptionKeyID                  = String
  type IamRoleArn                       = String
  type JobId                            = String
  type JobName                          = String
  type LanguageCodeString               = String
  type LanguageCodeStringList           = js.Array[LanguageCodeString]
  type MaxResultsInteger                = Int
  type NextToken                        = String
  type ResourceName                     = String
  type ResourceNameList                 = js.Array[ResourceName]
  type S3Uri                            = String
  type TargetLanguageCodeStringList     = js.Array[LanguageCodeString]
  type TermList                         = js.Array[Term]
  type TerminologyArn                   = String
  type TerminologyFile                  = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type TerminologyPropertiesList        = js.Array[TerminologyProperties]
  type TextTranslationJobPropertiesList = js.Array[TextTranslationJobProperties]
  type Timestamp                        = js.Date
  type UnboundedLengthString            = String

  implicit final class TranslateOps(private val service: Translate) extends AnyVal {

    @inline def deleteTerminologyFuture(params: DeleteTerminologyRequest): Future[js.Object] =
      service.deleteTerminology(params).promise().toFuture
    @inline def describeTextTranslationJobFuture(
        params: DescribeTextTranslationJobRequest
    ): Future[DescribeTextTranslationJobResponse] = service.describeTextTranslationJob(params).promise().toFuture
    @inline def getTerminologyFuture(params: GetTerminologyRequest): Future[GetTerminologyResponse] =
      service.getTerminology(params).promise().toFuture
    @inline def importTerminologyFuture(params: ImportTerminologyRequest): Future[ImportTerminologyResponse] =
      service.importTerminology(params).promise().toFuture
    @inline def listTerminologiesFuture(params: ListTerminologiesRequest): Future[ListTerminologiesResponse] =
      service.listTerminologies(params).promise().toFuture
    @inline def listTextTranslationJobsFuture(
        params: ListTextTranslationJobsRequest
    ): Future[ListTextTranslationJobsResponse] = service.listTextTranslationJobs(params).promise().toFuture
    @inline def startTextTranslationJobFuture(
        params: StartTextTranslationJobRequest
    ): Future[StartTextTranslationJobResponse] = service.startTextTranslationJob(params).promise().toFuture
    @inline def stopTextTranslationJobFuture(
        params: StopTextTranslationJobRequest
    ): Future[StopTextTranslationJobResponse] = service.stopTextTranslationJob(params).promise().toFuture
    @inline def translateTextFuture(params: TranslateTextRequest): Future[TranslateTextResponse] =
      service.translateText(params).promise().toFuture
  }
}

package translate {
  @js.native
  @JSImport("aws-sdk", "Translate")
  class Translate() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteTerminology(params: DeleteTerminologyRequest): Request[js.Object] = js.native
    def describeTextTranslationJob(
        params: DescribeTextTranslationJobRequest
    ): Request[DescribeTextTranslationJobResponse]                                              = js.native
    def getTerminology(params: GetTerminologyRequest): Request[GetTerminologyResponse]          = js.native
    def importTerminology(params: ImportTerminologyRequest): Request[ImportTerminologyResponse] = js.native
    def listTerminologies(params: ListTerminologiesRequest): Request[ListTerminologiesResponse] = js.native
    def listTextTranslationJobs(params: ListTextTranslationJobsRequest): Request[ListTextTranslationJobsResponse] =
      js.native
    def startTextTranslationJob(params: StartTextTranslationJobRequest): Request[StartTextTranslationJobResponse] =
      js.native
    def stopTextTranslationJob(params: StopTextTranslationJobRequest): Request[StopTextTranslationJobResponse] =
      js.native
    def translateText(params: TranslateTextRequest): Request[TranslateTextResponse] = js.native
  }

  /**
    * The custom terminology applied to the input text by Amazon Translate for the translated text response. This is optional in the response and will only be present if you specified terminology input in the request. Currently, only one terminology can be applied per TranslateText request.
    */
  @js.native
  @Factory
  trait AppliedTerminology extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var Terms: js.UndefOr[TermList]
  }

  @js.native
  @Factory
  trait DeleteTerminologyRequest extends js.Object {
    var Name: ResourceName
  }

  @js.native
  @Factory
  trait DescribeTextTranslationJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeTextTranslationJobResponse extends js.Object {
    var TextTranslationJobProperties: js.UndefOr[TextTranslationJobProperties]
  }

  /**
    * The encryption key used to encrypt the custom terminologies used by Amazon Translate.
    */
  @js.native
  @Factory
  trait EncryptionKey extends js.Object {
    var Id: EncryptionKeyID
    var Type: EncryptionKeyType
  }

  @js.native
  sealed trait EncryptionKeyType extends js.Any
  object EncryptionKeyType extends js.Object {
    val KMS = "KMS".asInstanceOf[EncryptionKeyType]

    val values = js.Object.freeze(js.Array(KMS))
  }

  @js.native
  @Factory
  trait GetTerminologyRequest extends js.Object {
    var Name: ResourceName
    var TerminologyDataFormat: TerminologyDataFormat
  }

  @js.native
  @Factory
  trait GetTerminologyResponse extends js.Object {
    var TerminologyDataLocation: js.UndefOr[TerminologyDataLocation]
    var TerminologyProperties: js.UndefOr[TerminologyProperties]
  }

  @js.native
  @Factory
  trait ImportTerminologyRequest extends js.Object {
    var MergeStrategy: MergeStrategy
    var Name: ResourceName
    var TerminologyData: TerminologyData
    var Description: js.UndefOr[Description]
    var EncryptionKey: js.UndefOr[EncryptionKey]
  }

  @js.native
  @Factory
  trait ImportTerminologyResponse extends js.Object {
    var TerminologyProperties: js.UndefOr[TerminologyProperties]
  }

  /**
    * The input configuration properties for requesting a batch translation job.
    */
  @js.native
  @Factory
  trait InputDataConfig extends js.Object {
    var ContentType: ContentType
    var S3Uri: S3Uri
  }

  /**
    * The number of documents successfully and unsuccessfully processed during a translation job.
    */
  @js.native
  @Factory
  trait JobDetails extends js.Object {
    var DocumentsWithErrorsCount: js.UndefOr[Int]
    var InputDocumentsCount: js.UndefOr[Int]
    var TranslatedDocumentsCount: js.UndefOr[Int]
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val SUBMITTED            = "SUBMITTED".asInstanceOf[JobStatus]
    val IN_PROGRESS          = "IN_PROGRESS".asInstanceOf[JobStatus]
    val COMPLETED            = "COMPLETED".asInstanceOf[JobStatus]
    val COMPLETED_WITH_ERROR = "COMPLETED_WITH_ERROR".asInstanceOf[JobStatus]
    val FAILED               = "FAILED".asInstanceOf[JobStatus]
    val STOP_REQUESTED       = "STOP_REQUESTED".asInstanceOf[JobStatus]
    val STOPPED              = "STOPPED".asInstanceOf[JobStatus]

    val values = js.Object.freeze(
      js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED)
    )
  }

  @js.native
  @Factory
  trait ListTerminologiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTerminologiesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList]
  }

  @js.native
  @Factory
  trait ListTextTranslationJobsRequest extends js.Object {
    var Filter: js.UndefOr[TextTranslationJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTextTranslationJobsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TextTranslationJobPropertiesList: js.UndefOr[TextTranslationJobPropertiesList]
  }

  @js.native
  sealed trait MergeStrategy extends js.Any
  object MergeStrategy extends js.Object {
    val OVERWRITE = "OVERWRITE".asInstanceOf[MergeStrategy]

    val values = js.Object.freeze(js.Array(OVERWRITE))
  }

  /**
    * The output configuration properties for a batch translation job.
    */
  @js.native
  @Factory
  trait OutputDataConfig extends js.Object {
    var S3Uri: S3Uri
  }

  @js.native
  @Factory
  trait StartTextTranslationJobRequest extends js.Object {
    var ClientToken: ClientTokenString
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var SourceLanguageCode: LanguageCodeString
    var TargetLanguageCodes: TargetLanguageCodeStringList
    var JobName: js.UndefOr[JobName]
    var TerminologyNames: js.UndefOr[ResourceNameList]
  }

  @js.native
  @Factory
  trait StartTextTranslationJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait StopTextTranslationJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait StopTextTranslationJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  /**
    * The term being translated by the custom terminology.
    */
  @js.native
  @Factory
  trait Term extends js.Object {
    var SourceText: js.UndefOr[String]
    var TargetText: js.UndefOr[String]
  }

  /**
    * The data associated with the custom terminology.
    */
  @js.native
  @Factory
  trait TerminologyData extends js.Object {
    var File: TerminologyFile
    var Format: TerminologyDataFormat
  }

  @js.native
  sealed trait TerminologyDataFormat extends js.Any
  object TerminologyDataFormat extends js.Object {
    val CSV = "CSV".asInstanceOf[TerminologyDataFormat]
    val TMX = "TMX".asInstanceOf[TerminologyDataFormat]

    val values = js.Object.freeze(js.Array(CSV, TMX))
  }

  /**
    * The location of the custom terminology data.
    */
  @js.native
  @Factory
  trait TerminologyDataLocation extends js.Object {
    var Location: String
    var RepositoryType: String
  }

  /**
    * The properties of the custom terminology.
    */
  @js.native
  @Factory
  trait TerminologyProperties extends js.Object {
    var Arn: js.UndefOr[TerminologyArn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var EncryptionKey: js.UndefOr[EncryptionKey]
    var LastUpdatedAt: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ResourceName]
    var SizeBytes: js.UndefOr[Int]
    var SourceLanguageCode: js.UndefOr[LanguageCodeString]
    var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList]
    var TermCount: js.UndefOr[Int]
  }

  /**
    * Provides information for filtering a list of translation jobs. For more information, see <a>ListTextTranslationJobs</a>.
    */
  @js.native
  @Factory
  trait TextTranslationJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmittedAfterTime: js.UndefOr[Timestamp]
    var SubmittedBeforeTime: js.UndefOr[Timestamp]
  }

  /**
    * Provides information about a translation job.
    */
  @js.native
  @Factory
  trait TextTranslationJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobDetails: js.UndefOr[JobDetails]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var Message: js.UndefOr[UnboundedLengthString]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SourceLanguageCode: js.UndefOr[LanguageCodeString]
    var SubmittedTime: js.UndefOr[Timestamp]
    var TargetLanguageCodes: js.UndefOr[TargetLanguageCodeStringList]
    var TerminologyNames: js.UndefOr[ResourceNameList]
  }

  @js.native
  @Factory
  trait TranslateTextRequest extends js.Object {
    var SourceLanguageCode: LanguageCodeString
    var TargetLanguageCode: LanguageCodeString
    var Text: BoundedLengthString
    var TerminologyNames: js.UndefOr[ResourceNameList]
  }

  @js.native
  @Factory
  trait TranslateTextResponse extends js.Object {
    var SourceLanguageCode: LanguageCodeString
    var TargetLanguageCode: LanguageCodeString
    var TranslatedText: String
    var AppliedTerminologies: js.UndefOr[AppliedTerminologyList]
  }
}
