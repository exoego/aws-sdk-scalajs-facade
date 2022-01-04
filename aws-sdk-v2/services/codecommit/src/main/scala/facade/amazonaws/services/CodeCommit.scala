package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object codecommit {
  type AccountId = String
  type AdditionalData = String
  type ApprovalList = js.Array[Approval]
  type ApprovalRuleContent = String
  type ApprovalRuleId = String
  type ApprovalRuleName = String
  type ApprovalRuleTemplateContent = String
  type ApprovalRuleTemplateDescription = String
  type ApprovalRuleTemplateId = String
  type ApprovalRuleTemplateName = String
  type ApprovalRuleTemplateNameList = js.Array[ApprovalRuleTemplateName]
  type ApprovalRulesList = js.Array[ApprovalRule]
  type ApprovalRulesNotSatisfiedList = js.Array[ApprovalRuleName]
  type ApprovalRulesSatisfiedList = js.Array[ApprovalRuleName]
  type Approved = Boolean
  type Arn = String
  type BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList = js.Array[BatchAssociateApprovalRuleTemplateWithRepositoriesError]
  type BatchDescribeMergeConflictsErrors = js.Array[BatchDescribeMergeConflictsError]
  type BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList = js.Array[BatchDisassociateApprovalRuleTemplateFromRepositoriesError]
  type BatchGetCommitsErrorsList = js.Array[BatchGetCommitsError]
  type BranchName = String
  type BranchNameList = js.Array[BranchName]
  type CallerReactions = js.Array[ReactionValue]
  type CapitalBoolean = Boolean
  type ClientRequestToken = String
  type CloneUrlHttp = String
  type CloneUrlSsh = String
  type CommentId = String
  type Comments = js.Array[Comment]
  type CommentsForComparedCommitData = js.Array[CommentsForComparedCommit]
  type CommentsForPullRequestData = js.Array[CommentsForPullRequest]
  type CommitId = String
  type CommitIdsInputList = js.Array[ObjectId]
  type CommitName = String
  type CommitObjectsList = js.Array[Commit]
  type ConflictMetadataList = js.Array[ConflictMetadata]
  type Conflicts = js.Array[Conflict]
  type Content = String
  type Count = Int
  type CreationDate = js.Date
  type Date = String
  type DeleteFileEntries = js.Array[DeleteFileEntry]
  type Description = String
  type DifferenceList = js.Array[Difference]
  type Email = String
  type ErrorCode = String
  type ErrorMessage = String
  type EventDate = js.Date
  type ExceptionName = String
  type FileContent = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type FileList = js.Array[File]
  type FilePaths = js.Array[Path]
  type FileSize = Double
  type FilesMetadata = js.Array[FileMetadata]
  type FolderList = js.Array[Folder]
  type HunkContent = String
  type IsCommentDeleted = Boolean
  type IsContentConflict = Boolean
  type IsFileModeConflict = Boolean
  type IsHunkConflict = Boolean
  type IsMergeable = Boolean
  type IsMerged = Boolean
  type IsMove = Boolean
  type IsObjectTypeConflict = Boolean
  type KeepEmptyFolders = Boolean
  type LastModifiedDate = js.Date
  type Limit = Int
  type LineNumber = Int
  type MaxResults = Int
  type MergeHunks = js.Array[MergeHunk]
  type MergeOptions = js.Array[MergeOptionTypeEnum]
  type Message = String
  type Mode = String
  type Name = String
  type NextToken = String
  type NumberOfConflicts = Int
  type ObjectId = String
  type ObjectSize = Double
  type Overridden = Boolean
  type ParentList = js.Array[ObjectId]
  type Path = String
  type Position = Double
  type PullRequestEventList = js.Array[PullRequestEvent]
  type PullRequestId = String
  type PullRequestIdList = js.Array[PullRequestId]
  type PullRequestTargetList = js.Array[PullRequestTarget]
  type PutFileEntries = js.Array[PutFileEntry]
  type ReactionCountsMap = js.Dictionary[Count]
  type ReactionEmoji = String
  type ReactionShortCode = String
  type ReactionUnicode = String
  type ReactionUsersList = js.Array[Arn]
  type ReactionValue = String
  type ReactionsForCommentList = js.Array[ReactionForComment]
  type ReferenceName = String
  type ReplaceContentEntries = js.Array[ReplaceContentEntry]
  type RepositoryDescription = String
  type RepositoryId = String
  type RepositoryMetadataList = js.Array[RepositoryMetadata]
  type RepositoryName = String
  type RepositoryNameIdPairList = js.Array[RepositoryNameIdPair]
  type RepositoryNameList = js.Array[RepositoryName]
  type RepositoryNotFoundList = js.Array[RepositoryName]
  type RepositoryTriggerCustomData = String
  type RepositoryTriggerEventList = js.Array[RepositoryTriggerEventEnum]
  type RepositoryTriggerExecutionFailureList = js.Array[RepositoryTriggerExecutionFailure]
  type RepositoryTriggerExecutionFailureMessage = String
  type RepositoryTriggerName = String
  type RepositoryTriggerNameList = js.Array[RepositoryTriggerName]
  type RepositoryTriggersConfigurationId = String
  type RepositoryTriggersList = js.Array[RepositoryTrigger]
  type ResourceArn = String
  type RevisionId = String
  type RuleContentSha256 = String
  type SetFileModeEntries = js.Array[SetFileModeEntry]
  type SubModuleList = js.Array[SubModule]
  type SymbolicLinkList = js.Array[SymbolicLink]
  type TagKey = String
  type TagKeysList = js.Array[TagKey]
  type TagValue = String
  type TagsMap = js.Dictionary[TagValue]
  type TargetList = js.Array[Target]
  type Title = String
  type blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String

  final class CodeCommitOps(private val service: CodeCommit) extends AnyVal {

    @inline def associateApprovalRuleTemplateWithRepositoryFuture(params: AssociateApprovalRuleTemplateWithRepositoryInput): Future[js.Object] = service.associateApprovalRuleTemplateWithRepository(params).promise().toFuture
    @inline def batchAssociateApprovalRuleTemplateWithRepositoriesFuture(params: BatchAssociateApprovalRuleTemplateWithRepositoriesInput): Future[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput] = service.batchAssociateApprovalRuleTemplateWithRepositories(params).promise().toFuture
    @inline def batchDescribeMergeConflictsFuture(params: BatchDescribeMergeConflictsInput): Future[BatchDescribeMergeConflictsOutput] = service.batchDescribeMergeConflicts(params).promise().toFuture
    @inline def batchDisassociateApprovalRuleTemplateFromRepositoriesFuture(params: BatchDisassociateApprovalRuleTemplateFromRepositoriesInput): Future[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput] = service.batchDisassociateApprovalRuleTemplateFromRepositories(params).promise().toFuture
    @inline def batchGetCommitsFuture(params: BatchGetCommitsInput): Future[BatchGetCommitsOutput] = service.batchGetCommits(params).promise().toFuture
    @inline def batchGetRepositoriesFuture(params: BatchGetRepositoriesInput): Future[BatchGetRepositoriesOutput] = service.batchGetRepositories(params).promise().toFuture
    @inline def createApprovalRuleTemplateFuture(params: CreateApprovalRuleTemplateInput): Future[CreateApprovalRuleTemplateOutput] = service.createApprovalRuleTemplate(params).promise().toFuture
    @inline def createBranchFuture(params: CreateBranchInput): Future[js.Object] = service.createBranch(params).promise().toFuture
    @inline def createCommitFuture(params: CreateCommitInput): Future[CreateCommitOutput] = service.createCommit(params).promise().toFuture
    @inline def createPullRequestApprovalRuleFuture(params: CreatePullRequestApprovalRuleInput): Future[CreatePullRequestApprovalRuleOutput] = service.createPullRequestApprovalRule(params).promise().toFuture
    @inline def createPullRequestFuture(params: CreatePullRequestInput): Future[CreatePullRequestOutput] = service.createPullRequest(params).promise().toFuture
    @inline def createRepositoryFuture(params: CreateRepositoryInput): Future[CreateRepositoryOutput] = service.createRepository(params).promise().toFuture
    @inline def createUnreferencedMergeCommitFuture(params: CreateUnreferencedMergeCommitInput): Future[CreateUnreferencedMergeCommitOutput] = service.createUnreferencedMergeCommit(params).promise().toFuture
    @inline def deleteApprovalRuleTemplateFuture(params: DeleteApprovalRuleTemplateInput): Future[DeleteApprovalRuleTemplateOutput] = service.deleteApprovalRuleTemplate(params).promise().toFuture
    @inline def deleteBranchFuture(params: DeleteBranchInput): Future[DeleteBranchOutput] = service.deleteBranch(params).promise().toFuture
    @inline def deleteCommentContentFuture(params: DeleteCommentContentInput): Future[DeleteCommentContentOutput] = service.deleteCommentContent(params).promise().toFuture
    @inline def deleteFileFuture(params: DeleteFileInput): Future[DeleteFileOutput] = service.deleteFile(params).promise().toFuture
    @inline def deletePullRequestApprovalRuleFuture(params: DeletePullRequestApprovalRuleInput): Future[DeletePullRequestApprovalRuleOutput] = service.deletePullRequestApprovalRule(params).promise().toFuture
    @inline def deleteRepositoryFuture(params: DeleteRepositoryInput): Future[DeleteRepositoryOutput] = service.deleteRepository(params).promise().toFuture
    @inline def describeMergeConflictsFuture(params: DescribeMergeConflictsInput): Future[DescribeMergeConflictsOutput] = service.describeMergeConflicts(params).promise().toFuture
    @inline def describePullRequestEventsFuture(params: DescribePullRequestEventsInput): Future[DescribePullRequestEventsOutput] = service.describePullRequestEvents(params).promise().toFuture
    @inline def disassociateApprovalRuleTemplateFromRepositoryFuture(params: DisassociateApprovalRuleTemplateFromRepositoryInput): Future[js.Object] = service.disassociateApprovalRuleTemplateFromRepository(params).promise().toFuture
    @inline def evaluatePullRequestApprovalRulesFuture(params: EvaluatePullRequestApprovalRulesInput): Future[EvaluatePullRequestApprovalRulesOutput] = service.evaluatePullRequestApprovalRules(params).promise().toFuture
    @inline def getApprovalRuleTemplateFuture(params: GetApprovalRuleTemplateInput): Future[GetApprovalRuleTemplateOutput] = service.getApprovalRuleTemplate(params).promise().toFuture
    @inline def getBlobFuture(params: GetBlobInput): Future[GetBlobOutput] = service.getBlob(params).promise().toFuture
    @inline def getBranchFuture(params: GetBranchInput): Future[GetBranchOutput] = service.getBranch(params).promise().toFuture
    @inline def getCommentFuture(params: GetCommentInput): Future[GetCommentOutput] = service.getComment(params).promise().toFuture
    @inline def getCommentReactionsFuture(params: GetCommentReactionsInput): Future[GetCommentReactionsOutput] = service.getCommentReactions(params).promise().toFuture
    @inline def getCommentsForComparedCommitFuture(params: GetCommentsForComparedCommitInput): Future[GetCommentsForComparedCommitOutput] = service.getCommentsForComparedCommit(params).promise().toFuture
    @inline def getCommentsForPullRequestFuture(params: GetCommentsForPullRequestInput): Future[GetCommentsForPullRequestOutput] = service.getCommentsForPullRequest(params).promise().toFuture
    @inline def getCommitFuture(params: GetCommitInput): Future[GetCommitOutput] = service.getCommit(params).promise().toFuture
    @inline def getDifferencesFuture(params: GetDifferencesInput): Future[GetDifferencesOutput] = service.getDifferences(params).promise().toFuture
    @inline def getFileFuture(params: GetFileInput): Future[GetFileOutput] = service.getFile(params).promise().toFuture
    @inline def getFolderFuture(params: GetFolderInput): Future[GetFolderOutput] = service.getFolder(params).promise().toFuture
    @inline def getMergeCommitFuture(params: GetMergeCommitInput): Future[GetMergeCommitOutput] = service.getMergeCommit(params).promise().toFuture
    @inline def getMergeConflictsFuture(params: GetMergeConflictsInput): Future[GetMergeConflictsOutput] = service.getMergeConflicts(params).promise().toFuture
    @inline def getMergeOptionsFuture(params: GetMergeOptionsInput): Future[GetMergeOptionsOutput] = service.getMergeOptions(params).promise().toFuture
    @inline def getPullRequestApprovalStatesFuture(params: GetPullRequestApprovalStatesInput): Future[GetPullRequestApprovalStatesOutput] = service.getPullRequestApprovalStates(params).promise().toFuture
    @inline def getPullRequestFuture(params: GetPullRequestInput): Future[GetPullRequestOutput] = service.getPullRequest(params).promise().toFuture
    @inline def getPullRequestOverrideStateFuture(params: GetPullRequestOverrideStateInput): Future[GetPullRequestOverrideStateOutput] = service.getPullRequestOverrideState(params).promise().toFuture
    @inline def getRepositoryFuture(params: GetRepositoryInput): Future[GetRepositoryOutput] = service.getRepository(params).promise().toFuture
    @inline def getRepositoryTriggersFuture(params: GetRepositoryTriggersInput): Future[GetRepositoryTriggersOutput] = service.getRepositoryTriggers(params).promise().toFuture
    @inline def listApprovalRuleTemplatesFuture(params: ListApprovalRuleTemplatesInput): Future[ListApprovalRuleTemplatesOutput] = service.listApprovalRuleTemplates(params).promise().toFuture
    @inline def listAssociatedApprovalRuleTemplatesForRepositoryFuture(params: ListAssociatedApprovalRuleTemplatesForRepositoryInput): Future[ListAssociatedApprovalRuleTemplatesForRepositoryOutput] = service.listAssociatedApprovalRuleTemplatesForRepository(params).promise().toFuture
    @inline def listBranchesFuture(params: ListBranchesInput): Future[ListBranchesOutput] = service.listBranches(params).promise().toFuture
    @inline def listPullRequestsFuture(params: ListPullRequestsInput): Future[ListPullRequestsOutput] = service.listPullRequests(params).promise().toFuture
    @inline def listRepositoriesForApprovalRuleTemplateFuture(params: ListRepositoriesForApprovalRuleTemplateInput): Future[ListRepositoriesForApprovalRuleTemplateOutput] = service.listRepositoriesForApprovalRuleTemplate(params).promise().toFuture
    @inline def listRepositoriesFuture(params: ListRepositoriesInput): Future[ListRepositoriesOutput] = service.listRepositories(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def mergeBranchesByFastForwardFuture(params: MergeBranchesByFastForwardInput): Future[MergeBranchesByFastForwardOutput] = service.mergeBranchesByFastForward(params).promise().toFuture
    @inline def mergeBranchesBySquashFuture(params: MergeBranchesBySquashInput): Future[MergeBranchesBySquashOutput] = service.mergeBranchesBySquash(params).promise().toFuture
    @inline def mergeBranchesByThreeWayFuture(params: MergeBranchesByThreeWayInput): Future[MergeBranchesByThreeWayOutput] = service.mergeBranchesByThreeWay(params).promise().toFuture
    @inline def mergePullRequestByFastForwardFuture(params: MergePullRequestByFastForwardInput): Future[MergePullRequestByFastForwardOutput] = service.mergePullRequestByFastForward(params).promise().toFuture
    @inline def mergePullRequestBySquashFuture(params: MergePullRequestBySquashInput): Future[MergePullRequestBySquashOutput] = service.mergePullRequestBySquash(params).promise().toFuture
    @inline def mergePullRequestByThreeWayFuture(params: MergePullRequestByThreeWayInput): Future[MergePullRequestByThreeWayOutput] = service.mergePullRequestByThreeWay(params).promise().toFuture
    @inline def overridePullRequestApprovalRulesFuture(params: OverridePullRequestApprovalRulesInput): Future[js.Object] = service.overridePullRequestApprovalRules(params).promise().toFuture
    @inline def postCommentForComparedCommitFuture(params: PostCommentForComparedCommitInput): Future[PostCommentForComparedCommitOutput] = service.postCommentForComparedCommit(params).promise().toFuture
    @inline def postCommentForPullRequestFuture(params: PostCommentForPullRequestInput): Future[PostCommentForPullRequestOutput] = service.postCommentForPullRequest(params).promise().toFuture
    @inline def postCommentReplyFuture(params: PostCommentReplyInput): Future[PostCommentReplyOutput] = service.postCommentReply(params).promise().toFuture
    @inline def putCommentReactionFuture(params: PutCommentReactionInput): Future[js.Object] = service.putCommentReaction(params).promise().toFuture
    @inline def putFileFuture(params: PutFileInput): Future[PutFileOutput] = service.putFile(params).promise().toFuture
    @inline def putRepositoryTriggersFuture(params: PutRepositoryTriggersInput): Future[PutRepositoryTriggersOutput] = service.putRepositoryTriggers(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def testRepositoryTriggersFuture(params: TestRepositoryTriggersInput): Future[TestRepositoryTriggersOutput] = service.testRepositoryTriggers(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateApprovalRuleTemplateContentFuture(params: UpdateApprovalRuleTemplateContentInput): Future[UpdateApprovalRuleTemplateContentOutput] = service.updateApprovalRuleTemplateContent(params).promise().toFuture
    @inline def updateApprovalRuleTemplateDescriptionFuture(params: UpdateApprovalRuleTemplateDescriptionInput): Future[UpdateApprovalRuleTemplateDescriptionOutput] = service.updateApprovalRuleTemplateDescription(params).promise().toFuture
    @inline def updateApprovalRuleTemplateNameFuture(params: UpdateApprovalRuleTemplateNameInput): Future[UpdateApprovalRuleTemplateNameOutput] = service.updateApprovalRuleTemplateName(params).promise().toFuture
    @inline def updateCommentFuture(params: UpdateCommentInput): Future[UpdateCommentOutput] = service.updateComment(params).promise().toFuture
    @inline def updateDefaultBranchFuture(params: UpdateDefaultBranchInput): Future[js.Object] = service.updateDefaultBranch(params).promise().toFuture
    @inline def updatePullRequestApprovalRuleContentFuture(params: UpdatePullRequestApprovalRuleContentInput): Future[UpdatePullRequestApprovalRuleContentOutput] = service.updatePullRequestApprovalRuleContent(params).promise().toFuture
    @inline def updatePullRequestApprovalStateFuture(params: UpdatePullRequestApprovalStateInput): Future[js.Object] = service.updatePullRequestApprovalState(params).promise().toFuture
    @inline def updatePullRequestDescriptionFuture(params: UpdatePullRequestDescriptionInput): Future[UpdatePullRequestDescriptionOutput] = service.updatePullRequestDescription(params).promise().toFuture
    @inline def updatePullRequestStatusFuture(params: UpdatePullRequestStatusInput): Future[UpdatePullRequestStatusOutput] = service.updatePullRequestStatus(params).promise().toFuture
    @inline def updatePullRequestTitleFuture(params: UpdatePullRequestTitleInput): Future[UpdatePullRequestTitleOutput] = service.updatePullRequestTitle(params).promise().toFuture
    @inline def updateRepositoryDescriptionFuture(params: UpdateRepositoryDescriptionInput): Future[js.Object] = service.updateRepositoryDescription(params).promise().toFuture
    @inline def updateRepositoryNameFuture(params: UpdateRepositoryNameInput): Future[js.Object] = service.updateRepositoryName(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/codecommit", JSImport.Namespace, "AWS.CodeCommit")
  class CodeCommit() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateApprovalRuleTemplateWithRepository(params: AssociateApprovalRuleTemplateWithRepositoryInput): Request[js.Object] = js.native
    def batchAssociateApprovalRuleTemplateWithRepositories(params: BatchAssociateApprovalRuleTemplateWithRepositoriesInput): Request[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput] = js.native
    def batchDescribeMergeConflicts(params: BatchDescribeMergeConflictsInput): Request[BatchDescribeMergeConflictsOutput] = js.native
    def batchDisassociateApprovalRuleTemplateFromRepositories(params: BatchDisassociateApprovalRuleTemplateFromRepositoriesInput): Request[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput] = js.native
    def batchGetCommits(params: BatchGetCommitsInput): Request[BatchGetCommitsOutput] = js.native
    def batchGetRepositories(params: BatchGetRepositoriesInput): Request[BatchGetRepositoriesOutput] = js.native
    def createApprovalRuleTemplate(params: CreateApprovalRuleTemplateInput): Request[CreateApprovalRuleTemplateOutput] = js.native
    def createBranch(params: CreateBranchInput): Request[js.Object] = js.native
    def createCommit(params: CreateCommitInput): Request[CreateCommitOutput] = js.native
    def createPullRequest(params: CreatePullRequestInput): Request[CreatePullRequestOutput] = js.native
    def createPullRequestApprovalRule(params: CreatePullRequestApprovalRuleInput): Request[CreatePullRequestApprovalRuleOutput] = js.native
    def createRepository(params: CreateRepositoryInput): Request[CreateRepositoryOutput] = js.native
    def createUnreferencedMergeCommit(params: CreateUnreferencedMergeCommitInput): Request[CreateUnreferencedMergeCommitOutput] = js.native
    def deleteApprovalRuleTemplate(params: DeleteApprovalRuleTemplateInput): Request[DeleteApprovalRuleTemplateOutput] = js.native
    def deleteBranch(params: DeleteBranchInput): Request[DeleteBranchOutput] = js.native
    def deleteCommentContent(params: DeleteCommentContentInput): Request[DeleteCommentContentOutput] = js.native
    def deleteFile(params: DeleteFileInput): Request[DeleteFileOutput] = js.native
    def deletePullRequestApprovalRule(params: DeletePullRequestApprovalRuleInput): Request[DeletePullRequestApprovalRuleOutput] = js.native
    def deleteRepository(params: DeleteRepositoryInput): Request[DeleteRepositoryOutput] = js.native
    def describeMergeConflicts(params: DescribeMergeConflictsInput): Request[DescribeMergeConflictsOutput] = js.native
    def describePullRequestEvents(params: DescribePullRequestEventsInput): Request[DescribePullRequestEventsOutput] = js.native
    def disassociateApprovalRuleTemplateFromRepository(params: DisassociateApprovalRuleTemplateFromRepositoryInput): Request[js.Object] = js.native
    def evaluatePullRequestApprovalRules(params: EvaluatePullRequestApprovalRulesInput): Request[EvaluatePullRequestApprovalRulesOutput] = js.native
    def getApprovalRuleTemplate(params: GetApprovalRuleTemplateInput): Request[GetApprovalRuleTemplateOutput] = js.native
    def getBlob(params: GetBlobInput): Request[GetBlobOutput] = js.native
    def getBranch(params: GetBranchInput): Request[GetBranchOutput] = js.native
    def getComment(params: GetCommentInput): Request[GetCommentOutput] = js.native
    def getCommentReactions(params: GetCommentReactionsInput): Request[GetCommentReactionsOutput] = js.native
    def getCommentsForComparedCommit(params: GetCommentsForComparedCommitInput): Request[GetCommentsForComparedCommitOutput] = js.native
    def getCommentsForPullRequest(params: GetCommentsForPullRequestInput): Request[GetCommentsForPullRequestOutput] = js.native
    def getCommit(params: GetCommitInput): Request[GetCommitOutput] = js.native
    def getDifferences(params: GetDifferencesInput): Request[GetDifferencesOutput] = js.native
    def getFile(params: GetFileInput): Request[GetFileOutput] = js.native
    def getFolder(params: GetFolderInput): Request[GetFolderOutput] = js.native
    def getMergeCommit(params: GetMergeCommitInput): Request[GetMergeCommitOutput] = js.native
    def getMergeConflicts(params: GetMergeConflictsInput): Request[GetMergeConflictsOutput] = js.native
    def getMergeOptions(params: GetMergeOptionsInput): Request[GetMergeOptionsOutput] = js.native
    def getPullRequest(params: GetPullRequestInput): Request[GetPullRequestOutput] = js.native
    def getPullRequestApprovalStates(params: GetPullRequestApprovalStatesInput): Request[GetPullRequestApprovalStatesOutput] = js.native
    def getPullRequestOverrideState(params: GetPullRequestOverrideStateInput): Request[GetPullRequestOverrideStateOutput] = js.native
    def getRepository(params: GetRepositoryInput): Request[GetRepositoryOutput] = js.native
    def getRepositoryTriggers(params: GetRepositoryTriggersInput): Request[GetRepositoryTriggersOutput] = js.native
    def listApprovalRuleTemplates(params: ListApprovalRuleTemplatesInput): Request[ListApprovalRuleTemplatesOutput] = js.native
    def listAssociatedApprovalRuleTemplatesForRepository(params: ListAssociatedApprovalRuleTemplatesForRepositoryInput): Request[ListAssociatedApprovalRuleTemplatesForRepositoryOutput] = js.native
    def listBranches(params: ListBranchesInput): Request[ListBranchesOutput] = js.native
    def listPullRequests(params: ListPullRequestsInput): Request[ListPullRequestsOutput] = js.native
    def listRepositories(params: ListRepositoriesInput): Request[ListRepositoriesOutput] = js.native
    def listRepositoriesForApprovalRuleTemplate(params: ListRepositoriesForApprovalRuleTemplateInput): Request[ListRepositoriesForApprovalRuleTemplateOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def mergeBranchesByFastForward(params: MergeBranchesByFastForwardInput): Request[MergeBranchesByFastForwardOutput] = js.native
    def mergeBranchesBySquash(params: MergeBranchesBySquashInput): Request[MergeBranchesBySquashOutput] = js.native
    def mergeBranchesByThreeWay(params: MergeBranchesByThreeWayInput): Request[MergeBranchesByThreeWayOutput] = js.native
    def mergePullRequestByFastForward(params: MergePullRequestByFastForwardInput): Request[MergePullRequestByFastForwardOutput] = js.native
    def mergePullRequestBySquash(params: MergePullRequestBySquashInput): Request[MergePullRequestBySquashOutput] = js.native
    def mergePullRequestByThreeWay(params: MergePullRequestByThreeWayInput): Request[MergePullRequestByThreeWayOutput] = js.native
    def overridePullRequestApprovalRules(params: OverridePullRequestApprovalRulesInput): Request[js.Object] = js.native
    def postCommentForComparedCommit(params: PostCommentForComparedCommitInput): Request[PostCommentForComparedCommitOutput] = js.native
    def postCommentForPullRequest(params: PostCommentForPullRequestInput): Request[PostCommentForPullRequestOutput] = js.native
    def postCommentReply(params: PostCommentReplyInput): Request[PostCommentReplyOutput] = js.native
    def putCommentReaction(params: PutCommentReactionInput): Request[js.Object] = js.native
    def putFile(params: PutFileInput): Request[PutFileOutput] = js.native
    def putRepositoryTriggers(params: PutRepositoryTriggersInput): Request[PutRepositoryTriggersOutput] = js.native
    def tagResource(params: TagResourceInput): Request[js.Object] = js.native
    def testRepositoryTriggers(params: TestRepositoryTriggersInput): Request[TestRepositoryTriggersOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[js.Object] = js.native
    def updateApprovalRuleTemplateContent(params: UpdateApprovalRuleTemplateContentInput): Request[UpdateApprovalRuleTemplateContentOutput] = js.native
    def updateApprovalRuleTemplateDescription(params: UpdateApprovalRuleTemplateDescriptionInput): Request[UpdateApprovalRuleTemplateDescriptionOutput] = js.native
    def updateApprovalRuleTemplateName(params: UpdateApprovalRuleTemplateNameInput): Request[UpdateApprovalRuleTemplateNameOutput] = js.native
    def updateComment(params: UpdateCommentInput): Request[UpdateCommentOutput] = js.native
    def updateDefaultBranch(params: UpdateDefaultBranchInput): Request[js.Object] = js.native
    def updatePullRequestApprovalRuleContent(params: UpdatePullRequestApprovalRuleContentInput): Request[UpdatePullRequestApprovalRuleContentOutput] = js.native
    def updatePullRequestApprovalState(params: UpdatePullRequestApprovalStateInput): Request[js.Object] = js.native
    def updatePullRequestDescription(params: UpdatePullRequestDescriptionInput): Request[UpdatePullRequestDescriptionOutput] = js.native
    def updatePullRequestStatus(params: UpdatePullRequestStatusInput): Request[UpdatePullRequestStatusOutput] = js.native
    def updatePullRequestTitle(params: UpdatePullRequestTitleInput): Request[UpdatePullRequestTitleOutput] = js.native
    def updateRepositoryDescription(params: UpdateRepositoryDescriptionInput): Request[js.Object] = js.native
    def updateRepositoryName(params: UpdateRepositoryNameInput): Request[js.Object] = js.native
  }
  object CodeCommit {
    @inline implicit def toOps(service: CodeCommit): CodeCommitOps = {
      new CodeCommitOps(service)
    }
  }

  /** Returns information about a specific approval on a pull request.
    */
  @js.native
  trait Approval extends js.Object {
    var approvalState: js.UndefOr[ApprovalState]
    var userArn: js.UndefOr[Arn]
  }

  object Approval {
    @inline
    def apply(
        approvalState: js.UndefOr[ApprovalState] = js.undefined,
        userArn: js.UndefOr[Arn] = js.undefined
    ): Approval = {
      val __obj = js.Dynamic.literal()
      approvalState.foreach(__v => __obj.updateDynamic("approvalState")(__v.asInstanceOf[js.Any]))
      userArn.foreach(__v => __obj.updateDynamic("userArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Approval]
    }
  }

  /** Returns information about an approval rule.
    */
  @js.native
  trait ApprovalRule extends js.Object {
    var approvalRuleContent: js.UndefOr[ApprovalRuleContent]
    var approvalRuleId: js.UndefOr[ApprovalRuleId]
    var approvalRuleName: js.UndefOr[ApprovalRuleName]
    var creationDate: js.UndefOr[CreationDate]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
    var lastModifiedUser: js.UndefOr[Arn]
    var originApprovalRuleTemplate: js.UndefOr[OriginApprovalRuleTemplate]
    var ruleContentSha256: js.UndefOr[RuleContentSha256]
  }

  object ApprovalRule {
    @inline
    def apply(
        approvalRuleContent: js.UndefOr[ApprovalRuleContent] = js.undefined,
        approvalRuleId: js.UndefOr[ApprovalRuleId] = js.undefined,
        approvalRuleName: js.UndefOr[ApprovalRuleName] = js.undefined,
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined,
        lastModifiedUser: js.UndefOr[Arn] = js.undefined,
        originApprovalRuleTemplate: js.UndefOr[OriginApprovalRuleTemplate] = js.undefined,
        ruleContentSha256: js.UndefOr[RuleContentSha256] = js.undefined
    ): ApprovalRule = {
      val __obj = js.Dynamic.literal()
      approvalRuleContent.foreach(__v => __obj.updateDynamic("approvalRuleContent")(__v.asInstanceOf[js.Any]))
      approvalRuleId.foreach(__v => __obj.updateDynamic("approvalRuleId")(__v.asInstanceOf[js.Any]))
      approvalRuleName.foreach(__v => __obj.updateDynamic("approvalRuleName")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      lastModifiedUser.foreach(__v => __obj.updateDynamic("lastModifiedUser")(__v.asInstanceOf[js.Any]))
      originApprovalRuleTemplate.foreach(__v => __obj.updateDynamic("originApprovalRuleTemplate")(__v.asInstanceOf[js.Any]))
      ruleContentSha256.foreach(__v => __obj.updateDynamic("ruleContentSha256")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApprovalRule]
    }
  }

  /** Returns information about an event for an approval rule.
    */
  @js.native
  trait ApprovalRuleEventMetadata extends js.Object {
    var approvalRuleContent: js.UndefOr[ApprovalRuleContent]
    var approvalRuleId: js.UndefOr[ApprovalRuleId]
    var approvalRuleName: js.UndefOr[ApprovalRuleName]
  }

  object ApprovalRuleEventMetadata {
    @inline
    def apply(
        approvalRuleContent: js.UndefOr[ApprovalRuleContent] = js.undefined,
        approvalRuleId: js.UndefOr[ApprovalRuleId] = js.undefined,
        approvalRuleName: js.UndefOr[ApprovalRuleName] = js.undefined
    ): ApprovalRuleEventMetadata = {
      val __obj = js.Dynamic.literal()
      approvalRuleContent.foreach(__v => __obj.updateDynamic("approvalRuleContent")(__v.asInstanceOf[js.Any]))
      approvalRuleId.foreach(__v => __obj.updateDynamic("approvalRuleId")(__v.asInstanceOf[js.Any]))
      approvalRuleName.foreach(__v => __obj.updateDynamic("approvalRuleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApprovalRuleEventMetadata]
    }
  }

  /** Returns information about an override event for approval rules for a pull request.
    */
  @js.native
  trait ApprovalRuleOverriddenEventMetadata extends js.Object {
    var overrideStatus: js.UndefOr[OverrideStatus]
    var revisionId: js.UndefOr[RevisionId]
  }

  object ApprovalRuleOverriddenEventMetadata {
    @inline
    def apply(
        overrideStatus: js.UndefOr[OverrideStatus] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined
    ): ApprovalRuleOverriddenEventMetadata = {
      val __obj = js.Dynamic.literal()
      overrideStatus.foreach(__v => __obj.updateDynamic("overrideStatus")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApprovalRuleOverriddenEventMetadata]
    }
  }

  /** Returns information about an approval rule template.
    */
  @js.native
  trait ApprovalRuleTemplate extends js.Object {
    var approvalRuleTemplateContent: js.UndefOr[ApprovalRuleTemplateContent]
    var approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription]
    var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId]
    var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName]
    var creationDate: js.UndefOr[CreationDate]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
    var lastModifiedUser: js.UndefOr[Arn]
    var ruleContentSha256: js.UndefOr[RuleContentSha256]
  }

  object ApprovalRuleTemplate {
    @inline
    def apply(
        approvalRuleTemplateContent: js.UndefOr[ApprovalRuleTemplateContent] = js.undefined,
        approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription] = js.undefined,
        approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.undefined,
        approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.undefined,
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined,
        lastModifiedUser: js.UndefOr[Arn] = js.undefined,
        ruleContentSha256: js.UndefOr[RuleContentSha256] = js.undefined
    ): ApprovalRuleTemplate = {
      val __obj = js.Dynamic.literal()
      approvalRuleTemplateContent.foreach(__v => __obj.updateDynamic("approvalRuleTemplateContent")(__v.asInstanceOf[js.Any]))
      approvalRuleTemplateDescription.foreach(__v => __obj.updateDynamic("approvalRuleTemplateDescription")(__v.asInstanceOf[js.Any]))
      approvalRuleTemplateId.foreach(__v => __obj.updateDynamic("approvalRuleTemplateId")(__v.asInstanceOf[js.Any]))
      approvalRuleTemplateName.foreach(__v => __obj.updateDynamic("approvalRuleTemplateName")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      lastModifiedUser.foreach(__v => __obj.updateDynamic("lastModifiedUser")(__v.asInstanceOf[js.Any]))
      ruleContentSha256.foreach(__v => __obj.updateDynamic("ruleContentSha256")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApprovalRuleTemplate]
    }
  }

  /** Returns information about a change in the approval state for a pull request.
    */
  @js.native
  trait ApprovalStateChangedEventMetadata extends js.Object {
    var approvalStatus: js.UndefOr[ApprovalState]
    var revisionId: js.UndefOr[RevisionId]
  }

  object ApprovalStateChangedEventMetadata {
    @inline
    def apply(
        approvalStatus: js.UndefOr[ApprovalState] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined
    ): ApprovalStateChangedEventMetadata = {
      val __obj = js.Dynamic.literal()
      approvalStatus.foreach(__v => __obj.updateDynamic("approvalStatus")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApprovalStateChangedEventMetadata]
    }
  }

  @js.native
  trait AssociateApprovalRuleTemplateWithRepositoryInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var repositoryName: RepositoryName
  }

  object AssociateApprovalRuleTemplateWithRepositoryInput {
    @inline
    def apply(
        approvalRuleTemplateName: ApprovalRuleTemplateName,
        repositoryName: RepositoryName
    ): AssociateApprovalRuleTemplateWithRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateApprovalRuleTemplateWithRepositoryInput]
    }
  }

  /** Returns information about errors in a BatchAssociateApprovalRuleTemplateWithRepositories operation.
    */
  @js.native
  trait BatchAssociateApprovalRuleTemplateWithRepositoriesError extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object BatchAssociateApprovalRuleTemplateWithRepositoriesError {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): BatchAssociateApprovalRuleTemplateWithRepositoriesError = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesError]
    }
  }

  @js.native
  trait BatchAssociateApprovalRuleTemplateWithRepositoriesInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var repositoryNames: RepositoryNameList
  }

  object BatchAssociateApprovalRuleTemplateWithRepositoriesInput {
    @inline
    def apply(
        approvalRuleTemplateName: ApprovalRuleTemplateName,
        repositoryNames: RepositoryNameList
    ): BatchAssociateApprovalRuleTemplateWithRepositoriesInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any],
        "repositoryNames" -> repositoryNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesInput]
    }
  }

  @js.native
  trait BatchAssociateApprovalRuleTemplateWithRepositoriesOutput extends js.Object {
    var associatedRepositoryNames: RepositoryNameList
    var errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList
  }

  object BatchAssociateApprovalRuleTemplateWithRepositoriesOutput {
    @inline
    def apply(
        associatedRepositoryNames: RepositoryNameList,
        errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList
    ): BatchAssociateApprovalRuleTemplateWithRepositoriesOutput = {
      val __obj = js.Dynamic.literal(
        "associatedRepositoryNames" -> associatedRepositoryNames.asInstanceOf[js.Any],
        "errors" -> errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput]
    }
  }

  /** Returns information about errors in a BatchDescribeMergeConflicts operation.
    */
  @js.native
  trait BatchDescribeMergeConflictsError extends js.Object {
    var exceptionName: ExceptionName
    var filePath: Path
    var message: Message
  }

  object BatchDescribeMergeConflictsError {
    @inline
    def apply(
        exceptionName: ExceptionName,
        filePath: Path,
        message: Message
    ): BatchDescribeMergeConflictsError = {
      val __obj = js.Dynamic.literal(
        "exceptionName" -> exceptionName.asInstanceOf[js.Any],
        "filePath" -> filePath.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDescribeMergeConflictsError]
    }
  }

  @js.native
  trait BatchDescribeMergeConflictsInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var mergeOption: MergeOptionTypeEnum
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
    var filePaths: js.UndefOr[FilePaths]
    var maxConflictFiles: js.UndefOr[MaxResults]
    var maxMergeHunks: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object BatchDescribeMergeConflictsInput {
    @inline
    def apply(
        destinationCommitSpecifier: CommitName,
        mergeOption: MergeOptionTypeEnum,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined,
        filePaths: js.UndefOr[FilePaths] = js.undefined,
        maxConflictFiles: js.UndefOr[MaxResults] = js.undefined,
        maxMergeHunks: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchDescribeMergeConflictsInput = {
      val __obj = js.Dynamic.literal(
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "mergeOption" -> mergeOption.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier" -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      filePaths.foreach(__v => __obj.updateDynamic("filePaths")(__v.asInstanceOf[js.Any]))
      maxConflictFiles.foreach(__v => __obj.updateDynamic("maxConflictFiles")(__v.asInstanceOf[js.Any]))
      maxMergeHunks.foreach(__v => __obj.updateDynamic("maxMergeHunks")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDescribeMergeConflictsInput]
    }
  }

  @js.native
  trait BatchDescribeMergeConflictsOutput extends js.Object {
    var conflicts: Conflicts
    var destinationCommitId: ObjectId
    var sourceCommitId: ObjectId
    var baseCommitId: js.UndefOr[ObjectId]
    var errors: js.UndefOr[BatchDescribeMergeConflictsErrors]
    var nextToken: js.UndefOr[NextToken]
  }

  object BatchDescribeMergeConflictsOutput {
    @inline
    def apply(
        conflicts: Conflicts,
        destinationCommitId: ObjectId,
        sourceCommitId: ObjectId,
        baseCommitId: js.UndefOr[ObjectId] = js.undefined,
        errors: js.UndefOr[BatchDescribeMergeConflictsErrors] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchDescribeMergeConflictsOutput = {
      val __obj = js.Dynamic.literal(
        "conflicts" -> conflicts.asInstanceOf[js.Any],
        "destinationCommitId" -> destinationCommitId.asInstanceOf[js.Any],
        "sourceCommitId" -> sourceCommitId.asInstanceOf[js.Any]
      )

      baseCommitId.foreach(__v => __obj.updateDynamic("baseCommitId")(__v.asInstanceOf[js.Any]))
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDescribeMergeConflictsOutput]
    }
  }

  /** Returns information about errors in a BatchDisassociateApprovalRuleTemplateFromRepositories operation.
    */
  @js.native
  trait BatchDisassociateApprovalRuleTemplateFromRepositoriesError extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object BatchDisassociateApprovalRuleTemplateFromRepositoriesError {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): BatchDisassociateApprovalRuleTemplateFromRepositoriesError = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesError]
    }
  }

  @js.native
  trait BatchDisassociateApprovalRuleTemplateFromRepositoriesInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var repositoryNames: RepositoryNameList
  }

  object BatchDisassociateApprovalRuleTemplateFromRepositoriesInput {
    @inline
    def apply(
        approvalRuleTemplateName: ApprovalRuleTemplateName,
        repositoryNames: RepositoryNameList
    ): BatchDisassociateApprovalRuleTemplateFromRepositoriesInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any],
        "repositoryNames" -> repositoryNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesInput]
    }
  }

  @js.native
  trait BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput extends js.Object {
    var disassociatedRepositoryNames: RepositoryNameList
    var errors: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList
  }

  object BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput {
    @inline
    def apply(
        disassociatedRepositoryNames: RepositoryNameList,
        errors: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList
    ): BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput = {
      val __obj = js.Dynamic.literal(
        "disassociatedRepositoryNames" -> disassociatedRepositoryNames.asInstanceOf[js.Any],
        "errors" -> errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput]
    }
  }

  /** Returns information about errors in a BatchGetCommits operation.
    */
  @js.native
  trait BatchGetCommitsError extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object BatchGetCommitsError {
    @inline
    def apply(
        commitId: js.UndefOr[ObjectId] = js.undefined,
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): BatchGetCommitsError = {
      val __obj = js.Dynamic.literal()
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetCommitsError]
    }
  }

  @js.native
  trait BatchGetCommitsInput extends js.Object {
    var commitIds: CommitIdsInputList
    var repositoryName: RepositoryName
  }

  object BatchGetCommitsInput {
    @inline
    def apply(
        commitIds: CommitIdsInputList,
        repositoryName: RepositoryName
    ): BatchGetCommitsInput = {
      val __obj = js.Dynamic.literal(
        "commitIds" -> commitIds.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetCommitsInput]
    }
  }

  @js.native
  trait BatchGetCommitsOutput extends js.Object {
    var commits: js.UndefOr[CommitObjectsList]
    var errors: js.UndefOr[BatchGetCommitsErrorsList]
  }

  object BatchGetCommitsOutput {
    @inline
    def apply(
        commits: js.UndefOr[CommitObjectsList] = js.undefined,
        errors: js.UndefOr[BatchGetCommitsErrorsList] = js.undefined
    ): BatchGetCommitsOutput = {
      val __obj = js.Dynamic.literal()
      commits.foreach(__v => __obj.updateDynamic("commits")(__v.asInstanceOf[js.Any]))
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetCommitsOutput]
    }
  }

  /** Represents the input of a batch get repositories operation.
    */
  @js.native
  trait BatchGetRepositoriesInput extends js.Object {
    var repositoryNames: RepositoryNameList
  }

  object BatchGetRepositoriesInput {
    @inline
    def apply(
        repositoryNames: RepositoryNameList
    ): BatchGetRepositoriesInput = {
      val __obj = js.Dynamic.literal(
        "repositoryNames" -> repositoryNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetRepositoriesInput]
    }
  }

  /** Represents the output of a batch get repositories operation.
    */
  @js.native
  trait BatchGetRepositoriesOutput extends js.Object {
    var repositories: js.UndefOr[RepositoryMetadataList]
    var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList]
  }

  object BatchGetRepositoriesOutput {
    @inline
    def apply(
        repositories: js.UndefOr[RepositoryMetadataList] = js.undefined,
        repositoriesNotFound: js.UndefOr[RepositoryNotFoundList] = js.undefined
    ): BatchGetRepositoriesOutput = {
      val __obj = js.Dynamic.literal()
      repositories.foreach(__v => __obj.updateDynamic("repositories")(__v.asInstanceOf[js.Any]))
      repositoriesNotFound.foreach(__v => __obj.updateDynamic("repositoriesNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetRepositoriesOutput]
    }
  }

  /** Returns information about a specific Git blob object.
    */
  @js.native
  trait BlobMetadata extends js.Object {
    var blobId: js.UndefOr[ObjectId]
    var mode: js.UndefOr[Mode]
    var path: js.UndefOr[Path]
  }

  object BlobMetadata {
    @inline
    def apply(
        blobId: js.UndefOr[ObjectId] = js.undefined,
        mode: js.UndefOr[Mode] = js.undefined,
        path: js.UndefOr[Path] = js.undefined
    ): BlobMetadata = {
      val __obj = js.Dynamic.literal()
      blobId.foreach(__v => __obj.updateDynamic("blobId")(__v.asInstanceOf[js.Any]))
      mode.foreach(__v => __obj.updateDynamic("mode")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlobMetadata]
    }
  }

  /** Returns information about a branch.
    */
  @js.native
  trait BranchInfo extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var commitId: js.UndefOr[CommitId]
  }

  object BranchInfo {
    @inline
    def apply(
        branchName: js.UndefOr[BranchName] = js.undefined,
        commitId: js.UndefOr[CommitId] = js.undefined
    ): BranchInfo = {
      val __obj = js.Dynamic.literal()
      branchName.foreach(__v => __obj.updateDynamic("branchName")(__v.asInstanceOf[js.Any]))
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BranchInfo]
    }
  }

  /** Returns information about a specific comment.
    */
  @js.native
  trait Comment extends js.Object {
    var authorArn: js.UndefOr[Arn]
    var callerReactions: js.UndefOr[CallerReactions]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var commentId: js.UndefOr[CommentId]
    var content: js.UndefOr[Content]
    var creationDate: js.UndefOr[CreationDate]
    var deleted: js.UndefOr[IsCommentDeleted]
    var inReplyTo: js.UndefOr[CommentId]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
    var reactionCounts: js.UndefOr[ReactionCountsMap]
  }

  object Comment {
    @inline
    def apply(
        authorArn: js.UndefOr[Arn] = js.undefined,
        callerReactions: js.UndefOr[CallerReactions] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        commentId: js.UndefOr[CommentId] = js.undefined,
        content: js.UndefOr[Content] = js.undefined,
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        deleted: js.UndefOr[IsCommentDeleted] = js.undefined,
        inReplyTo: js.UndefOr[CommentId] = js.undefined,
        lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined,
        reactionCounts: js.UndefOr[ReactionCountsMap] = js.undefined
    ): Comment = {
      val __obj = js.Dynamic.literal()
      authorArn.foreach(__v => __obj.updateDynamic("authorArn")(__v.asInstanceOf[js.Any]))
      callerReactions.foreach(__v => __obj.updateDynamic("callerReactions")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      commentId.foreach(__v => __obj.updateDynamic("commentId")(__v.asInstanceOf[js.Any]))
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      deleted.foreach(__v => __obj.updateDynamic("deleted")(__v.asInstanceOf[js.Any]))
      inReplyTo.foreach(__v => __obj.updateDynamic("inReplyTo")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      reactionCounts.foreach(__v => __obj.updateDynamic("reactionCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Comment]
    }
  }

  /** Returns information about comments on the comparison between two commits.
    */
  @js.native
  trait CommentsForComparedCommit extends js.Object {
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var beforeCommitId: js.UndefOr[CommitId]
    var comments: js.UndefOr[Comments]
    var location: js.UndefOr[Location]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object CommentsForComparedCommit {
    @inline
    def apply(
        afterBlobId: js.UndefOr[ObjectId] = js.undefined,
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        comments: js.UndefOr[Comments] = js.undefined,
        location: js.UndefOr[Location] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): CommentsForComparedCommit = {
      val __obj = js.Dynamic.literal()
      afterBlobId.foreach(__v => __obj.updateDynamic("afterBlobId")(__v.asInstanceOf[js.Any]))
      afterCommitId.foreach(__v => __obj.updateDynamic("afterCommitId")(__v.asInstanceOf[js.Any]))
      beforeBlobId.foreach(__v => __obj.updateDynamic("beforeBlobId")(__v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.updateDynamic("beforeCommitId")(__v.asInstanceOf[js.Any]))
      comments.foreach(__v => __obj.updateDynamic("comments")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommentsForComparedCommit]
    }
  }

  /** Returns information about comments on a pull request.
    */
  @js.native
  trait CommentsForPullRequest extends js.Object {
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var beforeCommitId: js.UndefOr[CommitId]
    var comments: js.UndefOr[Comments]
    var location: js.UndefOr[Location]
    var pullRequestId: js.UndefOr[PullRequestId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object CommentsForPullRequest {
    @inline
    def apply(
        afterBlobId: js.UndefOr[ObjectId] = js.undefined,
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        comments: js.UndefOr[Comments] = js.undefined,
        location: js.UndefOr[Location] = js.undefined,
        pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): CommentsForPullRequest = {
      val __obj = js.Dynamic.literal()
      afterBlobId.foreach(__v => __obj.updateDynamic("afterBlobId")(__v.asInstanceOf[js.Any]))
      afterCommitId.foreach(__v => __obj.updateDynamic("afterCommitId")(__v.asInstanceOf[js.Any]))
      beforeBlobId.foreach(__v => __obj.updateDynamic("beforeBlobId")(__v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.updateDynamic("beforeCommitId")(__v.asInstanceOf[js.Any]))
      comments.foreach(__v => __obj.updateDynamic("comments")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      pullRequestId.foreach(__v => __obj.updateDynamic("pullRequestId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommentsForPullRequest]
    }
  }

  /** Returns information about a specific commit.
    */
  @js.native
  trait Commit extends js.Object {
    var additionalData: js.UndefOr[AdditionalData]
    var author: js.UndefOr[UserInfo]
    var commitId: js.UndefOr[ObjectId]
    var committer: js.UndefOr[UserInfo]
    var message: js.UndefOr[Message]
    var parents: js.UndefOr[ParentList]
    var treeId: js.UndefOr[ObjectId]
  }

  object Commit {
    @inline
    def apply(
        additionalData: js.UndefOr[AdditionalData] = js.undefined,
        author: js.UndefOr[UserInfo] = js.undefined,
        commitId: js.UndefOr[ObjectId] = js.undefined,
        committer: js.UndefOr[UserInfo] = js.undefined,
        message: js.UndefOr[Message] = js.undefined,
        parents: js.UndefOr[ParentList] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): Commit = {
      val __obj = js.Dynamic.literal()
      additionalData.foreach(__v => __obj.updateDynamic("additionalData")(__v.asInstanceOf[js.Any]))
      author.foreach(__v => __obj.updateDynamic("author")(__v.asInstanceOf[js.Any]))
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      committer.foreach(__v => __obj.updateDynamic("committer")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      parents.foreach(__v => __obj.updateDynamic("parents")(__v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.updateDynamic("treeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Commit]
    }
  }

  /** Information about conflicts in a merge operation.
    */
  @js.native
  trait Conflict extends js.Object {
    var conflictMetadata: js.UndefOr[ConflictMetadata]
    var mergeHunks: js.UndefOr[MergeHunks]
  }

  object Conflict {
    @inline
    def apply(
        conflictMetadata: js.UndefOr[ConflictMetadata] = js.undefined,
        mergeHunks: js.UndefOr[MergeHunks] = js.undefined
    ): Conflict = {
      val __obj = js.Dynamic.literal()
      conflictMetadata.foreach(__v => __obj.updateDynamic("conflictMetadata")(__v.asInstanceOf[js.Any]))
      mergeHunks.foreach(__v => __obj.updateDynamic("mergeHunks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Conflict]
    }
  }

  /** Information about the metadata for a conflict in a merge operation.
    */
  @js.native
  trait ConflictMetadata extends js.Object {
    var contentConflict: js.UndefOr[IsContentConflict]
    var fileModeConflict: js.UndefOr[IsFileModeConflict]
    var fileModes: js.UndefOr[FileModes]
    var filePath: js.UndefOr[Path]
    var fileSizes: js.UndefOr[FileSizes]
    var isBinaryFile: js.UndefOr[IsBinaryFile]
    var mergeOperations: js.UndefOr[MergeOperations]
    var numberOfConflicts: js.UndefOr[NumberOfConflicts]
    var objectTypeConflict: js.UndefOr[IsObjectTypeConflict]
    var objectTypes: js.UndefOr[ObjectTypes]
  }

  object ConflictMetadata {
    @inline
    def apply(
        contentConflict: js.UndefOr[IsContentConflict] = js.undefined,
        fileModeConflict: js.UndefOr[IsFileModeConflict] = js.undefined,
        fileModes: js.UndefOr[FileModes] = js.undefined,
        filePath: js.UndefOr[Path] = js.undefined,
        fileSizes: js.UndefOr[FileSizes] = js.undefined,
        isBinaryFile: js.UndefOr[IsBinaryFile] = js.undefined,
        mergeOperations: js.UndefOr[MergeOperations] = js.undefined,
        numberOfConflicts: js.UndefOr[NumberOfConflicts] = js.undefined,
        objectTypeConflict: js.UndefOr[IsObjectTypeConflict] = js.undefined,
        objectTypes: js.UndefOr[ObjectTypes] = js.undefined
    ): ConflictMetadata = {
      val __obj = js.Dynamic.literal()
      contentConflict.foreach(__v => __obj.updateDynamic("contentConflict")(__v.asInstanceOf[js.Any]))
      fileModeConflict.foreach(__v => __obj.updateDynamic("fileModeConflict")(__v.asInstanceOf[js.Any]))
      fileModes.foreach(__v => __obj.updateDynamic("fileModes")(__v.asInstanceOf[js.Any]))
      filePath.foreach(__v => __obj.updateDynamic("filePath")(__v.asInstanceOf[js.Any]))
      fileSizes.foreach(__v => __obj.updateDynamic("fileSizes")(__v.asInstanceOf[js.Any]))
      isBinaryFile.foreach(__v => __obj.updateDynamic("isBinaryFile")(__v.asInstanceOf[js.Any]))
      mergeOperations.foreach(__v => __obj.updateDynamic("mergeOperations")(__v.asInstanceOf[js.Any]))
      numberOfConflicts.foreach(__v => __obj.updateDynamic("numberOfConflicts")(__v.asInstanceOf[js.Any]))
      objectTypeConflict.foreach(__v => __obj.updateDynamic("objectTypeConflict")(__v.asInstanceOf[js.Any]))
      objectTypes.foreach(__v => __obj.updateDynamic("objectTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConflictMetadata]
    }
  }

  /** If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a merge.
    */
  @js.native
  trait ConflictResolution extends js.Object {
    var deleteFiles: js.UndefOr[DeleteFileEntries]
    var replaceContents: js.UndefOr[ReplaceContentEntries]
    var setFileModes: js.UndefOr[SetFileModeEntries]
  }

  object ConflictResolution {
    @inline
    def apply(
        deleteFiles: js.UndefOr[DeleteFileEntries] = js.undefined,
        replaceContents: js.UndefOr[ReplaceContentEntries] = js.undefined,
        setFileModes: js.UndefOr[SetFileModeEntries] = js.undefined
    ): ConflictResolution = {
      val __obj = js.Dynamic.literal()
      deleteFiles.foreach(__v => __obj.updateDynamic("deleteFiles")(__v.asInstanceOf[js.Any]))
      replaceContents.foreach(__v => __obj.updateDynamic("replaceContents")(__v.asInstanceOf[js.Any]))
      setFileModes.foreach(__v => __obj.updateDynamic("setFileModes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConflictResolution]
    }
  }

  @js.native
  trait CreateApprovalRuleTemplateInput extends js.Object {
    var approvalRuleTemplateContent: ApprovalRuleTemplateContent
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription]
  }

  object CreateApprovalRuleTemplateInput {
    @inline
    def apply(
        approvalRuleTemplateContent: ApprovalRuleTemplateContent,
        approvalRuleTemplateName: ApprovalRuleTemplateName,
        approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription] = js.undefined
    ): CreateApprovalRuleTemplateInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateContent" -> approvalRuleTemplateContent.asInstanceOf[js.Any],
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any]
      )

      approvalRuleTemplateDescription.foreach(__v => __obj.updateDynamic("approvalRuleTemplateDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApprovalRuleTemplateInput]
    }
  }

  @js.native
  trait CreateApprovalRuleTemplateOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  object CreateApprovalRuleTemplateOutput {
    @inline
    def apply(
        approvalRuleTemplate: ApprovalRuleTemplate
    ): CreateApprovalRuleTemplateOutput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplate" -> approvalRuleTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateApprovalRuleTemplateOutput]
    }
  }

  /** Represents the input of a create branch operation.
    */
  @js.native
  trait CreateBranchInput extends js.Object {
    var branchName: BranchName
    var commitId: CommitId
    var repositoryName: RepositoryName
  }

  object CreateBranchInput {
    @inline
    def apply(
        branchName: BranchName,
        commitId: CommitId,
        repositoryName: RepositoryName
    ): CreateBranchInput = {
      val __obj = js.Dynamic.literal(
        "branchName" -> branchName.asInstanceOf[js.Any],
        "commitId" -> commitId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateBranchInput]
    }
  }

  @js.native
  trait CreateCommitInput extends js.Object {
    var branchName: BranchName
    var repositoryName: RepositoryName
    var authorName: js.UndefOr[Name]
    var commitMessage: js.UndefOr[Message]
    var deleteFiles: js.UndefOr[DeleteFileEntries]
    var email: js.UndefOr[Email]
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders]
    var parentCommitId: js.UndefOr[CommitId]
    var putFiles: js.UndefOr[PutFileEntries]
    var setFileModes: js.UndefOr[SetFileModeEntries]
  }

  object CreateCommitInput {
    @inline
    def apply(
        branchName: BranchName,
        repositoryName: RepositoryName,
        authorName: js.UndefOr[Name] = js.undefined,
        commitMessage: js.UndefOr[Message] = js.undefined,
        deleteFiles: js.UndefOr[DeleteFileEntries] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined,
        parentCommitId: js.UndefOr[CommitId] = js.undefined,
        putFiles: js.UndefOr[PutFileEntries] = js.undefined,
        setFileModes: js.UndefOr[SetFileModeEntries] = js.undefined
    ): CreateCommitInput = {
      val __obj = js.Dynamic.literal(
        "branchName" -> branchName.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      authorName.foreach(__v => __obj.updateDynamic("authorName")(__v.asInstanceOf[js.Any]))
      commitMessage.foreach(__v => __obj.updateDynamic("commitMessage")(__v.asInstanceOf[js.Any]))
      deleteFiles.foreach(__v => __obj.updateDynamic("deleteFiles")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      keepEmptyFolders.foreach(__v => __obj.updateDynamic("keepEmptyFolders")(__v.asInstanceOf[js.Any]))
      parentCommitId.foreach(__v => __obj.updateDynamic("parentCommitId")(__v.asInstanceOf[js.Any]))
      putFiles.foreach(__v => __obj.updateDynamic("putFiles")(__v.asInstanceOf[js.Any]))
      setFileModes.foreach(__v => __obj.updateDynamic("setFileModes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCommitInput]
    }
  }

  @js.native
  trait CreateCommitOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var filesAdded: js.UndefOr[FilesMetadata]
    var filesDeleted: js.UndefOr[FilesMetadata]
    var filesUpdated: js.UndefOr[FilesMetadata]
    var treeId: js.UndefOr[ObjectId]
  }

  object CreateCommitOutput {
    @inline
    def apply(
        commitId: js.UndefOr[ObjectId] = js.undefined,
        filesAdded: js.UndefOr[FilesMetadata] = js.undefined,
        filesDeleted: js.UndefOr[FilesMetadata] = js.undefined,
        filesUpdated: js.UndefOr[FilesMetadata] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): CreateCommitOutput = {
      val __obj = js.Dynamic.literal()
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      filesAdded.foreach(__v => __obj.updateDynamic("filesAdded")(__v.asInstanceOf[js.Any]))
      filesDeleted.foreach(__v => __obj.updateDynamic("filesDeleted")(__v.asInstanceOf[js.Any]))
      filesUpdated.foreach(__v => __obj.updateDynamic("filesUpdated")(__v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.updateDynamic("treeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCommitOutput]
    }
  }

  @js.native
  trait CreatePullRequestApprovalRuleInput extends js.Object {
    var approvalRuleContent: ApprovalRuleContent
    var approvalRuleName: ApprovalRuleName
    var pullRequestId: PullRequestId
  }

  object CreatePullRequestApprovalRuleInput {
    @inline
    def apply(
        approvalRuleContent: ApprovalRuleContent,
        approvalRuleName: ApprovalRuleName,
        pullRequestId: PullRequestId
    ): CreatePullRequestApprovalRuleInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleContent" -> approvalRuleContent.asInstanceOf[js.Any],
        "approvalRuleName" -> approvalRuleName.asInstanceOf[js.Any],
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePullRequestApprovalRuleInput]
    }
  }

  @js.native
  trait CreatePullRequestApprovalRuleOutput extends js.Object {
    var approvalRule: ApprovalRule
  }

  object CreatePullRequestApprovalRuleOutput {
    @inline
    def apply(
        approvalRule: ApprovalRule
    ): CreatePullRequestApprovalRuleOutput = {
      val __obj = js.Dynamic.literal(
        "approvalRule" -> approvalRule.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePullRequestApprovalRuleOutput]
    }
  }

  @js.native
  trait CreatePullRequestInput extends js.Object {
    var targets: TargetList
    var title: Title
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var description: js.UndefOr[Description]
  }

  object CreatePullRequestInput {
    @inline
    def apply(
        targets: TargetList,
        title: Title,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): CreatePullRequestInput = {
      val __obj = js.Dynamic.literal(
        "targets" -> targets.asInstanceOf[js.Any],
        "title" -> title.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePullRequestInput]
    }
  }

  @js.native
  trait CreatePullRequestOutput extends js.Object {
    var pullRequest: PullRequest
  }

  object CreatePullRequestOutput {
    @inline
    def apply(
        pullRequest: PullRequest
    ): CreatePullRequestOutput = {
      val __obj = js.Dynamic.literal(
        "pullRequest" -> pullRequest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePullRequestOutput]
    }
  }

  /** Represents the input of a create repository operation.
    */
  @js.native
  trait CreateRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
    var repositoryDescription: js.UndefOr[RepositoryDescription]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateRepositoryInput {
    @inline
    def apply(
        repositoryName: RepositoryName,
        repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      repositoryDescription.foreach(__v => __obj.updateDynamic("repositoryDescription")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryInput]
    }
  }

  /** Represents the output of a create repository operation.
    */
  @js.native
  trait CreateRepositoryOutput extends js.Object {
    var repositoryMetadata: js.UndefOr[RepositoryMetadata]
  }

  object CreateRepositoryOutput {
    @inline
    def apply(
        repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
    ): CreateRepositoryOutput = {
      val __obj = js.Dynamic.literal()
      repositoryMetadata.foreach(__v => __obj.updateDynamic("repositoryMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryOutput]
    }
  }

  @js.native
  trait CreateUnreferencedMergeCommitInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var mergeOption: MergeOptionTypeEnum
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var authorName: js.UndefOr[Name]
    var commitMessage: js.UndefOr[Message]
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolution: js.UndefOr[ConflictResolution]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
    var email: js.UndefOr[Email]
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders]
  }

  object CreateUnreferencedMergeCommitInput {
    @inline
    def apply(
        destinationCommitSpecifier: CommitName,
        mergeOption: MergeOptionTypeEnum,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName,
        authorName: js.UndefOr[Name] = js.undefined,
        commitMessage: js.UndefOr[Message] = js.undefined,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolution: js.UndefOr[ConflictResolution] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
    ): CreateUnreferencedMergeCommitInput = {
      val __obj = js.Dynamic.literal(
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "mergeOption" -> mergeOption.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier" -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      authorName.foreach(__v => __obj.updateDynamic("authorName")(__v.asInstanceOf[js.Any]))
      commitMessage.foreach(__v => __obj.updateDynamic("commitMessage")(__v.asInstanceOf[js.Any]))
      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolution.foreach(__v => __obj.updateDynamic("conflictResolution")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      keepEmptyFolders.foreach(__v => __obj.updateDynamic("keepEmptyFolders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUnreferencedMergeCommitInput]
    }
  }

  @js.native
  trait CreateUnreferencedMergeCommitOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
  }

  object CreateUnreferencedMergeCommitOutput {
    @inline
    def apply(
        commitId: js.UndefOr[ObjectId] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): CreateUnreferencedMergeCommitOutput = {
      val __obj = js.Dynamic.literal()
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.updateDynamic("treeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUnreferencedMergeCommitOutput]
    }
  }

  @js.native
  trait DeleteApprovalRuleTemplateInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
  }

  object DeleteApprovalRuleTemplateInput {
    @inline
    def apply(
        approvalRuleTemplateName: ApprovalRuleTemplateName
    ): DeleteApprovalRuleTemplateInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApprovalRuleTemplateInput]
    }
  }

  @js.native
  trait DeleteApprovalRuleTemplateOutput extends js.Object {
    var approvalRuleTemplateId: ApprovalRuleTemplateId
  }

  object DeleteApprovalRuleTemplateOutput {
    @inline
    def apply(
        approvalRuleTemplateId: ApprovalRuleTemplateId
    ): DeleteApprovalRuleTemplateOutput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateId" -> approvalRuleTemplateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApprovalRuleTemplateOutput]
    }
  }

  /** Represents the input of a delete branch operation.
    */
  @js.native
  trait DeleteBranchInput extends js.Object {
    var branchName: BranchName
    var repositoryName: RepositoryName
  }

  object DeleteBranchInput {
    @inline
    def apply(
        branchName: BranchName,
        repositoryName: RepositoryName
    ): DeleteBranchInput = {
      val __obj = js.Dynamic.literal(
        "branchName" -> branchName.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBranchInput]
    }
  }

  /** Represents the output of a delete branch operation.
    */
  @js.native
  trait DeleteBranchOutput extends js.Object {
    var deletedBranch: js.UndefOr[BranchInfo]
  }

  object DeleteBranchOutput {
    @inline
    def apply(
        deletedBranch: js.UndefOr[BranchInfo] = js.undefined
    ): DeleteBranchOutput = {
      val __obj = js.Dynamic.literal()
      deletedBranch.foreach(__v => __obj.updateDynamic("deletedBranch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBranchOutput]
    }
  }

  @js.native
  trait DeleteCommentContentInput extends js.Object {
    var commentId: CommentId
  }

  object DeleteCommentContentInput {
    @inline
    def apply(
        commentId: CommentId
    ): DeleteCommentContentInput = {
      val __obj = js.Dynamic.literal(
        "commentId" -> commentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCommentContentInput]
    }
  }

  @js.native
  trait DeleteCommentContentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object DeleteCommentContentOutput {
    @inline
    def apply(
        comment: js.UndefOr[Comment] = js.undefined
    ): DeleteCommentContentOutput = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCommentContentOutput]
    }
  }

  /** A file that is deleted as part of a commit.
    */
  @js.native
  trait DeleteFileEntry extends js.Object {
    var filePath: Path
  }

  object DeleteFileEntry {
    @inline
    def apply(
        filePath: Path
    ): DeleteFileEntry = {
      val __obj = js.Dynamic.literal(
        "filePath" -> filePath.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFileEntry]
    }
  }

  @js.native
  trait DeleteFileInput extends js.Object {
    var branchName: BranchName
    var filePath: Path
    var parentCommitId: CommitId
    var repositoryName: RepositoryName
    var commitMessage: js.UndefOr[Message]
    var email: js.UndefOr[Email]
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders]
    var name: js.UndefOr[Name]
  }

  object DeleteFileInput {
    @inline
    def apply(
        branchName: BranchName,
        filePath: Path,
        parentCommitId: CommitId,
        repositoryName: RepositoryName,
        commitMessage: js.UndefOr[Message] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): DeleteFileInput = {
      val __obj = js.Dynamic.literal(
        "branchName" -> branchName.asInstanceOf[js.Any],
        "filePath" -> filePath.asInstanceOf[js.Any],
        "parentCommitId" -> parentCommitId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      commitMessage.foreach(__v => __obj.updateDynamic("commitMessage")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      keepEmptyFolders.foreach(__v => __obj.updateDynamic("keepEmptyFolders")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileInput]
    }
  }

  @js.native
  trait DeleteFileOutput extends js.Object {
    var blobId: ObjectId
    var commitId: ObjectId
    var filePath: Path
    var treeId: ObjectId
  }

  object DeleteFileOutput {
    @inline
    def apply(
        blobId: ObjectId,
        commitId: ObjectId,
        filePath: Path,
        treeId: ObjectId
    ): DeleteFileOutput = {
      val __obj = js.Dynamic.literal(
        "blobId" -> blobId.asInstanceOf[js.Any],
        "commitId" -> commitId.asInstanceOf[js.Any],
        "filePath" -> filePath.asInstanceOf[js.Any],
        "treeId" -> treeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFileOutput]
    }
  }

  @js.native
  trait DeletePullRequestApprovalRuleInput extends js.Object {
    var approvalRuleName: ApprovalRuleName
    var pullRequestId: PullRequestId
  }

  object DeletePullRequestApprovalRuleInput {
    @inline
    def apply(
        approvalRuleName: ApprovalRuleName,
        pullRequestId: PullRequestId
    ): DeletePullRequestApprovalRuleInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleName" -> approvalRuleName.asInstanceOf[js.Any],
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePullRequestApprovalRuleInput]
    }
  }

  @js.native
  trait DeletePullRequestApprovalRuleOutput extends js.Object {
    var approvalRuleId: ApprovalRuleId
  }

  object DeletePullRequestApprovalRuleOutput {
    @inline
    def apply(
        approvalRuleId: ApprovalRuleId
    ): DeletePullRequestApprovalRuleOutput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleId" -> approvalRuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePullRequestApprovalRuleOutput]
    }
  }

  /** Represents the input of a delete repository operation.
    */
  @js.native
  trait DeleteRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
  }

  object DeleteRepositoryInput {
    @inline
    def apply(
        repositoryName: RepositoryName
    ): DeleteRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRepositoryInput]
    }
  }

  /** Represents the output of a delete repository operation.
    */
  @js.native
  trait DeleteRepositoryOutput extends js.Object {
    var repositoryId: js.UndefOr[RepositoryId]
  }

  object DeleteRepositoryOutput {
    @inline
    def apply(
        repositoryId: js.UndefOr[RepositoryId] = js.undefined
    ): DeleteRepositoryOutput = {
      val __obj = js.Dynamic.literal()
      repositoryId.foreach(__v => __obj.updateDynamic("repositoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryOutput]
    }
  }

  @js.native
  trait DescribeMergeConflictsInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var filePath: Path
    var mergeOption: MergeOptionTypeEnum
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
    var maxMergeHunks: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeMergeConflictsInput {
    @inline
    def apply(
        destinationCommitSpecifier: CommitName,
        filePath: Path,
        mergeOption: MergeOptionTypeEnum,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined,
        maxMergeHunks: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMergeConflictsInput = {
      val __obj = js.Dynamic.literal(
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "filePath" -> filePath.asInstanceOf[js.Any],
        "mergeOption" -> mergeOption.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier" -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      maxMergeHunks.foreach(__v => __obj.updateDynamic("maxMergeHunks")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMergeConflictsInput]
    }
  }

  @js.native
  trait DescribeMergeConflictsOutput extends js.Object {
    var conflictMetadata: ConflictMetadata
    var destinationCommitId: ObjectId
    var mergeHunks: MergeHunks
    var sourceCommitId: ObjectId
    var baseCommitId: js.UndefOr[ObjectId]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeMergeConflictsOutput {
    @inline
    def apply(
        conflictMetadata: ConflictMetadata,
        destinationCommitId: ObjectId,
        mergeHunks: MergeHunks,
        sourceCommitId: ObjectId,
        baseCommitId: js.UndefOr[ObjectId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMergeConflictsOutput = {
      val __obj = js.Dynamic.literal(
        "conflictMetadata" -> conflictMetadata.asInstanceOf[js.Any],
        "destinationCommitId" -> destinationCommitId.asInstanceOf[js.Any],
        "mergeHunks" -> mergeHunks.asInstanceOf[js.Any],
        "sourceCommitId" -> sourceCommitId.asInstanceOf[js.Any]
      )

      baseCommitId.foreach(__v => __obj.updateDynamic("baseCommitId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMergeConflictsOutput]
    }
  }

  @js.native
  trait DescribePullRequestEventsInput extends js.Object {
    var pullRequestId: PullRequestId
    var actorArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var pullRequestEventType: js.UndefOr[PullRequestEventType]
  }

  object DescribePullRequestEventsInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        actorArn: js.UndefOr[Arn] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined
    ): DescribePullRequestEventsInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any]
      )

      actorArn.foreach(__v => __obj.updateDynamic("actorArn")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      pullRequestEventType.foreach(__v => __obj.updateDynamic("pullRequestEventType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePullRequestEventsInput]
    }
  }

  @js.native
  trait DescribePullRequestEventsOutput extends js.Object {
    var pullRequestEvents: PullRequestEventList
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribePullRequestEventsOutput {
    @inline
    def apply(
        pullRequestEvents: PullRequestEventList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePullRequestEventsOutput = {
      val __obj = js.Dynamic.literal(
        "pullRequestEvents" -> pullRequestEvents.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePullRequestEventsOutput]
    }
  }

  /** Returns information about a set of differences for a commit specifier.
    */
  @js.native
  trait Difference extends js.Object {
    var afterBlob: js.UndefOr[BlobMetadata]
    var beforeBlob: js.UndefOr[BlobMetadata]
    var changeType: js.UndefOr[ChangeTypeEnum]
  }

  object Difference {
    @inline
    def apply(
        afterBlob: js.UndefOr[BlobMetadata] = js.undefined,
        beforeBlob: js.UndefOr[BlobMetadata] = js.undefined,
        changeType: js.UndefOr[ChangeTypeEnum] = js.undefined
    ): Difference = {
      val __obj = js.Dynamic.literal()
      afterBlob.foreach(__v => __obj.updateDynamic("afterBlob")(__v.asInstanceOf[js.Any]))
      beforeBlob.foreach(__v => __obj.updateDynamic("beforeBlob")(__v.asInstanceOf[js.Any]))
      changeType.foreach(__v => __obj.updateDynamic("changeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Difference]
    }
  }

  @js.native
  trait DisassociateApprovalRuleTemplateFromRepositoryInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var repositoryName: RepositoryName
  }

  object DisassociateApprovalRuleTemplateFromRepositoryInput {
    @inline
    def apply(
        approvalRuleTemplateName: ApprovalRuleTemplateName,
        repositoryName: RepositoryName
    ): DisassociateApprovalRuleTemplateFromRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateApprovalRuleTemplateFromRepositoryInput]
    }
  }

  @js.native
  trait EvaluatePullRequestApprovalRulesInput extends js.Object {
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  object EvaluatePullRequestApprovalRulesInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        revisionId: RevisionId
    ): EvaluatePullRequestApprovalRulesInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EvaluatePullRequestApprovalRulesInput]
    }
  }

  @js.native
  trait EvaluatePullRequestApprovalRulesOutput extends js.Object {
    var evaluation: Evaluation
  }

  object EvaluatePullRequestApprovalRulesOutput {
    @inline
    def apply(
        evaluation: Evaluation
    ): EvaluatePullRequestApprovalRulesOutput = {
      val __obj = js.Dynamic.literal(
        "evaluation" -> evaluation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EvaluatePullRequestApprovalRulesOutput]
    }
  }

  /** Returns information about the approval rules applied to a pull request and whether conditions have been met.
    */
  @js.native
  trait Evaluation extends js.Object {
    var approvalRulesNotSatisfied: js.UndefOr[ApprovalRulesNotSatisfiedList]
    var approvalRulesSatisfied: js.UndefOr[ApprovalRulesSatisfiedList]
    var approved: js.UndefOr[Approved]
    var overridden: js.UndefOr[Overridden]
  }

  object Evaluation {
    @inline
    def apply(
        approvalRulesNotSatisfied: js.UndefOr[ApprovalRulesNotSatisfiedList] = js.undefined,
        approvalRulesSatisfied: js.UndefOr[ApprovalRulesSatisfiedList] = js.undefined,
        approved: js.UndefOr[Approved] = js.undefined,
        overridden: js.UndefOr[Overridden] = js.undefined
    ): Evaluation = {
      val __obj = js.Dynamic.literal()
      approvalRulesNotSatisfied.foreach(__v => __obj.updateDynamic("approvalRulesNotSatisfied")(__v.asInstanceOf[js.Any]))
      approvalRulesSatisfied.foreach(__v => __obj.updateDynamic("approvalRulesSatisfied")(__v.asInstanceOf[js.Any]))
      approved.foreach(__v => __obj.updateDynamic("approved")(__v.asInstanceOf[js.Any]))
      overridden.foreach(__v => __obj.updateDynamic("overridden")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Evaluation]
    }
  }

  /** Returns information about a file in a repository.
    */
  @js.native
  trait File extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var blobId: js.UndefOr[ObjectId]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var relativePath: js.UndefOr[Path]
  }

  object File {
    @inline
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        blobId: js.UndefOr[ObjectId] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined,
        relativePath: js.UndefOr[Path] = js.undefined
    ): File = {
      val __obj = js.Dynamic.literal()
      absolutePath.foreach(__v => __obj.updateDynamic("absolutePath")(__v.asInstanceOf[js.Any]))
      blobId.foreach(__v => __obj.updateDynamic("blobId")(__v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.updateDynamic("fileMode")(__v.asInstanceOf[js.Any]))
      relativePath.foreach(__v => __obj.updateDynamic("relativePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[File]
    }
  }

  /** A file to be added, updated, or deleted as part of a commit.
    */
  @js.native
  trait FileMetadata extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var blobId: js.UndefOr[ObjectId]
    var fileMode: js.UndefOr[FileModeTypeEnum]
  }

  object FileMetadata {
    @inline
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        blobId: js.UndefOr[ObjectId] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
    ): FileMetadata = {
      val __obj = js.Dynamic.literal()
      absolutePath.foreach(__v => __obj.updateDynamic("absolutePath")(__v.asInstanceOf[js.Any]))
      blobId.foreach(__v => __obj.updateDynamic("blobId")(__v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.updateDynamic("fileMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileMetadata]
    }
  }

  /** Information about file modes in a merge or pull request.
    */
  @js.native
  trait FileModes extends js.Object {
    var base: js.UndefOr[FileModeTypeEnum]
    var destination: js.UndefOr[FileModeTypeEnum]
    var source: js.UndefOr[FileModeTypeEnum]
  }

  object FileModes {
    @inline
    def apply(
        base: js.UndefOr[FileModeTypeEnum] = js.undefined,
        destination: js.UndefOr[FileModeTypeEnum] = js.undefined,
        source: js.UndefOr[FileModeTypeEnum] = js.undefined
    ): FileModes = {
      val __obj = js.Dynamic.literal()
      base.foreach(__v => __obj.updateDynamic("base")(__v.asInstanceOf[js.Any]))
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileModes]
    }
  }

  /** Information about the size of files in a merge or pull request.
    */
  @js.native
  trait FileSizes extends js.Object {
    var base: js.UndefOr[FileSize]
    var destination: js.UndefOr[FileSize]
    var source: js.UndefOr[FileSize]
  }

  object FileSizes {
    @inline
    def apply(
        base: js.UndefOr[FileSize] = js.undefined,
        destination: js.UndefOr[FileSize] = js.undefined,
        source: js.UndefOr[FileSize] = js.undefined
    ): FileSizes = {
      val __obj = js.Dynamic.literal()
      base.foreach(__v => __obj.updateDynamic("base")(__v.asInstanceOf[js.Any]))
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSizes]
    }
  }

  /** Returns information about a folder in a repository.
    */
  @js.native
  trait Folder extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var relativePath: js.UndefOr[Path]
    var treeId: js.UndefOr[ObjectId]
  }

  object Folder {
    @inline
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        relativePath: js.UndefOr[Path] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): Folder = {
      val __obj = js.Dynamic.literal()
      absolutePath.foreach(__v => __obj.updateDynamic("absolutePath")(__v.asInstanceOf[js.Any]))
      relativePath.foreach(__v => __obj.updateDynamic("relativePath")(__v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.updateDynamic("treeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Folder]
    }
  }

  @js.native
  trait GetApprovalRuleTemplateInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
  }

  object GetApprovalRuleTemplateInput {
    @inline
    def apply(
        approvalRuleTemplateName: ApprovalRuleTemplateName
    ): GetApprovalRuleTemplateInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApprovalRuleTemplateInput]
    }
  }

  @js.native
  trait GetApprovalRuleTemplateOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  object GetApprovalRuleTemplateOutput {
    @inline
    def apply(
        approvalRuleTemplate: ApprovalRuleTemplate
    ): GetApprovalRuleTemplateOutput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplate" -> approvalRuleTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApprovalRuleTemplateOutput]
    }
  }

  /** Represents the input of a get blob operation.
    */
  @js.native
  trait GetBlobInput extends js.Object {
    var blobId: ObjectId
    var repositoryName: RepositoryName
  }

  object GetBlobInput {
    @inline
    def apply(
        blobId: ObjectId,
        repositoryName: RepositoryName
    ): GetBlobInput = {
      val __obj = js.Dynamic.literal(
        "blobId" -> blobId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBlobInput]
    }
  }

  /** Represents the output of a get blob operation.
    */
  @js.native
  trait GetBlobOutput extends js.Object {
    var content: blob
  }

  object GetBlobOutput {
    @inline
    def apply(
        content: blob
    ): GetBlobOutput = {
      val __obj = js.Dynamic.literal(
        "content" -> content.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBlobOutput]
    }
  }

  /** Represents the input of a get branch operation.
    */
  @js.native
  trait GetBranchInput extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetBranchInput {
    @inline
    def apply(
        branchName: js.UndefOr[BranchName] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): GetBranchInput = {
      val __obj = js.Dynamic.literal()
      branchName.foreach(__v => __obj.updateDynamic("branchName")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBranchInput]
    }
  }

  /** Represents the output of a get branch operation.
    */
  @js.native
  trait GetBranchOutput extends js.Object {
    var branch: js.UndefOr[BranchInfo]
  }

  object GetBranchOutput {
    @inline
    def apply(
        branch: js.UndefOr[BranchInfo] = js.undefined
    ): GetBranchOutput = {
      val __obj = js.Dynamic.literal()
      branch.foreach(__v => __obj.updateDynamic("branch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBranchOutput]
    }
  }

  @js.native
  trait GetCommentInput extends js.Object {
    var commentId: CommentId
  }

  object GetCommentInput {
    @inline
    def apply(
        commentId: CommentId
    ): GetCommentInput = {
      val __obj = js.Dynamic.literal(
        "commentId" -> commentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCommentInput]
    }
  }

  @js.native
  trait GetCommentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object GetCommentOutput {
    @inline
    def apply(
        comment: js.UndefOr[Comment] = js.undefined
    ): GetCommentOutput = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentOutput]
    }
  }

  @js.native
  trait GetCommentReactionsInput extends js.Object {
    var commentId: CommentId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var reactionUserArn: js.UndefOr[Arn]
  }

  object GetCommentReactionsInput {
    @inline
    def apply(
        commentId: CommentId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        reactionUserArn: js.UndefOr[Arn] = js.undefined
    ): GetCommentReactionsInput = {
      val __obj = js.Dynamic.literal(
        "commentId" -> commentId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      reactionUserArn.foreach(__v => __obj.updateDynamic("reactionUserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentReactionsInput]
    }
  }

  @js.native
  trait GetCommentReactionsOutput extends js.Object {
    var reactionsForComment: ReactionsForCommentList
    var nextToken: js.UndefOr[NextToken]
  }

  object GetCommentReactionsOutput {
    @inline
    def apply(
        reactionsForComment: ReactionsForCommentList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCommentReactionsOutput = {
      val __obj = js.Dynamic.literal(
        "reactionsForComment" -> reactionsForComment.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentReactionsOutput]
    }
  }

  @js.native
  trait GetCommentsForComparedCommitInput extends js.Object {
    var afterCommitId: CommitId
    var repositoryName: RepositoryName
    var beforeCommitId: js.UndefOr[CommitId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetCommentsForComparedCommitInput {
    @inline
    def apply(
        afterCommitId: CommitId,
        repositoryName: RepositoryName,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCommentsForComparedCommitInput = {
      val __obj = js.Dynamic.literal(
        "afterCommitId" -> afterCommitId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      beforeCommitId.foreach(__v => __obj.updateDynamic("beforeCommitId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentsForComparedCommitInput]
    }
  }

  @js.native
  trait GetCommentsForComparedCommitOutput extends js.Object {
    var commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetCommentsForComparedCommitOutput {
    @inline
    def apply(
        commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCommentsForComparedCommitOutput = {
      val __obj = js.Dynamic.literal()
      commentsForComparedCommitData.foreach(__v => __obj.updateDynamic("commentsForComparedCommitData")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
    }
  }

  @js.native
  trait GetCommentsForPullRequestInput extends js.Object {
    var pullRequestId: PullRequestId
    var afterCommitId: js.UndefOr[CommitId]
    var beforeCommitId: js.UndefOr[CommitId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetCommentsForPullRequestInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): GetCommentsForPullRequestInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any]
      )

      afterCommitId.foreach(__v => __obj.updateDynamic("afterCommitId")(__v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.updateDynamic("beforeCommitId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentsForPullRequestInput]
    }
  }

  @js.native
  trait GetCommentsForPullRequestOutput extends js.Object {
    var commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetCommentsForPullRequestOutput {
    @inline
    def apply(
        commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCommentsForPullRequestOutput = {
      val __obj = js.Dynamic.literal()
      commentsForPullRequestData.foreach(__v => __obj.updateDynamic("commentsForPullRequestData")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentsForPullRequestOutput]
    }
  }

  /** Represents the input of a get commit operation.
    */
  @js.native
  trait GetCommitInput extends js.Object {
    var commitId: ObjectId
    var repositoryName: RepositoryName
  }

  object GetCommitInput {
    @inline
    def apply(
        commitId: ObjectId,
        repositoryName: RepositoryName
    ): GetCommitInput = {
      val __obj = js.Dynamic.literal(
        "commitId" -> commitId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCommitInput]
    }
  }

  /** Represents the output of a get commit operation.
    */
  @js.native
  trait GetCommitOutput extends js.Object {
    var commit: Commit
  }

  object GetCommitOutput {
    @inline
    def apply(
        commit: Commit
    ): GetCommitOutput = {
      val __obj = js.Dynamic.literal(
        "commit" -> commit.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCommitOutput]
    }
  }

  @js.native
  trait GetDifferencesInput extends js.Object {
    var afterCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var afterPath: js.UndefOr[Path]
    var beforeCommitSpecifier: js.UndefOr[CommitName]
    var beforePath: js.UndefOr[Path]
  }

  object GetDifferencesInput {
    @inline
    def apply(
        afterCommitSpecifier: CommitName,
        repositoryName: RepositoryName,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        afterPath: js.UndefOr[Path] = js.undefined,
        beforeCommitSpecifier: js.UndefOr[CommitName] = js.undefined,
        beforePath: js.UndefOr[Path] = js.undefined
    ): GetDifferencesInput = {
      val __obj = js.Dynamic.literal(
        "afterCommitSpecifier" -> afterCommitSpecifier.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      afterPath.foreach(__v => __obj.updateDynamic("afterPath")(__v.asInstanceOf[js.Any]))
      beforeCommitSpecifier.foreach(__v => __obj.updateDynamic("beforeCommitSpecifier")(__v.asInstanceOf[js.Any]))
      beforePath.foreach(__v => __obj.updateDynamic("beforePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDifferencesInput]
    }
  }

  @js.native
  trait GetDifferencesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var differences: js.UndefOr[DifferenceList]
  }

  object GetDifferencesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        differences: js.UndefOr[DifferenceList] = js.undefined
    ): GetDifferencesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      differences.foreach(__v => __obj.updateDynamic("differences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDifferencesOutput]
    }
  }

  @js.native
  trait GetFileInput extends js.Object {
    var filePath: Path
    var repositoryName: RepositoryName
    var commitSpecifier: js.UndefOr[CommitName]
  }

  object GetFileInput {
    @inline
    def apply(
        filePath: Path,
        repositoryName: RepositoryName,
        commitSpecifier: js.UndefOr[CommitName] = js.undefined
    ): GetFileInput = {
      val __obj = js.Dynamic.literal(
        "filePath" -> filePath.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      commitSpecifier.foreach(__v => __obj.updateDynamic("commitSpecifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFileInput]
    }
  }

  @js.native
  trait GetFileOutput extends js.Object {
    var blobId: ObjectId
    var commitId: ObjectId
    var fileContent: FileContent
    var fileMode: FileModeTypeEnum
    var filePath: Path
    var fileSize: ObjectSize
  }

  object GetFileOutput {
    @inline
    def apply(
        blobId: ObjectId,
        commitId: ObjectId,
        fileContent: FileContent,
        fileMode: FileModeTypeEnum,
        filePath: Path,
        fileSize: ObjectSize
    ): GetFileOutput = {
      val __obj = js.Dynamic.literal(
        "blobId" -> blobId.asInstanceOf[js.Any],
        "commitId" -> commitId.asInstanceOf[js.Any],
        "fileContent" -> fileContent.asInstanceOf[js.Any],
        "fileMode" -> fileMode.asInstanceOf[js.Any],
        "filePath" -> filePath.asInstanceOf[js.Any],
        "fileSize" -> fileSize.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFileOutput]
    }
  }

  @js.native
  trait GetFolderInput extends js.Object {
    var folderPath: Path
    var repositoryName: RepositoryName
    var commitSpecifier: js.UndefOr[CommitName]
  }

  object GetFolderInput {
    @inline
    def apply(
        folderPath: Path,
        repositoryName: RepositoryName,
        commitSpecifier: js.UndefOr[CommitName] = js.undefined
    ): GetFolderInput = {
      val __obj = js.Dynamic.literal(
        "folderPath" -> folderPath.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      commitSpecifier.foreach(__v => __obj.updateDynamic("commitSpecifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFolderInput]
    }
  }

  @js.native
  trait GetFolderOutput extends js.Object {
    var commitId: ObjectId
    var folderPath: Path
    var files: js.UndefOr[FileList]
    var subFolders: js.UndefOr[FolderList]
    var subModules: js.UndefOr[SubModuleList]
    var symbolicLinks: js.UndefOr[SymbolicLinkList]
    var treeId: js.UndefOr[ObjectId]
  }

  object GetFolderOutput {
    @inline
    def apply(
        commitId: ObjectId,
        folderPath: Path,
        files: js.UndefOr[FileList] = js.undefined,
        subFolders: js.UndefOr[FolderList] = js.undefined,
        subModules: js.UndefOr[SubModuleList] = js.undefined,
        symbolicLinks: js.UndefOr[SymbolicLinkList] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): GetFolderOutput = {
      val __obj = js.Dynamic.literal(
        "commitId" -> commitId.asInstanceOf[js.Any],
        "folderPath" -> folderPath.asInstanceOf[js.Any]
      )

      files.foreach(__v => __obj.updateDynamic("files")(__v.asInstanceOf[js.Any]))
      subFolders.foreach(__v => __obj.updateDynamic("subFolders")(__v.asInstanceOf[js.Any]))
      subModules.foreach(__v => __obj.updateDynamic("subModules")(__v.asInstanceOf[js.Any]))
      symbolicLinks.foreach(__v => __obj.updateDynamic("symbolicLinks")(__v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.updateDynamic("treeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFolderOutput]
    }
  }

  @js.native
  trait GetMergeCommitInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
  }

  object GetMergeCommitInput {
    @inline
    def apply(
        destinationCommitSpecifier: CommitName,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined
    ): GetMergeCommitInput = {
      val __obj = js.Dynamic.literal(
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier" -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMergeCommitInput]
    }
  }

  @js.native
  trait GetMergeCommitOutput extends js.Object {
    var baseCommitId: js.UndefOr[ObjectId]
    var destinationCommitId: js.UndefOr[ObjectId]
    var mergedCommitId: js.UndefOr[ObjectId]
    var sourceCommitId: js.UndefOr[ObjectId]
  }

  object GetMergeCommitOutput {
    @inline
    def apply(
        baseCommitId: js.UndefOr[ObjectId] = js.undefined,
        destinationCommitId: js.UndefOr[ObjectId] = js.undefined,
        mergedCommitId: js.UndefOr[ObjectId] = js.undefined,
        sourceCommitId: js.UndefOr[ObjectId] = js.undefined
    ): GetMergeCommitOutput = {
      val __obj = js.Dynamic.literal()
      baseCommitId.foreach(__v => __obj.updateDynamic("baseCommitId")(__v.asInstanceOf[js.Any]))
      destinationCommitId.foreach(__v => __obj.updateDynamic("destinationCommitId")(__v.asInstanceOf[js.Any]))
      mergedCommitId.foreach(__v => __obj.updateDynamic("mergedCommitId")(__v.asInstanceOf[js.Any]))
      sourceCommitId.foreach(__v => __obj.updateDynamic("sourceCommitId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMergeCommitOutput]
    }
  }

  @js.native
  trait GetMergeConflictsInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var mergeOption: MergeOptionTypeEnum
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
    var maxConflictFiles: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetMergeConflictsInput {
    @inline
    def apply(
        destinationCommitSpecifier: CommitName,
        mergeOption: MergeOptionTypeEnum,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined,
        maxConflictFiles: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetMergeConflictsInput = {
      val __obj = js.Dynamic.literal(
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "mergeOption" -> mergeOption.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier" -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      maxConflictFiles.foreach(__v => __obj.updateDynamic("maxConflictFiles")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMergeConflictsInput]
    }
  }

  @js.native
  trait GetMergeConflictsOutput extends js.Object {
    var conflictMetadataList: ConflictMetadataList
    var destinationCommitId: ObjectId
    var mergeable: IsMergeable
    var sourceCommitId: ObjectId
    var baseCommitId: js.UndefOr[ObjectId]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetMergeConflictsOutput {
    @inline
    def apply(
        conflictMetadataList: ConflictMetadataList,
        destinationCommitId: ObjectId,
        mergeable: IsMergeable,
        sourceCommitId: ObjectId,
        baseCommitId: js.UndefOr[ObjectId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetMergeConflictsOutput = {
      val __obj = js.Dynamic.literal(
        "conflictMetadataList" -> conflictMetadataList.asInstanceOf[js.Any],
        "destinationCommitId" -> destinationCommitId.asInstanceOf[js.Any],
        "mergeable" -> mergeable.asInstanceOf[js.Any],
        "sourceCommitId" -> sourceCommitId.asInstanceOf[js.Any]
      )

      baseCommitId.foreach(__v => __obj.updateDynamic("baseCommitId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMergeConflictsOutput]
    }
  }

  @js.native
  trait GetMergeOptionsInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
  }

  object GetMergeOptionsInput {
    @inline
    def apply(
        destinationCommitSpecifier: CommitName,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined
    ): GetMergeOptionsInput = {
      val __obj = js.Dynamic.literal(
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier" -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMergeOptionsInput]
    }
  }

  @js.native
  trait GetMergeOptionsOutput extends js.Object {
    var baseCommitId: ObjectId
    var destinationCommitId: ObjectId
    var mergeOptions: MergeOptions
    var sourceCommitId: ObjectId
  }

  object GetMergeOptionsOutput {
    @inline
    def apply(
        baseCommitId: ObjectId,
        destinationCommitId: ObjectId,
        mergeOptions: MergeOptions,
        sourceCommitId: ObjectId
    ): GetMergeOptionsOutput = {
      val __obj = js.Dynamic.literal(
        "baseCommitId" -> baseCommitId.asInstanceOf[js.Any],
        "destinationCommitId" -> destinationCommitId.asInstanceOf[js.Any],
        "mergeOptions" -> mergeOptions.asInstanceOf[js.Any],
        "sourceCommitId" -> sourceCommitId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMergeOptionsOutput]
    }
  }

  @js.native
  trait GetPullRequestApprovalStatesInput extends js.Object {
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  object GetPullRequestApprovalStatesInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        revisionId: RevisionId
    ): GetPullRequestApprovalStatesInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPullRequestApprovalStatesInput]
    }
  }

  @js.native
  trait GetPullRequestApprovalStatesOutput extends js.Object {
    var approvals: js.UndefOr[ApprovalList]
  }

  object GetPullRequestApprovalStatesOutput {
    @inline
    def apply(
        approvals: js.UndefOr[ApprovalList] = js.undefined
    ): GetPullRequestApprovalStatesOutput = {
      val __obj = js.Dynamic.literal()
      approvals.foreach(__v => __obj.updateDynamic("approvals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPullRequestApprovalStatesOutput]
    }
  }

  @js.native
  trait GetPullRequestInput extends js.Object {
    var pullRequestId: PullRequestId
  }

  object GetPullRequestInput {
    @inline
    def apply(
        pullRequestId: PullRequestId
    ): GetPullRequestInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPullRequestInput]
    }
  }

  @js.native
  trait GetPullRequestOutput extends js.Object {
    var pullRequest: PullRequest
  }

  object GetPullRequestOutput {
    @inline
    def apply(
        pullRequest: PullRequest
    ): GetPullRequestOutput = {
      val __obj = js.Dynamic.literal(
        "pullRequest" -> pullRequest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPullRequestOutput]
    }
  }

  @js.native
  trait GetPullRequestOverrideStateInput extends js.Object {
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  object GetPullRequestOverrideStateInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        revisionId: RevisionId
    ): GetPullRequestOverrideStateInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPullRequestOverrideStateInput]
    }
  }

  @js.native
  trait GetPullRequestOverrideStateOutput extends js.Object {
    var overridden: js.UndefOr[Overridden]
    var overrider: js.UndefOr[Arn]
  }

  object GetPullRequestOverrideStateOutput {
    @inline
    def apply(
        overridden: js.UndefOr[Overridden] = js.undefined,
        overrider: js.UndefOr[Arn] = js.undefined
    ): GetPullRequestOverrideStateOutput = {
      val __obj = js.Dynamic.literal()
      overridden.foreach(__v => __obj.updateDynamic("overridden")(__v.asInstanceOf[js.Any]))
      overrider.foreach(__v => __obj.updateDynamic("overrider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPullRequestOverrideStateOutput]
    }
  }

  /** Represents the input of a get repository operation.
    */
  @js.native
  trait GetRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
  }

  object GetRepositoryInput {
    @inline
    def apply(
        repositoryName: RepositoryName
    ): GetRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRepositoryInput]
    }
  }

  /** Represents the output of a get repository operation.
    */
  @js.native
  trait GetRepositoryOutput extends js.Object {
    var repositoryMetadata: js.UndefOr[RepositoryMetadata]
  }

  object GetRepositoryOutput {
    @inline
    def apply(
        repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
    ): GetRepositoryOutput = {
      val __obj = js.Dynamic.literal()
      repositoryMetadata.foreach(__v => __obj.updateDynamic("repositoryMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryOutput]
    }
  }

  /** Represents the input of a get repository triggers operation.
    */
  @js.native
  trait GetRepositoryTriggersInput extends js.Object {
    var repositoryName: RepositoryName
  }

  object GetRepositoryTriggersInput {
    @inline
    def apply(
        repositoryName: RepositoryName
    ): GetRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRepositoryTriggersInput]
    }
  }

  /** Represents the output of a get repository triggers operation.
    */
  @js.native
  trait GetRepositoryTriggersOutput extends js.Object {
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId]
    var triggers: js.UndefOr[RepositoryTriggersList]
  }

  object GetRepositoryTriggersOutput {
    @inline
    def apply(
        configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined,
        triggers: js.UndefOr[RepositoryTriggersList] = js.undefined
    ): GetRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal()
      configurationId.foreach(__v => __obj.updateDynamic("configurationId")(__v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.updateDynamic("triggers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryTriggersOutput]
    }
  }

  /** Information about whether a file is binary or textual in a merge or pull request operation.
    */
  @js.native
  trait IsBinaryFile extends js.Object {
    var base: js.UndefOr[CapitalBoolean]
    var destination: js.UndefOr[CapitalBoolean]
    var source: js.UndefOr[CapitalBoolean]
  }

  object IsBinaryFile {
    @inline
    def apply(
        base: js.UndefOr[CapitalBoolean] = js.undefined,
        destination: js.UndefOr[CapitalBoolean] = js.undefined,
        source: js.UndefOr[CapitalBoolean] = js.undefined
    ): IsBinaryFile = {
      val __obj = js.Dynamic.literal()
      base.foreach(__v => __obj.updateDynamic("base")(__v.asInstanceOf[js.Any]))
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IsBinaryFile]
    }
  }

  @js.native
  trait ListApprovalRuleTemplatesInput extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApprovalRuleTemplatesInput {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApprovalRuleTemplatesInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApprovalRuleTemplatesInput]
    }
  }

  @js.native
  trait ListApprovalRuleTemplatesOutput extends js.Object {
    var approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApprovalRuleTemplatesOutput {
    @inline
    def apply(
        approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApprovalRuleTemplatesOutput = {
      val __obj = js.Dynamic.literal()
      approvalRuleTemplateNames.foreach(__v => __obj.updateDynamic("approvalRuleTemplateNames")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApprovalRuleTemplatesOutput]
    }
  }

  @js.native
  trait ListAssociatedApprovalRuleTemplatesForRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssociatedApprovalRuleTemplatesForRepositoryInput {
    @inline
    def apply(
        repositoryName: RepositoryName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociatedApprovalRuleTemplatesForRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedApprovalRuleTemplatesForRepositoryInput]
    }
  }

  @js.native
  trait ListAssociatedApprovalRuleTemplatesForRepositoryOutput extends js.Object {
    var approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssociatedApprovalRuleTemplatesForRepositoryOutput {
    @inline
    def apply(
        approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociatedApprovalRuleTemplatesForRepositoryOutput = {
      val __obj = js.Dynamic.literal()
      approvalRuleTemplateNames.foreach(__v => __obj.updateDynamic("approvalRuleTemplateNames")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedApprovalRuleTemplatesForRepositoryOutput]
    }
  }

  /** Represents the input of a list branches operation.
    */
  @js.native
  trait ListBranchesInput extends js.Object {
    var repositoryName: RepositoryName
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesInput {
    @inline
    def apply(
        repositoryName: RepositoryName,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBranchesInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBranchesInput]
    }
  }

  /** Represents the output of a list branches operation.
    */
  @js.native
  trait ListBranchesOutput extends js.Object {
    var branches: js.UndefOr[BranchNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesOutput {
    @inline
    def apply(
        branches: js.UndefOr[BranchNameList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBranchesOutput = {
      val __obj = js.Dynamic.literal()
      branches.foreach(__v => __obj.updateDynamic("branches")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBranchesOutput]
    }
  }

  @js.native
  trait ListPullRequestsInput extends js.Object {
    var repositoryName: RepositoryName
    var authorArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
  }

  object ListPullRequestsInput {
    @inline
    def apply(
        repositoryName: RepositoryName,
        authorArn: js.UndefOr[Arn] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
    ): ListPullRequestsInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      authorArn.foreach(__v => __obj.updateDynamic("authorArn")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      pullRequestStatus.foreach(__v => __obj.updateDynamic("pullRequestStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPullRequestsInput]
    }
  }

  @js.native
  trait ListPullRequestsOutput extends js.Object {
    var pullRequestIds: PullRequestIdList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPullRequestsOutput {
    @inline
    def apply(
        pullRequestIds: PullRequestIdList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPullRequestsOutput = {
      val __obj = js.Dynamic.literal(
        "pullRequestIds" -> pullRequestIds.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPullRequestsOutput]
    }
  }

  @js.native
  trait ListRepositoriesForApprovalRuleTemplateInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListRepositoriesForApprovalRuleTemplateInput {
    @inline
    def apply(
        approvalRuleTemplateName: ApprovalRuleTemplateName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRepositoriesForApprovalRuleTemplateInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesForApprovalRuleTemplateInput]
    }
  }

  @js.native
  trait ListRepositoriesForApprovalRuleTemplateOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var repositoryNames: js.UndefOr[RepositoryNameList]
  }

  object ListRepositoriesForApprovalRuleTemplateOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        repositoryNames: js.UndefOr[RepositoryNameList] = js.undefined
    ): ListRepositoriesForApprovalRuleTemplateOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      repositoryNames.foreach(__v => __obj.updateDynamic("repositoryNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesForApprovalRuleTemplateOutput]
    }
  }

  /** Represents the input of a list repositories operation.
    */
  @js.native
  trait ListRepositoriesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var order: js.UndefOr[OrderEnum]
    var sortBy: js.UndefOr[SortByEnum]
  }

  object ListRepositoriesInput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        order: js.UndefOr[OrderEnum] = js.undefined,
        sortBy: js.UndefOr[SortByEnum] = js.undefined
    ): ListRepositoriesInput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      order.foreach(__v => __obj.updateDynamic("order")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesInput]
    }
  }

  /** Represents the output of a list repositories operation.
    */
  @js.native
  trait ListRepositoriesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var repositories: js.UndefOr[RepositoryNameIdPairList]
  }

  object ListRepositoriesOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        repositories: js.UndefOr[RepositoryNameIdPairList] = js.undefined
    ): ListRepositoriesOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      repositories.foreach(__v => __obj.updateDynamic("repositories")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        resourceArn: ResourceArn,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagsMap]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /** Returns information about the location of a change or comment in the comparison between two commits or a pull request.
    */
  @js.native
  trait Location extends js.Object {
    var filePath: js.UndefOr[Path]
    var filePosition: js.UndefOr[Position]
    var relativeFileVersion: js.UndefOr[RelativeFileVersionEnum]
  }

  object Location {
    @inline
    def apply(
        filePath: js.UndefOr[Path] = js.undefined,
        filePosition: js.UndefOr[Position] = js.undefined,
        relativeFileVersion: js.UndefOr[RelativeFileVersionEnum] = js.undefined
    ): Location = {
      val __obj = js.Dynamic.literal()
      filePath.foreach(__v => __obj.updateDynamic("filePath")(__v.asInstanceOf[js.Any]))
      filePosition.foreach(__v => __obj.updateDynamic("filePosition")(__v.asInstanceOf[js.Any]))
      relativeFileVersion.foreach(__v => __obj.updateDynamic("relativeFileVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Location]
    }
  }

  @js.native
  trait MergeBranchesByFastForwardInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var targetBranch: js.UndefOr[BranchName]
  }

  object MergeBranchesByFastForwardInput {
    @inline
    def apply(
        destinationCommitSpecifier: CommitName,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName,
        targetBranch: js.UndefOr[BranchName] = js.undefined
    ): MergeBranchesByFastForwardInput = {
      val __obj = js.Dynamic.literal(
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier" -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      targetBranch.foreach(__v => __obj.updateDynamic("targetBranch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeBranchesByFastForwardInput]
    }
  }

  @js.native
  trait MergeBranchesByFastForwardOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
  }

  object MergeBranchesByFastForwardOutput {
    @inline
    def apply(
        commitId: js.UndefOr[ObjectId] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): MergeBranchesByFastForwardOutput = {
      val __obj = js.Dynamic.literal()
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.updateDynamic("treeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeBranchesByFastForwardOutput]
    }
  }

  @js.native
  trait MergeBranchesBySquashInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var authorName: js.UndefOr[Name]
    var commitMessage: js.UndefOr[Message]
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolution: js.UndefOr[ConflictResolution]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
    var email: js.UndefOr[Email]
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders]
    var targetBranch: js.UndefOr[BranchName]
  }

  object MergeBranchesBySquashInput {
    @inline
    def apply(
        destinationCommitSpecifier: CommitName,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName,
        authorName: js.UndefOr[Name] = js.undefined,
        commitMessage: js.UndefOr[Message] = js.undefined,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolution: js.UndefOr[ConflictResolution] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined,
        targetBranch: js.UndefOr[BranchName] = js.undefined
    ): MergeBranchesBySquashInput = {
      val __obj = js.Dynamic.literal(
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier" -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      authorName.foreach(__v => __obj.updateDynamic("authorName")(__v.asInstanceOf[js.Any]))
      commitMessage.foreach(__v => __obj.updateDynamic("commitMessage")(__v.asInstanceOf[js.Any]))
      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolution.foreach(__v => __obj.updateDynamic("conflictResolution")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      keepEmptyFolders.foreach(__v => __obj.updateDynamic("keepEmptyFolders")(__v.asInstanceOf[js.Any]))
      targetBranch.foreach(__v => __obj.updateDynamic("targetBranch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeBranchesBySquashInput]
    }
  }

  @js.native
  trait MergeBranchesBySquashOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
  }

  object MergeBranchesBySquashOutput {
    @inline
    def apply(
        commitId: js.UndefOr[ObjectId] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): MergeBranchesBySquashOutput = {
      val __obj = js.Dynamic.literal()
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.updateDynamic("treeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeBranchesBySquashOutput]
    }
  }

  @js.native
  trait MergeBranchesByThreeWayInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var authorName: js.UndefOr[Name]
    var commitMessage: js.UndefOr[Message]
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolution: js.UndefOr[ConflictResolution]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
    var email: js.UndefOr[Email]
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders]
    var targetBranch: js.UndefOr[BranchName]
  }

  object MergeBranchesByThreeWayInput {
    @inline
    def apply(
        destinationCommitSpecifier: CommitName,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName,
        authorName: js.UndefOr[Name] = js.undefined,
        commitMessage: js.UndefOr[Message] = js.undefined,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolution: js.UndefOr[ConflictResolution] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined,
        targetBranch: js.UndefOr[BranchName] = js.undefined
    ): MergeBranchesByThreeWayInput = {
      val __obj = js.Dynamic.literal(
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier" -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      authorName.foreach(__v => __obj.updateDynamic("authorName")(__v.asInstanceOf[js.Any]))
      commitMessage.foreach(__v => __obj.updateDynamic("commitMessage")(__v.asInstanceOf[js.Any]))
      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolution.foreach(__v => __obj.updateDynamic("conflictResolution")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      keepEmptyFolders.foreach(__v => __obj.updateDynamic("keepEmptyFolders")(__v.asInstanceOf[js.Any]))
      targetBranch.foreach(__v => __obj.updateDynamic("targetBranch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeBranchesByThreeWayInput]
    }
  }

  @js.native
  trait MergeBranchesByThreeWayOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
  }

  object MergeBranchesByThreeWayOutput {
    @inline
    def apply(
        commitId: js.UndefOr[ObjectId] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): MergeBranchesByThreeWayOutput = {
      val __obj = js.Dynamic.literal()
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.updateDynamic("treeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeBranchesByThreeWayOutput]
    }
  }

  /** Information about merge hunks in a merge or pull request operation.
    */
  @js.native
  trait MergeHunk extends js.Object {
    var base: js.UndefOr[MergeHunkDetail]
    var destination: js.UndefOr[MergeHunkDetail]
    var isConflict: js.UndefOr[IsHunkConflict]
    var source: js.UndefOr[MergeHunkDetail]
  }

  object MergeHunk {
    @inline
    def apply(
        base: js.UndefOr[MergeHunkDetail] = js.undefined,
        destination: js.UndefOr[MergeHunkDetail] = js.undefined,
        isConflict: js.UndefOr[IsHunkConflict] = js.undefined,
        source: js.UndefOr[MergeHunkDetail] = js.undefined
    ): MergeHunk = {
      val __obj = js.Dynamic.literal()
      base.foreach(__v => __obj.updateDynamic("base")(__v.asInstanceOf[js.Any]))
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      isConflict.foreach(__v => __obj.updateDynamic("isConflict")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeHunk]
    }
  }

  /** Information about the details of a merge hunk that contains a conflict in a merge or pull request operation.
    */
  @js.native
  trait MergeHunkDetail extends js.Object {
    var endLine: js.UndefOr[LineNumber]
    var hunkContent: js.UndefOr[HunkContent]
    var startLine: js.UndefOr[LineNumber]
  }

  object MergeHunkDetail {
    @inline
    def apply(
        endLine: js.UndefOr[LineNumber] = js.undefined,
        hunkContent: js.UndefOr[HunkContent] = js.undefined,
        startLine: js.UndefOr[LineNumber] = js.undefined
    ): MergeHunkDetail = {
      val __obj = js.Dynamic.literal()
      endLine.foreach(__v => __obj.updateDynamic("endLine")(__v.asInstanceOf[js.Any]))
      hunkContent.foreach(__v => __obj.updateDynamic("hunkContent")(__v.asInstanceOf[js.Any]))
      startLine.foreach(__v => __obj.updateDynamic("startLine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeHunkDetail]
    }
  }

  /** Returns information about a merge or potential merge between a source reference and a destination reference in a pull request.
    */
  @js.native
  trait MergeMetadata extends js.Object {
    var isMerged: js.UndefOr[IsMerged]
    var mergeCommitId: js.UndefOr[CommitId]
    var mergeOption: js.UndefOr[MergeOptionTypeEnum]
    var mergedBy: js.UndefOr[Arn]
  }

  object MergeMetadata {
    @inline
    def apply(
        isMerged: js.UndefOr[IsMerged] = js.undefined,
        mergeCommitId: js.UndefOr[CommitId] = js.undefined,
        mergeOption: js.UndefOr[MergeOptionTypeEnum] = js.undefined,
        mergedBy: js.UndefOr[Arn] = js.undefined
    ): MergeMetadata = {
      val __obj = js.Dynamic.literal()
      isMerged.foreach(__v => __obj.updateDynamic("isMerged")(__v.asInstanceOf[js.Any]))
      mergeCommitId.foreach(__v => __obj.updateDynamic("mergeCommitId")(__v.asInstanceOf[js.Any]))
      mergeOption.foreach(__v => __obj.updateDynamic("mergeOption")(__v.asInstanceOf[js.Any]))
      mergedBy.foreach(__v => __obj.updateDynamic("mergedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeMetadata]
    }
  }

  /** Information about the file operation conflicts in a merge operation.
    */
  @js.native
  trait MergeOperations extends js.Object {
    var destination: js.UndefOr[ChangeTypeEnum]
    var source: js.UndefOr[ChangeTypeEnum]
  }

  object MergeOperations {
    @inline
    def apply(
        destination: js.UndefOr[ChangeTypeEnum] = js.undefined,
        source: js.UndefOr[ChangeTypeEnum] = js.undefined
    ): MergeOperations = {
      val __obj = js.Dynamic.literal()
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeOperations]
    }
  }

  @js.native
  trait MergePullRequestByFastForwardInput extends js.Object {
    var pullRequestId: PullRequestId
    var repositoryName: RepositoryName
    var sourceCommitId: js.UndefOr[ObjectId]
  }

  object MergePullRequestByFastForwardInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        repositoryName: RepositoryName,
        sourceCommitId: js.UndefOr[ObjectId] = js.undefined
    ): MergePullRequestByFastForwardInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      sourceCommitId.foreach(__v => __obj.updateDynamic("sourceCommitId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergePullRequestByFastForwardInput]
    }
  }

  @js.native
  trait MergePullRequestByFastForwardOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object MergePullRequestByFastForwardOutput {
    @inline
    def apply(
        pullRequest: js.UndefOr[PullRequest] = js.undefined
    ): MergePullRequestByFastForwardOutput = {
      val __obj = js.Dynamic.literal()
      pullRequest.foreach(__v => __obj.updateDynamic("pullRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergePullRequestByFastForwardOutput]
    }
  }

  @js.native
  trait MergePullRequestBySquashInput extends js.Object {
    var pullRequestId: PullRequestId
    var repositoryName: RepositoryName
    var authorName: js.UndefOr[Name]
    var commitMessage: js.UndefOr[Message]
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolution: js.UndefOr[ConflictResolution]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
    var email: js.UndefOr[Email]
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders]
    var sourceCommitId: js.UndefOr[ObjectId]
  }

  object MergePullRequestBySquashInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        repositoryName: RepositoryName,
        authorName: js.UndefOr[Name] = js.undefined,
        commitMessage: js.UndefOr[Message] = js.undefined,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolution: js.UndefOr[ConflictResolution] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined,
        sourceCommitId: js.UndefOr[ObjectId] = js.undefined
    ): MergePullRequestBySquashInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      authorName.foreach(__v => __obj.updateDynamic("authorName")(__v.asInstanceOf[js.Any]))
      commitMessage.foreach(__v => __obj.updateDynamic("commitMessage")(__v.asInstanceOf[js.Any]))
      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolution.foreach(__v => __obj.updateDynamic("conflictResolution")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      keepEmptyFolders.foreach(__v => __obj.updateDynamic("keepEmptyFolders")(__v.asInstanceOf[js.Any]))
      sourceCommitId.foreach(__v => __obj.updateDynamic("sourceCommitId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergePullRequestBySquashInput]
    }
  }

  @js.native
  trait MergePullRequestBySquashOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object MergePullRequestBySquashOutput {
    @inline
    def apply(
        pullRequest: js.UndefOr[PullRequest] = js.undefined
    ): MergePullRequestBySquashOutput = {
      val __obj = js.Dynamic.literal()
      pullRequest.foreach(__v => __obj.updateDynamic("pullRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergePullRequestBySquashOutput]
    }
  }

  @js.native
  trait MergePullRequestByThreeWayInput extends js.Object {
    var pullRequestId: PullRequestId
    var repositoryName: RepositoryName
    var authorName: js.UndefOr[Name]
    var commitMessage: js.UndefOr[Message]
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolution: js.UndefOr[ConflictResolution]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
    var email: js.UndefOr[Email]
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders]
    var sourceCommitId: js.UndefOr[ObjectId]
  }

  object MergePullRequestByThreeWayInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        repositoryName: RepositoryName,
        authorName: js.UndefOr[Name] = js.undefined,
        commitMessage: js.UndefOr[Message] = js.undefined,
        conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined,
        conflictResolution: js.UndefOr[ConflictResolution] = js.undefined,
        conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined,
        sourceCommitId: js.UndefOr[ObjectId] = js.undefined
    ): MergePullRequestByThreeWayInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      authorName.foreach(__v => __obj.updateDynamic("authorName")(__v.asInstanceOf[js.Any]))
      commitMessage.foreach(__v => __obj.updateDynamic("commitMessage")(__v.asInstanceOf[js.Any]))
      conflictDetailLevel.foreach(__v => __obj.updateDynamic("conflictDetailLevel")(__v.asInstanceOf[js.Any]))
      conflictResolution.foreach(__v => __obj.updateDynamic("conflictResolution")(__v.asInstanceOf[js.Any]))
      conflictResolutionStrategy.foreach(__v => __obj.updateDynamic("conflictResolutionStrategy")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      keepEmptyFolders.foreach(__v => __obj.updateDynamic("keepEmptyFolders")(__v.asInstanceOf[js.Any]))
      sourceCommitId.foreach(__v => __obj.updateDynamic("sourceCommitId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergePullRequestByThreeWayInput]
    }
  }

  @js.native
  trait MergePullRequestByThreeWayOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object MergePullRequestByThreeWayOutput {
    @inline
    def apply(
        pullRequest: js.UndefOr[PullRequest] = js.undefined
    ): MergePullRequestByThreeWayOutput = {
      val __obj = js.Dynamic.literal()
      pullRequest.foreach(__v => __obj.updateDynamic("pullRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergePullRequestByThreeWayOutput]
    }
  }

  /** Information about the type of an object in a merge operation.
    */
  @js.native
  trait ObjectTypes extends js.Object {
    var base: js.UndefOr[ObjectTypeEnum]
    var destination: js.UndefOr[ObjectTypeEnum]
    var source: js.UndefOr[ObjectTypeEnum]
  }

  object ObjectTypes {
    @inline
    def apply(
        base: js.UndefOr[ObjectTypeEnum] = js.undefined,
        destination: js.UndefOr[ObjectTypeEnum] = js.undefined,
        source: js.UndefOr[ObjectTypeEnum] = js.undefined
    ): ObjectTypes = {
      val __obj = js.Dynamic.literal()
      base.foreach(__v => __obj.updateDynamic("base")(__v.asInstanceOf[js.Any]))
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectTypes]
    }
  }

  /** Returns information about the template that created the approval rule for a pull request.
    */
  @js.native
  trait OriginApprovalRuleTemplate extends js.Object {
    var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId]
    var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName]
  }

  object OriginApprovalRuleTemplate {
    @inline
    def apply(
        approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.undefined,
        approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.undefined
    ): OriginApprovalRuleTemplate = {
      val __obj = js.Dynamic.literal()
      approvalRuleTemplateId.foreach(__v => __obj.updateDynamic("approvalRuleTemplateId")(__v.asInstanceOf[js.Any]))
      approvalRuleTemplateName.foreach(__v => __obj.updateDynamic("approvalRuleTemplateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginApprovalRuleTemplate]
    }
  }

  @js.native
  trait OverridePullRequestApprovalRulesInput extends js.Object {
    var overrideStatus: OverrideStatus
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  object OverridePullRequestApprovalRulesInput {
    @inline
    def apply(
        overrideStatus: OverrideStatus,
        pullRequestId: PullRequestId,
        revisionId: RevisionId
    ): OverridePullRequestApprovalRulesInput = {
      val __obj = js.Dynamic.literal(
        "overrideStatus" -> overrideStatus.asInstanceOf[js.Any],
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OverridePullRequestApprovalRulesInput]
    }
  }

  @js.native
  trait PostCommentForComparedCommitInput extends js.Object {
    var afterCommitId: CommitId
    var content: Content
    var repositoryName: RepositoryName
    var beforeCommitId: js.UndefOr[CommitId]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var location: js.UndefOr[Location]
  }

  object PostCommentForComparedCommitInput {
    @inline
    def apply(
        afterCommitId: CommitId,
        content: Content,
        repositoryName: RepositoryName,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        location: js.UndefOr[Location] = js.undefined
    ): PostCommentForComparedCommitInput = {
      val __obj = js.Dynamic.literal(
        "afterCommitId" -> afterCommitId.asInstanceOf[js.Any],
        "content" -> content.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      beforeCommitId.foreach(__v => __obj.updateDynamic("beforeCommitId")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostCommentForComparedCommitInput]
    }
  }

  @js.native
  trait PostCommentForComparedCommitOutput extends js.Object {
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var beforeCommitId: js.UndefOr[CommitId]
    var comment: js.UndefOr[Comment]
    var location: js.UndefOr[Location]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PostCommentForComparedCommitOutput {
    @inline
    def apply(
        afterBlobId: js.UndefOr[ObjectId] = js.undefined,
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        comment: js.UndefOr[Comment] = js.undefined,
        location: js.UndefOr[Location] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PostCommentForComparedCommitOutput = {
      val __obj = js.Dynamic.literal()
      afterBlobId.foreach(__v => __obj.updateDynamic("afterBlobId")(__v.asInstanceOf[js.Any]))
      afterCommitId.foreach(__v => __obj.updateDynamic("afterCommitId")(__v.asInstanceOf[js.Any]))
      beforeBlobId.foreach(__v => __obj.updateDynamic("beforeBlobId")(__v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.updateDynamic("beforeCommitId")(__v.asInstanceOf[js.Any]))
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostCommentForComparedCommitOutput]
    }
  }

  @js.native
  trait PostCommentForPullRequestInput extends js.Object {
    var afterCommitId: CommitId
    var beforeCommitId: CommitId
    var content: Content
    var pullRequestId: PullRequestId
    var repositoryName: RepositoryName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var location: js.UndefOr[Location]
  }

  object PostCommentForPullRequestInput {
    @inline
    def apply(
        afterCommitId: CommitId,
        beforeCommitId: CommitId,
        content: Content,
        pullRequestId: PullRequestId,
        repositoryName: RepositoryName,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        location: js.UndefOr[Location] = js.undefined
    ): PostCommentForPullRequestInput = {
      val __obj = js.Dynamic.literal(
        "afterCommitId" -> afterCommitId.asInstanceOf[js.Any],
        "beforeCommitId" -> beforeCommitId.asInstanceOf[js.Any],
        "content" -> content.asInstanceOf[js.Any],
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostCommentForPullRequestInput]
    }
  }

  @js.native
  trait PostCommentForPullRequestOutput extends js.Object {
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var beforeCommitId: js.UndefOr[CommitId]
    var comment: js.UndefOr[Comment]
    var location: js.UndefOr[Location]
    var pullRequestId: js.UndefOr[PullRequestId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PostCommentForPullRequestOutput {
    @inline
    def apply(
        afterBlobId: js.UndefOr[ObjectId] = js.undefined,
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        comment: js.UndefOr[Comment] = js.undefined,
        location: js.UndefOr[Location] = js.undefined,
        pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PostCommentForPullRequestOutput = {
      val __obj = js.Dynamic.literal()
      afterBlobId.foreach(__v => __obj.updateDynamic("afterBlobId")(__v.asInstanceOf[js.Any]))
      afterCommitId.foreach(__v => __obj.updateDynamic("afterCommitId")(__v.asInstanceOf[js.Any]))
      beforeBlobId.foreach(__v => __obj.updateDynamic("beforeBlobId")(__v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.updateDynamic("beforeCommitId")(__v.asInstanceOf[js.Any]))
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      pullRequestId.foreach(__v => __obj.updateDynamic("pullRequestId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostCommentForPullRequestOutput]
    }
  }

  @js.native
  trait PostCommentReplyInput extends js.Object {
    var content: Content
    var inReplyTo: CommentId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object PostCommentReplyInput {
    @inline
    def apply(
        content: Content,
        inReplyTo: CommentId,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): PostCommentReplyInput = {
      val __obj = js.Dynamic.literal(
        "content" -> content.asInstanceOf[js.Any],
        "inReplyTo" -> inReplyTo.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostCommentReplyInput]
    }
  }

  @js.native
  trait PostCommentReplyOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object PostCommentReplyOutput {
    @inline
    def apply(
        comment: js.UndefOr[Comment] = js.undefined
    ): PostCommentReplyOutput = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostCommentReplyOutput]
    }
  }

  /** Returns information about a pull request.
    */
  @js.native
  trait PullRequest extends js.Object {
    var approvalRules: js.UndefOr[ApprovalRulesList]
    var authorArn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var creationDate: js.UndefOr[CreationDate]
    var description: js.UndefOr[Description]
    var lastActivityDate: js.UndefOr[LastModifiedDate]
    var pullRequestId: js.UndefOr[PullRequestId]
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
    var pullRequestTargets: js.UndefOr[PullRequestTargetList]
    var revisionId: js.UndefOr[RevisionId]
    var title: js.UndefOr[Title]
  }

  object PullRequest {
    @inline
    def apply(
        approvalRules: js.UndefOr[ApprovalRulesList] = js.undefined,
        authorArn: js.UndefOr[Arn] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastActivityDate: js.UndefOr[LastModifiedDate] = js.undefined,
        pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
        pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined,
        pullRequestTargets: js.UndefOr[PullRequestTargetList] = js.undefined,
        revisionId: js.UndefOr[RevisionId] = js.undefined,
        title: js.UndefOr[Title] = js.undefined
    ): PullRequest = {
      val __obj = js.Dynamic.literal()
      approvalRules.foreach(__v => __obj.updateDynamic("approvalRules")(__v.asInstanceOf[js.Any]))
      authorArn.foreach(__v => __obj.updateDynamic("authorArn")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastActivityDate.foreach(__v => __obj.updateDynamic("lastActivityDate")(__v.asInstanceOf[js.Any]))
      pullRequestId.foreach(__v => __obj.updateDynamic("pullRequestId")(__v.asInstanceOf[js.Any]))
      pullRequestStatus.foreach(__v => __obj.updateDynamic("pullRequestStatus")(__v.asInstanceOf[js.Any]))
      pullRequestTargets.foreach(__v => __obj.updateDynamic("pullRequestTargets")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequest]
    }
  }

  /** Metadata about the pull request that is used when comparing the pull request source with its destination.
    */
  @js.native
  trait PullRequestCreatedEventMetadata extends js.Object {
    var destinationCommitId: js.UndefOr[CommitId]
    var mergeBase: js.UndefOr[CommitId]
    var repositoryName: js.UndefOr[RepositoryName]
    var sourceCommitId: js.UndefOr[CommitId]
  }

  object PullRequestCreatedEventMetadata {
    @inline
    def apply(
        destinationCommitId: js.UndefOr[CommitId] = js.undefined,
        mergeBase: js.UndefOr[CommitId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        sourceCommitId: js.UndefOr[CommitId] = js.undefined
    ): PullRequestCreatedEventMetadata = {
      val __obj = js.Dynamic.literal()
      destinationCommitId.foreach(__v => __obj.updateDynamic("destinationCommitId")(__v.asInstanceOf[js.Any]))
      mergeBase.foreach(__v => __obj.updateDynamic("mergeBase")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      sourceCommitId.foreach(__v => __obj.updateDynamic("sourceCommitId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestCreatedEventMetadata]
    }
  }

  /** Returns information about a pull request event.
    */
  @js.native
  trait PullRequestEvent extends js.Object {
    var actorArn: js.UndefOr[Arn]
    var approvalRuleEventMetadata: js.UndefOr[ApprovalRuleEventMetadata]
    var approvalRuleOverriddenEventMetadata: js.UndefOr[ApprovalRuleOverriddenEventMetadata]
    var approvalStateChangedEventMetadata: js.UndefOr[ApprovalStateChangedEventMetadata]
    var eventDate: js.UndefOr[EventDate]
    var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata]
    var pullRequestEventType: js.UndefOr[PullRequestEventType]
    var pullRequestId: js.UndefOr[PullRequestId]
    var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata]
    var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata]
    var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata]
  }

  object PullRequestEvent {
    @inline
    def apply(
        actorArn: js.UndefOr[Arn] = js.undefined,
        approvalRuleEventMetadata: js.UndefOr[ApprovalRuleEventMetadata] = js.undefined,
        approvalRuleOverriddenEventMetadata: js.UndefOr[ApprovalRuleOverriddenEventMetadata] = js.undefined,
        approvalStateChangedEventMetadata: js.UndefOr[ApprovalStateChangedEventMetadata] = js.undefined,
        eventDate: js.UndefOr[EventDate] = js.undefined,
        pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.undefined,
        pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined,
        pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
        pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.undefined,
        pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.undefined,
        pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.undefined
    ): PullRequestEvent = {
      val __obj = js.Dynamic.literal()
      actorArn.foreach(__v => __obj.updateDynamic("actorArn")(__v.asInstanceOf[js.Any]))
      approvalRuleEventMetadata.foreach(__v => __obj.updateDynamic("approvalRuleEventMetadata")(__v.asInstanceOf[js.Any]))
      approvalRuleOverriddenEventMetadata.foreach(__v => __obj.updateDynamic("approvalRuleOverriddenEventMetadata")(__v.asInstanceOf[js.Any]))
      approvalStateChangedEventMetadata.foreach(__v => __obj.updateDynamic("approvalStateChangedEventMetadata")(__v.asInstanceOf[js.Any]))
      eventDate.foreach(__v => __obj.updateDynamic("eventDate")(__v.asInstanceOf[js.Any]))
      pullRequestCreatedEventMetadata.foreach(__v => __obj.updateDynamic("pullRequestCreatedEventMetadata")(__v.asInstanceOf[js.Any]))
      pullRequestEventType.foreach(__v => __obj.updateDynamic("pullRequestEventType")(__v.asInstanceOf[js.Any]))
      pullRequestId.foreach(__v => __obj.updateDynamic("pullRequestId")(__v.asInstanceOf[js.Any]))
      pullRequestMergedStateChangedEventMetadata.foreach(__v => __obj.updateDynamic("pullRequestMergedStateChangedEventMetadata")(__v.asInstanceOf[js.Any]))
      pullRequestSourceReferenceUpdatedEventMetadata.foreach(__v => __obj.updateDynamic("pullRequestSourceReferenceUpdatedEventMetadata")(__v.asInstanceOf[js.Any]))
      pullRequestStatusChangedEventMetadata.foreach(__v => __obj.updateDynamic("pullRequestStatusChangedEventMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestEvent]
    }
  }

  /** Returns information about the change in the merge state for a pull request event.
    */
  @js.native
  trait PullRequestMergedStateChangedEventMetadata extends js.Object {
    var destinationReference: js.UndefOr[ReferenceName]
    var mergeMetadata: js.UndefOr[MergeMetadata]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PullRequestMergedStateChangedEventMetadata {
    @inline
    def apply(
        destinationReference: js.UndefOr[ReferenceName] = js.undefined,
        mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PullRequestMergedStateChangedEventMetadata = {
      val __obj = js.Dynamic.literal()
      destinationReference.foreach(__v => __obj.updateDynamic("destinationReference")(__v.asInstanceOf[js.Any]))
      mergeMetadata.foreach(__v => __obj.updateDynamic("mergeMetadata")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
    }
  }

  /** Information about an update to the source branch of a pull request.
    */
  @js.native
  trait PullRequestSourceReferenceUpdatedEventMetadata extends js.Object {
    var afterCommitId: js.UndefOr[CommitId]
    var beforeCommitId: js.UndefOr[CommitId]
    var mergeBase: js.UndefOr[CommitId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PullRequestSourceReferenceUpdatedEventMetadata {
    @inline
    def apply(
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        mergeBase: js.UndefOr[CommitId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PullRequestSourceReferenceUpdatedEventMetadata = {
      val __obj = js.Dynamic.literal()
      afterCommitId.foreach(__v => __obj.updateDynamic("afterCommitId")(__v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.updateDynamic("beforeCommitId")(__v.asInstanceOf[js.Any]))
      mergeBase.foreach(__v => __obj.updateDynamic("mergeBase")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
    }
  }

  /** Information about a change to the status of a pull request.
    */
  @js.native
  trait PullRequestStatusChangedEventMetadata extends js.Object {
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
  }

  object PullRequestStatusChangedEventMetadata {
    @inline
    def apply(
        pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
    ): PullRequestStatusChangedEventMetadata = {
      val __obj = js.Dynamic.literal()
      pullRequestStatus.foreach(__v => __obj.updateDynamic("pullRequestStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
    }
  }

  /** Returns information about a pull request target.
    */
  @js.native
  trait PullRequestTarget extends js.Object {
    var destinationCommit: js.UndefOr[CommitId]
    var destinationReference: js.UndefOr[ReferenceName]
    var mergeBase: js.UndefOr[CommitId]
    var mergeMetadata: js.UndefOr[MergeMetadata]
    var repositoryName: js.UndefOr[RepositoryName]
    var sourceCommit: js.UndefOr[CommitId]
    var sourceReference: js.UndefOr[ReferenceName]
  }

  object PullRequestTarget {
    @inline
    def apply(
        destinationCommit: js.UndefOr[CommitId] = js.undefined,
        destinationReference: js.UndefOr[ReferenceName] = js.undefined,
        mergeBase: js.UndefOr[CommitId] = js.undefined,
        mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        sourceCommit: js.UndefOr[CommitId] = js.undefined,
        sourceReference: js.UndefOr[ReferenceName] = js.undefined
    ): PullRequestTarget = {
      val __obj = js.Dynamic.literal()
      destinationCommit.foreach(__v => __obj.updateDynamic("destinationCommit")(__v.asInstanceOf[js.Any]))
      destinationReference.foreach(__v => __obj.updateDynamic("destinationReference")(__v.asInstanceOf[js.Any]))
      mergeBase.foreach(__v => __obj.updateDynamic("mergeBase")(__v.asInstanceOf[js.Any]))
      mergeMetadata.foreach(__v => __obj.updateDynamic("mergeMetadata")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      sourceCommit.foreach(__v => __obj.updateDynamic("sourceCommit")(__v.asInstanceOf[js.Any]))
      sourceReference.foreach(__v => __obj.updateDynamic("sourceReference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestTarget]
    }
  }

  @js.native
  trait PutCommentReactionInput extends js.Object {
    var commentId: CommentId
    var reactionValue: ReactionValue
  }

  object PutCommentReactionInput {
    @inline
    def apply(
        commentId: CommentId,
        reactionValue: ReactionValue
    ): PutCommentReactionInput = {
      val __obj = js.Dynamic.literal(
        "commentId" -> commentId.asInstanceOf[js.Any],
        "reactionValue" -> reactionValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutCommentReactionInput]
    }
  }

  /** Information about a file added or updated as part of a commit.
    */
  @js.native
  trait PutFileEntry extends js.Object {
    var filePath: Path
    var fileContent: js.UndefOr[FileContent]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var sourceFile: js.UndefOr[SourceFileSpecifier]
  }

  object PutFileEntry {
    @inline
    def apply(
        filePath: Path,
        fileContent: js.UndefOr[FileContent] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined,
        sourceFile: js.UndefOr[SourceFileSpecifier] = js.undefined
    ): PutFileEntry = {
      val __obj = js.Dynamic.literal(
        "filePath" -> filePath.asInstanceOf[js.Any]
      )

      fileContent.foreach(__v => __obj.updateDynamic("fileContent")(__v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.updateDynamic("fileMode")(__v.asInstanceOf[js.Any]))
      sourceFile.foreach(__v => __obj.updateDynamic("sourceFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutFileEntry]
    }
  }

  @js.native
  trait PutFileInput extends js.Object {
    var branchName: BranchName
    var fileContent: FileContent
    var filePath: Path
    var repositoryName: RepositoryName
    var commitMessage: js.UndefOr[Message]
    var email: js.UndefOr[Email]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var name: js.UndefOr[Name]
    var parentCommitId: js.UndefOr[CommitId]
  }

  object PutFileInput {
    @inline
    def apply(
        branchName: BranchName,
        fileContent: FileContent,
        filePath: Path,
        repositoryName: RepositoryName,
        commitMessage: js.UndefOr[Message] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        parentCommitId: js.UndefOr[CommitId] = js.undefined
    ): PutFileInput = {
      val __obj = js.Dynamic.literal(
        "branchName" -> branchName.asInstanceOf[js.Any],
        "fileContent" -> fileContent.asInstanceOf[js.Any],
        "filePath" -> filePath.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      commitMessage.foreach(__v => __obj.updateDynamic("commitMessage")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.updateDynamic("fileMode")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      parentCommitId.foreach(__v => __obj.updateDynamic("parentCommitId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutFileInput]
    }
  }

  @js.native
  trait PutFileOutput extends js.Object {
    var blobId: ObjectId
    var commitId: ObjectId
    var treeId: ObjectId
  }

  object PutFileOutput {
    @inline
    def apply(
        blobId: ObjectId,
        commitId: ObjectId,
        treeId: ObjectId
    ): PutFileOutput = {
      val __obj = js.Dynamic.literal(
        "blobId" -> blobId.asInstanceOf[js.Any],
        "commitId" -> commitId.asInstanceOf[js.Any],
        "treeId" -> treeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutFileOutput]
    }
  }

  /** Represents the input of a put repository triggers operation.
    */
  @js.native
  trait PutRepositoryTriggersInput extends js.Object {
    var repositoryName: RepositoryName
    var triggers: RepositoryTriggersList
  }

  object PutRepositoryTriggersInput {
    @inline
    def apply(
        repositoryName: RepositoryName,
        triggers: RepositoryTriggersList
    ): PutRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "triggers" -> triggers.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutRepositoryTriggersInput]
    }
  }

  /** Represents the output of a put repository triggers operation.
    */
  @js.native
  trait PutRepositoryTriggersOutput extends js.Object {
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId]
  }

  object PutRepositoryTriggersOutput {
    @inline
    def apply(
        configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined
    ): PutRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal()
      configurationId.foreach(__v => __obj.updateDynamic("configurationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRepositoryTriggersOutput]
    }
  }

  /** Information about the reaction values provided by users on a comment.
    */
  @js.native
  trait ReactionForComment extends js.Object {
    var reaction: js.UndefOr[ReactionValueFormats]
    var reactionUsers: js.UndefOr[ReactionUsersList]
    var reactionsFromDeletedUsersCount: js.UndefOr[Count]
  }

  object ReactionForComment {
    @inline
    def apply(
        reaction: js.UndefOr[ReactionValueFormats] = js.undefined,
        reactionUsers: js.UndefOr[ReactionUsersList] = js.undefined,
        reactionsFromDeletedUsersCount: js.UndefOr[Count] = js.undefined
    ): ReactionForComment = {
      val __obj = js.Dynamic.literal()
      reaction.foreach(__v => __obj.updateDynamic("reaction")(__v.asInstanceOf[js.Any]))
      reactionUsers.foreach(__v => __obj.updateDynamic("reactionUsers")(__v.asInstanceOf[js.Any]))
      reactionsFromDeletedUsersCount.foreach(__v => __obj.updateDynamic("reactionsFromDeletedUsersCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReactionForComment]
    }
  }

  /** Information about the values for reactions to a comment. AWS CodeCommit supports a limited set of reactions.
    */
  @js.native
  trait ReactionValueFormats extends js.Object {
    var emoji: js.UndefOr[ReactionEmoji]
    var shortCode: js.UndefOr[ReactionShortCode]
    var unicode: js.UndefOr[ReactionUnicode]
  }

  object ReactionValueFormats {
    @inline
    def apply(
        emoji: js.UndefOr[ReactionEmoji] = js.undefined,
        shortCode: js.UndefOr[ReactionShortCode] = js.undefined,
        unicode: js.UndefOr[ReactionUnicode] = js.undefined
    ): ReactionValueFormats = {
      val __obj = js.Dynamic.literal()
      emoji.foreach(__v => __obj.updateDynamic("emoji")(__v.asInstanceOf[js.Any]))
      shortCode.foreach(__v => __obj.updateDynamic("shortCode")(__v.asInstanceOf[js.Any]))
      unicode.foreach(__v => __obj.updateDynamic("unicode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReactionValueFormats]
    }
  }

  /** Information about a replacement content entry in the conflict of a merge or pull request operation.
    */
  @js.native
  trait ReplaceContentEntry extends js.Object {
    var filePath: Path
    var replacementType: ReplacementTypeEnum
    var content: js.UndefOr[FileContent]
    var fileMode: js.UndefOr[FileModeTypeEnum]
  }

  object ReplaceContentEntry {
    @inline
    def apply(
        filePath: Path,
        replacementType: ReplacementTypeEnum,
        content: js.UndefOr[FileContent] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
    ): ReplaceContentEntry = {
      val __obj = js.Dynamic.literal(
        "filePath" -> filePath.asInstanceOf[js.Any],
        "replacementType" -> replacementType.asInstanceOf[js.Any]
      )

      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.updateDynamic("fileMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplaceContentEntry]
    }
  }

  /** Information about a repository.
    */
  @js.native
  trait RepositoryMetadata extends js.Object {
    var Arn: js.UndefOr[Arn]
    var accountId: js.UndefOr[AccountId]
    var cloneUrlHttp: js.UndefOr[CloneUrlHttp]
    var cloneUrlSsh: js.UndefOr[CloneUrlSsh]
    var creationDate: js.UndefOr[CreationDate]
    var defaultBranch: js.UndefOr[BranchName]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
    var repositoryDescription: js.UndefOr[RepositoryDescription]
    var repositoryId: js.UndefOr[RepositoryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object RepositoryMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        accountId: js.UndefOr[AccountId] = js.undefined,
        cloneUrlHttp: js.UndefOr[CloneUrlHttp] = js.undefined,
        cloneUrlSsh: js.UndefOr[CloneUrlSsh] = js.undefined,
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        defaultBranch: js.UndefOr[BranchName] = js.undefined,
        lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined,
        repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined,
        repositoryId: js.UndefOr[RepositoryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): RepositoryMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      cloneUrlHttp.foreach(__v => __obj.updateDynamic("cloneUrlHttp")(__v.asInstanceOf[js.Any]))
      cloneUrlSsh.foreach(__v => __obj.updateDynamic("cloneUrlSsh")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      defaultBranch.foreach(__v => __obj.updateDynamic("defaultBranch")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      repositoryDescription.foreach(__v => __obj.updateDynamic("repositoryDescription")(__v.asInstanceOf[js.Any]))
      repositoryId.foreach(__v => __obj.updateDynamic("repositoryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryMetadata]
    }
  }

  /** Information about a repository name and ID.
    */
  @js.native
  trait RepositoryNameIdPair extends js.Object {
    var repositoryId: js.UndefOr[RepositoryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object RepositoryNameIdPair {
    @inline
    def apply(
        repositoryId: js.UndefOr[RepositoryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): RepositoryNameIdPair = {
      val __obj = js.Dynamic.literal()
      repositoryId.foreach(__v => __obj.updateDynamic("repositoryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryNameIdPair]
    }
  }

  /** Information about a trigger for a repository.
    */
  @js.native
  trait RepositoryTrigger extends js.Object {
    var destinationArn: Arn
    var events: RepositoryTriggerEventList
    var name: RepositoryTriggerName
    var branches: js.UndefOr[BranchNameList]
    var customData: js.UndefOr[RepositoryTriggerCustomData]
  }

  object RepositoryTrigger {
    @inline
    def apply(
        destinationArn: Arn,
        events: RepositoryTriggerEventList,
        name: RepositoryTriggerName,
        branches: js.UndefOr[BranchNameList] = js.undefined,
        customData: js.UndefOr[RepositoryTriggerCustomData] = js.undefined
    ): RepositoryTrigger = {
      val __obj = js.Dynamic.literal(
        "destinationArn" -> destinationArn.asInstanceOf[js.Any],
        "events" -> events.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      branches.foreach(__v => __obj.updateDynamic("branches")(__v.asInstanceOf[js.Any]))
      customData.foreach(__v => __obj.updateDynamic("customData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryTrigger]
    }
  }

  /** A trigger failed to run.
    */
  @js.native
  trait RepositoryTriggerExecutionFailure extends js.Object {
    var failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage]
    var trigger: js.UndefOr[RepositoryTriggerName]
  }

  object RepositoryTriggerExecutionFailure {
    @inline
    def apply(
        failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage] = js.undefined,
        trigger: js.UndefOr[RepositoryTriggerName] = js.undefined
    ): RepositoryTriggerExecutionFailure = {
      val __obj = js.Dynamic.literal()
      failureMessage.foreach(__v => __obj.updateDynamic("failureMessage")(__v.asInstanceOf[js.Any]))
      trigger.foreach(__v => __obj.updateDynamic("trigger")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
    }
  }

  /** Information about the file mode changes.
    */
  @js.native
  trait SetFileModeEntry extends js.Object {
    var fileMode: FileModeTypeEnum
    var filePath: Path
  }

  object SetFileModeEntry {
    @inline
    def apply(
        fileMode: FileModeTypeEnum,
        filePath: Path
    ): SetFileModeEntry = {
      val __obj = js.Dynamic.literal(
        "fileMode" -> fileMode.asInstanceOf[js.Any],
        "filePath" -> filePath.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetFileModeEntry]
    }
  }

  /** Information about a source file that is part of changes made in a commit.
    */
  @js.native
  trait SourceFileSpecifier extends js.Object {
    var filePath: Path
    var isMove: js.UndefOr[IsMove]
  }

  object SourceFileSpecifier {
    @inline
    def apply(
        filePath: Path,
        isMove: js.UndefOr[IsMove] = js.undefined
    ): SourceFileSpecifier = {
      val __obj = js.Dynamic.literal(
        "filePath" -> filePath.asInstanceOf[js.Any]
      )

      isMove.foreach(__v => __obj.updateDynamic("isMove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceFileSpecifier]
    }
  }

  /** Returns information about a submodule reference in a repository folder.
    */
  @js.native
  trait SubModule extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var commitId: js.UndefOr[ObjectId]
    var relativePath: js.UndefOr[Path]
  }

  object SubModule {
    @inline
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        commitId: js.UndefOr[ObjectId] = js.undefined,
        relativePath: js.UndefOr[Path] = js.undefined
    ): SubModule = {
      val __obj = js.Dynamic.literal()
      absolutePath.foreach(__v => __obj.updateDynamic("absolutePath")(__v.asInstanceOf[js.Any]))
      commitId.foreach(__v => __obj.updateDynamic("commitId")(__v.asInstanceOf[js.Any]))
      relativePath.foreach(__v => __obj.updateDynamic("relativePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubModule]
    }
  }

  /** Returns information about a symbolic link in a repository folder.
    */
  @js.native
  trait SymbolicLink extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var blobId: js.UndefOr[ObjectId]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var relativePath: js.UndefOr[Path]
  }

  object SymbolicLink {
    @inline
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        blobId: js.UndefOr[ObjectId] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined,
        relativePath: js.UndefOr[Path] = js.undefined
    ): SymbolicLink = {
      val __obj = js.Dynamic.literal()
      absolutePath.foreach(__v => __obj.updateDynamic("absolutePath")(__v.asInstanceOf[js.Any]))
      blobId.foreach(__v => __obj.updateDynamic("blobId")(__v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.updateDynamic("fileMode")(__v.asInstanceOf[js.Any]))
      relativePath.foreach(__v => __obj.updateDynamic("relativePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SymbolicLink]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagsMap
  }

  object TagResourceInput {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagsMap
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  /** Returns information about a target for a pull request.
    */
  @js.native
  trait Target extends js.Object {
    var repositoryName: RepositoryName
    var sourceReference: ReferenceName
    var destinationReference: js.UndefOr[ReferenceName]
  }

  object Target {
    @inline
    def apply(
        repositoryName: RepositoryName,
        sourceReference: ReferenceName,
        destinationReference: js.UndefOr[ReferenceName] = js.undefined
    ): Target = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "sourceReference" -> sourceReference.asInstanceOf[js.Any]
      )

      destinationReference.foreach(__v => __obj.updateDynamic("destinationReference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
    }
  }

  /** Represents the input of a test repository triggers operation.
    */
  @js.native
  trait TestRepositoryTriggersInput extends js.Object {
    var repositoryName: RepositoryName
    var triggers: RepositoryTriggersList
  }

  object TestRepositoryTriggersInput {
    @inline
    def apply(
        repositoryName: RepositoryName,
        triggers: RepositoryTriggersList
    ): TestRepositoryTriggersInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "triggers" -> triggers.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TestRepositoryTriggersInput]
    }
  }

  /** Represents the output of a test repository triggers operation.
    */
  @js.native
  trait TestRepositoryTriggersOutput extends js.Object {
    var failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList]
    var successfulExecutions: js.UndefOr[RepositoryTriggerNameList]
  }

  object TestRepositoryTriggersOutput {
    @inline
    def apply(
        failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList] = js.undefined,
        successfulExecutions: js.UndefOr[RepositoryTriggerNameList] = js.undefined
    ): TestRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal()
      failedExecutions.foreach(__v => __obj.updateDynamic("failedExecutions")(__v.asInstanceOf[js.Any]))
      successfulExecutions.foreach(__v => __obj.updateDynamic("successfulExecutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestRepositoryTriggersOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeysList
  }

  object UntagResourceInput {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeysList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UpdateApprovalRuleTemplateContentInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var newRuleContent: ApprovalRuleTemplateContent
    var existingRuleContentSha256: js.UndefOr[RuleContentSha256]
  }

  object UpdateApprovalRuleTemplateContentInput {
    @inline
    def apply(
        approvalRuleTemplateName: ApprovalRuleTemplateName,
        newRuleContent: ApprovalRuleTemplateContent,
        existingRuleContentSha256: js.UndefOr[RuleContentSha256] = js.undefined
    ): UpdateApprovalRuleTemplateContentInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any],
        "newRuleContent" -> newRuleContent.asInstanceOf[js.Any]
      )

      existingRuleContentSha256.foreach(__v => __obj.updateDynamic("existingRuleContentSha256")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApprovalRuleTemplateContentInput]
    }
  }

  @js.native
  trait UpdateApprovalRuleTemplateContentOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  object UpdateApprovalRuleTemplateContentOutput {
    @inline
    def apply(
        approvalRuleTemplate: ApprovalRuleTemplate
    ): UpdateApprovalRuleTemplateContentOutput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplate" -> approvalRuleTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApprovalRuleTemplateContentOutput]
    }
  }

  @js.native
  trait UpdateApprovalRuleTemplateDescriptionInput extends js.Object {
    var approvalRuleTemplateDescription: ApprovalRuleTemplateDescription
    var approvalRuleTemplateName: ApprovalRuleTemplateName
  }

  object UpdateApprovalRuleTemplateDescriptionInput {
    @inline
    def apply(
        approvalRuleTemplateDescription: ApprovalRuleTemplateDescription,
        approvalRuleTemplateName: ApprovalRuleTemplateName
    ): UpdateApprovalRuleTemplateDescriptionInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplateDescription" -> approvalRuleTemplateDescription.asInstanceOf[js.Any],
        "approvalRuleTemplateName" -> approvalRuleTemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApprovalRuleTemplateDescriptionInput]
    }
  }

  @js.native
  trait UpdateApprovalRuleTemplateDescriptionOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  object UpdateApprovalRuleTemplateDescriptionOutput {
    @inline
    def apply(
        approvalRuleTemplate: ApprovalRuleTemplate
    ): UpdateApprovalRuleTemplateDescriptionOutput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplate" -> approvalRuleTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApprovalRuleTemplateDescriptionOutput]
    }
  }

  @js.native
  trait UpdateApprovalRuleTemplateNameInput extends js.Object {
    var newApprovalRuleTemplateName: ApprovalRuleTemplateName
    var oldApprovalRuleTemplateName: ApprovalRuleTemplateName
  }

  object UpdateApprovalRuleTemplateNameInput {
    @inline
    def apply(
        newApprovalRuleTemplateName: ApprovalRuleTemplateName,
        oldApprovalRuleTemplateName: ApprovalRuleTemplateName
    ): UpdateApprovalRuleTemplateNameInput = {
      val __obj = js.Dynamic.literal(
        "newApprovalRuleTemplateName" -> newApprovalRuleTemplateName.asInstanceOf[js.Any],
        "oldApprovalRuleTemplateName" -> oldApprovalRuleTemplateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApprovalRuleTemplateNameInput]
    }
  }

  @js.native
  trait UpdateApprovalRuleTemplateNameOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  object UpdateApprovalRuleTemplateNameOutput {
    @inline
    def apply(
        approvalRuleTemplate: ApprovalRuleTemplate
    ): UpdateApprovalRuleTemplateNameOutput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleTemplate" -> approvalRuleTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApprovalRuleTemplateNameOutput]
    }
  }

  @js.native
  trait UpdateCommentInput extends js.Object {
    var commentId: CommentId
    var content: Content
  }

  object UpdateCommentInput {
    @inline
    def apply(
        commentId: CommentId,
        content: Content
    ): UpdateCommentInput = {
      val __obj = js.Dynamic.literal(
        "commentId" -> commentId.asInstanceOf[js.Any],
        "content" -> content.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCommentInput]
    }
  }

  @js.native
  trait UpdateCommentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object UpdateCommentOutput {
    @inline
    def apply(
        comment: js.UndefOr[Comment] = js.undefined
    ): UpdateCommentOutput = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCommentOutput]
    }
  }

  /** Represents the input of an update default branch operation.
    */
  @js.native
  trait UpdateDefaultBranchInput extends js.Object {
    var defaultBranchName: BranchName
    var repositoryName: RepositoryName
  }

  object UpdateDefaultBranchInput {
    @inline
    def apply(
        defaultBranchName: BranchName,
        repositoryName: RepositoryName
    ): UpdateDefaultBranchInput = {
      val __obj = js.Dynamic.literal(
        "defaultBranchName" -> defaultBranchName.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDefaultBranchInput]
    }
  }

  @js.native
  trait UpdatePullRequestApprovalRuleContentInput extends js.Object {
    var approvalRuleName: ApprovalRuleName
    var newRuleContent: ApprovalRuleContent
    var pullRequestId: PullRequestId
    var existingRuleContentSha256: js.UndefOr[RuleContentSha256]
  }

  object UpdatePullRequestApprovalRuleContentInput {
    @inline
    def apply(
        approvalRuleName: ApprovalRuleName,
        newRuleContent: ApprovalRuleContent,
        pullRequestId: PullRequestId,
        existingRuleContentSha256: js.UndefOr[RuleContentSha256] = js.undefined
    ): UpdatePullRequestApprovalRuleContentInput = {
      val __obj = js.Dynamic.literal(
        "approvalRuleName" -> approvalRuleName.asInstanceOf[js.Any],
        "newRuleContent" -> newRuleContent.asInstanceOf[js.Any],
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any]
      )

      existingRuleContentSha256.foreach(__v => __obj.updateDynamic("existingRuleContentSha256")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePullRequestApprovalRuleContentInput]
    }
  }

  @js.native
  trait UpdatePullRequestApprovalRuleContentOutput extends js.Object {
    var approvalRule: ApprovalRule
  }

  object UpdatePullRequestApprovalRuleContentOutput {
    @inline
    def apply(
        approvalRule: ApprovalRule
    ): UpdatePullRequestApprovalRuleContentOutput = {
      val __obj = js.Dynamic.literal(
        "approvalRule" -> approvalRule.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePullRequestApprovalRuleContentOutput]
    }
  }

  @js.native
  trait UpdatePullRequestApprovalStateInput extends js.Object {
    var approvalState: ApprovalState
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  object UpdatePullRequestApprovalStateInput {
    @inline
    def apply(
        approvalState: ApprovalState,
        pullRequestId: PullRequestId,
        revisionId: RevisionId
    ): UpdatePullRequestApprovalStateInput = {
      val __obj = js.Dynamic.literal(
        "approvalState" -> approvalState.asInstanceOf[js.Any],
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePullRequestApprovalStateInput]
    }
  }

  @js.native
  trait UpdatePullRequestDescriptionInput extends js.Object {
    var description: Description
    var pullRequestId: PullRequestId
  }

  object UpdatePullRequestDescriptionInput {
    @inline
    def apply(
        description: Description,
        pullRequestId: PullRequestId
    ): UpdatePullRequestDescriptionInput = {
      val __obj = js.Dynamic.literal(
        "description" -> description.asInstanceOf[js.Any],
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePullRequestDescriptionInput]
    }
  }

  @js.native
  trait UpdatePullRequestDescriptionOutput extends js.Object {
    var pullRequest: PullRequest
  }

  object UpdatePullRequestDescriptionOutput {
    @inline
    def apply(
        pullRequest: PullRequest
    ): UpdatePullRequestDescriptionOutput = {
      val __obj = js.Dynamic.literal(
        "pullRequest" -> pullRequest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePullRequestDescriptionOutput]
    }
  }

  @js.native
  trait UpdatePullRequestStatusInput extends js.Object {
    var pullRequestId: PullRequestId
    var pullRequestStatus: PullRequestStatusEnum
  }

  object UpdatePullRequestStatusInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        pullRequestStatus: PullRequestStatusEnum
    ): UpdatePullRequestStatusInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "pullRequestStatus" -> pullRequestStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePullRequestStatusInput]
    }
  }

  @js.native
  trait UpdatePullRequestStatusOutput extends js.Object {
    var pullRequest: PullRequest
  }

  object UpdatePullRequestStatusOutput {
    @inline
    def apply(
        pullRequest: PullRequest
    ): UpdatePullRequestStatusOutput = {
      val __obj = js.Dynamic.literal(
        "pullRequest" -> pullRequest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePullRequestStatusOutput]
    }
  }

  @js.native
  trait UpdatePullRequestTitleInput extends js.Object {
    var pullRequestId: PullRequestId
    var title: Title
  }

  object UpdatePullRequestTitleInput {
    @inline
    def apply(
        pullRequestId: PullRequestId,
        title: Title
    ): UpdatePullRequestTitleInput = {
      val __obj = js.Dynamic.literal(
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "title" -> title.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePullRequestTitleInput]
    }
  }

  @js.native
  trait UpdatePullRequestTitleOutput extends js.Object {
    var pullRequest: PullRequest
  }

  object UpdatePullRequestTitleOutput {
    @inline
    def apply(
        pullRequest: PullRequest
    ): UpdatePullRequestTitleOutput = {
      val __obj = js.Dynamic.literal(
        "pullRequest" -> pullRequest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePullRequestTitleOutput]
    }
  }

  /** Represents the input of an update repository description operation.
    */
  @js.native
  trait UpdateRepositoryDescriptionInput extends js.Object {
    var repositoryName: RepositoryName
    var repositoryDescription: js.UndefOr[RepositoryDescription]
  }

  object UpdateRepositoryDescriptionInput {
    @inline
    def apply(
        repositoryName: RepositoryName,
        repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
    ): UpdateRepositoryDescriptionInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      repositoryDescription.foreach(__v => __obj.updateDynamic("repositoryDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRepositoryDescriptionInput]
    }
  }

  /** Represents the input of an update repository description operation.
    */
  @js.native
  trait UpdateRepositoryNameInput extends js.Object {
    var newName: RepositoryName
    var oldName: RepositoryName
  }

  object UpdateRepositoryNameInput {
    @inline
    def apply(
        newName: RepositoryName,
        oldName: RepositoryName
    ): UpdateRepositoryNameInput = {
      val __obj = js.Dynamic.literal(
        "newName" -> newName.asInstanceOf[js.Any],
        "oldName" -> oldName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRepositoryNameInput]
    }
  }

  /** Information about the user who made a specified commit.
    */
  @js.native
  trait UserInfo extends js.Object {
    var date: js.UndefOr[Date]
    var email: js.UndefOr[Email]
    var name: js.UndefOr[Name]
  }

  object UserInfo {
    @inline
    def apply(
        date: js.UndefOr[Date] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): UserInfo = {
      val __obj = js.Dynamic.literal()
      date.foreach(__v => __obj.updateDynamic("date")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserInfo]
    }
  }
}
