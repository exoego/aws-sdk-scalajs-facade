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
   * <p>An exception object returned when a request fails.</p>
   */
  @js.native
  trait BadRequestExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>A JSON object representing a batch of unique event occurrences in your app.</p>
   */
  @js.native
  trait Event extends js.Object {
    var eventType: js.UndefOr[String50Chars]
    var timestamp: js.UndefOr[ISO8601Timestamp]
    var attributes: js.UndefOr[MapOfStringToString]
    var version: js.UndefOr[String10Chars]
    var session: js.UndefOr[Session]
    var metrics: js.UndefOr[MapOfStringToNumber]
  }

  object Event {
    def apply(
      eventType: js.UndefOr[String50Chars] = js.undefined,
      timestamp: js.UndefOr[ISO8601Timestamp] = js.undefined,
      attributes: js.UndefOr[MapOfStringToString] = js.undefined,
      version: js.UndefOr[String10Chars] = js.undefined,
      session: js.UndefOr[Session] = js.undefined,
      metrics: js.UndefOr[MapOfStringToNumber] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventType" -> eventType.map { x => x.asInstanceOf[js.Any] },
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "session" -> session.map { x => x.asInstanceOf[js.Any] },
        "metrics" -> metrics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * <p>A container for the data needed for a PutEvent operation</p>
   */
  @js.native
  trait PutEventsInput extends js.Object {
    var events: js.UndefOr[EventListDefinition]
    var clientContext: js.UndefOr[String]
    var clientContextEncoding: js.UndefOr[String]
  }

  object PutEventsInput {
    def apply(
      events: js.UndefOr[EventListDefinition] = js.undefined,
      clientContext: js.UndefOr[String] = js.undefined,
      clientContextEncoding: js.UndefOr[String] = js.undefined): PutEventsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "clientContext" -> clientContext.map { x => x.asInstanceOf[js.Any] },
        "clientContextEncoding" -> clientContextEncoding.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventsInput]
    }
  }

  /**
   * <p>Describes the session. Session information is required on ALL events.</p>
   */
  @js.native
  trait Session extends js.Object {
    var id: js.UndefOr[String50Chars]
    var duration: js.UndefOr[Double]
    var startTimestamp: js.UndefOr[ISO8601Timestamp]
    var stopTimestamp: js.UndefOr[ISO8601Timestamp]
  }

  object Session {
    def apply(
      id: js.UndefOr[String50Chars] = js.undefined,
      duration: js.UndefOr[Double] = js.undefined,
      startTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined,
      stopTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined): Session = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "duration" -> duration.map { x => x.asInstanceOf[js.Any] },
        "startTimestamp" -> startTimestamp.map { x => x.asInstanceOf[js.Any] },
        "stopTimestamp" -> stopTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Session]
    }
  }
}
