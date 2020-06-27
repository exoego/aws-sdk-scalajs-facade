package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object forecastquery {
  type Arn            = String
  type AttributeName  = String
  type AttributeValue = String
  type DateTime       = String
  type Filters        = js.Dictionary[AttributeValue]
  type NextToken      = String
  type Predictions    = js.Dictionary[TimeSeries]
  type Statistic      = String
  type TimeSeries     = js.Array[DataPoint]
  type Timestamp      = String

  implicit final class ForecastQueryOps(private val service: ForecastQuery) extends AnyVal {

    @inline def queryForecastFuture(params: QueryForecastRequest): Future[QueryForecastResponse] =
      service.queryForecast(params).promise().toFuture
  }
}

package forecastquery {
  @js.native
  @JSImport("aws-sdk", "ForecastQueryService")
  class ForecastQuery() extends js.Object {
    def this(config: AWSConfig) = this()

    def queryForecast(params: QueryForecastRequest): Request[QueryForecastResponse] = js.native
  }

  /**
    * The forecast value for a specific date. Part of the <a>Forecast</a> object.
    */
  @js.native
  @Factory
  trait DataPoint extends js.Object {
    var Timestamp: js.UndefOr[Timestamp]
    var Value: js.UndefOr[Double]
  }

  /**
    * Provides information about a forecast. Returned as part of the <a>QueryForecast</a> response.
    */
  @js.native
  @Factory
  trait Forecast extends js.Object {
    var Predictions: js.UndefOr[Predictions]
  }

  @js.native
  @Factory
  trait QueryForecastRequest extends js.Object {
    var Filters: Filters
    var ForecastArn: Arn
    var EndDate: js.UndefOr[DateTime]
    var NextToken: js.UndefOr[NextToken]
    var StartDate: js.UndefOr[DateTime]
  }

  @js.native
  @Factory
  trait QueryForecastResponse extends js.Object {
    var Forecast: js.UndefOr[Forecast]
  }
}
