package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object codecommit {
  type AccountId                     = String
  type AdditionalData                = String
  type Arn                           = String
  type BranchName                    = String
  type BranchNameList                = js.Array[BranchName]
  type ChangeTypeEnum                = String
  type ClientRequestToken            = String
  type CloneUrlHttp                  = String
  type CloneUrlSsh                   = String
  type CommentId                     = String
  type Comments                      = js.Array[Comment]
  type CommentsForComparedCommitData = js.Array[CommentsForComparedCommit]
  type CommentsForPullRequestData    = js.Array[CommentsForPullRequest]
  type CommitId                      = String
  type CommitName                    = String
  type Content                       = String
  type CreationDate                  = js.Date
  type Date                          = String
  type DeleteFileEntries             = js.Array[DeleteFileEntry]
  type Description                   = String
  type DifferenceList                = js.Array[Difference]
  type Email                         = String
  type EventDate                     = js.Date
  type FileContent =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type FileList                                 = js.Array[File]
  type FileModeTypeEnum                         = String
  type FilesMetadata                            = js.Array[FileMetadata]
  type FolderList                               = js.Array[Folder]
  type IsCommentDeleted                         = Boolean
  type IsMergeable                              = Boolean
  type IsMerged                                 = Boolean
  type IsMove                                   = Boolean
  type KeepEmptyFolders                         = Boolean
  type LastModifiedDate                         = js.Date
  type Limit                                    = Int
  type MaxResults                               = Int
  type MergeOptionTypeEnum                      = String
  type Message                                  = String
  type Mode                                     = String
  type Name                                     = String
  type NextToken                                = String
  type ObjectId                                 = String
  type ObjectSize                               = Double
  type OrderEnum                                = String
  type ParentList                               = js.Array[ObjectId]
  type Path                                     = String
  type Position                                 = Double
  type PullRequestEventList                     = js.Array[PullRequestEvent]
  type PullRequestEventType                     = String
  type PullRequestId                            = String
  type PullRequestIdList                        = js.Array[PullRequestId]
  type PullRequestStatusEnum                    = String
  type PullRequestTargetList                    = js.Array[PullRequestTarget]
  type PutFileEntries                           = js.Array[PutFileEntry]
  type ReferenceName                            = String
  type RelativeFileVersionEnum                  = String
  type RepositoryDescription                    = String
  type RepositoryId                             = String
  type RepositoryMetadataList                   = js.Array[RepositoryMetadata]
  type RepositoryName                           = String
  type RepositoryNameIdPairList                 = js.Array[RepositoryNameIdPair]
  type RepositoryNameList                       = js.Array[RepositoryName]
  type RepositoryNotFoundList                   = js.Array[RepositoryName]
  type RepositoryTriggerCustomData              = String
  type RepositoryTriggerEventEnum               = String
  type RepositoryTriggerEventList               = js.Array[RepositoryTriggerEventEnum]
  type RepositoryTriggerExecutionFailureList    = js.Array[RepositoryTriggerExecutionFailure]
  type RepositoryTriggerExecutionFailureMessage = String
  type RepositoryTriggerName                    = String
  type RepositoryTriggerNameList                = js.Array[RepositoryTriggerName]
  type RepositoryTriggersConfigurationId        = String
  type RepositoryTriggersList                   = js.Array[RepositoryTrigger]
  type SetFileModeEntries                       = js.Array[SetFileModeEntry]
  type SortByEnum                               = String
  type SubModuleList                            = js.Array[SubModule]
  type SymbolicLinkList                         = js.Array[SymbolicLink]
  type TargetList                               = js.Array[Target]
  type Title                                    = String
  type blob                                     = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String

  implicit final class CodeCommitOps(val service: CodeCommit) extends AnyVal {

    def batchGetRepositoriesFuture(params: BatchGetRepositoriesInput): Future[BatchGetRepositoriesOutput] =
      service.batchGetRepositories(params).promise.toFuture
    def createBranchFuture(params: CreateBranchInput): Future[js.Object] = service.createBranch(params).promise.toFuture
    def createCommitFuture(params: CreateCommitInput): Future[CreateCommitOutput] =
      service.createCommit(params).promise.toFuture
    def createPullRequestFuture(params: CreatePullRequestInput): Future[CreatePullRequestOutput] =
      service.createPullRequest(params).promise.toFuture
    def createRepositoryFuture(params: CreateRepositoryInput): Future[CreateRepositoryOutput] =
      service.createRepository(params).promise.toFuture
    def deleteBranchFuture(params: DeleteBranchInput): Future[DeleteBranchOutput] =
      service.deleteBranch(params).promise.toFuture
    def deleteCommentContentFuture(params: DeleteCommentContentInput): Future[DeleteCommentContentOutput] =
      service.deleteCommentContent(params).promise.toFuture
    def deleteFileFuture(params: DeleteFileInput): Future[DeleteFileOutput] =
      service.deleteFile(params).promise.toFuture
    def deleteRepositoryFuture(params: DeleteRepositoryInput): Future[DeleteRepositoryOutput] =
      service.deleteRepository(params).promise.toFuture
    def describePullRequestEventsFuture(
        params: DescribePullRequestEventsInput
    ): Future[DescribePullRequestEventsOutput]                           = service.describePullRequestEvents(params).promise.toFuture
    def getBlobFuture(params: GetBlobInput): Future[GetBlobOutput]       = service.getBlob(params).promise.toFuture
    def getBranchFuture(params: GetBranchInput): Future[GetBranchOutput] = service.getBranch(params).promise.toFuture
    def getCommentFuture(params: GetCommentInput): Future[GetCommentOutput] =
      service.getComment(params).promise.toFuture
    def getCommentsForComparedCommitFuture(
        params: GetCommentsForComparedCommitInput
    ): Future[GetCommentsForComparedCommitOutput] = service.getCommentsForComparedCommit(params).promise.toFuture
    def getCommentsForPullRequestFuture(
        params: GetCommentsForPullRequestInput
    ): Future[GetCommentsForPullRequestOutput]                           = service.getCommentsForPullRequest(params).promise.toFuture
    def getCommitFuture(params: GetCommitInput): Future[GetCommitOutput] = service.getCommit(params).promise.toFuture
    def getDifferencesFuture(params: GetDifferencesInput): Future[GetDifferencesOutput] =
      service.getDifferences(params).promise.toFuture
    def getFileFuture(params: GetFileInput): Future[GetFileOutput]       = service.getFile(params).promise.toFuture
    def getFolderFuture(params: GetFolderInput): Future[GetFolderOutput] = service.getFolder(params).promise.toFuture
    def getMergeConflictsFuture(params: GetMergeConflictsInput): Future[GetMergeConflictsOutput] =
      service.getMergeConflicts(params).promise.toFuture
    def getPullRequestFuture(params: GetPullRequestInput): Future[GetPullRequestOutput] =
      service.getPullRequest(params).promise.toFuture
    def getRepositoryFuture(params: GetRepositoryInput): Future[GetRepositoryOutput] =
      service.getRepository(params).promise.toFuture
    def getRepositoryTriggersFuture(params: GetRepositoryTriggersInput): Future[GetRepositoryTriggersOutput] =
      service.getRepositoryTriggers(params).promise.toFuture
    def listBranchesFuture(params: ListBranchesInput): Future[ListBranchesOutput] =
      service.listBranches(params).promise.toFuture
    def listPullRequestsFuture(params: ListPullRequestsInput): Future[ListPullRequestsOutput] =
      service.listPullRequests(params).promise.toFuture
    def listRepositoriesFuture(params: ListRepositoriesInput): Future[ListRepositoriesOutput] =
      service.listRepositories(params).promise.toFuture
    def mergePullRequestByFastForwardFuture(
        params: MergePullRequestByFastForwardInput
    ): Future[MergePullRequestByFastForwardOutput] = service.mergePullRequestByFastForward(params).promise.toFuture
    def postCommentForComparedCommitFuture(
        params: PostCommentForComparedCommitInput
    ): Future[PostCommentForComparedCommitOutput] = service.postCommentForComparedCommit(params).promise.toFuture
    def postCommentForPullRequestFuture(
        params: PostCommentForPullRequestInput
    ): Future[PostCommentForPullRequestOutput] = service.postCommentForPullRequest(params).promise.toFuture
    def postCommentReplyFuture(params: PostCommentReplyInput): Future[PostCommentReplyOutput] =
      service.postCommentReply(params).promise.toFuture
    def putFileFuture(params: PutFileInput): Future[PutFileOutput] = service.putFile(params).promise.toFuture
    def putRepositoryTriggersFuture(params: PutRepositoryTriggersInput): Future[PutRepositoryTriggersOutput] =
      service.putRepositoryTriggers(params).promise.toFuture
    def testRepositoryTriggersFuture(params: TestRepositoryTriggersInput): Future[TestRepositoryTriggersOutput] =
      service.testRepositoryTriggers(params).promise.toFuture
    def updateCommentFuture(params: UpdateCommentInput): Future[UpdateCommentOutput] =
      service.updateComment(params).promise.toFuture
    def updateDefaultBranchFuture(params: UpdateDefaultBranchInput): Future[js.Object] =
      service.updateDefaultBranch(params).promise.toFuture
    def updatePullRequestDescriptionFuture(
        params: UpdatePullRequestDescriptionInput
    ): Future[UpdatePullRequestDescriptionOutput] = service.updatePullRequestDescription(params).promise.toFuture
    def updatePullRequestStatusFuture(params: UpdatePullRequestStatusInput): Future[UpdatePullRequestStatusOutput] =
      service.updatePullRequestStatus(params).promise.toFuture
    def updatePullRequestTitleFuture(params: UpdatePullRequestTitleInput): Future[UpdatePullRequestTitleOutput] =
      service.updatePullRequestTitle(params).promise.toFuture
    def updateRepositoryDescriptionFuture(params: UpdateRepositoryDescriptionInput): Future[js.Object] =
      service.updateRepositoryDescription(params).promise.toFuture
    def updateRepositoryNameFuture(params: UpdateRepositoryNameInput): Future[js.Object] =
      service.updateRepositoryName(params).promise.toFuture
  }
}

