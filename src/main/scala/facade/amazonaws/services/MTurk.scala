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
    def apply(
      QualificationRequestId: String,
      IntegerValue: js.UndefOr[Int] = js.undefined): AcceptQualificationRequestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationRequestId" -> QualificationRequestId.asInstanceOf[js.Any],
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
    var AssignmentId: EntityId
    var OverrideRejection: js.UndefOr[Boolean]
    var RequesterFeedback: js.UndefOr[String]
  }

  object ApproveAssignmentRequest {
    def apply(
      AssignmentId: EntityId,
      OverrideRejection: js.UndefOr[Boolean] = js.undefined,
      RequesterFeedback: js.UndefOr[String] = js.undefined): ApproveAssignmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any],
        "OverrideRejection" -> OverrideRejection.map { x => x.asInstanceOf[js.Any] },
        "RequesterFeedback" -> RequesterFeedback.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      WorkerId: js.UndefOr[CustomerId] = js.undefined): Assignment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptTime" -> AcceptTime.map { x => x.asInstanceOf[js.Any] },
        "Answer" -> Answer.map { x => x.asInstanceOf[js.Any] },
        "ApprovalTime" -> ApprovalTime.map { x => x.asInstanceOf[js.Any] },
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] },
        "AssignmentStatus" -> AssignmentStatus.map { x => x.asInstanceOf[js.Any] },
        "AutoApprovalTime" -> AutoApprovalTime.map { x => x.asInstanceOf[js.Any] },
        "Deadline" -> Deadline.map { x => x.asInstanceOf[js.Any] },
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "RejectionTime" -> RejectionTime.map { x => x.asInstanceOf[js.Any] },
        "RequesterFeedback" -> RequesterFeedback.map { x => x.asInstanceOf[js.Any] },
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var QualificationTypeId: EntityId
    var WorkerId: CustomerId
    var IntegerValue: js.UndefOr[Int]
    var SendNotification: js.UndefOr[Boolean]
  }

  object AssociateQualificationWithWorkerRequest {
    def apply(
      QualificationTypeId: EntityId,
      WorkerId: CustomerId,
      IntegerValue: js.UndefOr[Int] = js.undefined,
      SendNotification: js.UndefOr[Boolean] = js.undefined): AssociateQualificationWithWorkerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any],
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
    def apply(
      AssignmentId: js.UndefOr[EntityId] = js.undefined,
      BonusAmount: js.UndefOr[CurrencyAmount] = js.undefined,
      GrantTime: js.UndefOr[Timestamp] = js.undefined,
      Reason: js.UndefOr[String] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined): BonusPayment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] },
        "BonusAmount" -> BonusAmount.map { x => x.asInstanceOf[js.Any] },
        "GrantTime" -> GrantTime.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var HITId: EntityId
    var NumberOfAdditionalAssignments: Int
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
  }

  object CreateAdditionalAssignmentsForHITRequest {
    def apply(
      HITId: EntityId,
      NumberOfAdditionalAssignments: Int,
      UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined): CreateAdditionalAssignmentsForHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.asInstanceOf[js.Any],
        "NumberOfAdditionalAssignments" -> NumberOfAdditionalAssignments.asInstanceOf[js.Any],
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
      UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined): CreateHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentDurationInSeconds" -> AssignmentDurationInSeconds.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "LifetimeInSeconds" -> LifetimeInSeconds.asInstanceOf[js.Any],
        "Reward" -> Reward.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any],
        "AssignmentReviewPolicy" -> AssignmentReviewPolicy.map { x => x.asInstanceOf[js.Any] },
        "AutoApprovalDelayInSeconds" -> AutoApprovalDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "HITLayoutId" -> HITLayoutId.map { x => x.asInstanceOf[js.Any] },
        "HITLayoutParameters" -> HITLayoutParameters.map { x => x.asInstanceOf[js.Any] },
        "HITReviewPolicy" -> HITReviewPolicy.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] },
        "MaxAssignments" -> MaxAssignments.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequirements" -> QualificationRequirements.map { x => x.asInstanceOf[js.Any] },
        "Question" -> Question.map { x => x.asInstanceOf[js.Any] },
        "RequesterAnnotation" -> RequesterAnnotation.map { x => x.asInstanceOf[js.Any] },
        "UniqueRequestToken" -> UniqueRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var AssignmentDurationInSeconds: Double
    var Description: String
    var Reward: CurrencyAmount
    var Title: String
    var AutoApprovalDelayInSeconds: js.UndefOr[Double]
    var Keywords: js.UndefOr[String]
    var QualificationRequirements: js.UndefOr[QualificationRequirementList]
  }

  object CreateHITTypeRequest {
    def apply(
      AssignmentDurationInSeconds: Double,
      Description: String,
      Reward: CurrencyAmount,
      Title: String,
      AutoApprovalDelayInSeconds: js.UndefOr[Double] = js.undefined,
      Keywords: js.UndefOr[String] = js.undefined,
      QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined): CreateHITTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentDurationInSeconds" -> AssignmentDurationInSeconds.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Reward" -> Reward.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any],
        "AutoApprovalDelayInSeconds" -> AutoApprovalDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequirements" -> QualificationRequirements.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined): CreateHITWithHITTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITTypeId" -> HITTypeId.asInstanceOf[js.Any],
        "LifetimeInSeconds" -> LifetimeInSeconds.asInstanceOf[js.Any],
        "AssignmentReviewPolicy" -> AssignmentReviewPolicy.map { x => x.asInstanceOf[js.Any] },
        "HITLayoutId" -> HITLayoutId.map { x => x.asInstanceOf[js.Any] },
        "HITLayoutParameters" -> HITLayoutParameters.map { x => x.asInstanceOf[js.Any] },
        "HITReviewPolicy" -> HITReviewPolicy.map { x => x.asInstanceOf[js.Any] },
        "MaxAssignments" -> MaxAssignments.map { x => x.asInstanceOf[js.Any] },
        "Question" -> Question.map { x => x.asInstanceOf[js.Any] },
        "RequesterAnnotation" -> RequesterAnnotation.map { x => x.asInstanceOf[js.Any] },
        "UniqueRequestToken" -> UniqueRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      TestDurationInSeconds: js.UndefOr[Double] = js.undefined): CreateQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "QualificationTypeStatus" -> QualificationTypeStatus.asInstanceOf[js.Any],
        "AnswerKey" -> AnswerKey.map { x => x.asInstanceOf[js.Any] },
        "AutoGranted" -> AutoGranted.map { x => x.asInstanceOf[js.Any] },
        "AutoGrantedValue" -> AutoGrantedValue.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] },
        "RetryDelayInSeconds" -> RetryDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Test" -> Test.map { x => x.asInstanceOf[js.Any] },
        "TestDurationInSeconds" -> TestDurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Reason: String
    var WorkerId: CustomerId
  }

  object CreateWorkerBlockRequest {
    def apply(
      Reason: String,
      WorkerId: CustomerId): CreateWorkerBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Reason" -> Reason.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var HITId: EntityId
  }

  object DeleteHITRequest {
    def apply(
      HITId: EntityId): DeleteHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var QualificationTypeId: EntityId
  }

  object DeleteQualificationTypeRequest {
    def apply(
      QualificationTypeId: EntityId): DeleteQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var WorkerId: CustomerId
    var Reason: js.UndefOr[String]
  }

  object DeleteWorkerBlockRequest {
    def apply(
      WorkerId: CustomerId,
      Reason: js.UndefOr[String] = js.undefined): DeleteWorkerBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkerId" -> WorkerId.asInstanceOf[js.Any],
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
    var QualificationTypeId: EntityId
    var WorkerId: CustomerId
    var Reason: js.UndefOr[String]
  }

  object DisassociateQualificationFromWorkerRequest {
    def apply(
      QualificationTypeId: EntityId,
      WorkerId: CustomerId,
      Reason: js.UndefOr[String] = js.undefined): DisassociateQualificationFromWorkerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any],
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
    var AssignmentId: EntityId
  }

  object GetAssignmentRequest {
    def apply(
      AssignmentId: EntityId): GetAssignmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var AssignmentId: EntityId
    var QuestionIdentifier: String
  }

  object GetFileUploadURLRequest {
    def apply(
      AssignmentId: EntityId,
      QuestionIdentifier: String): GetFileUploadURLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any],
        "QuestionIdentifier" -> QuestionIdentifier.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var HITId: EntityId
  }

  object GetHITRequest {
    def apply(
      HITId: EntityId): GetHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var QualificationTypeId: EntityId
    var WorkerId: CustomerId
  }

  object GetQualificationScoreRequest {
    def apply(
      QualificationTypeId: EntityId,
      WorkerId: CustomerId): GetQualificationScoreRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var QualificationTypeId: EntityId
  }

  object GetQualificationTypeRequest {
    def apply(
      QualificationTypeId: EntityId): GetQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      Title: js.UndefOr[String] = js.undefined): HIT = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentDurationInSeconds" -> AssignmentDurationInSeconds.map { x => x.asInstanceOf[js.Any] },
        "AutoApprovalDelayInSeconds" -> AutoApprovalDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "HITGroupId" -> HITGroupId.map { x => x.asInstanceOf[js.Any] },
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "HITLayoutId" -> HITLayoutId.map { x => x.asInstanceOf[js.Any] },
        "HITReviewStatus" -> HITReviewStatus.map { x => x.asInstanceOf[js.Any] },
        "HITStatus" -> HITStatus.map { x => x.asInstanceOf[js.Any] },
        "HITTypeId" -> HITTypeId.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] },
        "MaxAssignments" -> MaxAssignments.map { x => x.asInstanceOf[js.Any] },
        "NumberOfAssignmentsAvailable" -> NumberOfAssignmentsAvailable.map { x => x.asInstanceOf[js.Any] },
        "NumberOfAssignmentsCompleted" -> NumberOfAssignmentsCompleted.map { x => x.asInstanceOf[js.Any] },
        "NumberOfAssignmentsPending" -> NumberOfAssignmentsPending.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequirements" -> QualificationRequirements.map { x => x.asInstanceOf[js.Any] },
        "Question" -> Question.map { x => x.asInstanceOf[js.Any] },
        "RequesterAnnotation" -> RequesterAnnotation.map { x => x.asInstanceOf[js.Any] },
        "Reward" -> Reward.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * The HITLayoutParameter data structure defines parameter values used with a HITLayout. A HITLayout is a reusable Amazon Mechanical Turk project template used to provide Human Intelligence Task (HIT) question data for CreateHIT.
   */
  @js.native
  trait HITLayoutParameter extends js.Object {
    var Name: String
    var Value: String
  }

  object HITLayoutParameter {
    def apply(
      Name: String,
      Value: String): HITLayoutParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var HITId: EntityId
    var AssignmentStatuses: js.UndefOr[AssignmentStatusList]
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAssignmentsForHITRequest {
    def apply(
      HITId: EntityId,
      AssignmentStatuses: js.UndefOr[AssignmentStatusList] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListAssignmentsForHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.asInstanceOf[js.Any],
        "AssignmentStatuses" -> AssignmentStatuses.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssignmentsForHITRequest]
    }
  }

  @js.native
  trait ListAssignmentsForHITResponse extends js.Object {
    var Assignments: js.UndefOr[AssignmentList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListAssignmentsForHITResponse {
    def apply(
      Assignments: js.UndefOr[AssignmentList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined): ListAssignmentsForHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Assignments" -> Assignments.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssignmentsForHITResponse]
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
    def apply(
      AssignmentId: js.UndefOr[EntityId] = js.undefined,
      HITId: js.UndefOr[EntityId] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListBonusPaymentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.map { x => x.asInstanceOf[js.Any] },
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBonusPaymentsRequest]
    }
  }

  @js.native
  trait ListBonusPaymentsResponse extends js.Object {
    var BonusPayments: js.UndefOr[BonusPaymentList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListBonusPaymentsResponse {
    def apply(
      BonusPayments: js.UndefOr[BonusPaymentList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined): ListBonusPaymentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BonusPayments" -> BonusPayments.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBonusPaymentsResponse]
    }
  }

  @js.native
  trait ListHITsForQualificationTypeRequest extends js.Object {
    var QualificationTypeId: EntityId
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHITsForQualificationTypeRequest {
    def apply(
      QualificationTypeId: EntityId,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListHITsForQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHITsForQualificationTypeRequest]
    }
  }

  @js.native
  trait ListHITsForQualificationTypeResponse extends js.Object {
    var HITs: js.UndefOr[HITList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListHITsForQualificationTypeResponse {
    def apply(
      HITs: js.UndefOr[HITList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined): ListHITsForQualificationTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITs" -> HITs.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHITsForQualificationTypeResponse]
    }
  }

  @js.native
  trait ListHITsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHITsRequest {
    def apply(
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListHITsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHITsRequest]
    }
  }

  @js.native
  trait ListHITsResponse extends js.Object {
    var HITs: js.UndefOr[HITList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListHITsResponse {
    def apply(
      HITs: js.UndefOr[HITList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined): ListHITsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITs" -> HITs.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHITsResponse]
    }
  }

  @js.native
  trait ListQualificationRequestsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var QualificationTypeId: js.UndefOr[EntityId]
  }

  object ListQualificationRequestsRequest {
    def apply(
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined): ListQualificationRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQualificationRequestsRequest]
    }
  }

  @js.native
  trait ListQualificationRequestsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var QualificationRequests: js.UndefOr[QualificationRequestList]
  }

  object ListQualificationRequestsResponse {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined,
      QualificationRequests: js.UndefOr[QualificationRequestList] = js.undefined): ListQualificationRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequests" -> QualificationRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQualificationRequestsResponse]
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
    def apply(
      MustBeRequestable: Boolean,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      MustBeOwnedByCaller: js.UndefOr[Boolean] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      Query: js.UndefOr[String] = js.undefined): ListQualificationTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MustBeRequestable" -> MustBeRequestable.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "MustBeOwnedByCaller" -> MustBeOwnedByCaller.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Query" -> Query.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQualificationTypesRequest]
    }
  }

  @js.native
  trait ListQualificationTypesResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
    var QualificationTypes: js.UndefOr[QualificationTypeList]
  }

  object ListQualificationTypesResponse {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined,
      QualificationTypes: js.UndefOr[QualificationTypeList] = js.undefined): ListQualificationTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypes" -> QualificationTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQualificationTypesResponse]
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
    def apply(
      HITId: EntityId,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      PolicyLevels: js.UndefOr[ReviewPolicyLevelList] = js.undefined,
      RetrieveActions: js.UndefOr[Boolean] = js.undefined,
      RetrieveResults: js.UndefOr[Boolean] = js.undefined): ListReviewPolicyResultsForHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PolicyLevels" -> PolicyLevels.map { x => x.asInstanceOf[js.Any] },
        "RetrieveActions" -> RetrieveActions.map { x => x.asInstanceOf[js.Any] },
        "RetrieveResults" -> RetrieveResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReviewPolicyResultsForHITRequest]
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
    def apply(
      AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
      AssignmentReviewReport: js.UndefOr[ReviewReport] = js.undefined,
      HITId: js.UndefOr[EntityId] = js.undefined,
      HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined,
      HITReviewReport: js.UndefOr[ReviewReport] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListReviewPolicyResultsForHITResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentReviewPolicy" -> AssignmentReviewPolicy.map { x => x.asInstanceOf[js.Any] },
        "AssignmentReviewReport" -> AssignmentReviewReport.map { x => x.asInstanceOf[js.Any] },
        "HITId" -> HITId.map { x => x.asInstanceOf[js.Any] },
        "HITReviewPolicy" -> HITReviewPolicy.map { x => x.asInstanceOf[js.Any] },
        "HITReviewReport" -> HITReviewReport.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReviewPolicyResultsForHITResponse]
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
    def apply(
      HITTypeId: js.UndefOr[EntityId] = js.undefined,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      Status: js.UndefOr[ReviewableHITStatus] = js.undefined): ListReviewableHITsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITTypeId" -> HITTypeId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReviewableHITsRequest]
    }
  }

  @js.native
  trait ListReviewableHITsResponse extends js.Object {
    var HITs: js.UndefOr[HITList]
    var NextToken: js.UndefOr[PaginationToken]
    var NumResults: js.UndefOr[Int]
  }

  object ListReviewableHITsResponse {
    def apply(
      HITs: js.UndefOr[HITList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      NumResults: js.UndefOr[Int] = js.undefined): ListReviewableHITsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITs" -> HITs.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "NumResults" -> NumResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReviewableHITsResponse]
    }
  }

  @js.native
  trait ListWorkerBlocksRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListWorkerBlocksRequest {
    def apply(
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListWorkerBlocksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var QualificationTypeId: EntityId
    var MaxResults: js.UndefOr[ResultSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[QualificationStatus]
  }

  object ListWorkersWithQualificationTypeRequest {
    def apply(
      QualificationTypeId: EntityId,
      MaxResults: js.UndefOr[ResultSize] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      Status: js.UndefOr[QualificationStatus] = js.undefined): ListWorkersWithQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * The Locale data structure represents a geographical region or location.
   */
  @js.native
  trait Locale extends js.Object {
    var Country: CountryParameters
    var Subdivision: js.UndefOr[CountryParameters]
  }

  object Locale {
    def apply(
      Country: CountryParameters,
      Subdivision: js.UndefOr[CountryParameters] = js.undefined): Locale = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Country" -> Country.asInstanceOf[js.Any],
        "Subdivision" -> Subdivision.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Locale]
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
    def apply(
      Destination: String,
      EventTypes: EventTypeList,
      Transport: NotificationTransport,
      Version: String): NotificationSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.asInstanceOf[js.Any],
        "EventTypes" -> EventTypes.asInstanceOf[js.Any],
        "Transport" -> Transport.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * When MTurk encounters an issue with notifying the Workers you specified, it returns back this object with failure details.
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
    var MessageText: String
    var Subject: String
    var WorkerIds: CustomerIdList
  }

  object NotifyWorkersRequest {
    def apply(
      MessageText: String,
      Subject: String,
      WorkerIds: CustomerIdList): NotifyWorkersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageText" -> MessageText.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any],
        "WorkerIds" -> WorkerIds.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * This data structure is the data type for the AnswerKey parameter of the ScoreMyKnownAnswers/2011-09-01 Review Policy.
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
   * Name of the parameter from the Review policy.
   */
  @js.native
  trait PolicyParameter extends js.Object {
    var Key: js.UndefOr[String]
    var MapEntries: js.UndefOr[ParameterMapEntryList]
    var Values: js.UndefOr[StringList]
  }

  object PolicyParameter {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      MapEntries: js.UndefOr[ParameterMapEntryList] = js.undefined,
      Values: js.UndefOr[StringList] = js.undefined): PolicyParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "MapEntries" -> MapEntries.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyParameter]
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
    def apply(
      GrantTime: js.UndefOr[Timestamp] = js.undefined,
      IntegerValue: js.UndefOr[Int] = js.undefined,
      LocaleValue: js.UndefOr[Locale] = js.undefined,
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[QualificationStatus] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined): Qualification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GrantTime" -> GrantTime.map { x => x.asInstanceOf[js.Any] },
        "IntegerValue" -> IntegerValue.map { x => x.asInstanceOf[js.Any] },
        "LocaleValue" -> LocaleValue.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Qualification]
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
    def apply(
      Answer: js.UndefOr[String] = js.undefined,
      QualificationRequestId: js.UndefOr[String] = js.undefined,
      QualificationTypeId: js.UndefOr[EntityId] = js.undefined,
      SubmitTime: js.UndefOr[Timestamp] = js.undefined,
      Test: js.UndefOr[String] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined): QualificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Answer" -> Answer.map { x => x.asInstanceOf[js.Any] },
        "QualificationRequestId" -> QualificationRequestId.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] },
        "Test" -> Test.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QualificationRequest]
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
    def apply(
      Comparator: Comparator,
      QualificationTypeId: String,
      ActionsGuarded: js.UndefOr[HITAccessActions] = js.undefined,
      IntegerValues: js.UndefOr[IntegerList] = js.undefined,
      LocaleValues: js.UndefOr[LocaleList] = js.undefined,
      RequiredToPreview: js.UndefOr[Boolean] = js.undefined): QualificationRequirement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comparator" -> Comparator.asInstanceOf[js.Any],
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "ActionsGuarded" -> ActionsGuarded.map { x => x.asInstanceOf[js.Any] },
        "IntegerValues" -> IntegerValues.map { x => x.asInstanceOf[js.Any] },
        "LocaleValues" -> LocaleValues.map { x => x.asInstanceOf[js.Any] },
        "RequiredToPreview" -> RequiredToPreview.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QualificationRequirement]
    }
  }

  object QualificationStatusEnum {
    val Granted = "Granted"
    val Revoked = "Revoked"

    val values = IndexedSeq(Granted, Revoked)
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
      TestDurationInSeconds: js.UndefOr[Double] = js.undefined): QualificationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AnswerKey" -> AnswerKey.map { x => x.asInstanceOf[js.Any] },
        "AutoGranted" -> AutoGranted.map { x => x.asInstanceOf[js.Any] },
        "AutoGrantedValue" -> AutoGrantedValue.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsRequestable" -> IsRequestable.map { x => x.asInstanceOf[js.Any] },
        "Keywords" -> Keywords.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeId" -> QualificationTypeId.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeStatus" -> QualificationTypeStatus.map { x => x.asInstanceOf[js.Any] },
        "RetryDelayInSeconds" -> RetryDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Test" -> Test.map { x => x.asInstanceOf[js.Any] },
        "TestDurationInSeconds" -> TestDurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var AssignmentId: EntityId
    var RequesterFeedback: String
  }

  object RejectAssignmentRequest {
    def apply(
      AssignmentId: EntityId,
      RequesterFeedback: String): RejectAssignmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any],
        "RequesterFeedback" -> RequesterFeedback.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var QualificationRequestId: String
    var Reason: js.UndefOr[String]
  }

  object RejectQualificationRequestRequest {
    def apply(
      QualificationRequestId: String,
      Reason: js.UndefOr[String] = js.undefined): RejectQualificationRequestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationRequestId" -> QualificationRequestId.asInstanceOf[js.Any],
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
    def apply(
      ActionId: js.UndefOr[EntityId] = js.undefined,
      ActionName: js.UndefOr[String] = js.undefined,
      CompleteTime: js.UndefOr[Timestamp] = js.undefined,
      ErrorCode: js.UndefOr[String] = js.undefined,
      Result: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[ReviewActionStatus] = js.undefined,
      TargetId: js.UndefOr[EntityId] = js.undefined,
      TargetType: js.UndefOr[String] = js.undefined): ReviewActionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionId" -> ActionId.map { x => x.asInstanceOf[js.Any] },
        "ActionName" -> ActionName.map { x => x.asInstanceOf[js.Any] },
        "CompleteTime" -> CompleteTime.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "Result" -> Result.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "TargetId" -> TargetId.map { x => x.asInstanceOf[js.Any] },
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * HIT Review Policy data structures represent HIT review policies, which you specify when you create a HIT.
   */
  @js.native
  trait ReviewPolicy extends js.Object {
    var PolicyName: String
    var Parameters: js.UndefOr[PolicyParameterList]
  }

  object ReviewPolicy {
    def apply(
      PolicyName: String,
      Parameters: js.UndefOr[PolicyParameterList] = js.undefined): ReviewPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
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
   * Contains both ReviewResult and ReviewAction elements for a particular HIT.
   */
  @js.native
  trait ReviewReport extends js.Object {
    var ReviewActions: js.UndefOr[ReviewActionDetailList]
    var ReviewResults: js.UndefOr[ReviewResultDetailList]
  }

  object ReviewReport {
    def apply(
      ReviewActions: js.UndefOr[ReviewActionDetailList] = js.undefined,
      ReviewResults: js.UndefOr[ReviewResultDetailList] = js.undefined): ReviewReport = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReviewActions" -> ReviewActions.map { x => x.asInstanceOf[js.Any] },
        "ReviewResults" -> ReviewResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReviewReport]
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
    def apply(
      ActionId: js.UndefOr[EntityId] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      QuestionId: js.UndefOr[EntityId] = js.undefined,
      SubjectId: js.UndefOr[EntityId] = js.undefined,
      SubjectType: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): ReviewResultDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionId" -> ActionId.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "QuestionId" -> QuestionId.map { x => x.asInstanceOf[js.Any] },
        "SubjectId" -> SubjectId.map { x => x.asInstanceOf[js.Any] },
        "SubjectType" -> SubjectType.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var AssignmentId: EntityId
    var BonusAmount: CurrencyAmount
    var Reason: String
    var WorkerId: CustomerId
    var UniqueRequestToken: js.UndefOr[IdempotencyToken]
  }

  object SendBonusRequest {
    def apply(
      AssignmentId: EntityId,
      BonusAmount: CurrencyAmount,
      Reason: String,
      WorkerId: CustomerId,
      UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined): SendBonusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssignmentId" -> AssignmentId.asInstanceOf[js.Any],
        "BonusAmount" -> BonusAmount.asInstanceOf[js.Any],
        "Reason" -> Reason.asInstanceOf[js.Any],
        "WorkerId" -> WorkerId.asInstanceOf[js.Any],
        "UniqueRequestToken" -> UniqueRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Notification: NotificationSpecification
    var TestEventType: EventType
  }

  object SendTestEventNotificationRequest {
    def apply(
      Notification: NotificationSpecification,
      TestEventType: EventType): SendTestEventNotificationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Notification" -> Notification.asInstanceOf[js.Any],
        "TestEventType" -> TestEventType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    def apply(
      ExpireAt: Timestamp,
      HITId: EntityId): UpdateExpirationForHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExpireAt" -> ExpireAt.asInstanceOf[js.Any],
        "HITId" -> HITId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var HITId: EntityId
    var Revert: js.UndefOr[Boolean]
  }

  object UpdateHITReviewStatusRequest {
    def apply(
      HITId: EntityId,
      Revert: js.UndefOr[Boolean] = js.undefined): UpdateHITReviewStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.asInstanceOf[js.Any],
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
    var HITId: EntityId
    var HITTypeId: EntityId
  }

  object UpdateHITTypeOfHITRequest {
    def apply(
      HITId: EntityId,
      HITTypeId: EntityId): UpdateHITTypeOfHITRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITId" -> HITId.asInstanceOf[js.Any],
        "HITTypeId" -> HITTypeId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var HITTypeId: EntityId
    var Active: js.UndefOr[Boolean]
    var Notification: js.UndefOr[NotificationSpecification]
  }

  object UpdateNotificationSettingsRequest {
    def apply(
      HITTypeId: EntityId,
      Active: js.UndefOr[Boolean] = js.undefined,
      Notification: js.UndefOr[NotificationSpecification] = js.undefined): UpdateNotificationSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HITTypeId" -> HITTypeId.asInstanceOf[js.Any],
        "Active" -> Active.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(
      QualificationTypeId: EntityId,
      AnswerKey: js.UndefOr[String] = js.undefined,
      AutoGranted: js.UndefOr[Boolean] = js.undefined,
      AutoGrantedValue: js.UndefOr[Int] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined,
      RetryDelayInSeconds: js.UndefOr[Double] = js.undefined,
      Test: js.UndefOr[String] = js.undefined,
      TestDurationInSeconds: js.UndefOr[Double] = js.undefined): UpdateQualificationTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QualificationTypeId" -> QualificationTypeId.asInstanceOf[js.Any],
        "AnswerKey" -> AnswerKey.map { x => x.asInstanceOf[js.Any] },
        "AutoGranted" -> AutoGranted.map { x => x.asInstanceOf[js.Any] },
        "AutoGrantedValue" -> AutoGrantedValue.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "QualificationTypeStatus" -> QualificationTypeStatus.map { x => x.asInstanceOf[js.Any] },
        "RetryDelayInSeconds" -> RetryDelayInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Test" -> Test.map { x => x.asInstanceOf[js.Any] },
        "TestDurationInSeconds" -> TestDurationInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * The WorkerBlock data structure represents a Worker who has been blocked. It has two elements: the WorkerId and the Reason for the block.
   */
  @js.native
  trait WorkerBlock extends js.Object {
    var Reason: js.UndefOr[String]
    var WorkerId: js.UndefOr[CustomerId]
  }

  object WorkerBlock {
    def apply(
      Reason: js.UndefOr[String] = js.undefined,
      WorkerId: js.UndefOr[CustomerId] = js.undefined): WorkerBlock = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] },
        "WorkerId" -> WorkerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkerBlock]
    }
  }
}
