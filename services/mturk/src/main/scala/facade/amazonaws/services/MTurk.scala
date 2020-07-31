package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object mturk {
  type AssignmentList = js.Array[Assignment]
  type AssignmentStatusList = js.Array[AssignmentStatus]
  type BonusPaymentList = js.Array[BonusPayment]
  type CountryParameters = String
  type CurrencyAmount = String
  type CustomerId = String
  type CustomerIdList = js.Array[CustomerId]
  type EntityId = String
  type EventTypeList = js.Array[EventType]
  type ExceptionMessage = String
  type HITLayoutParameterList = js.Array[HITLayoutParameter]
  type HITList = js.Array[HIT]
  type IdempotencyToken = String
  type IntegerList = js.Array[Int]
  type LocaleList = js.Array[Locale]
  type NotifyWorkersFailureStatusList = js.Array[NotifyWorkersFailureStatus]
  type PaginationToken = String
  type ParameterMapEntryList = js.Array[ParameterMapEntry]
  type PolicyParameterList = js.Array[PolicyParameter]
  type QualificationList = js.Array[Qualification]
  type QualificationRequestList = js.Array[QualificationRequest]
  type QualificationRequirementList = js.Array[QualificationRequirement]
  type QualificationTypeList = js.Array[QualificationType]
  type ResultSize = Int
  type ReviewActionDetailList = js.Array[ReviewActionDetail]
  type ReviewPolicyLevelList = js.Array[ReviewPolicyLevel]
  type ReviewResultDetailList = js.Array[ReviewResultDetail]
  type StringList = js.Array[String]
  type Timestamp = js.Date
  type TurkErrorCode = String
  type WorkerBlockList = js.Array[WorkerBlock]

  implicit final class MTurkOps(private val service: MTurk) extends AnyVal {

    @inline def acceptQualificationRequestFuture(params: AcceptQualificationRequestRequest): Future[AcceptQualificationRequestResponse] = service.acceptQualificationRequest(params).promise().toFuture
    @inline def approveAssignmentFuture(params: ApproveAssignmentRequest): Future[ApproveAssignmentResponse] = service.approveAssignment(params).promise().toFuture
    @inline def associateQualificationWithWorkerFuture(params: AssociateQualificationWithWorkerRequest): Future[AssociateQualificationWithWorkerResponse] = service.associateQualificationWithWorker(params).promise().toFuture
    @inline def createAdditionalAssignmentsForHITFuture(params: CreateAdditionalAssignmentsForHITRequest): Future[CreateAdditionalAssignmentsForHITResponse] = service.createAdditionalAssignmentsForHIT(params).promise().toFuture
    @inline def createHITFuture(params: CreateHITRequest): Future[CreateHITResponse] = service.createHIT(params).promise().toFuture
    @inline def createHITTypeFuture(params: CreateHITTypeRequest): Future[CreateHITTypeResponse] = service.createHITType(params).promise().toFuture
    @inline def createHITWithHITTypeFuture(params: CreateHITWithHITTypeRequest): Future[CreateHITWithHITTypeResponse] = service.createHITWithHITType(params).promise().toFuture
    @inline def createQualificationTypeFuture(params: CreateQualificationTypeRequest): Future[CreateQualificationTypeResponse] = service.createQualificationType(params).promise().toFuture
    @inline def createWorkerBlockFuture(params: CreateWorkerBlockRequest): Future[CreateWorkerBlockResponse] = service.createWorkerBlock(params).promise().toFuture
    @inline def deleteHITFuture(params: DeleteHITRequest): Future[DeleteHITResponse] = service.deleteHIT(params).promise().toFuture
    @inline def deleteQualificationTypeFuture(params: DeleteQualificationTypeRequest): Future[DeleteQualificationTypeResponse] = service.deleteQualificationType(params).promise().toFuture
    @inline def deleteWorkerBlockFuture(params: DeleteWorkerBlockRequest): Future[DeleteWorkerBlockResponse] = service.deleteWorkerBlock(params).promise().toFuture
    @inline def disassociateQualificationFromWorkerFuture(params: DisassociateQualificationFromWorkerRequest): Future[DisassociateQualificationFromWorkerResponse] = service.disassociateQualificationFromWorker(params).promise().toFuture
    @inline def getAccountBalanceFuture(params: GetAccountBalanceRequest): Future[GetAccountBalanceResponse] = service.getAccountBalance(params).promise().toFuture
    @inline def getAssignmentFuture(params: GetAssignmentRequest): Future[GetAssignmentResponse] = service.getAssignment(params).promise().toFuture
    @inline def getFileUploadURLFuture(params: GetFileUploadURLRequest): Future[GetFileUploadURLResponse] = service.getFileUploadURL(params).promise().toFuture
    @inline def getHITFuture(params: GetHITRequest): Future[GetHITResponse] = service.getHIT(params).promise().toFuture
    @inline def getQualificationScoreFuture(params: GetQualificationScoreRequest): Future[GetQualificationScoreResponse] = service.getQualificationScore(params).promise().toFuture
    @inline def getQualificationTypeFuture(params: GetQualificationTypeRequest): Future[GetQualificationTypeResponse] = service.getQualificationType(params).promise().toFuture
    @inline def listAssignmentsForHITFuture(params: ListAssignmentsForHITRequest): Future[ListAssignmentsForHITResponse] = service.listAssignmentsForHIT(params).promise().toFuture
    @inline def listBonusPaymentsFuture(params: ListBonusPaymentsRequest): Future[ListBonusPaymentsResponse] = service.listBonusPayments(params).promise().toFuture
    @inline def listHITsForQualificationTypeFuture(params: ListHITsForQualificationTypeRequest): Future[ListHITsForQualificationTypeResponse] = service.listHITsForQualificationType(params).promise().toFuture
    @inline def listHITsFuture(params: ListHITsRequest): Future[ListHITsResponse] = service.listHITs(params).promise().toFuture
    @inline def listQualificationRequestsFuture(params: ListQualificationRequestsRequest): Future[ListQualificationRequestsResponse] = service.listQualificationRequests(params).promise().toFuture
    @inline def listQualificationTypesFuture(params: ListQualificationTypesRequest): Future[ListQualificationTypesResponse] = service.listQualificationTypes(params).promise().toFuture
    @inline def listReviewPolicyResultsForHITFuture(params: ListReviewPolicyResultsForHITRequest): Future[ListReviewPolicyResultsForHITResponse] = service.listReviewPolicyResultsForHIT(params).promise().toFuture
    @inline def listReviewableHITsFuture(params: ListReviewableHITsRequest): Future[ListReviewableHITsResponse] = service.listReviewableHITs(params).promise().toFuture
    @inline def listWorkerBlocksFuture(params: ListWorkerBlocksRequest): Future[ListWorkerBlocksResponse] = service.listWorkerBlocks(params).promise().toFuture
    @inline def listWorkersWithQualificationTypeFuture(params: ListWorkersWithQualificationTypeRequest): Future[ListWorkersWithQualificationTypeResponse] = service.listWorkersWithQualificationType(params).promise().toFuture
    @inline def notifyWorkersFuture(params: NotifyWorkersRequest): Future[NotifyWorkersResponse] = service.notifyWorkers(params).promise().toFuture
    @inline def rejectAssignmentFuture(params: RejectAssignmentRequest): Future[RejectAssignmentResponse] = service.rejectAssignment(params).promise().toFuture
    @inline def rejectQualificationRequestFuture(params: RejectQualificationRequestRequest): Future[RejectQualificationRequestResponse] = service.rejectQualificationRequest(params).promise().toFuture
    @inline def sendBonusFuture(params: SendBonusRequest): Future[SendBonusResponse] = service.sendBonus(params).promise().toFuture
    @inline def sendTestEventNotificationFuture(params: SendTestEventNotificationRequest): Future[SendTestEventNotificationResponse] = service.sendTestEventNotification(params).promise().toFuture
    @inline def updateExpirationForHITFuture(params: UpdateExpirationForHITRequest): Future[UpdateExpirationForHITResponse] = service.updateExpirationForHIT(params).promise().toFuture
    @inline def updateHITReviewStatusFuture(params: UpdateHITReviewStatusRequest): Future[UpdateHITReviewStatusResponse] = service.updateHITReviewStatus(params).promise().toFuture
    @inline def updateHITTypeOfHITFuture(params: UpdateHITTypeOfHITRequest): Future[UpdateHITTypeOfHITResponse] = service.updateHITTypeOfHIT(params).promise().toFuture
    @inline def updateNotificationSettingsFuture(params: UpdateNotificationSettingsRequest): Future[UpdateNotificationSettingsResponse] = service.updateNotificationSettings(params).promise().toFuture
    @inline def updateQualificationTypeFuture(params: UpdateQualificationTypeRequest): Future[UpdateQualificationTypeResponse] = service.updateQualificationType(params).promise().toFuture
  }
}

