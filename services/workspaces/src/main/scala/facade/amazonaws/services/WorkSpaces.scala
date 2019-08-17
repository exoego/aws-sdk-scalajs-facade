package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object workspaces {
  type ARN                                   = String
  type AccountModificationList               = js.Array[AccountModification]
  type Alias                                 = String
  type BooleanObject                         = Boolean
  type BundleId                              = String
  type BundleIdList                          = js.Array[BundleId]
  type BundleList                            = js.Array[WorkspaceBundle]
  type BundleOwner                           = String
  type ClientPropertiesList                  = js.Array[ClientPropertiesResult]
  type Compute                               = String
  type ComputerName                          = String
  type ConnectionState                       = String
  type DedicatedTenancyCidrRangeList         = js.Array[DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange   = String
  type DedicatedTenancyModificationStateEnum = String
  type DedicatedTenancySupportEnum           = String
  type DedicatedTenancySupportResultEnum     = String
  type DefaultOu                             = String
  type Description                           = String
  type DirectoryId                           = String
  type DirectoryIdList                       = js.Array[DirectoryId]
  type DirectoryList                         = js.Array[WorkspaceDirectory]
  type DirectoryName                         = String
  type DnsIpAddresses                        = js.Array[IpAddress]
  type Ec2ImageId                            = String
  type ErrorType                             = String
  type FailedCreateWorkspaceRequests         = js.Array[FailedCreateWorkspaceRequest]
  type FailedRebootWorkspaceRequests         = js.Array[FailedWorkspaceChangeRequest]
  type FailedRebuildWorkspaceRequests        = js.Array[FailedWorkspaceChangeRequest]
  type FailedStartWorkspaceRequests          = js.Array[FailedWorkspaceChangeRequest]
  type FailedStopWorkspaceRequests           = js.Array[FailedWorkspaceChangeRequest]
  type FailedTerminateWorkspaceRequests      = js.Array[FailedWorkspaceChangeRequest]
  type IpAddress                             = String
  type IpGroupDesc                           = String
  type IpGroupId                             = String
  type IpGroupIdList                         = js.Array[IpGroupId]
  type IpGroupName                           = String
  type IpRevokedRuleList                     = js.Array[IpRule]
  type IpRule                                = String
  type IpRuleDesc                            = String
  type IpRuleList                            = js.Array[IpRuleItem]
  type Limit                                 = Int
  type ManagementCidrRangeConstraint         = String
  type ManagementCidrRangeMaxResults         = Int
  type ModificationResourceEnum              = String
  type ModificationStateEnum                 = String
  type ModificationStateList                 = js.Array[ModificationState]
  type NonEmptyString                        = String
  type OperatingSystemType                   = String
  type PaginationToken                       = String
  type RebootWorkspaceRequests               = js.Array[RebootRequest]
  type RebuildWorkspaceRequests              = js.Array[RebuildRequest]
  type ReconnectEnum                         = String
  type RegistrationCode                      = String
  type ResourceIdList                        = js.Array[NonEmptyString]
  type RootVolumeSizeGib                     = Int
  type RunningMode                           = String
  type RunningModeAutoStopTimeoutInMinutes   = Int
  type SecurityGroupId                       = String
  type StartWorkspaceRequests                = js.Array[StartRequest]
  type StopWorkspaceRequests                 = js.Array[StopRequest]
  type SubnetId                              = String
  type SubnetIds                             = js.Array[SubnetId]
  type TagKey                                = String
  type TagKeyList                            = js.Array[NonEmptyString]
  type TagList                               = js.Array[Tag]
  type TagValue                              = String
  type TargetWorkspaceState                  = String
  type TerminateWorkspaceRequests            = js.Array[TerminateRequest]
  type Timestamp                             = js.Date
  type UserName                              = String
  type UserVolumeSizeGib                     = Int
  type VolumeEncryptionKey                   = String
  type WorkspaceConnectionStatusList         = js.Array[WorkspaceConnectionStatus]
  type WorkspaceDirectoryState               = String
  type WorkspaceDirectoryType                = String
  type WorkspaceErrorCode                    = String
  type WorkspaceId                           = String
  type WorkspaceIdList                       = js.Array[WorkspaceId]
  type WorkspaceImageDescription             = String
  type WorkspaceImageErrorCode               = String
  type WorkspaceImageId                      = String
  type WorkspaceImageIdList                  = js.Array[WorkspaceImageId]
  type WorkspaceImageIngestionProcess        = String
  type WorkspaceImageList                    = js.Array[WorkspaceImage]
  type WorkspaceImageName                    = String
  type WorkspaceImageRequiredTenancy         = String
  type WorkspaceImageState                   = String
  type WorkspaceList                         = js.Array[Workspace]
  type WorkspaceRequestList                  = js.Array[WorkspaceRequest]
  type WorkspaceState                        = String
  type WorkspacesIpGroupsList                = js.Array[WorkspacesIpGroup]

  implicit final class WorkSpacesOps(val service: WorkSpaces) extends AnyVal {

    def associateIpGroupsFuture(params: AssociateIpGroupsRequest): Future[AssociateIpGroupsResult] =
      service.associateIpGroups(params).promise.toFuture
    def authorizeIpRulesFuture(params: AuthorizeIpRulesRequest): Future[AuthorizeIpRulesResult] =
      service.authorizeIpRules(params).promise.toFuture
    def createIpGroupFuture(params: CreateIpGroupRequest): Future[CreateIpGroupResult] =
      service.createIpGroup(params).promise.toFuture
    def createTagsFuture(params: CreateTagsRequest): Future[CreateTagsResult] =
      service.createTags(params).promise.toFuture
    def createWorkspacesFuture(params: CreateWorkspacesRequest): Future[CreateWorkspacesResult] =
      service.createWorkspaces(params).promise.toFuture
    def deleteIpGroupFuture(params: DeleteIpGroupRequest): Future[DeleteIpGroupResult] =
      service.deleteIpGroup(params).promise.toFuture
    def deleteTagsFuture(params: DeleteTagsRequest): Future[DeleteTagsResult] =
      service.deleteTags(params).promise.toFuture
    def deleteWorkspaceImageFuture(params: DeleteWorkspaceImageRequest): Future[DeleteWorkspaceImageResult] =
      service.deleteWorkspaceImage(params).promise.toFuture
    def describeAccountFuture(params: DescribeAccountRequest): Future[DescribeAccountResult] =
      service.describeAccount(params).promise.toFuture
    def describeAccountModificationsFuture(
        params: DescribeAccountModificationsRequest
    ): Future[DescribeAccountModificationsResult] = service.describeAccountModifications(params).promise.toFuture
    def describeClientPropertiesFuture(
        params: DescribeClientPropertiesRequest
    ): Future[DescribeClientPropertiesResult] = service.describeClientProperties(params).promise.toFuture
    def describeIpGroupsFuture(params: DescribeIpGroupsRequest): Future[DescribeIpGroupsResult] =
      service.describeIpGroups(params).promise.toFuture
    def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResult] =
      service.describeTags(params).promise.toFuture
    def describeWorkspaceBundlesFuture(
        params: DescribeWorkspaceBundlesRequest
    ): Future[DescribeWorkspaceBundlesResult] = service.describeWorkspaceBundles(params).promise.toFuture
    def describeWorkspaceDirectoriesFuture(
        params: DescribeWorkspaceDirectoriesRequest
    ): Future[DescribeWorkspaceDirectoriesResult] = service.describeWorkspaceDirectories(params).promise.toFuture
    def describeWorkspaceImagesFuture(params: DescribeWorkspaceImagesRequest): Future[DescribeWorkspaceImagesResult] =
      service.describeWorkspaceImages(params).promise.toFuture
    def describeWorkspacesConnectionStatusFuture(
        params: DescribeWorkspacesConnectionStatusRequest
    ): Future[DescribeWorkspacesConnectionStatusResult] =
      service.describeWorkspacesConnectionStatus(params).promise.toFuture
    def describeWorkspacesFuture(params: DescribeWorkspacesRequest): Future[DescribeWorkspacesResult] =
      service.describeWorkspaces(params).promise.toFuture
    def disassociateIpGroupsFuture(params: DisassociateIpGroupsRequest): Future[DisassociateIpGroupsResult] =
      service.disassociateIpGroups(params).promise.toFuture
    def importWorkspaceImageFuture(params: ImportWorkspaceImageRequest): Future[ImportWorkspaceImageResult] =
      service.importWorkspaceImage(params).promise.toFuture
    def listAvailableManagementCidrRangesFuture(
        params: ListAvailableManagementCidrRangesRequest
    ): Future[ListAvailableManagementCidrRangesResult] =
      service.listAvailableManagementCidrRanges(params).promise.toFuture
    def modifyAccountFuture(params: ModifyAccountRequest): Future[ModifyAccountResult] =
      service.modifyAccount(params).promise.toFuture
    def modifyClientPropertiesFuture(params: ModifyClientPropertiesRequest): Future[ModifyClientPropertiesResult] =
      service.modifyClientProperties(params).promise.toFuture
    def modifyWorkspacePropertiesFuture(
        params: ModifyWorkspacePropertiesRequest
    ): Future[ModifyWorkspacePropertiesResult] = service.modifyWorkspaceProperties(params).promise.toFuture
    def modifyWorkspaceStateFuture(params: ModifyWorkspaceStateRequest): Future[ModifyWorkspaceStateResult] =
      service.modifyWorkspaceState(params).promise.toFuture
    def rebootWorkspacesFuture(params: RebootWorkspacesRequest): Future[RebootWorkspacesResult] =
      service.rebootWorkspaces(params).promise.toFuture
    def rebuildWorkspacesFuture(params: RebuildWorkspacesRequest): Future[RebuildWorkspacesResult] =
      service.rebuildWorkspaces(params).promise.toFuture
    def revokeIpRulesFuture(params: RevokeIpRulesRequest): Future[RevokeIpRulesResult] =
      service.revokeIpRules(params).promise.toFuture
    def startWorkspacesFuture(params: StartWorkspacesRequest): Future[StartWorkspacesResult] =
      service.startWorkspaces(params).promise.toFuture
    def stopWorkspacesFuture(params: StopWorkspacesRequest): Future[StopWorkspacesResult] =
      service.stopWorkspaces(params).promise.toFuture
    def terminateWorkspacesFuture(params: TerminateWorkspacesRequest): Future[TerminateWorkspacesResult] =
      service.terminateWorkspaces(params).promise.toFuture
    def updateRulesOfIpGroupFuture(params: UpdateRulesOfIpGroupRequest): Future[UpdateRulesOfIpGroupResult] =
      service.updateRulesOfIpGroup(params).promise.toFuture
  }
}

