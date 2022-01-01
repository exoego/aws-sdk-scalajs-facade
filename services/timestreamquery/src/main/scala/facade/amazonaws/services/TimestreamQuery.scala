package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object timestreamquery {
  type AmazonResourceName = String
  type ClientRequestToken = String
  type ClientToken = String
  type ColumnInfoList = js.Array[ColumnInfo]
  type DatumList = js.Array[Datum]
  type DimensionMappingList = js.Array[DimensionMapping]
  type Endpoints = js.Array[Endpoint]
  type ErrorMessage = String
  type MaxQueryResults = Int
  type MaxScheduledQueriesResults = Int
  type MaxTagsForResourceResult = Int
  type MixedMeasureMappingList = js.Array[MixedMeasureMapping]
  type MultiMeasureAttributeMappingList = js.Array[MultiMeasureAttributeMapping]
  type NextScheduledQueriesResultsToken = String
  type NextTagsForResourceResultsToken = String
  type NullableBoolean = Boolean
  type PaginationToken = String
  type ParameterMappingList = js.Array[ParameterMapping]
  type QueryId = String
  type QueryString = String
  type ResourceName = String
  type RowList = js.Array[Row]
  type S3BucketName = String
  type S3ObjectKey = String
  type S3ObjectKeyPrefix = String
  type ScalarValue = String
  type ScheduleExpression = String
  type ScheduledQueryList = js.Array[ScheduledQuery]
  type ScheduledQueryName = String
  type ScheduledQueryRunSummaryList = js.Array[ScheduledQueryRunSummary]
  type SchemaName = String
  type SelectColumnList = js.Array[SelectColumn]
  type StringValue2048 = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Time = js.Date
  type TimeSeriesDataPointList = js.Array[TimeSeriesDataPoint]
  type Timestamp = String

  final class TimestreamQueryOps(private val service: TimestreamQuery) extends AnyVal {

    @inline def cancelQueryFuture(params: CancelQueryRequest): Future[CancelQueryResponse] = service.cancelQuery(params).promise().toFuture
    @inline def createScheduledQueryFuture(params: CreateScheduledQueryRequest): Future[CreateScheduledQueryResponse] = service.createScheduledQuery(params).promise().toFuture
    @inline def deleteScheduledQueryFuture(params: DeleteScheduledQueryRequest): Future[js.Object] = service.deleteScheduledQuery(params).promise().toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsRequest): Future[DescribeEndpointsResponse] = service.describeEndpoints(params).promise().toFuture
    @inline def describeScheduledQueryFuture(params: DescribeScheduledQueryRequest): Future[DescribeScheduledQueryResponse] = service.describeScheduledQuery(params).promise().toFuture
    @inline def executeScheduledQueryFuture(params: ExecuteScheduledQueryRequest): Future[js.Object] = service.executeScheduledQuery(params).promise().toFuture
    @inline def listScheduledQueriesFuture(params: ListScheduledQueriesRequest): Future[ListScheduledQueriesResponse] = service.listScheduledQueries(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def prepareQueryFuture(params: PrepareQueryRequest): Future[PrepareQueryResponse] = service.prepareQuery(params).promise().toFuture
    @inline def queryFuture(params: QueryRequest): Future[QueryResponse] = service.query(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateScheduledQueryFuture(params: UpdateScheduledQueryRequest): Future[js.Object] = service.updateScheduledQuery(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/timestreamquery", JSImport.Namespace, "AWS.TimestreamQuery")
  class TimestreamQuery() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelQuery(params: CancelQueryRequest): Request[CancelQueryResponse] = js.native
    def createScheduledQuery(params: CreateScheduledQueryRequest): Request[CreateScheduledQueryResponse] = js.native
    def deleteScheduledQuery(params: DeleteScheduledQueryRequest): Request[js.Object] = js.native
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse] = js.native
    def describeScheduledQuery(params: DescribeScheduledQueryRequest): Request[DescribeScheduledQueryResponse] = js.native
    def executeScheduledQuery(params: ExecuteScheduledQueryRequest): Request[js.Object] = js.native
    def listScheduledQueries(params: ListScheduledQueriesRequest): Request[ListScheduledQueriesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def prepareQuery(params: PrepareQueryRequest): Request[PrepareQueryResponse] = js.native
    def query(params: QueryRequest): Request[QueryResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateScheduledQuery(params: UpdateScheduledQueryRequest): Request[js.Object] = js.native
  }
  object TimestreamQuery {
    @inline implicit def toOps(service: TimestreamQuery): TimestreamQueryOps = {
      new TimestreamQueryOps(service)
    }
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

  /** Contains the metadata for query results such as the column names, data types, and other attributes.
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

  @js.native
  trait CreateScheduledQueryRequest extends js.Object {
    var ErrorReportConfiguration: ErrorReportConfiguration
    var Name: ScheduledQueryName
    var NotificationConfiguration: NotificationConfiguration
    var QueryString: QueryString
    var ScheduleConfiguration: ScheduleConfiguration
    var ScheduledQueryExecutionRoleArn: AmazonResourceName
    var ClientToken: js.UndefOr[ClientToken]
    var KmsKeyId: js.UndefOr[StringValue2048]
    var Tags: js.UndefOr[TagList]
    var TargetConfiguration: js.UndefOr[TargetConfiguration]
  }

  object CreateScheduledQueryRequest {
    @inline
    def apply(
        ErrorReportConfiguration: ErrorReportConfiguration,
        Name: ScheduledQueryName,
        NotificationConfiguration: NotificationConfiguration,
        QueryString: QueryString,
        ScheduleConfiguration: ScheduleConfiguration,
        ScheduledQueryExecutionRoleArn: AmazonResourceName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        KmsKeyId: js.UndefOr[StringValue2048] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined
    ): CreateScheduledQueryRequest = {
      val __obj = js.Dynamic.literal(
        "ErrorReportConfiguration" -> ErrorReportConfiguration.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "NotificationConfiguration" -> NotificationConfiguration.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any],
        "ScheduleConfiguration" -> ScheduleConfiguration.asInstanceOf[js.Any],
        "ScheduledQueryExecutionRoleArn" -> ScheduledQueryExecutionRoleArn.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TargetConfiguration.foreach(__v => __obj.updateDynamic("TargetConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScheduledQueryRequest]
    }
  }

  @js.native
  trait CreateScheduledQueryResponse extends js.Object {
    var Arn: AmazonResourceName
  }

  object CreateScheduledQueryResponse {
    @inline
    def apply(
        Arn: AmazonResourceName
    ): CreateScheduledQueryResponse = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateScheduledQueryResponse]
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
  trait DeleteScheduledQueryRequest extends js.Object {
    var ScheduledQueryArn: AmazonResourceName
  }

  object DeleteScheduledQueryRequest {
    @inline
    def apply(
        ScheduledQueryArn: AmazonResourceName
    ): DeleteScheduledQueryRequest = {
      val __obj = js.Dynamic.literal(
        "ScheduledQueryArn" -> ScheduledQueryArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScheduledQueryRequest]
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

  @js.native
  trait DescribeScheduledQueryRequest extends js.Object {
    var ScheduledQueryArn: AmazonResourceName
  }

  object DescribeScheduledQueryRequest {
    @inline
    def apply(
        ScheduledQueryArn: AmazonResourceName
    ): DescribeScheduledQueryRequest = {
      val __obj = js.Dynamic.literal(
        "ScheduledQueryArn" -> ScheduledQueryArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeScheduledQueryRequest]
    }
  }

  @js.native
  trait DescribeScheduledQueryResponse extends js.Object {
    var ScheduledQuery: ScheduledQueryDescription
  }

  object DescribeScheduledQueryResponse {
    @inline
    def apply(
        ScheduledQuery: ScheduledQueryDescription
    ): DescribeScheduledQueryResponse = {
      val __obj = js.Dynamic.literal(
        "ScheduledQuery" -> ScheduledQuery.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeScheduledQueryResponse]
    }
  }

  /** This type is used to map column(s) from the query result to a dimension in the destination table.
    */
  @js.native
  trait DimensionMapping extends js.Object {
    var DimensionValueType: DimensionValueType
    var Name: SchemaName
  }

  object DimensionMapping {
    @inline
    def apply(
        DimensionValueType: DimensionValueType,
        Name: SchemaName
    ): DimensionMapping = {
      val __obj = js.Dynamic.literal(
        "DimensionValueType" -> DimensionValueType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DimensionMapping]
    }
  }

  /** Represents an available endpoint against which to make API calls against, as well as the TTL for that endpoint.
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

  /** Configuration required for error reporting.
    */
  @js.native
  trait ErrorReportConfiguration extends js.Object {
    var S3Configuration: S3Configuration
  }

  object ErrorReportConfiguration {
    @inline
    def apply(
        S3Configuration: S3Configuration
    ): ErrorReportConfiguration = {
      val __obj = js.Dynamic.literal(
        "S3Configuration" -> S3Configuration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ErrorReportConfiguration]
    }
  }

  /** This contains the location of the error report for a single scheduled query call.
    */
  @js.native
  trait ErrorReportLocation extends js.Object {
    var S3ReportLocation: js.UndefOr[S3ReportLocation]
  }

  object ErrorReportLocation {
    @inline
    def apply(
        S3ReportLocation: js.UndefOr[S3ReportLocation] = js.undefined
    ): ErrorReportLocation = {
      val __obj = js.Dynamic.literal()
      S3ReportLocation.foreach(__v => __obj.updateDynamic("S3ReportLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorReportLocation]
    }
  }

  @js.native
  trait ExecuteScheduledQueryRequest extends js.Object {
    var InvocationTime: Time
    var ScheduledQueryArn: AmazonResourceName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object ExecuteScheduledQueryRequest {
    @inline
    def apply(
        InvocationTime: Time,
        ScheduledQueryArn: AmazonResourceName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): ExecuteScheduledQueryRequest = {
      val __obj = js.Dynamic.literal(
        "InvocationTime" -> InvocationTime.asInstanceOf[js.Any],
        "ScheduledQueryArn" -> ScheduledQueryArn.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteScheduledQueryRequest]
    }
  }

  /** Statistics for a single scheduled query run.
    */
  @js.native
  trait ExecutionStats extends js.Object {
    var BytesMetered: js.UndefOr[Double]
    var DataWrites: js.UndefOr[Double]
    var ExecutionTimeInMillis: js.UndefOr[Double]
    var QueryResultRows: js.UndefOr[Double]
    var RecordsIngested: js.UndefOr[Double]
  }

  object ExecutionStats {
    @inline
    def apply(
        BytesMetered: js.UndefOr[Double] = js.undefined,
        DataWrites: js.UndefOr[Double] = js.undefined,
        ExecutionTimeInMillis: js.UndefOr[Double] = js.undefined,
        QueryResultRows: js.UndefOr[Double] = js.undefined,
        RecordsIngested: js.UndefOr[Double] = js.undefined
    ): ExecutionStats = {
      val __obj = js.Dynamic.literal()
      BytesMetered.foreach(__v => __obj.updateDynamic("BytesMetered")(__v.asInstanceOf[js.Any]))
      DataWrites.foreach(__v => __obj.updateDynamic("DataWrites")(__v.asInstanceOf[js.Any]))
      ExecutionTimeInMillis.foreach(__v => __obj.updateDynamic("ExecutionTimeInMillis")(__v.asInstanceOf[js.Any]))
      QueryResultRows.foreach(__v => __obj.updateDynamic("QueryResultRows")(__v.asInstanceOf[js.Any]))
      RecordsIngested.foreach(__v => __obj.updateDynamic("RecordsIngested")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionStats]
    }
  }

  @js.native
  trait ListScheduledQueriesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxScheduledQueriesResults]
    var NextToken: js.UndefOr[NextScheduledQueriesResultsToken]
  }

  object ListScheduledQueriesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxScheduledQueriesResults] = js.undefined,
        NextToken: js.UndefOr[NextScheduledQueriesResultsToken] = js.undefined
    ): ListScheduledQueriesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScheduledQueriesRequest]
    }
  }

  @js.native
  trait ListScheduledQueriesResponse extends js.Object {
    var ScheduledQueries: ScheduledQueryList
    var NextToken: js.UndefOr[NextScheduledQueriesResultsToken]
  }

  object ListScheduledQueriesResponse {
    @inline
    def apply(
        ScheduledQueries: ScheduledQueryList,
        NextToken: js.UndefOr[NextScheduledQueriesResultsToken] = js.undefined
    ): ListScheduledQueriesResponse = {
      val __obj = js.Dynamic.literal(
        "ScheduledQueries" -> ScheduledQueries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScheduledQueriesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var MaxResults: js.UndefOr[MaxTagsForResourceResult]
    var NextToken: js.UndefOr[NextTagsForResourceResultsToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        MaxResults: js.UndefOr[MaxTagsForResourceResult] = js.undefined,
        NextToken: js.UndefOr[NextTagsForResourceResultsToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: TagList
    var NextToken: js.UndefOr[NextTagsForResourceResultsToken]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: TagList,
        NextToken: js.UndefOr[NextTagsForResourceResultsToken] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** MixedMeasureMappings are mappings that can be used to ingest data into a mixture of narrow and multi measures in the derived table.
    */
  @js.native
  trait MixedMeasureMapping extends js.Object {
    var MeasureValueType: MeasureValueType
    var MeasureName: js.UndefOr[SchemaName]
    var MultiMeasureAttributeMappings: js.UndefOr[MultiMeasureAttributeMappingList]
    var SourceColumn: js.UndefOr[SchemaName]
    var TargetMeasureName: js.UndefOr[SchemaName]
  }

  object MixedMeasureMapping {
    @inline
    def apply(
        MeasureValueType: MeasureValueType,
        MeasureName: js.UndefOr[SchemaName] = js.undefined,
        MultiMeasureAttributeMappings: js.UndefOr[MultiMeasureAttributeMappingList] = js.undefined,
        SourceColumn: js.UndefOr[SchemaName] = js.undefined,
        TargetMeasureName: js.UndefOr[SchemaName] = js.undefined
    ): MixedMeasureMapping = {
      val __obj = js.Dynamic.literal(
        "MeasureValueType" -> MeasureValueType.asInstanceOf[js.Any]
      )

      MeasureName.foreach(__v => __obj.updateDynamic("MeasureName")(__v.asInstanceOf[js.Any]))
      MultiMeasureAttributeMappings.foreach(__v => __obj.updateDynamic("MultiMeasureAttributeMappings")(__v.asInstanceOf[js.Any]))
      SourceColumn.foreach(__v => __obj.updateDynamic("SourceColumn")(__v.asInstanceOf[js.Any]))
      TargetMeasureName.foreach(__v => __obj.updateDynamic("TargetMeasureName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MixedMeasureMapping]
    }
  }

  /** Attribute mapping for MULTI value measures.
    */
  @js.native
  trait MultiMeasureAttributeMapping extends js.Object {
    var MeasureValueType: ScalarMeasureValueType
    var SourceColumn: SchemaName
    var TargetMultiMeasureAttributeName: js.UndefOr[SchemaName]
  }

  object MultiMeasureAttributeMapping {
    @inline
    def apply(
        MeasureValueType: ScalarMeasureValueType,
        SourceColumn: SchemaName,
        TargetMultiMeasureAttributeName: js.UndefOr[SchemaName] = js.undefined
    ): MultiMeasureAttributeMapping = {
      val __obj = js.Dynamic.literal(
        "MeasureValueType" -> MeasureValueType.asInstanceOf[js.Any],
        "SourceColumn" -> SourceColumn.asInstanceOf[js.Any]
      )

      TargetMultiMeasureAttributeName.foreach(__v => __obj.updateDynamic("TargetMultiMeasureAttributeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiMeasureAttributeMapping]
    }
  }

  /** Only one of MixedMeasureMappings or MultiMeasureMappings is to be provided. MultiMeasureMappings can be used to ingest data as multi measures in the derived table.
    */
  @js.native
  trait MultiMeasureMappings extends js.Object {
    var MultiMeasureAttributeMappings: MultiMeasureAttributeMappingList
    var TargetMultiMeasureName: js.UndefOr[SchemaName]
  }

  object MultiMeasureMappings {
    @inline
    def apply(
        MultiMeasureAttributeMappings: MultiMeasureAttributeMappingList,
        TargetMultiMeasureName: js.UndefOr[SchemaName] = js.undefined
    ): MultiMeasureMappings = {
      val __obj = js.Dynamic.literal(
        "MultiMeasureAttributeMappings" -> MultiMeasureAttributeMappings.asInstanceOf[js.Any]
      )

      TargetMultiMeasureName.foreach(__v => __obj.updateDynamic("TargetMultiMeasureName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiMeasureMappings]
    }
  }

  /** Notification configuration for a scheduled query. A notification is sent by Timestream when a scheduled query is created, its state is updated or when it is deleted.
    */
  @js.native
  trait NotificationConfiguration extends js.Object {
    var SnsConfiguration: SnsConfiguration
  }

  object NotificationConfiguration {
    @inline
    def apply(
        SnsConfiguration: SnsConfiguration
    ): NotificationConfiguration = {
      val __obj = js.Dynamic.literal(
        "SnsConfiguration" -> SnsConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NotificationConfiguration]
    }
  }

  /** Mapping for named parameters.
    */
  @js.native
  trait ParameterMapping extends js.Object {
    var Name: String
    var Type: Type
  }

  object ParameterMapping {
    @inline
    def apply(
        Name: String,
        Type: Type
    ): ParameterMapping = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ParameterMapping]
    }
  }

  @js.native
  trait PrepareQueryRequest extends js.Object {
    var QueryString: QueryString
    var ValidateOnly: js.UndefOr[NullableBoolean]
  }

  object PrepareQueryRequest {
    @inline
    def apply(
        QueryString: QueryString,
        ValidateOnly: js.UndefOr[NullableBoolean] = js.undefined
    ): PrepareQueryRequest = {
      val __obj = js.Dynamic.literal(
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      ValidateOnly.foreach(__v => __obj.updateDynamic("ValidateOnly")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrepareQueryRequest]
    }
  }

  @js.native
  trait PrepareQueryResponse extends js.Object {
    var Columns: SelectColumnList
    var Parameters: ParameterMappingList
    var QueryString: QueryString
  }

  object PrepareQueryResponse {
    @inline
    def apply(
        Columns: SelectColumnList,
        Parameters: ParameterMappingList,
        QueryString: QueryString
    ): PrepareQueryResponse = {
      val __obj = js.Dynamic.literal(
        "Columns" -> Columns.asInstanceOf[js.Any],
        "Parameters" -> Parameters.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PrepareQueryResponse]
    }
  }

  @js.native
  trait QueryRequest extends js.Object {
    var QueryString: QueryString
    var ClientToken: js.UndefOr[ClientRequestToken]
    var MaxRows: js.UndefOr[MaxQueryResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object QueryRequest {
    @inline
    def apply(
        QueryString: QueryString,
        ClientToken: js.UndefOr[ClientRequestToken] = js.undefined,
        MaxRows: js.UndefOr[MaxQueryResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
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
    var NextToken: js.UndefOr[PaginationToken]
    var QueryStatus: js.UndefOr[QueryStatus]
  }

  object QueryResponse {
    @inline
    def apply(
        ColumnInfo: ColumnInfoList,
        QueryId: QueryId,
        Rows: RowList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
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

  /** Information about the status of the query, including progress and bytes scanned.
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

  /** Details on S3 location for error reports that result from running a query.
    */
  @js.native
  trait S3Configuration extends js.Object {
    var BucketName: S3BucketName
    var EncryptionOption: js.UndefOr[S3EncryptionOption]
    var ObjectKeyPrefix: js.UndefOr[S3ObjectKeyPrefix]
  }

  object S3Configuration {
    @inline
    def apply(
        BucketName: S3BucketName,
        EncryptionOption: js.UndefOr[S3EncryptionOption] = js.undefined,
        ObjectKeyPrefix: js.UndefOr[S3ObjectKeyPrefix] = js.undefined
    ): S3Configuration = {
      val __obj = js.Dynamic.literal(
        "BucketName" -> BucketName.asInstanceOf[js.Any]
      )

      EncryptionOption.foreach(__v => __obj.updateDynamic("EncryptionOption")(__v.asInstanceOf[js.Any]))
      ObjectKeyPrefix.foreach(__v => __obj.updateDynamic("ObjectKeyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Configuration]
    }
  }

  /** S3 report location for the scheduled query run.
    */
  @js.native
  trait S3ReportLocation extends js.Object {
    var BucketName: js.UndefOr[S3BucketName]
    var ObjectKey: js.UndefOr[S3ObjectKey]
  }

  object S3ReportLocation {
    @inline
    def apply(
        BucketName: js.UndefOr[S3BucketName] = js.undefined,
        ObjectKey: js.UndefOr[S3ObjectKey] = js.undefined
    ): S3ReportLocation = {
      val __obj = js.Dynamic.literal()
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      ObjectKey.foreach(__v => __obj.updateDynamic("ObjectKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ReportLocation]
    }
  }

  /** Configuration of the schedule of the query.
    */
  @js.native
  trait ScheduleConfiguration extends js.Object {
    var ScheduleExpression: ScheduleExpression
  }

  object ScheduleConfiguration {
    @inline
    def apply(
        ScheduleExpression: ScheduleExpression
    ): ScheduleConfiguration = {
      val __obj = js.Dynamic.literal(
        "ScheduleExpression" -> ScheduleExpression.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScheduleConfiguration]
    }
  }

  /** Scheduled Query
    */
  @js.native
  trait ScheduledQuery extends js.Object {
    var Arn: AmazonResourceName
    var Name: ScheduledQueryName
    var State: ScheduledQueryState
    var CreationTime: js.UndefOr[Time]
    var ErrorReportConfiguration: js.UndefOr[ErrorReportConfiguration]
    var LastRunStatus: js.UndefOr[ScheduledQueryRunStatus]
    var NextInvocationTime: js.UndefOr[Time]
    var PreviousInvocationTime: js.UndefOr[Time]
    var TargetDestination: js.UndefOr[TargetDestination]
  }

  object ScheduledQuery {
    @inline
    def apply(
        Arn: AmazonResourceName,
        Name: ScheduledQueryName,
        State: ScheduledQueryState,
        CreationTime: js.UndefOr[Time] = js.undefined,
        ErrorReportConfiguration: js.UndefOr[ErrorReportConfiguration] = js.undefined,
        LastRunStatus: js.UndefOr[ScheduledQueryRunStatus] = js.undefined,
        NextInvocationTime: js.UndefOr[Time] = js.undefined,
        PreviousInvocationTime: js.UndefOr[Time] = js.undefined,
        TargetDestination: js.UndefOr[TargetDestination] = js.undefined
    ): ScheduledQuery = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ErrorReportConfiguration.foreach(__v => __obj.updateDynamic("ErrorReportConfiguration")(__v.asInstanceOf[js.Any]))
      LastRunStatus.foreach(__v => __obj.updateDynamic("LastRunStatus")(__v.asInstanceOf[js.Any]))
      NextInvocationTime.foreach(__v => __obj.updateDynamic("NextInvocationTime")(__v.asInstanceOf[js.Any]))
      PreviousInvocationTime.foreach(__v => __obj.updateDynamic("PreviousInvocationTime")(__v.asInstanceOf[js.Any]))
      TargetDestination.foreach(__v => __obj.updateDynamic("TargetDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledQuery]
    }
  }

  /** Structure that describes scheduled query.
    */
  @js.native
  trait ScheduledQueryDescription extends js.Object {
    var Arn: AmazonResourceName
    var Name: ScheduledQueryName
    var NotificationConfiguration: NotificationConfiguration
    var QueryString: QueryString
    var ScheduleConfiguration: ScheduleConfiguration
    var State: ScheduledQueryState
    var CreationTime: js.UndefOr[Time]
    var ErrorReportConfiguration: js.UndefOr[ErrorReportConfiguration]
    var KmsKeyId: js.UndefOr[StringValue2048]
    var LastRunSummary: js.UndefOr[ScheduledQueryRunSummary]
    var NextInvocationTime: js.UndefOr[Time]
    var PreviousInvocationTime: js.UndefOr[Time]
    var RecentlyFailedRuns: js.UndefOr[ScheduledQueryRunSummaryList]
    var ScheduledQueryExecutionRoleArn: js.UndefOr[AmazonResourceName]
    var TargetConfiguration: js.UndefOr[TargetConfiguration]
  }

  object ScheduledQueryDescription {
    @inline
    def apply(
        Arn: AmazonResourceName,
        Name: ScheduledQueryName,
        NotificationConfiguration: NotificationConfiguration,
        QueryString: QueryString,
        ScheduleConfiguration: ScheduleConfiguration,
        State: ScheduledQueryState,
        CreationTime: js.UndefOr[Time] = js.undefined,
        ErrorReportConfiguration: js.UndefOr[ErrorReportConfiguration] = js.undefined,
        KmsKeyId: js.UndefOr[StringValue2048] = js.undefined,
        LastRunSummary: js.UndefOr[ScheduledQueryRunSummary] = js.undefined,
        NextInvocationTime: js.UndefOr[Time] = js.undefined,
        PreviousInvocationTime: js.UndefOr[Time] = js.undefined,
        RecentlyFailedRuns: js.UndefOr[ScheduledQueryRunSummaryList] = js.undefined,
        ScheduledQueryExecutionRoleArn: js.UndefOr[AmazonResourceName] = js.undefined,
        TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined
    ): ScheduledQueryDescription = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "NotificationConfiguration" -> NotificationConfiguration.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any],
        "ScheduleConfiguration" -> ScheduleConfiguration.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ErrorReportConfiguration.foreach(__v => __obj.updateDynamic("ErrorReportConfiguration")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LastRunSummary.foreach(__v => __obj.updateDynamic("LastRunSummary")(__v.asInstanceOf[js.Any]))
      NextInvocationTime.foreach(__v => __obj.updateDynamic("NextInvocationTime")(__v.asInstanceOf[js.Any]))
      PreviousInvocationTime.foreach(__v => __obj.updateDynamic("PreviousInvocationTime")(__v.asInstanceOf[js.Any]))
      RecentlyFailedRuns.foreach(__v => __obj.updateDynamic("RecentlyFailedRuns")(__v.asInstanceOf[js.Any]))
      ScheduledQueryExecutionRoleArn.foreach(__v => __obj.updateDynamic("ScheduledQueryExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      TargetConfiguration.foreach(__v => __obj.updateDynamic("TargetConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledQueryDescription]
    }
  }

  /** Run summary for the scheduled query
    */
  @js.native
  trait ScheduledQueryRunSummary extends js.Object {
    var ErrorReportLocation: js.UndefOr[ErrorReportLocation]
    var ExecutionStats: js.UndefOr[ExecutionStats]
    var FailureReason: js.UndefOr[ErrorMessage]
    var InvocationTime: js.UndefOr[Time]
    var RunStatus: js.UndefOr[ScheduledQueryRunStatus]
    var TriggerTime: js.UndefOr[Time]
  }

  object ScheduledQueryRunSummary {
    @inline
    def apply(
        ErrorReportLocation: js.UndefOr[ErrorReportLocation] = js.undefined,
        ExecutionStats: js.UndefOr[ExecutionStats] = js.undefined,
        FailureReason: js.UndefOr[ErrorMessage] = js.undefined,
        InvocationTime: js.UndefOr[Time] = js.undefined,
        RunStatus: js.UndefOr[ScheduledQueryRunStatus] = js.undefined,
        TriggerTime: js.UndefOr[Time] = js.undefined
    ): ScheduledQueryRunSummary = {
      val __obj = js.Dynamic.literal()
      ErrorReportLocation.foreach(__v => __obj.updateDynamic("ErrorReportLocation")(__v.asInstanceOf[js.Any]))
      ExecutionStats.foreach(__v => __obj.updateDynamic("ExecutionStats")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      InvocationTime.foreach(__v => __obj.updateDynamic("InvocationTime")(__v.asInstanceOf[js.Any]))
      RunStatus.foreach(__v => __obj.updateDynamic("RunStatus")(__v.asInstanceOf[js.Any]))
      TriggerTime.foreach(__v => __obj.updateDynamic("TriggerTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledQueryRunSummary]
    }
  }

  /** Details of the column that is returned by the query.
    */
  @js.native
  trait SelectColumn extends js.Object {
    var Aliased: js.UndefOr[NullableBoolean]
    var DatabaseName: js.UndefOr[ResourceName]
    var Name: js.UndefOr[String]
    var TableName: js.UndefOr[ResourceName]
    var Type: js.UndefOr[Type]
  }

  object SelectColumn {
    @inline
    def apply(
        Aliased: js.UndefOr[NullableBoolean] = js.undefined,
        DatabaseName: js.UndefOr[ResourceName] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        TableName: js.UndefOr[ResourceName] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): SelectColumn = {
      val __obj = js.Dynamic.literal()
      Aliased.foreach(__v => __obj.updateDynamic("Aliased")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectColumn]
    }
  }

  /** Details on SNS that are required to send the notification.
    */
  @js.native
  trait SnsConfiguration extends js.Object {
    var TopicArn: AmazonResourceName
  }

  object SnsConfiguration {
    @inline
    def apply(
        TopicArn: AmazonResourceName
    ): SnsConfiguration = {
      val __obj = js.Dynamic.literal(
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SnsConfiguration]
    }
  }

  /** A tag is a label that you assign to a Timestream database and/or table. Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize databases and/or tables, for example, by purpose, owner, or environment.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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

  /** Configuration used for writing the output of a query.
    */
  @js.native
  trait TargetConfiguration extends js.Object {
    var TimestreamConfiguration: TimestreamConfiguration
  }

  object TargetConfiguration {
    @inline
    def apply(
        TimestreamConfiguration: TimestreamConfiguration
    ): TargetConfiguration = {
      val __obj = js.Dynamic.literal(
        "TimestreamConfiguration" -> TimestreamConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TargetConfiguration]
    }
  }

  /** Destination details to write data for a target data source. Current supported data source is Timestream.
    */
  @js.native
  trait TargetDestination extends js.Object {
    var TimestreamDestination: js.UndefOr[TimestreamDestination]
  }

  object TargetDestination {
    @inline
    def apply(
        TimestreamDestination: js.UndefOr[TimestreamDestination] = js.undefined
    ): TargetDestination = {
      val __obj = js.Dynamic.literal()
      TimestreamDestination.foreach(__v => __obj.updateDynamic("TimestreamDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetDestination]
    }
  }

  /** The timeseries data type represents the values of a measure over time. A time series is an array of rows of timestamps and measure values, with rows sorted in ascending order of time. A TimeSeriesDataPoint is a single data point in the time series. It represents a tuple of (time, measure value) in a time series.
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

  /** Configuration to write data into Timestream database and table. This configuration allows the user to map the query result select columns into the destination table columns.
    */
  @js.native
  trait TimestreamConfiguration extends js.Object {
    var DatabaseName: ResourceName
    var DimensionMappings: DimensionMappingList
    var TableName: ResourceName
    var TimeColumn: SchemaName
    var MeasureNameColumn: js.UndefOr[SchemaName]
    var MixedMeasureMappings: js.UndefOr[MixedMeasureMappingList]
    var MultiMeasureMappings: js.UndefOr[MultiMeasureMappings]
  }

  object TimestreamConfiguration {
    @inline
    def apply(
        DatabaseName: ResourceName,
        DimensionMappings: DimensionMappingList,
        TableName: ResourceName,
        TimeColumn: SchemaName,
        MeasureNameColumn: js.UndefOr[SchemaName] = js.undefined,
        MixedMeasureMappings: js.UndefOr[MixedMeasureMappingList] = js.undefined,
        MultiMeasureMappings: js.UndefOr[MultiMeasureMappings] = js.undefined
    ): TimestreamConfiguration = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "DimensionMappings" -> DimensionMappings.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "TimeColumn" -> TimeColumn.asInstanceOf[js.Any]
      )

      MeasureNameColumn.foreach(__v => __obj.updateDynamic("MeasureNameColumn")(__v.asInstanceOf[js.Any]))
      MixedMeasureMappings.foreach(__v => __obj.updateDynamic("MixedMeasureMappings")(__v.asInstanceOf[js.Any]))
      MultiMeasureMappings.foreach(__v => __obj.updateDynamic("MultiMeasureMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimestreamConfiguration]
    }
  }

  /** Destination for scheduled query.
    */
  @js.native
  trait TimestreamDestination extends js.Object {
    var DatabaseName: js.UndefOr[ResourceName]
    var TableName: js.UndefOr[ResourceName]
  }

  object TimestreamDestination {
    @inline
    def apply(
        DatabaseName: js.UndefOr[ResourceName] = js.undefined,
        TableName: js.UndefOr[ResourceName] = js.undefined
    ): TimestreamDestination = {
      val __obj = js.Dynamic.literal()
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimestreamDestination]
    }
  }

  /** Contains the data type of a column in a query result set. The data type can be scalar or complex. The supported scalar data types are integers, Boolean, string, double, timestamp, date, time, and intervals. The supported complex data types are arrays, rows, and timeseries.
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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
  trait UpdateScheduledQueryRequest extends js.Object {
    var ScheduledQueryArn: AmazonResourceName
    var State: ScheduledQueryState
  }

  object UpdateScheduledQueryRequest {
    @inline
    def apply(
        ScheduledQueryArn: AmazonResourceName,
        State: ScheduledQueryState
    ): UpdateScheduledQueryRequest = {
      val __obj = js.Dynamic.literal(
        "ScheduledQueryArn" -> ScheduledQueryArn.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateScheduledQueryRequest]
    }
  }
}
