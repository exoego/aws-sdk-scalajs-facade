package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object comprehendmedical {
  type AnyLengthString                         = String
  type AttributeList                           = js.Array[Attribute]
  type AttributeName                           = String
  type BoundedLengthString                     = String
  type ClientRequestTokenString                = String
  type ComprehendMedicalAsyncJobPropertiesList = js.Array[ComprehendMedicalAsyncJobProperties]
  type EntityList                              = js.Array[Entity]
  type EntitySubType                           = String
  type EntityType                              = String
  type IamRoleArn                              = String
  type JobId                                   = String
  type JobName                                 = String
  type JobStatus                               = String
  type KMSKey                                  = String
  type LanguageCode                            = String
  type ManifestFilePath                        = String
  type MaxResultsInteger                       = Int
  type ModelVersion                            = String
  type S3Bucket                                = String
  type S3Key                                   = String
  type Timestamp                               = js.Date
  type TraitList                               = js.Array[Trait]
  type UnmappedAttributeList                   = js.Array[UnmappedAttribute]

  implicit final class ComprehendMedicalOps(private val service: ComprehendMedical) extends AnyVal {
    @inline def describeEntitiesDetectionV2JobFuture(
        params: DescribeEntitiesDetectionV2JobRequest
    ): Future[DescribeEntitiesDetectionV2JobResponse] = service.describeEntitiesDetectionV2Job(params).promise.toFuture
    @inline def describePHIDetectionJobFuture(
        params: DescribePHIDetectionJobRequest
    ): Future[DescribePHIDetectionJobResponse] = service.describePHIDetectionJob(params).promise.toFuture
    @inline def detectEntitiesV2Future(params: DetectEntitiesV2Request): Future[DetectEntitiesV2Response] =
      service.detectEntitiesV2(params).promise.toFuture
    @inline def detectPHIFuture(params: DetectPHIRequest): Future[DetectPHIResponse] =
      service.detectPHI(params).promise.toFuture
    @inline def listEntitiesDetectionV2JobsFuture(
        params: ListEntitiesDetectionV2JobsRequest
    ): Future[ListEntitiesDetectionV2JobsResponse] = service.listEntitiesDetectionV2Jobs(params).promise.toFuture
    @inline def listPHIDetectionJobsFuture(params: ListPHIDetectionJobsRequest): Future[ListPHIDetectionJobsResponse] =
      service.listPHIDetectionJobs(params).promise.toFuture
    @inline def startEntitiesDetectionV2JobFuture(
        params: StartEntitiesDetectionV2JobRequest
    ): Future[StartEntitiesDetectionV2JobResponse] = service.startEntitiesDetectionV2Job(params).promise.toFuture
    @inline def startPHIDetectionJobFuture(params: StartPHIDetectionJobRequest): Future[StartPHIDetectionJobResponse] =
      service.startPHIDetectionJob(params).promise.toFuture
    @inline def stopEntitiesDetectionV2JobFuture(
        params: StopEntitiesDetectionV2JobRequest
    ): Future[StopEntitiesDetectionV2JobResponse] = service.stopEntitiesDetectionV2Job(params).promise.toFuture
    @inline def stopPHIDetectionJobFuture(params: StopPHIDetectionJobRequest): Future[StopPHIDetectionJobResponse] =
      service.stopPHIDetectionJob(params).promise.toFuture
  }
}