package codecommit {
  @js.native
  @JSImport("aws-sdk", "CodeCommit")
  class CodeCommit() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetRepositories(params: BatchGetRepositoriesInput): Request[BatchGetRepositoriesOutput] = js.native
    def createBranch(params: CreateBranchInput): Request[js.Object]                                  = js.native
    def createCommit(params: CreateCommitInput): Request[CreateCommitOutput]                         = js.native
    def createPullRequest(params: CreatePullRequestInput): Request[CreatePullRequestOutput]          = js.native
    def createRepository(params: CreateRepositoryInput): Request[CreateRepositoryOutput]             = js.native
    def deleteBranch(params: DeleteBranchInput): Request[DeleteBranchOutput]                         = js.native
    def deleteCommentContent(params: DeleteCommentContentInput): Request[DeleteCommentContentOutput] = js.native
    def deleteFile(params: DeleteFileInput): Request[DeleteFileOutput]                               = js.native
    def deleteRepository(params: DeleteRepositoryInput): Request[DeleteRepositoryOutput]             = js.native
    def describePullRequestEvents(params: DescribePullRequestEventsInput): Request[DescribePullRequestEventsOutput] =
      js.native
    def getBlob(params: GetBlobInput): Request[GetBlobOutput]          = js.native
    def getBranch(params: GetBranchInput): Request[GetBranchOutput]    = js.native
    def getComment(params: GetCommentInput): Request[GetCommentOutput] = js.native
    def getCommentsForComparedCommit(
        params: GetCommentsForComparedCommitInput
    ): Request[GetCommentsForComparedCommitOutput] = js.native
    def getCommentsForPullRequest(params: GetCommentsForPullRequestInput): Request[GetCommentsForPullRequestOutput] =
      js.native
    def getCommit(params: GetCommitInput): Request[GetCommitOutput]                                     = js.native
    def getDifferences(params: GetDifferencesInput): Request[GetDifferencesOutput]                      = js.native
    def getFile(params: GetFileInput): Request[GetFileOutput]                                           = js.native
    def getFolder(params: GetFolderInput): Request[GetFolderOutput]                                     = js.native
    def getMergeConflicts(params: GetMergeConflictsInput): Request[GetMergeConflictsOutput]             = js.native
    def getPullRequest(params: GetPullRequestInput): Request[GetPullRequestOutput]                      = js.native
    def getRepository(params: GetRepositoryInput): Request[GetRepositoryOutput]                         = js.native
    def getRepositoryTriggers(params: GetRepositoryTriggersInput): Request[GetRepositoryTriggersOutput] = js.native
    def listBranches(params: ListBranchesInput): Request[ListBranchesOutput]                            = js.native
    def listPullRequests(params: ListPullRequestsInput): Request[ListPullRequestsOutput]                = js.native
    def listRepositories(params: ListRepositoriesInput): Request[ListRepositoriesOutput]                = js.native
    def mergePullRequestByFastForward(
        params: MergePullRequestByFastForwardInput
    ): Request[MergePullRequestByFastForwardOutput] = js.native
    def postCommentForComparedCommit(
        params: PostCommentForComparedCommitInput
    ): Request[PostCommentForComparedCommitOutput] = js.native
    def postCommentForPullRequest(params: PostCommentForPullRequestInput): Request[PostCommentForPullRequestOutput] =
      js.native
    def postCommentReply(params: PostCommentReplyInput): Request[PostCommentReplyOutput]                   = js.native
    def putFile(params: PutFileInput): Request[PutFileOutput]                                              = js.native
    def putRepositoryTriggers(params: PutRepositoryTriggersInput): Request[PutRepositoryTriggersOutput]    = js.native
    def testRepositoryTriggers(params: TestRepositoryTriggersInput): Request[TestRepositoryTriggersOutput] = js.native
    def updateComment(params: UpdateCommentInput): Request[UpdateCommentOutput]                            = js.native
    def updateDefaultBranch(params: UpdateDefaultBranchInput): Request[js.Object]                          = js.native
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
    * Represents the input of a batch get repositories operation.
    */
  @js.native
  trait BatchGetRepositoriesInput extends js.Object {
    var repositoryNames: RepositoryNameList
  }

  object BatchGetRepositoriesInput {
    def apply(
        repositoryNames: RepositoryNameList
    ): BatchGetRepositoriesInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryNames" -> repositoryNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetRepositoriesInput]
    }
  }

  /**
    * Represents the output of a batch get repositories operation.
    */
  @js.native
  trait BatchGetRepositoriesOutput extends js.Object {
    var repositories: js.UndefOr[RepositoryMetadataList]
    var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList]
  }

  object BatchGetRepositoriesOutput {
    def apply(
        repositories: js.UndefOr[RepositoryMetadataList] = js.undefined,
        repositoriesNotFound: js.UndefOr[RepositoryNotFoundList] = js.undefined
    ): BatchGetRepositoriesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      repositories.foreach(__v => __obj.update("repositories", __v.asInstanceOf[js.Any]))
      repositoriesNotFound.foreach(__v => __obj.update("repositoriesNotFound", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetRepositoriesOutput]
    }
  }

  /**
    * Returns information about a specific Git blob object.
    */
  @js.native
  trait BlobMetadata extends js.Object {
    var blobId: js.UndefOr[ObjectId]
    var mode: js.UndefOr[Mode]
    var path: js.UndefOr[Path]
  }

  object BlobMetadata {
    def apply(
        blobId: js.UndefOr[ObjectId] = js.undefined,
        mode: js.UndefOr[Mode] = js.undefined,
        path: js.UndefOr[Path] = js.undefined
    ): BlobMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      blobId.foreach(__v => __obj.update("blobId", __v.asInstanceOf[js.Any]))
      mode.foreach(__v => __obj.update("mode", __v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.update("path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlobMetadata]
    }
  }

  /**
    * Returns information about a branch.
    */
  @js.native
  trait BranchInfo extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var commitId: js.UndefOr[CommitId]
  }

  object BranchInfo {
    def apply(
        branchName: js.UndefOr[BranchName] = js.undefined,
        commitId: js.UndefOr[CommitId] = js.undefined
    ): BranchInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      branchName.foreach(__v => __obj.update("branchName", __v.asInstanceOf[js.Any]))
      commitId.foreach(__v => __obj.update("commitId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BranchInfo]
    }
  }

  object ChangeTypeEnumEnum {
    val A = "A"
    val M = "M"
    val D = "D"

    val values = IndexedSeq(A, M, D)
  }

  /**
    * Returns information about a specific comment.
    */
  @js.native
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

  object Comment {
    def apply(
        authorArn: js.UndefOr[Arn] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        commentId: js.UndefOr[CommentId] = js.undefined,
        content: js.UndefOr[Content] = js.undefined,
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        deleted: js.UndefOr[IsCommentDeleted] = js.undefined,
        inReplyTo: js.UndefOr[CommentId] = js.undefined,
        lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
    ): Comment = {
      val __obj = js.Dictionary.empty[js.Any]
      authorArn.foreach(__v => __obj.update("authorArn", __v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      commentId.foreach(__v => __obj.update("commentId", __v.asInstanceOf[js.Any]))
      content.foreach(__v => __obj.update("content", __v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.update("creationDate", __v.asInstanceOf[js.Any]))
      deleted.foreach(__v => __obj.update("deleted", __v.asInstanceOf[js.Any]))
      inReplyTo.foreach(__v => __obj.update("inReplyTo", __v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.update("lastModifiedDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Comment]
    }
  }

  /**
    * Returns information about comments on the comparison between two commits.
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
    def apply(
        afterBlobId: js.UndefOr[ObjectId] = js.undefined,
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        comments: js.UndefOr[Comments] = js.undefined,
        location: js.UndefOr[Location] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): CommentsForComparedCommit = {
      val __obj = js.Dictionary.empty[js.Any]
      afterBlobId.foreach(__v => __obj.update("afterBlobId", __v.asInstanceOf[js.Any]))
      afterCommitId.foreach(__v => __obj.update("afterCommitId", __v.asInstanceOf[js.Any]))
      beforeBlobId.foreach(__v => __obj.update("beforeBlobId", __v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.update("beforeCommitId", __v.asInstanceOf[js.Any]))
      comments.foreach(__v => __obj.update("comments", __v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommentsForComparedCommit]
    }
  }

  /**
    * Returns information about comments on a pull request.
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
      val __obj = js.Dictionary.empty[js.Any]
      afterBlobId.foreach(__v => __obj.update("afterBlobId", __v.asInstanceOf[js.Any]))
      afterCommitId.foreach(__v => __obj.update("afterCommitId", __v.asInstanceOf[js.Any]))
      beforeBlobId.foreach(__v => __obj.update("beforeBlobId", __v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.update("beforeCommitId", __v.asInstanceOf[js.Any]))
      comments.foreach(__v => __obj.update("comments", __v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
      pullRequestId.foreach(__v => __obj.update("pullRequestId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommentsForPullRequest]
    }
  }

  /**
    * Returns information about a specific commit.
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
    def apply(
        additionalData: js.UndefOr[AdditionalData] = js.undefined,
        author: js.UndefOr[UserInfo] = js.undefined,
        commitId: js.UndefOr[ObjectId] = js.undefined,
        committer: js.UndefOr[UserInfo] = js.undefined,
        message: js.UndefOr[Message] = js.undefined,
        parents: js.UndefOr[ParentList] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): Commit = {
      val __obj = js.Dictionary.empty[js.Any]
      additionalData.foreach(__v => __obj.update("additionalData", __v.asInstanceOf[js.Any]))
      author.foreach(__v => __obj.update("author", __v.asInstanceOf[js.Any]))
      commitId.foreach(__v => __obj.update("commitId", __v.asInstanceOf[js.Any]))
      committer.foreach(__v => __obj.update("committer", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      parents.foreach(__v => __obj.update("parents", __v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.update("treeId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Commit]
    }
  }

  /**
    * Represents the input of a create branch operation.
    */
  @js.native
  trait CreateBranchInput extends js.Object {
    var branchName: BranchName
    var commitId: CommitId
    var repositoryName: RepositoryName
  }

  object CreateBranchInput {
    def apply(
        branchName: BranchName,
        commitId: CommitId,
        repositoryName: RepositoryName
    ): CreateBranchInput = {
      val __obj = js.Dictionary[js.Any](
        "branchName"     -> branchName.asInstanceOf[js.Any],
        "commitId"       -> commitId.asInstanceOf[js.Any],
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
      val __obj = js.Dictionary[js.Any](
        "branchName"     -> branchName.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      authorName.foreach(__v => __obj.update("authorName", __v.asInstanceOf[js.Any]))
      commitMessage.foreach(__v => __obj.update("commitMessage", __v.asInstanceOf[js.Any]))
      deleteFiles.foreach(__v => __obj.update("deleteFiles", __v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.update("email", __v.asInstanceOf[js.Any]))
      keepEmptyFolders.foreach(__v => __obj.update("keepEmptyFolders", __v.asInstanceOf[js.Any]))
      parentCommitId.foreach(__v => __obj.update("parentCommitId", __v.asInstanceOf[js.Any]))
      putFiles.foreach(__v => __obj.update("putFiles", __v.asInstanceOf[js.Any]))
      setFileModes.foreach(__v => __obj.update("setFileModes", __v.asInstanceOf[js.Any]))
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
    def apply(
        commitId: js.UndefOr[ObjectId] = js.undefined,
        filesAdded: js.UndefOr[FilesMetadata] = js.undefined,
        filesDeleted: js.UndefOr[FilesMetadata] = js.undefined,
        filesUpdated: js.UndefOr[FilesMetadata] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): CreateCommitOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      commitId.foreach(__v => __obj.update("commitId", __v.asInstanceOf[js.Any]))
      filesAdded.foreach(__v => __obj.update("filesAdded", __v.asInstanceOf[js.Any]))
      filesDeleted.foreach(__v => __obj.update("filesDeleted", __v.asInstanceOf[js.Any]))
      filesUpdated.foreach(__v => __obj.update("filesUpdated", __v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.update("treeId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCommitOutput]
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
    def apply(
        targets: TargetList,
        title: Title,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): CreatePullRequestInput = {
      val __obj = js.Dictionary[js.Any](
        "targets" -> targets.asInstanceOf[js.Any],
        "title"   -> title.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePullRequestInput]
    }
  }

  @js.native
  trait CreatePullRequestOutput extends js.Object {
    var pullRequest: PullRequest
  }

  object CreatePullRequestOutput {
    def apply(
        pullRequest: PullRequest
    ): CreatePullRequestOutput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequest" -> pullRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePullRequestOutput]
    }
  }

  /**
    * Represents the input of a create repository operation.
    */
  @js.native
  trait CreateRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
    var repositoryDescription: js.UndefOr[RepositoryDescription]
  }

  object CreateRepositoryInput {
    def apply(
        repositoryName: RepositoryName,
        repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
    ): CreateRepositoryInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      repositoryDescription.foreach(__v => __obj.update("repositoryDescription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryInput]
    }
  }

  /**
    * Represents the output of a create repository operation.
    */
  @js.native
  trait CreateRepositoryOutput extends js.Object {
    var repositoryMetadata: js.UndefOr[RepositoryMetadata]
  }

  object CreateRepositoryOutput {
    def apply(
        repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
    ): CreateRepositoryOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      repositoryMetadata.foreach(__v => __obj.update("repositoryMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryOutput]
    }
  }

  /**
    * Represents the input of a delete branch operation.
    */
  @js.native
  trait DeleteBranchInput extends js.Object {
    var branchName: BranchName
    var repositoryName: RepositoryName
  }

  object DeleteBranchInput {
    def apply(
        branchName: BranchName,
        repositoryName: RepositoryName
    ): DeleteBranchInput = {
      val __obj = js.Dictionary[js.Any](
        "branchName"     -> branchName.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBranchInput]
    }
  }

  /**
    * Represents the output of a delete branch operation.
    */
  @js.native
  trait DeleteBranchOutput extends js.Object {
    var deletedBranch: js.UndefOr[BranchInfo]
  }

  object DeleteBranchOutput {
    def apply(
        deletedBranch: js.UndefOr[BranchInfo] = js.undefined
    ): DeleteBranchOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      deletedBranch.foreach(__v => __obj.update("deletedBranch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBranchOutput]
    }
  }

  @js.native
  trait DeleteCommentContentInput extends js.Object {
    var commentId: CommentId
  }

  object DeleteCommentContentInput {
    def apply(
        commentId: CommentId
    ): DeleteCommentContentInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        comment: js.UndefOr[Comment] = js.undefined
    ): DeleteCommentContentOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      comment.foreach(__v => __obj.update("comment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCommentContentOutput]
    }
  }

  /**
    * A file that will be deleted as part of a commit.
    */
  @js.native
  trait DeleteFileEntry extends js.Object {
    var filePath: Path
  }

  object DeleteFileEntry {
    def apply(
        filePath: Path
    ): DeleteFileEntry = {
      val __obj = js.Dictionary[js.Any](
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
      val __obj = js.Dictionary[js.Any](
        "branchName"     -> branchName.asInstanceOf[js.Any],
        "filePath"       -> filePath.asInstanceOf[js.Any],
        "parentCommitId" -> parentCommitId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      commitMessage.foreach(__v => __obj.update("commitMessage", __v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.update("email", __v.asInstanceOf[js.Any]))
      keepEmptyFolders.foreach(__v => __obj.update("keepEmptyFolders", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
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
    def apply(
        blobId: ObjectId,
        commitId: ObjectId,
        filePath: Path,
        treeId: ObjectId
    ): DeleteFileOutput = {
      val __obj = js.Dictionary[js.Any](
        "blobId"   -> blobId.asInstanceOf[js.Any],
        "commitId" -> commitId.asInstanceOf[js.Any],
        "filePath" -> filePath.asInstanceOf[js.Any],
        "treeId"   -> treeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFileOutput]
    }
  }

  /**
    * Represents the input of a delete repository operation.
    */
  @js.native
  trait DeleteRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
  }

  object DeleteRepositoryInput {
    def apply(
        repositoryName: RepositoryName
    ): DeleteRepositoryInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRepositoryInput]
    }
  }

  /**
    * Represents the output of a delete repository operation.
    */
  @js.native
  trait DeleteRepositoryOutput extends js.Object {
    var repositoryId: js.UndefOr[RepositoryId]
  }

  object DeleteRepositoryOutput {
    def apply(
        repositoryId: js.UndefOr[RepositoryId] = js.undefined
    ): DeleteRepositoryOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      repositoryId.foreach(__v => __obj.update("repositoryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryOutput]
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
    def apply(
        pullRequestId: PullRequestId,
        actorArn: js.UndefOr[Arn] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined
    ): DescribePullRequestEventsInput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any]
      )

      actorArn.foreach(__v => __obj.update("actorArn", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      pullRequestEventType.foreach(__v => __obj.update("pullRequestEventType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePullRequestEventsInput]
    }
  }

  @js.native
  trait DescribePullRequestEventsOutput extends js.Object {
    var pullRequestEvents: PullRequestEventList
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribePullRequestEventsOutput {
    def apply(
        pullRequestEvents: PullRequestEventList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePullRequestEventsOutput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequestEvents" -> pullRequestEvents.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePullRequestEventsOutput]
    }
  }

  /**
    * Returns information about a set of differences for a commit specifier.
    */
  @js.native
  trait Difference extends js.Object {
    var afterBlob: js.UndefOr[BlobMetadata]
    var beforeBlob: js.UndefOr[BlobMetadata]
    var changeType: js.UndefOr[ChangeTypeEnum]
  }

  object Difference {
    def apply(
        afterBlob: js.UndefOr[BlobMetadata] = js.undefined,
        beforeBlob: js.UndefOr[BlobMetadata] = js.undefined,
        changeType: js.UndefOr[ChangeTypeEnum] = js.undefined
    ): Difference = {
      val __obj = js.Dictionary.empty[js.Any]
      afterBlob.foreach(__v => __obj.update("afterBlob", __v.asInstanceOf[js.Any]))
      beforeBlob.foreach(__v => __obj.update("beforeBlob", __v.asInstanceOf[js.Any]))
      changeType.foreach(__v => __obj.update("changeType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Difference]
    }
  }

  /**
    * Returns information about a file in a repository.
    */
  @js.native
  trait File extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var blobId: js.UndefOr[ObjectId]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var relativePath: js.UndefOr[Path]
  }

  object File {
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        blobId: js.UndefOr[ObjectId] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined,
        relativePath: js.UndefOr[Path] = js.undefined
    ): File = {
      val __obj = js.Dictionary.empty[js.Any]
      absolutePath.foreach(__v => __obj.update("absolutePath", __v.asInstanceOf[js.Any]))
      blobId.foreach(__v => __obj.update("blobId", __v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.update("fileMode", __v.asInstanceOf[js.Any]))
      relativePath.foreach(__v => __obj.update("relativePath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[File]
    }
  }

  /**
    * A file that will be added, updated, or deleted as part of a commit.
    */
  @js.native
  trait FileMetadata extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var blobId: js.UndefOr[ObjectId]
    var fileMode: js.UndefOr[FileModeTypeEnum]
  }

  object FileMetadata {
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        blobId: js.UndefOr[ObjectId] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
    ): FileMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      absolutePath.foreach(__v => __obj.update("absolutePath", __v.asInstanceOf[js.Any]))
      blobId.foreach(__v => __obj.update("blobId", __v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.update("fileMode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileMetadata]
    }
  }

  object FileModeTypeEnumEnum {
    val EXECUTABLE = "EXECUTABLE"
    val NORMAL     = "NORMAL"
    val SYMLINK    = "SYMLINK"

    val values = IndexedSeq(EXECUTABLE, NORMAL, SYMLINK)
  }

  /**
    * Returns information about a folder in a repository.
    */
  @js.native
  trait Folder extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var relativePath: js.UndefOr[Path]
    var treeId: js.UndefOr[ObjectId]
  }

  object Folder {
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        relativePath: js.UndefOr[Path] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): Folder = {
      val __obj = js.Dictionary.empty[js.Any]
      absolutePath.foreach(__v => __obj.update("absolutePath", __v.asInstanceOf[js.Any]))
      relativePath.foreach(__v => __obj.update("relativePath", __v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.update("treeId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Folder]
    }
  }

  /**
    * Represents the input of a get blob operation.
    */
  @js.native
  trait GetBlobInput extends js.Object {
    var blobId: ObjectId
    var repositoryName: RepositoryName
  }

  object GetBlobInput {
    def apply(
        blobId: ObjectId,
        repositoryName: RepositoryName
    ): GetBlobInput = {
      val __obj = js.Dictionary[js.Any](
        "blobId"         -> blobId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBlobInput]
    }
  }

  /**
    * Represents the output of a get blob operation.
    */
  @js.native
  trait GetBlobOutput extends js.Object {
    var content: blob
  }

  object GetBlobOutput {
    def apply(
        content: blob
    ): GetBlobOutput = {
      val __obj = js.Dictionary[js.Any](
        "content" -> content.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBlobOutput]
    }
  }

  /**
    * Represents the input of a get branch operation.
    */
  @js.native
  trait GetBranchInput extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetBranchInput {
    def apply(
        branchName: js.UndefOr[BranchName] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): GetBranchInput = {
      val __obj = js.Dictionary.empty[js.Any]
      branchName.foreach(__v => __obj.update("branchName", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBranchInput]
    }
  }

  /**
    * Represents the output of a get branch operation.
    */
  @js.native
  trait GetBranchOutput extends js.Object {
    var branch: js.UndefOr[BranchInfo]
  }

  object GetBranchOutput {
    def apply(
        branch: js.UndefOr[BranchInfo] = js.undefined
    ): GetBranchOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      branch.foreach(__v => __obj.update("branch", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBranchOutput]
    }
  }

  @js.native
  trait GetCommentInput extends js.Object {
    var commentId: CommentId
  }

  object GetCommentInput {
    def apply(
        commentId: CommentId
    ): GetCommentInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        comment: js.UndefOr[Comment] = js.undefined
    ): GetCommentOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      comment.foreach(__v => __obj.update("comment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentOutput]
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
    def apply(
        afterCommitId: CommitId,
        repositoryName: RepositoryName,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCommentsForComparedCommitInput = {
      val __obj = js.Dictionary[js.Any](
        "afterCommitId"  -> afterCommitId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      beforeCommitId.foreach(__v => __obj.update("beforeCommitId", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentsForComparedCommitInput]
    }
  }

  @js.native
  trait GetCommentsForComparedCommitOutput extends js.Object {
    var commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetCommentsForComparedCommitOutput {
    def apply(
        commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCommentsForComparedCommitOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      commentsForComparedCommitData.foreach(
        __v => __obj.update("commentsForComparedCommitData", __v.asInstanceOf[js.Any])
      )
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        pullRequestId: PullRequestId,
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): GetCommentsForPullRequestInput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any]
      )

      afterCommitId.foreach(__v => __obj.update("afterCommitId", __v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.update("beforeCommitId", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentsForPullRequestInput]
    }
  }

  @js.native
  trait GetCommentsForPullRequestOutput extends js.Object {
    var commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetCommentsForPullRequestOutput {
    def apply(
        commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCommentsForPullRequestOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      commentsForPullRequestData.foreach(__v => __obj.update("commentsForPullRequestData", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCommentsForPullRequestOutput]
    }
  }

  /**
    * Represents the input of a get commit operation.
    */
  @js.native
  trait GetCommitInput extends js.Object {
    var commitId: ObjectId
    var repositoryName: RepositoryName
  }

  object GetCommitInput {
    def apply(
        commitId: ObjectId,
        repositoryName: RepositoryName
    ): GetCommitInput = {
      val __obj = js.Dictionary[js.Any](
        "commitId"       -> commitId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCommitInput]
    }
  }

  /**
    * Represents the output of a get commit operation.
    */
  @js.native
  trait GetCommitOutput extends js.Object {
    var commit: Commit
  }

  object GetCommitOutput {
    def apply(
        commit: Commit
    ): GetCommitOutput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        afterCommitSpecifier: CommitName,
        repositoryName: RepositoryName,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        afterPath: js.UndefOr[Path] = js.undefined,
        beforeCommitSpecifier: js.UndefOr[CommitName] = js.undefined,
        beforePath: js.UndefOr[Path] = js.undefined
    ): GetDifferencesInput = {
      val __obj = js.Dictionary[js.Any](
        "afterCommitSpecifier" -> afterCommitSpecifier.asInstanceOf[js.Any],
        "repositoryName"       -> repositoryName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      afterPath.foreach(__v => __obj.update("afterPath", __v.asInstanceOf[js.Any]))
      beforeCommitSpecifier.foreach(__v => __obj.update("beforeCommitSpecifier", __v.asInstanceOf[js.Any]))
      beforePath.foreach(__v => __obj.update("beforePath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDifferencesInput]
    }
  }

  @js.native
  trait GetDifferencesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var differences: js.UndefOr[DifferenceList]
  }

  object GetDifferencesOutput {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        differences: js.UndefOr[DifferenceList] = js.undefined
    ): GetDifferencesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      differences.foreach(__v => __obj.update("differences", __v.asInstanceOf[js.Any]))
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
    def apply(
        filePath: Path,
        repositoryName: RepositoryName,
        commitSpecifier: js.UndefOr[CommitName] = js.undefined
    ): GetFileInput = {
      val __obj = js.Dictionary[js.Any](
        "filePath"       -> filePath.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      commitSpecifier.foreach(__v => __obj.update("commitSpecifier", __v.asInstanceOf[js.Any]))
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
    def apply(
        blobId: ObjectId,
        commitId: ObjectId,
        fileContent: FileContent,
        fileMode: FileModeTypeEnum,
        filePath: Path,
        fileSize: ObjectSize
    ): GetFileOutput = {
      val __obj = js.Dictionary[js.Any](
        "blobId"      -> blobId.asInstanceOf[js.Any],
        "commitId"    -> commitId.asInstanceOf[js.Any],
        "fileContent" -> fileContent.asInstanceOf[js.Any],
        "fileMode"    -> fileMode.asInstanceOf[js.Any],
        "filePath"    -> filePath.asInstanceOf[js.Any],
        "fileSize"    -> fileSize.asInstanceOf[js.Any]
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
    def apply(
        folderPath: Path,
        repositoryName: RepositoryName,
        commitSpecifier: js.UndefOr[CommitName] = js.undefined
    ): GetFolderInput = {
      val __obj = js.Dictionary[js.Any](
        "folderPath"     -> folderPath.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      commitSpecifier.foreach(__v => __obj.update("commitSpecifier", __v.asInstanceOf[js.Any]))
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
    def apply(
        commitId: ObjectId,
        folderPath: Path,
        files: js.UndefOr[FileList] = js.undefined,
        subFolders: js.UndefOr[FolderList] = js.undefined,
        subModules: js.UndefOr[SubModuleList] = js.undefined,
        symbolicLinks: js.UndefOr[SymbolicLinkList] = js.undefined,
        treeId: js.UndefOr[ObjectId] = js.undefined
    ): GetFolderOutput = {
      val __obj = js.Dictionary[js.Any](
        "commitId"   -> commitId.asInstanceOf[js.Any],
        "folderPath" -> folderPath.asInstanceOf[js.Any]
      )

      files.foreach(__v => __obj.update("files", __v.asInstanceOf[js.Any]))
      subFolders.foreach(__v => __obj.update("subFolders", __v.asInstanceOf[js.Any]))
      subModules.foreach(__v => __obj.update("subModules", __v.asInstanceOf[js.Any]))
      symbolicLinks.foreach(__v => __obj.update("symbolicLinks", __v.asInstanceOf[js.Any]))
      treeId.foreach(__v => __obj.update("treeId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFolderOutput]
    }
  }

  @js.native
  trait GetMergeConflictsInput extends js.Object {
    var destinationCommitSpecifier: CommitName
    var mergeOption: MergeOptionTypeEnum
    var repositoryName: RepositoryName
    var sourceCommitSpecifier: CommitName
  }

  object GetMergeConflictsInput {
    def apply(
        destinationCommitSpecifier: CommitName,
        mergeOption: MergeOptionTypeEnum,
        repositoryName: RepositoryName,
        sourceCommitSpecifier: CommitName
    ): GetMergeConflictsInput = {
      val __obj = js.Dictionary[js.Any](
        "destinationCommitSpecifier" -> destinationCommitSpecifier.asInstanceOf[js.Any],
        "mergeOption"                -> mergeOption.asInstanceOf[js.Any],
        "repositoryName"             -> repositoryName.asInstanceOf[js.Any],
        "sourceCommitSpecifier"      -> sourceCommitSpecifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMergeConflictsInput]
    }
  }

  @js.native
  trait GetMergeConflictsOutput extends js.Object {
    var destinationCommitId: CommitId
    var mergeable: IsMergeable
    var sourceCommitId: CommitId
  }

  object GetMergeConflictsOutput {
    def apply(
        destinationCommitId: CommitId,
        mergeable: IsMergeable,
        sourceCommitId: CommitId
    ): GetMergeConflictsOutput = {
      val __obj = js.Dictionary[js.Any](
        "destinationCommitId" -> destinationCommitId.asInstanceOf[js.Any],
        "mergeable"           -> mergeable.asInstanceOf[js.Any],
        "sourceCommitId"      -> sourceCommitId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMergeConflictsOutput]
    }
  }

  @js.native
  trait GetPullRequestInput extends js.Object {
    var pullRequestId: PullRequestId
  }

  object GetPullRequestInput {
    def apply(
        pullRequestId: PullRequestId
    ): GetPullRequestInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        pullRequest: PullRequest
    ): GetPullRequestOutput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequest" -> pullRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPullRequestOutput]
    }
  }

  /**
    * Represents the input of a get repository operation.
    */
  @js.native
  trait GetRepositoryInput extends js.Object {
    var repositoryName: RepositoryName
  }

  object GetRepositoryInput {
    def apply(
        repositoryName: RepositoryName
    ): GetRepositoryInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRepositoryInput]
    }
  }

  /**
    * Represents the output of a get repository operation.
    */
  @js.native
  trait GetRepositoryOutput extends js.Object {
    var repositoryMetadata: js.UndefOr[RepositoryMetadata]
  }

  object GetRepositoryOutput {
    def apply(
        repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined
    ): GetRepositoryOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      repositoryMetadata.foreach(__v => __obj.update("repositoryMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryOutput]
    }
  }

  /**
    * Represents the input of a get repository triggers operation.
    */
  @js.native
  trait GetRepositoryTriggersInput extends js.Object {
    var repositoryName: RepositoryName
  }

  object GetRepositoryTriggersInput {
    def apply(
        repositoryName: RepositoryName
    ): GetRepositoryTriggersInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRepositoryTriggersInput]
    }
  }

  /**
    * Represents the output of a get repository triggers operation.
    */
  @js.native
  trait GetRepositoryTriggersOutput extends js.Object {
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId]
    var triggers: js.UndefOr[RepositoryTriggersList]
  }

  object GetRepositoryTriggersOutput {
    def apply(
        configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined,
        triggers: js.UndefOr[RepositoryTriggersList] = js.undefined
    ): GetRepositoryTriggersOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      configurationId.foreach(__v => __obj.update("configurationId", __v.asInstanceOf[js.Any]))
      triggers.foreach(__v => __obj.update("triggers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryTriggersOutput]
    }
  }

  /**
    * Represents the input of a list branches operation.
    */
  @js.native
  trait ListBranchesInput extends js.Object {
    var repositoryName: RepositoryName
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesInput {
    def apply(
        repositoryName: RepositoryName,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBranchesInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBranchesInput]
    }
  }

  /**
    * Represents the output of a list branches operation.
    */
  @js.native
  trait ListBranchesOutput extends js.Object {
    var branches: js.UndefOr[BranchNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesOutput {
    def apply(
        branches: js.UndefOr[BranchNameList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBranchesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      branches.foreach(__v => __obj.update("branches", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        repositoryName: RepositoryName,
        authorArn: js.UndefOr[Arn] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
    ): ListPullRequestsInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      authorArn.foreach(__v => __obj.update("authorArn", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      pullRequestStatus.foreach(__v => __obj.update("pullRequestStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPullRequestsInput]
    }
  }

  @js.native
  trait ListPullRequestsOutput extends js.Object {
    var pullRequestIds: PullRequestIdList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPullRequestsOutput {
    def apply(
        pullRequestIds: PullRequestIdList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPullRequestsOutput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequestIds" -> pullRequestIds.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPullRequestsOutput]
    }
  }

  /**
    * Represents the input of a list repositories operation.
    */
  @js.native
  trait ListRepositoriesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var order: js.UndefOr[OrderEnum]
    var sortBy: js.UndefOr[SortByEnum]
  }

  object ListRepositoriesInput {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        order: js.UndefOr[OrderEnum] = js.undefined,
        sortBy: js.UndefOr[SortByEnum] = js.undefined
    ): ListRepositoriesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      order.foreach(__v => __obj.update("order", __v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.update("sortBy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesInput]
    }
  }

  /**
    * Represents the output of a list repositories operation.
    */
  @js.native
  trait ListRepositoriesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var repositories: js.UndefOr[RepositoryNameIdPairList]
  }

  object ListRepositoriesOutput {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        repositories: js.UndefOr[RepositoryNameIdPairList] = js.undefined
    ): ListRepositoriesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      repositories.foreach(__v => __obj.update("repositories", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesOutput]
    }
  }

  /**
    * Returns information about the location of a change or comment in the comparison between two commits or a pull request.
    */
  @js.native
  trait Location extends js.Object {
    var filePath: js.UndefOr[Path]
    var filePosition: js.UndefOr[Position]
    var relativeFileVersion: js.UndefOr[RelativeFileVersionEnum]
  }

  object Location {
    def apply(
        filePath: js.UndefOr[Path] = js.undefined,
        filePosition: js.UndefOr[Position] = js.undefined,
        relativeFileVersion: js.UndefOr[RelativeFileVersionEnum] = js.undefined
    ): Location = {
      val __obj = js.Dictionary.empty[js.Any]
      filePath.foreach(__v => __obj.update("filePath", __v.asInstanceOf[js.Any]))
      filePosition.foreach(__v => __obj.update("filePosition", __v.asInstanceOf[js.Any]))
      relativeFileVersion.foreach(__v => __obj.update("relativeFileVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Location]
    }
  }

  /**
    * Returns information about a merge or potential merge between a source reference and a destination reference in a pull request.
    */
  @js.native
  trait MergeMetadata extends js.Object {
    var isMerged: js.UndefOr[IsMerged]
    var mergedBy: js.UndefOr[Arn]
  }

  object MergeMetadata {
    def apply(
        isMerged: js.UndefOr[IsMerged] = js.undefined,
        mergedBy: js.UndefOr[Arn] = js.undefined
    ): MergeMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      isMerged.foreach(__v => __obj.update("isMerged", __v.asInstanceOf[js.Any]))
      mergedBy.foreach(__v => __obj.update("mergedBy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeMetadata]
    }
  }

  object MergeOptionTypeEnumEnum {
    val FAST_FORWARD_MERGE = "FAST_FORWARD_MERGE"

    val values = IndexedSeq(FAST_FORWARD_MERGE)
  }

  @js.native
  trait MergePullRequestByFastForwardInput extends js.Object {
    var pullRequestId: PullRequestId
    var repositoryName: RepositoryName
    var sourceCommitId: js.UndefOr[CommitId]
  }

  object MergePullRequestByFastForwardInput {
    def apply(
        pullRequestId: PullRequestId,
        repositoryName: RepositoryName,
        sourceCommitId: js.UndefOr[CommitId] = js.undefined
    ): MergePullRequestByFastForwardInput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequestId"  -> pullRequestId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      sourceCommitId.foreach(__v => __obj.update("sourceCommitId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergePullRequestByFastForwardInput]
    }
  }

  @js.native
  trait MergePullRequestByFastForwardOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object MergePullRequestByFastForwardOutput {
    def apply(
        pullRequest: js.UndefOr[PullRequest] = js.undefined
    ): MergePullRequestByFastForwardOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      pullRequest.foreach(__v => __obj.update("pullRequest", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergePullRequestByFastForwardOutput]
    }
  }

  object OrderEnumEnum {
    val ascending  = "ascending"
    val descending = "descending"

    val values = IndexedSeq(ascending, descending)
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
    def apply(
        afterCommitId: CommitId,
        content: Content,
        repositoryName: RepositoryName,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        location: js.UndefOr[Location] = js.undefined
    ): PostCommentForComparedCommitInput = {
      val __obj = js.Dictionary[js.Any](
        "afterCommitId"  -> afterCommitId.asInstanceOf[js.Any],
        "content"        -> content.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      beforeCommitId.foreach(__v => __obj.update("beforeCommitId", __v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
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
    def apply(
        afterBlobId: js.UndefOr[ObjectId] = js.undefined,
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        comment: js.UndefOr[Comment] = js.undefined,
        location: js.UndefOr[Location] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PostCommentForComparedCommitOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      afterBlobId.foreach(__v => __obj.update("afterBlobId", __v.asInstanceOf[js.Any]))
      afterCommitId.foreach(__v => __obj.update("afterCommitId", __v.asInstanceOf[js.Any]))
      beforeBlobId.foreach(__v => __obj.update("beforeBlobId", __v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.update("beforeCommitId", __v.asInstanceOf[js.Any]))
      comment.foreach(__v => __obj.update("comment", __v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
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
    def apply(
        afterCommitId: CommitId,
        beforeCommitId: CommitId,
        content: Content,
        pullRequestId: PullRequestId,
        repositoryName: RepositoryName,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        location: js.UndefOr[Location] = js.undefined
    ): PostCommentForPullRequestInput = {
      val __obj = js.Dictionary[js.Any](
        "afterCommitId"  -> afterCommitId.asInstanceOf[js.Any],
        "beforeCommitId" -> beforeCommitId.asInstanceOf[js.Any],
        "content"        -> content.asInstanceOf[js.Any],
        "pullRequestId"  -> pullRequestId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      afterBlobId.foreach(__v => __obj.update("afterBlobId", __v.asInstanceOf[js.Any]))
      afterCommitId.foreach(__v => __obj.update("afterCommitId", __v.asInstanceOf[js.Any]))
      beforeBlobId.foreach(__v => __obj.update("beforeBlobId", __v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.update("beforeCommitId", __v.asInstanceOf[js.Any]))
      comment.foreach(__v => __obj.update("comment", __v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
      pullRequestId.foreach(__v => __obj.update("pullRequestId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
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
    def apply(
        content: Content,
        inReplyTo: CommentId,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): PostCommentReplyInput = {
      val __obj = js.Dictionary[js.Any](
        "content"   -> content.asInstanceOf[js.Any],
        "inReplyTo" -> inReplyTo.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostCommentReplyInput]
    }
  }

  @js.native
  trait PostCommentReplyOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object PostCommentReplyOutput {
    def apply(
        comment: js.UndefOr[Comment] = js.undefined
    ): PostCommentReplyOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      comment.foreach(__v => __obj.update("comment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostCommentReplyOutput]
    }
  }

  /**
    * Returns information about a pull request.
    */
  @js.native
  trait PullRequest extends js.Object {
    var authorArn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var creationDate: js.UndefOr[CreationDate]
    var description: js.UndefOr[Description]
    var lastActivityDate: js.UndefOr[LastModifiedDate]
    var pullRequestId: js.UndefOr[PullRequestId]
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
    var pullRequestTargets: js.UndefOr[PullRequestTargetList]
    var title: js.UndefOr[Title]
  }

  object PullRequest {
    def apply(
        authorArn: js.UndefOr[Arn] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        creationDate: js.UndefOr[CreationDate] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastActivityDate: js.UndefOr[LastModifiedDate] = js.undefined,
        pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
        pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined,
        pullRequestTargets: js.UndefOr[PullRequestTargetList] = js.undefined,
        title: js.UndefOr[Title] = js.undefined
    ): PullRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      authorArn.foreach(__v => __obj.update("authorArn", __v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.update("creationDate", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      lastActivityDate.foreach(__v => __obj.update("lastActivityDate", __v.asInstanceOf[js.Any]))
      pullRequestId.foreach(__v => __obj.update("pullRequestId", __v.asInstanceOf[js.Any]))
      pullRequestStatus.foreach(__v => __obj.update("pullRequestStatus", __v.asInstanceOf[js.Any]))
      pullRequestTargets.foreach(__v => __obj.update("pullRequestTargets", __v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.update("title", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequest]
    }
  }

  /**
    * Metadata about the pull request that is used when comparing the pull request source with its destination.
    */
  @js.native
  trait PullRequestCreatedEventMetadata extends js.Object {
    var destinationCommitId: js.UndefOr[CommitId]
    var mergeBase: js.UndefOr[CommitId]
    var repositoryName: js.UndefOr[RepositoryName]
    var sourceCommitId: js.UndefOr[CommitId]
  }

  object PullRequestCreatedEventMetadata {
    def apply(
        destinationCommitId: js.UndefOr[CommitId] = js.undefined,
        mergeBase: js.UndefOr[CommitId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        sourceCommitId: js.UndefOr[CommitId] = js.undefined
    ): PullRequestCreatedEventMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      destinationCommitId.foreach(__v => __obj.update("destinationCommitId", __v.asInstanceOf[js.Any]))
      mergeBase.foreach(__v => __obj.update("mergeBase", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      sourceCommitId.foreach(__v => __obj.update("sourceCommitId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestCreatedEventMetadata]
    }
  }

  /**
    * Returns information about a pull request event.
    */
  @js.native
  trait PullRequestEvent extends js.Object {
    var actorArn: js.UndefOr[Arn]
    var eventDate: js.UndefOr[EventDate]
    var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata]
    var pullRequestEventType: js.UndefOr[PullRequestEventType]
    var pullRequestId: js.UndefOr[PullRequestId]
    var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata]
    var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata]
    var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata]
  }

  object PullRequestEvent {
    def apply(
        actorArn: js.UndefOr[Arn] = js.undefined,
        eventDate: js.UndefOr[EventDate] = js.undefined,
        pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.undefined,
        pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined,
        pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
        pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] =
          js.undefined,
        pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] =
          js.undefined,
        pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.undefined
    ): PullRequestEvent = {
      val __obj = js.Dictionary.empty[js.Any]
      actorArn.foreach(__v => __obj.update("actorArn", __v.asInstanceOf[js.Any]))
      eventDate.foreach(__v => __obj.update("eventDate", __v.asInstanceOf[js.Any]))
      pullRequestCreatedEventMetadata.foreach(
        __v => __obj.update("pullRequestCreatedEventMetadata", __v.asInstanceOf[js.Any])
      )
      pullRequestEventType.foreach(__v => __obj.update("pullRequestEventType", __v.asInstanceOf[js.Any]))
      pullRequestId.foreach(__v => __obj.update("pullRequestId", __v.asInstanceOf[js.Any]))
      pullRequestMergedStateChangedEventMetadata.foreach(
        __v => __obj.update("pullRequestMergedStateChangedEventMetadata", __v.asInstanceOf[js.Any])
      )
      pullRequestSourceReferenceUpdatedEventMetadata.foreach(
        __v => __obj.update("pullRequestSourceReferenceUpdatedEventMetadata", __v.asInstanceOf[js.Any])
      )
      pullRequestStatusChangedEventMetadata.foreach(
        __v => __obj.update("pullRequestStatusChangedEventMetadata", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PullRequestEvent]
    }
  }

  object PullRequestEventTypeEnum {
    val PULL_REQUEST_CREATED                  = "PULL_REQUEST_CREATED"
    val PULL_REQUEST_STATUS_CHANGED           = "PULL_REQUEST_STATUS_CHANGED"
    val PULL_REQUEST_SOURCE_REFERENCE_UPDATED = "PULL_REQUEST_SOURCE_REFERENCE_UPDATED"
    val PULL_REQUEST_MERGE_STATE_CHANGED      = "PULL_REQUEST_MERGE_STATE_CHANGED"

    val values = IndexedSeq(
      PULL_REQUEST_CREATED,
      PULL_REQUEST_STATUS_CHANGED,
      PULL_REQUEST_SOURCE_REFERENCE_UPDATED,
      PULL_REQUEST_MERGE_STATE_CHANGED
    )
  }

  /**
    * Returns information about the change in the merge state for a pull request event.
    */
  @js.native
  trait PullRequestMergedStateChangedEventMetadata extends js.Object {
    var destinationReference: js.UndefOr[ReferenceName]
    var mergeMetadata: js.UndefOr[MergeMetadata]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PullRequestMergedStateChangedEventMetadata {
    def apply(
        destinationReference: js.UndefOr[ReferenceName] = js.undefined,
        mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PullRequestMergedStateChangedEventMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      destinationReference.foreach(__v => __obj.update("destinationReference", __v.asInstanceOf[js.Any]))
      mergeMetadata.foreach(__v => __obj.update("mergeMetadata", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
    }
  }

  /**
    * Information about an update to the source branch of a pull request.
    */
  @js.native
  trait PullRequestSourceReferenceUpdatedEventMetadata extends js.Object {
    var afterCommitId: js.UndefOr[CommitId]
    var beforeCommitId: js.UndefOr[CommitId]
    var mergeBase: js.UndefOr[CommitId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PullRequestSourceReferenceUpdatedEventMetadata {
    def apply(
        afterCommitId: js.UndefOr[CommitId] = js.undefined,
        beforeCommitId: js.UndefOr[CommitId] = js.undefined,
        mergeBase: js.UndefOr[CommitId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PullRequestSourceReferenceUpdatedEventMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      afterCommitId.foreach(__v => __obj.update("afterCommitId", __v.asInstanceOf[js.Any]))
      beforeCommitId.foreach(__v => __obj.update("beforeCommitId", __v.asInstanceOf[js.Any]))
      mergeBase.foreach(__v => __obj.update("mergeBase", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
    }
  }

  /**
    * Information about a change to the status of a pull request.
    */
  @js.native
  trait PullRequestStatusChangedEventMetadata extends js.Object {
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
  }

  object PullRequestStatusChangedEventMetadata {
    def apply(
        pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
    ): PullRequestStatusChangedEventMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      pullRequestStatus.foreach(__v => __obj.update("pullRequestStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
    }
  }

  object PullRequestStatusEnumEnum {
    val OPEN   = "OPEN"
    val CLOSED = "CLOSED"

    val values = IndexedSeq(OPEN, CLOSED)
  }

  /**
    * Returns information about a pull request target.
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
    def apply(
        destinationCommit: js.UndefOr[CommitId] = js.undefined,
        destinationReference: js.UndefOr[ReferenceName] = js.undefined,
        mergeBase: js.UndefOr[CommitId] = js.undefined,
        mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        sourceCommit: js.UndefOr[CommitId] = js.undefined,
        sourceReference: js.UndefOr[ReferenceName] = js.undefined
    ): PullRequestTarget = {
      val __obj = js.Dictionary.empty[js.Any]
      destinationCommit.foreach(__v => __obj.update("destinationCommit", __v.asInstanceOf[js.Any]))
      destinationReference.foreach(__v => __obj.update("destinationReference", __v.asInstanceOf[js.Any]))
      mergeBase.foreach(__v => __obj.update("mergeBase", __v.asInstanceOf[js.Any]))
      mergeMetadata.foreach(__v => __obj.update("mergeMetadata", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      sourceCommit.foreach(__v => __obj.update("sourceCommit", __v.asInstanceOf[js.Any]))
      sourceReference.foreach(__v => __obj.update("sourceReference", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullRequestTarget]
    }
  }

  /**
    * Information about a file that will be added or updated as part of a commit.
    */
  @js.native
  trait PutFileEntry extends js.Object {
    var filePath: Path
    var fileContent: js.UndefOr[FileContent]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var sourceFile: js.UndefOr[SourceFileSpecifier]
  }

  object PutFileEntry {
    def apply(
        filePath: Path,
        fileContent: js.UndefOr[FileContent] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined,
        sourceFile: js.UndefOr[SourceFileSpecifier] = js.undefined
    ): PutFileEntry = {
      val __obj = js.Dictionary[js.Any](
        "filePath" -> filePath.asInstanceOf[js.Any]
      )

      fileContent.foreach(__v => __obj.update("fileContent", __v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.update("fileMode", __v.asInstanceOf[js.Any]))
      sourceFile.foreach(__v => __obj.update("sourceFile", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary[js.Any](
        "branchName"     -> branchName.asInstanceOf[js.Any],
        "fileContent"    -> fileContent.asInstanceOf[js.Any],
        "filePath"       -> filePath.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      commitMessage.foreach(__v => __obj.update("commitMessage", __v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.update("email", __v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.update("fileMode", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      parentCommitId.foreach(__v => __obj.update("parentCommitId", __v.asInstanceOf[js.Any]))
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
    def apply(
        blobId: ObjectId,
        commitId: ObjectId,
        treeId: ObjectId
    ): PutFileOutput = {
      val __obj = js.Dictionary[js.Any](
        "blobId"   -> blobId.asInstanceOf[js.Any],
        "commitId" -> commitId.asInstanceOf[js.Any],
        "treeId"   -> treeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutFileOutput]
    }
  }

  /**
    * Represents the input ofa put repository triggers operation.
    */
  @js.native
  trait PutRepositoryTriggersInput extends js.Object {
    var repositoryName: RepositoryName
    var triggers: RepositoryTriggersList
  }

  object PutRepositoryTriggersInput {
    def apply(
        repositoryName: RepositoryName,
        triggers: RepositoryTriggersList
    ): PutRepositoryTriggersInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "triggers"       -> triggers.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutRepositoryTriggersInput]
    }
  }

  /**
    * Represents the output of a put repository triggers operation.
    */
  @js.native
  trait PutRepositoryTriggersOutput extends js.Object {
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId]
  }

  object PutRepositoryTriggersOutput {
    def apply(
        configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined
    ): PutRepositoryTriggersOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      configurationId.foreach(__v => __obj.update("configurationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRepositoryTriggersOutput]
    }
  }

  object RelativeFileVersionEnumEnum {
    val BEFORE = "BEFORE"
    val AFTER  = "AFTER"

    val values = IndexedSeq(BEFORE, AFTER)
  }

  /**
    * Information about a repository.
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
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      accountId.foreach(__v => __obj.update("accountId", __v.asInstanceOf[js.Any]))
      cloneUrlHttp.foreach(__v => __obj.update("cloneUrlHttp", __v.asInstanceOf[js.Any]))
      cloneUrlSsh.foreach(__v => __obj.update("cloneUrlSsh", __v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.update("creationDate", __v.asInstanceOf[js.Any]))
      defaultBranch.foreach(__v => __obj.update("defaultBranch", __v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.update("lastModifiedDate", __v.asInstanceOf[js.Any]))
      repositoryDescription.foreach(__v => __obj.update("repositoryDescription", __v.asInstanceOf[js.Any]))
      repositoryId.foreach(__v => __obj.update("repositoryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryMetadata]
    }
  }

  /**
    * Information about a repository name and ID.
    */
  @js.native
  trait RepositoryNameIdPair extends js.Object {
    var repositoryId: js.UndefOr[RepositoryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object RepositoryNameIdPair {
    def apply(
        repositoryId: js.UndefOr[RepositoryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): RepositoryNameIdPair = {
      val __obj = js.Dictionary.empty[js.Any]
      repositoryId.foreach(__v => __obj.update("repositoryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryNameIdPair]
    }
  }

  /**
    * Information about a trigger for a repository.
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
    def apply(
        destinationArn: Arn,
        events: RepositoryTriggerEventList,
        name: RepositoryTriggerName,
        branches: js.UndefOr[BranchNameList] = js.undefined,
        customData: js.UndefOr[RepositoryTriggerCustomData] = js.undefined
    ): RepositoryTrigger = {
      val __obj = js.Dictionary[js.Any](
        "destinationArn" -> destinationArn.asInstanceOf[js.Any],
        "events"         -> events.asInstanceOf[js.Any],
        "name"           -> name.asInstanceOf[js.Any]
      )

      branches.foreach(__v => __obj.update("branches", __v.asInstanceOf[js.Any]))
      customData.foreach(__v => __obj.update("customData", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryTrigger]
    }
  }

  object RepositoryTriggerEventEnumEnum {
    val all             = "all"
    val updateReference = "updateReference"
    val createReference = "createReference"
    val deleteReference = "deleteReference"

    val values = IndexedSeq(all, updateReference, createReference, deleteReference)
  }

  /**
    * A trigger failed to run.
    */
  @js.native
  trait RepositoryTriggerExecutionFailure extends js.Object {
    var failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage]
    var trigger: js.UndefOr[RepositoryTriggerName]
  }

  object RepositoryTriggerExecutionFailure {
    def apply(
        failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage] = js.undefined,
        trigger: js.UndefOr[RepositoryTriggerName] = js.undefined
    ): RepositoryTriggerExecutionFailure = {
      val __obj = js.Dictionary.empty[js.Any]
      failureMessage.foreach(__v => __obj.update("failureMessage", __v.asInstanceOf[js.Any]))
      trigger.foreach(__v => __obj.update("trigger", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
    }
  }

  /**
    * Information about the file mode changes.
    */
  @js.native
  trait SetFileModeEntry extends js.Object {
    var fileMode: FileModeTypeEnum
    var filePath: Path
  }

  object SetFileModeEntry {
    def apply(
        fileMode: FileModeTypeEnum,
        filePath: Path
    ): SetFileModeEntry = {
      val __obj = js.Dictionary[js.Any](
        "fileMode" -> fileMode.asInstanceOf[js.Any],
        "filePath" -> filePath.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetFileModeEntry]
    }
  }

  object SortByEnumEnum {
    val repositoryName   = "repositoryName"
    val lastModifiedDate = "lastModifiedDate"

    val values = IndexedSeq(repositoryName, lastModifiedDate)
  }

  /**
    * Information about a source file that is part of changes made in a commit.
    */
  @js.native
  trait SourceFileSpecifier extends js.Object {
    var filePath: Path
    var isMove: js.UndefOr[IsMove]
  }

  object SourceFileSpecifier {
    def apply(
        filePath: Path,
        isMove: js.UndefOr[IsMove] = js.undefined
    ): SourceFileSpecifier = {
      val __obj = js.Dictionary[js.Any](
        "filePath" -> filePath.asInstanceOf[js.Any]
      )

      isMove.foreach(__v => __obj.update("isMove", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceFileSpecifier]
    }
  }

  /**
    * Returns information about a submodule reference in a repository folder.
    */
  @js.native
  trait SubModule extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var commitId: js.UndefOr[ObjectId]
    var relativePath: js.UndefOr[Path]
  }

  object SubModule {
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        commitId: js.UndefOr[ObjectId] = js.undefined,
        relativePath: js.UndefOr[Path] = js.undefined
    ): SubModule = {
      val __obj = js.Dictionary.empty[js.Any]
      absolutePath.foreach(__v => __obj.update("absolutePath", __v.asInstanceOf[js.Any]))
      commitId.foreach(__v => __obj.update("commitId", __v.asInstanceOf[js.Any]))
      relativePath.foreach(__v => __obj.update("relativePath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubModule]
    }
  }

  /**
    * Returns information about a symbolic link in a repository folder.
    */
  @js.native
  trait SymbolicLink extends js.Object {
    var absolutePath: js.UndefOr[Path]
    var blobId: js.UndefOr[ObjectId]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var relativePath: js.UndefOr[Path]
  }

  object SymbolicLink {
    def apply(
        absolutePath: js.UndefOr[Path] = js.undefined,
        blobId: js.UndefOr[ObjectId] = js.undefined,
        fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined,
        relativePath: js.UndefOr[Path] = js.undefined
    ): SymbolicLink = {
      val __obj = js.Dictionary.empty[js.Any]
      absolutePath.foreach(__v => __obj.update("absolutePath", __v.asInstanceOf[js.Any]))
      blobId.foreach(__v => __obj.update("blobId", __v.asInstanceOf[js.Any]))
      fileMode.foreach(__v => __obj.update("fileMode", __v.asInstanceOf[js.Any]))
      relativePath.foreach(__v => __obj.update("relativePath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SymbolicLink]
    }
  }

  /**
    * Returns information about a target for a pull request.
    */
  @js.native
  trait Target extends js.Object {
    var repositoryName: RepositoryName
    var sourceReference: ReferenceName
    var destinationReference: js.UndefOr[ReferenceName]
  }

  object Target {
    def apply(
        repositoryName: RepositoryName,
        sourceReference: ReferenceName,
        destinationReference: js.UndefOr[ReferenceName] = js.undefined
    ): Target = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName"  -> repositoryName.asInstanceOf[js.Any],
        "sourceReference" -> sourceReference.asInstanceOf[js.Any]
      )

      destinationReference.foreach(__v => __obj.update("destinationReference", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
    }
  }

  /**
    * Represents the input of a test repository triggers operation.
    */
  @js.native
  trait TestRepositoryTriggersInput extends js.Object {
    var repositoryName: RepositoryName
    var triggers: RepositoryTriggersList
  }

  object TestRepositoryTriggersInput {
    def apply(
        repositoryName: RepositoryName,
        triggers: RepositoryTriggersList
    ): TestRepositoryTriggersInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "triggers"       -> triggers.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TestRepositoryTriggersInput]
    }
  }

  /**
    * Represents the output of a test repository triggers operation.
    */
  @js.native
  trait TestRepositoryTriggersOutput extends js.Object {
    var failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList]
    var successfulExecutions: js.UndefOr[RepositoryTriggerNameList]
  }

  object TestRepositoryTriggersOutput {
    def apply(
        failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList] = js.undefined,
        successfulExecutions: js.UndefOr[RepositoryTriggerNameList] = js.undefined
    ): TestRepositoryTriggersOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      failedExecutions.foreach(__v => __obj.update("failedExecutions", __v.asInstanceOf[js.Any]))
      successfulExecutions.foreach(__v => __obj.update("successfulExecutions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestRepositoryTriggersOutput]
    }
  }

  @js.native
  trait UpdateCommentInput extends js.Object {
    var commentId: CommentId
    var content: Content
  }

  object UpdateCommentInput {
    def apply(
        commentId: CommentId,
        content: Content
    ): UpdateCommentInput = {
      val __obj = js.Dictionary[js.Any](
        "commentId" -> commentId.asInstanceOf[js.Any],
        "content"   -> content.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateCommentInput]
    }
  }

  @js.native
  trait UpdateCommentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object UpdateCommentOutput {
    def apply(
        comment: js.UndefOr[Comment] = js.undefined
    ): UpdateCommentOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      comment.foreach(__v => __obj.update("comment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCommentOutput]
    }
  }

  /**
    * Represents the input of an update default branch operation.
    */
  @js.native
  trait UpdateDefaultBranchInput extends js.Object {
    var defaultBranchName: BranchName
    var repositoryName: RepositoryName
  }

  object UpdateDefaultBranchInput {
    def apply(
        defaultBranchName: BranchName,
        repositoryName: RepositoryName
    ): UpdateDefaultBranchInput = {
      val __obj = js.Dictionary[js.Any](
        "defaultBranchName" -> defaultBranchName.asInstanceOf[js.Any],
        "repositoryName"    -> repositoryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateDefaultBranchInput]
    }
  }

  @js.native
  trait UpdatePullRequestDescriptionInput extends js.Object {
    var description: Description
    var pullRequestId: PullRequestId
  }

  object UpdatePullRequestDescriptionInput {
    def apply(
        description: Description,
        pullRequestId: PullRequestId
    ): UpdatePullRequestDescriptionInput = {
      val __obj = js.Dictionary[js.Any](
        "description"   -> description.asInstanceOf[js.Any],
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
    def apply(
        pullRequest: PullRequest
    ): UpdatePullRequestDescriptionOutput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        pullRequestId: PullRequestId,
        pullRequestStatus: PullRequestStatusEnum
    ): UpdatePullRequestStatusInput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequestId"     -> pullRequestId.asInstanceOf[js.Any],
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
    def apply(
        pullRequest: PullRequest
    ): UpdatePullRequestStatusOutput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        pullRequestId: PullRequestId,
        title: Title
    ): UpdatePullRequestTitleInput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequestId" -> pullRequestId.asInstanceOf[js.Any],
        "title"         -> title.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdatePullRequestTitleInput]
    }
  }

  @js.native
  trait UpdatePullRequestTitleOutput extends js.Object {
    var pullRequest: PullRequest
  }

  object UpdatePullRequestTitleOutput {
    def apply(
        pullRequest: PullRequest
    ): UpdatePullRequestTitleOutput = {
      val __obj = js.Dictionary[js.Any](
        "pullRequest" -> pullRequest.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdatePullRequestTitleOutput]
    }
  }

  /**
    * Represents the input of an update repository description operation.
    */
  @js.native
  trait UpdateRepositoryDescriptionInput extends js.Object {
    var repositoryName: RepositoryName
    var repositoryDescription: js.UndefOr[RepositoryDescription]
  }

  object UpdateRepositoryDescriptionInput {
    def apply(
        repositoryName: RepositoryName,
        repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
    ): UpdateRepositoryDescriptionInput = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      repositoryDescription.foreach(__v => __obj.update("repositoryDescription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRepositoryDescriptionInput]
    }
  }

  /**
    * Represents the input of an update repository description operation.
    */
  @js.native
  trait UpdateRepositoryNameInput extends js.Object {
    var newName: RepositoryName
    var oldName: RepositoryName
  }

  object UpdateRepositoryNameInput {
    def apply(
        newName: RepositoryName,
        oldName: RepositoryName
    ): UpdateRepositoryNameInput = {
      val __obj = js.Dictionary[js.Any](
        "newName" -> newName.asInstanceOf[js.Any],
        "oldName" -> oldName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateRepositoryNameInput]
    }
  }

  /**
    * Information about the user who made a specified commit.
    */
  @js.native
  trait UserInfo extends js.Object {
    var date: js.UndefOr[Date]
    var email: js.UndefOr[Email]
    var name: js.UndefOr[Name]
  }

  object UserInfo {
    def apply(
        date: js.UndefOr[Date] = js.undefined,
        email: js.UndefOr[Email] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): UserInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      date.foreach(__v => __obj.update("date", __v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.update("email", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserInfo]
    }
  }
}
