package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object comprehendmedical {
  type AnyLengthString = String
  type AttributeList = js.Array[Attribute]
  type BoundedLengthString = String
  type ClientRequestTokenString = String
  type ComprehendMedicalAsyncJobPropertiesList = js.Array[ComprehendMedicalAsyncJobProperties]
  type EntityList = js.Array[Entity]
  type ICD10CMAttributeList = js.Array[ICD10CMAttribute]
  type ICD10CMConceptList = js.Array[ICD10CMConcept]
  type ICD10CMEntityList = js.Array[ICD10CMEntity]
  type ICD10CMTraitList = js.Array[ICD10CMTrait]
  type IamRoleArn = String
  type JobId = String
  type JobName = String
  type KMSKey = String
  type ManifestFilePath = String
  type MaxResultsInteger = Int
  type ModelVersion = String
  type OntologyLinkingBoundedLengthString = String
  type RxNormAttributeList = js.Array[RxNormAttribute]
  type RxNormConceptList = js.Array[RxNormConcept]
  type RxNormEntityList = js.Array[RxNormEntity]
  type RxNormTraitList = js.Array[RxNormTrait]
  type S3Bucket = String
  type S3Key = String
  type SNOMEDCTAttributeList = js.Array[SNOMEDCTAttribute]
  type SNOMEDCTConceptList = js.Array[SNOMEDCTConcept]
  type SNOMEDCTEntityList = js.Array[SNOMEDCTEntity]
  type SNOMEDCTTraitList = js.Array[SNOMEDCTTrait]
  type Timestamp = js.Date
  type TraitList = js.Array[Trait]
  type UnmappedAttributeList = js.Array[UnmappedAttribute]

  final class ComprehendMedicalOps(private val service: ComprehendMedical) extends AnyVal {

    @inline def describeEntitiesDetectionV2JobFuture(params: DescribeEntitiesDetectionV2JobRequest): Future[DescribeEntitiesDetectionV2JobResponse] = service.describeEntitiesDetectionV2Job(params).promise().toFuture
    @inline def describeICD10CMInferenceJobFuture(params: DescribeICD10CMInferenceJobRequest): Future[DescribeICD10CMInferenceJobResponse] = service.describeICD10CMInferenceJob(params).promise().toFuture
    @inline def describePHIDetectionJobFuture(params: DescribePHIDetectionJobRequest): Future[DescribePHIDetectionJobResponse] = service.describePHIDetectionJob(params).promise().toFuture
    @inline def describeRxNormInferenceJobFuture(params: DescribeRxNormInferenceJobRequest): Future[DescribeRxNormInferenceJobResponse] = service.describeRxNormInferenceJob(params).promise().toFuture
    @inline def describeSNOMEDCTInferenceJobFuture(params: DescribeSNOMEDCTInferenceJobRequest): Future[DescribeSNOMEDCTInferenceJobResponse] = service.describeSNOMEDCTInferenceJob(params).promise().toFuture
    @inline def detectEntitiesV2Future(params: DetectEntitiesV2Request): Future[DetectEntitiesV2Response] = service.detectEntitiesV2(params).promise().toFuture
    @inline def detectPHIFuture(params: DetectPHIRequest): Future[DetectPHIResponse] = service.detectPHI(params).promise().toFuture
    @inline def inferICD10CMFuture(params: InferICD10CMRequest): Future[InferICD10CMResponse] = service.inferICD10CM(params).promise().toFuture
    @inline def inferRxNormFuture(params: InferRxNormRequest): Future[InferRxNormResponse] = service.inferRxNorm(params).promise().toFuture
    @inline def inferSNOMEDCTFuture(params: InferSNOMEDCTRequest): Future[InferSNOMEDCTResponse] = service.inferSNOMEDCT(params).promise().toFuture
    @inline def listEntitiesDetectionV2JobsFuture(params: ListEntitiesDetectionV2JobsRequest): Future[ListEntitiesDetectionV2JobsResponse] = service.listEntitiesDetectionV2Jobs(params).promise().toFuture
    @inline def listICD10CMInferenceJobsFuture(params: ListICD10CMInferenceJobsRequest): Future[ListICD10CMInferenceJobsResponse] = service.listICD10CMInferenceJobs(params).promise().toFuture
    @inline def listPHIDetectionJobsFuture(params: ListPHIDetectionJobsRequest): Future[ListPHIDetectionJobsResponse] = service.listPHIDetectionJobs(params).promise().toFuture
    @inline def listRxNormInferenceJobsFuture(params: ListRxNormInferenceJobsRequest): Future[ListRxNormInferenceJobsResponse] = service.listRxNormInferenceJobs(params).promise().toFuture
    @inline def listSNOMEDCTInferenceJobsFuture(params: ListSNOMEDCTInferenceJobsRequest): Future[ListSNOMEDCTInferenceJobsResponse] = service.listSNOMEDCTInferenceJobs(params).promise().toFuture
    @inline def startEntitiesDetectionV2JobFuture(params: StartEntitiesDetectionV2JobRequest): Future[StartEntitiesDetectionV2JobResponse] = service.startEntitiesDetectionV2Job(params).promise().toFuture
    @inline def startICD10CMInferenceJobFuture(params: StartICD10CMInferenceJobRequest): Future[StartICD10CMInferenceJobResponse] = service.startICD10CMInferenceJob(params).promise().toFuture
    @inline def startPHIDetectionJobFuture(params: StartPHIDetectionJobRequest): Future[StartPHIDetectionJobResponse] = service.startPHIDetectionJob(params).promise().toFuture
    @inline def startRxNormInferenceJobFuture(params: StartRxNormInferenceJobRequest): Future[StartRxNormInferenceJobResponse] = service.startRxNormInferenceJob(params).promise().toFuture
    @inline def startSNOMEDCTInferenceJobFuture(params: StartSNOMEDCTInferenceJobRequest): Future[StartSNOMEDCTInferenceJobResponse] = service.startSNOMEDCTInferenceJob(params).promise().toFuture
    @inline def stopEntitiesDetectionV2JobFuture(params: StopEntitiesDetectionV2JobRequest): Future[StopEntitiesDetectionV2JobResponse] = service.stopEntitiesDetectionV2Job(params).promise().toFuture
    @inline def stopICD10CMInferenceJobFuture(params: StopICD10CMInferenceJobRequest): Future[StopICD10CMInferenceJobResponse] = service.stopICD10CMInferenceJob(params).promise().toFuture
    @inline def stopPHIDetectionJobFuture(params: StopPHIDetectionJobRequest): Future[StopPHIDetectionJobResponse] = service.stopPHIDetectionJob(params).promise().toFuture
    @inline def stopRxNormInferenceJobFuture(params: StopRxNormInferenceJobRequest): Future[StopRxNormInferenceJobResponse] = service.stopRxNormInferenceJob(params).promise().toFuture
    @inline def stopSNOMEDCTInferenceJobFuture(params: StopSNOMEDCTInferenceJobRequest): Future[StopSNOMEDCTInferenceJobResponse] = service.stopSNOMEDCTInferenceJob(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/comprehendmedical", JSImport.Namespace, "AWS.ComprehendMedical")
  class ComprehendMedical() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("This operation is deprecated, use DetectEntitiesV2 instead.", "forever") def detectEntities(params: DetectEntitiesRequest): Request[DetectEntitiesResponse] = js.native
    def describeEntitiesDetectionV2Job(params: DescribeEntitiesDetectionV2JobRequest): Request[DescribeEntitiesDetectionV2JobResponse] = js.native
    def describeICD10CMInferenceJob(params: DescribeICD10CMInferenceJobRequest): Request[DescribeICD10CMInferenceJobResponse] = js.native
    def describePHIDetectionJob(params: DescribePHIDetectionJobRequest): Request[DescribePHIDetectionJobResponse] = js.native
    def describeRxNormInferenceJob(params: DescribeRxNormInferenceJobRequest): Request[DescribeRxNormInferenceJobResponse] = js.native
    def describeSNOMEDCTInferenceJob(params: DescribeSNOMEDCTInferenceJobRequest): Request[DescribeSNOMEDCTInferenceJobResponse] = js.native
    def detectEntitiesV2(params: DetectEntitiesV2Request): Request[DetectEntitiesV2Response] = js.native
    def detectPHI(params: DetectPHIRequest): Request[DetectPHIResponse] = js.native
    def inferICD10CM(params: InferICD10CMRequest): Request[InferICD10CMResponse] = js.native
    def inferRxNorm(params: InferRxNormRequest): Request[InferRxNormResponse] = js.native
    def inferSNOMEDCT(params: InferSNOMEDCTRequest): Request[InferSNOMEDCTResponse] = js.native
    def listEntitiesDetectionV2Jobs(params: ListEntitiesDetectionV2JobsRequest): Request[ListEntitiesDetectionV2JobsResponse] = js.native
    def listICD10CMInferenceJobs(params: ListICD10CMInferenceJobsRequest): Request[ListICD10CMInferenceJobsResponse] = js.native
    def listPHIDetectionJobs(params: ListPHIDetectionJobsRequest): Request[ListPHIDetectionJobsResponse] = js.native
    def listRxNormInferenceJobs(params: ListRxNormInferenceJobsRequest): Request[ListRxNormInferenceJobsResponse] = js.native
    def listSNOMEDCTInferenceJobs(params: ListSNOMEDCTInferenceJobsRequest): Request[ListSNOMEDCTInferenceJobsResponse] = js.native
    def startEntitiesDetectionV2Job(params: StartEntitiesDetectionV2JobRequest): Request[StartEntitiesDetectionV2JobResponse] = js.native
    def startICD10CMInferenceJob(params: StartICD10CMInferenceJobRequest): Request[StartICD10CMInferenceJobResponse] = js.native
    def startPHIDetectionJob(params: StartPHIDetectionJobRequest): Request[StartPHIDetectionJobResponse] = js.native
    def startRxNormInferenceJob(params: StartRxNormInferenceJobRequest): Request[StartRxNormInferenceJobResponse] = js.native
    def startSNOMEDCTInferenceJob(params: StartSNOMEDCTInferenceJobRequest): Request[StartSNOMEDCTInferenceJobResponse] = js.native
    def stopEntitiesDetectionV2Job(params: StopEntitiesDetectionV2JobRequest): Request[StopEntitiesDetectionV2JobResponse] = js.native
    def stopICD10CMInferenceJob(params: StopICD10CMInferenceJobRequest): Request[StopICD10CMInferenceJobResponse] = js.native
    def stopPHIDetectionJob(params: StopPHIDetectionJobRequest): Request[StopPHIDetectionJobResponse] = js.native
    def stopRxNormInferenceJob(params: StopRxNormInferenceJobRequest): Request[StopRxNormInferenceJobResponse] = js.native
    def stopSNOMEDCTInferenceJob(params: StopSNOMEDCTInferenceJobRequest): Request[StopSNOMEDCTInferenceJobResponse] = js.native
  }
  object ComprehendMedical {
    @inline implicit def toOps(service: ComprehendMedical): ComprehendMedicalOps = {
      new ComprehendMedicalOps(service)
    }
  }

  /** An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the dosage of a medication taken. It contains information about the attribute such as id, begin and end offset within the input text, and the segment of the input text.
    */
  @js.native
  trait Attribute extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var Category: js.UndefOr[EntityType]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var RelationshipScore: js.UndefOr[Float]
    var RelationshipType: js.UndefOr[RelationshipType]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Traits: js.UndefOr[TraitList]
    var Type: js.UndefOr[EntitySubType]
  }

  object Attribute {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        Category: js.UndefOr[EntityType] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        RelationshipScore: js.UndefOr[Float] = js.undefined,
        RelationshipType: js.UndefOr[RelationshipType] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Traits: js.UndefOr[TraitList] = js.undefined,
        Type: js.UndefOr[EntitySubType] = js.undefined
    ): Attribute = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      RelationshipScore.foreach(__v => __obj.updateDynamic("RelationshipScore")(__v.asInstanceOf[js.Any]))
      RelationshipType.foreach(__v => __obj.updateDynamic("RelationshipType")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  /** The number of characters in the input text to be analyzed.
    */
  @js.native
  trait Characters extends js.Object {
    var OriginalTextCharacters: js.UndefOr[Int]
  }

  object Characters {
    @inline
    def apply(
        OriginalTextCharacters: js.UndefOr[Int] = js.undefined
    ): Characters = {
      val __obj = js.Dynamic.literal()
      OriginalTextCharacters.foreach(__v => __obj.updateDynamic("OriginalTextCharacters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Characters]
    }
  }

  /** Provides information for filtering a list of detection jobs.
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

  /** Provides information about a detection job.
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
      ComprehendMedicalAsyncJobProperties.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEntitiesDetectionV2JobResponse]
    }
  }

  @js.native
  trait DescribeICD10CMInferenceJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeICD10CMInferenceJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeICD10CMInferenceJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeICD10CMInferenceJobRequest]
    }
  }

  @js.native
  trait DescribeICD10CMInferenceJobResponse extends js.Object {
    var ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties]
  }

  object DescribeICD10CMInferenceJobResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties] = js.undefined
    ): DescribeICD10CMInferenceJobResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobProperties.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeICD10CMInferenceJobResponse]
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
      ComprehendMedicalAsyncJobProperties.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePHIDetectionJobResponse]
    }
  }

  @js.native
  trait DescribeRxNormInferenceJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeRxNormInferenceJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeRxNormInferenceJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRxNormInferenceJobRequest]
    }
  }

  @js.native
  trait DescribeRxNormInferenceJobResponse extends js.Object {
    var ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties]
  }

  object DescribeRxNormInferenceJobResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties] = js.undefined
    ): DescribeRxNormInferenceJobResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobProperties.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRxNormInferenceJobResponse]
    }
  }

  @js.native
  trait DescribeSNOMEDCTInferenceJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeSNOMEDCTInferenceJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeSNOMEDCTInferenceJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSNOMEDCTInferenceJobRequest]
    }
  }

  @js.native
  trait DescribeSNOMEDCTInferenceJobResponse extends js.Object {
    var ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties]
  }

  object DescribeSNOMEDCTInferenceJobResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobProperties: js.UndefOr[ComprehendMedicalAsyncJobProperties] = js.undefined
    ): DescribeSNOMEDCTInferenceJobResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobProperties.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSNOMEDCTInferenceJobResponse]
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
        "Entities" -> Entities.asInstanceOf[js.Any],
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
        "Entities" -> Entities.asInstanceOf[js.Any],
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
        "Entities" -> Entities.asInstanceOf[js.Any],
        "ModelVersion" -> ModelVersion.asInstanceOf[js.Any]
      )

      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectPHIResponse]
    }
  }

  /** Provides information about an extracted medical entity.
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

  /** The detected attributes that relate to an entity. This includes an extracted segment of the text that is an attribute of an entity, or otherwise related to an entity. InferICD10CM detects the following attributes: <code>Direction</code>, <code>System, Organ or Site</code>, and <code>Acuity</code>.
    */
  @js.native
  trait ICD10CMAttribute extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var Category: js.UndefOr[ICD10CMEntityType]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var RelationshipScore: js.UndefOr[Float]
    var RelationshipType: js.UndefOr[ICD10CMRelationshipType]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Traits: js.UndefOr[ICD10CMTraitList]
    var Type: js.UndefOr[ICD10CMAttributeType]
  }

  object ICD10CMAttribute {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        Category: js.UndefOr[ICD10CMEntityType] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        RelationshipScore: js.UndefOr[Float] = js.undefined,
        RelationshipType: js.UndefOr[ICD10CMRelationshipType] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Traits: js.UndefOr[ICD10CMTraitList] = js.undefined,
        Type: js.UndefOr[ICD10CMAttributeType] = js.undefined
    ): ICD10CMAttribute = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      RelationshipScore.foreach(__v => __obj.updateDynamic("RelationshipScore")(__v.asInstanceOf[js.Any]))
      RelationshipType.foreach(__v => __obj.updateDynamic("RelationshipType")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ICD10CMAttribute]
    }
  }

  /** The ICD-10-CM concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  @js.native
  trait ICD10CMConcept extends js.Object {
    var Code: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  object ICD10CMConcept {
    @inline
    def apply(
        Code: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): ICD10CMConcept = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ICD10CMConcept]
    }
  }

  /** The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Amazon Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also returned.
    */
  @js.native
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

  object ICD10CMEntity {
    @inline
    def apply(
        Attributes: js.UndefOr[ICD10CMAttributeList] = js.undefined,
        BeginOffset: js.UndefOr[Int] = js.undefined,
        Category: js.UndefOr[ICD10CMEntityCategory] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        ICD10CMConcepts: js.UndefOr[ICD10CMConceptList] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.undefined,
        Traits: js.UndefOr[ICD10CMTraitList] = js.undefined,
        Type: js.UndefOr[ICD10CMEntityType] = js.undefined
    ): ICD10CMEntity = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      ICD10CMConcepts.foreach(__v => __obj.updateDynamic("ICD10CMConcepts")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ICD10CMEntity]
    }
  }

  /** Contextual information for the entity. The traits recognized by InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>, <code>SYMPTOM</code>, and <code>NEGATION</code>.
    */
  @js.native
  trait ICD10CMTrait extends js.Object {
    var Name: js.UndefOr[ICD10CMTraitName]
    var Score: js.UndefOr[Float]
  }

  object ICD10CMTrait {
    @inline
    def apply(
        Name: js.UndefOr[ICD10CMTraitName] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): ICD10CMTrait = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ICD10CMTrait]
    }
  }

  @js.native
  trait InferICD10CMRequest extends js.Object {
    var Text: OntologyLinkingBoundedLengthString
  }

  object InferICD10CMRequest {
    @inline
    def apply(
        Text: OntologyLinkingBoundedLengthString
    ): InferICD10CMRequest = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InferICD10CMRequest]
    }
  }

  @js.native
  trait InferICD10CMResponse extends js.Object {
    var Entities: ICD10CMEntityList
    var ModelVersion: js.UndefOr[String]
    var PaginationToken: js.UndefOr[String]
  }

  object InferICD10CMResponse {
    @inline
    def apply(
        Entities: ICD10CMEntityList,
        ModelVersion: js.UndefOr[String] = js.undefined,
        PaginationToken: js.UndefOr[String] = js.undefined
    ): InferICD10CMResponse = {
      val __obj = js.Dynamic.literal(
        "Entities" -> Entities.asInstanceOf[js.Any]
      )

      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferICD10CMResponse]
    }
  }

  @js.native
  trait InferRxNormRequest extends js.Object {
    var Text: OntologyLinkingBoundedLengthString
  }

  object InferRxNormRequest {
    @inline
    def apply(
        Text: OntologyLinkingBoundedLengthString
    ): InferRxNormRequest = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InferRxNormRequest]
    }
  }

  @js.native
  trait InferRxNormResponse extends js.Object {
    var Entities: RxNormEntityList
    var ModelVersion: js.UndefOr[String]
    var PaginationToken: js.UndefOr[String]
  }

  object InferRxNormResponse {
    @inline
    def apply(
        Entities: RxNormEntityList,
        ModelVersion: js.UndefOr[String] = js.undefined,
        PaginationToken: js.UndefOr[String] = js.undefined
    ): InferRxNormResponse = {
      val __obj = js.Dynamic.literal(
        "Entities" -> Entities.asInstanceOf[js.Any]
      )

      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferRxNormResponse]
    }
  }

  @js.native
  trait InferSNOMEDCTRequest extends js.Object {
    var Text: OntologyLinkingBoundedLengthString
  }

  object InferSNOMEDCTRequest {
    @inline
    def apply(
        Text: OntologyLinkingBoundedLengthString
    ): InferSNOMEDCTRequest = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InferSNOMEDCTRequest]
    }
  }

  @js.native
  trait InferSNOMEDCTResponse extends js.Object {
    var Entities: SNOMEDCTEntityList
    var Characters: js.UndefOr[Characters]
    var ModelVersion: js.UndefOr[String]
    var PaginationToken: js.UndefOr[String]
    var SNOMEDCTDetails: js.UndefOr[SNOMEDCTDetails]
  }

  object InferSNOMEDCTResponse {
    @inline
    def apply(
        Entities: SNOMEDCTEntityList,
        Characters: js.UndefOr[Characters] = js.undefined,
        ModelVersion: js.UndefOr[String] = js.undefined,
        PaginationToken: js.UndefOr[String] = js.undefined,
        SNOMEDCTDetails: js.UndefOr[SNOMEDCTDetails] = js.undefined
    ): InferSNOMEDCTResponse = {
      val __obj = js.Dynamic.literal(
        "Entities" -> Entities.asInstanceOf[js.Any]
      )

      Characters.foreach(__v => __obj.updateDynamic("Characters")(__v.asInstanceOf[js.Any]))
      ModelVersion.foreach(__v => __obj.updateDynamic("ModelVersion")(__v.asInstanceOf[js.Any]))
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      SNOMEDCTDetails.foreach(__v => __obj.updateDynamic("SNOMEDCTDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InferSNOMEDCTResponse]
    }
  }

  /** The input properties for an entities detection job. This includes the name of the S3 bucket and the path to the files to be analyzed.
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
      ComprehendMedicalAsyncJobPropertiesList.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesDetectionV2JobsResponse]
    }
  }

  @js.native
  trait ListICD10CMInferenceJobsRequest extends js.Object {
    var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListICD10CMInferenceJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListICD10CMInferenceJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListICD10CMInferenceJobsRequest]
    }
  }

  @js.native
  trait ListICD10CMInferenceJobsResponse extends js.Object {
    var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListICD10CMInferenceJobsResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListICD10CMInferenceJobsResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobPropertiesList.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListICD10CMInferenceJobsResponse]
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
      ComprehendMedicalAsyncJobPropertiesList.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPHIDetectionJobsResponse]
    }
  }

  @js.native
  trait ListRxNormInferenceJobsRequest extends js.Object {
    var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListRxNormInferenceJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListRxNormInferenceJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRxNormInferenceJobsRequest]
    }
  }

  @js.native
  trait ListRxNormInferenceJobsResponse extends js.Object {
    var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListRxNormInferenceJobsResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListRxNormInferenceJobsResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobPropertiesList.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRxNormInferenceJobsResponse]
    }
  }

  @js.native
  trait ListSNOMEDCTInferenceJobsRequest extends js.Object {
    var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter]
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListSNOMEDCTInferenceJobsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListSNOMEDCTInferenceJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSNOMEDCTInferenceJobsRequest]
    }
  }

  @js.native
  trait ListSNOMEDCTInferenceJobsResponse extends js.Object {
    var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList]
    var NextToken: js.UndefOr[String]
  }

  object ListSNOMEDCTInferenceJobsResponse {
    @inline
    def apply(
        ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[ComprehendMedicalAsyncJobPropertiesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListSNOMEDCTInferenceJobsResponse = {
      val __obj = js.Dynamic.literal()
      ComprehendMedicalAsyncJobPropertiesList.foreach(__v => __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSNOMEDCTInferenceJobsResponse]
    }
  }

  /** The output properties for a detection job.
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

  /** The extracted attributes that relate to this entity. The attributes recognized by InferRxNorm are <code>DOSAGE</code>, <code>DURATION</code>, <code>FORM</code>, <code>FREQUENCY</code>, <code>RATE</code>, <code>ROUTE_OR_MODE</code>.
    */
  @js.native
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

  object RxNormAttribute {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        RelationshipScore: js.UndefOr[Float] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Traits: js.UndefOr[RxNormTraitList] = js.undefined,
        Type: js.UndefOr[RxNormAttributeType] = js.undefined
    ): RxNormAttribute = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      RelationshipScore.foreach(__v => __obj.updateDynamic("RelationshipScore")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RxNormAttribute]
    }
  }

  /** The RxNorm concept that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  @js.native
  trait RxNormConcept extends js.Object {
    var Code: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  object RxNormConcept {
    @inline
    def apply(
        Code: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): RxNormConcept = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RxNormConcept]
    }
  }

  /** The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Amazon Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also returned.
    */
  @js.native
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

  object RxNormEntity {
    @inline
    def apply(
        Attributes: js.UndefOr[RxNormAttributeList] = js.undefined,
        BeginOffset: js.UndefOr[Int] = js.undefined,
        Category: js.UndefOr[RxNormEntityCategory] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        RxNormConcepts: js.UndefOr[RxNormConceptList] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.undefined,
        Traits: js.UndefOr[RxNormTraitList] = js.undefined,
        Type: js.UndefOr[RxNormEntityType] = js.undefined
    ): RxNormEntity = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      RxNormConcepts.foreach(__v => __obj.updateDynamic("RxNormConcepts")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RxNormEntity]
    }
  }

  /** The contextual information for the entity. InferRxNorm recognizes the trait <code>NEGATION</code>, which is any indication that the patient is not taking a medication.
    */
  @js.native
  trait RxNormTrait extends js.Object {
    var Name: js.UndefOr[RxNormTraitName]
    var Score: js.UndefOr[Float]
  }

  object RxNormTrait {
    @inline
    def apply(
        Name: js.UndefOr[RxNormTraitName] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): RxNormTrait = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RxNormTrait]
    }
  }

  /** The extracted attributes that relate to an entity. An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the dosage of a medication taken.
    */
  @js.native
  trait SNOMEDCTAttribute extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var Category: js.UndefOr[SNOMEDCTEntityCategory]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var RelationshipScore: js.UndefOr[Float]
    var RelationshipType: js.UndefOr[SNOMEDCTRelationshipType]
    var SNOMEDCTConcepts: js.UndefOr[SNOMEDCTConceptList]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Traits: js.UndefOr[SNOMEDCTTraitList]
    var Type: js.UndefOr[SNOMEDCTAttributeType]
  }

  object SNOMEDCTAttribute {
    @inline
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        Category: js.UndefOr[SNOMEDCTEntityCategory] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        RelationshipScore: js.UndefOr[Float] = js.undefined,
        RelationshipType: js.UndefOr[SNOMEDCTRelationshipType] = js.undefined,
        SNOMEDCTConcepts: js.UndefOr[SNOMEDCTConceptList] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Traits: js.UndefOr[SNOMEDCTTraitList] = js.undefined,
        Type: js.UndefOr[SNOMEDCTAttributeType] = js.undefined
    ): SNOMEDCTAttribute = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      RelationshipScore.foreach(__v => __obj.updateDynamic("RelationshipScore")(__v.asInstanceOf[js.Any]))
      RelationshipType.foreach(__v => __obj.updateDynamic("RelationshipType")(__v.asInstanceOf[js.Any]))
      SNOMEDCTConcepts.foreach(__v => __obj.updateDynamic("SNOMEDCTConcepts")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SNOMEDCTAttribute]
    }
  }

  /** The SNOMED-CT concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  @js.native
  trait SNOMEDCTConcept extends js.Object {
    var Code: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Score: js.UndefOr[Float]
  }

  object SNOMEDCTConcept {
    @inline
    def apply(
        Code: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): SNOMEDCTConcept = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SNOMEDCTConcept]
    }
  }

  /** The information about the revision of the SNOMED-CT ontology in the response. Specifically, the details include the SNOMED-CT edition, language, and version date.
    */
  @js.native
  trait SNOMEDCTDetails extends js.Object {
    var Edition: js.UndefOr[String]
    var Language: js.UndefOr[String]
    var VersionDate: js.UndefOr[String]
  }

  object SNOMEDCTDetails {
    @inline
    def apply(
        Edition: js.UndefOr[String] = js.undefined,
        Language: js.UndefOr[String] = js.undefined,
        VersionDate: js.UndefOr[String] = js.undefined
    ): SNOMEDCTDetails = {
      val __obj = js.Dynamic.literal()
      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      VersionDate.foreach(__v => __obj.updateDynamic("VersionDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SNOMEDCTDetails]
    }
  }

  /** The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also returned.
    */
  @js.native
  trait SNOMEDCTEntity extends js.Object {
    var Attributes: js.UndefOr[SNOMEDCTAttributeList]
    var BeginOffset: js.UndefOr[Int]
    var Category: js.UndefOr[SNOMEDCTEntityCategory]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var SNOMEDCTConcepts: js.UndefOr[SNOMEDCTConceptList]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[OntologyLinkingBoundedLengthString]
    var Traits: js.UndefOr[SNOMEDCTTraitList]
    var Type: js.UndefOr[SNOMEDCTEntityType]
  }

  object SNOMEDCTEntity {
    @inline
    def apply(
        Attributes: js.UndefOr[SNOMEDCTAttributeList] = js.undefined,
        BeginOffset: js.UndefOr[Int] = js.undefined,
        Category: js.UndefOr[SNOMEDCTEntityCategory] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        SNOMEDCTConcepts: js.UndefOr[SNOMEDCTConceptList] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.undefined,
        Traits: js.UndefOr[SNOMEDCTTraitList] = js.undefined,
        Type: js.UndefOr[SNOMEDCTEntityType] = js.undefined
    ): SNOMEDCTEntity = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      SNOMEDCTConcepts.foreach(__v => __obj.updateDynamic("SNOMEDCTConcepts")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SNOMEDCTEntity]
    }
  }

  /** Contextual information for an entity.
    */
  @js.native
  trait SNOMEDCTTrait extends js.Object {
    var Name: js.UndefOr[SNOMEDCTTraitName]
    var Score: js.UndefOr[Float]
  }

  object SNOMEDCTTrait {
    @inline
    def apply(
        Name: js.UndefOr[SNOMEDCTTraitName] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): SNOMEDCTTrait = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SNOMEDCTTrait]
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
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
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
  trait StartICD10CMInferenceJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object StartICD10CMInferenceJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined
    ): StartICD10CMInferenceJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.updateDynamic("KMSKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartICD10CMInferenceJobRequest]
    }
  }

  @js.native
  trait StartICD10CMInferenceJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartICD10CMInferenceJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartICD10CMInferenceJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartICD10CMInferenceJobResponse]
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
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
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
  trait StartRxNormInferenceJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object StartRxNormInferenceJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined
    ): StartRxNormInferenceJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.updateDynamic("KMSKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRxNormInferenceJobRequest]
    }
  }

  @js.native
  trait StartRxNormInferenceJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartRxNormInferenceJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartRxNormInferenceJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRxNormInferenceJobResponse]
    }
  }

  @js.native
  trait StartSNOMEDCTInferenceJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var InputDataConfig: InputDataConfig
    var LanguageCode: LanguageCode
    var OutputDataConfig: OutputDataConfig
    var ClientRequestToken: js.UndefOr[ClientRequestTokenString]
    var JobName: js.UndefOr[JobName]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object StartSNOMEDCTInferenceJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        InputDataConfig: InputDataConfig,
        LanguageCode: LanguageCode,
        OutputDataConfig: OutputDataConfig,
        ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined
    ): StartSNOMEDCTInferenceJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.updateDynamic("KMSKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSNOMEDCTInferenceJobRequest]
    }
  }

  @js.native
  trait StartSNOMEDCTInferenceJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StartSNOMEDCTInferenceJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StartSNOMEDCTInferenceJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSNOMEDCTInferenceJobResponse]
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
  trait StopICD10CMInferenceJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopICD10CMInferenceJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopICD10CMInferenceJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopICD10CMInferenceJobRequest]
    }
  }

  @js.native
  trait StopICD10CMInferenceJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StopICD10CMInferenceJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StopICD10CMInferenceJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopICD10CMInferenceJobResponse]
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

  @js.native
  trait StopRxNormInferenceJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopRxNormInferenceJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopRxNormInferenceJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopRxNormInferenceJobRequest]
    }
  }

  @js.native
  trait StopRxNormInferenceJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StopRxNormInferenceJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StopRxNormInferenceJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopRxNormInferenceJobResponse]
    }
  }

  @js.native
  trait StopSNOMEDCTInferenceJobRequest extends js.Object {
    var JobId: JobId
  }

  object StopSNOMEDCTInferenceJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): StopSNOMEDCTInferenceJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopSNOMEDCTInferenceJobRequest]
    }
  }

  @js.native
  trait StopSNOMEDCTInferenceJobResponse extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object StopSNOMEDCTInferenceJobResponse {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): StopSNOMEDCTInferenceJobResponse = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopSNOMEDCTInferenceJobResponse]
    }
  }

  /** Provides contextual information about the extracted entity.
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

  /** An attribute that was extracted, but Comprehend Medical; was unable to relate to an entity.
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