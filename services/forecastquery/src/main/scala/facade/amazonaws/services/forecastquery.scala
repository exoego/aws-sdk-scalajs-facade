package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

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

  implicit final class forecastqueryOps(val service: forecastquery) extends AnyVal {

    def queryForecastFuture(params: QueryForecastRequest): Future[QueryForecastResponse] =
      service.queryForecast(params).promise.toFuture
  }
}

package forecastquery {
  @js.native
  @JSImport("aws-sdk", "forecastquery")
  class forecastquery() extends js.Object {
    def this(config: AWSConfig) = this()

    def queryForecast(params: QueryForecastRequest): Request[QueryForecastResponse] = js.native
  }

  /**
    * The forecast value for a specific date. Part of the <a>Forecast</a> object.
    */
  @js.native
  trait DataPoint extends js.Object {
    var Timestamp: js.UndefOr[Timestamp]
    var Value: js.UndefOr[Double]
  }

  object DataPoint {
    def apply(
        Timestamp: js.UndefOr[Timestamp] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): DataPoint = {
      val __obj = js.Dictionary.empty[js.Any]
      Timestamp.foreach(__v => __obj.update("Timestamp", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataPoint]
    }
  }

  /**
    * Provides information about a forecast. Returned as part of the <a>QueryForecast</a> response.
    */
  @js.native
  trait Forecast extends js.Object {
    var Predictions: js.UndefOr[Predictions]
  }

  object Forecast {
    def apply(
        Predictions: js.UndefOr[Predictions] = js.undefined
    ): Forecast = {
      val __obj = js.Dictionary.empty[js.Any]
      Predictions.foreach(__v => __obj.update("Predictions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Forecast]
    }
  }

  @js.native
  trait QueryForecastRequest extends js.Object {
    var Filters: Filters
    var ForecastArn: Arn
    var EndDate: js.UndefOr[DateTime]
    var NextToken: js.UndefOr[NextToken]
    var StartDate: js.UndefOr[DateTime]
  }

  object QueryForecastRequest {
    def apply(
        Filters: Filters,
        ForecastArn: Arn,
        EndDate: js.UndefOr[DateTime] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StartDate: js.UndefOr[DateTime] = js.undefined
    ): QueryForecastRequest = {
      val __obj = js.Dictionary[js.Any](
        "Filters"     -> Filters.asInstanceOf[js.Any],
        "ForecastArn" -> ForecastArn.asInstanceOf[js.Any]
      )

      EndDate.foreach(__v => __obj.update("EndDate", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.update("StartDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryForecastRequest]
    }
  }

  @js.native
  trait QueryForecastResponse extends js.Object {
    var Forecast: js.UndefOr[Forecast]
  }

  object QueryForecastResponse {
    def apply(
        Forecast: js.UndefOr[Forecast] = js.undefined
    ): QueryForecastResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Forecast.foreach(__v => __obj.update("Forecast", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryForecastResponse]
    }
  }
}
