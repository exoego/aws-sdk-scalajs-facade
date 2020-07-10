package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object workspaces {
  type ARN = String
  type AccountModificationList = js.Array[AccountModification]
  type Alias = String
  type BooleanObject = Boolean
  type BundleId = String
  type BundleIdList = js.Array[BundleId]
  type BundleList = js.Array[WorkspaceBundle]
  type BundleOwner = String
  type ClientPropertiesList = js.Array[ClientPropertiesResult]
  type ComputerName = String
  type DedicatedTenancyCidrRangeList = js.Array[DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange = String
  type DefaultOu = String
  type Description = String
  type DirectoryId = String
  type DirectoryIdList = js.Array[DirectoryId]
  type DirectoryList = js.Array[WorkspaceDirectory]
  type DirectoryName = String
  type DnsIpAddresses = js.Array[IpAddress]
  type Ec2ImageId = String
  type ErrorType = String
  type FailedCreateWorkspaceRequests = js.Array[FailedCreateWorkspaceRequest]
  type FailedRebootWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedRebuildWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStartWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStopWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedTerminateWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type IpAddress = String
  type IpGroupDesc = String
  type IpGroupId = String
  type IpGroupIdList = js.Array[IpGroupId]
  type IpGroupName = String
  type IpRevokedRuleList = js.Array[IpRule]
  type IpRule = String
  type IpRuleDesc = String
  type IpRuleList = js.Array[IpRuleItem]
  type Limit = Int
  type ManagementCidrRangeConstraint = String
  type ManagementCidrRangeMaxResults = Int
  type ModificationStateList = js.Array[ModificationState]
  type NonEmptyString = String
  type PaginationToken = String
  type RebootWorkspaceRequests = js.Array[RebootRequest]
  type RebuildWorkspaceRequests = js.Array[RebuildRequest]
  type Region = String
  type RegistrationCode = String
  type ResourceIdList = js.Array[NonEmptyString]
  type RootVolumeSizeGib = Int
  type RunningModeAutoStopTimeoutInMinutes = Int
  type SecurityGroupId = String
  type SnapshotList = js.Array[Snapshot]
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
  type UserVolumeSizeGib = Int
  type VolumeEncryptionKey = String
  type WorkspaceConnectionStatusList = js.Array[WorkspaceConnectionStatus]
  type WorkspaceErrorCode = String
  type WorkspaceId = String
  type WorkspaceIdList = js.Array[WorkspaceId]
  type WorkspaceImageDescription = String
  type WorkspaceImageErrorCode = String
  type WorkspaceImageId = String
  type WorkspaceImageIdList = js.Array[WorkspaceImageId]
  type WorkspaceImageList = js.Array[WorkspaceImage]
  type WorkspaceImageName = String
  type WorkspaceList = js.Array[Workspace]
  type WorkspaceRequestList = js.Array[WorkspaceRequest]
  type WorkspacesIpGroupsList = js.Array[WorkspacesIpGroup]

  implicit final class WorkSpacesOps(private val service: WorkSpaces) extends AnyVal {

    @inline def associateIpGroupsFuture(params: AssociateIpGroupsRequest): Future[AssociateIpGroupsResult] =
      service.associateIpGroups(params).promise().toFuture
    @inline def authorizeIpRulesFuture(params: AuthorizeIpRulesRequest): Future[AuthorizeIpRulesResult] =
      service.authorizeIpRules(params).promise().toFuture
    @inline def copyWorkspaceImageFuture(params: CopyWorkspaceImageRequest): Future[CopyWorkspaceImageResult] =
      service.copyWorkspaceImage(params).promise().toFuture
    @inline def createIpGroupFuture(params: CreateIpGroupRequest): Future[CreateIpGroupResult] =
      service.createIpGroup(params).promise().toFuture
    @inline def createTagsFuture(params: CreateTagsRequest): Future[CreateTagsResult] =
      service.createTags(params).promise().toFuture
    @inline def createWorkspacesFuture(params: CreateWorkspacesRequest): Future[CreateWorkspacesResult] =
      service.createWorkspaces(params).promise().toFuture
    @inline def deleteIpGroupFuture(params: DeleteIpGroupRequest): Future[DeleteIpGroupResult] =
      service.deleteIpGroup(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsRequest): Future[DeleteTagsResult] =
      service.deleteTags(params).promise().toFuture
    @inline def deleteWorkspaceImageFuture(params: DeleteWorkspaceImageRequest): Future[DeleteWorkspaceImageResult] =
      service.deleteWorkspaceImage(params).promise().toFuture
    @inline def deregisterWorkspaceDirectoryFuture(
        params: DeregisterWorkspaceDirectoryRequest
    ): Future[DeregisterWorkspaceDirectoryResult] = service.deregisterWorkspaceDirectory(params).promise().toFuture
    @inline def describeAccountFuture(params: DescribeAccountRequest): Future[DescribeAccountResult] =
      service.describeAccount(params).promise().toFuture
    @inline def describeAccountModificationsFuture(
        params: DescribeAccountModificationsRequest
    ): Future[DescribeAccountModificationsResult] = service.describeAccountModifications(params).promise().toFuture
    @inline def describeClientPropertiesFuture(
        params: DescribeClientPropertiesRequest
    ): Future[DescribeClientPropertiesResult] = service.describeClientProperties(params).promise().toFuture
    @inline def describeIpGroupsFuture(params: DescribeIpGroupsRequest): Future[DescribeIpGroupsResult] =
      service.describeIpGroups(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResult] =
      service.describeTags(params).promise().toFuture
    @inline def describeWorkspaceBundlesFuture(
        params: DescribeWorkspaceBundlesRequest
    ): Future[DescribeWorkspaceBundlesResult] = service.describeWorkspaceBundles(params).promise().toFuture
    @inline def describeWorkspaceDirectoriesFuture(
        params: DescribeWorkspaceDirectoriesRequest
    ): Future[DescribeWorkspaceDirectoriesResult] = service.describeWorkspaceDirectories(params).promise().toFuture
    @inline def describeWorkspaceImagesFuture(
        params: DescribeWorkspaceImagesRequest
    ): Future[DescribeWorkspaceImagesResult] = service.describeWorkspaceImages(params).promise().toFuture
    @inline def describeWorkspaceSnapshotsFuture(
        params: DescribeWorkspaceSnapshotsRequest
    ): Future[DescribeWorkspaceSnapshotsResult] = service.describeWorkspaceSnapshots(params).promise().toFuture
    @inline def describeWorkspacesConnectionStatusFuture(
        params: DescribeWorkspacesConnectionStatusRequest
    ): Future[DescribeWorkspacesConnectionStatusResult] =
      service.describeWorkspacesConnectionStatus(params).promise().toFuture
    @inline def describeWorkspacesFuture(params: DescribeWorkspacesRequest): Future[DescribeWorkspacesResult] =
      service.describeWorkspaces(params).promise().toFuture
    @inline def disassociateIpGroupsFuture(params: DisassociateIpGroupsRequest): Future[DisassociateIpGroupsResult] =
      service.disassociateIpGroups(params).promise().toFuture
    @inline def importWorkspaceImageFuture(params: ImportWorkspaceImageRequest): Future[ImportWorkspaceImageResult] =
      service.importWorkspaceImage(params).promise().toFuture
    @inline def listAvailableManagementCidrRangesFuture(
        params: ListAvailableManagementCidrRangesRequest
    ): Future[ListAvailableManagementCidrRangesResult] =
      service.listAvailableManagementCidrRanges(params).promise().toFuture
    @inline def migrateWorkspaceFuture(params: MigrateWorkspaceRequest): Future[MigrateWorkspaceResult] =
      service.migrateWorkspace(params).promise().toFuture
    @inline def modifyAccountFuture(params: ModifyAccountRequest): Future[ModifyAccountResult] =
      service.modifyAccount(params).promise().toFuture
    @inline def modifyClientPropertiesFuture(
        params: ModifyClientPropertiesRequest
    ): Future[ModifyClientPropertiesResult] = service.modifyClientProperties(params).promise().toFuture
    @inline def modifySelfservicePermissionsFuture(
        params: ModifySelfservicePermissionsRequest
    ): Future[ModifySelfservicePermissionsResult] = service.modifySelfservicePermissions(params).promise().toFuture
    @inline def modifyWorkspaceAccessPropertiesFuture(
        params: ModifyWorkspaceAccessPropertiesRequest
    ): Future[ModifyWorkspaceAccessPropertiesResult] =
      service.modifyWorkspaceAccessProperties(params).promise().toFuture
    @inline def modifyWorkspaceCreationPropertiesFuture(
        params: ModifyWorkspaceCreationPropertiesRequest
    ): Future[ModifyWorkspaceCreationPropertiesResult] =
      service.modifyWorkspaceCreationProperties(params).promise().toFuture
    @inline def modifyWorkspacePropertiesFuture(
        params: ModifyWorkspacePropertiesRequest
    ): Future[ModifyWorkspacePropertiesResult] = service.modifyWorkspaceProperties(params).promise().toFuture
    @inline def modifyWorkspaceStateFuture(params: ModifyWorkspaceStateRequest): Future[ModifyWorkspaceStateResult] =
      service.modifyWorkspaceState(params).promise().toFuture
    @inline def rebootWorkspacesFuture(params: RebootWorkspacesRequest): Future[RebootWorkspacesResult] =
      service.rebootWorkspaces(params).promise().toFuture
    @inline def rebuildWorkspacesFuture(params: RebuildWorkspacesRequest): Future[RebuildWorkspacesResult] =
      service.rebuildWorkspaces(params).promise().toFuture
    @inline def registerWorkspaceDirectoryFuture(
        params: RegisterWorkspaceDirectoryRequest
    ): Future[RegisterWorkspaceDirectoryResult] = service.registerWorkspaceDirectory(params).promise().toFuture
    @inline def restoreWorkspaceFuture(params: RestoreWorkspaceRequest): Future[RestoreWorkspaceResult] =
      service.restoreWorkspace(params).promise().toFuture
    @inline def revokeIpRulesFuture(params: RevokeIpRulesRequest): Future[RevokeIpRulesResult] =
      service.revokeIpRules(params).promise().toFuture
    @inline def startWorkspacesFuture(params: StartWorkspacesRequest): Future[StartWorkspacesResult] =
      service.startWorkspaces(params).promise().toFuture
    @inline def stopWorkspacesFuture(params: StopWorkspacesRequest): Future[StopWorkspacesResult] =
      service.stopWorkspaces(params).promise().toFuture
    @inline def terminateWorkspacesFuture(params: TerminateWorkspacesRequest): Future[TerminateWorkspacesResult] =
      service.terminateWorkspaces(params).promise().toFuture
    @inline def updateRulesOfIpGroupFuture(params: UpdateRulesOfIpGroupRequest): Future[UpdateRulesOfIpGroupResult] =
      service.updateRulesOfIpGroup(params).promise().toFuture
  }
}

package workspaces {
  @js.native
  @JSImport("aws-sdk", "WorkSpaces", "AWS.WorkSpaces")
  class WorkSpaces() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateIpGroups(params: AssociateIpGroupsRequest): Request[AssociateIpGroupsResult] = js.native
    def authorizeIpRules(params: AuthorizeIpRulesRequest): Request[AuthorizeIpRulesResult] = js.native
    def copyWorkspaceImage(params: CopyWorkspaceImageRequest): Request[CopyWorkspaceImageResult] = js.native
    def createIpGroup(params: CreateIpGroupRequest): Request[CreateIpGroupResult] = js.native
    def createTags(params: CreateTagsRequest): Request[CreateTagsResult] = js.native
    def createWorkspaces(params: CreateWorkspacesRequest): Request[CreateWorkspacesResult] = js.native
    def deleteIpGroup(params: DeleteIpGroupRequest): Request[DeleteIpGroupResult] = js.native
    def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResult] = js.native
    def deleteWorkspaceImage(params: DeleteWorkspaceImageRequest): Request[DeleteWorkspaceImageResult] = js.native
    def deregisterWorkspaceDirectory(
        params: DeregisterWorkspaceDirectoryRequest
    ): Request[DeregisterWorkspaceDirectoryResult] = js.native
    def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResult] = js.native
    def describeAccountModifications(
        params: DescribeAccountModificationsRequest
    ): Request[DescribeAccountModificationsResult] = js.native
    def describeClientProperties(params: DescribeClientPropertiesRequest): Request[DescribeClientPropertiesResult] =
      js.native
    def describeIpGroups(params: DescribeIpGroupsRequest): Request[DescribeIpGroupsResult] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult] = js.native
    def describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest): Request[DescribeWorkspaceBundlesResult] =
      js.native
    def describeWorkspaceDirectories(
        params: DescribeWorkspaceDirectoriesRequest
    ): Request[DescribeWorkspaceDirectoriesResult] = js.native
    def describeWorkspaceImages(params: DescribeWorkspaceImagesRequest): Request[DescribeWorkspaceImagesResult] =
      js.native
    def describeWorkspaceSnapshots(
        params: DescribeWorkspaceSnapshotsRequest
    ): Request[DescribeWorkspaceSnapshotsResult] = js.native
    def describeWorkspaces(params: DescribeWorkspacesRequest): Request[DescribeWorkspacesResult] = js.native
    def describeWorkspacesConnectionStatus(
        params: DescribeWorkspacesConnectionStatusRequest
    ): Request[DescribeWorkspacesConnectionStatusResult] = js.native
    def disassociateIpGroups(params: DisassociateIpGroupsRequest): Request[DisassociateIpGroupsResult] = js.native
    def importWorkspaceImage(params: ImportWorkspaceImageRequest): Request[ImportWorkspaceImageResult] = js.native
    def listAvailableManagementCidrRanges(
        params: ListAvailableManagementCidrRangesRequest
    ): Request[ListAvailableManagementCidrRangesResult] = js.native
    def migrateWorkspace(params: MigrateWorkspaceRequest): Request[MigrateWorkspaceResult] = js.native
    def modifyAccount(params: ModifyAccountRequest): Request[ModifyAccountResult] = js.native
    def modifyClientProperties(params: ModifyClientPropertiesRequest): Request[ModifyClientPropertiesResult] = js.native
    def modifySelfservicePermissions(
        params: ModifySelfservicePermissionsRequest
    ): Request[ModifySelfservicePermissionsResult] = js.native
    def modifyWorkspaceAccessProperties(
        params: ModifyWorkspaceAccessPropertiesRequest
    ): Request[ModifyWorkspaceAccessPropertiesResult] = js.native
    def modifyWorkspaceCreationProperties(
        params: ModifyWorkspaceCreationPropertiesRequest
    ): Request[ModifyWorkspaceCreationPropertiesResult] = js.native
    def modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest): Request[ModifyWorkspacePropertiesResult] =
      js.native
    def modifyWorkspaceState(params: ModifyWorkspaceStateRequest): Request[ModifyWorkspaceStateResult] = js.native
    def rebootWorkspaces(params: RebootWorkspacesRequest): Request[RebootWorkspacesResult] = js.native
    def rebuildWorkspaces(params: RebuildWorkspacesRequest): Request[RebuildWorkspacesResult] = js.native
    def registerWorkspaceDirectory(
        params: RegisterWorkspaceDirectoryRequest
    ): Request[RegisterWorkspaceDirectoryResult] = js.native
    def restoreWorkspace(params: RestoreWorkspaceRequest): Request[RestoreWorkspaceResult] = js.native
    def revokeIpRules(params: RevokeIpRulesRequest): Request[RevokeIpRulesResult] = js.native
    def startWorkspaces(params: StartWorkspacesRequest): Request[StartWorkspacesResult] = js.native
    def stopWorkspaces(params: StopWorkspacesRequest): Request[StopWorkspacesResult] = js.native
    def terminateWorkspaces(params: TerminateWorkspacesRequest): Request[TerminateWorkspacesResult] = js.native
    def updateRulesOfIpGroup(params: UpdateRulesOfIpGroupRequest): Request[UpdateRulesOfIpGroupResult] = js.native
  }

  @js.native
  sealed trait AccessPropertyValue extends js.Any
  object AccessPropertyValue extends js.Object {
    val ALLOW = "ALLOW".asInstanceOf[AccessPropertyValue]
    val DENY = "DENY".asInstanceOf[AccessPropertyValue]

    val values = js.Object.freeze(js.Array(ALLOW, DENY))
  }

  /**
    * Describes a modification to the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  @js.native
  trait AccountModification extends js.Object {
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum]
    var ErrorCode: js.UndefOr[WorkspaceErrorCode]
    var ErrorMessage: js.UndefOr[Description]
    var ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum]
    var StartTime: js.UndefOr[Timestamp]
  }

  object AccountModification {
    @inline
    def apply(
        DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined,
        DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined,
        ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): AccountModification = {
      val __obj = js.Dynamic.literal()
      DedicatedTenancyManagementCidrRange.foreach(__v =>
        __obj.updateDynamic("DedicatedTenancyManagementCidrRange")(__v.asInstanceOf[js.Any])
      )
      DedicatedTenancySupport.foreach(__v => __obj.updateDynamic("DedicatedTenancySupport")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ModificationState.foreach(__v => __obj.updateDynamic("ModificationState")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountModification]
    }
  }

  @js.native
  trait AssociateIpGroupsRequest extends js.Object {
    var DirectoryId: DirectoryId
    var GroupIds: IpGroupIdList
  }

  object AssociateIpGroupsRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        GroupIds: IpGroupIdList
    ): AssociateIpGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "GroupIds" -> GroupIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateIpGroupsRequest]
    }
  }

  @js.native
  trait AssociateIpGroupsResult extends js.Object {}

  object AssociateIpGroupsResult {
    @inline
    def apply(
    ): AssociateIpGroupsResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateIpGroupsResult]
    }
  }

  @js.native
  trait AuthorizeIpRulesRequest extends js.Object {
    var GroupId: IpGroupId
    var UserRules: IpRuleList
  }

  object AuthorizeIpRulesRequest {
    @inline
    def apply(
        GroupId: IpGroupId,
        UserRules: IpRuleList
    ): AuthorizeIpRulesRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "UserRules" -> UserRules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AuthorizeIpRulesRequest]
    }
  }

  @js.native
  trait AuthorizeIpRulesResult extends js.Object {}

  object AuthorizeIpRulesResult {
    @inline
    def apply(
    ): AuthorizeIpRulesResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AuthorizeIpRulesResult]
    }
  }

  /**
    * Describes an Amazon WorkSpaces client.
    */
  @js.native
  trait ClientProperties extends js.Object {
    var ReconnectEnabled: js.UndefOr[ReconnectEnum]
  }

  object ClientProperties {
    @inline
    def apply(
        ReconnectEnabled: js.UndefOr[ReconnectEnum] = js.undefined
    ): ClientProperties = {
      val __obj = js.Dynamic.literal()
      ReconnectEnabled.foreach(__v => __obj.updateDynamic("ReconnectEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientProperties]
    }
  }

  /**
    * Information about the Amazon WorkSpaces client.
    */
  @js.native
  trait ClientPropertiesResult extends js.Object {
    var ClientProperties: js.UndefOr[ClientProperties]
    var ResourceId: js.UndefOr[NonEmptyString]
  }

  object ClientPropertiesResult {
    @inline
    def apply(
        ClientProperties: js.UndefOr[ClientProperties] = js.undefined,
        ResourceId: js.UndefOr[NonEmptyString] = js.undefined
    ): ClientPropertiesResult = {
      val __obj = js.Dynamic.literal()
      ClientProperties.foreach(__v => __obj.updateDynamic("ClientProperties")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientPropertiesResult]
    }
  }

  @js.native
  sealed trait Compute extends js.Any
  object Compute extends js.Object {
    val VALUE = "VALUE".asInstanceOf[Compute]
    val STANDARD = "STANDARD".asInstanceOf[Compute]
    val PERFORMANCE = "PERFORMANCE".asInstanceOf[Compute]
    val POWER = "POWER".asInstanceOf[Compute]
    val GRAPHICS = "GRAPHICS".asInstanceOf[Compute]
    val POWERPRO = "POWERPRO".asInstanceOf[Compute]
    val GRAPHICSPRO = "GRAPHICSPRO".asInstanceOf[Compute]

    val values = js.Object.freeze(js.Array(VALUE, STANDARD, PERFORMANCE, POWER, GRAPHICS, POWERPRO, GRAPHICSPRO))
  }

  /**
    * Describes the compute type.
    */
  @js.native
  trait ComputeType extends js.Object {
    var Name: js.UndefOr[Compute]
  }

  object ComputeType {
    @inline
    def apply(
        Name: js.UndefOr[Compute] = js.undefined
    ): ComputeType = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeType]
    }
  }

  @js.native
  sealed trait ConnectionState extends js.Any
  object ConnectionState extends js.Object {
    val CONNECTED = "CONNECTED".asInstanceOf[ConnectionState]
    val DISCONNECTED = "DISCONNECTED".asInstanceOf[ConnectionState]
    val UNKNOWN = "UNKNOWN".asInstanceOf[ConnectionState]

    val values = js.Object.freeze(js.Array(CONNECTED, DISCONNECTED, UNKNOWN))
  }

  @js.native
  trait CopyWorkspaceImageRequest extends js.Object {
    var Name: WorkspaceImageName
    var SourceImageId: WorkspaceImageId
    var SourceRegion: Region
    var Description: js.UndefOr[WorkspaceImageDescription]
    var Tags: js.UndefOr[TagList]
  }

  object CopyWorkspaceImageRequest {
    @inline
    def apply(
        Name: WorkspaceImageName,
        SourceImageId: WorkspaceImageId,
        SourceRegion: Region,
        Description: js.UndefOr[WorkspaceImageDescription] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CopyWorkspaceImageRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceImageId" -> SourceImageId.asInstanceOf[js.Any],
        "SourceRegion" -> SourceRegion.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyWorkspaceImageRequest]
    }
  }

  @js.native
  trait CopyWorkspaceImageResult extends js.Object {
    var ImageId: js.UndefOr[WorkspaceImageId]
  }

  object CopyWorkspaceImageResult {
    @inline
    def apply(
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
    ): CopyWorkspaceImageResult = {
      val __obj = js.Dynamic.literal()
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyWorkspaceImageResult]
    }
  }

  @js.native
  trait CreateIpGroupRequest extends js.Object {
    var GroupName: IpGroupName
    var GroupDesc: js.UndefOr[IpGroupDesc]
    var Tags: js.UndefOr[TagList]
    var UserRules: js.UndefOr[IpRuleList]
  }

  object CreateIpGroupRequest {
    @inline
    def apply(
        GroupName: IpGroupName,
        GroupDesc: js.UndefOr[IpGroupDesc] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UserRules: js.UndefOr[IpRuleList] = js.undefined
    ): CreateIpGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      GroupDesc.foreach(__v => __obj.updateDynamic("GroupDesc")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserRules.foreach(__v => __obj.updateDynamic("UserRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIpGroupRequest]
    }
  }

  @js.native
  trait CreateIpGroupResult extends js.Object {
    var GroupId: js.UndefOr[IpGroupId]
  }

  object CreateIpGroupResult {
    @inline
    def apply(
        GroupId: js.UndefOr[IpGroupId] = js.undefined
    ): CreateIpGroupResult = {
      val __obj = js.Dynamic.literal()
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIpGroupResult]
    }
  }

  @js.native
  trait CreateTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
    var Tags: TagList
  }

  object CreateTagsRequest {
    @inline
    def apply(
        ResourceId: NonEmptyString,
        Tags: TagList
    ): CreateTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTagsRequest]
    }
  }

  @js.native
  trait CreateTagsResult extends js.Object {}

  object CreateTagsResult {
    @inline
    def apply(
    ): CreateTagsResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateTagsResult]
    }
  }

  @js.native
  trait CreateWorkspacesRequest extends js.Object {
    var Workspaces: WorkspaceRequestList
  }

  object CreateWorkspacesRequest {
    @inline
    def apply(
        Workspaces: WorkspaceRequestList
    ): CreateWorkspacesRequest = {
      val __obj = js.Dynamic.literal(
        "Workspaces" -> Workspaces.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateWorkspacesRequest]
    }
  }

  @js.native
  trait CreateWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests]
    var PendingRequests: js.UndefOr[WorkspaceList]
  }

  object CreateWorkspacesResult {
    @inline
    def apply(
        FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests] = js.undefined,
        PendingRequests: js.UndefOr[WorkspaceList] = js.undefined
    ): CreateWorkspacesResult = {
      val __obj = js.Dynamic.literal()
      FailedRequests.foreach(__v => __obj.updateDynamic("FailedRequests")(__v.asInstanceOf[js.Any]))
      PendingRequests.foreach(__v => __obj.updateDynamic("PendingRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkspacesResult]
    }
  }

  @js.native
  sealed trait DedicatedTenancyModificationStateEnum extends js.Any
  object DedicatedTenancyModificationStateEnum extends js.Object {
    val PENDING = "PENDING".asInstanceOf[DedicatedTenancyModificationStateEnum]
    val COMPLETED = "COMPLETED".asInstanceOf[DedicatedTenancyModificationStateEnum]
    val FAILED = "FAILED".asInstanceOf[DedicatedTenancyModificationStateEnum]

    val values = js.Object.freeze(js.Array(PENDING, COMPLETED, FAILED))
  }

  @js.native
  sealed trait DedicatedTenancySupportEnum extends js.Any
  object DedicatedTenancySupportEnum extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[DedicatedTenancySupportEnum]

    val values = js.Object.freeze(js.Array(ENABLED))
  }

  @js.native
  sealed trait DedicatedTenancySupportResultEnum extends js.Any
  object DedicatedTenancySupportResultEnum extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[DedicatedTenancySupportResultEnum]
    val DISABLED = "DISABLED".asInstanceOf[DedicatedTenancySupportResultEnum]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Describes the default values that are used to create WorkSpaces. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html|Update Directory Details for Your WorkSpaces]].
    */
  @js.native
  trait DefaultWorkspaceCreationProperties extends js.Object {
    var CustomSecurityGroupId: js.UndefOr[SecurityGroupId]
    var DefaultOu: js.UndefOr[DefaultOu]
    var EnableInternetAccess: js.UndefOr[BooleanObject]
    var EnableMaintenanceMode: js.UndefOr[BooleanObject]
    var EnableWorkDocs: js.UndefOr[BooleanObject]
    var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject]
  }

  object DefaultWorkspaceCreationProperties {
    @inline
    def apply(
        CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
        DefaultOu: js.UndefOr[DefaultOu] = js.undefined,
        EnableInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
        EnableMaintenanceMode: js.UndefOr[BooleanObject] = js.undefined,
        EnableWorkDocs: js.UndefOr[BooleanObject] = js.undefined,
        UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.undefined
    ): DefaultWorkspaceCreationProperties = {
      val __obj = js.Dynamic.literal()
      CustomSecurityGroupId.foreach(__v => __obj.updateDynamic("CustomSecurityGroupId")(__v.asInstanceOf[js.Any]))
      DefaultOu.foreach(__v => __obj.updateDynamic("DefaultOu")(__v.asInstanceOf[js.Any]))
      EnableInternetAccess.foreach(__v => __obj.updateDynamic("EnableInternetAccess")(__v.asInstanceOf[js.Any]))
      EnableMaintenanceMode.foreach(__v => __obj.updateDynamic("EnableMaintenanceMode")(__v.asInstanceOf[js.Any]))
      EnableWorkDocs.foreach(__v => __obj.updateDynamic("EnableWorkDocs")(__v.asInstanceOf[js.Any]))
      UserEnabledAsLocalAdministrator.foreach(__v =>
        __obj.updateDynamic("UserEnabledAsLocalAdministrator")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DefaultWorkspaceCreationProperties]
    }
  }

  @js.native
  trait DeleteIpGroupRequest extends js.Object {
    var GroupId: IpGroupId
  }

  object DeleteIpGroupRequest {
    @inline
    def apply(
        GroupId: IpGroupId
    ): DeleteIpGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIpGroupRequest]
    }
  }

  @js.native
  trait DeleteIpGroupResult extends js.Object {}

  object DeleteIpGroupResult {
    @inline
    def apply(
    ): DeleteIpGroupResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteIpGroupResult]
    }
  }

  @js.native
  trait DeleteTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
    var TagKeys: TagKeyList
  }

  object DeleteTagsRequest {
    @inline
    def apply(
        ResourceId: NonEmptyString,
        TagKeys: TagKeyList
    ): DeleteTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagsRequest]
    }
  }

  @js.native
  trait DeleteTagsResult extends js.Object {}

  object DeleteTagsResult {
    @inline
    def apply(
    ): DeleteTagsResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTagsResult]
    }
  }

  @js.native
  trait DeleteWorkspaceImageRequest extends js.Object {
    var ImageId: WorkspaceImageId
  }

  object DeleteWorkspaceImageRequest {
    @inline
    def apply(
        ImageId: WorkspaceImageId
    ): DeleteWorkspaceImageRequest = {
      val __obj = js.Dynamic.literal(
        "ImageId" -> ImageId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteWorkspaceImageRequest]
    }
  }

  @js.native
  trait DeleteWorkspaceImageResult extends js.Object {}

  object DeleteWorkspaceImageResult {
    @inline
    def apply(
    ): DeleteWorkspaceImageResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteWorkspaceImageResult]
    }
  }

  @js.native
  trait DeregisterWorkspaceDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  object DeregisterWorkspaceDirectoryRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId
    ): DeregisterWorkspaceDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterWorkspaceDirectoryRequest]
    }
  }

  @js.native
  trait DeregisterWorkspaceDirectoryResult extends js.Object {}

  object DeregisterWorkspaceDirectoryResult {
    @inline
    def apply(
    ): DeregisterWorkspaceDirectoryResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeregisterWorkspaceDirectoryResult]
    }
  }

  @js.native
  trait DescribeAccountModificationsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeAccountModificationsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeAccountModificationsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountModificationsRequest]
    }
  }

  @js.native
  trait DescribeAccountModificationsResult extends js.Object {
    var AccountModifications: js.UndefOr[AccountModificationList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeAccountModificationsResult {
    @inline
    def apply(
        AccountModifications: js.UndefOr[AccountModificationList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeAccountModificationsResult = {
      val __obj = js.Dynamic.literal()
      AccountModifications.foreach(__v => __obj.updateDynamic("AccountModifications")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountModificationsResult]
    }
  }

  @js.native
  trait DescribeAccountRequest extends js.Object {}

  object DescribeAccountRequest {
    @inline
    def apply(
    ): DescribeAccountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeAccountRequest]
    }
  }

  @js.native
  trait DescribeAccountResult extends js.Object {
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum]
  }

  object DescribeAccountResult {
    @inline
    def apply(
        DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined,
        DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined
    ): DescribeAccountResult = {
      val __obj = js.Dynamic.literal()
      DedicatedTenancyManagementCidrRange.foreach(__v =>
        __obj.updateDynamic("DedicatedTenancyManagementCidrRange")(__v.asInstanceOf[js.Any])
      )
      DedicatedTenancySupport.foreach(__v => __obj.updateDynamic("DedicatedTenancySupport")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountResult]
    }
  }

  @js.native
  trait DescribeClientPropertiesRequest extends js.Object {
    var ResourceIds: ResourceIdList
  }

  object DescribeClientPropertiesRequest {
    @inline
    def apply(
        ResourceIds: ResourceIdList
    ): DescribeClientPropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIds" -> ResourceIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeClientPropertiesRequest]
    }
  }

  @js.native
  trait DescribeClientPropertiesResult extends js.Object {
    var ClientPropertiesList: js.UndefOr[ClientPropertiesList]
  }

  object DescribeClientPropertiesResult {
    @inline
    def apply(
        ClientPropertiesList: js.UndefOr[ClientPropertiesList] = js.undefined
    ): DescribeClientPropertiesResult = {
      val __obj = js.Dynamic.literal()
      ClientPropertiesList.foreach(__v => __obj.updateDynamic("ClientPropertiesList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClientPropertiesResult]
    }
  }

  @js.native
  trait DescribeIpGroupsRequest extends js.Object {
    var GroupIds: js.UndefOr[IpGroupIdList]
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeIpGroupsRequest {
    @inline
    def apply(
        GroupIds: js.UndefOr[IpGroupIdList] = js.undefined,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeIpGroupsRequest = {
      val __obj = js.Dynamic.literal()
      GroupIds.foreach(__v => __obj.updateDynamic("GroupIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIpGroupsRequest]
    }
  }

  @js.native
  trait DescribeIpGroupsResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Result: js.UndefOr[WorkspacesIpGroupsList]
  }

  object DescribeIpGroupsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Result: js.UndefOr[WorkspacesIpGroupsList] = js.undefined
    ): DescribeIpGroupsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIpGroupsResult]
    }
  }

  @js.native
  trait DescribeTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
  }

  object DescribeTagsRequest {
    @inline
    def apply(
        ResourceId: NonEmptyString
    ): DescribeTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTagsRequest]
    }
  }

  @js.native
  trait DescribeTagsResult extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object DescribeTagsResult {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): DescribeTagsResult = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsResult]
    }
  }

  @js.native
  trait DescribeWorkspaceBundlesRequest extends js.Object {
    var BundleIds: js.UndefOr[BundleIdList]
    var NextToken: js.UndefOr[PaginationToken]
    var Owner: js.UndefOr[BundleOwner]
  }

  object DescribeWorkspaceBundlesRequest {
    @inline
    def apply(
        BundleIds: js.UndefOr[BundleIdList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Owner: js.UndefOr[BundleOwner] = js.undefined
    ): DescribeWorkspaceBundlesRequest = {
      val __obj = js.Dynamic.literal()
      BundleIds.foreach(__v => __obj.updateDynamic("BundleIds")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspaceBundlesRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceBundlesResult extends js.Object {
    var Bundles: js.UndefOr[BundleList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceBundlesResult {
    @inline
    def apply(
        Bundles: js.UndefOr[BundleList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceBundlesResult = {
      val __obj = js.Dynamic.literal()
      Bundles.foreach(__v => __obj.updateDynamic("Bundles")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspaceBundlesResult]
    }
  }

  @js.native
  trait DescribeWorkspaceDirectoriesRequest extends js.Object {
    var DirectoryIds: js.UndefOr[DirectoryIdList]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceDirectoriesRequest {
    @inline
    def apply(
        DirectoryIds: js.UndefOr[DirectoryIdList] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceDirectoriesRequest = {
      val __obj = js.Dynamic.literal()
      DirectoryIds.foreach(__v => __obj.updateDynamic("DirectoryIds")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspaceDirectoriesRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceDirectoriesResult extends js.Object {
    var Directories: js.UndefOr[DirectoryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceDirectoriesResult {
    @inline
    def apply(
        Directories: js.UndefOr[DirectoryList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceDirectoriesResult = {
      val __obj = js.Dynamic.literal()
      Directories.foreach(__v => __obj.updateDynamic("Directories")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspaceDirectoriesResult]
    }
  }

  @js.native
  trait DescribeWorkspaceImagesRequest extends js.Object {
    var ImageIds: js.UndefOr[WorkspaceImageIdList]
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceImagesRequest {
    @inline
    def apply(
        ImageIds: js.UndefOr[WorkspaceImageIdList] = js.undefined,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceImagesRequest = {
      val __obj = js.Dynamic.literal()
      ImageIds.foreach(__v => __obj.updateDynamic("ImageIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspaceImagesRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceImagesResult extends js.Object {
    var Images: js.UndefOr[WorkspaceImageList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceImagesResult {
    @inline
    def apply(
        Images: js.UndefOr[WorkspaceImageList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceImagesResult = {
      val __obj = js.Dynamic.literal()
      Images.foreach(__v => __obj.updateDynamic("Images")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspaceImagesResult]
    }
  }

  @js.native
  trait DescribeWorkspaceSnapshotsRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object DescribeWorkspaceSnapshotsRequest {
    @inline
    def apply(
        WorkspaceId: WorkspaceId
    ): DescribeWorkspaceSnapshotsRequest = {
      val __obj = js.Dynamic.literal(
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeWorkspaceSnapshotsRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceSnapshotsResult extends js.Object {
    var RebuildSnapshots: js.UndefOr[SnapshotList]
    var RestoreSnapshots: js.UndefOr[SnapshotList]
  }

  object DescribeWorkspaceSnapshotsResult {
    @inline
    def apply(
        RebuildSnapshots: js.UndefOr[SnapshotList] = js.undefined,
        RestoreSnapshots: js.UndefOr[SnapshotList] = js.undefined
    ): DescribeWorkspaceSnapshotsResult = {
      val __obj = js.Dynamic.literal()
      RebuildSnapshots.foreach(__v => __obj.updateDynamic("RebuildSnapshots")(__v.asInstanceOf[js.Any]))
      RestoreSnapshots.foreach(__v => __obj.updateDynamic("RestoreSnapshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspaceSnapshotsResult]
    }
  }

  @js.native
  trait DescribeWorkspacesConnectionStatusRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var WorkspaceIds: js.UndefOr[WorkspaceIdList]
  }

  object DescribeWorkspacesConnectionStatusRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined
    ): DescribeWorkspacesConnectionStatusRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkspaceIds.foreach(__v => __obj.updateDynamic("WorkspaceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspacesConnectionStatusRequest]
    }
  }

  @js.native
  trait DescribeWorkspacesConnectionStatusResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList]
  }

  object DescribeWorkspacesConnectionStatusResult {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.undefined
    ): DescribeWorkspacesConnectionStatusResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WorkspacesConnectionStatus.foreach(__v =>
        __obj.updateDynamic("WorkspacesConnectionStatus")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeWorkspacesConnectionStatusResult]
    }
  }

  @js.native
  trait DescribeWorkspacesRequest extends js.Object {
    var BundleId: js.UndefOr[BundleId]
    var DirectoryId: js.UndefOr[DirectoryId]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
    var UserName: js.UndefOr[UserName]
    var WorkspaceIds: js.UndefOr[WorkspaceIdList]
  }

  object DescribeWorkspacesRequest {
    @inline
    def apply(
        BundleId: js.UndefOr[BundleId] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined,
        WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined
    ): DescribeWorkspacesRequest = {
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      WorkspaceIds.foreach(__v => __obj.updateDynamic("WorkspaceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspacesRequest]
    }
  }

  @js.native
  trait DescribeWorkspacesResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Workspaces: js.UndefOr[WorkspaceList]
  }

  object DescribeWorkspacesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Workspaces: js.UndefOr[WorkspaceList] = js.undefined
    ): DescribeWorkspacesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Workspaces.foreach(__v => __obj.updateDynamic("Workspaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspacesResult]
    }
  }

  @js.native
  trait DisassociateIpGroupsRequest extends js.Object {
    var DirectoryId: DirectoryId
    var GroupIds: IpGroupIdList
  }

  object DisassociateIpGroupsRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        GroupIds: IpGroupIdList
    ): DisassociateIpGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "GroupIds" -> GroupIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateIpGroupsRequest]
    }
  }

  @js.native
  trait DisassociateIpGroupsResult extends js.Object {}

  object DisassociateIpGroupsResult {
    @inline
    def apply(
    ): DisassociateIpGroupsResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateIpGroupsResult]
    }
  }

  /**
    * Describes a WorkSpace that cannot be created.
    */
  @js.native
  trait FailedCreateWorkspaceRequest extends js.Object {
    var ErrorCode: js.UndefOr[ErrorType]
    var ErrorMessage: js.UndefOr[Description]
    var WorkspaceRequest: js.UndefOr[WorkspaceRequest]
  }

  object FailedCreateWorkspaceRequest {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorType] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        WorkspaceRequest: js.UndefOr[WorkspaceRequest] = js.undefined
    ): FailedCreateWorkspaceRequest = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      WorkspaceRequest.foreach(__v => __obj.updateDynamic("WorkspaceRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedCreateWorkspaceRequest]
    }
  }

  /**
    * Describes a WorkSpace that could not be rebooted. (<a>RebootWorkspaces</a>), rebuilt (<a>RebuildWorkspaces</a>), restored (<a>RestoreWorkspace</a>), terminated (<a>TerminateWorkspaces</a>), started (<a>StartWorkspaces</a>), or stopped (<a>StopWorkspaces</a>).
    */
  @js.native
  trait FailedWorkspaceChangeRequest extends js.Object {
    var ErrorCode: js.UndefOr[ErrorType]
    var ErrorMessage: js.UndefOr[Description]
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object FailedWorkspaceChangeRequest {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorType] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): FailedWorkspaceChangeRequest = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      WorkspaceId.foreach(__v => __obj.updateDynamic("WorkspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedWorkspaceChangeRequest]
    }
  }

  @js.native
  trait ImportWorkspaceImageRequest extends js.Object {
    var Ec2ImageId: Ec2ImageId
    var ImageDescription: WorkspaceImageDescription
    var ImageName: WorkspaceImageName
    var IngestionProcess: WorkspaceImageIngestionProcess
    var Tags: js.UndefOr[TagList]
  }

  object ImportWorkspaceImageRequest {
    @inline
    def apply(
        Ec2ImageId: Ec2ImageId,
        ImageDescription: WorkspaceImageDescription,
        ImageName: WorkspaceImageName,
        IngestionProcess: WorkspaceImageIngestionProcess,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ImportWorkspaceImageRequest = {
      val __obj = js.Dynamic.literal(
        "Ec2ImageId" -> Ec2ImageId.asInstanceOf[js.Any],
        "ImageDescription" -> ImageDescription.asInstanceOf[js.Any],
        "ImageName" -> ImageName.asInstanceOf[js.Any],
        "IngestionProcess" -> IngestionProcess.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportWorkspaceImageRequest]
    }
  }

  @js.native
  trait ImportWorkspaceImageResult extends js.Object {
    var ImageId: js.UndefOr[WorkspaceImageId]
  }

  object ImportWorkspaceImageResult {
    @inline
    def apply(
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
    ): ImportWorkspaceImageResult = {
      val __obj = js.Dynamic.literal()
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportWorkspaceImageResult]
    }
  }

  /**
    * Describes a rule for an IP access control group.
    */
  @js.native
  trait IpRuleItem extends js.Object {
    var ipRule: js.UndefOr[IpRule]
    var ruleDesc: js.UndefOr[IpRuleDesc]
  }

  object IpRuleItem {
    @inline
    def apply(
        ipRule: js.UndefOr[IpRule] = js.undefined,
        ruleDesc: js.UndefOr[IpRuleDesc] = js.undefined
    ): IpRuleItem = {
      val __obj = js.Dynamic.literal()
      ipRule.foreach(__v => __obj.updateDynamic("ipRule")(__v.asInstanceOf[js.Any]))
      ruleDesc.foreach(__v => __obj.updateDynamic("ruleDesc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpRuleItem]
    }
  }

  @js.native
  trait ListAvailableManagementCidrRangesRequest extends js.Object {
    var ManagementCidrRangeConstraint: ManagementCidrRangeConstraint
    var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAvailableManagementCidrRangesRequest {
    @inline
    def apply(
        ManagementCidrRangeConstraint: ManagementCidrRangeConstraint,
        MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAvailableManagementCidrRangesRequest = {
      val __obj = js.Dynamic.literal(
        "ManagementCidrRangeConstraint" -> ManagementCidrRangeConstraint.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableManagementCidrRangesRequest]
    }
  }

  @js.native
  trait ListAvailableManagementCidrRangesResult extends js.Object {
    var ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAvailableManagementCidrRangesResult {
    @inline
    def apply(
        ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAvailableManagementCidrRangesResult = {
      val __obj = js.Dynamic.literal()
      ManagementCidrRanges.foreach(__v => __obj.updateDynamic("ManagementCidrRanges")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableManagementCidrRangesResult]
    }
  }

  @js.native
  trait MigrateWorkspaceRequest extends js.Object {
    var BundleId: BundleId
    var SourceWorkspaceId: WorkspaceId
  }

  object MigrateWorkspaceRequest {
    @inline
    def apply(
        BundleId: BundleId,
        SourceWorkspaceId: WorkspaceId
    ): MigrateWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "BundleId" -> BundleId.asInstanceOf[js.Any],
        "SourceWorkspaceId" -> SourceWorkspaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MigrateWorkspaceRequest]
    }
  }

  @js.native
  trait MigrateWorkspaceResult extends js.Object {
    var SourceWorkspaceId: js.UndefOr[WorkspaceId]
    var TargetWorkspaceId: js.UndefOr[WorkspaceId]
  }

  object MigrateWorkspaceResult {
    @inline
    def apply(
        SourceWorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
        TargetWorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): MigrateWorkspaceResult = {
      val __obj = js.Dynamic.literal()
      SourceWorkspaceId.foreach(__v => __obj.updateDynamic("SourceWorkspaceId")(__v.asInstanceOf[js.Any]))
      TargetWorkspaceId.foreach(__v => __obj.updateDynamic("TargetWorkspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MigrateWorkspaceResult]
    }
  }

  @js.native
  sealed trait ModificationResourceEnum extends js.Any
  object ModificationResourceEnum extends js.Object {
    val ROOT_VOLUME = "ROOT_VOLUME".asInstanceOf[ModificationResourceEnum]
    val USER_VOLUME = "USER_VOLUME".asInstanceOf[ModificationResourceEnum]
    val COMPUTE_TYPE = "COMPUTE_TYPE".asInstanceOf[ModificationResourceEnum]

    val values = js.Object.freeze(js.Array(ROOT_VOLUME, USER_VOLUME, COMPUTE_TYPE))
  }

  /**
    * Describes a WorkSpace modification.
    */
  @js.native
  trait ModificationState extends js.Object {
    var Resource: js.UndefOr[ModificationResourceEnum]
    var State: js.UndefOr[ModificationStateEnum]
  }

  object ModificationState {
    @inline
    def apply(
        Resource: js.UndefOr[ModificationResourceEnum] = js.undefined,
        State: js.UndefOr[ModificationStateEnum] = js.undefined
    ): ModificationState = {
      val __obj = js.Dynamic.literal()
      Resource.foreach(__v => __obj.updateDynamic("Resource")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModificationState]
    }
  }

  @js.native
  sealed trait ModificationStateEnum extends js.Any
  object ModificationStateEnum extends js.Object {
    val UPDATE_INITIATED = "UPDATE_INITIATED".asInstanceOf[ModificationStateEnum]
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[ModificationStateEnum]

    val values = js.Object.freeze(js.Array(UPDATE_INITIATED, UPDATE_IN_PROGRESS))
  }

  @js.native
  trait ModifyAccountRequest extends js.Object {
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum]
  }

  object ModifyAccountRequest {
    @inline
    def apply(
        DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined,
        DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum] = js.undefined
    ): ModifyAccountRequest = {
      val __obj = js.Dynamic.literal()
      DedicatedTenancyManagementCidrRange.foreach(__v =>
        __obj.updateDynamic("DedicatedTenancyManagementCidrRange")(__v.asInstanceOf[js.Any])
      )
      DedicatedTenancySupport.foreach(__v => __obj.updateDynamic("DedicatedTenancySupport")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyAccountRequest]
    }
  }

  @js.native
  trait ModifyAccountResult extends js.Object {}

  object ModifyAccountResult {
    @inline
    def apply(
    ): ModifyAccountResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ModifyAccountResult]
    }
  }

  @js.native
  trait ModifyClientPropertiesRequest extends js.Object {
    var ClientProperties: ClientProperties
    var ResourceId: NonEmptyString
  }

  object ModifyClientPropertiesRequest {
    @inline
    def apply(
        ClientProperties: ClientProperties,
        ResourceId: NonEmptyString
    ): ModifyClientPropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "ClientProperties" -> ClientProperties.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyClientPropertiesRequest]
    }
  }

  @js.native
  trait ModifyClientPropertiesResult extends js.Object {}

  object ModifyClientPropertiesResult {
    @inline
    def apply(
    ): ModifyClientPropertiesResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ModifyClientPropertiesResult]
    }
  }

  @js.native
  trait ModifySelfservicePermissionsRequest extends js.Object {
    var ResourceId: DirectoryId
    var SelfservicePermissions: SelfservicePermissions
  }

  object ModifySelfservicePermissionsRequest {
    @inline
    def apply(
        ResourceId: DirectoryId,
        SelfservicePermissions: SelfservicePermissions
    ): ModifySelfservicePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "SelfservicePermissions" -> SelfservicePermissions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifySelfservicePermissionsRequest]
    }
  }

  @js.native
  trait ModifySelfservicePermissionsResult extends js.Object {}

  object ModifySelfservicePermissionsResult {
    @inline
    def apply(
    ): ModifySelfservicePermissionsResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ModifySelfservicePermissionsResult]
    }
  }

  @js.native
  trait ModifyWorkspaceAccessPropertiesRequest extends js.Object {
    var ResourceId: DirectoryId
    var WorkspaceAccessProperties: WorkspaceAccessProperties
  }

  object ModifyWorkspaceAccessPropertiesRequest {
    @inline
    def apply(
        ResourceId: DirectoryId,
        WorkspaceAccessProperties: WorkspaceAccessProperties
    ): ModifyWorkspaceAccessPropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "WorkspaceAccessProperties" -> WorkspaceAccessProperties.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyWorkspaceAccessPropertiesRequest]
    }
  }

  @js.native
  trait ModifyWorkspaceAccessPropertiesResult extends js.Object {}

  object ModifyWorkspaceAccessPropertiesResult {
    @inline
    def apply(
    ): ModifyWorkspaceAccessPropertiesResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ModifyWorkspaceAccessPropertiesResult]
    }
  }

  @js.native
  trait ModifyWorkspaceCreationPropertiesRequest extends js.Object {
    var ResourceId: DirectoryId
    var WorkspaceCreationProperties: WorkspaceCreationProperties
  }

  object ModifyWorkspaceCreationPropertiesRequest {
    @inline
    def apply(
        ResourceId: DirectoryId,
        WorkspaceCreationProperties: WorkspaceCreationProperties
    ): ModifyWorkspaceCreationPropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "WorkspaceCreationProperties" -> WorkspaceCreationProperties.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyWorkspaceCreationPropertiesRequest]
    }
  }

  @js.native
  trait ModifyWorkspaceCreationPropertiesResult extends js.Object {}

  object ModifyWorkspaceCreationPropertiesResult {
    @inline
    def apply(
    ): ModifyWorkspaceCreationPropertiesResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ModifyWorkspaceCreationPropertiesResult]
    }
  }

  @js.native
  trait ModifyWorkspacePropertiesRequest extends js.Object {
    var WorkspaceId: WorkspaceId
    var WorkspaceProperties: WorkspaceProperties
  }

  object ModifyWorkspacePropertiesRequest {
    @inline
    def apply(
        WorkspaceId: WorkspaceId,
        WorkspaceProperties: WorkspaceProperties
    ): ModifyWorkspacePropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any],
        "WorkspaceProperties" -> WorkspaceProperties.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyWorkspacePropertiesRequest]
    }
  }

  @js.native
  trait ModifyWorkspacePropertiesResult extends js.Object {}

  object ModifyWorkspacePropertiesResult {
    @inline
    def apply(
    ): ModifyWorkspacePropertiesResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ModifyWorkspacePropertiesResult]
    }
  }

  @js.native
  trait ModifyWorkspaceStateRequest extends js.Object {
    var WorkspaceId: WorkspaceId
    var WorkspaceState: TargetWorkspaceState
  }

  object ModifyWorkspaceStateRequest {
    @inline
    def apply(
        WorkspaceId: WorkspaceId,
        WorkspaceState: TargetWorkspaceState
    ): ModifyWorkspaceStateRequest = {
      val __obj = js.Dynamic.literal(
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any],
        "WorkspaceState" -> WorkspaceState.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyWorkspaceStateRequest]
    }
  }

  @js.native
  trait ModifyWorkspaceStateResult extends js.Object {}

  object ModifyWorkspaceStateResult {
    @inline
    def apply(
    ): ModifyWorkspaceStateResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ModifyWorkspaceStateResult]
    }
  }

  /**
    * The operating system that the image is running.
    */
  @js.native
  trait OperatingSystem extends js.Object {
    var Type: js.UndefOr[OperatingSystemType]
  }

  object OperatingSystem {
    @inline
    def apply(
        Type: js.UndefOr[OperatingSystemType] = js.undefined
    ): OperatingSystem = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OperatingSystem]
    }
  }

  @js.native
  sealed trait OperatingSystemType extends js.Any
  object OperatingSystemType extends js.Object {
    val WINDOWS = "WINDOWS".asInstanceOf[OperatingSystemType]
    val LINUX = "LINUX".asInstanceOf[OperatingSystemType]

    val values = js.Object.freeze(js.Array(WINDOWS, LINUX))
  }

  /**
    * Describes the information used to reboot a WorkSpace.
    */
  @js.native
  trait RebootRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object RebootRequest {
    @inline
    def apply(
        WorkspaceId: WorkspaceId
    ): RebootRequest = {
      val __obj = js.Dynamic.literal(
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebootRequest]
    }
  }

  @js.native
  trait RebootWorkspacesRequest extends js.Object {
    var RebootWorkspaceRequests: RebootWorkspaceRequests
  }

  object RebootWorkspacesRequest {
    @inline
    def apply(
        RebootWorkspaceRequests: RebootWorkspaceRequests
    ): RebootWorkspacesRequest = {
      val __obj = js.Dynamic.literal(
        "RebootWorkspaceRequests" -> RebootWorkspaceRequests.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebootWorkspacesRequest]
    }
  }

  @js.native
  trait RebootWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests]
  }

  object RebootWorkspacesResult {
    @inline
    def apply(
        FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests] = js.undefined
    ): RebootWorkspacesResult = {
      val __obj = js.Dynamic.literal()
      FailedRequests.foreach(__v => __obj.updateDynamic("FailedRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootWorkspacesResult]
    }
  }

  /**
    * Describes the information used to rebuild a WorkSpace.
    */
  @js.native
  trait RebuildRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object RebuildRequest {
    @inline
    def apply(
        WorkspaceId: WorkspaceId
    ): RebuildRequest = {
      val __obj = js.Dynamic.literal(
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebuildRequest]
    }
  }

  @js.native
  trait RebuildWorkspacesRequest extends js.Object {
    var RebuildWorkspaceRequests: RebuildWorkspaceRequests
  }

  object RebuildWorkspacesRequest {
    @inline
    def apply(
        RebuildWorkspaceRequests: RebuildWorkspaceRequests
    ): RebuildWorkspacesRequest = {
      val __obj = js.Dynamic.literal(
        "RebuildWorkspaceRequests" -> RebuildWorkspaceRequests.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebuildWorkspacesRequest]
    }
  }

  @js.native
  trait RebuildWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests]
  }

  object RebuildWorkspacesResult {
    @inline
    def apply(
        FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.undefined
    ): RebuildWorkspacesResult = {
      val __obj = js.Dynamic.literal()
      FailedRequests.foreach(__v => __obj.updateDynamic("FailedRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebuildWorkspacesResult]
    }
  }

  @js.native
  sealed trait ReconnectEnum extends js.Any
  object ReconnectEnum extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[ReconnectEnum]
    val DISABLED = "DISABLED".asInstanceOf[ReconnectEnum]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  trait RegisterWorkspaceDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
    var EnableWorkDocs: BooleanObject
    var EnableSelfService: js.UndefOr[BooleanObject]
    var SubnetIds: js.UndefOr[SubnetIds]
    var Tags: js.UndefOr[TagList]
    var Tenancy: js.UndefOr[Tenancy]
  }

  object RegisterWorkspaceDirectoryRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        EnableWorkDocs: BooleanObject,
        EnableSelfService: js.UndefOr[BooleanObject] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Tenancy: js.UndefOr[Tenancy] = js.undefined
    ): RegisterWorkspaceDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "EnableWorkDocs" -> EnableWorkDocs.asInstanceOf[js.Any]
      )

      EnableSelfService.foreach(__v => __obj.updateDynamic("EnableSelfService")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Tenancy.foreach(__v => __obj.updateDynamic("Tenancy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterWorkspaceDirectoryRequest]
    }
  }

  @js.native
  trait RegisterWorkspaceDirectoryResult extends js.Object {}

  object RegisterWorkspaceDirectoryResult {
    @inline
    def apply(
    ): RegisterWorkspaceDirectoryResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RegisterWorkspaceDirectoryResult]
    }
  }

  @js.native
  trait RestoreWorkspaceRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object RestoreWorkspaceRequest {
    @inline
    def apply(
        WorkspaceId: WorkspaceId
    ): RestoreWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RestoreWorkspaceRequest]
    }
  }

  @js.native
  trait RestoreWorkspaceResult extends js.Object {}

  object RestoreWorkspaceResult {
    @inline
    def apply(
    ): RestoreWorkspaceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RestoreWorkspaceResult]
    }
  }

  @js.native
  trait RevokeIpRulesRequest extends js.Object {
    var GroupId: IpGroupId
    var UserRules: IpRevokedRuleList
  }

  object RevokeIpRulesRequest {
    @inline
    def apply(
        GroupId: IpGroupId,
        UserRules: IpRevokedRuleList
    ): RevokeIpRulesRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "UserRules" -> UserRules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RevokeIpRulesRequest]
    }
  }

  @js.native
  trait RevokeIpRulesResult extends js.Object {}

  object RevokeIpRulesResult {
    @inline
    def apply(
    ): RevokeIpRulesResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RevokeIpRulesResult]
    }
  }

  /**
    * Describes the root volume for a WorkSpace bundle.
    */
  @js.native
  trait RootStorage extends js.Object {
    var Capacity: js.UndefOr[NonEmptyString]
  }

  object RootStorage {
    @inline
    def apply(
        Capacity: js.UndefOr[NonEmptyString] = js.undefined
    ): RootStorage = {
      val __obj = js.Dynamic.literal()
      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RootStorage]
    }
  }

  @js.native
  sealed trait RunningMode extends js.Any
  object RunningMode extends js.Object {
    val AUTO_STOP = "AUTO_STOP".asInstanceOf[RunningMode]
    val ALWAYS_ON = "ALWAYS_ON".asInstanceOf[RunningMode]

    val values = js.Object.freeze(js.Array(AUTO_STOP, ALWAYS_ON))
  }

  /**
    * Describes the self-service permissions for a directory. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/enable-user-self-service-workspace-management.html|Enable Self-Service WorkSpace Management Capabilities for Your Users]].
    */
  @js.native
  trait SelfservicePermissions extends js.Object {
    var ChangeComputeType: js.UndefOr[ReconnectEnum]
    var IncreaseVolumeSize: js.UndefOr[ReconnectEnum]
    var RebuildWorkspace: js.UndefOr[ReconnectEnum]
    var RestartWorkspace: js.UndefOr[ReconnectEnum]
    var SwitchRunningMode: js.UndefOr[ReconnectEnum]
  }

  object SelfservicePermissions {
    @inline
    def apply(
        ChangeComputeType: js.UndefOr[ReconnectEnum] = js.undefined,
        IncreaseVolumeSize: js.UndefOr[ReconnectEnum] = js.undefined,
        RebuildWorkspace: js.UndefOr[ReconnectEnum] = js.undefined,
        RestartWorkspace: js.UndefOr[ReconnectEnum] = js.undefined,
        SwitchRunningMode: js.UndefOr[ReconnectEnum] = js.undefined
    ): SelfservicePermissions = {
      val __obj = js.Dynamic.literal()
      ChangeComputeType.foreach(__v => __obj.updateDynamic("ChangeComputeType")(__v.asInstanceOf[js.Any]))
      IncreaseVolumeSize.foreach(__v => __obj.updateDynamic("IncreaseVolumeSize")(__v.asInstanceOf[js.Any]))
      RebuildWorkspace.foreach(__v => __obj.updateDynamic("RebuildWorkspace")(__v.asInstanceOf[js.Any]))
      RestartWorkspace.foreach(__v => __obj.updateDynamic("RestartWorkspace")(__v.asInstanceOf[js.Any]))
      SwitchRunningMode.foreach(__v => __obj.updateDynamic("SwitchRunningMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelfservicePermissions]
    }
  }

  /**
    * Describes a snapshot.
    */
  @js.native
  trait Snapshot extends js.Object {
    var SnapshotTime: js.UndefOr[Timestamp]
  }

  object Snapshot {
    @inline
    def apply(
        SnapshotTime: js.UndefOr[Timestamp] = js.undefined
    ): Snapshot = {
      val __obj = js.Dynamic.literal()
      SnapshotTime.foreach(__v => __obj.updateDynamic("SnapshotTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Snapshot]
    }
  }

  /**
    * Information used to start a WorkSpace.
    */
  @js.native
  trait StartRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object StartRequest {
    @inline
    def apply(
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): StartRequest = {
      val __obj = js.Dynamic.literal()
      WorkspaceId.foreach(__v => __obj.updateDynamic("WorkspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRequest]
    }
  }

  @js.native
  trait StartWorkspacesRequest extends js.Object {
    var StartWorkspaceRequests: StartWorkspaceRequests
  }

  object StartWorkspacesRequest {
    @inline
    def apply(
        StartWorkspaceRequests: StartWorkspaceRequests
    ): StartWorkspacesRequest = {
      val __obj = js.Dynamic.literal(
        "StartWorkspaceRequests" -> StartWorkspaceRequests.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartWorkspacesRequest]
    }
  }

  @js.native
  trait StartWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedStartWorkspaceRequests]
  }

  object StartWorkspacesResult {
    @inline
    def apply(
        FailedRequests: js.UndefOr[FailedStartWorkspaceRequests] = js.undefined
    ): StartWorkspacesResult = {
      val __obj = js.Dynamic.literal()
      FailedRequests.foreach(__v => __obj.updateDynamic("FailedRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartWorkspacesResult]
    }
  }

  /**
    * Describes the information used to stop a WorkSpace.
    */
  @js.native
  trait StopRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object StopRequest {
    @inline
    def apply(
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): StopRequest = {
      val __obj = js.Dynamic.literal()
      WorkspaceId.foreach(__v => __obj.updateDynamic("WorkspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopRequest]
    }
  }

  @js.native
  trait StopWorkspacesRequest extends js.Object {
    var StopWorkspaceRequests: StopWorkspaceRequests
  }

  object StopWorkspacesRequest {
    @inline
    def apply(
        StopWorkspaceRequests: StopWorkspaceRequests
    ): StopWorkspacesRequest = {
      val __obj = js.Dynamic.literal(
        "StopWorkspaceRequests" -> StopWorkspaceRequests.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopWorkspacesRequest]
    }
  }

  @js.native
  trait StopWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedStopWorkspaceRequests]
  }

  object StopWorkspacesResult {
    @inline
    def apply(
        FailedRequests: js.UndefOr[FailedStopWorkspaceRequests] = js.undefined
    ): StopWorkspacesResult = {
      val __obj = js.Dynamic.literal()
      FailedRequests.foreach(__v => __obj.updateDynamic("FailedRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopWorkspacesResult]
    }
  }

  /**
    * Describes a tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  sealed trait TargetWorkspaceState extends js.Any
  object TargetWorkspaceState extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[TargetWorkspaceState]
    val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE".asInstanceOf[TargetWorkspaceState]

    val values = js.Object.freeze(js.Array(AVAILABLE, ADMIN_MAINTENANCE))
  }

  @js.native
  sealed trait Tenancy extends js.Any
  object Tenancy extends js.Object {
    val DEDICATED = "DEDICATED".asInstanceOf[Tenancy]
    val SHARED = "SHARED".asInstanceOf[Tenancy]

    val values = js.Object.freeze(js.Array(DEDICATED, SHARED))
  }

  /**
    * Describes the information used to terminate a WorkSpace.
    */
  @js.native
  trait TerminateRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object TerminateRequest {
    @inline
    def apply(
        WorkspaceId: WorkspaceId
    ): TerminateRequest = {
      val __obj = js.Dynamic.literal(
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TerminateRequest]
    }
  }

  @js.native
  trait TerminateWorkspacesRequest extends js.Object {
    var TerminateWorkspaceRequests: TerminateWorkspaceRequests
  }

  object TerminateWorkspacesRequest {
    @inline
    def apply(
        TerminateWorkspaceRequests: TerminateWorkspaceRequests
    ): TerminateWorkspacesRequest = {
      val __obj = js.Dynamic.literal(
        "TerminateWorkspaceRequests" -> TerminateWorkspaceRequests.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TerminateWorkspacesRequest]
    }
  }

  @js.native
  trait TerminateWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests]
  }

  object TerminateWorkspacesResult {
    @inline
    def apply(
        FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests] = js.undefined
    ): TerminateWorkspacesResult = {
      val __obj = js.Dynamic.literal()
      FailedRequests.foreach(__v => __obj.updateDynamic("FailedRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateWorkspacesResult]
    }
  }

  @js.native
  trait UpdateRulesOfIpGroupRequest extends js.Object {
    var GroupId: IpGroupId
    var UserRules: IpRuleList
  }

  object UpdateRulesOfIpGroupRequest {
    @inline
    def apply(
        GroupId: IpGroupId,
        UserRules: IpRuleList
    ): UpdateRulesOfIpGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "UserRules" -> UserRules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateRulesOfIpGroupRequest]
    }
  }

  @js.native
  trait UpdateRulesOfIpGroupResult extends js.Object {}

  object UpdateRulesOfIpGroupResult {
    @inline
    def apply(
    ): UpdateRulesOfIpGroupResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateRulesOfIpGroupResult]
    }
  }

  /**
    * Describes the user storage for a WorkSpace bundle.
    */
  @js.native
  trait UserStorage extends js.Object {
    var Capacity: js.UndefOr[NonEmptyString]
  }

  object UserStorage {
    @inline
    def apply(
        Capacity: js.UndefOr[NonEmptyString] = js.undefined
    ): UserStorage = {
      val __obj = js.Dynamic.literal()
      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserStorage]
    }
  }

  /**
    * Describes a WorkSpace.
    */
  @js.native
  trait Workspace extends js.Object {
    var BundleId: js.UndefOr[BundleId]
    var ComputerName: js.UndefOr[ComputerName]
    var DirectoryId: js.UndefOr[DirectoryId]
    var ErrorCode: js.UndefOr[WorkspaceErrorCode]
    var ErrorMessage: js.UndefOr[Description]
    var IpAddress: js.UndefOr[IpAddress]
    var ModificationStates: js.UndefOr[ModificationStateList]
    var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject]
    var State: js.UndefOr[WorkspaceState]
    var SubnetId: js.UndefOr[SubnetId]
    var UserName: js.UndefOr[UserName]
    var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject]
    var VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey]
    var WorkspaceId: js.UndefOr[WorkspaceId]
    var WorkspaceProperties: js.UndefOr[WorkspaceProperties]
  }

  object Workspace {
    @inline
    def apply(
        BundleId: js.UndefOr[BundleId] = js.undefined,
        ComputerName: js.UndefOr[ComputerName] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        ModificationStates: js.UndefOr[ModificationStateList] = js.undefined,
        RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
        State: js.UndefOr[WorkspaceState] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined,
        UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
        VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey] = js.undefined,
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
        WorkspaceProperties: js.UndefOr[WorkspaceProperties] = js.undefined
    ): Workspace = {
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      ComputerName.foreach(__v => __obj.updateDynamic("ComputerName")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      ModificationStates.foreach(__v => __obj.updateDynamic("ModificationStates")(__v.asInstanceOf[js.Any]))
      RootVolumeEncryptionEnabled.foreach(__v =>
        __obj.updateDynamic("RootVolumeEncryptionEnabled")(__v.asInstanceOf[js.Any])
      )
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      UserVolumeEncryptionEnabled.foreach(__v =>
        __obj.updateDynamic("UserVolumeEncryptionEnabled")(__v.asInstanceOf[js.Any])
      )
      VolumeEncryptionKey.foreach(__v => __obj.updateDynamic("VolumeEncryptionKey")(__v.asInstanceOf[js.Any]))
      WorkspaceId.foreach(__v => __obj.updateDynamic("WorkspaceId")(__v.asInstanceOf[js.Any]))
      WorkspaceProperties.foreach(__v => __obj.updateDynamic("WorkspaceProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workspace]
    }
  }

  /**
    * The device types and operating systems that can be used to access a WorkSpace. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-network-requirements.html|Amazon WorkSpaces Client Network Requirements]].
    */
  @js.native
  trait WorkspaceAccessProperties extends js.Object {
    var DeviceTypeAndroid: js.UndefOr[AccessPropertyValue]
    var DeviceTypeChromeOs: js.UndefOr[AccessPropertyValue]
    var DeviceTypeIos: js.UndefOr[AccessPropertyValue]
    var DeviceTypeOsx: js.UndefOr[AccessPropertyValue]
    var DeviceTypeWeb: js.UndefOr[AccessPropertyValue]
    var DeviceTypeWindows: js.UndefOr[AccessPropertyValue]
    var DeviceTypeZeroClient: js.UndefOr[AccessPropertyValue]
  }

  object WorkspaceAccessProperties {
    @inline
    def apply(
        DeviceTypeAndroid: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeChromeOs: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeIos: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeOsx: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeWeb: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeWindows: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeZeroClient: js.UndefOr[AccessPropertyValue] = js.undefined
    ): WorkspaceAccessProperties = {
      val __obj = js.Dynamic.literal()
      DeviceTypeAndroid.foreach(__v => __obj.updateDynamic("DeviceTypeAndroid")(__v.asInstanceOf[js.Any]))
      DeviceTypeChromeOs.foreach(__v => __obj.updateDynamic("DeviceTypeChromeOs")(__v.asInstanceOf[js.Any]))
      DeviceTypeIos.foreach(__v => __obj.updateDynamic("DeviceTypeIos")(__v.asInstanceOf[js.Any]))
      DeviceTypeOsx.foreach(__v => __obj.updateDynamic("DeviceTypeOsx")(__v.asInstanceOf[js.Any]))
      DeviceTypeWeb.foreach(__v => __obj.updateDynamic("DeviceTypeWeb")(__v.asInstanceOf[js.Any]))
      DeviceTypeWindows.foreach(__v => __obj.updateDynamic("DeviceTypeWindows")(__v.asInstanceOf[js.Any]))
      DeviceTypeZeroClient.foreach(__v => __obj.updateDynamic("DeviceTypeZeroClient")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceAccessProperties]
    }
  }

  /**
    * Describes a WorkSpace bundle.
    */
  @js.native
  trait WorkspaceBundle extends js.Object {
    var BundleId: js.UndefOr[BundleId]
    var ComputeType: js.UndefOr[ComputeType]
    var Description: js.UndefOr[Description]
    var ImageId: js.UndefOr[WorkspaceImageId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NonEmptyString]
    var Owner: js.UndefOr[BundleOwner]
    var RootStorage: js.UndefOr[RootStorage]
    var UserStorage: js.UndefOr[UserStorage]
  }

  object WorkspaceBundle {
    @inline
    def apply(
        BundleId: js.UndefOr[BundleId] = js.undefined,
        ComputeType: js.UndefOr[ComputeType] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Owner: js.UndefOr[BundleOwner] = js.undefined,
        RootStorage: js.UndefOr[RootStorage] = js.undefined,
        UserStorage: js.UndefOr[UserStorage] = js.undefined
    ): WorkspaceBundle = {
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      ComputeType.foreach(__v => __obj.updateDynamic("ComputeType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      RootStorage.foreach(__v => __obj.updateDynamic("RootStorage")(__v.asInstanceOf[js.Any]))
      UserStorage.foreach(__v => __obj.updateDynamic("UserStorage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceBundle]
    }
  }

  /**
    * Describes the connection status of a WorkSpace.
    */
  @js.native
  trait WorkspaceConnectionStatus extends js.Object {
    var ConnectionState: js.UndefOr[ConnectionState]
    var ConnectionStateCheckTimestamp: js.UndefOr[Timestamp]
    var LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp]
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object WorkspaceConnectionStatus {
    @inline
    def apply(
        ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        ConnectionStateCheckTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp] = js.undefined,
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): WorkspaceConnectionStatus = {
      val __obj = js.Dynamic.literal()
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      ConnectionStateCheckTimestamp.foreach(__v =>
        __obj.updateDynamic("ConnectionStateCheckTimestamp")(__v.asInstanceOf[js.Any])
      )
      LastKnownUserConnectionTimestamp.foreach(__v =>
        __obj.updateDynamic("LastKnownUserConnectionTimestamp")(__v.asInstanceOf[js.Any])
      )
      WorkspaceId.foreach(__v => __obj.updateDynamic("WorkspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceConnectionStatus]
    }
  }

  /**
    * Describes the default properties that are used for creating WorkSpaces. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html|Update Directory Details for Your WorkSpaces]].
    */
  @js.native
  trait WorkspaceCreationProperties extends js.Object {
    var CustomSecurityGroupId: js.UndefOr[SecurityGroupId]
    var DefaultOu: js.UndefOr[DefaultOu]
    var EnableInternetAccess: js.UndefOr[BooleanObject]
    var EnableMaintenanceMode: js.UndefOr[BooleanObject]
    var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject]
  }

  object WorkspaceCreationProperties {
    @inline
    def apply(
        CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
        DefaultOu: js.UndefOr[DefaultOu] = js.undefined,
        EnableInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
        EnableMaintenanceMode: js.UndefOr[BooleanObject] = js.undefined,
        UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.undefined
    ): WorkspaceCreationProperties = {
      val __obj = js.Dynamic.literal()
      CustomSecurityGroupId.foreach(__v => __obj.updateDynamic("CustomSecurityGroupId")(__v.asInstanceOf[js.Any]))
      DefaultOu.foreach(__v => __obj.updateDynamic("DefaultOu")(__v.asInstanceOf[js.Any]))
      EnableInternetAccess.foreach(__v => __obj.updateDynamic("EnableInternetAccess")(__v.asInstanceOf[js.Any]))
      EnableMaintenanceMode.foreach(__v => __obj.updateDynamic("EnableMaintenanceMode")(__v.asInstanceOf[js.Any]))
      UserEnabledAsLocalAdministrator.foreach(__v =>
        __obj.updateDynamic("UserEnabledAsLocalAdministrator")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[WorkspaceCreationProperties]
    }
  }

  /**
    * Describes a directory that is used with Amazon WorkSpaces.
    */
  @js.native
  trait WorkspaceDirectory extends js.Object {
    var Alias: js.UndefOr[Alias]
    var CustomerUserName: js.UndefOr[UserName]
    var DirectoryId: js.UndefOr[DirectoryId]
    var DirectoryName: js.UndefOr[DirectoryName]
    var DirectoryType: js.UndefOr[WorkspaceDirectoryType]
    var DnsIpAddresses: js.UndefOr[DnsIpAddresses]
    var IamRoleId: js.UndefOr[ARN]
    var RegistrationCode: js.UndefOr[RegistrationCode]
    var SelfservicePermissions: js.UndefOr[SelfservicePermissions]
    var State: js.UndefOr[WorkspaceDirectoryState]
    var SubnetIds: js.UndefOr[SubnetIds]
    var Tenancy: js.UndefOr[Tenancy]
    var WorkspaceAccessProperties: js.UndefOr[WorkspaceAccessProperties]
    var WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties]
    var WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId]
    var ipGroupIds: js.UndefOr[IpGroupIdList]
  }

  object WorkspaceDirectory {
    @inline
    def apply(
        Alias: js.UndefOr[Alias] = js.undefined,
        CustomerUserName: js.UndefOr[UserName] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
        DirectoryType: js.UndefOr[WorkspaceDirectoryType] = js.undefined,
        DnsIpAddresses: js.UndefOr[DnsIpAddresses] = js.undefined,
        IamRoleId: js.UndefOr[ARN] = js.undefined,
        RegistrationCode: js.UndefOr[RegistrationCode] = js.undefined,
        SelfservicePermissions: js.UndefOr[SelfservicePermissions] = js.undefined,
        State: js.UndefOr[WorkspaceDirectoryState] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        Tenancy: js.UndefOr[Tenancy] = js.undefined,
        WorkspaceAccessProperties: js.UndefOr[WorkspaceAccessProperties] = js.undefined,
        WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties] = js.undefined,
        WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
        ipGroupIds: js.UndefOr[IpGroupIdList] = js.undefined
    ): WorkspaceDirectory = {
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      CustomerUserName.foreach(__v => __obj.updateDynamic("CustomerUserName")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      DirectoryName.foreach(__v => __obj.updateDynamic("DirectoryName")(__v.asInstanceOf[js.Any]))
      DirectoryType.foreach(__v => __obj.updateDynamic("DirectoryType")(__v.asInstanceOf[js.Any]))
      DnsIpAddresses.foreach(__v => __obj.updateDynamic("DnsIpAddresses")(__v.asInstanceOf[js.Any]))
      IamRoleId.foreach(__v => __obj.updateDynamic("IamRoleId")(__v.asInstanceOf[js.Any]))
      RegistrationCode.foreach(__v => __obj.updateDynamic("RegistrationCode")(__v.asInstanceOf[js.Any]))
      SelfservicePermissions.foreach(__v => __obj.updateDynamic("SelfservicePermissions")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tenancy.foreach(__v => __obj.updateDynamic("Tenancy")(__v.asInstanceOf[js.Any]))
      WorkspaceAccessProperties.foreach(__v =>
        __obj.updateDynamic("WorkspaceAccessProperties")(__v.asInstanceOf[js.Any])
      )
      WorkspaceCreationProperties.foreach(__v =>
        __obj.updateDynamic("WorkspaceCreationProperties")(__v.asInstanceOf[js.Any])
      )
      WorkspaceSecurityGroupId.foreach(__v => __obj.updateDynamic("WorkspaceSecurityGroupId")(__v.asInstanceOf[js.Any]))
      ipGroupIds.foreach(__v => __obj.updateDynamic("ipGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceDirectory]
    }
  }

  @js.native
  sealed trait WorkspaceDirectoryState extends js.Any
  object WorkspaceDirectoryState extends js.Object {
    val REGISTERING = "REGISTERING".asInstanceOf[WorkspaceDirectoryState]
    val REGISTERED = "REGISTERED".asInstanceOf[WorkspaceDirectoryState]
    val DEREGISTERING = "DEREGISTERING".asInstanceOf[WorkspaceDirectoryState]
    val DEREGISTERED = "DEREGISTERED".asInstanceOf[WorkspaceDirectoryState]
    val ERROR = "ERROR".asInstanceOf[WorkspaceDirectoryState]

    val values = js.Object.freeze(js.Array(REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR))
  }

  @js.native
  sealed trait WorkspaceDirectoryType extends js.Any
  object WorkspaceDirectoryType extends js.Object {
    val SIMPLE_AD = "SIMPLE_AD".asInstanceOf[WorkspaceDirectoryType]
    val AD_CONNECTOR = "AD_CONNECTOR".asInstanceOf[WorkspaceDirectoryType]

    val values = js.Object.freeze(js.Array(SIMPLE_AD, AD_CONNECTOR))
  }

  /**
    * Describes a WorkSpace image.
    */
  @js.native
  trait WorkspaceImage extends js.Object {
    var Description: js.UndefOr[WorkspaceImageDescription]
    var ErrorCode: js.UndefOr[WorkspaceImageErrorCode]
    var ErrorMessage: js.UndefOr[Description]
    var ImageId: js.UndefOr[WorkspaceImageId]
    var Name: js.UndefOr[WorkspaceImageName]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy]
    var State: js.UndefOr[WorkspaceImageState]
  }

  object WorkspaceImage {
    @inline
    def apply(
        Description: js.UndefOr[WorkspaceImageDescription] = js.undefined,
        ErrorCode: js.UndefOr[WorkspaceImageErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined,
        Name: js.UndefOr[WorkspaceImageName] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.undefined,
        State: js.UndefOr[WorkspaceImageState] = js.undefined
    ): WorkspaceImage = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      RequiredTenancy.foreach(__v => __obj.updateDynamic("RequiredTenancy")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceImage]
    }
  }

  @js.native
  sealed trait WorkspaceImageIngestionProcess extends js.Any
  object WorkspaceImageIngestionProcess extends js.Object {
    val BYOL_REGULAR = "BYOL_REGULAR".asInstanceOf[WorkspaceImageIngestionProcess]
    val BYOL_GRAPHICS = "BYOL_GRAPHICS".asInstanceOf[WorkspaceImageIngestionProcess]
    val BYOL_GRAPHICSPRO = "BYOL_GRAPHICSPRO".asInstanceOf[WorkspaceImageIngestionProcess]

    val values = js.Object.freeze(js.Array(BYOL_REGULAR, BYOL_GRAPHICS, BYOL_GRAPHICSPRO))
  }

  @js.native
  sealed trait WorkspaceImageRequiredTenancy extends js.Any
  object WorkspaceImageRequiredTenancy extends js.Object {
    val DEFAULT = "DEFAULT".asInstanceOf[WorkspaceImageRequiredTenancy]
    val DEDICATED = "DEDICATED".asInstanceOf[WorkspaceImageRequiredTenancy]

    val values = js.Object.freeze(js.Array(DEFAULT, DEDICATED))
  }

  @js.native
  sealed trait WorkspaceImageState extends js.Any
  object WorkspaceImageState extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[WorkspaceImageState]
    val PENDING = "PENDING".asInstanceOf[WorkspaceImageState]
    val ERROR = "ERROR".asInstanceOf[WorkspaceImageState]

    val values = js.Object.freeze(js.Array(AVAILABLE, PENDING, ERROR))
  }

  /**
    * Describes a WorkSpace.
    */
  @js.native
  trait WorkspaceProperties extends js.Object {
    var ComputeTypeName: js.UndefOr[Compute]
    var RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib]
    var RunningMode: js.UndefOr[RunningMode]
    var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes]
    var UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib]
  }

  object WorkspaceProperties {
    @inline
    def apply(
        ComputeTypeName: js.UndefOr[Compute] = js.undefined,
        RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib] = js.undefined,
        RunningMode: js.UndefOr[RunningMode] = js.undefined,
        RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes] = js.undefined,
        UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib] = js.undefined
    ): WorkspaceProperties = {
      val __obj = js.Dynamic.literal()
      ComputeTypeName.foreach(__v => __obj.updateDynamic("ComputeTypeName")(__v.asInstanceOf[js.Any]))
      RootVolumeSizeGib.foreach(__v => __obj.updateDynamic("RootVolumeSizeGib")(__v.asInstanceOf[js.Any]))
      RunningMode.foreach(__v => __obj.updateDynamic("RunningMode")(__v.asInstanceOf[js.Any]))
      RunningModeAutoStopTimeoutInMinutes.foreach(__v =>
        __obj.updateDynamic("RunningModeAutoStopTimeoutInMinutes")(__v.asInstanceOf[js.Any])
      )
      UserVolumeSizeGib.foreach(__v => __obj.updateDynamic("UserVolumeSizeGib")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceProperties]
    }
  }

  /**
    * Describes the information used to create a WorkSpace.
    */
  @js.native
  trait WorkspaceRequest extends js.Object {
    var BundleId: BundleId
    var DirectoryId: DirectoryId
    var UserName: UserName
    var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject]
    var Tags: js.UndefOr[TagList]
    var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject]
    var VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey]
    var WorkspaceProperties: js.UndefOr[WorkspaceProperties]
  }

  object WorkspaceRequest {
    @inline
    def apply(
        BundleId: BundleId,
        DirectoryId: DirectoryId,
        UserName: UserName,
        RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined,
        VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey] = js.undefined,
        WorkspaceProperties: js.UndefOr[WorkspaceProperties] = js.undefined
    ): WorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "BundleId" -> BundleId.asInstanceOf[js.Any],
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      RootVolumeEncryptionEnabled.foreach(__v =>
        __obj.updateDynamic("RootVolumeEncryptionEnabled")(__v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserVolumeEncryptionEnabled.foreach(__v =>
        __obj.updateDynamic("UserVolumeEncryptionEnabled")(__v.asInstanceOf[js.Any])
      )
      VolumeEncryptionKey.foreach(__v => __obj.updateDynamic("VolumeEncryptionKey")(__v.asInstanceOf[js.Any]))
      WorkspaceProperties.foreach(__v => __obj.updateDynamic("WorkspaceProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceRequest]
    }
  }

  @js.native
  sealed trait WorkspaceState extends js.Any
  object WorkspaceState extends js.Object {
    val PENDING = "PENDING".asInstanceOf[WorkspaceState]
    val AVAILABLE = "AVAILABLE".asInstanceOf[WorkspaceState]
    val IMPAIRED = "IMPAIRED".asInstanceOf[WorkspaceState]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[WorkspaceState]
    val REBOOTING = "REBOOTING".asInstanceOf[WorkspaceState]
    val STARTING = "STARTING".asInstanceOf[WorkspaceState]
    val REBUILDING = "REBUILDING".asInstanceOf[WorkspaceState]
    val RESTORING = "RESTORING".asInstanceOf[WorkspaceState]
    val MAINTENANCE = "MAINTENANCE".asInstanceOf[WorkspaceState]
    val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE".asInstanceOf[WorkspaceState]
    val TERMINATING = "TERMINATING".asInstanceOf[WorkspaceState]
    val TERMINATED = "TERMINATED".asInstanceOf[WorkspaceState]
    val SUSPENDED = "SUSPENDED".asInstanceOf[WorkspaceState]
    val UPDATING = "UPDATING".asInstanceOf[WorkspaceState]
    val STOPPING = "STOPPING".asInstanceOf[WorkspaceState]
    val STOPPED = "STOPPED".asInstanceOf[WorkspaceState]
    val ERROR = "ERROR".asInstanceOf[WorkspaceState]

    val values = js.Object.freeze(
      js.Array(
        PENDING,
        AVAILABLE,
        IMPAIRED,
        UNHEALTHY,
        REBOOTING,
        STARTING,
        REBUILDING,
        RESTORING,
        MAINTENANCE,
        ADMIN_MAINTENANCE,
        TERMINATING,
        TERMINATED,
        SUSPENDED,
        UPDATING,
        STOPPING,
        STOPPED,
        ERROR
      )
    )
  }

  /**
    * Describes an IP access control group.
    */
  @js.native
  trait WorkspacesIpGroup extends js.Object {
    var groupDesc: js.UndefOr[IpGroupDesc]
    var groupId: js.UndefOr[IpGroupId]
    var groupName: js.UndefOr[IpGroupName]
    var userRules: js.UndefOr[IpRuleList]
  }

  object WorkspacesIpGroup {
    @inline
    def apply(
        groupDesc: js.UndefOr[IpGroupDesc] = js.undefined,
        groupId: js.UndefOr[IpGroupId] = js.undefined,
        groupName: js.UndefOr[IpGroupName] = js.undefined,
        userRules: js.UndefOr[IpRuleList] = js.undefined
    ): WorkspacesIpGroup = {
      val __obj = js.Dynamic.literal()
      groupDesc.foreach(__v => __obj.updateDynamic("groupDesc")(__v.asInstanceOf[js.Any]))
      groupId.foreach(__v => __obj.updateDynamic("groupId")(__v.asInstanceOf[js.Any]))
      groupName.foreach(__v => __obj.updateDynamic("groupName")(__v.asInstanceOf[js.Any]))
      userRules.foreach(__v => __obj.updateDynamic("userRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspacesIpGroup]
    }
  }
}
