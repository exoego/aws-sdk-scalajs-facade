package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object mturk {
  type AssignmentList                 = js.Array[Assignment]
  type AssignmentStatusList           = js.Array[AssignmentStatus]
  type BonusPaymentList               = js.Array[BonusPayment]
  type CountryParameters              = String
  type CurrencyAmount                 = String
  type CustomerId                     = String
  type CustomerIdList                 = js.Array[CustomerId]
  type EntityId                       = String
  type EventTypeList                  = js.Array[EventType]
  type ExceptionMessage               = String
  type HITLayoutParameterList         = js.Array[HITLayoutParameter]
  type HITList                        = js.Array[HIT]
  type IdempotencyToken               = String
  type IntegerList                    = js.Array[Int]
  type LocaleList                     = js.Array[Locale]
  type NotifyWorkersFailureStatusList = js.Array[NotifyWorkersFailureStatus]
  type PaginationToken                = String
  type ParameterMapEntryList          = js.Array[ParameterMapEntry]
  type PolicyParameterList            = js.Array[PolicyParameter]
  type QualificationList              = js.Array[Qualification]
  type QualificationRequestList       = js.Array[QualificationRequest]
  type QualificationRequirementList   = js.Array[QualificationRequirement]
  type QualificationTypeList          = js.Array[QualificationType]
  type ResultSize                     = Int
  type ReviewActionDetailList         = js.Array[ReviewActionDetail]
  type ReviewPolicyLevelList          = js.Array[ReviewPolicyLevel]
  type ReviewResultDetailList         = js.Array[ReviewResultDetail]
  type StringList                     = js.Array[String]
  type Timestamp                      = js.Date
  type TurkErrorCode                  = String
  type WorkerBlockList                = js.Array[WorkerBlock]

  implicit final class MTurkOps(private val service: MTurk) extends AnyVal {

    @inline def acceptQualificationRequestFuture(
        params: AcceptQualificationRequestRequest
    ): Future[AcceptQualificationRequestResponse] = service.acceptQualificationRequest(params).promise().toFuture
    @inline def approveAssignmentFuture(params: ApproveAssignmentRequest): Future[ApproveAssignmentResponse] =
      service.approveAssignment(params).promise().toFuture
    @inline def associateQualificationWithWorkerFuture(
        params: AssociateQualificationWithWorkerRequest
    ): Future[AssociateQualificationWithWorkerResponse] =
      service.associateQualificationWithWorker(params).promise().toFuture
    @inline def createAdditionalAssignmentsForHITFuture(
        params: CreateAdditionalAssignmentsForHITRequest
    ): Future[CreateAdditionalAssignmentsForHITResponse] =
      service.createAdditionalAssignmentsForHIT(params).promise().toFuture
    @inline def createHITFuture(params: CreateHITRequest): Future[CreateHITResponse] =
      service.createHIT(params).promise().toFuture
    @inline def createHITTypeFuture(params: CreateHITTypeRequest): Future[CreateHITTypeResponse] =
      service.createHITType(params).promise().toFuture
    @inline def createHITWithHITTypeFuture(params: CreateHITWithHITTypeRequest): Future[CreateHITWithHITTypeResponse] =
      service.createHITWithHITType(params).promise().toFuture
    @inline def createQualificationTypeFuture(
        params: CreateQualificationTypeRequest
    ): Future[CreateQualificationTypeResponse] = service.createQualificationType(params).promise().toFuture
    @inline def createWorkerBlockFuture(params: CreateWorkerBlockRequest): Future[CreateWorkerBlockResponse] =
      service.createWorkerBlock(params).promise().toFuture
    @inline def deleteHITFuture(params: DeleteHITRequest): Future[DeleteHITResponse] =
      service.deleteHIT(params).promise().toFuture
    @inline def deleteQualificationTypeFuture(
        params: DeleteQualificationTypeRequest
    ): Future[DeleteQualificationTypeResponse] = service.deleteQualificationType(params).promise().toFuture
    @inline def deleteWorkerBlockFuture(params: DeleteWorkerBlockRequest): Future[DeleteWorkerBlockResponse] =
      service.deleteWorkerBlock(params).promise().toFuture
    @inline def disassociateQualificationFromWorkerFuture(
        params: DisassociateQualificationFromWorkerRequest
    ): Future[DisassociateQualificationFromWorkerResponse] =
      service.disassociateQualificationFromWorker(params).promise().toFuture
    @inline def getAccountBalanceFuture(params: GetAccountBalanceRequest): Future[GetAccountBalanceResponse] =
      service.getAccountBalance(params).promise().toFuture
    @inline def getAssignmentFuture(params: GetAssignmentRequest): Future[GetAssignmentResponse] =
      service.getAssignment(params).promise().toFuture
    @inline def getFileUploadURLFuture(params: GetFileUploadURLRequest): Future[GetFileUploadURLResponse] =
      service.getFileUploadURL(params).promise().toFuture
    @inline def getHITFuture(params: GetHITRequest): Future[GetHITResponse] = service.getHIT(params).promise().toFuture
    @inline def getQualificationScoreFuture(
        params: GetQualificationScoreRequest
    ): Future[GetQualificationScoreResponse] = service.getQualificationScore(params).promise().toFuture
    @inline def getQualificationTypeFuture(params: GetQualificationTypeRequest): Future[GetQualificationTypeResponse] =
      service.getQualificationType(params).promise().toFuture
    @inline def listAssignmentsForHITFuture(
        params: ListAssignmentsForHITRequest
    ): Future[ListAssignmentsForHITResponse] = service.listAssignmentsForHIT(params).promise().toFuture
    @inline def listBonusPaymentsFuture(params: ListBonusPaymentsRequest): Future[ListBonusPaymentsResponse] =
      service.listBonusPayments(params).promise().toFuture
    @inline def listHITsForQualificationTypeFuture(
        params: ListHITsForQualificationTypeRequest
    ): Future[ListHITsForQualificationTypeResponse] = service.listHITsForQualificationType(params).promise().toFuture
    @inline def listHITsFuture(params: ListHITsRequest): Future[ListHITsResponse] =
      service.listHITs(params).promise().toFuture
    @inline def listQualificationRequestsFuture(
        params: ListQualificationRequestsRequest
    ): Future[ListQualificationRequestsResponse] = service.listQualificationRequests(params).promise().toFuture
    @inline def listQualificationTypesFuture(
        params: ListQualificationTypesRequest
    ): Future[ListQualificationTypesResponse] = service.listQualificationTypes(params).promise().toFuture
    @inline def listReviewPolicyResultsForHITFuture(
        params: ListReviewPolicyResultsForHITRequest
    ): Future[ListReviewPolicyResultsForHITResponse] = service.listReviewPolicyResultsForHIT(params).promise().toFuture
    @inline def listReviewableHITsFuture(params: ListReviewableHITsRequest): Future[ListReviewableHITsResponse] =
      service.listReviewableHITs(params).promise().toFuture
    @inline def listWorkerBlocksFuture(params: ListWorkerBlocksRequest): Future[ListWorkerBlocksResponse] =
      service.listWorkerBlocks(params).promise().toFuture
    @inline def listWorkersWithQualificationTypeFuture(
        params: ListWorkersWithQualificationTypeRequest
    ): Future[ListWorkersWithQualificationTypeResponse] =
      service.listWorkersWithQualificationType(params).promise().toFuture
    @inline def notifyWorkersFuture(params: NotifyWorkersRequest): Future[NotifyWorkersResponse] =
      service.notifyWorkers(params).promise().toFuture
    @inline def rejectAssignmentFuture(params: RejectAssignmentRequest): Future[RejectAssignmentResponse] =
      service.rejectAssignment(params).promise().toFuture
    @inline def rejectQualificationRequestFuture(
        params: RejectQualificationRequestRequest
    ): Future[RejectQualificationRequestResponse] = service.rejectQualificationRequest(params).promise().toFuture
    @inline def sendBonusFuture(params: SendBonusRequest): Future[SendBonusResponse] =
      service.sendBonus(params).promise().toFuture
    @inline def sendTestEventNotificationFuture(
        params: SendTestEventNotificationRequest
    ): Future[SendTestEventNotificationResponse] = service.sendTestEventNotification(params).promise().toFuture
    @inline def updateExpirationForHITFuture(
        params: UpdateExpirationForHITRequest
    ): Future[UpdateExpirationForHITResponse] = service.updateExpirationForHIT(params).promise().toFuture
    @inline def updateHITReviewStatusFuture(
        params: UpdateHITReviewStatusRequest
    ): Future[UpdateHITReviewStatusResponse] = service.updateHITReviewStatus(params).promise().toFuture
    @inline def updateHITTypeOfHITFuture(params: UpdateHITTypeOfHITRequest): Future[UpdateHITTypeOfHITResponse] =
      service.updateHITTypeOfHIT(params).promise().toFuture
    @inline def updateNotificationSettingsFuture(
        params: UpdateNotificationSettingsRequest
    ): Future[UpdateNotificationSettingsResponse] = service.updateNotificationSettings(params).promise().toFuture
    @inline def updateQualificationTypeFuture(
        params: UpdateQualificationTypeRequest
    ): Future[UpdateQualificationTypeResponse] = service.updateQualificationType(params).promise().toFuture
  }
}

