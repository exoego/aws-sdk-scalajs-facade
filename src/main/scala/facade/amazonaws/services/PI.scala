package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object pi {
  type DataPointsList = js.Array[DataPoint]
  type DimensionKeyDescriptionList = js.Array[DimensionKeyDescription]
  type DimensionMap = js.Dictionary[String]
  type ISOTimestamp = js.Date
  type Limit = Int
  type MaxResults = Int
  type MetricKeyDataPointsList = js.Array[MetricKeyDataPoints]
  type MetricQueryFilterMap = js.Dictionary[String]
  type MetricQueryList = js.Array[MetricQuery]
  type MetricValuesList = js.Array[Double]
  type ResponsePartitionKeyList = js.Array[ResponsePartitionKey]
  type ServiceType = String
  type StringList = js.Array[String]
}

package pi {
  @js.native
  @JSImport("aws-sdk", "PI")
  class PI(config: AWSConfig) extends js.Object {
    def describeDimensionKeys(params: DescribeDimensionKeysRequest): Request[DescribeDimensionKeysResponse] = js.native
    def getResourceMetrics(params: GetResourceMetricsRequest): Request[GetResourceMetricsResponse] = js.native
  }

  /**
   * <p>A timestamp, and a single numerical value, which together represent a measurement at a particular point in time.</p>
   */
  @js.native
  trait DataPoint extends js.Object {
    var Timestamp: js.UndefOr[ISOTimestamp]
    var Value: js.UndefOr[Double]
  }

  object DataPoint {
    def apply(
      Timestamp: js.UndefOr[ISOTimestamp] = js.undefined,
      Value: js.UndefOr[Double] = js.undefined): DataPoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataPoint]
    }
  }

  @js.native
  trait DescribeDimensionKeysRequest extends js.Object {
    var GroupBy: js.UndefOr[DimensionGroup]
    var Metric: js.UndefOr[String]
    var PartitionBy: js.UndefOr[DimensionGroup]
    var MaxResults: js.UndefOr[MaxResults]
    var StartTime: js.UndefOr[ISOTimestamp]
    var EndTime: js.UndefOr[ISOTimestamp]
    var PeriodInSeconds: js.UndefOr[Int]
    var ServiceType: js.UndefOr[ServiceType]
    var Identifier: js.UndefOr[String]
    var Filter: js.UndefOr[MetricQueryFilterMap]
    var NextToken: js.UndefOr[String]
  }

  object DescribeDimensionKeysRequest {
    def apply(
      GroupBy: js.UndefOr[DimensionGroup] = js.undefined,
      Metric: js.UndefOr[String] = js.undefined,
      PartitionBy: js.UndefOr[DimensionGroup] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      StartTime: js.UndefOr[ISOTimestamp] = js.undefined,
      EndTime: js.UndefOr[ISOTimestamp] = js.undefined,
      PeriodInSeconds: js.UndefOr[Int] = js.undefined,
      ServiceType: js.UndefOr[ServiceType] = js.undefined,
      Identifier: js.UndefOr[String] = js.undefined,
      Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeDimensionKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupBy" -> GroupBy.map { x => x.asInstanceOf[js.Any] },
        "Metric" -> Metric.map { x => x.asInstanceOf[js.Any] },
        "PartitionBy" -> PartitionBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "PeriodInSeconds" -> PeriodInSeconds.map { x => x.asInstanceOf[js.Any] },
        "ServiceType" -> ServiceType.map { x => x.asInstanceOf[js.Any] },
        "Identifier" -> Identifier.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDimensionKeysRequest]
    }
  }

  @js.native
  trait DescribeDimensionKeysResponse extends js.Object {
    var AlignedEndTime: js.UndefOr[ISOTimestamp]
    var Keys: js.UndefOr[DimensionKeyDescriptionList]
    var PartitionKeys: js.UndefOr[ResponsePartitionKeyList]
    var AlignedStartTime: js.UndefOr[ISOTimestamp]
    var NextToken: js.UndefOr[String]
  }

  object DescribeDimensionKeysResponse {
    def apply(
      AlignedEndTime: js.UndefOr[ISOTimestamp] = js.undefined,
      Keys: js.UndefOr[DimensionKeyDescriptionList] = js.undefined,
      PartitionKeys: js.UndefOr[ResponsePartitionKeyList] = js.undefined,
      AlignedStartTime: js.UndefOr[ISOTimestamp] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeDimensionKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlignedEndTime" -> AlignedEndTime.map { x => x.asInstanceOf[js.Any] },
        "Keys" -> Keys.map { x => x.asInstanceOf[js.Any] },
        "PartitionKeys" -> PartitionKeys.map { x => x.asInstanceOf[js.Any] },
        "AlignedStartTime" -> AlignedStartTime.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDimensionKeysResponse]
    }
  }

  /**
   * <p>A logical grouping of Performance Insights metrics for a related subject area. For example, the <code>db.sql</code> dimension group consists of the following dimensions: <code>db.sql.id</code>, <code>db.sql.db_id</code>, <code>db.sql.statement</code>, and <code>db.sql.tokenized_id</code>.</p>
   */
  @js.native
  trait DimensionGroup extends js.Object {
    var Group: js.UndefOr[String]
    var Dimensions: js.UndefOr[StringList]
    var Limit: js.UndefOr[Limit]
  }

  object DimensionGroup {
    def apply(
      Group: js.UndefOr[String] = js.undefined,
      Dimensions: js.UndefOr[StringList] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined): DimensionGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] },
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DimensionGroup]
    }
  }

  /**
   * <p>An array of descriptions and aggregated values for each dimension within a dimension group.</p>
   */
  @js.native
  trait DimensionKeyDescription extends js.Object {
    var Dimensions: js.UndefOr[DimensionMap]
    var Total: js.UndefOr[Double]
    var Partitions: js.UndefOr[MetricValuesList]
  }

  object DimensionKeyDescription {
    def apply(
      Dimensions: js.UndefOr[DimensionMap] = js.undefined,
      Total: js.UndefOr[Double] = js.undefined,
      Partitions: js.UndefOr[MetricValuesList] = js.undefined): DimensionKeyDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "Total" -> Total.map { x => x.asInstanceOf[js.Any] },
        "Partitions" -> Partitions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DimensionKeyDescription]
    }
  }

  @js.native
  trait GetResourceMetricsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var StartTime: js.UndefOr[ISOTimestamp]
    var EndTime: js.UndefOr[ISOTimestamp]
    var PeriodInSeconds: js.UndefOr[Int]
    var ServiceType: js.UndefOr[ServiceType]
    var MetricQueries: js.UndefOr[MetricQueryList]
    var Identifier: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
  }

  object GetResourceMetricsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      StartTime: js.UndefOr[ISOTimestamp] = js.undefined,
      EndTime: js.UndefOr[ISOTimestamp] = js.undefined,
      PeriodInSeconds: js.UndefOr[Int] = js.undefined,
      ServiceType: js.UndefOr[ServiceType] = js.undefined,
      MetricQueries: js.UndefOr[MetricQueryList] = js.undefined,
      Identifier: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetResourceMetricsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "PeriodInSeconds" -> PeriodInSeconds.map { x => x.asInstanceOf[js.Any] },
        "ServiceType" -> ServiceType.map { x => x.asInstanceOf[js.Any] },
        "MetricQueries" -> MetricQueries.map { x => x.asInstanceOf[js.Any] },
        "Identifier" -> Identifier.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceMetricsRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): GetResourceMetricsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlignedEndTime" -> AlignedEndTime.map { x => x.asInstanceOf[js.Any] },
        "AlignedStartTime" -> AlignedStartTime.map { x => x.asInstanceOf[js.Any] },
        "Identifier" -> Identifier.map { x => x.asInstanceOf[js.Any] },
        "MetricList" -> MetricList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceMetricsResponse]
    }
  }

  /**
   * <p>The request failed due to an unknown error.</p>
   */
  @js.native
  trait InternalServiceErrorException extends js.Object {
    val Message: String
  }

  /**
   * <p>One of the arguments provided is invalid for this request.</p>
   */
  @js.native
  trait InvalidArgumentExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>A time-ordered series of data points, correpsonding to a dimension of a Performance Insights metric.</p>
   */
  @js.native
  trait MetricKeyDataPoints extends js.Object {
    var Key: js.UndefOr[ResponseResourceMetricKey]
    var DataPoints: js.UndefOr[DataPointsList]
  }

  object MetricKeyDataPoints {
    def apply(
      Key: js.UndefOr[ResponseResourceMetricKey] = js.undefined,
      DataPoints: js.UndefOr[DataPointsList] = js.undefined): MetricKeyDataPoints = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "DataPoints" -> DataPoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricKeyDataPoints]
    }
  }

  /**
   * <p>A single query to be processed. You must provide the metric to query. If no other parameters are specified, Performance Insights returns all of the data points for that metric. You can optionally request that the data points be aggregated by dimension group ( <code>GroupBy</code>), and return only those data points that match your criteria (<code>Filter</code>).</p>
   */
  @js.native
  trait MetricQuery extends js.Object {
    var Metric: js.UndefOr[String]
    var GroupBy: js.UndefOr[DimensionGroup]
    var Filter: js.UndefOr[MetricQueryFilterMap]
  }

  object MetricQuery {
    def apply(
      Metric: js.UndefOr[String] = js.undefined,
      GroupBy: js.UndefOr[DimensionGroup] = js.undefined,
      Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined): MetricQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metric" -> Metric.map { x => x.asInstanceOf[js.Any] },
        "GroupBy" -> GroupBy.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricQuery]
    }
  }

  /**
   * <p>The user is not authorized to perform this request.</p>
   */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    val Message: String
  }

  /**
   * <p>If <code>PartitionBy</code> was specified in a <code>DescribeDimensionKeys</code> request, the dimensions are returned in an array. Each element in the array specifies one dimension. </p>
   */
  @js.native
  trait ResponsePartitionKey extends js.Object {
    var Dimensions: js.UndefOr[DimensionMap]
  }

  object ResponsePartitionKey {
    def apply(
      Dimensions: js.UndefOr[DimensionMap] = js.undefined): ResponsePartitionKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResponsePartitionKey]
    }
  }

  /**
   * <p>An object describing a Performance Insights metric and one or more dimensions for that metric.</p>
   */
  @js.native
  trait ResponseResourceMetricKey extends js.Object {
    var Metric: js.UndefOr[String]
    var Dimensions: js.UndefOr[DimensionMap]
  }

  object ResponseResourceMetricKey {
    def apply(
      Metric: js.UndefOr[String] = js.undefined,
      Dimensions: js.UndefOr[DimensionMap] = js.undefined): ResponseResourceMetricKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metric" -> Metric.map { x => x.asInstanceOf[js.Any] },
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResponseResourceMetricKey]
    }
  }

  object ServiceTypeEnum {
    val RDS = "RDS"

    val values = IndexedSeq(RDS)
  }
}
