package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object comprehendmedical {
  type AnyLengthString                         = String
  type AttributeList                           = js.Array[Attribute]
  type BoundedLengthString                     = String
  type ClientRequestTokenString                = String
  type ComprehendMedicalAsyncJobPropertiesList = js.Array[ComprehendMedicalAsyncJobProperties]
  type EntityList                              = js.Array[Entity]
  type ICD10CMAttributeList                    = js.Array[ICD10CMAttribute]
  type ICD10CMConceptList                      = js.Array[ICD10CMConcept]
  type ICD10CMEntityList                       = js.Array[ICD10CMEntity]
  type ICD10CMTraitList                        = js.Array[ICD10CMTrait]
  type IamRoleArn                              = String
  type JobId                                   = String
  type JobName                                 = String
  type KMSKey                                  = String
  type ManifestFilePath                        = String
  type MaxResultsInteger                       = Int
  type ModelVersion                            = String
  type OntologyLinkingBoundedLengthString      = String
  type RxNormAttributeList                     = js.Array[RxNormAttribute]
  type RxNormConceptList                       = js.Array[RxNormConcept]
  type RxNormEntityList                        = js.Array[RxNormEntity]
  type RxNormTraitList                         = js.Array[RxNormTrait]
  type S3Bucket                                = String
  type S3Key                                   = String
  type Timestamp                               = js.Date
  type TraitList                               = js.Array[Trait]
  type UnmappedAttributeList                   = js.Array[UnmappedAttribute]

  implicit final class ComprehendMedicalOps(private val service: ComprehendMedical) extends AnyVal {

    @inline def describeEntitiesDetectionV2JobFuture(
        params: DescribeEntitiesDetectionV2JobRequest
    ): Future[DescribeEntitiesDetectionV2JobResponse] =
      service.describeEntitiesDetectionV2Job(params).promise().toFuture
    @inline def describePHIDetectionJobFuture(
        params: DescribePHIDetectionJobRequest
    ): Future[DescribePHIDetectionJobResponse] = service.describePHIDetectionJob(params).promise().toFuture
    @inline def detectEntitiesV2Future(params: DetectEntitiesV2Request): Future[DetectEntitiesV2Response] =
      service.detectEntitiesV2(params).promise().toFuture
    @inline def detectPHIFuture(params: DetectPHIRequest): Future[DetectPHIResponse] =
      service.detectPHI(params).promise().toFuture
    @inline def inferICD10CMFuture(params: InferICD10CMRequest): Future[InferICD10CMResponse] =
      service.inferICD10CM(params).promise().toFuture
    @inline def inferRxNormFuture(params: InferRxNormRequest): Future[InferRxNormResponse] =
      service.inferRxNorm(params).promise().toFuture
    @inline def listEntitiesDetectionV2JobsFuture(
        params: ListEntitiesDetectionV2JobsRequest
    ): Future[ListEntitiesDetectionV2JobsResponse] = service.listEntitiesDetectionV2Jobs(params).promise().toFuture
    @inline def listPHIDetectionJobsFuture(params: ListPHIDetectionJobsRequest): Future[ListPHIDetectionJobsResponse] =
      service.listPHIDetectionJobs(params).promise().toFuture
    @inline def startEntitiesDetectionV2JobFuture(
        params: StartEntitiesDetectionV2JobRequest
    ): Future[StartEntitiesDetectionV2JobResponse] = service.startEntitiesDetectionV2Job(params).promise().toFuture
    @inline def startPHIDetectionJobFuture(params: StartPHIDetectionJobRequest): Future[StartPHIDetectionJobResponse] =
      service.startPHIDetectionJob(params).promise().toFuture
    @inline def stopEntitiesDetectionV2JobFuture(
        params: StopEntitiesDetectionV2JobRequest
    ): Future[StopEntitiesDetectionV2JobResponse] = service.stopEntitiesDetectionV2Job(params).promise().toFuture
    @inline def stopPHIDetectionJobFuture(params: StopPHIDetectionJobRequest): Future[StopPHIDetectionJobResponse] =
      service.stopPHIDetectionJob(params).promise().toFuture
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
    def inferICD10CM(params: InferICD10CMRequest): Request[InferICD10CMResponse]             = js.native
    def inferRxNorm(params: InferRxNormRequest): Request[InferRxNormResponse]                = js.native
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
  @Factory
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

  @js.native
  sealed trait AttributeName extends js.Any
  object AttributeName extends js.Object {
    val SIGN      = "SIGN".asInstanceOf[AttributeName]
    val SYMPTOM   = "SYMPTOM".asInstanceOf[AttributeName]
    val DIAGNOSIS = "DIAGNOSIS".asInstanceOf[AttributeName]
    val NEGATION  = "NEGATION".asInstanceOf[AttributeName]

    val values = js.Object.freeze(js.Array(SIGN, SYMPTOM, DIAGNOSIS, NEGATION))
  }

  /**
    * Provides information for filtering a list of detection jobs.
    */
  @js.native
  @Factory
  trait ComprehendMedicalAsyncJobFilter extends js.Object {
    var JobName: js.UndefOr[JobName]
    var JobStatus: js.UndefOr[JobStatus]
    var SubmitTimeAfter: js.UndefOr[Timestamp]
    var SubmitTimeBefore: js.UndefOr[Timestamp]
  }

  /**
    * Provides information about a detection job.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeEntitiesDetectionV2JobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeEntitiesDetectionV2JobResponse extends js.Object {
    var ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties]
  }

  @js.native
  @Factory
  trait DescribePHIDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribePHIDetectionJobResponse extends js.Object {
    var ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties]
  }

  @js.native
  @Factory
  trait DetectEntitiesRequest extends js.Object {
    var Text: BoundedLengthString
  }

  @js.native
  @Factory
  trait DetectEntitiesResponse extends js.Object {
    var Entities: EntityList
    var ModelVersion: String
    var PaginationToken: js.UndefOr[String]
    var UnmappedAttributes: js.UndefOr[UnmappedAttributeList]
  }

  @js.native
  @Factory
  trait DetectEntitiesV2Request extends js.Object {
    var Text: BoundedLengthString
  }

  @js.native
  @Factory
  trait DetectEntitiesV2Response extends js.Object {
    var Entities: EntityList
    var ModelVersion: String
    var PaginationToken: js.UndefOr[String]
    var UnmappedAttributes: js.UndefOr[UnmappedAttributeList]
  }

  @js.native
  @Factory
  trait DetectPHIRequest extends js.Object {
    var Text: BoundedLengthString
  }

  @js.native
  @Factory
  trait DetectPHIResponse extends js.Object {
    var Entities: EntityList
    var ModelVersion: String
    var PaginationToken: js.UndefOr[String]
  }

  /**
    * Provides information about an extracted medical entity.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait EntitySubType extends js.Any
  object EntitySubType extends js.Object {
    val NAME              = "NAME".asInstanceOf[EntitySubType]
    val DOSAGE            = "DOSAGE".asInstanceOf[EntitySubType]
    val ROUTE_OR_MODE     = "ROUTE_OR_MODE".asInstanceOf[EntitySubType]
    val FORM              = "FORM".asInstanceOf[EntitySubType]
    val FREQUENCY         = "FREQUENCY".asInstanceOf[EntitySubType]
    val DURATION          = "DURATION".asInstanceOf[EntitySubType]
    val GENERIC_NAME      = "GENERIC_NAME".asInstanceOf[EntitySubType]
    val BRAND_NAME        = "BRAND_NAME".asInstanceOf[EntitySubType]
    val STRENGTH          = "STRENGTH".asInstanceOf[EntitySubType]
    val RATE              = "RATE".asInstanceOf[EntitySubType]
    val ACUITY            = "ACUITY".asInstanceOf[EntitySubType]
    val TEST_NAME         = "TEST_NAME".asInstanceOf[EntitySubType]
    val TEST_VALUE        = "TEST_VALUE".asInstanceOf[EntitySubType]
    val TEST_UNITS        = "TEST_UNITS".asInstanceOf[EntitySubType]
    val PROCEDURE_NAME    = "PROCEDURE_NAME".asInstanceOf[EntitySubType]
    val TREATMENT_NAME    = "TREATMENT_NAME".asInstanceOf[EntitySubType]
    val DATE              = "DATE".asInstanceOf[EntitySubType]
    val AGE               = "AGE".asInstanceOf[EntitySubType]
    val CONTACT_POINT     = "CONTACT_POINT".asInstanceOf[EntitySubType]
    val EMAIL             = "EMAIL".asInstanceOf[EntitySubType]
    val IDENTIFIER        = "IDENTIFIER".asInstanceOf[EntitySubType]
    val URL               = "URL".asInstanceOf[EntitySubType]
    val ADDRESS           = "ADDRESS".asInstanceOf[EntitySubType]
    val PROFESSION        = "PROFESSION".asInstanceOf[EntitySubType]
    val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE".asInstanceOf[EntitySubType]
    val DIRECTION         = "DIRECTION".asInstanceOf[EntitySubType]
    val QUALITY           = "QUALITY".asInstanceOf[EntitySubType]
    val QUANTITY          = "QUANTITY".asInstanceOf[EntitySubType]

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

  @js.native
  sealed trait EntityType extends js.Any
  object EntityType extends js.Object {
    val MEDICATION                   = "MEDICATION".asInstanceOf[EntityType]
    val MEDICAL_CONDITION            = "MEDICAL_CONDITION".asInstanceOf[EntityType]
    val PROTECTED_HEALTH_INFORMATION = "PROTECTED_HEALTH_INFORMATION".asInstanceOf[EntityType]
    val TEST_TREATMENT_PROCEDURE     = "TEST_TREATMENT_PROCEDURE".asInstanceOf[EntityType]
    val ANATOMY                      = "ANATOMY".asInstanceOf[EntityType]

    val values = js.Object.freeze(
      js.Array(MEDICATION, MEDICAL_CONDITION, PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY)
    )
  }

  /**
    * The detected attributes that relate to an entity. This includes an extracted segment of the text that is an attribute of an entity, or otherwise related to an entity. InferICD10CM detects the following attributes: <code>Direction</code>, <code>System, Organ or Site</code>, and <code>Acuity</code>.
    */
  @js.native
  @Factory
  trait ICD10CMAttribute extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var RelationshipScore: js.UndefOr[Float]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Traits: js.UndefOr[ICD10CMTraitList]
    var Type: js.UndefOr[ICD10CMAttributeType]
  }

  @js.native
  sealed trait ICD10CMAttributeType extends js.Any
  object ICD10CMAttributeType extends js.Object {
    val ACUITY            = "ACUITY".asInstanceOf[ICD10CMAttributeType]
    val DIRECTION         = "DIRECTION".asInstanceOf[ICD10CMAttributeType]
    val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE".asInstanceOf[ICD10CMAttributeType]
    val QUALITY           = "QUALITY".asInstanceOf[ICD10CMAttributeType]
    val QUANTITY          = "QUANTITY".asInstanceOf[ICD10CMAttributeType]

    val values = js.Object.freeze(js.Array(ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, QUALITY, QUANTITY))
  }

  /**
    * The ICD-10-CM concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  @js.native
  @Factory
  trait ICD10CMConcept extends js.Object {
    var Code: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  /**
    * The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Amazon Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also returned.
    */
  @js.native
  @Factory
  trait ICD10CMEntity extends js.Object {
    var Attributes: js.UndefOr[ICD10CMAttributeList]
    var BeginOffset: js.UndefOr[Int]
    var Category: js.UndefOr[ICD10CMEntityCategory]
    var EndOffset: js.UndefOr[Int]
    var ICD10CMConcepts: js.UndefOr[ICD10CMConceptList]
    var Id: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[OntologyLinkingBoundedLengthString]
    var Traits: js.UndefOr[ICD10CMTraitList]
    var Type: js.UndefOr[ICD10CMEntityType]
  }

  @js.native
  sealed trait ICD10CMEntityCategory extends js.Any
  object ICD10CMEntityCategory extends js.Object {
    val MEDICAL_CONDITION = "MEDICAL_CONDITION".asInstanceOf[ICD10CMEntityCategory]

    val values = js.Object.freeze(js.Array(MEDICAL_CONDITION))
  }

  @js.native
  sealed trait ICD10CMEntityType extends js.Any
  object ICD10CMEntityType extends js.Object {
    val DX_NAME = "DX_NAME".asInstanceOf[ICD10CMEntityType]

    val values = js.Object.freeze(js.Array(DX_NAME))
  }

  /**
    * Contextual information for the entity. The traits recognized by InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
    */
  @js.native
  @Factory
  trait ICD10CMTrait extends js.Object {
    var Name: js.UndefOr[ICD10CMTraitName]
    var Score: js.UndefOr[Float]
  }

  @js.native
  sealed trait ICD10CMTraitName extends js.Any
  object ICD10CMTraitName extends js.Object {
    val NEGATION  = "NEGATION".asInstanceOf[ICD10CMTraitName]
    val DIAGNOSIS = "DIAGNOSIS".asInstanceOf[ICD10CMTraitName]
    val SIGN      = "SIGN".asInstanceOf[ICD10CMTraitName]
    val SYMPTOM   = "SYMPTOM".asInstanceOf[ICD10CMTraitName]

    val values = js.Object.freeze(js.Array(NEGATION, DIAGNOSIS, SIGN, SYMPTOM))
  }

  @js.native
  @Factory
  trait InferICD10CMRequest extends js.Object {
    var Text: OntologyLinkingBoundedLengthString
  }

  @js.native
  @Factory
  trait InferICD10CMResponse extends js.Object {
    var Entities: ICD10CMEntityList
    var ModelVersion: js.UndefOr[String]
    var PaginationToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait InferRxNormRequest extends js.Object {
    var Text: OntologyLinkingBoundedLengthString
  }

  @js.native
  @Factory
  trait InferRxNormResponse extends js.Object {
    var Entities: RxNormEntityList
    var ModelVersion: js.UndefOr[String]
    var PaginationToken: js.UndefOr[String]
  }

  /**
    * The input properties for an entities detection job
    */
  @js.native
  @Factory
  trait InputDataConfig extends js.Object {
    var S3Bucket: S3Bucket
    var S3Key: js.UndefOr[S3Key]
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val SUBMITTED       = "SUBMITTED".asInstanceOf[JobStatus]
    val IN_PROGRESS     = "IN_PROGRESS".asInstanceOf[JobStatus]
    val COMPLETED       = "COMPLETED".asInstanceOf[JobStatus]
    val PARTIAL_SUCCESS = "PARTIAL_SUCCESS".asInstanceOf[JobStatus]
    val FAILED          = "FAILED".asInstanceOf[JobStatus]
    val STOP_REQUESTED  = "STOP_REQUESTED".asInstanceOf[JobStatus]
    val STOPPED         = "STOPPED".asInstanceOf[JobStatus]

    val values =
      js.Object.freeze(js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED))
  }

  @js.native
  sealed trait LanguageCode extends js.Any
  object LanguageCode extends js.Object {
    val en = "en".asInstanceOf[LanguageCode]

    val values = js.Object.freeze(js.Array(en))
  }

  @js.native
  @Factory
  trait ListEntitiesDetectionV2JobsRequest extends js.Object {
    var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListEntitiesDetectionV2JobsResponse extends js.Object {
    var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPHIDetectionJobsRequest extends js.Object {
    var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPHIDetectionJobsResponse extends js.Object {
    var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * The output properties for a detection job.
    */
  @js.native
  @Factory
  trait OutputDataConfig extends js.Object {
    var S3Bucket: S3Bucket
    var S3Key: js.UndefOr[S3Key]
  }

  /**
    * The extracted attributes that relate to this entity. The attributes recognized by InferRxNorm are <code>DOSAGE</code>, <code>DURATION</code>, <code>FORM</code>, <code>FREQUENCY</code>, <code>RATE</code>, <code>ROUTE_OR_MODE</code>.
    */
  @js.native
  @Factory
  trait RxNormAttribute extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var RelationshipScore: js.UndefOr[Float]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Traits: js.UndefOr[RxNormTraitList]
    var Type: js.UndefOr[RxNormAttributeType]
  }

  @js.native
  sealed trait RxNormAttributeType extends js.Any
  object RxNormAttributeType extends js.Object {
    val DOSAGE        = "DOSAGE".asInstanceOf[RxNormAttributeType]
    val DURATION      = "DURATION".asInstanceOf[RxNormAttributeType]
    val FORM          = "FORM".asInstanceOf[RxNormAttributeType]
    val FREQUENCY     = "FREQUENCY".asInstanceOf[RxNormAttributeType]
    val RATE          = "RATE".asInstanceOf[RxNormAttributeType]
    val ROUTE_OR_MODE = "ROUTE_OR_MODE".asInstanceOf[RxNormAttributeType]
    val STRENGTH      = "STRENGTH".asInstanceOf[RxNormAttributeType]

    val values = js.Object.freeze(js.Array(DOSAGE, DURATION, FORM, FREQUENCY, RATE, ROUTE_OR_MODE, STRENGTH))
  }

  /**
    * The RxNorm concept that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  @js.native
  @Factory
  trait RxNormConcept extends js.Object {
    var Code: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  /**
    * The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Amazon Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also returned.
    */
  @js.native
  @Factory
  trait RxNormEntity extends js.Object {
    var Attributes: js.UndefOr[RxNormAttributeList]
    var BeginOffset: js.UndefOr[Int]
    var Category: js.UndefOr[RxNormEntityCategory]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var RxNormConcepts: js.UndefOr[RxNormConceptList]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[OntologyLinkingBoundedLengthString]
    var Traits: js.UndefOr[RxNormTraitList]
    var Type: js.UndefOr[RxNormEntityType]
  }

  @js.native
  sealed trait RxNormEntityCategory extends js.Any
  object RxNormEntityCategory extends js.Object {
    val MEDICATION = "MEDICATION".asInstanceOf[RxNormEntityCategory]

    val values = js.Object.freeze(js.Array(MEDICATION))
  }

  @js.native
  sealed trait RxNormEntityType extends js.Any
  object RxNormEntityType extends js.Object {
    val BRAND_NAME   = "BRAND_NAME".asInstanceOf[RxNormEntityType]
    val GENERIC_NAME = "GENERIC_NAME".asInstanceOf[RxNormEntityType]

    val values = js.Object.freeze(js.Array(BRAND_NAME, GENERIC_NAME))
  }

  /**
    * The contextual information for the entity. InferRxNorm recognizes the trait <code>NEGATION</code>, which is any indication that the patient is not taking a medication.
    */
  @js.native
  @Factory
  trait RxNormTrait extends js.Object {
    var Name: js.UndefOr[RxNormTraitName]
    var Score: js.UndefOr[Float]
  }

  @js.native
  sealed trait RxNormTraitName extends js.Any
  object RxNormTraitName extends js.Object {
    val NEGATION = "NEGATION".asInstanceOf[RxNormTraitName]

    val values = js.Object.freeze(js.Array(NEGATION))
  }

  @js.native
  @Factory
  trait StartEntitiesDetectionV2JobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var KMSKey: js.UndefOr[KMSKey]
  }

  @js.native
  @Factory
  trait StartEntitiesDetectionV2JobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StartPHIDetectionJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var KMSKey: js.UndefOr[KMSKey]
  }

  @js.native
  @Factory
  trait StartPHIDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StopEntitiesDetectionV2JobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait StopEntitiesDetectionV2JobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  @js.native
  @Factory
  trait StopPHIDetectionJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait StopPHIDetectionJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  /**
    * Provides contextual information about the extracted entity.
    */
  @js.native
  @Factory
  trait Trait extends js.Object {
    var Name: js.UndefOr[AttributeName]
    var Score: js.UndefOr[Float]
  }

  /**
    * An attribute that we extracted, but were unable to relate to an entity.
    */
  @js.native
  @Factory
  trait UnmappedAttribute extends js.Object {
    var Attribute: js.UndefOr[Attribute]
    var Type: js.UndefOr[EntityType]
  }
}
