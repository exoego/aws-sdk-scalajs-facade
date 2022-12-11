package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object finspacedata {
  type AccessKeyId = String
  type AliasString = String
  type ApplicationPermissionList = js.Array[ApplicationPermission]
  type ChangesetArn = String
  type ChangesetId = String
  type ChangesetList = js.Array[ChangesetSummary]
  type ClientToken = String
  type ColumnDescription = String
  type ColumnList = js.Array[ColumnDefinition]
  type ColumnName = String
  type ColumnNameList = js.Array[ColumnName]
  type DataViewArn = String
  type DataViewDestinationType = String
  type DataViewId = String
  type DataViewList = js.Array[DataViewSummary]
  type DatasetArn = String
  type DatasetDescription = String
  type DatasetId = String
  type DatasetList = js.Array[Dataset]
  type DatasetTitle = String
  type Email = String
  type ErrorMessage = String
  type FirstName = String
  type FormatParams = js.Dictionary[StringMapValue]
  type IdType = String
  type LastName = String
  type OwnerName = String
  type PaginationToken = String
  type PartitionColumnList = js.Array[StringValueLength1to255]
  type Password = String
  type PermissionGroupByUserList = js.Array[PermissionGroupByUser]
  type PermissionGroupDescription = String
  type PermissionGroupId = String
  type PermissionGroupList = js.Array[PermissionGroup]
  type PermissionGroupName = String
  type PhoneNumber = String
  type ResourcePermissionsList = js.Array[ResourcePermission]
  type ResultLimit = Int
  type RoleArn = String
  type S3BucketName = String
  type S3DestinationFormatOptions = js.Dictionary[StringMapValue]
  type S3Key = String
  type SecretAccessKey = String
  type SessionDuration = Double
  type SessionToken = String
  type SortColumnList = js.Array[StringValueLength1to255]
  type SourceParams = js.Dictionary[StringMapValue]
  type StatusCode = Int
  type StringMapKey = String
  type StringMapValue = String
  type StringValueLength1to250 = String
  type StringValueLength1to255 = String
  type TimestampEpoch = Double
  type UserByPermissionGroupList = js.Array[UserByPermissionGroup]
  type UserId = String
  type UserList = js.Array[User]
  type stringValueLength1to1024 = String
  type stringValueLength1to255 = String
  type stringValueLength1to63 = String
  type stringValueMaxLength1000 = String

  final class FinSpaceDataOps(private val service: FinSpaceData) extends AnyVal {

    @inline def associateUserToPermissionGroupFuture(params: AssociateUserToPermissionGroupRequest): Future[AssociateUserToPermissionGroupResponse] = service.associateUserToPermissionGroup(params).promise().toFuture
    @inline def createChangesetFuture(params: CreateChangesetRequest): Future[CreateChangesetResponse] = service.createChangeset(params).promise().toFuture
    @inline def createDataViewFuture(params: CreateDataViewRequest): Future[CreateDataViewResponse] = service.createDataView(params).promise().toFuture
    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] = service.createDataset(params).promise().toFuture
    @inline def createPermissionGroupFuture(params: CreatePermissionGroupRequest): Future[CreatePermissionGroupResponse] = service.createPermissionGroup(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[DeleteDatasetResponse] = service.deleteDataset(params).promise().toFuture
    @inline def deletePermissionGroupFuture(params: DeletePermissionGroupRequest): Future[DeletePermissionGroupResponse] = service.deletePermissionGroup(params).promise().toFuture
    @inline def disableUserFuture(params: DisableUserRequest): Future[DisableUserResponse] = service.disableUser(params).promise().toFuture
    @inline def disassociateUserFromPermissionGroupFuture(params: DisassociateUserFromPermissionGroupRequest): Future[DisassociateUserFromPermissionGroupResponse] = service.disassociateUserFromPermissionGroup(params).promise().toFuture
    @inline def enableUserFuture(params: EnableUserRequest): Future[EnableUserResponse] = service.enableUser(params).promise().toFuture
    @inline def getChangesetFuture(params: GetChangesetRequest): Future[GetChangesetResponse] = service.getChangeset(params).promise().toFuture
    @inline def getDataViewFuture(params: GetDataViewRequest): Future[GetDataViewResponse] = service.getDataView(params).promise().toFuture
    @inline def getDatasetFuture(params: GetDatasetRequest): Future[GetDatasetResponse] = service.getDataset(params).promise().toFuture
    @inline def getExternalDataViewAccessDetailsFuture(params: GetExternalDataViewAccessDetailsRequest): Future[GetExternalDataViewAccessDetailsResponse] = service.getExternalDataViewAccessDetails(params).promise().toFuture
    @inline def getPermissionGroupFuture(params: GetPermissionGroupRequest): Future[GetPermissionGroupResponse] = service.getPermissionGroup(params).promise().toFuture
    @inline def getProgrammaticAccessCredentialsFuture(params: GetProgrammaticAccessCredentialsRequest): Future[GetProgrammaticAccessCredentialsResponse] = service.getProgrammaticAccessCredentials(params).promise().toFuture
    @inline def getUserFuture(params: GetUserRequest): Future[GetUserResponse] = service.getUser(params).promise().toFuture
    @inline def getWorkingLocationFuture(params: GetWorkingLocationRequest): Future[GetWorkingLocationResponse] = service.getWorkingLocation(params).promise().toFuture
    @inline def listChangesetsFuture(params: ListChangesetsRequest): Future[ListChangesetsResponse] = service.listChangesets(params).promise().toFuture
    @inline def listDataViewsFuture(params: ListDataViewsRequest): Future[ListDataViewsResponse] = service.listDataViews(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] = service.listDatasets(params).promise().toFuture
    @inline def listPermissionGroupsByUserFuture(params: ListPermissionGroupsByUserRequest): Future[ListPermissionGroupsByUserResponse] = service.listPermissionGroupsByUser(params).promise().toFuture
    @inline def listPermissionGroupsFuture(params: ListPermissionGroupsRequest): Future[ListPermissionGroupsResponse] = service.listPermissionGroups(params).promise().toFuture
    @inline def listUsersByPermissionGroupFuture(params: ListUsersByPermissionGroupRequest): Future[ListUsersByPermissionGroupResponse] = service.listUsersByPermissionGroup(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def resetUserPasswordFuture(params: ResetUserPasswordRequest): Future[ResetUserPasswordResponse] = service.resetUserPassword(params).promise().toFuture
    @inline def updateChangesetFuture(params: UpdateChangesetRequest): Future[UpdateChangesetResponse] = service.updateChangeset(params).promise().toFuture
    @inline def updateDatasetFuture(params: UpdateDatasetRequest): Future[UpdateDatasetResponse] = service.updateDataset(params).promise().toFuture
    @inline def updatePermissionGroupFuture(params: UpdatePermissionGroupRequest): Future[UpdatePermissionGroupResponse] = service.updatePermissionGroup(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/finspacedata", JSImport.Namespace, "AWS.Finspacedata")
  class FinSpaceData() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateUserToPermissionGroup(params: AssociateUserToPermissionGroupRequest): Request[AssociateUserToPermissionGroupResponse] = js.native
    def createChangeset(params: CreateChangesetRequest): Request[CreateChangesetResponse] = js.native
    def createDataView(params: CreateDataViewRequest): Request[CreateDataViewResponse] = js.native
    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse] = js.native
    def createPermissionGroup(params: CreatePermissionGroupRequest): Request[CreatePermissionGroupResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse] = js.native
    def deletePermissionGroup(params: DeletePermissionGroupRequest): Request[DeletePermissionGroupResponse] = js.native
    def disableUser(params: DisableUserRequest): Request[DisableUserResponse] = js.native
    def disassociateUserFromPermissionGroup(params: DisassociateUserFromPermissionGroupRequest): Request[DisassociateUserFromPermissionGroupResponse] = js.native
    def enableUser(params: EnableUserRequest): Request[EnableUserResponse] = js.native
    def getChangeset(params: GetChangesetRequest): Request[GetChangesetResponse] = js.native
    def getDataView(params: GetDataViewRequest): Request[GetDataViewResponse] = js.native
    def getDataset(params: GetDatasetRequest): Request[GetDatasetResponse] = js.native
    def getExternalDataViewAccessDetails(params: GetExternalDataViewAccessDetailsRequest): Request[GetExternalDataViewAccessDetailsResponse] = js.native
    def getPermissionGroup(params: GetPermissionGroupRequest): Request[GetPermissionGroupResponse] = js.native
    def getProgrammaticAccessCredentials(params: GetProgrammaticAccessCredentialsRequest): Request[GetProgrammaticAccessCredentialsResponse] = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse] = js.native
    def getWorkingLocation(params: GetWorkingLocationRequest): Request[GetWorkingLocationResponse] = js.native
    def listChangesets(params: ListChangesetsRequest): Request[ListChangesetsResponse] = js.native
    def listDataViews(params: ListDataViewsRequest): Request[ListDataViewsResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse] = js.native
    def listPermissionGroups(params: ListPermissionGroupsRequest): Request[ListPermissionGroupsResponse] = js.native
    def listPermissionGroupsByUser(params: ListPermissionGroupsByUserRequest): Request[ListPermissionGroupsByUserResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def listUsersByPermissionGroup(params: ListUsersByPermissionGroupRequest): Request[ListUsersByPermissionGroupResponse] = js.native
    def resetUserPassword(params: ResetUserPasswordRequest): Request[ResetUserPasswordResponse] = js.native
    def updateChangeset(params: UpdateChangesetRequest): Request[UpdateChangesetResponse] = js.native
    def updateDataset(params: UpdateDatasetRequest): Request[UpdateDatasetResponse] = js.native
    def updatePermissionGroup(params: UpdatePermissionGroupRequest): Request[UpdatePermissionGroupResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }
  object FinSpaceData {
    @inline implicit def toOps(service: FinSpaceData): FinSpaceDataOps = {
      new FinSpaceDataOps(service)
    }
  }

  @js.native
  trait AssociateUserToPermissionGroupRequest extends js.Object {
    var permissionGroupId: PermissionGroupId
    var userId: UserId
    var clientToken: js.UndefOr[ClientToken]
  }

  object AssociateUserToPermissionGroupRequest {
    @inline
    def apply(
        permissionGroupId: PermissionGroupId,
        userId: UserId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): AssociateUserToPermissionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "permissionGroupId" -> permissionGroupId.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateUserToPermissionGroupRequest]
    }
  }

  @js.native
  trait AssociateUserToPermissionGroupResponse extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
  }

  object AssociateUserToPermissionGroupResponse {
    @inline
    def apply(
        statusCode: js.UndefOr[StatusCode] = js.undefined
    ): AssociateUserToPermissionGroupResponse = {
      val __obj = js.Dynamic.literal()
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateUserToPermissionGroupResponse]
    }
  }

  /** The credentials required to access the external Dataview from the S3 location.
    */
  @js.native
  trait AwsCredentials extends js.Object {
    var accessKeyId: js.UndefOr[AccessKeyId]
    var expiration: js.UndefOr[TimestampEpoch]
    var secretAccessKey: js.UndefOr[SecretAccessKey]
    var sessionToken: js.UndefOr[SessionToken]
  }

  object AwsCredentials {
    @inline
    def apply(
        accessKeyId: js.UndefOr[AccessKeyId] = js.undefined,
        expiration: js.UndefOr[TimestampEpoch] = js.undefined,
        secretAccessKey: js.UndefOr[SecretAccessKey] = js.undefined,
        sessionToken: js.UndefOr[SessionToken] = js.undefined
    ): AwsCredentials = {
      val __obj = js.Dynamic.literal()
      accessKeyId.foreach(__v => __obj.updateDynamic("accessKeyId")(__v.asInstanceOf[js.Any]))
      expiration.foreach(__v => __obj.updateDynamic("expiration")(__v.asInstanceOf[js.Any]))
      secretAccessKey.foreach(__v => __obj.updateDynamic("secretAccessKey")(__v.asInstanceOf[js.Any]))
      sessionToken.foreach(__v => __obj.updateDynamic("sessionToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCredentials]
    }
  }

  /** The structure with error messages.
    */
  @js.native
  trait ChangesetErrorInfo extends js.Object {
    var errorCategory: js.UndefOr[ErrorCategory]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object ChangesetErrorInfo {
    @inline
    def apply(
        errorCategory: js.UndefOr[ErrorCategory] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): ChangesetErrorInfo = {
      val __obj = js.Dynamic.literal()
      errorCategory.foreach(__v => __obj.updateDynamic("errorCategory")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangesetErrorInfo]
    }
  }

  /** A Changeset is unit of data in a Dataset.
    */
  @js.native
  trait ChangesetSummary extends js.Object {
    var activeFromTimestamp: js.UndefOr[TimestampEpoch]
    var activeUntilTimestamp: js.UndefOr[TimestampEpoch]
    var changeType: js.UndefOr[ChangeType]
    var changesetArn: js.UndefOr[ChangesetArn]
    var changesetId: js.UndefOr[ChangesetId]
    var createTime: js.UndefOr[TimestampEpoch]
    var datasetId: js.UndefOr[DatasetId]
    var errorInfo: js.UndefOr[ChangesetErrorInfo]
    var formatParams: js.UndefOr[FormatParams]
    var sourceParams: js.UndefOr[SourceParams]
    var status: js.UndefOr[IngestionStatus]
    var updatedByChangesetId: js.UndefOr[ChangesetId]
    var updatesChangesetId: js.UndefOr[ChangesetId]
  }

  object ChangesetSummary {
    @inline
    def apply(
        activeFromTimestamp: js.UndefOr[TimestampEpoch] = js.undefined,
        activeUntilTimestamp: js.UndefOr[TimestampEpoch] = js.undefined,
        changeType: js.UndefOr[ChangeType] = js.undefined,
        changesetArn: js.UndefOr[ChangesetArn] = js.undefined,
        changesetId: js.UndefOr[ChangesetId] = js.undefined,
        createTime: js.UndefOr[TimestampEpoch] = js.undefined,
        datasetId: js.UndefOr[DatasetId] = js.undefined,
        errorInfo: js.UndefOr[ChangesetErrorInfo] = js.undefined,
        formatParams: js.UndefOr[FormatParams] = js.undefined,
        sourceParams: js.UndefOr[SourceParams] = js.undefined,
        status: js.UndefOr[IngestionStatus] = js.undefined,
        updatedByChangesetId: js.UndefOr[ChangesetId] = js.undefined,
        updatesChangesetId: js.UndefOr[ChangesetId] = js.undefined
    ): ChangesetSummary = {
      val __obj = js.Dynamic.literal()
      activeFromTimestamp.foreach(__v => __obj.updateDynamic("activeFromTimestamp")(__v.asInstanceOf[js.Any]))
      activeUntilTimestamp.foreach(__v => __obj.updateDynamic("activeUntilTimestamp")(__v.asInstanceOf[js.Any]))
      changeType.foreach(__v => __obj.updateDynamic("changeType")(__v.asInstanceOf[js.Any]))
      changesetArn.foreach(__v => __obj.updateDynamic("changesetArn")(__v.asInstanceOf[js.Any]))
      changesetId.foreach(__v => __obj.updateDynamic("changesetId")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      errorInfo.foreach(__v => __obj.updateDynamic("errorInfo")(__v.asInstanceOf[js.Any]))
      formatParams.foreach(__v => __obj.updateDynamic("formatParams")(__v.asInstanceOf[js.Any]))
      sourceParams.foreach(__v => __obj.updateDynamic("sourceParams")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      updatedByChangesetId.foreach(__v => __obj.updateDynamic("updatedByChangesetId")(__v.asInstanceOf[js.Any]))
      updatesChangesetId.foreach(__v => __obj.updateDynamic("updatesChangesetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangesetSummary]
    }
  }

  /** The definition of a column in a tabular Dataset.
    */
  @js.native
  trait ColumnDefinition extends js.Object {
    var columnDescription: js.UndefOr[ColumnDescription]
    var columnName: js.UndefOr[ColumnName]
    var dataType: js.UndefOr[ColumnDataType]
  }

  object ColumnDefinition {
    @inline
    def apply(
        columnDescription: js.UndefOr[ColumnDescription] = js.undefined,
        columnName: js.UndefOr[ColumnName] = js.undefined,
        dataType: js.UndefOr[ColumnDataType] = js.undefined
    ): ColumnDefinition = {
      val __obj = js.Dynamic.literal()
      columnDescription.foreach(__v => __obj.updateDynamic("columnDescription")(__v.asInstanceOf[js.Any]))
      columnName.foreach(__v => __obj.updateDynamic("columnName")(__v.asInstanceOf[js.Any]))
      dataType.foreach(__v => __obj.updateDynamic("dataType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnDefinition]
    }
  }

  /** The request for a CreateChangeset operation.
    */
  @js.native
  trait CreateChangesetRequest extends js.Object {
    var changeType: ChangeType
    var datasetId: DatasetId
    var formatParams: FormatParams
    var sourceParams: SourceParams
    var clientToken: js.UndefOr[ClientToken]
  }

  object CreateChangesetRequest {
    @inline
    def apply(
        changeType: ChangeType,
        datasetId: DatasetId,
        formatParams: FormatParams,
        sourceParams: SourceParams,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): CreateChangesetRequest = {
      val __obj = js.Dynamic.literal(
        "changeType" -> changeType.asInstanceOf[js.Any],
        "datasetId" -> datasetId.asInstanceOf[js.Any],
        "formatParams" -> formatParams.asInstanceOf[js.Any],
        "sourceParams" -> sourceParams.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChangesetRequest]
    }
  }

  /** The response from a CreateChangeset operation.
    */
  @js.native
  trait CreateChangesetResponse extends js.Object {
    var changesetId: js.UndefOr[ChangesetId]
    var datasetId: js.UndefOr[DatasetId]
  }

  object CreateChangesetResponse {
    @inline
    def apply(
        changesetId: js.UndefOr[ChangesetId] = js.undefined,
        datasetId: js.UndefOr[DatasetId] = js.undefined
    ): CreateChangesetResponse = {
      val __obj = js.Dynamic.literal()
      changesetId.foreach(__v => __obj.updateDynamic("changesetId")(__v.asInstanceOf[js.Any]))
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChangesetResponse]
    }
  }

  /** Request for creating a data view.
    */
  @js.native
  trait CreateDataViewRequest extends js.Object {
    var datasetId: DatasetId
    var destinationTypeParams: DataViewDestinationTypeParams
    var asOfTimestamp: js.UndefOr[TimestampEpoch]
    var autoUpdate: js.UndefOr[Boolean]
    var clientToken: js.UndefOr[ClientToken]
    var partitionColumns: js.UndefOr[PartitionColumnList]
    var sortColumns: js.UndefOr[SortColumnList]
  }

  object CreateDataViewRequest {
    @inline
    def apply(
        datasetId: DatasetId,
        destinationTypeParams: DataViewDestinationTypeParams,
        asOfTimestamp: js.UndefOr[TimestampEpoch] = js.undefined,
        autoUpdate: js.UndefOr[Boolean] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        partitionColumns: js.UndefOr[PartitionColumnList] = js.undefined,
        sortColumns: js.UndefOr[SortColumnList] = js.undefined
    ): CreateDataViewRequest = {
      val __obj = js.Dynamic.literal(
        "datasetId" -> datasetId.asInstanceOf[js.Any],
        "destinationTypeParams" -> destinationTypeParams.asInstanceOf[js.Any]
      )

      asOfTimestamp.foreach(__v => __obj.updateDynamic("asOfTimestamp")(__v.asInstanceOf[js.Any]))
      autoUpdate.foreach(__v => __obj.updateDynamic("autoUpdate")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      partitionColumns.foreach(__v => __obj.updateDynamic("partitionColumns")(__v.asInstanceOf[js.Any]))
      sortColumns.foreach(__v => __obj.updateDynamic("sortColumns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataViewRequest]
    }
  }

  /** Response for creating a data view.
    */
  @js.native
  trait CreateDataViewResponse extends js.Object {
    var dataViewId: js.UndefOr[DataViewId]
    var datasetId: js.UndefOr[DatasetId]
  }

  object CreateDataViewResponse {
    @inline
    def apply(
        dataViewId: js.UndefOr[DataViewId] = js.undefined,
        datasetId: js.UndefOr[DatasetId] = js.undefined
    ): CreateDataViewResponse = {
      val __obj = js.Dynamic.literal()
      dataViewId.foreach(__v => __obj.updateDynamic("dataViewId")(__v.asInstanceOf[js.Any]))
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataViewResponse]
    }
  }

  /** The request for a CreateDataset operation
    */
  @js.native
  trait CreateDatasetRequest extends js.Object {
    var datasetTitle: DatasetTitle
    var kind: DatasetKind
    var permissionGroupParams: PermissionGroupParams
    var alias: js.UndefOr[AliasString]
    var clientToken: js.UndefOr[ClientToken]
    var datasetDescription: js.UndefOr[DatasetDescription]
    var ownerInfo: js.UndefOr[DatasetOwnerInfo]
    var schemaDefinition: js.UndefOr[SchemaUnion]
  }

  object CreateDatasetRequest {
    @inline
    def apply(
        datasetTitle: DatasetTitle,
        kind: DatasetKind,
        permissionGroupParams: PermissionGroupParams,
        alias: js.UndefOr[AliasString] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        datasetDescription: js.UndefOr[DatasetDescription] = js.undefined,
        ownerInfo: js.UndefOr[DatasetOwnerInfo] = js.undefined,
        schemaDefinition: js.UndefOr[SchemaUnion] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "datasetTitle" -> datasetTitle.asInstanceOf[js.Any],
        "kind" -> kind.asInstanceOf[js.Any],
        "permissionGroupParams" -> permissionGroupParams.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      datasetDescription.foreach(__v => __obj.updateDynamic("datasetDescription")(__v.asInstanceOf[js.Any]))
      ownerInfo.foreach(__v => __obj.updateDynamic("ownerInfo")(__v.asInstanceOf[js.Any]))
      schemaDefinition.foreach(__v => __obj.updateDynamic("schemaDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetRequest]
    }
  }

  /** The response from a CreateDataset operation
    */
  @js.native
  trait CreateDatasetResponse extends js.Object {
    var datasetId: js.UndefOr[DatasetId]
  }

  object CreateDatasetResponse {
    @inline
    def apply(
        datasetId: js.UndefOr[DatasetId] = js.undefined
    ): CreateDatasetResponse = {
      val __obj = js.Dynamic.literal()
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetResponse]
    }
  }

  @js.native
  trait CreatePermissionGroupRequest extends js.Object {
    var applicationPermissions: ApplicationPermissionList
    var name: PermissionGroupName
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[PermissionGroupDescription]
  }

  object CreatePermissionGroupRequest {
    @inline
    def apply(
        applicationPermissions: ApplicationPermissionList,
        name: PermissionGroupName,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[PermissionGroupDescription] = js.undefined
    ): CreatePermissionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "applicationPermissions" -> applicationPermissions.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePermissionGroupRequest]
    }
  }

  @js.native
  trait CreatePermissionGroupResponse extends js.Object {
    var permissionGroupId: js.UndefOr[PermissionGroupId]
  }

  object CreatePermissionGroupResponse {
    @inline
    def apply(
        permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
    ): CreatePermissionGroupResponse = {
      val __obj = js.Dynamic.literal()
      permissionGroupId.foreach(__v => __obj.updateDynamic("permissionGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePermissionGroupResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var emailAddress: Email
    var `type`: UserType
    var ApiAccess: js.UndefOr[ApiAccess]
    var apiAccessPrincipalArn: js.UndefOr[RoleArn]
    var clientToken: js.UndefOr[ClientToken]
    var firstName: js.UndefOr[FirstName]
    var lastName: js.UndefOr[LastName]
  }

  object CreateUserRequest {
    @inline
    def apply(
        emailAddress: Email,
        `type`: UserType,
        ApiAccess: js.UndefOr[ApiAccess] = js.undefined,
        apiAccessPrincipalArn: js.UndefOr[RoleArn] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        firstName: js.UndefOr[FirstName] = js.undefined,
        lastName: js.UndefOr[LastName] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "emailAddress" -> emailAddress.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      ApiAccess.foreach(__v => __obj.updateDynamic("ApiAccess")(__v.asInstanceOf[js.Any]))
      apiAccessPrincipalArn.foreach(__v => __obj.updateDynamic("apiAccessPrincipalArn")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      firstName.foreach(__v => __obj.updateDynamic("firstName")(__v.asInstanceOf[js.Any]))
      lastName.foreach(__v => __obj.updateDynamic("lastName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var userId: js.UndefOr[UserId]
  }

  object CreateUserResponse {
    @inline
    def apply(
        userId: js.UndefOr[UserId] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal()
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  /** Short term API credentials.
    */
  @js.native
  trait Credentials extends js.Object {
    var accessKeyId: js.UndefOr[stringValueLength1to255]
    var secretAccessKey: js.UndefOr[stringValueMaxLength1000]
    var sessionToken: js.UndefOr[stringValueMaxLength1000]
  }

  object Credentials {
    @inline
    def apply(
        accessKeyId: js.UndefOr[stringValueLength1to255] = js.undefined,
        secretAccessKey: js.UndefOr[stringValueMaxLength1000] = js.undefined,
        sessionToken: js.UndefOr[stringValueMaxLength1000] = js.undefined
    ): Credentials = {
      val __obj = js.Dynamic.literal()
      accessKeyId.foreach(__v => __obj.updateDynamic("accessKeyId")(__v.asInstanceOf[js.Any]))
      secretAccessKey.foreach(__v => __obj.updateDynamic("secretAccessKey")(__v.asInstanceOf[js.Any]))
      sessionToken.foreach(__v => __obj.updateDynamic("sessionToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Credentials]
    }
  }

  /** Structure for the Dataview destination type parameters.
    */
  @js.native
  trait DataViewDestinationTypeParams extends js.Object {
    var destinationType: DataViewDestinationType
    var s3DestinationExportFileFormat: js.UndefOr[ExportFileFormat]
    var s3DestinationExportFileFormatOptions: js.UndefOr[S3DestinationFormatOptions]
  }

  object DataViewDestinationTypeParams {
    @inline
    def apply(
        destinationType: DataViewDestinationType,
        s3DestinationExportFileFormat: js.UndefOr[ExportFileFormat] = js.undefined,
        s3DestinationExportFileFormatOptions: js.UndefOr[S3DestinationFormatOptions] = js.undefined
    ): DataViewDestinationTypeParams = {
      val __obj = js.Dynamic.literal(
        "destinationType" -> destinationType.asInstanceOf[js.Any]
      )

      s3DestinationExportFileFormat.foreach(__v => __obj.updateDynamic("s3DestinationExportFileFormat")(__v.asInstanceOf[js.Any]))
      s3DestinationExportFileFormatOptions.foreach(__v => __obj.updateDynamic("s3DestinationExportFileFormatOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataViewDestinationTypeParams]
    }
  }

  /** The structure with error messages.
    */
  @js.native
  trait DataViewErrorInfo extends js.Object {
    var errorCategory: js.UndefOr[ErrorCategory]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object DataViewErrorInfo {
    @inline
    def apply(
        errorCategory: js.UndefOr[ErrorCategory] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): DataViewErrorInfo = {
      val __obj = js.Dynamic.literal()
      errorCategory.foreach(__v => __obj.updateDynamic("errorCategory")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataViewErrorInfo]
    }
  }

  /** Structure for the summary of a Dataview.
    */
  @js.native
  trait DataViewSummary extends js.Object {
    var asOfTimestamp: js.UndefOr[TimestampEpoch]
    var autoUpdate: js.UndefOr[Boolean]
    var createTime: js.UndefOr[TimestampEpoch]
    var dataViewArn: js.UndefOr[DataViewArn]
    var dataViewId: js.UndefOr[DataViewId]
    var datasetId: js.UndefOr[DatasetId]
    var destinationTypeProperties: js.UndefOr[DataViewDestinationTypeParams]
    var errorInfo: js.UndefOr[DataViewErrorInfo]
    var lastModifiedTime: js.UndefOr[TimestampEpoch]
    var partitionColumns: js.UndefOr[PartitionColumnList]
    var sortColumns: js.UndefOr[SortColumnList]
    var status: js.UndefOr[DataViewStatus]
  }

  object DataViewSummary {
    @inline
    def apply(
        asOfTimestamp: js.UndefOr[TimestampEpoch] = js.undefined,
        autoUpdate: js.UndefOr[Boolean] = js.undefined,
        createTime: js.UndefOr[TimestampEpoch] = js.undefined,
        dataViewArn: js.UndefOr[DataViewArn] = js.undefined,
        dataViewId: js.UndefOr[DataViewId] = js.undefined,
        datasetId: js.UndefOr[DatasetId] = js.undefined,
        destinationTypeProperties: js.UndefOr[DataViewDestinationTypeParams] = js.undefined,
        errorInfo: js.UndefOr[DataViewErrorInfo] = js.undefined,
        lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined,
        partitionColumns: js.UndefOr[PartitionColumnList] = js.undefined,
        sortColumns: js.UndefOr[SortColumnList] = js.undefined,
        status: js.UndefOr[DataViewStatus] = js.undefined
    ): DataViewSummary = {
      val __obj = js.Dynamic.literal()
      asOfTimestamp.foreach(__v => __obj.updateDynamic("asOfTimestamp")(__v.asInstanceOf[js.Any]))
      autoUpdate.foreach(__v => __obj.updateDynamic("autoUpdate")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      dataViewArn.foreach(__v => __obj.updateDynamic("dataViewArn")(__v.asInstanceOf[js.Any]))
      dataViewId.foreach(__v => __obj.updateDynamic("dataViewId")(__v.asInstanceOf[js.Any]))
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      destinationTypeProperties.foreach(__v => __obj.updateDynamic("destinationTypeProperties")(__v.asInstanceOf[js.Any]))
      errorInfo.foreach(__v => __obj.updateDynamic("errorInfo")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      partitionColumns.foreach(__v => __obj.updateDynamic("partitionColumns")(__v.asInstanceOf[js.Any]))
      sortColumns.foreach(__v => __obj.updateDynamic("sortColumns")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataViewSummary]
    }
  }

  /** The structure for a Dataset.
    */
  @js.native
  trait Dataset extends js.Object {
    var alias: js.UndefOr[AliasString]
    var createTime: js.UndefOr[TimestampEpoch]
    var datasetArn: js.UndefOr[DatasetArn]
    var datasetDescription: js.UndefOr[DatasetDescription]
    var datasetId: js.UndefOr[DatasetId]
    var datasetTitle: js.UndefOr[DatasetTitle]
    var kind: js.UndefOr[DatasetKind]
    var lastModifiedTime: js.UndefOr[TimestampEpoch]
    var ownerInfo: js.UndefOr[DatasetOwnerInfo]
    var schemaDefinition: js.UndefOr[SchemaUnion]
  }

  object Dataset {
    @inline
    def apply(
        alias: js.UndefOr[AliasString] = js.undefined,
        createTime: js.UndefOr[TimestampEpoch] = js.undefined,
        datasetArn: js.UndefOr[DatasetArn] = js.undefined,
        datasetDescription: js.UndefOr[DatasetDescription] = js.undefined,
        datasetId: js.UndefOr[DatasetId] = js.undefined,
        datasetTitle: js.UndefOr[DatasetTitle] = js.undefined,
        kind: js.UndefOr[DatasetKind] = js.undefined,
        lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined,
        ownerInfo: js.UndefOr[DatasetOwnerInfo] = js.undefined,
        schemaDefinition: js.UndefOr[SchemaUnion] = js.undefined
    ): Dataset = {
      val __obj = js.Dynamic.literal()
      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      datasetArn.foreach(__v => __obj.updateDynamic("datasetArn")(__v.asInstanceOf[js.Any]))
      datasetDescription.foreach(__v => __obj.updateDynamic("datasetDescription")(__v.asInstanceOf[js.Any]))
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      datasetTitle.foreach(__v => __obj.updateDynamic("datasetTitle")(__v.asInstanceOf[js.Any]))
      kind.foreach(__v => __obj.updateDynamic("kind")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      ownerInfo.foreach(__v => __obj.updateDynamic("ownerInfo")(__v.asInstanceOf[js.Any]))
      schemaDefinition.foreach(__v => __obj.updateDynamic("schemaDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dataset]
    }
  }

  /** A structure for Dataset owner info.
    */
  @js.native
  trait DatasetOwnerInfo extends js.Object {
    var email: js.UndefOr[Email]
    var name: js.UndefOr[OwnerName]
    var phoneNumber: js.UndefOr[PhoneNumber]
  }

  object DatasetOwnerInfo {
    @inline
    def apply(
        email: js.UndefOr[Email] = js.undefined,
        name: js.UndefOr[OwnerName] = js.undefined,
        phoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): DatasetOwnerInfo = {
      val __obj = js.Dynamic.literal()
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      phoneNumber.foreach(__v => __obj.updateDynamic("phoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetOwnerInfo]
    }
  }

  /** The request for a DeleteDataset operation.
    */
  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var datasetId: DatasetId
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteDatasetRequest {
    @inline
    def apply(
        datasetId: DatasetId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "datasetId" -> datasetId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDatasetRequest]
    }
  }

  /** The response from an DeleteDataset operation
    */
  @js.native
  trait DeleteDatasetResponse extends js.Object {
    var datasetId: js.UndefOr[DatasetId]
  }

  object DeleteDatasetResponse {
    @inline
    def apply(
        datasetId: js.UndefOr[DatasetId] = js.undefined
    ): DeleteDatasetResponse = {
      val __obj = js.Dynamic.literal()
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDatasetResponse]
    }
  }

  @js.native
  trait DeletePermissionGroupRequest extends js.Object {
    var permissionGroupId: PermissionGroupId
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeletePermissionGroupRequest {
    @inline
    def apply(
        permissionGroupId: PermissionGroupId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeletePermissionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "permissionGroupId" -> permissionGroupId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePermissionGroupRequest]
    }
  }

  @js.native
  trait DeletePermissionGroupResponse extends js.Object {
    var permissionGroupId: js.UndefOr[PermissionGroupId]
  }

  object DeletePermissionGroupResponse {
    @inline
    def apply(
        permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
    ): DeletePermissionGroupResponse = {
      val __obj = js.Dynamic.literal()
      permissionGroupId.foreach(__v => __obj.updateDynamic("permissionGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePermissionGroupResponse]
    }
  }

  @js.native
  trait DisableUserRequest extends js.Object {
    var userId: UserId
    var clientToken: js.UndefOr[ClientToken]
  }

  object DisableUserRequest {
    @inline
    def apply(
        userId: UserId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DisableUserRequest = {
      val __obj = js.Dynamic.literal(
        "userId" -> userId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableUserRequest]
    }
  }

  @js.native
  trait DisableUserResponse extends js.Object {
    var userId: js.UndefOr[UserId]
  }

  object DisableUserResponse {
    @inline
    def apply(
        userId: js.UndefOr[UserId] = js.undefined
    ): DisableUserResponse = {
      val __obj = js.Dynamic.literal()
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableUserResponse]
    }
  }

  @js.native
  trait DisassociateUserFromPermissionGroupRequest extends js.Object {
    var permissionGroupId: PermissionGroupId
    var userId: UserId
    var clientToken: js.UndefOr[ClientToken]
  }

  object DisassociateUserFromPermissionGroupRequest {
    @inline
    def apply(
        permissionGroupId: PermissionGroupId,
        userId: UserId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DisassociateUserFromPermissionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "permissionGroupId" -> permissionGroupId.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateUserFromPermissionGroupRequest]
    }
  }

  @js.native
  trait DisassociateUserFromPermissionGroupResponse extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
  }

  object DisassociateUserFromPermissionGroupResponse {
    @inline
    def apply(
        statusCode: js.UndefOr[StatusCode] = js.undefined
    ): DisassociateUserFromPermissionGroupResponse = {
      val __obj = js.Dynamic.literal()
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateUserFromPermissionGroupResponse]
    }
  }

  @js.native
  trait EnableUserRequest extends js.Object {
    var userId: UserId
    var clientToken: js.UndefOr[ClientToken]
  }

  object EnableUserRequest {
    @inline
    def apply(
        userId: UserId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): EnableUserRequest = {
      val __obj = js.Dynamic.literal(
        "userId" -> userId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableUserRequest]
    }
  }

  @js.native
  trait EnableUserResponse extends js.Object {
    var userId: js.UndefOr[UserId]
  }

  object EnableUserResponse {
    @inline
    def apply(
        userId: js.UndefOr[UserId] = js.undefined
    ): EnableUserResponse = {
      val __obj = js.Dynamic.literal()
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableUserResponse]
    }
  }

  /** Request to describe a changeset.
    */
  @js.native
  trait GetChangesetRequest extends js.Object {
    var changesetId: ChangesetId
    var datasetId: DatasetId
  }

  object GetChangesetRequest {
    @inline
    def apply(
        changesetId: ChangesetId,
        datasetId: DatasetId
    ): GetChangesetRequest = {
      val __obj = js.Dynamic.literal(
        "changesetId" -> changesetId.asInstanceOf[js.Any],
        "datasetId" -> datasetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetChangesetRequest]
    }
  }

  /** The response from a describe changeset operation
    */
  @js.native
  trait GetChangesetResponse extends js.Object {
    var activeFromTimestamp: js.UndefOr[TimestampEpoch]
    var activeUntilTimestamp: js.UndefOr[TimestampEpoch]
    var changeType: js.UndefOr[ChangeType]
    var changesetArn: js.UndefOr[ChangesetArn]
    var changesetId: js.UndefOr[ChangesetId]
    var createTime: js.UndefOr[TimestampEpoch]
    var datasetId: js.UndefOr[DatasetId]
    var errorInfo: js.UndefOr[ChangesetErrorInfo]
    var formatParams: js.UndefOr[FormatParams]
    var sourceParams: js.UndefOr[SourceParams]
    var status: js.UndefOr[IngestionStatus]
    var updatedByChangesetId: js.UndefOr[ChangesetId]
    var updatesChangesetId: js.UndefOr[ChangesetId]
  }

  object GetChangesetResponse {
    @inline
    def apply(
        activeFromTimestamp: js.UndefOr[TimestampEpoch] = js.undefined,
        activeUntilTimestamp: js.UndefOr[TimestampEpoch] = js.undefined,
        changeType: js.UndefOr[ChangeType] = js.undefined,
        changesetArn: js.UndefOr[ChangesetArn] = js.undefined,
        changesetId: js.UndefOr[ChangesetId] = js.undefined,
        createTime: js.UndefOr[TimestampEpoch] = js.undefined,
        datasetId: js.UndefOr[DatasetId] = js.undefined,
        errorInfo: js.UndefOr[ChangesetErrorInfo] = js.undefined,
        formatParams: js.UndefOr[FormatParams] = js.undefined,
        sourceParams: js.UndefOr[SourceParams] = js.undefined,
        status: js.UndefOr[IngestionStatus] = js.undefined,
        updatedByChangesetId: js.UndefOr[ChangesetId] = js.undefined,
        updatesChangesetId: js.UndefOr[ChangesetId] = js.undefined
    ): GetChangesetResponse = {
      val __obj = js.Dynamic.literal()
      activeFromTimestamp.foreach(__v => __obj.updateDynamic("activeFromTimestamp")(__v.asInstanceOf[js.Any]))
      activeUntilTimestamp.foreach(__v => __obj.updateDynamic("activeUntilTimestamp")(__v.asInstanceOf[js.Any]))
      changeType.foreach(__v => __obj.updateDynamic("changeType")(__v.asInstanceOf[js.Any]))
      changesetArn.foreach(__v => __obj.updateDynamic("changesetArn")(__v.asInstanceOf[js.Any]))
      changesetId.foreach(__v => __obj.updateDynamic("changesetId")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      errorInfo.foreach(__v => __obj.updateDynamic("errorInfo")(__v.asInstanceOf[js.Any]))
      formatParams.foreach(__v => __obj.updateDynamic("formatParams")(__v.asInstanceOf[js.Any]))
      sourceParams.foreach(__v => __obj.updateDynamic("sourceParams")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      updatedByChangesetId.foreach(__v => __obj.updateDynamic("updatedByChangesetId")(__v.asInstanceOf[js.Any]))
      updatesChangesetId.foreach(__v => __obj.updateDynamic("updatesChangesetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChangesetResponse]
    }
  }

  /** Request for retrieving a data view detail. Grouped / accessible within a dataset by its dataset id.
    */
  @js.native
  trait GetDataViewRequest extends js.Object {
    var dataViewId: DataViewId
    var datasetId: DatasetId
  }

  object GetDataViewRequest {
    @inline
    def apply(
        dataViewId: DataViewId,
        datasetId: DatasetId
    ): GetDataViewRequest = {
      val __obj = js.Dynamic.literal(
        "dataViewId" -> dataViewId.asInstanceOf[js.Any],
        "datasetId" -> datasetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDataViewRequest]
    }
  }

  /** Response from retrieving a dataview, which includes details on the target database and table name
    */
  @js.native
  trait GetDataViewResponse extends js.Object {
    var asOfTimestamp: js.UndefOr[TimestampEpoch]
    var autoUpdate: js.UndefOr[Boolean]
    var createTime: js.UndefOr[TimestampEpoch]
    var dataViewArn: js.UndefOr[DataViewArn]
    var dataViewId: js.UndefOr[DataViewId]
    var datasetId: js.UndefOr[DatasetId]
    var destinationTypeParams: js.UndefOr[DataViewDestinationTypeParams]
    var errorInfo: js.UndefOr[DataViewErrorInfo]
    var lastModifiedTime: js.UndefOr[TimestampEpoch]
    var partitionColumns: js.UndefOr[PartitionColumnList]
    var sortColumns: js.UndefOr[SortColumnList]
    var status: js.UndefOr[DataViewStatus]
  }

  object GetDataViewResponse {
    @inline
    def apply(
        asOfTimestamp: js.UndefOr[TimestampEpoch] = js.undefined,
        autoUpdate: js.UndefOr[Boolean] = js.undefined,
        createTime: js.UndefOr[TimestampEpoch] = js.undefined,
        dataViewArn: js.UndefOr[DataViewArn] = js.undefined,
        dataViewId: js.UndefOr[DataViewId] = js.undefined,
        datasetId: js.UndefOr[DatasetId] = js.undefined,
        destinationTypeParams: js.UndefOr[DataViewDestinationTypeParams] = js.undefined,
        errorInfo: js.UndefOr[DataViewErrorInfo] = js.undefined,
        lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined,
        partitionColumns: js.UndefOr[PartitionColumnList] = js.undefined,
        sortColumns: js.UndefOr[SortColumnList] = js.undefined,
        status: js.UndefOr[DataViewStatus] = js.undefined
    ): GetDataViewResponse = {
      val __obj = js.Dynamic.literal()
      asOfTimestamp.foreach(__v => __obj.updateDynamic("asOfTimestamp")(__v.asInstanceOf[js.Any]))
      autoUpdate.foreach(__v => __obj.updateDynamic("autoUpdate")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      dataViewArn.foreach(__v => __obj.updateDynamic("dataViewArn")(__v.asInstanceOf[js.Any]))
      dataViewId.foreach(__v => __obj.updateDynamic("dataViewId")(__v.asInstanceOf[js.Any]))
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      destinationTypeParams.foreach(__v => __obj.updateDynamic("destinationTypeParams")(__v.asInstanceOf[js.Any]))
      errorInfo.foreach(__v => __obj.updateDynamic("errorInfo")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      partitionColumns.foreach(__v => __obj.updateDynamic("partitionColumns")(__v.asInstanceOf[js.Any]))
      sortColumns.foreach(__v => __obj.updateDynamic("sortColumns")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataViewResponse]
    }
  }

  /** Request for the GetDataset operation.
    */
  @js.native
  trait GetDatasetRequest extends js.Object {
    var datasetId: StringValueLength1to255
  }

  object GetDatasetRequest {
    @inline
    def apply(
        datasetId: StringValueLength1to255
    ): GetDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "datasetId" -> datasetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDatasetRequest]
    }
  }

  /** Response for the GetDataset operation
    */
  @js.native
  trait GetDatasetResponse extends js.Object {
    var alias: js.UndefOr[AliasString]
    var createTime: js.UndefOr[TimestampEpoch]
    var datasetArn: js.UndefOr[DatasetArn]
    var datasetDescription: js.UndefOr[DatasetDescription]
    var datasetId: js.UndefOr[DatasetId]
    var datasetTitle: js.UndefOr[DatasetTitle]
    var kind: js.UndefOr[DatasetKind]
    var lastModifiedTime: js.UndefOr[TimestampEpoch]
    var schemaDefinition: js.UndefOr[SchemaUnion]
    var status: js.UndefOr[DatasetStatus]
  }

  object GetDatasetResponse {
    @inline
    def apply(
        alias: js.UndefOr[AliasString] = js.undefined,
        createTime: js.UndefOr[TimestampEpoch] = js.undefined,
        datasetArn: js.UndefOr[DatasetArn] = js.undefined,
        datasetDescription: js.UndefOr[DatasetDescription] = js.undefined,
        datasetId: js.UndefOr[DatasetId] = js.undefined,
        datasetTitle: js.UndefOr[DatasetTitle] = js.undefined,
        kind: js.UndefOr[DatasetKind] = js.undefined,
        lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined,
        schemaDefinition: js.UndefOr[SchemaUnion] = js.undefined,
        status: js.UndefOr[DatasetStatus] = js.undefined
    ): GetDatasetResponse = {
      val __obj = js.Dynamic.literal()
      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      datasetArn.foreach(__v => __obj.updateDynamic("datasetArn")(__v.asInstanceOf[js.Any]))
      datasetDescription.foreach(__v => __obj.updateDynamic("datasetDescription")(__v.asInstanceOf[js.Any]))
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      datasetTitle.foreach(__v => __obj.updateDynamic("datasetTitle")(__v.asInstanceOf[js.Any]))
      kind.foreach(__v => __obj.updateDynamic("kind")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      schemaDefinition.foreach(__v => __obj.updateDynamic("schemaDefinition")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatasetResponse]
    }
  }

  @js.native
  trait GetExternalDataViewAccessDetailsRequest extends js.Object {
    var dataViewId: DataViewId
    var datasetId: DatasetId
  }

  object GetExternalDataViewAccessDetailsRequest {
    @inline
    def apply(
        dataViewId: DataViewId,
        datasetId: DatasetId
    ): GetExternalDataViewAccessDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "dataViewId" -> dataViewId.asInstanceOf[js.Any],
        "datasetId" -> datasetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetExternalDataViewAccessDetailsRequest]
    }
  }

  @js.native
  trait GetExternalDataViewAccessDetailsResponse extends js.Object {
    var credentials: js.UndefOr[AwsCredentials]
    var s3Location: js.UndefOr[S3Location]
  }

  object GetExternalDataViewAccessDetailsResponse {
    @inline
    def apply(
        credentials: js.UndefOr[AwsCredentials] = js.undefined,
        s3Location: js.UndefOr[S3Location] = js.undefined
    ): GetExternalDataViewAccessDetailsResponse = {
      val __obj = js.Dynamic.literal()
      credentials.foreach(__v => __obj.updateDynamic("credentials")(__v.asInstanceOf[js.Any]))
      s3Location.foreach(__v => __obj.updateDynamic("s3Location")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExternalDataViewAccessDetailsResponse]
    }
  }

  @js.native
  trait GetPermissionGroupRequest extends js.Object {
    var permissionGroupId: PermissionGroupId
  }

  object GetPermissionGroupRequest {
    @inline
    def apply(
        permissionGroupId: PermissionGroupId
    ): GetPermissionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "permissionGroupId" -> permissionGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPermissionGroupRequest]
    }
  }

  @js.native
  trait GetPermissionGroupResponse extends js.Object {
    var permissionGroup: js.UndefOr[PermissionGroup]
  }

  object GetPermissionGroupResponse {
    @inline
    def apply(
        permissionGroup: js.UndefOr[PermissionGroup] = js.undefined
    ): GetPermissionGroupResponse = {
      val __obj = js.Dynamic.literal()
      permissionGroup.foreach(__v => __obj.updateDynamic("permissionGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPermissionGroupResponse]
    }
  }

  /** Request for GetProgrammaticAccessCredentials operation
    */
  @js.native
  trait GetProgrammaticAccessCredentialsRequest extends js.Object {
    var environmentId: IdType
    var durationInMinutes: js.UndefOr[SessionDuration]
  }

  object GetProgrammaticAccessCredentialsRequest {
    @inline
    def apply(
        environmentId: IdType,
        durationInMinutes: js.UndefOr[SessionDuration] = js.undefined
    ): GetProgrammaticAccessCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )

      durationInMinutes.foreach(__v => __obj.updateDynamic("durationInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProgrammaticAccessCredentialsRequest]
    }
  }

  /** Response for GetProgrammaticAccessCredentials operation
    */
  @js.native
  trait GetProgrammaticAccessCredentialsResponse extends js.Object {
    var credentials: js.UndefOr[Credentials]
    var durationInMinutes: js.UndefOr[SessionDuration]
  }

  object GetProgrammaticAccessCredentialsResponse {
    @inline
    def apply(
        credentials: js.UndefOr[Credentials] = js.undefined,
        durationInMinutes: js.UndefOr[SessionDuration] = js.undefined
    ): GetProgrammaticAccessCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      credentials.foreach(__v => __obj.updateDynamic("credentials")(__v.asInstanceOf[js.Any]))
      durationInMinutes.foreach(__v => __obj.updateDynamic("durationInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProgrammaticAccessCredentialsResponse]
    }
  }

  @js.native
  trait GetUserRequest extends js.Object {
    var userId: UserId
  }

  object GetUserRequest {
    @inline
    def apply(
        userId: UserId
    ): GetUserRequest = {
      val __obj = js.Dynamic.literal(
        "userId" -> userId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserRequest]
    }
  }

  @js.native
  trait GetUserResponse extends js.Object {
    var apiAccess: js.UndefOr[ApiAccess]
    var apiAccessPrincipalArn: js.UndefOr[RoleArn]
    var createTime: js.UndefOr[TimestampEpoch]
    var emailAddress: js.UndefOr[Email]
    var firstName: js.UndefOr[FirstName]
    var lastDisabledTime: js.UndefOr[TimestampEpoch]
    var lastEnabledTime: js.UndefOr[TimestampEpoch]
    var lastLoginTime: js.UndefOr[TimestampEpoch]
    var lastModifiedTime: js.UndefOr[TimestampEpoch]
    var lastName: js.UndefOr[LastName]
    var status: js.UndefOr[UserStatus]
    var `type`: js.UndefOr[UserType]
    var userId: js.UndefOr[UserId]
  }

  object GetUserResponse {
    @inline
    def apply(
        apiAccess: js.UndefOr[ApiAccess] = js.undefined,
        apiAccessPrincipalArn: js.UndefOr[RoleArn] = js.undefined,
        createTime: js.UndefOr[TimestampEpoch] = js.undefined,
        emailAddress: js.UndefOr[Email] = js.undefined,
        firstName: js.UndefOr[FirstName] = js.undefined,
        lastDisabledTime: js.UndefOr[TimestampEpoch] = js.undefined,
        lastEnabledTime: js.UndefOr[TimestampEpoch] = js.undefined,
        lastLoginTime: js.UndefOr[TimestampEpoch] = js.undefined,
        lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined,
        lastName: js.UndefOr[LastName] = js.undefined,
        status: js.UndefOr[UserStatus] = js.undefined,
        `type`: js.UndefOr[UserType] = js.undefined,
        userId: js.UndefOr[UserId] = js.undefined
    ): GetUserResponse = {
      val __obj = js.Dynamic.literal()
      apiAccess.foreach(__v => __obj.updateDynamic("apiAccess")(__v.asInstanceOf[js.Any]))
      apiAccessPrincipalArn.foreach(__v => __obj.updateDynamic("apiAccessPrincipalArn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      firstName.foreach(__v => __obj.updateDynamic("firstName")(__v.asInstanceOf[js.Any]))
      lastDisabledTime.foreach(__v => __obj.updateDynamic("lastDisabledTime")(__v.asInstanceOf[js.Any]))
      lastEnabledTime.foreach(__v => __obj.updateDynamic("lastEnabledTime")(__v.asInstanceOf[js.Any]))
      lastLoginTime.foreach(__v => __obj.updateDynamic("lastLoginTime")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      lastName.foreach(__v => __obj.updateDynamic("lastName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserResponse]
    }
  }

  @js.native
  trait GetWorkingLocationRequest extends js.Object {
    var locationType: js.UndefOr[locationType]
  }

  object GetWorkingLocationRequest {
    @inline
    def apply(
        locationType: js.UndefOr[locationType] = js.undefined
    ): GetWorkingLocationRequest = {
      val __obj = js.Dynamic.literal()
      locationType.foreach(__v => __obj.updateDynamic("locationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkingLocationRequest]
    }
  }

  @js.native
  trait GetWorkingLocationResponse extends js.Object {
    var s3Bucket: js.UndefOr[stringValueLength1to63]
    var s3Path: js.UndefOr[stringValueLength1to1024]
    var s3Uri: js.UndefOr[stringValueLength1to1024]
  }

  object GetWorkingLocationResponse {
    @inline
    def apply(
        s3Bucket: js.UndefOr[stringValueLength1to63] = js.undefined,
        s3Path: js.UndefOr[stringValueLength1to1024] = js.undefined,
        s3Uri: js.UndefOr[stringValueLength1to1024] = js.undefined
    ): GetWorkingLocationResponse = {
      val __obj = js.Dynamic.literal()
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      s3Path.foreach(__v => __obj.updateDynamic("s3Path")(__v.asInstanceOf[js.Any]))
      s3Uri.foreach(__v => __obj.updateDynamic("s3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkingLocationResponse]
    }
  }

  /** Request to ListChangesetsRequest. It exposes minimal query filters.
    */
  @js.native
  trait ListChangesetsRequest extends js.Object {
    var datasetId: DatasetId
    var maxResults: js.UndefOr[ResultLimit]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListChangesetsRequest {
    @inline
    def apply(
        datasetId: DatasetId,
        maxResults: js.UndefOr[ResultLimit] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListChangesetsRequest = {
      val __obj = js.Dynamic.literal(
        "datasetId" -> datasetId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChangesetsRequest]
    }
  }

  /** Response to ListChangesetsResponse. This returns a list of dataset changesets that match the query criteria.
    */
  @js.native
  trait ListChangesetsResponse extends js.Object {
    var changesets: js.UndefOr[ChangesetList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListChangesetsResponse {
    @inline
    def apply(
        changesets: js.UndefOr[ChangesetList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListChangesetsResponse = {
      val __obj = js.Dynamic.literal()
      changesets.foreach(__v => __obj.updateDynamic("changesets")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChangesetsResponse]
    }
  }

  /** Request for a list data views.
    */
  @js.native
  trait ListDataViewsRequest extends js.Object {
    var datasetId: DatasetId
    var maxResults: js.UndefOr[ResultLimit]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDataViewsRequest {
    @inline
    def apply(
        datasetId: DatasetId,
        maxResults: js.UndefOr[ResultLimit] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDataViewsRequest = {
      val __obj = js.Dynamic.literal(
        "datasetId" -> datasetId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataViewsRequest]
    }
  }

  @js.native
  trait ListDataViewsResponse extends js.Object {
    var dataViews: js.UndefOr[DataViewList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDataViewsResponse {
    @inline
    def apply(
        dataViews: js.UndefOr[DataViewList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDataViewsResponse = {
      val __obj = js.Dynamic.literal()
      dataViews.foreach(__v => __obj.updateDynamic("dataViews")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataViewsResponse]
    }
  }

  /** Request for the ListDatasets operation.
    */
  @js.native
  trait ListDatasetsRequest extends js.Object {
    var maxResults: js.UndefOr[ResultLimit]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDatasetsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ResultLimit] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDatasetsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsRequest]
    }
  }

  /** Response for the ListDatasets operation
    */
  @js.native
  trait ListDatasetsResponse extends js.Object {
    var datasets: js.UndefOr[DatasetList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDatasetsResponse {
    @inline
    def apply(
        datasets: js.UndefOr[DatasetList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDatasetsResponse = {
      val __obj = js.Dynamic.literal()
      datasets.foreach(__v => __obj.updateDynamic("datasets")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsResponse]
    }
  }

  @js.native
  trait ListPermissionGroupsByUserRequest extends js.Object {
    var maxResults: ResultLimit
    var userId: UserId
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListPermissionGroupsByUserRequest {
    @inline
    def apply(
        maxResults: ResultLimit,
        userId: UserId,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPermissionGroupsByUserRequest = {
      val __obj = js.Dynamic.literal(
        "maxResults" -> maxResults.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionGroupsByUserRequest]
    }
  }

  @js.native
  trait ListPermissionGroupsByUserResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var permissionGroups: js.UndefOr[PermissionGroupByUserList]
  }

  object ListPermissionGroupsByUserResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        permissionGroups: js.UndefOr[PermissionGroupByUserList] = js.undefined
    ): ListPermissionGroupsByUserResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      permissionGroups.foreach(__v => __obj.updateDynamic("permissionGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionGroupsByUserResponse]
    }
  }

  @js.native
  trait ListPermissionGroupsRequest extends js.Object {
    var maxResults: ResultLimit
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListPermissionGroupsRequest {
    @inline
    def apply(
        maxResults: ResultLimit,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPermissionGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "maxResults" -> maxResults.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionGroupsRequest]
    }
  }

  @js.native
  trait ListPermissionGroupsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var permissionGroups: js.UndefOr[PermissionGroupList]
  }

  object ListPermissionGroupsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        permissionGroups: js.UndefOr[PermissionGroupList] = js.undefined
    ): ListPermissionGroupsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      permissionGroups.foreach(__v => __obj.updateDynamic("permissionGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionGroupsResponse]
    }
  }

  @js.native
  trait ListUsersByPermissionGroupRequest extends js.Object {
    var maxResults: ResultLimit
    var permissionGroupId: PermissionGroupId
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUsersByPermissionGroupRequest {
    @inline
    def apply(
        maxResults: ResultLimit,
        permissionGroupId: PermissionGroupId,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListUsersByPermissionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "maxResults" -> maxResults.asInstanceOf[js.Any],
        "permissionGroupId" -> permissionGroupId.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersByPermissionGroupRequest]
    }
  }

  @js.native
  trait ListUsersByPermissionGroupResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var users: js.UndefOr[UserByPermissionGroupList]
  }

  object ListUsersByPermissionGroupResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        users: js.UndefOr[UserByPermissionGroupList] = js.undefined
    ): ListUsersByPermissionGroupResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      users.foreach(__v => __obj.updateDynamic("users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersByPermissionGroupResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var maxResults: ResultLimit
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUsersRequest {
    @inline
    def apply(
        maxResults: ResultLimit,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "maxResults" -> maxResults.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var users: js.UndefOr[UserList]
  }

  object ListUsersResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        users: js.UndefOr[UserList] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      users.foreach(__v => __obj.updateDynamic("users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /** The structure for a permission group.
    */
  @js.native
  trait PermissionGroup extends js.Object {
    var applicationPermissions: js.UndefOr[ApplicationPermissionList]
    var createTime: js.UndefOr[TimestampEpoch]
    var description: js.UndefOr[PermissionGroupDescription]
    var lastModifiedTime: js.UndefOr[TimestampEpoch]
    var membershipStatus: js.UndefOr[PermissionGroupMembershipStatus]
    var name: js.UndefOr[PermissionGroupName]
    var permissionGroupId: js.UndefOr[PermissionGroupId]
  }

  object PermissionGroup {
    @inline
    def apply(
        applicationPermissions: js.UndefOr[ApplicationPermissionList] = js.undefined,
        createTime: js.UndefOr[TimestampEpoch] = js.undefined,
        description: js.UndefOr[PermissionGroupDescription] = js.undefined,
        lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined,
        membershipStatus: js.UndefOr[PermissionGroupMembershipStatus] = js.undefined,
        name: js.UndefOr[PermissionGroupName] = js.undefined,
        permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
    ): PermissionGroup = {
      val __obj = js.Dynamic.literal()
      applicationPermissions.foreach(__v => __obj.updateDynamic("applicationPermissions")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      membershipStatus.foreach(__v => __obj.updateDynamic("membershipStatus")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      permissionGroupId.foreach(__v => __obj.updateDynamic("permissionGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PermissionGroup]
    }
  }

  /** The structure of a permission group associated with a user account.
    */
  @js.native
  trait PermissionGroupByUser extends js.Object {
    var membershipStatus: js.UndefOr[PermissionGroupMembershipStatus]
    var name: js.UndefOr[PermissionGroupName]
    var permissionGroupId: js.UndefOr[PermissionGroupId]
  }

  object PermissionGroupByUser {
    @inline
    def apply(
        membershipStatus: js.UndefOr[PermissionGroupMembershipStatus] = js.undefined,
        name: js.UndefOr[PermissionGroupName] = js.undefined,
        permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
    ): PermissionGroupByUser = {
      val __obj = js.Dynamic.literal()
      membershipStatus.foreach(__v => __obj.updateDynamic("membershipStatus")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      permissionGroupId.foreach(__v => __obj.updateDynamic("permissionGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PermissionGroupByUser]
    }
  }

  /** Permission group parameters for Dataset permissions. Here is an example of how you could specify the <code>PermissionGroupParams</code>: <code> { "permissionGroupId": "0r6fCRtSTUk4XPfXQe3M0g", "datasetPermissions": [ {"permission": "ViewDatasetDetails"}, {"permission": "AddDatasetData"}, {"permission": "EditDatasetMetadata"}, {"permission": "DeleteDataset"} ] } </code>
    */
  @js.native
  trait PermissionGroupParams extends js.Object {
    var datasetPermissions: js.UndefOr[ResourcePermissionsList]
    var permissionGroupId: js.UndefOr[PermissionGroupId]
  }

  object PermissionGroupParams {
    @inline
    def apply(
        datasetPermissions: js.UndefOr[ResourcePermissionsList] = js.undefined,
        permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
    ): PermissionGroupParams = {
      val __obj = js.Dynamic.literal()
      datasetPermissions.foreach(__v => __obj.updateDynamic("datasetPermissions")(__v.asInstanceOf[js.Any]))
      permissionGroupId.foreach(__v => __obj.updateDynamic("permissionGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PermissionGroupParams]
    }
  }

  @js.native
  trait ResetUserPasswordRequest extends js.Object {
    var userId: UserId
    var clientToken: js.UndefOr[ClientToken]
  }

  object ResetUserPasswordRequest {
    @inline
    def apply(
        userId: UserId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): ResetUserPasswordRequest = {
      val __obj = js.Dynamic.literal(
        "userId" -> userId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetUserPasswordRequest]
    }
  }

  @js.native
  trait ResetUserPasswordResponse extends js.Object {
    var temporaryPassword: js.UndefOr[Password]
    var userId: js.UndefOr[UserId]
  }

  object ResetUserPasswordResponse {
    @inline
    def apply(
        temporaryPassword: js.UndefOr[Password] = js.undefined,
        userId: js.UndefOr[UserId] = js.undefined
    ): ResetUserPasswordResponse = {
      val __obj = js.Dynamic.literal()
      temporaryPassword.foreach(__v => __obj.updateDynamic("temporaryPassword")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetUserPasswordResponse]
    }
  }

  /** Resource permission for a dataset. When you create a dataset, all the other members of the same user group inherit access to the dataset. You can only create a dataset if your user group has application permission for Create Datasets. The following is a list of valid dataset permissions that you can apply: * <code>ViewDatasetDetails</code> * <code>ReadDatasetDetails</code> * <code>AddDatasetData</code> * <code>CreateDataView</code> * <code>EditDatasetMetadata</code> * <code>DeleteDataset</code> For more information on the dataset permissions, see [[https://docs.aws.amazon.com/finspace/latest/userguide/managing-user-permissions.html#supported-dataset-permissions|Supported Dataset Permissions]] in the FinSpace User Guide.
    */
  @js.native
  trait ResourcePermission extends js.Object {
    var permission: js.UndefOr[StringValueLength1to250]
  }

  object ResourcePermission {
    @inline
    def apply(
        permission: js.UndefOr[StringValueLength1to250] = js.undefined
    ): ResourcePermission = {
      val __obj = js.Dynamic.literal()
      permission.foreach(__v => __obj.updateDynamic("permission")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePermission]
    }
  }

  /** The location of an external Dataview in an S3 bucket.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucket: S3BucketName
    var key: S3Key
  }

  object S3Location {
    @inline
    def apply(
        bucket: S3BucketName,
        key: S3Key
    ): S3Location = {
      val __obj = js.Dynamic.literal(
        "bucket" -> bucket.asInstanceOf[js.Any],
        "key" -> key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Location]
    }
  }

  /** Definition for a schema on a tabular Dataset.
    */
  @js.native
  trait SchemaDefinition extends js.Object {
    var columns: js.UndefOr[ColumnList]
    var primaryKeyColumns: js.UndefOr[ColumnNameList]
  }

  object SchemaDefinition {
    @inline
    def apply(
        columns: js.UndefOr[ColumnList] = js.undefined,
        primaryKeyColumns: js.UndefOr[ColumnNameList] = js.undefined
    ): SchemaDefinition = {
      val __obj = js.Dynamic.literal()
      columns.foreach(__v => __obj.updateDynamic("columns")(__v.asInstanceOf[js.Any]))
      primaryKeyColumns.foreach(__v => __obj.updateDynamic("primaryKeyColumns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaDefinition]
    }
  }

  /** A union of schema types.
    */
  @js.native
  trait SchemaUnion extends js.Object {
    var tabularSchemaConfig: js.UndefOr[SchemaDefinition]
  }

  object SchemaUnion {
    @inline
    def apply(
        tabularSchemaConfig: js.UndefOr[SchemaDefinition] = js.undefined
    ): SchemaUnion = {
      val __obj = js.Dynamic.literal()
      tabularSchemaConfig.foreach(__v => __obj.updateDynamic("tabularSchemaConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaUnion]
    }
  }

  /** Request to update an existing changeset.
    */
  @js.native
  trait UpdateChangesetRequest extends js.Object {
    var changesetId: ChangesetId
    var datasetId: DatasetId
    var formatParams: FormatParams
    var sourceParams: SourceParams
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateChangesetRequest {
    @inline
    def apply(
        changesetId: ChangesetId,
        datasetId: DatasetId,
        formatParams: FormatParams,
        sourceParams: SourceParams,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateChangesetRequest = {
      val __obj = js.Dynamic.literal(
        "changesetId" -> changesetId.asInstanceOf[js.Any],
        "datasetId" -> datasetId.asInstanceOf[js.Any],
        "formatParams" -> formatParams.asInstanceOf[js.Any],
        "sourceParams" -> sourceParams.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChangesetRequest]
    }
  }

  /** The response from a update changeset operation.
    */
  @js.native
  trait UpdateChangesetResponse extends js.Object {
    var changesetId: js.UndefOr[ChangesetId]
    var datasetId: js.UndefOr[DatasetId]
  }

  object UpdateChangesetResponse {
    @inline
    def apply(
        changesetId: js.UndefOr[ChangesetId] = js.undefined,
        datasetId: js.UndefOr[DatasetId] = js.undefined
    ): UpdateChangesetResponse = {
      val __obj = js.Dynamic.literal()
      changesetId.foreach(__v => __obj.updateDynamic("changesetId")(__v.asInstanceOf[js.Any]))
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChangesetResponse]
    }
  }

  /** The request for an UpdateDataset operation
    */
  @js.native
  trait UpdateDatasetRequest extends js.Object {
    var datasetId: DatasetId
    var datasetTitle: DatasetTitle
    var kind: DatasetKind
    var alias: js.UndefOr[AliasString]
    var clientToken: js.UndefOr[ClientToken]
    var datasetDescription: js.UndefOr[DatasetDescription]
    var schemaDefinition: js.UndefOr[SchemaUnion]
  }

  object UpdateDatasetRequest {
    @inline
    def apply(
        datasetId: DatasetId,
        datasetTitle: DatasetTitle,
        kind: DatasetKind,
        alias: js.UndefOr[AliasString] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        datasetDescription: js.UndefOr[DatasetDescription] = js.undefined,
        schemaDefinition: js.UndefOr[SchemaUnion] = js.undefined
    ): UpdateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "datasetId" -> datasetId.asInstanceOf[js.Any],
        "datasetTitle" -> datasetTitle.asInstanceOf[js.Any],
        "kind" -> kind.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      datasetDescription.foreach(__v => __obj.updateDynamic("datasetDescription")(__v.asInstanceOf[js.Any]))
      schemaDefinition.foreach(__v => __obj.updateDynamic("schemaDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatasetRequest]
    }
  }

  /** The response from an UpdateDataset operation
    */
  @js.native
  trait UpdateDatasetResponse extends js.Object {
    var datasetId: js.UndefOr[DatasetId]
  }

  object UpdateDatasetResponse {
    @inline
    def apply(
        datasetId: js.UndefOr[DatasetId] = js.undefined
    ): UpdateDatasetResponse = {
      val __obj = js.Dynamic.literal()
      datasetId.foreach(__v => __obj.updateDynamic("datasetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatasetResponse]
    }
  }

  @js.native
  trait UpdatePermissionGroupRequest extends js.Object {
    var permissionGroupId: PermissionGroupId
    var applicationPermissions: js.UndefOr[ApplicationPermissionList]
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[PermissionGroupDescription]
    var name: js.UndefOr[PermissionGroupName]
  }

  object UpdatePermissionGroupRequest {
    @inline
    def apply(
        permissionGroupId: PermissionGroupId,
        applicationPermissions: js.UndefOr[ApplicationPermissionList] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[PermissionGroupDescription] = js.undefined,
        name: js.UndefOr[PermissionGroupName] = js.undefined
    ): UpdatePermissionGroupRequest = {
      val __obj = js.Dynamic.literal(
        "permissionGroupId" -> permissionGroupId.asInstanceOf[js.Any]
      )

      applicationPermissions.foreach(__v => __obj.updateDynamic("applicationPermissions")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePermissionGroupRequest]
    }
  }

  @js.native
  trait UpdatePermissionGroupResponse extends js.Object {
    var permissionGroupId: js.UndefOr[PermissionGroupId]
  }

  object UpdatePermissionGroupResponse {
    @inline
    def apply(
        permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
    ): UpdatePermissionGroupResponse = {
      val __obj = js.Dynamic.literal()
      permissionGroupId.foreach(__v => __obj.updateDynamic("permissionGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePermissionGroupResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var userId: UserId
    var apiAccess: js.UndefOr[ApiAccess]
    var apiAccessPrincipalArn: js.UndefOr[RoleArn]
    var clientToken: js.UndefOr[ClientToken]
    var firstName: js.UndefOr[FirstName]
    var lastName: js.UndefOr[LastName]
    var `type`: js.UndefOr[UserType]
  }

  object UpdateUserRequest {
    @inline
    def apply(
        userId: UserId,
        apiAccess: js.UndefOr[ApiAccess] = js.undefined,
        apiAccessPrincipalArn: js.UndefOr[RoleArn] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        firstName: js.UndefOr[FirstName] = js.undefined,
        lastName: js.UndefOr[LastName] = js.undefined,
        `type`: js.UndefOr[UserType] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "userId" -> userId.asInstanceOf[js.Any]
      )

      apiAccess.foreach(__v => __obj.updateDynamic("apiAccess")(__v.asInstanceOf[js.Any]))
      apiAccessPrincipalArn.foreach(__v => __obj.updateDynamic("apiAccessPrincipalArn")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      firstName.foreach(__v => __obj.updateDynamic("firstName")(__v.asInstanceOf[js.Any]))
      lastName.foreach(__v => __obj.updateDynamic("lastName")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var userId: js.UndefOr[UserId]
  }

  object UpdateUserResponse {
    @inline
    def apply(
        userId: js.UndefOr[UserId] = js.undefined
    ): UpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }

  /** The details of the user account.
    */
  @js.native
  trait User extends js.Object {
    var apiAccess: js.UndefOr[ApiAccess]
    var apiAccessPrincipalArn: js.UndefOr[RoleArn]
    var createTime: js.UndefOr[TimestampEpoch]
    var emailAddress: js.UndefOr[Email]
    var firstName: js.UndefOr[FirstName]
    var lastDisabledTime: js.UndefOr[TimestampEpoch]
    var lastEnabledTime: js.UndefOr[TimestampEpoch]
    var lastLoginTime: js.UndefOr[TimestampEpoch]
    var lastModifiedTime: js.UndefOr[TimestampEpoch]
    var lastName: js.UndefOr[LastName]
    var status: js.UndefOr[UserStatus]
    var `type`: js.UndefOr[UserType]
    var userId: js.UndefOr[UserId]
  }

  object User {
    @inline
    def apply(
        apiAccess: js.UndefOr[ApiAccess] = js.undefined,
        apiAccessPrincipalArn: js.UndefOr[RoleArn] = js.undefined,
        createTime: js.UndefOr[TimestampEpoch] = js.undefined,
        emailAddress: js.UndefOr[Email] = js.undefined,
        firstName: js.UndefOr[FirstName] = js.undefined,
        lastDisabledTime: js.UndefOr[TimestampEpoch] = js.undefined,
        lastEnabledTime: js.UndefOr[TimestampEpoch] = js.undefined,
        lastLoginTime: js.UndefOr[TimestampEpoch] = js.undefined,
        lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined,
        lastName: js.UndefOr[LastName] = js.undefined,
        status: js.UndefOr[UserStatus] = js.undefined,
        `type`: js.UndefOr[UserType] = js.undefined,
        userId: js.UndefOr[UserId] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal()
      apiAccess.foreach(__v => __obj.updateDynamic("apiAccess")(__v.asInstanceOf[js.Any]))
      apiAccessPrincipalArn.foreach(__v => __obj.updateDynamic("apiAccessPrincipalArn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      firstName.foreach(__v => __obj.updateDynamic("firstName")(__v.asInstanceOf[js.Any]))
      lastDisabledTime.foreach(__v => __obj.updateDynamic("lastDisabledTime")(__v.asInstanceOf[js.Any]))
      lastEnabledTime.foreach(__v => __obj.updateDynamic("lastEnabledTime")(__v.asInstanceOf[js.Any]))
      lastLoginTime.foreach(__v => __obj.updateDynamic("lastLoginTime")(__v.asInstanceOf[js.Any]))
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      lastName.foreach(__v => __obj.updateDynamic("lastName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /** The structure of a user account associated with a permission group.
    */
  @js.native
  trait UserByPermissionGroup extends js.Object {
    var apiAccess: js.UndefOr[ApiAccess]
    var apiAccessPrincipalArn: js.UndefOr[RoleArn]
    var emailAddress: js.UndefOr[Email]
    var firstName: js.UndefOr[FirstName]
    var lastName: js.UndefOr[LastName]
    var membershipStatus: js.UndefOr[PermissionGroupMembershipStatus]
    var status: js.UndefOr[UserStatus]
    var `type`: js.UndefOr[UserType]
    var userId: js.UndefOr[UserId]
  }

  object UserByPermissionGroup {
    @inline
    def apply(
        apiAccess: js.UndefOr[ApiAccess] = js.undefined,
        apiAccessPrincipalArn: js.UndefOr[RoleArn] = js.undefined,
        emailAddress: js.UndefOr[Email] = js.undefined,
        firstName: js.UndefOr[FirstName] = js.undefined,
        lastName: js.UndefOr[LastName] = js.undefined,
        membershipStatus: js.UndefOr[PermissionGroupMembershipStatus] = js.undefined,
        status: js.UndefOr[UserStatus] = js.undefined,
        `type`: js.UndefOr[UserType] = js.undefined,
        userId: js.UndefOr[UserId] = js.undefined
    ): UserByPermissionGroup = {
      val __obj = js.Dynamic.literal()
      apiAccess.foreach(__v => __obj.updateDynamic("apiAccess")(__v.asInstanceOf[js.Any]))
      apiAccessPrincipalArn.foreach(__v => __obj.updateDynamic("apiAccessPrincipalArn")(__v.asInstanceOf[js.Any]))
      emailAddress.foreach(__v => __obj.updateDynamic("emailAddress")(__v.asInstanceOf[js.Any]))
      firstName.foreach(__v => __obj.updateDynamic("firstName")(__v.asInstanceOf[js.Any]))
      lastName.foreach(__v => __obj.updateDynamic("lastName")(__v.asInstanceOf[js.Any]))
      membershipStatus.foreach(__v => __obj.updateDynamic("membershipStatus")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserByPermissionGroup]
    }
  }
}
