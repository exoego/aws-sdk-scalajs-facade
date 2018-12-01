package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
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
  type Compute = String
  type ComputerName = String
  type ConnectionState = String
  type DedicatedTenancyCidrRangeList = js.Array[DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange = String
  type DedicatedTenancyModificationStateEnum = String
  type DedicatedTenancySupportEnum = String
  type DedicatedTenancySupportResultEnum = String
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
  type ModificationResourceEnum = String
  type ModificationStateEnum = String
  type ModificationStateList = js.Array[ModificationState]
  type NonEmptyString = String
  type OperatingSystemType = String
  type PaginationToken = String
  type RebootWorkspaceRequests = js.Array[RebootRequest]
  type RebuildWorkspaceRequests = js.Array[RebuildRequest]
  type ReconnectEnum = String
  type RegistrationCode = String
  type ResourceIdList = js.Array[NonEmptyString]
  type RootVolumeSizeGib = Int
  type RunningMode = String
  type RunningModeAutoStopTimeoutInMinutes = Int
  type SecurityGroupId = String
  type StartWorkspaceRequests = js.Array[StartRequest]
  type StopWorkspaceRequests = js.Array[StopRequest]
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[NonEmptyString]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetWorkspaceState = String
  type TerminateWorkspaceRequests = js.Array[TerminateRequest]
  type Timestamp = js.Date
  type UserName = String
  type UserVolumeSizeGib = Int
  type VolumeEncryptionKey = String
  type WorkspaceConnectionStatusList = js.Array[WorkspaceConnectionStatus]
  type WorkspaceDirectoryState = String
  type WorkspaceDirectoryType = String
  type WorkspaceErrorCode = String
  type WorkspaceId = String
  type WorkspaceIdList = js.Array[WorkspaceId]
  type WorkspaceImageDescription = String
  type WorkspaceImageErrorCode = String
  type WorkspaceImageId = String
  type WorkspaceImageIdList = js.Array[WorkspaceImageId]
  type WorkspaceImageIngestionProcess = String
  type WorkspaceImageList = js.Array[WorkspaceImage]
  type WorkspaceImageName = String
  type WorkspaceImageRequiredTenancy = String
  type WorkspaceImageState = String
  type WorkspaceList = js.Array[Workspace]
  type WorkspaceRequestList = js.Array[WorkspaceRequest]
  type WorkspaceState = String
  type WorkspacesIpGroupsList = js.Array[WorkspacesIpGroup]
}

