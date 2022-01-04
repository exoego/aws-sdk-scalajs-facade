package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object appintegrations {
  type Arn = String
  type ClientAssociationMetadata = js.Dictionary[NonBlankString]
  type ClientId = String
  type DataIntegrationAssociationsList = js.Array[DataIntegrationAssociationSummary]
  type DataIntegrationsList = js.Array[DataIntegrationSummary]
  type Description = String
  type EventBridgeBus = String
  type EventBridgeRuleName = String
  type EventIntegrationAssociationsList = js.Array[EventIntegrationAssociation]
  type EventIntegrationsList = js.Array[EventIntegration]
  type IdempotencyToken = String
  type Identifier = String
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type NonBlankString = String
  type Object = String
  type Schedule = String
  type Source = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type UUID = String

  final class AppIntegrationsOps(private val service: AppIntegrations) extends AnyVal {

    @inline def createDataIntegrationFuture(params: CreateDataIntegrationRequest): Future[CreateDataIntegrationResponse] = service.createDataIntegration(params).promise().toFuture
    @inline def createEventIntegrationFuture(params: CreateEventIntegrationRequest): Future[CreateEventIntegrationResponse] = service.createEventIntegration(params).promise().toFuture
    @inline def deleteDataIntegrationFuture(params: DeleteDataIntegrationRequest): Future[DeleteDataIntegrationResponse] = service.deleteDataIntegration(params).promise().toFuture
    @inline def deleteEventIntegrationFuture(params: DeleteEventIntegrationRequest): Future[DeleteEventIntegrationResponse] = service.deleteEventIntegration(params).promise().toFuture
    @inline def getDataIntegrationFuture(params: GetDataIntegrationRequest): Future[GetDataIntegrationResponse] = service.getDataIntegration(params).promise().toFuture
    @inline def getEventIntegrationFuture(params: GetEventIntegrationRequest): Future[GetEventIntegrationResponse] = service.getEventIntegration(params).promise().toFuture
    @inline def listDataIntegrationAssociationsFuture(params: ListDataIntegrationAssociationsRequest): Future[ListDataIntegrationAssociationsResponse] = service.listDataIntegrationAssociations(params).promise().toFuture
    @inline def listDataIntegrationsFuture(params: ListDataIntegrationsRequest): Future[ListDataIntegrationsResponse] = service.listDataIntegrations(params).promise().toFuture
    @inline def listEventIntegrationAssociationsFuture(params: ListEventIntegrationAssociationsRequest): Future[ListEventIntegrationAssociationsResponse] = service.listEventIntegrationAssociations(params).promise().toFuture
    @inline def listEventIntegrationsFuture(params: ListEventIntegrationsRequest): Future[ListEventIntegrationsResponse] = service.listEventIntegrations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDataIntegrationFuture(params: UpdateDataIntegrationRequest): Future[UpdateDataIntegrationResponse] = service.updateDataIntegration(params).promise().toFuture
    @inline def updateEventIntegrationFuture(params: UpdateEventIntegrationRequest): Future[UpdateEventIntegrationResponse] = service.updateEventIntegration(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/appintegrations", JSImport.Namespace, "AWS.AppIntegrations")
  class AppIntegrations() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDataIntegration(params: CreateDataIntegrationRequest): Request[CreateDataIntegrationResponse] = js.native
    def createEventIntegration(params: CreateEventIntegrationRequest): Request[CreateEventIntegrationResponse] = js.native
    def deleteDataIntegration(params: DeleteDataIntegrationRequest): Request[DeleteDataIntegrationResponse] = js.native
    def deleteEventIntegration(params: DeleteEventIntegrationRequest): Request[DeleteEventIntegrationResponse] = js.native
    def getDataIntegration(params: GetDataIntegrationRequest): Request[GetDataIntegrationResponse] = js.native
    def getEventIntegration(params: GetEventIntegrationRequest): Request[GetEventIntegrationResponse] = js.native
    def listDataIntegrationAssociations(params: ListDataIntegrationAssociationsRequest): Request[ListDataIntegrationAssociationsResponse] = js.native
    def listDataIntegrations(params: ListDataIntegrationsRequest): Request[ListDataIntegrationsResponse] = js.native
    def listEventIntegrationAssociations(params: ListEventIntegrationAssociationsRequest): Request[ListEventIntegrationAssociationsResponse] = js.native
    def listEventIntegrations(params: ListEventIntegrationsRequest): Request[ListEventIntegrationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDataIntegration(params: UpdateDataIntegrationRequest): Request[UpdateDataIntegrationResponse] = js.native
    def updateEventIntegration(params: UpdateEventIntegrationRequest): Request[UpdateEventIntegrationResponse] = js.native
  }
  object AppIntegrations {
    @inline implicit def toOps(service: AppIntegrations): AppIntegrationsOps = {
      new AppIntegrationsOps(service)
    }
  }

  @js.native
  trait CreateDataIntegrationRequest extends js.Object {
    var Name: Name
    var ClientToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[Description]
    var KmsKey: js.UndefOr[NonBlankString]
    var ScheduleConfig: js.UndefOr[ScheduleConfiguration]
    var SourceURI: js.UndefOr[NonBlankString]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDataIntegrationRequest {
    @inline
    def apply(
        Name: Name,
        ClientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        KmsKey: js.UndefOr[NonBlankString] = js.undefined,
        ScheduleConfig: js.UndefOr[ScheduleConfiguration] = js.undefined,
        SourceURI: js.UndefOr[NonBlankString] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDataIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KmsKey.foreach(__v => __obj.updateDynamic("KmsKey")(__v.asInstanceOf[js.Any]))
      ScheduleConfig.foreach(__v => __obj.updateDynamic("ScheduleConfig")(__v.asInstanceOf[js.Any]))
      SourceURI.foreach(__v => __obj.updateDynamic("SourceURI")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataIntegrationRequest]
    }
  }

  @js.native
  trait CreateDataIntegrationResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var ClientToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[UUID]
    var KmsKey: js.UndefOr[NonBlankString]
    var Name: js.UndefOr[Name]
    var ScheduleConfiguration: js.UndefOr[ScheduleConfiguration]
    var SourceURI: js.UndefOr[NonBlankString]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDataIntegrationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        ClientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[UUID] = js.undefined,
        KmsKey: js.UndefOr[NonBlankString] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        ScheduleConfiguration: js.UndefOr[ScheduleConfiguration] = js.undefined,
        SourceURI: js.UndefOr[NonBlankString] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDataIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      KmsKey.foreach(__v => __obj.updateDynamic("KmsKey")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ScheduleConfiguration.foreach(__v => __obj.updateDynamic("ScheduleConfiguration")(__v.asInstanceOf[js.Any]))
      SourceURI.foreach(__v => __obj.updateDynamic("SourceURI")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataIntegrationResponse]
    }
  }

  @js.native
  trait CreateEventIntegrationRequest extends js.Object {
    var EventBridgeBus: EventBridgeBus
    var EventFilter: EventFilter
    var Name: Name
    var ClientToken: js.UndefOr[IdempotencyToken]
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateEventIntegrationRequest {
    @inline
    def apply(
        EventBridgeBus: EventBridgeBus,
        EventFilter: EventFilter,
        Name: Name,
        ClientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateEventIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "EventBridgeBus" -> EventBridgeBus.asInstanceOf[js.Any],
        "EventFilter" -> EventFilter.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventIntegrationRequest]
    }
  }

  @js.native
  trait CreateEventIntegrationResponse extends js.Object {
    var EventIntegrationArn: js.UndefOr[Arn]
  }

  object CreateEventIntegrationResponse {
    @inline
    def apply(
        EventIntegrationArn: js.UndefOr[Arn] = js.undefined
    ): CreateEventIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      EventIntegrationArn.foreach(__v => __obj.updateDynamic("EventIntegrationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventIntegrationResponse]
    }
  }

  /** Summary information about the DataIntegration association.
    */
  @js.native
  trait DataIntegrationAssociationSummary extends js.Object {
    var ClientId: js.UndefOr[ClientId]
    var DataIntegrationArn: js.UndefOr[Arn]
    var DataIntegrationAssociationArn: js.UndefOr[Arn]
  }

  object DataIntegrationAssociationSummary {
    @inline
    def apply(
        ClientId: js.UndefOr[ClientId] = js.undefined,
        DataIntegrationArn: js.UndefOr[Arn] = js.undefined,
        DataIntegrationAssociationArn: js.UndefOr[Arn] = js.undefined
    ): DataIntegrationAssociationSummary = {
      val __obj = js.Dynamic.literal()
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      DataIntegrationArn.foreach(__v => __obj.updateDynamic("DataIntegrationArn")(__v.asInstanceOf[js.Any]))
      DataIntegrationAssociationArn.foreach(__v => __obj.updateDynamic("DataIntegrationAssociationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataIntegrationAssociationSummary]
    }
  }

  /** Summary information about the DataIntegration.
    */
  @js.native
  trait DataIntegrationSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Name: js.UndefOr[Name]
    var SourceURI: js.UndefOr[NonBlankString]
  }

  object DataIntegrationSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        SourceURI: js.UndefOr[NonBlankString] = js.undefined
    ): DataIntegrationSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SourceURI.foreach(__v => __obj.updateDynamic("SourceURI")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataIntegrationSummary]
    }
  }

  @js.native
  trait DeleteDataIntegrationRequest extends js.Object {
    var DataIntegrationIdentifier: Identifier
  }

  object DeleteDataIntegrationRequest {
    @inline
    def apply(
        DataIntegrationIdentifier: Identifier
    ): DeleteDataIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "DataIntegrationIdentifier" -> DataIntegrationIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDataIntegrationRequest]
    }
  }

  @js.native
  trait DeleteDataIntegrationResponse extends js.Object

  object DeleteDataIntegrationResponse {
    @inline
    def apply(): DeleteDataIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDataIntegrationResponse]
    }
  }

  @js.native
  trait DeleteEventIntegrationRequest extends js.Object {
    var Name: Name
  }

  object DeleteEventIntegrationRequest {
    @inline
    def apply(
        Name: Name
    ): DeleteEventIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventIntegrationRequest]
    }
  }

  @js.native
  trait DeleteEventIntegrationResponse extends js.Object

  object DeleteEventIntegrationResponse {
    @inline
    def apply(): DeleteEventIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEventIntegrationResponse]
    }
  }

  /** The event filter.
    */
  @js.native
  trait EventFilter extends js.Object {
    var Source: Source
  }

  object EventFilter {
    @inline
    def apply(
        Source: Source
    ): EventFilter = {
      val __obj = js.Dynamic.literal(
        "Source" -> Source.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EventFilter]
    }
  }

  /** The event integration.
    */
  @js.native
  trait EventIntegration extends js.Object {
    var Description: js.UndefOr[Description]
    var EventBridgeBus: js.UndefOr[EventBridgeBus]
    var EventFilter: js.UndefOr[EventFilter]
    var EventIntegrationArn: js.UndefOr[Arn]
    var Name: js.UndefOr[Name]
    var Tags: js.UndefOr[TagMap]
  }

  object EventIntegration {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        EventBridgeBus: js.UndefOr[EventBridgeBus] = js.undefined,
        EventFilter: js.UndefOr[EventFilter] = js.undefined,
        EventIntegrationArn: js.UndefOr[Arn] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): EventIntegration = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventBridgeBus.foreach(__v => __obj.updateDynamic("EventBridgeBus")(__v.asInstanceOf[js.Any]))
      EventFilter.foreach(__v => __obj.updateDynamic("EventFilter")(__v.asInstanceOf[js.Any]))
      EventIntegrationArn.foreach(__v => __obj.updateDynamic("EventIntegrationArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventIntegration]
    }
  }

  /** The event integration association.
    */
  @js.native
  trait EventIntegrationAssociation extends js.Object {
    var ClientAssociationMetadata: js.UndefOr[ClientAssociationMetadata]
    var ClientId: js.UndefOr[ClientId]
    var EventBridgeRuleName: js.UndefOr[EventBridgeRuleName]
    var EventIntegrationAssociationArn: js.UndefOr[Arn]
    var EventIntegrationAssociationId: js.UndefOr[UUID]
    var EventIntegrationName: js.UndefOr[Name]
  }

  object EventIntegrationAssociation {
    @inline
    def apply(
        ClientAssociationMetadata: js.UndefOr[ClientAssociationMetadata] = js.undefined,
        ClientId: js.UndefOr[ClientId] = js.undefined,
        EventBridgeRuleName: js.UndefOr[EventBridgeRuleName] = js.undefined,
        EventIntegrationAssociationArn: js.UndefOr[Arn] = js.undefined,
        EventIntegrationAssociationId: js.UndefOr[UUID] = js.undefined,
        EventIntegrationName: js.UndefOr[Name] = js.undefined
    ): EventIntegrationAssociation = {
      val __obj = js.Dynamic.literal()
      ClientAssociationMetadata.foreach(__v => __obj.updateDynamic("ClientAssociationMetadata")(__v.asInstanceOf[js.Any]))
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      EventBridgeRuleName.foreach(__v => __obj.updateDynamic("EventBridgeRuleName")(__v.asInstanceOf[js.Any]))
      EventIntegrationAssociationArn.foreach(__v => __obj.updateDynamic("EventIntegrationAssociationArn")(__v.asInstanceOf[js.Any]))
      EventIntegrationAssociationId.foreach(__v => __obj.updateDynamic("EventIntegrationAssociationId")(__v.asInstanceOf[js.Any]))
      EventIntegrationName.foreach(__v => __obj.updateDynamic("EventIntegrationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventIntegrationAssociation]
    }
  }

  @js.native
  trait GetDataIntegrationRequest extends js.Object {
    var Identifier: Identifier
  }

  object GetDataIntegrationRequest {
    @inline
    def apply(
        Identifier: Identifier
    ): GetDataIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDataIntegrationRequest]
    }
  }

  @js.native
  trait GetDataIntegrationResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[UUID]
    var KmsKey: js.UndefOr[NonBlankString]
    var Name: js.UndefOr[Name]
    var ScheduleConfiguration: js.UndefOr[ScheduleConfiguration]
    var SourceURI: js.UndefOr[NonBlankString]
    var Tags: js.UndefOr[TagMap]
  }

  object GetDataIntegrationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[UUID] = js.undefined,
        KmsKey: js.UndefOr[NonBlankString] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        ScheduleConfiguration: js.UndefOr[ScheduleConfiguration] = js.undefined,
        SourceURI: js.UndefOr[NonBlankString] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetDataIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      KmsKey.foreach(__v => __obj.updateDynamic("KmsKey")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ScheduleConfiguration.foreach(__v => __obj.updateDynamic("ScheduleConfiguration")(__v.asInstanceOf[js.Any]))
      SourceURI.foreach(__v => __obj.updateDynamic("SourceURI")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataIntegrationResponse]
    }
  }

  @js.native
  trait GetEventIntegrationRequest extends js.Object {
    var Name: Name
  }

  object GetEventIntegrationRequest {
    @inline
    def apply(
        Name: Name
    ): GetEventIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEventIntegrationRequest]
    }
  }

  @js.native
  trait GetEventIntegrationResponse extends js.Object {
    var Description: js.UndefOr[Description]
    var EventBridgeBus: js.UndefOr[EventBridgeBus]
    var EventFilter: js.UndefOr[EventFilter]
    var EventIntegrationArn: js.UndefOr[Arn]
    var Name: js.UndefOr[Name]
    var Tags: js.UndefOr[TagMap]
  }

  object GetEventIntegrationResponse {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        EventBridgeBus: js.UndefOr[EventBridgeBus] = js.undefined,
        EventFilter: js.UndefOr[EventFilter] = js.undefined,
        EventIntegrationArn: js.UndefOr[Arn] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetEventIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventBridgeBus.foreach(__v => __obj.updateDynamic("EventBridgeBus")(__v.asInstanceOf[js.Any]))
      EventFilter.foreach(__v => __obj.updateDynamic("EventFilter")(__v.asInstanceOf[js.Any]))
      EventIntegrationArn.foreach(__v => __obj.updateDynamic("EventIntegrationArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventIntegrationResponse]
    }
  }

  @js.native
  trait ListDataIntegrationAssociationsRequest extends js.Object {
    var DataIntegrationIdentifier: Identifier
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDataIntegrationAssociationsRequest {
    @inline
    def apply(
        DataIntegrationIdentifier: Identifier,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataIntegrationAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "DataIntegrationIdentifier" -> DataIntegrationIdentifier.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataIntegrationAssociationsRequest]
    }
  }

  @js.native
  trait ListDataIntegrationAssociationsResponse extends js.Object {
    var DataIntegrationAssociations: js.UndefOr[DataIntegrationAssociationsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDataIntegrationAssociationsResponse {
    @inline
    def apply(
        DataIntegrationAssociations: js.UndefOr[DataIntegrationAssociationsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataIntegrationAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      DataIntegrationAssociations.foreach(__v => __obj.updateDynamic("DataIntegrationAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataIntegrationAssociationsResponse]
    }
  }

  @js.native
  trait ListDataIntegrationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDataIntegrationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataIntegrationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataIntegrationsRequest]
    }
  }

  @js.native
  trait ListDataIntegrationsResponse extends js.Object {
    var DataIntegrations: js.UndefOr[DataIntegrationsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDataIntegrationsResponse {
    @inline
    def apply(
        DataIntegrations: js.UndefOr[DataIntegrationsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDataIntegrationsResponse = {
      val __obj = js.Dynamic.literal()
      DataIntegrations.foreach(__v => __obj.updateDynamic("DataIntegrations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataIntegrationsResponse]
    }
  }

  @js.native
  trait ListEventIntegrationAssociationsRequest extends js.Object {
    var EventIntegrationName: Name
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventIntegrationAssociationsRequest {
    @inline
    def apply(
        EventIntegrationName: Name,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventIntegrationAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "EventIntegrationName" -> EventIntegrationName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventIntegrationAssociationsRequest]
    }
  }

  @js.native
  trait ListEventIntegrationAssociationsResponse extends js.Object {
    var EventIntegrationAssociations: js.UndefOr[EventIntegrationAssociationsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventIntegrationAssociationsResponse {
    @inline
    def apply(
        EventIntegrationAssociations: js.UndefOr[EventIntegrationAssociationsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventIntegrationAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      EventIntegrationAssociations.foreach(__v => __obj.updateDynamic("EventIntegrationAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventIntegrationAssociationsResponse]
    }
  }

  @js.native
  trait ListEventIntegrationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventIntegrationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventIntegrationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventIntegrationsRequest]
    }
  }

  @js.native
  trait ListEventIntegrationsResponse extends js.Object {
    var EventIntegrations: js.UndefOr[EventIntegrationsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventIntegrationsResponse {
    @inline
    def apply(
        EventIntegrations: js.UndefOr[EventIntegrationsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventIntegrationsResponse = {
      val __obj = js.Dynamic.literal()
      EventIntegrations.foreach(__v => __obj.updateDynamic("EventIntegrations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventIntegrationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The name of the data and how often it should be pulled from the source.
    */
  @js.native
  trait ScheduleConfiguration extends js.Object {
    var FirstExecutionFrom: js.UndefOr[NonBlankString]
    var Object: js.UndefOr[Object]
    var ScheduleExpression: js.UndefOr[Schedule]
  }

  object ScheduleConfiguration {
    @inline
    def apply(
        FirstExecutionFrom: js.UndefOr[NonBlankString] = js.undefined,
        Object: js.UndefOr[Object] = js.undefined,
        ScheduleExpression: js.UndefOr[Schedule] = js.undefined
    ): ScheduleConfiguration = {
      val __obj = js.Dynamic.literal()
      FirstExecutionFrom.foreach(__v => __obj.updateDynamic("FirstExecutionFrom")(__v.asInstanceOf[js.Any]))
      Object.foreach(__v => __obj.updateDynamic("Object")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleConfiguration]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDataIntegrationRequest extends js.Object {
    var Identifier: Identifier
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[Name]
  }

  object UpdateDataIntegrationRequest {
    @inline
    def apply(
        Identifier: Identifier,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): UpdateDataIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataIntegrationRequest]
    }
  }

  @js.native
  trait UpdateDataIntegrationResponse extends js.Object

  object UpdateDataIntegrationResponse {
    @inline
    def apply(): UpdateDataIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDataIntegrationResponse]
    }
  }

  @js.native
  trait UpdateEventIntegrationRequest extends js.Object {
    var Name: Name
    var Description: js.UndefOr[Description]
  }

  object UpdateEventIntegrationRequest {
    @inline
    def apply(
        Name: Name,
        Description: js.UndefOr[Description] = js.undefined
    ): UpdateEventIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventIntegrationRequest]
    }
  }

  @js.native
  trait UpdateEventIntegrationResponse extends js.Object

  object UpdateEventIntegrationResponse {
    @inline
    def apply(): UpdateEventIntegrationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateEventIntegrationResponse]
    }
  }
}
