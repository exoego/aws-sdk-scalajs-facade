package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object applicationdiscovery {
  type AgentConfigurationStatusList          = js.Array[AgentConfigurationStatus]
  type AgentId                               = String
  type AgentIds                              = js.Array[AgentId]
  type AgentNetworkInfoList                  = js.Array[AgentNetworkInfo]
  type AgentStatus                           = String
  type AgentsInfo                            = js.Array[AgentInfo]
  type ApplicationId                         = String
  type ApplicationIdsList                    = js.Array[ApplicationId]
  type BatchDeleteImportDataErrorCode        = String
  type BatchDeleteImportDataErrorDescription = String
  type BatchDeleteImportDataErrorList        = js.Array[BatchDeleteImportDataError]
  type BoxedInteger                          = Int
  type ClientRequestToken                    = String
  type Condition                             = String
  type Configuration                         = js.Dictionary[String]
  type ConfigurationId                       = String
  type ConfigurationIdList                   = js.Array[ConfigurationId]
  type ConfigurationItemType                 = String
  type ConfigurationTagSet                   = js.Array[ConfigurationTag]
  type Configurations                        = js.Array[Configuration]
  type ConfigurationsDownloadUrl             = String
  type ConfigurationsExportId                = String
  type ContinuousExportDescriptions          = js.Array[ContinuousExportDescription]
  type ContinuousExportIds                   = js.Array[ConfigurationsExportId]
  type ContinuousExportStatus                = String
  type DataSource                            = String
  type DatabaseName                          = String
  type DescribeConfigurationsAttribute       = js.Dictionary[String]
  type DescribeConfigurationsAttributes      = js.Array[DescribeConfigurationsAttribute]
  type DescribeContinuousExportsMaxResults   = Int
  type DescribeImportTasksFilterList         = js.Array[ImportTaskFilter]
  type DescribeImportTasksMaxResults         = Int
  type ExportDataFormat                      = String
  type ExportDataFormats                     = js.Array[ExportDataFormat]
  type ExportFilters                         = js.Array[ExportFilter]
  type ExportIds                             = js.Array[ConfigurationsExportId]
  type ExportRequestTime                     = js.Date
  type ExportStatus                          = String
  type ExportStatusMessage                   = String
  type ExportsInfo                           = js.Array[ExportInfo]
  type FilterName                            = String
  type FilterValue                           = String
  type FilterValues                          = js.Array[FilterValue]
  type Filters                               = js.Array[Filter]
  type ImportStatus                          = String
  type ImportTaskFilterName                  = String
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
  type orderString                           = String

  implicit final class ApplicationDiscoveryOps(val service: ApplicationDiscovery) extends AnyVal {

    def associateConfigurationItemsToApplicationFuture(
        params: AssociateConfigurationItemsToApplicationRequest
    ): Future[AssociateConfigurationItemsToApplicationResponse] =
      service.associateConfigurationItemsToApplication(params).promise.toFuture
    def batchDeleteImportDataFuture(params: BatchDeleteImportDataRequest): Future[BatchDeleteImportDataResponse] =
      service.batchDeleteImportData(params).promise.toFuture
    def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] =
      service.createApplication(params).promise.toFuture
    def createTagsFuture(params: CreateTagsRequest): Future[CreateTagsResponse] =
      service.createTags(params).promise.toFuture
    def deleteApplicationsFuture(params: DeleteApplicationsRequest): Future[DeleteApplicationsResponse] =
      service.deleteApplications(params).promise.toFuture
    def deleteTagsFuture(params: DeleteTagsRequest): Future[DeleteTagsResponse] =
      service.deleteTags(params).promise.toFuture
    def describeAgentsFuture(params: DescribeAgentsRequest): Future[DescribeAgentsResponse] =
      service.describeAgents(params).promise.toFuture
    def describeConfigurationsFuture(params: DescribeConfigurationsRequest): Future[DescribeConfigurationsResponse] =
      service.describeConfigurations(params).promise.toFuture
    def describeContinuousExportsFuture(
        params: DescribeContinuousExportsRequest
    ): Future[DescribeContinuousExportsResponse] = service.describeContinuousExports(params).promise.toFuture
    def describeExportConfigurationsFuture(
        params: DescribeExportConfigurationsRequest
    ): Future[DescribeExportConfigurationsResponse] = service.describeExportConfigurations(params).promise.toFuture
    def describeExportTasksFuture(params: DescribeExportTasksRequest): Future[DescribeExportTasksResponse] =
      service.describeExportTasks(params).promise.toFuture
    def describeImportTasksFuture(params: DescribeImportTasksRequest): Future[DescribeImportTasksResponse] =
      service.describeImportTasks(params).promise.toFuture
    def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResponse] =
      service.describeTags(params).promise.toFuture
    def disassociateConfigurationItemsFromApplicationFuture(
        params: DisassociateConfigurationItemsFromApplicationRequest
    ): Future[DisassociateConfigurationItemsFromApplicationResponse] =
      service.disassociateConfigurationItemsFromApplication(params).promise.toFuture
    def exportConfigurationsFuture(): Future[ExportConfigurationsResponse] =
      service.exportConfigurations().promise.toFuture
    def getDiscoverySummaryFuture(params: GetDiscoverySummaryRequest): Future[GetDiscoverySummaryResponse] =
      service.getDiscoverySummary(params).promise.toFuture
    def listConfigurationsFuture(params: ListConfigurationsRequest): Future[ListConfigurationsResponse] =
      service.listConfigurations(params).promise.toFuture
    def listServerNeighborsFuture(params: ListServerNeighborsRequest): Future[ListServerNeighborsResponse] =
      service.listServerNeighbors(params).promise.toFuture
    def startContinuousExportFuture(params: StartContinuousExportRequest): Future[StartContinuousExportResponse] =
      service.startContinuousExport(params).promise.toFuture
    def startDataCollectionByAgentIdsFuture(
        params: StartDataCollectionByAgentIdsRequest
    ): Future[StartDataCollectionByAgentIdsResponse] = service.startDataCollectionByAgentIds(params).promise.toFuture
    def startExportTaskFuture(params: StartExportTaskRequest): Future[StartExportTaskResponse] =
      service.startExportTask(params).promise.toFuture
    def startImportTaskFuture(params: StartImportTaskRequest): Future[StartImportTaskResponse] =
      service.startImportTask(params).promise.toFuture
    def stopContinuousExportFuture(params: StopContinuousExportRequest): Future[StopContinuousExportResponse] =
      service.stopContinuousExport(params).promise.toFuture
    def stopDataCollectionByAgentIdsFuture(
        params: StopDataCollectionByAgentIdsRequest
    ): Future[StopDataCollectionByAgentIdsResponse] = service.stopDataCollectionByAgentIds(params).promise.toFuture
    def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] =
      service.updateApplication(params).promise.toFuture
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
  trait AgentConfigurationStatus extends js.Object {
    var agentId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var operationSucceeded: js.UndefOr[Boolean]
  }

  object AgentConfigurationStatus {
    def apply(
        agentId: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        operationSucceeded: js.UndefOr[Boolean] = js.undefined
    ): AgentConfigurationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentId" -> agentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "operationSucceeded" -> operationSucceeded.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentConfigurationStatus]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "agentId" -> agentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "agentNetworkInfoList" -> agentNetworkInfoList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "agentType" -> agentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "collectionStatus" -> collectionStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "connectorId" -> connectorId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "health" -> health.map { x =>
          x.asInstanceOf[js.Any]
        },
        "hostName" -> hostName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastHealthPingTime" -> lastHealthPingTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "registeredTime" -> registeredTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentInfo]
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
    def apply(
        ipAddress: js.UndefOr[String] = js.undefined,
        macAddress: js.UndefOr[String] = js.undefined
    ): AgentNetworkInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ipAddress" -> ipAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "macAddress" -> macAddress.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentNetworkInfo]
    }
  }

  object AgentStatusEnum {
    val HEALTHY     = "HEALTHY"
    val UNHEALTHY   = "UNHEALTHY"
    val RUNNING     = "RUNNING"
    val UNKNOWN     = "UNKNOWN"
    val BLACKLISTED = "BLACKLISTED"
    val SHUTDOWN    = "SHUTDOWN"

    val values = IndexedSeq(HEALTHY, UNHEALTHY, RUNNING, UNKNOWN, BLACKLISTED, SHUTDOWN)
  }

  @js.native
  trait AssociateConfigurationItemsToApplicationRequest extends js.Object {
    var applicationConfigurationId: ApplicationId
    var configurationIds: ConfigurationIdList
  }

  object AssociateConfigurationItemsToApplicationRequest {
    def apply(
        applicationConfigurationId: ApplicationId,
        configurationIds: ConfigurationIdList
    ): AssociateConfigurationItemsToApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationConfigurationId" -> applicationConfigurationId.asInstanceOf[js.Any],
        "configurationIds"           -> configurationIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AssociateConfigurationItemsToApplicationRequest]
    }
  }

  @js.native
  trait AssociateConfigurationItemsToApplicationResponse extends js.Object {}

  object AssociateConfigurationItemsToApplicationResponse {
    def apply(
        ): AssociateConfigurationItemsToApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[AssociateConfigurationItemsToApplicationResponse]
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
    def apply(
        errorCode: js.UndefOr[BatchDeleteImportDataErrorCode] = js.undefined,
        errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription] = js.undefined,
        importTaskId: js.UndefOr[ImportTaskIdentifier] = js.undefined
    ): BatchDeleteImportDataError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errorCode" -> errorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorDescription" -> errorDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "importTaskId" -> importTaskId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteImportDataError]
    }
  }

  object BatchDeleteImportDataErrorCodeEnum {
    val NOT_FOUND             = "NOT_FOUND"
    val INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR"

    val values = IndexedSeq(NOT_FOUND, INTERNAL_SERVER_ERROR)
  }

  @js.native
  trait BatchDeleteImportDataRequest extends js.Object {
    var importTaskIds: ToDeleteIdentifierList
  }

  object BatchDeleteImportDataRequest {
    def apply(
        importTaskIds: ToDeleteIdentifierList
    ): BatchDeleteImportDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "importTaskIds" -> importTaskIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteImportDataRequest]
    }
  }

  @js.native
  trait BatchDeleteImportDataResponse extends js.Object {
    var errors: js.UndefOr[BatchDeleteImportDataErrorList]
  }

  object BatchDeleteImportDataResponse {
    def apply(
        errors: js.UndefOr[BatchDeleteImportDataErrorList] = js.undefined
    ): BatchDeleteImportDataResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errors" -> errors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteImportDataResponse]
    }
  }

  object ConfigurationItemTypeEnum {
    val SERVER      = "SERVER"
    val PROCESS     = "PROCESS"
    val CONNECTION  = "CONNECTION"
    val APPLICATION = "APPLICATION"

    val values = IndexedSeq(SERVER, PROCESS, CONNECTION, APPLICATION)
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
    def apply(
        configurationId: js.UndefOr[ConfigurationId] = js.undefined,
        configurationType: js.UndefOr[ConfigurationItemType] = js.undefined,
        key: js.UndefOr[TagKey] = js.undefined,
        timeOfCreation: js.UndefOr[TimeStamp] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): ConfigurationTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "configurationType" -> configurationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "key" -> key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeOfCreation" -> timeOfCreation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "value" -> value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationTag]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSource" -> dataSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "exportId" -> exportId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "s3Bucket" -> s3Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "schemaStorageConfig" -> schemaStorageConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startTime" -> startTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusDetail" -> statusDetail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stopTime" -> stopTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinuousExportDescription]
    }
  }

  object ContinuousExportStatusEnum {
    val START_IN_PROGRESS = "START_IN_PROGRESS"
    val START_FAILED      = "START_FAILED"
    val ACTIVE            = "ACTIVE"
    val ERROR             = "ERROR"
    val STOP_IN_PROGRESS  = "STOP_IN_PROGRESS"
    val STOP_FAILED       = "STOP_FAILED"
    val INACTIVE          = "INACTIVE"

    val values = IndexedSeq(START_IN_PROGRESS, START_FAILED, ACTIVE, ERROR, STOP_IN_PROGRESS, STOP_FAILED, INACTIVE)
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var name: String
    var description: js.UndefOr[String]
  }

  object CreateApplicationRequest {
    def apply(
        name: String,
        description: js.UndefOr[String] = js.undefined
    ): CreateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var configurationId: js.UndefOr[String]
  }

  object CreateApplicationResponse {
    def apply(
        configurationId: js.UndefOr[String] = js.undefined
    ): CreateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateTagsRequest extends js.Object {
    var configurationIds: ConfigurationIdList
    var tags: TagSet
  }

  object CreateTagsRequest {
    def apply(
        configurationIds: ConfigurationIdList,
        tags: TagSet
    ): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationIds" -> configurationIds.asInstanceOf[js.Any],
        "tags"             -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
    }
  }

  @js.native
  trait CreateTagsResponse extends js.Object {}

  object CreateTagsResponse {
    def apply(
        ): CreateTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsResponse]
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
    def apply(
        activeAgents: Int,
        blackListedAgents: Int,
        healthyAgents: Int,
        shutdownAgents: Int,
        totalAgents: Int,
        unhealthyAgents: Int,
        unknownAgents: Int
    ): CustomerAgentInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activeAgents"      -> activeAgents.asInstanceOf[js.Any],
        "blackListedAgents" -> blackListedAgents.asInstanceOf[js.Any],
        "healthyAgents"     -> healthyAgents.asInstanceOf[js.Any],
        "shutdownAgents"    -> shutdownAgents.asInstanceOf[js.Any],
        "totalAgents"       -> totalAgents.asInstanceOf[js.Any],
        "unhealthyAgents"   -> unhealthyAgents.asInstanceOf[js.Any],
        "unknownAgents"     -> unknownAgents.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomerAgentInfo]
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
    def apply(
        activeConnectors: Int,
        blackListedConnectors: Int,
        healthyConnectors: Int,
        shutdownConnectors: Int,
        totalConnectors: Int,
        unhealthyConnectors: Int,
        unknownConnectors: Int
    ): CustomerConnectorInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activeConnectors"      -> activeConnectors.asInstanceOf[js.Any],
        "blackListedConnectors" -> blackListedConnectors.asInstanceOf[js.Any],
        "healthyConnectors"     -> healthyConnectors.asInstanceOf[js.Any],
        "shutdownConnectors"    -> shutdownConnectors.asInstanceOf[js.Any],
        "totalConnectors"       -> totalConnectors.asInstanceOf[js.Any],
        "unhealthyConnectors"   -> unhealthyConnectors.asInstanceOf[js.Any],
        "unknownConnectors"     -> unknownConnectors.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomerConnectorInfo]
    }
  }

  object DataSourceEnum {
    val AGENT = "AGENT"

    val values = IndexedSeq(AGENT)
  }

  @js.native
  trait DeleteApplicationsRequest extends js.Object {
    var configurationIds: ApplicationIdsList
  }

  object DeleteApplicationsRequest {
    def apply(
        configurationIds: ApplicationIdsList
    ): DeleteApplicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationIds" -> configurationIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationsRequest]
    }
  }

  @js.native
  trait DeleteApplicationsResponse extends js.Object {}

  object DeleteApplicationsResponse {
    def apply(
        ): DeleteApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationsResponse]
    }
  }

  @js.native
  trait DeleteTagsRequest extends js.Object {
    var configurationIds: ConfigurationIdList
    var tags: js.UndefOr[TagSet]
  }

  object DeleteTagsRequest {
    def apply(
        configurationIds: ConfigurationIdList,
        tags: js.UndefOr[TagSet] = js.undefined
    ): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationIds" -> configurationIds.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  @js.native
  trait DeleteTagsResponse extends js.Object {}

  object DeleteTagsResponse {
    def apply(
        ): DeleteTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAgentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentIds" -> agentIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "filters" -> filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAgentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentsInfo" -> agentsInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentsResponse]
    }
  }

  @js.native
  trait DescribeConfigurationsRequest extends js.Object {
    var configurationIds: ConfigurationIdList
  }

  object DescribeConfigurationsRequest {
    def apply(
        configurationIds: ConfigurationIdList
    ): DescribeConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationIds" -> configurationIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationsRequest]
    }
  }

  @js.native
  trait DescribeConfigurationsResponse extends js.Object {
    var configurations: js.UndefOr[DescribeConfigurationsAttributes]
  }

  object DescribeConfigurationsResponse {
    def apply(
        configurations: js.UndefOr[DescribeConfigurationsAttributes] = js.undefined
    ): DescribeConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurations" -> configurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeContinuousExportsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportIds" -> exportIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeContinuousExportsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "descriptions" -> descriptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportIds" -> exportIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportsInfo" -> exportsInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportIds" -> exportIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "filters" -> filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportsInfo" -> exportsInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksResponse]
    }
  }

  @js.native
  trait DescribeImportTasksRequest extends js.Object {
    var filters: js.UndefOr[DescribeImportTasksFilterList]
    var maxResults: js.UndefOr[DescribeImportTasksMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeImportTasksRequest {
    def apply(
        filters: js.UndefOr[DescribeImportTasksFilterList] = js.undefined,
        maxResults: js.UndefOr[DescribeImportTasksMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeImportTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filters" -> filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportTasksRequest]
    }
  }

  @js.native
  trait DescribeImportTasksResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[ImportTaskList]
  }

  object DescribeImportTasksResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tasks: js.UndefOr[ImportTaskList] = js.undefined
    ): DescribeImportTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tasks" -> tasks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportTasksResponse]
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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filters" -> filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
    }
  }

  @js.native
  trait DescribeTagsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[ConfigurationTagSet]
  }

  object DescribeTagsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[ConfigurationTagSet] = js.undefined
    ): DescribeTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResponse]
    }
  }

  @js.native
  trait DisassociateConfigurationItemsFromApplicationRequest extends js.Object {
    var applicationConfigurationId: ApplicationId
    var configurationIds: ConfigurationIdList
  }

  object DisassociateConfigurationItemsFromApplicationRequest {
    def apply(
        applicationConfigurationId: ApplicationId,
        configurationIds: ConfigurationIdList
    ): DisassociateConfigurationItemsFromApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationConfigurationId" -> applicationConfigurationId.asInstanceOf[js.Any],
        "configurationIds"           -> configurationIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DisassociateConfigurationItemsFromApplicationRequest]
    }
  }

  @js.native
  trait DisassociateConfigurationItemsFromApplicationResponse extends js.Object {}

  object DisassociateConfigurationItemsFromApplicationResponse {
    def apply(
        ): DisassociateConfigurationItemsFromApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DisassociateConfigurationItemsFromApplicationResponse]
    }
  }

  @js.native
  trait ExportConfigurationsResponse extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
  }

  object ExportConfigurationsResponse {
    def apply(
        exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
    ): ExportConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId" -> exportId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportConfigurationsResponse]
    }
  }

  object ExportDataFormatEnum {
    val CSV     = "CSV"
    val GRAPHML = "GRAPHML"

    val values = IndexedSeq(CSV, GRAPHML)
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
    def apply(
        condition: Condition,
        name: FilterName,
        values: FilterValues
    ): ExportFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "condition" -> condition.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "values"    -> values.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportFilter]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId"          -> exportId.asInstanceOf[js.Any],
        "exportRequestTime" -> exportRequestTime.asInstanceOf[js.Any],
        "exportStatus"      -> exportStatus.asInstanceOf[js.Any],
        "statusMessage"     -> statusMessage.asInstanceOf[js.Any],
        "configurationsDownloadUrl" -> configurationsDownloadUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isTruncated" -> isTruncated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "requestedEndTime" -> requestedEndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "requestedStartTime" -> requestedStartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportInfo]
    }
  }

  object ExportStatusEnum {
    val FAILED      = "FAILED"
    val SUCCEEDED   = "SUCCEEDED"
    val IN_PROGRESS = "IN_PROGRESS"

    val values = IndexedSeq(FAILED, SUCCEEDED, IN_PROGRESS)
  }

  /**
    * A filter that can use conditional operators.
    *  For more information about filters, see [[http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html|Querying Discovered Configuration Items]].
    */
  @js.native
  trait Filter extends js.Object {
    var condition: Condition
    var name: String
    var values: FilterValues
  }

  object Filter {
    def apply(
        condition: Condition,
        name: String,
        values: FilterValues
    ): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "condition" -> condition.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "values"    -> values.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetDiscoverySummaryRequest extends js.Object {}

  object GetDiscoverySummaryRequest {
    def apply(
        ): GetDiscoverySummaryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiscoverySummaryRequest]
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
    def apply(
        agentSummary: js.UndefOr[CustomerAgentInfo] = js.undefined,
        applications: js.UndefOr[Double] = js.undefined,
        connectorSummary: js.UndefOr[CustomerConnectorInfo] = js.undefined,
        servers: js.UndefOr[Double] = js.undefined,
        serversMappedToApplications: js.UndefOr[Double] = js.undefined,
        serversMappedtoTags: js.UndefOr[Double] = js.undefined
    ): GetDiscoverySummaryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentSummary" -> agentSummary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "applications" -> applications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "connectorSummary" -> connectorSummary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "servers" -> servers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serversMappedToApplications" -> serversMappedToApplications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serversMappedtoTags" -> serversMappedtoTags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiscoverySummaryResponse]
    }
  }

  object ImportStatusEnum {
    val IMPORT_IN_PROGRESS                  = "IMPORT_IN_PROGRESS"
    val IMPORT_COMPLETE                     = "IMPORT_COMPLETE"
    val IMPORT_FAILED                       = "IMPORT_FAILED"
    val IMPORT_FAILED_SERVER_LIMIT_EXCEEDED = "IMPORT_FAILED_SERVER_LIMIT_EXCEEDED"
    val IMPORT_FAILED_RECORD_LIMIT_EXCEEDED = "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED"
    val DELETE_IN_PROGRESS                  = "DELETE_IN_PROGRESS"
    val DELETE_COMPLETE                     = "DELETE_COMPLETE"
    val DELETE_FAILED                       = "DELETE_FAILED"
    val DELETE_FAILED_LIMIT_EXCEEDED        = "DELETE_FAILED_LIMIT_EXCEEDED"

    val values = IndexedSeq(
      IMPORT_IN_PROGRESS,
      IMPORT_COMPLETE,
      IMPORT_FAILED,
      IMPORT_FAILED_SERVER_LIMIT_EXCEEDED,
      IMPORT_FAILED_RECORD_LIMIT_EXCEEDED,
      DELETE_IN_PROGRESS,
      DELETE_COMPLETE,
      DELETE_FAILED,
      DELETE_FAILED_LIMIT_EXCEEDED
    )
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
      val _fields = IndexedSeq[(String, js.Any)](
        "applicationImportFailure" -> applicationImportFailure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "applicationImportSuccess" -> applicationImportSuccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "clientRequestToken" -> clientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorsAndFailedEntriesZip" -> errorsAndFailedEntriesZip.map { x =>
          x.asInstanceOf[js.Any]
        },
        "importCompletionTime" -> importCompletionTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "importDeletedTime" -> importDeletedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "importRequestTime" -> importRequestTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "importTaskId" -> importTaskId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "importUrl" -> importUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serverImportFailure" -> serverImportFailure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serverImportSuccess" -> serverImportSuccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportTask]
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
    def apply(
        name: js.UndefOr[ImportTaskFilterName] = js.undefined,
        values: js.UndefOr[ImportTaskFilterValueList] = js.undefined
    ): ImportTaskFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "values" -> values.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportTaskFilter]
    }
  }

  object ImportTaskFilterNameEnum {
    val IMPORT_TASK_ID = "IMPORT_TASK_ID"
    val STATUS         = "STATUS"
    val NAME           = "NAME"

    val values = IndexedSeq(IMPORT_TASK_ID, STATUS, NAME)
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
    def apply(
        configurationType: ConfigurationItemType,
        filters: js.UndefOr[Filters] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        orderBy: js.UndefOr[OrderByList] = js.undefined
    ): ListConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationType" -> configurationType.asInstanceOf[js.Any],
        "filters" -> filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "orderBy" -> orderBy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurations" -> configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationsResponse]
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
    def apply(
        configurationId: ConfigurationId,
        maxResults: js.UndefOr[Int] = js.undefined,
        neighborConfigurationIds: js.UndefOr[ConfigurationIdList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        portInformationNeeded: js.UndefOr[Boolean] = js.undefined
    ): ListServerNeighborsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "neighborConfigurationIds" -> neighborConfigurationIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "portInformationNeeded" -> portInformationNeeded.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServerNeighborsRequest]
    }
  }

  @js.native
  trait ListServerNeighborsResponse extends js.Object {
    var neighbors: NeighborDetailsList
    var knownDependencyCount: js.UndefOr[Double]
    var nextToken: js.UndefOr[String]
  }

  object ListServerNeighborsResponse {
    def apply(
        neighbors: NeighborDetailsList,
        knownDependencyCount: js.UndefOr[Double] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListServerNeighborsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "neighbors" -> neighbors.asInstanceOf[js.Any],
        "knownDependencyCount" -> knownDependencyCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServerNeighborsResponse]
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
    def apply(
        connectionsCount: Double,
        destinationServerId: ConfigurationId,
        sourceServerId: ConfigurationId,
        destinationPort: js.UndefOr[BoxedInteger] = js.undefined,
        transportProtocol: js.UndefOr[String] = js.undefined
    ): NeighborConnectionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionsCount"    -> connectionsCount.asInstanceOf[js.Any],
        "destinationServerId" -> destinationServerId.asInstanceOf[js.Any],
        "sourceServerId"      -> sourceServerId.asInstanceOf[js.Any],
        "destinationPort" -> destinationPort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "transportProtocol" -> transportProtocol.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NeighborConnectionDetail]
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
    def apply(
        fieldName: String,
        sortOrder: js.UndefOr[orderString] = js.undefined
    ): OrderByElement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fieldName" -> fieldName.asInstanceOf[js.Any],
        "sortOrder" -> sortOrder.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderByElement]
    }
  }

  @js.native
  trait StartContinuousExportRequest extends js.Object {}

  object StartContinuousExportRequest {
    def apply(
        ): StartContinuousExportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartContinuousExportRequest]
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
    def apply(
        dataSource: js.UndefOr[DataSource] = js.undefined,
        exportId: js.UndefOr[ConfigurationsExportId] = js.undefined,
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined
    ): StartContinuousExportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSource" -> dataSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "exportId" -> exportId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "s3Bucket" -> s3Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "schemaStorageConfig" -> schemaStorageConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startTime" -> startTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartContinuousExportResponse]
    }
  }

  @js.native
  trait StartDataCollectionByAgentIdsRequest extends js.Object {
    var agentIds: AgentIds
  }

  object StartDataCollectionByAgentIdsRequest {
    def apply(
        agentIds: AgentIds
    ): StartDataCollectionByAgentIdsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentIds" -> agentIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDataCollectionByAgentIdsRequest]
    }
  }

  @js.native
  trait StartDataCollectionByAgentIdsResponse extends js.Object {
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList]
  }

  object StartDataCollectionByAgentIdsResponse {
    def apply(
        agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined
    ): StartDataCollectionByAgentIdsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentsConfigurationStatus" -> agentsConfigurationStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDataCollectionByAgentIdsResponse]
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
    def apply(
        endTime: js.UndefOr[TimeStamp] = js.undefined,
        exportDataFormat: js.UndefOr[ExportDataFormats] = js.undefined,
        filters: js.UndefOr[ExportFilters] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined
    ): StartExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endTime" -> endTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "exportDataFormat" -> exportDataFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "filters" -> filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startTime" -> startTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartExportTaskRequest]
    }
  }

  @js.native
  trait StartExportTaskResponse extends js.Object {
    var exportId: js.UndefOr[ConfigurationsExportId]
  }

  object StartExportTaskResponse {
    def apply(
        exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
    ): StartExportTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId" -> exportId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartExportTaskResponse]
    }
  }

  @js.native
  trait StartImportTaskRequest extends js.Object {
    var importUrl: ImportURL
    var name: ImportTaskName
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object StartImportTaskRequest {
    def apply(
        importUrl: ImportURL,
        name: ImportTaskName,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): StartImportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "importUrl" -> importUrl.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "clientRequestToken" -> clientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartImportTaskRequest]
    }
  }

  @js.native
  trait StartImportTaskResponse extends js.Object {
    var task: js.UndefOr[ImportTask]
  }

  object StartImportTaskResponse {
    def apply(
        task: js.UndefOr[ImportTask] = js.undefined
    ): StartImportTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "task" -> task.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartImportTaskResponse]
    }
  }

  @js.native
  trait StopContinuousExportRequest extends js.Object {
    var exportId: ConfigurationsExportId
  }

  object StopContinuousExportRequest {
    def apply(
        exportId: ConfigurationsExportId
    ): StopContinuousExportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportId" -> exportId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        stopTime: js.UndefOr[TimeStamp] = js.undefined
    ): StopContinuousExportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stopTime" -> stopTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopContinuousExportResponse]
    }
  }

  @js.native
  trait StopDataCollectionByAgentIdsRequest extends js.Object {
    var agentIds: AgentIds
  }

  object StopDataCollectionByAgentIdsRequest {
    def apply(
        agentIds: AgentIds
    ): StopDataCollectionByAgentIdsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentIds" -> agentIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDataCollectionByAgentIdsRequest]
    }
  }

  @js.native
  trait StopDataCollectionByAgentIdsResponse extends js.Object {
    var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList]
  }

  object StopDataCollectionByAgentIdsResponse {
    def apply(
        agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.undefined
    ): StopDataCollectionByAgentIdsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "agentsConfigurationStatus" -> agentsConfigurationStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopDataCollectionByAgentIdsResponse]
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
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
    def apply(
        name: FilterName,
        values: FilterValues
    ): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name"   -> name.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var configurationId: ApplicationId
    var description: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  object UpdateApplicationRequest {
    def apply(
        configurationId: ApplicationId,
        description: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): UpdateApplicationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configurationId" -> configurationId.asInstanceOf[js.Any],
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {}

  object UpdateApplicationResponse {
    def apply(
        ): UpdateApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationResponse]
    }
  }

  object orderStringEnum {
    val ASC  = "ASC"
    val DESC = "DESC"

    val values = IndexedSeq(ASC, DESC)
  }
}
