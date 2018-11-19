package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object codestar {
  type BucketKey = String
  type BucketName = String
  type ClientRequestToken = String
  type CreatedTimestamp = js.Date
  type DeleteStack = Boolean
  type Email = String
  type GitHubPersonalToken = String
  type LastModifiedTimestamp = js.Date
  type MaxResults = Int
  type PaginationToken = String
  type ProjectArn = String
  type ProjectDescription = String
  type ProjectId = String
  type ProjectName = String
  type ProjectTemplateId = String
  type ProjectsList = js.Array[ProjectSummary]
  type Reason = String
  type RemoteAccessAllowed = Boolean
  type RepositoryDescription = String
  type RepositoryEnableIssues = Boolean
  type RepositoryIsPrivate = Boolean
  type RepositoryName = String
  type RepositoryOwner = String
  type RepositoryType = String
  type ResourceId = String
  type ResourcesResult = js.Array[Resource]
  type Role = String
  type RoleArn = String
  type SourceCode = js.Array[Code]
  type SshPublicKey = String
  type StackId = String
  type State = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type TeamMemberResult = js.Array[TeamMember]
  type TemplateParameterKey = String
  type TemplateParameterMap = js.Dictionary[TemplateParameterValue]
  type TemplateParameterValue = String
  type UserArn = String
  type UserProfileDisplayName = String
  type UserProfilesList = js.Array[UserProfileSummary]
}

