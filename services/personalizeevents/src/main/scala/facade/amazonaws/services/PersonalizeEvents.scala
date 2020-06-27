package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object personalizeevents {
  type Date                = js.Date
  type EventList           = js.Array[Event]
  type EventPropertiesJSON = String
  type StringType          = String
  type UserId              = String

  implicit final class PersonalizeEventsOps(private val service: PersonalizeEvents) extends AnyVal {

    @inline def putEventsFuture(params: PutEventsRequest): Future[js.Object] =
      service.putEvents(params).promise().toFuture
  }
}

package personalizeevents {
  @js.native
  @JSImport("aws-sdk", "PersonalizeEvents")
  class PersonalizeEvents() extends js.Object {
    def this(config: AWSConfig) = this()

    def putEvents(params: PutEventsRequest): Request[js.Object] = js.native
  }

  /**
    * Represents user interaction event information sent using the <code>PutEvents</code> API.
    */
  @js.native
  @Factory
  trait Event extends js.Object {
    var eventType: StringType
    var properties: EventPropertiesJSON
    var sentAt: Date
    var eventId: js.UndefOr[StringType]
  }

  @js.native
  @Factory
  trait PutEventsRequest extends js.Object {
    var eventList: EventList
    var sessionId: StringType
    var trackingId: StringType
    var userId: js.UndefOr[UserId]
  }
}
