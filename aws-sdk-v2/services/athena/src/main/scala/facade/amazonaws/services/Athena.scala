package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object athena {
  type Age = Int
  type AmazonResourceName = String
  type ApplicationDPUSizesList = js.Array[ApplicationDPUSizes]
  type AuthToken = String
  type AwsAccountId = String
  type BoxedBoolean = Boolean
  type BytesScannedCutoffValue = Double
  type CalculationExecutionId = String
  type CalculationResultType = String
  type CalculationsList = js.Array[CalculationSummary]
  type CatalogNameString = String
  type ClientRequestToken = String
  type CodeBlock = String
  type ColumnInfoList = js.Array[ColumnInfo]
  type ColumnList = js.Array[Column]
  type CommentString = String
  type CoordinatorDpuSize = Int
  type DataCatalogSummaryList = js.Array[DataCatalogSummary]
  type DatabaseList = js.Array[Database]
  type DatabaseString = String
  type Date = js.Date
  type DefaultExecutorDpuSize = Int
  type DescriptionString = String
  type EngineVersionsList = js.Array[EngineVersion]
  type ErrorCategory = Int
  type ErrorCode = String
  type ErrorMessage = String
  type ErrorType = Int
  type ExecutionParameter = String
  type ExecutionParameters = js.Array[ExecutionParameter]
  type ExecutorId = String
  type ExecutorsSummaryList = js.Array[ExecutorsSummary]
  type ExpressionString = String
  type IdempotencyToken = String
  type KeyString = String
  type KmsKey = String
  type MaxApplicationDPUSizesCount = Int
  type MaxCalculationsCount = Int
  type MaxConcurrentDpus = Int
  type MaxDataCatalogsCount = Int
  type MaxDatabasesCount = Int
  type MaxEngineVersionsCount = Int
  type MaxListExecutorsCount = Int
  type MaxNamedQueriesCount = Int
  type MaxNotebooksCount = Int
  type MaxPreparedStatementsCount = Int
  type MaxQueryExecutionsCount = Int
  type MaxQueryResults = Int
  type MaxSessionsCount = Int
  type MaxTableMetadataCount = Int
  type MaxTagsCount = Int
  type MaxWorkGroupsCount = Int
  type NameString = String
  type NamedQueryDescriptionString = String
  type NamedQueryId = String
  type NamedQueryIdList = js.Array[NamedQueryId]
  type NamedQueryList = js.Array[NamedQuery]
  type NotebookId = String
  type NotebookMetadataArray = js.Array[NotebookMetadata]
  type NotebookName = String
  type NotebookSessionsList = js.Array[NotebookSessionSummary]
  type ParametersMap = js.Dictionary[ParametersMapValue]
  type ParametersMapValue = String
  type Payload = String
  type PreparedStatementDetailsList = js.Array[PreparedStatement]
  type PreparedStatementNameList = js.Array[StatementName]
  type PreparedStatementsList = js.Array[PreparedStatementSummary]
  type QueryExecutionId = String
  type QueryExecutionIdList = js.Array[QueryExecutionId]
  type QueryExecutionList = js.Array[QueryExecution]
  type QueryStagePlanNodes = js.Array[QueryStagePlanNode]
  type QueryStages = js.Array[QueryStage]
  type QueryString = String
  type ResultOutputLocation = String
  type RoleArn = String
  type RowList = js.Array[Row]
  type S3Uri = String
  type SessionId = String
  type SessionIdleTimeoutInMinutes = Int
  type SessionManagerToken = String
  type SessionsList = js.Array[SessionSummary]
  type StatementName = String
  type StringList = js.Array[String]
  type SupportedDPUSizeList = js.Array[Int]
  type TableMetadataList = js.Array[TableMetadata]
  type TableTypeString = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type Token = String
  type TypeString = String
  type UnprocessedNamedQueryIdList = js.Array[UnprocessedNamedQueryId]
  type UnprocessedPreparedStatementNameList = js.Array[UnprocessedPreparedStatementName]
  type UnprocessedQueryExecutionIdList = js.Array[UnprocessedQueryExecutionId]
  type WorkGroupDescriptionString = String
  type WorkGroupName = String
  type WorkGroupsList = js.Array[WorkGroupSummary]
  type datumList = js.Array[Datum]
  type datumString = String

  final class AthenaOps(private val service: Athena) extends AnyVal {

    @inline def batchGetNamedQueryFuture(params: BatchGetNamedQueryInput): Future[BatchGetNamedQueryOutput] = service.batchGetNamedQuery(params).promise().toFuture
    @inline def batchGetPreparedStatementFuture(params: BatchGetPreparedStatementInput): Future[BatchGetPreparedStatementOutput] = service.batchGetPreparedStatement(params).promise().toFuture
    @inline def batchGetQueryExecutionFuture(params: BatchGetQueryExecutionInput): Future[BatchGetQueryExecutionOutput] = service.batchGetQueryExecution(params).promise().toFuture
    @inline def createDataCatalogFuture(params: CreateDataCatalogInput): Future[CreateDataCatalogOutput] = service.createDataCatalog(params).promise().toFuture
    @inline def createNamedQueryFuture(params: CreateNamedQueryInput): Future[CreateNamedQueryOutput] = service.createNamedQuery(params).promise().toFuture
    @inline def createNotebookFuture(params: CreateNotebookInput): Future[CreateNotebookOutput] = service.createNotebook(params).promise().toFuture
    @inline def createPreparedStatementFuture(params: CreatePreparedStatementInput): Future[CreatePreparedStatementOutput] = service.createPreparedStatement(params).promise().toFuture
    @inline def createPresignedNotebookUrlFuture(params: CreatePresignedNotebookUrlRequest): Future[CreatePresignedNotebookUrlResponse] = service.createPresignedNotebookUrl(params).promise().toFuture
    @inline def createWorkGroupFuture(params: CreateWorkGroupInput): Future[CreateWorkGroupOutput] = service.createWorkGroup(params).promise().toFuture
    @inline def deleteDataCatalogFuture(params: DeleteDataCatalogInput): Future[DeleteDataCatalogOutput] = service.deleteDataCatalog(params).promise().toFuture
    @inline def deleteNamedQueryFuture(params: DeleteNamedQueryInput): Future[DeleteNamedQueryOutput] = service.deleteNamedQuery(params).promise().toFuture
    @inline def deleteNotebookFuture(params: DeleteNotebookInput): Future[DeleteNotebookOutput] = service.deleteNotebook(params).promise().toFuture
    @inline def deletePreparedStatementFuture(params: DeletePreparedStatementInput): Future[DeletePreparedStatementOutput] = service.deletePreparedStatement(params).promise().toFuture
    @inline def deleteWorkGroupFuture(params: DeleteWorkGroupInput): Future[DeleteWorkGroupOutput] = service.deleteWorkGroup(params).promise().toFuture
    @inline def exportNotebookFuture(params: ExportNotebookInput): Future[ExportNotebookOutput] = service.exportNotebook(params).promise().toFuture
    @inline def getCalculationExecutionCodeFuture(params: GetCalculationExecutionCodeRequest): Future[GetCalculationExecutionCodeResponse] = service.getCalculationExecutionCode(params).promise().toFuture
    @inline def getCalculationExecutionFuture(params: GetCalculationExecutionRequest): Future[GetCalculationExecutionResponse] = service.getCalculationExecution(params).promise().toFuture
    @inline def getCalculationExecutionStatusFuture(params: GetCalculationExecutionStatusRequest): Future[GetCalculationExecutionStatusResponse] = service.getCalculationExecutionStatus(params).promise().toFuture
    @inline def getDataCatalogFuture(params: GetDataCatalogInput): Future[GetDataCatalogOutput] = service.getDataCatalog(params).promise().toFuture
    @inline def getDatabaseFuture(params: GetDatabaseInput): Future[GetDatabaseOutput] = service.getDatabase(params).promise().toFuture
    @inline def getNamedQueryFuture(params: GetNamedQueryInput): Future[GetNamedQueryOutput] = service.getNamedQuery(params).promise().toFuture
    @inline def getNotebookMetadataFuture(params: GetNotebookMetadataInput): Future[GetNotebookMetadataOutput] = service.getNotebookMetadata(params).promise().toFuture
    @inline def getPreparedStatementFuture(params: GetPreparedStatementInput): Future[GetPreparedStatementOutput] = service.getPreparedStatement(params).promise().toFuture
    @inline def getQueryExecutionFuture(params: GetQueryExecutionInput): Future[GetQueryExecutionOutput] = service.getQueryExecution(params).promise().toFuture
    @inline def getQueryResultsFuture(params: GetQueryResultsInput): Future[GetQueryResultsOutput] = service.getQueryResults(params).promise().toFuture
    @inline def getQueryRuntimeStatisticsFuture(params: GetQueryRuntimeStatisticsInput): Future[GetQueryRuntimeStatisticsOutput] = service.getQueryRuntimeStatistics(params).promise().toFuture
    @inline def getSessionFuture(params: GetSessionRequest): Future[GetSessionResponse] = service.getSession(params).promise().toFuture
    @inline def getSessionStatusFuture(params: GetSessionStatusRequest): Future[GetSessionStatusResponse] = service.getSessionStatus(params).promise().toFuture
    @inline def getTableMetadataFuture(params: GetTableMetadataInput): Future[GetTableMetadataOutput] = service.getTableMetadata(params).promise().toFuture
    @inline def getWorkGroupFuture(params: GetWorkGroupInput): Future[GetWorkGroupOutput] = service.getWorkGroup(params).promise().toFuture
    @inline def importNotebookFuture(params: ImportNotebookInput): Future[ImportNotebookOutput] = service.importNotebook(params).promise().toFuture
    @inline def listApplicationDPUSizesFuture(params: ListApplicationDPUSizesInput): Future[ListApplicationDPUSizesOutput] = service.listApplicationDPUSizes(params).promise().toFuture
    @inline def listCalculationExecutionsFuture(params: ListCalculationExecutionsRequest): Future[ListCalculationExecutionsResponse] = service.listCalculationExecutions(params).promise().toFuture
    @inline def listDataCatalogsFuture(params: ListDataCatalogsInput): Future[ListDataCatalogsOutput] = service.listDataCatalogs(params).promise().toFuture
    @inline def listDatabasesFuture(params: ListDatabasesInput): Future[ListDatabasesOutput] = service.listDatabases(params).promise().toFuture
    @inline def listEngineVersionsFuture(params: ListEngineVersionsInput): Future[ListEngineVersionsOutput] = service.listEngineVersions(params).promise().toFuture
    @inline def listExecutorsFuture(params: ListExecutorsRequest): Future[ListExecutorsResponse] = service.listExecutors(params).promise().toFuture
    @inline def listNamedQueriesFuture(params: ListNamedQueriesInput): Future[ListNamedQueriesOutput] = service.listNamedQueries(params).promise().toFuture
    @inline def listNotebookMetadataFuture(params: ListNotebookMetadataInput): Future[ListNotebookMetadataOutput] = service.listNotebookMetadata(params).promise().toFuture
    @inline def listNotebookSessionsFuture(params: ListNotebookSessionsRequest): Future[ListNotebookSessionsResponse] = service.listNotebookSessions(params).promise().toFuture
    @inline def listPreparedStatementsFuture(params: ListPreparedStatementsInput): Future[ListPreparedStatementsOutput] = service.listPreparedStatements(params).promise().toFuture
    @inline def listQueryExecutionsFuture(params: ListQueryExecutionsInput): Future[ListQueryExecutionsOutput] = service.listQueryExecutions(params).promise().toFuture
    @inline def listSessionsFuture(params: ListSessionsRequest): Future[ListSessionsResponse] = service.listSessions(params).promise().toFuture
    @inline def listTableMetadataFuture(params: ListTableMetadataInput): Future[ListTableMetadataOutput] = service.listTableMetadata(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def listWorkGroupsFuture(params: ListWorkGroupsInput): Future[ListWorkGroupsOutput] = service.listWorkGroups(params).promise().toFuture
    @inline def startCalculationExecutionFuture(params: StartCalculationExecutionRequest): Future[StartCalculationExecutionResponse] = service.startCalculationExecution(params).promise().toFuture
    @inline def startQueryExecutionFuture(params: StartQueryExecutionInput): Future[StartQueryExecutionOutput] = service.startQueryExecution(params).promise().toFuture
    @inline def startSessionFuture(params: StartSessionRequest): Future[StartSessionResponse] = service.startSession(params).promise().toFuture
    @inline def stopCalculationExecutionFuture(params: StopCalculationExecutionRequest): Future[StopCalculationExecutionResponse] = service.stopCalculationExecution(params).promise().toFuture
    @inline def stopQueryExecutionFuture(params: StopQueryExecutionInput): Future[StopQueryExecutionOutput] = service.stopQueryExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def terminateSessionFuture(params: TerminateSessionRequest): Future[TerminateSessionResponse] = service.terminateSession(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateDataCatalogFuture(params: UpdateDataCatalogInput): Future[UpdateDataCatalogOutput] = service.updateDataCatalog(params).promise().toFuture
    @inline def updateNamedQueryFuture(params: UpdateNamedQueryInput): Future[UpdateNamedQueryOutput] = service.updateNamedQuery(params).promise().toFuture
    @inline def updateNotebookFuture(params: UpdateNotebookInput): Future[UpdateNotebookOutput] = service.updateNotebook(params).promise().toFuture
    @inline def updateNotebookMetadataFuture(params: UpdateNotebookMetadataInput): Future[UpdateNotebookMetadataOutput] = service.updateNotebookMetadata(params).promise().toFuture
    @inline def updatePreparedStatementFuture(params: UpdatePreparedStatementInput): Future[UpdatePreparedStatementOutput] = service.updatePreparedStatement(params).promise().toFuture
    @inline def updateWorkGroupFuture(params: UpdateWorkGroupInput): Future[UpdateWorkGroupOutput] = service.updateWorkGroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/athena", JSImport.Namespace, "AWS.Athena")
  class Athena() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetNamedQuery(params: BatchGetNamedQueryInput): Request[BatchGetNamedQueryOutput] = js.native
    def batchGetPreparedStatement(params: BatchGetPreparedStatementInput): Request[BatchGetPreparedStatementOutput] = js.native
    def batchGetQueryExecution(params: BatchGetQueryExecutionInput): Request[BatchGetQueryExecutionOutput] = js.native
    def createDataCatalog(params: CreateDataCatalogInput): Request[CreateDataCatalogOutput] = js.native
    def createNamedQuery(params: CreateNamedQueryInput): Request[CreateNamedQueryOutput] = js.native
    def createNotebook(params: CreateNotebookInput): Request[CreateNotebookOutput] = js.native
    def createPreparedStatement(params: CreatePreparedStatementInput): Request[CreatePreparedStatementOutput] = js.native
    def createPresignedNotebookUrl(params: CreatePresignedNotebookUrlRequest): Request[CreatePresignedNotebookUrlResponse] = js.native
    def createWorkGroup(params: CreateWorkGroupInput): Request[CreateWorkGroupOutput] = js.native
    def deleteDataCatalog(params: DeleteDataCatalogInput): Request[DeleteDataCatalogOutput] = js.native
    def deleteNamedQuery(params: DeleteNamedQueryInput): Request[DeleteNamedQueryOutput] = js.native
    def deleteNotebook(params: DeleteNotebookInput): Request[DeleteNotebookOutput] = js.native
    def deletePreparedStatement(params: DeletePreparedStatementInput): Request[DeletePreparedStatementOutput] = js.native
    def deleteWorkGroup(params: DeleteWorkGroupInput): Request[DeleteWorkGroupOutput] = js.native
    def exportNotebook(params: ExportNotebookInput): Request[ExportNotebookOutput] = js.native
    def getCalculationExecution(params: GetCalculationExecutionRequest): Request[GetCalculationExecutionResponse] = js.native
    def getCalculationExecutionCode(params: GetCalculationExecutionCodeRequest): Request[GetCalculationExecutionCodeResponse] = js.native
    def getCalculationExecutionStatus(params: GetCalculationExecutionStatusRequest): Request[GetCalculationExecutionStatusResponse] = js.native
    def getDataCatalog(params: GetDataCatalogInput): Request[GetDataCatalogOutput] = js.native
    def getDatabase(params: GetDatabaseInput): Request[GetDatabaseOutput] = js.native
    def getNamedQuery(params: GetNamedQueryInput): Request[GetNamedQueryOutput] = js.native
    def getNotebookMetadata(params: GetNotebookMetadataInput): Request[GetNotebookMetadataOutput] = js.native
    def getPreparedStatement(params: GetPreparedStatementInput): Request[GetPreparedStatementOutput] = js.native
    def getQueryExecution(params: GetQueryExecutionInput): Request[GetQueryExecutionOutput] = js.native
    def getQueryResults(params: GetQueryResultsInput): Request[GetQueryResultsOutput] = js.native
    def getQueryRuntimeStatistics(params: GetQueryRuntimeStatisticsInput): Request[GetQueryRuntimeStatisticsOutput] = js.native
    def getSession(params: GetSessionRequest): Request[GetSessionResponse] = js.native
    def getSessionStatus(params: GetSessionStatusRequest): Request[GetSessionStatusResponse] = js.native
    def getTableMetadata(params: GetTableMetadataInput): Request[GetTableMetadataOutput] = js.native
    def getWorkGroup(params: GetWorkGroupInput): Request[GetWorkGroupOutput] = js.native
    def importNotebook(params: ImportNotebookInput): Request[ImportNotebookOutput] = js.native
    def listApplicationDPUSizes(params: ListApplicationDPUSizesInput): Request[ListApplicationDPUSizesOutput] = js.native
    def listCalculationExecutions(params: ListCalculationExecutionsRequest): Request[ListCalculationExecutionsResponse] = js.native
    def listDataCatalogs(params: ListDataCatalogsInput): Request[ListDataCatalogsOutput] = js.native
    def listDatabases(params: ListDatabasesInput): Request[ListDatabasesOutput] = js.native
    def listEngineVersions(params: ListEngineVersionsInput): Request[ListEngineVersionsOutput] = js.native
    def listExecutors(params: ListExecutorsRequest): Request[ListExecutorsResponse] = js.native
    def listNamedQueries(params: ListNamedQueriesInput): Request[ListNamedQueriesOutput] = js.native
    def listNotebookMetadata(params: ListNotebookMetadataInput): Request[ListNotebookMetadataOutput] = js.native
    def listNotebookSessions(params: ListNotebookSessionsRequest): Request[ListNotebookSessionsResponse] = js.native
    def listPreparedStatements(params: ListPreparedStatementsInput): Request[ListPreparedStatementsOutput] = js.native
    def listQueryExecutions(params: ListQueryExecutionsInput): Request[ListQueryExecutionsOutput] = js.native
    def listSessions(params: ListSessionsRequest): Request[ListSessionsResponse] = js.native
    def listTableMetadata(params: ListTableMetadataInput): Request[ListTableMetadataOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listWorkGroups(params: ListWorkGroupsInput): Request[ListWorkGroupsOutput] = js.native
    def startCalculationExecution(params: StartCalculationExecutionRequest): Request[StartCalculationExecutionResponse] = js.native
    def startQueryExecution(params: StartQueryExecutionInput): Request[StartQueryExecutionOutput] = js.native
    def startSession(params: StartSessionRequest): Request[StartSessionResponse] = js.native
    def stopCalculationExecution(params: StopCalculationExecutionRequest): Request[StopCalculationExecutionResponse] = js.native
    def stopQueryExecution(params: StopQueryExecutionInput): Request[StopQueryExecutionOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def terminateSession(params: TerminateSessionRequest): Request[TerminateSessionResponse] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateDataCatalog(params: UpdateDataCatalogInput): Request[UpdateDataCatalogOutput] = js.native
    def updateNamedQuery(params: UpdateNamedQueryInput): Request[UpdateNamedQueryOutput] = js.native
    def updateNotebook(params: UpdateNotebookInput): Request[UpdateNotebookOutput] = js.native
    def updateNotebookMetadata(params: UpdateNotebookMetadataInput): Request[UpdateNotebookMetadataOutput] = js.native
    def updatePreparedStatement(params: UpdatePreparedStatementInput): Request[UpdatePreparedStatementOutput] = js.native
    def updateWorkGroup(params: UpdateWorkGroupInput): Request[UpdateWorkGroupOutput] = js.native
  }
  object Athena {
    @inline implicit def toOps(service: Athena): AthenaOps = {
      new AthenaOps(service)
    }
  }

  /** Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. When Athena stores query results in Amazon S3, the canned ACL is set with the <code>x-amz-acl</code> request header. For more information about S3 Object Ownership, see [[https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html#object-ownership-overview|Object Ownership settings]] in the <i>Amazon S3 User Guide</i>.
    */
  @js.native
  trait AclConfiguration extends js.Object {
    var S3AclOption: S3AclOption
  }

  object AclConfiguration {
    @inline
    def apply(
        S3AclOption: S3AclOption
    ): AclConfiguration = {
      val __obj = js.Dynamic.literal(
        "S3AclOption" -> S3AclOption.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AclConfiguration]
    }
  }

  /** Contains the application runtime IDs and their supported DPU sizes.
    */
  @js.native
  trait ApplicationDPUSizes extends js.Object {
    var ApplicationRuntimeId: js.UndefOr[NameString]
    var SupportedDPUSizes: js.UndefOr[SupportedDPUSizeList]
  }

  object ApplicationDPUSizes {
    @inline
    def apply(
        ApplicationRuntimeId: js.UndefOr[NameString] = js.undefined,
        SupportedDPUSizes: js.UndefOr[SupportedDPUSizeList] = js.undefined
    ): ApplicationDPUSizes = {
      val __obj = js.Dynamic.literal()
      ApplicationRuntimeId.foreach(__v => __obj.updateDynamic("ApplicationRuntimeId")(__v.asInstanceOf[js.Any]))
      SupportedDPUSizes.foreach(__v => __obj.updateDynamic("SupportedDPUSizes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationDPUSizes]
    }
  }

  /** Provides information about an Athena query error. The <code>AthenaError</code> feature provides standardized error information to help you understand failed queries and take steps after a query failure occurs. <code>AthenaError</code> includes an <code>ErrorCategory</code> field that specifies whether the cause of the failed query is due to system error, user error, or other error.
    */
  @js.native
  trait AthenaError extends js.Object {
    var ErrorCategory: js.UndefOr[ErrorCategory]
    var ErrorMessage: js.UndefOr[String]
    var ErrorType: js.UndefOr[ErrorType]
    var Retryable: js.UndefOr[Boolean]
  }

  object AthenaError {
    @inline
    def apply(
        ErrorCategory: js.UndefOr[ErrorCategory] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        ErrorType: js.UndefOr[ErrorType] = js.undefined,
        Retryable: js.UndefOr[Boolean] = js.undefined
    ): AthenaError = {
      val __obj = js.Dynamic.literal()
      ErrorCategory.foreach(__v => __obj.updateDynamic("ErrorCategory")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ErrorType.foreach(__v => __obj.updateDynamic("ErrorType")(__v.asInstanceOf[js.Any]))
      Retryable.foreach(__v => __obj.updateDynamic("Retryable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AthenaError]
    }
  }

  /** Contains an array of named query IDs.
    */
  @js.native
  trait BatchGetNamedQueryInput extends js.Object {
    var NamedQueryIds: NamedQueryIdList
  }

  object BatchGetNamedQueryInput {
    @inline
    def apply(
        NamedQueryIds: NamedQueryIdList
    ): BatchGetNamedQueryInput = {
      val __obj = js.Dynamic.literal(
        "NamedQueryIds" -> NamedQueryIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetNamedQueryInput]
    }
  }

  @js.native
  trait BatchGetNamedQueryOutput extends js.Object {
    var NamedQueries: js.UndefOr[NamedQueryList]
    var UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList]
  }

  object BatchGetNamedQueryOutput {
    @inline
    def apply(
        NamedQueries: js.UndefOr[NamedQueryList] = js.undefined,
        UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.undefined
    ): BatchGetNamedQueryOutput = {
      val __obj = js.Dynamic.literal()
      NamedQueries.foreach(__v => __obj.updateDynamic("NamedQueries")(__v.asInstanceOf[js.Any]))
      UnprocessedNamedQueryIds.foreach(__v => __obj.updateDynamic("UnprocessedNamedQueryIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetNamedQueryOutput]
    }
  }

  @js.native
  trait BatchGetPreparedStatementInput extends js.Object {
    var PreparedStatementNames: PreparedStatementNameList
    var WorkGroup: WorkGroupName
  }

  object BatchGetPreparedStatementInput {
    @inline
    def apply(
        PreparedStatementNames: PreparedStatementNameList,
        WorkGroup: WorkGroupName
    ): BatchGetPreparedStatementInput = {
      val __obj = js.Dynamic.literal(
        "PreparedStatementNames" -> PreparedStatementNames.asInstanceOf[js.Any],
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetPreparedStatementInput]
    }
  }

  @js.native
  trait BatchGetPreparedStatementOutput extends js.Object {
    var PreparedStatements: js.UndefOr[PreparedStatementDetailsList]
    var UnprocessedPreparedStatementNames: js.UndefOr[UnprocessedPreparedStatementNameList]
  }

  object BatchGetPreparedStatementOutput {
    @inline
    def apply(
        PreparedStatements: js.UndefOr[PreparedStatementDetailsList] = js.undefined,
        UnprocessedPreparedStatementNames: js.UndefOr[UnprocessedPreparedStatementNameList] = js.undefined
    ): BatchGetPreparedStatementOutput = {
      val __obj = js.Dynamic.literal()
      PreparedStatements.foreach(__v => __obj.updateDynamic("PreparedStatements")(__v.asInstanceOf[js.Any]))
      UnprocessedPreparedStatementNames.foreach(__v => __obj.updateDynamic("UnprocessedPreparedStatementNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetPreparedStatementOutput]
    }
  }

  /** Contains an array of query execution IDs.
    */
  @js.native
  trait BatchGetQueryExecutionInput extends js.Object {
    var QueryExecutionIds: QueryExecutionIdList
  }

  object BatchGetQueryExecutionInput {
    @inline
    def apply(
        QueryExecutionIds: QueryExecutionIdList
    ): BatchGetQueryExecutionInput = {
      val __obj = js.Dynamic.literal(
        "QueryExecutionIds" -> QueryExecutionIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetQueryExecutionInput]
    }
  }

  @js.native
  trait BatchGetQueryExecutionOutput extends js.Object {
    var QueryExecutions: js.UndefOr[QueryExecutionList]
    var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList]
  }

  object BatchGetQueryExecutionOutput {
    @inline
    def apply(
        QueryExecutions: js.UndefOr[QueryExecutionList] = js.undefined,
        UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.undefined
    ): BatchGetQueryExecutionOutput = {
      val __obj = js.Dynamic.literal()
      QueryExecutions.foreach(__v => __obj.updateDynamic("QueryExecutions")(__v.asInstanceOf[js.Any]))
      UnprocessedQueryExecutionIds.foreach(__v => __obj.updateDynamic("UnprocessedQueryExecutionIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetQueryExecutionOutput]
    }
  }

  /** Contains configuration information for the calculation.
    */
  @js.native
  trait CalculationConfiguration extends js.Object {
    var CodeBlock: js.UndefOr[CodeBlock]
  }

  object CalculationConfiguration {
    @inline
    def apply(
        CodeBlock: js.UndefOr[CodeBlock] = js.undefined
    ): CalculationConfiguration = {
      val __obj = js.Dynamic.literal()
      CodeBlock.foreach(__v => __obj.updateDynamic("CodeBlock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculationConfiguration]
    }
  }

  /** Contains information about an application-specific calculation result.
    */
  @js.native
  trait CalculationResult extends js.Object {
    var ResultS3Uri: js.UndefOr[S3Uri]
    var ResultType: js.UndefOr[CalculationResultType]
    var StdErrorS3Uri: js.UndefOr[S3Uri]
    var StdOutS3Uri: js.UndefOr[S3Uri]
  }

  object CalculationResult {
    @inline
    def apply(
        ResultS3Uri: js.UndefOr[S3Uri] = js.undefined,
        ResultType: js.UndefOr[CalculationResultType] = js.undefined,
        StdErrorS3Uri: js.UndefOr[S3Uri] = js.undefined,
        StdOutS3Uri: js.UndefOr[S3Uri] = js.undefined
    ): CalculationResult = {
      val __obj = js.Dynamic.literal()
      ResultS3Uri.foreach(__v => __obj.updateDynamic("ResultS3Uri")(__v.asInstanceOf[js.Any]))
      ResultType.foreach(__v => __obj.updateDynamic("ResultType")(__v.asInstanceOf[js.Any]))
      StdErrorS3Uri.foreach(__v => __obj.updateDynamic("StdErrorS3Uri")(__v.asInstanceOf[js.Any]))
      StdOutS3Uri.foreach(__v => __obj.updateDynamic("StdOutS3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculationResult]
    }
  }

  /** Contains statistics for a notebook calculation.
    */
  @js.native
  trait CalculationStatistics extends js.Object {
    var DpuExecutionInMillis: js.UndefOr[Double]
    var Progress: js.UndefOr[DescriptionString]
  }

  object CalculationStatistics {
    @inline
    def apply(
        DpuExecutionInMillis: js.UndefOr[Double] = js.undefined,
        Progress: js.UndefOr[DescriptionString] = js.undefined
    ): CalculationStatistics = {
      val __obj = js.Dynamic.literal()
      DpuExecutionInMillis.foreach(__v => __obj.updateDynamic("DpuExecutionInMillis")(__v.asInstanceOf[js.Any]))
      Progress.foreach(__v => __obj.updateDynamic("Progress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculationStatistics]
    }
  }

  /** Contains information about the status of a notebook calculation.
    */
  @js.native
  trait CalculationStatus extends js.Object {
    var CompletionDateTime: js.UndefOr[Date]
    var State: js.UndefOr[CalculationExecutionState]
    var StateChangeReason: js.UndefOr[DescriptionString]
    var SubmissionDateTime: js.UndefOr[Date]
  }

  object CalculationStatus {
    @inline
    def apply(
        CompletionDateTime: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[CalculationExecutionState] = js.undefined,
        StateChangeReason: js.UndefOr[DescriptionString] = js.undefined,
        SubmissionDateTime: js.UndefOr[Date] = js.undefined
    ): CalculationStatus = {
      val __obj = js.Dynamic.literal()
      CompletionDateTime.foreach(__v => __obj.updateDynamic("CompletionDateTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      SubmissionDateTime.foreach(__v => __obj.updateDynamic("SubmissionDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculationStatus]
    }
  }

  /** Summary information for a notebook calculation.
    */
  @js.native
  trait CalculationSummary extends js.Object {
    var CalculationExecutionId: js.UndefOr[CalculationExecutionId]
    var Description: js.UndefOr[DescriptionString]
    var Status: js.UndefOr[CalculationStatus]
  }

  object CalculationSummary {
    @inline
    def apply(
        CalculationExecutionId: js.UndefOr[CalculationExecutionId] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Status: js.UndefOr[CalculationStatus] = js.undefined
    ): CalculationSummary = {
      val __obj = js.Dynamic.literal()
      CalculationExecutionId.foreach(__v => __obj.updateDynamic("CalculationExecutionId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculationSummary]
    }
  }

  /** Contains metadata for a column in a table.
    */
  @js.native
  trait Column extends js.Object {
    var Name: NameString
    var Comment: js.UndefOr[CommentString]
    var Type: js.UndefOr[TypeString]
  }

  object Column {
    @inline
    def apply(
        Name: NameString,
        Comment: js.UndefOr[CommentString] = js.undefined,
        Type: js.UndefOr[TypeString] = js.undefined
    ): Column = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Column]
    }
  }

  /** Information about the columns in a query execution result.
    */
  @js.native
  trait ColumnInfo extends js.Object {
    var Name: String
    var Type: String
    var CaseSensitive: js.UndefOr[Boolean]
    var CatalogName: js.UndefOr[String]
    var Label: js.UndefOr[String]
    var Nullable: js.UndefOr[ColumnNullable]
    var Precision: js.UndefOr[Int]
    var Scale: js.UndefOr[Int]
    var SchemaName: js.UndefOr[String]
    var TableName: js.UndefOr[String]
  }

  object ColumnInfo {
    @inline
    def apply(
        Name: String,
        Type: String,
        CaseSensitive: js.UndefOr[Boolean] = js.undefined,
        CatalogName: js.UndefOr[String] = js.undefined,
        Label: js.UndefOr[String] = js.undefined,
        Nullable: js.UndefOr[ColumnNullable] = js.undefined,
        Precision: js.UndefOr[Int] = js.undefined,
        Scale: js.UndefOr[Int] = js.undefined,
        SchemaName: js.UndefOr[String] = js.undefined,
        TableName: js.UndefOr[String] = js.undefined
    ): ColumnInfo = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      CaseSensitive.foreach(__v => __obj.updateDynamic("CaseSensitive")(__v.asInstanceOf[js.Any]))
      CatalogName.foreach(__v => __obj.updateDynamic("CatalogName")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Nullable.foreach(__v => __obj.updateDynamic("Nullable")(__v.asInstanceOf[js.Any]))
      Precision.foreach(__v => __obj.updateDynamic("Precision")(__v.asInstanceOf[js.Any]))
      Scale.foreach(__v => __obj.updateDynamic("Scale")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnInfo]
    }
  }

  @js.native
  trait CreateDataCatalogInput extends js.Object {
    var Name: CatalogNameString
    var Type: DataCatalogType
    var Description: js.UndefOr[DescriptionString]
    var Parameters: js.UndefOr[ParametersMap]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDataCatalogInput {
    @inline
    def apply(
        Name: CatalogNameString,
        Type: DataCatalogType,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDataCatalogInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataCatalogInput]
    }
  }

  @js.native
  trait CreateDataCatalogOutput extends js.Object

  object CreateDataCatalogOutput {
    @inline
    def apply(): CreateDataCatalogOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDataCatalogOutput]
    }
  }

  @js.native
  trait CreateNamedQueryInput extends js.Object {
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[DescriptionString]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object CreateNamedQueryInput {
    @inline
    def apply(
        Database: DatabaseString,
        Name: NameString,
        QueryString: QueryString,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): CreateNamedQueryInput = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNamedQueryInput]
    }
  }

  @js.native
  trait CreateNamedQueryOutput extends js.Object {
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object CreateNamedQueryOutput {
    @inline
    def apply(
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    ): CreateNamedQueryOutput = {
      val __obj = js.Dynamic.literal()
      NamedQueryId.foreach(__v => __obj.updateDynamic("NamedQueryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNamedQueryOutput]
    }
  }

  @js.native
  trait CreateNotebookInput extends js.Object {
    var Name: NotebookName
    var WorkGroup: WorkGroupName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object CreateNotebookInput {
    @inline
    def apply(
        Name: NotebookName,
        WorkGroup: WorkGroupName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): CreateNotebookInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNotebookInput]
    }
  }

  @js.native
  trait CreateNotebookOutput extends js.Object {
    var NotebookId: js.UndefOr[NotebookId]
  }

  object CreateNotebookOutput {
    @inline
    def apply(
        NotebookId: js.UndefOr[NotebookId] = js.undefined
    ): CreateNotebookOutput = {
      val __obj = js.Dynamic.literal()
      NotebookId.foreach(__v => __obj.updateDynamic("NotebookId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNotebookOutput]
    }
  }

  @js.native
  trait CreatePreparedStatementInput extends js.Object {
    var QueryStatement: QueryString
    var StatementName: StatementName
    var WorkGroup: WorkGroupName
    var Description: js.UndefOr[DescriptionString]
  }

  object CreatePreparedStatementInput {
    @inline
    def apply(
        QueryStatement: QueryString,
        StatementName: StatementName,
        WorkGroup: WorkGroupName,
        Description: js.UndefOr[DescriptionString] = js.undefined
    ): CreatePreparedStatementInput = {
      val __obj = js.Dynamic.literal(
        "QueryStatement" -> QueryStatement.asInstanceOf[js.Any],
        "StatementName" -> StatementName.asInstanceOf[js.Any],
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePreparedStatementInput]
    }
  }

  @js.native
  trait CreatePreparedStatementOutput extends js.Object

  object CreatePreparedStatementOutput {
    @inline
    def apply(): CreatePreparedStatementOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePreparedStatementOutput]
    }
  }

  @js.native
  trait CreatePresignedNotebookUrlRequest extends js.Object {
    var SessionId: SessionId
  }

  object CreatePresignedNotebookUrlRequest {
    @inline
    def apply(
        SessionId: SessionId
    ): CreatePresignedNotebookUrlRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePresignedNotebookUrlRequest]
    }
  }

  @js.native
  trait CreatePresignedNotebookUrlResponse extends js.Object {
    var AuthToken: AuthToken
    var AuthTokenExpirationTime: Double
    var NotebookUrl: String
  }

  object CreatePresignedNotebookUrlResponse {
    @inline
    def apply(
        AuthToken: AuthToken,
        AuthTokenExpirationTime: Double,
        NotebookUrl: String
    ): CreatePresignedNotebookUrlResponse = {
      val __obj = js.Dynamic.literal(
        "AuthToken" -> AuthToken.asInstanceOf[js.Any],
        "AuthTokenExpirationTime" -> AuthTokenExpirationTime.asInstanceOf[js.Any],
        "NotebookUrl" -> NotebookUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePresignedNotebookUrlResponse]
    }
  }

  @js.native
  trait CreateWorkGroupInput extends js.Object {
    var Name: WorkGroupName
    var Configuration: js.UndefOr[WorkGroupConfiguration]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWorkGroupInput {
    @inline
    def apply(
        Name: WorkGroupName,
        Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWorkGroupInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkGroupInput]
    }
  }

  @js.native
  trait CreateWorkGroupOutput extends js.Object

  object CreateWorkGroupOutput {
    @inline
    def apply(): CreateWorkGroupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateWorkGroupOutput]
    }
  }

  /** Specifies the KMS key that is used to encrypt the user's data stores in Athena.
    */
  @js.native
  trait CustomerContentEncryptionConfiguration extends js.Object {
    var KmsKey: KmsKey
  }

  object CustomerContentEncryptionConfiguration {
    @inline
    def apply(
        KmsKey: KmsKey
    ): CustomerContentEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "KmsKey" -> KmsKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomerContentEncryptionConfiguration]
    }
  }

  /** Contains information about a data catalog in an Amazon Web Services account.
    */
  @js.native
  trait DataCatalog extends js.Object {
    var Name: CatalogNameString
    var Type: DataCatalogType
    var Description: js.UndefOr[DescriptionString]
    var Parameters: js.UndefOr[ParametersMap]
  }

  object DataCatalog {
    @inline
    def apply(
        Name: CatalogNameString,
        Type: DataCatalogType,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined
    ): DataCatalog = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCatalog]
    }
  }

  /** The summary information for the data catalog, which includes its name and type.
    */
  @js.native
  trait DataCatalogSummary extends js.Object {
    var CatalogName: js.UndefOr[CatalogNameString]
    var Type: js.UndefOr[DataCatalogType]
  }

  object DataCatalogSummary {
    @inline
    def apply(
        CatalogName: js.UndefOr[CatalogNameString] = js.undefined,
        Type: js.UndefOr[DataCatalogType] = js.undefined
    ): DataCatalogSummary = {
      val __obj = js.Dynamic.literal()
      CatalogName.foreach(__v => __obj.updateDynamic("CatalogName")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCatalogSummary]
    }
  }

  /** Contains metadata information for a database in a data catalog.
    */
  @js.native
  trait Database extends js.Object {
    var Name: NameString
    var Description: js.UndefOr[DescriptionString]
    var Parameters: js.UndefOr[ParametersMap]
  }

  object Database {
    @inline
    def apply(
        Name: NameString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined
    ): Database = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Database]
    }
  }

  /** A piece of data (a field in the table).
    */
  @js.native
  trait Datum extends js.Object {
    var VarCharValue: js.UndefOr[datumString]
  }

  object Datum {
    @inline
    def apply(
        VarCharValue: js.UndefOr[datumString] = js.undefined
    ): Datum = {
      val __obj = js.Dynamic.literal()
      VarCharValue.foreach(__v => __obj.updateDynamic("VarCharValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Datum]
    }
  }

  @js.native
  trait DeleteDataCatalogInput extends js.Object {
    var Name: CatalogNameString
  }

  object DeleteDataCatalogInput {
    @inline
    def apply(
        Name: CatalogNameString
    ): DeleteDataCatalogInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDataCatalogInput]
    }
  }

  @js.native
  trait DeleteDataCatalogOutput extends js.Object

  object DeleteDataCatalogOutput {
    @inline
    def apply(): DeleteDataCatalogOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDataCatalogOutput]
    }
  }

  @js.native
  trait DeleteNamedQueryInput extends js.Object {
    var NamedQueryId: NamedQueryId
  }

  object DeleteNamedQueryInput {
    @inline
    def apply(
        NamedQueryId: NamedQueryId
    ): DeleteNamedQueryInput = {
      val __obj = js.Dynamic.literal(
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteNamedQueryInput]
    }
  }

  @js.native
  trait DeleteNamedQueryOutput extends js.Object

  object DeleteNamedQueryOutput {
    @inline
    def apply(): DeleteNamedQueryOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteNamedQueryOutput]
    }
  }

  @js.native
  trait DeleteNotebookInput extends js.Object {
    var NotebookId: NotebookId
  }

  object DeleteNotebookInput {
    @inline
    def apply(
        NotebookId: NotebookId
    ): DeleteNotebookInput = {
      val __obj = js.Dynamic.literal(
        "NotebookId" -> NotebookId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteNotebookInput]
    }
  }

  @js.native
  trait DeleteNotebookOutput extends js.Object

  object DeleteNotebookOutput {
    @inline
    def apply(): DeleteNotebookOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteNotebookOutput]
    }
  }

  @js.native
  trait DeletePreparedStatementInput extends js.Object {
    var StatementName: StatementName
    var WorkGroup: WorkGroupName
  }

  object DeletePreparedStatementInput {
    @inline
    def apply(
        StatementName: StatementName,
        WorkGroup: WorkGroupName
    ): DeletePreparedStatementInput = {
      val __obj = js.Dynamic.literal(
        "StatementName" -> StatementName.asInstanceOf[js.Any],
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePreparedStatementInput]
    }
  }

  @js.native
  trait DeletePreparedStatementOutput extends js.Object

  object DeletePreparedStatementOutput {
    @inline
    def apply(): DeletePreparedStatementOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePreparedStatementOutput]
    }
  }

  @js.native
  trait DeleteWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
    var RecursiveDeleteOption: js.UndefOr[BoxedBoolean]
  }

  object DeleteWorkGroupInput {
    @inline
    def apply(
        WorkGroup: WorkGroupName,
        RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.undefined
    ): DeleteWorkGroupInput = {
      val __obj = js.Dynamic.literal(
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      RecursiveDeleteOption.foreach(__v => __obj.updateDynamic("RecursiveDeleteOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteWorkGroupInput]
    }
  }

  @js.native
  trait DeleteWorkGroupOutput extends js.Object

  object DeleteWorkGroupOutput {
    @inline
    def apply(): DeleteWorkGroupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWorkGroupOutput]
    }
  }

  /** If query results are encrypted in Amazon S3, indicates the encryption option used (for example, <code>SSE_KMS</code> or <code>CSE_KMS</code>) and key information.
    */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var EncryptionOption: EncryptionOption
    var KmsKey: js.UndefOr[String]
  }

  object EncryptionConfiguration {
    @inline
    def apply(
        EncryptionOption: EncryptionOption,
        KmsKey: js.UndefOr[String] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "EncryptionOption" -> EncryptionOption.asInstanceOf[js.Any]
      )

      KmsKey.foreach(__v => __obj.updateDynamic("KmsKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfiguration]
    }
  }

  /** Contains data processing unit (DPU) configuration settings and parameter mappings for a notebook engine.
    */
  @js.native
  trait EngineConfiguration extends js.Object {
    var MaxConcurrentDpus: MaxConcurrentDpus
    var AdditionalConfigs: js.UndefOr[ParametersMap]
    var CoordinatorDpuSize: js.UndefOr[CoordinatorDpuSize]
    var DefaultExecutorDpuSize: js.UndefOr[DefaultExecutorDpuSize]
  }

  object EngineConfiguration {
    @inline
    def apply(
        MaxConcurrentDpus: MaxConcurrentDpus,
        AdditionalConfigs: js.UndefOr[ParametersMap] = js.undefined,
        CoordinatorDpuSize: js.UndefOr[CoordinatorDpuSize] = js.undefined,
        DefaultExecutorDpuSize: js.UndefOr[DefaultExecutorDpuSize] = js.undefined
    ): EngineConfiguration = {
      val __obj = js.Dynamic.literal(
        "MaxConcurrentDpus" -> MaxConcurrentDpus.asInstanceOf[js.Any]
      )

      AdditionalConfigs.foreach(__v => __obj.updateDynamic("AdditionalConfigs")(__v.asInstanceOf[js.Any]))
      CoordinatorDpuSize.foreach(__v => __obj.updateDynamic("CoordinatorDpuSize")(__v.asInstanceOf[js.Any]))
      DefaultExecutorDpuSize.foreach(__v => __obj.updateDynamic("DefaultExecutorDpuSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineConfiguration]
    }
  }

  /** The Athena engine version for running queries, or the PySpark engine version for running sessions.
    */
  @js.native
  trait EngineVersion extends js.Object {
    var EffectiveEngineVersion: js.UndefOr[NameString]
    var SelectedEngineVersion: js.UndefOr[NameString]
  }

  object EngineVersion {
    @inline
    def apply(
        EffectiveEngineVersion: js.UndefOr[NameString] = js.undefined,
        SelectedEngineVersion: js.UndefOr[NameString] = js.undefined
    ): EngineVersion = {
      val __obj = js.Dynamic.literal()
      EffectiveEngineVersion.foreach(__v => __obj.updateDynamic("EffectiveEngineVersion")(__v.asInstanceOf[js.Any]))
      SelectedEngineVersion.foreach(__v => __obj.updateDynamic("SelectedEngineVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineVersion]
    }
  }

  /** Contains summary information about an executor.
    */
  @js.native
  trait ExecutorsSummary extends js.Object {
    var ExecutorId: ExecutorId
    var ExecutorSize: js.UndefOr[Double]
    var ExecutorState: js.UndefOr[ExecutorState]
    var ExecutorType: js.UndefOr[ExecutorType]
    var StartDateTime: js.UndefOr[Double]
    var TerminationDateTime: js.UndefOr[Double]
  }

  object ExecutorsSummary {
    @inline
    def apply(
        ExecutorId: ExecutorId,
        ExecutorSize: js.UndefOr[Double] = js.undefined,
        ExecutorState: js.UndefOr[ExecutorState] = js.undefined,
        ExecutorType: js.UndefOr[ExecutorType] = js.undefined,
        StartDateTime: js.UndefOr[Double] = js.undefined,
        TerminationDateTime: js.UndefOr[Double] = js.undefined
    ): ExecutorsSummary = {
      val __obj = js.Dynamic.literal(
        "ExecutorId" -> ExecutorId.asInstanceOf[js.Any]
      )

      ExecutorSize.foreach(__v => __obj.updateDynamic("ExecutorSize")(__v.asInstanceOf[js.Any]))
      ExecutorState.foreach(__v => __obj.updateDynamic("ExecutorState")(__v.asInstanceOf[js.Any]))
      ExecutorType.foreach(__v => __obj.updateDynamic("ExecutorType")(__v.asInstanceOf[js.Any]))
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      TerminationDateTime.foreach(__v => __obj.updateDynamic("TerminationDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutorsSummary]
    }
  }

  @js.native
  trait ExportNotebookInput extends js.Object {
    var NotebookId: NotebookId
  }

  object ExportNotebookInput {
    @inline
    def apply(
        NotebookId: NotebookId
    ): ExportNotebookInput = {
      val __obj = js.Dynamic.literal(
        "NotebookId" -> NotebookId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportNotebookInput]
    }
  }

  @js.native
  trait ExportNotebookOutput extends js.Object {
    var NotebookMetadata: js.UndefOr[NotebookMetadata]
    var Payload: js.UndefOr[Payload]
  }

  object ExportNotebookOutput {
    @inline
    def apply(
        NotebookMetadata: js.UndefOr[NotebookMetadata] = js.undefined,
        Payload: js.UndefOr[Payload] = js.undefined
    ): ExportNotebookOutput = {
      val __obj = js.Dynamic.literal()
      NotebookMetadata.foreach(__v => __obj.updateDynamic("NotebookMetadata")(__v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.updateDynamic("Payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportNotebookOutput]
    }
  }

  /** A string for searching notebook names.
    */
  @js.native
  trait FilterDefinition extends js.Object {
    var Name: js.UndefOr[NotebookName]
  }

  object FilterDefinition {
    @inline
    def apply(
        Name: js.UndefOr[NotebookName] = js.undefined
    ): FilterDefinition = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterDefinition]
    }
  }

  @js.native
  trait GetCalculationExecutionCodeRequest extends js.Object {
    var CalculationExecutionId: CalculationExecutionId
  }

  object GetCalculationExecutionCodeRequest {
    @inline
    def apply(
        CalculationExecutionId: CalculationExecutionId
    ): GetCalculationExecutionCodeRequest = {
      val __obj = js.Dynamic.literal(
        "CalculationExecutionId" -> CalculationExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCalculationExecutionCodeRequest]
    }
  }

  @js.native
  trait GetCalculationExecutionCodeResponse extends js.Object {
    var CodeBlock: js.UndefOr[CodeBlock]
  }

  object GetCalculationExecutionCodeResponse {
    @inline
    def apply(
        CodeBlock: js.UndefOr[CodeBlock] = js.undefined
    ): GetCalculationExecutionCodeResponse = {
      val __obj = js.Dynamic.literal()
      CodeBlock.foreach(__v => __obj.updateDynamic("CodeBlock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCalculationExecutionCodeResponse]
    }
  }

  @js.native
  trait GetCalculationExecutionRequest extends js.Object {
    var CalculationExecutionId: CalculationExecutionId
  }

  object GetCalculationExecutionRequest {
    @inline
    def apply(
        CalculationExecutionId: CalculationExecutionId
    ): GetCalculationExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "CalculationExecutionId" -> CalculationExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCalculationExecutionRequest]
    }
  }

  @js.native
  trait GetCalculationExecutionResponse extends js.Object {
    var CalculationExecutionId: js.UndefOr[CalculationExecutionId]
    var Description: js.UndefOr[DescriptionString]
    var Result: js.UndefOr[CalculationResult]
    var SessionId: js.UndefOr[SessionId]
    var Statistics: js.UndefOr[CalculationStatistics]
    var Status: js.UndefOr[CalculationStatus]
    var WorkingDirectory: js.UndefOr[S3Uri]
  }

  object GetCalculationExecutionResponse {
    @inline
    def apply(
        CalculationExecutionId: js.UndefOr[CalculationExecutionId] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Result: js.UndefOr[CalculationResult] = js.undefined,
        SessionId: js.UndefOr[SessionId] = js.undefined,
        Statistics: js.UndefOr[CalculationStatistics] = js.undefined,
        Status: js.UndefOr[CalculationStatus] = js.undefined,
        WorkingDirectory: js.UndefOr[S3Uri] = js.undefined
    ): GetCalculationExecutionResponse = {
      val __obj = js.Dynamic.literal()
      CalculationExecutionId.foreach(__v => __obj.updateDynamic("CalculationExecutionId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      Statistics.foreach(__v => __obj.updateDynamic("Statistics")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WorkingDirectory.foreach(__v => __obj.updateDynamic("WorkingDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCalculationExecutionResponse]
    }
  }

  @js.native
  trait GetCalculationExecutionStatusRequest extends js.Object {
    var CalculationExecutionId: CalculationExecutionId
  }

  object GetCalculationExecutionStatusRequest {
    @inline
    def apply(
        CalculationExecutionId: CalculationExecutionId
    ): GetCalculationExecutionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "CalculationExecutionId" -> CalculationExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCalculationExecutionStatusRequest]
    }
  }

  @js.native
  trait GetCalculationExecutionStatusResponse extends js.Object {
    var Statistics: js.UndefOr[CalculationStatistics]
    var Status: js.UndefOr[CalculationStatus]
  }

  object GetCalculationExecutionStatusResponse {
    @inline
    def apply(
        Statistics: js.UndefOr[CalculationStatistics] = js.undefined,
        Status: js.UndefOr[CalculationStatus] = js.undefined
    ): GetCalculationExecutionStatusResponse = {
      val __obj = js.Dynamic.literal()
      Statistics.foreach(__v => __obj.updateDynamic("Statistics")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCalculationExecutionStatusResponse]
    }
  }

  @js.native
  trait GetDataCatalogInput extends js.Object {
    var Name: CatalogNameString
  }

  object GetDataCatalogInput {
    @inline
    def apply(
        Name: CatalogNameString
    ): GetDataCatalogInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDataCatalogInput]
    }
  }

  @js.native
  trait GetDataCatalogOutput extends js.Object {
    var DataCatalog: js.UndefOr[DataCatalog]
  }

  object GetDataCatalogOutput {
    @inline
    def apply(
        DataCatalog: js.UndefOr[DataCatalog] = js.undefined
    ): GetDataCatalogOutput = {
      val __obj = js.Dynamic.literal()
      DataCatalog.foreach(__v => __obj.updateDynamic("DataCatalog")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataCatalogOutput]
    }
  }

  @js.native
  trait GetDatabaseInput extends js.Object {
    var CatalogName: CatalogNameString
    var DatabaseName: NameString
  }

  object GetDatabaseInput {
    @inline
    def apply(
        CatalogName: CatalogNameString,
        DatabaseName: NameString
    ): GetDatabaseInput = {
      val __obj = js.Dynamic.literal(
        "CatalogName" -> CatalogName.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDatabaseInput]
    }
  }

  @js.native
  trait GetDatabaseOutput extends js.Object {
    var Database: js.UndefOr[Database]
  }

  object GetDatabaseOutput {
    @inline
    def apply(
        Database: js.UndefOr[Database] = js.undefined
    ): GetDatabaseOutput = {
      val __obj = js.Dynamic.literal()
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabaseOutput]
    }
  }

  @js.native
  trait GetNamedQueryInput extends js.Object {
    var NamedQueryId: NamedQueryId
  }

  object GetNamedQueryInput {
    @inline
    def apply(
        NamedQueryId: NamedQueryId
    ): GetNamedQueryInput = {
      val __obj = js.Dynamic.literal(
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetNamedQueryInput]
    }
  }

  @js.native
  trait GetNamedQueryOutput extends js.Object {
    var NamedQuery: js.UndefOr[NamedQuery]
  }

  object GetNamedQueryOutput {
    @inline
    def apply(
        NamedQuery: js.UndefOr[NamedQuery] = js.undefined
    ): GetNamedQueryOutput = {
      val __obj = js.Dynamic.literal()
      NamedQuery.foreach(__v => __obj.updateDynamic("NamedQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNamedQueryOutput]
    }
  }

  @js.native
  trait GetNotebookMetadataInput extends js.Object {
    var NotebookId: NotebookId
  }

  object GetNotebookMetadataInput {
    @inline
    def apply(
        NotebookId: NotebookId
    ): GetNotebookMetadataInput = {
      val __obj = js.Dynamic.literal(
        "NotebookId" -> NotebookId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetNotebookMetadataInput]
    }
  }

  @js.native
  trait GetNotebookMetadataOutput extends js.Object {
    var NotebookMetadata: js.UndefOr[NotebookMetadata]
  }

  object GetNotebookMetadataOutput {
    @inline
    def apply(
        NotebookMetadata: js.UndefOr[NotebookMetadata] = js.undefined
    ): GetNotebookMetadataOutput = {
      val __obj = js.Dynamic.literal()
      NotebookMetadata.foreach(__v => __obj.updateDynamic("NotebookMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNotebookMetadataOutput]
    }
  }

  @js.native
  trait GetPreparedStatementInput extends js.Object {
    var StatementName: StatementName
    var WorkGroup: WorkGroupName
  }

  object GetPreparedStatementInput {
    @inline
    def apply(
        StatementName: StatementName,
        WorkGroup: WorkGroupName
    ): GetPreparedStatementInput = {
      val __obj = js.Dynamic.literal(
        "StatementName" -> StatementName.asInstanceOf[js.Any],
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPreparedStatementInput]
    }
  }

  @js.native
  trait GetPreparedStatementOutput extends js.Object {
    var PreparedStatement: js.UndefOr[PreparedStatement]
  }

  object GetPreparedStatementOutput {
    @inline
    def apply(
        PreparedStatement: js.UndefOr[PreparedStatement] = js.undefined
    ): GetPreparedStatementOutput = {
      val __obj = js.Dynamic.literal()
      PreparedStatement.foreach(__v => __obj.updateDynamic("PreparedStatement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPreparedStatementOutput]
    }
  }

  @js.native
  trait GetQueryExecutionInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  object GetQueryExecutionInput {
    @inline
    def apply(
        QueryExecutionId: QueryExecutionId
    ): GetQueryExecutionInput = {
      val __obj = js.Dynamic.literal(
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetQueryExecutionInput]
    }
  }

  @js.native
  trait GetQueryExecutionOutput extends js.Object {
    var QueryExecution: js.UndefOr[QueryExecution]
  }

  object GetQueryExecutionOutput {
    @inline
    def apply(
        QueryExecution: js.UndefOr[QueryExecution] = js.undefined
    ): GetQueryExecutionOutput = {
      val __obj = js.Dynamic.literal()
      QueryExecution.foreach(__v => __obj.updateDynamic("QueryExecution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryExecutionOutput]
    }
  }

  @js.native
  trait GetQueryResultsInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
    var MaxResults: js.UndefOr[MaxQueryResults]
    var NextToken: js.UndefOr[Token]
  }

  object GetQueryResultsInput {
    @inline
    def apply(
        QueryExecutionId: QueryExecutionId,
        MaxResults: js.UndefOr[MaxQueryResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetQueryResultsInput = {
      val __obj = js.Dynamic.literal(
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryResultsInput]
    }
  }

  @js.native
  trait GetQueryResultsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var ResultSet: js.UndefOr[ResultSet]
    var UpdateCount: js.UndefOr[Double]
  }

  object GetQueryResultsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        ResultSet: js.UndefOr[ResultSet] = js.undefined,
        UpdateCount: js.UndefOr[Double] = js.undefined
    ): GetQueryResultsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResultSet.foreach(__v => __obj.updateDynamic("ResultSet")(__v.asInstanceOf[js.Any]))
      UpdateCount.foreach(__v => __obj.updateDynamic("UpdateCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryResultsOutput]
    }
  }

  @js.native
  trait GetQueryRuntimeStatisticsInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  object GetQueryRuntimeStatisticsInput {
    @inline
    def apply(
        QueryExecutionId: QueryExecutionId
    ): GetQueryRuntimeStatisticsInput = {
      val __obj = js.Dynamic.literal(
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetQueryRuntimeStatisticsInput]
    }
  }

  @js.native
  trait GetQueryRuntimeStatisticsOutput extends js.Object {
    var QueryRuntimeStatistics: js.UndefOr[QueryRuntimeStatistics]
  }

  object GetQueryRuntimeStatisticsOutput {
    @inline
    def apply(
        QueryRuntimeStatistics: js.UndefOr[QueryRuntimeStatistics] = js.undefined
    ): GetQueryRuntimeStatisticsOutput = {
      val __obj = js.Dynamic.literal()
      QueryRuntimeStatistics.foreach(__v => __obj.updateDynamic("QueryRuntimeStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryRuntimeStatisticsOutput]
    }
  }

  @js.native
  trait GetSessionRequest extends js.Object {
    var SessionId: SessionId
  }

  object GetSessionRequest {
    @inline
    def apply(
        SessionId: SessionId
    ): GetSessionRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSessionRequest]
    }
  }

  @js.native
  trait GetSessionResponse extends js.Object {
    var Description: js.UndefOr[DescriptionString]
    var EngineConfiguration: js.UndefOr[EngineConfiguration]
    var EngineVersion: js.UndefOr[NameString]
    var NotebookVersion: js.UndefOr[NameString]
    var SessionConfiguration: js.UndefOr[SessionConfiguration]
    var SessionId: js.UndefOr[SessionId]
    var Statistics: js.UndefOr[SessionStatistics]
    var Status: js.UndefOr[SessionStatus]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object GetSessionResponse {
    @inline
    def apply(
        Description: js.UndefOr[DescriptionString] = js.undefined,
        EngineConfiguration: js.UndefOr[EngineConfiguration] = js.undefined,
        EngineVersion: js.UndefOr[NameString] = js.undefined,
        NotebookVersion: js.UndefOr[NameString] = js.undefined,
        SessionConfiguration: js.UndefOr[SessionConfiguration] = js.undefined,
        SessionId: js.UndefOr[SessionId] = js.undefined,
        Statistics: js.UndefOr[SessionStatistics] = js.undefined,
        Status: js.UndefOr[SessionStatus] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): GetSessionResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EngineConfiguration.foreach(__v => __obj.updateDynamic("EngineConfiguration")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      NotebookVersion.foreach(__v => __obj.updateDynamic("NotebookVersion")(__v.asInstanceOf[js.Any]))
      SessionConfiguration.foreach(__v => __obj.updateDynamic("SessionConfiguration")(__v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      Statistics.foreach(__v => __obj.updateDynamic("Statistics")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionResponse]
    }
  }

  @js.native
  trait GetSessionStatusRequest extends js.Object {
    var SessionId: SessionId
  }

  object GetSessionStatusRequest {
    @inline
    def apply(
        SessionId: SessionId
    ): GetSessionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSessionStatusRequest]
    }
  }

  @js.native
  trait GetSessionStatusResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var Status: js.UndefOr[SessionStatus]
  }

  object GetSessionStatusResponse {
    @inline
    def apply(
        SessionId: js.UndefOr[SessionId] = js.undefined,
        Status: js.UndefOr[SessionStatus] = js.undefined
    ): GetSessionStatusResponse = {
      val __obj = js.Dynamic.literal()
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionStatusResponse]
    }
  }

  @js.native
  trait GetTableMetadataInput extends js.Object {
    var CatalogName: CatalogNameString
    var DatabaseName: NameString
    var TableName: NameString
  }

  object GetTableMetadataInput {
    @inline
    def apply(
        CatalogName: CatalogNameString,
        DatabaseName: NameString,
        TableName: NameString
    ): GetTableMetadataInput = {
      val __obj = js.Dynamic.literal(
        "CatalogName" -> CatalogName.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTableMetadataInput]
    }
  }

  @js.native
  trait GetTableMetadataOutput extends js.Object {
    var TableMetadata: js.UndefOr[TableMetadata]
  }

  object GetTableMetadataOutput {
    @inline
    def apply(
        TableMetadata: js.UndefOr[TableMetadata] = js.undefined
    ): GetTableMetadataOutput = {
      val __obj = js.Dynamic.literal()
      TableMetadata.foreach(__v => __obj.updateDynamic("TableMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableMetadataOutput]
    }
  }

  @js.native
  trait GetWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
  }

  object GetWorkGroupInput {
    @inline
    def apply(
        WorkGroup: WorkGroupName
    ): GetWorkGroupInput = {
      val __obj = js.Dynamic.literal(
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkGroupInput]
    }
  }

  @js.native
  trait GetWorkGroupOutput extends js.Object {
    var WorkGroup: js.UndefOr[WorkGroup]
  }

  object GetWorkGroupOutput {
    @inline
    def apply(
        WorkGroup: js.UndefOr[WorkGroup] = js.undefined
    ): GetWorkGroupOutput = {
      val __obj = js.Dynamic.literal()
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkGroupOutput]
    }
  }

  @js.native
  trait ImportNotebookInput extends js.Object {
    var Name: NotebookName
    var Payload: Payload
    var Type: NotebookType
    var WorkGroup: WorkGroupName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object ImportNotebookInput {
    @inline
    def apply(
        Name: NotebookName,
        Payload: Payload,
        Type: NotebookType,
        WorkGroup: WorkGroupName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): ImportNotebookInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Payload" -> Payload.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportNotebookInput]
    }
  }

  @js.native
  trait ImportNotebookOutput extends js.Object {
    var NotebookId: js.UndefOr[NotebookId]
  }

  object ImportNotebookOutput {
    @inline
    def apply(
        NotebookId: js.UndefOr[NotebookId] = js.undefined
    ): ImportNotebookOutput = {
      val __obj = js.Dynamic.literal()
      NotebookId.foreach(__v => __obj.updateDynamic("NotebookId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportNotebookOutput]
    }
  }

  @js.native
  trait ListApplicationDPUSizesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxApplicationDPUSizesCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListApplicationDPUSizesInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxApplicationDPUSizesCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListApplicationDPUSizesInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationDPUSizesInput]
    }
  }

  @js.native
  trait ListApplicationDPUSizesOutput extends js.Object {
    var ApplicationDPUSizes: js.UndefOr[ApplicationDPUSizesList]
    var NextToken: js.UndefOr[Token]
  }

  object ListApplicationDPUSizesOutput {
    @inline
    def apply(
        ApplicationDPUSizes: js.UndefOr[ApplicationDPUSizesList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListApplicationDPUSizesOutput = {
      val __obj = js.Dynamic.literal()
      ApplicationDPUSizes.foreach(__v => __obj.updateDynamic("ApplicationDPUSizes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationDPUSizesOutput]
    }
  }

  @js.native
  trait ListCalculationExecutionsRequest extends js.Object {
    var SessionId: SessionId
    var MaxResults: js.UndefOr[MaxCalculationsCount]
    var NextToken: js.UndefOr[SessionManagerToken]
    var StateFilter: js.UndefOr[CalculationExecutionState]
  }

  object ListCalculationExecutionsRequest {
    @inline
    def apply(
        SessionId: SessionId,
        MaxResults: js.UndefOr[MaxCalculationsCount] = js.undefined,
        NextToken: js.UndefOr[SessionManagerToken] = js.undefined,
        StateFilter: js.UndefOr[CalculationExecutionState] = js.undefined
    ): ListCalculationExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StateFilter.foreach(__v => __obj.updateDynamic("StateFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCalculationExecutionsRequest]
    }
  }

  @js.native
  trait ListCalculationExecutionsResponse extends js.Object {
    var Calculations: js.UndefOr[CalculationsList]
    var NextToken: js.UndefOr[SessionManagerToken]
  }

  object ListCalculationExecutionsResponse {
    @inline
    def apply(
        Calculations: js.UndefOr[CalculationsList] = js.undefined,
        NextToken: js.UndefOr[SessionManagerToken] = js.undefined
    ): ListCalculationExecutionsResponse = {
      val __obj = js.Dynamic.literal()
      Calculations.foreach(__v => __obj.updateDynamic("Calculations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCalculationExecutionsResponse]
    }
  }

  @js.native
  trait ListDataCatalogsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxDataCatalogsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListDataCatalogsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxDataCatalogsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListDataCatalogsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataCatalogsInput]
    }
  }

  @js.native
  trait ListDataCatalogsOutput extends js.Object {
    var DataCatalogsSummary: js.UndefOr[DataCatalogSummaryList]
    var NextToken: js.UndefOr[Token]
  }

  object ListDataCatalogsOutput {
    @inline
    def apply(
        DataCatalogsSummary: js.UndefOr[DataCatalogSummaryList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListDataCatalogsOutput = {
      val __obj = js.Dynamic.literal()
      DataCatalogsSummary.foreach(__v => __obj.updateDynamic("DataCatalogsSummary")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataCatalogsOutput]
    }
  }

  @js.native
  trait ListDatabasesInput extends js.Object {
    var CatalogName: CatalogNameString
    var MaxResults: js.UndefOr[MaxDatabasesCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListDatabasesInput {
    @inline
    def apply(
        CatalogName: CatalogNameString,
        MaxResults: js.UndefOr[MaxDatabasesCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListDatabasesInput = {
      val __obj = js.Dynamic.literal(
        "CatalogName" -> CatalogName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatabasesInput]
    }
  }

  @js.native
  trait ListDatabasesOutput extends js.Object {
    var DatabaseList: js.UndefOr[DatabaseList]
    var NextToken: js.UndefOr[Token]
  }

  object ListDatabasesOutput {
    @inline
    def apply(
        DatabaseList: js.UndefOr[DatabaseList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListDatabasesOutput = {
      val __obj = js.Dynamic.literal()
      DatabaseList.foreach(__v => __obj.updateDynamic("DatabaseList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatabasesOutput]
    }
  }

  @js.native
  trait ListEngineVersionsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxEngineVersionsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListEngineVersionsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxEngineVersionsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListEngineVersionsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEngineVersionsInput]
    }
  }

  @js.native
  trait ListEngineVersionsOutput extends js.Object {
    var EngineVersions: js.UndefOr[EngineVersionsList]
    var NextToken: js.UndefOr[Token]
  }

  object ListEngineVersionsOutput {
    @inline
    def apply(
        EngineVersions: js.UndefOr[EngineVersionsList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListEngineVersionsOutput = {
      val __obj = js.Dynamic.literal()
      EngineVersions.foreach(__v => __obj.updateDynamic("EngineVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEngineVersionsOutput]
    }
  }

  @js.native
  trait ListExecutorsRequest extends js.Object {
    var SessionId: SessionId
    var ExecutorStateFilter: js.UndefOr[ExecutorState]
    var MaxResults: js.UndefOr[MaxListExecutorsCount]
    var NextToken: js.UndefOr[SessionManagerToken]
  }

  object ListExecutorsRequest {
    @inline
    def apply(
        SessionId: SessionId,
        ExecutorStateFilter: js.UndefOr[ExecutorState] = js.undefined,
        MaxResults: js.UndefOr[MaxListExecutorsCount] = js.undefined,
        NextToken: js.UndefOr[SessionManagerToken] = js.undefined
    ): ListExecutorsRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )

      ExecutorStateFilter.foreach(__v => __obj.updateDynamic("ExecutorStateFilter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExecutorsRequest]
    }
  }

  @js.native
  trait ListExecutorsResponse extends js.Object {
    var SessionId: SessionId
    var ExecutorsSummary: js.UndefOr[ExecutorsSummaryList]
    var NextToken: js.UndefOr[SessionManagerToken]
  }

  object ListExecutorsResponse {
    @inline
    def apply(
        SessionId: SessionId,
        ExecutorsSummary: js.UndefOr[ExecutorsSummaryList] = js.undefined,
        NextToken: js.UndefOr[SessionManagerToken] = js.undefined
    ): ListExecutorsResponse = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )

      ExecutorsSummary.foreach(__v => __obj.updateDynamic("ExecutorsSummary")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExecutorsResponse]
    }
  }

  @js.native
  trait ListNamedQueriesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxNamedQueriesCount]
    var NextToken: js.UndefOr[Token]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object ListNamedQueriesInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): ListNamedQueriesInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamedQueriesInput]
    }
  }

  @js.native
  trait ListNamedQueriesOutput extends js.Object {
    var NamedQueryIds: js.UndefOr[NamedQueryIdList]
    var NextToken: js.UndefOr[Token]
  }

  object ListNamedQueriesOutput {
    @inline
    def apply(
        NamedQueryIds: js.UndefOr[NamedQueryIdList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListNamedQueriesOutput = {
      val __obj = js.Dynamic.literal()
      NamedQueryIds.foreach(__v => __obj.updateDynamic("NamedQueryIds")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamedQueriesOutput]
    }
  }

  @js.native
  trait ListNotebookMetadataInput extends js.Object {
    var WorkGroup: WorkGroupName
    var Filters: js.UndefOr[FilterDefinition]
    var MaxResults: js.UndefOr[MaxNotebooksCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListNotebookMetadataInput {
    @inline
    def apply(
        WorkGroup: WorkGroupName,
        Filters: js.UndefOr[FilterDefinition] = js.undefined,
        MaxResults: js.UndefOr[MaxNotebooksCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListNotebookMetadataInput = {
      val __obj = js.Dynamic.literal(
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotebookMetadataInput]
    }
  }

  @js.native
  trait ListNotebookMetadataOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var NotebookMetadataList: js.UndefOr[NotebookMetadataArray]
  }

  object ListNotebookMetadataOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        NotebookMetadataList: js.UndefOr[NotebookMetadataArray] = js.undefined
    ): ListNotebookMetadataOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotebookMetadataList.foreach(__v => __obj.updateDynamic("NotebookMetadataList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotebookMetadataOutput]
    }
  }

  @js.native
  trait ListNotebookSessionsRequest extends js.Object {
    var NotebookId: NotebookId
    var MaxResults: js.UndefOr[MaxSessionsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListNotebookSessionsRequest {
    @inline
    def apply(
        NotebookId: NotebookId,
        MaxResults: js.UndefOr[MaxSessionsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListNotebookSessionsRequest = {
      val __obj = js.Dynamic.literal(
        "NotebookId" -> NotebookId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotebookSessionsRequest]
    }
  }

  @js.native
  trait ListNotebookSessionsResponse extends js.Object {
    var NotebookSessionsList: NotebookSessionsList
    var NextToken: js.UndefOr[Token]
  }

  object ListNotebookSessionsResponse {
    @inline
    def apply(
        NotebookSessionsList: NotebookSessionsList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListNotebookSessionsResponse = {
      val __obj = js.Dynamic.literal(
        "NotebookSessionsList" -> NotebookSessionsList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNotebookSessionsResponse]
    }
  }

  @js.native
  trait ListPreparedStatementsInput extends js.Object {
    var WorkGroup: WorkGroupName
    var MaxResults: js.UndefOr[MaxPreparedStatementsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListPreparedStatementsInput {
    @inline
    def apply(
        WorkGroup: WorkGroupName,
        MaxResults: js.UndefOr[MaxPreparedStatementsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPreparedStatementsInput = {
      val __obj = js.Dynamic.literal(
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPreparedStatementsInput]
    }
  }

  @js.native
  trait ListPreparedStatementsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PreparedStatements: js.UndefOr[PreparedStatementsList]
  }

  object ListPreparedStatementsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        PreparedStatements: js.UndefOr[PreparedStatementsList] = js.undefined
    ): ListPreparedStatementsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PreparedStatements.foreach(__v => __obj.updateDynamic("PreparedStatements")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPreparedStatementsOutput]
    }
  }

  @js.native
  trait ListQueryExecutionsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxQueryExecutionsCount]
    var NextToken: js.UndefOr[Token]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object ListQueryExecutionsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxQueryExecutionsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): ListQueryExecutionsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueryExecutionsInput]
    }
  }

  @js.native
  trait ListQueryExecutionsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var QueryExecutionIds: js.UndefOr[QueryExecutionIdList]
  }

  object ListQueryExecutionsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined
    ): ListQueryExecutionsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryExecutionIds.foreach(__v => __obj.updateDynamic("QueryExecutionIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueryExecutionsOutput]
    }
  }

  @js.native
  trait ListSessionsRequest extends js.Object {
    var WorkGroup: WorkGroupName
    var MaxResults: js.UndefOr[MaxSessionsCount]
    var NextToken: js.UndefOr[SessionManagerToken]
    var StateFilter: js.UndefOr[SessionState]
  }

  object ListSessionsRequest {
    @inline
    def apply(
        WorkGroup: WorkGroupName,
        MaxResults: js.UndefOr[MaxSessionsCount] = js.undefined,
        NextToken: js.UndefOr[SessionManagerToken] = js.undefined,
        StateFilter: js.UndefOr[SessionState] = js.undefined
    ): ListSessionsRequest = {
      val __obj = js.Dynamic.literal(
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StateFilter.foreach(__v => __obj.updateDynamic("StateFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSessionsRequest]
    }
  }

  @js.native
  trait ListSessionsResponse extends js.Object {
    var NextToken: js.UndefOr[SessionManagerToken]
    var Sessions: js.UndefOr[SessionsList]
  }

  object ListSessionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[SessionManagerToken] = js.undefined,
        Sessions: js.UndefOr[SessionsList] = js.undefined
    ): ListSessionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sessions.foreach(__v => __obj.updateDynamic("Sessions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSessionsResponse]
    }
  }

  @js.native
  trait ListTableMetadataInput extends js.Object {
    var CatalogName: CatalogNameString
    var DatabaseName: NameString
    var Expression: js.UndefOr[ExpressionString]
    var MaxResults: js.UndefOr[MaxTableMetadataCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListTableMetadataInput {
    @inline
    def apply(
        CatalogName: CatalogNameString,
        DatabaseName: NameString,
        Expression: js.UndefOr[ExpressionString] = js.undefined,
        MaxResults: js.UndefOr[MaxTableMetadataCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTableMetadataInput = {
      val __obj = js.Dynamic.literal(
        "CatalogName" -> CatalogName.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any]
      )

      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableMetadataInput]
    }
  }

  @js.native
  trait ListTableMetadataOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableMetadataList: js.UndefOr[TableMetadataList]
  }

  object ListTableMetadataOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        TableMetadataList: js.UndefOr[TableMetadataList] = js.undefined
    ): ListTableMetadataOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TableMetadataList.foreach(__v => __obj.updateDynamic("TableMetadataList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableMetadataOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var MaxResults: js.UndefOr[MaxTagsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        MaxResults: js.UndefOr[MaxTagsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait ListWorkGroupsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxWorkGroupsCount]
    var NextToken: js.UndefOr[Token]
  }

  object ListWorkGroupsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxWorkGroupsCount] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListWorkGroupsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkGroupsInput]
    }
  }

  @js.native
  trait ListWorkGroupsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var WorkGroups: js.UndefOr[WorkGroupsList]
  }

  object ListWorkGroupsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        WorkGroups: js.UndefOr[WorkGroupsList] = js.undefined
    ): ListWorkGroupsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkGroups.foreach(__v => __obj.updateDynamic("WorkGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkGroupsOutput]
    }
  }

  /** A query, where <code>QueryString</code> contains the SQL statements that make up the query.
    */
  @js.native
  trait NamedQuery extends js.Object {
    var Database: DatabaseString
    var Name: NameString
    var QueryString: QueryString
    var Description: js.UndefOr[DescriptionString]
    var NamedQueryId: js.UndefOr[NamedQueryId]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object NamedQuery {
    @inline
    def apply(
        Database: DatabaseString,
        Name: NameString,
        QueryString: QueryString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): NamedQuery = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NamedQueryId.foreach(__v => __obj.updateDynamic("NamedQueryId")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamedQuery]
    }
  }

  /** Contains metadata for notebook, including the notebook name, ID, workgroup, and time created.
    */
  @js.native
  trait NotebookMetadata extends js.Object {
    var CreationTime: js.UndefOr[Date]
    var LastModifiedTime: js.UndefOr[Date]
    var Name: js.UndefOr[NotebookName]
    var NotebookId: js.UndefOr[NotebookId]
    var Type: js.UndefOr[NotebookType]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object NotebookMetadata {
    @inline
    def apply(
        CreationTime: js.UndefOr[Date] = js.undefined,
        LastModifiedTime: js.UndefOr[Date] = js.undefined,
        Name: js.UndefOr[NotebookName] = js.undefined,
        NotebookId: js.UndefOr[NotebookId] = js.undefined,
        Type: js.UndefOr[NotebookType] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): NotebookMetadata = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NotebookId.foreach(__v => __obj.updateDynamic("NotebookId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotebookMetadata]
    }
  }

  /** Contains the notebook session ID and notebook session creation time.
    */
  @js.native
  trait NotebookSessionSummary extends js.Object {
    var CreationTime: js.UndefOr[Date]
    var SessionId: js.UndefOr[SessionId]
  }

  object NotebookSessionSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Date] = js.undefined,
        SessionId: js.UndefOr[SessionId] = js.undefined
    ): NotebookSessionSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotebookSessionSummary]
    }
  }

  /** A prepared SQL statement for use with Athena.
    */
  @js.native
  trait PreparedStatement extends js.Object {
    var Description: js.UndefOr[DescriptionString]
    var LastModifiedTime: js.UndefOr[Date]
    var QueryStatement: js.UndefOr[QueryString]
    var StatementName: js.UndefOr[StatementName]
    var WorkGroupName: js.UndefOr[WorkGroupName]
  }

  object PreparedStatement {
    @inline
    def apply(
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LastModifiedTime: js.UndefOr[Date] = js.undefined,
        QueryStatement: js.UndefOr[QueryString] = js.undefined,
        StatementName: js.UndefOr[StatementName] = js.undefined,
        WorkGroupName: js.UndefOr[WorkGroupName] = js.undefined
    ): PreparedStatement = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      QueryStatement.foreach(__v => __obj.updateDynamic("QueryStatement")(__v.asInstanceOf[js.Any]))
      StatementName.foreach(__v => __obj.updateDynamic("StatementName")(__v.asInstanceOf[js.Any]))
      WorkGroupName.foreach(__v => __obj.updateDynamic("WorkGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PreparedStatement]
    }
  }

  /** The name and last modified time of the prepared statement.
    */
  @js.native
  trait PreparedStatementSummary extends js.Object {
    var LastModifiedTime: js.UndefOr[Date]
    var StatementName: js.UndefOr[StatementName]
  }

  object PreparedStatementSummary {
    @inline
    def apply(
        LastModifiedTime: js.UndefOr[Date] = js.undefined,
        StatementName: js.UndefOr[StatementName] = js.undefined
    ): PreparedStatementSummary = {
      val __obj = js.Dynamic.literal()
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      StatementName.foreach(__v => __obj.updateDynamic("StatementName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PreparedStatementSummary]
    }
  }

  /** Information about a single instance of a query execution.
    */
  @js.native
  trait QueryExecution extends js.Object {
    var EngineVersion: js.UndefOr[EngineVersion]
    var ExecutionParameters: js.UndefOr[ExecutionParameters]
    var Query: js.UndefOr[QueryString]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
    var ResultReuseConfiguration: js.UndefOr[ResultReuseConfiguration]
    var StatementType: js.UndefOr[StatementType]
    var Statistics: js.UndefOr[QueryExecutionStatistics]
    var Status: js.UndefOr[QueryExecutionStatus]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object QueryExecution {
    @inline
    def apply(
        EngineVersion: js.UndefOr[EngineVersion] = js.undefined,
        ExecutionParameters: js.UndefOr[ExecutionParameters] = js.undefined,
        Query: js.UndefOr[QueryString] = js.undefined,
        QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined,
        ResultReuseConfiguration: js.UndefOr[ResultReuseConfiguration] = js.undefined,
        StatementType: js.UndefOr[StatementType] = js.undefined,
        Statistics: js.UndefOr[QueryExecutionStatistics] = js.undefined,
        Status: js.UndefOr[QueryExecutionStatus] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): QueryExecution = {
      val __obj = js.Dynamic.literal()
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      ExecutionParameters.foreach(__v => __obj.updateDynamic("ExecutionParameters")(__v.asInstanceOf[js.Any]))
      Query.foreach(__v => __obj.updateDynamic("Query")(__v.asInstanceOf[js.Any]))
      QueryExecutionContext.foreach(__v => __obj.updateDynamic("QueryExecutionContext")(__v.asInstanceOf[js.Any]))
      QueryExecutionId.foreach(__v => __obj.updateDynamic("QueryExecutionId")(__v.asInstanceOf[js.Any]))
      ResultConfiguration.foreach(__v => __obj.updateDynamic("ResultConfiguration")(__v.asInstanceOf[js.Any]))
      ResultReuseConfiguration.foreach(__v => __obj.updateDynamic("ResultReuseConfiguration")(__v.asInstanceOf[js.Any]))
      StatementType.foreach(__v => __obj.updateDynamic("StatementType")(__v.asInstanceOf[js.Any]))
      Statistics.foreach(__v => __obj.updateDynamic("Statistics")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryExecution]
    }
  }

  /** The database and data catalog context in which the query execution occurs.
    */
  @js.native
  trait QueryExecutionContext extends js.Object {
    var Catalog: js.UndefOr[CatalogNameString]
    var Database: js.UndefOr[DatabaseString]
  }

  object QueryExecutionContext {
    @inline
    def apply(
        Catalog: js.UndefOr[CatalogNameString] = js.undefined,
        Database: js.UndefOr[DatabaseString] = js.undefined
    ): QueryExecutionContext = {
      val __obj = js.Dynamic.literal()
      Catalog.foreach(__v => __obj.updateDynamic("Catalog")(__v.asInstanceOf[js.Any]))
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryExecutionContext]
    }
  }

  /** The amount of data scanned during the query execution and the amount of time that it took to execute, and the type of statement that was run.
    */
  @js.native
  trait QueryExecutionStatistics extends js.Object {
    var DataManifestLocation: js.UndefOr[String]
    var DataScannedInBytes: js.UndefOr[Double]
    var EngineExecutionTimeInMillis: js.UndefOr[Double]
    var QueryPlanningTimeInMillis: js.UndefOr[Double]
    var QueryQueueTimeInMillis: js.UndefOr[Double]
    var ResultReuseInformation: js.UndefOr[ResultReuseInformation]
    var ServiceProcessingTimeInMillis: js.UndefOr[Double]
    var TotalExecutionTimeInMillis: js.UndefOr[Double]
  }

  object QueryExecutionStatistics {
    @inline
    def apply(
        DataManifestLocation: js.UndefOr[String] = js.undefined,
        DataScannedInBytes: js.UndefOr[Double] = js.undefined,
        EngineExecutionTimeInMillis: js.UndefOr[Double] = js.undefined,
        QueryPlanningTimeInMillis: js.UndefOr[Double] = js.undefined,
        QueryQueueTimeInMillis: js.UndefOr[Double] = js.undefined,
        ResultReuseInformation: js.UndefOr[ResultReuseInformation] = js.undefined,
        ServiceProcessingTimeInMillis: js.UndefOr[Double] = js.undefined,
        TotalExecutionTimeInMillis: js.UndefOr[Double] = js.undefined
    ): QueryExecutionStatistics = {
      val __obj = js.Dynamic.literal()
      DataManifestLocation.foreach(__v => __obj.updateDynamic("DataManifestLocation")(__v.asInstanceOf[js.Any]))
      DataScannedInBytes.foreach(__v => __obj.updateDynamic("DataScannedInBytes")(__v.asInstanceOf[js.Any]))
      EngineExecutionTimeInMillis.foreach(__v => __obj.updateDynamic("EngineExecutionTimeInMillis")(__v.asInstanceOf[js.Any]))
      QueryPlanningTimeInMillis.foreach(__v => __obj.updateDynamic("QueryPlanningTimeInMillis")(__v.asInstanceOf[js.Any]))
      QueryQueueTimeInMillis.foreach(__v => __obj.updateDynamic("QueryQueueTimeInMillis")(__v.asInstanceOf[js.Any]))
      ResultReuseInformation.foreach(__v => __obj.updateDynamic("ResultReuseInformation")(__v.asInstanceOf[js.Any]))
      ServiceProcessingTimeInMillis.foreach(__v => __obj.updateDynamic("ServiceProcessingTimeInMillis")(__v.asInstanceOf[js.Any]))
      TotalExecutionTimeInMillis.foreach(__v => __obj.updateDynamic("TotalExecutionTimeInMillis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryExecutionStatistics]
    }
  }

  /** The completion date, current state, submission time, and state change reason (if applicable) for the query execution.
    */
  @js.native
  trait QueryExecutionStatus extends js.Object {
    var AthenaError: js.UndefOr[AthenaError]
    var CompletionDateTime: js.UndefOr[Date]
    var State: js.UndefOr[QueryExecutionState]
    var StateChangeReason: js.UndefOr[String]
    var SubmissionDateTime: js.UndefOr[Date]
  }

  object QueryExecutionStatus {
    @inline
    def apply(
        AthenaError: js.UndefOr[AthenaError] = js.undefined,
        CompletionDateTime: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[QueryExecutionState] = js.undefined,
        StateChangeReason: js.UndefOr[String] = js.undefined,
        SubmissionDateTime: js.UndefOr[Date] = js.undefined
    ): QueryExecutionStatus = {
      val __obj = js.Dynamic.literal()
      AthenaError.foreach(__v => __obj.updateDynamic("AthenaError")(__v.asInstanceOf[js.Any]))
      CompletionDateTime.foreach(__v => __obj.updateDynamic("CompletionDateTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      SubmissionDateTime.foreach(__v => __obj.updateDynamic("SubmissionDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryExecutionStatus]
    }
  }

  /** The query execution timeline, statistics on input and output rows and bytes, and the different query stages that form the query execution plan.
    */
  @js.native
  trait QueryRuntimeStatistics extends js.Object {
    var OutputStage: js.UndefOr[QueryStage]
    var Rows: js.UndefOr[QueryRuntimeStatisticsRows]
    var Timeline: js.UndefOr[QueryRuntimeStatisticsTimeline]
  }

  object QueryRuntimeStatistics {
    @inline
    def apply(
        OutputStage: js.UndefOr[QueryStage] = js.undefined,
        Rows: js.UndefOr[QueryRuntimeStatisticsRows] = js.undefined,
        Timeline: js.UndefOr[QueryRuntimeStatisticsTimeline] = js.undefined
    ): QueryRuntimeStatistics = {
      val __obj = js.Dynamic.literal()
      OutputStage.foreach(__v => __obj.updateDynamic("OutputStage")(__v.asInstanceOf[js.Any]))
      Rows.foreach(__v => __obj.updateDynamic("Rows")(__v.asInstanceOf[js.Any]))
      Timeline.foreach(__v => __obj.updateDynamic("Timeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryRuntimeStatistics]
    }
  }

  /** Statistics such as input rows and bytes read by the query, rows and bytes output by the query, and the number of rows written by the query.
    */
  @js.native
  trait QueryRuntimeStatisticsRows extends js.Object {
    var InputBytes: js.UndefOr[Double]
    var InputRows: js.UndefOr[Double]
    var OutputBytes: js.UndefOr[Double]
    var OutputRows: js.UndefOr[Double]
  }

  object QueryRuntimeStatisticsRows {
    @inline
    def apply(
        InputBytes: js.UndefOr[Double] = js.undefined,
        InputRows: js.UndefOr[Double] = js.undefined,
        OutputBytes: js.UndefOr[Double] = js.undefined,
        OutputRows: js.UndefOr[Double] = js.undefined
    ): QueryRuntimeStatisticsRows = {
      val __obj = js.Dynamic.literal()
      InputBytes.foreach(__v => __obj.updateDynamic("InputBytes")(__v.asInstanceOf[js.Any]))
      InputRows.foreach(__v => __obj.updateDynamic("InputRows")(__v.asInstanceOf[js.Any]))
      OutputBytes.foreach(__v => __obj.updateDynamic("OutputBytes")(__v.asInstanceOf[js.Any]))
      OutputRows.foreach(__v => __obj.updateDynamic("OutputRows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryRuntimeStatisticsRows]
    }
  }

  /** Timeline statistics such as query queue time, planning time, execution time, service processing time, and total execution time.
    */
  @js.native
  trait QueryRuntimeStatisticsTimeline extends js.Object {
    var EngineExecutionTimeInMillis: js.UndefOr[Double]
    var QueryPlanningTimeInMillis: js.UndefOr[Double]
    var QueryQueueTimeInMillis: js.UndefOr[Double]
    var ServiceProcessingTimeInMillis: js.UndefOr[Double]
    var TotalExecutionTimeInMillis: js.UndefOr[Double]
  }

  object QueryRuntimeStatisticsTimeline {
    @inline
    def apply(
        EngineExecutionTimeInMillis: js.UndefOr[Double] = js.undefined,
        QueryPlanningTimeInMillis: js.UndefOr[Double] = js.undefined,
        QueryQueueTimeInMillis: js.UndefOr[Double] = js.undefined,
        ServiceProcessingTimeInMillis: js.UndefOr[Double] = js.undefined,
        TotalExecutionTimeInMillis: js.UndefOr[Double] = js.undefined
    ): QueryRuntimeStatisticsTimeline = {
      val __obj = js.Dynamic.literal()
      EngineExecutionTimeInMillis.foreach(__v => __obj.updateDynamic("EngineExecutionTimeInMillis")(__v.asInstanceOf[js.Any]))
      QueryPlanningTimeInMillis.foreach(__v => __obj.updateDynamic("QueryPlanningTimeInMillis")(__v.asInstanceOf[js.Any]))
      QueryQueueTimeInMillis.foreach(__v => __obj.updateDynamic("QueryQueueTimeInMillis")(__v.asInstanceOf[js.Any]))
      ServiceProcessingTimeInMillis.foreach(__v => __obj.updateDynamic("ServiceProcessingTimeInMillis")(__v.asInstanceOf[js.Any]))
      TotalExecutionTimeInMillis.foreach(__v => __obj.updateDynamic("TotalExecutionTimeInMillis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryRuntimeStatisticsTimeline]
    }
  }

  /** Stage statistics such as input and output rows and bytes, execution time and stage state. This information also includes substages and the query stage plan.
    */
  @js.native
  trait QueryStage extends js.Object {
    var ExecutionTime: js.UndefOr[Double]
    var InputBytes: js.UndefOr[Double]
    var InputRows: js.UndefOr[Double]
    var OutputBytes: js.UndefOr[Double]
    var OutputRows: js.UndefOr[Double]
    var QueryStagePlan: js.UndefOr[QueryStagePlanNode]
    var StageId: js.UndefOr[Double]
    var State: js.UndefOr[String]
    var SubStages: js.UndefOr[QueryStages]
  }

  object QueryStage {
    @inline
    def apply(
        ExecutionTime: js.UndefOr[Double] = js.undefined,
        InputBytes: js.UndefOr[Double] = js.undefined,
        InputRows: js.UndefOr[Double] = js.undefined,
        OutputBytes: js.UndefOr[Double] = js.undefined,
        OutputRows: js.UndefOr[Double] = js.undefined,
        QueryStagePlan: js.UndefOr[QueryStagePlanNode] = js.undefined,
        StageId: js.UndefOr[Double] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        SubStages: js.UndefOr[QueryStages] = js.undefined
    ): QueryStage = {
      val __obj = js.Dynamic.literal()
      ExecutionTime.foreach(__v => __obj.updateDynamic("ExecutionTime")(__v.asInstanceOf[js.Any]))
      InputBytes.foreach(__v => __obj.updateDynamic("InputBytes")(__v.asInstanceOf[js.Any]))
      InputRows.foreach(__v => __obj.updateDynamic("InputRows")(__v.asInstanceOf[js.Any]))
      OutputBytes.foreach(__v => __obj.updateDynamic("OutputBytes")(__v.asInstanceOf[js.Any]))
      OutputRows.foreach(__v => __obj.updateDynamic("OutputRows")(__v.asInstanceOf[js.Any]))
      QueryStagePlan.foreach(__v => __obj.updateDynamic("QueryStagePlan")(__v.asInstanceOf[js.Any]))
      StageId.foreach(__v => __obj.updateDynamic("StageId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      SubStages.foreach(__v => __obj.updateDynamic("SubStages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStage]
    }
  }

  /** Stage plan information such as name, identifier, sub plans, and remote sources.
    */
  @js.native
  trait QueryStagePlanNode extends js.Object {
    var Children: js.UndefOr[QueryStagePlanNodes]
    var Identifier: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var RemoteSources: js.UndefOr[StringList]
  }

  object QueryStagePlanNode {
    @inline
    def apply(
        Children: js.UndefOr[QueryStagePlanNodes] = js.undefined,
        Identifier: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        RemoteSources: js.UndefOr[StringList] = js.undefined
    ): QueryStagePlanNode = {
      val __obj = js.Dynamic.literal()
      Children.foreach(__v => __obj.updateDynamic("Children")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RemoteSources.foreach(__v => __obj.updateDynamic("RemoteSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStagePlanNode]
    }
  }

  /** The location in Amazon S3 where query results are stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the workgroup settings.
    */
  @js.native
  trait ResultConfiguration extends js.Object {
    var AclConfiguration: js.UndefOr[AclConfiguration]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var ExpectedBucketOwner: js.UndefOr[AwsAccountId]
    var OutputLocation: js.UndefOr[ResultOutputLocation]
  }

  object ResultConfiguration {
    @inline
    def apply(
        AclConfiguration: js.UndefOr[AclConfiguration] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        ExpectedBucketOwner: js.UndefOr[AwsAccountId] = js.undefined,
        OutputLocation: js.UndefOr[ResultOutputLocation] = js.undefined
    ): ResultConfiguration = {
      val __obj = js.Dynamic.literal()
      AclConfiguration.foreach(__v => __obj.updateDynamic("AclConfiguration")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      ExpectedBucketOwner.foreach(__v => __obj.updateDynamic("ExpectedBucketOwner")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultConfiguration]
    }
  }

  /** The information about the updates in the query results, such as output location and encryption configuration for the query results.
    */
  @js.native
  trait ResultConfigurationUpdates extends js.Object {
    var AclConfiguration: js.UndefOr[AclConfiguration]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var ExpectedBucketOwner: js.UndefOr[AwsAccountId]
    var OutputLocation: js.UndefOr[ResultOutputLocation]
    var RemoveAclConfiguration: js.UndefOr[BoxedBoolean]
    var RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean]
    var RemoveExpectedBucketOwner: js.UndefOr[BoxedBoolean]
    var RemoveOutputLocation: js.UndefOr[BoxedBoolean]
  }

  object ResultConfigurationUpdates {
    @inline
    def apply(
        AclConfiguration: js.UndefOr[AclConfiguration] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        ExpectedBucketOwner: js.UndefOr[AwsAccountId] = js.undefined,
        OutputLocation: js.UndefOr[ResultOutputLocation] = js.undefined,
        RemoveAclConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveExpectedBucketOwner: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.undefined
    ): ResultConfigurationUpdates = {
      val __obj = js.Dynamic.literal()
      AclConfiguration.foreach(__v => __obj.updateDynamic("AclConfiguration")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      ExpectedBucketOwner.foreach(__v => __obj.updateDynamic("ExpectedBucketOwner")(__v.asInstanceOf[js.Any]))
      OutputLocation.foreach(__v => __obj.updateDynamic("OutputLocation")(__v.asInstanceOf[js.Any]))
      RemoveAclConfiguration.foreach(__v => __obj.updateDynamic("RemoveAclConfiguration")(__v.asInstanceOf[js.Any]))
      RemoveEncryptionConfiguration.foreach(__v => __obj.updateDynamic("RemoveEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      RemoveExpectedBucketOwner.foreach(__v => __obj.updateDynamic("RemoveExpectedBucketOwner")(__v.asInstanceOf[js.Any]))
      RemoveOutputLocation.foreach(__v => __obj.updateDynamic("RemoveOutputLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultConfigurationUpdates]
    }
  }

  /** Specifies whether previous query results are reused, and if so, their maximum age.
    */
  @js.native
  trait ResultReuseByAgeConfiguration extends js.Object {
    var Enabled: Boolean
    var MaxAgeInMinutes: js.UndefOr[Age]
  }

  object ResultReuseByAgeConfiguration {
    @inline
    def apply(
        Enabled: Boolean,
        MaxAgeInMinutes: js.UndefOr[Age] = js.undefined
    ): ResultReuseByAgeConfiguration = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      MaxAgeInMinutes.foreach(__v => __obj.updateDynamic("MaxAgeInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultReuseByAgeConfiguration]
    }
  }

  /** Specifies the query result reuse behavior for the query.
    */
  @js.native
  trait ResultReuseConfiguration extends js.Object {
    var ResultReuseByAgeConfiguration: js.UndefOr[ResultReuseByAgeConfiguration]
  }

  object ResultReuseConfiguration {
    @inline
    def apply(
        ResultReuseByAgeConfiguration: js.UndefOr[ResultReuseByAgeConfiguration] = js.undefined
    ): ResultReuseConfiguration = {
      val __obj = js.Dynamic.literal()
      ResultReuseByAgeConfiguration.foreach(__v => __obj.updateDynamic("ResultReuseByAgeConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultReuseConfiguration]
    }
  }

  /** Contains information about whether the result of a previous query was reused.
    */
  @js.native
  trait ResultReuseInformation extends js.Object {
    var ReusedPreviousResult: Boolean
  }

  object ResultReuseInformation {
    @inline
    def apply(
        ReusedPreviousResult: Boolean
    ): ResultReuseInformation = {
      val __obj = js.Dynamic.literal(
        "ReusedPreviousResult" -> ReusedPreviousResult.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResultReuseInformation]
    }
  }

  /** The metadata and rows that make up a query result set. The metadata describes the column structure and data types. To return a <code>ResultSet</code> object, use <a>GetQueryResults</a>.
    */
  @js.native
  trait ResultSet extends js.Object {
    var ResultSetMetadata: js.UndefOr[ResultSetMetadata]
    var Rows: js.UndefOr[RowList]
  }

  object ResultSet {
    @inline
    def apply(
        ResultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined,
        Rows: js.UndefOr[RowList] = js.undefined
    ): ResultSet = {
      val __obj = js.Dynamic.literal()
      ResultSetMetadata.foreach(__v => __obj.updateDynamic("ResultSetMetadata")(__v.asInstanceOf[js.Any]))
      Rows.foreach(__v => __obj.updateDynamic("Rows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultSet]
    }
  }

  /** The metadata that describes the column structure and data types of a table of query results. To return a <code>ResultSetMetadata</code> object, use <a>GetQueryResults</a>.
    */
  @js.native
  trait ResultSetMetadata extends js.Object {
    var ColumnInfo: js.UndefOr[ColumnInfoList]
  }

  object ResultSetMetadata {
    @inline
    def apply(
        ColumnInfo: js.UndefOr[ColumnInfoList] = js.undefined
    ): ResultSetMetadata = {
      val __obj = js.Dynamic.literal()
      ColumnInfo.foreach(__v => __obj.updateDynamic("ColumnInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultSetMetadata]
    }
  }

  /** The rows that make up a query result table.
    */
  @js.native
  trait Row extends js.Object {
    var Data: js.UndefOr[datumList]
  }

  object Row {
    @inline
    def apply(
        Data: js.UndefOr[datumList] = js.undefined
    ): Row = {
      val __obj = js.Dynamic.literal()
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Row]
    }
  }

  /** Contains session configuration information.
    */
  @js.native
  trait SessionConfiguration extends js.Object {
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var ExecutionRole: js.UndefOr[RoleArn]
    var IdleTimeoutSeconds: js.UndefOr[Double]
    var WorkingDirectory: js.UndefOr[ResultOutputLocation]
  }

  object SessionConfiguration {
    @inline
    def apply(
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        ExecutionRole: js.UndefOr[RoleArn] = js.undefined,
        IdleTimeoutSeconds: js.UndefOr[Double] = js.undefined,
        WorkingDirectory: js.UndefOr[ResultOutputLocation] = js.undefined
    ): SessionConfiguration = {
      val __obj = js.Dynamic.literal()
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      ExecutionRole.foreach(__v => __obj.updateDynamic("ExecutionRole")(__v.asInstanceOf[js.Any]))
      IdleTimeoutSeconds.foreach(__v => __obj.updateDynamic("IdleTimeoutSeconds")(__v.asInstanceOf[js.Any]))
      WorkingDirectory.foreach(__v => __obj.updateDynamic("WorkingDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionConfiguration]
    }
  }

  /** Contains statistics for a notebook session.
    */
  @js.native
  trait SessionStatistics extends js.Object {
    var DpuExecutionInMillis: js.UndefOr[Double]
  }

  object SessionStatistics {
    @inline
    def apply(
        DpuExecutionInMillis: js.UndefOr[Double] = js.undefined
    ): SessionStatistics = {
      val __obj = js.Dynamic.literal()
      DpuExecutionInMillis.foreach(__v => __obj.updateDynamic("DpuExecutionInMillis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionStatistics]
    }
  }

  /** Contains information about the status of a notebook session.
    */
  @js.native
  trait SessionStatus extends js.Object {
    var EndDateTime: js.UndefOr[Date]
    var IdleSinceDateTime: js.UndefOr[Date]
    var LastModifiedDateTime: js.UndefOr[Date]
    var StartDateTime: js.UndefOr[Date]
    var State: js.UndefOr[SessionState]
    var StateChangeReason: js.UndefOr[DescriptionString]
  }

  object SessionStatus {
    @inline
    def apply(
        EndDateTime: js.UndefOr[Date] = js.undefined,
        IdleSinceDateTime: js.UndefOr[Date] = js.undefined,
        LastModifiedDateTime: js.UndefOr[Date] = js.undefined,
        StartDateTime: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[SessionState] = js.undefined,
        StateChangeReason: js.UndefOr[DescriptionString] = js.undefined
    ): SessionStatus = {
      val __obj = js.Dynamic.literal()
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      IdleSinceDateTime.foreach(__v => __obj.updateDynamic("IdleSinceDateTime")(__v.asInstanceOf[js.Any]))
      LastModifiedDateTime.foreach(__v => __obj.updateDynamic("LastModifiedDateTime")(__v.asInstanceOf[js.Any]))
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateChangeReason.foreach(__v => __obj.updateDynamic("StateChangeReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionStatus]
    }
  }

  /** Contains summary information about a notebook session.
    */
  @js.native
  trait SessionSummary extends js.Object {
    var Description: js.UndefOr[DescriptionString]
    var EngineVersion: js.UndefOr[EngineVersion]
    var NotebookVersion: js.UndefOr[NameString]
    var SessionId: js.UndefOr[SessionId]
    var Status: js.UndefOr[SessionStatus]
  }

  object SessionSummary {
    @inline
    def apply(
        Description: js.UndefOr[DescriptionString] = js.undefined,
        EngineVersion: js.UndefOr[EngineVersion] = js.undefined,
        NotebookVersion: js.UndefOr[NameString] = js.undefined,
        SessionId: js.UndefOr[SessionId] = js.undefined,
        Status: js.UndefOr[SessionStatus] = js.undefined
    ): SessionSummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      NotebookVersion.foreach(__v => __obj.updateDynamic("NotebookVersion")(__v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionSummary]
    }
  }

  @js.native
  trait StartCalculationExecutionRequest extends js.Object {
    var SessionId: SessionId
    var CalculationConfiguration: js.UndefOr[CalculationConfiguration]
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var CodeBlock: js.UndefOr[CodeBlock]
    var Description: js.UndefOr[DescriptionString]
  }

  object StartCalculationExecutionRequest {
    @inline
    def apply(
        SessionId: SessionId,
        CalculationConfiguration: js.UndefOr[CalculationConfiguration] = js.undefined,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        CodeBlock: js.UndefOr[CodeBlock] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined
    ): StartCalculationExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )

      CalculationConfiguration.foreach(__v => __obj.updateDynamic("CalculationConfiguration")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      CodeBlock.foreach(__v => __obj.updateDynamic("CodeBlock")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartCalculationExecutionRequest]
    }
  }

  @js.native
  trait StartCalculationExecutionResponse extends js.Object {
    var CalculationExecutionId: js.UndefOr[CalculationExecutionId]
    var State: js.UndefOr[CalculationExecutionState]
  }

  object StartCalculationExecutionResponse {
    @inline
    def apply(
        CalculationExecutionId: js.UndefOr[CalculationExecutionId] = js.undefined,
        State: js.UndefOr[CalculationExecutionState] = js.undefined
    ): StartCalculationExecutionResponse = {
      val __obj = js.Dynamic.literal()
      CalculationExecutionId.foreach(__v => __obj.updateDynamic("CalculationExecutionId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartCalculationExecutionResponse]
    }
  }

  @js.native
  trait StartQueryExecutionInput extends js.Object {
    var QueryString: QueryString
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var ExecutionParameters: js.UndefOr[ExecutionParameters]
    var QueryExecutionContext: js.UndefOr[QueryExecutionContext]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
    var ResultReuseConfiguration: js.UndefOr[ResultReuseConfiguration]
    var WorkGroup: js.UndefOr[WorkGroupName]
  }

  object StartQueryExecutionInput {
    @inline
    def apply(
        QueryString: QueryString,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        ExecutionParameters: js.UndefOr[ExecutionParameters] = js.undefined,
        QueryExecutionContext: js.UndefOr[QueryExecutionContext] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined,
        ResultReuseConfiguration: js.UndefOr[ResultReuseConfiguration] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
    ): StartQueryExecutionInput = {
      val __obj = js.Dynamic.literal(
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      ExecutionParameters.foreach(__v => __obj.updateDynamic("ExecutionParameters")(__v.asInstanceOf[js.Any]))
      QueryExecutionContext.foreach(__v => __obj.updateDynamic("QueryExecutionContext")(__v.asInstanceOf[js.Any]))
      ResultConfiguration.foreach(__v => __obj.updateDynamic("ResultConfiguration")(__v.asInstanceOf[js.Any]))
      ResultReuseConfiguration.foreach(__v => __obj.updateDynamic("ResultReuseConfiguration")(__v.asInstanceOf[js.Any]))
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartQueryExecutionInput]
    }
  }

  @js.native
  trait StartQueryExecutionOutput extends js.Object {
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object StartQueryExecutionOutput {
    @inline
    def apply(
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
    ): StartQueryExecutionOutput = {
      val __obj = js.Dynamic.literal()
      QueryExecutionId.foreach(__v => __obj.updateDynamic("QueryExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartQueryExecutionOutput]
    }
  }

  @js.native
  trait StartSessionRequest extends js.Object {
    var EngineConfiguration: EngineConfiguration
    var WorkGroup: WorkGroupName
    var ClientRequestToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[DescriptionString]
    var NotebookVersion: js.UndefOr[NameString]
    var SessionIdleTimeoutInMinutes: js.UndefOr[SessionIdleTimeoutInMinutes]
  }

  object StartSessionRequest {
    @inline
    def apply(
        EngineConfiguration: EngineConfiguration,
        WorkGroup: WorkGroupName,
        ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        NotebookVersion: js.UndefOr[NameString] = js.undefined,
        SessionIdleTimeoutInMinutes: js.UndefOr[SessionIdleTimeoutInMinutes] = js.undefined
    ): StartSessionRequest = {
      val __obj = js.Dynamic.literal(
        "EngineConfiguration" -> EngineConfiguration.asInstanceOf[js.Any],
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NotebookVersion.foreach(__v => __obj.updateDynamic("NotebookVersion")(__v.asInstanceOf[js.Any]))
      SessionIdleTimeoutInMinutes.foreach(__v => __obj.updateDynamic("SessionIdleTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSessionRequest]
    }
  }

  @js.native
  trait StartSessionResponse extends js.Object {
    var SessionId: js.UndefOr[SessionId]
    var State: js.UndefOr[SessionState]
  }

  object StartSessionResponse {
    @inline
    def apply(
        SessionId: js.UndefOr[SessionId] = js.undefined,
        State: js.UndefOr[SessionState] = js.undefined
    ): StartSessionResponse = {
      val __obj = js.Dynamic.literal()
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSessionResponse]
    }
  }

  @js.native
  trait StopCalculationExecutionRequest extends js.Object {
    var CalculationExecutionId: CalculationExecutionId
  }

  object StopCalculationExecutionRequest {
    @inline
    def apply(
        CalculationExecutionId: CalculationExecutionId
    ): StopCalculationExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "CalculationExecutionId" -> CalculationExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopCalculationExecutionRequest]
    }
  }

  @js.native
  trait StopCalculationExecutionResponse extends js.Object {
    var State: js.UndefOr[CalculationExecutionState]
  }

  object StopCalculationExecutionResponse {
    @inline
    def apply(
        State: js.UndefOr[CalculationExecutionState] = js.undefined
    ): StopCalculationExecutionResponse = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopCalculationExecutionResponse]
    }
  }

  @js.native
  trait StopQueryExecutionInput extends js.Object {
    var QueryExecutionId: QueryExecutionId
  }

  object StopQueryExecutionInput {
    @inline
    def apply(
        QueryExecutionId: QueryExecutionId
    ): StopQueryExecutionInput = {
      val __obj = js.Dynamic.literal(
        "QueryExecutionId" -> QueryExecutionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopQueryExecutionInput]
    }
  }

  @js.native
  trait StopQueryExecutionOutput extends js.Object

  object StopQueryExecutionOutput {
    @inline
    def apply(): StopQueryExecutionOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopQueryExecutionOutput]
    }
  }

  /** Contains metadata for a table.
    */
  @js.native
  trait TableMetadata extends js.Object {
    var Name: NameString
    var Columns: js.UndefOr[ColumnList]
    var CreateTime: js.UndefOr[Timestamp]
    var LastAccessTime: js.UndefOr[Timestamp]
    var Parameters: js.UndefOr[ParametersMap]
    var PartitionKeys: js.UndefOr[ColumnList]
    var TableType: js.UndefOr[TableTypeString]
  }

  object TableMetadata {
    @inline
    def apply(
        Name: NameString,
        Columns: js.UndefOr[ColumnList] = js.undefined,
        CreateTime: js.UndefOr[Timestamp] = js.undefined,
        LastAccessTime: js.UndefOr[Timestamp] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined,
        PartitionKeys: js.UndefOr[ColumnList] = js.undefined,
        TableType: js.UndefOr[TableTypeString] = js.undefined
    ): TableMetadata = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Columns.foreach(__v => __obj.updateDynamic("Columns")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      LastAccessTime.foreach(__v => __obj.updateDynamic("LastAccessTime")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      PartitionKeys.foreach(__v => __obj.updateDynamic("PartitionKeys")(__v.asInstanceOf[js.Any]))
      TableType.foreach(__v => __obj.updateDynamic("TableType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableMetadata]
    }
  }

  /** A label that you assign to a resource. In Athena, a resource can be a workgroup or data catalog. Each tag consists of a key and an optional value, both of which you define. For example, you can use tags to categorize Athena workgroups or data catalogs by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups or data catalogs in your account. For best practices, see [[https://aws.amazon.com/answers/account-management/aws-tagging-strategies/|Tagging Best Practices]]. Tag keys can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters. Tags can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate them by commas.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait TerminateSessionRequest extends js.Object {
    var SessionId: SessionId
  }

  object TerminateSessionRequest {
    @inline
    def apply(
        SessionId: SessionId
    ): TerminateSessionRequest = {
      val __obj = js.Dynamic.literal(
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TerminateSessionRequest]
    }
  }

  @js.native
  trait TerminateSessionResponse extends js.Object {
    var State: js.UndefOr[SessionState]
  }

  object TerminateSessionResponse {
    @inline
    def apply(
        State: js.UndefOr[SessionState] = js.undefined
    ): TerminateSessionResponse = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateSessionResponse]
    }
  }

  /** Information about a named query ID that could not be processed.
    */
  @js.native
  trait UnprocessedNamedQueryId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var NamedQueryId: js.UndefOr[NamedQueryId]
  }

  object UnprocessedNamedQueryId {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
    ): UnprocessedNamedQueryId = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      NamedQueryId.foreach(__v => __obj.updateDynamic("NamedQueryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedNamedQueryId]
    }
  }

  /** The name of a prepared statement that could not be returned.
    */
  @js.native
  trait UnprocessedPreparedStatementName extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var StatementName: js.UndefOr[StatementName]
  }

  object UnprocessedPreparedStatementName {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        StatementName: js.UndefOr[StatementName] = js.undefined
    ): UnprocessedPreparedStatementName = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      StatementName.foreach(__v => __obj.updateDynamic("StatementName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedPreparedStatementName]
    }
  }

  /** Describes a query execution that failed to process.
    */
  @js.native
  trait UnprocessedQueryExecutionId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var QueryExecutionId: js.UndefOr[QueryExecutionId]
  }

  object UnprocessedQueryExecutionId {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
    ): UnprocessedQueryExecutionId = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      QueryExecutionId.foreach(__v => __obj.updateDynamic("QueryExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedQueryExecutionId]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateDataCatalogInput extends js.Object {
    var Name: CatalogNameString
    var Type: DataCatalogType
    var Description: js.UndefOr[DescriptionString]
    var Parameters: js.UndefOr[ParametersMap]
  }

  object UpdateDataCatalogInput {
    @inline
    def apply(
        Name: CatalogNameString,
        Type: DataCatalogType,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Parameters: js.UndefOr[ParametersMap] = js.undefined
    ): UpdateDataCatalogInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataCatalogInput]
    }
  }

  @js.native
  trait UpdateDataCatalogOutput extends js.Object

  object UpdateDataCatalogOutput {
    @inline
    def apply(): UpdateDataCatalogOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDataCatalogOutput]
    }
  }

  @js.native
  trait UpdateNamedQueryInput extends js.Object {
    var Name: NameString
    var NamedQueryId: NamedQueryId
    var QueryString: QueryString
    var Description: js.UndefOr[NamedQueryDescriptionString]
  }

  object UpdateNamedQueryInput {
    @inline
    def apply(
        Name: NameString,
        NamedQueryId: NamedQueryId,
        QueryString: QueryString,
        Description: js.UndefOr[NamedQueryDescriptionString] = js.undefined
    ): UpdateNamedQueryInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "NamedQueryId" -> NamedQueryId.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNamedQueryInput]
    }
  }

  @js.native
  trait UpdateNamedQueryOutput extends js.Object

  object UpdateNamedQueryOutput {
    @inline
    def apply(): UpdateNamedQueryOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNamedQueryOutput]
    }
  }

  @js.native
  trait UpdateNotebookInput extends js.Object {
    var NotebookId: NotebookId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Payload: js.UndefOr[Payload]
    var SessionId: js.UndefOr[SessionId]
    var Type: js.UndefOr[NotebookType]
  }

  object UpdateNotebookInput {
    @inline
    def apply(
        NotebookId: NotebookId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Payload: js.UndefOr[Payload] = js.undefined,
        SessionId: js.UndefOr[SessionId] = js.undefined,
        Type: js.UndefOr[NotebookType] = js.undefined
    ): UpdateNotebookInput = {
      val __obj = js.Dynamic.literal(
        "NotebookId" -> NotebookId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.updateDynamic("Payload")(__v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNotebookInput]
    }
  }

  @js.native
  trait UpdateNotebookMetadataInput extends js.Object {
    var Name: NotebookName
    var NotebookId: NotebookId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object UpdateNotebookMetadataInput {
    @inline
    def apply(
        Name: NotebookName,
        NotebookId: NotebookId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): UpdateNotebookMetadataInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "NotebookId" -> NotebookId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNotebookMetadataInput]
    }
  }

  @js.native
  trait UpdateNotebookMetadataOutput extends js.Object

  object UpdateNotebookMetadataOutput {
    @inline
    def apply(): UpdateNotebookMetadataOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNotebookMetadataOutput]
    }
  }

  @js.native
  trait UpdateNotebookOutput extends js.Object

  object UpdateNotebookOutput {
    @inline
    def apply(): UpdateNotebookOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNotebookOutput]
    }
  }

  @js.native
  trait UpdatePreparedStatementInput extends js.Object {
    var QueryStatement: QueryString
    var StatementName: StatementName
    var WorkGroup: WorkGroupName
    var Description: js.UndefOr[DescriptionString]
  }

  object UpdatePreparedStatementInput {
    @inline
    def apply(
        QueryStatement: QueryString,
        StatementName: StatementName,
        WorkGroup: WorkGroupName,
        Description: js.UndefOr[DescriptionString] = js.undefined
    ): UpdatePreparedStatementInput = {
      val __obj = js.Dynamic.literal(
        "QueryStatement" -> QueryStatement.asInstanceOf[js.Any],
        "StatementName" -> StatementName.asInstanceOf[js.Any],
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePreparedStatementInput]
    }
  }

  @js.native
  trait UpdatePreparedStatementOutput extends js.Object

  object UpdatePreparedStatementOutput {
    @inline
    def apply(): UpdatePreparedStatementOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdatePreparedStatementOutput]
    }
  }

  @js.native
  trait UpdateWorkGroupInput extends js.Object {
    var WorkGroup: WorkGroupName
    var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var State: js.UndefOr[WorkGroupState]
  }

  object UpdateWorkGroupInput {
    @inline
    def apply(
        WorkGroup: WorkGroupName,
        ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): UpdateWorkGroupInput = {
      val __obj = js.Dynamic.literal(
        "WorkGroup" -> WorkGroup.asInstanceOf[js.Any]
      )

      ConfigurationUpdates.foreach(__v => __obj.updateDynamic("ConfigurationUpdates")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkGroupInput]
    }
  }

  @js.native
  trait UpdateWorkGroupOutput extends js.Object

  object UpdateWorkGroupOutput {
    @inline
    def apply(): UpdateWorkGroupOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateWorkGroupOutput]
    }
  }

  /** A workgroup, which contains a name, description, creation time, state, and other configuration, listed under Configuration. Each workgroup enables you to isolate queries for you or your group of users from other queries in the same account, to configure the query results location and the encryption configuration (known as workgroup settings), to enable sending query metrics to Amazon CloudWatch, and to establish per-query data usage control limits for all queries in a workgroup. The workgroup settings override is specified in <code>EnforceWorkGroupConfiguration</code> (true/false) in the <code>WorkGroupConfiguration</code>. See [[WorkGroupConfiguration.EnforceWorkGroupConfiguration]].
    */
  @js.native
  trait WorkGroup extends js.Object {
    var Name: WorkGroupName
    var Configuration: js.UndefOr[WorkGroupConfiguration]
    var CreationTime: js.UndefOr[Date]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var State: js.UndefOr[WorkGroupState]
  }

  object WorkGroup {
    @inline
    def apply(
        Name: WorkGroupName,
        Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): WorkGroup = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkGroup]
    }
  }

  /** The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup and whether workgroup settings override query settings, and the data usage limits for the amount of data scanned per query or per workgroup. The workgroup settings override is specified in <code>EnforceWorkGroupConfiguration</code> (true/false) in the <code>WorkGroupConfiguration</code>. See EnforceWorkGroupConfiguration.
    */
  @js.native
  trait WorkGroupConfiguration extends js.Object {
    var AdditionalConfiguration: js.UndefOr[NameString]
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue]
    var CustomerContentEncryptionConfiguration: js.UndefOr[CustomerContentEncryptionConfiguration]
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean]
    var EngineVersion: js.UndefOr[EngineVersion]
    var ExecutionRole: js.UndefOr[RoleArn]
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean]
    var RequesterPaysEnabled: js.UndefOr[BoxedBoolean]
    var ResultConfiguration: js.UndefOr[ResultConfiguration]
  }

  object WorkGroupConfiguration {
    @inline
    def apply(
        AdditionalConfiguration: js.UndefOr[NameString] = js.undefined,
        BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
        CustomerContentEncryptionConfiguration: js.UndefOr[CustomerContentEncryptionConfiguration] = js.undefined,
        EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        EngineVersion: js.UndefOr[EngineVersion] = js.undefined,
        ExecutionRole: js.UndefOr[RoleArn] = js.undefined,
        PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined
    ): WorkGroupConfiguration = {
      val __obj = js.Dynamic.literal()
      AdditionalConfiguration.foreach(__v => __obj.updateDynamic("AdditionalConfiguration")(__v.asInstanceOf[js.Any]))
      BytesScannedCutoffPerQuery.foreach(__v => __obj.updateDynamic("BytesScannedCutoffPerQuery")(__v.asInstanceOf[js.Any]))
      CustomerContentEncryptionConfiguration.foreach(__v => __obj.updateDynamic("CustomerContentEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      EnforceWorkGroupConfiguration.foreach(__v => __obj.updateDynamic("EnforceWorkGroupConfiguration")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      ExecutionRole.foreach(__v => __obj.updateDynamic("ExecutionRole")(__v.asInstanceOf[js.Any]))
      PublishCloudWatchMetricsEnabled.foreach(__v => __obj.updateDynamic("PublishCloudWatchMetricsEnabled")(__v.asInstanceOf[js.Any]))
      RequesterPaysEnabled.foreach(__v => __obj.updateDynamic("RequesterPaysEnabled")(__v.asInstanceOf[js.Any]))
      ResultConfiguration.foreach(__v => __obj.updateDynamic("ResultConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkGroupConfiguration]
    }
  }

  /** The configuration information that will be updated for this workgroup, which includes the location in Amazon S3 where query results are stored, the encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, whether the workgroup settings override the client-side settings, and the data usage limit for the amount of bytes scanned per query, if it is specified.
    */
  @js.native
  trait WorkGroupConfigurationUpdates extends js.Object {
    var AdditionalConfiguration: js.UndefOr[NameString]
    var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue]
    var CustomerContentEncryptionConfiguration: js.UndefOr[CustomerContentEncryptionConfiguration]
    var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean]
    var EngineVersion: js.UndefOr[EngineVersion]
    var ExecutionRole: js.UndefOr[RoleArn]
    var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean]
    var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean]
    var RemoveCustomerContentEncryptionConfiguration: js.UndefOr[BoxedBoolean]
    var RequesterPaysEnabled: js.UndefOr[BoxedBoolean]
    var ResultConfigurationUpdates: js.UndefOr[ResultConfigurationUpdates]
  }

  object WorkGroupConfigurationUpdates {
    @inline
    def apply(
        AdditionalConfiguration: js.UndefOr[NameString] = js.undefined,
        BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
        CustomerContentEncryptionConfiguration: js.UndefOr[CustomerContentEncryptionConfiguration] = js.undefined,
        EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        EngineVersion: js.UndefOr[EngineVersion] = js.undefined,
        ExecutionRole: js.UndefOr[RoleArn] = js.undefined,
        PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.undefined,
        RemoveCustomerContentEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
        RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
        ResultConfigurationUpdates: js.UndefOr[ResultConfigurationUpdates] = js.undefined
    ): WorkGroupConfigurationUpdates = {
      val __obj = js.Dynamic.literal()
      AdditionalConfiguration.foreach(__v => __obj.updateDynamic("AdditionalConfiguration")(__v.asInstanceOf[js.Any]))
      BytesScannedCutoffPerQuery.foreach(__v => __obj.updateDynamic("BytesScannedCutoffPerQuery")(__v.asInstanceOf[js.Any]))
      CustomerContentEncryptionConfiguration.foreach(__v => __obj.updateDynamic("CustomerContentEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      EnforceWorkGroupConfiguration.foreach(__v => __obj.updateDynamic("EnforceWorkGroupConfiguration")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      ExecutionRole.foreach(__v => __obj.updateDynamic("ExecutionRole")(__v.asInstanceOf[js.Any]))
      PublishCloudWatchMetricsEnabled.foreach(__v => __obj.updateDynamic("PublishCloudWatchMetricsEnabled")(__v.asInstanceOf[js.Any]))
      RemoveBytesScannedCutoffPerQuery.foreach(__v => __obj.updateDynamic("RemoveBytesScannedCutoffPerQuery")(__v.asInstanceOf[js.Any]))
      RemoveCustomerContentEncryptionConfiguration.foreach(__v => __obj.updateDynamic("RemoveCustomerContentEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      RequesterPaysEnabled.foreach(__v => __obj.updateDynamic("RequesterPaysEnabled")(__v.asInstanceOf[js.Any]))
      ResultConfigurationUpdates.foreach(__v => __obj.updateDynamic("ResultConfigurationUpdates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkGroupConfigurationUpdates]
    }
  }

  /** The summary information for the workgroup, which includes its name, state, description, and the date and time it was created.
    */
  @js.native
  trait WorkGroupSummary extends js.Object {
    var CreationTime: js.UndefOr[Date]
    var Description: js.UndefOr[WorkGroupDescriptionString]
    var EngineVersion: js.UndefOr[EngineVersion]
    var Name: js.UndefOr[WorkGroupName]
    var State: js.UndefOr[WorkGroupState]
  }

  object WorkGroupSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Date] = js.undefined,
        Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined,
        EngineVersion: js.UndefOr[EngineVersion] = js.undefined,
        Name: js.UndefOr[WorkGroupName] = js.undefined,
        State: js.UndefOr[WorkGroupState] = js.undefined
    ): WorkGroupSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkGroupSummary]
    }
  }
}
