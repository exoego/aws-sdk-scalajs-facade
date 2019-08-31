package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object codestar {
  type BucketKey              = String
  type BucketName             = String
  type ClientRequestToken     = String
  type CreatedTimestamp       = js.Date
  type DeleteStack            = Boolean
  type Email                  = String
  type GitHubPersonalToken    = String
  type LastModifiedTimestamp  = js.Date
  type MaxResults             = Int
  type PaginationToken        = String
  type ProjectArn             = String
  type ProjectDescription     = String
  type ProjectId              = String
  type ProjectName            = String
  type ProjectTemplateId      = String
  type ProjectsList           = js.Array[ProjectSummary]
  type Reason                 = String
  type RemoteAccessAllowed    = Boolean
  type RepositoryDescription  = String
  type RepositoryEnableIssues = Boolean
  type RepositoryIsPrivate    = Boolean
  type RepositoryName         = String
  type RepositoryOwner        = String
  type RepositoryType         = String
  type ResourceId             = String
  type ResourcesResult        = js.Array[Resource]
  type Role                   = String
  type RoleArn                = String
  type SourceCode             = js.Array[Code]
  type SshPublicKey           = String
  type StackId                = String
  type State                  = String
  type TagKey                 = String
  type TagKeys                = js.Array[TagKey]
  type TagValue               = String
  type Tags                   = js.Dictionary[TagValue]
  type TeamMemberResult       = js.Array[TeamMember]
  type TemplateParameterKey   = String
  type TemplateParameterMap   = js.Dictionary[TemplateParameterValue]
  type TemplateParameterValue = String
  type UserArn                = String
  type UserProfileDisplayName = String
  type UserProfilesList       = js.Array[UserProfileSummary]

  implicit final class CodeStarOps(private val service: CodeStar) extends AnyVal {

    def associateTeamMemberFuture(params: AssociateTeamMemberRequest): Future[AssociateTeamMemberResult] =
      service.associateTeamMember(params).promise.toFuture
    def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResult] =
      service.createProject(params).promise.toFuture
    def createUserProfileFuture(params: CreateUserProfileRequest): Future[CreateUserProfileResult] =
      service.createUserProfile(params).promise.toFuture
    def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResult] =
      service.deleteProject(params).promise.toFuture
    def deleteUserProfileFuture(params: DeleteUserProfileRequest): Future[DeleteUserProfileResult] =
      service.deleteUserProfile(params).promise.toFuture
    def describeProjectFuture(params: DescribeProjectRequest): Future[DescribeProjectResult] =
      service.describeProject(params).promise.toFuture
    def describeUserProfileFuture(params: DescribeUserProfileRequest): Future[DescribeUserProfileResult] =
      service.describeUserProfile(params).promise.toFuture
    def disassociateTeamMemberFuture(params: DisassociateTeamMemberRequest): Future[DisassociateTeamMemberResult] =
      service.disassociateTeamMember(params).promise.toFuture
    def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResult] =
      service.listProjects(params).promise.toFuture
    def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResult] =
      service.listResources(params).promise.toFuture
    def listTagsForProjectFuture(params: ListTagsForProjectRequest): Future[ListTagsForProjectResult] =
      service.listTagsForProject(params).promise.toFuture
    def listTeamMembersFuture(params: ListTeamMembersRequest): Future[ListTeamMembersResult] =
      service.listTeamMembers(params).promise.toFuture
    def listUserProfilesFuture(params: ListUserProfilesRequest): Future[ListUserProfilesResult] =
      service.listUserProfiles(params).promise.toFuture
    def tagProjectFuture(params: TagProjectRequest): Future[TagProjectResult] =
      service.tagProject(params).promise.toFuture
    def untagProjectFuture(params: UntagProjectRequest): Future[UntagProjectResult] =
      service.untagProject(params).promise.toFuture
    def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResult] =
      service.updateProject(params).promise.toFuture
    def updateTeamMemberFuture(params: UpdateTeamMemberRequest): Future[UpdateTeamMemberResult] =
      service.updateTeamMember(params).promise.toFuture
    def updateUserProfileFuture(params: UpdateUserProfileRequest): Future[UpdateUserProfileResult] =
      service.updateUserProfile(params).promise.toFuture
  }
}

