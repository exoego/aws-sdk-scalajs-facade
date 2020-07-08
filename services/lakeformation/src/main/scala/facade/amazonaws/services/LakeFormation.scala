package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object lakeformation {
  type BatchPermissionsFailureList = js.Array[BatchPermissionsFailureEntry]
  type BatchPermissionsRequestEntryList = js.Array[BatchPermissionsRequestEntry]
  type CatalogIdString = String
  type ColumnNames = js.Array[NameString]
  type DataLakePrincipalList = js.Array[DataLakePrincipal]
  type DataLakePrincipalString = String
  type DescriptionString = String
  type FilterConditionList = js.Array[FilterCondition]
  type IAMRoleArn = String
  type Identifier = String
  type LastModifiedTimestamp = js.Date
  type NameString = String
  type NullableBoolean = Boolean
  type PageSize = Int
  type PermissionList = js.Array[Permission]
  type PrincipalPermissionsList = js.Array[PrincipalPermissions]
  type PrincipalResourcePermissionsList = js.Array[PrincipalResourcePermissions]
  type ResourceArnString = String
  type ResourceInfoList = js.Array[ResourceInfo]
  type StringValue = String
  type StringValueList = js.Array[StringValue]
  type Token = String
  type TrustedResourceOwners = js.Array[CatalogIdString]

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
    def deregisterResource(params: DeregisterResourceRequest): Request[DeregisterResourceResponse] = js.native
    def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse] = js.native
    def getDataLakeSettings(params: GetDataLakeSettingsRequest): Request[GetDataLakeSettingsResponse] = js.native
    def getEffectivePermissionsForPath(
        params: GetEffectivePermissionsForPathRequest
    ): Request[GetEffectivePermissionsForPathResponse] = js.native
    def grantPermissions(params: GrantPermissionsRequest): Request[GrantPermissionsResponse] = js.native
    def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse] = js.native
    def listResources(params: ListResourcesRequest): Request[ListResourcesResponse] = js.native
    def putDataLakeSettings(params: PutDataLakeSettingsRequest): Request[PutDataLakeSettingsResponse] = js.native
    def registerResource(params: RegisterResourceRequest): Request[RegisterResourceResponse] = js.native
    def revokePermissions(params: RevokePermissionsRequest): Request[RevokePermissionsResponse] = js.native
    def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse] = js.native
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

  /**
    * A list of failures when performing a batch grant or batch revoke operation.
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

  /**
    * A permission to a resource granted by batch operation to the principal.
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
      PermissionsWithGrantOption.foreach(__v =>
        __obj.updateDynamic("PermissionsWithGrantOption")(__v.asInstanceOf[js.Any])
      )
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

  /**
    * A structure for the catalog object.
    */
  @js.native
  trait CatalogResource extends js.Object {}

  object CatalogResource {
    @inline
    def apply(
    ): CatalogResource = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CatalogResource]
    }
  }

  /**
    * A wildcard object, consisting of an optional list of excluded column names or indexes.
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
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val EQ = "EQ".asInstanceOf[ComparisonOperator]
    val NE = "NE".asInstanceOf[ComparisonOperator]
    val LE = "LE".asInstanceOf[ComparisonOperator]
    val LT = "LT".asInstanceOf[ComparisonOperator]
    val GE = "GE".asInstanceOf[ComparisonOperator]
    val GT = "GT".asInstanceOf[ComparisonOperator]
    val CONTAINS = "CONTAINS".asInstanceOf[ComparisonOperator]
    val NOT_CONTAINS = "NOT_CONTAINS".asInstanceOf[ComparisonOperator]
    val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[ComparisonOperator]
    val IN = "IN".asInstanceOf[ComparisonOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(js.Array(EQ, NE, LE, LT, GE, GT, CONTAINS, NOT_CONTAINS, BEGINS_WITH, IN, BETWEEN))
  }

  /**
    * The AWS Lake Formation principal. Supported principals are IAM users or IAM roles.
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
      DataLakePrincipalIdentifier.foreach(__v =>
        __obj.updateDynamic("DataLakePrincipalIdentifier")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DataLakePrincipal]
    }
  }

  @js.native
  sealed trait DataLakeResourceType extends js.Any
  object DataLakeResourceType extends js.Object {
    val CATALOG = "CATALOG".asInstanceOf[DataLakeResourceType]
    val DATABASE = "DATABASE".asInstanceOf[DataLakeResourceType]
    val TABLE = "TABLE".asInstanceOf[DataLakeResourceType]
    val DATA_LOCATION = "DATA_LOCATION".asInstanceOf[DataLakeResourceType]

    val values = js.Object.freeze(js.Array(CATALOG, DATABASE, TABLE, DATA_LOCATION))
  }

  /**
    * A structure representing a list of AWS Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
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
      CreateDatabaseDefaultPermissions.foreach(__v =>
        __obj.updateDynamic("CreateDatabaseDefaultPermissions")(__v.asInstanceOf[js.Any])
      )
      CreateTableDefaultPermissions.foreach(__v =>
        __obj.updateDynamic("CreateTableDefaultPermissions")(__v.asInstanceOf[js.Any])
      )
      DataLakeAdmins.foreach(__v => __obj.updateDynamic("DataLakeAdmins")(__v.asInstanceOf[js.Any]))
      TrustedResourceOwners.foreach(__v => __obj.updateDynamic("TrustedResourceOwners")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataLakeSettings]
    }
  }

  /**
    * A structure for a data location object where permissions are granted or revoked.
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

  /**
    * A structure for the database object.
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
  trait DeregisterResourceResponse extends js.Object {}

  object DeregisterResourceResponse {
    @inline
    def apply(
    ): DeregisterResourceResponse = {
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

  /**
    * Contains details about an error.
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

  @js.native
  sealed trait FieldNameString extends js.Any
  object FieldNameString extends js.Object {
    val RESOURCE_ARN = "RESOURCE_ARN".asInstanceOf[FieldNameString]
    val ROLE_ARN = "ROLE_ARN".asInstanceOf[FieldNameString]
    val LAST_MODIFIED = "LAST_MODIFIED".asInstanceOf[FieldNameString]

    val values = js.Object.freeze(js.Array(RESOURCE_ARN, ROLE_ARN, LAST_MODIFIED))
  }

  /**
    * This structure describes the filtering of columns in a table based on a filter condition.
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
      PermissionsWithGrantOption.foreach(__v =>
        __obj.updateDynamic("PermissionsWithGrantOption")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GrantPermissionsRequest]
    }
  }

  @js.native
  trait GrantPermissionsResponse extends js.Object {}

  object GrantPermissionsResponse {
    @inline
    def apply(
    ): GrantPermissionsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GrantPermissionsResponse]
    }
  }

  @js.native
  trait ListPermissionsRequest extends js.Object {
    var CatalogId: js.UndefOr[CatalogIdString]
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
        MaxResults: js.UndefOr[PageSize] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        Principal: js.UndefOr[DataLakePrincipal] = js.undefined,
        Resource: js.UndefOr[Resource] = js.undefined,
        ResourceType: js.UndefOr[DataLakeResourceType] = js.undefined
    ): ListPermissionsRequest = {
      val __obj = js.Dynamic.literal()
      CatalogId.foreach(__v => __obj.updateDynamic("CatalogId")(__v.asInstanceOf[js.Any]))
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
      PrincipalResourcePermissions.foreach(__v =>
        __obj.updateDynamic("PrincipalResourcePermissions")(__v.asInstanceOf[js.Any])
      )
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
  sealed trait Permission extends js.Any
  object Permission extends js.Object {
    val ALL = "ALL".asInstanceOf[Permission]
    val SELECT = "SELECT".asInstanceOf[Permission]
    val ALTER = "ALTER".asInstanceOf[Permission]
    val DROP = "DROP".asInstanceOf[Permission]
    val DELETE = "DELETE".asInstanceOf[Permission]
    val INSERT = "INSERT".asInstanceOf[Permission]
    val DESCRIBE = "DESCRIBE".asInstanceOf[Permission]
    val CREATE_DATABASE = "CREATE_DATABASE".asInstanceOf[Permission]
    val CREATE_TABLE = "CREATE_TABLE".asInstanceOf[Permission]
    val DATA_LOCATION_ACCESS = "DATA_LOCATION_ACCESS".asInstanceOf[Permission]

    val values = js.Object.freeze(
      js.Array(ALL, SELECT, ALTER, DROP, DELETE, INSERT, DESCRIBE, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
    )
  }

  /**
    * Permissions granted to a principal.
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

  /**
    * The permissions granted or revoked on a resource.
    */
  @js.native
  trait PrincipalResourcePermissions extends js.Object {
    var Permissions: js.UndefOr[PermissionList]
    var PermissionsWithGrantOption: js.UndefOr[PermissionList]
    var Principal: js.UndefOr[DataLakePrincipal]
    var Resource: js.UndefOr[Resource]
  }

  object PrincipalResourcePermissions {
    @inline
    def apply(
        Permissions: js.UndefOr[PermissionList] = js.undefined,
        PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined,
        Principal: js.UndefOr[DataLakePrincipal] = js.undefined,
        Resource: js.UndefOr[Resource] = js.undefined
    ): PrincipalResourcePermissions = {
      val __obj = js.Dynamic.literal()
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      PermissionsWithGrantOption.foreach(__v =>
        __obj.updateDynamic("PermissionsWithGrantOption")(__v.asInstanceOf[js.Any])
      )
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
  trait PutDataLakeSettingsResponse extends js.Object {}

  object PutDataLakeSettingsResponse {
    @inline
    def apply(
    ): PutDataLakeSettingsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutDataLakeSettingsResponse]
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
  trait RegisterResourceResponse extends js.Object {}

  object RegisterResourceResponse {
    @inline
    def apply(
    ): RegisterResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RegisterResourceResponse]
    }
  }

  /**
    * A structure for the resource.
    */
  @js.native
  trait Resource extends js.Object {
    var Catalog: js.UndefOr[CatalogResource]
    var DataLocation: js.UndefOr[DataLocationResource]
    var Database: js.UndefOr[DatabaseResource]
    var Table: js.UndefOr[TableResource]
    var TableWithColumns: js.UndefOr[TableWithColumnsResource]
  }

  object Resource {
    @inline
    def apply(
        Catalog: js.UndefOr[CatalogResource] = js.undefined,
        DataLocation: js.UndefOr[DataLocationResource] = js.undefined,
        Database: js.UndefOr[DatabaseResource] = js.undefined,
        Table: js.UndefOr[TableResource] = js.undefined,
        TableWithColumns: js.UndefOr[TableWithColumnsResource] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      Catalog.foreach(__v => __obj.updateDynamic("Catalog")(__v.asInstanceOf[js.Any]))
      DataLocation.foreach(__v => __obj.updateDynamic("DataLocation")(__v.asInstanceOf[js.Any]))
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
      TableWithColumns.foreach(__v => __obj.updateDynamic("TableWithColumns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /**
    * A structure containing information about an AWS Lake Formation resource.
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
      PermissionsWithGrantOption.foreach(__v =>
        __obj.updateDynamic("PermissionsWithGrantOption")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[RevokePermissionsRequest]
    }
  }

  @js.native
  trait RevokePermissionsResponse extends js.Object {}

  object RevokePermissionsResponse {
    @inline
    def apply(
    ): RevokePermissionsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RevokePermissionsResponse]
    }
  }

  /**
    * A structure for the table object. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal.
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

  /**
    * A wildcard object representing every table under a database.
    */
  @js.native
  trait TableWildcard extends js.Object {}

  object TableWildcard {
    @inline
    def apply(
    ): TableWildcard = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TableWildcard]
    }
  }

  /**
    * A structure for a table with columns object. This object is only used when granting a SELECT permission.
    *  This object must take a value for at least one of <code>ColumnsNames</code>, <code>ColumnsIndexes</code>, or <code>ColumnsWildcard</code>.
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
  trait UpdateResourceResponse extends js.Object {}

  object UpdateResourceResponse {
    @inline
    def apply(
    ): UpdateResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateResourceResponse]
    }
  }
}
