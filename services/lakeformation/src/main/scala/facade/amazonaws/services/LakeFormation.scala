package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object lakeformation {
  type BatchPermissionsFailureList      = js.Array[BatchPermissionsFailureEntry]
  type BatchPermissionsRequestEntryList = js.Array[BatchPermissionsRequestEntry]
  type CatalogIdString                  = String
  type ColumnNames                      = js.Array[NameString]
  type DataLakePrincipalList            = js.Array[DataLakePrincipal]
  type DataLakePrincipalString          = String
  type DescriptionString                = String
  type FilterConditionList              = js.Array[FilterCondition]
  type IAMRoleArn                       = String
  type Identifier                       = String
  type LastModifiedTimestamp            = js.Date
  type NameString                       = String
  type NullableBoolean                  = Boolean
  type PageSize                         = Int
  type PermissionList                   = js.Array[Permission]
  type PrincipalPermissionsList         = js.Array[PrincipalPermissions]
  type PrincipalResourcePermissionsList = js.Array[PrincipalResourcePermissions]
  type ResourceArnString                = String
  type ResourceInfoList                 = js.Array[ResourceInfo]
  type StringValue                      = String
  type StringValueList                  = js.Array[StringValue]
  type Token                            = String

  implicit final class LakeFormationOps(private val service: LakeFormation) extends AnyVal {

    @inline def batchGrantPermissionsFuture(
        params: BatchGrantPermissionsRequest
    ): Future[BatchGrantPermissionsResponse] = service.batchGrantPermissions(params).promise().toFuture
    @inline def batchRevokePermissionsFuture(
        params: BatchRevokePermissionsRequest
    ): Future[BatchRevokePermissionsResponse] = service.batchRevokePermissions(params).promise().toFuture
    @inline def deregisterResourceFuture(params: DeregisterResourceRequest): Future[DeregisterResourceResponse] =
      service.deregisterResource(params).promise().toFuture
    @inline def describeResourceFuture(params: DescribeResourceRequest): Future[DescribeResourceResponse] =
      service.describeResource(params).promise().toFuture
    @inline def getDataLakeSettingsFuture(params: GetDataLakeSettingsRequest): Future[GetDataLakeSettingsResponse] =
      service.getDataLakeSettings(params).promise().toFuture
    @inline def getEffectivePermissionsForPathFuture(
        params: GetEffectivePermissionsForPathRequest
    ): Future[GetEffectivePermissionsForPathResponse] =
      service.getEffectivePermissionsForPath(params).promise().toFuture
    @inline def grantPermissionsFuture(params: GrantPermissionsRequest): Future[GrantPermissionsResponse] =
      service.grantPermissions(params).promise().toFuture
    @inline def listPermissionsFuture(params: ListPermissionsRequest): Future[ListPermissionsResponse] =
      service.listPermissions(params).promise().toFuture
    @inline def listResourcesFuture(params: ListResourcesRequest): Future[ListResourcesResponse] =
      service.listResources(params).promise().toFuture
    @inline def putDataLakeSettingsFuture(params: PutDataLakeSettingsRequest): Future[PutDataLakeSettingsResponse] =
      service.putDataLakeSettings(params).promise().toFuture
    @inline def registerResourceFuture(params: RegisterResourceRequest): Future[RegisterResourceResponse] =
      service.registerResource(params).promise().toFuture
    @inline def revokePermissionsFuture(params: RevokePermissionsRequest): Future[RevokePermissionsResponse] =
      service.revokePermissions(params).promise().toFuture
    @inline def updateResourceFuture(params: UpdateResourceRequest): Future[UpdateResourceResponse] =
      service.updateResource(params).promise().toFuture
  }
}

