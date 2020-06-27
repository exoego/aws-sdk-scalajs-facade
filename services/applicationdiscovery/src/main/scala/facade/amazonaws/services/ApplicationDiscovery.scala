package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object applicationdiscovery {
  type AgentConfigurationStatusList          = js.Array[AgentConfigurationStatus]
  type AgentId                               = String
  type AgentIds                              = js.Array[AgentId]
  type AgentNetworkInfoList                  = js.Array[AgentNetworkInfo]
  type AgentsInfo                            = js.Array[AgentInfo]
  type ApplicationId                         = String
  type ApplicationIdsList                    = js.Array[ApplicationId]
  type BatchDeleteImportDataErrorDescription = String
  type BatchDeleteImportDataErrorList        = js.Array[BatchDeleteImportDataError]
  type BoxedInteger                          = Int
  type ClientRequestToken                    = String
  type Condition                             = String
  type Configuration                         = js.Dictionary[String]
  type ConfigurationId                       = String
  type ConfigurationIdList                   = js.Array[ConfigurationId]
  type ConfigurationTagSet                   = js.Array[ConfigurationTag]
  type Configurations                        = js.Array[Configuration]
  type ConfigurationsDownloadUrl             = String
  type ConfigurationsExportId                = String
  type ContinuousExportDescriptions          = js.Array[ContinuousExportDescription]
  type ContinuousExportIds                   = js.Array[ConfigurationsExportId]
  type DatabaseName                          = String
  type DescribeConfigurationsAttribute       = js.Dictionary[String]
  type DescribeConfigurationsAttributes      = js.Array[DescribeConfigurationsAttribute]
  type DescribeContinuousExportsMaxResults   = Int
  type DescribeImportTasksFilterList         = js.Array[ImportTaskFilter]
  type DescribeImportTasksMaxResults         = Int
  type ExportDataFormats                     = js.Array[ExportDataFormat]
  type ExportFilters                         = js.Array[ExportFilter]
  type ExportIds                             = js.Array[ConfigurationsExportId]
  type ExportRequestTime                     = js.Date
  type ExportStatusMessage                   = String
  type ExportsInfo                           = js.Array[ExportInfo]
  type FilterName                            = String
  type FilterValue                           = String
  type FilterValues                          = js.Array[FilterValue]
  type Filters                               = js.Array[Filter]
  type ImportTaskFilterValue                 = String
  type ImportTaskFilterValueList             = js.Array[ImportTaskFilterValue]
  type ImportTaskIdentifier                  = String
  type ImportTaskList                        = js.Array[ImportTask]
  type ImportTaskName                        = String
  type ImportURL                             = String
  type NeighborDetailsList                   = js.Array[NeighborConnectionDetail]
  type NextToken                             = String
  type OrderByList                           = js.Array[OrderByElement]
  type S3Bucket                              = String
  type S3PresignedUrl                        = String
  type SchemaStorageConfig                   = js.Dictionary[String]
  type StringMax255                          = String
  type TagFilters                            = js.Array[TagFilter]
  type TagKey                                = String
  type TagSet                                = js.Array[Tag]
  type TagValue                              = String
  type TimeStamp                             = js.Date
  type ToDeleteIdentifierList                = js.Array[ImportTaskIdentifier]

  implicit final class ApplicationDiscoveryOps(private val service: ApplicationDiscovery) extends AnyVal {

    @inline def associateConfigurationItemsToApplicationFuture(
        params: AssociateConfigurationItemsToApplicationRequest
    ): Future[AssociateConfigurationItemsToApplicationResponse] =
      service.associateConfigurationItemsToApplication(params).promise().toFuture
    @inline def batchDeleteImportDataFuture(
        params: BatchDeleteImportDataRequest
    ): Future[BatchDeleteImportDataResponse] = service.batchDeleteImportData(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] =
      service.createApplication(params).promise().toFuture
    @inline def createTagsFuture(params: CreateTagsRequest): Future[CreateTagsResponse] =
      service.createTags(params).promise().toFuture
    @inline def deleteApplicationsFuture(params: DeleteApplicationsRequest): Future[DeleteApplicationsResponse] =
      service.deleteApplications(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsRequest): Future[DeleteTagsResponse] =
      service.deleteTags(params).promise().toFuture
    @inline def describeAgentsFuture(params: DescribeAgentsRequest): Future[DescribeAgentsResponse] =
      service.describeAgents(params).promise().toFuture
    @inline def describeConfigurationsFuture(
        params: DescribeConfigurationsRequest
    ): Future[DescribeConfigurationsResponse] = service.describeConfigurations(params).promise().toFuture
    @inline def describeContinuousExportsFuture(
        params: DescribeContinuousExportsRequest
    ): Future[DescribeContinuousExportsResponse] = service.describeContinuousExports(params).promise().toFuture
    @inline def describeExportTasksFuture(params: DescribeExportTasksRequest): Future[DescribeExportTasksResponse] =
      service.describeExportTasks(params).promise().toFuture
    @inline def describeImportTasksFuture(params: DescribeImportTasksRequest): Future[DescribeImportTasksResponse] =
      service.describeImportTasks(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResponse] =
      service.describeTags(params).promise().toFuture
    @inline def disassociateConfigurationItemsFromApplicationFuture(
        params: DisassociateConfigurationItemsFromApplicationRequest
    ): Future[DisassociateConfigurationItemsFromApplicationResponse] =
      service.disassociateConfigurationItemsFromApplication(params).promise().toFuture
    @inline def getDiscoverySummaryFuture(params: GetDiscoverySummaryRequest): Future[GetDiscoverySummaryResponse] =
      service.getDiscoverySummary(params).promise().toFuture
    @inline def listConfigurationsFuture(params: ListConfigurationsRequest): Future[ListConfigurationsResponse] =
      service.listConfigurations(params).promise().toFuture
    @inline def listServerNeighborsFuture(params: ListServerNeighborsRequest): Future[ListServerNeighborsResponse] =
      service.listServerNeighbors(params).promise().toFuture
    @inline def startContinuousExportFuture(
        params: StartContinuousExportRequest
    ): Future[StartContinuousExportResponse] = service.startContinuousExport(params).promise().toFuture
    @inline def startDataCollectionByAgentIdsFuture(
        params: StartDataCollectionByAgentIdsRequest
    ): Future[StartDataCollectionByAgentIdsResponse] = service.startDataCollectionByAgentIds(params).promise().toFuture
    @inline def startExportTaskFuture(params: StartExportTaskRequest): Future[StartExportTaskResponse] =
      service.startExportTask(params).promise().toFuture
    @inline def startImportTaskFuture(params: StartImportTaskRequest): Future[StartImportTaskResponse] =
      service.startImportTask(params).promise().toFuture
    @inline def stopContinuousExportFuture(params: StopContinuousExportRequest): Future[StopContinuousExportResponse] =
      service.stopContinuousExport(params).promise().toFuture
    @inline def stopDataCollectionByAgentIdsFuture(
        params: StopDataCollectionByAgentIdsRequest
    ): Future[StopDataCollectionByAgentIdsResponse] = service.stopDataCollectionByAgentIds(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] =
      service.updateApplication(params).promise().toFuture
  }
}

