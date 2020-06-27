package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object workspaces {
  type ARN                                 = String
  type AccountModificationList             = js.Array[AccountModification]
  type Alias                               = String
  type BooleanObject                       = Boolean
  type BundleId                            = String
  type BundleIdList                        = js.Array[BundleId]
  type BundleList                          = js.Array[WorkspaceBundle]
  type BundleOwner                         = String
  type ClientPropertiesList                = js.Array[ClientPropertiesResult]
  type ComputerName                        = String
  type DedicatedTenancyCidrRangeList       = js.Array[DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange = String
  type DefaultOu                           = String
  type Description                         = String
  type DirectoryId                         = String
  type DirectoryIdList                     = js.Array[DirectoryId]
  type DirectoryList                       = js.Array[WorkspaceDirectory]
  type DirectoryName                       = String
  type DnsIpAddresses                      = js.Array[IpAddress]
  type Ec2ImageId                          = String
  type ErrorType                           = String
  type FailedCreateWorkspaceRequests       = js.Array[FailedCreateWorkspaceRequest]
  type FailedRebootWorkspaceRequests       = js.Array[FailedWorkspaceChangeRequest]
  type FailedRebuildWorkspaceRequests      = js.Array[FailedWorkspaceChangeRequest]
  type FailedStartWorkspaceRequests        = js.Array[FailedWorkspaceChangeRequest]
  type FailedStopWorkspaceRequests         = js.Array[FailedWorkspaceChangeRequest]
  type FailedTerminateWorkspaceRequests    = js.Array[FailedWorkspaceChangeRequest]
  type IpAddress                           = String
  type IpGroupDesc                         = String
  type IpGroupId                           = String
  type IpGroupIdList                       = js.Array[IpGroupId]
  type IpGroupName                         = String
  type IpRevokedRuleList                   = js.Array[IpRule]
  type IpRule                              = String
  type IpRuleDesc                          = String
  type IpRuleList                          = js.Array[IpRuleItem]
  type Limit                               = Int
  type ManagementCidrRangeConstraint       = String
  type ManagementCidrRangeMaxResults       = Int
  type ModificationStateList               = js.Array[ModificationState]
  type NonEmptyString                      = String
  type PaginationToken                     = String
  type RebootWorkspaceRequests             = js.Array[RebootRequest]
  type RebuildWorkspaceRequests            = js.Array[RebuildRequest]
  type Region                              = String
  type RegistrationCode                    = String
  type ResourceIdList                      = js.Array[NonEmptyString]
  type RootVolumeSizeGib                   = Int
  type RunningModeAutoStopTimeoutInMinutes = Int
  type SecurityGroupId                     = String
  type SnapshotList                        = js.Array[Snapshot]
  type StartWorkspaceRequests              = js.Array[StartRequest]
  type StopWorkspaceRequests               = js.Array[StopRequest]
  type SubnetId                            = String
  type SubnetIds                           = js.Array[SubnetId]
  type TagKey                              = String
  type TagKeyList                          = js.Array[NonEmptyString]
  type TagList                             = js.Array[Tag]
  type TagValue                            = String
  type TerminateWorkspaceRequests          = js.Array[TerminateRequest]
  type Timestamp                           = js.Date
  type UserName                            = String
  type UserVolumeSizeGib                   = Int
  type VolumeEncryptionKey                 = String
  type WorkspaceConnectionStatusList       = js.Array[WorkspaceConnectionStatus]
  type WorkspaceErrorCode                  = String
  type WorkspaceId                         = String
  type WorkspaceIdList                     = js.Array[WorkspaceId]
  type WorkspaceImageDescription           = String
  type WorkspaceImageErrorCode             = String
  type WorkspaceImageId                    = String
  type WorkspaceImageIdList                = js.Array[WorkspaceImageId]
  type WorkspaceImageList                  = js.Array[WorkspaceImage]
  type WorkspaceImageName                  = String
  type WorkspaceList                       = js.Array[Workspace]
  type WorkspaceRequestList                = js.Array[WorkspaceRequest]
  type WorkspacesIpGroupsList              = js.Array[WorkspacesIpGroup]

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
  @JSImport("aws-sdk", "WorkSpaces")
  class WorkSpaces() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateIpGroups(params: AssociateIpGroupsRequest): Request[AssociateIpGroupsResult]          = js.native
    def authorizeIpRules(params: AuthorizeIpRulesRequest): Request[AuthorizeIpRulesResult]             = js.native
    def copyWorkspaceImage(params: CopyWorkspaceImageRequest): Request[CopyWorkspaceImageResult]       = js.native
    def createIpGroup(params: CreateIpGroupRequest): Request[CreateIpGroupResult]                      = js.native
    def createTags(params: CreateTagsRequest): Request[CreateTagsResult]                               = js.native
    def createWorkspaces(params: CreateWorkspacesRequest): Request[CreateWorkspacesResult]             = js.native
    def deleteIpGroup(params: DeleteIpGroupRequest): Request[DeleteIpGroupResult]                      = js.native
    def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResult]                               = js.native
    def deleteWorkspaceImage(params: DeleteWorkspaceImageRequest): Request[DeleteWorkspaceImageResult] = js.native
    def deregisterWorkspaceDirectory(
        params: DeregisterWorkspaceDirectoryRequest
    ): Request[DeregisterWorkspaceDirectoryResult]                                      = js.native
    def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResult] = js.native
    def describeAccountModifications(
        params: DescribeAccountModificationsRequest
    ): Request[DescribeAccountModificationsResult] = js.native
    def describeClientProperties(params: DescribeClientPropertiesRequest): Request[DescribeClientPropertiesResult] =
      js.native
    def describeIpGroups(params: DescribeIpGroupsRequest): Request[DescribeIpGroupsResult] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult]             = js.native
    def describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest): Request[DescribeWorkspaceBundlesResult] =
      js.native
    def describeWorkspaceDirectories(
        params: DescribeWorkspaceDirectoriesRequest
    ): Request[DescribeWorkspaceDirectoriesResult] = js.native
    def describeWorkspaceImages(params: DescribeWorkspaceImagesRequest): Request[DescribeWorkspaceImagesResult] =
      js.native
    def describeWorkspaceSnapshots(
        params: DescribeWorkspaceSnapshotsRequest
    ): Request[DescribeWorkspaceSnapshotsResult]                                                 = js.native
    def describeWorkspaces(params: DescribeWorkspacesRequest): Request[DescribeWorkspacesResult] = js.native
    def describeWorkspacesConnectionStatus(
        params: DescribeWorkspacesConnectionStatusRequest
    ): Request[DescribeWorkspacesConnectionStatusResult]                                               = js.native
    def disassociateIpGroups(params: DisassociateIpGroupsRequest): Request[DisassociateIpGroupsResult] = js.native
    def importWorkspaceImage(params: ImportWorkspaceImageRequest): Request[ImportWorkspaceImageResult] = js.native
    def listAvailableManagementCidrRanges(
        params: ListAvailableManagementCidrRangesRequest
    ): Request[ListAvailableManagementCidrRangesResult]                                                      = js.native
    def migrateWorkspace(params: MigrateWorkspaceRequest): Request[MigrateWorkspaceResult]                   = js.native
    def modifyAccount(params: ModifyAccountRequest): Request[ModifyAccountResult]                            = js.native
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
    def rebootWorkspaces(params: RebootWorkspacesRequest): Request[RebootWorkspacesResult]             = js.native
    def rebuildWorkspaces(params: RebuildWorkspacesRequest): Request[RebuildWorkspacesResult]          = js.native
    def registerWorkspaceDirectory(
        params: RegisterWorkspaceDirectoryRequest
    ): Request[RegisterWorkspaceDirectoryResult]                                                       = js.native
    def restoreWorkspace(params: RestoreWorkspaceRequest): Request[RestoreWorkspaceResult]             = js.native
    def revokeIpRules(params: RevokeIpRulesRequest): Request[RevokeIpRulesResult]                      = js.native
    def startWorkspaces(params: StartWorkspacesRequest): Request[StartWorkspacesResult]                = js.native
    def stopWorkspaces(params: StopWorkspacesRequest): Request[StopWorkspacesResult]                   = js.native
    def terminateWorkspaces(params: TerminateWorkspacesRequest): Request[TerminateWorkspacesResult]    = js.native
    def updateRulesOfIpGroup(params: UpdateRulesOfIpGroupRequest): Request[UpdateRulesOfIpGroupResult] = js.native
  }

  @js.native
  sealed trait AccessPropertyValue extends js.Any
  object AccessPropertyValue extends js.Object {
    val ALLOW = "ALLOW".asInstanceOf[AccessPropertyValue]
    val DENY  = "DENY".asInstanceOf[AccessPropertyValue]

    val values = js.Object.freeze(js.Array(ALLOW, DENY))
  }

  /**
    * Describes a modification to the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  @js.native
  @Factory
  trait AccountModification extends js.Object {
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum]
    var ErrorCode: js.UndefOr[WorkspaceErrorCode]
    var ErrorMessage: js.UndefOr[Description]
    var ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum]
    var StartTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait AssociateIpGroupsRequest extends js.Object {
    var DirectoryId: DirectoryId
    var GroupIds: IpGroupIdList
  }

  @js.native
  @Factory
  trait AssociateIpGroupsResult extends js.Object {}

  @js.native
  @Factory
  trait AuthorizeIpRulesRequest extends js.Object {
    var GroupId: IpGroupId
    var UserRules: IpRuleList
  }

  @js.native
  @Factory
  trait AuthorizeIpRulesResult extends js.Object {}

  /**
    * Describes an Amazon WorkSpaces client.
    */
  @js.native
  @Factory
  trait ClientProperties extends js.Object {
    var ReconnectEnabled: js.UndefOr[ReconnectEnum]
  }

  /**
    * Information about the Amazon WorkSpaces client.
    */
  @js.native
  @Factory
  trait ClientPropertiesResult extends js.Object {
    var ClientProperties: js.UndefOr[ClientProperties]
    var ResourceId: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait Compute extends js.Any
  object Compute extends js.Object {
    val VALUE       = "VALUE".asInstanceOf[Compute]
    val STANDARD    = "STANDARD".asInstanceOf[Compute]
    val PERFORMANCE = "PERFORMANCE".asInstanceOf[Compute]
    val POWER       = "POWER".asInstanceOf[Compute]
    val GRAPHICS    = "GRAPHICS".asInstanceOf[Compute]
    val POWERPRO    = "POWERPRO".asInstanceOf[Compute]
    val GRAPHICSPRO = "GRAPHICSPRO".asInstanceOf[Compute]

    val values = js.Object.freeze(js.Array(VALUE, STANDARD, PERFORMANCE, POWER, GRAPHICS, POWERPRO, GRAPHICSPRO))
  }

  /**
    * Describes the compute type.
    */
  @js.native
  @Factory
  trait ComputeType extends js.Object {
    var Name: js.UndefOr[Compute]
  }

  @js.native
  sealed trait ConnectionState extends js.Any
  object ConnectionState extends js.Object {
    val CONNECTED    = "CONNECTED".asInstanceOf[ConnectionState]
    val DISCONNECTED = "DISCONNECTED".asInstanceOf[ConnectionState]
    val UNKNOWN      = "UNKNOWN".asInstanceOf[ConnectionState]

    val values = js.Object.freeze(js.Array(CONNECTED, DISCONNECTED, UNKNOWN))
  }

  @js.native
  @Factory
  trait CopyWorkspaceImageRequest extends js.Object {
    var Name: WorkspaceImageName
    var SourceImageId: WorkspaceImageId
    var SourceRegion: Region
    var Description: js.UndefOr[WorkspaceImageDescription]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CopyWorkspaceImageResult extends js.Object {
    var ImageId: js.UndefOr[WorkspaceImageId]
  }

  @js.native
  @Factory
  trait CreateIpGroupRequest extends js.Object {
    var GroupName: IpGroupName
    var GroupDesc: js.UndefOr[IpGroupDesc]
    var Tags: js.UndefOr[TagList]
    var UserRules: js.UndefOr[IpRuleList]
  }

  @js.native
  @Factory
  trait CreateIpGroupResult extends js.Object {
    var GroupId: js.UndefOr[IpGroupId]
  }

  @js.native
  @Factory
  trait CreateTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
    var Tags: TagList
  }

  @js.native
  @Factory
  trait CreateTagsResult extends js.Object {}

  @js.native
  @Factory
  trait CreateWorkspacesRequest extends js.Object {
    var Workspaces: WorkspaceRequestList
  }

  @js.native
  @Factory
  trait CreateWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests]
    var PendingRequests: js.UndefOr[WorkspaceList]
  }

  @js.native
  sealed trait DedicatedTenancyModificationStateEnum extends js.Any
  object DedicatedTenancyModificationStateEnum extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[DedicatedTenancyModificationStateEnum]
    val COMPLETED = "COMPLETED".asInstanceOf[DedicatedTenancyModificationStateEnum]
    val FAILED    = "FAILED".asInstanceOf[DedicatedTenancyModificationStateEnum]

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
    val ENABLED  = "ENABLED".asInstanceOf[DedicatedTenancySupportResultEnum]
    val DISABLED = "DISABLED".asInstanceOf[DedicatedTenancySupportResultEnum]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Describes the default values that are used to create WorkSpaces. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html|Update Directory Details for Your WorkSpaces]].
    */
  @js.native
  @Factory
  trait DefaultWorkspaceCreationProperties extends js.Object {
    var CustomSecurityGroupId: js.UndefOr[SecurityGroupId]
    var DefaultOu: js.UndefOr[DefaultOu]
    var EnableInternetAccess: js.UndefOr[BooleanObject]
    var EnableMaintenanceMode: js.UndefOr[BooleanObject]
    var EnableWorkDocs: js.UndefOr[BooleanObject]
    var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject]
  }

  @js.native
  @Factory
  trait DeleteIpGroupRequest extends js.Object {
    var GroupId: IpGroupId
  }

  @js.native
  @Factory
  trait DeleteIpGroupResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait DeleteTagsResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteWorkspaceImageRequest extends js.Object {
    var ImageId: WorkspaceImageId
  }

  @js.native
  @Factory
  trait DeleteWorkspaceImageResult extends js.Object {}

  @js.native
  @Factory
  trait DeregisterWorkspaceDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  @js.native
  @Factory
  trait DeregisterWorkspaceDirectoryResult extends js.Object {}

  @js.native
  @Factory
  trait DescribeAccountModificationsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeAccountModificationsResult extends js.Object {
    var AccountModifications: js.UndefOr[AccountModificationList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeAccountRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeAccountResult extends js.Object {
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum]
  }

  @js.native
  @Factory
  trait DescribeClientPropertiesRequest extends js.Object {
    var ResourceIds: ResourceIdList
  }

  @js.native
  @Factory
  trait DescribeClientPropertiesResult extends js.Object {
    var ClientPropertiesList: js.UndefOr[ClientPropertiesList]
  }

  @js.native
  @Factory
  trait DescribeIpGroupsRequest extends js.Object {
    var GroupIds: js.UndefOr[IpGroupIdList]
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeIpGroupsResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Result: js.UndefOr[WorkspacesIpGroupsList]
  }

  @js.native
  @Factory
  trait DescribeTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
  }

  @js.native
  @Factory
  trait DescribeTagsResult extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait DescribeWorkspaceBundlesRequest extends js.Object {
    var BundleIds: js.UndefOr[BundleIdList]
    var NextToken: js.UndefOr[PaginationToken]
    var Owner: js.UndefOr[BundleOwner]
  }

  @js.native
  @Factory
  trait DescribeWorkspaceBundlesResult extends js.Object {
    var Bundles: js.UndefOr[BundleList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeWorkspaceDirectoriesRequest extends js.Object {
    var DirectoryIds: js.UndefOr[DirectoryIdList]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeWorkspaceDirectoriesResult extends js.Object {
    var Directories: js.UndefOr[DirectoryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeWorkspaceImagesRequest extends js.Object {
    var ImageIds: js.UndefOr[WorkspaceImageIdList]
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeWorkspaceImagesResult extends js.Object {
    var Images: js.UndefOr[WorkspaceImageList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeWorkspaceSnapshotsRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  @js.native
  @Factory
  trait DescribeWorkspaceSnapshotsResult extends js.Object {
    var RebuildSnapshots: js.UndefOr[SnapshotList]
    var RestoreSnapshots: js.UndefOr[SnapshotList]
  }

  @js.native
  @Factory
  trait DescribeWorkspacesConnectionStatusRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var WorkspaceIds: js.UndefOr[WorkspaceIdList]
  }

  @js.native
  @Factory
  trait DescribeWorkspacesConnectionStatusResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList]
  }

  @js.native
  @Factory
  trait DescribeWorkspacesRequest extends js.Object {
    var BundleId: js.UndefOr[BundleId]
    var DirectoryId: js.UndefOr[DirectoryId]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
    var UserName: js.UndefOr[UserName]
    var WorkspaceIds: js.UndefOr[WorkspaceIdList]
  }

  @js.native
  @Factory
  trait DescribeWorkspacesResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Workspaces: js.UndefOr[WorkspaceList]
  }

  @js.native
  @Factory
  trait DisassociateIpGroupsRequest extends js.Object {
    var DirectoryId: DirectoryId
    var GroupIds: IpGroupIdList
  }

  @js.native
  @Factory
  trait DisassociateIpGroupsResult extends js.Object {}

  /**
    * Describes a WorkSpace that cannot be created.
    */
  @js.native
  @Factory
  trait FailedCreateWorkspaceRequest extends js.Object {
    var ErrorCode: js.UndefOr[ErrorType]
    var ErrorMessage: js.UndefOr[Description]
    var WorkspaceRequest: js.UndefOr[WorkspaceRequest]
  }

  /**
    * Describes a WorkSpace that could not be rebooted. (<a>RebootWorkspaces</a>), rebuilt (<a>RebuildWorkspaces</a>), restored (<a>RestoreWorkspace</a>), terminated (<a>TerminateWorkspaces</a>), started (<a>StartWorkspaces</a>), or stopped (<a>StopWorkspaces</a>).
    */
  @js.native
  @Factory
  trait FailedWorkspaceChangeRequest extends js.Object {
    var ErrorCode: js.UndefOr[ErrorType]
    var ErrorMessage: js.UndefOr[Description]
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  @js.native
  @Factory
  trait ImportWorkspaceImageRequest extends js.Object {
    var Ec2ImageId: Ec2ImageId
    var ImageDescription: WorkspaceImageDescription
    var ImageName: WorkspaceImageName
    var IngestionProcess: WorkspaceImageIngestionProcess
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ImportWorkspaceImageResult extends js.Object {
    var ImageId: js.UndefOr[WorkspaceImageId]
  }

  /**
    * Describes a rule for an IP access control group.
    */
  @js.native
  @Factory
  trait IpRuleItem extends js.Object {
    var ipRule: js.UndefOr[IpRule]
    var ruleDesc: js.UndefOr[IpRuleDesc]
  }

  @js.native
  @Factory
  trait ListAvailableManagementCidrRangesRequest extends js.Object {
    var ManagementCidrRangeConstraint: ManagementCidrRangeConstraint
    var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListAvailableManagementCidrRangesResult extends js.Object {
    var ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait MigrateWorkspaceRequest extends js.Object {
    var BundleId: BundleId
    var SourceWorkspaceId: WorkspaceId
  }

  @js.native
  @Factory
  trait MigrateWorkspaceResult extends js.Object {
    var SourceWorkspaceId: js.UndefOr[WorkspaceId]
    var TargetWorkspaceId: js.UndefOr[WorkspaceId]
  }

  @js.native
  sealed trait ModificationResourceEnum extends js.Any
  object ModificationResourceEnum extends js.Object {
    val ROOT_VOLUME  = "ROOT_VOLUME".asInstanceOf[ModificationResourceEnum]
    val USER_VOLUME  = "USER_VOLUME".asInstanceOf[ModificationResourceEnum]
    val COMPUTE_TYPE = "COMPUTE_TYPE".asInstanceOf[ModificationResourceEnum]

    val values = js.Object.freeze(js.Array(ROOT_VOLUME, USER_VOLUME, COMPUTE_TYPE))
  }

  /**
    * Describes a WorkSpace modification.
    */
  @js.native
  @Factory
  trait ModificationState extends js.Object {
    var Resource: js.UndefOr[ModificationResourceEnum]
    var State: js.UndefOr[ModificationStateEnum]
  }

  @js.native
  sealed trait ModificationStateEnum extends js.Any
  object ModificationStateEnum extends js.Object {
    val UPDATE_INITIATED   = "UPDATE_INITIATED".asInstanceOf[ModificationStateEnum]
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[ModificationStateEnum]

    val values = js.Object.freeze(js.Array(UPDATE_INITIATED, UPDATE_IN_PROGRESS))
  }

  @js.native
  @Factory
  trait ModifyAccountRequest extends js.Object {
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum]
  }

  @js.native
  @Factory
  trait ModifyAccountResult extends js.Object {}

  @js.native
  @Factory
  trait ModifyClientPropertiesRequest extends js.Object {
    var ClientProperties: ClientProperties
    var ResourceId: NonEmptyString
  }

  @js.native
  @Factory
  trait ModifyClientPropertiesResult extends js.Object {}

  @js.native
  @Factory
  trait ModifySelfservicePermissionsRequest extends js.Object {
    var ResourceId: DirectoryId
    var SelfservicePermissions: SelfservicePermissions
  }

  @js.native
  @Factory
  trait ModifySelfservicePermissionsResult extends js.Object {}

  @js.native
  @Factory
  trait ModifyWorkspaceAccessPropertiesRequest extends js.Object {
    var ResourceId: DirectoryId
    var WorkspaceAccessProperties: WorkspaceAccessProperties
  }

  @js.native
  @Factory
  trait ModifyWorkspaceAccessPropertiesResult extends js.Object {}

  @js.native
  @Factory
  trait ModifyWorkspaceCreationPropertiesRequest extends js.Object {
    var ResourceId: DirectoryId
    var WorkspaceCreationProperties: WorkspaceCreationProperties
  }

  @js.native
  @Factory
  trait ModifyWorkspaceCreationPropertiesResult extends js.Object {}

  @js.native
  @Factory
  trait ModifyWorkspacePropertiesRequest extends js.Object {
    var WorkspaceId: WorkspaceId
    var WorkspaceProperties: WorkspaceProperties
  }

  @js.native
  @Factory
  trait ModifyWorkspacePropertiesResult extends js.Object {}

  @js.native
  @Factory
  trait ModifyWorkspaceStateRequest extends js.Object {
    var WorkspaceId: WorkspaceId
    var WorkspaceState: TargetWorkspaceState
  }

  @js.native
  @Factory
  trait ModifyWorkspaceStateResult extends js.Object {}

  /**
    * The operating system that the image is running.
    */
  @js.native
  @Factory
  trait OperatingSystem extends js.Object {
    var Type: js.UndefOr[OperatingSystemType]
  }

  @js.native
  sealed trait OperatingSystemType extends js.Any
  object OperatingSystemType extends js.Object {
    val WINDOWS = "WINDOWS".asInstanceOf[OperatingSystemType]
    val LINUX   = "LINUX".asInstanceOf[OperatingSystemType]

    val values = js.Object.freeze(js.Array(WINDOWS, LINUX))
  }

  /**
    * Describes the information used to reboot a WorkSpace.
    */
  @js.native
  @Factory
  trait RebootRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  @js.native
  @Factory
  trait RebootWorkspacesRequest extends js.Object {
    var RebootWorkspaceRequests: RebootWorkspaceRequests
  }

  @js.native
  @Factory
  trait RebootWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests]
  }

  /**
    * Describes the information used to rebuild a WorkSpace.
    */
  @js.native
  @Factory
  trait RebuildRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  @js.native
  @Factory
  trait RebuildWorkspacesRequest extends js.Object {
    var RebuildWorkspaceRequests: RebuildWorkspaceRequests
  }

  @js.native
  @Factory
  trait RebuildWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests]
  }

  @js.native
  sealed trait ReconnectEnum extends js.Any
  object ReconnectEnum extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[ReconnectEnum]
    val DISABLED = "DISABLED".asInstanceOf[ReconnectEnum]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  @Factory
  trait RegisterWorkspaceDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
    var EnableWorkDocs: BooleanObject
    var EnableSelfService: js.UndefOr[BooleanObject]
    var SubnetIds: js.UndefOr[SubnetIds]
    var Tags: js.UndefOr[TagList]
    var Tenancy: js.UndefOr[Tenancy]
  }

  @js.native
  @Factory
  trait RegisterWorkspaceDirectoryResult extends js.Object {}

  @js.native
  @Factory
  trait RestoreWorkspaceRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  @js.native
  @Factory
  trait RestoreWorkspaceResult extends js.Object {}

  @js.native
  @Factory
  trait RevokeIpRulesRequest extends js.Object {
    var GroupId: IpGroupId
    var UserRules: IpRevokedRuleList
  }

  @js.native
  @Factory
  trait RevokeIpRulesResult extends js.Object {}

  /**
    * Describes the root volume for a WorkSpace bundle.
    */
  @js.native
  @Factory
  trait RootStorage extends js.Object {
    var Capacity: js.UndefOr[NonEmptyString]
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
  @Factory
  trait SelfservicePermissions extends js.Object {
    var ChangeComputeType: js.UndefOr[ReconnectEnum]
    var IncreaseVolumeSize: js.UndefOr[ReconnectEnum]
    var RebuildWorkspace: js.UndefOr[ReconnectEnum]
    var RestartWorkspace: js.UndefOr[ReconnectEnum]
    var SwitchRunningMode: js.UndefOr[ReconnectEnum]
  }

  /**
    * Describes a snapshot.
    */
  @js.native
  @Factory
  trait Snapshot extends js.Object {
    var SnapshotTime: js.UndefOr[Timestamp]
  }

  /**
    * Information used to start a WorkSpace.
    */
  @js.native
  @Factory
  trait StartRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  @js.native
  @Factory
  trait StartWorkspacesRequest extends js.Object {
    var StartWorkspaceRequests: StartWorkspaceRequests
  }

  @js.native
  @Factory
  trait StartWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedStartWorkspaceRequests]
  }

  /**
    * Describes the information used to stop a WorkSpace.
    */
  @js.native
  @Factory
  trait StopRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  @js.native
  @Factory
  trait StopWorkspacesRequest extends js.Object {
    var StopWorkspaceRequests: StopWorkspaceRequests
  }

  @js.native
  @Factory
  trait StopWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedStopWorkspaceRequests]
  }

  /**
    * Describes a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  sealed trait TargetWorkspaceState extends js.Any
  object TargetWorkspaceState extends js.Object {
    val AVAILABLE         = "AVAILABLE".asInstanceOf[TargetWorkspaceState]
    val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE".asInstanceOf[TargetWorkspaceState]

    val values = js.Object.freeze(js.Array(AVAILABLE, ADMIN_MAINTENANCE))
  }

  @js.native
  sealed trait Tenancy extends js.Any
  object Tenancy extends js.Object {
    val DEDICATED = "DEDICATED".asInstanceOf[Tenancy]
    val SHARED    = "SHARED".asInstanceOf[Tenancy]

    val values = js.Object.freeze(js.Array(DEDICATED, SHARED))
  }

  /**
    * Describes the information used to terminate a WorkSpace.
    */
  @js.native
  @Factory
  trait TerminateRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  @js.native
  @Factory
  trait TerminateWorkspacesRequest extends js.Object {
    var TerminateWorkspaceRequests: TerminateWorkspaceRequests
  }

  @js.native
  @Factory
  trait TerminateWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests]
  }

  @js.native
  @Factory
  trait UpdateRulesOfIpGroupRequest extends js.Object {
    var GroupId: IpGroupId
    var UserRules: IpRuleList
  }

  @js.native
  @Factory
  trait UpdateRulesOfIpGroupResult extends js.Object {}

  /**
    * Describes the user storage for a WorkSpace bundle.
    */
  @js.native
  @Factory
  trait UserStorage extends js.Object {
    var Capacity: js.UndefOr[NonEmptyString]
  }

  /**
    * Describes a WorkSpace.
    */
  @js.native
  @Factory
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

  /**
    * The device types and operating systems that can be used to access a WorkSpace. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-network-requirements.html|Amazon WorkSpaces Client Network Requirements]].
    */
  @js.native
  @Factory
  trait WorkspaceAccessProperties extends js.Object {
    var DeviceTypeAndroid: js.UndefOr[AccessPropertyValue]
    var DeviceTypeChromeOs: js.UndefOr[AccessPropertyValue]
    var DeviceTypeIos: js.UndefOr[AccessPropertyValue]
    var DeviceTypeOsx: js.UndefOr[AccessPropertyValue]
    var DeviceTypeWeb: js.UndefOr[AccessPropertyValue]
    var DeviceTypeWindows: js.UndefOr[AccessPropertyValue]
    var DeviceTypeZeroClient: js.UndefOr[AccessPropertyValue]
  }

  /**
    * Describes a WorkSpace bundle.
    */
  @js.native
  @Factory
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

  /**
    * Describes the connection status of a WorkSpace.
    */
  @js.native
  @Factory
  trait WorkspaceConnectionStatus extends js.Object {
    var ConnectionState: js.UndefOr[ConnectionState]
    var ConnectionStateCheckTimestamp: js.UndefOr[Timestamp]
    var LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp]
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  /**
    * Describes the default properties that are used for creating WorkSpaces. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html|Update Directory Details for Your WorkSpaces]].
    */
  @js.native
  @Factory
  trait WorkspaceCreationProperties extends js.Object {
    var CustomSecurityGroupId: js.UndefOr[SecurityGroupId]
    var DefaultOu: js.UndefOr[DefaultOu]
    var EnableInternetAccess: js.UndefOr[BooleanObject]
    var EnableMaintenanceMode: js.UndefOr[BooleanObject]
    var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject]
  }

  /**
    * Describes a directory that is used with Amazon WorkSpaces.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait WorkspaceDirectoryState extends js.Any
  object WorkspaceDirectoryState extends js.Object {
    val REGISTERING   = "REGISTERING".asInstanceOf[WorkspaceDirectoryState]
    val REGISTERED    = "REGISTERED".asInstanceOf[WorkspaceDirectoryState]
    val DEREGISTERING = "DEREGISTERING".asInstanceOf[WorkspaceDirectoryState]
    val DEREGISTERED  = "DEREGISTERED".asInstanceOf[WorkspaceDirectoryState]
    val ERROR         = "ERROR".asInstanceOf[WorkspaceDirectoryState]

    val values = js.Object.freeze(js.Array(REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR))
  }

  @js.native
  sealed trait WorkspaceDirectoryType extends js.Any
  object WorkspaceDirectoryType extends js.Object {
    val SIMPLE_AD    = "SIMPLE_AD".asInstanceOf[WorkspaceDirectoryType]
    val AD_CONNECTOR = "AD_CONNECTOR".asInstanceOf[WorkspaceDirectoryType]

    val values = js.Object.freeze(js.Array(SIMPLE_AD, AD_CONNECTOR))
  }

  /**
    * Describes a WorkSpace image.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait WorkspaceImageIngestionProcess extends js.Any
  object WorkspaceImageIngestionProcess extends js.Object {
    val BYOL_REGULAR     = "BYOL_REGULAR".asInstanceOf[WorkspaceImageIngestionProcess]
    val BYOL_GRAPHICS    = "BYOL_GRAPHICS".asInstanceOf[WorkspaceImageIngestionProcess]
    val BYOL_GRAPHICSPRO = "BYOL_GRAPHICSPRO".asInstanceOf[WorkspaceImageIngestionProcess]

    val values = js.Object.freeze(js.Array(BYOL_REGULAR, BYOL_GRAPHICS, BYOL_GRAPHICSPRO))
  }

  @js.native
  sealed trait WorkspaceImageRequiredTenancy extends js.Any
  object WorkspaceImageRequiredTenancy extends js.Object {
    val DEFAULT   = "DEFAULT".asInstanceOf[WorkspaceImageRequiredTenancy]
    val DEDICATED = "DEDICATED".asInstanceOf[WorkspaceImageRequiredTenancy]

    val values = js.Object.freeze(js.Array(DEFAULT, DEDICATED))
  }

  @js.native
  sealed trait WorkspaceImageState extends js.Any
  object WorkspaceImageState extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[WorkspaceImageState]
    val PENDING   = "PENDING".asInstanceOf[WorkspaceImageState]
    val ERROR     = "ERROR".asInstanceOf[WorkspaceImageState]

    val values = js.Object.freeze(js.Array(AVAILABLE, PENDING, ERROR))
  }

  /**
    * Describes a WorkSpace.
    */
  @js.native
  @Factory
  trait WorkspaceProperties extends js.Object {
    var ComputeTypeName: js.UndefOr[Compute]
    var RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib]
    var RunningMode: js.UndefOr[RunningMode]
    var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes]
    var UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib]
  }

  /**
    * Describes the information used to create a WorkSpace.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait WorkspaceState extends js.Any
  object WorkspaceState extends js.Object {
    val PENDING           = "PENDING".asInstanceOf[WorkspaceState]
    val AVAILABLE         = "AVAILABLE".asInstanceOf[WorkspaceState]
    val IMPAIRED          = "IMPAIRED".asInstanceOf[WorkspaceState]
    val UNHEALTHY         = "UNHEALTHY".asInstanceOf[WorkspaceState]
    val REBOOTING         = "REBOOTING".asInstanceOf[WorkspaceState]
    val STARTING          = "STARTING".asInstanceOf[WorkspaceState]
    val REBUILDING        = "REBUILDING".asInstanceOf[WorkspaceState]
    val RESTORING         = "RESTORING".asInstanceOf[WorkspaceState]
    val MAINTENANCE       = "MAINTENANCE".asInstanceOf[WorkspaceState]
    val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE".asInstanceOf[WorkspaceState]
    val TERMINATING       = "TERMINATING".asInstanceOf[WorkspaceState]
    val TERMINATED        = "TERMINATED".asInstanceOf[WorkspaceState]
    val SUSPENDED         = "SUSPENDED".asInstanceOf[WorkspaceState]
    val UPDATING          = "UPDATING".asInstanceOf[WorkspaceState]
    val STOPPING          = "STOPPING".asInstanceOf[WorkspaceState]
    val STOPPED           = "STOPPED".asInstanceOf[WorkspaceState]
    val ERROR             = "ERROR".asInstanceOf[WorkspaceState]

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
  @Factory
  trait WorkspacesIpGroup extends js.Object {
    var groupDesc: js.UndefOr[IpGroupDesc]
    var groupId: js.UndefOr[IpGroupId]
    var groupName: js.UndefOr[IpGroupName]
    var userRules: js.UndefOr[IpRuleList]
  }
}
