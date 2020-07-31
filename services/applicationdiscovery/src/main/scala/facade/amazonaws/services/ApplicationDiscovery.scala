package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object applicationdiscovery {
  type AgentConfigurationStatusList = js.Array[AgentConfigurationStatus]
  type AgentId = String
  type AgentIds = js.Array[AgentId]
  type AgentNetworkInfoList = js.Array[AgentNetworkInfo]
  type AgentsInfo = js.Array[AgentInfo]
  type ApplicationId = String
  type ApplicationIdsList = js.Array[ApplicationId]
  type BatchDeleteImportDataErrorDescription = String
  type BatchDeleteImportDataErrorList = js.Array[BatchDeleteImportDataError]
  type BoxedInteger = Int
  type ClientRequestToken = String
  type Condition = String
  type Configuration = js.Dictionary[String]
  type ConfigurationId = String
  type ConfigurationIdList = js.Array[ConfigurationId]
  type ConfigurationTagSet = js.Array[ConfigurationTag]
  type Configurations = js.Array[Configuration]
  type ConfigurationsDownloadUrl = String
  type ConfigurationsExportId = String
  type ContinuousExportDescriptions = js.Array[ContinuousExportDescription]
  type ContinuousExportIds = js.Array[ConfigurationsExportId]
  type DatabaseName = String
  type DescribeConfigurationsAttribute = js.Dictionary[String]
  type DescribeConfigurationsAttributes = js.Array[DescribeConfigurationsAttribute]
  type DescribeContinuousExportsMaxResults = Int
  type DescribeImportTasksFilterList = js.Array[ImportTaskFilter]
  type DescribeImportTasksMaxResults = Int
  type ExportDataFormats = js.Array[ExportDataFormat]
  type ExportFilters = js.Array[ExportFilter]
  type ExportIds = js.Array[ConfigurationsExportId]
  type ExportRequestTime = js.Date
  type ExportStatusMessage = String
  type ExportsInfo = js.Array[ExportInfo]
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type ImportTaskFilterValue = String
  type ImportTaskFilterValueList = js.Array[ImportTaskFilterValue]
  type ImportTaskIdentifier = String
  type ImportTaskList = js.Array[ImportTask]
  type ImportTaskName = String
  type ImportURL = String
  type NeighborDetailsList = js.Array[NeighborConnectionDetail]
  type NextToken = String
  type OrderByList = js.Array[OrderByElement]
  type S3Bucket = String
  type S3PresignedUrl = String
  type SchemaStorageConfig = js.Dictionary[String]
  type StringMax255 = String
  type TagFilters = js.Array[TagFilter]
  type TagKey = String
  type TagSet = js.Array[Tag]
  type TagValue = String
  type TimeStamp = js.Date
  type ToDeleteIdentifierList = js.Array[ImportTaskIdentifier]

  implicit final class ApplicationDiscoveryOps(private val service: ApplicationDiscovery) extends AnyVal {

    @inline def associateConfigurationItemsToApplicationFuture(params: AssociateConfigurationItemsToApplicationRequest): Future[AssociateConfigurationItemsToApplicationResponse] = service.associateConfigurationItemsToApplication(params).promise().toFuture
    @inline def batchDeleteImportDataFuture(params: BatchDeleteImportDataRequest): Future[BatchDeleteImportDataResponse] = service.batchDeleteImportData(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] = service.createApplication(params).promise().toFuture
    @inline def createTagsFuture(params: CreateTagsRequest): Future[CreateTagsResponse] = service.createTags(params).promise().toFuture
    @inline def deleteApplicationsFuture(params: DeleteApplicationsRequest): Future[DeleteApplicationsResponse] = service.deleteApplications(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsRequest): Future[DeleteTagsResponse] = service.deleteTags(params).promise().toFuture
    @inline def describeAgentsFuture(params: DescribeAgentsRequest): Future[DescribeAgentsResponse] = service.describeAgents(params).promise().toFuture
    @inline def describeConfigurationsFuture(params: DescribeConfigurationsRequest): Future[DescribeConfigurationsResponse] = service.describeConfigurations(params).promise().toFuture
    @inline def describeContinuousExportsFuture(params: DescribeContinuousExportsRequest): Future[DescribeContinuousExportsResponse] = service.describeContinuousExports(params).promise().toFuture
    @inline def describeExportTasksFuture(params: DescribeExportTasksRequest): Future[DescribeExportTasksResponse] = service.describeExportTasks(params).promise().toFuture
    @inline def describeImportTasksFuture(params: DescribeImportTasksRequest): Future[DescribeImportTasksResponse] = service.describeImportTasks(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResponse] = service.describeTags(params).promise().toFuture
    @inline def disassociateConfigurationItemsFromApplicationFuture(params: DisassociateConfigurationItemsFromApplicationRequest): Future[DisassociateConfigurationItemsFromApplicationResponse] = service.disassociateConfigurationItemsFromApplication(params).promise().toFuture
    @inline def getDiscoverySummaryFuture(params: GetDiscoverySummaryRequest): Future[GetDiscoverySummaryResponse] = service.getDiscoverySummary(params).promise().toFuture
    @inline def listConfigurationsFuture(params: ListConfigurationsRequest): Future[ListConfigurationsResponse] = service.listConfigurations(params).promise().toFuture
    @inline def listServerNeighborsFuture(params: ListServerNeighborsRequest): Future[ListServerNeighborsResponse] = service.listServerNeighbors(params).promise().toFuture
    @inline def startContinuousExportFuture(params: StartContinuousExportRequest): Future[StartContinuousExportResponse] = service.startContinuousExport(params).promise().toFuture
    @inline def startDataCollectionByAgentIdsFuture(params: StartDataCollectionByAgentIdsRequest): Future[StartDataCollectionByAgentIdsResponse] = service.startDataCollectionByAgentIds(params).promise().toFuture
    @inline def startExportTaskFuture(params: StartExportTaskRequest): Future[StartExportTaskResponse] = service.startExportTask(params).promise().toFuture
    @inline def startImportTaskFuture(params: StartImportTaskRequest): Future[StartImportTaskResponse] = service.startImportTask(params).promise().toFuture
    @inline def stopContinuousExportFuture(params: StopContinuousExportRequest): Future[StopContinuousExportResponse] = service.stopContinuousExport(params).promise().toFuture
    @inline def stopDataCollectionByAgentIdsFuture(params: StopDataCollectionByAgentIdsRequest): Future[StopDataCollectionByAgentIdsResponse] = service.stopDataCollectionByAgentIds(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] = service.updateApplication(params).promise().toFuture
  }
}

