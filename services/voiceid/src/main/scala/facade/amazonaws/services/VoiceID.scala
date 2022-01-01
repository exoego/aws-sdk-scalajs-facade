package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object voiceid {
  type AmazonResourceName = String
  type Arn = String
  type ClientTokenString = String
  type CustomerSpeakerId = String
  type Description = String
  type DomainId = String
  type DomainName = String
  type DomainSummaries = js.Array[DomainSummary]
  type FraudDetectionReasons = js.Array[FraudDetectionReason]
  type FraudsterId = String
  type FraudsterRegistrationJobSummaries = js.Array[FraudsterRegistrationJobSummary]
  type GeneratedFraudsterId = String
  type GeneratedSpeakerId = String
  type IamRoleArn = String
  type JobId = String
  type JobName = String
  type KmsKeyId = String
  type MaxResultsForList = Int
  type MaxResultsForListDomainFe = Int
  type NextToken = String
  type S3Uri = String
  type Score = Int
  type SessionId = String
  type SessionName = String
  type SessionNameOrId = String
  type SpeakerEnrollmentJobSummaries = js.Array[SpeakerEnrollmentJobSummary]
  type SpeakerId = String
  type SpeakerSummaries = js.Array[SpeakerSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type UniqueIdLarge = String

  final class VoiceIDOps(private val service: VoiceID) extends AnyVal {

    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResponse] = service.createDomain(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[js.Object] = service.deleteDomain(params).promise().toFuture
    @inline def deleteFraudsterFuture(params: DeleteFraudsterRequest): Future[js.Object] = service.deleteFraudster(params).promise().toFuture
    @inline def deleteSpeakerFuture(params: DeleteSpeakerRequest): Future[js.Object] = service.deleteSpeaker(params).promise().toFuture
    @inline def describeDomainFuture(params: DescribeDomainRequest): Future[DescribeDomainResponse] = service.describeDomain(params).promise().toFuture
    @inline def describeFraudsterFuture(params: DescribeFraudsterRequest): Future[DescribeFraudsterResponse] = service.describeFraudster(params).promise().toFuture
    @inline def describeFraudsterRegistrationJobFuture(params: DescribeFraudsterRegistrationJobRequest): Future[DescribeFraudsterRegistrationJobResponse] = service.describeFraudsterRegistrationJob(params).promise().toFuture
    @inline def describeSpeakerEnrollmentJobFuture(params: DescribeSpeakerEnrollmentJobRequest): Future[DescribeSpeakerEnrollmentJobResponse] = service.describeSpeakerEnrollmentJob(params).promise().toFuture
    @inline def describeSpeakerFuture(params: DescribeSpeakerRequest): Future[DescribeSpeakerResponse] = service.describeSpeaker(params).promise().toFuture
    @inline def evaluateSessionFuture(params: EvaluateSessionRequest): Future[EvaluateSessionResponse] = service.evaluateSession(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] = service.listDomains(params).promise().toFuture
    @inline def listFraudsterRegistrationJobsFuture(params: ListFraudsterRegistrationJobsRequest): Future[ListFraudsterRegistrationJobsResponse] = service.listFraudsterRegistrationJobs(params).promise().toFuture
    @inline def listSpeakerEnrollmentJobsFuture(params: ListSpeakerEnrollmentJobsRequest): Future[ListSpeakerEnrollmentJobsResponse] = service.listSpeakerEnrollmentJobs(params).promise().toFuture
    @inline def listSpeakersFuture(params: ListSpeakersRequest): Future[ListSpeakersResponse] = service.listSpeakers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def optOutSpeakerFuture(params: OptOutSpeakerRequest): Future[OptOutSpeakerResponse] = service.optOutSpeaker(params).promise().toFuture
    @inline def startFraudsterRegistrationJobFuture(params: StartFraudsterRegistrationJobRequest): Future[StartFraudsterRegistrationJobResponse] = service.startFraudsterRegistrationJob(params).promise().toFuture
    @inline def startSpeakerEnrollmentJobFuture(params: StartSpeakerEnrollmentJobRequest): Future[StartSpeakerEnrollmentJobResponse] = service.startSpeakerEnrollmentJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDomainFuture(params: UpdateDomainRequest): Future[UpdateDomainResponse] = service.updateDomain(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/voiceid", JSImport.Namespace, "AWS.VoiceID")
  class VoiceID() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse] = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[js.Object] = js.native
    def deleteFraudster(params: DeleteFraudsterRequest): Request[js.Object] = js.native
    def deleteSpeaker(params: DeleteSpeakerRequest): Request[js.Object] = js.native
    def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse] = js.native
    def describeFraudster(params: DescribeFraudsterRequest): Request[DescribeFraudsterResponse] = js.native
    def describeFraudsterRegistrationJob(params: DescribeFraudsterRegistrationJobRequest): Request[DescribeFraudsterRegistrationJobResponse] = js.native
    def describeSpeaker(params: DescribeSpeakerRequest): Request[DescribeSpeakerResponse] = js.native
    def describeSpeakerEnrollmentJob(params: DescribeSpeakerEnrollmentJobRequest): Request[DescribeSpeakerEnrollmentJobResponse] = js.native
    def evaluateSession(params: EvaluateSessionRequest): Request[EvaluateSessionResponse] = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse] = js.native
    def listFraudsterRegistrationJobs(params: ListFraudsterRegistrationJobsRequest): Request[ListFraudsterRegistrationJobsResponse] = js.native
    def listSpeakerEnrollmentJobs(params: ListSpeakerEnrollmentJobsRequest): Request[ListSpeakerEnrollmentJobsResponse] = js.native
    def listSpeakers(params: ListSpeakersRequest): Request[ListSpeakersResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def optOutSpeaker(params: OptOutSpeakerRequest): Request[OptOutSpeakerResponse] = js.native
    def startFraudsterRegistrationJob(params: StartFraudsterRegistrationJobRequest): Request[StartFraudsterRegistrationJobResponse] = js.native
    def startSpeakerEnrollmentJob(params: StartSpeakerEnrollmentJobRequest): Request[StartSpeakerEnrollmentJobResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDomain(params: UpdateDomainRequest): Request[UpdateDomainResponse] = js.native
  }
  object VoiceID {
    @inline implicit def toOps(service: VoiceID): VoiceIDOps = {
      new VoiceIDOps(service)
    }
  }

  /** The configuration used to authenticate a speaker during a session.
    */
  @js.native
  trait AuthenticationConfiguration extends js.Object {
    var AcceptanceThreshold: Score
  }

  object AuthenticationConfiguration {
    @inline
    def apply(
        AcceptanceThreshold: Score
    ): AuthenticationConfiguration = {
      val __obj = js.Dynamic.literal(
        "AcceptanceThreshold" -> AcceptanceThreshold.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AuthenticationConfiguration]
    }
  }

  /** The authentication result produced by Voice ID, processed against the current session state and streamed audio of the speaker.
    */
  @js.native
  trait AuthenticationResult extends js.Object {
    var AudioAggregationEndedAt: js.UndefOr[Timestamp]
    var AudioAggregationStartedAt: js.UndefOr[Timestamp]
    var AuthenticationResultId: js.UndefOr[UniqueIdLarge]
    var Configuration: js.UndefOr[AuthenticationConfiguration]
    var CustomerSpeakerId: js.UndefOr[CustomerSpeakerId]
    var Decision: js.UndefOr[AuthenticationDecision]
    var GeneratedSpeakerId: js.UndefOr[GeneratedSpeakerId]
    var Score: js.UndefOr[Score]
  }

  object AuthenticationResult {
    @inline
    def apply(
        AudioAggregationEndedAt: js.UndefOr[Timestamp] = js.undefined,
        AudioAggregationStartedAt: js.UndefOr[Timestamp] = js.undefined,
        AuthenticationResultId: js.UndefOr[UniqueIdLarge] = js.undefined,
        Configuration: js.UndefOr[AuthenticationConfiguration] = js.undefined,
        CustomerSpeakerId: js.UndefOr[CustomerSpeakerId] = js.undefined,
        Decision: js.UndefOr[AuthenticationDecision] = js.undefined,
        GeneratedSpeakerId: js.UndefOr[GeneratedSpeakerId] = js.undefined,
        Score: js.UndefOr[Score] = js.undefined
    ): AuthenticationResult = {
      val __obj = js.Dynamic.literal()
      AudioAggregationEndedAt.foreach(__v => __obj.updateDynamic("AudioAggregationEndedAt")(__v.asInstanceOf[js.Any]))
      AudioAggregationStartedAt.foreach(__v => __obj.updateDynamic("AudioAggregationStartedAt")(__v.asInstanceOf[js.Any]))
      AuthenticationResultId.foreach(__v => __obj.updateDynamic("AuthenticationResultId")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CustomerSpeakerId.foreach(__v => __obj.updateDynamic("CustomerSpeakerId")(__v.asInstanceOf[js.Any]))
      Decision.foreach(__v => __obj.updateDynamic("Decision")(__v.asInstanceOf[js.Any]))
      GeneratedSpeakerId.foreach(__v => __obj.updateDynamic("GeneratedSpeakerId")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthenticationResult]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var Name: DomainName
    var ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration
    var ClientToken: js.UndefOr[ClientTokenString]
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDomainRequest {
    @inline
    def apply(
        Name: DomainName,
        ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration,
        ClientToken: js.UndefOr[ClientTokenString] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ServerSideEncryptionConfiguration" -> ServerSideEncryptionConfiguration.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  @js.native
  trait CreateDomainResponse extends js.Object {
    var Domain: js.UndefOr[Domain]
  }

  object CreateDomainResponse {
    @inline
    def apply(
        Domain: js.UndefOr[Domain] = js.undefined
    ): CreateDomainResponse = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainResponse]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainId: DomainId
  }

  object DeleteDomainRequest {
    @inline
    def apply(
        DomainId: DomainId
    ): DeleteDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DeleteFraudsterRequest extends js.Object {
    var DomainId: DomainId
    var FraudsterId: FraudsterId
  }

  object DeleteFraudsterRequest {
    @inline
    def apply(
        DomainId: DomainId,
        FraudsterId: FraudsterId
    ): DeleteFraudsterRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "FraudsterId" -> FraudsterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFraudsterRequest]
    }
  }

  @js.native
  trait DeleteSpeakerRequest extends js.Object {
    var DomainId: DomainId
    var SpeakerId: SpeakerId
  }

  object DeleteSpeakerRequest {
    @inline
    def apply(
        DomainId: DomainId,
        SpeakerId: SpeakerId
    ): DeleteSpeakerRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "SpeakerId" -> SpeakerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSpeakerRequest]
    }
  }

  @js.native
  trait DescribeDomainRequest extends js.Object {
    var DomainId: DomainId
  }

  object DescribeDomainRequest {
    @inline
    def apply(
        DomainId: DomainId
    ): DescribeDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDomainRequest]
    }
  }

  @js.native
  trait DescribeDomainResponse extends js.Object {
    var Domain: js.UndefOr[Domain]
  }

  object DescribeDomainResponse {
    @inline
    def apply(
        Domain: js.UndefOr[Domain] = js.undefined
    ): DescribeDomainResponse = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainResponse]
    }
  }

  @js.native
  trait DescribeFraudsterRegistrationJobRequest extends js.Object {
    var DomainId: DomainId
    var JobId: JobId
  }

  object DescribeFraudsterRegistrationJobRequest {
    @inline
    def apply(
        DomainId: DomainId,
        JobId: JobId
    ): DescribeFraudsterRegistrationJobRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFraudsterRegistrationJobRequest]
    }
  }

  @js.native
  trait DescribeFraudsterRegistrationJobResponse extends js.Object {
    var Job: js.UndefOr[FraudsterRegistrationJob]
  }

  object DescribeFraudsterRegistrationJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[FraudsterRegistrationJob] = js.undefined
    ): DescribeFraudsterRegistrationJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFraudsterRegistrationJobResponse]
    }
  }

  @js.native
  trait DescribeFraudsterRequest extends js.Object {
    var DomainId: DomainId
    var FraudsterId: FraudsterId
  }

  object DescribeFraudsterRequest {
    @inline
    def apply(
        DomainId: DomainId,
        FraudsterId: FraudsterId
    ): DescribeFraudsterRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "FraudsterId" -> FraudsterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFraudsterRequest]
    }
  }

  @js.native
  trait DescribeFraudsterResponse extends js.Object {
    var Fraudster: js.UndefOr[Fraudster]
  }

  object DescribeFraudsterResponse {
    @inline
    def apply(
        Fraudster: js.UndefOr[Fraudster] = js.undefined
    ): DescribeFraudsterResponse = {
      val __obj = js.Dynamic.literal()
      Fraudster.foreach(__v => __obj.updateDynamic("Fraudster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFraudsterResponse]
    }
  }

  @js.native
  trait DescribeSpeakerEnrollmentJobRequest extends js.Object {
    var DomainId: DomainId
    var JobId: JobId
  }

  object DescribeSpeakerEnrollmentJobRequest {
    @inline
    def apply(
        DomainId: DomainId,
        JobId: JobId
    ): DescribeSpeakerEnrollmentJobRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSpeakerEnrollmentJobRequest]
    }
  }

  @js.native
  trait DescribeSpeakerEnrollmentJobResponse extends js.Object {
    var Job: js.UndefOr[SpeakerEnrollmentJob]
  }

  object DescribeSpeakerEnrollmentJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[SpeakerEnrollmentJob] = js.undefined
    ): DescribeSpeakerEnrollmentJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSpeakerEnrollmentJobResponse]
    }
  }

  @js.native
  trait DescribeSpeakerRequest extends js.Object {
    var DomainId: DomainId
    var SpeakerId: SpeakerId
  }

  object DescribeSpeakerRequest {
    @inline
    def apply(
        DomainId: DomainId,
        SpeakerId: SpeakerId
    ): DescribeSpeakerRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "SpeakerId" -> SpeakerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSpeakerRequest]
    }
  }

  @js.native
  trait DescribeSpeakerResponse extends js.Object {
    var Speaker: js.UndefOr[Speaker]
  }

  object DescribeSpeakerResponse {
    @inline
    def apply(
        Speaker: js.UndefOr[Speaker] = js.undefined
    ): DescribeSpeakerResponse = {
      val __obj = js.Dynamic.literal()
      Speaker.foreach(__v => __obj.updateDynamic("Speaker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSpeakerResponse]
    }
  }

  /** Contains all the information about a domain.
    */
  @js.native
  trait Domain extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var DomainId: js.UndefOr[DomainId]
    var DomainStatus: js.UndefOr[DomainStatus]
    var Name: js.UndefOr[DomainName]
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object Domain {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        DomainStatus: js.UndefOr[DomainStatus] = js.undefined,
        Name: js.UndefOr[DomainName] = js.undefined,
        ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): Domain = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      DomainStatus.foreach(__v => __obj.updateDynamic("DomainStatus")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ServerSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("ServerSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Domain]
    }
  }

  /** Contains a summary of information about a domain.
    */
  @js.native
  trait DomainSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var DomainId: js.UndefOr[DomainId]
    var DomainStatus: js.UndefOr[DomainStatus]
    var Name: js.UndefOr[DomainName]
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object DomainSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        DomainStatus: js.UndefOr[DomainStatus] = js.undefined,
        Name: js.UndefOr[DomainName] = js.undefined,
        ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): DomainSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      DomainStatus.foreach(__v => __obj.updateDynamic("DomainStatus")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ServerSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("ServerSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainSummary]
    }
  }

  /** Contains configurations defining enrollment behavior for the batch job.
    */
  @js.native
  trait EnrollmentConfig extends js.Object {
    var ExistingEnrollmentAction: js.UndefOr[ExistingEnrollmentAction]
    var FraudDetectionConfig: js.UndefOr[EnrollmentJobFraudDetectionConfig]
  }

  object EnrollmentConfig {
    @inline
    def apply(
        ExistingEnrollmentAction: js.UndefOr[ExistingEnrollmentAction] = js.undefined,
        FraudDetectionConfig: js.UndefOr[EnrollmentJobFraudDetectionConfig] = js.undefined
    ): EnrollmentConfig = {
      val __obj = js.Dynamic.literal()
      ExistingEnrollmentAction.foreach(__v => __obj.updateDynamic("ExistingEnrollmentAction")(__v.asInstanceOf[js.Any]))
      FraudDetectionConfig.foreach(__v => __obj.updateDynamic("FraudDetectionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnrollmentConfig]
    }
  }

  /** The configuration defining the action to take when a speaker is flagged by the fraud detection system during a batch speaker enrollment job, and the risk threshold to use for identification.
    */
  @js.native
  trait EnrollmentJobFraudDetectionConfig extends js.Object {
    var FraudDetectionAction: js.UndefOr[FraudDetectionAction]
    var RiskThreshold: js.UndefOr[Score]
  }

  object EnrollmentJobFraudDetectionConfig {
    @inline
    def apply(
        FraudDetectionAction: js.UndefOr[FraudDetectionAction] = js.undefined,
        RiskThreshold: js.UndefOr[Score] = js.undefined
    ): EnrollmentJobFraudDetectionConfig = {
      val __obj = js.Dynamic.literal()
      FraudDetectionAction.foreach(__v => __obj.updateDynamic("FraudDetectionAction")(__v.asInstanceOf[js.Any]))
      RiskThreshold.foreach(__v => __obj.updateDynamic("RiskThreshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnrollmentJobFraudDetectionConfig]
    }
  }

  @js.native
  trait EvaluateSessionRequest extends js.Object {
    var DomainId: DomainId
    var SessionNameOrId: SessionNameOrId
  }

  object EvaluateSessionRequest {
    @inline
    def apply(
        DomainId: DomainId,
        SessionNameOrId: SessionNameOrId
    ): EvaluateSessionRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "SessionNameOrId" -> SessionNameOrId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EvaluateSessionRequest]
    }
  }

  @js.native
  trait EvaluateSessionResponse extends js.Object {
    var AuthenticationResult: js.UndefOr[AuthenticationResult]
    var DomainId: js.UndefOr[DomainId]
    var FraudDetectionResult: js.UndefOr[FraudDetectionResult]
    var SessionId: js.UndefOr[SessionId]
    var SessionName: js.UndefOr[SessionName]
    var StreamingStatus: js.UndefOr[StreamingStatus]
  }

  object EvaluateSessionResponse {
    @inline
    def apply(
        AuthenticationResult: js.UndefOr[AuthenticationResult] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        FraudDetectionResult: js.UndefOr[FraudDetectionResult] = js.undefined,
        SessionId: js.UndefOr[SessionId] = js.undefined,
        SessionName: js.UndefOr[SessionName] = js.undefined,
        StreamingStatus: js.UndefOr[StreamingStatus] = js.undefined
    ): EvaluateSessionResponse = {
      val __obj = js.Dynamic.literal()
      AuthenticationResult.foreach(__v => __obj.updateDynamic("AuthenticationResult")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      FraudDetectionResult.foreach(__v => __obj.updateDynamic("FraudDetectionResult")(__v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      SessionName.foreach(__v => __obj.updateDynamic("SessionName")(__v.asInstanceOf[js.Any]))
      StreamingStatus.foreach(__v => __obj.updateDynamic("StreamingStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluateSessionResponse]
    }
  }

  /** Contains error details for a failed batch job.
    */
  @js.native
  trait FailureDetails extends js.Object {
    var Message: js.UndefOr[String]
    var StatusCode: js.UndefOr[Int]
  }

  object FailureDetails {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        StatusCode: js.UndefOr[Int] = js.undefined
    ): FailureDetails = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailureDetails]
    }
  }

  /** The configuration used for performing fraud detection over a speaker during a session.
    */
  @js.native
  trait FraudDetectionConfiguration extends js.Object {
    var RiskThreshold: Score
  }

  object FraudDetectionConfiguration {
    @inline
    def apply(
        RiskThreshold: Score
    ): FraudDetectionConfiguration = {
      val __obj = js.Dynamic.literal(
        "RiskThreshold" -> RiskThreshold.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FraudDetectionConfiguration]
    }
  }

  /** The fraud detection result produced by Voice ID, processed against the current session state and streamed audio of the speaker.
    */
  @js.native
  trait FraudDetectionResult extends js.Object {
    var AudioAggregationEndedAt: js.UndefOr[Timestamp]
    var AudioAggregationStartedAt: js.UndefOr[Timestamp]
    var Configuration: js.UndefOr[FraudDetectionConfiguration]
    var Decision: js.UndefOr[FraudDetectionDecision]
    var FraudDetectionResultId: js.UndefOr[UniqueIdLarge]
    var Reasons: js.UndefOr[FraudDetectionReasons]
    var RiskDetails: js.UndefOr[FraudRiskDetails]
  }

  object FraudDetectionResult {
    @inline
    def apply(
        AudioAggregationEndedAt: js.UndefOr[Timestamp] = js.undefined,
        AudioAggregationStartedAt: js.UndefOr[Timestamp] = js.undefined,
        Configuration: js.UndefOr[FraudDetectionConfiguration] = js.undefined,
        Decision: js.UndefOr[FraudDetectionDecision] = js.undefined,
        FraudDetectionResultId: js.UndefOr[UniqueIdLarge] = js.undefined,
        Reasons: js.UndefOr[FraudDetectionReasons] = js.undefined,
        RiskDetails: js.UndefOr[FraudRiskDetails] = js.undefined
    ): FraudDetectionResult = {
      val __obj = js.Dynamic.literal()
      AudioAggregationEndedAt.foreach(__v => __obj.updateDynamic("AudioAggregationEndedAt")(__v.asInstanceOf[js.Any]))
      AudioAggregationStartedAt.foreach(__v => __obj.updateDynamic("AudioAggregationStartedAt")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Decision.foreach(__v => __obj.updateDynamic("Decision")(__v.asInstanceOf[js.Any]))
      FraudDetectionResultId.foreach(__v => __obj.updateDynamic("FraudDetectionResultId")(__v.asInstanceOf[js.Any]))
      Reasons.foreach(__v => __obj.updateDynamic("Reasons")(__v.asInstanceOf[js.Any]))
      RiskDetails.foreach(__v => __obj.updateDynamic("RiskDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FraudDetectionResult]
    }
  }

  /** Details regarding various fraud risk analyses performed against the current session state and streamed audio of the speaker.
    */
  @js.native
  trait FraudRiskDetails extends js.Object {
    var KnownFraudsterRisk: KnownFraudsterRisk
  }

  object FraudRiskDetails {
    @inline
    def apply(
        KnownFraudsterRisk: KnownFraudsterRisk
    ): FraudRiskDetails = {
      val __obj = js.Dynamic.literal(
        "KnownFraudsterRisk" -> KnownFraudsterRisk.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FraudRiskDetails]
    }
  }

  /** Contains all the information about a fraudster.
    */
  @js.native
  trait Fraudster extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DomainId: js.UndefOr[DomainId]
    var GeneratedFraudsterId: js.UndefOr[GeneratedFraudsterId]
  }

  object Fraudster {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        GeneratedFraudsterId: js.UndefOr[GeneratedFraudsterId] = js.undefined
    ): Fraudster = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      GeneratedFraudsterId.foreach(__v => __obj.updateDynamic("GeneratedFraudsterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Fraudster]
    }
  }

  /** Contains all the information about a fraudster registration job.
    */
  @js.native
  trait FraudsterRegistrationJob extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var DomainId: js.UndefOr[DomainId]
    var EndedAt: js.UndefOr[Timestamp]
    var FailureDetails: js.UndefOr[FailureDetails]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobProgress: js.UndefOr[JobProgress]
    var JobStatus: js.UndefOr[FraudsterRegistrationJobStatus]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
    var RegistrationConfig: js.UndefOr[RegistrationConfig]
  }

  object FraudsterRegistrationJob {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        EndedAt: js.UndefOr[Timestamp] = js.undefined,
        FailureDetails: js.UndefOr[FailureDetails] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobProgress: js.UndefOr[JobProgress] = js.undefined,
        JobStatus: js.UndefOr[FraudsterRegistrationJobStatus] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined,
        RegistrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
    ): FraudsterRegistrationJob = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      EndedAt.foreach(__v => __obj.updateDynamic("EndedAt")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobProgress.foreach(__v => __obj.updateDynamic("JobProgress")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      RegistrationConfig.foreach(__v => __obj.updateDynamic("RegistrationConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FraudsterRegistrationJob]
    }
  }

  /** Contains a summary of information about a fraudster registration job.
    */
  @js.native
  trait FraudsterRegistrationJobSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DomainId: js.UndefOr[DomainId]
    var EndedAt: js.UndefOr[Timestamp]
    var FailureDetails: js.UndefOr[FailureDetails]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobProgress: js.UndefOr[JobProgress]
    var JobStatus: js.UndefOr[FraudsterRegistrationJobStatus]
  }

  object FraudsterRegistrationJobSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        EndedAt: js.UndefOr[Timestamp] = js.undefined,
        FailureDetails: js.UndefOr[FailureDetails] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobProgress: js.UndefOr[JobProgress] = js.undefined,
        JobStatus: js.UndefOr[FraudsterRegistrationJobStatus] = js.undefined
    ): FraudsterRegistrationJobSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      EndedAt.foreach(__v => __obj.updateDynamic("EndedAt")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobProgress.foreach(__v => __obj.updateDynamic("JobProgress")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FraudsterRegistrationJobSummary]
    }
  }

  /** The configuration containing input file information for a batch job.
    */
  @js.native
  trait InputDataConfig extends js.Object {
    var S3Uri: S3Uri
  }

  object InputDataConfig {
    @inline
    def apply(
        S3Uri: S3Uri
    ): InputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputDataConfig]
    }
  }

  /** Indicates the completion progress for a batch job.
    */
  @js.native
  trait JobProgress extends js.Object {
    var PercentComplete: js.UndefOr[Score]
  }

  object JobProgress {
    @inline
    def apply(
        PercentComplete: js.UndefOr[Score] = js.undefined
    ): JobProgress = {
      val __obj = js.Dynamic.literal()
      PercentComplete.foreach(__v => __obj.updateDynamic("PercentComplete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobProgress]
    }
  }

  /** Contains details produced as a result of performing known fraudster risk analysis on a speaker.
    */
  @js.native
  trait KnownFraudsterRisk extends js.Object {
    var RiskScore: Score
    var GeneratedFraudsterId: js.UndefOr[GeneratedFraudsterId]
  }

  object KnownFraudsterRisk {
    @inline
    def apply(
        RiskScore: Score,
        GeneratedFraudsterId: js.UndefOr[GeneratedFraudsterId] = js.undefined
    ): KnownFraudsterRisk = {
      val __obj = js.Dynamic.literal(
        "RiskScore" -> RiskScore.asInstanceOf[js.Any]
      )

      GeneratedFraudsterId.foreach(__v => __obj.updateDynamic("GeneratedFraudsterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KnownFraudsterRisk]
    }
  }

  @js.native
  trait ListDomainsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsForListDomainFe]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDomainsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResultsForListDomainFe] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsRequest]
    }
  }

  @js.native
  trait ListDomainsResponse extends js.Object {
    var DomainSummaries: js.UndefOr[DomainSummaries]
    var NextToken: js.UndefOr[String]
  }

  object ListDomainsResponse {
    @inline
    def apply(
        DomainSummaries: js.UndefOr[DomainSummaries] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDomainsResponse = {
      val __obj = js.Dynamic.literal()
      DomainSummaries.foreach(__v => __obj.updateDynamic("DomainSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsResponse]
    }
  }

  @js.native
  trait ListFraudsterRegistrationJobsRequest extends js.Object {
    var DomainId: DomainId
    var JobStatus: js.UndefOr[FraudsterRegistrationJobStatus]
    var MaxResults: js.UndefOr[MaxResultsForList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFraudsterRegistrationJobsRequest {
    @inline
    def apply(
        DomainId: DomainId,
        JobStatus: js.UndefOr[FraudsterRegistrationJobStatus] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsForList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFraudsterRegistrationJobsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any]
      )

      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFraudsterRegistrationJobsRequest]
    }
  }

  @js.native
  trait ListFraudsterRegistrationJobsResponse extends js.Object {
    var JobSummaries: js.UndefOr[FraudsterRegistrationJobSummaries]
    var NextToken: js.UndefOr[String]
  }

  object ListFraudsterRegistrationJobsResponse {
    @inline
    def apply(
        JobSummaries: js.UndefOr[FraudsterRegistrationJobSummaries] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFraudsterRegistrationJobsResponse = {
      val __obj = js.Dynamic.literal()
      JobSummaries.foreach(__v => __obj.updateDynamic("JobSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFraudsterRegistrationJobsResponse]
    }
  }

  @js.native
  trait ListSpeakerEnrollmentJobsRequest extends js.Object {
    var DomainId: DomainId
    var JobStatus: js.UndefOr[SpeakerEnrollmentJobStatus]
    var MaxResults: js.UndefOr[MaxResultsForList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSpeakerEnrollmentJobsRequest {
    @inline
    def apply(
        DomainId: DomainId,
        JobStatus: js.UndefOr[SpeakerEnrollmentJobStatus] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsForList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSpeakerEnrollmentJobsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any]
      )

      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSpeakerEnrollmentJobsRequest]
    }
  }

  @js.native
  trait ListSpeakerEnrollmentJobsResponse extends js.Object {
    var JobSummaries: js.UndefOr[SpeakerEnrollmentJobSummaries]
    var NextToken: js.UndefOr[String]
  }

  object ListSpeakerEnrollmentJobsResponse {
    @inline
    def apply(
        JobSummaries: js.UndefOr[SpeakerEnrollmentJobSummaries] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListSpeakerEnrollmentJobsResponse = {
      val __obj = js.Dynamic.literal()
      JobSummaries.foreach(__v => __obj.updateDynamic("JobSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSpeakerEnrollmentJobsResponse]
    }
  }

  @js.native
  trait ListSpeakersRequest extends js.Object {
    var DomainId: DomainId
    var MaxResults: js.UndefOr[MaxResultsForList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSpeakersRequest {
    @inline
    def apply(
        DomainId: DomainId,
        MaxResults: js.UndefOr[MaxResultsForList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSpeakersRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSpeakersRequest]
    }
  }

  @js.native
  trait ListSpeakersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var SpeakerSummaries: js.UndefOr[SpeakerSummaries]
  }

  object ListSpeakersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        SpeakerSummaries: js.UndefOr[SpeakerSummaries] = js.undefined
    ): ListSpeakersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SpeakerSummaries.foreach(__v => __obj.updateDynamic("SpeakerSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSpeakersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait OptOutSpeakerRequest extends js.Object {
    var DomainId: DomainId
    var SpeakerId: SpeakerId
  }

  object OptOutSpeakerRequest {
    @inline
    def apply(
        DomainId: DomainId,
        SpeakerId: SpeakerId
    ): OptOutSpeakerRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "SpeakerId" -> SpeakerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OptOutSpeakerRequest]
    }
  }

  @js.native
  trait OptOutSpeakerResponse extends js.Object {
    var Speaker: js.UndefOr[Speaker]
  }

  object OptOutSpeakerResponse {
    @inline
    def apply(
        Speaker: js.UndefOr[Speaker] = js.undefined
    ): OptOutSpeakerResponse = {
      val __obj = js.Dynamic.literal()
      Speaker.foreach(__v => __obj.updateDynamic("Speaker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptOutSpeakerResponse]
    }
  }

  /** The configuration containing output file information for a batch job.
    */
  @js.native
  trait OutputDataConfig extends js.Object {
    var S3Uri: S3Uri
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object OutputDataConfig {
    @inline
    def apply(
        S3Uri: S3Uri,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): OutputDataConfig = {
      val __obj = js.Dynamic.literal(
        "S3Uri" -> S3Uri.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDataConfig]
    }
  }

  /** The configuration definining the action to take when a duplicate fraudster is detected, and the similarity threshold to use for detecting a duplicate fraudster during a batch fraudster registration job.
    */
  @js.native
  trait RegistrationConfig extends js.Object {
    var DuplicateRegistrationAction: js.UndefOr[DuplicateRegistrationAction]
    var FraudsterSimilarityThreshold: js.UndefOr[Score]
  }

  object RegistrationConfig {
    @inline
    def apply(
        DuplicateRegistrationAction: js.UndefOr[DuplicateRegistrationAction] = js.undefined,
        FraudsterSimilarityThreshold: js.UndefOr[Score] = js.undefined
    ): RegistrationConfig = {
      val __obj = js.Dynamic.literal()
      DuplicateRegistrationAction.foreach(__v => __obj.updateDynamic("DuplicateRegistrationAction")(__v.asInstanceOf[js.Any]))
      FraudsterSimilarityThreshold.foreach(__v => __obj.updateDynamic("FraudsterSimilarityThreshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegistrationConfig]
    }
  }

  /** The configuration containing information about the customer-managed KMS Key used for encrypting customer data.
    */
  @js.native
  trait ServerSideEncryptionConfiguration extends js.Object {
    var KmsKeyId: KmsKeyId
  }

  object ServerSideEncryptionConfiguration {
    @inline
    def apply(
        KmsKeyId: KmsKeyId
    ): ServerSideEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "KmsKeyId" -> KmsKeyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ServerSideEncryptionConfiguration]
    }
  }

  /** Contains all the information about a speaker.
    */
  @js.native
  trait Speaker extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var CustomerSpeakerId: js.UndefOr[CustomerSpeakerId]
    var DomainId: js.UndefOr[DomainId]
    var GeneratedSpeakerId: js.UndefOr[GeneratedSpeakerId]
    var Status: js.UndefOr[SpeakerStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object Speaker {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        CustomerSpeakerId: js.UndefOr[CustomerSpeakerId] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        GeneratedSpeakerId: js.UndefOr[GeneratedSpeakerId] = js.undefined,
        Status: js.UndefOr[SpeakerStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): Speaker = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CustomerSpeakerId.foreach(__v => __obj.updateDynamic("CustomerSpeakerId")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      GeneratedSpeakerId.foreach(__v => __obj.updateDynamic("GeneratedSpeakerId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Speaker]
    }
  }

  /** Contains all the information about a speaker enrollment job.
    */
  @js.native
  trait SpeakerEnrollmentJob extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DataAccessRoleArn: js.UndefOr[IamRoleArn]
    var DomainId: js.UndefOr[DomainId]
    var EndedAt: js.UndefOr[Timestamp]
    var EnrollmentConfig: js.UndefOr[EnrollmentConfig]
    var FailureDetails: js.UndefOr[FailureDetails]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobProgress: js.UndefOr[JobProgress]
    var JobStatus: js.UndefOr[SpeakerEnrollmentJobStatus]
    var OutputDataConfig: js.UndefOr[OutputDataConfig]
  }

  object SpeakerEnrollmentJob {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        EndedAt: js.UndefOr[Timestamp] = js.undefined,
        EnrollmentConfig: js.UndefOr[EnrollmentConfig] = js.undefined,
        FailureDetails: js.UndefOr[FailureDetails] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobProgress: js.UndefOr[JobProgress] = js.undefined,
        JobStatus: js.UndefOr[SpeakerEnrollmentJobStatus] = js.undefined,
        OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
    ): SpeakerEnrollmentJob = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataAccessRoleArn.foreach(__v => __obj.updateDynamic("DataAccessRoleArn")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      EndedAt.foreach(__v => __obj.updateDynamic("EndedAt")(__v.asInstanceOf[js.Any]))
      EnrollmentConfig.foreach(__v => __obj.updateDynamic("EnrollmentConfig")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobProgress.foreach(__v => __obj.updateDynamic("JobProgress")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      OutputDataConfig.foreach(__v => __obj.updateDynamic("OutputDataConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpeakerEnrollmentJob]
    }
  }

  /** Contains a summary of information about a speaker enrollment job.
    */
  @js.native
  trait SpeakerEnrollmentJobSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var DomainId: js.UndefOr[DomainId]
    var EndedAt: js.UndefOr[Timestamp]
    var FailureDetails: js.UndefOr[FailureDetails]
    var JobId: js.UndefOr[JobId]
    var JobName: js.UndefOr[JobName]
    var JobProgress: js.UndefOr[JobProgress]
    var JobStatus: js.UndefOr[SpeakerEnrollmentJobStatus]
  }

  object SpeakerEnrollmentJobSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        EndedAt: js.UndefOr[Timestamp] = js.undefined,
        FailureDetails: js.UndefOr[FailureDetails] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        JobProgress: js.UndefOr[JobProgress] = js.undefined,
        JobStatus: js.UndefOr[SpeakerEnrollmentJobStatus] = js.undefined
    ): SpeakerEnrollmentJobSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      EndedAt.foreach(__v => __obj.updateDynamic("EndedAt")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobProgress.foreach(__v => __obj.updateDynamic("JobProgress")(__v.asInstanceOf[js.Any]))
      JobStatus.foreach(__v => __obj.updateDynamic("JobStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpeakerEnrollmentJobSummary]
    }
  }

  /** Contains a summary of information about a speaker.
    */
  @js.native
  trait SpeakerSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var CustomerSpeakerId: js.UndefOr[CustomerSpeakerId]
    var DomainId: js.UndefOr[DomainId]
    var GeneratedSpeakerId: js.UndefOr[GeneratedSpeakerId]
    var Status: js.UndefOr[SpeakerStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object SpeakerSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        CustomerSpeakerId: js.UndefOr[CustomerSpeakerId] = js.undefined,
        DomainId: js.UndefOr[DomainId] = js.undefined,
        GeneratedSpeakerId: js.UndefOr[GeneratedSpeakerId] = js.undefined,
        Status: js.UndefOr[SpeakerStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): SpeakerSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CustomerSpeakerId.foreach(__v => __obj.updateDynamic("CustomerSpeakerId")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      GeneratedSpeakerId.foreach(__v => __obj.updateDynamic("GeneratedSpeakerId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpeakerSummary]
    }
  }

  @js.native
  trait StartFraudsterRegistrationJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var DomainId: DomainId
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ClientToken: js.UndefOr[ClientTokenString]
    var JobName: js.UndefOr[JobName]
    var RegistrationConfig: js.UndefOr[RegistrationConfig]
  }

  object StartFraudsterRegistrationJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        DomainId: DomainId,
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        ClientToken: js.UndefOr[ClientTokenString] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        RegistrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
    ): StartFraudsterRegistrationJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      RegistrationConfig.foreach(__v => __obj.updateDynamic("RegistrationConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFraudsterRegistrationJobRequest]
    }
  }

  @js.native
  trait StartFraudsterRegistrationJobResponse extends js.Object {
    var Job: js.UndefOr[FraudsterRegistrationJob]
  }

  object StartFraudsterRegistrationJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[FraudsterRegistrationJob] = js.undefined
    ): StartFraudsterRegistrationJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFraudsterRegistrationJobResponse]
    }
  }

  @js.native
  trait StartSpeakerEnrollmentJobRequest extends js.Object {
    var DataAccessRoleArn: IamRoleArn
    var DomainId: DomainId
    var InputDataConfig: InputDataConfig
    var OutputDataConfig: OutputDataConfig
    var ClientToken: js.UndefOr[ClientTokenString]
    var EnrollmentConfig: js.UndefOr[EnrollmentConfig]
    var JobName: js.UndefOr[JobName]
  }

  object StartSpeakerEnrollmentJobRequest {
    @inline
    def apply(
        DataAccessRoleArn: IamRoleArn,
        DomainId: DomainId,
        InputDataConfig: InputDataConfig,
        OutputDataConfig: OutputDataConfig,
        ClientToken: js.UndefOr[ClientTokenString] = js.undefined,
        EnrollmentConfig: js.UndefOr[EnrollmentConfig] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined
    ): StartSpeakerEnrollmentJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataAccessRoleArn" -> DataAccessRoleArn.asInstanceOf[js.Any],
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "OutputDataConfig" -> OutputDataConfig.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      EnrollmentConfig.foreach(__v => __obj.updateDynamic("EnrollmentConfig")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSpeakerEnrollmentJobRequest]
    }
  }

  @js.native
  trait StartSpeakerEnrollmentJobResponse extends js.Object {
    var Job: js.UndefOr[SpeakerEnrollmentJob]
  }

  object StartSpeakerEnrollmentJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[SpeakerEnrollmentJob] = js.undefined
    ): StartSpeakerEnrollmentJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSpeakerEnrollmentJobResponse]
    }
  }

  /** A tag that can be assigned to a Voice ID resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDomainRequest extends js.Object {
    var DomainId: DomainId
    var Name: DomainName
    var ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration
    var Description: js.UndefOr[Description]
  }

  object UpdateDomainRequest {
    @inline
    def apply(
        DomainId: DomainId,
        Name: DomainName,
        ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration,
        Description: js.UndefOr[Description] = js.undefined
    ): UpdateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ServerSideEncryptionConfiguration" -> ServerSideEncryptionConfiguration.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainRequest]
    }
  }

  @js.native
  trait UpdateDomainResponse extends js.Object {
    var Domain: js.UndefOr[Domain]
  }

  object UpdateDomainResponse {
    @inline
    def apply(
        Domain: js.UndefOr[Domain] = js.undefined
    ): UpdateDomainResponse = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainResponse]
    }
  }
}
