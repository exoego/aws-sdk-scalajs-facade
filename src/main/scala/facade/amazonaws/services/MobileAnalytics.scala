package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object mobileanalytics {
  type EventListDefinition = js.Array[Event]
  type ISO8601Timestamp = String
  type MapOfStringToNumber = js.Dictionary[Double]
  type MapOfStringToString = js.Dictionary[String0to1000Chars]
  type String0to1000Chars = String
  type String10Chars = String
  type String50Chars = String
}

package mobileanalytics {
  @js.native
  @JSImport("aws-sdk", "MobileAnalytics")
  class MobileAnalytics(config: AWSConfig) extends js.Object {
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
      version: js.UndefOr[String10Chars] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventType" -> eventType.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any],
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "metrics" -> metrics.map { x => x.asInstanceOf[js.Any] },
        "session" -> session.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
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
      clientContextEncoding: js.UndefOr[String] = js.undefined): PutEventsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientContext" -> clientContext.asInstanceOf[js.Any],
        "events" -> events.asInstanceOf[js.Any],
        "clientContextEncoding" -> clientContextEncoding.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventsInput]
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
      stopTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined): Session = {
      val _fields = IndexedSeq[(String, js.Any)](
        "duration" -> duration.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "startTimestamp" -> startTimestamp.map { x => x.asInstanceOf[js.Any] },
        "stopTimestamp" -> stopTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Session]
    }
  }
}
