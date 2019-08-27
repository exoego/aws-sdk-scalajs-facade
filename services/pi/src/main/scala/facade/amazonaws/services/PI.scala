package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object pi {
  type DataPointsList              = js.Array[DataPoint]
  type DimensionKeyDescriptionList = js.Array[DimensionKeyDescription]
  type DimensionMap                = js.Dictionary[String]
  type ISOTimestamp                = js.Date
  type Limit                       = Int
  type MaxResults                  = Int
  type MetricKeyDataPointsList     = js.Array[MetricKeyDataPoints]
  type MetricQueryFilterMap        = js.Dictionary[String]
  type MetricQueryList             = js.Array[MetricQuery]
  type MetricValuesList            = js.Array[Double]
  type ResponsePartitionKeyList    = js.Array[ResponsePartitionKey]
  type ServiceType                 = String
  type StringList                  = js.Array[String]

  implicit final class PIOps(val service: PI) extends AnyVal {

    def describeDimensionKeysFuture(params: DescribeDimensionKeysRequest): Future[DescribeDimensionKeysResponse] =
      service.describeDimensionKeys(params).promise.toFuture
    def getResourceMetricsFuture(params: GetResourceMetricsRequest): Future[GetResourceMetricsResponse] =
      service.getResourceMetrics(params).promise.toFuture
  }
}

