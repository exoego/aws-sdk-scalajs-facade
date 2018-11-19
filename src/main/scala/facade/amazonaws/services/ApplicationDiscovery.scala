package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object applicationdiscovery {
  type AgentConfigurationStatusList = js.Array[AgentConfigurationStatus]
  type AgentId = String
  type AgentIds = js.Array[AgentId]
  type AgentNetworkInfoList = js.Array[AgentNetworkInfo]
  type AgentStatus = String
  type AgentsInfo = js.Array[AgentInfo]
  type ApplicationId = String
  type ApplicationIdsList = js.Array[ApplicationId]
  type BoxedInteger = Int
  type Condition = String
  type Configuration = js.Dictionary[String]
  type ConfigurationId = String
  type ConfigurationIdList = js.Array[ConfigurationId]
  type ConfigurationItemType = String
  type ConfigurationTagSet = js.Array[ConfigurationTag]
  type Configurations = js.Array[Configuration]
  type ConfigurationsDownloadUrl = String
  type ConfigurationsExportId = String
  type ContinuousExportDescriptions = js.Array[ContinuousExportDescription]
  type ContinuousExportIds = js.Array[ConfigurationsExportId]
  type ContinuousExportStatus = String
  type DataSource = String
  type DatabaseName = String
  type DescribeConfigurationsAttribute = js.Dictionary[String]
  type DescribeConfigurationsAttributes = js.Array[DescribeConfigurationsAttribute]
  type DescribeContinuousExportsMaxResults = Int
  type ExportDataFormat = String
  type ExportDataFormats = js.Array[ExportDataFormat]
  type ExportFilters = js.Array[ExportFilter]
  type ExportIds = js.Array[ConfigurationsExportId]
  type ExportRequestTime = js.Date
  type ExportStatus = String
  type ExportStatusMessage = String
  type ExportsInfo = js.Array[ExportInfo]
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type NeighborDetailsList = js.Array[NeighborConnectionDetail]
  type NextToken = String
  type OrderByList = js.Array[OrderByElement]
  type S3Bucket = String
  type SchemaStorageConfig = js.Dictionary[String]
  type StringMax255 = String
  type TagFilters = js.Array[TagFilter]
  type TagKey = String
  type TagSet = js.Array[Tag]
  type TagValue = String
  type TimeStamp = js.Date
  type orderString = String
}

