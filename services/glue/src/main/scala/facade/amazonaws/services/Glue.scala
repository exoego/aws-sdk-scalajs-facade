package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object glue {
  type ActionList                              = js.Array[Action]
  type AttemptCount                            = Int
  type BatchDeletePartitionValueList           = js.Array[PartitionValueList]
  type BatchDeleteTableNameList                = js.Array[NameString]
  type BatchDeleteTableVersionList             = js.Array[VersionString]
  type BatchGetPartitionValueList              = js.Array[PartitionValueList]
  type BatchStopJobRunErrorList                = js.Array[BatchStopJobRunError]
  type BatchStopJobRunJobRunIdList             = js.Array[IdString]
  type BatchStopJobRunSuccessfulSubmissionList = js.Array[BatchStopJobRunSuccessfulSubmission]
  type BooleanNullable                         = Boolean
  type BooleanValue                            = Boolean
  type BoundedPartitionValueList               = js.Array[ValueString]
  type CatalogEncryptionMode                   = String
  type CatalogEntries                          = js.Array[CatalogEntry]
  type CatalogIdString                         = String
  type Classification                          = String
  type ClassifierList                          = js.Array[Classifier]
  type ClassifierNameList                      = js.Array[NameString]
  type CloudWatchEncryptionMode                = String
  type CodeGenArgName                          = String
  type CodeGenArgValue                         = String
  type CodeGenIdentifier                       = String
  type CodeGenNodeArgs                         = js.Array[CodeGenNodeArg]
  type CodeGenNodeType                         = String
  type ColumnList                              = js.Array[Column]
  type ColumnTypeString                        = String
  type ColumnValueStringList                   = js.Array[ColumnValuesString]
  type ColumnValuesString                      = String
  type CommentString                           = String
  type ConditionList                           = js.Array[Condition]
  type ConnectionList                          = js.Array[Connection]
  type ConnectionName                          = String
  type ConnectionProperties                    = js.Dictionary[ValueString]
  type ConnectionPropertyKey                   = String
  type ConnectionType                          = String
  type CrawlerConfiguration                    = String
  type CrawlerList                             = js.Array[Crawler]
  type CrawlerMetricsList                      = js.Array[CrawlerMetrics]
  type CrawlerNameList                         = js.Array[NameString]
  type CrawlerSecurityConfiguration            = String
  type CrawlerState                            = String
  type CronExpression                          = String
  type CsvColumnDelimiter                      = String
  type CsvHeader                               = js.Array[NameString]
  type CsvHeaderOption                         = String
  type CsvQuoteSymbol                          = String
  type CustomPatterns                          = String
  type DagEdges                                = js.Array[CodeGenEdge]
  type DagNodes                                = js.Array[CodeGenNode]
  type DatabaseList                            = js.Array[Database]
  type DatabaseName                            = String
  type DeleteBehavior                          = String
  type DeleteConnectionNameList                = js.Array[NameString]
  type DescriptionString                       = String
  type DescriptionStringRemovable              = String
  type DevEndpointList                         = js.Array[DevEndpoint]
  type DevEndpointNameList                     = js.Array[NameString]
  type DevEndpointNames                        = js.Array[GenericString]
  type DynamoDBTargetList                      = js.Array[DynamoDBTarget]
  type ErrorByName                             = js.Dictionary[ErrorDetail]
  type ErrorString                             = String
  type ExecutionTime                           = Int
  type ExistCondition                          = String
  type FieldType                               = String
  type FilterString                            = String
  type FormatString                            = String
  type GenericMap                              = js.Dictionary[GenericString]
  type GenericString                           = String
  type GetTableVersionsList                    = js.Array[TableVersion]
  type GlueResourceArn                         = String
  type GrokPattern                             = String
  type HashString                              = String
  type IdString                                = String
  type IntegerFlag                             = Int
  type IntegerValue                            = Int
  type JdbcTargetList                          = js.Array[JdbcTarget]
  type JobBookmarksEncryptionMode              = String
  type JobList                                 = js.Array[Job]
  type JobName                                 = String
  type JobNameList                             = js.Array[NameString]
  type JobRunList                              = js.Array[JobRun]
  type JobRunState                             = String
  type JsonPath                                = String
  type JsonValue                               = String
  type KeyString                               = String
  type KmsKeyArn                               = String
  type Language                                = String
  type LastCrawlStatus                         = String
  type LocationMap                             = js.Dictionary[ColumnValuesString]
  type LocationString                          = String
  type LogGroup                                = String
  type LogStream                               = String
  type Logical                                 = String
  type LogicalOperator                         = String
  type MapValue                                = js.Dictionary[GenericString]
  type MappingList                             = js.Array[MappingEntry]
  type MatchCriteria                           = js.Array[NameString]
  type MaxConcurrentRuns                       = Int
  type MaxRetries                              = Int
  type MessagePrefix                           = String
  type MillisecondsCount                       = Double
  type NameString                              = String
  type NameStringList                          = js.Array[NameString]
  type NonNegativeDouble                       = Double
  type NonNegativeInteger                      = Int
  type NotifyDelayAfter                        = Int
  type NullableBoolean                         = Boolean
  type NullableDouble                          = Double
  type NullableInteger                         = Int
  type OrderList                               = js.Array[Order]
  type PageSize                                = Int
  type ParametersMap                           = js.Dictionary[ParametersMapValue]
  type ParametersMapValue                      = String
  type PartitionErrors                         = js.Array[PartitionError]
  type PartitionInputList                      = js.Array[PartitionInput]
  type PartitionList                           = js.Array[Partition]
  type Path                                    = String
  type PathList                                = js.Array[Path]
  type PolicyJsonString                        = String
  type PredecessorList                         = js.Array[Predecessor]
  type PredicateString                         = String
  type PrincipalType                           = String
  type PublicKeysList                          = js.Array[GenericString]
  type PythonScript                            = String
  type ResourceType                            = String
  type ResourceUriList                         = js.Array[ResourceUri]
  type Role                                    = String
  type RoleArn                                 = String
  type RoleString                              = String
  type RowTag                                  = String
  type S3EncryptionList                        = js.Array[S3Encryption]
  type S3EncryptionMode                        = String
  type S3TargetList                            = js.Array[S3Target]
  type ScalaCode                               = String
  type ScheduleState                           = String
  type SchemaPathString                        = String
  type ScriptLocationString                    = String
  type SecurityConfigurationList               = js.Array[SecurityConfiguration]
  type SecurityGroupIdList                     = js.Array[NameString]
  type StringList                              = js.Array[GenericString]
  type TableErrors                             = js.Array[TableError]
  type TableList                               = js.Array[Table]
  type TableName                               = String
  type TablePrefix                             = String
  type TableTypeString                         = String
  type TableVersionErrors                      = js.Array[TableVersionError]
  type TagKey                                  = String
  type TagKeysList                             = js.Array[TagKey]
  type TagValue                                = String
  type TagsMap                                 = js.Dictionary[TagValue]
  type Timeout                                 = Int
  type Timestamp                               = js.Date
  type TimestampValue                          = js.Date
  type Token                                   = String
  type TotalSegmentsInteger                    = Int
  type TriggerList                             = js.Array[Trigger]
  type TriggerNameList                         = js.Array[NameString]
  type TriggerState                            = String
  type TriggerType                             = String
  type URI                                     = String
  type UpdateBehavior                          = String
  type UriString                               = String
  type UserDefinedFunctionList                 = js.Array[UserDefinedFunction]
  type ValueString                             = String
  type ValueStringList                         = js.Array[ValueString]
  type VersionId                               = Double
  type VersionString                           = String
  type ViewTextString                          = String
  type WorkerType                              = String

  implicit final class GlueOps(val service: Glue) extends AnyVal {

    def batchCreatePartitionFuture(params: BatchCreatePartitionRequest): Future[BatchCreatePartitionResponse] =
      service.batchCreatePartition(params).promise.toFuture
    def batchDeleteConnectionFuture(params: BatchDeleteConnectionRequest): Future[BatchDeleteConnectionResponse] =
      service.batchDeleteConnection(params).promise.toFuture
    def batchDeletePartitionFuture(params: BatchDeletePartitionRequest): Future[BatchDeletePartitionResponse] =
      service.batchDeletePartition(params).promise.toFuture
    def batchDeleteTableFuture(params: BatchDeleteTableRequest): Future[BatchDeleteTableResponse] =
      service.batchDeleteTable(params).promise.toFuture
    def batchDeleteTableVersionFuture(params: BatchDeleteTableVersionRequest): Future[BatchDeleteTableVersionResponse] =
      service.batchDeleteTableVersion(params).promise.toFuture
    def batchGetCrawlersFuture(params: BatchGetCrawlersRequest): Future[BatchGetCrawlersResponse] =
      service.batchGetCrawlers(params).promise.toFuture
    def batchGetDevEndpointsFuture(params: BatchGetDevEndpointsRequest): Future[BatchGetDevEndpointsResponse] =
      service.batchGetDevEndpoints(params).promise.toFuture
    def batchGetJobsFuture(params: BatchGetJobsRequest): Future[BatchGetJobsResponse] =
      service.batchGetJobs(params).promise.toFuture
    def batchGetPartitionFuture(params: BatchGetPartitionRequest): Future[BatchGetPartitionResponse] =
      service.batchGetPartition(params).promise.toFuture
    def batchGetTriggersFuture(params: BatchGetTriggersRequest): Future[BatchGetTriggersResponse] =
      service.batchGetTriggers(params).promise.toFuture
    def batchStopJobRunFuture(params: BatchStopJobRunRequest): Future[BatchStopJobRunResponse] =
      service.batchStopJobRun(params).promise.toFuture
    def createClassifierFuture(params: CreateClassifierRequest): Future[CreateClassifierResponse] =
      service.createClassifier(params).promise.toFuture
    def createConnectionFuture(params: CreateConnectionRequest): Future[CreateConnectionResponse] =
      service.createConnection(params).promise.toFuture
    def createCrawlerFuture(params: CreateCrawlerRequest): Future[CreateCrawlerResponse] =
      service.createCrawler(params).promise.toFuture
    def createDatabaseFuture(params: CreateDatabaseRequest): Future[CreateDatabaseResponse] =
      service.createDatabase(params).promise.toFuture
    def createDevEndpointFuture(params: CreateDevEndpointRequest): Future[CreateDevEndpointResponse] =
      service.createDevEndpoint(params).promise.toFuture
    def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise.toFuture
    def createPartitionFuture(params: CreatePartitionRequest): Future[CreatePartitionResponse] =
      service.createPartition(params).promise.toFuture
    def createScriptFuture(params: CreateScriptRequest): Future[CreateScriptResponse] =
      service.createScript(params).promise.toFuture
    def createSecurityConfigurationFuture(
        params: CreateSecurityConfigurationRequest
    ): Future[CreateSecurityConfigurationResponse] = service.createSecurityConfiguration(params).promise.toFuture
    def createTableFuture(params: CreateTableRequest): Future[CreateTableResponse] =
      service.createTable(params).promise.toFuture
    def createTriggerFuture(params: CreateTriggerRequest): Future[CreateTriggerResponse] =
      service.createTrigger(params).promise.toFuture
    def createUserDefinedFunctionFuture(
        params: CreateUserDefinedFunctionRequest
    ): Future[CreateUserDefinedFunctionResponse] = service.createUserDefinedFunction(params).promise.toFuture
    def deleteClassifierFuture(params: DeleteClassifierRequest): Future[DeleteClassifierResponse] =
      service.deleteClassifier(params).promise.toFuture
    def deleteConnectionFuture(params: DeleteConnectionRequest): Future[DeleteConnectionResponse] =
      service.deleteConnection(params).promise.toFuture
    def deleteCrawlerFuture(params: DeleteCrawlerRequest): Future[DeleteCrawlerResponse] =
      service.deleteCrawler(params).promise.toFuture
    def deleteDatabaseFuture(params: DeleteDatabaseRequest): Future[DeleteDatabaseResponse] =
      service.deleteDatabase(params).promise.toFuture
    def deleteDevEndpointFuture(params: DeleteDevEndpointRequest): Future[DeleteDevEndpointResponse] =
      service.deleteDevEndpoint(params).promise.toFuture
    def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResponse] =
      service.deleteJob(params).promise.toFuture
    def deletePartitionFuture(params: DeletePartitionRequest): Future[DeletePartitionResponse] =
      service.deletePartition(params).promise.toFuture
    def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] =
      service.deleteResourcePolicy(params).promise.toFuture
    def deleteSecurityConfigurationFuture(
        params: DeleteSecurityConfigurationRequest
    ): Future[DeleteSecurityConfigurationResponse] = service.deleteSecurityConfiguration(params).promise.toFuture
    def deleteTableFuture(params: DeleteTableRequest): Future[DeleteTableResponse] =
      service.deleteTable(params).promise.toFuture
    def deleteTableVersionFuture(params: DeleteTableVersionRequest): Future[DeleteTableVersionResponse] =
      service.deleteTableVersion(params).promise.toFuture
    def deleteTriggerFuture(params: DeleteTriggerRequest): Future[DeleteTriggerResponse] =
      service.deleteTrigger(params).promise.toFuture
    def deleteUserDefinedFunctionFuture(
        params: DeleteUserDefinedFunctionRequest
    ): Future[DeleteUserDefinedFunctionResponse] = service.deleteUserDefinedFunction(params).promise.toFuture
    def getCatalogImportStatusFuture(params: GetCatalogImportStatusRequest): Future[GetCatalogImportStatusResponse] =
      service.getCatalogImportStatus(params).promise.toFuture
    def getClassifierFuture(params: GetClassifierRequest): Future[GetClassifierResponse] =
      service.getClassifier(params).promise.toFuture
    def getClassifiersFuture(params: GetClassifiersRequest): Future[GetClassifiersResponse] =
      service.getClassifiers(params).promise.toFuture
    def getConnectionFuture(params: GetConnectionRequest): Future[GetConnectionResponse] =
      service.getConnection(params).promise.toFuture
    def getConnectionsFuture(params: GetConnectionsRequest): Future[GetConnectionsResponse] =
      service.getConnections(params).promise.toFuture
    def getCrawlerFuture(params: GetCrawlerRequest): Future[GetCrawlerResponse] =
      service.getCrawler(params).promise.toFuture
    def getCrawlerMetricsFuture(params: GetCrawlerMetricsRequest): Future[GetCrawlerMetricsResponse] =
      service.getCrawlerMetrics(params).promise.toFuture
    def getCrawlersFuture(params: GetCrawlersRequest): Future[GetCrawlersResponse] =
      service.getCrawlers(params).promise.toFuture
    def getDataCatalogEncryptionSettingsFuture(
        params: GetDataCatalogEncryptionSettingsRequest
    ): Future[GetDataCatalogEncryptionSettingsResponse] =
      service.getDataCatalogEncryptionSettings(params).promise.toFuture
    def getDatabaseFuture(params: GetDatabaseRequest): Future[GetDatabaseResponse] =
      service.getDatabase(params).promise.toFuture
    def getDatabasesFuture(params: GetDatabasesRequest): Future[GetDatabasesResponse] =
      service.getDatabases(params).promise.toFuture
    def getDataflowGraphFuture(params: GetDataflowGraphRequest): Future[GetDataflowGraphResponse] =
      service.getDataflowGraph(params).promise.toFuture
    def getDevEndpointFuture(params: GetDevEndpointRequest): Future[GetDevEndpointResponse] =
      service.getDevEndpoint(params).promise.toFuture
    def getDevEndpointsFuture(params: GetDevEndpointsRequest): Future[GetDevEndpointsResponse] =
      service.getDevEndpoints(params).promise.toFuture
    def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise.toFuture
    def getJobRunFuture(params: GetJobRunRequest): Future[GetJobRunResponse] =
      service.getJobRun(params).promise.toFuture
    def getJobRunsFuture(params: GetJobRunsRequest): Future[GetJobRunsResponse] =
      service.getJobRuns(params).promise.toFuture
    def getJobsFuture(params: GetJobsRequest): Future[GetJobsResponse] = service.getJobs(params).promise.toFuture
    def getMappingFuture(params: GetMappingRequest): Future[GetMappingResponse] =
      service.getMapping(params).promise.toFuture
    def getPartitionFuture(params: GetPartitionRequest): Future[GetPartitionResponse] =
      service.getPartition(params).promise.toFuture
    def getPartitionsFuture(params: GetPartitionsRequest): Future[GetPartitionsResponse] =
      service.getPartitions(params).promise.toFuture
    def getPlanFuture(params: GetPlanRequest): Future[GetPlanResponse] = service.getPlan(params).promise.toFuture
    def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] =
      service.getResourcePolicy(params).promise.toFuture
    def getSecurityConfigurationFuture(
        params: GetSecurityConfigurationRequest
    ): Future[GetSecurityConfigurationResponse] = service.getSecurityConfiguration(params).promise.toFuture
    def getSecurityConfigurationsFuture(
        params: GetSecurityConfigurationsRequest
    ): Future[GetSecurityConfigurationsResponse]                          = service.getSecurityConfigurations(params).promise.toFuture
    def getTableFuture(params: GetTableRequest): Future[GetTableResponse] = service.getTable(params).promise.toFuture
    def getTableVersionFuture(params: GetTableVersionRequest): Future[GetTableVersionResponse] =
      service.getTableVersion(params).promise.toFuture
    def getTableVersionsFuture(params: GetTableVersionsRequest): Future[GetTableVersionsResponse] =
      service.getTableVersions(params).promise.toFuture
    def getTablesFuture(params: GetTablesRequest): Future[GetTablesResponse] =
      service.getTables(params).promise.toFuture
    def getTagsFuture(params: GetTagsRequest): Future[GetTagsResponse] = service.getTags(params).promise.toFuture
    def getTriggerFuture(params: GetTriggerRequest): Future[GetTriggerResponse] =
      service.getTrigger(params).promise.toFuture
    def getTriggersFuture(params: GetTriggersRequest): Future[GetTriggersResponse] =
      service.getTriggers(params).promise.toFuture
    def getUserDefinedFunctionFuture(params: GetUserDefinedFunctionRequest): Future[GetUserDefinedFunctionResponse] =
      service.getUserDefinedFunction(params).promise.toFuture
    def getUserDefinedFunctionsFuture(params: GetUserDefinedFunctionsRequest): Future[GetUserDefinedFunctionsResponse] =
      service.getUserDefinedFunctions(params).promise.toFuture
    def importCatalogToGlueFuture(params: ImportCatalogToGlueRequest): Future[ImportCatalogToGlueResponse] =
      service.importCatalogToGlue(params).promise.toFuture
    def listCrawlersFuture(params: ListCrawlersRequest): Future[ListCrawlersResponse] =
      service.listCrawlers(params).promise.toFuture
    def listDevEndpointsFuture(params: ListDevEndpointsRequest): Future[ListDevEndpointsResponse] =
      service.listDevEndpoints(params).promise.toFuture
    def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] = service.listJobs(params).promise.toFuture
    def listTriggersFuture(params: ListTriggersRequest): Future[ListTriggersResponse] =
      service.listTriggers(params).promise.toFuture
    def putDataCatalogEncryptionSettingsFuture(
        params: PutDataCatalogEncryptionSettingsRequest
    ): Future[PutDataCatalogEncryptionSettingsResponse] =
      service.putDataCatalogEncryptionSettings(params).promise.toFuture
    def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] =
      service.putResourcePolicy(params).promise.toFuture
    def resetJobBookmarkFuture(params: ResetJobBookmarkRequest): Future[ResetJobBookmarkResponse] =
      service.resetJobBookmark(params).promise.toFuture
    def startCrawlerFuture(params: StartCrawlerRequest): Future[StartCrawlerResponse] =
      service.startCrawler(params).promise.toFuture
    def startCrawlerScheduleFuture(params: StartCrawlerScheduleRequest): Future[StartCrawlerScheduleResponse] =
      service.startCrawlerSchedule(params).promise.toFuture
    def startJobRunFuture(params: StartJobRunRequest): Future[StartJobRunResponse] =
      service.startJobRun(params).promise.toFuture
    def startTriggerFuture(params: StartTriggerRequest): Future[StartTriggerResponse] =
      service.startTrigger(params).promise.toFuture
    def stopCrawlerFuture(params: StopCrawlerRequest): Future[StopCrawlerResponse] =
      service.stopCrawler(params).promise.toFuture
    def stopCrawlerScheduleFuture(params: StopCrawlerScheduleRequest): Future[StopCrawlerScheduleResponse] =
      service.stopCrawlerSchedule(params).promise.toFuture
    def stopTriggerFuture(params: StopTriggerRequest): Future[StopTriggerResponse] =
      service.stopTrigger(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateClassifierFuture(params: UpdateClassifierRequest): Future[UpdateClassifierResponse] =
      service.updateClassifier(params).promise.toFuture
    def updateConnectionFuture(params: UpdateConnectionRequest): Future[UpdateConnectionResponse] =
      service.updateConnection(params).promise.toFuture
    def updateCrawlerFuture(params: UpdateCrawlerRequest): Future[UpdateCrawlerResponse] =
      service.updateCrawler(params).promise.toFuture
    def updateCrawlerScheduleFuture(params: UpdateCrawlerScheduleRequest): Future[UpdateCrawlerScheduleResponse] =
      service.updateCrawlerSchedule(params).promise.toFuture
    def updateDatabaseFuture(params: UpdateDatabaseRequest): Future[UpdateDatabaseResponse] =
      service.updateDatabase(params).promise.toFuture
    def updateDevEndpointFuture(params: UpdateDevEndpointRequest): Future[UpdateDevEndpointResponse] =
      service.updateDevEndpoint(params).promise.toFuture
    def updateJobFuture(params: UpdateJobRequest): Future[UpdateJobResponse] =
      service.updateJob(params).promise.toFuture
    def updatePartitionFuture(params: UpdatePartitionRequest): Future[UpdatePartitionResponse] =
      service.updatePartition(params).promise.toFuture
    def updateTableFuture(params: UpdateTableRequest): Future[UpdateTableResponse] =
      service.updateTable(params).promise.toFuture
    def updateTriggerFuture(params: UpdateTriggerRequest): Future[UpdateTriggerResponse] =
      service.updateTrigger(params).promise.toFuture
    def updateUserDefinedFunctionFuture(
        params: UpdateUserDefinedFunctionRequest
    ): Future[UpdateUserDefinedFunctionResponse] = service.updateUserDefinedFunction(params).promise.toFuture
  }
}

