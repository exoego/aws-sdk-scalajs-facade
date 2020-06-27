package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  type CatalogEntries                          = js.Array[CatalogEntry]
  type CatalogIdString                         = String
  type CatalogTablesList                       = js.Array[NameString]
  type CatalogTargetList                       = js.Array[CatalogTarget]
  type Classification                          = String
  type ClassifierList                          = js.Array[Classifier]
  type ClassifierNameList                      = js.Array[NameString]
  type CodeGenArgName                          = String
  type CodeGenArgValue                         = String
  type CodeGenIdentifier                       = String
  type CodeGenNodeArgs                         = js.Array[CodeGenNodeArg]
  type CodeGenNodeType                         = String
  type ColumnList                              = js.Array[Column]
  type ColumnNameString                        = String
  type ColumnTypeString                        = String
  type ColumnValueStringList                   = js.Array[ColumnValuesString]
  type ColumnValuesString                      = String
  type CommentString                           = String
  type ConditionList                           = js.Array[Condition]
  type ConnectionList                          = js.Array[Connection]
  type ConnectionName                          = String
  type ConnectionProperties                    = js.Dictionary[ValueString]
  type CrawlList                               = js.Array[Crawl]
  type CrawlerConfiguration                    = String
  type CrawlerList                             = js.Array[Crawler]
  type CrawlerMetricsList                      = js.Array[CrawlerMetrics]
  type CrawlerNameList                         = js.Array[NameString]
  type CrawlerSecurityConfiguration            = String
  type CronExpression                          = String
  type CsvColumnDelimiter                      = String
  type CsvHeader                               = js.Array[NameString]
  type CsvQuoteSymbol                          = String
  type CustomPatterns                          = String
  type DagEdges                                = js.Array[CodeGenEdge]
  type DagNodes                                = js.Array[CodeGenNode]
  type DataLakePrincipalString                 = String
  type DatabaseList                            = js.Array[Database]
  type DatabaseName                            = String
  type DeleteConnectionNameList                = js.Array[NameString]
  type DescriptionString                       = String
  type DescriptionStringRemovable              = String
  type DevEndpointList                         = js.Array[DevEndpoint]
  type DevEndpointNameList                     = js.Array[NameString]
  type DevEndpointNames                        = js.Array[GenericString]
  type DynamoDBTargetList                      = js.Array[DynamoDBTarget]
  type EdgeList                                = js.Array[Edge]
  type ErrorByName                             = js.Dictionary[ErrorDetail]
  type ErrorString                             = String
  type ExecutionTime                           = Int
  type FieldType                               = String
  type FilterString                            = String
  type FormatString                            = String
  type GenericBoundedDouble                    = Double
  type GenericMap                              = js.Dictionary[GenericString]
  type GenericString                           = String
  type GetTableVersionsList                    = js.Array[TableVersion]
  type GlueResourceArn                         = String
  type GlueTables                              = js.Array[GlueTable]
  type GlueVersionString                       = String
  type GrokPattern                             = String
  type HashString                              = String
  type IdString                                = String
  type IntegerFlag                             = Int
  type IntegerValue                            = Int
  type JdbcTargetList                          = js.Array[JdbcTarget]
  type JobList                                 = js.Array[Job]
  type JobName                                 = String
  type JobNameList                             = js.Array[NameString]
  type JobRunList                              = js.Array[JobRun]
  type JsonPath                                = String
  type JsonValue                               = String
  type KeyString                               = String
  type KmsKeyArn                               = String
  type LabelCount                              = Int
  type LocationMap                             = js.Dictionary[ColumnValuesString]
  type LocationString                          = String
  type LogGroup                                = String
  type LogStream                               = String
  type MapValue                                = js.Dictionary[GenericString]
  type MappingList                             = js.Array[MappingEntry]
  type MatchCriteria                           = js.Array[NameString]
  type MaxConcurrentRuns                       = Int
  type MaxRetries                              = Int
  type MessagePrefix                           = String
  type MillisecondsCount                       = Double
  type NameString                              = String
  type NameStringList                          = js.Array[NameString]
  type NodeList                                = js.Array[Node]
  type NonNegativeDouble                       = Double
  type NonNegativeInteger                      = Int
  type NotifyDelayAfter                        = Int
  type NullableBoolean                         = Boolean
  type NullableDouble                          = Double
  type NullableInteger                         = Int
  type OrchestrationStringList                 = js.Array[GenericString]
  type OrderList                               = js.Array[Order]
  type PageSize                                = Int
  type PaginationToken                         = String
  type ParametersMap                           = js.Dictionary[ParametersMapValue]
  type ParametersMapValue                      = String
  type PartitionErrors                         = js.Array[PartitionError]
  type PartitionInputList                      = js.Array[PartitionInput]
  type PartitionList                           = js.Array[Partition]
  type Path                                    = String
  type PathList                                = js.Array[Path]
  type PermissionList                          = js.Array[Permission]
  type PolicyJsonString                        = String
  type PredecessorList                         = js.Array[Predecessor]
  type PredicateString                         = String
  type PrincipalPermissionsList                = js.Array[PrincipalPermissions]
  type PublicKeysList                          = js.Array[GenericString]
  type PythonScript                            = String
  type PythonVersionString                     = String
  type RecordsCount                            = Double
  type ReplaceBoolean                          = Boolean
  type ResourceUriList                         = js.Array[ResourceUri]
  type Role                                    = String
  type RoleArn                                 = String
  type RoleString                              = String
  type RowTag                                  = String
  type RunId                                   = String
  type S3EncryptionList                        = js.Array[S3Encryption]
  type S3TargetList                            = js.Array[S3Target]
  type ScalaCode                               = String
  type SchemaPathString                        = String
  type ScriptLocationString                    = String
  type SearchPropertyPredicates                = js.Array[PropertyPredicate]
  type SecurityConfigurationList               = js.Array[SecurityConfiguration]
  type SecurityGroupIdList                     = js.Array[NameString]
  type SortCriteria                            = js.Array[SortCriterion]
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
  type TaskRunList                             = js.Array[TaskRun]
  type Timeout                                 = Int
  type Timestamp                               = js.Date
  type TimestampValue                          = js.Date
  type Token                                   = String
  type TotalSegmentsInteger                    = Int
  type TransformList                           = js.Array[MLTransform]
  type TransformSchema                         = js.Array[SchemaColumn]
  type TriggerList                             = js.Array[Trigger]
  type TriggerNameList                         = js.Array[NameString]
  type URI                                     = String
  type UriString                               = String
  type UserDefinedFunctionList                 = js.Array[UserDefinedFunction]
  type ValueString                             = String
  type ValueStringList                         = js.Array[ValueString]
  type VersionId                               = Double
  type VersionString                           = String
  type ViewTextString                          = String
  type WorkflowNames                           = js.Array[NameString]
  type WorkflowRunProperties                   = js.Dictionary[GenericString]
  type WorkflowRuns                            = js.Array[WorkflowRun]
  type Workflows                               = js.Array[Workflow]

  implicit final class GlueOps(private val service: Glue) extends AnyVal {

    @inline def batchCreatePartitionFuture(params: BatchCreatePartitionRequest): Future[BatchCreatePartitionResponse] =
      service.batchCreatePartition(params).promise().toFuture
    @inline def batchDeleteConnectionFuture(
        params: BatchDeleteConnectionRequest
    ): Future[BatchDeleteConnectionResponse] = service.batchDeleteConnection(params).promise().toFuture
    @inline def batchDeletePartitionFuture(params: BatchDeletePartitionRequest): Future[BatchDeletePartitionResponse] =
      service.batchDeletePartition(params).promise().toFuture
    @inline def batchDeleteTableFuture(params: BatchDeleteTableRequest): Future[BatchDeleteTableResponse] =
      service.batchDeleteTable(params).promise().toFuture
    @inline def batchDeleteTableVersionFuture(
        params: BatchDeleteTableVersionRequest
    ): Future[BatchDeleteTableVersionResponse] = service.batchDeleteTableVersion(params).promise().toFuture
    @inline def batchGetCrawlersFuture(params: BatchGetCrawlersRequest): Future[BatchGetCrawlersResponse] =
      service.batchGetCrawlers(params).promise().toFuture
    @inline def batchGetDevEndpointsFuture(params: BatchGetDevEndpointsRequest): Future[BatchGetDevEndpointsResponse] =
      service.batchGetDevEndpoints(params).promise().toFuture
    @inline def batchGetJobsFuture(params: BatchGetJobsRequest): Future[BatchGetJobsResponse] =
      service.batchGetJobs(params).promise().toFuture
    @inline def batchGetPartitionFuture(params: BatchGetPartitionRequest): Future[BatchGetPartitionResponse] =
      service.batchGetPartition(params).promise().toFuture
    @inline def batchGetTriggersFuture(params: BatchGetTriggersRequest): Future[BatchGetTriggersResponse] =
      service.batchGetTriggers(params).promise().toFuture
    @inline def batchGetWorkflowsFuture(params: BatchGetWorkflowsRequest): Future[BatchGetWorkflowsResponse] =
      service.batchGetWorkflows(params).promise().toFuture
    @inline def batchStopJobRunFuture(params: BatchStopJobRunRequest): Future[BatchStopJobRunResponse] =
      service.batchStopJobRun(params).promise().toFuture
    @inline def cancelMLTaskRunFuture(params: CancelMLTaskRunRequest): Future[CancelMLTaskRunResponse] =
      service.cancelMLTaskRun(params).promise().toFuture
    @inline def createClassifierFuture(params: CreateClassifierRequest): Future[CreateClassifierResponse] =
      service.createClassifier(params).promise().toFuture
    @inline def createConnectionFuture(params: CreateConnectionRequest): Future[CreateConnectionResponse] =
      service.createConnection(params).promise().toFuture
    @inline def createCrawlerFuture(params: CreateCrawlerRequest): Future[CreateCrawlerResponse] =
      service.createCrawler(params).promise().toFuture
    @inline def createDatabaseFuture(params: CreateDatabaseRequest): Future[CreateDatabaseResponse] =
      service.createDatabase(params).promise().toFuture
    @inline def createDevEndpointFuture(params: CreateDevEndpointRequest): Future[CreateDevEndpointResponse] =
      service.createDevEndpoint(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise().toFuture
    @inline def createMLTransformFuture(params: CreateMLTransformRequest): Future[CreateMLTransformResponse] =
      service.createMLTransform(params).promise().toFuture
    @inline def createPartitionFuture(params: CreatePartitionRequest): Future[CreatePartitionResponse] =
      service.createPartition(params).promise().toFuture
    @inline def createScriptFuture(params: CreateScriptRequest): Future[CreateScriptResponse] =
      service.createScript(params).promise().toFuture
    @inline def createSecurityConfigurationFuture(
        params: CreateSecurityConfigurationRequest
    ): Future[CreateSecurityConfigurationResponse] = service.createSecurityConfiguration(params).promise().toFuture
    @inline def createTableFuture(params: CreateTableRequest): Future[CreateTableResponse] =
      service.createTable(params).promise().toFuture
    @inline def createTriggerFuture(params: CreateTriggerRequest): Future[CreateTriggerResponse] =
      service.createTrigger(params).promise().toFuture
    @inline def createUserDefinedFunctionFuture(
        params: CreateUserDefinedFunctionRequest
    ): Future[CreateUserDefinedFunctionResponse] = service.createUserDefinedFunction(params).promise().toFuture
    @inline def createWorkflowFuture(params: CreateWorkflowRequest): Future[CreateWorkflowResponse] =
      service.createWorkflow(params).promise().toFuture
    @inline def deleteClassifierFuture(params: DeleteClassifierRequest): Future[DeleteClassifierResponse] =
      service.deleteClassifier(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionRequest): Future[DeleteConnectionResponse] =
      service.deleteConnection(params).promise().toFuture
    @inline def deleteCrawlerFuture(params: DeleteCrawlerRequest): Future[DeleteCrawlerResponse] =
      service.deleteCrawler(params).promise().toFuture
    @inline def deleteDatabaseFuture(params: DeleteDatabaseRequest): Future[DeleteDatabaseResponse] =
      service.deleteDatabase(params).promise().toFuture
    @inline def deleteDevEndpointFuture(params: DeleteDevEndpointRequest): Future[DeleteDevEndpointResponse] =
      service.deleteDevEndpoint(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResponse] =
      service.deleteJob(params).promise().toFuture
    @inline def deleteMLTransformFuture(params: DeleteMLTransformRequest): Future[DeleteMLTransformResponse] =
      service.deleteMLTransform(params).promise().toFuture
    @inline def deletePartitionFuture(params: DeletePartitionRequest): Future[DeletePartitionResponse] =
      service.deletePartition(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] =
      service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteSecurityConfigurationFuture(
        params: DeleteSecurityConfigurationRequest
    ): Future[DeleteSecurityConfigurationResponse] = service.deleteSecurityConfiguration(params).promise().toFuture
    @inline def deleteTableFuture(params: DeleteTableRequest): Future[DeleteTableResponse] =
      service.deleteTable(params).promise().toFuture
    @inline def deleteTableVersionFuture(params: DeleteTableVersionRequest): Future[DeleteTableVersionResponse] =
      service.deleteTableVersion(params).promise().toFuture
    @inline def deleteTriggerFuture(params: DeleteTriggerRequest): Future[DeleteTriggerResponse] =
      service.deleteTrigger(params).promise().toFuture
    @inline def deleteUserDefinedFunctionFuture(
        params: DeleteUserDefinedFunctionRequest
    ): Future[DeleteUserDefinedFunctionResponse] = service.deleteUserDefinedFunction(params).promise().toFuture
    @inline def deleteWorkflowFuture(params: DeleteWorkflowRequest): Future[DeleteWorkflowResponse] =
      service.deleteWorkflow(params).promise().toFuture
    @inline def getCatalogImportStatusFuture(
        params: GetCatalogImportStatusRequest
    ): Future[GetCatalogImportStatusResponse] = service.getCatalogImportStatus(params).promise().toFuture
    @inline def getClassifierFuture(params: GetClassifierRequest): Future[GetClassifierResponse] =
      service.getClassifier(params).promise().toFuture
    @inline def getClassifiersFuture(params: GetClassifiersRequest): Future[GetClassifiersResponse] =
      service.getClassifiers(params).promise().toFuture
    @inline def getConnectionFuture(params: GetConnectionRequest): Future[GetConnectionResponse] =
      service.getConnection(params).promise().toFuture
    @inline def getConnectionsFuture(params: GetConnectionsRequest): Future[GetConnectionsResponse] =
      service.getConnections(params).promise().toFuture
    @inline def getCrawlerFuture(params: GetCrawlerRequest): Future[GetCrawlerResponse] =
      service.getCrawler(params).promise().toFuture
    @inline def getCrawlerMetricsFuture(params: GetCrawlerMetricsRequest): Future[GetCrawlerMetricsResponse] =
      service.getCrawlerMetrics(params).promise().toFuture
    @inline def getCrawlersFuture(params: GetCrawlersRequest): Future[GetCrawlersResponse] =
      service.getCrawlers(params).promise().toFuture
    @inline def getDataCatalogEncryptionSettingsFuture(
        params: GetDataCatalogEncryptionSettingsRequest
    ): Future[GetDataCatalogEncryptionSettingsResponse] =
      service.getDataCatalogEncryptionSettings(params).promise().toFuture
    @inline def getDatabaseFuture(params: GetDatabaseRequest): Future[GetDatabaseResponse] =
      service.getDatabase(params).promise().toFuture
    @inline def getDatabasesFuture(params: GetDatabasesRequest): Future[GetDatabasesResponse] =
      service.getDatabases(params).promise().toFuture
    @inline def getDataflowGraphFuture(params: GetDataflowGraphRequest): Future[GetDataflowGraphResponse] =
      service.getDataflowGraph(params).promise().toFuture
    @inline def getDevEndpointFuture(params: GetDevEndpointRequest): Future[GetDevEndpointResponse] =
      service.getDevEndpoint(params).promise().toFuture
    @inline def getDevEndpointsFuture(params: GetDevEndpointsRequest): Future[GetDevEndpointsResponse] =
      service.getDevEndpoints(params).promise().toFuture
    @inline def getJobBookmarkFuture(params: GetJobBookmarkRequest): Future[GetJobBookmarkResponse] =
      service.getJobBookmark(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise().toFuture
    @inline def getJobRunFuture(params: GetJobRunRequest): Future[GetJobRunResponse] =
      service.getJobRun(params).promise().toFuture
    @inline def getJobRunsFuture(params: GetJobRunsRequest): Future[GetJobRunsResponse] =
      service.getJobRuns(params).promise().toFuture
    @inline def getJobsFuture(params: GetJobsRequest): Future[GetJobsResponse] =
      service.getJobs(params).promise().toFuture
    @inline def getMLTaskRunFuture(params: GetMLTaskRunRequest): Future[GetMLTaskRunResponse] =
      service.getMLTaskRun(params).promise().toFuture
    @inline def getMLTaskRunsFuture(params: GetMLTaskRunsRequest): Future[GetMLTaskRunsResponse] =
      service.getMLTaskRuns(params).promise().toFuture
    @inline def getMLTransformFuture(params: GetMLTransformRequest): Future[GetMLTransformResponse] =
      service.getMLTransform(params).promise().toFuture
    @inline def getMLTransformsFuture(params: GetMLTransformsRequest): Future[GetMLTransformsResponse] =
      service.getMLTransforms(params).promise().toFuture
    @inline def getMappingFuture(params: GetMappingRequest): Future[GetMappingResponse] =
      service.getMapping(params).promise().toFuture
    @inline def getPartitionFuture(params: GetPartitionRequest): Future[GetPartitionResponse] =
      service.getPartition(params).promise().toFuture
    @inline def getPartitionsFuture(params: GetPartitionsRequest): Future[GetPartitionsResponse] =
      service.getPartitions(params).promise().toFuture
    @inline def getPlanFuture(params: GetPlanRequest): Future[GetPlanResponse] =
      service.getPlan(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] =
      service.getResourcePolicy(params).promise().toFuture
    @inline def getSecurityConfigurationFuture(
        params: GetSecurityConfigurationRequest
    ): Future[GetSecurityConfigurationResponse] = service.getSecurityConfiguration(params).promise().toFuture
    @inline def getSecurityConfigurationsFuture(
        params: GetSecurityConfigurationsRequest
    ): Future[GetSecurityConfigurationsResponse] = service.getSecurityConfigurations(params).promise().toFuture
    @inline def getTableFuture(params: GetTableRequest): Future[GetTableResponse] =
      service.getTable(params).promise().toFuture
    @inline def getTableVersionFuture(params: GetTableVersionRequest): Future[GetTableVersionResponse] =
      service.getTableVersion(params).promise().toFuture
    @inline def getTableVersionsFuture(params: GetTableVersionsRequest): Future[GetTableVersionsResponse] =
      service.getTableVersions(params).promise().toFuture
    @inline def getTablesFuture(params: GetTablesRequest): Future[GetTablesResponse] =
      service.getTables(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsRequest): Future[GetTagsResponse] =
      service.getTags(params).promise().toFuture
    @inline def getTriggerFuture(params: GetTriggerRequest): Future[GetTriggerResponse] =
      service.getTrigger(params).promise().toFuture
    @inline def getTriggersFuture(params: GetTriggersRequest): Future[GetTriggersResponse] =
      service.getTriggers(params).promise().toFuture
    @inline def getUserDefinedFunctionFuture(
        params: GetUserDefinedFunctionRequest
    ): Future[GetUserDefinedFunctionResponse] = service.getUserDefinedFunction(params).promise().toFuture
    @inline def getUserDefinedFunctionsFuture(
        params: GetUserDefinedFunctionsRequest
    ): Future[GetUserDefinedFunctionsResponse] = service.getUserDefinedFunctions(params).promise().toFuture
    @inline def getWorkflowFuture(params: GetWorkflowRequest): Future[GetWorkflowResponse] =
      service.getWorkflow(params).promise().toFuture
    @inline def getWorkflowRunFuture(params: GetWorkflowRunRequest): Future[GetWorkflowRunResponse] =
      service.getWorkflowRun(params).promise().toFuture
    @inline def getWorkflowRunPropertiesFuture(
        params: GetWorkflowRunPropertiesRequest
    ): Future[GetWorkflowRunPropertiesResponse] = service.getWorkflowRunProperties(params).promise().toFuture
    @inline def getWorkflowRunsFuture(params: GetWorkflowRunsRequest): Future[GetWorkflowRunsResponse] =
      service.getWorkflowRuns(params).promise().toFuture
    @inline def importCatalogToGlueFuture(params: ImportCatalogToGlueRequest): Future[ImportCatalogToGlueResponse] =
      service.importCatalogToGlue(params).promise().toFuture
    @inline def listCrawlersFuture(params: ListCrawlersRequest): Future[ListCrawlersResponse] =
      service.listCrawlers(params).promise().toFuture
    @inline def listDevEndpointsFuture(params: ListDevEndpointsRequest): Future[ListDevEndpointsResponse] =
      service.listDevEndpoints(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] =
      service.listJobs(params).promise().toFuture
    @inline def listTriggersFuture(params: ListTriggersRequest): Future[ListTriggersResponse] =
      service.listTriggers(params).promise().toFuture
    @inline def listWorkflowsFuture(params: ListWorkflowsRequest): Future[ListWorkflowsResponse] =
      service.listWorkflows(params).promise().toFuture
    @inline def putDataCatalogEncryptionSettingsFuture(
        params: PutDataCatalogEncryptionSettingsRequest
    ): Future[PutDataCatalogEncryptionSettingsResponse] =
      service.putDataCatalogEncryptionSettings(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] =
      service.putResourcePolicy(params).promise().toFuture
    @inline def putWorkflowRunPropertiesFuture(
        params: PutWorkflowRunPropertiesRequest
    ): Future[PutWorkflowRunPropertiesResponse] = service.putWorkflowRunProperties(params).promise().toFuture
    @inline def resetJobBookmarkFuture(params: ResetJobBookmarkRequest): Future[ResetJobBookmarkResponse] =
      service.resetJobBookmark(params).promise().toFuture
    @inline def searchTablesFuture(params: SearchTablesRequest): Future[SearchTablesResponse] =
      service.searchTables(params).promise().toFuture
    @inline def startCrawlerFuture(params: StartCrawlerRequest): Future[StartCrawlerResponse] =
      service.startCrawler(params).promise().toFuture
    @inline def startCrawlerScheduleFuture(params: StartCrawlerScheduleRequest): Future[StartCrawlerScheduleResponse] =
      service.startCrawlerSchedule(params).promise().toFuture
    @inline def startExportLabelsTaskRunFuture(
        params: StartExportLabelsTaskRunRequest
    ): Future[StartExportLabelsTaskRunResponse] = service.startExportLabelsTaskRun(params).promise().toFuture
    @inline def startImportLabelsTaskRunFuture(
        params: StartImportLabelsTaskRunRequest
    ): Future[StartImportLabelsTaskRunResponse] = service.startImportLabelsTaskRun(params).promise().toFuture
    @inline def startJobRunFuture(params: StartJobRunRequest): Future[StartJobRunResponse] =
      service.startJobRun(params).promise().toFuture
    @inline def startMLEvaluationTaskRunFuture(
        params: StartMLEvaluationTaskRunRequest
    ): Future[StartMLEvaluationTaskRunResponse] = service.startMLEvaluationTaskRun(params).promise().toFuture
    @inline def startMLLabelingSetGenerationTaskRunFuture(
        params: StartMLLabelingSetGenerationTaskRunRequest
    ): Future[StartMLLabelingSetGenerationTaskRunResponse] =
      service.startMLLabelingSetGenerationTaskRun(params).promise().toFuture
    @inline def startTriggerFuture(params: StartTriggerRequest): Future[StartTriggerResponse] =
      service.startTrigger(params).promise().toFuture
    @inline def startWorkflowRunFuture(params: StartWorkflowRunRequest): Future[StartWorkflowRunResponse] =
      service.startWorkflowRun(params).promise().toFuture
    @inline def stopCrawlerFuture(params: StopCrawlerRequest): Future[StopCrawlerResponse] =
      service.stopCrawler(params).promise().toFuture
    @inline def stopCrawlerScheduleFuture(params: StopCrawlerScheduleRequest): Future[StopCrawlerScheduleResponse] =
      service.stopCrawlerSchedule(params).promise().toFuture
    @inline def stopTriggerFuture(params: StopTriggerRequest): Future[StopTriggerResponse] =
      service.stopTrigger(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateClassifierFuture(params: UpdateClassifierRequest): Future[UpdateClassifierResponse] =
      service.updateClassifier(params).promise().toFuture
    @inline def updateConnectionFuture(params: UpdateConnectionRequest): Future[UpdateConnectionResponse] =
      service.updateConnection(params).promise().toFuture
    @inline def updateCrawlerFuture(params: UpdateCrawlerRequest): Future[UpdateCrawlerResponse] =
      service.updateCrawler(params).promise().toFuture
    @inline def updateCrawlerScheduleFuture(
        params: UpdateCrawlerScheduleRequest
    ): Future[UpdateCrawlerScheduleResponse] = service.updateCrawlerSchedule(params).promise().toFuture
    @inline def updateDatabaseFuture(params: UpdateDatabaseRequest): Future[UpdateDatabaseResponse] =
      service.updateDatabase(params).promise().toFuture
    @inline def updateDevEndpointFuture(params: UpdateDevEndpointRequest): Future[UpdateDevEndpointResponse] =
      service.updateDevEndpoint(params).promise().toFuture
    @inline def updateJobFuture(params: UpdateJobRequest): Future[UpdateJobResponse] =
      service.updateJob(params).promise().toFuture
    @inline def updateMLTransformFuture(params: UpdateMLTransformRequest): Future[UpdateMLTransformResponse] =
      service.updateMLTransform(params).promise().toFuture
    @inline def updatePartitionFuture(params: UpdatePartitionRequest): Future[UpdatePartitionResponse] =
      service.updatePartition(params).promise().toFuture
    @inline def updateTableFuture(params: UpdateTableRequest): Future[UpdateTableResponse] =
      service.updateTable(params).promise().toFuture
    @inline def updateTriggerFuture(params: UpdateTriggerRequest): Future[UpdateTriggerResponse] =
      service.updateTrigger(params).promise().toFuture
    @inline def updateUserDefinedFunctionFuture(
        params: UpdateUserDefinedFunctionRequest
    ): Future[UpdateUserDefinedFunctionResponse] = service.updateUserDefinedFunction(params).promise().toFuture
    @inline def updateWorkflowFuture(params: UpdateWorkflowRequest): Future[UpdateWorkflowResponse] =
      service.updateWorkflow(params).promise().toFuture
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
    def batchGetWorkflows(params: BatchGetWorkflowsRequest): Request[BatchGetWorkflowsResponse]          = js.native
    def batchStopJobRun(params: BatchStopJobRunRequest): Request[BatchStopJobRunResponse]                = js.native
    def cancelMLTaskRun(params: CancelMLTaskRunRequest): Request[CancelMLTaskRunResponse]                = js.native
    def createClassifier(params: CreateClassifierRequest): Request[CreateClassifierResponse]             = js.native
    def createConnection(params: CreateConnectionRequest): Request[CreateConnectionResponse]             = js.native
    def createCrawler(params: CreateCrawlerRequest): Request[CreateCrawlerResponse]                      = js.native
    def createDatabase(params: CreateDatabaseRequest): Request[CreateDatabaseResponse]                   = js.native
    def createDevEndpoint(params: CreateDevEndpointRequest): Request[CreateDevEndpointResponse]          = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse]                                  = js.native
    def createMLTransform(params: CreateMLTransformRequest): Request[CreateMLTransformResponse]          = js.native
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
    def createWorkflow(params: CreateWorkflowRequest): Request[CreateWorkflowResponse]                   = js.native
    def deleteClassifier(params: DeleteClassifierRequest): Request[DeleteClassifierResponse]             = js.native
    def deleteConnection(params: DeleteConnectionRequest): Request[DeleteConnectionResponse]             = js.native
    def deleteCrawler(params: DeleteCrawlerRequest): Request[DeleteCrawlerResponse]                      = js.native
    def deleteDatabase(params: DeleteDatabaseRequest): Request[DeleteDatabaseResponse]                   = js.native
    def deleteDevEndpoint(params: DeleteDevEndpointRequest): Request[DeleteDevEndpointResponse]          = js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse]                                  = js.native
    def deleteMLTransform(params: DeleteMLTransformRequest): Request[DeleteMLTransformResponse]          = js.native
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
    ): Request[DeleteUserDefinedFunctionResponse]                                      = js.native
    def deleteWorkflow(params: DeleteWorkflowRequest): Request[DeleteWorkflowResponse] = js.native
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
    def getJobBookmark(params: GetJobBookmarkRequest): Request[GetJobBookmarkResponse]          = js.native
    def getJobRun(params: GetJobRunRequest): Request[GetJobRunResponse]                         = js.native
    def getJobRuns(params: GetJobRunsRequest): Request[GetJobRunsResponse]                      = js.native
    def getJobs(params: GetJobsRequest): Request[GetJobsResponse]                               = js.native
    def getMLTaskRun(params: GetMLTaskRunRequest): Request[GetMLTaskRunResponse]                = js.native
    def getMLTaskRuns(params: GetMLTaskRunsRequest): Request[GetMLTaskRunsResponse]             = js.native
    def getMLTransform(params: GetMLTransformRequest): Request[GetMLTransformResponse]          = js.native
    def getMLTransforms(params: GetMLTransformsRequest): Request[GetMLTransformsResponse]       = js.native
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
    def getWorkflow(params: GetWorkflowRequest): Request[GetWorkflowResponse]          = js.native
    def getWorkflowRun(params: GetWorkflowRunRequest): Request[GetWorkflowRunResponse] = js.native
    def getWorkflowRunProperties(params: GetWorkflowRunPropertiesRequest): Request[GetWorkflowRunPropertiesResponse] =
      js.native
    def getWorkflowRuns(params: GetWorkflowRunsRequest): Request[GetWorkflowRunsResponse]             = js.native
    def importCatalogToGlue(params: ImportCatalogToGlueRequest): Request[ImportCatalogToGlueResponse] = js.native
    def listCrawlers(params: ListCrawlersRequest): Request[ListCrawlersResponse]                      = js.native
    def listDevEndpoints(params: ListDevEndpointsRequest): Request[ListDevEndpointsResponse]          = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse]                                  = js.native
    def listTriggers(params: ListTriggersRequest): Request[ListTriggersResponse]                      = js.native
    def listWorkflows(params: ListWorkflowsRequest): Request[ListWorkflowsResponse]                   = js.native
    def putDataCatalogEncryptionSettings(
        params: PutDataCatalogEncryptionSettingsRequest
    ): Request[PutDataCatalogEncryptionSettingsResponse]                                        = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def putWorkflowRunProperties(params: PutWorkflowRunPropertiesRequest): Request[PutWorkflowRunPropertiesResponse] =
      js.native
    def resetJobBookmark(params: ResetJobBookmarkRequest): Request[ResetJobBookmarkResponse]             = js.native
    def searchTables(params: SearchTablesRequest): Request[SearchTablesResponse]                         = js.native
    def startCrawler(params: StartCrawlerRequest): Request[StartCrawlerResponse]                         = js.native
    def startCrawlerSchedule(params: StartCrawlerScheduleRequest): Request[StartCrawlerScheduleResponse] = js.native
    def startExportLabelsTaskRun(params: StartExportLabelsTaskRunRequest): Request[StartExportLabelsTaskRunResponse] =
      js.native
    def startImportLabelsTaskRun(params: StartImportLabelsTaskRunRequest): Request[StartImportLabelsTaskRunResponse] =
      js.native
    def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse] = js.native
    def startMLEvaluationTaskRun(params: StartMLEvaluationTaskRunRequest): Request[StartMLEvaluationTaskRunResponse] =
      js.native
    def startMLLabelingSetGenerationTaskRun(
        params: StartMLLabelingSetGenerationTaskRunRequest
    ): Request[StartMLLabelingSetGenerationTaskRunResponse]                                                 = js.native
    def startTrigger(params: StartTriggerRequest): Request[StartTriggerResponse]                            = js.native
    def startWorkflowRun(params: StartWorkflowRunRequest): Request[StartWorkflowRunResponse]                = js.native
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
    def updateMLTransform(params: UpdateMLTransformRequest): Request[UpdateMLTransformResponse]             = js.native
    def updatePartition(params: UpdatePartitionRequest): Request[UpdatePartitionResponse]                   = js.native
    def updateTable(params: UpdateTableRequest): Request[UpdateTableResponse]                               = js.native
    def updateTrigger(params: UpdateTriggerRequest): Request[UpdateTriggerResponse]                         = js.native
    def updateUserDefinedFunction(
        params: UpdateUserDefinedFunctionRequest
    ): Request[UpdateUserDefinedFunctionResponse]                                      = js.native
    def updateWorkflow(params: UpdateWorkflowRequest): Request[UpdateWorkflowResponse] = js.native
  }

  /**
    * Defines an action to be initiated by a trigger.
    */
  @js.native
  @Factory
  trait Action extends js.Object {
    var Arguments: js.UndefOr[GenericMap]
    var CrawlerName: js.UndefOr[NameString]
    var JobName: js.UndefOr[NameString]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Timeout: js.UndefOr[Timeout]
  }

  @js.native
  @Factory
  trait BatchCreatePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionInputList: PartitionInputList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait BatchCreatePartitionResponse extends js.Object {
    var Errors: js.UndefOr[PartitionErrors]
  }

  @js.native
  @Factory
  trait BatchDeleteConnectionRequest extends js.Object {
    var ConnectionNameList: DeleteConnectionNameList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait BatchDeleteConnectionResponse extends js.Object {
    var Errors: js.UndefOr[ErrorByName]
    var Succeeded: js.UndefOr[NameStringList]
  }

  @js.native
  @Factory
  trait BatchDeletePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionsToDelete: BatchDeletePartitionValueList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait BatchDeletePartitionResponse extends js.Object {
    var Errors: js.UndefOr[PartitionErrors]
  }

  @js.native
  @Factory
  trait BatchDeleteTableRequest extends js.Object {
    var DatabaseName: NameString
    var TablesToDelete: BatchDeleteTableNameList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait BatchDeleteTableResponse extends js.Object {
    var Errors: js.UndefOr[TableErrors]
  }

  @js.native
  @Factory
  trait BatchDeleteTableVersionRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var VersionIds: BatchDeleteTableVersionList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait BatchDeleteTableVersionResponse extends js.Object {
    var Errors: js.UndefOr[TableVersionErrors]
  }

  @js.native
  @Factory
  trait BatchGetCrawlersRequest extends js.Object {
    var CrawlerNames: CrawlerNameList
  }

  @js.native
  @Factory
  trait BatchGetCrawlersResponse extends js.Object {
    var Crawlers: js.UndefOr[CrawlerList]
    var CrawlersNotFound: js.UndefOr[CrawlerNameList]
  }

  @js.native
  @Factory
  trait BatchGetDevEndpointsRequest extends js.Object {
    var DevEndpointNames: DevEndpointNames
  }

  @js.native
  @Factory
  trait BatchGetDevEndpointsResponse extends js.Object {
    var DevEndpoints: js.UndefOr[DevEndpointList]
    var DevEndpointsNotFound: js.UndefOr[DevEndpointNames]
  }

  @js.native
  @Factory
  trait BatchGetJobsRequest extends js.Object {
    var JobNames: JobNameList
  }

  @js.native
  @Factory
  trait BatchGetJobsResponse extends js.Object {
    var Jobs: js.UndefOr[JobList]
    var JobsNotFound: js.UndefOr[JobNameList]
  }

  @js.native
  @Factory
  trait BatchGetPartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionsToGet: BatchGetPartitionValueList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait BatchGetPartitionResponse extends js.Object {
    var Partitions: js.UndefOr[PartitionList]
    var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList]
  }

  @js.native
  @Factory
  trait BatchGetTriggersRequest extends js.Object {
    var TriggerNames: TriggerNameList
  }

  @js.native
  @Factory
  trait BatchGetTriggersResponse extends js.Object {
    var Triggers: js.UndefOr[TriggerList]
    var TriggersNotFound: js.UndefOr[TriggerNameList]
  }

  @js.native
  @Factory
  trait BatchGetWorkflowsRequest extends js.Object {
    var Names: WorkflowNames
    var IncludeGraph: js.UndefOr[NullableBoolean]
  }

  @js.native
  @Factory
  trait BatchGetWorkflowsResponse extends js.Object {
    var MissingWorkflows: js.UndefOr[WorkflowNames]
    var Workflows: js.UndefOr[Workflows]
  }

  /**
    * Records an error that occurred when attempting to stop a specified job run.
    */
  @js.native
  @Factory
  trait BatchStopJobRunError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var JobName: js.UndefOr[NameString]
    var JobRunId: js.UndefOr[IdString]
  }

  @js.native
  @Factory
  trait BatchStopJobRunRequest extends js.Object {
    var JobName: NameString
    var JobRunIds: BatchStopJobRunJobRunIdList
  }

  @js.native
  @Factory
  trait BatchStopJobRunResponse extends js.Object {
    var Errors: js.UndefOr[BatchStopJobRunErrorList]
    var SuccessfulSubmissions: js.UndefOr[BatchStopJobRunSuccessfulSubmissionList]
  }

  /**
    * Records a successful request to stop a specified <code>JobRun</code>.
    */
  @js.native
  @Factory
  trait BatchStopJobRunSuccessfulSubmission extends js.Object {
    var JobName: js.UndefOr[NameString]
    var JobRunId: js.UndefOr[IdString]
  }

  @js.native
  @Factory
  trait CancelMLTaskRunRequest extends js.Object {
    var TaskRunId: HashString
    var TransformId: HashString
  }

  @js.native
  @Factory
  trait CancelMLTaskRunResponse extends js.Object {
    var Status: js.UndefOr[TaskStatusType]
    var TaskRunId: js.UndefOr[HashString]
    var TransformId: js.UndefOr[HashString]
  }

  @js.native
  sealed trait CatalogEncryptionMode extends js.Any
  object CatalogEncryptionMode extends js.Object {
    val DISABLED  = "DISABLED".asInstanceOf[CatalogEncryptionMode]
    val `SSE-KMS` = "SSE-KMS".asInstanceOf[CatalogEncryptionMode]

    val values = js.Object.freeze(js.Array(DISABLED, `SSE-KMS`))
  }

  /**
    * Specifies a table definition in the AWS Glue Data Catalog.
    */
  @js.native
  @Factory
  trait CatalogEntry extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
  }

  /**
    * A structure containing migration status information.
    */
  @js.native
  @Factory
  trait CatalogImportStatus extends js.Object {
    var ImportCompleted: js.UndefOr[Boolean]
    var ImportTime: js.UndefOr[Timestamp]
    var ImportedBy: js.UndefOr[NameString]
  }

  /**
    * Specifies an AWS Glue Data Catalog target.
    */
  @js.native
  @Factory
  trait CatalogTarget extends js.Object {
    var DatabaseName: NameString
    var Tables: CatalogTablesList
  }

  /**
    * Classifiers are triggered during a crawl task. A classifier checks whether a given file is in a format it can handle. If it is, the classifier creates a schema in the form of a <code>StructType</code> object that matches that data format.
    *  You can use the standard classifiers that AWS Glue provides, or you can write your own classifiers to best categorize your data sources and specify the appropriate schemas to use for them. A classifier can be a <code>grok</code> classifier, an <code>XML</code> classifier, a <code>JSON</code> classifier, or a custom <code>CSV</code> classifier, as specified in one of the fields in the <code>Classifier</code> object.
    */
  @js.native
  @Factory
  trait Classifier extends js.Object {
    var CsvClassifier: js.UndefOr[CsvClassifier]
    var GrokClassifier: js.UndefOr[GrokClassifier]
    var JsonClassifier: js.UndefOr[JsonClassifier]
    var XMLClassifier: js.UndefOr[XMLClassifier]
  }

  /**
    * Specifies how Amazon CloudWatch data should be encrypted.
    */
  @js.native
  @Factory
  trait CloudWatchEncryption extends js.Object {
    var CloudWatchEncryptionMode: js.UndefOr[CloudWatchEncryptionMode]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  @js.native
  sealed trait CloudWatchEncryptionMode extends js.Any
  object CloudWatchEncryptionMode extends js.Object {
    val DISABLED  = "DISABLED".asInstanceOf[CloudWatchEncryptionMode]
    val `SSE-KMS` = "SSE-KMS".asInstanceOf[CloudWatchEncryptionMode]

    val values = js.Object.freeze(js.Array(DISABLED, `SSE-KMS`))
  }

  /**
    * Represents a directional edge in a directed acyclic graph (DAG).
    */
  @js.native
  @Factory
  trait CodeGenEdge extends js.Object {
    var Source: CodeGenIdentifier
    var Target: CodeGenIdentifier
    var TargetParameter: js.UndefOr[CodeGenArgName]
  }

  /**
    * Represents a node in a directed acyclic graph (DAG)
    */
  @js.native
  @Factory
  trait CodeGenNode extends js.Object {
    var Args: CodeGenNodeArgs
    var Id: CodeGenIdentifier
    var NodeType: CodeGenNodeType
    var LineNumber: js.UndefOr[Int]
  }

  /**
    * An argument or property of a node.
    */
  @js.native
  @Factory
  trait CodeGenNodeArg extends js.Object {
    var Name: CodeGenArgName
    var Value: CodeGenArgValue
    var Param: js.UndefOr[Boolean]
  }

  /**
    * A column in a <code>Table</code>.
    */
  @js.native
  @Factory
  trait Column extends js.Object {
    var Name: NameString
    var Comment: js.UndefOr[CommentString]
    var Parameters: js.UndefOr[ParametersMap]
    var Type: js.UndefOr[ColumnTypeString]
  }

  @js.native
  sealed trait Comparator extends js.Any
  object Comparator extends js.Object {
    val EQUALS              = "EQUALS".asInstanceOf[Comparator]
    val GREATER_THAN        = "GREATER_THAN".asInstanceOf[Comparator]
    val LESS_THAN           = "LESS_THAN".asInstanceOf[Comparator]
    val GREATER_THAN_EQUALS = "GREATER_THAN_EQUALS".asInstanceOf[Comparator]
    val LESS_THAN_EQUALS    = "LESS_THAN_EQUALS".asInstanceOf[Comparator]

    val values = js.Object.freeze(js.Array(EQUALS, GREATER_THAN, LESS_THAN, GREATER_THAN_EQUALS, LESS_THAN_EQUALS))
  }

  /**
    * Defines a condition under which a trigger fires.
    */
  @js.native
  @Factory
  trait Condition extends js.Object {
    var CrawlState: js.UndefOr[CrawlState]
    var CrawlerName: js.UndefOr[NameString]
    var JobName: js.UndefOr[NameString]
    var LogicalOperator: js.UndefOr[LogicalOperator]
    var State: js.UndefOr[JobRunState]
  }

  /**
    * The confusion matrix shows you what your transform is predicting accurately and what types of errors it is making.
    *  For more information, see [[https://en.wikipedia.org/wiki/Confusion_matrix|Confusion matrix]] in Wikipedia.
    */
  @js.native
  @Factory
  trait ConfusionMatrix extends js.Object {
    var NumFalseNegatives: js.UndefOr[RecordsCount]
    var NumFalsePositives: js.UndefOr[RecordsCount]
    var NumTrueNegatives: js.UndefOr[RecordsCount]
    var NumTruePositives: js.UndefOr[RecordsCount]
  }

  /**
    * Defines a connection to a data source.
    */
  @js.native
  @Factory
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

  /**
    * A structure that is used to specify a connection to create or update.
    */
  @js.native
  @Factory
  trait ConnectionInput extends js.Object {
    var ConnectionProperties: ConnectionProperties
    var ConnectionType: ConnectionType
    var Name: NameString
    var Description: js.UndefOr[DescriptionString]
    var MatchCriteria: js.UndefOr[MatchCriteria]
    var PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements]
  }

  /**
    * The data structure used by the Data Catalog to encrypt the password as part of <code>CreateConnection</code> or <code>UpdateConnection</code> and store it in the <code>ENCRYPTED_PASSWORD</code> field in the connection properties. You can enable catalog encryption or only password encryption.
    *  When a <code>CreationConnection</code> request arrives containing a password, the Data Catalog first encrypts the password using your AWS KMS key. It then encrypts the whole connection object again if catalog encryption is also enabled.
    *  This encryption requires that you set AWS KMS key permissions to enable or restrict access on the password key according to your security requirements. For example, you might want only administrators to have decrypt permission on the password key.
    */
  @js.native
  @Factory
  trait ConnectionPasswordEncryption extends js.Object {
    var ReturnConnectionPasswordEncrypted: Boolean
    var AwsKmsKeyId: js.UndefOr[NameString]
  }

  @js.native
  sealed trait ConnectionPropertyKey extends js.Any
  object ConnectionPropertyKey extends js.Object {
    val HOST                             = "HOST".asInstanceOf[ConnectionPropertyKey]
    val PORT                             = "PORT".asInstanceOf[ConnectionPropertyKey]
    val USERNAME                         = "USERNAME".asInstanceOf[ConnectionPropertyKey]
    val PASSWORD                         = "PASSWORD".asInstanceOf[ConnectionPropertyKey]
    val ENCRYPTED_PASSWORD               = "ENCRYPTED_PASSWORD".asInstanceOf[ConnectionPropertyKey]
    val JDBC_DRIVER_JAR_URI              = "JDBC_DRIVER_JAR_URI".asInstanceOf[ConnectionPropertyKey]
    val JDBC_DRIVER_CLASS_NAME           = "JDBC_DRIVER_CLASS_NAME".asInstanceOf[ConnectionPropertyKey]
    val JDBC_ENGINE                      = "JDBC_ENGINE".asInstanceOf[ConnectionPropertyKey]
    val JDBC_ENGINE_VERSION              = "JDBC_ENGINE_VERSION".asInstanceOf[ConnectionPropertyKey]
    val CONFIG_FILES                     = "CONFIG_FILES".asInstanceOf[ConnectionPropertyKey]
    val INSTANCE_ID                      = "INSTANCE_ID".asInstanceOf[ConnectionPropertyKey]
    val JDBC_CONNECTION_URL              = "JDBC_CONNECTION_URL".asInstanceOf[ConnectionPropertyKey]
    val JDBC_ENFORCE_SSL                 = "JDBC_ENFORCE_SSL".asInstanceOf[ConnectionPropertyKey]
    val CUSTOM_JDBC_CERT                 = "CUSTOM_JDBC_CERT".asInstanceOf[ConnectionPropertyKey]
    val SKIP_CUSTOM_JDBC_CERT_VALIDATION = "SKIP_CUSTOM_JDBC_CERT_VALIDATION".asInstanceOf[ConnectionPropertyKey]
    val CUSTOM_JDBC_CERT_STRING          = "CUSTOM_JDBC_CERT_STRING".asInstanceOf[ConnectionPropertyKey]

    val values = js.Object.freeze(
      js.Array(
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
        JDBC_ENFORCE_SSL,
        CUSTOM_JDBC_CERT,
        SKIP_CUSTOM_JDBC_CERT_VALIDATION,
        CUSTOM_JDBC_CERT_STRING
      )
    )
  }

  @js.native
  sealed trait ConnectionType extends js.Any
  object ConnectionType extends js.Object {
    val JDBC = "JDBC".asInstanceOf[ConnectionType]
    val SFTP = "SFTP".asInstanceOf[ConnectionType]

    val values = js.Object.freeze(js.Array(JDBC, SFTP))
  }

  /**
    * Specifies the connections used by a job.
    */
  @js.native
  @Factory
  trait ConnectionsList extends js.Object {
    var Connections: js.UndefOr[OrchestrationStringList]
  }

  /**
    * The details of a crawl in the workflow.
    */
  @js.native
  @Factory
  trait Crawl extends js.Object {
    var CompletedOn: js.UndefOr[TimestampValue]
    var ErrorMessage: js.UndefOr[DescriptionString]
    var LogGroup: js.UndefOr[LogGroup]
    var LogStream: js.UndefOr[LogStream]
    var StartedOn: js.UndefOr[TimestampValue]
    var State: js.UndefOr[CrawlState]
  }

  @js.native
  sealed trait CrawlState extends js.Any
  object CrawlState extends js.Object {
    val RUNNING   = "RUNNING".asInstanceOf[CrawlState]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[CrawlState]
    val CANCELLED = "CANCELLED".asInstanceOf[CrawlState]
    val FAILED    = "FAILED".asInstanceOf[CrawlState]

    val values = js.Object.freeze(js.Array(RUNNING, SUCCEEDED, CANCELLED, FAILED))
  }

  /**
    * Specifies a crawler program that examines a data source and uses classifiers to try to determine its schema. If successful, the crawler records metadata concerning the data source in the AWS Glue Data Catalog.
    */
  @js.native
  @Factory
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

  /**
    * Metrics for a specified crawler.
    */
  @js.native
  @Factory
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

  /**
    * The details of a Crawler node present in the workflow.
    */
  @js.native
  @Factory
  trait CrawlerNodeDetails extends js.Object {
    var Crawls: js.UndefOr[CrawlList]
  }

  @js.native
  sealed trait CrawlerState extends js.Any
  object CrawlerState extends js.Object {
    val READY    = "READY".asInstanceOf[CrawlerState]
    val RUNNING  = "RUNNING".asInstanceOf[CrawlerState]
    val STOPPING = "STOPPING".asInstanceOf[CrawlerState]

    val values = js.Object.freeze(js.Array(READY, RUNNING, STOPPING))
  }

  /**
    * Specifies data stores to crawl.
    */
  @js.native
  @Factory
  trait CrawlerTargets extends js.Object {
    var CatalogTargets: js.UndefOr[CatalogTargetList]
    var DynamoDBTargets: js.UndefOr[DynamoDBTargetList]
    var JdbcTargets: js.UndefOr[JdbcTargetList]
    var S3Targets: js.UndefOr[S3TargetList]
  }

  @js.native
  @Factory
  trait CreateClassifierRequest extends js.Object {
    var CsvClassifier: js.UndefOr[CreateCsvClassifierRequest]
    var GrokClassifier: js.UndefOr[CreateGrokClassifierRequest]
    var JsonClassifier: js.UndefOr[CreateJsonClassifierRequest]
    var XMLClassifier: js.UndefOr[CreateXMLClassifierRequest]
  }

  @js.native
  @Factory
  trait CreateClassifierResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateConnectionRequest extends js.Object {
    var ConnectionInput: ConnectionInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait CreateConnectionResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateCrawlerRequest extends js.Object {
    var Name: NameString
    var Role: Role
    var Targets: CrawlerTargets
    var Classifiers: js.UndefOr[ClassifierNameList]
    var Configuration: js.UndefOr[CrawlerConfiguration]
    var CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration]
    var DatabaseName: js.UndefOr[DatabaseName]
    var Description: js.UndefOr[DescriptionString]
    var Schedule: js.UndefOr[CronExpression]
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy]
    var TablePrefix: js.UndefOr[TablePrefix]
    var Tags: js.UndefOr[TagsMap]
  }

  @js.native
  @Factory
  trait CreateCrawlerResponse extends js.Object {}

  /**
    * Specifies a custom CSV classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  @Factory
  trait CreateCsvClassifierRequest extends js.Object {
    var Name: NameString
    var AllowSingleColumn: js.UndefOr[NullableBoolean]
    var ContainsHeader: js.UndefOr[CsvHeaderOption]
    var Delimiter: js.UndefOr[CsvColumnDelimiter]
    var DisableValueTrimming: js.UndefOr[NullableBoolean]
    var Header: js.UndefOr[CsvHeader]
    var QuoteSymbol: js.UndefOr[CsvQuoteSymbol]
  }

  @js.native
  @Factory
  trait CreateDatabaseRequest extends js.Object {
    var DatabaseInput: DatabaseInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait CreateDatabaseResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateDevEndpointRequest extends js.Object {
    var EndpointName: GenericString
    var RoleArn: RoleArn
    var Arguments: js.UndefOr[MapValue]
    var ExtraJarsS3Path: js.UndefOr[GenericString]
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var NumberOfNodes: js.UndefOr[IntegerValue]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var PublicKey: js.UndefOr[GenericString]
    var PublicKeys: js.UndefOr[PublicKeysList]
    var SecurityConfiguration: js.UndefOr[NameString]
    var SecurityGroupIds: js.UndefOr[StringList]
    var SubnetId: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagsMap]
    var WorkerType: js.UndefOr[WorkerType]
  }

  @js.native
  @Factory
  trait CreateDevEndpointResponse extends js.Object {
    var Arguments: js.UndefOr[MapValue]
    var AvailabilityZone: js.UndefOr[GenericString]
    var CreatedTimestamp: js.UndefOr[TimestampValue]
    var EndpointName: js.UndefOr[GenericString]
    var ExtraJarsS3Path: js.UndefOr[GenericString]
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString]
    var FailureReason: js.UndefOr[GenericString]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var NumberOfNodes: js.UndefOr[IntegerValue]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var RoleArn: js.UndefOr[RoleArn]
    var SecurityConfiguration: js.UndefOr[NameString]
    var SecurityGroupIds: js.UndefOr[StringList]
    var Status: js.UndefOr[GenericString]
    var SubnetId: js.UndefOr[GenericString]
    var VpcId: js.UndefOr[GenericString]
    var WorkerType: js.UndefOr[WorkerType]
    var YarnEndpointAddress: js.UndefOr[GenericString]
    var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue]
  }

  /**
    * Specifies a <code>grok</code> classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  @Factory
  trait CreateGrokClassifierRequest extends js.Object {
    var Classification: Classification
    var GrokPattern: GrokPattern
    var Name: NameString
    var CustomPatterns: js.UndefOr[CustomPatterns]
  }

  @js.native
  @Factory
  trait CreateJobRequest extends js.Object {
    var Command: JobCommand
    var Name: NameString
    var Role: RoleString
    var AllocatedCapacity: js.UndefOr[IntegerValue]
    var Connections: js.UndefOr[ConnectionsList]
    var DefaultArguments: js.UndefOr[GenericMap]
    var Description: js.UndefOr[DescriptionString]
    var ExecutionProperty: js.UndefOr[ExecutionProperty]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var LogUri: js.UndefOr[UriString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[MaxRetries]
    var NonOverridableArguments: js.UndefOr[GenericMap]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Tags: js.UndefOr[TagsMap]
    var Timeout: js.UndefOr[Timeout]
    var WorkerType: js.UndefOr[WorkerType]
  }

  @js.native
  @Factory
  trait CreateJobResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  /**
    * Specifies a JSON classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  @Factory
  trait CreateJsonClassifierRequest extends js.Object {
    var JsonPath: JsonPath
    var Name: NameString
  }

  @js.native
  @Factory
  trait CreateMLTransformRequest extends js.Object {
    var InputRecordTables: GlueTables
    var Name: NameString
    var Parameters: TransformParameters
    var Role: RoleString
    var Description: js.UndefOr[DescriptionString]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[NullableInteger]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var Timeout: js.UndefOr[Timeout]
    var WorkerType: js.UndefOr[WorkerType]
  }

  @js.native
  @Factory
  trait CreateMLTransformResponse extends js.Object {
    var TransformId: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait CreatePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionInput: PartitionInput
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait CreatePartitionResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateScriptRequest extends js.Object {
    var DagEdges: js.UndefOr[DagEdges]
    var DagNodes: js.UndefOr[DagNodes]
    var Language: js.UndefOr[Language]
  }

  @js.native
  @Factory
  trait CreateScriptResponse extends js.Object {
    var PythonScript: js.UndefOr[PythonScript]
    var ScalaCode: js.UndefOr[ScalaCode]
  }

  @js.native
  @Factory
  trait CreateSecurityConfigurationRequest extends js.Object {
    var EncryptionConfiguration: EncryptionConfiguration
    var Name: NameString
  }

  @js.native
  @Factory
  trait CreateSecurityConfigurationResponse extends js.Object {
    var CreatedTimestamp: js.UndefOr[TimestampValue]
    var Name: js.UndefOr[NameString]
  }

  @js.native
  @Factory
  trait CreateTableRequest extends js.Object {
    var DatabaseName: NameString
    var TableInput: TableInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait CreateTableResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateTriggerRequest extends js.Object {
    var Actions: ActionList
    var Name: NameString
    var Type: TriggerType
    var Description: js.UndefOr[DescriptionString]
    var Predicate: js.UndefOr[Predicate]
    var Schedule: js.UndefOr[GenericString]
    var StartOnCreation: js.UndefOr[BooleanValue]
    var Tags: js.UndefOr[TagsMap]
    var WorkflowName: js.UndefOr[NameString]
  }

  @js.native
  @Factory
  trait CreateTriggerResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  @js.native
  @Factory
  trait CreateUserDefinedFunctionRequest extends js.Object {
    var DatabaseName: NameString
    var FunctionInput: UserDefinedFunctionInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait CreateUserDefinedFunctionResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateWorkflowRequest extends js.Object {
    var Name: NameString
    var DefaultRunProperties: js.UndefOr[WorkflowRunProperties]
    var Description: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagsMap]
  }

  @js.native
  @Factory
  trait CreateWorkflowResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  /**
    * Specifies an XML classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  @Factory
  trait CreateXMLClassifierRequest extends js.Object {
    var Classification: Classification
    var Name: NameString
    var RowTag: js.UndefOr[RowTag]
  }

  /**
    * A classifier for custom <code>CSV</code> content.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait CsvHeaderOption extends js.Any
  object CsvHeaderOption extends js.Object {
    val UNKNOWN = "UNKNOWN".asInstanceOf[CsvHeaderOption]
    val PRESENT = "PRESENT".asInstanceOf[CsvHeaderOption]
    val ABSENT  = "ABSENT".asInstanceOf[CsvHeaderOption]

    val values = js.Object.freeze(js.Array(UNKNOWN, PRESENT, ABSENT))
  }

  /**
    * Contains configuration information for maintaining Data Catalog security.
    */
  @js.native
  @Factory
  trait DataCatalogEncryptionSettings extends js.Object {
    var ConnectionPasswordEncryption: js.UndefOr[ConnectionPasswordEncryption]
    var EncryptionAtRest: js.UndefOr[EncryptionAtRest]
  }

  /**
    * The AWS Lake Formation principal.
    */
  @js.native
  @Factory
  trait DataLakePrincipal extends js.Object {
    var DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString]
  }

  /**
    * The <code>Database</code> object represents a logical grouping of tables that might reside in a Hive metastore or an RDBMS.
    */
  @js.native
  @Factory
  trait Database extends js.Object {
    var Name: NameString
    var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList]
    var CreateTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var LocationUri: js.UndefOr[URI]
    var Parameters: js.UndefOr[ParametersMap]
  }

  /**
    * The structure used to create or update a database.
    */
  @js.native
  @Factory
  trait DatabaseInput extends js.Object {
    var Name: NameString
    var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList]
    var Description: js.UndefOr[DescriptionString]
    var LocationUri: js.UndefOr[URI]
    var Parameters: js.UndefOr[ParametersMap]
  }

  @js.native
  sealed trait DeleteBehavior extends js.Any
  object DeleteBehavior extends js.Object {
    val LOG                   = "LOG".asInstanceOf[DeleteBehavior]
    val DELETE_FROM_DATABASE  = "DELETE_FROM_DATABASE".asInstanceOf[DeleteBehavior]
    val DEPRECATE_IN_DATABASE = "DEPRECATE_IN_DATABASE".asInstanceOf[DeleteBehavior]

    val values = js.Object.freeze(js.Array(LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE))
  }

  @js.native
  @Factory
  trait DeleteClassifierRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait DeleteClassifierResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteConnectionRequest extends js.Object {
    var ConnectionName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait DeleteConnectionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteCrawlerRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait DeleteCrawlerResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteDatabaseRequest extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait DeleteDatabaseResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteDevEndpointRequest extends js.Object {
    var EndpointName: GenericString
  }

  @js.native
  @Factory
  trait DeleteDevEndpointResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteJobRequest extends js.Object {
    var JobName: NameString
  }

  @js.native
  @Factory
  trait DeleteJobResponse extends js.Object {
    var JobName: js.UndefOr[NameString]
  }

  @js.native
  @Factory
  trait DeleteMLTransformRequest extends js.Object {
    var TransformId: HashString
  }

  @js.native
  @Factory
  trait DeleteMLTransformResponse extends js.Object {
    var TransformId: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait DeletePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionValues: ValueStringList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait DeletePartitionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteResourcePolicyRequest extends js.Object {
    var PolicyHashCondition: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait DeleteResourcePolicyResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteSecurityConfigurationRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait DeleteSecurityConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteTableRequest extends js.Object {
    var DatabaseName: NameString
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait DeleteTableResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteTableVersionRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var VersionId: VersionString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait DeleteTableVersionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteTriggerRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait DeleteTriggerResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  @js.native
  @Factory
  trait DeleteUserDefinedFunctionRequest extends js.Object {
    var DatabaseName: NameString
    var FunctionName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait DeleteUserDefinedFunctionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteWorkflowRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait DeleteWorkflowResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  /**
    * A development endpoint where a developer can remotely debug extract, transform, and load (ETL) scripts.
    */
  @js.native
  @Factory
  trait DevEndpoint extends js.Object {
    var Arguments: js.UndefOr[MapValue]
    var AvailabilityZone: js.UndefOr[GenericString]
    var CreatedTimestamp: js.UndefOr[TimestampValue]
    var EndpointName: js.UndefOr[GenericString]
    var ExtraJarsS3Path: js.UndefOr[GenericString]
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString]
    var FailureReason: js.UndefOr[GenericString]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var LastModifiedTimestamp: js.UndefOr[TimestampValue]
    var LastUpdateStatus: js.UndefOr[GenericString]
    var NumberOfNodes: js.UndefOr[IntegerValue]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
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
    var WorkerType: js.UndefOr[WorkerType]
    var YarnEndpointAddress: js.UndefOr[GenericString]
    var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue]
  }

  /**
    * Custom libraries to be loaded into a development endpoint.
    */
  @js.native
  @Factory
  trait DevEndpointCustomLibraries extends js.Object {
    var ExtraJarsS3Path: js.UndefOr[GenericString]
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString]
  }

  /**
    * Specifies an Amazon DynamoDB table to crawl.
    */
  @js.native
  @Factory
  trait DynamoDBTarget extends js.Object {
    var Path: js.UndefOr[Path]
  }

  /**
    * An edge represents a directed connection between two AWS Glue components which are part of the workflow the edge belongs to.
    */
  @js.native
  @Factory
  trait Edge extends js.Object {
    var DestinationId: js.UndefOr[NameString]
    var SourceId: js.UndefOr[NameString]
  }

  /**
    * Specifies the encryption-at-rest configuration for the Data Catalog.
    */
  @js.native
  @Factory
  trait EncryptionAtRest extends js.Object {
    var CatalogEncryptionMode: CatalogEncryptionMode
    var SseAwsKmsKeyId: js.UndefOr[NameString]
  }

  /**
    * Specifies an encryption configuration.
    */
  @js.native
  @Factory
  trait EncryptionConfiguration extends js.Object {
    var CloudWatchEncryption: js.UndefOr[CloudWatchEncryption]
    var JobBookmarksEncryption: js.UndefOr[JobBookmarksEncryption]
    var S3Encryption: js.UndefOr[S3EncryptionList]
  }

  /**
    * Contains details about an error.
    */
  @js.native
  @Factory
  trait ErrorDetail extends js.Object {
    var ErrorCode: js.UndefOr[NameString]
    var ErrorMessage: js.UndefOr[DescriptionString]
  }

  /**
    * Evaluation metrics provide an estimate of the quality of your machine learning transform.
    */
  @js.native
  @Factory
  trait EvaluationMetrics extends js.Object {
    var TransformType: TransformType
    var FindMatchesMetrics: js.UndefOr[FindMatchesMetrics]
  }

  /**
    * An execution property of a job.
    */
  @js.native
  @Factory
  trait ExecutionProperty extends js.Object {
    var MaxConcurrentRuns: js.UndefOr[MaxConcurrentRuns]
  }

  @js.native
  sealed trait ExistCondition extends js.Any
  object ExistCondition extends js.Object {
    val MUST_EXIST = "MUST_EXIST".asInstanceOf[ExistCondition]
    val NOT_EXIST  = "NOT_EXIST".asInstanceOf[ExistCondition]
    val NONE       = "NONE".asInstanceOf[ExistCondition]

    val values = js.Object.freeze(js.Array(MUST_EXIST, NOT_EXIST, NONE))
  }

  /**
    * Specifies configuration properties for an exporting labels task run.
    */
  @js.native
  @Factory
  trait ExportLabelsTaskRunProperties extends js.Object {
    var OutputS3Path: js.UndefOr[UriString]
  }

  /**
    * The evaluation metrics for the find matches algorithm. The quality of your machine learning transform is measured by getting your transform to predict some matches and comparing the results to known matches from the same dataset. The quality metrics are based on a subset of your data, so they are not precise.
    */
  @js.native
  @Factory
  trait FindMatchesMetrics extends js.Object {
    var AreaUnderPRCurve: js.UndefOr[GenericBoundedDouble]
    var ConfusionMatrix: js.UndefOr[ConfusionMatrix]
    var F1: js.UndefOr[GenericBoundedDouble]
    var Precision: js.UndefOr[GenericBoundedDouble]
    var Recall: js.UndefOr[GenericBoundedDouble]
  }

  /**
    * The parameters to configure the find matches transform.
    */
  @js.native
  @Factory
  trait FindMatchesParameters extends js.Object {
    var AccuracyCostTradeoff: js.UndefOr[GenericBoundedDouble]
    var EnforceProvidedLabels: js.UndefOr[NullableBoolean]
    var PrecisionRecallTradeoff: js.UndefOr[GenericBoundedDouble]
    var PrimaryKeyColumnName: js.UndefOr[ColumnNameString]
  }

  /**
    * Specifies configuration properties for a Find Matches task run.
    */
  @js.native
  @Factory
  trait FindMatchesTaskRunProperties extends js.Object {
    var JobId: js.UndefOr[HashString]
    var JobName: js.UndefOr[NameString]
    var JobRunId: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait GetCatalogImportStatusRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait GetCatalogImportStatusResponse extends js.Object {
    var ImportStatus: js.UndefOr[CatalogImportStatus]
  }

  @js.native
  @Factory
  trait GetClassifierRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait GetClassifierResponse extends js.Object {
    var Classifier: js.UndefOr[Classifier]
  }

  @js.native
  @Factory
  trait GetClassifiersRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetClassifiersResponse extends js.Object {
    var Classifiers: js.UndefOr[ClassifierList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetConnectionRequest extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var HidePassword: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  /**
    * Filters the connection definitions that are returned by the <code>GetConnections</code> API operation.
    */
  @js.native
  @Factory
  trait GetConnectionsFilter extends js.Object {
    var ConnectionType: js.UndefOr[ConnectionType]
    var MatchCriteria: js.UndefOr[MatchCriteria]
  }

  @js.native
  @Factory
  trait GetConnectionsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var Filter: js.UndefOr[GetConnectionsFilter]
    var HidePassword: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetConnectionsResponse extends js.Object {
    var ConnectionList: js.UndefOr[ConnectionList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetCrawlerMetricsRequest extends js.Object {
    var CrawlerNameList: js.UndefOr[CrawlerNameList]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetCrawlerMetricsResponse extends js.Object {
    var CrawlerMetricsList: js.UndefOr[CrawlerMetricsList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetCrawlerRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait GetCrawlerResponse extends js.Object {
    var Crawler: js.UndefOr[Crawler]
  }

  @js.native
  @Factory
  trait GetCrawlersRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetCrawlersResponse extends js.Object {
    var Crawlers: js.UndefOr[CrawlerList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetDataCatalogEncryptionSettingsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait GetDataCatalogEncryptionSettingsResponse extends js.Object {
    var DataCatalogEncryptionSettings: js.UndefOr[DataCatalogEncryptionSettings]
  }

  @js.native
  @Factory
  trait GetDatabaseRequest extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait GetDatabaseResponse extends js.Object {
    var Database: js.UndefOr[Database]
  }

  @js.native
  @Factory
  trait GetDatabasesRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetDatabasesResponse extends js.Object {
    var DatabaseList: DatabaseList
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetDataflowGraphRequest extends js.Object {
    var PythonScript: js.UndefOr[PythonScript]
  }

  @js.native
  @Factory
  trait GetDataflowGraphResponse extends js.Object {
    var DagEdges: js.UndefOr[DagEdges]
    var DagNodes: js.UndefOr[DagNodes]
  }

  @js.native
  @Factory
  trait GetDevEndpointRequest extends js.Object {
    var EndpointName: GenericString
  }

  @js.native
  @Factory
  trait GetDevEndpointResponse extends js.Object {
    var DevEndpoint: js.UndefOr[DevEndpoint]
  }

  @js.native
  @Factory
  trait GetDevEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait GetDevEndpointsResponse extends js.Object {
    var DevEndpoints: js.UndefOr[DevEndpointList]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait GetJobBookmarkRequest extends js.Object {
    var JobName: JobName
    var RunId: js.UndefOr[RunId]
  }

  @js.native
  @Factory
  trait GetJobBookmarkResponse extends js.Object {
    var JobBookmarkEntry: js.UndefOr[JobBookmarkEntry]
  }

  @js.native
  @Factory
  trait GetJobRequest extends js.Object {
    var JobName: NameString
  }

  @js.native
  @Factory
  trait GetJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  @js.native
  @Factory
  trait GetJobRunRequest extends js.Object {
    var JobName: NameString
    var RunId: IdString
    var PredecessorsIncluded: js.UndefOr[BooleanValue]
  }

  @js.native
  @Factory
  trait GetJobRunResponse extends js.Object {
    var JobRun: js.UndefOr[JobRun]
  }

  @js.native
  @Factory
  trait GetJobRunsRequest extends js.Object {
    var JobName: NameString
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait GetJobRunsResponse extends js.Object {
    var JobRuns: js.UndefOr[JobRunList]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait GetJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait GetJobsResponse extends js.Object {
    var Jobs: js.UndefOr[JobList]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait GetMLTaskRunRequest extends js.Object {
    var TaskRunId: HashString
    var TransformId: HashString
  }

  @js.native
  @Factory
  trait GetMLTaskRunResponse extends js.Object {
    var CompletedOn: js.UndefOr[Timestamp]
    var ErrorString: js.UndefOr[GenericString]
    var ExecutionTime: js.UndefOr[ExecutionTime]
    var LastModifiedOn: js.UndefOr[Timestamp]
    var LogGroupName: js.UndefOr[GenericString]
    var Properties: js.UndefOr[TaskRunProperties]
    var StartedOn: js.UndefOr[Timestamp]
    var Status: js.UndefOr[TaskStatusType]
    var TaskRunId: js.UndefOr[HashString]
    var TransformId: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait GetMLTaskRunsRequest extends js.Object {
    var TransformId: HashString
    var Filter: js.UndefOr[TaskRunFilterCriteria]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Sort: js.UndefOr[TaskRunSortCriteria]
  }

  @js.native
  @Factory
  trait GetMLTaskRunsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var TaskRuns: js.UndefOr[TaskRunList]
  }

  @js.native
  @Factory
  trait GetMLTransformRequest extends js.Object {
    var TransformId: HashString
  }

  @js.native
  @Factory
  trait GetMLTransformResponse extends js.Object {
    var CreatedOn: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var EvaluationMetrics: js.UndefOr[EvaluationMetrics]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var InputRecordTables: js.UndefOr[GlueTables]
    var LabelCount: js.UndefOr[LabelCount]
    var LastModifiedOn: js.UndefOr[Timestamp]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[NullableInteger]
    var Name: js.UndefOr[NameString]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var Parameters: js.UndefOr[TransformParameters]
    var Role: js.UndefOr[RoleString]
    var Schema: js.UndefOr[TransformSchema]
    var Status: js.UndefOr[TransformStatusType]
    var Timeout: js.UndefOr[Timeout]
    var TransformId: js.UndefOr[HashString]
    var WorkerType: js.UndefOr[WorkerType]
  }

  @js.native
  @Factory
  trait GetMLTransformsRequest extends js.Object {
    var Filter: js.UndefOr[TransformFilterCriteria]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Sort: js.UndefOr[TransformSortCriteria]
  }

  @js.native
  @Factory
  trait GetMLTransformsResponse extends js.Object {
    var Transforms: TransformList
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait GetMappingRequest extends js.Object {
    var Source: CatalogEntry
    var Location: js.UndefOr[Location]
    var Sinks: js.UndefOr[CatalogEntries]
  }

  @js.native
  @Factory
  trait GetMappingResponse extends js.Object {
    var Mapping: MappingList
  }

  @js.native
  @Factory
  trait GetPartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionValues: ValueStringList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait GetPartitionResponse extends js.Object {
    var Partition: js.UndefOr[Partition]
  }

  @js.native
  @Factory
  trait GetPartitionsRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var Expression: js.UndefOr[PredicateString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var Segment: js.UndefOr[Segment]
  }

  @js.native
  @Factory
  trait GetPartitionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Partitions: js.UndefOr[PartitionList]
  }

  @js.native
  @Factory
  trait GetPlanRequest extends js.Object {
    var Mapping: MappingList
    var Source: CatalogEntry
    var Language: js.UndefOr[Language]
    var Location: js.UndefOr[Location]
    var Sinks: js.UndefOr[CatalogEntries]
  }

  @js.native
  @Factory
  trait GetPlanResponse extends js.Object {
    var PythonScript: js.UndefOr[PythonScript]
    var ScalaCode: js.UndefOr[ScalaCode]
  }

  @js.native
  @Factory
  trait GetResourcePolicyRequest extends js.Object {}

  @js.native
  @Factory
  trait GetResourcePolicyResponse extends js.Object {
    var CreateTime: js.UndefOr[Timestamp]
    var PolicyHash: js.UndefOr[HashString]
    var PolicyInJson: js.UndefOr[PolicyJsonString]
    var UpdateTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait GetSecurityConfigurationRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait GetSecurityConfigurationResponse extends js.Object {
    var SecurityConfiguration: js.UndefOr[SecurityConfiguration]
  }

  @js.native
  @Factory
  trait GetSecurityConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait GetSecurityConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var SecurityConfigurations: js.UndefOr[SecurityConfigurationList]
  }

  @js.native
  @Factory
  trait GetTableRequest extends js.Object {
    var DatabaseName: NameString
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait GetTableResponse extends js.Object {
    var Table: js.UndefOr[Table]
  }

  @js.native
  @Factory
  trait GetTableVersionRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var VersionId: js.UndefOr[VersionString]
  }

  @js.native
  @Factory
  trait GetTableVersionResponse extends js.Object {
    var TableVersion: js.UndefOr[TableVersion]
  }

  @js.native
  @Factory
  trait GetTableVersionsRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetTableVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableVersions: js.UndefOr[GetTableVersionsList]
  }

  @js.native
  @Factory
  trait GetTablesRequest extends js.Object {
    var DatabaseName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var Expression: js.UndefOr[FilterString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetTablesResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableList: js.UndefOr[TableList]
  }

  @js.native
  @Factory
  trait GetTagsRequest extends js.Object {
    var ResourceArn: GlueResourceArn
  }

  @js.native
  @Factory
  trait GetTagsResponse extends js.Object {
    var Tags: js.UndefOr[TagsMap]
  }

  @js.native
  @Factory
  trait GetTriggerRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait GetTriggerResponse extends js.Object {
    var Trigger: js.UndefOr[Trigger]
  }

  @js.native
  @Factory
  trait GetTriggersRequest extends js.Object {
    var DependentJobName: js.UndefOr[NameString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait GetTriggersResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Triggers: js.UndefOr[TriggerList]
  }

  @js.native
  @Factory
  trait GetUserDefinedFunctionRequest extends js.Object {
    var DatabaseName: NameString
    var FunctionName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait GetUserDefinedFunctionResponse extends js.Object {
    var UserDefinedFunction: js.UndefOr[UserDefinedFunction]
  }

  @js.native
  @Factory
  trait GetUserDefinedFunctionsRequest extends js.Object {
    var DatabaseName: NameString
    var Pattern: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetUserDefinedFunctionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList]
  }

  @js.native
  @Factory
  trait GetWorkflowRequest extends js.Object {
    var Name: NameString
    var IncludeGraph: js.UndefOr[NullableBoolean]
  }

  @js.native
  @Factory
  trait GetWorkflowResponse extends js.Object {
    var Workflow: js.UndefOr[Workflow]
  }

  @js.native
  @Factory
  trait GetWorkflowRunPropertiesRequest extends js.Object {
    var Name: NameString
    var RunId: IdString
  }

  @js.native
  @Factory
  trait GetWorkflowRunPropertiesResponse extends js.Object {
    var RunProperties: js.UndefOr[WorkflowRunProperties]
  }

  @js.native
  @Factory
  trait GetWorkflowRunRequest extends js.Object {
    var Name: NameString
    var RunId: IdString
    var IncludeGraph: js.UndefOr[NullableBoolean]
  }

  @js.native
  @Factory
  trait GetWorkflowRunResponse extends js.Object {
    var Run: js.UndefOr[WorkflowRun]
  }

  @js.native
  @Factory
  trait GetWorkflowRunsRequest extends js.Object {
    var Name: NameString
    var IncludeGraph: js.UndefOr[NullableBoolean]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait GetWorkflowRunsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Runs: js.UndefOr[WorkflowRuns]
  }

  /**
    * The database and table in the AWS Glue Data Catalog that is used for input or output data.
    */
  @js.native
  @Factory
  trait GlueTable extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[NameString]
    var ConnectionName: js.UndefOr[NameString]
  }

  /**
    * A classifier that uses <code>grok</code> patterns.
    */
  @js.native
  @Factory
  trait GrokClassifier extends js.Object {
    var Classification: Classification
    var GrokPattern: GrokPattern
    var Name: NameString
    var CreationTime: js.UndefOr[Timestamp]
    var CustomPatterns: js.UndefOr[CustomPatterns]
    var LastUpdated: js.UndefOr[Timestamp]
    var Version: js.UndefOr[VersionId]
  }

  @js.native
  @Factory
  trait ImportCatalogToGlueRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait ImportCatalogToGlueResponse extends js.Object {}

  /**
    * Specifies configuration properties for an importing labels task run.
    */
  @js.native
  @Factory
  trait ImportLabelsTaskRunProperties extends js.Object {
    var InputS3Path: js.UndefOr[UriString]
    var Replace: js.UndefOr[ReplaceBoolean]
  }

  /**
    * Specifies a JDBC data store to crawl.
    */
  @js.native
  @Factory
  trait JdbcTarget extends js.Object {
    var ConnectionName: js.UndefOr[ConnectionName]
    var Exclusions: js.UndefOr[PathList]
    var Path: js.UndefOr[Path]
  }

  /**
    * Specifies a job definition.
    */
  @js.native
  @Factory
  trait Job extends js.Object {
    var AllocatedCapacity: js.UndefOr[IntegerValue]
    var Command: js.UndefOr[JobCommand]
    var Connections: js.UndefOr[ConnectionsList]
    var CreatedOn: js.UndefOr[TimestampValue]
    var DefaultArguments: js.UndefOr[GenericMap]
    var Description: js.UndefOr[DescriptionString]
    var ExecutionProperty: js.UndefOr[ExecutionProperty]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var LastModifiedOn: js.UndefOr[TimestampValue]
    var LogUri: js.UndefOr[UriString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[MaxRetries]
    var Name: js.UndefOr[NameString]
    var NonOverridableArguments: js.UndefOr[GenericMap]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var Role: js.UndefOr[RoleString]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Timeout: js.UndefOr[Timeout]
    var WorkerType: js.UndefOr[WorkerType]
  }

  /**
    * Defines a point that a job can resume processing.
    */
  @js.native
  @Factory
  trait JobBookmarkEntry extends js.Object {
    var Attempt: js.UndefOr[IntegerValue]
    var JobBookmark: js.UndefOr[JsonValue]
    var JobName: js.UndefOr[JobName]
    var PreviousRunId: js.UndefOr[RunId]
    var Run: js.UndefOr[IntegerValue]
    var RunId: js.UndefOr[RunId]
    var Version: js.UndefOr[IntegerValue]
  }

  /**
    * Specifies how job bookmark data should be encrypted.
    */
  @js.native
  @Factory
  trait JobBookmarksEncryption extends js.Object {
    var JobBookmarksEncryptionMode: js.UndefOr[JobBookmarksEncryptionMode]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  @js.native
  sealed trait JobBookmarksEncryptionMode extends js.Any
  object JobBookmarksEncryptionMode extends js.Object {
    val DISABLED  = "DISABLED".asInstanceOf[JobBookmarksEncryptionMode]
    val `CSE-KMS` = "CSE-KMS".asInstanceOf[JobBookmarksEncryptionMode]

    val values = js.Object.freeze(js.Array(DISABLED, `CSE-KMS`))
  }

  /**
    * Specifies code executed when a job is run.
    */
  @js.native
  @Factory
  trait JobCommand extends js.Object {
    var Name: js.UndefOr[GenericString]
    var PythonVersion: js.UndefOr[PythonVersionString]
    var ScriptLocation: js.UndefOr[ScriptLocationString]
  }

  /**
    * The details of a Job node present in the workflow.
    */
  @js.native
  @Factory
  trait JobNodeDetails extends js.Object {
    var JobRuns: js.UndefOr[JobRunList]
  }

  /**
    * Contains information about a job run.
    */
  @js.native
  @Factory
  trait JobRun extends js.Object {
    var AllocatedCapacity: js.UndefOr[IntegerValue]
    var Arguments: js.UndefOr[GenericMap]
    var Attempt: js.UndefOr[AttemptCount]
    var CompletedOn: js.UndefOr[TimestampValue]
    var ErrorMessage: js.UndefOr[ErrorString]
    var ExecutionTime: js.UndefOr[ExecutionTime]
    var GlueVersion: js.UndefOr[GlueVersionString]
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

  @js.native
  sealed trait JobRunState extends js.Any
  object JobRunState extends js.Object {
    val STARTING  = "STARTING".asInstanceOf[JobRunState]
    val RUNNING   = "RUNNING".asInstanceOf[JobRunState]
    val STOPPING  = "STOPPING".asInstanceOf[JobRunState]
    val STOPPED   = "STOPPED".asInstanceOf[JobRunState]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobRunState]
    val FAILED    = "FAILED".asInstanceOf[JobRunState]
    val TIMEOUT   = "TIMEOUT".asInstanceOf[JobRunState]

    val values = js.Object.freeze(js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT))
  }

  /**
    * Specifies information used to update an existing job definition. The previous job definition is completely overwritten by this information.
    */
  @js.native
  @Factory
  trait JobUpdate extends js.Object {
    var AllocatedCapacity: js.UndefOr[IntegerValue]
    var Command: js.UndefOr[JobCommand]
    var Connections: js.UndefOr[ConnectionsList]
    var DefaultArguments: js.UndefOr[GenericMap]
    var Description: js.UndefOr[DescriptionString]
    var ExecutionProperty: js.UndefOr[ExecutionProperty]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var LogUri: js.UndefOr[UriString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[MaxRetries]
    var NonOverridableArguments: js.UndefOr[GenericMap]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var Role: js.UndefOr[RoleString]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Timeout: js.UndefOr[Timeout]
    var WorkerType: js.UndefOr[WorkerType]
  }

  /**
    * A classifier for <code>JSON</code> content.
    */
  @js.native
  @Factory
  trait JsonClassifier extends js.Object {
    var JsonPath: JsonPath
    var Name: NameString
    var CreationTime: js.UndefOr[Timestamp]
    var LastUpdated: js.UndefOr[Timestamp]
    var Version: js.UndefOr[VersionId]
  }

  /**
    * Specifies configuration properties for a labeling set generation task run.
    */
  @js.native
  @Factory
  trait LabelingSetGenerationTaskRunProperties extends js.Object {
    var OutputS3Path: js.UndefOr[UriString]
  }

  @js.native
  sealed trait Language extends js.Any
  object Language extends js.Object {
    val PYTHON = "PYTHON".asInstanceOf[Language]
    val SCALA  = "SCALA".asInstanceOf[Language]

    val values = js.Object.freeze(js.Array(PYTHON, SCALA))
  }

  /**
    * Status and error information about the most recent crawl.
    */
  @js.native
  @Factory
  trait LastCrawlInfo extends js.Object {
    var ErrorMessage: js.UndefOr[DescriptionString]
    var LogGroup: js.UndefOr[LogGroup]
    var LogStream: js.UndefOr[LogStream]
    var MessagePrefix: js.UndefOr[MessagePrefix]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[LastCrawlStatus]
  }

  @js.native
  sealed trait LastCrawlStatus extends js.Any
  object LastCrawlStatus extends js.Object {
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[LastCrawlStatus]
    val CANCELLED = "CANCELLED".asInstanceOf[LastCrawlStatus]
    val FAILED    = "FAILED".asInstanceOf[LastCrawlStatus]

    val values = js.Object.freeze(js.Array(SUCCEEDED, CANCELLED, FAILED))
  }

  @js.native
  @Factory
  trait ListCrawlersRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[TagsMap]
  }

  @js.native
  @Factory
  trait ListCrawlersResponse extends js.Object {
    var CrawlerNames: js.UndefOr[CrawlerNameList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListDevEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagsMap]
  }

  @js.native
  @Factory
  trait ListDevEndpointsResponse extends js.Object {
    var DevEndpointNames: js.UndefOr[DevEndpointNameList]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait ListJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagsMap]
  }

  @js.native
  @Factory
  trait ListJobsResponse extends js.Object {
    var JobNames: js.UndefOr[JobNameList]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait ListTriggersRequest extends js.Object {
    var DependentJobName: js.UndefOr[NameString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
    var Tags: js.UndefOr[TagsMap]
  }

  @js.native
  @Factory
  trait ListTriggersResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var TriggerNames: js.UndefOr[TriggerNameList]
  }

  @js.native
  @Factory
  trait ListWorkflowsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait ListWorkflowsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Workflows: js.UndefOr[WorkflowNames]
  }

  /**
    * The location of resources.
    */
  @js.native
  @Factory
  trait Location extends js.Object {
    var DynamoDB: js.UndefOr[CodeGenNodeArgs]
    var Jdbc: js.UndefOr[CodeGenNodeArgs]
    var S3: js.UndefOr[CodeGenNodeArgs]
  }

  @js.native
  sealed trait Logical extends js.Any
  object Logical extends js.Object {
    val AND = "AND".asInstanceOf[Logical]
    val ANY = "ANY".asInstanceOf[Logical]

    val values = js.Object.freeze(js.Array(AND, ANY))
  }

  @js.native
  sealed trait LogicalOperator extends js.Any
  object LogicalOperator extends js.Object {
    val EQUALS = "EQUALS".asInstanceOf[LogicalOperator]

    val values = js.Object.freeze(js.Array(EQUALS))
  }

  /**
    * A structure for a machine learning transform.
    */
  @js.native
  @Factory
  trait MLTransform extends js.Object {
    var CreatedOn: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var EvaluationMetrics: js.UndefOr[EvaluationMetrics]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var InputRecordTables: js.UndefOr[GlueTables]
    var LabelCount: js.UndefOr[LabelCount]
    var LastModifiedOn: js.UndefOr[Timestamp]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[NullableInteger]
    var Name: js.UndefOr[NameString]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var Parameters: js.UndefOr[TransformParameters]
    var Role: js.UndefOr[RoleString]
    var Schema: js.UndefOr[TransformSchema]
    var Status: js.UndefOr[TransformStatusType]
    var Timeout: js.UndefOr[Timeout]
    var TransformId: js.UndefOr[HashString]
    var WorkerType: js.UndefOr[WorkerType]
  }

  /**
    * Defines a mapping.
    */
  @js.native
  @Factory
  trait MappingEntry extends js.Object {
    var SourcePath: js.UndefOr[SchemaPathString]
    var SourceTable: js.UndefOr[TableName]
    var SourceType: js.UndefOr[FieldType]
    var TargetPath: js.UndefOr[SchemaPathString]
    var TargetTable: js.UndefOr[TableName]
    var TargetType: js.UndefOr[FieldType]
  }

  /**
    * A node represents an AWS Glue component like Trigger, Job etc. which is part of a workflow.
    */
  @js.native
  @Factory
  trait Node extends js.Object {
    var CrawlerDetails: js.UndefOr[CrawlerNodeDetails]
    var JobDetails: js.UndefOr[JobNodeDetails]
    var Name: js.UndefOr[NameString]
    var TriggerDetails: js.UndefOr[TriggerNodeDetails]
    var Type: js.UndefOr[NodeType]
    var UniqueId: js.UndefOr[NameString]
  }

  @js.native
  sealed trait NodeType extends js.Any
  object NodeType extends js.Object {
    val CRAWLER = "CRAWLER".asInstanceOf[NodeType]
    val JOB     = "JOB".asInstanceOf[NodeType]
    val TRIGGER = "TRIGGER".asInstanceOf[NodeType]

    val values = js.Object.freeze(js.Array(CRAWLER, JOB, TRIGGER))
  }

  /**
    * Specifies configuration properties of a notification.
    */
  @js.native
  @Factory
  trait NotificationProperty extends js.Object {
    var NotifyDelayAfter: js.UndefOr[NotifyDelayAfter]
  }

  /**
    * Specifies the sort order of a sorted column.
    */
  @js.native
  @Factory
  trait Order extends js.Object {
    var Column: NameString
    var SortOrder: IntegerFlag
  }

  /**
    * Represents a slice of table data.
    */
  @js.native
  @Factory
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

  /**
    * Contains information about a partition error.
    */
  @js.native
  @Factory
  trait PartitionError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var PartitionValues: js.UndefOr[ValueStringList]
  }

  /**
    * The structure used to create and update a partition.
    */
  @js.native
  @Factory
  trait PartitionInput extends js.Object {
    var LastAccessTime: js.UndefOr[Timestamp]
    var LastAnalyzedTime: js.UndefOr[Timestamp]
    var Parameters: js.UndefOr[ParametersMap]
    var StorageDescriptor: js.UndefOr[StorageDescriptor]
    var Values: js.UndefOr[ValueStringList]
  }

  /**
    * Contains a list of values defining partitions.
    */
  @js.native
  @Factory
  trait PartitionValueList extends js.Object {
    var Values: ValueStringList
  }

  @js.native
  sealed trait Permission extends js.Any
  object Permission extends js.Object {
    val ALL                  = "ALL".asInstanceOf[Permission]
    val SELECT               = "SELECT".asInstanceOf[Permission]
    val ALTER                = "ALTER".asInstanceOf[Permission]
    val DROP                 = "DROP".asInstanceOf[Permission]
    val DELETE               = "DELETE".asInstanceOf[Permission]
    val INSERT               = "INSERT".asInstanceOf[Permission]
    val CREATE_DATABASE      = "CREATE_DATABASE".asInstanceOf[Permission]
    val CREATE_TABLE         = "CREATE_TABLE".asInstanceOf[Permission]
    val DATA_LOCATION_ACCESS = "DATA_LOCATION_ACCESS".asInstanceOf[Permission]

    val values = js.Object.freeze(
      js.Array(ALL, SELECT, ALTER, DROP, DELETE, INSERT, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
    )
  }

  /**
    * Specifies the physical requirements for a connection.
    */
  @js.native
  @Factory
  trait PhysicalConnectionRequirements extends js.Object {
    var AvailabilityZone: js.UndefOr[NameString]
    var SecurityGroupIdList: js.UndefOr[SecurityGroupIdList]
    var SubnetId: js.UndefOr[NameString]
  }

  /**
    * A job run that was used in the predicate of a conditional trigger that triggered this job run.
    */
  @js.native
  @Factory
  trait Predecessor extends js.Object {
    var JobName: js.UndefOr[NameString]
    var RunId: js.UndefOr[IdString]
  }

  /**
    * Defines the predicate of the trigger, which determines when it fires.
    */
  @js.native
  @Factory
  trait Predicate extends js.Object {
    var Conditions: js.UndefOr[ConditionList]
    var Logical: js.UndefOr[Logical]
  }

  /**
    * Permissions granted to a principal.
    */
  @js.native
  @Factory
  trait PrincipalPermissions extends js.Object {
    var Permissions: js.UndefOr[PermissionList]
    var Principal: js.UndefOr[DataLakePrincipal]
  }

  @js.native
  sealed trait PrincipalType extends js.Any
  object PrincipalType extends js.Object {
    val USER  = "USER".asInstanceOf[PrincipalType]
    val ROLE  = "ROLE".asInstanceOf[PrincipalType]
    val GROUP = "GROUP".asInstanceOf[PrincipalType]

    val values = js.Object.freeze(js.Array(USER, ROLE, GROUP))
  }

  /**
    * Defines a property predicate.
    */
  @js.native
  @Factory
  trait PropertyPredicate extends js.Object {
    var Comparator: js.UndefOr[Comparator]
    var Key: js.UndefOr[ValueString]
    var Value: js.UndefOr[ValueString]
  }

  @js.native
  @Factory
  trait PutDataCatalogEncryptionSettingsRequest extends js.Object {
    var DataCatalogEncryptionSettings: DataCatalogEncryptionSettings
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait PutDataCatalogEncryptionSettingsResponse extends js.Object {}

  @js.native
  @Factory
  trait PutResourcePolicyRequest extends js.Object {
    var PolicyInJson: PolicyJsonString
    var PolicyExistsCondition: js.UndefOr[ExistCondition]
    var PolicyHashCondition: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait PutResourcePolicyResponse extends js.Object {
    var PolicyHash: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait PutWorkflowRunPropertiesRequest extends js.Object {
    var Name: NameString
    var RunId: IdString
    var RunProperties: WorkflowRunProperties
  }

  @js.native
  @Factory
  trait PutWorkflowRunPropertiesResponse extends js.Object {}

  @js.native
  @Factory
  trait ResetJobBookmarkRequest extends js.Object {
    var JobName: JobName
    var RunId: js.UndefOr[RunId]
  }

  @js.native
  @Factory
  trait ResetJobBookmarkResponse extends js.Object {
    var JobBookmarkEntry: js.UndefOr[JobBookmarkEntry]
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val JAR     = "JAR".asInstanceOf[ResourceType]
    val FILE    = "FILE".asInstanceOf[ResourceType]
    val ARCHIVE = "ARCHIVE".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(JAR, FILE, ARCHIVE))
  }

  /**
    * The URIs for function resources.
    */
  @js.native
  @Factory
  trait ResourceUri extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Uri: js.UndefOr[URI]
  }

  /**
    * Specifies how Amazon Simple Storage Service (Amazon S3) data should be encrypted.
    */
  @js.native
  @Factory
  trait S3Encryption extends js.Object {
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var S3EncryptionMode: js.UndefOr[S3EncryptionMode]
  }

  @js.native
  sealed trait S3EncryptionMode extends js.Any
  object S3EncryptionMode extends js.Object {
    val DISABLED  = "DISABLED".asInstanceOf[S3EncryptionMode]
    val `SSE-KMS` = "SSE-KMS".asInstanceOf[S3EncryptionMode]
    val `SSE-S3`  = "SSE-S3".asInstanceOf[S3EncryptionMode]

    val values = js.Object.freeze(js.Array(DISABLED, `SSE-KMS`, `SSE-S3`))
  }

  /**
    * Specifies a data store in Amazon Simple Storage Service (Amazon S3).
    */
  @js.native
  @Factory
  trait S3Target extends js.Object {
    var Exclusions: js.UndefOr[PathList]
    var Path: js.UndefOr[Path]
  }

  /**
    * A scheduling object using a <code>cron</code> statement to schedule an event.
    */
  @js.native
  @Factory
  trait Schedule extends js.Object {
    var ScheduleExpression: js.UndefOr[CronExpression]
    var State: js.UndefOr[ScheduleState]
  }

  @js.native
  sealed trait ScheduleState extends js.Any
  object ScheduleState extends js.Object {
    val SCHEDULED     = "SCHEDULED".asInstanceOf[ScheduleState]
    val NOT_SCHEDULED = "NOT_SCHEDULED".asInstanceOf[ScheduleState]
    val TRANSITIONING = "TRANSITIONING".asInstanceOf[ScheduleState]

    val values = js.Object.freeze(js.Array(SCHEDULED, NOT_SCHEDULED, TRANSITIONING))
  }

  /**
    * A policy that specifies update and deletion behaviors for the crawler.
    */
  @js.native
  @Factory
  trait SchemaChangePolicy extends js.Object {
    var DeleteBehavior: js.UndefOr[DeleteBehavior]
    var UpdateBehavior: js.UndefOr[UpdateBehavior]
  }

  /**
    * A key-value pair representing a column and data type that this transform can run against. The <code>Schema</code> parameter of the <code>MLTransform</code> may contain up to 100 of these structures.
    */
  @js.native
  @Factory
  trait SchemaColumn extends js.Object {
    var DataType: js.UndefOr[ColumnTypeString]
    var Name: js.UndefOr[ColumnNameString]
  }

  @js.native
  @Factory
  trait SearchTablesRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var Filters: js.UndefOr[SearchPropertyPredicates]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var SearchText: js.UndefOr[ValueString]
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  @js.native
  @Factory
  trait SearchTablesResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableList: js.UndefOr[TableList]
  }

  /**
    * Specifies a security configuration.
    */
  @js.native
  @Factory
  trait SecurityConfiguration extends js.Object {
    var CreatedTimeStamp: js.UndefOr[TimestampValue]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var Name: js.UndefOr[NameString]
  }

  /**
    * Defines a non-overlapping region of a table's partitions, allowing multiple requests to be executed in parallel.
    */
  @js.native
  @Factory
  trait Segment extends js.Object {
    var SegmentNumber: NonNegativeInteger
    var TotalSegments: TotalSegmentsInteger
  }

  /**
    * Information about a serialization/deserialization program (SerDe) that serves as an extractor and loader.
    */
  @js.native
  @Factory
  trait SerDeInfo extends js.Object {
    var Name: js.UndefOr[NameString]
    var Parameters: js.UndefOr[ParametersMap]
    var SerializationLibrary: js.UndefOr[NameString]
  }

  /**
    * Specifies skewed values in a table. Skewed values are those that occur with very high frequency.
    */
  @js.native
  @Factory
  trait SkewedInfo extends js.Object {
    var SkewedColumnNames: js.UndefOr[NameStringList]
    var SkewedColumnValueLocationMaps: js.UndefOr[LocationMap]
    var SkewedColumnValues: js.UndefOr[ColumnValueStringList]
  }

  @js.native
  sealed trait Sort extends js.Any
  object Sort extends js.Object {
    val ASC  = "ASC".asInstanceOf[Sort]
    val DESC = "DESC".asInstanceOf[Sort]

    val values = js.Object.freeze(js.Array(ASC, DESC))
  }

  /**
    * Specifies a field to sort by and a sort order.
    */
  @js.native
  @Factory
  trait SortCriterion extends js.Object {
    var FieldName: js.UndefOr[ValueString]
    var Sort: js.UndefOr[Sort]
  }

  @js.native
  sealed trait SortDirectionType extends js.Any
  object SortDirectionType extends js.Object {
    val DESCENDING = "DESCENDING".asInstanceOf[SortDirectionType]
    val ASCENDING  = "ASCENDING".asInstanceOf[SortDirectionType]

    val values = js.Object.freeze(js.Array(DESCENDING, ASCENDING))
  }

  @js.native
  @Factory
  trait StartCrawlerRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait StartCrawlerResponse extends js.Object {}

  @js.native
  @Factory
  trait StartCrawlerScheduleRequest extends js.Object {
    var CrawlerName: NameString
  }

  @js.native
  @Factory
  trait StartCrawlerScheduleResponse extends js.Object {}

  @js.native
  @Factory
  trait StartExportLabelsTaskRunRequest extends js.Object {
    var OutputS3Path: UriString
    var TransformId: HashString
  }

  @js.native
  @Factory
  trait StartExportLabelsTaskRunResponse extends js.Object {
    var TaskRunId: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait StartImportLabelsTaskRunRequest extends js.Object {
    var InputS3Path: UriString
    var TransformId: HashString
    var ReplaceAllLabels: js.UndefOr[ReplaceBoolean]
  }

  @js.native
  @Factory
  trait StartImportLabelsTaskRunResponse extends js.Object {
    var TaskRunId: js.UndefOr[HashString]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait StartJobRunResponse extends js.Object {
    var JobRunId: js.UndefOr[IdString]
  }

  @js.native
  @Factory
  trait StartMLEvaluationTaskRunRequest extends js.Object {
    var TransformId: HashString
  }

  @js.native
  @Factory
  trait StartMLEvaluationTaskRunResponse extends js.Object {
    var TaskRunId: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait StartMLLabelingSetGenerationTaskRunRequest extends js.Object {
    var OutputS3Path: UriString
    var TransformId: HashString
  }

  @js.native
  @Factory
  trait StartMLLabelingSetGenerationTaskRunResponse extends js.Object {
    var TaskRunId: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait StartTriggerRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait StartTriggerResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  @js.native
  @Factory
  trait StartWorkflowRunRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait StartWorkflowRunResponse extends js.Object {
    var RunId: js.UndefOr[IdString]
  }

  @js.native
  @Factory
  trait StopCrawlerRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait StopCrawlerResponse extends js.Object {}

  @js.native
  @Factory
  trait StopCrawlerScheduleRequest extends js.Object {
    var CrawlerName: NameString
  }

  @js.native
  @Factory
  trait StopCrawlerScheduleResponse extends js.Object {}

  @js.native
  @Factory
  trait StopTriggerRequest extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait StopTriggerResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  /**
    * Describes the physical storage of table data.
    */
  @js.native
  @Factory
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

  /**
    * Represents a collection of related data organized in columns and rows.
    */
  @js.native
  @Factory
  trait Table extends js.Object {
    var Name: NameString
    var CreateTime: js.UndefOr[Timestamp]
    var CreatedBy: js.UndefOr[NameString]
    var DatabaseName: js.UndefOr[NameString]
    var Description: js.UndefOr[DescriptionString]
    var IsRegisteredWithLakeFormation: js.UndefOr[Boolean]
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

  /**
    * An error record for table operations.
    */
  @js.native
  @Factory
  trait TableError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var TableName: js.UndefOr[NameString]
  }

  /**
    * A structure used to define a table.
    */
  @js.native
  @Factory
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

  /**
    * Specifies a version of a table.
    */
  @js.native
  @Factory
  trait TableVersion extends js.Object {
    var Table: js.UndefOr[Table]
    var VersionId: js.UndefOr[VersionString]
  }

  /**
    * An error record for table-version operations.
    */
  @js.native
  @Factory
  trait TableVersionError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var TableName: js.UndefOr[NameString]
    var VersionId: js.UndefOr[VersionString]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: GlueResourceArn
    var TagsToAdd: TagsMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * The sampling parameters that are associated with the machine learning transform.
    */
  @js.native
  @Factory
  trait TaskRun extends js.Object {
    var CompletedOn: js.UndefOr[Timestamp]
    var ErrorString: js.UndefOr[GenericString]
    var ExecutionTime: js.UndefOr[ExecutionTime]
    var LastModifiedOn: js.UndefOr[Timestamp]
    var LogGroupName: js.UndefOr[GenericString]
    var Properties: js.UndefOr[TaskRunProperties]
    var StartedOn: js.UndefOr[Timestamp]
    var Status: js.UndefOr[TaskStatusType]
    var TaskRunId: js.UndefOr[HashString]
    var TransformId: js.UndefOr[HashString]
  }

  /**
    * The criteria that are used to filter the task runs for the machine learning transform.
    */
  @js.native
  @Factory
  trait TaskRunFilterCriteria extends js.Object {
    var StartedAfter: js.UndefOr[Timestamp]
    var StartedBefore: js.UndefOr[Timestamp]
    var Status: js.UndefOr[TaskStatusType]
    var TaskRunType: js.UndefOr[TaskType]
  }

  /**
    * The configuration properties for the task run.
    */
  @js.native
  @Factory
  trait TaskRunProperties extends js.Object {
    var ExportLabelsTaskRunProperties: js.UndefOr[ExportLabelsTaskRunProperties]
    var FindMatchesTaskRunProperties: js.UndefOr[FindMatchesTaskRunProperties]
    var ImportLabelsTaskRunProperties: js.UndefOr[ImportLabelsTaskRunProperties]
    var LabelingSetGenerationTaskRunProperties: js.UndefOr[LabelingSetGenerationTaskRunProperties]
    var TaskType: js.UndefOr[TaskType]
  }

  @js.native
  sealed trait TaskRunSortColumnType extends js.Any
  object TaskRunSortColumnType extends js.Object {
    val TASK_RUN_TYPE = "TASK_RUN_TYPE".asInstanceOf[TaskRunSortColumnType]
    val STATUS        = "STATUS".asInstanceOf[TaskRunSortColumnType]
    val STARTED       = "STARTED".asInstanceOf[TaskRunSortColumnType]

    val values = js.Object.freeze(js.Array(TASK_RUN_TYPE, STATUS, STARTED))
  }

  /**
    * The sorting criteria that are used to sort the list of task runs for the machine learning transform.
    */
  @js.native
  @Factory
  trait TaskRunSortCriteria extends js.Object {
    var Column: TaskRunSortColumnType
    var SortDirection: SortDirectionType
  }

  @js.native
  sealed trait TaskStatusType extends js.Any
  object TaskStatusType extends js.Object {
    val STARTING  = "STARTING".asInstanceOf[TaskStatusType]
    val RUNNING   = "RUNNING".asInstanceOf[TaskStatusType]
    val STOPPING  = "STOPPING".asInstanceOf[TaskStatusType]
    val STOPPED   = "STOPPED".asInstanceOf[TaskStatusType]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[TaskStatusType]
    val FAILED    = "FAILED".asInstanceOf[TaskStatusType]
    val TIMEOUT   = "TIMEOUT".asInstanceOf[TaskStatusType]

    val values = js.Object.freeze(js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT))
  }

  @js.native
  sealed trait TaskType extends js.Any
  object TaskType extends js.Object {
    val EVALUATION              = "EVALUATION".asInstanceOf[TaskType]
    val LABELING_SET_GENERATION = "LABELING_SET_GENERATION".asInstanceOf[TaskType]
    val IMPORT_LABELS           = "IMPORT_LABELS".asInstanceOf[TaskType]
    val EXPORT_LABELS           = "EXPORT_LABELS".asInstanceOf[TaskType]
    val FIND_MATCHES            = "FIND_MATCHES".asInstanceOf[TaskType]

    val values =
      js.Object.freeze(js.Array(EVALUATION, LABELING_SET_GENERATION, IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES))
  }

  /**
    * The criteria used to filter the machine learning transforms.
    */
  @js.native
  @Factory
  trait TransformFilterCriteria extends js.Object {
    var CreatedAfter: js.UndefOr[Timestamp]
    var CreatedBefore: js.UndefOr[Timestamp]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var LastModifiedAfter: js.UndefOr[Timestamp]
    var LastModifiedBefore: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NameString]
    var Schema: js.UndefOr[TransformSchema]
    var Status: js.UndefOr[TransformStatusType]
    var TransformType: js.UndefOr[TransformType]
  }

  /**
    * The algorithm-specific parameters that are associated with the machine learning transform.
    */
  @js.native
  @Factory
  trait TransformParameters extends js.Object {
    var TransformType: TransformType
    var FindMatchesParameters: js.UndefOr[FindMatchesParameters]
  }

  @js.native
  sealed trait TransformSortColumnType extends js.Any
  object TransformSortColumnType extends js.Object {
    val NAME           = "NAME".asInstanceOf[TransformSortColumnType]
    val TRANSFORM_TYPE = "TRANSFORM_TYPE".asInstanceOf[TransformSortColumnType]
    val STATUS         = "STATUS".asInstanceOf[TransformSortColumnType]
    val CREATED        = "CREATED".asInstanceOf[TransformSortColumnType]
    val LAST_MODIFIED  = "LAST_MODIFIED".asInstanceOf[TransformSortColumnType]

    val values = js.Object.freeze(js.Array(NAME, TRANSFORM_TYPE, STATUS, CREATED, LAST_MODIFIED))
  }

  /**
    * The sorting criteria that are associated with the machine learning transform.
    */
  @js.native
  @Factory
  trait TransformSortCriteria extends js.Object {
    var Column: TransformSortColumnType
    var SortDirection: SortDirectionType
  }

  @js.native
  sealed trait TransformStatusType extends js.Any
  object TransformStatusType extends js.Object {
    val NOT_READY = "NOT_READY".asInstanceOf[TransformStatusType]
    val READY     = "READY".asInstanceOf[TransformStatusType]
    val DELETING  = "DELETING".asInstanceOf[TransformStatusType]

    val values = js.Object.freeze(js.Array(NOT_READY, READY, DELETING))
  }

  @js.native
  sealed trait TransformType extends js.Any
  object TransformType extends js.Object {
    val FIND_MATCHES = "FIND_MATCHES".asInstanceOf[TransformType]

    val values = js.Object.freeze(js.Array(FIND_MATCHES))
  }

  /**
    * Information about a specific trigger.
    */
  @js.native
  @Factory
  trait Trigger extends js.Object {
    var Actions: js.UndefOr[ActionList]
    var Description: js.UndefOr[DescriptionString]
    var Id: js.UndefOr[IdString]
    var Name: js.UndefOr[NameString]
    var Predicate: js.UndefOr[Predicate]
    var Schedule: js.UndefOr[GenericString]
    var State: js.UndefOr[TriggerState]
    var Type: js.UndefOr[TriggerType]
    var WorkflowName: js.UndefOr[NameString]
  }

  /**
    * The details of a Trigger node present in the workflow.
    */
  @js.native
  @Factory
  trait TriggerNodeDetails extends js.Object {
    var Trigger: js.UndefOr[Trigger]
  }

  @js.native
  sealed trait TriggerState extends js.Any
  object TriggerState extends js.Object {
    val CREATING     = "CREATING".asInstanceOf[TriggerState]
    val CREATED      = "CREATED".asInstanceOf[TriggerState]
    val ACTIVATING   = "ACTIVATING".asInstanceOf[TriggerState]
    val ACTIVATED    = "ACTIVATED".asInstanceOf[TriggerState]
    val DEACTIVATING = "DEACTIVATING".asInstanceOf[TriggerState]
    val DEACTIVATED  = "DEACTIVATED".asInstanceOf[TriggerState]
    val DELETING     = "DELETING".asInstanceOf[TriggerState]
    val UPDATING     = "UPDATING".asInstanceOf[TriggerState]

    val values = js.Object.freeze(
      js.Array(CREATING, CREATED, ACTIVATING, ACTIVATED, DEACTIVATING, DEACTIVATED, DELETING, UPDATING)
    )
  }

  @js.native
  sealed trait TriggerType extends js.Any
  object TriggerType extends js.Object {
    val SCHEDULED   = "SCHEDULED".asInstanceOf[TriggerType]
    val CONDITIONAL = "CONDITIONAL".asInstanceOf[TriggerType]
    val ON_DEMAND   = "ON_DEMAND".asInstanceOf[TriggerType]

    val values = js.Object.freeze(js.Array(SCHEDULED, CONDITIONAL, ON_DEMAND))
  }

  /**
    * A structure used to provide information used to update a trigger. This object updates the previous trigger definition by overwriting it completely.
    */
  @js.native
  @Factory
  trait TriggerUpdate extends js.Object {
    var Actions: js.UndefOr[ActionList]
    var Description: js.UndefOr[DescriptionString]
    var Name: js.UndefOr[NameString]
    var Predicate: js.UndefOr[Predicate]
    var Schedule: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: GlueResourceArn
    var TagsToRemove: TagKeysList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  sealed trait UpdateBehavior extends js.Any
  object UpdateBehavior extends js.Object {
    val LOG                = "LOG".asInstanceOf[UpdateBehavior]
    val UPDATE_IN_DATABASE = "UPDATE_IN_DATABASE".asInstanceOf[UpdateBehavior]

    val values = js.Object.freeze(js.Array(LOG, UPDATE_IN_DATABASE))
  }

  @js.native
  @Factory
  trait UpdateClassifierRequest extends js.Object {
    var CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest]
    var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest]
    var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest]
    var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest]
  }

  @js.native
  @Factory
  trait UpdateClassifierResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateConnectionRequest extends js.Object {
    var ConnectionInput: ConnectionInput
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait UpdateConnectionResponse extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateCrawlerResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateCrawlerScheduleRequest extends js.Object {
    var CrawlerName: NameString
    var Schedule: js.UndefOr[CronExpression]
  }

  @js.native
  @Factory
  trait UpdateCrawlerScheduleResponse extends js.Object {}

  /**
    * Specifies a custom CSV classifier to be updated.
    */
  @js.native
  @Factory
  trait UpdateCsvClassifierRequest extends js.Object {
    var Name: NameString
    var AllowSingleColumn: js.UndefOr[NullableBoolean]
    var ContainsHeader: js.UndefOr[CsvHeaderOption]
    var Delimiter: js.UndefOr[CsvColumnDelimiter]
    var DisableValueTrimming: js.UndefOr[NullableBoolean]
    var Header: js.UndefOr[CsvHeader]
    var QuoteSymbol: js.UndefOr[CsvQuoteSymbol]
  }

  @js.native
  @Factory
  trait UpdateDatabaseRequest extends js.Object {
    var DatabaseInput: DatabaseInput
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait UpdateDatabaseResponse extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateDevEndpointResponse extends js.Object {}

  /**
    * Specifies a grok classifier to update when passed to <code>UpdateClassifier</code>.
    */
  @js.native
  @Factory
  trait UpdateGrokClassifierRequest extends js.Object {
    var Name: NameString
    var Classification: js.UndefOr[Classification]
    var CustomPatterns: js.UndefOr[CustomPatterns]
    var GrokPattern: js.UndefOr[GrokPattern]
  }

  @js.native
  @Factory
  trait UpdateJobRequest extends js.Object {
    var JobName: NameString
    var JobUpdate: JobUpdate
  }

  @js.native
  @Factory
  trait UpdateJobResponse extends js.Object {
    var JobName: js.UndefOr[NameString]
  }

  /**
    * Specifies a JSON classifier to be updated.
    */
  @js.native
  @Factory
  trait UpdateJsonClassifierRequest extends js.Object {
    var Name: NameString
    var JsonPath: js.UndefOr[JsonPath]
  }

  @js.native
  @Factory
  trait UpdateMLTransformRequest extends js.Object {
    var TransformId: HashString
    var Description: js.UndefOr[DescriptionString]
    var GlueVersion: js.UndefOr[GlueVersionString]
    var MaxCapacity: js.UndefOr[NullableDouble]
    var MaxRetries: js.UndefOr[NullableInteger]
    var Name: js.UndefOr[NameString]
    var NumberOfWorkers: js.UndefOr[NullableInteger]
    var Parameters: js.UndefOr[TransformParameters]
    var Role: js.UndefOr[RoleString]
    var Timeout: js.UndefOr[Timeout]
    var WorkerType: js.UndefOr[WorkerType]
  }

  @js.native
  @Factory
  trait UpdateMLTransformResponse extends js.Object {
    var TransformId: js.UndefOr[HashString]
  }

  @js.native
  @Factory
  trait UpdatePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionInput: PartitionInput
    var PartitionValueList: BoundedPartitionValueList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait UpdatePartitionResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateTableRequest extends js.Object {
    var DatabaseName: NameString
    var TableInput: TableInput
    var CatalogId: js.UndefOr[CatalogIdString]
    var SkipArchive: js.UndefOr[BooleanNullable]
  }

  @js.native
  @Factory
  trait UpdateTableResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateTriggerRequest extends js.Object {
    var Name: NameString
    var TriggerUpdate: TriggerUpdate
  }

  @js.native
  @Factory
  trait UpdateTriggerResponse extends js.Object {
    var Trigger: js.UndefOr[Trigger]
  }

  @js.native
  @Factory
  trait UpdateUserDefinedFunctionRequest extends js.Object {
    var DatabaseName: NameString
    var FunctionInput: UserDefinedFunctionInput
    var FunctionName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait UpdateUserDefinedFunctionResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateWorkflowRequest extends js.Object {
    var Name: NameString
    var DefaultRunProperties: js.UndefOr[WorkflowRunProperties]
    var Description: js.UndefOr[GenericString]
  }

  @js.native
  @Factory
  trait UpdateWorkflowResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  /**
    * Specifies an XML classifier to be updated.
    */
  @js.native
  @Factory
  trait UpdateXMLClassifierRequest extends js.Object {
    var Name: NameString
    var Classification: js.UndefOr[Classification]
    var RowTag: js.UndefOr[RowTag]
  }

  /**
    * Represents the equivalent of a Hive user-defined function (<code>UDF</code>) definition.
    */
  @js.native
  @Factory
  trait UserDefinedFunction extends js.Object {
    var ClassName: js.UndefOr[NameString]
    var CreateTime: js.UndefOr[Timestamp]
    var FunctionName: js.UndefOr[NameString]
    var OwnerName: js.UndefOr[NameString]
    var OwnerType: js.UndefOr[PrincipalType]
    var ResourceUris: js.UndefOr[ResourceUriList]
  }

  /**
    * A structure used to create or update a user-defined function.
    */
  @js.native
  @Factory
  trait UserDefinedFunctionInput extends js.Object {
    var ClassName: js.UndefOr[NameString]
    var FunctionName: js.UndefOr[NameString]
    var OwnerName: js.UndefOr[NameString]
    var OwnerType: js.UndefOr[PrincipalType]
    var ResourceUris: js.UndefOr[ResourceUriList]
  }

  @js.native
  sealed trait WorkerType extends js.Any
  object WorkerType extends js.Object {
    val Standard = "Standard".asInstanceOf[WorkerType]
    val `G.1X`   = "G.1X".asInstanceOf[WorkerType]
    val `G.2X`   = "G.2X".asInstanceOf[WorkerType]

    val values = js.Object.freeze(js.Array(Standard, `G.1X`, `G.2X`))
  }

  /**
    * A workflow represents a flow in which AWS Glue components should be executed to complete a logical task.
    */
  @js.native
  @Factory
  trait Workflow extends js.Object {
    var CreatedOn: js.UndefOr[TimestampValue]
    var DefaultRunProperties: js.UndefOr[WorkflowRunProperties]
    var Description: js.UndefOr[GenericString]
    var Graph: js.UndefOr[WorkflowGraph]
    var LastModifiedOn: js.UndefOr[TimestampValue]
    var LastRun: js.UndefOr[WorkflowRun]
    var Name: js.UndefOr[NameString]
  }

  /**
    * A workflow graph represents the complete workflow containing all the AWS Glue components present in the workflow and all the directed connections between them.
    */
  @js.native
  @Factory
  trait WorkflowGraph extends js.Object {
    var Edges: js.UndefOr[EdgeList]
    var Nodes: js.UndefOr[NodeList]
  }

  /**
    * A workflow run is an execution of a workflow providing all the runtime information.
    */
  @js.native
  @Factory
  trait WorkflowRun extends js.Object {
    var CompletedOn: js.UndefOr[TimestampValue]
    var Graph: js.UndefOr[WorkflowGraph]
    var Name: js.UndefOr[NameString]
    var StartedOn: js.UndefOr[TimestampValue]
    var Statistics: js.UndefOr[WorkflowRunStatistics]
    var Status: js.UndefOr[WorkflowRunStatus]
    var WorkflowRunId: js.UndefOr[IdString]
    var WorkflowRunProperties: js.UndefOr[WorkflowRunProperties]
  }

  /**
    * Workflow run statistics provides statistics about the workflow run.
    */
  @js.native
  @Factory
  trait WorkflowRunStatistics extends js.Object {
    var FailedActions: js.UndefOr[IntegerValue]
    var RunningActions: js.UndefOr[IntegerValue]
    var StoppedActions: js.UndefOr[IntegerValue]
    var SucceededActions: js.UndefOr[IntegerValue]
    var TimeoutActions: js.UndefOr[IntegerValue]
    var TotalActions: js.UndefOr[IntegerValue]
  }

  @js.native
  sealed trait WorkflowRunStatus extends js.Any
  object WorkflowRunStatus extends js.Object {
    val RUNNING   = "RUNNING".asInstanceOf[WorkflowRunStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[WorkflowRunStatus]

    val values = js.Object.freeze(js.Array(RUNNING, COMPLETED))
  }

  /**
    * A classifier for <code>XML</code> content.
    */
  @js.native
  @Factory
  trait XMLClassifier extends js.Object {
    var Classification: Classification
    var Name: NameString
    var CreationTime: js.UndefOr[Timestamp]
    var LastUpdated: js.UndefOr[Timestamp]
    var RowTag: js.UndefOr[RowTag]
    var Version: js.UndefOr[VersionId]
  }
}