package applicationdiscovery {
  @js.native
  @JSImport("aws-sdk", "Discovery")
  class ApplicationDiscovery() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateConfigurationItemsToApplication(
        params: AssociateConfigurationItemsToApplicationRequest
    ): Request[AssociateConfigurationItemsToApplicationResponse]                                            = js.native
    def batchDeleteImportData(params: BatchDeleteImportDataRequest): Request[BatchDeleteImportDataResponse] = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse]             = js.native
    def createTags(params: CreateTagsRequest): Request[CreateTagsResponse]                                  = js.native
    def deleteApplications(params: DeleteApplicationsRequest): Request[DeleteApplicationsResponse]          = js.native
    def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResponse]                                  = js.native
    def describeAgents(params: DescribeAgentsRequest): Request[DescribeAgentsResponse]                      = js.native
    def describeConfigurations(params: DescribeConfigurationsRequest): Request[DescribeConfigurationsResponse] =
      js.native
    def describeContinuousExports(
        params: DescribeContinuousExportsRequest
    ): Request[DescribeContinuousExportsResponse]                                                     = js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResponse] = js.native
    def describeImportTasks(params: DescribeImportTasksRequest): Request[DescribeImportTasksResponse] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse]                      = js.native
    def disassociateConfigurationItemsFromApplication(
        params: DisassociateConfigurationItemsFromApplicationRequest
    ): Request[DisassociateConfigurationItemsFromApplicationResponse]                                       = js.native
    def getDiscoverySummary(params: GetDiscoverySummaryRequest): Request[GetDiscoverySummaryResponse]       = js.native
    def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse]          = js.native
    def listServerNeighbors(params: ListServerNeighborsRequest): Request[ListServerNeighborsResponse]       = js.native
    def startContinuousExport(params: StartContinuousExportRequest): Request[StartContinuousExportResponse] = js.native
    def startDataCollectionByAgentIds(
        params: StartDataCollectionByAgentIdsRequest
    ): Request[StartDataCollectionByAgentIdsResponse]                                                    = js.native
    def startExportTask(params: StartExportTaskRequest): Request[StartExportTaskResponse]                = js.native
    def startImportTask(params: StartImportTaskRequest): Request[StartImportTaskResponse]                = js.native
    def stopContinuousExport(params: StopContinuousExportRequest): Request[StopContinuousExportResponse] = js.native
    def stopDataCollectionByAgentIds(
        params: StopDataCollectionByAgentIdsRequest
    ): Request[StopDataCollectionByAgentIdsResponse]                                            = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def describeExportConfigurations(
        params: DescribeExportConfigurationsRequest
    ): Request[DescribeExportConfigurationsResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def exportConfigurations(): Request[ExportConfigurationsResponse] =
      js.native
  }

  /**
    * Information about agents or connectors that were instructed to start collecting data. Information includes the agent/connector ID, a description of the operation, and whether the agent/connector configuration was updated.
    */
  @js.native
  @Factory
  trait AgentConfigurationStatus extends js.Object {
    var agentId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var operationSucceeded: js.UndefOr[Boolean]
  }

  /**
    * Information about agents or connectors associated with the user’s AWS account. Information includes agent or connector IDs, IP addresses, media access control (MAC) addresses, agent or connector health, hostname where the agent or connector resides, and agent version for each agent.
    */
  @js.native
  @Factory
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

  /**
    * Network details about the host where the agent/connector resides.
    */
  @js.native
  @Factory
  trait AgentNetworkInfo extends js.Object {
    var ipAddress: js.UndefOr[String]
    var macAddress: js.UndefOr[String]
  }

  @js.native
  sealed trait AgentStatus extends js.Any
  object AgentStatus extends js.Object {
    val HEALTHY     = "HEALTHY".asInstanceOf[AgentStatus]
    val UNHEALTHY   = "UNHEALTHY".asInstanceOf[AgentStatus]
    val RUNNING     = "RUNNING".asInstanceOf[AgentStatus]
    val UNKNOWN     = "UNKNOWN".asInstanceOf[AgentStatus]
    val BLACKLISTED = "BLACKLISTED".asInstanceOf[AgentStatus]
    val SHUTDOWN    = "SHUTDOWN".asInstanceOf[AgentStatus]

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY, RUNNING, UNKNOWN, BLACKLISTED, SHUTDOWN))
  }

  @js.native
  @Factory
  trait AssociateConfigurationItemsToApplicationRequest extends js.Object {
    var applicationConfigurationId: ApplicationId
    var configurationIds: ConfigurationIdList
  }

  @js.native
  @Factory
  trait AssociateConfigurationItemsToApplicationResponse extends js.Object {}

  /**
    * Error messages returned for each import task that you deleted as a response for this command.
    */
  @js.native
  @Factory
  trait BatchDeleteImportDataError extends js.Object {
    var errorCode: js.UndefOr[BatchDeleteImportDataErrorCode]
    var errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription]
    var importTaskId: js.UndefOr[ImportTaskIdentifier]
  }

  @js.native
  sealed trait BatchDeleteImportDataErrorCode extends js.Any
  object BatchDeleteImportDataErrorCode extends js.Object {
    val NOT_FOUND             = "NOT_FOUND".asInstanceOf[BatchDeleteImportDataErrorCode]
    val INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[BatchDeleteImportDataErrorCode]
    val OVER_LIMIT            = "OVER_LIMIT".asInstanceOf[BatchDeleteImportDataErrorCode]

    val values = js.Object.freeze(js.Array(NOT_FOUND, INTERNAL_SERVER_ERROR, OVER_LIMIT))
  }

  @js.native
  @Factory
  trait BatchDeleteImportDataRequest extends js.Object {
    var importTaskIds: ToDeleteIdentifierList
  }

  @js.native
  @Factory
  trait BatchDeleteImportDataResponse extends js.Object {
    var errors: js.UndefOr[BatchDeleteImportDataErrorList]
  }

  @js.native
  sealed trait ConfigurationItemType extends js.Any
  object ConfigurationItemType extends js.Object {
    val SERVER      = "SERVER".asInstanceOf[ConfigurationItemType]
    val PROCESS     = "PROCESS".asInstanceOf[ConfigurationItemType]
    val CONNECTION  = "CONNECTION".asInstanceOf[ConfigurationItemType]
    val APPLICATION = "APPLICATION".asInstanceOf[ConfigurationItemType]

    val values = js.Object.freeze(js.Array(SERVER, PROCESS, CONNECTION, APPLICATION))
  }

  /**
    * Tags for a configuration item. Tags are metadata that help you categorize IT assets.
    */
  @js.native
  @Factory
  trait ConfigurationTag extends js.Object {
    var configurationId: js.UndefOr[ConfigurationId]
    var configurationType: js.UndefOr[ConfigurationItemType]
    var key: js.UndefOr[TagKey]
    var timeOfCreation: js.UndefOr[TimeStamp]
    var value: js.UndefOr[TagValue]
  }

  /**
    * A list of continuous export descriptions.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ContinuousExportStatus extends js.Any
  object ContinuousExportStatus extends js.Object {
    val START_IN_PROGRESS = "START_IN_PROGRESS".asInstanceOf[ContinuousExportStatus]
    val START_FAILED      = "START_FAILED".asInstanceOf[ContinuousExportStatus]
    val ACTIVE            = "ACTIVE".asInstanceOf[ContinuousExportStatus]
    val ERROR             = "ERROR".asInstanceOf[ContinuousExportStatus]
    val STOP_IN_PROGRESS  = "STOP_IN_PROGRESS".asInstanceOf[ContinuousExportStatus]
    val STOP_FAILED       = "STOP_FAILED".asInstanceOf[ContinuousExportStatus]
    val INACTIVE          = "INACTIVE".asInstanceOf[ContinuousExportStatus]

    val values = js.Object.freeze(
      js.Array(START_IN_PROGRESS, START_FAILED, ACTIVE, ERROR, STOP_IN_PROGRESS, STOP_FAILED, INACTIVE)
    )
  }

  @js.native
  @Factory
  trait CreateApplicationRequest extends js.Object {
    var name: String
    var description: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateApplicationResponse extends js.Object {
    var configurationId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateTagsRequest extends js.Object {
    var configurationIds: ConfigurationIdList
    var tags: TagSet
  }

  @js.native
  @Factory
  trait CreateTagsResponse extends js.Object {}

  /**
    * Inventory data for installed discovery agents.
    */
  @js.native
  @Factory
  trait CustomerAgentInfo extends js.Object {
    var activeAgents: Int
    var blackListedAgents: Int
    var healthyAgents: Int
    var shutdownAgents: Int
    var totalAgents: Int
    var unhealthyAgents: Int
    var unknownAgents: Int
  }

  /**
    * Inventory data for installed discovery connectors.
    */
  @js.native
  @Factory
  trait CustomerConnectorInfo extends js.Object {
    var activeConnectors: Int
    var blackListedConnectors: Int
    var healthyConnectors: Int
    var shutdownConnectors: Int
    var totalConnectors: Int
    var unhealthyConnectors: Int
    var unknownConnectors: Int
  }

  @js.native
  sealed trait DataSource extends js.Any
  object DataSource extends js.Object {
    val AGENT = "AGENT".asInstanceOf[DataSource]

    val values = js.Object.freeze(js.Array(AGENT))
  }

  @js.native
  @Factory
  trait DeleteApplicationsRequest extends js.Object {
    var configurationIds: ApplicationIdsList
  }

  @js.native
  @Factory
  trait DeleteApplicationsResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteTagsRequest extends js.Object {
    var configurationIds: ConfigurationIdList
    var tags: js.UndefOr[TagSet]
  }

  @js.native
  @Factory
  trait DeleteTagsResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeAgentsRequest extends js.Object {
    var agentIds: js.UndefOr[AgentIds]
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAgentsResponse extends js.Object {
    var agentsInfo: js.UndefOr[AgentsInfo]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeConfigurationsRequest extends js.Object {
    var configurationIds: ConfigurationIdList
  }

  @js.native
  @Factory
  trait DescribeConfigurationsResponse extends js.Object {
    var configurations: js.UndefOr[DescribeConfigurationsAttributes]
  }

  @js.native
  @Factory
  trait DescribeContinuousExportsRequest extends js.Object {
    var exportIds: js.UndefOr[ContinuousExportIds]
    var maxResults: js.UndefOr[DescribeContinuousExportsMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeContinuousExportsResponse extends js.Object {
    var descriptions: js.UndefOr[ContinuousExportDescriptions]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeExportConfigurationsRequest extends js.Object {
    var exportIds: js.UndefOr[ExportIds]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeExportConfigurationsResponse extends js.Object {
    var exportsInfo: js.UndefOr[ExportsInfo]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeExportTasksRequest extends js.Object {
    var exportIds: js.UndefOr[ExportIds]
    var filters: js.UndefOr[ExportFilters]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeExportTasksResponse extends js.Object {
    var exportsInfo: js.UndefOr[ExportsInfo]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeImportTasksRequest extends js.Object {
    var filters: js.UndefOr[DescribeImportTasksFilterList]
    var maxResults: js.UndefOr[DescribeImportTasksMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeImportTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[ImportTaskList]
  }

  @js.native
  @Factory
  trait DescribeTagsRequest extends js.Object {
    var filters: js.UndefOr[TagFilters]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeTagsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[ConfigurationTagSet]
  }

  @js.native
  @Factory
  trait DisassociateConfigurationItemsFromApplicationRequest extends js.Object {
    var applicationConfigurationId: ApplicationId
    var configurationIds: ConfigurationIdList
  }

  @js.native
  @Factory
  trait DisassociateConfigurationItemsFromApplicationResponse extends js.Object {}

  @js.native
  @Factory
  trait ExportConfigurationsResponse extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
  }

  @js.native
  sealed trait ExportDataFormat extends js.Any
  object ExportDataFormat extends js.Object {
    val CSV     = "CSV".asInstanceOf[ExportDataFormat]
    val GRAPHML = "GRAPHML".asInstanceOf[ExportDataFormat]

    val values = js.Object.freeze(js.Array(CSV, GRAPHML))
  }

  /**
    * Used to select which agent's data is to be exported. A single agent ID may be selected for export using the [[http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html|StartExportTask]] action.
    */
  @js.native
  @Factory
  trait ExportFilter extends js.Object {
    var condition: Condition
    var name: FilterName
    var values: FilterValues
  }

  /**
    * Information regarding the export status of discovered data. The value is an array of objects.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ExportStatus extends js.Any
  object ExportStatus extends js.Object {
    val FAILED      = "FAILED".asInstanceOf[ExportStatus]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[ExportStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExportStatus]

    val values = js.Object.freeze(js.Array(FAILED, SUCCEEDED, IN_PROGRESS))
  }

  /**
    * A filter that can use conditional operators.
    *  For more information about filters, see [[https://docs.aws.amazon.com/application-discovery/latest/userguide/discovery-api-queries.html|Querying Discovered Configuration Items]] in the <i>AWS Application Discovery Service User Guide</i>.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var condition: Condition
    var name: String
    var values: FilterValues
  }

  @js.native
  @Factory
  trait GetDiscoverySummaryRequest extends js.Object {}

  @js.native
  @Factory
  trait GetDiscoverySummaryResponse extends js.Object {
    var agentSummary: js.UndefOr[CustomerAgentInfo]
    var applications: js.UndefOr[Double]
    var connectorSummary: js.UndefOr[CustomerConnectorInfo]
    var servers: js.UndefOr[Double]
    var serversMappedToApplications: js.UndefOr[Double]
    var serversMappedtoTags: js.UndefOr[Double]
  }

  @js.native
  sealed trait ImportStatus extends js.Any
  object ImportStatus extends js.Object {
    val IMPORT_IN_PROGRESS                  = "IMPORT_IN_PROGRESS".asInstanceOf[ImportStatus]
    val IMPORT_COMPLETE                     = "IMPORT_COMPLETE".asInstanceOf[ImportStatus]
    val IMPORT_COMPLETE_WITH_ERRORS         = "IMPORT_COMPLETE_WITH_ERRORS".asInstanceOf[ImportStatus]
    val IMPORT_FAILED                       = "IMPORT_FAILED".asInstanceOf[ImportStatus]
    val IMPORT_FAILED_SERVER_LIMIT_EXCEEDED = "IMPORT_FAILED_SERVER_LIMIT_EXCEEDED".asInstanceOf[ImportStatus]
    val IMPORT_FAILED_RECORD_LIMIT_EXCEEDED = "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED".asInstanceOf[ImportStatus]
    val DELETE_IN_PROGRESS                  = "DELETE_IN_PROGRESS".asInstanceOf[ImportStatus]
    val DELETE_COMPLETE                     = "DELETE_COMPLETE".asInstanceOf[ImportStatus]
    val DELETE_FAILED                       = "DELETE_FAILED".asInstanceOf[ImportStatus]
    val DELETE_FAILED_LIMIT_EXCEEDED        = "DELETE_FAILED_LIMIT_EXCEEDED".asInstanceOf[ImportStatus]
    val INTERNAL_ERROR                      = "INTERNAL_ERROR".asInstanceOf[ImportStatus]

    val values = js.Object.freeze(
      js.Array(
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
      )
    )
  }

  /**
    * An array of information related to the import task request that includes status information, times, IDs, the Amazon S3 Object URL for the import file, and more.
    */
  @js.native
  @Factory
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

  /**
    * A name-values pair of elements you can use to filter the results when querying your import tasks. Currently, wildcards are not supported for filters.
    *
    * '''Note:'''When filtering by import status, all other filter values are ignored.
    */
  @js.native
  @Factory
  trait ImportTaskFilter extends js.Object {
    var name: js.UndefOr[ImportTaskFilterName]
    var values: js.UndefOr[ImportTaskFilterValueList]
  }

  @js.native
  sealed trait ImportTaskFilterName extends js.Any
  object ImportTaskFilterName extends js.Object {
    val IMPORT_TASK_ID = "IMPORT_TASK_ID".asInstanceOf[ImportTaskFilterName]
    val STATUS         = "STATUS".asInstanceOf[ImportTaskFilterName]
    val NAME           = "NAME".asInstanceOf[ImportTaskFilterName]

    val values = js.Object.freeze(js.Array(IMPORT_TASK_ID, STATUS, NAME))
  }

  @js.native
  @Factory
  trait ListConfigurationsRequest extends js.Object {
    var configurationType: ConfigurationItemType
    var filters: js.UndefOr[Filters]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[NextToken]
    var orderBy: js.UndefOr[OrderByList]
  }

  @js.native
  @Factory
  trait ListConfigurationsResponse extends js.Object {
    var configurations: js.UndefOr[Configurations]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListServerNeighborsRequest extends js.Object {
    var configurationId: ConfigurationId
    var maxResults: js.UndefOr[Int]
    var neighborConfigurationIds: js.UndefOr[ConfigurationIdList]
    var nextToken: js.UndefOr[String]
    var portInformationNeeded: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ListServerNeighborsResponse extends js.Object {
    var neighbors: NeighborDetailsList
    var knownDependencyCount: js.UndefOr[Double]
    var nextToken: js.UndefOr[String]
  }

  /**
    * Details about neighboring servers.
    */
  @js.native
  @Factory
  trait NeighborConnectionDetail extends js.Object {
    var connectionsCount: Double
    var destinationServerId: ConfigurationId
    var sourceServerId: ConfigurationId
    var destinationPort: js.UndefOr[BoxedInteger]
    var transportProtocol: js.UndefOr[String]
  }

  /**
    * A field and direction for ordered output.
    */
  @js.native
  @Factory
  trait OrderByElement extends js.Object {
    var fieldName: String
    var sortOrder: js.UndefOr[orderString]
  }

  @js.native
  @Factory
  trait StartContinuousExportRequest extends js.Object {}

  @js.native
  @Factory
  trait StartContinuousExportResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
    var exportId: js.UndefOr[ConfigurationsExportId]
    var s3Bucket: js.UndefOr[S3Bucket]
    var schemaStorageConfig: js.UndefOr[SchemaStorageConfig]
    var startTime: js.UndefOr[TimeStamp]
  }

  @js.native
  @Factory
  trait StartDataCollectionByAgentIdsRequest extends js.Object {
    var agentIds: AgentIds
  }

  @js.native
  @Factory
  trait StartDataCollectionByAgentIdsResponse extends js.Object {
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList]
  }

  @js.native
  @Factory
  trait StartExportTaskRequest extends js.Object {
    var endTime: js.UndefOr[TimeStamp]
    var exportDataFormat: js.UndefOr[ExportDataFormats]
    var filters: js.UndefOr[ExportFilters]
    var startTime: js.UndefOr[TimeStamp]
  }

  @js.native
  @Factory
  trait StartExportTaskResponse extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
  }

  @js.native
  @Factory
  trait StartImportTaskRequest extends js.Object {
    var importUrl: ImportURL
    var name: ImportTaskName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  @js.native
  @Factory
  trait StartImportTaskResponse extends js.Object {
    var task: js.UndefOr[ImportTask]
  }

  @js.native
  @Factory
  trait StopContinuousExportRequest extends js.Object {
    var exportId: ConfigurationsExportId
  }

  @js.native
  @Factory
  trait StopContinuousExportResponse extends js.Object {
    var startTime: js.UndefOr[TimeStamp]
    var stopTime: js.UndefOr[TimeStamp]
  }

  @js.native
  @Factory
  trait StopDataCollectionByAgentIdsRequest extends js.Object {
    var agentIds: AgentIds
  }

  @js.native
  @Factory
  trait StopDataCollectionByAgentIdsResponse extends js.Object {
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList]
  }

  /**
    * Metadata that help you categorize IT assets.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  /**
    * The tag filter. Valid names are: <code>tagKey</code>, <code>tagValue</code>, <code>configurationId</code>.
    */
  @js.native
  @Factory
  trait TagFilter extends js.Object {
    var name: FilterName
    var values: FilterValues
  }

  @js.native
  @Factory
  trait UpdateApplicationRequest extends js.Object {
    var configurationId: ApplicationId
    var description: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateApplicationResponse extends js.Object {}

  @js.native
  sealed trait orderString extends js.Any
  object orderString extends js.Object {
    val ASC  = "ASC".asInstanceOf[orderString]
    val DESC = "DESC".asInstanceOf[orderString]

    val values = js.Object.freeze(js.Array(ASC, DESC))
  }
}