package workspaces {
  @js.native
  @JSImport("aws-sdk", "WorkSpaces")
  class WorkSpaces() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateIpGroups(params: AssociateIpGroupsRequest): Request[AssociateIpGroupsResult]          = js.native
    def authorizeIpRules(params: AuthorizeIpRulesRequest): Request[AuthorizeIpRulesResult]             = js.native
    def createIpGroup(params: CreateIpGroupRequest): Request[CreateIpGroupResult]                      = js.native
    def createTags(params: CreateTagsRequest): Request[CreateTagsResult]                               = js.native
    def createWorkspaces(params: CreateWorkspacesRequest): Request[CreateWorkspacesResult]             = js.native
    def deleteIpGroup(params: DeleteIpGroupRequest): Request[DeleteIpGroupResult]                      = js.native
    def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResult]                               = js.native
    def deleteWorkspaceImage(params: DeleteWorkspaceImageRequest): Request[DeleteWorkspaceImageResult] = js.native
    def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResult]                = js.native
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
    def describeWorkspaces(params: DescribeWorkspacesRequest): Request[DescribeWorkspacesResult] = js.native
    def describeWorkspacesConnectionStatus(
        params: DescribeWorkspacesConnectionStatusRequest
    ): Request[DescribeWorkspacesConnectionStatusResult]                                               = js.native
    def disassociateIpGroups(params: DisassociateIpGroupsRequest): Request[DisassociateIpGroupsResult] = js.native
    def importWorkspaceImage(params: ImportWorkspaceImageRequest): Request[ImportWorkspaceImageResult] = js.native
    def listAvailableManagementCidrRanges(
        params: ListAvailableManagementCidrRangesRequest
    ): Request[ListAvailableManagementCidrRangesResult]                                                      = js.native
    def modifyAccount(params: ModifyAccountRequest): Request[ModifyAccountResult]                            = js.native
    def modifyClientProperties(params: ModifyClientPropertiesRequest): Request[ModifyClientPropertiesResult] = js.native
    def modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest): Request[ModifyWorkspacePropertiesResult] =
      js.native
    def modifyWorkspaceState(params: ModifyWorkspaceStateRequest): Request[ModifyWorkspaceStateResult] = js.native
    def rebootWorkspaces(params: RebootWorkspacesRequest): Request[RebootWorkspacesResult]             = js.native
    def rebuildWorkspaces(params: RebuildWorkspacesRequest): Request[RebuildWorkspacesResult]          = js.native
    def revokeIpRules(params: RevokeIpRulesRequest): Request[RevokeIpRulesResult]                      = js.native
    def startWorkspaces(params: StartWorkspacesRequest): Request[StartWorkspacesResult]                = js.native
    def stopWorkspaces(params: StopWorkspacesRequest): Request[StopWorkspacesResult]                   = js.native
    def terminateWorkspaces(params: TerminateWorkspacesRequest): Request[TerminateWorkspacesResult]    = js.native
    def updateRulesOfIpGroup(params: UpdateRulesOfIpGroupRequest): Request[UpdateRulesOfIpGroupResult] = js.native
  }

  /**
    * Describes a modification to the configuration of bring your own license (BYOL) for the specified account.
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
    def apply(
        DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined,
        DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined,
        ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): AccountModification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedTenancyManagementCidrRange" -> DedicatedTenancyManagementCidrRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DedicatedTenancySupport" -> DedicatedTenancySupport.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ModificationState" -> ModificationState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountModification]
    }
  }

  @js.native
  trait AssociateIpGroupsRequest extends js.Object {
    var DirectoryId: DirectoryId
    var GroupIds: IpGroupIdList
  }

  object AssociateIpGroupsRequest {
    def apply(
        DirectoryId: DirectoryId,
        GroupIds: IpGroupIdList
    ): AssociateIpGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "GroupIds"    -> GroupIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateIpGroupsRequest]
    }
  }

  @js.native
  trait AssociateIpGroupsResult extends js.Object {}

  object AssociateIpGroupsResult {
    def apply(
        ): AssociateIpGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateIpGroupsResult]
    }
  }

  @js.native
  trait AuthorizeIpRulesRequest extends js.Object {
    var GroupId: IpGroupId
    var UserRules: IpRuleList
  }

  object AuthorizeIpRulesRequest {
    def apply(
        GroupId: IpGroupId,
        UserRules: IpRuleList
    ): AuthorizeIpRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId"   -> GroupId.asInstanceOf[js.Any],
        "UserRules" -> UserRules.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeIpRulesRequest]
    }
  }

  @js.native
  trait AuthorizeIpRulesResult extends js.Object {}

  object AuthorizeIpRulesResult {
    def apply(
        ): AuthorizeIpRulesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeIpRulesResult]
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
    def apply(
        ReconnectEnabled: js.UndefOr[ReconnectEnum] = js.undefined
    ): ClientProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReconnectEnabled" -> ReconnectEnabled.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClientProperties]
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
    def apply(
        ClientProperties: js.UndefOr[ClientProperties] = js.undefined,
        ResourceId: js.UndefOr[NonEmptyString] = js.undefined
    ): ClientPropertiesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientProperties" -> ClientProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceId" -> ResourceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClientPropertiesResult]
    }
  }

  object ComputeEnum {
    val VALUE       = "VALUE"
    val STANDARD    = "STANDARD"
    val PERFORMANCE = "PERFORMANCE"
    val POWER       = "POWER"
    val GRAPHICS    = "GRAPHICS"
    val POWERPRO    = "POWERPRO"
    val GRAPHICSPRO = "GRAPHICSPRO"

    val values = IndexedSeq(VALUE, STANDARD, PERFORMANCE, POWER, GRAPHICS, POWERPRO, GRAPHICSPRO)
  }

  /**
    * Describes the compute type.
    */
  @js.native
  trait ComputeType extends js.Object {
    var Name: js.UndefOr[Compute]
  }

  object ComputeType {
    def apply(
        Name: js.UndefOr[Compute] = js.undefined
    ): ComputeType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeType]
    }
  }

  object ConnectionStateEnum {
    val CONNECTED    = "CONNECTED"
    val DISCONNECTED = "DISCONNECTED"
    val UNKNOWN      = "UNKNOWN"

    val values = IndexedSeq(CONNECTED, DISCONNECTED, UNKNOWN)
  }

  @js.native
  trait CreateIpGroupRequest extends js.Object {
    var GroupName: IpGroupName
    var GroupDesc: js.UndefOr[IpGroupDesc]
    var Tags: js.UndefOr[TagList]
    var UserRules: js.UndefOr[IpRuleList]
  }

  object CreateIpGroupRequest {
    def apply(
        GroupName: IpGroupName,
        GroupDesc: js.UndefOr[IpGroupDesc] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        UserRules: js.UndefOr[IpRuleList] = js.undefined
    ): CreateIpGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "GroupDesc" -> GroupDesc.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserRules" -> UserRules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIpGroupRequest]
    }
  }

  @js.native
  trait CreateIpGroupResult extends js.Object {
    var GroupId: js.UndefOr[IpGroupId]
  }

  object CreateIpGroupResult {
    def apply(
        GroupId: js.UndefOr[IpGroupId] = js.undefined
    ): CreateIpGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIpGroupResult]
    }
  }

  @js.native
  trait CreateTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
    var Tags: TagList
  }

  object CreateTagsRequest {
    def apply(
        ResourceId: NonEmptyString,
        Tags: TagList
    ): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Tags"       -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
    }
  }

  @js.native
  trait CreateTagsResult extends js.Object {}

  object CreateTagsResult {
    def apply(
        ): CreateTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsResult]
    }
  }

  @js.native
  trait CreateWorkspacesRequest extends js.Object {
    var Workspaces: WorkspaceRequestList
  }

  object CreateWorkspacesRequest {
    def apply(
        Workspaces: WorkspaceRequestList
    ): CreateWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Workspaces" -> Workspaces.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        PendingRequests: js.UndefOr[WorkspaceList] = js.undefined
    ): CreateWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PendingRequests" -> PendingRequests.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateWorkspacesResult]
    }
  }

  object DedicatedTenancyModificationStateEnumEnum {
    val PENDING   = "PENDING"
    val COMPLETED = "COMPLETED"
    val FAILED    = "FAILED"

    val values = IndexedSeq(PENDING, COMPLETED, FAILED)
  }

  object DedicatedTenancySupportEnumEnum {
    val ENABLED = "ENABLED"

    val values = IndexedSeq(ENABLED)
  }

  object DedicatedTenancySupportResultEnumEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
    * Describes the default values used to create a WorkSpace.
    */
  @js.native
  trait DefaultWorkspaceCreationProperties extends js.Object {
    var CustomSecurityGroupId: js.UndefOr[SecurityGroupId]
    var DefaultOu: js.UndefOr[DefaultOu]
    var EnableInternetAccess: js.UndefOr[BooleanObject]
    var EnableWorkDocs: js.UndefOr[BooleanObject]
    var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject]
  }

  object DefaultWorkspaceCreationProperties {
    def apply(
        CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
        DefaultOu: js.UndefOr[DefaultOu] = js.undefined,
        EnableInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
        EnableWorkDocs: js.UndefOr[BooleanObject] = js.undefined,
        UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.undefined
    ): DefaultWorkspaceCreationProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomSecurityGroupId" -> CustomSecurityGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultOu" -> DefaultOu.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableInternetAccess" -> EnableInternetAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableWorkDocs" -> EnableWorkDocs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserEnabledAsLocalAdministrator" -> UserEnabledAsLocalAdministrator.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefaultWorkspaceCreationProperties]
    }
  }

  @js.native
  trait DeleteIpGroupRequest extends js.Object {
    var GroupId: IpGroupId
  }

  object DeleteIpGroupRequest {
    def apply(
        GroupId: IpGroupId
    ): DeleteIpGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIpGroupRequest]
    }
  }

  @js.native
  trait DeleteIpGroupResult extends js.Object {}

  object DeleteIpGroupResult {
    def apply(
        ): DeleteIpGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIpGroupResult]
    }
  }

  @js.native
  trait DeleteTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
    var TagKeys: TagKeyList
  }

  object DeleteTagsRequest {
    def apply(
        ResourceId: NonEmptyString,
        TagKeys: TagKeyList
    ): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagKeys"    -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  @js.native
  trait DeleteTagsResult extends js.Object {}

  object DeleteTagsResult {
    def apply(
        ): DeleteTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsResult]
    }
  }

  @js.native
  trait DeleteWorkspaceImageRequest extends js.Object {
    var ImageId: WorkspaceImageId
  }

  object DeleteWorkspaceImageRequest {
    def apply(
        ImageId: WorkspaceImageId
    ): DeleteWorkspaceImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageId" -> ImageId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkspaceImageRequest]
    }
  }

  @js.native
  trait DeleteWorkspaceImageResult extends js.Object {}

  object DeleteWorkspaceImageResult {
    def apply(
        ): DeleteWorkspaceImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteWorkspaceImageResult]
    }
  }

  @js.native
  trait DescribeAccountModificationsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeAccountModificationsRequest {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeAccountModificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeAccountModificationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountModifications" -> AccountModifications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountModificationsResult]
    }
  }

  @js.native
  trait DescribeAccountRequest extends js.Object {}

  object DescribeAccountRequest {
    def apply(
        ): DescribeAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountRequest]
    }
  }

  @js.native
  trait DescribeAccountResult extends js.Object {
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum]
  }

  object DescribeAccountResult {
    def apply(
        DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined,
        DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined
    ): DescribeAccountResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedTenancyManagementCidrRange" -> DedicatedTenancyManagementCidrRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DedicatedTenancySupport" -> DedicatedTenancySupport.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountResult]
    }
  }

  @js.native
  trait DescribeClientPropertiesRequest extends js.Object {
    var ResourceIds: ResourceIdList
  }

  object DescribeClientPropertiesRequest {
    def apply(
        ResourceIds: ResourceIdList
    ): DescribeClientPropertiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIds" -> ResourceIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClientPropertiesRequest]
    }
  }

  @js.native
  trait DescribeClientPropertiesResult extends js.Object {
    var ClientPropertiesList: js.UndefOr[ClientPropertiesList]
  }

  object DescribeClientPropertiesResult {
    def apply(
        ClientPropertiesList: js.UndefOr[ClientPropertiesList] = js.undefined
    ): DescribeClientPropertiesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientPropertiesList" -> ClientPropertiesList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClientPropertiesResult]
    }
  }

  @js.native
  trait DescribeIpGroupsRequest extends js.Object {
    var GroupIds: js.UndefOr[IpGroupIdList]
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeIpGroupsRequest {
    def apply(
        GroupIds: js.UndefOr[IpGroupIdList] = js.undefined,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeIpGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupIds" -> GroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIpGroupsRequest]
    }
  }

  @js.native
  trait DescribeIpGroupsResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Result: js.UndefOr[WorkspacesIpGroupsList]
  }

  object DescribeIpGroupsResult {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Result: js.UndefOr[WorkspacesIpGroupsList] = js.undefined
    ): DescribeIpGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Result" -> Result.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIpGroupsResult]
    }
  }

  @js.native
  trait DescribeTagsRequest extends js.Object {
    var ResourceId: NonEmptyString
  }

  object DescribeTagsRequest {
    def apply(
        ResourceId: NonEmptyString
    ): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
    }
  }

  @js.native
  trait DescribeTagsResult extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object DescribeTagsResult {
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): DescribeTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResult]
    }
  }

  @js.native
  trait DescribeWorkspaceBundlesRequest extends js.Object {
    var BundleIds: js.UndefOr[BundleIdList]
    var NextToken: js.UndefOr[PaginationToken]
    var Owner: js.UndefOr[BundleOwner]
  }

  object DescribeWorkspaceBundlesRequest {
    def apply(
        BundleIds: js.UndefOr[BundleIdList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Owner: js.UndefOr[BundleOwner] = js.undefined
    ): DescribeWorkspaceBundlesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleIds" -> BundleIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Owner" -> Owner.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceBundlesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bundles" -> Bundles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceDirectoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryIds" -> DirectoryIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceDirectoriesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Directories" -> Directories.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceDirectoriesResult]
    }
  }

  @js.native
  trait DescribeWorkspaceImagesRequest extends js.Object {
    var ImageIds: js.UndefOr[WorkspaceImageIdList]
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceImagesRequest {
    def apply(
        ImageIds: js.UndefOr[WorkspaceImageIdList] = js.undefined,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageIds" -> ImageIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceImagesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Images" -> Images.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspaceImagesResult]
    }
  }

  @js.native
  trait DescribeWorkspacesConnectionStatusRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var WorkspaceIds: js.UndefOr[WorkspaceIdList]
  }

  object DescribeWorkspacesConnectionStatusRequest {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined
    ): DescribeWorkspacesConnectionStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceIds" -> WorkspaceIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesConnectionStatusRequest]
    }
  }

  @js.native
  trait DescribeWorkspacesConnectionStatusResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList]
  }

  object DescribeWorkspacesConnectionStatusResult {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.undefined
    ): DescribeWorkspacesConnectionStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspacesConnectionStatus" -> WorkspacesConnectionStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesConnectionStatusResult]
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
    def apply(
        BundleId: js.UndefOr[BundleId] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined,
        WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined
    ): DescribeWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId" -> BundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryId" -> DirectoryId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserName" -> UserName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceIds" -> WorkspaceIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesRequest]
    }
  }

  @js.native
  trait DescribeWorkspacesResult extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Workspaces: js.UndefOr[WorkspaceList]
  }

  object DescribeWorkspacesResult {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Workspaces: js.UndefOr[WorkspaceList] = js.undefined
    ): DescribeWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Workspaces" -> Workspaces.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkspacesResult]
    }
  }

  @js.native
  trait DisassociateIpGroupsRequest extends js.Object {
    var DirectoryId: DirectoryId
    var GroupIds: IpGroupIdList
  }

  object DisassociateIpGroupsRequest {
    def apply(
        DirectoryId: DirectoryId,
        GroupIds: IpGroupIdList
    ): DisassociateIpGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "GroupIds"    -> GroupIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateIpGroupsRequest]
    }
  }

  @js.native
  trait DisassociateIpGroupsResult extends js.Object {}

  object DisassociateIpGroupsResult {
    def apply(
        ): DisassociateIpGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateIpGroupsResult]
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
    def apply(
        ErrorCode: js.UndefOr[ErrorType] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        WorkspaceRequest: js.UndefOr[WorkspaceRequest] = js.undefined
    ): FailedCreateWorkspaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceRequest" -> WorkspaceRequest.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedCreateWorkspaceRequest]
    }
  }

  /**
    * Describes a WorkSpace that could not be rebooted. (<a>RebootWorkspaces</a>), rebuilt (<a>RebuildWorkspaces</a>), terminated (<a>TerminateWorkspaces</a>), started (<a>StartWorkspaces</a>), or stopped (<a>StopWorkspaces</a>).
    */
  @js.native
  trait FailedWorkspaceChangeRequest extends js.Object {
    var ErrorCode: js.UndefOr[ErrorType]
    var ErrorMessage: js.UndefOr[Description]
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object FailedWorkspaceChangeRequest {
    def apply(
        ErrorCode: js.UndefOr[ErrorType] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): FailedWorkspaceChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceId" -> WorkspaceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedWorkspaceChangeRequest]
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
    def apply(
        Ec2ImageId: Ec2ImageId,
        ImageDescription: WorkspaceImageDescription,
        ImageName: WorkspaceImageName,
        IngestionProcess: WorkspaceImageIngestionProcess,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ImportWorkspaceImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ec2ImageId"       -> Ec2ImageId.asInstanceOf[js.Any],
        "ImageDescription" -> ImageDescription.asInstanceOf[js.Any],
        "ImageName"        -> ImageName.asInstanceOf[js.Any],
        "IngestionProcess" -> IngestionProcess.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportWorkspaceImageRequest]
    }
  }

  @js.native
  trait ImportWorkspaceImageResult extends js.Object {
    var ImageId: js.UndefOr[WorkspaceImageId]
  }

  object ImportWorkspaceImageResult {
    def apply(
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
    ): ImportWorkspaceImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageId" -> ImageId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportWorkspaceImageResult]
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
    def apply(
        ipRule: js.UndefOr[IpRule] = js.undefined,
        ruleDesc: js.UndefOr[IpRuleDesc] = js.undefined
    ): IpRuleItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ipRule" -> ipRule.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ruleDesc" -> ruleDesc.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpRuleItem]
    }
  }

  @js.native
  trait ListAvailableManagementCidrRangesRequest extends js.Object {
    var ManagementCidrRangeConstraint: ManagementCidrRangeConstraint
    var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAvailableManagementCidrRangesRequest {
    def apply(
        ManagementCidrRangeConstraint: ManagementCidrRangeConstraint,
        MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAvailableManagementCidrRangesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManagementCidrRangeConstraint" -> ManagementCidrRangeConstraint.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAvailableManagementCidrRangesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManagementCidrRanges" -> ManagementCidrRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAvailableManagementCidrRangesResult]
    }
  }

  object ModificationResourceEnumEnum {
    val ROOT_VOLUME  = "ROOT_VOLUME"
    val USER_VOLUME  = "USER_VOLUME"
    val COMPUTE_TYPE = "COMPUTE_TYPE"

    val values = IndexedSeq(ROOT_VOLUME, USER_VOLUME, COMPUTE_TYPE)
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
    def apply(
        Resource: js.UndefOr[ModificationResourceEnum] = js.undefined,
        State: js.UndefOr[ModificationStateEnum] = js.undefined
    ): ModificationState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModificationState]
    }
  }

  object ModificationStateEnumEnum {
    val UPDATE_INITIATED   = "UPDATE_INITIATED"
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS"

    val values = IndexedSeq(UPDATE_INITIATED, UPDATE_IN_PROGRESS)
  }

  @js.native
  trait ModifyAccountRequest extends js.Object {
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange]
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum]
  }

  object ModifyAccountRequest {
    def apply(
        DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined,
        DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum] = js.undefined
    ): ModifyAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedTenancyManagementCidrRange" -> DedicatedTenancyManagementCidrRange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DedicatedTenancySupport" -> DedicatedTenancySupport.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyAccountRequest]
    }
  }

  @js.native
  trait ModifyAccountResult extends js.Object {}

  object ModifyAccountResult {
    def apply(
        ): ModifyAccountResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyAccountResult]
    }
  }

  @js.native
  trait ModifyClientPropertiesRequest extends js.Object {
    var ClientProperties: ClientProperties
    var ResourceId: NonEmptyString
  }

  object ModifyClientPropertiesRequest {
    def apply(
        ClientProperties: ClientProperties,
        ResourceId: NonEmptyString
    ): ModifyClientPropertiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientProperties" -> ClientProperties.asInstanceOf[js.Any],
        "ResourceId"       -> ResourceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClientPropertiesRequest]
    }
  }

  @js.native
  trait ModifyClientPropertiesResult extends js.Object {}

  object ModifyClientPropertiesResult {
    def apply(
        ): ModifyClientPropertiesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyClientPropertiesResult]
    }
  }

  @js.native
  trait ModifyWorkspacePropertiesRequest extends js.Object {
    var WorkspaceId: WorkspaceId
    var WorkspaceProperties: WorkspaceProperties
  }

  object ModifyWorkspacePropertiesRequest {
    def apply(
        WorkspaceId: WorkspaceId,
        WorkspaceProperties: WorkspaceProperties
    ): ModifyWorkspacePropertiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId"         -> WorkspaceId.asInstanceOf[js.Any],
        "WorkspaceProperties" -> WorkspaceProperties.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspacePropertiesRequest]
    }
  }

  @js.native
  trait ModifyWorkspacePropertiesResult extends js.Object {}

  object ModifyWorkspacePropertiesResult {
    def apply(
        ): ModifyWorkspacePropertiesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspacePropertiesResult]
    }
  }

  @js.native
  trait ModifyWorkspaceStateRequest extends js.Object {
    var WorkspaceId: WorkspaceId
    var WorkspaceState: TargetWorkspaceState
  }

  object ModifyWorkspaceStateRequest {
    def apply(
        WorkspaceId: WorkspaceId,
        WorkspaceState: TargetWorkspaceState
    ): ModifyWorkspaceStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId"    -> WorkspaceId.asInstanceOf[js.Any],
        "WorkspaceState" -> WorkspaceState.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspaceStateRequest]
    }
  }

  @js.native
  trait ModifyWorkspaceStateResult extends js.Object {}

  object ModifyWorkspaceStateResult {
    def apply(
        ): ModifyWorkspaceStateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyWorkspaceStateResult]
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
    def apply(
        Type: js.UndefOr[OperatingSystemType] = js.undefined
    ): OperatingSystem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OperatingSystem]
    }
  }

  object OperatingSystemTypeEnum {
    val WINDOWS = "WINDOWS"
    val LINUX   = "LINUX"

    val values = IndexedSeq(WINDOWS, LINUX)
  }

  /**
    * Describes the information used to reboot a WorkSpace.
    */
  @js.native
  trait RebootRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object RebootRequest {
    def apply(
        WorkspaceId: WorkspaceId
    ): RebootRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootRequest]
    }
  }

  @js.native
  trait RebootWorkspacesRequest extends js.Object {
    var RebootWorkspaceRequests: RebootWorkspaceRequests
  }

  object RebootWorkspacesRequest {
    def apply(
        RebootWorkspaceRequests: RebootWorkspaceRequests
    ): RebootWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RebootWorkspaceRequests" -> RebootWorkspaceRequests.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootWorkspacesRequest]
    }
  }

  @js.native
  trait RebootWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests]
  }

  object RebootWorkspacesResult {
    def apply(
        FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests] = js.undefined
    ): RebootWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootWorkspacesResult]
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
    def apply(
        WorkspaceId: WorkspaceId
    ): RebuildRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildRequest]
    }
  }

  @js.native
  trait RebuildWorkspacesRequest extends js.Object {
    var RebuildWorkspaceRequests: RebuildWorkspaceRequests
  }

  object RebuildWorkspacesRequest {
    def apply(
        RebuildWorkspaceRequests: RebuildWorkspaceRequests
    ): RebuildWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RebuildWorkspaceRequests" -> RebuildWorkspaceRequests.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildWorkspacesRequest]
    }
  }

  @js.native
  trait RebuildWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests]
  }

  object RebuildWorkspacesResult {
    def apply(
        FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.undefined
    ): RebuildWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildWorkspacesResult]
    }
  }

  object ReconnectEnumEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  @js.native
  trait RevokeIpRulesRequest extends js.Object {
    var GroupId: IpGroupId
    var UserRules: IpRevokedRuleList
  }

  object RevokeIpRulesRequest {
    def apply(
        GroupId: IpGroupId,
        UserRules: IpRevokedRuleList
    ): RevokeIpRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId"   -> GroupId.asInstanceOf[js.Any],
        "UserRules" -> UserRules.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeIpRulesRequest]
    }
  }

  @js.native
  trait RevokeIpRulesResult extends js.Object {}

  object RevokeIpRulesResult {
    def apply(
        ): RevokeIpRulesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeIpRulesResult]
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
    def apply(
        Capacity: js.UndefOr[NonEmptyString] = js.undefined
    ): RootStorage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Capacity" -> Capacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RootStorage]
    }
  }

  object RunningModeEnum {
    val AUTO_STOP = "AUTO_STOP"
    val ALWAYS_ON = "ALWAYS_ON"

    val values = IndexedSeq(AUTO_STOP, ALWAYS_ON)
  }

  /**
    * Information used to start a WorkSpace.
    */
  @js.native
  trait StartRequest extends js.Object {
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object StartRequest {
    def apply(
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): StartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartRequest]
    }
  }

  @js.native
  trait StartWorkspacesRequest extends js.Object {
    var StartWorkspaceRequests: StartWorkspaceRequests
  }

  object StartWorkspacesRequest {
    def apply(
        StartWorkspaceRequests: StartWorkspaceRequests
    ): StartWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartWorkspaceRequests" -> StartWorkspaceRequests.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartWorkspacesRequest]
    }
  }

  @js.native
  trait StartWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedStartWorkspaceRequests]
  }

  object StartWorkspacesResult {
    def apply(
        FailedRequests: js.UndefOr[FailedStartWorkspaceRequests] = js.undefined
    ): StartWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartWorkspacesResult]
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
    def apply(
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): StopRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRequest]
    }
  }

  @js.native
  trait StopWorkspacesRequest extends js.Object {
    var StopWorkspaceRequests: StopWorkspaceRequests
  }

  object StopWorkspacesRequest {
    def apply(
        StopWorkspaceRequests: StopWorkspaceRequests
    ): StopWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StopWorkspaceRequests" -> StopWorkspaceRequests.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopWorkspacesRequest]
    }
  }

  @js.native
  trait StopWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedStopWorkspaceRequests]
  }

  object StopWorkspacesResult {
    def apply(
        FailedRequests: js.UndefOr[FailedStopWorkspaceRequests] = js.undefined
    ): StopWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopWorkspacesResult]
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
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  object TargetWorkspaceStateEnum {
    val AVAILABLE         = "AVAILABLE"
    val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE"

    val values = IndexedSeq(AVAILABLE, ADMIN_MAINTENANCE)
  }

  /**
    * Describes the information used to terminate a WorkSpace.
    */
  @js.native
  trait TerminateRequest extends js.Object {
    var WorkspaceId: WorkspaceId
  }

  object TerminateRequest {
    def apply(
        WorkspaceId: WorkspaceId
    ): TerminateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateRequest]
    }
  }

  @js.native
  trait TerminateWorkspacesRequest extends js.Object {
    var TerminateWorkspaceRequests: TerminateWorkspaceRequests
  }

  object TerminateWorkspacesRequest {
    def apply(
        TerminateWorkspaceRequests: TerminateWorkspaceRequests
    ): TerminateWorkspacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminateWorkspaceRequests" -> TerminateWorkspaceRequests.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateWorkspacesRequest]
    }
  }

  @js.native
  trait TerminateWorkspacesResult extends js.Object {
    var FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests]
  }

  object TerminateWorkspacesResult {
    def apply(
        FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests] = js.undefined
    ): TerminateWorkspacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedRequests" -> FailedRequests.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateWorkspacesResult]
    }
  }

  @js.native
  trait UpdateRulesOfIpGroupRequest extends js.Object {
    var GroupId: IpGroupId
    var UserRules: IpRuleList
  }

  object UpdateRulesOfIpGroupRequest {
    def apply(
        GroupId: IpGroupId,
        UserRules: IpRuleList
    ): UpdateRulesOfIpGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId"   -> GroupId.asInstanceOf[js.Any],
        "UserRules" -> UserRules.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRulesOfIpGroupRequest]
    }
  }

  @js.native
  trait UpdateRulesOfIpGroupResult extends js.Object {}

  object UpdateRulesOfIpGroupResult {
    def apply(
        ): UpdateRulesOfIpGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRulesOfIpGroupResult]
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
    def apply(
        Capacity: js.UndefOr[NonEmptyString] = js.undefined
    ): UserStorage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Capacity" -> Capacity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserStorage]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId" -> BundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ComputerName" -> ComputerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryId" -> DirectoryId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddress" -> IpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ModificationStates" -> ModificationStates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RootVolumeEncryptionEnabled" -> RootVolumeEncryptionEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetId" -> SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserName" -> UserName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserVolumeEncryptionEnabled" -> UserVolumeEncryptionEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeEncryptionKey" -> VolumeEncryptionKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceId" -> WorkspaceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceProperties" -> WorkspaceProperties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Workspace]
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
    var Name: js.UndefOr[NonEmptyString]
    var Owner: js.UndefOr[BundleOwner]
    var RootStorage: js.UndefOr[RootStorage]
    var UserStorage: js.UndefOr[UserStorage]
  }

  object WorkspaceBundle {
    def apply(
        BundleId: js.UndefOr[BundleId] = js.undefined,
        ComputeType: js.UndefOr[ComputeType] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Owner: js.UndefOr[BundleOwner] = js.undefined,
        RootStorage: js.UndefOr[RootStorage] = js.undefined,
        UserStorage: js.UndefOr[UserStorage] = js.undefined
    ): WorkspaceBundle = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId" -> BundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ComputeType" -> ComputeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Owner" -> Owner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RootStorage" -> RootStorage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserStorage" -> UserStorage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceBundle]
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
    def apply(
        ConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        ConnectionStateCheckTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp] = js.undefined,
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): WorkspaceConnectionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionState" -> ConnectionState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConnectionStateCheckTimestamp" -> ConnectionStateCheckTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastKnownUserConnectionTimestamp" -> LastKnownUserConnectionTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceId" -> WorkspaceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceConnectionStatus]
    }
  }

  /**
    * Describes an AWS Directory Service directory that is used with Amazon WorkSpaces.
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
    var State: js.UndefOr[WorkspaceDirectoryState]
    var SubnetIds: js.UndefOr[SubnetIds]
    var WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties]
    var WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId]
    var ipGroupIds: js.UndefOr[IpGroupIdList]
  }

  object WorkspaceDirectory {
    def apply(
        Alias: js.UndefOr[Alias] = js.undefined,
        CustomerUserName: js.UndefOr[UserName] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
        DirectoryType: js.UndefOr[WorkspaceDirectoryType] = js.undefined,
        DnsIpAddresses: js.UndefOr[DnsIpAddresses] = js.undefined,
        IamRoleId: js.UndefOr[ARN] = js.undefined,
        RegistrationCode: js.UndefOr[RegistrationCode] = js.undefined,
        State: js.UndefOr[WorkspaceDirectoryState] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties] = js.undefined,
        WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
        ipGroupIds: js.UndefOr[IpGroupIdList] = js.undefined
    ): WorkspaceDirectory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomerUserName" -> CustomerUserName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryId" -> DirectoryId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryName" -> DirectoryName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryType" -> DirectoryType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DnsIpAddresses" -> DnsIpAddresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamRoleId" -> IamRoleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegistrationCode" -> RegistrationCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetIds" -> SubnetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceCreationProperties" -> WorkspaceCreationProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceSecurityGroupId" -> WorkspaceSecurityGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ipGroupIds" -> ipGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceDirectory]
    }
  }

  object WorkspaceDirectoryStateEnum {
    val REGISTERING   = "REGISTERING"
    val REGISTERED    = "REGISTERED"
    val DEREGISTERING = "DEREGISTERING"
    val DEREGISTERED  = "DEREGISTERED"
    val ERROR         = "ERROR"

    val values = IndexedSeq(REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR)
  }

  object WorkspaceDirectoryTypeEnum {
    val SIMPLE_AD    = "SIMPLE_AD"
    val AD_CONNECTOR = "AD_CONNECTOR"

    val values = IndexedSeq(SIMPLE_AD, AD_CONNECTOR)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageId" -> ImageId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OperatingSystem" -> OperatingSystem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequiredTenancy" -> RequiredTenancy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceImage]
    }
  }

  object WorkspaceImageIngestionProcessEnum {
    val BYOL_REGULAR     = "BYOL_REGULAR"
    val BYOL_GRAPHICS    = "BYOL_GRAPHICS"
    val BYOL_GRAPHICSPRO = "BYOL_GRAPHICSPRO"

    val values = IndexedSeq(BYOL_REGULAR, BYOL_GRAPHICS, BYOL_GRAPHICSPRO)
  }

  object WorkspaceImageRequiredTenancyEnum {
    val DEFAULT   = "DEFAULT"
    val DEDICATED = "DEDICATED"

    val values = IndexedSeq(DEFAULT, DEDICATED)
  }

  object WorkspaceImageStateEnum {
    val AVAILABLE = "AVAILABLE"
    val PENDING   = "PENDING"
    val ERROR     = "ERROR"

    val values = IndexedSeq(AVAILABLE, PENDING, ERROR)
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
    def apply(
        ComputeTypeName: js.UndefOr[Compute] = js.undefined,
        RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib] = js.undefined,
        RunningMode: js.UndefOr[RunningMode] = js.undefined,
        RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes] = js.undefined,
        UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib] = js.undefined
    ): WorkspaceProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComputeTypeName" -> ComputeTypeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RootVolumeSizeGib" -> RootVolumeSizeGib.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RunningMode" -> RunningMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RunningModeAutoStopTimeoutInMinutes" -> RunningModeAutoStopTimeoutInMinutes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserVolumeSizeGib" -> UserVolumeSizeGib.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceProperties]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "BundleId"    -> BundleId.asInstanceOf[js.Any],
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "UserName"    -> UserName.asInstanceOf[js.Any],
        "RootVolumeEncryptionEnabled" -> RootVolumeEncryptionEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserVolumeEncryptionEnabled" -> UserVolumeEncryptionEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeEncryptionKey" -> VolumeEncryptionKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WorkspaceProperties" -> WorkspaceProperties.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspaceRequest]
    }
  }

  object WorkspaceStateEnum {
    val PENDING           = "PENDING"
    val AVAILABLE         = "AVAILABLE"
    val IMPAIRED          = "IMPAIRED"
    val UNHEALTHY         = "UNHEALTHY"
    val REBOOTING         = "REBOOTING"
    val STARTING          = "STARTING"
    val REBUILDING        = "REBUILDING"
    val MAINTENANCE       = "MAINTENANCE"
    val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE"
    val TERMINATING       = "TERMINATING"
    val TERMINATED        = "TERMINATED"
    val SUSPENDED         = "SUSPENDED"
    val UPDATING          = "UPDATING"
    val STOPPING          = "STOPPING"
    val STOPPED           = "STOPPED"
    val ERROR             = "ERROR"

    val values = IndexedSeq(
      PENDING,
      AVAILABLE,
      IMPAIRED,
      UNHEALTHY,
      REBOOTING,
      STARTING,
      REBUILDING,
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
    def apply(
        groupDesc: js.UndefOr[IpGroupDesc] = js.undefined,
        groupId: js.UndefOr[IpGroupId] = js.undefined,
        groupName: js.UndefOr[IpGroupName] = js.undefined,
        userRules: js.UndefOr[IpRuleList] = js.undefined
    ): WorkspacesIpGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "groupDesc" -> groupDesc.map { x =>
          x.asInstanceOf[js.Any]
        },
        "groupId" -> groupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "groupName" -> groupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "userRules" -> userRules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkspacesIpGroup]
    }
  }
}
