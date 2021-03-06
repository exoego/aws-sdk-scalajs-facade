package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object glue {
  type ActionList = js.Array[Action]
  type AdditionalPlanOptionsMap = js.Dictionary[GenericString]
  type AttemptCount = Int
  type BackfillErroredPartitionsList = js.Array[PartitionValueList]
  type BackfillErrors = js.Array[BackfillError]
  type BatchDeletePartitionValueList = js.Array[PartitionValueList]
  type BatchDeleteTableNameList = js.Array[NameString]
  type BatchDeleteTableVersionList = js.Array[VersionString]
  type BatchGetPartitionValueList = js.Array[PartitionValueList]
  type BatchStopJobRunErrorList = js.Array[BatchStopJobRunError]
  type BatchStopJobRunJobRunIdList = js.Array[IdString]
  type BatchStopJobRunSuccessfulSubmissionList = js.Array[BatchStopJobRunSuccessfulSubmission]
  type BatchUpdatePartitionFailureList = js.Array[BatchUpdatePartitionFailureEntry]
  type BatchUpdatePartitionRequestEntryList = js.Array[BatchUpdatePartitionRequestEntry]
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BooleanNullable = Boolean
  type BooleanValue = Boolean
  type BoundedPartitionValueList = js.Array[ValueString]
  type CatalogEntries = js.Array[CatalogEntry]
  type CatalogGetterPageSize = Int
  type CatalogIdString = String
  type CatalogTablesList = js.Array[NameString]
  type CatalogTargetList = js.Array[CatalogTarget]
  type Classification = String
  type ClassifierList = js.Array[Classifier]
  type ClassifierNameList = js.Array[NameString]
  type CodeGenArgName = String
  type CodeGenArgValue = String
  type CodeGenIdentifier = String
  type CodeGenNodeArgs = js.Array[CodeGenNodeArg]
  type CodeGenNodeType = String
  type ColumnErrors = js.Array[ColumnError]
  type ColumnImportanceList = js.Array[ColumnImportance]
  type ColumnList = js.Array[Column]
  type ColumnNameString = String
  type ColumnStatisticsErrors = js.Array[ColumnStatisticsError]
  type ColumnStatisticsList = js.Array[ColumnStatistics]
  type ColumnTypeString = String
  type ColumnValueStringList = js.Array[ColumnValuesString]
  type ColumnValuesString = String
  type CommentString = String
  type ConditionList = js.Array[Condition]
  type ConnectionList = js.Array[Connection]
  type ConnectionName = String
  type ConnectionProperties = js.Dictionary[ValueString]
  type CrawlList = js.Array[Crawl]
  type CrawlerConfiguration = String
  type CrawlerList = js.Array[Crawler]
  type CrawlerMetricsList = js.Array[CrawlerMetrics]
  type CrawlerNameList = js.Array[NameString]
  type CrawlerSecurityConfiguration = String
  type CreatedTimestamp = String
  type CronExpression = String
  type CsvColumnDelimiter = String
  type CsvHeader = js.Array[NameString]
  type CsvQuoteSymbol = String
  type CustomPatterns = String
  type DagEdges = js.Array[CodeGenEdge]
  type DagNodes = js.Array[CodeGenNode]
  type DataLakePrincipalString = String
  type DatabaseList = js.Array[Database]
  type DatabaseName = String
  type DeleteConnectionNameList = js.Array[NameString]
  type DescriptionString = String
  type DescriptionStringRemovable = String
  type DevEndpointList = js.Array[DevEndpoint]
  type DevEndpointNameList = js.Array[NameString]
  type DevEndpointNames = js.Array[GenericString]
  type DynamoDBTargetList = js.Array[DynamoDBTarget]
  type EdgeList = js.Array[Edge]
  type ErrorByName = js.Dictionary[ErrorDetail]
  type ErrorCodeString = String
  type ErrorMessageString = String
  type ErrorString = String
  type ExecutionTime = Int
  type FieldType = String
  type FilterString = String
  type FormatString = String
  type GenericBoundedDouble = Double
  type GenericMap = js.Dictionary[GenericString]
  type GenericString = String
  type GetColumnNamesList = js.Array[NameString]
  type GetResourcePoliciesResponseList = js.Array[GluePolicy]
  type GetTableVersionsList = js.Array[TableVersion]
  type GlueResourceArn = String
  type GlueTables = js.Array[GlueTable]
  type GlueVersionString = String
  type GrokPattern = String
  type HashString = String
  type IdString = String
  type IntegerFlag = Int
  type IntegerValue = Int
  type IsVersionValid = Boolean
  type JdbcTargetList = js.Array[JdbcTarget]
  type JobList = js.Array[Job]
  type JobName = String
  type JobNameList = js.Array[NameString]
  type JobRunList = js.Array[JobRun]
  type JsonPath = String
  type JsonValue = String
  type KeyList = js.Array[NameString]
  type KeySchemaElementList = js.Array[KeySchemaElement]
  type KeyString = String
  type KmsKeyArn = String
  type LabelCount = Int
  type LatestSchemaVersionBoolean = Boolean
  type LocationMap = js.Dictionary[ColumnValuesString]
  type LocationString = String
  type LogGroup = String
  type LogStream = String
  type MapValue = js.Dictionary[GenericString]
  type MappingList = js.Array[MappingEntry]
  type MatchCriteria = js.Array[NameString]
  type MaxConcurrentRuns = Int
  type MaxResultsNumber = Int
  type MaxRetries = Int
  type MessagePrefix = String
  type MetadataInfoMap = js.Dictionary[MetadataInfo]
  type MetadataKeyString = String
  type MetadataList = js.Array[MetadataKeyValuePair]
  type MetadataValueString = String
  type MillisecondsCount = Double
  type MongoDBTargetList = js.Array[MongoDBTarget]
  type NameString = String
  type NameStringList = js.Array[NameString]
  type NodeIdList = js.Array[NameString]
  type NodeList = js.Array[Node]
  type NonNegativeDouble = Double
  type NonNegativeInteger = Int
  type NonNegativeLong = Double
  type NotifyDelayAfter = Int
  type NullableBoolean = Boolean
  type NullableDouble = Double
  type NullableInteger = Int
  type OrchestrationStringList = js.Array[GenericString]
  type OrderList = js.Array[Order]
  type OtherMetadataValueList = js.Array[OtherMetadataValueListItem]
  type PageSize = Int
  type PaginationToken = String
  type ParametersMap = js.Dictionary[ParametersMapValue]
  type ParametersMapValue = String
  type PartitionErrors = js.Array[PartitionError]
  type PartitionIndexDescriptorList = js.Array[PartitionIndexDescriptor]
  type PartitionIndexList = js.Array[PartitionIndex]
  type PartitionInputList = js.Array[PartitionInput]
  type PartitionList = js.Array[Partition]
  type Path = String
  type PathList = js.Array[Path]
  type PermissionList = js.Array[Permission]
  type PolicyJsonString = String
  type PredecessorList = js.Array[Predecessor]
  type PredicateString = String
  type PrincipalPermissionsList = js.Array[PrincipalPermissions]
  type PublicKeysList = js.Array[GenericString]
  type PythonScript = String
  type PythonVersionString = String
  type QuerySchemaVersionMetadataMaxResults = Int
  type RecordsCount = Double
  type RegistryListDefinition = js.Array[RegistryListItem]
  type ReplaceBoolean = Boolean
  type ResourceUriList = js.Array[ResourceUri]
  type Role = String
  type RoleArn = String
  type RoleString = String
  type RowTag = String
  type RunId = String
  type S3EncryptionList = js.Array[S3Encryption]
  type S3TargetList = js.Array[S3Target]
  type ScalaCode = String
  type SchemaCheckpointNumber = Double
  type SchemaDefinitionDiff = String
  type SchemaDefinitionString = String
  type SchemaListDefinition = js.Array[SchemaListItem]
  type SchemaPathString = String
  type SchemaRegistryNameString = String
  type SchemaRegistryTokenString = String
  type SchemaValidationError = String
  type SchemaVersionErrorList = js.Array[SchemaVersionErrorItem]
  type SchemaVersionIdString = String
  type SchemaVersionList = js.Array[SchemaVersionListItem]
  type ScriptLocationString = String
  type SearchPropertyPredicates = js.Array[PropertyPredicate]
  type SecurityConfigurationList = js.Array[SecurityConfiguration]
  type SecurityGroupIdList = js.Array[NameString]
  type SortCriteria = js.Array[SortCriterion]
  type StringList = js.Array[GenericString]
  type TableErrors = js.Array[TableError]
  type TableList = js.Array[Table]
  type TableName = String
  type TablePrefix = String
  type TableTypeString = String
  type TableVersionErrors = js.Array[TableVersionError]
  type TagKey = String
  type TagKeysList = js.Array[TagKey]
  type TagValue = String
  type TagsMap = js.Dictionary[TagValue]
  type TaskRunList = js.Array[TaskRun]
  type Timeout = Int
  type Timestamp = js.Date
  type TimestampValue = js.Date
  type Token = String
  type TotalSegmentsInteger = Int
  type TransformIdList = js.Array[HashString]
  type TransformList = js.Array[MLTransform]
  type TransformSchema = js.Array[SchemaColumn]
  type TriggerList = js.Array[Trigger]
  type TriggerNameList = js.Array[NameString]
  type TypeString = String
  type URI = String
  type UpdateColumnStatisticsList = js.Array[ColumnStatistics]
  type UpdatedTimestamp = String
  type UriString = String
  type UserDefinedFunctionList = js.Array[UserDefinedFunction]
  type ValueString = String
  type ValueStringList = js.Array[ValueString]
  type VersionId = Double
  type VersionLongNumber = Double
  type VersionString = String
  type VersionsString = String
  type ViewTextString = String
  type WorkflowNames = js.Array[NameString]
  type WorkflowRunProperties = js.Dictionary[GenericString]
  type WorkflowRuns = js.Array[WorkflowRun]
  type Workflows = js.Array[Workflow]

  implicit final class GlueOps(private val service: Glue) extends AnyVal {

    @inline def batchCreatePartitionFuture(params: BatchCreatePartitionRequest): Future[BatchCreatePartitionResponse] = service.batchCreatePartition(params).promise().toFuture
    @inline def batchDeleteConnectionFuture(params: BatchDeleteConnectionRequest): Future[BatchDeleteConnectionResponse] = service.batchDeleteConnection(params).promise().toFuture
    @inline def batchDeletePartitionFuture(params: BatchDeletePartitionRequest): Future[BatchDeletePartitionResponse] = service.batchDeletePartition(params).promise().toFuture
    @inline def batchDeleteTableFuture(params: BatchDeleteTableRequest): Future[BatchDeleteTableResponse] = service.batchDeleteTable(params).promise().toFuture
    @inline def batchDeleteTableVersionFuture(params: BatchDeleteTableVersionRequest): Future[BatchDeleteTableVersionResponse] = service.batchDeleteTableVersion(params).promise().toFuture
    @inline def batchGetCrawlersFuture(params: BatchGetCrawlersRequest): Future[BatchGetCrawlersResponse] = service.batchGetCrawlers(params).promise().toFuture
    @inline def batchGetDevEndpointsFuture(params: BatchGetDevEndpointsRequest): Future[BatchGetDevEndpointsResponse] = service.batchGetDevEndpoints(params).promise().toFuture
    @inline def batchGetJobsFuture(params: BatchGetJobsRequest): Future[BatchGetJobsResponse] = service.batchGetJobs(params).promise().toFuture
    @inline def batchGetPartitionFuture(params: BatchGetPartitionRequest): Future[BatchGetPartitionResponse] = service.batchGetPartition(params).promise().toFuture
    @inline def batchGetTriggersFuture(params: BatchGetTriggersRequest): Future[BatchGetTriggersResponse] = service.batchGetTriggers(params).promise().toFuture
    @inline def batchGetWorkflowsFuture(params: BatchGetWorkflowsRequest): Future[BatchGetWorkflowsResponse] = service.batchGetWorkflows(params).promise().toFuture
    @inline def batchStopJobRunFuture(params: BatchStopJobRunRequest): Future[BatchStopJobRunResponse] = service.batchStopJobRun(params).promise().toFuture
    @inline def batchUpdatePartitionFuture(params: BatchUpdatePartitionRequest): Future[BatchUpdatePartitionResponse] = service.batchUpdatePartition(params).promise().toFuture
    @inline def cancelMLTaskRunFuture(params: CancelMLTaskRunRequest): Future[CancelMLTaskRunResponse] = service.cancelMLTaskRun(params).promise().toFuture
    @inline def checkSchemaVersionValidityFuture(params: CheckSchemaVersionValidityInput): Future[CheckSchemaVersionValidityResponse] = service.checkSchemaVersionValidity(params).promise().toFuture
    @inline def createClassifierFuture(params: CreateClassifierRequest): Future[CreateClassifierResponse] = service.createClassifier(params).promise().toFuture
    @inline def createConnectionFuture(params: CreateConnectionRequest): Future[CreateConnectionResponse] = service.createConnection(params).promise().toFuture
    @inline def createCrawlerFuture(params: CreateCrawlerRequest): Future[CreateCrawlerResponse] = service.createCrawler(params).promise().toFuture
    @inline def createDatabaseFuture(params: CreateDatabaseRequest): Future[CreateDatabaseResponse] = service.createDatabase(params).promise().toFuture
    @inline def createDevEndpointFuture(params: CreateDevEndpointRequest): Future[CreateDevEndpointResponse] = service.createDevEndpoint(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] = service.createJob(params).promise().toFuture
    @inline def createMLTransformFuture(params: CreateMLTransformRequest): Future[CreateMLTransformResponse] = service.createMLTransform(params).promise().toFuture
    @inline def createPartitionFuture(params: CreatePartitionRequest): Future[CreatePartitionResponse] = service.createPartition(params).promise().toFuture
    @inline def createPartitionIndexFuture(params: CreatePartitionIndexRequest): Future[CreatePartitionIndexResponse] = service.createPartitionIndex(params).promise().toFuture
    @inline def createRegistryFuture(params: CreateRegistryInput): Future[CreateRegistryResponse] = service.createRegistry(params).promise().toFuture
    @inline def createSchemaFuture(params: CreateSchemaInput): Future[CreateSchemaResponse] = service.createSchema(params).promise().toFuture
    @inline def createScriptFuture(params: CreateScriptRequest): Future[CreateScriptResponse] = service.createScript(params).promise().toFuture
    @inline def createSecurityConfigurationFuture(params: CreateSecurityConfigurationRequest): Future[CreateSecurityConfigurationResponse] = service.createSecurityConfiguration(params).promise().toFuture
    @inline def createTableFuture(params: CreateTableRequest): Future[CreateTableResponse] = service.createTable(params).promise().toFuture
    @inline def createTriggerFuture(params: CreateTriggerRequest): Future[CreateTriggerResponse] = service.createTrigger(params).promise().toFuture
    @inline def createUserDefinedFunctionFuture(params: CreateUserDefinedFunctionRequest): Future[CreateUserDefinedFunctionResponse] = service.createUserDefinedFunction(params).promise().toFuture
    @inline def createWorkflowFuture(params: CreateWorkflowRequest): Future[CreateWorkflowResponse] = service.createWorkflow(params).promise().toFuture
    @inline def deleteClassifierFuture(params: DeleteClassifierRequest): Future[DeleteClassifierResponse] = service.deleteClassifier(params).promise().toFuture
    @inline def deleteColumnStatisticsForPartitionFuture(params: DeleteColumnStatisticsForPartitionRequest): Future[DeleteColumnStatisticsForPartitionResponse] = service.deleteColumnStatisticsForPartition(params).promise().toFuture
    @inline def deleteColumnStatisticsForTableFuture(params: DeleteColumnStatisticsForTableRequest): Future[DeleteColumnStatisticsForTableResponse] = service.deleteColumnStatisticsForTable(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionRequest): Future[DeleteConnectionResponse] = service.deleteConnection(params).promise().toFuture
    @inline def deleteCrawlerFuture(params: DeleteCrawlerRequest): Future[DeleteCrawlerResponse] = service.deleteCrawler(params).promise().toFuture
    @inline def deleteDatabaseFuture(params: DeleteDatabaseRequest): Future[DeleteDatabaseResponse] = service.deleteDatabase(params).promise().toFuture
    @inline def deleteDevEndpointFuture(params: DeleteDevEndpointRequest): Future[DeleteDevEndpointResponse] = service.deleteDevEndpoint(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResponse] = service.deleteJob(params).promise().toFuture
    @inline def deleteMLTransformFuture(params: DeleteMLTransformRequest): Future[DeleteMLTransformResponse] = service.deleteMLTransform(params).promise().toFuture
    @inline def deletePartitionFuture(params: DeletePartitionRequest): Future[DeletePartitionResponse] = service.deletePartition(params).promise().toFuture
    @inline def deletePartitionIndexFuture(params: DeletePartitionIndexRequest): Future[DeletePartitionIndexResponse] = service.deletePartitionIndex(params).promise().toFuture
    @inline def deleteRegistryFuture(params: DeleteRegistryInput): Future[DeleteRegistryResponse] = service.deleteRegistry(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] = service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteSchemaFuture(params: DeleteSchemaInput): Future[DeleteSchemaResponse] = service.deleteSchema(params).promise().toFuture
    @inline def deleteSchemaVersionsFuture(params: DeleteSchemaVersionsInput): Future[DeleteSchemaVersionsResponse] = service.deleteSchemaVersions(params).promise().toFuture
    @inline def deleteSecurityConfigurationFuture(params: DeleteSecurityConfigurationRequest): Future[DeleteSecurityConfigurationResponse] = service.deleteSecurityConfiguration(params).promise().toFuture
    @inline def deleteTableFuture(params: DeleteTableRequest): Future[DeleteTableResponse] = service.deleteTable(params).promise().toFuture
    @inline def deleteTableVersionFuture(params: DeleteTableVersionRequest): Future[DeleteTableVersionResponse] = service.deleteTableVersion(params).promise().toFuture
    @inline def deleteTriggerFuture(params: DeleteTriggerRequest): Future[DeleteTriggerResponse] = service.deleteTrigger(params).promise().toFuture
    @inline def deleteUserDefinedFunctionFuture(params: DeleteUserDefinedFunctionRequest): Future[DeleteUserDefinedFunctionResponse] = service.deleteUserDefinedFunction(params).promise().toFuture
    @inline def deleteWorkflowFuture(params: DeleteWorkflowRequest): Future[DeleteWorkflowResponse] = service.deleteWorkflow(params).promise().toFuture
    @inline def getCatalogImportStatusFuture(params: GetCatalogImportStatusRequest): Future[GetCatalogImportStatusResponse] = service.getCatalogImportStatus(params).promise().toFuture
    @inline def getClassifierFuture(params: GetClassifierRequest): Future[GetClassifierResponse] = service.getClassifier(params).promise().toFuture
    @inline def getClassifiersFuture(params: GetClassifiersRequest): Future[GetClassifiersResponse] = service.getClassifiers(params).promise().toFuture
    @inline def getColumnStatisticsForPartitionFuture(params: GetColumnStatisticsForPartitionRequest): Future[GetColumnStatisticsForPartitionResponse] = service.getColumnStatisticsForPartition(params).promise().toFuture
    @inline def getColumnStatisticsForTableFuture(params: GetColumnStatisticsForTableRequest): Future[GetColumnStatisticsForTableResponse] = service.getColumnStatisticsForTable(params).promise().toFuture
    @inline def getConnectionFuture(params: GetConnectionRequest): Future[GetConnectionResponse] = service.getConnection(params).promise().toFuture
    @inline def getConnectionsFuture(params: GetConnectionsRequest): Future[GetConnectionsResponse] = service.getConnections(params).promise().toFuture
    @inline def getCrawlerFuture(params: GetCrawlerRequest): Future[GetCrawlerResponse] = service.getCrawler(params).promise().toFuture
    @inline def getCrawlerMetricsFuture(params: GetCrawlerMetricsRequest): Future[GetCrawlerMetricsResponse] = service.getCrawlerMetrics(params).promise().toFuture
    @inline def getCrawlersFuture(params: GetCrawlersRequest): Future[GetCrawlersResponse] = service.getCrawlers(params).promise().toFuture
    @inline def getDataCatalogEncryptionSettingsFuture(params: GetDataCatalogEncryptionSettingsRequest): Future[GetDataCatalogEncryptionSettingsResponse] = service.getDataCatalogEncryptionSettings(params).promise().toFuture
    @inline def getDatabaseFuture(params: GetDatabaseRequest): Future[GetDatabaseResponse] = service.getDatabase(params).promise().toFuture
    @inline def getDatabasesFuture(params: GetDatabasesRequest): Future[GetDatabasesResponse] = service.getDatabases(params).promise().toFuture
    @inline def getDataflowGraphFuture(params: GetDataflowGraphRequest): Future[GetDataflowGraphResponse] = service.getDataflowGraph(params).promise().toFuture
    @inline def getDevEndpointFuture(params: GetDevEndpointRequest): Future[GetDevEndpointResponse] = service.getDevEndpoint(params).promise().toFuture
    @inline def getDevEndpointsFuture(params: GetDevEndpointsRequest): Future[GetDevEndpointsResponse] = service.getDevEndpoints(params).promise().toFuture
    @inline def getJobBookmarkFuture(params: GetJobBookmarkRequest): Future[GetJobBookmarkResponse] = service.getJobBookmark(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise().toFuture
    @inline def getJobRunFuture(params: GetJobRunRequest): Future[GetJobRunResponse] = service.getJobRun(params).promise().toFuture
    @inline def getJobRunsFuture(params: GetJobRunsRequest): Future[GetJobRunsResponse] = service.getJobRuns(params).promise().toFuture
    @inline def getJobsFuture(params: GetJobsRequest): Future[GetJobsResponse] = service.getJobs(params).promise().toFuture
    @inline def getMLTaskRunFuture(params: GetMLTaskRunRequest): Future[GetMLTaskRunResponse] = service.getMLTaskRun(params).promise().toFuture
    @inline def getMLTaskRunsFuture(params: GetMLTaskRunsRequest): Future[GetMLTaskRunsResponse] = service.getMLTaskRuns(params).promise().toFuture
    @inline def getMLTransformFuture(params: GetMLTransformRequest): Future[GetMLTransformResponse] = service.getMLTransform(params).promise().toFuture
    @inline def getMLTransformsFuture(params: GetMLTransformsRequest): Future[GetMLTransformsResponse] = service.getMLTransforms(params).promise().toFuture
    @inline def getMappingFuture(params: GetMappingRequest): Future[GetMappingResponse] = service.getMapping(params).promise().toFuture
    @inline def getPartitionFuture(params: GetPartitionRequest): Future[GetPartitionResponse] = service.getPartition(params).promise().toFuture
    @inline def getPartitionIndexesFuture(params: GetPartitionIndexesRequest): Future[GetPartitionIndexesResponse] = service.getPartitionIndexes(params).promise().toFuture
    @inline def getPartitionsFuture(params: GetPartitionsRequest): Future[GetPartitionsResponse] = service.getPartitions(params).promise().toFuture
    @inline def getPlanFuture(params: GetPlanRequest): Future[GetPlanResponse] = service.getPlan(params).promise().toFuture
    @inline def getRegistryFuture(params: GetRegistryInput): Future[GetRegistryResponse] = service.getRegistry(params).promise().toFuture
    @inline def getResourcePoliciesFuture(params: GetResourcePoliciesRequest): Future[GetResourcePoliciesResponse] = service.getResourcePolicies(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] = service.getResourcePolicy(params).promise().toFuture
    @inline def getSchemaByDefinitionFuture(params: GetSchemaByDefinitionInput): Future[GetSchemaByDefinitionResponse] = service.getSchemaByDefinition(params).promise().toFuture
    @inline def getSchemaFuture(params: GetSchemaInput): Future[GetSchemaResponse] = service.getSchema(params).promise().toFuture
    @inline def getSchemaVersionFuture(params: GetSchemaVersionInput): Future[GetSchemaVersionResponse] = service.getSchemaVersion(params).promise().toFuture
    @inline def getSchemaVersionsDiffFuture(params: GetSchemaVersionsDiffInput): Future[GetSchemaVersionsDiffResponse] = service.getSchemaVersionsDiff(params).promise().toFuture
    @inline def getSecurityConfigurationFuture(params: GetSecurityConfigurationRequest): Future[GetSecurityConfigurationResponse] = service.getSecurityConfiguration(params).promise().toFuture
    @inline def getSecurityConfigurationsFuture(params: GetSecurityConfigurationsRequest): Future[GetSecurityConfigurationsResponse] = service.getSecurityConfigurations(params).promise().toFuture
    @inline def getTableFuture(params: GetTableRequest): Future[GetTableResponse] = service.getTable(params).promise().toFuture
    @inline def getTableVersionFuture(params: GetTableVersionRequest): Future[GetTableVersionResponse] = service.getTableVersion(params).promise().toFuture
    @inline def getTableVersionsFuture(params: GetTableVersionsRequest): Future[GetTableVersionsResponse] = service.getTableVersions(params).promise().toFuture
    @inline def getTablesFuture(params: GetTablesRequest): Future[GetTablesResponse] = service.getTables(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsRequest): Future[GetTagsResponse] = service.getTags(params).promise().toFuture
    @inline def getTriggerFuture(params: GetTriggerRequest): Future[GetTriggerResponse] = service.getTrigger(params).promise().toFuture
    @inline def getTriggersFuture(params: GetTriggersRequest): Future[GetTriggersResponse] = service.getTriggers(params).promise().toFuture
    @inline def getUserDefinedFunctionFuture(params: GetUserDefinedFunctionRequest): Future[GetUserDefinedFunctionResponse] = service.getUserDefinedFunction(params).promise().toFuture
    @inline def getUserDefinedFunctionsFuture(params: GetUserDefinedFunctionsRequest): Future[GetUserDefinedFunctionsResponse] = service.getUserDefinedFunctions(params).promise().toFuture
    @inline def getWorkflowFuture(params: GetWorkflowRequest): Future[GetWorkflowResponse] = service.getWorkflow(params).promise().toFuture
    @inline def getWorkflowRunFuture(params: GetWorkflowRunRequest): Future[GetWorkflowRunResponse] = service.getWorkflowRun(params).promise().toFuture
    @inline def getWorkflowRunPropertiesFuture(params: GetWorkflowRunPropertiesRequest): Future[GetWorkflowRunPropertiesResponse] = service.getWorkflowRunProperties(params).promise().toFuture
    @inline def getWorkflowRunsFuture(params: GetWorkflowRunsRequest): Future[GetWorkflowRunsResponse] = service.getWorkflowRuns(params).promise().toFuture
    @inline def importCatalogToGlueFuture(params: ImportCatalogToGlueRequest): Future[ImportCatalogToGlueResponse] = service.importCatalogToGlue(params).promise().toFuture
    @inline def listCrawlersFuture(params: ListCrawlersRequest): Future[ListCrawlersResponse] = service.listCrawlers(params).promise().toFuture
    @inline def listDevEndpointsFuture(params: ListDevEndpointsRequest): Future[ListDevEndpointsResponse] = service.listDevEndpoints(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] = service.listJobs(params).promise().toFuture
    @inline def listMLTransformsFuture(params: ListMLTransformsRequest): Future[ListMLTransformsResponse] = service.listMLTransforms(params).promise().toFuture
    @inline def listRegistriesFuture(params: ListRegistriesInput): Future[ListRegistriesResponse] = service.listRegistries(params).promise().toFuture
    @inline def listSchemaVersionsFuture(params: ListSchemaVersionsInput): Future[ListSchemaVersionsResponse] = service.listSchemaVersions(params).promise().toFuture
    @inline def listSchemasFuture(params: ListSchemasInput): Future[ListSchemasResponse] = service.listSchemas(params).promise().toFuture
    @inline def listTriggersFuture(params: ListTriggersRequest): Future[ListTriggersResponse] = service.listTriggers(params).promise().toFuture
    @inline def listWorkflowsFuture(params: ListWorkflowsRequest): Future[ListWorkflowsResponse] = service.listWorkflows(params).promise().toFuture
    @inline def putDataCatalogEncryptionSettingsFuture(params: PutDataCatalogEncryptionSettingsRequest): Future[PutDataCatalogEncryptionSettingsResponse] = service.putDataCatalogEncryptionSettings(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] = service.putResourcePolicy(params).promise().toFuture
    @inline def putSchemaVersionMetadataFuture(params: PutSchemaVersionMetadataInput): Future[PutSchemaVersionMetadataResponse] = service.putSchemaVersionMetadata(params).promise().toFuture
    @inline def putWorkflowRunPropertiesFuture(params: PutWorkflowRunPropertiesRequest): Future[PutWorkflowRunPropertiesResponse] = service.putWorkflowRunProperties(params).promise().toFuture
    @inline def querySchemaVersionMetadataFuture(params: QuerySchemaVersionMetadataInput): Future[QuerySchemaVersionMetadataResponse] = service.querySchemaVersionMetadata(params).promise().toFuture
    @inline def registerSchemaVersionFuture(params: RegisterSchemaVersionInput): Future[RegisterSchemaVersionResponse] = service.registerSchemaVersion(params).promise().toFuture
    @inline def removeSchemaVersionMetadataFuture(params: RemoveSchemaVersionMetadataInput): Future[RemoveSchemaVersionMetadataResponse] = service.removeSchemaVersionMetadata(params).promise().toFuture
    @inline def resetJobBookmarkFuture(params: ResetJobBookmarkRequest): Future[ResetJobBookmarkResponse] = service.resetJobBookmark(params).promise().toFuture
    @inline def resumeWorkflowRunFuture(params: ResumeWorkflowRunRequest): Future[ResumeWorkflowRunResponse] = service.resumeWorkflowRun(params).promise().toFuture
    @inline def searchTablesFuture(params: SearchTablesRequest): Future[SearchTablesResponse] = service.searchTables(params).promise().toFuture
    @inline def startCrawlerFuture(params: StartCrawlerRequest): Future[StartCrawlerResponse] = service.startCrawler(params).promise().toFuture
    @inline def startCrawlerScheduleFuture(params: StartCrawlerScheduleRequest): Future[StartCrawlerScheduleResponse] = service.startCrawlerSchedule(params).promise().toFuture
    @inline def startExportLabelsTaskRunFuture(params: StartExportLabelsTaskRunRequest): Future[StartExportLabelsTaskRunResponse] = service.startExportLabelsTaskRun(params).promise().toFuture
    @inline def startImportLabelsTaskRunFuture(params: StartImportLabelsTaskRunRequest): Future[StartImportLabelsTaskRunResponse] = service.startImportLabelsTaskRun(params).promise().toFuture
    @inline def startJobRunFuture(params: StartJobRunRequest): Future[StartJobRunResponse] = service.startJobRun(params).promise().toFuture
    @inline def startMLEvaluationTaskRunFuture(params: StartMLEvaluationTaskRunRequest): Future[StartMLEvaluationTaskRunResponse] = service.startMLEvaluationTaskRun(params).promise().toFuture
    @inline def startMLLabelingSetGenerationTaskRunFuture(params: StartMLLabelingSetGenerationTaskRunRequest): Future[StartMLLabelingSetGenerationTaskRunResponse] = service.startMLLabelingSetGenerationTaskRun(params).promise().toFuture
    @inline def startTriggerFuture(params: StartTriggerRequest): Future[StartTriggerResponse] = service.startTrigger(params).promise().toFuture
    @inline def startWorkflowRunFuture(params: StartWorkflowRunRequest): Future[StartWorkflowRunResponse] = service.startWorkflowRun(params).promise().toFuture
    @inline def stopCrawlerFuture(params: StopCrawlerRequest): Future[StopCrawlerResponse] = service.stopCrawler(params).promise().toFuture
    @inline def stopCrawlerScheduleFuture(params: StopCrawlerScheduleRequest): Future[StopCrawlerScheduleResponse] = service.stopCrawlerSchedule(params).promise().toFuture
    @inline def stopTriggerFuture(params: StopTriggerRequest): Future[StopTriggerResponse] = service.stopTrigger(params).promise().toFuture
    @inline def stopWorkflowRunFuture(params: StopWorkflowRunRequest): Future[StopWorkflowRunResponse] = service.stopWorkflowRun(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateClassifierFuture(params: UpdateClassifierRequest): Future[UpdateClassifierResponse] = service.updateClassifier(params).promise().toFuture
    @inline def updateColumnStatisticsForPartitionFuture(params: UpdateColumnStatisticsForPartitionRequest): Future[UpdateColumnStatisticsForPartitionResponse] = service.updateColumnStatisticsForPartition(params).promise().toFuture
    @inline def updateColumnStatisticsForTableFuture(params: UpdateColumnStatisticsForTableRequest): Future[UpdateColumnStatisticsForTableResponse] = service.updateColumnStatisticsForTable(params).promise().toFuture
    @inline def updateConnectionFuture(params: UpdateConnectionRequest): Future[UpdateConnectionResponse] = service.updateConnection(params).promise().toFuture
    @inline def updateCrawlerFuture(params: UpdateCrawlerRequest): Future[UpdateCrawlerResponse] = service.updateCrawler(params).promise().toFuture
    @inline def updateCrawlerScheduleFuture(params: UpdateCrawlerScheduleRequest): Future[UpdateCrawlerScheduleResponse] = service.updateCrawlerSchedule(params).promise().toFuture
    @inline def updateDatabaseFuture(params: UpdateDatabaseRequest): Future[UpdateDatabaseResponse] = service.updateDatabase(params).promise().toFuture
    @inline def updateDevEndpointFuture(params: UpdateDevEndpointRequest): Future[UpdateDevEndpointResponse] = service.updateDevEndpoint(params).promise().toFuture
    @inline def updateJobFuture(params: UpdateJobRequest): Future[UpdateJobResponse] = service.updateJob(params).promise().toFuture
    @inline def updateMLTransformFuture(params: UpdateMLTransformRequest): Future[UpdateMLTransformResponse] = service.updateMLTransform(params).promise().toFuture
    @inline def updatePartitionFuture(params: UpdatePartitionRequest): Future[UpdatePartitionResponse] = service.updatePartition(params).promise().toFuture
    @inline def updateRegistryFuture(params: UpdateRegistryInput): Future[UpdateRegistryResponse] = service.updateRegistry(params).promise().toFuture
    @inline def updateSchemaFuture(params: UpdateSchemaInput): Future[UpdateSchemaResponse] = service.updateSchema(params).promise().toFuture
    @inline def updateTableFuture(params: UpdateTableRequest): Future[UpdateTableResponse] = service.updateTable(params).promise().toFuture
    @inline def updateTriggerFuture(params: UpdateTriggerRequest): Future[UpdateTriggerResponse] = service.updateTrigger(params).promise().toFuture
    @inline def updateUserDefinedFunctionFuture(params: UpdateUserDefinedFunctionRequest): Future[UpdateUserDefinedFunctionResponse] = service.updateUserDefinedFunction(params).promise().toFuture
    @inline def updateWorkflowFuture(params: UpdateWorkflowRequest): Future[UpdateWorkflowResponse] = service.updateWorkflow(params).promise().toFuture

  }
}

package glue {
  @js.native
  @JSImport("aws-sdk/clients/glue", JSImport.Namespace, "AWS.Glue")
  class Glue() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCreatePartition(params: BatchCreatePartitionRequest): Request[BatchCreatePartitionResponse] = js.native
    def batchDeleteConnection(params: BatchDeleteConnectionRequest): Request[BatchDeleteConnectionResponse] = js.native
    def batchDeletePartition(params: BatchDeletePartitionRequest): Request[BatchDeletePartitionResponse] = js.native
    def batchDeleteTable(params: BatchDeleteTableRequest): Request[BatchDeleteTableResponse] = js.native
    def batchDeleteTableVersion(params: BatchDeleteTableVersionRequest): Request[BatchDeleteTableVersionResponse] = js.native
    def batchGetCrawlers(params: BatchGetCrawlersRequest): Request[BatchGetCrawlersResponse] = js.native
    def batchGetDevEndpoints(params: BatchGetDevEndpointsRequest): Request[BatchGetDevEndpointsResponse] = js.native
    def batchGetJobs(params: BatchGetJobsRequest): Request[BatchGetJobsResponse] = js.native
    def batchGetPartition(params: BatchGetPartitionRequest): Request[BatchGetPartitionResponse] = js.native
    def batchGetTriggers(params: BatchGetTriggersRequest): Request[BatchGetTriggersResponse] = js.native
    def batchGetWorkflows(params: BatchGetWorkflowsRequest): Request[BatchGetWorkflowsResponse] = js.native
    def batchStopJobRun(params: BatchStopJobRunRequest): Request[BatchStopJobRunResponse] = js.native
    def batchUpdatePartition(params: BatchUpdatePartitionRequest): Request[BatchUpdatePartitionResponse] = js.native
    def cancelMLTaskRun(params: CancelMLTaskRunRequest): Request[CancelMLTaskRunResponse] = js.native
    def checkSchemaVersionValidity(params: CheckSchemaVersionValidityInput): Request[CheckSchemaVersionValidityResponse] = js.native
    def createClassifier(params: CreateClassifierRequest): Request[CreateClassifierResponse] = js.native
    def createConnection(params: CreateConnectionRequest): Request[CreateConnectionResponse] = js.native
    def createCrawler(params: CreateCrawlerRequest): Request[CreateCrawlerResponse] = js.native
    def createDatabase(params: CreateDatabaseRequest): Request[CreateDatabaseResponse] = js.native
    def createDevEndpoint(params: CreateDevEndpointRequest): Request[CreateDevEndpointResponse] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createMLTransform(params: CreateMLTransformRequest): Request[CreateMLTransformResponse] = js.native
    def createPartition(params: CreatePartitionRequest): Request[CreatePartitionResponse] = js.native
    def createPartitionIndex(params: CreatePartitionIndexRequest): Request[CreatePartitionIndexResponse] = js.native
    def createRegistry(params: CreateRegistryInput): Request[CreateRegistryResponse] = js.native
    def createSchema(params: CreateSchemaInput): Request[CreateSchemaResponse] = js.native
    def createScript(params: CreateScriptRequest): Request[CreateScriptResponse] = js.native
    def createSecurityConfiguration(params: CreateSecurityConfigurationRequest): Request[CreateSecurityConfigurationResponse] = js.native
    def createTable(params: CreateTableRequest): Request[CreateTableResponse] = js.native
    def createTrigger(params: CreateTriggerRequest): Request[CreateTriggerResponse] = js.native
    def createUserDefinedFunction(params: CreateUserDefinedFunctionRequest): Request[CreateUserDefinedFunctionResponse] = js.native
    def createWorkflow(params: CreateWorkflowRequest): Request[CreateWorkflowResponse] = js.native
    def deleteClassifier(params: DeleteClassifierRequest): Request[DeleteClassifierResponse] = js.native
    def deleteColumnStatisticsForPartition(params: DeleteColumnStatisticsForPartitionRequest): Request[DeleteColumnStatisticsForPartitionResponse] = js.native
    def deleteColumnStatisticsForTable(params: DeleteColumnStatisticsForTableRequest): Request[DeleteColumnStatisticsForTableResponse] = js.native
    def deleteConnection(params: DeleteConnectionRequest): Request[DeleteConnectionResponse] = js.native
    def deleteCrawler(params: DeleteCrawlerRequest): Request[DeleteCrawlerResponse] = js.native
    def deleteDatabase(params: DeleteDatabaseRequest): Request[DeleteDatabaseResponse] = js.native
    def deleteDevEndpoint(params: DeleteDevEndpointRequest): Request[DeleteDevEndpointResponse] = js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse] = js.native
    def deleteMLTransform(params: DeleteMLTransformRequest): Request[DeleteMLTransformResponse] = js.native
    def deletePartition(params: DeletePartitionRequest): Request[DeletePartitionResponse] = js.native
    def deletePartitionIndex(params: DeletePartitionIndexRequest): Request[DeletePartitionIndexResponse] = js.native
    def deleteRegistry(params: DeleteRegistryInput): Request[DeleteRegistryResponse] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse] = js.native
    def deleteSchema(params: DeleteSchemaInput): Request[DeleteSchemaResponse] = js.native
    def deleteSchemaVersions(params: DeleteSchemaVersionsInput): Request[DeleteSchemaVersionsResponse] = js.native
    def deleteSecurityConfiguration(params: DeleteSecurityConfigurationRequest): Request[DeleteSecurityConfigurationResponse] = js.native
    def deleteTable(params: DeleteTableRequest): Request[DeleteTableResponse] = js.native
    def deleteTableVersion(params: DeleteTableVersionRequest): Request[DeleteTableVersionResponse] = js.native
    def deleteTrigger(params: DeleteTriggerRequest): Request[DeleteTriggerResponse] = js.native
    def deleteUserDefinedFunction(params: DeleteUserDefinedFunctionRequest): Request[DeleteUserDefinedFunctionResponse] = js.native
    def deleteWorkflow(params: DeleteWorkflowRequest): Request[DeleteWorkflowResponse] = js.native
    def getCatalogImportStatus(params: GetCatalogImportStatusRequest): Request[GetCatalogImportStatusResponse] = js.native
    def getClassifier(params: GetClassifierRequest): Request[GetClassifierResponse] = js.native
    def getClassifiers(params: GetClassifiersRequest): Request[GetClassifiersResponse] = js.native
    def getColumnStatisticsForPartition(params: GetColumnStatisticsForPartitionRequest): Request[GetColumnStatisticsForPartitionResponse] = js.native
    def getColumnStatisticsForTable(params: GetColumnStatisticsForTableRequest): Request[GetColumnStatisticsForTableResponse] = js.native
    def getConnection(params: GetConnectionRequest): Request[GetConnectionResponse] = js.native
    def getConnections(params: GetConnectionsRequest): Request[GetConnectionsResponse] = js.native
    def getCrawler(params: GetCrawlerRequest): Request[GetCrawlerResponse] = js.native
    def getCrawlerMetrics(params: GetCrawlerMetricsRequest): Request[GetCrawlerMetricsResponse] = js.native
    def getCrawlers(params: GetCrawlersRequest): Request[GetCrawlersResponse] = js.native
    def getDataCatalogEncryptionSettings(params: GetDataCatalogEncryptionSettingsRequest): Request[GetDataCatalogEncryptionSettingsResponse] = js.native
    def getDatabase(params: GetDatabaseRequest): Request[GetDatabaseResponse] = js.native
    def getDatabases(params: GetDatabasesRequest): Request[GetDatabasesResponse] = js.native
    def getDataflowGraph(params: GetDataflowGraphRequest): Request[GetDataflowGraphResponse] = js.native
    def getDevEndpoint(params: GetDevEndpointRequest): Request[GetDevEndpointResponse] = js.native
    def getDevEndpoints(params: GetDevEndpointsRequest): Request[GetDevEndpointsResponse] = js.native
    def getJob(params: GetJobRequest): Request[GetJobResponse] = js.native
    def getJobBookmark(params: GetJobBookmarkRequest): Request[GetJobBookmarkResponse] = js.native
    def getJobRun(params: GetJobRunRequest): Request[GetJobRunResponse] = js.native
    def getJobRuns(params: GetJobRunsRequest): Request[GetJobRunsResponse] = js.native
    def getJobs(params: GetJobsRequest): Request[GetJobsResponse] = js.native
    def getMLTaskRun(params: GetMLTaskRunRequest): Request[GetMLTaskRunResponse] = js.native
    def getMLTaskRuns(params: GetMLTaskRunsRequest): Request[GetMLTaskRunsResponse] = js.native
    def getMLTransform(params: GetMLTransformRequest): Request[GetMLTransformResponse] = js.native
    def getMLTransforms(params: GetMLTransformsRequest): Request[GetMLTransformsResponse] = js.native
    def getMapping(params: GetMappingRequest): Request[GetMappingResponse] = js.native
    def getPartition(params: GetPartitionRequest): Request[GetPartitionResponse] = js.native
    def getPartitionIndexes(params: GetPartitionIndexesRequest): Request[GetPartitionIndexesResponse] = js.native
    def getPartitions(params: GetPartitionsRequest): Request[GetPartitionsResponse] = js.native
    def getPlan(params: GetPlanRequest): Request[GetPlanResponse] = js.native
    def getRegistry(params: GetRegistryInput): Request[GetRegistryResponse] = js.native
    def getResourcePolicies(params: GetResourcePoliciesRequest): Request[GetResourcePoliciesResponse] = js.native
    def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse] = js.native
    def getSchema(params: GetSchemaInput): Request[GetSchemaResponse] = js.native
    def getSchemaByDefinition(params: GetSchemaByDefinitionInput): Request[GetSchemaByDefinitionResponse] = js.native
    def getSchemaVersion(params: GetSchemaVersionInput): Request[GetSchemaVersionResponse] = js.native
    def getSchemaVersionsDiff(params: GetSchemaVersionsDiffInput): Request[GetSchemaVersionsDiffResponse] = js.native
    def getSecurityConfiguration(params: GetSecurityConfigurationRequest): Request[GetSecurityConfigurationResponse] = js.native
    def getSecurityConfigurations(params: GetSecurityConfigurationsRequest): Request[GetSecurityConfigurationsResponse] = js.native
    def getTable(params: GetTableRequest): Request[GetTableResponse] = js.native
    def getTableVersion(params: GetTableVersionRequest): Request[GetTableVersionResponse] = js.native
    def getTableVersions(params: GetTableVersionsRequest): Request[GetTableVersionsResponse] = js.native
    def getTables(params: GetTablesRequest): Request[GetTablesResponse] = js.native
    def getTags(params: GetTagsRequest): Request[GetTagsResponse] = js.native
    def getTrigger(params: GetTriggerRequest): Request[GetTriggerResponse] = js.native
    def getTriggers(params: GetTriggersRequest): Request[GetTriggersResponse] = js.native
    def getUserDefinedFunction(params: GetUserDefinedFunctionRequest): Request[GetUserDefinedFunctionResponse] = js.native
    def getUserDefinedFunctions(params: GetUserDefinedFunctionsRequest): Request[GetUserDefinedFunctionsResponse] = js.native
    def getWorkflow(params: GetWorkflowRequest): Request[GetWorkflowResponse] = js.native
    def getWorkflowRun(params: GetWorkflowRunRequest): Request[GetWorkflowRunResponse] = js.native
    def getWorkflowRunProperties(params: GetWorkflowRunPropertiesRequest): Request[GetWorkflowRunPropertiesResponse] = js.native
    def getWorkflowRuns(params: GetWorkflowRunsRequest): Request[GetWorkflowRunsResponse] = js.native
    def importCatalogToGlue(params: ImportCatalogToGlueRequest): Request[ImportCatalogToGlueResponse] = js.native
    def listCrawlers(params: ListCrawlersRequest): Request[ListCrawlersResponse] = js.native
    def listDevEndpoints(params: ListDevEndpointsRequest): Request[ListDevEndpointsResponse] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse] = js.native
    def listMLTransforms(params: ListMLTransformsRequest): Request[ListMLTransformsResponse] = js.native
    def listRegistries(params: ListRegistriesInput): Request[ListRegistriesResponse] = js.native
    def listSchemaVersions(params: ListSchemaVersionsInput): Request[ListSchemaVersionsResponse] = js.native
    def listSchemas(params: ListSchemasInput): Request[ListSchemasResponse] = js.native
    def listTriggers(params: ListTriggersRequest): Request[ListTriggersResponse] = js.native
    def listWorkflows(params: ListWorkflowsRequest): Request[ListWorkflowsResponse] = js.native
    def putDataCatalogEncryptionSettings(params: PutDataCatalogEncryptionSettingsRequest): Request[PutDataCatalogEncryptionSettingsResponse] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def putSchemaVersionMetadata(params: PutSchemaVersionMetadataInput): Request[PutSchemaVersionMetadataResponse] = js.native
    def putWorkflowRunProperties(params: PutWorkflowRunPropertiesRequest): Request[PutWorkflowRunPropertiesResponse] = js.native
    def querySchemaVersionMetadata(params: QuerySchemaVersionMetadataInput): Request[QuerySchemaVersionMetadataResponse] = js.native
    def registerSchemaVersion(params: RegisterSchemaVersionInput): Request[RegisterSchemaVersionResponse] = js.native
    def removeSchemaVersionMetadata(params: RemoveSchemaVersionMetadataInput): Request[RemoveSchemaVersionMetadataResponse] = js.native
    def resetJobBookmark(params: ResetJobBookmarkRequest): Request[ResetJobBookmarkResponse] = js.native
    def resumeWorkflowRun(params: ResumeWorkflowRunRequest): Request[ResumeWorkflowRunResponse] = js.native
    def searchTables(params: SearchTablesRequest): Request[SearchTablesResponse] = js.native
    def startCrawler(params: StartCrawlerRequest): Request[StartCrawlerResponse] = js.native
    def startCrawlerSchedule(params: StartCrawlerScheduleRequest): Request[StartCrawlerScheduleResponse] = js.native
    def startExportLabelsTaskRun(params: StartExportLabelsTaskRunRequest): Request[StartExportLabelsTaskRunResponse] = js.native
    def startImportLabelsTaskRun(params: StartImportLabelsTaskRunRequest): Request[StartImportLabelsTaskRunResponse] = js.native
    def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse] = js.native
    def startMLEvaluationTaskRun(params: StartMLEvaluationTaskRunRequest): Request[StartMLEvaluationTaskRunResponse] = js.native
    def startMLLabelingSetGenerationTaskRun(params: StartMLLabelingSetGenerationTaskRunRequest): Request[StartMLLabelingSetGenerationTaskRunResponse] = js.native
    def startTrigger(params: StartTriggerRequest): Request[StartTriggerResponse] = js.native
    def startWorkflowRun(params: StartWorkflowRunRequest): Request[StartWorkflowRunResponse] = js.native
    def stopCrawler(params: StopCrawlerRequest): Request[StopCrawlerResponse] = js.native
    def stopCrawlerSchedule(params: StopCrawlerScheduleRequest): Request[StopCrawlerScheduleResponse] = js.native
    def stopTrigger(params: StopTriggerRequest): Request[StopTriggerResponse] = js.native
    def stopWorkflowRun(params: StopWorkflowRunRequest): Request[StopWorkflowRunResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateClassifier(params: UpdateClassifierRequest): Request[UpdateClassifierResponse] = js.native
    def updateColumnStatisticsForPartition(params: UpdateColumnStatisticsForPartitionRequest): Request[UpdateColumnStatisticsForPartitionResponse] = js.native
    def updateColumnStatisticsForTable(params: UpdateColumnStatisticsForTableRequest): Request[UpdateColumnStatisticsForTableResponse] = js.native
    def updateConnection(params: UpdateConnectionRequest): Request[UpdateConnectionResponse] = js.native
    def updateCrawler(params: UpdateCrawlerRequest): Request[UpdateCrawlerResponse] = js.native
    def updateCrawlerSchedule(params: UpdateCrawlerScheduleRequest): Request[UpdateCrawlerScheduleResponse] = js.native
    def updateDatabase(params: UpdateDatabaseRequest): Request[UpdateDatabaseResponse] = js.native
    def updateDevEndpoint(params: UpdateDevEndpointRequest): Request[UpdateDevEndpointResponse] = js.native
    def updateJob(params: UpdateJobRequest): Request[UpdateJobResponse] = js.native
    def updateMLTransform(params: UpdateMLTransformRequest): Request[UpdateMLTransformResponse] = js.native
    def updatePartition(params: UpdatePartitionRequest): Request[UpdatePartitionResponse] = js.native
    def updateRegistry(params: UpdateRegistryInput): Request[UpdateRegistryResponse] = js.native
    def updateSchema(params: UpdateSchemaInput): Request[UpdateSchemaResponse] = js.native
    def updateTable(params: UpdateTableRequest): Request[UpdateTableResponse] = js.native
    def updateTrigger(params: UpdateTriggerRequest): Request[UpdateTriggerResponse] = js.native
    def updateUserDefinedFunction(params: UpdateUserDefinedFunctionRequest): Request[UpdateUserDefinedFunctionResponse] = js.native
    def updateWorkflow(params: UpdateWorkflowRequest): Request[UpdateWorkflowResponse] = js.native
  }

  /** Defines an action to be initiated by a trigger.
    */
  @js.native
  trait Action extends js.Object {
    var Arguments: js.UndefOr[GenericMap]
    var CrawlerName: js.UndefOr[NameString]
    var JobName: js.UndefOr[NameString]
    var NotificationProperty: js.UndefOr[NotificationProperty]
    var SecurityConfiguration: js.UndefOr[NameString]
    var Timeout: js.UndefOr[Timeout]
  }

  object Action {
    @inline
    def apply(
        Arguments: js.UndefOr[GenericMap] = js.undefined,
        CrawlerName: js.UndefOr[NameString] = js.undefined,
        JobName: js.UndefOr[NameString] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      Arguments.foreach(__v => __obj.updateDynamic("Arguments")(__v.asInstanceOf[js.Any]))
      CrawlerName.foreach(__v => __obj.updateDynamic("CrawlerName")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.updateDynamic("NotificationProperty")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  /** A list of errors that can occur when registering partition indexes for an existing table.
    * These errors give the details about why an index registration failed and provide a limited number of partitions in the response, so that you can fix the partitions at fault and try registering the index again. The most common set of errors that can occur are categorized as follows:
    * * EncryptedPartitionError: The partitions are encrypted.
    * * InvalidPartitionTypeDataError: The partition value doesn't match the data type for that partition column.
    * * MissingPartitionValueError: The partitions are encrypted.
    * * UnsupportedPartitionCharacterError: Characters inside the partition value are not supported. For example: U+0000 , U+0001, U+0002.
    * * InternalError: Any error which does not belong to other error codes.
    */
  @js.native
  trait BackfillError extends js.Object {
    var Code: js.UndefOr[BackfillErrorCode]
    var Partitions: js.UndefOr[BackfillErroredPartitionsList]
  }

  object BackfillError {
    @inline
    def apply(
        Code: js.UndefOr[BackfillErrorCode] = js.undefined,
        Partitions: js.UndefOr[BackfillErroredPartitionsList] = js.undefined
    ): BackfillError = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Partitions.foreach(__v => __obj.updateDynamic("Partitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackfillError]
    }
  }

  @js.native
  sealed trait BackfillErrorCode extends js.Any
  object BackfillErrorCode {
    val ENCRYPTED_PARTITION_ERROR = "ENCRYPTED_PARTITION_ERROR".asInstanceOf[BackfillErrorCode]
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[BackfillErrorCode]
    val INVALID_PARTITION_TYPE_DATA_ERROR = "INVALID_PARTITION_TYPE_DATA_ERROR".asInstanceOf[BackfillErrorCode]
    val MISSING_PARTITION_VALUE_ERROR = "MISSING_PARTITION_VALUE_ERROR".asInstanceOf[BackfillErrorCode]
    val UNSUPPORTED_PARTITION_CHARACTER_ERROR = "UNSUPPORTED_PARTITION_CHARACTER_ERROR".asInstanceOf[BackfillErrorCode]

    @inline def values = js.Array(ENCRYPTED_PARTITION_ERROR, INTERNAL_ERROR, INVALID_PARTITION_TYPE_DATA_ERROR, MISSING_PARTITION_VALUE_ERROR, UNSUPPORTED_PARTITION_CHARACTER_ERROR)
  }

  @js.native
  trait BatchCreatePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionInputList: PartitionInputList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchCreatePartitionRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        PartitionInputList: PartitionInputList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchCreatePartitionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionInputList" -> PartitionInputList.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreatePartitionRequest]
    }
  }

  @js.native
  trait BatchCreatePartitionResponse extends js.Object {
    var Errors: js.UndefOr[PartitionErrors]
  }

  object BatchCreatePartitionResponse {
    @inline
    def apply(
        Errors: js.UndefOr[PartitionErrors] = js.undefined
    ): BatchCreatePartitionResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreatePartitionResponse]
    }
  }

  @js.native
  trait BatchDeleteConnectionRequest extends js.Object {
    var ConnectionNameList: DeleteConnectionNameList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchDeleteConnectionRequest {
    @inline
    def apply(
        ConnectionNameList: DeleteConnectionNameList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchDeleteConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionNameList" -> ConnectionNameList.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteConnectionRequest]
    }
  }

  @js.native
  trait BatchDeleteConnectionResponse extends js.Object {
    var Errors: js.UndefOr[ErrorByName]
    var Succeeded: js.UndefOr[NameStringList]
  }

  object BatchDeleteConnectionResponse {
    @inline
    def apply(
        Errors: js.UndefOr[ErrorByName] = js.undefined,
        Succeeded: js.UndefOr[NameStringList] = js.undefined
    ): BatchDeleteConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Succeeded.foreach(__v => __obj.updateDynamic("Succeeded")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        PartitionsToDelete: BatchDeletePartitionValueList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchDeletePartitionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionsToDelete" -> PartitionsToDelete.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeletePartitionRequest]
    }
  }

  @js.native
  trait BatchDeletePartitionResponse extends js.Object {
    var Errors: js.UndefOr[PartitionErrors]
  }

  object BatchDeletePartitionResponse {
    @inline
    def apply(
        Errors: js.UndefOr[PartitionErrors] = js.undefined
    ): BatchDeletePartitionResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        TablesToDelete: BatchDeleteTableNameList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchDeleteTableRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TablesToDelete" -> TablesToDelete.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteTableRequest]
    }
  }

  @js.native
  trait BatchDeleteTableResponse extends js.Object {
    var Errors: js.UndefOr[TableErrors]
  }

  object BatchDeleteTableResponse {
    @inline
    def apply(
        Errors: js.UndefOr[TableErrors] = js.undefined
    ): BatchDeleteTableResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        VersionIds: BatchDeleteTableVersionList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchDeleteTableVersionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "VersionIds" -> VersionIds.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteTableVersionRequest]
    }
  }

  @js.native
  trait BatchDeleteTableVersionResponse extends js.Object {
    var Errors: js.UndefOr[TableVersionErrors]
  }

  object BatchDeleteTableVersionResponse {
    @inline
    def apply(
        Errors: js.UndefOr[TableVersionErrors] = js.undefined
    ): BatchDeleteTableVersionResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteTableVersionResponse]
    }
  }

  @js.native
  trait BatchGetCrawlersRequest extends js.Object {
    var CrawlerNames: CrawlerNameList
  }

  object BatchGetCrawlersRequest {
    @inline
    def apply(
        CrawlerNames: CrawlerNameList
    ): BatchGetCrawlersRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Crawlers: js.UndefOr[CrawlerList] = js.undefined,
        CrawlersNotFound: js.UndefOr[CrawlerNameList] = js.undefined
    ): BatchGetCrawlersResponse = {
      val __obj = js.Dynamic.literal()
      Crawlers.foreach(__v => __obj.updateDynamic("Crawlers")(__v.asInstanceOf[js.Any]))
      CrawlersNotFound.foreach(__v => __obj.updateDynamic("CrawlersNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetCrawlersResponse]
    }
  }

  @js.native
  trait BatchGetDevEndpointsRequest extends js.Object {
    var DevEndpointNames: DevEndpointNames
  }

  object BatchGetDevEndpointsRequest {
    @inline
    def apply(
        DevEndpointNames: DevEndpointNames
    ): BatchGetDevEndpointsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DevEndpoints: js.UndefOr[DevEndpointList] = js.undefined,
        DevEndpointsNotFound: js.UndefOr[DevEndpointNames] = js.undefined
    ): BatchGetDevEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      DevEndpoints.foreach(__v => __obj.updateDynamic("DevEndpoints")(__v.asInstanceOf[js.Any]))
      DevEndpointsNotFound.foreach(__v => __obj.updateDynamic("DevEndpointsNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetDevEndpointsResponse]
    }
  }

  @js.native
  trait BatchGetJobsRequest extends js.Object {
    var JobNames: JobNameList
  }

  object BatchGetJobsRequest {
    @inline
    def apply(
        JobNames: JobNameList
    ): BatchGetJobsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Jobs: js.UndefOr[JobList] = js.undefined,
        JobsNotFound: js.UndefOr[JobNameList] = js.undefined
    ): BatchGetJobsResponse = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      JobsNotFound.foreach(__v => __obj.updateDynamic("JobsNotFound")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        PartitionsToGet: BatchGetPartitionValueList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchGetPartitionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionsToGet" -> PartitionsToGet.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetPartitionRequest]
    }
  }

  @js.native
  trait BatchGetPartitionResponse extends js.Object {
    var Partitions: js.UndefOr[PartitionList]
    var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList]
  }

  object BatchGetPartitionResponse {
    @inline
    def apply(
        Partitions: js.UndefOr[PartitionList] = js.undefined,
        UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList] = js.undefined
    ): BatchGetPartitionResponse = {
      val __obj = js.Dynamic.literal()
      Partitions.foreach(__v => __obj.updateDynamic("Partitions")(__v.asInstanceOf[js.Any]))
      UnprocessedKeys.foreach(__v => __obj.updateDynamic("UnprocessedKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetPartitionResponse]
    }
  }

  @js.native
  trait BatchGetTriggersRequest extends js.Object {
    var TriggerNames: TriggerNameList
  }

  object BatchGetTriggersRequest {
    @inline
    def apply(
        TriggerNames: TriggerNameList
    ): BatchGetTriggersRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Triggers: js.UndefOr[TriggerList] = js.undefined,
        TriggersNotFound: js.UndefOr[TriggerNameList] = js.undefined
    ): BatchGetTriggersResponse = {
      val __obj = js.Dynamic.literal()
      Triggers.foreach(__v => __obj.updateDynamic("Triggers")(__v.asInstanceOf[js.Any]))
      TriggersNotFound.foreach(__v => __obj.updateDynamic("TriggersNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetTriggersResponse]
    }
  }

  @js.native
  trait BatchGetWorkflowsRequest extends js.Object {
    var Names: WorkflowNames
    var IncludeGraph: js.UndefOr[NullableBoolean]
  }

  object BatchGetWorkflowsRequest {
    @inline
    def apply(
        Names: WorkflowNames,
        IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
    ): BatchGetWorkflowsRequest = {
      val __obj = js.Dynamic.literal(
        "Names" -> Names.asInstanceOf[js.Any]
      )

      IncludeGraph.foreach(__v => __obj.updateDynamic("IncludeGraph")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetWorkflowsRequest]
    }
  }

  @js.native
  trait BatchGetWorkflowsResponse extends js.Object {
    var MissingWorkflows: js.UndefOr[WorkflowNames]
    var Workflows: js.UndefOr[Workflows]
  }

  object BatchGetWorkflowsResponse {
    @inline
    def apply(
        MissingWorkflows: js.UndefOr[WorkflowNames] = js.undefined,
        Workflows: js.UndefOr[Workflows] = js.undefined
    ): BatchGetWorkflowsResponse = {
      val __obj = js.Dynamic.literal()
      MissingWorkflows.foreach(__v => __obj.updateDynamic("MissingWorkflows")(__v.asInstanceOf[js.Any]))
      Workflows.foreach(__v => __obj.updateDynamic("Workflows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetWorkflowsResponse]
    }
  }

  /** Records an error that occurred when attempting to stop a specified job run.
    */
  @js.native
  trait BatchStopJobRunError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var JobName: js.UndefOr[NameString]
    var JobRunId: js.UndefOr[IdString]
  }

  object BatchStopJobRunError {
    @inline
    def apply(
        ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined,
        JobName: js.UndefOr[NameString] = js.undefined,
        JobRunId: js.UndefOr[IdString] = js.undefined
    ): BatchStopJobRunError = {
      val __obj = js.Dynamic.literal()
      ErrorDetail.foreach(__v => __obj.updateDynamic("ErrorDetail")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobRunId.foreach(__v => __obj.updateDynamic("JobRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchStopJobRunError]
    }
  }

  @js.native
  trait BatchStopJobRunRequest extends js.Object {
    var JobName: NameString
    var JobRunIds: BatchStopJobRunJobRunIdList
  }

  object BatchStopJobRunRequest {
    @inline
    def apply(
        JobName: NameString,
        JobRunIds: BatchStopJobRunJobRunIdList
    ): BatchStopJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "JobName" -> JobName.asInstanceOf[js.Any],
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
    @inline
    def apply(
        Errors: js.UndefOr[BatchStopJobRunErrorList] = js.undefined,
        SuccessfulSubmissions: js.UndefOr[BatchStopJobRunSuccessfulSubmissionList] = js.undefined
    ): BatchStopJobRunResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      SuccessfulSubmissions.foreach(__v => __obj.updateDynamic("SuccessfulSubmissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchStopJobRunResponse]
    }
  }

  /** Records a successful request to stop a specified <code>JobRun</code>.
    */
  @js.native
  trait BatchStopJobRunSuccessfulSubmission extends js.Object {
    var JobName: js.UndefOr[NameString]
    var JobRunId: js.UndefOr[IdString]
  }

  object BatchStopJobRunSuccessfulSubmission {
    @inline
    def apply(
        JobName: js.UndefOr[NameString] = js.undefined,
        JobRunId: js.UndefOr[IdString] = js.undefined
    ): BatchStopJobRunSuccessfulSubmission = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobRunId.foreach(__v => __obj.updateDynamic("JobRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchStopJobRunSuccessfulSubmission]
    }
  }

  /** Contains information about a batch update partition error.
    */
  @js.native
  trait BatchUpdatePartitionFailureEntry extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var PartitionValueList: js.UndefOr[BoundedPartitionValueList]
  }

  object BatchUpdatePartitionFailureEntry {
    @inline
    def apply(
        ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined,
        PartitionValueList: js.UndefOr[BoundedPartitionValueList] = js.undefined
    ): BatchUpdatePartitionFailureEntry = {
      val __obj = js.Dynamic.literal()
      ErrorDetail.foreach(__v => __obj.updateDynamic("ErrorDetail")(__v.asInstanceOf[js.Any]))
      PartitionValueList.foreach(__v => __obj.updateDynamic("PartitionValueList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdatePartitionFailureEntry]
    }
  }

  @js.native
  trait BatchUpdatePartitionRequest extends js.Object {
    var DatabaseName: NameString
    var Entries: BatchUpdatePartitionRequestEntryList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchUpdatePartitionRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        Entries: BatchUpdatePartitionRequestEntryList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchUpdatePartitionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Entries" -> Entries.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdatePartitionRequest]
    }
  }

  /** A structure that contains the values and structure used to update a partition.
    */
  @js.native
  trait BatchUpdatePartitionRequestEntry extends js.Object {
    var PartitionInput: PartitionInput
    var PartitionValueList: BoundedPartitionValueList
  }

  object BatchUpdatePartitionRequestEntry {
    @inline
    def apply(
        PartitionInput: PartitionInput,
        PartitionValueList: BoundedPartitionValueList
    ): BatchUpdatePartitionRequestEntry = {
      val __obj = js.Dynamic.literal(
        "PartitionInput" -> PartitionInput.asInstanceOf[js.Any],
        "PartitionValueList" -> PartitionValueList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdatePartitionRequestEntry]
    }
  }

  @js.native
  trait BatchUpdatePartitionResponse extends js.Object {
    var Errors: js.UndefOr[BatchUpdatePartitionFailureList]
  }

  object BatchUpdatePartitionResponse {
    @inline
    def apply(
        Errors: js.UndefOr[BatchUpdatePartitionFailureList] = js.undefined
    ): BatchUpdatePartitionResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdatePartitionResponse]
    }
  }

  /** Defines column statistics supported for bit sequence data values.
    */
  @js.native
  trait BinaryColumnStatisticsData extends js.Object {
    var AverageLength: NonNegativeDouble
    var MaximumLength: NonNegativeLong
    var NumberOfNulls: NonNegativeLong
  }

  object BinaryColumnStatisticsData {
    @inline
    def apply(
        AverageLength: NonNegativeDouble,
        MaximumLength: NonNegativeLong,
        NumberOfNulls: NonNegativeLong
    ): BinaryColumnStatisticsData = {
      val __obj = js.Dynamic.literal(
        "AverageLength" -> AverageLength.asInstanceOf[js.Any],
        "MaximumLength" -> MaximumLength.asInstanceOf[js.Any],
        "NumberOfNulls" -> NumberOfNulls.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BinaryColumnStatisticsData]
    }
  }

  /** Defines column statistics supported for Boolean data columns.
    */
  @js.native
  trait BooleanColumnStatisticsData extends js.Object {
    var NumberOfFalses: NonNegativeLong
    var NumberOfNulls: NonNegativeLong
    var NumberOfTrues: NonNegativeLong
  }

  object BooleanColumnStatisticsData {
    @inline
    def apply(
        NumberOfFalses: NonNegativeLong,
        NumberOfNulls: NonNegativeLong,
        NumberOfTrues: NonNegativeLong
    ): BooleanColumnStatisticsData = {
      val __obj = js.Dynamic.literal(
        "NumberOfFalses" -> NumberOfFalses.asInstanceOf[js.Any],
        "NumberOfNulls" -> NumberOfNulls.asInstanceOf[js.Any],
        "NumberOfTrues" -> NumberOfTrues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BooleanColumnStatisticsData]
    }
  }

  @js.native
  trait CancelMLTaskRunRequest extends js.Object {
    var TaskRunId: HashString
    var TransformId: HashString
  }

  object CancelMLTaskRunRequest {
    @inline
    def apply(
        TaskRunId: HashString,
        TransformId: HashString
    ): CancelMLTaskRunRequest = {
      val __obj = js.Dynamic.literal(
        "TaskRunId" -> TaskRunId.asInstanceOf[js.Any],
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelMLTaskRunRequest]
    }
  }

  @js.native
  trait CancelMLTaskRunResponse extends js.Object {
    var Status: js.UndefOr[TaskStatusType]
    var TaskRunId: js.UndefOr[HashString]
    var TransformId: js.UndefOr[HashString]
  }

  object CancelMLTaskRunResponse {
    @inline
    def apply(
        Status: js.UndefOr[TaskStatusType] = js.undefined,
        TaskRunId: js.UndefOr[HashString] = js.undefined,
        TransformId: js.UndefOr[HashString] = js.undefined
    ): CancelMLTaskRunResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskRunId.foreach(__v => __obj.updateDynamic("TaskRunId")(__v.asInstanceOf[js.Any]))
      TransformId.foreach(__v => __obj.updateDynamic("TransformId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelMLTaskRunResponse]
    }
  }

  @js.native
  sealed trait CatalogEncryptionMode extends js.Any
  object CatalogEncryptionMode {
    val DISABLED = "DISABLED".asInstanceOf[CatalogEncryptionMode]
    val `SSE-KMS` = "SSE-KMS".asInstanceOf[CatalogEncryptionMode]

    @inline def values = js.Array(DISABLED, `SSE-KMS`)
  }

  /** Specifies a table definition in the AWS Glue Data Catalog.
    */
  @js.native
  trait CatalogEntry extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
  }

  object CatalogEntry {
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString
    ): CatalogEntry = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CatalogEntry]
    }
  }

  /** A structure containing migration status information.
    */
  @js.native
  trait CatalogImportStatus extends js.Object {
    var ImportCompleted: js.UndefOr[Boolean]
    var ImportTime: js.UndefOr[Timestamp]
    var ImportedBy: js.UndefOr[NameString]
  }

  object CatalogImportStatus {
    @inline
    def apply(
        ImportCompleted: js.UndefOr[Boolean] = js.undefined,
        ImportTime: js.UndefOr[Timestamp] = js.undefined,
        ImportedBy: js.UndefOr[NameString] = js.undefined
    ): CatalogImportStatus = {
      val __obj = js.Dynamic.literal()
      ImportCompleted.foreach(__v => __obj.updateDynamic("ImportCompleted")(__v.asInstanceOf[js.Any]))
      ImportTime.foreach(__v => __obj.updateDynamic("ImportTime")(__v.asInstanceOf[js.Any]))
      ImportedBy.foreach(__v => __obj.updateDynamic("ImportedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CatalogImportStatus]
    }
  }

  /** Specifies an AWS Glue Data Catalog target.
    */
  @js.native
  trait CatalogTarget extends js.Object {
    var DatabaseName: NameString
    var Tables: CatalogTablesList
  }

  object CatalogTarget {
    @inline
    def apply(
        DatabaseName: NameString,
        Tables: CatalogTablesList
    ): CatalogTarget = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Tables" -> Tables.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CatalogTarget]
    }
  }

  @js.native
  trait CheckSchemaVersionValidityInput extends js.Object {
    var DataFormat: DataFormat
    var SchemaDefinition: SchemaDefinitionString
  }

  object CheckSchemaVersionValidityInput {
    @inline
    def apply(
        DataFormat: DataFormat,
        SchemaDefinition: SchemaDefinitionString
    ): CheckSchemaVersionValidityInput = {
      val __obj = js.Dynamic.literal(
        "DataFormat" -> DataFormat.asInstanceOf[js.Any],
        "SchemaDefinition" -> SchemaDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CheckSchemaVersionValidityInput]
    }
  }

  @js.native
  trait CheckSchemaVersionValidityResponse extends js.Object {
    var Error: js.UndefOr[SchemaValidationError]
    var Valid: js.UndefOr[IsVersionValid]
  }

  object CheckSchemaVersionValidityResponse {
    @inline
    def apply(
        Error: js.UndefOr[SchemaValidationError] = js.undefined,
        Valid: js.UndefOr[IsVersionValid] = js.undefined
    ): CheckSchemaVersionValidityResponse = {
      val __obj = js.Dynamic.literal()
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      Valid.foreach(__v => __obj.updateDynamic("Valid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckSchemaVersionValidityResponse]
    }
  }

  /** Classifiers are triggered during a crawl task. A classifier checks whether a given file is in a format it can handle. If it is, the classifier creates a schema in the form of a <code>StructType</code> object that matches that data format.
    * You can use the standard classifiers that AWS Glue provides, or you can write your own classifiers to best categorize your data sources and specify the appropriate schemas to use for them. A classifier can be a <code>grok</code> classifier, an <code>XML</code> classifier, a <code>JSON</code> classifier, or a custom <code>CSV</code> classifier, as specified in one of the fields in the <code>Classifier</code> object.
    */
  @js.native
  trait Classifier extends js.Object {
    var CsvClassifier: js.UndefOr[CsvClassifier]
    var GrokClassifier: js.UndefOr[GrokClassifier]
    var JsonClassifier: js.UndefOr[JsonClassifier]
    var XMLClassifier: js.UndefOr[XMLClassifier]
  }

  object Classifier {
    @inline
    def apply(
        CsvClassifier: js.UndefOr[CsvClassifier] = js.undefined,
        GrokClassifier: js.UndefOr[GrokClassifier] = js.undefined,
        JsonClassifier: js.UndefOr[JsonClassifier] = js.undefined,
        XMLClassifier: js.UndefOr[XMLClassifier] = js.undefined
    ): Classifier = {
      val __obj = js.Dynamic.literal()
      CsvClassifier.foreach(__v => __obj.updateDynamic("CsvClassifier")(__v.asInstanceOf[js.Any]))
      GrokClassifier.foreach(__v => __obj.updateDynamic("GrokClassifier")(__v.asInstanceOf[js.Any]))
      JsonClassifier.foreach(__v => __obj.updateDynamic("JsonClassifier")(__v.asInstanceOf[js.Any]))
      XMLClassifier.foreach(__v => __obj.updateDynamic("XMLClassifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Classifier]
    }
  }

  /** Specifies how Amazon CloudWatch data should be encrypted.
    */
  @js.native
  trait CloudWatchEncryption extends js.Object {
    var CloudWatchEncryptionMode: js.UndefOr[CloudWatchEncryptionMode]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  object CloudWatchEncryption {
    @inline
    def apply(
        CloudWatchEncryptionMode: js.UndefOr[CloudWatchEncryptionMode] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
    ): CloudWatchEncryption = {
      val __obj = js.Dynamic.literal()
      CloudWatchEncryptionMode.foreach(__v => __obj.updateDynamic("CloudWatchEncryptionMode")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchEncryption]
    }
  }

  @js.native
  sealed trait CloudWatchEncryptionMode extends js.Any
  object CloudWatchEncryptionMode {
    val DISABLED = "DISABLED".asInstanceOf[CloudWatchEncryptionMode]
    val `SSE-KMS` = "SSE-KMS".asInstanceOf[CloudWatchEncryptionMode]

    @inline def values = js.Array(DISABLED, `SSE-KMS`)
  }

  /** Represents a directional edge in a directed acyclic graph (DAG).
    */
  @js.native
  trait CodeGenEdge extends js.Object {
    var Source: CodeGenIdentifier
    var Target: CodeGenIdentifier
    var TargetParameter: js.UndefOr[CodeGenArgName]
  }

  object CodeGenEdge {
    @inline
    def apply(
        Source: CodeGenIdentifier,
        Target: CodeGenIdentifier,
        TargetParameter: js.UndefOr[CodeGenArgName] = js.undefined
    ): CodeGenEdge = {
      val __obj = js.Dynamic.literal(
        "Source" -> Source.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )

      TargetParameter.foreach(__v => __obj.updateDynamic("TargetParameter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeGenEdge]
    }
  }

  /** Represents a node in a directed acyclic graph (DAG)
    */
  @js.native
  trait CodeGenNode extends js.Object {
    var Args: CodeGenNodeArgs
    var Id: CodeGenIdentifier
    var NodeType: CodeGenNodeType
    var LineNumber: js.UndefOr[Int]
  }

  object CodeGenNode {
    @inline
    def apply(
        Args: CodeGenNodeArgs,
        Id: CodeGenIdentifier,
        NodeType: CodeGenNodeType,
        LineNumber: js.UndefOr[Int] = js.undefined
    ): CodeGenNode = {
      val __obj = js.Dynamic.literal(
        "Args" -> Args.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "NodeType" -> NodeType.asInstanceOf[js.Any]
      )

      LineNumber.foreach(__v => __obj.updateDynamic("LineNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeGenNode]
    }
  }

  /** An argument or property of a node.
    */
  @js.native
  trait CodeGenNodeArg extends js.Object {
    var Name: CodeGenArgName
    var Value: CodeGenArgValue
    var Param: js.UndefOr[Boolean]
  }

  object CodeGenNodeArg {
    @inline
    def apply(
        Name: CodeGenArgName,
        Value: CodeGenArgValue,
        Param: js.UndefOr[Boolean] = js.undefined
    ): CodeGenNodeArg = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Param.foreach(__v => __obj.updateDynamic("Param")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeGenNodeArg]
    }
  }

  /** A column in a <code>Table</code>.
    */
  @js.native
  trait Column extends js.Object {
    var Name: NameString
    var Comment: js.UndefOr[CommentString]
    var Parameters: js.UndefOr[ParametersMap]
    var Type: js.UndefOr[ColumnTypeString]
  }

  object Column {
    @inline
    def apply(
        Name: NameString,
        Comment: js.UndefOr[CommentString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        Type: js.UndefOr[ColumnTypeString] = js.undefined
    ): Column = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Column]
    }
  }

  /** Encapsulates a column name that failed and the reason for failure.
    */
  @js.native
  trait ColumnError extends js.Object {
    var ColumnName: js.UndefOr[NameString]
    var Error: js.UndefOr[ErrorDetail]
  }

  object ColumnError {
    @inline
    def apply(
        ColumnName: js.UndefOr[NameString] = js.undefined,
        Error: js.UndefOr[ErrorDetail] = js.undefined
    ): ColumnError = {
      val __obj = js.Dynamic.literal()
      ColumnName.foreach(__v => __obj.updateDynamic("ColumnName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnError]
    }
  }

  /** A structure containing the column name and column importance score for a column.
    * Column importance helps you understand how columns contribute to your model, by identifying which columns in your records are more important than others.
    */
  @js.native
  trait ColumnImportance extends js.Object {
    var ColumnName: js.UndefOr[NameString]
    var Importance: js.UndefOr[GenericBoundedDouble]
  }

  object ColumnImportance {
    @inline
    def apply(
        ColumnName: js.UndefOr[NameString] = js.undefined,
        Importance: js.UndefOr[GenericBoundedDouble] = js.undefined
    ): ColumnImportance = {
      val __obj = js.Dynamic.literal()
      ColumnName.foreach(__v => __obj.updateDynamic("ColumnName")(__v.asInstanceOf[js.Any]))
      Importance.foreach(__v => __obj.updateDynamic("Importance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnImportance]
    }
  }

  /** Represents the generated column-level statistics for a table or partition.
    */
  @js.native
  trait ColumnStatistics extends js.Object {
    var AnalyzedTime: Timestamp
    var ColumnName: NameString
    var ColumnType: TypeString
    var StatisticsData: ColumnStatisticsData
  }

  object ColumnStatistics {
    @inline
    def apply(
        AnalyzedTime: Timestamp,
        ColumnName: NameString,
        ColumnType: TypeString,
        StatisticsData: ColumnStatisticsData
    ): ColumnStatistics = {
      val __obj = js.Dynamic.literal(
        "AnalyzedTime" -> AnalyzedTime.asInstanceOf[js.Any],
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "ColumnType" -> ColumnType.asInstanceOf[js.Any],
        "StatisticsData" -> StatisticsData.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ColumnStatistics]
    }
  }

  /** Contains the individual types of column statistics data. Only one data object should be set and indicated by the <code>Type</code> attribute.
    */
  @js.native
  trait ColumnStatisticsData extends js.Object {
    var Type: ColumnStatisticsType
    var BinaryColumnStatisticsData: js.UndefOr[BinaryColumnStatisticsData]
    var BooleanColumnStatisticsData: js.UndefOr[BooleanColumnStatisticsData]
    var DateColumnStatisticsData: js.UndefOr[DateColumnStatisticsData]
    var DecimalColumnStatisticsData: js.UndefOr[DecimalColumnStatisticsData]
    var DoubleColumnStatisticsData: js.UndefOr[DoubleColumnStatisticsData]
    var LongColumnStatisticsData: js.UndefOr[LongColumnStatisticsData]
    var StringColumnStatisticsData: js.UndefOr[StringColumnStatisticsData]
  }

  object ColumnStatisticsData {
    @inline
    def apply(
        Type: ColumnStatisticsType,
        BinaryColumnStatisticsData: js.UndefOr[BinaryColumnStatisticsData] = js.undefined,
        BooleanColumnStatisticsData: js.UndefOr[BooleanColumnStatisticsData] = js.undefined,
        DateColumnStatisticsData: js.UndefOr[DateColumnStatisticsData] = js.undefined,
        DecimalColumnStatisticsData: js.UndefOr[DecimalColumnStatisticsData] = js.undefined,
        DoubleColumnStatisticsData: js.UndefOr[DoubleColumnStatisticsData] = js.undefined,
        LongColumnStatisticsData: js.UndefOr[LongColumnStatisticsData] = js.undefined,
        StringColumnStatisticsData: js.UndefOr[StringColumnStatisticsData] = js.undefined
    ): ColumnStatisticsData = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      BinaryColumnStatisticsData.foreach(__v => __obj.updateDynamic("BinaryColumnStatisticsData")(__v.asInstanceOf[js.Any]))
      BooleanColumnStatisticsData.foreach(__v => __obj.updateDynamic("BooleanColumnStatisticsData")(__v.asInstanceOf[js.Any]))
      DateColumnStatisticsData.foreach(__v => __obj.updateDynamic("DateColumnStatisticsData")(__v.asInstanceOf[js.Any]))
      DecimalColumnStatisticsData.foreach(__v => __obj.updateDynamic("DecimalColumnStatisticsData")(__v.asInstanceOf[js.Any]))
      DoubleColumnStatisticsData.foreach(__v => __obj.updateDynamic("DoubleColumnStatisticsData")(__v.asInstanceOf[js.Any]))
      LongColumnStatisticsData.foreach(__v => __obj.updateDynamic("LongColumnStatisticsData")(__v.asInstanceOf[js.Any]))
      StringColumnStatisticsData.foreach(__v => __obj.updateDynamic("StringColumnStatisticsData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnStatisticsData]
    }
  }

  /** Encapsulates a <code>ColumnStatistics</code> object that failed and the reason for failure.
    */
  @js.native
  trait ColumnStatisticsError extends js.Object {
    var ColumnStatistics: js.UndefOr[ColumnStatistics]
    var Error: js.UndefOr[ErrorDetail]
  }

  object ColumnStatisticsError {
    @inline
    def apply(
        ColumnStatistics: js.UndefOr[ColumnStatistics] = js.undefined,
        Error: js.UndefOr[ErrorDetail] = js.undefined
    ): ColumnStatisticsError = {
      val __obj = js.Dynamic.literal()
      ColumnStatistics.foreach(__v => __obj.updateDynamic("ColumnStatistics")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnStatisticsError]
    }
  }

  @js.native
  sealed trait ColumnStatisticsType extends js.Any
  object ColumnStatisticsType {
    val BOOLEAN = "BOOLEAN".asInstanceOf[ColumnStatisticsType]
    val DATE = "DATE".asInstanceOf[ColumnStatisticsType]
    val DECIMAL = "DECIMAL".asInstanceOf[ColumnStatisticsType]
    val DOUBLE = "DOUBLE".asInstanceOf[ColumnStatisticsType]
    val LONG = "LONG".asInstanceOf[ColumnStatisticsType]
    val STRING = "STRING".asInstanceOf[ColumnStatisticsType]
    val BINARY = "BINARY".asInstanceOf[ColumnStatisticsType]

    @inline def values = js.Array(BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING, BINARY)
  }

  @js.native
  sealed trait Comparator extends js.Any
  object Comparator {
    val EQUALS = "EQUALS".asInstanceOf[Comparator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[Comparator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[Comparator]
    val GREATER_THAN_EQUALS = "GREATER_THAN_EQUALS".asInstanceOf[Comparator]
    val LESS_THAN_EQUALS = "LESS_THAN_EQUALS".asInstanceOf[Comparator]

    @inline def values = js.Array(EQUALS, GREATER_THAN, LESS_THAN, GREATER_THAN_EQUALS, LESS_THAN_EQUALS)
  }

  @js.native
  sealed trait Compatibility extends js.Any
  object Compatibility {
    val NONE = "NONE".asInstanceOf[Compatibility]
    val DISABLED = "DISABLED".asInstanceOf[Compatibility]
    val BACKWARD = "BACKWARD".asInstanceOf[Compatibility]
    val BACKWARD_ALL = "BACKWARD_ALL".asInstanceOf[Compatibility]
    val FORWARD = "FORWARD".asInstanceOf[Compatibility]
    val FORWARD_ALL = "FORWARD_ALL".asInstanceOf[Compatibility]
    val FULL = "FULL".asInstanceOf[Compatibility]
    val FULL_ALL = "FULL_ALL".asInstanceOf[Compatibility]

    @inline def values = js.Array(NONE, DISABLED, BACKWARD, BACKWARD_ALL, FORWARD, FORWARD_ALL, FULL, FULL_ALL)
  }

  /** Defines a condition under which a trigger fires.
    */
  @js.native
  trait Condition extends js.Object {
    var CrawlState: js.UndefOr[CrawlState]
    var CrawlerName: js.UndefOr[NameString]
    var JobName: js.UndefOr[NameString]
    var LogicalOperator: js.UndefOr[LogicalOperator]
    var State: js.UndefOr[JobRunState]
  }

  object Condition {
    @inline
    def apply(
        CrawlState: js.UndefOr[CrawlState] = js.undefined,
        CrawlerName: js.UndefOr[NameString] = js.undefined,
        JobName: js.UndefOr[NameString] = js.undefined,
        LogicalOperator: js.UndefOr[LogicalOperator] = js.undefined,
        State: js.UndefOr[JobRunState] = js.undefined
    ): Condition = {
      val __obj = js.Dynamic.literal()
      CrawlState.foreach(__v => __obj.updateDynamic("CrawlState")(__v.asInstanceOf[js.Any]))
      CrawlerName.foreach(__v => __obj.updateDynamic("CrawlerName")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      LogicalOperator.foreach(__v => __obj.updateDynamic("LogicalOperator")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Condition]
    }
  }

  /** The confusion matrix shows you what your transform is predicting accurately and what types of errors it is making.
    * For more information, see [[https://en.wikipedia.org/wiki/Confusion_matrix|Confusion matrix]] in Wikipedia.
    */
  @js.native
  trait ConfusionMatrix extends js.Object {
    var NumFalseNegatives: js.UndefOr[RecordsCount]
    var NumFalsePositives: js.UndefOr[RecordsCount]
    var NumTrueNegatives: js.UndefOr[RecordsCount]
    var NumTruePositives: js.UndefOr[RecordsCount]
  }

  object ConfusionMatrix {
    @inline
    def apply(
        NumFalseNegatives: js.UndefOr[RecordsCount] = js.undefined,
        NumFalsePositives: js.UndefOr[RecordsCount] = js.undefined,
        NumTrueNegatives: js.UndefOr[RecordsCount] = js.undefined,
        NumTruePositives: js.UndefOr[RecordsCount] = js.undefined
    ): ConfusionMatrix = {
      val __obj = js.Dynamic.literal()
      NumFalseNegatives.foreach(__v => __obj.updateDynamic("NumFalseNegatives")(__v.asInstanceOf[js.Any]))
      NumFalsePositives.foreach(__v => __obj.updateDynamic("NumFalsePositives")(__v.asInstanceOf[js.Any]))
      NumTrueNegatives.foreach(__v => __obj.updateDynamic("NumTrueNegatives")(__v.asInstanceOf[js.Any]))
      NumTruePositives.foreach(__v => __obj.updateDynamic("NumTruePositives")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfusionMatrix]
    }
  }

  /** Defines a connection to a data source.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      ConnectionProperties.foreach(__v => __obj.updateDynamic("ConnectionProperties")(__v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.updateDynamic("ConnectionType")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdatedBy.foreach(__v => __obj.updateDynamic("LastUpdatedBy")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      MatchCriteria.foreach(__v => __obj.updateDynamic("MatchCriteria")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PhysicalConnectionRequirements.foreach(__v => __obj.updateDynamic("PhysicalConnectionRequirements")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
  }

  /** A structure that is used to specify a connection to create or update.
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
    @inline
    def apply(
        ConnectionProperties: ConnectionProperties,
        ConnectionType: ConnectionType,
        Name: NameString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined,
        PhysicalConnectionRequirements: js.UndefOr[PhysicalConnectionRequirements] = js.undefined
    ): ConnectionInput = {
      val __obj = js.Dynamic.literal(
        "ConnectionProperties" -> ConnectionProperties.asInstanceOf[js.Any],
        "ConnectionType" -> ConnectionType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MatchCriteria.foreach(__v => __obj.updateDynamic("MatchCriteria")(__v.asInstanceOf[js.Any]))
      PhysicalConnectionRequirements.foreach(__v => __obj.updateDynamic("PhysicalConnectionRequirements")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionInput]
    }
  }

  /** The data structure used by the Data Catalog to encrypt the password as part of <code>CreateConnection</code> or <code>UpdateConnection</code> and store it in the <code>ENCRYPTED_PASSWORD</code> field in the connection properties. You can enable catalog encryption or only password encryption.
    * When a <code>CreationConnection</code> request arrives containing a password, the Data Catalog first encrypts the password using your AWS KMS key. It then encrypts the whole connection object again if catalog encryption is also enabled.
    * This encryption requires that you set AWS KMS key permissions to enable or restrict access on the password key according to your security requirements. For example, you might want only administrators to have decrypt permission on the password key.
    */
  @js.native
  trait ConnectionPasswordEncryption extends js.Object {
    var ReturnConnectionPasswordEncrypted: Boolean
    var AwsKmsKeyId: js.UndefOr[NameString]
  }

  object ConnectionPasswordEncryption {
    @inline
    def apply(
        ReturnConnectionPasswordEncrypted: Boolean,
        AwsKmsKeyId: js.UndefOr[NameString] = js.undefined
    ): ConnectionPasswordEncryption = {
      val __obj = js.Dynamic.literal(
        "ReturnConnectionPasswordEncrypted" -> ReturnConnectionPasswordEncrypted.asInstanceOf[js.Any]
      )

      AwsKmsKeyId.foreach(__v => __obj.updateDynamic("AwsKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionPasswordEncryption]
    }
  }

  @js.native
  sealed trait ConnectionPropertyKey extends js.Any
  object ConnectionPropertyKey {
    val HOST = "HOST".asInstanceOf[ConnectionPropertyKey]
    val PORT = "PORT".asInstanceOf[ConnectionPropertyKey]
    val USERNAME = "USERNAME".asInstanceOf[ConnectionPropertyKey]
    val PASSWORD = "PASSWORD".asInstanceOf[ConnectionPropertyKey]
    val ENCRYPTED_PASSWORD = "ENCRYPTED_PASSWORD".asInstanceOf[ConnectionPropertyKey]
    val JDBC_DRIVER_JAR_URI = "JDBC_DRIVER_JAR_URI".asInstanceOf[ConnectionPropertyKey]
    val JDBC_DRIVER_CLASS_NAME = "JDBC_DRIVER_CLASS_NAME".asInstanceOf[ConnectionPropertyKey]
    val JDBC_ENGINE = "JDBC_ENGINE".asInstanceOf[ConnectionPropertyKey]
    val JDBC_ENGINE_VERSION = "JDBC_ENGINE_VERSION".asInstanceOf[ConnectionPropertyKey]
    val CONFIG_FILES = "CONFIG_FILES".asInstanceOf[ConnectionPropertyKey]
    val INSTANCE_ID = "INSTANCE_ID".asInstanceOf[ConnectionPropertyKey]
    val JDBC_CONNECTION_URL = "JDBC_CONNECTION_URL".asInstanceOf[ConnectionPropertyKey]
    val JDBC_ENFORCE_SSL = "JDBC_ENFORCE_SSL".asInstanceOf[ConnectionPropertyKey]
    val CUSTOM_JDBC_CERT = "CUSTOM_JDBC_CERT".asInstanceOf[ConnectionPropertyKey]
    val SKIP_CUSTOM_JDBC_CERT_VALIDATION = "SKIP_CUSTOM_JDBC_CERT_VALIDATION".asInstanceOf[ConnectionPropertyKey]
    val CUSTOM_JDBC_CERT_STRING = "CUSTOM_JDBC_CERT_STRING".asInstanceOf[ConnectionPropertyKey]
    val CONNECTION_URL = "CONNECTION_URL".asInstanceOf[ConnectionPropertyKey]
    val KAFKA_BOOTSTRAP_SERVERS = "KAFKA_BOOTSTRAP_SERVERS".asInstanceOf[ConnectionPropertyKey]
    val KAFKA_SSL_ENABLED = "KAFKA_SSL_ENABLED".asInstanceOf[ConnectionPropertyKey]
    val KAFKA_CUSTOM_CERT = "KAFKA_CUSTOM_CERT".asInstanceOf[ConnectionPropertyKey]
    val KAFKA_SKIP_CUSTOM_CERT_VALIDATION = "KAFKA_SKIP_CUSTOM_CERT_VALIDATION".asInstanceOf[ConnectionPropertyKey]
    val SECRET_ID = "SECRET_ID".asInstanceOf[ConnectionPropertyKey]
    val CONNECTOR_URL = "CONNECTOR_URL".asInstanceOf[ConnectionPropertyKey]
    val CONNECTOR_TYPE = "CONNECTOR_TYPE".asInstanceOf[ConnectionPropertyKey]
    val CONNECTOR_CLASS_NAME = "CONNECTOR_CLASS_NAME".asInstanceOf[ConnectionPropertyKey]

    @inline def values = js.Array(
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
      CUSTOM_JDBC_CERT_STRING,
      CONNECTION_URL,
      KAFKA_BOOTSTRAP_SERVERS,
      KAFKA_SSL_ENABLED,
      KAFKA_CUSTOM_CERT,
      KAFKA_SKIP_CUSTOM_CERT_VALIDATION,
      SECRET_ID,
      CONNECTOR_URL,
      CONNECTOR_TYPE,
      CONNECTOR_CLASS_NAME
    )
  }

  @js.native
  sealed trait ConnectionType extends js.Any
  object ConnectionType {
    val JDBC = "JDBC".asInstanceOf[ConnectionType]
    val SFTP = "SFTP".asInstanceOf[ConnectionType]
    val MONGODB = "MONGODB".asInstanceOf[ConnectionType]
    val KAFKA = "KAFKA".asInstanceOf[ConnectionType]
    val NETWORK = "NETWORK".asInstanceOf[ConnectionType]
    val MARKETPLACE = "MARKETPLACE".asInstanceOf[ConnectionType]
    val CUSTOM = "CUSTOM".asInstanceOf[ConnectionType]

    @inline def values = js.Array(JDBC, SFTP, MONGODB, KAFKA, NETWORK, MARKETPLACE, CUSTOM)
  }

  /** Specifies the connections used by a job.
    */
  @js.native
  trait ConnectionsList extends js.Object {
    var Connections: js.UndefOr[OrchestrationStringList]
  }

  object ConnectionsList {
    @inline
    def apply(
        Connections: js.UndefOr[OrchestrationStringList] = js.undefined
    ): ConnectionsList = {
      val __obj = js.Dynamic.literal()
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionsList]
    }
  }

  /** The details of a crawl in the workflow.
    */
  @js.native
  trait Crawl extends js.Object {
    var CompletedOn: js.UndefOr[TimestampValue]
    var ErrorMessage: js.UndefOr[DescriptionString]
    var LogGroup: js.UndefOr[LogGroup]
    var LogStream: js.UndefOr[LogStream]
    var StartedOn: js.UndefOr[TimestampValue]
    var State: js.UndefOr[CrawlState]
  }

  object Crawl {
    @inline
    def apply(
        CompletedOn: js.UndefOr[TimestampValue] = js.undefined,
        ErrorMessage: js.UndefOr[DescriptionString] = js.undefined,
        LogGroup: js.UndefOr[LogGroup] = js.undefined,
        LogStream: js.UndefOr[LogStream] = js.undefined,
        StartedOn: js.UndefOr[TimestampValue] = js.undefined,
        State: js.UndefOr[CrawlState] = js.undefined
    ): Crawl = {
      val __obj = js.Dynamic.literal()
      CompletedOn.foreach(__v => __obj.updateDynamic("CompletedOn")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      LogGroup.foreach(__v => __obj.updateDynamic("LogGroup")(__v.asInstanceOf[js.Any]))
      LogStream.foreach(__v => __obj.updateDynamic("LogStream")(__v.asInstanceOf[js.Any]))
      StartedOn.foreach(__v => __obj.updateDynamic("StartedOn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Crawl]
    }
  }

  @js.native
  sealed trait CrawlState extends js.Any
  object CrawlState {
    val RUNNING = "RUNNING".asInstanceOf[CrawlState]
    val CANCELLING = "CANCELLING".asInstanceOf[CrawlState]
    val CANCELLED = "CANCELLED".asInstanceOf[CrawlState]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[CrawlState]
    val FAILED = "FAILED".asInstanceOf[CrawlState]

    @inline def values = js.Array(RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED)
  }

  /** Specifies a crawler program that examines a data source and uses classifiers to try to determine its schema. If successful, the crawler records metadata concerning the data source in the AWS Glue Data Catalog.
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
    var LineageConfiguration: js.UndefOr[LineageConfiguration]
    var Name: js.UndefOr[NameString]
    var RecrawlPolicy: js.UndefOr[RecrawlPolicy]
    var Role: js.UndefOr[Role]
    var Schedule: js.UndefOr[Schedule]
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy]
    var State: js.UndefOr[CrawlerState]
    var TablePrefix: js.UndefOr[TablePrefix]
    var Targets: js.UndefOr[CrawlerTargets]
    var Version: js.UndefOr[VersionId]
  }

  object Crawler {
    @inline
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
        LineageConfiguration: js.UndefOr[LineageConfiguration] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        RecrawlPolicy: js.UndefOr[RecrawlPolicy] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        Schedule: js.UndefOr[Schedule] = js.undefined,
        SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined,
        State: js.UndefOr[CrawlerState] = js.undefined,
        TablePrefix: js.UndefOr[TablePrefix] = js.undefined,
        Targets: js.UndefOr[CrawlerTargets] = js.undefined,
        Version: js.UndefOr[VersionId] = js.undefined
    ): Crawler = {
      val __obj = js.Dynamic.literal()
      Classifiers.foreach(__v => __obj.updateDynamic("Classifiers")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CrawlElapsedTime.foreach(__v => __obj.updateDynamic("CrawlElapsedTime")(__v.asInstanceOf[js.Any]))
      CrawlerSecurityConfiguration.foreach(__v => __obj.updateDynamic("CrawlerSecurityConfiguration")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastCrawl.foreach(__v => __obj.updateDynamic("LastCrawl")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      LineageConfiguration.foreach(__v => __obj.updateDynamic("LineageConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RecrawlPolicy.foreach(__v => __obj.updateDynamic("RecrawlPolicy")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SchemaChangePolicy.foreach(__v => __obj.updateDynamic("SchemaChangePolicy")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TablePrefix.foreach(__v => __obj.updateDynamic("TablePrefix")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Crawler]
    }
  }

  @js.native
  sealed trait CrawlerLineageSettings extends js.Any
  object CrawlerLineageSettings {
    val ENABLE = "ENABLE".asInstanceOf[CrawlerLineageSettings]
    val DISABLE = "DISABLE".asInstanceOf[CrawlerLineageSettings]

    @inline def values = js.Array(ENABLE, DISABLE)
  }

  /** Metrics for a specified crawler.
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
    @inline
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
      val __obj = js.Dynamic.literal()
      CrawlerName.foreach(__v => __obj.updateDynamic("CrawlerName")(__v.asInstanceOf[js.Any]))
      LastRuntimeSeconds.foreach(__v => __obj.updateDynamic("LastRuntimeSeconds")(__v.asInstanceOf[js.Any]))
      MedianRuntimeSeconds.foreach(__v => __obj.updateDynamic("MedianRuntimeSeconds")(__v.asInstanceOf[js.Any]))
      StillEstimating.foreach(__v => __obj.updateDynamic("StillEstimating")(__v.asInstanceOf[js.Any]))
      TablesCreated.foreach(__v => __obj.updateDynamic("TablesCreated")(__v.asInstanceOf[js.Any]))
      TablesDeleted.foreach(__v => __obj.updateDynamic("TablesDeleted")(__v.asInstanceOf[js.Any]))
      TablesUpdated.foreach(__v => __obj.updateDynamic("TablesUpdated")(__v.asInstanceOf[js.Any]))
      TimeLeftSeconds.foreach(__v => __obj.updateDynamic("TimeLeftSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrawlerMetrics]
    }
  }

  /** The details of a Crawler node present in the workflow.
    */
  @js.native
  trait CrawlerNodeDetails extends js.Object {
    var Crawls: js.UndefOr[CrawlList]
  }

  object CrawlerNodeDetails {
    @inline
    def apply(
        Crawls: js.UndefOr[CrawlList] = js.undefined
    ): CrawlerNodeDetails = {
      val __obj = js.Dynamic.literal()
      Crawls.foreach(__v => __obj.updateDynamic("Crawls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrawlerNodeDetails]
    }
  }

  @js.native
  sealed trait CrawlerState extends js.Any
  object CrawlerState {
    val READY = "READY".asInstanceOf[CrawlerState]
    val RUNNING = "RUNNING".asInstanceOf[CrawlerState]
    val STOPPING = "STOPPING".asInstanceOf[CrawlerState]

    @inline def values = js.Array(READY, RUNNING, STOPPING)
  }

  /** Specifies data stores to crawl.
    */
  @js.native
  trait CrawlerTargets extends js.Object {
    var CatalogTargets: js.UndefOr[CatalogTargetList]
    var DynamoDBTargets: js.UndefOr[DynamoDBTargetList]
    var JdbcTargets: js.UndefOr[JdbcTargetList]
    var MongoDBTargets: js.UndefOr[MongoDBTargetList]
    var S3Targets: js.UndefOr[S3TargetList]
  }

  object CrawlerTargets {
    @inline
    def apply(
        CatalogTargets: js.UndefOr[CatalogTargetList] = js.undefined,
        DynamoDBTargets: js.UndefOr[DynamoDBTargetList] = js.undefined,
        JdbcTargets: js.UndefOr[JdbcTargetList] = js.undefined,
        MongoDBTargets: js.UndefOr[MongoDBTargetList] = js.undefined,
        S3Targets: js.UndefOr[S3TargetList] = js.undefined
    ): CrawlerTargets = {
      val __obj = js.Dynamic.literal()
      CatalogTargets.foreach(__v => __obj.updateDynamic("CatalogTargets")(__v.asInstanceOf[js.Any]))
      DynamoDBTargets.foreach(__v => __obj.updateDynamic("DynamoDBTargets")(__v.asInstanceOf[js.Any]))
      JdbcTargets.foreach(__v => __obj.updateDynamic("JdbcTargets")(__v.asInstanceOf[js.Any]))
      MongoDBTargets.foreach(__v => __obj.updateDynamic("MongoDBTargets")(__v.asInstanceOf[js.Any]))
      S3Targets.foreach(__v => __obj.updateDynamic("S3Targets")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CsvClassifier: js.UndefOr[CreateCsvClassifierRequest] = js.undefined,
        GrokClassifier: js.UndefOr[CreateGrokClassifierRequest] = js.undefined,
        JsonClassifier: js.UndefOr[CreateJsonClassifierRequest] = js.undefined,
        XMLClassifier: js.UndefOr[CreateXMLClassifierRequest] = js.undefined
    ): CreateClassifierRequest = {
      val __obj = js.Dynamic.literal()
      CsvClassifier.foreach(__v => __obj.updateDynamic("CsvClassifier")(__v.asInstanceOf[js.Any]))
      GrokClassifier.foreach(__v => __obj.updateDynamic("GrokClassifier")(__v.asInstanceOf[js.Any]))
      JsonClassifier.foreach(__v => __obj.updateDynamic("JsonClassifier")(__v.asInstanceOf[js.Any]))
      XMLClassifier.foreach(__v => __obj.updateDynamic("XMLClassifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClassifierRequest]
    }
  }

  @js.native
  trait CreateClassifierResponse extends js.Object

  object CreateClassifierResponse {
    @inline
    def apply(): CreateClassifierResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateClassifierResponse]
    }
  }

  @js.native
  trait CreateConnectionRequest extends js.Object {
    var ConnectionInput: ConnectionInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object CreateConnectionRequest {
    @inline
    def apply(
        ConnectionInput: ConnectionInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreateConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionInput" -> ConnectionInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionRequest]
    }
  }

  @js.native
  trait CreateConnectionResponse extends js.Object

  object CreateConnectionResponse {
    @inline
    def apply(): CreateConnectionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateConnectionResponse]
    }
  }

  @js.native
  trait CreateCrawlerRequest extends js.Object {
    var Name: NameString
    var Role: Role
    var Targets: CrawlerTargets
    var Classifiers: js.UndefOr[ClassifierNameList]
    var Configuration: js.UndefOr[CrawlerConfiguration]
    var CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration]
    var DatabaseName: js.UndefOr[DatabaseName]
    var Description: js.UndefOr[DescriptionString]
    var LineageConfiguration: js.UndefOr[LineageConfiguration]
    var RecrawlPolicy: js.UndefOr[RecrawlPolicy]
    var Schedule: js.UndefOr[CronExpression]
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy]
    var TablePrefix: js.UndefOr[TablePrefix]
    var Tags: js.UndefOr[TagsMap]
  }

  object CreateCrawlerRequest {
    @inline
    def apply(
        Name: NameString,
        Role: Role,
        Targets: CrawlerTargets,
        Classifiers: js.UndefOr[ClassifierNameList] = js.undefined,
        Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined,
        CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration] = js.undefined,
        DatabaseName: js.UndefOr[DatabaseName] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LineageConfiguration: js.UndefOr[LineageConfiguration] = js.undefined,
        RecrawlPolicy: js.UndefOr[RecrawlPolicy] = js.undefined,
        Schedule: js.UndefOr[CronExpression] = js.undefined,
        SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined,
        TablePrefix: js.UndefOr[TablePrefix] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateCrawlerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]
      )

      Classifiers.foreach(__v => __obj.updateDynamic("Classifiers")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CrawlerSecurityConfiguration.foreach(__v => __obj.updateDynamic("CrawlerSecurityConfiguration")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LineageConfiguration.foreach(__v => __obj.updateDynamic("LineageConfiguration")(__v.asInstanceOf[js.Any]))
      RecrawlPolicy.foreach(__v => __obj.updateDynamic("RecrawlPolicy")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SchemaChangePolicy.foreach(__v => __obj.updateDynamic("SchemaChangePolicy")(__v.asInstanceOf[js.Any]))
      TablePrefix.foreach(__v => __obj.updateDynamic("TablePrefix")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCrawlerRequest]
    }
  }

  @js.native
  trait CreateCrawlerResponse extends js.Object

  object CreateCrawlerResponse {
    @inline
    def apply(): CreateCrawlerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCrawlerResponse]
    }
  }

  /** Specifies a custom CSV classifier for <code>CreateClassifier</code> to create.
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
    @inline
    def apply(
        Name: NameString,
        AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined,
        ContainsHeader: js.UndefOr[CsvHeaderOption] = js.undefined,
        Delimiter: js.UndefOr[CsvColumnDelimiter] = js.undefined,
        DisableValueTrimming: js.UndefOr[NullableBoolean] = js.undefined,
        Header: js.UndefOr[CsvHeader] = js.undefined,
        QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.undefined
    ): CreateCsvClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AllowSingleColumn.foreach(__v => __obj.updateDynamic("AllowSingleColumn")(__v.asInstanceOf[js.Any]))
      ContainsHeader.foreach(__v => __obj.updateDynamic("ContainsHeader")(__v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      DisableValueTrimming.foreach(__v => __obj.updateDynamic("DisableValueTrimming")(__v.asInstanceOf[js.Any]))
      Header.foreach(__v => __obj.updateDynamic("Header")(__v.asInstanceOf[js.Any]))
      QuoteSymbol.foreach(__v => __obj.updateDynamic("QuoteSymbol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCsvClassifierRequest]
    }
  }

  @js.native
  trait CreateDatabaseRequest extends js.Object {
    var DatabaseInput: DatabaseInput
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object CreateDatabaseRequest {
    @inline
    def apply(
        DatabaseInput: DatabaseInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreateDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseInput" -> DatabaseInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatabaseRequest]
    }
  }

  @js.native
  trait CreateDatabaseResponse extends js.Object

  object CreateDatabaseResponse {
    @inline
    def apply(): CreateDatabaseResponse = {
      val __obj = js.Dynamic.literal()
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

  object CreateDevEndpointRequest {
    @inline
    def apply(
        EndpointName: GenericString,
        RoleArn: RoleArn,
        Arguments: js.UndefOr[MapValue] = js.undefined,
        ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined,
        ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        PublicKey: js.UndefOr[GenericString] = js.undefined,
        PublicKeys: js.UndefOr[PublicKeysList] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        SecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        SubnetId: js.UndefOr[GenericString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): CreateDevEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "EndpointName" -> EndpointName.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      Arguments.foreach(__v => __obj.updateDynamic("Arguments")(__v.asInstanceOf[js.Any]))
      ExtraJarsS3Path.foreach(__v => __obj.updateDynamic("ExtraJarsS3Path")(__v.asInstanceOf[js.Any]))
      ExtraPythonLibsS3Path.foreach(__v => __obj.updateDynamic("ExtraPythonLibsS3Path")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.updateDynamic("PublicKey")(__v.asInstanceOf[js.Any]))
      PublicKeys.foreach(__v => __obj.updateDynamic("PublicKeys")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
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

  object CreateDevEndpointResponse {
    @inline
    def apply(
        Arguments: js.UndefOr[MapValue] = js.undefined,
        AvailabilityZone: js.UndefOr[GenericString] = js.undefined,
        CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined,
        EndpointName: js.UndefOr[GenericString] = js.undefined,
        ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined,
        ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined,
        FailureReason: js.UndefOr[GenericString] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        SecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        Status: js.UndefOr[GenericString] = js.undefined,
        SubnetId: js.UndefOr[GenericString] = js.undefined,
        VpcId: js.UndefOr[GenericString] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined,
        YarnEndpointAddress: js.UndefOr[GenericString] = js.undefined,
        ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
    ): CreateDevEndpointResponse = {
      val __obj = js.Dynamic.literal()
      Arguments.foreach(__v => __obj.updateDynamic("Arguments")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      ExtraJarsS3Path.foreach(__v => __obj.updateDynamic("ExtraJarsS3Path")(__v.asInstanceOf[js.Any]))
      ExtraPythonLibsS3Path.foreach(__v => __obj.updateDynamic("ExtraPythonLibsS3Path")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      YarnEndpointAddress.foreach(__v => __obj.updateDynamic("YarnEndpointAddress")(__v.asInstanceOf[js.Any]))
      ZeppelinRemoteSparkInterpreterPort.foreach(__v => __obj.updateDynamic("ZeppelinRemoteSparkInterpreterPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDevEndpointResponse]
    }
  }

  /** Specifies a <code>grok</code> classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  trait CreateGrokClassifierRequest extends js.Object {
    var Classification: Classification
    var GrokPattern: GrokPattern
    var Name: NameString
    var CustomPatterns: js.UndefOr[CustomPatterns]
  }

  object CreateGrokClassifierRequest {
    @inline
    def apply(
        Classification: Classification,
        GrokPattern: GrokPattern,
        Name: NameString,
        CustomPatterns: js.UndefOr[CustomPatterns] = js.undefined
    ): CreateGrokClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "Classification" -> Classification.asInstanceOf[js.Any],
        "GrokPattern" -> GrokPattern.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CustomPatterns.foreach(__v => __obj.updateDynamic("CustomPatterns")(__v.asInstanceOf[js.Any]))
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

  object CreateJobRequest {
    @inline
    def apply(
        Command: JobCommand,
        Name: NameString,
        Role: RoleString,
        AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
        Connections: js.UndefOr[ConnectionsList] = js.undefined,
        DefaultArguments: js.UndefOr[GenericMap] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        ExecutionProperty: js.UndefOr[ExecutionProperty] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        LogUri: js.UndefOr[UriString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        NonOverridableArguments: js.UndefOr[GenericMap] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "Command" -> Command.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any]
      )

      AllocatedCapacity.foreach(__v => __obj.updateDynamic("AllocatedCapacity")(__v.asInstanceOf[js.Any]))
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      DefaultArguments.foreach(__v => __obj.updateDynamic("DefaultArguments")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionProperty.foreach(__v => __obj.updateDynamic("ExecutionProperty")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      NonOverridableArguments.foreach(__v => __obj.updateDynamic("NonOverridableArguments")(__v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.updateDynamic("NotificationProperty")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object CreateJobResponse {
    @inline
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): CreateJobResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResponse]
    }
  }

  /** Specifies a JSON classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  trait CreateJsonClassifierRequest extends js.Object {
    var JsonPath: JsonPath
    var Name: NameString
  }

  object CreateJsonClassifierRequest {
    @inline
    def apply(
        JsonPath: JsonPath,
        Name: NameString
    ): CreateJsonClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "JsonPath" -> JsonPath.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateJsonClassifierRequest]
    }
  }

  @js.native
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
    var Tags: js.UndefOr[TagsMap]
    var Timeout: js.UndefOr[Timeout]
    var TransformEncryption: js.UndefOr[TransformEncryption]
    var WorkerType: js.UndefOr[WorkerType]
  }

  object CreateMLTransformRequest {
    @inline
    def apply(
        InputRecordTables: GlueTables,
        Name: NameString,
        Parameters: TransformParameters,
        Role: RoleString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[NullableInteger] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        TransformEncryption: js.UndefOr[TransformEncryption] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): CreateMLTransformRequest = {
      val __obj = js.Dynamic.literal(
        "InputRecordTables" -> InputRecordTables.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Parameters" -> Parameters.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      TransformEncryption.foreach(__v => __obj.updateDynamic("TransformEncryption")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMLTransformRequest]
    }
  }

  @js.native
  trait CreateMLTransformResponse extends js.Object {
    var TransformId: js.UndefOr[HashString]
  }

  object CreateMLTransformResponse {
    @inline
    def apply(
        TransformId: js.UndefOr[HashString] = js.undefined
    ): CreateMLTransformResponse = {
      val __obj = js.Dynamic.literal()
      TransformId.foreach(__v => __obj.updateDynamic("TransformId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMLTransformResponse]
    }
  }

  @js.native
  trait CreatePartitionIndexRequest extends js.Object {
    var DatabaseName: NameString
    var PartitionIndex: PartitionIndex
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object CreatePartitionIndexRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        PartitionIndex: PartitionIndex,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreatePartitionIndexRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionIndex" -> PartitionIndex.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePartitionIndexRequest]
    }
  }

  @js.native
  trait CreatePartitionIndexResponse extends js.Object

  object CreatePartitionIndexResponse {
    @inline
    def apply(): CreatePartitionIndexResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePartitionIndexResponse]
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
    @inline
    def apply(
        DatabaseName: NameString,
        PartitionInput: PartitionInput,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreatePartitionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionInput" -> PartitionInput.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePartitionRequest]
    }
  }

  @js.native
  trait CreatePartitionResponse extends js.Object

  object CreatePartitionResponse {
    @inline
    def apply(): CreatePartitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePartitionResponse]
    }
  }

  @js.native
  trait CreateRegistryInput extends js.Object {
    var RegistryName: SchemaRegistryNameString
    var Description: js.UndefOr[DescriptionString]
    var Tags: js.UndefOr[TagsMap]
  }

  object CreateRegistryInput {
    @inline
    def apply(
        RegistryName: SchemaRegistryNameString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateRegistryInput = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRegistryInput]
    }
  }

  @js.native
  trait CreateRegistryResponse extends js.Object {
    var Description: js.UndefOr[DescriptionString]
    var RegistryArn: js.UndefOr[GlueResourceArn]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var Tags: js.UndefOr[TagsMap]
  }

  object CreateRegistryResponse {
    @inline
    def apply(
        Description: js.UndefOr[DescriptionString] = js.undefined,
        RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateRegistryResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRegistryResponse]
    }
  }

  @js.native
  trait CreateSchemaInput extends js.Object {
    var DataFormat: DataFormat
    var SchemaName: SchemaRegistryNameString
    var Compatibility: js.UndefOr[Compatibility]
    var Description: js.UndefOr[DescriptionString]
    var RegistryId: js.UndefOr[RegistryId]
    var SchemaDefinition: js.UndefOr[SchemaDefinitionString]
    var Tags: js.UndefOr[TagsMap]
  }

  object CreateSchemaInput {
    @inline
    def apply(
        DataFormat: DataFormat,
        SchemaName: SchemaRegistryNameString,
        Compatibility: js.UndefOr[Compatibility] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        RegistryId: js.UndefOr[RegistryId] = js.undefined,
        SchemaDefinition: js.UndefOr[SchemaDefinitionString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateSchemaInput = {
      val __obj = js.Dynamic.literal(
        "DataFormat" -> DataFormat.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any]
      )

      Compatibility.foreach(__v => __obj.updateDynamic("Compatibility")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RegistryId.foreach(__v => __obj.updateDynamic("RegistryId")(__v.asInstanceOf[js.Any]))
      SchemaDefinition.foreach(__v => __obj.updateDynamic("SchemaDefinition")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSchemaInput]
    }
  }

  @js.native
  trait CreateSchemaResponse extends js.Object {
    var Compatibility: js.UndefOr[Compatibility]
    var DataFormat: js.UndefOr[DataFormat]
    var Description: js.UndefOr[DescriptionString]
    var LatestSchemaVersion: js.UndefOr[VersionLongNumber]
    var NextSchemaVersion: js.UndefOr[VersionLongNumber]
    var RegistryArn: js.UndefOr[GlueResourceArn]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaCheckpoint: js.UndefOr[SchemaCheckpointNumber]
    var SchemaName: js.UndefOr[SchemaRegistryNameString]
    var SchemaStatus: js.UndefOr[SchemaStatus]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var SchemaVersionStatus: js.UndefOr[SchemaVersionStatus]
    var Tags: js.UndefOr[TagsMap]
  }

  object CreateSchemaResponse {
    @inline
    def apply(
        Compatibility: js.UndefOr[Compatibility] = js.undefined,
        DataFormat: js.UndefOr[DataFormat] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LatestSchemaVersion: js.UndefOr[VersionLongNumber] = js.undefined,
        NextSchemaVersion: js.UndefOr[VersionLongNumber] = js.undefined,
        RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaCheckpoint: js.UndefOr[SchemaCheckpointNumber] = js.undefined,
        SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaStatus: js.UndefOr[SchemaStatus] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        SchemaVersionStatus: js.UndefOr[SchemaVersionStatus] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateSchemaResponse = {
      val __obj = js.Dynamic.literal()
      Compatibility.foreach(__v => __obj.updateDynamic("Compatibility")(__v.asInstanceOf[js.Any]))
      DataFormat.foreach(__v => __obj.updateDynamic("DataFormat")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LatestSchemaVersion.foreach(__v => __obj.updateDynamic("LatestSchemaVersion")(__v.asInstanceOf[js.Any]))
      NextSchemaVersion.foreach(__v => __obj.updateDynamic("NextSchemaVersion")(__v.asInstanceOf[js.Any]))
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaCheckpoint.foreach(__v => __obj.updateDynamic("SchemaCheckpoint")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaStatus.foreach(__v => __obj.updateDynamic("SchemaStatus")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      SchemaVersionStatus.foreach(__v => __obj.updateDynamic("SchemaVersionStatus")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSchemaResponse]
    }
  }

  @js.native
  trait CreateScriptRequest extends js.Object {
    var DagEdges: js.UndefOr[DagEdges]
    var DagNodes: js.UndefOr[DagNodes]
    var Language: js.UndefOr[Language]
  }

  object CreateScriptRequest {
    @inline
    def apply(
        DagEdges: js.UndefOr[DagEdges] = js.undefined,
        DagNodes: js.UndefOr[DagNodes] = js.undefined,
        Language: js.UndefOr[Language] = js.undefined
    ): CreateScriptRequest = {
      val __obj = js.Dynamic.literal()
      DagEdges.foreach(__v => __obj.updateDynamic("DagEdges")(__v.asInstanceOf[js.Any]))
      DagNodes.foreach(__v => __obj.updateDynamic("DagNodes")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScriptRequest]
    }
  }

  @js.native
  trait CreateScriptResponse extends js.Object {
    var PythonScript: js.UndefOr[PythonScript]
    var ScalaCode: js.UndefOr[ScalaCode]
  }

  object CreateScriptResponse {
    @inline
    def apply(
        PythonScript: js.UndefOr[PythonScript] = js.undefined,
        ScalaCode: js.UndefOr[ScalaCode] = js.undefined
    ): CreateScriptResponse = {
      val __obj = js.Dynamic.literal()
      PythonScript.foreach(__v => __obj.updateDynamic("PythonScript")(__v.asInstanceOf[js.Any]))
      ScalaCode.foreach(__v => __obj.updateDynamic("ScalaCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScriptResponse]
    }
  }

  @js.native
  trait CreateSecurityConfigurationRequest extends js.Object {
    var EncryptionConfiguration: EncryptionConfiguration
    var Name: NameString
  }

  object CreateSecurityConfigurationRequest {
    @inline
    def apply(
        EncryptionConfiguration: EncryptionConfiguration,
        Name: NameString
    ): CreateSecurityConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "EncryptionConfiguration" -> EncryptionConfiguration.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
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
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined
    ): CreateSecurityConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityConfigurationResponse]
    }
  }

  @js.native
  trait CreateTableRequest extends js.Object {
    var DatabaseName: NameString
    var TableInput: TableInput
    var CatalogId: js.UndefOr[CatalogIdString]
    var PartitionIndexes: js.UndefOr[PartitionIndexList]
  }

  object CreateTableRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        TableInput: TableInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        PartitionIndexes: js.UndefOr[PartitionIndexList] = js.undefined
    ): CreateTableRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableInput" -> TableInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      PartitionIndexes.foreach(__v => __obj.updateDynamic("PartitionIndexes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTableRequest]
    }
  }

  @js.native
  trait CreateTableResponse extends js.Object

  object CreateTableResponse {
    @inline
    def apply(): CreateTableResponse = {
      val __obj = js.Dynamic.literal()
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
    var WorkflowName: js.UndefOr[NameString]
  }

  object CreateTriggerRequest {
    @inline
    def apply(
        Actions: ActionList,
        Name: NameString,
        Type: TriggerType,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Predicate: js.UndefOr[Predicate] = js.undefined,
        Schedule: js.UndefOr[GenericString] = js.undefined,
        StartOnCreation: js.UndefOr[BooleanValue] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined,
        WorkflowName: js.UndefOr[NameString] = js.undefined
    ): CreateTriggerRequest = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Predicate.foreach(__v => __obj.updateDynamic("Predicate")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      StartOnCreation.foreach(__v => __obj.updateDynamic("StartOnCreation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WorkflowName.foreach(__v => __obj.updateDynamic("WorkflowName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTriggerRequest]
    }
  }

  @js.native
  trait CreateTriggerResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object CreateTriggerResponse {
    @inline
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): CreateTriggerResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        FunctionInput: UserDefinedFunctionInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreateUserDefinedFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "FunctionInput" -> FunctionInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait CreateUserDefinedFunctionResponse extends js.Object

  object CreateUserDefinedFunctionResponse {
    @inline
    def apply(): CreateUserDefinedFunctionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUserDefinedFunctionResponse]
    }
  }

  @js.native
  trait CreateWorkflowRequest extends js.Object {
    var Name: NameString
    var DefaultRunProperties: js.UndefOr[WorkflowRunProperties]
    var Description: js.UndefOr[GenericString]
    var MaxConcurrentRuns: js.UndefOr[NullableInteger]
    var Tags: js.UndefOr[TagsMap]
  }

  object CreateWorkflowRequest {
    @inline
    def apply(
        Name: NameString,
        DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined,
        Description: js.UndefOr[GenericString] = js.undefined,
        MaxConcurrentRuns: js.UndefOr[NullableInteger] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DefaultRunProperties.foreach(__v => __obj.updateDynamic("DefaultRunProperties")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MaxConcurrentRuns.foreach(__v => __obj.updateDynamic("MaxConcurrentRuns")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkflowRequest]
    }
  }

  @js.native
  trait CreateWorkflowResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object CreateWorkflowResponse {
    @inline
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): CreateWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkflowResponse]
    }
  }

  /** Specifies an XML classifier for <code>CreateClassifier</code> to create.
    */
  @js.native
  trait CreateXMLClassifierRequest extends js.Object {
    var Classification: Classification
    var Name: NameString
    var RowTag: js.UndefOr[RowTag]
  }

  object CreateXMLClassifierRequest {
    @inline
    def apply(
        Classification: Classification,
        Name: NameString,
        RowTag: js.UndefOr[RowTag] = js.undefined
    ): CreateXMLClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "Classification" -> Classification.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      RowTag.foreach(__v => __obj.updateDynamic("RowTag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateXMLClassifierRequest]
    }
  }

  /** A classifier for custom <code>CSV</code> content.
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AllowSingleColumn.foreach(__v => __obj.updateDynamic("AllowSingleColumn")(__v.asInstanceOf[js.Any]))
      ContainsHeader.foreach(__v => __obj.updateDynamic("ContainsHeader")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      DisableValueTrimming.foreach(__v => __obj.updateDynamic("DisableValueTrimming")(__v.asInstanceOf[js.Any]))
      Header.foreach(__v => __obj.updateDynamic("Header")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      QuoteSymbol.foreach(__v => __obj.updateDynamic("QuoteSymbol")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CsvClassifier]
    }
  }

  @js.native
  sealed trait CsvHeaderOption extends js.Any
  object CsvHeaderOption {
    val UNKNOWN = "UNKNOWN".asInstanceOf[CsvHeaderOption]
    val PRESENT = "PRESENT".asInstanceOf[CsvHeaderOption]
    val ABSENT = "ABSENT".asInstanceOf[CsvHeaderOption]

    @inline def values = js.Array(UNKNOWN, PRESENT, ABSENT)
  }

  /** Contains configuration information for maintaining Data Catalog security.
    */
  @js.native
  trait DataCatalogEncryptionSettings extends js.Object {
    var ConnectionPasswordEncryption: js.UndefOr[ConnectionPasswordEncryption]
    var EncryptionAtRest: js.UndefOr[EncryptionAtRest]
  }

  object DataCatalogEncryptionSettings {
    @inline
    def apply(
        ConnectionPasswordEncryption: js.UndefOr[ConnectionPasswordEncryption] = js.undefined,
        EncryptionAtRest: js.UndefOr[EncryptionAtRest] = js.undefined
    ): DataCatalogEncryptionSettings = {
      val __obj = js.Dynamic.literal()
      ConnectionPasswordEncryption.foreach(__v => __obj.updateDynamic("ConnectionPasswordEncryption")(__v.asInstanceOf[js.Any]))
      EncryptionAtRest.foreach(__v => __obj.updateDynamic("EncryptionAtRest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCatalogEncryptionSettings]
    }
  }

  @js.native
  sealed trait DataFormat extends js.Any
  object DataFormat {
    val AVRO = "AVRO".asInstanceOf[DataFormat]

    @inline def values = js.Array(AVRO)
  }

  /** The AWS Lake Formation principal.
    */
  @js.native
  trait DataLakePrincipal extends js.Object {
    var DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString]
  }

  object DataLakePrincipal {
    @inline
    def apply(
        DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString] = js.undefined
    ): DataLakePrincipal = {
      val __obj = js.Dynamic.literal()
      DataLakePrincipalIdentifier.foreach(__v => __obj.updateDynamic("DataLakePrincipalIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataLakePrincipal]
    }
  }

  /** The <code>Database</code> object represents a logical grouping of tables that might reside in a Hive metastore or an RDBMS.
    */
  @js.native
  trait Database extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList]
    var CreateTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var LocationUri: js.UndefOr[URI]
    var Parameters: js.UndefOr[ParametersMap]
    var TargetDatabase: js.UndefOr[DatabaseIdentifier]
  }

  object Database {
    @inline
    def apply(
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined,
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LocationUri: js.UndefOr[URI] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        TargetDatabase: js.UndefOr[DatabaseIdentifier] = js.undefined
    ): Database = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      CreateTableDefaultPermissions.foreach(__v => __obj.updateDynamic("CreateTableDefaultPermissions")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      TargetDatabase.foreach(__v => __obj.updateDynamic("TargetDatabase")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Database]
    }
  }

  /** A structure that describes a target database for resource linking.
    */
  @js.native
  trait DatabaseIdentifier extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var DatabaseName: js.UndefOr[NameString]
  }

  object DatabaseIdentifier {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        DatabaseName: js.UndefOr[NameString] = js.undefined
    ): DatabaseIdentifier = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseIdentifier]
    }
  }

  /** The structure used to create or update a database.
    */
  @js.native
  trait DatabaseInput extends js.Object {
    var Name: NameString
    var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList]
    var Description: js.UndefOr[DescriptionString]
    var LocationUri: js.UndefOr[URI]
    var Parameters: js.UndefOr[ParametersMap]
    var TargetDatabase: js.UndefOr[DatabaseIdentifier]
  }

  object DatabaseInput {
    @inline
    def apply(
        Name: NameString,
        CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LocationUri: js.UndefOr[URI] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        TargetDatabase: js.UndefOr[DatabaseIdentifier] = js.undefined
    ): DatabaseInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreateTableDefaultPermissions.foreach(__v => __obj.updateDynamic("CreateTableDefaultPermissions")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      TargetDatabase.foreach(__v => __obj.updateDynamic("TargetDatabase")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseInput]
    }
  }

  /** Defines column statistics supported for timestamp data columns.
    */
  @js.native
  trait DateColumnStatisticsData extends js.Object {
    var NumberOfDistinctValues: NonNegativeLong
    var NumberOfNulls: NonNegativeLong
    var MaximumValue: js.UndefOr[Timestamp]
    var MinimumValue: js.UndefOr[Timestamp]
  }

  object DateColumnStatisticsData {
    @inline
    def apply(
        NumberOfDistinctValues: NonNegativeLong,
        NumberOfNulls: NonNegativeLong,
        MaximumValue: js.UndefOr[Timestamp] = js.undefined,
        MinimumValue: js.UndefOr[Timestamp] = js.undefined
    ): DateColumnStatisticsData = {
      val __obj = js.Dynamic.literal(
        "NumberOfDistinctValues" -> NumberOfDistinctValues.asInstanceOf[js.Any],
        "NumberOfNulls" -> NumberOfNulls.asInstanceOf[js.Any]
      )

      MaximumValue.foreach(__v => __obj.updateDynamic("MaximumValue")(__v.asInstanceOf[js.Any]))
      MinimumValue.foreach(__v => __obj.updateDynamic("MinimumValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateColumnStatisticsData]
    }
  }

  /** Defines column statistics supported for fixed-point number data columns.
    */
  @js.native
  trait DecimalColumnStatisticsData extends js.Object {
    var NumberOfDistinctValues: NonNegativeLong
    var NumberOfNulls: NonNegativeLong
    var MaximumValue: js.UndefOr[DecimalNumber]
    var MinimumValue: js.UndefOr[DecimalNumber]
  }

  object DecimalColumnStatisticsData {
    @inline
    def apply(
        NumberOfDistinctValues: NonNegativeLong,
        NumberOfNulls: NonNegativeLong,
        MaximumValue: js.UndefOr[DecimalNumber] = js.undefined,
        MinimumValue: js.UndefOr[DecimalNumber] = js.undefined
    ): DecimalColumnStatisticsData = {
      val __obj = js.Dynamic.literal(
        "NumberOfDistinctValues" -> NumberOfDistinctValues.asInstanceOf[js.Any],
        "NumberOfNulls" -> NumberOfNulls.asInstanceOf[js.Any]
      )

      MaximumValue.foreach(__v => __obj.updateDynamic("MaximumValue")(__v.asInstanceOf[js.Any]))
      MinimumValue.foreach(__v => __obj.updateDynamic("MinimumValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecimalColumnStatisticsData]
    }
  }

  /** Contains a numeric value in decimal format.
    */
  @js.native
  trait DecimalNumber extends js.Object {
    var Scale: Int
    var UnscaledValue: Blob
  }

  object DecimalNumber {
    @inline
    def apply(
        Scale: Int,
        UnscaledValue: Blob
    ): DecimalNumber = {
      val __obj = js.Dynamic.literal(
        "Scale" -> Scale.asInstanceOf[js.Any],
        "UnscaledValue" -> UnscaledValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DecimalNumber]
    }
  }

  @js.native
  sealed trait DeleteBehavior extends js.Any
  object DeleteBehavior {
    val LOG = "LOG".asInstanceOf[DeleteBehavior]
    val DELETE_FROM_DATABASE = "DELETE_FROM_DATABASE".asInstanceOf[DeleteBehavior]
    val DEPRECATE_IN_DATABASE = "DEPRECATE_IN_DATABASE".asInstanceOf[DeleteBehavior]

    @inline def values = js.Array(LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE)
  }

  @js.native
  trait DeleteClassifierRequest extends js.Object {
    var Name: NameString
  }

  object DeleteClassifierRequest {
    @inline
    def apply(
        Name: NameString
    ): DeleteClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteClassifierRequest]
    }
  }

  @js.native
  trait DeleteClassifierResponse extends js.Object

  object DeleteClassifierResponse {
    @inline
    def apply(): DeleteClassifierResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteClassifierResponse]
    }
  }

  @js.native
  trait DeleteColumnStatisticsForPartitionRequest extends js.Object {
    var ColumnName: NameString
    var DatabaseName: NameString
    var PartitionValues: ValueStringList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteColumnStatisticsForPartitionRequest {
    @inline
    def apply(
        ColumnName: NameString,
        DatabaseName: NameString,
        PartitionValues: ValueStringList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteColumnStatisticsForPartitionRequest = {
      val __obj = js.Dynamic.literal(
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionValues" -> PartitionValues.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteColumnStatisticsForPartitionRequest]
    }
  }

  @js.native
  trait DeleteColumnStatisticsForPartitionResponse extends js.Object

  object DeleteColumnStatisticsForPartitionResponse {
    @inline
    def apply(): DeleteColumnStatisticsForPartitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteColumnStatisticsForPartitionResponse]
    }
  }

  @js.native
  trait DeleteColumnStatisticsForTableRequest extends js.Object {
    var ColumnName: NameString
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteColumnStatisticsForTableRequest {
    @inline
    def apply(
        ColumnName: NameString,
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteColumnStatisticsForTableRequest = {
      val __obj = js.Dynamic.literal(
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteColumnStatisticsForTableRequest]
    }
  }

  @js.native
  trait DeleteColumnStatisticsForTableResponse extends js.Object

  object DeleteColumnStatisticsForTableResponse {
    @inline
    def apply(): DeleteColumnStatisticsForTableResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteColumnStatisticsForTableResponse]
    }
  }

  @js.native
  trait DeleteConnectionRequest extends js.Object {
    var ConnectionName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteConnectionRequest {
    @inline
    def apply(
        ConnectionName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionName" -> ConnectionName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait DeleteConnectionResponse extends js.Object

  object DeleteConnectionResponse {
    @inline
    def apply(): DeleteConnectionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteConnectionResponse]
    }
  }

  @js.native
  trait DeleteCrawlerRequest extends js.Object {
    var Name: NameString
  }

  object DeleteCrawlerRequest {
    @inline
    def apply(
        Name: NameString
    ): DeleteCrawlerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCrawlerRequest]
    }
  }

  @js.native
  trait DeleteCrawlerResponse extends js.Object

  object DeleteCrawlerResponse {
    @inline
    def apply(): DeleteCrawlerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCrawlerResponse]
    }
  }

  @js.native
  trait DeleteDatabaseRequest extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteDatabaseRequest {
    @inline
    def apply(
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDatabaseRequest]
    }
  }

  @js.native
  trait DeleteDatabaseResponse extends js.Object

  object DeleteDatabaseResponse {
    @inline
    def apply(): DeleteDatabaseResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDatabaseResponse]
    }
  }

  @js.native
  trait DeleteDevEndpointRequest extends js.Object {
    var EndpointName: GenericString
  }

  object DeleteDevEndpointRequest {
    @inline
    def apply(
        EndpointName: GenericString
    ): DeleteDevEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDevEndpointRequest]
    }
  }

  @js.native
  trait DeleteDevEndpointResponse extends js.Object

  object DeleteDevEndpointResponse {
    @inline
    def apply(): DeleteDevEndpointResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDevEndpointResponse]
    }
  }

  @js.native
  trait DeleteJobRequest extends js.Object {
    var JobName: NameString
  }

  object DeleteJobRequest {
    @inline
    def apply(
        JobName: NameString
    ): DeleteJobRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        JobName: js.UndefOr[NameString] = js.undefined
    ): DeleteJobResponse = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteJobResponse]
    }
  }

  @js.native
  trait DeleteMLTransformRequest extends js.Object {
    var TransformId: HashString
  }

  object DeleteMLTransformRequest {
    @inline
    def apply(
        TransformId: HashString
    ): DeleteMLTransformRequest = {
      val __obj = js.Dynamic.literal(
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMLTransformRequest]
    }
  }

  @js.native
  trait DeleteMLTransformResponse extends js.Object {
    var TransformId: js.UndefOr[HashString]
  }

  object DeleteMLTransformResponse {
    @inline
    def apply(
        TransformId: js.UndefOr[HashString] = js.undefined
    ): DeleteMLTransformResponse = {
      val __obj = js.Dynamic.literal()
      TransformId.foreach(__v => __obj.updateDynamic("TransformId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMLTransformResponse]
    }
  }

  @js.native
  trait DeletePartitionIndexRequest extends js.Object {
    var DatabaseName: NameString
    var IndexName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeletePartitionIndexRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        IndexName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeletePartitionIndexRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePartitionIndexRequest]
    }
  }

  @js.native
  trait DeletePartitionIndexResponse extends js.Object

  object DeletePartitionIndexResponse {
    @inline
    def apply(): DeletePartitionIndexResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePartitionIndexResponse]
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
    @inline
    def apply(
        DatabaseName: NameString,
        PartitionValues: ValueStringList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeletePartitionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionValues" -> PartitionValues.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePartitionRequest]
    }
  }

  @js.native
  trait DeletePartitionResponse extends js.Object

  object DeletePartitionResponse {
    @inline
    def apply(): DeletePartitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePartitionResponse]
    }
  }

  @js.native
  trait DeleteRegistryInput extends js.Object {
    var RegistryId: RegistryId
  }

  object DeleteRegistryInput {
    @inline
    def apply(
        RegistryId: RegistryId
    ): DeleteRegistryInput = {
      val __obj = js.Dynamic.literal(
        "RegistryId" -> RegistryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRegistryInput]
    }
  }

  @js.native
  trait DeleteRegistryResponse extends js.Object {
    var RegistryArn: js.UndefOr[GlueResourceArn]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var Status: js.UndefOr[RegistryStatus]
  }

  object DeleteRegistryResponse {
    @inline
    def apply(
        RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        Status: js.UndefOr[RegistryStatus] = js.undefined
    ): DeleteRegistryResponse = {
      val __obj = js.Dynamic.literal()
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRegistryResponse]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var PolicyHashCondition: js.UndefOr[HashString]
    var ResourceArn: js.UndefOr[GlueResourceArn]
  }

  object DeleteResourcePolicyRequest {
    @inline
    def apply(
        PolicyHashCondition: js.UndefOr[HashString] = js.undefined,
        ResourceArn: js.UndefOr[GlueResourceArn] = js.undefined
    ): DeleteResourcePolicyRequest = {
      val __obj = js.Dynamic.literal()
      PolicyHashCondition.foreach(__v => __obj.updateDynamic("PolicyHashCondition")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyResponse extends js.Object

  object DeleteResourcePolicyResponse {
    @inline
    def apply(): DeleteResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourcePolicyResponse]
    }
  }

  @js.native
  trait DeleteSchemaInput extends js.Object {
    var SchemaId: SchemaId
  }

  object DeleteSchemaInput {
    @inline
    def apply(
        SchemaId: SchemaId
    ): DeleteSchemaInput = {
      val __obj = js.Dynamic.literal(
        "SchemaId" -> SchemaId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSchemaInput]
    }
  }

  @js.native
  trait DeleteSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaName: js.UndefOr[SchemaRegistryNameString]
    var Status: js.UndefOr[SchemaStatus]
  }

  object DeleteSchemaResponse {
    @inline
    def apply(
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        Status: js.UndefOr[SchemaStatus] = js.undefined
    ): DeleteSchemaResponse = {
      val __obj = js.Dynamic.literal()
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSchemaResponse]
    }
  }

  @js.native
  trait DeleteSchemaVersionsInput extends js.Object {
    var SchemaId: SchemaId
    var Versions: VersionsString
  }

  object DeleteSchemaVersionsInput {
    @inline
    def apply(
        SchemaId: SchemaId,
        Versions: VersionsString
    ): DeleteSchemaVersionsInput = {
      val __obj = js.Dynamic.literal(
        "SchemaId" -> SchemaId.asInstanceOf[js.Any],
        "Versions" -> Versions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSchemaVersionsInput]
    }
  }

  @js.native
  trait DeleteSchemaVersionsResponse extends js.Object {
    var SchemaVersionErrors: js.UndefOr[SchemaVersionErrorList]
  }

  object DeleteSchemaVersionsResponse {
    @inline
    def apply(
        SchemaVersionErrors: js.UndefOr[SchemaVersionErrorList] = js.undefined
    ): DeleteSchemaVersionsResponse = {
      val __obj = js.Dynamic.literal()
      SchemaVersionErrors.foreach(__v => __obj.updateDynamic("SchemaVersionErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSchemaVersionsResponse]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationRequest extends js.Object {
    var Name: NameString
  }

  object DeleteSecurityConfigurationRequest {
    @inline
    def apply(
        Name: NameString
    ): DeleteSecurityConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSecurityConfigurationRequest]
    }
  }

  @js.native
  trait DeleteSecurityConfigurationResponse extends js.Object

  object DeleteSecurityConfigurationResponse {
    @inline
    def apply(): DeleteSecurityConfigurationResponse = {
      val __obj = js.Dynamic.literal()
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
    @inline
    def apply(
        DatabaseName: NameString,
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteTableRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTableRequest]
    }
  }

  @js.native
  trait DeleteTableResponse extends js.Object

  object DeleteTableResponse {
    @inline
    def apply(): DeleteTableResponse = {
      val __obj = js.Dynamic.literal()
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
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        VersionId: VersionString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteTableVersionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTableVersionRequest]
    }
  }

  @js.native
  trait DeleteTableVersionResponse extends js.Object

  object DeleteTableVersionResponse {
    @inline
    def apply(): DeleteTableVersionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTableVersionResponse]
    }
  }

  @js.native
  trait DeleteTriggerRequest extends js.Object {
    var Name: NameString
  }

  object DeleteTriggerRequest {
    @inline
    def apply(
        Name: NameString
    ): DeleteTriggerRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): DeleteTriggerResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        FunctionName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteUserDefinedFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait DeleteUserDefinedFunctionResponse extends js.Object

  object DeleteUserDefinedFunctionResponse {
    @inline
    def apply(): DeleteUserDefinedFunctionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUserDefinedFunctionResponse]
    }
  }

  @js.native
  trait DeleteWorkflowRequest extends js.Object {
    var Name: NameString
  }

  object DeleteWorkflowRequest {
    @inline
    def apply(
        Name: NameString
    ): DeleteWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkflowRequest]
    }
  }

  @js.native
  trait DeleteWorkflowResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object DeleteWorkflowResponse {
    @inline
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): DeleteWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteWorkflowResponse]
    }
  }

  /** A development endpoint where a developer can remotely debug extract, transform, and load (ETL) scripts.
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

  object DevEndpoint {
    @inline
    def apply(
        Arguments: js.UndefOr[MapValue] = js.undefined,
        AvailabilityZone: js.UndefOr[GenericString] = js.undefined,
        CreatedTimestamp: js.UndefOr[TimestampValue] = js.undefined,
        EndpointName: js.UndefOr[GenericString] = js.undefined,
        ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined,
        ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined,
        FailureReason: js.UndefOr[GenericString] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        LastModifiedTimestamp: js.UndefOr[TimestampValue] = js.undefined,
        LastUpdateStatus: js.UndefOr[GenericString] = js.undefined,
        NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
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
        WorkerType: js.UndefOr[WorkerType] = js.undefined,
        YarnEndpointAddress: js.UndefOr[GenericString] = js.undefined,
        ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
    ): DevEndpoint = {
      val __obj = js.Dynamic.literal()
      Arguments.foreach(__v => __obj.updateDynamic("Arguments")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EndpointName.foreach(__v => __obj.updateDynamic("EndpointName")(__v.asInstanceOf[js.Any]))
      ExtraJarsS3Path.foreach(__v => __obj.updateDynamic("ExtraJarsS3Path")(__v.asInstanceOf[js.Any]))
      ExtraPythonLibsS3Path.foreach(__v => __obj.updateDynamic("ExtraPythonLibsS3Path")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      LastModifiedTimestamp.foreach(__v => __obj.updateDynamic("LastModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdateStatus.foreach(__v => __obj.updateDynamic("LastUpdateStatus")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      PrivateAddress.foreach(__v => __obj.updateDynamic("PrivateAddress")(__v.asInstanceOf[js.Any]))
      PublicAddress.foreach(__v => __obj.updateDynamic("PublicAddress")(__v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.updateDynamic("PublicKey")(__v.asInstanceOf[js.Any]))
      PublicKeys.foreach(__v => __obj.updateDynamic("PublicKeys")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      YarnEndpointAddress.foreach(__v => __obj.updateDynamic("YarnEndpointAddress")(__v.asInstanceOf[js.Any]))
      ZeppelinRemoteSparkInterpreterPort.foreach(__v => __obj.updateDynamic("ZeppelinRemoteSparkInterpreterPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DevEndpoint]
    }
  }

  /** Custom libraries to be loaded into a development endpoint.
    */
  @js.native
  trait DevEndpointCustomLibraries extends js.Object {
    var ExtraJarsS3Path: js.UndefOr[GenericString]
    var ExtraPythonLibsS3Path: js.UndefOr[GenericString]
  }

  object DevEndpointCustomLibraries {
    @inline
    def apply(
        ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined,
        ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
    ): DevEndpointCustomLibraries = {
      val __obj = js.Dynamic.literal()
      ExtraJarsS3Path.foreach(__v => __obj.updateDynamic("ExtraJarsS3Path")(__v.asInstanceOf[js.Any]))
      ExtraPythonLibsS3Path.foreach(__v => __obj.updateDynamic("ExtraPythonLibsS3Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DevEndpointCustomLibraries]
    }
  }

  /** Defines column statistics supported for floating-point number data columns.
    */
  @js.native
  trait DoubleColumnStatisticsData extends js.Object {
    var NumberOfDistinctValues: NonNegativeLong
    var NumberOfNulls: NonNegativeLong
    var MaximumValue: js.UndefOr[Double]
    var MinimumValue: js.UndefOr[Double]
  }

  object DoubleColumnStatisticsData {
    @inline
    def apply(
        NumberOfDistinctValues: NonNegativeLong,
        NumberOfNulls: NonNegativeLong,
        MaximumValue: js.UndefOr[Double] = js.undefined,
        MinimumValue: js.UndefOr[Double] = js.undefined
    ): DoubleColumnStatisticsData = {
      val __obj = js.Dynamic.literal(
        "NumberOfDistinctValues" -> NumberOfDistinctValues.asInstanceOf[js.Any],
        "NumberOfNulls" -> NumberOfNulls.asInstanceOf[js.Any]
      )

      MaximumValue.foreach(__v => __obj.updateDynamic("MaximumValue")(__v.asInstanceOf[js.Any]))
      MinimumValue.foreach(__v => __obj.updateDynamic("MinimumValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DoubleColumnStatisticsData]
    }
  }

  /** Specifies an Amazon DynamoDB table to crawl.
    */
  @js.native
  trait DynamoDBTarget extends js.Object {
    var Path: js.UndefOr[Path]
    var scanAll: js.UndefOr[NullableBoolean]
    var scanRate: js.UndefOr[NullableDouble]
  }

  object DynamoDBTarget {
    @inline
    def apply(
        Path: js.UndefOr[Path] = js.undefined,
        scanAll: js.UndefOr[NullableBoolean] = js.undefined,
        scanRate: js.UndefOr[NullableDouble] = js.undefined
    ): DynamoDBTarget = {
      val __obj = js.Dynamic.literal()
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      scanAll.foreach(__v => __obj.updateDynamic("scanAll")(__v.asInstanceOf[js.Any]))
      scanRate.foreach(__v => __obj.updateDynamic("scanRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DynamoDBTarget]
    }
  }

  /** An edge represents a directed connection between two AWS Glue components that are part of the workflow the edge belongs to.
    */
  @js.native
  trait Edge extends js.Object {
    var DestinationId: js.UndefOr[NameString]
    var SourceId: js.UndefOr[NameString]
  }

  object Edge {
    @inline
    def apply(
        DestinationId: js.UndefOr[NameString] = js.undefined,
        SourceId: js.UndefOr[NameString] = js.undefined
    ): Edge = {
      val __obj = js.Dynamic.literal()
      DestinationId.foreach(__v => __obj.updateDynamic("DestinationId")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Edge]
    }
  }

  @js.native
  sealed trait EnableHybridValues extends js.Any
  object EnableHybridValues {
    val TRUE = "TRUE".asInstanceOf[EnableHybridValues]
    val FALSE = "FALSE".asInstanceOf[EnableHybridValues]

    @inline def values = js.Array(TRUE, FALSE)
  }

  /** Specifies the encryption-at-rest configuration for the Data Catalog.
    */
  @js.native
  trait EncryptionAtRest extends js.Object {
    var CatalogEncryptionMode: CatalogEncryptionMode
    var SseAwsKmsKeyId: js.UndefOr[NameString]
  }

  object EncryptionAtRest {
    @inline
    def apply(
        CatalogEncryptionMode: CatalogEncryptionMode,
        SseAwsKmsKeyId: js.UndefOr[NameString] = js.undefined
    ): EncryptionAtRest = {
      val __obj = js.Dynamic.literal(
        "CatalogEncryptionMode" -> CatalogEncryptionMode.asInstanceOf[js.Any]
      )

      SseAwsKmsKeyId.foreach(__v => __obj.updateDynamic("SseAwsKmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionAtRest]
    }
  }

  /** Specifies an encryption configuration.
    */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var CloudWatchEncryption: js.UndefOr[CloudWatchEncryption]
    var JobBookmarksEncryption: js.UndefOr[JobBookmarksEncryption]
    var S3Encryption: js.UndefOr[S3EncryptionList]
  }

  object EncryptionConfiguration {
    @inline
    def apply(
        CloudWatchEncryption: js.UndefOr[CloudWatchEncryption] = js.undefined,
        JobBookmarksEncryption: js.UndefOr[JobBookmarksEncryption] = js.undefined,
        S3Encryption: js.UndefOr[S3EncryptionList] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      CloudWatchEncryption.foreach(__v => __obj.updateDynamic("CloudWatchEncryption")(__v.asInstanceOf[js.Any]))
      JobBookmarksEncryption.foreach(__v => __obj.updateDynamic("JobBookmarksEncryption")(__v.asInstanceOf[js.Any]))
      S3Encryption.foreach(__v => __obj.updateDynamic("S3Encryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfiguration]
    }
  }

  /** Contains details about an error.
    */
  @js.native
  trait ErrorDetail extends js.Object {
    var ErrorCode: js.UndefOr[NameString]
    var ErrorMessage: js.UndefOr[DescriptionString]
  }

  object ErrorDetail {
    @inline
    def apply(
        ErrorCode: js.UndefOr[NameString] = js.undefined,
        ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
    ): ErrorDetail = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetail]
    }
  }

  /** An object containing error details.
    */
  @js.native
  trait ErrorDetails extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCodeString]
    var ErrorMessage: js.UndefOr[ErrorMessageString]
  }

  object ErrorDetails {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCodeString] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessageString] = js.undefined
    ): ErrorDetails = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetails]
    }
  }

  /** Evaluation metrics provide an estimate of the quality of your machine learning transform.
    */
  @js.native
  trait EvaluationMetrics extends js.Object {
    var TransformType: TransformType
    var FindMatchesMetrics: js.UndefOr[FindMatchesMetrics]
  }

  object EvaluationMetrics {
    @inline
    def apply(
        TransformType: TransformType,
        FindMatchesMetrics: js.UndefOr[FindMatchesMetrics] = js.undefined
    ): EvaluationMetrics = {
      val __obj = js.Dynamic.literal(
        "TransformType" -> TransformType.asInstanceOf[js.Any]
      )

      FindMatchesMetrics.foreach(__v => __obj.updateDynamic("FindMatchesMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationMetrics]
    }
  }

  /** An execution property of a job.
    */
  @js.native
  trait ExecutionProperty extends js.Object {
    var MaxConcurrentRuns: js.UndefOr[MaxConcurrentRuns]
  }

  object ExecutionProperty {
    @inline
    def apply(
        MaxConcurrentRuns: js.UndefOr[MaxConcurrentRuns] = js.undefined
    ): ExecutionProperty = {
      val __obj = js.Dynamic.literal()
      MaxConcurrentRuns.foreach(__v => __obj.updateDynamic("MaxConcurrentRuns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionProperty]
    }
  }

  @js.native
  sealed trait ExistCondition extends js.Any
  object ExistCondition {
    val MUST_EXIST = "MUST_EXIST".asInstanceOf[ExistCondition]
    val NOT_EXIST = "NOT_EXIST".asInstanceOf[ExistCondition]
    val NONE = "NONE".asInstanceOf[ExistCondition]

    @inline def values = js.Array(MUST_EXIST, NOT_EXIST, NONE)
  }

  /** Specifies configuration properties for an exporting labels task run.
    */
  @js.native
  trait ExportLabelsTaskRunProperties extends js.Object {
    var OutputS3Path: js.UndefOr[UriString]
  }

  object ExportLabelsTaskRunProperties {
    @inline
    def apply(
        OutputS3Path: js.UndefOr[UriString] = js.undefined
    ): ExportLabelsTaskRunProperties = {
      val __obj = js.Dynamic.literal()
      OutputS3Path.foreach(__v => __obj.updateDynamic("OutputS3Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportLabelsTaskRunProperties]
    }
  }

  /** The evaluation metrics for the find matches algorithm. The quality of your machine learning transform is measured by getting your transform to predict some matches and comparing the results to known matches from the same dataset. The quality metrics are based on a subset of your data, so they are not precise.
    */
  @js.native
  trait FindMatchesMetrics extends js.Object {
    var AreaUnderPRCurve: js.UndefOr[GenericBoundedDouble]
    var ColumnImportances: js.UndefOr[ColumnImportanceList]
    var ConfusionMatrix: js.UndefOr[ConfusionMatrix]
    var F1: js.UndefOr[GenericBoundedDouble]
    var Precision: js.UndefOr[GenericBoundedDouble]
    var Recall: js.UndefOr[GenericBoundedDouble]
  }

  object FindMatchesMetrics {
    @inline
    def apply(
        AreaUnderPRCurve: js.UndefOr[GenericBoundedDouble] = js.undefined,
        ColumnImportances: js.UndefOr[ColumnImportanceList] = js.undefined,
        ConfusionMatrix: js.UndefOr[ConfusionMatrix] = js.undefined,
        F1: js.UndefOr[GenericBoundedDouble] = js.undefined,
        Precision: js.UndefOr[GenericBoundedDouble] = js.undefined,
        Recall: js.UndefOr[GenericBoundedDouble] = js.undefined
    ): FindMatchesMetrics = {
      val __obj = js.Dynamic.literal()
      AreaUnderPRCurve.foreach(__v => __obj.updateDynamic("AreaUnderPRCurve")(__v.asInstanceOf[js.Any]))
      ColumnImportances.foreach(__v => __obj.updateDynamic("ColumnImportances")(__v.asInstanceOf[js.Any]))
      ConfusionMatrix.foreach(__v => __obj.updateDynamic("ConfusionMatrix")(__v.asInstanceOf[js.Any]))
      F1.foreach(__v => __obj.updateDynamic("F1")(__v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.updateDynamic("Precision")(__v.asInstanceOf[js.Any]))
      Recall.foreach(__v => __obj.updateDynamic("Recall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindMatchesMetrics]
    }
  }

  /** The parameters to configure the find matches transform.
    */
  @js.native
  trait FindMatchesParameters extends js.Object {
    var AccuracyCostTradeoff: js.UndefOr[GenericBoundedDouble]
    var EnforceProvidedLabels: js.UndefOr[NullableBoolean]
    var PrecisionRecallTradeoff: js.UndefOr[GenericBoundedDouble]
    var PrimaryKeyColumnName: js.UndefOr[ColumnNameString]
  }

  object FindMatchesParameters {
    @inline
    def apply(
        AccuracyCostTradeoff: js.UndefOr[GenericBoundedDouble] = js.undefined,
        EnforceProvidedLabels: js.UndefOr[NullableBoolean] = js.undefined,
        PrecisionRecallTradeoff: js.UndefOr[GenericBoundedDouble] = js.undefined,
        PrimaryKeyColumnName: js.UndefOr[ColumnNameString] = js.undefined
    ): FindMatchesParameters = {
      val __obj = js.Dynamic.literal()
      AccuracyCostTradeoff.foreach(__v => __obj.updateDynamic("AccuracyCostTradeoff")(__v.asInstanceOf[js.Any]))
      EnforceProvidedLabels.foreach(__v => __obj.updateDynamic("EnforceProvidedLabels")(__v.asInstanceOf[js.Any]))
      PrecisionRecallTradeoff.foreach(__v => __obj.updateDynamic("PrecisionRecallTradeoff")(__v.asInstanceOf[js.Any]))
      PrimaryKeyColumnName.foreach(__v => __obj.updateDynamic("PrimaryKeyColumnName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindMatchesParameters]
    }
  }

  /** Specifies configuration properties for a Find Matches task run.
    */
  @js.native
  trait FindMatchesTaskRunProperties extends js.Object {
    var JobId: js.UndefOr[HashString]
    var JobName: js.UndefOr[NameString]
    var JobRunId: js.UndefOr[HashString]
  }

  object FindMatchesTaskRunProperties {
    @inline
    def apply(
        JobId: js.UndefOr[HashString] = js.undefined,
        JobName: js.UndefOr[NameString] = js.undefined,
        JobRunId: js.UndefOr[HashString] = js.undefined
    ): FindMatchesTaskRunProperties = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobRunId.foreach(__v => __obj.updateDynamic("JobRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindMatchesTaskRunProperties]
    }
  }

  @js.native
  trait GetCatalogImportStatusRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetCatalogImportStatusRequest {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetCatalogImportStatusRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCatalogImportStatusRequest]
    }
  }

  @js.native
  trait GetCatalogImportStatusResponse extends js.Object {
    var ImportStatus: js.UndefOr[CatalogImportStatus]
  }

  object GetCatalogImportStatusResponse {
    @inline
    def apply(
        ImportStatus: js.UndefOr[CatalogImportStatus] = js.undefined
    ): GetCatalogImportStatusResponse = {
      val __obj = js.Dynamic.literal()
      ImportStatus.foreach(__v => __obj.updateDynamic("ImportStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCatalogImportStatusResponse]
    }
  }

  @js.native
  trait GetClassifierRequest extends js.Object {
    var Name: NameString
  }

  object GetClassifierRequest {
    @inline
    def apply(
        Name: NameString
    ): GetClassifierRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Classifier: js.UndefOr[Classifier] = js.undefined
    ): GetClassifierResponse = {
      val __obj = js.Dynamic.literal()
      Classifier.foreach(__v => __obj.updateDynamic("Classifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetClassifierResponse]
    }
  }

  @js.native
  trait GetClassifiersRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetClassifiersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetClassifiersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetClassifiersRequest]
    }
  }

  @js.native
  trait GetClassifiersResponse extends js.Object {
    var Classifiers: js.UndefOr[ClassifierList]
    var NextToken: js.UndefOr[Token]
  }

  object GetClassifiersResponse {
    @inline
    def apply(
        Classifiers: js.UndefOr[ClassifierList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetClassifiersResponse = {
      val __obj = js.Dynamic.literal()
      Classifiers.foreach(__v => __obj.updateDynamic("Classifiers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetClassifiersResponse]
    }
  }

  @js.native
  trait GetColumnStatisticsForPartitionRequest extends js.Object {
    var ColumnNames: GetColumnNamesList
    var DatabaseName: NameString
    var PartitionValues: ValueStringList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetColumnStatisticsForPartitionRequest {
    @inline
    def apply(
        ColumnNames: GetColumnNamesList,
        DatabaseName: NameString,
        PartitionValues: ValueStringList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetColumnStatisticsForPartitionRequest = {
      val __obj = js.Dynamic.literal(
        "ColumnNames" -> ColumnNames.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionValues" -> PartitionValues.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetColumnStatisticsForPartitionRequest]
    }
  }

  @js.native
  trait GetColumnStatisticsForPartitionResponse extends js.Object {
    var ColumnStatisticsList: js.UndefOr[ColumnStatisticsList]
    var Errors: js.UndefOr[ColumnErrors]
  }

  object GetColumnStatisticsForPartitionResponse {
    @inline
    def apply(
        ColumnStatisticsList: js.UndefOr[ColumnStatisticsList] = js.undefined,
        Errors: js.UndefOr[ColumnErrors] = js.undefined
    ): GetColumnStatisticsForPartitionResponse = {
      val __obj = js.Dynamic.literal()
      ColumnStatisticsList.foreach(__v => __obj.updateDynamic("ColumnStatisticsList")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetColumnStatisticsForPartitionResponse]
    }
  }

  @js.native
  trait GetColumnStatisticsForTableRequest extends js.Object {
    var ColumnNames: GetColumnNamesList
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetColumnStatisticsForTableRequest {
    @inline
    def apply(
        ColumnNames: GetColumnNamesList,
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetColumnStatisticsForTableRequest = {
      val __obj = js.Dynamic.literal(
        "ColumnNames" -> ColumnNames.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetColumnStatisticsForTableRequest]
    }
  }

  @js.native
  trait GetColumnStatisticsForTableResponse extends js.Object {
    var ColumnStatisticsList: js.UndefOr[ColumnStatisticsList]
    var Errors: js.UndefOr[ColumnErrors]
  }

  object GetColumnStatisticsForTableResponse {
    @inline
    def apply(
        ColumnStatisticsList: js.UndefOr[ColumnStatisticsList] = js.undefined,
        Errors: js.UndefOr[ColumnErrors] = js.undefined
    ): GetColumnStatisticsForTableResponse = {
      val __obj = js.Dynamic.literal()
      ColumnStatisticsList.foreach(__v => __obj.updateDynamic("ColumnStatisticsList")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetColumnStatisticsForTableResponse]
    }
  }

  @js.native
  trait GetConnectionRequest extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var HidePassword: js.UndefOr[Boolean]
  }

  object GetConnectionRequest {
    @inline
    def apply(
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        HidePassword: js.UndefOr[Boolean] = js.undefined
    ): GetConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      HidePassword.foreach(__v => __obj.updateDynamic("HidePassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionRequest]
    }
  }

  @js.native
  trait GetConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object GetConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): GetConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionResponse]
    }
  }

  /** Filters the connection definitions that are returned by the <code>GetConnections</code> API operation.
    */
  @js.native
  trait GetConnectionsFilter extends js.Object {
    var ConnectionType: js.UndefOr[ConnectionType]
    var MatchCriteria: js.UndefOr[MatchCriteria]
  }

  object GetConnectionsFilter {
    @inline
    def apply(
        ConnectionType: js.UndefOr[ConnectionType] = js.undefined,
        MatchCriteria: js.UndefOr[MatchCriteria] = js.undefined
    ): GetConnectionsFilter = {
      val __obj = js.Dynamic.literal()
      ConnectionType.foreach(__v => __obj.updateDynamic("ConnectionType")(__v.asInstanceOf[js.Any]))
      MatchCriteria.foreach(__v => __obj.updateDynamic("MatchCriteria")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        Filter: js.UndefOr[GetConnectionsFilter] = js.undefined,
        HidePassword: js.UndefOr[Boolean] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetConnectionsRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      HidePassword.foreach(__v => __obj.updateDynamic("HidePassword")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionsRequest]
    }
  }

  @js.native
  trait GetConnectionsResponse extends js.Object {
    var ConnectionList: js.UndefOr[ConnectionList]
    var NextToken: js.UndefOr[Token]
  }

  object GetConnectionsResponse {
    @inline
    def apply(
        ConnectionList: js.UndefOr[ConnectionList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetConnectionsResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionList.foreach(__v => __obj.updateDynamic("ConnectionList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CrawlerNameList: js.UndefOr[CrawlerNameList] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCrawlerMetricsRequest = {
      val __obj = js.Dynamic.literal()
      CrawlerNameList.foreach(__v => __obj.updateDynamic("CrawlerNameList")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlerMetricsRequest]
    }
  }

  @js.native
  trait GetCrawlerMetricsResponse extends js.Object {
    var CrawlerMetricsList: js.UndefOr[CrawlerMetricsList]
    var NextToken: js.UndefOr[Token]
  }

  object GetCrawlerMetricsResponse {
    @inline
    def apply(
        CrawlerMetricsList: js.UndefOr[CrawlerMetricsList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCrawlerMetricsResponse = {
      val __obj = js.Dynamic.literal()
      CrawlerMetricsList.foreach(__v => __obj.updateDynamic("CrawlerMetricsList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlerMetricsResponse]
    }
  }

  @js.native
  trait GetCrawlerRequest extends js.Object {
    var Name: NameString
  }

  object GetCrawlerRequest {
    @inline
    def apply(
        Name: NameString
    ): GetCrawlerRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Crawler: js.UndefOr[Crawler] = js.undefined
    ): GetCrawlerResponse = {
      val __obj = js.Dynamic.literal()
      Crawler.foreach(__v => __obj.updateDynamic("Crawler")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlerResponse]
    }
  }

  @js.native
  trait GetCrawlersRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetCrawlersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCrawlersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlersRequest]
    }
  }

  @js.native
  trait GetCrawlersResponse extends js.Object {
    var Crawlers: js.UndefOr[CrawlerList]
    var NextToken: js.UndefOr[Token]
  }

  object GetCrawlersResponse {
    @inline
    def apply(
        Crawlers: js.UndefOr[CrawlerList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCrawlersResponse = {
      val __obj = js.Dynamic.literal()
      Crawlers.foreach(__v => __obj.updateDynamic("Crawlers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCrawlersResponse]
    }
  }

  @js.native
  trait GetDataCatalogEncryptionSettingsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetDataCatalogEncryptionSettingsRequest {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetDataCatalogEncryptionSettingsRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataCatalogEncryptionSettingsRequest]
    }
  }

  @js.native
  trait GetDataCatalogEncryptionSettingsResponse extends js.Object {
    var DataCatalogEncryptionSettings: js.UndefOr[DataCatalogEncryptionSettings]
  }

  object GetDataCatalogEncryptionSettingsResponse {
    @inline
    def apply(
        DataCatalogEncryptionSettings: js.UndefOr[DataCatalogEncryptionSettings] = js.undefined
    ): GetDataCatalogEncryptionSettingsResponse = {
      val __obj = js.Dynamic.literal()
      DataCatalogEncryptionSettings.foreach(__v => __obj.updateDynamic("DataCatalogEncryptionSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataCatalogEncryptionSettingsResponse]
    }
  }

  @js.native
  trait GetDatabaseRequest extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetDatabaseRequest {
    @inline
    def apply(
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabaseRequest]
    }
  }

  @js.native
  trait GetDatabaseResponse extends js.Object {
    var Database: js.UndefOr[Database]
  }

  object GetDatabaseResponse {
    @inline
    def apply(
        Database: js.UndefOr[Database] = js.undefined
    ): GetDatabaseResponse = {
      val __obj = js.Dynamic.literal()
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabaseResponse]
    }
  }

  @js.native
  trait GetDatabasesRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[CatalogGetterPageSize]
    var NextToken: js.UndefOr[Token]
    var ResourceShareType: js.UndefOr[ResourceShareType]
  }

  object GetDatabasesRequest {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[CatalogGetterPageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ResourceShareType: js.UndefOr[ResourceShareType] = js.undefined
    ): GetDatabasesRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceShareType.foreach(__v => __obj.updateDynamic("ResourceShareType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabasesRequest]
    }
  }

  @js.native
  trait GetDatabasesResponse extends js.Object {
    var DatabaseList: DatabaseList
    var NextToken: js.UndefOr[Token]
  }

  object GetDatabasesResponse {
    @inline
    def apply(
        DatabaseList: DatabaseList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetDatabasesResponse = {
      val __obj = js.Dynamic.literal(
        "DatabaseList" -> DatabaseList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabasesResponse]
    }
  }

  @js.native
  trait GetDataflowGraphRequest extends js.Object {
    var PythonScript: js.UndefOr[PythonScript]
  }

  object GetDataflowGraphRequest {
    @inline
    def apply(
        PythonScript: js.UndefOr[PythonScript] = js.undefined
    ): GetDataflowGraphRequest = {
      val __obj = js.Dynamic.literal()
      PythonScript.foreach(__v => __obj.updateDynamic("PythonScript")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataflowGraphRequest]
    }
  }

  @js.native
  trait GetDataflowGraphResponse extends js.Object {
    var DagEdges: js.UndefOr[DagEdges]
    var DagNodes: js.UndefOr[DagNodes]
  }

  object GetDataflowGraphResponse {
    @inline
    def apply(
        DagEdges: js.UndefOr[DagEdges] = js.undefined,
        DagNodes: js.UndefOr[DagNodes] = js.undefined
    ): GetDataflowGraphResponse = {
      val __obj = js.Dynamic.literal()
      DagEdges.foreach(__v => __obj.updateDynamic("DagEdges")(__v.asInstanceOf[js.Any]))
      DagNodes.foreach(__v => __obj.updateDynamic("DagNodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataflowGraphResponse]
    }
  }

  @js.native
  trait GetDevEndpointRequest extends js.Object {
    var EndpointName: GenericString
  }

  object GetDevEndpointRequest {
    @inline
    def apply(
        EndpointName: GenericString
    ): GetDevEndpointRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        DevEndpoint: js.UndefOr[DevEndpoint] = js.undefined
    ): GetDevEndpointResponse = {
      val __obj = js.Dynamic.literal()
      DevEndpoint.foreach(__v => __obj.updateDynamic("DevEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevEndpointResponse]
    }
  }

  @js.native
  trait GetDevEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetDevEndpointsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetDevEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevEndpointsRequest]
    }
  }

  @js.native
  trait GetDevEndpointsResponse extends js.Object {
    var DevEndpoints: js.UndefOr[DevEndpointList]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetDevEndpointsResponse {
    @inline
    def apply(
        DevEndpoints: js.UndefOr[DevEndpointList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetDevEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      DevEndpoints.foreach(__v => __obj.updateDynamic("DevEndpoints")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevEndpointsResponse]
    }
  }

  @js.native
  trait GetJobBookmarkRequest extends js.Object {
    var JobName: JobName
    var RunId: js.UndefOr[RunId]
  }

  object GetJobBookmarkRequest {
    @inline
    def apply(
        JobName: JobName,
        RunId: js.UndefOr[RunId] = js.undefined
    ): GetJobBookmarkRequest = {
      val __obj = js.Dynamic.literal(
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      RunId.foreach(__v => __obj.updateDynamic("RunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobBookmarkRequest]
    }
  }

  @js.native
  trait GetJobBookmarkResponse extends js.Object {
    var JobBookmarkEntry: js.UndefOr[JobBookmarkEntry]
  }

  object GetJobBookmarkResponse {
    @inline
    def apply(
        JobBookmarkEntry: js.UndefOr[JobBookmarkEntry] = js.undefined
    ): GetJobBookmarkResponse = {
      val __obj = js.Dynamic.literal()
      JobBookmarkEntry.foreach(__v => __obj.updateDynamic("JobBookmarkEntry")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobBookmarkResponse]
    }
  }

  @js.native
  trait GetJobRequest extends js.Object {
    var JobName: NameString
  }

  object GetJobRequest {
    @inline
    def apply(
        JobName: NameString
    ): GetJobRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Job: js.UndefOr[Job] = js.undefined
    ): GetJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        JobName: NameString,
        RunId: IdString,
        PredecessorsIncluded: js.UndefOr[BooleanValue] = js.undefined
    ): GetJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "JobName" -> JobName.asInstanceOf[js.Any],
        "RunId" -> RunId.asInstanceOf[js.Any]
      )

      PredecessorsIncluded.foreach(__v => __obj.updateDynamic("PredecessorsIncluded")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobRunRequest]
    }
  }

  @js.native
  trait GetJobRunResponse extends js.Object {
    var JobRun: js.UndefOr[JobRun]
  }

  object GetJobRunResponse {
    @inline
    def apply(
        JobRun: js.UndefOr[JobRun] = js.undefined
    ): GetJobRunResponse = {
      val __obj = js.Dynamic.literal()
      JobRun.foreach(__v => __obj.updateDynamic("JobRun")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        JobName: NameString,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetJobRunsRequest = {
      val __obj = js.Dynamic.literal(
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobRunsRequest]
    }
  }

  @js.native
  trait GetJobRunsResponse extends js.Object {
    var JobRuns: js.UndefOr[JobRunList]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetJobRunsResponse {
    @inline
    def apply(
        JobRuns: js.UndefOr[JobRunList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetJobRunsResponse = {
      val __obj = js.Dynamic.literal()
      JobRuns.foreach(__v => __obj.updateDynamic("JobRuns")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobRunsResponse]
    }
  }

  @js.native
  trait GetJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetJobsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetJobsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobsRequest]
    }
  }

  @js.native
  trait GetJobsResponse extends js.Object {
    var Jobs: js.UndefOr[JobList]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetJobsResponse {
    @inline
    def apply(
        Jobs: js.UndefOr[JobList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetJobsResponse = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobsResponse]
    }
  }

  @js.native
  trait GetMLTaskRunRequest extends js.Object {
    var TaskRunId: HashString
    var TransformId: HashString
  }

  object GetMLTaskRunRequest {
    @inline
    def apply(
        TaskRunId: HashString,
        TransformId: HashString
    ): GetMLTaskRunRequest = {
      val __obj = js.Dynamic.literal(
        "TaskRunId" -> TaskRunId.asInstanceOf[js.Any],
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMLTaskRunRequest]
    }
  }

  @js.native
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

  object GetMLTaskRunResponse {
    @inline
    def apply(
        CompletedOn: js.UndefOr[Timestamp] = js.undefined,
        ErrorString: js.UndefOr[GenericString] = js.undefined,
        ExecutionTime: js.UndefOr[ExecutionTime] = js.undefined,
        LastModifiedOn: js.UndefOr[Timestamp] = js.undefined,
        LogGroupName: js.UndefOr[GenericString] = js.undefined,
        Properties: js.UndefOr[TaskRunProperties] = js.undefined,
        StartedOn: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[TaskStatusType] = js.undefined,
        TaskRunId: js.UndefOr[HashString] = js.undefined,
        TransformId: js.UndefOr[HashString] = js.undefined
    ): GetMLTaskRunResponse = {
      val __obj = js.Dynamic.literal()
      CompletedOn.foreach(__v => __obj.updateDynamic("CompletedOn")(__v.asInstanceOf[js.Any]))
      ErrorString.foreach(__v => __obj.updateDynamic("ErrorString")(__v.asInstanceOf[js.Any]))
      ExecutionTime.foreach(__v => __obj.updateDynamic("ExecutionTime")(__v.asInstanceOf[js.Any]))
      LastModifiedOn.foreach(__v => __obj.updateDynamic("LastModifiedOn")(__v.asInstanceOf[js.Any]))
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      StartedOn.foreach(__v => __obj.updateDynamic("StartedOn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskRunId.foreach(__v => __obj.updateDynamic("TaskRunId")(__v.asInstanceOf[js.Any]))
      TransformId.foreach(__v => __obj.updateDynamic("TransformId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMLTaskRunResponse]
    }
  }

  @js.native
  trait GetMLTaskRunsRequest extends js.Object {
    var TransformId: HashString
    var Filter: js.UndefOr[TaskRunFilterCriteria]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Sort: js.UndefOr[TaskRunSortCriteria]
  }

  object GetMLTaskRunsRequest {
    @inline
    def apply(
        TransformId: HashString,
        Filter: js.UndefOr[TaskRunFilterCriteria] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Sort: js.UndefOr[TaskRunSortCriteria] = js.undefined
    ): GetMLTaskRunsRequest = {
      val __obj = js.Dynamic.literal(
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sort.foreach(__v => __obj.updateDynamic("Sort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMLTaskRunsRequest]
    }
  }

  @js.native
  trait GetMLTaskRunsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var TaskRuns: js.UndefOr[TaskRunList]
  }

  object GetMLTaskRunsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        TaskRuns: js.UndefOr[TaskRunList] = js.undefined
    ): GetMLTaskRunsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TaskRuns.foreach(__v => __obj.updateDynamic("TaskRuns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMLTaskRunsResponse]
    }
  }

  @js.native
  trait GetMLTransformRequest extends js.Object {
    var TransformId: HashString
  }

  object GetMLTransformRequest {
    @inline
    def apply(
        TransformId: HashString
    ): GetMLTransformRequest = {
      val __obj = js.Dynamic.literal(
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMLTransformRequest]
    }
  }

  @js.native
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
    var TransformEncryption: js.UndefOr[TransformEncryption]
    var TransformId: js.UndefOr[HashString]
    var WorkerType: js.UndefOr[WorkerType]
  }

  object GetMLTransformResponse {
    @inline
    def apply(
        CreatedOn: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        EvaluationMetrics: js.UndefOr[EvaluationMetrics] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        InputRecordTables: js.UndefOr[GlueTables] = js.undefined,
        LabelCount: js.UndefOr[LabelCount] = js.undefined,
        LastModifiedOn: js.UndefOr[Timestamp] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[NullableInteger] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        Parameters: js.UndefOr[TransformParameters] = js.undefined,
        Role: js.UndefOr[RoleString] = js.undefined,
        Schema: js.UndefOr[TransformSchema] = js.undefined,
        Status: js.UndefOr[TransformStatusType] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        TransformEncryption: js.UndefOr[TransformEncryption] = js.undefined,
        TransformId: js.UndefOr[HashString] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): GetMLTransformResponse = {
      val __obj = js.Dynamic.literal()
      CreatedOn.foreach(__v => __obj.updateDynamic("CreatedOn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EvaluationMetrics.foreach(__v => __obj.updateDynamic("EvaluationMetrics")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      InputRecordTables.foreach(__v => __obj.updateDynamic("InputRecordTables")(__v.asInstanceOf[js.Any]))
      LabelCount.foreach(__v => __obj.updateDynamic("LabelCount")(__v.asInstanceOf[js.Any]))
      LastModifiedOn.foreach(__v => __obj.updateDynamic("LastModifiedOn")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      TransformEncryption.foreach(__v => __obj.updateDynamic("TransformEncryption")(__v.asInstanceOf[js.Any]))
      TransformId.foreach(__v => __obj.updateDynamic("TransformId")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMLTransformResponse]
    }
  }

  @js.native
  trait GetMLTransformsRequest extends js.Object {
    var Filter: js.UndefOr[TransformFilterCriteria]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Sort: js.UndefOr[TransformSortCriteria]
  }

  object GetMLTransformsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[TransformFilterCriteria] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Sort: js.UndefOr[TransformSortCriteria] = js.undefined
    ): GetMLTransformsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sort.foreach(__v => __obj.updateDynamic("Sort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMLTransformsRequest]
    }
  }

  @js.native
  trait GetMLTransformsResponse extends js.Object {
    var Transforms: TransformList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object GetMLTransformsResponse {
    @inline
    def apply(
        Transforms: TransformList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetMLTransformsResponse = {
      val __obj = js.Dynamic.literal(
        "Transforms" -> Transforms.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMLTransformsResponse]
    }
  }

  @js.native
  trait GetMappingRequest extends js.Object {
    var Source: CatalogEntry
    var Location: js.UndefOr[Location]
    var Sinks: js.UndefOr[CatalogEntries]
  }

  object GetMappingRequest {
    @inline
    def apply(
        Source: CatalogEntry,
        Location: js.UndefOr[Location] = js.undefined,
        Sinks: js.UndefOr[CatalogEntries] = js.undefined
    ): GetMappingRequest = {
      val __obj = js.Dynamic.literal(
        "Source" -> Source.asInstanceOf[js.Any]
      )

      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Sinks.foreach(__v => __obj.updateDynamic("Sinks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMappingRequest]
    }
  }

  @js.native
  trait GetMappingResponse extends js.Object {
    var Mapping: MappingList
  }

  object GetMappingResponse {
    @inline
    def apply(
        Mapping: MappingList
    ): GetMappingResponse = {
      val __obj = js.Dynamic.literal(
        "Mapping" -> Mapping.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMappingResponse]
    }
  }

  @js.native
  trait GetPartitionIndexesRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var NextToken: js.UndefOr[Token]
  }

  object GetPartitionIndexesRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetPartitionIndexesRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionIndexesRequest]
    }
  }

  @js.native
  trait GetPartitionIndexesResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PartitionIndexDescriptorList: js.UndefOr[PartitionIndexDescriptorList]
  }

  object GetPartitionIndexesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        PartitionIndexDescriptorList: js.UndefOr[PartitionIndexDescriptorList] = js.undefined
    ): GetPartitionIndexesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PartitionIndexDescriptorList.foreach(__v => __obj.updateDynamic("PartitionIndexDescriptorList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionIndexesResponse]
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
    @inline
    def apply(
        DatabaseName: NameString,
        PartitionValues: ValueStringList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetPartitionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionValues" -> PartitionValues.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionRequest]
    }
  }

  @js.native
  trait GetPartitionResponse extends js.Object {
    var Partition: js.UndefOr[Partition]
  }

  object GetPartitionResponse {
    @inline
    def apply(
        Partition: js.UndefOr[Partition] = js.undefined
    ): GetPartitionResponse = {
      val __obj = js.Dynamic.literal()
      Partition.foreach(__v => __obj.updateDynamic("Partition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionResponse]
    }
  }

  @js.native
  trait GetPartitionsRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var ExcludeColumnSchema: js.UndefOr[BooleanNullable]
    var Expression: js.UndefOr[PredicateString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var Segment: js.UndefOr[Segment]
  }

  object GetPartitionsRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        ExcludeColumnSchema: js.UndefOr[BooleanNullable] = js.undefined,
        Expression: js.UndefOr[PredicateString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        Segment: js.UndefOr[Segment] = js.undefined
    ): GetPartitionsRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      ExcludeColumnSchema.foreach(__v => __obj.updateDynamic("ExcludeColumnSchema")(__v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Segment.foreach(__v => __obj.updateDynamic("Segment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionsRequest]
    }
  }

  @js.native
  trait GetPartitionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Partitions: js.UndefOr[PartitionList]
  }

  object GetPartitionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Partitions: js.UndefOr[PartitionList] = js.undefined
    ): GetPartitionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Partitions.foreach(__v => __obj.updateDynamic("Partitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartitionsResponse]
    }
  }

  @js.native
  trait GetPlanRequest extends js.Object {
    var Mapping: MappingList
    var Source: CatalogEntry
    var AdditionalPlanOptionsMap: js.UndefOr[AdditionalPlanOptionsMap]
    var Language: js.UndefOr[Language]
    var Location: js.UndefOr[Location]
    var Sinks: js.UndefOr[CatalogEntries]
  }

  object GetPlanRequest {
    @inline
    def apply(
        Mapping: MappingList,
        Source: CatalogEntry,
        AdditionalPlanOptionsMap: js.UndefOr[AdditionalPlanOptionsMap] = js.undefined,
        Language: js.UndefOr[Language] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Sinks: js.UndefOr[CatalogEntries] = js.undefined
    ): GetPlanRequest = {
      val __obj = js.Dynamic.literal(
        "Mapping" -> Mapping.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any]
      )

      AdditionalPlanOptionsMap.foreach(__v => __obj.updateDynamic("AdditionalPlanOptionsMap")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Sinks.foreach(__v => __obj.updateDynamic("Sinks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlanRequest]
    }
  }

  @js.native
  trait GetPlanResponse extends js.Object {
    var PythonScript: js.UndefOr[PythonScript]
    var ScalaCode: js.UndefOr[ScalaCode]
  }

  object GetPlanResponse {
    @inline
    def apply(
        PythonScript: js.UndefOr[PythonScript] = js.undefined,
        ScalaCode: js.UndefOr[ScalaCode] = js.undefined
    ): GetPlanResponse = {
      val __obj = js.Dynamic.literal()
      PythonScript.foreach(__v => __obj.updateDynamic("PythonScript")(__v.asInstanceOf[js.Any]))
      ScalaCode.foreach(__v => __obj.updateDynamic("ScalaCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlanResponse]
    }
  }

  @js.native
  trait GetRegistryInput extends js.Object {
    var RegistryId: RegistryId
  }

  object GetRegistryInput {
    @inline
    def apply(
        RegistryId: RegistryId
    ): GetRegistryInput = {
      val __obj = js.Dynamic.literal(
        "RegistryId" -> RegistryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRegistryInput]
    }
  }

  @js.native
  trait GetRegistryResponse extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTimestamp]
    var Description: js.UndefOr[DescriptionString]
    var RegistryArn: js.UndefOr[GlueResourceArn]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var Status: js.UndefOr[RegistryStatus]
    var UpdatedTime: js.UndefOr[UpdatedTimestamp]
  }

  object GetRegistryResponse {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        Status: js.UndefOr[RegistryStatus] = js.undefined,
        UpdatedTime: js.UndefOr[UpdatedTimestamp] = js.undefined
    ): GetRegistryResponse = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.updateDynamic("UpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRegistryResponse]
    }
  }

  @js.native
  trait GetResourcePoliciesRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetResourcePoliciesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetResourcePoliciesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePoliciesRequest]
    }
  }

  @js.native
  trait GetResourcePoliciesResponse extends js.Object {
    var GetResourcePoliciesResponseList: js.UndefOr[GetResourcePoliciesResponseList]
    var NextToken: js.UndefOr[Token]
  }

  object GetResourcePoliciesResponse {
    @inline
    def apply(
        GetResourcePoliciesResponseList: js.UndefOr[GetResourcePoliciesResponseList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetResourcePoliciesResponse = {
      val __obj = js.Dynamic.literal()
      GetResourcePoliciesResponseList.foreach(__v => __obj.updateDynamic("GetResourcePoliciesResponseList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePoliciesResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {
    var ResourceArn: js.UndefOr[GlueResourceArn]
  }

  object GetResourcePolicyRequest {
    @inline
    def apply(
        ResourceArn: js.UndefOr[GlueResourceArn] = js.undefined
    ): GetResourcePolicyRequest = {
      val __obj = js.Dynamic.literal()
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        PolicyHash: js.UndefOr[HashString] = js.undefined,
        PolicyInJson: js.UndefOr[PolicyJsonString] = js.undefined,
        UpdateTime: js.UndefOr[Timestamp] = js.undefined
    ): GetResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      PolicyHash.foreach(__v => __obj.updateDynamic("PolicyHash")(__v.asInstanceOf[js.Any]))
      PolicyInJson.foreach(__v => __obj.updateDynamic("PolicyInJson")(__v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.updateDynamic("UpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePolicyResponse]
    }
  }

  @js.native
  trait GetSchemaByDefinitionInput extends js.Object {
    var SchemaDefinition: SchemaDefinitionString
    var SchemaId: SchemaId
  }

  object GetSchemaByDefinitionInput {
    @inline
    def apply(
        SchemaDefinition: SchemaDefinitionString,
        SchemaId: SchemaId
    ): GetSchemaByDefinitionInput = {
      val __obj = js.Dynamic.literal(
        "SchemaDefinition" -> SchemaDefinition.asInstanceOf[js.Any],
        "SchemaId" -> SchemaId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSchemaByDefinitionInput]
    }
  }

  @js.native
  trait GetSchemaByDefinitionResponse extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTimestamp]
    var DataFormat: js.UndefOr[DataFormat]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var Status: js.UndefOr[SchemaVersionStatus]
  }

  object GetSchemaByDefinitionResponse {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined,
        DataFormat: js.UndefOr[DataFormat] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        Status: js.UndefOr[SchemaVersionStatus] = js.undefined
    ): GetSchemaByDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataFormat.foreach(__v => __obj.updateDynamic("DataFormat")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSchemaByDefinitionResponse]
    }
  }

  @js.native
  trait GetSchemaInput extends js.Object {
    var SchemaId: SchemaId
  }

  object GetSchemaInput {
    @inline
    def apply(
        SchemaId: SchemaId
    ): GetSchemaInput = {
      val __obj = js.Dynamic.literal(
        "SchemaId" -> SchemaId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSchemaInput]
    }
  }

  @js.native
  trait GetSchemaResponse extends js.Object {
    var Compatibility: js.UndefOr[Compatibility]
    var CreatedTime: js.UndefOr[CreatedTimestamp]
    var DataFormat: js.UndefOr[DataFormat]
    var Description: js.UndefOr[DescriptionString]
    var LatestSchemaVersion: js.UndefOr[VersionLongNumber]
    var NextSchemaVersion: js.UndefOr[VersionLongNumber]
    var RegistryArn: js.UndefOr[GlueResourceArn]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaCheckpoint: js.UndefOr[SchemaCheckpointNumber]
    var SchemaName: js.UndefOr[SchemaRegistryNameString]
    var SchemaStatus: js.UndefOr[SchemaStatus]
    var UpdatedTime: js.UndefOr[UpdatedTimestamp]
  }

  object GetSchemaResponse {
    @inline
    def apply(
        Compatibility: js.UndefOr[Compatibility] = js.undefined,
        CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined,
        DataFormat: js.UndefOr[DataFormat] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LatestSchemaVersion: js.UndefOr[VersionLongNumber] = js.undefined,
        NextSchemaVersion: js.UndefOr[VersionLongNumber] = js.undefined,
        RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaCheckpoint: js.UndefOr[SchemaCheckpointNumber] = js.undefined,
        SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaStatus: js.UndefOr[SchemaStatus] = js.undefined,
        UpdatedTime: js.UndefOr[UpdatedTimestamp] = js.undefined
    ): GetSchemaResponse = {
      val __obj = js.Dynamic.literal()
      Compatibility.foreach(__v => __obj.updateDynamic("Compatibility")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataFormat.foreach(__v => __obj.updateDynamic("DataFormat")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LatestSchemaVersion.foreach(__v => __obj.updateDynamic("LatestSchemaVersion")(__v.asInstanceOf[js.Any]))
      NextSchemaVersion.foreach(__v => __obj.updateDynamic("NextSchemaVersion")(__v.asInstanceOf[js.Any]))
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaCheckpoint.foreach(__v => __obj.updateDynamic("SchemaCheckpoint")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaStatus.foreach(__v => __obj.updateDynamic("SchemaStatus")(__v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.updateDynamic("UpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSchemaResponse]
    }
  }

  @js.native
  trait GetSchemaVersionInput extends js.Object {
    var SchemaId: js.UndefOr[SchemaId]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var SchemaVersionNumber: js.UndefOr[SchemaVersionNumber]
  }

  object GetSchemaVersionInput {
    @inline
    def apply(
        SchemaId: js.UndefOr[SchemaId] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        SchemaVersionNumber: js.UndefOr[SchemaVersionNumber] = js.undefined
    ): GetSchemaVersionInput = {
      val __obj = js.Dynamic.literal()
      SchemaId.foreach(__v => __obj.updateDynamic("SchemaId")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      SchemaVersionNumber.foreach(__v => __obj.updateDynamic("SchemaVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSchemaVersionInput]
    }
  }

  @js.native
  trait GetSchemaVersionResponse extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTimestamp]
    var DataFormat: js.UndefOr[DataFormat]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaDefinition: js.UndefOr[SchemaDefinitionString]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var Status: js.UndefOr[SchemaVersionStatus]
    var VersionNumber: js.UndefOr[VersionLongNumber]
  }

  object GetSchemaVersionResponse {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined,
        DataFormat: js.UndefOr[DataFormat] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaDefinition: js.UndefOr[SchemaDefinitionString] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        Status: js.UndefOr[SchemaVersionStatus] = js.undefined,
        VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
    ): GetSchemaVersionResponse = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataFormat.foreach(__v => __obj.updateDynamic("DataFormat")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaDefinition.foreach(__v => __obj.updateDynamic("SchemaDefinition")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSchemaVersionResponse]
    }
  }

  @js.native
  trait GetSchemaVersionsDiffInput extends js.Object {
    var FirstSchemaVersionNumber: SchemaVersionNumber
    var SchemaDiffType: SchemaDiffType
    var SchemaId: SchemaId
    var SecondSchemaVersionNumber: SchemaVersionNumber
  }

  object GetSchemaVersionsDiffInput {
    @inline
    def apply(
        FirstSchemaVersionNumber: SchemaVersionNumber,
        SchemaDiffType: SchemaDiffType,
        SchemaId: SchemaId,
        SecondSchemaVersionNumber: SchemaVersionNumber
    ): GetSchemaVersionsDiffInput = {
      val __obj = js.Dynamic.literal(
        "FirstSchemaVersionNumber" -> FirstSchemaVersionNumber.asInstanceOf[js.Any],
        "SchemaDiffType" -> SchemaDiffType.asInstanceOf[js.Any],
        "SchemaId" -> SchemaId.asInstanceOf[js.Any],
        "SecondSchemaVersionNumber" -> SecondSchemaVersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSchemaVersionsDiffInput]
    }
  }

  @js.native
  trait GetSchemaVersionsDiffResponse extends js.Object {
    var Diff: js.UndefOr[SchemaDefinitionDiff]
  }

  object GetSchemaVersionsDiffResponse {
    @inline
    def apply(
        Diff: js.UndefOr[SchemaDefinitionDiff] = js.undefined
    ): GetSchemaVersionsDiffResponse = {
      val __obj = js.Dynamic.literal()
      Diff.foreach(__v => __obj.updateDynamic("Diff")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSchemaVersionsDiffResponse]
    }
  }

  @js.native
  trait GetSecurityConfigurationRequest extends js.Object {
    var Name: NameString
  }

  object GetSecurityConfigurationRequest {
    @inline
    def apply(
        Name: NameString
    ): GetSecurityConfigurationRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        SecurityConfiguration: js.UndefOr[SecurityConfiguration] = js.undefined
    ): GetSecurityConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSecurityConfigurationResponse]
    }
  }

  @js.native
  trait GetSecurityConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetSecurityConfigurationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetSecurityConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSecurityConfigurationsRequest]
    }
  }

  @js.native
  trait GetSecurityConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var SecurityConfigurations: js.UndefOr[SecurityConfigurationList]
  }

  object GetSecurityConfigurationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
    ): GetSecurityConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SecurityConfigurations.foreach(__v => __obj.updateDynamic("SecurityConfigurations")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetTableRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableRequest]
    }
  }

  @js.native
  trait GetTableResponse extends js.Object {
    var Table: js.UndefOr[Table]
  }

  object GetTableResponse {
    @inline
    def apply(
        Table: js.UndefOr[Table] = js.undefined
    ): GetTableResponse = {
      val __obj = js.Dynamic.literal()
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        VersionId: js.UndefOr[VersionString] = js.undefined
    ): GetTableVersionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableVersionRequest]
    }
  }

  @js.native
  trait GetTableVersionResponse extends js.Object {
    var TableVersion: js.UndefOr[TableVersion]
  }

  object GetTableVersionResponse {
    @inline
    def apply(
        TableVersion: js.UndefOr[TableVersion] = js.undefined
    ): GetTableVersionResponse = {
      val __obj = js.Dynamic.literal()
      TableVersion.foreach(__v => __obj.updateDynamic("TableVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableVersionResponse]
    }
  }

  @js.native
  trait GetTableVersionsRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[CatalogGetterPageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetTableVersionsRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[CatalogGetterPageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetTableVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableVersionsRequest]
    }
  }

  @js.native
  trait GetTableVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableVersions: js.UndefOr[GetTableVersionsList]
  }

  object GetTableVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        TableVersions: js.UndefOr[GetTableVersionsList] = js.undefined
    ): GetTableVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TableVersions.foreach(__v => __obj.updateDynamic("TableVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableVersionsResponse]
    }
  }

  @js.native
  trait GetTablesRequest extends js.Object {
    var DatabaseName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var Expression: js.UndefOr[FilterString]
    var MaxResults: js.UndefOr[CatalogGetterPageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetTablesRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        Expression: js.UndefOr[FilterString] = js.undefined,
        MaxResults: js.UndefOr[CatalogGetterPageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetTablesRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTablesRequest]
    }
  }

  @js.native
  trait GetTablesResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableList: js.UndefOr[TableList]
  }

  object GetTablesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        TableList: js.UndefOr[TableList] = js.undefined
    ): GetTablesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TableList.foreach(__v => __obj.updateDynamic("TableList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTablesResponse]
    }
  }

  @js.native
  trait GetTagsRequest extends js.Object {
    var ResourceArn: GlueResourceArn
  }

  object GetTagsRequest {
    @inline
    def apply(
        ResourceArn: GlueResourceArn
    ): GetTagsRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): GetTagsResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagsResponse]
    }
  }

  @js.native
  trait GetTriggerRequest extends js.Object {
    var Name: NameString
  }

  object GetTriggerRequest {
    @inline
    def apply(
        Name: NameString
    ): GetTriggerRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Trigger: js.UndefOr[Trigger] = js.undefined
    ): GetTriggerResponse = {
      val __obj = js.Dynamic.literal()
      Trigger.foreach(__v => __obj.updateDynamic("Trigger")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DependentJobName: js.UndefOr[NameString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetTriggersRequest = {
      val __obj = js.Dynamic.literal()
      DependentJobName.foreach(__v => __obj.updateDynamic("DependentJobName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTriggersRequest]
    }
  }

  @js.native
  trait GetTriggersResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Triggers: js.UndefOr[TriggerList]
  }

  object GetTriggersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Triggers: js.UndefOr[TriggerList] = js.undefined
    ): GetTriggersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Triggers.foreach(__v => __obj.updateDynamic("Triggers")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        FunctionName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetUserDefinedFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait GetUserDefinedFunctionResponse extends js.Object {
    var UserDefinedFunction: js.UndefOr[UserDefinedFunction]
  }

  object GetUserDefinedFunctionResponse {
    @inline
    def apply(
        UserDefinedFunction: js.UndefOr[UserDefinedFunction] = js.undefined
    ): GetUserDefinedFunctionResponse = {
      val __obj = js.Dynamic.literal()
      UserDefinedFunction.foreach(__v => __obj.updateDynamic("UserDefinedFunction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDefinedFunctionResponse]
    }
  }

  @js.native
  trait GetUserDefinedFunctionsRequest extends js.Object {
    var Pattern: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var DatabaseName: js.UndefOr[NameString]
    var MaxResults: js.UndefOr[CatalogGetterPageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetUserDefinedFunctionsRequest {
    @inline
    def apply(
        Pattern: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        DatabaseName: js.UndefOr[NameString] = js.undefined,
        MaxResults: js.UndefOr[CatalogGetterPageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetUserDefinedFunctionsRequest = {
      val __obj = js.Dynamic.literal(
        "Pattern" -> Pattern.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDefinedFunctionsRequest]
    }
  }

  @js.native
  trait GetUserDefinedFunctionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList]
  }

  object GetUserDefinedFunctionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList] = js.undefined
    ): GetUserDefinedFunctionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserDefinedFunctions.foreach(__v => __obj.updateDynamic("UserDefinedFunctions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserDefinedFunctionsResponse]
    }
  }

  @js.native
  trait GetWorkflowRequest extends js.Object {
    var Name: NameString
    var IncludeGraph: js.UndefOr[NullableBoolean]
  }

  object GetWorkflowRequest {
    @inline
    def apply(
        Name: NameString,
        IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
    ): GetWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      IncludeGraph.foreach(__v => __obj.updateDynamic("IncludeGraph")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowRequest]
    }
  }

  @js.native
  trait GetWorkflowResponse extends js.Object {
    var Workflow: js.UndefOr[Workflow]
  }

  object GetWorkflowResponse {
    @inline
    def apply(
        Workflow: js.UndefOr[Workflow] = js.undefined
    ): GetWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      Workflow.foreach(__v => __obj.updateDynamic("Workflow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowResponse]
    }
  }

  @js.native
  trait GetWorkflowRunPropertiesRequest extends js.Object {
    var Name: NameString
    var RunId: IdString
  }

  object GetWorkflowRunPropertiesRequest {
    @inline
    def apply(
        Name: NameString,
        RunId: IdString
    ): GetWorkflowRunPropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RunId" -> RunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkflowRunPropertiesRequest]
    }
  }

  @js.native
  trait GetWorkflowRunPropertiesResponse extends js.Object {
    var RunProperties: js.UndefOr[WorkflowRunProperties]
  }

  object GetWorkflowRunPropertiesResponse {
    @inline
    def apply(
        RunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
    ): GetWorkflowRunPropertiesResponse = {
      val __obj = js.Dynamic.literal()
      RunProperties.foreach(__v => __obj.updateDynamic("RunProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowRunPropertiesResponse]
    }
  }

  @js.native
  trait GetWorkflowRunRequest extends js.Object {
    var Name: NameString
    var RunId: IdString
    var IncludeGraph: js.UndefOr[NullableBoolean]
  }

  object GetWorkflowRunRequest {
    @inline
    def apply(
        Name: NameString,
        RunId: IdString,
        IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
    ): GetWorkflowRunRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RunId" -> RunId.asInstanceOf[js.Any]
      )

      IncludeGraph.foreach(__v => __obj.updateDynamic("IncludeGraph")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowRunRequest]
    }
  }

  @js.native
  trait GetWorkflowRunResponse extends js.Object {
    var Run: js.UndefOr[WorkflowRun]
  }

  object GetWorkflowRunResponse {
    @inline
    def apply(
        Run: js.UndefOr[WorkflowRun] = js.undefined
    ): GetWorkflowRunResponse = {
      val __obj = js.Dynamic.literal()
      Run.foreach(__v => __obj.updateDynamic("Run")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowRunResponse]
    }
  }

  @js.native
  trait GetWorkflowRunsRequest extends js.Object {
    var Name: NameString
    var IncludeGraph: js.UndefOr[NullableBoolean]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object GetWorkflowRunsRequest {
    @inline
    def apply(
        Name: NameString,
        IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): GetWorkflowRunsRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      IncludeGraph.foreach(__v => __obj.updateDynamic("IncludeGraph")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowRunsRequest]
    }
  }

  @js.native
  trait GetWorkflowRunsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Runs: js.UndefOr[WorkflowRuns]
  }

  object GetWorkflowRunsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Runs: js.UndefOr[WorkflowRuns] = js.undefined
    ): GetWorkflowRunsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Runs.foreach(__v => __obj.updateDynamic("Runs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowRunsResponse]
    }
  }

  /** A structure for returning a resource policy.
    */
  @js.native
  trait GluePolicy extends js.Object {
    var CreateTime: js.UndefOr[Timestamp]
    var PolicyHash: js.UndefOr[HashString]
    var PolicyInJson: js.UndefOr[PolicyJsonString]
    var UpdateTime: js.UndefOr[Timestamp]
  }

  object GluePolicy {
    @inline
    def apply(
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        PolicyHash: js.UndefOr[HashString] = js.undefined,
        PolicyInJson: js.UndefOr[PolicyJsonString] = js.undefined,
        UpdateTime: js.UndefOr[Timestamp] = js.undefined
    ): GluePolicy = {
      val __obj = js.Dynamic.literal()
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      PolicyHash.foreach(__v => __obj.updateDynamic("PolicyHash")(__v.asInstanceOf[js.Any]))
      PolicyInJson.foreach(__v => __obj.updateDynamic("PolicyInJson")(__v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.updateDynamic("UpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GluePolicy]
    }
  }

  /** The database and table in the AWS Glue Data Catalog that is used for input or output data.
    */
  @js.native
  trait GlueTable extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[NameString]
    var ConnectionName: js.UndefOr[NameString]
  }

  object GlueTable {
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[NameString] = js.undefined,
        ConnectionName: js.UndefOr[NameString] = js.undefined
    ): GlueTable = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      ConnectionName.foreach(__v => __obj.updateDynamic("ConnectionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlueTable]
    }
  }

  /** A classifier that uses <code>grok</code> patterns.
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
    @inline
    def apply(
        Classification: Classification,
        GrokPattern: GrokPattern,
        Name: NameString,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CustomPatterns: js.UndefOr[CustomPatterns] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        Version: js.UndefOr[VersionId] = js.undefined
    ): GrokClassifier = {
      val __obj = js.Dynamic.literal(
        "Classification" -> Classification.asInstanceOf[js.Any],
        "GrokPattern" -> GrokPattern.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CustomPatterns.foreach(__v => __obj.updateDynamic("CustomPatterns")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrokClassifier]
    }
  }

  @js.native
  trait ImportCatalogToGlueRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object ImportCatalogToGlueRequest {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): ImportCatalogToGlueRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCatalogToGlueRequest]
    }
  }

  @js.native
  trait ImportCatalogToGlueResponse extends js.Object

  object ImportCatalogToGlueResponse {
    @inline
    def apply(): ImportCatalogToGlueResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportCatalogToGlueResponse]
    }
  }

  /** Specifies configuration properties for an importing labels task run.
    */
  @js.native
  trait ImportLabelsTaskRunProperties extends js.Object {
    var InputS3Path: js.UndefOr[UriString]
    var Replace: js.UndefOr[ReplaceBoolean]
  }

  object ImportLabelsTaskRunProperties {
    @inline
    def apply(
        InputS3Path: js.UndefOr[UriString] = js.undefined,
        Replace: js.UndefOr[ReplaceBoolean] = js.undefined
    ): ImportLabelsTaskRunProperties = {
      val __obj = js.Dynamic.literal()
      InputS3Path.foreach(__v => __obj.updateDynamic("InputS3Path")(__v.asInstanceOf[js.Any]))
      Replace.foreach(__v => __obj.updateDynamic("Replace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportLabelsTaskRunProperties]
    }
  }

  /** Specifies a JDBC data store to crawl.
    */
  @js.native
  trait JdbcTarget extends js.Object {
    var ConnectionName: js.UndefOr[ConnectionName]
    var Exclusions: js.UndefOr[PathList]
    var Path: js.UndefOr[Path]
  }

  object JdbcTarget {
    @inline
    def apply(
        ConnectionName: js.UndefOr[ConnectionName] = js.undefined,
        Exclusions: js.UndefOr[PathList] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined
    ): JdbcTarget = {
      val __obj = js.Dynamic.literal()
      ConnectionName.foreach(__v => __obj.updateDynamic("ConnectionName")(__v.asInstanceOf[js.Any]))
      Exclusions.foreach(__v => __obj.updateDynamic("Exclusions")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JdbcTarget]
    }
  }

  /** Specifies a job definition.
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

  object Job {
    @inline
    def apply(
        AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
        Command: js.UndefOr[JobCommand] = js.undefined,
        Connections: js.UndefOr[ConnectionsList] = js.undefined,
        CreatedOn: js.UndefOr[TimestampValue] = js.undefined,
        DefaultArguments: js.UndefOr[GenericMap] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        ExecutionProperty: js.UndefOr[ExecutionProperty] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        LastModifiedOn: js.UndefOr[TimestampValue] = js.undefined,
        LogUri: js.UndefOr[UriString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        NonOverridableArguments: js.UndefOr[GenericMap] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        Role: js.UndefOr[RoleString] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal()
      AllocatedCapacity.foreach(__v => __obj.updateDynamic("AllocatedCapacity")(__v.asInstanceOf[js.Any]))
      Command.foreach(__v => __obj.updateDynamic("Command")(__v.asInstanceOf[js.Any]))
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      CreatedOn.foreach(__v => __obj.updateDynamic("CreatedOn")(__v.asInstanceOf[js.Any]))
      DefaultArguments.foreach(__v => __obj.updateDynamic("DefaultArguments")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionProperty.foreach(__v => __obj.updateDynamic("ExecutionProperty")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      LastModifiedOn.foreach(__v => __obj.updateDynamic("LastModifiedOn")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NonOverridableArguments.foreach(__v => __obj.updateDynamic("NonOverridableArguments")(__v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.updateDynamic("NotificationProperty")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /** Defines a point that a job can resume processing.
    */
  @js.native
  trait JobBookmarkEntry extends js.Object {
    var Attempt: js.UndefOr[IntegerValue]
    var JobBookmark: js.UndefOr[JsonValue]
    var JobName: js.UndefOr[JobName]
    var PreviousRunId: js.UndefOr[RunId]
    var Run: js.UndefOr[IntegerValue]
    var RunId: js.UndefOr[RunId]
    var Version: js.UndefOr[IntegerValue]
  }

  object JobBookmarkEntry {
    @inline
    def apply(
        Attempt: js.UndefOr[IntegerValue] = js.undefined,
        JobBookmark: js.UndefOr[JsonValue] = js.undefined,
        JobName: js.UndefOr[JobName] = js.undefined,
        PreviousRunId: js.UndefOr[RunId] = js.undefined,
        Run: js.UndefOr[IntegerValue] = js.undefined,
        RunId: js.UndefOr[RunId] = js.undefined,
        Version: js.UndefOr[IntegerValue] = js.undefined
    ): JobBookmarkEntry = {
      val __obj = js.Dynamic.literal()
      Attempt.foreach(__v => __obj.updateDynamic("Attempt")(__v.asInstanceOf[js.Any]))
      JobBookmark.foreach(__v => __obj.updateDynamic("JobBookmark")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      PreviousRunId.foreach(__v => __obj.updateDynamic("PreviousRunId")(__v.asInstanceOf[js.Any]))
      Run.foreach(__v => __obj.updateDynamic("Run")(__v.asInstanceOf[js.Any]))
      RunId.foreach(__v => __obj.updateDynamic("RunId")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobBookmarkEntry]
    }
  }

  /** Specifies how job bookmark data should be encrypted.
    */
  @js.native
  trait JobBookmarksEncryption extends js.Object {
    var JobBookmarksEncryptionMode: js.UndefOr[JobBookmarksEncryptionMode]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  object JobBookmarksEncryption {
    @inline
    def apply(
        JobBookmarksEncryptionMode: js.UndefOr[JobBookmarksEncryptionMode] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
    ): JobBookmarksEncryption = {
      val __obj = js.Dynamic.literal()
      JobBookmarksEncryptionMode.foreach(__v => __obj.updateDynamic("JobBookmarksEncryptionMode")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobBookmarksEncryption]
    }
  }

  @js.native
  sealed trait JobBookmarksEncryptionMode extends js.Any
  object JobBookmarksEncryptionMode {
    val DISABLED = "DISABLED".asInstanceOf[JobBookmarksEncryptionMode]
    val `CSE-KMS` = "CSE-KMS".asInstanceOf[JobBookmarksEncryptionMode]

    @inline def values = js.Array(DISABLED, `CSE-KMS`)
  }

  /** Specifies code executed when a job is run.
    */
  @js.native
  trait JobCommand extends js.Object {
    var Name: js.UndefOr[GenericString]
    var PythonVersion: js.UndefOr[PythonVersionString]
    var ScriptLocation: js.UndefOr[ScriptLocationString]
  }

  object JobCommand {
    @inline
    def apply(
        Name: js.UndefOr[GenericString] = js.undefined,
        PythonVersion: js.UndefOr[PythonVersionString] = js.undefined,
        ScriptLocation: js.UndefOr[ScriptLocationString] = js.undefined
    ): JobCommand = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PythonVersion.foreach(__v => __obj.updateDynamic("PythonVersion")(__v.asInstanceOf[js.Any]))
      ScriptLocation.foreach(__v => __obj.updateDynamic("ScriptLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobCommand]
    }
  }

  /** The details of a Job node present in the workflow.
    */
  @js.native
  trait JobNodeDetails extends js.Object {
    var JobRuns: js.UndefOr[JobRunList]
  }

  object JobNodeDetails {
    @inline
    def apply(
        JobRuns: js.UndefOr[JobRunList] = js.undefined
    ): JobNodeDetails = {
      val __obj = js.Dynamic.literal()
      JobRuns.foreach(__v => __obj.updateDynamic("JobRuns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobNodeDetails]
    }
  }

  /** Contains information about a job run.
    */
  @js.native
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

  object JobRun {
    @inline
    def apply(
        AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
        Arguments: js.UndefOr[GenericMap] = js.undefined,
        Attempt: js.UndefOr[AttemptCount] = js.undefined,
        CompletedOn: js.UndefOr[TimestampValue] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorString] = js.undefined,
        ExecutionTime: js.UndefOr[ExecutionTime] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
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
      val __obj = js.Dynamic.literal()
      AllocatedCapacity.foreach(__v => __obj.updateDynamic("AllocatedCapacity")(__v.asInstanceOf[js.Any]))
      Arguments.foreach(__v => __obj.updateDynamic("Arguments")(__v.asInstanceOf[js.Any]))
      Attempt.foreach(__v => __obj.updateDynamic("Attempt")(__v.asInstanceOf[js.Any]))
      CompletedOn.foreach(__v => __obj.updateDynamic("CompletedOn")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ExecutionTime.foreach(__v => __obj.updateDynamic("ExecutionTime")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      JobRunState.foreach(__v => __obj.updateDynamic("JobRunState")(__v.asInstanceOf[js.Any]))
      LastModifiedOn.foreach(__v => __obj.updateDynamic("LastModifiedOn")(__v.asInstanceOf[js.Any]))
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.updateDynamic("NotificationProperty")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      PredecessorRuns.foreach(__v => __obj.updateDynamic("PredecessorRuns")(__v.asInstanceOf[js.Any]))
      PreviousRunId.foreach(__v => __obj.updateDynamic("PreviousRunId")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      StartedOn.foreach(__v => __obj.updateDynamic("StartedOn")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      TriggerName.foreach(__v => __obj.updateDynamic("TriggerName")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobRun]
    }
  }

  @js.native
  sealed trait JobRunState extends js.Any
  object JobRunState {
    val STARTING = "STARTING".asInstanceOf[JobRunState]
    val RUNNING = "RUNNING".asInstanceOf[JobRunState]
    val STOPPING = "STOPPING".asInstanceOf[JobRunState]
    val STOPPED = "STOPPED".asInstanceOf[JobRunState]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobRunState]
    val FAILED = "FAILED".asInstanceOf[JobRunState]
    val TIMEOUT = "TIMEOUT".asInstanceOf[JobRunState]

    @inline def values = js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
  }

  /** Specifies information used to update an existing job definition. The previous job definition is completely overwritten by this information.
    */
  @js.native
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

  object JobUpdate {
    @inline
    def apply(
        AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined,
        Command: js.UndefOr[JobCommand] = js.undefined,
        Connections: js.UndefOr[ConnectionsList] = js.undefined,
        DefaultArguments: js.UndefOr[GenericMap] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        ExecutionProperty: js.UndefOr[ExecutionProperty] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        LogUri: js.UndefOr[UriString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[MaxRetries] = js.undefined,
        NonOverridableArguments: js.UndefOr[GenericMap] = js.undefined,
        NotificationProperty: js.UndefOr[NotificationProperty] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        Role: js.UndefOr[RoleString] = js.undefined,
        SecurityConfiguration: js.UndefOr[NameString] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): JobUpdate = {
      val __obj = js.Dynamic.literal()
      AllocatedCapacity.foreach(__v => __obj.updateDynamic("AllocatedCapacity")(__v.asInstanceOf[js.Any]))
      Command.foreach(__v => __obj.updateDynamic("Command")(__v.asInstanceOf[js.Any]))
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      DefaultArguments.foreach(__v => __obj.updateDynamic("DefaultArguments")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionProperty.foreach(__v => __obj.updateDynamic("ExecutionProperty")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      NonOverridableArguments.foreach(__v => __obj.updateDynamic("NonOverridableArguments")(__v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.updateDynamic("NotificationProperty")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobUpdate]
    }
  }

  /** A classifier for <code>JSON</code> content.
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
    @inline
    def apply(
        JsonPath: JsonPath,
        Name: NameString,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        Version: js.UndefOr[VersionId] = js.undefined
    ): JsonClassifier = {
      val __obj = js.Dynamic.literal(
        "JsonPath" -> JsonPath.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JsonClassifier]
    }
  }

  /** A partition key pair consisting of a name and a type.
    */
  @js.native
  trait KeySchemaElement extends js.Object {
    var Name: NameString
    var Type: ColumnTypeString
  }

  object KeySchemaElement {
    @inline
    def apply(
        Name: NameString,
        Type: ColumnTypeString
    ): KeySchemaElement = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KeySchemaElement]
    }
  }

  /** Specifies configuration properties for a labeling set generation task run.
    */
  @js.native
  trait LabelingSetGenerationTaskRunProperties extends js.Object {
    var OutputS3Path: js.UndefOr[UriString]
  }

  object LabelingSetGenerationTaskRunProperties {
    @inline
    def apply(
        OutputS3Path: js.UndefOr[UriString] = js.undefined
    ): LabelingSetGenerationTaskRunProperties = {
      val __obj = js.Dynamic.literal()
      OutputS3Path.foreach(__v => __obj.updateDynamic("OutputS3Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelingSetGenerationTaskRunProperties]
    }
  }

  @js.native
  sealed trait Language extends js.Any
  object Language {
    val PYTHON = "PYTHON".asInstanceOf[Language]
    val SCALA = "SCALA".asInstanceOf[Language]

    @inline def values = js.Array(PYTHON, SCALA)
  }

  /** Status and error information about the most recent crawl.
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
    @inline
    def apply(
        ErrorMessage: js.UndefOr[DescriptionString] = js.undefined,
        LogGroup: js.UndefOr[LogGroup] = js.undefined,
        LogStream: js.UndefOr[LogStream] = js.undefined,
        MessagePrefix: js.UndefOr[MessagePrefix] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[LastCrawlStatus] = js.undefined
    ): LastCrawlInfo = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      LogGroup.foreach(__v => __obj.updateDynamic("LogGroup")(__v.asInstanceOf[js.Any]))
      LogStream.foreach(__v => __obj.updateDynamic("LogStream")(__v.asInstanceOf[js.Any]))
      MessagePrefix.foreach(__v => __obj.updateDynamic("MessagePrefix")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LastCrawlInfo]
    }
  }

  @js.native
  sealed trait LastCrawlStatus extends js.Any
  object LastCrawlStatus {
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[LastCrawlStatus]
    val CANCELLED = "CANCELLED".asInstanceOf[LastCrawlStatus]
    val FAILED = "FAILED".asInstanceOf[LastCrawlStatus]

    @inline def values = js.Array(SUCCEEDED, CANCELLED, FAILED)
  }

  /** Specifies data lineage configuration settings for the crawler.
    */
  @js.native
  trait LineageConfiguration extends js.Object {
    var CrawlerLineageSettings: js.UndefOr[CrawlerLineageSettings]
  }

  object LineageConfiguration {
    @inline
    def apply(
        CrawlerLineageSettings: js.UndefOr[CrawlerLineageSettings] = js.undefined
    ): LineageConfiguration = {
      val __obj = js.Dynamic.literal()
      CrawlerLineageSettings.foreach(__v => __obj.updateDynamic("CrawlerLineageSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineageConfiguration]
    }
  }

  @js.native
  trait ListCrawlersRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[TagsMap]
  }

  object ListCrawlersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): ListCrawlersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCrawlersRequest]
    }
  }

  @js.native
  trait ListCrawlersResponse extends js.Object {
    var CrawlerNames: js.UndefOr[CrawlerNameList]
    var NextToken: js.UndefOr[Token]
  }

  object ListCrawlersResponse {
    @inline
    def apply(
        CrawlerNames: js.UndefOr[CrawlerNameList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListCrawlersResponse = {
      val __obj = js.Dynamic.literal()
      CrawlerNames.foreach(__v => __obj.updateDynamic("CrawlerNames")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): ListDevEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevEndpointsRequest]
    }
  }

  @js.native
  trait ListDevEndpointsResponse extends js.Object {
    var DevEndpointNames: js.UndefOr[DevEndpointNameList]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListDevEndpointsResponse {
    @inline
    def apply(
        DevEndpointNames: js.UndefOr[DevEndpointNameList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListDevEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      DevEndpointNames.foreach(__v => __obj.updateDynamic("DevEndpointNames")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var JobNames: js.UndefOr[JobNameList]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListJobsResponse {
    @inline
    def apply(
        JobNames: js.UndefOr[JobNameList] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListJobsResponse = {
      val __obj = js.Dynamic.literal()
      JobNames.foreach(__v => __obj.updateDynamic("JobNames")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResponse]
    }
  }

  @js.native
  trait ListMLTransformsRequest extends js.Object {
    var Filter: js.UndefOr[TransformFilterCriteria]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[PaginationToken]
    var Sort: js.UndefOr[TransformSortCriteria]
    var Tags: js.UndefOr[TagsMap]
  }

  object ListMLTransformsRequest {
    @inline
    def apply(
        Filter: js.UndefOr[TransformFilterCriteria] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Sort: js.UndefOr[TransformSortCriteria] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): ListMLTransformsRequest = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sort.foreach(__v => __obj.updateDynamic("Sort")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMLTransformsRequest]
    }
  }

  @js.native
  trait ListMLTransformsResponse extends js.Object {
    var TransformIds: TransformIdList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListMLTransformsResponse {
    @inline
    def apply(
        TransformIds: TransformIdList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMLTransformsResponse = {
      val __obj = js.Dynamic.literal(
        "TransformIds" -> TransformIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMLTransformsResponse]
    }
  }

  @js.native
  trait ListRegistriesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsNumber]
    var NextToken: js.UndefOr[SchemaRegistryTokenString]
  }

  object ListRegistriesInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResultsNumber] = js.undefined,
        NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined
    ): ListRegistriesInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegistriesInput]
    }
  }

  @js.native
  trait ListRegistriesResponse extends js.Object {
    var NextToken: js.UndefOr[SchemaRegistryTokenString]
    var Registries: js.UndefOr[RegistryListDefinition]
  }

  object ListRegistriesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined,
        Registries: js.UndefOr[RegistryListDefinition] = js.undefined
    ): ListRegistriesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Registries.foreach(__v => __obj.updateDynamic("Registries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegistriesResponse]
    }
  }

  @js.native
  trait ListSchemaVersionsInput extends js.Object {
    var SchemaId: SchemaId
    var MaxResults: js.UndefOr[MaxResultsNumber]
    var NextToken: js.UndefOr[SchemaRegistryTokenString]
  }

  object ListSchemaVersionsInput {
    @inline
    def apply(
        SchemaId: SchemaId,
        MaxResults: js.UndefOr[MaxResultsNumber] = js.undefined,
        NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined
    ): ListSchemaVersionsInput = {
      val __obj = js.Dynamic.literal(
        "SchemaId" -> SchemaId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemaVersionsInput]
    }
  }

  @js.native
  trait ListSchemaVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[SchemaRegistryTokenString]
    var Schemas: js.UndefOr[SchemaVersionList]
  }

  object ListSchemaVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined,
        Schemas: js.UndefOr[SchemaVersionList] = js.undefined
    ): ListSchemaVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Schemas.foreach(__v => __obj.updateDynamic("Schemas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemaVersionsResponse]
    }
  }

  @js.native
  trait ListSchemasInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsNumber]
    var NextToken: js.UndefOr[SchemaRegistryTokenString]
    var RegistryId: js.UndefOr[RegistryId]
  }

  object ListSchemasInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResultsNumber] = js.undefined,
        NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined,
        RegistryId: js.UndefOr[RegistryId] = js.undefined
    ): ListSchemasInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RegistryId.foreach(__v => __obj.updateDynamic("RegistryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemasInput]
    }
  }

  @js.native
  trait ListSchemasResponse extends js.Object {
    var NextToken: js.UndefOr[SchemaRegistryTokenString]
    var Schemas: js.UndefOr[SchemaListDefinition]
  }

  object ListSchemasResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined,
        Schemas: js.UndefOr[SchemaListDefinition] = js.undefined
    ): ListSchemasResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Schemas.foreach(__v => __obj.updateDynamic("Schemas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemasResponse]
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
    @inline
    def apply(
        DependentJobName: js.UndefOr[NameString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTriggersRequest = {
      val __obj = js.Dynamic.literal()
      DependentJobName.foreach(__v => __obj.updateDynamic("DependentJobName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTriggersRequest]
    }
  }

  @js.native
  trait ListTriggersResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var TriggerNames: js.UndefOr[TriggerNameList]
  }

  object ListTriggersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        TriggerNames: js.UndefOr[TriggerNameList] = js.undefined
    ): ListTriggersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TriggerNames.foreach(__v => __obj.updateDynamic("TriggerNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTriggersResponse]
    }
  }

  @js.native
  trait ListWorkflowsRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListWorkflowsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListWorkflowsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowsRequest]
    }
  }

  @js.native
  trait ListWorkflowsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var Workflows: js.UndefOr[WorkflowNames]
  }

  object ListWorkflowsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        Workflows: js.UndefOr[WorkflowNames] = js.undefined
    ): ListWorkflowsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Workflows.foreach(__v => __obj.updateDynamic("Workflows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowsResponse]
    }
  }

  /** The location of resources.
    */
  @js.native
  trait Location extends js.Object {
    var DynamoDB: js.UndefOr[CodeGenNodeArgs]
    var Jdbc: js.UndefOr[CodeGenNodeArgs]
    var S3: js.UndefOr[CodeGenNodeArgs]
  }

  object Location {
    @inline
    def apply(
        DynamoDB: js.UndefOr[CodeGenNodeArgs] = js.undefined,
        Jdbc: js.UndefOr[CodeGenNodeArgs] = js.undefined,
        S3: js.UndefOr[CodeGenNodeArgs] = js.undefined
    ): Location = {
      val __obj = js.Dynamic.literal()
      DynamoDB.foreach(__v => __obj.updateDynamic("DynamoDB")(__v.asInstanceOf[js.Any]))
      Jdbc.foreach(__v => __obj.updateDynamic("Jdbc")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Location]
    }
  }

  @js.native
  sealed trait Logical extends js.Any
  object Logical {
    val AND = "AND".asInstanceOf[Logical]
    val ANY = "ANY".asInstanceOf[Logical]

    @inline def values = js.Array(AND, ANY)
  }

  @js.native
  sealed trait LogicalOperator extends js.Any
  object LogicalOperator {
    val EQUALS = "EQUALS".asInstanceOf[LogicalOperator]

    @inline def values = js.Array(EQUALS)
  }

  /** Defines column statistics supported for integer data columns.
    */
  @js.native
  trait LongColumnStatisticsData extends js.Object {
    var NumberOfDistinctValues: NonNegativeLong
    var NumberOfNulls: NonNegativeLong
    var MaximumValue: js.UndefOr[Double]
    var MinimumValue: js.UndefOr[Double]
  }

  object LongColumnStatisticsData {
    @inline
    def apply(
        NumberOfDistinctValues: NonNegativeLong,
        NumberOfNulls: NonNegativeLong,
        MaximumValue: js.UndefOr[Double] = js.undefined,
        MinimumValue: js.UndefOr[Double] = js.undefined
    ): LongColumnStatisticsData = {
      val __obj = js.Dynamic.literal(
        "NumberOfDistinctValues" -> NumberOfDistinctValues.asInstanceOf[js.Any],
        "NumberOfNulls" -> NumberOfNulls.asInstanceOf[js.Any]
      )

      MaximumValue.foreach(__v => __obj.updateDynamic("MaximumValue")(__v.asInstanceOf[js.Any]))
      MinimumValue.foreach(__v => __obj.updateDynamic("MinimumValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LongColumnStatisticsData]
    }
  }

  /** A structure for a machine learning transform.
    */
  @js.native
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
    var TransformEncryption: js.UndefOr[TransformEncryption]
    var TransformId: js.UndefOr[HashString]
    var WorkerType: js.UndefOr[WorkerType]
  }

  object MLTransform {
    @inline
    def apply(
        CreatedOn: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        EvaluationMetrics: js.UndefOr[EvaluationMetrics] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        InputRecordTables: js.UndefOr[GlueTables] = js.undefined,
        LabelCount: js.UndefOr[LabelCount] = js.undefined,
        LastModifiedOn: js.UndefOr[Timestamp] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[NullableInteger] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        Parameters: js.UndefOr[TransformParameters] = js.undefined,
        Role: js.UndefOr[RoleString] = js.undefined,
        Schema: js.UndefOr[TransformSchema] = js.undefined,
        Status: js.UndefOr[TransformStatusType] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        TransformEncryption: js.UndefOr[TransformEncryption] = js.undefined,
        TransformId: js.UndefOr[HashString] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): MLTransform = {
      val __obj = js.Dynamic.literal()
      CreatedOn.foreach(__v => __obj.updateDynamic("CreatedOn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EvaluationMetrics.foreach(__v => __obj.updateDynamic("EvaluationMetrics")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      InputRecordTables.foreach(__v => __obj.updateDynamic("InputRecordTables")(__v.asInstanceOf[js.Any]))
      LabelCount.foreach(__v => __obj.updateDynamic("LabelCount")(__v.asInstanceOf[js.Any]))
      LastModifiedOn.foreach(__v => __obj.updateDynamic("LastModifiedOn")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      TransformEncryption.foreach(__v => __obj.updateDynamic("TransformEncryption")(__v.asInstanceOf[js.Any]))
      TransformId.foreach(__v => __obj.updateDynamic("TransformId")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MLTransform]
    }
  }

  /** The encryption-at-rest settings of the transform that apply to accessing user data.
    */
  @js.native
  trait MLUserDataEncryption extends js.Object {
    var MlUserDataEncryptionMode: MLUserDataEncryptionModeString
    var KmsKeyId: js.UndefOr[NameString]
  }

  object MLUserDataEncryption {
    @inline
    def apply(
        MlUserDataEncryptionMode: MLUserDataEncryptionModeString,
        KmsKeyId: js.UndefOr[NameString] = js.undefined
    ): MLUserDataEncryption = {
      val __obj = js.Dynamic.literal(
        "MlUserDataEncryptionMode" -> MlUserDataEncryptionMode.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MLUserDataEncryption]
    }
  }

  @js.native
  sealed trait MLUserDataEncryptionModeString extends js.Any
  object MLUserDataEncryptionModeString {
    val DISABLED = "DISABLED".asInstanceOf[MLUserDataEncryptionModeString]
    val `SSE-KMS` = "SSE-KMS".asInstanceOf[MLUserDataEncryptionModeString]

    @inline def values = js.Array(DISABLED, `SSE-KMS`)
  }

  /** Defines a mapping.
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
    @inline
    def apply(
        SourcePath: js.UndefOr[SchemaPathString] = js.undefined,
        SourceTable: js.UndefOr[TableName] = js.undefined,
        SourceType: js.UndefOr[FieldType] = js.undefined,
        TargetPath: js.UndefOr[SchemaPathString] = js.undefined,
        TargetTable: js.UndefOr[TableName] = js.undefined,
        TargetType: js.UndefOr[FieldType] = js.undefined
    ): MappingEntry = {
      val __obj = js.Dynamic.literal()
      SourcePath.foreach(__v => __obj.updateDynamic("SourcePath")(__v.asInstanceOf[js.Any]))
      SourceTable.foreach(__v => __obj.updateDynamic("SourceTable")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      TargetPath.foreach(__v => __obj.updateDynamic("TargetPath")(__v.asInstanceOf[js.Any]))
      TargetTable.foreach(__v => __obj.updateDynamic("TargetTable")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MappingEntry]
    }
  }

  /** A structure containing metadata information for a schema version.
    */
  @js.native
  trait MetadataInfo extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTimestamp]
    var MetadataValue: js.UndefOr[MetadataValueString]
    var OtherMetadataValueList: js.UndefOr[OtherMetadataValueList]
  }

  object MetadataInfo {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined,
        MetadataValue: js.UndefOr[MetadataValueString] = js.undefined,
        OtherMetadataValueList: js.UndefOr[OtherMetadataValueList] = js.undefined
    ): MetadataInfo = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      MetadataValue.foreach(__v => __obj.updateDynamic("MetadataValue")(__v.asInstanceOf[js.Any]))
      OtherMetadataValueList.foreach(__v => __obj.updateDynamic("OtherMetadataValueList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetadataInfo]
    }
  }

  /** A structure containing a key value pair for metadata.
    */
  @js.native
  trait MetadataKeyValuePair extends js.Object {
    var MetadataKey: js.UndefOr[MetadataKeyString]
    var MetadataValue: js.UndefOr[MetadataValueString]
  }

  object MetadataKeyValuePair {
    @inline
    def apply(
        MetadataKey: js.UndefOr[MetadataKeyString] = js.undefined,
        MetadataValue: js.UndefOr[MetadataValueString] = js.undefined
    ): MetadataKeyValuePair = {
      val __obj = js.Dynamic.literal()
      MetadataKey.foreach(__v => __obj.updateDynamic("MetadataKey")(__v.asInstanceOf[js.Any]))
      MetadataValue.foreach(__v => __obj.updateDynamic("MetadataValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetadataKeyValuePair]
    }
  }

  /** Specifies an Amazon DocumentDB or MongoDB data store to crawl.
    */
  @js.native
  trait MongoDBTarget extends js.Object {
    var ConnectionName: js.UndefOr[ConnectionName]
    var Path: js.UndefOr[Path]
    var ScanAll: js.UndefOr[NullableBoolean]
  }

  object MongoDBTarget {
    @inline
    def apply(
        ConnectionName: js.UndefOr[ConnectionName] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined,
        ScanAll: js.UndefOr[NullableBoolean] = js.undefined
    ): MongoDBTarget = {
      val __obj = js.Dynamic.literal()
      ConnectionName.foreach(__v => __obj.updateDynamic("ConnectionName")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      ScanAll.foreach(__v => __obj.updateDynamic("ScanAll")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MongoDBTarget]
    }
  }

  /** A node represents an AWS Glue component such as a trigger, or job, etc., that is part of a workflow.
    */
  @js.native
  trait Node extends js.Object {
    var CrawlerDetails: js.UndefOr[CrawlerNodeDetails]
    var JobDetails: js.UndefOr[JobNodeDetails]
    var Name: js.UndefOr[NameString]
    var TriggerDetails: js.UndefOr[TriggerNodeDetails]
    var Type: js.UndefOr[NodeType]
    var UniqueId: js.UndefOr[NameString]
  }

  object Node {
    @inline
    def apply(
        CrawlerDetails: js.UndefOr[CrawlerNodeDetails] = js.undefined,
        JobDetails: js.UndefOr[JobNodeDetails] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        TriggerDetails: js.UndefOr[TriggerNodeDetails] = js.undefined,
        Type: js.UndefOr[NodeType] = js.undefined,
        UniqueId: js.UndefOr[NameString] = js.undefined
    ): Node = {
      val __obj = js.Dynamic.literal()
      CrawlerDetails.foreach(__v => __obj.updateDynamic("CrawlerDetails")(__v.asInstanceOf[js.Any]))
      JobDetails.foreach(__v => __obj.updateDynamic("JobDetails")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TriggerDetails.foreach(__v => __obj.updateDynamic("TriggerDetails")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UniqueId.foreach(__v => __obj.updateDynamic("UniqueId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Node]
    }
  }

  @js.native
  sealed trait NodeType extends js.Any
  object NodeType {
    val CRAWLER = "CRAWLER".asInstanceOf[NodeType]
    val JOB = "JOB".asInstanceOf[NodeType]
    val TRIGGER = "TRIGGER".asInstanceOf[NodeType]

    @inline def values = js.Array(CRAWLER, JOB, TRIGGER)
  }

  /** Specifies configuration properties of a notification.
    */
  @js.native
  trait NotificationProperty extends js.Object {
    var NotifyDelayAfter: js.UndefOr[NotifyDelayAfter]
  }

  object NotificationProperty {
    @inline
    def apply(
        NotifyDelayAfter: js.UndefOr[NotifyDelayAfter] = js.undefined
    ): NotificationProperty = {
      val __obj = js.Dynamic.literal()
      NotifyDelayAfter.foreach(__v => __obj.updateDynamic("NotifyDelayAfter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationProperty]
    }
  }

  /** Specifies the sort order of a sorted column.
    */
  @js.native
  trait Order extends js.Object {
    var Column: NameString
    var SortOrder: IntegerFlag
  }

  object Order {
    @inline
    def apply(
        Column: NameString,
        SortOrder: IntegerFlag
    ): Order = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "SortOrder" -> SortOrder.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Order]
    }
  }

  /** A structure containing other metadata for a schema version belonging to the same metadata key.
    */
  @js.native
  trait OtherMetadataValueListItem extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTimestamp]
    var MetadataValue: js.UndefOr[MetadataValueString]
  }

  object OtherMetadataValueListItem {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined,
        MetadataValue: js.UndefOr[MetadataValueString] = js.undefined
    ): OtherMetadataValueListItem = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      MetadataValue.foreach(__v => __obj.updateDynamic("MetadataValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OtherMetadataValueListItem]
    }
  }

  /** Represents a slice of table data.
    */
  @js.native
  trait Partition extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
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
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatabaseName: js.UndefOr[NameString] = js.undefined,
        LastAccessTime: js.UndefOr[Timestamp] = js.undefined,
        LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined,
        TableName: js.UndefOr[NameString] = js.undefined,
        Values: js.UndefOr[ValueStringList] = js.undefined
    ): Partition = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      LastAccessTime.foreach(__v => __obj.updateDynamic("LastAccessTime")(__v.asInstanceOf[js.Any]))
      LastAnalyzedTime.foreach(__v => __obj.updateDynamic("LastAnalyzedTime")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      StorageDescriptor.foreach(__v => __obj.updateDynamic("StorageDescriptor")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Partition]
    }
  }

  /** Contains information about a partition error.
    */
  @js.native
  trait PartitionError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var PartitionValues: js.UndefOr[ValueStringList]
  }

  object PartitionError {
    @inline
    def apply(
        ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined,
        PartitionValues: js.UndefOr[ValueStringList] = js.undefined
    ): PartitionError = {
      val __obj = js.Dynamic.literal()
      ErrorDetail.foreach(__v => __obj.updateDynamic("ErrorDetail")(__v.asInstanceOf[js.Any]))
      PartitionValues.foreach(__v => __obj.updateDynamic("PartitionValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartitionError]
    }
  }

  /** A structure for a partition index.
    */
  @js.native
  trait PartitionIndex extends js.Object {
    var IndexName: NameString
    var Keys: KeyList
  }

  object PartitionIndex {
    @inline
    def apply(
        IndexName: NameString,
        Keys: KeyList
    ): PartitionIndex = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "Keys" -> Keys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PartitionIndex]
    }
  }

  /** A descriptor for a partition index in a table.
    */
  @js.native
  trait PartitionIndexDescriptor extends js.Object {
    var IndexName: NameString
    var IndexStatus: PartitionIndexStatus
    var Keys: KeySchemaElementList
    var BackfillErrors: js.UndefOr[BackfillErrors]
  }

  object PartitionIndexDescriptor {
    @inline
    def apply(
        IndexName: NameString,
        IndexStatus: PartitionIndexStatus,
        Keys: KeySchemaElementList,
        BackfillErrors: js.UndefOr[BackfillErrors] = js.undefined
    ): PartitionIndexDescriptor = {
      val __obj = js.Dynamic.literal(
        "IndexName" -> IndexName.asInstanceOf[js.Any],
        "IndexStatus" -> IndexStatus.asInstanceOf[js.Any],
        "Keys" -> Keys.asInstanceOf[js.Any]
      )

      BackfillErrors.foreach(__v => __obj.updateDynamic("BackfillErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartitionIndexDescriptor]
    }
  }

  @js.native
  sealed trait PartitionIndexStatus extends js.Any
  object PartitionIndexStatus {
    val CREATING = "CREATING".asInstanceOf[PartitionIndexStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[PartitionIndexStatus]
    val DELETING = "DELETING".asInstanceOf[PartitionIndexStatus]
    val FAILED = "FAILED".asInstanceOf[PartitionIndexStatus]

    @inline def values = js.Array(CREATING, ACTIVE, DELETING, FAILED)
  }

  /** The structure used to create and update a partition.
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
    @inline
    def apply(
        LastAccessTime: js.UndefOr[Timestamp] = js.undefined,
        LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined,
        Values: js.UndefOr[ValueStringList] = js.undefined
    ): PartitionInput = {
      val __obj = js.Dynamic.literal()
      LastAccessTime.foreach(__v => __obj.updateDynamic("LastAccessTime")(__v.asInstanceOf[js.Any]))
      LastAnalyzedTime.foreach(__v => __obj.updateDynamic("LastAnalyzedTime")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      StorageDescriptor.foreach(__v => __obj.updateDynamic("StorageDescriptor")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartitionInput]
    }
  }

  /** Contains a list of values defining partitions.
    */
  @js.native
  trait PartitionValueList extends js.Object {
    var Values: ValueStringList
  }

  object PartitionValueList {
    @inline
    def apply(
        Values: ValueStringList
    ): PartitionValueList = {
      val __obj = js.Dynamic.literal(
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PartitionValueList]
    }
  }

  @js.native
  sealed trait Permission extends js.Any
  object Permission {
    val ALL = "ALL".asInstanceOf[Permission]
    val SELECT = "SELECT".asInstanceOf[Permission]
    val ALTER = "ALTER".asInstanceOf[Permission]
    val DROP = "DROP".asInstanceOf[Permission]
    val DELETE = "DELETE".asInstanceOf[Permission]
    val INSERT = "INSERT".asInstanceOf[Permission]
    val CREATE_DATABASE = "CREATE_DATABASE".asInstanceOf[Permission]
    val CREATE_TABLE = "CREATE_TABLE".asInstanceOf[Permission]
    val DATA_LOCATION_ACCESS = "DATA_LOCATION_ACCESS".asInstanceOf[Permission]

    @inline def values = js.Array(ALL, SELECT, ALTER, DROP, DELETE, INSERT, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
  }

  /** Specifies the physical requirements for a connection.
    */
  @js.native
  trait PhysicalConnectionRequirements extends js.Object {
    var AvailabilityZone: js.UndefOr[NameString]
    var SecurityGroupIdList: js.UndefOr[SecurityGroupIdList]
    var SubnetId: js.UndefOr[NameString]
  }

  object PhysicalConnectionRequirements {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[NameString] = js.undefined,
        SecurityGroupIdList: js.UndefOr[SecurityGroupIdList] = js.undefined,
        SubnetId: js.UndefOr[NameString] = js.undefined
    ): PhysicalConnectionRequirements = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      SecurityGroupIdList.foreach(__v => __obj.updateDynamic("SecurityGroupIdList")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhysicalConnectionRequirements]
    }
  }

  /** A job run that was used in the predicate of a conditional trigger that triggered this job run.
    */
  @js.native
  trait Predecessor extends js.Object {
    var JobName: js.UndefOr[NameString]
    var RunId: js.UndefOr[IdString]
  }

  object Predecessor {
    @inline
    def apply(
        JobName: js.UndefOr[NameString] = js.undefined,
        RunId: js.UndefOr[IdString] = js.undefined
    ): Predecessor = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      RunId.foreach(__v => __obj.updateDynamic("RunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Predecessor]
    }
  }

  /** Defines the predicate of the trigger, which determines when it fires.
    */
  @js.native
  trait Predicate extends js.Object {
    var Conditions: js.UndefOr[ConditionList]
    var Logical: js.UndefOr[Logical]
  }

  object Predicate {
    @inline
    def apply(
        Conditions: js.UndefOr[ConditionList] = js.undefined,
        Logical: js.UndefOr[Logical] = js.undefined
    ): Predicate = {
      val __obj = js.Dynamic.literal()
      Conditions.foreach(__v => __obj.updateDynamic("Conditions")(__v.asInstanceOf[js.Any]))
      Logical.foreach(__v => __obj.updateDynamic("Logical")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Predicate]
    }
  }

  /** Permissions granted to a principal.
    */
  @js.native
  trait PrincipalPermissions extends js.Object {
    var Permissions: js.UndefOr[PermissionList]
    var Principal: js.UndefOr[DataLakePrincipal]
  }

  object PrincipalPermissions {
    @inline
    def apply(
        Permissions: js.UndefOr[PermissionList] = js.undefined,
        Principal: js.UndefOr[DataLakePrincipal] = js.undefined
    ): PrincipalPermissions = {
      val __obj = js.Dynamic.literal()
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      Principal.foreach(__v => __obj.updateDynamic("Principal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrincipalPermissions]
    }
  }

  @js.native
  sealed trait PrincipalType extends js.Any
  object PrincipalType {
    val USER = "USER".asInstanceOf[PrincipalType]
    val ROLE = "ROLE".asInstanceOf[PrincipalType]
    val GROUP = "GROUP".asInstanceOf[PrincipalType]

    @inline def values = js.Array(USER, ROLE, GROUP)
  }

  /** Defines a property predicate.
    */
  @js.native
  trait PropertyPredicate extends js.Object {
    var Comparator: js.UndefOr[Comparator]
    var Key: js.UndefOr[ValueString]
    var Value: js.UndefOr[ValueString]
  }

  object PropertyPredicate {
    @inline
    def apply(
        Comparator: js.UndefOr[Comparator] = js.undefined,
        Key: js.UndefOr[ValueString] = js.undefined,
        Value: js.UndefOr[ValueString] = js.undefined
    ): PropertyPredicate = {
      val __obj = js.Dynamic.literal()
      Comparator.foreach(__v => __obj.updateDynamic("Comparator")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyPredicate]
    }
  }

  @js.native
  trait PutDataCatalogEncryptionSettingsRequest extends js.Object {
    var DataCatalogEncryptionSettings: DataCatalogEncryptionSettings
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object PutDataCatalogEncryptionSettingsRequest {
    @inline
    def apply(
        DataCatalogEncryptionSettings: DataCatalogEncryptionSettings,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): PutDataCatalogEncryptionSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "DataCatalogEncryptionSettings" -> DataCatalogEncryptionSettings.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDataCatalogEncryptionSettingsRequest]
    }
  }

  @js.native
  trait PutDataCatalogEncryptionSettingsResponse extends js.Object

  object PutDataCatalogEncryptionSettingsResponse {
    @inline
    def apply(): PutDataCatalogEncryptionSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutDataCatalogEncryptionSettingsResponse]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var PolicyInJson: PolicyJsonString
    var EnableHybrid: js.UndefOr[EnableHybridValues]
    var PolicyExistsCondition: js.UndefOr[ExistCondition]
    var PolicyHashCondition: js.UndefOr[HashString]
    var ResourceArn: js.UndefOr[GlueResourceArn]
  }

  object PutResourcePolicyRequest {
    @inline
    def apply(
        PolicyInJson: PolicyJsonString,
        EnableHybrid: js.UndefOr[EnableHybridValues] = js.undefined,
        PolicyExistsCondition: js.UndefOr[ExistCondition] = js.undefined,
        PolicyHashCondition: js.UndefOr[HashString] = js.undefined,
        ResourceArn: js.UndefOr[GlueResourceArn] = js.undefined
    ): PutResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "PolicyInJson" -> PolicyInJson.asInstanceOf[js.Any]
      )

      EnableHybrid.foreach(__v => __obj.updateDynamic("EnableHybrid")(__v.asInstanceOf[js.Any]))
      PolicyExistsCondition.foreach(__v => __obj.updateDynamic("PolicyExistsCondition")(__v.asInstanceOf[js.Any]))
      PolicyHashCondition.foreach(__v => __obj.updateDynamic("PolicyHashCondition")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object {
    var PolicyHash: js.UndefOr[HashString]
  }

  object PutResourcePolicyResponse {
    @inline
    def apply(
        PolicyHash: js.UndefOr[HashString] = js.undefined
    ): PutResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      PolicyHash.foreach(__v => __obj.updateDynamic("PolicyHash")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyResponse]
    }
  }

  @js.native
  trait PutSchemaVersionMetadataInput extends js.Object {
    var MetadataKeyValue: MetadataKeyValuePair
    var SchemaId: js.UndefOr[SchemaId]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var SchemaVersionNumber: js.UndefOr[SchemaVersionNumber]
  }

  object PutSchemaVersionMetadataInput {
    @inline
    def apply(
        MetadataKeyValue: MetadataKeyValuePair,
        SchemaId: js.UndefOr[SchemaId] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        SchemaVersionNumber: js.UndefOr[SchemaVersionNumber] = js.undefined
    ): PutSchemaVersionMetadataInput = {
      val __obj = js.Dynamic.literal(
        "MetadataKeyValue" -> MetadataKeyValue.asInstanceOf[js.Any]
      )

      SchemaId.foreach(__v => __obj.updateDynamic("SchemaId")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      SchemaVersionNumber.foreach(__v => __obj.updateDynamic("SchemaVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSchemaVersionMetadataInput]
    }
  }

  @js.native
  trait PutSchemaVersionMetadataResponse extends js.Object {
    var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean]
    var MetadataKey: js.UndefOr[MetadataKeyString]
    var MetadataValue: js.UndefOr[MetadataValueString]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaName: js.UndefOr[SchemaRegistryNameString]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var VersionNumber: js.UndefOr[VersionLongNumber]
  }

  object PutSchemaVersionMetadataResponse {
    @inline
    def apply(
        LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.undefined,
        MetadataKey: js.UndefOr[MetadataKeyString] = js.undefined,
        MetadataValue: js.UndefOr[MetadataValueString] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
    ): PutSchemaVersionMetadataResponse = {
      val __obj = js.Dynamic.literal()
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      MetadataKey.foreach(__v => __obj.updateDynamic("MetadataKey")(__v.asInstanceOf[js.Any]))
      MetadataValue.foreach(__v => __obj.updateDynamic("MetadataValue")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSchemaVersionMetadataResponse]
    }
  }

  @js.native
  trait PutWorkflowRunPropertiesRequest extends js.Object {
    var Name: NameString
    var RunId: IdString
    var RunProperties: WorkflowRunProperties
  }

  object PutWorkflowRunPropertiesRequest {
    @inline
    def apply(
        Name: NameString,
        RunId: IdString,
        RunProperties: WorkflowRunProperties
    ): PutWorkflowRunPropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RunId" -> RunId.asInstanceOf[js.Any],
        "RunProperties" -> RunProperties.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutWorkflowRunPropertiesRequest]
    }
  }

  @js.native
  trait PutWorkflowRunPropertiesResponse extends js.Object

  object PutWorkflowRunPropertiesResponse {
    @inline
    def apply(): PutWorkflowRunPropertiesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutWorkflowRunPropertiesResponse]
    }
  }

  @js.native
  trait QuerySchemaVersionMetadataInput extends js.Object {
    var MaxResults: js.UndefOr[QuerySchemaVersionMetadataMaxResults]
    var MetadataList: js.UndefOr[MetadataList]
    var NextToken: js.UndefOr[SchemaRegistryTokenString]
    var SchemaId: js.UndefOr[SchemaId]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var SchemaVersionNumber: js.UndefOr[SchemaVersionNumber]
  }

  object QuerySchemaVersionMetadataInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[QuerySchemaVersionMetadataMaxResults] = js.undefined,
        MetadataList: js.UndefOr[MetadataList] = js.undefined,
        NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined,
        SchemaId: js.UndefOr[SchemaId] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        SchemaVersionNumber: js.UndefOr[SchemaVersionNumber] = js.undefined
    ): QuerySchemaVersionMetadataInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MetadataList.foreach(__v => __obj.updateDynamic("MetadataList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaId.foreach(__v => __obj.updateDynamic("SchemaId")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      SchemaVersionNumber.foreach(__v => __obj.updateDynamic("SchemaVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuerySchemaVersionMetadataInput]
    }
  }

  @js.native
  trait QuerySchemaVersionMetadataResponse extends js.Object {
    var MetadataInfoMap: js.UndefOr[MetadataInfoMap]
    var NextToken: js.UndefOr[SchemaRegistryTokenString]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
  }

  object QuerySchemaVersionMetadataResponse {
    @inline
    def apply(
        MetadataInfoMap: js.UndefOr[MetadataInfoMap] = js.undefined,
        NextToken: js.UndefOr[SchemaRegistryTokenString] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
    ): QuerySchemaVersionMetadataResponse = {
      val __obj = js.Dynamic.literal()
      MetadataInfoMap.foreach(__v => __obj.updateDynamic("MetadataInfoMap")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuerySchemaVersionMetadataResponse]
    }
  }

  @js.native
  sealed trait RecrawlBehavior extends js.Any
  object RecrawlBehavior {
    val CRAWL_EVERYTHING = "CRAWL_EVERYTHING".asInstanceOf[RecrawlBehavior]
    val CRAWL_NEW_FOLDERS_ONLY = "CRAWL_NEW_FOLDERS_ONLY".asInstanceOf[RecrawlBehavior]

    @inline def values = js.Array(CRAWL_EVERYTHING, CRAWL_NEW_FOLDERS_ONLY)
  }

  /** When crawling an Amazon S3 data source after the first crawl is complete, specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last crawler run. For more information, see [[https://docs.aws.amazon.com/glue/latest/dg/incremental-crawls.html|Incremental Crawls in AWS Glue]] in the developer guide.
    */
  @js.native
  trait RecrawlPolicy extends js.Object {
    var RecrawlBehavior: js.UndefOr[RecrawlBehavior]
  }

  object RecrawlPolicy {
    @inline
    def apply(
        RecrawlBehavior: js.UndefOr[RecrawlBehavior] = js.undefined
    ): RecrawlPolicy = {
      val __obj = js.Dynamic.literal()
      RecrawlBehavior.foreach(__v => __obj.updateDynamic("RecrawlBehavior")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecrawlPolicy]
    }
  }

  @js.native
  trait RegisterSchemaVersionInput extends js.Object {
    var SchemaDefinition: SchemaDefinitionString
    var SchemaId: SchemaId
  }

  object RegisterSchemaVersionInput {
    @inline
    def apply(
        SchemaDefinition: SchemaDefinitionString,
        SchemaId: SchemaId
    ): RegisterSchemaVersionInput = {
      val __obj = js.Dynamic.literal(
        "SchemaDefinition" -> SchemaDefinition.asInstanceOf[js.Any],
        "SchemaId" -> SchemaId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterSchemaVersionInput]
    }
  }

  @js.native
  trait RegisterSchemaVersionResponse extends js.Object {
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var Status: js.UndefOr[SchemaVersionStatus]
    var VersionNumber: js.UndefOr[VersionLongNumber]
  }

  object RegisterSchemaVersionResponse {
    @inline
    def apply(
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        Status: js.UndefOr[SchemaVersionStatus] = js.undefined,
        VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
    ): RegisterSchemaVersionResponse = {
      val __obj = js.Dynamic.literal()
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterSchemaVersionResponse]
    }
  }

  /** A wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
    */
  @js.native
  trait RegistryId extends js.Object {
    var RegistryArn: js.UndefOr[GlueResourceArn]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
  }

  object RegistryId {
    @inline
    def apply(
        RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
    ): RegistryId = {
      val __obj = js.Dynamic.literal()
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegistryId]
    }
  }

  /** A structure containing the details for a registry.
    */
  @js.native
  trait RegistryListItem extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTimestamp]
    var Description: js.UndefOr[DescriptionString]
    var RegistryArn: js.UndefOr[GlueResourceArn]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var Status: js.UndefOr[RegistryStatus]
    var UpdatedTime: js.UndefOr[UpdatedTimestamp]
  }

  object RegistryListItem {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        Status: js.UndefOr[RegistryStatus] = js.undefined,
        UpdatedTime: js.UndefOr[UpdatedTimestamp] = js.undefined
    ): RegistryListItem = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.updateDynamic("UpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegistryListItem]
    }
  }

  @js.native
  sealed trait RegistryStatus extends js.Any
  object RegistryStatus {
    val AVAILABLE = "AVAILABLE".asInstanceOf[RegistryStatus]
    val DELETING = "DELETING".asInstanceOf[RegistryStatus]

    @inline def values = js.Array(AVAILABLE, DELETING)
  }

  @js.native
  trait RemoveSchemaVersionMetadataInput extends js.Object {
    var MetadataKeyValue: MetadataKeyValuePair
    var SchemaId: js.UndefOr[SchemaId]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var SchemaVersionNumber: js.UndefOr[SchemaVersionNumber]
  }

  object RemoveSchemaVersionMetadataInput {
    @inline
    def apply(
        MetadataKeyValue: MetadataKeyValuePair,
        SchemaId: js.UndefOr[SchemaId] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        SchemaVersionNumber: js.UndefOr[SchemaVersionNumber] = js.undefined
    ): RemoveSchemaVersionMetadataInput = {
      val __obj = js.Dynamic.literal(
        "MetadataKeyValue" -> MetadataKeyValue.asInstanceOf[js.Any]
      )

      SchemaId.foreach(__v => __obj.updateDynamic("SchemaId")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      SchemaVersionNumber.foreach(__v => __obj.updateDynamic("SchemaVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveSchemaVersionMetadataInput]
    }
  }

  @js.native
  trait RemoveSchemaVersionMetadataResponse extends js.Object {
    var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean]
    var MetadataKey: js.UndefOr[MetadataKeyString]
    var MetadataValue: js.UndefOr[MetadataValueString]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaName: js.UndefOr[SchemaRegistryNameString]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var VersionNumber: js.UndefOr[VersionLongNumber]
  }

  object RemoveSchemaVersionMetadataResponse {
    @inline
    def apply(
        LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.undefined,
        MetadataKey: js.UndefOr[MetadataKeyString] = js.undefined,
        MetadataValue: js.UndefOr[MetadataValueString] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
    ): RemoveSchemaVersionMetadataResponse = {
      val __obj = js.Dynamic.literal()
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      MetadataKey.foreach(__v => __obj.updateDynamic("MetadataKey")(__v.asInstanceOf[js.Any]))
      MetadataValue.foreach(__v => __obj.updateDynamic("MetadataValue")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveSchemaVersionMetadataResponse]
    }
  }

  @js.native
  trait ResetJobBookmarkRequest extends js.Object {
    var JobName: JobName
    var RunId: js.UndefOr[RunId]
  }

  object ResetJobBookmarkRequest {
    @inline
    def apply(
        JobName: JobName,
        RunId: js.UndefOr[RunId] = js.undefined
    ): ResetJobBookmarkRequest = {
      val __obj = js.Dynamic.literal(
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      RunId.foreach(__v => __obj.updateDynamic("RunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetJobBookmarkRequest]
    }
  }

  @js.native
  trait ResetJobBookmarkResponse extends js.Object {
    var JobBookmarkEntry: js.UndefOr[JobBookmarkEntry]
  }

  object ResetJobBookmarkResponse {
    @inline
    def apply(
        JobBookmarkEntry: js.UndefOr[JobBookmarkEntry] = js.undefined
    ): ResetJobBookmarkResponse = {
      val __obj = js.Dynamic.literal()
      JobBookmarkEntry.foreach(__v => __obj.updateDynamic("JobBookmarkEntry")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetJobBookmarkResponse]
    }
  }

  @js.native
  sealed trait ResourceShareType extends js.Any
  object ResourceShareType {
    val FOREIGN = "FOREIGN".asInstanceOf[ResourceShareType]
    val ALL = "ALL".asInstanceOf[ResourceShareType]

    @inline def values = js.Array(FOREIGN, ALL)
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType {
    val JAR = "JAR".asInstanceOf[ResourceType]
    val FILE = "FILE".asInstanceOf[ResourceType]
    val ARCHIVE = "ARCHIVE".asInstanceOf[ResourceType]

    @inline def values = js.Array(JAR, FILE, ARCHIVE)
  }

  /** The URIs for function resources.
    */
  @js.native
  trait ResourceUri extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Uri: js.UndefOr[URI]
  }

  object ResourceUri {
    @inline
    def apply(
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        Uri: js.UndefOr[URI] = js.undefined
    ): ResourceUri = {
      val __obj = js.Dynamic.literal()
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Uri.foreach(__v => __obj.updateDynamic("Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceUri]
    }
  }

  @js.native
  trait ResumeWorkflowRunRequest extends js.Object {
    var Name: NameString
    var NodeIds: NodeIdList
    var RunId: IdString
  }

  object ResumeWorkflowRunRequest {
    @inline
    def apply(
        Name: NameString,
        NodeIds: NodeIdList,
        RunId: IdString
    ): ResumeWorkflowRunRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "NodeIds" -> NodeIds.asInstanceOf[js.Any],
        "RunId" -> RunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResumeWorkflowRunRequest]
    }
  }

  @js.native
  trait ResumeWorkflowRunResponse extends js.Object {
    var NodeIds: js.UndefOr[NodeIdList]
    var RunId: js.UndefOr[IdString]
  }

  object ResumeWorkflowRunResponse {
    @inline
    def apply(
        NodeIds: js.UndefOr[NodeIdList] = js.undefined,
        RunId: js.UndefOr[IdString] = js.undefined
    ): ResumeWorkflowRunResponse = {
      val __obj = js.Dynamic.literal()
      NodeIds.foreach(__v => __obj.updateDynamic("NodeIds")(__v.asInstanceOf[js.Any]))
      RunId.foreach(__v => __obj.updateDynamic("RunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResumeWorkflowRunResponse]
    }
  }

  /** Specifies how Amazon Simple Storage Service (Amazon S3) data should be encrypted.
    */
  @js.native
  trait S3Encryption extends js.Object {
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var S3EncryptionMode: js.UndefOr[S3EncryptionMode]
  }

  object S3Encryption {
    @inline
    def apply(
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        S3EncryptionMode: js.UndefOr[S3EncryptionMode] = js.undefined
    ): S3Encryption = {
      val __obj = js.Dynamic.literal()
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      S3EncryptionMode.foreach(__v => __obj.updateDynamic("S3EncryptionMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Encryption]
    }
  }

  @js.native
  sealed trait S3EncryptionMode extends js.Any
  object S3EncryptionMode {
    val DISABLED = "DISABLED".asInstanceOf[S3EncryptionMode]
    val `SSE-KMS` = "SSE-KMS".asInstanceOf[S3EncryptionMode]
    val `SSE-S3` = "SSE-S3".asInstanceOf[S3EncryptionMode]

    @inline def values = js.Array(DISABLED, `SSE-KMS`, `SSE-S3`)
  }

  /** Specifies a data store in Amazon Simple Storage Service (Amazon S3).
    */
  @js.native
  trait S3Target extends js.Object {
    var ConnectionName: js.UndefOr[ConnectionName]
    var Exclusions: js.UndefOr[PathList]
    var Path: js.UndefOr[Path]
  }

  object S3Target {
    @inline
    def apply(
        ConnectionName: js.UndefOr[ConnectionName] = js.undefined,
        Exclusions: js.UndefOr[PathList] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined
    ): S3Target = {
      val __obj = js.Dynamic.literal()
      ConnectionName.foreach(__v => __obj.updateDynamic("ConnectionName")(__v.asInstanceOf[js.Any]))
      Exclusions.foreach(__v => __obj.updateDynamic("Exclusions")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Target]
    }
  }

  /** A scheduling object using a <code>cron</code> statement to schedule an event.
    */
  @js.native
  trait Schedule extends js.Object {
    var ScheduleExpression: js.UndefOr[CronExpression]
    var State: js.UndefOr[ScheduleState]
  }

  object Schedule {
    @inline
    def apply(
        ScheduleExpression: js.UndefOr[CronExpression] = js.undefined,
        State: js.UndefOr[ScheduleState] = js.undefined
    ): Schedule = {
      val __obj = js.Dynamic.literal()
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schedule]
    }
  }

  @js.native
  sealed trait ScheduleState extends js.Any
  object ScheduleState {
    val SCHEDULED = "SCHEDULED".asInstanceOf[ScheduleState]
    val NOT_SCHEDULED = "NOT_SCHEDULED".asInstanceOf[ScheduleState]
    val TRANSITIONING = "TRANSITIONING".asInstanceOf[ScheduleState]

    @inline def values = js.Array(SCHEDULED, NOT_SCHEDULED, TRANSITIONING)
  }

  /** A policy that specifies update and deletion behaviors for the crawler.
    */
  @js.native
  trait SchemaChangePolicy extends js.Object {
    var DeleteBehavior: js.UndefOr[DeleteBehavior]
    var UpdateBehavior: js.UndefOr[UpdateBehavior]
  }

  object SchemaChangePolicy {
    @inline
    def apply(
        DeleteBehavior: js.UndefOr[DeleteBehavior] = js.undefined,
        UpdateBehavior: js.UndefOr[UpdateBehavior] = js.undefined
    ): SchemaChangePolicy = {
      val __obj = js.Dynamic.literal()
      DeleteBehavior.foreach(__v => __obj.updateDynamic("DeleteBehavior")(__v.asInstanceOf[js.Any]))
      UpdateBehavior.foreach(__v => __obj.updateDynamic("UpdateBehavior")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaChangePolicy]
    }
  }

  /** A key-value pair representing a column and data type that this transform can run against. The <code>Schema</code> parameter of the <code>MLTransform</code> may contain up to 100 of these structures.
    */
  @js.native
  trait SchemaColumn extends js.Object {
    var DataType: js.UndefOr[ColumnTypeString]
    var Name: js.UndefOr[ColumnNameString]
  }

  object SchemaColumn {
    @inline
    def apply(
        DataType: js.UndefOr[ColumnTypeString] = js.undefined,
        Name: js.UndefOr[ColumnNameString] = js.undefined
    ): SchemaColumn = {
      val __obj = js.Dynamic.literal()
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaColumn]
    }
  }

  @js.native
  sealed trait SchemaDiffType extends js.Any
  object SchemaDiffType {
    val SYNTAX_DIFF = "SYNTAX_DIFF".asInstanceOf[SchemaDiffType]

    @inline def values = js.Array(SYNTAX_DIFF)
  }

  /** The unique ID of the schema in the AWS Glue schema registry.
    */
  @js.native
  trait SchemaId extends js.Object {
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaName: js.UndefOr[SchemaRegistryNameString]
  }

  object SchemaId {
    @inline
    def apply(
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined
    ): SchemaId = {
      val __obj = js.Dynamic.literal()
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaId]
    }
  }

  /** An object that contains minimal details for a schema.
    */
  @js.native
  trait SchemaListItem extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTimestamp]
    var Description: js.UndefOr[DescriptionString]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaName: js.UndefOr[SchemaRegistryNameString]
    var SchemaStatus: js.UndefOr[SchemaStatus]
    var UpdatedTime: js.UndefOr[UpdatedTimestamp]
  }

  object SchemaListItem {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaStatus: js.UndefOr[SchemaStatus] = js.undefined,
        UpdatedTime: js.UndefOr[UpdatedTimestamp] = js.undefined
    ): SchemaListItem = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaStatus.foreach(__v => __obj.updateDynamic("SchemaStatus")(__v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.updateDynamic("UpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaListItem]
    }
  }

  /** An object that references a schema stored in the AWS Glue Schema Registry.
    */
  @js.native
  trait SchemaReference extends js.Object {
    var SchemaId: js.UndefOr[SchemaId]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var SchemaVersionNumber: js.UndefOr[VersionLongNumber]
  }

  object SchemaReference {
    @inline
    def apply(
        SchemaId: js.UndefOr[SchemaId] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        SchemaVersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
    ): SchemaReference = {
      val __obj = js.Dynamic.literal()
      SchemaId.foreach(__v => __obj.updateDynamic("SchemaId")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      SchemaVersionNumber.foreach(__v => __obj.updateDynamic("SchemaVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaReference]
    }
  }

  @js.native
  sealed trait SchemaStatus extends js.Any
  object SchemaStatus {
    val AVAILABLE = "AVAILABLE".asInstanceOf[SchemaStatus]
    val PENDING = "PENDING".asInstanceOf[SchemaStatus]
    val DELETING = "DELETING".asInstanceOf[SchemaStatus]

    @inline def values = js.Array(AVAILABLE, PENDING, DELETING)
  }

  /** An object that contains the error details for an operation on a schema version.
    */
  @js.native
  trait SchemaVersionErrorItem extends js.Object {
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var VersionNumber: js.UndefOr[VersionLongNumber]
  }

  object SchemaVersionErrorItem {
    @inline
    def apply(
        ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
    ): SchemaVersionErrorItem = {
      val __obj = js.Dynamic.literal()
      ErrorDetails.foreach(__v => __obj.updateDynamic("ErrorDetails")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaVersionErrorItem]
    }
  }

  /** An object containing the details about a schema version.
    */
  @js.native
  trait SchemaVersionListItem extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTimestamp]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaVersionId: js.UndefOr[SchemaVersionIdString]
    var Status: js.UndefOr[SchemaVersionStatus]
    var VersionNumber: js.UndefOr[VersionLongNumber]
  }

  object SchemaVersionListItem {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined,
        Status: js.UndefOr[SchemaVersionStatus] = js.undefined,
        VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
    ): SchemaVersionListItem = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaVersionId.foreach(__v => __obj.updateDynamic("SchemaVersionId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaVersionListItem]
    }
  }

  /** A structure containing the schema version information.
    */
  @js.native
  trait SchemaVersionNumber extends js.Object {
    var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean]
    var VersionNumber: js.UndefOr[VersionLongNumber]
  }

  object SchemaVersionNumber {
    @inline
    def apply(
        LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.undefined,
        VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
    ): SchemaVersionNumber = {
      val __obj = js.Dynamic.literal()
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaVersionNumber]
    }
  }

  @js.native
  sealed trait SchemaVersionStatus extends js.Any
  object SchemaVersionStatus {
    val AVAILABLE = "AVAILABLE".asInstanceOf[SchemaVersionStatus]
    val PENDING = "PENDING".asInstanceOf[SchemaVersionStatus]
    val FAILURE = "FAILURE".asInstanceOf[SchemaVersionStatus]
    val DELETING = "DELETING".asInstanceOf[SchemaVersionStatus]

    @inline def values = js.Array(AVAILABLE, PENDING, FAILURE, DELETING)
  }

  @js.native
  trait SearchTablesRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var Filters: js.UndefOr[SearchPropertyPredicates]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var ResourceShareType: js.UndefOr[ResourceShareType]
    var SearchText: js.UndefOr[ValueString]
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  object SearchTablesRequest {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        Filters: js.UndefOr[SearchPropertyPredicates] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ResourceShareType: js.UndefOr[ResourceShareType] = js.undefined,
        SearchText: js.UndefOr[ValueString] = js.undefined,
        SortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): SearchTablesRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceShareType.foreach(__v => __obj.updateDynamic("ResourceShareType")(__v.asInstanceOf[js.Any]))
      SearchText.foreach(__v => __obj.updateDynamic("SearchText")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchTablesRequest]
    }
  }

  @js.native
  trait SearchTablesResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableList: js.UndefOr[TableList]
  }

  object SearchTablesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        TableList: js.UndefOr[TableList] = js.undefined
    ): SearchTablesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TableList.foreach(__v => __obj.updateDynamic("TableList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchTablesResponse]
    }
  }

  /** Specifies a security configuration.
    */
  @js.native
  trait SecurityConfiguration extends js.Object {
    var CreatedTimeStamp: js.UndefOr[TimestampValue]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var Name: js.UndefOr[NameString]
  }

  object SecurityConfiguration {
    @inline
    def apply(
        CreatedTimeStamp: js.UndefOr[TimestampValue] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined
    ): SecurityConfiguration = {
      val __obj = js.Dynamic.literal()
      CreatedTimeStamp.foreach(__v => __obj.updateDynamic("CreatedTimeStamp")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityConfiguration]
    }
  }

  /** Defines a non-overlapping region of a table's partitions, allowing multiple requests to be executed in parallel.
    */
  @js.native
  trait Segment extends js.Object {
    var SegmentNumber: NonNegativeInteger
    var TotalSegments: TotalSegmentsInteger
  }

  object Segment {
    @inline
    def apply(
        SegmentNumber: NonNegativeInteger,
        TotalSegments: TotalSegmentsInteger
    ): Segment = {
      val __obj = js.Dynamic.literal(
        "SegmentNumber" -> SegmentNumber.asInstanceOf[js.Any],
        "TotalSegments" -> TotalSegments.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Segment]
    }
  }

  /** Information about a serialization/deserialization program (SerDe) that serves as an extractor and loader.
    */
  @js.native
  trait SerDeInfo extends js.Object {
    var Name: js.UndefOr[NameString]
    var Parameters: js.UndefOr[ParametersMap]
    var SerializationLibrary: js.UndefOr[NameString]
  }

  object SerDeInfo {
    @inline
    def apply(
        Name: js.UndefOr[NameString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        SerializationLibrary: js.UndefOr[NameString] = js.undefined
    ): SerDeInfo = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      SerializationLibrary.foreach(__v => __obj.updateDynamic("SerializationLibrary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SerDeInfo]
    }
  }

  /** Specifies skewed values in a table. Skewed values are those that occur with very high frequency.
    */
  @js.native
  trait SkewedInfo extends js.Object {
    var SkewedColumnNames: js.UndefOr[NameStringList]
    var SkewedColumnValueLocationMaps: js.UndefOr[LocationMap]
    var SkewedColumnValues: js.UndefOr[ColumnValueStringList]
  }

  object SkewedInfo {
    @inline
    def apply(
        SkewedColumnNames: js.UndefOr[NameStringList] = js.undefined,
        SkewedColumnValueLocationMaps: js.UndefOr[LocationMap] = js.undefined,
        SkewedColumnValues: js.UndefOr[ColumnValueStringList] = js.undefined
    ): SkewedInfo = {
      val __obj = js.Dynamic.literal()
      SkewedColumnNames.foreach(__v => __obj.updateDynamic("SkewedColumnNames")(__v.asInstanceOf[js.Any]))
      SkewedColumnValueLocationMaps.foreach(__v => __obj.updateDynamic("SkewedColumnValueLocationMaps")(__v.asInstanceOf[js.Any]))
      SkewedColumnValues.foreach(__v => __obj.updateDynamic("SkewedColumnValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SkewedInfo]
    }
  }

  @js.native
  sealed trait Sort extends js.Any
  object Sort {
    val ASC = "ASC".asInstanceOf[Sort]
    val DESC = "DESC".asInstanceOf[Sort]

    @inline def values = js.Array(ASC, DESC)
  }

  /** Specifies a field to sort by and a sort order.
    */
  @js.native
  trait SortCriterion extends js.Object {
    var FieldName: js.UndefOr[ValueString]
    var Sort: js.UndefOr[Sort]
  }

  object SortCriterion {
    @inline
    def apply(
        FieldName: js.UndefOr[ValueString] = js.undefined,
        Sort: js.UndefOr[Sort] = js.undefined
    ): SortCriterion = {
      val __obj = js.Dynamic.literal()
      FieldName.foreach(__v => __obj.updateDynamic("FieldName")(__v.asInstanceOf[js.Any]))
      Sort.foreach(__v => __obj.updateDynamic("Sort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SortCriterion]
    }
  }

  @js.native
  sealed trait SortDirectionType extends js.Any
  object SortDirectionType {
    val DESCENDING = "DESCENDING".asInstanceOf[SortDirectionType]
    val ASCENDING = "ASCENDING".asInstanceOf[SortDirectionType]

    @inline def values = js.Array(DESCENDING, ASCENDING)
  }

  @js.native
  trait StartCrawlerRequest extends js.Object {
    var Name: NameString
  }

  object StartCrawlerRequest {
    @inline
    def apply(
        Name: NameString
    ): StartCrawlerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartCrawlerRequest]
    }
  }

  @js.native
  trait StartCrawlerResponse extends js.Object

  object StartCrawlerResponse {
    @inline
    def apply(): StartCrawlerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartCrawlerResponse]
    }
  }

  @js.native
  trait StartCrawlerScheduleRequest extends js.Object {
    var CrawlerName: NameString
  }

  object StartCrawlerScheduleRequest {
    @inline
    def apply(
        CrawlerName: NameString
    ): StartCrawlerScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "CrawlerName" -> CrawlerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartCrawlerScheduleRequest]
    }
  }

  @js.native
  trait StartCrawlerScheduleResponse extends js.Object

  object StartCrawlerScheduleResponse {
    @inline
    def apply(): StartCrawlerScheduleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartCrawlerScheduleResponse]
    }
  }

  @js.native
  trait StartExportLabelsTaskRunRequest extends js.Object {
    var OutputS3Path: UriString
    var TransformId: HashString
  }

  object StartExportLabelsTaskRunRequest {
    @inline
    def apply(
        OutputS3Path: UriString,
        TransformId: HashString
    ): StartExportLabelsTaskRunRequest = {
      val __obj = js.Dynamic.literal(
        "OutputS3Path" -> OutputS3Path.asInstanceOf[js.Any],
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartExportLabelsTaskRunRequest]
    }
  }

  @js.native
  trait StartExportLabelsTaskRunResponse extends js.Object {
    var TaskRunId: js.UndefOr[HashString]
  }

  object StartExportLabelsTaskRunResponse {
    @inline
    def apply(
        TaskRunId: js.UndefOr[HashString] = js.undefined
    ): StartExportLabelsTaskRunResponse = {
      val __obj = js.Dynamic.literal()
      TaskRunId.foreach(__v => __obj.updateDynamic("TaskRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartExportLabelsTaskRunResponse]
    }
  }

  @js.native
  trait StartImportLabelsTaskRunRequest extends js.Object {
    var InputS3Path: UriString
    var TransformId: HashString
    var ReplaceAllLabels: js.UndefOr[ReplaceBoolean]
  }

  object StartImportLabelsTaskRunRequest {
    @inline
    def apply(
        InputS3Path: UriString,
        TransformId: HashString,
        ReplaceAllLabels: js.UndefOr[ReplaceBoolean] = js.undefined
    ): StartImportLabelsTaskRunRequest = {
      val __obj = js.Dynamic.literal(
        "InputS3Path" -> InputS3Path.asInstanceOf[js.Any],
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )

      ReplaceAllLabels.foreach(__v => __obj.updateDynamic("ReplaceAllLabels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImportLabelsTaskRunRequest]
    }
  }

  @js.native
  trait StartImportLabelsTaskRunResponse extends js.Object {
    var TaskRunId: js.UndefOr[HashString]
  }

  object StartImportLabelsTaskRunResponse {
    @inline
    def apply(
        TaskRunId: js.UndefOr[HashString] = js.undefined
    ): StartImportLabelsTaskRunResponse = {
      val __obj = js.Dynamic.literal()
      TaskRunId.foreach(__v => __obj.updateDynamic("TaskRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImportLabelsTaskRunResponse]
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "JobName" -> JobName.asInstanceOf[js.Any]
      )

      AllocatedCapacity.foreach(__v => __obj.updateDynamic("AllocatedCapacity")(__v.asInstanceOf[js.Any]))
      Arguments.foreach(__v => __obj.updateDynamic("Arguments")(__v.asInstanceOf[js.Any]))
      JobRunId.foreach(__v => __obj.updateDynamic("JobRunId")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      NotificationProperty.foreach(__v => __obj.updateDynamic("NotificationProperty")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      SecurityConfiguration.foreach(__v => __obj.updateDynamic("SecurityConfiguration")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartJobRunRequest]
    }
  }

  @js.native
  trait StartJobRunResponse extends js.Object {
    var JobRunId: js.UndefOr[IdString]
  }

  object StartJobRunResponse {
    @inline
    def apply(
        JobRunId: js.UndefOr[IdString] = js.undefined
    ): StartJobRunResponse = {
      val __obj = js.Dynamic.literal()
      JobRunId.foreach(__v => __obj.updateDynamic("JobRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartJobRunResponse]
    }
  }

  @js.native
  trait StartMLEvaluationTaskRunRequest extends js.Object {
    var TransformId: HashString
  }

  object StartMLEvaluationTaskRunRequest {
    @inline
    def apply(
        TransformId: HashString
    ): StartMLEvaluationTaskRunRequest = {
      val __obj = js.Dynamic.literal(
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMLEvaluationTaskRunRequest]
    }
  }

  @js.native
  trait StartMLEvaluationTaskRunResponse extends js.Object {
    var TaskRunId: js.UndefOr[HashString]
  }

  object StartMLEvaluationTaskRunResponse {
    @inline
    def apply(
        TaskRunId: js.UndefOr[HashString] = js.undefined
    ): StartMLEvaluationTaskRunResponse = {
      val __obj = js.Dynamic.literal()
      TaskRunId.foreach(__v => __obj.updateDynamic("TaskRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMLEvaluationTaskRunResponse]
    }
  }

  @js.native
  trait StartMLLabelingSetGenerationTaskRunRequest extends js.Object {
    var OutputS3Path: UriString
    var TransformId: HashString
  }

  object StartMLLabelingSetGenerationTaskRunRequest {
    @inline
    def apply(
        OutputS3Path: UriString,
        TransformId: HashString
    ): StartMLLabelingSetGenerationTaskRunRequest = {
      val __obj = js.Dynamic.literal(
        "OutputS3Path" -> OutputS3Path.asInstanceOf[js.Any],
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMLLabelingSetGenerationTaskRunRequest]
    }
  }

  @js.native
  trait StartMLLabelingSetGenerationTaskRunResponse extends js.Object {
    var TaskRunId: js.UndefOr[HashString]
  }

  object StartMLLabelingSetGenerationTaskRunResponse {
    @inline
    def apply(
        TaskRunId: js.UndefOr[HashString] = js.undefined
    ): StartMLLabelingSetGenerationTaskRunResponse = {
      val __obj = js.Dynamic.literal()
      TaskRunId.foreach(__v => __obj.updateDynamic("TaskRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMLLabelingSetGenerationTaskRunResponse]
    }
  }

  @js.native
  trait StartTriggerRequest extends js.Object {
    var Name: NameString
  }

  object StartTriggerRequest {
    @inline
    def apply(
        Name: NameString
    ): StartTriggerRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): StartTriggerResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTriggerResponse]
    }
  }

  @js.native
  trait StartWorkflowRunRequest extends js.Object {
    var Name: NameString
  }

  object StartWorkflowRunRequest {
    @inline
    def apply(
        Name: NameString
    ): StartWorkflowRunRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartWorkflowRunRequest]
    }
  }

  @js.native
  trait StartWorkflowRunResponse extends js.Object {
    var RunId: js.UndefOr[IdString]
  }

  object StartWorkflowRunResponse {
    @inline
    def apply(
        RunId: js.UndefOr[IdString] = js.undefined
    ): StartWorkflowRunResponse = {
      val __obj = js.Dynamic.literal()
      RunId.foreach(__v => __obj.updateDynamic("RunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartWorkflowRunResponse]
    }
  }

  @js.native
  trait StopCrawlerRequest extends js.Object {
    var Name: NameString
  }

  object StopCrawlerRequest {
    @inline
    def apply(
        Name: NameString
    ): StopCrawlerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopCrawlerRequest]
    }
  }

  @js.native
  trait StopCrawlerResponse extends js.Object

  object StopCrawlerResponse {
    @inline
    def apply(): StopCrawlerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopCrawlerResponse]
    }
  }

  @js.native
  trait StopCrawlerScheduleRequest extends js.Object {
    var CrawlerName: NameString
  }

  object StopCrawlerScheduleRequest {
    @inline
    def apply(
        CrawlerName: NameString
    ): StopCrawlerScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "CrawlerName" -> CrawlerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopCrawlerScheduleRequest]
    }
  }

  @js.native
  trait StopCrawlerScheduleResponse extends js.Object

  object StopCrawlerScheduleResponse {
    @inline
    def apply(): StopCrawlerScheduleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopCrawlerScheduleResponse]
    }
  }

  @js.native
  trait StopTriggerRequest extends js.Object {
    var Name: NameString
  }

  object StopTriggerRequest {
    @inline
    def apply(
        Name: NameString
    ): StopTriggerRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): StopTriggerResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopTriggerResponse]
    }
  }

  @js.native
  trait StopWorkflowRunRequest extends js.Object {
    var Name: NameString
    var RunId: IdString
  }

  object StopWorkflowRunRequest {
    @inline
    def apply(
        Name: NameString,
        RunId: IdString
    ): StopWorkflowRunRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RunId" -> RunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopWorkflowRunRequest]
    }
  }

  @js.native
  trait StopWorkflowRunResponse extends js.Object

  object StopWorkflowRunResponse {
    @inline
    def apply(): StopWorkflowRunResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopWorkflowRunResponse]
    }
  }

  /** Describes the physical storage of table data.
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
    var SchemaReference: js.UndefOr[SchemaReference]
    var SerdeInfo: js.UndefOr[SerDeInfo]
    var SkewedInfo: js.UndefOr[SkewedInfo]
    var SortColumns: js.UndefOr[OrderList]
    var StoredAsSubDirectories: js.UndefOr[Boolean]
  }

  object StorageDescriptor {
    @inline
    def apply(
        BucketColumns: js.UndefOr[NameStringList] = js.undefined,
        Columns: js.UndefOr[ColumnList] = js.undefined,
        Compressed: js.UndefOr[Boolean] = js.undefined,
        InputFormat: js.UndefOr[FormatString] = js.undefined,
        Location: js.UndefOr[LocationString] = js.undefined,
        NumberOfBuckets: js.UndefOr[Int] = js.undefined,
        OutputFormat: js.UndefOr[FormatString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        SchemaReference: js.UndefOr[SchemaReference] = js.undefined,
        SerdeInfo: js.UndefOr[SerDeInfo] = js.undefined,
        SkewedInfo: js.UndefOr[SkewedInfo] = js.undefined,
        SortColumns: js.UndefOr[OrderList] = js.undefined,
        StoredAsSubDirectories: js.UndefOr[Boolean] = js.undefined
    ): StorageDescriptor = {
      val __obj = js.Dynamic.literal()
      BucketColumns.foreach(__v => __obj.updateDynamic("BucketColumns")(__v.asInstanceOf[js.Any]))
      Columns.foreach(__v => __obj.updateDynamic("Columns")(__v.asInstanceOf[js.Any]))
      Compressed.foreach(__v => __obj.updateDynamic("Compressed")(__v.asInstanceOf[js.Any]))
      InputFormat.foreach(__v => __obj.updateDynamic("InputFormat")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      NumberOfBuckets.foreach(__v => __obj.updateDynamic("NumberOfBuckets")(__v.asInstanceOf[js.Any]))
      OutputFormat.foreach(__v => __obj.updateDynamic("OutputFormat")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      SchemaReference.foreach(__v => __obj.updateDynamic("SchemaReference")(__v.asInstanceOf[js.Any]))
      SerdeInfo.foreach(__v => __obj.updateDynamic("SerdeInfo")(__v.asInstanceOf[js.Any]))
      SkewedInfo.foreach(__v => __obj.updateDynamic("SkewedInfo")(__v.asInstanceOf[js.Any]))
      SortColumns.foreach(__v => __obj.updateDynamic("SortColumns")(__v.asInstanceOf[js.Any]))
      StoredAsSubDirectories.foreach(__v => __obj.updateDynamic("StoredAsSubDirectories")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageDescriptor]
    }
  }

  /** Defines column statistics supported for character sequence data values.
    */
  @js.native
  trait StringColumnStatisticsData extends js.Object {
    var AverageLength: NonNegativeDouble
    var MaximumLength: NonNegativeLong
    var NumberOfDistinctValues: NonNegativeLong
    var NumberOfNulls: NonNegativeLong
  }

  object StringColumnStatisticsData {
    @inline
    def apply(
        AverageLength: NonNegativeDouble,
        MaximumLength: NonNegativeLong,
        NumberOfDistinctValues: NonNegativeLong,
        NumberOfNulls: NonNegativeLong
    ): StringColumnStatisticsData = {
      val __obj = js.Dynamic.literal(
        "AverageLength" -> AverageLength.asInstanceOf[js.Any],
        "MaximumLength" -> MaximumLength.asInstanceOf[js.Any],
        "NumberOfDistinctValues" -> NumberOfDistinctValues.asInstanceOf[js.Any],
        "NumberOfNulls" -> NumberOfNulls.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StringColumnStatisticsData]
    }
  }

  /** Represents a collection of related data organized in columns and rows.
    */
  @js.native
  trait Table extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
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
    var TargetTable: js.UndefOr[TableIdentifier]
    var UpdateTime: js.UndefOr[Timestamp]
    var ViewExpandedText: js.UndefOr[ViewTextString]
    var ViewOriginalText: js.UndefOr[ViewTextString]
  }

  object Table {
    @inline
    def apply(
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        CreatedBy: js.UndefOr[NameString] = js.undefined,
        DatabaseName: js.UndefOr[NameString] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        IsRegisteredWithLakeFormation: js.UndefOr[Boolean] = js.undefined,
        LastAccessTime: js.UndefOr[Timestamp] = js.undefined,
        LastAnalyzedTime: js.UndefOr[Timestamp] = js.undefined,
        Owner: js.UndefOr[NameString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        PartitionKeys: js.UndefOr[ColumnList] = js.undefined,
        Retention: js.UndefOr[NonNegativeInteger] = js.undefined,
        StorageDescriptor: js.UndefOr[StorageDescriptor] = js.undefined,
        TableType: js.UndefOr[TableTypeString] = js.undefined,
        TargetTable: js.UndefOr[TableIdentifier] = js.undefined,
        UpdateTime: js.UndefOr[Timestamp] = js.undefined,
        ViewExpandedText: js.UndefOr[ViewTextString] = js.undefined,
        ViewOriginalText: js.UndefOr[ViewTextString] = js.undefined
    ): Table = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsRegisteredWithLakeFormation.foreach(__v => __obj.updateDynamic("IsRegisteredWithLakeFormation")(__v.asInstanceOf[js.Any]))
      LastAccessTime.foreach(__v => __obj.updateDynamic("LastAccessTime")(__v.asInstanceOf[js.Any]))
      LastAnalyzedTime.foreach(__v => __obj.updateDynamic("LastAnalyzedTime")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      PartitionKeys.foreach(__v => __obj.updateDynamic("PartitionKeys")(__v.asInstanceOf[js.Any]))
      Retention.foreach(__v => __obj.updateDynamic("Retention")(__v.asInstanceOf[js.Any]))
      StorageDescriptor.foreach(__v => __obj.updateDynamic("StorageDescriptor")(__v.asInstanceOf[js.Any]))
      TableType.foreach(__v => __obj.updateDynamic("TableType")(__v.asInstanceOf[js.Any]))
      TargetTable.foreach(__v => __obj.updateDynamic("TargetTable")(__v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.updateDynamic("UpdateTime")(__v.asInstanceOf[js.Any]))
      ViewExpandedText.foreach(__v => __obj.updateDynamic("ViewExpandedText")(__v.asInstanceOf[js.Any]))
      ViewOriginalText.foreach(__v => __obj.updateDynamic("ViewOriginalText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Table]
    }
  }

  /** An error record for table operations.
    */
  @js.native
  trait TableError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var TableName: js.UndefOr[NameString]
  }

  object TableError {
    @inline
    def apply(
        ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined,
        TableName: js.UndefOr[NameString] = js.undefined
    ): TableError = {
      val __obj = js.Dynamic.literal()
      ErrorDetail.foreach(__v => __obj.updateDynamic("ErrorDetail")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableError]
    }
  }

  /** A structure that describes a target table for resource linking.
    */
  @js.native
  trait TableIdentifier extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var DatabaseName: js.UndefOr[NameString]
    var Name: js.UndefOr[NameString]
  }

  object TableIdentifier {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        DatabaseName: js.UndefOr[NameString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined
    ): TableIdentifier = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableIdentifier]
    }
  }

  /** A structure used to define a table.
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
    var TargetTable: js.UndefOr[TableIdentifier]
    var ViewExpandedText: js.UndefOr[ViewTextString]
    var ViewOriginalText: js.UndefOr[ViewTextString]
  }

  object TableInput {
    @inline
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
        TargetTable: js.UndefOr[TableIdentifier] = js.undefined,
        ViewExpandedText: js.UndefOr[ViewTextString] = js.undefined,
        ViewOriginalText: js.UndefOr[ViewTextString] = js.undefined
    ): TableInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastAccessTime.foreach(__v => __obj.updateDynamic("LastAccessTime")(__v.asInstanceOf[js.Any]))
      LastAnalyzedTime.foreach(__v => __obj.updateDynamic("LastAnalyzedTime")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      PartitionKeys.foreach(__v => __obj.updateDynamic("PartitionKeys")(__v.asInstanceOf[js.Any]))
      Retention.foreach(__v => __obj.updateDynamic("Retention")(__v.asInstanceOf[js.Any]))
      StorageDescriptor.foreach(__v => __obj.updateDynamic("StorageDescriptor")(__v.asInstanceOf[js.Any]))
      TableType.foreach(__v => __obj.updateDynamic("TableType")(__v.asInstanceOf[js.Any]))
      TargetTable.foreach(__v => __obj.updateDynamic("TargetTable")(__v.asInstanceOf[js.Any]))
      ViewExpandedText.foreach(__v => __obj.updateDynamic("ViewExpandedText")(__v.asInstanceOf[js.Any]))
      ViewOriginalText.foreach(__v => __obj.updateDynamic("ViewOriginalText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableInput]
    }
  }

  /** Specifies a version of a table.
    */
  @js.native
  trait TableVersion extends js.Object {
    var Table: js.UndefOr[Table]
    var VersionId: js.UndefOr[VersionString]
  }

  object TableVersion {
    @inline
    def apply(
        Table: js.UndefOr[Table] = js.undefined,
        VersionId: js.UndefOr[VersionString] = js.undefined
    ): TableVersion = {
      val __obj = js.Dynamic.literal()
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableVersion]
    }
  }

  /** An error record for table-version operations.
    */
  @js.native
  trait TableVersionError extends js.Object {
    var ErrorDetail: js.UndefOr[ErrorDetail]
    var TableName: js.UndefOr[NameString]
    var VersionId: js.UndefOr[VersionString]
  }

  object TableVersionError {
    @inline
    def apply(
        ErrorDetail: js.UndefOr[ErrorDetail] = js.undefined,
        TableName: js.UndefOr[NameString] = js.undefined,
        VersionId: js.UndefOr[VersionString] = js.undefined
    ): TableVersionError = {
      val __obj = js.Dynamic.literal()
      ErrorDetail.foreach(__v => __obj.updateDynamic("ErrorDetail")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableVersionError]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: GlueResourceArn
    var TagsToAdd: TagsMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: GlueResourceArn,
        TagsToAdd: TagsMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagsToAdd" -> TagsToAdd.asInstanceOf[js.Any]
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

  /** The sampling parameters that are associated with the machine learning transform.
    */
  @js.native
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

  object TaskRun {
    @inline
    def apply(
        CompletedOn: js.UndefOr[Timestamp] = js.undefined,
        ErrorString: js.UndefOr[GenericString] = js.undefined,
        ExecutionTime: js.UndefOr[ExecutionTime] = js.undefined,
        LastModifiedOn: js.UndefOr[Timestamp] = js.undefined,
        LogGroupName: js.UndefOr[GenericString] = js.undefined,
        Properties: js.UndefOr[TaskRunProperties] = js.undefined,
        StartedOn: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[TaskStatusType] = js.undefined,
        TaskRunId: js.UndefOr[HashString] = js.undefined,
        TransformId: js.UndefOr[HashString] = js.undefined
    ): TaskRun = {
      val __obj = js.Dynamic.literal()
      CompletedOn.foreach(__v => __obj.updateDynamic("CompletedOn")(__v.asInstanceOf[js.Any]))
      ErrorString.foreach(__v => __obj.updateDynamic("ErrorString")(__v.asInstanceOf[js.Any]))
      ExecutionTime.foreach(__v => __obj.updateDynamic("ExecutionTime")(__v.asInstanceOf[js.Any]))
      LastModifiedOn.foreach(__v => __obj.updateDynamic("LastModifiedOn")(__v.asInstanceOf[js.Any]))
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      StartedOn.foreach(__v => __obj.updateDynamic("StartedOn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskRunId.foreach(__v => __obj.updateDynamic("TaskRunId")(__v.asInstanceOf[js.Any]))
      TransformId.foreach(__v => __obj.updateDynamic("TransformId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskRun]
    }
  }

  /** The criteria that are used to filter the task runs for the machine learning transform.
    */
  @js.native
  trait TaskRunFilterCriteria extends js.Object {
    var StartedAfter: js.UndefOr[Timestamp]
    var StartedBefore: js.UndefOr[Timestamp]
    var Status: js.UndefOr[TaskStatusType]
    var TaskRunType: js.UndefOr[TaskType]
  }

  object TaskRunFilterCriteria {
    @inline
    def apply(
        StartedAfter: js.UndefOr[Timestamp] = js.undefined,
        StartedBefore: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[TaskStatusType] = js.undefined,
        TaskRunType: js.UndefOr[TaskType] = js.undefined
    ): TaskRunFilterCriteria = {
      val __obj = js.Dynamic.literal()
      StartedAfter.foreach(__v => __obj.updateDynamic("StartedAfter")(__v.asInstanceOf[js.Any]))
      StartedBefore.foreach(__v => __obj.updateDynamic("StartedBefore")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskRunType.foreach(__v => __obj.updateDynamic("TaskRunType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskRunFilterCriteria]
    }
  }

  /** The configuration properties for the task run.
    */
  @js.native
  trait TaskRunProperties extends js.Object {
    var ExportLabelsTaskRunProperties: js.UndefOr[ExportLabelsTaskRunProperties]
    var FindMatchesTaskRunProperties: js.UndefOr[FindMatchesTaskRunProperties]
    var ImportLabelsTaskRunProperties: js.UndefOr[ImportLabelsTaskRunProperties]
    var LabelingSetGenerationTaskRunProperties: js.UndefOr[LabelingSetGenerationTaskRunProperties]
    var TaskType: js.UndefOr[TaskType]
  }

  object TaskRunProperties {
    @inline
    def apply(
        ExportLabelsTaskRunProperties: js.UndefOr[ExportLabelsTaskRunProperties] = js.undefined,
        FindMatchesTaskRunProperties: js.UndefOr[FindMatchesTaskRunProperties] = js.undefined,
        ImportLabelsTaskRunProperties: js.UndefOr[ImportLabelsTaskRunProperties] = js.undefined,
        LabelingSetGenerationTaskRunProperties: js.UndefOr[LabelingSetGenerationTaskRunProperties] = js.undefined,
        TaskType: js.UndefOr[TaskType] = js.undefined
    ): TaskRunProperties = {
      val __obj = js.Dynamic.literal()
      ExportLabelsTaskRunProperties.foreach(__v => __obj.updateDynamic("ExportLabelsTaskRunProperties")(__v.asInstanceOf[js.Any]))
      FindMatchesTaskRunProperties.foreach(__v => __obj.updateDynamic("FindMatchesTaskRunProperties")(__v.asInstanceOf[js.Any]))
      ImportLabelsTaskRunProperties.foreach(__v => __obj.updateDynamic("ImportLabelsTaskRunProperties")(__v.asInstanceOf[js.Any]))
      LabelingSetGenerationTaskRunProperties.foreach(__v => __obj.updateDynamic("LabelingSetGenerationTaskRunProperties")(__v.asInstanceOf[js.Any]))
      TaskType.foreach(__v => __obj.updateDynamic("TaskType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskRunProperties]
    }
  }

  @js.native
  sealed trait TaskRunSortColumnType extends js.Any
  object TaskRunSortColumnType {
    val TASK_RUN_TYPE = "TASK_RUN_TYPE".asInstanceOf[TaskRunSortColumnType]
    val STATUS = "STATUS".asInstanceOf[TaskRunSortColumnType]
    val STARTED = "STARTED".asInstanceOf[TaskRunSortColumnType]

    @inline def values = js.Array(TASK_RUN_TYPE, STATUS, STARTED)
  }

  /** The sorting criteria that are used to sort the list of task runs for the machine learning transform.
    */
  @js.native
  trait TaskRunSortCriteria extends js.Object {
    var Column: TaskRunSortColumnType
    var SortDirection: SortDirectionType
  }

  object TaskRunSortCriteria {
    @inline
    def apply(
        Column: TaskRunSortColumnType,
        SortDirection: SortDirectionType
    ): TaskRunSortCriteria = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "SortDirection" -> SortDirection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TaskRunSortCriteria]
    }
  }

  @js.native
  sealed trait TaskStatusType extends js.Any
  object TaskStatusType {
    val STARTING = "STARTING".asInstanceOf[TaskStatusType]
    val RUNNING = "RUNNING".asInstanceOf[TaskStatusType]
    val STOPPING = "STOPPING".asInstanceOf[TaskStatusType]
    val STOPPED = "STOPPED".asInstanceOf[TaskStatusType]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[TaskStatusType]
    val FAILED = "FAILED".asInstanceOf[TaskStatusType]
    val TIMEOUT = "TIMEOUT".asInstanceOf[TaskStatusType]

    @inline def values = js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
  }

  @js.native
  sealed trait TaskType extends js.Any
  object TaskType {
    val EVALUATION = "EVALUATION".asInstanceOf[TaskType]
    val LABELING_SET_GENERATION = "LABELING_SET_GENERATION".asInstanceOf[TaskType]
    val IMPORT_LABELS = "IMPORT_LABELS".asInstanceOf[TaskType]
    val EXPORT_LABELS = "EXPORT_LABELS".asInstanceOf[TaskType]
    val FIND_MATCHES = "FIND_MATCHES".asInstanceOf[TaskType]

    @inline def values = js.Array(EVALUATION, LABELING_SET_GENERATION, IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES)
  }

  /** The encryption-at-rest settings of the transform that apply to accessing user data. Machine learning transforms can access user data encrypted in Amazon S3 using KMS.
    * Additionally, imported labels and trained transforms can now be encrypted using a customer provided KMS key.
    */
  @js.native
  trait TransformEncryption extends js.Object {
    var MlUserDataEncryption: js.UndefOr[MLUserDataEncryption]
    var TaskRunSecurityConfigurationName: js.UndefOr[NameString]
  }

  object TransformEncryption {
    @inline
    def apply(
        MlUserDataEncryption: js.UndefOr[MLUserDataEncryption] = js.undefined,
        TaskRunSecurityConfigurationName: js.UndefOr[NameString] = js.undefined
    ): TransformEncryption = {
      val __obj = js.Dynamic.literal()
      MlUserDataEncryption.foreach(__v => __obj.updateDynamic("MlUserDataEncryption")(__v.asInstanceOf[js.Any]))
      TaskRunSecurityConfigurationName.foreach(__v => __obj.updateDynamic("TaskRunSecurityConfigurationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformEncryption]
    }
  }

  /** The criteria used to filter the machine learning transforms.
    */
  @js.native
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

  object TransformFilterCriteria {
    @inline
    def apply(
        CreatedAfter: js.UndefOr[Timestamp] = js.undefined,
        CreatedBefore: js.UndefOr[Timestamp] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        LastModifiedAfter: js.UndefOr[Timestamp] = js.undefined,
        LastModifiedBefore: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Schema: js.UndefOr[TransformSchema] = js.undefined,
        Status: js.UndefOr[TransformStatusType] = js.undefined,
        TransformType: js.UndefOr[TransformType] = js.undefined
    ): TransformFilterCriteria = {
      val __obj = js.Dynamic.literal()
      CreatedAfter.foreach(__v => __obj.updateDynamic("CreatedAfter")(__v.asInstanceOf[js.Any]))
      CreatedBefore.foreach(__v => __obj.updateDynamic("CreatedBefore")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      LastModifiedAfter.foreach(__v => __obj.updateDynamic("LastModifiedAfter")(__v.asInstanceOf[js.Any]))
      LastModifiedBefore.foreach(__v => __obj.updateDynamic("LastModifiedBefore")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TransformType.foreach(__v => __obj.updateDynamic("TransformType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformFilterCriteria]
    }
  }

  /** The algorithm-specific parameters that are associated with the machine learning transform.
    */
  @js.native
  trait TransformParameters extends js.Object {
    var TransformType: TransformType
    var FindMatchesParameters: js.UndefOr[FindMatchesParameters]
  }

  object TransformParameters {
    @inline
    def apply(
        TransformType: TransformType,
        FindMatchesParameters: js.UndefOr[FindMatchesParameters] = js.undefined
    ): TransformParameters = {
      val __obj = js.Dynamic.literal(
        "TransformType" -> TransformType.asInstanceOf[js.Any]
      )

      FindMatchesParameters.foreach(__v => __obj.updateDynamic("FindMatchesParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformParameters]
    }
  }

  @js.native
  sealed trait TransformSortColumnType extends js.Any
  object TransformSortColumnType {
    val NAME = "NAME".asInstanceOf[TransformSortColumnType]
    val TRANSFORM_TYPE = "TRANSFORM_TYPE".asInstanceOf[TransformSortColumnType]
    val STATUS = "STATUS".asInstanceOf[TransformSortColumnType]
    val CREATED = "CREATED".asInstanceOf[TransformSortColumnType]
    val LAST_MODIFIED = "LAST_MODIFIED".asInstanceOf[TransformSortColumnType]

    @inline def values = js.Array(NAME, TRANSFORM_TYPE, STATUS, CREATED, LAST_MODIFIED)
  }

  /** The sorting criteria that are associated with the machine learning transform.
    */
  @js.native
  trait TransformSortCriteria extends js.Object {
    var Column: TransformSortColumnType
    var SortDirection: SortDirectionType
  }

  object TransformSortCriteria {
    @inline
    def apply(
        Column: TransformSortColumnType,
        SortDirection: SortDirectionType
    ): TransformSortCriteria = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "SortDirection" -> SortDirection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TransformSortCriteria]
    }
  }

  @js.native
  sealed trait TransformStatusType extends js.Any
  object TransformStatusType {
    val NOT_READY = "NOT_READY".asInstanceOf[TransformStatusType]
    val READY = "READY".asInstanceOf[TransformStatusType]
    val DELETING = "DELETING".asInstanceOf[TransformStatusType]

    @inline def values = js.Array(NOT_READY, READY, DELETING)
  }

  @js.native
  sealed trait TransformType extends js.Any
  object TransformType {
    val FIND_MATCHES = "FIND_MATCHES".asInstanceOf[TransformType]

    @inline def values = js.Array(FIND_MATCHES)
  }

  /** Information about a specific trigger.
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
    var WorkflowName: js.UndefOr[NameString]
  }

  object Trigger {
    @inline
    def apply(
        Actions: js.UndefOr[ActionList] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Id: js.UndefOr[IdString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Predicate: js.UndefOr[Predicate] = js.undefined,
        Schedule: js.UndefOr[GenericString] = js.undefined,
        State: js.UndefOr[TriggerState] = js.undefined,
        Type: js.UndefOr[TriggerType] = js.undefined,
        WorkflowName: js.UndefOr[NameString] = js.undefined
    ): Trigger = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Predicate.foreach(__v => __obj.updateDynamic("Predicate")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      WorkflowName.foreach(__v => __obj.updateDynamic("WorkflowName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trigger]
    }
  }

  /** The details of a Trigger node present in the workflow.
    */
  @js.native
  trait TriggerNodeDetails extends js.Object {
    var Trigger: js.UndefOr[Trigger]
  }

  object TriggerNodeDetails {
    @inline
    def apply(
        Trigger: js.UndefOr[Trigger] = js.undefined
    ): TriggerNodeDetails = {
      val __obj = js.Dynamic.literal()
      Trigger.foreach(__v => __obj.updateDynamic("Trigger")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerNodeDetails]
    }
  }

  @js.native
  sealed trait TriggerState extends js.Any
  object TriggerState {
    val CREATING = "CREATING".asInstanceOf[TriggerState]
    val CREATED = "CREATED".asInstanceOf[TriggerState]
    val ACTIVATING = "ACTIVATING".asInstanceOf[TriggerState]
    val ACTIVATED = "ACTIVATED".asInstanceOf[TriggerState]
    val DEACTIVATING = "DEACTIVATING".asInstanceOf[TriggerState]
    val DEACTIVATED = "DEACTIVATED".asInstanceOf[TriggerState]
    val DELETING = "DELETING".asInstanceOf[TriggerState]
    val UPDATING = "UPDATING".asInstanceOf[TriggerState]

    @inline def values = js.Array(CREATING, CREATED, ACTIVATING, ACTIVATED, DEACTIVATING, DEACTIVATED, DELETING, UPDATING)
  }

  @js.native
  sealed trait TriggerType extends js.Any
  object TriggerType {
    val SCHEDULED = "SCHEDULED".asInstanceOf[TriggerType]
    val CONDITIONAL = "CONDITIONAL".asInstanceOf[TriggerType]
    val ON_DEMAND = "ON_DEMAND".asInstanceOf[TriggerType]

    @inline def values = js.Array(SCHEDULED, CONDITIONAL, ON_DEMAND)
  }

  /** A structure used to provide information used to update a trigger. This object updates the previous trigger definition by overwriting it completely.
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
    @inline
    def apply(
        Actions: js.UndefOr[ActionList] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Predicate: js.UndefOr[Predicate] = js.undefined,
        Schedule: js.UndefOr[GenericString] = js.undefined
    ): TriggerUpdate = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Predicate.foreach(__v => __obj.updateDynamic("Predicate")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerUpdate]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: GlueResourceArn
    var TagsToRemove: TagKeysList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: GlueResourceArn,
        TagsToRemove: TagKeysList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagsToRemove" -> TagsToRemove.asInstanceOf[js.Any]
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
  sealed trait UpdateBehavior extends js.Any
  object UpdateBehavior {
    val LOG = "LOG".asInstanceOf[UpdateBehavior]
    val UPDATE_IN_DATABASE = "UPDATE_IN_DATABASE".asInstanceOf[UpdateBehavior]

    @inline def values = js.Array(LOG, UPDATE_IN_DATABASE)
  }

  @js.native
  trait UpdateClassifierRequest extends js.Object {
    var CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest]
    var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest]
    var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest]
    var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest]
  }

  object UpdateClassifierRequest {
    @inline
    def apply(
        CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest] = js.undefined,
        GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest] = js.undefined,
        JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest] = js.undefined,
        XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest] = js.undefined
    ): UpdateClassifierRequest = {
      val __obj = js.Dynamic.literal()
      CsvClassifier.foreach(__v => __obj.updateDynamic("CsvClassifier")(__v.asInstanceOf[js.Any]))
      GrokClassifier.foreach(__v => __obj.updateDynamic("GrokClassifier")(__v.asInstanceOf[js.Any]))
      JsonClassifier.foreach(__v => __obj.updateDynamic("JsonClassifier")(__v.asInstanceOf[js.Any]))
      XMLClassifier.foreach(__v => __obj.updateDynamic("XMLClassifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClassifierRequest]
    }
  }

  @js.native
  trait UpdateClassifierResponse extends js.Object

  object UpdateClassifierResponse {
    @inline
    def apply(): UpdateClassifierResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateClassifierResponse]
    }
  }

  @js.native
  trait UpdateColumnStatisticsForPartitionRequest extends js.Object {
    var ColumnStatisticsList: UpdateColumnStatisticsList
    var DatabaseName: NameString
    var PartitionValues: ValueStringList
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object UpdateColumnStatisticsForPartitionRequest {
    @inline
    def apply(
        ColumnStatisticsList: UpdateColumnStatisticsList,
        DatabaseName: NameString,
        PartitionValues: ValueStringList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateColumnStatisticsForPartitionRequest = {
      val __obj = js.Dynamic.literal(
        "ColumnStatisticsList" -> ColumnStatisticsList.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionValues" -> PartitionValues.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateColumnStatisticsForPartitionRequest]
    }
  }

  @js.native
  trait UpdateColumnStatisticsForPartitionResponse extends js.Object {
    var Errors: js.UndefOr[ColumnStatisticsErrors]
  }

  object UpdateColumnStatisticsForPartitionResponse {
    @inline
    def apply(
        Errors: js.UndefOr[ColumnStatisticsErrors] = js.undefined
    ): UpdateColumnStatisticsForPartitionResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateColumnStatisticsForPartitionResponse]
    }
  }

  @js.native
  trait UpdateColumnStatisticsForTableRequest extends js.Object {
    var ColumnStatisticsList: UpdateColumnStatisticsList
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object UpdateColumnStatisticsForTableRequest {
    @inline
    def apply(
        ColumnStatisticsList: UpdateColumnStatisticsList,
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateColumnStatisticsForTableRequest = {
      val __obj = js.Dynamic.literal(
        "ColumnStatisticsList" -> ColumnStatisticsList.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateColumnStatisticsForTableRequest]
    }
  }

  @js.native
  trait UpdateColumnStatisticsForTableResponse extends js.Object {
    var Errors: js.UndefOr[ColumnStatisticsErrors]
  }

  object UpdateColumnStatisticsForTableResponse {
    @inline
    def apply(
        Errors: js.UndefOr[ColumnStatisticsErrors] = js.undefined
    ): UpdateColumnStatisticsForTableResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateColumnStatisticsForTableResponse]
    }
  }

  @js.native
  trait UpdateConnectionRequest extends js.Object {
    var ConnectionInput: ConnectionInput
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object UpdateConnectionRequest {
    @inline
    def apply(
        ConnectionInput: ConnectionInput,
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionInput" -> ConnectionInput.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectionRequest]
    }
  }

  @js.native
  trait UpdateConnectionResponse extends js.Object

  object UpdateConnectionResponse {
    @inline
    def apply(): UpdateConnectionResponse = {
      val __obj = js.Dynamic.literal()
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
    var LineageConfiguration: js.UndefOr[LineageConfiguration]
    var RecrawlPolicy: js.UndefOr[RecrawlPolicy]
    var Role: js.UndefOr[Role]
    var Schedule: js.UndefOr[CronExpression]
    var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy]
    var TablePrefix: js.UndefOr[TablePrefix]
    var Targets: js.UndefOr[CrawlerTargets]
  }

  object UpdateCrawlerRequest {
    @inline
    def apply(
        Name: NameString,
        Classifiers: js.UndefOr[ClassifierNameList] = js.undefined,
        Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined,
        CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration] = js.undefined,
        DatabaseName: js.UndefOr[DatabaseName] = js.undefined,
        Description: js.UndefOr[DescriptionStringRemovable] = js.undefined,
        LineageConfiguration: js.UndefOr[LineageConfiguration] = js.undefined,
        RecrawlPolicy: js.UndefOr[RecrawlPolicy] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        Schedule: js.UndefOr[CronExpression] = js.undefined,
        SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined,
        TablePrefix: js.UndefOr[TablePrefix] = js.undefined,
        Targets: js.UndefOr[CrawlerTargets] = js.undefined
    ): UpdateCrawlerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Classifiers.foreach(__v => __obj.updateDynamic("Classifiers")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CrawlerSecurityConfiguration.foreach(__v => __obj.updateDynamic("CrawlerSecurityConfiguration")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LineageConfiguration.foreach(__v => __obj.updateDynamic("LineageConfiguration")(__v.asInstanceOf[js.Any]))
      RecrawlPolicy.foreach(__v => __obj.updateDynamic("RecrawlPolicy")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SchemaChangePolicy.foreach(__v => __obj.updateDynamic("SchemaChangePolicy")(__v.asInstanceOf[js.Any]))
      TablePrefix.foreach(__v => __obj.updateDynamic("TablePrefix")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCrawlerRequest]
    }
  }

  @js.native
  trait UpdateCrawlerResponse extends js.Object

  object UpdateCrawlerResponse {
    @inline
    def apply(): UpdateCrawlerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCrawlerResponse]
    }
  }

  @js.native
  trait UpdateCrawlerScheduleRequest extends js.Object {
    var CrawlerName: NameString
    var Schedule: js.UndefOr[CronExpression]
  }

  object UpdateCrawlerScheduleRequest {
    @inline
    def apply(
        CrawlerName: NameString,
        Schedule: js.UndefOr[CronExpression] = js.undefined
    ): UpdateCrawlerScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "CrawlerName" -> CrawlerName.asInstanceOf[js.Any]
      )

      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCrawlerScheduleRequest]
    }
  }

  @js.native
  trait UpdateCrawlerScheduleResponse extends js.Object

  object UpdateCrawlerScheduleResponse {
    @inline
    def apply(): UpdateCrawlerScheduleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCrawlerScheduleResponse]
    }
  }

  /** Specifies a custom CSV classifier to be updated.
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
    @inline
    def apply(
        Name: NameString,
        AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined,
        ContainsHeader: js.UndefOr[CsvHeaderOption] = js.undefined,
        Delimiter: js.UndefOr[CsvColumnDelimiter] = js.undefined,
        DisableValueTrimming: js.UndefOr[NullableBoolean] = js.undefined,
        Header: js.UndefOr[CsvHeader] = js.undefined,
        QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.undefined
    ): UpdateCsvClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AllowSingleColumn.foreach(__v => __obj.updateDynamic("AllowSingleColumn")(__v.asInstanceOf[js.Any]))
      ContainsHeader.foreach(__v => __obj.updateDynamic("ContainsHeader")(__v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      DisableValueTrimming.foreach(__v => __obj.updateDynamic("DisableValueTrimming")(__v.asInstanceOf[js.Any]))
      Header.foreach(__v => __obj.updateDynamic("Header")(__v.asInstanceOf[js.Any]))
      QuoteSymbol.foreach(__v => __obj.updateDynamic("QuoteSymbol")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseInput: DatabaseInput,
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseInput" -> DatabaseInput.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatabaseRequest]
    }
  }

  @js.native
  trait UpdateDatabaseResponse extends js.Object

  object UpdateDatabaseResponse {
    @inline
    def apply(): UpdateDatabaseResponse = {
      val __obj = js.Dynamic.literal()
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "EndpointName" -> EndpointName.asInstanceOf[js.Any]
      )

      AddArguments.foreach(__v => __obj.updateDynamic("AddArguments")(__v.asInstanceOf[js.Any]))
      AddPublicKeys.foreach(__v => __obj.updateDynamic("AddPublicKeys")(__v.asInstanceOf[js.Any]))
      CustomLibraries.foreach(__v => __obj.updateDynamic("CustomLibraries")(__v.asInstanceOf[js.Any]))
      DeleteArguments.foreach(__v => __obj.updateDynamic("DeleteArguments")(__v.asInstanceOf[js.Any]))
      DeletePublicKeys.foreach(__v => __obj.updateDynamic("DeletePublicKeys")(__v.asInstanceOf[js.Any]))
      PublicKey.foreach(__v => __obj.updateDynamic("PublicKey")(__v.asInstanceOf[js.Any]))
      UpdateEtlLibraries.foreach(__v => __obj.updateDynamic("UpdateEtlLibraries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDevEndpointRequest]
    }
  }

  @js.native
  trait UpdateDevEndpointResponse extends js.Object

  object UpdateDevEndpointResponse {
    @inline
    def apply(): UpdateDevEndpointResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDevEndpointResponse]
    }
  }

  /** Specifies a grok classifier to update when passed to <code>UpdateClassifier</code>.
    */
  @js.native
  trait UpdateGrokClassifierRequest extends js.Object {
    var Name: NameString
    var Classification: js.UndefOr[Classification]
    var CustomPatterns: js.UndefOr[CustomPatterns]
    var GrokPattern: js.UndefOr[GrokPattern]
  }

  object UpdateGrokClassifierRequest {
    @inline
    def apply(
        Name: NameString,
        Classification: js.UndefOr[Classification] = js.undefined,
        CustomPatterns: js.UndefOr[CustomPatterns] = js.undefined,
        GrokPattern: js.UndefOr[GrokPattern] = js.undefined
    ): UpdateGrokClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Classification.foreach(__v => __obj.updateDynamic("Classification")(__v.asInstanceOf[js.Any]))
      CustomPatterns.foreach(__v => __obj.updateDynamic("CustomPatterns")(__v.asInstanceOf[js.Any]))
      GrokPattern.foreach(__v => __obj.updateDynamic("GrokPattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGrokClassifierRequest]
    }
  }

  @js.native
  trait UpdateJobRequest extends js.Object {
    var JobName: NameString
    var JobUpdate: JobUpdate
  }

  object UpdateJobRequest {
    @inline
    def apply(
        JobName: NameString,
        JobUpdate: JobUpdate
    ): UpdateJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobName" -> JobName.asInstanceOf[js.Any],
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
    @inline
    def apply(
        JobName: js.UndefOr[NameString] = js.undefined
    ): UpdateJobResponse = {
      val __obj = js.Dynamic.literal()
      JobName.foreach(__v => __obj.updateDynamic("JobName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobResponse]
    }
  }

  /** Specifies a JSON classifier to be updated.
    */
  @js.native
  trait UpdateJsonClassifierRequest extends js.Object {
    var Name: NameString
    var JsonPath: js.UndefOr[JsonPath]
  }

  object UpdateJsonClassifierRequest {
    @inline
    def apply(
        Name: NameString,
        JsonPath: js.UndefOr[JsonPath] = js.undefined
    ): UpdateJsonClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      JsonPath.foreach(__v => __obj.updateDynamic("JsonPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJsonClassifierRequest]
    }
  }

  @js.native
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

  object UpdateMLTransformRequest {
    @inline
    def apply(
        TransformId: HashString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        GlueVersion: js.UndefOr[GlueVersionString] = js.undefined,
        MaxCapacity: js.UndefOr[NullableDouble] = js.undefined,
        MaxRetries: js.UndefOr[NullableInteger] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined,
        Parameters: js.UndefOr[TransformParameters] = js.undefined,
        Role: js.UndefOr[RoleString] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        WorkerType: js.UndefOr[WorkerType] = js.undefined
    ): UpdateMLTransformRequest = {
      val __obj = js.Dynamic.literal(
        "TransformId" -> TransformId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GlueVersion.foreach(__v => __obj.updateDynamic("GlueVersion")(__v.asInstanceOf[js.Any]))
      MaxCapacity.foreach(__v => __obj.updateDynamic("MaxCapacity")(__v.asInstanceOf[js.Any]))
      MaxRetries.foreach(__v => __obj.updateDynamic("MaxRetries")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberOfWorkers.foreach(__v => __obj.updateDynamic("NumberOfWorkers")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      WorkerType.foreach(__v => __obj.updateDynamic("WorkerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMLTransformRequest]
    }
  }

  @js.native
  trait UpdateMLTransformResponse extends js.Object {
    var TransformId: js.UndefOr[HashString]
  }

  object UpdateMLTransformResponse {
    @inline
    def apply(
        TransformId: js.UndefOr[HashString] = js.undefined
    ): UpdateMLTransformResponse = {
      val __obj = js.Dynamic.literal()
      TransformId.foreach(__v => __obj.updateDynamic("TransformId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMLTransformResponse]
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
    @inline
    def apply(
        DatabaseName: NameString,
        PartitionInput: PartitionInput,
        PartitionValueList: BoundedPartitionValueList,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdatePartitionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "PartitionInput" -> PartitionInput.asInstanceOf[js.Any],
        "PartitionValueList" -> PartitionValueList.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePartitionRequest]
    }
  }

  @js.native
  trait UpdatePartitionResponse extends js.Object

  object UpdatePartitionResponse {
    @inline
    def apply(): UpdatePartitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdatePartitionResponse]
    }
  }

  @js.native
  trait UpdateRegistryInput extends js.Object {
    var Description: DescriptionString
    var RegistryId: RegistryId
  }

  object UpdateRegistryInput {
    @inline
    def apply(
        Description: DescriptionString,
        RegistryId: RegistryId
    ): UpdateRegistryInput = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "RegistryId" -> RegistryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRegistryInput]
    }
  }

  @js.native
  trait UpdateRegistryResponse extends js.Object {
    var RegistryArn: js.UndefOr[GlueResourceArn]
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
  }

  object UpdateRegistryResponse {
    @inline
    def apply(
        RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined,
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
    ): UpdateRegistryResponse = {
      val __obj = js.Dynamic.literal()
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRegistryResponse]
    }
  }

  @js.native
  trait UpdateSchemaInput extends js.Object {
    var SchemaId: SchemaId
    var Compatibility: js.UndefOr[Compatibility]
    var Description: js.UndefOr[DescriptionString]
    var SchemaVersionNumber: js.UndefOr[SchemaVersionNumber]
  }

  object UpdateSchemaInput {
    @inline
    def apply(
        SchemaId: SchemaId,
        Compatibility: js.UndefOr[Compatibility] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        SchemaVersionNumber: js.UndefOr[SchemaVersionNumber] = js.undefined
    ): UpdateSchemaInput = {
      val __obj = js.Dynamic.literal(
        "SchemaId" -> SchemaId.asInstanceOf[js.Any]
      )

      Compatibility.foreach(__v => __obj.updateDynamic("Compatibility")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SchemaVersionNumber.foreach(__v => __obj.updateDynamic("SchemaVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSchemaInput]
    }
  }

  @js.native
  trait UpdateSchemaResponse extends js.Object {
    var RegistryName: js.UndefOr[SchemaRegistryNameString]
    var SchemaArn: js.UndefOr[GlueResourceArn]
    var SchemaName: js.UndefOr[SchemaRegistryNameString]
  }

  object UpdateSchemaResponse {
    @inline
    def apply(
        RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined,
        SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined,
        SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined
    ): UpdateSchemaResponse = {
      val __obj = js.Dynamic.literal()
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSchemaResponse]
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
    @inline
    def apply(
        DatabaseName: NameString,
        TableInput: TableInput,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        SkipArchive: js.UndefOr[BooleanNullable] = js.undefined
    ): UpdateTableRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableInput" -> TableInput.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      SkipArchive.foreach(__v => __obj.updateDynamic("SkipArchive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTableRequest]
    }
  }

  @js.native
  trait UpdateTableResponse extends js.Object

  object UpdateTableResponse {
    @inline
    def apply(): UpdateTableResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTableResponse]
    }
  }

  @js.native
  trait UpdateTriggerRequest extends js.Object {
    var Name: NameString
    var TriggerUpdate: TriggerUpdate
  }

  object UpdateTriggerRequest {
    @inline
    def apply(
        Name: NameString,
        TriggerUpdate: TriggerUpdate
    ): UpdateTriggerRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
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
    @inline
    def apply(
        Trigger: js.UndefOr[Trigger] = js.undefined
    ): UpdateTriggerResponse = {
      val __obj = js.Dynamic.literal()
      Trigger.foreach(__v => __obj.updateDynamic("Trigger")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DatabaseName: NameString,
        FunctionInput: UserDefinedFunctionInput,
        FunctionName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateUserDefinedFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "FunctionInput" -> FunctionInput.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserDefinedFunctionRequest]
    }
  }

  @js.native
  trait UpdateUserDefinedFunctionResponse extends js.Object

  object UpdateUserDefinedFunctionResponse {
    @inline
    def apply(): UpdateUserDefinedFunctionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUserDefinedFunctionResponse]
    }
  }

  @js.native
  trait UpdateWorkflowRequest extends js.Object {
    var Name: NameString
    var DefaultRunProperties: js.UndefOr[WorkflowRunProperties]
    var Description: js.UndefOr[GenericString]
    var MaxConcurrentRuns: js.UndefOr[NullableInteger]
  }

  object UpdateWorkflowRequest {
    @inline
    def apply(
        Name: NameString,
        DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined,
        Description: js.UndefOr[GenericString] = js.undefined,
        MaxConcurrentRuns: js.UndefOr[NullableInteger] = js.undefined
    ): UpdateWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DefaultRunProperties.foreach(__v => __obj.updateDynamic("DefaultRunProperties")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MaxConcurrentRuns.foreach(__v => __obj.updateDynamic("MaxConcurrentRuns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkflowRequest]
    }
  }

  @js.native
  trait UpdateWorkflowResponse extends js.Object {
    var Name: js.UndefOr[NameString]
  }

  object UpdateWorkflowResponse {
    @inline
    def apply(
        Name: js.UndefOr[NameString] = js.undefined
    ): UpdateWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkflowResponse]
    }
  }

  /** Specifies an XML classifier to be updated.
    */
  @js.native
  trait UpdateXMLClassifierRequest extends js.Object {
    var Name: NameString
    var Classification: js.UndefOr[Classification]
    var RowTag: js.UndefOr[RowTag]
  }

  object UpdateXMLClassifierRequest {
    @inline
    def apply(
        Name: NameString,
        Classification: js.UndefOr[Classification] = js.undefined,
        RowTag: js.UndefOr[RowTag] = js.undefined
    ): UpdateXMLClassifierRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Classification.foreach(__v => __obj.updateDynamic("Classification")(__v.asInstanceOf[js.Any]))
      RowTag.foreach(__v => __obj.updateDynamic("RowTag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateXMLClassifierRequest]
    }
  }

  /** Represents the equivalent of a Hive user-defined function (<code>UDF</code>) definition.
    */
  @js.native
  trait UserDefinedFunction extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var ClassName: js.UndefOr[NameString]
    var CreateTime: js.UndefOr[Timestamp]
    var DatabaseName: js.UndefOr[NameString]
    var FunctionName: js.UndefOr[NameString]
    var OwnerName: js.UndefOr[NameString]
    var OwnerType: js.UndefOr[PrincipalType]
    var ResourceUris: js.UndefOr[ResourceUriList]
  }

  object UserDefinedFunction {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        ClassName: js.UndefOr[NameString] = js.undefined,
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        DatabaseName: js.UndefOr[NameString] = js.undefined,
        FunctionName: js.UndefOr[NameString] = js.undefined,
        OwnerName: js.UndefOr[NameString] = js.undefined,
        OwnerType: js.UndefOr[PrincipalType] = js.undefined,
        ResourceUris: js.UndefOr[ResourceUriList] = js.undefined
    ): UserDefinedFunction = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      ClassName.foreach(__v => __obj.updateDynamic("ClassName")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.updateDynamic("FunctionName")(__v.asInstanceOf[js.Any]))
      OwnerName.foreach(__v => __obj.updateDynamic("OwnerName")(__v.asInstanceOf[js.Any]))
      OwnerType.foreach(__v => __obj.updateDynamic("OwnerType")(__v.asInstanceOf[js.Any]))
      ResourceUris.foreach(__v => __obj.updateDynamic("ResourceUris")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserDefinedFunction]
    }
  }

  /** A structure used to create or update a user-defined function.
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
    @inline
    def apply(
        ClassName: js.UndefOr[NameString] = js.undefined,
        FunctionName: js.UndefOr[NameString] = js.undefined,
        OwnerName: js.UndefOr[NameString] = js.undefined,
        OwnerType: js.UndefOr[PrincipalType] = js.undefined,
        ResourceUris: js.UndefOr[ResourceUriList] = js.undefined
    ): UserDefinedFunctionInput = {
      val __obj = js.Dynamic.literal()
      ClassName.foreach(__v => __obj.updateDynamic("ClassName")(__v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.updateDynamic("FunctionName")(__v.asInstanceOf[js.Any]))
      OwnerName.foreach(__v => __obj.updateDynamic("OwnerName")(__v.asInstanceOf[js.Any]))
      OwnerType.foreach(__v => __obj.updateDynamic("OwnerType")(__v.asInstanceOf[js.Any]))
      ResourceUris.foreach(__v => __obj.updateDynamic("ResourceUris")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserDefinedFunctionInput]
    }
  }

  @js.native
  sealed trait WorkerType extends js.Any
  object WorkerType {
    val Standard = "Standard".asInstanceOf[WorkerType]
    val `G.1X` = "G.1X".asInstanceOf[WorkerType]
    val `G.2X` = "G.2X".asInstanceOf[WorkerType]

    @inline def values = js.Array(Standard, `G.1X`, `G.2X`)
  }

  /** A workflow represents a flow in which AWS Glue components should be executed to complete a logical task.
    */
  @js.native
  trait Workflow extends js.Object {
    var CreatedOn: js.UndefOr[TimestampValue]
    var DefaultRunProperties: js.UndefOr[WorkflowRunProperties]
    var Description: js.UndefOr[GenericString]
    var Graph: js.UndefOr[WorkflowGraph]
    var LastModifiedOn: js.UndefOr[TimestampValue]
    var LastRun: js.UndefOr[WorkflowRun]
    var MaxConcurrentRuns: js.UndefOr[NullableInteger]
    var Name: js.UndefOr[NameString]
  }

  object Workflow {
    @inline
    def apply(
        CreatedOn: js.UndefOr[TimestampValue] = js.undefined,
        DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined,
        Description: js.UndefOr[GenericString] = js.undefined,
        Graph: js.UndefOr[WorkflowGraph] = js.undefined,
        LastModifiedOn: js.UndefOr[TimestampValue] = js.undefined,
        LastRun: js.UndefOr[WorkflowRun] = js.undefined,
        MaxConcurrentRuns: js.UndefOr[NullableInteger] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined
    ): Workflow = {
      val __obj = js.Dynamic.literal()
      CreatedOn.foreach(__v => __obj.updateDynamic("CreatedOn")(__v.asInstanceOf[js.Any]))
      DefaultRunProperties.foreach(__v => __obj.updateDynamic("DefaultRunProperties")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Graph.foreach(__v => __obj.updateDynamic("Graph")(__v.asInstanceOf[js.Any]))
      LastModifiedOn.foreach(__v => __obj.updateDynamic("LastModifiedOn")(__v.asInstanceOf[js.Any]))
      LastRun.foreach(__v => __obj.updateDynamic("LastRun")(__v.asInstanceOf[js.Any]))
      MaxConcurrentRuns.foreach(__v => __obj.updateDynamic("MaxConcurrentRuns")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workflow]
    }
  }

  /** A workflow graph represents the complete workflow containing all the AWS Glue components present in the workflow and all the directed connections between them.
    */
  @js.native
  trait WorkflowGraph extends js.Object {
    var Edges: js.UndefOr[EdgeList]
    var Nodes: js.UndefOr[NodeList]
  }

  object WorkflowGraph {
    @inline
    def apply(
        Edges: js.UndefOr[EdgeList] = js.undefined,
        Nodes: js.UndefOr[NodeList] = js.undefined
    ): WorkflowGraph = {
      val __obj = js.Dynamic.literal()
      Edges.foreach(__v => __obj.updateDynamic("Edges")(__v.asInstanceOf[js.Any]))
      Nodes.foreach(__v => __obj.updateDynamic("Nodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowGraph]
    }
  }

  /** A workflow run is an execution of a workflow providing all the runtime information.
    */
  @js.native
  trait WorkflowRun extends js.Object {
    var CompletedOn: js.UndefOr[TimestampValue]
    var ErrorMessage: js.UndefOr[ErrorString]
    var Graph: js.UndefOr[WorkflowGraph]
    var Name: js.UndefOr[NameString]
    var PreviousRunId: js.UndefOr[IdString]
    var StartedOn: js.UndefOr[TimestampValue]
    var Statistics: js.UndefOr[WorkflowRunStatistics]
    var Status: js.UndefOr[WorkflowRunStatus]
    var WorkflowRunId: js.UndefOr[IdString]
    var WorkflowRunProperties: js.UndefOr[WorkflowRunProperties]
  }

  object WorkflowRun {
    @inline
    def apply(
        CompletedOn: js.UndefOr[TimestampValue] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorString] = js.undefined,
        Graph: js.UndefOr[WorkflowGraph] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        PreviousRunId: js.UndefOr[IdString] = js.undefined,
        StartedOn: js.UndefOr[TimestampValue] = js.undefined,
        Statistics: js.UndefOr[WorkflowRunStatistics] = js.undefined,
        Status: js.UndefOr[WorkflowRunStatus] = js.undefined,
        WorkflowRunId: js.UndefOr[IdString] = js.undefined,
        WorkflowRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
    ): WorkflowRun = {
      val __obj = js.Dynamic.literal()
      CompletedOn.foreach(__v => __obj.updateDynamic("CompletedOn")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Graph.foreach(__v => __obj.updateDynamic("Graph")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PreviousRunId.foreach(__v => __obj.updateDynamic("PreviousRunId")(__v.asInstanceOf[js.Any]))
      StartedOn.foreach(__v => __obj.updateDynamic("StartedOn")(__v.asInstanceOf[js.Any]))
      Statistics.foreach(__v => __obj.updateDynamic("Statistics")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WorkflowRunId.foreach(__v => __obj.updateDynamic("WorkflowRunId")(__v.asInstanceOf[js.Any]))
      WorkflowRunProperties.foreach(__v => __obj.updateDynamic("WorkflowRunProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowRun]
    }
  }

  /** Workflow run statistics provides statistics about the workflow run.
    */
  @js.native
  trait WorkflowRunStatistics extends js.Object {
    var FailedActions: js.UndefOr[IntegerValue]
    var RunningActions: js.UndefOr[IntegerValue]
    var StoppedActions: js.UndefOr[IntegerValue]
    var SucceededActions: js.UndefOr[IntegerValue]
    var TimeoutActions: js.UndefOr[IntegerValue]
    var TotalActions: js.UndefOr[IntegerValue]
  }

  object WorkflowRunStatistics {
    @inline
    def apply(
        FailedActions: js.UndefOr[IntegerValue] = js.undefined,
        RunningActions: js.UndefOr[IntegerValue] = js.undefined,
        StoppedActions: js.UndefOr[IntegerValue] = js.undefined,
        SucceededActions: js.UndefOr[IntegerValue] = js.undefined,
        TimeoutActions: js.UndefOr[IntegerValue] = js.undefined,
        TotalActions: js.UndefOr[IntegerValue] = js.undefined
    ): WorkflowRunStatistics = {
      val __obj = js.Dynamic.literal()
      FailedActions.foreach(__v => __obj.updateDynamic("FailedActions")(__v.asInstanceOf[js.Any]))
      RunningActions.foreach(__v => __obj.updateDynamic("RunningActions")(__v.asInstanceOf[js.Any]))
      StoppedActions.foreach(__v => __obj.updateDynamic("StoppedActions")(__v.asInstanceOf[js.Any]))
      SucceededActions.foreach(__v => __obj.updateDynamic("SucceededActions")(__v.asInstanceOf[js.Any]))
      TimeoutActions.foreach(__v => __obj.updateDynamic("TimeoutActions")(__v.asInstanceOf[js.Any]))
      TotalActions.foreach(__v => __obj.updateDynamic("TotalActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowRunStatistics]
    }
  }

  @js.native
  sealed trait WorkflowRunStatus extends js.Any
  object WorkflowRunStatus {
    val RUNNING = "RUNNING".asInstanceOf[WorkflowRunStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[WorkflowRunStatus]
    val STOPPING = "STOPPING".asInstanceOf[WorkflowRunStatus]
    val STOPPED = "STOPPED".asInstanceOf[WorkflowRunStatus]
    val ERROR = "ERROR".asInstanceOf[WorkflowRunStatus]

    @inline def values = js.Array(RUNNING, COMPLETED, STOPPING, STOPPED, ERROR)
  }

  /** A classifier for <code>XML</code> content.
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
    @inline
    def apply(
        Classification: Classification,
        Name: NameString,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        RowTag: js.UndefOr[RowTag] = js.undefined,
        Version: js.UndefOr[VersionId] = js.undefined
    ): XMLClassifier = {
      val __obj = js.Dynamic.literal(
        "Classification" -> Classification.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      RowTag.foreach(__v => __obj.updateDynamic("RowTag")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[XMLClassifier]
    }
  }
}