package workspaces {
  @js.native
  @JSImport("aws-sdk", "WorkSpaces")
  class WorkSpaces(config: AWSConfig) extends js.Object {
    def associateIpGroups(params: AssociateIpGroupsRequest): Request[AssociateIpGroupsResult] = js.native
    def authorizeIpRules(params: AuthorizeIpRulesRequest): Request[AuthorizeIpRulesResult] = js.native
    def createIpGroup(params: CreateIpGroupRequest): Request[CreateIpGroupResult] = js.native
    def createTags(params: CreateTagsRequest): Request[CreateTagsResult] = js.native
    def createWorkspaces(params: CreateWorkspacesRequest): Request[CreateWorkspacesResult] = js.native
    def deleteIpGroup(params: DeleteIpGroupRequest): Request[DeleteIpGroupResult] = js.native
    def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResult] = js.native
    def deleteWorkspaceImage(params: DeleteWorkspaceImageRequest): Request[DeleteWorkspaceImageResult] = js.native
    def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResult] = js.native
    def describeAccountModifications(params: DescribeAccountModificationsRequest): Request[DescribeAccountModificationsResult] = js.native
    def describeClientProperties(params: DescribeClientPropertiesRequest): Request[DescribeClientPropertiesResult] = js.native
    def describeIpGroups(params: DescribeIpGroupsRequest): Request[DescribeIpGroupsResult] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult] = js.native
    def describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest): Request[DescribeWorkspaceBundlesResult] = js.native
    def describeWorkspaceDirectories(params: DescribeWorkspaceDirectoriesRequest): Request[DescribeWorkspaceDirectoriesResult] = js.native
    def describeWorkspaceImages(params: DescribeWorkspaceImagesRequest): Request[DescribeWorkspaceImagesResult] = js.native
    def describeWorkspaces(params: DescribeWorkspacesRequest): Request[DescribeWorkspacesResult] = js.native
    def describeWorkspacesConnectionStatus(params: DescribeWorkspacesConnectionStatusRequest): Request[DescribeWorkspacesConnectionStatusResult] = js.native
    def disassociateIpGroups(params: DisassociateIpGroupsRequest): Request[DisassociateIpGroupsResult] = js.native
    def importWorkspaceImage(params: ImportWorkspaceImageRequest): Request[ImportWorkspaceImageResult] = js.native
    def listAvailableManagementCidrRanges(params: ListAvailableManagementCidrRangesRequest): Request[ListAvailableManagementCidrRangesResult] = js.native
    def modifyAccount(params: ModifyAccountRequest): Request[ModifyAccountResult] = js.native
    def modifyClientProperties(params: ModifyClientPropertiesRequest): Request[ModifyClientPropertiesResult] = js.native
    def modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest): Request[ModifyWorkspacePropertiesResult] = js.native
    def modifyWorkspaceState(params: ModifyWorkspaceStateRequest): Request[ModifyWorkspaceStateResult] = js.native
    def rebootWorkspaces(params: RebootWorkspacesRequest): Request[RebootWorkspacesResult] = js.native
    def rebuildWorkspaces(params: RebuildWorkspacesRequest): Request[RebuildWorkspacesResult] = js.native
    def revokeIpRules(params: RevokeIpRulesRequest): Request[RevokeIpRulesResult] = js.native
    def startWorkspaces(params: StartWorkspacesRequest): Request[StartWorkspacesResult] = js.native
    def stopWorkspaces(params: StopWorkspacesRequest): Request[StopWorkspacesResult] = js.native
    def terminateWorkspaces(params: TerminateWorkspacesRequest): Request[TerminateWorkspacesResult] = js.native
    def updateRulesOfIpGroup(params: UpdateRulesOfIpGroupRequest): Request[UpdateRulesOfIpGroupResult] = js.native
  }

  /**
   * <p>Describes a modification to the configuration of bring your own license (BYOL) for the specified account. </p>
   */
  @js.native
  trait AccountModification extends js.Object {
    var ErrorCode: js.UndefOr[WorkspaceErrorCode]
    var StartTime: js.UndefOr[Timestamp]
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
    var ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum]
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum]
    var ErrorMessage: js.UndefOr[Description]
  }

  object AccountModification {
    def apply(
      ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined,
      ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum] = js.undefined,
      DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined,
      ErrorMessage: js.UndefOr[Description] = js.undefined): AccountModification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "DedicatedTenancyManagementCidrRange" -> DedicatedTenancyManagementCidrRange.map { x => x.asInstanceOf[js.Any] },
        "ModificationState" -> ModificationState.map { x => x.asInstanceOf[js.Any] },
        "DedicatedTenancySupport" -> DedicatedTenancySupport.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountModification]
    }
  }

  @js.native
  trait AssociateIpGroupsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var GroupIds: js.UndefOr[IpGroupIdList]
  }

  object AssociateIpGroupsRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      GroupIds: js.UndefOr[IpGroupIdList] = js.undefined): AssociateIpGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "GroupIds" -> GroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateIpGroupsRequest]
    }
  }

  @js.native
  trait AssociateIpGroupsResult extends js.Object {

  }

  object AssociateIpGroupsResult {
    def apply(): AssociateIpGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateIpGroupsResult]
    }
  }

  @js.native
  trait AuthorizeIpRulesRequest extends js.Object {
    var GroupId: js.UndefOr[IpGroupId]
    var UserRules: js.UndefOr[IpRuleList]
  }

  object AuthorizeIpRulesRequest {
    def apply(
      GroupId: js.UndefOr[IpGroupId] = js.undefined,
      UserRules: js.UndefOr[IpRuleList] = js.undefined): AuthorizeIpRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "UserRules" -> UserRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeIpRulesRequest]
    }
  }

  @js.native
  trait AuthorizeIpRulesResult extends js.Object {

  }

  object AuthorizeIpRulesResult {
    def apply(): AuthorizeIpRulesResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeIpRulesResult]
    }
  }

  /**
   * <p>Describes an Amazon WorkSpaces client.</p>
   */
  @js.native
  trait ClientProperties extends js.Object {
    var ReconnectEnabled: js.UndefOr[ReconnectEnum]
  }

  object ClientProperties {
    def apply(
      ReconnectEnabled: js.UndefOr[ReconnectEnum] = js.undefined): ClientProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReconnectEnabled" -> ReconnectEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClientProperties]
    }
  }

  /**
   * <p>Information about the Amazon WorkSpaces client.</p>
   */
  @js.native
  trait ClientPropertiesResult extends js.Object {
    var ResourceId: js.UndefOr[NonEmptyString]
    var ClientProperties: js.UndefOr[ClientProperties]
  }

  object ClientPropertiesResult {
    def apply(
      ResourceId: js.UndefOr[NonEmptyString] = js.undefined,
      ClientProperties: js.UndefOr[ClientProperties] = js.undefined): ClientPropertiesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ClientProperties" -> ClientProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClientPropertiesResult]
    }
  }

  object ComputeEnum {
    val VALUE = "VALUE"
    val STANDARD = "STANDARD"
    val PERFORMANCE = "PERFORMANCE"
    val POWER = "POWER"
    val GRAPHICS = "GRAPHICS"
    val POWERPRO = "POWERPRO"
    val GRAPHICSPRO = "GRAPHICSPRO"

    val values = IndexedSeq(VALUE, STANDARD, PERFORMANCE, POWER, GRAPHICS, POWERPRO, GRAPHICSPRO)
  }

  /**
   * <p>Describes the compute type.</p>
   */
  @js.native
  trait ComputeType extends js.Object {
    var Name: js.UndefOr[Compute]
  }

  object ComputeType {
    def apply(
      Name: js.UndefOr[Compute] = js.undefined): ComputeType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeType]
    }
  }

  object ConnectionStateEnum {
    val CONNECTED = "CONNECTED"
    val DISCONNECTED = "DISCONNECTED"
    val UNKNOWN = "UNKNOWN"

    val values = IndexedSeq(CONNECTED, DISCONNECTED, UNKNOWN)
  }

  @js.native
  trait CreateIpGroupRequest extends js.Object {
    var GroupName: js.UndefOr[IpGroupName]
    var GroupDesc: js.UndefOr[IpGroupDesc]
    var UserRules: js.UndefOr[IpRuleList]
  }

  object CreateIpGroupRequest {
    def apply(
      GroupName: js.UndefOr[IpGroupName] = js.undefined,
      GroupDesc: js.UndefOr[IpGroupDesc] = js.undefined,
      UserRules: js.UndefOr[IpRuleList] = js.undefined): CreateIpGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupDesc" -> GroupDesc.map { x => x.asInstanceOf[js.Any] },
        "UserRules" -> UserRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIpGroupRequest]
    }
  }

  @js.native
  trait CreateIpGroupResult extends js.Object {
    var GroupId: js.UndefOr[IpGroupId]
  }

  object CreateIpGroupResult {
    def apply(
      GroupId: js.UndefOr[IpGroupId] = js.undefined): CreateIpGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIpGroupResult]
    }
  }

  @js.native
  trait CreateTagsRequest extends js.Object {
    var ResourceId: js.UndefOr[NonEmptyString]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTagsRequest {
    def apply(
      ResourceId: js.UndefOr[NonEmptyString] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
    }
  }

  @js.native
  trait CreateTagsResult extends js.Object {

  }

  object CreateTagsResult {
    def apply(): CreateTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsResult]
    }
  }

  @js.native
  trait CreateWorkspacesRequest extends js.Object {
    var Workspaces: js.UndefOr[WorkspaceRequestList]
  }

  object CreateWorkspacesRequest {
    def apply(
      Workspaces: js.UndefOr[WorkspaceRequestList] = js.undefined): CreateWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Workspaces" -> Workspaces.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkspacesRequest]
    }
  }

  @js.native
  trait CreateWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests]
    var PendingRequests: js.UndefOr[WorkspaceList]
  }

  object CreateWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests] = js.undefined,
      PendingRequests: js.UndefOr[WorkspaceList] = js.undefined): CreateWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x => x.asInstanceOf[js.Any] },
        "PendingRequests" -> PendingRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkspacesResult]
    }
  }

  object DedicatedTenancyModificationStateEnumEnum {
    val PENDING = "PENDING"
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"

    val values = IndexedSeq(PENDING, COMPLETED, FAILED)
  }

  object DedicatedTenancySupportEnumEnum {
    val ENABLED = "ENABLED"

    val values = IndexedSeq(ENABLED)
  }

  object DedicatedTenancySupportResultEnumEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * <p>Describes the default values used to create a WorkSpace.</p>
   */
  @js.native
  trait DefaultWorkspaceCreationProperties extends js.Object {
    var DefaultOu: js.UndefOr[DefaultOu]
    var EnableWorkDocs: js.UndefOr[BooleanObject]
    var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject]
    var CustomSecurityGroupId: js.UndefOr[SecurityGroupId]
    var EnableInternetAccess: js.UndefOr[BooleanObject]
  }

  object DefaultWorkspaceCreationProperties {
    def apply(
      DefaultOu: js.UndefOr[DefaultOu] = js.undefined,
      EnableWorkDocs: js.UndefOr[BooleanObject] = js.undefined,
      UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.undefined,
      CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
      EnableInternetAccess: js.UndefOr[BooleanObject] = js.undefined): DefaultWorkspaceCreationProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultOu" -> DefaultOu.map { x => x.asInstanceOf[js.Any] },
        "EnableWorkDocs" -> EnableWorkDocs.map { x => x.asInstanceOf[js.Any] },
        "UserEnabledAsLocalAdministrator" -> UserEnabledAsLocalAdministrator.map { x => x.asInstanceOf[js.Any] },
        "CustomSecurityGroupId" -> CustomSecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "EnableInternetAccess" -> EnableInternetAccess.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultWorkspaceCreationProperties]
    }
  }

  @js.native
  trait DeleteIpGroupRequest extends js.Object {
    var GroupId: js.UndefOr[IpGroupId]
  }

  object DeleteIpGroupRequest {
    def apply(
      GroupId: js.UndefOr[IpGroupId] = js.undefined): DeleteIpGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIpGroupRequest]
    }
  }

  @js.native
  trait DeleteIpGroupResult extends js.Object {

  }

  object DeleteIpGroupResult {
    def apply(): DeleteIpGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIpGroupResult]
    }
  }

  @js.native
  trait DeleteTagsRequest extends js.Object {
    var ResourceId: js.UndefOr[NonEmptyString]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object DeleteTagsRequest {
    def apply(
      ResourceId: js.UndefOr[NonEmptyString] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  @js.native
  trait DeleteTagsResult extends js.Object {

  }

  object DeleteTagsResult {
    def apply(): DeleteTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsResult]
    }
  }

  @js.native
  trait DeleteWorkspaceImageRequest extends js.Object {
    var ImageId: js.UndefOr[WorkspaceImageId]
  }

  object DeleteWorkspaceImageRequest {
    def apply(
      ImageId: js.UndefOr[WorkspaceImageId] = js.undefined): DeleteWorkspaceImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkspaceImageRequest]
    }
  }

  @js.native
  trait DeleteWorkspaceImageResult extends js.Object {

  }

  object DeleteWorkspaceImageResult {
    def apply(): DeleteWorkspaceImageResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkspaceImageResult]
    }
  }

  @js.native
  trait DescribeAccountModificationsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeAccountModificationsRequest {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeAccountModificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountModificationsRequest]
    }
  }

  @js.native
  trait DescribeAccountModificationsResult extends js.Object {
    var AccountModifications: js.UndefOr[AccountModificationList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeAccountModificationsResult {
    def apply(
      AccountModifications: js.UndefOr[AccountModificationList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeAccountModificationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountModifications" -> AccountModifications.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountModificationsResult]
    }
  }

  @js.native
  trait DescribeAccountRequest extends js.Object {

  }

  object DescribeAccountRequest {
    def apply(): DescribeAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountRequest]
    }
  }

  @js.native
  trait DescribeAccountResult extends js.Object {
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum]
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
  }

  object DescribeAccountResult {
    def apply(
      DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined,
      DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined): DescribeAccountResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedTenancySupport" -> DedicatedTenancySupport.map { x => x.asInstanceOf[js.Any] },
        "DedicatedTenancyManagementCidrRange" -> DedicatedTenancyManagementCidrRange.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountResult]
    }
  }

  @js.native
  trait DescribeClientPropertiesRequest extends js.Object {
    var ResourceIds: js.UndefOr[ResourceIdList]
  }

  object DescribeClientPropertiesRequest {
    def apply(
      ResourceIds: js.UndefOr[ResourceIdList] = js.undefined): DescribeClientPropertiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIds" -> ResourceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClientPropertiesRequest]
    }
  }

  @js.native
  trait DescribeClientPropertiesResult extends js.Object {
    var ClientPropertiesList: js.UndefOr[ClientPropertiesList]
  }

  object DescribeClientPropertiesResult {
    def apply(
      ClientPropertiesList: js.UndefOr[ClientPropertiesList] = js.undefined): DescribeClientPropertiesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientPropertiesList" -> ClientPropertiesList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClientPropertiesResult]
    }
  }

  @js.native
  trait DescribeIpGroupsRequest extends js.Object {
    var GroupIds: js.UndefOr[IpGroupIdList]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[Limit]
  }

  object DescribeIpGroupsRequest {
    def apply(
      GroupIds: js.UndefOr[IpGroupIdList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[Limit] = js.undefined): DescribeIpGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupIds" -> GroupIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIpGroupsRequest]
    }
  }

  @js.native
  trait DescribeIpGroupsResult extends js.Object {
    var Result: js.UndefOr[WorkspacesIpGroupsList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeIpGroupsResult {
    def apply(
      Result: js.UndefOr[WorkspacesIpGroupsList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeIpGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Result" -> Result.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIpGroupsResult]
    }
  }

  @js.native
  trait DescribeTagsRequest extends js.Object {
    var ResourceId: js.UndefOr[NonEmptyString]
  }

  object DescribeTagsRequest {
    def apply(
      ResourceId: js.UndefOr[NonEmptyString] = js.undefined): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
    }
  }

  @js.native
  trait DescribeTagsResult extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object DescribeTagsResult {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined): DescribeTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResult]
    }
  }

  @js.native
  trait DescribeWorkspaceBundlesRequest extends js.Object {
    var BundleIds: js.UndefOr[BundleIdList]
    var Owner: js.UndefOr[BundleOwner]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceBundlesRequest {
    def apply(
      BundleIds: js.UndefOr[BundleIdList] = js.undefined,
      Owner: js.UndefOr[BundleOwner] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeWorkspaceBundlesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleIds" -> BundleIds.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceBundlesRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceBundlesResult extends js.Object {
    var Bundles: js.UndefOr[BundleList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceBundlesResult {
    def apply(
      Bundles: js.UndefOr[BundleList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeWorkspaceBundlesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bundles" -> Bundles.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceBundlesResult]
    }
  }

  @js.native
  trait DescribeWorkspaceDirectoriesRequest extends js.Object {
    var DirectoryIds: js.UndefOr[DirectoryIdList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceDirectoriesRequest {
    def apply(
      DirectoryIds: js.UndefOr[DirectoryIdList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeWorkspaceDirectoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryIds" -> DirectoryIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceDirectoriesRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceDirectoriesResult extends js.Object {
    var Directories: js.UndefOr[DirectoryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceDirectoriesResult {
    def apply(
      Directories: js.UndefOr[DirectoryList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeWorkspaceDirectoriesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Directories" -> Directories.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceDirectoriesResult]
    }
  }

  @js.native
  trait DescribeWorkspaceImagesRequest extends js.Object {
    var ImageIds: js.UndefOr[WorkspaceImageIdList]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[Limit]
  }

  object DescribeWorkspaceImagesRequest {
    def apply(
      ImageIds: js.UndefOr[WorkspaceImageIdList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[Limit] = js.undefined): DescribeWorkspaceImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageIds" -> ImageIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceImagesRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceImagesResult extends js.Object {
    var Images: js.UndefOr[WorkspaceImageList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceImagesResult {
    def apply(
      Images: js.UndefOr[WorkspaceImageList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeWorkspaceImagesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Images" -> Images.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceImagesResult]
    }
  }

  @js.native
  trait DescribeWorkspacesConnectionStatusRequest extends js.Object {
    var WorkspaceIds: js.UndefOr[WorkspaceIdList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspacesConnectionStatusRequest {
    def apply(
      WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeWorkspacesConnectionStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceIds" -> WorkspaceIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesConnectionStatusRequest]
    }
  }

  @js.native
  trait DescribeWorkspacesConnectionStatusResult extends js.Object {
    var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspacesConnectionStatusResult {
    def apply(
      WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeWorkspacesConnectionStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspacesConnectionStatus" -> WorkspacesConnectionStatus.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesConnectionStatusResult]
    }
  }

  @js.native
  trait DescribeWorkspacesRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var UserName: js.UndefOr[UserName]
    var BundleId: js.UndefOr[BundleId]
    var Limit: js.UndefOr[Limit]
    var WorkspaceIds: js.UndefOr[WorkspaceIdList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspacesRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      UserName: js.UndefOr[UserName] = js.undefined,
      BundleId: js.UndefOr[BundleId] = js.undefined,
      Limit: js.UndefOr[Limit] = js.undefined,
      WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "BundleId" -> BundleId.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "WorkspaceIds" -> WorkspaceIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesRequest]
    }
  }

  @js.native
  trait DescribeWorkspacesResult extends js.Object {
    var Workspaces: js.UndefOr[WorkspaceList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspacesResult {
    def apply(
      Workspaces: js.UndefOr[WorkspaceList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Workspaces" -> Workspaces.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesResult]
    }
  }

  @js.native
  trait DisassociateIpGroupsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var GroupIds: js.UndefOr[IpGroupIdList]
  }

  object DisassociateIpGroupsRequest {
    def apply(
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      GroupIds: js.UndefOr[IpGroupIdList] = js.undefined): DisassociateIpGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "GroupIds" -> GroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateIpGroupsRequest]
    }
  }

  @js.native
  trait DisassociateIpGroupsResult extends js.Object {

  }

  object DisassociateIpGroupsResult {
    def apply(): DisassociateIpGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateIpGroupsResult]
    }
  }

  /**
   * <p>Describes a WorkSpace that cannot be created.</p>
   */
  @js.native
  trait FailedCreateWorkspaceRequest extends js.Object {
    var WorkspaceRequest: js.UndefOr[WorkspaceRequest]
    var ErrorCode: js.UndefOr[ErrorType]
    var ErrorMessage: js.UndefOr[Description]
  }

  object FailedCreateWorkspaceRequest {
    def apply(
      WorkspaceRequest: js.UndefOr[WorkspaceRequest] = js.undefined,
      ErrorCode: js.UndefOr[ErrorType] = js.undefined,
      ErrorMessage: js.UndefOr[Description] = js.undefined): FailedCreateWorkspaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceRequest" -> WorkspaceRequest.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedCreateWorkspaceRequest]
    }
  }

  /**
   * <p>Describes a WorkSpace that could not be rebooted. (<a>RebootWorkspaces</a>), rebuilt (<a>RebuildWorkspaces</a>), terminated (<a>TerminateWorkspaces</a>), started (<a>StartWorkspaces</a>), or stopped (<a>StopWorkspaces</a>).</p>
   */
  @js.native
  trait FailedWorkspaceChangeRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
    var ErrorCode: js.UndefOr[ErrorType]
    var ErrorMessage: js.UndefOr[Description]
  }

  object FailedWorkspaceChangeRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorType] = js.undefined,
      ErrorMessage: js.UndefOr[Description] = js.undefined): FailedWorkspaceChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedWorkspaceChangeRequest]
    }
  }

  @js.native
  trait ImportWorkspaceImageRequest extends js.Object {
    var Ec2ImageId: js.UndefOr[Ec2ImageId]
    var IngestionProcess: js.UndefOr[WorkspaceImageIngestionProcess]
    var ImageName: js.UndefOr[WorkspaceImageName]
    var ImageDescription: js.UndefOr[WorkspaceImageDescription]
  }

  object ImportWorkspaceImageRequest {
    def apply(
      Ec2ImageId: js.UndefOr[Ec2ImageId] = js.undefined,
      IngestionProcess: js.UndefOr[WorkspaceImageIngestionProcess] = js.undefined,
      ImageName: js.UndefOr[WorkspaceImageName] = js.undefined,
      ImageDescription: js.UndefOr[WorkspaceImageDescription] = js.undefined): ImportWorkspaceImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ec2ImageId" -> Ec2ImageId.map { x => x.asInstanceOf[js.Any] },
        "IngestionProcess" -> IngestionProcess.map { x => x.asInstanceOf[js.Any] },
        "ImageName" -> ImageName.map { x => x.asInstanceOf[js.Any] },
        "ImageDescription" -> ImageDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportWorkspaceImageRequest]
    }
  }

  @js.native
  trait ImportWorkspaceImageResult extends js.Object {
    var ImageId: js.UndefOr[WorkspaceImageId]
  }

  object ImportWorkspaceImageResult {
    def apply(
      ImageId: js.UndefOr[WorkspaceImageId] = js.undefined): ImportWorkspaceImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportWorkspaceImageResult]
    }
  }

  /**
   * <p>Describes a rule for an IP access control group.</p>
   */
  @js.native
  trait IpRuleItem extends js.Object {
    var ipRule: js.UndefOr[IpRule]
    var ruleDesc: js.UndefOr[IpRuleDesc]
  }

  object IpRuleItem {
    def apply(
      ipRule: js.UndefOr[IpRule] = js.undefined,
      ruleDesc: js.UndefOr[IpRuleDesc] = js.undefined): IpRuleItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ipRule" -> ipRule.map { x => x.asInstanceOf[js.Any] },
        "ruleDesc" -> ruleDesc.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpRuleItem]
    }
  }

  @js.native
  trait ListAvailableManagementCidrRangesRequest extends js.Object {
    var ManagementCidrRangeConstraint: js.UndefOr[ManagementCidrRangeConstraint]
    var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAvailableManagementCidrRangesRequest {
    def apply(
      ManagementCidrRangeConstraint: js.UndefOr[ManagementCidrRangeConstraint] = js.undefined,
      MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListAvailableManagementCidrRangesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManagementCidrRangeConstraint" -> ManagementCidrRangeConstraint.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAvailableManagementCidrRangesRequest]
    }
  }

  @js.native
  trait ListAvailableManagementCidrRangesResult extends js.Object {
    var ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAvailableManagementCidrRangesResult {
    def apply(
      ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListAvailableManagementCidrRangesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManagementCidrRanges" -> ManagementCidrRanges.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAvailableManagementCidrRangesResult]
    }
  }

  object ModificationResourceEnumEnum {
    val ROOT_VOLUME = "ROOT_VOLUME"
    val USER_VOLUME = "USER_VOLUME"
    val COMPUTE_TYPE = "COMPUTE_TYPE"

    val values = IndexedSeq(ROOT_VOLUME, USER_VOLUME, COMPUTE_TYPE)
  }

  /**
   * <p>Describes a WorkSpace modification.</p>
   */
  @js.native
  trait ModificationState extends js.Object {
    var Resource: js.UndefOr[ModificationResourceEnum]
    var State: js.UndefOr[ModificationStateEnum]
  }

  object ModificationState {
    def apply(
      Resource: js.UndefOr[ModificationResourceEnum] = js.undefined,
      State: js.UndefOr[ModificationStateEnum] = js.undefined): ModificationState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModificationState]
    }
  }

  object ModificationStateEnumEnum {
    val UPDATE_INITIATED = "UPDATE_INITIATED"
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS"

    val values = IndexedSeq(UPDATE_INITIATED, UPDATE_IN_PROGRESS)
  }

  @js.native
  trait ModifyAccountRequest extends js.Object {
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum]
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
  }

  object ModifyAccountRequest {
    def apply(
      DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum] = js.undefined,
      DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined): ModifyAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedTenancySupport" -> DedicatedTenancySupport.map { x => x.asInstanceOf[js.Any] },
        "DedicatedTenancyManagementCidrRange" -> DedicatedTenancyManagementCidrRange.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyAccountRequest]
    }
  }

  @js.native
  trait ModifyAccountResult extends js.Object {

  }

  object ModifyAccountResult {
    def apply(): ModifyAccountResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyAccountResult]
    }
  }

  @js.native
  trait ModifyClientPropertiesRequest extends js.Object {
    var ResourceId: js.UndefOr[NonEmptyString]
    var ClientProperties: js.UndefOr[ClientProperties]
  }

  object ModifyClientPropertiesRequest {
    def apply(
      ResourceId: js.UndefOr[NonEmptyString] = js.undefined,
      ClientProperties: js.UndefOr[ClientProperties] = js.undefined): ModifyClientPropertiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ClientProperties" -> ClientProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClientPropertiesRequest]
    }
  }

  @js.native
  trait ModifyClientPropertiesResult extends js.Object {

  }

  object ModifyClientPropertiesResult {
    def apply(): ModifyClientPropertiesResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClientPropertiesResult]
    }
  }

  @js.native
  trait ModifyWorkspacePropertiesRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
    var WorkspaceProperties: js.UndefOr[WorkspaceProperties]
  }

  object ModifyWorkspacePropertiesRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
      WorkspaceProperties: js.UndefOr[WorkspaceProperties] = js.undefined): ModifyWorkspacePropertiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] },
        "WorkspaceProperties" -> WorkspaceProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspacePropertiesRequest]
    }
  }

  @js.native
  trait ModifyWorkspacePropertiesResult extends js.Object {

  }

  object ModifyWorkspacePropertiesResult {
    def apply(): ModifyWorkspacePropertiesResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspacePropertiesResult]
    }
  }

  @js.native
  trait ModifyWorkspaceStateRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
    var WorkspaceState: js.UndefOr[TargetWorkspaceState]
  }

  object ModifyWorkspaceStateRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
      WorkspaceState: js.UndefOr[TargetWorkspaceState] = js.undefined): ModifyWorkspaceStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] },
        "WorkspaceState" -> WorkspaceState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspaceStateRequest]
    }
  }

  @js.native
  trait ModifyWorkspaceStateResult extends js.Object {

  }

  object ModifyWorkspaceStateResult {
    def apply(): ModifyWorkspaceStateResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspaceStateResult]
    }
  }

  /**
   * <p>The operating system that the image is running.</p>
   */
  @js.native
  trait OperatingSystem extends js.Object {
    var Type: js.UndefOr[OperatingSystemType]
  }

  object OperatingSystem {
    def apply(
      Type: js.UndefOr[OperatingSystemType] = js.undefined): OperatingSystem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OperatingSystem]
    }
  }

  object OperatingSystemTypeEnum {
    val WINDOWS = "WINDOWS"
    val LINUX = "LINUX"

    val values = IndexedSeq(WINDOWS, LINUX)
  }

  /**
   * <p>Describes the information used to reboot a WorkSpace.</p>
   */
  @js.native
  trait RebootRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object RebootRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined): RebootRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootRequest]
    }
  }

  @js.native
  trait RebootWorkspacesRequest extends js.Object {
    var RebootWorkspaceRequests: js.UndefOr[RebootWorkspaceRequests]
  }

  object RebootWorkspacesRequest {
    def apply(
      RebootWorkspaceRequests: js.UndefOr[RebootWorkspaceRequests] = js.undefined): RebootWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RebootWorkspaceRequests" -> RebootWorkspaceRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootWorkspacesRequest]
    }
  }

  @js.native
  trait RebootWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests]
  }

  object RebootWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests] = js.undefined): RebootWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootWorkspacesResult]
    }
  }

  /**
   * <p>Describes the information used to rebuild a WorkSpace.</p>
   */
  @js.native
  trait RebuildRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object RebuildRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined): RebuildRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildRequest]
    }
  }

  @js.native
  trait RebuildWorkspacesRequest extends js.Object {
    var RebuildWorkspaceRequests: js.UndefOr[RebuildWorkspaceRequests]
  }

  object RebuildWorkspacesRequest {
    def apply(
      RebuildWorkspaceRequests: js.UndefOr[RebuildWorkspaceRequests] = js.undefined): RebuildWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RebuildWorkspaceRequests" -> RebuildWorkspaceRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildWorkspacesRequest]
    }
  }

  @js.native
  trait RebuildWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests]
  }

  object RebuildWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.undefined): RebuildWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildWorkspacesResult]
    }
  }

  object ReconnectEnumEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  @js.native
  trait RevokeIpRulesRequest extends js.Object {
    var GroupId: js.UndefOr[IpGroupId]
    var UserRules: js.UndefOr[IpRevokedRuleList]
  }

  object RevokeIpRulesRequest {
    def apply(
      GroupId: js.UndefOr[IpGroupId] = js.undefined,
      UserRules: js.UndefOr[IpRevokedRuleList] = js.undefined): RevokeIpRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "UserRules" -> UserRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeIpRulesRequest]
    }
  }

  @js.native
  trait RevokeIpRulesResult extends js.Object {

  }

  object RevokeIpRulesResult {
    def apply(): RevokeIpRulesResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeIpRulesResult]
    }
  }

  /**
   * <p>Describes the root volume for a WorkSpace bundle.</p>
   */
  @js.native
  trait RootStorage extends js.Object {
    var Capacity: js.UndefOr[NonEmptyString]
  }

  object RootStorage {
    def apply(
      Capacity: js.UndefOr[NonEmptyString] = js.undefined): RootStorage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Capacity" -> Capacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RootStorage]
    }
  }

  object RunningModeEnum {
    val AUTO_STOP = "AUTO_STOP"
    val ALWAYS_ON = "ALWAYS_ON"

    val values = IndexedSeq(AUTO_STOP, ALWAYS_ON)
  }

  /**
   * <p>Information used to start a WorkSpace.</p>
   */
  @js.native
  trait StartRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object StartRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined): StartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartRequest]
    }
  }

  @js.native
  trait StartWorkspacesRequest extends js.Object {
    var StartWorkspaceRequests: js.UndefOr[StartWorkspaceRequests]
  }

  object StartWorkspacesRequest {
    def apply(
      StartWorkspaceRequests: js.UndefOr[StartWorkspaceRequests] = js.undefined): StartWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartWorkspaceRequests" -> StartWorkspaceRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartWorkspacesRequest]
    }
  }

  @js.native
  trait StartWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedStartWorkspaceRequests]
  }

  object StartWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedStartWorkspaceRequests] = js.undefined): StartWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartWorkspacesResult]
    }
  }

  /**
   * <p>Describes the information used to stop a WorkSpace.</p>
   */
  @js.native
  trait StopRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object StopRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined): StopRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRequest]
    }
  }

  @js.native
  trait StopWorkspacesRequest extends js.Object {
    var StopWorkspaceRequests: js.UndefOr[StopWorkspaceRequests]
  }

  object StopWorkspacesRequest {
    def apply(
      StopWorkspaceRequests: js.UndefOr[StopWorkspaceRequests] = js.undefined): StopWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StopWorkspaceRequests" -> StopWorkspaceRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopWorkspacesRequest]
    }
  }

  @js.native
  trait StopWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedStopWorkspaceRequests]
  }

  object StopWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedStopWorkspaceRequests] = js.undefined): StopWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopWorkspacesResult]
    }
  }

  /**
   * <p>Describes a tag.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  object TargetWorkspaceStateEnum {
    val AVAILABLE = "AVAILABLE"
    val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE"

    val values = IndexedSeq(AVAILABLE, ADMIN_MAINTENANCE)
  }

  /**
   * <p>Describes the information used to terminate a WorkSpace.</p>
   */
  @js.native
  trait TerminateRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object TerminateRequest {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined): TerminateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateRequest]
    }
  }

  @js.native
  trait TerminateWorkspacesRequest extends js.Object {
    var TerminateWorkspaceRequests: js.UndefOr[TerminateWorkspaceRequests]
  }

  object TerminateWorkspacesRequest {
    def apply(
      TerminateWorkspaceRequests: js.UndefOr[TerminateWorkspaceRequests] = js.undefined): TerminateWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminateWorkspaceRequests" -> TerminateWorkspaceRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateWorkspacesRequest]
    }
  }

  @js.native
  trait TerminateWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests]
  }

  object TerminateWorkspacesResult {
    def apply(
      FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests] = js.undefined): TerminateWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateWorkspacesResult]
    }
  }

  @js.native
  trait UpdateRulesOfIpGroupRequest extends js.Object {
    var GroupId: js.UndefOr[IpGroupId]
    var UserRules: js.UndefOr[IpRuleList]
  }

  object UpdateRulesOfIpGroupRequest {
    def apply(
      GroupId: js.UndefOr[IpGroupId] = js.undefined,
      UserRules: js.UndefOr[IpRuleList] = js.undefined): UpdateRulesOfIpGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "UserRules" -> UserRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRulesOfIpGroupRequest]
    }
  }

  @js.native
  trait UpdateRulesOfIpGroupResult extends js.Object {

  }

  object UpdateRulesOfIpGroupResult {
    def apply(): UpdateRulesOfIpGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRulesOfIpGroupResult]
    }
  }

  /**
   * <p>Describes the user storage for a WorkSpace bundle.</p>
   */
  @js.native
  trait UserStorage extends js.Object {
    var Capacity: js.UndefOr[NonEmptyString]
  }

  object UserStorage {
    def apply(
      Capacity: js.UndefOr[NonEmptyString] = js.undefined): UserStorage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Capacity" -> Capacity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserStorage]
    }
  }

  /**
   * <p>Describes a WorkSpace.</p>
   */
  @js.native
  trait Workspace extends js.Object {
    var VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey]
    var ModificationStates: js.UndefOr[ModificationStateList]
    var DirectoryId: js.UndefOr[DirectoryId]
    var UserName: js.UndefOr[UserName]
    var BundleId: js.UndefOr[BundleId]
    var ErrorCode: js.UndefOr[WorkspaceErrorCode]
    var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject]
    var IpAddress: js.UndefOr[IpAddress]
    var ComputerName: js.UndefOr[ComputerName]
    var WorkspaceId: js.UndefOr[WorkspaceId]
    var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject]
    var WorkspaceProperties: js.UndefOr[WorkspaceProperties]
    var State: js.UndefOr[WorkspaceState]
    var ErrorMessage: js.UndefOr[Description]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object Workspace {
    def apply(
      VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey] = js.undefined,
      ModificationStates: js.UndefOr[ModificationStateList] = js.undefined,
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
      SubnetId: js.UndefOr[SubnetId] = js.undefined): Workspace = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeEncryptionKey" -> VolumeEncryptionKey.map { x => x.asInstanceOf[js.Any] },
        "ModificationStates" -> ModificationStates.map { x => x.asInstanceOf[js.Any] },
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "BundleId" -> BundleId.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "UserVolumeEncryptionEnabled" -> UserVolumeEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "ComputerName" -> ComputerName.map { x => x.asInstanceOf[js.Any] },
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] },
        "RootVolumeEncryptionEnabled" -> RootVolumeEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "WorkspaceProperties" -> WorkspaceProperties.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Workspace]
    }
  }

  /**
   * <p>Describes a WorkSpace bundle.</p>
   */
  @js.native
  trait WorkspaceBundle extends js.Object {
    var BundleId: js.UndefOr[BundleId]
    var Name: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[Description]
    var RootStorage: js.UndefOr[RootStorage]
    var UserStorage: js.UndefOr[UserStorage]
    var Owner: js.UndefOr[BundleOwner]
    var ComputeType: js.UndefOr[ComputeType]
  }

  object WorkspaceBundle {
    def apply(
      BundleId: js.UndefOr[BundleId] = js.undefined,
      Name: js.UndefOr[NonEmptyString] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      RootStorage: js.UndefOr[RootStorage] = js.undefined,
      UserStorage: js.UndefOr[UserStorage] = js.undefined,
      Owner: js.UndefOr[BundleOwner] = js.undefined,
      ComputeType: js.UndefOr[ComputeType] = js.undefined): WorkspaceBundle = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId" -> BundleId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RootStorage" -> RootStorage.map { x => x.asInstanceOf[js.Any] },
        "UserStorage" -> UserStorage.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "ComputeType" -> ComputeType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceBundle]
    }
  }

  /**
   * <p>Describes the connection status of a WorkSpace.</p>
   */
  @js.native
  trait WorkspaceConnectionStatus extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
    var ConnectionState: js.UndefOr[ConnectionState]
    var ConnectionStateCheckTimestamp: js.UndefOr[Timestamp]
    var LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp]
  }

  object WorkspaceConnectionStatus {
    def apply(
      WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined,
      ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
      ConnectionStateCheckTimestamp: js.UndefOr[Timestamp] = js.undefined,
      LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp] = js.undefined): WorkspaceConnectionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x => x.asInstanceOf[js.Any] },
        "ConnectionState" -> ConnectionState.map { x => x.asInstanceOf[js.Any] },
        "ConnectionStateCheckTimestamp" -> ConnectionStateCheckTimestamp.map { x => x.asInstanceOf[js.Any] },
        "LastKnownUserConnectionTimestamp" -> LastKnownUserConnectionTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceConnectionStatus]
    }
  }

  /**
   * <p>Describes an AWS Directory Service directory that is used with Amazon WorkSpaces.</p>
   */
  @js.native
  trait WorkspaceDirectory extends js.Object {
    var Alias: js.UndefOr[Alias]
    var DirectoryId: js.UndefOr[DirectoryId]
    var CustomerUserName: js.UndefOr[UserName]
    var WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties]
    var ipGroupIds: js.UndefOr[IpGroupIdList]
    var DirectoryType: js.UndefOr[WorkspaceDirectoryType]
    var RegistrationCode: js.UndefOr[RegistrationCode]
    var IamRoleId: js.UndefOr[ARN]
    var DirectoryName: js.UndefOr[DirectoryName]
    var SubnetIds: js.UndefOr[SubnetIds]
    var State: js.UndefOr[WorkspaceDirectoryState]
    var DnsIpAddresses: js.UndefOr[DnsIpAddresses]
    var WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId]
  }

  object WorkspaceDirectory {
    def apply(
      Alias: js.UndefOr[Alias] = js.undefined,
      DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      CustomerUserName: js.UndefOr[UserName] = js.undefined,
      WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties] = js.undefined,
      ipGroupIds: js.UndefOr[IpGroupIdList] = js.undefined,
      DirectoryType: js.UndefOr[WorkspaceDirectoryType] = js.undefined,
      RegistrationCode: js.UndefOr[RegistrationCode] = js.undefined,
      IamRoleId: js.UndefOr[ARN] = js.undefined,
      DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      State: js.UndefOr[WorkspaceDirectoryState] = js.undefined,
      DnsIpAddresses: js.UndefOr[DnsIpAddresses] = js.undefined,
      WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined): WorkspaceDirectory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x => x.asInstanceOf[js.Any] },
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "CustomerUserName" -> CustomerUserName.map { x => x.asInstanceOf[js.Any] },
        "WorkspaceCreationProperties" -> WorkspaceCreationProperties.map { x => x.asInstanceOf[js.Any] },
        "ipGroupIds" -> ipGroupIds.map { x => x.asInstanceOf[js.Any] },
        "DirectoryType" -> DirectoryType.map { x => x.asInstanceOf[js.Any] },
        "RegistrationCode" -> RegistrationCode.map { x => x.asInstanceOf[js.Any] },
        "IamRoleId" -> IamRoleId.map { x => x.asInstanceOf[js.Any] },
        "DirectoryName" -> DirectoryName.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "DnsIpAddresses" -> DnsIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "WorkspaceSecurityGroupId" -> WorkspaceSecurityGroupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    val SIMPLE_AD = "SIMPLE_AD"
    val AD_CONNECTOR = "AD_CONNECTOR"

    val values = IndexedSeq(SIMPLE_AD, AD_CONNECTOR)
  }

  /**
   * <p>Describes a WorkSpace image.</p>
   */
  @js.native
  trait WorkspaceImage extends js.Object {
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var ImageId: js.UndefOr[WorkspaceImageId]
    var Name: js.UndefOr[WorkspaceImageName]
    var ErrorCode: js.UndefOr[WorkspaceImageErrorCode]
    var Description: js.UndefOr[WorkspaceImageDescription]
    var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy]
    var State: js.UndefOr[WorkspaceImageState]
    var ErrorMessage: js.UndefOr[Description]
  }

  object WorkspaceImage {
    def apply(
      OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
      ImageId: js.UndefOr[WorkspaceImageId] = js.undefined,
      Name: js.UndefOr[WorkspaceImageName] = js.undefined,
      ErrorCode: js.UndefOr[WorkspaceImageErrorCode] = js.undefined,
      Description: js.UndefOr[WorkspaceImageDescription] = js.undefined,
      RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.undefined,
      State: js.UndefOr[WorkspaceImageState] = js.undefined,
      ErrorMessage: js.UndefOr[Description] = js.undefined): WorkspaceImage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperatingSystem" -> OperatingSystem.map { x => x.asInstanceOf[js.Any] },
        "ImageId" -> ImageId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RequiredTenancy" -> RequiredTenancy.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceImage]
    }
  }

  object WorkspaceImageIngestionProcessEnum {
    val BYOL_REGULAR = "BYOL_REGULAR"
    val BYOL_GRAPHICS = "BYOL_GRAPHICS"
    val BYOL_GRAPHICSPRO = "BYOL_GRAPHICSPRO"

    val values = IndexedSeq(BYOL_REGULAR, BYOL_GRAPHICS, BYOL_GRAPHICSPRO)
  }

  object WorkspaceImageRequiredTenancyEnum {
    val DEFAULT = "DEFAULT"
    val DEDICATED = "DEDICATED"

    val values = IndexedSeq(DEFAULT, DEDICATED)
  }

  object WorkspaceImageStateEnum {
    val AVAILABLE = "AVAILABLE"
    val PENDING = "PENDING"
    val ERROR = "ERROR"

    val values = IndexedSeq(AVAILABLE, PENDING, ERROR)
  }

  /**
   * <p>Describes a WorkSpace.</p>
   */
  @js.native
  trait WorkspaceProperties extends js.Object {
    var RunningMode: js.UndefOr[RunningMode]
    var ComputeTypeName: js.UndefOr[Compute]
    var RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib]
    var UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib]
    var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes]
  }

  object WorkspaceProperties {
    def apply(
      RunningMode: js.UndefOr[RunningMode] = js.undefined,
      ComputeTypeName: js.UndefOr[Compute] = js.undefined,
      RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib] = js.undefined,
      UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib] = js.undefined,
      RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes] = js.undefined): WorkspaceProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RunningMode" -> RunningMode.map { x => x.asInstanceOf[js.Any] },
        "ComputeTypeName" -> ComputeTypeName.map { x => x.asInstanceOf[js.Any] },
        "RootVolumeSizeGib" -> RootVolumeSizeGib.map { x => x.asInstanceOf[js.Any] },
        "UserVolumeSizeGib" -> UserVolumeSizeGib.map { x => x.asInstanceOf[js.Any] },
        "RunningModeAutoStopTimeoutInMinutes" -> RunningModeAutoStopTimeoutInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceProperties]
    }
  }

  /**
   * <p>Describes the information used to create a WorkSpace.</p>
   */
  @js.native
  trait WorkspaceRequest extends js.Object {
    var VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey]
    var DirectoryId: js.UndefOr[DirectoryId]
    var UserName: js.UndefOr[UserName]
    var BundleId: js.UndefOr[BundleId]
    var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject]
    var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject]
    var WorkspaceProperties: js.UndefOr[WorkspaceProperties]
    var Tags: js.UndefOr[TagList]
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
      Tags: js.UndefOr[TagList] = js.undefined): WorkspaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeEncryptionKey" -> VolumeEncryptionKey.map { x => x.asInstanceOf[js.Any] },
        "DirectoryId" -> DirectoryId.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "BundleId" -> BundleId.map { x => x.asInstanceOf[js.Any] },
        "UserVolumeEncryptionEnabled" -> UserVolumeEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "RootVolumeEncryptionEnabled" -> RootVolumeEncryptionEnabled.map { x => x.asInstanceOf[js.Any] },
        "WorkspaceProperties" -> WorkspaceProperties.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE"
    val TERMINATING = "TERMINATING"
    val TERMINATED = "TERMINATED"
    val SUSPENDED = "SUSPENDED"
    val UPDATING = "UPDATING"
    val STOPPING = "STOPPING"
    val STOPPED = "STOPPED"
    val ERROR = "ERROR"

    val values = IndexedSeq(PENDING, AVAILABLE, IMPAIRED, UNHEALTHY, REBOOTING, STARTING, REBUILDING, MAINTENANCE, ADMIN_MAINTENANCE, TERMINATING, TERMINATED, SUSPENDED, UPDATING, STOPPING, STOPPED, ERROR)
  }

  /**
   * <p>Describes an IP access control group.</p>
   */
  @js.native
  trait WorkspacesIpGroup extends js.Object {
    var groupId: js.UndefOr[IpGroupId]
    var groupName: js.UndefOr[IpGroupName]
    var groupDesc: js.UndefOr[IpGroupDesc]
    var userRules: js.UndefOr[IpRuleList]
  }

  object WorkspacesIpGroup {
    def apply(
      groupId: js.UndefOr[IpGroupId] = js.undefined,
      groupName: js.UndefOr[IpGroupName] = js.undefined,
      groupDesc: js.UndefOr[IpGroupDesc] = js.undefined,
      userRules: js.UndefOr[IpRuleList] = js.undefined): WorkspacesIpGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "groupId" -> groupId.map { x => x.asInstanceOf[js.Any] },
        "groupName" -> groupName.map { x => x.asInstanceOf[js.Any] },
        "groupDesc" -> groupDesc.map { x => x.asInstanceOf[js.Any] },
        "userRules" -> userRules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspacesIpGroup]
    }
  }
}
