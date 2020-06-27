package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object marketplacecatalog {
  type ARN                  = String
  type Catalog              = String
  type ChangeSetDescription = js.Array[ChangeSummary]
  type ChangeSetName        = String
  type ChangeSetSummaryList = js.Array[ChangeSetSummaryListItem]
  type ChangeType           = String
  type ClientRequestToken   = String
  type DateTimeISO8601      = String
  type EntitySummaryList    = js.Array[EntitySummary]
  type EntityType           = String
  type ErrorDetailList      = js.Array[ErrorDetail]
  type FilterList           = js.Array[Filter]
  type FilterName           = String
  type Identifier           = String
  type Json                 = String
  type MaxResultInteger     = Int
  type NextToken            = String
  type RequestedChangeList  = js.Array[Change]
  type ResourceId           = String
  type ResourceIdList       = js.Array[ResourceId]
  type SortBy               = String
  type StringValue          = String
  type ValueList            = js.Array[StringValue]

  implicit final class MarketplaceCatalogOps(private val service: MarketplaceCatalog) extends AnyVal {

    @inline def cancelChangeSetFuture(params: CancelChangeSetRequest): Future[CancelChangeSetResponse] =
      service.cancelChangeSet(params).promise().toFuture
    @inline def describeChangeSetFuture(params: DescribeChangeSetRequest): Future[DescribeChangeSetResponse] =
      service.describeChangeSet(params).promise().toFuture
    @inline def describeEntityFuture(params: DescribeEntityRequest): Future[DescribeEntityResponse] =
      service.describeEntity(params).promise().toFuture
    @inline def listChangeSetsFuture(params: ListChangeSetsRequest): Future[ListChangeSetsResponse] =
      service.listChangeSets(params).promise().toFuture
    @inline def listEntitiesFuture(params: ListEntitiesRequest): Future[ListEntitiesResponse] =
      service.listEntities(params).promise().toFuture
    @inline def startChangeSetFuture(params: StartChangeSetRequest): Future[StartChangeSetResponse] =
      service.startChangeSet(params).promise().toFuture
  }
}

