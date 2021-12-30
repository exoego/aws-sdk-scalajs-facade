package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object marketplacecatalog {
  type ARN = String
  type Catalog = String
  type ChangeSetDescription = js.Array[ChangeSummary]
  type ChangeSetName = String
  type ChangeSetSummaryList = js.Array[ChangeSetSummaryListItem]
  type ChangeType = String
  type ClientRequestToken = String
  type DateTimeISO8601 = String
  type EntitySummaryList = js.Array[EntitySummary]
  type EntityType = String
  type ErrorDetailList = js.Array[ErrorDetail]
  type FilterList = js.Array[Filter]
  type FilterName = String
  type Identifier = String
  type Json = String
  type MaxResultInteger = Int
  type NextToken = String
  type RequestedChangeList = js.Array[Change]
  type ResourceId = String
  type ResourceIdList = js.Array[ResourceId]
  type SortBy = String
  type StringValue = String
  type ValueList = js.Array[StringValue]

  final class MarketplaceCatalogOps(private val service: MarketplaceCatalog) extends AnyVal {

    @inline def cancelChangeSetFuture(params: CancelChangeSetRequest): Future[CancelChangeSetResponse] = service.cancelChangeSet(params).promise().toFuture
    @inline def describeChangeSetFuture(params: DescribeChangeSetRequest): Future[DescribeChangeSetResponse] = service.describeChangeSet(params).promise().toFuture
    @inline def describeEntityFuture(params: DescribeEntityRequest): Future[DescribeEntityResponse] = service.describeEntity(params).promise().toFuture
    @inline def listChangeSetsFuture(params: ListChangeSetsRequest): Future[ListChangeSetsResponse] = service.listChangeSets(params).promise().toFuture
    @inline def listEntitiesFuture(params: ListEntitiesRequest): Future[ListEntitiesResponse] = service.listEntities(params).promise().toFuture
    @inline def startChangeSetFuture(params: StartChangeSetRequest): Future[StartChangeSetResponse] = service.startChangeSet(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/marketplacecatalog", JSImport.Namespace, "AWS.MarketplaceCatalog")
  class MarketplaceCatalog() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelChangeSet(params: CancelChangeSetRequest): Request[CancelChangeSetResponse] = js.native
    def describeChangeSet(params: DescribeChangeSetRequest): Request[DescribeChangeSetResponse] = js.native
    def describeEntity(params: DescribeEntityRequest): Request[DescribeEntityResponse] = js.native
    def listChangeSets(params: ListChangeSetsRequest): Request[ListChangeSetsResponse] = js.native
    def listEntities(params: ListEntitiesRequest): Request[ListEntitiesResponse] = js.native
    def startChangeSet(params: StartChangeSetRequest): Request[StartChangeSetResponse] = js.native
  }
  object MarketplaceCatalog {
    @inline implicit def toOps(service: MarketplaceCatalog): MarketplaceCatalogOps = {
      new MarketplaceCatalogOps(service)
    }
  }

  @js.native
  trait CancelChangeSetRequest extends js.Object {
    var Catalog: Catalog
    var ChangeSetId: ResourceId
  }

  object CancelChangeSetRequest {
    @inline
    def apply(
        Catalog: Catalog,
        ChangeSetId: ResourceId
    ): CancelChangeSetRequest = {
      val __obj = js.Dynamic.literal(
        "Catalog" -> Catalog.asInstanceOf[js.Any],
        "ChangeSetId" -> ChangeSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelChangeSetRequest]
    }
  }

  @js.native
  trait CancelChangeSetResponse extends js.Object {
    var ChangeSetArn: js.UndefOr[ARN]
    var ChangeSetId: js.UndefOr[ResourceId]
  }

  object CancelChangeSetResponse {
    @inline
    def apply(
        ChangeSetArn: js.UndefOr[ARN] = js.undefined,
        ChangeSetId: js.UndefOr[ResourceId] = js.undefined
    ): CancelChangeSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeSetArn.foreach(__v => __obj.updateDynamic("ChangeSetArn")(__v.asInstanceOf[js.Any]))
      ChangeSetId.foreach(__v => __obj.updateDynamic("ChangeSetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelChangeSetResponse]
    }
  }

  /** An object that contains the <code>ChangeType</code>, <code>Details</code>, and <code>Entity</code>.
    */
  @js.native
  trait Change extends js.Object {
    var ChangeType: ChangeType
    var Details: Json
    var Entity: Entity
  }

  object Change {
    @inline
    def apply(
        ChangeType: ChangeType,
        Details: Json,
        Entity: Entity
    ): Change = {
      val __obj = js.Dynamic.literal(
        "ChangeType" -> ChangeType.asInstanceOf[js.Any],
        "Details" -> Details.asInstanceOf[js.Any],
        "Entity" -> Entity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Change]
    }
  }

  /** A summary of a change set returned in a list of change sets when the <code>ListChangeSets</code> action is called.
    */
  @js.native
  trait ChangeSetSummaryListItem extends js.Object {
    var ChangeSetArn: js.UndefOr[ARN]
    var ChangeSetId: js.UndefOr[ResourceId]
    var ChangeSetName: js.UndefOr[ChangeSetName]
    var EndTime: js.UndefOr[DateTimeISO8601]
    var EntityIdList: js.UndefOr[ResourceIdList]
    var FailureCode: js.UndefOr[FailureCode]
    var StartTime: js.UndefOr[DateTimeISO8601]
    var Status: js.UndefOr[ChangeStatus]
  }

  object ChangeSetSummaryListItem {
    @inline
    def apply(
        ChangeSetArn: js.UndefOr[ARN] = js.undefined,
        ChangeSetId: js.UndefOr[ResourceId] = js.undefined,
        ChangeSetName: js.UndefOr[ChangeSetName] = js.undefined,
        EndTime: js.UndefOr[DateTimeISO8601] = js.undefined,
        EntityIdList: js.UndefOr[ResourceIdList] = js.undefined,
        FailureCode: js.UndefOr[FailureCode] = js.undefined,
        StartTime: js.UndefOr[DateTimeISO8601] = js.undefined,
        Status: js.UndefOr[ChangeStatus] = js.undefined
    ): ChangeSetSummaryListItem = {
      val __obj = js.Dynamic.literal()
      ChangeSetArn.foreach(__v => __obj.updateDynamic("ChangeSetArn")(__v.asInstanceOf[js.Any]))
      ChangeSetId.foreach(__v => __obj.updateDynamic("ChangeSetId")(__v.asInstanceOf[js.Any]))
      ChangeSetName.foreach(__v => __obj.updateDynamic("ChangeSetName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EntityIdList.foreach(__v => __obj.updateDynamic("EntityIdList")(__v.asInstanceOf[js.Any]))
      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeSetSummaryListItem]
    }
  }

  /** This object is a container for common summary information about the change. The summary doesn't contain the whole change structure.
    */
  @js.native
  trait ChangeSummary extends js.Object {
    var ChangeType: js.UndefOr[ChangeType]
    var Details: js.UndefOr[Json]
    var Entity: js.UndefOr[Entity]
    var ErrorDetailList: js.UndefOr[ErrorDetailList]
  }

  object ChangeSummary {
    @inline
    def apply(
        ChangeType: js.UndefOr[ChangeType] = js.undefined,
        Details: js.UndefOr[Json] = js.undefined,
        Entity: js.UndefOr[Entity] = js.undefined,
        ErrorDetailList: js.UndefOr[ErrorDetailList] = js.undefined
    ): ChangeSummary = {
      val __obj = js.Dynamic.literal()
      ChangeType.foreach(__v => __obj.updateDynamic("ChangeType")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      Entity.foreach(__v => __obj.updateDynamic("Entity")(__v.asInstanceOf[js.Any]))
      ErrorDetailList.foreach(__v => __obj.updateDynamic("ErrorDetailList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeSummary]
    }
  }

  @js.native
  trait DescribeChangeSetRequest extends js.Object {
    var Catalog: Catalog
    var ChangeSetId: ResourceId
  }

  object DescribeChangeSetRequest {
    @inline
    def apply(
        Catalog: Catalog,
        ChangeSetId: ResourceId
    ): DescribeChangeSetRequest = {
      val __obj = js.Dynamic.literal(
        "Catalog" -> Catalog.asInstanceOf[js.Any],
        "ChangeSetId" -> ChangeSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChangeSetRequest]
    }
  }

  @js.native
  trait DescribeChangeSetResponse extends js.Object {
    var ChangeSet: js.UndefOr[ChangeSetDescription]
    var ChangeSetArn: js.UndefOr[ARN]
    var ChangeSetId: js.UndefOr[ResourceId]
    var ChangeSetName: js.UndefOr[ChangeSetName]
    var EndTime: js.UndefOr[DateTimeISO8601]
    var FailureCode: js.UndefOr[FailureCode]
    var FailureDescription: js.UndefOr[StringValue]
    var StartTime: js.UndefOr[DateTimeISO8601]
    var Status: js.UndefOr[ChangeStatus]
  }

  object DescribeChangeSetResponse {
    @inline
    def apply(
        ChangeSet: js.UndefOr[ChangeSetDescription] = js.undefined,
        ChangeSetArn: js.UndefOr[ARN] = js.undefined,
        ChangeSetId: js.UndefOr[ResourceId] = js.undefined,
        ChangeSetName: js.UndefOr[ChangeSetName] = js.undefined,
        EndTime: js.UndefOr[DateTimeISO8601] = js.undefined,
        FailureCode: js.UndefOr[FailureCode] = js.undefined,
        FailureDescription: js.UndefOr[StringValue] = js.undefined,
        StartTime: js.UndefOr[DateTimeISO8601] = js.undefined,
        Status: js.UndefOr[ChangeStatus] = js.undefined
    ): DescribeChangeSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeSet.foreach(__v => __obj.updateDynamic("ChangeSet")(__v.asInstanceOf[js.Any]))
      ChangeSetArn.foreach(__v => __obj.updateDynamic("ChangeSetArn")(__v.asInstanceOf[js.Any]))
      ChangeSetId.foreach(__v => __obj.updateDynamic("ChangeSetId")(__v.asInstanceOf[js.Any]))
      ChangeSetName.foreach(__v => __obj.updateDynamic("ChangeSetName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      FailureDescription.foreach(__v => __obj.updateDynamic("FailureDescription")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChangeSetResponse]
    }
  }

  @js.native
  trait DescribeEntityRequest extends js.Object {
    var Catalog: Catalog
    var EntityId: ResourceId
  }

  object DescribeEntityRequest {
    @inline
    def apply(
        Catalog: Catalog,
        EntityId: ResourceId
    ): DescribeEntityRequest = {
      val __obj = js.Dynamic.literal(
        "Catalog" -> Catalog.asInstanceOf[js.Any],
        "EntityId" -> EntityId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEntityRequest]
    }
  }

  @js.native
  trait DescribeEntityResponse extends js.Object {
    var Details: js.UndefOr[Json]
    var EntityArn: js.UndefOr[ARN]
    var EntityIdentifier: js.UndefOr[Identifier]
    var EntityType: js.UndefOr[EntityType]
    var LastModifiedDate: js.UndefOr[StringValue]
  }

  object DescribeEntityResponse {
    @inline
    def apply(
        Details: js.UndefOr[Json] = js.undefined,
        EntityArn: js.UndefOr[ARN] = js.undefined,
        EntityIdentifier: js.UndefOr[Identifier] = js.undefined,
        EntityType: js.UndefOr[EntityType] = js.undefined,
        LastModifiedDate: js.UndefOr[StringValue] = js.undefined
    ): DescribeEntityResponse = {
      val __obj = js.Dynamic.literal()
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      EntityArn.foreach(__v => __obj.updateDynamic("EntityArn")(__v.asInstanceOf[js.Any]))
      EntityIdentifier.foreach(__v => __obj.updateDynamic("EntityIdentifier")(__v.asInstanceOf[js.Any]))
      EntityType.foreach(__v => __obj.updateDynamic("EntityType")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEntityResponse]
    }
  }

  /** A product entity contains data that describes your product, its supported features, and how it can be used or launched by your customer.
    */
  @js.native
  trait Entity extends js.Object {
    var Type: EntityType
    var Identifier: js.UndefOr[Identifier]
  }

  object Entity {
    @inline
    def apply(
        Type: EntityType,
        Identifier: js.UndefOr[Identifier] = js.undefined
    ): Entity = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Entity]
    }
  }

  /** This object is a container for common summary information about the entity. The summary doesn't contain the whole entity structure, but it does contain information common across all entities.
    */
  @js.native
  trait EntitySummary extends js.Object {
    var EntityArn: js.UndefOr[ARN]
    var EntityId: js.UndefOr[ResourceId]
    var EntityType: js.UndefOr[EntityType]
    var LastModifiedDate: js.UndefOr[StringValue]
    var Name: js.UndefOr[StringValue]
    var Visibility: js.UndefOr[StringValue]
  }

  object EntitySummary {
    @inline
    def apply(
        EntityArn: js.UndefOr[ARN] = js.undefined,
        EntityId: js.UndefOr[ResourceId] = js.undefined,
        EntityType: js.UndefOr[EntityType] = js.undefined,
        LastModifiedDate: js.UndefOr[StringValue] = js.undefined,
        Name: js.UndefOr[StringValue] = js.undefined,
        Visibility: js.UndefOr[StringValue] = js.undefined
    ): EntitySummary = {
      val __obj = js.Dynamic.literal()
      EntityArn.foreach(__v => __obj.updateDynamic("EntityArn")(__v.asInstanceOf[js.Any]))
      EntityId.foreach(__v => __obj.updateDynamic("EntityId")(__v.asInstanceOf[js.Any]))
      EntityType.foreach(__v => __obj.updateDynamic("EntityType")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntitySummary]
    }
  }

  /** Details about the error.
    */
  @js.native
  trait ErrorDetail extends js.Object {
    var ErrorCode: js.UndefOr[StringValue]
    var ErrorMessage: js.UndefOr[StringValue]
  }

  object ErrorDetail {
    @inline
    def apply(
        ErrorCode: js.UndefOr[StringValue] = js.undefined,
        ErrorMessage: js.UndefOr[StringValue] = js.undefined
    ): ErrorDetail = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetail]
    }
  }

  /** A filter object, used to optionally filter results from calls to the <code>ListEntities</code> and <code>ListChangeSets</code> actions.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var ValueList: js.UndefOr[ValueList]
  }

  object Filter {
    @inline
    def apply(
        Name: js.UndefOr[FilterName] = js.undefined,
        ValueList: js.UndefOr[ValueList] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ValueList.foreach(__v => __obj.updateDynamic("ValueList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait ListChangeSetsRequest extends js.Object {
    var Catalog: Catalog
    var FilterList: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResultInteger]
    var NextToken: js.UndefOr[NextToken]
    var Sort: js.UndefOr[Sort]
  }

  object ListChangeSetsRequest {
    @inline
    def apply(
        Catalog: Catalog,
        FilterList: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResultInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Sort: js.UndefOr[Sort] = js.undefined
    ): ListChangeSetsRequest = {
      val __obj = js.Dynamic.literal(
        "Catalog" -> Catalog.asInstanceOf[js.Any]
      )

      FilterList.foreach(__v => __obj.updateDynamic("FilterList")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sort.foreach(__v => __obj.updateDynamic("Sort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChangeSetsRequest]
    }
  }

  @js.native
  trait ListChangeSetsResponse extends js.Object {
    var ChangeSetSummaryList: js.UndefOr[ChangeSetSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChangeSetsResponse {
    @inline
    def apply(
        ChangeSetSummaryList: js.UndefOr[ChangeSetSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChangeSetsResponse = {
      val __obj = js.Dynamic.literal()
      ChangeSetSummaryList.foreach(__v => __obj.updateDynamic("ChangeSetSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChangeSetsResponse]
    }
  }

  @js.native
  trait ListEntitiesRequest extends js.Object {
    var Catalog: Catalog
    var EntityType: EntityType
    var FilterList: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResultInteger]
    var NextToken: js.UndefOr[NextToken]
    var Sort: js.UndefOr[Sort]
  }

  object ListEntitiesRequest {
    @inline
    def apply(
        Catalog: Catalog,
        EntityType: EntityType,
        FilterList: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResultInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Sort: js.UndefOr[Sort] = js.undefined
    ): ListEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "Catalog" -> Catalog.asInstanceOf[js.Any],
        "EntityType" -> EntityType.asInstanceOf[js.Any]
      )

      FilterList.foreach(__v => __obj.updateDynamic("FilterList")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sort.foreach(__v => __obj.updateDynamic("Sort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesRequest]
    }
  }

  @js.native
  trait ListEntitiesResponse extends js.Object {
    var EntitySummaryList: js.UndefOr[EntitySummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEntitiesResponse {
    @inline
    def apply(
        EntitySummaryList: js.UndefOr[EntitySummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      EntitySummaryList.foreach(__v => __obj.updateDynamic("EntitySummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesResponse]
    }
  }

  /** An object that contains two attributes, <code>SortBy</code> and <code>SortOrder</code>.
    */
  @js.native
  trait Sort extends js.Object {
    var SortBy: js.UndefOr[SortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object Sort {
    @inline
    def apply(
        SortBy: js.UndefOr[SortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): Sort = {
      val __obj = js.Dynamic.literal()
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Sort]
    }
  }

  @js.native
  trait StartChangeSetRequest extends js.Object {
    var Catalog: Catalog
    var ChangeSet: RequestedChangeList
    var ChangeSetName: js.UndefOr[ChangeSetName]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object StartChangeSetRequest {
    @inline
    def apply(
        Catalog: Catalog,
        ChangeSet: RequestedChangeList,
        ChangeSetName: js.UndefOr[ChangeSetName] = js.undefined,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): StartChangeSetRequest = {
      val __obj = js.Dynamic.literal(
        "Catalog" -> Catalog.asInstanceOf[js.Any],
        "ChangeSet" -> ChangeSet.asInstanceOf[js.Any]
      )

      ChangeSetName.foreach(__v => __obj.updateDynamic("ChangeSetName")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChangeSetRequest]
    }
  }

  @js.native
  trait StartChangeSetResponse extends js.Object {
    var ChangeSetArn: js.UndefOr[ARN]
    var ChangeSetId: js.UndefOr[ResourceId]
  }

  object StartChangeSetResponse {
    @inline
    def apply(
        ChangeSetArn: js.UndefOr[ARN] = js.undefined,
        ChangeSetId: js.UndefOr[ResourceId] = js.undefined
    ): StartChangeSetResponse = {
      val __obj = js.Dynamic.literal()
      ChangeSetArn.foreach(__v => __obj.updateDynamic("ChangeSetArn")(__v.asInstanceOf[js.Any]))
      ChangeSetId.foreach(__v => __obj.updateDynamic("ChangeSetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChangeSetResponse]
    }
  }
}
