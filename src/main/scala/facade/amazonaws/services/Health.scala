package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object health {
  type DescribeEventDetailsFailedSet = js.Array[EventDetailsErrorItem]
  type DescribeEventDetailsSuccessfulSet = js.Array[EventDetails]
  type EntityAggregateList = js.Array[EntityAggregate]
  type EntityList = js.Array[AffectedEntity]
  type EventAggregateList = js.Array[EventAggregate]
  type EventArnsList = js.Array[eventArn]
  type EventList = js.Array[Event]
  type EventTypeCategoryList = js.Array[eventTypeCategory]
  type EventTypeCodeList = js.Array[eventTypeCode]
  type EventTypeList = js.Array[EventType]
  type accountId = String
  type aggregateValue = String
  type availabilityZone = String
  type availabilityZones = js.Array[availabilityZone]
  type count = Int
  type dateTimeRangeList = js.Array[DateTimeRange]
  type entityArn = String
  type entityArnList = js.Array[entityArn]
  type entityStatusCode = String
  type entityStatusCodeList = js.Array[entityStatusCode]
  type entityValue = String
  type entityValueList = js.Array[entityValue]
  type eventAggregateField = String
  type eventArn = String
  type eventArnList = js.Array[eventArn]
  type eventDescription = String
  type eventMetadata = js.Dictionary[metadataValue]
  type eventStatusCode = String
  type eventStatusCodeList = js.Array[eventStatusCode]
  type eventType = String
  type eventTypeCategory = String
  type eventTypeCategoryList = js.Array[eventTypeCategory]
  type eventTypeCode = String
  type eventTypeList = js.Array[eventType]
  type locale = String
  type maxResults = Int
  type metadataKey = String
  type metadataValue = String
  type nextToken = String
  type region = String
  type regionList = js.Array[region]
  type service = String
  type serviceList = js.Array[service]
  type string = String
  type tagFilter = js.Array[tagSet]
  type tagKey = String
  type tagSet = js.Dictionary[tagValue]
  type tagValue = String
  type timestamp = js.Date
}

