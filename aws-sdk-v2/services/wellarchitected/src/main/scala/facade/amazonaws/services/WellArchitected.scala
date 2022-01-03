package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object wellarchitected {
  type AnswerSummaries = js.Array[AnswerSummary]
  type AwsAccountId = String
  type AwsRegion = String
  type Base64String = String
  type ChoiceAnswerSummaries = js.Array[ChoiceAnswerSummary]
  type ChoiceAnswers = js.Array[ChoiceAnswer]
  type ChoiceContentDisplayText = String
  type ChoiceContentUrl = String
  type ChoiceDescription = String
  type ChoiceId = String
  type ChoiceImprovementPlans = js.Array[ChoiceImprovementPlan]
  type ChoiceNotes = String
  type ChoiceTitle = String
  type ChoiceUpdates = js.Dictionary[ChoiceUpdate]
  type Choices = js.Array[Choice]
  type ClientRequestToken = String
  type Count = Int
  type DisplayText = String
  type HelpfulResourceUrl = String
  type ImprovementPlanUrl = String
  type ImprovementSummaries = js.Array[ImprovementSummary]
  type IsApplicable = Boolean
  type IsMajorVersion = Boolean
  type IsReviewOwnerUpdateAcknowledged = Boolean
  type LensAlias = String
  type LensAliases = js.Array[LensAlias]
  type LensArn = String
  type LensDescription = String
  type LensJSON = String
  type LensName = String
  type LensNamePrefix = String
  type LensOwner = String
  type LensReviewSummaries = js.Array[LensReviewSummary]
  type LensShareSummaries = js.Array[LensShareSummary]
  type LensSummaries = js.Array[LensSummary]
  type LensVersion = String
  type ListAnswersMaxResults = Int
  type ListLensReviewImprovementsMaxResults = Int
  type ListNotificationsMaxResults = Int
  type ListShareInvitationsMaxResults = Int
  type ListWorkloadSharesMaxResults = Int
  type ListWorkloadsMaxResults = Int
  type MaxResults = Int
  type MilestoneName = String
  type MilestoneNumber = Int
  type MilestoneSummaries = js.Array[MilestoneSummary]
  type NextToken = String
  type Notes = String
  type NotificationSummaries = js.Array[NotificationSummary]
  type PillarDifferences = js.Array[PillarDifference]
  type PillarId = String
  type PillarName = String
  type PillarNotes = js.Dictionary[Notes]
  type PillarReviewSummaries = js.Array[PillarReviewSummary]
  type QuestionDescription = String
  type QuestionDifferences = js.Array[QuestionDifference]
  type QuestionId = String
  type QuestionTitle = String
  type RiskCounts = js.Dictionary[Count]
  type SelectedChoices = js.Array[ChoiceId]
  type ShareId = String
  type ShareInvitationId = String
  type ShareInvitationSummaries = js.Array[ShareInvitationSummary]
  type SharedWith = String
  type SharedWithPrefix = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type WorkloadAccountIds = js.Array[AwsAccountId]
  type WorkloadArchitecturalDesign = String
  type WorkloadArn = String
  type WorkloadAwsRegions = js.Array[AwsRegion]
  type WorkloadDescription = String
  type WorkloadId = String
  type WorkloadIndustry = String
  type WorkloadIndustryType = String
  type WorkloadLenses = js.Array[LensAlias]
  type WorkloadName = String
  type WorkloadNamePrefix = String
  type WorkloadNonAwsRegion = String
  type WorkloadNonAwsRegions = js.Array[WorkloadNonAwsRegion]
  type WorkloadPillarPriorities = js.Array[PillarId]
  type WorkloadReviewOwner = String
  type WorkloadShareSummaries = js.Array[WorkloadShareSummary]
  type WorkloadSummaries = js.Array[WorkloadSummary]

  final class WellArchitectedOps(private val service: WellArchitected) extends AnyVal {

    @inline def associateLensesFuture(params: AssociateLensesInput): Future[js.Object] = service.associateLenses(params).promise().toFuture
    @inline def createLensShareFuture(params: CreateLensShareInput): Future[CreateLensShareOutput] = service.createLensShare(params).promise().toFuture
    @inline def createLensVersionFuture(params: CreateLensVersionInput): Future[CreateLensVersionOutput] = service.createLensVersion(params).promise().toFuture
    @inline def createMilestoneFuture(params: CreateMilestoneInput): Future[CreateMilestoneOutput] = service.createMilestone(params).promise().toFuture
    @inline def createWorkloadFuture(params: CreateWorkloadInput): Future[CreateWorkloadOutput] = service.createWorkload(params).promise().toFuture
    @inline def createWorkloadShareFuture(params: CreateWorkloadShareInput): Future[CreateWorkloadShareOutput] = service.createWorkloadShare(params).promise().toFuture
    @inline def deleteLensFuture(params: DeleteLensInput): Future[js.Object] = service.deleteLens(params).promise().toFuture
    @inline def deleteLensShareFuture(params: DeleteLensShareInput): Future[js.Object] = service.deleteLensShare(params).promise().toFuture
    @inline def deleteWorkloadFuture(params: DeleteWorkloadInput): Future[js.Object] = service.deleteWorkload(params).promise().toFuture
    @inline def deleteWorkloadShareFuture(params: DeleteWorkloadShareInput): Future[js.Object] = service.deleteWorkloadShare(params).promise().toFuture
    @inline def disassociateLensesFuture(params: DisassociateLensesInput): Future[js.Object] = service.disassociateLenses(params).promise().toFuture
    @inline def exportLensFuture(params: ExportLensInput): Future[ExportLensOutput] = service.exportLens(params).promise().toFuture
    @inline def getAnswerFuture(params: GetAnswerInput): Future[GetAnswerOutput] = service.getAnswer(params).promise().toFuture
    @inline def getLensFuture(params: GetLensInput): Future[GetLensOutput] = service.getLens(params).promise().toFuture
    @inline def getLensReviewFuture(params: GetLensReviewInput): Future[GetLensReviewOutput] = service.getLensReview(params).promise().toFuture
    @inline def getLensReviewReportFuture(params: GetLensReviewReportInput): Future[GetLensReviewReportOutput] = service.getLensReviewReport(params).promise().toFuture
    @inline def getLensVersionDifferenceFuture(params: GetLensVersionDifferenceInput): Future[GetLensVersionDifferenceOutput] = service.getLensVersionDifference(params).promise().toFuture
    @inline def getMilestoneFuture(params: GetMilestoneInput): Future[GetMilestoneOutput] = service.getMilestone(params).promise().toFuture
    @inline def getWorkloadFuture(params: GetWorkloadInput): Future[GetWorkloadOutput] = service.getWorkload(params).promise().toFuture
    @inline def importLensFuture(params: ImportLensInput): Future[ImportLensOutput] = service.importLens(params).promise().toFuture
    @inline def listAnswersFuture(params: ListAnswersInput): Future[ListAnswersOutput] = service.listAnswers(params).promise().toFuture
    @inline def listLensReviewImprovementsFuture(params: ListLensReviewImprovementsInput): Future[ListLensReviewImprovementsOutput] = service.listLensReviewImprovements(params).promise().toFuture
    @inline def listLensReviewsFuture(params: ListLensReviewsInput): Future[ListLensReviewsOutput] = service.listLensReviews(params).promise().toFuture
    @inline def listLensSharesFuture(params: ListLensSharesInput): Future[ListLensSharesOutput] = service.listLensShares(params).promise().toFuture
    @inline def listLensesFuture(params: ListLensesInput): Future[ListLensesOutput] = service.listLenses(params).promise().toFuture
    @inline def listMilestonesFuture(params: ListMilestonesInput): Future[ListMilestonesOutput] = service.listMilestones(params).promise().toFuture
    @inline def listNotificationsFuture(params: ListNotificationsInput): Future[ListNotificationsOutput] = service.listNotifications(params).promise().toFuture
    @inline def listShareInvitationsFuture(params: ListShareInvitationsInput): Future[ListShareInvitationsOutput] = service.listShareInvitations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def listWorkloadSharesFuture(params: ListWorkloadSharesInput): Future[ListWorkloadSharesOutput] = service.listWorkloadShares(params).promise().toFuture
    @inline def listWorkloadsFuture(params: ListWorkloadsInput): Future[ListWorkloadsOutput] = service.listWorkloads(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateAnswerFuture(params: UpdateAnswerInput): Future[UpdateAnswerOutput] = service.updateAnswer(params).promise().toFuture
    @inline def updateLensReviewFuture(params: UpdateLensReviewInput): Future[UpdateLensReviewOutput] = service.updateLensReview(params).promise().toFuture
    @inline def updateShareInvitationFuture(params: UpdateShareInvitationInput): Future[UpdateShareInvitationOutput] = service.updateShareInvitation(params).promise().toFuture
    @inline def updateWorkloadFuture(params: UpdateWorkloadInput): Future[UpdateWorkloadOutput] = service.updateWorkload(params).promise().toFuture
    @inline def updateWorkloadShareFuture(params: UpdateWorkloadShareInput): Future[UpdateWorkloadShareOutput] = service.updateWorkloadShare(params).promise().toFuture
    @inline def upgradeLensReviewFuture(params: UpgradeLensReviewInput): Future[js.Object] = service.upgradeLensReview(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/wellarchitected", JSImport.Namespace, "AWS.WellArchitected")
  class WellArchitected() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateLenses(params: AssociateLensesInput): Request[js.Object] = js.native
    def createLensShare(params: CreateLensShareInput): Request[CreateLensShareOutput] = js.native
    def createLensVersion(params: CreateLensVersionInput): Request[CreateLensVersionOutput] = js.native
    def createMilestone(params: CreateMilestoneInput): Request[CreateMilestoneOutput] = js.native
    def createWorkload(params: CreateWorkloadInput): Request[CreateWorkloadOutput] = js.native
    def createWorkloadShare(params: CreateWorkloadShareInput): Request[CreateWorkloadShareOutput] = js.native
    def deleteLens(params: DeleteLensInput): Request[js.Object] = js.native
    def deleteLensShare(params: DeleteLensShareInput): Request[js.Object] = js.native
    def deleteWorkload(params: DeleteWorkloadInput): Request[js.Object] = js.native
    def deleteWorkloadShare(params: DeleteWorkloadShareInput): Request[js.Object] = js.native
    def disassociateLenses(params: DisassociateLensesInput): Request[js.Object] = js.native
    def exportLens(params: ExportLensInput): Request[ExportLensOutput] = js.native
    def getAnswer(params: GetAnswerInput): Request[GetAnswerOutput] = js.native
    def getLens(params: GetLensInput): Request[GetLensOutput] = js.native
    def getLensReview(params: GetLensReviewInput): Request[GetLensReviewOutput] = js.native
    def getLensReviewReport(params: GetLensReviewReportInput): Request[GetLensReviewReportOutput] = js.native
    def getLensVersionDifference(params: GetLensVersionDifferenceInput): Request[GetLensVersionDifferenceOutput] = js.native
    def getMilestone(params: GetMilestoneInput): Request[GetMilestoneOutput] = js.native
    def getWorkload(params: GetWorkloadInput): Request[GetWorkloadOutput] = js.native
    def importLens(params: ImportLensInput): Request[ImportLensOutput] = js.native
    def listAnswers(params: ListAnswersInput): Request[ListAnswersOutput] = js.native
    def listLensReviewImprovements(params: ListLensReviewImprovementsInput): Request[ListLensReviewImprovementsOutput] = js.native
    def listLensReviews(params: ListLensReviewsInput): Request[ListLensReviewsOutput] = js.native
    def listLensShares(params: ListLensSharesInput): Request[ListLensSharesOutput] = js.native
    def listLenses(params: ListLensesInput): Request[ListLensesOutput] = js.native
    def listMilestones(params: ListMilestonesInput): Request[ListMilestonesOutput] = js.native
    def listNotifications(params: ListNotificationsInput): Request[ListNotificationsOutput] = js.native
    def listShareInvitations(params: ListShareInvitationsInput): Request[ListShareInvitationsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listWorkloadShares(params: ListWorkloadSharesInput): Request[ListWorkloadSharesOutput] = js.native
    def listWorkloads(params: ListWorkloadsInput): Request[ListWorkloadsOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateAnswer(params: UpdateAnswerInput): Request[UpdateAnswerOutput] = js.native
    def updateLensReview(params: UpdateLensReviewInput): Request[UpdateLensReviewOutput] = js.native
    def updateShareInvitation(params: UpdateShareInvitationInput): Request[UpdateShareInvitationOutput] = js.native
    def updateWorkload(params: UpdateWorkloadInput): Request[UpdateWorkloadOutput] = js.native
    def updateWorkloadShare(params: UpdateWorkloadShareInput): Request[UpdateWorkloadShareOutput] = js.native
    def upgradeLensReview(params: UpgradeLensReviewInput): Request[js.Object] = js.native
  }
  object WellArchitected {
    @inline implicit def toOps(service: WellArchitected): WellArchitectedOps = {
      new WellArchitectedOps(service)
    }
  }

  /** An answer of the question.
    */
  @js.native
  trait Answer extends js.Object {
    var ChoiceAnswers: js.UndefOr[ChoiceAnswers]
    var Choices: js.UndefOr[Choices]
    var HelpfulResourceDisplayText: js.UndefOr[DisplayText]
    var HelpfulResourceUrl: js.UndefOr[HelpfulResourceUrl]
    var ImprovementPlanUrl: js.UndefOr[ImprovementPlanUrl]
    var IsApplicable: js.UndefOr[IsApplicable]
    var Notes: js.UndefOr[Notes]
    var PillarId: js.UndefOr[PillarId]
    var QuestionDescription: js.UndefOr[QuestionDescription]
    var QuestionId: js.UndefOr[QuestionId]
    var QuestionTitle: js.UndefOr[QuestionTitle]
    var Reason: js.UndefOr[AnswerReason]
    var Risk: js.UndefOr[Risk]
    var SelectedChoices: js.UndefOr[SelectedChoices]
  }

  object Answer {
    @inline
    def apply(
        ChoiceAnswers: js.UndefOr[ChoiceAnswers] = js.undefined,
        Choices: js.UndefOr[Choices] = js.undefined,
        HelpfulResourceDisplayText: js.UndefOr[DisplayText] = js.undefined,
        HelpfulResourceUrl: js.UndefOr[HelpfulResourceUrl] = js.undefined,
        ImprovementPlanUrl: js.UndefOr[ImprovementPlanUrl] = js.undefined,
        IsApplicable: js.UndefOr[IsApplicable] = js.undefined,
        Notes: js.UndefOr[Notes] = js.undefined,
        PillarId: js.UndefOr[PillarId] = js.undefined,
        QuestionDescription: js.UndefOr[QuestionDescription] = js.undefined,
        QuestionId: js.UndefOr[QuestionId] = js.undefined,
        QuestionTitle: js.UndefOr[QuestionTitle] = js.undefined,
        Reason: js.UndefOr[AnswerReason] = js.undefined,
        Risk: js.UndefOr[Risk] = js.undefined,
        SelectedChoices: js.UndefOr[SelectedChoices] = js.undefined
    ): Answer = {
      val __obj = js.Dynamic.literal()
      ChoiceAnswers.foreach(__v => __obj.updateDynamic("ChoiceAnswers")(__v.asInstanceOf[js.Any]))
      Choices.foreach(__v => __obj.updateDynamic("Choices")(__v.asInstanceOf[js.Any]))
      HelpfulResourceDisplayText.foreach(__v => __obj.updateDynamic("HelpfulResourceDisplayText")(__v.asInstanceOf[js.Any]))
      HelpfulResourceUrl.foreach(__v => __obj.updateDynamic("HelpfulResourceUrl")(__v.asInstanceOf[js.Any]))
      ImprovementPlanUrl.foreach(__v => __obj.updateDynamic("ImprovementPlanUrl")(__v.asInstanceOf[js.Any]))
      IsApplicable.foreach(__v => __obj.updateDynamic("IsApplicable")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      PillarId.foreach(__v => __obj.updateDynamic("PillarId")(__v.asInstanceOf[js.Any]))
      QuestionDescription.foreach(__v => __obj.updateDynamic("QuestionDescription")(__v.asInstanceOf[js.Any]))
      QuestionId.foreach(__v => __obj.updateDynamic("QuestionId")(__v.asInstanceOf[js.Any]))
      QuestionTitle.foreach(__v => __obj.updateDynamic("QuestionTitle")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      Risk.foreach(__v => __obj.updateDynamic("Risk")(__v.asInstanceOf[js.Any]))
      SelectedChoices.foreach(__v => __obj.updateDynamic("SelectedChoices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Answer]
    }
  }

  /** An answer summary of a lens review in a workload.
    */
  @js.native
  trait AnswerSummary extends js.Object {
    var ChoiceAnswerSummaries: js.UndefOr[ChoiceAnswerSummaries]
    var Choices: js.UndefOr[Choices]
    var IsApplicable: js.UndefOr[IsApplicable]
    var PillarId: js.UndefOr[PillarId]
    var QuestionId: js.UndefOr[QuestionId]
    var QuestionTitle: js.UndefOr[QuestionTitle]
    var Reason: js.UndefOr[AnswerReason]
    var Risk: js.UndefOr[Risk]
    var SelectedChoices: js.UndefOr[SelectedChoices]
  }

  object AnswerSummary {
    @inline
    def apply(
        ChoiceAnswerSummaries: js.UndefOr[ChoiceAnswerSummaries] = js.undefined,
        Choices: js.UndefOr[Choices] = js.undefined,
        IsApplicable: js.UndefOr[IsApplicable] = js.undefined,
        PillarId: js.UndefOr[PillarId] = js.undefined,
        QuestionId: js.UndefOr[QuestionId] = js.undefined,
        QuestionTitle: js.UndefOr[QuestionTitle] = js.undefined,
        Reason: js.UndefOr[AnswerReason] = js.undefined,
        Risk: js.UndefOr[Risk] = js.undefined,
        SelectedChoices: js.UndefOr[SelectedChoices] = js.undefined
    ): AnswerSummary = {
      val __obj = js.Dynamic.literal()
      ChoiceAnswerSummaries.foreach(__v => __obj.updateDynamic("ChoiceAnswerSummaries")(__v.asInstanceOf[js.Any]))
      Choices.foreach(__v => __obj.updateDynamic("Choices")(__v.asInstanceOf[js.Any]))
      IsApplicable.foreach(__v => __obj.updateDynamic("IsApplicable")(__v.asInstanceOf[js.Any]))
      PillarId.foreach(__v => __obj.updateDynamic("PillarId")(__v.asInstanceOf[js.Any]))
      QuestionId.foreach(__v => __obj.updateDynamic("QuestionId")(__v.asInstanceOf[js.Any]))
      QuestionTitle.foreach(__v => __obj.updateDynamic("QuestionTitle")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      Risk.foreach(__v => __obj.updateDynamic("Risk")(__v.asInstanceOf[js.Any]))
      SelectedChoices.foreach(__v => __obj.updateDynamic("SelectedChoices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnswerSummary]
    }
  }

  /** Input to associate lens reviews.
    */
  @js.native
  trait AssociateLensesInput extends js.Object {
    var LensAliases: LensAliases
    var WorkloadId: WorkloadId
  }

  object AssociateLensesInput {
    @inline
    def apply(
        LensAliases: LensAliases,
        WorkloadId: WorkloadId
    ): AssociateLensesInput = {
      val __obj = js.Dynamic.literal(
        "LensAliases" -> LensAliases.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateLensesInput]
    }
  }

  /** A choice available to answer question.
    */
  @js.native
  trait Choice extends js.Object {
    var ChoiceId: js.UndefOr[ChoiceId]
    var Description: js.UndefOr[ChoiceDescription]
    var HelpfulResource: js.UndefOr[ChoiceContent]
    var ImprovementPlan: js.UndefOr[ChoiceContent]
    var Title: js.UndefOr[ChoiceTitle]
  }

  object Choice {
    @inline
    def apply(
        ChoiceId: js.UndefOr[ChoiceId] = js.undefined,
        Description: js.UndefOr[ChoiceDescription] = js.undefined,
        HelpfulResource: js.UndefOr[ChoiceContent] = js.undefined,
        ImprovementPlan: js.UndefOr[ChoiceContent] = js.undefined,
        Title: js.UndefOr[ChoiceTitle] = js.undefined
    ): Choice = {
      val __obj = js.Dynamic.literal()
      ChoiceId.foreach(__v => __obj.updateDynamic("ChoiceId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HelpfulResource.foreach(__v => __obj.updateDynamic("HelpfulResource")(__v.asInstanceOf[js.Any]))
      ImprovementPlan.foreach(__v => __obj.updateDynamic("ImprovementPlan")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Choice]
    }
  }

  /** A choice that has been answered on a question in your workload.
    */
  @js.native
  trait ChoiceAnswer extends js.Object {
    var ChoiceId: js.UndefOr[ChoiceId]
    var Notes: js.UndefOr[ChoiceNotes]
    var Reason: js.UndefOr[ChoiceReason]
    var Status: js.UndefOr[ChoiceStatus]
  }

  object ChoiceAnswer {
    @inline
    def apply(
        ChoiceId: js.UndefOr[ChoiceId] = js.undefined,
        Notes: js.UndefOr[ChoiceNotes] = js.undefined,
        Reason: js.UndefOr[ChoiceReason] = js.undefined,
        Status: js.UndefOr[ChoiceStatus] = js.undefined
    ): ChoiceAnswer = {
      val __obj = js.Dynamic.literal()
      ChoiceId.foreach(__v => __obj.updateDynamic("ChoiceId")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChoiceAnswer]
    }
  }

  /** A choice summary that has been answered on a question in your workload.
    */
  @js.native
  trait ChoiceAnswerSummary extends js.Object {
    var ChoiceId: js.UndefOr[ChoiceId]
    var Reason: js.UndefOr[ChoiceReason]
    var Status: js.UndefOr[ChoiceStatus]
  }

  object ChoiceAnswerSummary {
    @inline
    def apply(
        ChoiceId: js.UndefOr[ChoiceId] = js.undefined,
        Reason: js.UndefOr[ChoiceReason] = js.undefined,
        Status: js.UndefOr[ChoiceStatus] = js.undefined
    ): ChoiceAnswerSummary = {
      val __obj = js.Dynamic.literal()
      ChoiceId.foreach(__v => __obj.updateDynamic("ChoiceId")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChoiceAnswerSummary]
    }
  }

  /** The choice content.
    */
  @js.native
  trait ChoiceContent extends js.Object {
    var DisplayText: js.UndefOr[ChoiceContentDisplayText]
    var Url: js.UndefOr[ChoiceContentUrl]
  }

  object ChoiceContent {
    @inline
    def apply(
        DisplayText: js.UndefOr[ChoiceContentDisplayText] = js.undefined,
        Url: js.UndefOr[ChoiceContentUrl] = js.undefined
    ): ChoiceContent = {
      val __obj = js.Dynamic.literal()
      DisplayText.foreach(__v => __obj.updateDynamic("DisplayText")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChoiceContent]
    }
  }

  /** The choice level improvement plan.
    */
  @js.native
  trait ChoiceImprovementPlan extends js.Object {
    var ChoiceId: js.UndefOr[ChoiceId]
    var DisplayText: js.UndefOr[DisplayText]
    var ImprovementPlanUrl: js.UndefOr[ImprovementPlanUrl]
  }

  object ChoiceImprovementPlan {
    @inline
    def apply(
        ChoiceId: js.UndefOr[ChoiceId] = js.undefined,
        DisplayText: js.UndefOr[DisplayText] = js.undefined,
        ImprovementPlanUrl: js.UndefOr[ImprovementPlanUrl] = js.undefined
    ): ChoiceImprovementPlan = {
      val __obj = js.Dynamic.literal()
      ChoiceId.foreach(__v => __obj.updateDynamic("ChoiceId")(__v.asInstanceOf[js.Any]))
      DisplayText.foreach(__v => __obj.updateDynamic("DisplayText")(__v.asInstanceOf[js.Any]))
      ImprovementPlanUrl.foreach(__v => __obj.updateDynamic("ImprovementPlanUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChoiceImprovementPlan]
    }
  }

  /** A list of choices to be updated.
    */
  @js.native
  trait ChoiceUpdate extends js.Object {
    var Status: ChoiceStatus
    var Notes: js.UndefOr[ChoiceNotes]
    var Reason: js.UndefOr[ChoiceReason]
  }

  object ChoiceUpdate {
    @inline
    def apply(
        Status: ChoiceStatus,
        Notes: js.UndefOr[ChoiceNotes] = js.undefined,
        Reason: js.UndefOr[ChoiceReason] = js.undefined
    ): ChoiceUpdate = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChoiceUpdate]
    }
  }

  @js.native
  trait CreateLensShareInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var LensAlias: LensAlias
    var SharedWith: SharedWith
  }

  object CreateLensShareInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        LensAlias: LensAlias,
        SharedWith: SharedWith
    ): CreateLensShareInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "SharedWith" -> SharedWith.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateLensShareInput]
    }
  }

  @js.native
  trait CreateLensShareOutput extends js.Object {
    var ShareId: js.UndefOr[ShareId]
  }

  object CreateLensShareOutput {
    @inline
    def apply(
        ShareId: js.UndefOr[ShareId] = js.undefined
    ): CreateLensShareOutput = {
      val __obj = js.Dynamic.literal()
      ShareId.foreach(__v => __obj.updateDynamic("ShareId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLensShareOutput]
    }
  }

  @js.native
  trait CreateLensVersionInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var LensAlias: LensAlias
    var LensVersion: LensVersion
    var IsMajorVersion: js.UndefOr[IsMajorVersion]
  }

  object CreateLensVersionInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        LensAlias: LensAlias,
        LensVersion: LensVersion,
        IsMajorVersion: js.UndefOr[IsMajorVersion] = js.undefined
    ): CreateLensVersionInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "LensVersion" -> LensVersion.asInstanceOf[js.Any]
      )

      IsMajorVersion.foreach(__v => __obj.updateDynamic("IsMajorVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLensVersionInput]
    }
  }

  @js.native
  trait CreateLensVersionOutput extends js.Object {
    var LensArn: js.UndefOr[LensArn]
    var LensVersion: js.UndefOr[LensVersion]
  }

  object CreateLensVersionOutput {
    @inline
    def apply(
        LensArn: js.UndefOr[LensArn] = js.undefined,
        LensVersion: js.UndefOr[LensVersion] = js.undefined
    ): CreateLensVersionOutput = {
      val __obj = js.Dynamic.literal()
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      LensVersion.foreach(__v => __obj.updateDynamic("LensVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLensVersionOutput]
    }
  }

  /** Input for milestone creation.
    */
  @js.native
  trait CreateMilestoneInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var MilestoneName: MilestoneName
    var WorkloadId: WorkloadId
  }

  object CreateMilestoneInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        MilestoneName: MilestoneName,
        WorkloadId: WorkloadId
    ): CreateMilestoneInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "MilestoneName" -> MilestoneName.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateMilestoneInput]
    }
  }

  /** Output of a create milestone call.
    */
  @js.native
  trait CreateMilestoneOutput extends js.Object {
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object CreateMilestoneOutput {
    @inline
    def apply(
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): CreateMilestoneOutput = {
      val __obj = js.Dynamic.literal()
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMilestoneOutput]
    }
  }

  /** Input for workload creation.
    */
  @js.native
  trait CreateWorkloadInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var Description: WorkloadDescription
    var Environment: WorkloadEnvironment
    var Lenses: WorkloadLenses
    var ReviewOwner: WorkloadReviewOwner
    var WorkloadName: WorkloadName
    var AccountIds: js.UndefOr[WorkloadAccountIds]
    var ArchitecturalDesign: js.UndefOr[WorkloadArchitecturalDesign]
    var AwsRegions: js.UndefOr[WorkloadAwsRegions]
    var Industry: js.UndefOr[WorkloadIndustry]
    var IndustryType: js.UndefOr[WorkloadIndustryType]
    var NonAwsRegions: js.UndefOr[WorkloadNonAwsRegions]
    var Notes: js.UndefOr[Notes]
    var PillarPriorities: js.UndefOr[WorkloadPillarPriorities]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateWorkloadInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        Description: WorkloadDescription,
        Environment: WorkloadEnvironment,
        Lenses: WorkloadLenses,
        ReviewOwner: WorkloadReviewOwner,
        WorkloadName: WorkloadName,
        AccountIds: js.UndefOr[WorkloadAccountIds] = js.undefined,
        ArchitecturalDesign: js.UndefOr[WorkloadArchitecturalDesign] = js.undefined,
        AwsRegions: js.UndefOr[WorkloadAwsRegions] = js.undefined,
        Industry: js.UndefOr[WorkloadIndustry] = js.undefined,
        IndustryType: js.UndefOr[WorkloadIndustryType] = js.undefined,
        NonAwsRegions: js.UndefOr[WorkloadNonAwsRegions] = js.undefined,
        Notes: js.UndefOr[Notes] = js.undefined,
        PillarPriorities: js.UndefOr[WorkloadPillarPriorities] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateWorkloadInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Environment" -> Environment.asInstanceOf[js.Any],
        "Lenses" -> Lenses.asInstanceOf[js.Any],
        "ReviewOwner" -> ReviewOwner.asInstanceOf[js.Any],
        "WorkloadName" -> WorkloadName.asInstanceOf[js.Any]
      )

      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      ArchitecturalDesign.foreach(__v => __obj.updateDynamic("ArchitecturalDesign")(__v.asInstanceOf[js.Any]))
      AwsRegions.foreach(__v => __obj.updateDynamic("AwsRegions")(__v.asInstanceOf[js.Any]))
      Industry.foreach(__v => __obj.updateDynamic("Industry")(__v.asInstanceOf[js.Any]))
      IndustryType.foreach(__v => __obj.updateDynamic("IndustryType")(__v.asInstanceOf[js.Any]))
      NonAwsRegions.foreach(__v => __obj.updateDynamic("NonAwsRegions")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      PillarPriorities.foreach(__v => __obj.updateDynamic("PillarPriorities")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkloadInput]
    }
  }

  /** Output of a create workload call.
    */
  @js.native
  trait CreateWorkloadOutput extends js.Object {
    var WorkloadArn: js.UndefOr[WorkloadArn]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object CreateWorkloadOutput {
    @inline
    def apply(
        WorkloadArn: js.UndefOr[WorkloadArn] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): CreateWorkloadOutput = {
      val __obj = js.Dynamic.literal()
      WorkloadArn.foreach(__v => __obj.updateDynamic("WorkloadArn")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkloadOutput]
    }
  }

  /** Input for Create Workload Share
    */
  @js.native
  trait CreateWorkloadShareInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var PermissionType: PermissionType
    var SharedWith: SharedWith
    var WorkloadId: WorkloadId
  }

  object CreateWorkloadShareInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        PermissionType: PermissionType,
        SharedWith: SharedWith,
        WorkloadId: WorkloadId
    ): CreateWorkloadShareInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "PermissionType" -> PermissionType.asInstanceOf[js.Any],
        "SharedWith" -> SharedWith.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkloadShareInput]
    }
  }

  /** Input for Create Workload Share
    */
  @js.native
  trait CreateWorkloadShareOutput extends js.Object {
    var ShareId: js.UndefOr[ShareId]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object CreateWorkloadShareOutput {
    @inline
    def apply(
        ShareId: js.UndefOr[ShareId] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): CreateWorkloadShareOutput = {
      val __obj = js.Dynamic.literal()
      ShareId.foreach(__v => __obj.updateDynamic("ShareId")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkloadShareOutput]
    }
  }

  @js.native
  trait DeleteLensInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var LensAlias: LensAlias
    var LensStatus: LensStatusType
  }

  object DeleteLensInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        LensAlias: LensAlias,
        LensStatus: LensStatusType
    ): DeleteLensInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "LensStatus" -> LensStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLensInput]
    }
  }

  @js.native
  trait DeleteLensShareInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var LensAlias: LensAlias
    var ShareId: ShareId
  }

  object DeleteLensShareInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        LensAlias: LensAlias,
        ShareId: ShareId
    ): DeleteLensShareInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "ShareId" -> ShareId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLensShareInput]
    }
  }

  /** Input for workload deletion.
    */
  @js.native
  trait DeleteWorkloadInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var WorkloadId: WorkloadId
  }

  object DeleteWorkloadInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        WorkloadId: WorkloadId
    ): DeleteWorkloadInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkloadInput]
    }
  }

  /** Input for Delete Workload Share
    */
  @js.native
  trait DeleteWorkloadShareInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var ShareId: ShareId
    var WorkloadId: WorkloadId
  }

  object DeleteWorkloadShareInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        ShareId: ShareId,
        WorkloadId: WorkloadId
    ): DeleteWorkloadShareInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "ShareId" -> ShareId.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkloadShareInput]
    }
  }

  /** Input to disassociate lens reviews.
    */
  @js.native
  trait DisassociateLensesInput extends js.Object {
    var LensAliases: LensAliases
    var WorkloadId: WorkloadId
  }

  object DisassociateLensesInput {
    @inline
    def apply(
        LensAliases: LensAliases,
        WorkloadId: WorkloadId
    ): DisassociateLensesInput = {
      val __obj = js.Dynamic.literal(
        "LensAliases" -> LensAliases.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateLensesInput]
    }
  }

  @js.native
  trait ExportLensInput extends js.Object {
    var LensAlias: LensAlias
    var LensVersion: js.UndefOr[LensVersion]
  }

  object ExportLensInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        LensVersion: js.UndefOr[LensVersion] = js.undefined
    ): ExportLensInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any]
      )

      LensVersion.foreach(__v => __obj.updateDynamic("LensVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportLensInput]
    }
  }

  @js.native
  trait ExportLensOutput extends js.Object {
    var LensJSON: js.UndefOr[LensJSON]
  }

  object ExportLensOutput {
    @inline
    def apply(
        LensJSON: js.UndefOr[LensJSON] = js.undefined
    ): ExportLensOutput = {
      val __obj = js.Dynamic.literal()
      LensJSON.foreach(__v => __obj.updateDynamic("LensJSON")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportLensOutput]
    }
  }

  /** Input to get answer.
    */
  @js.native
  trait GetAnswerInput extends js.Object {
    var LensAlias: LensAlias
    var QuestionId: QuestionId
    var WorkloadId: WorkloadId
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
  }

  object GetAnswerInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        QuestionId: QuestionId,
        WorkloadId: WorkloadId,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined
    ): GetAnswerInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "QuestionId" -> QuestionId.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnswerInput]
    }
  }

  /** Output of a get answer call.
    */
  @js.native
  trait GetAnswerOutput extends js.Object {
    var Answer: js.UndefOr[Answer]
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object GetAnswerOutput {
    @inline
    def apply(
        Answer: js.UndefOr[Answer] = js.undefined,
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): GetAnswerOutput = {
      val __obj = js.Dynamic.literal()
      Answer.foreach(__v => __obj.updateDynamic("Answer")(__v.asInstanceOf[js.Any]))
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnswerOutput]
    }
  }

  @js.native
  trait GetLensInput extends js.Object {
    var LensAlias: LensAlias
    var LensVersion: js.UndefOr[LensVersion]
  }

  object GetLensInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        LensVersion: js.UndefOr[LensVersion] = js.undefined
    ): GetLensInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any]
      )

      LensVersion.foreach(__v => __obj.updateDynamic("LensVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLensInput]
    }
  }

  @js.native
  trait GetLensOutput extends js.Object {
    var Lens: js.UndefOr[Lens]
  }

  object GetLensOutput {
    @inline
    def apply(
        Lens: js.UndefOr[Lens] = js.undefined
    ): GetLensOutput = {
      val __obj = js.Dynamic.literal()
      Lens.foreach(__v => __obj.updateDynamic("Lens")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLensOutput]
    }
  }

  /** Input to get lens review.
    */
  @js.native
  trait GetLensReviewInput extends js.Object {
    var LensAlias: LensAlias
    var WorkloadId: WorkloadId
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
  }

  object GetLensReviewInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        WorkloadId: WorkloadId,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined
    ): GetLensReviewInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLensReviewInput]
    }
  }

  /** Output of a get lens review call.
    */
  @js.native
  trait GetLensReviewOutput extends js.Object {
    var LensReview: js.UndefOr[LensReview]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object GetLensReviewOutput {
    @inline
    def apply(
        LensReview: js.UndefOr[LensReview] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): GetLensReviewOutput = {
      val __obj = js.Dynamic.literal()
      LensReview.foreach(__v => __obj.updateDynamic("LensReview")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLensReviewOutput]
    }
  }

  /** Input to get lens review report.
    */
  @js.native
  trait GetLensReviewReportInput extends js.Object {
    var LensAlias: LensAlias
    var WorkloadId: WorkloadId
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
  }

  object GetLensReviewReportInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        WorkloadId: WorkloadId,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined
    ): GetLensReviewReportInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLensReviewReportInput]
    }
  }

  /** Output of a get lens review report call.
    */
  @js.native
  trait GetLensReviewReportOutput extends js.Object {
    var LensReviewReport: js.UndefOr[LensReviewReport]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object GetLensReviewReportOutput {
    @inline
    def apply(
        LensReviewReport: js.UndefOr[LensReviewReport] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): GetLensReviewReportOutput = {
      val __obj = js.Dynamic.literal()
      LensReviewReport.foreach(__v => __obj.updateDynamic("LensReviewReport")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLensReviewReportOutput]
    }
  }

  @js.native
  trait GetLensVersionDifferenceInput extends js.Object {
    var LensAlias: LensAlias
    var BaseLensVersion: js.UndefOr[LensVersion]
    var TargetLensVersion: js.UndefOr[LensVersion]
  }

  object GetLensVersionDifferenceInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        BaseLensVersion: js.UndefOr[LensVersion] = js.undefined,
        TargetLensVersion: js.UndefOr[LensVersion] = js.undefined
    ): GetLensVersionDifferenceInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any]
      )

      BaseLensVersion.foreach(__v => __obj.updateDynamic("BaseLensVersion")(__v.asInstanceOf[js.Any]))
      TargetLensVersion.foreach(__v => __obj.updateDynamic("TargetLensVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLensVersionDifferenceInput]
    }
  }

  @js.native
  trait GetLensVersionDifferenceOutput extends js.Object {
    var BaseLensVersion: js.UndefOr[LensVersion]
    var LatestLensVersion: js.UndefOr[LensVersion]
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var TargetLensVersion: js.UndefOr[LensVersion]
    var VersionDifferences: js.UndefOr[VersionDifferences]
  }

  object GetLensVersionDifferenceOutput {
    @inline
    def apply(
        BaseLensVersion: js.UndefOr[LensVersion] = js.undefined,
        LatestLensVersion: js.UndefOr[LensVersion] = js.undefined,
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        TargetLensVersion: js.UndefOr[LensVersion] = js.undefined,
        VersionDifferences: js.UndefOr[VersionDifferences] = js.undefined
    ): GetLensVersionDifferenceOutput = {
      val __obj = js.Dynamic.literal()
      BaseLensVersion.foreach(__v => __obj.updateDynamic("BaseLensVersion")(__v.asInstanceOf[js.Any]))
      LatestLensVersion.foreach(__v => __obj.updateDynamic("LatestLensVersion")(__v.asInstanceOf[js.Any]))
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      TargetLensVersion.foreach(__v => __obj.updateDynamic("TargetLensVersion")(__v.asInstanceOf[js.Any]))
      VersionDifferences.foreach(__v => __obj.updateDynamic("VersionDifferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLensVersionDifferenceOutput]
    }
  }

  /** Input to get a milestone.
    */
  @js.native
  trait GetMilestoneInput extends js.Object {
    var MilestoneNumber: MilestoneNumber
    var WorkloadId: WorkloadId
  }

  object GetMilestoneInput {
    @inline
    def apply(
        MilestoneNumber: MilestoneNumber,
        WorkloadId: WorkloadId
    ): GetMilestoneInput = {
      val __obj = js.Dynamic.literal(
        "MilestoneNumber" -> MilestoneNumber.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMilestoneInput]
    }
  }

  /** Output of a get milestone call.
    */
  @js.native
  trait GetMilestoneOutput extends js.Object {
    var Milestone: js.UndefOr[Milestone]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object GetMilestoneOutput {
    @inline
    def apply(
        Milestone: js.UndefOr[Milestone] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): GetMilestoneOutput = {
      val __obj = js.Dynamic.literal()
      Milestone.foreach(__v => __obj.updateDynamic("Milestone")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMilestoneOutput]
    }
  }

  /** Input to get a workload.
    */
  @js.native
  trait GetWorkloadInput extends js.Object {
    var WorkloadId: WorkloadId
  }

  object GetWorkloadInput {
    @inline
    def apply(
        WorkloadId: WorkloadId
    ): GetWorkloadInput = {
      val __obj = js.Dynamic.literal(
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkloadInput]
    }
  }

  /** Output of a get workload call.
    */
  @js.native
  trait GetWorkloadOutput extends js.Object {
    var Workload: js.UndefOr[Workload]
  }

  object GetWorkloadOutput {
    @inline
    def apply(
        Workload: js.UndefOr[Workload] = js.undefined
    ): GetWorkloadOutput = {
      val __obj = js.Dynamic.literal()
      Workload.foreach(__v => __obj.updateDynamic("Workload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkloadOutput]
    }
  }

  @js.native
  trait ImportLensInput extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var JSONString: LensJSON
    var LensAlias: js.UndefOr[LensAlias]
    var Tags: js.UndefOr[TagMap]
  }

  object ImportLensInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        JSONString: LensJSON,
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ImportLensInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "JSONString" -> JSONString.asInstanceOf[js.Any]
      )

      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportLensInput]
    }
  }

  @js.native
  trait ImportLensOutput extends js.Object {
    var LensArn: js.UndefOr[LensArn]
    var Status: js.UndefOr[ImportLensStatus]
  }

  object ImportLensOutput {
    @inline
    def apply(
        LensArn: js.UndefOr[LensArn] = js.undefined,
        Status: js.UndefOr[ImportLensStatus] = js.undefined
    ): ImportLensOutput = {
      val __obj = js.Dynamic.literal()
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportLensOutput]
    }
  }

  /** An improvement summary of a lens review in a workload.
    */
  @js.native
  trait ImprovementSummary extends js.Object {
    var ImprovementPlanUrl: js.UndefOr[ImprovementPlanUrl]
    var ImprovementPlans: js.UndefOr[ChoiceImprovementPlans]
    var PillarId: js.UndefOr[PillarId]
    var QuestionId: js.UndefOr[QuestionId]
    var QuestionTitle: js.UndefOr[QuestionTitle]
    var Risk: js.UndefOr[Risk]
  }

  object ImprovementSummary {
    @inline
    def apply(
        ImprovementPlanUrl: js.UndefOr[ImprovementPlanUrl] = js.undefined,
        ImprovementPlans: js.UndefOr[ChoiceImprovementPlans] = js.undefined,
        PillarId: js.UndefOr[PillarId] = js.undefined,
        QuestionId: js.UndefOr[QuestionId] = js.undefined,
        QuestionTitle: js.UndefOr[QuestionTitle] = js.undefined,
        Risk: js.UndefOr[Risk] = js.undefined
    ): ImprovementSummary = {
      val __obj = js.Dynamic.literal()
      ImprovementPlanUrl.foreach(__v => __obj.updateDynamic("ImprovementPlanUrl")(__v.asInstanceOf[js.Any]))
      ImprovementPlans.foreach(__v => __obj.updateDynamic("ImprovementPlans")(__v.asInstanceOf[js.Any]))
      PillarId.foreach(__v => __obj.updateDynamic("PillarId")(__v.asInstanceOf[js.Any]))
      QuestionId.foreach(__v => __obj.updateDynamic("QuestionId")(__v.asInstanceOf[js.Any]))
      QuestionTitle.foreach(__v => __obj.updateDynamic("QuestionTitle")(__v.asInstanceOf[js.Any]))
      Risk.foreach(__v => __obj.updateDynamic("Risk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImprovementSummary]
    }
  }

  /** A lens return object.
    */
  @js.native
  trait Lens extends js.Object {
    var Description: js.UndefOr[LensDescription]
    var LensArn: js.UndefOr[LensArn]
    var LensVersion: js.UndefOr[LensVersion]
    var Name: js.UndefOr[LensName]
    var Owner: js.UndefOr[LensOwner]
    var ShareInvitationId: js.UndefOr[ShareInvitationId]
  }

  object Lens {
    @inline
    def apply(
        Description: js.UndefOr[LensDescription] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        LensVersion: js.UndefOr[LensVersion] = js.undefined,
        Name: js.UndefOr[LensName] = js.undefined,
        Owner: js.UndefOr[LensOwner] = js.undefined,
        ShareInvitationId: js.UndefOr[ShareInvitationId] = js.undefined
    ): Lens = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      LensVersion.foreach(__v => __obj.updateDynamic("LensVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      ShareInvitationId.foreach(__v => __obj.updateDynamic("ShareInvitationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Lens]
    }
  }

  /** A lens review of a question.
    */
  @js.native
  trait LensReview extends js.Object {
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var LensName: js.UndefOr[LensName]
    var LensStatus: js.UndefOr[LensStatus]
    var LensVersion: js.UndefOr[LensVersion]
    var NextToken: js.UndefOr[NextToken]
    var Notes: js.UndefOr[Notes]
    var PillarReviewSummaries: js.UndefOr[PillarReviewSummaries]
    var RiskCounts: js.UndefOr[RiskCounts]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object LensReview {
    @inline
    def apply(
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        LensName: js.UndefOr[LensName] = js.undefined,
        LensStatus: js.UndefOr[LensStatus] = js.undefined,
        LensVersion: js.UndefOr[LensVersion] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Notes: js.UndefOr[Notes] = js.undefined,
        PillarReviewSummaries: js.UndefOr[PillarReviewSummaries] = js.undefined,
        RiskCounts: js.UndefOr[RiskCounts] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): LensReview = {
      val __obj = js.Dynamic.literal()
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      LensName.foreach(__v => __obj.updateDynamic("LensName")(__v.asInstanceOf[js.Any]))
      LensStatus.foreach(__v => __obj.updateDynamic("LensStatus")(__v.asInstanceOf[js.Any]))
      LensVersion.foreach(__v => __obj.updateDynamic("LensVersion")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      PillarReviewSummaries.foreach(__v => __obj.updateDynamic("PillarReviewSummaries")(__v.asInstanceOf[js.Any]))
      RiskCounts.foreach(__v => __obj.updateDynamic("RiskCounts")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LensReview]
    }
  }

  /** A report of a lens review.
    */
  @js.native
  trait LensReviewReport extends js.Object {
    var Base64String: js.UndefOr[Base64String]
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
  }

  object LensReviewReport {
    @inline
    def apply(
        Base64String: js.UndefOr[Base64String] = js.undefined,
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined
    ): LensReviewReport = {
      val __obj = js.Dynamic.literal()
      Base64String.foreach(__v => __obj.updateDynamic("Base64String")(__v.asInstanceOf[js.Any]))
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LensReviewReport]
    }
  }

  /** A lens review summary of a workload.
    */
  @js.native
  trait LensReviewSummary extends js.Object {
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var LensName: js.UndefOr[LensName]
    var LensStatus: js.UndefOr[LensStatus]
    var LensVersion: js.UndefOr[LensVersion]
    var RiskCounts: js.UndefOr[RiskCounts]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object LensReviewSummary {
    @inline
    def apply(
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        LensName: js.UndefOr[LensName] = js.undefined,
        LensStatus: js.UndefOr[LensStatus] = js.undefined,
        LensVersion: js.UndefOr[LensVersion] = js.undefined,
        RiskCounts: js.UndefOr[RiskCounts] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): LensReviewSummary = {
      val __obj = js.Dynamic.literal()
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      LensName.foreach(__v => __obj.updateDynamic("LensName")(__v.asInstanceOf[js.Any]))
      LensStatus.foreach(__v => __obj.updateDynamic("LensStatus")(__v.asInstanceOf[js.Any]))
      LensVersion.foreach(__v => __obj.updateDynamic("LensVersion")(__v.asInstanceOf[js.Any]))
      RiskCounts.foreach(__v => __obj.updateDynamic("RiskCounts")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LensReviewSummary]
    }
  }

  /** A lens share summary return object.
    */
  @js.native
  trait LensShareSummary extends js.Object {
    var ShareId: js.UndefOr[ShareId]
    var SharedWith: js.UndefOr[SharedWith]
    var Status: js.UndefOr[ShareStatus]
  }

  object LensShareSummary {
    @inline
    def apply(
        ShareId: js.UndefOr[ShareId] = js.undefined,
        SharedWith: js.UndefOr[SharedWith] = js.undefined,
        Status: js.UndefOr[ShareStatus] = js.undefined
    ): LensShareSummary = {
      val __obj = js.Dynamic.literal()
      ShareId.foreach(__v => __obj.updateDynamic("ShareId")(__v.asInstanceOf[js.Any]))
      SharedWith.foreach(__v => __obj.updateDynamic("SharedWith")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LensShareSummary]
    }
  }

  /** A lens summary of a lens.
    */
  @js.native
  trait LensSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[LensDescription]
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var LensName: js.UndefOr[LensName]
    var LensStatus: js.UndefOr[LensStatus]
    var LensType: js.UndefOr[LensType]
    var LensVersion: js.UndefOr[LensVersion]
    var Owner: js.UndefOr[AwsAccountId]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object LensSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[LensDescription] = js.undefined,
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        LensName: js.UndefOr[LensName] = js.undefined,
        LensStatus: js.UndefOr[LensStatus] = js.undefined,
        LensType: js.UndefOr[LensType] = js.undefined,
        LensVersion: js.UndefOr[LensVersion] = js.undefined,
        Owner: js.UndefOr[AwsAccountId] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): LensSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      LensName.foreach(__v => __obj.updateDynamic("LensName")(__v.asInstanceOf[js.Any]))
      LensStatus.foreach(__v => __obj.updateDynamic("LensStatus")(__v.asInstanceOf[js.Any]))
      LensType.foreach(__v => __obj.updateDynamic("LensType")(__v.asInstanceOf[js.Any]))
      LensVersion.foreach(__v => __obj.updateDynamic("LensVersion")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LensSummary]
    }
  }

  /** Lens upgrade summary return object.
    */
  @js.native
  trait LensUpgradeSummary extends js.Object {
    var CurrentLensVersion: js.UndefOr[LensVersion]
    var LatestLensVersion: js.UndefOr[LensVersion]
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var WorkloadId: js.UndefOr[WorkloadId]
    var WorkloadName: js.UndefOr[WorkloadName]
  }

  object LensUpgradeSummary {
    @inline
    def apply(
        CurrentLensVersion: js.UndefOr[LensVersion] = js.undefined,
        LatestLensVersion: js.UndefOr[LensVersion] = js.undefined,
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined,
        WorkloadName: js.UndefOr[WorkloadName] = js.undefined
    ): LensUpgradeSummary = {
      val __obj = js.Dynamic.literal()
      CurrentLensVersion.foreach(__v => __obj.updateDynamic("CurrentLensVersion")(__v.asInstanceOf[js.Any]))
      LatestLensVersion.foreach(__v => __obj.updateDynamic("LatestLensVersion")(__v.asInstanceOf[js.Any]))
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      WorkloadName.foreach(__v => __obj.updateDynamic("WorkloadName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LensUpgradeSummary]
    }
  }

  /** Input to list answers.
    */
  @js.native
  trait ListAnswersInput extends js.Object {
    var LensAlias: LensAlias
    var WorkloadId: WorkloadId
    var MaxResults: js.UndefOr[ListAnswersMaxResults]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var NextToken: js.UndefOr[NextToken]
    var PillarId: js.UndefOr[PillarId]
  }

  object ListAnswersInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        WorkloadId: WorkloadId,
        MaxResults: js.UndefOr[ListAnswersMaxResults] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PillarId: js.UndefOr[PillarId] = js.undefined
    ): ListAnswersInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PillarId.foreach(__v => __obj.updateDynamic("PillarId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnswersInput]
    }
  }

  /** Output of a list answers call.
    */
  @js.native
  trait ListAnswersOutput extends js.Object {
    var AnswerSummaries: js.UndefOr[AnswerSummaries]
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var NextToken: js.UndefOr[NextToken]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object ListAnswersOutput {
    @inline
    def apply(
        AnswerSummaries: js.UndefOr[AnswerSummaries] = js.undefined,
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): ListAnswersOutput = {
      val __obj = js.Dynamic.literal()
      AnswerSummaries.foreach(__v => __obj.updateDynamic("AnswerSummaries")(__v.asInstanceOf[js.Any]))
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnswersOutput]
    }
  }

  /** Input to list lens review improvements.
    */
  @js.native
  trait ListLensReviewImprovementsInput extends js.Object {
    var LensAlias: LensAlias
    var WorkloadId: WorkloadId
    var MaxResults: js.UndefOr[ListLensReviewImprovementsMaxResults]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var NextToken: js.UndefOr[NextToken]
    var PillarId: js.UndefOr[PillarId]
  }

  object ListLensReviewImprovementsInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        WorkloadId: WorkloadId,
        MaxResults: js.UndefOr[ListLensReviewImprovementsMaxResults] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PillarId: js.UndefOr[PillarId] = js.undefined
    ): ListLensReviewImprovementsInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PillarId.foreach(__v => __obj.updateDynamic("PillarId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLensReviewImprovementsInput]
    }
  }

  /** Output of a list lens review improvements call.
    */
  @js.native
  trait ListLensReviewImprovementsOutput extends js.Object {
    var ImprovementSummaries: js.UndefOr[ImprovementSummaries]
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var NextToken: js.UndefOr[NextToken]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object ListLensReviewImprovementsOutput {
    @inline
    def apply(
        ImprovementSummaries: js.UndefOr[ImprovementSummaries] = js.undefined,
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): ListLensReviewImprovementsOutput = {
      val __obj = js.Dynamic.literal()
      ImprovementSummaries.foreach(__v => __obj.updateDynamic("ImprovementSummaries")(__v.asInstanceOf[js.Any]))
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLensReviewImprovementsOutput]
    }
  }

  /** Input to list lens reviews.
    */
  @js.native
  trait ListLensReviewsInput extends js.Object {
    var WorkloadId: WorkloadId
    var MaxResults: js.UndefOr[MaxResults]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLensReviewsInput {
    @inline
    def apply(
        WorkloadId: WorkloadId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLensReviewsInput = {
      val __obj = js.Dynamic.literal(
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLensReviewsInput]
    }
  }

  /** Output of a list lens reviews call.
    */
  @js.native
  trait ListLensReviewsOutput extends js.Object {
    var LensReviewSummaries: js.UndefOr[LensReviewSummaries]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var NextToken: js.UndefOr[NextToken]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object ListLensReviewsOutput {
    @inline
    def apply(
        LensReviewSummaries: js.UndefOr[LensReviewSummaries] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): ListLensReviewsOutput = {
      val __obj = js.Dynamic.literal()
      LensReviewSummaries.foreach(__v => __obj.updateDynamic("LensReviewSummaries")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLensReviewsOutput]
    }
  }

  @js.native
  trait ListLensSharesInput extends js.Object {
    var LensAlias: LensAlias
    var MaxResults: js.UndefOr[ListWorkloadSharesMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SharedWithPrefix: js.UndefOr[SharedWithPrefix]
  }

  object ListLensSharesInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        MaxResults: js.UndefOr[ListWorkloadSharesMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SharedWithPrefix: js.UndefOr[SharedWithPrefix] = js.undefined
    ): ListLensSharesInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SharedWithPrefix.foreach(__v => __obj.updateDynamic("SharedWithPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLensSharesInput]
    }
  }

  @js.native
  trait ListLensSharesOutput extends js.Object {
    var LensShareSummaries: js.UndefOr[LensShareSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLensSharesOutput {
    @inline
    def apply(
        LensShareSummaries: js.UndefOr[LensShareSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLensSharesOutput = {
      val __obj = js.Dynamic.literal()
      LensShareSummaries.foreach(__v => __obj.updateDynamic("LensShareSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLensSharesOutput]
    }
  }

  /** Input to list lenses.
    */
  @js.native
  trait ListLensesInput extends js.Object {
    var LensName: js.UndefOr[LensName]
    var LensStatus: js.UndefOr[LensStatusType]
    var LensType: js.UndefOr[LensType]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLensesInput {
    @inline
    def apply(
        LensName: js.UndefOr[LensName] = js.undefined,
        LensStatus: js.UndefOr[LensStatusType] = js.undefined,
        LensType: js.UndefOr[LensType] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLensesInput = {
      val __obj = js.Dynamic.literal()
      LensName.foreach(__v => __obj.updateDynamic("LensName")(__v.asInstanceOf[js.Any]))
      LensStatus.foreach(__v => __obj.updateDynamic("LensStatus")(__v.asInstanceOf[js.Any]))
      LensType.foreach(__v => __obj.updateDynamic("LensType")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLensesInput]
    }
  }

  /** Output of a list lenses call.
    */
  @js.native
  trait ListLensesOutput extends js.Object {
    var LensSummaries: js.UndefOr[LensSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLensesOutput {
    @inline
    def apply(
        LensSummaries: js.UndefOr[LensSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLensesOutput = {
      val __obj = js.Dynamic.literal()
      LensSummaries.foreach(__v => __obj.updateDynamic("LensSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLensesOutput]
    }
  }

  /** Input to list all milestones for a workload.
    */
  @js.native
  trait ListMilestonesInput extends js.Object {
    var WorkloadId: WorkloadId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMilestonesInput {
    @inline
    def apply(
        WorkloadId: WorkloadId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMilestonesInput = {
      val __obj = js.Dynamic.literal(
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMilestonesInput]
    }
  }

  /** Output of a list milestones call.
    */
  @js.native
  trait ListMilestonesOutput extends js.Object {
    var MilestoneSummaries: js.UndefOr[MilestoneSummaries]
    var NextToken: js.UndefOr[NextToken]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object ListMilestonesOutput {
    @inline
    def apply(
        MilestoneSummaries: js.UndefOr[MilestoneSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): ListMilestonesOutput = {
      val __obj = js.Dynamic.literal()
      MilestoneSummaries.foreach(__v => __obj.updateDynamic("MilestoneSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMilestonesOutput]
    }
  }

  @js.native
  trait ListNotificationsInput extends js.Object {
    var MaxResults: js.UndefOr[ListNotificationsMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object ListNotificationsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListNotificationsMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): ListNotificationsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotificationsInput]
    }
  }

  @js.native
  trait ListNotificationsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NotificationSummaries: js.UndefOr[NotificationSummaries]
  }

  object ListNotificationsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        NotificationSummaries: js.UndefOr[NotificationSummaries] = js.undefined
    ): ListNotificationsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotificationSummaries.foreach(__v => __obj.updateDynamic("NotificationSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotificationsOutput]
    }
  }

  /** Input for List Share Invitations
    */
  @js.native
  trait ListShareInvitationsInput extends js.Object {
    var LensNamePrefix: js.UndefOr[LensNamePrefix]
    var MaxResults: js.UndefOr[ListShareInvitationsMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ShareResourceType: js.UndefOr[ShareResourceType]
    var WorkloadNamePrefix: js.UndefOr[WorkloadNamePrefix]
  }

  object ListShareInvitationsInput {
    @inline
    def apply(
        LensNamePrefix: js.UndefOr[LensNamePrefix] = js.undefined,
        MaxResults: js.UndefOr[ListShareInvitationsMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ShareResourceType: js.UndefOr[ShareResourceType] = js.undefined,
        WorkloadNamePrefix: js.UndefOr[WorkloadNamePrefix] = js.undefined
    ): ListShareInvitationsInput = {
      val __obj = js.Dynamic.literal()
      LensNamePrefix.foreach(__v => __obj.updateDynamic("LensNamePrefix")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ShareResourceType.foreach(__v => __obj.updateDynamic("ShareResourceType")(__v.asInstanceOf[js.Any]))
      WorkloadNamePrefix.foreach(__v => __obj.updateDynamic("WorkloadNamePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListShareInvitationsInput]
    }
  }

  /** Input for List Share Invitations
    */
  @js.native
  trait ListShareInvitationsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ShareInvitationSummaries: js.UndefOr[ShareInvitationSummaries]
  }

  object ListShareInvitationsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ShareInvitationSummaries: js.UndefOr[ShareInvitationSummaries] = js.undefined
    ): ListShareInvitationsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ShareInvitationSummaries.foreach(__v => __obj.updateDynamic("ShareInvitationSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListShareInvitationsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var WorkloadArn: WorkloadArn
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        WorkloadArn: WorkloadArn
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "WorkloadArn" -> WorkloadArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /** Input for List Workload Share
    */
  @js.native
  trait ListWorkloadSharesInput extends js.Object {
    var WorkloadId: WorkloadId
    var MaxResults: js.UndefOr[ListWorkloadSharesMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SharedWithPrefix: js.UndefOr[SharedWithPrefix]
  }

  object ListWorkloadSharesInput {
    @inline
    def apply(
        WorkloadId: WorkloadId,
        MaxResults: js.UndefOr[ListWorkloadSharesMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SharedWithPrefix: js.UndefOr[SharedWithPrefix] = js.undefined
    ): ListWorkloadSharesInput = {
      val __obj = js.Dynamic.literal(
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SharedWithPrefix.foreach(__v => __obj.updateDynamic("SharedWithPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkloadSharesInput]
    }
  }

  /** Input for List Workload Share
    */
  @js.native
  trait ListWorkloadSharesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WorkloadId: js.UndefOr[WorkloadId]
    var WorkloadShareSummaries: js.UndefOr[WorkloadShareSummaries]
  }

  object ListWorkloadSharesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined,
        WorkloadShareSummaries: js.UndefOr[WorkloadShareSummaries] = js.undefined
    ): ListWorkloadSharesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      WorkloadShareSummaries.foreach(__v => __obj.updateDynamic("WorkloadShareSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkloadSharesOutput]
    }
  }

  /** Input to list all workloads.
    */
  @js.native
  trait ListWorkloadsInput extends js.Object {
    var MaxResults: js.UndefOr[ListWorkloadsMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var WorkloadNamePrefix: js.UndefOr[WorkloadNamePrefix]
  }

  object ListWorkloadsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListWorkloadsMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WorkloadNamePrefix: js.UndefOr[WorkloadNamePrefix] = js.undefined
    ): ListWorkloadsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkloadNamePrefix.foreach(__v => __obj.updateDynamic("WorkloadNamePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkloadsInput]
    }
  }

  /** Output of a list workloads call.
    */
  @js.native
  trait ListWorkloadsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WorkloadSummaries: js.UndefOr[WorkloadSummaries]
  }

  object ListWorkloadsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WorkloadSummaries: js.UndefOr[WorkloadSummaries] = js.undefined
    ): ListWorkloadsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkloadSummaries.foreach(__v => __obj.updateDynamic("WorkloadSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkloadsOutput]
    }
  }

  /** A milestone return object.
    */
  @js.native
  trait Milestone extends js.Object {
    var MilestoneName: js.UndefOr[MilestoneName]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var RecordedAt: js.UndefOr[Timestamp]
    var Workload: js.UndefOr[Workload]
  }

  object Milestone {
    @inline
    def apply(
        MilestoneName: js.UndefOr[MilestoneName] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        RecordedAt: js.UndefOr[Timestamp] = js.undefined,
        Workload: js.UndefOr[Workload] = js.undefined
    ): Milestone = {
      val __obj = js.Dynamic.literal()
      MilestoneName.foreach(__v => __obj.updateDynamic("MilestoneName")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      RecordedAt.foreach(__v => __obj.updateDynamic("RecordedAt")(__v.asInstanceOf[js.Any]))
      Workload.foreach(__v => __obj.updateDynamic("Workload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Milestone]
    }
  }

  /** A milestone summary return object.
    */
  @js.native
  trait MilestoneSummary extends js.Object {
    var MilestoneName: js.UndefOr[MilestoneName]
    var MilestoneNumber: js.UndefOr[MilestoneNumber]
    var RecordedAt: js.UndefOr[Timestamp]
    var WorkloadSummary: js.UndefOr[WorkloadSummary]
  }

  object MilestoneSummary {
    @inline
    def apply(
        MilestoneName: js.UndefOr[MilestoneName] = js.undefined,
        MilestoneNumber: js.UndefOr[MilestoneNumber] = js.undefined,
        RecordedAt: js.UndefOr[Timestamp] = js.undefined,
        WorkloadSummary: js.UndefOr[WorkloadSummary] = js.undefined
    ): MilestoneSummary = {
      val __obj = js.Dynamic.literal()
      MilestoneName.foreach(__v => __obj.updateDynamic("MilestoneName")(__v.asInstanceOf[js.Any]))
      MilestoneNumber.foreach(__v => __obj.updateDynamic("MilestoneNumber")(__v.asInstanceOf[js.Any]))
      RecordedAt.foreach(__v => __obj.updateDynamic("RecordedAt")(__v.asInstanceOf[js.Any]))
      WorkloadSummary.foreach(__v => __obj.updateDynamic("WorkloadSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MilestoneSummary]
    }
  }

  /** A notification summary return object.
    */
  @js.native
  trait NotificationSummary extends js.Object {
    var LensUpgradeSummary: js.UndefOr[LensUpgradeSummary]
    var Type: js.UndefOr[NotificationType]
  }

  object NotificationSummary {
    @inline
    def apply(
        LensUpgradeSummary: js.UndefOr[LensUpgradeSummary] = js.undefined,
        Type: js.UndefOr[NotificationType] = js.undefined
    ): NotificationSummary = {
      val __obj = js.Dynamic.literal()
      LensUpgradeSummary.foreach(__v => __obj.updateDynamic("LensUpgradeSummary")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationSummary]
    }
  }

  /** A pillar difference return object.
    */
  @js.native
  trait PillarDifference extends js.Object {
    var DifferenceStatus: js.UndefOr[DifferenceStatus]
    var PillarId: js.UndefOr[PillarId]
    var PillarName: js.UndefOr[PillarName]
    var QuestionDifferences: js.UndefOr[QuestionDifferences]
  }

  object PillarDifference {
    @inline
    def apply(
        DifferenceStatus: js.UndefOr[DifferenceStatus] = js.undefined,
        PillarId: js.UndefOr[PillarId] = js.undefined,
        PillarName: js.UndefOr[PillarName] = js.undefined,
        QuestionDifferences: js.UndefOr[QuestionDifferences] = js.undefined
    ): PillarDifference = {
      val __obj = js.Dynamic.literal()
      DifferenceStatus.foreach(__v => __obj.updateDynamic("DifferenceStatus")(__v.asInstanceOf[js.Any]))
      PillarId.foreach(__v => __obj.updateDynamic("PillarId")(__v.asInstanceOf[js.Any]))
      PillarName.foreach(__v => __obj.updateDynamic("PillarName")(__v.asInstanceOf[js.Any]))
      QuestionDifferences.foreach(__v => __obj.updateDynamic("QuestionDifferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PillarDifference]
    }
  }

  /** A pillar review summary of a lens review.
    */
  @js.native
  trait PillarReviewSummary extends js.Object {
    var Notes: js.UndefOr[Notes]
    var PillarId: js.UndefOr[PillarId]
    var PillarName: js.UndefOr[PillarName]
    var RiskCounts: js.UndefOr[RiskCounts]
  }

  object PillarReviewSummary {
    @inline
    def apply(
        Notes: js.UndefOr[Notes] = js.undefined,
        PillarId: js.UndefOr[PillarId] = js.undefined,
        PillarName: js.UndefOr[PillarName] = js.undefined,
        RiskCounts: js.UndefOr[RiskCounts] = js.undefined
    ): PillarReviewSummary = {
      val __obj = js.Dynamic.literal()
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      PillarId.foreach(__v => __obj.updateDynamic("PillarId")(__v.asInstanceOf[js.Any]))
      PillarName.foreach(__v => __obj.updateDynamic("PillarName")(__v.asInstanceOf[js.Any]))
      RiskCounts.foreach(__v => __obj.updateDynamic("RiskCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PillarReviewSummary]
    }
  }

  /** A question difference return object.
    */
  @js.native
  trait QuestionDifference extends js.Object {
    var DifferenceStatus: js.UndefOr[DifferenceStatus]
    var QuestionId: js.UndefOr[QuestionId]
    var QuestionTitle: js.UndefOr[QuestionTitle]
  }

  object QuestionDifference {
    @inline
    def apply(
        DifferenceStatus: js.UndefOr[DifferenceStatus] = js.undefined,
        QuestionId: js.UndefOr[QuestionId] = js.undefined,
        QuestionTitle: js.UndefOr[QuestionTitle] = js.undefined
    ): QuestionDifference = {
      val __obj = js.Dynamic.literal()
      DifferenceStatus.foreach(__v => __obj.updateDynamic("DifferenceStatus")(__v.asInstanceOf[js.Any]))
      QuestionId.foreach(__v => __obj.updateDynamic("QuestionId")(__v.asInstanceOf[js.Any]))
      QuestionTitle.foreach(__v => __obj.updateDynamic("QuestionTitle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuestionDifference]
    }
  }

  /** The share invitation.
    */
  @js.native
  trait ShareInvitation extends js.Object {
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var ShareInvitationId: js.UndefOr[ShareInvitationId]
    var ShareResourceType: js.UndefOr[ShareResourceType]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object ShareInvitation {
    @inline
    def apply(
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        ShareInvitationId: js.UndefOr[ShareInvitationId] = js.undefined,
        ShareResourceType: js.UndefOr[ShareResourceType] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): ShareInvitation = {
      val __obj = js.Dynamic.literal()
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      ShareInvitationId.foreach(__v => __obj.updateDynamic("ShareInvitationId")(__v.asInstanceOf[js.Any]))
      ShareResourceType.foreach(__v => __obj.updateDynamic("ShareResourceType")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareInvitation]
    }
  }

  /** A share invitation summary return object.
    */
  @js.native
  trait ShareInvitationSummary extends js.Object {
    var LensArn: js.UndefOr[LensArn]
    var LensName: js.UndefOr[LensName]
    var PermissionType: js.UndefOr[PermissionType]
    var ShareInvitationId: js.UndefOr[ShareInvitationId]
    var ShareResourceType: js.UndefOr[ShareResourceType]
    var SharedBy: js.UndefOr[AwsAccountId]
    var SharedWith: js.UndefOr[SharedWith]
    var WorkloadId: js.UndefOr[WorkloadId]
    var WorkloadName: js.UndefOr[WorkloadName]
  }

  object ShareInvitationSummary {
    @inline
    def apply(
        LensArn: js.UndefOr[LensArn] = js.undefined,
        LensName: js.UndefOr[LensName] = js.undefined,
        PermissionType: js.UndefOr[PermissionType] = js.undefined,
        ShareInvitationId: js.UndefOr[ShareInvitationId] = js.undefined,
        ShareResourceType: js.UndefOr[ShareResourceType] = js.undefined,
        SharedBy: js.UndefOr[AwsAccountId] = js.undefined,
        SharedWith: js.UndefOr[SharedWith] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined,
        WorkloadName: js.UndefOr[WorkloadName] = js.undefined
    ): ShareInvitationSummary = {
      val __obj = js.Dynamic.literal()
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      LensName.foreach(__v => __obj.updateDynamic("LensName")(__v.asInstanceOf[js.Any]))
      PermissionType.foreach(__v => __obj.updateDynamic("PermissionType")(__v.asInstanceOf[js.Any]))
      ShareInvitationId.foreach(__v => __obj.updateDynamic("ShareInvitationId")(__v.asInstanceOf[js.Any]))
      ShareResourceType.foreach(__v => __obj.updateDynamic("ShareResourceType")(__v.asInstanceOf[js.Any]))
      SharedBy.foreach(__v => __obj.updateDynamic("SharedBy")(__v.asInstanceOf[js.Any]))
      SharedWith.foreach(__v => __obj.updateDynamic("SharedWith")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      WorkloadName.foreach(__v => __obj.updateDynamic("WorkloadName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareInvitationSummary]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var Tags: TagMap
    var WorkloadArn: WorkloadArn
  }

  object TagResourceInput {
    @inline
    def apply(
        Tags: TagMap,
        WorkloadArn: WorkloadArn
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "Tags" -> Tags.asInstanceOf[js.Any],
        "WorkloadArn" -> WorkloadArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var TagKeys: TagKeyList
    var WorkloadArn: WorkloadArn
  }

  object UntagResourceInput {
    @inline
    def apply(
        TagKeys: TagKeyList,
        WorkloadArn: WorkloadArn
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "TagKeys" -> TagKeys.asInstanceOf[js.Any],
        "WorkloadArn" -> WorkloadArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  /** Input to update answer.
    */
  @js.native
  trait UpdateAnswerInput extends js.Object {
    var LensAlias: LensAlias
    var QuestionId: QuestionId
    var WorkloadId: WorkloadId
    var ChoiceUpdates: js.UndefOr[ChoiceUpdates]
    var IsApplicable: js.UndefOr[IsApplicable]
    var Notes: js.UndefOr[Notes]
    var Reason: js.UndefOr[AnswerReason]
    var SelectedChoices: js.UndefOr[SelectedChoices]
  }

  object UpdateAnswerInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        QuestionId: QuestionId,
        WorkloadId: WorkloadId,
        ChoiceUpdates: js.UndefOr[ChoiceUpdates] = js.undefined,
        IsApplicable: js.UndefOr[IsApplicable] = js.undefined,
        Notes: js.UndefOr[Notes] = js.undefined,
        Reason: js.UndefOr[AnswerReason] = js.undefined,
        SelectedChoices: js.UndefOr[SelectedChoices] = js.undefined
    ): UpdateAnswerInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "QuestionId" -> QuestionId.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      ChoiceUpdates.foreach(__v => __obj.updateDynamic("ChoiceUpdates")(__v.asInstanceOf[js.Any]))
      IsApplicable.foreach(__v => __obj.updateDynamic("IsApplicable")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      SelectedChoices.foreach(__v => __obj.updateDynamic("SelectedChoices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnswerInput]
    }
  }

  /** Output of a update answer call.
    */
  @js.native
  trait UpdateAnswerOutput extends js.Object {
    var Answer: js.UndefOr[Answer]
    var LensAlias: js.UndefOr[LensAlias]
    var LensArn: js.UndefOr[LensArn]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object UpdateAnswerOutput {
    @inline
    def apply(
        Answer: js.UndefOr[Answer] = js.undefined,
        LensAlias: js.UndefOr[LensAlias] = js.undefined,
        LensArn: js.UndefOr[LensArn] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): UpdateAnswerOutput = {
      val __obj = js.Dynamic.literal()
      Answer.foreach(__v => __obj.updateDynamic("Answer")(__v.asInstanceOf[js.Any]))
      LensAlias.foreach(__v => __obj.updateDynamic("LensAlias")(__v.asInstanceOf[js.Any]))
      LensArn.foreach(__v => __obj.updateDynamic("LensArn")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnswerOutput]
    }
  }

  /** Input for update lens review.
    */
  @js.native
  trait UpdateLensReviewInput extends js.Object {
    var LensAlias: LensAlias
    var WorkloadId: WorkloadId
    var LensNotes: js.UndefOr[Notes]
    var PillarNotes: js.UndefOr[PillarNotes]
  }

  object UpdateLensReviewInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        WorkloadId: WorkloadId,
        LensNotes: js.UndefOr[Notes] = js.undefined,
        PillarNotes: js.UndefOr[PillarNotes] = js.undefined
    ): UpdateLensReviewInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      LensNotes.foreach(__v => __obj.updateDynamic("LensNotes")(__v.asInstanceOf[js.Any]))
      PillarNotes.foreach(__v => __obj.updateDynamic("PillarNotes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLensReviewInput]
    }
  }

  /** Output of a update lens review call.
    */
  @js.native
  trait UpdateLensReviewOutput extends js.Object {
    var LensReview: js.UndefOr[LensReview]
    var WorkloadId: js.UndefOr[WorkloadId]
  }

  object UpdateLensReviewOutput {
    @inline
    def apply(
        LensReview: js.UndefOr[LensReview] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined
    ): UpdateLensReviewOutput = {
      val __obj = js.Dynamic.literal()
      LensReview.foreach(__v => __obj.updateDynamic("LensReview")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLensReviewOutput]
    }
  }

  /** Input for Update Share Invitation
    */
  @js.native
  trait UpdateShareInvitationInput extends js.Object {
    var ShareInvitationAction: ShareInvitationAction
    var ShareInvitationId: ShareInvitationId
  }

  object UpdateShareInvitationInput {
    @inline
    def apply(
        ShareInvitationAction: ShareInvitationAction,
        ShareInvitationId: ShareInvitationId
    ): UpdateShareInvitationInput = {
      val __obj = js.Dynamic.literal(
        "ShareInvitationAction" -> ShareInvitationAction.asInstanceOf[js.Any],
        "ShareInvitationId" -> ShareInvitationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateShareInvitationInput]
    }
  }

  @js.native
  trait UpdateShareInvitationOutput extends js.Object {
    var ShareInvitation: js.UndefOr[ShareInvitation]
  }

  object UpdateShareInvitationOutput {
    @inline
    def apply(
        ShareInvitation: js.UndefOr[ShareInvitation] = js.undefined
    ): UpdateShareInvitationOutput = {
      val __obj = js.Dynamic.literal()
      ShareInvitation.foreach(__v => __obj.updateDynamic("ShareInvitation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateShareInvitationOutput]
    }
  }

  /** Input to update a workload.
    */
  @js.native
  trait UpdateWorkloadInput extends js.Object {
    var WorkloadId: WorkloadId
    var AccountIds: js.UndefOr[WorkloadAccountIds]
    var ArchitecturalDesign: js.UndefOr[WorkloadArchitecturalDesign]
    var AwsRegions: js.UndefOr[WorkloadAwsRegions]
    var Description: js.UndefOr[WorkloadDescription]
    var Environment: js.UndefOr[WorkloadEnvironment]
    var ImprovementStatus: js.UndefOr[WorkloadImprovementStatus]
    var Industry: js.UndefOr[WorkloadIndustry]
    var IndustryType: js.UndefOr[WorkloadIndustryType]
    var IsReviewOwnerUpdateAcknowledged: js.UndefOr[IsReviewOwnerUpdateAcknowledged]
    var NonAwsRegions: js.UndefOr[WorkloadNonAwsRegions]
    var Notes: js.UndefOr[Notes]
    var PillarPriorities: js.UndefOr[WorkloadPillarPriorities]
    var ReviewOwner: js.UndefOr[WorkloadReviewOwner]
    var WorkloadName: js.UndefOr[WorkloadName]
  }

  object UpdateWorkloadInput {
    @inline
    def apply(
        WorkloadId: WorkloadId,
        AccountIds: js.UndefOr[WorkloadAccountIds] = js.undefined,
        ArchitecturalDesign: js.UndefOr[WorkloadArchitecturalDesign] = js.undefined,
        AwsRegions: js.UndefOr[WorkloadAwsRegions] = js.undefined,
        Description: js.UndefOr[WorkloadDescription] = js.undefined,
        Environment: js.UndefOr[WorkloadEnvironment] = js.undefined,
        ImprovementStatus: js.UndefOr[WorkloadImprovementStatus] = js.undefined,
        Industry: js.UndefOr[WorkloadIndustry] = js.undefined,
        IndustryType: js.UndefOr[WorkloadIndustryType] = js.undefined,
        IsReviewOwnerUpdateAcknowledged: js.UndefOr[IsReviewOwnerUpdateAcknowledged] = js.undefined,
        NonAwsRegions: js.UndefOr[WorkloadNonAwsRegions] = js.undefined,
        Notes: js.UndefOr[Notes] = js.undefined,
        PillarPriorities: js.UndefOr[WorkloadPillarPriorities] = js.undefined,
        ReviewOwner: js.UndefOr[WorkloadReviewOwner] = js.undefined,
        WorkloadName: js.UndefOr[WorkloadName] = js.undefined
    ): UpdateWorkloadInput = {
      val __obj = js.Dynamic.literal(
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      ArchitecturalDesign.foreach(__v => __obj.updateDynamic("ArchitecturalDesign")(__v.asInstanceOf[js.Any]))
      AwsRegions.foreach(__v => __obj.updateDynamic("AwsRegions")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ImprovementStatus.foreach(__v => __obj.updateDynamic("ImprovementStatus")(__v.asInstanceOf[js.Any]))
      Industry.foreach(__v => __obj.updateDynamic("Industry")(__v.asInstanceOf[js.Any]))
      IndustryType.foreach(__v => __obj.updateDynamic("IndustryType")(__v.asInstanceOf[js.Any]))
      IsReviewOwnerUpdateAcknowledged.foreach(__v => __obj.updateDynamic("IsReviewOwnerUpdateAcknowledged")(__v.asInstanceOf[js.Any]))
      NonAwsRegions.foreach(__v => __obj.updateDynamic("NonAwsRegions")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      PillarPriorities.foreach(__v => __obj.updateDynamic("PillarPriorities")(__v.asInstanceOf[js.Any]))
      ReviewOwner.foreach(__v => __obj.updateDynamic("ReviewOwner")(__v.asInstanceOf[js.Any]))
      WorkloadName.foreach(__v => __obj.updateDynamic("WorkloadName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkloadInput]
    }
  }

  /** Output of an update workload call.
    */
  @js.native
  trait UpdateWorkloadOutput extends js.Object {
    var Workload: js.UndefOr[Workload]
  }

  object UpdateWorkloadOutput {
    @inline
    def apply(
        Workload: js.UndefOr[Workload] = js.undefined
    ): UpdateWorkloadOutput = {
      val __obj = js.Dynamic.literal()
      Workload.foreach(__v => __obj.updateDynamic("Workload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkloadOutput]
    }
  }

  /** Input for Update Workload Share
    */
  @js.native
  trait UpdateWorkloadShareInput extends js.Object {
    var PermissionType: PermissionType
    var ShareId: ShareId
    var WorkloadId: WorkloadId
  }

  object UpdateWorkloadShareInput {
    @inline
    def apply(
        PermissionType: PermissionType,
        ShareId: ShareId,
        WorkloadId: WorkloadId
    ): UpdateWorkloadShareInput = {
      val __obj = js.Dynamic.literal(
        "PermissionType" -> PermissionType.asInstanceOf[js.Any],
        "ShareId" -> ShareId.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateWorkloadShareInput]
    }
  }

  /** Input for Update Workload Share
    */
  @js.native
  trait UpdateWorkloadShareOutput extends js.Object {
    var WorkloadId: js.UndefOr[WorkloadId]
    var WorkloadShare: js.UndefOr[WorkloadShare]
  }

  object UpdateWorkloadShareOutput {
    @inline
    def apply(
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined,
        WorkloadShare: js.UndefOr[WorkloadShare] = js.undefined
    ): UpdateWorkloadShareOutput = {
      val __obj = js.Dynamic.literal()
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      WorkloadShare.foreach(__v => __obj.updateDynamic("WorkloadShare")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkloadShareOutput]
    }
  }

  @js.native
  trait UpgradeLensReviewInput extends js.Object {
    var LensAlias: LensAlias
    var MilestoneName: MilestoneName
    var WorkloadId: WorkloadId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object UpgradeLensReviewInput {
    @inline
    def apply(
        LensAlias: LensAlias,
        MilestoneName: MilestoneName,
        WorkloadId: WorkloadId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): UpgradeLensReviewInput = {
      val __obj = js.Dynamic.literal(
        "LensAlias" -> LensAlias.asInstanceOf[js.Any],
        "MilestoneName" -> MilestoneName.asInstanceOf[js.Any],
        "WorkloadId" -> WorkloadId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeLensReviewInput]
    }
  }

  /** The differences between the base and latest versions of the lens.
    */
  @js.native
  trait VersionDifferences extends js.Object {
    var PillarDifferences: js.UndefOr[PillarDifferences]
  }

  object VersionDifferences {
    @inline
    def apply(
        PillarDifferences: js.UndefOr[PillarDifferences] = js.undefined
    ): VersionDifferences = {
      val __obj = js.Dynamic.literal()
      PillarDifferences.foreach(__v => __obj.updateDynamic("PillarDifferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VersionDifferences]
    }
  }

  /** A workload return object.
    */
  @js.native
  trait Workload extends js.Object {
    var AccountIds: js.UndefOr[WorkloadAccountIds]
    var ArchitecturalDesign: js.UndefOr[WorkloadArchitecturalDesign]
    var AwsRegions: js.UndefOr[WorkloadAwsRegions]
    var Description: js.UndefOr[WorkloadDescription]
    var Environment: js.UndefOr[WorkloadEnvironment]
    var ImprovementStatus: js.UndefOr[WorkloadImprovementStatus]
    var Industry: js.UndefOr[WorkloadIndustry]
    var IndustryType: js.UndefOr[WorkloadIndustryType]
    var IsReviewOwnerUpdateAcknowledged: js.UndefOr[IsReviewOwnerUpdateAcknowledged]
    var Lenses: js.UndefOr[WorkloadLenses]
    var NonAwsRegions: js.UndefOr[WorkloadNonAwsRegions]
    var Notes: js.UndefOr[Notes]
    var Owner: js.UndefOr[AwsAccountId]
    var PillarPriorities: js.UndefOr[WorkloadPillarPriorities]
    var ReviewOwner: js.UndefOr[WorkloadReviewOwner]
    var ReviewRestrictionDate: js.UndefOr[Timestamp]
    var RiskCounts: js.UndefOr[RiskCounts]
    var ShareInvitationId: js.UndefOr[ShareInvitationId]
    var Tags: js.UndefOr[TagMap]
    var UpdatedAt: js.UndefOr[Timestamp]
    var WorkloadArn: js.UndefOr[WorkloadArn]
    var WorkloadId: js.UndefOr[WorkloadId]
    var WorkloadName: js.UndefOr[WorkloadName]
  }

  object Workload {
    @inline
    def apply(
        AccountIds: js.UndefOr[WorkloadAccountIds] = js.undefined,
        ArchitecturalDesign: js.UndefOr[WorkloadArchitecturalDesign] = js.undefined,
        AwsRegions: js.UndefOr[WorkloadAwsRegions] = js.undefined,
        Description: js.UndefOr[WorkloadDescription] = js.undefined,
        Environment: js.UndefOr[WorkloadEnvironment] = js.undefined,
        ImprovementStatus: js.UndefOr[WorkloadImprovementStatus] = js.undefined,
        Industry: js.UndefOr[WorkloadIndustry] = js.undefined,
        IndustryType: js.UndefOr[WorkloadIndustryType] = js.undefined,
        IsReviewOwnerUpdateAcknowledged: js.UndefOr[IsReviewOwnerUpdateAcknowledged] = js.undefined,
        Lenses: js.UndefOr[WorkloadLenses] = js.undefined,
        NonAwsRegions: js.UndefOr[WorkloadNonAwsRegions] = js.undefined,
        Notes: js.UndefOr[Notes] = js.undefined,
        Owner: js.UndefOr[AwsAccountId] = js.undefined,
        PillarPriorities: js.UndefOr[WorkloadPillarPriorities] = js.undefined,
        ReviewOwner: js.UndefOr[WorkloadReviewOwner] = js.undefined,
        ReviewRestrictionDate: js.UndefOr[Timestamp] = js.undefined,
        RiskCounts: js.UndefOr[RiskCounts] = js.undefined,
        ShareInvitationId: js.UndefOr[ShareInvitationId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        WorkloadArn: js.UndefOr[WorkloadArn] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined,
        WorkloadName: js.UndefOr[WorkloadName] = js.undefined
    ): Workload = {
      val __obj = js.Dynamic.literal()
      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      ArchitecturalDesign.foreach(__v => __obj.updateDynamic("ArchitecturalDesign")(__v.asInstanceOf[js.Any]))
      AwsRegions.foreach(__v => __obj.updateDynamic("AwsRegions")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ImprovementStatus.foreach(__v => __obj.updateDynamic("ImprovementStatus")(__v.asInstanceOf[js.Any]))
      Industry.foreach(__v => __obj.updateDynamic("Industry")(__v.asInstanceOf[js.Any]))
      IndustryType.foreach(__v => __obj.updateDynamic("IndustryType")(__v.asInstanceOf[js.Any]))
      IsReviewOwnerUpdateAcknowledged.foreach(__v => __obj.updateDynamic("IsReviewOwnerUpdateAcknowledged")(__v.asInstanceOf[js.Any]))
      Lenses.foreach(__v => __obj.updateDynamic("Lenses")(__v.asInstanceOf[js.Any]))
      NonAwsRegions.foreach(__v => __obj.updateDynamic("NonAwsRegions")(__v.asInstanceOf[js.Any]))
      Notes.foreach(__v => __obj.updateDynamic("Notes")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      PillarPriorities.foreach(__v => __obj.updateDynamic("PillarPriorities")(__v.asInstanceOf[js.Any]))
      ReviewOwner.foreach(__v => __obj.updateDynamic("ReviewOwner")(__v.asInstanceOf[js.Any]))
      ReviewRestrictionDate.foreach(__v => __obj.updateDynamic("ReviewRestrictionDate")(__v.asInstanceOf[js.Any]))
      RiskCounts.foreach(__v => __obj.updateDynamic("RiskCounts")(__v.asInstanceOf[js.Any]))
      ShareInvitationId.foreach(__v => __obj.updateDynamic("ShareInvitationId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      WorkloadArn.foreach(__v => __obj.updateDynamic("WorkloadArn")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      WorkloadName.foreach(__v => __obj.updateDynamic("WorkloadName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workload]
    }
  }

  /** A workload share return object.
    */
  @js.native
  trait WorkloadShare extends js.Object {
    var PermissionType: js.UndefOr[PermissionType]
    var ShareId: js.UndefOr[ShareId]
    var SharedBy: js.UndefOr[AwsAccountId]
    var SharedWith: js.UndefOr[SharedWith]
    var Status: js.UndefOr[ShareStatus]
    var WorkloadId: js.UndefOr[WorkloadId]
    var WorkloadName: js.UndefOr[WorkloadName]
  }

  object WorkloadShare {
    @inline
    def apply(
        PermissionType: js.UndefOr[PermissionType] = js.undefined,
        ShareId: js.UndefOr[ShareId] = js.undefined,
        SharedBy: js.UndefOr[AwsAccountId] = js.undefined,
        SharedWith: js.UndefOr[SharedWith] = js.undefined,
        Status: js.UndefOr[ShareStatus] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined,
        WorkloadName: js.UndefOr[WorkloadName] = js.undefined
    ): WorkloadShare = {
      val __obj = js.Dynamic.literal()
      PermissionType.foreach(__v => __obj.updateDynamic("PermissionType")(__v.asInstanceOf[js.Any]))
      ShareId.foreach(__v => __obj.updateDynamic("ShareId")(__v.asInstanceOf[js.Any]))
      SharedBy.foreach(__v => __obj.updateDynamic("SharedBy")(__v.asInstanceOf[js.Any]))
      SharedWith.foreach(__v => __obj.updateDynamic("SharedWith")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      WorkloadName.foreach(__v => __obj.updateDynamic("WorkloadName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkloadShare]
    }
  }

  /** A workload share summary return object.
    */
  @js.native
  trait WorkloadShareSummary extends js.Object {
    var PermissionType: js.UndefOr[PermissionType]
    var ShareId: js.UndefOr[ShareId]
    var SharedWith: js.UndefOr[SharedWith]
    var Status: js.UndefOr[ShareStatus]
  }

  object WorkloadShareSummary {
    @inline
    def apply(
        PermissionType: js.UndefOr[PermissionType] = js.undefined,
        ShareId: js.UndefOr[ShareId] = js.undefined,
        SharedWith: js.UndefOr[SharedWith] = js.undefined,
        Status: js.UndefOr[ShareStatus] = js.undefined
    ): WorkloadShareSummary = {
      val __obj = js.Dynamic.literal()
      PermissionType.foreach(__v => __obj.updateDynamic("PermissionType")(__v.asInstanceOf[js.Any]))
      ShareId.foreach(__v => __obj.updateDynamic("ShareId")(__v.asInstanceOf[js.Any]))
      SharedWith.foreach(__v => __obj.updateDynamic("SharedWith")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkloadShareSummary]
    }
  }

  /** A workload summary return object.
    */
  @js.native
  trait WorkloadSummary extends js.Object {
    var ImprovementStatus: js.UndefOr[WorkloadImprovementStatus]
    var Lenses: js.UndefOr[WorkloadLenses]
    var Owner: js.UndefOr[AwsAccountId]
    var RiskCounts: js.UndefOr[RiskCounts]
    var UpdatedAt: js.UndefOr[Timestamp]
    var WorkloadArn: js.UndefOr[WorkloadArn]
    var WorkloadId: js.UndefOr[WorkloadId]
    var WorkloadName: js.UndefOr[WorkloadName]
  }

  object WorkloadSummary {
    @inline
    def apply(
        ImprovementStatus: js.UndefOr[WorkloadImprovementStatus] = js.undefined,
        Lenses: js.UndefOr[WorkloadLenses] = js.undefined,
        Owner: js.UndefOr[AwsAccountId] = js.undefined,
        RiskCounts: js.UndefOr[RiskCounts] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        WorkloadArn: js.UndefOr[WorkloadArn] = js.undefined,
        WorkloadId: js.UndefOr[WorkloadId] = js.undefined,
        WorkloadName: js.UndefOr[WorkloadName] = js.undefined
    ): WorkloadSummary = {
      val __obj = js.Dynamic.literal()
      ImprovementStatus.foreach(__v => __obj.updateDynamic("ImprovementStatus")(__v.asInstanceOf[js.Any]))
      Lenses.foreach(__v => __obj.updateDynamic("Lenses")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      RiskCounts.foreach(__v => __obj.updateDynamic("RiskCounts")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      WorkloadArn.foreach(__v => __obj.updateDynamic("WorkloadArn")(__v.asInstanceOf[js.Any]))
      WorkloadId.foreach(__v => __obj.updateDynamic("WorkloadId")(__v.asInstanceOf[js.Any]))
      WorkloadName.foreach(__v => __obj.updateDynamic("WorkloadName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkloadSummary]
    }
  }
}