package lakeformation {
  @js.native
  @JSImport("aws-sdk", "LakeFormation")
  class LakeFormation() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGrantPermissions(params: BatchGrantPermissionsRequest): Request[BatchGrantPermissionsResponse] = js.native
    def batchRevokePermissions(params: BatchRevokePermissionsRequest): Request[BatchRevokePermissionsResponse] =
      js.native
    def deregisterResource(params: DeregisterResourceRequest): Request[DeregisterResourceResponse]    = js.native
    def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse]          = js.native
    def getDataLakeSettings(params: GetDataLakeSettingsRequest): Request[GetDataLakeSettingsResponse] = js.native
    def getEffectivePermissionsForPath(
        params: GetEffectivePermissionsForPathRequest
    ): Request[GetEffectivePermissionsForPathResponse]                                                = js.native
    def grantPermissions(params: GrantPermissionsRequest): Request[GrantPermissionsResponse]          = js.native
    def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse]             = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse]                   = js.native
    def putDataLakeSettings(params: PutDataLakeSettingsRequest): Request[PutDataLakeSettingsResponse] = js.native
    def registerResource(params: RegisterResourceRequest): Request[RegisterResourceResponse]          = js.native
    def revokePermissions(params: RevokePermissionsRequest): Request[RevokePermissionsResponse]       = js.native
    def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse]                = js.native
  }

  @js.native
  @Factory
  trait BatchGrantPermissionsRequest extends js.Object {
    var Entries: BatchPermissionsRequestEntryList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait BatchGrantPermissionsResponse extends js.Object {
    var Failures: js.UndefOr[BatchPermissionsFailureList]
  }

  /**
    * A list of failures when performing a batch grant or batch revoke operation.
    */
  @js.native
  @Factory
  trait BatchPermissionsFailureEntry extends js.Object {
    var Error: js.UndefOr[ErrorDetail]
    var RequestEntry: js.UndefOr[BatchPermissionsRequestEntry]
  }

  /**
    * A permission to a resource granted by batch operation to the principal.
    */
  @js.native
  @Factory
  trait BatchPermissionsRequestEntry extends js.Object {
    var Id: Identifier
    var Permissions: js.UndefOr[PermissionList]
    var PermissionsWithGrantOption: js.UndefOr[PermissionList]
    var Principal: js.UndefOr[DataLakePrincipal]
    var Resource: js.UndefOr[Resource]
  }

  @js.native
  @Factory
  trait BatchRevokePermissionsRequest extends js.Object {
    var Entries: BatchPermissionsRequestEntryList
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait BatchRevokePermissionsResponse extends js.Object {
    var Failures: js.UndefOr[BatchPermissionsFailureList]
  }

  /**
    * A structure for the catalog object.
    */
  @js.native
  @Factory
  trait CatalogResource extends js.Object {}

  /**
    * A wildcard object, consisting of an optional list of excluded column names or indexes.
    */
  @js.native
  @Factory
  trait ColumnWildcard extends js.Object {
    var ExcludedColumnNames: js.UndefOr[ColumnNames]
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val EQ           = "EQ".asInstanceOf[ComparisonOperator]
    val NE           = "NE".asInstanceOf[ComparisonOperator]
    val LE           = "LE".asInstanceOf[ComparisonOperator]
    val LT           = "LT".asInstanceOf[ComparisonOperator]
    val GE           = "GE".asInstanceOf[ComparisonOperator]
    val GT           = "GT".asInstanceOf[ComparisonOperator]
    val CONTAINS     = "CONTAINS".asInstanceOf[ComparisonOperator]
    val NOT_CONTAINS = "NOT_CONTAINS".asInstanceOf[ComparisonOperator]
    val BEGINS_WITH  = "BEGINS_WITH".asInstanceOf[ComparisonOperator]
    val IN           = "IN".asInstanceOf[ComparisonOperator]
    val BETWEEN      = "BETWEEN".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(js.Array(EQ, NE, LE, LT, GE, GT, CONTAINS, NOT_CONTAINS, BEGINS_WITH, IN, BETWEEN))
  }

  /**
    * The AWS Lake Formation principal.
    */
  @js.native
  @Factory
  trait DataLakePrincipal extends js.Object {
    var DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString]
  }

  @js.native
  sealed trait DataLakeResourceType extends js.Any
  object DataLakeResourceType extends js.Object {
    val CATALOG       = "CATALOG".asInstanceOf[DataLakeResourceType]
    val DATABASE      = "DATABASE".asInstanceOf[DataLakeResourceType]
    val TABLE         = "TABLE".asInstanceOf[DataLakeResourceType]
    val DATA_LOCATION = "DATA_LOCATION".asInstanceOf[DataLakeResourceType]

    val values = js.Object.freeze(js.Array(CATALOG, DATABASE, TABLE, DATA_LOCATION))
  }

  /**
    * The AWS Lake Formation principal.
    */
  @js.native
  @Factory
  trait DataLakeSettings extends js.Object {
    var CreateDatabaseDefaultPermissions: js.UndefOr[PrincipalPermissionsList]
    var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList]
    var DataLakeAdmins: js.UndefOr[DataLakePrincipalList]
  }

  /**
    * A structure for a data location object where permissions are granted or revoked.
    */
  @js.native
  @Factory
  trait DataLocationResource extends js.Object {
    var ResourceArn: ResourceArnString
  }

  /**
    * A structure for the database object.
    */
  @js.native
  @Factory
  trait DatabaseResource extends js.Object {
    var Name: NameString
  }

  @js.native
  @Factory
  trait DeregisterResourceRequest extends js.Object {
    var ResourceArn: ResourceArnString
  }

  @js.native
  @Factory
  trait DeregisterResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeResourceRequest extends js.Object {
    var ResourceArn: ResourceArnString
  }

  @js.native
  @Factory
  trait DescribeResourceResponse extends js.Object {
    var ResourceInfo: js.UndefOr[ResourceInfo]
  }

  /**
    * Contains details about an error.
    */
  @js.native
  @Factory
  trait ErrorDetail extends js.Object {
    var ErrorCode: js.UndefOr[NameString]
    var ErrorMessage: js.UndefOr[DescriptionString]
  }

  @js.native
  sealed trait FieldNameString extends js.Any
  object FieldNameString extends js.Object {
    val RESOURCE_ARN  = "RESOURCE_ARN".asInstanceOf[FieldNameString]
    val ROLE_ARN      = "ROLE_ARN".asInstanceOf[FieldNameString]
    val LAST_MODIFIED = "LAST_MODIFIED".asInstanceOf[FieldNameString]

    val values = js.Object.freeze(js.Array(RESOURCE_ARN, ROLE_ARN, LAST_MODIFIED))
  }

  /**
    * This structure describes the filtering of columns in a table based on a filter condition.
    */
  @js.native
  @Factory
  trait FilterCondition extends js.Object {
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var Field: js.UndefOr[FieldNameString]
    var StringValueList: js.UndefOr[StringValueList]
  }

  @js.native
  @Factory
  trait GetDataLakeSettingsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait GetDataLakeSettingsResponse extends js.Object {
    var DataLakeSettings: js.UndefOr[DataLakeSettings]
  }

  @js.native
  @Factory
  trait GetEffectivePermissionsForPathRequest extends js.Object {
    var ResourceArn: ResourceArnString
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetEffectivePermissionsForPathResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Permissions: js.UndefOr[PrincipalResourcePermissionsList]
  }

  @js.native
  @Factory
  trait GrantPermissionsRequest extends js.Object {
    var Permissions: PermissionList
    var Principal: DataLakePrincipal
    var Resource: Resource
    var CatalogId: js.UndefOr[CatalogIdString]
    var PermissionsWithGrantOption: js.UndefOr[PermissionList]
  }

  @js.native
  @Factory
  trait GrantPermissionsResponse extends js.Object {}

  @js.native
  @Factory
  trait ListPermissionsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
    var Principal: js.UndefOr[DataLakePrincipal]
    var Resource: js.UndefOr[Resource]
    var ResourceType: js.UndefOr[DataLakeResourceType]
  }

  @js.native
  @Factory
  trait ListPermissionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PrincipalResourcePermissions: js.UndefOr[PrincipalResourcePermissionsList]
  }

  @js.native
  @Factory
  trait ListResourcesRequest extends js.Object {
    var FilterConditionList: js.UndefOr[FilterConditionList]
    var MaxResults: js.UndefOr[PageSize]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var ResourceInfoList: js.UndefOr[ResourceInfoList]
  }

  @js.native
  sealed trait Permission extends js.Any
  object Permission extends js.Object {
    val ALL                  = "ALL".asInstanceOf[Permission]
    val SELECT               = "SELECT".asInstanceOf[Permission]
    val ALTER                = "ALTER".asInstanceOf[Permission]
    val DROP                 = "DROP".asInstanceOf[Permission]
    val DELETE               = "DELETE".asInstanceOf[Permission]
    val INSERT               = "INSERT".asInstanceOf[Permission]
    val CREATE_DATABASE      = "CREATE_DATABASE".asInstanceOf[Permission]
    val CREATE_TABLE         = "CREATE_TABLE".asInstanceOf[Permission]
    val DATA_LOCATION_ACCESS = "DATA_LOCATION_ACCESS".asInstanceOf[Permission]

    val values = js.Object.freeze(
      js.Array(ALL, SELECT, ALTER, DROP, DELETE, INSERT, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
    )
  }

  /**
    * Permissions granted to a principal.
    */
  @js.native
  @Factory
  trait PrincipalPermissions extends js.Object {
    var Permissions: js.UndefOr[PermissionList]
    var Principal: js.UndefOr[DataLakePrincipal]
  }

  /**
    * The permissions granted or revoked on a resource.
    */
  @js.native
  @Factory
  trait PrincipalResourcePermissions extends js.Object {
    var Permissions: js.UndefOr[PermissionList]
    var PermissionsWithGrantOption: js.UndefOr[PermissionList]
    var Principal: js.UndefOr[DataLakePrincipal]
    var Resource: js.UndefOr[Resource]
  }

  @js.native
  @Factory
  trait PutDataLakeSettingsRequest extends js.Object {
    var DataLakeSettings: DataLakeSettings
    var CatalogId: js.UndefOr[CatalogIdString]
  }

  @js.native
  @Factory
  trait PutDataLakeSettingsResponse extends js.Object {}

  @js.native
  @Factory
  trait RegisterResourceRequest extends js.Object {
    var ResourceArn: ResourceArnString
    var RoleArn: js.UndefOr[IAMRoleArn]
    var UseServiceLinkedRole: js.UndefOr[NullableBoolean]
  }

  @js.native
  @Factory
  trait RegisterResourceResponse extends js.Object {}

  /**
    * A structure for the resource.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var Catalog: js.UndefOr[CatalogResource]
    var DataLocation: js.UndefOr[DataLocationResource]
    var Database: js.UndefOr[DatabaseResource]
    var Table: js.UndefOr[TableResource]
    var TableWithColumns: js.UndefOr[TableWithColumnsResource]
  }

  /**
    * A structure containing information about an AWS Lake Formation resource.
    */
  @js.native
  @Factory
  trait ResourceInfo extends js.Object {
    var LastModified: js.UndefOr[LastModifiedTimestamp]
    var ResourceArn: js.UndefOr[ResourceArnString]
    var RoleArn: js.UndefOr[IAMRoleArn]
  }

  @js.native
  @Factory
  trait RevokePermissionsRequest extends js.Object {
    var Permissions: PermissionList
    var Principal: DataLakePrincipal
    var Resource: Resource
    var CatalogId: js.UndefOr[CatalogIdString]
    var PermissionsWithGrantOption: js.UndefOr[PermissionList]
  }

  @js.native
  @Factory
  trait RevokePermissionsResponse extends js.Object {}

  /**
    * A structure for the table object. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal.
    */
  @js.native
  @Factory
  trait TableResource extends js.Object {
    var DatabaseName: NameString
    var Name: NameString
  }

  /**
    * A structure for a table with columns object. This object is only used when granting a SELECT permission.
    *  This object must take a value for at least one of <code>ColumnsNames</code>, <code>ColumnsIndexes</code>, or <code>ColumnsWildcard</code>.
    */
  @js.native
  @Factory
  trait TableWithColumnsResource extends js.Object {
    var ColumnNames: js.UndefOr[ColumnNames]
    var ColumnWildcard: js.UndefOr[ColumnWildcard]
    var DatabaseName: js.UndefOr[NameString]
    var Name: js.UndefOr[NameString]
  }

  @js.native
  @Factory
  trait UpdateResourceRequest extends js.Object {
    var ResourceArn: ResourceArnString
    var RoleArn: IAMRoleArn
  }

  @js.native
  @Factory
  trait UpdateResourceResponse extends js.Object {}
}
