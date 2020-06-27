package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object mobileanalytics {
  type EventListDefinition = js.Array[Event]
  type ISO8601Timestamp    = String
  type MapOfStringToNumber = js.Dictionary[Double]
  type MapOfStringToString = js.Dictionary[String0to1000Chars]
  type String0to1000Chars  = String
  type String10Chars       = String
  type String50Chars       = String

  implicit final class MobileAnalyticsOps(private val service: MobileAnalytics) extends AnyVal {

    @inline def putEventsFuture(params: PutEventsInput): Future[js.Object] =
      service.putEvents(params).promise().toFuture
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
  @Factory
  trait Event extends js.Object {
    var eventType: String50Chars
    var timestamp: ISO8601Timestamp
    var attributes: js.UndefOr[MapOfStringToString]
    var metrics: js.UndefOr[MapOfStringToNumber]
    var session: js.UndefOr[Session]
    var version: js.UndefOr[String10Chars]
  }

  /**
    * A container for the data needed for a PutEvent operation
    */
  @js.native
  @Factory
  trait PutEventsInput extends js.Object {
    var clientContext: String
    var events: EventListDefinition
    var clientContextEncoding: js.UndefOr[String]
  }

  /**
    * Describes the session. Session information is required on ALL events.
    */
  @js.native
  @Factory
  trait Session extends js.Object {
    var duration: js.UndefOr[Double]
    var id: js.UndefOr[String50Chars]
    var startTimestamp: js.UndefOr[ISO8601Timestamp]
    var stopTimestamp: js.UndefOr[ISO8601Timestamp]
  }
}
