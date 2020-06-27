package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object codecommit {
  type AccountId                       = String
  type AdditionalData                  = String
  type ApprovalList                    = js.Array[Approval]
  type ApprovalRuleContent             = String
  type ApprovalRuleId                  = String
  type ApprovalRuleName                = String
  type ApprovalRuleTemplateContent     = String
  type ApprovalRuleTemplateDescription = String
  type ApprovalRuleTemplateId          = String
  type ApprovalRuleTemplateName        = String
  type ApprovalRuleTemplateNameList    = js.Array[ApprovalRuleTemplateName]
  type ApprovalRulesList               = js.Array[ApprovalRule]
  type ApprovalRulesNotSatisfiedList   = js.Array[ApprovalRuleName]
  type ApprovalRulesSatisfiedList      = js.Array[ApprovalRuleName]
  type Approved                        = Boolean
  type Arn                             = String
  type BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList =
    js.Array[BatchAssociateApprovalRuleTemplateWithRepositoriesError]
  type BatchDescribeMergeConflictsErrors = js.Array[BatchDescribeMergeConflictsError]
  type BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList =
    js.Array[BatchDisassociateApprovalRuleTemplateFromRepositoriesError]
  type BatchGetCommitsErrorsList                = js.Array[BatchGetCommitsError]
  type BranchName                               = String
  type BranchNameList                           = js.Array[BranchName]
  type CapitalBoolean                           = Boolean
  type ClientRequestToken                       = String
  type CloneUrlHttp                             = String
  type CloneUrlSsh                              = String
  type CommentId                                = String
  type Comments                                 = js.Array[Comment]
  type CommentsForComparedCommitData            = js.Array[CommentsForComparedCommit]
  type CommentsForPullRequestData               = js.Array[CommentsForPullRequest]
  type CommitId                                 = String
  type CommitIdsInputList                       = js.Array[ObjectId]
  type CommitName                               = String
  type CommitObjectsList                        = js.Array[Commit]
  type ConflictMetadataList                     = js.Array[ConflictMetadata]
  type Conflicts                                = js.Array[Conflict]
  type Content                                  = String
  type CreationDate                             = js.Date
  type Date                                     = String
  type DeleteFileEntries                        = js.Array[DeleteFileEntry]
  type Description                              = String
  type DifferenceList                           = js.Array[Difference]
  type Email                                    = String
  type ErrorCode                                = String
  type ErrorMessage                             = String
  type EventDate                                = js.Date
  type ExceptionName                            = String
  type FileContent                              = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type FileList                                 = js.Array[File]
  type FilePaths                                = js.Array[Path]
  type FileSize                                 = Double
  type FilesMetadata                            = js.Array[FileMetadata]
  type FolderList                               = js.Array[Folder]
  type HunkContent                              = String
  type IsCommentDeleted                         = Boolean
  type IsContentConflict                        = Boolean
  type IsFileModeConflict                       = Boolean
  type IsHunkConflict                           = Boolean
  type IsMergeable                              = Boolean
  type IsMerged                                 = Boolean
  type IsMove                                   = Boolean
  type IsObjectTypeConflict                     = Boolean
  type KeepEmptyFolders                         = Boolean
  type LastModifiedDate                         = js.Date
  type Limit                                    = Int
  type LineNumber                               = Int
  type MaxResults                               = Int
  type MergeHunks                               = js.Array[MergeHunk]
  type MergeOptions                             = js.Array[MergeOptionTypeEnum]
  type Message                                  = String
  type Mode                                     = String
  type Name                                     = String
  type NextToken                                = String
  type NumberOfConflicts                        = Int
  type ObjectId                                 = String
  type ObjectSize                               = Double
  type Overridden                               = Boolean
  type ParentList                               = js.Array[ObjectId]
  type Path                                     = String
  type Position                                 = Double
  type PullRequestEventList                     = js.Array[PullRequestEvent]
  type PullRequestId                            = String
  type PullRequestIdList                        = js.Array[PullRequestId]
  type PullRequestTargetList                    = js.Array[PullRequestTarget]
  type PutFileEntries                           = js.Array[PutFileEntry]
  type ReferenceName                            = String
  type ReplaceContentEntries                    = js.Array[ReplaceContentEntry]
  type RepositoryDescription                    = String
  type RepositoryId                             = String
  type RepositoryMetadataList                   = js.Array[RepositoryMetadata]
  type RepositoryName                           = String
  type RepositoryNameIdPairList                 = js.Array[RepositoryNameIdPair]
  type RepositoryNameList                       = js.Array[RepositoryName]
  type RepositoryNotFoundList                   = js.Array[RepositoryName]
  type RepositoryTriggerCustomData              = String
  type RepositoryTriggerEventList               = js.Array[RepositoryTriggerEventEnum]
  type RepositoryTriggerExecutionFailureList    = js.Array[RepositoryTriggerExecutionFailure]
  type RepositoryTriggerExecutionFailureMessage = String
  type RepositoryTriggerName                    = String
  type RepositoryTriggerNameList                = js.Array[RepositoryTriggerName]
  type RepositoryTriggersConfigurationId        = String
  type RepositoryTriggersList                   = js.Array[RepositoryTrigger]
  type ResourceArn                              = String
  type RevisionId                               = String
  type RuleContentSha256                        = String
  type SetFileModeEntries                       = js.Array[SetFileModeEntry]
  type SubModuleList                            = js.Array[SubModule]
  type SymbolicLinkList                         = js.Array[SymbolicLink]
  type TagKey                                   = String
  type TagKeysList                              = js.Array[TagKey]
  type TagValue                                 = String
  type TagsMap                                  = js.Dictionary[TagValue]
  type TargetList                               = js.Array[Target]
  type Title                                    = String
  type blob                                     = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String

  implicit final class CodeCommitOps(private val service: CodeCommit) extends AnyVal {

    @inline def associateApprovalRuleTemplateWithRepositoryFuture(
        params: AssociateApprovalRuleTemplateWithRepositoryInput
    ): Future[js.Object] = service.associateApprovalRuleTemplateWithRepository(params).promise().toFuture
    @inline def batchAssociateApprovalRuleTemplateWithRepositoriesFuture(
        params: BatchAssociateApprovalRuleTemplateWithRepositoriesInput
    ): Future[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput] =
      service.batchAssociateApprovalRuleTemplateWithRepositories(params).promise().toFuture
    @inline def batchDescribeMergeConflictsFuture(
        params: BatchDescribeMergeConflictsInput
    ): Future[BatchDescribeMergeConflictsOutput] = service.batchDescribeMergeConflicts(params).promise().toFuture
    @inline def batchDisassociateApprovalRuleTemplateFromRepositoriesFuture(
        params: BatchDisassociateApprovalRuleTemplateFromRepositoriesInput
    ): Future[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput] =
      service.batchDisassociateApprovalRuleTemplateFromRepositories(params).promise().toFuture
    @inline def batchGetCommitsFuture(params: BatchGetCommitsInput): Future[BatchGetCommitsOutput] =
      service.batchGetCommits(params).promise().toFuture
    @inline def batchGetRepositoriesFuture(params: BatchGetRepositoriesInput): Future[BatchGetRepositoriesOutput] =
      service.batchGetRepositories(params).promise().toFuture
    @inline def createApprovalRuleTemplateFuture(
        params: CreateApprovalRuleTemplateInput
    ): Future[CreateApprovalRuleTemplateOutput] = service.createApprovalRuleTemplate(params).promise().toFuture
    @inline def createBranchFuture(params: CreateBranchInput): Future[js.Object] =
      service.createBranch(params).promise().toFuture
    @inline def createCommitFuture(params: CreateCommitInput): Future[CreateCommitOutput] =
      service.createCommit(params).promise().toFuture
    @inline def createPullRequestApprovalRuleFuture(
        params: CreatePullRequestApprovalRuleInput
    ): Future[CreatePullRequestApprovalRuleOutput] = service.createPullRequestApprovalRule(params).promise().toFuture
    @inline def createPullRequestFuture(params: CreatePullRequestInput): Future[CreatePullRequestOutput] =
      service.createPullRequest(params).promise().toFuture
    @inline def createRepositoryFuture(params: CreateRepositoryInput): Future[CreateRepositoryOutput] =
      service.createRepository(params).promise().toFuture
    @inline def createUnreferencedMergeCommitFuture(
        params: CreateUnreferencedMergeCommitInput
    ): Future[CreateUnreferencedMergeCommitOutput] = service.createUnreferencedMergeCommit(params).promise().toFuture
    @inline def deleteApprovalRuleTemplateFuture(
        params: DeleteApprovalRuleTemplateInput
    ): Future[DeleteApprovalRuleTemplateOutput] = service.deleteApprovalRuleTemplate(params).promise().toFuture
    @inline def deleteBranchFuture(params: DeleteBranchInput): Future[DeleteBranchOutput] =
      service.deleteBranch(params).promise().toFuture
    @inline def deleteCommentContentFuture(params: DeleteCommentContentInput): Future[DeleteCommentContentOutput] =
      service.deleteCommentContent(params).promise().toFuture
    @inline def deleteFileFuture(params: DeleteFileInput): Future[DeleteFileOutput] =
      service.deleteFile(params).promise().toFuture
    @inline def deletePullRequestApprovalRuleFuture(
        params: DeletePullRequestApprovalRuleInput
    ): Future[DeletePullRequestApprovalRuleOutput] = service.deletePullRequestApprovalRule(params).promise().toFuture
    @inline def deleteRepositoryFuture(params: DeleteRepositoryInput): Future[DeleteRepositoryOutput] =
      service.deleteRepository(params).promise().toFuture
    @inline def describeMergeConflictsFuture(
        params: DescribeMergeConflictsInput
    ): Future[DescribeMergeConflictsOutput] = service.describeMergeConflicts(params).promise().toFuture
    @inline def describePullRequestEventsFuture(
        params: DescribePullRequestEventsInput
    ): Future[DescribePullRequestEventsOutput] = service.describePullRequestEvents(params).promise().toFuture
    @inline def disassociateApprovalRuleTemplateFromRepositoryFuture(
        params: DisassociateApprovalRuleTemplateFromRepositoryInput
    ): Future[js.Object] = service.disassociateApprovalRuleTemplateFromRepository(params).promise().toFuture
    @inline def evaluatePullRequestApprovalRulesFuture(
        params: EvaluatePullRequestApprovalRulesInput
    ): Future[EvaluatePullRequestApprovalRulesOutput] =
      service.evaluatePullRequestApprovalRules(params).promise().toFuture
    @inline def getApprovalRuleTemplateFuture(
        params: GetApprovalRuleTemplateInput
    ): Future[GetApprovalRuleTemplateOutput]                               = service.getApprovalRuleTemplate(params).promise().toFuture
    @inline def getBlobFuture(params: GetBlobInput): Future[GetBlobOutput] = service.getBlob(params).promise().toFuture
    @inline def getBranchFuture(params: GetBranchInput): Future[GetBranchOutput] =
      service.getBranch(params).promise().toFuture
    @inline def getCommentFuture(params: GetCommentInput): Future[GetCommentOutput] =
      service.getComment(params).promise().toFuture
    @inline def getCommentsForComparedCommitFuture(
        params: GetCommentsForComparedCommitInput
    ): Future[GetCommentsForComparedCommitOutput] = service.getCommentsForComparedCommit(params).promise().toFuture
    @inline def getCommentsForPullRequestFuture(
        params: GetCommentsForPullRequestInput
    ): Future[GetCommentsForPullRequestOutput] = service.getCommentsForPullRequest(params).promise().toFuture
    @inline def getCommitFuture(params: GetCommitInput): Future[GetCommitOutput] =
      service.getCommit(params).promise().toFuture
    @inline def getDifferencesFuture(params: GetDifferencesInput): Future[GetDifferencesOutput] =
      service.getDifferences(params).promise().toFuture
    @inline def getFileFuture(params: GetFileInput): Future[GetFileOutput] = service.getFile(params).promise().toFuture
    @inline def getFolderFuture(params: GetFolderInput): Future[GetFolderOutput] =
      service.getFolder(params).promise().toFuture
    @inline def getMergeCommitFuture(params: GetMergeCommitInput): Future[GetMergeCommitOutput] =
      service.getMergeCommit(params).promise().toFuture
    @inline def getMergeConflictsFuture(params: GetMergeConflictsInput): Future[GetMergeConflictsOutput] =
      service.getMergeConflicts(params).promise().toFuture
    @inline def getMergeOptionsFuture(params: GetMergeOptionsInput): Future[GetMergeOptionsOutput] =
      service.getMergeOptions(params).promise().toFuture
    @inline def getPullRequestApprovalStatesFuture(
        params: GetPullRequestApprovalStatesInput
    ): Future[GetPullRequestApprovalStatesOutput] = service.getPullRequestApprovalStates(params).promise().toFuture
    @inline def getPullRequestFuture(params: GetPullRequestInput): Future[GetPullRequestOutput] =
      service.getPullRequest(params).promise().toFuture
    @inline def getPullRequestOverrideStateFuture(
        params: GetPullRequestOverrideStateInput
    ): Future[GetPullRequestOverrideStateOutput] = service.getPullRequestOverrideState(params).promise().toFuture
    @inline def getRepositoryFuture(params: GetRepositoryInput): Future[GetRepositoryOutput] =
      service.getRepository(params).promise().toFuture
    @inline def getRepositoryTriggersFuture(params: GetRepositoryTriggersInput): Future[GetRepositoryTriggersOutput] =
      service.getRepositoryTriggers(params).promise().toFuture
    @inline def listApprovalRuleTemplatesFuture(
        params: ListApprovalRuleTemplatesInput
    ): Future[ListApprovalRuleTemplatesOutput] = service.listApprovalRuleTemplates(params).promise().toFuture
    @inline def listAssociatedApprovalRuleTemplatesForRepositoryFuture(
        params: ListAssociatedApprovalRuleTemplatesForRepositoryInput
    ): Future[ListAssociatedApprovalRuleTemplatesForRepositoryOutput] =
      service.listAssociatedApprovalRuleTemplatesForRepository(params).promise().toFuture
    @inline def listBranchesFuture(params: ListBranchesInput): Future[ListBranchesOutput] =
      service.listBranches(params).promise().toFuture
    @inline def listPullRequestsFuture(params: ListPullRequestsInput): Future[ListPullRequestsOutput] =
      service.listPullRequests(params).promise().toFuture
    @inline def listRepositoriesForApprovalRuleTemplateFuture(
        params: ListRepositoriesForApprovalRuleTemplateInput
    ): Future[ListRepositoriesForApprovalRuleTemplateOutput] =
      service.listRepositoriesForApprovalRuleTemplate(params).promise().toFuture
    @inline def listRepositoriesFuture(params: ListRepositoriesInput): Future[ListRepositoriesOutput] =
      service.listRepositories(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def mergeBranchesByFastForwardFuture(
        params: MergeBranchesByFastForwardInput
    ): Future[MergeBranchesByFastForwardOutput] = service.mergeBranchesByFastForward(params).promise().toFuture
    @inline def mergeBranchesBySquashFuture(params: MergeBranchesBySquashInput): Future[MergeBranchesBySquashOutput] =
      service.mergeBranchesBySquash(params).promise().toFuture
    @inline def mergeBranchesByThreeWayFuture(
        params: MergeBranchesByThreeWayInput
    ): Future[MergeBranchesByThreeWayOutput] = service.mergeBranchesByThreeWay(params).promise().toFuture
    @inline def mergePullRequestByFastForwardFuture(
        params: MergePullRequestByFastForwardInput
    ): Future[MergePullRequestByFastForwardOutput] = service.mergePullRequestByFastForward(params).promise().toFuture
    @inline def mergePullRequestBySquashFuture(
        params: MergePullRequestBySquashInput
    ): Future[MergePullRequestBySquashOutput] = service.mergePullRequestBySquash(params).promise().toFuture
    @inline def mergePullRequestByThreeWayFuture(
        params: MergePullRequestByThreeWayInput
    ): Future[MergePullRequestByThreeWayOutput] = service.mergePullRequestByThreeWay(params).promise().toFuture
    @inline def overridePullRequestApprovalRulesFuture(
        params: OverridePullRequestApprovalRulesInput
    ): Future[js.Object] = service.overridePullRequestApprovalRules(params).promise().toFuture
    @inline def postCommentForComparedCommitFuture(
        params: PostCommentForComparedCommitInput
    ): Future[PostCommentForComparedCommitOutput] = service.postCommentForComparedCommit(params).promise().toFuture
    @inline def postCommentForPullRequestFuture(
        params: PostCommentForPullRequestInput
    ): Future[PostCommentForPullRequestOutput] = service.postCommentForPullRequest(params).promise().toFuture
    @inline def postCommentReplyFuture(params: PostCommentReplyInput): Future[PostCommentReplyOutput] =
      service.postCommentReply(params).promise().toFuture
    @inline def putFileFuture(params: PutFileInput): Future[PutFileOutput] = service.putFile(params).promise().toFuture
    @inline def putRepositoryTriggersFuture(params: PutRepositoryTriggersInput): Future[PutRepositoryTriggersOutput] =
      service.putRepositoryTriggers(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def testRepositoryTriggersFuture(
        params: TestRepositoryTriggersInput
    ): Future[TestRepositoryTriggersOutput] = service.testRepositoryTriggers(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateApprovalRuleTemplateContentFuture(
        params: UpdateApprovalRuleTemplateContentInput
    ): Future[UpdateApprovalRuleTemplateContentOutput] =
      service.updateApprovalRuleTemplateContent(params).promise().toFuture
    @inline def updateApprovalRuleTemplateDescriptionFuture(
        params: UpdateApprovalRuleTemplateDescriptionInput
    ): Future[UpdateApprovalRuleTemplateDescriptionOutput] =
      service.updateApprovalRuleTemplateDescription(params).promise().toFuture
    @inline def updateApprovalRuleTemplateNameFuture(
        params: UpdateApprovalRuleTemplateNameInput
    ): Future[UpdateApprovalRuleTemplateNameOutput] = service.updateApprovalRuleTemplateName(params).promise().toFuture
    @inline def updateCommentFuture(params: UpdateCommentInput): Future[UpdateCommentOutput] =
      service.updateComment(params).promise().toFuture
    @inline def updateDefaultBranchFuture(params: UpdateDefaultBranchInput): Future[js.Object] =
      service.updateDefaultBranch(params).promise().toFuture
    @inline def updatePullRequestApprovalRuleContentFuture(
        params: UpdatePullRequestApprovalRuleContentInput
    ): Future[UpdatePullRequestApprovalRuleContentOutput] =
      service.updatePullRequestApprovalRuleContent(params).promise().toFuture
    @inline def updatePullRequestApprovalStateFuture(params: UpdatePullRequestApprovalStateInput): Future[js.Object] =
      service.updatePullRequestApprovalState(params).promise().toFuture
    @inline def updatePullRequestDescriptionFuture(
        params: UpdatePullRequestDescriptionInput
    ): Future[UpdatePullRequestDescriptionOutput] = service.updatePullRequestDescription(params).promise().toFuture
    @inline def updatePullRequestStatusFuture(
        params: UpdatePullRequestStatusInput
    ): Future[UpdatePullRequestStatusOutput] = service.updatePullRequestStatus(params).promise().toFuture
    @inline def updatePullRequestTitleFuture(
        params: UpdatePullRequestTitleInput
    ): Future[UpdatePullRequestTitleOutput] = service.updatePullRequestTitle(params).promise().toFuture
    @inline def updateRepositoryDescriptionFuture(params: UpdateRepositoryDescriptionInput): Future[js.Object] =
      service.updateRepositoryDescription(params).promise().toFuture
    @inline def updateRepositoryNameFuture(params: UpdateRepositoryNameInput): Future[js.Object] =
      service.updateRepositoryName(params).promise().toFuture
  }
}

package codecommit {
  @js.native
  @JSImport("aws-sdk", "CodeCommit")
  class CodeCommit() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateApprovalRuleTemplateWithRepository(
        params: AssociateApprovalRuleTemplateWithRepositoryInput
    ): Request[js.Object] = js.native
    def batchAssociateApprovalRuleTemplateWithRepositories(
        params: BatchAssociateApprovalRuleTemplateWithRepositoriesInput
    ): Request[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput] = js.native
    def batchDescribeMergeConflicts(
        params: BatchDescribeMergeConflictsInput
    ): Request[BatchDescribeMergeConflictsOutput] = js.native
    def batchDisassociateApprovalRuleTemplateFromRepositories(
        params: BatchDisassociateApprovalRuleTemplateFromRepositoriesInput
    ): Request[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput]                          = js.native
    def batchGetCommits(params: BatchGetCommitsInput): Request[BatchGetCommitsOutput]                = js.native
    def batchGetRepositories(params: BatchGetRepositoriesInput): Request[BatchGetRepositoriesOutput] = js.native
    def createApprovalRuleTemplate(params: CreateApprovalRuleTemplateInput): Request[CreateApprovalRuleTemplateOutput] =
      js.native
    def createBranch(params: CreateBranchInput): Request[js.Object]                         = js.native
    def createCommit(params: CreateCommitInput): Request[CreateCommitOutput]                = js.native
    def createPullRequest(params: CreatePullRequestInput): Request[CreatePullRequestOutput] = js.native
    def createPullRequestApprovalRule(
        params: CreatePullRequestApprovalRuleInput
    ): Request[CreatePullRequestApprovalRuleOutput]                                      = js.native
    def createRepository(params: CreateRepositoryInput): Request[CreateRepositoryOutput] = js.native
    def createUnreferencedMergeCommit(
        params: CreateUnreferencedMergeCommitInput
    ): Request[CreateUnreferencedMergeCommitOutput] = js.native
    def deleteApprovalRuleTemplate(params: DeleteApprovalRuleTemplateInput): Request[DeleteApprovalRuleTemplateOutput] =
      js.native
    def deleteBranch(params: DeleteBranchInput): Request[DeleteBranchOutput]                         = js.native
    def deleteCommentContent(params: DeleteCommentContentInput): Request[DeleteCommentContentOutput] = js.native
    def deleteFile(params: DeleteFileInput): Request[DeleteFileOutput]                               = js.native
    def deletePullRequestApprovalRule(
        params: DeletePullRequestApprovalRuleInput
    ): Request[DeletePullRequestApprovalRuleOutput]                                                        = js.native
    def deleteRepository(params: DeleteRepositoryInput): Request[DeleteRepositoryOutput]                   = js.native
    def describeMergeConflicts(params: DescribeMergeConflictsInput): Request[DescribeMergeConflictsOutput] = js.native
    def describePullRequestEvents(params: DescribePullRequestEventsInput): Request[DescribePullRequestEventsOutput] =
      js.native
    def disassociateApprovalRuleTemplateFromRepository(
        params: DisassociateApprovalRuleTemplateFromRepositoryInput
    ): Request[js.Object] = js.native
    def evaluatePullRequestApprovalRules(
        params: EvaluatePullRequestApprovalRulesInput
    ): Request[EvaluatePullRequestApprovalRulesOutput] = js.native
    def getApprovalRuleTemplate(params: GetApprovalRuleTemplateInput): Request[GetApprovalRuleTemplateOutput] =
      js.native
    def getBlob(params: GetBlobInput): Request[GetBlobOutput]          = js.native
    def getBranch(params: GetBranchInput): Request[GetBranchOutput]    = js.native
    def getComment(params: GetCommentInput): Request[GetCommentOutput] = js.native
    def getCommentsForComparedCommit(
        params: GetCommentsForComparedCommitInput
    ): Request[GetCommentsForComparedCommitOutput] = js.native
    def getCommentsForPullRequest(params: GetCommentsForPullRequestInput): Request[GetCommentsForPullRequestOutput] =
      js.native
    def getCommit(params: GetCommitInput): Request[GetCommitOutput]                         = js.native
    def getDifferences(params: GetDifferencesInput): Request[GetDifferencesOutput]          = js.native
    def getFile(params: GetFileInput): Request[GetFileOutput]                               = js.native
    def getFolder(params: GetFolderInput): Request[GetFolderOutput]                         = js.native
    def getMergeCommit(params: GetMergeCommitInput): Request[GetMergeCommitOutput]          = js.native
    def getMergeConflicts(params: GetMergeConflictsInput): Request[GetMergeConflictsOutput] = js.native
    def getMergeOptions(params: GetMergeOptionsInput): Request[GetMergeOptionsOutput]       = js.native
    def getPullRequest(params: GetPullRequestInput): Request[GetPullRequestOutput]          = js.native
    def getPullRequestApprovalStates(
        params: GetPullRequestApprovalStatesInput
    ): Request[GetPullRequestApprovalStatesOutput] = js.native
    def getPullRequestOverrideState(
        params: GetPullRequestOverrideStateInput
    ): Request[GetPullRequestOverrideStateOutput]                                                       = js.native
    def getRepository(params: GetRepositoryInput): Request[GetRepositoryOutput]                         = js.native
    def getRepositoryTriggers(params: GetRepositoryTriggersInput): Request[GetRepositoryTriggersOutput] = js.native
    def listApprovalRuleTemplates(params: ListApprovalRuleTemplatesInput): Request[ListApprovalRuleTemplatesOutput] =
      js.native
    def listAssociatedApprovalRuleTemplatesForRepository(
        params: ListAssociatedApprovalRuleTemplatesForRepositoryInput
    ): Request[ListAssociatedApprovalRuleTemplatesForRepositoryOutput]                   = js.native
    def listBranches(params: ListBranchesInput): Request[ListBranchesOutput]             = js.native
    def listPullRequests(params: ListPullRequestsInput): Request[ListPullRequestsOutput] = js.native
    def listRepositories(params: ListRepositoriesInput): Request[ListRepositoriesOutput] = js.native
    def listRepositoriesForApprovalRuleTemplate(
        params: ListRepositoriesForApprovalRuleTemplateInput
    ): Request[ListRepositoriesForApprovalRuleTemplateOutput]                                     = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def mergeBranchesByFastForward(params: MergeBranchesByFastForwardInput): Request[MergeBranchesByFastForwardOutput] =
      js.native
    def mergeBranchesBySquash(params: MergeBranchesBySquashInput): Request[MergeBranchesBySquashOutput] = js.native
    def mergeBranchesByThreeWay(params: MergeBranchesByThreeWayInput): Request[MergeBranchesByThreeWayOutput] =
      js.native
    def mergePullRequestByFastForward(
        params: MergePullRequestByFastForwardInput
    ): Request[MergePullRequestByFastForwardOutput] = js.native
    def mergePullRequestBySquash(params: MergePullRequestBySquashInput): Request[MergePullRequestBySquashOutput] =
      js.native
    def mergePullRequestByThreeWay(params: MergePullRequestByThreeWayInput): Request[MergePullRequestByThreeWayOutput] =
      js.native
    def overridePullRequestApprovalRules(params: OverridePullRequestApprovalRulesInput): Request[js.Object] = js.native
    def postCommentForComparedCommit(
        params: PostCommentForComparedCommitInput
    ): Request[PostCommentForComparedCommitOutput] = js.native
    def postCommentForPullRequest(params: PostCommentForPullRequestInput): Request[PostCommentForPullRequestOutput] =
      js.native
    def postCommentReply(params: PostCommentReplyInput): Request[PostCommentReplyOutput]                   = js.native
    def putFile(params: PutFileInput): Request[PutFileOutput]                                              = js.native
    def putRepositoryTriggers(params: PutRepositoryTriggersInput): Request[PutRepositoryTriggersOutput]    = js.native
    def tagResource(params: TagResourceInput): Request[js.Object]                                          = js.native
    def testRepositoryTriggers(params: TestRepositoryTriggersInput): Request[TestRepositoryTriggersOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[js.Object]                                      = js.native
    def updateApprovalRuleTemplateContent(
        params: UpdateApprovalRuleTemplateContentInput
    ): Request[UpdateApprovalRuleTemplateContentOutput] = js.native
    def updateApprovalRuleTemplateDescription(
        params: UpdateApprovalRuleTemplateDescriptionInput
    ): Request[UpdateApprovalRuleTemplateDescriptionOutput] = js.native
    def updateApprovalRuleTemplateName(
        params: UpdateApprovalRuleTemplateNameInput
    ): Request[UpdateApprovalRuleTemplateNameOutput]                              = js.native
    def updateComment(params: UpdateCommentInput): Request[UpdateCommentOutput]   = js.native
    def updateDefaultBranch(params: UpdateDefaultBranchInput): Request[js.Object] = js.native
    def updatePullRequestApprovalRuleContent(
        params: UpdatePullRequestApprovalRuleContentInput
    ): Request[UpdatePullRequestApprovalRuleContentOutput]                                              = js.native
    def updatePullRequestApprovalState(params: UpdatePullRequestApprovalStateInput): Request[js.Object] = js.native
    def updatePullRequestDescription(
        params: UpdatePullRequestDescriptionInput
    ): Request[UpdatePullRequestDescriptionOutput] = js.native
    def updatePullRequestStatus(params: UpdatePullRequestStatusInput): Request[UpdatePullRequestStatusOutput] =
      js.native
    def updatePullRequestTitle(params: UpdatePullRequestTitleInput): Request[UpdatePullRequestTitleOutput] = js.native
    def updateRepositoryDescription(params: UpdateRepositoryDescriptionInput): Request[js.Object]          = js.native
    def updateRepositoryName(params: UpdateRepositoryNameInput): Request[js.Object]                        = js.native
  }

  /**
    * Returns information about a specific approval on a pull request.
    */
  @js.native
  @Factory
  trait Approval extends js.Object {
    var approvalState: js.UndefOr[ApprovalState]
    var userArn: js.UndefOr[Arn]
  }

  /**
    * Returns information about an approval rule.
    */
  @js.native
  @Factory
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

  /**
    * Returns information about an event for an approval rule.
    */
  @js.native
  @Factory
  trait ApprovalRuleEventMetadata extends js.Object {
    var approvalRuleContent: js.UndefOr[ApprovalRuleContent]
    var approvalRuleId: js.UndefOr[ApprovalRuleId]
    var approvalRuleName: js.UndefOr[ApprovalRuleName]
  }

  /**
    * Returns information about an override event for approval rules for a pull request.
    */
  @js.native
  @Factory
  trait ApprovalRuleOverriddenEventMetadata extends js.Object {
    var overrideStatus: js.UndefOr[OverrideStatus]
    var revisionId: js.UndefOr[RevisionId]
  }

  /**
    * Returns information about an approval rule template.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ApprovalState extends js.Any
  object ApprovalState extends js.Object {
    val APPROVE = "APPROVE".asInstanceOf[ApprovalState]
    val REVOKE  = "REVOKE".asInstanceOf[ApprovalState]

    val values = js.Object.freeze(js.Array(APPROVE, REVOKE))
  }

  /**
    * Returns information about a change in the approval state for a pull request.
    */
  @js.native
  @Factory
  trait ApprovalStateChangedEventMetadata extends js.Object {
    var approvalStatus: js.UndefOr[ApprovalState]
    var revisionId: js.UndefOr[RevisionId]
  }

  @js.native
  @Factory
  trait AssociateApprovalRuleTemplateWithRepositoryInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var repositoryName: RepositoryName
  }

  /**
    * Returns information about errors in a BatchAssociateApprovalRuleTemplateWithRepositories operation.
    */
  @js.native
  @Factory
  trait BatchAssociateApprovalRuleTemplateWithRepositoriesError extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait BatchAssociateApprovalRuleTemplateWithRepositoriesInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var repositoryNames: RepositoryNameList
  }

  @js.native
  @Factory
  trait BatchAssociateApprovalRuleTemplateWithRepositoriesOutput extends js.Object {
    var associatedRepositoryNames: RepositoryNameList
    var errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList
  }

  /**
    * Returns information about errors in a BatchDescribeMergeConflicts operation.
    */
  @js.native
  @Factory
  trait BatchDescribeMergeConflictsError extends js.Object {
    var exceptionName: ExceptionName
    var filePath: Path
    var message: Message
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait BatchDescribeMergeConflictsOutput extends js.Object {
    var conflicts: Conflicts
    var destinationCommitId: ObjectId
    var sourceCommitId: ObjectId
    var baseCommitId: js.UndefOr[ObjectId]
    var errors: js.UndefOr[BatchDescribeMergeConflictsErrors]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Returns information about errors in a BatchDisassociateApprovalRuleTemplateFromRepositories operation.
    */
  @js.native
  @Factory
  trait BatchDisassociateApprovalRuleTemplateFromRepositoriesError extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait BatchDisassociateApprovalRuleTemplateFromRepositoriesInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var repositoryNames: RepositoryNameList
  }

  @js.native
  @Factory
  trait BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput extends js.Object {
    var disassociatedRepositoryNames: RepositoryNameList
    var errors: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList
  }

  /**
    * Returns information about errors in a BatchGetCommits operation.
    */
  @js.native
  @Factory
  trait BatchGetCommitsError extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  @js.native
  @Factory
  trait BatchGetCommitsInput extends js.Object {
    var commitIds: CommitIdsInputList
    var repositoryName: RepositoryName
  }

  @js.native
  @Factory
  trait BatchGetCommitsOutput extends js.Object {
    var commits: js.UndefOr[CommitObjectsList]
    var errors: js.UndefOr[BatchGetCommitsErrorsList]
  }

  /**
    * Represents the input of a batch get repositories operation.
    */
  @js.native
  @Factory
  trait BatchGetRepositoriesInput extends js.Object {
    var repositoryNames: RepositoryNameList
  }

  /**
    * Represents the output of a batch get repositories operation.
    */
  @js.native
  @Factory
  trait BatchGetRepositoriesOutput extends js.Object {
    var repositories: js.UndefOr[RepositoryMetadataList]
    var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList]
  }

  /**
    * Returns information about a specific Git blob object.
    */
  @js.native
  @Factory
  trait BlobMetadata extends js.Object {
    var blobId: js.UndefOr[ObjectId]
    var mode: js.UndefOr[Mode]
    var path: js.UndefOr[Path]
  }

  /**
    * Returns information about a branch.
    */
  @js.native
  @Factory
  trait BranchInfo extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var commitId: js.UndefOr[CommitId]
  }

  @js.native
  sealed trait ChangeTypeEnum extends js.Any
  object ChangeTypeEnum extends js.Object {
    val A = "A".asInstanceOf[ChangeTypeEnum]
    val M = "M".asInstanceOf[ChangeTypeEnum]
    val D = "D".asInstanceOf[ChangeTypeEnum]

    val values = js.Object.freeze(js.Array(A, M, D))
  }

  /**
    * Returns information about a specific comment.
    */
  @js.native
  @Factory
  trait Comment extends js.Object {
    var authorArn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var commentId: js.UndefOr[CommentId]
    var content: js.UndefOr[Content]
    var creationDate: js.UndefOr[CreationDate]
    var deleted: js.UndefOr[IsCommentDeleted]
    var inReplyTo: js.UndefOr[CommentId]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
  }

  /**
    * Returns information about comments on the comparison between two commits.
    */
  @js.native
  @Factory
  trait CommentsForComparedCommit extends js.Object {
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var beforeCommitId: js.UndefOr[CommitId]
    var comments: js.UndefOr[Comments]
    var location: js.UndefOr[Location]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  /**
    * Returns information about comments on a pull request.
    */
  @js.native
  @Factory
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

  /**
    * Returns information about a specific commit.
    */
  @js.native
  @Factory
  trait Commit extends js.Object {
    var additionalData: js.UndefOr[AdditionalData]
    var author: js.UndefOr[UserInfo]
    var commitId: js.UndefOr[ObjectId]
    var committer: js.UndefOr[UserInfo]
    var message: js.UndefOr[Message]
    var parents: js.UndefOr[ParentList]
    var treeId: js.UndefOr[ObjectId]
  }

  /**
    * Information about conflicts in a merge operation.
    */
  @js.native
  @Factory
  trait Conflict extends js.Object {
    var conflictMetadata: js.UndefOr[ConflictMetadata]
    var mergeHunks: js.UndefOr[MergeHunks]
  }

  @js.native
  sealed trait ConflictDetailLevelTypeEnum extends js.Any
  object ConflictDetailLevelTypeEnum extends js.Object {
    val FILE_LEVEL = "FILE_LEVEL".asInstanceOf[ConflictDetailLevelTypeEnum]
    val LINE_LEVEL = "LINE_LEVEL".asInstanceOf[ConflictDetailLevelTypeEnum]

    val values = js.Object.freeze(js.Array(FILE_LEVEL, LINE_LEVEL))
  }

  /**
    * Information about the metadata for a conflict in a merge operation.
    */
  @js.native
  @Factory
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

  /**
    * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a merge.
    */
  @js.native
  @Factory
  trait ConflictResolution extends js.Object {
    var deleteFiles: js.UndefOr[DeleteFileEntries]
    var replaceContents: js.UndefOr[ReplaceContentEntries]
    var setFileModes: js.UndefOr[SetFileModeEntries]
  }

  @js.native
  sealed trait ConflictResolutionStrategyTypeEnum extends js.Any
  object ConflictResolutionStrategyTypeEnum extends js.Object {
    val NONE               = "NONE".asInstanceOf[ConflictResolutionStrategyTypeEnum]
    val ACCEPT_SOURCE      = "ACCEPT_SOURCE".asInstanceOf[ConflictResolutionStrategyTypeEnum]
    val ACCEPT_DESTINATION = "ACCEPT_DESTINATION".asInstanceOf[ConflictResolutionStrategyTypeEnum]
    val AUTOMERGE          = "AUTOMERGE".asInstanceOf[ConflictResolutionStrategyTypeEnum]

    val values = js.Object.freeze(js.Array(NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE))
  }

  @js.native
  @Factory
  trait CreateApprovalRuleTemplateInput extends js.Object {
    var approvalRuleTemplateContent: ApprovalRuleTemplateContent
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription]
  }

  @js.native
  @Factory
  trait CreateApprovalRuleTemplateOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  /**
    * Represents the input of a create branch operation.
    */
  @js.native
  @Factory
  trait CreateBranchInput extends js.Object {
    var branchName: BranchName
    var commitId: CommitId
    var repositoryName: RepositoryName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateCommitOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var filesAdded: js.UndefOr[FilesMetadata]
    var filesDeleted: js.UndefOr[FilesMetadata]
    var filesUpdated: js.UndefOr[FilesMetadata]
    var treeId: js.UndefOr[ObjectId]
  }

  @js.native
  @Factory
  trait CreatePullRequestApprovalRuleInput extends js.Object {
    var approvalRuleContent: ApprovalRuleContent
    var approvalRuleName: ApprovalRuleName
    var pullRequestId: PullRequestId
  }

  @js.native
  @Factory
  trait CreatePullRequestApprovalRuleOutput extends js.Object {
    var approvalRule: ApprovalRule
  }

  @js.native
  @Factory
  trait CreatePullRequestInput extends js.Object {
    var targets: TargetList
    var title: Title
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var description: js.UndefOr[Description]
  }

  @js.native
  @Factory
  trait CreatePullRequestOutput extends js.Object {
    var pullRequest: PullRequest
  }

  /**
    * Represents the input of a create repository operation.
    */
  @js.native
  @Factory
  trait CreateRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
    var repositoryDescription: js.UndefOr[RepositoryDescription]
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * Represents the output of a create repository operation.
    */
  @js.native
  @Factory
  trait CreateRepositoryOutput extends js.Object {
    var repositoryMetadata: js.UndefOr[RepositoryMetadata]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateUnreferencedMergeCommitOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
  }

  @js.native
  @Factory
  trait DeleteApprovalRuleTemplateInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
  }

  @js.native
  @Factory
  trait DeleteApprovalRuleTemplateOutput extends js.Object {
    var approvalRuleTemplateId: ApprovalRuleTemplateId
  }

  /**
    * Represents the input of a delete branch operation.
    */
  @js.native
  @Factory
  trait DeleteBranchInput extends js.Object {
    var branchName: BranchName
    var repositoryName: RepositoryName
  }

  /**
    * Represents the output of a delete branch operation.
    */
  @js.native
  @Factory
  trait DeleteBranchOutput extends js.Object {
    var deletedBranch: js.UndefOr[BranchInfo]
  }

  @js.native
  @Factory
  trait DeleteCommentContentInput extends js.Object {
    var commentId: CommentId
  }

  @js.native
  @Factory
  trait DeleteCommentContentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  /**
    * A file that is deleted as part of a commit.
    */
  @js.native
  @Factory
  trait DeleteFileEntry extends js.Object {
    var filePath: Path
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DeleteFileOutput extends js.Object {
    var blobId: ObjectId
    var commitId: ObjectId
    var filePath: Path
    var treeId: ObjectId
  }

  @js.native
  @Factory
  trait DeletePullRequestApprovalRuleInput extends js.Object {
    var approvalRuleName: ApprovalRuleName
    var pullRequestId: PullRequestId
  }

  @js.native
  @Factory
  trait DeletePullRequestApprovalRuleOutput extends js.Object {
    var approvalRuleId: ApprovalRuleId
  }

  /**
    * Represents the input of a delete repository operation.
    */
  @js.native
  @Factory
  trait DeleteRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
  }

  /**
    * Represents the output of a delete repository operation.
    */
  @js.native
  @Factory
  trait DeleteRepositoryOutput extends js.Object {
    var repositoryId: js.UndefOr[RepositoryId]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeMergeConflictsOutput extends js.Object {
    var conflictMetadata: ConflictMetadata
    var destinationCommitId: ObjectId
    var mergeHunks: MergeHunks
    var sourceCommitId: ObjectId
    var baseCommitId: js.UndefOr[ObjectId]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribePullRequestEventsInput extends js.Object {
    var pullRequestId: PullRequestId
    var actorArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var pullRequestEventType: js.UndefOr[PullRequestEventType]
  }

  @js.native
  @Factory
  trait DescribePullRequestEventsOutput extends js.Object {
    var pullRequestEvents: PullRequestEventList
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Returns information about a set of differences for a commit specifier.
    */
  @js.native
  @Factory
  trait Difference extends js.Object {
    var afterBlob: js.UndefOr[BlobMetadata]
    var beforeBlob: js.UndefOr[BlobMetadata]
    var changeType: js.UndefOr[ChangeTypeEnum]
  }

  @js.native
  @Factory
  trait DisassociateApprovalRuleTemplateFromRepositoryInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var repositoryName: RepositoryName
  }

  @js.native
  @Factory
  trait EvaluatePullRequestApprovalRulesInput extends js.Object {
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  @js.native
  @Factory
  trait EvaluatePullRequestApprovalRulesOutput extends js.Object {
    var evaluation: Evaluation
  }

  /**
    * Returns information about the approval rules applied to a pull request and whether conditions have been met.
    */
  @js.native
  @Factory
  trait Evaluation extends js.Object {
    var approvalRulesNotSatisfied: js.UndefOr[ApprovalRulesNotSatisfiedList]
    var approvalRulesSatisfied: js.UndefOr[ApprovalRulesSatisfiedList]
    var approved: js.UndefOr[Approved]
    var overridden: js.UndefOr[Overridden]
  }

  /**
    * Returns information about a file in a repository.
    */
  @js.native
  @Factory
  trait File extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var blobId: js.UndefOr[ObjectId]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var relativePath: js.UndefOr[Path]
  }

  /**
    * A file to be added, updated, or deleted as part of a commit.
    */
  @js.native
  @Factory
  trait FileMetadata extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var blobId: js.UndefOr[ObjectId]
    var fileMode: js.UndefOr[FileModeTypeEnum]
  }

  @js.native
  sealed trait FileModeTypeEnum extends js.Any
  object FileModeTypeEnum extends js.Object {
    val EXECUTABLE = "EXECUTABLE".asInstanceOf[FileModeTypeEnum]
    val NORMAL     = "NORMAL".asInstanceOf[FileModeTypeEnum]
    val SYMLINK    = "SYMLINK".asInstanceOf[FileModeTypeEnum]

    val values = js.Object.freeze(js.Array(EXECUTABLE, NORMAL, SYMLINK))
  }

  /**
    * Information about file modes in a merge or pull request.
    */
  @js.native
  @Factory
  trait FileModes extends js.Object {
    var base: js.UndefOr[FileModeTypeEnum]
    var destination: js.UndefOr[FileModeTypeEnum]
    var source: js.UndefOr[FileModeTypeEnum]
  }

  /**
    * Information about the size of files in a merge or pull request.
    */
  @js.native
  @Factory
  trait FileSizes extends js.Object {
    var base: js.UndefOr[FileSize]
    var destination: js.UndefOr[FileSize]
    var source: js.UndefOr[FileSize]
  }

  /**
    * Returns information about a folder in a repository.
    */
  @js.native
  @Factory
  trait Folder extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var relativePath: js.UndefOr[Path]
    var treeId: js.UndefOr[ObjectId]
  }

  @js.native
  @Factory
  trait GetApprovalRuleTemplateInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
  }

  @js.native
  @Factory
  trait GetApprovalRuleTemplateOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  /**
    * Represents the input of a get blob operation.
    */
  @js.native
  @Factory
  trait GetBlobInput extends js.Object {
    var blobId: ObjectId
    var repositoryName: RepositoryName
  }

  /**
    * Represents the output of a get blob operation.
    */
  @js.native
  @Factory
  trait GetBlobOutput extends js.Object {
    var content: blob
  }

  /**
    * Represents the input of a get branch operation.
    */
  @js.native
  @Factory
  trait GetBranchInput extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  /**
    * Represents the output of a get branch operation.
    */
  @js.native
  @Factory
  trait GetBranchOutput extends js.Object {
    var branch: js.UndefOr[BranchInfo]
  }

  @js.native
  @Factory
  trait GetCommentInput extends js.Object {
    var commentId: CommentId
  }

  @js.native
  @Factory
  trait GetCommentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  @js.native
  @Factory
  trait GetCommentsForComparedCommitInput extends js.Object {
    var afterCommitId: CommitId
    var repositoryName: RepositoryName
    var beforeCommitId: js.UndefOr[CommitId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetCommentsForComparedCommitOutput extends js.Object {
    var commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetCommentsForPullRequestInput extends js.Object {
    var pullRequestId: PullRequestId
    var afterCommitId: js.UndefOr[CommitId]
    var beforeCommitId: js.UndefOr[CommitId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait GetCommentsForPullRequestOutput extends js.Object {
    var commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the input of a get commit operation.
    */
  @js.native
  @Factory
  trait GetCommitInput extends js.Object {
    var commitId: ObjectId
    var repositoryName: RepositoryName
  }

  /**
    * Represents the output of a get commit operation.
    */
  @js.native
  @Factory
  trait GetCommitOutput extends js.Object {
    var commit: Commit
  }

  @js.native
  @Factory
  trait GetDifferencesInput extends js.Object {
    var afterCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var afterPath: js.UndefOr[Path]
    var beforeCommitSpecifier: js.UndefOr[CommitName]
    var beforePath: js.UndefOr[Path]
  }

  @js.native
  @Factory
  trait GetDifferencesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var differences: js.UndefOr[DifferenceList]
  }

  @js.native
  @Factory
  trait GetFileInput extends js.Object {
    var filePath: Path
    var repositoryName: RepositoryName
    var commitSpecifier: js.UndefOr[CommitName]
  }

  @js.native
  @Factory
  trait GetFileOutput extends js.Object {
    var blobId: ObjectId
    var commitId: ObjectId
    var fileContent: FileContent
    var fileMode: FileModeTypeEnum
    var filePath: Path
    var fileSize: ObjectSize
  }

  @js.native
  @Factory
  trait GetFolderInput extends js.Object {
    var folderPath: Path
    var repositoryName: RepositoryName
    var commitSpecifier: js.UndefOr[CommitName]
  }

  @js.native
  @Factory
  trait GetFolderOutput extends js.Object {
    var commitId: ObjectId
    var folderPath: Path
    var files: js.UndefOr[FileList]
    var subFolders: js.UndefOr[FolderList]
    var subModules: js.UndefOr[SubModuleList]
    var symbolicLinks: js.UndefOr[SymbolicLinkList]
    var treeId: js.UndefOr[ObjectId]
  }

  @js.native
  @Factory
  trait GetMergeCommitInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
  }

  @js.native
  @Factory
  trait GetMergeCommitOutput extends js.Object {
    var baseCommitId: js.UndefOr[ObjectId]
    var destinationCommitId: js.UndefOr[ObjectId]
    var mergedCommitId: js.UndefOr[ObjectId]
    var sourceCommitId: js.UndefOr[ObjectId]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetMergeConflictsOutput extends js.Object {
    var conflictMetadataList: ConflictMetadataList
    var destinationCommitId: ObjectId
    var mergeable: IsMergeable
    var sourceCommitId: ObjectId
    var baseCommitId: js.UndefOr[ObjectId]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetMergeOptionsInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum]
    var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum]
  }

  @js.native
  @Factory
  trait GetMergeOptionsOutput extends js.Object {
    var baseCommitId: ObjectId
    var destinationCommitId: ObjectId
    var mergeOptions: MergeOptions
    var sourceCommitId: ObjectId
  }

  @js.native
  @Factory
  trait GetPullRequestApprovalStatesInput extends js.Object {
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  @js.native
  @Factory
  trait GetPullRequestApprovalStatesOutput extends js.Object {
    var approvals: js.UndefOr[ApprovalList]
  }

  @js.native
  @Factory
  trait GetPullRequestInput extends js.Object {
    var pullRequestId: PullRequestId
  }

  @js.native
  @Factory
  trait GetPullRequestOutput extends js.Object {
    var pullRequest: PullRequest
  }

  @js.native
  @Factory
  trait GetPullRequestOverrideStateInput extends js.Object {
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  @js.native
  @Factory
  trait GetPullRequestOverrideStateOutput extends js.Object {
    var overridden: js.UndefOr[Overridden]
    var overrider: js.UndefOr[Arn]
  }

  /**
    * Represents the input of a get repository operation.
    */
  @js.native
  @Factory
  trait GetRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
  }

  /**
    * Represents the output of a get repository operation.
    */
  @js.native
  @Factory
  trait GetRepositoryOutput extends js.Object {
    var repositoryMetadata: js.UndefOr[RepositoryMetadata]
  }

  /**
    * Represents the input of a get repository triggers operation.
    */
  @js.native
  @Factory
  trait GetRepositoryTriggersInput extends js.Object {
    var repositoryName: RepositoryName
  }

  /**
    * Represents the output of a get repository triggers operation.
    */
  @js.native
  @Factory
  trait GetRepositoryTriggersOutput extends js.Object {
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId]
    var triggers: js.UndefOr[RepositoryTriggersList]
  }

  /**
    * Information about whether a file is binary or textual in a merge or pull request operation.
    */
  @js.native
  @Factory
  trait IsBinaryFile extends js.Object {
    var base: js.UndefOr[CapitalBoolean]
    var destination: js.UndefOr[CapitalBoolean]
    var source: js.UndefOr[CapitalBoolean]
  }

  @js.native
  @Factory
  trait ListApprovalRuleTemplatesInput extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListApprovalRuleTemplatesOutput extends js.Object {
    var approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAssociatedApprovalRuleTemplatesForRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAssociatedApprovalRuleTemplatesForRepositoryOutput extends js.Object {
    var approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the input of a list branches operation.
    */
  @js.native
  @Factory
  trait ListBranchesInput extends js.Object {
    var repositoryName: RepositoryName
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a list branches operation.
    */
  @js.native
  @Factory
  trait ListBranchesOutput extends js.Object {
    var branches: js.UndefOr[BranchNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPullRequestsInput extends js.Object {
    var repositoryName: RepositoryName
    var authorArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
  }

  @js.native
  @Factory
  trait ListPullRequestsOutput extends js.Object {
    var pullRequestIds: PullRequestIdList
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListRepositoriesForApprovalRuleTemplateInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListRepositoriesForApprovalRuleTemplateOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var repositoryNames: js.UndefOr[RepositoryNameList]
  }

  /**
    * Represents the input of a list repositories operation.
    */
  @js.native
  @Factory
  trait ListRepositoriesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var order: js.UndefOr[OrderEnum]
    var sortBy: js.UndefOr[SortByEnum]
  }

  /**
    * Represents the output of a list repositories operation.
    */
  @js.native
  @Factory
  trait ListRepositoriesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var repositories: js.UndefOr[RepositoryNameIdPairList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * Returns information about the location of a change or comment in the comparison between two commits or a pull request.
    */
  @js.native
  @Factory
  trait Location extends js.Object {
    var filePath: js.UndefOr[Path]
    var filePosition: js.UndefOr[Position]
    var relativeFileVersion: js.UndefOr[RelativeFileVersionEnum]
  }

  @js.native
  @Factory
  trait MergeBranchesByFastForwardInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
    var targetBranch: js.UndefOr[BranchName]
  }

  @js.native
  @Factory
  trait MergeBranchesByFastForwardOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait MergeBranchesBySquashOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait MergeBranchesByThreeWayOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
  }

  /**
    * Information about merge hunks in a merge or pull request operation.
    */
  @js.native
  @Factory
  trait MergeHunk extends js.Object {
    var base: js.UndefOr[MergeHunkDetail]
    var destination: js.UndefOr[MergeHunkDetail]
    var isConflict: js.UndefOr[IsHunkConflict]
    var source: js.UndefOr[MergeHunkDetail]
  }

  /**
    * Information about the details of a merge hunk that contains a conflict in a merge or pull request operation.
    */
  @js.native
  @Factory
  trait MergeHunkDetail extends js.Object {
    var endLine: js.UndefOr[LineNumber]
    var hunkContent: js.UndefOr[HunkContent]
    var startLine: js.UndefOr[LineNumber]
  }

  /**
    * Returns information about a merge or potential merge between a source reference and a destination reference in a pull request.
    */
  @js.native
  @Factory
  trait MergeMetadata extends js.Object {
    var isMerged: js.UndefOr[IsMerged]
    var mergeCommitId: js.UndefOr[CommitId]
    var mergeOption: js.UndefOr[MergeOptionTypeEnum]
    var mergedBy: js.UndefOr[Arn]
  }

  /**
    * Information about the file operation conflicts in a merge operation.
    */
  @js.native
  @Factory
  trait MergeOperations extends js.Object {
    var destination: js.UndefOr[ChangeTypeEnum]
    var source: js.UndefOr[ChangeTypeEnum]
  }

  @js.native
  sealed trait MergeOptionTypeEnum extends js.Any
  object MergeOptionTypeEnum extends js.Object {
    val FAST_FORWARD_MERGE = "FAST_FORWARD_MERGE".asInstanceOf[MergeOptionTypeEnum]
    val SQUASH_MERGE       = "SQUASH_MERGE".asInstanceOf[MergeOptionTypeEnum]
    val THREE_WAY_MERGE    = "THREE_WAY_MERGE".asInstanceOf[MergeOptionTypeEnum]

    val values = js.Object.freeze(js.Array(FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE))
  }

  @js.native
  @Factory
  trait MergePullRequestByFastForwardInput extends js.Object {
    var pullRequestId: PullRequestId
    var repositoryName: RepositoryName
    var sourceCommitId: js.UndefOr[ObjectId]
  }

  @js.native
  @Factory
  trait MergePullRequestByFastForwardOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait MergePullRequestBySquashOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait MergePullRequestByThreeWayOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  @js.native
  sealed trait ObjectTypeEnum extends js.Any
  object ObjectTypeEnum extends js.Object {
    val FILE          = "FILE".asInstanceOf[ObjectTypeEnum]
    val DIRECTORY     = "DIRECTORY".asInstanceOf[ObjectTypeEnum]
    val GIT_LINK      = "GIT_LINK".asInstanceOf[ObjectTypeEnum]
    val SYMBOLIC_LINK = "SYMBOLIC_LINK".asInstanceOf[ObjectTypeEnum]

    val values = js.Object.freeze(js.Array(FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK))
  }

  /**
    * Information about the type of an object in a merge operation.
    */
  @js.native
  @Factory
  trait ObjectTypes extends js.Object {
    var base: js.UndefOr[ObjectTypeEnum]
    var destination: js.UndefOr[ObjectTypeEnum]
    var source: js.UndefOr[ObjectTypeEnum]
  }

  @js.native
  sealed trait OrderEnum extends js.Any
  object OrderEnum extends js.Object {
    val ascending  = "ascending".asInstanceOf[OrderEnum]
    val descending = "descending".asInstanceOf[OrderEnum]

    val values = js.Object.freeze(js.Array(ascending, descending))
  }

  /**
    * Returns information about the template that created the approval rule for a pull request.
    */
  @js.native
  @Factory
  trait OriginApprovalRuleTemplate extends js.Object {
    var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId]
    var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName]
  }

  @js.native
  @Factory
  trait OverridePullRequestApprovalRulesInput extends js.Object {
    var overrideStatus: OverrideStatus
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  @js.native
  sealed trait OverrideStatus extends js.Any
  object OverrideStatus extends js.Object {
    val OVERRIDE = "OVERRIDE".asInstanceOf[OverrideStatus]
    val REVOKE   = "REVOKE".asInstanceOf[OverrideStatus]

    val values = js.Object.freeze(js.Array(OVERRIDE, REVOKE))
  }

  @js.native
  @Factory
  trait PostCommentForComparedCommitInput extends js.Object {
    var afterCommitId: CommitId
    var content: Content
    var repositoryName: RepositoryName
    var beforeCommitId: js.UndefOr[CommitId]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var location: js.UndefOr[Location]
  }

  @js.native
  @Factory
  trait PostCommentForComparedCommitOutput extends js.Object {
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var beforeCommitId: js.UndefOr[CommitId]
    var comment: js.UndefOr[Comment]
    var location: js.UndefOr[Location]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait PostCommentForPullRequestInput extends js.Object {
    var afterCommitId: CommitId
    var beforeCommitId: CommitId
    var content: Content
    var pullRequestId: PullRequestId
    var repositoryName: RepositoryName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var location: js.UndefOr[Location]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PostCommentReplyInput extends js.Object {
    var content: Content
    var inReplyTo: CommentId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  @js.native
  @Factory
  trait PostCommentReplyOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  /**
    * Returns information about a pull request.
    */
  @js.native
  @Factory
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

  /**
    * Metadata about the pull request that is used when comparing the pull request source with its destination.
    */
  @js.native
  @Factory
  trait PullRequestCreatedEventMetadata extends js.Object {
    var destinationCommitId: js.UndefOr[CommitId]
    var mergeBase: js.UndefOr[CommitId]
    var repositoryName: js.UndefOr[RepositoryName]
    var sourceCommitId: js.UndefOr[CommitId]
  }

  /**
    * Returns information about a pull request event.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait PullRequestEventType extends js.Any
  object PullRequestEventType extends js.Object {
    val PULL_REQUEST_CREATED        = "PULL_REQUEST_CREATED".asInstanceOf[PullRequestEventType]
    val PULL_REQUEST_STATUS_CHANGED = "PULL_REQUEST_STATUS_CHANGED".asInstanceOf[PullRequestEventType]
    val PULL_REQUEST_SOURCE_REFERENCE_UPDATED =
      "PULL_REQUEST_SOURCE_REFERENCE_UPDATED".asInstanceOf[PullRequestEventType]
    val PULL_REQUEST_MERGE_STATE_CHANGED   = "PULL_REQUEST_MERGE_STATE_CHANGED".asInstanceOf[PullRequestEventType]
    val PULL_REQUEST_APPROVAL_RULE_CREATED = "PULL_REQUEST_APPROVAL_RULE_CREATED".asInstanceOf[PullRequestEventType]
    val PULL_REQUEST_APPROVAL_RULE_UPDATED = "PULL_REQUEST_APPROVAL_RULE_UPDATED".asInstanceOf[PullRequestEventType]
    val PULL_REQUEST_APPROVAL_RULE_DELETED = "PULL_REQUEST_APPROVAL_RULE_DELETED".asInstanceOf[PullRequestEventType]
    val PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN =
      "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN".asInstanceOf[PullRequestEventType]
    val PULL_REQUEST_APPROVAL_STATE_CHANGED = "PULL_REQUEST_APPROVAL_STATE_CHANGED".asInstanceOf[PullRequestEventType]

    val values = js.Object.freeze(
      js.Array(
        PULL_REQUEST_CREATED,
        PULL_REQUEST_STATUS_CHANGED,
        PULL_REQUEST_SOURCE_REFERENCE_UPDATED,
        PULL_REQUEST_MERGE_STATE_CHANGED,
        PULL_REQUEST_APPROVAL_RULE_CREATED,
        PULL_REQUEST_APPROVAL_RULE_UPDATED,
        PULL_REQUEST_APPROVAL_RULE_DELETED,
        PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
        PULL_REQUEST_APPROVAL_STATE_CHANGED
      )
    )
  }

  /**
    * Returns information about the change in the merge state for a pull request event.
    */
  @js.native
  @Factory
  trait PullRequestMergedStateChangedEventMetadata extends js.Object {
    var destinationReference: js.UndefOr[ReferenceName]
    var mergeMetadata: js.UndefOr[MergeMetadata]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  /**
    * Information about an update to the source branch of a pull request.
    */
  @js.native
  @Factory
  trait PullRequestSourceReferenceUpdatedEventMetadata extends js.Object {
    var afterCommitId: js.UndefOr[CommitId]
    var beforeCommitId: js.UndefOr[CommitId]
    var mergeBase: js.UndefOr[CommitId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  /**
    * Information about a change to the status of a pull request.
    */
  @js.native
  @Factory
  trait PullRequestStatusChangedEventMetadata extends js.Object {
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
  }

  @js.native
  sealed trait PullRequestStatusEnum extends js.Any
  object PullRequestStatusEnum extends js.Object {
    val OPEN   = "OPEN".asInstanceOf[PullRequestStatusEnum]
    val CLOSED = "CLOSED".asInstanceOf[PullRequestStatusEnum]

    val values = js.Object.freeze(js.Array(OPEN, CLOSED))
  }

  /**
    * Returns information about a pull request target.
    */
  @js.native
  @Factory
  trait PullRequestTarget extends js.Object {
    var destinationCommit: js.UndefOr[CommitId]
    var destinationReference: js.UndefOr[ReferenceName]
    var mergeBase: js.UndefOr[CommitId]
    var mergeMetadata: js.UndefOr[MergeMetadata]
    var repositoryName: js.UndefOr[RepositoryName]
    var sourceCommit: js.UndefOr[CommitId]
    var sourceReference: js.UndefOr[ReferenceName]
  }

  /**
    * Information about a file added or updated as part of a commit.
    */
  @js.native
  @Factory
  trait PutFileEntry extends js.Object {
    var filePath: Path
    var fileContent: js.UndefOr[FileContent]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var sourceFile: js.UndefOr[SourceFileSpecifier]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PutFileOutput extends js.Object {
    var blobId: ObjectId
    var commitId: ObjectId
    var treeId: ObjectId
  }

  /**
    * Represents the input of a put repository triggers operation.
    */
  @js.native
  @Factory
  trait PutRepositoryTriggersInput extends js.Object {
    var repositoryName: RepositoryName
    var triggers: RepositoryTriggersList
  }

  /**
    * Represents the output of a put repository triggers operation.
    */
  @js.native
  @Factory
  trait PutRepositoryTriggersOutput extends js.Object {
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId]
  }

  @js.native
  sealed trait RelativeFileVersionEnum extends js.Any
  object RelativeFileVersionEnum extends js.Object {
    val BEFORE = "BEFORE".asInstanceOf[RelativeFileVersionEnum]
    val AFTER  = "AFTER".asInstanceOf[RelativeFileVersionEnum]

    val values = js.Object.freeze(js.Array(BEFORE, AFTER))
  }

  /**
    * Information about a replacement content entry in the conflict of a merge or pull request operation.
    */
  @js.native
  @Factory
  trait ReplaceContentEntry extends js.Object {
    var filePath: Path
    var replacementType: ReplacementTypeEnum
    var content: js.UndefOr[FileContent]
    var fileMode: js.UndefOr[FileModeTypeEnum]
  }

  @js.native
  sealed trait ReplacementTypeEnum extends js.Any
  object ReplacementTypeEnum extends js.Object {
    val KEEP_BASE        = "KEEP_BASE".asInstanceOf[ReplacementTypeEnum]
    val KEEP_SOURCE      = "KEEP_SOURCE".asInstanceOf[ReplacementTypeEnum]
    val KEEP_DESTINATION = "KEEP_DESTINATION".asInstanceOf[ReplacementTypeEnum]
    val USE_NEW_CONTENT  = "USE_NEW_CONTENT".asInstanceOf[ReplacementTypeEnum]

    val values = js.Object.freeze(js.Array(KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION, USE_NEW_CONTENT))
  }

  /**
    * Information about a repository.
    */
  @js.native
  @Factory
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

  /**
    * Information about a repository name and ID.
    */
  @js.native
  @Factory
  trait RepositoryNameIdPair extends js.Object {
    var repositoryId: js.UndefOr[RepositoryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  /**
    * Information about a trigger for a repository.
    */
  @js.native
  @Factory
  trait RepositoryTrigger extends js.Object {
    var destinationArn: Arn
    var events: RepositoryTriggerEventList
    var name: RepositoryTriggerName
    var branches: js.UndefOr[BranchNameList]
    var customData: js.UndefOr[RepositoryTriggerCustomData]
  }

  @js.native
  sealed trait RepositoryTriggerEventEnum extends js.Any
  object RepositoryTriggerEventEnum extends js.Object {
    val all             = "all".asInstanceOf[RepositoryTriggerEventEnum]
    val updateReference = "updateReference".asInstanceOf[RepositoryTriggerEventEnum]
    val createReference = "createReference".asInstanceOf[RepositoryTriggerEventEnum]
    val deleteReference = "deleteReference".asInstanceOf[RepositoryTriggerEventEnum]

    val values = js.Object.freeze(js.Array(all, updateReference, createReference, deleteReference))
  }

  /**
    * A trigger failed to run.
    */
  @js.native
  @Factory
  trait RepositoryTriggerExecutionFailure extends js.Object {
    var failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage]
    var trigger: js.UndefOr[RepositoryTriggerName]
  }

  /**
    * Information about the file mode changes.
    */
  @js.native
  @Factory
  trait SetFileModeEntry extends js.Object {
    var fileMode: FileModeTypeEnum
    var filePath: Path
  }

  @js.native
  sealed trait SortByEnum extends js.Any
  object SortByEnum extends js.Object {
    val repositoryName   = "repositoryName".asInstanceOf[SortByEnum]
    val lastModifiedDate = "lastModifiedDate".asInstanceOf[SortByEnum]

    val values = js.Object.freeze(js.Array(repositoryName, lastModifiedDate))
  }

  /**
    * Information about a source file that is part of changes made in a commit.
    */
  @js.native
  @Factory
  trait SourceFileSpecifier extends js.Object {
    var filePath: Path
    var isMove: js.UndefOr[IsMove]
  }

  /**
    * Returns information about a submodule reference in a repository folder.
    */
  @js.native
  @Factory
  trait SubModule extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var commitId: js.UndefOr[ObjectId]
    var relativePath: js.UndefOr[Path]
  }

  /**
    * Returns information about a symbolic link in a repository folder.
    */
  @js.native
  @Factory
  trait SymbolicLink extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var blobId: js.UndefOr[ObjectId]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var relativePath: js.UndefOr[Path]
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagsMap
  }

  /**
    * Returns information about a target for a pull request.
    */
  @js.native
  @Factory
  trait Target extends js.Object {
    var repositoryName: RepositoryName
    var sourceReference: ReferenceName
    var destinationReference: js.UndefOr[ReferenceName]
  }

  /**
    * Represents the input of a test repository triggers operation.
    */
  @js.native
  @Factory
  trait TestRepositoryTriggersInput extends js.Object {
    var repositoryName: RepositoryName
    var triggers: RepositoryTriggersList
  }

  /**
    * Represents the output of a test repository triggers operation.
    */
  @js.native
  @Factory
  trait TestRepositoryTriggersOutput extends js.Object {
    var failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList]
    var successfulExecutions: js.UndefOr[RepositoryTriggerNameList]
  }

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeysList
  }

  @js.native
  @Factory
  trait UpdateApprovalRuleTemplateContentInput extends js.Object {
    var approvalRuleTemplateName: ApprovalRuleTemplateName
    var newRuleContent: ApprovalRuleTemplateContent
    var existingRuleContentSha256: js.UndefOr[RuleContentSha256]
  }

  @js.native
  @Factory
  trait UpdateApprovalRuleTemplateContentOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  @js.native
  @Factory
  trait UpdateApprovalRuleTemplateDescriptionInput extends js.Object {
    var approvalRuleTemplateDescription: ApprovalRuleTemplateDescription
    var approvalRuleTemplateName: ApprovalRuleTemplateName
  }

  @js.native
  @Factory
  trait UpdateApprovalRuleTemplateDescriptionOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  @js.native
  @Factory
  trait UpdateApprovalRuleTemplateNameInput extends js.Object {
    var newApprovalRuleTemplateName: ApprovalRuleTemplateName
    var oldApprovalRuleTemplateName: ApprovalRuleTemplateName
  }

  @js.native
  @Factory
  trait UpdateApprovalRuleTemplateNameOutput extends js.Object {
    var approvalRuleTemplate: ApprovalRuleTemplate
  }

  @js.native
  @Factory
  trait UpdateCommentInput extends js.Object {
    var commentId: CommentId
    var content: Content
  }

  @js.native
  @Factory
  trait UpdateCommentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  /**
    * Represents the input of an update default branch operation.
    */
  @js.native
  @Factory
  trait UpdateDefaultBranchInput extends js.Object {
    var defaultBranchName: BranchName
    var repositoryName: RepositoryName
  }

  @js.native
  @Factory
  trait UpdatePullRequestApprovalRuleContentInput extends js.Object {
    var approvalRuleName: ApprovalRuleName
    var newRuleContent: ApprovalRuleContent
    var pullRequestId: PullRequestId
    var existingRuleContentSha256: js.UndefOr[RuleContentSha256]
  }

  @js.native
  @Factory
  trait UpdatePullRequestApprovalRuleContentOutput extends js.Object {
    var approvalRule: ApprovalRule
  }

  @js.native
  @Factory
  trait UpdatePullRequestApprovalStateInput extends js.Object {
    var approvalState: ApprovalState
    var pullRequestId: PullRequestId
    var revisionId: RevisionId
  }

  @js.native
  @Factory
  trait UpdatePullRequestDescriptionInput extends js.Object {
    var description: Description
    var pullRequestId: PullRequestId
  }

  @js.native
  @Factory
  trait UpdatePullRequestDescriptionOutput extends js.Object {
    var pullRequest: PullRequest
  }

  @js.native
  @Factory
  trait UpdatePullRequestStatusInput extends js.Object {
    var pullRequestId: PullRequestId
    var pullRequestStatus: PullRequestStatusEnum
  }

  @js.native
  @Factory
  trait UpdatePullRequestStatusOutput extends js.Object {
    var pullRequest: PullRequest
  }

  @js.native
  @Factory
  trait UpdatePullRequestTitleInput extends js.Object {
    var pullRequestId: PullRequestId
    var title: Title
  }

  @js.native
  @Factory
  trait UpdatePullRequestTitleOutput extends js.Object {
    var pullRequest: PullRequest
  }

  /**
    * Represents the input of an update repository description operation.
    */
  @js.native
  @Factory
  trait UpdateRepositoryDescriptionInput extends js.Object {
    var repositoryName: RepositoryName
    var repositoryDescription: js.UndefOr[RepositoryDescription]
  }

  /**
    * Represents the input of an update repository description operation.
    */
  @js.native
  @Factory
  trait UpdateRepositoryNameInput extends js.Object {
    var newName: RepositoryName
    var oldName: RepositoryName
  }

  /**
    * Information about the user who made a specified commit.
    */
  @js.native
  @Factory
  trait UserInfo extends js.Object {
    var date: js.UndefOr[Date]
    var email: js.UndefOr[Email]
    var name: js.UndefOr[Name]
  }
}
