package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object workspaces {
  type ARN = String
  type Alias = String
  type BooleanObject = Boolean
  type BundleId = String
  type BundleIdList = js.Array[BundleId]
  type BundleList = js.Array[WorkspaceBundle]
  type BundleOwner = String
  type Compute = String
  type ComputerName = String
  type ConnectionState = String
  type DefaultOu = String
  type Description = String
  type DirectoryId = String
  type DirectoryIdList = js.Array[DirectoryId]
  type DirectoryList = js.Array[WorkspaceDirectory]
  type DirectoryName = String
  type DnsIpAddresses = js.Array[IpAddress]
  type ErrorType = String
  type ExceptionMessage = String
  type FailedCreateWorkspaceRequests = js.Array[FailedCreateWorkspaceRequest]
  type FailedRebootWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedRebuildWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStartWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStopWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedTerminateWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type IpAddress = String
  type Limit = Integer
  type NonEmptyString = String
  type PaginationToken = String
  type RebootWorkspaceRequests = js.Array[RebootRequest]
  type RebuildWorkspaceRequests = js.Array[RebuildRequest]
  type RegistrationCode = String
  type RunningMode = String
  type RunningModeAutoStopTimeoutInMinutes = Integer
  type SecurityGroupId = String
  type StartWorkspaceRequests = js.Array[StartRequest]
  type StopWorkspaceRequests = js.Array[StopRequest]
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[NonEmptyString]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TerminateWorkspaceRequests = js.Array[TerminateRequest]
  type Timestamp = js.Date
  type UserName = String
  type VolumeEncryptionKey = String
  type WorkspaceConnectionStatusList = js.Array[WorkspaceConnectionStatus]
  type WorkspaceDirectoryState = String
  type WorkspaceDirectoryType = String
  type WorkspaceErrorCode = String
  type WorkspaceId = String
  type WorkspaceIdList = js.Array[WorkspaceId]
  type WorkspaceList = js.Array[Workspace]
  type WorkspaceRequestList = js.Array[WorkspaceRequest]
  type WorkspaceState = String
}

