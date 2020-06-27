package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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

    @inline def associateTeamMemberFuture(params: AssociateTeamMemberRequest): Future[AssociateTeamMemberResult] =
      service.associateTeamMember(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResult] =
      service.createProject(params).promise().toFuture
    @inline def createUserProfileFuture(params: CreateUserProfileRequest): Future[CreateUserProfileResult] =
      service.createUserProfile(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResult] =
      service.deleteProject(params).promise().toFuture
    @inline def deleteUserProfileFuture(params: DeleteUserProfileRequest): Future[DeleteUserProfileResult] =
      service.deleteUserProfile(params).promise().toFuture
    @inline def describeProjectFuture(params: DescribeProjectRequest): Future[DescribeProjectResult] =
      service.describeProject(params).promise().toFuture
    @inline def describeUserProfileFuture(params: DescribeUserProfileRequest): Future[DescribeUserProfileResult] =
      service.describeUserProfile(params).promise().toFuture
    @inline def disassociateTeamMemberFuture(
        params: DisassociateTeamMemberRequest
    ): Future[DisassociateTeamMemberResult] = service.disassociateTeamMember(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResult] =
      service.listProjects(params).promise().toFuture
    @inline def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResult] =
      service.listResources(params).promise().toFuture
    @inline def listTagsForProjectFuture(params: ListTagsForProjectRequest): Future[ListTagsForProjectResult] =
      service.listTagsForProject(params).promise().toFuture
    @inline def listTeamMembersFuture(params: ListTeamMembersRequest): Future[ListTeamMembersResult] =
      service.listTeamMembers(params).promise().toFuture
    @inline def listUserProfilesFuture(params: ListUserProfilesRequest): Future[ListUserProfilesResult] =
      service.listUserProfiles(params).promise().toFuture
    @inline def tagProjectFuture(params: TagProjectRequest): Future[TagProjectResult] =
      service.tagProject(params).promise().toFuture
    @inline def untagProjectFuture(params: UntagProjectRequest): Future[UntagProjectResult] =
      service.untagProject(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResult] =
      service.updateProject(params).promise().toFuture
    @inline def updateTeamMemberFuture(params: UpdateTeamMemberRequest): Future[UpdateTeamMemberResult] =
      service.updateTeamMember(params).promise().toFuture
    @inline def updateUserProfileFuture(params: UpdateUserProfileRequest): Future[UpdateUserProfileResult] =
      service.updateUserProfile(params).promise().toFuture
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
  @Factory
  trait AssociateTeamMemberRequest extends js.Object {
    var projectId: ProjectId
    var projectRole: Role
    var userArn: UserArn
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
  }

  @js.native
  @Factory
  trait AssociateTeamMemberResult extends js.Object {
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  /**
    * Location and destination information about the source code files provided with the project request. The source code is uploaded to the new project source repository after project creation.
    */
  @js.native
  @Factory
  trait Code extends js.Object {
    var destination: CodeDestination
    var source: CodeSource
  }

  /**
    * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  @js.native
  @Factory
  trait CodeCommitCodeDestination extends js.Object {
    var name: RepositoryName
  }

  /**
    * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar provisions the new repository, the source code files provided with the project request are placed in the repository.
    */
  @js.native
  @Factory
  trait CodeDestination extends js.Object {
    var codeCommit: js.UndefOr[CodeCommitCodeDestination]
    var gitHub: js.UndefOr[GitHubCodeDestination]
  }

  /**
    * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the files during project creation.
    */
  @js.native
  @Factory
  trait CodeSource extends js.Object {
    var s3: S3Location
  }

  @js.native
  @Factory
  trait CreateProjectRequest extends js.Object {
    var id: ProjectId
    var name: ProjectName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var description: js.UndefOr[ProjectDescription]
    var sourceCode: js.UndefOr[SourceCode]
    var tags: js.UndefOr[Tags]
    var toolchain: js.UndefOr[Toolchain]
  }

  @js.native
  @Factory
  trait CreateProjectResult extends js.Object {
    var arn: ProjectArn
    var id: ProjectId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var projectTemplateId: js.UndefOr[ProjectTemplateId]
  }

  @js.native
  @Factory
  trait CreateUserProfileRequest extends js.Object {
    var displayName: UserProfileDisplayName
    var emailAddress: Email
    var userArn: UserArn
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  @js.native
  @Factory
  trait CreateUserProfileResult extends js.Object {
    var userArn: UserArn
    var createdTimestamp: js.UndefOr[CreatedTimestamp]
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  @js.native
  @Factory
  trait DeleteProjectRequest extends js.Object {
    var id: ProjectId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var deleteStack: js.UndefOr[DeleteStack]
  }

  @js.native
  @Factory
  trait DeleteProjectResult extends js.Object {
    var projectArn: js.UndefOr[ProjectArn]
    var stackId: js.UndefOr[StackId]
  }

  @js.native
  @Factory
  trait DeleteUserProfileRequest extends js.Object {
    var userArn: UserArn
  }

  @js.native
  @Factory
  trait DeleteUserProfileResult extends js.Object {
    var userArn: UserArn
  }

  @js.native
  @Factory
  trait DescribeProjectRequest extends js.Object {
    var id: ProjectId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeUserProfileRequest extends js.Object {
    var userArn: UserArn
  }

  @js.native
  @Factory
  trait DescribeUserProfileResult extends js.Object {
    var createdTimestamp: CreatedTimestamp
    var lastModifiedTimestamp: LastModifiedTimestamp
    var userArn: UserArn
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  @js.native
  @Factory
  trait DisassociateTeamMemberRequest extends js.Object {
    var projectId: ProjectId
    var userArn: UserArn
  }

  @js.native
  @Factory
  trait DisassociateTeamMemberResult extends js.Object {}

  /**
    * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  @js.native
  @Factory
  trait GitHubCodeDestination extends js.Object {
    var issuesEnabled: RepositoryEnableIssues
    var name: RepositoryName
    var owner: RepositoryOwner
    var privateRepository: RepositoryIsPrivate
    var token: GitHubPersonalToken
    var `type`: RepositoryType
    var description: js.UndefOr[RepositoryDescription]
  }

  @js.native
  @Factory
  trait ListProjectsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListProjectsResult extends js.Object {
    var projects: ProjectsList
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListResourcesRequest extends js.Object {
    var projectId: ProjectId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListResourcesResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var resources: js.UndefOr[ResourcesResult]
  }

  @js.native
  @Factory
  trait ListTagsForProjectRequest extends js.Object {
    var id: ProjectId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTagsForProjectResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait ListTeamMembersRequest extends js.Object {
    var projectId: ProjectId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTeamMembersResult extends js.Object {
    var teamMembers: TeamMemberResult
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListUserProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListUserProfilesResult extends js.Object {
    var userProfiles: UserProfilesList
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * An indication of whether a project creation or deletion is failed or successful.
    */
  @js.native
  @Factory
  trait ProjectStatus extends js.Object {
    var state: State
    var reason: js.UndefOr[Reason]
  }

  /**
    * Information about the metadata for a project.
    */
  @js.native
  @Factory
  trait ProjectSummary extends js.Object {
    var projectArn: js.UndefOr[ProjectArn]
    var projectId: js.UndefOr[ProjectId]
  }

  /**
    * Information about a resource for a project.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var id: ResourceId
  }

  /**
    * The Amazon S3 location where the source code files provided with the project request are stored.
    */
  @js.native
  @Factory
  trait S3Location extends js.Object {
    var bucketKey: js.UndefOr[BucketKey]
    var bucketName: js.UndefOr[BucketName]
  }

  @js.native
  @Factory
  trait TagProjectRequest extends js.Object {
    var id: ProjectId
    var tags: Tags
  }

  @js.native
  @Factory
  trait TagProjectResult extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  /**
    * Information about a team member in a project.
    */
  @js.native
  @Factory
  trait TeamMember extends js.Object {
    var projectRole: Role
    var userArn: UserArn
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
  }

  /**
    * The toolchain template file provided with the project request. AWS CodeStar uses the template to provision the toolchain stack in AWS CloudFormation.
    */
  @js.native
  @Factory
  trait Toolchain extends js.Object {
    var source: ToolchainSource
    var roleArn: js.UndefOr[RoleArn]
    var stackParameters: js.UndefOr[TemplateParameterMap]
  }

  /**
    * The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS CodeStar retrieves the file during project creation.
    */
  @js.native
  @Factory
  trait ToolchainSource extends js.Object {
    var s3: S3Location
  }

  @js.native
  @Factory
  trait UntagProjectRequest extends js.Object {
    var id: ProjectId
    var tags: TagKeys
  }

  @js.native
  @Factory
  trait UntagProjectResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateProjectRequest extends js.Object {
    var id: ProjectId
    var description: js.UndefOr[ProjectDescription]
    var name: js.UndefOr[ProjectName]
  }

  @js.native
  @Factory
  trait UpdateProjectResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateTeamMemberRequest extends js.Object {
    var projectId: ProjectId
    var userArn: UserArn
    var projectRole: js.UndefOr[Role]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
  }

  @js.native
  @Factory
  trait UpdateTeamMemberResult extends js.Object {
    var projectRole: js.UndefOr[Role]
    var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed]
    var userArn: js.UndefOr[UserArn]
  }

  @js.native
  @Factory
  trait UpdateUserProfileRequest extends js.Object {
    var userArn: UserArn
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  @js.native
  @Factory
  trait UpdateUserProfileResult extends js.Object {
    var userArn: UserArn
    var createdTimestamp: js.UndefOr[CreatedTimestamp]
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  /**
    * Information about a user's profile in AWS CodeStar.
    */
  @js.native
  @Factory
  trait UserProfileSummary extends js.Object {
    var displayName: js.UndefOr[UserProfileDisplayName]
    var emailAddress: js.UndefOr[Email]
    var sshPublicKey: js.UndefOr[SshPublicKey]
    var userArn: js.UndefOr[UserArn]
  }
}
