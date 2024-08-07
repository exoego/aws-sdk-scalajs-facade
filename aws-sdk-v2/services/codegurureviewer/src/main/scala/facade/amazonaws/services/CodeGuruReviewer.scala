package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object codegurureviewer {
  type AnalysisTypes = js.Array[AnalysisType]
  type Arn = String
  type AssociationArn = String
  type AssociationId = String
  type BranchName = String
  type BuildArtifactsObjectKey = String
  type ClientRequestToken = String
  type CodeReviewName = String
  type CodeReviewSummaries = js.Array[CodeReviewSummary]
  type CommitId = String
  type ConnectionArn = String
  type EventName = String
  type EventState = String
  type FilePath = String
  type FindingsCount = Double
  type JobStates = js.Array[JobState]
  type KMSKeyId = String
  type LineNumber = Int
  type ListCodeReviewsMaxResults = Int
  type LongDescription = String
  type MaxResults = Int
  type MeteredLinesOfCodeCount = Double
  type Name = String
  type Names = js.Array[Name]
  type NextToken = String
  type Owner = String
  type Owners = js.Array[Owner]
  type ProviderTypes = js.Array[ProviderType]
  type PullRequestId = String
  type Reactions = js.Array[Reaction]
  type RecommendationFeedbackSummaries = js.Array[RecommendationFeedbackSummary]
  type RecommendationId = String
  type RecommendationIds = js.Array[RecommendationId]
  type RecommendationSummaries = js.Array[RecommendationSummary]
  type RepositoryAssociationStates = js.Array[RepositoryAssociationState]
  type RepositoryAssociationSummaries = js.Array[RepositoryAssociationSummary]
  type RepositoryNames = js.Array[Name]
  type RequestId = String
  type Requester = String
  type RuleId = String
  type RuleName = String
  type RuleTag = String
  type RuleTags = js.Array[RuleTag]
  type S3BucketName = String
  type ShortDescription = String
  type SourceCodeArtifactsObjectKey = String
  type StateReason = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Text = String
  type TimeStamp = js.Date
  type UserId = String
  type UserIds = js.Array[UserId]

  final class CodeGuruReviewerOps(private val service: CodeGuruReviewer) extends AnyVal {

    @inline def associateRepositoryFuture(params: AssociateRepositoryRequest): Future[AssociateRepositoryResponse] = service.associateRepository(params).promise().toFuture
    @inline def createCodeReviewFuture(params: CreateCodeReviewRequest): Future[CreateCodeReviewResponse] = service.createCodeReview(params).promise().toFuture
    @inline def describeCodeReviewFuture(params: DescribeCodeReviewRequest): Future[DescribeCodeReviewResponse] = service.describeCodeReview(params).promise().toFuture
    @inline def describeRecommendationFeedbackFuture(params: DescribeRecommendationFeedbackRequest): Future[DescribeRecommendationFeedbackResponse] = service.describeRecommendationFeedback(params).promise().toFuture
    @inline def describeRepositoryAssociationFuture(params: DescribeRepositoryAssociationRequest): Future[DescribeRepositoryAssociationResponse] = service.describeRepositoryAssociation(params).promise().toFuture
    @inline def disassociateRepositoryFuture(params: DisassociateRepositoryRequest): Future[DisassociateRepositoryResponse] = service.disassociateRepository(params).promise().toFuture
    @inline def listCodeReviewsFuture(params: ListCodeReviewsRequest): Future[ListCodeReviewsResponse] = service.listCodeReviews(params).promise().toFuture
    @inline def listRecommendationFeedbackFuture(params: ListRecommendationFeedbackRequest): Future[ListRecommendationFeedbackResponse] = service.listRecommendationFeedback(params).promise().toFuture
    @inline def listRecommendationsFuture(params: ListRecommendationsRequest): Future[ListRecommendationsResponse] = service.listRecommendations(params).promise().toFuture
    @inline def listRepositoryAssociationsFuture(params: ListRepositoryAssociationsRequest): Future[ListRepositoryAssociationsResponse] = service.listRepositoryAssociations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putRecommendationFeedbackFuture(params: PutRecommendationFeedbackRequest): Future[PutRecommendationFeedbackResponse] = service.putRecommendationFeedback(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/codegurureviewer", JSImport.Namespace, "AWS.CodeGuruReviewer")
  class CodeGuruReviewer() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateRepository(params: AssociateRepositoryRequest): Request[AssociateRepositoryResponse] = js.native
    def createCodeReview(params: CreateCodeReviewRequest): Request[CreateCodeReviewResponse] = js.native
    def describeCodeReview(params: DescribeCodeReviewRequest): Request[DescribeCodeReviewResponse] = js.native
    def describeRecommendationFeedback(params: DescribeRecommendationFeedbackRequest): Request[DescribeRecommendationFeedbackResponse] = js.native
    def describeRepositoryAssociation(params: DescribeRepositoryAssociationRequest): Request[DescribeRepositoryAssociationResponse] = js.native
    def disassociateRepository(params: DisassociateRepositoryRequest): Request[DisassociateRepositoryResponse] = js.native
    def listCodeReviews(params: ListCodeReviewsRequest): Request[ListCodeReviewsResponse] = js.native
    def listRecommendationFeedback(params: ListRecommendationFeedbackRequest): Request[ListRecommendationFeedbackResponse] = js.native
    def listRecommendations(params: ListRecommendationsRequest): Request[ListRecommendationsResponse] = js.native
    def listRepositoryAssociations(params: ListRepositoryAssociationsRequest): Request[ListRepositoryAssociationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putRecommendationFeedback(params: PutRecommendationFeedbackRequest): Request[PutRecommendationFeedbackResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object CodeGuruReviewer {
    @inline implicit def toOps(service: CodeGuruReviewer): CodeGuruReviewerOps = {
      new CodeGuruReviewerOps(service)
    }
  }

  @js.native
  trait AssociateRepositoryRequest extends js.Object {
    var Repository: Repository
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var KMSKeyDetails: js.UndefOr[KMSKeyDetails]
    var Tags: js.UndefOr[TagMap]
  }

  object AssociateRepositoryRequest {
    @inline
    def apply(
        Repository: Repository,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        KMSKeyDetails: js.UndefOr[KMSKeyDetails] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): AssociateRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "Repository" -> Repository.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      KMSKeyDetails.foreach(__v => __obj.updateDynamic("KMSKeyDetails")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateRepositoryRequest]
    }
  }

  @js.native
  trait AssociateRepositoryResponse extends js.Object {
    var RepositoryAssociation: js.UndefOr[RepositoryAssociation]
    var Tags: js.UndefOr[TagMap]
  }

  object AssociateRepositoryResponse {
    @inline
    def apply(
        RepositoryAssociation: js.UndefOr[RepositoryAssociation] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): AssociateRepositoryResponse = {
      val __obj = js.Dynamic.literal()
      RepositoryAssociation.foreach(__v => __obj.updateDynamic("RepositoryAssociation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateRepositoryResponse]
    }
  }

  /** A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType"> <code>SourceCodeType</code> </a> that specifies a code diff between a source and destination branch in an associated repository.
    */
  @js.native
  trait BranchDiffSourceCodeType extends js.Object {
    var DestinationBranchName: BranchName
    var SourceBranchName: BranchName
  }

  object BranchDiffSourceCodeType {
    @inline
    def apply(
        DestinationBranchName: BranchName,
        SourceBranchName: BranchName
    ): BranchDiffSourceCodeType = {
      val __obj = js.Dynamic.literal(
        "DestinationBranchName" -> DestinationBranchName.asInstanceOf[js.Any],
        "SourceBranchName" -> SourceBranchName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BranchDiffSourceCodeType]
    }
  }

  /** Code artifacts are source code artifacts and build artifacts used in a repository analysis or a pull request review. * Source code artifacts are source code files in a Git repository that are compressed into a .zip file. * Build artifacts are .jar or .class files that are compressed in a .zip file.
    */
  @js.native
  trait CodeArtifacts extends js.Object {
    var SourceCodeArtifactsObjectKey: SourceCodeArtifactsObjectKey
    var BuildArtifactsObjectKey: js.UndefOr[BuildArtifactsObjectKey]
  }

  object CodeArtifacts {
    @inline
    def apply(
        SourceCodeArtifactsObjectKey: SourceCodeArtifactsObjectKey,
        BuildArtifactsObjectKey: js.UndefOr[BuildArtifactsObjectKey] = js.undefined
    ): CodeArtifacts = {
      val __obj = js.Dynamic.literal(
        "SourceCodeArtifactsObjectKey" -> SourceCodeArtifactsObjectKey.asInstanceOf[js.Any]
      )

      BuildArtifactsObjectKey.foreach(__v => __obj.updateDynamic("BuildArtifactsObjectKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeArtifacts]
    }
  }

  /** Information about an Amazon Web Services CodeCommit repository. The CodeCommit repository must be in the same Amazon Web Services Region and Amazon Web Services account where its CodeGuru Reviewer code reviews are configured.
    */
  @js.native
  trait CodeCommitRepository extends js.Object {
    var Name: Name
  }

  object CodeCommitRepository {
    @inline
    def apply(
        Name: Name
    ): CodeCommitRepository = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CodeCommitRepository]
    }
  }

  /** Information about a code review. A code review belongs to the associated repository that contains the reviewed code.
    */
  @js.native
  trait CodeReview extends js.Object {
    var AnalysisTypes: js.UndefOr[AnalysisTypes]
    var AssociationArn: js.UndefOr[AssociationArn]
    var CodeReviewArn: js.UndefOr[Arn]
    var CreatedTimeStamp: js.UndefOr[TimeStamp]
    var LastUpdatedTimeStamp: js.UndefOr[TimeStamp]
    var Metrics: js.UndefOr[Metrics]
    var Name: js.UndefOr[Name]
    var Owner: js.UndefOr[Owner]
    var ProviderType: js.UndefOr[ProviderType]
    var PullRequestId: js.UndefOr[PullRequestId]
    var RepositoryName: js.UndefOr[Name]
    var SourceCodeType: js.UndefOr[SourceCodeType]
    var State: js.UndefOr[JobState]
    var StateReason: js.UndefOr[StateReason]
    var Type: js.UndefOr[Type]
  }

  object CodeReview {
    @inline
    def apply(
        AnalysisTypes: js.UndefOr[AnalysisTypes] = js.undefined,
        AssociationArn: js.UndefOr[AssociationArn] = js.undefined,
        CodeReviewArn: js.UndefOr[Arn] = js.undefined,
        CreatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        Metrics: js.UndefOr[Metrics] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        PullRequestId: js.UndefOr[PullRequestId] = js.undefined,
        RepositoryName: js.UndefOr[Name] = js.undefined,
        SourceCodeType: js.UndefOr[SourceCodeType] = js.undefined,
        State: js.UndefOr[JobState] = js.undefined,
        StateReason: js.UndefOr[StateReason] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): CodeReview = {
      val __obj = js.Dynamic.literal()
      AnalysisTypes.foreach(__v => __obj.updateDynamic("AnalysisTypes")(__v.asInstanceOf[js.Any]))
      AssociationArn.foreach(__v => __obj.updateDynamic("AssociationArn")(__v.asInstanceOf[js.Any]))
      CodeReviewArn.foreach(__v => __obj.updateDynamic("CodeReviewArn")(__v.asInstanceOf[js.Any]))
      CreatedTimeStamp.foreach(__v => __obj.updateDynamic("CreatedTimeStamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimeStamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimeStamp")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      PullRequestId.foreach(__v => __obj.updateDynamic("PullRequestId")(__v.asInstanceOf[js.Any]))
      RepositoryName.foreach(__v => __obj.updateDynamic("RepositoryName")(__v.asInstanceOf[js.Any]))
      SourceCodeType.foreach(__v => __obj.updateDynamic("SourceCodeType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeReview]
    }
  }

  /** Information about the summary of the code review.
    */
  @js.native
  trait CodeReviewSummary extends js.Object {
    var CodeReviewArn: js.UndefOr[Arn]
    var CreatedTimeStamp: js.UndefOr[TimeStamp]
    var LastUpdatedTimeStamp: js.UndefOr[TimeStamp]
    var MetricsSummary: js.UndefOr[MetricsSummary]
    var Name: js.UndefOr[Name]
    var Owner: js.UndefOr[Owner]
    var ProviderType: js.UndefOr[ProviderType]
    var PullRequestId: js.UndefOr[PullRequestId]
    var RepositoryName: js.UndefOr[Name]
    var SourceCodeType: js.UndefOr[SourceCodeType]
    var State: js.UndefOr[JobState]
    var Type: js.UndefOr[Type]
  }

  object CodeReviewSummary {
    @inline
    def apply(
        CodeReviewArn: js.UndefOr[Arn] = js.undefined,
        CreatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        MetricsSummary: js.UndefOr[MetricsSummary] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        PullRequestId: js.UndefOr[PullRequestId] = js.undefined,
        RepositoryName: js.UndefOr[Name] = js.undefined,
        SourceCodeType: js.UndefOr[SourceCodeType] = js.undefined,
        State: js.UndefOr[JobState] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): CodeReviewSummary = {
      val __obj = js.Dynamic.literal()
      CodeReviewArn.foreach(__v => __obj.updateDynamic("CodeReviewArn")(__v.asInstanceOf[js.Any]))
      CreatedTimeStamp.foreach(__v => __obj.updateDynamic("CreatedTimeStamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimeStamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimeStamp")(__v.asInstanceOf[js.Any]))
      MetricsSummary.foreach(__v => __obj.updateDynamic("MetricsSummary")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      PullRequestId.foreach(__v => __obj.updateDynamic("PullRequestId")(__v.asInstanceOf[js.Any]))
      RepositoryName.foreach(__v => __obj.updateDynamic("RepositoryName")(__v.asInstanceOf[js.Any]))
      SourceCodeType.foreach(__v => __obj.updateDynamic("SourceCodeType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeReviewSummary]
    }
  }

  /** The type of a code review. There are two code review types: * <code>PullRequest</code> - A code review that is automatically triggered by a pull request on an associated repository. * <code>RepositoryAnalysis</code> - A code review that analyzes all code under a specified branch in an associated repository. The associated repository is specified using its ARN in <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview"> <code>CreateCodeReview</code> </a>.
    */
  @js.native
  trait CodeReviewType extends js.Object {
    var RepositoryAnalysis: RepositoryAnalysis
    var AnalysisTypes: js.UndefOr[AnalysisTypes]
  }

  object CodeReviewType {
    @inline
    def apply(
        RepositoryAnalysis: RepositoryAnalysis,
        AnalysisTypes: js.UndefOr[AnalysisTypes] = js.undefined
    ): CodeReviewType = {
      val __obj = js.Dynamic.literal(
        "RepositoryAnalysis" -> RepositoryAnalysis.asInstanceOf[js.Any]
      )

      AnalysisTypes.foreach(__v => __obj.updateDynamic("AnalysisTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeReviewType]
    }
  }

  /** A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType"> <code>SourceCodeType</code> </a> that specifies the commit diff for a pull request on an associated repository. The <code>SourceCommit</code> and <code>DestinationCommit</code> fields are required to do a pull request code review.
    */
  @js.native
  trait CommitDiffSourceCodeType extends js.Object {
    var DestinationCommit: js.UndefOr[CommitId]
    var MergeBaseCommit: js.UndefOr[CommitId]
    var SourceCommit: js.UndefOr[CommitId]
  }

  object CommitDiffSourceCodeType {
    @inline
    def apply(
        DestinationCommit: js.UndefOr[CommitId] = js.undefined,
        MergeBaseCommit: js.UndefOr[CommitId] = js.undefined,
        SourceCommit: js.UndefOr[CommitId] = js.undefined
    ): CommitDiffSourceCodeType = {
      val __obj = js.Dynamic.literal()
      DestinationCommit.foreach(__v => __obj.updateDynamic("DestinationCommit")(__v.asInstanceOf[js.Any]))
      MergeBaseCommit.foreach(__v => __obj.updateDynamic("MergeBaseCommit")(__v.asInstanceOf[js.Any]))
      SourceCommit.foreach(__v => __obj.updateDynamic("SourceCommit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommitDiffSourceCodeType]
    }
  }

  @js.native
  trait CreateCodeReviewRequest extends js.Object {
    var Name: CodeReviewName
    var RepositoryAssociationArn: AssociationArn
    var Type: CodeReviewType
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object CreateCodeReviewRequest {
    @inline
    def apply(
        Name: CodeReviewName,
        RepositoryAssociationArn: AssociationArn,
        Type: CodeReviewType,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): CreateCodeReviewRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RepositoryAssociationArn" -> RepositoryAssociationArn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCodeReviewRequest]
    }
  }

  @js.native
  trait CreateCodeReviewResponse extends js.Object {
    var CodeReview: js.UndefOr[CodeReview]
  }

  object CreateCodeReviewResponse {
    @inline
    def apply(
        CodeReview: js.UndefOr[CodeReview] = js.undefined
    ): CreateCodeReviewResponse = {
      val __obj = js.Dynamic.literal()
      CodeReview.foreach(__v => __obj.updateDynamic("CodeReview")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCodeReviewResponse]
    }
  }

  @js.native
  trait DescribeCodeReviewRequest extends js.Object {
    var CodeReviewArn: Arn
  }

  object DescribeCodeReviewRequest {
    @inline
    def apply(
        CodeReviewArn: Arn
    ): DescribeCodeReviewRequest = {
      val __obj = js.Dynamic.literal(
        "CodeReviewArn" -> CodeReviewArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeCodeReviewRequest]
    }
  }

  @js.native
  trait DescribeCodeReviewResponse extends js.Object {
    var CodeReview: js.UndefOr[CodeReview]
  }

  object DescribeCodeReviewResponse {
    @inline
    def apply(
        CodeReview: js.UndefOr[CodeReview] = js.undefined
    ): DescribeCodeReviewResponse = {
      val __obj = js.Dynamic.literal()
      CodeReview.foreach(__v => __obj.updateDynamic("CodeReview")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCodeReviewResponse]
    }
  }

  @js.native
  trait DescribeRecommendationFeedbackRequest extends js.Object {
    var CodeReviewArn: Arn
    var RecommendationId: RecommendationId
    var UserId: js.UndefOr[UserId]
  }

  object DescribeRecommendationFeedbackRequest {
    @inline
    def apply(
        CodeReviewArn: Arn,
        RecommendationId: RecommendationId,
        UserId: js.UndefOr[UserId] = js.undefined
    ): DescribeRecommendationFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "CodeReviewArn" -> CodeReviewArn.asInstanceOf[js.Any],
        "RecommendationId" -> RecommendationId.asInstanceOf[js.Any]
      )

      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecommendationFeedbackRequest]
    }
  }

  @js.native
  trait DescribeRecommendationFeedbackResponse extends js.Object {
    var RecommendationFeedback: js.UndefOr[RecommendationFeedback]
  }

  object DescribeRecommendationFeedbackResponse {
    @inline
    def apply(
        RecommendationFeedback: js.UndefOr[RecommendationFeedback] = js.undefined
    ): DescribeRecommendationFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      RecommendationFeedback.foreach(__v => __obj.updateDynamic("RecommendationFeedback")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecommendationFeedbackResponse]
    }
  }

  @js.native
  trait DescribeRepositoryAssociationRequest extends js.Object {
    var AssociationArn: AssociationArn
  }

  object DescribeRepositoryAssociationRequest {
    @inline
    def apply(
        AssociationArn: AssociationArn
    ): DescribeRepositoryAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationArn" -> AssociationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRepositoryAssociationRequest]
    }
  }

  @js.native
  trait DescribeRepositoryAssociationResponse extends js.Object {
    var RepositoryAssociation: js.UndefOr[RepositoryAssociation]
    var Tags: js.UndefOr[TagMap]
  }

  object DescribeRepositoryAssociationResponse {
    @inline
    def apply(
        RepositoryAssociation: js.UndefOr[RepositoryAssociation] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeRepositoryAssociationResponse = {
      val __obj = js.Dynamic.literal()
      RepositoryAssociation.foreach(__v => __obj.updateDynamic("RepositoryAssociation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRepositoryAssociationResponse]
    }
  }

  @js.native
  trait DisassociateRepositoryRequest extends js.Object {
    var AssociationArn: AssociationArn
  }

  object DisassociateRepositoryRequest {
    @inline
    def apply(
        AssociationArn: AssociationArn
    ): DisassociateRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationArn" -> AssociationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateRepositoryRequest]
    }
  }

  @js.native
  trait DisassociateRepositoryResponse extends js.Object {
    var RepositoryAssociation: js.UndefOr[RepositoryAssociation]
    var Tags: js.UndefOr[TagMap]
  }

  object DisassociateRepositoryResponse {
    @inline
    def apply(
        RepositoryAssociation: js.UndefOr[RepositoryAssociation] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DisassociateRepositoryResponse = {
      val __obj = js.Dynamic.literal()
      RepositoryAssociation.foreach(__v => __obj.updateDynamic("RepositoryAssociation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateRepositoryResponse]
    }
  }

  /** Information about an event. The event might be a push, pull request, scheduled request, or another type of event.
    */
  @js.native
  trait EventInfo extends js.Object {
    var Name: js.UndefOr[EventName]
    var State: js.UndefOr[EventState]
  }

  object EventInfo {
    @inline
    def apply(
        Name: js.UndefOr[EventName] = js.undefined,
        State: js.UndefOr[EventState] = js.undefined
    ): EventInfo = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventInfo]
    }
  }

  /** An object that contains: * The encryption option for a repository association. It is either owned by Amazon Web Services Key Management Service (KMS) (<code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>). * The ID of the Amazon Web Services KMS key that is associated with a respository association.
    */
  @js.native
  trait KMSKeyDetails extends js.Object {
    var EncryptionOption: js.UndefOr[EncryptionOption]
    var KMSKeyId: js.UndefOr[KMSKeyId]
  }

  object KMSKeyDetails {
    @inline
    def apply(
        EncryptionOption: js.UndefOr[EncryptionOption] = js.undefined,
        KMSKeyId: js.UndefOr[KMSKeyId] = js.undefined
    ): KMSKeyDetails = {
      val __obj = js.Dynamic.literal()
      EncryptionOption.foreach(__v => __obj.updateDynamic("EncryptionOption")(__v.asInstanceOf[js.Any]))
      KMSKeyId.foreach(__v => __obj.updateDynamic("KMSKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KMSKeyDetails]
    }
  }

  @js.native
  trait ListCodeReviewsRequest extends js.Object {
    var Type: Type
    var MaxResults: js.UndefOr[ListCodeReviewsMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ProviderTypes: js.UndefOr[ProviderTypes]
    var RepositoryNames: js.UndefOr[RepositoryNames]
    var States: js.UndefOr[JobStates]
  }

  object ListCodeReviewsRequest {
    @inline
    def apply(
        Type: Type,
        MaxResults: js.UndefOr[ListCodeReviewsMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ProviderTypes: js.UndefOr[ProviderTypes] = js.undefined,
        RepositoryNames: js.UndefOr[RepositoryNames] = js.undefined,
        States: js.UndefOr[JobStates] = js.undefined
    ): ListCodeReviewsRequest = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProviderTypes.foreach(__v => __obj.updateDynamic("ProviderTypes")(__v.asInstanceOf[js.Any]))
      RepositoryNames.foreach(__v => __obj.updateDynamic("RepositoryNames")(__v.asInstanceOf[js.Any]))
      States.foreach(__v => __obj.updateDynamic("States")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCodeReviewsRequest]
    }
  }

  @js.native
  trait ListCodeReviewsResponse extends js.Object {
    var CodeReviewSummaries: js.UndefOr[CodeReviewSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCodeReviewsResponse {
    @inline
    def apply(
        CodeReviewSummaries: js.UndefOr[CodeReviewSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCodeReviewsResponse = {
      val __obj = js.Dynamic.literal()
      CodeReviewSummaries.foreach(__v => __obj.updateDynamic("CodeReviewSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCodeReviewsResponse]
    }
  }

  @js.native
  trait ListRecommendationFeedbackRequest extends js.Object {
    var CodeReviewArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var RecommendationIds: js.UndefOr[RecommendationIds]
    var UserIds: js.UndefOr[UserIds]
  }

  object ListRecommendationFeedbackRequest {
    @inline
    def apply(
        CodeReviewArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RecommendationIds: js.UndefOr[RecommendationIds] = js.undefined,
        UserIds: js.UndefOr[UserIds] = js.undefined
    ): ListRecommendationFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "CodeReviewArn" -> CodeReviewArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RecommendationIds.foreach(__v => __obj.updateDynamic("RecommendationIds")(__v.asInstanceOf[js.Any]))
      UserIds.foreach(__v => __obj.updateDynamic("UserIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationFeedbackRequest]
    }
  }

  @js.native
  trait ListRecommendationFeedbackResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RecommendationFeedbackSummaries: js.UndefOr[RecommendationFeedbackSummaries]
  }

  object ListRecommendationFeedbackResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RecommendationFeedbackSummaries: js.UndefOr[RecommendationFeedbackSummaries] = js.undefined
    ): ListRecommendationFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RecommendationFeedbackSummaries.foreach(__v => __obj.updateDynamic("RecommendationFeedbackSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationFeedbackResponse]
    }
  }

  @js.native
  trait ListRecommendationsRequest extends js.Object {
    var CodeReviewArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRecommendationsRequest {
    @inline
    def apply(
        CodeReviewArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "CodeReviewArn" -> CodeReviewArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationsRequest]
    }
  }

  @js.native
  trait ListRecommendationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RecommendationSummaries: js.UndefOr[RecommendationSummaries]
  }

  object ListRecommendationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RecommendationSummaries: js.UndefOr[RecommendationSummaries] = js.undefined
    ): ListRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RecommendationSummaries.foreach(__v => __obj.updateDynamic("RecommendationSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationsResponse]
    }
  }

  @js.native
  trait ListRepositoryAssociationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var Names: js.UndefOr[Names]
    var NextToken: js.UndefOr[NextToken]
    var Owners: js.UndefOr[Owners]
    var ProviderTypes: js.UndefOr[ProviderTypes]
    var States: js.UndefOr[RepositoryAssociationStates]
  }

  object ListRepositoryAssociationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        Names: js.UndefOr[Names] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Owners: js.UndefOr[Owners] = js.undefined,
        ProviderTypes: js.UndefOr[ProviderTypes] = js.undefined,
        States: js.UndefOr[RepositoryAssociationStates] = js.undefined
    ): ListRepositoryAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Owners.foreach(__v => __obj.updateDynamic("Owners")(__v.asInstanceOf[js.Any]))
      ProviderTypes.foreach(__v => __obj.updateDynamic("ProviderTypes")(__v.asInstanceOf[js.Any]))
      States.foreach(__v => __obj.updateDynamic("States")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoryAssociationsRequest]
    }
  }

  @js.native
  trait ListRepositoryAssociationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RepositoryAssociationSummaries: js.UndefOr[RepositoryAssociationSummaries]
  }

  object ListRepositoryAssociationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RepositoryAssociationSummaries: js.UndefOr[RepositoryAssociationSummaries] = js.undefined
    ): ListRepositoryAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RepositoryAssociationSummaries.foreach(__v => __obj.updateDynamic("RepositoryAssociationSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoryAssociationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AssociationArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: AssociationArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Information about the statistics from the code review.
    */
  @js.native
  trait Metrics extends js.Object {
    var FindingsCount: js.UndefOr[FindingsCount]
    var MeteredLinesOfCodeCount: js.UndefOr[MeteredLinesOfCodeCount]
  }

  object Metrics {
    @inline
    def apply(
        FindingsCount: js.UndefOr[FindingsCount] = js.undefined,
        MeteredLinesOfCodeCount: js.UndefOr[MeteredLinesOfCodeCount] = js.undefined
    ): Metrics = {
      val __obj = js.Dynamic.literal()
      FindingsCount.foreach(__v => __obj.updateDynamic("FindingsCount")(__v.asInstanceOf[js.Any]))
      MeteredLinesOfCodeCount.foreach(__v => __obj.updateDynamic("MeteredLinesOfCodeCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metrics]
    }
  }

  /** Information about metrics summaries.
    */
  @js.native
  trait MetricsSummary extends js.Object {
    var FindingsCount: js.UndefOr[FindingsCount]
    var MeteredLinesOfCodeCount: js.UndefOr[MeteredLinesOfCodeCount]
  }

  object MetricsSummary {
    @inline
    def apply(
        FindingsCount: js.UndefOr[FindingsCount] = js.undefined,
        MeteredLinesOfCodeCount: js.UndefOr[MeteredLinesOfCodeCount] = js.undefined
    ): MetricsSummary = {
      val __obj = js.Dynamic.literal()
      FindingsCount.foreach(__v => __obj.updateDynamic("FindingsCount")(__v.asInstanceOf[js.Any]))
      MeteredLinesOfCodeCount.foreach(__v => __obj.updateDynamic("MeteredLinesOfCodeCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricsSummary]
    }
  }

  @js.native
  trait PutRecommendationFeedbackRequest extends js.Object {
    var CodeReviewArn: Arn
    var Reactions: Reactions
    var RecommendationId: RecommendationId
  }

  object PutRecommendationFeedbackRequest {
    @inline
    def apply(
        CodeReviewArn: Arn,
        Reactions: Reactions,
        RecommendationId: RecommendationId
    ): PutRecommendationFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "CodeReviewArn" -> CodeReviewArn.asInstanceOf[js.Any],
        "Reactions" -> Reactions.asInstanceOf[js.Any],
        "RecommendationId" -> RecommendationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutRecommendationFeedbackRequest]
    }
  }

  @js.native
  trait PutRecommendationFeedbackResponse extends js.Object

  object PutRecommendationFeedbackResponse {
    @inline
    def apply(): PutRecommendationFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutRecommendationFeedbackResponse]
    }
  }

  /** Information about the recommendation feedback.
    */
  @js.native
  trait RecommendationFeedback extends js.Object {
    var CodeReviewArn: js.UndefOr[Arn]
    var CreatedTimeStamp: js.UndefOr[TimeStamp]
    var LastUpdatedTimeStamp: js.UndefOr[TimeStamp]
    var Reactions: js.UndefOr[Reactions]
    var RecommendationId: js.UndefOr[RecommendationId]
    var UserId: js.UndefOr[UserId]
  }

  object RecommendationFeedback {
    @inline
    def apply(
        CodeReviewArn: js.UndefOr[Arn] = js.undefined,
        CreatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        Reactions: js.UndefOr[Reactions] = js.undefined,
        RecommendationId: js.UndefOr[RecommendationId] = js.undefined,
        UserId: js.UndefOr[UserId] = js.undefined
    ): RecommendationFeedback = {
      val __obj = js.Dynamic.literal()
      CodeReviewArn.foreach(__v => __obj.updateDynamic("CodeReviewArn")(__v.asInstanceOf[js.Any]))
      CreatedTimeStamp.foreach(__v => __obj.updateDynamic("CreatedTimeStamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimeStamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimeStamp")(__v.asInstanceOf[js.Any]))
      Reactions.foreach(__v => __obj.updateDynamic("Reactions")(__v.asInstanceOf[js.Any]))
      RecommendationId.foreach(__v => __obj.updateDynamic("RecommendationId")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationFeedback]
    }
  }

  /** Information about recommendation feedback summaries.
    */
  @js.native
  trait RecommendationFeedbackSummary extends js.Object {
    var Reactions: js.UndefOr[Reactions]
    var RecommendationId: js.UndefOr[RecommendationId]
    var UserId: js.UndefOr[UserId]
  }

  object RecommendationFeedbackSummary {
    @inline
    def apply(
        Reactions: js.UndefOr[Reactions] = js.undefined,
        RecommendationId: js.UndefOr[RecommendationId] = js.undefined,
        UserId: js.UndefOr[UserId] = js.undefined
    ): RecommendationFeedbackSummary = {
      val __obj = js.Dynamic.literal()
      Reactions.foreach(__v => __obj.updateDynamic("Reactions")(__v.asInstanceOf[js.Any]))
      RecommendationId.foreach(__v => __obj.updateDynamic("RecommendationId")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationFeedbackSummary]
    }
  }

  /** Information about recommendations.
    */
  @js.native
  trait RecommendationSummary extends js.Object {
    var Description: js.UndefOr[Text]
    var EndLine: js.UndefOr[LineNumber]
    var FilePath: js.UndefOr[FilePath]
    var RecommendationCategory: js.UndefOr[RecommendationCategory]
    var RecommendationId: js.UndefOr[RecommendationId]
    var RuleMetadata: js.UndefOr[RuleMetadata]
    var Severity: js.UndefOr[Severity]
    var StartLine: js.UndefOr[LineNumber]
  }

  object RecommendationSummary {
    @inline
    def apply(
        Description: js.UndefOr[Text] = js.undefined,
        EndLine: js.UndefOr[LineNumber] = js.undefined,
        FilePath: js.UndefOr[FilePath] = js.undefined,
        RecommendationCategory: js.UndefOr[RecommendationCategory] = js.undefined,
        RecommendationId: js.UndefOr[RecommendationId] = js.undefined,
        RuleMetadata: js.UndefOr[RuleMetadata] = js.undefined,
        Severity: js.UndefOr[Severity] = js.undefined,
        StartLine: js.UndefOr[LineNumber] = js.undefined
    ): RecommendationSummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndLine.foreach(__v => __obj.updateDynamic("EndLine")(__v.asInstanceOf[js.Any]))
      FilePath.foreach(__v => __obj.updateDynamic("FilePath")(__v.asInstanceOf[js.Any]))
      RecommendationCategory.foreach(__v => __obj.updateDynamic("RecommendationCategory")(__v.asInstanceOf[js.Any]))
      RecommendationId.foreach(__v => __obj.updateDynamic("RecommendationId")(__v.asInstanceOf[js.Any]))
      RuleMetadata.foreach(__v => __obj.updateDynamic("RuleMetadata")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      StartLine.foreach(__v => __obj.updateDynamic("StartLine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationSummary]
    }
  }

  /** Information about an associated Amazon Web Services CodeCommit repository or an associated repository that is managed by Amazon Web Services CodeStar Connections (for example, Bitbucket). This <code>Repository</code> object is not used if your source code is in an associated GitHub repository.
    */
  @js.native
  trait Repository extends js.Object {
    var Bitbucket: js.UndefOr[ThirdPartySourceRepository]
    var CodeCommit: js.UndefOr[CodeCommitRepository]
    var GitHubEnterpriseServer: js.UndefOr[ThirdPartySourceRepository]
    var S3Bucket: js.UndefOr[S3Repository]
  }

  object Repository {
    @inline
    def apply(
        Bitbucket: js.UndefOr[ThirdPartySourceRepository] = js.undefined,
        CodeCommit: js.UndefOr[CodeCommitRepository] = js.undefined,
        GitHubEnterpriseServer: js.UndefOr[ThirdPartySourceRepository] = js.undefined,
        S3Bucket: js.UndefOr[S3Repository] = js.undefined
    ): Repository = {
      val __obj = js.Dynamic.literal()
      Bitbucket.foreach(__v => __obj.updateDynamic("Bitbucket")(__v.asInstanceOf[js.Any]))
      CodeCommit.foreach(__v => __obj.updateDynamic("CodeCommit")(__v.asInstanceOf[js.Any]))
      GitHubEnterpriseServer.foreach(__v => __obj.updateDynamic("GitHubEnterpriseServer")(__v.asInstanceOf[js.Any]))
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Repository]
    }
  }

  /** A code review type that analyzes all code under a specified branch in an associated repository. The associated repository is specified using its ARN when you call <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview"> <code>CreateCodeReview</code> </a>.
    */
  @js.native
  trait RepositoryAnalysis extends js.Object {
    var RepositoryHead: js.UndefOr[RepositoryHeadSourceCodeType]
    var SourceCodeType: js.UndefOr[SourceCodeType]
  }

  object RepositoryAnalysis {
    @inline
    def apply(
        RepositoryHead: js.UndefOr[RepositoryHeadSourceCodeType] = js.undefined,
        SourceCodeType: js.UndefOr[SourceCodeType] = js.undefined
    ): RepositoryAnalysis = {
      val __obj = js.Dynamic.literal()
      RepositoryHead.foreach(__v => __obj.updateDynamic("RepositoryHead")(__v.asInstanceOf[js.Any]))
      SourceCodeType.foreach(__v => __obj.updateDynamic("SourceCodeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryAnalysis]
    }
  }

  /** Information about a repository association. The <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_DescribeRepositoryAssociation.html"> <code>DescribeRepositoryAssociation</code> </a> operation returns a <code>RepositoryAssociation</code> object.
    */
  @js.native
  trait RepositoryAssociation extends js.Object {
    var AssociationArn: js.UndefOr[Arn]
    var AssociationId: js.UndefOr[AssociationId]
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var CreatedTimeStamp: js.UndefOr[TimeStamp]
    var KMSKeyDetails: js.UndefOr[KMSKeyDetails]
    var LastUpdatedTimeStamp: js.UndefOr[TimeStamp]
    var Name: js.UndefOr[Name]
    var Owner: js.UndefOr[Owner]
    var ProviderType: js.UndefOr[ProviderType]
    var S3RepositoryDetails: js.UndefOr[S3RepositoryDetails]
    var State: js.UndefOr[RepositoryAssociationState]
    var StateReason: js.UndefOr[StateReason]
  }

  object RepositoryAssociation {
    @inline
    def apply(
        AssociationArn: js.UndefOr[Arn] = js.undefined,
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        CreatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        KMSKeyDetails: js.UndefOr[KMSKeyDetails] = js.undefined,
        LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        S3RepositoryDetails: js.UndefOr[S3RepositoryDetails] = js.undefined,
        State: js.UndefOr[RepositoryAssociationState] = js.undefined,
        StateReason: js.UndefOr[StateReason] = js.undefined
    ): RepositoryAssociation = {
      val __obj = js.Dynamic.literal()
      AssociationArn.foreach(__v => __obj.updateDynamic("AssociationArn")(__v.asInstanceOf[js.Any]))
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      CreatedTimeStamp.foreach(__v => __obj.updateDynamic("CreatedTimeStamp")(__v.asInstanceOf[js.Any]))
      KMSKeyDetails.foreach(__v => __obj.updateDynamic("KMSKeyDetails")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimeStamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimeStamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      S3RepositoryDetails.foreach(__v => __obj.updateDynamic("S3RepositoryDetails")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryAssociation]
    }
  }

  /** Summary information about a repository association. The <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_ListRepositoryAssociations.html"> <code>ListRepositoryAssociations</code> </a> operation returns a list of <code>RepositoryAssociationSummary</code> objects.
    */
  @js.native
  trait RepositoryAssociationSummary extends js.Object {
    var AssociationArn: js.UndefOr[Arn]
    var AssociationId: js.UndefOr[AssociationId]
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var LastUpdatedTimeStamp: js.UndefOr[TimeStamp]
    var Name: js.UndefOr[Name]
    var Owner: js.UndefOr[Owner]
    var ProviderType: js.UndefOr[ProviderType]
    var State: js.UndefOr[RepositoryAssociationState]
  }

  object RepositoryAssociationSummary {
    @inline
    def apply(
        AssociationArn: js.UndefOr[Arn] = js.undefined,
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        State: js.UndefOr[RepositoryAssociationState] = js.undefined
    ): RepositoryAssociationSummary = {
      val __obj = js.Dynamic.literal()
      AssociationArn.foreach(__v => __obj.updateDynamic("AssociationArn")(__v.asInstanceOf[js.Any]))
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimeStamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimeStamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryAssociationSummary]
    }
  }

  /** A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType"> <code>SourceCodeType</code> </a> that specifies the tip of a branch in an associated repository.
    */
  @js.native
  trait RepositoryHeadSourceCodeType extends js.Object {
    var BranchName: BranchName
  }

  object RepositoryHeadSourceCodeType {
    @inline
    def apply(
        BranchName: BranchName
    ): RepositoryHeadSourceCodeType = {
      val __obj = js.Dynamic.literal(
        "BranchName" -> BranchName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RepositoryHeadSourceCodeType]
    }
  }

  /** Metadata that is associated with a code review. This applies to both pull request and repository analysis code reviews.
    */
  @js.native
  trait RequestMetadata extends js.Object {
    var EventInfo: js.UndefOr[EventInfo]
    var RequestId: js.UndefOr[RequestId]
    var Requester: js.UndefOr[Requester]
    var VendorName: js.UndefOr[VendorName]
  }

  object RequestMetadata {
    @inline
    def apply(
        EventInfo: js.UndefOr[EventInfo] = js.undefined,
        RequestId: js.UndefOr[RequestId] = js.undefined,
        Requester: js.UndefOr[Requester] = js.undefined,
        VendorName: js.UndefOr[VendorName] = js.undefined
    ): RequestMetadata = {
      val __obj = js.Dynamic.literal()
      EventInfo.foreach(__v => __obj.updateDynamic("EventInfo")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Requester.foreach(__v => __obj.updateDynamic("Requester")(__v.asInstanceOf[js.Any]))
      VendorName.foreach(__v => __obj.updateDynamic("VendorName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestMetadata]
    }
  }

  /** Metadata about a rule. Rule metadata includes an ID, a name, a list of tags, and a short and long description. CodeGuru Reviewer uses rules to analyze code. A rule's recommendation is included in analysis results if code is detected that violates the rule.
    */
  @js.native
  trait RuleMetadata extends js.Object {
    var LongDescription: js.UndefOr[LongDescription]
    var RuleId: js.UndefOr[RuleId]
    var RuleName: js.UndefOr[RuleName]
    var RuleTags: js.UndefOr[RuleTags]
    var ShortDescription: js.UndefOr[ShortDescription]
  }

  object RuleMetadata {
    @inline
    def apply(
        LongDescription: js.UndefOr[LongDescription] = js.undefined,
        RuleId: js.UndefOr[RuleId] = js.undefined,
        RuleName: js.UndefOr[RuleName] = js.undefined,
        RuleTags: js.UndefOr[RuleTags] = js.undefined,
        ShortDescription: js.UndefOr[ShortDescription] = js.undefined
    ): RuleMetadata = {
      val __obj = js.Dynamic.literal()
      LongDescription.foreach(__v => __obj.updateDynamic("LongDescription")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.updateDynamic("RuleName")(__v.asInstanceOf[js.Any]))
      RuleTags.foreach(__v => __obj.updateDynamic("RuleTags")(__v.asInstanceOf[js.Any]))
      ShortDescription.foreach(__v => __obj.updateDynamic("ShortDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleMetadata]
    }
  }

  /** Information about an associated repository in an S3 bucket. The associated repository contains a source code .zip file and a build artifacts .zip file that contains .jar or .class files.
    */
  @js.native
  trait S3BucketRepository extends js.Object {
    var Name: Name
    var Details: js.UndefOr[S3RepositoryDetails]
  }

  object S3BucketRepository {
    @inline
    def apply(
        Name: Name,
        Details: js.UndefOr[S3RepositoryDetails] = js.undefined
    ): S3BucketRepository = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3BucketRepository]
    }
  }

  /** Information about a repository in an S3 bucket.
    */
  @js.native
  trait S3Repository extends js.Object {
    var BucketName: S3BucketName
    var Name: Name
  }

  object S3Repository {
    @inline
    def apply(
        BucketName: S3BucketName,
        Name: Name
    ): S3Repository = {
      val __obj = js.Dynamic.literal(
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Repository]
    }
  }

  /** Specifies the name of an S3 bucket and a <code>CodeArtifacts</code> object that contains the S3 object keys for a source code .zip file and for a build artifacts .zip file that contains .jar or .class files.
    */
  @js.native
  trait S3RepositoryDetails extends js.Object {
    var BucketName: js.UndefOr[S3BucketName]
    var CodeArtifacts: js.UndefOr[CodeArtifacts]
  }

  object S3RepositoryDetails {
    @inline
    def apply(
        BucketName: js.UndefOr[S3BucketName] = js.undefined,
        CodeArtifacts: js.UndefOr[CodeArtifacts] = js.undefined
    ): S3RepositoryDetails = {
      val __obj = js.Dynamic.literal()
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      CodeArtifacts.foreach(__v => __obj.updateDynamic("CodeArtifacts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3RepositoryDetails]
    }
  }

  /** Specifies the source code that is analyzed in a code review.
    */
  @js.native
  trait SourceCodeType extends js.Object {
    var BranchDiff: js.UndefOr[BranchDiffSourceCodeType]
    var CommitDiff: js.UndefOr[CommitDiffSourceCodeType]
    var RepositoryHead: js.UndefOr[RepositoryHeadSourceCodeType]
    var RequestMetadata: js.UndefOr[RequestMetadata]
    var S3BucketRepository: js.UndefOr[S3BucketRepository]
  }

  object SourceCodeType {
    @inline
    def apply(
        BranchDiff: js.UndefOr[BranchDiffSourceCodeType] = js.undefined,
        CommitDiff: js.UndefOr[CommitDiffSourceCodeType] = js.undefined,
        RepositoryHead: js.UndefOr[RepositoryHeadSourceCodeType] = js.undefined,
        RequestMetadata: js.UndefOr[RequestMetadata] = js.undefined,
        S3BucketRepository: js.UndefOr[S3BucketRepository] = js.undefined
    ): SourceCodeType = {
      val __obj = js.Dynamic.literal()
      BranchDiff.foreach(__v => __obj.updateDynamic("BranchDiff")(__v.asInstanceOf[js.Any]))
      CommitDiff.foreach(__v => __obj.updateDynamic("CommitDiff")(__v.asInstanceOf[js.Any]))
      RepositoryHead.foreach(__v => __obj.updateDynamic("RepositoryHead")(__v.asInstanceOf[js.Any]))
      RequestMetadata.foreach(__v => __obj.updateDynamic("RequestMetadata")(__v.asInstanceOf[js.Any]))
      S3BucketRepository.foreach(__v => __obj.updateDynamic("S3BucketRepository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceCodeType]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Tags: TagMap
    var resourceArn: AssociationArn
  }

  object TagResourceRequest {
    @inline
    def apply(
        Tags: TagMap,
        resourceArn: AssociationArn
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Tags" -> Tags.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
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

  /** Information about a third-party source repository connected to CodeGuru Reviewer.
    */
  @js.native
  trait ThirdPartySourceRepository extends js.Object {
    var ConnectionArn: ConnectionArn
    var Name: Name
    var Owner: Owner
  }

  object ThirdPartySourceRepository {
    @inline
    def apply(
        ConnectionArn: ConnectionArn,
        Name: Name,
        Owner: Owner
    ): ThirdPartySourceRepository = {
      val __obj = js.Dynamic.literal(
        "ConnectionArn" -> ConnectionArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Owner" -> Owner.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ThirdPartySourceRepository]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var TagKeys: TagKeyList
    var resourceArn: AssociationArn
  }

  object UntagResourceRequest {
    @inline
    def apply(
        TagKeys: TagKeyList,
        resourceArn: AssociationArn
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "TagKeys" -> TagKeys.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
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
}
