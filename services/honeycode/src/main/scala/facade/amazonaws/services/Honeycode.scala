package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object honeycode {
  type AwsUserArn = String
  type BatchErrorMessage = String
  type BatchItemId = String
  type Cells = js.Array[Cell]
  type ClientRequestToken = String
  type CreateRowDataList = js.Array[CreateRowData]
  type CreatedRowsMap = js.Dictionary[RowId]
  type DataItems = js.Array[DataItem]
  type DelimitedTextDelimiter = String
  type Email = String
  type Fact = String
  type FailedBatchItems = js.Array[FailedBatchItem]
  type FormattedValue = String
  type Formula = String
  type HasHeaderRow = Boolean
  type IgnoreEmptyRows = Boolean
  type ImportColumnMap = js.Dictionary[SourceDataColumnProperties]
  type JobId = String
  type MaxResults = Int
  type Name = String
  type PaginationToken = String
  type RawValue = String
  type ResourceId = String
  type ResourceIds = js.Array[ResourceId]
  type ResultHeader = js.Array[ColumnMetadata]
  type ResultRows = js.Array[ResultRow]
  type ResultSetMap = js.Dictionary[ResultSet]
  type RowDataInput = js.Dictionary[CellInput]
  type RowId = String
  type RowIdList = js.Array[RowId]
  type SecureURL = String
  type SourceDataColumnIndex = Int
  type TableColumnName = String
  type TableColumns = js.Array[TableColumn]
  type TableDataImportJobMessage = String
  type TableName = String
  type TableRows = js.Array[TableRow]
  type Tables = js.Array[Table]
  type TimestampInMillis = js.Date
  type UpdateRowDataList = js.Array[UpdateRowData]
  type UpsertRowDataList = js.Array[UpsertRowData]
  type UpsertRowsResultMap = js.Dictionary[UpsertRowsResult]
  type VariableName = String
  type VariableValueMap = js.Dictionary[VariableValue]
  type WorkbookCursor = Double

  final class HoneycodeOps(private val service: Honeycode) extends AnyVal {

    @inline def batchCreateTableRowsFuture(params: BatchCreateTableRowsRequest): Future[BatchCreateTableRowsResult] = service.batchCreateTableRows(params).promise().toFuture
    @inline def batchDeleteTableRowsFuture(params: BatchDeleteTableRowsRequest): Future[BatchDeleteTableRowsResult] = service.batchDeleteTableRows(params).promise().toFuture
    @inline def batchUpdateTableRowsFuture(params: BatchUpdateTableRowsRequest): Future[BatchUpdateTableRowsResult] = service.batchUpdateTableRows(params).promise().toFuture
    @inline def batchUpsertTableRowsFuture(params: BatchUpsertTableRowsRequest): Future[BatchUpsertTableRowsResult] = service.batchUpsertTableRows(params).promise().toFuture
    @inline def describeTableDataImportJobFuture(params: DescribeTableDataImportJobRequest): Future[DescribeTableDataImportJobResult] = service.describeTableDataImportJob(params).promise().toFuture
    @inline def getScreenDataFuture(params: GetScreenDataRequest): Future[GetScreenDataResult] = service.getScreenData(params).promise().toFuture
    @inline def invokeScreenAutomationFuture(params: InvokeScreenAutomationRequest): Future[InvokeScreenAutomationResult] = service.invokeScreenAutomation(params).promise().toFuture
    @inline def listTableColumnsFuture(params: ListTableColumnsRequest): Future[ListTableColumnsResult] = service.listTableColumns(params).promise().toFuture
    @inline def listTableRowsFuture(params: ListTableRowsRequest): Future[ListTableRowsResult] = service.listTableRows(params).promise().toFuture
    @inline def listTablesFuture(params: ListTablesRequest): Future[ListTablesResult] = service.listTables(params).promise().toFuture
    @inline def queryTableRowsFuture(params: QueryTableRowsRequest): Future[QueryTableRowsResult] = service.queryTableRows(params).promise().toFuture
    @inline def startTableDataImportJobFuture(params: StartTableDataImportJobRequest): Future[StartTableDataImportJobResult] = service.startTableDataImportJob(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/honeycode", JSImport.Namespace, "AWS.Honeycode")
  class Honeycode() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCreateTableRows(params: BatchCreateTableRowsRequest): Request[BatchCreateTableRowsResult] = js.native
    def batchDeleteTableRows(params: BatchDeleteTableRowsRequest): Request[BatchDeleteTableRowsResult] = js.native
    def batchUpdateTableRows(params: BatchUpdateTableRowsRequest): Request[BatchUpdateTableRowsResult] = js.native
    def batchUpsertTableRows(params: BatchUpsertTableRowsRequest): Request[BatchUpsertTableRowsResult] = js.native
    def describeTableDataImportJob(params: DescribeTableDataImportJobRequest): Request[DescribeTableDataImportJobResult] = js.native
    def getScreenData(params: GetScreenDataRequest): Request[GetScreenDataResult] = js.native
    def invokeScreenAutomation(params: InvokeScreenAutomationRequest): Request[InvokeScreenAutomationResult] = js.native
    def listTableColumns(params: ListTableColumnsRequest): Request[ListTableColumnsResult] = js.native
    def listTableRows(params: ListTableRowsRequest): Request[ListTableRowsResult] = js.native
    def listTables(params: ListTablesRequest): Request[ListTablesResult] = js.native
    def queryTableRows(params: QueryTableRowsRequest): Request[QueryTableRowsResult] = js.native
    def startTableDataImportJob(params: StartTableDataImportJobRequest): Request[StartTableDataImportJobResult] = js.native
  }
  object Honeycode {
    @inline implicit def toOps(service: Honeycode): HoneycodeOps = {
      new HoneycodeOps(service)
    }
  }

  @js.native
  trait BatchCreateTableRowsRequest extends js.Object {
    var rowsToCreate: CreateRowDataList
    var tableId: ResourceId
    var workbookId: ResourceId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object BatchCreateTableRowsRequest {
    @inline
    def apply(
        rowsToCreate: CreateRowDataList,
        tableId: ResourceId,
        workbookId: ResourceId,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): BatchCreateTableRowsRequest = {
      val __obj = js.Dynamic.literal(
        "rowsToCreate" -> rowsToCreate.asInstanceOf[js.Any],
        "tableId" -> tableId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateTableRowsRequest]
    }
  }

  @js.native
  trait BatchCreateTableRowsResult extends js.Object {
    var createdRows: CreatedRowsMap
    var workbookCursor: WorkbookCursor
    var failedBatchItems: js.UndefOr[FailedBatchItems]
  }

  object BatchCreateTableRowsResult {
    @inline
    def apply(
        createdRows: CreatedRowsMap,
        workbookCursor: WorkbookCursor,
        failedBatchItems: js.UndefOr[FailedBatchItems] = js.undefined
    ): BatchCreateTableRowsResult = {
      val __obj = js.Dynamic.literal(
        "createdRows" -> createdRows.asInstanceOf[js.Any],
        "workbookCursor" -> workbookCursor.asInstanceOf[js.Any]
      )

      failedBatchItems.foreach(__v => __obj.updateDynamic("failedBatchItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateTableRowsResult]
    }
  }

  @js.native
  trait BatchDeleteTableRowsRequest extends js.Object {
    var rowIds: RowIdList
    var tableId: ResourceId
    var workbookId: ResourceId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object BatchDeleteTableRowsRequest {
    @inline
    def apply(
        rowIds: RowIdList,
        tableId: ResourceId,
        workbookId: ResourceId,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): BatchDeleteTableRowsRequest = {
      val __obj = js.Dynamic.literal(
        "rowIds" -> rowIds.asInstanceOf[js.Any],
        "tableId" -> tableId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteTableRowsRequest]
    }
  }

  @js.native
  trait BatchDeleteTableRowsResult extends js.Object {
    var workbookCursor: WorkbookCursor
    var failedBatchItems: js.UndefOr[FailedBatchItems]
  }

  object BatchDeleteTableRowsResult {
    @inline
    def apply(
        workbookCursor: WorkbookCursor,
        failedBatchItems: js.UndefOr[FailedBatchItems] = js.undefined
    ): BatchDeleteTableRowsResult = {
      val __obj = js.Dynamic.literal(
        "workbookCursor" -> workbookCursor.asInstanceOf[js.Any]
      )

      failedBatchItems.foreach(__v => __obj.updateDynamic("failedBatchItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteTableRowsResult]
    }
  }

  @js.native
  trait BatchUpdateTableRowsRequest extends js.Object {
    var rowsToUpdate: UpdateRowDataList
    var tableId: ResourceId
    var workbookId: ResourceId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object BatchUpdateTableRowsRequest {
    @inline
    def apply(
        rowsToUpdate: UpdateRowDataList,
        tableId: ResourceId,
        workbookId: ResourceId,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): BatchUpdateTableRowsRequest = {
      val __obj = js.Dynamic.literal(
        "rowsToUpdate" -> rowsToUpdate.asInstanceOf[js.Any],
        "tableId" -> tableId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateTableRowsRequest]
    }
  }

  @js.native
  trait BatchUpdateTableRowsResult extends js.Object {
    var workbookCursor: WorkbookCursor
    var failedBatchItems: js.UndefOr[FailedBatchItems]
  }

  object BatchUpdateTableRowsResult {
    @inline
    def apply(
        workbookCursor: WorkbookCursor,
        failedBatchItems: js.UndefOr[FailedBatchItems] = js.undefined
    ): BatchUpdateTableRowsResult = {
      val __obj = js.Dynamic.literal(
        "workbookCursor" -> workbookCursor.asInstanceOf[js.Any]
      )

      failedBatchItems.foreach(__v => __obj.updateDynamic("failedBatchItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateTableRowsResult]
    }
  }

  @js.native
  trait BatchUpsertTableRowsRequest extends js.Object {
    var rowsToUpsert: UpsertRowDataList
    var tableId: ResourceId
    var workbookId: ResourceId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object BatchUpsertTableRowsRequest {
    @inline
    def apply(
        rowsToUpsert: UpsertRowDataList,
        tableId: ResourceId,
        workbookId: ResourceId,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): BatchUpsertTableRowsRequest = {
      val __obj = js.Dynamic.literal(
        "rowsToUpsert" -> rowsToUpsert.asInstanceOf[js.Any],
        "tableId" -> tableId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpsertTableRowsRequest]
    }
  }

  @js.native
  trait BatchUpsertTableRowsResult extends js.Object {
    var rows: UpsertRowsResultMap
    var workbookCursor: WorkbookCursor
    var failedBatchItems: js.UndefOr[FailedBatchItems]
  }

  object BatchUpsertTableRowsResult {
    @inline
    def apply(
        rows: UpsertRowsResultMap,
        workbookCursor: WorkbookCursor,
        failedBatchItems: js.UndefOr[FailedBatchItems] = js.undefined
    ): BatchUpsertTableRowsResult = {
      val __obj = js.Dynamic.literal(
        "rows" -> rows.asInstanceOf[js.Any],
        "workbookCursor" -> workbookCursor.asInstanceOf[js.Any]
      )

      failedBatchItems.foreach(__v => __obj.updateDynamic("failedBatchItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpsertTableRowsResult]
    }
  }

  /** An object that represents a single cell in a table.
    */
  @js.native
  trait Cell extends js.Object {
    var format: js.UndefOr[Format]
    var formattedValue: js.UndefOr[FormattedValue]
    var formula: js.UndefOr[Formula]
    var rawValue: js.UndefOr[RawValue]
  }

  object Cell {
    @inline
    def apply(
        format: js.UndefOr[Format] = js.undefined,
        formattedValue: js.UndefOr[FormattedValue] = js.undefined,
        formula: js.UndefOr[Formula] = js.undefined,
        rawValue: js.UndefOr[RawValue] = js.undefined
    ): Cell = {
      val __obj = js.Dynamic.literal()
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      formattedValue.foreach(__v => __obj.updateDynamic("formattedValue")(__v.asInstanceOf[js.Any]))
      formula.foreach(__v => __obj.updateDynamic("formula")(__v.asInstanceOf[js.Any]))
      rawValue.foreach(__v => __obj.updateDynamic("rawValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cell]
    }
  }

  /** CellInput object contains the data needed to create or update cells in a table.
    */
  @js.native
  trait CellInput extends js.Object {
    var fact: js.UndefOr[Fact]
  }

  object CellInput {
    @inline
    def apply(
        fact: js.UndefOr[Fact] = js.undefined
    ): CellInput = {
      val __obj = js.Dynamic.literal()
      fact.foreach(__v => __obj.updateDynamic("fact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CellInput]
    }
  }

  /** Metadata for column in the table.
    */
  @js.native
  trait ColumnMetadata extends js.Object {
    var format: Format
    var name: Name
  }

  object ColumnMetadata {
    @inline
    def apply(
        format: Format,
        name: Name
    ): ColumnMetadata = {
      val __obj = js.Dynamic.literal(
        "format" -> format.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ColumnMetadata]
    }
  }

  /** Data needed to create a single row in a table as part of the BatchCreateTableRows request.
    */
  @js.native
  trait CreateRowData extends js.Object {
    var batchItemId: BatchItemId
    var cellsToCreate: RowDataInput
  }

  object CreateRowData {
    @inline
    def apply(
        batchItemId: BatchItemId,
        cellsToCreate: RowDataInput
    ): CreateRowData = {
      val __obj = js.Dynamic.literal(
        "batchItemId" -> batchItemId.asInstanceOf[js.Any],
        "cellsToCreate" -> cellsToCreate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRowData]
    }
  }

  /** The data in a particular data cell defined on the screen.
    */
  @js.native
  trait DataItem extends js.Object {
    var formattedValue: js.UndefOr[FormattedValue]
    var overrideFormat: js.UndefOr[Format]
    var rawValue: js.UndefOr[RawValue]
  }

  object DataItem {
    @inline
    def apply(
        formattedValue: js.UndefOr[FormattedValue] = js.undefined,
        overrideFormat: js.UndefOr[Format] = js.undefined,
        rawValue: js.UndefOr[RawValue] = js.undefined
    ): DataItem = {
      val __obj = js.Dynamic.literal()
      formattedValue.foreach(__v => __obj.updateDynamic("formattedValue")(__v.asInstanceOf[js.Any]))
      overrideFormat.foreach(__v => __obj.updateDynamic("overrideFormat")(__v.asInstanceOf[js.Any]))
      rawValue.foreach(__v => __obj.updateDynamic("rawValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataItem]
    }
  }

  /** An object that contains the options relating to parsing delimited text as part of an import request.
    */
  @js.native
  trait DelimitedTextImportOptions extends js.Object {
    var delimiter: DelimitedTextDelimiter
    var dataCharacterEncoding: js.UndefOr[ImportDataCharacterEncoding]
    var hasHeaderRow: js.UndefOr[HasHeaderRow]
    var ignoreEmptyRows: js.UndefOr[IgnoreEmptyRows]
  }

  object DelimitedTextImportOptions {
    @inline
    def apply(
        delimiter: DelimitedTextDelimiter,
        dataCharacterEncoding: js.UndefOr[ImportDataCharacterEncoding] = js.undefined,
        hasHeaderRow: js.UndefOr[HasHeaderRow] = js.undefined,
        ignoreEmptyRows: js.UndefOr[IgnoreEmptyRows] = js.undefined
    ): DelimitedTextImportOptions = {
      val __obj = js.Dynamic.literal(
        "delimiter" -> delimiter.asInstanceOf[js.Any]
      )

      dataCharacterEncoding.foreach(__v => __obj.updateDynamic("dataCharacterEncoding")(__v.asInstanceOf[js.Any]))
      hasHeaderRow.foreach(__v => __obj.updateDynamic("hasHeaderRow")(__v.asInstanceOf[js.Any]))
      ignoreEmptyRows.foreach(__v => __obj.updateDynamic("ignoreEmptyRows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DelimitedTextImportOptions]
    }
  }

  @js.native
  trait DescribeTableDataImportJobRequest extends js.Object {
    var jobId: JobId
    var tableId: ResourceId
    var workbookId: ResourceId
  }

  object DescribeTableDataImportJobRequest {
    @inline
    def apply(
        jobId: JobId,
        tableId: ResourceId,
        workbookId: ResourceId
    ): DescribeTableDataImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "tableId" -> tableId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTableDataImportJobRequest]
    }
  }

  @js.native
  trait DescribeTableDataImportJobResult extends js.Object {
    var jobMetadata: TableDataImportJobMetadata
    var jobStatus: TableDataImportJobStatus
    var message: TableDataImportJobMessage
  }

  object DescribeTableDataImportJobResult {
    @inline
    def apply(
        jobMetadata: TableDataImportJobMetadata,
        jobStatus: TableDataImportJobStatus,
        message: TableDataImportJobMessage
    ): DescribeTableDataImportJobResult = {
      val __obj = js.Dynamic.literal(
        "jobMetadata" -> jobMetadata.asInstanceOf[js.Any],
        "jobStatus" -> jobStatus.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTableDataImportJobResult]
    }
  }

  /** An object that contains the options relating to the destination of the import request.
    */
  @js.native
  trait DestinationOptions extends js.Object {
    var columnMap: js.UndefOr[ImportColumnMap]
  }

  object DestinationOptions {
    @inline
    def apply(
        columnMap: js.UndefOr[ImportColumnMap] = js.undefined
    ): DestinationOptions = {
      val __obj = js.Dynamic.literal()
      columnMap.foreach(__v => __obj.updateDynamic("columnMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationOptions]
    }
  }

  /** A single item in a batch that failed to perform the intended action because of an error preventing it from succeeding.
    */
  @js.native
  trait FailedBatchItem extends js.Object {
    var errorMessage: BatchErrorMessage
    var id: BatchItemId
  }

  object FailedBatchItem {
    @inline
    def apply(
        errorMessage: BatchErrorMessage,
        id: BatchItemId
    ): FailedBatchItem = {
      val __obj = js.Dynamic.literal(
        "errorMessage" -> errorMessage.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FailedBatchItem]
    }
  }

  /** An object that represents a filter formula along with the id of the context row under which the filter function needs to evaluate.
    */
  @js.native
  trait Filter extends js.Object {
    var formula: Formula
    var contextRowId: js.UndefOr[RowId]
  }

  object Filter {
    @inline
    def apply(
        formula: Formula,
        contextRowId: js.UndefOr[RowId] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "formula" -> formula.asInstanceOf[js.Any]
      )

      contextRowId.foreach(__v => __obj.updateDynamic("contextRowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  sealed trait Format extends js.Any
  object Format {
    val AUTO = "AUTO".asInstanceOf[Format]
    val NUMBER = "NUMBER".asInstanceOf[Format]
    val CURRENCY = "CURRENCY".asInstanceOf[Format]
    val DATE = "DATE".asInstanceOf[Format]
    val TIME = "TIME".asInstanceOf[Format]
    val DATE_TIME = "DATE_TIME".asInstanceOf[Format]
    val PERCENTAGE = "PERCENTAGE".asInstanceOf[Format]
    val TEXT = "TEXT".asInstanceOf[Format]
    val ACCOUNTING = "ACCOUNTING".asInstanceOf[Format]
    val CONTACT = "CONTACT".asInstanceOf[Format]
    val ROWLINK = "ROWLINK".asInstanceOf[Format]

    @inline def values = js.Array(AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME, PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK)
  }

  @js.native
  trait GetScreenDataRequest extends js.Object {
    var appId: ResourceId
    var screenId: ResourceId
    var workbookId: ResourceId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var variables: js.UndefOr[VariableValueMap]
  }

  object GetScreenDataRequest {
    @inline
    def apply(
        appId: ResourceId,
        screenId: ResourceId,
        workbookId: ResourceId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        variables: js.UndefOr[VariableValueMap] = js.undefined
    ): GetScreenDataRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "screenId" -> screenId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      variables.foreach(__v => __obj.updateDynamic("variables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetScreenDataRequest]
    }
  }

  @js.native
  trait GetScreenDataResult extends js.Object {
    var results: ResultSetMap
    var workbookCursor: WorkbookCursor
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetScreenDataResult {
    @inline
    def apply(
        results: ResultSetMap,
        workbookCursor: WorkbookCursor,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetScreenDataResult = {
      val __obj = js.Dynamic.literal(
        "results" -> results.asInstanceOf[js.Any],
        "workbookCursor" -> workbookCursor.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetScreenDataResult]
    }
  }

  @js.native
  sealed trait ImportDataCharacterEncoding extends js.Any
  object ImportDataCharacterEncoding {
    val `UTF-8` = "UTF-8".asInstanceOf[ImportDataCharacterEncoding]
    val `US-ASCII` = "US-ASCII".asInstanceOf[ImportDataCharacterEncoding]
    val `ISO-8859-1` = "ISO-8859-1".asInstanceOf[ImportDataCharacterEncoding]
    val `UTF-16BE` = "UTF-16BE".asInstanceOf[ImportDataCharacterEncoding]
    val `UTF-16LE` = "UTF-16LE".asInstanceOf[ImportDataCharacterEncoding]
    val `UTF-16` = "UTF-16".asInstanceOf[ImportDataCharacterEncoding]

    @inline def values = js.Array(`UTF-8`, `US-ASCII`, `ISO-8859-1`, `UTF-16BE`, `UTF-16LE`, `UTF-16`)
  }

  /** An object that has details about the source of the data that was submitted for import.
    */
  @js.native
  trait ImportDataSource extends js.Object {
    var dataSourceConfig: ImportDataSourceConfig
  }

  object ImportDataSource {
    @inline
    def apply(
        dataSourceConfig: ImportDataSourceConfig
    ): ImportDataSource = {
      val __obj = js.Dynamic.literal(
        "dataSourceConfig" -> dataSourceConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportDataSource]
    }
  }

  /** An object that contains the configuration parameters for the data source of an import request.
    */
  @js.native
  trait ImportDataSourceConfig extends js.Object {
    var dataSourceUrl: js.UndefOr[SecureURL]
  }

  object ImportDataSourceConfig {
    @inline
    def apply(
        dataSourceUrl: js.UndefOr[SecureURL] = js.undefined
    ): ImportDataSourceConfig = {
      val __obj = js.Dynamic.literal()
      dataSourceUrl.foreach(__v => __obj.updateDynamic("dataSourceUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportDataSourceConfig]
    }
  }

  /** An object that contains the attributes of the submitter of the import job.
    */
  @js.native
  trait ImportJobSubmitter extends js.Object {
    var email: js.UndefOr[Email]
    var userArn: js.UndefOr[AwsUserArn]
  }

  object ImportJobSubmitter {
    @inline
    def apply(
        email: js.UndefOr[Email] = js.undefined,
        userArn: js.UndefOr[AwsUserArn] = js.undefined
    ): ImportJobSubmitter = {
      val __obj = js.Dynamic.literal()
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      userArn.foreach(__v => __obj.updateDynamic("userArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportJobSubmitter]
    }
  }

  /** An object that contains the options specified by the sumitter of the import request.
    */
  @js.native
  trait ImportOptions extends js.Object {
    var delimitedTextOptions: js.UndefOr[DelimitedTextImportOptions]
    var destinationOptions: js.UndefOr[DestinationOptions]
  }

  object ImportOptions {
    @inline
    def apply(
        delimitedTextOptions: js.UndefOr[DelimitedTextImportOptions] = js.undefined,
        destinationOptions: js.UndefOr[DestinationOptions] = js.undefined
    ): ImportOptions = {
      val __obj = js.Dynamic.literal()
      delimitedTextOptions.foreach(__v => __obj.updateDynamic("delimitedTextOptions")(__v.asInstanceOf[js.Any]))
      destinationOptions.foreach(__v => __obj.updateDynamic("destinationOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportOptions]
    }
  }

  @js.native
  sealed trait ImportSourceDataFormat extends js.Any
  object ImportSourceDataFormat {
    val DELIMITED_TEXT = "DELIMITED_TEXT".asInstanceOf[ImportSourceDataFormat]

    @inline def values = js.Array(DELIMITED_TEXT)
  }

  @js.native
  trait InvokeScreenAutomationRequest extends js.Object {
    var appId: ResourceId
    var screenAutomationId: ResourceId
    var screenId: ResourceId
    var workbookId: ResourceId
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var rowId: js.UndefOr[RowId]
    var variables: js.UndefOr[VariableValueMap]
  }

  object InvokeScreenAutomationRequest {
    @inline
    def apply(
        appId: ResourceId,
        screenAutomationId: ResourceId,
        screenId: ResourceId,
        workbookId: ResourceId,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        rowId: js.UndefOr[RowId] = js.undefined,
        variables: js.UndefOr[VariableValueMap] = js.undefined
    ): InvokeScreenAutomationRequest = {
      val __obj = js.Dynamic.literal(
        "appId" -> appId.asInstanceOf[js.Any],
        "screenAutomationId" -> screenAutomationId.asInstanceOf[js.Any],
        "screenId" -> screenId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      rowId.foreach(__v => __obj.updateDynamic("rowId")(__v.asInstanceOf[js.Any]))
      variables.foreach(__v => __obj.updateDynamic("variables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvokeScreenAutomationRequest]
    }
  }

  @js.native
  trait InvokeScreenAutomationResult extends js.Object {
    var workbookCursor: WorkbookCursor
  }

  object InvokeScreenAutomationResult {
    @inline
    def apply(
        workbookCursor: WorkbookCursor
    ): InvokeScreenAutomationResult = {
      val __obj = js.Dynamic.literal(
        "workbookCursor" -> workbookCursor.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InvokeScreenAutomationResult]
    }
  }

  @js.native
  trait ListTableColumnsRequest extends js.Object {
    var tableId: ResourceId
    var workbookId: ResourceId
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTableColumnsRequest {
    @inline
    def apply(
        tableId: ResourceId,
        workbookId: ResourceId,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTableColumnsRequest = {
      val __obj = js.Dynamic.literal(
        "tableId" -> tableId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableColumnsRequest]
    }
  }

  @js.native
  trait ListTableColumnsResult extends js.Object {
    var tableColumns: TableColumns
    var nextToken: js.UndefOr[PaginationToken]
    var workbookCursor: js.UndefOr[WorkbookCursor]
  }

  object ListTableColumnsResult {
    @inline
    def apply(
        tableColumns: TableColumns,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        workbookCursor: js.UndefOr[WorkbookCursor] = js.undefined
    ): ListTableColumnsResult = {
      val __obj = js.Dynamic.literal(
        "tableColumns" -> tableColumns.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      workbookCursor.foreach(__v => __obj.updateDynamic("workbookCursor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableColumnsResult]
    }
  }

  @js.native
  trait ListTableRowsRequest extends js.Object {
    var tableId: ResourceId
    var workbookId: ResourceId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var rowIds: js.UndefOr[RowIdList]
  }

  object ListTableRowsRequest {
    @inline
    def apply(
        tableId: ResourceId,
        workbookId: ResourceId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        rowIds: js.UndefOr[RowIdList] = js.undefined
    ): ListTableRowsRequest = {
      val __obj = js.Dynamic.literal(
        "tableId" -> tableId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      rowIds.foreach(__v => __obj.updateDynamic("rowIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableRowsRequest]
    }
  }

  @js.native
  trait ListTableRowsResult extends js.Object {
    var columnIds: ResourceIds
    var rows: TableRows
    var workbookCursor: WorkbookCursor
    var nextToken: js.UndefOr[PaginationToken]
    var rowIdsNotFound: js.UndefOr[RowIdList]
  }

  object ListTableRowsResult {
    @inline
    def apply(
        columnIds: ResourceIds,
        rows: TableRows,
        workbookCursor: WorkbookCursor,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        rowIdsNotFound: js.UndefOr[RowIdList] = js.undefined
    ): ListTableRowsResult = {
      val __obj = js.Dynamic.literal(
        "columnIds" -> columnIds.asInstanceOf[js.Any],
        "rows" -> rows.asInstanceOf[js.Any],
        "workbookCursor" -> workbookCursor.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      rowIdsNotFound.foreach(__v => __obj.updateDynamic("rowIdsNotFound")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableRowsResult]
    }
  }

  @js.native
  trait ListTablesRequest extends js.Object {
    var workbookId: ResourceId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTablesRequest {
    @inline
    def apply(
        workbookId: ResourceId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTablesRequest = {
      val __obj = js.Dynamic.literal(
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTablesRequest]
    }
  }

  @js.native
  trait ListTablesResult extends js.Object {
    var tables: Tables
    var nextToken: js.UndefOr[PaginationToken]
    var workbookCursor: js.UndefOr[WorkbookCursor]
  }

  object ListTablesResult {
    @inline
    def apply(
        tables: Tables,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        workbookCursor: js.UndefOr[WorkbookCursor] = js.undefined
    ): ListTablesResult = {
      val __obj = js.Dynamic.literal(
        "tables" -> tables.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      workbookCursor.foreach(__v => __obj.updateDynamic("workbookCursor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTablesResult]
    }
  }

  @js.native
  trait QueryTableRowsRequest extends js.Object {
    var filterFormula: Filter
    var tableId: ResourceId
    var workbookId: ResourceId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object QueryTableRowsRequest {
    @inline
    def apply(
        filterFormula: Filter,
        tableId: ResourceId,
        workbookId: ResourceId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): QueryTableRowsRequest = {
      val __obj = js.Dynamic.literal(
        "filterFormula" -> filterFormula.asInstanceOf[js.Any],
        "tableId" -> tableId.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryTableRowsRequest]
    }
  }

  @js.native
  trait QueryTableRowsResult extends js.Object {
    var columnIds: ResourceIds
    var rows: TableRows
    var workbookCursor: WorkbookCursor
    var nextToken: js.UndefOr[PaginationToken]
  }

  object QueryTableRowsResult {
    @inline
    def apply(
        columnIds: ResourceIds,
        rows: TableRows,
        workbookCursor: WorkbookCursor,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): QueryTableRowsResult = {
      val __obj = js.Dynamic.literal(
        "columnIds" -> columnIds.asInstanceOf[js.Any],
        "rows" -> rows.asInstanceOf[js.Any],
        "workbookCursor" -> workbookCursor.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryTableRowsResult]
    }
  }

  /** A single row in the ResultSet.
    */
  @js.native
  trait ResultRow extends js.Object {
    var dataItems: DataItems
    var rowId: js.UndefOr[RowId]
  }

  object ResultRow {
    @inline
    def apply(
        dataItems: DataItems,
        rowId: js.UndefOr[RowId] = js.undefined
    ): ResultRow = {
      val __obj = js.Dynamic.literal(
        "dataItems" -> dataItems.asInstanceOf[js.Any]
      )

      rowId.foreach(__v => __obj.updateDynamic("rowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultRow]
    }
  }

  /** ResultSet contains the results of the request for a single block or list defined on the screen.
    */
  @js.native
  trait ResultSet extends js.Object {
    var headers: ResultHeader
    var rows: ResultRows
  }

  object ResultSet {
    @inline
    def apply(
        headers: ResultHeader,
        rows: ResultRows
    ): ResultSet = {
      val __obj = js.Dynamic.literal(
        "headers" -> headers.asInstanceOf[js.Any],
        "rows" -> rows.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResultSet]
    }
  }

  /** An object that contains the properties for importing data to a specific column in a table.
    */
  @js.native
  trait SourceDataColumnProperties extends js.Object {
    var columnIndex: js.UndefOr[SourceDataColumnIndex]
  }

  object SourceDataColumnProperties {
    @inline
    def apply(
        columnIndex: js.UndefOr[SourceDataColumnIndex] = js.undefined
    ): SourceDataColumnProperties = {
      val __obj = js.Dynamic.literal()
      columnIndex.foreach(__v => __obj.updateDynamic("columnIndex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceDataColumnProperties]
    }
  }

  @js.native
  trait StartTableDataImportJobRequest extends js.Object {
    var clientRequestToken: ClientRequestToken
    var dataFormat: ImportSourceDataFormat
    var dataSource: ImportDataSource
    var destinationTableId: ResourceId
    var importOptions: ImportOptions
    var workbookId: ResourceId
  }

  object StartTableDataImportJobRequest {
    @inline
    def apply(
        clientRequestToken: ClientRequestToken,
        dataFormat: ImportSourceDataFormat,
        dataSource: ImportDataSource,
        destinationTableId: ResourceId,
        importOptions: ImportOptions,
        workbookId: ResourceId
    ): StartTableDataImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "clientRequestToken" -> clientRequestToken.asInstanceOf[js.Any],
        "dataFormat" -> dataFormat.asInstanceOf[js.Any],
        "dataSource" -> dataSource.asInstanceOf[js.Any],
        "destinationTableId" -> destinationTableId.asInstanceOf[js.Any],
        "importOptions" -> importOptions.asInstanceOf[js.Any],
        "workbookId" -> workbookId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartTableDataImportJobRequest]
    }
  }

  @js.native
  trait StartTableDataImportJobResult extends js.Object {
    var jobId: JobId
    var jobStatus: TableDataImportJobStatus
  }

  object StartTableDataImportJobResult {
    @inline
    def apply(
        jobId: JobId,
        jobStatus: TableDataImportJobStatus
    ): StartTableDataImportJobResult = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "jobStatus" -> jobStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartTableDataImportJobResult]
    }
  }

  /** An object representing the properties of a table in a workbook.
    */
  @js.native
  trait Table extends js.Object {
    var tableId: js.UndefOr[ResourceId]
    var tableName: js.UndefOr[TableName]
  }

  object Table {
    @inline
    def apply(
        tableId: js.UndefOr[ResourceId] = js.undefined,
        tableName: js.UndefOr[TableName] = js.undefined
    ): Table = {
      val __obj = js.Dynamic.literal()
      tableId.foreach(__v => __obj.updateDynamic("tableId")(__v.asInstanceOf[js.Any]))
      tableName.foreach(__v => __obj.updateDynamic("tableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Table]
    }
  }

  /** An object that contains attributes about a single column in a table
    */
  @js.native
  trait TableColumn extends js.Object {
    var format: js.UndefOr[Format]
    var tableColumnId: js.UndefOr[ResourceId]
    var tableColumnName: js.UndefOr[TableColumnName]
  }

  object TableColumn {
    @inline
    def apply(
        format: js.UndefOr[Format] = js.undefined,
        tableColumnId: js.UndefOr[ResourceId] = js.undefined,
        tableColumnName: js.UndefOr[TableColumnName] = js.undefined
    ): TableColumn = {
      val __obj = js.Dynamic.literal()
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      tableColumnId.foreach(__v => __obj.updateDynamic("tableColumnId")(__v.asInstanceOf[js.Any]))
      tableColumnName.foreach(__v => __obj.updateDynamic("tableColumnName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableColumn]
    }
  }

  /** The metadata associated with the table data import job that was submitted.
    */
  @js.native
  trait TableDataImportJobMetadata extends js.Object {
    var dataSource: ImportDataSource
    var importOptions: ImportOptions
    var submitTime: TimestampInMillis
    var submitter: ImportJobSubmitter
  }

  object TableDataImportJobMetadata {
    @inline
    def apply(
        dataSource: ImportDataSource,
        importOptions: ImportOptions,
        submitTime: TimestampInMillis,
        submitter: ImportJobSubmitter
    ): TableDataImportJobMetadata = {
      val __obj = js.Dynamic.literal(
        "dataSource" -> dataSource.asInstanceOf[js.Any],
        "importOptions" -> importOptions.asInstanceOf[js.Any],
        "submitTime" -> submitTime.asInstanceOf[js.Any],
        "submitter" -> submitter.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TableDataImportJobMetadata]
    }
  }

  @js.native
  sealed trait TableDataImportJobStatus extends js.Any
  object TableDataImportJobStatus {
    val SUBMITTED = "SUBMITTED".asInstanceOf[TableDataImportJobStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TableDataImportJobStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[TableDataImportJobStatus]
    val FAILED = "FAILED".asInstanceOf[TableDataImportJobStatus]

    @inline def values = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED)
  }

  /** An object that contains attributes about a single row in a table
    */
  @js.native
  trait TableRow extends js.Object {
    var cells: Cells
    var rowId: RowId
  }

  object TableRow {
    @inline
    def apply(
        cells: Cells,
        rowId: RowId
    ): TableRow = {
      val __obj = js.Dynamic.literal(
        "cells" -> cells.asInstanceOf[js.Any],
        "rowId" -> rowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TableRow]
    }
  }

  /** Data needed to create a single row in a table as part of the BatchCreateTableRows request.
    */
  @js.native
  trait UpdateRowData extends js.Object {
    var cellsToUpdate: RowDataInput
    var rowId: RowId
  }

  object UpdateRowData {
    @inline
    def apply(
        cellsToUpdate: RowDataInput,
        rowId: RowId
    ): UpdateRowData = {
      val __obj = js.Dynamic.literal(
        "cellsToUpdate" -> cellsToUpdate.asInstanceOf[js.Any],
        "rowId" -> rowId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRowData]
    }
  }

  @js.native
  sealed trait UpsertAction extends js.Any
  object UpsertAction {
    val UPDATED = "UPDATED".asInstanceOf[UpsertAction]
    val APPENDED = "APPENDED".asInstanceOf[UpsertAction]

    @inline def values = js.Array(UPDATED, APPENDED)
  }

  /** Data needed to upsert rows in a table as part of a single item in the BatchUpsertTableRows request.
    */
  @js.native
  trait UpsertRowData extends js.Object {
    var batchItemId: BatchItemId
    var cellsToUpdate: RowDataInput
    var filter: Filter
  }

  object UpsertRowData {
    @inline
    def apply(
        batchItemId: BatchItemId,
        cellsToUpdate: RowDataInput,
        filter: Filter
    ): UpsertRowData = {
      val __obj = js.Dynamic.literal(
        "batchItemId" -> batchItemId.asInstanceOf[js.Any],
        "cellsToUpdate" -> cellsToUpdate.asInstanceOf[js.Any],
        "filter" -> filter.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpsertRowData]
    }
  }

  /** An object that represents the result of a single upsert row request.
    */
  @js.native
  trait UpsertRowsResult extends js.Object {
    var rowIds: RowIdList
    var upsertAction: UpsertAction
  }

  object UpsertRowsResult {
    @inline
    def apply(
        rowIds: RowIdList,
        upsertAction: UpsertAction
    ): UpsertRowsResult = {
      val __obj = js.Dynamic.literal(
        "rowIds" -> rowIds.asInstanceOf[js.Any],
        "upsertAction" -> upsertAction.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpsertRowsResult]
    }
  }

  /** The input variables to the app to be used by the InvokeScreenAutomation action request.
    */
  @js.native
  trait VariableValue extends js.Object {
    var rawValue: RawValue
  }

  object VariableValue {
    @inline
    def apply(
        rawValue: RawValue
    ): VariableValue = {
      val __obj = js.Dynamic.literal(
        "rawValue" -> rawValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VariableValue]
    }
  }
}
