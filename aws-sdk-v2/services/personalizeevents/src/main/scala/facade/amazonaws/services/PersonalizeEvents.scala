package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object personalizeevents {
  type Arn = String
  type Date = js.Date
  type EventAttributionSource = String
  type EventList = js.Array[Event]
  type EventPropertiesJSON = String
  type FloatType = Float
  type Impression = js.Array[ItemId]
  type ItemId = String
  type ItemList = js.Array[Item]
  type ItemProperties = String
  type RecommendationId = String
  type StringType = String
  type UserId = String
  type UserList = js.Array[User]
  type UserProperties = String

  final class PersonalizeEventsOps(private val service: PersonalizeEvents) extends AnyVal {

    @inline def putEventsFuture(params: PutEventsRequest): Future[js.Object] = service.putEvents(params).promise().toFuture
    @inline def putItemsFuture(params: PutItemsRequest): Future[js.Object] = service.putItems(params).promise().toFuture
    @inline def putUsersFuture(params: PutUsersRequest): Future[js.Object] = service.putUsers(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/personalizeevents", JSImport.Namespace, "AWS.PersonalizeEvents")
  class PersonalizeEvents() extends js.Object {
    def this(config: AWSConfig) = this()

    def putEvents(params: PutEventsRequest): Request[js.Object] = js.native
    def putItems(params: PutItemsRequest): Request[js.Object] = js.native
    def putUsers(params: PutUsersRequest): Request[js.Object] = js.native
  }
  object PersonalizeEvents {
    @inline implicit def toOps(service: PersonalizeEvents): PersonalizeEventsOps = {
      new PersonalizeEventsOps(service)
    }
  }

  /** Represents user interaction event information sent using the <code>PutEvents</code> API.
    */
  @js.native
  trait Event extends js.Object {
    var eventType: StringType
    var sentAt: Date
    var eventId: js.UndefOr[StringType]
    var eventValue: js.UndefOr[FloatType]
    var impression: js.UndefOr[Impression]
    var itemId: js.UndefOr[ItemId]
    var metricAttribution: js.UndefOr[MetricAttribution]
    var properties: js.UndefOr[EventPropertiesJSON]
    var recommendationId: js.UndefOr[RecommendationId]
  }

  object Event {
    @inline
    def apply(
        eventType: StringType,
        sentAt: Date,
        eventId: js.UndefOr[StringType] = js.undefined,
        eventValue: js.UndefOr[FloatType] = js.undefined,
        impression: js.UndefOr[Impression] = js.undefined,
        itemId: js.UndefOr[ItemId] = js.undefined,
        metricAttribution: js.UndefOr[MetricAttribution] = js.undefined,
        properties: js.UndefOr[EventPropertiesJSON] = js.undefined,
        recommendationId: js.UndefOr[RecommendationId] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal(
        "eventType" -> eventType.asInstanceOf[js.Any],
        "sentAt" -> sentAt.asInstanceOf[js.Any]
      )

      eventId.foreach(__v => __obj.updateDynamic("eventId")(__v.asInstanceOf[js.Any]))
      eventValue.foreach(__v => __obj.updateDynamic("eventValue")(__v.asInstanceOf[js.Any]))
      impression.foreach(__v => __obj.updateDynamic("impression")(__v.asInstanceOf[js.Any]))
      itemId.foreach(__v => __obj.updateDynamic("itemId")(__v.asInstanceOf[js.Any]))
      metricAttribution.foreach(__v => __obj.updateDynamic("metricAttribution")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      recommendationId.foreach(__v => __obj.updateDynamic("recommendationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /** Represents item metadata added to an Items dataset using the <code>PutItems</code> API. For more information see [[https://docs.aws.amazon.com/personalize/latest/dg/importing-items.html|Importing Items Incrementally]].
    */
  @js.native
  trait Item extends js.Object {
    var itemId: StringType
    var properties: js.UndefOr[ItemProperties]
  }

  object Item {
    @inline
    def apply(
        itemId: StringType,
        properties: js.UndefOr[ItemProperties] = js.undefined
    ): Item = {
      val __obj = js.Dynamic.literal(
        "itemId" -> itemId.asInstanceOf[js.Any]
      )

      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Item]
    }
  }

  /** Contains information about a metric attribution associated with an event. For more information about metric attributions, see [[https://docs.aws.amazon.com/personalize/latest/dg/measuring-recommendation-impact.html|Measuring impact of recommendations]].
    */
  @js.native
  trait MetricAttribution extends js.Object {
    var eventAttributionSource: EventAttributionSource
  }

  object MetricAttribution {
    @inline
    def apply(
        eventAttributionSource: EventAttributionSource
    ): MetricAttribution = {
      val __obj = js.Dynamic.literal(
        "eventAttributionSource" -> eventAttributionSource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MetricAttribution]
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

  @js.native
  trait PutItemsRequest extends js.Object {
    var datasetArn: Arn
    var items: ItemList
  }

  object PutItemsRequest {
    @inline
    def apply(
        datasetArn: Arn,
        items: ItemList
    ): PutItemsRequest = {
      val __obj = js.Dynamic.literal(
        "datasetArn" -> datasetArn.asInstanceOf[js.Any],
        "items" -> items.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutItemsRequest]
    }
  }

  @js.native
  trait PutUsersRequest extends js.Object {
    var datasetArn: Arn
    var users: UserList
  }

  object PutUsersRequest {
    @inline
    def apply(
        datasetArn: Arn,
        users: UserList
    ): PutUsersRequest = {
      val __obj = js.Dynamic.literal(
        "datasetArn" -> datasetArn.asInstanceOf[js.Any],
        "users" -> users.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutUsersRequest]
    }
  }

  /** Represents user metadata added to a Users dataset using the <code>PutUsers</code> API. For more information see [[https://docs.aws.amazon.com/personalize/latest/dg/importing-users.html|Importing Users Incrementally]].
    */
  @js.native
  trait User extends js.Object {
    var userId: StringType
    var properties: js.UndefOr[UserProperties]
  }

  object User {
    @inline
    def apply(
        userId: StringType,
        properties: js.UndefOr[UserProperties] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal(
        "userId" -> userId.asInstanceOf[js.Any]
      )

      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }
}