package marketplacecatalog {
  @js.native
  @JSImport("aws-sdk", "MarketplaceCatalog")
  class MarketplaceCatalog() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelChangeSet(params: CancelChangeSetRequest): Request[CancelChangeSetResponse]       = js.native
    def describeChangeSet(params: DescribeChangeSetRequest): Request[DescribeChangeSetResponse] = js.native
    def describeEntity(params: DescribeEntityRequest): Request[DescribeEntityResponse]          = js.native
    def listChangeSets(params: ListChangeSetsRequest): Request[ListChangeSetsResponse]          = js.native
    def listEntities(params: ListEntitiesRequest): Request[ListEntitiesResponse]                = js.native
    def startChangeSet(params: StartChangeSetRequest): Request[StartChangeSetResponse]          = js.native
  }

  @js.native
  @Factory
  trait CancelChangeSetRequest extends js.Object {
    var Catalog: Catalog
    var ChangeSetId: ResourceId
  }

  @js.native
  @Factory
  trait CancelChangeSetResponse extends js.Object {
    var ChangeSetArn: js.UndefOr[ARN]
    var ChangeSetId: js.UndefOr[ResourceId]
  }

  /**
    * An object that contains the <code>ChangeType</code>, <code>Details</code>, and <code>Entity</code>.
    */
  @js.native
  @Factory
  trait Change extends js.Object {
    var ChangeType: ChangeType
    var Details: Json
    var Entity: Entity
  }

  /**
    * A summary of a change set returned in a list of change sets when the <code>ListChangeSets</code> action is called.
    */
  @js.native
  @Factory
  trait ChangeSetSummaryListItem extends js.Object {
    var ChangeSetArn: js.UndefOr[ARN]
    var ChangeSetId: js.UndefOr[ResourceId]
    var ChangeSetName: js.UndefOr[ChangeSetName]
    var EndTime: js.UndefOr[DateTimeISO8601]
    var EntityIdList: js.UndefOr[ResourceIdList]
    var StartTime: js.UndefOr[DateTimeISO8601]
    var Status: js.UndefOr[ChangeStatus]
  }

  @js.native
  sealed trait ChangeStatus extends js.Any
  object ChangeStatus extends js.Object {
    val PREPARING = "PREPARING".asInstanceOf[ChangeStatus]
    val APPLYING  = "APPLYING".asInstanceOf[ChangeStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[ChangeStatus]
    val CANCELLED = "CANCELLED".asInstanceOf[ChangeStatus]
    val FAILED    = "FAILED".asInstanceOf[ChangeStatus]

    val values = js.Object.freeze(js.Array(PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED))
  }

  /**
    * This object is a container for common summary information about the change. The summary doesn't contain the whole change structure.
    */
  @js.native
  @Factory
  trait ChangeSummary extends js.Object {
    var ChangeType: js.UndefOr[ChangeType]
    var Entity: js.UndefOr[Entity]
    var ErrorDetailList: js.UndefOr[ErrorDetailList]
  }

  @js.native
  @Factory
  trait DescribeChangeSetRequest extends js.Object {
    var Catalog: Catalog
    var ChangeSetId: ResourceId
  }

  @js.native
  @Factory
  trait DescribeChangeSetResponse extends js.Object {
    var ChangeSet: js.UndefOr[ChangeSetDescription]
    var ChangeSetArn: js.UndefOr[ARN]
    var ChangeSetId: js.UndefOr[ResourceId]
    var ChangeSetName: js.UndefOr[ChangeSetName]
    var EndTime: js.UndefOr[DateTimeISO8601]
    var FailureDescription: js.UndefOr[StringValue]
    var StartTime: js.UndefOr[DateTimeISO8601]
    var Status: js.UndefOr[ChangeStatus]
  }

  @js.native
  @Factory
  trait DescribeEntityRequest extends js.Object {
    var Catalog: Catalog
    var EntityId: ResourceId
  }

  @js.native
  @Factory
  trait DescribeEntityResponse extends js.Object {
    var Details: js.UndefOr[Json]
    var EntityArn: js.UndefOr[ARN]
    var EntityIdentifier: js.UndefOr[Identifier]
    var EntityType: js.UndefOr[EntityType]
    var LastModifiedDate: js.UndefOr[StringValue]
  }

  /**
    * A product entity contains data that describes your product, its supported features, and how it can be used or launched by your customer.
    */
  @js.native
  @Factory
  trait Entity extends js.Object {
    var Type: EntityType
    var Identifier: js.UndefOr[Identifier]
  }

  /**
    * This object is a container for common summary information about the entity. The summary doesn't contain the whole entity structure, but it does contain information common across all entities.
    */
  @js.native
  @Factory
  trait EntitySummary extends js.Object {
    var EntityArn: js.UndefOr[ARN]
    var EntityId: js.UndefOr[ResourceId]
    var EntityType: js.UndefOr[EntityType]
    var LastModifiedDate: js.UndefOr[StringValue]
    var Name: js.UndefOr[StringValue]
    var Visibility: js.UndefOr[StringValue]
  }

  /**
    * Details about the error.
    */
  @js.native
  @Factory
  trait ErrorDetail extends js.Object {
    var ErrorCode: js.UndefOr[StringValue]
    var ErrorMessage: js.UndefOr[StringValue]
  }

  /**
    * A filter object, used to optionally filter results from calls to the <code>ListEntities</code> and <code>ListChangeSets</code> actions.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var ValueList: js.UndefOr[ValueList]
  }

  @js.native
  @Factory
  trait ListChangeSetsRequest extends js.Object {
    var Catalog: Catalog
    var FilterList: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResultInteger]
    var NextToken: js.UndefOr[NextToken]
    var Sort: js.UndefOr[Sort]
  }

  @js.native
  @Factory
  trait ListChangeSetsResponse extends js.Object {
    var ChangeSetSummaryList: js.UndefOr[ChangeSetSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEntitiesRequest extends js.Object {
    var Catalog: Catalog
    var EntityType: EntityType
    var FilterList: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResultInteger]
    var NextToken: js.UndefOr[NextToken]
    var Sort: js.UndefOr[Sort]
  }

  @js.native
  @Factory
  trait ListEntitiesResponse extends js.Object {
    var EntitySummaryList: js.UndefOr[EntitySummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * An object that contains two attributes, <code>sortBy</code> and <code>sortOrder</code>.
    */
  @js.native
  @Factory
  trait Sort extends js.Object {
    var SortBy: js.UndefOr[SortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder extends js.Object {
    val ASCENDING  = "ASCENDING".asInstanceOf[SortOrder]
    val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

    val values = js.Object.freeze(js.Array(ASCENDING, DESCENDING))
  }

  @js.native
  @Factory
  trait StartChangeSetRequest extends js.Object {
    var Catalog: Catalog
    var ChangeSet: RequestedChangeList
    var ChangeSetName: js.UndefOr[ChangeSetName]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  @js.native
  @Factory
  trait StartChangeSetResponse extends js.Object {
    var ChangeSetArn: js.UndefOr[ARN]
    var ChangeSetId: js.UndefOr[ResourceId]
  }
}