package health {
  @js.native
  @JSImport("aws-sdk", "Health")
  class Health() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeAffectedEntities(params: DescribeAffectedEntitiesRequest): Request[DescribeAffectedEntitiesResponse] = js.native
    def describeEntityAggregates(params: DescribeEntityAggregatesRequest): Request[DescribeEntityAggregatesResponse] = js.native
    def describeEventAggregates(params: DescribeEventAggregatesRequest): Request[DescribeEventAggregatesResponse] = js.native
    def describeEventDetails(params: DescribeEventDetailsRequest): Request[DescribeEventDetailsResponse] = js.native
    def describeEventTypes(params: DescribeEventTypesRequest): Request[DescribeEventTypesResponse] = js.native
    def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse] = js.native
  }

  /**
   * Information about an entity that is affected by a Health event.
   */
  @js.native
  trait AffectedEntity extends js.Object {
    var awsAccountId: js.UndefOr[accountId]
    var entityArn: js.UndefOr[entityArn]
    var entityValue: js.UndefOr[entityValue]
    var eventArn: js.UndefOr[eventArn]
    var lastUpdatedTime: js.UndefOr[timestamp]
    var statusCode: js.UndefOr[entityStatusCode]
    var tags: js.UndefOr[tagSet]
  }

  object AffectedEntity {
    def apply(
      awsAccountId: js.UndefOr[accountId] = js.undefined,
      entityArn: js.UndefOr[entityArn] = js.undefined,
      entityValue: js.UndefOr[entityValue] = js.undefined,
      eventArn: js.UndefOr[eventArn] = js.undefined,
      lastUpdatedTime: js.UndefOr[timestamp] = js.undefined,
      statusCode: js.UndefOr[entityStatusCode] = js.undefined,
      tags: js.UndefOr[tagSet] = js.undefined): AffectedEntity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsAccountId" -> awsAccountId.map { x => x.asInstanceOf[js.Any] },
        "entityArn" -> entityArn.map { x => x.asInstanceOf[js.Any] },
        "entityValue" -> entityValue.map { x => x.asInstanceOf[js.Any] },
        "eventArn" -> eventArn.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedTime" -> lastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AffectedEntity]
    }
  }

  /**
   * A range of dates and times that is used by the <a>EventFilter</a> and <a>EntityFilter</a> objects. If <code>from</code> is set and <code>to</code> is set: match items where the timestamp (<code>startTime</code>, <code>endTime</code>, or <code>lastUpdatedTime</code>) is between <code>from</code> and <code>to</code> inclusive. If <code>from</code> is set and <code>to</code> is not set: match items where the timestamp value is equal to or after <code>from</code>. If <code>from</code> is not set and <code>to</code> is set: match items where the timestamp value is equal to or before <code>to</code>.
   */
  @js.native
  trait DateTimeRange extends js.Object {
    var from: js.UndefOr[timestamp]
    var to: js.UndefOr[timestamp]
  }

  object DateTimeRange {
    def apply(
      from: js.UndefOr[timestamp] = js.undefined,
      to: js.UndefOr[timestamp] = js.undefined): DateTimeRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "from" -> from.map { x => x.asInstanceOf[js.Any] },
        "to" -> to.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DateTimeRange]
    }
  }

  @js.native
  trait DescribeAffectedEntitiesRequest extends js.Object {
    var filter: EntityFilter
    var locale: js.UndefOr[locale]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object DescribeAffectedEntitiesRequest {
    def apply(
      filter: EntityFilter,
      locale: js.UndefOr[locale] = js.undefined,
      maxResults: js.UndefOr[maxResults] = js.undefined,
      nextToken: js.UndefOr[nextToken] = js.undefined): DescribeAffectedEntitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filter" -> filter.asInstanceOf[js.Any],
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAffectedEntitiesRequest]
    }
  }

  @js.native
  trait DescribeAffectedEntitiesResponse extends js.Object {
    var entities: js.UndefOr[EntityList]
    var nextToken: js.UndefOr[nextToken]
  }

  object DescribeAffectedEntitiesResponse {
    def apply(
      entities: js.UndefOr[EntityList] = js.undefined,
      nextToken: js.UndefOr[nextToken] = js.undefined): DescribeAffectedEntitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "entities" -> entities.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAffectedEntitiesResponse]
    }
  }

  @js.native
  trait DescribeEntityAggregatesRequest extends js.Object {
    var eventArns: js.UndefOr[EventArnsList]
  }

  object DescribeEntityAggregatesRequest {
    def apply(
      eventArns: js.UndefOr[EventArnsList] = js.undefined): DescribeEntityAggregatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventArns" -> eventArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEntityAggregatesRequest]
    }
  }

  @js.native
  trait DescribeEntityAggregatesResponse extends js.Object {
    var entityAggregates: js.UndefOr[EntityAggregateList]
  }

  object DescribeEntityAggregatesResponse {
    def apply(
      entityAggregates: js.UndefOr[EntityAggregateList] = js.undefined): DescribeEntityAggregatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "entityAggregates" -> entityAggregates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEntityAggregatesResponse]
    }
  }

  @js.native
  trait DescribeEventAggregatesRequest extends js.Object {
    var aggregateField: eventAggregateField
    var filter: js.UndefOr[EventFilter]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object DescribeEventAggregatesRequest {
    def apply(
      aggregateField: eventAggregateField,
      filter: js.UndefOr[EventFilter] = js.undefined,
      maxResults: js.UndefOr[maxResults] = js.undefined,
      nextToken: js.UndefOr[nextToken] = js.undefined): DescribeEventAggregatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "aggregateField" -> aggregateField.asInstanceOf[js.Any],
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventAggregatesRequest]
    }
  }

  @js.native
  trait DescribeEventAggregatesResponse extends js.Object {
    var eventAggregates: js.UndefOr[EventAggregateList]
    var nextToken: js.UndefOr[nextToken]
  }

  object DescribeEventAggregatesResponse {
    def apply(
      eventAggregates: js.UndefOr[EventAggregateList] = js.undefined,
      nextToken: js.UndefOr[nextToken] = js.undefined): DescribeEventAggregatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventAggregates" -> eventAggregates.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventAggregatesResponse]
    }
  }

  @js.native
  trait DescribeEventDetailsRequest extends js.Object {
    var eventArns: eventArnList
    var locale: js.UndefOr[locale]
  }

  object DescribeEventDetailsRequest {
    def apply(
      eventArns: eventArnList,
      locale: js.UndefOr[locale] = js.undefined): DescribeEventDetailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventArns" -> eventArns.asInstanceOf[js.Any],
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventDetailsRequest]
    }
  }

  @js.native
  trait DescribeEventDetailsResponse extends js.Object {
    var failedSet: js.UndefOr[DescribeEventDetailsFailedSet]
    var successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet]
  }

  object DescribeEventDetailsResponse {
    def apply(
      failedSet: js.UndefOr[DescribeEventDetailsFailedSet] = js.undefined,
      successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet] = js.undefined): DescribeEventDetailsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failedSet" -> failedSet.map { x => x.asInstanceOf[js.Any] },
        "successfulSet" -> successfulSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventDetailsResponse]
    }
  }

  @js.native
  trait DescribeEventTypesRequest extends js.Object {
    var filter: js.UndefOr[EventTypeFilter]
    var locale: js.UndefOr[locale]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object DescribeEventTypesRequest {
    def apply(
      filter: js.UndefOr[EventTypeFilter] = js.undefined,
      locale: js.UndefOr[locale] = js.undefined,
      maxResults: js.UndefOr[maxResults] = js.undefined,
      nextToken: js.UndefOr[nextToken] = js.undefined): DescribeEventTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventTypesRequest]
    }
  }

  @js.native
  trait DescribeEventTypesResponse extends js.Object {
    var eventTypes: js.UndefOr[EventTypeList]
    var nextToken: js.UndefOr[nextToken]
  }

  object DescribeEventTypesResponse {
    def apply(
      eventTypes: js.UndefOr[EventTypeList] = js.undefined,
      nextToken: js.UndefOr[nextToken] = js.undefined): DescribeEventTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventTypes" -> eventTypes.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventTypesResponse]
    }
  }

  @js.native
  trait DescribeEventsRequest extends js.Object {
    var filter: js.UndefOr[EventFilter]
    var locale: js.UndefOr[locale]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object DescribeEventsRequest {
    def apply(
      filter: js.UndefOr[EventFilter] = js.undefined,
      locale: js.UndefOr[locale] = js.undefined,
      maxResults: js.UndefOr[maxResults] = js.undefined,
      nextToken: js.UndefOr[nextToken] = js.undefined): DescribeEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsRequest]
    }
  }

  @js.native
  trait DescribeEventsResponse extends js.Object {
    var events: js.UndefOr[EventList]
    var nextToken: js.UndefOr[nextToken]
  }

  object DescribeEventsResponse {
    def apply(
      events: js.UndefOr[EventList] = js.undefined,
      nextToken: js.UndefOr[nextToken] = js.undefined): DescribeEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsResponse]
    }
  }

  /**
   * The number of entities that are affected by one or more events. Returned by the <a>DescribeEntityAggregates</a> operation.
   */
  @js.native
  trait EntityAggregate extends js.Object {
    var count: js.UndefOr[count]
    var eventArn: js.UndefOr[eventArn]
  }

  object EntityAggregate {
    def apply(
      count: js.UndefOr[count] = js.undefined,
      eventArn: js.UndefOr[eventArn] = js.undefined): EntityAggregate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "eventArn" -> eventArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityAggregate]
    }
  }

  /**
   * The values to use to filter results from the <a>DescribeAffectedEntities</a> operation.
   */
  @js.native
  trait EntityFilter extends js.Object {
    var eventArns: eventArnList
    var entityArns: js.UndefOr[entityArnList]
    var entityValues: js.UndefOr[entityValueList]
    var lastUpdatedTimes: js.UndefOr[dateTimeRangeList]
    var statusCodes: js.UndefOr[entityStatusCodeList]
    var tags: js.UndefOr[tagFilter]
  }

  object EntityFilter {
    def apply(
      eventArns: eventArnList,
      entityArns: js.UndefOr[entityArnList] = js.undefined,
      entityValues: js.UndefOr[entityValueList] = js.undefined,
      lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.undefined,
      statusCodes: js.UndefOr[entityStatusCodeList] = js.undefined,
      tags: js.UndefOr[tagFilter] = js.undefined): EntityFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventArns" -> eventArns.asInstanceOf[js.Any],
        "entityArns" -> entityArns.map { x => x.asInstanceOf[js.Any] },
        "entityValues" -> entityValues.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedTimes" -> lastUpdatedTimes.map { x => x.asInstanceOf[js.Any] },
        "statusCodes" -> statusCodes.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntityFilter]
    }
  }

  /**
   * Summary information about an event, returned by the <a>DescribeEvents</a> operation. The <a>DescribeEventDetails</a> operation also returns this information, as well as the <a>EventDescription</a> and additional event metadata.
   */
  @js.native
  trait Event extends js.Object {
    var arn: js.UndefOr[eventArn]
    var availabilityZone: js.UndefOr[availabilityZone]
    var endTime: js.UndefOr[timestamp]
    var eventTypeCategory: js.UndefOr[eventTypeCategory]
    var eventTypeCode: js.UndefOr[eventTypeCode]
    var lastUpdatedTime: js.UndefOr[timestamp]
    var region: js.UndefOr[region]
    var service: js.UndefOr[service]
    var startTime: js.UndefOr[timestamp]
    var statusCode: js.UndefOr[eventStatusCode]
  }

  object Event {
    def apply(
      arn: js.UndefOr[eventArn] = js.undefined,
      availabilityZone: js.UndefOr[availabilityZone] = js.undefined,
      endTime: js.UndefOr[timestamp] = js.undefined,
      eventTypeCategory: js.UndefOr[eventTypeCategory] = js.undefined,
      eventTypeCode: js.UndefOr[eventTypeCode] = js.undefined,
      lastUpdatedTime: js.UndefOr[timestamp] = js.undefined,
      region: js.UndefOr[region] = js.undefined,
      service: js.UndefOr[service] = js.undefined,
      startTime: js.UndefOr[timestamp] = js.undefined,
      statusCode: js.UndefOr[eventStatusCode] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "eventTypeCategory" -> eventTypeCategory.map { x => x.asInstanceOf[js.Any] },
        "eventTypeCode" -> eventTypeCode.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedTime" -> lastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] },
        "service" -> service.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * The number of events of each issue type. Returned by the <a>DescribeEventAggregates</a> operation.
   */
  @js.native
  trait EventAggregate extends js.Object {
    var aggregateValue: js.UndefOr[aggregateValue]
    var count: js.UndefOr[count]
  }

  object EventAggregate {
    def apply(
      aggregateValue: js.UndefOr[aggregateValue] = js.undefined,
      count: js.UndefOr[count] = js.undefined): EventAggregate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "aggregateValue" -> aggregateValue.map { x => x.asInstanceOf[js.Any] },
        "count" -> count.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventAggregate]
    }
  }

  /**
   * The detailed description of the event. Included in the information returned by the <a>DescribeEventDetails</a> operation.
   */
  @js.native
  trait EventDescription extends js.Object {
    var latestDescription: js.UndefOr[eventDescription]
  }

  object EventDescription {
    def apply(
      latestDescription: js.UndefOr[eventDescription] = js.undefined): EventDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "latestDescription" -> latestDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDescription]
    }
  }

  /**
   * Detailed information about an event. A combination of an <a>Event</a> object, an <a>EventDescription</a> object, and additional metadata about the event. Returned by the <a>DescribeEventDetails</a> operation.
   */
  @js.native
  trait EventDetails extends js.Object {
    var event: js.UndefOr[Event]
    var eventDescription: js.UndefOr[EventDescription]
    var eventMetadata: js.UndefOr[eventMetadata]
  }

  object EventDetails {
    def apply(
      event: js.UndefOr[Event] = js.undefined,
      eventDescription: js.UndefOr[EventDescription] = js.undefined,
      eventMetadata: js.UndefOr[eventMetadata] = js.undefined): EventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "event" -> event.map { x => x.asInstanceOf[js.Any] },
        "eventDescription" -> eventDescription.map { x => x.asInstanceOf[js.Any] },
        "eventMetadata" -> eventMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDetails]
    }
  }

  /**
   * Error information returned when a <a>DescribeEventDetails</a> operation cannot find a specified event.
   */
  @js.native
  trait EventDetailsErrorItem extends js.Object {
    var errorMessage: js.UndefOr[string]
    var errorName: js.UndefOr[string]
    var eventArn: js.UndefOr[eventArn]
  }

  object EventDetailsErrorItem {
    def apply(
      errorMessage: js.UndefOr[string] = js.undefined,
      errorName: js.UndefOr[string] = js.undefined,
      eventArn: js.UndefOr[eventArn] = js.undefined): EventDetailsErrorItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errorMessage" -> errorMessage.map { x => x.asInstanceOf[js.Any] },
        "errorName" -> errorName.map { x => x.asInstanceOf[js.Any] },
        "eventArn" -> eventArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDetailsErrorItem]
    }
  }

  /**
   * The values to use to filter results from the <a>DescribeEvents</a> and <a>DescribeEventAggregates</a> operations.
   */
  @js.native
  trait EventFilter extends js.Object {
    var availabilityZones: js.UndefOr[availabilityZones]
    var endTimes: js.UndefOr[dateTimeRangeList]
    var entityArns: js.UndefOr[entityArnList]
    var entityValues: js.UndefOr[entityValueList]
    var eventArns: js.UndefOr[eventArnList]
    var eventStatusCodes: js.UndefOr[eventStatusCodeList]
    var eventTypeCategories: js.UndefOr[eventTypeCategoryList]
    var eventTypeCodes: js.UndefOr[eventTypeList]
    var lastUpdatedTimes: js.UndefOr[dateTimeRangeList]
    var regions: js.UndefOr[regionList]
    var services: js.UndefOr[serviceList]
    var startTimes: js.UndefOr[dateTimeRangeList]
    var tags: js.UndefOr[tagFilter]
  }

  object EventFilter {
    def apply(
      availabilityZones: js.UndefOr[availabilityZones] = js.undefined,
      endTimes: js.UndefOr[dateTimeRangeList] = js.undefined,
      entityArns: js.UndefOr[entityArnList] = js.undefined,
      entityValues: js.UndefOr[entityValueList] = js.undefined,
      eventArns: js.UndefOr[eventArnList] = js.undefined,
      eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.undefined,
      eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.undefined,
      eventTypeCodes: js.UndefOr[eventTypeList] = js.undefined,
      lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.undefined,
      regions: js.UndefOr[regionList] = js.undefined,
      services: js.UndefOr[serviceList] = js.undefined,
      startTimes: js.UndefOr[dateTimeRangeList] = js.undefined,
      tags: js.UndefOr[tagFilter] = js.undefined): EventFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availabilityZones" -> availabilityZones.map { x => x.asInstanceOf[js.Any] },
        "endTimes" -> endTimes.map { x => x.asInstanceOf[js.Any] },
        "entityArns" -> entityArns.map { x => x.asInstanceOf[js.Any] },
        "entityValues" -> entityValues.map { x => x.asInstanceOf[js.Any] },
        "eventArns" -> eventArns.map { x => x.asInstanceOf[js.Any] },
        "eventStatusCodes" -> eventStatusCodes.map { x => x.asInstanceOf[js.Any] },
        "eventTypeCategories" -> eventTypeCategories.map { x => x.asInstanceOf[js.Any] },
        "eventTypeCodes" -> eventTypeCodes.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedTimes" -> lastUpdatedTimes.map { x => x.asInstanceOf[js.Any] },
        "regions" -> regions.map { x => x.asInstanceOf[js.Any] },
        "services" -> services.map { x => x.asInstanceOf[js.Any] },
        "startTimes" -> startTimes.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventFilter]
    }
  }

  /**
   * Metadata about a type of event that is reported by AWS Health. Data consists of the category (for example, <code>issue</code>), the service (for example, <code>EC2</code>), and the event type code (for example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
   */
  @js.native
  trait EventType extends js.Object {
    var category: js.UndefOr[eventTypeCategory]
    var code: js.UndefOr[eventTypeCode]
    var service: js.UndefOr[service]
  }

  object EventType {
    def apply(
      category: js.UndefOr[eventTypeCategory] = js.undefined,
      code: js.UndefOr[eventTypeCode] = js.undefined,
      service: js.UndefOr[service] = js.undefined): EventType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "category" -> category.map { x => x.asInstanceOf[js.Any] },
        "code" -> code.map { x => x.asInstanceOf[js.Any] },
        "service" -> service.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventType]
    }
  }

  /**
   * The values to use to filter results from the <a>DescribeEventTypes</a> operation.
   */
  @js.native
  trait EventTypeFilter extends js.Object {
    var eventTypeCategories: js.UndefOr[EventTypeCategoryList]
    var eventTypeCodes: js.UndefOr[EventTypeCodeList]
    var services: js.UndefOr[serviceList]
  }

  object EventTypeFilter {
    def apply(
      eventTypeCategories: js.UndefOr[EventTypeCategoryList] = js.undefined,
      eventTypeCodes: js.UndefOr[EventTypeCodeList] = js.undefined,
      services: js.UndefOr[serviceList] = js.undefined): EventTypeFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventTypeCategories" -> eventTypeCategories.map { x => x.asInstanceOf[js.Any] },
        "eventTypeCodes" -> eventTypeCodes.map { x => x.asInstanceOf[js.Any] },
        "services" -> services.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventTypeFilter]
    }
  }

  /**
   * The specified pagination token (<code>nextToken</code>) is not valid.
   */
  @js.native
  trait InvalidPaginationTokenException extends js.Object {
    val message: string
  }

  /**
   * The specified locale is not supported.
   */
  @js.native
  trait UnsupportedLocaleException extends js.Object {
    val message: string
  }

  object entityStatusCodeEnum {
    val IMPAIRED = "IMPAIRED"
    val UNIMPAIRED = "UNIMPAIRED"
    val UNKNOWN = "UNKNOWN"

    val values = IndexedSeq(IMPAIRED, UNIMPAIRED, UNKNOWN)
  }

  object eventAggregateFieldEnum {
    val eventTypeCategory = "eventTypeCategory"

    val values = IndexedSeq(eventTypeCategory)
  }

  object eventStatusCodeEnum {
    val open = "open"
    val closed = "closed"
    val upcoming = "upcoming"

    val values = IndexedSeq(open, closed, upcoming)
  }

  object eventTypeCategoryEnum {
    val issue = "issue"
    val accountNotification = "accountNotification"
    val scheduledChange = "scheduledChange"

    val values = IndexedSeq(issue, accountNotification, scheduledChange)
  }
}