package pi {
  @js.native
  @JSImport("aws-sdk", "PI")
  class PI() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeDimensionKeys(params: DescribeDimensionKeysRequest): Request[DescribeDimensionKeysResponse] = js.native
    def getResourceMetrics(params: GetResourceMetricsRequest): Request[GetResourceMetricsResponse]          = js.native
  }

  /**
    * A timestamp, and a single numerical value, which together represent a measurement at a particular point in time.
    */
  @js.native
  trait DataPoint extends js.Object {
    var Timestamp: ISOTimestamp
    var Value: Double
  }

  object DataPoint {
    def apply(
        Timestamp: ISOTimestamp,
        Value: Double
    ): DataPoint = {
      val __obj = js.Dictionary[js.Any](
        "Timestamp" -> Timestamp.asInstanceOf[js.Any],
        "Value"     -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DataPoint]
    }
  }

  @js.native
  trait DescribeDimensionKeysRequest extends js.Object {
    var EndTime: ISOTimestamp
    var GroupBy: DimensionGroup
    var Identifier: String
    var Metric: String
    var ServiceType: ServiceType
    var StartTime: ISOTimestamp
    var Filter: js.UndefOr[MetricQueryFilterMap]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var PartitionBy: js.UndefOr[DimensionGroup]
    var PeriodInSeconds: js.UndefOr[Int]
  }

  object DescribeDimensionKeysRequest {
    def apply(
        EndTime: ISOTimestamp,
        GroupBy: DimensionGroup,
        Identifier: String,
        Metric: String,
        ServiceType: ServiceType,
        StartTime: ISOTimestamp,
        Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        PartitionBy: js.UndefOr[DimensionGroup] = js.undefined,
        PeriodInSeconds: js.UndefOr[Int] = js.undefined
    ): DescribeDimensionKeysRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndTime"     -> EndTime.asInstanceOf[js.Any],
        "GroupBy"     -> GroupBy.asInstanceOf[js.Any],
        "Identifier"  -> Identifier.asInstanceOf[js.Any],
        "Metric"      -> Metric.asInstanceOf[js.Any],
        "ServiceType" -> ServiceType.asInstanceOf[js.Any],
        "StartTime"   -> StartTime.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PartitionBy.foreach(__v => __obj.update("PartitionBy", __v.asInstanceOf[js.Any]))
      PeriodInSeconds.foreach(__v => __obj.update("PeriodInSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDimensionKeysRequest]
    }
  }

  @js.native
  trait DescribeDimensionKeysResponse extends js.Object {
    var AlignedEndTime: js.UndefOr[ISOTimestamp]
    var AlignedStartTime: js.UndefOr[ISOTimestamp]
    var Keys: js.UndefOr[DimensionKeyDescriptionList]
    var NextToken: js.UndefOr[String]
    var PartitionKeys: js.UndefOr[ResponsePartitionKeyList]
  }

  object DescribeDimensionKeysResponse {
    def apply(
        AlignedEndTime: js.UndefOr[ISOTimestamp] = js.undefined,
        AlignedStartTime: js.UndefOr[ISOTimestamp] = js.undefined,
        Keys: js.UndefOr[DimensionKeyDescriptionList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        PartitionKeys: js.UndefOr[ResponsePartitionKeyList] = js.undefined
    ): DescribeDimensionKeysResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AlignedEndTime.foreach(__v => __obj.update("AlignedEndTime", __v.asInstanceOf[js.Any]))
      AlignedStartTime.foreach(__v => __obj.update("AlignedStartTime", __v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.update("Keys", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PartitionKeys.foreach(__v => __obj.update("PartitionKeys", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDimensionKeysResponse]
    }
  }

  /**
    * A logical grouping of Performance Insights metrics for a related subject area. For example, the <code>db.sql</code> dimension group consists of the following dimensions: <code>db.sql.id</code>, <code>db.sql.db_id</code>, <code>db.sql.statement</code>, and <code>db.sql.tokenized_id</code>.
    */
  @js.native
  trait DimensionGroup extends js.Object {
    var Group: String
    var Dimensions: js.UndefOr[StringList]
    var Limit: js.UndefOr[Limit]
  }

  object DimensionGroup {
    def apply(
        Group: String,
        Dimensions: js.UndefOr[StringList] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined
    ): DimensionGroup = {
      val __obj = js.Dictionary[js.Any](
        "Group" -> Group.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionGroup]
    }
  }

  /**
    * An array of descriptions and aggregated values for each dimension within a dimension group.
    */
  @js.native
  trait DimensionKeyDescription extends js.Object {
    var Dimensions: js.UndefOr[DimensionMap]
    var Partitions: js.UndefOr[MetricValuesList]
    var Total: js.UndefOr[Double]
  }

  object DimensionKeyDescription {
    def apply(
        Dimensions: js.UndefOr[DimensionMap] = js.undefined,
        Partitions: js.UndefOr[MetricValuesList] = js.undefined,
        Total: js.UndefOr[Double] = js.undefined
    ): DimensionKeyDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      Partitions.foreach(__v => __obj.update("Partitions", __v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.update("Total", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionKeyDescription]
    }
  }

  @js.native
  trait GetResourceMetricsRequest extends js.Object {
    var EndTime: ISOTimestamp
    var Identifier: String
    var MetricQueries: MetricQueryList
    var ServiceType: ServiceType
    var StartTime: ISOTimestamp
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var PeriodInSeconds: js.UndefOr[Int]
  }

  object GetResourceMetricsRequest {
    def apply(
        EndTime: ISOTimestamp,
        Identifier: String,
        MetricQueries: MetricQueryList,
        ServiceType: ServiceType,
        StartTime: ISOTimestamp,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        PeriodInSeconds: js.UndefOr[Int] = js.undefined
    ): GetResourceMetricsRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndTime"       -> EndTime.asInstanceOf[js.Any],
        "Identifier"    -> Identifier.asInstanceOf[js.Any],
        "MetricQueries" -> MetricQueries.asInstanceOf[js.Any],
        "ServiceType"   -> ServiceType.asInstanceOf[js.Any],
        "StartTime"     -> StartTime.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PeriodInSeconds.foreach(__v => __obj.update("PeriodInSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceMetricsRequest]
    }
  }

  @js.native
  trait GetResourceMetricsResponse extends js.Object {
    var AlignedEndTime: js.UndefOr[ISOTimestamp]
    var AlignedStartTime: js.UndefOr[ISOTimestamp]
    var Identifier: js.UndefOr[String]
    var MetricList: js.UndefOr[MetricKeyDataPointsList]
    var NextToken: js.UndefOr[String]
  }

  object GetResourceMetricsResponse {
    def apply(
        AlignedEndTime: js.UndefOr[ISOTimestamp] = js.undefined,
        AlignedStartTime: js.UndefOr[ISOTimestamp] = js.undefined,
        Identifier: js.UndefOr[String] = js.undefined,
        MetricList: js.UndefOr[MetricKeyDataPointsList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetResourceMetricsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AlignedEndTime.foreach(__v => __obj.update("AlignedEndTime", __v.asInstanceOf[js.Any]))
      AlignedStartTime.foreach(__v => __obj.update("AlignedStartTime", __v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.update("Identifier", __v.asInstanceOf[js.Any]))
      MetricList.foreach(__v => __obj.update("MetricList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceMetricsResponse]
    }
  }

  /**
    * The request failed due to an unknown error.
    */
  @js.native
  trait InternalServiceErrorException extends js.Object {
    val Message: String
  }

  /**
    * One of the arguments provided is invalid for this request.
    */
  @js.native
  trait InvalidArgumentExceptionException extends js.Object {
    val Message: String
  }

  /**
    * A time-ordered series of data points, correpsonding to a dimension of a Performance Insights metric.
    */
  @js.native
  trait MetricKeyDataPoints extends js.Object {
    var DataPoints: js.UndefOr[DataPointsList]
    var Key: js.UndefOr[ResponseResourceMetricKey]
  }

  object MetricKeyDataPoints {
    def apply(
        DataPoints: js.UndefOr[DataPointsList] = js.undefined,
        Key: js.UndefOr[ResponseResourceMetricKey] = js.undefined
    ): MetricKeyDataPoints = {
      val __obj = js.Dictionary.empty[js.Any]
      DataPoints.foreach(__v => __obj.update("DataPoints", __v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricKeyDataPoints]
    }
  }

  /**
    * A single query to be processed. You must provide the metric to query. If no other parameters are specified, Performance Insights returns all of the data points for that metric. You can optionally request that the data points be aggregated by dimension group ( <code>GroupBy</code>), and return only those data points that match your criteria (<code>Filter</code>).
    */
  @js.native
  trait MetricQuery extends js.Object {
    var Metric: String
    var Filter: js.UndefOr[MetricQueryFilterMap]
    var GroupBy: js.UndefOr[DimensionGroup]
  }

  object MetricQuery {
    def apply(
        Metric: String,
        Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined,
        GroupBy: js.UndefOr[DimensionGroup] = js.undefined
    ): MetricQuery = {
      val __obj = js.Dictionary[js.Any](
        "Metric" -> Metric.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      GroupBy.foreach(__v => __obj.update("GroupBy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricQuery]
    }
  }

  /**
    * The user is not authorized to perform this request.
    */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    val Message: String
  }

  /**
    * If <code>PartitionBy</code> was specified in a <code>DescribeDimensionKeys</code> request, the dimensions are returned in an array. Each element in the array specifies one dimension.
    */
  @js.native
  trait ResponsePartitionKey extends js.Object {
    var Dimensions: DimensionMap
  }

  object ResponsePartitionKey {
    def apply(
        Dimensions: DimensionMap
    ): ResponsePartitionKey = {
      val __obj = js.Dictionary[js.Any](
        "Dimensions" -> Dimensions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResponsePartitionKey]
    }
  }

  /**
    * An object describing a Performance Insights metric and one or more dimensions for that metric.
    */
  @js.native
  trait ResponseResourceMetricKey extends js.Object {
    var Metric: String
    var Dimensions: js.UndefOr[DimensionMap]
  }

  object ResponseResourceMetricKey {
    def apply(
        Metric: String,
        Dimensions: js.UndefOr[DimensionMap] = js.undefined
    ): ResponseResourceMetricKey = {
      val __obj = js.Dictionary[js.Any](
        "Metric" -> Metric.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseResourceMetricKey]
    }
  }

  object ServiceTypeEnum {
    val RDS = "RDS"

    val values = js.Object.freeze(js.Array(RDS))
  }
}