package mturk {
  @js.native
  @JSImport("aws-sdk", "MTurk")
  class MTurk() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptQualificationRequest(
        params: AcceptQualificationRequestRequest
    ): Request[AcceptQualificationRequestResponse]                                              = js.native
    def approveAssignment(params: ApproveAssignmentRequest): Request[ApproveAssignmentResponse] = js.native
    def associateQualificationWithWorker(
        params: AssociateQualificationWithWorkerRequest
    ): Request[AssociateQualificationWithWorkerResponse] = js.native
    def createAdditionalAssignmentsForHIT(
        params: CreateAdditionalAssignmentsForHITRequest
    ): Request[CreateAdditionalAssignmentsForHITResponse]                                                = js.native
    def createHIT(params: CreateHITRequest): Request[CreateHITResponse]                                  = js.native
    def createHITType(params: CreateHITTypeRequest): Request[CreateHITTypeResponse]                      = js.native
    def createHITWithHITType(params: CreateHITWithHITTypeRequest): Request[CreateHITWithHITTypeResponse] = js.native
    def createQualificationType(params: CreateQualificationTypeRequest): Request[CreateQualificationTypeResponse] =
      js.native
    def createWorkerBlock(params: CreateWorkerBlockRequest): Request[CreateWorkerBlockResponse] = js.native
    def deleteHIT(params: DeleteHITRequest): Request[DeleteHITResponse]                         = js.native
    def deleteQualificationType(params: DeleteQualificationTypeRequest): Request[DeleteQualificationTypeResponse] =
      js.native
    def deleteWorkerBlock(params: DeleteWorkerBlockRequest): Request[DeleteWorkerBlockResponse] = js.native
    def disassociateQualificationFromWorker(
        params: DisassociateQualificationFromWorkerRequest
    ): Request[DisassociateQualificationFromWorkerResponse]                                                 = js.native
    def getAccountBalance(params: GetAccountBalanceRequest): Request[GetAccountBalanceResponse]             = js.native
    def getAssignment(params: GetAssignmentRequest): Request[GetAssignmentResponse]                         = js.native
    def getFileUploadURL(params: GetFileUploadURLRequest): Request[GetFileUploadURLResponse]                = js.native
    def getHIT(params: GetHITRequest): Request[GetHITResponse]                                              = js.native
    def getQualificationScore(params: GetQualificationScoreRequest): Request[GetQualificationScoreResponse] = js.native
    def getQualificationType(params: GetQualificationTypeRequest): Request[GetQualificationTypeResponse]    = js.native
    def listAssignmentsForHIT(params: ListAssignmentsForHITRequest): Request[ListAssignmentsForHITResponse] = js.native
    def listBonusPayments(params: ListBonusPaymentsRequest): Request[ListBonusPaymentsResponse]             = js.native
    def listHITs(params: ListHITsRequest): Request[ListHITsResponse]                                        = js.native
    def listHITsForQualificationType(
        params: ListHITsForQualificationTypeRequest
    ): Request[ListHITsForQualificationTypeResponse] = js.native
    def listQualificationRequests(
        params: ListQualificationRequestsRequest
    ): Request[ListQualificationRequestsResponse] = js.native
    def listQualificationTypes(params: ListQualificationTypesRequest): Request[ListQualificationTypesResponse] =
      js.native
    def listReviewPolicyResultsForHIT(
        params: ListReviewPolicyResultsForHITRequest
    ): Request[ListReviewPolicyResultsForHITResponse]                                              = js.native
    def listReviewableHITs(params: ListReviewableHITsRequest): Request[ListReviewableHITsResponse] = js.native
    def listWorkerBlocks(params: ListWorkerBlocksRequest): Request[ListWorkerBlocksResponse]       = js.native
    def listWorkersWithQualificationType(
        params: ListWorkersWithQualificationTypeRequest
    ): Request[ListWorkersWithQualificationTypeResponse]                                     = js.native
    def notifyWorkers(params: NotifyWorkersRequest): Request[NotifyWorkersResponse]          = js.native
    def rejectAssignment(params: RejectAssignmentRequest): Request[RejectAssignmentResponse] = js.native
    def rejectQualificationRequest(
        params: RejectQualificationRequestRequest
    ): Request[RejectQualificationRequestResponse]                      = js.native
    def sendBonus(params: SendBonusRequest): Request[SendBonusResponse] = js.native
    def sendTestEventNotification(
        params: SendTestEventNotificationRequest
    ): Request[SendTestEventNotificationResponse] = js.native
    def updateExpirationForHIT(params: UpdateExpirationForHITRequest): Request[UpdateExpirationForHITResponse] =
      js.native
    def updateHITReviewStatus(params: UpdateHITReviewStatusRequest): Request[UpdateHITReviewStatusResponse] = js.native
    def updateHITTypeOfHIT(params: UpdateHITTypeOfHITRequest): Request[UpdateHITTypeOfHITResponse]          = js.native
    def updateNotificationSettings(
        params: UpdateNotificationSettingsRequest
    ): Request[UpdateNotificationSettingsResponse] = js.native
    def updateQualificationType(params: UpdateQualificationTypeRequest): Request[UpdateQualificationTypeResponse] =
      js.native
  }

  @js.native
  @Factory
  trait AcceptQualificationRequestRequest extends js.Object {
    var QualificationRequestId: String
    var IntegerValue: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait AcceptQualificationRequestResponse extends js.Object {}

  @js.native
  @Factory
  trait ApproveAssignmentRequest extends js.Object {
    var AssignmentId: EntityId
    var OverrideRejection: js.UndefOr[Boolean]
    var RequesterFeedback: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ApproveAssignmentResponse extends js.Object {}

  /**
    * The Assignment data structure represents a single assignment of a HIT to a Worker. The assignment tracks the Worker's efforts to complete the HIT, and contains the results for later retrieval.
    */
  @js.native
  @Factory
  trait Assignment extends js.Object {
    var AcceptTime: js.UndefOr[Timestamp]
    var Answer: js.UndefOr[String]
    var ApprovalTime: js.UndefOr[Timestamp]
    var AssignmentId: js.UndefOr[EntityId]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var AutoApprovalTime: js.UndefOr[Timestamp]
    var Deadline: js.UndefOr[Timestamp]
    var HITId: js.UndefOr[EntityId]
    var RejectionTime: js.UndefOr[Timestamp]
    var RequesterFeedback: js.UndefOr[String]
    var SubmitTime: js.UndefOr[Timestamp]
    var WorkerId: js.UndefOr[CustomerId]
  }

  @js.native
  sealed trait AssignmentStatus extends js.Any
  object AssignmentStatus extends js.Object {
    val Submitted = "Submitted".asInstanceOf[AssignmentStatus]
    val Approved  = "Approved".asInstanceOf[AssignmentStatus]
    val Rejected  = "Rejected".asInstanceOf[AssignmentStatus]

    val values = js.Object.freeze(js.Array(Submitted, Approved, Rejected))
  }

  @js.native
  @Factory
  trait AssociateQualificationWithWorkerRequest extends js.Object {
    var QualificationTypeId: EntityId
    var WorkerId: CustomerId
    var IntegerValue: js.UndefOr[Int]
    var SendNotification: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AssociateQualificationWithWorkerResponse extends js.Object {}

  /**
    * An object representing a Bonus payment paid to a Worker.
    */
  @js.native
  @Factory
  trait BonusPayment extends js.Object {
    var AssignmentId: js.UndefOr[EntityId]
    var BonusAmount: js.UndefOr[CurrencyAmount]
    var GrantTime: js.UndefOr[Timestamp]
    var Reason: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }

  @js.native
  sealed trait Comparator extends js.Any
  object Comparator extends js.Object {
    val LessThan             = "LessThan".asInstanceOf[Comparator]
    val LessThanOrEqualTo    = "LessThanOrEqualTo".asInstanceOf[Comparator]
    val GreaterThan          = "GreaterThan".asInstanceOf[Comparator]
    val GreaterThanOrEqualTo = "GreaterThanOrEqualTo".asInstanceOf[Comparator]
    val EqualTo              = "EqualTo".asInstanceOf[Comparator]
    val NotEqualTo           = "NotEqualTo".asInstanceOf[Comparator]
    val Exists               = "Exists".asInstanceOf[Comparator]
    val DoesNotExist         = "DoesNotExist".asInstanceOf[Comparator]
    val In                   = "In".asInstanceOf[Comparator]
    val NotIn                = "NotIn".asInstanceOf[Comparator]

    val values = js.Object.freeze(
      js.Array(
        LessThan,
        LessThanOrEqualTo,
        GreaterThan,
        GreaterThanOrEqualTo,
        EqualTo,
        NotEqualTo,
        Exists,
        DoesNotExist,
        In,
        NotIn
      )
    )
  }

  @js.native
  @Factory
  trait CreateAdditionalAssignmentsForHITRequest extends js.Object {
    var HITId: EntityId
    var NumberOfAdditionalAssignments: Int
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
  }

  @js.native
  @Factory
  trait CreateAdditionalAssignmentsForHITResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateHITRequest extends js.Object {
    var AssignmentDurationInSeconds: Double
    var Description: String
    var LifetimeInSeconds: Double
    var Reward: CurrencyAmount
    var Title: String
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy]
    var AutoApprovalDelayInSeconds: js.UndefOr[Double]
    var HITLayoutId: js.UndefOr[EntityId]
    var HITLayoutParameters: js.UndefOr[HITLayoutParameterList]
    var HITReviewPolicy: js.UndefOr[ReviewPolicy]
    var Keywords: js.UndefOr[String]
    var MaxAssignments: js.UndefOr[Int]
    var QualificationRequirements: js.UndefOr[QualificationRequirementList]
    var Question: js.UndefOr[String]
    var RequesterAnnotation: js.UndefOr[String]
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
  }

  @js.native
  @Factory
  trait CreateHITResponse extends js.Object {
    var HIT: js.UndefOr[HIT]
  }

  @js.native
  @Factory
  trait CreateHITTypeRequest extends js.Object {
    var AssignmentDurationInSeconds: Double
    var Description: String
    var Reward: CurrencyAmount
    var Title: String
    var AutoApprovalDelayInSeconds: js.UndefOr[Double]
    var Keywords: js.UndefOr[String]
    var QualificationRequirements: js.UndefOr[QualificationRequirementList]
  }

  @js.native
  @Factory
  trait CreateHITTypeResponse extends js.Object {
    var HITTypeId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait CreateHITWithHITTypeRequest extends js.Object {
    var HITTypeId: EntityId
    var LifetimeInSeconds: Double
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy]
    var HITLayoutId: js.UndefOr[EntityId]
    var HITLayoutParameters: js.UndefOr[HITLayoutParameterList]
    var HITReviewPolicy: js.UndefOr[ReviewPolicy]
    var MaxAssignments: js.UndefOr[Int]
    var Question: js.UndefOr[String]
    var RequesterAnnotation: js.UndefOr[String]
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
  }

  @js.native
  @Factory
  trait CreateHITWithHITTypeResponse extends js.Object {
    var HIT: js.UndefOr[HIT]
  }

  @js.native
  @Factory
  trait CreateQualificationTypeRequest extends js.Object {
    var Description: String
    var Name: String
    var QualificationTypeStatus: QualificationTypeStatus
    var AnswerKey: js.UndefOr[String]
    var AutoGranted: js.UndefOr[Boolean]
    var AutoGrantedValue: js.UndefOr[Int]
    var Keywords: js.UndefOr[String]
    var RetryDelayInSeconds: js.UndefOr[Double]
    var Test: js.UndefOr[String]
    var TestDurationInSeconds: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait CreateQualificationTypeResponse extends js.Object {
    var QualificationType: js.UndefOr[QualificationType]
  }

  @js.native
  @Factory
  trait CreateWorkerBlockRequest extends js.Object {
    var Reason: String
    var WorkerId: CustomerId
  }

  @js.native
  @Factory
  trait CreateWorkerBlockResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteHITRequest extends js.Object {
    var HITId: EntityId
  }

  @js.native
  @Factory
  trait DeleteHITResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
  }

  @js.native
  @Factory
  trait DeleteQualificationTypeResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteWorkerBlockRequest extends js.Object {
    var WorkerId: CustomerId
    var Reason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteWorkerBlockResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateQualificationFromWorkerRequest extends js.Object {
    var QualificationTypeId: EntityId
    var WorkerId: CustomerId
    var Reason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DisassociateQualificationFromWorkerResponse extends js.Object {}

  @js.native
  sealed trait EventType extends js.Any
  object EventType extends js.Object {
    val AssignmentAccepted  = "AssignmentAccepted".asInstanceOf[EventType]
    val AssignmentAbandoned = "AssignmentAbandoned".asInstanceOf[EventType]
    val AssignmentReturned  = "AssignmentReturned".asInstanceOf[EventType]
    val AssignmentSubmitted = "AssignmentSubmitted".asInstanceOf[EventType]
    val AssignmentRejected  = "AssignmentRejected".asInstanceOf[EventType]
    val AssignmentApproved  = "AssignmentApproved".asInstanceOf[EventType]
    val HITCreated          = "HITCreated".asInstanceOf[EventType]
    val HITExpired          = "HITExpired".asInstanceOf[EventType]
    val HITReviewable       = "HITReviewable".asInstanceOf[EventType]
    val HITExtended         = "HITExtended".asInstanceOf[EventType]
    val HITDisposed         = "HITDisposed".asInstanceOf[EventType]
    val Ping                = "Ping".asInstanceOf[EventType]

    val values = js.Object.freeze(
      js.Array(
        AssignmentAccepted,
        AssignmentAbandoned,
        AssignmentReturned,
        AssignmentSubmitted,
        AssignmentRejected,
        AssignmentApproved,
        HITCreated,
        HITExpired,
        HITReviewable,
        HITExtended,
        HITDisposed,
        Ping
      )
    )
  }

  @js.native
  @Factory
  trait GetAccountBalanceRequest extends js.Object {}

  @js.native
  @Factory
  trait GetAccountBalanceResponse extends js.Object {
    var AvailableBalance: js.UndefOr[CurrencyAmount]
    var OnHoldBalance: js.UndefOr[CurrencyAmount]
  }

  @js.native
  @Factory
  trait GetAssignmentRequest extends js.Object {
    var AssignmentId: EntityId
  }

  @js.native
  @Factory
  trait GetAssignmentResponse extends js.Object {
    var Assignment: js.UndefOr[Assignment]
    var HIT: js.UndefOr[HIT]
  }

  @js.native
  @Factory
  trait GetFileUploadURLRequest extends js.Object {
    var AssignmentId: EntityId
    var QuestionIdentifier: String
  }

  @js.native
  @Factory
  trait GetFileUploadURLResponse extends js.Object {
    var FileUploadURL: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetHITRequest extends js.Object {
    var HITId: EntityId
  }

  @js.native
  @Factory
  trait GetHITResponse extends js.Object {
    var HIT: js.UndefOr[HIT]
  }

  @js.native
  @Factory
  trait GetQualificationScoreRequest extends js.Object {
    var QualificationTypeId: EntityId
    var WorkerId: CustomerId
  }

  @js.native
  @Factory
  trait GetQualificationScoreResponse extends js.Object {
    var Qualification: js.UndefOr[Qualification]
  }

  @js.native
  @Factory
  trait GetQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
  }

  @js.native
  @Factory
  trait GetQualificationTypeResponse extends js.Object {
    var QualificationType: js.UndefOr[QualificationType]
  }

  /**
    * The HIT data structure represents a single HIT, including all the information necessary for a Worker to accept and complete the HIT.
    */
  @js.native
  @Factory
  trait HIT extends js.Object {
    var AssignmentDurationInSeconds: js.UndefOr[Double]
    var AutoApprovalDelayInSeconds: js.UndefOr[Double]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var Expiration: js.UndefOr[Timestamp]
    var HITGroupId: js.UndefOr[EntityId]
    var HITId: js.UndefOr[EntityId]
    var HITLayoutId: js.UndefOr[EntityId]
    var HITReviewStatus: js.UndefOr[HITReviewStatus]
    var HITStatus: js.UndefOr[HITStatus]
    var HITTypeId: js.UndefOr[EntityId]
    var Keywords: js.UndefOr[String]
    var MaxAssignments: js.UndefOr[Int]
    var NumberOfAssignmentsAvailable: js.UndefOr[Int]
    var NumberOfAssignmentsCompleted: js.UndefOr[Int]
    var NumberOfAssignmentsPending: js.UndefOr[Int]
    var QualificationRequirements: js.UndefOr[QualificationRequirementList]
    var Question: js.UndefOr[String]
    var RequesterAnnotation: js.UndefOr[String]
    var Reward: js.UndefOr[CurrencyAmount]
    var Title: js.UndefOr[String]
  }

  @js.native
  sealed trait HITAccessActions extends js.Any
  object HITAccessActions extends js.Object {
    val Accept                   = "Accept".asInstanceOf[HITAccessActions]
    val PreviewAndAccept         = "PreviewAndAccept".asInstanceOf[HITAccessActions]
    val DiscoverPreviewAndAccept = "DiscoverPreviewAndAccept".asInstanceOf[HITAccessActions]

    val values = js.Object.freeze(js.Array(Accept, PreviewAndAccept, DiscoverPreviewAndAccept))
  }

  /**
    * The HITLayoutParameter data structure defines parameter values used with a HITLayout. A HITLayout is a reusable Amazon Mechanical Turk project template used to provide Human Intelligence Task (HIT) question data for CreateHIT.
    */
  @js.native
  @Factory
  trait HITLayoutParameter extends js.Object {
    var Name: String
    var Value: String
  }

  @js.native
  sealed trait HITReviewStatus extends js.Any
  object HITReviewStatus extends js.Object {
    val NotReviewed           = "NotReviewed".asInstanceOf[HITReviewStatus]
    val MarkedForReview       = "MarkedForReview".asInstanceOf[HITReviewStatus]
    val ReviewedAppropriate   = "ReviewedAppropriate".asInstanceOf[HITReviewStatus]
    val ReviewedInappropriate = "ReviewedInappropriate".asInstanceOf[HITReviewStatus]

    val values = js.Object.freeze(js.Array(NotReviewed, MarkedForReview, ReviewedAppropriate, ReviewedInappropriate))
  }

  @js.native
  sealed trait HITStatus extends js.Any
  object HITStatus extends js.Object {
    val Assignable   = "Assignable".asInstanceOf[HITStatus]
    val Unassignable = "Unassignable".asInstanceOf[HITStatus]
    val Reviewable   = "Reviewable".asInstanceOf[HITStatus]
    val Reviewing    = "Reviewing".asInstanceOf[HITStatus]
    val Disposed     = "Disposed".asInstanceOf[HITStatus]

    val values = js.Object.freeze(js.Array(Assignable, Unassignable, Reviewable, Reviewing, Disposed))
  }

  @js.native
  @Factory
  trait ListAssignmentsForHITRequest extends js.Object {
    var HITId: EntityId
    var AssignmentStatuses: js.UndefOr[AssignmentStatusList]
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListAssignmentsForHITResponse extends js.Object {
    var Assignments: js.UndefOr[AssignmentList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ListBonusPaymentsRequest extends js.Object {
    var AssignmentId: js.UndefOr[EntityId]
    var HITId: js.UndefOr[EntityId]
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListBonusPaymentsResponse extends js.Object {
    var BonusPayments: js.UndefOr[BonusPaymentList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ListHITsForQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListHITsForQualificationTypeResponse extends js.Object {
    var HITs: js.UndefOr[HITList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ListHITsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListHITsResponse extends js.Object {
    var HITs: js.UndefOr[HITList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ListQualificationRequestsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var QualificationTypeId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait ListQualificationRequestsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var QualificationRequests: js.UndefOr[QualificationRequestList]
  }

  @js.native
  @Factory
  trait ListQualificationTypesRequest extends js.Object {
    var MustBeRequestable: Boolean
    var MaxResults: js.UndefOr[ResultSize]
    var MustBeOwnedByCaller: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[PaginationToken]
    var Query: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListQualificationTypesResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var QualificationTypes: js.UndefOr[QualificationTypeList]
  }

  @js.native
  @Factory
  trait ListReviewPolicyResultsForHITRequest extends js.Object {
    var HITId: EntityId
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var PolicyLevels: js.UndefOr[ReviewPolicyLevelList]
    var RetrieveActions: js.UndefOr[Boolean]
    var RetrieveResults: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ListReviewPolicyResultsForHITResponse extends js.Object {
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy]
    var AssignmentReviewReport: js.UndefOr[ReviewReport]
    var HITId: js.UndefOr[EntityId]
    var HITReviewPolicy: js.UndefOr[ReviewPolicy]
    var HITReviewReport: js.UndefOr[ReviewReport]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListReviewableHITsRequest extends js.Object {
    var HITTypeId: js.UndefOr[EntityId]
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[ReviewableHITStatus]
  }

  @js.native
  @Factory
  trait ListReviewableHITsResponse extends js.Object {
    var HITs: js.UndefOr[HITList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ListWorkerBlocksRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListWorkerBlocksResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var WorkerBlocks: js.UndefOr[WorkerBlockList]
  }

  @js.native
  @Factory
  trait ListWorkersWithQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[QualificationStatus]
  }

  @js.native
  @Factory
  trait ListWorkersWithQualificationTypeResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var Qualifications: js.UndefOr[QualificationList]
  }

  /**
    * The Locale data structure represents a geographical region or location.
    */
  @js.native
  @Factory
  trait Locale extends js.Object {
    var Country: CountryParameters
    var Subdivision: js.UndefOr[CountryParameters]
  }

  /**
    * The NotificationSpecification data structure describes a HIT event notification for a HIT type.
    */
  @js.native
  @Factory
  trait NotificationSpecification extends js.Object {
    var Destination: String
    var EventTypes: EventTypeList
    var Transport: NotificationTransport
    var Version: String
  }

  @js.native
  sealed trait NotificationTransport extends js.Any
  object NotificationTransport extends js.Object {
    val Email = "Email".asInstanceOf[NotificationTransport]
    val SQS   = "SQS".asInstanceOf[NotificationTransport]
    val SNS   = "SNS".asInstanceOf[NotificationTransport]

    val values = js.Object.freeze(js.Array(Email, SQS, SNS))
  }

  @js.native
  sealed trait NotifyWorkersFailureCode extends js.Any
  object NotifyWorkersFailureCode extends js.Object {
    val SoftFailure = "SoftFailure".asInstanceOf[NotifyWorkersFailureCode]
    val HardFailure = "HardFailure".asInstanceOf[NotifyWorkersFailureCode]

    val values = js.Object.freeze(js.Array(SoftFailure, HardFailure))
  }

  /**
    * When MTurk encounters an issue with notifying the Workers you specified, it returns back this object with failure details.
    */
  @js.native
  @Factory
  trait NotifyWorkersFailureStatus extends js.Object {
    var NotifyWorkersFailureCode: js.UndefOr[NotifyWorkersFailureCode]
    var NotifyWorkersFailureMessage: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }

  @js.native
  @Factory
  trait NotifyWorkersRequest extends js.Object {
    var MessageText: String
    var Subject: String
    var WorkerIds: CustomerIdList
  }

  @js.native
  @Factory
  trait NotifyWorkersResponse extends js.Object {
    var NotifyWorkersFailureStatuses: js.UndefOr[NotifyWorkersFailureStatusList]
  }

  /**
    * This data structure is the data type for the AnswerKey parameter of the ScoreMyKnownAnswers/2011-09-01 Review Policy.
    */
  @js.native
  @Factory
  trait ParameterMapEntry extends js.Object {
    var Key: js.UndefOr[String]
    var Values: js.UndefOr[StringList]
  }

  /**
    * Name of the parameter from the Review policy.
    */
  @js.native
  @Factory
  trait PolicyParameter extends js.Object {
    var Key: js.UndefOr[String]
    var MapEntries: js.UndefOr[ParameterMapEntryList]
    var Values: js.UndefOr[StringList]
  }

  /**
    * The Qualification data structure represents a Qualification assigned to a user, including the Qualification type and the value (score).
    */
  @js.native
  @Factory
  trait Qualification extends js.Object {
    var GrantTime: js.UndefOr[Timestamp]
    var IntegerValue: js.UndefOr[Int]
    var LocaleValue: js.UndefOr[Locale]
    var QualificationTypeId: js.UndefOr[EntityId]
    var Status: js.UndefOr[QualificationStatus]
    var WorkerId: js.UndefOr[CustomerId]
  }

  /**
    * The QualificationRequest data structure represents a request a Worker has made for a Qualification.
    */
  @js.native
  @Factory
  trait QualificationRequest extends js.Object {
    var Answer: js.UndefOr[String]
    var QualificationRequestId: js.UndefOr[String]
    var QualificationTypeId: js.UndefOr[EntityId]
    var SubmitTime: js.UndefOr[Timestamp]
    var Test: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }

  /**
    * The QualificationRequirement data structure describes a Qualification that a Worker must have before the Worker is allowed to accept a HIT. A requirement may optionally state that a Worker must have the Qualification in order to preview the HIT, or see the HIT in search results.
    */
  @js.native
  @Factory
  trait QualificationRequirement extends js.Object {
    var Comparator: Comparator
    var QualificationTypeId: String
    var ActionsGuarded: js.UndefOr[HITAccessActions]
    var IntegerValues: js.UndefOr[IntegerList]
    var LocaleValues: js.UndefOr[LocaleList]
    var RequiredToPreview: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait QualificationStatus extends js.Any
  object QualificationStatus extends js.Object {
    val Granted = "Granted".asInstanceOf[QualificationStatus]
    val Revoked = "Revoked".asInstanceOf[QualificationStatus]

    val values = js.Object.freeze(js.Array(Granted, Revoked))
  }

  /**
    * The QualificationType data structure represents a Qualification type, a description of a property of a Worker that must match the requirements of a HIT for the Worker to be able to accept the HIT. The type also describes how a Worker can obtain a Qualification of that type, such as through a Qualification test.
    */
  @js.native
  @Factory
  trait QualificationType extends js.Object {
    var AnswerKey: js.UndefOr[String]
    var AutoGranted: js.UndefOr[Boolean]
    var AutoGrantedValue: js.UndefOr[Int]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var IsRequestable: js.UndefOr[Boolean]
    var Keywords: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var QualificationTypeId: js.UndefOr[EntityId]
    var QualificationTypeStatus: js.UndefOr[QualificationTypeStatus]
    var RetryDelayInSeconds: js.UndefOr[Double]
    var Test: js.UndefOr[String]
    var TestDurationInSeconds: js.UndefOr[Double]
  }

  @js.native
  sealed trait QualificationTypeStatus extends js.Any
  object QualificationTypeStatus extends js.Object {
    val Active   = "Active".asInstanceOf[QualificationTypeStatus]
    val Inactive = "Inactive".asInstanceOf[QualificationTypeStatus]

    val values = js.Object.freeze(js.Array(Active, Inactive))
  }

  @js.native
  @Factory
  trait RejectAssignmentRequest extends js.Object {
    var AssignmentId: EntityId
    var RequesterFeedback: String
  }

  @js.native
  @Factory
  trait RejectAssignmentResponse extends js.Object {}

  @js.native
  @Factory
  trait RejectQualificationRequestRequest extends js.Object {
    var QualificationRequestId: String
    var Reason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RejectQualificationRequestResponse extends js.Object {}

  /**
    * Your request is invalid.
    */
  @js.native
  trait RequestErrorException extends js.Object {
    val Message: ExceptionMessage
    val TurkErrorCode: TurkErrorCode
  }

  /**
    * Both the AssignmentReviewReport and the HITReviewReport elements contains the ReviewActionDetail data structure. This structure is returned multiple times for each action specified in the Review Policy.
    */
  @js.native
  @Factory
  trait ReviewActionDetail extends js.Object {
    var ActionId: js.UndefOr[EntityId]
    var ActionName: js.UndefOr[String]
    var CompleteTime: js.UndefOr[Timestamp]
    var ErrorCode: js.UndefOr[String]
    var Result: js.UndefOr[String]
    var Status: js.UndefOr[ReviewActionStatus]
    var TargetId: js.UndefOr[EntityId]
    var TargetType: js.UndefOr[String]
  }

  @js.native
  sealed trait ReviewActionStatus extends js.Any
  object ReviewActionStatus extends js.Object {
    val Intended  = "Intended".asInstanceOf[ReviewActionStatus]
    val Succeeded = "Succeeded".asInstanceOf[ReviewActionStatus]
    val Failed    = "Failed".asInstanceOf[ReviewActionStatus]
    val Cancelled = "Cancelled".asInstanceOf[ReviewActionStatus]

    val values = js.Object.freeze(js.Array(Intended, Succeeded, Failed, Cancelled))
  }

  /**
    * HIT Review Policy data structures represent HIT review policies, which you specify when you create a HIT.
    */
  @js.native
  @Factory
  trait ReviewPolicy extends js.Object {
    var PolicyName: String
    var Parameters: js.UndefOr[PolicyParameterList]
  }

  @js.native
  sealed trait ReviewPolicyLevel extends js.Any
  object ReviewPolicyLevel extends js.Object {
    val Assignment = "Assignment".asInstanceOf[ReviewPolicyLevel]
    val HIT        = "HIT".asInstanceOf[ReviewPolicyLevel]

    val values = js.Object.freeze(js.Array(Assignment, HIT))
  }

  /**
    * Contains both ReviewResult and ReviewAction elements for a particular HIT.
    */
  @js.native
  @Factory
  trait ReviewReport extends js.Object {
    var ReviewActions: js.UndefOr[ReviewActionDetailList]
    var ReviewResults: js.UndefOr[ReviewResultDetailList]
  }

  /**
    * This data structure is returned multiple times for each result specified in the Review Policy.
    */
  @js.native
  @Factory
  trait ReviewResultDetail extends js.Object {
    var ActionId: js.UndefOr[EntityId]
    var Key: js.UndefOr[String]
    var QuestionId: js.UndefOr[EntityId]
    var SubjectId: js.UndefOr[EntityId]
    var SubjectType: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  @js.native
  sealed trait ReviewableHITStatus extends js.Any
  object ReviewableHITStatus extends js.Object {
    val Reviewable = "Reviewable".asInstanceOf[ReviewableHITStatus]
    val Reviewing  = "Reviewing".asInstanceOf[ReviewableHITStatus]

    val values = js.Object.freeze(js.Array(Reviewable, Reviewing))
  }

  @js.native
  @Factory
  trait SendBonusRequest extends js.Object {
    var AssignmentId: EntityId
    var BonusAmount: CurrencyAmount
    var Reason: String
    var WorkerId: CustomerId
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
  }

  @js.native
  @Factory
  trait SendBonusResponse extends js.Object {}

  @js.native
  @Factory
  trait SendTestEventNotificationRequest extends js.Object {
    var Notification: NotificationSpecification
    var TestEventType: EventType
  }

  @js.native
  @Factory
  trait SendTestEventNotificationResponse extends js.Object {}

  /**
    * Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
    */
  @js.native
  trait ServiceFaultException extends js.Object {
    val Message: ExceptionMessage
    val TurkErrorCode: TurkErrorCode
  }

  @js.native
  @Factory
  trait UpdateExpirationForHITRequest extends js.Object {
    var ExpireAt: Timestamp
    var HITId: EntityId
  }

  @js.native
  @Factory
  trait UpdateExpirationForHITResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateHITReviewStatusRequest extends js.Object {
    var HITId: EntityId
    var Revert: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpdateHITReviewStatusResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateHITTypeOfHITRequest extends js.Object {
    var HITId: EntityId
    var HITTypeId: EntityId
  }

  @js.native
  @Factory
  trait UpdateHITTypeOfHITResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateNotificationSettingsRequest extends js.Object {
    var HITTypeId: EntityId
    var Active: js.UndefOr[Boolean]
    var Notification: js.UndefOr[NotificationSpecification]
  }

  @js.native
  @Factory
  trait UpdateNotificationSettingsResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
    var AnswerKey: js.UndefOr[String]
    var AutoGranted: js.UndefOr[Boolean]
    var AutoGrantedValue: js.UndefOr[Int]
    var Description: js.UndefOr[String]
    var QualificationTypeStatus: js.UndefOr[QualificationTypeStatus]
    var RetryDelayInSeconds: js.UndefOr[Double]
    var Test: js.UndefOr[String]
    var TestDurationInSeconds: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait UpdateQualificationTypeResponse extends js.Object {
    var QualificationType: js.UndefOr[QualificationType]
  }

  /**
    * The WorkerBlock data structure represents a Worker who has been blocked. It has two elements: the WorkerId and the Reason for the block.
    */
  @js.native
  @Factory
  trait WorkerBlock extends js.Object {
    var Reason: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }
}
