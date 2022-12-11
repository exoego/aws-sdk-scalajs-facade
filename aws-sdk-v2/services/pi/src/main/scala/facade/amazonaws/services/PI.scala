package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object pi {
  type AdditionalMetricsList = js.Array[RequestString]
  type AdditionalMetricsMap = js.Dictionary[Double]
  type DataPointsList = js.Array[DataPoint]
  type Description = String
  type DimensionDetailList = js.Array[DimensionDetail]
  type DimensionGroupDetailList = js.Array[DimensionGroupDetail]
  type DimensionKeyDescriptionList = js.Array[DimensionKeyDescription]
  type DimensionKeyDetailList = js.Array[DimensionKeyDetail]
  type DimensionMap = js.Dictionary[RequestString]
  type DimensionsMetricList = js.Array[RequestString]
  type FeatureMetadataMap = js.Dictionary[FeatureMetadata]
  type ISOTimestamp = js.Date
  type IdentifierString = String
  type Limit = Int
  type MaxResults = Int
  type MetricDimensionsList = js.Array[MetricDimensionGroups]
  type MetricKeyDataPointsList = js.Array[MetricKeyDataPoints]
  type MetricQueryFilterMap = js.Dictionary[RequestString]
  type MetricQueryList = js.Array[MetricQuery]
  type MetricTypeList = js.Array[RequestString]
  type MetricValuesList = js.Array[Double]
  type NextToken = String
  type RequestString = String
  type RequestStringList = js.Array[RequestString]
  type RequestedDimensionList = js.Array[RequestString]
  type ResponsePartitionKeyList = js.Array[ResponsePartitionKey]
  type ResponseResourceMetricList = js.Array[ResponseResourceMetric]

  final class PIOps(private val service: PI) extends AnyVal {

    @inline def describeDimensionKeysFuture(params: DescribeDimensionKeysRequest): Future[DescribeDimensionKeysResponse] = service.describeDimensionKeys(params).promise().toFuture
    @inline def getDimensionKeyDetailsFuture(params: GetDimensionKeyDetailsRequest): Future[GetDimensionKeyDetailsResponse] = service.getDimensionKeyDetails(params).promise().toFuture
    @inline def getResourceMetadataFuture(params: GetResourceMetadataRequest): Future[GetResourceMetadataResponse] = service.getResourceMetadata(params).promise().toFuture
    @inline def getResourceMetricsFuture(params: GetResourceMetricsRequest): Future[GetResourceMetricsResponse] = service.getResourceMetrics(params).promise().toFuture
    @inline def listAvailableResourceDimensionsFuture(params: ListAvailableResourceDimensionsRequest): Future[ListAvailableResourceDimensionsResponse] = service.listAvailableResourceDimensions(params).promise().toFuture
    @inline def listAvailableResourceMetricsFuture(params: ListAvailableResourceMetricsRequest): Future[ListAvailableResourceMetricsResponse] = service.listAvailableResourceMetrics(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/pi", JSImport.Namespace, "AWS.PI")
  class PI() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeDimensionKeys(params: DescribeDimensionKeysRequest): Request[DescribeDimensionKeysResponse] = js.native
    def getDimensionKeyDetails(params: GetDimensionKeyDetailsRequest): Request[GetDimensionKeyDetailsResponse] = js.native
    def getResourceMetadata(params: GetResourceMetadataRequest): Request[GetResourceMetadataResponse] = js.native
    def getResourceMetrics(params: GetResourceMetricsRequest): Request[GetResourceMetricsResponse] = js.native
    def listAvailableResourceDimensions(params: ListAvailableResourceDimensionsRequest): Request[ListAvailableResourceDimensionsResponse] = js.native
    def listAvailableResourceMetrics(params: ListAvailableResourceMetricsRequest): Request[ListAvailableResourceMetricsResponse] = js.native
  }
  object PI {
    @inline implicit def toOps(service: PI): PIOps = {
      new PIOps(service)
    }
  }

  /** A timestamp, and a single numerical value, which together represent a measurement at a particular point in time.
    */
  @js.native
  trait DataPoint extends js.Object {
    var Timestamp: ISOTimestamp
    var Value: Double
  }

  object DataPoint {
    @inline
    def apply(
        Timestamp: ISOTimestamp,
        Value: Double
    ): DataPoint = {
      val __obj = js.Dynamic.literal(
        "Timestamp" -> Timestamp.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataPoint]
    }
  }

  @js.native
  trait DescribeDimensionKeysRequest extends js.Object {
    var EndTime: ISOTimestamp
    var GroupBy: DimensionGroup
    var Identifier: RequestString
    var Metric: RequestString
    var ServiceType: ServiceType
    var StartTime: ISOTimestamp
    var AdditionalMetrics: js.UndefOr[AdditionalMetricsList]
    var Filter: js.UndefOr[MetricQueryFilterMap]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PartitionBy: js.UndefOr[DimensionGroup]
    var PeriodInSeconds: js.UndefOr[Int]
  }

  object DescribeDimensionKeysRequest {
    @inline
    def apply(
        EndTime: ISOTimestamp,
        GroupBy: DimensionGroup,
        Identifier: RequestString,
        Metric: RequestString,
        ServiceType: ServiceType,
        StartTime: ISOTimestamp,
        AdditionalMetrics: js.UndefOr[AdditionalMetricsList] = js.undefined,
        Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PartitionBy: js.UndefOr[DimensionGroup] = js.undefined,
        PeriodInSeconds: js.UndefOr[Int] = js.undefined
    ): DescribeDimensionKeysRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "GroupBy" -> GroupBy.asInstanceOf[js.Any],
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "Metric" -> Metric.asInstanceOf[js.Any],
        "ServiceType" -> ServiceType.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      AdditionalMetrics.foreach(__v => __obj.updateDynamic("AdditionalMetrics")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PartitionBy.foreach(__v => __obj.updateDynamic("PartitionBy")(__v.asInstanceOf[js.Any]))
      PeriodInSeconds.foreach(__v => __obj.updateDynamic("PeriodInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDimensionKeysRequest]
    }
  }

  @js.native
  trait DescribeDimensionKeysResponse extends js.Object {
    var AlignedEndTime: js.UndefOr[ISOTimestamp]
    var AlignedStartTime: js.UndefOr[ISOTimestamp]
    var Keys: js.UndefOr[DimensionKeyDescriptionList]
    var NextToken: js.UndefOr[NextToken]
    var PartitionKeys: js.UndefOr[ResponsePartitionKeyList]
  }

  object DescribeDimensionKeysResponse {
    @inline
    def apply(
        AlignedEndTime: js.UndefOr[ISOTimestamp] = js.undefined,
        AlignedStartTime: js.UndefOr[ISOTimestamp] = js.undefined,
        Keys: js.UndefOr[DimensionKeyDescriptionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PartitionKeys: js.UndefOr[ResponsePartitionKeyList] = js.undefined
    ): DescribeDimensionKeysResponse = {
      val __obj = js.Dynamic.literal()
      AlignedEndTime.foreach(__v => __obj.updateDynamic("AlignedEndTime")(__v.asInstanceOf[js.Any]))
      AlignedStartTime.foreach(__v => __obj.updateDynamic("AlignedStartTime")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PartitionKeys.foreach(__v => __obj.updateDynamic("PartitionKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDimensionKeysResponse]
    }
  }

  /** The information about a dimension.
    */
  @js.native
  trait DimensionDetail extends js.Object {
    var Identifier: js.UndefOr[String]
  }

  object DimensionDetail {
    @inline
    def apply(
        Identifier: js.UndefOr[String] = js.undefined
    ): DimensionDetail = {
      val __obj = js.Dynamic.literal()
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionDetail]
    }
  }

  /** A logical grouping of Performance Insights metrics for a related subject area. For example, the <code>db.sql</code> dimension group consists of the following dimensions: * <code>db.sql.id</code> - The hash of a running SQL statement, generated by Performance Insights. * <code>db.sql.db_id</code> - Either the SQL ID generated by the database engine, or a value generated by Performance Insights that begins with <code>pi-</code>. * <code>db.sql.statement</code> - The full text of the SQL statement that is running, for example, <code>SELECT * FROM employees</code>. * <code>db.sql_tokenized.id</code> - The hash of the SQL digest generated by Performance Insights. '''Note:'''Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first 500 bytes are returned.
    */
  @js.native
  trait DimensionGroup extends js.Object {
    var Group: RequestString
    var Dimensions: js.UndefOr[RequestStringList]
    var Limit: js.UndefOr[Limit]
  }

  object DimensionGroup {
    @inline
    def apply(
        Group: RequestString,
        Dimensions: js.UndefOr[RequestStringList] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined
    ): DimensionGroup = {
      val __obj = js.Dynamic.literal(
        "Group" -> Group.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionGroup]
    }
  }

  /** Information about dimensions within a dimension group.
    */
  @js.native
  trait DimensionGroupDetail extends js.Object {
    var Dimensions: js.UndefOr[DimensionDetailList]
    var Group: js.UndefOr[String]
  }

  object DimensionGroupDetail {
    @inline
    def apply(
        Dimensions: js.UndefOr[DimensionDetailList] = js.undefined,
        Group: js.UndefOr[String] = js.undefined
    ): DimensionGroupDetail = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionGroupDetail]
    }
  }

  /** An object that includes the requested dimension key values and aggregated metric values within a dimension group.
    */
  @js.native
  trait DimensionKeyDescription extends js.Object {
    var AdditionalMetrics: js.UndefOr[AdditionalMetricsMap]
    var Dimensions: js.UndefOr[DimensionMap]
    var Partitions: js.UndefOr[MetricValuesList]
    var Total: js.UndefOr[Double]
  }

  object DimensionKeyDescription {
    @inline
    def apply(
        AdditionalMetrics: js.UndefOr[AdditionalMetricsMap] = js.undefined,
        Dimensions: js.UndefOr[DimensionMap] = js.undefined,
        Partitions: js.UndefOr[MetricValuesList] = js.undefined,
        Total: js.UndefOr[Double] = js.undefined
    ): DimensionKeyDescription = {
      val __obj = js.Dynamic.literal()
      AdditionalMetrics.foreach(__v => __obj.updateDynamic("AdditionalMetrics")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      Partitions.foreach(__v => __obj.updateDynamic("Partitions")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionKeyDescription]
    }
  }

  /** An object that describes the details for a specified dimension.
    */
  @js.native
  trait DimensionKeyDetail extends js.Object {
    var Dimension: js.UndefOr[String]
    var Status: js.UndefOr[DetailStatus]
    var Value: js.UndefOr[String]
  }

  object DimensionKeyDetail {
    @inline
    def apply(
        Dimension: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[DetailStatus] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): DimensionKeyDetail = {
      val __obj = js.Dynamic.literal()
      Dimension.foreach(__v => __obj.updateDynamic("Dimension")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionKeyDetail]
    }
  }

  /** The metadata for a feature. For example, the metadata might indicate that a feature is turned on or off on a specific DB instance.
    */
  @js.native
  trait FeatureMetadata extends js.Object {
    var Status: js.UndefOr[FeatureStatus]
  }

  object FeatureMetadata {
    @inline
    def apply(
        Status: js.UndefOr[FeatureStatus] = js.undefined
    ): FeatureMetadata = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FeatureMetadata]
    }
  }

  @js.native
  trait GetDimensionKeyDetailsRequest extends js.Object {
    var Group: RequestString
    var GroupIdentifier: RequestString
    var Identifier: IdentifierString
    var ServiceType: ServiceType
    var RequestedDimensions: js.UndefOr[RequestedDimensionList]
  }

  object GetDimensionKeyDetailsRequest {
    @inline
    def apply(
        Group: RequestString,
        GroupIdentifier: RequestString,
        Identifier: IdentifierString,
        ServiceType: ServiceType,
        RequestedDimensions: js.UndefOr[RequestedDimensionList] = js.undefined
    ): GetDimensionKeyDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "Group" -> Group.asInstanceOf[js.Any],
        "GroupIdentifier" -> GroupIdentifier.asInstanceOf[js.Any],
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "ServiceType" -> ServiceType.asInstanceOf[js.Any]
      )

      RequestedDimensions.foreach(__v => __obj.updateDynamic("RequestedDimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDimensionKeyDetailsRequest]
    }
  }

  @js.native
  trait GetDimensionKeyDetailsResponse extends js.Object {
    var Dimensions: js.UndefOr[DimensionKeyDetailList]
  }

  object GetDimensionKeyDetailsResponse {
    @inline
    def apply(
        Dimensions: js.UndefOr[DimensionKeyDetailList] = js.undefined
    ): GetDimensionKeyDetailsResponse = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDimensionKeyDetailsResponse]
    }
  }

  @js.native
  trait GetResourceMetadataRequest extends js.Object {
    var Identifier: RequestString
    var ServiceType: ServiceType
  }

  object GetResourceMetadataRequest {
    @inline
    def apply(
        Identifier: RequestString,
        ServiceType: ServiceType
    ): GetResourceMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "ServiceType" -> ServiceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourceMetadataRequest]
    }
  }

  @js.native
  trait GetResourceMetadataResponse extends js.Object {
    var Features: js.UndefOr[FeatureMetadataMap]
    var Identifier: js.UndefOr[String]
  }

  object GetResourceMetadataResponse {
    @inline
    def apply(
        Features: js.UndefOr[FeatureMetadataMap] = js.undefined,
        Identifier: js.UndefOr[String] = js.undefined
    ): GetResourceMetadataResponse = {
      val __obj = js.Dynamic.literal()
      Features.foreach(__v => __obj.updateDynamic("Features")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceMetadataResponse]
    }
  }

  @js.native
  trait GetResourceMetricsRequest extends js.Object {
    var EndTime: ISOTimestamp
    var Identifier: RequestString
    var MetricQueries: MetricQueryList
    var ServiceType: ServiceType
    var StartTime: ISOTimestamp
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PeriodInSeconds: js.UndefOr[Int]
  }

  object GetResourceMetricsRequest {
    @inline
    def apply(
        EndTime: ISOTimestamp,
        Identifier: RequestString,
        MetricQueries: MetricQueryList,
        ServiceType: ServiceType,
        StartTime: ISOTimestamp,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PeriodInSeconds: js.UndefOr[Int] = js.undefined
    ): GetResourceMetricsRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "MetricQueries" -> MetricQueries.asInstanceOf[js.Any],
        "ServiceType" -> ServiceType.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PeriodInSeconds.foreach(__v => __obj.updateDynamic("PeriodInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceMetricsRequest]
    }
  }

  @js.native
  trait GetResourceMetricsResponse extends js.Object {
    var AlignedEndTime: js.UndefOr[ISOTimestamp]
    var AlignedStartTime: js.UndefOr[ISOTimestamp]
    var Identifier: js.UndefOr[String]
    var MetricList: js.UndefOr[MetricKeyDataPointsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetResourceMetricsResponse {
    @inline
    def apply(
        AlignedEndTime: js.UndefOr[ISOTimestamp] = js.undefined,
        AlignedStartTime: js.UndefOr[ISOTimestamp] = js.undefined,
        Identifier: js.UndefOr[String] = js.undefined,
        MetricList: js.UndefOr[MetricKeyDataPointsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetResourceMetricsResponse = {
      val __obj = js.Dynamic.literal()
      AlignedEndTime.foreach(__v => __obj.updateDynamic("AlignedEndTime")(__v.asInstanceOf[js.Any]))
      AlignedStartTime.foreach(__v => __obj.updateDynamic("AlignedStartTime")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      MetricList.foreach(__v => __obj.updateDynamic("MetricList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceMetricsResponse]
    }
  }

  @js.native
  trait ListAvailableResourceDimensionsRequest extends js.Object {
    var Identifier: RequestString
    var Metrics: DimensionsMetricList
    var ServiceType: ServiceType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAvailableResourceDimensionsRequest {
    @inline
    def apply(
        Identifier: RequestString,
        Metrics: DimensionsMetricList,
        ServiceType: ServiceType,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAvailableResourceDimensionsRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "Metrics" -> Metrics.asInstanceOf[js.Any],
        "ServiceType" -> ServiceType.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableResourceDimensionsRequest]
    }
  }

  @js.native
  trait ListAvailableResourceDimensionsResponse extends js.Object {
    var MetricDimensions: js.UndefOr[MetricDimensionsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAvailableResourceDimensionsResponse {
    @inline
    def apply(
        MetricDimensions: js.UndefOr[MetricDimensionsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAvailableResourceDimensionsResponse = {
      val __obj = js.Dynamic.literal()
      MetricDimensions.foreach(__v => __obj.updateDynamic("MetricDimensions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableResourceDimensionsResponse]
    }
  }

  @js.native
  trait ListAvailableResourceMetricsRequest extends js.Object {
    var Identifier: RequestString
    var MetricTypes: MetricTypeList
    var ServiceType: ServiceType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAvailableResourceMetricsRequest {
    @inline
    def apply(
        Identifier: RequestString,
        MetricTypes: MetricTypeList,
        ServiceType: ServiceType,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAvailableResourceMetricsRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "MetricTypes" -> MetricTypes.asInstanceOf[js.Any],
        "ServiceType" -> ServiceType.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableResourceMetricsRequest]
    }
  }

  @js.native
  trait ListAvailableResourceMetricsResponse extends js.Object {
    var Metrics: js.UndefOr[ResponseResourceMetricList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAvailableResourceMetricsResponse {
    @inline
    def apply(
        Metrics: js.UndefOr[ResponseResourceMetricList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAvailableResourceMetricsResponse = {
      val __obj = js.Dynamic.literal()
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableResourceMetricsResponse]
    }
  }

  /** The available dimension information for a metric type.
    */
  @js.native
  trait MetricDimensionGroups extends js.Object {
    var Groups: js.UndefOr[DimensionGroupDetailList]
    var Metric: js.UndefOr[String]
  }

  object MetricDimensionGroups {
    @inline
    def apply(
        Groups: js.UndefOr[DimensionGroupDetailList] = js.undefined,
        Metric: js.UndefOr[String] = js.undefined
    ): MetricDimensionGroups = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDimensionGroups]
    }
  }

  /** A time-ordered series of data points, corresponding to a dimension of a Performance Insights metric.
    */
  @js.native
  trait MetricKeyDataPoints extends js.Object {
    var DataPoints: js.UndefOr[DataPointsList]
    var Key: js.UndefOr[ResponseResourceMetricKey]
  }

  object MetricKeyDataPoints {
    @inline
    def apply(
        DataPoints: js.UndefOr[DataPointsList] = js.undefined,
        Key: js.UndefOr[ResponseResourceMetricKey] = js.undefined
    ): MetricKeyDataPoints = {
      val __obj = js.Dynamic.literal()
      DataPoints.foreach(__v => __obj.updateDynamic("DataPoints")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricKeyDataPoints]
    }
  }

  /** A single query to be processed. You must provide the metric to query. If no other parameters are specified, Performance Insights returns all data points for the specified metric. Optionally, you can request that the data points be aggregated by dimension group (<code>GroupBy</code>), and return only those data points that match your criteria (<code>Filter</code>).
    */
  @js.native
  trait MetricQuery extends js.Object {
    var Metric: RequestString
    var Filter: js.UndefOr[MetricQueryFilterMap]
    var GroupBy: js.UndefOr[DimensionGroup]
  }

  object MetricQuery {
    @inline
    def apply(
        Metric: RequestString,
        Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined,
        GroupBy: js.UndefOr[DimensionGroup] = js.undefined
    ): MetricQuery = {
      val __obj = js.Dynamic.literal(
        "Metric" -> Metric.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricQuery]
    }
  }

  /** If <code>PartitionBy</code> was specified in a <code>DescribeDimensionKeys</code> request, the dimensions are returned in an array. Each element in the array specifies one dimension.
    */
  @js.native
  trait ResponsePartitionKey extends js.Object {
    var Dimensions: DimensionMap
  }

  object ResponsePartitionKey {
    @inline
    def apply(
        Dimensions: DimensionMap
    ): ResponsePartitionKey = {
      val __obj = js.Dynamic.literal(
        "Dimensions" -> Dimensions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResponsePartitionKey]
    }
  }

  /** An object that contains the full name, description, and unit of a metric.
    */
  @js.native
  trait ResponseResourceMetric extends js.Object {
    var Description: js.UndefOr[Description]
    var Metric: js.UndefOr[String]
    var Unit: js.UndefOr[String]
  }

  object ResponseResourceMetric {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Metric: js.UndefOr[String] = js.undefined,
        Unit: js.UndefOr[String] = js.undefined
    ): ResponseResourceMetric = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseResourceMetric]
    }
  }

  /** An object describing a Performance Insights metric and one or more dimensions for that metric.
    */
  @js.native
  trait ResponseResourceMetricKey extends js.Object {
    var Metric: String
    var Dimensions: js.UndefOr[DimensionMap]
  }

  object ResponseResourceMetricKey {
    @inline
    def apply(
        Metric: String,
        Dimensions: js.UndefOr[DimensionMap] = js.undefined
    ): ResponseResourceMetricKey = {
      val __obj = js.Dynamic.literal(
        "Metric" -> Metric.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseResourceMetricKey]
    }
  }
}
