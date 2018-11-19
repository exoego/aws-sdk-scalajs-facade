package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object codecommit {
  type AccountId = String
  type AdditionalData = String
  type Arn = String
  type BranchName = String
  type BranchNameList = js.Array[BranchName]
  type ChangeTypeEnum = String
  type ClientRequestToken = String
  type CloneUrlHttp = String
  type CloneUrlSsh = String
  type CommentId = String
  type Comments = js.Array[Comment]
  type CommentsForComparedCommitData = js.Array[CommentsForComparedCommit]
  type CommentsForPullRequestData = js.Array[CommentsForPullRequest]
  type CommitId = String
  type CommitName = String
  type Content = String
  type CreationDate = js.Date
  type Date = String
  type Description = String
  type DifferenceList = js.Array[Difference]
  type Email = String
  type EventDate = js.Date
  type FileContent = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type FileList = js.Array[File]
  type FileModeTypeEnum = String
  type FolderList = js.Array[Folder]
  type IsCommentDeleted = Boolean
  type IsMergeable = Boolean
  type IsMerged = Boolean
  type KeepEmptyFolders = Boolean
  type LastModifiedDate = js.Date
  type Limit = Int
  type MaxResults = Int
  type MergeOptionTypeEnum = String
  type Message = String
  type Mode = String
  type Name = String
  type NextToken = String
  type ObjectId = String
  type ObjectSize = Double
  type OrderEnum = String
  type ParentList = js.Array[ObjectId]
  type Path = String
  type Position = Double
  type PullRequestEventList = js.Array[PullRequestEvent]
  type PullRequestEventType = String
  type PullRequestId = String
  type PullRequestIdList = js.Array[PullRequestId]
  type PullRequestStatusEnum = String
  type PullRequestTargetList = js.Array[PullRequestTarget]
  type ReferenceName = String
  type RelativeFileVersionEnum = String
  type RepositoryDescription = String
  type RepositoryId = String
  type RepositoryMetadataList = js.Array[RepositoryMetadata]
  type RepositoryName = String
  type RepositoryNameIdPairList = js.Array[RepositoryNameIdPair]
  type RepositoryNameList = js.Array[RepositoryName]
  type RepositoryNotFoundList = js.Array[RepositoryName]
  type RepositoryTriggerCustomData = String
  type RepositoryTriggerEventEnum = String
  type RepositoryTriggerEventList = js.Array[RepositoryTriggerEventEnum]
  type RepositoryTriggerExecutionFailureList = js.Array[RepositoryTriggerExecutionFailure]
  type RepositoryTriggerExecutionFailureMessage = String
  type RepositoryTriggerName = String
  type RepositoryTriggerNameList = js.Array[RepositoryTriggerName]
  type RepositoryTriggersConfigurationId = String
  type RepositoryTriggersList = js.Array[RepositoryTrigger]
  type SortByEnum = String
  type SubModuleList = js.Array[SubModule]
  type SymbolicLinkList = js.Array[SymbolicLink]
  type TargetList = js.Array[Target]
  type Title = String
  type blob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
}