package comprehendmedical {
  @js.native
  @JSImport("aws-sdk", "ComprehendMedical")
  class ComprehendMedical() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeEntitiesDetectionV2Job(
        params: DescribeEntitiesDetectionV2JobRequest
    ): Request[DescribeEntitiesDetectionV2JobResponse] = js.native
    def describePHIDetectionJob(params: DescribePHIDetectionJobRequest): Request[DescribePHIDetectionJobResponse] =
      js.native
    def detectEntitiesV2(params: DetectEntitiesV2Request): Request[DetectEntitiesV2Response] = js.native
    def detectPHI(params: DetectPHIRequest): Request[DetectPHIResponse]                      = js.native
    def listEntitiesDetectionV2Jobs(
        params: ListEntitiesDetectionV2JobsRequest
    ): Request[ListEntitiesDetectionV2JobsResponse]                                                      = js.native
    def listPHIDetectionJobs(params: ListPHIDetectionJobsRequest): Request[ListPHIDetectionJobsResponse] = js.native
    def startEntitiesDetectionV2Job(
        params: StartEntitiesDetectionV2JobRequest
    ): Request[StartEntitiesDetectionV2JobResponse]                                                      = js.native
    def startPHIDetectionJob(params: StartPHIDetectionJobRequest): Request[StartPHIDetectionJobResponse] = js.native
    def stopEntitiesDetectionV2Job(
        params: StopEntitiesDetectionV2JobRequest
    ): Request[StopEntitiesDetectionV2JobResponse]                                                    = js.native
    def stopPHIDetectionJob(params: StopPHIDetectionJobRequest): Request[StopPHIDetectionJobResponse] = js.native
    @deprecated("This operation is deprecated, use DetectEntitiesV2 instead.", "forever") def detectEntities(
        params: DetectEntitiesRequest
    ): Request[DetectEntitiesResponse] = js.native
  }

  /**
    * An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the dosage of a medication taken. It contains information about the attribute such as id, begin and end offset within the input text, and the segment of the input text.
    */
  @js.native
  trait Attribute extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var RelationshipScore: js.UndefOr[Float]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Traits: js.UndefOr[TraitList]
    var Type: js.UndefOr[EntitySubType]
  }

  object Attribute {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        RelationshipScore: js.UndefOr[Float] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Traits: js.UndefOr[TraitList] = js.undefined,
        Type: js.UndefOr[EntitySubType] = js.undefined
    ): Attribute = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      RelationshipScore.foreach(__v => __obj.updateDynamic("RelationshipScore")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  object AttributeNameEnum {
    val SIGN      = "SIGN"
    val SYMPTOM   = "SYMPTOM"
    val DIAGNOSIS = "DIAGNOSIS"
    val NEGATION  = "NEGATION"

    val values = js.Object.freeze(js.Array(SIGN, SYMPTOM, DIAGNOSIS, NEGATION))
  }

  /**
    * Provides information for filtering a list of detection jobs.
    */
  @js.native
  trait ComprehendMedicalAsyncJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  object ComprehendMedicalAsyncJobFilter {
    @inline
    def apply(
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        SubmitTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        SubmitTimeBefore: js.UndefOr[Timestamp] = js.undefined
    ): ComprehendMedicalAsyncJobFilter = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      SubmitTimeAfter.foreach(__v => __obj.updateDynamic("SubmitTimeAfter")(__v.asInstanceOf[js.Any]))
      SubmitTimeBefore.foreach(__v => __obj.updateDynamic("SubmitTimeBefore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComprehendMedicalAsyncJobFilter]
    }
  }

  /**
    * Provides information about a detection job.
    */
  @js.native
  trait ComprehendMedicalAsyncJobProperties extends js.Object {
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var EndTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var KMSKey: js.UndefOr[KMSKey]
    var LanguageCode: js.UndefOr[LanguageCode]
    var ManifestFilePath: js.UndefOr[ManifestFilePath]
    var Message: js.UndefOr[AnyLengthString]
    var ModelVersion: js.UndefOr[ModelVersion]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var SubmitTime: js.UndefOr[Timestamp]
  }

  object ComprehendMedicalAsyncJobProperties {
    @inline
    def apply(
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobStatus: js.UndefOr[JobStatus] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        ManifestFilePath: js.UndefOr[ManifestFilePath] = js.undefined,
        Message: js.UndefOr[AnyLengthString] = js.undefined,
        ModelVersion: js.UndefOr[ModelVersion] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined
    ): ComprehendMedicalAsyncJobProperties = {
      val __obj = js.Dynamic.literal()
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.updateDynamic("KMSKey")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      ManifestFilePath.foreach(__v => __obj.updateDynamic("ManifestFilePath")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComprehendMedicalAsyncJobProperties]
    }
  }

  @js.native
  trait DescribeEntitiesDetectionV2JobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeEntitiesDetectionV2JobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeEntitiesDetectionV2JobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeEntitiesDetectionV2JobRequest]
    }
  }

  @js.native
  trait DescribeEntitiesDetectionV2JobResponse extends js.Object {
    var ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties]
  }

  object DescribeEntitiesDetectionV2JobResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties] = js.undefined
    ): DescribeEntitiesDetectionV2JobResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobProperties.foreach(
        __v => __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeEntitiesDetectionV2JobResponse]
    }
  }

  @js.native
  trait DescribePHIDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribePHIDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribePHIDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePHIDetectionJobRequest]
    }
  }

  @js.native
  trait DescribePHIDetectionJobResponse extends js.Object {
    var ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties]
  }

  object DescribePHIDetectionJobResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties] = js.undefined
    ): DescribePHIDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobProperties.foreach(
        __v => __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribePHIDetectionJobResponse]
    }
  }

  @js.native
  trait DetectEntitiesRequest extends js.Object {
    var Text: BoundedLengthString
  }

  object DetectEntitiesRequest {
    @inline
    def apply(
        Text: BoundedLengthString
    ): DetectEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectEntitiesRequest]
    }
  }

  @js.native
  trait DetectEntitiesResponse extends js.Object {
    var Entities: EntityList
    var ModelVersion: String
    var PaginationToken: js.UndefOr[String]
    var UnmappedAttributes: js.UndefOr[UnmappedAttributeList]
  }

  object DetectEntitiesResponse {
    @inline
    def apply(
        Entities: EntityList,
        ModelVersion: String,
        PaginationToken: js.UndefOr[String] = js.undefined,
        UnmappedAttributes: js.UndefOr[UnmappedAttributeList] = js.undefined
    ): DetectEntitiesResponse = {
      val __obj = js.Dynamic.literal(
        "Entities"     -> Entities.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any]
      )

      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      UnmappedAttributes.foreach(__v => __obj.updateDynamic("UnmappedAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectEntitiesResponse]
    }
  }

  @js.native
  trait DetectEntitiesV2Request extends js.Object {
    var Text: BoundedLengthString
  }

  object DetectEntitiesV2Request {
    @inline
    def apply(
        Text: BoundedLengthString
    ): DetectEntitiesV2Request = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectEntitiesV2Request]
    }
  }

  @js.native
  trait DetectEntitiesV2Response extends js.Object {
    var Entities: EntityList
    var ModelVersion: String
    var PaginationToken: js.UndefOr[String]
    var UnmappedAttributes: js.UndefOr[UnmappedAttributeList]
  }

  object DetectEntitiesV2Response {
    @inline
    def apply(
        Entities: EntityList,
        ModelVersion: String,
        PaginationToken: js.UndefOr[String] = js.undefined,
        UnmappedAttributes: js.UndefOr[UnmappedAttributeList] = js.undefined
    ): DetectEntitiesV2Response = {
      val __obj = js.Dynamic.literal(
        "Entities"     -> Entities.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any]
      )

      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      UnmappedAttributes.foreach(__v => __obj.updateDynamic("UnmappedAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectEntitiesV2Response]
    }
  }

  @js.native
  trait DetectPHIRequest extends js.Object {
    var Text: BoundedLengthString
  }

  object DetectPHIRequest {
    @inline
    def apply(
        Text: BoundedLengthString
    ): DetectPHIRequest = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectPHIRequest]
    }
  }

  @js.native
  trait DetectPHIResponse extends js.Object {
    var Entities: EntityList
    var ModelVersion: String
    var PaginationToken: js.UndefOr[String]
  }

  object DetectPHIResponse {
    @inline
    def apply(
        Entities: EntityList,
        ModelVersion: String,
        PaginationToken: js.UndefOr[String] = js.undefined
    ): DetectPHIResponse = {
      val __obj = js.Dynamic.literal(
        "Entities"     -> Entities.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any]
      )

      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectPHIResponse]
    }
  }

  /**
    * Provides information about an extracted medical entity.
    */
  @js.native
  trait Entity extends js.Object {
    var Attributes: js.UndefOr[AttributeList]
    var BeginOffset: js.UndefOr[Int]
    var Category: js.UndefOr[EntityType]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Traits: js.UndefOr[TraitList]
    var Type: js.UndefOr[EntitySubType]
  }

  object Entity {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributeList] = js.undefined,
        BeginOffset: js.UndefOr[Int] = js.undefined,
        Category: js.UndefOr[EntityType] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Traits: js.UndefOr[TraitList] = js.undefined,
        Type: js.UndefOr[EntitySubType] = js.undefined
    ): Entity = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Entity]
    }
  }

  object EntitySubTypeEnum {
    val NAME              = "NAME"
    val DOSAGE            = "DOSAGE"
    val ROUTE_OR_MODE     = "ROUTE_OR_MODE"
    val FORM              = "FORM"
    val FREQUENCY         = "FREQUENCY"
    val DURATION          = "DURATION"
    val GENERIC_NAME      = "GENERIC_NAME"
    val BRAND_NAME        = "BRAND_NAME"
    val STRENGTH          = "STRENGTH"
    val RATE              = "RATE"
    val ACUITY            = "ACUITY"
    val TEST_NAME         = "TEST_NAME"
    val TEST_VALUE        = "TEST_VALUE"
    val TEST_UNITS        = "TEST_UNITS"
    val PROCEDURE_NAME    = "PROCEDURE_NAME"
    val TREATMENT_NAME    = "TREATMENT_NAME"
    val DATE              = "DATE"
    val AGE               = "AGE"
    val CONTACT_POINT     = "CONTACT_POINT"
    val EMAIL             = "EMAIL"
    val IDENTIFIER        = "IDENTIFIER"
    val URL               = "URL"
    val ADDRESS           = "ADDRESS"
    val PROFESSION        = "PROFESSION"
    val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE"
    val DIRECTION         = "DIRECTION"
    val QUALITY           = "QUALITY"
    val QUANTITY          = "QUANTITY"

    val values = js.Object.freeze(
      js.Array(
        NAME,
        DOSAGE,
        ROUTE_OR_MODE,
        FORM,
        FREQUENCY,
        DURATION,
        GENERIC_NAME,
        BRAND_NAME,
        STRENGTH,
        RATE,
        ACUITY,
        TEST_NAME,
        TEST_VALUE,
        TEST_UNITS,
        PROCEDURE_NAME,
        TREATMENT_NAME,
        DATE,
        AGE,
        CONTACT_POINT,
        EMAIL,
        IDENTIFIER,
        URL,
        ADDRESS,
        PROFESSION,
        SYSTEM_ORGAN_SITE,
        DIRECTION,
        QUALITY,
        QUANTITY
      )
    )
  }

  object EntityTypeEnum {
    val MEDICATION                   = "MEDICATION"
    val MEDICAL_CONDITION            = "MEDICAL_CONDITION"
    val PROTECTED_HEALTH_INFORMATION = "PROTECTED_HEALTH_INFORMATION"
    val TEST_TREATMENT_PROCEDURE     = "TEST_TREATMENT_PROCEDURE"
    val ANATOMY                      = "ANATOMY"

    val values = js.Object.freeze(
      js.Array(MEDICATION, MEDICAL_CONDITION, PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY)
    )
  }

  /**
    * The input properties for an entities detection job
    */
  @js.native
  trait InputDataConfig extends js.Object {
    var S3Bucket: S3Bucket
    var S3Key: js.UndefOr[S3Key]
  }

  object InputDataConfig {
    @inline
    def apply(
        S3Bucket: S3Bucket,
        S3Key: js.UndefOr[S3Key] = js.undefined
    ): InputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3Bucket" -> S3Bucket.asInstanceOf[js.Any]
      )

      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDataConfig]
    }
  }

  object JobStatusEnum {
    val SUBMITTED       = "SUBMITTED"
    val IN_PROGRESS     = "IN_PROGRESS"
    val COMPLETED       = "COMPLETED"
    val PARTIAL_SUCCESS = "PARTIAL_SUCCESS"
    val FAILED          = "FAILED"
    val STOP_REQUESTED  = "STOP_REQUESTED"
    val STOPPED         = "STOPPED"

    val values =
      js.Object.freeze(js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED))
  }

  object LanguageCodeEnum {
    val en = "en"

    val values = js.Object.freeze(js.Array(en))
  }

  @js.native
  trait ListEntitiesDetectionV2JobsRequest extends js.Object {
    var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListEntitiesDetectionV2JobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntitiesDetectionV2JobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesDetectionV2JobsRequest]
    }
  }

  @js.native
  trait ListEntitiesDetectionV2JobsResponse extends js.Object {
    var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListEntitiesDetectionV2JobsResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEntitiesDetectionV2JobsResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobPropertiesList.foreach(
        __v => __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesDetectionV2JobsResponse]
    }
  }

  @js.native
  trait ListPHIDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListPHIDetectionJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPHIDetectionJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPHIDetectionJobsRequest]
    }
  }

  @js.native
  trait ListPHIDetectionJobsResponse extends js.Object {
    var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListPHIDetectionJobsResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPHIDetectionJobsResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobPropertiesList.foreach(
        __v => __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPHIDetectionJobsResponse]
    }
  }

  /**
    * The output properties for a detection job.
    */
  @js.native
  trait OutputDataConfig extends js.Object {
    var S3Bucket: S3Bucket
    var S3Key: js.UndefOr[S3Key]
  }

  object OutputDataConfig {
    @inline
    def apply(
        S3Bucket: S3Bucket,
        S3Key: js.UndefOr[S3Key] = js.undefined
    ): OutputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3Bucket" -> S3Bucket.asInstanceOf[js.Any]
      )

      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDataConfig]
    }
  }

  @js.native
  trait StartEntitiesDetectionV2JobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object StartEntitiesDetectionV2JobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined
    ): StartEntitiesDetectionV2JobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig"   -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode"      -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig"  -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.updateDynamic("KMSKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEntitiesDetectionV2JobRequest]
    }
  }

  @js.native
  trait StartEntitiesDetectionV2JobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartEntitiesDetectionV2JobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartEntitiesDetectionV2JobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartEntitiesDetectionV2JobResponse]
    }
  }

  @js.native
  trait StartPHIDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object StartPHIDetectionJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined
    ): StartPHIDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig"   -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode"      -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig"  -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.updateDynamic("KMSKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPHIDetectionJobRequest]
    }
  }

  @js.native
  trait StartPHIDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartPHIDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartPHIDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPHIDetectionJobResponse]
    }
  }

  @js.native
  trait StopEntitiesDetectionV2JobRequest extends js.Object {
    var JobId: JobId
  }

  object StopEntitiesDetectionV2JobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopEntitiesDetectionV2JobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopEntitiesDetectionV2JobRequest]
    }
  }

  @js.native
  trait StopEntitiesDetectionV2JobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StopEntitiesDetectionV2JobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StopEntitiesDetectionV2JobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopEntitiesDetectionV2JobResponse]
    }
  }

  @js.native
  trait StopPHIDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopPHIDetectionJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopPHIDetectionJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopPHIDetectionJobRequest]
    }
  }

  @js.native
  trait StopPHIDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StopPHIDetectionJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StopPHIDetectionJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopPHIDetectionJobResponse]
    }
  }

  /**
    * Provides contextual information about the extracted entity.
    */
  @js.native
  trait Trait extends js.Object {
    var Name: js.UndefOr[AttributeName]
    var Score: js.UndefOr[Float]
  }

  object Trait {
    @inline
    def apply(
        Name: js.UndefOr[AttributeName] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): Trait = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trait]
    }
  }

  /**
    * An attribute that we extracted, but were unable to relate to an entity.
    */
  @js.native
  trait UnmappedAttribute extends js.Object {
    var Attribute: js.UndefOr[Attribute]
    var Type: js.UndefOr[EntityType]
  }

  object UnmappedAttribute {
    @inline
    def apply(
        Attribute: js.UndefOr[Attribute] = js.undefined,
        Type: js.UndefOr[EntityType] = js.undefined
    ): UnmappedAttribute = {
      val __obj = js.Dynamic.literal()
      Attribute.foreach(__v => __obj.updateDynamic("Attribute")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnmappedAttribute]
    }
  }
}