package applicationdiscovery {
  @js.native
  @JSImport("aws-sdk", "Discovery", "AWS.Discovery")
  class ApplicationDiscovery() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateConfigurationItemsToApplication(params: AssociateConfigurationItemsToApplicationRequest): Request[AssociateConfigurationItemsToApplicationResponse] = js.native
    def batchDeleteImportData(params: BatchDeleteImportDataRequest): Request[BatchDeleteImportDataResponse] = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def createTags(params: CreateTagsRequest): Request[CreateTagsResponse] = js.native
    def deleteApplications(params: DeleteApplicationsRequest): Request[DeleteApplicationsResponse] = js.native
    def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResponse] = js.native
    def describeAgents(params: DescribeAgentsRequest): Request[DescribeAgentsResponse] = js.native
    def describeConfigurations(params: DescribeConfigurationsRequest): Request[DescribeConfigurationsResponse] = js.native
    def describeContinuousExports(params: DescribeContinuousExportsRequest): Request[DescribeContinuousExportsResponse] = js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResponse] = js.native
    def describeImportTasks(params: DescribeImportTasksRequest): Request[DescribeImportTasksResponse] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse] = js.native
    def disassociateConfigurationItemsFromApplication(params: DisassociateConfigurationItemsFromApplicationRequest): Request[DisassociateConfigurationItemsFromApplicationResponse] = js.native
    def getDiscoverySummary(params: GetDiscoverySummaryRequest): Request[GetDiscoverySummaryResponse] = js.native
    def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse] = js.native
    def listServerNeighbors(params: ListServerNeighborsRequest): Request[ListServerNeighborsResponse] = js.native
    def startContinuousExport(params: StartContinuousExportRequest): Request[StartContinuousExportResponse] = js.native
    def startDataCollectionByAgentIds(params: StartDataCollectionByAgentIdsRequest): Request[StartDataCollectionByAgentIdsResponse] = js.native
    def startExportTask(params: StartExportTaskRequest): Request[StartExportTaskResponse] = js.native
    def startImportTask(params: StartImportTaskRequest): Request[StartImportTaskResponse] = js.native
    def stopContinuousExport(params: StopContinuousExportRequest): Request[StopContinuousExportResponse] = js.native
    def stopDataCollectionByAgentIds(params: StopDataCollectionByAgentIdsRequest): Request[StopDataCollectionByAgentIdsResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def describeExportConfigurations(params: DescribeExportConfigurationsRequest): Request[DescribeExportConfigurationsResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def exportConfigurations(): Request[ExportConfigurationsResponse] = js.native
  }

  /**
    * Information about agents or connectors that were instructed to start collecting data. Information includes the agent/connector ID, a description of the operation, and whether the agent/connector configuration was updated.
    */
  @js.native
  trait AgentConfigurationStatus extends js.Object {
    var agentId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var operationSucceeded: js.UndefOr[Boolean]
  }

  object AgentConfigurationStatus {
    @inline
    def apply(
        agentId: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        operationSucceeded: js.UndefOr[Boolean] = js.undefined
    ): AgentConfigurationStatus = {
      val __obj = js.Dynamic.literal()
      agentId.foreach(__v => __obj.updateDynamic("agentId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      operationSucceeded.foreach(__v => __obj.updateDynamic("operationSucceeded")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentConfigurationStatus]
    }
  }

  /**
    * Information about agents or connectors associated with the user’s AWS account. Information includes agent or connector IDs, IP addresses, media access control (MAC) addresses, agent or connector health, hostname where the agent or connector resides, and agent version for each agent.
    */
  @js.native
  trait AgentInfo extends js.Object {
    var agentId: js.UndefOr[AgentId]
    var agentNetworkInfoList: js.UndefOr[AgentNetworkInfoList]
    var agentType: js.UndefOr[String]
    var collectionStatus: js.UndefOr[String]
    var connectorId: js.UndefOr[String]
    var health: js.UndefOr[AgentStatus]
    var hostName: js.UndefOr[String]
    var lastHealthPingTime: js.UndefOr[String]
    var registeredTime: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object AgentInfo {
    @inline
    def apply(
        agentId: js.UndefOr[AgentId] = js.undefined,
        agentNetworkInfoList: js.UndefOr[AgentNetworkInfoList] = js.undefined,
        agentType: js.UndefOr[String] = js.undefined,
        collectionStatus: js.UndefOr[String] = js.undefined,
        connectorId: js.UndefOr[String] = js.undefined,
        health: js.UndefOr[AgentStatus] = js.undefined,
        hostName: js.UndefOr[String] = js.undefined,
        lastHealthPingTime: js.UndefOr[String] = js.undefined,
        registeredTime: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): AgentInfo = {
      val __obj = js.Dynamic.literal()
      agentId.foreach(__v => __obj.updateDynamic("agentId")(__v.asInstanceOf[js.Any]))
      agentNetworkInfoList.foreach(__v => __obj.updateDynamic("agentNetworkInfoList")(__v.asInstanceOf[js.Any]))
      agentType.foreach(__v => __obj.updateDynamic("agentType")(__v.asInstanceOf[js.Any]))
      collectionStatus.foreach(__v => __obj.updateDynamic("collectionStatus")(__v.asInstanceOf[js.Any]))
      connectorId.foreach(__v => __obj.updateDynamic("connectorId")(__v.asInstanceOf[js.Any]))
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      hostName.foreach(__v => __obj.updateDynamic("hostName")(__v.asInstanceOf[js.Any]))
      lastHealthPingTime.foreach(__v => __obj.updateDynamic("lastHealthPingTime")(__v.asInstanceOf[js.Any]))
      registeredTime.foreach(__v => __obj.updateDynamic("registeredTime")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentInfo]
    }
  }

  /**
    * Network details about the host where the agent/connector resides.
    */
  @js.native
  trait AgentNetworkInfo extends js.Object {
    var ipAddress: js.UndefOr[String]
    var macAddress: js.UndefOr[String]
  }

  object AgentNetworkInfo {
    @inline
    def apply(
        ipAddress: js.UndefOr[String] = js.undefined,
        macAddress: js.UndefOr[String] = js.undefined
    ): AgentNetworkInfo = {
      val __obj = js.Dynamic.literal()
      ipAddress.foreach(__v => __obj.updateDynamic("ipAddress")(__v.asInstanceOf[js.Any]))
      macAddress.foreach(__v => __obj.updateDynamic("macAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AgentNetworkInfo]
    }
  }

  @js.native
  sealed trait AgentStatus extends js.Any
  object AgentStatus {
    val HEALTHY = "HEALTHY".asInstanceOf[AgentStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[AgentStatus]
    val RUNNING = "RUNNING".asInstanceOf[AgentStatus]
    val UNKNOWN = "UNKNOWN".asInstanceOf[AgentStatus]
    val BLACKLISTED = "BLACKLISTED".asInstanceOf[AgentStatus]
    val SHUTDOWN = "SHUTDOWN".asInstanceOf[AgentStatus]

    @inline def values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY, RUNNING, UNKNOWN, BLACKLISTED, SHUTDOWN))
  }

  @js.native
  trait AssociateConfigurationItemsToApplicationRequest extends js.Object {
    var applicationConfigurationId: ApplicationId
    var configurationIds: ConfigurationIdList
  }

  object AssociateConfigurationItemsToApplicationRequest {
    @inline
    def apply(
        applicationConfigurationId: ApplicationId,
        configurationIds: ConfigurationIdList
    ): AssociateConfigurationItemsToApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationConfigurationId" -> applicationConfigurationId.asInstanceOf[js.Any],
        "configurationIds" -> configurationIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateConfigurationItemsToApplicationRequest]
    }
  }

  @js.native
  trait AssociateConfigurationItemsToApplicationResponse extends js.Object {}

  object AssociateConfigurationItemsToApplicationResponse {
    @inline
    def apply(
    ): AssociateConfigurationItemsToApplicationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateConfigurationItemsToApplicationResponse]
    }
  }

  /**
    * Error messages returned for each import task that you deleted as a response for this command.
    */
  @js.native
  trait BatchDeleteImportDataError extends js.Object {
    var errorCode: js.UndefOr[BatchDeleteImportDataErrorCode]
    var errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription]
    var importTaskId: js.UndefOr[ImportTaskIdentifier]
  }

  object BatchDeleteImportDataError {
    @inline
    def apply(
        errorCode: js.UndefOr[BatchDeleteImportDataErrorCode] = js.undefined,
        errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription] = js.undefined,
        importTaskId: js.UndefOr[ImportTaskIdentifier] = js.undefined
    ): BatchDeleteImportDataError = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorDescription.foreach(__v => __obj.updateDynamic("errorDescription")(__v.asInstanceOf[js.Any]))
      importTaskId.foreach(__v => __obj.updateDynamic("importTaskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteImportDataError]
    }
  }

  @js.native
  sealed trait BatchDeleteImportDataErrorCode extends js.Any
  object BatchDeleteImportDataErrorCode {
    val NOT_FOUND = "NOT_FOUND".asInstanceOf[BatchDeleteImportDataErrorCode]
    val INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[BatchDeleteImportDataErrorCode]
    val OVER_LIMIT = "OVER_LIMIT".asInstanceOf[BatchDeleteImportDataErrorCode]

    @inline def values = js.Object.freeze(js.Array(NOT_FOUND, INTERNAL_SERVER_ERROR, OVER_LIMIT))
  }

  @js.native
  trait BatchDeleteImportDataRequest extends js.Object {
    var importTaskIds: ToDeleteIdentifierList
  }

  object BatchDeleteImportDataRequest {
    @inline
    def apply(
        importTaskIds: ToDeleteIdentifierList
    ): BatchDeleteImportDataRequest = {
      val __obj = js.Dynamic.literal(
        "importTaskIds" -> importTaskIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDeleteImportDataRequest]
    }
  }

  @js.native
  trait BatchDeleteImportDataResponse extends js.Object {
    var errors: js.UndefOr[BatchDeleteImportDataErrorList]
  }

  object BatchDeleteImportDataResponse {
    @inline
    def apply(
        errors: js.UndefOr[BatchDeleteImportDataErrorList] = js.undefined
    ): BatchDeleteImportDataResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteImportDataResponse]
    }
  }

  @js.native
  sealed trait ConfigurationItemType extends js.Any
  object ConfigurationItemType {
    val SERVER = "SERVER".asInstanceOf[ConfigurationItemType]
    val PROCESS = "PROCESS".asInstanceOf[ConfigurationItemType]
    val CONNECTION = "CONNECTION".asInstanceOf[ConfigurationItemType]
    val APPLICATION = "APPLICATION".asInstanceOf[ConfigurationItemType]

    @inline def values = js.Object.freeze(js.Array(SERVER, PROCESS, CONNECTION, APPLICATION))
  }

  /**
    * Tags for a configuration item. Tags are metadata that help you categorize IT assets.
    */
  @js.native
  trait ConfigurationTag extends js.Object {
    var configurationId: js.UndefOr[ConfigurationId]
    var configurationType: js.UndefOr[ConfigurationItemType]
    var key: js.UndefOr[TagKey]
    var timeOfCreation: js.UndefOr[TimeStamp]
    var value: js.UndefOr[TagValue]
  }

  object ConfigurationTag {
    @inline
    def apply(
        configurationId: js.UndefOr[ConfigurationId] = js.undefined,
        configurationType: js.UndefOr[ConfigurationItemType] = js.undefined,
        key: js.UndefOr[TagKey] = js.undefined,
        timeOfCreation: js.UndefOr[TimeStamp] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): ConfigurationTag = {
      val __obj = js.Dynamic.literal()
      configurationId.foreach(__v => __obj.updateDynamic("configurationId")(__v.asInstanceOf[js.Any]))
      configurationType.foreach(__v => __obj.updateDynamic("configurationType")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      timeOfCreation.foreach(__v => __obj.updateDynamic("timeOfCreation")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationTag]
    }
  }

  /**
    * A list of continuous export descriptions.
    */
  @js.native
  trait ContinuousExportDescription extends js.Object {
    var dataSource: js.UndefOr[DataSource]
    var exportId: js.UndefOr[ConfigurationsExportId]
    var s3Bucket: js.UndefOr[S3Bucket]
    var schemaStorageConfig: js.UndefOr[SchemaStorageConfig]
    var startTime: js.UndefOr[TimeStamp]
    var status: js.UndefOr[ContinuousExportStatus]
    var statusDetail: js.UndefOr[StringMax255]
    var stopTime: js.UndefOr[TimeStamp]
  }

  object ContinuousExportDescription {
    @inline
    def apply(
        dataSource: js.UndefOr[DataSource] = js.undefined,
        exportId: js.UndefOr[ConfigurationsExportId] = js.undefined,
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined,
        status: js.UndefOr[ContinuousExportStatus] = js.undefined,
        statusDetail: js.UndefOr[StringMax255] = js.undefined,
        stopTime: js.UndefOr[TimeStamp] = js.undefined
    ): ContinuousExportDescription = {
      val __obj = js.Dynamic.literal()
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      exportId.foreach(__v => __obj.updateDynamic("exportId")(__v.asInstanceOf[js.Any]))
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      schemaStorageConfig.foreach(__v => __obj.updateDynamic("schemaStorageConfig")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusDetail.foreach(__v => __obj.updateDynamic("statusDetail")(__v.asInstanceOf[js.Any]))
      stopTime.foreach(__v => __obj.updateDynamic("stopTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContinuousExportDescription]
    }
  }

  @js.native
  sealed trait ContinuousExportStatus extends js.Any
  object ContinuousExportStatus {
    val START_IN_PROGRESS = "START_IN_PROGRESS".asInstanceOf[ContinuousExportStatus]
    val START_FAILED = "START_FAILED".asInstanceOf[ContinuousExportStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[ContinuousExportStatus]
    val ERROR = "ERROR".asInstanceOf[ContinuousExportStatus]
    val STOP_IN_PROGRESS = "STOP_IN_PROGRESS".asInstanceOf[ContinuousExportStatus]
    val STOP_FAILED = "STOP_FAILED".asInstanceOf[ContinuousExportStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[ContinuousExportStatus]

    @inline def values = js.Object.freeze(js.Array(START_IN_PROGRESS, START_FAILED, ACTIVE, ERROR, STOP_IN_PROGRESS, STOP_FAILED, INACTIVE))
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var name: String
    var description: js.UndefOr[String]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        name: String,
        description: js.UndefOr[String] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var configurationId: js.UndefOr[String]
  }

  object CreateApplicationResponse {
    @inline
    def apply(
        configurationId: js.UndefOr[String] = js.undefined
    ): CreateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      configurationId.foreach(__v => __obj.updateDynamic("configurationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateTagsRequest extends js.Object {
    var configurationIds: ConfigurationIdList
    var tags: TagSet
  }

  object CreateTagsRequest {
    @inline
    def apply(
        configurationIds: ConfigurationIdList,
        tags: TagSet
    ): CreateTagsRequest = {
      val __obj = js.Dynamic.literal(
        "configurationIds" -> configurationIds.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTagsRequest]
    }
  }

  @js.native
  trait CreateTagsResponse extends js.Object {}

  object CreateTagsResponse {
    @inline
    def apply(
    ): CreateTagsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateTagsResponse]
    }
  }

  /**
    * Inventory data for installed discovery agents.
    */
  @js.native
  trait CustomerAgentInfo extends js.Object {
    var activeAgents: Int
    var blackListedAgents: Int
    var healthyAgents: Int
    var shutdownAgents: Int
    var totalAgents: Int
    var unhealthyAgents: Int
    var unknownAgents: Int
  }

  object CustomerAgentInfo {
    @inline
    def apply(
        activeAgents: Int,
        blackListedAgents: Int,
        healthyAgents: Int,
        shutdownAgents: Int,
        totalAgents: Int,
        unhealthyAgents: Int,
        unknownAgents: Int
    ): CustomerAgentInfo = {
      val __obj = js.Dynamic.literal(
        "activeAgents" -> activeAgents.asInstanceOf[js.Any],
        "blackListedAgents" -> blackListedAgents.asInstanceOf[js.Any],
        "healthyAgents" -> healthyAgents.asInstanceOf[js.Any],
        "shutdownAgents" -> shutdownAgents.asInstanceOf[js.Any],
        "totalAgents" -> totalAgents.asInstanceOf[js.Any],
        "unhealthyAgents" -> unhealthyAgents.asInstanceOf[js.Any],
        "unknownAgents" -> unknownAgents.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CustomerAgentInfo]
    }
  }

  /**
    * Inventory data for installed discovery connectors.
    */
  @js.native
  trait CustomerConnectorInfo extends js.Object {
    var activeConnectors: Int
    var blackListedConnectors: Int
    var healthyConnectors: Int
    var shutdownConnectors: Int
    var totalConnectors: Int
    var unhealthyConnectors: Int
    var unknownConnectors: Int
  }

  object CustomerConnectorInfo {
    @inline
    def apply(
        activeConnectors: Int,
        blackListedConnectors: Int,
        healthyConnectors: Int,
        shutdownConnectors: Int,
        totalConnectors: Int,
        unhealthyConnectors: Int,
        unknownConnectors: Int
    ): CustomerConnectorInfo = {
      val __obj = js.Dynamic.literal(
        "activeConnectors" -> activeConnectors.asInstanceOf[js.Any],
        "blackListedConnectors" -> blackListedConnectors.asInstanceOf[js.Any],
        "healthyConnectors" -> healthyConnectors.asInstanceOf[js.Any],
        "shutdownConnectors" -> shutdownConnectors.asInstanceOf[js.Any],
        "totalConnectors" -> totalConnectors.asInstanceOf[js.Any],
        "unhealthyConnectors" -> unhealthyConnectors.asInstanceOf[js.Any],
        "unknownConnectors" -> unknownConnectors.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CustomerConnectorInfo]
    }
  }

  @js.native
  sealed trait DataSource extends js.Any
  object DataSource {
    val AGENT = "AGENT".asInstanceOf[DataSource]

    @inline def values = js.Object.freeze(js.Array(AGENT))
  }

  @js.native
  trait DeleteApplicationsRequest extends js.Object {
    var configurationIds: ApplicationIdsList
  }

  object DeleteApplicationsRequest {
    @inline
    def apply(
        configurationIds: ApplicationIdsList
    ): DeleteApplicationsRequest = {
      val __obj = js.Dynamic.literal(
        "configurationIds" -> configurationIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationsRequest]
    }
  }

  @js.native
  trait DeleteApplicationsResponse extends js.Object {}

  object DeleteApplicationsResponse {
    @inline
    def apply(
    ): DeleteApplicationsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteApplicationsResponse]
    }
  }

  @js.native
  trait DeleteTagsRequest extends js.Object {
    var configurationIds: ConfigurationIdList
    var tags: js.UndefOr[TagSet]
  }

  object DeleteTagsRequest {
    @inline
    def apply(
        configurationIds: ConfigurationIdList,
        tags: js.UndefOr[TagSet] = js.undefined
    ): DeleteTagsRequest = {
      val __obj = js.Dynamic.literal(
        "configurationIds" -> configurationIds.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTagsRequest]
    }
  }

  @js.native
  trait DeleteTagsResponse extends js.Object {}

  object DeleteTagsResponse {
    @inline
    def apply(
    ): DeleteTagsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTagsResponse]
    }
  }

  @js.native
  trait DescribeAgentsRequest extends js.Object {
    var agentIds: js.UndefOr[AgentIds]
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeAgentsRequest {
    @inline
    def apply(
        agentIds: js.UndefOr[AgentIds] = js.undefined,
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAgentsRequest = {
      val __obj = js.Dynamic.literal()
      agentIds.foreach(__v => __obj.updateDynamic("agentIds")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAgentsRequest]
    }
  }

  @js.native
  trait DescribeAgentsResponse extends js.Object {
    var agentsInfo: js.UndefOr[AgentsInfo]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeAgentsResponse {
    @inline
    def apply(
        agentsInfo: js.UndefOr[AgentsInfo] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAgentsResponse = {
      val __obj = js.Dynamic.literal()
      agentsInfo.foreach(__v => __obj.updateDynamic("agentsInfo")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAgentsResponse]
    }
  }

  @js.native
  trait DescribeConfigurationsRequest extends js.Object {
    var configurationIds: ConfigurationIdList
  }

  object DescribeConfigurationsRequest {
    @inline
    def apply(
        configurationIds: ConfigurationIdList
    ): DescribeConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "configurationIds" -> configurationIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeConfigurationsResponse extends js.Object {
    var configurations: js.UndefOr[DescribeConfigurationsAttributes]
  }

  object DescribeConfigurationsResponse {
    @inline
    def apply(
        configurations: js.UndefOr[DescribeConfigurationsAttributes] = js.undefined
    ): DescribeConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      configurations.foreach(__v => __obj.updateDynamic("configurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationsResponse]
    }
  }

  @js.native
  trait DescribeContinuousExportsRequest extends js.Object {
    var exportIds: js.UndefOr[ContinuousExportIds]
    var maxResults: js.UndefOr[DescribeContinuousExportsMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeContinuousExportsRequest {
    @inline
    def apply(
        exportIds: js.UndefOr[ContinuousExportIds] = js.undefined,
        maxResults: js.UndefOr[DescribeContinuousExportsMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeContinuousExportsRequest = {
      val __obj = js.Dynamic.literal()
      exportIds.foreach(__v => __obj.updateDynamic("exportIds")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContinuousExportsRequest]
    }
  }

  @js.native
  trait DescribeContinuousExportsResponse extends js.Object {
    var descriptions: js.UndefOr[ContinuousExportDescriptions]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeContinuousExportsResponse {
    @inline
    def apply(
        descriptions: js.UndefOr[ContinuousExportDescriptions] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeContinuousExportsResponse = {
      val __obj = js.Dynamic.literal()
      descriptions.foreach(__v => __obj.updateDynamic("descriptions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContinuousExportsResponse]
    }
  }

  @js.native
  trait DescribeExportConfigurationsRequest extends js.Object {
    var exportIds: js.UndefOr[ExportIds]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeExportConfigurationsRequest {
    @inline
    def apply(
        exportIds: js.UndefOr[ExportIds] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      exportIds.foreach(__v => __obj.updateDynamic("exportIds")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExportConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeExportConfigurationsResponse extends js.Object {
    var exportsInfo: js.UndefOr[ExportsInfo]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeExportConfigurationsResponse {
    @inline
    def apply(
        exportsInfo: js.UndefOr[ExportsInfo] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      exportsInfo.foreach(__v => __obj.updateDynamic("exportsInfo")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExportConfigurationsResponse]
    }
  }

  @js.native
  trait DescribeExportTasksRequest extends js.Object {
    var exportIds: js.UndefOr[ExportIds]
    var filters: js.UndefOr[ExportFilters]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeExportTasksRequest {
    @inline
    def apply(
        exportIds: js.UndefOr[ExportIds] = js.undefined,
        filters: js.UndefOr[ExportFilters] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportTasksRequest = {
      val __obj = js.Dynamic.literal()
      exportIds.foreach(__v => __obj.updateDynamic("exportIds")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExportTasksRequest]
    }
  }

  @js.native
  trait DescribeExportTasksResponse extends js.Object {
    var exportsInfo: js.UndefOr[ExportsInfo]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeExportTasksResponse {
    @inline
    def apply(
        exportsInfo: js.UndefOr[ExportsInfo] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportTasksResponse = {
      val __obj = js.Dynamic.literal()
      exportsInfo.foreach(__v => __obj.updateDynamic("exportsInfo")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExportTasksResponse]
    }
  }

  @js.native
  trait DescribeImportTasksRequest extends js.Object {
    var filters: js.UndefOr[DescribeImportTasksFilterList]
    var maxResults: js.UndefOr[DescribeImportTasksMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeImportTasksRequest {
    @inline
    def apply(
        filters: js.UndefOr[DescribeImportTasksFilterList] = js.undefined,
        maxResults: js.UndefOr[DescribeImportTasksMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeImportTasksRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImportTasksRequest]
    }
  }

  @js.native
  trait DescribeImportTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[ImportTaskList]
  }

  object DescribeImportTasksResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tasks: js.UndefOr[ImportTaskList] = js.undefined
    ): DescribeImportTasksResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tasks.foreach(__v => __obj.updateDynamic("tasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImportTasksResponse]
    }
  }

  @js.native
  trait DescribeTagsRequest extends js.Object {
    var filters: js.UndefOr[TagFilters]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeTagsRequest {
    @inline
    def apply(
        filters: js.UndefOr[TagFilters] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeTagsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsRequest]
    }
  }

  @js.native
  trait DescribeTagsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[ConfigurationTagSet]
  }

  object DescribeTagsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[ConfigurationTagSet] = js.undefined
    ): DescribeTagsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsResponse]
    }
  }

  @js.native
  trait DisassociateConfigurationItemsFromApplicationRequest extends js.Object {
    var applicationConfigurationId: ApplicationId
    var configurationIds: ConfigurationIdList
  }

  object DisassociateConfigurationItemsFromApplicationRequest {
    @inline
    def apply(
        applicationConfigurationId: ApplicationId,
        configurationIds: ConfigurationIdList
    ): DisassociateConfigurationItemsFromApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationConfigurationId" -> applicationConfigurationId.asInstanceOf[js.Any],
        "configurationIds" -> configurationIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateConfigurationItemsFromApplicationRequest]
    }
  }

  @js.native
  trait DisassociateConfigurationItemsFromApplicationResponse extends js.Object {}

  object DisassociateConfigurationItemsFromApplicationResponse {
    @inline
    def apply(
    ): DisassociateConfigurationItemsFromApplicationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateConfigurationItemsFromApplicationResponse]
    }
  }

  @js.native
  trait ExportConfigurationsResponse extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
  }

  object ExportConfigurationsResponse {
    @inline
    def apply(
        exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
    ): ExportConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      exportId.foreach(__v => __obj.updateDynamic("exportId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportConfigurationsResponse]
    }
  }

  @js.native
  sealed trait ExportDataFormat extends js.Any
  object ExportDataFormat {
    val CSV = "CSV".asInstanceOf[ExportDataFormat]
    val GRAPHML = "GRAPHML".asInstanceOf[ExportDataFormat]

    @inline def values = js.Object.freeze(js.Array(CSV, GRAPHML))
  }

  /**
    * Used to select which agent's data is to be exported. A single agent ID may be selected for export using the [[http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html|StartExportTask]] action.
    */
  @js.native
  trait ExportFilter extends js.Object {
    var condition: Condition
    var name: FilterName
    var values: FilterValues
  }

  object ExportFilter {
    @inline
    def apply(
        condition: Condition,
        name: FilterName,
        values: FilterValues
    ): ExportFilter = {
      val __obj = js.Dynamic.literal(
        "condition" -> condition.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExportFilter]
    }
  }

  /**
    * Information regarding the export status of discovered data. The value is an array of objects.
    */
  @js.native
  trait ExportInfo extends js.Object {
    var exportId: ConfigurationsExportId
    var exportRequestTime: ExportRequestTime
    var exportStatus: ExportStatus
    var statusMessage: ExportStatusMessage
    var configurationsDownloadUrl: js.UndefOr[ConfigurationsDownloadUrl]
    var isTruncated: js.UndefOr[Boolean]
    var requestedEndTime: js.UndefOr[TimeStamp]
    var requestedStartTime: js.UndefOr[TimeStamp]
  }

  object ExportInfo {
    @inline
    def apply(
        exportId: ConfigurationsExportId,
        exportRequestTime: ExportRequestTime,
        exportStatus: ExportStatus,
        statusMessage: ExportStatusMessage,
        configurationsDownloadUrl: js.UndefOr[ConfigurationsDownloadUrl] = js.undefined,
        isTruncated: js.UndefOr[Boolean] = js.undefined,
        requestedEndTime: js.UndefOr[TimeStamp] = js.undefined,
        requestedStartTime: js.UndefOr[TimeStamp] = js.undefined
    ): ExportInfo = {
      val __obj = js.Dynamic.literal(
        "exportId" -> exportId.asInstanceOf[js.Any],
        "exportRequestTime" -> exportRequestTime.asInstanceOf[js.Any],
        "exportStatus" -> exportStatus.asInstanceOf[js.Any],
        "statusMessage" -> statusMessage.asInstanceOf[js.Any]
      )

      configurationsDownloadUrl.foreach(__v => __obj.updateDynamic("configurationsDownloadUrl")(__v.asInstanceOf[js.Any]))
      isTruncated.foreach(__v => __obj.updateDynamic("isTruncated")(__v.asInstanceOf[js.Any]))
      requestedEndTime.foreach(__v => __obj.updateDynamic("requestedEndTime")(__v.asInstanceOf[js.Any]))
      requestedStartTime.foreach(__v => __obj.updateDynamic("requestedStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportInfo]
    }
  }

  @js.native
  sealed trait ExportStatus extends js.Any
  object ExportStatus {
    val FAILED = "FAILED".asInstanceOf[ExportStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[ExportStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExportStatus]

    @inline def values = js.Object.freeze(js.Array(FAILED, SUCCEEDED, IN_PROGRESS))
  }

  /**
    * A filter that can use conditional operators.
    *  For more information about filters, see [[https://docs.aws.amazon.com/application-discovery/latest/userguide/discovery-api-queries.html|Querying Discovered Configuration Items]] in the <i>AWS Application Discovery Service User Guide</i>.
    */
  @js.native
  trait Filter extends js.Object {
    var condition: Condition
    var name: String
    var values: FilterValues
  }

  object Filter {
    @inline
    def apply(
        condition: Condition,
        name: String,
        values: FilterValues
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "condition" -> condition.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetDiscoverySummaryRequest extends js.Object {}

  object GetDiscoverySummaryRequest {
    @inline
    def apply(
    ): GetDiscoverySummaryRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetDiscoverySummaryRequest]
    }
  }

  @js.native
  trait GetDiscoverySummaryResponse extends js.Object {
    var agentSummary: js.UndefOr[CustomerAgentInfo]
    var applications: js.UndefOr[Double]
    var connectorSummary: js.UndefOr[CustomerConnectorInfo]
    var servers: js.UndefOr[Double]
    var serversMappedToApplications: js.UndefOr[Double]
    var serversMappedtoTags: js.UndefOr[Double]
  }

  object GetDiscoverySummaryResponse {
    @inline
    def apply(
        agentSummary: js.UndefOr[CustomerAgentInfo] = js.undefined,
        applications: js.UndefOr[Double] = js.undefined,
        connectorSummary: js.UndefOr[CustomerConnectorInfo] = js.undefined,
        servers: js.UndefOr[Double] = js.undefined,
        serversMappedToApplications: js.UndefOr[Double] = js.undefined,
        serversMappedtoTags: js.UndefOr[Double] = js.undefined
    ): GetDiscoverySummaryResponse = {
      val __obj = js.Dynamic.literal()
      agentSummary.foreach(__v => __obj.updateDynamic("agentSummary")(__v.asInstanceOf[js.Any]))
      applications.foreach(__v => __obj.updateDynamic("applications")(__v.asInstanceOf[js.Any]))
      connectorSummary.foreach(__v => __obj.updateDynamic("connectorSummary")(__v.asInstanceOf[js.Any]))
      servers.foreach(__v => __obj.updateDynamic("servers")(__v.asInstanceOf[js.Any]))
      serversMappedToApplications.foreach(__v => __obj.updateDynamic("serversMappedToApplications")(__v.asInstanceOf[js.Any]))
      serversMappedtoTags.foreach(__v => __obj.updateDynamic("serversMappedtoTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDiscoverySummaryResponse]
    }
  }

  @js.native
  sealed trait ImportStatus extends js.Any
  object ImportStatus {
    val IMPORT_IN_PROGRESS = "IMPORT_IN_PROGRESS".asInstanceOf[ImportStatus]
    val IMPORT_COMPLETE = "IMPORT_COMPLETE".asInstanceOf[ImportStatus]
    val IMPORT_COMPLETE_WITH_ERRORS = "IMPORT_COMPLETE_WITH_ERRORS".asInstanceOf[ImportStatus]
    val IMPORT_FAILED = "IMPORT_FAILED".asInstanceOf[ImportStatus]
    val IMPORT_FAILED_SERVER_LIMIT_EXCEEDED = "IMPORT_FAILED_SERVER_LIMIT_EXCEEDED".asInstanceOf[ImportStatus]
    val IMPORT_FAILED_RECORD_LIMIT_EXCEEDED = "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED".asInstanceOf[ImportStatus]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ImportStatus]
    val DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[ImportStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ImportStatus]
    val DELETE_FAILED_LIMIT_EXCEEDED = "DELETE_FAILED_LIMIT_EXCEEDED".asInstanceOf[ImportStatus]
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ImportStatus]

    @inline def values =
      js.Object.freeze(js.Array(
        IMPORT_IN_PROGRESS,
        IMPORT_COMPLETE,
        IMPORT_COMPLETE_WITH_ERRORS,
        IMPORT_FAILED,
        IMPORT_FAILED_SERVER_LIMIT_EXCEEDED,
        IMPORT_FAILED_RECORD_LIMIT_EXCEEDED,
        DELETE_IN_PROGRESS,
        DELETE_COMPLETE,
        DELETE_FAILED,
        DELETE_FAILED_LIMIT_EXCEEDED,
        INTERNAL_ERROR
      ))
  }

  /**
    * An array of information related to the import task request that includes status information, times, IDs, the Amazon S3 Object URL for the import file, and more.
    */
  @js.native
  trait ImportTask extends js.Object {
    var applicationImportFailure: js.UndefOr[Int]
    var applicationImportSuccess: js.UndefOr[Int]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var errorsAndFailedEntriesZip: js.UndefOr[S3PresignedUrl]
    var importCompletionTime: js.UndefOr[TimeStamp]
    var importDeletedTime: js.UndefOr[TimeStamp]
    var importRequestTime: js.UndefOr[TimeStamp]
    var importTaskId: js.UndefOr[ImportTaskIdentifier]
    var importUrl: js.UndefOr[ImportURL]
    var name: js.UndefOr[ImportTaskName]
    var serverImportFailure: js.UndefOr[Int]
    var serverImportSuccess: js.UndefOr[Int]
    var status: js.UndefOr[ImportStatus]
  }

  object ImportTask {
    @inline
    def apply(
        applicationImportFailure: js.UndefOr[Int] = js.undefined,
        applicationImportSuccess: js.UndefOr[Int] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        errorsAndFailedEntriesZip: js.UndefOr[S3PresignedUrl] = js.undefined,
        importCompletionTime: js.UndefOr[TimeStamp] = js.undefined,
        importDeletedTime: js.UndefOr[TimeStamp] = js.undefined,
        importRequestTime: js.UndefOr[TimeStamp] = js.undefined,
        importTaskId: js.UndefOr[ImportTaskIdentifier] = js.undefined,
        importUrl: js.UndefOr[ImportURL] = js.undefined,
        name: js.UndefOr[ImportTaskName] = js.undefined,
        serverImportFailure: js.UndefOr[Int] = js.undefined,
        serverImportSuccess: js.UndefOr[Int] = js.undefined,
        status: js.UndefOr[ImportStatus] = js.undefined
    ): ImportTask = {
      val __obj = js.Dynamic.literal()
      applicationImportFailure.foreach(__v => __obj.updateDynamic("applicationImportFailure")(__v.asInstanceOf[js.Any]))
      applicationImportSuccess.foreach(__v => __obj.updateDynamic("applicationImportSuccess")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      errorsAndFailedEntriesZip.foreach(__v => __obj.updateDynamic("errorsAndFailedEntriesZip")(__v.asInstanceOf[js.Any]))
      importCompletionTime.foreach(__v => __obj.updateDynamic("importCompletionTime")(__v.asInstanceOf[js.Any]))
      importDeletedTime.foreach(__v => __obj.updateDynamic("importDeletedTime")(__v.asInstanceOf[js.Any]))
      importRequestTime.foreach(__v => __obj.updateDynamic("importRequestTime")(__v.asInstanceOf[js.Any]))
      importTaskId.foreach(__v => __obj.updateDynamic("importTaskId")(__v.asInstanceOf[js.Any]))
      importUrl.foreach(__v => __obj.updateDynamic("importUrl")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      serverImportFailure.foreach(__v => __obj.updateDynamic("serverImportFailure")(__v.asInstanceOf[js.Any]))
      serverImportSuccess.foreach(__v => __obj.updateDynamic("serverImportSuccess")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportTask]
    }
  }

  /**
    * A name-values pair of elements you can use to filter the results when querying your import tasks. Currently, wildcards are not supported for filters.
    *
    * '''Note:'''When filtering by import status, all other filter values are ignored.
    */
  @js.native
  trait ImportTaskFilter extends js.Object {
    var name: js.UndefOr[ImportTaskFilterName]
    var values: js.UndefOr[ImportTaskFilterValueList]
  }

  object ImportTaskFilter {
    @inline
    def apply(
        name: js.UndefOr[ImportTaskFilterName] = js.undefined,
        values: js.UndefOr[ImportTaskFilterValueList] = js.undefined
    ): ImportTaskFilter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportTaskFilter]
    }
  }

  @js.native
  sealed trait ImportTaskFilterName extends js.Any
  object ImportTaskFilterName {
    val IMPORT_TASK_ID = "IMPORT_TASK_ID".asInstanceOf[ImportTaskFilterName]
    val STATUS = "STATUS".asInstanceOf[ImportTaskFilterName]
    val NAME = "NAME".asInstanceOf[ImportTaskFilterName]

    @inline def values = js.Object.freeze(js.Array(IMPORT_TASK_ID, STATUS, NAME))
  }

  @js.native
  trait ListConfigurationsRequest extends js.Object {
    var configurationType: ConfigurationItemType
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
    var orderBy: js.UndefOr[OrderByList]
  }

  object ListConfigurationsRequest {
    @inline
    def apply(
        configurationType: ConfigurationItemType,
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        orderBy: js.UndefOr[OrderByList] = js.undefined
    ): ListConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "configurationType" -> configurationType.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationsRequest]
    }
  }

  @js.native
  trait ListConfigurationsResponse extends js.Object {
    var configurations: js.UndefOr[Configurations]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListConfigurationsResponse {
    @inline
    def apply(
        configurations: js.UndefOr[Configurations] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      configurations.foreach(__v => __obj.updateDynamic("configurations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationsResponse]
    }
  }

  @js.native
  trait ListServerNeighborsRequest extends js.Object {
    var configurationId: ConfigurationId
    var maxResults: js.UndefOr[Int]
    var neighborConfigurationIds: js.UndefOr[ConfigurationIdList]
    var nextToken: js.UndefOr[String]
    var portInformationNeeded: js.UndefOr[Boolean]
  }

  object ListServerNeighborsRequest {
    @inline
    def apply(
        configurationId: ConfigurationId,
        maxResults: js.UndefOr[Int] = js.undefined,
        neighborConfigurationIds: js.UndefOr[ConfigurationIdList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        portInformationNeeded: js.UndefOr[Boolean] = js.undefined
    ): ListServerNeighborsRequest = {
      val __obj = js.Dynamic.literal(
        "configurationId" -> configurationId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      neighborConfigurationIds.foreach(__v => __obj.updateDynamic("neighborConfigurationIds")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      portInformationNeeded.foreach(__v => __obj.updateDynamic("portInformationNeeded")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServerNeighborsRequest]
    }
  }

  @js.native
  trait ListServerNeighborsResponse extends js.Object {
    var neighbors: NeighborDetailsList
    var knownDependencyCount: js.UndefOr[Double]
    var nextToken: js.UndefOr[String]
  }

  object ListServerNeighborsResponse {
    @inline
    def apply(
        neighbors: NeighborDetailsList,
        knownDependencyCount: js.UndefOr[Double] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListServerNeighborsResponse = {
      val __obj = js.Dynamic.literal(
        "neighbors" -> neighbors.asInstanceOf[js.Any]
      )

      knownDependencyCount.foreach(__v => __obj.updateDynamic("knownDependencyCount")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServerNeighborsResponse]
    }
  }

  /**
    * Details about neighboring servers.
    */
  @js.native
  trait NeighborConnectionDetail extends js.Object {
    var connectionsCount: Double
    var destinationServerId: ConfigurationId
    var sourceServerId: ConfigurationId
    var destinationPort: js.UndefOr[BoxedInteger]
    var transportProtocol: js.UndefOr[String]
  }

  object NeighborConnectionDetail {
    @inline
    def apply(
        connectionsCount: Double,
        destinationServerId: ConfigurationId,
        sourceServerId: ConfigurationId,
        destinationPort: js.UndefOr[BoxedInteger] = js.undefined,
        transportProtocol: js.UndefOr[String] = js.undefined
    ): NeighborConnectionDetail = {
      val __obj = js.Dynamic.literal(
        "connectionsCount" -> connectionsCount.asInstanceOf[js.Any],
        "destinationServerId" -> destinationServerId.asInstanceOf[js.Any],
        "sourceServerId" -> sourceServerId.asInstanceOf[js.Any]
      )

      destinationPort.foreach(__v => __obj.updateDynamic("destinationPort")(__v.asInstanceOf[js.Any]))
      transportProtocol.foreach(__v => __obj.updateDynamic("transportProtocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NeighborConnectionDetail]
    }
  }

  /**
    * A field and direction for ordered output.
    */
  @js.native
  trait OrderByElement extends js.Object {
    var fieldName: String
    var sortOrder: js.UndefOr[orderString]
  }

  object OrderByElement {
    @inline
    def apply(
        fieldName: String,
        sortOrder: js.UndefOr[orderString] = js.undefined
    ): OrderByElement = {
      val __obj = js.Dynamic.literal(
        "fieldName" -> fieldName.asInstanceOf[js.Any]
      )

      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderByElement]
    }
  }

  @js.native
  trait StartContinuousExportRequest extends js.Object {}

  object StartContinuousExportRequest {
    @inline
    def apply(
    ): StartContinuousExportRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartContinuousExportRequest]
    }
  }

  @js.native
  trait StartContinuousExportResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
    var exportId: js.UndefOr[ConfigurationsExportId]
    var s3Bucket: js.UndefOr[S3Bucket]
    var schemaStorageConfig: js.UndefOr[SchemaStorageConfig]
    var startTime: js.UndefOr[TimeStamp]
  }

  object StartContinuousExportResponse {
    @inline
    def apply(
        dataSource: js.UndefOr[DataSource] = js.undefined,
        exportId: js.UndefOr[ConfigurationsExportId] = js.undefined,
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined
    ): StartContinuousExportResponse = {
      val __obj = js.Dynamic.literal()
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      exportId.foreach(__v => __obj.updateDynamic("exportId")(__v.asInstanceOf[js.Any]))
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      schemaStorageConfig.foreach(__v => __obj.updateDynamic("schemaStorageConfig")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartContinuousExportResponse]
    }
  }

  @js.native
  trait StartDataCollectionByAgentIdsRequest extends js.Object {
    var agentIds: AgentIds
  }

  object StartDataCollectionByAgentIdsRequest {
    @inline
    def apply(
        agentIds: AgentIds
    ): StartDataCollectionByAgentIdsRequest = {
      val __obj = js.Dynamic.literal(
        "agentIds" -> agentIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartDataCollectionByAgentIdsRequest]
    }
  }

  @js.native
  trait StartDataCollectionByAgentIdsResponse extends js.Object {
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList]
  }

  object StartDataCollectionByAgentIdsResponse {
    @inline
    def apply(
        agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined
    ): StartDataCollectionByAgentIdsResponse = {
      val __obj = js.Dynamic.literal()
      agentsConfigurationStatus.foreach(__v => __obj.updateDynamic("agentsConfigurationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDataCollectionByAgentIdsResponse]
    }
  }

  @js.native
  trait StartExportTaskRequest extends js.Object {
    var endTime: js.UndefOr[TimeStamp]
    var exportDataFormat: js.UndefOr[ExportDataFormats]
    var filters: js.UndefOr[ExportFilters]
    var startTime: js.UndefOr[TimeStamp]
  }

  object StartExportTaskRequest {
    @inline
    def apply(
        endTime: js.UndefOr[TimeStamp] = js.undefined,
        exportDataFormat: js.UndefOr[ExportDataFormats] = js.undefined,
        filters: js.UndefOr[ExportFilters] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined
    ): StartExportTaskRequest = {
      val __obj = js.Dynamic.literal()
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      exportDataFormat.foreach(__v => __obj.updateDynamic("exportDataFormat")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartExportTaskRequest]
    }
  }

  @js.native
  trait StartExportTaskResponse extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
  }

  object StartExportTaskResponse {
    @inline
    def apply(
        exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
    ): StartExportTaskResponse = {
      val __obj = js.Dynamic.literal()
      exportId.foreach(__v => __obj.updateDynamic("exportId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartExportTaskResponse]
    }
  }

  @js.native
  trait StartImportTaskRequest extends js.Object {
    var importUrl: ImportURL
    var name: ImportTaskName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object StartImportTaskRequest {
    @inline
    def apply(
        importUrl: ImportURL,
        name: ImportTaskName,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): StartImportTaskRequest = {
      val __obj = js.Dynamic.literal(
        "importUrl" -> importUrl.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImportTaskRequest]
    }
  }

  @js.native
  trait StartImportTaskResponse extends js.Object {
    var task: js.UndefOr[ImportTask]
  }

  object StartImportTaskResponse {
    @inline
    def apply(
        task: js.UndefOr[ImportTask] = js.undefined
    ): StartImportTaskResponse = {
      val __obj = js.Dynamic.literal()
      task.foreach(__v => __obj.updateDynamic("task")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImportTaskResponse]
    }
  }

  @js.native
  trait StopContinuousExportRequest extends js.Object {
    var exportId: ConfigurationsExportId
  }

  object StopContinuousExportRequest {
    @inline
    def apply(
        exportId: ConfigurationsExportId
    ): StopContinuousExportRequest = {
      val __obj = js.Dynamic.literal(
        "exportId" -> exportId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopContinuousExportRequest]
    }
  }

  @js.native
  trait StopContinuousExportResponse extends js.Object {
    var startTime: js.UndefOr[TimeStamp]
    var stopTime: js.UndefOr[TimeStamp]
  }

  object StopContinuousExportResponse {
    @inline
    def apply(
        startTime: js.UndefOr[TimeStamp] = js.undefined,
        stopTime: js.UndefOr[TimeStamp] = js.undefined
    ): StopContinuousExportResponse = {
      val __obj = js.Dynamic.literal()
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      stopTime.foreach(__v => __obj.updateDynamic("stopTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopContinuousExportResponse]
    }
  }

  @js.native
  trait StopDataCollectionByAgentIdsRequest extends js.Object {
    var agentIds: AgentIds
  }

  object StopDataCollectionByAgentIdsRequest {
    @inline
    def apply(
        agentIds: AgentIds
    ): StopDataCollectionByAgentIdsRequest = {
      val __obj = js.Dynamic.literal(
        "agentIds" -> agentIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopDataCollectionByAgentIdsRequest]
    }
  }

  @js.native
  trait StopDataCollectionByAgentIdsResponse extends js.Object {
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList]
  }

  object StopDataCollectionByAgentIdsResponse {
    @inline
    def apply(
        agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined
    ): StopDataCollectionByAgentIdsResponse = {
      val __obj = js.Dynamic.literal()
      agentsConfigurationStatus.foreach(__v => __obj.updateDynamic("agentsConfigurationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDataCollectionByAgentIdsResponse]
    }
  }

  /**
    * Metadata that help you categorize IT assets.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * The tag filter. Valid names are: <code>tagKey</code>, <code>tagValue</code>, <code>configurationId</code>.
    */
  @js.native
  trait TagFilter extends js.Object {
    var name: FilterName
    var values: FilterValues
  }

  object TagFilter {
    @inline
    def apply(
        name: FilterName,
        values: FilterValues
    ): TagFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var configurationId: ApplicationId
    var description: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        configurationId: ApplicationId,
        description: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "configurationId" -> configurationId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {}

  object UpdateApplicationResponse {
    @inline
    def apply(
    ): UpdateApplicationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateApplicationResponse]
    }
  }

  @js.native
  sealed trait orderString extends js.Any
  object orderString {
    val ASC = "ASC".asInstanceOf[orderString]
    val DESC = "DESC".asInstanceOf[orderString]

    @inline def values = js.Object.freeze(js.Array(ASC, DESC))
  }
}
