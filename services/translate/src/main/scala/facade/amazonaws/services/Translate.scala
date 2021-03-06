package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object translate {
  type AppliedTerminologyList = js.Array[AppliedTerminology]
  type BoundedLengthString = String
  type ClientTokenString = String
  type ContentType = String
  type Description = String
  type EncryptionKeyID = String
  type IamRoleArn = String
  type JobId = String
  type JobName = String
  type LanguageCodeString = String
  type LanguageCodeStringList = js.Array[LanguageCodeString]
  type MaxResultsInteger = Int
  type NextToken = String
  type ParallelDataArn = String
  type ParallelDataPropertiesList = js.Array[ParallelDataProperties]
  type ResourceName = String
  type ResourceNameList = js.Array[ResourceName]
  type S3Uri = String
  type TargetLanguageCodeStringList = js.Array[LanguageCodeString]
  type TermList = js.Array[Term]
  type TerminologyArn = String
  type TerminologyFile = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type TerminologyPropertiesList = js.Array[TerminologyProperties]
  type TextTranslationJobPropertiesList = js.Array[TextTranslationJobProperties]
  type Timestamp = js.Date
  type UnboundedLengthString = String

  implicit final class TranslateOps(private val service: Translate) extends AnyVal {

    @inline def createParallelDataFuture(params: CreateParallelDataRequest): Future[CreateParallelDataResponse] = service.createParallelData(params).promise().toFuture
    @inline def deleteParallelDataFuture(params: DeleteParallelDataRequest): Future[DeleteParallelDataResponse] = service.deleteParallelData(params).promise().toFuture
    @inline def deleteTerminologyFuture(params: DeleteTerminologyRequest): Future[js.Object] = service.deleteTerminology(params).promise().toFuture
    @inline def describeTextTranslationJobFuture(params: DescribeTextTranslationJobRequest): Future[DescribeTextTranslationJobResponse] = service.describeTextTranslationJob(params).promise().toFuture
    @inline def getParallelDataFuture(params: GetParallelDataRequest): Future[GetParallelDataResponse] = service.getParallelData(params).promise().toFuture
    @inline def getTerminologyFuture(params: GetTerminologyRequest): Future[GetTerminologyResponse] = service.getTerminology(params).promise().toFuture
    @inline def importTerminologyFuture(params: ImportTerminologyRequest): Future[ImportTerminologyResponse] = service.importTerminology(params).promise().toFuture
    @inline def listParallelDataFuture(params: ListParallelDataRequest): Future[ListParallelDataResponse] = service.listParallelData(params).promise().toFuture
    @inline def listTerminologiesFuture(params: ListTerminologiesRequest): Future[ListTerminologiesResponse] = service.listTerminologies(params).promise().toFuture
    @inline def listTextTranslationJobsFuture(params: ListTextTranslationJobsRequest): Future[ListTextTranslationJobsResponse] = service.listTextTranslationJobs(params).promise().toFuture
    @inline def startTextTranslationJobFuture(params: StartTextTranslationJobRequest): Future[StartTextTranslationJobResponse] = service.startTextTranslationJob(params).promise().toFuture
    @inline def stopTextTranslationJobFuture(params: StopTextTranslationJobRequest): Future[StopTextTranslationJobResponse] = service.stopTextTranslationJob(params).promise().toFuture
    @inline def translateTextFuture(params: TranslateTextRequest): Future[TranslateTextResponse] = service.translateText(params).promise().toFuture
    @inline def updateParallelDataFuture(params: UpdateParallelDataRequest): Future[UpdateParallelDataResponse] = service.updateParallelData(params).promise().toFuture

  }
}

