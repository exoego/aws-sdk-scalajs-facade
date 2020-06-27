package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object codebuild {
  type BuildArtifactsList             = js.Array[BuildArtifacts]
  type BuildIds                       = js.Array[NonEmptyString]
  type BuildPhases                    = js.Array[BuildPhase]
  type BuildReportArns                = js.Array[String]
  type Builds                         = js.Array[Build]
  type BuildsNotDeleted               = js.Array[BuildNotDeleted]
  type EnvironmentImages              = js.Array[EnvironmentImage]
  type EnvironmentLanguages           = js.Array[EnvironmentLanguage]
  type EnvironmentPlatforms           = js.Array[EnvironmentPlatform]
  type EnvironmentVariables           = js.Array[EnvironmentVariable]
  type ExportedEnvironmentVariables   = js.Array[ExportedEnvironmentVariable]
  type FilterGroup                    = js.Array[WebhookFilter]
  type FilterGroups                   = js.Array[FilterGroup]
  type GitCloneDepth                  = Int
  type ImageVersions                  = js.Array[String]
  type KeyInput                       = String
  type NonEmptyString                 = String
  type PageSize                       = Int
  type PhaseContexts                  = js.Array[PhaseContext]
  type ProjectArns                    = js.Array[NonEmptyString]
  type ProjectArtifactsList           = js.Array[ProjectArtifacts]
  type ProjectCacheModes              = js.Array[CacheMode]
  type ProjectDescription             = String
  type ProjectFileSystemLocations     = js.Array[ProjectFileSystemLocation]
  type ProjectName                    = String
  type ProjectNames                   = js.Array[NonEmptyString]
  type ProjectSecondarySourceVersions = js.Array[ProjectSourceVersion]
  type ProjectSources                 = js.Array[ProjectSource]
  type Projects                       = js.Array[Project]
  type ReportArns                     = js.Array[NonEmptyString]
  type ReportGroupArns                = js.Array[NonEmptyString]
  type ReportGroupName                = String
  type ReportGroups                   = js.Array[ReportGroup]
  type ReportStatusCounts             = js.Dictionary[WrapperInt]
  type Reports                        = js.Array[Report]
  type SecurityGroupIds               = js.Array[NonEmptyString]
  type SensitiveNonEmptyString        = String
  type SourceCredentialsInfos         = js.Array[SourceCredentialsInfo]
  type Subnets                        = js.Array[NonEmptyString]
  type TagList                        = js.Array[Tag]
  type TestCases                      = js.Array[TestCase]
  type TimeOut                        = Int
  type Timestamp                      = js.Date
  type ValueInput                     = String
  type WrapperBoolean                 = Boolean
  type WrapperInt                     = Int
  type WrapperLong                    = Double

  implicit final class CodeBuildOps(private val service: CodeBuild) extends AnyVal {

    @inline def batchDeleteBuildsFuture(params: BatchDeleteBuildsInput): Future[BatchDeleteBuildsOutput] =
      service.batchDeleteBuilds(params).promise().toFuture
    @inline def batchGetBuildsFuture(params: BatchGetBuildsInput): Future[BatchGetBuildsOutput] =
      service.batchGetBuilds(params).promise().toFuture
    @inline def batchGetProjectsFuture(params: BatchGetProjectsInput): Future[BatchGetProjectsOutput] =
      service.batchGetProjects(params).promise().toFuture
    @inline def batchGetReportGroupsFuture(params: BatchGetReportGroupsInput): Future[BatchGetReportGroupsOutput] =
      service.batchGetReportGroups(params).promise().toFuture
    @inline def batchGetReportsFuture(params: BatchGetReportsInput): Future[BatchGetReportsOutput] =
      service.batchGetReports(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectInput): Future[CreateProjectOutput] =
      service.createProject(params).promise().toFuture
    @inline def createReportGroupFuture(params: CreateReportGroupInput): Future[CreateReportGroupOutput] =
      service.createReportGroup(params).promise().toFuture
    @inline def createWebhookFuture(params: CreateWebhookInput): Future[CreateWebhookOutput] =
      service.createWebhook(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectInput): Future[DeleteProjectOutput] =
      service.deleteProject(params).promise().toFuture
    @inline def deleteReportFuture(params: DeleteReportInput): Future[DeleteReportOutput] =
      service.deleteReport(params).promise().toFuture
    @inline def deleteReportGroupFuture(params: DeleteReportGroupInput): Future[DeleteReportGroupOutput] =
      service.deleteReportGroup(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyInput): Future[DeleteResourcePolicyOutput] =
      service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteSourceCredentialsFuture(
        params: DeleteSourceCredentialsInput
    ): Future[DeleteSourceCredentialsOutput] = service.deleteSourceCredentials(params).promise().toFuture
    @inline def deleteWebhookFuture(params: DeleteWebhookInput): Future[DeleteWebhookOutput] =
      service.deleteWebhook(params).promise().toFuture
    @inline def describeTestCasesFuture(params: DescribeTestCasesInput): Future[DescribeTestCasesOutput] =
      service.describeTestCases(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyInput): Future[GetResourcePolicyOutput] =
      service.getResourcePolicy(params).promise().toFuture
    @inline def importSourceCredentialsFuture(
        params: ImportSourceCredentialsInput
    ): Future[ImportSourceCredentialsOutput] = service.importSourceCredentials(params).promise().toFuture
    @inline def invalidateProjectCacheFuture(
        params: InvalidateProjectCacheInput
    ): Future[InvalidateProjectCacheOutput] = service.invalidateProjectCache(params).promise().toFuture
    @inline def listBuildsForProjectFuture(params: ListBuildsForProjectInput): Future[ListBuildsForProjectOutput] =
      service.listBuildsForProject(params).promise().toFuture
    @inline def listBuildsFuture(params: ListBuildsInput): Future[ListBuildsOutput] =
      service.listBuilds(params).promise().toFuture
    @inline def listCuratedEnvironmentImagesFuture(
        params: ListCuratedEnvironmentImagesInput
    ): Future[ListCuratedEnvironmentImagesOutput] = service.listCuratedEnvironmentImages(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsInput): Future[ListProjectsOutput] =
      service.listProjects(params).promise().toFuture
    @inline def listReportGroupsFuture(params: ListReportGroupsInput): Future[ListReportGroupsOutput] =
      service.listReportGroups(params).promise().toFuture
    @inline def listReportsForReportGroupFuture(
        params: ListReportsForReportGroupInput
    ): Future[ListReportsForReportGroupOutput] = service.listReportsForReportGroup(params).promise().toFuture
    @inline def listReportsFuture(params: ListReportsInput): Future[ListReportsOutput] =
      service.listReports(params).promise().toFuture
    @inline def listSharedProjectsFuture(params: ListSharedProjectsInput): Future[ListSharedProjectsOutput] =
      service.listSharedProjects(params).promise().toFuture
    @inline def listSharedReportGroupsFuture(
        params: ListSharedReportGroupsInput
    ): Future[ListSharedReportGroupsOutput] = service.listSharedReportGroups(params).promise().toFuture
    @inline def listSourceCredentialsFuture(params: ListSourceCredentialsInput): Future[ListSourceCredentialsOutput] =
      service.listSourceCredentials(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyInput): Future[PutResourcePolicyOutput] =
      service.putResourcePolicy(params).promise().toFuture
    @inline def startBuildFuture(params: StartBuildInput): Future[StartBuildOutput] =
      service.startBuild(params).promise().toFuture
    @inline def stopBuildFuture(params: StopBuildInput): Future[StopBuildOutput] =
      service.stopBuild(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectInput): Future[UpdateProjectOutput] =
      service.updateProject(params).promise().toFuture
    @inline def updateReportGroupFuture(params: UpdateReportGroupInput): Future[UpdateReportGroupOutput] =
      service.updateReportGroup(params).promise().toFuture
    @inline def updateWebhookFuture(params: UpdateWebhookInput): Future[UpdateWebhookOutput] =
      service.updateWebhook(params).promise().toFuture
  }
}

