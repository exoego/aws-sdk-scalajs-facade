package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object mturk {
  type AssignmentList = js.Array[Assignment]
  type AssignmentStatus = String
  type AssignmentStatusList = js.Array[AssignmentStatus]
  type BonusPaymentList = js.Array[BonusPayment]
  type Comparator = String
  type CountryParameters = String
  type CurrencyAmount = String
  type CustomerId = String
  type CustomerIdList = js.Array[CustomerId]
  type EntityId = String
  type EventType = String
  type EventTypeList = js.Array[EventType]
  type ExceptionMessage = String
  type HITAccessActions = String
  type HITLayoutParameterList = js.Array[HITLayoutParameter]
  type HITList = js.Array[HIT]
  type HITReviewStatus = String
  type HITStatus = String
  type IdempotencyToken = String
  type IntegerList = js.Array[Int]
  type LocaleList = js.Array[Locale]
  type NotificationTransport = String
  type NotifyWorkersFailureCode = String
  type NotifyWorkersFailureStatusList = js.Array[NotifyWorkersFailureStatus]
  type PaginationToken = String
  type ParameterMapEntryList = js.Array[ParameterMapEntry]
  type PolicyParameterList = js.Array[PolicyParameter]
  type QualificationList = js.Array[Qualification]
  type QualificationRequestList = js.Array[QualificationRequest]
  type QualificationRequirementList = js.Array[QualificationRequirement]
  type QualificationStatus = String
  type QualificationTypeList = js.Array[QualificationType]
  type QualificationTypeStatus = String
  type ResultSize = Int
  type ReviewActionDetailList = js.Array[ReviewActionDetail]
  type ReviewActionStatus = String
  type ReviewPolicyLevel = String
  type ReviewPolicyLevelList = js.Array[ReviewPolicyLevel]
  type ReviewResultDetailList = js.Array[ReviewResultDetail]
  type ReviewableHITStatus = String
  type StringList = js.Array[String]
  type Timestamp = js.Date
  type TurkErrorCode = String
  type WorkerBlockList = js.Array[WorkerBlock]
}