package mturk {
  @js.native
  @JSImport("aws-sdk", "MTurk", "AWS.MTurk")
  class MTurk() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptQualificationRequest(params: AcceptQualificationRequestRequest): Request[AcceptQualificationRequestResponse] = js.native
    def approveAssignment(params: ApproveAssignmentRequest): Request[ApproveAssignmentResponse] = js.native
    def associateQualificationWithWorker(params: AssociateQualificationWithWorkerRequest): Request[AssociateQualificationWithWorkerResponse] = js.native
    def createAdditionalAssignmentsForHIT(params: CreateAdditionalAssignmentsForHITRequest): Request[CreateAdditionalAssignmentsForHITResponse] = js.native
    def createHIT(params: CreateHITRequest): Request[CreateHITResponse] = js.native
    def createHITType(params: CreateHITTypeRequest): Request[CreateHITTypeResponse] = js.native
    def createHITWithHITType(params: CreateHITWithHITTypeRequest): Request[CreateHITWithHITTypeResponse] = js.native
    def createQualificationType(params: CreateQualificationTypeRequest): Request[CreateQualificationTypeResponse] = js.native
    def createWorkerBlock(params: CreateWorkerBlockRequest): Request[CreateWorkerBlockResponse] = js.native
    def deleteHIT(params: DeleteHITRequest): Request[DeleteHITResponse] = js.native
    def deleteQualificationType(params: DeleteQualificationTypeRequest): Request[DeleteQualificationTypeResponse] = js.native
    def deleteWorkerBlock(params: DeleteWorkerBlockRequest): Request[DeleteWorkerBlockResponse] = js.native
    def disassociateQualificationFromWorker(params: DisassociateQualificationFromWorkerRequest): Request[DisassociateQualificationFromWorkerResponse] = js.native
    def getAccountBalance(params: GetAccountBalanceRequest): Request[GetAccountBalanceResponse] = js.native
    def getAssignment(params: GetAssignmentRequest): Request[GetAssignmentResponse] = js.native
    def getFileUploadURL(params: GetFileUploadURLRequest): Request[GetFileUploadURLResponse] = js.native
    def getHIT(params: GetHITRequest): Request[GetHITResponse] = js.native
    def getQualificationScore(params: GetQualificationScoreRequest): Request[GetQualificationScoreResponse] = js.native
    def getQualificationType(params: GetQualificationTypeRequest): Request[GetQualificationTypeResponse] = js.native
    def listAssignmentsForHIT(params: ListAssignmentsForHITRequest): Request[ListAssignmentsForHITResponse] = js.native
    def listBonusPayments(params: ListBonusPaymentsRequest): Request[ListBonusPaymentsResponse] = js.native
    def listHITs(params: ListHITsRequest): Request[ListHITsResponse] = js.native
    def listHITsForQualificationType(params: ListHITsForQualificationTypeRequest): Request[ListHITsForQualificationTypeResponse] = js.native
    def listQualificationRequests(params: ListQualificationRequestsRequest): Request[ListQualificationRequestsResponse] = js.native
    def listQualificationTypes(params: ListQualificationTypesRequest): Request[ListQualificationTypesResponse] = js.native
    def listReviewPolicyResultsForHIT(params: ListReviewPolicyResultsForHITRequest): Request[ListReviewPolicyResultsForHITResponse] = js.native
    def listReviewableHITs(params: ListReviewableHITsRequest): Request[ListReviewableHITsResponse] = js.native
    def listWorkerBlocks(params: ListWorkerBlocksRequest): Request[ListWorkerBlocksResponse] = js.native
    def listWorkersWithQualificationType(params: ListWorkersWithQualificationTypeRequest): Request[ListWorkersWithQualificationTypeResponse] = js.native
    def notifyWorkers(params: NotifyWorkersRequest): Request[NotifyWorkersResponse] = js.native
    def rejectAssignment(params: RejectAssignmentRequest): Request[RejectAssignmentResponse] = js.native
    def rejectQualificationRequest(params: RejectQualificationRequestRequest): Request[RejectQualificationRequestResponse] = js.native
    def sendBonus(params: SendBonusRequest): Request[SendBonusResponse] = js.native
    def sendTestEventNotification(params: SendTestEventNotificationRequest): Request[SendTestEventNotificationResponse] = js.native
    def updateExpirationForHIT(params: UpdateExpirationForHITRequest): Request[UpdateExpirationForHITResponse] = js.native
    def updateHITReviewStatus(params: UpdateHITReviewStatusRequest): Request[UpdateHITReviewStatusResponse] = js.native
    def updateHITTypeOfHIT(params: UpdateHITTypeOfHITRequest): Request[UpdateHITTypeOfHITResponse] = js.native
    def updateNotificationSettings(params: UpdateNotificationSettingsRequest): Request[UpdateNotificationSettingsResponse] = js.native
    def updateQualificationType(params: UpdateQualificationTypeRequest): Request[UpdateQualificationTypeResponse] = js.native
  }

  @js.native
  trait AcceptQualificationRequestRequest extends js.Object {
    var QualificationRequestId: String
    var IntegerValue: js.UndefOr[Int]
  }

  object AcceptQualificationRequestRequest {
    @inline
    def apply(
        QualificationRequestId: String,
        IntegerValue: js.UndefOr[Int] = js.undefined
    ): AcceptQualificationRequestRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationRequestId" -> QualificationRequestId.asInstanceOf[js.Any]
      )

      IntegerValue.foreach(__v => __obj.updateDynamic("IntegerValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptQualificationRequestRequest]
    }
  }

  @js.native
  trait AcceptQualificationRequestResponse extends js.Object {}

  object AcceptQualificationRequestResponse {
    @inline
    def apply(
    ): AcceptQualificationRequestResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AcceptQualificationRequestResponse]
    }
  }

  @js.native
  trait ApproveAssignmentRequest extends js.Object {
    var AssignmentId: EntityId
    var OverrideRejection: js.UndefOr[Boolean]
    var RequesterFeedback: js.UndefOr[String]
  }

  object ApproveAssignmentRequest {
    @inline
    def apply(
        AssignmentId: EntityId,
        OverrideRejection: js.UndefOr[Boolean] = js.undefined,
        RequesterFeedback: js.UndefOr[String] = js.undefined
    ): ApproveAssignmentRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any]
      )

      OverrideRejection.foreach(__v => __obj.updateDynamic("OverrideRejection")(__v.asInstanceOf[js.Any]))
      RequesterFeedback.foreach(__v => __obj.updateDynamic("RequesterFeedback")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApproveAssignmentRequest]
    }
  }

  @js.native
  trait ApproveAssignmentResponse extends js.Object {}

  object ApproveAssignmentResponse {
    @inline
    def apply(
    ): ApproveAssignmentResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ApproveAssignmentResponse]
    }
  }

  /**
    * The Assignment data structure represents a single assignment of a HIT to a Worker. The assignment tracks the Worker's efforts to complete the HIT, and contains the results for later retrieval.
    */
  @js.native
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

  object Assignment {
    @inline
    def apply(
        AcceptTime: js.UndefOr[Timestamp] = js.undefined,
        Answer: js.UndefOr[String] = js.undefined,
        ApprovalTime: js.UndefOr[Timestamp] = js.undefined,
        AssignmentId: js.UndefOr[EntityId] = js.undefined,
        AssignmentStatus: js.UndefOr[AssignmentStatus] = js.undefined,
        AutoApprovalTime: js.UndefOr[Timestamp] = js.undefined,
        Deadline: js.UndefOr[Timestamp] = js.undefined,
        HITId: js.UndefOr[EntityId] = js.undefined,
        RejectionTime: js.UndefOr[Timestamp] = js.undefined,
        RequesterFeedback: js.UndefOr[String] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        WorkerId: js.UndefOr[CustomerId] = js.undefined
    ): Assignment = {
      val __obj = js.Dynamic.literal()
      AcceptTime.foreach(__v => __obj.updateDynamic("AcceptTime")(__v.asInstanceOf[js.Any]))
      Answer.foreach(__v => __obj.updateDynamic("Answer")(__v.asInstanceOf[js.Any]))
      ApprovalTime.foreach(__v => __obj.updateDynamic("ApprovalTime")(__v.asInstanceOf[js.Any]))
      AssignmentId.foreach(__v => __obj.updateDynamic("AssignmentId")(__v.asInstanceOf[js.Any]))
      AssignmentStatus.foreach(__v => __obj.updateDynamic("AssignmentStatus")(__v.asInstanceOf[js.Any]))
      AutoApprovalTime.foreach(__v => __obj.updateDynamic("AutoApprovalTime")(__v.asInstanceOf[js.Any]))
      Deadline.foreach(__v => __obj.updateDynamic("Deadline")(__v.asInstanceOf[js.Any]))
      HITId.foreach(__v => __obj.updateDynamic("HITId")(__v.asInstanceOf[js.Any]))
      RejectionTime.foreach(__v => __obj.updateDynamic("RejectionTime")(__v.asInstanceOf[js.Any]))
      RequesterFeedback.foreach(__v => __obj.updateDynamic("RequesterFeedback")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      WorkerId.foreach(__v => __obj.updateDynamic("WorkerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Assignment]
    }
  }

  @js.native
  sealed trait AssignmentStatus extends js.Any
  object AssignmentStatus {
    @inline def Submitted = "Submitted".asInstanceOf[AssignmentStatus]
    @inline def Approved = "Approved".asInstanceOf[AssignmentStatus]
    @inline def Rejected = "Rejected".asInstanceOf[AssignmentStatus]

    @inline def values = js.Object.freeze(js.Array(Submitted, Approved, Rejected))
  }

  @js.native
  trait AssociateQualificationWithWorkerRequest extends js.Object {
    var QualificationTypeId: EntityId
    var WorkerId: CustomerId
    var IntegerValue: js.UndefOr[Int]
    var SendNotification: js.UndefOr[Boolean]
  }

  object AssociateQualificationWithWorkerRequest {
    @inline
    def apply(
        QualificationTypeId: EntityId,
        WorkerId: CustomerId,
        IntegerValue: js.UndefOr[Int] = js.undefined,
        SendNotification: js.UndefOr[Boolean] = js.undefined
    ): AssociateQualificationWithWorkerRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any]
      )

      IntegerValue.foreach(__v => __obj.updateDynamic("IntegerValue")(__v.asInstanceOf[js.Any]))
      SendNotification.foreach(__v => __obj.updateDynamic("SendNotification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateQualificationWithWorkerRequest]
    }
  }

  @js.native
  trait AssociateQualificationWithWorkerResponse extends js.Object {}

  object AssociateQualificationWithWorkerResponse {
    @inline
    def apply(
    ): AssociateQualificationWithWorkerResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateQualificationWithWorkerResponse]
    }
  }

  /**
    * An object representing a Bonus payment paid to a Worker.
    */
  @js.native
  trait BonusPayment extends js.Object {
    var AssignmentId: js.UndefOr[EntityId]
    var BonusAmount: js.UndefOr[CurrencyAmount]
    var GrantTime: js.UndefOr[Timestamp]
    var Reason: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }

  object BonusPayment {
    @inline
    def apply(
        AssignmentId: js.UndefOr[EntityId] = js.undefined,
        BonusAmount: js.UndefOr[CurrencyAmount] = js.undefined,
        GrantTime: js.UndefOr[Timestamp] = js.undefined,
        Reason: js.UndefOr[String] = js.undefined,
        WorkerId: js.UndefOr[CustomerId] = js.undefined
    ): BonusPayment = {
      val __obj = js.Dynamic.literal()
      AssignmentId.foreach(__v => __obj.updateDynamic("AssignmentId")(__v.asInstanceOf[js.Any]))
      BonusAmount.foreach(__v => __obj.updateDynamic("BonusAmount")(__v.asInstanceOf[js.Any]))
      GrantTime.foreach(__v => __obj.updateDynamic("GrantTime")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      WorkerId.foreach(__v => __obj.updateDynamic("WorkerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BonusPayment]
    }
  }

  @js.native
  sealed trait Comparator extends js.Any
  object Comparator {
    @inline def LessThan = "LessThan".asInstanceOf[Comparator]
    @inline def LessThanOrEqualTo = "LessThanOrEqualTo".asInstanceOf[Comparator]
    @inline def GreaterThan = "GreaterThan".asInstanceOf[Comparator]
    @inline def GreaterThanOrEqualTo = "GreaterThanOrEqualTo".asInstanceOf[Comparator]
    @inline def EqualTo = "EqualTo".asInstanceOf[Comparator]
    @inline def NotEqualTo = "NotEqualTo".asInstanceOf[Comparator]
    @inline def Exists = "Exists".asInstanceOf[Comparator]
    @inline def DoesNotExist = "DoesNotExist".asInstanceOf[Comparator]
    @inline def In = "In".asInstanceOf[Comparator]
    @inline def NotIn = "NotIn".asInstanceOf[Comparator]

    @inline def values = js.Object.freeze(js.Array(LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, NotEqualTo, Exists, DoesNotExist, In, NotIn))
  }

  @js.native
  trait CreateAdditionalAssignmentsForHITRequest extends js.Object {
    var HITId: EntityId
    var NumberOfAdditionalAssignments: Int
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
  }

  object CreateAdditionalAssignmentsForHITRequest {
    @inline
    def apply(
        HITId: EntityId,
        NumberOfAdditionalAssignments: Int,
        UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): CreateAdditionalAssignmentsForHITRequest = {
      val __obj = js.Dynamic.literal(
        "HITId" -> HITId.asInstanceOf[js.Any],
        "NumberOfAdditionalAssignments" -> NumberOfAdditionalAssignments.asInstanceOf[js.Any]
      )

      UniqueRequestToken.foreach(__v => __obj.updateDynamic("UniqueRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAdditionalAssignmentsForHITRequest]
    }
  }

  @js.native
  trait CreateAdditionalAssignmentsForHITResponse extends js.Object {}

  object CreateAdditionalAssignmentsForHITResponse {
    @inline
    def apply(
    ): CreateAdditionalAssignmentsForHITResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateAdditionalAssignmentsForHITResponse]
    }
  }

  @js.native
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

  object CreateHITRequest {
    @inline
    def apply(
        AssignmentDurationInSeconds: Double,
        Description: String,
        LifetimeInSeconds: Double,
        Reward: CurrencyAmount,
        Title: String,
        AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
        AutoApprovalDelayInSeconds: js.UndefOr[Double] = js.undefined,
        HITLayoutId: js.UndefOr[EntityId] = js.undefined,
        HITLayoutParameters: js.UndefOr[HITLayoutParameterList] = js.undefined,
        HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
        Keywords: js.UndefOr[String] = js.undefined,
        MaxAssignments: js.UndefOr[Int] = js.undefined,
        QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined,
        Question: js.UndefOr[String] = js.undefined,
        RequesterAnnotation: js.UndefOr[String] = js.undefined,
        UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): CreateHITRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentDurationInSeconds" -> AssignmentDurationInSeconds.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "LifetimeInSeconds" -> LifetimeInSeconds.asInstanceOf[js.Any],
        "Reward" -> Reward.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      AssignmentReviewPolicy.foreach(__v => __obj.updateDynamic("AssignmentReviewPolicy")(__v.asInstanceOf[js.Any]))
      AutoApprovalDelayInSeconds.foreach(__v => __obj.updateDynamic("AutoApprovalDelayInSeconds")(__v.asInstanceOf[js.Any]))
      HITLayoutId.foreach(__v => __obj.updateDynamic("HITLayoutId")(__v.asInstanceOf[js.Any]))
      HITLayoutParameters.foreach(__v => __obj.updateDynamic("HITLayoutParameters")(__v.asInstanceOf[js.Any]))
      HITReviewPolicy.foreach(__v => __obj.updateDynamic("HITReviewPolicy")(__v.asInstanceOf[js.Any]))
      Keywords.foreach(__v => __obj.updateDynamic("Keywords")(__v.asInstanceOf[js.Any]))
      MaxAssignments.foreach(__v => __obj.updateDynamic("MaxAssignments")(__v.asInstanceOf[js.Any]))
      QualificationRequirements.foreach(__v => __obj.updateDynamic("QualificationRequirements")(__v.asInstanceOf[js.Any]))
      Question.foreach(__v => __obj.updateDynamic("Question")(__v.asInstanceOf[js.Any]))
      RequesterAnnotation.foreach(__v => __obj.updateDynamic("RequesterAnnotation")(__v.asInstanceOf[js.Any]))
      UniqueRequestToken.foreach(__v => __obj.updateDynamic("UniqueRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHITRequest]
    }
  }

  @js.native
  trait CreateHITResponse extends js.Object {
    var HIT: js.UndefOr[HIT]
  }

  object CreateHITResponse {
    @inline
    def apply(
        HIT: js.UndefOr[HIT] = js.undefined
    ): CreateHITResponse = {
      val __obj = js.Dynamic.literal()
      HIT.foreach(__v => __obj.updateDynamic("HIT")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHITResponse]
    }
  }

  @js.native
  trait CreateHITTypeRequest extends js.Object {
    var AssignmentDurationInSeconds: Double
    var Description: String
    var Reward: CurrencyAmount
    var Title: String
    var AutoApprovalDelayInSeconds: js.UndefOr[Double]
    var Keywords: js.UndefOr[String]
    var QualificationRequirements: js.UndefOr[QualificationRequirementList]
  }

  object CreateHITTypeRequest {
    @inline
    def apply(
        AssignmentDurationInSeconds: Double,
        Description: String,
        Reward: CurrencyAmount,
        Title: String,
        AutoApprovalDelayInSeconds: js.UndefOr[Double] = js.undefined,
        Keywords: js.UndefOr[String] = js.undefined,
        QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined
    ): CreateHITTypeRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentDurationInSeconds" -> AssignmentDurationInSeconds.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Reward" -> Reward.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      AutoApprovalDelayInSeconds.foreach(__v => __obj.updateDynamic("AutoApprovalDelayInSeconds")(__v.asInstanceOf[js.Any]))
      Keywords.foreach(__v => __obj.updateDynamic("Keywords")(__v.asInstanceOf[js.Any]))
      QualificationRequirements.foreach(__v => __obj.updateDynamic("QualificationRequirements")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHITTypeRequest]
    }
  }

  @js.native
  trait CreateHITTypeResponse extends js.Object {
    var HITTypeId: js.UndefOr[EntityId]
  }

  object CreateHITTypeResponse {
    @inline
    def apply(
        HITTypeId: js.UndefOr[EntityId] = js.undefined
    ): CreateHITTypeResponse = {
      val __obj = js.Dynamic.literal()
      HITTypeId.foreach(__v => __obj.updateDynamic("HITTypeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHITTypeResponse]
    }
  }

  @js.native
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

  object CreateHITWithHITTypeRequest {
    @inline
    def apply(
        HITTypeId: EntityId,
        LifetimeInSeconds: Double,
        AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
        HITLayoutId: js.UndefOr[EntityId] = js.undefined,
        HITLayoutParameters: js.UndefOr[HITLayoutParameterList] = js.undefined,
        HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
        MaxAssignments: js.UndefOr[Int] = js.undefined,
        Question: js.UndefOr[String] = js.undefined,
        RequesterAnnotation: js.UndefOr[String] = js.undefined,
        UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): CreateHITWithHITTypeRequest = {
      val __obj = js.Dynamic.literal(
        "HITTypeId" -> HITTypeId.asInstanceOf[js.Any],
        "LifetimeInSeconds" -> LifetimeInSeconds.asInstanceOf[js.Any]
      )

      AssignmentReviewPolicy.foreach(__v => __obj.updateDynamic("AssignmentReviewPolicy")(__v.asInstanceOf[js.Any]))
      HITLayoutId.foreach(__v => __obj.updateDynamic("HITLayoutId")(__v.asInstanceOf[js.Any]))
      HITLayoutParameters.foreach(__v => __obj.updateDynamic("HITLayoutParameters")(__v.asInstanceOf[js.Any]))
      HITReviewPolicy.foreach(__v => __obj.updateDynamic("HITReviewPolicy")(__v.asInstanceOf[js.Any]))
      MaxAssignments.foreach(__v => __obj.updateDynamic("MaxAssignments")(__v.asInstanceOf[js.Any]))
      Question.foreach(__v => __obj.updateDynamic("Question")(__v.asInstanceOf[js.Any]))
      RequesterAnnotation.foreach(__v => __obj.updateDynamic("RequesterAnnotation")(__v.asInstanceOf[js.Any]))
      UniqueRequestToken.foreach(__v => __obj.updateDynamic("UniqueRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHITWithHITTypeRequest]
    }
  }

  @js.native
  trait CreateHITWithHITTypeResponse extends js.Object {
    var HIT: js.UndefOr[HIT]
  }

  object CreateHITWithHITTypeResponse {
    @inline
    def apply(
        HIT: js.UndefOr[HIT] = js.undefined
    ): CreateHITWithHITTypeResponse = {
      val __obj = js.Dynamic.literal()
      HIT.foreach(__v => __obj.updateDynamic("HIT")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHITWithHITTypeResponse]
    }
  }

  @js.native
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

  object CreateQualificationTypeRequest {
    @inline
    def apply(
        Description: String,
        Name: String,
        QualificationTypeStatus: QualificationTypeStatus,
        AnswerKey: js.UndefOr[String] = js.undefined,
        AutoGranted: js.UndefOr[Boolean] = js.undefined,
        AutoGrantedValue: js.UndefOr[Int] = js.undefined,
        Keywords: js.UndefOr[String] = js.undefined,
        RetryDelayInSeconds: js.UndefOr[Double] = js.undefined,
        Test: js.UndefOr[String] = js.undefined,
        TestDurationInSeconds: js.UndefOr[Double] = js.undefined
    ): CreateQualificationTypeRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "QualificationTypeStatus" -> QualificationTypeStatus.asInstanceOf[js.Any]
      )

      AnswerKey.foreach(__v => __obj.updateDynamic("AnswerKey")(__v.asInstanceOf[js.Any]))
      AutoGranted.foreach(__v => __obj.updateDynamic("AutoGranted")(__v.asInstanceOf[js.Any]))
      AutoGrantedValue.foreach(__v => __obj.updateDynamic("AutoGrantedValue")(__v.asInstanceOf[js.Any]))
      Keywords.foreach(__v => __obj.updateDynamic("Keywords")(__v.asInstanceOf[js.Any]))
      RetryDelayInSeconds.foreach(__v => __obj.updateDynamic("RetryDelayInSeconds")(__v.asInstanceOf[js.Any]))
      Test.foreach(__v => __obj.updateDynamic("Test")(__v.asInstanceOf[js.Any]))
      TestDurationInSeconds.foreach(__v => __obj.updateDynamic("TestDurationInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQualificationTypeRequest]
    }
  }

  @js.native
  trait CreateQualificationTypeResponse extends js.Object {
    var QualificationType: js.UndefOr[QualificationType]
  }

  object CreateQualificationTypeResponse {
    @inline
    def apply(
        QualificationType: js.UndefOr[QualificationType] = js.undefined
    ): CreateQualificationTypeResponse = {
      val __obj = js.Dynamic.literal()
      QualificationType.foreach(__v => __obj.updateDynamic("QualificationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQualificationTypeResponse]
    }
  }

  @js.native
  trait CreateWorkerBlockRequest extends js.Object {
    var Reason: String
    var WorkerId: CustomerId
  }

  object CreateWorkerBlockRequest {
    @inline
    def apply(
        Reason: String,
        WorkerId: CustomerId
    ): CreateWorkerBlockRequest = {
      val __obj = js.Dynamic.literal(
        "Reason" -> Reason.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateWorkerBlockRequest]
    }
  }

  @js.native
  trait CreateWorkerBlockResponse extends js.Object {}

  object CreateWorkerBlockResponse {
    @inline
    def apply(
    ): CreateWorkerBlockResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateWorkerBlockResponse]
    }
  }

  @js.native
  trait DeleteHITRequest extends js.Object {
    var HITId: EntityId
  }

  object DeleteHITRequest {
    @inline
    def apply(
        HITId: EntityId
    ): DeleteHITRequest = {
      val __obj = js.Dynamic.literal(
        "HITId" -> HITId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHITRequest]
    }
  }

  @js.native
  trait DeleteHITResponse extends js.Object {}

  object DeleteHITResponse {
    @inline
    def apply(
    ): DeleteHITResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteHITResponse]
    }
  }

  @js.native
  trait DeleteQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
  }

  object DeleteQualificationTypeRequest {
    @inline
    def apply(
        QualificationTypeId: EntityId
    ): DeleteQualificationTypeRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteQualificationTypeRequest]
    }
  }

  @js.native
  trait DeleteQualificationTypeResponse extends js.Object {}

  object DeleteQualificationTypeResponse {
    @inline
    def apply(
    ): DeleteQualificationTypeResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteQualificationTypeResponse]
    }
  }

  @js.native
  trait DeleteWorkerBlockRequest extends js.Object {
    var WorkerId: CustomerId
    var Reason: js.UndefOr[String]
  }

  object DeleteWorkerBlockRequest {
    @inline
    def apply(
        WorkerId: CustomerId,
        Reason: js.UndefOr[String] = js.undefined
    ): DeleteWorkerBlockRequest = {
      val __obj = js.Dynamic.literal(
        "WorkerId" -> WorkerId.asInstanceOf[js.Any]
      )

      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteWorkerBlockRequest]
    }
  }

  @js.native
  trait DeleteWorkerBlockResponse extends js.Object {}

  object DeleteWorkerBlockResponse {
    @inline
    def apply(
    ): DeleteWorkerBlockResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteWorkerBlockResponse]
    }
  }

  @js.native
  trait DisassociateQualificationFromWorkerRequest extends js.Object {
    var QualificationTypeId: EntityId
    var WorkerId: CustomerId
    var Reason: js.UndefOr[String]
  }

  object DisassociateQualificationFromWorkerRequest {
    @inline
    def apply(
        QualificationTypeId: EntityId,
        WorkerId: CustomerId,
        Reason: js.UndefOr[String] = js.undefined
    ): DisassociateQualificationFromWorkerRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any]
      )

      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateQualificationFromWorkerRequest]
    }
  }

  @js.native
  trait DisassociateQualificationFromWorkerResponse extends js.Object {}

  object DisassociateQualificationFromWorkerResponse {
    @inline
    def apply(
    ): DisassociateQualificationFromWorkerResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateQualificationFromWorkerResponse]
    }
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType {
    @inline def AssignmentAccepted = "AssignmentAccepted".asInstanceOf[EventType]
    @inline def AssignmentAbandoned = "AssignmentAbandoned".asInstanceOf[EventType]
    @inline def AssignmentReturned = "AssignmentReturned".asInstanceOf[EventType]
    @inline def AssignmentSubmitted = "AssignmentSubmitted".asInstanceOf[EventType]
    @inline def AssignmentRejected = "AssignmentRejected".asInstanceOf[EventType]
    @inline def AssignmentApproved = "AssignmentApproved".asInstanceOf[EventType]
    @inline def HITCreated = "HITCreated".asInstanceOf[EventType]
    @inline def HITExpired = "HITExpired".asInstanceOf[EventType]
    @inline def HITReviewable = "HITReviewable".asInstanceOf[EventType]
    @inline def HITExtended = "HITExtended".asInstanceOf[EventType]
    @inline def HITDisposed = "HITDisposed".asInstanceOf[EventType]
    @inline def Ping = "Ping".asInstanceOf[EventType]

    @inline def values =
      js.Object.freeze(js.Array(
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
      ))
  }

  @js.native
  trait GetAccountBalanceRequest extends js.Object {}

  object GetAccountBalanceRequest {
    @inline
    def apply(
    ): GetAccountBalanceRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetAccountBalanceRequest]
    }
  }

  @js.native
  trait GetAccountBalanceResponse extends js.Object {
    var AvailableBalance: js.UndefOr[CurrencyAmount]
    var OnHoldBalance: js.UndefOr[CurrencyAmount]
  }

  object GetAccountBalanceResponse {
    @inline
    def apply(
        AvailableBalance: js.UndefOr[CurrencyAmount] = js.undefined,
        OnHoldBalance: js.UndefOr[CurrencyAmount] = js.undefined
    ): GetAccountBalanceResponse = {
      val __obj = js.Dynamic.literal()
      AvailableBalance.foreach(__v => __obj.updateDynamic("AvailableBalance")(__v.asInstanceOf[js.Any]))
      OnHoldBalance.foreach(__v => __obj.updateDynamic("OnHoldBalance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountBalanceResponse]
    }
  }

  @js.native
  trait GetAssignmentRequest extends js.Object {
    var AssignmentId: EntityId
  }

  object GetAssignmentRequest {
    @inline
    def apply(
        AssignmentId: EntityId
    ): GetAssignmentRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAssignmentRequest]
    }
  }

  @js.native
  trait GetAssignmentResponse extends js.Object {
    var Assignment: js.UndefOr[Assignment]
    var HIT: js.UndefOr[HIT]
  }

  object GetAssignmentResponse {
    @inline
    def apply(
        Assignment: js.UndefOr[Assignment] = js.undefined,
        HIT: js.UndefOr[HIT] = js.undefined
    ): GetAssignmentResponse = {
      val __obj = js.Dynamic.literal()
      Assignment.foreach(__v => __obj.updateDynamic("Assignment")(__v.asInstanceOf[js.Any]))
      HIT.foreach(__v => __obj.updateDynamic("HIT")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssignmentResponse]
    }
  }

  @js.native
  trait GetFileUploadURLRequest extends js.Object {
    var AssignmentId: EntityId
    var QuestionIdentifier: String
  }

  object GetFileUploadURLRequest {
    @inline
    def apply(
        AssignmentId: EntityId,
        QuestionIdentifier: String
    ): GetFileUploadURLRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any],
        "QuestionIdentifier" -> QuestionIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFileUploadURLRequest]
    }
  }

  @js.native
  trait GetFileUploadURLResponse extends js.Object {
    var FileUploadURL: js.UndefOr[String]
  }

  object GetFileUploadURLResponse {
    @inline
    def apply(
        FileUploadURL: js.UndefOr[String] = js.undefined
    ): GetFileUploadURLResponse = {
      val __obj = js.Dynamic.literal()
      FileUploadURL.foreach(__v => __obj.updateDynamic("FileUploadURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFileUploadURLResponse]
    }
  }

  @js.native
  trait GetHITRequest extends js.Object {
    var HITId: EntityId
  }

  object GetHITRequest {
    @inline
    def apply(
        HITId: EntityId
    ): GetHITRequest = {
      val __obj = js.Dynamic.literal(
        "HITId" -> HITId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHITRequest]
    }
  }

  @js.native
  trait GetHITResponse extends js.Object {
    var HIT: js.UndefOr[HIT]
  }

  object GetHITResponse {
    @inline
    def apply(
        HIT: js.UndefOr[HIT] = js.undefined
    ): GetHITResponse = {
      val __obj = js.Dynamic.literal()
      HIT.foreach(__v => __obj.updateDynamic("HIT")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetHITResponse]
    }
  }

  @js.native
  trait GetQualificationScoreRequest extends js.Object {
    var QualificationTypeId: EntityId
    var WorkerId: CustomerId
  }

  object GetQualificationScoreRequest {
    @inline
    def apply(
        QualificationTypeId: EntityId,
        WorkerId: CustomerId
    ): GetQualificationScoreRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetQualificationScoreRequest]
    }
  }

  @js.native
  trait GetQualificationScoreResponse extends js.Object {
    var Qualification: js.UndefOr[Qualification]
  }

  object GetQualificationScoreResponse {
    @inline
    def apply(
        Qualification: js.UndefOr[Qualification] = js.undefined
    ): GetQualificationScoreResponse = {
      val __obj = js.Dynamic.literal()
      Qualification.foreach(__v => __obj.updateDynamic("Qualification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQualificationScoreResponse]
    }
  }

  @js.native
  trait GetQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
  }

  object GetQualificationTypeRequest {
    @inline
    def apply(
        QualificationTypeId: EntityId
    ): GetQualificationTypeRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetQualificationTypeRequest]
    }
  }

  @js.native
  trait GetQualificationTypeResponse extends js.Object {
    var QualificationType: js.UndefOr[QualificationType]
  }

  object GetQualificationTypeResponse {
    @inline
    def apply(
        QualificationType: js.UndefOr[QualificationType] = js.undefined
    ): GetQualificationTypeResponse = {
      val __obj = js.Dynamic.literal()
      QualificationType.foreach(__v => __obj.updateDynamic("QualificationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQualificationTypeResponse]
    }
  }

  /**
    * The HIT data structure represents a single HIT, including all the information necessary for a Worker to accept and complete the HIT.
    */
  @js.native
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

  object HIT {
    @inline
    def apply(
        AssignmentDurationInSeconds: js.UndefOr[Double] = js.undefined,
        AutoApprovalDelayInSeconds: js.UndefOr[Double] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Expiration: js.UndefOr[Timestamp] = js.undefined,
        HITGroupId: js.UndefOr[EntityId] = js.undefined,
        HITId: js.UndefOr[EntityId] = js.undefined,
        HITLayoutId: js.UndefOr[EntityId] = js.undefined,
        HITReviewStatus: js.UndefOr[HITReviewStatus] = js.undefined,
        HITStatus: js.UndefOr[HITStatus] = js.undefined,
        HITTypeId: js.UndefOr[EntityId] = js.undefined,
        Keywords: js.UndefOr[String] = js.undefined,
        MaxAssignments: js.UndefOr[Int] = js.undefined,
        NumberOfAssignmentsAvailable: js.UndefOr[Int] = js.undefined,
        NumberOfAssignmentsCompleted: js.UndefOr[Int] = js.undefined,
        NumberOfAssignmentsPending: js.UndefOr[Int] = js.undefined,
        QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined,
        Question: js.UndefOr[String] = js.undefined,
        RequesterAnnotation: js.UndefOr[String] = js.undefined,
        Reward: js.UndefOr[CurrencyAmount] = js.undefined,
        Title: js.UndefOr[String] = js.undefined
    ): HIT = {
      val __obj = js.Dynamic.literal()
      AssignmentDurationInSeconds.foreach(__v => __obj.updateDynamic("AssignmentDurationInSeconds")(__v.asInstanceOf[js.Any]))
      AutoApprovalDelayInSeconds.foreach(__v => __obj.updateDynamic("AutoApprovalDelayInSeconds")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.updateDynamic("Expiration")(__v.asInstanceOf[js.Any]))
      HITGroupId.foreach(__v => __obj.updateDynamic("HITGroupId")(__v.asInstanceOf[js.Any]))
      HITId.foreach(__v => __obj.updateDynamic("HITId")(__v.asInstanceOf[js.Any]))
      HITLayoutId.foreach(__v => __obj.updateDynamic("HITLayoutId")(__v.asInstanceOf[js.Any]))
      HITReviewStatus.foreach(__v => __obj.updateDynamic("HITReviewStatus")(__v.asInstanceOf[js.Any]))
      HITStatus.foreach(__v => __obj.updateDynamic("HITStatus")(__v.asInstanceOf[js.Any]))
      HITTypeId.foreach(__v => __obj.updateDynamic("HITTypeId")(__v.asInstanceOf[js.Any]))
      Keywords.foreach(__v => __obj.updateDynamic("Keywords")(__v.asInstanceOf[js.Any]))
      MaxAssignments.foreach(__v => __obj.updateDynamic("MaxAssignments")(__v.asInstanceOf[js.Any]))
      NumberOfAssignmentsAvailable.foreach(__v => __obj.updateDynamic("NumberOfAssignmentsAvailable")(__v.asInstanceOf[js.Any]))
      NumberOfAssignmentsCompleted.foreach(__v => __obj.updateDynamic("NumberOfAssignmentsCompleted")(__v.asInstanceOf[js.Any]))
      NumberOfAssignmentsPending.foreach(__v => __obj.updateDynamic("NumberOfAssignmentsPending")(__v.asInstanceOf[js.Any]))
      QualificationRequirements.foreach(__v => __obj.updateDynamic("QualificationRequirements")(__v.asInstanceOf[js.Any]))
      Question.foreach(__v => __obj.updateDynamic("Question")(__v.asInstanceOf[js.Any]))
      RequesterAnnotation.foreach(__v => __obj.updateDynamic("RequesterAnnotation")(__v.asInstanceOf[js.Any]))
      Reward.foreach(__v => __obj.updateDynamic("Reward")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HIT]
    }
  }

  @js.native
  sealed trait HITAccessActions extends js.Any
  object HITAccessActions {
    @inline def Accept = "Accept".asInstanceOf[HITAccessActions]
    @inline def PreviewAndAccept = "PreviewAndAccept".asInstanceOf[HITAccessActions]
    @inline def DiscoverPreviewAndAccept = "DiscoverPreviewAndAccept".asInstanceOf[HITAccessActions]

    @inline def values = js.Object.freeze(js.Array(Accept, PreviewAndAccept, DiscoverPreviewAndAccept))
  }

  /**
    * The HITLayoutParameter data structure defines parameter values used with a HITLayout. A HITLayout is a reusable Amazon Mechanical Turk project template used to provide Human Intelligence Task (HIT) question data for CreateHIT.
    */
  @js.native
  trait HITLayoutParameter extends js.Object {
    var Name: String
    var Value: String
  }

  object HITLayoutParameter {
    @inline
    def apply(
        Name: String,
        Value: String
    ): HITLayoutParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HITLayoutParameter]
    }
  }

  @js.native
  sealed trait HITReviewStatus extends js.Any
  object HITReviewStatus {
    @inline def NotReviewed = "NotReviewed".asInstanceOf[HITReviewStatus]
    @inline def MarkedForReview = "MarkedForReview".asInstanceOf[HITReviewStatus]
    @inline def ReviewedAppropriate = "ReviewedAppropriate".asInstanceOf[HITReviewStatus]
    @inline def ReviewedInappropriate = "ReviewedInappropriate".asInstanceOf[HITReviewStatus]

    @inline def values = js.Object.freeze(js.Array(NotReviewed, MarkedForReview, ReviewedAppropriate, ReviewedInappropriate))
  }

  @js.native
  sealed trait HITStatus extends js.Any
  object HITStatus {
    @inline def Assignable = "Assignable".asInstanceOf[HITStatus]
    @inline def Unassignable = "Unassignable".asInstanceOf[HITStatus]
    @inline def Reviewable = "Reviewable".asInstanceOf[HITStatus]
    @inline def Reviewing = "Reviewing".asInstanceOf[HITStatus]
    @inline def Disposed = "Disposed".asInstanceOf[HITStatus]

    @inline def values = js.Object.freeze(js.Array(Assignable, Unassignable, Reviewable, Reviewing, Disposed))
  }

  @js.native
  trait ListAssignmentsForHITRequest extends js.Object {
    var HITId: EntityId
    var AssignmentStatuses: js.UndefOr[AssignmentStatusList]
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAssignmentsForHITRequest {
    @inline
    def apply(
        HITId: EntityId,
        AssignmentStatuses: js.UndefOr[AssignmentStatusList] = js.undefined,
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssignmentsForHITRequest = {
      val __obj = js.Dynamic.literal(
        "HITId" -> HITId.asInstanceOf[js.Any]
      )

      AssignmentStatuses.foreach(__v => __obj.updateDynamic("AssignmentStatuses")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssignmentsForHITRequest]
    }
  }

  @js.native
  trait ListAssignmentsForHITResponse extends js.Object {
    var Assignments: js.UndefOr[AssignmentList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListAssignmentsForHITResponse {
    @inline
    def apply(
        Assignments: js.UndefOr[AssignmentList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        NumResults: js.UndefOr[Int] = js.undefined
    ): ListAssignmentsForHITResponse = {
      val __obj = js.Dynamic.literal()
      Assignments.foreach(__v => __obj.updateDynamic("Assignments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NumResults.foreach(__v => __obj.updateDynamic("NumResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssignmentsForHITResponse]
    }
  }

  @js.native
  trait ListBonusPaymentsRequest extends js.Object {
    var AssignmentId: js.UndefOr[EntityId]
    var HITId: js.UndefOr[EntityId]
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListBonusPaymentsRequest {
    @inline
    def apply(
        AssignmentId: js.UndefOr[EntityId] = js.undefined,
        HITId: js.UndefOr[EntityId] = js.undefined,
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListBonusPaymentsRequest = {
      val __obj = js.Dynamic.literal()
      AssignmentId.foreach(__v => __obj.updateDynamic("AssignmentId")(__v.asInstanceOf[js.Any]))
      HITId.foreach(__v => __obj.updateDynamic("HITId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBonusPaymentsRequest]
    }
  }

  @js.native
  trait ListBonusPaymentsResponse extends js.Object {
    var BonusPayments: js.UndefOr[BonusPaymentList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListBonusPaymentsResponse {
    @inline
    def apply(
        BonusPayments: js.UndefOr[BonusPaymentList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        NumResults: js.UndefOr[Int] = js.undefined
    ): ListBonusPaymentsResponse = {
      val __obj = js.Dynamic.literal()
      BonusPayments.foreach(__v => __obj.updateDynamic("BonusPayments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NumResults.foreach(__v => __obj.updateDynamic("NumResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBonusPaymentsResponse]
    }
  }

  @js.native
  trait ListHITsForQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHITsForQualificationTypeRequest {
    @inline
    def apply(
        QualificationTypeId: EntityId,
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHITsForQualificationTypeRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHITsForQualificationTypeRequest]
    }
  }

  @js.native
  trait ListHITsForQualificationTypeResponse extends js.Object {
    var HITs: js.UndefOr[HITList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListHITsForQualificationTypeResponse {
    @inline
    def apply(
        HITs: js.UndefOr[HITList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        NumResults: js.UndefOr[Int] = js.undefined
    ): ListHITsForQualificationTypeResponse = {
      val __obj = js.Dynamic.literal()
      HITs.foreach(__v => __obj.updateDynamic("HITs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NumResults.foreach(__v => __obj.updateDynamic("NumResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHITsForQualificationTypeResponse]
    }
  }

  @js.native
  trait ListHITsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHITsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHITsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHITsRequest]
    }
  }

  @js.native
  trait ListHITsResponse extends js.Object {
    var HITs: js.UndefOr[HITList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListHITsResponse {
    @inline
    def apply(
        HITs: js.UndefOr[HITList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        NumResults: js.UndefOr[Int] = js.undefined
    ): ListHITsResponse = {
      val __obj = js.Dynamic.literal()
      HITs.foreach(__v => __obj.updateDynamic("HITs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NumResults.foreach(__v => __obj.updateDynamic("NumResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHITsResponse]
    }
  }

  @js.native
  trait ListQualificationRequestsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var QualificationTypeId: js.UndefOr[EntityId]
  }

  object ListQualificationRequestsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        QualificationTypeId: js.UndefOr[EntityId] = js.undefined
    ): ListQualificationRequestsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QualificationTypeId.foreach(__v => __obj.updateDynamic("QualificationTypeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQualificationRequestsRequest]
    }
  }

  @js.native
  trait ListQualificationRequestsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var QualificationRequests: js.UndefOr[QualificationRequestList]
  }

  object ListQualificationRequestsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        NumResults: js.UndefOr[Int] = js.undefined,
        QualificationRequests: js.UndefOr[QualificationRequestList] = js.undefined
    ): ListQualificationRequestsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NumResults.foreach(__v => __obj.updateDynamic("NumResults")(__v.asInstanceOf[js.Any]))
      QualificationRequests.foreach(__v => __obj.updateDynamic("QualificationRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQualificationRequestsResponse]
    }
  }

  @js.native
  trait ListQualificationTypesRequest extends js.Object {
    var MustBeRequestable: Boolean
    var MaxResults: js.UndefOr[ResultSize]
    var MustBeOwnedByCaller: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[PaginationToken]
    var Query: js.UndefOr[String]
  }

  object ListQualificationTypesRequest {
    @inline
    def apply(
        MustBeRequestable: Boolean,
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        MustBeOwnedByCaller: js.UndefOr[Boolean] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Query: js.UndefOr[String] = js.undefined
    ): ListQualificationTypesRequest = {
      val __obj = js.Dynamic.literal(
        "MustBeRequestable" -> MustBeRequestable.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MustBeOwnedByCaller.foreach(__v => __obj.updateDynamic("MustBeOwnedByCaller")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Query.foreach(__v => __obj.updateDynamic("Query")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQualificationTypesRequest]
    }
  }

  @js.native
  trait ListQualificationTypesResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var QualificationTypes: js.UndefOr[QualificationTypeList]
  }

  object ListQualificationTypesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        NumResults: js.UndefOr[Int] = js.undefined,
        QualificationTypes: js.UndefOr[QualificationTypeList] = js.undefined
    ): ListQualificationTypesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NumResults.foreach(__v => __obj.updateDynamic("NumResults")(__v.asInstanceOf[js.Any]))
      QualificationTypes.foreach(__v => __obj.updateDynamic("QualificationTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQualificationTypesResponse]
    }
  }

  @js.native
  trait ListReviewPolicyResultsForHITRequest extends js.Object {
    var HITId: EntityId
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var PolicyLevels: js.UndefOr[ReviewPolicyLevelList]
    var RetrieveActions: js.UndefOr[Boolean]
    var RetrieveResults: js.UndefOr[Boolean]
  }

  object ListReviewPolicyResultsForHITRequest {
    @inline
    def apply(
        HITId: EntityId,
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        PolicyLevels: js.UndefOr[ReviewPolicyLevelList] = js.undefined,
        RetrieveActions: js.UndefOr[Boolean] = js.undefined,
        RetrieveResults: js.UndefOr[Boolean] = js.undefined
    ): ListReviewPolicyResultsForHITRequest = {
      val __obj = js.Dynamic.literal(
        "HITId" -> HITId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PolicyLevels.foreach(__v => __obj.updateDynamic("PolicyLevels")(__v.asInstanceOf[js.Any]))
      RetrieveActions.foreach(__v => __obj.updateDynamic("RetrieveActions")(__v.asInstanceOf[js.Any]))
      RetrieveResults.foreach(__v => __obj.updateDynamic("RetrieveResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReviewPolicyResultsForHITRequest]
    }
  }

  @js.native
  trait ListReviewPolicyResultsForHITResponse extends js.Object {
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy]
    var AssignmentReviewReport: js.UndefOr[ReviewReport]
    var HITId: js.UndefOr[EntityId]
    var HITReviewPolicy: js.UndefOr[ReviewPolicy]
    var HITReviewReport: js.UndefOr[ReviewReport]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListReviewPolicyResultsForHITResponse {
    @inline
    def apply(
        AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
        AssignmentReviewReport: js.UndefOr[ReviewReport] = js.undefined,
        HITId: js.UndefOr[EntityId] = js.undefined,
        HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
        HITReviewReport: js.UndefOr[ReviewReport] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListReviewPolicyResultsForHITResponse = {
      val __obj = js.Dynamic.literal()
      AssignmentReviewPolicy.foreach(__v => __obj.updateDynamic("AssignmentReviewPolicy")(__v.asInstanceOf[js.Any]))
      AssignmentReviewReport.foreach(__v => __obj.updateDynamic("AssignmentReviewReport")(__v.asInstanceOf[js.Any]))
      HITId.foreach(__v => __obj.updateDynamic("HITId")(__v.asInstanceOf[js.Any]))
      HITReviewPolicy.foreach(__v => __obj.updateDynamic("HITReviewPolicy")(__v.asInstanceOf[js.Any]))
      HITReviewReport.foreach(__v => __obj.updateDynamic("HITReviewReport")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReviewPolicyResultsForHITResponse]
    }
  }

  @js.native
  trait ListReviewableHITsRequest extends js.Object {
    var HITTypeId: js.UndefOr[EntityId]
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[ReviewableHITStatus]
  }

  object ListReviewableHITsRequest {
    @inline
    def apply(
        HITTypeId: js.UndefOr[EntityId] = js.undefined,
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Status: js.UndefOr[ReviewableHITStatus] = js.undefined
    ): ListReviewableHITsRequest = {
      val __obj = js.Dynamic.literal()
      HITTypeId.foreach(__v => __obj.updateDynamic("HITTypeId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReviewableHITsRequest]
    }
  }

  @js.native
  trait ListReviewableHITsResponse extends js.Object {
    var HITs: js.UndefOr[HITList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListReviewableHITsResponse {
    @inline
    def apply(
        HITs: js.UndefOr[HITList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        NumResults: js.UndefOr[Int] = js.undefined
    ): ListReviewableHITsResponse = {
      val __obj = js.Dynamic.literal()
      HITs.foreach(__v => __obj.updateDynamic("HITs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NumResults.foreach(__v => __obj.updateDynamic("NumResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReviewableHITsResponse]
    }
  }

  @js.native
  trait ListWorkerBlocksRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListWorkerBlocksRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListWorkerBlocksRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkerBlocksRequest]
    }
  }

  @js.native
  trait ListWorkerBlocksResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var WorkerBlocks: js.UndefOr[WorkerBlockList]
  }

  object ListWorkerBlocksResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        NumResults: js.UndefOr[Int] = js.undefined,
        WorkerBlocks: js.UndefOr[WorkerBlockList] = js.undefined
    ): ListWorkerBlocksResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NumResults.foreach(__v => __obj.updateDynamic("NumResults")(__v.asInstanceOf[js.Any]))
      WorkerBlocks.foreach(__v => __obj.updateDynamic("WorkerBlocks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkerBlocksResponse]
    }
  }

  @js.native
  trait ListWorkersWithQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[QualificationStatus]
  }

  object ListWorkersWithQualificationTypeRequest {
    @inline
    def apply(
        QualificationTypeId: EntityId,
        MaxResults: js.UndefOr[ResultSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Status: js.UndefOr[QualificationStatus] = js.undefined
    ): ListWorkersWithQualificationTypeRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkersWithQualificationTypeRequest]
    }
  }

  @js.native
  trait ListWorkersWithQualificationTypeResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var Qualifications: js.UndefOr[QualificationList]
  }

  object ListWorkersWithQualificationTypeResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        NumResults: js.UndefOr[Int] = js.undefined,
        Qualifications: js.UndefOr[QualificationList] = js.undefined
    ): ListWorkersWithQualificationTypeResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NumResults.foreach(__v => __obj.updateDynamic("NumResults")(__v.asInstanceOf[js.Any]))
      Qualifications.foreach(__v => __obj.updateDynamic("Qualifications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkersWithQualificationTypeResponse]
    }
  }

  /**
    * The Locale data structure represents a geographical region or location.
    */
  @js.native
  trait Locale extends js.Object {
    var Country: CountryParameters
    var Subdivision: js.UndefOr[CountryParameters]
  }

  object Locale {
    @inline
    def apply(
        Country: CountryParameters,
        Subdivision: js.UndefOr[CountryParameters] = js.undefined
    ): Locale = {
      val __obj = js.Dynamic.literal(
        "Country" -> Country.asInstanceOf[js.Any]
      )

      Subdivision.foreach(__v => __obj.updateDynamic("Subdivision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Locale]
    }
  }

  /**
    * The NotificationSpecification data structure describes a HIT event notification for a HIT type.
    */
  @js.native
  trait NotificationSpecification extends js.Object {
    var Destination: String
    var EventTypes: EventTypeList
    var Transport: NotificationTransport
    var Version: String
  }

  object NotificationSpecification {
    @inline
    def apply(
        Destination: String,
        EventTypes: EventTypeList,
        Transport: NotificationTransport,
        Version: String
    ): NotificationSpecification = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "EventTypes" -> EventTypes.asInstanceOf[js.Any],
        "Transport" -> Transport.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NotificationSpecification]
    }
  }

  @js.native
  sealed trait NotificationTransport extends js.Any
  object NotificationTransport {
    @inline def Email = "Email".asInstanceOf[NotificationTransport]
    @inline def SQS = "SQS".asInstanceOf[NotificationTransport]
    @inline def SNS = "SNS".asInstanceOf[NotificationTransport]

    @inline def values = js.Object.freeze(js.Array(Email, SQS, SNS))
  }

  @js.native
  sealed trait NotifyWorkersFailureCode extends js.Any
  object NotifyWorkersFailureCode {
    @inline def SoftFailure = "SoftFailure".asInstanceOf[NotifyWorkersFailureCode]
    @inline def HardFailure = "HardFailure".asInstanceOf[NotifyWorkersFailureCode]

    @inline def values = js.Object.freeze(js.Array(SoftFailure, HardFailure))
  }

  /**
    * When MTurk encounters an issue with notifying the Workers you specified, it returns back this object with failure details.
    */
  @js.native
  trait NotifyWorkersFailureStatus extends js.Object {
    var NotifyWorkersFailureCode: js.UndefOr[NotifyWorkersFailureCode]
    var NotifyWorkersFailureMessage: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }

  object NotifyWorkersFailureStatus {
    @inline
    def apply(
        NotifyWorkersFailureCode: js.UndefOr[NotifyWorkersFailureCode] = js.undefined,
        NotifyWorkersFailureMessage: js.UndefOr[String] = js.undefined,
        WorkerId: js.UndefOr[CustomerId] = js.undefined
    ): NotifyWorkersFailureStatus = {
      val __obj = js.Dynamic.literal()
      NotifyWorkersFailureCode.foreach(__v => __obj.updateDynamic("NotifyWorkersFailureCode")(__v.asInstanceOf[js.Any]))
      NotifyWorkersFailureMessage.foreach(__v => __obj.updateDynamic("NotifyWorkersFailureMessage")(__v.asInstanceOf[js.Any]))
      WorkerId.foreach(__v => __obj.updateDynamic("WorkerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyWorkersFailureStatus]
    }
  }

  @js.native
  trait NotifyWorkersRequest extends js.Object {
    var MessageText: String
    var Subject: String
    var WorkerIds: CustomerIdList
  }

  object NotifyWorkersRequest {
    @inline
    def apply(
        MessageText: String,
        Subject: String,
        WorkerIds: CustomerIdList
    ): NotifyWorkersRequest = {
      val __obj = js.Dynamic.literal(
        "MessageText" -> MessageText.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any],
        "WorkerIds" -> WorkerIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NotifyWorkersRequest]
    }
  }

  @js.native
  trait NotifyWorkersResponse extends js.Object {
    var NotifyWorkersFailureStatuses: js.UndefOr[NotifyWorkersFailureStatusList]
  }

  object NotifyWorkersResponse {
    @inline
    def apply(
        NotifyWorkersFailureStatuses: js.UndefOr[NotifyWorkersFailureStatusList] = js.undefined
    ): NotifyWorkersResponse = {
      val __obj = js.Dynamic.literal()
      NotifyWorkersFailureStatuses.foreach(__v => __obj.updateDynamic("NotifyWorkersFailureStatuses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyWorkersResponse]
    }
  }

  /**
    * This data structure is the data type for the AnswerKey parameter of the ScoreMyKnownAnswers/2011-09-01 Review Policy.
    */
  @js.native
  trait ParameterMapEntry extends js.Object {
    var Key: js.UndefOr[String]
    var Values: js.UndefOr[StringList]
  }

  object ParameterMapEntry {
    @inline
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Values: js.UndefOr[StringList] = js.undefined
    ): ParameterMapEntry = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterMapEntry]
    }
  }

  /**
    * Name of the parameter from the Review policy.
    */
  @js.native
  trait PolicyParameter extends js.Object {
    var Key: js.UndefOr[String]
    var MapEntries: js.UndefOr[ParameterMapEntryList]
    var Values: js.UndefOr[StringList]
  }

  object PolicyParameter {
    @inline
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        MapEntries: js.UndefOr[ParameterMapEntryList] = js.undefined,
        Values: js.UndefOr[StringList] = js.undefined
    ): PolicyParameter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      MapEntries.foreach(__v => __obj.updateDynamic("MapEntries")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyParameter]
    }
  }

  /**
    * The Qualification data structure represents a Qualification assigned to a user, including the Qualification type and the value (score).
    */
  @js.native
  trait Qualification extends js.Object {
    var GrantTime: js.UndefOr[Timestamp]
    var IntegerValue: js.UndefOr[Int]
    var LocaleValue: js.UndefOr[Locale]
    var QualificationTypeId: js.UndefOr[EntityId]
    var Status: js.UndefOr[QualificationStatus]
    var WorkerId: js.UndefOr[CustomerId]
  }

  object Qualification {
    @inline
    def apply(
        GrantTime: js.UndefOr[Timestamp] = js.undefined,
        IntegerValue: js.UndefOr[Int] = js.undefined,
        LocaleValue: js.UndefOr[Locale] = js.undefined,
        QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
        Status: js.UndefOr[QualificationStatus] = js.undefined,
        WorkerId: js.UndefOr[CustomerId] = js.undefined
    ): Qualification = {
      val __obj = js.Dynamic.literal()
      GrantTime.foreach(__v => __obj.updateDynamic("GrantTime")(__v.asInstanceOf[js.Any]))
      IntegerValue.foreach(__v => __obj.updateDynamic("IntegerValue")(__v.asInstanceOf[js.Any]))
      LocaleValue.foreach(__v => __obj.updateDynamic("LocaleValue")(__v.asInstanceOf[js.Any]))
      QualificationTypeId.foreach(__v => __obj.updateDynamic("QualificationTypeId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WorkerId.foreach(__v => __obj.updateDynamic("WorkerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Qualification]
    }
  }

  /**
    * The QualificationRequest data structure represents a request a Worker has made for a Qualification.
    */
  @js.native
  trait QualificationRequest extends js.Object {
    var Answer: js.UndefOr[String]
    var QualificationRequestId: js.UndefOr[String]
    var QualificationTypeId: js.UndefOr[EntityId]
    var SubmitTime: js.UndefOr[Timestamp]
    var Test: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }

  object QualificationRequest {
    @inline
    def apply(
        Answer: js.UndefOr[String] = js.undefined,
        QualificationRequestId: js.UndefOr[String] = js.undefined,
        QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
        SubmitTime: js.UndefOr[Timestamp] = js.undefined,
        Test: js.UndefOr[String] = js.undefined,
        WorkerId: js.UndefOr[CustomerId] = js.undefined
    ): QualificationRequest = {
      val __obj = js.Dynamic.literal()
      Answer.foreach(__v => __obj.updateDynamic("Answer")(__v.asInstanceOf[js.Any]))
      QualificationRequestId.foreach(__v => __obj.updateDynamic("QualificationRequestId")(__v.asInstanceOf[js.Any]))
      QualificationTypeId.foreach(__v => __obj.updateDynamic("QualificationTypeId")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      Test.foreach(__v => __obj.updateDynamic("Test")(__v.asInstanceOf[js.Any]))
      WorkerId.foreach(__v => __obj.updateDynamic("WorkerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QualificationRequest]
    }
  }

  /**
    * The QualificationRequirement data structure describes a Qualification that a Worker must have before the Worker is allowed to accept a HIT. A requirement may optionally state that a Worker must have the Qualification in order to preview the HIT, or see the HIT in search results.
    */
  @js.native
  trait QualificationRequirement extends js.Object {
    var Comparator: Comparator
    var QualificationTypeId: String
    var ActionsGuarded: js.UndefOr[HITAccessActions]
    var IntegerValues: js.UndefOr[IntegerList]
    var LocaleValues: js.UndefOr[LocaleList]
    var RequiredToPreview: js.UndefOr[Boolean]
  }

  object QualificationRequirement {
    @inline
    def apply(
        Comparator: Comparator,
        QualificationTypeId: String,
        ActionsGuarded: js.UndefOr[HITAccessActions] = js.undefined,
        IntegerValues: js.UndefOr[IntegerList] = js.undefined,
        LocaleValues: js.UndefOr[LocaleList] = js.undefined,
        RequiredToPreview: js.UndefOr[Boolean] = js.undefined
    ): QualificationRequirement = {
      val __obj = js.Dynamic.literal(
        "Comparator" -> Comparator.asInstanceOf[js.Any],
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any]
      )

      ActionsGuarded.foreach(__v => __obj.updateDynamic("ActionsGuarded")(__v.asInstanceOf[js.Any]))
      IntegerValues.foreach(__v => __obj.updateDynamic("IntegerValues")(__v.asInstanceOf[js.Any]))
      LocaleValues.foreach(__v => __obj.updateDynamic("LocaleValues")(__v.asInstanceOf[js.Any]))
      RequiredToPreview.foreach(__v => __obj.updateDynamic("RequiredToPreview")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QualificationRequirement]
    }
  }

  @js.native
  sealed trait QualificationStatus extends js.Any
  object QualificationStatus {
    @inline def Granted = "Granted".asInstanceOf[QualificationStatus]
    @inline def Revoked = "Revoked".asInstanceOf[QualificationStatus]

    @inline def values = js.Object.freeze(js.Array(Granted, Revoked))
  }

  /**
    * The QualificationType data structure represents a Qualification type, a description of a property of a Worker that must match the requirements of a HIT for the Worker to be able to accept the HIT. The type also describes how a Worker can obtain a Qualification of that type, such as through a Qualification test.
    */
  @js.native
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

  object QualificationType {
    @inline
    def apply(
        AnswerKey: js.UndefOr[String] = js.undefined,
        AutoGranted: js.UndefOr[Boolean] = js.undefined,
        AutoGrantedValue: js.UndefOr[Int] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IsRequestable: js.UndefOr[Boolean] = js.undefined,
        Keywords: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
        QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined,
        RetryDelayInSeconds: js.UndefOr[Double] = js.undefined,
        Test: js.UndefOr[String] = js.undefined,
        TestDurationInSeconds: js.UndefOr[Double] = js.undefined
    ): QualificationType = {
      val __obj = js.Dynamic.literal()
      AnswerKey.foreach(__v => __obj.updateDynamic("AnswerKey")(__v.asInstanceOf[js.Any]))
      AutoGranted.foreach(__v => __obj.updateDynamic("AutoGranted")(__v.asInstanceOf[js.Any]))
      AutoGrantedValue.foreach(__v => __obj.updateDynamic("AutoGrantedValue")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsRequestable.foreach(__v => __obj.updateDynamic("IsRequestable")(__v.asInstanceOf[js.Any]))
      Keywords.foreach(__v => __obj.updateDynamic("Keywords")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      QualificationTypeId.foreach(__v => __obj.updateDynamic("QualificationTypeId")(__v.asInstanceOf[js.Any]))
      QualificationTypeStatus.foreach(__v => __obj.updateDynamic("QualificationTypeStatus")(__v.asInstanceOf[js.Any]))
      RetryDelayInSeconds.foreach(__v => __obj.updateDynamic("RetryDelayInSeconds")(__v.asInstanceOf[js.Any]))
      Test.foreach(__v => __obj.updateDynamic("Test")(__v.asInstanceOf[js.Any]))
      TestDurationInSeconds.foreach(__v => __obj.updateDynamic("TestDurationInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QualificationType]
    }
  }

  @js.native
  sealed trait QualificationTypeStatus extends js.Any
  object QualificationTypeStatus {
    @inline def Active = "Active".asInstanceOf[QualificationTypeStatus]
    @inline def Inactive = "Inactive".asInstanceOf[QualificationTypeStatus]

    @inline def values = js.Object.freeze(js.Array(Active, Inactive))
  }

  @js.native
  trait RejectAssignmentRequest extends js.Object {
    var AssignmentId: EntityId
    var RequesterFeedback: String
  }

  object RejectAssignmentRequest {
    @inline
    def apply(
        AssignmentId: EntityId,
        RequesterFeedback: String
    ): RejectAssignmentRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any],
        "RequesterFeedback" -> RequesterFeedback.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RejectAssignmentRequest]
    }
  }

  @js.native
  trait RejectAssignmentResponse extends js.Object {}

  object RejectAssignmentResponse {
    @inline
    def apply(
    ): RejectAssignmentResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RejectAssignmentResponse]
    }
  }

  @js.native
  trait RejectQualificationRequestRequest extends js.Object {
    var QualificationRequestId: String
    var Reason: js.UndefOr[String]
  }

  object RejectQualificationRequestRequest {
    @inline
    def apply(
        QualificationRequestId: String,
        Reason: js.UndefOr[String] = js.undefined
    ): RejectQualificationRequestRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationRequestId" -> QualificationRequestId.asInstanceOf[js.Any]
      )

      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectQualificationRequestRequest]
    }
  }

  @js.native
  trait RejectQualificationRequestResponse extends js.Object {}

  object RejectQualificationRequestResponse {
    @inline
    def apply(
    ): RejectQualificationRequestResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RejectQualificationRequestResponse]
    }
  }

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

  object ReviewActionDetail {
    @inline
    def apply(
        ActionId: js.UndefOr[EntityId] = js.undefined,
        ActionName: js.UndefOr[String] = js.undefined,
        CompleteTime: js.UndefOr[Timestamp] = js.undefined,
        ErrorCode: js.UndefOr[String] = js.undefined,
        Result: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ReviewActionStatus] = js.undefined,
        TargetId: js.UndefOr[EntityId] = js.undefined,
        TargetType: js.UndefOr[String] = js.undefined
    ): ReviewActionDetail = {
      val __obj = js.Dynamic.literal()
      ActionId.foreach(__v => __obj.updateDynamic("ActionId")(__v.asInstanceOf[js.Any]))
      ActionName.foreach(__v => __obj.updateDynamic("ActionName")(__v.asInstanceOf[js.Any]))
      CompleteTime.foreach(__v => __obj.updateDynamic("CompleteTime")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetId.foreach(__v => __obj.updateDynamic("TargetId")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReviewActionDetail]
    }
  }

  @js.native
  sealed trait ReviewActionStatus extends js.Any
  object ReviewActionStatus {
    @inline def Intended = "Intended".asInstanceOf[ReviewActionStatus]
    @inline def Succeeded = "Succeeded".asInstanceOf[ReviewActionStatus]
    @inline def Failed = "Failed".asInstanceOf[ReviewActionStatus]
    @inline def Cancelled = "Cancelled".asInstanceOf[ReviewActionStatus]

    @inline def values = js.Object.freeze(js.Array(Intended, Succeeded, Failed, Cancelled))
  }

  /**
    * HIT Review Policy data structures represent HIT review policies, which you specify when you create a HIT.
    */
  @js.native
  trait ReviewPolicy extends js.Object {
    var PolicyName: String
    var Parameters: js.UndefOr[PolicyParameterList]
  }

  object ReviewPolicy {
    @inline
    def apply(
        PolicyName: String,
        Parameters: js.UndefOr[PolicyParameterList] = js.undefined
    ): ReviewPolicy = {
      val __obj = js.Dynamic.literal(
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReviewPolicy]
    }
  }

  @js.native
  sealed trait ReviewPolicyLevel extends js.Any
  object ReviewPolicyLevel {
    @inline def Assignment = "Assignment".asInstanceOf[ReviewPolicyLevel]
    @inline def HIT = "HIT".asInstanceOf[ReviewPolicyLevel]

    @inline def values = js.Object.freeze(js.Array(Assignment, HIT))
  }

  /**
    * Contains both ReviewResult and ReviewAction elements for a particular HIT.
    */
  @js.native
  trait ReviewReport extends js.Object {
    var ReviewActions: js.UndefOr[ReviewActionDetailList]
    var ReviewResults: js.UndefOr[ReviewResultDetailList]
  }

  object ReviewReport {
    @inline
    def apply(
        ReviewActions: js.UndefOr[ReviewActionDetailList] = js.undefined,
        ReviewResults: js.UndefOr[ReviewResultDetailList] = js.undefined
    ): ReviewReport = {
      val __obj = js.Dynamic.literal()
      ReviewActions.foreach(__v => __obj.updateDynamic("ReviewActions")(__v.asInstanceOf[js.Any]))
      ReviewResults.foreach(__v => __obj.updateDynamic("ReviewResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReviewReport]
    }
  }

  /**
    * This data structure is returned multiple times for each result specified in the Review Policy.
    */
  @js.native
  trait ReviewResultDetail extends js.Object {
    var ActionId: js.UndefOr[EntityId]
    var Key: js.UndefOr[String]
    var QuestionId: js.UndefOr[EntityId]
    var SubjectId: js.UndefOr[EntityId]
    var SubjectType: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object ReviewResultDetail {
    @inline
    def apply(
        ActionId: js.UndefOr[EntityId] = js.undefined,
        Key: js.UndefOr[String] = js.undefined,
        QuestionId: js.UndefOr[EntityId] = js.undefined,
        SubjectId: js.UndefOr[EntityId] = js.undefined,
        SubjectType: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): ReviewResultDetail = {
      val __obj = js.Dynamic.literal()
      ActionId.foreach(__v => __obj.updateDynamic("ActionId")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      QuestionId.foreach(__v => __obj.updateDynamic("QuestionId")(__v.asInstanceOf[js.Any]))
      SubjectId.foreach(__v => __obj.updateDynamic("SubjectId")(__v.asInstanceOf[js.Any]))
      SubjectType.foreach(__v => __obj.updateDynamic("SubjectType")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReviewResultDetail]
    }
  }

  @js.native
  sealed trait ReviewableHITStatus extends js.Any
  object ReviewableHITStatus {
    @inline def Reviewable = "Reviewable".asInstanceOf[ReviewableHITStatus]
    @inline def Reviewing = "Reviewing".asInstanceOf[ReviewableHITStatus]

    @inline def values = js.Object.freeze(js.Array(Reviewable, Reviewing))
  }

  @js.native
  trait SendBonusRequest extends js.Object {
    var AssignmentId: EntityId
    var BonusAmount: CurrencyAmount
    var Reason: String
    var WorkerId: CustomerId
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
  }

  object SendBonusRequest {
    @inline
    def apply(
        AssignmentId: EntityId,
        BonusAmount: CurrencyAmount,
        Reason: String,
        WorkerId: CustomerId,
        UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): SendBonusRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any],
        "BonusAmount" -> BonusAmount.asInstanceOf[js.Any],
        "Reason" -> Reason.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any]
      )

      UniqueRequestToken.foreach(__v => __obj.updateDynamic("UniqueRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendBonusRequest]
    }
  }

  @js.native
  trait SendBonusResponse extends js.Object {}

  object SendBonusResponse {
    @inline
    def apply(
    ): SendBonusResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SendBonusResponse]
    }
  }

  @js.native
  trait SendTestEventNotificationRequest extends js.Object {
    var Notification: NotificationSpecification
    var TestEventType: EventType
  }

  object SendTestEventNotificationRequest {
    @inline
    def apply(
        Notification: NotificationSpecification,
        TestEventType: EventType
    ): SendTestEventNotificationRequest = {
      val __obj = js.Dynamic.literal(
        "Notification" -> Notification.asInstanceOf[js.Any],
        "TestEventType" -> TestEventType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendTestEventNotificationRequest]
    }
  }

  @js.native
  trait SendTestEventNotificationResponse extends js.Object {}

  object SendTestEventNotificationResponse {
    @inline
    def apply(
    ): SendTestEventNotificationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SendTestEventNotificationResponse]
    }
  }

  /**
    * Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
    */
  @js.native
  trait ServiceFaultException extends js.Object {
    val Message: ExceptionMessage
    val TurkErrorCode: TurkErrorCode
  }

  @js.native
  trait UpdateExpirationForHITRequest extends js.Object {
    var ExpireAt: Timestamp
    var HITId: EntityId
  }

  object UpdateExpirationForHITRequest {
    @inline
    def apply(
        ExpireAt: Timestamp,
        HITId: EntityId
    ): UpdateExpirationForHITRequest = {
      val __obj = js.Dynamic.literal(
        "ExpireAt" -> ExpireAt.asInstanceOf[js.Any],
        "HITId" -> HITId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateExpirationForHITRequest]
    }
  }

  @js.native
  trait UpdateExpirationForHITResponse extends js.Object {}

  object UpdateExpirationForHITResponse {
    @inline
    def apply(
    ): UpdateExpirationForHITResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateExpirationForHITResponse]
    }
  }

  @js.native
  trait UpdateHITReviewStatusRequest extends js.Object {
    var HITId: EntityId
    var Revert: js.UndefOr[Boolean]
  }

  object UpdateHITReviewStatusRequest {
    @inline
    def apply(
        HITId: EntityId,
        Revert: js.UndefOr[Boolean] = js.undefined
    ): UpdateHITReviewStatusRequest = {
      val __obj = js.Dynamic.literal(
        "HITId" -> HITId.asInstanceOf[js.Any]
      )

      Revert.foreach(__v => __obj.updateDynamic("Revert")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateHITReviewStatusRequest]
    }
  }

  @js.native
  trait UpdateHITReviewStatusResponse extends js.Object {}

  object UpdateHITReviewStatusResponse {
    @inline
    def apply(
    ): UpdateHITReviewStatusResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateHITReviewStatusResponse]
    }
  }

  @js.native
  trait UpdateHITTypeOfHITRequest extends js.Object {
    var HITId: EntityId
    var HITTypeId: EntityId
  }

  object UpdateHITTypeOfHITRequest {
    @inline
    def apply(
        HITId: EntityId,
        HITTypeId: EntityId
    ): UpdateHITTypeOfHITRequest = {
      val __obj = js.Dynamic.literal(
        "HITId" -> HITId.asInstanceOf[js.Any],
        "HITTypeId" -> HITTypeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateHITTypeOfHITRequest]
    }
  }

  @js.native
  trait UpdateHITTypeOfHITResponse extends js.Object {}

  object UpdateHITTypeOfHITResponse {
    @inline
    def apply(
    ): UpdateHITTypeOfHITResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateHITTypeOfHITResponse]
    }
  }

  @js.native
  trait UpdateNotificationSettingsRequest extends js.Object {
    var HITTypeId: EntityId
    var Active: js.UndefOr[Boolean]
    var Notification: js.UndefOr[NotificationSpecification]
  }

  object UpdateNotificationSettingsRequest {
    @inline
    def apply(
        HITTypeId: EntityId,
        Active: js.UndefOr[Boolean] = js.undefined,
        Notification: js.UndefOr[NotificationSpecification] = js.undefined
    ): UpdateNotificationSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "HITTypeId" -> HITTypeId.asInstanceOf[js.Any]
      )

      Active.foreach(__v => __obj.updateDynamic("Active")(__v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.updateDynamic("Notification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNotificationSettingsRequest]
    }
  }

  @js.native
  trait UpdateNotificationSettingsResponse extends js.Object {}

  object UpdateNotificationSettingsResponse {
    @inline
    def apply(
    ): UpdateNotificationSettingsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateNotificationSettingsResponse]
    }
  }

  @js.native
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

  object UpdateQualificationTypeRequest {
    @inline
    def apply(
        QualificationTypeId: EntityId,
        AnswerKey: js.UndefOr[String] = js.undefined,
        AutoGranted: js.UndefOr[Boolean] = js.undefined,
        AutoGrantedValue: js.UndefOr[Int] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined,
        RetryDelayInSeconds: js.UndefOr[Double] = js.undefined,
        Test: js.UndefOr[String] = js.undefined,
        TestDurationInSeconds: js.UndefOr[Double] = js.undefined
    ): UpdateQualificationTypeRequest = {
      val __obj = js.Dynamic.literal(
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any]
      )

      AnswerKey.foreach(__v => __obj.updateDynamic("AnswerKey")(__v.asInstanceOf[js.Any]))
      AutoGranted.foreach(__v => __obj.updateDynamic("AutoGranted")(__v.asInstanceOf[js.Any]))
      AutoGrantedValue.foreach(__v => __obj.updateDynamic("AutoGrantedValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      QualificationTypeStatus.foreach(__v => __obj.updateDynamic("QualificationTypeStatus")(__v.asInstanceOf[js.Any]))
      RetryDelayInSeconds.foreach(__v => __obj.updateDynamic("RetryDelayInSeconds")(__v.asInstanceOf[js.Any]))
      Test.foreach(__v => __obj.updateDynamic("Test")(__v.asInstanceOf[js.Any]))
      TestDurationInSeconds.foreach(__v => __obj.updateDynamic("TestDurationInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQualificationTypeRequest]
    }
  }

  @js.native
  trait UpdateQualificationTypeResponse extends js.Object {
    var QualificationType: js.UndefOr[QualificationType]
  }

  object UpdateQualificationTypeResponse {
    @inline
    def apply(
        QualificationType: js.UndefOr[QualificationType] = js.undefined
    ): UpdateQualificationTypeResponse = {
      val __obj = js.Dynamic.literal()
      QualificationType.foreach(__v => __obj.updateDynamic("QualificationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQualificationTypeResponse]
    }
  }

  /**
    * The WorkerBlock data structure represents a Worker who has been blocked. It has two elements: the WorkerId and the Reason for the block.
    */
  @js.native
  trait WorkerBlock extends js.Object {
    var Reason: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }

  object WorkerBlock {
    @inline
    def apply(
        Reason: js.UndefOr[String] = js.undefined,
        WorkerId: js.UndefOr[CustomerId] = js.undefined
    ): WorkerBlock = {
      val __obj = js.Dynamic.literal()
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      WorkerId.foreach(__v => __obj.updateDynamic("WorkerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkerBlock]
    }
  }
}