package translate {
  @js.native
  @JSImport("aws-sdk/clients/translate", JSImport.Namespace, "AWS.Translate")
  class Translate() extends js.Object {
    def this(config: AWSConfig) = this()

    def createParallelData(params: CreateParallelDataRequest): Request[CreateParallelDataResponse] = js.native
    def deleteParallelData(params: DeleteParallelDataRequest): Request[DeleteParallelDataResponse] = js.native
    def deleteTerminology(params: DeleteTerminologyRequest): Request[js.Object] = js.native
    def describeTextTranslationJob(params: DescribeTextTranslationJobRequest): Request[DescribeTextTranslationJobResponse] = js.native
    def getParallelData(params: GetParallelDataRequest): Request[GetParallelDataResponse] = js.native
    def getTerminology(params: GetTerminologyRequest): Request[GetTerminologyResponse] = js.native
    def importTerminology(params: ImportTerminologyRequest): Request[ImportTerminologyResponse] = js.native
    def listParallelData(params: ListParallelDataRequest): Request[ListParallelDataResponse] = js.native
    def listTerminologies(params: ListTerminologiesRequest): Request[ListTerminologiesResponse] = js.native
    def listTextTranslationJobs(params: ListTextTranslationJobsRequest): Request[ListTextTranslationJobsResponse] = js.native
    def startTextTranslationJob(params: StartTextTranslationJobRequest): Request[StartTextTranslationJobResponse] = js.native
    def stopTextTranslationJob(params: StopTextTranslationJobRequest): Request[StopTextTranslationJobResponse] = js.native
    def translateText(params: TranslateTextRequest): Request[TranslateTextResponse] = js.native
    def updateParallelData(params: UpdateParallelDataRequest): Request[UpdateParallelDataResponse] = js.native
  }

  /** The custom terminology applied to the input text by Amazon Translate for the translated text response. This is optional in the response and will only be present if you specified terminology input in the request. Currently, only one terminology can be applied per TranslateText request.
    */
  @js.native
  trait AppliedTerminology extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var Terms: js.UndefOr[TermList]
  }

  object AppliedTerminology {
    @inline
    def apply(
        Name: js.UndefOr[ResourceName] = js.undefined,
        Terms: js.UndefOr[TermList] = js.undefined
    ): AppliedTerminology = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Terms.foreach(__v => __obj.updateDynamic("Terms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppliedTerminology]
    }
  }

  @js.native
  trait CreateParallelDataRequest extends js.Object {
    var ClientToken: ClientTokenString
    var Name: ResourceName
    var ParallelDataConfig: ParallelDataConfig
    var Description: js.UndefOr[Description]
    var EncryptionKey: js.UndefOr[EncryptionKey]
  }

  object CreateParallelDataRequest {
    @inline
    def apply(
        ClientToken: ClientTokenString,
        Name: ResourceName,
        ParallelDataConfig: ParallelDataConfig,
        Description: js.UndefOr[Description] = js.undefined,
        EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    ): CreateParallelDataRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ParallelDataConfig" -> ParallelDataConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateParallelDataRequest]
    }
  }

  @js.native
  trait CreateParallelDataResponse extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var Status: js.UndefOr[ParallelDataStatus]
  }

  object CreateParallelDataResponse {
    @inline
    def apply(
        Name: js.UndefOr[ResourceName] = js.undefined,
        Status: js.UndefOr[ParallelDataStatus] = js.undefined
    ): CreateParallelDataResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateParallelDataResponse]
    }
  }

  @js.native
  trait DeleteParallelDataRequest extends js.Object {
    var Name: ResourceName
  }

  object DeleteParallelDataRequest {
    @inline
    def apply(
        Name: ResourceName
    ): DeleteParallelDataRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteParallelDataRequest]
    }
  }

  @js.native
  trait DeleteParallelDataResponse extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var Status: js.UndefOr[ParallelDataStatus]
  }

  object DeleteParallelDataResponse {
    @inline
    def apply(
        Name: js.UndefOr[ResourceName] = js.undefined,
        Status: js.UndefOr[ParallelDataStatus] = js.undefined
    ): DeleteParallelDataResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteParallelDataResponse]
    }
  }

  @js.native
  trait DeleteTerminologyRequest extends js.Object {
    var Name: ResourceName
  }

  object DeleteTerminologyRequest {
    @inline
    def apply(
        Name: ResourceName
    ): DeleteTerminologyRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTerminologyRequest]
    }
  }

  @js.native
  trait DescribeTextTranslationJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeTextTranslationJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeTextTranslationJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTextTranslationJobRequest]
    }
  }

  @js.native
  trait DescribeTextTranslationJobResponse extends js.Object {
    var TextTranslationJobProperties: js.UndefOr[TextTranslationJobProperties]
  }

  object DescribeTextTranslationJobResponse {
    @inline
    def apply(
        TextTranslationJobProperties: js.UndefOr[TextTranslationJobProperties] = js.undefined
    ): DescribeTextTranslationJobResponse = {
      val __obj = js.Dynamic.literal()
      TextTranslationJobProperties.foreach(__v => __obj.updateDynamic("TextTranslationJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTextTranslationJobResponse]
    }
  }

  /** The encryption key used to encrypt this object.
    */
  @js.native
  trait EncryptionKey extends js.Object {
    var Id: EncryptionKeyID
    var Type: EncryptionKeyType
  }

  object EncryptionKey {
    @inline
    def apply(
        Id: EncryptionKeyID,
        Type: EncryptionKeyType
    ): EncryptionKey = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncryptionKey]
    }
  }

  @js.native
  sealed trait EncryptionKeyType extends js.Any
  object EncryptionKeyType {
    val KMS = "KMS".asInstanceOf[EncryptionKeyType]

    @inline def values = js.Array(KMS)
  }

  @js.native
  trait GetParallelDataRequest extends js.Object {
    var Name: ResourceName
  }

  object GetParallelDataRequest {
    @inline
    def apply(
        Name: ResourceName
    ): GetParallelDataRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetParallelDataRequest]
    }
  }

  @js.native
  trait GetParallelDataResponse extends js.Object {
    var AuxiliaryDataLocation: js.UndefOr[ParallelDataDataLocation]
    var DataLocation: js.UndefOr[ParallelDataDataLocation]
    var LatestUpdateAttemptAuxiliaryDataLocation: js.UndefOr[ParallelDataDataLocation]
    var ParallelDataProperties: js.UndefOr[ParallelDataProperties]
  }

  object GetParallelDataResponse {
    @inline
    def apply(
        AuxiliaryDataLocation: js.UndefOr[ParallelDataDataLocation] = js.undefined,
        DataLocation: js.UndefOr[ParallelDataDataLocation] = js.undefined,
        LatestUpdateAttemptAuxiliaryDataLocation: js.UndefOr[ParallelDataDataLocation] = js.undefined,
        ParallelDataProperties: js.UndefOr[ParallelDataProperties] = js.undefined
    ): GetParallelDataResponse = {
      val __obj = js.Dynamic.literal()
      AuxiliaryDataLocation.foreach(__v => __obj.updateDynamic("AuxiliaryDataLocation")(__v.asInstanceOf[js.Any]))
      DataLocation.foreach(__v => __obj.updateDynamic("DataLocation")(__v.asInstanceOf[js.Any]))
      LatestUpdateAttemptAuxiliaryDataLocation.foreach(__v => __obj.updateDynamic("LatestUpdateAttemptAuxiliaryDataLocation")(__v.asInstanceOf[js.Any]))
      ParallelDataProperties.foreach(__v => __obj.updateDynamic("ParallelDataProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetParallelDataResponse]
    }
  }

  @js.native
  trait GetTerminologyRequest extends js.Object {
    var Name: ResourceName
    var TerminologyDataFormat: TerminologyDataFormat
  }

  object GetTerminologyRequest {
    @inline
    def apply(
        Name: ResourceName,
        TerminologyDataFormat: TerminologyDataFormat
    ): GetTerminologyRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "TerminologyDataFormat" -> TerminologyDataFormat.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTerminologyRequest]
    }
  }

  @js.native
  trait GetTerminologyResponse extends js.Object {
    var TerminologyDataLocation: js.UndefOr[TerminologyDataLocation]
    var TerminologyProperties: js.UndefOr[TerminologyProperties]
  }

  object GetTerminologyResponse {
    @inline
    def apply(
        TerminologyDataLocation: js.UndefOr[TerminologyDataLocation] = js.undefined,
        TerminologyProperties: js.UndefOr[TerminologyProperties] = js.undefined
    ): GetTerminologyResponse = {
      val __obj = js.Dynamic.literal()
      TerminologyDataLocation.foreach(__v => __obj.updateDynamic("TerminologyDataLocation")(__v.asInstanceOf[js.Any]))
      TerminologyProperties.foreach(__v => __obj.updateDynamic("TerminologyProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTerminologyResponse]
    }
  }

  @js.native
  trait ImportTerminologyRequest extends js.Object {
    var MergeStrategy: MergeStrategy
    var Name: ResourceName
    var TerminologyData: TerminologyData
    var Description: js.UndefOr[Description]
    var EncryptionKey: js.UndefOr[EncryptionKey]
  }

  object ImportTerminologyRequest {
    @inline
    def apply(
        MergeStrategy: MergeStrategy,
        Name: ResourceName,
        TerminologyData: TerminologyData,
        Description: js.UndefOr[Description] = js.undefined,
        EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    ): ImportTerminologyRequest = {
      val __obj = js.Dynamic.literal(
        "MergeStrategy" -> MergeStrategy.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "TerminologyData" -> TerminologyData.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportTerminologyRequest]
    }
  }

  @js.native
  trait ImportTerminologyResponse extends js.Object {
    var TerminologyProperties: js.UndefOr[TerminologyProperties]
  }

  object ImportTerminologyResponse {
    @inline
    def apply(
        TerminologyProperties: js.UndefOr[TerminologyProperties] = js.undefined
    ): ImportTerminologyResponse = {
      val __obj = js.Dynamic.literal()
      TerminologyProperties.foreach(__v => __obj.updateDynamic("TerminologyProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportTerminologyResponse]
    }
  }

  /** The input configuration properties for requesting a batch translation job.
    */
  @js.native
  trait InputDataConfig extends js.Object {
    var ContentType: ContentType
    var S3Uri: S3Uri
  }

  object InputDataConfig {
    @inline
    def apply(
        ContentType: ContentType,
        S3Uri: S3Uri
    ): InputDataConfig = {
      val __obj = js.Dynamic.literal(
        "ContentType" -> ContentType.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputDataConfig]
    }
  }

  /** The number of documents successfully and unsuccessfully processed during a translation job.
    */
  @js.native
  trait JobDetails extends js.Object {
    var DocumentsWithErrorsCount: js.UndefOr[Int]
    var InputDocumentsCount: js.UndefOr[Int]
    var TranslatedDocumentsCount: js.UndefOr[Int]
  }

  object JobDetails {
    @inline
    def apply(
        DocumentsWithErrorsCount: js.UndefOr[Int] = js.undefined,
        InputDocumentsCount: js.UndefOr[Int] = js.undefined,
        TranslatedDocumentsCount: js.UndefOr[Int] = js.undefined
    ): JobDetails = {
      val __obj = js.Dynamic.literal()
      DocumentsWithErrorsCount.foreach(__v => __obj.updateDynamic("DocumentsWithErrorsCount")(__v.asInstanceOf[js.Any]))
      InputDocumentsCount.foreach(__v => __obj.updateDynamic("InputDocumentsCount")(__v.asInstanceOf[js.Any]))
      TranslatedDocumentsCount.foreach(__v => __obj.updateDynamic("TranslatedDocumentsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDetails]
    }
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus {
    val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
    val COMPLETED_WITH_ERROR = "COMPLETED_WITH_ERROR".asInstanceOf[JobStatus]
    val FAILED = "FAILED".asInstanceOf[JobStatus]
    val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[JobStatus]
    val STOPPED = "STOPPED".asInstanceOf[JobStatus]

    @inline def values = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED)
  }

  @js.native
  trait ListParallelDataRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListParallelDataRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListParallelDataRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListParallelDataRequest]
    }
  }

  @js.native
  trait ListParallelDataResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ParallelDataPropertiesList: js.UndefOr[ParallelDataPropertiesList]
  }

  object ListParallelDataResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParallelDataPropertiesList: js.UndefOr[ParallelDataPropertiesList] = js.undefined
    ): ListParallelDataResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParallelDataPropertiesList.foreach(__v => __obj.updateDynamic("ParallelDataPropertiesList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListParallelDataResponse]
    }
  }

  @js.native
  trait ListTerminologiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTerminologiesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTerminologiesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTerminologiesRequest]
    }
  }

  @js.native
  trait ListTerminologiesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList]
  }

  object ListTerminologiesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList] = js.undefined
    ): ListTerminologiesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TerminologyPropertiesList.foreach(__v => __obj.updateDynamic("TerminologyPropertiesList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTerminologiesResponse]
    }
  }

  @js.native
  trait ListTextTranslationJobsRequest extends js.Object {
    var Filter: js.UndefOr[TextTranslationJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTextTranslationJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[TextTranslationJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTextTranslationJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTextTranslationJobsRequest]
    }
  }

  @js.native
  trait ListTextTranslationJobsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TextTranslationJobPropertiesList: js.UndefOr[TextTranslationJobPropertiesList]
  }

  object ListTextTranslationJobsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TextTranslationJobPropertiesList: js.UndefOr[TextTranslationJobPropertiesList] = js.undefined
    ): ListTextTranslationJobsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TextTranslationJobPropertiesList.foreach(__v => __obj.updateDynamic("TextTranslationJobPropertiesList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTextTranslationJobsResponse]
    }
  }

  @js.native
  sealed trait MergeStrategy extends js.Any
  object MergeStrategy {
    val OVERWRITE = "OVERWRITE".asInstanceOf[MergeStrategy]

    @inline def values = js.Array(OVERWRITE)
  }

  /** The output configuration properties for a batch translation job.
    */
  @js.native
  trait OutputDataConfig extends js.Object {
    var S3Uri: S3Uri
  }

  object OutputDataConfig {
    @inline
    def apply(
        S3Uri: S3Uri
    ): OutputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutputDataConfig]
    }
  }

  /** Specifies the format and S3 location of the parallel data input file.
    */
  @js.native
  trait ParallelDataConfig extends js.Object {
    var Format: ParallelDataFormat
    var S3Uri: S3Uri
  }

  object ParallelDataConfig {
    @inline
    def apply(
        Format: ParallelDataFormat,
        S3Uri: S3Uri
    ): ParallelDataConfig = {
      val __obj = js.Dynamic.literal(
        "Format" -> Format.asInstanceOf[js.Any],
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ParallelDataConfig]
    }
  }

  /** The location of the most recent parallel data input file that was successfully imported into Amazon Translate.
    */
  @js.native
  trait ParallelDataDataLocation extends js.Object {
    var Location: String
    var RepositoryType: String
  }

  object ParallelDataDataLocation {
    @inline
    def apply(
        Location: String,
        RepositoryType: String
    ): ParallelDataDataLocation = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "RepositoryType" -> RepositoryType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ParallelDataDataLocation]
    }
  }

  @js.native
  sealed trait ParallelDataFormat extends js.Any
  object ParallelDataFormat {
    val TSV = "TSV".asInstanceOf[ParallelDataFormat]
    val CSV = "CSV".asInstanceOf[ParallelDataFormat]
    val TMX = "TMX".asInstanceOf[ParallelDataFormat]

    @inline def values = js.Array(TSV, CSV, TMX)
  }

  /** The properties of a parallel data resource.
    */
  @js.native
  trait ParallelDataProperties extends js.Object {
    var Arn: js.UndefOr[ParallelDataArn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var EncryptionKey: js.UndefOr[EncryptionKey]
    var FailedRecordCount: js.UndefOr[Double]
    var ImportedDataSize: js.UndefOr[Double]
    var ImportedRecordCount: js.UndefOr[Double]
    var LastUpdatedAt: js.UndefOr[Timestamp]
    var LatestUpdateAttemptAt: js.UndefOr[Timestamp]
    var LatestUpdateAttemptStatus: js.UndefOr[ParallelDataStatus]
    var Message: js.UndefOr[UnboundedLengthString]
    var Name: js.UndefOr[ResourceName]
    var ParallelDataConfig: js.UndefOr[ParallelDataConfig]
    var SkippedRecordCount: js.UndefOr[Double]
    var SourceLanguageCode: js.UndefOr[LanguageCodeString]
    var Status: js.UndefOr[ParallelDataStatus]
    var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList]
  }

  object ParallelDataProperties {
    @inline
    def apply(
        Arn: js.UndefOr[ParallelDataArn] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined,
        FailedRecordCount: js.UndefOr[Double] = js.undefined,
        ImportedDataSize: js.UndefOr[Double] = js.undefined,
        ImportedRecordCount: js.UndefOr[Double] = js.undefined,
        LastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        LatestUpdateAttemptAt: js.UndefOr[Timestamp] = js.undefined,
        LatestUpdateAttemptStatus: js.UndefOr[ParallelDataStatus] = js.undefined,
        Message: js.UndefOr[UnboundedLengthString] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        ParallelDataConfig: js.UndefOr[ParallelDataConfig] = js.undefined,
        SkippedRecordCount: js.UndefOr[Double] = js.undefined,
        SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined,
        Status: js.UndefOr[ParallelDataStatus] = js.undefined,
        TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.undefined
    ): ParallelDataProperties = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      FailedRecordCount.foreach(__v => __obj.updateDynamic("FailedRecordCount")(__v.asInstanceOf[js.Any]))
      ImportedDataSize.foreach(__v => __obj.updateDynamic("ImportedDataSize")(__v.asInstanceOf[js.Any]))
      ImportedRecordCount.foreach(__v => __obj.updateDynamic("ImportedRecordCount")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      LatestUpdateAttemptAt.foreach(__v => __obj.updateDynamic("LatestUpdateAttemptAt")(__v.asInstanceOf[js.Any]))
      LatestUpdateAttemptStatus.foreach(__v => __obj.updateDynamic("LatestUpdateAttemptStatus")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ParallelDataConfig.foreach(__v => __obj.updateDynamic("ParallelDataConfig")(__v.asInstanceOf[js.Any]))
      SkippedRecordCount.foreach(__v => __obj.updateDynamic("SkippedRecordCount")(__v.asInstanceOf[js.Any]))
      SourceLanguageCode.foreach(__v => __obj.updateDynamic("SourceLanguageCode")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetLanguageCodes.foreach(__v => __obj.updateDynamic("TargetLanguageCodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParallelDataProperties]
    }
  }

  @js.native
  sealed trait ParallelDataStatus extends js.Any
  object ParallelDataStatus {
    val CREATING = "CREATING".asInstanceOf[ParallelDataStatus]
    val UPDATING = "UPDATING".asInstanceOf[ParallelDataStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[ParallelDataStatus]
    val DELETING = "DELETING".asInstanceOf[ParallelDataStatus]
    val FAILED = "FAILED".asInstanceOf[ParallelDataStatus]

    @inline def values = js.Array(CREATING, UPDATING, ACTIVE, DELETING, FAILED)
  }

  @js.native
  trait StartTextTranslationJobRequest extends js.Object {
    var ClientToken: ClientTokenString
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var SourceLanguageCode: LanguageCodeString
    var TargetLanguageCodes: TargetLanguageCodeStringList
    var JobName: js.UndefOr[JobName]
    var ParallelDataNames: js.UndefOr[ResourceNameList]
    var TerminologyNames: js.UndefOr[ResourceNameList]
  }

  object StartTextTranslationJobRequest {
    @inline
    def apply(
        ClientToken: ClientTokenString,
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        SourceLanguageCode: LanguageCodeString,
        TargetLanguageCodes: TargetLanguageCodeStringList,
        JobName: js.UndefOr[JobName] = js.undefined,
        ParallelDataNames: js.UndefOr[ResourceNameList] = js.undefined,
        TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined
    ): StartTextTranslationJobRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any],
        "SourceLanguageCode" -> SourceLanguageCode.asInstanceOf[js.Any],
        "TargetLanguageCodes" -> TargetLanguageCodes.asInstanceOf[js.Any]
      )

      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      ParallelDataNames.foreach(__v => __obj.updateDynamic("ParallelDataNames")(__v.asInstanceOf[js.Any]))
      TerminologyNames.foreach(__v => __obj.updateDynamic("TerminologyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTextTranslationJobRequest]
    }
  }

  @js.native
  trait StartTextTranslationJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StartTextTranslationJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StartTextTranslationJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTextTranslationJobResponse]
    }
  }

  @js.native
  trait StopTextTranslationJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopTextTranslationJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopTextTranslationJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopTextTranslationJobRequest]
    }
  }

  @js.native
  trait StopTextTranslationJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
    var JobStatus: js.UndefOr[JobStatus]
  }

  object StopTextTranslationJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined
    ): StopTextTranslationJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopTextTranslationJobResponse]
    }
  }

  /** The term being translated by the custom terminology.
    */
  @js.native
  trait Term extends js.Object {
    var SourceText: js.UndefOr[String]
    var TargetText: js.UndefOr[String]
  }

  object Term {
    @inline
    def apply(
        SourceText: js.UndefOr[String] = js.undefined,
        TargetText: js.UndefOr[String] = js.undefined
    ): Term = {
      val __obj = js.Dynamic.literal()
      SourceText.foreach(__v => __obj.updateDynamic("SourceText")(__v.asInstanceOf[js.Any]))
      TargetText.foreach(__v => __obj.updateDynamic("TargetText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Term]
    }
  }

  /** The data associated with the custom terminology.
    */
  @js.native
  trait TerminologyData extends js.Object {
    var File: TerminologyFile
    var Format: TerminologyDataFormat
  }

  object TerminologyData {
    @inline
    def apply(
        File: TerminologyFile,
        Format: TerminologyDataFormat
    ): TerminologyData = {
      val __obj = js.Dynamic.literal(
        "File" -> File.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TerminologyData]
    }
  }

  @js.native
  sealed trait TerminologyDataFormat extends js.Any
  object TerminologyDataFormat {
    val CSV = "CSV".asInstanceOf[TerminologyDataFormat]
    val TMX = "TMX".asInstanceOf[TerminologyDataFormat]

    @inline def values = js.Array(CSV, TMX)
  }

  /** The location of the custom terminology data.
    */
  @js.native
  trait TerminologyDataLocation extends js.Object {
    var Location: String
    var RepositoryType: String
  }

  object TerminologyDataLocation {
    @inline
    def apply(
        Location: String,
        RepositoryType: String
    ): TerminologyDataLocation = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "RepositoryType" -> RepositoryType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TerminologyDataLocation]
    }
  }

  /** The properties of the custom terminology.
    */
  @js.native
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

  object TerminologyProperties {
    @inline
    def apply(
        Arn: js.UndefOr[TerminologyArn] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined,
        LastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        SizeBytes: js.UndefOr[Int] = js.undefined,
        SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined,
        TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.undefined,
        TermCount: js.UndefOr[Int] = js.undefined
    ): TerminologyProperties = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SizeBytes.foreach(__v => __obj.updateDynamic("SizeBytes")(__v.asInstanceOf[js.Any]))
      SourceLanguageCode.foreach(__v => __obj.updateDynamic("SourceLanguageCode")(__v.asInstanceOf[js.Any]))
      TargetLanguageCodes.foreach(__v => __obj.updateDynamic("TargetLanguageCodes")(__v.asInstanceOf[js.Any]))
      TermCount.foreach(__v => __obj.updateDynamic("TermCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminologyProperties]
    }
  }

  /** Provides information for filtering a list of translation jobs. For more information, see <a>ListTextTranslationJobs</a>.
    */
  @js.native
  trait TextTranslationJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmittedAfterTime: js.UndefOr[Timestamp]
    var SubmittedBeforeTime: js.UndefOr[Timestamp]
  }

  object TextTranslationJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmittedAfterTime: js.UndefOr[Timestamp] = js.undefined,
        SubmittedBeforeTime: js.UndefOr[Timestamp] = js.undefined
    ): TextTranslationJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmittedAfterTime.foreach(__v => __obj.updateDynamic("SubmittedAfterTime")(__v.asInstanceOf[js.Any]))
      SubmittedBeforeTime.foreach(__v => __obj.updateDynamic("SubmittedBeforeTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextTranslationJobFilter]
    }
  }

  /** Provides information about a translation job.
    */
  @js.native
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
    var ParallelDataNames: js.UndefOr[ResourceNameList]
    var SourceLanguageCode: js.UndefOr[LanguageCodeString]
    var SubmittedTime: js.UndefOr[Timestamp]
    var TargetLanguageCodes: js.UndefOr[TargetLanguageCodeStringList]
    var TerminologyNames: js.UndefOr[ResourceNameList]
  }

  object TextTranslationJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobDetails: js.UndefOr[JobDetails] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        Message: js.UndefOr[UnboundedLengthString] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        ParallelDataNames: js.UndefOr[ResourceNameList] = js.undefined,
        SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined,
        SubmittedTime: js.UndefOr[Timestamp] = js.undefined,
        TargetLanguageCodes: js.UndefOr[TargetLanguageCodeStringList] = js.undefined,
        TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined
    ): TextTranslationJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobDetails.foreach(__v => __obj.updateDynamic("JobDetails")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      ParallelDataNames.foreach(__v => __obj.updateDynamic("ParallelDataNames")(__v.asInstanceOf[js.Any]))
      SourceLanguageCode.foreach(__v => __obj.updateDynamic("SourceLanguageCode")(__v.asInstanceOf[js.Any]))
      SubmittedTime.foreach(__v => __obj.updateDynamic("SubmittedTime")(__v.asInstanceOf[js.Any]))
      TargetLanguageCodes.foreach(__v => __obj.updateDynamic("TargetLanguageCodes")(__v.asInstanceOf[js.Any]))
      TerminologyNames.foreach(__v => __obj.updateDynamic("TerminologyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextTranslationJobProperties]
    }
  }

  @js.native
  trait TranslateTextRequest extends js.Object {
    var SourceLanguageCode: LanguageCodeString
    var TargetLanguageCode: LanguageCodeString
    var Text: BoundedLengthString
    var TerminologyNames: js.UndefOr[ResourceNameList]
  }

  object TranslateTextRequest {
    @inline
    def apply(
        SourceLanguageCode: LanguageCodeString,
        TargetLanguageCode: LanguageCodeString,
        Text: BoundedLengthString,
        TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined
    ): TranslateTextRequest = {
      val __obj = js.Dynamic.literal(
        "SourceLanguageCode" -> SourceLanguageCode.asInstanceOf[js.Any],
        "TargetLanguageCode" -> TargetLanguageCode.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any]
      )

      TerminologyNames.foreach(__v => __obj.updateDynamic("TerminologyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranslateTextRequest]
    }
  }

  @js.native
  trait TranslateTextResponse extends js.Object {
    var SourceLanguageCode: LanguageCodeString
    var TargetLanguageCode: LanguageCodeString
    var TranslatedText: String
    var AppliedTerminologies: js.UndefOr[AppliedTerminologyList]
  }

  object TranslateTextResponse {
    @inline
    def apply(
        SourceLanguageCode: LanguageCodeString,
        TargetLanguageCode: LanguageCodeString,
        TranslatedText: String,
        AppliedTerminologies: js.UndefOr[AppliedTerminologyList] = js.undefined
    ): TranslateTextResponse = {
      val __obj = js.Dynamic.literal(
        "SourceLanguageCode" -> SourceLanguageCode.asInstanceOf[js.Any],
        "TargetLanguageCode" -> TargetLanguageCode.asInstanceOf[js.Any],
        "TranslatedText" -> TranslatedText.asInstanceOf[js.Any]
      )

      AppliedTerminologies.foreach(__v => __obj.updateDynamic("AppliedTerminologies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranslateTextResponse]
    }
  }

  @js.native
  trait UpdateParallelDataRequest extends js.Object {
    var ClientToken: ClientTokenString
    var Name: ResourceName
    var ParallelDataConfig: ParallelDataConfig
    var Description: js.UndefOr[Description]
  }

  object UpdateParallelDataRequest {
    @inline
    def apply(
        ClientToken: ClientTokenString,
        Name: ResourceName,
        ParallelDataConfig: ParallelDataConfig,
        Description: js.UndefOr[Description] = js.undefined
    ): UpdateParallelDataRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ParallelDataConfig" -> ParallelDataConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateParallelDataRequest]
    }
  }

  @js.native
  trait UpdateParallelDataResponse extends js.Object {
    var LatestUpdateAttemptAt: js.UndefOr[Timestamp]
    var LatestUpdateAttemptStatus: js.UndefOr[ParallelDataStatus]
    var Name: js.UndefOr[ResourceName]
    var Status: js.UndefOr[ParallelDataStatus]
  }

  object UpdateParallelDataResponse {
    @inline
    def apply(
        LatestUpdateAttemptAt: js.UndefOr[Timestamp] = js.undefined,
        LatestUpdateAttemptStatus: js.UndefOr[ParallelDataStatus] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        Status: js.UndefOr[ParallelDataStatus] = js.undefined
    ): UpdateParallelDataResponse = {
      val __obj = js.Dynamic.literal()
      LatestUpdateAttemptAt.foreach(__v => __obj.updateDynamic("LatestUpdateAttemptAt")(__v.asInstanceOf[js.Any]))
      LatestUpdateAttemptStatus.foreach(__v => __obj.updateDynamic("LatestUpdateAttemptStatus")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateParallelDataResponse]
    }
  }
}