package codestar {
  @js.native
  @JSImport("aws-sdk", "CodeStar")
  class CodeStar() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateTeamMember(params: AssociateTeamMemberRequest): Request[AssociateTeamMemberResult]          = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResult]                            = js.native
    def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResult]                = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult]                            = js.native
    def deleteUserProfile(params: DeleteUserProfileRequest): Request[DeleteUserProfileResult]                = js.native
    def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResult]                      = js.native
    def describeUserProfile(params: DescribeUserProfileRequest): Request[DescribeUserProfileResult]          = js.native
    def disassociateTeamMember(params: DisassociateTeamMemberRequest): Request[DisassociateTeamMemberResult] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResult]                               = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResult]                            = js.native
    def listTagsForProject(params: ListTagsForProjectRequest): Request[ListTagsForProjectResult]             = js.native
    def listTeamMembers(params: ListTeamMembersRequest): Request[ListTeamMembersResult]                      = js.native
    def listUserProfiles(params: ListUserProfilesRequest): Request[ListUserProfilesResult]                   = js.native
    def tagProject(params: TagProjectRequest): Request[TagProjectResult]                                     = js.native
    def untagProject(params: UntagProjectRequest): Request[UntagProjectResult]                               = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResult]                            = js.native
    def updateTeamMember(params: UpdateTeamMemberRequest): Request[UpdateTeamMemberResult]                   = js.native
    def updateUserProfile(params: UpdateUserProfileRequest): Request[UpdateUserProfileResult]                = js.native
  }

  @js.native
  trait AssociateTeamMemberRequest extends js.Object {
    var projectId: ProjectId
    var projectRole: Role
    var userArn: UserArn
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
  }

  object AssociateTeamMemberRequest {
    def apply(
        projectId: ProjectId,
        projectRole: Role,
        userArn: UserArn,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
    ): AssociateTeamMemberRequest = {
      val __obj = js.Dynamic.literal(
        "projectId"   -> projectId.asInstanceOf[js.Any],
        "projectRole" -> projectRole.asInstanceOf[js.Any],
        "userArn"     -> userArn.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      remoteAccessAllowed.foreach(__v => __obj.updateDynamic("remoteAccessAllowed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateTeamMemberRequest]
    }
  }

  @js.native
  trait AssociateTeamMemberResult extends js.Object {
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object AssociateTeamMemberResult {
    def apply(
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): AssociateTeamMemberResult = {
      val __obj = js.Dynamic.literal()
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateTeamMemberResult]
    }
  }

  /**
    * Location and destination information about the source code files provided with the project request. The source code is uploaded to the new project source repository after project creation.
    */
  @js.native
  trait Code extends js.Object {
    var destination: CodeDestination
    var source: CodeSource
  }

  object Code {
    def apply(
        destination: CodeDestination,
        source: CodeSource
    ): Code = {
      val __obj = js.Dynamic.literal(
        "destination" -> destination.asInstanceOf[js.Any],
        "source"      -> source.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Code]
    }
  }

  /**
    * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  @js.native
  trait CodeCommitCodeDestination extends js.Object {
    var name: RepositoryName
  }

  object CodeCommitCodeDestination {
    def apply(
        name: RepositoryName
    ): CodeCommitCodeDestination = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CodeCommitCodeDestination]
    }
  }

  /**
    * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar provisions the new repository, the source code files provided with the project request are placed in the repository.
    */
  @js.native
  trait CodeDestination extends js.Object {
    var codeCommit: js.UndefOr[CodeCommitCodeDestination]
    var gitHub: js.UndefOr[GitHubCodeDestination]
  }

  object CodeDestination {
    def apply(
        codeCommit: js.UndefOr[CodeCommitCodeDestination] = js.undefined,
        gitHub: js.UndefOr[GitHubCodeDestination] = js.undefined
    ): CodeDestination = {
      val __obj = js.Dynamic.literal()
      codeCommit.foreach(__v => __obj.updateDynamic("codeCommit")(__v.asInstanceOf[js.Any]))
      gitHub.foreach(__v => __obj.updateDynamic("gitHub")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeDestination]
    }
  }

  /**
    * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the files during project creation.
    */
  @js.native
  trait CodeSource extends js.Object {
    var s3: S3Location
  }

  object CodeSource {
    def apply(
        s3: S3Location
    ): CodeSource = {
      val __obj = js.Dynamic.literal(
        "s3" -> s3.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CodeSource]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var id: ProjectId
    var name: ProjectName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var description: js.UndefOr[ProjectDescription]
    var sourceCode: js.UndefOr[SourceCode]
    var tags: js.UndefOr[Tags]
    var toolchain: js.UndefOr[Toolchain]
  }

  object CreateProjectRequest {
    def apply(
        id: ProjectId,
        name: ProjectName,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        description: js.UndefOr[ProjectDescription] = js.undefined,
        sourceCode: js.UndefOr[SourceCode] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        toolchain: js.UndefOr[Toolchain] = js.undefined
    ): CreateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "id"   -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      sourceCode.foreach(__v => __obj.updateDynamic("sourceCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      toolchain.foreach(__v => __obj.updateDynamic("toolchain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResult extends js.Object {
    var arn: ProjectArn
    var id: ProjectId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var projectTemplateId: js.UndefOr[ProjectTemplateId]
  }

  object CreateProjectResult {
    def apply(
        arn: ProjectArn,
        id: ProjectId,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined
    ): CreateProjectResult = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "id"  -> id.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      projectTemplateId.foreach(__v => __obj.updateDynamic("projectTemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectResult]
    }
  }

  @js.native
  trait CreateUserProfileRequest extends js.Object {
    var displayName: UserProfileDisplayName
    var emailAddress: Email
    var userArn: UserArn
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  object CreateUserProfileRequest {
    def apply(
        displayName: UserProfileDisplayName,
        emailAddress: Email,
        userArn: UserArn,
        sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    ): CreateUserProfileRequest = {
      val __obj = js.Dynamic.literal(
        "displayName"  -> displayName.asInstanceOf[js.Any],
        "emailAddress" -> emailAddress.asInstanceOf[js.Any],
        "userArn"      -> userArn.asInstanceOf[js.Any]
      )

      sshPublicKey.foreach(__v => __obj.updateDynamic("sshPublicKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserProfileRequest]
    }
  }

  @js.native
  trait CreateUserProfileResult extends js.Object {
    var userArn: UserArn
    var createdTimestamp: js.UndefOr[CreatedTimestamp]
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  object CreateUserProfileResult {
    def apply(
        userArn: UserArn,
        createdTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined,
        displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
        emailAddress: js.UndefOr[Email] = js.undefined,
        lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined,
        sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    ): CreateUserProfileResult = {
      val __obj = js.Dynamic.literal(
        "userArn" -> userArn.asInstanceOf[js.Any]
      )

      createdTimestamp.foreach(__v => __obj.updateDynamic("createdTimestamp")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      lastModifiedTimestamp.foreach(__v => __obj.updateDynamic("lastModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      sshPublicKey.foreach(__v => __obj.updateDynamic("sshPublicKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserProfileResult]
    }
  }

  @js.native
  trait DeleteProjectRequest extends js.Object {
    var id: ProjectId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var deleteStack: js.UndefOr[DeleteStack]
  }

  object DeleteProjectRequest {
    def apply(
        id: ProjectId,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        deleteStack: js.UndefOr[DeleteStack] = js.undefined
    ): DeleteProjectRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      deleteStack.foreach(__v => __obj.updateDynamic("deleteStack")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProjectRequest]
    }
  }

  @js.native
  trait DeleteProjectResult extends js.Object {
    var projectArn: js.UndefOr[ProjectArn]
    var stackId: js.UndefOr[StackId]
  }

  object DeleteProjectResult {
    def apply(
        projectArn: js.UndefOr[ProjectArn] = js.undefined,
        stackId: js.UndefOr[StackId] = js.undefined
    ): DeleteProjectResult = {
      val __obj = js.Dynamic.literal()
      projectArn.foreach(__v => __obj.updateDynamic("projectArn")(__v.asInstanceOf[js.Any]))
      stackId.foreach(__v => __obj.updateDynamic("stackId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProjectResult]
    }
  }

  @js.native
  trait DeleteUserProfileRequest extends js.Object {
    var userArn: UserArn
  }

  object DeleteUserProfileRequest {
    def apply(
        userArn: UserArn
    ): DeleteUserProfileRequest = {
      val __obj = js.Dynamic.literal(
        "userArn" -> userArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserProfileRequest]
    }
  }

  @js.native
  trait DeleteUserProfileResult extends js.Object {
    var userArn: UserArn
  }

  object DeleteUserProfileResult {
    def apply(
        userArn: UserArn
    ): DeleteUserProfileResult = {
      val __obj = js.Dynamic.literal(
        "userArn" -> userArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserProfileResult]
    }
  }

  @js.native
  trait DescribeProjectRequest extends js.Object {
    var id: ProjectId
  }

  object DescribeProjectRequest {
    def apply(
        id: ProjectId
    ): DescribeProjectRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeProjectRequest]
    }
  }

  @js.native
  trait DescribeProjectResult extends js.Object {
    var arn: js.UndefOr[ProjectArn]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var createdTimeStamp: js.UndefOr[CreatedTimestamp]
    var description: js.UndefOr[ProjectDescription]
    var id: js.UndefOr[ProjectId]
    var name: js.UndefOr[ProjectName]
    var projectTemplateId: js.UndefOr[ProjectTemplateId]
    var stackId: js.UndefOr[StackId]
    var status: js.UndefOr[ProjectStatus]
  }

  object DescribeProjectResult {
    def apply(
        arn: js.UndefOr[ProjectArn] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        createdTimeStamp: js.UndefOr[CreatedTimestamp] = js.undefined,
        description: js.UndefOr[ProjectDescription] = js.undefined,
        id: js.UndefOr[ProjectId] = js.undefined,
        name: js.UndefOr[ProjectName] = js.undefined,
        projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined,
        stackId: js.UndefOr[StackId] = js.undefined,
        status: js.UndefOr[ProjectStatus] = js.undefined
    ): DescribeProjectResult = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      createdTimeStamp.foreach(__v => __obj.updateDynamic("createdTimeStamp")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      projectTemplateId.foreach(__v => __obj.updateDynamic("projectTemplateId")(__v.asInstanceOf[js.Any]))
      stackId.foreach(__v => __obj.updateDynamic("stackId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectResult]
    }
  }

  @js.native
  trait DescribeUserProfileRequest extends js.Object {
    var userArn: UserArn
  }

  object DescribeUserProfileRequest {
    def apply(
        userArn: UserArn
    ): DescribeUserProfileRequest = {
      val __obj = js.Dynamic.literal(
        "userArn" -> userArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserProfileRequest]
    }
  }

  @js.native
  trait DescribeUserProfileResult extends js.Object {
    var createdTimestamp: CreatedTimestamp
    var lastModifiedTimestamp: LastModifiedTimestamp
    var userArn: UserArn
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  object DescribeUserProfileResult {
    def apply(
        createdTimestamp: CreatedTimestamp,
        lastModifiedTimestamp: LastModifiedTimestamp,
        userArn: UserArn,
        displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
        emailAddress: js.UndefOr[Email] = js.undefined,
        sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    ): DescribeUserProfileResult = {
      val __obj = js.Dynamic.literal(
        "createdTimestamp"      -> createdTimestamp.asInstanceOf[js.Any],
        "lastModifiedTimestamp" -> lastModifiedTimestamp.asInstanceOf[js.Any],
        "userArn"               -> userArn.asInstanceOf[js.Any]
      )

      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      sshPublicKey.foreach(__v => __obj.updateDynamic("sshPublicKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserProfileResult]
    }
  }

  @js.native
  trait DisassociateTeamMemberRequest extends js.Object {
    var projectId: ProjectId
    var userArn: UserArn
  }

  object DisassociateTeamMemberRequest {
    def apply(
        projectId: ProjectId,
        userArn: UserArn
    ): DisassociateTeamMemberRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any],
        "userArn"   -> userArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateTeamMemberRequest]
    }
  }

  @js.native
  trait DisassociateTeamMemberResult extends js.Object {}

  object DisassociateTeamMemberResult {
    def apply(
        ): DisassociateTeamMemberResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateTeamMemberResult]
    }
  }

  /**
    * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  @js.native
  trait GitHubCodeDestination extends js.Object {
    var issuesEnabled: RepositoryEnableIssues
    var name: RepositoryName
    var owner: RepositoryOwner
    var privateRepository: RepositoryIsPrivate
    var token: GitHubPersonalToken
    var `type`: RepositoryType
    var description: js.UndefOr[RepositoryDescription]
  }

  object GitHubCodeDestination {
    def apply(
        issuesEnabled: RepositoryEnableIssues,
        name: RepositoryName,
        owner: RepositoryOwner,
        privateRepository: RepositoryIsPrivate,
        token: GitHubPersonalToken,
        `type`: RepositoryType,
        description: js.UndefOr[RepositoryDescription] = js.undefined
    ): GitHubCodeDestination = {
      val __obj = js.Dynamic.literal(
        "issuesEnabled"     -> issuesEnabled.asInstanceOf[js.Any],
        "name"              -> name.asInstanceOf[js.Any],
        "owner"             -> owner.asInstanceOf[js.Any],
        "privateRepository" -> privateRepository.asInstanceOf[js.Any],
        "token"             -> token.asInstanceOf[js.Any],
        "type"              -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GitHubCodeDestination]
    }
  }

  @js.native
  trait ListProjectsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListProjectsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProjectsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsRequest]
    }
  }

  @js.native
  trait ListProjectsResult extends js.Object {
    var projects: ProjectsList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListProjectsResult {
    def apply(
        projects: ProjectsList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProjectsResult = {
      val __obj = js.Dynamic.literal(
        "projects" -> projects.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsResult]
    }
  }

  @js.native
  trait ListResourcesRequest extends js.Object {
    var projectId: ProjectId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListResourcesRequest {
    def apply(
        projectId: ProjectId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesRequest]
    }
  }

  @js.native
  trait ListResourcesResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var resources: js.UndefOr[ResourcesResult]
  }

  object ListResourcesResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        resources: js.UndefOr[ResourcesResult] = js.undefined
    ): ListResourcesResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesResult]
    }
  }

  @js.native
  trait ListTagsForProjectRequest extends js.Object {
    var id: ProjectId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTagsForProjectRequest {
    def apply(
        id: ProjectId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTagsForProjectRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForProjectRequest]
    }
  }

  @js.native
  trait ListTagsForProjectResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var tags: js.UndefOr[Tags]
  }

  object ListTagsForProjectResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForProjectResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForProjectResult]
    }
  }

  @js.native
  trait ListTeamMembersRequest extends js.Object {
    var projectId: ProjectId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTeamMembersRequest {
    def apply(
        projectId: ProjectId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTeamMembersRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTeamMembersRequest]
    }
  }

  @js.native
  trait ListTeamMembersResult extends js.Object {
    var teamMembers: TeamMemberResult
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTeamMembersResult {
    def apply(
        teamMembers: TeamMemberResult,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTeamMembersResult = {
      val __obj = js.Dynamic.literal(
        "teamMembers" -> teamMembers.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTeamMembersResult]
    }
  }

  @js.native
  trait ListUserProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUserProfilesRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListUserProfilesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserProfilesRequest]
    }
  }

  @js.native
  trait ListUserProfilesResult extends js.Object {
    var userProfiles: UserProfilesList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUserProfilesResult {
    def apply(
        userProfiles: UserProfilesList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListUserProfilesResult = {
      val __obj = js.Dynamic.literal(
        "userProfiles" -> userProfiles.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserProfilesResult]
    }
  }

  /**
    * An indication of whether a project creation or deletion is failed or successful.
    */
  @js.native
  trait ProjectStatus extends js.Object {
    var state: State
    var reason: js.UndefOr[Reason]
  }

  object ProjectStatus {
    def apply(
        state: State,
        reason: js.UndefOr[Reason] = js.undefined
    ): ProjectStatus = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any]
      )

      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectStatus]
    }
  }

  /**
    * Information about the metadata for a project.
    */
  @js.native
  trait ProjectSummary extends js.Object {
    var projectArn: js.UndefOr[ProjectArn]
    var projectId: js.UndefOr[ProjectId]
  }

  object ProjectSummary {
    def apply(
        projectArn: js.UndefOr[ProjectArn] = js.undefined,
        projectId: js.UndefOr[ProjectId] = js.undefined
    ): ProjectSummary = {
      val __obj = js.Dynamic.literal()
      projectArn.foreach(__v => __obj.updateDynamic("projectArn")(__v.asInstanceOf[js.Any]))
      projectId.foreach(__v => __obj.updateDynamic("projectId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectSummary]
    }
  }

  /**
    * Information about a resource for a project.
    */
  @js.native
  trait Resource extends js.Object {
    var id: ResourceId
  }

  object Resource {
    def apply(
        id: ResourceId
    ): Resource = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Resource]
    }
  }

  /**
    * The Amazon S3 location where the source code files provided with the project request are stored.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucketKey: js.UndefOr[BucketKey]
    var bucketName: js.UndefOr[BucketName]
  }

  object S3Location {
    def apply(
        bucketKey: js.UndefOr[BucketKey] = js.undefined,
        bucketName: js.UndefOr[BucketName] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      bucketKey.foreach(__v => __obj.updateDynamic("bucketKey")(__v.asInstanceOf[js.Any]))
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  @js.native
  trait TagProjectRequest extends js.Object {
    var id: ProjectId
    var tags: Tags
  }

  object TagProjectRequest {
    def apply(
        id: ProjectId,
        tags: Tags
    ): TagProjectRequest = {
      val __obj = js.Dynamic.literal(
        "id"   -> id.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagProjectRequest]
    }
  }

  @js.native
  trait TagProjectResult extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object TagProjectResult {
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): TagProjectResult = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagProjectResult]
    }
  }

  /**
    * Information about a team member in a project.
    */
  @js.native
  trait TeamMember extends js.Object {
    var projectRole: Role
    var userArn: UserArn
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
  }

  object TeamMember {
    def apply(
        projectRole: Role,
        userArn: UserArn,
        remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
    ): TeamMember = {
      val __obj = js.Dynamic.literal(
        "projectRole" -> projectRole.asInstanceOf[js.Any],
        "userArn"     -> userArn.asInstanceOf[js.Any]
      )

      remoteAccessAllowed.foreach(__v => __obj.updateDynamic("remoteAccessAllowed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TeamMember]
    }
  }

  /**
    * The toolchain template file provided with the project request. AWS CodeStar uses the template to provision the toolchain stack in AWS CloudFormation.
    */
  @js.native
  trait Toolchain extends js.Object {
    var source: ToolchainSource
    var roleArn: js.UndefOr[RoleArn]
    var stackParameters: js.UndefOr[TemplateParameterMap]
  }

  object Toolchain {
    def apply(
        source: ToolchainSource,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        stackParameters: js.UndefOr[TemplateParameterMap] = js.undefined
    ): Toolchain = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any]
      )

      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      stackParameters.foreach(__v => __obj.updateDynamic("stackParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Toolchain]
    }
  }

  /**
    * The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS CodeStar retrieves the file during project creation.
    */
  @js.native
  trait ToolchainSource extends js.Object {
    var s3: S3Location
  }

  object ToolchainSource {
    def apply(
        s3: S3Location
    ): ToolchainSource = {
      val __obj = js.Dynamic.literal(
        "s3" -> s3.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ToolchainSource]
    }
  }

  @js.native
  trait UntagProjectRequest extends js.Object {
    var id: ProjectId
    var tags: TagKeys
  }

  object UntagProjectRequest {
    def apply(
        id: ProjectId,
        tags: TagKeys
    ): UntagProjectRequest = {
      val __obj = js.Dynamic.literal(
        "id"   -> id.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagProjectRequest]
    }
  }

  @js.native
  trait UntagProjectResult extends js.Object {}

  object UntagProjectResult {
    def apply(
        ): UntagProjectResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagProjectResult]
    }
  }

  @js.native
  trait UpdateProjectRequest extends js.Object {
    var id: ProjectId
    var description: js.UndefOr[ProjectDescription]
    var name: js.UndefOr[ProjectName]
  }

  object UpdateProjectRequest {
    def apply(
        id: ProjectId,
        description: js.UndefOr[ProjectDescription] = js.undefined,
        name: js.UndefOr[ProjectName] = js.undefined
    ): UpdateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectRequest]
    }
  }

  @js.native
  trait UpdateProjectResult extends js.Object {}

  object UpdateProjectResult {
    def apply(
        ): UpdateProjectResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateProjectResult]
    }
  }

  @js.native
  trait UpdateTeamMemberRequest extends js.Object {
    var projectId: ProjectId
    var userArn: UserArn
    var projectRole: js.UndefOr[Role]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
  }

  object UpdateTeamMemberRequest {
    def apply(
        projectId: ProjectId,
        userArn: UserArn,
        projectRole: js.UndefOr[Role] = js.undefined,
        remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
    ): UpdateTeamMemberRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any],
        "userArn"   -> userArn.asInstanceOf[js.Any]
      )

      projectRole.foreach(__v => __obj.updateDynamic("projectRole")(__v.asInstanceOf[js.Any]))
      remoteAccessAllowed.foreach(__v => __obj.updateDynamic("remoteAccessAllowed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTeamMemberRequest]
    }
  }

  @js.native
  trait UpdateTeamMemberResult extends js.Object {
    var projectRole: js.UndefOr[Role]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
    var userArn: js.UndefOr[UserArn]
  }

  object UpdateTeamMemberResult {
    def apply(
        projectRole: js.UndefOr[Role] = js.undefined,
        remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined,
        userArn: js.UndefOr[UserArn] = js.undefined
    ): UpdateTeamMemberResult = {
      val __obj = js.Dynamic.literal()
      projectRole.foreach(__v => __obj.updateDynamic("projectRole")(__v.asInstanceOf[js.Any]))
      remoteAccessAllowed.foreach(__v => __obj.updateDynamic("remoteAccessAllowed")(__v.asInstanceOf[js.Any]))
      userArn.foreach(__v => __obj.updateDynamic("userArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTeamMemberResult]
    }
  }

  @js.native
  trait UpdateUserProfileRequest extends js.Object {
    var userArn: UserArn
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  object UpdateUserProfileRequest {
    def apply(
        userArn: UserArn,
        displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
        emailAddress: js.UndefOr[Email] = js.undefined,
        sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    ): UpdateUserProfileRequest = {
      val __obj = js.Dynamic.literal(
        "userArn" -> userArn.asInstanceOf[js.Any]
      )

      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      sshPublicKey.foreach(__v => __obj.updateDynamic("sshPublicKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserProfileRequest]
    }
  }

  @js.native
  trait UpdateUserProfileResult extends js.Object {
    var userArn: UserArn
    var createdTimestamp: js.UndefOr[CreatedTimestamp]
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  object UpdateUserProfileResult {
    def apply(
        userArn: UserArn,
        createdTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined,
        displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
        emailAddress: js.UndefOr[Email] = js.undefined,
        lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined,
        sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    ): UpdateUserProfileResult = {
      val __obj = js.Dynamic.literal(
        "userArn" -> userArn.asInstanceOf[js.Any]
      )

      createdTimestamp.foreach(__v => __obj.updateDynamic("createdTimestamp")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      lastModifiedTimestamp.foreach(__v => __obj.updateDynamic("lastModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      sshPublicKey.foreach(__v => __obj.updateDynamic("sshPublicKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserProfileResult]
    }
  }

  /**
    * Information about a user's profile in AWS CodeStar.
    */
  @js.native
  trait UserProfileSummary extends js.Object {
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var sshPublicKey: js.UndefOr[SshPublicKey]
    var userArn: js.UndefOr[UserArn]
  }

  object UserProfileSummary {
    def apply(
        displayName: js.UndefOr[UserProfileDisplayName] = js.undefined,
        emailAddress: js.UndefOr[Email] = js.undefined,
        sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined,
        userArn: js.UndefOr[UserArn] = js.undefined
    ): UserProfileSummary = {
      val __obj = js.Dynamic.literal()
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      sshPublicKey.foreach(__v => __obj.updateDynamic("sshPublicKey")(__v.asInstanceOf[js.Any]))
      userArn.foreach(__v => __obj.updateDynamic("userArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserProfileSummary]
    }
  }
}
