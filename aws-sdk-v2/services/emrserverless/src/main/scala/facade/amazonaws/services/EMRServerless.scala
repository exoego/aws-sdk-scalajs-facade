package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object emrserverless {
  type ApplicationArn = String
  type ApplicationId = String
  type ApplicationList = js.Array[ApplicationSummary]
  type ApplicationName = String
  type ApplicationStateSet = js.Array[ApplicationState]
  type AutoStopConfigIdleTimeoutMinutesInteger = Int
  type ClientToken = String
  type ConfigurationList = js.Array[Configuration]
  type CpuSize = String
  type Date = js.Date
  type DiskSize = String
  type Duration = Double
  type EncryptionKeyArn = String
  type EngineType = String
  type EntryPointArgument = String
  type EntryPointArguments = js.Array[EntryPointArgument]
  type EntryPointPath = String
  type HiveCliParameters = String
  type IAMRoleArn = String
  type InitScriptPath = String
  type InitialCapacityConfigMap = js.Dictionary[InitialCapacityConfig]
  type JobArn = String
  type JobRunId = String
  type JobRunStateSet = js.Array[JobRunState]
  type JobRunType = String
  type JobRuns = js.Array[JobRunSummary]
  type ListApplicationsRequestMaxResultsInteger = Int
  type ListJobRunsRequestMaxResultsInteger = Int
  type MemorySize = String
  type NextToken = String
  type Query = String
  type ReleaseLabel = String
  type RequestIdentityUserArn = String
  type ResourceArn = String
  type SecurityGroupIds = js.Array[SecurityGroupString]
  type SecurityGroupString = String
  type SensitivePropertiesMap = js.Dictionary[String1024]
  type SparkSubmitParameters = String
  type String1024 = String
  type String256 = String
  type SubnetIds = js.Array[SubnetString]
  type SubnetString = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type UriString = String
  type Url = String
  type WorkerCounts = Double
  type WorkerTypeString = String

  final class EMRServerlessOps(private val service: EMRServerless) extends AnyVal {

    @inline def cancelJobRunFuture(params: CancelJobRunRequest): Future[CancelJobRunResponse] = service.cancelJobRun(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] = service.createApplication(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] = service.deleteApplication(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationRequest): Future[GetApplicationResponse] = service.getApplication(params).promise().toFuture
    @inline def getDashboardForJobRunFuture(params: GetDashboardForJobRunRequest): Future[GetDashboardForJobRunResponse] = service.getDashboardForJobRun(params).promise().toFuture
    @inline def getJobRunFuture(params: GetJobRunRequest): Future[GetJobRunResponse] = service.getJobRun(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] = service.listApplications(params).promise().toFuture
    @inline def listJobRunsFuture(params: ListJobRunsRequest): Future[ListJobRunsResponse] = service.listJobRuns(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startApplicationFuture(params: StartApplicationRequest): Future[StartApplicationResponse] = service.startApplication(params).promise().toFuture
    @inline def startJobRunFuture(params: StartJobRunRequest): Future[StartJobRunResponse] = service.startJobRun(params).promise().toFuture
    @inline def stopApplicationFuture(params: StopApplicationRequest): Future[StopApplicationResponse] = service.stopApplication(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] = service.updateApplication(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/emrserverless", JSImport.Namespace, "AWS.EMRServerless")
  class EMRServerless() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelJobRun(params: CancelJobRunRequest): Request[CancelJobRunResponse] = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse] = js.native
    def getDashboardForJobRun(params: GetDashboardForJobRunRequest): Request[GetDashboardForJobRunResponse] = js.native
    def getJobRun(params: GetJobRunRequest): Request[GetJobRunResponse] = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse] = js.native
    def listJobRuns(params: ListJobRunsRequest): Request[ListJobRunsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse] = js.native
    def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse] = js.native
    def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
  }
  object EMRServerless {
    @inline implicit def toOps(service: EMRServerless): EMRServerlessOps = {
      new EMRServerlessOps(service)
    }
  }

  /** Information about an application. EMR Serverless uses applications to run jobs.
    */
  @js.native
  trait Application extends js.Object {
    var applicationId: ApplicationId
    var arn: ApplicationArn
    var createdAt: Date
    var releaseLabel: ReleaseLabel
    var state: ApplicationState
    var `type`: EngineType
    var updatedAt: Date
    var architecture: js.UndefOr[Architecture]
    var autoStartConfiguration: js.UndefOr[AutoStartConfig]
    var autoStopConfiguration: js.UndefOr[AutoStopConfig]
    var initialCapacity: js.UndefOr[InitialCapacityConfigMap]
    var maximumCapacity: js.UndefOr[MaximumAllowedResources]
    var name: js.UndefOr[ApplicationName]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var stateDetails: js.UndefOr[String256]
    var tags: js.UndefOr[TagMap]
  }

  object Application {
    @inline
    def apply(
        applicationId: ApplicationId,
        arn: ApplicationArn,
        createdAt: Date,
        releaseLabel: ReleaseLabel,
        state: ApplicationState,
        `type`: EngineType,
        updatedAt: Date,
        architecture: js.UndefOr[Architecture] = js.undefined,
        autoStartConfiguration: js.UndefOr[AutoStartConfig] = js.undefined,
        autoStopConfiguration: js.UndefOr[AutoStopConfig] = js.undefined,
        initialCapacity: js.UndefOr[InitialCapacityConfigMap] = js.undefined,
        maximumCapacity: js.UndefOr[MaximumAllowedResources] = js.undefined,
        name: js.UndefOr[ApplicationName] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        stateDetails: js.UndefOr[String256] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Application = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "releaseLabel" -> releaseLabel.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      autoStartConfiguration.foreach(__v => __obj.updateDynamic("autoStartConfiguration")(__v.asInstanceOf[js.Any]))
      autoStopConfiguration.foreach(__v => __obj.updateDynamic("autoStopConfiguration")(__v.asInstanceOf[js.Any]))
      initialCapacity.foreach(__v => __obj.updateDynamic("initialCapacity")(__v.asInstanceOf[js.Any]))
      maximumCapacity.foreach(__v => __obj.updateDynamic("maximumCapacity")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.updateDynamic("networkConfiguration")(__v.asInstanceOf[js.Any]))
      stateDetails.foreach(__v => __obj.updateDynamic("stateDetails")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Application]
    }
  }

  /** The summary of attributes associated with an application.
    */
  @js.native
  trait ApplicationSummary extends js.Object {
    var arn: ApplicationArn
    var createdAt: Date
    var id: ApplicationId
    var releaseLabel: ReleaseLabel
    var state: ApplicationState
    var `type`: EngineType
    var updatedAt: Date
    var architecture: js.UndefOr[Architecture]
    var name: js.UndefOr[ApplicationName]
    var stateDetails: js.UndefOr[String256]
  }

  object ApplicationSummary {
    @inline
    def apply(
        arn: ApplicationArn,
        createdAt: Date,
        id: ApplicationId,
        releaseLabel: ReleaseLabel,
        state: ApplicationState,
        `type`: EngineType,
        updatedAt: Date,
        architecture: js.UndefOr[Architecture] = js.undefined,
        name: js.UndefOr[ApplicationName] = js.undefined,
        stateDetails: js.UndefOr[String256] = js.undefined
    ): ApplicationSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "releaseLabel" -> releaseLabel.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      stateDetails.foreach(__v => __obj.updateDynamic("stateDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSummary]
    }
  }

  /** The configuration for an application to automatically start on job submission.
    */
  @js.native
  trait AutoStartConfig extends js.Object {
    var enabled: js.UndefOr[Boolean]
  }

  object AutoStartConfig {
    @inline
    def apply(
        enabled: js.UndefOr[Boolean] = js.undefined
    ): AutoStartConfig = {
      val __obj = js.Dynamic.literal()
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoStartConfig]
    }
  }

  /** The configuration for an application to automatically stop after a certain amount of time being idle.
    */
  @js.native
  trait AutoStopConfig extends js.Object {
    var enabled: js.UndefOr[Boolean]
    var idleTimeoutMinutes: js.UndefOr[AutoStopConfigIdleTimeoutMinutesInteger]
  }

  object AutoStopConfig {
    @inline
    def apply(
        enabled: js.UndefOr[Boolean] = js.undefined,
        idleTimeoutMinutes: js.UndefOr[AutoStopConfigIdleTimeoutMinutesInteger] = js.undefined
    ): AutoStopConfig = {
      val __obj = js.Dynamic.literal()
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      idleTimeoutMinutes.foreach(__v => __obj.updateDynamic("idleTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoStopConfig]
    }
  }

  @js.native
  trait CancelJobRunRequest extends js.Object {
    var applicationId: ApplicationId
    var jobRunId: JobRunId
  }

  object CancelJobRunRequest {
    @inline
    def apply(
        applicationId: ApplicationId,
        jobRunId: JobRunId
    ): CancelJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "jobRunId" -> jobRunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelJobRunRequest]
    }
  }

  @js.native
  trait CancelJobRunResponse extends js.Object {
    var applicationId: ApplicationId
    var jobRunId: JobRunId
  }

  object CancelJobRunResponse {
    @inline
    def apply(
        applicationId: ApplicationId,
        jobRunId: JobRunId
    ): CancelJobRunResponse = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "jobRunId" -> jobRunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelJobRunResponse]
    }
  }

  /** A configuration specification to be used when provisioning an application. A configuration consists of a classification, properties, and optional nested configurations. A classification refers to an application-specific configuration file. Properties are the settings you want to change in that file.
    */
  @js.native
  trait Configuration extends js.Object {
    var classification: String1024
    var configurations: js.UndefOr[ConfigurationList]
    var properties: js.UndefOr[SensitivePropertiesMap]
  }

  object Configuration {
    @inline
    def apply(
        classification: String1024,
        configurations: js.UndefOr[ConfigurationList] = js.undefined,
        properties: js.UndefOr[SensitivePropertiesMap] = js.undefined
    ): Configuration = {
      val __obj = js.Dynamic.literal(
        "classification" -> classification.asInstanceOf[js.Any]
      )

      configurations.foreach(__v => __obj.updateDynamic("configurations")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Configuration]
    }
  }

  /** A configuration specification to be used to override existing configurations.
    */
  @js.native
  trait ConfigurationOverrides extends js.Object {
    var applicationConfiguration: js.UndefOr[ConfigurationList]
    var monitoringConfiguration: js.UndefOr[MonitoringConfiguration]
  }

  object ConfigurationOverrides {
    @inline
    def apply(
        applicationConfiguration: js.UndefOr[ConfigurationList] = js.undefined,
        monitoringConfiguration: js.UndefOr[MonitoringConfiguration] = js.undefined
    ): ConfigurationOverrides = {
      val __obj = js.Dynamic.literal()
      applicationConfiguration.foreach(__v => __obj.updateDynamic("applicationConfiguration")(__v.asInstanceOf[js.Any]))
      monitoringConfiguration.foreach(__v => __obj.updateDynamic("monitoringConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationOverrides]
    }
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var clientToken: ClientToken
    var releaseLabel: ReleaseLabel
    var `type`: EngineType
    var architecture: js.UndefOr[Architecture]
    var autoStartConfiguration: js.UndefOr[AutoStartConfig]
    var autoStopConfiguration: js.UndefOr[AutoStopConfig]
    var initialCapacity: js.UndefOr[InitialCapacityConfigMap]
    var maximumCapacity: js.UndefOr[MaximumAllowedResources]
    var name: js.UndefOr[ApplicationName]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var tags: js.UndefOr[TagMap]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        releaseLabel: ReleaseLabel,
        `type`: EngineType,
        architecture: js.UndefOr[Architecture] = js.undefined,
        autoStartConfiguration: js.UndefOr[AutoStartConfig] = js.undefined,
        autoStopConfiguration: js.UndefOr[AutoStopConfig] = js.undefined,
        initialCapacity: js.UndefOr[InitialCapacityConfigMap] = js.undefined,
        maximumCapacity: js.UndefOr[MaximumAllowedResources] = js.undefined,
        name: js.UndefOr[ApplicationName] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "releaseLabel" -> releaseLabel.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      autoStartConfiguration.foreach(__v => __obj.updateDynamic("autoStartConfiguration")(__v.asInstanceOf[js.Any]))
      autoStopConfiguration.foreach(__v => __obj.updateDynamic("autoStopConfiguration")(__v.asInstanceOf[js.Any]))
      initialCapacity.foreach(__v => __obj.updateDynamic("initialCapacity")(__v.asInstanceOf[js.Any]))
      maximumCapacity.foreach(__v => __obj.updateDynamic("maximumCapacity")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.updateDynamic("networkConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var applicationId: ApplicationId
    var arn: ApplicationArn
    var name: js.UndefOr[ApplicationName]
  }

  object CreateApplicationResponse {
    @inline
    def apply(
        applicationId: ApplicationId,
        arn: ApplicationArn,
        name: js.UndefOr[ApplicationName] = js.undefined
    ): CreateApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "arn" -> arn.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var applicationId: ApplicationId
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        applicationId: ApplicationId
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteApplicationResponse extends js.Object

  object DeleteApplicationResponse {
    @inline
    def apply(): DeleteApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationResponse]
    }
  }

  @js.native
  trait GetApplicationRequest extends js.Object {
    var applicationId: ApplicationId
  }

  object GetApplicationRequest {
    @inline
    def apply(
        applicationId: ApplicationId
    ): GetApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationRequest]
    }
  }

  @js.native
  trait GetApplicationResponse extends js.Object {
    var application: Application
  }

  object GetApplicationResponse {
    @inline
    def apply(
        application: Application
    ): GetApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationResponse]
    }
  }

  @js.native
  trait GetDashboardForJobRunRequest extends js.Object {
    var applicationId: ApplicationId
    var jobRunId: JobRunId
  }

  object GetDashboardForJobRunRequest {
    @inline
    def apply(
        applicationId: ApplicationId,
        jobRunId: JobRunId
    ): GetDashboardForJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "jobRunId" -> jobRunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDashboardForJobRunRequest]
    }
  }

  @js.native
  trait GetDashboardForJobRunResponse extends js.Object {
    var url: js.UndefOr[Url]
  }

  object GetDashboardForJobRunResponse {
    @inline
    def apply(
        url: js.UndefOr[Url] = js.undefined
    ): GetDashboardForJobRunResponse = {
      val __obj = js.Dynamic.literal()
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDashboardForJobRunResponse]
    }
  }

  @js.native
  trait GetJobRunRequest extends js.Object {
    var applicationId: ApplicationId
    var jobRunId: JobRunId
  }

  object GetJobRunRequest {
    @inline
    def apply(
        applicationId: ApplicationId,
        jobRunId: JobRunId
    ): GetJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "jobRunId" -> jobRunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobRunRequest]
    }
  }

  @js.native
  trait GetJobRunResponse extends js.Object {
    var jobRun: JobRun
  }

  object GetJobRunResponse {
    @inline
    def apply(
        jobRun: JobRun
    ): GetJobRunResponse = {
      val __obj = js.Dynamic.literal(
        "jobRun" -> jobRun.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobRunResponse]
    }
  }

  /** The configurations for the Hive job driver.
    */
  @js.native
  trait Hive extends js.Object {
    var query: Query
    var initQueryFile: js.UndefOr[InitScriptPath]
    var parameters: js.UndefOr[HiveCliParameters]
  }

  object Hive {
    @inline
    def apply(
        query: Query,
        initQueryFile: js.UndefOr[InitScriptPath] = js.undefined,
        parameters: js.UndefOr[HiveCliParameters] = js.undefined
    ): Hive = {
      val __obj = js.Dynamic.literal(
        "query" -> query.asInstanceOf[js.Any]
      )

      initQueryFile.foreach(__v => __obj.updateDynamic("initQueryFile")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hive]
    }
  }

  /** The initial capacity configuration per worker.
    */
  @js.native
  trait InitialCapacityConfig extends js.Object {
    var workerCount: WorkerCounts
    var workerConfiguration: js.UndefOr[WorkerResourceConfig]
  }

  object InitialCapacityConfig {
    @inline
    def apply(
        workerCount: WorkerCounts,
        workerConfiguration: js.UndefOr[WorkerResourceConfig] = js.undefined
    ): InitialCapacityConfig = {
      val __obj = js.Dynamic.literal(
        "workerCount" -> workerCount.asInstanceOf[js.Any]
      )

      workerConfiguration.foreach(__v => __obj.updateDynamic("workerConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitialCapacityConfig]
    }
  }

  /** The driver that the job runs on.
    */
  @js.native
  trait JobDriver extends js.Object {
    var hive: js.UndefOr[Hive]
    var sparkSubmit: js.UndefOr[SparkSubmit]
  }

  object JobDriver {
    @inline
    def apply(
        hive: js.UndefOr[Hive] = js.undefined,
        sparkSubmit: js.UndefOr[SparkSubmit] = js.undefined
    ): JobDriver = {
      val __obj = js.Dynamic.literal()
      hive.foreach(__v => __obj.updateDynamic("hive")(__v.asInstanceOf[js.Any]))
      sparkSubmit.foreach(__v => __obj.updateDynamic("sparkSubmit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDriver]
    }
  }

  /** Information about a job run. A job run is a unit of work, such as a Spark JAR, Hive query, or SparkSQL query, that you submit to an EMR Serverless application.
    */
  @js.native
  trait JobRun extends js.Object {
    var applicationId: ApplicationId
    var arn: JobArn
    var createdAt: Date
    var createdBy: RequestIdentityUserArn
    var executionRole: IAMRoleArn
    var jobDriver: JobDriver
    var jobRunId: JobRunId
    var releaseLabel: ReleaseLabel
    var state: JobRunState
    var stateDetails: String256
    var updatedAt: Date
    var configurationOverrides: js.UndefOr[ConfigurationOverrides]
    var name: js.UndefOr[String256]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var tags: js.UndefOr[TagMap]
    var totalExecutionDurationSeconds: js.UndefOr[Int]
    var totalResourceUtilization: js.UndefOr[TotalResourceUtilization]
  }

  object JobRun {
    @inline
    def apply(
        applicationId: ApplicationId,
        arn: JobArn,
        createdAt: Date,
        createdBy: RequestIdentityUserArn,
        executionRole: IAMRoleArn,
        jobDriver: JobDriver,
        jobRunId: JobRunId,
        releaseLabel: ReleaseLabel,
        state: JobRunState,
        stateDetails: String256,
        updatedAt: Date,
        configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined,
        name: js.UndefOr[String256] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        totalExecutionDurationSeconds: js.UndefOr[Int] = js.undefined,
        totalResourceUtilization: js.UndefOr[TotalResourceUtilization] = js.undefined
    ): JobRun = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "createdBy" -> createdBy.asInstanceOf[js.Any],
        "executionRole" -> executionRole.asInstanceOf[js.Any],
        "jobDriver" -> jobDriver.asInstanceOf[js.Any],
        "jobRunId" -> jobRunId.asInstanceOf[js.Any],
        "releaseLabel" -> releaseLabel.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "stateDetails" -> stateDetails.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      configurationOverrides.foreach(__v => __obj.updateDynamic("configurationOverrides")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.updateDynamic("networkConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      totalExecutionDurationSeconds.foreach(__v => __obj.updateDynamic("totalExecutionDurationSeconds")(__v.asInstanceOf[js.Any]))
      totalResourceUtilization.foreach(__v => __obj.updateDynamic("totalResourceUtilization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobRun]
    }
  }

  /** The summary of attributes associated with a job run.
    */
  @js.native
  trait JobRunSummary extends js.Object {
    var applicationId: ApplicationId
    var arn: JobArn
    var createdAt: Date
    var createdBy: RequestIdentityUserArn
    var executionRole: IAMRoleArn
    var id: JobRunId
    var releaseLabel: ReleaseLabel
    var state: JobRunState
    var stateDetails: String256
    var updatedAt: Date
    var name: js.UndefOr[String256]
    var `type`: js.UndefOr[JobRunType]
  }

  object JobRunSummary {
    @inline
    def apply(
        applicationId: ApplicationId,
        arn: JobArn,
        createdAt: Date,
        createdBy: RequestIdentityUserArn,
        executionRole: IAMRoleArn,
        id: JobRunId,
        releaseLabel: ReleaseLabel,
        state: JobRunState,
        stateDetails: String256,
        updatedAt: Date,
        name: js.UndefOr[String256] = js.undefined,
        `type`: js.UndefOr[JobRunType] = js.undefined
    ): JobRunSummary = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "createdBy" -> createdBy.asInstanceOf[js.Any],
        "executionRole" -> executionRole.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "releaseLabel" -> releaseLabel.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "stateDetails" -> stateDetails.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobRunSummary]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var maxResults: js.UndefOr[ListApplicationsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
    var states: js.UndefOr[ApplicationStateSet]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListApplicationsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        states: js.UndefOr[ApplicationStateSet] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      states.foreach(__v => __obj.updateDynamic("states")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var applications: ApplicationList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsResponse {
    @inline
    def apply(
        applications: ApplicationList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsResponse = {
      val __obj = js.Dynamic.literal(
        "applications" -> applications.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsResponse]
    }
  }

  @js.native
  trait ListJobRunsRequest extends js.Object {
    var applicationId: ApplicationId
    var createdAtAfter: js.UndefOr[Date]
    var createdAtBefore: js.UndefOr[Date]
    var maxResults: js.UndefOr[ListJobRunsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
    var states: js.UndefOr[JobRunStateSet]
  }

  object ListJobRunsRequest {
    @inline
    def apply(
        applicationId: ApplicationId,
        createdAtAfter: js.UndefOr[Date] = js.undefined,
        createdAtBefore: js.UndefOr[Date] = js.undefined,
        maxResults: js.UndefOr[ListJobRunsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        states: js.UndefOr[JobRunStateSet] = js.undefined
    ): ListJobRunsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      createdAtAfter.foreach(__v => __obj.updateDynamic("createdAtAfter")(__v.asInstanceOf[js.Any]))
      createdAtBefore.foreach(__v => __obj.updateDynamic("createdAtBefore")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      states.foreach(__v => __obj.updateDynamic("states")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobRunsRequest]
    }
  }

  @js.native
  trait ListJobRunsResponse extends js.Object {
    var jobRuns: JobRuns
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobRunsResponse {
    @inline
    def apply(
        jobRuns: JobRuns,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobRunsResponse = {
      val __obj = js.Dynamic.literal(
        "jobRuns" -> jobRuns.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobRunsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The managed log persistence configuration for a job run.
    */
  @js.native
  trait ManagedPersistenceMonitoringConfiguration extends js.Object {
    var enabled: js.UndefOr[Boolean]
    var encryptionKeyArn: js.UndefOr[EncryptionKeyArn]
  }

  object ManagedPersistenceMonitoringConfiguration {
    @inline
    def apply(
        enabled: js.UndefOr[Boolean] = js.undefined,
        encryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined
    ): ManagedPersistenceMonitoringConfiguration = {
      val __obj = js.Dynamic.literal()
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      encryptionKeyArn.foreach(__v => __obj.updateDynamic("encryptionKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedPersistenceMonitoringConfiguration]
    }
  }

  /** The maximum allowed cumulative resources for an application. No new resources will be created once the limit is hit.
    */
  @js.native
  trait MaximumAllowedResources extends js.Object {
    var cpu: CpuSize
    var memory: MemorySize
    var disk: js.UndefOr[DiskSize]
  }

  object MaximumAllowedResources {
    @inline
    def apply(
        cpu: CpuSize,
        memory: MemorySize,
        disk: js.UndefOr[DiskSize] = js.undefined
    ): MaximumAllowedResources = {
      val __obj = js.Dynamic.literal(
        "cpu" -> cpu.asInstanceOf[js.Any],
        "memory" -> memory.asInstanceOf[js.Any]
      )

      disk.foreach(__v => __obj.updateDynamic("disk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaximumAllowedResources]
    }
  }

  /** The configuration setting for monitoring.
    */
  @js.native
  trait MonitoringConfiguration extends js.Object {
    var managedPersistenceMonitoringConfiguration: js.UndefOr[ManagedPersistenceMonitoringConfiguration]
    var s3MonitoringConfiguration: js.UndefOr[S3MonitoringConfiguration]
  }

  object MonitoringConfiguration {
    @inline
    def apply(
        managedPersistenceMonitoringConfiguration: js.UndefOr[ManagedPersistenceMonitoringConfiguration] = js.undefined,
        s3MonitoringConfiguration: js.UndefOr[S3MonitoringConfiguration] = js.undefined
    ): MonitoringConfiguration = {
      val __obj = js.Dynamic.literal()
      managedPersistenceMonitoringConfiguration.foreach(__v => __obj.updateDynamic("managedPersistenceMonitoringConfiguration")(__v.asInstanceOf[js.Any]))
      s3MonitoringConfiguration.foreach(__v => __obj.updateDynamic("s3MonitoringConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringConfiguration]
    }
  }

  /** The network configuration for customer VPC connectivity.
    */
  @js.native
  trait NetworkConfiguration extends js.Object {
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var subnetIds: js.UndefOr[SubnetIds]
  }

  object NetworkConfiguration {
    @inline
    def apply(
        securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        subnetIds: js.UndefOr[SubnetIds] = js.undefined
    ): NetworkConfiguration = {
      val __obj = js.Dynamic.literal()
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConfiguration]
    }
  }

  /** The Amazon S3 configuration for monitoring log publishing. You can configure your jobs to send log information to Amazon S3.
    */
  @js.native
  trait S3MonitoringConfiguration extends js.Object {
    var encryptionKeyArn: js.UndefOr[EncryptionKeyArn]
    var logUri: js.UndefOr[UriString]
  }

  object S3MonitoringConfiguration {
    @inline
    def apply(
        encryptionKeyArn: js.UndefOr[EncryptionKeyArn] = js.undefined,
        logUri: js.UndefOr[UriString] = js.undefined
    ): S3MonitoringConfiguration = {
      val __obj = js.Dynamic.literal()
      encryptionKeyArn.foreach(__v => __obj.updateDynamic("encryptionKeyArn")(__v.asInstanceOf[js.Any]))
      logUri.foreach(__v => __obj.updateDynamic("logUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3MonitoringConfiguration]
    }
  }

  /** The configurations for the Spark submit job driver.
    */
  @js.native
  trait SparkSubmit extends js.Object {
    var entryPoint: EntryPointPath
    var entryPointArguments: js.UndefOr[EntryPointArguments]
    var sparkSubmitParameters: js.UndefOr[SparkSubmitParameters]
  }

  object SparkSubmit {
    @inline
    def apply(
        entryPoint: EntryPointPath,
        entryPointArguments: js.UndefOr[EntryPointArguments] = js.undefined,
        sparkSubmitParameters: js.UndefOr[SparkSubmitParameters] = js.undefined
    ): SparkSubmit = {
      val __obj = js.Dynamic.literal(
        "entryPoint" -> entryPoint.asInstanceOf[js.Any]
      )

      entryPointArguments.foreach(__v => __obj.updateDynamic("entryPointArguments")(__v.asInstanceOf[js.Any]))
      sparkSubmitParameters.foreach(__v => __obj.updateDynamic("sparkSubmitParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SparkSubmit]
    }
  }

  @js.native
  trait StartApplicationRequest extends js.Object {
    var applicationId: ApplicationId
  }

  object StartApplicationRequest {
    @inline
    def apply(
        applicationId: ApplicationId
    ): StartApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartApplicationRequest]
    }
  }

  @js.native
  trait StartApplicationResponse extends js.Object

  object StartApplicationResponse {
    @inline
    def apply(): StartApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartApplicationResponse]
    }
  }

  @js.native
  trait StartJobRunRequest extends js.Object {
    var applicationId: ApplicationId
    var clientToken: ClientToken
    var executionRoleArn: IAMRoleArn
    var configurationOverrides: js.UndefOr[ConfigurationOverrides]
    var executionTimeoutMinutes: js.UndefOr[Duration]
    var jobDriver: js.UndefOr[JobDriver]
    var name: js.UndefOr[String256]
    var tags: js.UndefOr[TagMap]
  }

  object StartJobRunRequest {
    @inline
    def apply(
        applicationId: ApplicationId,
        clientToken: ClientToken,
        executionRoleArn: IAMRoleArn,
        configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined,
        executionTimeoutMinutes: js.UndefOr[Duration] = js.undefined,
        jobDriver: js.UndefOr[JobDriver] = js.undefined,
        name: js.UndefOr[String256] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "executionRoleArn" -> executionRoleArn.asInstanceOf[js.Any]
      )

      configurationOverrides.foreach(__v => __obj.updateDynamic("configurationOverrides")(__v.asInstanceOf[js.Any]))
      executionTimeoutMinutes.foreach(__v => __obj.updateDynamic("executionTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      jobDriver.foreach(__v => __obj.updateDynamic("jobDriver")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartJobRunRequest]
    }
  }

  @js.native
  trait StartJobRunResponse extends js.Object {
    var applicationId: ApplicationId
    var arn: JobArn
    var jobRunId: JobRunId
  }

  object StartJobRunResponse {
    @inline
    def apply(
        applicationId: ApplicationId,
        arn: JobArn,
        jobRunId: JobRunId
    ): StartJobRunResponse = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "arn" -> arn.asInstanceOf[js.Any],
        "jobRunId" -> jobRunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartJobRunResponse]
    }
  }

  @js.native
  trait StopApplicationRequest extends js.Object {
    var applicationId: ApplicationId
  }

  object StopApplicationRequest {
    @inline
    def apply(
        applicationId: ApplicationId
    ): StopApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopApplicationRequest]
    }
  }

  @js.native
  trait StopApplicationResponse extends js.Object

  object StopApplicationResponse {
    @inline
    def apply(): StopApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopApplicationResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** The aggregate vCPU, memory, and storage resources used from the time job start executing till the time job is terminated, rounded up to the nearest second.
    */
  @js.native
  trait TotalResourceUtilization extends js.Object {
    var memoryGBHour: js.UndefOr[Double]
    var storageGBHour: js.UndefOr[Double]
    var vCPUHour: js.UndefOr[Double]
  }

  object TotalResourceUtilization {
    @inline
    def apply(
        memoryGBHour: js.UndefOr[Double] = js.undefined,
        storageGBHour: js.UndefOr[Double] = js.undefined,
        vCPUHour: js.UndefOr[Double] = js.undefined
    ): TotalResourceUtilization = {
      val __obj = js.Dynamic.literal()
      memoryGBHour.foreach(__v => __obj.updateDynamic("memoryGBHour")(__v.asInstanceOf[js.Any]))
      storageGBHour.foreach(__v => __obj.updateDynamic("storageGBHour")(__v.asInstanceOf[js.Any]))
      vCPUHour.foreach(__v => __obj.updateDynamic("vCPUHour")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TotalResourceUtilization]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var applicationId: ApplicationId
    var clientToken: ClientToken
    var architecture: js.UndefOr[Architecture]
    var autoStartConfiguration: js.UndefOr[AutoStartConfig]
    var autoStopConfiguration: js.UndefOr[AutoStopConfig]
    var initialCapacity: js.UndefOr[InitialCapacityConfigMap]
    var maximumCapacity: js.UndefOr[MaximumAllowedResources]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        applicationId: ApplicationId,
        clientToken: ClientToken,
        architecture: js.UndefOr[Architecture] = js.undefined,
        autoStartConfiguration: js.UndefOr[AutoStartConfig] = js.undefined,
        autoStopConfiguration: js.UndefOr[AutoStopConfig] = js.undefined,
        initialCapacity: js.UndefOr[InitialCapacityConfigMap] = js.undefined,
        maximumCapacity: js.UndefOr[MaximumAllowedResources] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "clientToken" -> clientToken.asInstanceOf[js.Any]
      )

      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      autoStartConfiguration.foreach(__v => __obj.updateDynamic("autoStartConfiguration")(__v.asInstanceOf[js.Any]))
      autoStopConfiguration.foreach(__v => __obj.updateDynamic("autoStopConfiguration")(__v.asInstanceOf[js.Any]))
      initialCapacity.foreach(__v => __obj.updateDynamic("initialCapacity")(__v.asInstanceOf[js.Any]))
      maximumCapacity.foreach(__v => __obj.updateDynamic("maximumCapacity")(__v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.updateDynamic("networkConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {
    var application: Application
  }

  object UpdateApplicationResponse {
    @inline
    def apply(
        application: Application
    ): UpdateApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApplicationResponse]
    }
  }

  /** The cumulative configuration requirements for every worker instance of the worker type.
    */
  @js.native
  trait WorkerResourceConfig extends js.Object {
    var cpu: CpuSize
    var memory: MemorySize
    var disk: js.UndefOr[DiskSize]
  }

  object WorkerResourceConfig {
    @inline
    def apply(
        cpu: CpuSize,
        memory: MemorySize,
        disk: js.UndefOr[DiskSize] = js.undefined
    ): WorkerResourceConfig = {
      val __obj = js.Dynamic.literal(
        "cpu" -> cpu.asInstanceOf[js.Any],
        "memory" -> memory.asInstanceOf[js.Any]
      )

      disk.foreach(__v => __obj.updateDynamic("disk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkerResourceConfig]
    }
  }
}