package glue {
  @js.native
  @JSImport("aws-sdk", "Glue")
  class Glue() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCreatePartition(params: BatchCreatePartitionRequest): Request[BatchCreatePartitionResponse]    = js.native
    def batchDeleteConnection(params: BatchDeleteConnectionRequest): Request[BatchDeleteConnectionResponse] = js.native
    def batchDeletePartition(params: BatchDeletePartitionRequest): Request[BatchDeletePartitionResponse]    = js.native
    def batchDeleteTable(params: BatchDeleteTableRequest): Request[BatchDeleteTableResponse]                = js.native
    def batchDeleteTableVersion(params: BatchDeleteTableVersionRequest): Request[BatchDeleteTableVersionResponse] =
      js.native
    def batchGetCrawlers(params: BatchGetCrawlersRequest): Request[BatchGetCrawlersResponse]             = js.native
    def batchGetDevEndpoints(params: BatchGetDevEndpointsRequest): Request[BatchGetDevEndpointsResponse] = js.native
    def batchGetJobs(params: BatchGetJobsRequest): Request[BatchGetJobsResponse]                         = js.native
    def batchGetPartition(params: BatchGetPartitionRequest): Request[BatchGetPartitionResponse]          = js.native
    def batchGetTriggers(params: BatchGetTriggersRequest): Request[BatchGetTriggersResponse]             = js.native
    def batchStopJobRun(params: BatchStopJobRunRequest): Request[BatchStopJobRunResponse]                = js.native
    def createClassifier(params: CreateClassifierRequest): Request[CreateClassifierResponse]             = js.native
    def createConnection(params: CreateConnectionRequest): Request[CreateConnectionResponse]             = js.native
    def createCrawler(params: CreateCrawlerRequest): Request[CreateCrawlerResponse]                      = js.native
    def createDatabase(params: CreateDatabaseRequest): Request[CreateDatabaseResponse]                   = js.native
    def createDevEndpoint(params: CreateDevEndpointRequest): Request[CreateDevEndpointResponse]          = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse]                                  = js.native
    def createPartition(params: CreatePartitionRequest): Request[CreatePartitionResponse]                = js.native
    def createScript(params: CreateScriptRequest): Request[CreateScriptResponse]                         = js.native
    def createSecurityConfiguration(
        params: CreateSecurityConfigurationRequest
    ): Request[CreateSecurityConfigurationResponse]                                 = js.native
    def createTable(params: CreateTableRequest): Request[CreateTableResponse]       = js.native
    def createTrigger(params: CreateTriggerRequest): Request[CreateTriggerResponse] = js.native
    def createUserDefinedFunction(
        params: CreateUserDefinedFunctionRequest
    ): Request[CreateUserDefinedFunctionResponse]                                                        = js.native
    def deleteClassifier(params: DeleteClassifierRequest): Request[DeleteClassifierResponse]             = js.native
    def deleteConnection(params: DeleteConnectionRequest): Request[DeleteConnectionResponse]             = js.native
    def deleteCrawler(params: DeleteCrawlerRequest): Request[DeleteCrawlerResponse]                      = js.native
    def deleteDatabase(params: DeleteDatabaseRequest): Request[DeleteDatabaseResponse]                   = js.native
    def deleteDevEndpoint(params: DeleteDevEndpointRequest): Request[DeleteDevEndpointResponse]          = js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse]                                  = js.native
    def deletePartition(params: DeletePartitionRequest): Request[DeletePartitionResponse]                = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse] = js.native
    def deleteSecurityConfiguration(
        params: DeleteSecurityConfigurationRequest
    ): Request[DeleteSecurityConfigurationResponse]                                                = js.native
    def deleteTable(params: DeleteTableRequest): Request[DeleteTableResponse]                      = js.native
    def deleteTableVersion(params: DeleteTableVersionRequest): Request[DeleteTableVersionResponse] = js.native
    def deleteTrigger(params: DeleteTriggerRequest): Request[DeleteTriggerResponse]                = js.native
    def deleteUserDefinedFunction(
        params: DeleteUserDefinedFunctionRequest
    ): Request[DeleteUserDefinedFunctionResponse] = js.native
    def getCatalogImportStatus(params: GetCatalogImportStatusRequest): Request[GetCatalogImportStatusResponse] =
      js.native
    def getClassifier(params: GetClassifierRequest): Request[GetClassifierResponse]             = js.native
    def getClassifiers(params: GetClassifiersRequest): Request[GetClassifiersResponse]          = js.native
    def getConnection(params: GetConnectionRequest): Request[GetConnectionResponse]             = js.native
    def getConnections(params: GetConnectionsRequest): Request[GetConnectionsResponse]          = js.native
    def getCrawler(params: GetCrawlerRequest): Request[GetCrawlerResponse]                      = js.native
    def getCrawlerMetrics(params: GetCrawlerMetricsRequest): Request[GetCrawlerMetricsResponse] = js.native
    def getCrawlers(params: GetCrawlersRequest): Request[GetCrawlersResponse]                   = js.native
    def getDataCatalogEncryptionSettings(
        params: GetDataCatalogEncryptionSettingsRequest
    ): Request[GetDataCatalogEncryptionSettingsResponse]                                        = js.native
    def getDatabase(params: GetDatabaseRequest): Request[GetDatabaseResponse]                   = js.native
    def getDatabases(params: GetDatabasesRequest): Request[GetDatabasesResponse]                = js.native
    def getDataflowGraph(params: GetDataflowGraphRequest): Request[GetDataflowGraphResponse]    = js.native
    def getDevEndpoint(params: GetDevEndpointRequest): Request[GetDevEndpointResponse]          = js.native
    def getDevEndpoints(params: GetDevEndpointsRequest): Request[GetDevEndpointsResponse]       = js.native
    def getJob(params: GetJobRequest): Request[GetJobResponse]                                  = js.native
    def getJobRun(params: GetJobRunRequest): Request[GetJobRunResponse]                         = js.native
    def getJobRuns(params: GetJobRunsRequest): Request[GetJobRunsResponse]                      = js.native
    def getJobs(params: GetJobsRequest): Request[GetJobsResponse]                               = js.native
    def getMapping(params: GetMappingRequest): Request[GetMappingResponse]                      = js.native
    def getPartition(params: GetPartitionRequest): Request[GetPartitionResponse]                = js.native
    def getPartitions(params: GetPartitionsRequest): Request[GetPartitionsResponse]             = js.native
    def getPlan(params: GetPlanRequest): Request[GetPlanResponse]                               = js.native
    def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse] = js.native
    def getSecurityConfiguration(params: GetSecurityConfigurationRequest): Request[GetSecurityConfigurationResponse] =
      js.native
    def getSecurityConfigurations(
        params: GetSecurityConfigurationsRequest
    ): Request[GetSecurityConfigurationsResponse]                                            = js.native
    def getTable(params: GetTableRequest): Request[GetTableResponse]                         = js.native
    def getTableVersion(params: GetTableVersionRequest): Request[GetTableVersionResponse]    = js.native
    def getTableVersions(params: GetTableVersionsRequest): Request[GetTableVersionsResponse] = js.native
    def getTables(params: GetTablesRequest): Request[GetTablesResponse]                      = js.native
    def getTags(params: GetTagsRequest): Request[GetTagsResponse]                            = js.native
    def getTrigger(params: GetTriggerRequest): Request[GetTriggerResponse]                   = js.native
    def getTriggers(params: GetTriggersRequest): Request[GetTriggersResponse]                = js.native
    def getUserDefinedFunction(params: GetUserDefinedFunctionRequest): Request[GetUserDefinedFunctionResponse] =
      js.native
    def getUserDefinedFunctions(params: GetUserDefinedFunctionsRequest): Request[GetUserDefinedFunctionsResponse] =
      js.native
    def importCatalogToGlue(params: ImportCatalogToGlueRequest): Request[ImportCatalogToGlueResponse] = js.native
    def listCrawlers(params: ListCrawlersRequest): Request[ListCrawlersResponse]                      = js.native
    def listDevEndpoints(params: ListDevEndpointsRequest): Request[ListDevEndpointsResponse]          = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse]                                  = js.native
    def listTriggers(params: ListTriggersRequest): Request[ListTriggersResponse]                      = js.native
    def putDataCatalogEncryptionSettings(
        params: PutDataCatalogEncryptionSettingsRequest
    ): Request[PutDataCatalogEncryptionSettingsResponse]                                                    = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse]             = js.native
    def resetJobBookmark(params: ResetJobBookmarkRequest): Request[ResetJobBookmarkResponse]                = js.native
    def startCrawler(params: StartCrawlerRequest): Request[StartCrawlerResponse]                            = js.native
    def startCrawlerSchedule(params: StartCrawlerScheduleRequest): Request[StartCrawlerScheduleResponse]    = js.native
    def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse]                               = js.native
    def startTrigger(params: StartTriggerRequest): Request[StartTriggerResponse]                            = js.native
    def stopCrawler(params: StopCrawlerRequest): Request[StopCrawlerResponse]                               = js.native
    def stopCrawlerSchedule(params: StopCrawlerScheduleRequest): Request[StopCrawlerScheduleResponse]       = js.native
    def stopTrigger(params: StopTriggerRequest): Request[StopTriggerResponse]                               = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateClassifier(params: UpdateClassifierRequest): Request[UpdateClassifierResponse]                = js.native
    def updateConnection(params: UpdateConnectionRequest): Request[UpdateConnectionResponse]                = js.native
    def updateCrawler(params: UpdateCrawlerRequest): Request[UpdateCrawlerResponse]                         = js.native
    def updateCrawlerSchedule(params: UpdateCrawlerScheduleRequest): Request[UpdateCrawlerScheduleResponse] = js.native
    def updateDatabase(params: UpdateDatabaseRequest): Request[UpdateDatabaseResponse]                      = js.native
    def updateDevEndpoint(params: UpdateDevEndpointRequest): Request[UpdateDevEndpointResponse]             = js.native
    def updateJob(params: UpdateJobRequest): Request[UpdateJobResponse]                                     = js.native
    def updatePartition(params: UpdatePartitionRequest): Request[UpdatePartitionResponse]                   = js.native
    def updateTable(params: UpdateTableRequest): Request[UpdateTableResponse]                               = js.native
    def updateTrigger(params: UpdateTriggerRequest): Request[UpdateTriggerResponse]                         = js.native
    def updateUserDefinedFunction(
        params: UpdateUserDefinedFunctionRequest
    ): Request[UpdateUserDefinedFunctionResponse] = js.native
  }

  /**
    * Defines an action to be initiated by a trigger.
    */
  @js.native
  trait Action extends js.Object {
    var Arguments: js.UndefOr[GenericMap]
    var JobName: js.UndefOr[NameString]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Timeout: js.UndefOr[Timeout]
  }

  object Action {
    def apply(
        Arguments: js.UndefOr[GenericMap] = js.undefined,
        JobName: js.UndefOr[NameString] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined
    ): Action = {
      val __obj = js.Dictionary.empty[js.Any]
      Arguments.foreach(__v => __obj.update("Arguments", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.update("NotificationProperty", __v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.update("Timeout", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  @js.native
  trait BatchCreatePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionInputList: PartitionInputList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchCreatePartitionRequest {
    def apply(
        DatabaseName: NameString,
        PartitionInputList: PartitionInputList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchCreatePartitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"       -> DatabaseName.asInstanceOf[js.Any],
        "PartitionInputList" -> PartitionInputList.asInstanceOf[js.Any],
        "TableName"          -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreatePartitionRequest]
    }
  }

  @js.native
  trait BatchCreatePartitionResponse extends js.Object {
    var Errors: js.UndefOr[PartitionErrors]
  }

  object BatchCreatePartitionResponse {
    def apply(
        Errors: js.UndefOr[PartitionErrors] = js.undefined
    ): BatchCreatePartitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Errors.foreach(__v => __obj.update("Errors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreatePartitionResponse]
    }
  }

  @js.native
  trait BatchDeleteConnectionRequest extends js.Object {
    var ConnectionNameList: DeleteConnectionNameList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchDeleteConnectionRequest {
    def apply(
        ConnectionNameList: DeleteConnectionNameList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchDeleteConnectionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConnectionNameList" -> ConnectionNameList.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteConnectionRequest]
    }
  }

  @js.native
  trait BatchDeleteConnectionResponse extends js.Object {
    var Errors: js.UndefOr[ErrorByName]
    var Succeeded: js.UndefOr[NameStringList]
  }

  object BatchDeleteConnectionResponse {
    def apply(
        Errors: js.UndefOr[ErrorByName] = js.undefined,
        Succeeded: js.UndefOr[NameStringList] = js.undefined
    ): BatchDeleteConnectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Errors.foreach(__v => __obj.update("Errors", __v.asInstanceOf[js.Any]))
      Succeeded.foreach(__v => __obj.update("Succeeded", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteConnectionResponse]
    }
  }

  @js.native
  trait BatchDeletePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionsToDelete: BatchDeletePartitionValueList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchDeletePartitionRequest {
    def apply(
        DatabaseName: NameString,
        PartitionsToDelete: BatchDeletePartitionValueList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchDeletePartitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"       -> DatabaseName.asInstanceOf[js.Any],
        "PartitionsToDelete" -> PartitionsToDelete.asInstanceOf[js.Any],
        "TableName"          -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeletePartitionRequest]
    }
  }

  @js.native
  trait BatchDeletePartitionResponse extends js.Object {
    var Errors: js.UndefOr[PartitionErrors]
  }

  object BatchDeletePartitionResponse {
    def apply(
        Errors: js.UndefOr[PartitionErrors] = js.undefined
    ): BatchDeletePartitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Errors.foreach(__v => __obj.update("Errors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeletePartitionResponse]
    }
  }

  @js.native
  trait BatchDeleteTableRequest extends js.Object {
    var DatabaseName: NameString
    var TablesToDelete: BatchDeleteTableNameList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchDeleteTableRequest {
    def apply(
        DatabaseName: NameString,
        TablesToDelete: BatchDeleteTableNameList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchDeleteTableRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"   -> DatabaseName.asInstanceOf[js.Any],
        "TablesToDelete" -> TablesToDelete.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteTableRequest]
    }
  }

  @js.native
  trait BatchDeleteTableResponse extends js.Object {
    var Errors: js.UndefOr[TableErrors]
  }

  object BatchDeleteTableResponse {
    def apply(
        Errors: js.UndefOr[TableErrors] = js.undefined
    ): BatchDeleteTableResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Errors.foreach(__v => __obj.update("Errors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteTableResponse]
    }
  }

  @js.native
  trait BatchDeleteTableVersionRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var VersionIds: BatchDeleteTableVersionList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchDeleteTableVersionRequest {
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        VersionIds: BatchDeleteTableVersionList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchDeleteTableVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any],
        "VersionIds"   -> VersionIds.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteTableVersionRequest]
    }
  }

  @js.native
  trait BatchDeleteTableVersionResponse extends js.Object {
    var Errors: js.UndefOr[TableVersionErrors]
  }

  object BatchDeleteTableVersionResponse {
    def apply(
        Errors: js.UndefOr[TableVersionErrors] = js.undefined
    ): BatchDeleteTableVersionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Errors.foreach(__v => __obj.update("Errors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteTableVersionResponse]
    }
  }

  @js.native
  trait BatchGetCrawlersRequest extends js.Object {
    var CrawlerNames: CrawlerNameList
  }

  object BatchGetCrawlersRequest {
    def apply(
        CrawlerNames: CrawlerNameList
    ): BatchGetCrawlersRequest = {
      val __obj = js.Dictionary[js.Any](
        "CrawlerNames" -> CrawlerNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetCrawlersRequest]
    }
  }

  @js.native
  trait BatchGetCrawlersResponse extends js.Object {
    var Crawlers: js.UndefOr[CrawlerList]
    var CrawlersNotFound: js.UndefOr[CrawlerNameList]
  }

  object BatchGetCrawlersResponse {
    def apply(
        Crawlers: js.UndefOr[CrawlerList] = js.undefined,
        CrawlersNotFound: js.UndefOr[CrawlerNameList] = js.undefined
    ): BatchGetCrawlersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Crawlers.foreach(__v => __obj.update("Crawlers", __v.asInstanceOf[js.Any]))
      CrawlersNotFound.foreach(__v => __obj.update("CrawlersNotFound", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetCrawlersResponse]
    }
  }

  @js.native
  trait BatchGetDevEndpointsRequest extends js.Object {
    var DevEndpointNames: DevEndpointNames
  }

  object BatchGetDevEndpointsRequest {
    def apply(
        DevEndpointNames: DevEndpointNames
    ): BatchGetDevEndpointsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DevEndpointNames" -> DevEndpointNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetDevEndpointsRequest]
    }
  }

  @js.native
  trait BatchGetDevEndpointsResponse extends js.Object {
    var DevEndpoints: js.UndefOr[DevEndpointList]
    var DevEndpointsNotFound: js.UndefOr[DevEndpointNames]
  }

  object BatchGetDevEndpointsResponse {
    def apply(
        DevEndpoints: js.UndefOr[DevEndpointList] = js.undefined,
        DevEndpointsNotFound: js.UndefOr[DevEndpointNames] = js.undefined
    ): BatchGetDevEndpointsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DevEndpoints.foreach(__v => __obj.update("DevEndpoints", __v.asInstanceOf[js.Any]))
      DevEndpointsNotFound.foreach(__v => __obj.update("DevEndpointsNotFound", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetDevEndpointsResponse]
    }
  }

  @js.native
  trait BatchGetJobsRequest extends js.Object {
    var JobNames: JobNameList
  }

  object BatchGetJobsRequest {
    def apply(
        JobNames: JobNameList
    ): BatchGetJobsRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobNames" -> JobNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetJobsRequest]
    }
  }

  @js.native
  trait BatchGetJobsResponse extends js.Object {
    var Jobs: js.UndefOr[JobList]
    var JobsNotFound: js.UndefOr[JobNameList]
  }

  object BatchGetJobsResponse {
    def apply(
        Jobs: js.UndefOr[JobList] = js.undefined,
        JobsNotFound: js.UndefOr[JobNameList] = js.undefined
    ): BatchGetJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Jobs.foreach(__v => __obj.update("Jobs", __v.asInstanceOf[js.Any]))
      JobsNotFound.foreach(__v => __obj.update("JobsNotFound", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetJobsResponse]
    }
  }

  @js.native
  trait BatchGetPartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionsToGet: BatchGetPartitionValueList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchGetPartitionRequest {
    def apply(
        DatabaseName: NameString,
        PartitionsToGet: BatchGetPartitionValueList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchGetPartitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"    -> DatabaseName.asInstanceOf[js.Any],
        "PartitionsToGet" -> PartitionsToGet.asInstanceOf[js.Any],
        "TableName"       -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetPartitionRequest]
    }
  }

  @js.native
  trait BatchGetPartitionResponse extends js.Object {
    var Partitions: js.UndefOr[PartitionList]
    var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList]
  }

  object BatchGetPartitionResponse {
    def apply(
        Partitions: js.UndefOr[PartitionList] = js.undefined,
        UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList] = js.undefined
    ): BatchGetPartitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Partitions.foreach(__v => __obj.update("Partitions", __v.asInstanceOf[js.Any]))
      UnprocessedKeys.foreach(__v => __obj.update("UnprocessedKeys", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetPartitionResponse]
    }
  }

  @js.native
  trait BatchGetTriggersRequest extends js.Object {
    var TriggerNames: TriggerNameList
  }

  object BatchGetTriggersRequest {
    def apply(
        TriggerNames: TriggerNameList
    ): BatchGetTriggersRequest = {
      val __obj = js.Dictionary[js.Any](
        "TriggerNames" -> TriggerNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetTriggersRequest]
    }
  }

  @js.native
  trait BatchGetTriggersResponse extends js.Object {
    var Triggers: js.UndefOr[TriggerList]
    var TriggersNotFound: js.UndefOr[TriggerNameList]
  }

  object BatchGetTriggersResponse {
    def apply(
        Triggers: js.UndefOr[TriggerList] = js.undefined,
        TriggersNotFound: js.UndefOr[TriggerNameList] = js.undefined
    ): BatchGetTriggersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Triggers.foreach(__v => __obj.update("Triggers", __v.asInstanceOf[js.Any]))
      TriggersNotFound.foreach(__v => __obj.update("TriggersNotFound", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetTriggersResponse]
    }
  }

  /**
    * Records an error that occurred when attempting to stop a specified job run.
    */
  @js.native
  trait BatchStopJobRunError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var JobName: js.UndefOr[NameString]
    var JobRunId: js.UndefOr[IdString]
  }

  object BatchStopJobRunError {
    def apply(
        ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined,
        JobName: js.UndefOr[NameString] = js.undefined,
        JobRunId: js.UndefOr[IdString] = js.undefined
    ): BatchStopJobRunError = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorDetail.foreach(__v => __obj.update("ErrorDetail", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobRunId.foreach(__v => __obj.update("JobRunId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchStopJobRunError]
    }
  }

  @js.native
  trait BatchStopJobRunRequest extends js.Object {
    var JobName: NameString
    var JobRunIds: BatchStopJobRunJobRunIdList
  }

  object BatchStopJobRunRequest {
    def apply(
        JobName: NameString,
        JobRunIds: BatchStopJobRunJobRunIdList
    ): BatchStopJobRunRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobName"   -> JobName.asInstanceOf[js.Any],
        "JobRunIds" -> JobRunIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchStopJobRunRequest]
    }
  }

  @js.native
  trait BatchStopJobRunResponse extends js.Object {
    var Errors: js.UndefOr[BatchStopJobRunErrorList]
    var SuccessfulSubmissions: js.UndefOr[BatchStopJobRunSuccessfulSubmissionList]
  }

  object BatchStopJobRunResponse {
    def apply(
        Errors: js.UndefOr[BatchStopJobRunErrorList] = js.undefined,
        SuccessfulSubmissions: js.UndefOr[BatchStopJobRunSuccessfulSubmissionList] = js.undefined
    ): BatchStopJobRunResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Errors.foreach(__v => __obj.update("Errors", __v.asInstanceOf[js.Any]))
      SuccessfulSubmissions.foreach(__v => __obj.update("SuccessfulSubmissions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchStopJobRunResponse]
    }
  }

  /**
    * Records a successful request to stop a specified JobRun.
    */
  @js.native
  trait BatchStopJobRunSuccessfulSubmission extends js.Object {
    var JobName: js.UndefOr[NameString]
    var JobRunId: js.UndefOr[IdString]
  }

  object BatchStopJobRunSuccessfulSubmission {
    def apply(
        JobName: js.UndefOr[NameString] = js.undefined,
        JobRunId: js.UndefOr[IdString] = js.undefined
    ): BatchStopJobRunSuccessfulSubmission = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobRunId.foreach(__v => __obj.update("JobRunId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchStopJobRunSuccessfulSubmission]
    }
  }

  object CatalogEncryptionModeEnum {
    val DISABLED  = "DISABLED"
    val `SSE-KMS` = "SSE-KMS"

    val values = IndexedSeq(DISABLED, `SSE-KMS`)
  }

  /**
    * Specifies a table definition in the Data Catalog.
    */
  @js.native
  trait CatalogEntry extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
  }

  object CatalogEntry {
    def apply(
        DatabaseName: NameString,
        TableName: NameString
    ): CatalogEntry = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CatalogEntry]
    }
  }

  /**
    * A structure containing migration status information.
    */
  @js.native
  trait CatalogImportStatus extends js.Object {
    var ImportCompleted: js.UndefOr[Boolean]
    var ImportTime: js.UndefOr[Timestamp]
    var ImportedBy: js.UndefOr[NameString]
  }

  object CatalogImportStatus {
    def apply(
        ImportCompleted: js.UndefOr[Boolean] = js.undefined,
        ImportTime: js.UndefOr[Timestamp] = js.undefined,
        ImportedBy: js.UndefOr[NameString] = js.undefined
    ): CatalogImportStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      ImportCompleted.foreach(__v => __obj.update("ImportCompleted", __v.asInstanceOf[js.Any]))
      ImportTime.foreach(__v => __obj.update("ImportTime", __v.asInstanceOf[js.Any]))
      ImportedBy.foreach(__v => __obj.update("ImportedBy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CatalogImportStatus]
    }
  }

  /**
    * Classifiers are triggered during a crawl task. A classifier checks whether a given file is in a format it can handle, and if it is, the classifier creates a schema in the form of a <code>StructType</code> object that matches that data format.
    *  You can use the standard classifiers that AWS Glue supplies, or you can write your own classifiers to best categorize your data sources and specify the appropriate schemas to use for them. A classifier can be a <code>grok</code> classifier, an <code>XML</code> classifier, a <code>JSON</code> classifier, or a custom <code>CSV</code> classifier as specified in one of the fields in the <code>Classifier</code> object.
    */
  @js.native
  trait Classifier extends js.Object {
    var CsvClassifier: js.UndefOr[CsvClassifier]
    var GrokClassifier: js.UndefOr[GrokClassifier]
    var JsonClassifier: js.UndefOr[JsonClassifier]
    var XMLClassifier: js.UndefOr[XMLClassifier]
  }

  object Classifier {
    def apply(
        CsvClassifier: js.UndefOr[CsvClassifier] = js.undefined,
        GrokClassifier: js.UndefOr[GrokClassifier] = js.undefined,
        JsonClassifier: js.UndefOr[JsonClassifier] = js.undefined,
        XMLClassifier: js.UndefOr[XMLClassifier] = js.undefined
    ): Classifier = {
      val __obj = js.Dictionary.empty[js.Any]
      CsvClassifier.foreach(__v => __obj.update("CsvClassifier", __v.asInstanceOf[js.Any]))
      GrokClassifier.foreach(__v => __obj.update("GrokClassifier", __v.asInstanceOf[js.Any]))
      JsonClassifier.foreach(__v => __obj.update("JsonClassifier", __v.asInstanceOf[js.Any]))
      XMLClassifier.foreach(__v => __obj.update("XMLClassifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Classifier]
    }
  }

  /**
    * Specifies how CloudWatch data should be encrypted.
    */
  @js.native
  trait CloudWatchEncryption extends js.Object {
    var CloudWatchEncryptionMode: js.UndefOr[CloudWatchEncryptionMode]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  object CloudWatchEncryption {
    def apply(
        CloudWatchEncryptionMode: js.UndefOr[CloudWatchEncryptionMode] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
    ): CloudWatchEncryption = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchEncryptionMode.foreach(__v => __obj.update("CloudWatchEncryptionMode", __v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.update("KmsKeyArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchEncryption]
    }
  }

  object CloudWatchEncryptionModeEnum {
    val DISABLED  = "DISABLED"
    val `SSE-KMS` = "SSE-KMS"

    val values = IndexedSeq(DISABLED, `SSE-KMS`)
  }

  /**
    * Represents a directional edge in a directed acyclic graph (DAG).
    */
  @js.native
  trait CodeGenEdge extends js.Object {
    var Source: CodeGenIdentifier
    var Target: CodeGenIdentifier
    var TargetParameter: js.UndefOr[CodeGenArgName]
  }

  object CodeGenEdge {
    def apply(
        Source: CodeGenIdentifier,
        Target: CodeGenIdentifier,
        TargetParameter: js.UndefOr[CodeGenArgName] = js.undefined
    ): CodeGenEdge = {
      val __obj = js.Dictionary[js.Any](
        "Source" -> Source.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )

      TargetParameter.foreach(__v => __obj.update("TargetParameter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeGenEdge]
    }
  }

  /**
    * Represents a node in a directed acyclic graph (DAG)
    */
  @js.native
  trait CodeGenNode extends js.Object {
    var Args: CodeGenNodeArgs
    var Id: CodeGenIdentifier
    var NodeType: CodeGenNodeType
    var LineNumber: js.UndefOr[Int]
  }

  object CodeGenNode {
    def apply(
        Args: CodeGenNodeArgs,
        Id: CodeGenIdentifier,
        NodeType: CodeGenNodeType,
        LineNumber: js.UndefOr[Int] = js.undefined
    ): CodeGenNode = {
      val __obj = js.Dictionary[js.Any](
        "Args"     -> Args.asInstanceOf[js.Any],
        "Id"       -> Id.asInstanceOf[js.Any],
        "NodeType" -> NodeType.asInstanceOf[js.Any]
      )

      LineNumber.foreach(__v => __obj.update("LineNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeGenNode]
    }
  }

  /**
    * An argument or property of a node.
    */
  @js.native
  trait CodeGenNodeArg extends js.Object {
    var Name: CodeGenArgName
    var Value: CodeGenArgValue
    var Param: js.UndefOr[Boolean]
  }

  object CodeGenNodeArg {
    def apply(
        Name: CodeGenArgName,
        Value: CodeGenArgValue,
        Param: js.UndefOr[Boolean] = js.undefined
    ): CodeGenNodeArg = {
      val __obj = js.Dictionary[js.Any](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Param.foreach(__v => __obj.update("Param", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeGenNodeArg]
    }
  }

  /**
    * A column in a <code>Table</code>.
    */
  @js.native
  trait Column extends js.Object {
    var Name: NameString
    var Comment: js.UndefOr[CommentString]
    var Type: js.UndefOr[ColumnTypeString]
  }

  object Column {
    def apply(
        Name: NameString,
        Comment: js.UndefOr[CommentString] = js.undefined,
        Type: js.UndefOr[ColumnTypeString] = js.undefined
    ): Column = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.update("Comment", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Column]
    }
  }

  /**
    * Defines a condition under which a trigger fires.
    */
  @js.native
  trait Condition extends js.Object {
    var JobName: js.UndefOr[NameString]
    var LogicalOperator: js.UndefOr[LogicalOperator]
    var State: js.UndefOr[JobRunState]
  }

  object Condition {
    def apply(
        JobName: js.UndefOr[NameString] = js.undefined,
        LogicalOperator: js.UndefOr[LogicalOperator] = js.undefined,
        State: js.UndefOr[JobRunState] = js.undefined
    ): Condition = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      LogicalOperator.foreach(__v => __obj.update("LogicalOperator", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Condition]
    }
  }

  /**
    * Defines a connection to a data source.
    */
  @js.native
  trait Connection extends js.Object {
    var ConnectionProperties: js.UndefOr[ConnectionProperties]
    var ConnectionType: js.UndefOr[ConnectionType]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var LastUpdatedBy: js.UndefOr[NameString]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var MatchCriteria: js.UndefOr[MatchCriteria]
    var Name: js.UndefOr[NameString]
    var PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements]
  }

  object Connection {
    def apply(
        ConnectionProperties: js.UndefOr[ConnectionProperties] = js.undefined,
        ConnectionType: js.UndefOr[ConnectionType] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LastUpdatedBy: js.UndefOr[NameString] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements] = js.undefined
    ): Connection = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionProperties.foreach(__v => __obj.update("ConnectionProperties", __v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.update("ConnectionType", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LastUpdatedBy.foreach(__v => __obj.update("LastUpdatedBy", __v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.update("LastUpdatedTime", __v.asInstanceOf[js.Any]))
      MatchCriteria.foreach(__v => __obj.update("MatchCriteria", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      PhysicalConnectionRequirements.foreach(
        __v => __obj.update("PhysicalConnectionRequirements", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[Connection]
    }
  }

  /**
    * A structure that is used to specify a connection to create or update.
    */
  @js.native
  trait ConnectionInput extends js.Object {
    var ConnectionProperties: ConnectionProperties
    var ConnectionType: ConnectionType
    var Name: NameString
    var Description: js.UndefOr[DescriptionString]
    var MatchCriteria: js.UndefOr[MatchCriteria]
    var PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements]
  }

  object ConnectionInput {
    def apply(
        ConnectionProperties: ConnectionProperties,
        ConnectionType: ConnectionType,
        Name: NameString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined,
        PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements] = js.undefined
    ): ConnectionInput = {
      val __obj = js.Dictionary[js.Any](
        "ConnectionProperties" -> ConnectionProperties.asInstanceOf[js.Any],
        "ConnectionType"       -> ConnectionType.asInstanceOf[js.Any],
        "Name"                 -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      MatchCriteria.foreach(__v => __obj.update("MatchCriteria", __v.asInstanceOf[js.Any]))
      PhysicalConnectionRequirements.foreach(
        __v => __obj.update("PhysicalConnectionRequirements", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ConnectionInput]
    }
  }

  /**
    * The data structure used by the Data Catalog to encrypt the password as part of <code>CreateConnection</code> or <code>UpdateConnection</code> and store it in the <code>ENCRYPTED_PASSWORD</code> field in the connection properties. You can enable catalog encryption or only password encryption.
    *  When a <code>CreationConnection</code> request arrives containing a password, the Data Catalog first encrypts the password using your AWS KMS key. It then encrypts the whole connection object again if catalog encryption is also enabled.
    *  This encryption requires that you set AWS KMS key permissions to enable or restrict access on the password key according to your security requirements. For example, you might want only admin users to have decrypt permission on the password key.
    */
  @js.native
  trait ConnectionPasswordEncryption extends js.Object {
    var ReturnConnectionPasswordEncrypted: Boolean
    var AwsKmsKeyId: js.UndefOr[NameString]
  }

  object ConnectionPasswordEncryption {
    def apply(
        ReturnConnectionPasswordEncrypted: Boolean,
        AwsKmsKeyId: js.UndefOr[NameString] = js.undefined
    ): ConnectionPasswordEncryption = {
      val __obj = js.Dictionary[js.Any](
        "ReturnConnectionPasswordEncrypted" -> ReturnConnectionPasswordEncrypted.asInstanceOf[js.Any]
      )

      AwsKmsKeyId.foreach(__v => __obj.update("AwsKmsKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionPasswordEncryption]
    }
  }

  object ConnectionPropertyKeyEnum {
    val HOST                   = "HOST"
    val PORT                   = "PORT"
    val USERNAME               = "USERNAME"
    val PASSWORD               = "PASSWORD"
    val ENCRYPTED_PASSWORD     = "ENCRYPTED_PASSWORD"
    val JDBC_DRIVER_JAR_URI    = "JDBC_DRIVER_JAR_URI"
    val JDBC_DRIVER_CLASS_NAME = "JDBC_DRIVER_CLASS_NAME"
    val JDBC_ENGINE            = "JDBC_ENGINE"
    val JDBC_ENGINE_VERSION    = "JDBC_ENGINE_VERSION"
    val CONFIG_FILES           = "CONFIG_FILES"
    val INSTANCE_ID            = "INSTANCE_ID"
    val JDBC_CONNECTION_URL    = "JDBC_CONNECTION_URL"
    val JDBC_ENFORCE_SSL       = "JDBC_ENFORCE_SSL"

    val values = IndexedSeq(
      HOST,
      PORT,
      USERNAME,
      PASSWORD,
      ENCRYPTED_PASSWORD,
      JDBC_DRIVER_JAR_URI,
      JDBC_DRIVER_CLASS_NAME,
      JDBC_ENGINE,
      JDBC_ENGINE_VERSION,
      CONFIG_FILES,
      INSTANCE_ID,
      JDBC_CONNECTION_URL,
      JDBC_ENFORCE_SSL
    )
  }

  object ConnectionTypeEnum {
    val JDBC = "JDBC"
    val SFTP = "SFTP"

    val values = IndexedSeq(JDBC, SFTP)
  }

  /**
    * Specifies the connections used by a job.
    */
  @js.native
  trait ConnectionsList extends js.Object {
    var Connections: js.UndefOr[StringList]
  }

  object ConnectionsList {
    def apply(
        Connections: js.UndefOr[StringList] = js.undefined
    ): ConnectionsList = {
      val __obj = js.Dictionary.empty[js.Any]
      Connections.foreach(__v => __obj.update("Connections", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionsList]
    }
  }

  /**
    * Specifies a crawler program that examines a data source and uses classifiers to try to determine its schema. If successful, the crawler records metadata concerning the data source in the AWS Glue Data Catalog.
    */
  @js.native
  trait Crawler extends js.Object {
    var Classifiers: js.UndefOr[ClassifierNameList]
    var Configuration: js.UndefOr[CrawlerConfiguration]
    var CrawlElapsedTime: js.UndefOr[MillisecondsCount]
    var CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration]
    var CreationTime: js.UndefOr[Timestamp]
    var DatabaseName: js.UndefOr[DatabaseName]
    var Description: js.UndefOr[DescriptionString]
    var LastCrawl: js.UndefOr[LastCrawlInfo]
    var LastUpdated: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NameString]
    var Role: js.UndefOr[Role]
    var Schedule: js.UndefOr[Schedule]
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy]
    var State: js.UndefOr[CrawlerState]
    var TablePrefix: js.UndefOr[TablePrefix]
    var Targets: js.UndefOr[CrawlerTargets]
    var Version: js.UndefOr[VersionId]
  }

  object Crawler {
    def apply(
        Classifiers: js.UndefOr[ClassifierNameList] = js.undefined,
        Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined,
        CrawlElapsedTime: js.UndefOr[MillisecondsCount] = js.undefined,
        CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatabaseName: js.UndefOr[DatabaseName] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LastCrawl: js.UndefOr[LastCrawlInfo] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined,
        State: js.UndefOr[CrawlerState] = js.undefined,
        TablePrefix: js.UndefOr[TablePrefix] = js.undefined,
        Targets: js.UndefOr[CrawlerTargets] = js.undefined,
        Version: js.UndefOr[VersionId] = js.undefined
    ): Crawler = {
      val __obj = js.Dictionary.empty[js.Any]
      Classifiers.foreach(__v => __obj.update("Classifiers", __v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.update("Configuration", __v.asInstanceOf[js.Any]))
      CrawlElapsedTime.foreach(__v => __obj.update("CrawlElapsedTime", __v.asInstanceOf[js.Any]))
      CrawlerSecurityConfiguration.foreach(
        __v => __obj.update("CrawlerSecurityConfiguration", __v.asInstanceOf[js.Any])
      )
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LastCrawl.foreach(__v => __obj.update("LastCrawl", __v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.update("LastUpdated", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      SchemaChangePolicy.foreach(__v => __obj.update("SchemaChangePolicy", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      TablePrefix.foreach(__v => __obj.update("TablePrefix", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Crawler]
    }
  }

  /**
    * Metrics for a specified crawler.
    */
  @js.native
  trait CrawlerMetrics extends js.Object {
    var CrawlerName: js.UndefOr[NameString]
    var LastRuntimeSeconds: js.UndefOr[NonNegativeDouble]
    var MedianRuntimeSeconds: js.UndefOr[NonNegativeDouble]
    var StillEstimating: js.UndefOr[Boolean]
    var TablesCreated: js.UndefOr[NonNegativeInteger]
    var TablesDeleted: js.UndefOr[NonNegativeInteger]
    var TablesUpdated: js.UndefOr[NonNegativeInteger]
    var TimeLeftSeconds: js.UndefOr[NonNegativeDouble]
  }

  object CrawlerMetrics {
    def apply(
        CrawlerName: js.UndefOr[NameString] = js.undefined,
        LastRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined,
        MedianRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined,
        StillEstimating: js.UndefOr[Boolean] = js.undefined,
        TablesCreated: js.UndefOr[NonNegativeInteger] = js.undefined,
        TablesDeleted: js.UndefOr[NonNegativeInteger] = js.undefined,
        TablesUpdated: js.UndefOr[NonNegativeInteger] = js.undefined,
        TimeLeftSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
    ): CrawlerMetrics = {
      val __obj = js.Dictionary.empty[js.Any]
      CrawlerName.foreach(__v => __obj.update("CrawlerName", __v.asInstanceOf[js.Any]))
      LastRuntimeSeconds.foreach(__v => __obj.update("LastRuntimeSeconds", __v.asInstanceOf[js.Any]))
      MedianRuntimeSeconds.foreach(__v => __obj.update("MedianRuntimeSeconds", __v.asInstanceOf[js.Any]))
      StillEstimating.foreach(__v => __obj.update("StillEstimating", __v.asInstanceOf[js.Any]))
      TablesCreated.foreach(__v => __obj.update("TablesCreated", __v.asInstanceOf[js.Any]))
      TablesDeleted.foreach(__v => __obj.update("TablesDeleted", __v.asInstanceOf[js.Any]))
      TablesUpdated.foreach(__v => __obj.update("TablesUpdated", __v.asInstanceOf[js.Any]))
      TimeLeftSeconds.foreach(__v => __obj.update("TimeLeftSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrawlerMetrics]
    }
  }

  object CrawlerStateEnum {
    val READY    = "READY"
    val RUNNING  = "RUNNING"
    val STOPPING = "STOPPING"

    val values = IndexedSeq(READY, RUNNING, STOPPING)
  }

  /**
    * Specifies data stores to crawl.
    */
  @js.native
  trait CrawlerTargets extends js.Object {
    var DynamoDBTargets: js.UndefOr[DynamoDBTargetList]
    var JdbcTargets: js.UndefOr[JdbcTargetList]
    var S3Targets: js.UndefOr[S3TargetList]
  }

  object CrawlerTargets {
    def apply(
        DynamoDBTargets: js.UndefOr[DynamoDBTargetList] = js.undefined,
        JdbcTargets: js.UndefOr[JdbcTargetList] = js.undefined,
        S3Targets: js.UndefOr[S3TargetList] = js.undefined
    ): CrawlerTargets = {
      val __obj = js.Dictionary.empty[js.Any]
      DynamoDBTargets.foreach(__v => __obj.update("DynamoDBTargets", __v.asInstanceOf[js.Any]))
      JdbcTargets.foreach(__v => __obj.update("JdbcTargets", __v.asInstanceOf[js.Any]))
      S3Targets.foreach(__v => __obj.update("S3Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrawlerTargets]
    }
  }

  @js.native
  trait CreateClassifierRequest extends js.Object {
    var CsvClassifier: js.UndefOr[CreateCsvClassifierRequest]
    var GrokClassifier: js.UndefOr[CreateGrokClassifierRequest]
    var JsonClassifier: js.UndefOr[CreateJsonClassifierRequest]
    var XMLClassifier: js.UndefOr[CreateXMLClassifierRequest]
  }

  object CreateClassifierRequest {
    def apply(
        CsvClassifier: js.UndefOr[CreateCsvClassifierRequest] = js.undefined,
        GrokClassifier: js.UndefOr[CreateGrokClassifierRequest] = js.undefined,
        JsonClassifier: js.UndefOr[CreateJsonClassifierRequest] = js.undefined,
        XMLClassifier: js.UndefOr[CreateXMLClassifierRequest] = js.undefined
    ): CreateClassifierRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CsvClassifier.foreach(__v => __obj.update("CsvClassifier", __v.asInstanceOf[js.Any]))
      GrokClassifier.foreach(__v => __obj.update("GrokClassifier", __v.asInstanceOf[js.Any]))
      JsonClassifier.foreach(__v => __obj.update("JsonClassifier", __v.asInstanceOf[js.Any]))
      XMLClassifier.foreach(__v => __obj.update("XMLClassifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClassifierRequest]
    }
  }

  @js.native
  trait CreateClassifierResponse extends js.Object {}

  object CreateClassifierResponse {
    def apply(
        ): CreateClassifierResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateClassifierResponse]
    }
  }

  @js.native
  trait CreateConnectionRequest extends js.Object {
    var ConnectionInput: ConnectionInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object CreateConnectionRequest {
    def apply(
        ConnectionInput: ConnectionInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreateConnectionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConnectionInput" -> ConnectionInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionRequest]
    }
  }

  @js.native
  trait CreateConnectionResponse extends js.Object {}

  object CreateConnectionResponse {
    def apply(
        ): CreateConnectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateConnectionResponse]
    }
  }

  @js.native
  trait CreateCrawlerRequest extends js.Object {
    var DatabaseName: DatabaseName
    var Name: NameString
    var Role: Role
    var Targets: CrawlerTargets
    var Classifiers: js.UndefOr[ClassifierNameList]
    var Configuration: js.UndefOr[CrawlerConfiguration]
    var CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration]
    var Description: js.UndefOr[DescriptionString]
    var Schedule: js.UndefOr[CronExpression]
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy]
    var TablePrefix: js.UndefOr[TablePrefix]
    var Tags: js.UndefOr[TagsMap]
  }

  object CreateCrawlerRequest {
    def apply(
        DatabaseName: DatabaseName,
        Name: NameString,
        Role: Role,
        Targets: CrawlerTargets,
        Classifiers: js.UndefOr[ClassifierNameList] = js.undefined,
        Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined,
        CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Schedule: js.UndefOr[CronExpression] = js.undefined,
        SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined,
        TablePrefix: js.UndefOr[TablePrefix] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateCrawlerRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any],
        "Role"         -> Role.asInstanceOf[js.Any],
        "Targets"      -> Targets.asInstanceOf[js.Any]
      )

      Classifiers.foreach(__v => __obj.update("Classifiers", __v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.update("Configuration", __v.asInstanceOf[js.Any]))
      CrawlerSecurityConfiguration.foreach(
        __v => __obj.update("CrawlerSecurityConfiguration", __v.asInstanceOf[js.Any])
      )
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      SchemaChangePolicy.foreach(__v => __obj.update("SchemaChangePolicy", __v.asInstanceOf[js.Any]))
      TablePrefix.foreach(__v => __obj.update("TablePrefix", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCrawlerRequest]
    }
  }

  @js.native
  trait CreateCrawlerResponse extends js.Object {}

  object CreateCrawlerResponse {
    def apply(
        ): CreateCrawlerResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateCrawlerResponse]
    }
  }

  /**
    * Specifies a custom CSV classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  trait CreateCsvClassifierRequest extends js.Object {
    var Name: NameString
    var AllowSingleColumn: js.UndefOr[NullableBoolean]
    var ContainsHeader: js.UndefOr[CsvHeaderOption]
    var Delimiter: js.UndefOr[CsvColumnDelimiter]
    var DisableValueTrimming: js.UndefOr[NullableBoolean]
    var Header: js.UndefOr[CsvHeader]
    var QuoteSymbol: js.UndefOr[CsvQuoteSymbol]
  }

  object CreateCsvClassifierRequest {
    def apply(
        Name: NameString,
        AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined,
        ContainsHeader: js.UndefOr[CsvHeaderOption] = js.undefined,
        Delimiter: js.UndefOr[CsvColumnDelimiter] = js.undefined,
        DisableValueTrimming: js.UndefOr[NullableBoolean] = js.undefined,
        Header: js.UndefOr[CsvHeader] = js.undefined,
        QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.undefined
    ): CreateCsvClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AllowSingleColumn.foreach(__v => __obj.update("AllowSingleColumn", __v.asInstanceOf[js.Any]))
      ContainsHeader.foreach(__v => __obj.update("ContainsHeader", __v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      DisableValueTrimming.foreach(__v => __obj.update("DisableValueTrimming", __v.asInstanceOf[js.Any]))
      Header.foreach(__v => __obj.update("Header", __v.asInstanceOf[js.Any]))
      QuoteSymbol.foreach(__v => __obj.update("QuoteSymbol", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCsvClassifierRequest]
    }
  }

  @js.native
  trait CreateDatabaseRequest extends js.Object {
    var DatabaseInput: DatabaseInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object CreateDatabaseRequest {
    def apply(
        DatabaseInput: DatabaseInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreateDatabaseRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseInput" -> DatabaseInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatabaseRequest]
    }
  }

  @js.native
  trait CreateDatabaseResponse extends js.Object {}

  object CreateDatabaseResponse {
    def apply(
        ): CreateDatabaseResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateDatabaseResponse]
    }
  }

  @js.native
  trait CreateDevEndpointRequest extends js.Object {
    var EndpointName: GenericString
    var RoleArn: RoleArn
    var Arguments: js.UndefOr[MapValue]
    var ExtraJarsS3Path: js.UndefOr[GenericString]
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString]
    var NumberOfNodes: js.UndefOr[IntegerValue]
    var PublicKey: js.UndefOr[GenericString]
    var PublicKeys: js.UndefOr[PublicKeysList]
    var SecurityConfiguration: js.UndefOr[NameString]
    var SecurityGroupIds: js.UndefOr[StringList]
    var SubnetId: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagsMap]
  }

  object CreateDevEndpointRequest {
    def apply(
        EndpointName: GenericString,
        RoleArn: RoleArn,
        Arguments: js.UndefOr[MapValue] = js.undefined,
        ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined,
        ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined,
        PublicKey: js.UndefOr[GenericString] = js.undefined,
        PublicKeys: js.UndefOr[PublicKeysList] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        SecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        SubnetId: js.UndefOr[GenericString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateDevEndpointRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "RoleArn"      -> RoleArn.asInstanceOf[js.Any]
      )

      Arguments.foreach(__v => __obj.update("Arguments", __v.asInstanceOf[js.Any]))
      ExtraJarsS3Path.foreach(__v => __obj.update("ExtraJarsS3Path", __v.asInstanceOf[js.Any]))
      ExtraPythonLibsS3Path.foreach(__v => __obj.update("ExtraPythonLibsS3Path", __v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.update("NumberOfNodes", __v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.update("PublicKey", __v.asInstanceOf[js.Any]))
      PublicKeys.foreach(__v => __obj.update("PublicKeys", __v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.update("SubnetId", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDevEndpointRequest]
    }
  }

  @js.native
  trait CreateDevEndpointResponse extends js.Object {
    var Arguments: js.UndefOr[MapValue]
    var AvailabilityZone: js.UndefOr[GenericString]
    var CreatedTimestamp: js.UndefOr[TimestampValue]
    var EndpointName: js.UndefOr[GenericString]
    var ExtraJarsS3Path: js.UndefOr[GenericString]
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString]
    var FailureReason: js.UndefOr[GenericString]
    var NumberOfNodes: js.UndefOr[IntegerValue]
    var RoleArn: js.UndefOr[RoleArn]
    var SecurityConfiguration: js.UndefOr[NameString]
    var SecurityGroupIds: js.UndefOr[StringList]
    var Status: js.UndefOr[GenericString]
    var SubnetId: js.UndefOr[GenericString]
    var VpcId: js.UndefOr[GenericString]
    var YarnEndpointAddress: js.UndefOr[GenericString]
    var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue]
  }

  object CreateDevEndpointResponse {
    def apply(
        Arguments: js.UndefOr[MapValue] = js.undefined,
        AvailabilityZone: js.UndefOr[GenericString] = js.undefined,
        CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined,
        EndpointName: js.UndefOr[GenericString] = js.undefined,
        ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined,
        ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined,
        FailureReason: js.UndefOr[GenericString] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        SecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        Status: js.UndefOr[GenericString] = js.undefined,
        SubnetId: js.UndefOr[GenericString] = js.undefined,
        VpcId: js.UndefOr[GenericString] = js.undefined,
        YarnEndpointAddress: js.UndefOr[GenericString] = js.undefined,
        ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
    ): CreateDevEndpointResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Arguments.foreach(__v => __obj.update("Arguments", __v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.update("CreatedTimestamp", __v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.update("EndpointName", __v.asInstanceOf[js.Any]))
      ExtraJarsS3Path.foreach(__v => __obj.update("ExtraJarsS3Path", __v.asInstanceOf[js.Any]))
      ExtraPythonLibsS3Path.foreach(__v => __obj.update("ExtraPythonLibsS3Path", __v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.update("FailureReason", __v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.update("NumberOfNodes", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.update("SubnetId", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      YarnEndpointAddress.foreach(__v => __obj.update("YarnEndpointAddress", __v.asInstanceOf[js.Any]))
      ZeppelinRemoteSparkInterpreterPort.foreach(
        __v => __obj.update("ZeppelinRemoteSparkInterpreterPort", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateDevEndpointResponse]
    }
  }

  /**
    * Specifies a <code>grok</code> classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  trait CreateGrokClassifierRequest extends js.Object {
    var Classification: Classification
    var GrokPattern: GrokPattern
    var Name: NameString
    var CustomPatterns: js.UndefOr[CustomPatterns]
  }

  object CreateGrokClassifierRequest {
    def apply(
        Classification: Classification,
        GrokPattern: GrokPattern,
        Name: NameString,
        CustomPatterns: js.UndefOr[CustomPatterns] = js.undefined
    ): CreateGrokClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "GrokPattern"    -> GrokPattern.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any]
      )

      CustomPatterns.foreach(__v => __obj.update("CustomPatterns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGrokClassifierRequest]
    }
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var Command: JobCommand
    var Name: NameString
    var Role: RoleString
    var AllocatedCapacity: js.UndefOr[IntegerValue]
    var Connections: js.UndefOr[ConnectionsList]
    var DefaultArguments: js.UndefOr[GenericMap]
    var Description: js.UndefOr[DescriptionString]
    var ExecutionProperty: js.UndefOr[ExecutionProperty]
    var LogUri: js.UndefOr[UriString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[MaxRetries]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Tags: js.UndefOr[TagsMap]
    var Timeout: js.UndefOr[Timeout]
    var WorkerType: js.UndefOr[WorkerType]
  }

  object CreateJobRequest {
    def apply(
        Command: JobCommand,
        Name: NameString,
        Role: RoleString,
        AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
        Connections: js.UndefOr[ConnectionsList] = js.undefined,
        DefaultArguments: js.UndefOr[GenericMap] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        ExecutionProperty: js.UndefOr[ExecutionProperty] = js.undefined,
        LogUri: js.UndefOr[UriString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "Command" -> Command.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any],
        "Role"    -> Role.asInstanceOf[js.Any]
      )

      AllocatedCapacity.foreach(__v => __obj.update("AllocatedCapacity", __v.asInstanceOf[js.Any]))
      Connections.foreach(__v => __obj.update("Connections", __v.asInstanceOf[js.Any]))
      DefaultArguments.foreach(__v => __obj.update("DefaultArguments", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ExecutionProperty.foreach(__v => __obj.update("ExecutionProperty", __v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.update("LogUri", __v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.update("MaxCapacity", __v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.update("MaxRetries", __v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.update("NotificationProperty", __v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.update("NumberOfWorkers", __v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.update("Timeout", __v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.update("WorkerType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object CreateJobResponse {
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): CreateJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResponse]
    }
  }

  /**
    * Specifies a JSON classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  trait CreateJsonClassifierRequest extends js.Object {
    var JsonPath: JsonPath
    var Name: NameString
  }

  object CreateJsonClassifierRequest {
    def apply(
        JsonPath: JsonPath,
        Name: NameString
    ): CreateJsonClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "JsonPath" -> JsonPath.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateJsonClassifierRequest]
    }
  }

  @js.native
  trait CreatePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionInput: PartitionInput
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object CreatePartitionRequest {
    def apply(
        DatabaseName: NameString,
        PartitionInput: PartitionInput,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreatePartitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"   -> DatabaseName.asInstanceOf[js.Any],
        "PartitionInput" -> PartitionInput.asInstanceOf[js.Any],
        "TableName"      -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePartitionRequest]
    }
  }

  @js.native
  trait CreatePartitionResponse extends js.Object {}

  object CreatePartitionResponse {
    def apply(
        ): CreatePartitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreatePartitionResponse]
    }
  }

  @js.native
  trait CreateScriptRequest extends js.Object {
    var DagEdges: js.UndefOr[DagEdges]
    var DagNodes: js.UndefOr[DagNodes]
    var Language: js.UndefOr[Language]
  }

  object CreateScriptRequest {
    def apply(
        DagEdges: js.UndefOr[DagEdges] = js.undefined,
        DagNodes: js.UndefOr[DagNodes] = js.undefined,
        Language: js.UndefOr[Language] = js.undefined
    ): CreateScriptRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DagEdges.foreach(__v => __obj.update("DagEdges", __v.asInstanceOf[js.Any]))
      DagNodes.foreach(__v => __obj.update("DagNodes", __v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.update("Language", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScriptRequest]
    }
  }

  @js.native
  trait CreateScriptResponse extends js.Object {
    var PythonScript: js.UndefOr[PythonScript]
    var ScalaCode: js.UndefOr[ScalaCode]
  }

  object CreateScriptResponse {
    def apply(
        PythonScript: js.UndefOr[PythonScript] = js.undefined,
        ScalaCode: js.UndefOr[ScalaCode] = js.undefined
    ): CreateScriptResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      PythonScript.foreach(__v => __obj.update("PythonScript", __v.asInstanceOf[js.Any]))
      ScalaCode.foreach(__v => __obj.update("ScalaCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScriptResponse]
    }
  }

  @js.native
  trait CreateSecurityConfigurationRequest extends js.Object {
    var EncryptionConfiguration: EncryptionConfiguration
    var Name: NameString
  }

  object CreateSecurityConfigurationRequest {
    def apply(
        EncryptionConfiguration: EncryptionConfiguration,
        Name: NameString
    ): CreateSecurityConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "EncryptionConfiguration" -> EncryptionConfiguration.asInstanceOf[js.Any],
        "Name"                    -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSecurityConfigurationRequest]
    }
  }

  @js.native
  trait CreateSecurityConfigurationResponse extends js.Object {
    var CreatedTimestamp: js.UndefOr[TimestampValue]
    var Name: js.UndefOr[NameString]
  }

  object CreateSecurityConfigurationResponse {
    def apply(
        CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined
    ): CreateSecurityConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedTimestamp.foreach(__v => __obj.update("CreatedTimestamp", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityConfigurationResponse]
    }
  }

  @js.native
  trait CreateTableRequest extends js.Object {
    var DatabaseName: NameString
    var TableInput: TableInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object CreateTableRequest {
    def apply(
        DatabaseName: NameString,
        TableInput: TableInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreateTableRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableInput"   -> TableInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTableRequest]
    }
  }

  @js.native
  trait CreateTableResponse extends js.Object {}

  object CreateTableResponse {
    def apply(
        ): CreateTableResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateTableResponse]
    }
  }

  @js.native
  trait CreateTriggerRequest extends js.Object {
    var Actions: ActionList
    var Name: NameString
    var Type: TriggerType
    var Description: js.UndefOr[DescriptionString]
    var Predicate: js.UndefOr[Predicate]
    var Schedule: js.UndefOr[GenericString]
    var StartOnCreation: js.UndefOr[BooleanValue]
    var Tags: js.UndefOr[TagsMap]
  }

  object CreateTriggerRequest {
    def apply(
        Actions: ActionList,
        Name: NameString,
        Type: TriggerType,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Predicate: js.UndefOr[Predicate] = js.undefined,
        Schedule: js.UndefOr[GenericString] = js.undefined,
        StartOnCreation: js.UndefOr[BooleanValue] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateTriggerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Actions" -> Actions.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any],
        "Type"    -> Type.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Predicate.foreach(__v => __obj.update("Predicate", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      StartOnCreation.foreach(__v => __obj.update("StartOnCreation", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTriggerRequest]
    }
  }

  @js.native
  trait CreateTriggerResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object CreateTriggerResponse {
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): CreateTriggerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTriggerResponse]
    }
  }

  @js.native
  trait CreateUserDefinedFunctionRequest extends js.Object {
    var DatabaseName: NameString
    var FunctionInput: UserDefinedFunctionInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object CreateUserDefinedFunctionRequest {
    def apply(
        DatabaseName: NameString,
        FunctionInput: UserDefinedFunctionInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreateUserDefinedFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"  -> DatabaseName.asInstanceOf[js.Any],
        "FunctionInput" -> FunctionInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait CreateUserDefinedFunctionResponse extends js.Object {}

  object CreateUserDefinedFunctionResponse {
    def apply(
        ): CreateUserDefinedFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateUserDefinedFunctionResponse]
    }
  }

  /**
    * Specifies an XML classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  trait CreateXMLClassifierRequest extends js.Object {
    var Classification: Classification
    var Name: NameString
    var RowTag: js.UndefOr[RowTag]
  }

  object CreateXMLClassifierRequest {
    def apply(
        Classification: Classification,
        Name: NameString,
        RowTag: js.UndefOr[RowTag] = js.undefined
    ): CreateXMLClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any]
      )

      RowTag.foreach(__v => __obj.update("RowTag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateXMLClassifierRequest]
    }
  }

  /**
    * A classifier for custom <code>CSV</code> content.
    */
  @js.native
  trait CsvClassifier extends js.Object {
    var Name: NameString
    var AllowSingleColumn: js.UndefOr[NullableBoolean]
    var ContainsHeader: js.UndefOr[CsvHeaderOption]
    var CreationTime: js.UndefOr[Timestamp]
    var Delimiter: js.UndefOr[CsvColumnDelimiter]
    var DisableValueTrimming: js.UndefOr[NullableBoolean]
    var Header: js.UndefOr[CsvHeader]
    var LastUpdated: js.UndefOr[Timestamp]
    var QuoteSymbol: js.UndefOr[CsvQuoteSymbol]
    var Version: js.UndefOr[VersionId]
  }

  object CsvClassifier {
    def apply(
        Name: NameString,
        AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined,
        ContainsHeader: js.UndefOr[CsvHeaderOption] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Delimiter: js.UndefOr[CsvColumnDelimiter] = js.undefined,
        DisableValueTrimming: js.UndefOr[NullableBoolean] = js.undefined,
        Header: js.UndefOr[CsvHeader] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.undefined,
        Version: js.UndefOr[VersionId] = js.undefined
    ): CsvClassifier = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AllowSingleColumn.foreach(__v => __obj.update("AllowSingleColumn", __v.asInstanceOf[js.Any]))
      ContainsHeader.foreach(__v => __obj.update("ContainsHeader", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      DisableValueTrimming.foreach(__v => __obj.update("DisableValueTrimming", __v.asInstanceOf[js.Any]))
      Header.foreach(__v => __obj.update("Header", __v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.update("LastUpdated", __v.asInstanceOf[js.Any]))
      QuoteSymbol.foreach(__v => __obj.update("QuoteSymbol", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CsvClassifier]
    }
  }

  object CsvHeaderOptionEnum {
    val UNKNOWN = "UNKNOWN"
    val PRESENT = "PRESENT"
    val ABSENT  = "ABSENT"

    val values = IndexedSeq(UNKNOWN, PRESENT, ABSENT)
  }

  /**
    * Contains configuration information for maintaining Data Catalog security.
    */
  @js.native
  trait DataCatalogEncryptionSettings extends js.Object {
    var ConnectionPasswordEncryption: js.UndefOr[ConnectionPasswordEncryption]
    var EncryptionAtRest: js.UndefOr[EncryptionAtRest]
  }

  object DataCatalogEncryptionSettings {
    def apply(
        ConnectionPasswordEncryption: js.UndefOr[ConnectionPasswordEncryption] = js.undefined,
        EncryptionAtRest: js.UndefOr[EncryptionAtRest] = js.undefined
    ): DataCatalogEncryptionSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionPasswordEncryption.foreach(
        __v => __obj.update("ConnectionPasswordEncryption", __v.asInstanceOf[js.Any])
      )
      EncryptionAtRest.foreach(__v => __obj.update("EncryptionAtRest", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCatalogEncryptionSettings]
    }
  }

  /**
    * The <code>Database</code> object represents a logical grouping of tables that may reside in a Hive metastore or an RDBMS.
    */
  @js.native
  trait Database extends js.Object {
    var Name: NameString
    var CreateTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var LocationUri: js.UndefOr[URI]
    var Parameters: js.UndefOr[ParametersMap]
  }

  object Database {
    def apply(
        Name: NameString,
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LocationUri: js.UndefOr[URI] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined
    ): Database = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateTime.foreach(__v => __obj.update("CreateTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.update("LocationUri", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Database]
    }
  }

  /**
    * The structure used to create or update a database.
    */
  @js.native
  trait DatabaseInput extends js.Object {
    var Name: NameString
    var Description: js.UndefOr[DescriptionString]
    var LocationUri: js.UndefOr[URI]
    var Parameters: js.UndefOr[ParametersMap]
  }

  object DatabaseInput {
    def apply(
        Name: NameString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LocationUri: js.UndefOr[URI] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined
    ): DatabaseInput = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.update("LocationUri", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseInput]
    }
  }

  object DeleteBehaviorEnum {
    val LOG                   = "LOG"
    val DELETE_FROM_DATABASE  = "DELETE_FROM_DATABASE"
    val DEPRECATE_IN_DATABASE = "DEPRECATE_IN_DATABASE"

    val values = IndexedSeq(LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE)
  }

  @js.native
  trait DeleteClassifierRequest extends js.Object {
    var Name: NameString
  }

  object DeleteClassifierRequest {
    def apply(
        Name: NameString
    ): DeleteClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteClassifierRequest]
    }
  }

  @js.native
  trait DeleteClassifierResponse extends js.Object {}

  object DeleteClassifierResponse {
    def apply(
        ): DeleteClassifierResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteClassifierResponse]
    }
  }

  @js.native
  trait DeleteConnectionRequest extends js.Object {
    var ConnectionName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteConnectionRequest {
    def apply(
        ConnectionName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteConnectionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConnectionName" -> ConnectionName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait DeleteConnectionResponse extends js.Object {}

  object DeleteConnectionResponse {
    def apply(
        ): DeleteConnectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteConnectionResponse]
    }
  }

  @js.native
  trait DeleteCrawlerRequest extends js.Object {
    var Name: NameString
  }

  object DeleteCrawlerRequest {
    def apply(
        Name: NameString
    ): DeleteCrawlerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCrawlerRequest]
    }
  }

  @js.native
  trait DeleteCrawlerResponse extends js.Object {}

  object DeleteCrawlerResponse {
    def apply(
        ): DeleteCrawlerResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteCrawlerResponse]
    }
  }

  @js.native
  trait DeleteDatabaseRequest extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteDatabaseRequest {
    def apply(
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteDatabaseRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDatabaseRequest]
    }
  }

  @js.native
  trait DeleteDatabaseResponse extends js.Object {}

  object DeleteDatabaseResponse {
    def apply(
        ): DeleteDatabaseResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDatabaseResponse]
    }
  }

  @js.native
  trait DeleteDevEndpointRequest extends js.Object {
    var EndpointName: GenericString
  }

  object DeleteDevEndpointRequest {
    def apply(
        EndpointName: GenericString
    ): DeleteDevEndpointRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDevEndpointRequest]
    }
  }

  @js.native
  trait DeleteDevEndpointResponse extends js.Object {}

  object DeleteDevEndpointResponse {
    def apply(
        ): DeleteDevEndpointResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDevEndpointResponse]
    }
  }

  @js.native
  trait DeleteJobRequest extends js.Object {
    var JobName: NameString
  }

  object DeleteJobRequest {
    def apply(
        JobName: NameString
    ): DeleteJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteJobRequest]
    }
  }

  @js.native
  trait DeleteJobResponse extends js.Object {
    var JobName: js.UndefOr[NameString]
  }

  object DeleteJobResponse {
    def apply(
        JobName: js.UndefOr[NameString] = js.undefined
    ): DeleteJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteJobResponse]
    }
  }

  @js.native
  trait DeletePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionValues: ValueStringList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeletePartitionRequest {
    def apply(
        DatabaseName: NameString,
        PartitionValues: ValueStringList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeletePartitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"    -> DatabaseName.asInstanceOf[js.Any],
        "PartitionValues" -> PartitionValues.asInstanceOf[js.Any],
        "TableName"       -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePartitionRequest]
    }
  }

  @js.native
  trait DeletePartitionResponse extends js.Object {}

  object DeletePartitionResponse {
    def apply(
        ): DeletePartitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeletePartitionResponse]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var PolicyHashCondition: js.UndefOr[HashString]
  }

  object DeleteResourcePolicyRequest {
    def apply(
        PolicyHashCondition: js.UndefOr[HashString] = js.undefined
    ): DeleteResourcePolicyRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      PolicyHashCondition.foreach(__v => __obj.update("PolicyHashCondition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyResponse extends js.Object {}

  object DeleteResourcePolicyResponse {
    def apply(
        ): DeleteResourcePolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteResourcePolicyResponse]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationRequest extends js.Object {
    var Name: NameString
  }

  object DeleteSecurityConfigurationRequest {
    def apply(
        Name: NameString
    ): DeleteSecurityConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSecurityConfigurationRequest]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationResponse extends js.Object {}

  object DeleteSecurityConfigurationResponse {
    def apply(
        ): DeleteSecurityConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteSecurityConfigurationResponse]
    }
  }

  @js.native
  trait DeleteTableRequest extends js.Object {
    var DatabaseName: NameString
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteTableRequest {
    def apply(
        DatabaseName: NameString,
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteTableRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTableRequest]
    }
  }

  @js.native
  trait DeleteTableResponse extends js.Object {}

  object DeleteTableResponse {
    def apply(
        ): DeleteTableResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteTableResponse]
    }
  }

  @js.native
  trait DeleteTableVersionRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var VersionId: VersionString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteTableVersionRequest {
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        VersionId: VersionString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteTableVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any],
        "VersionId"    -> VersionId.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTableVersionRequest]
    }
  }

  @js.native
  trait DeleteTableVersionResponse extends js.Object {}

  object DeleteTableVersionResponse {
    def apply(
        ): DeleteTableVersionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteTableVersionResponse]
    }
  }

  @js.native
  trait DeleteTriggerRequest extends js.Object {
    var Name: NameString
  }

  object DeleteTriggerRequest {
    def apply(
        Name: NameString
    ): DeleteTriggerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTriggerRequest]
    }
  }

  @js.native
  trait DeleteTriggerResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object DeleteTriggerResponse {
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): DeleteTriggerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTriggerResponse]
    }
  }

  @js.native
  trait DeleteUserDefinedFunctionRequest extends js.Object {
    var DatabaseName: NameString
    var FunctionName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteUserDefinedFunctionRequest {
    def apply(
        DatabaseName: NameString,
        FunctionName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteUserDefinedFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait DeleteUserDefinedFunctionResponse extends js.Object {}

  object DeleteUserDefinedFunctionResponse {
    def apply(
        ): DeleteUserDefinedFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteUserDefinedFunctionResponse]
    }
  }

  /**
    * A development endpoint where a developer can remotely debug ETL scripts.
    */
  @js.native
  trait DevEndpoint extends js.Object {
    var Arguments: js.UndefOr[MapValue]
    var AvailabilityZone: js.UndefOr[GenericString]
    var CreatedTimestamp: js.UndefOr[TimestampValue]
    var EndpointName: js.UndefOr[GenericString]
    var ExtraJarsS3Path: js.UndefOr[GenericString]
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString]
    var FailureReason: js.UndefOr[GenericString]
    var LastModifiedTimestamp: js.UndefOr[TimestampValue]
    var LastUpdateStatus: js.UndefOr[GenericString]
    var NumberOfNodes: js.UndefOr[IntegerValue]
    var PrivateAddress: js.UndefOr[GenericString]
    var PublicAddress: js.UndefOr[GenericString]
    var PublicKey: js.UndefOr[GenericString]
    var PublicKeys: js.UndefOr[PublicKeysList]
    var RoleArn: js.UndefOr[RoleArn]
    var SecurityConfiguration: js.UndefOr[NameString]
    var SecurityGroupIds: js.UndefOr[StringList]
    var Status: js.UndefOr[GenericString]
    var SubnetId: js.UndefOr[GenericString]
    var VpcId: js.UndefOr[GenericString]
    var YarnEndpointAddress: js.UndefOr[GenericString]
    var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue]
  }

  object DevEndpoint {
    def apply(
        Arguments: js.UndefOr[MapValue] = js.undefined,
        AvailabilityZone: js.UndefOr[GenericString] = js.undefined,
        CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined,
        EndpointName: js.UndefOr[GenericString] = js.undefined,
        ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined,
        ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined,
        FailureReason: js.UndefOr[GenericString] = js.undefined,
        LastModifiedTimestamp: js.UndefOr[TimestampValue] = js.undefined,
        LastUpdateStatus: js.UndefOr[GenericString] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined,
        PrivateAddress: js.UndefOr[GenericString] = js.undefined,
        PublicAddress: js.UndefOr[GenericString] = js.undefined,
        PublicKey: js.UndefOr[GenericString] = js.undefined,
        PublicKeys: js.UndefOr[PublicKeysList] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        SecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        Status: js.UndefOr[GenericString] = js.undefined,
        SubnetId: js.UndefOr[GenericString] = js.undefined,
        VpcId: js.UndefOr[GenericString] = js.undefined,
        YarnEndpointAddress: js.UndefOr[GenericString] = js.undefined,
        ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
    ): DevEndpoint = {
      val __obj = js.Dictionary.empty[js.Any]
      Arguments.foreach(__v => __obj.update("Arguments", __v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.update("CreatedTimestamp", __v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.update("EndpointName", __v.asInstanceOf[js.Any]))
      ExtraJarsS3Path.foreach(__v => __obj.update("ExtraJarsS3Path", __v.asInstanceOf[js.Any]))
      ExtraPythonLibsS3Path.foreach(__v => __obj.update("ExtraPythonLibsS3Path", __v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.update("FailureReason", __v.asInstanceOf[js.Any]))
      LastModifiedTimestamp.foreach(__v => __obj.update("LastModifiedTimestamp", __v.asInstanceOf[js.Any]))
      LastUpdateStatus.foreach(__v => __obj.update("LastUpdateStatus", __v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.update("NumberOfNodes", __v.asInstanceOf[js.Any]))
      PrivateAddress.foreach(__v => __obj.update("PrivateAddress", __v.asInstanceOf[js.Any]))
      PublicAddress.foreach(__v => __obj.update("PublicAddress", __v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.update("PublicKey", __v.asInstanceOf[js.Any]))
      PublicKeys.foreach(__v => __obj.update("PublicKeys", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.update("SubnetId", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      YarnEndpointAddress.foreach(__v => __obj.update("YarnEndpointAddress", __v.asInstanceOf[js.Any]))
      ZeppelinRemoteSparkInterpreterPort.foreach(
        __v => __obj.update("ZeppelinRemoteSparkInterpreterPort", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DevEndpoint]
    }
  }

  /**
    * Custom libraries to be loaded into a DevEndpoint.
    */
  @js.native
  trait DevEndpointCustomLibraries extends js.Object {
    var ExtraJarsS3Path: js.UndefOr[GenericString]
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString]
  }

  object DevEndpointCustomLibraries {
    def apply(
        ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined,
        ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
    ): DevEndpointCustomLibraries = {
      val __obj = js.Dictionary.empty[js.Any]
      ExtraJarsS3Path.foreach(__v => __obj.update("ExtraJarsS3Path", __v.asInstanceOf[js.Any]))
      ExtraPythonLibsS3Path.foreach(__v => __obj.update("ExtraPythonLibsS3Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DevEndpointCustomLibraries]
    }
  }

  /**
    * Specifies a DynamoDB table to crawl.
    */
  @js.native
  trait DynamoDBTarget extends js.Object {
    var Path: js.UndefOr[Path]
  }

  object DynamoDBTarget {
    def apply(
        Path: js.UndefOr[Path] = js.undefined
    ): DynamoDBTarget = {
      val __obj = js.Dictionary.empty[js.Any]
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DynamoDBTarget]
    }
  }

  /**
    * Specifies the encryption-at-rest configuration for the Data Catalog.
    */
  @js.native
  trait EncryptionAtRest extends js.Object {
    var CatalogEncryptionMode: CatalogEncryptionMode
    var SseAwsKmsKeyId: js.UndefOr[NameString]
  }

  object EncryptionAtRest {
    def apply(
        CatalogEncryptionMode: CatalogEncryptionMode,
        SseAwsKmsKeyId: js.UndefOr[NameString] = js.undefined
    ): EncryptionAtRest = {
      val __obj = js.Dictionary[js.Any](
        "CatalogEncryptionMode" -> CatalogEncryptionMode.asInstanceOf[js.Any]
      )

      SseAwsKmsKeyId.foreach(__v => __obj.update("SseAwsKmsKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionAtRest]
    }
  }

  /**
    * Specifies an encryption configuration.
    */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var CloudWatchEncryption: js.UndefOr[CloudWatchEncryption]
    var JobBookmarksEncryption: js.UndefOr[JobBookmarksEncryption]
    var S3Encryption: js.UndefOr[S3EncryptionList]
  }

  object EncryptionConfiguration {
    def apply(
        CloudWatchEncryption: js.UndefOr[CloudWatchEncryption] = js.undefined,
        JobBookmarksEncryption: js.UndefOr[JobBookmarksEncryption] = js.undefined,
        S3Encryption: js.UndefOr[S3EncryptionList] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchEncryption.foreach(__v => __obj.update("CloudWatchEncryption", __v.asInstanceOf[js.Any]))
      JobBookmarksEncryption.foreach(__v => __obj.update("JobBookmarksEncryption", __v.asInstanceOf[js.Any]))
      S3Encryption.foreach(__v => __obj.update("S3Encryption", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfiguration]
    }
  }

  /**
    * Contains details about an error.
    */
  @js.native
  trait ErrorDetail extends js.Object {
    var ErrorCode: js.UndefOr[NameString]
    var ErrorMessage: js.UndefOr[DescriptionString]
  }

  object ErrorDetail {
    def apply(
        ErrorCode: js.UndefOr[NameString] = js.undefined,
        ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
    ): ErrorDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetail]
    }
  }

  /**
    * An execution property of a job.
    */
  @js.native
  trait ExecutionProperty extends js.Object {
    var MaxConcurrentRuns: js.UndefOr[MaxConcurrentRuns]
  }

  object ExecutionProperty {
    def apply(
        MaxConcurrentRuns: js.UndefOr[MaxConcurrentRuns] = js.undefined
    ): ExecutionProperty = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxConcurrentRuns.foreach(__v => __obj.update("MaxConcurrentRuns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionProperty]
    }
  }

  object ExistConditionEnum {
    val MUST_EXIST = "MUST_EXIST"
    val NOT_EXIST  = "NOT_EXIST"
    val NONE       = "NONE"

    val values = IndexedSeq(MUST_EXIST, NOT_EXIST, NONE)
  }

  @js.native
  trait GetCatalogImportStatusRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetCatalogImportStatusRequest {
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetCatalogImportStatusRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCatalogImportStatusRequest]
    }
  }

  @js.native
  trait GetCatalogImportStatusResponse extends js.Object {
    var ImportStatus: js.UndefOr[CatalogImportStatus]
  }

  object GetCatalogImportStatusResponse {
    def apply(
        ImportStatus: js.UndefOr[CatalogImportStatus] = js.undefined
    ): GetCatalogImportStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ImportStatus.foreach(__v => __obj.update("ImportStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCatalogImportStatusResponse]
    }
  }

  @js.native
  trait GetClassifierRequest extends js.Object {
    var Name: NameString
  }

  object GetClassifierRequest {
    def apply(
        Name: NameString
    ): GetClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetClassifierRequest]
    }
  }

  @js.native
  trait GetClassifierResponse extends js.Object {
    var Classifier: js.UndefOr[Classifier]
  }

  object GetClassifierResponse {
    def apply(
        Classifier: js.UndefOr[Classifier] = js.undefined
    ): GetClassifierResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Classifier.foreach(__v => __obj.update("Classifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetClassifierResponse]
    }
  }

  @js.native
  trait GetClassifiersRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetClassifiersRequest {
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetClassifiersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetClassifiersRequest]
    }
  }

  @js.native
  trait GetClassifiersResponse extends js.Object {
    var Classifiers: js.UndefOr[ClassifierList]
    var NextToken: js.UndefOr[Token]
  }

  object GetClassifiersResponse {
    def apply(
        Classifiers: js.UndefOr[ClassifierList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetClassifiersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Classifiers.foreach(__v => __obj.update("Classifiers", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetClassifiersResponse]
    }
  }

  @js.native
  trait GetConnectionRequest extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var HidePassword: js.UndefOr[Boolean]
  }

  object GetConnectionRequest {
    def apply(
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        HidePassword: js.UndefOr[Boolean] = js.undefined
    ): GetConnectionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      HidePassword.foreach(__v => __obj.update("HidePassword", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionRequest]
    }
  }

  @js.native
  trait GetConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object GetConnectionResponse {
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): GetConnectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Connection.foreach(__v => __obj.update("Connection", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionResponse]
    }
  }

  /**
    * Filters the connection definitions that are returned by the <code>GetConnections</code> API operation.
    */
  @js.native
  trait GetConnectionsFilter extends js.Object {
    var ConnectionType: js.UndefOr[ConnectionType]
    var MatchCriteria: js.UndefOr[MatchCriteria]
  }

  object GetConnectionsFilter {
    def apply(
        ConnectionType: js.UndefOr[ConnectionType] = js.undefined,
        MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined
    ): GetConnectionsFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionType.foreach(__v => __obj.update("ConnectionType", __v.asInstanceOf[js.Any]))
      MatchCriteria.foreach(__v => __obj.update("MatchCriteria", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionsFilter]
    }
  }

  @js.native
  trait GetConnectionsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var Filter: js.UndefOr[GetConnectionsFilter]
    var HidePassword: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetConnectionsRequest {
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        Filter: js.UndefOr[GetConnectionsFilter] = js.undefined,
        HidePassword: js.UndefOr[Boolean] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetConnectionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      HidePassword.foreach(__v => __obj.update("HidePassword", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionsRequest]
    }
  }

  @js.native
  trait GetConnectionsResponse extends js.Object {
    var ConnectionList: js.UndefOr[ConnectionList]
    var NextToken: js.UndefOr[Token]
  }

  object GetConnectionsResponse {
    def apply(
        ConnectionList: js.UndefOr[ConnectionList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetConnectionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionList.foreach(__v => __obj.update("ConnectionList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionsResponse]
    }
  }

  @js.native
  trait GetCrawlerMetricsRequest extends js.Object {
    var CrawlerNameList: js.UndefOr[CrawlerNameList]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetCrawlerMetricsRequest {
    def apply(
        CrawlerNameList: js.UndefOr[CrawlerNameList] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCrawlerMetricsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CrawlerNameList.foreach(__v => __obj.update("CrawlerNameList", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlerMetricsRequest]
    }
  }

  @js.native
  trait GetCrawlerMetricsResponse extends js.Object {
    var CrawlerMetricsList: js.UndefOr[CrawlerMetricsList]
    var NextToken: js.UndefOr[Token]
  }

  object GetCrawlerMetricsResponse {
    def apply(
        CrawlerMetricsList: js.UndefOr[CrawlerMetricsList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCrawlerMetricsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CrawlerMetricsList.foreach(__v => __obj.update("CrawlerMetricsList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlerMetricsResponse]
    }
  }

  @js.native
  trait GetCrawlerRequest extends js.Object {
    var Name: NameString
  }

  object GetCrawlerRequest {
    def apply(
        Name: NameString
    ): GetCrawlerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCrawlerRequest]
    }
  }

  @js.native
  trait GetCrawlerResponse extends js.Object {
    var Crawler: js.UndefOr[Crawler]
  }

  object GetCrawlerResponse {
    def apply(
        Crawler: js.UndefOr[Crawler] = js.undefined
    ): GetCrawlerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Crawler.foreach(__v => __obj.update("Crawler", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlerResponse]
    }
  }

  @js.native
  trait GetCrawlersRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetCrawlersRequest {
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCrawlersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlersRequest]
    }
  }

  @js.native
  trait GetCrawlersResponse extends js.Object {
    var Crawlers: js.UndefOr[CrawlerList]
    var NextToken: js.UndefOr[Token]
  }

  object GetCrawlersResponse {
    def apply(
        Crawlers: js.UndefOr[CrawlerList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCrawlersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Crawlers.foreach(__v => __obj.update("Crawlers", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlersResponse]
    }
  }

  @js.native
  trait GetDataCatalogEncryptionSettingsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetDataCatalogEncryptionSettingsRequest {
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetDataCatalogEncryptionSettingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataCatalogEncryptionSettingsRequest]
    }
  }

  @js.native
  trait GetDataCatalogEncryptionSettingsResponse extends js.Object {
    var DataCatalogEncryptionSettings: js.UndefOr[DataCatalogEncryptionSettings]
  }

  object GetDataCatalogEncryptionSettingsResponse {
    def apply(
        DataCatalogEncryptionSettings: js.UndefOr[DataCatalogEncryptionSettings] = js.undefined
    ): GetDataCatalogEncryptionSettingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DataCatalogEncryptionSettings.foreach(
        __v => __obj.update("DataCatalogEncryptionSettings", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetDataCatalogEncryptionSettingsResponse]
    }
  }

  @js.native
  trait GetDatabaseRequest extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetDatabaseRequest {
    def apply(
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetDatabaseRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabaseRequest]
    }
  }

  @js.native
  trait GetDatabaseResponse extends js.Object {
    var Database: js.UndefOr[Database]
  }

  object GetDatabaseResponse {
    def apply(
        Database: js.UndefOr[Database] = js.undefined
    ): GetDatabaseResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Database.foreach(__v => __obj.update("Database", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabaseResponse]
    }
  }

  @js.native
  trait GetDatabasesRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetDatabasesRequest {
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetDatabasesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabasesRequest]
    }
  }

  @js.native
  trait GetDatabasesResponse extends js.Object {
    var DatabaseList: DatabaseList
    var NextToken: js.UndefOr[Token]
  }

  object GetDatabasesResponse {
    def apply(
        DatabaseList: DatabaseList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetDatabasesResponse = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseList" -> DatabaseList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabasesResponse]
    }
  }

  @js.native
  trait GetDataflowGraphRequest extends js.Object {
    var PythonScript: js.UndefOr[PythonScript]
  }

  object GetDataflowGraphRequest {
    def apply(
        PythonScript: js.UndefOr[PythonScript] = js.undefined
    ): GetDataflowGraphRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      PythonScript.foreach(__v => __obj.update("PythonScript", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataflowGraphRequest]
    }
  }

  @js.native
  trait GetDataflowGraphResponse extends js.Object {
    var DagEdges: js.UndefOr[DagEdges]
    var DagNodes: js.UndefOr[DagNodes]
  }

  object GetDataflowGraphResponse {
    def apply(
        DagEdges: js.UndefOr[DagEdges] = js.undefined,
        DagNodes: js.UndefOr[DagNodes] = js.undefined
    ): GetDataflowGraphResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DagEdges.foreach(__v => __obj.update("DagEdges", __v.asInstanceOf[js.Any]))
      DagNodes.foreach(__v => __obj.update("DagNodes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataflowGraphResponse]
    }
  }

  @js.native
  trait GetDevEndpointRequest extends js.Object {
    var EndpointName: GenericString
  }

  object GetDevEndpointRequest {
    def apply(
        EndpointName: GenericString
    ): GetDevEndpointRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDevEndpointRequest]
    }
  }

  @js.native
  trait GetDevEndpointResponse extends js.Object {
    var DevEndpoint: js.UndefOr[DevEndpoint]
  }

  object GetDevEndpointResponse {
    def apply(
        DevEndpoint: js.UndefOr[DevEndpoint] = js.undefined
    ): GetDevEndpointResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DevEndpoint.foreach(__v => __obj.update("DevEndpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevEndpointResponse]
    }
  }

  @js.native
  trait GetDevEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetDevEndpointsRequest {
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetDevEndpointsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevEndpointsRequest]
    }
  }

  @js.native
  trait GetDevEndpointsResponse extends js.Object {
    var DevEndpoints: js.UndefOr[DevEndpointList]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetDevEndpointsResponse {
    def apply(
        DevEndpoints: js.UndefOr[DevEndpointList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetDevEndpointsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DevEndpoints.foreach(__v => __obj.update("DevEndpoints", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevEndpointsResponse]
    }
  }

  @js.native
  trait GetJobRequest extends js.Object {
    var JobName: NameString
  }

  object GetJobRequest {
    def apply(
        JobName: NameString
    ): GetJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobRequest]
    }
  }

  @js.native
  trait GetJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object GetJobResponse {
    def apply(
        Job: js.UndefOr[Job] = js.undefined
    ): GetJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Job.foreach(__v => __obj.update("Job", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobResponse]
    }
  }

  @js.native
  trait GetJobRunRequest extends js.Object {
    var JobName: NameString
    var RunId: IdString
    var PredecessorsIncluded: js.UndefOr[BooleanValue]
  }

  object GetJobRunRequest {
    def apply(
        JobName: NameString,
        RunId: IdString,
        PredecessorsIncluded: js.UndefOr[BooleanValue] = js.undefined
    ): GetJobRunRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobName" -> JobName.asInstanceOf[js.Any],
        "RunId"   -> RunId.asInstanceOf[js.Any]
      )

      PredecessorsIncluded.foreach(__v => __obj.update("PredecessorsIncluded", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobRunRequest]
    }
  }

  @js.native
  trait GetJobRunResponse extends js.Object {
    var JobRun: js.UndefOr[JobRun]
  }

  object GetJobRunResponse {
    def apply(
        JobRun: js.UndefOr[JobRun] = js.undefined
    ): GetJobRunResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobRun.foreach(__v => __obj.update("JobRun", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobRunResponse]
    }
  }

  @js.native
  trait GetJobRunsRequest extends js.Object {
    var JobName: NameString
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetJobRunsRequest {
    def apply(
        JobName: NameString,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetJobRunsRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobRunsRequest]
    }
  }

  @js.native
  trait GetJobRunsResponse extends js.Object {
    var JobRuns: js.UndefOr[JobRunList]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetJobRunsResponse {
    def apply(
        JobRuns: js.UndefOr[JobRunList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetJobRunsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobRuns.foreach(__v => __obj.update("JobRuns", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobRunsResponse]
    }
  }

  @js.native
  trait GetJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetJobsRequest {
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobsRequest]
    }
  }

  @js.native
  trait GetJobsResponse extends js.Object {
    var Jobs: js.UndefOr[JobList]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetJobsResponse {
    def apply(
        Jobs: js.UndefOr[JobList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Jobs.foreach(__v => __obj.update("Jobs", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobsResponse]
    }
  }

  @js.native
  trait GetMappingRequest extends js.Object {
    var Source: CatalogEntry
    var Location: js.UndefOr[Location]
    var Sinks: js.UndefOr[CatalogEntries]
  }

  object GetMappingRequest {
    def apply(
        Source: CatalogEntry,
        Location: js.UndefOr[Location] = js.undefined,
        Sinks: js.UndefOr[CatalogEntries] = js.undefined
    ): GetMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "Source" -> Source.asInstanceOf[js.Any]
      )

      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Sinks.foreach(__v => __obj.update("Sinks", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMappingRequest]
    }
  }

  @js.native
  trait GetMappingResponse extends js.Object {
    var Mapping: MappingList
  }

  object GetMappingResponse {
    def apply(
        Mapping: MappingList
    ): GetMappingResponse = {
      val __obj = js.Dictionary[js.Any](
        "Mapping" -> Mapping.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMappingResponse]
    }
  }

  @js.native
  trait GetPartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionValues: ValueStringList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetPartitionRequest {
    def apply(
        DatabaseName: NameString,
        PartitionValues: ValueStringList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetPartitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"    -> DatabaseName.asInstanceOf[js.Any],
        "PartitionValues" -> PartitionValues.asInstanceOf[js.Any],
        "TableName"       -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionRequest]
    }
  }

  @js.native
  trait GetPartitionResponse extends js.Object {
    var Partition: js.UndefOr[Partition]
  }

  object GetPartitionResponse {
    def apply(
        Partition: js.UndefOr[Partition] = js.undefined
    ): GetPartitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Partition.foreach(__v => __obj.update("Partition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionResponse]
    }
  }

  @js.native
  trait GetPartitionsRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var Expression: js.UndefOr[PredicateString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var Segment: js.UndefOr[Segment]
  }

  object GetPartitionsRequest {
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        Expression: js.UndefOr[PredicateString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        Segment: js.UndefOr[Segment] = js.undefined
    ): GetPartitionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.update("Expression", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Segment.foreach(__v => __obj.update("Segment", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionsRequest]
    }
  }

  @js.native
  trait GetPartitionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Partitions: js.UndefOr[PartitionList]
  }

  object GetPartitionsResponse {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Partitions: js.UndefOr[PartitionList] = js.undefined
    ): GetPartitionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Partitions.foreach(__v => __obj.update("Partitions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionsResponse]
    }
  }

  @js.native
  trait GetPlanRequest extends js.Object {
    var Mapping: MappingList
    var Source: CatalogEntry
    var Language: js.UndefOr[Language]
    var Location: js.UndefOr[Location]
    var Sinks: js.UndefOr[CatalogEntries]
  }

  object GetPlanRequest {
    def apply(
        Mapping: MappingList,
        Source: CatalogEntry,
        Language: js.UndefOr[Language] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Sinks: js.UndefOr[CatalogEntries] = js.undefined
    ): GetPlanRequest = {
      val __obj = js.Dictionary[js.Any](
        "Mapping" -> Mapping.asInstanceOf[js.Any],
        "Source"  -> Source.asInstanceOf[js.Any]
      )

      Language.foreach(__v => __obj.update("Language", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Sinks.foreach(__v => __obj.update("Sinks", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlanRequest]
    }
  }

  @js.native
  trait GetPlanResponse extends js.Object {
    var PythonScript: js.UndefOr[PythonScript]
    var ScalaCode: js.UndefOr[ScalaCode]
  }

  object GetPlanResponse {
    def apply(
        PythonScript: js.UndefOr[PythonScript] = js.undefined,
        ScalaCode: js.UndefOr[ScalaCode] = js.undefined
    ): GetPlanResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      PythonScript.foreach(__v => __obj.update("PythonScript", __v.asInstanceOf[js.Any]))
      ScalaCode.foreach(__v => __obj.update("ScalaCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlanResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {}

  object GetResourcePolicyRequest {
    def apply(
        ): GetResourcePolicyRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetResourcePolicyRequest]
    }
  }

  @js.native
  trait GetResourcePolicyResponse extends js.Object {
    var CreateTime: js.UndefOr[Timestamp]
    var PolicyHash: js.UndefOr[HashString]
    var PolicyInJson: js.UndefOr[PolicyJsonString]
    var UpdateTime: js.UndefOr[Timestamp]
  }

  object GetResourcePolicyResponse {
    def apply(
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        PolicyHash: js.UndefOr[HashString] = js.undefined,
        PolicyInJson: js.UndefOr[PolicyJsonString] = js.undefined,
        UpdateTime: js.UndefOr[Timestamp] = js.undefined
    ): GetResourcePolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CreateTime.foreach(__v => __obj.update("CreateTime", __v.asInstanceOf[js.Any]))
      PolicyHash.foreach(__v => __obj.update("PolicyHash", __v.asInstanceOf[js.Any]))
      PolicyInJson.foreach(__v => __obj.update("PolicyInJson", __v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.update("UpdateTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePolicyResponse]
    }
  }

  @js.native
  trait GetSecurityConfigurationRequest extends js.Object {
    var Name: NameString
  }

  object GetSecurityConfigurationRequest {
    def apply(
        Name: NameString
    ): GetSecurityConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSecurityConfigurationRequest]
    }
  }

  @js.native
  trait GetSecurityConfigurationResponse extends js.Object {
    var SecurityConfiguration: js.UndefOr[SecurityConfiguration]
  }

  object GetSecurityConfigurationResponse {
    def apply(
        SecurityConfiguration: js.UndefOr[SecurityConfiguration] = js.undefined
    ): GetSecurityConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSecurityConfigurationResponse]
    }
  }

  @js.native
  trait GetSecurityConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetSecurityConfigurationsRequest {
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetSecurityConfigurationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSecurityConfigurationsRequest]
    }
  }

  @js.native
  trait GetSecurityConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var SecurityConfigurations: js.UndefOr[SecurityConfigurationList]
  }

  object GetSecurityConfigurationsResponse {
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
    ): GetSecurityConfigurationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SecurityConfigurations.foreach(__v => __obj.update("SecurityConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSecurityConfigurationsResponse]
    }
  }

  @js.native
  trait GetTableRequest extends js.Object {
    var DatabaseName: NameString
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetTableRequest {
    def apply(
        DatabaseName: NameString,
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetTableRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableRequest]
    }
  }

  @js.native
  trait GetTableResponse extends js.Object {
    var Table: js.UndefOr[Table]
  }

  object GetTableResponse {
    def apply(
        Table: js.UndefOr[Table] = js.undefined
    ): GetTableResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Table.foreach(__v => __obj.update("Table", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableResponse]
    }
  }

  @js.native
  trait GetTableVersionRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var VersionId: js.UndefOr[VersionString]
  }

  object GetTableVersionRequest {
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        VersionId: js.UndefOr[VersionString] = js.undefined
    ): GetTableVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableVersionRequest]
    }
  }

  @js.native
  trait GetTableVersionResponse extends js.Object {
    var TableVersion: js.UndefOr[TableVersion]
  }

  object GetTableVersionResponse {
    def apply(
        TableVersion: js.UndefOr[TableVersion] = js.undefined
    ): GetTableVersionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      TableVersion.foreach(__v => __obj.update("TableVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableVersionResponse]
    }
  }

  @js.native
  trait GetTableVersionsRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetTableVersionsRequest {
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetTableVersionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableVersionsRequest]
    }
  }

  @js.native
  trait GetTableVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableVersions: js.UndefOr[GetTableVersionsList]
  }

  object GetTableVersionsResponse {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        TableVersions: js.UndefOr[GetTableVersionsList] = js.undefined
    ): GetTableVersionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TableVersions.foreach(__v => __obj.update("TableVersions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableVersionsResponse]
    }
  }

  @js.native
  trait GetTablesRequest extends js.Object {
    var DatabaseName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var Expression: js.UndefOr[FilterString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetTablesRequest {
    def apply(
        DatabaseName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        Expression: js.UndefOr[FilterString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetTablesRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.update("Expression", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTablesRequest]
    }
  }

  @js.native
  trait GetTablesResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableList: js.UndefOr[TableList]
  }

  object GetTablesResponse {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        TableList: js.UndefOr[TableList] = js.undefined
    ): GetTablesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TableList.foreach(__v => __obj.update("TableList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTablesResponse]
    }
  }

  @js.native
  trait GetTagsRequest extends js.Object {
    var ResourceArn: GlueResourceArn
  }

  object GetTagsRequest {
    def apply(
        ResourceArn: GlueResourceArn
    ): GetTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTagsRequest]
    }
  }

  @js.native
  trait GetTagsResponse extends js.Object {
    var Tags: js.UndefOr[TagsMap]
  }

  object GetTagsResponse {
    def apply(
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): GetTagsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagsResponse]
    }
  }

  @js.native
  trait GetTriggerRequest extends js.Object {
    var Name: NameString
  }

  object GetTriggerRequest {
    def apply(
        Name: NameString
    ): GetTriggerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTriggerRequest]
    }
  }

  @js.native
  trait GetTriggerResponse extends js.Object {
    var Trigger: js.UndefOr[Trigger]
  }

  object GetTriggerResponse {
    def apply(
        Trigger: js.UndefOr[Trigger] = js.undefined
    ): GetTriggerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Trigger.foreach(__v => __obj.update("Trigger", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTriggerResponse]
    }
  }

  @js.native
  trait GetTriggersRequest extends js.Object {
    var DependentJobName: js.UndefOr[NameString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetTriggersRequest {
    def apply(
        DependentJobName: js.UndefOr[NameString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetTriggersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DependentJobName.foreach(__v => __obj.update("DependentJobName", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTriggersRequest]
    }
  }

  @js.native
  trait GetTriggersResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Triggers: js.UndefOr[TriggerList]
  }

  object GetTriggersResponse {
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Triggers: js.UndefOr[TriggerList] = js.undefined
    ): GetTriggersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Triggers.foreach(__v => __obj.update("Triggers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTriggersResponse]
    }
  }

  @js.native
  trait GetUserDefinedFunctionRequest extends js.Object {
    var DatabaseName: NameString
    var FunctionName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetUserDefinedFunctionRequest {
    def apply(
        DatabaseName: NameString,
        FunctionName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetUserDefinedFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait GetUserDefinedFunctionResponse extends js.Object {
    var UserDefinedFunction: js.UndefOr[UserDefinedFunction]
  }

  object GetUserDefinedFunctionResponse {
    def apply(
        UserDefinedFunction: js.UndefOr[UserDefinedFunction] = js.undefined
    ): GetUserDefinedFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UserDefinedFunction.foreach(__v => __obj.update("UserDefinedFunction", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDefinedFunctionResponse]
    }
  }

  @js.native
  trait GetUserDefinedFunctionsRequest extends js.Object {
    var DatabaseName: NameString
    var Pattern: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetUserDefinedFunctionsRequest {
    def apply(
        DatabaseName: NameString,
        Pattern: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetUserDefinedFunctionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Pattern"      -> Pattern.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDefinedFunctionsRequest]
    }
  }

  @js.native
  trait GetUserDefinedFunctionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList]
  }

  object GetUserDefinedFunctionsResponse {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList] = js.undefined
    ): GetUserDefinedFunctionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      UserDefinedFunctions.foreach(__v => __obj.update("UserDefinedFunctions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDefinedFunctionsResponse]
    }
  }

  /**
    * A classifier that uses <code>grok</code> patterns.
    */
  @js.native
  trait GrokClassifier extends js.Object {
    var Classification: Classification
    var GrokPattern: GrokPattern
    var Name: NameString
    var CreationTime: js.UndefOr[Timestamp]
    var CustomPatterns: js.UndefOr[CustomPatterns]
    var LastUpdated: js.UndefOr[Timestamp]
    var Version: js.UndefOr[VersionId]
  }

  object GrokClassifier {
    def apply(
        Classification: Classification,
        GrokPattern: GrokPattern,
        Name: NameString,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CustomPatterns: js.UndefOr[CustomPatterns] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        Version: js.UndefOr[VersionId] = js.undefined
    ): GrokClassifier = {
      val __obj = js.Dictionary[js.Any](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "GrokPattern"    -> GrokPattern.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      CustomPatterns.foreach(__v => __obj.update("CustomPatterns", __v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.update("LastUpdated", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrokClassifier]
    }
  }

  @js.native
  trait ImportCatalogToGlueRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object ImportCatalogToGlueRequest {
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): ImportCatalogToGlueRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCatalogToGlueRequest]
    }
  }

  @js.native
  trait ImportCatalogToGlueResponse extends js.Object {}

  object ImportCatalogToGlueResponse {
    def apply(
        ): ImportCatalogToGlueResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ImportCatalogToGlueResponse]
    }
  }

  /**
    * Specifies a JDBC data store to crawl.
    */
  @js.native
  trait JdbcTarget extends js.Object {
    var ConnectionName: js.UndefOr[ConnectionName]
    var Exclusions: js.UndefOr[PathList]
    var Path: js.UndefOr[Path]
  }

  object JdbcTarget {
    def apply(
        ConnectionName: js.UndefOr[ConnectionName] = js.undefined,
        Exclusions: js.UndefOr[PathList] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined
    ): JdbcTarget = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionName.foreach(__v => __obj.update("ConnectionName", __v.asInstanceOf[js.Any]))
      Exclusions.foreach(__v => __obj.update("Exclusions", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JdbcTarget]
    }
  }

  /**
    * Specifies a job definition.
    */
  @js.native
  trait Job extends js.Object {
    var AllocatedCapacity: js.UndefOr[IntegerValue]
    var Command: js.UndefOr[JobCommand]
    var Connections: js.UndefOr[ConnectionsList]
    var CreatedOn: js.UndefOr[TimestampValue]
    var DefaultArguments: js.UndefOr[GenericMap]
    var Description: js.UndefOr[DescriptionString]
    var ExecutionProperty: js.UndefOr[ExecutionProperty]
    var LastModifiedOn: js.UndefOr[TimestampValue]
    var LogUri: js.UndefOr[UriString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[MaxRetries]
    var Name: js.UndefOr[NameString]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var Role: js.UndefOr[RoleString]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Timeout: js.UndefOr[Timeout]
    var WorkerType: js.UndefOr[WorkerType]
  }

  object Job {
    def apply(
        AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
        Command: js.UndefOr[JobCommand] = js.undefined,
        Connections: js.UndefOr[ConnectionsList] = js.undefined,
        CreatedOn: js.UndefOr[TimestampValue] = js.undefined,
        DefaultArguments: js.UndefOr[GenericMap] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        ExecutionProperty: js.UndefOr[ExecutionProperty] = js.undefined,
        LastModifiedOn: js.UndefOr[TimestampValue] = js.undefined,
        LogUri: js.UndefOr[UriString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        Role: js.UndefOr[RoleString] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): Job = {
      val __obj = js.Dictionary.empty[js.Any]
      AllocatedCapacity.foreach(__v => __obj.update("AllocatedCapacity", __v.asInstanceOf[js.Any]))
      Command.foreach(__v => __obj.update("Command", __v.asInstanceOf[js.Any]))
      Connections.foreach(__v => __obj.update("Connections", __v.asInstanceOf[js.Any]))
      CreatedOn.foreach(__v => __obj.update("CreatedOn", __v.asInstanceOf[js.Any]))
      DefaultArguments.foreach(__v => __obj.update("DefaultArguments", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ExecutionProperty.foreach(__v => __obj.update("ExecutionProperty", __v.asInstanceOf[js.Any]))
      LastModifiedOn.foreach(__v => __obj.update("LastModifiedOn", __v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.update("LogUri", __v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.update("MaxCapacity", __v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.update("MaxRetries", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.update("NotificationProperty", __v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.update("NumberOfWorkers", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.update("Timeout", __v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.update("WorkerType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /**
    * Defines a point which a job can resume processing.
    */
  @js.native
  trait JobBookmarkEntry extends js.Object {
    var Attempt: js.UndefOr[IntegerValue]
    var JobBookmark: js.UndefOr[JsonValue]
    var JobName: js.UndefOr[JobName]
    var Run: js.UndefOr[IntegerValue]
    var Version: js.UndefOr[IntegerValue]
  }

  object JobBookmarkEntry {
    def apply(
        Attempt: js.UndefOr[IntegerValue] = js.undefined,
        JobBookmark: js.UndefOr[JsonValue] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        Run: js.UndefOr[IntegerValue] = js.undefined,
        Version: js.UndefOr[IntegerValue] = js.undefined
    ): JobBookmarkEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Attempt.foreach(__v => __obj.update("Attempt", __v.asInstanceOf[js.Any]))
      JobBookmark.foreach(__v => __obj.update("JobBookmark", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      Run.foreach(__v => __obj.update("Run", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobBookmarkEntry]
    }
  }

  /**
    * Specifies how Job bookmark data should be encrypted.
    */
  @js.native
  trait JobBookmarksEncryption extends js.Object {
    var JobBookmarksEncryptionMode: js.UndefOr[JobBookmarksEncryptionMode]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  object JobBookmarksEncryption {
    def apply(
        JobBookmarksEncryptionMode: js.UndefOr[JobBookmarksEncryptionMode] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
    ): JobBookmarksEncryption = {
      val __obj = js.Dictionary.empty[js.Any]
      JobBookmarksEncryptionMode.foreach(__v => __obj.update("JobBookmarksEncryptionMode", __v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.update("KmsKeyArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobBookmarksEncryption]
    }
  }

  object JobBookmarksEncryptionModeEnum {
    val DISABLED  = "DISABLED"
    val `CSE-KMS` = "CSE-KMS"

    val values = IndexedSeq(DISABLED, `CSE-KMS`)
  }

  /**
    * Specifies code executed when a job is run.
    */
  @js.native
  trait JobCommand extends js.Object {
    var Name: js.UndefOr[GenericString]
    var ScriptLocation: js.UndefOr[ScriptLocationString]
  }

  object JobCommand {
    def apply(
        Name: js.UndefOr[GenericString] = js.undefined,
        ScriptLocation: js.UndefOr[ScriptLocationString] = js.undefined
    ): JobCommand = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ScriptLocation.foreach(__v => __obj.update("ScriptLocation", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobCommand]
    }
  }

  /**
    * Contains information about a job run.
    */
  @js.native
  trait JobRun extends js.Object {
    var AllocatedCapacity: js.UndefOr[IntegerValue]
    var Arguments: js.UndefOr[GenericMap]
    var Attempt: js.UndefOr[AttemptCount]
    var CompletedOn: js.UndefOr[TimestampValue]
    var ErrorMessage: js.UndefOr[ErrorString]
    var ExecutionTime: js.UndefOr[ExecutionTime]
    var Id: js.UndefOr[IdString]
    var JobName: js.UndefOr[NameString]
    var JobRunState: js.UndefOr[JobRunState]
    var LastModifiedOn: js.UndefOr[TimestampValue]
    var LogGroupName: js.UndefOr[GenericString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var PredecessorRuns: js.UndefOr[PredecessorList]
    var PreviousRunId: js.UndefOr[IdString]
    var SecurityConfiguration: js.UndefOr[NameString]
    var StartedOn: js.UndefOr[TimestampValue]
    var Timeout: js.UndefOr[Timeout]
    var TriggerName: js.UndefOr[NameString]
    var WorkerType: js.UndefOr[WorkerType]
  }

  object JobRun {
    def apply(
        AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
        Arguments: js.UndefOr[GenericMap] = js.undefined,
        Attempt: js.UndefOr[AttemptCount] = js.undefined,
        CompletedOn: js.UndefOr[TimestampValue] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorString] = js.undefined,
        ExecutionTime: js.UndefOr[ExecutionTime] = js.undefined,
        Id: js.UndefOr[IdString] = js.undefined,
        JobName: js.UndefOr[NameString] = js.undefined,
        JobRunState: js.UndefOr[JobRunState] = js.undefined,
        LastModifiedOn: js.UndefOr[TimestampValue] = js.undefined,
        LogGroupName: js.UndefOr[GenericString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        PredecessorRuns: js.UndefOr[PredecessorList] = js.undefined,
        PreviousRunId: js.UndefOr[IdString] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        StartedOn: js.UndefOr[TimestampValue] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        TriggerName: js.UndefOr[NameString] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): JobRun = {
      val __obj = js.Dictionary.empty[js.Any]
      AllocatedCapacity.foreach(__v => __obj.update("AllocatedCapacity", __v.asInstanceOf[js.Any]))
      Arguments.foreach(__v => __obj.update("Arguments", __v.asInstanceOf[js.Any]))
      Attempt.foreach(__v => __obj.update("Attempt", __v.asInstanceOf[js.Any]))
      CompletedOn.foreach(__v => __obj.update("CompletedOn", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      ExecutionTime.foreach(__v => __obj.update("ExecutionTime", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      JobRunState.foreach(__v => __obj.update("JobRunState", __v.asInstanceOf[js.Any]))
      LastModifiedOn.foreach(__v => __obj.update("LastModifiedOn", __v.asInstanceOf[js.Any]))
      LogGroupName.foreach(__v => __obj.update("LogGroupName", __v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.update("MaxCapacity", __v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.update("NotificationProperty", __v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.update("NumberOfWorkers", __v.asInstanceOf[js.Any]))
      PredecessorRuns.foreach(__v => __obj.update("PredecessorRuns", __v.asInstanceOf[js.Any]))
      PreviousRunId.foreach(__v => __obj.update("PreviousRunId", __v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      StartedOn.foreach(__v => __obj.update("StartedOn", __v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.update("Timeout", __v.asInstanceOf[js.Any]))
      TriggerName.foreach(__v => __obj.update("TriggerName", __v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.update("WorkerType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobRun]
    }
  }

  object JobRunStateEnum {
    val STARTING  = "STARTING"
    val RUNNING   = "RUNNING"
    val STOPPING  = "STOPPING"
    val STOPPED   = "STOPPED"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED    = "FAILED"
    val TIMEOUT   = "TIMEOUT"

    val values = IndexedSeq(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
  }

  /**
    * Specifies information used to update an existing job definition. Note that the previous job definition will be completely overwritten by this information.
    */
  @js.native
  trait JobUpdate extends js.Object {
    var AllocatedCapacity: js.UndefOr[IntegerValue]
    var Command: js.UndefOr[JobCommand]
    var Connections: js.UndefOr[ConnectionsList]
    var DefaultArguments: js.UndefOr[GenericMap]
    var Description: js.UndefOr[DescriptionString]
    var ExecutionProperty: js.UndefOr[ExecutionProperty]
    var LogUri: js.UndefOr[UriString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[MaxRetries]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var Role: js.UndefOr[RoleString]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Timeout: js.UndefOr[Timeout]
    var WorkerType: js.UndefOr[WorkerType]
  }

  object JobUpdate {
    def apply(
        AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
        Command: js.UndefOr[JobCommand] = js.undefined,
        Connections: js.UndefOr[ConnectionsList] = js.undefined,
        DefaultArguments: js.UndefOr[GenericMap] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        ExecutionProperty: js.UndefOr[ExecutionProperty] = js.undefined,
        LogUri: js.UndefOr[UriString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        Role: js.UndefOr[RoleString] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): JobUpdate = {
      val __obj = js.Dictionary.empty[js.Any]
      AllocatedCapacity.foreach(__v => __obj.update("AllocatedCapacity", __v.asInstanceOf[js.Any]))
      Command.foreach(__v => __obj.update("Command", __v.asInstanceOf[js.Any]))
      Connections.foreach(__v => __obj.update("Connections", __v.asInstanceOf[js.Any]))
      DefaultArguments.foreach(__v => __obj.update("DefaultArguments", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ExecutionProperty.foreach(__v => __obj.update("ExecutionProperty", __v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.update("LogUri", __v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.update("MaxCapacity", __v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.update("MaxRetries", __v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.update("NotificationProperty", __v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.update("NumberOfWorkers", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.update("Timeout", __v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.update("WorkerType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobUpdate]
    }
  }

  /**
    * A classifier for <code>JSON</code> content.
    */
  @js.native
  trait JsonClassifier extends js.Object {
    var JsonPath: JsonPath
    var Name: NameString
    var CreationTime: js.UndefOr[Timestamp]
    var LastUpdated: js.UndefOr[Timestamp]
    var Version: js.UndefOr[VersionId]
  }

  object JsonClassifier {
    def apply(
        JsonPath: JsonPath,
        Name: NameString,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        Version: js.UndefOr[VersionId] = js.undefined
    ): JsonClassifier = {
      val __obj = js.Dictionary[js.Any](
        "JsonPath" -> JsonPath.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.update("LastUpdated", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JsonClassifier]
    }
  }

  object LanguageEnum {
    val PYTHON = "PYTHON"
    val SCALA  = "SCALA"

    val values = IndexedSeq(PYTHON, SCALA)
  }

  /**
    * Status and error information about the most recent crawl.
    */
  @js.native
  trait LastCrawlInfo extends js.Object {
    var ErrorMessage: js.UndefOr[DescriptionString]
    var LogGroup: js.UndefOr[LogGroup]
    var LogStream: js.UndefOr[LogStream]
    var MessagePrefix: js.UndefOr[MessagePrefix]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[LastCrawlStatus]
  }

  object LastCrawlInfo {
    def apply(
        ErrorMessage: js.UndefOr[DescriptionString] = js.undefined,
        LogGroup: js.UndefOr[LogGroup] = js.undefined,
        LogStream: js.UndefOr[LogStream] = js.undefined,
        MessagePrefix: js.UndefOr[MessagePrefix] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[LastCrawlStatus] = js.undefined
    ): LastCrawlInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      LogGroup.foreach(__v => __obj.update("LogGroup", __v.asInstanceOf[js.Any]))
      LogStream.foreach(__v => __obj.update("LogStream", __v.asInstanceOf[js.Any]))
      MessagePrefix.foreach(__v => __obj.update("MessagePrefix", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LastCrawlInfo]
    }
  }

  object LastCrawlStatusEnum {
    val SUCCEEDED = "SUCCEEDED"
    val CANCELLED = "CANCELLED"
    val FAILED    = "FAILED"

    val values = IndexedSeq(SUCCEEDED, CANCELLED, FAILED)
  }

  @js.native
  trait ListCrawlersRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[TagsMap]
  }

  object ListCrawlersRequest {
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): ListCrawlersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCrawlersRequest]
    }
  }

  @js.native
  trait ListCrawlersResponse extends js.Object {
    var CrawlerNames: js.UndefOr[CrawlerNameList]
    var NextToken: js.UndefOr[Token]
  }

  object ListCrawlersResponse {
    def apply(
        CrawlerNames: js.UndefOr[CrawlerNameList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListCrawlersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CrawlerNames.foreach(__v => __obj.update("CrawlerNames", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCrawlersResponse]
    }
  }

  @js.native
  trait ListDevEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagsMap]
  }

  object ListDevEndpointsRequest {
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): ListDevEndpointsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevEndpointsRequest]
    }
  }

  @js.native
  trait ListDevEndpointsResponse extends js.Object {
    var DevEndpointNames: js.UndefOr[DevEndpointNameList]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListDevEndpointsResponse {
    def apply(
        DevEndpointNames: js.UndefOr[DevEndpointNameList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListDevEndpointsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DevEndpointNames.foreach(__v => __obj.update("DevEndpointNames", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevEndpointsResponse]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagsMap]
  }

  object ListJobsRequest {
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var JobNames: js.UndefOr[JobNameList]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListJobsResponse {
    def apply(
        JobNames: js.UndefOr[JobNameList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListJobsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobNames.foreach(__v => __obj.update("JobNames", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResponse]
    }
  }

  @js.native
  trait ListTriggersRequest extends js.Object {
    var DependentJobName: js.UndefOr[NameString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagsMap]
  }

  object ListTriggersRequest {
    def apply(
        DependentJobName: js.UndefOr[NameString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTriggersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DependentJobName.foreach(__v => __obj.update("DependentJobName", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTriggersRequest]
    }
  }

  @js.native
  trait ListTriggersResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var TriggerNames: js.UndefOr[TriggerNameList]
  }

  object ListTriggersResponse {
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        TriggerNames: js.UndefOr[TriggerNameList] = js.undefined
    ): ListTriggersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TriggerNames.foreach(__v => __obj.update("TriggerNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTriggersResponse]
    }
  }

  /**
    * The location of resources.
    */
  @js.native
  trait Location extends js.Object {
    var DynamoDB: js.UndefOr[CodeGenNodeArgs]
    var Jdbc: js.UndefOr[CodeGenNodeArgs]
    var S3: js.UndefOr[CodeGenNodeArgs]
  }

  object Location {
    def apply(
        DynamoDB: js.UndefOr[CodeGenNodeArgs] = js.undefined,
        Jdbc: js.UndefOr[CodeGenNodeArgs] = js.undefined,
        S3: js.UndefOr[CodeGenNodeArgs] = js.undefined
    ): Location = {
      val __obj = js.Dictionary.empty[js.Any]
      DynamoDB.foreach(__v => __obj.update("DynamoDB", __v.asInstanceOf[js.Any]))
      Jdbc.foreach(__v => __obj.update("Jdbc", __v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.update("S3", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Location]
    }
  }

  object LogicalEnum {
    val AND = "AND"
    val ANY = "ANY"

    val values = IndexedSeq(AND, ANY)
  }

  object LogicalOperatorEnum {
    val EQUALS = "EQUALS"

    val values = IndexedSeq(EQUALS)
  }

  /**
    * Defines a mapping.
    */
  @js.native
  trait MappingEntry extends js.Object {
    var SourcePath: js.UndefOr[SchemaPathString]
    var SourceTable: js.UndefOr[TableName]
    var SourceType: js.UndefOr[FieldType]
    var TargetPath: js.UndefOr[SchemaPathString]
    var TargetTable: js.UndefOr[TableName]
    var TargetType: js.UndefOr[FieldType]
  }

  object MappingEntry {
    def apply(
        SourcePath: js.UndefOr[SchemaPathString] = js.undefined,
        SourceTable: js.UndefOr[TableName] = js.undefined,
        SourceType: js.UndefOr[FieldType] = js.undefined,
        TargetPath: js.UndefOr[SchemaPathString] = js.undefined,
        TargetTable: js.UndefOr[TableName] = js.undefined,
        TargetType: js.UndefOr[FieldType] = js.undefined
    ): MappingEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      SourcePath.foreach(__v => __obj.update("SourcePath", __v.asInstanceOf[js.Any]))
      SourceTable.foreach(__v => __obj.update("SourceTable", __v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.update("SourceType", __v.asInstanceOf[js.Any]))
      TargetPath.foreach(__v => __obj.update("TargetPath", __v.asInstanceOf[js.Any]))
      TargetTable.foreach(__v => __obj.update("TargetTable", __v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.update("TargetType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MappingEntry]
    }
  }

  /**
    * Specifies configuration properties of a notification.
    */
  @js.native
  trait NotificationProperty extends js.Object {
    var NotifyDelayAfter: js.UndefOr[NotifyDelayAfter]
  }

  object NotificationProperty {
    def apply(
        NotifyDelayAfter: js.UndefOr[NotifyDelayAfter] = js.undefined
    ): NotificationProperty = {
      val __obj = js.Dictionary.empty[js.Any]
      NotifyDelayAfter.foreach(__v => __obj.update("NotifyDelayAfter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationProperty]
    }
  }

  /**
    * Specifies the sort order of a sorted column.
    */
  @js.native
  trait Order extends js.Object {
    var Column: NameString
    var SortOrder: IntegerFlag
  }

  object Order {
    def apply(
        Column: NameString,
        SortOrder: IntegerFlag
    ): Order = {
      val __obj = js.Dictionary[js.Any](
        "Column"    -> Column.asInstanceOf[js.Any],
        "SortOrder" -> SortOrder.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Order]
    }
  }

  /**
    * Represents a slice of table data.
    */
  @js.native
  trait Partition extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatabaseName: js.UndefOr[NameString]
    var LastAccessTime: js.UndefOr[Timestamp]
    var LastAnalyzedTime: js.UndefOr[Timestamp]
    var Parameters: js.UndefOr[ParametersMap]
    var StorageDescriptor: js.UndefOr[StorageDescriptor]
    var TableName: js.UndefOr[NameString]
    var Values: js.UndefOr[ValueStringList]
  }

  object Partition {
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatabaseName: js.UndefOr[NameString] = js.undefined,
        LastAccessTime: js.UndefOr[Timestamp] = js.undefined,
        LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined,
        TableName: js.UndefOr[NameString] = js.undefined,
        Values: js.UndefOr[ValueStringList] = js.undefined
    ): Partition = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      LastAccessTime.foreach(__v => __obj.update("LastAccessTime", __v.asInstanceOf[js.Any]))
      LastAnalyzedTime.foreach(__v => __obj.update("LastAnalyzedTime", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      StorageDescriptor.foreach(__v => __obj.update("StorageDescriptor", __v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.update("TableName", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Partition]
    }
  }

  /**
    * Contains information about a partition error.
    */
  @js.native
  trait PartitionError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var PartitionValues: js.UndefOr[ValueStringList]
  }

  object PartitionError {
    def apply(
        ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined,
        PartitionValues: js.UndefOr[ValueStringList] = js.undefined
    ): PartitionError = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorDetail.foreach(__v => __obj.update("ErrorDetail", __v.asInstanceOf[js.Any]))
      PartitionValues.foreach(__v => __obj.update("PartitionValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartitionError]
    }
  }

  /**
    * The structure used to create and update a partion.
    */
  @js.native
  trait PartitionInput extends js.Object {
    var LastAccessTime: js.UndefOr[Timestamp]
    var LastAnalyzedTime: js.UndefOr[Timestamp]
    var Parameters: js.UndefOr[ParametersMap]
    var StorageDescriptor: js.UndefOr[StorageDescriptor]
    var Values: js.UndefOr[ValueStringList]
  }

  object PartitionInput {
    def apply(
        LastAccessTime: js.UndefOr[Timestamp] = js.undefined,
        LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined,
        Values: js.UndefOr[ValueStringList] = js.undefined
    ): PartitionInput = {
      val __obj = js.Dictionary.empty[js.Any]
      LastAccessTime.foreach(__v => __obj.update("LastAccessTime", __v.asInstanceOf[js.Any]))
      LastAnalyzedTime.foreach(__v => __obj.update("LastAnalyzedTime", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      StorageDescriptor.foreach(__v => __obj.update("StorageDescriptor", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartitionInput]
    }
  }

  /**
    * Contains a list of values defining partitions.
    */
  @js.native
  trait PartitionValueList extends js.Object {
    var Values: ValueStringList
  }

  object PartitionValueList {
    def apply(
        Values: ValueStringList
    ): PartitionValueList = {
      val __obj = js.Dictionary[js.Any](
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PartitionValueList]
    }
  }

  /**
    * Specifies the physical requirements for a connection.
    */
  @js.native
  trait PhysicalConnectionRequirements extends js.Object {
    var AvailabilityZone: js.UndefOr[NameString]
    var SecurityGroupIdList: js.UndefOr[SecurityGroupIdList]
    var SubnetId: js.UndefOr[NameString]
  }

  object PhysicalConnectionRequirements {
    def apply(
        AvailabilityZone: js.UndefOr[NameString] = js.undefined,
        SecurityGroupIdList: js.UndefOr[SecurityGroupIdList] = js.undefined,
        SubnetId: js.UndefOr[NameString] = js.undefined
    ): PhysicalConnectionRequirements = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      SecurityGroupIdList.foreach(__v => __obj.update("SecurityGroupIdList", __v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.update("SubnetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhysicalConnectionRequirements]
    }
  }

  /**
    * A job run that was used in the predicate of a conditional trigger that triggered this job run.
    */
  @js.native
  trait Predecessor extends js.Object {
    var JobName: js.UndefOr[NameString]
    var RunId: js.UndefOr[IdString]
  }

  object Predecessor {
    def apply(
        JobName: js.UndefOr[NameString] = js.undefined,
        RunId: js.UndefOr[IdString] = js.undefined
    ): Predecessor = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      RunId.foreach(__v => __obj.update("RunId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Predecessor]
    }
  }

  /**
    * Defines the predicate of the trigger, which determines when it fires.
    */
  @js.native
  trait Predicate extends js.Object {
    var Conditions: js.UndefOr[ConditionList]
    var Logical: js.UndefOr[Logical]
  }

  object Predicate {
    def apply(
        Conditions: js.UndefOr[ConditionList] = js.undefined,
        Logical: js.UndefOr[Logical] = js.undefined
    ): Predicate = {
      val __obj = js.Dictionary.empty[js.Any]
      Conditions.foreach(__v => __obj.update("Conditions", __v.asInstanceOf[js.Any]))
      Logical.foreach(__v => __obj.update("Logical", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Predicate]
    }
  }

  object PrincipalTypeEnum {
    val USER  = "USER"
    val ROLE  = "ROLE"
    val GROUP = "GROUP"

    val values = IndexedSeq(USER, ROLE, GROUP)
  }

  @js.native
  trait PutDataCatalogEncryptionSettingsRequest extends js.Object {
    var DataCatalogEncryptionSettings: DataCatalogEncryptionSettings
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object PutDataCatalogEncryptionSettingsRequest {
    def apply(
        DataCatalogEncryptionSettings: DataCatalogEncryptionSettings,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): PutDataCatalogEncryptionSettingsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DataCatalogEncryptionSettings" -> DataCatalogEncryptionSettings.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDataCatalogEncryptionSettingsRequest]
    }
  }

  @js.native
  trait PutDataCatalogEncryptionSettingsResponse extends js.Object {}

  object PutDataCatalogEncryptionSettingsResponse {
    def apply(
        ): PutDataCatalogEncryptionSettingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutDataCatalogEncryptionSettingsResponse]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var PolicyInJson: PolicyJsonString
    var PolicyExistsCondition: js.UndefOr[ExistCondition]
    var PolicyHashCondition: js.UndefOr[HashString]
  }

  object PutResourcePolicyRequest {
    def apply(
        PolicyInJson: PolicyJsonString,
        PolicyExistsCondition: js.UndefOr[ExistCondition] = js.undefined,
        PolicyHashCondition: js.UndefOr[HashString] = js.undefined
    ): PutResourcePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "PolicyInJson" -> PolicyInJson.asInstanceOf[js.Any]
      )

      PolicyExistsCondition.foreach(__v => __obj.update("PolicyExistsCondition", __v.asInstanceOf[js.Any]))
      PolicyHashCondition.foreach(__v => __obj.update("PolicyHashCondition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object {
    var PolicyHash: js.UndefOr[HashString]
  }

  object PutResourcePolicyResponse {
    def apply(
        PolicyHash: js.UndefOr[HashString] = js.undefined
    ): PutResourcePolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      PolicyHash.foreach(__v => __obj.update("PolicyHash", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyResponse]
    }
  }

  @js.native
  trait ResetJobBookmarkRequest extends js.Object {
    var JobName: JobName
  }

  object ResetJobBookmarkRequest {
    def apply(
        JobName: JobName
    ): ResetJobBookmarkRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResetJobBookmarkRequest]
    }
  }

  @js.native
  trait ResetJobBookmarkResponse extends js.Object {
    var JobBookmarkEntry: js.UndefOr[JobBookmarkEntry]
  }

  object ResetJobBookmarkResponse {
    def apply(
        JobBookmarkEntry: js.UndefOr[JobBookmarkEntry] = js.undefined
    ): ResetJobBookmarkResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobBookmarkEntry.foreach(__v => __obj.update("JobBookmarkEntry", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetJobBookmarkResponse]
    }
  }

  object ResourceTypeEnum {
    val JAR     = "JAR"
    val FILE    = "FILE"
    val ARCHIVE = "ARCHIVE"

    val values = IndexedSeq(JAR, FILE, ARCHIVE)
  }

  /**
    * URIs for function resources.
    */
  @js.native
  trait ResourceUri extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Uri: js.UndefOr[URI]
  }

  object ResourceUri {
    def apply(
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        Uri: js.UndefOr[URI] = js.undefined
    ): ResourceUri = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Uri.foreach(__v => __obj.update("Uri", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceUri]
    }
  }

  /**
    * Specifies how S3 data should be encrypted.
    */
  @js.native
  trait S3Encryption extends js.Object {
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var S3EncryptionMode: js.UndefOr[S3EncryptionMode]
  }

  object S3Encryption {
    def apply(
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        S3EncryptionMode: js.UndefOr[S3EncryptionMode] = js.undefined
    ): S3Encryption = {
      val __obj = js.Dictionary.empty[js.Any]
      KmsKeyArn.foreach(__v => __obj.update("KmsKeyArn", __v.asInstanceOf[js.Any]))
      S3EncryptionMode.foreach(__v => __obj.update("S3EncryptionMode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Encryption]
    }
  }

  object S3EncryptionModeEnum {
    val DISABLED  = "DISABLED"
    val `SSE-KMS` = "SSE-KMS"
    val `SSE-S3`  = "SSE-S3"

    val values = IndexedSeq(DISABLED, `SSE-KMS`, `SSE-S3`)
  }

  /**
    * Specifies a data store in Amazon S3.
    */
  @js.native
  trait S3Target extends js.Object {
    var Exclusions: js.UndefOr[PathList]
    var Path: js.UndefOr[Path]
  }

  object S3Target {
    def apply(
        Exclusions: js.UndefOr[PathList] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined
    ): S3Target = {
      val __obj = js.Dictionary.empty[js.Any]
      Exclusions.foreach(__v => __obj.update("Exclusions", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Target]
    }
  }

  /**
    * A scheduling object using a <code>cron</code> statement to schedule an event.
    */
  @js.native
  trait Schedule extends js.Object {
    var ScheduleExpression: js.UndefOr[CronExpression]
    var State: js.UndefOr[ScheduleState]
  }

  object Schedule {
    def apply(
        ScheduleExpression: js.UndefOr[CronExpression] = js.undefined,
        State: js.UndefOr[ScheduleState] = js.undefined
    ): Schedule = {
      val __obj = js.Dictionary.empty[js.Any]
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schedule]
    }
  }

  object ScheduleStateEnum {
    val SCHEDULED     = "SCHEDULED"
    val NOT_SCHEDULED = "NOT_SCHEDULED"
    val TRANSITIONING = "TRANSITIONING"

    val values = IndexedSeq(SCHEDULED, NOT_SCHEDULED, TRANSITIONING)
  }

  /**
    * Crawler policy for update and deletion behavior.
    */
  @js.native
  trait SchemaChangePolicy extends js.Object {
    var DeleteBehavior: js.UndefOr[DeleteBehavior]
    var UpdateBehavior: js.UndefOr[UpdateBehavior]
  }

  object SchemaChangePolicy {
    def apply(
        DeleteBehavior: js.UndefOr[DeleteBehavior] = js.undefined,
        UpdateBehavior: js.UndefOr[UpdateBehavior] = js.undefined
    ): SchemaChangePolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      DeleteBehavior.foreach(__v => __obj.update("DeleteBehavior", __v.asInstanceOf[js.Any]))
      UpdateBehavior.foreach(__v => __obj.update("UpdateBehavior", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaChangePolicy]
    }
  }

  /**
    * Specifies a security configuration.
    */
  @js.native
  trait SecurityConfiguration extends js.Object {
    var CreatedTimeStamp: js.UndefOr[TimestampValue]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var Name: js.UndefOr[NameString]
  }

  object SecurityConfiguration {
    def apply(
        CreatedTimeStamp: js.UndefOr[TimestampValue] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined
    ): SecurityConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedTimeStamp.foreach(__v => __obj.update("CreatedTimeStamp", __v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.update("EncryptionConfiguration", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityConfiguration]
    }
  }

  /**
    * Defines a non-overlapping region of a table's partitions, allowing multiple requests to be executed in parallel.
    */
  @js.native
  trait Segment extends js.Object {
    var SegmentNumber: NonNegativeInteger
    var TotalSegments: TotalSegmentsInteger
  }

  object Segment {
    def apply(
        SegmentNumber: NonNegativeInteger,
        TotalSegments: TotalSegmentsInteger
    ): Segment = {
      val __obj = js.Dictionary[js.Any](
        "SegmentNumber" -> SegmentNumber.asInstanceOf[js.Any],
        "TotalSegments" -> TotalSegments.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Segment]
    }
  }

  /**
    * Information about a serialization/deserialization program (SerDe) which serves as an extractor and loader.
    */
  @js.native
  trait SerDeInfo extends js.Object {
    var Name: js.UndefOr[NameString]
    var Parameters: js.UndefOr[ParametersMap]
    var SerializationLibrary: js.UndefOr[NameString]
  }

  object SerDeInfo {
    def apply(
        Name: js.UndefOr[NameString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        SerializationLibrary: js.UndefOr[NameString] = js.undefined
    ): SerDeInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      SerializationLibrary.foreach(__v => __obj.update("SerializationLibrary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SerDeInfo]
    }
  }

  /**
    * Specifies skewed values in a table. Skewed are ones that occur with very high frequency.
    */
  @js.native
  trait SkewedInfo extends js.Object {
    var SkewedColumnNames: js.UndefOr[NameStringList]
    var SkewedColumnValueLocationMaps: js.UndefOr[LocationMap]
    var SkewedColumnValues: js.UndefOr[ColumnValueStringList]
  }

  object SkewedInfo {
    def apply(
        SkewedColumnNames: js.UndefOr[NameStringList] = js.undefined,
        SkewedColumnValueLocationMaps: js.UndefOr[LocationMap] = js.undefined,
        SkewedColumnValues: js.UndefOr[ColumnValueStringList] = js.undefined
    ): SkewedInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      SkewedColumnNames.foreach(__v => __obj.update("SkewedColumnNames", __v.asInstanceOf[js.Any]))
      SkewedColumnValueLocationMaps.foreach(
        __v => __obj.update("SkewedColumnValueLocationMaps", __v.asInstanceOf[js.Any])
      )
      SkewedColumnValues.foreach(__v => __obj.update("SkewedColumnValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SkewedInfo]
    }
  }

  @js.native
  trait StartCrawlerRequest extends js.Object {
    var Name: NameString
  }

  object StartCrawlerRequest {
    def apply(
        Name: NameString
    ): StartCrawlerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartCrawlerRequest]
    }
  }

  @js.native
  trait StartCrawlerResponse extends js.Object {}

  object StartCrawlerResponse {
    def apply(
        ): StartCrawlerResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StartCrawlerResponse]
    }
  }

  @js.native
  trait StartCrawlerScheduleRequest extends js.Object {
    var CrawlerName: NameString
  }

  object StartCrawlerScheduleRequest {
    def apply(
        CrawlerName: NameString
    ): StartCrawlerScheduleRequest = {
      val __obj = js.Dictionary[js.Any](
        "CrawlerName" -> CrawlerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartCrawlerScheduleRequest]
    }
  }

  @js.native
  trait StartCrawlerScheduleResponse extends js.Object {}

  object StartCrawlerScheduleResponse {
    def apply(
        ): StartCrawlerScheduleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StartCrawlerScheduleResponse]
    }
  }

  @js.native
  trait StartJobRunRequest extends js.Object {
    var JobName: NameString
    var AllocatedCapacity: js.UndefOr[IntegerValue]
    var Arguments: js.UndefOr[GenericMap]
    var JobRunId: js.UndefOr[IdString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Timeout: js.UndefOr[Timeout]
    var WorkerType: js.UndefOr[WorkerType]
  }

  object StartJobRunRequest {
    def apply(
        JobName: NameString,
        AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
        Arguments: js.UndefOr[GenericMap] = js.undefined,
        JobRunId: js.UndefOr[IdString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): StartJobRunRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      AllocatedCapacity.foreach(__v => __obj.update("AllocatedCapacity", __v.asInstanceOf[js.Any]))
      Arguments.foreach(__v => __obj.update("Arguments", __v.asInstanceOf[js.Any]))
      JobRunId.foreach(__v => __obj.update("JobRunId", __v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.update("MaxCapacity", __v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.update("NotificationProperty", __v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.update("NumberOfWorkers", __v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.update("SecurityConfiguration", __v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.update("Timeout", __v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.update("WorkerType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartJobRunRequest]
    }
  }

  @js.native
  trait StartJobRunResponse extends js.Object {
    var JobRunId: js.UndefOr[IdString]
  }

  object StartJobRunResponse {
    def apply(
        JobRunId: js.UndefOr[IdString] = js.undefined
    ): StartJobRunResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobRunId.foreach(__v => __obj.update("JobRunId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartJobRunResponse]
    }
  }

  @js.native
  trait StartTriggerRequest extends js.Object {
    var Name: NameString
  }

  object StartTriggerRequest {
    def apply(
        Name: NameString
    ): StartTriggerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartTriggerRequest]
    }
  }

  @js.native
  trait StartTriggerResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object StartTriggerResponse {
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): StartTriggerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTriggerResponse]
    }
  }

  @js.native
  trait StopCrawlerRequest extends js.Object {
    var Name: NameString
  }

  object StopCrawlerRequest {
    def apply(
        Name: NameString
    ): StopCrawlerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopCrawlerRequest]
    }
  }

  @js.native
  trait StopCrawlerResponse extends js.Object {}

  object StopCrawlerResponse {
    def apply(
        ): StopCrawlerResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopCrawlerResponse]
    }
  }

  @js.native
  trait StopCrawlerScheduleRequest extends js.Object {
    var CrawlerName: NameString
  }

  object StopCrawlerScheduleRequest {
    def apply(
        CrawlerName: NameString
    ): StopCrawlerScheduleRequest = {
      val __obj = js.Dictionary[js.Any](
        "CrawlerName" -> CrawlerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopCrawlerScheduleRequest]
    }
  }

  @js.native
  trait StopCrawlerScheduleResponse extends js.Object {}

  object StopCrawlerScheduleResponse {
    def apply(
        ): StopCrawlerScheduleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopCrawlerScheduleResponse]
    }
  }

  @js.native
  trait StopTriggerRequest extends js.Object {
    var Name: NameString
  }

  object StopTriggerRequest {
    def apply(
        Name: NameString
    ): StopTriggerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopTriggerRequest]
    }
  }

  @js.native
  trait StopTriggerResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object StopTriggerResponse {
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): StopTriggerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopTriggerResponse]
    }
  }

  /**
    * Describes the physical storage of table data.
    */
  @js.native
  trait StorageDescriptor extends js.Object {
    var BucketColumns: js.UndefOr[NameStringList]
    var Columns: js.UndefOr[ColumnList]
    var Compressed: js.UndefOr[Boolean]
    var InputFormat: js.UndefOr[FormatString]
    var Location: js.UndefOr[LocationString]
    var NumberOfBuckets: js.UndefOr[Int]
    var OutputFormat: js.UndefOr[FormatString]
    var Parameters: js.UndefOr[ParametersMap]
    var SerdeInfo: js.UndefOr[SerDeInfo]
    var SkewedInfo: js.UndefOr[SkewedInfo]
    var SortColumns: js.UndefOr[OrderList]
    var StoredAsSubDirectories: js.UndefOr[Boolean]
  }

  object StorageDescriptor {
    def apply(
        BucketColumns: js.UndefOr[NameStringList] = js.undefined,
        Columns: js.UndefOr[ColumnList] = js.undefined,
        Compressed: js.UndefOr[Boolean] = js.undefined,
        InputFormat: js.UndefOr[FormatString] = js.undefined,
        Location: js.UndefOr[LocationString] = js.undefined,
        NumberOfBuckets: js.UndefOr[Int] = js.undefined,
        OutputFormat: js.UndefOr[FormatString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        SerdeInfo: js.UndefOr[SerDeInfo] = js.undefined,
        SkewedInfo: js.UndefOr[SkewedInfo] = js.undefined,
        SortColumns: js.UndefOr[OrderList] = js.undefined,
        StoredAsSubDirectories: js.UndefOr[Boolean] = js.undefined
    ): StorageDescriptor = {
      val __obj = js.Dictionary.empty[js.Any]
      BucketColumns.foreach(__v => __obj.update("BucketColumns", __v.asInstanceOf[js.Any]))
      Columns.foreach(__v => __obj.update("Columns", __v.asInstanceOf[js.Any]))
      Compressed.foreach(__v => __obj.update("Compressed", __v.asInstanceOf[js.Any]))
      InputFormat.foreach(__v => __obj.update("InputFormat", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      NumberOfBuckets.foreach(__v => __obj.update("NumberOfBuckets", __v.asInstanceOf[js.Any]))
      OutputFormat.foreach(__v => __obj.update("OutputFormat", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      SerdeInfo.foreach(__v => __obj.update("SerdeInfo", __v.asInstanceOf[js.Any]))
      SkewedInfo.foreach(__v => __obj.update("SkewedInfo", __v.asInstanceOf[js.Any]))
      SortColumns.foreach(__v => __obj.update("SortColumns", __v.asInstanceOf[js.Any]))
      StoredAsSubDirectories.foreach(__v => __obj.update("StoredAsSubDirectories", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageDescriptor]
    }
  }

  /**
    * Represents a collection of related data organized in columns and rows.
    */
  @js.native
  trait Table extends js.Object {
    var Name: NameString
    var CreateTime: js.UndefOr[Timestamp]
    var CreatedBy: js.UndefOr[NameString]
    var DatabaseName: js.UndefOr[NameString]
    var Description: js.UndefOr[DescriptionString]
    var LastAccessTime: js.UndefOr[Timestamp]
    var LastAnalyzedTime: js.UndefOr[Timestamp]
    var Owner: js.UndefOr[NameString]
    var Parameters: js.UndefOr[ParametersMap]
    var PartitionKeys: js.UndefOr[ColumnList]
    var Retention: js.UndefOr[NonNegativeInteger]
    var StorageDescriptor: js.UndefOr[StorageDescriptor]
    var TableType: js.UndefOr[TableTypeString]
    var UpdateTime: js.UndefOr[Timestamp]
    var ViewExpandedText: js.UndefOr[ViewTextString]
    var ViewOriginalText: js.UndefOr[ViewTextString]
  }

  object Table {
    def apply(
        Name: NameString,
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        CreatedBy: js.UndefOr[NameString] = js.undefined,
        DatabaseName: js.UndefOr[NameString] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LastAccessTime: js.UndefOr[Timestamp] = js.undefined,
        LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined,
        Owner: js.UndefOr[NameString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        PartitionKeys: js.UndefOr[ColumnList] = js.undefined,
        Retention: js.UndefOr[NonNegativeInteger] = js.undefined,
        StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined,
        TableType: js.UndefOr[TableTypeString] = js.undefined,
        UpdateTime: js.UndefOr[Timestamp] = js.undefined,
        ViewExpandedText: js.UndefOr[ViewTextString] = js.undefined,
        ViewOriginalText: js.UndefOr[ViewTextString] = js.undefined
    ): Table = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateTime.foreach(__v => __obj.update("CreateTime", __v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LastAccessTime.foreach(__v => __obj.update("LastAccessTime", __v.asInstanceOf[js.Any]))
      LastAnalyzedTime.foreach(__v => __obj.update("LastAnalyzedTime", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      PartitionKeys.foreach(__v => __obj.update("PartitionKeys", __v.asInstanceOf[js.Any]))
      Retention.foreach(__v => __obj.update("Retention", __v.asInstanceOf[js.Any]))
      StorageDescriptor.foreach(__v => __obj.update("StorageDescriptor", __v.asInstanceOf[js.Any]))
      TableType.foreach(__v => __obj.update("TableType", __v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.update("UpdateTime", __v.asInstanceOf[js.Any]))
      ViewExpandedText.foreach(__v => __obj.update("ViewExpandedText", __v.asInstanceOf[js.Any]))
      ViewOriginalText.foreach(__v => __obj.update("ViewOriginalText", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Table]
    }
  }

  /**
    * An error record for table operations.
    */
  @js.native
  trait TableError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var TableName: js.UndefOr[NameString]
  }

  object TableError {
    def apply(
        ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined,
        TableName: js.UndefOr[NameString] = js.undefined
    ): TableError = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorDetail.foreach(__v => __obj.update("ErrorDetail", __v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.update("TableName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableError]
    }
  }

  /**
    * Structure used to create or update the table.
    */
  @js.native
  trait TableInput extends js.Object {
    var Name: NameString
    var Description: js.UndefOr[DescriptionString]
    var LastAccessTime: js.UndefOr[Timestamp]
    var LastAnalyzedTime: js.UndefOr[Timestamp]
    var Owner: js.UndefOr[NameString]
    var Parameters: js.UndefOr[ParametersMap]
    var PartitionKeys: js.UndefOr[ColumnList]
    var Retention: js.UndefOr[NonNegativeInteger]
    var StorageDescriptor: js.UndefOr[StorageDescriptor]
    var TableType: js.UndefOr[TableTypeString]
    var ViewExpandedText: js.UndefOr[ViewTextString]
    var ViewOriginalText: js.UndefOr[ViewTextString]
  }

  object TableInput {
    def apply(
        Name: NameString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LastAccessTime: js.UndefOr[Timestamp] = js.undefined,
        LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined,
        Owner: js.UndefOr[NameString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        PartitionKeys: js.UndefOr[ColumnList] = js.undefined,
        Retention: js.UndefOr[NonNegativeInteger] = js.undefined,
        StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined,
        TableType: js.UndefOr[TableTypeString] = js.undefined,
        ViewExpandedText: js.UndefOr[ViewTextString] = js.undefined,
        ViewOriginalText: js.UndefOr[ViewTextString] = js.undefined
    ): TableInput = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LastAccessTime.foreach(__v => __obj.update("LastAccessTime", __v.asInstanceOf[js.Any]))
      LastAnalyzedTime.foreach(__v => __obj.update("LastAnalyzedTime", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.update("Parameters", __v.asInstanceOf[js.Any]))
      PartitionKeys.foreach(__v => __obj.update("PartitionKeys", __v.asInstanceOf[js.Any]))
      Retention.foreach(__v => __obj.update("Retention", __v.asInstanceOf[js.Any]))
      StorageDescriptor.foreach(__v => __obj.update("StorageDescriptor", __v.asInstanceOf[js.Any]))
      TableType.foreach(__v => __obj.update("TableType", __v.asInstanceOf[js.Any]))
      ViewExpandedText.foreach(__v => __obj.update("ViewExpandedText", __v.asInstanceOf[js.Any]))
      ViewOriginalText.foreach(__v => __obj.update("ViewOriginalText", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableInput]
    }
  }

  /**
    * Specifies a version of a table.
    */
  @js.native
  trait TableVersion extends js.Object {
    var Table: js.UndefOr[Table]
    var VersionId: js.UndefOr[VersionString]
  }

  object TableVersion {
    def apply(
        Table: js.UndefOr[Table] = js.undefined,
        VersionId: js.UndefOr[VersionString] = js.undefined
    ): TableVersion = {
      val __obj = js.Dictionary.empty[js.Any]
      Table.foreach(__v => __obj.update("Table", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableVersion]
    }
  }

  /**
    * An error record for table-version operations.
    */
  @js.native
  trait TableVersionError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var TableName: js.UndefOr[NameString]
    var VersionId: js.UndefOr[VersionString]
  }

  object TableVersionError {
    def apply(
        ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined,
        TableName: js.UndefOr[NameString] = js.undefined,
        VersionId: js.UndefOr[VersionString] = js.undefined
    ): TableVersionError = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorDetail.foreach(__v => __obj.update("ErrorDetail", __v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.update("TableName", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableVersionError]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: GlueResourceArn
    var TagsToAdd: TagsMap
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: GlueResourceArn,
        TagsToAdd: TagsMap
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagsToAdd"   -> TagsToAdd.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Information about a specific trigger.
    */
  @js.native
  trait Trigger extends js.Object {
    var Actions: js.UndefOr[ActionList]
    var Description: js.UndefOr[DescriptionString]
    var Id: js.UndefOr[IdString]
    var Name: js.UndefOr[NameString]
    var Predicate: js.UndefOr[Predicate]
    var Schedule: js.UndefOr[GenericString]
    var State: js.UndefOr[TriggerState]
    var Type: js.UndefOr[TriggerType]
  }

  object Trigger {
    def apply(
        Actions: js.UndefOr[ActionList] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Id: js.UndefOr[IdString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Predicate: js.UndefOr[Predicate] = js.undefined,
        Schedule: js.UndefOr[GenericString] = js.undefined,
        State: js.UndefOr[TriggerState] = js.undefined,
        Type: js.UndefOr[TriggerType] = js.undefined
    ): Trigger = {
      val __obj = js.Dictionary.empty[js.Any]
      Actions.foreach(__v => __obj.update("Actions", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Predicate.foreach(__v => __obj.update("Predicate", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trigger]
    }
  }

  object TriggerStateEnum {
    val CREATING     = "CREATING"
    val CREATED      = "CREATED"
    val ACTIVATING   = "ACTIVATING"
    val ACTIVATED    = "ACTIVATED"
    val DEACTIVATING = "DEACTIVATING"
    val DEACTIVATED  = "DEACTIVATED"
    val DELETING     = "DELETING"
    val UPDATING     = "UPDATING"

    val values = IndexedSeq(CREATING, CREATED, ACTIVATING, ACTIVATED, DEACTIVATING, DEACTIVATED, DELETING, UPDATING)
  }

  object TriggerTypeEnum {
    val SCHEDULED   = "SCHEDULED"
    val CONDITIONAL = "CONDITIONAL"
    val ON_DEMAND   = "ON_DEMAND"

    val values = IndexedSeq(SCHEDULED, CONDITIONAL, ON_DEMAND)
  }

  /**
    * A structure used to provide information used to update a trigger. This object will update the the previous trigger definition by overwriting it completely.
    */
  @js.native
  trait TriggerUpdate extends js.Object {
    var Actions: js.UndefOr[ActionList]
    var Description: js.UndefOr[DescriptionString]
    var Name: js.UndefOr[NameString]
    var Predicate: js.UndefOr[Predicate]
    var Schedule: js.UndefOr[GenericString]
  }

  object TriggerUpdate {
    def apply(
        Actions: js.UndefOr[ActionList] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Predicate: js.UndefOr[Predicate] = js.undefined,
        Schedule: js.UndefOr[GenericString] = js.undefined
    ): TriggerUpdate = {
      val __obj = js.Dictionary.empty[js.Any]
      Actions.foreach(__v => __obj.update("Actions", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Predicate.foreach(__v => __obj.update("Predicate", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerUpdate]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: GlueResourceArn
    var TagsToRemove: TagKeysList
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: GlueResourceArn,
        TagsToRemove: TagKeysList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn"  -> ResourceArn.asInstanceOf[js.Any],
        "TagsToRemove" -> TagsToRemove.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  object UpdateBehaviorEnum {
    val LOG                = "LOG"
    val UPDATE_IN_DATABASE = "UPDATE_IN_DATABASE"

    val values = IndexedSeq(LOG, UPDATE_IN_DATABASE)
  }

  @js.native
  trait UpdateClassifierRequest extends js.Object {
    var CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest]
    var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest]
    var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest]
    var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest]
  }

  object UpdateClassifierRequest {
    def apply(
        CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest] = js.undefined,
        GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest] = js.undefined,
        JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest] = js.undefined,
        XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest] = js.undefined
    ): UpdateClassifierRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CsvClassifier.foreach(__v => __obj.update("CsvClassifier", __v.asInstanceOf[js.Any]))
      GrokClassifier.foreach(__v => __obj.update("GrokClassifier", __v.asInstanceOf[js.Any]))
      JsonClassifier.foreach(__v => __obj.update("JsonClassifier", __v.asInstanceOf[js.Any]))
      XMLClassifier.foreach(__v => __obj.update("XMLClassifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClassifierRequest]
    }
  }

  @js.native
  trait UpdateClassifierResponse extends js.Object {}

  object UpdateClassifierResponse {
    def apply(
        ): UpdateClassifierResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateClassifierResponse]
    }
  }

  @js.native
  trait UpdateConnectionRequest extends js.Object {
    var ConnectionInput: ConnectionInput
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object UpdateConnectionRequest {
    def apply(
        ConnectionInput: ConnectionInput,
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateConnectionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConnectionInput" -> ConnectionInput.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionRequest]
    }
  }

  @js.native
  trait UpdateConnectionResponse extends js.Object {}

  object UpdateConnectionResponse {
    def apply(
        ): UpdateConnectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateConnectionResponse]
    }
  }

  @js.native
  trait UpdateCrawlerRequest extends js.Object {
    var Name: NameString
    var Classifiers: js.UndefOr[ClassifierNameList]
    var Configuration: js.UndefOr[CrawlerConfiguration]
    var CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration]
    var DatabaseName: js.UndefOr[DatabaseName]
    var Description: js.UndefOr[DescriptionStringRemovable]
    var Role: js.UndefOr[Role]
    var Schedule: js.UndefOr[CronExpression]
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy]
    var TablePrefix: js.UndefOr[TablePrefix]
    var Targets: js.UndefOr[CrawlerTargets]
  }

  object UpdateCrawlerRequest {
    def apply(
        Name: NameString,
        Classifiers: js.UndefOr[ClassifierNameList] = js.undefined,
        Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined,
        CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration] = js.undefined,
        DatabaseName: js.UndefOr[DatabaseName] = js.undefined,
        Description: js.UndefOr[DescriptionStringRemovable] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        Schedule: js.UndefOr[CronExpression] = js.undefined,
        SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined,
        TablePrefix: js.UndefOr[TablePrefix] = js.undefined,
        Targets: js.UndefOr[CrawlerTargets] = js.undefined
    ): UpdateCrawlerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Classifiers.foreach(__v => __obj.update("Classifiers", __v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.update("Configuration", __v.asInstanceOf[js.Any]))
      CrawlerSecurityConfiguration.foreach(
        __v => __obj.update("CrawlerSecurityConfiguration", __v.asInstanceOf[js.Any])
      )
      DatabaseName.foreach(__v => __obj.update("DatabaseName", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      SchemaChangePolicy.foreach(__v => __obj.update("SchemaChangePolicy", __v.asInstanceOf[js.Any]))
      TablePrefix.foreach(__v => __obj.update("TablePrefix", __v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.update("Targets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCrawlerRequest]
    }
  }

  @js.native
  trait UpdateCrawlerResponse extends js.Object {}

  object UpdateCrawlerResponse {
    def apply(
        ): UpdateCrawlerResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateCrawlerResponse]
    }
  }

  @js.native
  trait UpdateCrawlerScheduleRequest extends js.Object {
    var CrawlerName: NameString
    var Schedule: js.UndefOr[CronExpression]
  }

  object UpdateCrawlerScheduleRequest {
    def apply(
        CrawlerName: NameString,
        Schedule: js.UndefOr[CronExpression] = js.undefined
    ): UpdateCrawlerScheduleRequest = {
      val __obj = js.Dictionary[js.Any](
        "CrawlerName" -> CrawlerName.asInstanceOf[js.Any]
      )

      Schedule.foreach(__v => __obj.update("Schedule", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCrawlerScheduleRequest]
    }
  }

  @js.native
  trait UpdateCrawlerScheduleResponse extends js.Object {}

  object UpdateCrawlerScheduleResponse {
    def apply(
        ): UpdateCrawlerScheduleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateCrawlerScheduleResponse]
    }
  }

  /**
    * Specifies a custom CSV classifier to be updated.
    */
  @js.native
  trait UpdateCsvClassifierRequest extends js.Object {
    var Name: NameString
    var AllowSingleColumn: js.UndefOr[NullableBoolean]
    var ContainsHeader: js.UndefOr[CsvHeaderOption]
    var Delimiter: js.UndefOr[CsvColumnDelimiter]
    var DisableValueTrimming: js.UndefOr[NullableBoolean]
    var Header: js.UndefOr[CsvHeader]
    var QuoteSymbol: js.UndefOr[CsvQuoteSymbol]
  }

  object UpdateCsvClassifierRequest {
    def apply(
        Name: NameString,
        AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined,
        ContainsHeader: js.UndefOr[CsvHeaderOption] = js.undefined,
        Delimiter: js.UndefOr[CsvColumnDelimiter] = js.undefined,
        DisableValueTrimming: js.UndefOr[NullableBoolean] = js.undefined,
        Header: js.UndefOr[CsvHeader] = js.undefined,
        QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.undefined
    ): UpdateCsvClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AllowSingleColumn.foreach(__v => __obj.update("AllowSingleColumn", __v.asInstanceOf[js.Any]))
      ContainsHeader.foreach(__v => __obj.update("ContainsHeader", __v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.update("Delimiter", __v.asInstanceOf[js.Any]))
      DisableValueTrimming.foreach(__v => __obj.update("DisableValueTrimming", __v.asInstanceOf[js.Any]))
      Header.foreach(__v => __obj.update("Header", __v.asInstanceOf[js.Any]))
      QuoteSymbol.foreach(__v => __obj.update("QuoteSymbol", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCsvClassifierRequest]
    }
  }

  @js.native
  trait UpdateDatabaseRequest extends js.Object {
    var DatabaseInput: DatabaseInput
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object UpdateDatabaseRequest {
    def apply(
        DatabaseInput: DatabaseInput,
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateDatabaseRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseInput" -> DatabaseInput.asInstanceOf[js.Any],
        "Name"          -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatabaseRequest]
    }
  }

  @js.native
  trait UpdateDatabaseResponse extends js.Object {}

  object UpdateDatabaseResponse {
    def apply(
        ): UpdateDatabaseResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateDatabaseResponse]
    }
  }

  @js.native
  trait UpdateDevEndpointRequest extends js.Object {
    var EndpointName: GenericString
    var AddArguments: js.UndefOr[MapValue]
    var AddPublicKeys: js.UndefOr[PublicKeysList]
    var CustomLibraries: js.UndefOr[DevEndpointCustomLibraries]
    var DeleteArguments: js.UndefOr[StringList]
    var DeletePublicKeys: js.UndefOr[PublicKeysList]
    var PublicKey: js.UndefOr[GenericString]
    var UpdateEtlLibraries: js.UndefOr[BooleanValue]
  }

  object UpdateDevEndpointRequest {
    def apply(
        EndpointName: GenericString,
        AddArguments: js.UndefOr[MapValue] = js.undefined,
        AddPublicKeys: js.UndefOr[PublicKeysList] = js.undefined,
        CustomLibraries: js.UndefOr[DevEndpointCustomLibraries] = js.undefined,
        DeleteArguments: js.UndefOr[StringList] = js.undefined,
        DeletePublicKeys: js.UndefOr[PublicKeysList] = js.undefined,
        PublicKey: js.UndefOr[GenericString] = js.undefined,
        UpdateEtlLibraries: js.UndefOr[BooleanValue] = js.undefined
    ): UpdateDevEndpointRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      )

      AddArguments.foreach(__v => __obj.update("AddArguments", __v.asInstanceOf[js.Any]))
      AddPublicKeys.foreach(__v => __obj.update("AddPublicKeys", __v.asInstanceOf[js.Any]))
      CustomLibraries.foreach(__v => __obj.update("CustomLibraries", __v.asInstanceOf[js.Any]))
      DeleteArguments.foreach(__v => __obj.update("DeleteArguments", __v.asInstanceOf[js.Any]))
      DeletePublicKeys.foreach(__v => __obj.update("DeletePublicKeys", __v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.update("PublicKey", __v.asInstanceOf[js.Any]))
      UpdateEtlLibraries.foreach(__v => __obj.update("UpdateEtlLibraries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDevEndpointRequest]
    }
  }

  @js.native
  trait UpdateDevEndpointResponse extends js.Object {}

  object UpdateDevEndpointResponse {
    def apply(
        ): UpdateDevEndpointResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateDevEndpointResponse]
    }
  }

  /**
    * Specifies a grok classifier to update when passed to <code>UpdateClassifier</code>.
    */
  @js.native
  trait UpdateGrokClassifierRequest extends js.Object {
    var Name: NameString
    var Classification: js.UndefOr[Classification]
    var CustomPatterns: js.UndefOr[CustomPatterns]
    var GrokPattern: js.UndefOr[GrokPattern]
  }

  object UpdateGrokClassifierRequest {
    def apply(
        Name: NameString,
        Classification: js.UndefOr[Classification] = js.undefined,
        CustomPatterns: js.UndefOr[CustomPatterns] = js.undefined,
        GrokPattern: js.UndefOr[GrokPattern] = js.undefined
    ): UpdateGrokClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Classification.foreach(__v => __obj.update("Classification", __v.asInstanceOf[js.Any]))
      CustomPatterns.foreach(__v => __obj.update("CustomPatterns", __v.asInstanceOf[js.Any]))
      GrokPattern.foreach(__v => __obj.update("GrokPattern", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGrokClassifierRequest]
    }
  }

  @js.native
  trait UpdateJobRequest extends js.Object {
    var JobName: NameString
    var JobUpdate: JobUpdate
  }

  object UpdateJobRequest {
    def apply(
        JobName: NameString,
        JobUpdate: JobUpdate
    ): UpdateJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "JobName"   -> JobName.asInstanceOf[js.Any],
        "JobUpdate" -> JobUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateJobRequest]
    }
  }

  @js.native
  trait UpdateJobResponse extends js.Object {
    var JobName: js.UndefOr[NameString]
  }

  object UpdateJobResponse {
    def apply(
        JobName: js.UndefOr[NameString] = js.undefined
    ): UpdateJobResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      JobName.foreach(__v => __obj.update("JobName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobResponse]
    }
  }

  /**
    * Specifies a JSON classifier to be updated.
    */
  @js.native
  trait UpdateJsonClassifierRequest extends js.Object {
    var Name: NameString
    var JsonPath: js.UndefOr[JsonPath]
  }

  object UpdateJsonClassifierRequest {
    def apply(
        Name: NameString,
        JsonPath: js.UndefOr[JsonPath] = js.undefined
    ): UpdateJsonClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      JsonPath.foreach(__v => __obj.update("JsonPath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJsonClassifierRequest]
    }
  }

  @js.native
  trait UpdatePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionInput: PartitionInput
    var PartitionValueList: BoundedPartitionValueList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object UpdatePartitionRequest {
    def apply(
        DatabaseName: NameString,
        PartitionInput: PartitionInput,
        PartitionValueList: BoundedPartitionValueList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdatePartitionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"       -> DatabaseName.asInstanceOf[js.Any],
        "PartitionInput"     -> PartitionInput.asInstanceOf[js.Any],
        "PartitionValueList" -> PartitionValueList.asInstanceOf[js.Any],
        "TableName"          -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePartitionRequest]
    }
  }

  @js.native
  trait UpdatePartitionResponse extends js.Object {}

  object UpdatePartitionResponse {
    def apply(
        ): UpdatePartitionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdatePartitionResponse]
    }
  }

  @js.native
  trait UpdateTableRequest extends js.Object {
    var DatabaseName: NameString
    var TableInput: TableInput
    var CatalogId: js.UndefOr[CatalogIdString]
    var SkipArchive: js.UndefOr[BooleanNullable]
  }

  object UpdateTableRequest {
    def apply(
        DatabaseName: NameString,
        TableInput: TableInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        SkipArchive: js.UndefOr[BooleanNullable] = js.undefined
    ): UpdateTableRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableInput"   -> TableInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      SkipArchive.foreach(__v => __obj.update("SkipArchive", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTableRequest]
    }
  }

  @js.native
  trait UpdateTableResponse extends js.Object {}

  object UpdateTableResponse {
    def apply(
        ): UpdateTableResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateTableResponse]
    }
  }

  @js.native
  trait UpdateTriggerRequest extends js.Object {
    var Name: NameString
    var TriggerUpdate: TriggerUpdate
  }

  object UpdateTriggerRequest {
    def apply(
        Name: NameString,
        TriggerUpdate: TriggerUpdate
    ): UpdateTriggerRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name"          -> Name.asInstanceOf[js.Any],
        "TriggerUpdate" -> TriggerUpdate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateTriggerRequest]
    }
  }

  @js.native
  trait UpdateTriggerResponse extends js.Object {
    var Trigger: js.UndefOr[Trigger]
  }

  object UpdateTriggerResponse {
    def apply(
        Trigger: js.UndefOr[Trigger] = js.undefined
    ): UpdateTriggerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Trigger.foreach(__v => __obj.update("Trigger", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTriggerResponse]
    }
  }

  @js.native
  trait UpdateUserDefinedFunctionRequest extends js.Object {
    var DatabaseName: NameString
    var FunctionInput: UserDefinedFunctionInput
    var FunctionName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object UpdateUserDefinedFunctionRequest {
    def apply(
        DatabaseName: NameString,
        FunctionInput: UserDefinedFunctionInput,
        FunctionName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateUserDefinedFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "DatabaseName"  -> DatabaseName.asInstanceOf[js.Any],
        "FunctionInput" -> FunctionInput.asInstanceOf[js.Any],
        "FunctionName"  -> FunctionName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.update("CatalogId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait UpdateUserDefinedFunctionResponse extends js.Object {}

  object UpdateUserDefinedFunctionResponse {
    def apply(
        ): UpdateUserDefinedFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateUserDefinedFunctionResponse]
    }
  }

  /**
    * Specifies an XML classifier to be updated.
    */
  @js.native
  trait UpdateXMLClassifierRequest extends js.Object {
    var Name: NameString
    var Classification: js.UndefOr[Classification]
    var RowTag: js.UndefOr[RowTag]
  }

  object UpdateXMLClassifierRequest {
    def apply(
        Name: NameString,
        Classification: js.UndefOr[Classification] = js.undefined,
        RowTag: js.UndefOr[RowTag] = js.undefined
    ): UpdateXMLClassifierRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Classification.foreach(__v => __obj.update("Classification", __v.asInstanceOf[js.Any]))
      RowTag.foreach(__v => __obj.update("RowTag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateXMLClassifierRequest]
    }
  }

  /**
    * Represents the equivalent of a Hive user-defined function (<code>UDF</code>) definition.
    */
  @js.native
  trait UserDefinedFunction extends js.Object {
    var ClassName: js.UndefOr[NameString]
    var CreateTime: js.UndefOr[Timestamp]
    var FunctionName: js.UndefOr[NameString]
    var OwnerName: js.UndefOr[NameString]
    var OwnerType: js.UndefOr[PrincipalType]
    var ResourceUris: js.UndefOr[ResourceUriList]
  }

  object UserDefinedFunction {
    def apply(
        ClassName: js.UndefOr[NameString] = js.undefined,
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        FunctionName: js.UndefOr[NameString] = js.undefined,
        OwnerName: js.UndefOr[NameString] = js.undefined,
        OwnerType: js.UndefOr[PrincipalType] = js.undefined,
        ResourceUris: js.UndefOr[ResourceUriList] = js.undefined
    ): UserDefinedFunction = {
      val __obj = js.Dictionary.empty[js.Any]
      ClassName.foreach(__v => __obj.update("ClassName", __v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.update("CreateTime", __v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.update("FunctionName", __v.asInstanceOf[js.Any]))
      OwnerName.foreach(__v => __obj.update("OwnerName", __v.asInstanceOf[js.Any]))
      OwnerType.foreach(__v => __obj.update("OwnerType", __v.asInstanceOf[js.Any]))
      ResourceUris.foreach(__v => __obj.update("ResourceUris", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserDefinedFunction]
    }
  }

  /**
    * A structure used to create or updata a user-defined function.
    */
  @js.native
  trait UserDefinedFunctionInput extends js.Object {
    var ClassName: js.UndefOr[NameString]
    var FunctionName: js.UndefOr[NameString]
    var OwnerName: js.UndefOr[NameString]
    var OwnerType: js.UndefOr[PrincipalType]
    var ResourceUris: js.UndefOr[ResourceUriList]
  }

  object UserDefinedFunctionInput {
    def apply(
        ClassName: js.UndefOr[NameString] = js.undefined,
        FunctionName: js.UndefOr[NameString] = js.undefined,
        OwnerName: js.UndefOr[NameString] = js.undefined,
        OwnerType: js.UndefOr[PrincipalType] = js.undefined,
        ResourceUris: js.UndefOr[ResourceUriList] = js.undefined
    ): UserDefinedFunctionInput = {
      val __obj = js.Dictionary.empty[js.Any]
      ClassName.foreach(__v => __obj.update("ClassName", __v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.update("FunctionName", __v.asInstanceOf[js.Any]))
      OwnerName.foreach(__v => __obj.update("OwnerName", __v.asInstanceOf[js.Any]))
      OwnerType.foreach(__v => __obj.update("OwnerType", __v.asInstanceOf[js.Any]))
      ResourceUris.foreach(__v => __obj.update("ResourceUris", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserDefinedFunctionInput]
    }
  }

  object WorkerTypeEnum {
    val Standard = "Standard"
    val `G.1X`   = "G.1X"
    val `G.2X`   = "G.2X"

    val values = IndexedSeq(Standard, `G.1X`, `G.2X`)
  }

  /**
    * A classifier for <code>XML</code> content.
    */
  @js.native
  trait XMLClassifier extends js.Object {
    var Classification: Classification
    var Name: NameString
    var CreationTime: js.UndefOr[Timestamp]
    var LastUpdated: js.UndefOr[Timestamp]
    var RowTag: js.UndefOr[RowTag]
    var Version: js.UndefOr[VersionId]
  }

  object XMLClassifier {
    def apply(
        Classification: Classification,
        Name: NameString,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        RowTag: js.UndefOr[RowTag] = js.undefined,
        Version: js.UndefOr[VersionId] = js.undefined
    ): XMLClassifier = {
      val __obj = js.Dictionary[js.Any](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.update("LastUpdated", __v.asInstanceOf[js.Any]))
      RowTag.foreach(__v => __obj.update("RowTag", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[XMLClassifier]
    }
  }
}
