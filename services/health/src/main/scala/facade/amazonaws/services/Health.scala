package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object health {
  type DescribeAffectedEntitiesForOrganizationFailedSet = js.Array[OrganizationAffectedEntitiesErrorItem]
  type DescribeEventDetailsFailedSet                    = js.Array[EventDetailsErrorItem]
  type DescribeEventDetailsForOrganizationFailedSet     = js.Array[OrganizationEventDetailsErrorItem]
  type DescribeEventDetailsForOrganizationSuccessfulSet = js.Array[OrganizationEventDetails]
  type DescribeEventDetailsSuccessfulSet                = js.Array[EventDetails]
  type EntityAggregateList                              = js.Array[EntityAggregate]
  type EntityList                                       = js.Array[AffectedEntity]
  type EventAggregateList                               = js.Array[EventAggregate]
  type EventArnsList                                    = js.Array[eventArn]
  type EventList                                        = js.Array[Event]
  type EventTypeCategoryList                            = js.Array[eventTypeCategory]
  type EventTypeCodeList                                = js.Array[eventTypeCode]
  type EventTypeList                                    = js.Array[EventType]
  type OrganizationEntityFiltersList                    = js.Array[EventAccountFilter]
  type OrganizationEventDetailFiltersList               = js.Array[EventAccountFilter]
  type OrganizationEventList                            = js.Array[OrganizationEvent]
  type accountId                                        = String
  type affectedAccountsList                             = js.Array[accountId]
  type aggregateValue                                   = String
  type availabilityZone                                 = String
  type availabilityZones                                = js.Array[availabilityZone]
  type awsAccountIdsList                                = js.Array[accountId]
  type count                                            = Int
  type dateTimeRangeList                                = js.Array[DateTimeRange]
  type entityArn                                        = String
  type entityArnList                                    = js.Array[entityArn]
  type entityStatusCodeList                             = js.Array[entityStatusCode]
  type entityUrl                                        = String
  type entityValue                                      = String
  type entityValueList                                  = js.Array[entityValue]
  type eventArn                                         = String
  type eventArnList                                     = js.Array[eventArn]
  type eventDescription                                 = String
  type eventMetadata                                    = js.Dictionary[metadataValue]
  type eventStatusCodeList                              = js.Array[eventStatusCode]
  type eventType                                        = String
  type eventTypeCategoryList                            = js.Array[eventTypeCategory]
  type eventTypeCode                                    = String
  type eventTypeList                                    = js.Array[eventType]
  type healthServiceAccessStatusForOrganization         = String
  type locale                                           = String
  type maxResults                                       = Int
  type metadataKey                                      = String
  type metadataValue                                    = String
  type nextToken                                        = String
  type region                                           = String
  type regionList                                       = js.Array[region]
  type service                                          = String
  type serviceList                                      = js.Array[service]
  type tagFilter                                        = js.Array[tagSet]
  type tagKey                                           = String
  type tagSet                                           = js.Dictionary[tagValue]
  type tagValue                                         = String
  type timestamp                                        = js.Date

  implicit final class HealthOps(private val service: Health) extends AnyVal {

    @inline def describeAffectedAccountsForOrganizationFuture(
        params: DescribeAffectedAccountsForOrganizationRequest
    ): Future[DescribeAffectedAccountsForOrganizationResponse] =
      service.describeAffectedAccountsForOrganization(params).promise().toFuture
    @inline def describeAffectedEntitiesForOrganizationFuture(
        params: DescribeAffectedEntitiesForOrganizationRequest
    ): Future[DescribeAffectedEntitiesForOrganizationResponse] =
      service.describeAffectedEntitiesForOrganization(params).promise().toFuture
    @inline def describeAffectedEntitiesFuture(
        params: DescribeAffectedEntitiesRequest
    ): Future[DescribeAffectedEntitiesResponse] = service.describeAffectedEntities(params).promise().toFuture
    @inline def describeEntityAggregatesFuture(
        params: DescribeEntityAggregatesRequest
    ): Future[DescribeEntityAggregatesResponse] = service.describeEntityAggregates(params).promise().toFuture
    @inline def describeEventAggregatesFuture(
        params: DescribeEventAggregatesRequest
    ): Future[DescribeEventAggregatesResponse] = service.describeEventAggregates(params).promise().toFuture
    @inline def describeEventDetailsForOrganizationFuture(
        params: DescribeEventDetailsForOrganizationRequest
    ): Future[DescribeEventDetailsForOrganizationResponse] =
      service.describeEventDetailsForOrganization(params).promise().toFuture
    @inline def describeEventDetailsFuture(params: DescribeEventDetailsRequest): Future[DescribeEventDetailsResponse] =
      service.describeEventDetails(params).promise().toFuture
    @inline def describeEventTypesFuture(params: DescribeEventTypesRequest): Future[DescribeEventTypesResponse] =
      service.describeEventTypes(params).promise().toFuture
    @inline def describeEventsForOrganizationFuture(
        params: DescribeEventsForOrganizationRequest
    ): Future[DescribeEventsForOrganizationResponse] = service.describeEventsForOrganization(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsRequest): Future[DescribeEventsResponse] =
      service.describeEvents(params).promise().toFuture
    @inline def describeHealthServiceStatusForOrganizationFuture()
        : Future[DescribeHealthServiceStatusForOrganizationResponse] =
      service.describeHealthServiceStatusForOrganization().promise().toFuture
    @inline def disableHealthServiceAccessForOrganizationFuture(): Future[js.Object] =
      service.disableHealthServiceAccessForOrganization().promise().toFuture
    @inline def enableHealthServiceAccessForOrganizationFuture(): Future[js.Object] =
      service.enableHealthServiceAccessForOrganization().promise().toFuture
  }
}

