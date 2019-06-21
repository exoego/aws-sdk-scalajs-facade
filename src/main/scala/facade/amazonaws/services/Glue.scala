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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arguments" -> Arguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationProperty" -> NotificationProperty.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Action]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"       -> DatabaseName.asInstanceOf[js.Any],
        "PartitionInputList" -> PartitionInputList.asInstanceOf[js.Any],
        "TableName"          -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreatePartitionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Errors" -> Errors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreatePartitionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionNameList" -> ConnectionNameList.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteConnectionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Errors" -> Errors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Succeeded" -> Succeeded.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteConnectionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"       -> DatabaseName.asInstanceOf[js.Any],
        "PartitionsToDelete" -> PartitionsToDelete.asInstanceOf[js.Any],
        "TableName"          -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeletePartitionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Errors" -> Errors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeletePartitionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"   -> DatabaseName.asInstanceOf[js.Any],
        "TablesToDelete" -> TablesToDelete.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteTableRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Errors" -> Errors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteTableResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any],
        "VersionIds"   -> VersionIds.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteTableVersionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Errors" -> Errors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteTableVersionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CrawlerNames" -> CrawlerNames.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetCrawlersRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Crawlers" -> Crawlers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CrawlersNotFound" -> CrawlersNotFound.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetCrawlersResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DevEndpointNames" -> DevEndpointNames.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDevEndpointsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DevEndpoints" -> DevEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DevEndpointsNotFound" -> DevEndpointsNotFound.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetDevEndpointsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobNames" -> JobNames.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetJobsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Jobs" -> Jobs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobsNotFound" -> JobsNotFound.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetJobsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"    -> DatabaseName.asInstanceOf[js.Any],
        "PartitionsToGet" -> PartitionsToGet.asInstanceOf[js.Any],
        "TableName"       -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetPartitionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Partitions" -> Partitions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnprocessedKeys" -> UnprocessedKeys.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetPartitionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "TriggerNames" -> TriggerNames.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetTriggersRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Triggers" -> Triggers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TriggersNotFound" -> TriggersNotFound.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetTriggersResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorDetail" -> ErrorDetail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobRunId" -> JobRunId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchStopJobRunError]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName"   -> JobName.asInstanceOf[js.Any],
        "JobRunIds" -> JobRunIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchStopJobRunRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Errors" -> Errors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SuccessfulSubmissions" -> SuccessfulSubmissions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchStopJobRunResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobRunId" -> JobRunId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchStopJobRunSuccessfulSubmission]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CatalogEntry]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportCompleted" -> ImportCompleted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImportTime" -> ImportTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImportedBy" -> ImportedBy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CatalogImportStatus]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CsvClassifier" -> CsvClassifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GrokClassifier" -> GrokClassifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JsonClassifier" -> JsonClassifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "XMLClassifier" -> XMLClassifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Classifier]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchEncryptionMode" -> CloudWatchEncryptionMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyArn" -> KmsKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchEncryption]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Source" -> Source.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any],
        "TargetParameter" -> TargetParameter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeGenEdge]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Args"     -> Args.asInstanceOf[js.Any],
        "Id"       -> Id.asInstanceOf[js.Any],
        "NodeType" -> NodeType.asInstanceOf[js.Any],
        "LineNumber" -> LineNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeGenNode]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any],
        "Param" -> Param.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeGenNodeArg]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Column]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogicalOperator" -> LogicalOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Condition]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionProperties" -> ConnectionProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConnectionType" -> ConnectionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedBy" -> LastUpdatedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTime" -> LastUpdatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchCriteria" -> MatchCriteria.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhysicalConnectionRequirements" -> PhysicalConnectionRequirements.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Connection]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionProperties" -> ConnectionProperties.asInstanceOf[js.Any],
        "ConnectionType"       -> ConnectionType.asInstanceOf[js.Any],
        "Name"                 -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchCriteria" -> MatchCriteria.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhysicalConnectionRequirements" -> PhysicalConnectionRequirements.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectionInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ReturnConnectionPasswordEncrypted" -> ReturnConnectionPasswordEncrypted.asInstanceOf[js.Any],
        "AwsKmsKeyId" -> AwsKmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectionPasswordEncryption]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Connections" -> Connections.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectionsList]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Classifiers" -> Classifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CrawlElapsedTime" -> CrawlElapsedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CrawlerSecurityConfiguration" -> CrawlerSecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastCrawl" -> LastCrawl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdated" -> LastUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Role" -> Role.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaChangePolicy" -> SchemaChangePolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TablePrefix" -> TablePrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Targets" -> Targets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Crawler]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CrawlerName" -> CrawlerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastRuntimeSeconds" -> LastRuntimeSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MedianRuntimeSeconds" -> MedianRuntimeSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StillEstimating" -> StillEstimating.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TablesCreated" -> TablesCreated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TablesDeleted" -> TablesDeleted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TablesUpdated" -> TablesUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeLeftSeconds" -> TimeLeftSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CrawlerMetrics]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DynamoDBTargets" -> DynamoDBTargets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JdbcTargets" -> JdbcTargets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Targets" -> S3Targets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CrawlerTargets]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CsvClassifier" -> CsvClassifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GrokClassifier" -> GrokClassifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JsonClassifier" -> JsonClassifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "XMLClassifier" -> XMLClassifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClassifierRequest]
    }
  }

  @js.native
  trait CreateClassifierResponse extends js.Object {}

  object CreateClassifierResponse {
    def apply(
        ): CreateClassifierResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClassifierResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionInput" -> ConnectionInput.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConnectionRequest]
    }
  }

  @js.native
  trait CreateConnectionResponse extends js.Object {}

  object CreateConnectionResponse {
    def apply(
        ): CreateConnectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConnectionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any],
        "Role"         -> Role.asInstanceOf[js.Any],
        "Targets"      -> Targets.asInstanceOf[js.Any],
        "Classifiers" -> Classifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CrawlerSecurityConfiguration" -> CrawlerSecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaChangePolicy" -> SchemaChangePolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TablePrefix" -> TablePrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCrawlerRequest]
    }
  }

  @js.native
  trait CreateCrawlerResponse extends js.Object {}

  object CreateCrawlerResponse {
    def apply(
        ): CreateCrawlerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCrawlerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "AllowSingleColumn" -> AllowSingleColumn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContainsHeader" -> ContainsHeader.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Delimiter" -> Delimiter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisableValueTrimming" -> DisableValueTrimming.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Header" -> Header.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuoteSymbol" -> QuoteSymbol.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCsvClassifierRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseInput" -> DatabaseInput.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDatabaseRequest]
    }
  }

  @js.native
  trait CreateDatabaseResponse extends js.Object {}

  object CreateDatabaseResponse {
    def apply(
        ): CreateDatabaseResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDatabaseResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "RoleArn"      -> RoleArn.asInstanceOf[js.Any],
        "Arguments" -> Arguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExtraJarsS3Path" -> ExtraJarsS3Path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExtraPythonLibsS3Path" -> ExtraPythonLibsS3Path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfNodes" -> NumberOfNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicKey" -> PublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicKeys" -> PublicKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroupIds" -> SecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetId" -> SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDevEndpointRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arguments" -> Arguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedTimestamp" -> CreatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointName" -> EndpointName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExtraJarsS3Path" -> ExtraJarsS3Path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExtraPythonLibsS3Path" -> ExtraPythonLibsS3Path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailureReason" -> FailureReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfNodes" -> NumberOfNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroupIds" -> SecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetId" -> SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "YarnEndpointAddress" -> YarnEndpointAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZeppelinRemoteSparkInterpreterPort" -> ZeppelinRemoteSparkInterpreterPort.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDevEndpointResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "GrokPattern"    -> GrokPattern.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any],
        "CustomPatterns" -> CustomPatterns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGrokClassifierRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Command" -> Command.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any],
        "Role"    -> Role.asInstanceOf[js.Any],
        "AllocatedCapacity" -> AllocatedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Connections" -> Connections.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultArguments" -> DefaultArguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExecutionProperty" -> ExecutionProperty.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogUri" -> LogUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxCapacity" -> MaxCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRetries" -> MaxRetries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationProperty" -> NotificationProperty.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfWorkers" -> NumberOfWorkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkerType" -> WorkerType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JsonPath" -> JsonPath.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJsonClassifierRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"   -> DatabaseName.asInstanceOf[js.Any],
        "PartitionInput" -> PartitionInput.asInstanceOf[js.Any],
        "TableName"      -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePartitionRequest]
    }
  }

  @js.native
  trait CreatePartitionResponse extends js.Object {}

  object CreatePartitionResponse {
    def apply(
        ): CreatePartitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePartitionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DagEdges" -> DagEdges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DagNodes" -> DagNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Language" -> Language.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateScriptRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PythonScript" -> PythonScript.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalaCode" -> ScalaCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateScriptResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionConfiguration" -> EncryptionConfiguration.asInstanceOf[js.Any],
        "Name"                    -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityConfigurationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTimestamp" -> CreatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityConfigurationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableInput"   -> TableInput.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTableRequest]
    }
  }

  @js.native
  trait CreateTableResponse extends js.Object {}

  object CreateTableResponse {
    def apply(
        ): CreateTableResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTableResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Actions" -> Actions.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any],
        "Type"    -> Type.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Predicate" -> Predicate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartOnCreation" -> StartOnCreation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTriggerRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTriggerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"  -> DatabaseName.asInstanceOf[js.Any],
        "FunctionInput" -> FunctionInput.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait CreateUserDefinedFunctionResponse extends js.Object {}

  object CreateUserDefinedFunctionResponse {
    def apply(
        ): CreateUserDefinedFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserDefinedFunctionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any],
        "RowTag" -> RowTag.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateXMLClassifierRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "AllowSingleColumn" -> AllowSingleColumn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContainsHeader" -> ContainsHeader.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Delimiter" -> Delimiter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisableValueTrimming" -> DisableValueTrimming.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Header" -> Header.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdated" -> LastUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuoteSymbol" -> QuoteSymbol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CsvClassifier]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionPasswordEncryption" -> ConnectionPasswordEncryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncryptionAtRest" -> EncryptionAtRest.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataCatalogEncryptionSettings]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationUri" -> LocationUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Database]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationUri" -> LocationUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DatabaseInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClassifierRequest]
    }
  }

  @js.native
  trait DeleteClassifierResponse extends js.Object {}

  object DeleteClassifierResponse {
    def apply(
        ): DeleteClassifierResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClassifierResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionName" -> ConnectionName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait DeleteConnectionResponse extends js.Object {}

  object DeleteConnectionResponse {
    def apply(
        ): DeleteConnectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConnectionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCrawlerRequest]
    }
  }

  @js.native
  trait DeleteCrawlerResponse extends js.Object {}

  object DeleteCrawlerResponse {
    def apply(
        ): DeleteCrawlerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCrawlerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDatabaseRequest]
    }
  }

  @js.native
  trait DeleteDatabaseResponse extends js.Object {}

  object DeleteDatabaseResponse {
    def apply(
        ): DeleteDatabaseResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDatabaseResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDevEndpointRequest]
    }
  }

  @js.native
  trait DeleteDevEndpointResponse extends js.Object {}

  object DeleteDevEndpointResponse {
    def apply(
        ): DeleteDevEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDevEndpointResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"    -> DatabaseName.asInstanceOf[js.Any],
        "PartitionValues" -> PartitionValues.asInstanceOf[js.Any],
        "TableName"       -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePartitionRequest]
    }
  }

  @js.native
  trait DeletePartitionResponse extends js.Object {}

  object DeletePartitionResponse {
    def apply(
        ): DeletePartitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePartitionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyHashCondition" -> PolicyHashCondition.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyResponse extends js.Object {}

  object DeleteResourcePolicyResponse {
    def apply(
        ): DeleteResourcePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourcePolicyResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityConfigurationRequest]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationResponse extends js.Object {}

  object DeleteSecurityConfigurationResponse {
    def apply(
        ): DeleteSecurityConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityConfigurationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableRequest]
    }
  }

  @js.native
  trait DeleteTableResponse extends js.Object {}

  object DeleteTableResponse {
    def apply(
        ): DeleteTableResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any],
        "VersionId"    -> VersionId.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableVersionRequest]
    }
  }

  @js.native
  trait DeleteTableVersionResponse extends js.Object {}

  object DeleteTableVersionResponse {
    def apply(
        ): DeleteTableVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTableVersionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTriggerRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTriggerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait DeleteUserDefinedFunctionResponse extends js.Object {}

  object DeleteUserDefinedFunctionResponse {
    def apply(
        ): DeleteUserDefinedFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserDefinedFunctionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arguments" -> Arguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedTimestamp" -> CreatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointName" -> EndpointName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExtraJarsS3Path" -> ExtraJarsS3Path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExtraPythonLibsS3Path" -> ExtraPythonLibsS3Path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailureReason" -> FailureReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedTimestamp" -> LastModifiedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdateStatus" -> LastUpdateStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfNodes" -> NumberOfNodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateAddress" -> PrivateAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicAddress" -> PublicAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicKey" -> PublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicKeys" -> PublicKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroupIds" -> SecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetId" -> SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "YarnEndpointAddress" -> YarnEndpointAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZeppelinRemoteSparkInterpreterPort" -> ZeppelinRemoteSparkInterpreterPort.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DevEndpoint]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ExtraJarsS3Path" -> ExtraJarsS3Path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExtraPythonLibsS3Path" -> ExtraPythonLibsS3Path.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DevEndpointCustomLibraries]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DynamoDBTarget]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CatalogEncryptionMode" -> CatalogEncryptionMode.asInstanceOf[js.Any],
        "SseAwsKmsKeyId" -> SseAwsKmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionAtRest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchEncryption" -> CloudWatchEncryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobBookmarksEncryption" -> JobBookmarksEncryption.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Encryption" -> S3Encryption.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionConfiguration]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorDetail]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxConcurrentRuns" -> MaxConcurrentRuns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionProperty]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCatalogImportStatusRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportStatus" -> ImportStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCatalogImportStatusResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetClassifierRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Classifier" -> Classifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetClassifierResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetClassifiersRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Classifiers" -> Classifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetClassifiersResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HidePassword" -> HidePassword.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Connection" -> Connection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionType" -> ConnectionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchCriteria" -> MatchCriteria.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectionsFilter]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Filter" -> Filter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HidePassword" -> HidePassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectionsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionList" -> ConnectionList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectionsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CrawlerNameList" -> CrawlerNameList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCrawlerMetricsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CrawlerMetricsList" -> CrawlerMetricsList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCrawlerMetricsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCrawlerRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Crawler" -> Crawler.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCrawlerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCrawlersRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Crawlers" -> Crawlers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCrawlersResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataCatalogEncryptionSettingsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DataCatalogEncryptionSettings" -> DataCatalogEncryptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataCatalogEncryptionSettingsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDatabaseRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Database" -> Database.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDatabaseResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDatabasesRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseList" -> DatabaseList.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDatabasesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PythonScript" -> PythonScript.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataflowGraphRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DagEdges" -> DagEdges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DagNodes" -> DagNodes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataflowGraphResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevEndpointRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DevEndpoint" -> DevEndpoint.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevEndpointResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevEndpointsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DevEndpoints" -> DevEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevEndpointsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Job" -> Job.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.asInstanceOf[js.Any],
        "RunId"   -> RunId.asInstanceOf[js.Any],
        "PredecessorsIncluded" -> PredecessorsIncluded.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobRunRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobRun" -> JobRun.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobRunResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobRunsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobRuns" -> JobRuns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobRunsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Jobs" -> Jobs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Source" -> Source.asInstanceOf[js.Any],
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sinks" -> Sinks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMappingRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Mapping" -> Mapping.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMappingResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"    -> DatabaseName.asInstanceOf[js.Any],
        "PartitionValues" -> PartitionValues.asInstanceOf[js.Any],
        "TableName"       -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPartitionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Partition" -> Partition.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPartitionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Expression" -> Expression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Segment" -> Segment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPartitionsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Partitions" -> Partitions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPartitionsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Mapping" -> Mapping.asInstanceOf[js.Any],
        "Source"  -> Source.asInstanceOf[js.Any],
        "Language" -> Language.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sinks" -> Sinks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPlanRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PythonScript" -> PythonScript.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalaCode" -> ScalaCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPlanResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {}

  object GetResourcePolicyRequest {
    def apply(
        ): GetResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcePolicyRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateTime" -> CreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyHash" -> PolicyHash.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyInJson" -> PolicyInJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateTime" -> UpdateTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcePolicyResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSecurityConfigurationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSecurityConfigurationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSecurityConfigurationsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfigurations" -> SecurityConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSecurityConfigurationsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTableRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Table" -> Table.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTableResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTableVersionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "TableVersion" -> TableVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTableVersionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName"    -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTableVersionsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableVersions" -> TableVersions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTableVersionsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Expression" -> Expression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTablesRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableList" -> TableList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTablesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTriggerRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Trigger" -> Trigger.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTriggerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DependentJobName" -> DependentJobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTriggersRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Triggers" -> Triggers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTriggersResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserDefinedFunctionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "UserDefinedFunction" -> UserDefinedFunction.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserDefinedFunctionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Pattern"      -> Pattern.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserDefinedFunctionsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserDefinedFunctions" -> UserDefinedFunctions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUserDefinedFunctionsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "GrokPattern"    -> GrokPattern.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomPatterns" -> CustomPatterns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdated" -> LastUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrokClassifier]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportCatalogToGlueRequest]
    }
  }

  @js.native
  trait ImportCatalogToGlueResponse extends js.Object {}

  object ImportCatalogToGlueResponse {
    def apply(
        ): ImportCatalogToGlueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportCatalogToGlueResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionName" -> ConnectionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Exclusions" -> Exclusions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Path" -> Path.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JdbcTarget]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedCapacity" -> AllocatedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Command" -> Command.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Connections" -> Connections.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedOn" -> CreatedOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultArguments" -> DefaultArguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExecutionProperty" -> ExecutionProperty.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedOn" -> LastModifiedOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogUri" -> LogUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxCapacity" -> MaxCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRetries" -> MaxRetries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationProperty" -> NotificationProperty.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfWorkers" -> NumberOfWorkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Role" -> Role.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkerType" -> WorkerType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attempt" -> Attempt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobBookmark" -> JobBookmark.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Run" -> Run.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobBookmarkEntry]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobBookmarksEncryptionMode" -> JobBookmarksEncryptionMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyArn" -> KmsKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobBookmarksEncryption]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScriptLocation" -> ScriptLocation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobCommand]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedCapacity" -> AllocatedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arguments" -> Arguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attempt" -> Attempt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletedOn" -> CompletedOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExecutionTime" -> ExecutionTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobRunState" -> JobRunState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedOn" -> LastModifiedOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogGroupName" -> LogGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxCapacity" -> MaxCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationProperty" -> NotificationProperty.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfWorkers" -> NumberOfWorkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PredecessorRuns" -> PredecessorRuns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreviousRunId" -> PreviousRunId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartedOn" -> StartedOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TriggerName" -> TriggerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkerType" -> WorkerType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobRun]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocatedCapacity" -> AllocatedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Command" -> Command.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Connections" -> Connections.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultArguments" -> DefaultArguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExecutionProperty" -> ExecutionProperty.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogUri" -> LogUri.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxCapacity" -> MaxCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRetries" -> MaxRetries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationProperty" -> NotificationProperty.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfWorkers" -> NumberOfWorkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Role" -> Role.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkerType" -> WorkerType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobUpdate]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JsonPath" -> JsonPath.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdated" -> LastUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JsonClassifier]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogGroup" -> LogGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogStream" -> LogStream.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessagePrefix" -> MessagePrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LastCrawlInfo]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCrawlersRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CrawlerNames" -> CrawlerNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCrawlersResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevEndpointsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DevEndpointNames" -> DevEndpointNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevEndpointsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobNames" -> JobNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DependentJobName" -> DependentJobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTriggersRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TriggerNames" -> TriggerNames.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTriggersResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DynamoDB" -> DynamoDB.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Jdbc" -> Jdbc.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3" -> S3.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Location]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SourcePath" -> SourcePath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceTable" -> SourceTable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceType" -> SourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetPath" -> TargetPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetTable" -> TargetTable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetType" -> TargetType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MappingEntry]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NotifyDelayAfter" -> NotifyDelayAfter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationProperty]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Column"    -> Column.asInstanceOf[js.Any],
        "SortOrder" -> SortOrder.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Order]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAccessTime" -> LastAccessTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAnalyzedTime" -> LastAnalyzedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageDescriptor" -> StorageDescriptor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableName" -> TableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Values" -> Values.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Partition]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorDetail" -> ErrorDetail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PartitionValues" -> PartitionValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PartitionError]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LastAccessTime" -> LastAccessTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAnalyzedTime" -> LastAnalyzedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageDescriptor" -> StorageDescriptor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Values" -> Values.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PartitionInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Values" -> Values.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PartitionValueList]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroupIdList" -> SecurityGroupIdList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetId" -> SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PhysicalConnectionRequirements]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RunId" -> RunId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Predecessor]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Conditions" -> Conditions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Logical" -> Logical.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Predicate]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DataCatalogEncryptionSettings" -> DataCatalogEncryptionSettings.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDataCatalogEncryptionSettingsRequest]
    }
  }

  @js.native
  trait PutDataCatalogEncryptionSettingsResponse extends js.Object {}

  object PutDataCatalogEncryptionSettingsResponse {
    def apply(
        ): PutDataCatalogEncryptionSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDataCatalogEncryptionSettingsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyInJson" -> PolicyInJson.asInstanceOf[js.Any],
        "PolicyExistsCondition" -> PolicyExistsCondition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyHashCondition" -> PolicyHashCondition.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResourcePolicyRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyHash" -> PolicyHash.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResourcePolicyResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetJobBookmarkRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobBookmarkEntry" -> JobBookmarkEntry.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetJobBookmarkResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Uri" -> Uri.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceUri]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "KmsKeyArn" -> KmsKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3EncryptionMode" -> S3EncryptionMode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Encryption]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Exclusions" -> Exclusions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Path" -> Path.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Target]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleExpression" -> ScheduleExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Schedule]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DeleteBehavior" -> DeleteBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateBehavior" -> UpdateBehavior.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SchemaChangePolicy]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTimeStamp" -> CreatedTimeStamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncryptionConfiguration" -> EncryptionConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityConfiguration]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentNumber" -> SegmentNumber.asInstanceOf[js.Any],
        "TotalSegments" -> TotalSegments.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Segment]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SerializationLibrary" -> SerializationLibrary.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SerDeInfo]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SkewedColumnNames" -> SkewedColumnNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SkewedColumnValueLocationMaps" -> SkewedColumnValueLocationMaps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SkewedColumnValues" -> SkewedColumnValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SkewedInfo]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartCrawlerRequest]
    }
  }

  @js.native
  trait StartCrawlerResponse extends js.Object {}

  object StartCrawlerResponse {
    def apply(
        ): StartCrawlerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartCrawlerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CrawlerName" -> CrawlerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartCrawlerScheduleRequest]
    }
  }

  @js.native
  trait StartCrawlerScheduleResponse extends js.Object {}

  object StartCrawlerScheduleResponse {
    def apply(
        ): StartCrawlerScheduleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartCrawlerScheduleResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.asInstanceOf[js.Any],
        "AllocatedCapacity" -> AllocatedCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arguments" -> Arguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobRunId" -> JobRunId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxCapacity" -> MaxCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationProperty" -> NotificationProperty.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfWorkers" -> NumberOfWorkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityConfiguration" -> SecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkerType" -> WorkerType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartJobRunRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobRunId" -> JobRunId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartJobRunResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTriggerRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTriggerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopCrawlerRequest]
    }
  }

  @js.native
  trait StopCrawlerResponse extends js.Object {}

  object StopCrawlerResponse {
    def apply(
        ): StopCrawlerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopCrawlerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CrawlerName" -> CrawlerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopCrawlerScheduleRequest]
    }
  }

  @js.native
  trait StopCrawlerScheduleResponse extends js.Object {}

  object StopCrawlerScheduleResponse {
    def apply(
        ): StopCrawlerScheduleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopCrawlerScheduleResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTriggerRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopTriggerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketColumns" -> BucketColumns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Columns" -> Columns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Compressed" -> Compressed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputFormat" -> InputFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfBuckets" -> NumberOfBuckets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputFormat" -> OutputFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SerdeInfo" -> SerdeInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SkewedInfo" -> SkewedInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SortColumns" -> SortColumns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StoredAsSubDirectories" -> StoredAsSubDirectories.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageDescriptor]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "CreateTime" -> CreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedBy" -> CreatedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAccessTime" -> LastAccessTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAnalyzedTime" -> LastAnalyzedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Owner" -> Owner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PartitionKeys" -> PartitionKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Retention" -> Retention.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageDescriptor" -> StorageDescriptor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableType" -> TableType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateTime" -> UpdateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ViewExpandedText" -> ViewExpandedText.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ViewOriginalText" -> ViewOriginalText.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Table]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorDetail" -> ErrorDetail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableName" -> TableName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableError]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAccessTime" -> LastAccessTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastAnalyzedTime" -> LastAnalyzedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Owner" -> Owner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PartitionKeys" -> PartitionKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Retention" -> Retention.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageDescriptor" -> StorageDescriptor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableType" -> TableType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ViewExpandedText" -> ViewExpandedText.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ViewOriginalText" -> ViewOriginalText.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Table" -> Table.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableVersion]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorDetail" -> ErrorDetail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TableName" -> TableName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionId" -> VersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableVersionError]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagsToAdd"   -> TagsToAdd.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Actions" -> Actions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Predicate" -> Predicate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Trigger]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Actions" -> Actions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Predicate" -> Predicate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TriggerUpdate]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn"  -> ResourceArn.asInstanceOf[js.Any],
        "TagsToRemove" -> TagsToRemove.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CsvClassifier" -> CsvClassifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GrokClassifier" -> GrokClassifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JsonClassifier" -> JsonClassifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "XMLClassifier" -> XMLClassifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateClassifierRequest]
    }
  }

  @js.native
  trait UpdateClassifierResponse extends js.Object {}

  object UpdateClassifierResponse {
    def apply(
        ): UpdateClassifierResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateClassifierResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionInput" -> ConnectionInput.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConnectionRequest]
    }
  }

  @js.native
  trait UpdateConnectionResponse extends js.Object {}

  object UpdateConnectionResponse {
    def apply(
        ): UpdateConnectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConnectionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Classifiers" -> Classifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CrawlerSecurityConfiguration" -> CrawlerSecurityConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatabaseName" -> DatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Role" -> Role.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaChangePolicy" -> SchemaChangePolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TablePrefix" -> TablePrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Targets" -> Targets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCrawlerRequest]
    }
  }

  @js.native
  trait UpdateCrawlerResponse extends js.Object {}

  object UpdateCrawlerResponse {
    def apply(
        ): UpdateCrawlerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCrawlerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CrawlerName" -> CrawlerName.asInstanceOf[js.Any],
        "Schedule" -> Schedule.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCrawlerScheduleRequest]
    }
  }

  @js.native
  trait UpdateCrawlerScheduleResponse extends js.Object {}

  object UpdateCrawlerScheduleResponse {
    def apply(
        ): UpdateCrawlerScheduleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCrawlerScheduleResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "AllowSingleColumn" -> AllowSingleColumn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContainsHeader" -> ContainsHeader.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Delimiter" -> Delimiter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisableValueTrimming" -> DisableValueTrimming.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Header" -> Header.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QuoteSymbol" -> QuoteSymbol.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCsvClassifierRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseInput" -> DatabaseInput.asInstanceOf[js.Any],
        "Name"          -> Name.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDatabaseRequest]
    }
  }

  @js.native
  trait UpdateDatabaseResponse extends js.Object {}

  object UpdateDatabaseResponse {
    def apply(
        ): UpdateDatabaseResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDatabaseResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "AddArguments" -> AddArguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AddPublicKeys" -> AddPublicKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomLibraries" -> CustomLibraries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeleteArguments" -> DeleteArguments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeletePublicKeys" -> DeletePublicKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicKey" -> PublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateEtlLibraries" -> UpdateEtlLibraries.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDevEndpointRequest]
    }
  }

  @js.native
  trait UpdateDevEndpointResponse extends js.Object {}

  object UpdateDevEndpointResponse {
    def apply(
        ): UpdateDevEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDevEndpointResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Classification" -> Classification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomPatterns" -> CustomPatterns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GrokPattern" -> GrokPattern.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGrokClassifierRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName"   -> JobName.asInstanceOf[js.Any],
        "JobUpdate" -> JobUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "JobName" -> JobName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "JsonPath" -> JsonPath.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJsonClassifierRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"       -> DatabaseName.asInstanceOf[js.Any],
        "PartitionInput"     -> PartitionInput.asInstanceOf[js.Any],
        "PartitionValueList" -> PartitionValueList.asInstanceOf[js.Any],
        "TableName"          -> TableName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePartitionRequest]
    }
  }

  @js.native
  trait UpdatePartitionResponse extends js.Object {}

  object UpdatePartitionResponse {
    def apply(
        ): UpdatePartitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePartitionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableInput"   -> TableInput.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SkipArchive" -> SkipArchive.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTableRequest]
    }
  }

  @js.native
  trait UpdateTableResponse extends js.Object {}

  object UpdateTableResponse {
    def apply(
        ): UpdateTableResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTableResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"          -> Name.asInstanceOf[js.Any],
        "TriggerUpdate" -> TriggerUpdate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTriggerRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Trigger" -> Trigger.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTriggerResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName"  -> DatabaseName.asInstanceOf[js.Any],
        "FunctionInput" -> FunctionInput.asInstanceOf[js.Any],
        "FunctionName"  -> FunctionName.asInstanceOf[js.Any],
        "CatalogId" -> CatalogId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait UpdateUserDefinedFunctionResponse extends js.Object {}

  object UpdateUserDefinedFunctionResponse {
    def apply(
        ): UpdateUserDefinedFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserDefinedFunctionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Classification" -> Classification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RowTag" -> RowTag.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateXMLClassifierRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ClassName" -> ClassName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreateTime" -> CreateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionName" -> FunctionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OwnerName" -> OwnerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OwnerType" -> OwnerType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceUris" -> ResourceUris.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserDefinedFunction]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ClassName" -> ClassName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionName" -> FunctionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OwnerName" -> OwnerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OwnerType" -> OwnerType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceUris" -> ResourceUris.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserDefinedFunctionInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Classification" -> Classification.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdated" -> LastUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RowTag" -> RowTag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[XMLClassifier]
    }
  }
}