package codestar {
  @js.native
  @JSImport("aws-sdk", "CodeStar")
  class CodeStar(config: AWSConfig) extends js.Object {
    def associateTeamMember(params: AssociateTeamMemberRequest): Request[AssociateTeamMemberResult] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResult] = js.native
    def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResult] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult] = js.native
    def deleteUserProfile(params: DeleteUserProfileRequest): Request[DeleteUserProfileResult] = js.native
    def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResult] = js.native
    def describeUserProfile(params: DescribeUserProfileRequest): Request[DescribeUserProfileResult] = js.native
    def disassociateTeamMember(params: DisassociateTeamMemberRequest): Request[DisassociateTeamMemberResult] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResult] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResult] = js.native
    def listTagsForProject(params: ListTagsForProjectRequest): Request[ListTagsForProjectResult] = js.native
    def listTeamMembers(params: ListTeamMembersRequest): Request[ListTeamMembersResult] = js.native
    def listUserProfiles(params: ListUserProfilesRequest): Request[ListUserProfilesResult] = js.native
    def tagProject(params: TagProjectRequest): Request[TagProjectResult] = js.native
    def untagProject(params: UntagProjectRequest): Request[UntagProjectResult] = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResult] = js.native
    def updateTeamMember(params: UpdateTeamMemberRequest): Request[UpdateTeamMemberResult] = js.native
    def updateUserProfile(params: UpdateUserProfileRequest): Request[UpdateUserProfileResult] = js.native
  }

  @js.native
  trait AssociateTeamMemberRequest extends js.Object {
    var projectRole: js.UndefOr[Role]
    var projectId: js.UndefOr[ProjectId]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
    var userArn: js.UndefOr[UserArn]
  }

  object AssociateTeamMemberRequest {
    def apply(
      projectRole: js.UndefOr[Role] = js.undefined,
      projectId: js.UndefOr[ProjectId] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined,
      userArn: js.UndefOr[UserArn] = js.undefined): AssociateTeamMemberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectRole" -> projectRole.map { x => x.asInstanceOf[js.Any] },
        "projectId" -> projectId.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "remoteAccessAllowed" -> remoteAccessAllowed.map { x => x.asInstanceOf[js.Any] },
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateTeamMemberRequest]
    }
  }

  @js.native
  trait AssociateTeamMemberResult extends js.Object {
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object AssociateTeamMemberResult {
    def apply(
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined): AssociateTeamMemberResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateTeamMemberResult]
    }
  }

  /**
   * <p>Location and destination information about the source code files provided with the project request. The source code is uploaded to the new project source repository after project creation.</p>
   */
  @js.native
  trait Code extends js.Object {
    var source: js.UndefOr[CodeSource]
    var destination: js.UndefOr[CodeDestination]
  }

  object Code {
    def apply(
      source: js.UndefOr[CodeSource] = js.undefined,
      destination: js.UndefOr[CodeDestination] = js.undefined): Code = {
      val _fields = IndexedSeq[(String, js.Any)](
        "source" -> source.map { x => x.asInstanceOf[js.Any] },
        "destination" -> destination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Code]
    }
  }

  /**
   * <p>Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.</p>
   */
  @js.native
  trait CodeCommitCodeDestination extends js.Object {
    var name: js.UndefOr[RepositoryName]
  }

  object CodeCommitCodeDestination {
    def apply(
      name: js.UndefOr[RepositoryName] = js.undefined): CodeCommitCodeDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeCommitCodeDestination]
    }
  }

  /**
   * <p>The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar provisions the new repository, the source code files provided with the project request are placed in the repository.</p>
   */
  @js.native
  trait CodeDestination extends js.Object {
    var codeCommit: js.UndefOr[CodeCommitCodeDestination]
    var gitHub: js.UndefOr[GitHubCodeDestination]
  }

  object CodeDestination {
    def apply(
      codeCommit: js.UndefOr[CodeCommitCodeDestination] = js.undefined,
      gitHub: js.UndefOr[GitHubCodeDestination] = js.undefined): CodeDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "codeCommit" -> codeCommit.map { x => x.asInstanceOf[js.Any] },
        "gitHub" -> gitHub.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeDestination]
    }
  }

  /**
   * <p>The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the files during project creation.</p>
   */
  @js.native
  trait CodeSource extends js.Object {
    var s3: js.UndefOr[S3Location]
  }

  object CodeSource {
    def apply(
      s3: js.UndefOr[S3Location] = js.undefined): CodeSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3" -> s3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeSource]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var name: js.UndefOr[ProjectName]
    var description: js.UndefOr[ProjectDescription]
    var sourceCode: js.UndefOr[SourceCode]
    var tags: js.UndefOr[Tags]
    var id: js.UndefOr[ProjectId]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var toolchain: js.UndefOr[Toolchain]
  }

  object CreateProjectRequest {
    def apply(
      name: js.UndefOr[ProjectName] = js.undefined,
      description: js.UndefOr[ProjectDescription] = js.undefined,
      sourceCode: js.UndefOr[SourceCode] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      id: js.UndefOr[ProjectId] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      toolchain: js.UndefOr[Toolchain] = js.undefined): CreateProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "sourceCode" -> sourceCode.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "toolchain" -> toolchain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResult extends js.Object {
    var id: js.UndefOr[ProjectId]
    var arn: js.UndefOr[ProjectArn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var projectTemplateId: js.UndefOr[ProjectTemplateId]
  }

  object CreateProjectResult {
    def apply(
      id: js.UndefOr[ProjectId] = js.undefined,
      arn: js.UndefOr[ProjectArn] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined): CreateProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "projectTemplateId" -> projectTemplateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProjectResult]
    }
  }

  @js.native
  trait CreateUserProfileRequest extends js.Object {
    var userArn: js.UndefOr[UserArn]
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  object CreateUserProfileRequest {
    def apply(
      userArn: js.UndefOr[UserArn] = js.undefined,
      displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
      emailAddress: js.UndefOr[Email] = js.undefined,
      sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined): CreateUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] },
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "emailAddress" -> emailAddress.map { x => x.asInstanceOf[js.Any] },
        "sshPublicKey" -> sshPublicKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserProfileRequest]
    }
  }

  @js.native
  trait CreateUserProfileResult extends js.Object {
    var displayName: js.UndefOr[UserProfileDisplayName]
    var sshPublicKey: js.UndefOr[SshPublicKey]
    var emailAddress: js.UndefOr[Email]
    var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp]
    var createdTimestamp: js.UndefOr[CreatedTimestamp]
    var userArn: js.UndefOr[UserArn]
  }

  object CreateUserProfileResult {
    def apply(
      displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
      sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined,
      emailAddress: js.UndefOr[Email] = js.undefined,
      lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined,
      createdTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined,
      userArn: js.UndefOr[UserArn] = js.undefined): CreateUserProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "sshPublicKey" -> sshPublicKey.map { x => x.asInstanceOf[js.Any] },
        "emailAddress" -> emailAddress.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedTimestamp" -> lastModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "createdTimestamp" -> createdTimestamp.map { x => x.asInstanceOf[js.Any] },
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserProfileResult]
    }
  }

  @js.native
  trait DeleteProjectRequest extends js.Object {
    var id: js.UndefOr[ProjectId]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var deleteStack: js.UndefOr[DeleteStack]
  }

  object DeleteProjectRequest {
    def apply(
      id: js.UndefOr[ProjectId] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      deleteStack: js.UndefOr[DeleteStack] = js.undefined): DeleteProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "deleteStack" -> deleteStack.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProjectRequest]
    }
  }

  @js.native
  trait DeleteProjectResult extends js.Object {
    var stackId: js.UndefOr[StackId]
    var projectArn: js.UndefOr[ProjectArn]
  }

  object DeleteProjectResult {
    def apply(
      stackId: js.UndefOr[StackId] = js.undefined,
      projectArn: js.UndefOr[ProjectArn] = js.undefined): DeleteProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stackId" -> stackId.map { x => x.asInstanceOf[js.Any] },
        "projectArn" -> projectArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProjectResult]
    }
  }

  @js.native
  trait DeleteUserProfileRequest extends js.Object {
    var userArn: js.UndefOr[UserArn]
  }

  object DeleteUserProfileRequest {
    def apply(
      userArn: js.UndefOr[UserArn] = js.undefined): DeleteUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserProfileRequest]
    }
  }

  @js.native
  trait DeleteUserProfileResult extends js.Object {
    var userArn: js.UndefOr[UserArn]
  }

  object DeleteUserProfileResult {
    def apply(
      userArn: js.UndefOr[UserArn] = js.undefined): DeleteUserProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserProfileResult]
    }
  }

  @js.native
  trait DescribeProjectRequest extends js.Object {
    var id: js.UndefOr[ProjectId]
  }

  object DescribeProjectRequest {
    def apply(
      id: js.UndefOr[ProjectId] = js.undefined): DescribeProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProjectRequest]
    }
  }

  @js.native
  trait DescribeProjectResult extends js.Object {
    var arn: js.UndefOr[ProjectArn]
    var name: js.UndefOr[ProjectName]
    var description: js.UndefOr[ProjectDescription]
    var createdTimeStamp: js.UndefOr[CreatedTimestamp]
    var stackId: js.UndefOr[StackId]
    var id: js.UndefOr[ProjectId]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var status: js.UndefOr[ProjectStatus]
    var projectTemplateId: js.UndefOr[ProjectTemplateId]
  }

  object DescribeProjectResult {
    def apply(
      arn: js.UndefOr[ProjectArn] = js.undefined,
      name: js.UndefOr[ProjectName] = js.undefined,
      description: js.UndefOr[ProjectDescription] = js.undefined,
      createdTimeStamp: js.UndefOr[CreatedTimestamp] = js.undefined,
      stackId: js.UndefOr[StackId] = js.undefined,
      id: js.UndefOr[ProjectId] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      status: js.UndefOr[ProjectStatus] = js.undefined,
      projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined): DescribeProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "createdTimeStamp" -> createdTimeStamp.map { x => x.asInstanceOf[js.Any] },
        "stackId" -> stackId.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "projectTemplateId" -> projectTemplateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProjectResult]
    }
  }

  @js.native
  trait DescribeUserProfileRequest extends js.Object {
    var userArn: js.UndefOr[UserArn]
  }

  object DescribeUserProfileRequest {
    def apply(
      userArn: js.UndefOr[UserArn] = js.undefined): DescribeUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserProfileRequest]
    }
  }

  @js.native
  trait DescribeUserProfileResult extends js.Object {
    var displayName: js.UndefOr[UserProfileDisplayName]
    var sshPublicKey: js.UndefOr[SshPublicKey]
    var emailAddress: js.UndefOr[Email]
    var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp]
    var createdTimestamp: js.UndefOr[CreatedTimestamp]
    var userArn: js.UndefOr[UserArn]
  }

  object DescribeUserProfileResult {
    def apply(
      displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
      sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined,
      emailAddress: js.UndefOr[Email] = js.undefined,
      lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined,
      createdTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined,
      userArn: js.UndefOr[UserArn] = js.undefined): DescribeUserProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "sshPublicKey" -> sshPublicKey.map { x => x.asInstanceOf[js.Any] },
        "emailAddress" -> emailAddress.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedTimestamp" -> lastModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "createdTimestamp" -> createdTimestamp.map { x => x.asInstanceOf[js.Any] },
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserProfileResult]
    }
  }

  @js.native
  trait DisassociateTeamMemberRequest extends js.Object {
    var projectId: js.UndefOr[ProjectId]
    var userArn: js.UndefOr[UserArn]
  }

  object DisassociateTeamMemberRequest {
    def apply(
      projectId: js.UndefOr[ProjectId] = js.undefined,
      userArn: js.UndefOr[UserArn] = js.undefined): DisassociateTeamMemberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectId" -> projectId.map { x => x.asInstanceOf[js.Any] },
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateTeamMemberRequest]
    }
  }

  @js.native
  trait DisassociateTeamMemberResult extends js.Object {

  }

  object DisassociateTeamMemberResult {
    def apply(): DisassociateTeamMemberResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateTeamMemberResult]
    }
  }

  /**
   * <p>Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.</p>
   */
  @js.native
  trait GitHubCodeDestination extends js.Object {
    var name: js.UndefOr[RepositoryName]
    var description: js.UndefOr[RepositoryDescription]
    var privateRepository: js.UndefOr[RepositoryIsPrivate]
    var issuesEnabled: js.UndefOr[RepositoryEnableIssues]
    var token: js.UndefOr[GitHubPersonalToken]
    var owner: js.UndefOr[RepositoryOwner]
    var `type`: js.UndefOr[RepositoryType]
  }

  object GitHubCodeDestination {
    def apply(
      name: js.UndefOr[RepositoryName] = js.undefined,
      description: js.UndefOr[RepositoryDescription] = js.undefined,
      privateRepository: js.UndefOr[RepositoryIsPrivate] = js.undefined,
      issuesEnabled: js.UndefOr[RepositoryEnableIssues] = js.undefined,
      token: js.UndefOr[GitHubPersonalToken] = js.undefined,
      owner: js.UndefOr[RepositoryOwner] = js.undefined,
      `type`: js.UndefOr[RepositoryType] = js.undefined): GitHubCodeDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "privateRepository" -> privateRepository.map { x => x.asInstanceOf[js.Any] },
        "issuesEnabled" -> issuesEnabled.map { x => x.asInstanceOf[js.Any] },
        "token" -> token.map { x => x.asInstanceOf[js.Any] },
        "owner" -> owner.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GitHubCodeDestination]
    }
  }

  @js.native
  trait ListProjectsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListProjectsRequest {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListProjectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProjectsRequest]
    }
  }

  @js.native
  trait ListProjectsResult extends js.Object {
    var projects: js.UndefOr[ProjectsList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListProjectsResult {
    def apply(
      projects: js.UndefOr[ProjectsList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListProjectsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projects" -> projects.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProjectsResult]
    }
  }

  @js.native
  trait ListResourcesRequest extends js.Object {
    var projectId: js.UndefOr[ProjectId]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListResourcesRequest {
    def apply(
      projectId: js.UndefOr[ProjectId] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectId" -> projectId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesRequest]
    }
  }

  @js.native
  trait ListResourcesResult extends js.Object {
    var resources: js.UndefOr[ResourcesResult]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListResourcesResult {
    def apply(
      resources: js.UndefOr[ResourcesResult] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListResourcesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resources" -> resources.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesResult]
    }
  }

  @js.native
  trait ListTagsForProjectRequest extends js.Object {
    var id: js.UndefOr[ProjectId]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListTagsForProjectRequest {
    def apply(
      id: js.UndefOr[ProjectId] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListTagsForProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForProjectRequest]
    }
  }

  @js.native
  trait ListTagsForProjectResult extends js.Object {
    var tags: js.UndefOr[Tags]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTagsForProjectResult {
    def apply(
      tags: js.UndefOr[Tags] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListTagsForProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForProjectResult]
    }
  }

  @js.native
  trait ListTeamMembersRequest extends js.Object {
    var projectId: js.UndefOr[ProjectId]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListTeamMembersRequest {
    def apply(
      projectId: js.UndefOr[ProjectId] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListTeamMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectId" -> projectId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTeamMembersRequest]
    }
  }

  @js.native
  trait ListTeamMembersResult extends js.Object {
    var teamMembers: js.UndefOr[TeamMemberResult]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTeamMembersResult {
    def apply(
      teamMembers: js.UndefOr[TeamMemberResult] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListTeamMembersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "teamMembers" -> teamMembers.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTeamMembersResult]
    }
  }

  @js.native
  trait ListUserProfilesRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListUserProfilesRequest {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListUserProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserProfilesRequest]
    }
  }

  @js.native
  trait ListUserProfilesResult extends js.Object {
    var userProfiles: js.UndefOr[UserProfilesList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUserProfilesResult {
    def apply(
      userProfiles: js.UndefOr[UserProfilesList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListUserProfilesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userProfiles" -> userProfiles.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserProfilesResult]
    }
  }

  /**
   * <p>An indication of whether a project creation or deletion is failed or successful.</p>
   */
  @js.native
  trait ProjectStatus extends js.Object {
    var state: js.UndefOr[State]
    var reason: js.UndefOr[Reason]
  }

  object ProjectStatus {
    def apply(
      state: js.UndefOr[State] = js.undefined,
      reason: js.UndefOr[Reason] = js.undefined): ProjectStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProjectStatus]
    }
  }

  /**
   * <p>Information about the metadata for a project.</p>
   */
  @js.native
  trait ProjectSummary extends js.Object {
    var projectId: js.UndefOr[ProjectId]
    var projectArn: js.UndefOr[ProjectArn]
  }

  object ProjectSummary {
    def apply(
      projectId: js.UndefOr[ProjectId] = js.undefined,
      projectArn: js.UndefOr[ProjectArn] = js.undefined): ProjectSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectId" -> projectId.map { x => x.asInstanceOf[js.Any] },
        "projectArn" -> projectArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProjectSummary]
    }
  }

  /**
   * <p>Information about a resource for a project.</p>
   */
  @js.native
  trait Resource extends js.Object {
    var id: js.UndefOr[ResourceId]
  }

  object Resource {
    def apply(
      id: js.UndefOr[ResourceId] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  /**
   * <p>The Amazon S3 location where the source code files provided with the project request are stored.</p>
   */
  @js.native
  trait S3Location extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var bucketKey: js.UndefOr[BucketKey]
  }

  object S3Location {
    def apply(
      bucketName: js.UndefOr[BucketName] = js.undefined,
      bucketKey: js.UndefOr[BucketKey] = js.undefined): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bucketName" -> bucketName.map { x => x.asInstanceOf[js.Any] },
        "bucketKey" -> bucketKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  @js.native
  trait TagProjectRequest extends js.Object {
    var id: js.UndefOr[ProjectId]
    var tags: js.UndefOr[Tags]
  }

  object TagProjectRequest {
    def apply(
      id: js.UndefOr[ProjectId] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): TagProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagProjectRequest]
    }
  }

  @js.native
  trait TagProjectResult extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object TagProjectResult {
    def apply(
      tags: js.UndefOr[Tags] = js.undefined): TagProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagProjectResult]
    }
  }

  /**
   * <p>Information about a team member in a project.</p>
   */
  @js.native
  trait TeamMember extends js.Object {
    var userArn: js.UndefOr[UserArn]
    var projectRole: js.UndefOr[Role]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
  }

  object TeamMember {
    def apply(
      userArn: js.UndefOr[UserArn] = js.undefined,
      projectRole: js.UndefOr[Role] = js.undefined,
      remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined): TeamMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] },
        "projectRole" -> projectRole.map { x => x.asInstanceOf[js.Any] },
        "remoteAccessAllowed" -> remoteAccessAllowed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TeamMember]
    }
  }

  /**
   * <p>The toolchain template file provided with the project request. AWS CodeStar uses the template to provision the toolchain stack in AWS CloudFormation.</p>
   */
  @js.native
  trait Toolchain extends js.Object {
    var source: js.UndefOr[ToolchainSource]
    var roleArn: js.UndefOr[RoleArn]
    var stackParameters: js.UndefOr[TemplateParameterMap]
  }

  object Toolchain {
    def apply(
      source: js.UndefOr[ToolchainSource] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      stackParameters: js.UndefOr[TemplateParameterMap] = js.undefined): Toolchain = {
      val _fields = IndexedSeq[(String, js.Any)](
        "source" -> source.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "stackParameters" -> stackParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Toolchain]
    }
  }

  /**
   * <p>The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS CodeStar retrieves the file during project creation.</p>
   */
  @js.native
  trait ToolchainSource extends js.Object {
    var s3: js.UndefOr[S3Location]
  }

  object ToolchainSource {
    def apply(
      s3: js.UndefOr[S3Location] = js.undefined): ToolchainSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "s3" -> s3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ToolchainSource]
    }
  }

  @js.native
  trait UntagProjectRequest extends js.Object {
    var id: js.UndefOr[ProjectId]
    var tags: js.UndefOr[TagKeys]
  }

  object UntagProjectRequest {
    def apply(
      id: js.UndefOr[ProjectId] = js.undefined,
      tags: js.UndefOr[TagKeys] = js.undefined): UntagProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagProjectRequest]
    }
  }

  @js.native
  trait UntagProjectResult extends js.Object {

  }

  object UntagProjectResult {
    def apply(): UntagProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagProjectResult]
    }
  }

  @js.native
  trait UpdateProjectRequest extends js.Object {
    var id: js.UndefOr[ProjectId]
    var name: js.UndefOr[ProjectName]
    var description: js.UndefOr[ProjectDescription]
  }

  object UpdateProjectRequest {
    def apply(
      id: js.UndefOr[ProjectId] = js.undefined,
      name: js.UndefOr[ProjectName] = js.undefined,
      description: js.UndefOr[ProjectDescription] = js.undefined): UpdateProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProjectRequest]
    }
  }

  @js.native
  trait UpdateProjectResult extends js.Object {

  }

  object UpdateProjectResult {
    def apply(): UpdateProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProjectResult]
    }
  }

  @js.native
  trait UpdateTeamMemberRequest extends js.Object {
    var projectId: js.UndefOr[ProjectId]
    var userArn: js.UndefOr[UserArn]
    var projectRole: js.UndefOr[Role]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
  }

  object UpdateTeamMemberRequest {
    def apply(
      projectId: js.UndefOr[ProjectId] = js.undefined,
      userArn: js.UndefOr[UserArn] = js.undefined,
      projectRole: js.UndefOr[Role] = js.undefined,
      remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined): UpdateTeamMemberRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectId" -> projectId.map { x => x.asInstanceOf[js.Any] },
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] },
        "projectRole" -> projectRole.map { x => x.asInstanceOf[js.Any] },
        "remoteAccessAllowed" -> remoteAccessAllowed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTeamMemberRequest]
    }
  }

  @js.native
  trait UpdateTeamMemberResult extends js.Object {
    var userArn: js.UndefOr[UserArn]
    var projectRole: js.UndefOr[Role]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
  }

  object UpdateTeamMemberResult {
    def apply(
      userArn: js.UndefOr[UserArn] = js.undefined,
      projectRole: js.UndefOr[Role] = js.undefined,
      remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined): UpdateTeamMemberResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] },
        "projectRole" -> projectRole.map { x => x.asInstanceOf[js.Any] },
        "remoteAccessAllowed" -> remoteAccessAllowed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTeamMemberResult]
    }
  }

  @js.native
  trait UpdateUserProfileRequest extends js.Object {
    var userArn: js.UndefOr[UserArn]
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  object UpdateUserProfileRequest {
    def apply(
      userArn: js.UndefOr[UserArn] = js.undefined,
      displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
      emailAddress: js.UndefOr[Email] = js.undefined,
      sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined): UpdateUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] },
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "emailAddress" -> emailAddress.map { x => x.asInstanceOf[js.Any] },
        "sshPublicKey" -> sshPublicKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserProfileRequest]
    }
  }

  @js.native
  trait UpdateUserProfileResult extends js.Object {
    var displayName: js.UndefOr[UserProfileDisplayName]
    var sshPublicKey: js.UndefOr[SshPublicKey]
    var emailAddress: js.UndefOr[Email]
    var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp]
    var createdTimestamp: js.UndefOr[CreatedTimestamp]
    var userArn: js.UndefOr[UserArn]
  }

  object UpdateUserProfileResult {
    def apply(
      displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
      sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined,
      emailAddress: js.UndefOr[Email] = js.undefined,
      lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined,
      createdTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined,
      userArn: js.UndefOr[UserArn] = js.undefined): UpdateUserProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "sshPublicKey" -> sshPublicKey.map { x => x.asInstanceOf[js.Any] },
        "emailAddress" -> emailAddress.map { x => x.asInstanceOf[js.Any] },
        "lastModifiedTimestamp" -> lastModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "createdTimestamp" -> createdTimestamp.map { x => x.asInstanceOf[js.Any] },
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserProfileResult]
    }
  }

  /**
   * <p>Information about a user's profile in AWS CodeStar.</p>
   */
  @js.native
  trait UserProfileSummary extends js.Object {
    var userArn: js.UndefOr[UserArn]
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  object UserProfileSummary {
    def apply(
      userArn: js.UndefOr[UserArn] = js.undefined,
      displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
      emailAddress: js.UndefOr[Email] = js.undefined,
      sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined): UserProfileSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] },
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "emailAddress" -> emailAddress.map { x => x.asInstanceOf[js.Any] },
        "sshPublicKey" -> sshPublicKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserProfileSummary]
    }
  }
}