package health {
  @js.native
  @JSImport("aws-sdk", "Health")
  class Health() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeAffectedAccountsForOrganization(
        params: DescribeAffectedAccountsForOrganizationRequest
    ): Request[DescribeAffectedAccountsForOrganizationResponse] = js.native
    def describeAffectedEntities(params: DescribeAffectedEntitiesRequest): Request[DescribeAffectedEntitiesResponse] =
      js.native
    def describeAffectedEntitiesForOrganization(
        params: DescribeAffectedEntitiesForOrganizationRequest
    ): Request[DescribeAffectedEntitiesForOrganizationResponse] = js.native
    def describeEntityAggregates(params: DescribeEntityAggregatesRequest): Request[DescribeEntityAggregatesResponse] =
      js.native
    def describeEventAggregates(params: DescribeEventAggregatesRequest): Request[DescribeEventAggregatesResponse] =
      js.native
    def describeEventDetails(params: DescribeEventDetailsRequest): Request[DescribeEventDetailsResponse] = js.native
    def describeEventDetailsForOrganization(
        params: DescribeEventDetailsForOrganizationRequest
    ): Request[DescribeEventDetailsForOrganizationResponse]                                        = js.native
    def describeEventTypes(params: DescribeEventTypesRequest): Request[DescribeEventTypesResponse] = js.native
    def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse]             = js.native
    def describeEventsForOrganization(
        params: DescribeEventsForOrganizationRequest
    ): Request[DescribeEventsForOrganizationResponse] = js.native
    def describeHealthServiceStatusForOrganization(): Request[DescribeHealthServiceStatusForOrganizationResponse] =
      js.native
    def disableHealthServiceAccessForOrganization(): Request[js.Object] = js.native
    def enableHealthServiceAccessForOrganization(): Request[js.Object]  = js.native
  }

  /**
    * Information about an entity that is affected by a Health event.
    */
  @js.native
  @Factory
  trait AffectedEntity extends js.Object {
    var awsAccountId: js.UndefOr[accountId]
    var entityArn: js.UndefOr[entityArn]
    var entityUrl: js.UndefOr[entityUrl]
    var entityValue: js.UndefOr[entityValue]
    var eventArn: js.UndefOr[eventArn]
    var lastUpdatedTime: js.UndefOr[timestamp]
    var statusCode: js.UndefOr[entityStatusCode]
    var tags: js.UndefOr[tagSet]
  }

  /**
    * A range of dates and times that is used by the <a>EventFilter</a> and <a>EntityFilter</a> objects. If <code>from</code> is set and <code>to</code> is set: match items where the timestamp (<code>startTime</code>, <code>endTime</code>, or <code>lastUpdatedTime</code>) is between <code>from</code> and <code>to</code> inclusive. If <code>from</code> is set and <code>to</code> is not set: match items where the timestamp value is equal to or after <code>from</code>. If <code>from</code> is not set and <code>to</code> is set: match items where the timestamp value is equal to or before <code>to</code>.
    */
  @js.native
  @Factory
  trait DateTimeRange extends js.Object {
    var from: js.UndefOr[timestamp]
    var to: js.UndefOr[timestamp]
  }

  @js.native
  @Factory
  trait DescribeAffectedAccountsForOrganizationRequest extends js.Object {
    var eventArn: eventArn
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeAffectedAccountsForOrganizationResponse extends js.Object {
    var affectedAccounts: js.UndefOr[affectedAccountsList]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeAffectedEntitiesForOrganizationRequest extends js.Object {
    var organizationEntityFilters: OrganizationEntityFiltersList
    var locale: js.UndefOr[locale]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeAffectedEntitiesForOrganizationResponse extends js.Object {
    var entities: js.UndefOr[EntityList]
    var failedSet: js.UndefOr[DescribeAffectedEntitiesForOrganizationFailedSet]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeAffectedEntitiesRequest extends js.Object {
    var filter: EntityFilter
    var locale: js.UndefOr[locale]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeAffectedEntitiesResponse extends js.Object {
    var entities: js.UndefOr[EntityList]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeEntityAggregatesRequest extends js.Object {
    var eventArns: js.UndefOr[EventArnsList]
  }

  @js.native
  @Factory
  trait DescribeEntityAggregatesResponse extends js.Object {
    var entityAggregates: js.UndefOr[EntityAggregateList]
  }

  @js.native
  @Factory
  trait DescribeEventAggregatesRequest extends js.Object {
    var aggregateField: eventAggregateField
    var filter: js.UndefOr[EventFilter]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeEventAggregatesResponse extends js.Object {
    var eventAggregates: js.UndefOr[EventAggregateList]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeEventDetailsForOrganizationRequest extends js.Object {
    var organizationEventDetailFilters: OrganizationEventDetailFiltersList
    var locale: js.UndefOr[locale]
  }

  @js.native
  @Factory
  trait DescribeEventDetailsForOrganizationResponse extends js.Object {
    var failedSet: js.UndefOr[DescribeEventDetailsForOrganizationFailedSet]
    var successfulSet: js.UndefOr[DescribeEventDetailsForOrganizationSuccessfulSet]
  }

  @js.native
  @Factory
  trait DescribeEventDetailsRequest extends js.Object {
    var eventArns: eventArnList
    var locale: js.UndefOr[locale]
  }

  @js.native
  @Factory
  trait DescribeEventDetailsResponse extends js.Object {
    var failedSet: js.UndefOr[DescribeEventDetailsFailedSet]
    var successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet]
  }

  @js.native
  @Factory
  trait DescribeEventTypesRequest extends js.Object {
    var filter: js.UndefOr[EventTypeFilter]
    var locale: js.UndefOr[locale]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeEventTypesResponse extends js.Object {
    var eventTypes: js.UndefOr[EventTypeList]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeEventsForOrganizationRequest extends js.Object {
    var filter: js.UndefOr[OrganizationEventFilter]
    var locale: js.UndefOr[locale]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeEventsForOrganizationResponse extends js.Object {
    var events: js.UndefOr[OrganizationEventList]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeEventsRequest extends js.Object {
    var filter: js.UndefOr[EventFilter]
    var locale: js.UndefOr[locale]
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeEventsResponse extends js.Object {
    var events: js.UndefOr[EventList]
    var nextToken: js.UndefOr[nextToken]
  }

  @js.native
  @Factory
  trait DescribeHealthServiceStatusForOrganizationResponse extends js.Object {
    var healthServiceAccessStatusForOrganization: js.UndefOr[healthServiceAccessStatusForOrganization]
  }

  /**
    * The number of entities that are affected by one or more events. Returned by the <a>DescribeEntityAggregates</a> operation.
    */
  @js.native
  @Factory
  trait EntityAggregate extends js.Object {
    var count: js.UndefOr[count]
    var eventArn: js.UndefOr[eventArn]
  }

  /**
    * The values to use to filter results from the <a>DescribeAffectedEntities</a> operation.
    */
  @js.native
  @Factory
  trait EntityFilter extends js.Object {
    var eventArns: eventArnList
    var entityArns: js.UndefOr[entityArnList]
    var entityValues: js.UndefOr[entityValueList]
    var lastUpdatedTimes: js.UndefOr[dateTimeRangeList]
    var statusCodes: js.UndefOr[entityStatusCodeList]
    var tags: js.UndefOr[tagFilter]
  }

  /**
    * Summary information about an AWS Health event.
    */
  @js.native
  @Factory
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

  /**
    * The values used to filter results from the <a>DescribeEventDetailsForOrganization</a> and <a>DescribeAffectedEntitiesForOrganization</a> operations.
    */
  @js.native
  @Factory
  trait EventAccountFilter extends js.Object {
    var awsAccountId: accountId
    var eventArn: eventArn
  }

  /**
    * The number of events of each issue type. Returned by the <a>DescribeEventAggregates</a> operation.
    */
  @js.native
  @Factory
  trait EventAggregate extends js.Object {
    var aggregateValue: js.UndefOr[aggregateValue]
    var count: js.UndefOr[count]
  }

  /**
    * The detailed description of the event. Included in the information returned by the <a>DescribeEventDetails</a> operation.
    */
  @js.native
  @Factory
  trait EventDescription extends js.Object {
    var latestDescription: js.UndefOr[eventDescription]
  }

  /**
    * Detailed information about an event. A combination of an <a>Event</a> object, an <a>EventDescription</a> object, and additional metadata about the event. Returned by the <a>DescribeEventDetails</a> operation.
    */
  @js.native
  @Factory
  trait EventDetails extends js.Object {
    var event: js.UndefOr[Event]
    var eventDescription: js.UndefOr[EventDescription]
    var eventMetadata: js.UndefOr[eventMetadata]
  }

  /**
    * Error information returned when a <a>DescribeEventDetails</a> operation cannot find a specified event.
    */
  @js.native
  @Factory
  trait EventDetailsErrorItem extends js.Object {
    var errorMessage: js.UndefOr[String]
    var errorName: js.UndefOr[String]
    var eventArn: js.UndefOr[eventArn]
  }

  /**
    * The values to use to filter results from the <a>DescribeEvents</a> and <a>DescribeEventAggregates</a> operations.
    */
  @js.native
  @Factory
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

  /**
    * Metadata about a type of event that is reported by AWS Health. Data consists of the category (for example, <code>issue</code>), the service (for example, <code>EC2</code>), and the event type code (for example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
    */
  @js.native
  @Factory
  trait EventType extends js.Object {
    var category: js.UndefOr[eventTypeCategory]
    var code: js.UndefOr[eventTypeCode]
    var service: js.UndefOr[service]
  }

  /**
    * The values to use to filter results from the <a>DescribeEventTypes</a> operation.
    */
  @js.native
  @Factory
  trait EventTypeFilter extends js.Object {
    var eventTypeCategories: js.UndefOr[EventTypeCategoryList]
    var eventTypeCodes: js.UndefOr[EventTypeCodeList]
    var services: js.UndefOr[serviceList]
  }

  /**
    * Error information returned when a <a>DescribeAffectedEntitiesForOrganization</a> operation cannot find or process a specific entity.
    */
  @js.native
  @Factory
  trait OrganizationAffectedEntitiesErrorItem extends js.Object {
    var awsAccountId: js.UndefOr[accountId]
    var errorMessage: js.UndefOr[String]
    var errorName: js.UndefOr[String]
    var eventArn: js.UndefOr[eventArn]
  }

  /**
    * Summary information about an event, returned by the <a>DescribeEventsForOrganization</a> operation.
    */
  @js.native
  @Factory
  trait OrganizationEvent extends js.Object {
    var arn: js.UndefOr[eventArn]
    var endTime: js.UndefOr[timestamp]
    var eventTypeCategory: js.UndefOr[eventTypeCategory]
    var eventTypeCode: js.UndefOr[eventTypeCode]
    var lastUpdatedTime: js.UndefOr[timestamp]
    var region: js.UndefOr[region]
    var service: js.UndefOr[service]
    var startTime: js.UndefOr[timestamp]
    var statusCode: js.UndefOr[eventStatusCode]
  }

  /**
    * Detailed information about an event. A combination of an <a>Event</a> object, an <a>EventDescription</a> object, and additional metadata about the event. Returned by the <a>DescribeEventDetailsForOrganization</a> operation.
    */
  @js.native
  @Factory
  trait OrganizationEventDetails extends js.Object {
    var awsAccountId: js.UndefOr[accountId]
    var event: js.UndefOr[Event]
    var eventDescription: js.UndefOr[EventDescription]
    var eventMetadata: js.UndefOr[eventMetadata]
  }

  /**
    * Error information returned when a <a>DescribeEventDetailsForOrganization</a> operation cannot find a specified event.
    */
  @js.native
  @Factory
  trait OrganizationEventDetailsErrorItem extends js.Object {
    var awsAccountId: js.UndefOr[accountId]
    var errorMessage: js.UndefOr[String]
    var errorName: js.UndefOr[String]
    var eventArn: js.UndefOr[eventArn]
  }

  /**
    * The values to filter results from the <a>DescribeEventsForOrganization</a> operation.
    */
  @js.native
  @Factory
  trait OrganizationEventFilter extends js.Object {
    var awsAccountIds: js.UndefOr[awsAccountIdsList]
    var endTime: js.UndefOr[DateTimeRange]
    var entityArns: js.UndefOr[entityArnList]
    var entityValues: js.UndefOr[entityValueList]
    var eventStatusCodes: js.UndefOr[eventStatusCodeList]
    var eventTypeCategories: js.UndefOr[eventTypeCategoryList]
    var eventTypeCodes: js.UndefOr[eventTypeList]
    var lastUpdatedTime: js.UndefOr[DateTimeRange]
    var regions: js.UndefOr[regionList]
    var services: js.UndefOr[serviceList]
    var startTime: js.UndefOr[DateTimeRange]
  }

  @js.native
  sealed trait entityStatusCode extends js.Any
  object entityStatusCode extends js.Object {
    val IMPAIRED   = "IMPAIRED".asInstanceOf[entityStatusCode]
    val UNIMPAIRED = "UNIMPAIRED".asInstanceOf[entityStatusCode]
    val UNKNOWN    = "UNKNOWN".asInstanceOf[entityStatusCode]

    val values = js.Object.freeze(js.Array(IMPAIRED, UNIMPAIRED, UNKNOWN))
  }

  @js.native
  sealed trait eventAggregateField extends js.Any
  object eventAggregateField extends js.Object {
    val eventTypeCategory = "eventTypeCategory".asInstanceOf[eventAggregateField]

    val values = js.Object.freeze(js.Array(eventTypeCategory))
  }

  @js.native
  sealed trait eventStatusCode extends js.Any
  object eventStatusCode extends js.Object {
    val open     = "open".asInstanceOf[eventStatusCode]
    val closed   = "closed".asInstanceOf[eventStatusCode]
    val upcoming = "upcoming".asInstanceOf[eventStatusCode]

    val values = js.Object.freeze(js.Array(open, closed, upcoming))
  }

  @js.native
  sealed trait eventTypeCategory extends js.Any
  object eventTypeCategory extends js.Object {
    val issue               = "issue".asInstanceOf[eventTypeCategory]
    val accountNotification = "accountNotification".asInstanceOf[eventTypeCategory]
    val scheduledChange     = "scheduledChange".asInstanceOf[eventTypeCategory]
    val investigation       = "investigation".asInstanceOf[eventTypeCategory]

    val values = js.Object.freeze(js.Array(issue, accountNotification, scheduledChange, investigation))
  }
}