package codecommit {
  @js.native
  @JSImport("aws-sdk", "CodeCommit")
  class CodeCommit(config: AWSConfig) extends js.Object {
    def batchGetRepositories(params: BatchGetRepositoriesInput): Request[BatchGetRepositoriesOutput] = js.native
    def createBranch(params: CreateBranchInput): Request[js.Object] = js.native
    def createPullRequest(params: CreatePullRequestInput): Request[CreatePullRequestOutput] = js.native
    def createRepository(params: CreateRepositoryInput): Request[CreateRepositoryOutput] = js.native
    def deleteBranch(params: DeleteBranchInput): Request[DeleteBranchOutput] = js.native
    def deleteCommentContent(params: DeleteCommentContentInput): Request[DeleteCommentContentOutput] = js.native
    def deleteFile(params: DeleteFileInput): Request[DeleteFileOutput] = js.native
    def deleteRepository(params: DeleteRepositoryInput): Request[DeleteRepositoryOutput] = js.native
    def describePullRequestEvents(params: DescribePullRequestEventsInput): Request[DescribePullRequestEventsOutput] = js.native
    def getBlob(params: GetBlobInput): Request[GetBlobOutput] = js.native
    def getBranch(params: GetBranchInput): Request[GetBranchOutput] = js.native
    def getComment(params: GetCommentInput): Request[GetCommentOutput] = js.native
    def getCommentsForComparedCommit(params: GetCommentsForComparedCommitInput): Request[GetCommentsForComparedCommitOutput] = js.native
    def getCommentsForPullRequest(params: GetCommentsForPullRequestInput): Request[GetCommentsForPullRequestOutput] = js.native
    def getCommit(params: GetCommitInput): Request[GetCommitOutput] = js.native
    def getDifferences(params: GetDifferencesInput): Request[GetDifferencesOutput] = js.native
    def getFile(params: GetFileInput): Request[GetFileOutput] = js.native
    def getFolder(params: GetFolderInput): Request[GetFolderOutput] = js.native
    def getMergeConflicts(params: GetMergeConflictsInput): Request[GetMergeConflictsOutput] = js.native
    def getPullRequest(params: GetPullRequestInput): Request[GetPullRequestOutput] = js.native
    def getRepository(params: GetRepositoryInput): Request[GetRepositoryOutput] = js.native
    def getRepositoryTriggers(params: GetRepositoryTriggersInput): Request[GetRepositoryTriggersOutput] = js.native
    def listBranches(params: ListBranchesInput): Request[ListBranchesOutput] = js.native
    def listPullRequests(params: ListPullRequestsInput): Request[ListPullRequestsOutput] = js.native
    def listRepositories(params: ListRepositoriesInput): Request[ListRepositoriesOutput] = js.native
    def mergePullRequestByFastForward(params: MergePullRequestByFastForwardInput): Request[MergePullRequestByFastForwardOutput] = js.native
    def postCommentForComparedCommit(params: PostCommentForComparedCommitInput): Request[PostCommentForComparedCommitOutput] = js.native
    def postCommentForPullRequest(params: PostCommentForPullRequestInput): Request[PostCommentForPullRequestOutput] = js.native
    def postCommentReply(params: PostCommentReplyInput): Request[PostCommentReplyOutput] = js.native
    def putFile(params: PutFileInput): Request[PutFileOutput] = js.native
    def putRepositoryTriggers(params: PutRepositoryTriggersInput): Request[PutRepositoryTriggersOutput] = js.native
    def testRepositoryTriggers(params: TestRepositoryTriggersInput): Request[TestRepositoryTriggersOutput] = js.native
    def updateComment(params: UpdateCommentInput): Request[UpdateCommentOutput] = js.native
    def updateDefaultBranch(params: UpdateDefaultBranchInput): Request[js.Object] = js.native
    def updatePullRequestDescription(params: UpdatePullRequestDescriptionInput): Request[UpdatePullRequestDescriptionOutput] = js.native
    def updatePullRequestStatus(params: UpdatePullRequestStatusInput): Request[UpdatePullRequestStatusOutput] = js.native
    def updatePullRequestTitle(params: UpdatePullRequestTitleInput): Request[UpdatePullRequestTitleOutput] = js.native
    def updateRepositoryDescription(params: UpdateRepositoryDescriptionInput): Request[js.Object] = js.native
    def updateRepositoryName(params: UpdateRepositoryNameInput): Request[js.Object] = js.native
  }

  /**
   * <p>Represents the input of a batch get repositories operation.</p>
   */
  @js.native
  trait BatchGetRepositoriesInput extends js.Object {
    var repositoryNames: js.UndefOr[RepositoryNameList]
  }

  object BatchGetRepositoriesInput {
    def apply(
      repositoryNames: js.UndefOr[RepositoryNameList] = js.undefined): BatchGetRepositoriesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryNames" -> repositoryNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetRepositoriesInput]
    }
  }

  /**
   * <p>Represents the output of a batch get repositories operation.</p>
   */
  @js.native
  trait BatchGetRepositoriesOutput extends js.Object {
    var repositories: js.UndefOr[RepositoryMetadataList]
    var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList]
  }

  object BatchGetRepositoriesOutput {
    def apply(
      repositories: js.UndefOr[RepositoryMetadataList] = js.undefined,
      repositoriesNotFound: js.UndefOr[RepositoryNotFoundList] = js.undefined): BatchGetRepositoriesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositories" -> repositories.map { x => x.asInstanceOf[js.Any] },
        "repositoriesNotFound" -> repositoriesNotFound.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetRepositoriesOutput]
    }
  }

  /**
   * <p>Returns information about a specific Git blob object.</p>
   */
  @js.native
  trait BlobMetadata extends js.Object {
    var blobId: js.UndefOr[ObjectId]
    var path: js.UndefOr[Path]
    var mode: js.UndefOr[Mode]
  }

  object BlobMetadata {
    def apply(
      blobId: js.UndefOr[ObjectId] = js.undefined,
      path: js.UndefOr[Path] = js.undefined,
      mode: js.UndefOr[Mode] = js.undefined): BlobMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "blobId" -> blobId.map { x => x.asInstanceOf[js.Any] },
        "path" -> path.map { x => x.asInstanceOf[js.Any] },
        "mode" -> mode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlobMetadata]
    }
  }

  /**
   * <p>Returns information about a branch.</p>
   */
  @js.native
  trait BranchInfo extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var commitId: js.UndefOr[CommitId]
  }

  object BranchInfo {
    def apply(
      branchName: js.UndefOr[BranchName] = js.undefined,
      commitId: js.UndefOr[CommitId] = js.undefined): BranchInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BranchInfo]
    }
  }

  object ChangeTypeEnumEnum {
    val A = "A"
    val M = "M"
    val D = "D"

    val values = IndexedSeq(A, M, D)
  }

  /**
   * <p>Returns information about a specific comment.</p>
   */
  @js.native
  trait Comment extends js.Object {
    var inReplyTo: js.UndefOr[CommentId]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
    var authorArn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var content: js.UndefOr[Content]
    var creationDate: js.UndefOr[CreationDate]
    var commentId: js.UndefOr[CommentId]
    var deleted: js.UndefOr[IsCommentDeleted]
  }

  object Comment {
    def apply(
      inReplyTo: js.UndefOr[CommentId] = js.undefined,
      lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined,
      authorArn: js.UndefOr[Arn] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      content: js.UndefOr[Content] = js.undefined,
      creationDate: js.UndefOr[CreationDate] = js.undefined,
      commentId: js.UndefOr[CommentId] = js.undefined,
      deleted: js.UndefOr[IsCommentDeleted] = js.undefined): Comment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inReplyTo" -> inReplyTo.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "authorArn" -> authorArn.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "content" -> content.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "commentId" -> commentId.map { x => x.asInstanceOf[js.Any] },
        "deleted" -> deleted.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Comment]
    }
  }

  /**
   * <p>Returns information about comments on the comparison between two commits.</p>
   */
  @js.native
  trait CommentsForComparedCommit extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var location: js.UndefOr[Location]
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var comments: js.UndefOr[Comments]
    var beforeCommitId: js.UndefOr[CommitId]
  }

  object CommentsForComparedCommit {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      location: js.UndefOr[Location] = js.undefined,
      afterBlobId: js.UndefOr[ObjectId] = js.undefined,
      afterCommitId: js.UndefOr[CommitId] = js.undefined,
      beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
      comments: js.UndefOr[Comments] = js.undefined,
      beforeCommitId: js.UndefOr[CommitId] = js.undefined): CommentsForComparedCommit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "afterBlobId" -> afterBlobId.map { x => x.asInstanceOf[js.Any] },
        "afterCommitId" -> afterCommitId.map { x => x.asInstanceOf[js.Any] },
        "beforeBlobId" -> beforeBlobId.map { x => x.asInstanceOf[js.Any] },
        "comments" -> comments.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitId" -> beforeCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CommentsForComparedCommit]
    }
  }

  /**
   * <p>Returns information about comments on a pull request.</p>
   */
  @js.native
  trait CommentsForPullRequest extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var location: js.UndefOr[Location]
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var pullRequestId: js.UndefOr[PullRequestId]
    var comments: js.UndefOr[Comments]
    var beforeCommitId: js.UndefOr[CommitId]
  }

  object CommentsForPullRequest {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      location: js.UndefOr[Location] = js.undefined,
      afterBlobId: js.UndefOr[ObjectId] = js.undefined,
      afterCommitId: js.UndefOr[CommitId] = js.undefined,
      beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      comments: js.UndefOr[Comments] = js.undefined,
      beforeCommitId: js.UndefOr[CommitId] = js.undefined): CommentsForPullRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "afterBlobId" -> afterBlobId.map { x => x.asInstanceOf[js.Any] },
        "afterCommitId" -> afterCommitId.map { x => x.asInstanceOf[js.Any] },
        "beforeBlobId" -> beforeBlobId.map { x => x.asInstanceOf[js.Any] },
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "comments" -> comments.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitId" -> beforeCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CommentsForPullRequest]
    }
  }

  /**
   * <p>Returns information about a specific commit.</p>
   */
  @js.native
  trait Commit extends js.Object {
    var author: js.UndefOr[UserInfo]
    var parents: js.UndefOr[ParentList]
    var treeId: js.UndefOr[ObjectId]
    var commitId: js.UndefOr[ObjectId]
    var additionalData: js.UndefOr[AdditionalData]
    var message: js.UndefOr[Message]
    var committer: js.UndefOr[UserInfo]
  }

  object Commit {
    def apply(
      author: js.UndefOr[UserInfo] = js.undefined,
      parents: js.UndefOr[ParentList] = js.undefined,
      treeId: js.UndefOr[ObjectId] = js.undefined,
      commitId: js.UndefOr[ObjectId] = js.undefined,
      additionalData: js.UndefOr[AdditionalData] = js.undefined,
      message: js.UndefOr[Message] = js.undefined,
      committer: js.UndefOr[UserInfo] = js.undefined): Commit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "author" -> author.map { x => x.asInstanceOf[js.Any] },
        "parents" -> parents.map { x => x.asInstanceOf[js.Any] },
        "treeId" -> treeId.map { x => x.asInstanceOf[js.Any] },
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] },
        "additionalData" -> additionalData.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "committer" -> committer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Commit]
    }
  }

  /**
   * <p>Represents the input of a create branch operation.</p>
   */
  @js.native
  trait CreateBranchInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var branchName: js.UndefOr[BranchName]
    var commitId: js.UndefOr[CommitId]
  }

  object CreateBranchInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      commitId: js.UndefOr[CommitId] = js.undefined): CreateBranchInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBranchInput]
    }
  }

  @js.native
  trait CreatePullRequestInput extends js.Object {
    var title: js.UndefOr[Title]
    var description: js.UndefOr[Description]
    var targets: js.UndefOr[TargetList]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object CreatePullRequestInput {
    def apply(
      title: js.UndefOr[Title] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      targets: js.UndefOr[TargetList] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined): CreatePullRequestInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "title" -> title.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "targets" -> targets.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePullRequestInput]
    }
  }

  @js.native
  trait CreatePullRequestOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object CreatePullRequestOutput {
    def apply(
      pullRequest: js.UndefOr[PullRequest] = js.undefined): CreatePullRequestOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequest" -> pullRequest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePullRequestOutput]
    }
  }

  /**
   * <p>Represents the input of a create repository operation.</p>
   */
  @js.native
  trait CreateRepositoryInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var repositoryDescription: js.UndefOr[RepositoryDescription]
  }

  object CreateRepositoryInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined): CreateRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "repositoryDescription" -> repositoryDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRepositoryInput]
    }
  }

  /**
   * <p>Represents the output of a create repository operation.</p>
   */
  @js.native
  trait CreateRepositoryOutput extends js.Object {
    var repositoryMetadata: js.UndefOr[RepositoryMetadata]
  }

  object CreateRepositoryOutput {
    def apply(
      repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined): CreateRepositoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryMetadata" -> repositoryMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRepositoryOutput]
    }
  }

  /**
   * <p>Represents the input of a delete branch operation.</p>
   */
  @js.native
  trait DeleteBranchInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var branchName: js.UndefOr[BranchName]
  }

  object DeleteBranchInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined): DeleteBranchInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBranchInput]
    }
  }

  /**
   * <p>Represents the output of a delete branch operation.</p>
   */
  @js.native
  trait DeleteBranchOutput extends js.Object {
    var deletedBranch: js.UndefOr[BranchInfo]
  }

  object DeleteBranchOutput {
    def apply(
      deletedBranch: js.UndefOr[BranchInfo] = js.undefined): DeleteBranchOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deletedBranch" -> deletedBranch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBranchOutput]
    }
  }

  @js.native
  trait DeleteCommentContentInput extends js.Object {
    var commentId: js.UndefOr[CommentId]
  }

  object DeleteCommentContentInput {
    def apply(
      commentId: js.UndefOr[CommentId] = js.undefined): DeleteCommentContentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "commentId" -> commentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCommentContentInput]
    }
  }

  @js.native
  trait DeleteCommentContentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object DeleteCommentContentOutput {
    def apply(
      comment: js.UndefOr[Comment] = js.undefined): DeleteCommentContentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "comment" -> comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCommentContentOutput]
    }
  }

  @js.native
  trait DeleteFileInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var name: js.UndefOr[Name]
    var keepEmptyFolders: js.UndefOr[KeepEmptyFolders]
    var email: js.UndefOr[Email]
    var parentCommitId: js.UndefOr[CommitId]
    var filePath: js.UndefOr[Path]
    var branchName: js.UndefOr[BranchName]
    var commitMessage: js.UndefOr[Message]
  }

  object DeleteFileInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined,
      email: js.UndefOr[Email] = js.undefined,
      parentCommitId: js.UndefOr[CommitId] = js.undefined,
      filePath: js.UndefOr[Path] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      commitMessage: js.UndefOr[Message] = js.undefined): DeleteFileInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "keepEmptyFolders" -> keepEmptyFolders.map { x => x.asInstanceOf[js.Any] },
        "email" -> email.map { x => x.asInstanceOf[js.Any] },
        "parentCommitId" -> parentCommitId.map { x => x.asInstanceOf[js.Any] },
        "filePath" -> filePath.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "commitMessage" -> commitMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileInput]
    }
  }

  @js.native
  trait DeleteFileOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var blobId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
    var filePath: js.UndefOr[Path]
  }

  object DeleteFileOutput {
    def apply(
      commitId: js.UndefOr[ObjectId] = js.undefined,
      blobId: js.UndefOr[ObjectId] = js.undefined,
      treeId: js.UndefOr[ObjectId] = js.undefined,
      filePath: js.UndefOr[Path] = js.undefined): DeleteFileOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] },
        "blobId" -> blobId.map { x => x.asInstanceOf[js.Any] },
        "treeId" -> treeId.map { x => x.asInstanceOf[js.Any] },
        "filePath" -> filePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileOutput]
    }
  }

  /**
   * <p>Represents the input of a delete repository operation.</p>
   */
  @js.native
  trait DeleteRepositoryInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object DeleteRepositoryInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): DeleteRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRepositoryInput]
    }
  }

  /**
   * <p>Represents the output of a delete repository operation.</p>
   */
  @js.native
  trait DeleteRepositoryOutput extends js.Object {
    var repositoryId: js.UndefOr[RepositoryId]
  }

  object DeleteRepositoryOutput {
    def apply(
      repositoryId: js.UndefOr[RepositoryId] = js.undefined): DeleteRepositoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryId" -> repositoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRepositoryOutput]
    }
  }

  @js.native
  trait DescribePullRequestEventsInput extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var pullRequestEventType: js.UndefOr[PullRequestEventType]
    var pullRequestId: js.UndefOr[PullRequestId]
    var actorArn: js.UndefOr[Arn]
  }

  object DescribePullRequestEventsInput {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined,
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      actorArn: js.UndefOr[Arn] = js.undefined): DescribePullRequestEventsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "pullRequestEventType" -> pullRequestEventType.map { x => x.asInstanceOf[js.Any] },
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "actorArn" -> actorArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePullRequestEventsInput]
    }
  }

  @js.native
  trait DescribePullRequestEventsOutput extends js.Object {
    var pullRequestEvents: js.UndefOr[PullRequestEventList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribePullRequestEventsOutput {
    def apply(
      pullRequestEvents: js.UndefOr[PullRequestEventList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribePullRequestEventsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequestEvents" -> pullRequestEvents.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePullRequestEventsOutput]
    }
  }

  /**
   * <p>Returns information about a set of differences for a commit specifier.</p>
   */
  @js.native
  trait Difference extends js.Object {
    var beforeBlob: js.UndefOr[BlobMetadata]
    var afterBlob: js.UndefOr[BlobMetadata]
    var changeType: js.UndefOr[ChangeTypeEnum]
  }

  object Difference {
    def apply(
      beforeBlob: js.UndefOr[BlobMetadata] = js.undefined,
      afterBlob: js.UndefOr[BlobMetadata] = js.undefined,
      changeType: js.UndefOr[ChangeTypeEnum] = js.undefined): Difference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "beforeBlob" -> beforeBlob.map { x => x.asInstanceOf[js.Any] },
        "afterBlob" -> afterBlob.map { x => x.asInstanceOf[js.Any] },
        "changeType" -> changeType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Difference]
    }
  }

  /**
   * <p>Returns information about a file in a repository.</p>
   */
  @js.native
  trait File extends js.Object {
    var blobId: js.UndefOr[ObjectId]
    var absolutePath: js.UndefOr[Path]
    var relativePath: js.UndefOr[Path]
    var fileMode: js.UndefOr[FileModeTypeEnum]
  }

  object File {
    def apply(
      blobId: js.UndefOr[ObjectId] = js.undefined,
      absolutePath: js.UndefOr[Path] = js.undefined,
      relativePath: js.UndefOr[Path] = js.undefined,
      fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined): File = {
      val _fields = IndexedSeq[(String, js.Any)](
        "blobId" -> blobId.map { x => x.asInstanceOf[js.Any] },
        "absolutePath" -> absolutePath.map { x => x.asInstanceOf[js.Any] },
        "relativePath" -> relativePath.map { x => x.asInstanceOf[js.Any] },
        "fileMode" -> fileMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[File]
    }
  }

  object FileModeTypeEnumEnum {
    val EXECUTABLE = "EXECUTABLE"
    val NORMAL = "NORMAL"
    val SYMLINK = "SYMLINK"

    val values = IndexedSeq(EXECUTABLE, NORMAL, SYMLINK)
  }

  /**
   * <p>Returns information about a folder in a repository.</p>
   */
  @js.native
  trait Folder extends js.Object {
    var treeId: js.UndefOr[ObjectId]
    var absolutePath: js.UndefOr[Path]
    var relativePath: js.UndefOr[Path]
  }

  object Folder {
    def apply(
      treeId: js.UndefOr[ObjectId] = js.undefined,
      absolutePath: js.UndefOr[Path] = js.undefined,
      relativePath: js.UndefOr[Path] = js.undefined): Folder = {
      val _fields = IndexedSeq[(String, js.Any)](
        "treeId" -> treeId.map { x => x.asInstanceOf[js.Any] },
        "absolutePath" -> absolutePath.map { x => x.asInstanceOf[js.Any] },
        "relativePath" -> relativePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Folder]
    }
  }

  /**
   * <p>Represents the input of a get blob operation.</p>
   */
  @js.native
  trait GetBlobInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var blobId: js.UndefOr[ObjectId]
  }

  object GetBlobInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      blobId: js.UndefOr[ObjectId] = js.undefined): GetBlobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "blobId" -> blobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBlobInput]
    }
  }

  /**
   * <p>Represents the output of a get blob operation.</p>
   */
  @js.native
  trait GetBlobOutput extends js.Object {
    var content: js.UndefOr[blob]
  }

  object GetBlobOutput {
    def apply(
      content: js.UndefOr[blob] = js.undefined): GetBlobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "content" -> content.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBlobOutput]
    }
  }

  /**
   * <p>Represents the input of a get branch operation.</p>
   */
  @js.native
  trait GetBranchInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var branchName: js.UndefOr[BranchName]
  }

  object GetBranchInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined): GetBranchInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBranchInput]
    }
  }

  /**
   * <p>Represents the output of a get branch operation.</p>
   */
  @js.native
  trait GetBranchOutput extends js.Object {
    var branch: js.UndefOr[BranchInfo]
  }

  object GetBranchOutput {
    def apply(
      branch: js.UndefOr[BranchInfo] = js.undefined): GetBranchOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "branch" -> branch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBranchOutput]
    }
  }

  @js.native
  trait GetCommentInput extends js.Object {
    var commentId: js.UndefOr[CommentId]
  }

  object GetCommentInput {
    def apply(
      commentId: js.UndefOr[CommentId] = js.undefined): GetCommentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "commentId" -> commentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommentInput]
    }
  }

  @js.native
  trait GetCommentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object GetCommentOutput {
    def apply(
      comment: js.UndefOr[Comment] = js.undefined): GetCommentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "comment" -> comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommentOutput]
    }
  }

  @js.native
  trait GetCommentsForComparedCommitInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var afterCommitId: js.UndefOr[CommitId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var beforeCommitId: js.UndefOr[CommitId]
  }

  object GetCommentsForComparedCommitInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      afterCommitId: js.UndefOr[CommitId] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      beforeCommitId: js.UndefOr[CommitId] = js.undefined): GetCommentsForComparedCommitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "afterCommitId" -> afterCommitId.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitId" -> beforeCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommentsForComparedCommitInput]
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
      nextToken: js.UndefOr[NextToken] = js.undefined): GetCommentsForComparedCommitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "commentsForComparedCommitData" -> commentsForComparedCommitData.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommentsForComparedCommitOutput]
    }
  }

  @js.native
  trait GetCommentsForPullRequestInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var afterCommitId: js.UndefOr[CommitId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var pullRequestId: js.UndefOr[PullRequestId]
    var beforeCommitId: js.UndefOr[CommitId]
  }

  object GetCommentsForPullRequestInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      afterCommitId: js.UndefOr[CommitId] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      beforeCommitId: js.UndefOr[CommitId] = js.undefined): GetCommentsForPullRequestInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "afterCommitId" -> afterCommitId.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitId" -> beforeCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommentsForPullRequestInput]
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
      nextToken: js.UndefOr[NextToken] = js.undefined): GetCommentsForPullRequestOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "commentsForPullRequestData" -> commentsForPullRequestData.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommentsForPullRequestOutput]
    }
  }

  /**
   * <p>Represents the input of a get commit operation.</p>
   */
  @js.native
  trait GetCommitInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var commitId: js.UndefOr[ObjectId]
  }

  object GetCommitInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      commitId: js.UndefOr[ObjectId] = js.undefined): GetCommitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommitInput]
    }
  }

  /**
   * <p>Represents the output of a get commit operation.</p>
   */
  @js.native
  trait GetCommitOutput extends js.Object {
    var commit: js.UndefOr[Commit]
  }

  object GetCommitOutput {
    def apply(
      commit: js.UndefOr[Commit] = js.undefined): GetCommitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "commit" -> commit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCommitOutput]
    }
  }

  @js.native
  trait GetDifferencesInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var afterPath: js.UndefOr[Path]
    var beforePath: js.UndefOr[Path]
    var MaxResults: js.UndefOr[Limit]
    var afterCommitSpecifier: js.UndefOr[CommitName]
    var beforeCommitSpecifier: js.UndefOr[CommitName]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDifferencesInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      afterPath: js.UndefOr[Path] = js.undefined,
      beforePath: js.UndefOr[Path] = js.undefined,
      MaxResults: js.UndefOr[Limit] = js.undefined,
      afterCommitSpecifier: js.UndefOr[CommitName] = js.undefined,
      beforeCommitSpecifier: js.UndefOr[CommitName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetDifferencesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "afterPath" -> afterPath.map { x => x.asInstanceOf[js.Any] },
        "beforePath" -> beforePath.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "afterCommitSpecifier" -> afterCommitSpecifier.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitSpecifier" -> beforeCommitSpecifier.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDifferencesInput]
    }
  }

  @js.native
  trait GetDifferencesOutput extends js.Object {
    var differences: js.UndefOr[DifferenceList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDifferencesOutput {
    def apply(
      differences: js.UndefOr[DifferenceList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetDifferencesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "differences" -> differences.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDifferencesOutput]
    }
  }

  @js.native
  trait GetFileInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var commitSpecifier: js.UndefOr[CommitName]
    var filePath: js.UndefOr[Path]
  }

  object GetFileInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      commitSpecifier: js.UndefOr[CommitName] = js.undefined,
      filePath: js.UndefOr[Path] = js.undefined): GetFileInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "commitSpecifier" -> commitSpecifier.map { x => x.asInstanceOf[js.Any] },
        "filePath" -> filePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFileInput]
    }
  }

  @js.native
  trait GetFileOutput extends js.Object {
    var fileContent: js.UndefOr[FileContent]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var blobId: js.UndefOr[ObjectId]
    var commitId: js.UndefOr[ObjectId]
    var fileSize: js.UndefOr[ObjectSize]
    var filePath: js.UndefOr[Path]
  }

  object GetFileOutput {
    def apply(
      fileContent: js.UndefOr[FileContent] = js.undefined,
      fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined,
      blobId: js.UndefOr[ObjectId] = js.undefined,
      commitId: js.UndefOr[ObjectId] = js.undefined,
      fileSize: js.UndefOr[ObjectSize] = js.undefined,
      filePath: js.UndefOr[Path] = js.undefined): GetFileOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fileContent" -> fileContent.map { x => x.asInstanceOf[js.Any] },
        "fileMode" -> fileMode.map { x => x.asInstanceOf[js.Any] },
        "blobId" -> blobId.map { x => x.asInstanceOf[js.Any] },
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] },
        "fileSize" -> fileSize.map { x => x.asInstanceOf[js.Any] },
        "filePath" -> filePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFileOutput]
    }
  }

  @js.native
  trait GetFolderInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var commitSpecifier: js.UndefOr[CommitName]
    var folderPath: js.UndefOr[Path]
  }

  object GetFolderInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      commitSpecifier: js.UndefOr[CommitName] = js.undefined,
      folderPath: js.UndefOr[Path] = js.undefined): GetFolderInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "commitSpecifier" -> commitSpecifier.map { x => x.asInstanceOf[js.Any] },
        "folderPath" -> folderPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFolderInput]
    }
  }

  @js.native
  trait GetFolderOutput extends js.Object {
    var subFolders: js.UndefOr[FolderList]
    var treeId: js.UndefOr[ObjectId]
    var commitId: js.UndefOr[ObjectId]
    var files: js.UndefOr[FileList]
    var subModules: js.UndefOr[SubModuleList]
    var symbolicLinks: js.UndefOr[SymbolicLinkList]
    var folderPath: js.UndefOr[Path]
  }

  object GetFolderOutput {
    def apply(
      subFolders: js.UndefOr[FolderList] = js.undefined,
      treeId: js.UndefOr[ObjectId] = js.undefined,
      commitId: js.UndefOr[ObjectId] = js.undefined,
      files: js.UndefOr[FileList] = js.undefined,
      subModules: js.UndefOr[SubModuleList] = js.undefined,
      symbolicLinks: js.UndefOr[SymbolicLinkList] = js.undefined,
      folderPath: js.UndefOr[Path] = js.undefined): GetFolderOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subFolders" -> subFolders.map { x => x.asInstanceOf[js.Any] },
        "treeId" -> treeId.map { x => x.asInstanceOf[js.Any] },
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] },
        "files" -> files.map { x => x.asInstanceOf[js.Any] },
        "subModules" -> subModules.map { x => x.asInstanceOf[js.Any] },
        "symbolicLinks" -> symbolicLinks.map { x => x.asInstanceOf[js.Any] },
        "folderPath" -> folderPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFolderOutput]
    }
  }

  @js.native
  trait GetMergeConflictsInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var destinationCommitSpecifier: js.UndefOr[CommitName]
    var sourceCommitSpecifier: js.UndefOr[CommitName]
    var mergeOption: js.UndefOr[MergeOptionTypeEnum]
  }

  object GetMergeConflictsInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      destinationCommitSpecifier: js.UndefOr[CommitName] = js.undefined,
      sourceCommitSpecifier: js.UndefOr[CommitName] = js.undefined,
      mergeOption: js.UndefOr[MergeOptionTypeEnum] = js.undefined): GetMergeConflictsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "destinationCommitSpecifier" -> destinationCommitSpecifier.map { x => x.asInstanceOf[js.Any] },
        "sourceCommitSpecifier" -> sourceCommitSpecifier.map { x => x.asInstanceOf[js.Any] },
        "mergeOption" -> mergeOption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMergeConflictsInput]
    }
  }

  @js.native
  trait GetMergeConflictsOutput extends js.Object {
    var mergeable: js.UndefOr[IsMergeable]
    var destinationCommitId: js.UndefOr[CommitId]
    var sourceCommitId: js.UndefOr[CommitId]
  }

  object GetMergeConflictsOutput {
    def apply(
      mergeable: js.UndefOr[IsMergeable] = js.undefined,
      destinationCommitId: js.UndefOr[CommitId] = js.undefined,
      sourceCommitId: js.UndefOr[CommitId] = js.undefined): GetMergeConflictsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "mergeable" -> mergeable.map { x => x.asInstanceOf[js.Any] },
        "destinationCommitId" -> destinationCommitId.map { x => x.asInstanceOf[js.Any] },
        "sourceCommitId" -> sourceCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMergeConflictsOutput]
    }
  }

  @js.native
  trait GetPullRequestInput extends js.Object {
    var pullRequestId: js.UndefOr[PullRequestId]
  }

  object GetPullRequestInput {
    def apply(
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined): GetPullRequestInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPullRequestInput]
    }
  }

  @js.native
  trait GetPullRequestOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object GetPullRequestOutput {
    def apply(
      pullRequest: js.UndefOr[PullRequest] = js.undefined): GetPullRequestOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequest" -> pullRequest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPullRequestOutput]
    }
  }

  /**
   * <p>Represents the input of a get repository operation.</p>
   */
  @js.native
  trait GetRepositoryInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetRepositoryInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): GetRepositoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRepositoryInput]
    }
  }

  /**
   * <p>Represents the output of a get repository operation.</p>
   */
  @js.native
  trait GetRepositoryOutput extends js.Object {
    var repositoryMetadata: js.UndefOr[RepositoryMetadata]
  }

  object GetRepositoryOutput {
    def apply(
      repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.undefined): GetRepositoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryMetadata" -> repositoryMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRepositoryOutput]
    }
  }

  /**
   * <p>Represents the input of a get repository triggers operation.</p>
   */
  @js.native
  trait GetRepositoryTriggersInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetRepositoryTriggersInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): GetRepositoryTriggersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRepositoryTriggersInput]
    }
  }

  /**
   * <p>Represents the output of a get repository triggers operation.</p>
   */
  @js.native
  trait GetRepositoryTriggersOutput extends js.Object {
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId]
    var triggers: js.UndefOr[RepositoryTriggersList]
  }

  object GetRepositoryTriggersOutput {
    def apply(
      configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined,
      triggers: js.UndefOr[RepositoryTriggersList] = js.undefined): GetRepositoryTriggersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.map { x => x.asInstanceOf[js.Any] },
        "triggers" -> triggers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRepositoryTriggersOutput]
    }
  }

  /**
   * <p>Represents the input of a list branches operation.</p>
   */
  @js.native
  trait ListBranchesInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListBranchesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBranchesInput]
    }
  }

  /**
   * <p>Represents the output of a list branches operation.</p>
   */
  @js.native
  trait ListBranchesOutput extends js.Object {
    var branches: js.UndefOr[BranchNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesOutput {
    def apply(
      branches: js.UndefOr[BranchNameList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListBranchesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "branches" -> branches.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBranchesOutput]
    }
  }

  @js.native
  trait ListPullRequestsInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var authorArn: js.UndefOr[Arn]
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
  }

  object ListPullRequestsInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      authorArn: js.UndefOr[Arn] = js.undefined,
      pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined): ListPullRequestsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "authorArn" -> authorArn.map { x => x.asInstanceOf[js.Any] },
        "pullRequestStatus" -> pullRequestStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPullRequestsInput]
    }
  }

  @js.native
  trait ListPullRequestsOutput extends js.Object {
    var pullRequestIds: js.UndefOr[PullRequestIdList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPullRequestsOutput {
    def apply(
      pullRequestIds: js.UndefOr[PullRequestIdList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListPullRequestsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequestIds" -> pullRequestIds.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPullRequestsOutput]
    }
  }

  /**
   * <p>Represents the input of a list repositories operation.</p>
   */
  @js.native
  trait ListRepositoriesInput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[SortByEnum]
    var order: js.UndefOr[OrderEnum]
  }

  object ListRepositoriesInput {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      sortBy: js.UndefOr[SortByEnum] = js.undefined,
      order: js.UndefOr[OrderEnum] = js.undefined): ListRepositoriesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "sortBy" -> sortBy.map { x => x.asInstanceOf[js.Any] },
        "order" -> order.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRepositoriesInput]
    }
  }

  /**
   * <p>Represents the output of a list repositories operation.</p>
   */
  @js.native
  trait ListRepositoriesOutput extends js.Object {
    var repositories: js.UndefOr[RepositoryNameIdPairList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListRepositoriesOutput {
    def apply(
      repositories: js.UndefOr[RepositoryNameIdPairList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListRepositoriesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositories" -> repositories.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRepositoriesOutput]
    }
  }

  /**
   * <p>Returns information about the location of a change or comment in the comparison between two commits or a pull request.</p>
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
      relativeFileVersion: js.UndefOr[RelativeFileVersionEnum] = js.undefined): Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filePath" -> filePath.map { x => x.asInstanceOf[js.Any] },
        "filePosition" -> filePosition.map { x => x.asInstanceOf[js.Any] },
        "relativeFileVersion" -> relativeFileVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Location]
    }
  }

  /**
   * <p>Returns information about a merge or potential merge between a source reference and a destination reference in a pull request.</p>
   */
  @js.native
  trait MergeMetadata extends js.Object {
    var isMerged: js.UndefOr[IsMerged]
    var mergedBy: js.UndefOr[Arn]
  }

  object MergeMetadata {
    def apply(
      isMerged: js.UndefOr[IsMerged] = js.undefined,
      mergedBy: js.UndefOr[Arn] = js.undefined): MergeMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isMerged" -> isMerged.map { x => x.asInstanceOf[js.Any] },
        "mergedBy" -> mergedBy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MergeMetadata]
    }
  }

  object MergeOptionTypeEnumEnum {
    val FAST_FORWARD_MERGE = "FAST_FORWARD_MERGE"

    val values = IndexedSeq(FAST_FORWARD_MERGE)
  }

  @js.native
  trait MergePullRequestByFastForwardInput extends js.Object {
    var pullRequestId: js.UndefOr[PullRequestId]
    var repositoryName: js.UndefOr[RepositoryName]
    var sourceCommitId: js.UndefOr[CommitId]
  }

  object MergePullRequestByFastForwardInput {
    def apply(
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      sourceCommitId: js.UndefOr[CommitId] = js.undefined): MergePullRequestByFastForwardInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "sourceCommitId" -> sourceCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MergePullRequestByFastForwardInput]
    }
  }

  @js.native
  trait MergePullRequestByFastForwardOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object MergePullRequestByFastForwardOutput {
    def apply(
      pullRequest: js.UndefOr[PullRequest] = js.undefined): MergePullRequestByFastForwardOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequest" -> pullRequest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MergePullRequestByFastForwardOutput]
    }
  }

  object OrderEnumEnum {
    val ascending = "ascending"
    val descending = "descending"

    val values = IndexedSeq(ascending, descending)
  }

  @js.native
  trait PostCommentForComparedCommitInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var location: js.UndefOr[Location]
    var afterCommitId: js.UndefOr[CommitId]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var content: js.UndefOr[Content]
    var beforeCommitId: js.UndefOr[CommitId]
  }

  object PostCommentForComparedCommitInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      location: js.UndefOr[Location] = js.undefined,
      afterCommitId: js.UndefOr[CommitId] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      content: js.UndefOr[Content] = js.undefined,
      beforeCommitId: js.UndefOr[CommitId] = js.undefined): PostCommentForComparedCommitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "afterCommitId" -> afterCommitId.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "content" -> content.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitId" -> beforeCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostCommentForComparedCommitInput]
    }
  }

  @js.native
  trait PostCommentForComparedCommitOutput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var location: js.UndefOr[Location]
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var comment: js.UndefOr[Comment]
    var beforeCommitId: js.UndefOr[CommitId]
  }

  object PostCommentForComparedCommitOutput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      location: js.UndefOr[Location] = js.undefined,
      afterBlobId: js.UndefOr[ObjectId] = js.undefined,
      afterCommitId: js.UndefOr[CommitId] = js.undefined,
      beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
      comment: js.UndefOr[Comment] = js.undefined,
      beforeCommitId: js.UndefOr[CommitId] = js.undefined): PostCommentForComparedCommitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "afterBlobId" -> afterBlobId.map { x => x.asInstanceOf[js.Any] },
        "afterCommitId" -> afterCommitId.map { x => x.asInstanceOf[js.Any] },
        "beforeBlobId" -> beforeBlobId.map { x => x.asInstanceOf[js.Any] },
        "comment" -> comment.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitId" -> beforeCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostCommentForComparedCommitOutput]
    }
  }

  @js.native
  trait PostCommentForPullRequestInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var location: js.UndefOr[Location]
    var afterCommitId: js.UndefOr[CommitId]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var content: js.UndefOr[Content]
    var pullRequestId: js.UndefOr[PullRequestId]
    var beforeCommitId: js.UndefOr[CommitId]
  }

  object PostCommentForPullRequestInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      location: js.UndefOr[Location] = js.undefined,
      afterCommitId: js.UndefOr[CommitId] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      content: js.UndefOr[Content] = js.undefined,
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      beforeCommitId: js.UndefOr[CommitId] = js.undefined): PostCommentForPullRequestInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "afterCommitId" -> afterCommitId.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "content" -> content.map { x => x.asInstanceOf[js.Any] },
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitId" -> beforeCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostCommentForPullRequestInput]
    }
  }

  @js.native
  trait PostCommentForPullRequestOutput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var location: js.UndefOr[Location]
    var afterBlobId: js.UndefOr[ObjectId]
    var afterCommitId: js.UndefOr[CommitId]
    var beforeBlobId: js.UndefOr[ObjectId]
    var comment: js.UndefOr[Comment]
    var pullRequestId: js.UndefOr[PullRequestId]
    var beforeCommitId: js.UndefOr[CommitId]
  }

  object PostCommentForPullRequestOutput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      location: js.UndefOr[Location] = js.undefined,
      afterBlobId: js.UndefOr[ObjectId] = js.undefined,
      afterCommitId: js.UndefOr[CommitId] = js.undefined,
      beforeBlobId: js.UndefOr[ObjectId] = js.undefined,
      comment: js.UndefOr[Comment] = js.undefined,
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      beforeCommitId: js.UndefOr[CommitId] = js.undefined): PostCommentForPullRequestOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "afterBlobId" -> afterBlobId.map { x => x.asInstanceOf[js.Any] },
        "afterCommitId" -> afterCommitId.map { x => x.asInstanceOf[js.Any] },
        "beforeBlobId" -> beforeBlobId.map { x => x.asInstanceOf[js.Any] },
        "comment" -> comment.map { x => x.asInstanceOf[js.Any] },
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitId" -> beforeCommitId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostCommentForPullRequestOutput]
    }
  }

  @js.native
  trait PostCommentReplyInput extends js.Object {
    var inReplyTo: js.UndefOr[CommentId]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var content: js.UndefOr[Content]
  }

  object PostCommentReplyInput {
    def apply(
      inReplyTo: js.UndefOr[CommentId] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      content: js.UndefOr[Content] = js.undefined): PostCommentReplyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inReplyTo" -> inReplyTo.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "content" -> content.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostCommentReplyInput]
    }
  }

  @js.native
  trait PostCommentReplyOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object PostCommentReplyOutput {
    def apply(
      comment: js.UndefOr[Comment] = js.undefined): PostCommentReplyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "comment" -> comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostCommentReplyOutput]
    }
  }

  /**
   * <p>Returns information about a pull request.</p>
   */
  @js.native
  trait PullRequest extends js.Object {
    var description: js.UndefOr[Description]
    var lastActivityDate: js.UndefOr[LastModifiedDate]
    var authorArn: js.UndefOr[Arn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var pullRequestTargets: js.UndefOr[PullRequestTargetList]
    var creationDate: js.UndefOr[CreationDate]
    var pullRequestId: js.UndefOr[PullRequestId]
    var title: js.UndefOr[Title]
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
  }

  object PullRequest {
    def apply(
      description: js.UndefOr[Description] = js.undefined,
      lastActivityDate: js.UndefOr[LastModifiedDate] = js.undefined,
      authorArn: js.UndefOr[Arn] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      pullRequestTargets: js.UndefOr[PullRequestTargetList] = js.undefined,
      creationDate: js.UndefOr[CreationDate] = js.undefined,
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      title: js.UndefOr[Title] = js.undefined,
      pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined): PullRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "lastActivityDate" -> lastActivityDate.map { x => x.asInstanceOf[js.Any] },
        "authorArn" -> authorArn.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "pullRequestTargets" -> pullRequestTargets.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "title" -> title.map { x => x.asInstanceOf[js.Any] },
        "pullRequestStatus" -> pullRequestStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PullRequest]
    }
  }

  /**
   * <p>Metadata about the pull request that is used when comparing the pull request source with its destination.</p>
   */
  @js.native
  trait PullRequestCreatedEventMetadata extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var sourceCommitId: js.UndefOr[CommitId]
    var destinationCommitId: js.UndefOr[CommitId]
    var mergeBase: js.UndefOr[CommitId]
  }

  object PullRequestCreatedEventMetadata {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      sourceCommitId: js.UndefOr[CommitId] = js.undefined,
      destinationCommitId: js.UndefOr[CommitId] = js.undefined,
      mergeBase: js.UndefOr[CommitId] = js.undefined): PullRequestCreatedEventMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "sourceCommitId" -> sourceCommitId.map { x => x.asInstanceOf[js.Any] },
        "destinationCommitId" -> destinationCommitId.map { x => x.asInstanceOf[js.Any] },
        "mergeBase" -> mergeBase.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PullRequestCreatedEventMetadata]
    }
  }

  /**
   * <p>Returns information about a pull request event.</p>
   */
  @js.native
  trait PullRequestEvent extends js.Object {
    var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata]
    var eventDate: js.UndefOr[EventDate]
    var pullRequestEventType: js.UndefOr[PullRequestEventType]
    var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata]
    var pullRequestId: js.UndefOr[PullRequestId]
    var actorArn: js.UndefOr[Arn]
    var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata]
    var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata]
  }

  object PullRequestEvent {
    def apply(
      pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.undefined,
      eventDate: js.UndefOr[EventDate] = js.undefined,
      pullRequestEventType: js.UndefOr[PullRequestEventType] = js.undefined,
      pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.undefined,
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      actorArn: js.UndefOr[Arn] = js.undefined,
      pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.undefined,
      pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.undefined): PullRequestEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequestSourceReferenceUpdatedEventMetadata" -> pullRequestSourceReferenceUpdatedEventMetadata.map { x => x.asInstanceOf[js.Any] },
        "eventDate" -> eventDate.map { x => x.asInstanceOf[js.Any] },
        "pullRequestEventType" -> pullRequestEventType.map { x => x.asInstanceOf[js.Any] },
        "pullRequestStatusChangedEventMetadata" -> pullRequestStatusChangedEventMetadata.map { x => x.asInstanceOf[js.Any] },
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "actorArn" -> actorArn.map { x => x.asInstanceOf[js.Any] },
        "pullRequestCreatedEventMetadata" -> pullRequestCreatedEventMetadata.map { x => x.asInstanceOf[js.Any] },
        "pullRequestMergedStateChangedEventMetadata" -> pullRequestMergedStateChangedEventMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PullRequestEvent]
    }
  }

  object PullRequestEventTypeEnum {
    val PULL_REQUEST_CREATED = "PULL_REQUEST_CREATED"
    val PULL_REQUEST_STATUS_CHANGED = "PULL_REQUEST_STATUS_CHANGED"
    val PULL_REQUEST_SOURCE_REFERENCE_UPDATED = "PULL_REQUEST_SOURCE_REFERENCE_UPDATED"
    val PULL_REQUEST_MERGE_STATE_CHANGED = "PULL_REQUEST_MERGE_STATE_CHANGED"

    val values = IndexedSeq(PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED, PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED)
  }

  /**
   * <p>Returns information about the change in the merge state for a pull request event. </p>
   */
  @js.native
  trait PullRequestMergedStateChangedEventMetadata extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var destinationReference: js.UndefOr[ReferenceName]
    var mergeMetadata: js.UndefOr[MergeMetadata]
  }

  object PullRequestMergedStateChangedEventMetadata {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      destinationReference: js.UndefOr[ReferenceName] = js.undefined,
      mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined): PullRequestMergedStateChangedEventMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "destinationReference" -> destinationReference.map { x => x.asInstanceOf[js.Any] },
        "mergeMetadata" -> mergeMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PullRequestMergedStateChangedEventMetadata]
    }
  }

  /**
   * <p>Information about an update to the source branch of a pull request.</p>
   */
  @js.native
  trait PullRequestSourceReferenceUpdatedEventMetadata extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var beforeCommitId: js.UndefOr[CommitId]
    var afterCommitId: js.UndefOr[CommitId]
    var mergeBase: js.UndefOr[CommitId]
  }

  object PullRequestSourceReferenceUpdatedEventMetadata {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      beforeCommitId: js.UndefOr[CommitId] = js.undefined,
      afterCommitId: js.UndefOr[CommitId] = js.undefined,
      mergeBase: js.UndefOr[CommitId] = js.undefined): PullRequestSourceReferenceUpdatedEventMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "beforeCommitId" -> beforeCommitId.map { x => x.asInstanceOf[js.Any] },
        "afterCommitId" -> afterCommitId.map { x => x.asInstanceOf[js.Any] },
        "mergeBase" -> mergeBase.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
    }
  }

  /**
   * <p>Information about a change to the status of a pull request.</p>
   */
  @js.native
  trait PullRequestStatusChangedEventMetadata extends js.Object {
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
  }

  object PullRequestStatusChangedEventMetadata {
    def apply(
      pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined): PullRequestStatusChangedEventMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequestStatus" -> pullRequestStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PullRequestStatusChangedEventMetadata]
    }
  }

  object PullRequestStatusEnumEnum {
    val OPEN = "OPEN"
    val CLOSED = "CLOSED"

    val values = IndexedSeq(OPEN, CLOSED)
  }

  /**
   * <p>Returns information about a pull request target.</p>
   */
  @js.native
  trait PullRequestTarget extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var destinationReference: js.UndefOr[ReferenceName]
    var sourceCommit: js.UndefOr[CommitId]
    var destinationCommit: js.UndefOr[CommitId]
    var mergeBase: js.UndefOr[CommitId]
    var sourceReference: js.UndefOr[ReferenceName]
    var mergeMetadata: js.UndefOr[MergeMetadata]
  }

  object PullRequestTarget {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      destinationReference: js.UndefOr[ReferenceName] = js.undefined,
      sourceCommit: js.UndefOr[CommitId] = js.undefined,
      destinationCommit: js.UndefOr[CommitId] = js.undefined,
      mergeBase: js.UndefOr[CommitId] = js.undefined,
      sourceReference: js.UndefOr[ReferenceName] = js.undefined,
      mergeMetadata: js.UndefOr[MergeMetadata] = js.undefined): PullRequestTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "destinationReference" -> destinationReference.map { x => x.asInstanceOf[js.Any] },
        "sourceCommit" -> sourceCommit.map { x => x.asInstanceOf[js.Any] },
        "destinationCommit" -> destinationCommit.map { x => x.asInstanceOf[js.Any] },
        "mergeBase" -> mergeBase.map { x => x.asInstanceOf[js.Any] },
        "sourceReference" -> sourceReference.map { x => x.asInstanceOf[js.Any] },
        "mergeMetadata" -> mergeMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PullRequestTarget]
    }
  }

  @js.native
  trait PutFileInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var name: js.UndefOr[Name]
    var fileContent: js.UndefOr[FileContent]
    var fileMode: js.UndefOr[FileModeTypeEnum]
    var email: js.UndefOr[Email]
    var parentCommitId: js.UndefOr[CommitId]
    var filePath: js.UndefOr[Path]
    var branchName: js.UndefOr[BranchName]
    var commitMessage: js.UndefOr[Message]
  }

  object PutFileInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      fileContent: js.UndefOr[FileContent] = js.undefined,
      fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined,
      email: js.UndefOr[Email] = js.undefined,
      parentCommitId: js.UndefOr[CommitId] = js.undefined,
      filePath: js.UndefOr[Path] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      commitMessage: js.UndefOr[Message] = js.undefined): PutFileInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "fileContent" -> fileContent.map { x => x.asInstanceOf[js.Any] },
        "fileMode" -> fileMode.map { x => x.asInstanceOf[js.Any] },
        "email" -> email.map { x => x.asInstanceOf[js.Any] },
        "parentCommitId" -> parentCommitId.map { x => x.asInstanceOf[js.Any] },
        "filePath" -> filePath.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "commitMessage" -> commitMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutFileInput]
    }
  }

  @js.native
  trait PutFileOutput extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var blobId: js.UndefOr[ObjectId]
    var treeId: js.UndefOr[ObjectId]
  }

  object PutFileOutput {
    def apply(
      commitId: js.UndefOr[ObjectId] = js.undefined,
      blobId: js.UndefOr[ObjectId] = js.undefined,
      treeId: js.UndefOr[ObjectId] = js.undefined): PutFileOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] },
        "blobId" -> blobId.map { x => x.asInstanceOf[js.Any] },
        "treeId" -> treeId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutFileOutput]
    }
  }

  /**
   * <p>Represents the input ofa put repository triggers operation.</p>
   */
  @js.native
  trait PutRepositoryTriggersInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var triggers: js.UndefOr[RepositoryTriggersList]
  }

  object PutRepositoryTriggersInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      triggers: js.UndefOr[RepositoryTriggersList] = js.undefined): PutRepositoryTriggersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "triggers" -> triggers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRepositoryTriggersInput]
    }
  }

  /**
   * <p>Represents the output of a put repository triggers operation.</p>
   */
  @js.native
  trait PutRepositoryTriggersOutput extends js.Object {
    var configurationId: js.UndefOr[RepositoryTriggersConfigurationId]
  }

  object PutRepositoryTriggersOutput {
    def apply(
      configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined): PutRepositoryTriggersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRepositoryTriggersOutput]
    }
  }

  object RelativeFileVersionEnumEnum {
    val BEFORE = "BEFORE"
    val AFTER = "AFTER"

    val values = IndexedSeq(BEFORE, AFTER)
  }

  /**
   * <p>Information about a repository.</p>
   */
  @js.native
  trait RepositoryMetadata extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var cloneUrlHttp: js.UndefOr[CloneUrlHttp]
    var cloneUrlSsh: js.UndefOr[CloneUrlSsh]
    var repositoryId: js.UndefOr[RepositoryId]
    var lastModifiedDate: js.UndefOr[LastModifiedDate]
    var accountId: js.UndefOr[AccountId]
    var repositoryDescription: js.UndefOr[RepositoryDescription]
    var Arn: js.UndefOr[Arn]
    var creationDate: js.UndefOr[CreationDate]
    var defaultBranch: js.UndefOr[BranchName]
  }

  object RepositoryMetadata {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      cloneUrlHttp: js.UndefOr[CloneUrlHttp] = js.undefined,
      cloneUrlSsh: js.UndefOr[CloneUrlSsh] = js.undefined,
      repositoryId: js.UndefOr[RepositoryId] = js.undefined,
      lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined,
      accountId: js.UndefOr[AccountId] = js.undefined,
      repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      creationDate: js.UndefOr[CreationDate] = js.undefined,
      defaultBranch: js.UndefOr[BranchName] = js.undefined): RepositoryMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "cloneUrlHttp" -> cloneUrlHttp.map { x => x.asInstanceOf[js.Any] },
        "cloneUrlSsh" -> cloneUrlSsh.map { x => x.asInstanceOf[js.Any] },
        "repositoryId" -> repositoryId.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedDate" -> lastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "accountId" -> accountId.map { x => x.asInstanceOf[js.Any] },
        "repositoryDescription" -> repositoryDescription.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "defaultBranch" -> defaultBranch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RepositoryMetadata]
    }
  }

  /**
   * <p>Information about a repository name and ID.</p>
   */
  @js.native
  trait RepositoryNameIdPair extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var repositoryId: js.UndefOr[RepositoryId]
  }

  object RepositoryNameIdPair {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      repositoryId: js.UndefOr[RepositoryId] = js.undefined): RepositoryNameIdPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "repositoryId" -> repositoryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RepositoryNameIdPair]
    }
  }

  /**
   * <p>Information about a trigger for a repository.</p>
   */
  @js.native
  trait RepositoryTrigger extends js.Object {
    var name: js.UndefOr[RepositoryTriggerName]
    var customData: js.UndefOr[RepositoryTriggerCustomData]
    var destinationArn: js.UndefOr[Arn]
    var branches: js.UndefOr[BranchNameList]
    var events: js.UndefOr[RepositoryTriggerEventList]
  }

  object RepositoryTrigger {
    def apply(
      name: js.UndefOr[RepositoryTriggerName] = js.undefined,
      customData: js.UndefOr[RepositoryTriggerCustomData] = js.undefined,
      destinationArn: js.UndefOr[Arn] = js.undefined,
      branches: js.UndefOr[BranchNameList] = js.undefined,
      events: js.UndefOr[RepositoryTriggerEventList] = js.undefined): RepositoryTrigger = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "customData" -> customData.map { x => x.asInstanceOf[js.Any] },
        "destinationArn" -> destinationArn.map { x => x.asInstanceOf[js.Any] },
        "branches" -> branches.map { x => x.asInstanceOf[js.Any] },
        "events" -> events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RepositoryTrigger]
    }
  }

  object RepositoryTriggerEventEnumEnum {
    val all = "all"
    val updateReference = "updateReference"
    val createReference = "createReference"
    val deleteReference = "deleteReference"

    val values = IndexedSeq(all, updateReference, createReference, deleteReference)
  }

  /**
   * <p>A trigger failed to run.</p>
   */
  @js.native
  trait RepositoryTriggerExecutionFailure extends js.Object {
    var trigger: js.UndefOr[RepositoryTriggerName]
    var failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage]
  }

  object RepositoryTriggerExecutionFailure {
    def apply(
      trigger: js.UndefOr[RepositoryTriggerName] = js.undefined,
      failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage] = js.undefined): RepositoryTriggerExecutionFailure = {
      val _fields = IndexedSeq[(String, js.Any)](
        "trigger" -> trigger.map { x => x.asInstanceOf[js.Any] },
        "failureMessage" -> failureMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RepositoryTriggerExecutionFailure]
    }
  }

  object SortByEnumEnum {
    val repositoryName = "repositoryName"
    val lastModifiedDate = "lastModifiedDate"

    val values = IndexedSeq(repositoryName, lastModifiedDate)
  }

  /**
   * <p>Returns information about a submodule reference in a repository folder.</p>
   */
  @js.native
  trait SubModule extends js.Object {
    var commitId: js.UndefOr[ObjectId]
    var absolutePath: js.UndefOr[Path]
    var relativePath: js.UndefOr[Path]
  }

  object SubModule {
    def apply(
      commitId: js.UndefOr[ObjectId] = js.undefined,
      absolutePath: js.UndefOr[Path] = js.undefined,
      relativePath: js.UndefOr[Path] = js.undefined): SubModule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] },
        "absolutePath" -> absolutePath.map { x => x.asInstanceOf[js.Any] },
        "relativePath" -> relativePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubModule]
    }
  }

  /**
   * <p>Returns information about a symbolic link in a repository folder.</p>
   */
  @js.native
  trait SymbolicLink extends js.Object {
    var blobId: js.UndefOr[ObjectId]
    var absolutePath: js.UndefOr[Path]
    var relativePath: js.UndefOr[Path]
    var fileMode: js.UndefOr[FileModeTypeEnum]
  }

  object SymbolicLink {
    def apply(
      blobId: js.UndefOr[ObjectId] = js.undefined,
      absolutePath: js.UndefOr[Path] = js.undefined,
      relativePath: js.UndefOr[Path] = js.undefined,
      fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined): SymbolicLink = {
      val _fields = IndexedSeq[(String, js.Any)](
        "blobId" -> blobId.map { x => x.asInstanceOf[js.Any] },
        "absolutePath" -> absolutePath.map { x => x.asInstanceOf[js.Any] },
        "relativePath" -> relativePath.map { x => x.asInstanceOf[js.Any] },
        "fileMode" -> fileMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SymbolicLink]
    }
  }

  /**
   * <p>Returns information about a target for a pull request.</p>
   */
  @js.native
  trait Target extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var sourceReference: js.UndefOr[ReferenceName]
    var destinationReference: js.UndefOr[ReferenceName]
  }

  object Target {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      sourceReference: js.UndefOr[ReferenceName] = js.undefined,
      destinationReference: js.UndefOr[ReferenceName] = js.undefined): Target = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "sourceReference" -> sourceReference.map { x => x.asInstanceOf[js.Any] },
        "destinationReference" -> destinationReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Target]
    }
  }

  /**
   * <p>Represents the input of a test repository triggers operation.</p>
   */
  @js.native
  trait TestRepositoryTriggersInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var triggers: js.UndefOr[RepositoryTriggersList]
  }

  object TestRepositoryTriggersInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      triggers: js.UndefOr[RepositoryTriggersList] = js.undefined): TestRepositoryTriggersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "triggers" -> triggers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestRepositoryTriggersInput]
    }
  }

  /**
   * <p>Represents the output of a test repository triggers operation.</p>
   */
  @js.native
  trait TestRepositoryTriggersOutput extends js.Object {
    var successfulExecutions: js.UndefOr[RepositoryTriggerNameList]
    var failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList]
  }

  object TestRepositoryTriggersOutput {
    def apply(
      successfulExecutions: js.UndefOr[RepositoryTriggerNameList] = js.undefined,
      failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList] = js.undefined): TestRepositoryTriggersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "successfulExecutions" -> successfulExecutions.map { x => x.asInstanceOf[js.Any] },
        "failedExecutions" -> failedExecutions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestRepositoryTriggersOutput]
    }
  }

  @js.native
  trait UpdateCommentInput extends js.Object {
    var commentId: js.UndefOr[CommentId]
    var content: js.UndefOr[Content]
  }

  object UpdateCommentInput {
    def apply(
      commentId: js.UndefOr[CommentId] = js.undefined,
      content: js.UndefOr[Content] = js.undefined): UpdateCommentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "commentId" -> commentId.map { x => x.asInstanceOf[js.Any] },
        "content" -> content.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCommentInput]
    }
  }

  @js.native
  trait UpdateCommentOutput extends js.Object {
    var comment: js.UndefOr[Comment]
  }

  object UpdateCommentOutput {
    def apply(
      comment: js.UndefOr[Comment] = js.undefined): UpdateCommentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "comment" -> comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCommentOutput]
    }
  }

  /**
   * <p>Represents the input of an update default branch operation.</p>
   */
  @js.native
  trait UpdateDefaultBranchInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var defaultBranchName: js.UndefOr[BranchName]
  }

  object UpdateDefaultBranchInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      defaultBranchName: js.UndefOr[BranchName] = js.undefined): UpdateDefaultBranchInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "defaultBranchName" -> defaultBranchName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDefaultBranchInput]
    }
  }

  @js.native
  trait UpdatePullRequestDescriptionInput extends js.Object {
    var pullRequestId: js.UndefOr[PullRequestId]
    var description: js.UndefOr[Description]
  }

  object UpdatePullRequestDescriptionInput {
    def apply(
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      description: js.UndefOr[Description] = js.undefined): UpdatePullRequestDescriptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePullRequestDescriptionInput]
    }
  }

  @js.native
  trait UpdatePullRequestDescriptionOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object UpdatePullRequestDescriptionOutput {
    def apply(
      pullRequest: js.UndefOr[PullRequest] = js.undefined): UpdatePullRequestDescriptionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequest" -> pullRequest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePullRequestDescriptionOutput]
    }
  }

  @js.native
  trait UpdatePullRequestStatusInput extends js.Object {
    var pullRequestId: js.UndefOr[PullRequestId]
    var pullRequestStatus: js.UndefOr[PullRequestStatusEnum]
  }

  object UpdatePullRequestStatusInput {
    def apply(
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined): UpdatePullRequestStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "pullRequestStatus" -> pullRequestStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePullRequestStatusInput]
    }
  }

  @js.native
  trait UpdatePullRequestStatusOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object UpdatePullRequestStatusOutput {
    def apply(
      pullRequest: js.UndefOr[PullRequest] = js.undefined): UpdatePullRequestStatusOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequest" -> pullRequest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePullRequestStatusOutput]
    }
  }

  @js.native
  trait UpdatePullRequestTitleInput extends js.Object {
    var pullRequestId: js.UndefOr[PullRequestId]
    var title: js.UndefOr[Title]
  }

  object UpdatePullRequestTitleInput {
    def apply(
      pullRequestId: js.UndefOr[PullRequestId] = js.undefined,
      title: js.UndefOr[Title] = js.undefined): UpdatePullRequestTitleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequestId" -> pullRequestId.map { x => x.asInstanceOf[js.Any] },
        "title" -> title.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePullRequestTitleInput]
    }
  }

  @js.native
  trait UpdatePullRequestTitleOutput extends js.Object {
    var pullRequest: js.UndefOr[PullRequest]
  }

  object UpdatePullRequestTitleOutput {
    def apply(
      pullRequest: js.UndefOr[PullRequest] = js.undefined): UpdatePullRequestTitleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pullRequest" -> pullRequest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePullRequestTitleOutput]
    }
  }

  /**
   * <p>Represents the input of an update repository description operation.</p>
   */
  @js.native
  trait UpdateRepositoryDescriptionInput extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var repositoryDescription: js.UndefOr[RepositoryDescription]
  }

  object UpdateRepositoryDescriptionInput {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined): UpdateRepositoryDescriptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "repositoryDescription" -> repositoryDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRepositoryDescriptionInput]
    }
  }

  /**
   * <p>Represents the input of an update repository description operation.</p>
   */
  @js.native
  trait UpdateRepositoryNameInput extends js.Object {
    var oldName: js.UndefOr[RepositoryName]
    var newName: js.UndefOr[RepositoryName]
  }

  object UpdateRepositoryNameInput {
    def apply(
      oldName: js.UndefOr[RepositoryName] = js.undefined,
      newName: js.UndefOr[RepositoryName] = js.undefined): UpdateRepositoryNameInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "oldName" -> oldName.map { x => x.asInstanceOf[js.Any] },
        "newName" -> newName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRepositoryNameInput]
    }
  }

  /**
   * <p>Information about the user who made a specified commit.</p>
   */
  @js.native
  trait UserInfo extends js.Object {
    var name: js.UndefOr[Name]
    var email: js.UndefOr[Email]
    var date: js.UndefOr[Date]
  }

  object UserInfo {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      email: js.UndefOr[Email] = js.undefined,
      date: js.UndefOr[Date] = js.undefined): UserInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "email" -> email.map { x => x.asInstanceOf[js.Any] },
        "date" -> date.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserInfo]
    }
  }
}