package applicationdiscovery {
  @js.native
  @JSImport("aws-sdk", "Discovery")
  class ApplicationDiscovery(config: AWSConfig) extends js.Object {
    def associateConfigurationItemsToApplication(params: AssociateConfigurationItemsToApplicationRequest): Request[AssociateConfigurationItemsToApplicationResponse] = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def createTags(params: CreateTagsRequest): Request[CreateTagsResponse] = js.native
    def deleteApplications(params: DeleteApplicationsRequest): Request[DeleteApplicationsResponse] = js.native
    def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResponse] = js.native
    def describeAgents(params: DescribeAgentsRequest): Request[DescribeAgentsResponse] = js.native
    def describeConfigurations(params: DescribeConfigurationsRequest): Request[DescribeConfigurationsResponse] = js.native
    def describeContinuousExports(params: DescribeContinuousExportsRequest): Request[DescribeContinuousExportsResponse] = js.native
    def describeExportConfigurations(params: DescribeExportConfigurationsRequest): Request[DescribeExportConfigurationsResponse] = js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResponse] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse] = js.native
    def disassociateConfigurationItemsFromApplication(params: DisassociateConfigurationItemsFromApplicationRequest): Request[DisassociateConfigurationItemsFromApplicationResponse] = js.native
    def exportConfigurations(): Request[ExportConfigurationsResponse] = js.native
    def getDiscoverySummary(params: GetDiscoverySummaryRequest): Request[GetDiscoverySummaryResponse] = js.native
    def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse] = js.native
    def listServerNeighbors(params: ListServerNeighborsRequest): Request[ListServerNeighborsResponse] = js.native
    def startContinuousExport(params: StartContinuousExportRequest): Request[StartContinuousExportResponse] = js.native
    def startDataCollectionByAgentIds(params: StartDataCollectionByAgentIdsRequest): Request[StartDataCollectionByAgentIdsResponse] = js.native
    def startExportTask(params: StartExportTaskRequest): Request[StartExportTaskResponse] = js.native
    def stopContinuousExport(params: StopContinuousExportRequest): Request[StopContinuousExportResponse] = js.native
    def stopDataCollectionByAgentIds(params: StopDataCollectionByAgentIdsRequest): Request[StopDataCollectionByAgentIdsResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
  }

  /**
   * <p>Information about agents or connectors that were instructed to start collecting data. Information includes the agent/connector ID, a description of the operation, and whether the agent/connector configuration was updated.</p>
   */
  @js.native
  trait AgentConfigurationStatus extends js.Object {
    var agentId: js.UndefOr[String]
    var operationSucceeded: js.UndefOr[Boolean]
    var description: js.UndefOr[String]
  }

  object AgentConfigurationStatus {
    def apply(
      agentId: js.UndefOr[String] = js.undefined,
      operationSucceeded: js.UndefOr[Boolean] = js.undefined,
      description: js.UndefOr[String] = js.undefined): AgentConfigurationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentId" -> agentId.map { x => x.asInstanceOf[js.Any] },
        "operationSucceeded" -> operationSucceeded.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentConfigurationStatus]
    }
  }

  /**
   * <p>Information about agents or connectors associated with the user’s AWS account. Information includes agent or connector IDs, IP addresses, media access control (MAC) addresses, agent or connector health, hostname where the agent or connector resides, and agent version for each agent.</p>
   */
  @js.native
  trait AgentInfo extends js.Object {
    var health: js.UndefOr[AgentStatus]
    var lastHealthPingTime: js.UndefOr[String]
    var agentId: js.UndefOr[AgentId]
    var agentNetworkInfoList: js.UndefOr[AgentNetworkInfoList]
    var connectorId: js.UndefOr[String]
    var hostName: js.UndefOr[String]
    var agentType: js.UndefOr[String]
    var version: js.UndefOr[String]
    var registeredTime: js.UndefOr[String]
    var collectionStatus: js.UndefOr[String]
  }

  object AgentInfo {
    def apply(
      health: js.UndefOr[AgentStatus] = js.undefined,
      lastHealthPingTime: js.UndefOr[String] = js.undefined,
      agentId: js.UndefOr[AgentId] = js.undefined,
      agentNetworkInfoList: js.UndefOr[AgentNetworkInfoList] = js.undefined,
      connectorId: js.UndefOr[String] = js.undefined,
      hostName: js.UndefOr[String] = js.undefined,
      agentType: js.UndefOr[String] = js.undefined,
      version: js.UndefOr[String] = js.undefined,
      registeredTime: js.UndefOr[String] = js.undefined,
      collectionStatus: js.UndefOr[String] = js.undefined): AgentInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "health" -> health.map { x => x.asInstanceOf[js.Any] },
        "lastHealthPingTime" -> lastHealthPingTime.map { x => x.asInstanceOf[js.Any] },
        "agentId" -> agentId.map { x => x.asInstanceOf[js.Any] },
        "agentNetworkInfoList" -> agentNetworkInfoList.map { x => x.asInstanceOf[js.Any] },
        "connectorId" -> connectorId.map { x => x.asInstanceOf[js.Any] },
        "hostName" -> hostName.map { x => x.asInstanceOf[js.Any] },
        "agentType" -> agentType.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "registeredTime" -> registeredTime.map { x => x.asInstanceOf[js.Any] },
        "collectionStatus" -> collectionStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentInfo]
    }
  }

  /**
   * <p>Network details about the host where the agent/connector resides.</p>
   */
  @js.native
  trait AgentNetworkInfo extends js.Object {
    var ipAddress: js.UndefOr[String]
    var macAddress: js.UndefOr[String]
  }

  object AgentNetworkInfo {
    def apply(
      ipAddress: js.UndefOr[String] = js.undefined,
      macAddress: js.UndefOr[String] = js.undefined): AgentNetworkInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ipAddress" -> ipAddress.map { x => x.asInstanceOf[js.Any] },
        "macAddress" -> macAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentNetworkInfo]
    }
  }

  object AgentStatusEnum {
    val HEALTHY = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"
    val RUNNING = "RUNNING"
    val UNKNOWN = "UNKNOWN"
    val BLACKLISTED = "BLACKLISTED"
    val SHUTDOWN = "SHUTDOWN"

    val values = IndexedSeq(HEALTHY, UNHEALTHY, RUNNING, UNKNOWN, BLACKLISTED, SHUTDOWN)
  }

  @js.native
  trait AssociateConfigurationItemsToApplicationRequest extends js.Object {
    var applicationConfigurationId: js.UndefOr[ApplicationId]
    var configurationIds: js.UndefOr[ConfigurationIdList]
  }

  object AssociateConfigurationItemsToApplicationRequest {
    def apply(
      applicationConfigurationId: js.UndefOr[ApplicationId] = js.undefined,
      configurationIds: js.UndefOr[ConfigurationIdList] = js.undefined): AssociateConfigurationItemsToApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationConfigurationId" -> applicationConfigurationId.map { x => x.asInstanceOf[js.Any] },
        "configurationIds" -> configurationIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateConfigurationItemsToApplicationRequest]
    }
  }

  @js.native
  trait AssociateConfigurationItemsToApplicationResponse extends js.Object {

  }

  object AssociateConfigurationItemsToApplicationResponse {
    def apply(): AssociateConfigurationItemsToApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateConfigurationItemsToApplicationResponse]
    }
  }

  object ConfigurationItemTypeEnum {
    val SERVER = "SERVER"
    val PROCESS = "PROCESS"
    val CONNECTION = "CONNECTION"
    val APPLICATION = "APPLICATION"

    val values = IndexedSeq(SERVER, PROCESS, CONNECTION, APPLICATION)
  }

  /**
   * <p>Tags for a configuration item. Tags are metadata that help you categorize IT assets.</p>
   */
  @js.native
  trait ConfigurationTag extends js.Object {
    var configurationId: js.UndefOr[ConfigurationId]
    var configurationType: js.UndefOr[ConfigurationItemType]
    var timeOfCreation: js.UndefOr[TimeStamp]
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object ConfigurationTag {
    def apply(
      configurationId: js.UndefOr[ConfigurationId] = js.undefined,
      configurationType: js.UndefOr[ConfigurationItemType] = js.undefined,
      timeOfCreation: js.UndefOr[TimeStamp] = js.undefined,
      key: js.UndefOr[TagKey] = js.undefined,
      value: js.UndefOr[TagValue] = js.undefined): ConfigurationTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.map { x => x.asInstanceOf[js.Any] },
        "configurationType" -> configurationType.map { x => x.asInstanceOf[js.Any] },
        "timeOfCreation" -> timeOfCreation.map { x => x.asInstanceOf[js.Any] },
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationTag]
    }
  }

  /**
   * <p>A list of continuous export descriptions.</p>
   */
  @js.native
  trait ContinuousExportDescription extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
    var startTime: js.UndefOr[TimeStamp]
    var s3Bucket: js.UndefOr[S3Bucket]
    var dataSource: js.UndefOr[DataSource]
    var schemaStorageConfig: js.UndefOr[SchemaStorageConfig]
    var status: js.UndefOr[ContinuousExportStatus]
    var statusDetail: js.UndefOr[StringMax255]
    var stopTime: js.UndefOr[TimeStamp]
  }

  object ContinuousExportDescription {
    def apply(
      exportId: js.UndefOr[ConfigurationsExportId] = js.undefined,
      startTime: js.UndefOr[TimeStamp] = js.undefined,
      s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      dataSource: js.UndefOr[DataSource] = js.undefined,
      schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined,
      status: js.UndefOr[ContinuousExportStatus] = js.undefined,
      statusDetail: js.UndefOr[StringMax255] = js.undefined,
      stopTime: js.UndefOr[TimeStamp] = js.undefined): ContinuousExportDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId" -> exportId.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "s3Bucket" -> s3Bucket.map { x => x.asInstanceOf[js.Any] },
        "dataSource" -> dataSource.map { x => x.asInstanceOf[js.Any] },
        "schemaStorageConfig" -> schemaStorageConfig.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "statusDetail" -> statusDetail.map { x => x.asInstanceOf[js.Any] },
        "stopTime" -> stopTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinuousExportDescription]
    }
  }

  object ContinuousExportStatusEnum {
    val START_IN_PROGRESS = "START_IN_PROGRESS"
    val START_FAILED = "START_FAILED"
    val ACTIVE = "ACTIVE"
    val ERROR = "ERROR"
    val STOP_IN_PROGRESS = "STOP_IN_PROGRESS"
    val STOP_FAILED = "STOP_FAILED"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(START_IN_PROGRESS, START_FAILED, ACTIVE, ERROR, STOP_IN_PROGRESS, STOP_FAILED, INACTIVE)
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var name: js.UndefOr[String]
    var description: js.UndefOr[String]
  }

  object CreateApplicationRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined): CreateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var configurationId: js.UndefOr[String]
  }

  object CreateApplicationResponse {
    def apply(
      configurationId: js.UndefOr[String] = js.undefined): CreateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateTagsRequest extends js.Object {
    var configurationIds: js.UndefOr[ConfigurationIdList]
    var tags: js.UndefOr[TagSet]
  }

  object CreateTagsRequest {
    def apply(
      configurationIds: js.UndefOr[ConfigurationIdList] = js.undefined,
      tags: js.UndefOr[TagSet] = js.undefined): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationIds" -> configurationIds.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
    }
  }

  @js.native
  trait CreateTagsResponse extends js.Object {

  }

  object CreateTagsResponse {
    def apply(): CreateTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsResponse]
    }
  }

  /**
   * <p>Inventory data for installed discovery agents.</p>
   */
  @js.native
  trait CustomerAgentInfo extends js.Object {
    var unhealthyAgents: js.UndefOr[Int]
    var healthyAgents: js.UndefOr[Int]
    var unknownAgents: js.UndefOr[Int]
    var blackListedAgents: js.UndefOr[Int]
    var shutdownAgents: js.UndefOr[Int]
    var totalAgents: js.UndefOr[Int]
    var activeAgents: js.UndefOr[Int]
  }

  object CustomerAgentInfo {
    def apply(
      unhealthyAgents: js.UndefOr[Int] = js.undefined,
      healthyAgents: js.UndefOr[Int] = js.undefined,
      unknownAgents: js.UndefOr[Int] = js.undefined,
      blackListedAgents: js.UndefOr[Int] = js.undefined,
      shutdownAgents: js.UndefOr[Int] = js.undefined,
      totalAgents: js.UndefOr[Int] = js.undefined,
      activeAgents: js.UndefOr[Int] = js.undefined): CustomerAgentInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "unhealthyAgents" -> unhealthyAgents.map { x => x.asInstanceOf[js.Any] },
        "healthyAgents" -> healthyAgents.map { x => x.asInstanceOf[js.Any] },
        "unknownAgents" -> unknownAgents.map { x => x.asInstanceOf[js.Any] },
        "blackListedAgents" -> blackListedAgents.map { x => x.asInstanceOf[js.Any] },
        "shutdownAgents" -> shutdownAgents.map { x => x.asInstanceOf[js.Any] },
        "totalAgents" -> totalAgents.map { x => x.asInstanceOf[js.Any] },
        "activeAgents" -> activeAgents.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomerAgentInfo]
    }
  }

  /**
   * <p>Inventory data for installed discovery connectors.</p>
   */
  @js.native
  trait CustomerConnectorInfo extends js.Object {
    var unknownConnectors: js.UndefOr[Int]
    var totalConnectors: js.UndefOr[Int]
    var healthyConnectors: js.UndefOr[Int]
    var activeConnectors: js.UndefOr[Int]
    var shutdownConnectors: js.UndefOr[Int]
    var unhealthyConnectors: js.UndefOr[Int]
    var blackListedConnectors: js.UndefOr[Int]
  }

  object CustomerConnectorInfo {
    def apply(
      unknownConnectors: js.UndefOr[Int] = js.undefined,
      totalConnectors: js.UndefOr[Int] = js.undefined,
      healthyConnectors: js.UndefOr[Int] = js.undefined,
      activeConnectors: js.UndefOr[Int] = js.undefined,
      shutdownConnectors: js.UndefOr[Int] = js.undefined,
      unhealthyConnectors: js.UndefOr[Int] = js.undefined,
      blackListedConnectors: js.UndefOr[Int] = js.undefined): CustomerConnectorInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "unknownConnectors" -> unknownConnectors.map { x => x.asInstanceOf[js.Any] },
        "totalConnectors" -> totalConnectors.map { x => x.asInstanceOf[js.Any] },
        "healthyConnectors" -> healthyConnectors.map { x => x.asInstanceOf[js.Any] },
        "activeConnectors" -> activeConnectors.map { x => x.asInstanceOf[js.Any] },
        "shutdownConnectors" -> shutdownConnectors.map { x => x.asInstanceOf[js.Any] },
        "unhealthyConnectors" -> unhealthyConnectors.map { x => x.asInstanceOf[js.Any] },
        "blackListedConnectors" -> blackListedConnectors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomerConnectorInfo]
    }
  }

  object DataSourceEnum {
    val AGENT = "AGENT"

    val values = IndexedSeq(AGENT)
  }

  @js.native
  trait DeleteApplicationsRequest extends js.Object {
    var configurationIds: js.UndefOr[ApplicationIdsList]
  }

  object DeleteApplicationsRequest {
    def apply(
      configurationIds: js.UndefOr[ApplicationIdsList] = js.undefined): DeleteApplicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationIds" -> configurationIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationsRequest]
    }
  }

  @js.native
  trait DeleteApplicationsResponse extends js.Object {

  }

  object DeleteApplicationsResponse {
    def apply(): DeleteApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationsResponse]
    }
  }

  @js.native
  trait DeleteTagsRequest extends js.Object {
    var configurationIds: js.UndefOr[ConfigurationIdList]
    var tags: js.UndefOr[TagSet]
  }

  object DeleteTagsRequest {
    def apply(
      configurationIds: js.UndefOr[ConfigurationIdList] = js.undefined,
      tags: js.UndefOr[TagSet] = js.undefined): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationIds" -> configurationIds.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  @js.native
  trait DeleteTagsResponse extends js.Object {

  }

  object DeleteTagsResponse {
    def apply(): DeleteTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsResponse]
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
    def apply(
      agentIds: js.UndefOr[AgentIds] = js.undefined,
      filters: js.UndefOr[Filters] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeAgentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentIds" -> agentIds.map { x => x.asInstanceOf[js.Any] },
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentsRequest]
    }
  }

  @js.native
  trait DescribeAgentsResponse extends js.Object {
    var agentsInfo: js.UndefOr[AgentsInfo]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeAgentsResponse {
    def apply(
      agentsInfo: js.UndefOr[AgentsInfo] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeAgentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentsInfo" -> agentsInfo.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentsResponse]
    }
  }

  @js.native
  trait DescribeConfigurationsRequest extends js.Object {
    var configurationIds: js.UndefOr[ConfigurationIdList]
  }

  object DescribeConfigurationsRequest {
    def apply(
      configurationIds: js.UndefOr[ConfigurationIdList] = js.undefined): DescribeConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationIds" -> configurationIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeConfigurationsResponse extends js.Object {
    var configurations: js.UndefOr[DescribeConfigurationsAttributes]
  }

  object DescribeConfigurationsResponse {
    def apply(
      configurations: js.UndefOr[DescribeConfigurationsAttributes] = js.undefined): DescribeConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurations" -> configurations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationsResponse]
    }
  }

  @js.native
  trait DescribeContinuousExportsRequest extends js.Object {
    var exportIds: js.UndefOr[ContinuousExportIds]
    var maxResults: js.UndefOr[DescribeContinuousExportsMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeContinuousExportsRequest {
    def apply(
      exportIds: js.UndefOr[ContinuousExportIds] = js.undefined,
      maxResults: js.UndefOr[DescribeContinuousExportsMaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeContinuousExportsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportIds" -> exportIds.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContinuousExportsRequest]
    }
  }

  @js.native
  trait DescribeContinuousExportsResponse extends js.Object {
    var descriptions: js.UndefOr[ContinuousExportDescriptions]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeContinuousExportsResponse {
    def apply(
      descriptions: js.UndefOr[ContinuousExportDescriptions] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeContinuousExportsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "descriptions" -> descriptions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContinuousExportsResponse]
    }
  }

  @js.native
  trait DescribeExportConfigurationsRequest extends js.Object {
    var exportIds: js.UndefOr[ExportIds]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeExportConfigurationsRequest {
    def apply(
      exportIds: js.UndefOr[ExportIds] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeExportConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportIds" -> exportIds.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeExportConfigurationsResponse extends js.Object {
    var exportsInfo: js.UndefOr[ExportsInfo]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeExportConfigurationsResponse {
    def apply(
      exportsInfo: js.UndefOr[ExportsInfo] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeExportConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportsInfo" -> exportsInfo.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportConfigurationsResponse]
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
    def apply(
      exportIds: js.UndefOr[ExportIds] = js.undefined,
      filters: js.UndefOr[ExportFilters] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeExportTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportIds" -> exportIds.map { x => x.asInstanceOf[js.Any] },
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksRequest]
    }
  }

  @js.native
  trait DescribeExportTasksResponse extends js.Object {
    var exportsInfo: js.UndefOr[ExportsInfo]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeExportTasksResponse {
    def apply(
      exportsInfo: js.UndefOr[ExportsInfo] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeExportTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportsInfo" -> exportsInfo.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksResponse]
    }
  }

  @js.native
  trait DescribeTagsRequest extends js.Object {
    var filters: js.UndefOr[TagFilters]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeTagsRequest {
    def apply(
      filters: js.UndefOr[TagFilters] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
    }
  }

  @js.native
  trait DescribeTagsResponse extends js.Object {
    var tags: js.UndefOr[ConfigurationTagSet]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeTagsResponse {
    def apply(
      tags: js.UndefOr[ConfigurationTagSet] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResponse]
    }
  }

  @js.native
  trait DisassociateConfigurationItemsFromApplicationRequest extends js.Object {
    var applicationConfigurationId: js.UndefOr[ApplicationId]
    var configurationIds: js.UndefOr[ConfigurationIdList]
  }

  object DisassociateConfigurationItemsFromApplicationRequest {
    def apply(
      applicationConfigurationId: js.UndefOr[ApplicationId] = js.undefined,
      configurationIds: js.UndefOr[ConfigurationIdList] = js.undefined): DisassociateConfigurationItemsFromApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationConfigurationId" -> applicationConfigurationId.map { x => x.asInstanceOf[js.Any] },
        "configurationIds" -> configurationIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateConfigurationItemsFromApplicationRequest]
    }
  }

  @js.native
  trait DisassociateConfigurationItemsFromApplicationResponse extends js.Object {

  }

  object DisassociateConfigurationItemsFromApplicationResponse {
    def apply(): DisassociateConfigurationItemsFromApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateConfigurationItemsFromApplicationResponse]
    }
  }

  @js.native
  trait ExportConfigurationsResponse extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
  }

  object ExportConfigurationsResponse {
    def apply(
      exportId: js.UndefOr[ConfigurationsExportId] = js.undefined): ExportConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId" -> exportId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportConfigurationsResponse]
    }
  }

  object ExportDataFormatEnum {
    val CSV = "CSV"
    val GRAPHML = "GRAPHML"

    val values = IndexedSeq(CSV, GRAPHML)
  }

  /**
   * <p>Used to select which agent's data is to be exported. A single agent ID may be selected for export using the <a href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html">StartExportTask</a> action.</p>
   */
  @js.native
  trait ExportFilter extends js.Object {
    var name: js.UndefOr[FilterName]
    var values: js.UndefOr[FilterValues]
    var condition: js.UndefOr[Condition]
  }

  object ExportFilter {
    def apply(
      name: js.UndefOr[FilterName] = js.undefined,
      values: js.UndefOr[FilterValues] = js.undefined,
      condition: js.UndefOr[Condition] = js.undefined): ExportFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "values" -> values.map { x => x.asInstanceOf[js.Any] },
        "condition" -> condition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportFilter]
    }
  }

  /**
   * <p>Information regarding the export status of discovered data. The value is an array of objects.</p>
   */
  @js.native
  trait ExportInfo extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
    var requestedStartTime: js.UndefOr[TimeStamp]
    var configurationsDownloadUrl: js.UndefOr[ConfigurationsDownloadUrl]
    var requestedEndTime: js.UndefOr[TimeStamp]
    var exportRequestTime: js.UndefOr[ExportRequestTime]
    var exportStatus: js.UndefOr[ExportStatus]
    var isTruncated: js.UndefOr[Boolean]
    var statusMessage: js.UndefOr[ExportStatusMessage]
  }

  object ExportInfo {
    def apply(
      exportId: js.UndefOr[ConfigurationsExportId] = js.undefined,
      requestedStartTime: js.UndefOr[TimeStamp] = js.undefined,
      configurationsDownloadUrl: js.UndefOr[ConfigurationsDownloadUrl] = js.undefined,
      requestedEndTime: js.UndefOr[TimeStamp] = js.undefined,
      exportRequestTime: js.UndefOr[ExportRequestTime] = js.undefined,
      exportStatus: js.UndefOr[ExportStatus] = js.undefined,
      isTruncated: js.UndefOr[Boolean] = js.undefined,
      statusMessage: js.UndefOr[ExportStatusMessage] = js.undefined): ExportInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId" -> exportId.map { x => x.asInstanceOf[js.Any] },
        "requestedStartTime" -> requestedStartTime.map { x => x.asInstanceOf[js.Any] },
        "configurationsDownloadUrl" -> configurationsDownloadUrl.map { x => x.asInstanceOf[js.Any] },
        "requestedEndTime" -> requestedEndTime.map { x => x.asInstanceOf[js.Any] },
        "exportRequestTime" -> exportRequestTime.map { x => x.asInstanceOf[js.Any] },
        "exportStatus" -> exportStatus.map { x => x.asInstanceOf[js.Any] },
        "isTruncated" -> isTruncated.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportInfo]
    }
  }

  object ExportStatusEnum {
    val FAILED = "FAILED"
    val SUCCEEDED = "SUCCEEDED"
    val IN_PROGRESS = "IN_PROGRESS"

    val values = IndexedSeq(FAILED, SUCCEEDED, IN_PROGRESS)
  }

  /**
   * <p>A filter that can use conditional operators.</p> <p>For more information about filters, see <a href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html">Querying Discovered Configuration Items</a>. </p>
   */
  @js.native
  trait Filter extends js.Object {
    var name: js.UndefOr[String]
    var values: js.UndefOr[FilterValues]
    var condition: js.UndefOr[Condition]
  }

  object Filter {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      values: js.UndefOr[FilterValues] = js.undefined,
      condition: js.UndefOr[Condition] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "values" -> values.map { x => x.asInstanceOf[js.Any] },
        "condition" -> condition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetDiscoverySummaryRequest extends js.Object {

  }

  object GetDiscoverySummaryRequest {
    def apply(): GetDiscoverySummaryRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiscoverySummaryRequest]
    }
  }

  @js.native
  trait GetDiscoverySummaryResponse extends js.Object {
    var connectorSummary: js.UndefOr[CustomerConnectorInfo]
    var agentSummary: js.UndefOr[CustomerAgentInfo]
    var applications: js.UndefOr[Double]
    var servers: js.UndefOr[Double]
    var serversMappedtoTags: js.UndefOr[Double]
    var serversMappedToApplications: js.UndefOr[Double]
  }

  object GetDiscoverySummaryResponse {
    def apply(
      connectorSummary: js.UndefOr[CustomerConnectorInfo] = js.undefined,
      agentSummary: js.UndefOr[CustomerAgentInfo] = js.undefined,
      applications: js.UndefOr[Double] = js.undefined,
      servers: js.UndefOr[Double] = js.undefined,
      serversMappedtoTags: js.UndefOr[Double] = js.undefined,
      serversMappedToApplications: js.UndefOr[Double] = js.undefined): GetDiscoverySummaryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectorSummary" -> connectorSummary.map { x => x.asInstanceOf[js.Any] },
        "agentSummary" -> agentSummary.map { x => x.asInstanceOf[js.Any] },
        "applications" -> applications.map { x => x.asInstanceOf[js.Any] },
        "servers" -> servers.map { x => x.asInstanceOf[js.Any] },
        "serversMappedtoTags" -> serversMappedtoTags.map { x => x.asInstanceOf[js.Any] },
        "serversMappedToApplications" -> serversMappedToApplications.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiscoverySummaryResponse]
    }
  }

  @js.native
  trait ListConfigurationsRequest extends js.Object {
    var configurationType: js.UndefOr[ConfigurationItemType]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
    var filters: js.UndefOr[Filters]
    var orderBy: js.UndefOr[OrderByList]
  }

  object ListConfigurationsRequest {
    def apply(
      configurationType: js.UndefOr[ConfigurationItemType] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      filters: js.UndefOr[Filters] = js.undefined,
      orderBy: js.UndefOr[OrderByList] = js.undefined): ListConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationType" -> configurationType.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "orderBy" -> orderBy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationsRequest]
    }
  }

  @js.native
  trait ListConfigurationsResponse extends js.Object {
    var configurations: js.UndefOr[Configurations]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListConfigurationsResponse {
    def apply(
      configurations: js.UndefOr[Configurations] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurations" -> configurations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationsResponse]
    }
  }

  @js.native
  trait ListServerNeighborsRequest extends js.Object {
    var configurationId: js.UndefOr[ConfigurationId]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
    var neighborConfigurationIds: js.UndefOr[ConfigurationIdList]
    var portInformationNeeded: js.UndefOr[Boolean]
  }

  object ListServerNeighborsRequest {
    def apply(
      configurationId: js.UndefOr[ConfigurationId] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      neighborConfigurationIds: js.UndefOr[ConfigurationIdList] = js.undefined,
      portInformationNeeded: js.UndefOr[Boolean] = js.undefined): ListServerNeighborsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "neighborConfigurationIds" -> neighborConfigurationIds.map { x => x.asInstanceOf[js.Any] },
        "portInformationNeeded" -> portInformationNeeded.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServerNeighborsRequest]
    }
  }

  @js.native
  trait ListServerNeighborsResponse extends js.Object {
    var neighbors: js.UndefOr[NeighborDetailsList]
    var nextToken: js.UndefOr[String]
    var knownDependencyCount: js.UndefOr[Double]
  }

  object ListServerNeighborsResponse {
    def apply(
      neighbors: js.UndefOr[NeighborDetailsList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      knownDependencyCount: js.UndefOr[Double] = js.undefined): ListServerNeighborsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "neighbors" -> neighbors.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "knownDependencyCount" -> knownDependencyCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServerNeighborsResponse]
    }
  }

  /**
   * <p>Details about neighboring servers.</p>
   */
  @js.native
  trait NeighborConnectionDetail extends js.Object {
    var transportProtocol: js.UndefOr[String]
    var sourceServerId: js.UndefOr[ConfigurationId]
    var destinationPort: js.UndefOr[BoxedInteger]
    var connectionsCount: js.UndefOr[Double]
    var destinationServerId: js.UndefOr[ConfigurationId]
  }

  object NeighborConnectionDetail {
    def apply(
      transportProtocol: js.UndefOr[String] = js.undefined,
      sourceServerId: js.UndefOr[ConfigurationId] = js.undefined,
      destinationPort: js.UndefOr[BoxedInteger] = js.undefined,
      connectionsCount: js.UndefOr[Double] = js.undefined,
      destinationServerId: js.UndefOr[ConfigurationId] = js.undefined): NeighborConnectionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "transportProtocol" -> transportProtocol.map { x => x.asInstanceOf[js.Any] },
        "sourceServerId" -> sourceServerId.map { x => x.asInstanceOf[js.Any] },
        "destinationPort" -> destinationPort.map { x => x.asInstanceOf[js.Any] },
        "connectionsCount" -> connectionsCount.map { x => x.asInstanceOf[js.Any] },
        "destinationServerId" -> destinationServerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NeighborConnectionDetail]
    }
  }

  /**
   * <p>A field and direction for ordered output.</p>
   */
  @js.native
  trait OrderByElement extends js.Object {
    var fieldName: js.UndefOr[String]
    var sortOrder: js.UndefOr[orderString]
  }

  object OrderByElement {
    def apply(
      fieldName: js.UndefOr[String] = js.undefined,
      sortOrder: js.UndefOr[orderString] = js.undefined): OrderByElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fieldName" -> fieldName.map { x => x.asInstanceOf[js.Any] },
        "sortOrder" -> sortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderByElement]
    }
  }

  @js.native
  trait StartContinuousExportRequest extends js.Object {

  }

  object StartContinuousExportRequest {
    def apply(): StartContinuousExportRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartContinuousExportRequest]
    }
  }

  @js.native
  trait StartContinuousExportResponse extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
    var startTime: js.UndefOr[TimeStamp]
    var s3Bucket: js.UndefOr[S3Bucket]
    var dataSource: js.UndefOr[DataSource]
    var schemaStorageConfig: js.UndefOr[SchemaStorageConfig]
  }

  object StartContinuousExportResponse {
    def apply(
      exportId: js.UndefOr[ConfigurationsExportId] = js.undefined,
      startTime: js.UndefOr[TimeStamp] = js.undefined,
      s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      dataSource: js.UndefOr[DataSource] = js.undefined,
      schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined): StartContinuousExportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId" -> exportId.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "s3Bucket" -> s3Bucket.map { x => x.asInstanceOf[js.Any] },
        "dataSource" -> dataSource.map { x => x.asInstanceOf[js.Any] },
        "schemaStorageConfig" -> schemaStorageConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartContinuousExportResponse]
    }
  }

  @js.native
  trait StartDataCollectionByAgentIdsRequest extends js.Object {
    var agentIds: js.UndefOr[AgentIds]
  }

  object StartDataCollectionByAgentIdsRequest {
    def apply(
      agentIds: js.UndefOr[AgentIds] = js.undefined): StartDataCollectionByAgentIdsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentIds" -> agentIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDataCollectionByAgentIdsRequest]
    }
  }

  @js.native
  trait StartDataCollectionByAgentIdsResponse extends js.Object {
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList]
  }

  object StartDataCollectionByAgentIdsResponse {
    def apply(
      agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined): StartDataCollectionByAgentIdsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentsConfigurationStatus" -> agentsConfigurationStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDataCollectionByAgentIdsResponse]
    }
  }

  @js.native
  trait StartExportTaskRequest extends js.Object {
    var exportDataFormat: js.UndefOr[ExportDataFormats]
    var filters: js.UndefOr[ExportFilters]
    var startTime: js.UndefOr[TimeStamp]
    var endTime: js.UndefOr[TimeStamp]
  }

  object StartExportTaskRequest {
    def apply(
      exportDataFormat: js.UndefOr[ExportDataFormats] = js.undefined,
      filters: js.UndefOr[ExportFilters] = js.undefined,
      startTime: js.UndefOr[TimeStamp] = js.undefined,
      endTime: js.UndefOr[TimeStamp] = js.undefined): StartExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportDataFormat" -> exportDataFormat.map { x => x.asInstanceOf[js.Any] },
        "filters" -> filters.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartExportTaskRequest]
    }
  }

  @js.native
  trait StartExportTaskResponse extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
  }

  object StartExportTaskResponse {
    def apply(
      exportId: js.UndefOr[ConfigurationsExportId] = js.undefined): StartExportTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId" -> exportId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartExportTaskResponse]
    }
  }

  @js.native
  trait StopContinuousExportRequest extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
  }

  object StopContinuousExportRequest {
    def apply(
      exportId: js.UndefOr[ConfigurationsExportId] = js.undefined): StopContinuousExportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId" -> exportId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopContinuousExportRequest]
    }
  }

  @js.native
  trait StopContinuousExportResponse extends js.Object {
    var startTime: js.UndefOr[TimeStamp]
    var stopTime: js.UndefOr[TimeStamp]
  }

  object StopContinuousExportResponse {
    def apply(
      startTime: js.UndefOr[TimeStamp] = js.undefined,
      stopTime: js.UndefOr[TimeStamp] = js.undefined): StopContinuousExportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "stopTime" -> stopTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopContinuousExportResponse]
    }
  }

  @js.native
  trait StopDataCollectionByAgentIdsRequest extends js.Object {
    var agentIds: js.UndefOr[AgentIds]
  }

  object StopDataCollectionByAgentIdsRequest {
    def apply(
      agentIds: js.UndefOr[AgentIds] = js.undefined): StopDataCollectionByAgentIdsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentIds" -> agentIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDataCollectionByAgentIdsRequest]
    }
  }

  @js.native
  trait StopDataCollectionByAgentIdsResponse extends js.Object {
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList]
  }

  object StopDataCollectionByAgentIdsResponse {
    def apply(
      agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined): StopDataCollectionByAgentIdsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentsConfigurationStatus" -> agentsConfigurationStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDataCollectionByAgentIdsResponse]
    }
  }

  /**
   * <p>Metadata that help you categorize IT assets.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      key: js.UndefOr[TagKey] = js.undefined,
      value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The tag filter. Valid names are: <code>tagKey</code>, <code>tagValue</code>, <code>configurationId</code>.</p>
   */
  @js.native
  trait TagFilter extends js.Object {
    var name: js.UndefOr[FilterName]
    var values: js.UndefOr[FilterValues]
  }

  object TagFilter {
    def apply(
      name: js.UndefOr[FilterName] = js.undefined,
      values: js.UndefOr[FilterValues] = js.undefined): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "values" -> values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var configurationId: js.UndefOr[ApplicationId]
    var name: js.UndefOr[String]
    var description: js.UndefOr[String]
  }

  object UpdateApplicationRequest {
    def apply(
      configurationId: js.UndefOr[ApplicationId] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined): UpdateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {

  }

  object UpdateApplicationResponse {
    def apply(): UpdateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationResponse]
    }
  }

  object orderStringEnum {
    val ASC = "ASC"
    val DESC = "DESC"

    val values = IndexedSeq(ASC, DESC)
  }
}
