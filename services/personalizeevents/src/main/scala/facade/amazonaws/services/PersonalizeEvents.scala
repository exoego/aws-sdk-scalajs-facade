package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object personalizeevents {
  type Date = js.Date
  type EventList = js.Array[Event]
  type EventPropertiesJSON = String
  type StringType = String
  type UserId = String

  implicit final class PersonalizeEventsOps(private val service: PersonalizeEvents) extends AnyVal {

    @inline def putEventsFuture(params: PutEventsRequest): Future[js.Object] =
      service.putEvents(params).promise().toFuture
  }
}

package personalizeevents {
  @js.native
  @JSImport("aws-sdk", "PersonalizeEvents", "AWS.PersonalizeEvents")
  class PersonalizeEvents() extends js.Object {
    def this(config: AWSConfig) = this()

    def putEvents(params: PutEventsRequest): Request[js.Object] = js.native
  }

  /**
    * Represents user interaction event information sent using the <code>PutEvents</code> API.
    */
  @js.native
  trait Event extends js.Object {
    var eventType: StringType
    var properties: EventPropertiesJSON
    var sentAt: Date
    var eventId: js.UndefOr[StringType]
  }

  object Event {
    @inline
    def apply(
        eventType: StringType,
        properties: EventPropertiesJSON,
        sentAt: Date,
        eventId: js.UndefOr[StringType] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal(
        "eventType" -> eventType.asInstanceOf[js.Any],
        "properties" -> properties.asInstanceOf[js.Any],
        "sentAt" -> sentAt.asInstanceOf[js.Any]
      )

      eventId.foreach(__v => __obj.updateDynamic("eventId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  @js.native
  trait PutEventsRequest extends js.Object {
    var eventList: EventList
    var sessionId: StringType
    var trackingId: StringType
    var userId: js.UndefOr[UserId]
  }

  object PutEventsRequest {
    @inline
    def apply(
        eventList: EventList,
        sessionId: StringType,
        trackingId: StringType,
        userId: js.UndefOr[UserId] = js.undefined
    ): PutEventsRequest = {
      val __obj = js.Dynamic.literal(
        "eventList" -> eventList.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any],
        "trackingId" -> trackingId.asInstanceOf[js.Any]
      )

      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsRequest]
    }
  }
}
