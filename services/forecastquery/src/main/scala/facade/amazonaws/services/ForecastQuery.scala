package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object forecastquery {
  type Arn = String
  type AttributeName = String
  type AttributeValue = String
  type DateTime = String
  type Filters = js.Dictionary[AttributeValue]
  type NextToken = String
  type Predictions = js.Dictionary[TimeSeries]
  type Statistic = String
  type TimeSeries = js.Array[DataPoint]
  type Timestamp = String

  implicit final class ForecastQueryOps(private val service: ForecastQuery) extends AnyVal {

    @inline def queryForecastFuture(params: QueryForecastRequest): Future[QueryForecastResponse] = service.queryForecast(params).promise().toFuture

  }
}

package forecastquery {
  @js.native
  @JSImport("aws-sdk", "ForecastQueryService", "AWS.ForecastQueryService")
  class ForecastQuery() extends js.Object {
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
    @inline
    def apply(
        Timestamp: js.UndefOr[Timestamp] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): DataPoint = {
      val __obj = js.Dynamic.literal()
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Predictions: js.UndefOr[Predictions] = js.undefined
    ): Forecast = {
      val __obj = js.Dynamic.literal()
      Predictions.foreach(__v => __obj.updateDynamic("Predictions")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Filters: Filters,
        ForecastArn: Arn,
        EndDate: js.UndefOr[DateTime] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StartDate: js.UndefOr[DateTime] = js.undefined
    ): QueryForecastRequest = {
      val __obj = js.Dynamic.literal(
        "Filters" -> Filters.asInstanceOf[js.Any],
        "ForecastArn" -> ForecastArn.asInstanceOf[js.Any]
      )

      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryForecastRequest]
    }
  }

  @js.native
  trait QueryForecastResponse extends js.Object {
    var Forecast: js.UndefOr[Forecast]
  }

  object QueryForecastResponse {
    @inline
    def apply(
        Forecast: js.UndefOr[Forecast] = js.undefined
    ): QueryForecastResponse = {
      val __obj = js.Dynamic.literal()
      Forecast.foreach(__v => __obj.updateDynamic("Forecast")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryForecastResponse]
    }
  }
}
