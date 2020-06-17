package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
      service.batchDeleteBuilds(params).promise.toFuture
    @inline def batchGetBuildsFuture(params: BatchGetBuildsInput): Future[BatchGetBuildsOutput] =
      service.batchGetBuilds(params).promise.toFuture
    @inline def batchGetProjectsFuture(params: BatchGetProjectsInput): Future[BatchGetProjectsOutput] =
      service.batchGetProjects(params).promise.toFuture
    @inline def batchGetReportGroupsFuture(params: BatchGetReportGroupsInput): Future[BatchGetReportGroupsOutput] =
      service.batchGetReportGroups(params).promise.toFuture
    @inline def batchGetReportsFuture(params: BatchGetReportsInput): Future[BatchGetReportsOutput] =
      service.batchGetReports(params).promise.toFuture
    @inline def createProjectFuture(params: CreateProjectInput): Future[CreateProjectOutput] =
      service.createProject(params).promise.toFuture
    @inline def createReportGroupFuture(params: CreateReportGroupInput): Future[CreateReportGroupOutput] =
      service.createReportGroup(params).promise.toFuture
    @inline def createWebhookFuture(params: CreateWebhookInput): Future[CreateWebhookOutput] =
      service.createWebhook(params).promise.toFuture
    @inline def deleteProjectFuture(params: DeleteProjectInput): Future[DeleteProjectOutput] =
      service.deleteProject(params).promise.toFuture
    @inline def deleteReportFuture(params: DeleteReportInput): Future[DeleteReportOutput] =
      service.deleteReport(params).promise.toFuture
    @inline def deleteReportGroupFuture(params: DeleteReportGroupInput): Future[DeleteReportGroupOutput] =
      service.deleteReportGroup(params).promise.toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyInput): Future[DeleteResourcePolicyOutput] =
      service.deleteResourcePolicy(params).promise.toFuture
    @inline def deleteSourceCredentialsFuture(
        params: DeleteSourceCredentialsInput
    ): Future[DeleteSourceCredentialsOutput] = service.deleteSourceCredentials(params).promise.toFuture
    @inline def deleteWebhookFuture(params: DeleteWebhookInput): Future[DeleteWebhookOutput] =
      service.deleteWebhook(params).promise.toFuture
    @inline def describeTestCasesFuture(params: DescribeTestCasesInput): Future[DescribeTestCasesOutput] =
      service.describeTestCases(params).promise.toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyInput): Future[GetResourcePolicyOutput] =
      service.getResourcePolicy(params).promise.toFuture
    @inline def importSourceCredentialsFuture(
        params: ImportSourceCredentialsInput
    ): Future[ImportSourceCredentialsOutput] = service.importSourceCredentials(params).promise.toFuture
    @inline def invalidateProjectCacheFuture(
        params: InvalidateProjectCacheInput
    ): Future[InvalidateProjectCacheOutput] = service.invalidateProjectCache(params).promise.toFuture
    @inline def listBuildsForProjectFuture(params: ListBuildsForProjectInput): Future[ListBuildsForProjectOutput] =
      service.listBuildsForProject(params).promise.toFuture
    @inline def listBuildsFuture(params: ListBuildsInput): Future[ListBuildsOutput] =
      service.listBuilds(params).promise.toFuture
    @inline def listCuratedEnvironmentImagesFuture(
        params: ListCuratedEnvironmentImagesInput
    ): Future[ListCuratedEnvironmentImagesOutput] = service.listCuratedEnvironmentImages(params).promise.toFuture
    @inline def listProjectsFuture(params: ListProjectsInput): Future[ListProjectsOutput] =
      service.listProjects(params).promise.toFuture
    @inline def listReportGroupsFuture(params: ListReportGroupsInput): Future[ListReportGroupsOutput] =
      service.listReportGroups(params).promise.toFuture
    @inline def listReportsForReportGroupFuture(
        params: ListReportsForReportGroupInput
    ): Future[ListReportsForReportGroupOutput] = service.listReportsForReportGroup(params).promise.toFuture
    @inline def listReportsFuture(params: ListReportsInput): Future[ListReportsOutput] =
      service.listReports(params).promise.toFuture
    @inline def listSharedProjectsFuture(params: ListSharedProjectsInput): Future[ListSharedProjectsOutput] =
      service.listSharedProjects(params).promise.toFuture
    @inline def listSharedReportGroupsFuture(
        params: ListSharedReportGroupsInput
    ): Future[ListSharedReportGroupsOutput] = service.listSharedReportGroups(params).promise.toFuture
    @inline def listSourceCredentialsFuture(params: ListSourceCredentialsInput): Future[ListSourceCredentialsOutput] =
      service.listSourceCredentials(params).promise.toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyInput): Future[PutResourcePolicyOutput] =
      service.putResourcePolicy(params).promise.toFuture
    @inline def startBuildFuture(params: StartBuildInput): Future[StartBuildOutput] =
      service.startBuild(params).promise.toFuture
    @inline def stopBuildFuture(params: StopBuildInput): Future[StopBuildOutput] =
      service.stopBuild(params).promise.toFuture
    @inline def updateProjectFuture(params: UpdateProjectInput): Future[UpdateProjectOutput] =
      service.updateProject(params).promise.toFuture
    @inline def updateReportGroupFuture(params: UpdateReportGroupInput): Future[UpdateReportGroupOutput] =
      service.updateReportGroup(params).promise.toFuture
    @inline def updateWebhookFuture(params: UpdateWebhookInput): Future[UpdateWebhookOutput] =
      service.updateWebhook(params).promise.toFuture
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
  trait BatchDeleteBuildsInput extends js.Object {
    var ids: BuildIds
  }

  object BatchDeleteBuildsInput {
    @inline
    def apply(
        ids: BuildIds
    ): BatchDeleteBuildsInput = {
      val __obj = js.Dynamic.literal(
        "ids" -> ids.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDeleteBuildsInput]
    }
  }

  @js.native
  trait BatchDeleteBuildsOutput extends js.Object {
    var buildsDeleted: js.UndefOr[BuildIds]
    var buildsNotDeleted: js.UndefOr[BuildsNotDeleted]
  }

  object BatchDeleteBuildsOutput {
    @inline
    def apply(
        buildsDeleted: js.UndefOr[BuildIds] = js.undefined,
        buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.undefined
    ): BatchDeleteBuildsOutput = {
      val __obj = js.Dynamic.literal()
      buildsDeleted.foreach(__v => __obj.updateDynamic("buildsDeleted")(__v.asInstanceOf[js.Any]))
      buildsNotDeleted.foreach(__v => __obj.updateDynamic("buildsNotDeleted")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteBuildsOutput]
    }
  }

  @js.native
  trait BatchGetBuildsInput extends js.Object {
    var ids: BuildIds
  }

  object BatchGetBuildsInput {
    @inline
    def apply(
        ids: BuildIds
    ): BatchGetBuildsInput = {
      val __obj = js.Dynamic.literal(
        "ids" -> ids.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetBuildsInput]
    }
  }

  @js.native
  trait BatchGetBuildsOutput extends js.Object {
    var builds: js.UndefOr[Builds]
    var buildsNotFound: js.UndefOr[BuildIds]
  }

  object BatchGetBuildsOutput {
    @inline
    def apply(
        builds: js.UndefOr[Builds] = js.undefined,
        buildsNotFound: js.UndefOr[BuildIds] = js.undefined
    ): BatchGetBuildsOutput = {
      val __obj = js.Dynamic.literal()
      builds.foreach(__v => __obj.updateDynamic("builds")(__v.asInstanceOf[js.Any]))
      buildsNotFound.foreach(__v => __obj.updateDynamic("buildsNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetBuildsOutput]
    }
  }

  @js.native
  trait BatchGetProjectsInput extends js.Object {
    var names: ProjectNames
  }

  object BatchGetProjectsInput {
    @inline
    def apply(
        names: ProjectNames
    ): BatchGetProjectsInput = {
      val __obj = js.Dynamic.literal(
        "names" -> names.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetProjectsInput]
    }
  }

  @js.native
  trait BatchGetProjectsOutput extends js.Object {
    var projects: js.UndefOr[Projects]
    var projectsNotFound: js.UndefOr[ProjectNames]
  }

  object BatchGetProjectsOutput {
    @inline
    def apply(
        projects: js.UndefOr[Projects] = js.undefined,
        projectsNotFound: js.UndefOr[ProjectNames] = js.undefined
    ): BatchGetProjectsOutput = {
      val __obj = js.Dynamic.literal()
      projects.foreach(__v => __obj.updateDynamic("projects")(__v.asInstanceOf[js.Any]))
      projectsNotFound.foreach(__v => __obj.updateDynamic("projectsNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetProjectsOutput]
    }
  }

  @js.native
  trait BatchGetReportGroupsInput extends js.Object {
    var reportGroupArns: ReportGroupArns
  }

  object BatchGetReportGroupsInput {
    @inline
    def apply(
        reportGroupArns: ReportGroupArns
    ): BatchGetReportGroupsInput = {
      val __obj = js.Dynamic.literal(
        "reportGroupArns" -> reportGroupArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetReportGroupsInput]
    }
  }

  @js.native
  trait BatchGetReportGroupsOutput extends js.Object {
    var reportGroups: js.UndefOr[ReportGroups]
    var reportGroupsNotFound: js.UndefOr[ReportGroupArns]
  }

  object BatchGetReportGroupsOutput {
    @inline
    def apply(
        reportGroups: js.UndefOr[ReportGroups] = js.undefined,
        reportGroupsNotFound: js.UndefOr[ReportGroupArns] = js.undefined
    ): BatchGetReportGroupsOutput = {
      val __obj = js.Dynamic.literal()
      reportGroups.foreach(__v => __obj.updateDynamic("reportGroups")(__v.asInstanceOf[js.Any]))
      reportGroupsNotFound.foreach(__v => __obj.updateDynamic("reportGroupsNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetReportGroupsOutput]
    }
  }

  @js.native
  trait BatchGetReportsInput extends js.Object {
    var reportArns: ReportArns
  }

  object BatchGetReportsInput {
    @inline
    def apply(
        reportArns: ReportArns
    ): BatchGetReportsInput = {
      val __obj = js.Dynamic.literal(
        "reportArns" -> reportArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetReportsInput]
    }
  }

  @js.native
  trait BatchGetReportsOutput extends js.Object {
    var reports: js.UndefOr[Reports]
    var reportsNotFound: js.UndefOr[ReportArns]
  }

  object BatchGetReportsOutput {
    @inline
    def apply(
        reports: js.UndefOr[Reports] = js.undefined,
        reportsNotFound: js.UndefOr[ReportArns] = js.undefined
    ): BatchGetReportsOutput = {
      val __obj = js.Dynamic.literal()
      reports.foreach(__v => __obj.updateDynamic("reports")(__v.asInstanceOf[js.Any]))
      reportsNotFound.foreach(__v => __obj.updateDynamic("reportsNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetReportsOutput]
    }
  }

  /**
    * Information about a build.
    */
  @js.native
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

  object Build {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        artifacts: js.UndefOr[BuildArtifacts] = js.undefined,
        buildComplete: js.UndefOr[Boolean] = js.undefined,
        buildNumber: js.UndefOr[WrapperLong] = js.undefined,
        buildStatus: js.UndefOr[StatusType] = js.undefined,
        cache: js.UndefOr[ProjectCache] = js.undefined,
        currentPhase: js.UndefOr[String] = js.undefined,
        encryptionKey: js.UndefOr[NonEmptyString] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        environment: js.UndefOr[ProjectEnvironment] = js.undefined,
        exportedEnvironmentVariables: js.UndefOr[ExportedEnvironmentVariables] = js.undefined,
        fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined,
        id: js.UndefOr[NonEmptyString] = js.undefined,
        initiator: js.UndefOr[String] = js.undefined,
        logs: js.UndefOr[LogsLocation] = js.undefined,
        networkInterface: js.UndefOr[NetworkInterface] = js.undefined,
        phases: js.UndefOr[BuildPhases] = js.undefined,
        projectName: js.UndefOr[NonEmptyString] = js.undefined,
        queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined,
        reportArns: js.UndefOr[BuildReportArns] = js.undefined,
        resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.undefined,
        secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.undefined,
        secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined,
        secondarySources: js.UndefOr[ProjectSources] = js.undefined,
        serviceRole: js.UndefOr[NonEmptyString] = js.undefined,
        source: js.UndefOr[ProjectSource] = js.undefined,
        sourceVersion: js.UndefOr[NonEmptyString] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        timeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined,
        vpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): Build = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      artifacts.foreach(__v => __obj.updateDynamic("artifacts")(__v.asInstanceOf[js.Any]))
      buildComplete.foreach(__v => __obj.updateDynamic("buildComplete")(__v.asInstanceOf[js.Any]))
      buildNumber.foreach(__v => __obj.updateDynamic("buildNumber")(__v.asInstanceOf[js.Any]))
      buildStatus.foreach(__v => __obj.updateDynamic("buildStatus")(__v.asInstanceOf[js.Any]))
      cache.foreach(__v => __obj.updateDynamic("cache")(__v.asInstanceOf[js.Any]))
      currentPhase.foreach(__v => __obj.updateDynamic("currentPhase")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      exportedEnvironmentVariables.foreach(__v =>
        __obj.updateDynamic("exportedEnvironmentVariables")(__v.asInstanceOf[js.Any])
      )
      fileSystemLocations.foreach(__v => __obj.updateDynamic("fileSystemLocations")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      initiator.foreach(__v => __obj.updateDynamic("initiator")(__v.asInstanceOf[js.Any]))
      logs.foreach(__v => __obj.updateDynamic("logs")(__v.asInstanceOf[js.Any]))
      networkInterface.foreach(__v => __obj.updateDynamic("networkInterface")(__v.asInstanceOf[js.Any]))
      phases.foreach(__v => __obj.updateDynamic("phases")(__v.asInstanceOf[js.Any]))
      projectName.foreach(__v => __obj.updateDynamic("projectName")(__v.asInstanceOf[js.Any]))
      queuedTimeoutInMinutes.foreach(__v => __obj.updateDynamic("queuedTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      reportArns.foreach(__v => __obj.updateDynamic("reportArns")(__v.asInstanceOf[js.Any]))
      resolvedSourceVersion.foreach(__v => __obj.updateDynamic("resolvedSourceVersion")(__v.asInstanceOf[js.Any]))
      secondaryArtifacts.foreach(__v => __obj.updateDynamic("secondaryArtifacts")(__v.asInstanceOf[js.Any]))
      secondarySourceVersions.foreach(__v => __obj.updateDynamic("secondarySourceVersions")(__v.asInstanceOf[js.Any]))
      secondarySources.foreach(__v => __obj.updateDynamic("secondarySources")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      sourceVersion.foreach(__v => __obj.updateDynamic("sourceVersion")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      timeoutInMinutes.foreach(__v => __obj.updateDynamic("timeoutInMinutes")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Build]
    }
  }

  /**
    * Information about build output artifacts.
    */
  @js.native
  trait BuildArtifacts extends js.Object {
    var artifactIdentifier: js.UndefOr[String]
    var encryptionDisabled: js.UndefOr[WrapperBoolean]
    var location: js.UndefOr[String]
    var md5sum: js.UndefOr[String]
    var overrideArtifactName: js.UndefOr[WrapperBoolean]
    var sha256sum: js.UndefOr[String]
  }

  object BuildArtifacts {
    @inline
    def apply(
        artifactIdentifier: js.UndefOr[String] = js.undefined,
        encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
        location: js.UndefOr[String] = js.undefined,
        md5sum: js.UndefOr[String] = js.undefined,
        overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined,
        sha256sum: js.UndefOr[String] = js.undefined
    ): BuildArtifacts = {
      val __obj = js.Dynamic.literal()
      artifactIdentifier.foreach(__v => __obj.updateDynamic("artifactIdentifier")(__v.asInstanceOf[js.Any]))
      encryptionDisabled.foreach(__v => __obj.updateDynamic("encryptionDisabled")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      md5sum.foreach(__v => __obj.updateDynamic("md5sum")(__v.asInstanceOf[js.Any]))
      overrideArtifactName.foreach(__v => __obj.updateDynamic("overrideArtifactName")(__v.asInstanceOf[js.Any]))
      sha256sum.foreach(__v => __obj.updateDynamic("sha256sum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildArtifacts]
    }
  }

  /**
    * Information about a build that could not be successfully deleted.
    */
  @js.native
  trait BuildNotDeleted extends js.Object {
    var id: js.UndefOr[NonEmptyString]
    var statusCode: js.UndefOr[String]
  }

  object BuildNotDeleted {
    @inline
    def apply(
        id: js.UndefOr[NonEmptyString] = js.undefined,
        statusCode: js.UndefOr[String] = js.undefined
    ): BuildNotDeleted = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildNotDeleted]
    }
  }

  /**
    * Information about a stage for a build.
    */
  @js.native
  trait BuildPhase extends js.Object {
    var contexts: js.UndefOr[PhaseContexts]
    var durationInSeconds: js.UndefOr[WrapperLong]
    var endTime: js.UndefOr[Timestamp]
    var phaseStatus: js.UndefOr[StatusType]
    var phaseType: js.UndefOr[BuildPhaseType]
    var startTime: js.UndefOr[Timestamp]
  }

  object BuildPhase {
    @inline
    def apply(
        contexts: js.UndefOr[PhaseContexts] = js.undefined,
        durationInSeconds: js.UndefOr[WrapperLong] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        phaseStatus: js.UndefOr[StatusType] = js.undefined,
        phaseType: js.UndefOr[BuildPhaseType] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): BuildPhase = {
      val __obj = js.Dynamic.literal()
      contexts.foreach(__v => __obj.updateDynamic("contexts")(__v.asInstanceOf[js.Any]))
      durationInSeconds.foreach(__v => __obj.updateDynamic("durationInSeconds")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      phaseStatus.foreach(__v => __obj.updateDynamic("phaseStatus")(__v.asInstanceOf[js.Any]))
      phaseType.foreach(__v => __obj.updateDynamic("phaseType")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildPhase]
    }
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
  trait CloudWatchLogsConfig extends js.Object {
    var status: LogsConfigStatusType
    var groupName: js.UndefOr[String]
    var streamName: js.UndefOr[String]
  }

  object CloudWatchLogsConfig {
    @inline
    def apply(
        status: LogsConfigStatusType,
        groupName: js.UndefOr[String] = js.undefined,
        streamName: js.UndefOr[String] = js.undefined
    ): CloudWatchLogsConfig = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      groupName.foreach(__v => __obj.updateDynamic("groupName")(__v.asInstanceOf[js.Any]))
      streamName.foreach(__v => __obj.updateDynamic("streamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsConfig]
    }
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

  object CreateProjectInput {
    @inline
    def apply(
        artifacts: ProjectArtifacts,
        environment: ProjectEnvironment,
        name: ProjectName,
        serviceRole: NonEmptyString,
        source: ProjectSource,
        badgeEnabled: js.UndefOr[WrapperBoolean] = js.undefined,
        cache: js.UndefOr[ProjectCache] = js.undefined,
        description: js.UndefOr[ProjectDescription] = js.undefined,
        encryptionKey: js.UndefOr[NonEmptyString] = js.undefined,
        fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined,
        logsConfig: js.UndefOr[LogsConfig] = js.undefined,
        queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
        secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined,
        secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined,
        secondarySources: js.UndefOr[ProjectSources] = js.undefined,
        sourceVersion: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
        vpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateProjectInput = {
      val __obj = js.Dynamic.literal(
        "artifacts"   -> artifacts.asInstanceOf[js.Any],
        "environment" -> environment.asInstanceOf[js.Any],
        "name"        -> name.asInstanceOf[js.Any],
        "serviceRole" -> serviceRole.asInstanceOf[js.Any],
        "source"      -> source.asInstanceOf[js.Any]
      )

      badgeEnabled.foreach(__v => __obj.updateDynamic("badgeEnabled")(__v.asInstanceOf[js.Any]))
      cache.foreach(__v => __obj.updateDynamic("cache")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      fileSystemLocations.foreach(__v => __obj.updateDynamic("fileSystemLocations")(__v.asInstanceOf[js.Any]))
      logsConfig.foreach(__v => __obj.updateDynamic("logsConfig")(__v.asInstanceOf[js.Any]))
      queuedTimeoutInMinutes.foreach(__v => __obj.updateDynamic("queuedTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      secondaryArtifacts.foreach(__v => __obj.updateDynamic("secondaryArtifacts")(__v.asInstanceOf[js.Any]))
      secondarySourceVersions.foreach(__v => __obj.updateDynamic("secondarySourceVersions")(__v.asInstanceOf[js.Any]))
      secondarySources.foreach(__v => __obj.updateDynamic("secondarySources")(__v.asInstanceOf[js.Any]))
      sourceVersion.foreach(__v => __obj.updateDynamic("sourceVersion")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      timeoutInMinutes.foreach(__v => __obj.updateDynamic("timeoutInMinutes")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectInput]
    }
  }

  @js.native
  trait CreateProjectOutput extends js.Object {
    var project: js.UndefOr[Project]
  }

  object CreateProjectOutput {
    @inline
    def apply(
        project: js.UndefOr[Project] = js.undefined
    ): CreateProjectOutput = {
      val __obj = js.Dynamic.literal()
      project.foreach(__v => __obj.updateDynamic("project")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectOutput]
    }
  }

  @js.native
  trait CreateReportGroupInput extends js.Object {
    var exportConfig: ReportExportConfig
    var name: ReportGroupName
    var `type`: ReportType
  }

  object CreateReportGroupInput {
    @inline
    def apply(
        exportConfig: ReportExportConfig,
        name: ReportGroupName,
        `type`: ReportType
    ): CreateReportGroupInput = {
      val __obj = js.Dynamic.literal(
        "exportConfig" -> exportConfig.asInstanceOf[js.Any],
        "name"         -> name.asInstanceOf[js.Any],
        "type"         -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateReportGroupInput]
    }
  }

  @js.native
  trait CreateReportGroupOutput extends js.Object {
    var reportGroup: js.UndefOr[ReportGroup]
  }

  object CreateReportGroupOutput {
    @inline
    def apply(
        reportGroup: js.UndefOr[ReportGroup] = js.undefined
    ): CreateReportGroupOutput = {
      val __obj = js.Dynamic.literal()
      reportGroup.foreach(__v => __obj.updateDynamic("reportGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReportGroupOutput]
    }
  }

  @js.native
  trait CreateWebhookInput extends js.Object {
    var projectName: ProjectName
    var branchFilter: js.UndefOr[String]
    var filterGroups: js.UndefOr[FilterGroups]
  }

  object CreateWebhookInput {
    @inline
    def apply(
        projectName: ProjectName,
        branchFilter: js.UndefOr[String] = js.undefined,
        filterGroups: js.UndefOr[FilterGroups] = js.undefined
    ): CreateWebhookInput = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      branchFilter.foreach(__v => __obj.updateDynamic("branchFilter")(__v.asInstanceOf[js.Any]))
      filterGroups.foreach(__v => __obj.updateDynamic("filterGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWebhookInput]
    }
  }

  @js.native
  trait CreateWebhookOutput extends js.Object {
    var webhook: js.UndefOr[Webhook]
  }

  object CreateWebhookOutput {
    @inline
    def apply(
        webhook: js.UndefOr[Webhook] = js.undefined
    ): CreateWebhookOutput = {
      val __obj = js.Dynamic.literal()
      webhook.foreach(__v => __obj.updateDynamic("webhook")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWebhookOutput]
    }
  }

  @js.native
  sealed trait CredentialProviderType extends js.Any
  object CredentialProviderType extends js.Object {
    val SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[CredentialProviderType]

    val values = js.Object.freeze(js.Array(SECRETS_MANAGER))
  }

  @js.native
  trait DeleteProjectInput extends js.Object {
    var name: NonEmptyString
  }

  object DeleteProjectInput {
    @inline
    def apply(
        name: NonEmptyString
    ): DeleteProjectInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteProjectInput]
    }
  }

  @js.native
  trait DeleteProjectOutput extends js.Object {}

  object DeleteProjectOutput {
    @inline
    def apply(
    ): DeleteProjectOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteProjectOutput]
    }
  }

  @js.native
  trait DeleteReportGroupInput extends js.Object {
    var arn: NonEmptyString
  }

  object DeleteReportGroupInput {
    @inline
    def apply(
        arn: NonEmptyString
    ): DeleteReportGroupInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReportGroupInput]
    }
  }

  @js.native
  trait DeleteReportGroupOutput extends js.Object {}

  object DeleteReportGroupOutput {
    @inline
    def apply(
    ): DeleteReportGroupOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteReportGroupOutput]
    }
  }

  @js.native
  trait DeleteReportInput extends js.Object {
    var arn: NonEmptyString
  }

  object DeleteReportInput {
    @inline
    def apply(
        arn: NonEmptyString
    ): DeleteReportInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReportInput]
    }
  }

  @js.native
  trait DeleteReportOutput extends js.Object {}

  object DeleteReportOutput {
    @inline
    def apply(
    ): DeleteReportOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteReportOutput]
    }
  }

  @js.native
  trait DeleteResourcePolicyInput extends js.Object {
    var resourceArn: NonEmptyString
  }

  object DeleteResourcePolicyInput {
    @inline
    def apply(
        resourceArn: NonEmptyString
    ): DeleteResourcePolicyInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteResourcePolicyInput]
    }
  }

  @js.native
  trait DeleteResourcePolicyOutput extends js.Object {}

  object DeleteResourcePolicyOutput {
    @inline
    def apply(
    ): DeleteResourcePolicyOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteResourcePolicyOutput]
    }
  }

  @js.native
  trait DeleteSourceCredentialsInput extends js.Object {
    var arn: NonEmptyString
  }

  object DeleteSourceCredentialsInput {
    @inline
    def apply(
        arn: NonEmptyString
    ): DeleteSourceCredentialsInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSourceCredentialsInput]
    }
  }

  @js.native
  trait DeleteSourceCredentialsOutput extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
  }

  object DeleteSourceCredentialsOutput {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined
    ): DeleteSourceCredentialsOutput = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSourceCredentialsOutput]
    }
  }

  @js.native
  trait DeleteWebhookInput extends js.Object {
    var projectName: ProjectName
  }

  object DeleteWebhookInput {
    @inline
    def apply(
        projectName: ProjectName
    ): DeleteWebhookInput = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteWebhookInput]
    }
  }

  @js.native
  trait DeleteWebhookOutput extends js.Object {}

  object DeleteWebhookOutput {
    @inline
    def apply(
    ): DeleteWebhookOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteWebhookOutput]
    }
  }

  @js.native
  trait DescribeTestCasesInput extends js.Object {
    var reportArn: String
    var filter: js.UndefOr[TestCaseFilter]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
  }

  object DescribeTestCasesInput {
    @inline
    def apply(
        reportArn: String,
        filter: js.UndefOr[TestCaseFilter] = js.undefined,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeTestCasesInput = {
      val __obj = js.Dynamic.literal(
        "reportArn" -> reportArn.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTestCasesInput]
    }
  }

  @js.native
  trait DescribeTestCasesOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var testCases: js.UndefOr[TestCases]
  }

  object DescribeTestCasesOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        testCases: js.UndefOr[TestCases] = js.undefined
    ): DescribeTestCasesOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      testCases.foreach(__v => __obj.updateDynamic("testCases")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTestCasesOutput]
    }
  }

  /**
    * Information about a Docker image that is managed by AWS CodeBuild.
    */
  @js.native
  trait EnvironmentImage extends js.Object {
    var description: js.UndefOr[String]
    var name: js.UndefOr[String]
    var versions: js.UndefOr[ImageVersions]
  }

  object EnvironmentImage {
    @inline
    def apply(
        description: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        versions: js.UndefOr[ImageVersions] = js.undefined
    ): EnvironmentImage = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      versions.foreach(__v => __obj.updateDynamic("versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentImage]
    }
  }

  /**
    * A set of Docker images that are related by programming language and are managed by AWS CodeBuild.
    */
  @js.native
  trait EnvironmentLanguage extends js.Object {
    var images: js.UndefOr[EnvironmentImages]
    var language: js.UndefOr[LanguageType]
  }

  object EnvironmentLanguage {
    @inline
    def apply(
        images: js.UndefOr[EnvironmentImages] = js.undefined,
        language: js.UndefOr[LanguageType] = js.undefined
    ): EnvironmentLanguage = {
      val __obj = js.Dynamic.literal()
      images.foreach(__v => __obj.updateDynamic("images")(__v.asInstanceOf[js.Any]))
      language.foreach(__v => __obj.updateDynamic("language")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentLanguage]
    }
  }

  /**
    * A set of Docker images that are related by platform and are managed by AWS CodeBuild.
    */
  @js.native
  trait EnvironmentPlatform extends js.Object {
    var languages: js.UndefOr[EnvironmentLanguages]
    var platform: js.UndefOr[PlatformType]
  }

  object EnvironmentPlatform {
    @inline
    def apply(
        languages: js.UndefOr[EnvironmentLanguages] = js.undefined,
        platform: js.UndefOr[PlatformType] = js.undefined
    ): EnvironmentPlatform = {
      val __obj = js.Dynamic.literal()
      languages.foreach(__v => __obj.updateDynamic("languages")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentPlatform]
    }
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
  trait EnvironmentVariable extends js.Object {
    var name: NonEmptyString
    var value: String
    var `type`: js.UndefOr[EnvironmentVariableType]
  }

  object EnvironmentVariable {
    @inline
    def apply(
        name: NonEmptyString,
        value: String,
        `type`: js.UndefOr[EnvironmentVariableType] = js.undefined
    ): EnvironmentVariable = {
      val __obj = js.Dynamic.literal(
        "name"  -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentVariable]
    }
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
  trait ExportedEnvironmentVariable extends js.Object {
    var name: js.UndefOr[NonEmptyString]
    var value: js.UndefOr[String]
  }

  object ExportedEnvironmentVariable {
    @inline
    def apply(
        name: js.UndefOr[NonEmptyString] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): ExportedEnvironmentVariable = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportedEnvironmentVariable]
    }
  }

  @js.native
  sealed trait FileSystemType extends js.Any
  object FileSystemType extends js.Object {
    val EFS = "EFS".asInstanceOf[FileSystemType]

    val values = js.Object.freeze(js.Array(EFS))
  }

  @js.native
  trait GetResourcePolicyInput extends js.Object {
    var resourceArn: NonEmptyString
  }

  object GetResourcePolicyInput {
    @inline
    def apply(
        resourceArn: NonEmptyString
    ): GetResourcePolicyInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetResourcePolicyInput]
    }
  }

  @js.native
  trait GetResourcePolicyOutput extends js.Object {
    var policy: js.UndefOr[NonEmptyString]
  }

  object GetResourcePolicyOutput {
    @inline
    def apply(
        policy: js.UndefOr[NonEmptyString] = js.undefined
    ): GetResourcePolicyOutput = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePolicyOutput]
    }
  }

  /**
    * Information about the Git submodules configuration for an AWS CodeBuild build project.
    */
  @js.native
  trait GitSubmodulesConfig extends js.Object {
    var fetchSubmodules: WrapperBoolean
  }

  object GitSubmodulesConfig {
    @inline
    def apply(
        fetchSubmodules: WrapperBoolean
    ): GitSubmodulesConfig = {
      val __obj = js.Dynamic.literal(
        "fetchSubmodules" -> fetchSubmodules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GitSubmodulesConfig]
    }
  }

  @js.native
  sealed trait ImagePullCredentialsType extends js.Any
  object ImagePullCredentialsType extends js.Object {
    val CODEBUILD    = "CODEBUILD".asInstanceOf[ImagePullCredentialsType]
    val SERVICE_ROLE = "SERVICE_ROLE".asInstanceOf[ImagePullCredentialsType]

    val values = js.Object.freeze(js.Array(CODEBUILD, SERVICE_ROLE))
  }

  @js.native
  trait ImportSourceCredentialsInput extends js.Object {
    var authType: AuthType
    var serverType: ServerType
    var token: SensitiveNonEmptyString
    var shouldOverwrite: js.UndefOr[WrapperBoolean]
    var username: js.UndefOr[NonEmptyString]
  }

  object ImportSourceCredentialsInput {
    @inline
    def apply(
        authType: AuthType,
        serverType: ServerType,
        token: SensitiveNonEmptyString,
        shouldOverwrite: js.UndefOr[WrapperBoolean] = js.undefined,
        username: js.UndefOr[NonEmptyString] = js.undefined
    ): ImportSourceCredentialsInput = {
      val __obj = js.Dynamic.literal(
        "authType"   -> authType.asInstanceOf[js.Any],
        "serverType" -> serverType.asInstanceOf[js.Any],
        "token"      -> token.asInstanceOf[js.Any]
      )

      shouldOverwrite.foreach(__v => __obj.updateDynamic("shouldOverwrite")(__v.asInstanceOf[js.Any]))
      username.foreach(__v => __obj.updateDynamic("username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportSourceCredentialsInput]
    }
  }

  @js.native
  trait ImportSourceCredentialsOutput extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
  }

  object ImportSourceCredentialsOutput {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined
    ): ImportSourceCredentialsOutput = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportSourceCredentialsOutput]
    }
  }

  @js.native
  trait InvalidateProjectCacheInput extends js.Object {
    var projectName: NonEmptyString
  }

  object InvalidateProjectCacheInput {
    @inline
    def apply(
        projectName: NonEmptyString
    ): InvalidateProjectCacheInput = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InvalidateProjectCacheInput]
    }
  }

  @js.native
  trait InvalidateProjectCacheOutput extends js.Object {}

  object InvalidateProjectCacheOutput {
    @inline
    def apply(
    ): InvalidateProjectCacheOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[InvalidateProjectCacheOutput]
    }
  }

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
  trait ListBuildsForProjectInput extends js.Object {
    var projectName: NonEmptyString
    var nextToken: js.UndefOr[String]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListBuildsForProjectInput {
    @inline
    def apply(
        projectName: NonEmptyString,
        nextToken: js.UndefOr[String] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListBuildsForProjectInput = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildsForProjectInput]
    }
  }

  @js.native
  trait ListBuildsForProjectOutput extends js.Object {
    var ids: js.UndefOr[BuildIds]
    var nextToken: js.UndefOr[String]
  }

  object ListBuildsForProjectOutput {
    @inline
    def apply(
        ids: js.UndefOr[BuildIds] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListBuildsForProjectOutput = {
      val __obj = js.Dynamic.literal()
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildsForProjectOutput]
    }
  }

  @js.native
  trait ListBuildsInput extends js.Object {
    var nextToken: js.UndefOr[String]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListBuildsInput {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListBuildsInput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildsInput]
    }
  }

  @js.native
  trait ListBuildsOutput extends js.Object {
    var ids: js.UndefOr[BuildIds]
    var nextToken: js.UndefOr[String]
  }

  object ListBuildsOutput {
    @inline
    def apply(
        ids: js.UndefOr[BuildIds] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListBuildsOutput = {
      val __obj = js.Dynamic.literal()
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildsOutput]
    }
  }

  @js.native
  trait ListCuratedEnvironmentImagesInput extends js.Object {}

  object ListCuratedEnvironmentImagesInput {
    @inline
    def apply(
    ): ListCuratedEnvironmentImagesInput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ListCuratedEnvironmentImagesInput]
    }
  }

  @js.native
  trait ListCuratedEnvironmentImagesOutput extends js.Object {
    var platforms: js.UndefOr[EnvironmentPlatforms]
  }

  object ListCuratedEnvironmentImagesOutput {
    @inline
    def apply(
        platforms: js.UndefOr[EnvironmentPlatforms] = js.undefined
    ): ListCuratedEnvironmentImagesOutput = {
      val __obj = js.Dynamic.literal()
      platforms.foreach(__v => __obj.updateDynamic("platforms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCuratedEnvironmentImagesOutput]
    }
  }

  @js.native
  trait ListProjectsInput extends js.Object {
    var nextToken: js.UndefOr[NonEmptyString]
    var sortBy: js.UndefOr[ProjectSortByType]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListProjectsInput {
    @inline
    def apply(
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        sortBy: js.UndefOr[ProjectSortByType] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListProjectsInput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsInput]
    }
  }

  @js.native
  trait ListProjectsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var projects: js.UndefOr[ProjectNames]
  }

  object ListProjectsOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        projects: js.UndefOr[ProjectNames] = js.undefined
    ): ListProjectsOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      projects.foreach(__v => __obj.updateDynamic("projects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsOutput]
    }
  }

  @js.native
  trait ListReportGroupsInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var sortBy: js.UndefOr[ReportGroupSortByType]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListReportGroupsInput {
    @inline
    def apply(
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        sortBy: js.UndefOr[ReportGroupSortByType] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListReportGroupsInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReportGroupsInput]
    }
  }

  @js.native
  trait ListReportGroupsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var reportGroups: js.UndefOr[ReportGroupArns]
  }

  object ListReportGroupsOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        reportGroups: js.UndefOr[ReportGroupArns] = js.undefined
    ): ListReportGroupsOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      reportGroups.foreach(__v => __obj.updateDynamic("reportGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReportGroupsOutput]
    }
  }

  @js.native
  trait ListReportsForReportGroupInput extends js.Object {
    var reportGroupArn: String
    var filter: js.UndefOr[ReportFilter]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListReportsForReportGroupInput {
    @inline
    def apply(
        reportGroupArn: String,
        filter: js.UndefOr[ReportFilter] = js.undefined,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListReportsForReportGroupInput = {
      val __obj = js.Dynamic.literal(
        "reportGroupArn" -> reportGroupArn.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReportsForReportGroupInput]
    }
  }

  @js.native
  trait ListReportsForReportGroupOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var reports: js.UndefOr[ReportArns]
  }

  object ListReportsForReportGroupOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        reports: js.UndefOr[ReportArns] = js.undefined
    ): ListReportsForReportGroupOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      reports.foreach(__v => __obj.updateDynamic("reports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReportsForReportGroupOutput]
    }
  }

  @js.native
  trait ListReportsInput extends js.Object {
    var filter: js.UndefOr[ReportFilter]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListReportsInput {
    @inline
    def apply(
        filter: js.UndefOr[ReportFilter] = js.undefined,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListReportsInput = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReportsInput]
    }
  }

  @js.native
  trait ListReportsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var reports: js.UndefOr[ReportArns]
  }

  object ListReportsOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        reports: js.UndefOr[ReportArns] = js.undefined
    ): ListReportsOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      reports.foreach(__v => __obj.updateDynamic("reports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReportsOutput]
    }
  }

  @js.native
  trait ListSharedProjectsInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[NonEmptyString]
    var sortBy: js.UndefOr[SharedResourceSortByType]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListSharedProjectsInput {
    @inline
    def apply(
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        sortBy: js.UndefOr[SharedResourceSortByType] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListSharedProjectsInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSharedProjectsInput]
    }
  }

  @js.native
  trait ListSharedProjectsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var projects: js.UndefOr[ProjectArns]
  }

  object ListSharedProjectsOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        projects: js.UndefOr[ProjectArns] = js.undefined
    ): ListSharedProjectsOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      projects.foreach(__v => __obj.updateDynamic("projects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSharedProjectsOutput]
    }
  }

  @js.native
  trait ListSharedReportGroupsInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var sortBy: js.UndefOr[SharedResourceSortByType]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListSharedReportGroupsInput {
    @inline
    def apply(
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        sortBy: js.UndefOr[SharedResourceSortByType] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListSharedReportGroupsInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSharedReportGroupsInput]
    }
  }

  @js.native
  trait ListSharedReportGroupsOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var reportGroups: js.UndefOr[ReportGroupArns]
  }

  object ListSharedReportGroupsOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        reportGroups: js.UndefOr[ReportGroupArns] = js.undefined
    ): ListSharedReportGroupsOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      reportGroups.foreach(__v => __obj.updateDynamic("reportGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSharedReportGroupsOutput]
    }
  }

  @js.native
  trait ListSourceCredentialsInput extends js.Object {}

  object ListSourceCredentialsInput {
    @inline
    def apply(
    ): ListSourceCredentialsInput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ListSourceCredentialsInput]
    }
  }

  @js.native
  trait ListSourceCredentialsOutput extends js.Object {
    var sourceCredentialsInfos: js.UndefOr[SourceCredentialsInfos]
  }

  object ListSourceCredentialsOutput {
    @inline
    def apply(
        sourceCredentialsInfos: js.UndefOr[SourceCredentialsInfos] = js.undefined
    ): ListSourceCredentialsOutput = {
      val __obj = js.Dynamic.literal()
      sourceCredentialsInfos.foreach(__v => __obj.updateDynamic("sourceCredentialsInfos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceCredentialsOutput]
    }
  }

  /**
    * Information about logs for a build project. These can be logs in Amazon CloudWatch Logs, built in a specified S3 bucket, or both.
    */
  @js.native
  trait LogsConfig extends js.Object {
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig]
    var s3Logs: js.UndefOr[S3LogsConfig]
  }

  object LogsConfig {
    @inline
    def apply(
        cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.undefined,
        s3Logs: js.UndefOr[S3LogsConfig] = js.undefined
    ): LogsConfig = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogs.foreach(__v => __obj.updateDynamic("cloudWatchLogs")(__v.asInstanceOf[js.Any]))
      s3Logs.foreach(__v => __obj.updateDynamic("s3Logs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogsConfig]
    }
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

  object LogsLocation {
    @inline
    def apply(
        cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.undefined,
        cloudWatchLogsArn: js.UndefOr[String] = js.undefined,
        deepLink: js.UndefOr[String] = js.undefined,
        groupName: js.UndefOr[String] = js.undefined,
        s3DeepLink: js.UndefOr[String] = js.undefined,
        s3Logs: js.UndefOr[S3LogsConfig] = js.undefined,
        s3LogsArn: js.UndefOr[String] = js.undefined,
        streamName: js.UndefOr[String] = js.undefined
    ): LogsLocation = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogs.foreach(__v => __obj.updateDynamic("cloudWatchLogs")(__v.asInstanceOf[js.Any]))
      cloudWatchLogsArn.foreach(__v => __obj.updateDynamic("cloudWatchLogsArn")(__v.asInstanceOf[js.Any]))
      deepLink.foreach(__v => __obj.updateDynamic("deepLink")(__v.asInstanceOf[js.Any]))
      groupName.foreach(__v => __obj.updateDynamic("groupName")(__v.asInstanceOf[js.Any]))
      s3DeepLink.foreach(__v => __obj.updateDynamic("s3DeepLink")(__v.asInstanceOf[js.Any]))
      s3Logs.foreach(__v => __obj.updateDynamic("s3Logs")(__v.asInstanceOf[js.Any]))
      s3LogsArn.foreach(__v => __obj.updateDynamic("s3LogsArn")(__v.asInstanceOf[js.Any]))
      streamName.foreach(__v => __obj.updateDynamic("streamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogsLocation]
    }
  }

  /**
    * Describes a network interface.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var networkInterfaceId: js.UndefOr[NonEmptyString]
    var subnetId: js.UndefOr[NonEmptyString]
  }

  object NetworkInterface {
    @inline
    def apply(
        networkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined,
        subnetId: js.UndefOr[NonEmptyString] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      networkInterfaceId.foreach(__v => __obj.updateDynamic("networkInterfaceId")(__v.asInstanceOf[js.Any]))
      subnetId.foreach(__v => __obj.updateDynamic("subnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  /**
    * Additional information about a build phase that has an error. You can use this information for troubleshooting.
    */
  @js.native
  trait PhaseContext extends js.Object {
    var message: js.UndefOr[String]
    var statusCode: js.UndefOr[String]
  }

  object PhaseContext {
    @inline
    def apply(
        message: js.UndefOr[String] = js.undefined,
        statusCode: js.UndefOr[String] = js.undefined
    ): PhaseContext = {
      val __obj = js.Dynamic.literal()
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhaseContext]
    }
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

  object Project {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        artifacts: js.UndefOr[ProjectArtifacts] = js.undefined,
        badge: js.UndefOr[ProjectBadge] = js.undefined,
        cache: js.UndefOr[ProjectCache] = js.undefined,
        created: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[ProjectDescription] = js.undefined,
        encryptionKey: js.UndefOr[NonEmptyString] = js.undefined,
        environment: js.UndefOr[ProjectEnvironment] = js.undefined,
        fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined,
        lastModified: js.UndefOr[Timestamp] = js.undefined,
        logsConfig: js.UndefOr[LogsConfig] = js.undefined,
        name: js.UndefOr[ProjectName] = js.undefined,
        queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
        secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined,
        secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined,
        secondarySources: js.UndefOr[ProjectSources] = js.undefined,
        serviceRole: js.UndefOr[NonEmptyString] = js.undefined,
        source: js.UndefOr[ProjectSource] = js.undefined,
        sourceVersion: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
        vpcConfig: js.UndefOr[VpcConfig] = js.undefined,
        webhook: js.UndefOr[Webhook] = js.undefined
    ): Project = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      artifacts.foreach(__v => __obj.updateDynamic("artifacts")(__v.asInstanceOf[js.Any]))
      badge.foreach(__v => __obj.updateDynamic("badge")(__v.asInstanceOf[js.Any]))
      cache.foreach(__v => __obj.updateDynamic("cache")(__v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      fileSystemLocations.foreach(__v => __obj.updateDynamic("fileSystemLocations")(__v.asInstanceOf[js.Any]))
      lastModified.foreach(__v => __obj.updateDynamic("lastModified")(__v.asInstanceOf[js.Any]))
      logsConfig.foreach(__v => __obj.updateDynamic("logsConfig")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      queuedTimeoutInMinutes.foreach(__v => __obj.updateDynamic("queuedTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      secondaryArtifacts.foreach(__v => __obj.updateDynamic("secondaryArtifacts")(__v.asInstanceOf[js.Any]))
      secondarySourceVersions.foreach(__v => __obj.updateDynamic("secondarySourceVersions")(__v.asInstanceOf[js.Any]))
      secondarySources.foreach(__v => __obj.updateDynamic("secondarySources")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      sourceVersion.foreach(__v => __obj.updateDynamic("sourceVersion")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      timeoutInMinutes.foreach(__v => __obj.updateDynamic("timeoutInMinutes")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      webhook.foreach(__v => __obj.updateDynamic("webhook")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Project]
    }
  }

  /**
    * Information about the build output artifacts for the build project.
    */
  @js.native
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

  object ProjectArtifacts {
    @inline
    def apply(
        `type`: ArtifactsType,
        artifactIdentifier: js.UndefOr[String] = js.undefined,
        encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
        location: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        namespaceType: js.UndefOr[ArtifactNamespace] = js.undefined,
        overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined,
        packaging: js.UndefOr[ArtifactPackaging] = js.undefined,
        path: js.UndefOr[String] = js.undefined
    ): ProjectArtifacts = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      artifactIdentifier.foreach(__v => __obj.updateDynamic("artifactIdentifier")(__v.asInstanceOf[js.Any]))
      encryptionDisabled.foreach(__v => __obj.updateDynamic("encryptionDisabled")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      namespaceType.foreach(__v => __obj.updateDynamic("namespaceType")(__v.asInstanceOf[js.Any]))
      overrideArtifactName.foreach(__v => __obj.updateDynamic("overrideArtifactName")(__v.asInstanceOf[js.Any]))
      packaging.foreach(__v => __obj.updateDynamic("packaging")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectArtifacts]
    }
  }

  /**
    * Information about the build badge for the build project.
    */
  @js.native
  trait ProjectBadge extends js.Object {
    var badgeEnabled: js.UndefOr[Boolean]
    var badgeRequestUrl: js.UndefOr[String]
  }

  object ProjectBadge {
    @inline
    def apply(
        badgeEnabled: js.UndefOr[Boolean] = js.undefined,
        badgeRequestUrl: js.UndefOr[String] = js.undefined
    ): ProjectBadge = {
      val __obj = js.Dynamic.literal()
      badgeEnabled.foreach(__v => __obj.updateDynamic("badgeEnabled")(__v.asInstanceOf[js.Any]))
      badgeRequestUrl.foreach(__v => __obj.updateDynamic("badgeRequestUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectBadge]
    }
  }

  /**
    * Information about the cache for the build project.
    */
  @js.native
  trait ProjectCache extends js.Object {
    var `type`: CacheType
    var location: js.UndefOr[String]
    var modes: js.UndefOr[ProjectCacheModes]
  }

  object ProjectCache {
    @inline
    def apply(
        `type`: CacheType,
        location: js.UndefOr[String] = js.undefined,
        modes: js.UndefOr[ProjectCacheModes] = js.undefined
    ): ProjectCache = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      modes.foreach(__v => __obj.updateDynamic("modes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectCache]
    }
  }

  /**
    * Information about the build environment of the build project.
    */
  @js.native
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

  object ProjectEnvironment {
    @inline
    def apply(
        computeType: ComputeType,
        image: NonEmptyString,
        `type`: EnvironmentType,
        certificate: js.UndefOr[String] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        imagePullCredentialsType: js.UndefOr[ImagePullCredentialsType] = js.undefined,
        privilegedMode: js.UndefOr[WrapperBoolean] = js.undefined,
        registryCredential: js.UndefOr[RegistryCredential] = js.undefined
    ): ProjectEnvironment = {
      val __obj = js.Dynamic.literal(
        "computeType" -> computeType.asInstanceOf[js.Any],
        "image"       -> image.asInstanceOf[js.Any],
        "type"        -> `type`.asInstanceOf[js.Any]
      )

      certificate.foreach(__v => __obj.updateDynamic("certificate")(__v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      imagePullCredentialsType.foreach(__v => __obj.updateDynamic("imagePullCredentialsType")(__v.asInstanceOf[js.Any]))
      privilegedMode.foreach(__v => __obj.updateDynamic("privilegedMode")(__v.asInstanceOf[js.Any]))
      registryCredential.foreach(__v => __obj.updateDynamic("registryCredential")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectEnvironment]
    }
  }

  /**
    * Information about a file system created by Amazon Elastic File System (EFS). For more information, see [[https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html|What Is Amazon Elastic File System?]]
    */
  @js.native
  trait ProjectFileSystemLocation extends js.Object {
    var identifier: js.UndefOr[String]
    var location: js.UndefOr[String]
    var mountOptions: js.UndefOr[String]
    var mountPoint: js.UndefOr[String]
    var `type`: js.UndefOr[FileSystemType]
  }

  object ProjectFileSystemLocation {
    @inline
    def apply(
        identifier: js.UndefOr[String] = js.undefined,
        location: js.UndefOr[String] = js.undefined,
        mountOptions: js.UndefOr[String] = js.undefined,
        mountPoint: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[FileSystemType] = js.undefined
    ): ProjectFileSystemLocation = {
      val __obj = js.Dynamic.literal()
      identifier.foreach(__v => __obj.updateDynamic("identifier")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      mountOptions.foreach(__v => __obj.updateDynamic("mountOptions")(__v.asInstanceOf[js.Any]))
      mountPoint.foreach(__v => __obj.updateDynamic("mountPoint")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectFileSystemLocation]
    }
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

  object ProjectSource {
    @inline
    def apply(
        `type`: SourceType,
        auth: js.UndefOr[SourceAuth] = js.undefined,
        buildspec: js.UndefOr[String] = js.undefined,
        gitCloneDepth: js.UndefOr[GitCloneDepth] = js.undefined,
        gitSubmodulesConfig: js.UndefOr[GitSubmodulesConfig] = js.undefined,
        insecureSsl: js.UndefOr[WrapperBoolean] = js.undefined,
        location: js.UndefOr[String] = js.undefined,
        reportBuildStatus: js.UndefOr[WrapperBoolean] = js.undefined,
        sourceIdentifier: js.UndefOr[String] = js.undefined
    ): ProjectSource = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      auth.foreach(__v => __obj.updateDynamic("auth")(__v.asInstanceOf[js.Any]))
      buildspec.foreach(__v => __obj.updateDynamic("buildspec")(__v.asInstanceOf[js.Any]))
      gitCloneDepth.foreach(__v => __obj.updateDynamic("gitCloneDepth")(__v.asInstanceOf[js.Any]))
      gitSubmodulesConfig.foreach(__v => __obj.updateDynamic("gitSubmodulesConfig")(__v.asInstanceOf[js.Any]))
      insecureSsl.foreach(__v => __obj.updateDynamic("insecureSsl")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      reportBuildStatus.foreach(__v => __obj.updateDynamic("reportBuildStatus")(__v.asInstanceOf[js.Any]))
      sourceIdentifier.foreach(__v => __obj.updateDynamic("sourceIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectSource]
    }
  }

  /**
    * A source identifier and its corresponding version.
    */
  @js.native
  trait ProjectSourceVersion extends js.Object {
    var sourceIdentifier: String
    var sourceVersion: String
  }

  object ProjectSourceVersion {
    @inline
    def apply(
        sourceIdentifier: String,
        sourceVersion: String
    ): ProjectSourceVersion = {
      val __obj = js.Dynamic.literal(
        "sourceIdentifier" -> sourceIdentifier.asInstanceOf[js.Any],
        "sourceVersion"    -> sourceVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ProjectSourceVersion]
    }
  }

  @js.native
  trait PutResourcePolicyInput extends js.Object {
    var policy: NonEmptyString
    var resourceArn: NonEmptyString
  }

  object PutResourcePolicyInput {
    @inline
    def apply(
        policy: NonEmptyString,
        resourceArn: NonEmptyString
    ): PutResourcePolicyInput = {
      val __obj = js.Dynamic.literal(
        "policy"      -> policy.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutResourcePolicyInput]
    }
  }

  @js.native
  trait PutResourcePolicyOutput extends js.Object {
    var resourceArn: js.UndefOr[NonEmptyString]
  }

  object PutResourcePolicyOutput {
    @inline
    def apply(
        resourceArn: js.UndefOr[NonEmptyString] = js.undefined
    ): PutResourcePolicyOutput = {
      val __obj = js.Dynamic.literal()
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyOutput]
    }
  }

  /**
    * Information about credentials that provide access to a private Docker registry. When this is set:
    * * <code>imagePullCredentialsType</code> must be set to <code>SERVICE_ROLE</code>.
    *  * images cannot be curated or an Amazon ECR image.
    * For more information, see [[https://docs.aws.amazon.com/codebuild/latest/userguide/sample-private-registry.html|Private Registry with AWS Secrets Manager Sample for AWS CodeBuild]].
    */
  @js.native
  trait RegistryCredential extends js.Object {
    var credential: NonEmptyString
    var credentialProvider: CredentialProviderType
  }

  object RegistryCredential {
    @inline
    def apply(
        credential: NonEmptyString,
        credentialProvider: CredentialProviderType
    ): RegistryCredential = {
      val __obj = js.Dynamic.literal(
        "credential"         -> credential.asInstanceOf[js.Any],
        "credentialProvider" -> credentialProvider.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegistryCredential]
    }
  }

  /**
    * Information about the results from running a series of test cases during the run of a build project. The test cases are specified in the buildspec for the build project using one or more paths to the test case files. You can specify any type of tests you want, such as unit tests, integration tests, and functional tests.
    */
  @js.native
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

  object Report {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        created: js.UndefOr[Timestamp] = js.undefined,
        executionId: js.UndefOr[String] = js.undefined,
        expired: js.UndefOr[Timestamp] = js.undefined,
        exportConfig: js.UndefOr[ReportExportConfig] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        reportGroupArn: js.UndefOr[NonEmptyString] = js.undefined,
        status: js.UndefOr[ReportStatusType] = js.undefined,
        testSummary: js.UndefOr[TestReportSummary] = js.undefined,
        truncated: js.UndefOr[WrapperBoolean] = js.undefined,
        `type`: js.UndefOr[ReportType] = js.undefined
    ): Report = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      executionId.foreach(__v => __obj.updateDynamic("executionId")(__v.asInstanceOf[js.Any]))
      expired.foreach(__v => __obj.updateDynamic("expired")(__v.asInstanceOf[js.Any]))
      exportConfig.foreach(__v => __obj.updateDynamic("exportConfig")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      reportGroupArn.foreach(__v => __obj.updateDynamic("reportGroupArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      testSummary.foreach(__v => __obj.updateDynamic("testSummary")(__v.asInstanceOf[js.Any]))
      truncated.foreach(__v => __obj.updateDynamic("truncated")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Report]
    }
  }

  /**
    * Information about the location where the run of a report is exported.
    */
  @js.native
  trait ReportExportConfig extends js.Object {
    var exportConfigType: js.UndefOr[ReportExportConfigType]
    var s3Destination: js.UndefOr[S3ReportExportConfig]
  }

  object ReportExportConfig {
    @inline
    def apply(
        exportConfigType: js.UndefOr[ReportExportConfigType] = js.undefined,
        s3Destination: js.UndefOr[S3ReportExportConfig] = js.undefined
    ): ReportExportConfig = {
      val __obj = js.Dynamic.literal()
      exportConfigType.foreach(__v => __obj.updateDynamic("exportConfigType")(__v.asInstanceOf[js.Any]))
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportExportConfig]
    }
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
  trait ReportFilter extends js.Object {
    var status: js.UndefOr[ReportStatusType]
  }

  object ReportFilter {
    @inline
    def apply(
        status: js.UndefOr[ReportStatusType] = js.undefined
    ): ReportFilter = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportFilter]
    }
  }

  /**
    * A series of reports. Each report contains information about the results from running a series of test cases. You specify the test cases for a report group in the buildspec for a build project using one or more paths to the test case files.
    */
  @js.native
  trait ReportGroup extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var created: js.UndefOr[Timestamp]
    var exportConfig: js.UndefOr[ReportExportConfig]
    var lastModified: js.UndefOr[Timestamp]
    var name: js.UndefOr[ReportGroupName]
    var `type`: js.UndefOr[ReportType]
  }

  object ReportGroup {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        created: js.UndefOr[Timestamp] = js.undefined,
        exportConfig: js.UndefOr[ReportExportConfig] = js.undefined,
        lastModified: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[ReportGroupName] = js.undefined,
        `type`: js.UndefOr[ReportType] = js.undefined
    ): ReportGroup = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      exportConfig.foreach(__v => __obj.updateDynamic("exportConfig")(__v.asInstanceOf[js.Any]))
      lastModified.foreach(__v => __obj.updateDynamic("lastModified")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportGroup]
    }
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
  trait S3LogsConfig extends js.Object {
    var status: LogsConfigStatusType
    var encryptionDisabled: js.UndefOr[WrapperBoolean]
    var location: js.UndefOr[String]
  }

  object S3LogsConfig {
    @inline
    def apply(
        status: LogsConfigStatusType,
        encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
        location: js.UndefOr[String] = js.undefined
    ): S3LogsConfig = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      encryptionDisabled.foreach(__v => __obj.updateDynamic("encryptionDisabled")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3LogsConfig]
    }
  }

  /**
    * Information about the S3 bucket where the raw data of a report are exported.
    */
  @js.native
  trait S3ReportExportConfig extends js.Object {
    var bucket: js.UndefOr[NonEmptyString]
    var encryptionDisabled: js.UndefOr[WrapperBoolean]
    var encryptionKey: js.UndefOr[NonEmptyString]
    var packaging: js.UndefOr[ReportPackagingType]
    var path: js.UndefOr[String]
  }

  object S3ReportExportConfig {
    @inline
    def apply(
        bucket: js.UndefOr[NonEmptyString] = js.undefined,
        encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
        encryptionKey: js.UndefOr[NonEmptyString] = js.undefined,
        packaging: js.UndefOr[ReportPackagingType] = js.undefined,
        path: js.UndefOr[String] = js.undefined
    ): S3ReportExportConfig = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      encryptionDisabled.foreach(__v => __obj.updateDynamic("encryptionDisabled")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      packaging.foreach(__v => __obj.updateDynamic("packaging")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ReportExportConfig]
    }
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
  trait SourceAuth extends js.Object {
    var `type`: SourceAuthType
    var resource: js.UndefOr[String]
  }

  object SourceAuth {
    @inline
    def apply(
        `type`: SourceAuthType,
        resource: js.UndefOr[String] = js.undefined
    ): SourceAuth = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      resource.foreach(__v => __obj.updateDynamic("resource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceAuth]
    }
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
  trait SourceCredentialsInfo extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var authType: js.UndefOr[AuthType]
    var serverType: js.UndefOr[ServerType]
  }

  object SourceCredentialsInfo {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        authType: js.UndefOr[AuthType] = js.undefined,
        serverType: js.UndefOr[ServerType] = js.undefined
    ): SourceCredentialsInfo = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      authType.foreach(__v => __obj.updateDynamic("authType")(__v.asInstanceOf[js.Any]))
      serverType.foreach(__v => __obj.updateDynamic("serverType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceCredentialsInfo]
    }
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

  object StartBuildInput {
    @inline
    def apply(
        projectName: NonEmptyString,
        artifactsOverride: js.UndefOr[ProjectArtifacts] = js.undefined,
        buildspecOverride: js.UndefOr[String] = js.undefined,
        cacheOverride: js.UndefOr[ProjectCache] = js.undefined,
        certificateOverride: js.UndefOr[String] = js.undefined,
        computeTypeOverride: js.UndefOr[ComputeType] = js.undefined,
        encryptionKeyOverride: js.UndefOr[NonEmptyString] = js.undefined,
        environmentTypeOverride: js.UndefOr[EnvironmentType] = js.undefined,
        environmentVariablesOverride: js.UndefOr[EnvironmentVariables] = js.undefined,
        gitCloneDepthOverride: js.UndefOr[GitCloneDepth] = js.undefined,
        gitSubmodulesConfigOverride: js.UndefOr[GitSubmodulesConfig] = js.undefined,
        idempotencyToken: js.UndefOr[String] = js.undefined,
        imageOverride: js.UndefOr[NonEmptyString] = js.undefined,
        imagePullCredentialsTypeOverride: js.UndefOr[ImagePullCredentialsType] = js.undefined,
        insecureSslOverride: js.UndefOr[WrapperBoolean] = js.undefined,
        logsConfigOverride: js.UndefOr[LogsConfig] = js.undefined,
        privilegedModeOverride: js.UndefOr[WrapperBoolean] = js.undefined,
        queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined,
        registryCredentialOverride: js.UndefOr[RegistryCredential] = js.undefined,
        reportBuildStatusOverride: js.UndefOr[WrapperBoolean] = js.undefined,
        secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList] = js.undefined,
        secondarySourcesOverride: js.UndefOr[ProjectSources] = js.undefined,
        secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined,
        serviceRoleOverride: js.UndefOr[NonEmptyString] = js.undefined,
        sourceAuthOverride: js.UndefOr[SourceAuth] = js.undefined,
        sourceLocationOverride: js.UndefOr[String] = js.undefined,
        sourceTypeOverride: js.UndefOr[SourceType] = js.undefined,
        sourceVersion: js.UndefOr[String] = js.undefined,
        timeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined
    ): StartBuildInput = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      artifactsOverride.foreach(__v => __obj.updateDynamic("artifactsOverride")(__v.asInstanceOf[js.Any]))
      buildspecOverride.foreach(__v => __obj.updateDynamic("buildspecOverride")(__v.asInstanceOf[js.Any]))
      cacheOverride.foreach(__v => __obj.updateDynamic("cacheOverride")(__v.asInstanceOf[js.Any]))
      certificateOverride.foreach(__v => __obj.updateDynamic("certificateOverride")(__v.asInstanceOf[js.Any]))
      computeTypeOverride.foreach(__v => __obj.updateDynamic("computeTypeOverride")(__v.asInstanceOf[js.Any]))
      encryptionKeyOverride.foreach(__v => __obj.updateDynamic("encryptionKeyOverride")(__v.asInstanceOf[js.Any]))
      environmentTypeOverride.foreach(__v => __obj.updateDynamic("environmentTypeOverride")(__v.asInstanceOf[js.Any]))
      environmentVariablesOverride.foreach(__v =>
        __obj.updateDynamic("environmentVariablesOverride")(__v.asInstanceOf[js.Any])
      )
      gitCloneDepthOverride.foreach(__v => __obj.updateDynamic("gitCloneDepthOverride")(__v.asInstanceOf[js.Any]))
      gitSubmodulesConfigOverride.foreach(__v =>
        __obj.updateDynamic("gitSubmodulesConfigOverride")(__v.asInstanceOf[js.Any])
      )
      idempotencyToken.foreach(__v => __obj.updateDynamic("idempotencyToken")(__v.asInstanceOf[js.Any]))
      imageOverride.foreach(__v => __obj.updateDynamic("imageOverride")(__v.asInstanceOf[js.Any]))
      imagePullCredentialsTypeOverride.foreach(__v =>
        __obj.updateDynamic("imagePullCredentialsTypeOverride")(__v.asInstanceOf[js.Any])
      )
      insecureSslOverride.foreach(__v => __obj.updateDynamic("insecureSslOverride")(__v.asInstanceOf[js.Any]))
      logsConfigOverride.foreach(__v => __obj.updateDynamic("logsConfigOverride")(__v.asInstanceOf[js.Any]))
      privilegedModeOverride.foreach(__v => __obj.updateDynamic("privilegedModeOverride")(__v.asInstanceOf[js.Any]))
      queuedTimeoutInMinutesOverride.foreach(__v =>
        __obj.updateDynamic("queuedTimeoutInMinutesOverride")(__v.asInstanceOf[js.Any])
      )
      registryCredentialOverride.foreach(__v =>
        __obj.updateDynamic("registryCredentialOverride")(__v.asInstanceOf[js.Any])
      )
      reportBuildStatusOverride.foreach(__v =>
        __obj.updateDynamic("reportBuildStatusOverride")(__v.asInstanceOf[js.Any])
      )
      secondaryArtifactsOverride.foreach(__v =>
        __obj.updateDynamic("secondaryArtifactsOverride")(__v.asInstanceOf[js.Any])
      )
      secondarySourcesOverride.foreach(__v => __obj.updateDynamic("secondarySourcesOverride")(__v.asInstanceOf[js.Any]))
      secondarySourcesVersionOverride.foreach(__v =>
        __obj.updateDynamic("secondarySourcesVersionOverride")(__v.asInstanceOf[js.Any])
      )
      serviceRoleOverride.foreach(__v => __obj.updateDynamic("serviceRoleOverride")(__v.asInstanceOf[js.Any]))
      sourceAuthOverride.foreach(__v => __obj.updateDynamic("sourceAuthOverride")(__v.asInstanceOf[js.Any]))
      sourceLocationOverride.foreach(__v => __obj.updateDynamic("sourceLocationOverride")(__v.asInstanceOf[js.Any]))
      sourceTypeOverride.foreach(__v => __obj.updateDynamic("sourceTypeOverride")(__v.asInstanceOf[js.Any]))
      sourceVersion.foreach(__v => __obj.updateDynamic("sourceVersion")(__v.asInstanceOf[js.Any]))
      timeoutInMinutesOverride.foreach(__v => __obj.updateDynamic("timeoutInMinutesOverride")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBuildInput]
    }
  }

  @js.native
  trait StartBuildOutput extends js.Object {
    var build: js.UndefOr[Build]
  }

  object StartBuildOutput {
    @inline
    def apply(
        build: js.UndefOr[Build] = js.undefined
    ): StartBuildOutput = {
      val __obj = js.Dynamic.literal()
      build.foreach(__v => __obj.updateDynamic("build")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBuildOutput]
    }
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
  trait StopBuildInput extends js.Object {
    var id: NonEmptyString
  }

  object StopBuildInput {
    @inline
    def apply(
        id: NonEmptyString
    ): StopBuildInput = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopBuildInput]
    }
  }

  @js.native
  trait StopBuildOutput extends js.Object {
    var build: js.UndefOr[Build]
  }

  object StopBuildOutput {
    @inline
    def apply(
        build: js.UndefOr[Build] = js.undefined
    ): StopBuildOutput = {
      val __obj = js.Dynamic.literal()
      build.foreach(__v => __obj.updateDynamic("build")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopBuildOutput]
    }
  }

  /**
    * A tag, consisting of a key and a value.
    *  This tag is available for use by AWS services that support tags in AWS CodeBuild.
    */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[KeyInput]
    var value: js.UndefOr[ValueInput]
  }

  object Tag {
    @inline
    def apply(
        key: js.UndefOr[KeyInput] = js.undefined,
        value: js.UndefOr[ValueInput] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * Information about a test case created using a framework such as NUnit or Cucumber. A test case might be a unit test or a configuration test.
    */
  @js.native
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

  object TestCase {
    @inline
    def apply(
        durationInNanoSeconds: js.UndefOr[WrapperLong] = js.undefined,
        expired: js.UndefOr[Timestamp] = js.undefined,
        message: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        prefix: js.UndefOr[String] = js.undefined,
        reportArn: js.UndefOr[NonEmptyString] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        testRawDataPath: js.UndefOr[String] = js.undefined
    ): TestCase = {
      val __obj = js.Dynamic.literal()
      durationInNanoSeconds.foreach(__v => __obj.updateDynamic("durationInNanoSeconds")(__v.asInstanceOf[js.Any]))
      expired.foreach(__v => __obj.updateDynamic("expired")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      reportArn.foreach(__v => __obj.updateDynamic("reportArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      testRawDataPath.foreach(__v => __obj.updateDynamic("testRawDataPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestCase]
    }
  }

  /**
    * A filter used to return specific types of test cases.
    */
  @js.native
  trait TestCaseFilter extends js.Object {
    var status: js.UndefOr[String]
  }

  object TestCaseFilter {
    @inline
    def apply(
        status: js.UndefOr[String] = js.undefined
    ): TestCaseFilter = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestCaseFilter]
    }
  }

  /**
    * Information about a test report.
    */
  @js.native
  trait TestReportSummary extends js.Object {
    var durationInNanoSeconds: WrapperLong
    var statusCounts: ReportStatusCounts
    var total: WrapperInt
  }

  object TestReportSummary {
    @inline
    def apply(
        durationInNanoSeconds: WrapperLong,
        statusCounts: ReportStatusCounts,
        total: WrapperInt
    ): TestReportSummary = {
      val __obj = js.Dynamic.literal(
        "durationInNanoSeconds" -> durationInNanoSeconds.asInstanceOf[js.Any],
        "statusCounts"          -> statusCounts.asInstanceOf[js.Any],
        "total"                 -> total.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TestReportSummary]
    }
  }

  @js.native
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

  object UpdateProjectInput {
    @inline
    def apply(
        name: NonEmptyString,
        artifacts: js.UndefOr[ProjectArtifacts] = js.undefined,
        badgeEnabled: js.UndefOr[WrapperBoolean] = js.undefined,
        cache: js.UndefOr[ProjectCache] = js.undefined,
        description: js.UndefOr[ProjectDescription] = js.undefined,
        encryptionKey: js.UndefOr[NonEmptyString] = js.undefined,
        environment: js.UndefOr[ProjectEnvironment] = js.undefined,
        fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined,
        logsConfig: js.UndefOr[LogsConfig] = js.undefined,
        queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
        secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined,
        secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined,
        secondarySources: js.UndefOr[ProjectSources] = js.undefined,
        serviceRole: js.UndefOr[NonEmptyString] = js.undefined,
        source: js.UndefOr[ProjectSource] = js.undefined,
        sourceVersion: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
        vpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): UpdateProjectInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      artifacts.foreach(__v => __obj.updateDynamic("artifacts")(__v.asInstanceOf[js.Any]))
      badgeEnabled.foreach(__v => __obj.updateDynamic("badgeEnabled")(__v.asInstanceOf[js.Any]))
      cache.foreach(__v => __obj.updateDynamic("cache")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      fileSystemLocations.foreach(__v => __obj.updateDynamic("fileSystemLocations")(__v.asInstanceOf[js.Any]))
      logsConfig.foreach(__v => __obj.updateDynamic("logsConfig")(__v.asInstanceOf[js.Any]))
      queuedTimeoutInMinutes.foreach(__v => __obj.updateDynamic("queuedTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      secondaryArtifacts.foreach(__v => __obj.updateDynamic("secondaryArtifacts")(__v.asInstanceOf[js.Any]))
      secondarySourceVersions.foreach(__v => __obj.updateDynamic("secondarySourceVersions")(__v.asInstanceOf[js.Any]))
      secondarySources.foreach(__v => __obj.updateDynamic("secondarySources")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      sourceVersion.foreach(__v => __obj.updateDynamic("sourceVersion")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      timeoutInMinutes.foreach(__v => __obj.updateDynamic("timeoutInMinutes")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectInput]
    }
  }

  @js.native
  trait UpdateProjectOutput extends js.Object {
    var project: js.UndefOr[Project]
  }

  object UpdateProjectOutput {
    @inline
    def apply(
        project: js.UndefOr[Project] = js.undefined
    ): UpdateProjectOutput = {
      val __obj = js.Dynamic.literal()
      project.foreach(__v => __obj.updateDynamic("project")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectOutput]
    }
  }

  @js.native
  trait UpdateReportGroupInput extends js.Object {
    var arn: NonEmptyString
    var exportConfig: js.UndefOr[ReportExportConfig]
  }

  object UpdateReportGroupInput {
    @inline
    def apply(
        arn: NonEmptyString,
        exportConfig: js.UndefOr[ReportExportConfig] = js.undefined
    ): UpdateReportGroupInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      exportConfig.foreach(__v => __obj.updateDynamic("exportConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReportGroupInput]
    }
  }

  @js.native
  trait UpdateReportGroupOutput extends js.Object {
    var reportGroup: js.UndefOr[ReportGroup]
  }

  object UpdateReportGroupOutput {
    @inline
    def apply(
        reportGroup: js.UndefOr[ReportGroup] = js.undefined
    ): UpdateReportGroupOutput = {
      val __obj = js.Dynamic.literal()
      reportGroup.foreach(__v => __obj.updateDynamic("reportGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReportGroupOutput]
    }
  }

  @js.native
  trait UpdateWebhookInput extends js.Object {
    var projectName: ProjectName
    var branchFilter: js.UndefOr[String]
    var filterGroups: js.UndefOr[FilterGroups]
    var rotateSecret: js.UndefOr[Boolean]
  }

  object UpdateWebhookInput {
    @inline
    def apply(
        projectName: ProjectName,
        branchFilter: js.UndefOr[String] = js.undefined,
        filterGroups: js.UndefOr[FilterGroups] = js.undefined,
        rotateSecret: js.UndefOr[Boolean] = js.undefined
    ): UpdateWebhookInput = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      branchFilter.foreach(__v => __obj.updateDynamic("branchFilter")(__v.asInstanceOf[js.Any]))
      filterGroups.foreach(__v => __obj.updateDynamic("filterGroups")(__v.asInstanceOf[js.Any]))
      rotateSecret.foreach(__v => __obj.updateDynamic("rotateSecret")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWebhookInput]
    }
  }

  @js.native
  trait UpdateWebhookOutput extends js.Object {
    var webhook: js.UndefOr[Webhook]
  }

  object UpdateWebhookOutput {
    @inline
    def apply(
        webhook: js.UndefOr[Webhook] = js.undefined
    ): UpdateWebhookOutput = {
      val __obj = js.Dynamic.literal()
      webhook.foreach(__v => __obj.updateDynamic("webhook")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWebhookOutput]
    }
  }

  /**
    * Information about the VPC configuration that AWS CodeBuild accesses.
    */
  @js.native
  trait VpcConfig extends js.Object {
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var subnets: js.UndefOr[Subnets]
    var vpcId: js.UndefOr[NonEmptyString]
  }

  object VpcConfig {
    @inline
    def apply(
        securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        subnets: js.UndefOr[Subnets] = js.undefined,
        vpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): VpcConfig = {
      val __obj = js.Dynamic.literal()
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnets.foreach(__v => __obj.updateDynamic("subnets")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfig]
    }
  }

  /**
    * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
    */
  @js.native
  trait Webhook extends js.Object {
    var branchFilter: js.UndefOr[String]
    var filterGroups: js.UndefOr[FilterGroups]
    var lastModifiedSecret: js.UndefOr[Timestamp]
    var payloadUrl: js.UndefOr[NonEmptyString]
    var secret: js.UndefOr[NonEmptyString]
    var url: js.UndefOr[NonEmptyString]
  }

  object Webhook {
    @inline
    def apply(
        branchFilter: js.UndefOr[String] = js.undefined,
        filterGroups: js.UndefOr[FilterGroups] = js.undefined,
        lastModifiedSecret: js.UndefOr[Timestamp] = js.undefined,
        payloadUrl: js.UndefOr[NonEmptyString] = js.undefined,
        secret: js.UndefOr[NonEmptyString] = js.undefined,
        url: js.UndefOr[NonEmptyString] = js.undefined
    ): Webhook = {
      val __obj = js.Dynamic.literal()
      branchFilter.foreach(__v => __obj.updateDynamic("branchFilter")(__v.asInstanceOf[js.Any]))
      filterGroups.foreach(__v => __obj.updateDynamic("filterGroups")(__v.asInstanceOf[js.Any]))
      lastModifiedSecret.foreach(__v => __obj.updateDynamic("lastModifiedSecret")(__v.asInstanceOf[js.Any]))
      payloadUrl.foreach(__v => __obj.updateDynamic("payloadUrl")(__v.asInstanceOf[js.Any]))
      secret.foreach(__v => __obj.updateDynamic("secret")(__v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Webhook]
    }
  }

  /**
    * A filter used to determine which webhooks trigger a build.
    */
  @js.native
  trait WebhookFilter extends js.Object {
    var pattern: String
    var `type`: WebhookFilterType
    var excludeMatchedPattern: js.UndefOr[WrapperBoolean]
  }

  object WebhookFilter {
    @inline
    def apply(
        pattern: String,
        `type`: WebhookFilterType,
        excludeMatchedPattern: js.UndefOr[WrapperBoolean] = js.undefined
    ): WebhookFilter = {
      val __obj = js.Dynamic.literal(
        "pattern" -> pattern.asInstanceOf[js.Any],
        "type"    -> `type`.asInstanceOf[js.Any]
      )

      excludeMatchedPattern.foreach(__v => __obj.updateDynamic("excludeMatchedPattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebhookFilter]
    }
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