package codebuild {
  @js.native
  @JSImport("aws-sdk", "CodeBuild")
  class CodeBuild() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDeleteBuilds(params: BatchDeleteBuildsInput): Request[BatchDeleteBuildsOutput]          = js.native
    def batchGetBuilds(params: BatchGetBuildsInput): Request[BatchGetBuildsOutput]                   = js.native
    def batchGetProjects(params: BatchGetProjectsInput): Request[BatchGetProjectsOutput]             = js.native
    def batchGetReportGroups(params: BatchGetReportGroupsInput): Request[BatchGetReportGroupsOutput] = js.native
    def batchGetReports(params: BatchGetReportsInput): Request[BatchGetReportsOutput]                = js.native
    def createProject(params: CreateProjectInput): Request[CreateProjectOutput]                      = js.native
    def createReportGroup(params: CreateReportGroupInput): Request[CreateReportGroupOutput]          = js.native
    def createWebhook(params: CreateWebhookInput): Request[CreateWebhookOutput]                      = js.native
    def deleteProject(params: DeleteProjectInput): Request[DeleteProjectOutput]                      = js.native
    def deleteReport(params: DeleteReportInput): Request[DeleteReportOutput]                         = js.native
    def deleteReportGroup(params: DeleteReportGroupInput): Request[DeleteReportGroupOutput]          = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyInput): Request[DeleteResourcePolicyOutput] = js.native
    def deleteSourceCredentials(params: DeleteSourceCredentialsInput): Request[DeleteSourceCredentialsOutput] =
      js.native
    def deleteWebhook(params: DeleteWebhookInput): Request[DeleteWebhookOutput]             = js.native
    def describeTestCases(params: DescribeTestCasesInput): Request[DescribeTestCasesOutput] = js.native
    def getResourcePolicy(params: GetResourcePolicyInput): Request[GetResourcePolicyOutput] = js.native
    def importSourceCredentials(params: ImportSourceCredentialsInput): Request[ImportSourceCredentialsOutput] =
      js.native
    def invalidateProjectCache(params: InvalidateProjectCacheInput): Request[InvalidateProjectCacheOutput] = js.native
    def listBuilds(params: ListBuildsInput): Request[ListBuildsOutput]                                     = js.native
    def listBuildsForProject(params: ListBuildsForProjectInput): Request[ListBuildsForProjectOutput]       = js.native
    def listCuratedEnvironmentImages(
        params: ListCuratedEnvironmentImagesInput
    ): Request[ListCuratedEnvironmentImagesOutput]                                       = js.native
    def listProjects(params: ListProjectsInput): Request[ListProjectsOutput]             = js.native
    def listReportGroups(params: ListReportGroupsInput): Request[ListReportGroupsOutput] = js.native
    def listReports(params: ListReportsInput): Request[ListReportsOutput]                = js.native
    def listReportsForReportGroup(params: ListReportsForReportGroupInput): Request[ListReportsForReportGroupOutput] =
      js.native
    def listSharedProjects(params: ListSharedProjectsInput): Request[ListSharedProjectsOutput]             = js.native
    def listSharedReportGroups(params: ListSharedReportGroupsInput): Request[ListSharedReportGroupsOutput] = js.native
    def listSourceCredentials(params: ListSourceCredentialsInput): Request[ListSourceCredentialsOutput]    = js.native
    def putResourcePolicy(params: PutResourcePolicyInput): Request[PutResourcePolicyOutput]                = js.native
    def startBuild(params: StartBuildInput): Request[StartBuildOutput]                                     = js.native
    def stopBuild(params: StopBuildInput): Request[StopBuildOutput]                                        = js.native
    def updateProject(params: UpdateProjectInput): Request[UpdateProjectOutput]                            = js.native
    def updateReportGroup(params: UpdateReportGroupInput): Request[UpdateReportGroupOutput]                = js.native
    def updateWebhook(params: UpdateWebhookInput): Request[UpdateWebhookOutput]                            = js.native
  }

  @js.native
  sealed trait ArtifactNamespace extends js.Any
  object ArtifactNamespace extends js.Object {
    val NONE     = "NONE".asInstanceOf[ArtifactNamespace]
    val BUILD_ID = "BUILD_ID".asInstanceOf[ArtifactNamespace]

    val values = js.Object.freeze(js.Array(NONE, BUILD_ID))
  }

  @js.native
  sealed trait ArtifactPackaging extends js.Any
  object ArtifactPackaging extends js.Object {
    val NONE = "NONE".asInstanceOf[ArtifactPackaging]
    val ZIP  = "ZIP".asInstanceOf[ArtifactPackaging]

    val values = js.Object.freeze(js.Array(NONE, ZIP))
  }

  @js.native
  sealed trait ArtifactsType extends js.Any
  object ArtifactsType extends js.Object {
    val CODEPIPELINE = "CODEPIPELINE".asInstanceOf[ArtifactsType]
    val S3           = "S3".asInstanceOf[ArtifactsType]
    val NO_ARTIFACTS = "NO_ARTIFACTS".asInstanceOf[ArtifactsType]

    val values = js.Object.freeze(js.Array(CODEPIPELINE, S3, NO_ARTIFACTS))
  }

  @js.native
  sealed trait AuthType extends js.Any
  object AuthType extends js.Object {
    val OAUTH                 = "OAUTH".asInstanceOf[AuthType]
    val BASIC_AUTH            = "BASIC_AUTH".asInstanceOf[AuthType]
    val PERSONAL_ACCESS_TOKEN = "PERSONAL_ACCESS_TOKEN".asInstanceOf[AuthType]

    val values = js.Object.freeze(js.Array(OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN))
  }

  @js.native
  @Factory
  trait BatchDeleteBuildsInput extends js.Object {
    var ids: BuildIds
  }

  @js.native
  @Factory
  trait BatchDeleteBuildsOutput extends js.Object {
    var buildsDeleted: js.UndefOr[BuildIds]
    var buildsNotDeleted: js.UndefOr[BuildsNotDeleted]
  }

  @js.native
  @Factory
  trait BatchGetBuildsInput extends js.Object {
    var ids: BuildIds
  }

  @js.native
  @Factory
  trait BatchGetBuildsOutput extends js.Object {
    var builds: js.UndefOr[Builds]
    var buildsNotFound: js.UndefOr[BuildIds]
  }

  @js.native
  @Factory
  trait BatchGetProjectsInput extends js.Object {
    var names: ProjectNames
  }

  @js.native
  @Factory
  trait BatchGetProjectsOutput extends js.Object {
    var projects: js.UndefOr[Projects]
    var projectsNotFound: js.UndefOr[ProjectNames]
  }

  @js.native
  @Factory
  trait BatchGetReportGroupsInput extends js.Object {
    var reportGroupArns: ReportGroupArns
  }

  @js.native
  @Factory
  trait BatchGetReportGroupsOutput extends js.Object {
    var reportGroups: js.UndefOr[ReportGroups]
    var reportGroupsNotFound: js.UndefOr[ReportGroupArns]
  }

  @js.native
  @Factory
  trait BatchGetReportsInput extends js.Object {
    var reportArns: ReportArns
  }

  @js.native
  @Factory
  trait BatchGetReportsOutput extends js.Object {
    var reports: js.UndefOr[Reports]
    var reportsNotFound: js.UndefOr[ReportArns]
  }

  /**
    * Information about a build.
    */
  @js.native
  @Factory
  trait Build extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var artifacts: js.UndefOr[BuildArtifacts]
    var buildComplete: js.UndefOr[Boolean]
    var buildNumber: js.UndefOr[WrapperLong]
    var buildStatus: js.UndefOr[StatusType]
    var cache: js.UndefOr[ProjectCache]
    var currentPhase: js.UndefOr[String]
    var encryptionKey: js.UndefOr[NonEmptyString]
    var endTime: js.UndefOr[Timestamp]
    var environment: js.UndefOr[ProjectEnvironment]
    var exportedEnvironmentVariables: js.UndefOr[ExportedEnvironmentVariables]
    var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations]
    var id: js.UndefOr[NonEmptyString]
    var initiator: js.UndefOr[String]
    var logs: js.UndefOr[LogsLocation]
    var networkInterface: js.UndefOr[NetworkInterface]
    var phases: js.UndefOr[BuildPhases]
    var projectName: js.UndefOr[NonEmptyString]
    var queuedTimeoutInMinutes: js.UndefOr[WrapperInt]
    var reportArns: js.UndefOr[BuildReportArns]
    var resolvedSourceVersion: js.UndefOr[NonEmptyString]
    var secondaryArtifacts: js.UndefOr[BuildArtifactsList]
    var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions]
    var secondarySources: js.UndefOr[ProjectSources]
    var serviceRole: js.UndefOr[NonEmptyString]
    var source: js.UndefOr[ProjectSource]
    var sourceVersion: js.UndefOr[NonEmptyString]
    var startTime: js.UndefOr[Timestamp]
    var timeoutInMinutes: js.UndefOr[WrapperInt]
    var vpcConfig: js.UndefOr[VpcConfig]
  }

  /**
    * Information about build output artifacts.
    */
  @js.native
  @Factory
  trait BuildArtifacts extends js.Object {
    var artifactIdentifier: js.UndefOr[String]
    var encryptionDisabled: js.UndefOr[WrapperBoolean]
    var location: js.UndefOr[String]
    var md5sum: js.UndefOr[String]
    var overrideArtifactName: js.UndefOr[WrapperBoolean]
    var sha256sum: js.UndefOr[String]
  }

  /**
    * Information about a build that could not be successfully deleted.
    */
  @js.native
  @Factory
  trait BuildNotDeleted extends js.Object {
    var id: js.UndefOr[NonEmptyString]
    var statusCode: js.UndefOr[String]
  }

  /**
    * Information about a stage for a build.
    */
  @js.native
  @Factory
  trait BuildPhase extends js.Object {
    var contexts: js.UndefOr[PhaseContexts]
    var durationInSeconds: js.UndefOr[WrapperLong]
    var endTime: js.UndefOr[Timestamp]
    var phaseStatus: js.UndefOr[StatusType]
    var phaseType: js.UndefOr[BuildPhaseType]
    var startTime: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait BuildPhaseType extends js.Any
  object BuildPhaseType extends js.Object {
    val SUBMITTED        = "SUBMITTED".asInstanceOf[BuildPhaseType]
    val QUEUED           = "QUEUED".asInstanceOf[BuildPhaseType]
    val PROVISIONING     = "PROVISIONING".asInstanceOf[BuildPhaseType]
    val DOWNLOAD_SOURCE  = "DOWNLOAD_SOURCE".asInstanceOf[BuildPhaseType]
    val INSTALL          = "INSTALL".asInstanceOf[BuildPhaseType]
    val PRE_BUILD        = "PRE_BUILD".asInstanceOf[BuildPhaseType]
    val BUILD            = "BUILD".asInstanceOf[BuildPhaseType]
    val POST_BUILD       = "POST_BUILD".asInstanceOf[BuildPhaseType]
    val UPLOAD_ARTIFACTS = "UPLOAD_ARTIFACTS".asInstanceOf[BuildPhaseType]
    val FINALIZING       = "FINALIZING".asInstanceOf[BuildPhaseType]
    val COMPLETED        = "COMPLETED".asInstanceOf[BuildPhaseType]

    val values = js.Object.freeze(
      js.Array(
        SUBMITTED,
        QUEUED,
        PROVISIONING,
        DOWNLOAD_SOURCE,
        INSTALL,
        PRE_BUILD,
        BUILD,
        POST_BUILD,
        UPLOAD_ARTIFACTS,
        FINALIZING,
        COMPLETED
      )
    )
  }

  @js.native
  sealed trait CacheMode extends js.Any
  object CacheMode extends js.Object {
    val LOCAL_DOCKER_LAYER_CACHE = "LOCAL_DOCKER_LAYER_CACHE".asInstanceOf[CacheMode]
    val LOCAL_SOURCE_CACHE       = "LOCAL_SOURCE_CACHE".asInstanceOf[CacheMode]
    val LOCAL_CUSTOM_CACHE       = "LOCAL_CUSTOM_CACHE".asInstanceOf[CacheMode]

    val values = js.Object.freeze(js.Array(LOCAL_DOCKER_LAYER_CACHE, LOCAL_SOURCE_CACHE, LOCAL_CUSTOM_CACHE))
  }

  @js.native
  sealed trait CacheType extends js.Any
  object CacheType extends js.Object {
    val NO_CACHE = "NO_CACHE".asInstanceOf[CacheType]
    val S3       = "S3".asInstanceOf[CacheType]
    val LOCAL    = "LOCAL".asInstanceOf[CacheType]

    val values = js.Object.freeze(js.Array(NO_CACHE, S3, LOCAL))
  }

  /**
    * Information about Amazon CloudWatch Logs for a build project.
    */
  @js.native
  @Factory
  trait CloudWatchLogsConfig extends js.Object {
    var status: LogsConfigStatusType
    var groupName: js.UndefOr[String]
    var streamName: js.UndefOr[String]
  }

  @js.native
  sealed trait ComputeType extends js.Any
  object ComputeType extends js.Object {
    val BUILD_GENERAL1_SMALL   = "BUILD_GENERAL1_SMALL".asInstanceOf[ComputeType]
    val BUILD_GENERAL1_MEDIUM  = "BUILD_GENERAL1_MEDIUM".asInstanceOf[ComputeType]
    val BUILD_GENERAL1_LARGE   = "BUILD_GENERAL1_LARGE".asInstanceOf[ComputeType]
    val BUILD_GENERAL1_2XLARGE = "BUILD_GENERAL1_2XLARGE".asInstanceOf[ComputeType]

    val values = js.Object.freeze(
      js.Array(BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM, BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE)
    )
  }

  @js.native
  @Factory
  trait CreateProjectInput extends js.Object {
    var artifacts: ProjectArtifacts
    var environment: ProjectEnvironment
    var name: ProjectName
    var serviceRole: NonEmptyString
    var source: ProjectSource
    var badgeEnabled: js.UndefOr[WrapperBoolean]
    var cache: js.UndefOr[ProjectCache]
    var description: js.UndefOr[ProjectDescription]
    var encryptionKey: js.UndefOr[NonEmptyString]
    var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations]
    var logsConfig: js.UndefOr[LogsConfig]
    var queuedTimeoutInMinutes: js.UndefOr[TimeOut]
    var secondaryArtifacts: js.UndefOr[ProjectArtifactsList]
    var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions]
    var secondarySources: js.UndefOr[ProjectSources]
    var sourceVersion: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
    var timeoutInMinutes: js.UndefOr[TimeOut]
    var vpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait CreateProjectOutput extends js.Object {
    var project: js.UndefOr[Project]
  }

  @js.native
  @Factory
  trait CreateReportGroupInput extends js.Object {
    var exportConfig: ReportExportConfig
    var name: ReportGroupName
    var `type`: ReportType
  }

  @js.native
  @Factory
  trait CreateReportGroupOutput extends js.Object {
    var reportGroup: js.UndefOr[ReportGroup]
  }

  @js.native
  @Factory
  trait CreateWebhookInput extends js.Object {
    var projectName: ProjectName
    var branchFilter: js.UndefOr[String]
    var filterGroups: js.UndefOr[FilterGroups]
  }

  @js.native
  @Factory
  trait CreateWebhookOutput extends js.Object {
    var webhook: js.UndefOr[Webhook]
  }

  @js.native
  sealed trait CredentialProviderType extends js.Any
  object CredentialProviderType extends js.Object {
    val SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[CredentialProviderType]

    val values = js.Object.freeze(js.Array(SECRETS_MANAGER))
  }

  @js.native
  @Factory
  trait DeleteProjectInput extends js.Object {
    var name: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteProjectOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteReportGroupInput extends js.Object {
    var arn: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteReportGroupOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteReportInput extends js.Object {
    var arn: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteReportOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteResourcePolicyInput extends js.Object {
    var resourceArn: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteResourcePolicyOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteSourceCredentialsInput extends js.Object {
    var arn: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteSourceCredentialsOutput extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DeleteWebhookInput extends js.Object {
    var projectName: ProjectName
  }

  @js.native
  @Factory
  trait DeleteWebhookOutput extends js.Object {}

  @js.native
  @Factory
  trait DescribeTestCasesInput extends js.Object {
    var reportArn: String
    var filter: js.UndefOr[TestCaseFilter]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeTestCasesOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var testCases: js.UndefOr[TestCases]
  }

  /**
    * Information about a Docker image that is managed by AWS CodeBuild.
    */
  @js.native
  @Factory
  trait EnvironmentImage extends js.Object {
    var description: js.UndefOr[String]
    var name: js.UndefOr[String]
    var versions: js.UndefOr[ImageVersions]
  }

  /**
    * A set of Docker images that are related by programming language and are managed by AWS CodeBuild.
    */
  @js.native
  @Factory
  trait EnvironmentLanguage extends js.Object {
    var images: js.UndefOr[EnvironmentImages]
    var language: js.UndefOr[LanguageType]
  }

  /**
    * A set of Docker images that are related by platform and are managed by AWS CodeBuild.
    */
  @js.native
  @Factory
  trait EnvironmentPlatform extends js.Object {
    var languages: js.UndefOr[EnvironmentLanguages]
    var platform: js.UndefOr[PlatformType]
  }

  @js.native
  sealed trait EnvironmentType extends js.Any
  object EnvironmentType extends js.Object {
    val WINDOWS_CONTAINER   = "WINDOWS_CONTAINER".asInstanceOf[EnvironmentType]
    val LINUX_CONTAINER     = "LINUX_CONTAINER".asInstanceOf[EnvironmentType]
    val LINUX_GPU_CONTAINER = "LINUX_GPU_CONTAINER".asInstanceOf[EnvironmentType]
    val ARM_CONTAINER       = "ARM_CONTAINER".asInstanceOf[EnvironmentType]

    val values = js.Object.freeze(js.Array(WINDOWS_CONTAINER, LINUX_CONTAINER, LINUX_GPU_CONTAINER, ARM_CONTAINER))
  }

  /**
    * Information about an environment variable for a build project or a build.
    */
  @js.native
  @Factory
  trait EnvironmentVariable extends js.Object {
    var name: NonEmptyString
    var value: String
    var `type`: js.UndefOr[EnvironmentVariableType]
  }

  @js.native
  sealed trait EnvironmentVariableType extends js.Any
  object EnvironmentVariableType extends js.Object {
    val PLAINTEXT       = "PLAINTEXT".asInstanceOf[EnvironmentVariableType]
    val PARAMETER_STORE = "PARAMETER_STORE".asInstanceOf[EnvironmentVariableType]
    val SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[EnvironmentVariableType]

    val values = js.Object.freeze(js.Array(PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER))
  }

  /**
    * Information about an exported environment variable.
    */
  @js.native
  @Factory
  trait ExportedEnvironmentVariable extends js.Object {
    var name: js.UndefOr[NonEmptyString]
    var value: js.UndefOr[String]
  }

  @js.native
  sealed trait FileSystemType extends js.Any
  object FileSystemType extends js.Object {
    val EFS = "EFS".asInstanceOf[FileSystemType]

    val values = js.Object.freeze(js.Array(EFS))
  }

  @js.native
  @Factory
  trait GetResourcePolicyInput extends js.Object {
    var resourceArn: NonEmptyString
  }

  @js.native
  @Factory
  trait GetResourcePolicyOutput extends js.Object {
    var policy: js.UndefOr[NonEmptyString]
  }

  /**
    * Information about the Git submodules configuration for an AWS CodeBuild build project.
    */
  @js.native
  @Factory
  trait GitSubmodulesConfig extends js.Object {
    var fetchSubmodules: WrapperBoolean
  }

  @js.native
  sealed trait ImagePullCredentialsType extends js.Any
  object ImagePullCredentialsType extends js.Object {
    val CODEBUILD    = "CODEBUILD".asInstanceOf[ImagePullCredentialsType]
    val SERVICE_ROLE = "SERVICE_ROLE".asInstanceOf[ImagePullCredentialsType]

    val values = js.Object.freeze(js.Array(CODEBUILD, SERVICE_ROLE))
  }

  @js.native
  @Factory
  trait ImportSourceCredentialsInput extends js.Object {
    var authType: AuthType
    var serverType: ServerType
    var token: SensitiveNonEmptyString
    var shouldOverwrite: js.UndefOr[WrapperBoolean]
    var username: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ImportSourceCredentialsOutput extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait InvalidateProjectCacheInput extends js.Object {
    var projectName: NonEmptyString
  }

  @js.native
  @Factory
  trait InvalidateProjectCacheOutput extends js.Object {}

  @js.native
  sealed trait LanguageType extends js.Any
  object LanguageType extends js.Object {
    val JAVA    = "JAVA".asInstanceOf[LanguageType]
    val PYTHON  = "PYTHON".asInstanceOf[LanguageType]
    val NODE_JS = "NODE_JS".asInstanceOf[LanguageType]
    val RUBY    = "RUBY".asInstanceOf[LanguageType]
    val GOLANG  = "GOLANG".asInstanceOf[LanguageType]
    val DOCKER  = "DOCKER".asInstanceOf[LanguageType]
    val ANDROID = "ANDROID".asInstanceOf[LanguageType]
    val DOTNET  = "DOTNET".asInstanceOf[LanguageType]
    val BASE    = "BASE".asInstanceOf[LanguageType]
    val PHP     = "PHP".asInstanceOf[LanguageType]

    val values = js.Object.freeze(js.Array(JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER, ANDROID, DOTNET, BASE, PHP))
  }

  @js.native
  @Factory
  trait ListBuildsForProjectInput extends js.Object {
    var projectName: NonEmptyString
    var nextToken: js.UndefOr[String]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  @js.native
  @Factory
  trait ListBuildsForProjectOutput extends js.Object {
    var ids: js.UndefOr[BuildIds]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBuildsInput extends js.Object {
    var nextToken: js.UndefOr[String]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  @js.native
  @Factory
  trait ListBuildsOutput extends js.Object {
    var ids: js.UndefOr[BuildIds]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListCuratedEnvironmentImagesInput extends js.Object {}

  @js.native
  @Factory
  trait ListCuratedEnvironmentImagesOutput extends js.Object {
    var platforms: js.UndefOr[EnvironmentPlatforms]
  }

  @js.native
  @Factory
  trait ListProjectsInput extends js.Object {
    var nextToken: js.UndefOr[NonEmptyString]
    var sortBy: js.UndefOr[ProjectSortByType]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  @js.native
  @Factory
  trait ListProjectsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var projects: js.UndefOr[ProjectNames]
  }

  @js.native
  @Factory
  trait ListReportGroupsInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var sortBy: js.UndefOr[ReportGroupSortByType]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  @js.native
  @Factory
  trait ListReportGroupsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var reportGroups: js.UndefOr[ReportGroupArns]
  }

  @js.native
  @Factory
  trait ListReportsForReportGroupInput extends js.Object {
    var reportGroupArn: String
    var filter: js.UndefOr[ReportFilter]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  @js.native
  @Factory
  trait ListReportsForReportGroupOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var reports: js.UndefOr[ReportArns]
  }

  @js.native
  @Factory
  trait ListReportsInput extends js.Object {
    var filter: js.UndefOr[ReportFilter]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  @js.native
  @Factory
  trait ListReportsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var reports: js.UndefOr[ReportArns]
  }

  @js.native
  @Factory
  trait ListSharedProjectsInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[NonEmptyString]
    var sortBy: js.UndefOr[SharedResourceSortByType]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  @js.native
  @Factory
  trait ListSharedProjectsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var projects: js.UndefOr[ProjectArns]
  }

  @js.native
  @Factory
  trait ListSharedReportGroupsInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var sortBy: js.UndefOr[SharedResourceSortByType]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  @js.native
  @Factory
  trait ListSharedReportGroupsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var reportGroups: js.UndefOr[ReportGroupArns]
  }

  @js.native
  @Factory
  trait ListSourceCredentialsInput extends js.Object {}

  @js.native
  @Factory
  trait ListSourceCredentialsOutput extends js.Object {
    var sourceCredentialsInfos: js.UndefOr[SourceCredentialsInfos]
  }

  /**
    * Information about logs for a build project. These can be logs in Amazon CloudWatch Logs, built in a specified S3 bucket, or both.
    */
  @js.native
  @Factory
  trait LogsConfig extends js.Object {
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig]
    var s3Logs: js.UndefOr[S3LogsConfig]
  }

  @js.native
  sealed trait LogsConfigStatusType extends js.Any
  object LogsConfigStatusType extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[LogsConfigStatusType]
    val DISABLED = "DISABLED".asInstanceOf[LogsConfigStatusType]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Information about build logs in Amazon CloudWatch Logs.
    */
  @js.native
  @Factory
  trait LogsLocation extends js.Object {
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig]
    var cloudWatchLogsArn: js.UndefOr[String]
    var deepLink: js.UndefOr[String]
    var groupName: js.UndefOr[String]
    var s3DeepLink: js.UndefOr[String]
    var s3Logs: js.UndefOr[S3LogsConfig]
    var s3LogsArn: js.UndefOr[String]
    var streamName: js.UndefOr[String]
  }

  /**
    * Describes a network interface.
    */
  @js.native
  @Factory
  trait NetworkInterface extends js.Object {
    var networkInterfaceId: js.UndefOr[NonEmptyString]
    var subnetId: js.UndefOr[NonEmptyString]
  }

  /**
    * Additional information about a build phase that has an error. You can use this information for troubleshooting.
    */
  @js.native
  @Factory
  trait PhaseContext extends js.Object {
    var message: js.UndefOr[String]
    var statusCode: js.UndefOr[String]
  }

  @js.native
  sealed trait PlatformType extends js.Any
  object PlatformType extends js.Object {
    val DEBIAN         = "DEBIAN".asInstanceOf[PlatformType]
    val AMAZON_LINUX   = "AMAZON_LINUX".asInstanceOf[PlatformType]
    val UBUNTU         = "UBUNTU".asInstanceOf[PlatformType]
    val WINDOWS_SERVER = "WINDOWS_SERVER".asInstanceOf[PlatformType]

    val values = js.Object.freeze(js.Array(DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER))
  }

  /**
    * Information about a build project.
    */
  @js.native
  @Factory
  trait Project extends js.Object {
    var arn: js.UndefOr[String]
    var artifacts: js.UndefOr[ProjectArtifacts]
    var badge: js.UndefOr[ProjectBadge]
    var cache: js.UndefOr[ProjectCache]
    var created: js.UndefOr[Timestamp]
    var description: js.UndefOr[ProjectDescription]
    var encryptionKey: js.UndefOr[NonEmptyString]
    var environment: js.UndefOr[ProjectEnvironment]
    var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations]
    var lastModified: js.UndefOr[Timestamp]
    var logsConfig: js.UndefOr[LogsConfig]
    var name: js.UndefOr[ProjectName]
    var queuedTimeoutInMinutes: js.UndefOr[TimeOut]
    var secondaryArtifacts: js.UndefOr[ProjectArtifactsList]
    var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions]
    var secondarySources: js.UndefOr[ProjectSources]
    var serviceRole: js.UndefOr[NonEmptyString]
    var source: js.UndefOr[ProjectSource]
    var sourceVersion: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
    var timeoutInMinutes: js.UndefOr[TimeOut]
    var vpcConfig: js.UndefOr[VpcConfig]
    var webhook: js.UndefOr[Webhook]
  }

  /**
    * Information about the build output artifacts for the build project.
    */
  @js.native
  @Factory
  trait ProjectArtifacts extends js.Object {
    var `type`: ArtifactsType
    var artifactIdentifier: js.UndefOr[String]
    var encryptionDisabled: js.UndefOr[WrapperBoolean]
    var location: js.UndefOr[String]
    var name: js.UndefOr[String]
    var namespaceType: js.UndefOr[ArtifactNamespace]
    var overrideArtifactName: js.UndefOr[WrapperBoolean]
    var packaging: js.UndefOr[ArtifactPackaging]
    var path: js.UndefOr[String]
  }

  /**
    * Information about the build badge for the build project.
    */
  @js.native
  @Factory
  trait ProjectBadge extends js.Object {
    var badgeEnabled: js.UndefOr[Boolean]
    var badgeRequestUrl: js.UndefOr[String]
  }

  /**
    * Information about the cache for the build project.
    */
  @js.native
  @Factory
  trait ProjectCache extends js.Object {
    var `type`: CacheType
    var location: js.UndefOr[String]
    var modes: js.UndefOr[ProjectCacheModes]
  }

  /**
    * Information about the build environment of the build project.
    */
  @js.native
  @Factory
  trait ProjectEnvironment extends js.Object {
    var computeType: ComputeType
    var image: NonEmptyString
    var `type`: EnvironmentType
    var certificate: js.UndefOr[String]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var imagePullCredentialsType: js.UndefOr[ImagePullCredentialsType]
    var privilegedMode: js.UndefOr[WrapperBoolean]
    var registryCredential: js.UndefOr[RegistryCredential]
  }

  /**
    * Information about a file system created by Amazon Elastic File System (EFS). For more information, see [[https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html|What Is Amazon Elastic File System?]]
    */
  @js.native
  @Factory
  trait ProjectFileSystemLocation extends js.Object {
    var identifier: js.UndefOr[String]
    var location: js.UndefOr[String]
    var mountOptions: js.UndefOr[String]
    var mountPoint: js.UndefOr[String]
    var `type`: js.UndefOr[FileSystemType]
  }

  @js.native
  sealed trait ProjectSortByType extends js.Any
  object ProjectSortByType extends js.Object {
    val NAME               = "NAME".asInstanceOf[ProjectSortByType]
    val CREATED_TIME       = "CREATED_TIME".asInstanceOf[ProjectSortByType]
    val LAST_MODIFIED_TIME = "LAST_MODIFIED_TIME".asInstanceOf[ProjectSortByType]

    val values = js.Object.freeze(js.Array(NAME, CREATED_TIME, LAST_MODIFIED_TIME))
  }

  /**
    * Information about the build input source code for the build project.
    */
  @js.native
  @Factory
  trait ProjectSource extends js.Object {
    var `type`: SourceType
    var auth: js.UndefOr[SourceAuth]
    var buildspec: js.UndefOr[String]
    var gitCloneDepth: js.UndefOr[GitCloneDepth]
    var gitSubmodulesConfig: js.UndefOr[GitSubmodulesConfig]
    var insecureSsl: js.UndefOr[WrapperBoolean]
    var location: js.UndefOr[String]
    var reportBuildStatus: js.UndefOr[WrapperBoolean]
    var sourceIdentifier: js.UndefOr[String]
  }

  /**
    * A source identifier and its corresponding version.
    */
  @js.native
  @Factory
  trait ProjectSourceVersion extends js.Object {
    var sourceIdentifier: String
    var sourceVersion: String
  }

  @js.native
  @Factory
  trait PutResourcePolicyInput extends js.Object {
    var policy: NonEmptyString
    var resourceArn: NonEmptyString
  }

  @js.native
  @Factory
  trait PutResourcePolicyOutput extends js.Object {
    var resourceArn: js.UndefOr[NonEmptyString]
  }

  /**
    * Information about credentials that provide access to a private Docker registry. When this is set:
    * * <code>imagePullCredentialsType</code> must be set to <code>SERVICE_ROLE</code>.
    *  * images cannot be curated or an Amazon ECR image.
    * For more information, see [[https://docs.aws.amazon.com/codebuild/latest/userguide/sample-private-registry.html|Private Registry with AWS Secrets Manager Sample for AWS CodeBuild]].
    */
  @js.native
  @Factory
  trait RegistryCredential extends js.Object {
    var credential: NonEmptyString
    var credentialProvider: CredentialProviderType
  }

  /**
    * Information about the results from running a series of test cases during the run of a build project. The test cases are specified in the buildspec for the build project using one or more paths to the test case files. You can specify any type of tests you want, such as unit tests, integration tests, and functional tests.
    */
  @js.native
  @Factory
  trait Report extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var created: js.UndefOr[Timestamp]
    var executionId: js.UndefOr[String]
    var expired: js.UndefOr[Timestamp]
    var exportConfig: js.UndefOr[ReportExportConfig]
    var name: js.UndefOr[String]
    var reportGroupArn: js.UndefOr[NonEmptyString]
    var status: js.UndefOr[ReportStatusType]
    var testSummary: js.UndefOr[TestReportSummary]
    var truncated: js.UndefOr[WrapperBoolean]
    var `type`: js.UndefOr[ReportType]
  }

  /**
    * Information about the location where the run of a report is exported.
    */
  @js.native
  @Factory
  trait ReportExportConfig extends js.Object {
    var exportConfigType: js.UndefOr[ReportExportConfigType]
    var s3Destination: js.UndefOr[S3ReportExportConfig]
  }

  @js.native
  sealed trait ReportExportConfigType extends js.Any
  object ReportExportConfigType extends js.Object {
    val S3        = "S3".asInstanceOf[ReportExportConfigType]
    val NO_EXPORT = "NO_EXPORT".asInstanceOf[ReportExportConfigType]

    val values = js.Object.freeze(js.Array(S3, NO_EXPORT))
  }

  /**
    * A filter used to return reports with the status specified by the input <code>status</code> parameter.
    */
  @js.native
  @Factory
  trait ReportFilter extends js.Object {
    var status: js.UndefOr[ReportStatusType]
  }

  /**
    * A series of reports. Each report contains information about the results from running a series of test cases. You specify the test cases for a report group in the buildspec for a build project using one or more paths to the test case files.
    */
  @js.native
  @Factory
  trait ReportGroup extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var created: js.UndefOr[Timestamp]
    var exportConfig: js.UndefOr[ReportExportConfig]
    var lastModified: js.UndefOr[Timestamp]
    var name: js.UndefOr[ReportGroupName]
    var `type`: js.UndefOr[ReportType]
  }

  @js.native
  sealed trait ReportGroupSortByType extends js.Any
  object ReportGroupSortByType extends js.Object {
    val NAME               = "NAME".asInstanceOf[ReportGroupSortByType]
    val CREATED_TIME       = "CREATED_TIME".asInstanceOf[ReportGroupSortByType]
    val LAST_MODIFIED_TIME = "LAST_MODIFIED_TIME".asInstanceOf[ReportGroupSortByType]

    val values = js.Object.freeze(js.Array(NAME, CREATED_TIME, LAST_MODIFIED_TIME))
  }

  @js.native
  sealed trait ReportPackagingType extends js.Any
  object ReportPackagingType extends js.Object {
    val ZIP  = "ZIP".asInstanceOf[ReportPackagingType]
    val NONE = "NONE".asInstanceOf[ReportPackagingType]

    val values = js.Object.freeze(js.Array(ZIP, NONE))
  }

  @js.native
  sealed trait ReportStatusType extends js.Any
  object ReportStatusType extends js.Object {
    val GENERATING = "GENERATING".asInstanceOf[ReportStatusType]
    val SUCCEEDED  = "SUCCEEDED".asInstanceOf[ReportStatusType]
    val FAILED     = "FAILED".asInstanceOf[ReportStatusType]
    val INCOMPLETE = "INCOMPLETE".asInstanceOf[ReportStatusType]
    val DELETING   = "DELETING".asInstanceOf[ReportStatusType]

    val values = js.Object.freeze(js.Array(GENERATING, SUCCEEDED, FAILED, INCOMPLETE, DELETING))
  }

  @js.native
  sealed trait ReportType extends js.Any
  object ReportType extends js.Object {
    val TEST = "TEST".asInstanceOf[ReportType]

    val values = js.Object.freeze(js.Array(TEST))
  }

  /**
    * Information about S3 logs for a build project.
    */
  @js.native
  @Factory
  trait S3LogsConfig extends js.Object {
    var status: LogsConfigStatusType
    var encryptionDisabled: js.UndefOr[WrapperBoolean]
    var location: js.UndefOr[String]
  }

  /**
    * Information about the S3 bucket where the raw data of a report are exported.
    */
  @js.native
  @Factory
  trait S3ReportExportConfig extends js.Object {
    var bucket: js.UndefOr[NonEmptyString]
    var encryptionDisabled: js.UndefOr[WrapperBoolean]
    var encryptionKey: js.UndefOr[NonEmptyString]
    var packaging: js.UndefOr[ReportPackagingType]
    var path: js.UndefOr[String]
  }

  @js.native
  sealed trait ServerType extends js.Any
  object ServerType extends js.Object {
    val GITHUB            = "GITHUB".asInstanceOf[ServerType]
    val BITBUCKET         = "BITBUCKET".asInstanceOf[ServerType]
    val GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[ServerType]

    val values = js.Object.freeze(js.Array(GITHUB, BITBUCKET, GITHUB_ENTERPRISE))
  }

  @js.native
  sealed trait SharedResourceSortByType extends js.Any
  object SharedResourceSortByType extends js.Object {
    val ARN           = "ARN".asInstanceOf[SharedResourceSortByType]
    val MODIFIED_TIME = "MODIFIED_TIME".asInstanceOf[SharedResourceSortByType]

    val values = js.Object.freeze(js.Array(ARN, MODIFIED_TIME))
  }

  @js.native
  sealed trait SortOrderType extends js.Any
  object SortOrderType extends js.Object {
    val ASCENDING  = "ASCENDING".asInstanceOf[SortOrderType]
    val DESCENDING = "DESCENDING".asInstanceOf[SortOrderType]

    val values = js.Object.freeze(js.Array(ASCENDING, DESCENDING))
  }

  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
    *  This information is for the AWS CodeBuild console's use only. Your code should not get or set this information directly.
    */
  @js.native
  @Factory
  trait SourceAuth extends js.Object {
    var `type`: SourceAuthType
    var resource: js.UndefOr[String]
  }

  @js.native
  sealed trait SourceAuthType extends js.Any
  object SourceAuthType extends js.Object {
    val OAUTH = "OAUTH".asInstanceOf[SourceAuthType]

    val values = js.Object.freeze(js.Array(OAUTH))
  }

  /**
    * Information about the credentials for a GitHub, GitHub Enterprise, or Bitbucket repository.
    */
  @js.native
  @Factory
  trait SourceCredentialsInfo extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var authType: js.UndefOr[AuthType]
    var serverType: js.UndefOr[ServerType]
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val CODECOMMIT        = "CODECOMMIT".asInstanceOf[SourceType]
    val CODEPIPELINE      = "CODEPIPELINE".asInstanceOf[SourceType]
    val GITHUB            = "GITHUB".asInstanceOf[SourceType]
    val S3                = "S3".asInstanceOf[SourceType]
    val BITBUCKET         = "BITBUCKET".asInstanceOf[SourceType]
    val GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[SourceType]
    val NO_SOURCE         = "NO_SOURCE".asInstanceOf[SourceType]

    val values =
      js.Object.freeze(js.Array(CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET, GITHUB_ENTERPRISE, NO_SOURCE))
  }

  @js.native
  @Factory
  trait StartBuildInput extends js.Object {
    var projectName: NonEmptyString
    var artifactsOverride: js.UndefOr[ProjectArtifacts]
    var buildspecOverride: js.UndefOr[String]
    var cacheOverride: js.UndefOr[ProjectCache]
    var certificateOverride: js.UndefOr[String]
    var computeTypeOverride: js.UndefOr[ComputeType]
    var encryptionKeyOverride: js.UndefOr[NonEmptyString]
    var environmentTypeOverride: js.UndefOr[EnvironmentType]
    var environmentVariablesOverride: js.UndefOr[EnvironmentVariables]
    var gitCloneDepthOverride: js.UndefOr[GitCloneDepth]
    var gitSubmodulesConfigOverride: js.UndefOr[GitSubmodulesConfig]
    var idempotencyToken: js.UndefOr[String]
    var imageOverride: js.UndefOr[NonEmptyString]
    var imagePullCredentialsTypeOverride: js.UndefOr[ImagePullCredentialsType]
    var insecureSslOverride: js.UndefOr[WrapperBoolean]
    var logsConfigOverride: js.UndefOr[LogsConfig]
    var privilegedModeOverride: js.UndefOr[WrapperBoolean]
    var queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut]
    var registryCredentialOverride: js.UndefOr[RegistryCredential]
    var reportBuildStatusOverride: js.UndefOr[WrapperBoolean]
    var secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList]
    var secondarySourcesOverride: js.UndefOr[ProjectSources]
    var secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions]
    var serviceRoleOverride: js.UndefOr[NonEmptyString]
    var sourceAuthOverride: js.UndefOr[SourceAuth]
    var sourceLocationOverride: js.UndefOr[String]
    var sourceTypeOverride: js.UndefOr[SourceType]
    var sourceVersion: js.UndefOr[String]
    var timeoutInMinutesOverride: js.UndefOr[TimeOut]
  }

  @js.native
  @Factory
  trait StartBuildOutput extends js.Object {
    var build: js.UndefOr[Build]
  }

  @js.native
  sealed trait StatusType extends js.Any
  object StatusType extends js.Object {
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[StatusType]
    val FAILED      = "FAILED".asInstanceOf[StatusType]
    val FAULT       = "FAULT".asInstanceOf[StatusType]
    val TIMED_OUT   = "TIMED_OUT".asInstanceOf[StatusType]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[StatusType]
    val STOPPED     = "STOPPED".asInstanceOf[StatusType]

    val values = js.Object.freeze(js.Array(SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS, STOPPED))
  }

  @js.native
  @Factory
  trait StopBuildInput extends js.Object {
    var id: NonEmptyString
  }

  @js.native
  @Factory
  trait StopBuildOutput extends js.Object {
    var build: js.UndefOr[Build]
  }

  /**
    * A tag, consisting of a key and a value.
    *  This tag is available for use by AWS services that support tags in AWS CodeBuild.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: js.UndefOr[KeyInput]
    var value: js.UndefOr[ValueInput]
  }

  /**
    * Information about a test case created using a framework such as NUnit or Cucumber. A test case might be a unit test or a configuration test.
    */
  @js.native
  @Factory
  trait TestCase extends js.Object {
    var durationInNanoSeconds: js.UndefOr[WrapperLong]
    var expired: js.UndefOr[Timestamp]
    var message: js.UndefOr[String]
    var name: js.UndefOr[String]
    var prefix: js.UndefOr[String]
    var reportArn: js.UndefOr[NonEmptyString]
    var status: js.UndefOr[String]
    var testRawDataPath: js.UndefOr[String]
  }

  /**
    * A filter used to return specific types of test cases.
    */
  @js.native
  @Factory
  trait TestCaseFilter extends js.Object {
    var status: js.UndefOr[String]
  }

  /**
    * Information about a test report.
    */
  @js.native
  @Factory
  trait TestReportSummary extends js.Object {
    var durationInNanoSeconds: WrapperLong
    var statusCounts: ReportStatusCounts
    var total: WrapperInt
  }

  @js.native
  @Factory
  trait UpdateProjectInput extends js.Object {
    var name: NonEmptyString
    var artifacts: js.UndefOr[ProjectArtifacts]
    var badgeEnabled: js.UndefOr[WrapperBoolean]
    var cache: js.UndefOr[ProjectCache]
    var description: js.UndefOr[ProjectDescription]
    var encryptionKey: js.UndefOr[NonEmptyString]
    var environment: js.UndefOr[ProjectEnvironment]
    var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations]
    var logsConfig: js.UndefOr[LogsConfig]
    var queuedTimeoutInMinutes: js.UndefOr[TimeOut]
    var secondaryArtifacts: js.UndefOr[ProjectArtifactsList]
    var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions]
    var secondarySources: js.UndefOr[ProjectSources]
    var serviceRole: js.UndefOr[NonEmptyString]
    var source: js.UndefOr[ProjectSource]
    var sourceVersion: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
    var timeoutInMinutes: js.UndefOr[TimeOut]
    var vpcConfig: js.UndefOr[VpcConfig]
  }

  @js.native
  @Factory
  trait UpdateProjectOutput extends js.Object {
    var project: js.UndefOr[Project]
  }

  @js.native
  @Factory
  trait UpdateReportGroupInput extends js.Object {
    var arn: NonEmptyString
    var exportConfig: js.UndefOr[ReportExportConfig]
  }

  @js.native
  @Factory
  trait UpdateReportGroupOutput extends js.Object {
    var reportGroup: js.UndefOr[ReportGroup]
  }

  @js.native
  @Factory
  trait UpdateWebhookInput extends js.Object {
    var projectName: ProjectName
    var branchFilter: js.UndefOr[String]
    var filterGroups: js.UndefOr[FilterGroups]
    var rotateSecret: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpdateWebhookOutput extends js.Object {
    var webhook: js.UndefOr[Webhook]
  }

  /**
    * Information about the VPC configuration that AWS CodeBuild accesses.
    */
  @js.native
  @Factory
  trait VpcConfig extends js.Object {
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var subnets: js.UndefOr[Subnets]
    var vpcId: js.UndefOr[NonEmptyString]
  }

  /**
    * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
    */
  @js.native
  @Factory
  trait Webhook extends js.Object {
    var branchFilter: js.UndefOr[String]
    var filterGroups: js.UndefOr[FilterGroups]
    var lastModifiedSecret: js.UndefOr[Timestamp]
    var payloadUrl: js.UndefOr[NonEmptyString]
    var secret: js.UndefOr[NonEmptyString]
    var url: js.UndefOr[NonEmptyString]
  }

  /**
    * A filter used to determine which webhooks trigger a build.
    */
  @js.native
  @Factory
  trait WebhookFilter extends js.Object {
    var pattern: String
    var `type`: WebhookFilterType
    var excludeMatchedPattern: js.UndefOr[WrapperBoolean]
  }

  @js.native
  sealed trait WebhookFilterType extends js.Any
  object WebhookFilterType extends js.Object {
    val EVENT            = "EVENT".asInstanceOf[WebhookFilterType]
    val BASE_REF         = "BASE_REF".asInstanceOf[WebhookFilterType]
    val HEAD_REF         = "HEAD_REF".asInstanceOf[WebhookFilterType]
    val ACTOR_ACCOUNT_ID = "ACTOR_ACCOUNT_ID".asInstanceOf[WebhookFilterType]
    val FILE_PATH        = "FILE_PATH".asInstanceOf[WebhookFilterType]

    val values = js.Object.freeze(js.Array(EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID, FILE_PATH))
  }
}
