package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object honeycode {
  type ClientRequestToken = String
  type DataItems = js.Array[DataItem]
  type FormattedValue = String
  type MaxResults = Int
  type Name = String
  type PaginationToken = String
  type RawValue = String
  type ResourceId = String
  type ResultHeader = js.Array[ColumnMetadata]
  type ResultRows = js.Array[ResultRow]
  type ResultSetMap = js.Dictionary[ResultSet]
  type RowId = String
  type VariableName = String
  type VariableValueMap = js.Dictionary[VariableValue]
  type WorkbookCursor = Double

  implicit final class HoneycodeOps(private val service: Honeycode) extends AnyVal {

    @inline def getScreenDataFuture(params: GetScreenDataRequest): Future[GetScreenDataResult] = service.getScreenData(params).promise().toFuture
    @inline def invokeScreenAutomationFuture(params: InvokeScreenAutomationRequest): Future[InvokeScreenAutomationResult] = service.invokeScreenAutomation(params).promise().toFuture

  }
}

package honeycode {
  @js.native
  @JSImport("aws-sdk/clients/honeycode", JSImport.Namespace, "AWS.Honeycode")
  class Honeycode() extends js.Object {
    def this(config: AWSConfig) = this()

    def getScreenData(params: GetScreenDataRequest): Request[GetScreenDataResult] = js.native
    def invokeScreenAutomation(params: InvokeScreenAutomationRequest): Request[InvokeScreenAutomationResult] = js.native
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
