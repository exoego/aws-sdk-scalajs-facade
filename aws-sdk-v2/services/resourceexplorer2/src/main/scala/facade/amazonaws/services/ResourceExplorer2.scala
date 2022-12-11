package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object resourceexplorer2 {
  type AssociateDefaultViewInputViewArnString = String
  type BatchGetViewErrors = js.Array[BatchGetViewError]
  type BatchGetViewInputViewArnsList = js.Array[String]
  type CreateViewInputClientTokenString = String
  type DeleteViewInputViewArnString = String
  type GetViewInputViewArnString = String
  type IncludedPropertyList = js.Array[IncludedProperty]
  type IncludedPropertyNameString = String
  type IndexList = js.Array[Index]
  type ListIndexesInputMaxResultsInteger = Int
  type ListIndexesInputNextTokenString = String
  type ListIndexesInputRegionsList = js.Array[String]
  type ListSupportedResourceTypesInputMaxResultsInteger = Int
  type ListViewsInputMaxResultsInteger = Int
  type QueryString = String
  type RegionList = js.Array[String]
  type ResourceList = js.Array[Resource]
  type ResourcePropertyList = js.Array[ResourceProperty]
  type ResourceTypeList = js.Array[SupportedResourceType]
  type SearchFilterFilterStringString = String
  type SearchInputMaxResultsInteger = Int
  type SearchInputNextTokenString = String
  type SearchInputViewArnString = String
  type SearchOutputNextTokenString = String
  type SearchOutputViewArnString = String
  type StringList = js.Array[String]
  type SyntheticTimestamp_date_time = js.Date
  type TagMap = js.Dictionary[String]
  type UpdateViewInputViewArnString = String
  type ViewArnList = js.Array[String]
  type ViewList = js.Array[View]
  type ViewName = String

  final class ResourceExplorer2Ops(private val service: ResourceExplorer2) extends AnyVal {

    @inline def associateDefaultViewFuture(params: AssociateDefaultViewInput): Future[AssociateDefaultViewOutput] = service.associateDefaultView(params).promise().toFuture
    @inline def batchGetViewFuture(params: BatchGetViewInput): Future[BatchGetViewOutput] = service.batchGetView(params).promise().toFuture
    @inline def createIndexFuture(params: CreateIndexInput): Future[CreateIndexOutput] = service.createIndex(params).promise().toFuture
    @inline def createViewFuture(params: CreateViewInput): Future[CreateViewOutput] = service.createView(params).promise().toFuture
    @inline def deleteIndexFuture(params: DeleteIndexInput): Future[DeleteIndexOutput] = service.deleteIndex(params).promise().toFuture
    @inline def deleteViewFuture(params: DeleteViewInput): Future[DeleteViewOutput] = service.deleteView(params).promise().toFuture
    @inline def disassociateDefaultViewFuture(): Future[js.Object] = service.disassociateDefaultView().promise().toFuture
    @inline def getDefaultViewFuture(): Future[GetDefaultViewOutput] = service.getDefaultView().promise().toFuture
    @inline def getIndexFuture(): Future[GetIndexOutput] = service.getIndex().promise().toFuture
    @inline def getViewFuture(params: GetViewInput): Future[GetViewOutput] = service.getView(params).promise().toFuture
    @inline def listIndexesFuture(params: ListIndexesInput): Future[ListIndexesOutput] = service.listIndexes(params).promise().toFuture
    @inline def listSupportedResourceTypesFuture(params: ListSupportedResourceTypesInput): Future[ListSupportedResourceTypesOutput] = service.listSupportedResourceTypes(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def listViewsFuture(params: ListViewsInput): Future[ListViewsOutput] = service.listViews(params).promise().toFuture
    @inline def searchFuture(params: SearchInput): Future[SearchOutput] = service.search(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateIndexTypeFuture(params: UpdateIndexTypeInput): Future[UpdateIndexTypeOutput] = service.updateIndexType(params).promise().toFuture
    @inline def updateViewFuture(params: UpdateViewInput): Future[UpdateViewOutput] = service.updateView(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/resourceexplorer2", JSImport.Namespace, "AWS.ResourceExplorer2")
  class ResourceExplorer2() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateDefaultView(params: AssociateDefaultViewInput): Request[AssociateDefaultViewOutput] = js.native
    def batchGetView(params: BatchGetViewInput): Request[BatchGetViewOutput] = js.native
    def createIndex(params: CreateIndexInput): Request[CreateIndexOutput] = js.native
    def createView(params: CreateViewInput): Request[CreateViewOutput] = js.native
    def deleteIndex(params: DeleteIndexInput): Request[DeleteIndexOutput] = js.native
    def deleteView(params: DeleteViewInput): Request[DeleteViewOutput] = js.native
    def disassociateDefaultView(): Request[js.Object] = js.native
    def getDefaultView(): Request[GetDefaultViewOutput] = js.native
    def getIndex(): Request[GetIndexOutput] = js.native
    def getView(params: GetViewInput): Request[GetViewOutput] = js.native
    def listIndexes(params: ListIndexesInput): Request[ListIndexesOutput] = js.native
    def listSupportedResourceTypes(params: ListSupportedResourceTypesInput): Request[ListSupportedResourceTypesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listViews(params: ListViewsInput): Request[ListViewsOutput] = js.native
    def search(params: SearchInput): Request[SearchOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateIndexType(params: UpdateIndexTypeInput): Request[UpdateIndexTypeOutput] = js.native
    def updateView(params: UpdateViewInput): Request[UpdateViewOutput] = js.native
  }
  object ResourceExplorer2 {
    @inline implicit def toOps(service: ResourceExplorer2): ResourceExplorer2Ops = {
      new ResourceExplorer2Ops(service)
    }
  }

  @js.native
  trait AssociateDefaultViewInput extends js.Object {
    var ViewArn: AssociateDefaultViewInputViewArnString
  }

  object AssociateDefaultViewInput {
    @inline
    def apply(
        ViewArn: AssociateDefaultViewInputViewArnString
    ): AssociateDefaultViewInput = {
      val __obj = js.Dynamic.literal(
        "ViewArn" -> ViewArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateDefaultViewInput]
    }
  }

  @js.native
  trait AssociateDefaultViewOutput extends js.Object {
    var ViewArn: js.UndefOr[String]
  }

  object AssociateDefaultViewOutput {
    @inline
    def apply(
        ViewArn: js.UndefOr[String] = js.undefined
    ): AssociateDefaultViewOutput = {
      val __obj = js.Dynamic.literal()
      ViewArn.foreach(__v => __obj.updateDynamic("ViewArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateDefaultViewOutput]
    }
  }

  /** A collection of error messages for any views that Amazon Web Services Resource Explorer couldn't retrieve details.
    */
  @js.native
  trait BatchGetViewError extends js.Object {
    var ErrorMessage: String
    var ViewArn: String
  }

  object BatchGetViewError {
    @inline
    def apply(
        ErrorMessage: String,
        ViewArn: String
    ): BatchGetViewError = {
      val __obj = js.Dynamic.literal(
        "ErrorMessage" -> ErrorMessage.asInstanceOf[js.Any],
        "ViewArn" -> ViewArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetViewError]
    }
  }

  @js.native
  trait BatchGetViewInput extends js.Object {
    var ViewArns: js.UndefOr[BatchGetViewInputViewArnsList]
  }

  object BatchGetViewInput {
    @inline
    def apply(
        ViewArns: js.UndefOr[BatchGetViewInputViewArnsList] = js.undefined
    ): BatchGetViewInput = {
      val __obj = js.Dynamic.literal()
      ViewArns.foreach(__v => __obj.updateDynamic("ViewArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetViewInput]
    }
  }

  @js.native
  trait BatchGetViewOutput extends js.Object {
    var Errors: js.UndefOr[BatchGetViewErrors]
    var Views: js.UndefOr[ViewList]
  }

  object BatchGetViewOutput {
    @inline
    def apply(
        Errors: js.UndefOr[BatchGetViewErrors] = js.undefined,
        Views: js.UndefOr[ViewList] = js.undefined
    ): BatchGetViewOutput = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Views.foreach(__v => __obj.updateDynamic("Views")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetViewOutput]
    }
  }

  @js.native
  trait CreateIndexInput extends js.Object {
    var ClientToken: js.UndefOr[String]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateIndexInput {
    @inline
    def apply(
        ClientToken: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateIndexInput = {
      val __obj = js.Dynamic.literal()
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIndexInput]
    }
  }

  @js.native
  trait CreateIndexOutput extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var State: js.UndefOr[IndexState]
  }

  object CreateIndexOutput {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        State: js.UndefOr[IndexState] = js.undefined
    ): CreateIndexOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIndexOutput]
    }
  }

  @js.native
  trait CreateViewInput extends js.Object {
    var ViewName: ViewName
    var ClientToken: js.UndefOr[CreateViewInputClientTokenString]
    var Filters: js.UndefOr[SearchFilter]
    var IncludedProperties: js.UndefOr[IncludedPropertyList]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateViewInput {
    @inline
    def apply(
        ViewName: ViewName,
        ClientToken: js.UndefOr[CreateViewInputClientTokenString] = js.undefined,
        Filters: js.UndefOr[SearchFilter] = js.undefined,
        IncludedProperties: js.UndefOr[IncludedPropertyList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateViewInput = {
      val __obj = js.Dynamic.literal(
        "ViewName" -> ViewName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      IncludedProperties.foreach(__v => __obj.updateDynamic("IncludedProperties")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateViewInput]
    }
  }

  @js.native
  trait CreateViewOutput extends js.Object {
    var View: js.UndefOr[View]
  }

  object CreateViewOutput {
    @inline
    def apply(
        View: js.UndefOr[View] = js.undefined
    ): CreateViewOutput = {
      val __obj = js.Dynamic.literal()
      View.foreach(__v => __obj.updateDynamic("View")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateViewOutput]
    }
  }

  @js.native
  trait DeleteIndexInput extends js.Object {
    var Arn: String
  }

  object DeleteIndexInput {
    @inline
    def apply(
        Arn: String
    ): DeleteIndexInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIndexInput]
    }
  }

  @js.native
  trait DeleteIndexOutput extends js.Object {
    var Arn: js.UndefOr[String]
    var LastUpdatedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var State: js.UndefOr[IndexState]
  }

  object DeleteIndexOutput {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        LastUpdatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        State: js.UndefOr[IndexState] = js.undefined
    ): DeleteIndexOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteIndexOutput]
    }
  }

  @js.native
  trait DeleteViewInput extends js.Object {
    var ViewArn: DeleteViewInputViewArnString
  }

  object DeleteViewInput {
    @inline
    def apply(
        ViewArn: DeleteViewInputViewArnString
    ): DeleteViewInput = {
      val __obj = js.Dynamic.literal(
        "ViewArn" -> ViewArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteViewInput]
    }
  }

  @js.native
  trait DeleteViewOutput extends js.Object {
    var ViewArn: js.UndefOr[String]
  }

  object DeleteViewOutput {
    @inline
    def apply(
        ViewArn: js.UndefOr[String] = js.undefined
    ): DeleteViewOutput = {
      val __obj = js.Dynamic.literal()
      ViewArn.foreach(__v => __obj.updateDynamic("ViewArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteViewOutput]
    }
  }

  @js.native
  trait Document extends js.Object

  object Document {
    @inline
    def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
  }

  @js.native
  trait GetDefaultViewOutput extends js.Object {
    var ViewArn: js.UndefOr[String]
  }

  object GetDefaultViewOutput {
    @inline
    def apply(
        ViewArn: js.UndefOr[String] = js.undefined
    ): GetDefaultViewOutput = {
      val __obj = js.Dynamic.literal()
      ViewArn.foreach(__v => __obj.updateDynamic("ViewArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDefaultViewOutput]
    }
  }

  @js.native
  trait GetIndexOutput extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var LastUpdatedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var ReplicatingFrom: js.UndefOr[RegionList]
    var ReplicatingTo: js.UndefOr[RegionList]
    var State: js.UndefOr[IndexState]
    var Tags: js.UndefOr[TagMap]
    var Type: js.UndefOr[IndexType]
  }

  object GetIndexOutput {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        LastUpdatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        ReplicatingFrom: js.UndefOr[RegionList] = js.undefined,
        ReplicatingTo: js.UndefOr[RegionList] = js.undefined,
        State: js.UndefOr[IndexState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Type: js.UndefOr[IndexType] = js.undefined
    ): GetIndexOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      ReplicatingFrom.foreach(__v => __obj.updateDynamic("ReplicatingFrom")(__v.asInstanceOf[js.Any]))
      ReplicatingTo.foreach(__v => __obj.updateDynamic("ReplicatingTo")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIndexOutput]
    }
  }

  @js.native
  trait GetViewInput extends js.Object {
    var ViewArn: GetViewInputViewArnString
  }

  object GetViewInput {
    @inline
    def apply(
        ViewArn: GetViewInputViewArnString
    ): GetViewInput = {
      val __obj = js.Dynamic.literal(
        "ViewArn" -> ViewArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetViewInput]
    }
  }

  @js.native
  trait GetViewOutput extends js.Object {
    var Tags: js.UndefOr[TagMap]
    var View: js.UndefOr[View]
  }

  object GetViewOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined,
        View: js.UndefOr[View] = js.undefined
    ): GetViewOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      View.foreach(__v => __obj.updateDynamic("View")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetViewOutput]
    }
  }

  /** Information about an additional property that describes a resource, that you can optionally include in the view. This lets you view that property in search results, and filter your search results based on the value of the property.
    */
  @js.native
  trait IncludedProperty extends js.Object {
    var Name: IncludedPropertyNameString
  }

  object IncludedProperty {
    @inline
    def apply(
        Name: IncludedPropertyNameString
    ): IncludedProperty = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IncludedProperty]
    }
  }

  /** An index is the data store used by Amazon Web Services Resource Explorer to hold information about your Amazon Web Services resources that the service discovers. Creating an index in an Amazon Web Services Region turns on Resource Explorer and lets it discover your resources. By default, an index is <i>local</i>, meaning that it contains information about resources in only the same Region as the index. However, you can promote the index of one Region in the account by calling <a>UpdateIndexType</a> to convert it into an aggregator index. The aggregator index receives a replicated copy of the index information from all other Regions where Resource Explorer is turned on. This allows search operations in that Region to return results from all Regions in the account.
    */
  @js.native
  trait Index extends js.Object {
    var Arn: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var Type: js.UndefOr[IndexType]
  }

  object Index {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Region: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[IndexType] = js.undefined
    ): Index = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Index]
    }
  }

  @js.native
  trait ListIndexesInput extends js.Object {
    var MaxResults: js.UndefOr[ListIndexesInputMaxResultsInteger]
    var NextToken: js.UndefOr[ListIndexesInputNextTokenString]
    var Regions: js.UndefOr[ListIndexesInputRegionsList]
    var Type: js.UndefOr[IndexType]
  }

  object ListIndexesInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListIndexesInputMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[ListIndexesInputNextTokenString] = js.undefined,
        Regions: js.UndefOr[ListIndexesInputRegionsList] = js.undefined,
        Type: js.UndefOr[IndexType] = js.undefined
    ): ListIndexesInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIndexesInput]
    }
  }

  @js.native
  trait ListIndexesOutput extends js.Object {
    var Indexes: js.UndefOr[IndexList]
    var NextToken: js.UndefOr[String]
  }

  object ListIndexesOutput {
    @inline
    def apply(
        Indexes: js.UndefOr[IndexList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIndexesOutput = {
      val __obj = js.Dynamic.literal()
      Indexes.foreach(__v => __obj.updateDynamic("Indexes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIndexesOutput]
    }
  }

  @js.native
  trait ListSupportedResourceTypesInput extends js.Object {
    var MaxResults: js.UndefOr[ListSupportedResourceTypesInputMaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListSupportedResourceTypesInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListSupportedResourceTypesInputMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListSupportedResourceTypesInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSupportedResourceTypesInput]
    }
  }

  @js.native
  trait ListSupportedResourceTypesOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var ResourceTypes: js.UndefOr[ResourceTypeList]
  }

  object ListSupportedResourceTypesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypeList] = js.undefined
    ): ListSupportedResourceTypesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSupportedResourceTypesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait ListViewsInput extends js.Object {
    var MaxResults: js.UndefOr[ListViewsInputMaxResultsInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListViewsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListViewsInputMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListViewsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListViewsInput]
    }
  }

  @js.native
  trait ListViewsOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var Views: js.UndefOr[ViewArnList]
  }

  object ListViewsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Views: js.UndefOr[ViewArnList] = js.undefined
    ): ListViewsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Views.foreach(__v => __obj.updateDynamic("Views")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListViewsOutput]
    }
  }

  /** A resource in Amazon Web Services that Amazon Web Services Resource Explorer has discovered, and for which it has stored information in the index of the Amazon Web Services Region that contains the resource.
    */
  @js.native
  trait Resource extends js.Object {
    var Arn: js.UndefOr[String]
    var LastReportedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var OwningAccountId: js.UndefOr[String]
    var Properties: js.UndefOr[ResourcePropertyList]
    var Region: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
    var Service: js.UndefOr[String]
  }

  object Resource {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        LastReportedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        OwningAccountId: js.UndefOr[String] = js.undefined,
        Properties: js.UndefOr[ResourcePropertyList] = js.undefined,
        Region: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined,
        Service: js.UndefOr[String] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      LastReportedAt.foreach(__v => __obj.updateDynamic("LastReportedAt")(__v.asInstanceOf[js.Any]))
      OwningAccountId.foreach(__v => __obj.updateDynamic("OwningAccountId")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** Information about the number of results that match the query. At this time, Amazon Web Services Resource Explorer doesn't count more than 1,000 matches for any query. This structure provides information about whether the query exceeded this limit. This field is included in every page when you paginate the results.
    */
  @js.native
  trait ResourceCount extends js.Object {
    var Complete: js.UndefOr[Boolean]
    var TotalResources: js.UndefOr[Double]
  }

  object ResourceCount {
    @inline
    def apply(
        Complete: js.UndefOr[Boolean] = js.undefined,
        TotalResources: js.UndefOr[Double] = js.undefined
    ): ResourceCount = {
      val __obj = js.Dynamic.literal()
      Complete.foreach(__v => __obj.updateDynamic("Complete")(__v.asInstanceOf[js.Any]))
      TotalResources.foreach(__v => __obj.updateDynamic("TotalResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceCount]
    }
  }

  /** A structure that describes a property of a resource.
    */
  @js.native
  trait ResourceProperty extends js.Object {
    var Data: js.UndefOr[Document]
    var LastReportedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var Name: js.UndefOr[String]
  }

  object ResourceProperty {
    @inline
    def apply(
        Data: js.UndefOr[Document] = js.undefined,
        LastReportedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): ResourceProperty = {
      val __obj = js.Dynamic.literal()
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      LastReportedAt.foreach(__v => __obj.updateDynamic("LastReportedAt")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceProperty]
    }
  }

  /** A search filter defines which resources can be part of a search query result set.
    */
  @js.native
  trait SearchFilter extends js.Object {
    var FilterString: SearchFilterFilterStringString
  }

  object SearchFilter {
    @inline
    def apply(
        FilterString: SearchFilterFilterStringString
    ): SearchFilter = {
      val __obj = js.Dynamic.literal(
        "FilterString" -> FilterString.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchFilter]
    }
  }

  @js.native
  trait SearchInput extends js.Object {
    var QueryString: QueryString
    var MaxResults: js.UndefOr[SearchInputMaxResultsInteger]
    var NextToken: js.UndefOr[SearchInputNextTokenString]
    var ViewArn: js.UndefOr[SearchInputViewArnString]
  }

  object SearchInput {
    @inline
    def apply(
        QueryString: QueryString,
        MaxResults: js.UndefOr[SearchInputMaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[SearchInputNextTokenString] = js.undefined,
        ViewArn: js.UndefOr[SearchInputViewArnString] = js.undefined
    ): SearchInput = {
      val __obj = js.Dynamic.literal(
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ViewArn.foreach(__v => __obj.updateDynamic("ViewArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchInput]
    }
  }

  @js.native
  trait SearchOutput extends js.Object {
    var Count: js.UndefOr[ResourceCount]
    var NextToken: js.UndefOr[SearchOutputNextTokenString]
    var Resources: js.UndefOr[ResourceList]
    var ViewArn: js.UndefOr[SearchOutputViewArnString]
  }

  object SearchOutput {
    @inline
    def apply(
        Count: js.UndefOr[ResourceCount] = js.undefined,
        NextToken: js.UndefOr[SearchOutputNextTokenString] = js.undefined,
        Resources: js.UndefOr[ResourceList] = js.undefined,
        ViewArn: js.UndefOr[SearchOutputViewArnString] = js.undefined
    ): SearchOutput = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      ViewArn.foreach(__v => __obj.updateDynamic("ViewArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchOutput]
    }
  }

  /** A structure that describes a resource type supported by Amazon Web Services Resource Explorer.
    */
  @js.native
  trait SupportedResourceType extends js.Object {
    var ResourceType: js.UndefOr[String]
    var Service: js.UndefOr[String]
  }

  object SupportedResourceType {
    @inline
    def apply(
        ResourceType: js.UndefOr[String] = js.undefined,
        Service: js.UndefOr[String] = js.undefined
    ): SupportedResourceType = {
      val __obj = js.Dynamic.literal()
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SupportedResourceType]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: String
    var Tags: js.UndefOr[TagMap]
  }

  object TagResourceInput {
    @inline
    def apply(
        resourceArn: String,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: String
    var tagKeys: StringList
  }

  object UntagResourceInput {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: StringList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateIndexTypeInput extends js.Object {
    var Arn: String
    var Type: IndexType
  }

  object UpdateIndexTypeInput {
    @inline
    def apply(
        Arn: String,
        Type: IndexType
    ): UpdateIndexTypeInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateIndexTypeInput]
    }
  }

  @js.native
  trait UpdateIndexTypeOutput extends js.Object {
    var Arn: js.UndefOr[String]
    var LastUpdatedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var State: js.UndefOr[IndexState]
    var Type: js.UndefOr[IndexType]
  }

  object UpdateIndexTypeOutput {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        LastUpdatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        State: js.UndefOr[IndexState] = js.undefined,
        Type: js.UndefOr[IndexType] = js.undefined
    ): UpdateIndexTypeOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIndexTypeOutput]
    }
  }

  @js.native
  trait UpdateViewInput extends js.Object {
    var ViewArn: UpdateViewInputViewArnString
    var Filters: js.UndefOr[SearchFilter]
    var IncludedProperties: js.UndefOr[IncludedPropertyList]
  }

  object UpdateViewInput {
    @inline
    def apply(
        ViewArn: UpdateViewInputViewArnString,
        Filters: js.UndefOr[SearchFilter] = js.undefined,
        IncludedProperties: js.UndefOr[IncludedPropertyList] = js.undefined
    ): UpdateViewInput = {
      val __obj = js.Dynamic.literal(
        "ViewArn" -> ViewArn.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      IncludedProperties.foreach(__v => __obj.updateDynamic("IncludedProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateViewInput]
    }
  }

  @js.native
  trait UpdateViewOutput extends js.Object {
    var View: js.UndefOr[View]
  }

  object UpdateViewOutput {
    @inline
    def apply(
        View: js.UndefOr[View] = js.undefined
    ): UpdateViewOutput = {
      val __obj = js.Dynamic.literal()
      View.foreach(__v => __obj.updateDynamic("View")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateViewOutput]
    }
  }

  /** A view is a structure that defines a set of filters that provide a view into the information in the Amazon Web Services Resource Explorer index. The filters specify which information from the index is visible to the users of the view. For example, you can specify filters that include only resources that are tagged with the key "ENV" and the value "DEVELOPMENT" in the results returned by this view. You could also create a second view that includes only resources that are tagged with "ENV" and "PRODUCTION".
    */
  @js.native
  trait View extends js.Object {
    var Filters: js.UndefOr[SearchFilter]
    var IncludedProperties: js.UndefOr[IncludedPropertyList]
    var LastUpdatedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var Owner: js.UndefOr[String]
    var Scope: js.UndefOr[String]
    var ViewArn: js.UndefOr[String]
  }

  object View {
    @inline
    def apply(
        Filters: js.UndefOr[SearchFilter] = js.undefined,
        IncludedProperties: js.UndefOr[IncludedPropertyList] = js.undefined,
        LastUpdatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        Owner: js.UndefOr[String] = js.undefined,
        Scope: js.UndefOr[String] = js.undefined,
        ViewArn: js.UndefOr[String] = js.undefined
    ): View = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      IncludedProperties.foreach(__v => __obj.updateDynamic("IncludedProperties")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      ViewArn.foreach(__v => __obj.updateDynamic("ViewArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[View]
    }
  }
}
