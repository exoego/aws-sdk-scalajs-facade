package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object timestreamquery {
  type ClientRequestToken = String
  type ColumnInfoList = js.Array[ColumnInfo]
  type DatumList = js.Array[Datum]
  type Endpoints = js.Array[Endpoint]
  type MaxQueryResults = Int
  type NullableBoolean = Boolean
  type QueryId = String
  type QueryString = String
  type RowList = js.Array[Row]
  type ScalarValue = String
  type TimeSeriesDataPointList = js.Array[TimeSeriesDataPoint]
  type Timestamp = String

  implicit final class TimestreamQueryOps(private val service: TimestreamQuery) extends AnyVal {

    @inline def cancelQueryFuture(params: CancelQueryRequest): Future[CancelQueryResponse] = service.cancelQuery(params).promise().toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsRequest): Future[DescribeEndpointsResponse] = service.describeEndpoints(params).promise().toFuture
    @inline def queryFuture(params: QueryRequest): Future[QueryResponse] = service.query(params).promise().toFuture

  }
}

package timestreamquery {
  @js.native
  @JSImport("aws-sdk/clients/timestreamquery", JSImport.Namespace, "AWS.TimestreamQuery")
  class TimestreamQuery() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelQuery(params: CancelQueryRequest): Request[CancelQueryResponse] = js.native
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse] = js.native
    def query(params: QueryRequest): Request[QueryResponse] = js.native
  }

  @js.native
  trait CancelQueryRequest extends js.Object {
    var QueryId: QueryId
  }

  object CancelQueryRequest {
    @inline
    def apply(
        QueryId: QueryId
    ): CancelQueryRequest = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelQueryRequest]
    }
  }

  @js.native
  trait CancelQueryResponse extends js.Object {
    var CancellationMessage: js.UndefOr[String]
  }

  object CancelQueryResponse {
    @inline
    def apply(
        CancellationMessage: js.UndefOr[String] = js.undefined
    ): CancelQueryResponse = {
      val __obj = js.Dynamic.literal()
      CancellationMessage.foreach(__v => __obj.updateDynamic("CancellationMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelQueryResponse]
    }
  }

  /** Contains the meta data for query results such as the column names, data types, and other attributes.
    */
  @js.native
  trait ColumnInfo extends js.Object {
    var Type: Type
    var Name: js.UndefOr[String]
  }

  object ColumnInfo {
    @inline
    def apply(
        Type: Type,
        Name: js.UndefOr[String] = js.undefined
    ): ColumnInfo = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnInfo]
    }
  }

  /** Datum represents a single data point in a query result.
    */
  @js.native
  trait Datum extends js.Object {
    var ArrayValue: js.UndefOr[DatumList]
    var NullValue: js.UndefOr[NullableBoolean]
    var RowValue: js.UndefOr[Row]
    var ScalarValue: js.UndefOr[ScalarValue]
    var TimeSeriesValue: js.UndefOr[TimeSeriesDataPointList]
  }

  object Datum {
    @inline
    def apply(
        ArrayValue: js.UndefOr[DatumList] = js.undefined,
        NullValue: js.UndefOr[NullableBoolean] = js.undefined,
        RowValue: js.UndefOr[Row] = js.undefined,
        ScalarValue: js.UndefOr[ScalarValue] = js.undefined,
        TimeSeriesValue: js.UndefOr[TimeSeriesDataPointList] = js.undefined
    ): Datum = {
      val __obj = js.Dynamic.literal()
      ArrayValue.foreach(__v => __obj.updateDynamic("ArrayValue")(__v.asInstanceOf[js.Any]))
      NullValue.foreach(__v => __obj.updateDynamic("NullValue")(__v.asInstanceOf[js.Any]))
      RowValue.foreach(__v => __obj.updateDynamic("RowValue")(__v.asInstanceOf[js.Any]))
      ScalarValue.foreach(__v => __obj.updateDynamic("ScalarValue")(__v.asInstanceOf[js.Any]))
      TimeSeriesValue.foreach(__v => __obj.updateDynamic("TimeSeriesValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Datum]
    }
  }

  @js.native
  trait DescribeEndpointsRequest extends js.Object

  object DescribeEndpointsRequest {
    @inline
    def apply(): DescribeEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeEndpointsRequest]
    }
  }

  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: Endpoints
  }

  object DescribeEndpointsResponse {
    @inline
    def apply(
        Endpoints: Endpoints
    ): DescribeEndpointsResponse = {
      val __obj = js.Dynamic.literal(
        "Endpoints" -> Endpoints.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEndpointsResponse]
    }
  }

  /** Represents an available endpoint against which to make API calls agaisnt, as well as the TTL for that endpoint.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Address: String
    var CachePeriodInMinutes: Double
  }

  object Endpoint {
    @inline
    def apply(
        Address: String,
        CachePeriodInMinutes: Double
    ): Endpoint = {
      val __obj = js.Dynamic.literal(
        "Address" -> Address.asInstanceOf[js.Any],
        "CachePeriodInMinutes" -> CachePeriodInMinutes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Endpoint]
    }
  }

  @js.native
  trait QueryRequest extends js.Object {
    var QueryString: QueryString
    var ClientToken: js.UndefOr[ClientRequestToken]
    var MaxRows: js.UndefOr[MaxQueryResults]
    var NextToken: js.UndefOr[String]
  }

  object QueryRequest {
    @inline
    def apply(
        QueryString: QueryString,
        ClientToken: js.UndefOr[ClientRequestToken] = js.undefined,
        MaxRows: js.UndefOr[MaxQueryResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): QueryRequest = {
      val __obj = js.Dynamic.literal(
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      MaxRows.foreach(__v => __obj.updateDynamic("MaxRows")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryRequest]
    }
  }

  @js.native
  trait QueryResponse extends js.Object {
    var ColumnInfo: ColumnInfoList
    var QueryId: QueryId
    var Rows: RowList
    var NextToken: js.UndefOr[String]
    var QueryStatus: js.UndefOr[QueryStatus]
  }

  object QueryResponse {
    @inline
    def apply(
        ColumnInfo: ColumnInfoList,
        QueryId: QueryId,
        Rows: RowList,
        NextToken: js.UndefOr[String] = js.undefined,
        QueryStatus: js.UndefOr[QueryStatus] = js.undefined
    ): QueryResponse = {
      val __obj = js.Dynamic.literal(
        "ColumnInfo" -> ColumnInfo.asInstanceOf[js.Any],
        "QueryId" -> QueryId.asInstanceOf[js.Any],
        "Rows" -> Rows.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryStatus.foreach(__v => __obj.updateDynamic("QueryStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryResponse]
    }
  }

  /** Information about the status of the query, including progress and bytes scannned.
    */
  @js.native
  trait QueryStatus extends js.Object {
    var CumulativeBytesMetered: js.UndefOr[Double]
    var CumulativeBytesScanned: js.UndefOr[Double]
    var ProgressPercentage: js.UndefOr[Double]
  }

  object QueryStatus {
    @inline
    def apply(
        CumulativeBytesMetered: js.UndefOr[Double] = js.undefined,
        CumulativeBytesScanned: js.UndefOr[Double] = js.undefined,
        ProgressPercentage: js.UndefOr[Double] = js.undefined
    ): QueryStatus = {
      val __obj = js.Dynamic.literal()
      CumulativeBytesMetered.foreach(__v => __obj.updateDynamic("CumulativeBytesMetered")(__v.asInstanceOf[js.Any]))
      CumulativeBytesScanned.foreach(__v => __obj.updateDynamic("CumulativeBytesScanned")(__v.asInstanceOf[js.Any]))
      ProgressPercentage.foreach(__v => __obj.updateDynamic("ProgressPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStatus]
    }
  }

  /** Represents a single row in the query results.
    */
  @js.native
  trait Row extends js.Object {
    var Data: DatumList
  }

  object Row {
    @inline
    def apply(
        Data: DatumList
    ): Row = {
      val __obj = js.Dynamic.literal(
        "Data" -> Data.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Row]
    }
  }

  @js.native
  sealed trait ScalarType extends js.Any
  object ScalarType {
    val VARCHAR = "VARCHAR".asInstanceOf[ScalarType]
    val BOOLEAN = "BOOLEAN".asInstanceOf[ScalarType]
    val BIGINT = "BIGINT".asInstanceOf[ScalarType]
    val DOUBLE = "DOUBLE".asInstanceOf[ScalarType]
    val TIMESTAMP = "TIMESTAMP".asInstanceOf[ScalarType]
    val DATE = "DATE".asInstanceOf[ScalarType]
    val TIME = "TIME".asInstanceOf[ScalarType]
    val INTERVAL_DAY_TO_SECOND = "INTERVAL_DAY_TO_SECOND".asInstanceOf[ScalarType]
    val INTERVAL_YEAR_TO_MONTH = "INTERVAL_YEAR_TO_MONTH".asInstanceOf[ScalarType]
    val UNKNOWN = "UNKNOWN".asInstanceOf[ScalarType]
    val INTEGER = "INTEGER".asInstanceOf[ScalarType]

    @inline def values = js.Array(VARCHAR, BOOLEAN, BIGINT, DOUBLE, TIMESTAMP, DATE, TIME, INTERVAL_DAY_TO_SECOND, INTERVAL_YEAR_TO_MONTH, UNKNOWN, INTEGER)
  }

  /** The timeseries datatype represents the values of a measure over time. A time series is an array of rows of timestamps and measure values, with rows sorted in ascending order of time. A TimeSeriesDataPoint is a single data point in the timeseries. It represents a tuple of (time, measure value) in a timeseries.
    */
  @js.native
  trait TimeSeriesDataPoint extends js.Object {
    var Time: Timestamp
    var Value: Datum
  }

  object TimeSeriesDataPoint {
    @inline
    def apply(
        Time: Timestamp,
        Value: Datum
    ): TimeSeriesDataPoint = {
      val __obj = js.Dynamic.literal(
        "Time" -> Time.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimeSeriesDataPoint]
    }
  }

  /** Contains the data type of a column in a query result set. The data type can be scalar or complex. The supported scalar data types are integers, boolean, string, double, timestamp, date, time, and intervals. The supported complex data types are arrays, rows, and timeseries.
    */
  @js.native
  trait Type extends js.Object {
    var ArrayColumnInfo: js.UndefOr[ColumnInfo]
    var RowColumnInfo: js.UndefOr[ColumnInfoList]
    var ScalarType: js.UndefOr[ScalarType]
    var TimeSeriesMeasureValueColumnInfo: js.UndefOr[ColumnInfo]
  }

  object Type {
    @inline
    def apply(
        ArrayColumnInfo: js.UndefOr[ColumnInfo] = js.undefined,
        RowColumnInfo: js.UndefOr[ColumnInfoList] = js.undefined,
        ScalarType: js.UndefOr[ScalarType] = js.undefined,
        TimeSeriesMeasureValueColumnInfo: js.UndefOr[ColumnInfo] = js.undefined
    ): Type = {
      val __obj = js.Dynamic.literal()
      ArrayColumnInfo.foreach(__v => __obj.updateDynamic("ArrayColumnInfo")(__v.asInstanceOf[js.Any]))
      RowColumnInfo.foreach(__v => __obj.updateDynamic("RowColumnInfo")(__v.asInstanceOf[js.Any]))
      ScalarType.foreach(__v => __obj.updateDynamic("ScalarType")(__v.asInstanceOf[js.Any]))
      TimeSeriesMeasureValueColumnInfo.foreach(__v => __obj.updateDynamic("TimeSeriesMeasureValueColumnInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Type]
    }
  }
}
