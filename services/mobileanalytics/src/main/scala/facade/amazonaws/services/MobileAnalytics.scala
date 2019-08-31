package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object mobileanalytics {
  type EventListDefinition = js.Array[Event]
  type ISO8601Timestamp    = String
  type MapOfStringToNumber = js.Dictionary[Double]
  type MapOfStringToString = js.Dictionary[String0to1000Chars]
  type String0to1000Chars  = String
  type String10Chars       = String
  type String50Chars       = String

  implicit final class MobileAnalyticsOps(private val service: MobileAnalytics) extends AnyVal {

    def putEventsFuture(params: PutEventsInput): Future[js.Object] = service.putEvents(params).promise.toFuture
  }
}

package mobileanalytics {
  @js.native
  @JSImport("aws-sdk", "MobileAnalytics")
  class MobileAnalytics() extends js.Object {
    def this(config: AWSConfig) = this()

    def putEvents(params: PutEventsInput): Request[js.Object] = js.native
  }

  /**
    * An exception object returned when a request fails.
    */
  @js.native
  trait BadRequestExceptionException extends js.Object {
    val message: String
  }

  /**
    * A JSON object representing a batch of unique event occurrences in your app.
    */
  @js.native
  trait Event extends js.Object {
    var eventType: String50Chars
    var timestamp: ISO8601Timestamp
    var attributes: js.UndefOr[MapOfStringToString]
    var metrics: js.UndefOr[MapOfStringToNumber]
    var session: js.UndefOr[Session]
    var version: js.UndefOr[String10Chars]
  }

  object Event {
    def apply(
        eventType: String50Chars,
        timestamp: ISO8601Timestamp,
        attributes: js.UndefOr[MapOfStringToString] = js.undefined,
        metrics: js.UndefOr[MapOfStringToNumber] = js.undefined,
        session: js.UndefOr[Session] = js.undefined,
        version: js.UndefOr[String10Chars] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal(
        "eventType" -> eventType.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      metrics.foreach(__v => __obj.updateDynamic("metrics")(__v.asInstanceOf[js.Any]))
      session.foreach(__v => __obj.updateDynamic("session")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /**
    * A container for the data needed for a PutEvent operation
    */
  @js.native
  trait PutEventsInput extends js.Object {
    var clientContext: String
    var events: EventListDefinition
    var clientContextEncoding: js.UndefOr[String]
  }

  object PutEventsInput {
    def apply(
        clientContext: String,
        events: EventListDefinition,
        clientContextEncoding: js.UndefOr[String] = js.undefined
    ): PutEventsInput = {
      val __obj = js.Dynamic.literal(
        "clientContext" -> clientContext.asInstanceOf[js.Any],
        "events"        -> events.asInstanceOf[js.Any]
      )

      clientContextEncoding.foreach(__v => __obj.updateDynamic("clientContextEncoding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsInput]
    }
  }

  /**
    * Describes the session. Session information is required on ALL events.
    */
  @js.native
  trait Session extends js.Object {
    var duration: js.UndefOr[Double]
    var id: js.UndefOr[String50Chars]
    var startTimestamp: js.UndefOr[ISO8601Timestamp]
    var stopTimestamp: js.UndefOr[ISO8601Timestamp]
  }

  object Session {
    def apply(
        duration: js.UndefOr[Double] = js.undefined,
        id: js.UndefOr[String50Chars] = js.undefined,
        startTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined,
        stopTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined
    ): Session = {
      val __obj = js.Dynamic.literal()
      duration.foreach(__v => __obj.updateDynamic("duration")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      startTimestamp.foreach(__v => __obj.updateDynamic("startTimestamp")(__v.asInstanceOf[js.Any]))
      stopTimestamp.foreach(__v => __obj.updateDynamic("stopTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Session]
    }
  }
}