package mturk {
  @js.native
  @JSImport("aws-sdk", "MTurk")
  class MTurk(config: AWSConfig) extends js.Object {
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
    var QualificationRequestId: js.UndefOr[String]
    var IntegerValue: js.UndefOr[Int]
  }

  object AcceptQualificationRequestRequest {
    def apply(
      QualificationRequestId: js.UndefOr[String] = js.undefined,
      IntegerValue: js.UndefOr[Int] = js.undefined): AcceptQualificationRequestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationRequestId" -> QualificationRequestId.map { x => x.asInstanceOf[js.Any] },
        "IntegerValue" -> IntegerValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptQualificationRequestRequest]
    }
  }

  @js.native
  trait AcceptQualificationRequestResponse extends js.Object {

  }

  object AcceptQualificationRequestResponse {
    def apply(): AcceptQualificationRequestResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptQualificationRequestResponse]
    }
  }

  @js.native
  trait ApproveAssignmentRequest extends js.Object {
    var AssignmentId: js.UndefOr[EntityId]
    var RequesterFeedback: js.UndefOr[String]
    var OverrideRejection: js.UndefOr[Boolean]
  }

  object ApproveAssignmentRequest {
    def apply(
      AssignmentId: js.UndefOr[EntityId] = js.undefined,
      RequesterFeedback: js.UndefOr[String] = js.undefined,
      OverrideRejection: js.UndefOr[Boolean] = js.undefined): ApproveAssignmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] },
        "RequesterFeedback" -> RequesterFeedback.map { x => x.asInstanceOf[js.Any] },
        "OverrideRejection" -> OverrideRejection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApproveAssignmentRequest]
    }
  }

  @js.native
  trait ApproveAssignmentResponse extends js.Object {

  }

  object ApproveAssignmentResponse {
    def apply(): ApproveAssignmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApproveAssignmentResponse]
    }
  }

  /**
   * <p> The Assignment data structure represents a single assignment of a HIT to a Worker. The assignment tracks the Worker's efforts to complete the HIT, and contains the results for later retrieval. </p>
   */
  @js.native
  trait Assignment extends js.Object {
    var RequesterFeedback: js.UndefOr[String]
    var SubmitTime: js.UndefOr[Timestamp]
    var RejectionTime: js.UndefOr[Timestamp]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var ApprovalTime: js.UndefOr[Timestamp]
    var AcceptTime: js.UndefOr[Timestamp]
    var HITId: js.UndefOr[EntityId]
    var WorkerId: js.UndefOr[CustomerId]
    var AutoApprovalTime: js.UndefOr[Timestamp]
    var Deadline: js.UndefOr[Timestamp]
    var AssignmentId: js.UndefOr[EntityId]
    var Answer: js.UndefOr[String]
  }

  object Assignment {
    def apply(
      RequesterFeedback: js.UndefOr[String] = js.undefined,
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      RejectionTime: js.UndefOr[Timestamp] = js.undefined,
      AssignmentStatus: js.UndefOr[AssignmentStatus] = js.undefined,
      ApprovalTime: js.UndefOr[Timestamp] = js.undefined,
      AcceptTime: js.UndefOr[Timestamp] = js.undefined,
      HITId: js.UndefOr[EntityId] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      AutoApprovalTime: js.UndefOr[Timestamp] = js.undefined,
      Deadline: js.UndefOr[Timestamp] = js.undefined,
      AssignmentId: js.UndefOr[EntityId] = js.undefined,
      Answer: js.UndefOr[String] = js.undefined): Assignment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequesterFeedback" -> RequesterFeedback.map { x => x.asInstanceOf[js.Any] },
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "RejectionTime" -> RejectionTime.map { x => x.asInstanceOf[js.Any] },
        "AssignmentStatus" -> AssignmentStatus.map { x => x.asInstanceOf[js.Any] },
        "ApprovalTime" -> ApprovalTime.map { x => x.asInstanceOf[js.Any] },
        "AcceptTime" -> AcceptTime.map { x => x.asInstanceOf[js.Any] },
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "AutoApprovalTime" -> AutoApprovalTime.map { x => x.asInstanceOf[js.Any] },
        "Deadline" -> Deadline.map { x => x.asInstanceOf[js.Any] },
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] },
        "Answer" -> Answer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Assignment]
    }
  }

  object AssignmentStatusEnum {
    val Submitted = "Submitted"
    val Approved = "Approved"
    val Rejected = "Rejected"

    val values = IndexedSeq(Submitted, Approved, Rejected)
  }

  @js.native
  trait AssociateQualificationWithWorkerRequest extends js.Object {
    var QualificationTypeId: js.UndefOr[EntityId]
    var WorkerId: js.UndefOr[CustomerId]
    var IntegerValue: js.UndefOr[Int]
    var SendNotification: js.UndefOr[Boolean]
  }

  object AssociateQualificationWithWorkerRequest {
    def apply(
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      IntegerValue: js.UndefOr[Int] = js.undefined,
      SendNotification: js.UndefOr[Boolean] = js.undefined): AssociateQualificationWithWorkerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "IntegerValue" -> IntegerValue.map { x => x.asInstanceOf[js.Any] },
        "SendNotification" -> SendNotification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateQualificationWithWorkerRequest]
    }
  }

  @js.native
  trait AssociateQualificationWithWorkerResponse extends js.Object {

  }

  object AssociateQualificationWithWorkerResponse {
    def apply(): AssociateQualificationWithWorkerResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateQualificationWithWorkerResponse]
    }
  }

  /**
   * <p>An object representing a Bonus payment paid to a Worker.</p>
   */
  @js.native
  trait BonusPayment extends js.Object {
    var Reason: js.UndefOr[String]
    var GrantTime: js.UndefOr[Timestamp]
    var WorkerId: js.UndefOr[CustomerId]
    var BonusAmount: js.UndefOr[CurrencyAmount]
    var AssignmentId: js.UndefOr[EntityId]
  }

  object BonusPayment {
    def apply(
      Reason: js.UndefOr[String] = js.undefined,
      GrantTime: js.UndefOr[Timestamp] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      BonusAmount: js.UndefOr[CurrencyAmount] = js.undefined,
      AssignmentId: js.UndefOr[EntityId] = js.undefined): BonusPayment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] },
        "GrantTime" -> GrantTime.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "BonusAmount" -> BonusAmount.map { x => x.asInstanceOf[js.Any] },
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BonusPayment]
    }
  }

  object ComparatorEnum {
    val LessThan = "LessThan"
    val LessThanOrEqualTo = "LessThanOrEqualTo"
    val GreaterThan = "GreaterThan"
    val GreaterThanOrEqualTo = "GreaterThanOrEqualTo"
    val EqualTo = "EqualTo"
    val NotEqualTo = "NotEqualTo"
    val Exists = "Exists"
    val DoesNotExist = "DoesNotExist"
    val In = "In"
    val NotIn = "NotIn"

    val values = IndexedSeq(LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, NotEqualTo, Exists, DoesNotExist, In, NotIn)
  }

  @js.native
  trait CreateAdditionalAssignmentsForHITRequest extends js.Object {
    var HITId: js.UndefOr[EntityId]
    var NumberOfAdditionalAssignments: js.UndefOr[Int]
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
  }

  object CreateAdditionalAssignmentsForHITRequest {
    def apply(
      HITId: js.UndefOr[EntityId] = js.undefined,
      NumberOfAdditionalAssignments: js.UndefOr[Int] = js.undefined,
      UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined): CreateAdditionalAssignmentsForHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "NumberOfAdditionalAssignments" -> NumberOfAdditionalAssignments.map { x => x.asInstanceOf[js.Any] },
        "UniqueRequestToken" -> UniqueRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAdditionalAssignmentsForHITRequest]
    }
  }

  @js.native
  trait CreateAdditionalAssignmentsForHITResponse extends js.Object {

  }

  object CreateAdditionalAssignmentsForHITResponse {
    def apply(): CreateAdditionalAssignmentsForHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAdditionalAssignmentsForHITResponse]
    }
  }

  @js.native
  trait CreateHITRequest extends js.Object {
    var HITLayoutId: js.UndefOr[EntityId]
    var AssignmentDurationInSeconds: js.UndefOr[Double]
    var Title: js.UndefOr[String]
    var LifetimeInSeconds: js.UndefOr[Double]
    var QualificationRequirements: js.UndefOr[QualificationRequirementList]
    var Question: js.UndefOr[String]
    var HITLayoutParameters: js.UndefOr[HITLayoutParameterList]
    var HITReviewPolicy: js.UndefOr[ReviewPolicy]
    var Description: js.UndefOr[String]
    var MaxAssignments: js.UndefOr[Int]
    var Reward: js.UndefOr[CurrencyAmount]
    var AutoApprovalDelayInSeconds: js.UndefOr[Double]
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
    var Keywords: js.UndefOr[String]
    var RequesterAnnotation: js.UndefOr[String]
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy]
  }

  object CreateHITRequest {
    def apply(
      HITLayoutId: js.UndefOr[EntityId] = js.undefined,
      AssignmentDurationInSeconds: js.UndefOr[Double] = js.undefined,
      Title: js.UndefOr[String] = js.undefined,
      LifetimeInSeconds: js.UndefOr[Double] = js.undefined,
      QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined,
      Question: js.UndefOr[String] = js.undefined,
      HITLayoutParameters: js.UndefOr[HITLayoutParameterList] = js.undefined,
      HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      MaxAssignments: js.UndefOr[Int] = js.undefined,
      Reward: js.UndefOr[CurrencyAmount] = js.undefined,
      AutoApprovalDelayInSeconds: js.UndefOr[Double] = js.undefined,
      UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
      Keywords: js.UndefOr[String] = js.undefined,
      RequesterAnnotation: js.UndefOr[String] = js.undefined,
      AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined): CreateHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITLayoutId" -> HITLayoutId.map { x => x.asInstanceOf[js.Any] },
        "AssignmentDurationInSeconds" -> AssignmentDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "LifetimeInSeconds" -> LifetimeInSeconds.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequirements" -> QualificationRequirements.map { x => x.asInstanceOf[js.Any] },
        "Question" -> Question.map { x => x.asInstanceOf[js.Any] },
        "HITLayoutParameters" -> HITLayoutParameters.map { x => x.asInstanceOf[js.Any] },
        "HITReviewPolicy" -> HITReviewPolicy.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "MaxAssignments" -> MaxAssignments.map { x => x.asInstanceOf[js.Any] },
        "Reward" -> Reward.map { x => x.asInstanceOf[js.Any] },
        "AutoApprovalDelayInSeconds" -> AutoApprovalDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "UniqueRequestToken" -> UniqueRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] },
        "RequesterAnnotation" -> RequesterAnnotation.map { x => x.asInstanceOf[js.Any] },
        "AssignmentReviewPolicy" -> AssignmentReviewPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHITRequest]
    }
  }

  @js.native
  trait CreateHITResponse extends js.Object {
    var HIT: js.UndefOr[HIT]
  }

  object CreateHITResponse {
    def apply(
      HIT: js.UndefOr[HIT] = js.undefined): CreateHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HIT" -> HIT.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHITResponse]
    }
  }

  @js.native
  trait CreateHITTypeRequest extends js.Object {
    var AssignmentDurationInSeconds: js.UndefOr[Double]
    var Title: js.UndefOr[String]
    var QualificationRequirements: js.UndefOr[QualificationRequirementList]
    var Description: js.UndefOr[String]
    var Reward: js.UndefOr[CurrencyAmount]
    var AutoApprovalDelayInSeconds: js.UndefOr[Double]
    var Keywords: js.UndefOr[String]
  }

  object CreateHITTypeRequest {
    def apply(
      AssignmentDurationInSeconds: js.UndefOr[Double] = js.undefined,
      Title: js.UndefOr[String] = js.undefined,
      QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Reward: js.UndefOr[CurrencyAmount] = js.undefined,
      AutoApprovalDelayInSeconds: js.UndefOr[Double] = js.undefined,
      Keywords: js.UndefOr[String] = js.undefined): CreateHITTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentDurationInSeconds" -> AssignmentDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequirements" -> QualificationRequirements.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Reward" -> Reward.map { x => x.asInstanceOf[js.Any] },
        "AutoApprovalDelayInSeconds" -> AutoApprovalDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHITTypeRequest]
    }
  }

  @js.native
  trait CreateHITTypeResponse extends js.Object {
    var HITTypeId: js.UndefOr[EntityId]
  }

  object CreateHITTypeResponse {
    def apply(
      HITTypeId: js.UndefOr[EntityId] = js.undefined): CreateHITTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITTypeId" -> HITTypeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHITTypeResponse]
    }
  }

  @js.native
  trait CreateHITWithHITTypeRequest extends js.Object {
    var HITLayoutId: js.UndefOr[EntityId]
    var HITTypeId: js.UndefOr[EntityId]
    var LifetimeInSeconds: js.UndefOr[Double]
    var Question: js.UndefOr[String]
    var HITLayoutParameters: js.UndefOr[HITLayoutParameterList]
    var HITReviewPolicy: js.UndefOr[ReviewPolicy]
    var MaxAssignments: js.UndefOr[Int]
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
    var RequesterAnnotation: js.UndefOr[String]
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy]
  }

  object CreateHITWithHITTypeRequest {
    def apply(
      HITLayoutId: js.UndefOr[EntityId] = js.undefined,
      HITTypeId: js.UndefOr[EntityId] = js.undefined,
      LifetimeInSeconds: js.UndefOr[Double] = js.undefined,
      Question: js.UndefOr[String] = js.undefined,
      HITLayoutParameters: js.UndefOr[HITLayoutParameterList] = js.undefined,
      HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
      MaxAssignments: js.UndefOr[Int] = js.undefined,
      UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
      RequesterAnnotation: js.UndefOr[String] = js.undefined,
      AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined): CreateHITWithHITTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITLayoutId" -> HITLayoutId.map { x => x.asInstanceOf[js.Any] },
        "HITTypeId" -> HITTypeId.map { x => x.asInstanceOf[js.Any] },
        "LifetimeInSeconds" -> LifetimeInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Question" -> Question.map { x => x.asInstanceOf[js.Any] },
        "HITLayoutParameters" -> HITLayoutParameters.map { x => x.asInstanceOf[js.Any] },
        "HITReviewPolicy" -> HITReviewPolicy.map { x => x.asInstanceOf[js.Any] },
        "MaxAssignments" -> MaxAssignments.map { x => x.asInstanceOf[js.Any] },
        "UniqueRequestToken" -> UniqueRequestToken.map { x => x.asInstanceOf[js.Any] },
        "RequesterAnnotation" -> RequesterAnnotation.map { x => x.asInstanceOf[js.Any] },
        "AssignmentReviewPolicy" -> AssignmentReviewPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHITWithHITTypeRequest]
    }
  }

  @js.native
  trait CreateHITWithHITTypeResponse extends js.Object {
    var HIT: js.UndefOr[HIT]
  }

  object CreateHITWithHITTypeResponse {
    def apply(
      HIT: js.UndefOr[HIT] = js.undefined): CreateHITWithHITTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HIT" -> HIT.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHITWithHITTypeResponse]
    }
  }

  @js.native
  trait CreateQualificationTypeRequest extends js.Object {
    var Name: js.UndefOr[String]
    var QualificationTypeStatus: js.UndefOr[QualificationTypeStatus]
    var Description: js.UndefOr[String]
    var AutoGranted: js.UndefOr[Boolean]
    var Keywords: js.UndefOr[String]
    var TestDurationInSeconds: js.UndefOr[Double]
    var Test: js.UndefOr[String]
    var RetryDelayInSeconds: js.UndefOr[Double]
    var AutoGrantedValue: js.UndefOr[Int]
    var AnswerKey: js.UndefOr[String]
  }

  object CreateQualificationTypeRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AutoGranted: js.UndefOr[Boolean] = js.undefined,
      Keywords: js.UndefOr[String] = js.undefined,
      TestDurationInSeconds: js.UndefOr[Double] = js.undefined,
      Test: js.UndefOr[String] = js.undefined,
      RetryDelayInSeconds: js.UndefOr[Double] = js.undefined,
      AutoGrantedValue: js.UndefOr[Int] = js.undefined,
      AnswerKey: js.UndefOr[String] = js.undefined): CreateQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeStatus" -> QualificationTypeStatus.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "AutoGranted" -> AutoGranted.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] },
        "TestDurationInSeconds" -> TestDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Test" -> Test.map { x => x.asInstanceOf[js.Any] },
        "RetryDelayInSeconds" -> RetryDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "AutoGrantedValue" -> AutoGrantedValue.map { x => x.asInstanceOf[js.Any] },
        "AnswerKey" -> AnswerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQualificationTypeRequest]
    }
  }

  @js.native
  trait CreateQualificationTypeResponse extends js.Object {
    var QualificationType: js.UndefOr[QualificationType]
  }

  object CreateQualificationTypeResponse {
    def apply(
      QualificationType: js.UndefOr[QualificationType] = js.undefined): CreateQualificationTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationType" -> QualificationType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQualificationTypeResponse]
    }
  }

  @js.native
  trait CreateWorkerBlockRequest extends js.Object {
    var WorkerId: js.UndefOr[CustomerId]
    var Reason: js.UndefOr[String]
  }

  object CreateWorkerBlockRequest {
    def apply(
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      Reason: js.UndefOr[String] = js.undefined): CreateWorkerBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkerBlockRequest]
    }
  }

  @js.native
  trait CreateWorkerBlockResponse extends js.Object {

  }

  object CreateWorkerBlockResponse {
    def apply(): CreateWorkerBlockResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkerBlockResponse]
    }
  }

  @js.native
  trait DeleteHITRequest extends js.Object {
    var HITId: js.UndefOr[EntityId]
  }

  object DeleteHITRequest {
    def apply(
      HITId: js.UndefOr[EntityId] = js.undefined): DeleteHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHITRequest]
    }
  }

  @js.native
  trait DeleteHITResponse extends js.Object {

  }

  object DeleteHITResponse {
    def apply(): DeleteHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHITResponse]
    }
  }

  @js.native
  trait DeleteQualificationTypeRequest extends js.Object {
    var QualificationTypeId: js.UndefOr[EntityId]
  }

  object DeleteQualificationTypeRequest {
    def apply(
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined): DeleteQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQualificationTypeRequest]
    }
  }

  @js.native
  trait DeleteQualificationTypeResponse extends js.Object {

  }

  object DeleteQualificationTypeResponse {
    def apply(): DeleteQualificationTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQualificationTypeResponse]
    }
  }

  @js.native
  trait DeleteWorkerBlockRequest extends js.Object {
    var WorkerId: js.UndefOr[CustomerId]
    var Reason: js.UndefOr[String]
  }

  object DeleteWorkerBlockRequest {
    def apply(
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      Reason: js.UndefOr[String] = js.undefined): DeleteWorkerBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkerBlockRequest]
    }
  }

  @js.native
  trait DeleteWorkerBlockResponse extends js.Object {

  }

  object DeleteWorkerBlockResponse {
    def apply(): DeleteWorkerBlockResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkerBlockResponse]
    }
  }

  @js.native
  trait DisassociateQualificationFromWorkerRequest extends js.Object {
    var WorkerId: js.UndefOr[CustomerId]
    var QualificationTypeId: js.UndefOr[EntityId]
    var Reason: js.UndefOr[String]
  }

  object DisassociateQualificationFromWorkerRequest {
    def apply(
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      Reason: js.UndefOr[String] = js.undefined): DisassociateQualificationFromWorkerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateQualificationFromWorkerRequest]
    }
  }

  @js.native
  trait DisassociateQualificationFromWorkerResponse extends js.Object {

  }

  object DisassociateQualificationFromWorkerResponse {
    def apply(): DisassociateQualificationFromWorkerResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateQualificationFromWorkerResponse]
    }
  }

  object EventTypeEnum {
    val AssignmentAccepted = "AssignmentAccepted"
    val AssignmentAbandoned = "AssignmentAbandoned"
    val AssignmentReturned = "AssignmentReturned"
    val AssignmentSubmitted = "AssignmentSubmitted"
    val AssignmentRejected = "AssignmentRejected"
    val AssignmentApproved = "AssignmentApproved"
    val HITCreated = "HITCreated"
    val HITExpired = "HITExpired"
    val HITReviewable = "HITReviewable"
    val HITExtended = "HITExtended"
    val HITDisposed = "HITDisposed"
    val Ping = "Ping"

    val values = IndexedSeq(AssignmentAccepted, AssignmentAbandoned, AssignmentReturned, AssignmentSubmitted, AssignmentRejected, AssignmentApproved, HITCreated, HITExpired, HITReviewable, HITExtended, HITDisposed, Ping)
  }

  @js.native
  trait GetAccountBalanceRequest extends js.Object {

  }

  object GetAccountBalanceRequest {
    def apply(): GetAccountBalanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountBalanceRequest]
    }
  }

  @js.native
  trait GetAccountBalanceResponse extends js.Object {
    var AvailableBalance: js.UndefOr[CurrencyAmount]
    var OnHoldBalance: js.UndefOr[CurrencyAmount]
  }

  object GetAccountBalanceResponse {
    def apply(
      AvailableBalance: js.UndefOr[CurrencyAmount] = js.undefined,
      OnHoldBalance: js.UndefOr[CurrencyAmount] = js.undefined): GetAccountBalanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailableBalance" -> AvailableBalance.map { x => x.asInstanceOf[js.Any] },
        "OnHoldBalance" -> OnHoldBalance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountBalanceResponse]
    }
  }

  @js.native
  trait GetAssignmentRequest extends js.Object {
    var AssignmentId: js.UndefOr[EntityId]
  }

  object GetAssignmentRequest {
    def apply(
      AssignmentId: js.UndefOr[EntityId] = js.undefined): GetAssignmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAssignmentRequest]
    }
  }

  @js.native
  trait GetAssignmentResponse extends js.Object {
    var Assignment: js.UndefOr[Assignment]
    var HIT: js.UndefOr[HIT]
  }

  object GetAssignmentResponse {
    def apply(
      Assignment: js.UndefOr[Assignment] = js.undefined,
      HIT: js.UndefOr[HIT] = js.undefined): GetAssignmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Assignment" -> Assignment.map { x => x.asInstanceOf[js.Any] },
        "HIT" -> HIT.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAssignmentResponse]
    }
  }

  @js.native
  trait GetFileUploadURLRequest extends js.Object {
    var AssignmentId: js.UndefOr[EntityId]
    var QuestionIdentifier: js.UndefOr[String]
  }

  object GetFileUploadURLRequest {
    def apply(
      AssignmentId: js.UndefOr[EntityId] = js.undefined,
      QuestionIdentifier: js.UndefOr[String] = js.undefined): GetFileUploadURLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] },
        "QuestionIdentifier" -> QuestionIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFileUploadURLRequest]
    }
  }

  @js.native
  trait GetFileUploadURLResponse extends js.Object {
    var FileUploadURL: js.UndefOr[String]
  }

  object GetFileUploadURLResponse {
    def apply(
      FileUploadURL: js.UndefOr[String] = js.undefined): GetFileUploadURLResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileUploadURL" -> FileUploadURL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFileUploadURLResponse]
    }
  }

  @js.native
  trait GetHITRequest extends js.Object {
    var HITId: js.UndefOr[EntityId]
  }

  object GetHITRequest {
    def apply(
      HITId: js.UndefOr[EntityId] = js.undefined): GetHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHITRequest]
    }
  }

  @js.native
  trait GetHITResponse extends js.Object {
    var HIT: js.UndefOr[HIT]
  }

  object GetHITResponse {
    def apply(
      HIT: js.UndefOr[HIT] = js.undefined): GetHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HIT" -> HIT.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHITResponse]
    }
  }

  @js.native
  trait GetQualificationScoreRequest extends js.Object {
    var QualificationTypeId: js.UndefOr[EntityId]
    var WorkerId: js.UndefOr[CustomerId]
  }

  object GetQualificationScoreRequest {
    def apply(
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined): GetQualificationScoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQualificationScoreRequest]
    }
  }

  @js.native
  trait GetQualificationScoreResponse extends js.Object {
    var Qualification: js.UndefOr[Qualification]
  }

  object GetQualificationScoreResponse {
    def apply(
      Qualification: js.UndefOr[Qualification] = js.undefined): GetQualificationScoreResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Qualification" -> Qualification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQualificationScoreResponse]
    }
  }

  @js.native
  trait GetQualificationTypeRequest extends js.Object {
    var QualificationTypeId: js.UndefOr[EntityId]
  }

  object GetQualificationTypeRequest {
    def apply(
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined): GetQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQualificationTypeRequest]
    }
  }

  @js.native
  trait GetQualificationTypeResponse extends js.Object {
    var QualificationType: js.UndefOr[QualificationType]
  }

  object GetQualificationTypeResponse {
    def apply(
      QualificationType: js.UndefOr[QualificationType] = js.undefined): GetQualificationTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationType" -> QualificationType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQualificationTypeResponse]
    }
  }

  /**
   * <p> The HIT data structure represents a single HIT, including all the information necessary for a Worker to accept and complete the HIT.</p>
   */
  @js.native
  trait HIT extends js.Object {
    var HITLayoutId: js.UndefOr[EntityId]
    var AssignmentDurationInSeconds: js.UndefOr[Double]
    var Title: js.UndefOr[String]
    var HITTypeId: js.UndefOr[EntityId]
    var NumberOfAssignmentsCompleted: js.UndefOr[Int]
    var QualificationRequirements: js.UndefOr[QualificationRequirementList]
    var Question: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var MaxAssignments: js.UndefOr[Int]
    var Reward: js.UndefOr[CurrencyAmount]
    var NumberOfAssignmentsAvailable: js.UndefOr[Int]
    var AutoApprovalDelayInSeconds: js.UndefOr[Double]
    var HITStatus: js.UndefOr[HITStatus]
    var HITId: js.UndefOr[EntityId]
    var NumberOfAssignmentsPending: js.UndefOr[Int]
    var Keywords: js.UndefOr[String]
    var Expiration: js.UndefOr[Timestamp]
    var HITGroupId: js.UndefOr[EntityId]
    var HITReviewStatus: js.UndefOr[HITReviewStatus]
    var RequesterAnnotation: js.UndefOr[String]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object HIT {
    def apply(
      HITLayoutId: js.UndefOr[EntityId] = js.undefined,
      AssignmentDurationInSeconds: js.UndefOr[Double] = js.undefined,
      Title: js.UndefOr[String] = js.undefined,
      HITTypeId: js.UndefOr[EntityId] = js.undefined,
      NumberOfAssignmentsCompleted: js.UndefOr[Int] = js.undefined,
      QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined,
      Question: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      MaxAssignments: js.UndefOr[Int] = js.undefined,
      Reward: js.UndefOr[CurrencyAmount] = js.undefined,
      NumberOfAssignmentsAvailable: js.UndefOr[Int] = js.undefined,
      AutoApprovalDelayInSeconds: js.UndefOr[Double] = js.undefined,
      HITStatus: js.UndefOr[HITStatus] = js.undefined,
      HITId: js.UndefOr[EntityId] = js.undefined,
      NumberOfAssignmentsPending: js.UndefOr[Int] = js.undefined,
      Keywords: js.UndefOr[String] = js.undefined,
      Expiration: js.UndefOr[Timestamp] = js.undefined,
      HITGroupId: js.UndefOr[EntityId] = js.undefined,
      HITReviewStatus: js.UndefOr[HITReviewStatus] = js.undefined,
      RequesterAnnotation: js.UndefOr[String] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): HIT = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITLayoutId" -> HITLayoutId.map { x => x.asInstanceOf[js.Any] },
        "AssignmentDurationInSeconds" -> AssignmentDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "HITTypeId" -> HITTypeId.map { x => x.asInstanceOf[js.Any] },
        "NumberOfAssignmentsCompleted" -> NumberOfAssignmentsCompleted.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequirements" -> QualificationRequirements.map { x => x.asInstanceOf[js.Any] },
        "Question" -> Question.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "MaxAssignments" -> MaxAssignments.map { x => x.asInstanceOf[js.Any] },
        "Reward" -> Reward.map { x => x.asInstanceOf[js.Any] },
        "NumberOfAssignmentsAvailable" -> NumberOfAssignmentsAvailable.map { x => x.asInstanceOf[js.Any] },
        "AutoApprovalDelayInSeconds" -> AutoApprovalDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "HITStatus" -> HITStatus.map { x => x.asInstanceOf[js.Any] },
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "NumberOfAssignmentsPending" -> NumberOfAssignmentsPending.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "HITGroupId" -> HITGroupId.map { x => x.asInstanceOf[js.Any] },
        "HITReviewStatus" -> HITReviewStatus.map { x => x.asInstanceOf[js.Any] },
        "RequesterAnnotation" -> RequesterAnnotation.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HIT]
    }
  }

  object HITAccessActionsEnum {
    val Accept = "Accept"
    val PreviewAndAccept = "PreviewAndAccept"
    val DiscoverPreviewAndAccept = "DiscoverPreviewAndAccept"

    val values = IndexedSeq(Accept, PreviewAndAccept, DiscoverPreviewAndAccept)
  }

  /**
   * <p> The HITLayoutParameter data structure defines parameter values used with a HITLayout. A HITLayout is a reusable Amazon Mechanical Turk project template used to provide Human Intelligence Task (HIT) question data for CreateHIT. </p>
   */
  @js.native
  trait HITLayoutParameter extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object HITLayoutParameter {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): HITLayoutParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HITLayoutParameter]
    }
  }

  object HITReviewStatusEnum {
    val NotReviewed = "NotReviewed"
    val MarkedForReview = "MarkedForReview"
    val ReviewedAppropriate = "ReviewedAppropriate"
    val ReviewedInappropriate = "ReviewedInappropriate"

    val values = IndexedSeq(NotReviewed, MarkedForReview, ReviewedAppropriate, ReviewedInappropriate)
  }

  object HITStatusEnum {
    val Assignable = "Assignable"
    val Unassignable = "Unassignable"
    val Reviewable = "Reviewable"
    val Reviewing = "Reviewing"
    val Disposed = "Disposed"

    val values = IndexedSeq(Assignable, Unassignable, Reviewable, Reviewing, Disposed)
  }

  @js.native
  trait ListAssignmentsForHITRequest extends js.Object {
    var HITId: js.UndefOr[EntityId]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[ResultSize]
    var AssignmentStatuses: js.UndefOr[AssignmentStatusList]
  }

  object ListAssignmentsForHITRequest {
    def apply(
      HITId: js.UndefOr[EntityId] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      AssignmentStatuses: js.UndefOr[AssignmentStatusList] = js.undefined): ListAssignmentsForHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "AssignmentStatuses" -> AssignmentStatuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssignmentsForHITRequest]
    }
  }

  @js.native
  trait ListAssignmentsForHITResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var Assignments: js.UndefOr[AssignmentList]
  }

  object ListAssignmentsForHITResponse {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined,
      Assignments: js.UndefOr[AssignmentList] = js.undefined): ListAssignmentsForHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "Assignments" -> Assignments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssignmentsForHITResponse]
    }
  }

  @js.native
  trait ListBonusPaymentsRequest extends js.Object {
    var HITId: js.UndefOr[EntityId]
    var AssignmentId: js.UndefOr[EntityId]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[ResultSize]
  }

  object ListBonusPaymentsRequest {
    def apply(
      HITId: js.UndefOr[EntityId] = js.undefined,
      AssignmentId: js.UndefOr[EntityId] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined): ListBonusPaymentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBonusPaymentsRequest]
    }
  }

  @js.native
  trait ListBonusPaymentsResponse extends js.Object {
    var NumResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[PaginationToken]
    var BonusPayments: js.UndefOr[BonusPaymentList]
  }

  object ListBonusPaymentsResponse {
    def apply(
      NumResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      BonusPayments: js.UndefOr[BonusPaymentList] = js.undefined): ListBonusPaymentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "BonusPayments" -> BonusPayments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBonusPaymentsResponse]
    }
  }

  @js.native
  trait ListHITsForQualificationTypeRequest extends js.Object {
    var QualificationTypeId: js.UndefOr[EntityId]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[ResultSize]
  }

  object ListHITsForQualificationTypeRequest {
    def apply(
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined): ListHITsForQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHITsForQualificationTypeRequest]
    }
  }

  @js.native
  trait ListHITsForQualificationTypeResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var HITs: js.UndefOr[HITList]
  }

  object ListHITsForQualificationTypeResponse {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined,
      HITs: js.UndefOr[HITList] = js.undefined): ListHITsForQualificationTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "HITs" -> HITs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHITsForQualificationTypeResponse]
    }
  }

  @js.native
  trait ListHITsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[ResultSize]
  }

  object ListHITsRequest {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined): ListHITsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHITsRequest]
    }
  }

  @js.native
  trait ListHITsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var HITs: js.UndefOr[HITList]
  }

  object ListHITsResponse {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined,
      HITs: js.UndefOr[HITList] = js.undefined): ListHITsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "HITs" -> HITs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHITsResponse]
    }
  }

  @js.native
  trait ListQualificationRequestsRequest extends js.Object {
    var QualificationTypeId: js.UndefOr[EntityId]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[ResultSize]
  }

  object ListQualificationRequestsRequest {
    def apply(
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined): ListQualificationRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQualificationRequestsRequest]
    }
  }

  @js.native
  trait ListQualificationRequestsResponse extends js.Object {
    var NumResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[PaginationToken]
    var QualificationRequests: js.UndefOr[QualificationRequestList]
  }

  object ListQualificationRequestsResponse {
    def apply(
      NumResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      QualificationRequests: js.UndefOr[QualificationRequestList] = js.undefined): ListQualificationRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequests" -> QualificationRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQualificationRequestsResponse]
    }
  }

  @js.native
  trait ListQualificationTypesRequest extends js.Object {
    var MustBeRequestable: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[ResultSize]
    var Query: js.UndefOr[String]
    var MustBeOwnedByCaller: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListQualificationTypesRequest {
    def apply(
      MustBeRequestable: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      Query: js.UndefOr[String] = js.undefined,
      MustBeOwnedByCaller: js.UndefOr[Boolean] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListQualificationTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MustBeRequestable" -> MustBeRequestable.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Query" -> Query.map { x => x.asInstanceOf[js.Any] },
        "MustBeOwnedByCaller" -> MustBeOwnedByCaller.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQualificationTypesRequest]
    }
  }

  @js.native
  trait ListQualificationTypesResponse extends js.Object {
    var NumResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[PaginationToken]
    var QualificationTypes: js.UndefOr[QualificationTypeList]
  }

  object ListQualificationTypesResponse {
    def apply(
      NumResults: js.UndefOr[Int] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      QualificationTypes: js.UndefOr[QualificationTypeList] = js.undefined): ListQualificationTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypes" -> QualificationTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQualificationTypesResponse]
    }
  }

  @js.native
  trait ListReviewPolicyResultsForHITRequest extends js.Object {
    var PolicyLevels: js.UndefOr[ReviewPolicyLevelList]
    var RetrieveResults: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[ResultSize]
    var HITId: js.UndefOr[EntityId]
    var RetrieveActions: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListReviewPolicyResultsForHITRequest {
    def apply(
      PolicyLevels: js.UndefOr[ReviewPolicyLevelList] = js.undefined,
      RetrieveResults: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      HITId: js.UndefOr[EntityId] = js.undefined,
      RetrieveActions: js.UndefOr[Boolean] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListReviewPolicyResultsForHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyLevels" -> PolicyLevels.map { x => x.asInstanceOf[js.Any] },
        "RetrieveResults" -> RetrieveResults.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "RetrieveActions" -> RetrieveActions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReviewPolicyResultsForHITRequest]
    }
  }

  @js.native
  trait ListReviewPolicyResultsForHITResponse extends js.Object {
    var HITReviewPolicy: js.UndefOr[ReviewPolicy]
    var AssignmentReviewReport: js.UndefOr[ReviewReport]
    var HITId: js.UndefOr[EntityId]
    var HITReviewReport: js.UndefOr[ReviewReport]
    var NextToken: js.UndefOr[PaginationToken]
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy]
  }

  object ListReviewPolicyResultsForHITResponse {
    def apply(
      HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
      AssignmentReviewReport: js.UndefOr[ReviewReport] = js.undefined,
      HITId: js.UndefOr[EntityId] = js.undefined,
      HITReviewReport: js.UndefOr[ReviewReport] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined): ListReviewPolicyResultsForHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITReviewPolicy" -> HITReviewPolicy.map { x => x.asInstanceOf[js.Any] },
        "AssignmentReviewReport" -> AssignmentReviewReport.map { x => x.asInstanceOf[js.Any] },
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "HITReviewReport" -> HITReviewReport.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "AssignmentReviewPolicy" -> AssignmentReviewPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReviewPolicyResultsForHITResponse]
    }
  }

  @js.native
  trait ListReviewableHITsRequest extends js.Object {
    var HITTypeId: js.UndefOr[EntityId]
    var Status: js.UndefOr[ReviewableHITStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[ResultSize]
  }

  object ListReviewableHITsRequest {
    def apply(
      HITTypeId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[ReviewableHITStatus] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined): ListReviewableHITsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITTypeId" -> HITTypeId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReviewableHITsRequest]
    }
  }

  @js.native
  trait ListReviewableHITsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var HITs: js.UndefOr[HITList]
  }

  object ListReviewableHITsResponse {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined,
      HITs: js.UndefOr[HITList] = js.undefined): ListReviewableHITsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "HITs" -> HITs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReviewableHITsResponse]
    }
  }

  @js.native
  trait ListWorkerBlocksRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[ResultSize]
  }

  object ListWorkerBlocksRequest {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined): ListWorkerBlocksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkerBlocksRequest]
    }
  }

  @js.native
  trait ListWorkerBlocksResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var WorkerBlocks: js.UndefOr[WorkerBlockList]
  }

  object ListWorkerBlocksResponse {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined,
      WorkerBlocks: js.UndefOr[WorkerBlockList] = js.undefined): ListWorkerBlocksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "WorkerBlocks" -> WorkerBlocks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkerBlocksResponse]
    }
  }

  @js.native
  trait ListWorkersWithQualificationTypeRequest extends js.Object {
    var QualificationTypeId: js.UndefOr[EntityId]
    var Status: js.UndefOr[QualificationStatus]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[ResultSize]
  }

  object ListWorkersWithQualificationTypeRequest {
    def apply(
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[QualificationStatus] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined): ListWorkersWithQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkersWithQualificationTypeRequest]
    }
  }

  @js.native
  trait ListWorkersWithQualificationTypeResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var Qualifications: js.UndefOr[QualificationList]
  }

  object ListWorkersWithQualificationTypeResponse {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined,
      Qualifications: js.UndefOr[QualificationList] = js.undefined): ListWorkersWithQualificationTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "Qualifications" -> Qualifications.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkersWithQualificationTypeResponse]
    }
  }

  /**
   * <p>The Locale data structure represents a geographical region or location.</p>
   */
  @js.native
  trait Locale extends js.Object {
    var Country: js.UndefOr[CountryParameters]
    var Subdivision: js.UndefOr[CountryParameters]
  }

  object Locale {
    def apply(
      Country: js.UndefOr[CountryParameters] = js.undefined,
      Subdivision: js.UndefOr[CountryParameters] = js.undefined): Locale = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Country" -> Country.map { x => x.asInstanceOf[js.Any] },
        "Subdivision" -> Subdivision.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Locale]
    }
  }

  /**
   * <p>The NotificationSpecification data structure describes a HIT event notification for a HIT type.</p>
   */
  @js.native
  trait NotificationSpecification extends js.Object {
    var Destination: js.UndefOr[String]
    var Transport: js.UndefOr[NotificationTransport]
    var Version: js.UndefOr[String]
    var EventTypes: js.UndefOr[EventTypeList]
  }

  object NotificationSpecification {
    def apply(
      Destination: js.UndefOr[String] = js.undefined,
      Transport: js.UndefOr[NotificationTransport] = js.undefined,
      Version: js.UndefOr[String] = js.undefined,
      EventTypes: js.UndefOr[EventTypeList] = js.undefined): NotificationSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "Transport" -> Transport.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "EventTypes" -> EventTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationSpecification]
    }
  }

  object NotificationTransportEnum {
    val Email = "Email"
    val SQS = "SQS"
    val SNS = "SNS"

    val values = IndexedSeq(Email, SQS, SNS)
  }

  object NotifyWorkersFailureCodeEnum {
    val SoftFailure = "SoftFailure"
    val HardFailure = "HardFailure"

    val values = IndexedSeq(SoftFailure, HardFailure)
  }

  /**
   * <p> When MTurk encounters an issue with notifying the Workers you specified, it returns back this object with failure details. </p>
   */
  @js.native
  trait NotifyWorkersFailureStatus extends js.Object {
    var NotifyWorkersFailureCode: js.UndefOr[NotifyWorkersFailureCode]
    var NotifyWorkersFailureMessage: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }

  object NotifyWorkersFailureStatus {
    def apply(
      NotifyWorkersFailureCode: js.UndefOr[NotifyWorkersFailureCode] = js.undefined,
      NotifyWorkersFailureMessage: js.UndefOr[String] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined): NotifyWorkersFailureStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotifyWorkersFailureCode" -> NotifyWorkersFailureCode.map { x => x.asInstanceOf[js.Any] },
        "NotifyWorkersFailureMessage" -> NotifyWorkersFailureMessage.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyWorkersFailureStatus]
    }
  }

  @js.native
  trait NotifyWorkersRequest extends js.Object {
    var Subject: js.UndefOr[String]
    var MessageText: js.UndefOr[String]
    var WorkerIds: js.UndefOr[CustomerIdList]
  }

  object NotifyWorkersRequest {
    def apply(
      Subject: js.UndefOr[String] = js.undefined,
      MessageText: js.UndefOr[String] = js.undefined,
      WorkerIds: js.UndefOr[CustomerIdList] = js.undefined): NotifyWorkersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subject" -> Subject.map { x => x.asInstanceOf[js.Any] },
        "MessageText" -> MessageText.map { x => x.asInstanceOf[js.Any] },
        "WorkerIds" -> WorkerIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyWorkersRequest]
    }
  }

  @js.native
  trait NotifyWorkersResponse extends js.Object {
    var NotifyWorkersFailureStatuses: js.UndefOr[NotifyWorkersFailureStatusList]
  }

  object NotifyWorkersResponse {
    def apply(
      NotifyWorkersFailureStatuses: js.UndefOr[NotifyWorkersFailureStatusList] = js.undefined): NotifyWorkersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NotifyWorkersFailureStatuses" -> NotifyWorkersFailureStatuses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyWorkersResponse]
    }
  }

  /**
   * <p> This data structure is the data type for the AnswerKey parameter of the ScoreMyKnownAnswers/2011-09-01 Review Policy. </p>
   */
  @js.native
  trait ParameterMapEntry extends js.Object {
    var Key: js.UndefOr[String]
    var Values: js.UndefOr[StringList]
  }

  object ParameterMapEntry {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[StringList] = js.undefined): ParameterMapEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterMapEntry]
    }
  }

  /**
   * <p> Name of the parameter from the Review policy. </p>
   */
  @js.native
  trait PolicyParameter extends js.Object {
    var Key: js.UndefOr[String]
    var Values: js.UndefOr[StringList]
    var MapEntries: js.UndefOr[ParameterMapEntryList]
  }

  object PolicyParameter {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[StringList] = js.undefined,
      MapEntries: js.UndefOr[ParameterMapEntryList] = js.undefined): PolicyParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] },
        "MapEntries" -> MapEntries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyParameter]
    }
  }

  /**
   * <p>The Qualification data structure represents a Qualification assigned to a user, including the Qualification type and the value (score).</p>
   */
  @js.native
  trait Qualification extends js.Object {
    var IntegerValue: js.UndefOr[Int]
    var GrantTime: js.UndefOr[Timestamp]
    var QualificationTypeId: js.UndefOr[EntityId]
    var LocaleValue: js.UndefOr[Locale]
    var WorkerId: js.UndefOr[CustomerId]
    var Status: js.UndefOr[QualificationStatus]
  }

  object Qualification {
    def apply(
      IntegerValue: js.UndefOr[Int] = js.undefined,
      GrantTime: js.UndefOr[Timestamp] = js.undefined,
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      LocaleValue: js.UndefOr[Locale] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      Status: js.UndefOr[QualificationStatus] = js.undefined): Qualification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IntegerValue" -> IntegerValue.map { x => x.asInstanceOf[js.Any] },
        "GrantTime" -> GrantTime.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "LocaleValue" -> LocaleValue.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Qualification]
    }
  }

  /**
   * <p> The QualificationRequest data structure represents a request a Worker has made for a Qualification. </p>
   */
  @js.native
  trait QualificationRequest extends js.Object {
    var SubmitTime: js.UndefOr[Timestamp]
    var QualificationRequestId: js.UndefOr[String]
    var QualificationTypeId: js.UndefOr[EntityId]
    var Test: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
    var Answer: js.UndefOr[String]
  }

  object QualificationRequest {
    def apply(
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      QualificationRequestId: js.UndefOr[String] = js.undefined,
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      Test: js.UndefOr[String] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      Answer: js.UndefOr[String] = js.undefined): QualificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequestId" -> QualificationRequestId.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "Test" -> Test.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "Answer" -> Answer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QualificationRequest]
    }
  }

  /**
   * <p> The QualificationRequirement data structure describes a Qualification that a Worker must have before the Worker is allowed to accept a HIT. A requirement may optionally state that a Worker must have the Qualification in order to preview the HIT, or see the HIT in search results. </p>
   */
  @js.native
  trait QualificationRequirement extends js.Object {
    var LocaleValues: js.UndefOr[LocaleList]
    var RequiredToPreview: js.UndefOr[Boolean]
    var QualificationTypeId: js.UndefOr[String]
    var ActionsGuarded: js.UndefOr[HITAccessActions]
    var Comparator: js.UndefOr[Comparator]
    var IntegerValues: js.UndefOr[IntegerList]
  }

  object QualificationRequirement {
    def apply(
      LocaleValues: js.UndefOr[LocaleList] = js.undefined,
      RequiredToPreview: js.UndefOr[Boolean] = js.undefined,
      QualificationTypeId: js.UndefOr[String] = js.undefined,
      ActionsGuarded: js.UndefOr[HITAccessActions] = js.undefined,
      Comparator: js.UndefOr[Comparator] = js.undefined,
      IntegerValues: js.UndefOr[IntegerList] = js.undefined): QualificationRequirement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocaleValues" -> LocaleValues.map { x => x.asInstanceOf[js.Any] },
        "RequiredToPreview" -> RequiredToPreview.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "ActionsGuarded" -> ActionsGuarded.map { x => x.asInstanceOf[js.Any] },
        "Comparator" -> Comparator.map { x => x.asInstanceOf[js.Any] },
        "IntegerValues" -> IntegerValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QualificationRequirement]
    }
  }

  object QualificationStatusEnum {
    val Granted = "Granted"
    val Revoked = "Revoked"

    val values = IndexedSeq(Granted, Revoked)
  }

  /**
   * <p> The QualificationType data structure represents a Qualification type, a description of a property of a Worker that must match the requirements of a HIT for the Worker to be able to accept the HIT. The type also describes how a Worker can obtain a Qualification of that type, such as through a Qualification test. </p>
   */
  @js.native
  trait QualificationType extends js.Object {
    var Name: js.UndefOr[String]
    var QualificationTypeStatus: js.UndefOr[QualificationTypeStatus]
    var IsRequestable: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var QualificationTypeId: js.UndefOr[EntityId]
    var AutoGranted: js.UndefOr[Boolean]
    var Keywords: js.UndefOr[String]
    var TestDurationInSeconds: js.UndefOr[Double]
    var Test: js.UndefOr[String]
    var RetryDelayInSeconds: js.UndefOr[Double]
    var AutoGrantedValue: js.UndefOr[Int]
    var AnswerKey: js.UndefOr[String]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object QualificationType {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined,
      IsRequestable: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      AutoGranted: js.UndefOr[Boolean] = js.undefined,
      Keywords: js.UndefOr[String] = js.undefined,
      TestDurationInSeconds: js.UndefOr[Double] = js.undefined,
      Test: js.UndefOr[String] = js.undefined,
      RetryDelayInSeconds: js.UndefOr[Double] = js.undefined,
      AutoGrantedValue: js.UndefOr[Int] = js.undefined,
      AnswerKey: js.UndefOr[String] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): QualificationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeStatus" -> QualificationTypeStatus.map { x => x.asInstanceOf[js.Any] },
        "IsRequestable" -> IsRequestable.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "AutoGranted" -> AutoGranted.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] },
        "TestDurationInSeconds" -> TestDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Test" -> Test.map { x => x.asInstanceOf[js.Any] },
        "RetryDelayInSeconds" -> RetryDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "AutoGrantedValue" -> AutoGrantedValue.map { x => x.asInstanceOf[js.Any] },
        "AnswerKey" -> AnswerKey.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QualificationType]
    }
  }

  object QualificationTypeStatusEnum {
    val Active = "Active"
    val Inactive = "Inactive"

    val values = IndexedSeq(Active, Inactive)
  }

  @js.native
  trait RejectAssignmentRequest extends js.Object {
    var AssignmentId: js.UndefOr[EntityId]
    var RequesterFeedback: js.UndefOr[String]
  }

  object RejectAssignmentRequest {
    def apply(
      AssignmentId: js.UndefOr[EntityId] = js.undefined,
      RequesterFeedback: js.UndefOr[String] = js.undefined): RejectAssignmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] },
        "RequesterFeedback" -> RequesterFeedback.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectAssignmentRequest]
    }
  }

  @js.native
  trait RejectAssignmentResponse extends js.Object {

  }

  object RejectAssignmentResponse {
    def apply(): RejectAssignmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectAssignmentResponse]
    }
  }

  @js.native
  trait RejectQualificationRequestRequest extends js.Object {
    var QualificationRequestId: js.UndefOr[String]
    var Reason: js.UndefOr[String]
  }

  object RejectQualificationRequestRequest {
    def apply(
      QualificationRequestId: js.UndefOr[String] = js.undefined,
      Reason: js.UndefOr[String] = js.undefined): RejectQualificationRequestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationRequestId" -> QualificationRequestId.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectQualificationRequestRequest]
    }
  }

  @js.native
  trait RejectQualificationRequestResponse extends js.Object {

  }

  object RejectQualificationRequestResponse {
    def apply(): RejectQualificationRequestResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectQualificationRequestResponse]
    }
  }

  /**
   * <p>Your request is invalid.</p>
   */
  @js.native
  trait RequestErrorException extends js.Object {
    val Message: ExceptionMessage
    val TurkErrorCode: TurkErrorCode
  }

  /**
   * <p> Both the AssignmentReviewReport and the HITReviewReport elements contains the ReviewActionDetail data structure. This structure is returned multiple times for each action specified in the Review Policy. </p>
   */
  @js.native
  trait ReviewActionDetail extends js.Object {
    var TargetType: js.UndefOr[String]
    var TargetId: js.UndefOr[EntityId]
    var CompleteTime: js.UndefOr[Timestamp]
    var ErrorCode: js.UndefOr[String]
    var ActionId: js.UndefOr[EntityId]
    var ActionName: js.UndefOr[String]
    var Result: js.UndefOr[String]
    var Status: js.UndefOr[ReviewActionStatus]
  }

  object ReviewActionDetail {
    def apply(
      TargetType: js.UndefOr[String] = js.undefined,
      TargetId: js.UndefOr[EntityId] = js.undefined,
      CompleteTime: js.UndefOr[Timestamp] = js.undefined,
      ErrorCode: js.UndefOr[String] = js.undefined,
      ActionId: js.UndefOr[EntityId] = js.undefined,
      ActionName: js.UndefOr[String] = js.undefined,
      Result: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[ReviewActionStatus] = js.undefined): ReviewActionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "TargetId" -> TargetId.map { x => x.asInstanceOf[js.Any] },
        "CompleteTime" -> CompleteTime.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ActionId" -> ActionId.map { x => x.asInstanceOf[js.Any] },
        "ActionName" -> ActionName.map { x => x.asInstanceOf[js.Any] },
        "Result" -> Result.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReviewActionDetail]
    }
  }

  object ReviewActionStatusEnum {
    val Intended = "Intended"
    val Succeeded = "Succeeded"
    val Failed = "Failed"
    val Cancelled = "Cancelled"

    val values = IndexedSeq(Intended, Succeeded, Failed, Cancelled)
  }

  /**
   * <p> HIT Review Policy data structures represent HIT review policies, which you specify when you create a HIT. </p>
   */
  @js.native
  trait ReviewPolicy extends js.Object {
    var PolicyName: js.UndefOr[String]
    var Parameters: js.UndefOr[PolicyParameterList]
  }

  object ReviewPolicy {
    def apply(
      PolicyName: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[PolicyParameterList] = js.undefined): ReviewPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReviewPolicy]
    }
  }

  object ReviewPolicyLevelEnum {
    val Assignment = "Assignment"
    val HIT = "HIT"

    val values = IndexedSeq(Assignment, HIT)
  }

  /**
   * <p> Contains both ReviewResult and ReviewAction elements for a particular HIT. </p>
   */
  @js.native
  trait ReviewReport extends js.Object {
    var ReviewResults: js.UndefOr[ReviewResultDetailList]
    var ReviewActions: js.UndefOr[ReviewActionDetailList]
  }

  object ReviewReport {
    def apply(
      ReviewResults: js.UndefOr[ReviewResultDetailList] = js.undefined,
      ReviewActions: js.UndefOr[ReviewActionDetailList] = js.undefined): ReviewReport = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReviewResults" -> ReviewResults.map { x => x.asInstanceOf[js.Any] },
        "ReviewActions" -> ReviewActions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReviewReport]
    }
  }

  /**
   * <p> This data structure is returned multiple times for each result specified in the Review Policy. </p>
   */
  @js.native
  trait ReviewResultDetail extends js.Object {
    var QuestionId: js.UndefOr[EntityId]
    var SubjectType: js.UndefOr[String]
    var Value: js.UndefOr[String]
    var ActionId: js.UndefOr[EntityId]
    var SubjectId: js.UndefOr[EntityId]
    var Key: js.UndefOr[String]
  }

  object ReviewResultDetail {
    def apply(
      QuestionId: js.UndefOr[EntityId] = js.undefined,
      SubjectType: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      ActionId: js.UndefOr[EntityId] = js.undefined,
      SubjectId: js.UndefOr[EntityId] = js.undefined,
      Key: js.UndefOr[String] = js.undefined): ReviewResultDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QuestionId" -> QuestionId.map { x => x.asInstanceOf[js.Any] },
        "SubjectType" -> SubjectType.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "ActionId" -> ActionId.map { x => x.asInstanceOf[js.Any] },
        "SubjectId" -> SubjectId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReviewResultDetail]
    }
  }

  object ReviewableHITStatusEnum {
    val Reviewable = "Reviewable"
    val Reviewing = "Reviewing"

    val values = IndexedSeq(Reviewable, Reviewing)
  }

  @js.native
  trait SendBonusRequest extends js.Object {
    var Reason: js.UndefOr[String]
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
    var WorkerId: js.UndefOr[CustomerId]
    var BonusAmount: js.UndefOr[CurrencyAmount]
    var AssignmentId: js.UndefOr[EntityId]
  }

  object SendBonusRequest {
    def apply(
      Reason: js.UndefOr[String] = js.undefined,
      UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      BonusAmount: js.UndefOr[CurrencyAmount] = js.undefined,
      AssignmentId: js.UndefOr[EntityId] = js.undefined): SendBonusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] },
        "UniqueRequestToken" -> UniqueRequestToken.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "BonusAmount" -> BonusAmount.map { x => x.asInstanceOf[js.Any] },
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendBonusRequest]
    }
  }

  @js.native
  trait SendBonusResponse extends js.Object {

  }

  object SendBonusResponse {
    def apply(): SendBonusResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendBonusResponse]
    }
  }

  @js.native
  trait SendTestEventNotificationRequest extends js.Object {
    var Notification: js.UndefOr[NotificationSpecification]
    var TestEventType: js.UndefOr[EventType]
  }

  object SendTestEventNotificationRequest {
    def apply(
      Notification: js.UndefOr[NotificationSpecification] = js.undefined,
      TestEventType: js.UndefOr[EventType] = js.undefined): SendTestEventNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "TestEventType" -> TestEventType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTestEventNotificationRequest]
    }
  }

  @js.native
  trait SendTestEventNotificationResponse extends js.Object {

  }

  object SendTestEventNotificationResponse {
    def apply(): SendTestEventNotificationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTestEventNotificationResponse]
    }
  }

  /**
   * <p>Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.</p>
   */
  @js.native
  trait ServiceFaultException extends js.Object {
    val Message: ExceptionMessage
    val TurkErrorCode: TurkErrorCode
  }

  @js.native
  trait UpdateExpirationForHITRequest extends js.Object {
    var HITId: js.UndefOr[EntityId]
    var ExpireAt: js.UndefOr[Timestamp]
  }

  object UpdateExpirationForHITRequest {
    def apply(
      HITId: js.UndefOr[EntityId] = js.undefined,
      ExpireAt: js.UndefOr[Timestamp] = js.undefined): UpdateExpirationForHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "ExpireAt" -> ExpireAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateExpirationForHITRequest]
    }
  }

  @js.native
  trait UpdateExpirationForHITResponse extends js.Object {

  }

  object UpdateExpirationForHITResponse {
    def apply(): UpdateExpirationForHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateExpirationForHITResponse]
    }
  }

  @js.native
  trait UpdateHITReviewStatusRequest extends js.Object {
    var HITId: js.UndefOr[EntityId]
    var Revert: js.UndefOr[Boolean]
  }

  object UpdateHITReviewStatusRequest {
    def apply(
      HITId: js.UndefOr[EntityId] = js.undefined,
      Revert: js.UndefOr[Boolean] = js.undefined): UpdateHITReviewStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "Revert" -> Revert.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHITReviewStatusRequest]
    }
  }

  @js.native
  trait UpdateHITReviewStatusResponse extends js.Object {

  }

  object UpdateHITReviewStatusResponse {
    def apply(): UpdateHITReviewStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHITReviewStatusResponse]
    }
  }

  @js.native
  trait UpdateHITTypeOfHITRequest extends js.Object {
    var HITId: js.UndefOr[EntityId]
    var HITTypeId: js.UndefOr[EntityId]
  }

  object UpdateHITTypeOfHITRequest {
    def apply(
      HITId: js.UndefOr[EntityId] = js.undefined,
      HITTypeId: js.UndefOr[EntityId] = js.undefined): UpdateHITTypeOfHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "HITTypeId" -> HITTypeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHITTypeOfHITRequest]
    }
  }

  @js.native
  trait UpdateHITTypeOfHITResponse extends js.Object {

  }

  object UpdateHITTypeOfHITResponse {
    def apply(): UpdateHITTypeOfHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHITTypeOfHITResponse]
    }
  }

  @js.native
  trait UpdateNotificationSettingsRequest extends js.Object {
    var HITTypeId: js.UndefOr[EntityId]
    var Notification: js.UndefOr[NotificationSpecification]
    var Active: js.UndefOr[Boolean]
  }

  object UpdateNotificationSettingsRequest {
    def apply(
      HITTypeId: js.UndefOr[EntityId] = js.undefined,
      Notification: js.UndefOr[NotificationSpecification] = js.undefined,
      Active: js.UndefOr[Boolean] = js.undefined): UpdateNotificationSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITTypeId" -> HITTypeId.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Active" -> Active.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotificationSettingsRequest]
    }
  }

  @js.native
  trait UpdateNotificationSettingsResponse extends js.Object {

  }

  object UpdateNotificationSettingsResponse {
    def apply(): UpdateNotificationSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNotificationSettingsResponse]
    }
  }

  @js.native
  trait UpdateQualificationTypeRequest extends js.Object {
    var QualificationTypeStatus: js.UndefOr[QualificationTypeStatus]
    var Description: js.UndefOr[String]
    var QualificationTypeId: js.UndefOr[EntityId]
    var AutoGranted: js.UndefOr[Boolean]
    var TestDurationInSeconds: js.UndefOr[Double]
    var Test: js.UndefOr[String]
    var RetryDelayInSeconds: js.UndefOr[Double]
    var AutoGrantedValue: js.UndefOr[Int]
    var AnswerKey: js.UndefOr[String]
  }

  object UpdateQualificationTypeRequest {
    def apply(
      QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      AutoGranted: js.UndefOr[Boolean] = js.undefined,
      TestDurationInSeconds: js.UndefOr[Double] = js.undefined,
      Test: js.UndefOr[String] = js.undefined,
      RetryDelayInSeconds: js.UndefOr[Double] = js.undefined,
      AutoGrantedValue: js.UndefOr[Int] = js.undefined,
      AnswerKey: js.UndefOr[String] = js.undefined): UpdateQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeStatus" -> QualificationTypeStatus.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "AutoGranted" -> AutoGranted.map { x => x.asInstanceOf[js.Any] },
        "TestDurationInSeconds" -> TestDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Test" -> Test.map { x => x.asInstanceOf[js.Any] },
        "RetryDelayInSeconds" -> RetryDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "AutoGrantedValue" -> AutoGrantedValue.map { x => x.asInstanceOf[js.Any] },
        "AnswerKey" -> AnswerKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateQualificationTypeRequest]
    }
  }

  @js.native
  trait UpdateQualificationTypeResponse extends js.Object {
    var QualificationType: js.UndefOr[QualificationType]
  }

  object UpdateQualificationTypeResponse {
    def apply(
      QualificationType: js.UndefOr[QualificationType] = js.undefined): UpdateQualificationTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationType" -> QualificationType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateQualificationTypeResponse]
    }
  }

  /**
   * <p> The WorkerBlock data structure represents a Worker who has been blocked. It has two elements: the WorkerId and the Reason for the block. </p>
   */
  @js.native
  trait WorkerBlock extends js.Object {
    var WorkerId: js.UndefOr[CustomerId]
    var Reason: js.UndefOr[String]
  }

  object WorkerBlock {
    def apply(
      WorkerId: js.UndefOr[CustomerId] = js.undefined,
      Reason: js.UndefOr[String] = js.undefined): WorkerBlock = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkerBlock]
    }
  }
}