package workspaces {
  @js.native
  trait Workspaces extends js.Object {
    def createTags(params: CreateTagsRequest, callback: Callback[CreateTagsResult]): Unit = js.native
    def createTags(params: CreateTagsRequest): Request[CreateTagsResult] = js.native
    def createWorkspaces(params: CreateWorkspacesRequest, callback: Callback[CreateWorkspacesResult]): Unit = js.native
    def createWorkspaces(params: CreateWorkspacesRequest): Request[CreateWorkspacesResult] = js.native
    def deleteTags(params: DeleteTagsRequest, callback: Callback[DeleteTagsResult]): Unit = js.native
    def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResult] = js.native
    def describeTags(params: DescribeTagsRequest, callback: Callback[DescribeTagsResult]): Unit = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult] = js.native
    def describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest, callback: Callback[DescribeWorkspaceBundlesResult]): Unit = js.native
    def describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest): Request[DescribeWorkspaceBundlesResult] = js.native
    def describeWorkspaceDirectories(params: DescribeWorkspaceDirectoriesRequest, callback: Callback[DescribeWorkspaceDirectoriesResult]): Unit = js.native
    def describeWorkspaceDirectories(params: DescribeWorkspaceDirectoriesRequest): Request[DescribeWorkspaceDirectoriesResult] = js.native
    def describeWorkspaces(params: DescribeWorkspacesRequest, callback: Callback[DescribeWorkspacesResult]): Unit = js.native
    def describeWorkspaces(params: DescribeWorkspacesRequest): Request[DescribeWorkspacesResult] = js.native
    def describeWorkspacesConnectionStatus(params: DescribeWorkspacesConnectionStatusRequest, callback: Callback[DescribeWorkspacesConnectionStatusResult]): Unit = js.native
    def describeWorkspacesConnectionStatus(params: DescribeWorkspacesConnectionStatusRequest): Request[DescribeWorkspacesConnectionStatusResult] = js.native
    def modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest, callback: Callback[ModifyWorkspacePropertiesResult]): Unit = js.native
    def modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest): Request[ModifyWorkspacePropertiesResult] = js.native
    def rebootWorkspaces(params: RebootWorkspacesRequest, callback: Callback[RebootWorkspacesResult]): Unit = js.native
    def rebootWorkspaces(params: RebootWorkspacesRequest): Request[RebootWorkspacesResult] = js.native
    def rebuildWorkspaces(params: RebuildWorkspacesRequest, callback: Callback[RebuildWorkspacesResult]): Unit = js.native
    def rebuildWorkspaces(params: RebuildWorkspacesRequest): Request[RebuildWorkspacesResult] = js.native
    def startWorkspaces(params: StartWorkspacesRequest, callback: Callback[StartWorkspacesResult]): Unit = js.native
    def startWorkspaces(params: StartWorkspacesRequest): Request[StartWorkspacesResult] = js.native
    def stopWorkspaces(params: StopWorkspacesRequest, callback: Callback[StopWorkspacesResult]): Unit = js.native
    def stopWorkspaces(params: StopWorkspacesRequest): Request[StopWorkspacesResult] = js.native
    def terminateWorkspaces(params: TerminateWorkspacesRequest, callback: Callback[TerminateWorkspacesResult]): Unit = js.native
    def terminateWorkspaces(params: TerminateWorkspacesRequest): Request[TerminateWorkspacesResult] = js.native
  }

  @js.native
  trait AccessDeniedExceptionException extends js.Object {
    var message: ExceptionMessage
  }


  object ComputeEnum {
    val VALUE = "VALUE"
    val STANDARD = "STANDARD"
    val PERFORMANCE = "PERFORMANCE"

    val values = IndexedSeq(VALUE, STANDARD, PERFORMANCE)
  }

  /**
   * <p>Contains information about the compute type of a WorkSpace bundle.</p>
   */
  @js.native
  trait ComputeType extends js.Object {
    var Name: Compute
  }

  object ComputeType {
    def apply(
      Name: js.UndefOr[Compute] = js.undefined
    ): ComputeType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeType]
    }
  }


  object ConnectionStateEnum {
    val CONNECTED = "CONNECTED"
    val DISCONNECTED = "DISCONNECTED"
    val UNKNOWN = "UNKNOWN"

    val values = IndexedSeq(CONNECTED, DISCONNECTED, UNKNOWN)
  }

  /**
   * <p>The request of the <a>CreateTags</a> operation.</p>
   */
  @js.native
  trait CreateTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
    var Tags: TagList
  }

  object CreateTagsRequest {
    def apply(
      ResourceId: js.UndefOr[NonEmptyString] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
    }
  }

  /**
   * <p>The result of the <a>CreateTags</a> operation.</p>
   */
  @js.native
  trait CreateTagsResult extends js.Object {

  }

  object CreateTagsResult {
    def apply(

    ): CreateTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>CreateWorkspaces</a> operation.</p>
   */
  @js.native
  trait CreateWorkspacesRequest extends js.Object {
    var Workspaces: WorkspaceRequestList
  }

  object CreateWorkspacesRequest {
    def apply(
      Workspaces: js.UndefOr[WorkspaceRequestList] = js.undefined
    ): CreateWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Workspaces" -> Workspaces.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkspacesRequest]
    }
  }

  /**
   * <p>Contains the result of the <a>CreateWorkspaces</a> operation.</p>
   */
  @js.native
  trait CreateWorkspacesResult extends js.Object {
    var FailedRequests: FailedCreateWorkspaceRequests
    var PendingRequests: WorkspaceList
  }

  object CreateWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests] = js.undefined,
      PendingRequests: js.UndefOr[WorkspaceList] = js.undefined
    ): CreateWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailedRequests" -> FailedRequests.map { x => x: js.Any }),
        ("PendingRequests" -> PendingRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkspacesResult]
    }
  }

  /**
   * <p>Contains default WorkSpace creation information.</p>
   */
  @js.native
  trait DefaultWorkspaceCreationProperties extends js.Object {
    var DefaultOu: DefaultOu
    var EnableWorkDocs: BooleanObject
    var UserEnabledAsLocalAdministrator: BooleanObject
    var CustomSecurityGroupId: SecurityGroupId
    var EnableInternetAccess: BooleanObject
  }

  object DefaultWorkspaceCreationProperties {
    def apply(
      DefaultOu: js.UndefOr[DefaultOu] = js.undefined,
      EnableWorkDocs: js.UndefOr[BooleanObject] = js.undefined,
      UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.undefined,
      CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
      EnableInternetAccess: js.UndefOr[BooleanObject] = js.undefined
    ): DefaultWorkspaceCreationProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultOu" -> DefaultOu.map { x => x: js.Any }),
        ("EnableWorkDocs" -> EnableWorkDocs.map { x => x: js.Any }),
        ("UserEnabledAsLocalAdministrator" -> UserEnabledAsLocalAdministrator.map { x => x: js.Any }),
        ("CustomSecurityGroupId" -> CustomSecurityGroupId.map { x => x: js.Any }),
        ("EnableInternetAccess" -> EnableInternetAccess.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultWorkspaceCreationProperties]
    }
  }

  /**
   * <p>The request of the <a>DeleteTags</a> operation.</p>
   */
  @js.native
  trait DeleteTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
    var TagKeys: TagKeyList
  }

  object DeleteTagsRequest {
    def apply(
      ResourceId: js.UndefOr[NonEmptyString] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  /**
   * <p>The result of the <a>DeleteTags</a> operation.</p>
   */
  @js.native
  trait DeleteTagsResult extends js.Object {

  }

  object DeleteTagsResult {
    def apply(

    ): DeleteTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsResult]
    }
  }

  /**
   * <p>The request of the <a>DescribeTags</a> operation.</p>
   */
  @js.native
  trait DescribeTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
  }

  object DescribeTagsRequest {
    def apply(
      ResourceId: js.UndefOr[NonEmptyString] = js.undefined
    ): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
    }
  }

  /**
   * <p>The result of the <a>DescribeTags</a> operation.</p>
   */
  @js.native
  trait DescribeTagsResult extends js.Object {
    var TagList: TagList
  }

  object DescribeTagsResult {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined
    ): DescribeTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TagList" -> TagList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DescribeWorkspaceBundles</a> operation.</p>
   */
  @js.native
  trait DescribeWorkspaceBundlesRequest extends js.Object {
    var BundleIds: BundleIdList
    var Owner: BundleOwner
    var NextToken: PaginationToken
  }

  object DescribeWorkspaceBundlesRequest {
    def apply(
      BundleIds: js.UndefOr[BundleIdList] = js.undefined,
      Owner: js.UndefOr[BundleOwner] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceBundlesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BundleIds" -> BundleIds.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceBundlesRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>DescribeWorkspaceBundles</a> operation.</p>
   */
  @js.native
  trait DescribeWorkspaceBundlesResult extends js.Object {
    var Bundles: BundleList
    var NextToken: PaginationToken
  }

  object DescribeWorkspaceBundlesResult {
    def apply(
      Bundles: js.UndefOr[BundleList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceBundlesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bundles" -> Bundles.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceBundlesResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DescribeWorkspaceDirectories</a> operation.</p>
   */
  @js.native
  trait DescribeWorkspaceDirectoriesRequest extends js.Object {
    var DirectoryIds: DirectoryIdList
    var NextToken: PaginationToken
  }

  object DescribeWorkspaceDirectoriesRequest {
    def apply(
      DirectoryIds: js.UndefOr[DirectoryIdList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceDirectoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DirectoryIds" -> DirectoryIds.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceDirectoriesRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>DescribeWorkspaceDirectories</a> operation.</p>
   */
  @js.native
  trait DescribeWorkspaceDirectoriesResult extends js.Object {
    var Directories: DirectoryList
    var NextToken: PaginationToken
  }

  object DescribeWorkspaceDirectoriesResult {
    def apply(
      Directories: js.UndefOr[DirectoryList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceDirectoriesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Directories" -> Directories.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceDirectoriesResult]
    }
  }

  @js.native
  trait DescribeWorkspacesConnectionStatusRequest extends js.Object {
    var WorkspaceIds: WorkspaceIdList
    var NextToken: PaginationToken
  }

  object DescribeWorkspacesConnectionStatusRequest {
    def apply(
      WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspacesConnectionStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceIds" -> WorkspaceIds.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesConnectionStatusRequest]
    }
  }

  @js.native
  trait DescribeWorkspacesConnectionStatusResult extends js.Object {
    var WorkspacesConnectionStatus: WorkspaceConnectionStatusList
    var NextToken: PaginationToken
  }

  object DescribeWorkspacesConnectionStatusResult {
    def apply(
      WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspacesConnectionStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspacesConnectionStatus" -> WorkspacesConnectionStatus.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesConnectionStatusResult]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DescribeWorkspaces</a> operation.</p>
   */
  @js.native
  trait DescribeWorkspacesRequest extends js.Object {
    var DirectoryId: DirectoryId
    var UserName: UserName
    var BundleId: BundleId
    var Limit: Limit
    var WorkspaceIds: WorkspaceIdList
    var NextToken: PaginationToken
  }

  object DescribeWorkspacesRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined,
      BundleId: js.UndefOr[BundleId] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined,
      WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DirectoryId" -> DirectoryId.map { x => x: js.Any }),
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("BundleId" -> BundleId.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("WorkspaceIds" -> WorkspaceIds.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesRequest]
    }
  }

  /**
   * <p>Contains the results for the <a>DescribeWorkspaces</a> operation.</p>
   */
  @js.native
  trait DescribeWorkspacesResult extends js.Object {
    var Workspaces: WorkspaceList
    var NextToken: PaginationToken
  }

  object DescribeWorkspacesResult {
    def apply(
      Workspaces: js.UndefOr[WorkspaceList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Workspaces" -> Workspaces.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesResult]
    }
  }

  /**
   * <p>Contains information about a WorkSpace that could not be created.</p>
   */
  @js.native
  trait FailedCreateWorkspaceRequest extends js.Object {
    var WorkspaceRequest: WorkspaceRequest
    var ErrorCode: ErrorType
    var ErrorMessage: Description
  }

  object FailedCreateWorkspaceRequest {
    def apply(
      WorkspaceRequest: js.UndefOr[WorkspaceRequest] = js.undefined,
      ErrorCode: js.UndefOr[ErrorType] = js.undefined,
      ErrorMessage: js.UndefOr[Description] = js.undefined
    ): FailedCreateWorkspaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceRequest" -> WorkspaceRequest.map { x => x: js.Any }),
        ("ErrorCode" -> ErrorCode.map { x => x: js.Any }),
        ("ErrorMessage" -> ErrorMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedCreateWorkspaceRequest]
    }
  }

  /**
   * <p>Contains information about a WorkSpace that could not be rebooted (<a>RebootWorkspaces</a>), rebuilt (<a>RebuildWorkspaces</a>), terminated (<a>TerminateWorkspaces</a>), started (<a>StartWorkspaces</a>), or stopped (<a>StopWorkspaces</a>).</p>
   */
  @js.native
  trait FailedWorkspaceChangeRequest extends js.Object {
    var WorkspaceId: WorkspaceId
    var ErrorCode: ErrorType
    var ErrorMessage: Description
  }

  object FailedWorkspaceChangeRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorType] = js.undefined,
      ErrorMessage: js.UndefOr[Description] = js.undefined
    ): FailedWorkspaceChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceId" -> WorkspaceId.map { x => x: js.Any }),
        ("ErrorCode" -> ErrorCode.map { x => x: js.Any }),
        ("ErrorMessage" -> ErrorMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedWorkspaceChangeRequest]
    }
  }

  /**
   * <p>One or more parameter values are not valid.</p>
   */
  @js.native
  trait InvalidParameterValuesExceptionException extends js.Object {
    var message: ExceptionMessage
  }

  /**
   * <p>The specified WorkSpace has an invalid state for this operation.</p>
   */
  @js.native
  trait InvalidResourceStateExceptionException extends js.Object {
    var message: ExceptionMessage
  }

  @js.native
  trait ModifyWorkspacePropertiesRequest extends js.Object {
    var WorkspaceId: WorkspaceId
    var WorkspaceProperties: WorkspaceProperties
  }

  object ModifyWorkspacePropertiesRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
      WorkspaceProperties: js.UndefOr[WorkspaceProperties] = js.undefined
    ): ModifyWorkspacePropertiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceId" -> WorkspaceId.map { x => x: js.Any }),
        ("WorkspaceProperties" -> WorkspaceProperties.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspacePropertiesRequest]
    }
  }

  @js.native
  trait ModifyWorkspacePropertiesResult extends js.Object {

  }

  object ModifyWorkspacePropertiesResult {
    def apply(

    ): ModifyWorkspacePropertiesResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspacePropertiesResult]
    }
  }

  /**
   * <p>The properties of this WorkSpace are currently being modified. Try again in a moment.</p>
   */
  @js.native
  trait OperationInProgressExceptionException extends js.Object {
    var message: ExceptionMessage
  }

  /**
   * <p>Contains information used with the <a>RebootWorkspaces</a> operation to reboot a WorkSpace.</p>
   */
  @js.native
  trait RebootRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object RebootRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): RebootRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceId" -> WorkspaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootRequest]
    }
  }

  /**
   * <p>Contains the inputs for the <a>RebootWorkspaces</a> operation.</p>
   */
  @js.native
  trait RebootWorkspacesRequest extends js.Object {
    var RebootWorkspaceRequests: RebootWorkspaceRequests
  }

  object RebootWorkspacesRequest {
    def apply(
      RebootWorkspaceRequests: js.UndefOr[RebootWorkspaceRequests] = js.undefined
    ): RebootWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RebootWorkspaceRequests" -> RebootWorkspaceRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootWorkspacesRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>RebootWorkspaces</a> operation.</p>
   */
  @js.native
  trait RebootWorkspacesResult extends js.Object {
    var FailedRequests: FailedRebootWorkspaceRequests
  }

  object RebootWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests] = js.undefined
    ): RebootWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailedRequests" -> FailedRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootWorkspacesResult]
    }
  }

  /**
   * <p>Contains information used with the <a>RebuildWorkspaces</a> operation to rebuild a WorkSpace.</p>
   */
  @js.native
  trait RebuildRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object RebuildRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): RebuildRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceId" -> WorkspaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildRequest]
    }
  }

  /**
   * <p>Contains the inputs for the <a>RebuildWorkspaces</a> operation.</p>
   */
  @js.native
  trait RebuildWorkspacesRequest extends js.Object {
    var RebuildWorkspaceRequests: RebuildWorkspaceRequests
  }

  object RebuildWorkspacesRequest {
    def apply(
      RebuildWorkspaceRequests: js.UndefOr[RebuildWorkspaceRequests] = js.undefined
    ): RebuildWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RebuildWorkspaceRequests" -> RebuildWorkspaceRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildWorkspacesRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>RebuildWorkspaces</a> operation.</p>
   */
  @js.native
  trait RebuildWorkspacesResult extends js.Object {
    var FailedRequests: FailedRebuildWorkspaceRequests
  }

  object RebuildWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.undefined
    ): RebuildWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailedRequests" -> FailedRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildWorkspacesResult]
    }
  }

  /**
   * <p>Your resource limits have been exceeded.</p>
   */
  @js.native
  trait ResourceLimitExceededExceptionException extends js.Object {
    var message: ExceptionMessage
  }

  /**
   * <p>The resource could not be found.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    var message: ExceptionMessage
    var ResourceId: NonEmptyString
  }

  /**
   * <p>The specified resource is not available.</p>
   */
  @js.native
  trait ResourceUnavailableExceptionException extends js.Object {
    var message: ExceptionMessage
    var ResourceId: NonEmptyString
  }


  object RunningModeEnum {
    val `AUTO_STOP` = "AUTO_STOP"
    val `ALWAYS_ON` = "ALWAYS_ON"

    val values = IndexedSeq(`AUTO_STOP`, `ALWAYS_ON`)
  }

  /**
   * <p>Describes the start request.</p>
   */
  @js.native
  trait StartRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object StartRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): StartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceId" -> WorkspaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartRequest]
    }
  }

  @js.native
  trait StartWorkspacesRequest extends js.Object {
    var StartWorkspaceRequests: StartWorkspaceRequests
  }

  object StartWorkspacesRequest {
    def apply(
      StartWorkspaceRequests: js.UndefOr[StartWorkspaceRequests] = js.undefined
    ): StartWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StartWorkspaceRequests" -> StartWorkspaceRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartWorkspacesRequest]
    }
  }

  @js.native
  trait StartWorkspacesResult extends js.Object {
    var FailedRequests: FailedStartWorkspaceRequests
  }

  object StartWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedStartWorkspaceRequests] = js.undefined
    ): StartWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailedRequests" -> FailedRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartWorkspacesResult]
    }
  }

  /**
   * <p>Describes the stop request.</p>
   */
  @js.native
  trait StopRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object StopRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): StopRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceId" -> WorkspaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRequest]
    }
  }

  @js.native
  trait StopWorkspacesRequest extends js.Object {
    var StopWorkspaceRequests: StopWorkspaceRequests
  }

  object StopWorkspacesRequest {
    def apply(
      StopWorkspaceRequests: js.UndefOr[StopWorkspaceRequests] = js.undefined
    ): StopWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StopWorkspaceRequests" -> StopWorkspaceRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopWorkspacesRequest]
    }
  }

  @js.native
  trait StopWorkspacesResult extends js.Object {
    var FailedRequests: FailedStopWorkspaceRequests
  }

  object StopWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedStopWorkspaceRequests] = js.undefined
    ): StopWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailedRequests" -> FailedRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopWorkspacesResult]
    }
  }

  /**
   * <p>Describes the tag of the WorkSpace.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Contains information used with the <a>TerminateWorkspaces</a> operation to terminate a WorkSpace.</p>
   */
  @js.native
  trait TerminateRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object TerminateRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): TerminateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceId" -> WorkspaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateRequest]
    }
  }

  /**
   * <p>Contains the inputs for the <a>TerminateWorkspaces</a> operation.</p>
   */
  @js.native
  trait TerminateWorkspacesRequest extends js.Object {
    var TerminateWorkspaceRequests: TerminateWorkspaceRequests
  }

  object TerminateWorkspacesRequest {
    def apply(
      TerminateWorkspaceRequests: js.UndefOr[TerminateWorkspaceRequests] = js.undefined
    ): TerminateWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TerminateWorkspaceRequests" -> TerminateWorkspaceRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateWorkspacesRequest]
    }
  }

  /**
   * <p>Contains the results of the <a>TerminateWorkspaces</a> operation.</p>
   */
  @js.native
  trait TerminateWorkspacesResult extends js.Object {
    var FailedRequests: FailedTerminateWorkspaceRequests
  }

  object TerminateWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests] = js.undefined
    ): TerminateWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailedRequests" -> FailedRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateWorkspacesResult]
    }
  }

  /**
   * <p>The WorkSpace does not have the supported configuration for this operation. For more information, see the <a href="http://docs.aws.amazon.com/workspaces/latest/adminguide">Amazon WorkSpaces Administration Guide</a>. </p>
   */
  @js.native
  trait UnsupportedWorkspaceConfigurationExceptionException extends js.Object {
    var message: ExceptionMessage
  }

  /**
   * <p>Contains information about the user storage for a WorkSpace bundle.</p>
   */
  @js.native
  trait UserStorage extends js.Object {
    var Capacity: NonEmptyString
  }

  object UserStorage {
    def apply(
      Capacity: js.UndefOr[NonEmptyString] = js.undefined
    ): UserStorage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Capacity" -> Capacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserStorage]
    }
  }

  /**
   * <p>Contains information about a WorkSpace.</p>
   */
  @js.native
  trait Workspace extends js.Object {
    var VolumeEncryptionKey: VolumeEncryptionKey
    var DirectoryId: DirectoryId
    var UserName: UserName
    var BundleId: BundleId
    var ErrorCode: WorkspaceErrorCode
    var UserVolumeEncryptionEnabled: BooleanObject
    var IpAddress: IpAddress
    var ComputerName: ComputerName
    var WorkspaceId: WorkspaceId
    var RootVolumeEncryptionEnabled: BooleanObject
    var WorkspaceProperties: WorkspaceProperties
    var State: WorkspaceState
    var ErrorMessage: Description
    var SubnetId: SubnetId
  }

  object Workspace {
    def apply(
      VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey] = js.undefined,
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined,
      BundleId: js.UndefOr[BundleId] = js.undefined,
      ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined,
      UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined,
      ComputerName: js.UndefOr[ComputerName] = js.undefined,
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
      RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
      WorkspaceProperties: js.UndefOr[WorkspaceProperties] = js.undefined,
      State: js.UndefOr[WorkspaceState] = js.undefined,
      ErrorMessage: js.UndefOr[Description] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined
    ): Workspace = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeEncryptionKey" -> VolumeEncryptionKey.map { x => x: js.Any }),
        ("DirectoryId" -> DirectoryId.map { x => x: js.Any }),
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("BundleId" -> BundleId.map { x => x: js.Any }),
        ("ErrorCode" -> ErrorCode.map { x => x: js.Any }),
        ("UserVolumeEncryptionEnabled" -> UserVolumeEncryptionEnabled.map { x => x: js.Any }),
        ("IpAddress" -> IpAddress.map { x => x: js.Any }),
        ("ComputerName" -> ComputerName.map { x => x: js.Any }),
        ("WorkspaceId" -> WorkspaceId.map { x => x: js.Any }),
        ("RootVolumeEncryptionEnabled" -> RootVolumeEncryptionEnabled.map { x => x: js.Any }),
        ("WorkspaceProperties" -> WorkspaceProperties.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ErrorMessage" -> ErrorMessage.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Workspace]
    }
  }

  /**
   * <p>Contains information about a WorkSpace bundle.</p>
   */
  @js.native
  trait WorkspaceBundle extends js.Object {
    var BundleId: BundleId
    var Name: NonEmptyString
    var Description: Description
    var UserStorage: UserStorage
    var Owner: BundleOwner
    var ComputeType: ComputeType
  }

  object WorkspaceBundle {
    def apply(
      BundleId: js.UndefOr[BundleId] = js.undefined,
      Name: js.UndefOr[NonEmptyString] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      UserStorage: js.UndefOr[UserStorage] = js.undefined,
      Owner: js.UndefOr[BundleOwner] = js.undefined,
      ComputeType: js.UndefOr[ComputeType] = js.undefined
    ): WorkspaceBundle = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BundleId" -> BundleId.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("UserStorage" -> UserStorage.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("ComputeType" -> ComputeType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceBundle]
    }
  }

  /**
   * <p>Describes the connection status of a WorkSpace.</p>
   */
  @js.native
  trait WorkspaceConnectionStatus extends js.Object {
    var WorkspaceId: WorkspaceId
    var ConnectionState: ConnectionState
    var ConnectionStateCheckTimestamp: Timestamp
    var LastKnownUserConnectionTimestamp: Timestamp
  }

  object WorkspaceConnectionStatus {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
      ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
      ConnectionStateCheckTimestamp: js.UndefOr[Timestamp] = js.undefined,
      LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): WorkspaceConnectionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("WorkspaceId" -> WorkspaceId.map { x => x: js.Any }),
        ("ConnectionState" -> ConnectionState.map { x => x: js.Any }),
        ("ConnectionStateCheckTimestamp" -> ConnectionStateCheckTimestamp.map { x => x: js.Any }),
        ("LastKnownUserConnectionTimestamp" -> LastKnownUserConnectionTimestamp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceConnectionStatus]
    }
  }

  /**
   * <p>Contains information about an AWS Directory Service directory for use with Amazon WorkSpaces.</p>
   */
  @js.native
  trait WorkspaceDirectory extends js.Object {
    var Alias: Alias
    var DirectoryId: DirectoryId
    var CustomerUserName: UserName
    var WorkspaceCreationProperties: DefaultWorkspaceCreationProperties
    var DirectoryType: WorkspaceDirectoryType
    var RegistrationCode: RegistrationCode
    var IamRoleId: ARN
    var DirectoryName: DirectoryName
    var SubnetIds: SubnetIds
    var State: WorkspaceDirectoryState
    var DnsIpAddresses: DnsIpAddresses
    var WorkspaceSecurityGroupId: SecurityGroupId
  }

  object WorkspaceDirectory {
    def apply(
      Alias: js.UndefOr[Alias] = js.undefined,
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      CustomerUserName: js.UndefOr[UserName] = js.undefined,
      WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties] = js.undefined,
      DirectoryType: js.UndefOr[WorkspaceDirectoryType] = js.undefined,
      RegistrationCode: js.UndefOr[RegistrationCode] = js.undefined,
      IamRoleId: js.UndefOr[ARN] = js.undefined,
      DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      State: js.UndefOr[WorkspaceDirectoryState] = js.undefined,
      DnsIpAddresses: js.UndefOr[DnsIpAddresses] = js.undefined,
      WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined
    ): WorkspaceDirectory = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Alias" -> Alias.map { x => x: js.Any }),
        ("DirectoryId" -> DirectoryId.map { x => x: js.Any }),
        ("CustomerUserName" -> CustomerUserName.map { x => x: js.Any }),
        ("WorkspaceCreationProperties" -> WorkspaceCreationProperties.map { x => x: js.Any }),
        ("DirectoryType" -> DirectoryType.map { x => x: js.Any }),
        ("RegistrationCode" -> RegistrationCode.map { x => x: js.Any }),
        ("IamRoleId" -> IamRoleId.map { x => x: js.Any }),
        ("DirectoryName" -> DirectoryName.map { x => x: js.Any }),
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("DnsIpAddresses" -> DnsIpAddresses.map { x => x: js.Any }),
        ("WorkspaceSecurityGroupId" -> WorkspaceSecurityGroupId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceDirectory]
    }
  }


  object WorkspaceDirectoryStateEnum {
    val REGISTERING = "REGISTERING"
    val REGISTERED = "REGISTERED"
    val DEREGISTERING = "DEREGISTERING"
    val DEREGISTERED = "DEREGISTERED"
    val ERROR = "ERROR"

    val values = IndexedSeq(REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR)
  }


  object WorkspaceDirectoryTypeEnum {
    val `SIMPLE_AD` = "SIMPLE_AD"
    val `AD_CONNECTOR` = "AD_CONNECTOR"

    val values = IndexedSeq(`SIMPLE_AD`, `AD_CONNECTOR`)
  }

  /**
   * <p>Describes the properties of a WorkSpace.</p>
   */
  @js.native
  trait WorkspaceProperties extends js.Object {
    var RunningMode: RunningMode
    var RunningModeAutoStopTimeoutInMinutes: RunningModeAutoStopTimeoutInMinutes
  }

  object WorkspaceProperties {
    def apply(
      RunningMode: js.UndefOr[RunningMode] = js.undefined,
      RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes] = js.undefined
    ): WorkspaceProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RunningMode" -> RunningMode.map { x => x: js.Any }),
        ("RunningModeAutoStopTimeoutInMinutes" -> RunningModeAutoStopTimeoutInMinutes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceProperties]
    }
  }

  /**
   * <p>Contains information about a WorkSpace creation request.</p>
   */
  @js.native
  trait WorkspaceRequest extends js.Object {
    var VolumeEncryptionKey: VolumeEncryptionKey
    var DirectoryId: DirectoryId
    var UserName: UserName
    var BundleId: BundleId
    var UserVolumeEncryptionEnabled: BooleanObject
    var RootVolumeEncryptionEnabled: BooleanObject
    var WorkspaceProperties: WorkspaceProperties
    var Tags: TagList
  }

  object WorkspaceRequest {
    def apply(
      VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey] = js.undefined,
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined,
      BundleId: js.UndefOr[BundleId] = js.undefined,
      UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
      RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
      WorkspaceProperties: js.UndefOr[WorkspaceProperties] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): WorkspaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeEncryptionKey" -> VolumeEncryptionKey.map { x => x: js.Any }),
        ("DirectoryId" -> DirectoryId.map { x => x: js.Any }),
        ("UserName" -> UserName.map { x => x: js.Any }),
        ("BundleId" -> BundleId.map { x => x: js.Any }),
        ("UserVolumeEncryptionEnabled" -> UserVolumeEncryptionEnabled.map { x => x: js.Any }),
        ("RootVolumeEncryptionEnabled" -> RootVolumeEncryptionEnabled.map { x => x: js.Any }),
        ("WorkspaceProperties" -> WorkspaceProperties.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceRequest]
    }
  }


  object WorkspaceStateEnum {
    val PENDING = "PENDING"
    val AVAILABLE = "AVAILABLE"
    val IMPAIRED = "IMPAIRED"
    val UNHEALTHY = "UNHEALTHY"
    val REBOOTING = "REBOOTING"
    val STARTING = "STARTING"
    val REBUILDING = "REBUILDING"
    val MAINTENANCE = "MAINTENANCE"
    val TERMINATING = "TERMINATING"
    val TERMINATED = "TERMINATED"
    val SUSPENDED = "SUSPENDED"
    val STOPPING = "STOPPING"
    val STOPPED = "STOPPED"
    val ERROR = "ERROR"

    val values = IndexedSeq(PENDING, AVAILABLE, IMPAIRED, UNHEALTHY, REBOOTING, STARTING, REBUILDING, MAINTENANCE, TERMINATING, TERMINATED, SUSPENDED, STOPPING, STOPPED, ERROR)
  }
}
