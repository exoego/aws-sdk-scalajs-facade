package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object codebuild {
  type BuildArtifactsList = js.Array[BuildArtifacts]
  type BuildBatchIds = js.Array[NonEmptyString]
  type BuildBatchPhases = js.Array[BuildBatchPhase]
  type BuildBatches = js.Array[BuildBatch]
  type BuildGroups = js.Array[BuildGroup]
  type BuildIds = js.Array[NonEmptyString]
  type BuildPhases = js.Array[BuildPhase]
  type BuildReportArns = js.Array[String]
  type BuildSummaries = js.Array[BuildSummary]
  type Builds = js.Array[Build]
  type BuildsNotDeleted = js.Array[BuildNotDeleted]
  type CodeCoverages = js.Array[CodeCoverage]
  type ComputeTypesAllowed = js.Array[NonEmptyString]
  type EnvironmentImages = js.Array[EnvironmentImage]
  type EnvironmentLanguages = js.Array[EnvironmentLanguage]
  type EnvironmentPlatforms = js.Array[EnvironmentPlatform]
  type EnvironmentVariables = js.Array[EnvironmentVariable]
  type ExportedEnvironmentVariables = js.Array[ExportedEnvironmentVariable]
  type FilterGroup = js.Array[WebhookFilter]
  type FilterGroups = js.Array[FilterGroup]
  type GitCloneDepth = Int
  type Identifiers = js.Array[NonEmptyString]
  type ImageVersions = js.Array[String]
  type KeyInput = String
  type NonEmptyString = String
  type NonNegativeInt = Int
  type PageSize = Int
  type Percentage = Double
  type PhaseContexts = js.Array[PhaseContext]
  type ProjectArns = js.Array[NonEmptyString]
  type ProjectArtifactsList = js.Array[ProjectArtifacts]
  type ProjectCacheModes = js.Array[CacheMode]
  type ProjectDescription = String
  type ProjectFileSystemLocations = js.Array[ProjectFileSystemLocation]
  type ProjectName = String
  type ProjectNames = js.Array[NonEmptyString]
  type ProjectSecondarySourceVersions = js.Array[ProjectSourceVersion]
  type ProjectSources = js.Array[ProjectSource]
  type Projects = js.Array[Project]
  type ReportArns = js.Array[NonEmptyString]
  type ReportGroupArns = js.Array[NonEmptyString]
  type ReportGroupName = String
  type ReportGroupTrendRawDataList = js.Array[ReportWithRawData]
  type ReportGroups = js.Array[ReportGroup]
  type ReportStatusCounts = js.Dictionary[WrapperInt]
  type Reports = js.Array[Report]
  type ResolvedSecondaryArtifacts = js.Array[ResolvedArtifact]
  type SecurityGroupIds = js.Array[NonEmptyString]
  type SensitiveNonEmptyString = String
  type SourceCredentialsInfos = js.Array[SourceCredentialsInfo]
  type Subnets = js.Array[NonEmptyString]
  type TagList = js.Array[Tag]
  type TestCases = js.Array[TestCase]
  type TimeOut = Int
  type Timestamp = js.Date
  type ValueInput = String
  type WrapperBoolean = Boolean
  type WrapperInt = Int
  type WrapperLong = Double

  final class CodeBuildOps(private val service: CodeBuild) extends AnyVal {

    @inline def batchDeleteBuildsFuture(params: BatchDeleteBuildsInput): Future[BatchDeleteBuildsOutput] = service.batchDeleteBuilds(params).promise().toFuture
    @inline def batchGetBuildBatchesFuture(params: BatchGetBuildBatchesInput): Future[BatchGetBuildBatchesOutput] = service.batchGetBuildBatches(params).promise().toFuture
    @inline def batchGetBuildsFuture(params: BatchGetBuildsInput): Future[BatchGetBuildsOutput] = service.batchGetBuilds(params).promise().toFuture
    @inline def batchGetProjectsFuture(params: BatchGetProjectsInput): Future[BatchGetProjectsOutput] = service.batchGetProjects(params).promise().toFuture
    @inline def batchGetReportGroupsFuture(params: BatchGetReportGroupsInput): Future[BatchGetReportGroupsOutput] = service.batchGetReportGroups(params).promise().toFuture
    @inline def batchGetReportsFuture(params: BatchGetReportsInput): Future[BatchGetReportsOutput] = service.batchGetReports(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectInput): Future[CreateProjectOutput] = service.createProject(params).promise().toFuture
    @inline def createReportGroupFuture(params: CreateReportGroupInput): Future[CreateReportGroupOutput] = service.createReportGroup(params).promise().toFuture
    @inline def createWebhookFuture(params: CreateWebhookInput): Future[CreateWebhookOutput] = service.createWebhook(params).promise().toFuture
    @inline def deleteBuildBatchFuture(params: DeleteBuildBatchInput): Future[DeleteBuildBatchOutput] = service.deleteBuildBatch(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectInput): Future[DeleteProjectOutput] = service.deleteProject(params).promise().toFuture
    @inline def deleteReportFuture(params: DeleteReportInput): Future[DeleteReportOutput] = service.deleteReport(params).promise().toFuture
    @inline def deleteReportGroupFuture(params: DeleteReportGroupInput): Future[DeleteReportGroupOutput] = service.deleteReportGroup(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyInput): Future[DeleteResourcePolicyOutput] = service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteSourceCredentialsFuture(params: DeleteSourceCredentialsInput): Future[DeleteSourceCredentialsOutput] = service.deleteSourceCredentials(params).promise().toFuture
    @inline def deleteWebhookFuture(params: DeleteWebhookInput): Future[DeleteWebhookOutput] = service.deleteWebhook(params).promise().toFuture
    @inline def describeCodeCoveragesFuture(params: DescribeCodeCoveragesInput): Future[DescribeCodeCoveragesOutput] = service.describeCodeCoverages(params).promise().toFuture
    @inline def describeTestCasesFuture(params: DescribeTestCasesInput): Future[DescribeTestCasesOutput] = service.describeTestCases(params).promise().toFuture
    @inline def getReportGroupTrendFuture(params: GetReportGroupTrendInput): Future[GetReportGroupTrendOutput] = service.getReportGroupTrend(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyInput): Future[GetResourcePolicyOutput] = service.getResourcePolicy(params).promise().toFuture
    @inline def importSourceCredentialsFuture(params: ImportSourceCredentialsInput): Future[ImportSourceCredentialsOutput] = service.importSourceCredentials(params).promise().toFuture
    @inline def invalidateProjectCacheFuture(params: InvalidateProjectCacheInput): Future[InvalidateProjectCacheOutput] = service.invalidateProjectCache(params).promise().toFuture
    @inline def listBuildBatchesForProjectFuture(params: ListBuildBatchesForProjectInput): Future[ListBuildBatchesForProjectOutput] = service.listBuildBatchesForProject(params).promise().toFuture
    @inline def listBuildBatchesFuture(params: ListBuildBatchesInput): Future[ListBuildBatchesOutput] = service.listBuildBatches(params).promise().toFuture
    @inline def listBuildsForProjectFuture(params: ListBuildsForProjectInput): Future[ListBuildsForProjectOutput] = service.listBuildsForProject(params).promise().toFuture
    @inline def listBuildsFuture(params: ListBuildsInput): Future[ListBuildsOutput] = service.listBuilds(params).promise().toFuture
    @inline def listCuratedEnvironmentImagesFuture(params: ListCuratedEnvironmentImagesInput): Future[ListCuratedEnvironmentImagesOutput] = service.listCuratedEnvironmentImages(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsInput): Future[ListProjectsOutput] = service.listProjects(params).promise().toFuture
    @inline def listReportGroupsFuture(params: ListReportGroupsInput): Future[ListReportGroupsOutput] = service.listReportGroups(params).promise().toFuture
    @inline def listReportsForReportGroupFuture(params: ListReportsForReportGroupInput): Future[ListReportsForReportGroupOutput] = service.listReportsForReportGroup(params).promise().toFuture
    @inline def listReportsFuture(params: ListReportsInput): Future[ListReportsOutput] = service.listReports(params).promise().toFuture
    @inline def listSharedProjectsFuture(params: ListSharedProjectsInput): Future[ListSharedProjectsOutput] = service.listSharedProjects(params).promise().toFuture
    @inline def listSharedReportGroupsFuture(params: ListSharedReportGroupsInput): Future[ListSharedReportGroupsOutput] = service.listSharedReportGroups(params).promise().toFuture
    @inline def listSourceCredentialsFuture(params: ListSourceCredentialsInput): Future[ListSourceCredentialsOutput] = service.listSourceCredentials(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyInput): Future[PutResourcePolicyOutput] = service.putResourcePolicy(params).promise().toFuture
    @inline def retryBuildBatchFuture(params: RetryBuildBatchInput): Future[RetryBuildBatchOutput] = service.retryBuildBatch(params).promise().toFuture
    @inline def retryBuildFuture(params: RetryBuildInput): Future[RetryBuildOutput] = service.retryBuild(params).promise().toFuture
    @inline def startBuildBatchFuture(params: StartBuildBatchInput): Future[StartBuildBatchOutput] = service.startBuildBatch(params).promise().toFuture
    @inline def startBuildFuture(params: StartBuildInput): Future[StartBuildOutput] = service.startBuild(params).promise().toFuture
    @inline def stopBuildBatchFuture(params: StopBuildBatchInput): Future[StopBuildBatchOutput] = service.stopBuildBatch(params).promise().toFuture
    @inline def stopBuildFuture(params: StopBuildInput): Future[StopBuildOutput] = service.stopBuild(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectInput): Future[UpdateProjectOutput] = service.updateProject(params).promise().toFuture
    @inline def updateProjectVisibilityFuture(params: UpdateProjectVisibilityInput): Future[UpdateProjectVisibilityOutput] = service.updateProjectVisibility(params).promise().toFuture
    @inline def updateReportGroupFuture(params: UpdateReportGroupInput): Future[UpdateReportGroupOutput] = service.updateReportGroup(params).promise().toFuture
    @inline def updateWebhookFuture(params: UpdateWebhookInput): Future[UpdateWebhookOutput] = service.updateWebhook(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/codebuild", JSImport.Namespace, "AWS.CodeBuild")
  class CodeBuild() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDeleteBuilds(params: BatchDeleteBuildsInput): Request[BatchDeleteBuildsOutput] = js.native
    def batchGetBuildBatches(params: BatchGetBuildBatchesInput): Request[BatchGetBuildBatchesOutput] = js.native
    def batchGetBuilds(params: BatchGetBuildsInput): Request[BatchGetBuildsOutput] = js.native
    def batchGetProjects(params: BatchGetProjectsInput): Request[BatchGetProjectsOutput] = js.native
    def batchGetReportGroups(params: BatchGetReportGroupsInput): Request[BatchGetReportGroupsOutput] = js.native
    def batchGetReports(params: BatchGetReportsInput): Request[BatchGetReportsOutput] = js.native
    def createProject(params: CreateProjectInput): Request[CreateProjectOutput] = js.native
    def createReportGroup(params: CreateReportGroupInput): Request[CreateReportGroupOutput] = js.native
    def createWebhook(params: CreateWebhookInput): Request[CreateWebhookOutput] = js.native
    def deleteBuildBatch(params: DeleteBuildBatchInput): Request[DeleteBuildBatchOutput] = js.native
    def deleteProject(params: DeleteProjectInput): Request[DeleteProjectOutput] = js.native
    def deleteReport(params: DeleteReportInput): Request[DeleteReportOutput] = js.native
    def deleteReportGroup(params: DeleteReportGroupInput): Request[DeleteReportGroupOutput] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyInput): Request[DeleteResourcePolicyOutput] = js.native
    def deleteSourceCredentials(params: DeleteSourceCredentialsInput): Request[DeleteSourceCredentialsOutput] = js.native
    def deleteWebhook(params: DeleteWebhookInput): Request[DeleteWebhookOutput] = js.native
    def describeCodeCoverages(params: DescribeCodeCoveragesInput): Request[DescribeCodeCoveragesOutput] = js.native
    def describeTestCases(params: DescribeTestCasesInput): Request[DescribeTestCasesOutput] = js.native
    def getReportGroupTrend(params: GetReportGroupTrendInput): Request[GetReportGroupTrendOutput] = js.native
    def getResourcePolicy(params: GetResourcePolicyInput): Request[GetResourcePolicyOutput] = js.native
    def importSourceCredentials(params: ImportSourceCredentialsInput): Request[ImportSourceCredentialsOutput] = js.native
    def invalidateProjectCache(params: InvalidateProjectCacheInput): Request[InvalidateProjectCacheOutput] = js.native
    def listBuildBatches(params: ListBuildBatchesInput): Request[ListBuildBatchesOutput] = js.native
    def listBuildBatchesForProject(params: ListBuildBatchesForProjectInput): Request[ListBuildBatchesForProjectOutput] = js.native
    def listBuilds(params: ListBuildsInput): Request[ListBuildsOutput] = js.native
    def listBuildsForProject(params: ListBuildsForProjectInput): Request[ListBuildsForProjectOutput] = js.native
    def listCuratedEnvironmentImages(params: ListCuratedEnvironmentImagesInput): Request[ListCuratedEnvironmentImagesOutput] = js.native
    def listProjects(params: ListProjectsInput): Request[ListProjectsOutput] = js.native
    def listReportGroups(params: ListReportGroupsInput): Request[ListReportGroupsOutput] = js.native
    def listReports(params: ListReportsInput): Request[ListReportsOutput] = js.native
    def listReportsForReportGroup(params: ListReportsForReportGroupInput): Request[ListReportsForReportGroupOutput] = js.native
    def listSharedProjects(params: ListSharedProjectsInput): Request[ListSharedProjectsOutput] = js.native
    def listSharedReportGroups(params: ListSharedReportGroupsInput): Request[ListSharedReportGroupsOutput] = js.native
    def listSourceCredentials(params: ListSourceCredentialsInput): Request[ListSourceCredentialsOutput] = js.native
    def putResourcePolicy(params: PutResourcePolicyInput): Request[PutResourcePolicyOutput] = js.native
    def retryBuild(params: RetryBuildInput): Request[RetryBuildOutput] = js.native
    def retryBuildBatch(params: RetryBuildBatchInput): Request[RetryBuildBatchOutput] = js.native
    def startBuild(params: StartBuildInput): Request[StartBuildOutput] = js.native
    def startBuildBatch(params: StartBuildBatchInput): Request[StartBuildBatchOutput] = js.native
    def stopBuild(params: StopBuildInput): Request[StopBuildOutput] = js.native
    def stopBuildBatch(params: StopBuildBatchInput): Request[StopBuildBatchOutput] = js.native
    def updateProject(params: UpdateProjectInput): Request[UpdateProjectOutput] = js.native
    def updateProjectVisibility(params: UpdateProjectVisibilityInput): Request[UpdateProjectVisibilityOutput] = js.native
    def updateReportGroup(params: UpdateReportGroupInput): Request[UpdateReportGroupOutput] = js.native
    def updateWebhook(params: UpdateWebhookInput): Request[UpdateWebhookOutput] = js.native
  }
  object CodeBuild {
    @inline implicit def toOps(service: CodeBuild): CodeBuildOps = {
      new CodeBuildOps(service)
    }
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
  trait BatchGetBuildBatchesInput extends js.Object {
    var ids: BuildBatchIds
  }

  object BatchGetBuildBatchesInput {
    @inline
    def apply(
        ids: BuildBatchIds
    ): BatchGetBuildBatchesInput = {
      val __obj = js.Dynamic.literal(
        "ids" -> ids.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetBuildBatchesInput]
    }
  }

  @js.native
  trait BatchGetBuildBatchesOutput extends js.Object {
    var buildBatches: js.UndefOr[BuildBatches]
    var buildBatchesNotFound: js.UndefOr[BuildBatchIds]
  }

  object BatchGetBuildBatchesOutput {
    @inline
    def apply(
        buildBatches: js.UndefOr[BuildBatches] = js.undefined,
        buildBatchesNotFound: js.UndefOr[BuildBatchIds] = js.undefined
    ): BatchGetBuildBatchesOutput = {
      val __obj = js.Dynamic.literal()
      buildBatches.foreach(__v => __obj.updateDynamic("buildBatches")(__v.asInstanceOf[js.Any]))
      buildBatchesNotFound.foreach(__v => __obj.updateDynamic("buildBatchesNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetBuildBatchesOutput]
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

  /** Specifies restrictions for the batch build.
    */
  @js.native
  trait BatchRestrictions extends js.Object {
    var computeTypesAllowed: js.UndefOr[ComputeTypesAllowed]
    var maximumBuildsAllowed: js.UndefOr[WrapperInt]
  }

  object BatchRestrictions {
    @inline
    def apply(
        computeTypesAllowed: js.UndefOr[ComputeTypesAllowed] = js.undefined,
        maximumBuildsAllowed: js.UndefOr[WrapperInt] = js.undefined
    ): BatchRestrictions = {
      val __obj = js.Dynamic.literal()
      computeTypesAllowed.foreach(__v => __obj.updateDynamic("computeTypesAllowed")(__v.asInstanceOf[js.Any]))
      maximumBuildsAllowed.foreach(__v => __obj.updateDynamic("maximumBuildsAllowed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchRestrictions]
    }
  }

  /** Information about a build.
    */
  @js.native
  trait Build extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var artifacts: js.UndefOr[BuildArtifacts]
    var buildBatchArn: js.UndefOr[String]
    var buildComplete: js.UndefOr[Boolean]
    var buildNumber: js.UndefOr[WrapperLong]
    var buildStatus: js.UndefOr[StatusType]
    var cache: js.UndefOr[ProjectCache]
    var currentPhase: js.UndefOr[String]
    var debugSession: js.UndefOr[DebugSession]
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
        buildBatchArn: js.UndefOr[String] = js.undefined,
        buildComplete: js.UndefOr[Boolean] = js.undefined,
        buildNumber: js.UndefOr[WrapperLong] = js.undefined,
        buildStatus: js.UndefOr[StatusType] = js.undefined,
        cache: js.UndefOr[ProjectCache] = js.undefined,
        currentPhase: js.UndefOr[String] = js.undefined,
        debugSession: js.UndefOr[DebugSession] = js.undefined,
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
      buildBatchArn.foreach(__v => __obj.updateDynamic("buildBatchArn")(__v.asInstanceOf[js.Any]))
      buildComplete.foreach(__v => __obj.updateDynamic("buildComplete")(__v.asInstanceOf[js.Any]))
      buildNumber.foreach(__v => __obj.updateDynamic("buildNumber")(__v.asInstanceOf[js.Any]))
      buildStatus.foreach(__v => __obj.updateDynamic("buildStatus")(__v.asInstanceOf[js.Any]))
      cache.foreach(__v => __obj.updateDynamic("cache")(__v.asInstanceOf[js.Any]))
      currentPhase.foreach(__v => __obj.updateDynamic("currentPhase")(__v.asInstanceOf[js.Any]))
      debugSession.foreach(__v => __obj.updateDynamic("debugSession")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      exportedEnvironmentVariables.foreach(__v => __obj.updateDynamic("exportedEnvironmentVariables")(__v.asInstanceOf[js.Any]))
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

  /** Information about build output artifacts.
    */
  @js.native
  trait BuildArtifacts extends js.Object {
    var artifactIdentifier: js.UndefOr[String]
    var bucketOwnerAccess: js.UndefOr[BucketOwnerAccess]
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
        bucketOwnerAccess: js.UndefOr[BucketOwnerAccess] = js.undefined,
        encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
        location: js.UndefOr[String] = js.undefined,
        md5sum: js.UndefOr[String] = js.undefined,
        overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined,
        sha256sum: js.UndefOr[String] = js.undefined
    ): BuildArtifacts = {
      val __obj = js.Dynamic.literal()
      artifactIdentifier.foreach(__v => __obj.updateDynamic("artifactIdentifier")(__v.asInstanceOf[js.Any]))
      bucketOwnerAccess.foreach(__v => __obj.updateDynamic("bucketOwnerAccess")(__v.asInstanceOf[js.Any]))
      encryptionDisabled.foreach(__v => __obj.updateDynamic("encryptionDisabled")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      md5sum.foreach(__v => __obj.updateDynamic("md5sum")(__v.asInstanceOf[js.Any]))
      overrideArtifactName.foreach(__v => __obj.updateDynamic("overrideArtifactName")(__v.asInstanceOf[js.Any]))
      sha256sum.foreach(__v => __obj.updateDynamic("sha256sum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildArtifacts]
    }
  }

  /** Contains information about a batch build.
    */
  @js.native
  trait BuildBatch extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var artifacts: js.UndefOr[BuildArtifacts]
    var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig]
    var buildBatchNumber: js.UndefOr[WrapperLong]
    var buildBatchStatus: js.UndefOr[StatusType]
    var buildGroups: js.UndefOr[BuildGroups]
    var buildTimeoutInMinutes: js.UndefOr[WrapperInt]
    var cache: js.UndefOr[ProjectCache]
    var complete: js.UndefOr[Boolean]
    var currentPhase: js.UndefOr[String]
    var debugSessionEnabled: js.UndefOr[WrapperBoolean]
    var encryptionKey: js.UndefOr[NonEmptyString]
    var endTime: js.UndefOr[Timestamp]
    var environment: js.UndefOr[ProjectEnvironment]
    var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations]
    var id: js.UndefOr[NonEmptyString]
    var initiator: js.UndefOr[String]
    var logConfig: js.UndefOr[LogsConfig]
    var phases: js.UndefOr[BuildBatchPhases]
    var projectName: js.UndefOr[NonEmptyString]
    var queuedTimeoutInMinutes: js.UndefOr[WrapperInt]
    var resolvedSourceVersion: js.UndefOr[NonEmptyString]
    var secondaryArtifacts: js.UndefOr[BuildArtifactsList]
    var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions]
    var secondarySources: js.UndefOr[ProjectSources]
    var serviceRole: js.UndefOr[NonEmptyString]
    var source: js.UndefOr[ProjectSource]
    var sourceVersion: js.UndefOr[NonEmptyString]
    var startTime: js.UndefOr[Timestamp]
    var vpcConfig: js.UndefOr[VpcConfig]
  }

  object BuildBatch {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        artifacts: js.UndefOr[BuildArtifacts] = js.undefined,
        buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.undefined,
        buildBatchNumber: js.UndefOr[WrapperLong] = js.undefined,
        buildBatchStatus: js.UndefOr[StatusType] = js.undefined,
        buildGroups: js.UndefOr[BuildGroups] = js.undefined,
        buildTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined,
        cache: js.UndefOr[ProjectCache] = js.undefined,
        complete: js.UndefOr[Boolean] = js.undefined,
        currentPhase: js.UndefOr[String] = js.undefined,
        debugSessionEnabled: js.UndefOr[WrapperBoolean] = js.undefined,
        encryptionKey: js.UndefOr[NonEmptyString] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        environment: js.UndefOr[ProjectEnvironment] = js.undefined,
        fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined,
        id: js.UndefOr[NonEmptyString] = js.undefined,
        initiator: js.UndefOr[String] = js.undefined,
        logConfig: js.UndefOr[LogsConfig] = js.undefined,
        phases: js.UndefOr[BuildBatchPhases] = js.undefined,
        projectName: js.UndefOr[NonEmptyString] = js.undefined,
        queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined,
        resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.undefined,
        secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.undefined,
        secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined,
        secondarySources: js.UndefOr[ProjectSources] = js.undefined,
        serviceRole: js.UndefOr[NonEmptyString] = js.undefined,
        source: js.UndefOr[ProjectSource] = js.undefined,
        sourceVersion: js.UndefOr[NonEmptyString] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        vpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): BuildBatch = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      artifacts.foreach(__v => __obj.updateDynamic("artifacts")(__v.asInstanceOf[js.Any]))
      buildBatchConfig.foreach(__v => __obj.updateDynamic("buildBatchConfig")(__v.asInstanceOf[js.Any]))
      buildBatchNumber.foreach(__v => __obj.updateDynamic("buildBatchNumber")(__v.asInstanceOf[js.Any]))
      buildBatchStatus.foreach(__v => __obj.updateDynamic("buildBatchStatus")(__v.asInstanceOf[js.Any]))
      buildGroups.foreach(__v => __obj.updateDynamic("buildGroups")(__v.asInstanceOf[js.Any]))
      buildTimeoutInMinutes.foreach(__v => __obj.updateDynamic("buildTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      cache.foreach(__v => __obj.updateDynamic("cache")(__v.asInstanceOf[js.Any]))
      complete.foreach(__v => __obj.updateDynamic("complete")(__v.asInstanceOf[js.Any]))
      currentPhase.foreach(__v => __obj.updateDynamic("currentPhase")(__v.asInstanceOf[js.Any]))
      debugSessionEnabled.foreach(__v => __obj.updateDynamic("debugSessionEnabled")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      fileSystemLocations.foreach(__v => __obj.updateDynamic("fileSystemLocations")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      initiator.foreach(__v => __obj.updateDynamic("initiator")(__v.asInstanceOf[js.Any]))
      logConfig.foreach(__v => __obj.updateDynamic("logConfig")(__v.asInstanceOf[js.Any]))
      phases.foreach(__v => __obj.updateDynamic("phases")(__v.asInstanceOf[js.Any]))
      projectName.foreach(__v => __obj.updateDynamic("projectName")(__v.asInstanceOf[js.Any]))
      queuedTimeoutInMinutes.foreach(__v => __obj.updateDynamic("queuedTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      resolvedSourceVersion.foreach(__v => __obj.updateDynamic("resolvedSourceVersion")(__v.asInstanceOf[js.Any]))
      secondaryArtifacts.foreach(__v => __obj.updateDynamic("secondaryArtifacts")(__v.asInstanceOf[js.Any]))
      secondarySourceVersions.foreach(__v => __obj.updateDynamic("secondarySourceVersions")(__v.asInstanceOf[js.Any]))
      secondarySources.foreach(__v => __obj.updateDynamic("secondarySources")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      sourceVersion.foreach(__v => __obj.updateDynamic("sourceVersion")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildBatch]
    }
  }

  /** Specifies filters when retrieving batch builds.
    */
  @js.native
  trait BuildBatchFilter extends js.Object {
    var status: js.UndefOr[StatusType]
  }

  object BuildBatchFilter {
    @inline
    def apply(
        status: js.UndefOr[StatusType] = js.undefined
    ): BuildBatchFilter = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildBatchFilter]
    }
  }

  /** Contains information about a stage for a batch build.
    */
  @js.native
  trait BuildBatchPhase extends js.Object {
    var contexts: js.UndefOr[PhaseContexts]
    var durationInSeconds: js.UndefOr[WrapperLong]
    var endTime: js.UndefOr[Timestamp]
    var phaseStatus: js.UndefOr[StatusType]
    var phaseType: js.UndefOr[BuildBatchPhaseType]
    var startTime: js.UndefOr[Timestamp]
  }

  object BuildBatchPhase {
    @inline
    def apply(
        contexts: js.UndefOr[PhaseContexts] = js.undefined,
        durationInSeconds: js.UndefOr[WrapperLong] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        phaseStatus: js.UndefOr[StatusType] = js.undefined,
        phaseType: js.UndefOr[BuildBatchPhaseType] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): BuildBatchPhase = {
      val __obj = js.Dynamic.literal()
      contexts.foreach(__v => __obj.updateDynamic("contexts")(__v.asInstanceOf[js.Any]))
      durationInSeconds.foreach(__v => __obj.updateDynamic("durationInSeconds")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      phaseStatus.foreach(__v => __obj.updateDynamic("phaseStatus")(__v.asInstanceOf[js.Any]))
      phaseType.foreach(__v => __obj.updateDynamic("phaseType")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildBatchPhase]
    }
  }

  /** Contains information about a batch build build group. Build groups are used to combine builds that can run in parallel, while still being able to set dependencies on other build groups.
    */
  @js.native
  trait BuildGroup extends js.Object {
    var currentBuildSummary: js.UndefOr[BuildSummary]
    var dependsOn: js.UndefOr[Identifiers]
    var identifier: js.UndefOr[String]
    var ignoreFailure: js.UndefOr[Boolean]
    var priorBuildSummaryList: js.UndefOr[BuildSummaries]
  }

  object BuildGroup {
    @inline
    def apply(
        currentBuildSummary: js.UndefOr[BuildSummary] = js.undefined,
        dependsOn: js.UndefOr[Identifiers] = js.undefined,
        identifier: js.UndefOr[String] = js.undefined,
        ignoreFailure: js.UndefOr[Boolean] = js.undefined,
        priorBuildSummaryList: js.UndefOr[BuildSummaries] = js.undefined
    ): BuildGroup = {
      val __obj = js.Dynamic.literal()
      currentBuildSummary.foreach(__v => __obj.updateDynamic("currentBuildSummary")(__v.asInstanceOf[js.Any]))
      dependsOn.foreach(__v => __obj.updateDynamic("dependsOn")(__v.asInstanceOf[js.Any]))
      identifier.foreach(__v => __obj.updateDynamic("identifier")(__v.asInstanceOf[js.Any]))
      ignoreFailure.foreach(__v => __obj.updateDynamic("ignoreFailure")(__v.asInstanceOf[js.Any]))
      priorBuildSummaryList.foreach(__v => __obj.updateDynamic("priorBuildSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildGroup]
    }
  }

  /** Information about a build that could not be successfully deleted.
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

  /** Information about a stage for a build.
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

  /** Contains information that defines how the CodeBuild build project reports the build status to the source provider.
    */
  @js.native
  trait BuildStatusConfig extends js.Object {
    var context: js.UndefOr[String]
    var targetUrl: js.UndefOr[String]
  }

  object BuildStatusConfig {
    @inline
    def apply(
        context: js.UndefOr[String] = js.undefined,
        targetUrl: js.UndefOr[String] = js.undefined
    ): BuildStatusConfig = {
      val __obj = js.Dynamic.literal()
      context.foreach(__v => __obj.updateDynamic("context")(__v.asInstanceOf[js.Any]))
      targetUrl.foreach(__v => __obj.updateDynamic("targetUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildStatusConfig]
    }
  }

  /** Contains summary information about a batch build group.
    */
  @js.native
  trait BuildSummary extends js.Object {
    var arn: js.UndefOr[String]
    var buildStatus: js.UndefOr[StatusType]
    var primaryArtifact: js.UndefOr[ResolvedArtifact]
    var requestedOn: js.UndefOr[Timestamp]
    var secondaryArtifacts: js.UndefOr[ResolvedSecondaryArtifacts]
  }

  object BuildSummary {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        buildStatus: js.UndefOr[StatusType] = js.undefined,
        primaryArtifact: js.UndefOr[ResolvedArtifact] = js.undefined,
        requestedOn: js.UndefOr[Timestamp] = js.undefined,
        secondaryArtifacts: js.UndefOr[ResolvedSecondaryArtifacts] = js.undefined
    ): BuildSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      buildStatus.foreach(__v => __obj.updateDynamic("buildStatus")(__v.asInstanceOf[js.Any]))
      primaryArtifact.foreach(__v => __obj.updateDynamic("primaryArtifact")(__v.asInstanceOf[js.Any]))
      requestedOn.foreach(__v => __obj.updateDynamic("requestedOn")(__v.asInstanceOf[js.Any]))
      secondaryArtifacts.foreach(__v => __obj.updateDynamic("secondaryArtifacts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildSummary]
    }
  }

  /** Information about CloudWatch Logs for a build project.
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

  /** Contains code coverage report information. Line coverage measures how many statements your tests cover. A statement is a single instruction, not including comments, conditionals, etc. Branch coverage determines if your tests cover every possible branch of a control structure, such as an <code>if</code> or <code>case</code> statement.
    */
  @js.native
  trait CodeCoverage extends js.Object {
    var branchCoveragePercentage: js.UndefOr[Percentage]
    var branchesCovered: js.UndefOr[NonNegativeInt]
    var branchesMissed: js.UndefOr[NonNegativeInt]
    var expired: js.UndefOr[Timestamp]
    var filePath: js.UndefOr[NonEmptyString]
    var id: js.UndefOr[NonEmptyString]
    var lineCoveragePercentage: js.UndefOr[Percentage]
    var linesCovered: js.UndefOr[NonNegativeInt]
    var linesMissed: js.UndefOr[NonNegativeInt]
    var reportARN: js.UndefOr[NonEmptyString]
  }

  object CodeCoverage {
    @inline
    def apply(
        branchCoveragePercentage: js.UndefOr[Percentage] = js.undefined,
        branchesCovered: js.UndefOr[NonNegativeInt] = js.undefined,
        branchesMissed: js.UndefOr[NonNegativeInt] = js.undefined,
        expired: js.UndefOr[Timestamp] = js.undefined,
        filePath: js.UndefOr[NonEmptyString] = js.undefined,
        id: js.UndefOr[NonEmptyString] = js.undefined,
        lineCoveragePercentage: js.UndefOr[Percentage] = js.undefined,
        linesCovered: js.UndefOr[NonNegativeInt] = js.undefined,
        linesMissed: js.UndefOr[NonNegativeInt] = js.undefined,
        reportARN: js.UndefOr[NonEmptyString] = js.undefined
    ): CodeCoverage = {
      val __obj = js.Dynamic.literal()
      branchCoveragePercentage.foreach(__v => __obj.updateDynamic("branchCoveragePercentage")(__v.asInstanceOf[js.Any]))
      branchesCovered.foreach(__v => __obj.updateDynamic("branchesCovered")(__v.asInstanceOf[js.Any]))
      branchesMissed.foreach(__v => __obj.updateDynamic("branchesMissed")(__v.asInstanceOf[js.Any]))
      expired.foreach(__v => __obj.updateDynamic("expired")(__v.asInstanceOf[js.Any]))
      filePath.foreach(__v => __obj.updateDynamic("filePath")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lineCoveragePercentage.foreach(__v => __obj.updateDynamic("lineCoveragePercentage")(__v.asInstanceOf[js.Any]))
      linesCovered.foreach(__v => __obj.updateDynamic("linesCovered")(__v.asInstanceOf[js.Any]))
      linesMissed.foreach(__v => __obj.updateDynamic("linesMissed")(__v.asInstanceOf[js.Any]))
      reportARN.foreach(__v => __obj.updateDynamic("reportARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeCoverage]
    }
  }

  /** Contains a summary of a code coverage report. Line coverage measures how many statements your tests cover. A statement is a single instruction, not including comments, conditionals, etc. Branch coverage determines if your tests cover every possible branch of a control structure, such as an <code>if</code> or <code>case</code> statement.
    */
  @js.native
  trait CodeCoverageReportSummary extends js.Object {
    var branchCoveragePercentage: js.UndefOr[Percentage]
    var branchesCovered: js.UndefOr[NonNegativeInt]
    var branchesMissed: js.UndefOr[NonNegativeInt]
    var lineCoveragePercentage: js.UndefOr[Percentage]
    var linesCovered: js.UndefOr[NonNegativeInt]
    var linesMissed: js.UndefOr[NonNegativeInt]
  }

  object CodeCoverageReportSummary {
    @inline
    def apply(
        branchCoveragePercentage: js.UndefOr[Percentage] = js.undefined,
        branchesCovered: js.UndefOr[NonNegativeInt] = js.undefined,
        branchesMissed: js.UndefOr[NonNegativeInt] = js.undefined,
        lineCoveragePercentage: js.UndefOr[Percentage] = js.undefined,
        linesCovered: js.UndefOr[NonNegativeInt] = js.undefined,
        linesMissed: js.UndefOr[NonNegativeInt] = js.undefined
    ): CodeCoverageReportSummary = {
      val __obj = js.Dynamic.literal()
      branchCoveragePercentage.foreach(__v => __obj.updateDynamic("branchCoveragePercentage")(__v.asInstanceOf[js.Any]))
      branchesCovered.foreach(__v => __obj.updateDynamic("branchesCovered")(__v.asInstanceOf[js.Any]))
      branchesMissed.foreach(__v => __obj.updateDynamic("branchesMissed")(__v.asInstanceOf[js.Any]))
      lineCoveragePercentage.foreach(__v => __obj.updateDynamic("lineCoveragePercentage")(__v.asInstanceOf[js.Any]))
      linesCovered.foreach(__v => __obj.updateDynamic("linesCovered")(__v.asInstanceOf[js.Any]))
      linesMissed.foreach(__v => __obj.updateDynamic("linesMissed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeCoverageReportSummary]
    }
  }

  @js.native
  trait CreateProjectInput extends js.Object {
    var artifacts: ProjectArtifacts
    var environment: ProjectEnvironment
    var name: ProjectName
    var serviceRole: NonEmptyString
    var source: ProjectSource
    var badgeEnabled: js.UndefOr[WrapperBoolean]
    var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig]
    var cache: js.UndefOr[ProjectCache]
    var concurrentBuildLimit: js.UndefOr[WrapperInt]
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
        buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.undefined,
        cache: js.UndefOr[ProjectCache] = js.undefined,
        concurrentBuildLimit: js.UndefOr[WrapperInt] = js.undefined,
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
        "artifacts" -> artifacts.asInstanceOf[js.Any],
        "environment" -> environment.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "serviceRole" -> serviceRole.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any]
      )

      badgeEnabled.foreach(__v => __obj.updateDynamic("badgeEnabled")(__v.asInstanceOf[js.Any]))
      buildBatchConfig.foreach(__v => __obj.updateDynamic("buildBatchConfig")(__v.asInstanceOf[js.Any]))
      cache.foreach(__v => __obj.updateDynamic("cache")(__v.asInstanceOf[js.Any]))
      concurrentBuildLimit.foreach(__v => __obj.updateDynamic("concurrentBuildLimit")(__v.asInstanceOf[js.Any]))
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
    var tags: js.UndefOr[TagList]
  }

  object CreateReportGroupInput {
    @inline
    def apply(
        exportConfig: ReportExportConfig,
        name: ReportGroupName,
        `type`: ReportType,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateReportGroupInput = {
      val __obj = js.Dynamic.literal(
        "exportConfig" -> exportConfig.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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
    var buildType: js.UndefOr[WebhookBuildType]
    var filterGroups: js.UndefOr[FilterGroups]
  }

  object CreateWebhookInput {
    @inline
    def apply(
        projectName: ProjectName,
        branchFilter: js.UndefOr[String] = js.undefined,
        buildType: js.UndefOr[WebhookBuildType] = js.undefined,
        filterGroups: js.UndefOr[FilterGroups] = js.undefined
    ): CreateWebhookInput = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      branchFilter.foreach(__v => __obj.updateDynamic("branchFilter")(__v.asInstanceOf[js.Any]))
      buildType.foreach(__v => __obj.updateDynamic("buildType")(__v.asInstanceOf[js.Any]))
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

  /** Contains information about the debug session for a build. For more information, see [[https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html|Viewing a running build in Session Manager]].
    */
  @js.native
  trait DebugSession extends js.Object {
    var sessionEnabled: js.UndefOr[WrapperBoolean]
    var sessionTarget: js.UndefOr[NonEmptyString]
  }

  object DebugSession {
    @inline
    def apply(
        sessionEnabled: js.UndefOr[WrapperBoolean] = js.undefined,
        sessionTarget: js.UndefOr[NonEmptyString] = js.undefined
    ): DebugSession = {
      val __obj = js.Dynamic.literal()
      sessionEnabled.foreach(__v => __obj.updateDynamic("sessionEnabled")(__v.asInstanceOf[js.Any]))
      sessionTarget.foreach(__v => __obj.updateDynamic("sessionTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DebugSession]
    }
  }

  @js.native
  trait DeleteBuildBatchInput extends js.Object {
    var id: NonEmptyString
  }

  object DeleteBuildBatchInput {
    @inline
    def apply(
        id: NonEmptyString
    ): DeleteBuildBatchInput = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBuildBatchInput]
    }
  }

  @js.native
  trait DeleteBuildBatchOutput extends js.Object {
    var buildsDeleted: js.UndefOr[BuildIds]
    var buildsNotDeleted: js.UndefOr[BuildsNotDeleted]
    var statusCode: js.UndefOr[String]
  }

  object DeleteBuildBatchOutput {
    @inline
    def apply(
        buildsDeleted: js.UndefOr[BuildIds] = js.undefined,
        buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.undefined,
        statusCode: js.UndefOr[String] = js.undefined
    ): DeleteBuildBatchOutput = {
      val __obj = js.Dynamic.literal()
      buildsDeleted.foreach(__v => __obj.updateDynamic("buildsDeleted")(__v.asInstanceOf[js.Any]))
      buildsNotDeleted.foreach(__v => __obj.updateDynamic("buildsNotDeleted")(__v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBuildBatchOutput]
    }
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
  trait DeleteProjectOutput extends js.Object

  object DeleteProjectOutput {
    @inline
    def apply(): DeleteProjectOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProjectOutput]
    }
  }

  @js.native
  trait DeleteReportGroupInput extends js.Object {
    var arn: NonEmptyString
    var deleteReports: js.UndefOr[Boolean]
  }

  object DeleteReportGroupInput {
    @inline
    def apply(
        arn: NonEmptyString,
        deleteReports: js.UndefOr[Boolean] = js.undefined
    ): DeleteReportGroupInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      deleteReports.foreach(__v => __obj.updateDynamic("deleteReports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReportGroupInput]
    }
  }

  @js.native
  trait DeleteReportGroupOutput extends js.Object

  object DeleteReportGroupOutput {
    @inline
    def apply(): DeleteReportGroupOutput = {
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
  trait DeleteReportOutput extends js.Object

  object DeleteReportOutput {
    @inline
    def apply(): DeleteReportOutput = {
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
  trait DeleteResourcePolicyOutput extends js.Object

  object DeleteResourcePolicyOutput {
    @inline
    def apply(): DeleteResourcePolicyOutput = {
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
  trait DeleteWebhookOutput extends js.Object

  object DeleteWebhookOutput {
    @inline
    def apply(): DeleteWebhookOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWebhookOutput]
    }
  }

  @js.native
  trait DescribeCodeCoveragesInput extends js.Object {
    var reportArn: NonEmptyString
    var maxLineCoveragePercentage: js.UndefOr[Percentage]
    var maxResults: js.UndefOr[PageSize]
    var minLineCoveragePercentage: js.UndefOr[Percentage]
    var nextToken: js.UndefOr[String]
    var sortBy: js.UndefOr[ReportCodeCoverageSortByType]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object DescribeCodeCoveragesInput {
    @inline
    def apply(
        reportArn: NonEmptyString,
        maxLineCoveragePercentage: js.UndefOr[Percentage] = js.undefined,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        minLineCoveragePercentage: js.UndefOr[Percentage] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        sortBy: js.UndefOr[ReportCodeCoverageSortByType] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): DescribeCodeCoveragesInput = {
      val __obj = js.Dynamic.literal(
        "reportArn" -> reportArn.asInstanceOf[js.Any]
      )

      maxLineCoveragePercentage.foreach(__v => __obj.updateDynamic("maxLineCoveragePercentage")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      minLineCoveragePercentage.foreach(__v => __obj.updateDynamic("minLineCoveragePercentage")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCodeCoveragesInput]
    }
  }

  @js.native
  trait DescribeCodeCoveragesOutput extends js.Object {
    var codeCoverages: js.UndefOr[CodeCoverages]
    var nextToken: js.UndefOr[String]
  }

  object DescribeCodeCoveragesOutput {
    @inline
    def apply(
        codeCoverages: js.UndefOr[CodeCoverages] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeCodeCoveragesOutput = {
      val __obj = js.Dynamic.literal()
      codeCoverages.foreach(__v => __obj.updateDynamic("codeCoverages")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCodeCoveragesOutput]
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

  /** Information about a Docker image that is managed by CodeBuild.
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

  /** A set of Docker images that are related by programming language and are managed by CodeBuild.
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

  /** A set of Docker images that are related by platform and are managed by CodeBuild.
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

  /** Information about an environment variable for a build project or a build.
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
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentVariable]
    }
  }

  /** Contains information about an exported environment variable. Exported environment variables are used in conjunction with CodePipeline to export environment variables from the current build stage to subsequent stages in the pipeline. For more information, see [[https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-variables.html|Working with variables]] in the <i>CodePipeline User Guide</i>.
    *
    * '''Note:'''During a build, the value of a variable is available starting with the <code>install</code> phase. It can be updated between the start of the <code>install</code> phase and the end of the <code>post_build</code> phase. After the <code>post_build</code> phase ends, the value of exported variables cannot change.
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
  trait GetReportGroupTrendInput extends js.Object {
    var reportGroupArn: NonEmptyString
    var trendField: ReportGroupTrendFieldType
    var numOfReports: js.UndefOr[PageSize]
  }

  object GetReportGroupTrendInput {
    @inline
    def apply(
        reportGroupArn: NonEmptyString,
        trendField: ReportGroupTrendFieldType,
        numOfReports: js.UndefOr[PageSize] = js.undefined
    ): GetReportGroupTrendInput = {
      val __obj = js.Dynamic.literal(
        "reportGroupArn" -> reportGroupArn.asInstanceOf[js.Any],
        "trendField" -> trendField.asInstanceOf[js.Any]
      )

      numOfReports.foreach(__v => __obj.updateDynamic("numOfReports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReportGroupTrendInput]
    }
  }

  @js.native
  trait GetReportGroupTrendOutput extends js.Object {
    var rawData: js.UndefOr[ReportGroupTrendRawDataList]
    var stats: js.UndefOr[ReportGroupTrendStats]
  }

  object GetReportGroupTrendOutput {
    @inline
    def apply(
        rawData: js.UndefOr[ReportGroupTrendRawDataList] = js.undefined,
        stats: js.UndefOr[ReportGroupTrendStats] = js.undefined
    ): GetReportGroupTrendOutput = {
      val __obj = js.Dynamic.literal()
      rawData.foreach(__v => __obj.updateDynamic("rawData")(__v.asInstanceOf[js.Any]))
      stats.foreach(__v => __obj.updateDynamic("stats")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReportGroupTrendOutput]
    }
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

  /** Information about the Git submodules configuration for an CodeBuild build project.
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
        "authType" -> authType.asInstanceOf[js.Any],
        "serverType" -> serverType.asInstanceOf[js.Any],
        "token" -> token.asInstanceOf[js.Any]
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
  trait InvalidateProjectCacheOutput extends js.Object

  object InvalidateProjectCacheOutput {
    @inline
    def apply(): InvalidateProjectCacheOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidateProjectCacheOutput]
    }
  }

  @js.native
  trait ListBuildBatchesForProjectInput extends js.Object {
    var filter: js.UndefOr[BuildBatchFilter]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var projectName: js.UndefOr[NonEmptyString]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListBuildBatchesForProjectInput {
    @inline
    def apply(
        filter: js.UndefOr[BuildBatchFilter] = js.undefined,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        projectName: js.UndefOr[NonEmptyString] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListBuildBatchesForProjectInput = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      projectName.foreach(__v => __obj.updateDynamic("projectName")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildBatchesForProjectInput]
    }
  }

  @js.native
  trait ListBuildBatchesForProjectOutput extends js.Object {
    var ids: js.UndefOr[BuildBatchIds]
    var nextToken: js.UndefOr[String]
  }

  object ListBuildBatchesForProjectOutput {
    @inline
    def apply(
        ids: js.UndefOr[BuildBatchIds] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListBuildBatchesForProjectOutput = {
      val __obj = js.Dynamic.literal()
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildBatchesForProjectOutput]
    }
  }

  @js.native
  trait ListBuildBatchesInput extends js.Object {
    var filter: js.UndefOr[BuildBatchFilter]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[String]
    var sortOrder: js.UndefOr[SortOrderType]
  }

  object ListBuildBatchesInput {
    @inline
    def apply(
        filter: js.UndefOr[BuildBatchFilter] = js.undefined,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        sortOrder: js.UndefOr[SortOrderType] = js.undefined
    ): ListBuildBatchesInput = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildBatchesInput]
    }
  }

  @js.native
  trait ListBuildBatchesOutput extends js.Object {
    var ids: js.UndefOr[BuildBatchIds]
    var nextToken: js.UndefOr[String]
  }

  object ListBuildBatchesOutput {
    @inline
    def apply(
        ids: js.UndefOr[BuildBatchIds] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListBuildBatchesOutput = {
      val __obj = js.Dynamic.literal()
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildBatchesOutput]
    }
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
  trait ListCuratedEnvironmentImagesInput extends js.Object

  object ListCuratedEnvironmentImagesInput {
    @inline
    def apply(): ListCuratedEnvironmentImagesInput = {
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
  trait ListSourceCredentialsInput extends js.Object

  object ListSourceCredentialsInput {
    @inline
    def apply(): ListSourceCredentialsInput = {
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

  /** Information about logs for a build project. These can be logs in CloudWatch Logs, built in a specified S3 bucket, or both.
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

  /** Information about build logs in CloudWatch Logs.
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

  /** Describes a network interface.
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

  /** Additional information about a build phase that has an error. You can use this information for troubleshooting.
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

  /** Information about a build project.
    */
  @js.native
  trait Project extends js.Object {
    var arn: js.UndefOr[String]
    var artifacts: js.UndefOr[ProjectArtifacts]
    var badge: js.UndefOr[ProjectBadge]
    var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig]
    var cache: js.UndefOr[ProjectCache]
    var concurrentBuildLimit: js.UndefOr[WrapperInt]
    var created: js.UndefOr[Timestamp]
    var description: js.UndefOr[ProjectDescription]
    var encryptionKey: js.UndefOr[NonEmptyString]
    var environment: js.UndefOr[ProjectEnvironment]
    var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations]
    var lastModified: js.UndefOr[Timestamp]
    var logsConfig: js.UndefOr[LogsConfig]
    var name: js.UndefOr[ProjectName]
    var projectVisibility: js.UndefOr[ProjectVisibilityType]
    var publicProjectAlias: js.UndefOr[NonEmptyString]
    var queuedTimeoutInMinutes: js.UndefOr[TimeOut]
    var resourceAccessRole: js.UndefOr[NonEmptyString]
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
        buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.undefined,
        cache: js.UndefOr[ProjectCache] = js.undefined,
        concurrentBuildLimit: js.UndefOr[WrapperInt] = js.undefined,
        created: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[ProjectDescription] = js.undefined,
        encryptionKey: js.UndefOr[NonEmptyString] = js.undefined,
        environment: js.UndefOr[ProjectEnvironment] = js.undefined,
        fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined,
        lastModified: js.UndefOr[Timestamp] = js.undefined,
        logsConfig: js.UndefOr[LogsConfig] = js.undefined,
        name: js.UndefOr[ProjectName] = js.undefined,
        projectVisibility: js.UndefOr[ProjectVisibilityType] = js.undefined,
        publicProjectAlias: js.UndefOr[NonEmptyString] = js.undefined,
        queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined,
        resourceAccessRole: js.UndefOr[NonEmptyString] = js.undefined,
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
      buildBatchConfig.foreach(__v => __obj.updateDynamic("buildBatchConfig")(__v.asInstanceOf[js.Any]))
      cache.foreach(__v => __obj.updateDynamic("cache")(__v.asInstanceOf[js.Any]))
      concurrentBuildLimit.foreach(__v => __obj.updateDynamic("concurrentBuildLimit")(__v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      fileSystemLocations.foreach(__v => __obj.updateDynamic("fileSystemLocations")(__v.asInstanceOf[js.Any]))
      lastModified.foreach(__v => __obj.updateDynamic("lastModified")(__v.asInstanceOf[js.Any]))
      logsConfig.foreach(__v => __obj.updateDynamic("logsConfig")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      projectVisibility.foreach(__v => __obj.updateDynamic("projectVisibility")(__v.asInstanceOf[js.Any]))
      publicProjectAlias.foreach(__v => __obj.updateDynamic("publicProjectAlias")(__v.asInstanceOf[js.Any]))
      queuedTimeoutInMinutes.foreach(__v => __obj.updateDynamic("queuedTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      resourceAccessRole.foreach(__v => __obj.updateDynamic("resourceAccessRole")(__v.asInstanceOf[js.Any]))
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

  /** Information about the build output artifacts for the build project.
    */
  @js.native
  trait ProjectArtifacts extends js.Object {
    var `type`: ArtifactsType
    var artifactIdentifier: js.UndefOr[String]
    var bucketOwnerAccess: js.UndefOr[BucketOwnerAccess]
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
        bucketOwnerAccess: js.UndefOr[BucketOwnerAccess] = js.undefined,
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
      bucketOwnerAccess.foreach(__v => __obj.updateDynamic("bucketOwnerAccess")(__v.asInstanceOf[js.Any]))
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

  /** Information about the build badge for the build project.
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

  /** Contains configuration information about a batch build project.
    */
  @js.native
  trait ProjectBuildBatchConfig extends js.Object {
    var batchReportMode: js.UndefOr[BatchReportModeType]
    var combineArtifacts: js.UndefOr[WrapperBoolean]
    var restrictions: js.UndefOr[BatchRestrictions]
    var serviceRole: js.UndefOr[NonEmptyString]
    var timeoutInMins: js.UndefOr[WrapperInt]
  }

  object ProjectBuildBatchConfig {
    @inline
    def apply(
        batchReportMode: js.UndefOr[BatchReportModeType] = js.undefined,
        combineArtifacts: js.UndefOr[WrapperBoolean] = js.undefined,
        restrictions: js.UndefOr[BatchRestrictions] = js.undefined,
        serviceRole: js.UndefOr[NonEmptyString] = js.undefined,
        timeoutInMins: js.UndefOr[WrapperInt] = js.undefined
    ): ProjectBuildBatchConfig = {
      val __obj = js.Dynamic.literal()
      batchReportMode.foreach(__v => __obj.updateDynamic("batchReportMode")(__v.asInstanceOf[js.Any]))
      combineArtifacts.foreach(__v => __obj.updateDynamic("combineArtifacts")(__v.asInstanceOf[js.Any]))
      restrictions.foreach(__v => __obj.updateDynamic("restrictions")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      timeoutInMins.foreach(__v => __obj.updateDynamic("timeoutInMins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectBuildBatchConfig]
    }
  }

  /** Information about the cache for the build project.
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

  /** Information about the build environment of the build project.
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
        "image" -> image.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      certificate.foreach(__v => __obj.updateDynamic("certificate")(__v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      imagePullCredentialsType.foreach(__v => __obj.updateDynamic("imagePullCredentialsType")(__v.asInstanceOf[js.Any]))
      privilegedMode.foreach(__v => __obj.updateDynamic("privilegedMode")(__v.asInstanceOf[js.Any]))
      registryCredential.foreach(__v => __obj.updateDynamic("registryCredential")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectEnvironment]
    }
  }

  /** Information about a file system created by Amazon Elastic File System (EFS). For more information, see [[https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html|What Is Amazon Elastic File System?]]
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

  /** Information about the build input source code for the build project.
    */
  @js.native
  trait ProjectSource extends js.Object {
    var `type`: SourceType
    var auth: js.UndefOr[SourceAuth]
    var buildStatusConfig: js.UndefOr[BuildStatusConfig]
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
        buildStatusConfig: js.UndefOr[BuildStatusConfig] = js.undefined,
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
      buildStatusConfig.foreach(__v => __obj.updateDynamic("buildStatusConfig")(__v.asInstanceOf[js.Any]))
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

  /** A source identifier and its corresponding version.
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
        "sourceVersion" -> sourceVersion.asInstanceOf[js.Any]
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
        "policy" -> policy.asInstanceOf[js.Any],
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

  /** Information about credentials that provide access to a private Docker registry. When this is set: * <code>imagePullCredentialsType</code> must be set to <code>SERVICE_ROLE</code>. * images cannot be curated or an Amazon ECR image. For more information, see [[https://docs.aws.amazon.com/codebuild/latest/userguide/sample-private-registry.html|Private Registry with Secrets Manager Sample for CodeBuild]].
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
        "credential" -> credential.asInstanceOf[js.Any],
        "credentialProvider" -> credentialProvider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegistryCredential]
    }
  }

  /** Information about the results from running a series of test cases during the run of a build project. The test cases are specified in the buildspec for the build project using one or more paths to the test case files. You can specify any type of tests you want, such as unit tests, integration tests, and functional tests.
    */
  @js.native
  trait Report extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var codeCoverageSummary: js.UndefOr[CodeCoverageReportSummary]
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
        codeCoverageSummary: js.UndefOr[CodeCoverageReportSummary] = js.undefined,
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
      codeCoverageSummary.foreach(__v => __obj.updateDynamic("codeCoverageSummary")(__v.asInstanceOf[js.Any]))
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

  /** Information about the location where the run of a report is exported.
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

  /** A filter used to return reports with the status specified by the input <code>status</code> parameter.
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

  /** A series of reports. Each report contains information about the results from running a series of test cases. You specify the test cases for a report group in the buildspec for a build project using one or more paths to the test case files.
    */
  @js.native
  trait ReportGroup extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var created: js.UndefOr[Timestamp]
    var exportConfig: js.UndefOr[ReportExportConfig]
    var lastModified: js.UndefOr[Timestamp]
    var name: js.UndefOr[ReportGroupName]
    var status: js.UndefOr[ReportGroupStatusType]
    var tags: js.UndefOr[TagList]
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
        status: js.UndefOr[ReportGroupStatusType] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        `type`: js.UndefOr[ReportType] = js.undefined
    ): ReportGroup = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.updateDynamic("created")(__v.asInstanceOf[js.Any]))
      exportConfig.foreach(__v => __obj.updateDynamic("exportConfig")(__v.asInstanceOf[js.Any]))
      lastModified.foreach(__v => __obj.updateDynamic("lastModified")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportGroup]
    }
  }

  /** Contains trend statistics for a set of reports. The actual values depend on the type of trend being collected. For more information, see .
    */
  @js.native
  trait ReportGroupTrendStats extends js.Object {
    var average: js.UndefOr[String]
    var max: js.UndefOr[String]
    var min: js.UndefOr[String]
  }

  object ReportGroupTrendStats {
    @inline
    def apply(
        average: js.UndefOr[String] = js.undefined,
        max: js.UndefOr[String] = js.undefined,
        min: js.UndefOr[String] = js.undefined
    ): ReportGroupTrendStats = {
      val __obj = js.Dynamic.literal()
      average.foreach(__v => __obj.updateDynamic("average")(__v.asInstanceOf[js.Any]))
      max.foreach(__v => __obj.updateDynamic("max")(__v.asInstanceOf[js.Any]))
      min.foreach(__v => __obj.updateDynamic("min")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportGroupTrendStats]
    }
  }

  /** Contains the unmodified data for the report. For more information, see .
    */
  @js.native
  trait ReportWithRawData extends js.Object {
    var data: js.UndefOr[String]
    var reportArn: js.UndefOr[NonEmptyString]
  }

  object ReportWithRawData {
    @inline
    def apply(
        data: js.UndefOr[String] = js.undefined,
        reportArn: js.UndefOr[NonEmptyString] = js.undefined
    ): ReportWithRawData = {
      val __obj = js.Dynamic.literal()
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
      reportArn.foreach(__v => __obj.updateDynamic("reportArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportWithRawData]
    }
  }

  /** Represents a resolved build artifact. A resolved artifact is an artifact that is built and deployed to the destination, such as Amazon S3.
    */
  @js.native
  trait ResolvedArtifact extends js.Object {
    var identifier: js.UndefOr[String]
    var location: js.UndefOr[String]
    var `type`: js.UndefOr[ArtifactsType]
  }

  object ResolvedArtifact {
    @inline
    def apply(
        identifier: js.UndefOr[String] = js.undefined,
        location: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[ArtifactsType] = js.undefined
    ): ResolvedArtifact = {
      val __obj = js.Dynamic.literal()
      identifier.foreach(__v => __obj.updateDynamic("identifier")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolvedArtifact]
    }
  }

  @js.native
  trait RetryBuildBatchInput extends js.Object {
    var id: js.UndefOr[NonEmptyString]
    var idempotencyToken: js.UndefOr[String]
    var retryType: js.UndefOr[RetryBuildBatchType]
  }

  object RetryBuildBatchInput {
    @inline
    def apply(
        id: js.UndefOr[NonEmptyString] = js.undefined,
        idempotencyToken: js.UndefOr[String] = js.undefined,
        retryType: js.UndefOr[RetryBuildBatchType] = js.undefined
    ): RetryBuildBatchInput = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      idempotencyToken.foreach(__v => __obj.updateDynamic("idempotencyToken")(__v.asInstanceOf[js.Any]))
      retryType.foreach(__v => __obj.updateDynamic("retryType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryBuildBatchInput]
    }
  }

  @js.native
  trait RetryBuildBatchOutput extends js.Object {
    var buildBatch: js.UndefOr[BuildBatch]
  }

  object RetryBuildBatchOutput {
    @inline
    def apply(
        buildBatch: js.UndefOr[BuildBatch] = js.undefined
    ): RetryBuildBatchOutput = {
      val __obj = js.Dynamic.literal()
      buildBatch.foreach(__v => __obj.updateDynamic("buildBatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryBuildBatchOutput]
    }
  }

  @js.native
  trait RetryBuildInput extends js.Object {
    var id: js.UndefOr[NonEmptyString]
    var idempotencyToken: js.UndefOr[String]
  }

  object RetryBuildInput {
    @inline
    def apply(
        id: js.UndefOr[NonEmptyString] = js.undefined,
        idempotencyToken: js.UndefOr[String] = js.undefined
    ): RetryBuildInput = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      idempotencyToken.foreach(__v => __obj.updateDynamic("idempotencyToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryBuildInput]
    }
  }

  @js.native
  trait RetryBuildOutput extends js.Object {
    var build: js.UndefOr[Build]
  }

  object RetryBuildOutput {
    @inline
    def apply(
        build: js.UndefOr[Build] = js.undefined
    ): RetryBuildOutput = {
      val __obj = js.Dynamic.literal()
      build.foreach(__v => __obj.updateDynamic("build")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryBuildOutput]
    }
  }

  /** Information about S3 logs for a build project.
    */
  @js.native
  trait S3LogsConfig extends js.Object {
    var status: LogsConfigStatusType
    var bucketOwnerAccess: js.UndefOr[BucketOwnerAccess]
    var encryptionDisabled: js.UndefOr[WrapperBoolean]
    var location: js.UndefOr[String]
  }

  object S3LogsConfig {
    @inline
    def apply(
        status: LogsConfigStatusType,
        bucketOwnerAccess: js.UndefOr[BucketOwnerAccess] = js.undefined,
        encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
        location: js.UndefOr[String] = js.undefined
    ): S3LogsConfig = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      bucketOwnerAccess.foreach(__v => __obj.updateDynamic("bucketOwnerAccess")(__v.asInstanceOf[js.Any]))
      encryptionDisabled.foreach(__v => __obj.updateDynamic("encryptionDisabled")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3LogsConfig]
    }
  }

  /** Information about the S3 bucket where the raw data of a report are exported.
    */
  @js.native
  trait S3ReportExportConfig extends js.Object {
    var bucket: js.UndefOr[NonEmptyString]
    var bucketOwner: js.UndefOr[String]
    var encryptionDisabled: js.UndefOr[WrapperBoolean]
    var encryptionKey: js.UndefOr[NonEmptyString]
    var packaging: js.UndefOr[ReportPackagingType]
    var path: js.UndefOr[String]
  }

  object S3ReportExportConfig {
    @inline
    def apply(
        bucket: js.UndefOr[NonEmptyString] = js.undefined,
        bucketOwner: js.UndefOr[String] = js.undefined,
        encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined,
        encryptionKey: js.UndefOr[NonEmptyString] = js.undefined,
        packaging: js.UndefOr[ReportPackagingType] = js.undefined,
        path: js.UndefOr[String] = js.undefined
    ): S3ReportExportConfig = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      bucketOwner.foreach(__v => __obj.updateDynamic("bucketOwner")(__v.asInstanceOf[js.Any]))
      encryptionDisabled.foreach(__v => __obj.updateDynamic("encryptionDisabled")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      packaging.foreach(__v => __obj.updateDynamic("packaging")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ReportExportConfig]
    }
  }

  /** Information about the authorization settings for CodeBuild to access the source code to be built. This information is for the CodeBuild console's use only. Your code should not get or set this information directly.
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

  /** Information about the credentials for a GitHub, GitHub Enterprise, or Bitbucket repository.
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
  trait StartBuildBatchInput extends js.Object {
    var projectName: NonEmptyString
    var artifactsOverride: js.UndefOr[ProjectArtifacts]
    var buildBatchConfigOverride: js.UndefOr[ProjectBuildBatchConfig]
    var buildTimeoutInMinutesOverride: js.UndefOr[TimeOut]
    var buildspecOverride: js.UndefOr[String]
    var cacheOverride: js.UndefOr[ProjectCache]
    var certificateOverride: js.UndefOr[String]
    var computeTypeOverride: js.UndefOr[ComputeType]
    var debugSessionEnabled: js.UndefOr[WrapperBoolean]
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
    var reportBuildBatchStatusOverride: js.UndefOr[WrapperBoolean]
    var secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList]
    var secondarySourcesOverride: js.UndefOr[ProjectSources]
    var secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions]
    var serviceRoleOverride: js.UndefOr[NonEmptyString]
    var sourceAuthOverride: js.UndefOr[SourceAuth]
    var sourceLocationOverride: js.UndefOr[String]
    var sourceTypeOverride: js.UndefOr[SourceType]
    var sourceVersion: js.UndefOr[String]
  }

  object StartBuildBatchInput {
    @inline
    def apply(
        projectName: NonEmptyString,
        artifactsOverride: js.UndefOr[ProjectArtifacts] = js.undefined,
        buildBatchConfigOverride: js.UndefOr[ProjectBuildBatchConfig] = js.undefined,
        buildTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined,
        buildspecOverride: js.UndefOr[String] = js.undefined,
        cacheOverride: js.UndefOr[ProjectCache] = js.undefined,
        certificateOverride: js.UndefOr[String] = js.undefined,
        computeTypeOverride: js.UndefOr[ComputeType] = js.undefined,
        debugSessionEnabled: js.UndefOr[WrapperBoolean] = js.undefined,
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
        reportBuildBatchStatusOverride: js.UndefOr[WrapperBoolean] = js.undefined,
        secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList] = js.undefined,
        secondarySourcesOverride: js.UndefOr[ProjectSources] = js.undefined,
        secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined,
        serviceRoleOverride: js.UndefOr[NonEmptyString] = js.undefined,
        sourceAuthOverride: js.UndefOr[SourceAuth] = js.undefined,
        sourceLocationOverride: js.UndefOr[String] = js.undefined,
        sourceTypeOverride: js.UndefOr[SourceType] = js.undefined,
        sourceVersion: js.UndefOr[String] = js.undefined
    ): StartBuildBatchInput = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      artifactsOverride.foreach(__v => __obj.updateDynamic("artifactsOverride")(__v.asInstanceOf[js.Any]))
      buildBatchConfigOverride.foreach(__v => __obj.updateDynamic("buildBatchConfigOverride")(__v.asInstanceOf[js.Any]))
      buildTimeoutInMinutesOverride.foreach(__v => __obj.updateDynamic("buildTimeoutInMinutesOverride")(__v.asInstanceOf[js.Any]))
      buildspecOverride.foreach(__v => __obj.updateDynamic("buildspecOverride")(__v.asInstanceOf[js.Any]))
      cacheOverride.foreach(__v => __obj.updateDynamic("cacheOverride")(__v.asInstanceOf[js.Any]))
      certificateOverride.foreach(__v => __obj.updateDynamic("certificateOverride")(__v.asInstanceOf[js.Any]))
      computeTypeOverride.foreach(__v => __obj.updateDynamic("computeTypeOverride")(__v.asInstanceOf[js.Any]))
      debugSessionEnabled.foreach(__v => __obj.updateDynamic("debugSessionEnabled")(__v.asInstanceOf[js.Any]))
      encryptionKeyOverride.foreach(__v => __obj.updateDynamic("encryptionKeyOverride")(__v.asInstanceOf[js.Any]))
      environmentTypeOverride.foreach(__v => __obj.updateDynamic("environmentTypeOverride")(__v.asInstanceOf[js.Any]))
      environmentVariablesOverride.foreach(__v => __obj.updateDynamic("environmentVariablesOverride")(__v.asInstanceOf[js.Any]))
      gitCloneDepthOverride.foreach(__v => __obj.updateDynamic("gitCloneDepthOverride")(__v.asInstanceOf[js.Any]))
      gitSubmodulesConfigOverride.foreach(__v => __obj.updateDynamic("gitSubmodulesConfigOverride")(__v.asInstanceOf[js.Any]))
      idempotencyToken.foreach(__v => __obj.updateDynamic("idempotencyToken")(__v.asInstanceOf[js.Any]))
      imageOverride.foreach(__v => __obj.updateDynamic("imageOverride")(__v.asInstanceOf[js.Any]))
      imagePullCredentialsTypeOverride.foreach(__v => __obj.updateDynamic("imagePullCredentialsTypeOverride")(__v.asInstanceOf[js.Any]))
      insecureSslOverride.foreach(__v => __obj.updateDynamic("insecureSslOverride")(__v.asInstanceOf[js.Any]))
      logsConfigOverride.foreach(__v => __obj.updateDynamic("logsConfigOverride")(__v.asInstanceOf[js.Any]))
      privilegedModeOverride.foreach(__v => __obj.updateDynamic("privilegedModeOverride")(__v.asInstanceOf[js.Any]))
      queuedTimeoutInMinutesOverride.foreach(__v => __obj.updateDynamic("queuedTimeoutInMinutesOverride")(__v.asInstanceOf[js.Any]))
      registryCredentialOverride.foreach(__v => __obj.updateDynamic("registryCredentialOverride")(__v.asInstanceOf[js.Any]))
      reportBuildBatchStatusOverride.foreach(__v => __obj.updateDynamic("reportBuildBatchStatusOverride")(__v.asInstanceOf[js.Any]))
      secondaryArtifactsOverride.foreach(__v => __obj.updateDynamic("secondaryArtifactsOverride")(__v.asInstanceOf[js.Any]))
      secondarySourcesOverride.foreach(__v => __obj.updateDynamic("secondarySourcesOverride")(__v.asInstanceOf[js.Any]))
      secondarySourcesVersionOverride.foreach(__v => __obj.updateDynamic("secondarySourcesVersionOverride")(__v.asInstanceOf[js.Any]))
      serviceRoleOverride.foreach(__v => __obj.updateDynamic("serviceRoleOverride")(__v.asInstanceOf[js.Any]))
      sourceAuthOverride.foreach(__v => __obj.updateDynamic("sourceAuthOverride")(__v.asInstanceOf[js.Any]))
      sourceLocationOverride.foreach(__v => __obj.updateDynamic("sourceLocationOverride")(__v.asInstanceOf[js.Any]))
      sourceTypeOverride.foreach(__v => __obj.updateDynamic("sourceTypeOverride")(__v.asInstanceOf[js.Any]))
      sourceVersion.foreach(__v => __obj.updateDynamic("sourceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBuildBatchInput]
    }
  }

  @js.native
  trait StartBuildBatchOutput extends js.Object {
    var buildBatch: js.UndefOr[BuildBatch]
  }

  object StartBuildBatchOutput {
    @inline
    def apply(
        buildBatch: js.UndefOr[BuildBatch] = js.undefined
    ): StartBuildBatchOutput = {
      val __obj = js.Dynamic.literal()
      buildBatch.foreach(__v => __obj.updateDynamic("buildBatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBuildBatchOutput]
    }
  }

  @js.native
  trait StartBuildInput extends js.Object {
    var projectName: NonEmptyString
    var artifactsOverride: js.UndefOr[ProjectArtifacts]
    var buildStatusConfigOverride: js.UndefOr[BuildStatusConfig]
    var buildspecOverride: js.UndefOr[String]
    var cacheOverride: js.UndefOr[ProjectCache]
    var certificateOverride: js.UndefOr[String]
    var computeTypeOverride: js.UndefOr[ComputeType]
    var debugSessionEnabled: js.UndefOr[WrapperBoolean]
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
        buildStatusConfigOverride: js.UndefOr[BuildStatusConfig] = js.undefined,
        buildspecOverride: js.UndefOr[String] = js.undefined,
        cacheOverride: js.UndefOr[ProjectCache] = js.undefined,
        certificateOverride: js.UndefOr[String] = js.undefined,
        computeTypeOverride: js.UndefOr[ComputeType] = js.undefined,
        debugSessionEnabled: js.UndefOr[WrapperBoolean] = js.undefined,
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
      buildStatusConfigOverride.foreach(__v => __obj.updateDynamic("buildStatusConfigOverride")(__v.asInstanceOf[js.Any]))
      buildspecOverride.foreach(__v => __obj.updateDynamic("buildspecOverride")(__v.asInstanceOf[js.Any]))
      cacheOverride.foreach(__v => __obj.updateDynamic("cacheOverride")(__v.asInstanceOf[js.Any]))
      certificateOverride.foreach(__v => __obj.updateDynamic("certificateOverride")(__v.asInstanceOf[js.Any]))
      computeTypeOverride.foreach(__v => __obj.updateDynamic("computeTypeOverride")(__v.asInstanceOf[js.Any]))
      debugSessionEnabled.foreach(__v => __obj.updateDynamic("debugSessionEnabled")(__v.asInstanceOf[js.Any]))
      encryptionKeyOverride.foreach(__v => __obj.updateDynamic("encryptionKeyOverride")(__v.asInstanceOf[js.Any]))
      environmentTypeOverride.foreach(__v => __obj.updateDynamic("environmentTypeOverride")(__v.asInstanceOf[js.Any]))
      environmentVariablesOverride.foreach(__v => __obj.updateDynamic("environmentVariablesOverride")(__v.asInstanceOf[js.Any]))
      gitCloneDepthOverride.foreach(__v => __obj.updateDynamic("gitCloneDepthOverride")(__v.asInstanceOf[js.Any]))
      gitSubmodulesConfigOverride.foreach(__v => __obj.updateDynamic("gitSubmodulesConfigOverride")(__v.asInstanceOf[js.Any]))
      idempotencyToken.foreach(__v => __obj.updateDynamic("idempotencyToken")(__v.asInstanceOf[js.Any]))
      imageOverride.foreach(__v => __obj.updateDynamic("imageOverride")(__v.asInstanceOf[js.Any]))
      imagePullCredentialsTypeOverride.foreach(__v => __obj.updateDynamic("imagePullCredentialsTypeOverride")(__v.asInstanceOf[js.Any]))
      insecureSslOverride.foreach(__v => __obj.updateDynamic("insecureSslOverride")(__v.asInstanceOf[js.Any]))
      logsConfigOverride.foreach(__v => __obj.updateDynamic("logsConfigOverride")(__v.asInstanceOf[js.Any]))
      privilegedModeOverride.foreach(__v => __obj.updateDynamic("privilegedModeOverride")(__v.asInstanceOf[js.Any]))
      queuedTimeoutInMinutesOverride.foreach(__v => __obj.updateDynamic("queuedTimeoutInMinutesOverride")(__v.asInstanceOf[js.Any]))
      registryCredentialOverride.foreach(__v => __obj.updateDynamic("registryCredentialOverride")(__v.asInstanceOf[js.Any]))
      reportBuildStatusOverride.foreach(__v => __obj.updateDynamic("reportBuildStatusOverride")(__v.asInstanceOf[js.Any]))
      secondaryArtifactsOverride.foreach(__v => __obj.updateDynamic("secondaryArtifactsOverride")(__v.asInstanceOf[js.Any]))
      secondarySourcesOverride.foreach(__v => __obj.updateDynamic("secondarySourcesOverride")(__v.asInstanceOf[js.Any]))
      secondarySourcesVersionOverride.foreach(__v => __obj.updateDynamic("secondarySourcesVersionOverride")(__v.asInstanceOf[js.Any]))
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
  trait StopBuildBatchInput extends js.Object {
    var id: NonEmptyString
  }

  object StopBuildBatchInput {
    @inline
    def apply(
        id: NonEmptyString
    ): StopBuildBatchInput = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopBuildBatchInput]
    }
  }

  @js.native
  trait StopBuildBatchOutput extends js.Object {
    var buildBatch: js.UndefOr[BuildBatch]
  }

  object StopBuildBatchOutput {
    @inline
    def apply(
        buildBatch: js.UndefOr[BuildBatch] = js.undefined
    ): StopBuildBatchOutput = {
      val __obj = js.Dynamic.literal()
      buildBatch.foreach(__v => __obj.updateDynamic("buildBatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopBuildBatchOutput]
    }
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

  /** A tag, consisting of a key and a value. This tag is available for use by Amazon Web Services services that support tags in CodeBuild.
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

  /** Information about a test case created using a framework such as NUnit or Cucumber. A test case might be a unit test or a configuration test.
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

  /** A filter used to return specific types of test cases. In order to pass the filter, the report must meet all of the filter properties.
    */
  @js.native
  trait TestCaseFilter extends js.Object {
    var keyword: js.UndefOr[String]
    var status: js.UndefOr[String]
  }

  object TestCaseFilter {
    @inline
    def apply(
        keyword: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[String] = js.undefined
    ): TestCaseFilter = {
      val __obj = js.Dynamic.literal()
      keyword.foreach(__v => __obj.updateDynamic("keyword")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestCaseFilter]
    }
  }

  /** Information about a test report.
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
        "statusCounts" -> statusCounts.asInstanceOf[js.Any],
        "total" -> total.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TestReportSummary]
    }
  }

  @js.native
  trait UpdateProjectInput extends js.Object {
    var name: NonEmptyString
    var artifacts: js.UndefOr[ProjectArtifacts]
    var badgeEnabled: js.UndefOr[WrapperBoolean]
    var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig]
    var cache: js.UndefOr[ProjectCache]
    var concurrentBuildLimit: js.UndefOr[WrapperInt]
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
        buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.undefined,
        cache: js.UndefOr[ProjectCache] = js.undefined,
        concurrentBuildLimit: js.UndefOr[WrapperInt] = js.undefined,
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
      buildBatchConfig.foreach(__v => __obj.updateDynamic("buildBatchConfig")(__v.asInstanceOf[js.Any]))
      cache.foreach(__v => __obj.updateDynamic("cache")(__v.asInstanceOf[js.Any]))
      concurrentBuildLimit.foreach(__v => __obj.updateDynamic("concurrentBuildLimit")(__v.asInstanceOf[js.Any]))
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
  trait UpdateProjectVisibilityInput extends js.Object {
    var projectArn: NonEmptyString
    var projectVisibility: ProjectVisibilityType
    var resourceAccessRole: js.UndefOr[NonEmptyString]
  }

  object UpdateProjectVisibilityInput {
    @inline
    def apply(
        projectArn: NonEmptyString,
        projectVisibility: ProjectVisibilityType,
        resourceAccessRole: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateProjectVisibilityInput = {
      val __obj = js.Dynamic.literal(
        "projectArn" -> projectArn.asInstanceOf[js.Any],
        "projectVisibility" -> projectVisibility.asInstanceOf[js.Any]
      )

      resourceAccessRole.foreach(__v => __obj.updateDynamic("resourceAccessRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectVisibilityInput]
    }
  }

  @js.native
  trait UpdateProjectVisibilityOutput extends js.Object {
    var projectArn: js.UndefOr[NonEmptyString]
    var projectVisibility: js.UndefOr[ProjectVisibilityType]
    var publicProjectAlias: js.UndefOr[NonEmptyString]
  }

  object UpdateProjectVisibilityOutput {
    @inline
    def apply(
        projectArn: js.UndefOr[NonEmptyString] = js.undefined,
        projectVisibility: js.UndefOr[ProjectVisibilityType] = js.undefined,
        publicProjectAlias: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateProjectVisibilityOutput = {
      val __obj = js.Dynamic.literal()
      projectArn.foreach(__v => __obj.updateDynamic("projectArn")(__v.asInstanceOf[js.Any]))
      projectVisibility.foreach(__v => __obj.updateDynamic("projectVisibility")(__v.asInstanceOf[js.Any]))
      publicProjectAlias.foreach(__v => __obj.updateDynamic("publicProjectAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectVisibilityOutput]
    }
  }

  @js.native
  trait UpdateReportGroupInput extends js.Object {
    var arn: NonEmptyString
    var exportConfig: js.UndefOr[ReportExportConfig]
    var tags: js.UndefOr[TagList]
  }

  object UpdateReportGroupInput {
    @inline
    def apply(
        arn: NonEmptyString,
        exportConfig: js.UndefOr[ReportExportConfig] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): UpdateReportGroupInput = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      exportConfig.foreach(__v => __obj.updateDynamic("exportConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
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
    var buildType: js.UndefOr[WebhookBuildType]
    var filterGroups: js.UndefOr[FilterGroups]
    var rotateSecret: js.UndefOr[Boolean]
  }

  object UpdateWebhookInput {
    @inline
    def apply(
        projectName: ProjectName,
        branchFilter: js.UndefOr[String] = js.undefined,
        buildType: js.UndefOr[WebhookBuildType] = js.undefined,
        filterGroups: js.UndefOr[FilterGroups] = js.undefined,
        rotateSecret: js.UndefOr[Boolean] = js.undefined
    ): UpdateWebhookInput = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      branchFilter.foreach(__v => __obj.updateDynamic("branchFilter")(__v.asInstanceOf[js.Any]))
      buildType.foreach(__v => __obj.updateDynamic("buildType")(__v.asInstanceOf[js.Any]))
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

  /** Information about the VPC configuration that CodeBuild accesses.
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

  /** Information about a webhook that connects repository events to a build project in CodeBuild.
    */
  @js.native
  trait Webhook extends js.Object {
    var branchFilter: js.UndefOr[String]
    var buildType: js.UndefOr[WebhookBuildType]
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
        buildType: js.UndefOr[WebhookBuildType] = js.undefined,
        filterGroups: js.UndefOr[FilterGroups] = js.undefined,
        lastModifiedSecret: js.UndefOr[Timestamp] = js.undefined,
        payloadUrl: js.UndefOr[NonEmptyString] = js.undefined,
        secret: js.UndefOr[NonEmptyString] = js.undefined,
        url: js.UndefOr[NonEmptyString] = js.undefined
    ): Webhook = {
      val __obj = js.Dynamic.literal()
      branchFilter.foreach(__v => __obj.updateDynamic("branchFilter")(__v.asInstanceOf[js.Any]))
      buildType.foreach(__v => __obj.updateDynamic("buildType")(__v.asInstanceOf[js.Any]))
      filterGroups.foreach(__v => __obj.updateDynamic("filterGroups")(__v.asInstanceOf[js.Any]))
      lastModifiedSecret.foreach(__v => __obj.updateDynamic("lastModifiedSecret")(__v.asInstanceOf[js.Any]))
      payloadUrl.foreach(__v => __obj.updateDynamic("payloadUrl")(__v.asInstanceOf[js.Any]))
      secret.foreach(__v => __obj.updateDynamic("secret")(__v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Webhook]
    }
  }

  /** A filter used to determine which webhooks trigger a build.
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
        "type" -> `type`.asInstanceOf[js.Any]
      )

      excludeMatchedPattern.foreach(__v => __obj.updateDynamic("excludeMatchedPattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebhookFilter]
    }
  }
}
