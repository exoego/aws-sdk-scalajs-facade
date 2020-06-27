package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  type StringList                  = js.Array[String]

  implicit final class PIOps(private val service: PI) extends AnyVal {

    @inline def describeDimensionKeysFuture(
        params: DescribeDimensionKeysRequest
    ): Future[DescribeDimensionKeysResponse] = service.describeDimensionKeys(params).promise().toFuture
    @inline def getResourceMetricsFuture(params: GetResourceMetricsRequest): Future[GetResourceMetricsResponse] =
      service.getResourceMetrics(params).promise().toFuture
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
  @Factory
  trait DataPoint extends js.Object {
    var Timestamp: ISOTimestamp
    var Value: Double
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeDimensionKeysResponse extends js.Object {
    var AlignedEndTime: js.UndefOr[ISOTimestamp]
    var AlignedStartTime: js.UndefOr[ISOTimestamp]
    var Keys: js.UndefOr[DimensionKeyDescriptionList]
    var NextToken: js.UndefOr[String]
    var PartitionKeys: js.UndefOr[ResponsePartitionKeyList]
  }

  /**
    * A logical grouping of Performance Insights metrics for a related subject area. For example, the <code>db.sql</code> dimension group consists of the following dimensions: <code>db.sql.id</code>, <code>db.sql.db_id</code>, <code>db.sql.statement</code>, and <code>db.sql.tokenized_id</code>.
    */
  @js.native
  @Factory
  trait DimensionGroup extends js.Object {
    var Group: String
    var Dimensions: js.UndefOr[StringList]
    var Limit: js.UndefOr[Limit]
  }

  /**
    * An array of descriptions and aggregated values for each dimension within a dimension group.
    */
  @js.native
  @Factory
  trait DimensionKeyDescription extends js.Object {
    var Dimensions: js.UndefOr[DimensionMap]
    var Partitions: js.UndefOr[MetricValuesList]
    var Total: js.UndefOr[Double]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetResourceMetricsResponse extends js.Object {
    var AlignedEndTime: js.UndefOr[ISOTimestamp]
    var AlignedStartTime: js.UndefOr[ISOTimestamp]
    var Identifier: js.UndefOr[String]
    var MetricList: js.UndefOr[MetricKeyDataPointsList]
    var NextToken: js.UndefOr[String]
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
  @Factory
  trait MetricKeyDataPoints extends js.Object {
    var DataPoints: js.UndefOr[DataPointsList]
    var Key: js.UndefOr[ResponseResourceMetricKey]
  }

  /**
    * A single query to be processed. You must provide the metric to query. If no other parameters are specified, Performance Insights returns all of the data points for that metric. You can optionally request that the data points be aggregated by dimension group ( <code>GroupBy</code>), and return only those data points that match your criteria (<code>Filter</code>).
    */
  @js.native
  @Factory
  trait MetricQuery extends js.Object {
    var Metric: String
    var Filter: js.UndefOr[MetricQueryFilterMap]
    var GroupBy: js.UndefOr[DimensionGroup]
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
  @Factory
  trait ResponsePartitionKey extends js.Object {
    var Dimensions: DimensionMap
  }

  /**
    * An object describing a Performance Insights metric and one or more dimensions for that metric.
    */
  @js.native
  @Factory
  trait ResponseResourceMetricKey extends js.Object {
    var Metric: String
    var Dimensions: js.UndefOr[DimensionMap]
  }

  @js.native
  sealed trait ServiceType extends js.Any
  object ServiceType extends js.Object {
    val RDS = "RDS".asInstanceOf[ServiceType]

    val values = js.Object.freeze(js.Array(RDS))
  }
}
