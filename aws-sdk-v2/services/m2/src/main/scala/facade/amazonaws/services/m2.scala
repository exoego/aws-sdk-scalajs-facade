package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object m2 {
  type AlternateKeyList = js.Array[AlternateKey]
  type ApplicationSummaryList = js.Array[ApplicationSummary]
  type ApplicationVersionSummaryList = js.Array[ApplicationVersionSummary]
  type Arn = String
  type ArnList = js.Array[Arn]
  type BatchJobDefinitions = js.Array[BatchJobDefinition]
  type BatchJobExecutionSummaryList = js.Array[BatchJobExecutionSummary]
  type BatchJobParametersMap = js.Dictionary[BatchParamValue]
  type BatchParamKey = String
  type BatchParamValue = String
  type CapacityValue = Int
  type DataSetImportList = js.Array[DataSetImportItem]
  type DataSetImportTaskList = js.Array[DataSetImportTask]
  type DataSetsSummaryList = js.Array[DataSetSummary]
  type DeploymentList = js.Array[DeploymentSummary]
  type EngineVersion = String
  type EngineVersionsSummaryList = js.Array[EngineVersionsSummary]
  type EntityDescription = String
  type EntityName = String
  type EntityNameList = js.Array[EntityName]
  type EnvironmentSummaryList = js.Array[EnvironmentSummary]
  type Identifier = String
  type IdentifierList = js.Array[Identifier]
  type LogGroupIdentifier = String
  type LogGroupSummaries = js.Array[LogGroupSummary]
  type MaxResults = Int
  type NextToken = String
  type PortList = js.Array[Int]
  type StorageConfigurationList = js.Array[StorageConfiguration]
  type String100 = String
  type String20 = String
  type String200 = String
  type String2000 = String
  type String50 = String
  type String50List = js.Array[String50]
  type StringFree65000 = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type Version = Int

  final class M2Ops(private val service: M2) extends AnyVal {

    @inline def cancelBatchJobExecutionFuture(params: CancelBatchJobExecutionRequest): Future[CancelBatchJobExecutionResponse] = service.cancelBatchJobExecution(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] = service.createApplication(params).promise().toFuture
    @inline def createDataSetImportTaskFuture(params: CreateDataSetImportTaskRequest): Future[CreateDataSetImportTaskResponse] = service.createDataSetImportTask(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResponse] = service.createDeployment(params).promise().toFuture
    @inline def createEnvironmentFuture(params: CreateEnvironmentRequest): Future[CreateEnvironmentResponse] = service.createEnvironment(params).promise().toFuture
    @inline def deleteApplicationFromEnvironmentFuture(params: DeleteApplicationFromEnvironmentRequest): Future[DeleteApplicationFromEnvironmentResponse] = service.deleteApplicationFromEnvironment(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] = service.deleteApplication(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentRequest): Future[DeleteEnvironmentResponse] = service.deleteEnvironment(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationRequest): Future[GetApplicationResponse] = service.getApplication(params).promise().toFuture
    @inline def getApplicationVersionFuture(params: GetApplicationVersionRequest): Future[GetApplicationVersionResponse] = service.getApplicationVersion(params).promise().toFuture
    @inline def getBatchJobExecutionFuture(params: GetBatchJobExecutionRequest): Future[GetBatchJobExecutionResponse] = service.getBatchJobExecution(params).promise().toFuture
    @inline def getDataSetDetailsFuture(params: GetDataSetDetailsRequest): Future[GetDataSetDetailsResponse] = service.getDataSetDetails(params).promise().toFuture
    @inline def getDataSetImportTaskFuture(params: GetDataSetImportTaskRequest): Future[GetDataSetImportTaskResponse] = service.getDataSetImportTask(params).promise().toFuture
    @inline def getDeploymentFuture(params: GetDeploymentRequest): Future[GetDeploymentResponse] = service.getDeployment(params).promise().toFuture
    @inline def getEnvironmentFuture(params: GetEnvironmentRequest): Future[GetEnvironmentResponse] = service.getEnvironment(params).promise().toFuture
    @inline def listApplicationVersionsFuture(params: ListApplicationVersionsRequest): Future[ListApplicationVersionsResponse] = service.listApplicationVersions(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] = service.listApplications(params).promise().toFuture
    @inline def listBatchJobDefinitionsFuture(params: ListBatchJobDefinitionsRequest): Future[ListBatchJobDefinitionsResponse] = service.listBatchJobDefinitions(params).promise().toFuture
    @inline def listBatchJobExecutionsFuture(params: ListBatchJobExecutionsRequest): Future[ListBatchJobExecutionsResponse] = service.listBatchJobExecutions(params).promise().toFuture
    @inline def listDataSetImportHistoryFuture(params: ListDataSetImportHistoryRequest): Future[ListDataSetImportHistoryResponse] = service.listDataSetImportHistory(params).promise().toFuture
    @inline def listDataSetsFuture(params: ListDataSetsRequest): Future[ListDataSetsResponse] = service.listDataSets(params).promise().toFuture
    @inline def listDeploymentsFuture(params: ListDeploymentsRequest): Future[ListDeploymentsResponse] = service.listDeployments(params).promise().toFuture
    @inline def listEngineVersionsFuture(params: ListEngineVersionsRequest): Future[ListEngineVersionsResponse] = service.listEngineVersions(params).promise().toFuture
    @inline def listEnvironmentsFuture(params: ListEnvironmentsRequest): Future[ListEnvironmentsResponse] = service.listEnvironments(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startApplicationFuture(params: StartApplicationRequest): Future[StartApplicationResponse] = service.startApplication(params).promise().toFuture
    @inline def startBatchJobFuture(params: StartBatchJobRequest): Future[StartBatchJobResponse] = service.startBatchJob(params).promise().toFuture
    @inline def stopApplicationFuture(params: StopApplicationRequest): Future[StopApplicationResponse] = service.stopApplication(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] = service.updateApplication(params).promise().toFuture
    @inline def updateEnvironmentFuture(params: UpdateEnvironmentRequest): Future[UpdateEnvironmentResponse] = service.updateEnvironment(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/m2", JSImport.Namespace, "AWS.M2")
  class M2() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelBatchJobExecution(params: CancelBatchJobExecutionRequest): Request[CancelBatchJobExecutionResponse] = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def createDataSetImportTask(params: CreateDataSetImportTaskRequest): Request[CreateDataSetImportTaskResponse] = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse] = js.native
    def createEnvironment(params: CreateEnvironmentRequest): Request[CreateEnvironmentResponse] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def deleteApplicationFromEnvironment(params: DeleteApplicationFromEnvironmentRequest): Request[DeleteApplicationFromEnvironmentResponse] = js.native
    def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResponse] = js.native
    def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse] = js.native
    def getApplicationVersion(params: GetApplicationVersionRequest): Request[GetApplicationVersionResponse] = js.native
    def getBatchJobExecution(params: GetBatchJobExecutionRequest): Request[GetBatchJobExecutionResponse] = js.native
    def getDataSetDetails(params: GetDataSetDetailsRequest): Request[GetDataSetDetailsResponse] = js.native
    def getDataSetImportTask(params: GetDataSetImportTaskRequest): Request[GetDataSetImportTaskResponse] = js.native
    def getDeployment(params: GetDeploymentRequest): Request[GetDeploymentResponse] = js.native
    def getEnvironment(params: GetEnvironmentRequest): Request[GetEnvironmentResponse] = js.native
    def listApplicationVersions(params: ListApplicationVersionsRequest): Request[ListApplicationVersionsResponse] = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse] = js.native
    def listBatchJobDefinitions(params: ListBatchJobDefinitionsRequest): Request[ListBatchJobDefinitionsResponse] = js.native
    def listBatchJobExecutions(params: ListBatchJobExecutionsRequest): Request[ListBatchJobExecutionsResponse] = js.native
    def listDataSetImportHistory(params: ListDataSetImportHistoryRequest): Request[ListDataSetImportHistoryResponse] = js.native
    def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse] = js.native
    def listDeployments(params: ListDeploymentsRequest): Request[ListDeploymentsResponse] = js.native
    def listEngineVersions(params: ListEngineVersionsRequest): Request[ListEngineVersionsResponse] = js.native
    def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse] = js.native
    def startBatchJob(params: StartBatchJobRequest): Request[StartBatchJobResponse] = js.native
    def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
    def updateEnvironment(params: UpdateEnvironmentRequest): Request[UpdateEnvironmentResponse] = js.native
  }
  object M2 {
    @inline implicit def toOps(service: M2): M2Ops = {
      new M2Ops(service)
    }
  }

  /** Defines an alternate key. This value is optional. A legacy data set might not have any alternate key defined but if those alternate keys definitions exist, provide them, as some applications will make use of them.
    */
  @js.native
  trait AlternateKey extends js.Object {
    var length: Int
    var offset: Int
    var allowDuplicates: js.UndefOr[Boolean]
    var name: js.UndefOr[String]
  }

  object AlternateKey {
    @inline
    def apply(
        length: Int,
        offset: Int,
        allowDuplicates: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): AlternateKey = {
      val __obj = js.Dynamic.literal(
        "length" -> length.asInstanceOf[js.Any],
        "offset" -> offset.asInstanceOf[js.Any]
      )

      allowDuplicates.foreach(__v => __obj.updateDynamic("allowDuplicates")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlternateKey]
    }
  }

  /** A subset of the possible application attributes. Used in the application list.
    */
  @js.native
  trait ApplicationSummary extends js.Object {
    var applicationArn: Arn
    var applicationId: Identifier
    var applicationVersion: Version
    var creationTime: Timestamp
    var engineType: EngineType
    var name: EntityName
    var status: ApplicationLifecycle
    var deploymentStatus: js.UndefOr[ApplicationDeploymentLifecycle]
    var description: js.UndefOr[EntityDescription]
    var environmentId: js.UndefOr[Identifier]
    var lastStartTime: js.UndefOr[Timestamp]
    var versionStatus: js.UndefOr[ApplicationVersionLifecycle]
  }

  object ApplicationSummary {
    @inline
    def apply(
        applicationArn: Arn,
        applicationId: Identifier,
        applicationVersion: Version,
        creationTime: Timestamp,
        engineType: EngineType,
        name: EntityName,
        status: ApplicationLifecycle,
        deploymentStatus: js.UndefOr[ApplicationDeploymentLifecycle] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        environmentId: js.UndefOr[Identifier] = js.undefined,
        lastStartTime: js.UndefOr[Timestamp] = js.undefined,
        versionStatus: js.UndefOr[ApplicationVersionLifecycle] = js.undefined
    ): ApplicationSummary = {
      val __obj = js.Dynamic.literal(
        "applicationArn" -> applicationArn.asInstanceOf[js.Any],
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "engineType" -> engineType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      deploymentStatus.foreach(__v => __obj.updateDynamic("deploymentStatus")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      environmentId.foreach(__v => __obj.updateDynamic("environmentId")(__v.asInstanceOf[js.Any]))
      lastStartTime.foreach(__v => __obj.updateDynamic("lastStartTime")(__v.asInstanceOf[js.Any]))
      versionStatus.foreach(__v => __obj.updateDynamic("versionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSummary]
    }
  }

  /** Defines an application version summary.
    */
  @js.native
  trait ApplicationVersionSummary extends js.Object {
    var applicationVersion: Version
    var creationTime: Timestamp
    var status: ApplicationVersionLifecycle
    var statusReason: js.UndefOr[String]
  }

  object ApplicationVersionSummary {
    @inline
    def apply(
        applicationVersion: Version,
        creationTime: Timestamp,
        status: ApplicationVersionLifecycle,
        statusReason: js.UndefOr[String] = js.undefined
    ): ApplicationVersionSummary = {
      val __obj = js.Dynamic.literal(
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationVersionSummary]
    }
  }

  /** Defines the details of a batch job.
    */
  @js.native
  trait BatchJobDefinition extends js.Object {
    var fileBatchJobDefinition: js.UndefOr[FileBatchJobDefinition]
    var scriptBatchJobDefinition: js.UndefOr[ScriptBatchJobDefinition]
  }

  object BatchJobDefinition {
    @inline
    def apply(
        fileBatchJobDefinition: js.UndefOr[FileBatchJobDefinition] = js.undefined,
        scriptBatchJobDefinition: js.UndefOr[ScriptBatchJobDefinition] = js.undefined
    ): BatchJobDefinition = {
      val __obj = js.Dynamic.literal()
      fileBatchJobDefinition.foreach(__v => __obj.updateDynamic("fileBatchJobDefinition")(__v.asInstanceOf[js.Any]))
      scriptBatchJobDefinition.foreach(__v => __obj.updateDynamic("scriptBatchJobDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchJobDefinition]
    }
  }

  /** A subset of the possible batch job attributes. Used in the batch job list.
    */
  @js.native
  trait BatchJobExecutionSummary extends js.Object {
    var applicationId: Identifier
    var executionId: Identifier
    var startTime: Timestamp
    var status: BatchJobExecutionStatus
    var endTime: js.UndefOr[Timestamp]
    var jobId: js.UndefOr[String100]
    var jobName: js.UndefOr[String100]
    var jobType: js.UndefOr[BatchJobType]
  }

  object BatchJobExecutionSummary {
    @inline
    def apply(
        applicationId: Identifier,
        executionId: Identifier,
        startTime: Timestamp,
        status: BatchJobExecutionStatus,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        jobId: js.UndefOr[String100] = js.undefined,
        jobName: js.UndefOr[String100] = js.undefined,
        jobType: js.UndefOr[BatchJobType] = js.undefined
    ): BatchJobExecutionSummary = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "executionId" -> executionId.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobName.foreach(__v => __obj.updateDynamic("jobName")(__v.asInstanceOf[js.Any]))
      jobType.foreach(__v => __obj.updateDynamic("jobType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchJobExecutionSummary]
    }
  }

  /** Identifies a specific batch job.
    */
  @js.native
  trait BatchJobIdentifier extends js.Object {
    var fileBatchJobIdentifier: js.UndefOr[FileBatchJobIdentifier]
    var scriptBatchJobIdentifier: js.UndefOr[ScriptBatchJobIdentifier]
  }

  object BatchJobIdentifier {
    @inline
    def apply(
        fileBatchJobIdentifier: js.UndefOr[FileBatchJobIdentifier] = js.undefined,
        scriptBatchJobIdentifier: js.UndefOr[ScriptBatchJobIdentifier] = js.undefined
    ): BatchJobIdentifier = {
      val __obj = js.Dynamic.literal()
      fileBatchJobIdentifier.foreach(__v => __obj.updateDynamic("fileBatchJobIdentifier")(__v.asInstanceOf[js.Any]))
      scriptBatchJobIdentifier.foreach(__v => __obj.updateDynamic("scriptBatchJobIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchJobIdentifier]
    }
  }

  @js.native
  trait CancelBatchJobExecutionRequest extends js.Object {
    var applicationId: Identifier
    var executionId: Identifier
  }

  object CancelBatchJobExecutionRequest {
    @inline
    def apply(
        applicationId: Identifier,
        executionId: Identifier
    ): CancelBatchJobExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "executionId" -> executionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelBatchJobExecutionRequest]
    }
  }

  @js.native
  trait CancelBatchJobExecutionResponse extends js.Object

  object CancelBatchJobExecutionResponse {
    @inline
    def apply(): CancelBatchJobExecutionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelBatchJobExecutionResponse]
    }
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var definition: Definition
    var engineType: EngineType
    var name: EntityName
    var clientToken: js.UndefOr[String]
    var description: js.UndefOr[EntityDescription]
    var tags: js.UndefOr[TagMap]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        definition: Definition,
        engineType: EngineType,
        name: EntityName,
        clientToken: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "definition" -> definition.asInstanceOf[js.Any],
        "engineType" -> engineType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var applicationArn: Arn
    var applicationId: Identifier
    var applicationVersion: Version
  }

  object CreateApplicationResponse {
    @inline
    def apply(
        applicationArn: Arn,
        applicationId: Identifier,
        applicationVersion: Version
    ): CreateApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "applicationArn" -> applicationArn.asInstanceOf[js.Any],
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateDataSetImportTaskRequest extends js.Object {
    var applicationId: Identifier
    var importConfig: DataSetImportConfig
    var clientToken: js.UndefOr[String]
  }

  object CreateDataSetImportTaskRequest {
    @inline
    def apply(
        applicationId: Identifier,
        importConfig: DataSetImportConfig,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateDataSetImportTaskRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "importConfig" -> importConfig.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSetImportTaskRequest]
    }
  }

  @js.native
  trait CreateDataSetImportTaskResponse extends js.Object {
    var taskId: Identifier
  }

  object CreateDataSetImportTaskResponse {
    @inline
    def apply(
        taskId: Identifier
    ): CreateDataSetImportTaskResponse = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDataSetImportTaskResponse]
    }
  }

  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var applicationId: Identifier
    var applicationVersion: Version
    var environmentId: Identifier
    var clientToken: js.UndefOr[String]
  }

  object CreateDeploymentRequest {
    @inline
    def apply(
        applicationId: Identifier,
        applicationVersion: Version,
        environmentId: Identifier,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentRequest]
    }
  }

  @js.native
  trait CreateDeploymentResponse extends js.Object {
    var deploymentId: Identifier
  }

  object CreateDeploymentResponse {
    @inline
    def apply(
        deploymentId: Identifier
    ): CreateDeploymentResponse = {
      val __obj = js.Dynamic.literal(
        "deploymentId" -> deploymentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDeploymentResponse]
    }
  }

  @js.native
  trait CreateEnvironmentRequest extends js.Object {
    var engineType: EngineType
    var instanceType: String20
    var name: EntityName
    var clientToken: js.UndefOr[String]
    var description: js.UndefOr[EntityDescription]
    var engineVersion: js.UndefOr[EngineVersion]
    var highAvailabilityConfig: js.UndefOr[HighAvailabilityConfig]
    var preferredMaintenanceWindow: js.UndefOr[String50]
    var publiclyAccessible: js.UndefOr[Boolean]
    var securityGroupIds: js.UndefOr[String50List]
    var storageConfigurations: js.UndefOr[StorageConfigurationList]
    var subnetIds: js.UndefOr[String50List]
    var tags: js.UndefOr[TagMap]
  }

  object CreateEnvironmentRequest {
    @inline
    def apply(
        engineType: EngineType,
        instanceType: String20,
        name: EntityName,
        clientToken: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        engineVersion: js.UndefOr[EngineVersion] = js.undefined,
        highAvailabilityConfig: js.UndefOr[HighAvailabilityConfig] = js.undefined,
        preferredMaintenanceWindow: js.UndefOr[String50] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        securityGroupIds: js.UndefOr[String50List] = js.undefined,
        storageConfigurations: js.UndefOr[StorageConfigurationList] = js.undefined,
        subnetIds: js.UndefOr[String50List] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "engineType" -> engineType.asInstanceOf[js.Any],
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      engineVersion.foreach(__v => __obj.updateDynamic("engineVersion")(__v.asInstanceOf[js.Any]))
      highAvailabilityConfig.foreach(__v => __obj.updateDynamic("highAvailabilityConfig")(__v.asInstanceOf[js.Any]))
      preferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("preferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      storageConfigurations.foreach(__v => __obj.updateDynamic("storageConfigurations")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentRequest]
    }
  }

  @js.native
  trait CreateEnvironmentResponse extends js.Object {
    var environmentId: Identifier
  }

  object CreateEnvironmentResponse {
    @inline
    def apply(
        environmentId: Identifier
    ): CreateEnvironmentResponse = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEnvironmentResponse]
    }
  }

  /** Defines a data set.
    */
  @js.native
  trait DataSet extends js.Object {
    var datasetName: String
    var datasetOrg: DatasetOrgAttributes
    var recordLength: RecordLength
    var relativePath: js.UndefOr[String]
    var storageType: js.UndefOr[String]
  }

  object DataSet {
    @inline
    def apply(
        datasetName: String,
        datasetOrg: DatasetOrgAttributes,
        recordLength: RecordLength,
        relativePath: js.UndefOr[String] = js.undefined,
        storageType: js.UndefOr[String] = js.undefined
    ): DataSet = {
      val __obj = js.Dynamic.literal(
        "datasetName" -> datasetName.asInstanceOf[js.Any],
        "datasetOrg" -> datasetOrg.asInstanceOf[js.Any],
        "recordLength" -> recordLength.asInstanceOf[js.Any]
      )

      relativePath.foreach(__v => __obj.updateDynamic("relativePath")(__v.asInstanceOf[js.Any]))
      storageType.foreach(__v => __obj.updateDynamic("storageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSet]
    }
  }

  /** Identifies one or more data sets you want to import with the <a>CreateDataSetImportTask</a> operation.
    */
  @js.native
  trait DataSetImportConfig extends js.Object {
    var dataSets: js.UndefOr[DataSetImportList]
    var s3Location: js.UndefOr[String2000]
  }

  object DataSetImportConfig {
    @inline
    def apply(
        dataSets: js.UndefOr[DataSetImportList] = js.undefined,
        s3Location: js.UndefOr[String2000] = js.undefined
    ): DataSetImportConfig = {
      val __obj = js.Dynamic.literal()
      dataSets.foreach(__v => __obj.updateDynamic("dataSets")(__v.asInstanceOf[js.Any]))
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSetImportConfig]
    }
  }

  /** Identifies a specific data set to import from an external location.
    */
  @js.native
  trait DataSetImportItem extends js.Object {
    var dataSet: DataSet
    var externalLocation: ExternalLocation
  }

  object DataSetImportItem {
    @inline
    def apply(
        dataSet: DataSet,
        externalLocation: ExternalLocation
    ): DataSetImportItem = {
      val __obj = js.Dynamic.literal(
        "dataSet" -> dataSet.asInstanceOf[js.Any],
        "externalLocation" -> externalLocation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSetImportItem]
    }
  }

  /** Represents a summary of data set imports.
    */
  @js.native
  trait DataSetImportSummary extends js.Object {
    var failed: Int
    var inProgress: Int
    var pending: Int
    var succeeded: Int
    var total: Int
  }

  object DataSetImportSummary {
    @inline
    def apply(
        failed: Int,
        inProgress: Int,
        pending: Int,
        succeeded: Int,
        total: Int
    ): DataSetImportSummary = {
      val __obj = js.Dynamic.literal(
        "failed" -> failed.asInstanceOf[js.Any],
        "inProgress" -> inProgress.asInstanceOf[js.Any],
        "pending" -> pending.asInstanceOf[js.Any],
        "succeeded" -> succeeded.asInstanceOf[js.Any],
        "total" -> total.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSetImportSummary]
    }
  }

  /** Contains information about a data set import task.
    */
  @js.native
  trait DataSetImportTask extends js.Object {
    var status: DataSetTaskLifecycle
    var summary: DataSetImportSummary
    var taskId: Identifier
  }

  object DataSetImportTask {
    @inline
    def apply(
        status: DataSetTaskLifecycle,
        summary: DataSetImportSummary,
        taskId: Identifier
    ): DataSetImportTask = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any],
        "summary" -> summary.asInstanceOf[js.Any],
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSetImportTask]
    }
  }

  /** A subset of the possible data set attributes.
    */
  @js.native
  trait DataSetSummary extends js.Object {
    var dataSetName: String200
    var creationTime: js.UndefOr[Timestamp]
    var dataSetOrg: js.UndefOr[String20]
    var format: js.UndefOr[String20]
    var lastReferencedTime: js.UndefOr[Timestamp]
    var lastUpdatedTime: js.UndefOr[Timestamp]
  }

  object DataSetSummary {
    @inline
    def apply(
        dataSetName: String200,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        dataSetOrg: js.UndefOr[String20] = js.undefined,
        format: js.UndefOr[String20] = js.undefined,
        lastReferencedTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
    ): DataSetSummary = {
      val __obj = js.Dynamic.literal(
        "dataSetName" -> dataSetName.asInstanceOf[js.Any]
      )

      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      dataSetOrg.foreach(__v => __obj.updateDynamic("dataSetOrg")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      lastReferencedTime.foreach(__v => __obj.updateDynamic("lastReferencedTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSetSummary]
    }
  }

  /** Additional details about the data set. Different attributes correspond to different data set organizations. The values are populated based on datasetOrg, storageType and backend (Blu Age or Micro Focus).
    */
  @js.native
  trait DatasetDetailOrgAttributes extends js.Object {
    var gdg: js.UndefOr[GdgDetailAttributes]
    var vsam: js.UndefOr[VsamDetailAttributes]
  }

  object DatasetDetailOrgAttributes {
    @inline
    def apply(
        gdg: js.UndefOr[GdgDetailAttributes] = js.undefined,
        vsam: js.UndefOr[VsamDetailAttributes] = js.undefined
    ): DatasetDetailOrgAttributes = {
      val __obj = js.Dynamic.literal()
      gdg.foreach(__v => __obj.updateDynamic("gdg")(__v.asInstanceOf[js.Any]))
      vsam.foreach(__v => __obj.updateDynamic("vsam")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetDetailOrgAttributes]
    }
  }

  /** Additional details about the data set. Different attributes correspond to different data set organizations. The values are populated based on datasetOrg, storageType and backend (Blu Age or Micro Focus).
    */
  @js.native
  trait DatasetOrgAttributes extends js.Object {
    var gdg: js.UndefOr[GdgAttributes]
    var vsam: js.UndefOr[VsamAttributes]
  }

  object DatasetOrgAttributes {
    @inline
    def apply(
        gdg: js.UndefOr[GdgAttributes] = js.undefined,
        vsam: js.UndefOr[VsamAttributes] = js.undefined
    ): DatasetOrgAttributes = {
      val __obj = js.Dynamic.literal()
      gdg.foreach(__v => __obj.updateDynamic("gdg")(__v.asInstanceOf[js.Any]))
      vsam.foreach(__v => __obj.updateDynamic("vsam")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetOrgAttributes]
    }
  }

  /** The application definition for a particular application.
    */
  @js.native
  trait Definition extends js.Object {
    var content: js.UndefOr[StringFree65000]
    var s3Location: js.UndefOr[String2000]
  }

  object Definition {
    @inline
    def apply(
        content: js.UndefOr[StringFree65000] = js.undefined,
        s3Location: js.UndefOr[String2000] = js.undefined
    ): Definition = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Definition]
    }
  }

  @js.native
  trait DeleteApplicationFromEnvironmentRequest extends js.Object {
    var applicationId: Identifier
    var environmentId: Identifier
  }

  object DeleteApplicationFromEnvironmentRequest {
    @inline
    def apply(
        applicationId: Identifier,
        environmentId: Identifier
    ): DeleteApplicationFromEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationFromEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteApplicationFromEnvironmentResponse extends js.Object

  object DeleteApplicationFromEnvironmentResponse {
    @inline
    def apply(): DeleteApplicationFromEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationFromEnvironmentResponse]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var applicationId: Identifier
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        applicationId: Identifier
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
  trait DeleteEnvironmentRequest extends js.Object {
    var environmentId: Identifier
  }

  object DeleteEnvironmentRequest {
    @inline
    def apply(
        environmentId: Identifier
    ): DeleteEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteEnvironmentResponse extends js.Object

  object DeleteEnvironmentResponse {
    @inline
    def apply(): DeleteEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEnvironmentResponse]
    }
  }

  /** Contains a summary of a deployed application.
    */
  @js.native
  trait DeployedVersionSummary extends js.Object {
    var applicationVersion: Version
    var status: DeploymentLifecycle
    var statusReason: js.UndefOr[String]
  }

  object DeployedVersionSummary {
    @inline
    def apply(
        applicationVersion: Version,
        status: DeploymentLifecycle,
        statusReason: js.UndefOr[String] = js.undefined
    ): DeployedVersionSummary = {
      val __obj = js.Dynamic.literal(
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeployedVersionSummary]
    }
  }

  /** A subset of information about a specific deployment.
    */
  @js.native
  trait DeploymentSummary extends js.Object {
    var applicationId: Identifier
    var applicationVersion: Version
    var creationTime: Timestamp
    var deploymentId: Identifier
    var environmentId: Identifier
    var status: DeploymentLifecycle
    var statusReason: js.UndefOr[String]
  }

  object DeploymentSummary {
    @inline
    def apply(
        applicationId: Identifier,
        applicationVersion: Version,
        creationTime: Timestamp,
        deploymentId: Identifier,
        environmentId: Identifier,
        status: DeploymentLifecycle,
        statusReason: js.UndefOr[String] = js.undefined
    ): DeploymentSummary = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentSummary]
    }
  }

  /** Defines the storage configuration for an Amazon EFS file system.
    */
  @js.native
  trait EfsStorageConfiguration extends js.Object {
    var fileSystemId: String200
    var mountPoint: String200
  }

  object EfsStorageConfiguration {
    @inline
    def apply(
        fileSystemId: String200,
        mountPoint: String200
    ): EfsStorageConfiguration = {
      val __obj = js.Dynamic.literal(
        "fileSystemId" -> fileSystemId.asInstanceOf[js.Any],
        "mountPoint" -> mountPoint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EfsStorageConfiguration]
    }
  }

  /** A subset of information about the engine version for a specific application.
    */
  @js.native
  trait EngineVersionsSummary extends js.Object {
    var engineType: String
    var engineVersion: String
  }

  object EngineVersionsSummary {
    @inline
    def apply(
        engineType: String,
        engineVersion: String
    ): EngineVersionsSummary = {
      val __obj = js.Dynamic.literal(
        "engineType" -> engineType.asInstanceOf[js.Any],
        "engineVersion" -> engineVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EngineVersionsSummary]
    }
  }

  /** Contains a subset of the possible environment attributes. Used in the environment list.
    */
  @js.native
  trait EnvironmentSummary extends js.Object {
    var creationTime: Timestamp
    var engineType: EngineType
    var engineVersion: EngineVersion
    var environmentArn: Arn
    var environmentId: Identifier
    var instanceType: String20
    var name: EntityName
    var status: EnvironmentLifecycle
  }

  object EnvironmentSummary {
    @inline
    def apply(
        creationTime: Timestamp,
        engineType: EngineType,
        engineVersion: EngineVersion,
        environmentArn: Arn,
        environmentId: Identifier,
        instanceType: String20,
        name: EntityName,
        status: EnvironmentLifecycle
    ): EnvironmentSummary = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "engineType" -> engineType.asInstanceOf[js.Any],
        "engineVersion" -> engineVersion.asInstanceOf[js.Any],
        "environmentArn" -> environmentArn.asInstanceOf[js.Any],
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnvironmentSummary]
    }
  }

  /** Defines an external storage location.
    */
  @js.native
  trait ExternalLocation extends js.Object {
    var s3Location: js.UndefOr[String2000]
  }

  object ExternalLocation {
    @inline
    def apply(
        s3Location: js.UndefOr[String2000] = js.undefined
    ): ExternalLocation = {
      val __obj = js.Dynamic.literal()
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExternalLocation]
    }
  }

  /** A file containing a batch job definition.
    */
  @js.native
  trait FileBatchJobDefinition extends js.Object {
    var fileName: String
    var folderPath: js.UndefOr[String]
  }

  object FileBatchJobDefinition {
    @inline
    def apply(
        fileName: String,
        folderPath: js.UndefOr[String] = js.undefined
    ): FileBatchJobDefinition = {
      val __obj = js.Dynamic.literal(
        "fileName" -> fileName.asInstanceOf[js.Any]
      )

      folderPath.foreach(__v => __obj.updateDynamic("folderPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileBatchJobDefinition]
    }
  }

  /** A batch job identifier in which the batch job to run is identified by the file name and the relative path to the file name.
    */
  @js.native
  trait FileBatchJobIdentifier extends js.Object {
    var fileName: String
    var folderPath: js.UndefOr[String]
  }

  object FileBatchJobIdentifier {
    @inline
    def apply(
        fileName: String,
        folderPath: js.UndefOr[String] = js.undefined
    ): FileBatchJobIdentifier = {
      val __obj = js.Dynamic.literal(
        "fileName" -> fileName.asInstanceOf[js.Any]
      )

      folderPath.foreach(__v => __obj.updateDynamic("folderPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileBatchJobIdentifier]
    }
  }

  /** Defines the storage configuration for an Amazon FSx file system.
    */
  @js.native
  trait FsxStorageConfiguration extends js.Object {
    var fileSystemId: String200
    var mountPoint: String200
  }

  object FsxStorageConfiguration {
    @inline
    def apply(
        fileSystemId: String200,
        mountPoint: String200
    ): FsxStorageConfiguration = {
      val __obj = js.Dynamic.literal(
        "fileSystemId" -> fileSystemId.asInstanceOf[js.Any],
        "mountPoint" -> mountPoint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FsxStorageConfiguration]
    }
  }

  /** The required attributes for a generation data group data set. A generation data set is one of a collection of successive, historically related, catalogued data sets that together are known as a generation data group (GDG). Use this structure when you want to import a GDG. For more information on GDG, see [[https://www.ibm.com/docs/en/zos/2.3.0?topic=guide-generation-data-sets|Generation data sets]].
    */
  @js.native
  trait GdgAttributes extends js.Object {
    var limit: js.UndefOr[Int]
    var rollDisposition: js.UndefOr[String]
  }

  object GdgAttributes {
    @inline
    def apply(
        limit: js.UndefOr[Int] = js.undefined,
        rollDisposition: js.UndefOr[String] = js.undefined
    ): GdgAttributes = {
      val __obj = js.Dynamic.literal()
      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      rollDisposition.foreach(__v => __obj.updateDynamic("rollDisposition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GdgAttributes]
    }
  }

  /** The required attributes for a generation data group data set. A generation data set is one of a collection of successive, historically related, catalogued data sets that together are known as a generation data group (GDG). Use this structure when you want to import a GDG. For more information on GDG, see [[https://www.ibm.com/docs/en/zos/2.3.0?topic=guide-generation-data-sets|Generation data sets]].
    */
  @js.native
  trait GdgDetailAttributes extends js.Object {
    var limit: js.UndefOr[Int]
    var rollDisposition: js.UndefOr[String50]
  }

  object GdgDetailAttributes {
    @inline
    def apply(
        limit: js.UndefOr[Int] = js.undefined,
        rollDisposition: js.UndefOr[String50] = js.undefined
    ): GdgDetailAttributes = {
      val __obj = js.Dynamic.literal()
      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      rollDisposition.foreach(__v => __obj.updateDynamic("rollDisposition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GdgDetailAttributes]
    }
  }

  @js.native
  trait GetApplicationRequest extends js.Object {
    var applicationId: Identifier
  }

  object GetApplicationRequest {
    @inline
    def apply(
        applicationId: Identifier
    ): GetApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationRequest]
    }
  }

  @js.native
  trait GetApplicationResponse extends js.Object {
    var applicationArn: Arn
    var applicationId: Identifier
    var creationTime: Timestamp
    var engineType: EngineType
    var latestVersion: ApplicationVersionSummary
    var name: EntityName
    var status: ApplicationLifecycle
    var deployedVersion: js.UndefOr[DeployedVersionSummary]
    var description: js.UndefOr[EntityDescription]
    var environmentId: js.UndefOr[Identifier]
    var lastStartTime: js.UndefOr[Timestamp]
    var listenerArns: js.UndefOr[ArnList]
    var listenerPorts: js.UndefOr[PortList]
    var loadBalancerDnsName: js.UndefOr[String100]
    var logGroups: js.UndefOr[LogGroupSummaries]
    var statusReason: js.UndefOr[String]
    var tags: js.UndefOr[TagMap]
    var targetGroupArns: js.UndefOr[ArnList]
  }

  object GetApplicationResponse {
    @inline
    def apply(
        applicationArn: Arn,
        applicationId: Identifier,
        creationTime: Timestamp,
        engineType: EngineType,
        latestVersion: ApplicationVersionSummary,
        name: EntityName,
        status: ApplicationLifecycle,
        deployedVersion: js.UndefOr[DeployedVersionSummary] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        environmentId: js.UndefOr[Identifier] = js.undefined,
        lastStartTime: js.UndefOr[Timestamp] = js.undefined,
        listenerArns: js.UndefOr[ArnList] = js.undefined,
        listenerPorts: js.UndefOr[PortList] = js.undefined,
        loadBalancerDnsName: js.UndefOr[String100] = js.undefined,
        logGroups: js.UndefOr[LogGroupSummaries] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        targetGroupArns: js.UndefOr[ArnList] = js.undefined
    ): GetApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "applicationArn" -> applicationArn.asInstanceOf[js.Any],
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "engineType" -> engineType.asInstanceOf[js.Any],
        "latestVersion" -> latestVersion.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      deployedVersion.foreach(__v => __obj.updateDynamic("deployedVersion")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      environmentId.foreach(__v => __obj.updateDynamic("environmentId")(__v.asInstanceOf[js.Any]))
      lastStartTime.foreach(__v => __obj.updateDynamic("lastStartTime")(__v.asInstanceOf[js.Any]))
      listenerArns.foreach(__v => __obj.updateDynamic("listenerArns")(__v.asInstanceOf[js.Any]))
      listenerPorts.foreach(__v => __obj.updateDynamic("listenerPorts")(__v.asInstanceOf[js.Any]))
      loadBalancerDnsName.foreach(__v => __obj.updateDynamic("loadBalancerDnsName")(__v.asInstanceOf[js.Any]))
      logGroups.foreach(__v => __obj.updateDynamic("logGroups")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targetGroupArns.foreach(__v => __obj.updateDynamic("targetGroupArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationResponse]
    }
  }

  @js.native
  trait GetApplicationVersionRequest extends js.Object {
    var applicationId: Identifier
    var applicationVersion: Version
  }

  object GetApplicationVersionRequest {
    @inline
    def apply(
        applicationId: Identifier,
        applicationVersion: Version
    ): GetApplicationVersionRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationVersionRequest]
    }
  }

  @js.native
  trait GetApplicationVersionResponse extends js.Object {
    var applicationVersion: Version
    var creationTime: Timestamp
    var definitionContent: StringFree65000
    var name: EntityName
    var status: ApplicationVersionLifecycle
    var description: js.UndefOr[EntityDescription]
    var statusReason: js.UndefOr[String]
  }

  object GetApplicationVersionResponse {
    @inline
    def apply(
        applicationVersion: Version,
        creationTime: Timestamp,
        definitionContent: StringFree65000,
        name: EntityName,
        status: ApplicationVersionLifecycle,
        description: js.UndefOr[EntityDescription] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined
    ): GetApplicationVersionResponse = {
      val __obj = js.Dynamic.literal(
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "definitionContent" -> definitionContent.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationVersionResponse]
    }
  }

  @js.native
  trait GetBatchJobExecutionRequest extends js.Object {
    var applicationId: Identifier
    var executionId: Identifier
  }

  object GetBatchJobExecutionRequest {
    @inline
    def apply(
        applicationId: Identifier,
        executionId: Identifier
    ): GetBatchJobExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "executionId" -> executionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBatchJobExecutionRequest]
    }
  }

  @js.native
  trait GetBatchJobExecutionResponse extends js.Object {
    var applicationId: Identifier
    var executionId: Identifier
    var startTime: Timestamp
    var status: BatchJobExecutionStatus
    var endTime: js.UndefOr[Timestamp]
    var jobId: js.UndefOr[String100]
    var jobName: js.UndefOr[String100]
    var jobType: js.UndefOr[BatchJobType]
    var jobUser: js.UndefOr[String100]
    var statusReason: js.UndefOr[String]
  }

  object GetBatchJobExecutionResponse {
    @inline
    def apply(
        applicationId: Identifier,
        executionId: Identifier,
        startTime: Timestamp,
        status: BatchJobExecutionStatus,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        jobId: js.UndefOr[String100] = js.undefined,
        jobName: js.UndefOr[String100] = js.undefined,
        jobType: js.UndefOr[BatchJobType] = js.undefined,
        jobUser: js.UndefOr[String100] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined
    ): GetBatchJobExecutionResponse = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "executionId" -> executionId.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobName.foreach(__v => __obj.updateDynamic("jobName")(__v.asInstanceOf[js.Any]))
      jobType.foreach(__v => __obj.updateDynamic("jobType")(__v.asInstanceOf[js.Any]))
      jobUser.foreach(__v => __obj.updateDynamic("jobUser")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBatchJobExecutionResponse]
    }
  }

  @js.native
  trait GetDataSetDetailsRequest extends js.Object {
    var applicationId: Identifier
    var dataSetName: String200
  }

  object GetDataSetDetailsRequest {
    @inline
    def apply(
        applicationId: Identifier,
        dataSetName: String200
    ): GetDataSetDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "dataSetName" -> dataSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDataSetDetailsRequest]
    }
  }

  @js.native
  trait GetDataSetDetailsResponse extends js.Object {
    var dataSetName: String200
    var blocksize: js.UndefOr[Int]
    var creationTime: js.UndefOr[Timestamp]
    var dataSetOrg: js.UndefOr[DatasetDetailOrgAttributes]
    var lastReferencedTime: js.UndefOr[Timestamp]
    var lastUpdatedTime: js.UndefOr[Timestamp]
    var location: js.UndefOr[String2000]
    var recordLength: js.UndefOr[Int]
  }

  object GetDataSetDetailsResponse {
    @inline
    def apply(
        dataSetName: String200,
        blocksize: js.UndefOr[Int] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        dataSetOrg: js.UndefOr[DatasetDetailOrgAttributes] = js.undefined,
        lastReferencedTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        location: js.UndefOr[String2000] = js.undefined,
        recordLength: js.UndefOr[Int] = js.undefined
    ): GetDataSetDetailsResponse = {
      val __obj = js.Dynamic.literal(
        "dataSetName" -> dataSetName.asInstanceOf[js.Any]
      )

      blocksize.foreach(__v => __obj.updateDynamic("blocksize")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      dataSetOrg.foreach(__v => __obj.updateDynamic("dataSetOrg")(__v.asInstanceOf[js.Any]))
      lastReferencedTime.foreach(__v => __obj.updateDynamic("lastReferencedTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedTime.foreach(__v => __obj.updateDynamic("lastUpdatedTime")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      recordLength.foreach(__v => __obj.updateDynamic("recordLength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataSetDetailsResponse]
    }
  }

  @js.native
  trait GetDataSetImportTaskRequest extends js.Object {
    var applicationId: Identifier
    var taskId: Identifier
  }

  object GetDataSetImportTaskRequest {
    @inline
    def apply(
        applicationId: Identifier,
        taskId: Identifier
    ): GetDataSetImportTaskRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDataSetImportTaskRequest]
    }
  }

  @js.native
  trait GetDataSetImportTaskResponse extends js.Object {
    var status: DataSetTaskLifecycle
    var taskId: Identifier
    var summary: js.UndefOr[DataSetImportSummary]
  }

  object GetDataSetImportTaskResponse {
    @inline
    def apply(
        status: DataSetTaskLifecycle,
        taskId: Identifier,
        summary: js.UndefOr[DataSetImportSummary] = js.undefined
    ): GetDataSetImportTaskResponse = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any],
        "taskId" -> taskId.asInstanceOf[js.Any]
      )

      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataSetImportTaskResponse]
    }
  }

  @js.native
  trait GetDeploymentRequest extends js.Object {
    var applicationId: Identifier
    var deploymentId: Identifier
  }

  object GetDeploymentRequest {
    @inline
    def apply(
        applicationId: Identifier,
        deploymentId: Identifier
    ): GetDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "deploymentId" -> deploymentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeploymentRequest]
    }
  }

  @js.native
  trait GetDeploymentResponse extends js.Object {
    var applicationId: Identifier
    var applicationVersion: Version
    var creationTime: Timestamp
    var deploymentId: Identifier
    var environmentId: Identifier
    var status: DeploymentLifecycle
    var statusReason: js.UndefOr[String]
  }

  object GetDeploymentResponse {
    @inline
    def apply(
        applicationId: Identifier,
        applicationVersion: Version,
        creationTime: Timestamp,
        deploymentId: Identifier,
        environmentId: Identifier,
        status: DeploymentLifecycle,
        statusReason: js.UndefOr[String] = js.undefined
    ): GetDeploymentResponse = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentResponse]
    }
  }

  @js.native
  trait GetEnvironmentRequest extends js.Object {
    var environmentId: Identifier
  }

  object GetEnvironmentRequest {
    @inline
    def apply(
        environmentId: Identifier
    ): GetEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentRequest]
    }
  }

  @js.native
  trait GetEnvironmentResponse extends js.Object {
    var creationTime: Timestamp
    var engineType: EngineType
    var engineVersion: EngineVersion
    var environmentArn: Arn
    var environmentId: Identifier
    var instanceType: String20
    var name: EntityName
    var securityGroupIds: String50List
    var status: EnvironmentLifecycle
    var subnetIds: String50List
    var vpcId: String50
    var actualCapacity: js.UndefOr[CapacityValue]
    var description: js.UndefOr[EntityDescription]
    var highAvailabilityConfig: js.UndefOr[HighAvailabilityConfig]
    var loadBalancerArn: js.UndefOr[String]
    var pendingMaintenance: js.UndefOr[PendingMaintenance]
    var preferredMaintenanceWindow: js.UndefOr[String]
    var publiclyAccessible: js.UndefOr[Boolean]
    var statusReason: js.UndefOr[String]
    var storageConfigurations: js.UndefOr[StorageConfigurationList]
    var tags: js.UndefOr[TagMap]
  }

  object GetEnvironmentResponse {
    @inline
    def apply(
        creationTime: Timestamp,
        engineType: EngineType,
        engineVersion: EngineVersion,
        environmentArn: Arn,
        environmentId: Identifier,
        instanceType: String20,
        name: EntityName,
        securityGroupIds: String50List,
        status: EnvironmentLifecycle,
        subnetIds: String50List,
        vpcId: String50,
        actualCapacity: js.UndefOr[CapacityValue] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        highAvailabilityConfig: js.UndefOr[HighAvailabilityConfig] = js.undefined,
        loadBalancerArn: js.UndefOr[String] = js.undefined,
        pendingMaintenance: js.UndefOr[PendingMaintenance] = js.undefined,
        preferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        storageConfigurations: js.UndefOr[StorageConfigurationList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetEnvironmentResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "engineType" -> engineType.asInstanceOf[js.Any],
        "engineVersion" -> engineVersion.asInstanceOf[js.Any],
        "environmentArn" -> environmentArn.asInstanceOf[js.Any],
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "securityGroupIds" -> securityGroupIds.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "subnetIds" -> subnetIds.asInstanceOf[js.Any],
        "vpcId" -> vpcId.asInstanceOf[js.Any]
      )

      actualCapacity.foreach(__v => __obj.updateDynamic("actualCapacity")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      highAvailabilityConfig.foreach(__v => __obj.updateDynamic("highAvailabilityConfig")(__v.asInstanceOf[js.Any]))
      loadBalancerArn.foreach(__v => __obj.updateDynamic("loadBalancerArn")(__v.asInstanceOf[js.Any]))
      pendingMaintenance.foreach(__v => __obj.updateDynamic("pendingMaintenance")(__v.asInstanceOf[js.Any]))
      preferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("preferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      storageConfigurations.foreach(__v => __obj.updateDynamic("storageConfigurations")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEnvironmentResponse]
    }
  }

  /** Defines the details of a high availability configuration.
    */
  @js.native
  trait HighAvailabilityConfig extends js.Object {
    var desiredCapacity: CapacityValue
  }

  object HighAvailabilityConfig {
    @inline
    def apply(
        desiredCapacity: CapacityValue
    ): HighAvailabilityConfig = {
      val __obj = js.Dynamic.literal(
        "desiredCapacity" -> desiredCapacity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HighAvailabilityConfig]
    }
  }

  @js.native
  trait ListApplicationVersionsRequest extends js.Object {
    var applicationId: Identifier
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationVersionsRequest {
    @inline
    def apply(
        applicationId: Identifier,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationVersionsRequest]
    }
  }

  @js.native
  trait ListApplicationVersionsResponse extends js.Object {
    var applicationVersions: ApplicationVersionSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationVersionsResponse {
    @inline
    def apply(
        applicationVersions: ApplicationVersionSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationVersionsResponse = {
      val __obj = js.Dynamic.literal(
        "applicationVersions" -> applicationVersions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationVersionsResponse]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var environmentId: js.UndefOr[Identifier]
    var maxResults: js.UndefOr[MaxResults]
    var names: js.UndefOr[EntityNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        environmentId: js.UndefOr[Identifier] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        names: js.UndefOr[EntityNameList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      environmentId.foreach(__v => __obj.updateDynamic("environmentId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      names.foreach(__v => __obj.updateDynamic("names")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var applications: ApplicationSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsResponse {
    @inline
    def apply(
        applications: ApplicationSummaryList,
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
  trait ListBatchJobDefinitionsRequest extends js.Object {
    var applicationId: Identifier
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var prefix: js.UndefOr[String]
  }

  object ListBatchJobDefinitionsRequest {
    @inline
    def apply(
        applicationId: Identifier,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        prefix: js.UndefOr[String] = js.undefined
    ): ListBatchJobDefinitionsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBatchJobDefinitionsRequest]
    }
  }

  @js.native
  trait ListBatchJobDefinitionsResponse extends js.Object {
    var batchJobDefinitions: BatchJobDefinitions
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBatchJobDefinitionsResponse {
    @inline
    def apply(
        batchJobDefinitions: BatchJobDefinitions,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBatchJobDefinitionsResponse = {
      val __obj = js.Dynamic.literal(
        "batchJobDefinitions" -> batchJobDefinitions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBatchJobDefinitionsResponse]
    }
  }

  @js.native
  trait ListBatchJobExecutionsRequest extends js.Object {
    var applicationId: Identifier
    var executionIds: js.UndefOr[IdentifierList]
    var jobName: js.UndefOr[String100]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var startedAfter: js.UndefOr[Timestamp]
    var startedBefore: js.UndefOr[Timestamp]
    var status: js.UndefOr[BatchJobExecutionStatus]
  }

  object ListBatchJobExecutionsRequest {
    @inline
    def apply(
        applicationId: Identifier,
        executionIds: js.UndefOr[IdentifierList] = js.undefined,
        jobName: js.UndefOr[String100] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        startedAfter: js.UndefOr[Timestamp] = js.undefined,
        startedBefore: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[BatchJobExecutionStatus] = js.undefined
    ): ListBatchJobExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      executionIds.foreach(__v => __obj.updateDynamic("executionIds")(__v.asInstanceOf[js.Any]))
      jobName.foreach(__v => __obj.updateDynamic("jobName")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      startedAfter.foreach(__v => __obj.updateDynamic("startedAfter")(__v.asInstanceOf[js.Any]))
      startedBefore.foreach(__v => __obj.updateDynamic("startedBefore")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBatchJobExecutionsRequest]
    }
  }

  @js.native
  trait ListBatchJobExecutionsResponse extends js.Object {
    var batchJobExecutions: BatchJobExecutionSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBatchJobExecutionsResponse {
    @inline
    def apply(
        batchJobExecutions: BatchJobExecutionSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBatchJobExecutionsResponse = {
      val __obj = js.Dynamic.literal(
        "batchJobExecutions" -> batchJobExecutions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBatchJobExecutionsResponse]
    }
  }

  @js.native
  trait ListDataSetImportHistoryRequest extends js.Object {
    var applicationId: Identifier
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDataSetImportHistoryRequest {
    @inline
    def apply(
        applicationId: Identifier,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataSetImportHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetImportHistoryRequest]
    }
  }

  @js.native
  trait ListDataSetImportHistoryResponse extends js.Object {
    var dataSetImportTasks: DataSetImportTaskList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDataSetImportHistoryResponse {
    @inline
    def apply(
        dataSetImportTasks: DataSetImportTaskList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataSetImportHistoryResponse = {
      val __obj = js.Dynamic.literal(
        "dataSetImportTasks" -> dataSetImportTasks.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetImportHistoryResponse]
    }
  }

  @js.native
  trait ListDataSetsRequest extends js.Object {
    var applicationId: Identifier
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var prefix: js.UndefOr[String200]
  }

  object ListDataSetsRequest {
    @inline
    def apply(
        applicationId: Identifier,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        prefix: js.UndefOr[String200] = js.undefined
    ): ListDataSetsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetsRequest]
    }
  }

  @js.native
  trait ListDataSetsResponse extends js.Object {
    var dataSets: DataSetsSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDataSetsResponse {
    @inline
    def apply(
        dataSets: DataSetsSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataSetsResponse = {
      val __obj = js.Dynamic.literal(
        "dataSets" -> dataSets.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetsResponse]
    }
  }

  @js.native
  trait ListDeploymentsRequest extends js.Object {
    var applicationId: Identifier
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentsRequest {
    @inline
    def apply(
        applicationId: Identifier,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentsRequest]
    }
  }

  @js.native
  trait ListDeploymentsResponse extends js.Object {
    var deployments: DeploymentList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentsResponse {
    @inline
    def apply(
        deployments: DeploymentList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentsResponse = {
      val __obj = js.Dynamic.literal(
        "deployments" -> deployments.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentsResponse]
    }
  }

  @js.native
  trait ListEngineVersionsRequest extends js.Object {
    var engineType: js.UndefOr[EngineType]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEngineVersionsRequest {
    @inline
    def apply(
        engineType: js.UndefOr[EngineType] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEngineVersionsRequest = {
      val __obj = js.Dynamic.literal()
      engineType.foreach(__v => __obj.updateDynamic("engineType")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEngineVersionsRequest]
    }
  }

  @js.native
  trait ListEngineVersionsResponse extends js.Object {
    var engineVersions: EngineVersionsSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEngineVersionsResponse {
    @inline
    def apply(
        engineVersions: EngineVersionsSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEngineVersionsResponse = {
      val __obj = js.Dynamic.literal(
        "engineVersions" -> engineVersions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEngineVersionsResponse]
    }
  }

  @js.native
  trait ListEnvironmentsRequest extends js.Object {
    var engineType: js.UndefOr[EngineType]
    var maxResults: js.UndefOr[MaxResults]
    var names: js.UndefOr[EntityNameList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentsRequest {
    @inline
    def apply(
        engineType: js.UndefOr[EngineType] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        names: js.UndefOr[EntityNameList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentsRequest = {
      val __obj = js.Dynamic.literal()
      engineType.foreach(__v => __obj.updateDynamic("engineType")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      names.foreach(__v => __obj.updateDynamic("names")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsRequest]
    }
  }

  @js.native
  trait ListEnvironmentsResponse extends js.Object {
    var environments: EnvironmentSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentsResponse {
    @inline
    def apply(
        environments: EnvironmentSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentsResponse = {
      val __obj = js.Dynamic.literal(
        "environments" -> environments.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: TagMap
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: TagMap
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A subset of the attributes about a log group. In CloudWatch a log group is a group of log streams that share the same retention, monitoring, and access control settings.
    */
  @js.native
  trait LogGroupSummary extends js.Object {
    var logGroupName: LogGroupIdentifier
    var logType: String20
  }

  object LogGroupSummary {
    @inline
    def apply(
        logGroupName: LogGroupIdentifier,
        logType: String20
    ): LogGroupSummary = {
      val __obj = js.Dynamic.literal(
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "logType" -> logType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LogGroupSummary]
    }
  }

  /** The information about the maintenance schedule.
    */
  @js.native
  trait MaintenanceSchedule extends js.Object {
    var endTime: js.UndefOr[Timestamp]
    var startTime: js.UndefOr[Timestamp]
  }

  object MaintenanceSchedule {
    @inline
    def apply(
        endTime: js.UndefOr[Timestamp] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): MaintenanceSchedule = {
      val __obj = js.Dynamic.literal()
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceSchedule]
    }
  }

  /** The scheduled maintenance for a runtime engine.
    */
  @js.native
  trait PendingMaintenance extends js.Object {
    var engineVersion: js.UndefOr[String]
    var schedule: js.UndefOr[MaintenanceSchedule]
  }

  object PendingMaintenance {
    @inline
    def apply(
        engineVersion: js.UndefOr[String] = js.undefined,
        schedule: js.UndefOr[MaintenanceSchedule] = js.undefined
    ): PendingMaintenance = {
      val __obj = js.Dynamic.literal()
      engineVersion.foreach(__v => __obj.updateDynamic("engineVersion")(__v.asInstanceOf[js.Any]))
      schedule.foreach(__v => __obj.updateDynamic("schedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingMaintenance]
    }
  }

  /** The primary key for a KSDS data set.
    */
  @js.native
  trait PrimaryKey extends js.Object {
    var length: Int
    var offset: Int
    var name: js.UndefOr[String]
  }

  object PrimaryKey {
    @inline
    def apply(
        length: Int,
        offset: Int,
        name: js.UndefOr[String] = js.undefined
    ): PrimaryKey = {
      val __obj = js.Dynamic.literal(
        "length" -> length.asInstanceOf[js.Any],
        "offset" -> offset.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrimaryKey]
    }
  }

  /** The length of the records in the data set.
    */
  @js.native
  trait RecordLength extends js.Object {
    var max: Int
    var min: Int
  }

  object RecordLength {
    @inline
    def apply(
        max: Int,
        min: Int
    ): RecordLength = {
      val __obj = js.Dynamic.literal(
        "max" -> max.asInstanceOf[js.Any],
        "min" -> min.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RecordLength]
    }
  }

  /** A batch job definition contained in a script.
    */
  @js.native
  trait ScriptBatchJobDefinition extends js.Object {
    var scriptName: String
  }

  object ScriptBatchJobDefinition {
    @inline
    def apply(
        scriptName: String
    ): ScriptBatchJobDefinition = {
      val __obj = js.Dynamic.literal(
        "scriptName" -> scriptName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScriptBatchJobDefinition]
    }
  }

  /** A batch job identifier in which the batch job to run is identified by the script name.
    */
  @js.native
  trait ScriptBatchJobIdentifier extends js.Object {
    var scriptName: String
  }

  object ScriptBatchJobIdentifier {
    @inline
    def apply(
        scriptName: String
    ): ScriptBatchJobIdentifier = {
      val __obj = js.Dynamic.literal(
        "scriptName" -> scriptName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScriptBatchJobIdentifier]
    }
  }

  @js.native
  trait StartApplicationRequest extends js.Object {
    var applicationId: Identifier
  }

  object StartApplicationRequest {
    @inline
    def apply(
        applicationId: Identifier
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
  trait StartBatchJobRequest extends js.Object {
    var applicationId: Identifier
    var batchJobIdentifier: BatchJobIdentifier
    var jobParams: js.UndefOr[BatchJobParametersMap]
  }

  object StartBatchJobRequest {
    @inline
    def apply(
        applicationId: Identifier,
        batchJobIdentifier: BatchJobIdentifier,
        jobParams: js.UndefOr[BatchJobParametersMap] = js.undefined
    ): StartBatchJobRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "batchJobIdentifier" -> batchJobIdentifier.asInstanceOf[js.Any]
      )

      jobParams.foreach(__v => __obj.updateDynamic("jobParams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBatchJobRequest]
    }
  }

  @js.native
  trait StartBatchJobResponse extends js.Object {
    var executionId: Identifier
  }

  object StartBatchJobResponse {
    @inline
    def apply(
        executionId: Identifier
    ): StartBatchJobResponse = {
      val __obj = js.Dynamic.literal(
        "executionId" -> executionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartBatchJobResponse]
    }
  }

  @js.native
  trait StopApplicationRequest extends js.Object {
    var applicationId: Identifier
    var forceStop: js.UndefOr[Boolean]
  }

  object StopApplicationRequest {
    @inline
    def apply(
        applicationId: Identifier,
        forceStop: js.UndefOr[Boolean] = js.undefined
    ): StopApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      forceStop.foreach(__v => __obj.updateDynamic("forceStop")(__v.asInstanceOf[js.Any]))
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

  /** Defines the storage configuration for an environment.
    */
  @js.native
  trait StorageConfiguration extends js.Object {
    var efs: js.UndefOr[EfsStorageConfiguration]
    var fsx: js.UndefOr[FsxStorageConfiguration]
  }

  object StorageConfiguration {
    @inline
    def apply(
        efs: js.UndefOr[EfsStorageConfiguration] = js.undefined,
        fsx: js.UndefOr[FsxStorageConfiguration] = js.undefined
    ): StorageConfiguration = {
      val __obj = js.Dynamic.literal()
      efs.foreach(__v => __obj.updateDynamic("efs")(__v.asInstanceOf[js.Any]))
      fsx.foreach(__v => __obj.updateDynamic("fsx")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageConfiguration]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
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
    var applicationId: Identifier
    var currentApplicationVersion: Version
    var definition: js.UndefOr[Definition]
    var description: js.UndefOr[EntityDescription]
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        applicationId: Identifier,
        currentApplicationVersion: Version,
        definition: js.UndefOr[Definition] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "currentApplicationVersion" -> currentApplicationVersion.asInstanceOf[js.Any]
      )

      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {
    var applicationVersion: Version
  }

  object UpdateApplicationResponse {
    @inline
    def apply(
        applicationVersion: Version
    ): UpdateApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "applicationVersion" -> applicationVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateApplicationResponse]
    }
  }

  @js.native
  trait UpdateEnvironmentRequest extends js.Object {
    var environmentId: Identifier
    var applyDuringMaintenanceWindow: js.UndefOr[Boolean]
    var desiredCapacity: js.UndefOr[CapacityValue]
    var engineVersion: js.UndefOr[EngineVersion]
    var instanceType: js.UndefOr[String20]
    var preferredMaintenanceWindow: js.UndefOr[String]
  }

  object UpdateEnvironmentRequest {
    @inline
    def apply(
        environmentId: Identifier,
        applyDuringMaintenanceWindow: js.UndefOr[Boolean] = js.undefined,
        desiredCapacity: js.UndefOr[CapacityValue] = js.undefined,
        engineVersion: js.UndefOr[EngineVersion] = js.undefined,
        instanceType: js.UndefOr[String20] = js.undefined,
        preferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    ): UpdateEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )

      applyDuringMaintenanceWindow.foreach(__v => __obj.updateDynamic("applyDuringMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      desiredCapacity.foreach(__v => __obj.updateDynamic("desiredCapacity")(__v.asInstanceOf[js.Any]))
      engineVersion.foreach(__v => __obj.updateDynamic("engineVersion")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      preferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("preferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentRequest]
    }
  }

  @js.native
  trait UpdateEnvironmentResponse extends js.Object {
    var environmentId: Identifier
  }

  object UpdateEnvironmentResponse {
    @inline
    def apply(
        environmentId: Identifier
    ): UpdateEnvironmentResponse = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEnvironmentResponse]
    }
  }

  /** The attributes of a VSAM type data set.
    */
  @js.native
  trait VsamAttributes extends js.Object {
    var format: String
    var alternateKeys: js.UndefOr[AlternateKeyList]
    var compressed: js.UndefOr[Boolean]
    var encoding: js.UndefOr[String]
    var primaryKey: js.UndefOr[PrimaryKey]
  }

  object VsamAttributes {
    @inline
    def apply(
        format: String,
        alternateKeys: js.UndefOr[AlternateKeyList] = js.undefined,
        compressed: js.UndefOr[Boolean] = js.undefined,
        encoding: js.UndefOr[String] = js.undefined,
        primaryKey: js.UndefOr[PrimaryKey] = js.undefined
    ): VsamAttributes = {
      val __obj = js.Dynamic.literal(
        "format" -> format.asInstanceOf[js.Any]
      )

      alternateKeys.foreach(__v => __obj.updateDynamic("alternateKeys")(__v.asInstanceOf[js.Any]))
      compressed.foreach(__v => __obj.updateDynamic("compressed")(__v.asInstanceOf[js.Any]))
      encoding.foreach(__v => __obj.updateDynamic("encoding")(__v.asInstanceOf[js.Any]))
      primaryKey.foreach(__v => __obj.updateDynamic("primaryKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VsamAttributes]
    }
  }

  /** The attributes of a VSAM type data set.
    */
  @js.native
  trait VsamDetailAttributes extends js.Object {
    var alternateKeys: js.UndefOr[AlternateKeyList]
    var cacheAtStartup: js.UndefOr[Boolean]
    var compressed: js.UndefOr[Boolean]
    var encoding: js.UndefOr[String20]
    var primaryKey: js.UndefOr[PrimaryKey]
    var recordFormat: js.UndefOr[String20]
  }

  object VsamDetailAttributes {
    @inline
    def apply(
        alternateKeys: js.UndefOr[AlternateKeyList] = js.undefined,
        cacheAtStartup: js.UndefOr[Boolean] = js.undefined,
        compressed: js.UndefOr[Boolean] = js.undefined,
        encoding: js.UndefOr[String20] = js.undefined,
        primaryKey: js.UndefOr[PrimaryKey] = js.undefined,
        recordFormat: js.UndefOr[String20] = js.undefined
    ): VsamDetailAttributes = {
      val __obj = js.Dynamic.literal()
      alternateKeys.foreach(__v => __obj.updateDynamic("alternateKeys")(__v.asInstanceOf[js.Any]))
      cacheAtStartup.foreach(__v => __obj.updateDynamic("cacheAtStartup")(__v.asInstanceOf[js.Any]))
      compressed.foreach(__v => __obj.updateDynamic("compressed")(__v.asInstanceOf[js.Any]))
      encoding.foreach(__v => __obj.updateDynamic("encoding")(__v.asInstanceOf[js.Any]))
      primaryKey.foreach(__v => __obj.updateDynamic("primaryKey")(__v.asInstanceOf[js.Any]))
      recordFormat.foreach(__v => __obj.updateDynamic("recordFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VsamDetailAttributes]
    }
  }
}
