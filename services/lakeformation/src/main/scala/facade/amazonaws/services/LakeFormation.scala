package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object lakeformation {
  type BatchPermissionsFailureList = js.Array[BatchPermissionsFailureEntry]
  type BatchPermissionsRequestEntryList = js.Array[BatchPermissionsRequestEntry]
  type BooleanNullable = Boolean
  type CatalogIdString = String
  type ColumnLFTagsList = js.Array[ColumnLFTag]
  type ColumnNames = js.Array[NameString]
  type DataCellsFilterList = js.Array[DataCellsFilter]
  type DataLakePrincipalList = js.Array[DataLakePrincipal]
  type DataLakePrincipalString = String
  type DatabaseLFTagsList = js.Array[TaggedDatabase]
  type DateTime = js.Date
  type DescriptionString = String
  type ETagString = String
  type ErrorMessageString = String
  type Expression = js.Array[LFTag]
  type FilterConditionList = js.Array[FilterCondition]
  type GetQueryStateRequestQueryIdString = String
  type GetQueryStatisticsRequestQueryIdString = String
  type GetWorkUnitResultsRequestQueryIdString = String
  type GetWorkUnitResultsRequestWorkUnitIdLong = Double
  type GetWorkUnitsRequestQueryIdString = String
  type IAMRoleArn = String
  type Identifier = String
  type LFTagErrors = js.Array[LFTagError]
  type LFTagKey = String
  type LFTagValue = String
  type LFTagsList = js.Array[LFTagPair]
  type LastModifiedTimestamp = js.Date
  type MessageString = String
  type NameString = String
  type NullableBoolean = Boolean
  type NumberOfBytes = Double
  type NumberOfItems = Double
  type NumberOfMilliseconds = Double
  type ObjectSize = Double
  type PageSize = Int
  type PartitionValueString = String
  type PartitionValuesList = js.Array[PartitionValueString]
  type PartitionedTableObjectsList = js.Array[PartitionObjects]
  type PermissionList = js.Array[Permission]
  type PredicateString = String
  type PrincipalPermissionsList = js.Array[PrincipalPermissions]
  type PrincipalResourcePermissionsList = js.Array[PrincipalResourcePermissions]
  type QueryIdString = String
  type QueryParameterMap = js.Dictionary[String]
  type QueryPlanningContextDatabaseNameString = String
  type RAMResourceShareArn = String
  type ResourceArnString = String
  type ResourceInfoList = js.Array[ResourceInfo]
  type ResourceShareList = js.Array[RAMResourceShareArn]
  type Result = String
  type ResultStream = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type StorageOptimizerConfig = js.Dictionary[StorageOptimizerConfigValue]
  type StorageOptimizerConfigKey = String
  type StorageOptimizerConfigMap = js.Dictionary[StorageOptimizerConfig]
  type StorageOptimizerConfigValue = String
  type StorageOptimizerList = js.Array[StorageOptimizer]
  type StringValue = String
  type StringValueList = js.Array[StringValue]
  type SyntheticGetWorkUnitResultsRequestWorkUnitTokenString = String
  type SyntheticStartQueryPlanningRequestQueryString = String
  type TableLFTagsList = js.Array[TaggedTable]
  type TableObjectList = js.Array[TableObject]
  type TagValueList = js.Array[LFTagValue]
  type Timestamp = js.Date
  type Token = String
  type TokenString = String
  type TransactionDescriptionList = js.Array[TransactionDescription]
  type TransactionIdString = String
  type TrueFalseString = String
  type TrustedResourceOwners = js.Array[CatalogIdString]
  type URI = String
  type VirtualObjectList = js.Array[VirtualObject]
  type WorkUnitIdLong = Double
  type WorkUnitRangeList = js.Array[WorkUnitRange]
  type WorkUnitTokenString = String
  type WriteOperationList = js.Array[WriteOperation]

  final class LakeFormationOps(private val service: LakeFormation) extends AnyVal {

    @inline def addLFTagsToResourceFuture(params: AddLFTagsToResourceRequest): Future[AddLFTagsToResourceResponse] = service.addLFTagsToResource(params).promise().toFuture
    @inline def batchGrantPermissionsFuture(params: BatchGrantPermissionsRequest): Future[BatchGrantPermissionsResponse] = service.batchGrantPermissions(params).promise().toFuture
    @inline def batchRevokePermissionsFuture(params: BatchRevokePermissionsRequest): Future[BatchRevokePermissionsResponse] = service.batchRevokePermissions(params).promise().toFuture
    @inline def cancelTransactionFuture(params: CancelTransactionRequest): Future[CancelTransactionResponse] = service.cancelTransaction(params).promise().toFuture
    @inline def commitTransactionFuture(params: CommitTransactionRequest): Future[CommitTransactionResponse] = service.commitTransaction(params).promise().toFuture
    @inline def createDataCellsFilterFuture(params: CreateDataCellsFilterRequest): Future[CreateDataCellsFilterResponse] = service.createDataCellsFilter(params).promise().toFuture
    @inline def createLFTagFuture(params: CreateLFTagRequest): Future[CreateLFTagResponse] = service.createLFTag(params).promise().toFuture
    @inline def deleteDataCellsFilterFuture(params: DeleteDataCellsFilterRequest): Future[DeleteDataCellsFilterResponse] = service.deleteDataCellsFilter(params).promise().toFuture
    @inline def deleteLFTagFuture(params: DeleteLFTagRequest): Future[DeleteLFTagResponse] = service.deleteLFTag(params).promise().toFuture
    @inline def deleteObjectsOnCancelFuture(params: DeleteObjectsOnCancelRequest): Future[DeleteObjectsOnCancelResponse] = service.deleteObjectsOnCancel(params).promise().toFuture
    @inline def deregisterResourceFuture(params: DeregisterResourceRequest): Future[DeregisterResourceResponse] = service.deregisterResource(params).promise().toFuture
    @inline def describeResourceFuture(params: DescribeResourceRequest): Future[DescribeResourceResponse] = service.describeResource(params).promise().toFuture
    @inline def describeTransactionFuture(params: DescribeTransactionRequest): Future[DescribeTransactionResponse] = service.describeTransaction(params).promise().toFuture
    @inline def extendTransactionFuture(params: ExtendTransactionRequest): Future[ExtendTransactionResponse] = service.extendTransaction(params).promise().toFuture
    @inline def getDataLakeSettingsFuture(params: GetDataLakeSettingsRequest): Future[GetDataLakeSettingsResponse] = service.getDataLakeSettings(params).promise().toFuture
    @inline def getEffectivePermissionsForPathFuture(params: GetEffectivePermissionsForPathRequest): Future[GetEffectivePermissionsForPathResponse] = service.getEffectivePermissionsForPath(params).promise().toFuture
    @inline def getLFTagFuture(params: GetLFTagRequest): Future[GetLFTagResponse] = service.getLFTag(params).promise().toFuture
    @inline def getQueryStateFuture(params: GetQueryStateRequest): Future[GetQueryStateResponse] = service.getQueryState(params).promise().toFuture
    @inline def getQueryStatisticsFuture(params: GetQueryStatisticsRequest): Future[GetQueryStatisticsResponse] = service.getQueryStatistics(params).promise().toFuture
    @inline def getResourceLFTagsFuture(params: GetResourceLFTagsRequest): Future[GetResourceLFTagsResponse] = service.getResourceLFTags(params).promise().toFuture
    @inline def getTableObjectsFuture(params: GetTableObjectsRequest): Future[GetTableObjectsResponse] = service.getTableObjects(params).promise().toFuture
    @inline def getWorkUnitResultsFuture(params: GetWorkUnitResultsRequest): Future[GetWorkUnitResultsResponse] = service.getWorkUnitResults(params).promise().toFuture
    @inline def getWorkUnitsFuture(params: GetWorkUnitsRequest): Future[GetWorkUnitsResponse] = service.getWorkUnits(params).promise().toFuture
    @inline def grantPermissionsFuture(params: GrantPermissionsRequest): Future[GrantPermissionsResponse] = service.grantPermissions(params).promise().toFuture
    @inline def listDataCellsFilterFuture(params: ListDataCellsFilterRequest): Future[ListDataCellsFilterResponse] = service.listDataCellsFilter(params).promise().toFuture
    @inline def listLFTagsFuture(params: ListLFTagsRequest): Future[ListLFTagsResponse] = service.listLFTags(params).promise().toFuture
    @inline def listPermissionsFuture(params: ListPermissionsRequest): Future[ListPermissionsResponse] = service.listPermissions(params).promise().toFuture
    @inline def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] = service.listResources(params).promise().toFuture
    @inline def listTableStorageOptimizersFuture(params: ListTableStorageOptimizersRequest): Future[ListTableStorageOptimizersResponse] = service.listTableStorageOptimizers(params).promise().toFuture
    @inline def listTransactionsFuture(params: ListTransactionsRequest): Future[ListTransactionsResponse] = service.listTransactions(params).promise().toFuture
    @inline def putDataLakeSettingsFuture(params: PutDataLakeSettingsRequest): Future[PutDataLakeSettingsResponse] = service.putDataLakeSettings(params).promise().toFuture
    @inline def registerResourceFuture(params: RegisterResourceRequest): Future[RegisterResourceResponse] = service.registerResource(params).promise().toFuture
    @inline def removeLFTagsFromResourceFuture(params: RemoveLFTagsFromResourceRequest): Future[RemoveLFTagsFromResourceResponse] = service.removeLFTagsFromResource(params).promise().toFuture
    @inline def revokePermissionsFuture(params: RevokePermissionsRequest): Future[RevokePermissionsResponse] = service.revokePermissions(params).promise().toFuture
    @inline def searchDatabasesByLFTagsFuture(params: SearchDatabasesByLFTagsRequest): Future[SearchDatabasesByLFTagsResponse] = service.searchDatabasesByLFTags(params).promise().toFuture
    @inline def searchTablesByLFTagsFuture(params: SearchTablesByLFTagsRequest): Future[SearchTablesByLFTagsResponse] = service.searchTablesByLFTags(params).promise().toFuture
    @inline def startQueryPlanningFuture(params: StartQueryPlanningRequest): Future[StartQueryPlanningResponse] = service.startQueryPlanning(params).promise().toFuture
    @inline def startTransactionFuture(params: StartTransactionRequest): Future[StartTransactionResponse] = service.startTransaction(params).promise().toFuture
    @inline def updateLFTagFuture(params: UpdateLFTagRequest): Future[UpdateLFTagResponse] = service.updateLFTag(params).promise().toFuture
    @inline def updateResourceFuture(params: UpdateResourceRequest): Future[UpdateResourceResponse] = service.updateResource(params).promise().toFuture
    @inline def updateTableObjectsFuture(params: UpdateTableObjectsRequest): Future[UpdateTableObjectsResponse] = service.updateTableObjects(params).promise().toFuture
    @inline def updateTableStorageOptimizerFuture(params: UpdateTableStorageOptimizerRequest): Future[UpdateTableStorageOptimizerResponse] = service.updateTableStorageOptimizer(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/lakeformation", JSImport.Namespace, "AWS.LakeFormation")
  class LakeFormation() extends js.Object {
    def this(config: AWSConfig) = this()

    def addLFTagsToResource(params: AddLFTagsToResourceRequest): Request[AddLFTagsToResourceResponse] = js.native
    def batchGrantPermissions(params: BatchGrantPermissionsRequest): Request[BatchGrantPermissionsResponse] = js.native
    def batchRevokePermissions(params: BatchRevokePermissionsRequest): Request[BatchRevokePermissionsResponse] = js.native
    def cancelTransaction(params: CancelTransactionRequest): Request[CancelTransactionResponse] = js.native
    def commitTransaction(params: CommitTransactionRequest): Request[CommitTransactionResponse] = js.native
    def createDataCellsFilter(params: CreateDataCellsFilterRequest): Request[CreateDataCellsFilterResponse] = js.native
    def createLFTag(params: CreateLFTagRequest): Request[CreateLFTagResponse] = js.native
    def deleteDataCellsFilter(params: DeleteDataCellsFilterRequest): Request[DeleteDataCellsFilterResponse] = js.native
    def deleteLFTag(params: DeleteLFTagRequest): Request[DeleteLFTagResponse] = js.native
    def deleteObjectsOnCancel(params: DeleteObjectsOnCancelRequest): Request[DeleteObjectsOnCancelResponse] = js.native
    def deregisterResource(params: DeregisterResourceRequest): Request[DeregisterResourceResponse] = js.native
    def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse] = js.native
    def describeTransaction(params: DescribeTransactionRequest): Request[DescribeTransactionResponse] = js.native
    def extendTransaction(params: ExtendTransactionRequest): Request[ExtendTransactionResponse] = js.native
    def getDataLakeSettings(params: GetDataLakeSettingsRequest): Request[GetDataLakeSettingsResponse] = js.native
    def getEffectivePermissionsForPath(params: GetEffectivePermissionsForPathRequest): Request[GetEffectivePermissionsForPathResponse] = js.native
    def getLFTag(params: GetLFTagRequest): Request[GetLFTagResponse] = js.native
    def getQueryState(params: GetQueryStateRequest): Request[GetQueryStateResponse] = js.native
    def getQueryStatistics(params: GetQueryStatisticsRequest): Request[GetQueryStatisticsResponse] = js.native
    def getResourceLFTags(params: GetResourceLFTagsRequest): Request[GetResourceLFTagsResponse] = js.native
    def getTableObjects(params: GetTableObjectsRequest): Request[GetTableObjectsResponse] = js.native
    def getWorkUnitResults(params: GetWorkUnitResultsRequest): Request[GetWorkUnitResultsResponse] = js.native
    def getWorkUnits(params: GetWorkUnitsRequest): Request[GetWorkUnitsResponse] = js.native
    def grantPermissions(params: GrantPermissionsRequest): Request[GrantPermissionsResponse] = js.native
    def listDataCellsFilter(params: ListDataCellsFilterRequest): Request[ListDataCellsFilterResponse] = js.native
    def listLFTags(params: ListLFTagsRequest): Request[ListLFTagsResponse] = js.native
    def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse] = js.native
    def listTableStorageOptimizers(params: ListTableStorageOptimizersRequest): Request[ListTableStorageOptimizersResponse] = js.native
    def listTransactions(params: ListTransactionsRequest): Request[ListTransactionsResponse] = js.native
    def putDataLakeSettings(params: PutDataLakeSettingsRequest): Request[PutDataLakeSettingsResponse] = js.native
    def registerResource(params: RegisterResourceRequest): Request[RegisterResourceResponse] = js.native
    def removeLFTagsFromResource(params: RemoveLFTagsFromResourceRequest): Request[RemoveLFTagsFromResourceResponse] = js.native
    def revokePermissions(params: RevokePermissionsRequest): Request[RevokePermissionsResponse] = js.native
    def searchDatabasesByLFTags(params: SearchDatabasesByLFTagsRequest): Request[SearchDatabasesByLFTagsResponse] = js.native
    def searchTablesByLFTags(params: SearchTablesByLFTagsRequest): Request[SearchTablesByLFTagsResponse] = js.native
    def startQueryPlanning(params: StartQueryPlanningRequest): Request[StartQueryPlanningResponse] = js.native
    def startTransaction(params: StartTransactionRequest): Request[StartTransactionResponse] = js.native
    def updateLFTag(params: UpdateLFTagRequest): Request[UpdateLFTagResponse] = js.native
    def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse] = js.native
    def updateTableObjects(params: UpdateTableObjectsRequest): Request[UpdateTableObjectsResponse] = js.native
    def updateTableStorageOptimizer(params: UpdateTableStorageOptimizerRequest): Request[UpdateTableStorageOptimizerResponse] = js.native
  }
  object LakeFormation {
    @inline implicit def toOps(service: LakeFormation): LakeFormationOps = {
      new LakeFormationOps(service)
    }
  }

  @js.native
  trait AddLFTagsToResourceRequest extends js.Object {
    var LFTags: LFTagsList
    var Resource: Resource
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object AddLFTagsToResourceRequest {
    @inline
    def apply(
        LFTags: LFTagsList,
        Resource: Resource,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): AddLFTagsToResourceRequest = {
      val __obj = js.Dynamic.literal(
        "LFTags" -> LFTags.asInstanceOf[js.Any],
        "Resource" -> Resource.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddLFTagsToResourceRequest]
    }
  }

  @js.native
  trait AddLFTagsToResourceResponse extends js.Object {
    var Failures: js.UndefOr[LFTagErrors]
  }

  object AddLFTagsToResourceResponse {
    @inline
    def apply(
        Failures: js.UndefOr[LFTagErrors] = js.undefined
    ): AddLFTagsToResourceResponse = {
      val __obj = js.Dynamic.literal()
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddLFTagsToResourceResponse]
    }
  }

  /** A new object to add to the governed table.
    */
  @js.native
  trait AddObjectInput extends js.Object {
    var ETag: ETagString
    var Size: ObjectSize
    var Uri: URI
    var PartitionValues: js.UndefOr[PartitionValuesList]
  }

  object AddObjectInput {
    @inline
    def apply(
        ETag: ETagString,
        Size: ObjectSize,
        Uri: URI,
        PartitionValues: js.UndefOr[PartitionValuesList] = js.undefined
    ): AddObjectInput = {
      val __obj = js.Dynamic.literal(
        "ETag" -> ETag.asInstanceOf[js.Any],
        "Size" -> Size.asInstanceOf[js.Any],
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

      PartitionValues.foreach(__v => __obj.updateDynamic("PartitionValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddObjectInput]
    }
  }

  /** A structure that you pass to indicate you want all rows in a filter.
    */
  @js.native
  trait AllRowsWildcard extends js.Object

  object AllRowsWildcard {
    @inline
    def apply(): AllRowsWildcard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllRowsWildcard]
    }
  }

  @js.native
  trait BatchGrantPermissionsRequest extends js.Object {
    var Entries: BatchPermissionsRequestEntryList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchGrantPermissionsRequest {
    @inline
    def apply(
        Entries: BatchPermissionsRequestEntryList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchGrantPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGrantPermissionsRequest]
    }
  }

  @js.native
  trait BatchGrantPermissionsResponse extends js.Object {
    var Failures: js.UndefOr[BatchPermissionsFailureList]
  }

  object BatchGrantPermissionsResponse {
    @inline
    def apply(
        Failures: js.UndefOr[BatchPermissionsFailureList] = js.undefined
    ): BatchGrantPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGrantPermissionsResponse]
    }
  }

  /** A list of failures when performing a batch grant or batch revoke operation.
    */
  @js.native
  trait BatchPermissionsFailureEntry extends js.Object {
    var Error: js.UndefOr[ErrorDetail]
    var RequestEntry: js.UndefOr[BatchPermissionsRequestEntry]
  }

  object BatchPermissionsFailureEntry {
    @inline
    def apply(
        Error: js.UndefOr[ErrorDetail] = js.undefined,
        RequestEntry: js.UndefOr[BatchPermissionsRequestEntry] = js.undefined
    ): BatchPermissionsFailureEntry = {
      val __obj = js.Dynamic.literal()
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      RequestEntry.foreach(__v => __obj.updateDynamic("RequestEntry")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPermissionsFailureEntry]
    }
  }

  /** A permission to a resource granted by batch operation to the principal.
    */
  @js.native
  trait BatchPermissionsRequestEntry extends js.Object {
    var Id: Identifier
    var Permissions: js.UndefOr[PermissionList]
    var PermissionsWithGrantOption: js.UndefOr[PermissionList]
    var Principal: js.UndefOr[DataLakePrincipal]
    var Resource: js.UndefOr[Resource]
  }

  object BatchPermissionsRequestEntry {
    @inline
    def apply(
        Id: Identifier,
        Permissions: js.UndefOr[PermissionList] = js.undefined,
        PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined,
        Principal: js.UndefOr[DataLakePrincipal] = js.undefined,
        Resource: js.UndefOr[Resource] = js.undefined
    ): BatchPermissionsRequestEntry = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      PermissionsWithGrantOption.foreach(__v => __obj.updateDynamic("PermissionsWithGrantOption")(__v.asInstanceOf[js.Any]))
      Principal.foreach(__v => __obj.updateDynamic("Principal")(__v.asInstanceOf[js.Any]))
      Resource.foreach(__v => __obj.updateDynamic("Resource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPermissionsRequestEntry]
    }
  }

  @js.native
  trait BatchRevokePermissionsRequest extends js.Object {
    var Entries: BatchPermissionsRequestEntryList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object BatchRevokePermissionsRequest {
    @inline
    def apply(
        Entries: BatchPermissionsRequestEntryList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): BatchRevokePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "Entries" -> Entries.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchRevokePermissionsRequest]
    }
  }

  @js.native
  trait BatchRevokePermissionsResponse extends js.Object {
    var Failures: js.UndefOr[BatchPermissionsFailureList]
  }

  object BatchRevokePermissionsResponse {
    @inline
    def apply(
        Failures: js.UndefOr[BatchPermissionsFailureList] = js.undefined
    ): BatchRevokePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchRevokePermissionsResponse]
    }
  }

  @js.native
  trait CancelTransactionRequest extends js.Object {
    var TransactionId: TransactionIdString
  }

  object CancelTransactionRequest {
    @inline
    def apply(
        TransactionId: TransactionIdString
    ): CancelTransactionRequest = {
      val __obj = js.Dynamic.literal(
        "TransactionId" -> TransactionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelTransactionRequest]
    }
  }

  @js.native
  trait CancelTransactionResponse extends js.Object

  object CancelTransactionResponse {
    @inline
    def apply(): CancelTransactionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelTransactionResponse]
    }
  }

  /** A structure for the catalog object.
    */
  @js.native
  trait CatalogResource extends js.Object

  object CatalogResource {
    @inline
    def apply(): CatalogResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CatalogResource]
    }
  }

  /** A structure containing the name of a column resource and the LF-tags attached to it.
    */
  @js.native
  trait ColumnLFTag extends js.Object {
    var LFTags: js.UndefOr[LFTagsList]
    var Name: js.UndefOr[NameString]
  }

  object ColumnLFTag {
    @inline
    def apply(
        LFTags: js.UndefOr[LFTagsList] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined
    ): ColumnLFTag = {
      val __obj = js.Dynamic.literal()
      LFTags.foreach(__v => __obj.updateDynamic("LFTags")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnLFTag]
    }
  }

  /** A wildcard object, consisting of an optional list of excluded column names or indexes.
    */
  @js.native
  trait ColumnWildcard extends js.Object {
    var ExcludedColumnNames: js.UndefOr[ColumnNames]
  }

  object ColumnWildcard {
    @inline
    def apply(
        ExcludedColumnNames: js.UndefOr[ColumnNames] = js.undefined
    ): ColumnWildcard = {
      val __obj = js.Dynamic.literal()
      ExcludedColumnNames.foreach(__v => __obj.updateDynamic("ExcludedColumnNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnWildcard]
    }
  }

  @js.native
  trait CommitTransactionRequest extends js.Object {
    var TransactionId: TransactionIdString
  }

  object CommitTransactionRequest {
    @inline
    def apply(
        TransactionId: TransactionIdString
    ): CommitTransactionRequest = {
      val __obj = js.Dynamic.literal(
        "TransactionId" -> TransactionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CommitTransactionRequest]
    }
  }

  @js.native
  trait CommitTransactionResponse extends js.Object {
    var TransactionStatus: js.UndefOr[TransactionStatus]
  }

  object CommitTransactionResponse {
    @inline
    def apply(
        TransactionStatus: js.UndefOr[TransactionStatus] = js.undefined
    ): CommitTransactionResponse = {
      val __obj = js.Dynamic.literal()
      TransactionStatus.foreach(__v => __obj.updateDynamic("TransactionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommitTransactionResponse]
    }
  }

  @js.native
  trait CreateDataCellsFilterRequest extends js.Object {
    var TableData: DataCellsFilter
  }

  object CreateDataCellsFilterRequest {
    @inline
    def apply(
        TableData: DataCellsFilter
    ): CreateDataCellsFilterRequest = {
      val __obj = js.Dynamic.literal(
        "TableData" -> TableData.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDataCellsFilterRequest]
    }
  }

  @js.native
  trait CreateDataCellsFilterResponse extends js.Object

  object CreateDataCellsFilterResponse {
    @inline
    def apply(): CreateDataCellsFilterResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDataCellsFilterResponse]
    }
  }

  @js.native
  trait CreateLFTagRequest extends js.Object {
    var TagKey: LFTagKey
    var TagValues: TagValueList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object CreateLFTagRequest {
    @inline
    def apply(
        TagKey: LFTagKey,
        TagValues: TagValueList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): CreateLFTagRequest = {
      val __obj = js.Dynamic.literal(
        "TagKey" -> TagKey.asInstanceOf[js.Any],
        "TagValues" -> TagValues.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLFTagRequest]
    }
  }

  @js.native
  trait CreateLFTagResponse extends js.Object

  object CreateLFTagResponse {
    @inline
    def apply(): CreateLFTagResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLFTagResponse]
    }
  }

  /** A structure that describes certain columns on certain rows.
    */
  @js.native
  trait DataCellsFilter extends js.Object {
    var DatabaseName: NameString
    var Name: NameString
    var TableCatalogId: CatalogIdString
    var TableName: NameString
    var ColumnNames: js.UndefOr[ColumnNames]
    var ColumnWildcard: js.UndefOr[ColumnWildcard]
    var RowFilter: js.UndefOr[RowFilter]
  }

  object DataCellsFilter {
    @inline
    def apply(
        DatabaseName: NameString,
        Name: NameString,
        TableCatalogId: CatalogIdString,
        TableName: NameString,
        ColumnNames: js.UndefOr[ColumnNames] = js.undefined,
        ColumnWildcard: js.UndefOr[ColumnWildcard] = js.undefined,
        RowFilter: js.UndefOr[RowFilter] = js.undefined
    ): DataCellsFilter = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "TableCatalogId" -> TableCatalogId.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      ColumnNames.foreach(__v => __obj.updateDynamic("ColumnNames")(__v.asInstanceOf[js.Any]))
      ColumnWildcard.foreach(__v => __obj.updateDynamic("ColumnWildcard")(__v.asInstanceOf[js.Any]))
      RowFilter.foreach(__v => __obj.updateDynamic("RowFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCellsFilter]
    }
  }

  /** A structure for a data cells filter resource.
    */
  @js.native
  trait DataCellsFilterResource extends js.Object {
    var DatabaseName: js.UndefOr[NameString]
    var Name: js.UndefOr[NameString]
    var TableCatalogId: js.UndefOr[CatalogIdString]
    var TableName: js.UndefOr[NameString]
  }

  object DataCellsFilterResource {
    @inline
    def apply(
        DatabaseName: js.UndefOr[NameString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        TableCatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        TableName: js.UndefOr[NameString] = js.undefined
    ): DataCellsFilterResource = {
      val __obj = js.Dynamic.literal()
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TableCatalogId.foreach(__v => __obj.updateDynamic("TableCatalogId")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCellsFilterResource]
    }
  }

  /** The AWS Lake Formation principal. Supported principals are IAM users or IAM roles.
    */
  @js.native
  trait DataLakePrincipal extends js.Object {
    var DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString]
  }

  object DataLakePrincipal {
    @inline
    def apply(
        DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString] = js.undefined
    ): DataLakePrincipal = {
      val __obj = js.Dynamic.literal()
      DataLakePrincipalIdentifier.foreach(__v => __obj.updateDynamic("DataLakePrincipalIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataLakePrincipal]
    }
  }

  /** A structure representing a list of Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
    */
  @js.native
  trait DataLakeSettings extends js.Object {
    var CreateDatabaseDefaultPermissions: js.UndefOr[PrincipalPermissionsList]
    var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList]
    var DataLakeAdmins: js.UndefOr[DataLakePrincipalList]
    var TrustedResourceOwners: js.UndefOr[TrustedResourceOwners]
  }

  object DataLakeSettings {
    @inline
    def apply(
        CreateDatabaseDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined,
        CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined,
        DataLakeAdmins: js.UndefOr[DataLakePrincipalList] = js.undefined,
        TrustedResourceOwners: js.UndefOr[TrustedResourceOwners] = js.undefined
    ): DataLakeSettings = {
      val __obj = js.Dynamic.literal()
      CreateDatabaseDefaultPermissions.foreach(__v => __obj.updateDynamic("CreateDatabaseDefaultPermissions")(__v.asInstanceOf[js.Any]))
      CreateTableDefaultPermissions.foreach(__v => __obj.updateDynamic("CreateTableDefaultPermissions")(__v.asInstanceOf[js.Any]))
      DataLakeAdmins.foreach(__v => __obj.updateDynamic("DataLakeAdmins")(__v.asInstanceOf[js.Any]))
      TrustedResourceOwners.foreach(__v => __obj.updateDynamic("TrustedResourceOwners")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataLakeSettings]
    }
  }

  /** A structure for a data location object where permissions are granted or revoked.
    */
  @js.native
  trait DataLocationResource extends js.Object {
    var ResourceArn: ResourceArnString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DataLocationResource {
    @inline
    def apply(
        ResourceArn: ResourceArnString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DataLocationResource = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataLocationResource]
    }
  }

  /** A structure for the database object.
    */
  @js.native
  trait DatabaseResource extends js.Object {
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DatabaseResource {
    @inline
    def apply(
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DatabaseResource = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseResource]
    }
  }

  @js.native
  trait DeleteDataCellsFilterRequest extends js.Object {
    var DatabaseName: js.UndefOr[NameString]
    var Name: js.UndefOr[NameString]
    var TableCatalogId: js.UndefOr[CatalogIdString]
    var TableName: js.UndefOr[NameString]
  }

  object DeleteDataCellsFilterRequest {
    @inline
    def apply(
        DatabaseName: js.UndefOr[NameString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        TableCatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        TableName: js.UndefOr[NameString] = js.undefined
    ): DeleteDataCellsFilterRequest = {
      val __obj = js.Dynamic.literal()
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TableCatalogId.foreach(__v => __obj.updateDynamic("TableCatalogId")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDataCellsFilterRequest]
    }
  }

  @js.native
  trait DeleteDataCellsFilterResponse extends js.Object

  object DeleteDataCellsFilterResponse {
    @inline
    def apply(): DeleteDataCellsFilterResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDataCellsFilterResponse]
    }
  }

  @js.native
  trait DeleteLFTagRequest extends js.Object {
    var TagKey: LFTagKey
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteLFTagRequest {
    @inline
    def apply(
        TagKey: LFTagKey,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteLFTagRequest = {
      val __obj = js.Dynamic.literal(
        "TagKey" -> TagKey.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLFTagRequest]
    }
  }

  @js.native
  trait DeleteLFTagResponse extends js.Object

  object DeleteLFTagResponse {
    @inline
    def apply(): DeleteLFTagResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLFTagResponse]
    }
  }

  /** An object to delete from the governed table.
    */
  @js.native
  trait DeleteObjectInput extends js.Object {
    var Uri: URI
    var ETag: js.UndefOr[ETagString]
    var PartitionValues: js.UndefOr[PartitionValuesList]
  }

  object DeleteObjectInput {
    @inline
    def apply(
        Uri: URI,
        ETag: js.UndefOr[ETagString] = js.undefined,
        PartitionValues: js.UndefOr[PartitionValuesList] = js.undefined
    ): DeleteObjectInput = {
      val __obj = js.Dynamic.literal(
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      PartitionValues.foreach(__v => __obj.updateDynamic("PartitionValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteObjectInput]
    }
  }

  @js.native
  trait DeleteObjectsOnCancelRequest extends js.Object {
    var DatabaseName: NameString
    var Objects: VirtualObjectList
    var TableName: NameString
    var TransactionId: TransactionIdString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object DeleteObjectsOnCancelRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        Objects: VirtualObjectList,
        TableName: NameString,
        TransactionId: TransactionIdString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): DeleteObjectsOnCancelRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Objects" -> Objects.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "TransactionId" -> TransactionId.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteObjectsOnCancelRequest]
    }
  }

  @js.native
  trait DeleteObjectsOnCancelResponse extends js.Object

  object DeleteObjectsOnCancelResponse {
    @inline
    def apply(): DeleteObjectsOnCancelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteObjectsOnCancelResponse]
    }
  }

  @js.native
  trait DeregisterResourceRequest extends js.Object {
    var ResourceArn: ResourceArnString
  }

  object DeregisterResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArnString
    ): DeregisterResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterResourceRequest]
    }
  }

  @js.native
  trait DeregisterResourceResponse extends js.Object

  object DeregisterResourceResponse {
    @inline
    def apply(): DeregisterResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterResourceResponse]
    }
  }

  @js.native
  trait DescribeResourceRequest extends js.Object {
    var ResourceArn: ResourceArnString
  }

  object DescribeResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArnString
    ): DescribeResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeResourceRequest]
    }
  }

  @js.native
  trait DescribeResourceResponse extends js.Object {
    var ResourceInfo: js.UndefOr[ResourceInfo]
  }

  object DescribeResourceResponse {
    @inline
    def apply(
        ResourceInfo: js.UndefOr[ResourceInfo] = js.undefined
    ): DescribeResourceResponse = {
      val __obj = js.Dynamic.literal()
      ResourceInfo.foreach(__v => __obj.updateDynamic("ResourceInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeResourceResponse]
    }
  }

  @js.native
  trait DescribeTransactionRequest extends js.Object {
    var TransactionId: TransactionIdString
  }

  object DescribeTransactionRequest {
    @inline
    def apply(
        TransactionId: TransactionIdString
    ): DescribeTransactionRequest = {
      val __obj = js.Dynamic.literal(
        "TransactionId" -> TransactionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTransactionRequest]
    }
  }

  @js.native
  trait DescribeTransactionResponse extends js.Object {
    var TransactionDescription: js.UndefOr[TransactionDescription]
  }

  object DescribeTransactionResponse {
    @inline
    def apply(
        TransactionDescription: js.UndefOr[TransactionDescription] = js.undefined
    ): DescribeTransactionResponse = {
      val __obj = js.Dynamic.literal()
      TransactionDescription.foreach(__v => __obj.updateDynamic("TransactionDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTransactionResponse]
    }
  }

  /** A structure containing the additional details to be returned in the <code>AdditionalDetails</code> attribute of <code>PrincipalResourcePermissions</code>. If a catalog resource is shared through Resource Access Manager (RAM), then there will exist a corresponding RAM resource share ARN.
    */
  @js.native
  trait DetailsMap extends js.Object {
    var ResourceShare: js.UndefOr[ResourceShareList]
  }

  object DetailsMap {
    @inline
    def apply(
        ResourceShare: js.UndefOr[ResourceShareList] = js.undefined
    ): DetailsMap = {
      val __obj = js.Dynamic.literal()
      ResourceShare.foreach(__v => __obj.updateDynamic("ResourceShare")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetailsMap]
    }
  }

  /** Contains details about an error.
    */
  @js.native
  trait ErrorDetail extends js.Object {
    var ErrorCode: js.UndefOr[NameString]
    var ErrorMessage: js.UndefOr[DescriptionString]
  }

  object ErrorDetail {
    @inline
    def apply(
        ErrorCode: js.UndefOr[NameString] = js.undefined,
        ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
    ): ErrorDetail = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetail]
    }
  }

  /** Statistics related to the processing of a query statement.
    */
  @js.native
  trait ExecutionStatistics extends js.Object {
    var AverageExecutionTimeMillis: js.UndefOr[NumberOfMilliseconds]
    var DataScannedBytes: js.UndefOr[NumberOfBytes]
    var WorkUnitsExecutedCount: js.UndefOr[NumberOfItems]
  }

  object ExecutionStatistics {
    @inline
    def apply(
        AverageExecutionTimeMillis: js.UndefOr[NumberOfMilliseconds] = js.undefined,
        DataScannedBytes: js.UndefOr[NumberOfBytes] = js.undefined,
        WorkUnitsExecutedCount: js.UndefOr[NumberOfItems] = js.undefined
    ): ExecutionStatistics = {
      val __obj = js.Dynamic.literal()
      AverageExecutionTimeMillis.foreach(__v => __obj.updateDynamic("AverageExecutionTimeMillis")(__v.asInstanceOf[js.Any]))
      DataScannedBytes.foreach(__v => __obj.updateDynamic("DataScannedBytes")(__v.asInstanceOf[js.Any]))
      WorkUnitsExecutedCount.foreach(__v => __obj.updateDynamic("WorkUnitsExecutedCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionStatistics]
    }
  }

  @js.native
  trait ExtendTransactionRequest extends js.Object {
    var TransactionId: js.UndefOr[TransactionIdString]
  }

  object ExtendTransactionRequest {
    @inline
    def apply(
        TransactionId: js.UndefOr[TransactionIdString] = js.undefined
    ): ExtendTransactionRequest = {
      val __obj = js.Dynamic.literal()
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtendTransactionRequest]
    }
  }

  @js.native
  trait ExtendTransactionResponse extends js.Object

  object ExtendTransactionResponse {
    @inline
    def apply(): ExtendTransactionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendTransactionResponse]
    }
  }

  /** This structure describes the filtering of columns in a table based on a filter condition.
    */
  @js.native
  trait FilterCondition extends js.Object {
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var Field: js.UndefOr[FieldNameString]
    var StringValueList: js.UndefOr[StringValueList]
  }

  object FilterCondition {
    @inline
    def apply(
        ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
        Field: js.UndefOr[FieldNameString] = js.undefined,
        StringValueList: js.UndefOr[StringValueList] = js.undefined
    ): FilterCondition = {
      val __obj = js.Dynamic.literal()
      ComparisonOperator.foreach(__v => __obj.updateDynamic("ComparisonOperator")(__v.asInstanceOf[js.Any]))
      Field.foreach(__v => __obj.updateDynamic("Field")(__v.asInstanceOf[js.Any]))
      StringValueList.foreach(__v => __obj.updateDynamic("StringValueList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterCondition]
    }
  }

  @js.native
  trait GetDataLakeSettingsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetDataLakeSettingsRequest {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetDataLakeSettingsRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataLakeSettingsRequest]
    }
  }

  @js.native
  trait GetDataLakeSettingsResponse extends js.Object {
    var DataLakeSettings: js.UndefOr[DataLakeSettings]
  }

  object GetDataLakeSettingsResponse {
    @inline
    def apply(
        DataLakeSettings: js.UndefOr[DataLakeSettings] = js.undefined
    ): GetDataLakeSettingsResponse = {
      val __obj = js.Dynamic.literal()
      DataLakeSettings.foreach(__v => __obj.updateDynamic("DataLakeSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataLakeSettingsResponse]
    }
  }

  @js.native
  trait GetEffectivePermissionsForPathRequest extends js.Object {
    var ResourceArn: ResourceArnString
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object GetEffectivePermissionsForPathRequest {
    @inline
    def apply(
        ResourceArn: ResourceArnString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetEffectivePermissionsForPathRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEffectivePermissionsForPathRequest]
    }
  }

  @js.native
  trait GetEffectivePermissionsForPathResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Permissions: js.UndefOr[PrincipalResourcePermissionsList]
  }

  object GetEffectivePermissionsForPathResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Permissions: js.UndefOr[PrincipalResourcePermissionsList] = js.undefined
    ): GetEffectivePermissionsForPathResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEffectivePermissionsForPathResponse]
    }
  }

  @js.native
  trait GetLFTagRequest extends js.Object {
    var TagKey: LFTagKey
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object GetLFTagRequest {
    @inline
    def apply(
        TagKey: LFTagKey,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): GetLFTagRequest = {
      val __obj = js.Dynamic.literal(
        "TagKey" -> TagKey.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLFTagRequest]
    }
  }

  @js.native
  trait GetLFTagResponse extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var TagKey: js.UndefOr[LFTagKey]
    var TagValues: js.UndefOr[TagValueList]
  }

  object GetLFTagResponse {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        TagKey: js.UndefOr[LFTagKey] = js.undefined,
        TagValues: js.UndefOr[TagValueList] = js.undefined
    ): GetLFTagResponse = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      TagKey.foreach(__v => __obj.updateDynamic("TagKey")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLFTagResponse]
    }
  }

  @js.native
  trait GetQueryStateRequest extends js.Object {
    var QueryId: GetQueryStateRequestQueryIdString
  }

  object GetQueryStateRequest {
    @inline
    def apply(
        QueryId: GetQueryStateRequestQueryIdString
    ): GetQueryStateRequest = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetQueryStateRequest]
    }
  }

  /** A structure for the output.
    */
  @js.native
  trait GetQueryStateResponse extends js.Object {
    var State: QueryStateString
    var Error: js.UndefOr[ErrorMessageString]
  }

  object GetQueryStateResponse {
    @inline
    def apply(
        State: QueryStateString,
        Error: js.UndefOr[ErrorMessageString] = js.undefined
    ): GetQueryStateResponse = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )

      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryStateResponse]
    }
  }

  @js.native
  trait GetQueryStatisticsRequest extends js.Object {
    var QueryId: GetQueryStatisticsRequestQueryIdString
  }

  object GetQueryStatisticsRequest {
    @inline
    def apply(
        QueryId: GetQueryStatisticsRequestQueryIdString
    ): GetQueryStatisticsRequest = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetQueryStatisticsRequest]
    }
  }

  @js.native
  trait GetQueryStatisticsResponse extends js.Object {
    var ExecutionStatistics: js.UndefOr[ExecutionStatistics]
    var PlanningStatistics: js.UndefOr[PlanningStatistics]
    var QuerySubmissionTime: js.UndefOr[DateTime]
  }

  object GetQueryStatisticsResponse {
    @inline
    def apply(
        ExecutionStatistics: js.UndefOr[ExecutionStatistics] = js.undefined,
        PlanningStatistics: js.UndefOr[PlanningStatistics] = js.undefined,
        QuerySubmissionTime: js.UndefOr[DateTime] = js.undefined
    ): GetQueryStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      ExecutionStatistics.foreach(__v => __obj.updateDynamic("ExecutionStatistics")(__v.asInstanceOf[js.Any]))
      PlanningStatistics.foreach(__v => __obj.updateDynamic("PlanningStatistics")(__v.asInstanceOf[js.Any]))
      QuerySubmissionTime.foreach(__v => __obj.updateDynamic("QuerySubmissionTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueryStatisticsResponse]
    }
  }

  @js.native
  trait GetResourceLFTagsRequest extends js.Object {
    var Resource: Resource
    var CatalogId: js.UndefOr[CatalogIdString]
    var ShowAssignedLFTags: js.UndefOr[BooleanNullable]
  }

  object GetResourceLFTagsRequest {
    @inline
    def apply(
        Resource: Resource,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        ShowAssignedLFTags: js.UndefOr[BooleanNullable] = js.undefined
    ): GetResourceLFTagsRequest = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      ShowAssignedLFTags.foreach(__v => __obj.updateDynamic("ShowAssignedLFTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceLFTagsRequest]
    }
  }

  @js.native
  trait GetResourceLFTagsResponse extends js.Object {
    var LFTagOnDatabase: js.UndefOr[LFTagsList]
    var LFTagsOnColumns: js.UndefOr[ColumnLFTagsList]
    var LFTagsOnTable: js.UndefOr[LFTagsList]
  }

  object GetResourceLFTagsResponse {
    @inline
    def apply(
        LFTagOnDatabase: js.UndefOr[LFTagsList] = js.undefined,
        LFTagsOnColumns: js.UndefOr[ColumnLFTagsList] = js.undefined,
        LFTagsOnTable: js.UndefOr[LFTagsList] = js.undefined
    ): GetResourceLFTagsResponse = {
      val __obj = js.Dynamic.literal()
      LFTagOnDatabase.foreach(__v => __obj.updateDynamic("LFTagOnDatabase")(__v.asInstanceOf[js.Any]))
      LFTagsOnColumns.foreach(__v => __obj.updateDynamic("LFTagsOnColumns")(__v.asInstanceOf[js.Any]))
      LFTagsOnTable.foreach(__v => __obj.updateDynamic("LFTagsOnTable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceLFTagsResponse]
    }
  }

  @js.native
  trait GetTableObjectsRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[TokenString]
    var PartitionPredicate: js.UndefOr[PredicateString]
    var QueryAsOfTime: js.UndefOr[Timestamp]
    var TransactionId: js.UndefOr[TransactionIdString]
  }

  object GetTableObjectsRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[TokenString] = js.undefined,
        PartitionPredicate: js.UndefOr[PredicateString] = js.undefined,
        QueryAsOfTime: js.UndefOr[Timestamp] = js.undefined,
        TransactionId: js.UndefOr[TransactionIdString] = js.undefined
    ): GetTableObjectsRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PartitionPredicate.foreach(__v => __obj.updateDynamic("PartitionPredicate")(__v.asInstanceOf[js.Any]))
      QueryAsOfTime.foreach(__v => __obj.updateDynamic("QueryAsOfTime")(__v.asInstanceOf[js.Any]))
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableObjectsRequest]
    }
  }

  @js.native
  trait GetTableObjectsResponse extends js.Object {
    var NextToken: js.UndefOr[TokenString]
    var Objects: js.UndefOr[PartitionedTableObjectsList]
  }

  object GetTableObjectsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[TokenString] = js.undefined,
        Objects: js.UndefOr[PartitionedTableObjectsList] = js.undefined
    ): GetTableObjectsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Objects.foreach(__v => __obj.updateDynamic("Objects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableObjectsResponse]
    }
  }

  @js.native
  trait GetWorkUnitResultsRequest extends js.Object {
    var QueryId: GetWorkUnitResultsRequestQueryIdString
    var WorkUnitId: GetWorkUnitResultsRequestWorkUnitIdLong
    var WorkUnitToken: SyntheticGetWorkUnitResultsRequestWorkUnitTokenString
  }

  object GetWorkUnitResultsRequest {
    @inline
    def apply(
        QueryId: GetWorkUnitResultsRequestQueryIdString,
        WorkUnitId: GetWorkUnitResultsRequestWorkUnitIdLong,
        WorkUnitToken: SyntheticGetWorkUnitResultsRequestWorkUnitTokenString
    ): GetWorkUnitResultsRequest = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any],
        "WorkUnitId" -> WorkUnitId.asInstanceOf[js.Any],
        "WorkUnitToken" -> WorkUnitToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkUnitResultsRequest]
    }
  }

  /** A structure for the output.
    */
  @js.native
  trait GetWorkUnitResultsResponse extends js.Object {
    var ResultStream: js.UndefOr[ResultStream]
  }

  object GetWorkUnitResultsResponse {
    @inline
    def apply(
        ResultStream: js.UndefOr[ResultStream] = js.undefined
    ): GetWorkUnitResultsResponse = {
      val __obj = js.Dynamic.literal()
      ResultStream.foreach(__v => __obj.updateDynamic("ResultStream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkUnitResultsResponse]
    }
  }

  @js.native
  trait GetWorkUnitsRequest extends js.Object {
    var QueryId: GetWorkUnitsRequestQueryIdString
    var NextToken: js.UndefOr[Token]
    var PageSize: js.UndefOr[Int]
  }

  object GetWorkUnitsRequest {
    @inline
    def apply(
        QueryId: GetWorkUnitsRequestQueryIdString,
        NextToken: js.UndefOr[Token] = js.undefined,
        PageSize: js.UndefOr[Int] = js.undefined
    ): GetWorkUnitsRequest = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkUnitsRequest]
    }
  }

  /** A structure for the output.
    */
  @js.native
  trait GetWorkUnitsResponse extends js.Object {
    var QueryId: QueryIdString
    var WorkUnitRanges: WorkUnitRangeList
    var NextToken: js.UndefOr[Token]
  }

  object GetWorkUnitsResponse {
    @inline
    def apply(
        QueryId: QueryIdString,
        WorkUnitRanges: WorkUnitRangeList,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetWorkUnitsResponse = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any],
        "WorkUnitRanges" -> WorkUnitRanges.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkUnitsResponse]
    }
  }

  @js.native
  trait GrantPermissionsRequest extends js.Object {
    var Permissions: PermissionList
    var Principal: DataLakePrincipal
    var Resource: Resource
    var CatalogId: js.UndefOr[CatalogIdString]
    var PermissionsWithGrantOption: js.UndefOr[PermissionList]
  }

  object GrantPermissionsRequest {
    @inline
    def apply(
        Permissions: PermissionList,
        Principal: DataLakePrincipal,
        Resource: Resource,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined
    ): GrantPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "Permissions" -> Permissions.asInstanceOf[js.Any],
        "Principal" -> Principal.asInstanceOf[js.Any],
        "Resource" -> Resource.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      PermissionsWithGrantOption.foreach(__v => __obj.updateDynamic("PermissionsWithGrantOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrantPermissionsRequest]
    }
  }

  @js.native
  trait GrantPermissionsResponse extends js.Object

  object GrantPermissionsResponse {
    @inline
    def apply(): GrantPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrantPermissionsResponse]
    }
  }

  /** A structure that allows an admin to grant user permissions on certain conditions. For example, granting a role access to all columns that do not have the LF-tag 'PII' in tables that have the LF-tag 'Prod'.
    */
  @js.native
  trait LFTag extends js.Object {
    var TagKey: LFTagKey
    var TagValues: TagValueList
  }

  object LFTag {
    @inline
    def apply(
        TagKey: LFTagKey,
        TagValues: TagValueList
    ): LFTag = {
      val __obj = js.Dynamic.literal(
        "TagKey" -> TagKey.asInstanceOf[js.Any],
        "TagValues" -> TagValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LFTag]
    }
  }

  /** A structure containing an error related to a <code>TagResource</code> or <code>UnTagResource</code> operation.
    */
  @js.native
  trait LFTagError extends js.Object {
    var Error: js.UndefOr[ErrorDetail]
    var LFTag: js.UndefOr[LFTagPair]
  }

  object LFTagError {
    @inline
    def apply(
        Error: js.UndefOr[ErrorDetail] = js.undefined,
        LFTag: js.UndefOr[LFTagPair] = js.undefined
    ): LFTagError = {
      val __obj = js.Dynamic.literal()
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      LFTag.foreach(__v => __obj.updateDynamic("LFTag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LFTagError]
    }
  }

  /** A structure containing an LF-tag key and values for a resource.
    */
  @js.native
  trait LFTagKeyResource extends js.Object {
    var TagKey: NameString
    var TagValues: TagValueList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object LFTagKeyResource {
    @inline
    def apply(
        TagKey: NameString,
        TagValues: TagValueList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): LFTagKeyResource = {
      val __obj = js.Dynamic.literal(
        "TagKey" -> TagKey.asInstanceOf[js.Any],
        "TagValues" -> TagValues.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LFTagKeyResource]
    }
  }

  /** A structure containing an LF-tag key-value pair.
    */
  @js.native
  trait LFTagPair extends js.Object {
    var TagKey: LFTagKey
    var TagValues: TagValueList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object LFTagPair {
    @inline
    def apply(
        TagKey: LFTagKey,
        TagValues: TagValueList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): LFTagPair = {
      val __obj = js.Dynamic.literal(
        "TagKey" -> TagKey.asInstanceOf[js.Any],
        "TagValues" -> TagValues.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LFTagPair]
    }
  }

  /** A structure containing a list of LF-tag conditions that apply to a resource's LF-tag policy.
    */
  @js.native
  trait LFTagPolicyResource extends js.Object {
    var Expression: Expression
    var ResourceType: ResourceType
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object LFTagPolicyResource {
    @inline
    def apply(
        Expression: Expression,
        ResourceType: ResourceType,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): LFTagPolicyResource = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LFTagPolicyResource]
    }
  }

  @js.native
  trait ListDataCellsFilterRequest extends js.Object {
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var Table: js.UndefOr[TableResource]
  }

  object ListDataCellsFilterRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        Table: js.UndefOr[TableResource] = js.undefined
    ): ListDataCellsFilterRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataCellsFilterRequest]
    }
  }

  @js.native
  trait ListDataCellsFilterResponse extends js.Object {
    var DataCellsFilters: js.UndefOr[DataCellsFilterList]
    var NextToken: js.UndefOr[Token]
  }

  object ListDataCellsFilterResponse {
    @inline
    def apply(
        DataCellsFilters: js.UndefOr[DataCellsFilterList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListDataCellsFilterResponse = {
      val __obj = js.Dynamic.literal()
      DataCellsFilters.foreach(__v => __obj.updateDynamic("DataCellsFilters")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataCellsFilterResponse]
    }
  }

  @js.native
  trait ListLFTagsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var ResourceShareType: js.UndefOr[ResourceShareType]
  }

  object ListLFTagsRequest {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ResourceShareType: js.UndefOr[ResourceShareType] = js.undefined
    ): ListLFTagsRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceShareType.foreach(__v => __obj.updateDynamic("ResourceShareType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLFTagsRequest]
    }
  }

  @js.native
  trait ListLFTagsResponse extends js.Object {
    var LFTags: js.UndefOr[LFTagsList]
    var NextToken: js.UndefOr[Token]
  }

  object ListLFTagsResponse {
    @inline
    def apply(
        LFTags: js.UndefOr[LFTagsList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListLFTagsResponse = {
      val __obj = js.Dynamic.literal()
      LFTags.foreach(__v => __obj.updateDynamic("LFTags")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLFTagsResponse]
    }
  }

  @js.native
  trait ListPermissionsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var IncludeRelated: js.UndefOr[TrueFalseString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var Principal: js.UndefOr[DataLakePrincipal]
    var Resource: js.UndefOr[Resource]
    var ResourceType: js.UndefOr[DataLakeResourceType]
  }

  object ListPermissionsRequest {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        IncludeRelated: js.UndefOr[TrueFalseString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        Principal: js.UndefOr[DataLakePrincipal] = js.undefined,
        Resource: js.UndefOr[Resource] = js.undefined,
        ResourceType: js.UndefOr[DataLakeResourceType] = js.undefined
    ): ListPermissionsRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      IncludeRelated.foreach(__v => __obj.updateDynamic("IncludeRelated")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Principal.foreach(__v => __obj.updateDynamic("Principal")(__v.asInstanceOf[js.Any]))
      Resource.foreach(__v => __obj.updateDynamic("Resource")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionsRequest]
    }
  }

  @js.native
  trait ListPermissionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PrincipalResourcePermissions: js.UndefOr[PrincipalResourcePermissionsList]
  }

  object ListPermissionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        PrincipalResourcePermissions: js.UndefOr[PrincipalResourcePermissionsList] = js.undefined
    ): ListPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PrincipalResourcePermissions.foreach(__v => __obj.updateDynamic("PrincipalResourcePermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionsResponse]
    }
  }

  @js.native
  trait ListResourcesRequest extends js.Object {
    var FilterConditionList: js.UndefOr[FilterConditionList]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object ListResourcesRequest {
    @inline
    def apply(
        FilterConditionList: js.UndefOr[FilterConditionList] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListResourcesRequest = {
      val __obj = js.Dynamic.literal()
      FilterConditionList.foreach(__v => __obj.updateDynamic("FilterConditionList")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesRequest]
    }
  }

  @js.native
  trait ListResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var ResourceInfoList: js.UndefOr[ResourceInfoList]
  }

  object ListResourcesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        ResourceInfoList: js.UndefOr[ResourceInfoList] = js.undefined
    ): ListResourcesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceInfoList.foreach(__v => __obj.updateDynamic("ResourceInfoList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesResponse]
    }
  }

  @js.native
  trait ListTableStorageOptimizersRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var StorageOptimizerType: js.UndefOr[OptimizerType]
  }

  object ListTableStorageOptimizersRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        StorageOptimizerType: js.UndefOr[OptimizerType] = js.undefined
    ): ListTableStorageOptimizersRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StorageOptimizerType.foreach(__v => __obj.updateDynamic("StorageOptimizerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableStorageOptimizersRequest]
    }
  }

  @js.native
  trait ListTableStorageOptimizersResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var StorageOptimizerList: js.UndefOr[StorageOptimizerList]
  }

  object ListTableStorageOptimizersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        StorageOptimizerList: js.UndefOr[StorageOptimizerList] = js.undefined
    ): ListTableStorageOptimizersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StorageOptimizerList.foreach(__v => __obj.updateDynamic("StorageOptimizerList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableStorageOptimizersResponse]
    }
  }

  @js.native
  trait ListTransactionsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[TokenString]
    var StatusFilter: js.UndefOr[TransactionStatusFilter]
  }

  object ListTransactionsRequest {
    @inline
    def apply(
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[TokenString] = js.undefined,
        StatusFilter: js.UndefOr[TransactionStatusFilter] = js.undefined
    ): ListTransactionsRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusFilter.foreach(__v => __obj.updateDynamic("StatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTransactionsRequest]
    }
  }

  @js.native
  trait ListTransactionsResponse extends js.Object {
    var NextToken: js.UndefOr[TokenString]
    var Transactions: js.UndefOr[TransactionDescriptionList]
  }

  object ListTransactionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[TokenString] = js.undefined,
        Transactions: js.UndefOr[TransactionDescriptionList] = js.undefined
    ): ListTransactionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Transactions.foreach(__v => __obj.updateDynamic("Transactions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTransactionsResponse]
    }
  }

  /** A structure containing a list of partition values and table objects.
    */
  @js.native
  trait PartitionObjects extends js.Object {
    var Objects: js.UndefOr[TableObjectList]
    var PartitionValues: js.UndefOr[PartitionValuesList]
  }

  object PartitionObjects {
    @inline
    def apply(
        Objects: js.UndefOr[TableObjectList] = js.undefined,
        PartitionValues: js.UndefOr[PartitionValuesList] = js.undefined
    ): PartitionObjects = {
      val __obj = js.Dynamic.literal()
      Objects.foreach(__v => __obj.updateDynamic("Objects")(__v.asInstanceOf[js.Any]))
      PartitionValues.foreach(__v => __obj.updateDynamic("PartitionValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartitionObjects]
    }
  }

  /** Statistics related to the processing of a query statement.
    */
  @js.native
  trait PlanningStatistics extends js.Object {
    var EstimatedDataToScanBytes: js.UndefOr[NumberOfBytes]
    var PlanningTimeMillis: js.UndefOr[NumberOfMilliseconds]
    var QueueTimeMillis: js.UndefOr[NumberOfMilliseconds]
    var WorkUnitsGeneratedCount: js.UndefOr[NumberOfItems]
  }

  object PlanningStatistics {
    @inline
    def apply(
        EstimatedDataToScanBytes: js.UndefOr[NumberOfBytes] = js.undefined,
        PlanningTimeMillis: js.UndefOr[NumberOfMilliseconds] = js.undefined,
        QueueTimeMillis: js.UndefOr[NumberOfMilliseconds] = js.undefined,
        WorkUnitsGeneratedCount: js.UndefOr[NumberOfItems] = js.undefined
    ): PlanningStatistics = {
      val __obj = js.Dynamic.literal()
      EstimatedDataToScanBytes.foreach(__v => __obj.updateDynamic("EstimatedDataToScanBytes")(__v.asInstanceOf[js.Any]))
      PlanningTimeMillis.foreach(__v => __obj.updateDynamic("PlanningTimeMillis")(__v.asInstanceOf[js.Any]))
      QueueTimeMillis.foreach(__v => __obj.updateDynamic("QueueTimeMillis")(__v.asInstanceOf[js.Any]))
      WorkUnitsGeneratedCount.foreach(__v => __obj.updateDynamic("WorkUnitsGeneratedCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlanningStatistics]
    }
  }

  /** Permissions granted to a principal.
    */
  @js.native
  trait PrincipalPermissions extends js.Object {
    var Permissions: js.UndefOr[PermissionList]
    var Principal: js.UndefOr[DataLakePrincipal]
  }

  object PrincipalPermissions {
    @inline
    def apply(
        Permissions: js.UndefOr[PermissionList] = js.undefined,
        Principal: js.UndefOr[DataLakePrincipal] = js.undefined
    ): PrincipalPermissions = {
      val __obj = js.Dynamic.literal()
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      Principal.foreach(__v => __obj.updateDynamic("Principal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrincipalPermissions]
    }
  }

  /** The permissions granted or revoked on a resource.
    */
  @js.native
  trait PrincipalResourcePermissions extends js.Object {
    var AdditionalDetails: js.UndefOr[DetailsMap]
    var Permissions: js.UndefOr[PermissionList]
    var PermissionsWithGrantOption: js.UndefOr[PermissionList]
    var Principal: js.UndefOr[DataLakePrincipal]
    var Resource: js.UndefOr[Resource]
  }

  object PrincipalResourcePermissions {
    @inline
    def apply(
        AdditionalDetails: js.UndefOr[DetailsMap] = js.undefined,
        Permissions: js.UndefOr[PermissionList] = js.undefined,
        PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined,
        Principal: js.UndefOr[DataLakePrincipal] = js.undefined,
        Resource: js.UndefOr[Resource] = js.undefined
    ): PrincipalResourcePermissions = {
      val __obj = js.Dynamic.literal()
      AdditionalDetails.foreach(__v => __obj.updateDynamic("AdditionalDetails")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      PermissionsWithGrantOption.foreach(__v => __obj.updateDynamic("PermissionsWithGrantOption")(__v.asInstanceOf[js.Any]))
      Principal.foreach(__v => __obj.updateDynamic("Principal")(__v.asInstanceOf[js.Any]))
      Resource.foreach(__v => __obj.updateDynamic("Resource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrincipalResourcePermissions]
    }
  }

  @js.native
  trait PutDataLakeSettingsRequest extends js.Object {
    var DataLakeSettings: DataLakeSettings
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object PutDataLakeSettingsRequest {
    @inline
    def apply(
        DataLakeSettings: DataLakeSettings,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): PutDataLakeSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "DataLakeSettings" -> DataLakeSettings.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDataLakeSettingsRequest]
    }
  }

  @js.native
  trait PutDataLakeSettingsResponse extends js.Object

  object PutDataLakeSettingsResponse {
    @inline
    def apply(): PutDataLakeSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutDataLakeSettingsResponse]
    }
  }

  /** A structure containing information about the query plan.
    */
  @js.native
  trait QueryPlanningContext extends js.Object {
    var DatabaseName: QueryPlanningContextDatabaseNameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var QueryAsOfTime: js.UndefOr[Timestamp]
    var QueryParameters: js.UndefOr[QueryParameterMap]
    var TransactionId: js.UndefOr[TransactionIdString]
  }

  object QueryPlanningContext {
    @inline
    def apply(
        DatabaseName: QueryPlanningContextDatabaseNameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        QueryAsOfTime: js.UndefOr[Timestamp] = js.undefined,
        QueryParameters: js.UndefOr[QueryParameterMap] = js.undefined,
        TransactionId: js.UndefOr[TransactionIdString] = js.undefined
    ): QueryPlanningContext = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      QueryAsOfTime.foreach(__v => __obj.updateDynamic("QueryAsOfTime")(__v.asInstanceOf[js.Any]))
      QueryParameters.foreach(__v => __obj.updateDynamic("QueryParameters")(__v.asInstanceOf[js.Any]))
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryPlanningContext]
    }
  }

  @js.native
  trait RegisterResourceRequest extends js.Object {
    var ResourceArn: ResourceArnString
    var RoleArn: js.UndefOr[IAMRoleArn]
    var UseServiceLinkedRole: js.UndefOr[NullableBoolean]
  }

  object RegisterResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArnString,
        RoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        UseServiceLinkedRole: js.UndefOr[NullableBoolean] = js.undefined
    ): RegisterResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      UseServiceLinkedRole.foreach(__v => __obj.updateDynamic("UseServiceLinkedRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterResourceRequest]
    }
  }

  @js.native
  trait RegisterResourceResponse extends js.Object

  object RegisterResourceResponse {
    @inline
    def apply(): RegisterResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterResourceResponse]
    }
  }

  @js.native
  trait RemoveLFTagsFromResourceRequest extends js.Object {
    var LFTags: LFTagsList
    var Resource: Resource
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object RemoveLFTagsFromResourceRequest {
    @inline
    def apply(
        LFTags: LFTagsList,
        Resource: Resource,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): RemoveLFTagsFromResourceRequest = {
      val __obj = js.Dynamic.literal(
        "LFTags" -> LFTags.asInstanceOf[js.Any],
        "Resource" -> Resource.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveLFTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveLFTagsFromResourceResponse extends js.Object {
    var Failures: js.UndefOr[LFTagErrors]
  }

  object RemoveLFTagsFromResourceResponse {
    @inline
    def apply(
        Failures: js.UndefOr[LFTagErrors] = js.undefined
    ): RemoveLFTagsFromResourceResponse = {
      val __obj = js.Dynamic.literal()
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveLFTagsFromResourceResponse]
    }
  }

  /** A structure for the resource.
    */
  @js.native
  trait Resource extends js.Object {
    var Catalog: js.UndefOr[CatalogResource]
    var DataCellsFilter: js.UndefOr[DataCellsFilterResource]
    var DataLocation: js.UndefOr[DataLocationResource]
    var Database: js.UndefOr[DatabaseResource]
    var LFTag: js.UndefOr[LFTagKeyResource]
    var LFTagPolicy: js.UndefOr[LFTagPolicyResource]
    var Table: js.UndefOr[TableResource]
    var TableWithColumns: js.UndefOr[TableWithColumnsResource]
  }

  object Resource {
    @inline
    def apply(
        Catalog: js.UndefOr[CatalogResource] = js.undefined,
        DataCellsFilter: js.UndefOr[DataCellsFilterResource] = js.undefined,
        DataLocation: js.UndefOr[DataLocationResource] = js.undefined,
        Database: js.UndefOr[DatabaseResource] = js.undefined,
        LFTag: js.UndefOr[LFTagKeyResource] = js.undefined,
        LFTagPolicy: js.UndefOr[LFTagPolicyResource] = js.undefined,
        Table: js.UndefOr[TableResource] = js.undefined,
        TableWithColumns: js.UndefOr[TableWithColumnsResource] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      Catalog.foreach(__v => __obj.updateDynamic("Catalog")(__v.asInstanceOf[js.Any]))
      DataCellsFilter.foreach(__v => __obj.updateDynamic("DataCellsFilter")(__v.asInstanceOf[js.Any]))
      DataLocation.foreach(__v => __obj.updateDynamic("DataLocation")(__v.asInstanceOf[js.Any]))
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      LFTag.foreach(__v => __obj.updateDynamic("LFTag")(__v.asInstanceOf[js.Any]))
      LFTagPolicy.foreach(__v => __obj.updateDynamic("LFTagPolicy")(__v.asInstanceOf[js.Any]))
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
      TableWithColumns.foreach(__v => __obj.updateDynamic("TableWithColumns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** A structure containing information about an Lake Formation resource.
    */
  @js.native
  trait ResourceInfo extends js.Object {
    var LastModified: js.UndefOr[LastModifiedTimestamp]
    var ResourceArn: js.UndefOr[ResourceArnString]
    var RoleArn: js.UndefOr[IAMRoleArn]
  }

  object ResourceInfo {
    @inline
    def apply(
        LastModified: js.UndefOr[LastModifiedTimestamp] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArnString] = js.undefined,
        RoleArn: js.UndefOr[IAMRoleArn] = js.undefined
    ): ResourceInfo = {
      val __obj = js.Dynamic.literal()
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceInfo]
    }
  }

  @js.native
  trait RevokePermissionsRequest extends js.Object {
    var Permissions: PermissionList
    var Principal: DataLakePrincipal
    var Resource: Resource
    var CatalogId: js.UndefOr[CatalogIdString]
    var PermissionsWithGrantOption: js.UndefOr[PermissionList]
  }

  object RevokePermissionsRequest {
    @inline
    def apply(
        Permissions: PermissionList,
        Principal: DataLakePrincipal,
        Resource: Resource,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined
    ): RevokePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "Permissions" -> Permissions.asInstanceOf[js.Any],
        "Principal" -> Principal.asInstanceOf[js.Any],
        "Resource" -> Resource.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      PermissionsWithGrantOption.foreach(__v => __obj.updateDynamic("PermissionsWithGrantOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokePermissionsRequest]
    }
  }

  @js.native
  trait RevokePermissionsResponse extends js.Object

  object RevokePermissionsResponse {
    @inline
    def apply(): RevokePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevokePermissionsResponse]
    }
  }

  /** A PartiQL predicate.
    */
  @js.native
  trait RowFilter extends js.Object {
    var AllRowsWildcard: js.UndefOr[AllRowsWildcard]
    var FilterExpression: js.UndefOr[PredicateString]
  }

  object RowFilter {
    @inline
    def apply(
        AllRowsWildcard: js.UndefOr[AllRowsWildcard] = js.undefined,
        FilterExpression: js.UndefOr[PredicateString] = js.undefined
    ): RowFilter = {
      val __obj = js.Dynamic.literal()
      AllRowsWildcard.foreach(__v => __obj.updateDynamic("AllRowsWildcard")(__v.asInstanceOf[js.Any]))
      FilterExpression.foreach(__v => __obj.updateDynamic("FilterExpression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RowFilter]
    }
  }

  @js.native
  trait SearchDatabasesByLFTagsRequest extends js.Object {
    var Expression: Expression
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object SearchDatabasesByLFTagsRequest {
    @inline
    def apply(
        Expression: Expression,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): SearchDatabasesByLFTagsRequest = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDatabasesByLFTagsRequest]
    }
  }

  @js.native
  trait SearchDatabasesByLFTagsResponse extends js.Object {
    var DatabaseList: js.UndefOr[DatabaseLFTagsList]
    var NextToken: js.UndefOr[Token]
  }

  object SearchDatabasesByLFTagsResponse {
    @inline
    def apply(
        DatabaseList: js.UndefOr[DatabaseLFTagsList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): SearchDatabasesByLFTagsResponse = {
      val __obj = js.Dynamic.literal()
      DatabaseList.foreach(__v => __obj.updateDynamic("DatabaseList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDatabasesByLFTagsResponse]
    }
  }

  @js.native
  trait SearchTablesByLFTagsRequest extends js.Object {
    var Expression: Expression
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  object SearchTablesByLFTagsRequest {
    @inline
    def apply(
        Expression: Expression,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): SearchTablesByLFTagsRequest = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchTablesByLFTagsRequest]
    }
  }

  @js.native
  trait SearchTablesByLFTagsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var TableList: js.UndefOr[TableLFTagsList]
  }

  object SearchTablesByLFTagsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        TableList: js.UndefOr[TableLFTagsList] = js.undefined
    ): SearchTablesByLFTagsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TableList.foreach(__v => __obj.updateDynamic("TableList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchTablesByLFTagsResponse]
    }
  }

  @js.native
  trait StartQueryPlanningRequest extends js.Object {
    var QueryPlanningContext: QueryPlanningContext
    var QueryString: SyntheticStartQueryPlanningRequestQueryString
  }

  object StartQueryPlanningRequest {
    @inline
    def apply(
        QueryPlanningContext: QueryPlanningContext,
        QueryString: SyntheticStartQueryPlanningRequestQueryString
    ): StartQueryPlanningRequest = {
      val __obj = js.Dynamic.literal(
        "QueryPlanningContext" -> QueryPlanningContext.asInstanceOf[js.Any],
        "QueryString" -> QueryString.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartQueryPlanningRequest]
    }
  }

  /** A structure for the output.
    */
  @js.native
  trait StartQueryPlanningResponse extends js.Object {
    var QueryId: QueryIdString
  }

  object StartQueryPlanningResponse {
    @inline
    def apply(
        QueryId: QueryIdString
    ): StartQueryPlanningResponse = {
      val __obj = js.Dynamic.literal(
        "QueryId" -> QueryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartQueryPlanningResponse]
    }
  }

  @js.native
  trait StartTransactionRequest extends js.Object {
    var TransactionType: js.UndefOr[TransactionType]
  }

  object StartTransactionRequest {
    @inline
    def apply(
        TransactionType: js.UndefOr[TransactionType] = js.undefined
    ): StartTransactionRequest = {
      val __obj = js.Dynamic.literal()
      TransactionType.foreach(__v => __obj.updateDynamic("TransactionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTransactionRequest]
    }
  }

  @js.native
  trait StartTransactionResponse extends js.Object {
    var TransactionId: js.UndefOr[TransactionIdString]
  }

  object StartTransactionResponse {
    @inline
    def apply(
        TransactionId: js.UndefOr[TransactionIdString] = js.undefined
    ): StartTransactionResponse = {
      val __obj = js.Dynamic.literal()
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTransactionResponse]
    }
  }

  /** A structure describing the configuration and details of a storage optimizer.
    */
  @js.native
  trait StorageOptimizer extends js.Object {
    var Config: js.UndefOr[StorageOptimizerConfig]
    var ErrorMessage: js.UndefOr[MessageString]
    var LastRunDetails: js.UndefOr[MessageString]
    var StorageOptimizerType: js.UndefOr[OptimizerType]
    var Warnings: js.UndefOr[MessageString]
  }

  object StorageOptimizer {
    @inline
    def apply(
        Config: js.UndefOr[StorageOptimizerConfig] = js.undefined,
        ErrorMessage: js.UndefOr[MessageString] = js.undefined,
        LastRunDetails: js.UndefOr[MessageString] = js.undefined,
        StorageOptimizerType: js.UndefOr[OptimizerType] = js.undefined,
        Warnings: js.UndefOr[MessageString] = js.undefined
    ): StorageOptimizer = {
      val __obj = js.Dynamic.literal()
      Config.foreach(__v => __obj.updateDynamic("Config")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      LastRunDetails.foreach(__v => __obj.updateDynamic("LastRunDetails")(__v.asInstanceOf[js.Any]))
      StorageOptimizerType.foreach(__v => __obj.updateDynamic("StorageOptimizerType")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageOptimizer]
    }
  }

  /** Specifies the details of a governed table.
    */
  @js.native
  trait TableObject extends js.Object {
    var ETag: js.UndefOr[ETagString]
    var Size: js.UndefOr[ObjectSize]
    var Uri: js.UndefOr[URI]
  }

  object TableObject {
    @inline
    def apply(
        ETag: js.UndefOr[ETagString] = js.undefined,
        Size: js.UndefOr[ObjectSize] = js.undefined,
        Uri: js.UndefOr[URI] = js.undefined
    ): TableObject = {
      val __obj = js.Dynamic.literal()
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      Uri.foreach(__v => __obj.updateDynamic("Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableObject]
    }
  }

  /** A structure for the table object. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal.
    */
  @js.native
  trait TableResource extends js.Object {
    var DatabaseName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var Name: js.UndefOr[NameString]
    var TableWildcard: js.UndefOr[TableWildcard]
  }

  object TableResource {
    @inline
    def apply(
        DatabaseName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        TableWildcard: js.UndefOr[TableWildcard] = js.undefined
    ): TableResource = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TableWildcard.foreach(__v => __obj.updateDynamic("TableWildcard")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableResource]
    }
  }

  /** A wildcard object representing every table under a database.
    */
  @js.native
  trait TableWildcard extends js.Object

  object TableWildcard {
    @inline
    def apply(): TableWildcard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableWildcard]
    }
  }

  /** A structure for a table with columns object. This object is only used when granting a SELECT permission. This object must take a value for at least one of <code>ColumnsNames</code>, <code>ColumnsIndexes</code>, or <code>ColumnsWildcard</code>.
    */
  @js.native
  trait TableWithColumnsResource extends js.Object {
    var DatabaseName: NameString
    var Name: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
    var ColumnNames: js.UndefOr[ColumnNames]
    var ColumnWildcard: js.UndefOr[ColumnWildcard]
  }

  object TableWithColumnsResource {
    @inline
    def apply(
        DatabaseName: NameString,
        Name: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        ColumnNames: js.UndefOr[ColumnNames] = js.undefined,
        ColumnWildcard: js.UndefOr[ColumnWildcard] = js.undefined
    ): TableWithColumnsResource = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      ColumnNames.foreach(__v => __obj.updateDynamic("ColumnNames")(__v.asInstanceOf[js.Any]))
      ColumnWildcard.foreach(__v => __obj.updateDynamic("ColumnWildcard")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableWithColumnsResource]
    }
  }

  /** A structure describing a database resource with LF-tags.
    */
  @js.native
  trait TaggedDatabase extends js.Object {
    var Database: js.UndefOr[DatabaseResource]
    var LFTags: js.UndefOr[LFTagsList]
  }

  object TaggedDatabase {
    @inline
    def apply(
        Database: js.UndefOr[DatabaseResource] = js.undefined,
        LFTags: js.UndefOr[LFTagsList] = js.undefined
    ): TaggedDatabase = {
      val __obj = js.Dynamic.literal()
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      LFTags.foreach(__v => __obj.updateDynamic("LFTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaggedDatabase]
    }
  }

  /** A structure describing a table resource with LF-tags.
    */
  @js.native
  trait TaggedTable extends js.Object {
    var LFTagOnDatabase: js.UndefOr[LFTagsList]
    var LFTagsOnColumns: js.UndefOr[ColumnLFTagsList]
    var LFTagsOnTable: js.UndefOr[LFTagsList]
    var Table: js.UndefOr[TableResource]
  }

  object TaggedTable {
    @inline
    def apply(
        LFTagOnDatabase: js.UndefOr[LFTagsList] = js.undefined,
        LFTagsOnColumns: js.UndefOr[ColumnLFTagsList] = js.undefined,
        LFTagsOnTable: js.UndefOr[LFTagsList] = js.undefined,
        Table: js.UndefOr[TableResource] = js.undefined
    ): TaggedTable = {
      val __obj = js.Dynamic.literal()
      LFTagOnDatabase.foreach(__v => __obj.updateDynamic("LFTagOnDatabase")(__v.asInstanceOf[js.Any]))
      LFTagsOnColumns.foreach(__v => __obj.updateDynamic("LFTagsOnColumns")(__v.asInstanceOf[js.Any]))
      LFTagsOnTable.foreach(__v => __obj.updateDynamic("LFTagsOnTable")(__v.asInstanceOf[js.Any]))
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaggedTable]
    }
  }

  /** A structure that contains information about a transaction.
    */
  @js.native
  trait TransactionDescription extends js.Object {
    var TransactionEndTime: js.UndefOr[Timestamp]
    var TransactionId: js.UndefOr[TransactionIdString]
    var TransactionStartTime: js.UndefOr[Timestamp]
    var TransactionStatus: js.UndefOr[TransactionStatus]
  }

  object TransactionDescription {
    @inline
    def apply(
        TransactionEndTime: js.UndefOr[Timestamp] = js.undefined,
        TransactionId: js.UndefOr[TransactionIdString] = js.undefined,
        TransactionStartTime: js.UndefOr[Timestamp] = js.undefined,
        TransactionStatus: js.UndefOr[TransactionStatus] = js.undefined
    ): TransactionDescription = {
      val __obj = js.Dynamic.literal()
      TransactionEndTime.foreach(__v => __obj.updateDynamic("TransactionEndTime")(__v.asInstanceOf[js.Any]))
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      TransactionStartTime.foreach(__v => __obj.updateDynamic("TransactionStartTime")(__v.asInstanceOf[js.Any]))
      TransactionStatus.foreach(__v => __obj.updateDynamic("TransactionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransactionDescription]
    }
  }

  @js.native
  trait UpdateLFTagRequest extends js.Object {
    var TagKey: LFTagKey
    var CatalogId: js.UndefOr[CatalogIdString]
    var TagValuesToAdd: js.UndefOr[TagValueList]
    var TagValuesToDelete: js.UndefOr[TagValueList]
  }

  object UpdateLFTagRequest {
    @inline
    def apply(
        TagKey: LFTagKey,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined,
        TagValuesToAdd: js.UndefOr[TagValueList] = js.undefined,
        TagValuesToDelete: js.UndefOr[TagValueList] = js.undefined
    ): UpdateLFTagRequest = {
      val __obj = js.Dynamic.literal(
        "TagKey" -> TagKey.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      TagValuesToAdd.foreach(__v => __obj.updateDynamic("TagValuesToAdd")(__v.asInstanceOf[js.Any]))
      TagValuesToDelete.foreach(__v => __obj.updateDynamic("TagValuesToDelete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLFTagRequest]
    }
  }

  @js.native
  trait UpdateLFTagResponse extends js.Object

  object UpdateLFTagResponse {
    @inline
    def apply(): UpdateLFTagResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLFTagResponse]
    }
  }

  @js.native
  trait UpdateResourceRequest extends js.Object {
    var ResourceArn: ResourceArnString
    var RoleArn: IAMRoleArn
  }

  object UpdateResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArnString,
        RoleArn: IAMRoleArn
    ): UpdateResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateResourceRequest]
    }
  }

  @js.native
  trait UpdateResourceResponse extends js.Object

  object UpdateResourceResponse {
    @inline
    def apply(): UpdateResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResourceResponse]
    }
  }

  @js.native
  trait UpdateTableObjectsRequest extends js.Object {
    var DatabaseName: NameString
    var TableName: NameString
    var TransactionId: TransactionIdString
    var WriteOperations: WriteOperationList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object UpdateTableObjectsRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        TableName: NameString,
        TransactionId: TransactionIdString,
        WriteOperations: WriteOperationList,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateTableObjectsRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "TransactionId" -> TransactionId.asInstanceOf[js.Any],
        "WriteOperations" -> WriteOperations.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTableObjectsRequest]
    }
  }

  @js.native
  trait UpdateTableObjectsResponse extends js.Object

  object UpdateTableObjectsResponse {
    @inline
    def apply(): UpdateTableObjectsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTableObjectsResponse]
    }
  }

  @js.native
  trait UpdateTableStorageOptimizerRequest extends js.Object {
    var DatabaseName: NameString
    var StorageOptimizerConfig: StorageOptimizerConfigMap
    var TableName: NameString
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  object UpdateTableStorageOptimizerRequest {
    @inline
    def apply(
        DatabaseName: NameString,
        StorageOptimizerConfig: StorageOptimizerConfigMap,
        TableName: NameString,
        CatalogId: js.UndefOr[CatalogIdString] = js.undefined
    ): UpdateTableStorageOptimizerRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "StorageOptimizerConfig" -> StorageOptimizerConfig.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTableStorageOptimizerRequest]
    }
  }

  @js.native
  trait UpdateTableStorageOptimizerResponse extends js.Object {
    var Result: js.UndefOr[Result]
  }

  object UpdateTableStorageOptimizerResponse {
    @inline
    def apply(
        Result: js.UndefOr[Result] = js.undefined
    ): UpdateTableStorageOptimizerResponse = {
      val __obj = js.Dynamic.literal()
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTableStorageOptimizerResponse]
    }
  }

  /** An object that defines an Amazon S3 object to be deleted if a transaction cancels, provided that <code>VirtualPut</code> was called before writing the object.
    */
  @js.native
  trait VirtualObject extends js.Object {
    var Uri: URI
    var ETag: js.UndefOr[ETagString]
  }

  object VirtualObject {
    @inline
    def apply(
        Uri: URI,
        ETag: js.UndefOr[ETagString] = js.undefined
    ): VirtualObject = {
      val __obj = js.Dynamic.literal(
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualObject]
    }
  }

  /** Defines the valid range of work unit IDs for querying the execution service.
    */
  @js.native
  trait WorkUnitRange extends js.Object {
    var WorkUnitIdMax: WorkUnitIdLong
    var WorkUnitIdMin: WorkUnitIdLong
    var WorkUnitToken: WorkUnitTokenString
  }

  object WorkUnitRange {
    @inline
    def apply(
        WorkUnitIdMax: WorkUnitIdLong,
        WorkUnitIdMin: WorkUnitIdLong,
        WorkUnitToken: WorkUnitTokenString
    ): WorkUnitRange = {
      val __obj = js.Dynamic.literal(
        "WorkUnitIdMax" -> WorkUnitIdMax.asInstanceOf[js.Any],
        "WorkUnitIdMin" -> WorkUnitIdMin.asInstanceOf[js.Any],
        "WorkUnitToken" -> WorkUnitToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WorkUnitRange]
    }
  }

  /** Defines an object to add to or delete from a governed table.
    */
  @js.native
  trait WriteOperation extends js.Object {
    var AddObject: js.UndefOr[AddObjectInput]
    var DeleteObject: js.UndefOr[DeleteObjectInput]
  }

  object WriteOperation {
    @inline
    def apply(
        AddObject: js.UndefOr[AddObjectInput] = js.undefined,
        DeleteObject: js.UndefOr[DeleteObjectInput] = js.undefined
    ): WriteOperation = {
      val __obj = js.Dynamic.literal()
      AddObject.foreach(__v => __obj.updateDynamic("AddObject")(__v.asInstanceOf[js.Any]))
      DeleteObject.foreach(__v => __obj.updateDynamic("DeleteObject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteOperation]
    }
  }
}
