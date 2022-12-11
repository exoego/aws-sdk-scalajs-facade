package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object workspaces {
  type ARN = String
  type AccountModificationList = js.Array[AccountModification]
  type AddInName = String
  type AddInUrl = String
  type Alias = String
  type AmazonUuid = String
  type ApplicationList = js.Array[Application]
  type AwsAccount = String
  type BooleanObject = Boolean
  type BundleId = String
  type BundleIdList = js.Array[BundleId]
  type BundleList = js.Array[WorkspaceBundle]
  type BundleOwner = String
  type CertificateAuthorityArn = String
  type ClientDeviceTypeList = js.Array[ClientDeviceType]
  type ClientEmail = String
  type ClientLocale = String
  type ClientLoginMessage = String
  type ClientPropertiesList = js.Array[ClientPropertiesResult]
  type ClientUrl = String
  type ComputerName = String
  type ConnectClientAddInList = js.Array[ConnectClientAddIn]
  type ConnectionAliasAssociationList = js.Array[ConnectionAliasAssociation]
  type ConnectionAliasId = String
  type ConnectionAliasIdList = js.Array[ConnectionAliasId]
  type ConnectionAliasList = js.Array[ConnectionAlias]
  type ConnectionAliasPermissions = js.Array[ConnectionAliasPermission]
  type ConnectionIdentifier = String
  type ConnectionString = String
  type DedicatedTenancyCidrRangeList = js.Array[DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange = String
  type DefaultLogo = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DefaultOu = String
  type DeletableCertificateBasedAuthPropertiesList = js.Array[DeletableCertificateBasedAuthProperty]
  type DeletableSamlPropertiesList = js.Array[DeletableSamlProperty]
  type Description = String
  type DirectoryId = String
  type DirectoryIdList = js.Array[DirectoryId]
  type DirectoryList = js.Array[WorkspaceDirectory]
  type DirectoryName = String
  type DnsIpAddresses = js.Array[IpAddress]
  type Ec2ImageId = String
  type ErrorType = String
  type FailedCreateStandbyWorkspacesRequestList = js.Array[FailedCreateStandbyWorkspacesRequest]
  type FailedCreateWorkspaceRequests = js.Array[FailedCreateWorkspaceRequest]
  type FailedRebootWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedRebuildWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStartWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStopWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedTerminateWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type ImagePermissions = js.Array[ImagePermission]
  type Ios2XLogo = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Ios3XLogo = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type IosLogo = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
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
  type LoginMessage = js.Dictionary[ClientLoginMessage]
  type ManagementCidrRangeConstraint = String
  type ManagementCidrRangeMaxResults = Int
  type ModificationStateList = js.Array[ModificationState]
  type NonEmptyString = String
  type PaginationToken = String
  type PendingCreateStandbyWorkspacesRequestList = js.Array[PendingCreateStandbyWorkspacesRequest]
  type ProtocolList = js.Array[Protocol]
  type RebootWorkspaceRequests = js.Array[RebootRequest]
  type RebuildWorkspaceRequests = js.Array[RebuildRequest]
  type Region = String
  type RegistrationCode = String
  type RelatedWorkspaces = js.Array[RelatedWorkspaceProperties]
  type ResourceIdList = js.Array[NonEmptyString]
  type RootVolumeSizeGib = Int
  type RunningModeAutoStopTimeoutInMinutes = Int
  type SamlUserAccessUrl = String
  type SecurityGroupId = String
  type SnapshotList = js.Array[Snapshot]
  type StandbyWorkspacesList = js.Array[StandbyWorkspace]
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
  type UpdateDescription = String
  type UserName = String
  type UserVolumeSizeGib = Int
  type VolumeEncryptionKey = String
  type WorkspaceBundleDescription = String
  type WorkspaceBundleName = String
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

  final class WorkSpacesOps(private val service: WorkSpaces) extends AnyVal {

    @inline def associateConnectionAliasFuture(params: AssociateConnectionAliasRequest): Future[AssociateConnectionAliasResult] = service.associateConnectionAlias(params).promise().toFuture
    @inline def associateIpGroupsFuture(params: AssociateIpGroupsRequest): Future[AssociateIpGroupsResult] = service.associateIpGroups(params).promise().toFuture
    @inline def authorizeIpRulesFuture(params: AuthorizeIpRulesRequest): Future[AuthorizeIpRulesResult] = service.authorizeIpRules(params).promise().toFuture
    @inline def copyWorkspaceImageFuture(params: CopyWorkspaceImageRequest): Future[CopyWorkspaceImageResult] = service.copyWorkspaceImage(params).promise().toFuture
    @inline def createConnectClientAddInFuture(params: CreateConnectClientAddInRequest): Future[CreateConnectClientAddInResult] = service.createConnectClientAddIn(params).promise().toFuture
    @inline def createConnectionAliasFuture(params: CreateConnectionAliasRequest): Future[CreateConnectionAliasResult] = service.createConnectionAlias(params).promise().toFuture
    @inline def createIpGroupFuture(params: CreateIpGroupRequest): Future[CreateIpGroupResult] = service.createIpGroup(params).promise().toFuture
    @inline def createStandbyWorkspacesFuture(params: CreateStandbyWorkspacesRequest): Future[CreateStandbyWorkspacesResult] = service.createStandbyWorkspaces(params).promise().toFuture
    @inline def createTagsFuture(params: CreateTagsRequest): Future[CreateTagsResult] = service.createTags(params).promise().toFuture
    @inline def createUpdatedWorkspaceImageFuture(params: CreateUpdatedWorkspaceImageRequest): Future[CreateUpdatedWorkspaceImageResult] = service.createUpdatedWorkspaceImage(params).promise().toFuture
    @inline def createWorkspaceBundleFuture(params: CreateWorkspaceBundleRequest): Future[CreateWorkspaceBundleResult] = service.createWorkspaceBundle(params).promise().toFuture
    @inline def createWorkspaceImageFuture(params: CreateWorkspaceImageRequest): Future[CreateWorkspaceImageResult] = service.createWorkspaceImage(params).promise().toFuture
    @inline def createWorkspacesFuture(params: CreateWorkspacesRequest): Future[CreateWorkspacesResult] = service.createWorkspaces(params).promise().toFuture
    @inline def deleteClientBrandingFuture(params: DeleteClientBrandingRequest): Future[DeleteClientBrandingResult] = service.deleteClientBranding(params).promise().toFuture
    @inline def deleteConnectClientAddInFuture(params: DeleteConnectClientAddInRequest): Future[DeleteConnectClientAddInResult] = service.deleteConnectClientAddIn(params).promise().toFuture
    @inline def deleteConnectionAliasFuture(params: DeleteConnectionAliasRequest): Future[DeleteConnectionAliasResult] = service.deleteConnectionAlias(params).promise().toFuture
    @inline def deleteIpGroupFuture(params: DeleteIpGroupRequest): Future[DeleteIpGroupResult] = service.deleteIpGroup(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsRequest): Future[DeleteTagsResult] = service.deleteTags(params).promise().toFuture
    @inline def deleteWorkspaceBundleFuture(params: DeleteWorkspaceBundleRequest): Future[DeleteWorkspaceBundleResult] = service.deleteWorkspaceBundle(params).promise().toFuture
    @inline def deleteWorkspaceImageFuture(params: DeleteWorkspaceImageRequest): Future[DeleteWorkspaceImageResult] = service.deleteWorkspaceImage(params).promise().toFuture
    @inline def deregisterWorkspaceDirectoryFuture(params: DeregisterWorkspaceDirectoryRequest): Future[DeregisterWorkspaceDirectoryResult] = service.deregisterWorkspaceDirectory(params).promise().toFuture
    @inline def describeAccountFuture(params: DescribeAccountRequest): Future[DescribeAccountResult] = service.describeAccount(params).promise().toFuture
    @inline def describeAccountModificationsFuture(params: DescribeAccountModificationsRequest): Future[DescribeAccountModificationsResult] = service.describeAccountModifications(params).promise().toFuture
    @inline def describeClientBrandingFuture(params: DescribeClientBrandingRequest): Future[DescribeClientBrandingResult] = service.describeClientBranding(params).promise().toFuture
    @inline def describeClientPropertiesFuture(params: DescribeClientPropertiesRequest): Future[DescribeClientPropertiesResult] = service.describeClientProperties(params).promise().toFuture
    @inline def describeConnectClientAddInsFuture(params: DescribeConnectClientAddInsRequest): Future[DescribeConnectClientAddInsResult] = service.describeConnectClientAddIns(params).promise().toFuture
    @inline def describeConnectionAliasPermissionsFuture(params: DescribeConnectionAliasPermissionsRequest): Future[DescribeConnectionAliasPermissionsResult] = service.describeConnectionAliasPermissions(params).promise().toFuture
    @inline def describeConnectionAliasesFuture(params: DescribeConnectionAliasesRequest): Future[DescribeConnectionAliasesResult] = service.describeConnectionAliases(params).promise().toFuture
    @inline def describeIpGroupsFuture(params: DescribeIpGroupsRequest): Future[DescribeIpGroupsResult] = service.describeIpGroups(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResult] = service.describeTags(params).promise().toFuture
    @inline def describeWorkspaceBundlesFuture(params: DescribeWorkspaceBundlesRequest): Future[DescribeWorkspaceBundlesResult] = service.describeWorkspaceBundles(params).promise().toFuture
    @inline def describeWorkspaceDirectoriesFuture(params: DescribeWorkspaceDirectoriesRequest): Future[DescribeWorkspaceDirectoriesResult] = service.describeWorkspaceDirectories(params).promise().toFuture
    @inline def describeWorkspaceImagePermissionsFuture(params: DescribeWorkspaceImagePermissionsRequest): Future[DescribeWorkspaceImagePermissionsResult] = service.describeWorkspaceImagePermissions(params).promise().toFuture
    @inline def describeWorkspaceImagesFuture(params: DescribeWorkspaceImagesRequest): Future[DescribeWorkspaceImagesResult] = service.describeWorkspaceImages(params).promise().toFuture
    @inline def describeWorkspaceSnapshotsFuture(params: DescribeWorkspaceSnapshotsRequest): Future[DescribeWorkspaceSnapshotsResult] = service.describeWorkspaceSnapshots(params).promise().toFuture
    @inline def describeWorkspacesConnectionStatusFuture(params: DescribeWorkspacesConnectionStatusRequest): Future[DescribeWorkspacesConnectionStatusResult] = service.describeWorkspacesConnectionStatus(params).promise().toFuture
    @inline def describeWorkspacesFuture(params: DescribeWorkspacesRequest): Future[DescribeWorkspacesResult] = service.describeWorkspaces(params).promise().toFuture
    @inline def disassociateConnectionAliasFuture(params: DisassociateConnectionAliasRequest): Future[DisassociateConnectionAliasResult] = service.disassociateConnectionAlias(params).promise().toFuture
    @inline def disassociateIpGroupsFuture(params: DisassociateIpGroupsRequest): Future[DisassociateIpGroupsResult] = service.disassociateIpGroups(params).promise().toFuture
    @inline def importClientBrandingFuture(params: ImportClientBrandingRequest): Future[ImportClientBrandingResult] = service.importClientBranding(params).promise().toFuture
    @inline def importWorkspaceImageFuture(params: ImportWorkspaceImageRequest): Future[ImportWorkspaceImageResult] = service.importWorkspaceImage(params).promise().toFuture
    @inline def listAvailableManagementCidrRangesFuture(params: ListAvailableManagementCidrRangesRequest): Future[ListAvailableManagementCidrRangesResult] = service.listAvailableManagementCidrRanges(params).promise().toFuture
    @inline def migrateWorkspaceFuture(params: MigrateWorkspaceRequest): Future[MigrateWorkspaceResult] = service.migrateWorkspace(params).promise().toFuture
    @inline def modifyAccountFuture(params: ModifyAccountRequest): Future[ModifyAccountResult] = service.modifyAccount(params).promise().toFuture
    @inline def modifyCertificateBasedAuthPropertiesFuture(params: ModifyCertificateBasedAuthPropertiesRequest): Future[ModifyCertificateBasedAuthPropertiesResult] = service.modifyCertificateBasedAuthProperties(params).promise().toFuture
    @inline def modifyClientPropertiesFuture(params: ModifyClientPropertiesRequest): Future[ModifyClientPropertiesResult] = service.modifyClientProperties(params).promise().toFuture
    @inline def modifySamlPropertiesFuture(params: ModifySamlPropertiesRequest): Future[ModifySamlPropertiesResult] = service.modifySamlProperties(params).promise().toFuture
    @inline def modifySelfservicePermissionsFuture(params: ModifySelfservicePermissionsRequest): Future[ModifySelfservicePermissionsResult] = service.modifySelfservicePermissions(params).promise().toFuture
    @inline def modifyWorkspaceAccessPropertiesFuture(params: ModifyWorkspaceAccessPropertiesRequest): Future[ModifyWorkspaceAccessPropertiesResult] = service.modifyWorkspaceAccessProperties(params).promise().toFuture
    @inline def modifyWorkspaceCreationPropertiesFuture(params: ModifyWorkspaceCreationPropertiesRequest): Future[ModifyWorkspaceCreationPropertiesResult] = service.modifyWorkspaceCreationProperties(params).promise().toFuture
    @inline def modifyWorkspacePropertiesFuture(params: ModifyWorkspacePropertiesRequest): Future[ModifyWorkspacePropertiesResult] = service.modifyWorkspaceProperties(params).promise().toFuture
    @inline def modifyWorkspaceStateFuture(params: ModifyWorkspaceStateRequest): Future[ModifyWorkspaceStateResult] = service.modifyWorkspaceState(params).promise().toFuture
    @inline def rebootWorkspacesFuture(params: RebootWorkspacesRequest): Future[RebootWorkspacesResult] = service.rebootWorkspaces(params).promise().toFuture
    @inline def rebuildWorkspacesFuture(params: RebuildWorkspacesRequest): Future[RebuildWorkspacesResult] = service.rebuildWorkspaces(params).promise().toFuture
    @inline def registerWorkspaceDirectoryFuture(params: RegisterWorkspaceDirectoryRequest): Future[RegisterWorkspaceDirectoryResult] = service.registerWorkspaceDirectory(params).promise().toFuture
    @inline def restoreWorkspaceFuture(params: RestoreWorkspaceRequest): Future[RestoreWorkspaceResult] = service.restoreWorkspace(params).promise().toFuture
    @inline def revokeIpRulesFuture(params: RevokeIpRulesRequest): Future[RevokeIpRulesResult] = service.revokeIpRules(params).promise().toFuture
    @inline def startWorkspacesFuture(params: StartWorkspacesRequest): Future[StartWorkspacesResult] = service.startWorkspaces(params).promise().toFuture
    @inline def stopWorkspacesFuture(params: StopWorkspacesRequest): Future[StopWorkspacesResult] = service.stopWorkspaces(params).promise().toFuture
    @inline def terminateWorkspacesFuture(params: TerminateWorkspacesRequest): Future[TerminateWorkspacesResult] = service.terminateWorkspaces(params).promise().toFuture
    @inline def updateConnectClientAddInFuture(params: UpdateConnectClientAddInRequest): Future[UpdateConnectClientAddInResult] = service.updateConnectClientAddIn(params).promise().toFuture
    @inline def updateConnectionAliasPermissionFuture(params: UpdateConnectionAliasPermissionRequest): Future[UpdateConnectionAliasPermissionResult] = service.updateConnectionAliasPermission(params).promise().toFuture
    @inline def updateRulesOfIpGroupFuture(params: UpdateRulesOfIpGroupRequest): Future[UpdateRulesOfIpGroupResult] = service.updateRulesOfIpGroup(params).promise().toFuture
    @inline def updateWorkspaceBundleFuture(params: UpdateWorkspaceBundleRequest): Future[UpdateWorkspaceBundleResult] = service.updateWorkspaceBundle(params).promise().toFuture
    @inline def updateWorkspaceImagePermissionFuture(params: UpdateWorkspaceImagePermissionRequest): Future[UpdateWorkspaceImagePermissionResult] = service.updateWorkspaceImagePermission(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/workspaces", JSImport.Namespace, "AWS.WorkSpaces")
  class WorkSpaces() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateConnectionAlias(params: AssociateConnectionAliasRequest): Request[AssociateConnectionAliasResult] = js.native
    def associateIpGroups(params: AssociateIpGroupsRequest): Request[AssociateIpGroupsResult] = js.native
    def authorizeIpRules(params: AuthorizeIpRulesRequest): Request[AuthorizeIpRulesResult] = js.native
    def copyWorkspaceImage(params: CopyWorkspaceImageRequest): Request[CopyWorkspaceImageResult] = js.native
    def createConnectClientAddIn(params: CreateConnectClientAddInRequest): Request[CreateConnectClientAddInResult] = js.native
    def createConnectionAlias(params: CreateConnectionAliasRequest): Request[CreateConnectionAliasResult] = js.native
    def createIpGroup(params: CreateIpGroupRequest): Request[CreateIpGroupResult] = js.native
    def createStandbyWorkspaces(params: CreateStandbyWorkspacesRequest): Request[CreateStandbyWorkspacesResult] = js.native
    def createTags(params: CreateTagsRequest): Request[CreateTagsResult] = js.native
    def createUpdatedWorkspaceImage(params: CreateUpdatedWorkspaceImageRequest): Request[CreateUpdatedWorkspaceImageResult] = js.native
    def createWorkspaceBundle(params: CreateWorkspaceBundleRequest): Request[CreateWorkspaceBundleResult] = js.native
    def createWorkspaceImage(params: CreateWorkspaceImageRequest): Request[CreateWorkspaceImageResult] = js.native
    def createWorkspaces(params: CreateWorkspacesRequest): Request[CreateWorkspacesResult] = js.native
    def deleteClientBranding(params: DeleteClientBrandingRequest): Request[DeleteClientBrandingResult] = js.native
    def deleteConnectClientAddIn(params: DeleteConnectClientAddInRequest): Request[DeleteConnectClientAddInResult] = js.native
    def deleteConnectionAlias(params: DeleteConnectionAliasRequest): Request[DeleteConnectionAliasResult] = js.native
    def deleteIpGroup(params: DeleteIpGroupRequest): Request[DeleteIpGroupResult] = js.native
    def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResult] = js.native
    def deleteWorkspaceBundle(params: DeleteWorkspaceBundleRequest): Request[DeleteWorkspaceBundleResult] = js.native
    def deleteWorkspaceImage(params: DeleteWorkspaceImageRequest): Request[DeleteWorkspaceImageResult] = js.native
    def deregisterWorkspaceDirectory(params: DeregisterWorkspaceDirectoryRequest): Request[DeregisterWorkspaceDirectoryResult] = js.native
    def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResult] = js.native
    def describeAccountModifications(params: DescribeAccountModificationsRequest): Request[DescribeAccountModificationsResult] = js.native
    def describeClientBranding(params: DescribeClientBrandingRequest): Request[DescribeClientBrandingResult] = js.native
    def describeClientProperties(params: DescribeClientPropertiesRequest): Request[DescribeClientPropertiesResult] = js.native
    def describeConnectClientAddIns(params: DescribeConnectClientAddInsRequest): Request[DescribeConnectClientAddInsResult] = js.native
    def describeConnectionAliasPermissions(params: DescribeConnectionAliasPermissionsRequest): Request[DescribeConnectionAliasPermissionsResult] = js.native
    def describeConnectionAliases(params: DescribeConnectionAliasesRequest): Request[DescribeConnectionAliasesResult] = js.native
    def describeIpGroups(params: DescribeIpGroupsRequest): Request[DescribeIpGroupsResult] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult] = js.native
    def describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest): Request[DescribeWorkspaceBundlesResult] = js.native
    def describeWorkspaceDirectories(params: DescribeWorkspaceDirectoriesRequest): Request[DescribeWorkspaceDirectoriesResult] = js.native
    def describeWorkspaceImagePermissions(params: DescribeWorkspaceImagePermissionsRequest): Request[DescribeWorkspaceImagePermissionsResult] = js.native
    def describeWorkspaceImages(params: DescribeWorkspaceImagesRequest): Request[DescribeWorkspaceImagesResult] = js.native
    def describeWorkspaceSnapshots(params: DescribeWorkspaceSnapshotsRequest): Request[DescribeWorkspaceSnapshotsResult] = js.native
    def describeWorkspaces(params: DescribeWorkspacesRequest): Request[DescribeWorkspacesResult] = js.native
    def describeWorkspacesConnectionStatus(params: DescribeWorkspacesConnectionStatusRequest): Request[DescribeWorkspacesConnectionStatusResult] = js.native
    def disassociateConnectionAlias(params: DisassociateConnectionAliasRequest): Request[DisassociateConnectionAliasResult] = js.native
    def disassociateIpGroups(params: DisassociateIpGroupsRequest): Request[DisassociateIpGroupsResult] = js.native
    def importClientBranding(params: ImportClientBrandingRequest): Request[ImportClientBrandingResult] = js.native
    def importWorkspaceImage(params: ImportWorkspaceImageRequest): Request[ImportWorkspaceImageResult] = js.native
    def listAvailableManagementCidrRanges(params: ListAvailableManagementCidrRangesRequest): Request[ListAvailableManagementCidrRangesResult] = js.native
    def migrateWorkspace(params: MigrateWorkspaceRequest): Request[MigrateWorkspaceResult] = js.native
    def modifyAccount(params: ModifyAccountRequest): Request[ModifyAccountResult] = js.native
    def modifyCertificateBasedAuthProperties(params: ModifyCertificateBasedAuthPropertiesRequest): Request[ModifyCertificateBasedAuthPropertiesResult] = js.native
    def modifyClientProperties(params: ModifyClientPropertiesRequest): Request[ModifyClientPropertiesResult] = js.native
    def modifySamlProperties(params: ModifySamlPropertiesRequest): Request[ModifySamlPropertiesResult] = js.native
    def modifySelfservicePermissions(params: ModifySelfservicePermissionsRequest): Request[ModifySelfservicePermissionsResult] = js.native
    def modifyWorkspaceAccessProperties(params: ModifyWorkspaceAccessPropertiesRequest): Request[ModifyWorkspaceAccessPropertiesResult] = js.native
    def modifyWorkspaceCreationProperties(params: ModifyWorkspaceCreationPropertiesRequest): Request[ModifyWorkspaceCreationPropertiesResult] = js.native
    def modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest): Request[ModifyWorkspacePropertiesResult] = js.native
    def modifyWorkspaceState(params: ModifyWorkspaceStateRequest): Request[ModifyWorkspaceStateResult] = js.native
    def rebootWorkspaces(params: RebootWorkspacesRequest): Request[RebootWorkspacesResult] = js.native
    def rebuildWorkspaces(params: RebuildWorkspacesRequest): Request[RebuildWorkspacesResult] = js.native
    def registerWorkspaceDirectory(params: RegisterWorkspaceDirectoryRequest): Request[RegisterWorkspaceDirectoryResult] = js.native
    def restoreWorkspace(params: RestoreWorkspaceRequest): Request[RestoreWorkspaceResult] = js.native
    def revokeIpRules(params: RevokeIpRulesRequest): Request[RevokeIpRulesResult] = js.native
    def startWorkspaces(params: StartWorkspacesRequest): Request[StartWorkspacesResult] = js.native
    def stopWorkspaces(params: StopWorkspacesRequest): Request[StopWorkspacesResult] = js.native
    def terminateWorkspaces(params: TerminateWorkspacesRequest): Request[TerminateWorkspacesResult] = js.native
    def updateConnectClientAddIn(params: UpdateConnectClientAddInRequest): Request[UpdateConnectClientAddInResult] = js.native
    def updateConnectionAliasPermission(params: UpdateConnectionAliasPermissionRequest): Request[UpdateConnectionAliasPermissionResult] = js.native
    def updateRulesOfIpGroup(params: UpdateRulesOfIpGroupRequest): Request[UpdateRulesOfIpGroupResult] = js.native
    def updateWorkspaceBundle(params: UpdateWorkspaceBundleRequest): Request[UpdateWorkspaceBundleResult] = js.native
    def updateWorkspaceImagePermission(params: UpdateWorkspaceImagePermissionRequest): Request[UpdateWorkspaceImagePermissionResult] = js.native
  }
  object WorkSpaces {
    @inline implicit def toOps(service: WorkSpaces): WorkSpacesOps = {
      new WorkSpacesOps(service)
    }
  }

  /** Describes a modification to the configuration of Bring Your Own License (BYOL) for the specified account.
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
      DedicatedTenancyManagementCidrRange.foreach(__v => __obj.updateDynamic("DedicatedTenancyManagementCidrRange")(__v.asInstanceOf[js.Any]))
      DedicatedTenancySupport.foreach(__v => __obj.updateDynamic("DedicatedTenancySupport")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ModificationState.foreach(__v => __obj.updateDynamic("ModificationState")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountModification]
    }
  }

  @js.native
  trait AssociateConnectionAliasRequest extends js.Object {
    var AliasId: ConnectionAliasId
    var ResourceId: NonEmptyString
  }

  object AssociateConnectionAliasRequest {
    @inline
    def apply(
        AliasId: ConnectionAliasId,
        ResourceId: NonEmptyString
    ): AssociateConnectionAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasId" -> AliasId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateConnectionAliasRequest]
    }
  }

  @js.native
  trait AssociateConnectionAliasResult extends js.Object {
    var ConnectionIdentifier: js.UndefOr[ConnectionIdentifier]
  }

  object AssociateConnectionAliasResult {
    @inline
    def apply(
        ConnectionIdentifier: js.UndefOr[ConnectionIdentifier] = js.undefined
    ): AssociateConnectionAliasResult = {
      val __obj = js.Dynamic.literal()
      ConnectionIdentifier.foreach(__v => __obj.updateDynamic("ConnectionIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateConnectionAliasResult]
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
  trait AssociateIpGroupsResult extends js.Object

  object AssociateIpGroupsResult {
    @inline
    def apply(): AssociateIpGroupsResult = {
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
  trait AuthorizeIpRulesResult extends js.Object

  object AuthorizeIpRulesResult {
    @inline
    def apply(): AuthorizeIpRulesResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizeIpRulesResult]
    }
  }

  /** Describes the properties of the certificate-based authentication you want to use with your WorkSpaces.
    */
  @js.native
  trait CertificateBasedAuthProperties extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[CertificateAuthorityArn]
    var Status: js.UndefOr[CertificateBasedAuthStatusEnum]
  }

  object CertificateBasedAuthProperties {
    @inline
    def apply(
        CertificateAuthorityArn: js.UndefOr[CertificateAuthorityArn] = js.undefined,
        Status: js.UndefOr[CertificateBasedAuthStatusEnum] = js.undefined
    ): CertificateBasedAuthProperties = {
      val __obj = js.Dynamic.literal()
      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateBasedAuthProperties]
    }
  }

  /** Describes an Amazon WorkSpaces client.
    */
  @js.native
  trait ClientProperties extends js.Object {
    var LogUploadEnabled: js.UndefOr[LogUploadEnum]
    var ReconnectEnabled: js.UndefOr[ReconnectEnum]
  }

  object ClientProperties {
    @inline
    def apply(
        LogUploadEnabled: js.UndefOr[LogUploadEnum] = js.undefined,
        ReconnectEnabled: js.UndefOr[ReconnectEnum] = js.undefined
    ): ClientProperties = {
      val __obj = js.Dynamic.literal()
      LogUploadEnabled.foreach(__v => __obj.updateDynamic("LogUploadEnabled")(__v.asInstanceOf[js.Any]))
      ReconnectEnabled.foreach(__v => __obj.updateDynamic("ReconnectEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientProperties]
    }
  }

  /** Information about the Amazon WorkSpaces client.
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

  /** Describes the compute type of the bundle.
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

  /** Describes an Amazon Connect client add-in.
    */
  @js.native
  trait ConnectClientAddIn extends js.Object {
    var AddInId: js.UndefOr[AmazonUuid]
    var Name: js.UndefOr[AddInName]
    var ResourceId: js.UndefOr[DirectoryId]
    var URL: js.UndefOr[AddInUrl]
  }

  object ConnectClientAddIn {
    @inline
    def apply(
        AddInId: js.UndefOr[AmazonUuid] = js.undefined,
        Name: js.UndefOr[AddInName] = js.undefined,
        ResourceId: js.UndefOr[DirectoryId] = js.undefined,
        URL: js.UndefOr[AddInUrl] = js.undefined
    ): ConnectClientAddIn = {
      val __obj = js.Dynamic.literal()
      AddInId.foreach(__v => __obj.updateDynamic("AddInId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      URL.foreach(__v => __obj.updateDynamic("URL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectClientAddIn]
    }
  }

  /** Describes a connection alias. Connection aliases are used for cross-Region redirection. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html| Cross-Region Redirection for Amazon WorkSpaces]].
    */
  @js.native
  trait ConnectionAlias extends js.Object {
    var AliasId: js.UndefOr[ConnectionAliasId]
    var Associations: js.UndefOr[ConnectionAliasAssociationList]
    var ConnectionString: js.UndefOr[ConnectionString]
    var OwnerAccountId: js.UndefOr[AwsAccount]
    var State: js.UndefOr[ConnectionAliasState]
  }

  object ConnectionAlias {
    @inline
    def apply(
        AliasId: js.UndefOr[ConnectionAliasId] = js.undefined,
        Associations: js.UndefOr[ConnectionAliasAssociationList] = js.undefined,
        ConnectionString: js.UndefOr[ConnectionString] = js.undefined,
        OwnerAccountId: js.UndefOr[AwsAccount] = js.undefined,
        State: js.UndefOr[ConnectionAliasState] = js.undefined
    ): ConnectionAlias = {
      val __obj = js.Dynamic.literal()
      AliasId.foreach(__v => __obj.updateDynamic("AliasId")(__v.asInstanceOf[js.Any]))
      Associations.foreach(__v => __obj.updateDynamic("Associations")(__v.asInstanceOf[js.Any]))
      ConnectionString.foreach(__v => __obj.updateDynamic("ConnectionString")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionAlias]
    }
  }

  /** Describes a connection alias association that is used for cross-Region redirection. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html| Cross-Region Redirection for Amazon WorkSpaces]].
    */
  @js.native
  trait ConnectionAliasAssociation extends js.Object {
    var AssociatedAccountId: js.UndefOr[AwsAccount]
    var AssociationStatus: js.UndefOr[AssociationStatus]
    var ConnectionIdentifier: js.UndefOr[ConnectionIdentifier]
    var ResourceId: js.UndefOr[NonEmptyString]
  }

  object ConnectionAliasAssociation {
    @inline
    def apply(
        AssociatedAccountId: js.UndefOr[AwsAccount] = js.undefined,
        AssociationStatus: js.UndefOr[AssociationStatus] = js.undefined,
        ConnectionIdentifier: js.UndefOr[ConnectionIdentifier] = js.undefined,
        ResourceId: js.UndefOr[NonEmptyString] = js.undefined
    ): ConnectionAliasAssociation = {
      val __obj = js.Dynamic.literal()
      AssociatedAccountId.foreach(__v => __obj.updateDynamic("AssociatedAccountId")(__v.asInstanceOf[js.Any]))
      AssociationStatus.foreach(__v => __obj.updateDynamic("AssociationStatus")(__v.asInstanceOf[js.Any]))
      ConnectionIdentifier.foreach(__v => __obj.updateDynamic("ConnectionIdentifier")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionAliasAssociation]
    }
  }

  /** Describes the permissions for a connection alias. Connection aliases are used for cross-Region redirection. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html| Cross-Region Redirection for Amazon WorkSpaces]].
    */
  @js.native
  trait ConnectionAliasPermission extends js.Object {
    var AllowAssociation: BooleanObject
    var SharedAccountId: AwsAccount
  }

  object ConnectionAliasPermission {
    @inline
    def apply(
        AllowAssociation: BooleanObject,
        SharedAccountId: AwsAccount
    ): ConnectionAliasPermission = {
      val __obj = js.Dynamic.literal(
        "AllowAssociation" -> AllowAssociation.asInstanceOf[js.Any],
        "SharedAccountId" -> SharedAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConnectionAliasPermission]
    }
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
  trait CreateConnectClientAddInRequest extends js.Object {
    var Name: AddInName
    var ResourceId: DirectoryId
    var URL: AddInUrl
  }

  object CreateConnectClientAddInRequest {
    @inline
    def apply(
        Name: AddInName,
        ResourceId: DirectoryId,
        URL: AddInUrl
    ): CreateConnectClientAddInRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "URL" -> URL.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateConnectClientAddInRequest]
    }
  }

  @js.native
  trait CreateConnectClientAddInResult extends js.Object {
    var AddInId: js.UndefOr[AmazonUuid]
  }

  object CreateConnectClientAddInResult {
    @inline
    def apply(
        AddInId: js.UndefOr[AmazonUuid] = js.undefined
    ): CreateConnectClientAddInResult = {
      val __obj = js.Dynamic.literal()
      AddInId.foreach(__v => __obj.updateDynamic("AddInId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectClientAddInResult]
    }
  }

  @js.native
  trait CreateConnectionAliasRequest extends js.Object {
    var ConnectionString: ConnectionString
    var Tags: js.UndefOr[TagList]
  }

  object CreateConnectionAliasRequest {
    @inline
    def apply(
        ConnectionString: ConnectionString,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateConnectionAliasRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionString" -> ConnectionString.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionAliasRequest]
    }
  }

  @js.native
  trait CreateConnectionAliasResult extends js.Object {
    var AliasId: js.UndefOr[ConnectionAliasId]
  }

  object CreateConnectionAliasResult {
    @inline
    def apply(
        AliasId: js.UndefOr[ConnectionAliasId] = js.undefined
    ): CreateConnectionAliasResult = {
      val __obj = js.Dynamic.literal()
      AliasId.foreach(__v => __obj.updateDynamic("AliasId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionAliasResult]
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
  trait CreateStandbyWorkspacesRequest extends js.Object {
    var PrimaryRegion: Region
    var StandbyWorkspaces: StandbyWorkspacesList
  }

  object CreateStandbyWorkspacesRequest {
    @inline
    def apply(
        PrimaryRegion: Region,
        StandbyWorkspaces: StandbyWorkspacesList
    ): CreateStandbyWorkspacesRequest = {
      val __obj = js.Dynamic.literal(
        "PrimaryRegion" -> PrimaryRegion.asInstanceOf[js.Any],
        "StandbyWorkspaces" -> StandbyWorkspaces.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateStandbyWorkspacesRequest]
    }
  }

  @js.native
  trait CreateStandbyWorkspacesResult extends js.Object {
    var FailedStandbyRequests: js.UndefOr[FailedCreateStandbyWorkspacesRequestList]
    var PendingStandbyRequests: js.UndefOr[PendingCreateStandbyWorkspacesRequestList]
  }

  object CreateStandbyWorkspacesResult {
    @inline
    def apply(
        FailedStandbyRequests: js.UndefOr[FailedCreateStandbyWorkspacesRequestList] = js.undefined,
        PendingStandbyRequests: js.UndefOr[PendingCreateStandbyWorkspacesRequestList] = js.undefined
    ): CreateStandbyWorkspacesResult = {
      val __obj = js.Dynamic.literal()
      FailedStandbyRequests.foreach(__v => __obj.updateDynamic("FailedStandbyRequests")(__v.asInstanceOf[js.Any]))
      PendingStandbyRequests.foreach(__v => __obj.updateDynamic("PendingStandbyRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStandbyWorkspacesResult]
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
  trait CreateTagsResult extends js.Object

  object CreateTagsResult {
    @inline
    def apply(): CreateTagsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTagsResult]
    }
  }

  @js.native
  trait CreateUpdatedWorkspaceImageRequest extends js.Object {
    var Description: WorkspaceImageDescription
    var Name: WorkspaceImageName
    var SourceImageId: WorkspaceImageId
    var Tags: js.UndefOr[TagList]
  }

  object CreateUpdatedWorkspaceImageRequest {
    @inline
    def apply(
        Description: WorkspaceImageDescription,
        Name: WorkspaceImageName,
        SourceImageId: WorkspaceImageId,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateUpdatedWorkspaceImageRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceImageId" -> SourceImageId.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUpdatedWorkspaceImageRequest]
    }
  }

  @js.native
  trait CreateUpdatedWorkspaceImageResult extends js.Object {
    var ImageId: js.UndefOr[WorkspaceImageId]
  }

  object CreateUpdatedWorkspaceImageResult {
    @inline
    def apply(
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
    ): CreateUpdatedWorkspaceImageResult = {
      val __obj = js.Dynamic.literal()
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUpdatedWorkspaceImageResult]
    }
  }

  @js.native
  trait CreateWorkspaceBundleRequest extends js.Object {
    var BundleDescription: WorkspaceBundleDescription
    var BundleName: WorkspaceBundleName
    var ComputeType: ComputeType
    var ImageId: WorkspaceImageId
    var UserStorage: UserStorage
    var RootStorage: js.UndefOr[RootStorage]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWorkspaceBundleRequest {
    @inline
    def apply(
        BundleDescription: WorkspaceBundleDescription,
        BundleName: WorkspaceBundleName,
        ComputeType: ComputeType,
        ImageId: WorkspaceImageId,
        UserStorage: UserStorage,
        RootStorage: js.UndefOr[RootStorage] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWorkspaceBundleRequest = {
      val __obj = js.Dynamic.literal(
        "BundleDescription" -> BundleDescription.asInstanceOf[js.Any],
        "BundleName" -> BundleName.asInstanceOf[js.Any],
        "ComputeType" -> ComputeType.asInstanceOf[js.Any],
        "ImageId" -> ImageId.asInstanceOf[js.Any],
        "UserStorage" -> UserStorage.asInstanceOf[js.Any]
      )

      RootStorage.foreach(__v => __obj.updateDynamic("RootStorage")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkspaceBundleRequest]
    }
  }

  @js.native
  trait CreateWorkspaceBundleResult extends js.Object {
    var WorkspaceBundle: js.UndefOr[WorkspaceBundle]
  }

  object CreateWorkspaceBundleResult {
    @inline
    def apply(
        WorkspaceBundle: js.UndefOr[WorkspaceBundle] = js.undefined
    ): CreateWorkspaceBundleResult = {
      val __obj = js.Dynamic.literal()
      WorkspaceBundle.foreach(__v => __obj.updateDynamic("WorkspaceBundle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkspaceBundleResult]
    }
  }

  @js.native
  trait CreateWorkspaceImageRequest extends js.Object {
    var Description: WorkspaceImageDescription
    var Name: WorkspaceImageName
    var WorkspaceId: WorkspaceId
    var Tags: js.UndefOr[TagList]
  }

  object CreateWorkspaceImageRequest {
    @inline
    def apply(
        Description: WorkspaceImageDescription,
        Name: WorkspaceImageName,
        WorkspaceId: WorkspaceId,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWorkspaceImageRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "WorkspaceId" -> WorkspaceId.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkspaceImageRequest]
    }
  }

  @js.native
  trait CreateWorkspaceImageResult extends js.Object {
    var Created: js.UndefOr[Timestamp]
    var Description: js.UndefOr[WorkspaceImageDescription]
    var ImageId: js.UndefOr[WorkspaceImageId]
    var Name: js.UndefOr[WorkspaceImageName]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var OwnerAccountId: js.UndefOr[AwsAccount]
    var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy]
    var State: js.UndefOr[WorkspaceImageState]
  }

  object CreateWorkspaceImageResult {
    @inline
    def apply(
        Created: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[WorkspaceImageDescription] = js.undefined,
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined,
        Name: js.UndefOr[WorkspaceImageName] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        OwnerAccountId: js.UndefOr[AwsAccount] = js.undefined,
        RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.undefined,
        State: js.UndefOr[WorkspaceImageState] = js.undefined
    ): CreateWorkspaceImageResult = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      RequiredTenancy.foreach(__v => __obj.updateDynamic("RequiredTenancy")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkspaceImageResult]
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

  /** Returns default client branding attributes that were imported. These attributes display on the client login screen. <important> Client branding attributes are public facing. Ensure that you don't include sensitive information. </important>
    */
  @js.native
  trait DefaultClientBrandingAttributes extends js.Object {
    var ForgotPasswordLink: js.UndefOr[ClientUrl]
    var LoginMessage: js.UndefOr[LoginMessage]
    var LogoUrl: js.UndefOr[ClientUrl]
    var SupportEmail: js.UndefOr[ClientEmail]
    var SupportLink: js.UndefOr[ClientUrl]
  }

  object DefaultClientBrandingAttributes {
    @inline
    def apply(
        ForgotPasswordLink: js.UndefOr[ClientUrl] = js.undefined,
        LoginMessage: js.UndefOr[LoginMessage] = js.undefined,
        LogoUrl: js.UndefOr[ClientUrl] = js.undefined,
        SupportEmail: js.UndefOr[ClientEmail] = js.undefined,
        SupportLink: js.UndefOr[ClientUrl] = js.undefined
    ): DefaultClientBrandingAttributes = {
      val __obj = js.Dynamic.literal()
      ForgotPasswordLink.foreach(__v => __obj.updateDynamic("ForgotPasswordLink")(__v.asInstanceOf[js.Any]))
      LoginMessage.foreach(__v => __obj.updateDynamic("LoginMessage")(__v.asInstanceOf[js.Any]))
      LogoUrl.foreach(__v => __obj.updateDynamic("LogoUrl")(__v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.updateDynamic("SupportEmail")(__v.asInstanceOf[js.Any]))
      SupportLink.foreach(__v => __obj.updateDynamic("SupportLink")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultClientBrandingAttributes]
    }
  }

  /** The default client branding attributes to be imported. These attributes display on the client login screen. <important> Client branding attributes are public facing. Ensure that you do not include sensitive information. </important>
    */
  @js.native
  trait DefaultImportClientBrandingAttributes extends js.Object {
    var ForgotPasswordLink: js.UndefOr[ClientUrl]
    var LoginMessage: js.UndefOr[LoginMessage]
    var Logo: js.UndefOr[DefaultLogo]
    var SupportEmail: js.UndefOr[ClientEmail]
    var SupportLink: js.UndefOr[ClientUrl]
  }

  object DefaultImportClientBrandingAttributes {
    @inline
    def apply(
        ForgotPasswordLink: js.UndefOr[ClientUrl] = js.undefined,
        LoginMessage: js.UndefOr[LoginMessage] = js.undefined,
        Logo: js.UndefOr[DefaultLogo] = js.undefined,
        SupportEmail: js.UndefOr[ClientEmail] = js.undefined,
        SupportLink: js.UndefOr[ClientUrl] = js.undefined
    ): DefaultImportClientBrandingAttributes = {
      val __obj = js.Dynamic.literal()
      ForgotPasswordLink.foreach(__v => __obj.updateDynamic("ForgotPasswordLink")(__v.asInstanceOf[js.Any]))
      LoginMessage.foreach(__v => __obj.updateDynamic("LoginMessage")(__v.asInstanceOf[js.Any]))
      Logo.foreach(__v => __obj.updateDynamic("Logo")(__v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.updateDynamic("SupportEmail")(__v.asInstanceOf[js.Any]))
      SupportLink.foreach(__v => __obj.updateDynamic("SupportLink")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultImportClientBrandingAttributes]
    }
  }

  /** Describes the default values that are used to create WorkSpaces. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html|Update Directory Details for Your WorkSpaces]].
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
      UserEnabledAsLocalAdministrator.foreach(__v => __obj.updateDynamic("UserEnabledAsLocalAdministrator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultWorkspaceCreationProperties]
    }
  }

  @js.native
  trait DeleteClientBrandingRequest extends js.Object {
    var Platforms: ClientDeviceTypeList
    var ResourceId: DirectoryId
  }

  object DeleteClientBrandingRequest {
    @inline
    def apply(
        Platforms: ClientDeviceTypeList,
        ResourceId: DirectoryId
    ): DeleteClientBrandingRequest = {
      val __obj = js.Dynamic.literal(
        "Platforms" -> Platforms.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteClientBrandingRequest]
    }
  }

  @js.native
  trait DeleteClientBrandingResult extends js.Object

  object DeleteClientBrandingResult {
    @inline
    def apply(): DeleteClientBrandingResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteClientBrandingResult]
    }
  }

  @js.native
  trait DeleteConnectClientAddInRequest extends js.Object {
    var AddInId: AmazonUuid
    var ResourceId: DirectoryId
  }

  object DeleteConnectClientAddInRequest {
    @inline
    def apply(
        AddInId: AmazonUuid,
        ResourceId: DirectoryId
    ): DeleteConnectClientAddInRequest = {
      val __obj = js.Dynamic.literal(
        "AddInId" -> AddInId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectClientAddInRequest]
    }
  }

  @js.native
  trait DeleteConnectClientAddInResult extends js.Object

  object DeleteConnectClientAddInResult {
    @inline
    def apply(): DeleteConnectClientAddInResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteConnectClientAddInResult]
    }
  }

  @js.native
  trait DeleteConnectionAliasRequest extends js.Object {
    var AliasId: ConnectionAliasId
  }

  object DeleteConnectionAliasRequest {
    @inline
    def apply(
        AliasId: ConnectionAliasId
    ): DeleteConnectionAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectionAliasRequest]
    }
  }

  @js.native
  trait DeleteConnectionAliasResult extends js.Object

  object DeleteConnectionAliasResult {
    @inline
    def apply(): DeleteConnectionAliasResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteConnectionAliasResult]
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
  trait DeleteIpGroupResult extends js.Object

  object DeleteIpGroupResult {
    @inline
    def apply(): DeleteIpGroupResult = {
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
  trait DeleteTagsResult extends js.Object

  object DeleteTagsResult {
    @inline
    def apply(): DeleteTagsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTagsResult]
    }
  }

  @js.native
  trait DeleteWorkspaceBundleRequest extends js.Object {
    var BundleId: js.UndefOr[BundleId]
  }

  object DeleteWorkspaceBundleRequest {
    @inline
    def apply(
        BundleId: js.UndefOr[BundleId] = js.undefined
    ): DeleteWorkspaceBundleRequest = {
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteWorkspaceBundleRequest]
    }
  }

  @js.native
  trait DeleteWorkspaceBundleResult extends js.Object

  object DeleteWorkspaceBundleResult {
    @inline
    def apply(): DeleteWorkspaceBundleResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWorkspaceBundleResult]
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
  trait DeleteWorkspaceImageResult extends js.Object

  object DeleteWorkspaceImageResult {
    @inline
    def apply(): DeleteWorkspaceImageResult = {
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
  trait DeregisterWorkspaceDirectoryResult extends js.Object

  object DeregisterWorkspaceDirectoryResult {
    @inline
    def apply(): DeregisterWorkspaceDirectoryResult = {
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
  trait DescribeAccountRequest extends js.Object

  object DescribeAccountRequest {
    @inline
    def apply(): DescribeAccountRequest = {
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
      DedicatedTenancyManagementCidrRange.foreach(__v => __obj.updateDynamic("DedicatedTenancyManagementCidrRange")(__v.asInstanceOf[js.Any]))
      DedicatedTenancySupport.foreach(__v => __obj.updateDynamic("DedicatedTenancySupport")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountResult]
    }
  }

  @js.native
  trait DescribeClientBrandingRequest extends js.Object {
    var ResourceId: DirectoryId
  }

  object DescribeClientBrandingRequest {
    @inline
    def apply(
        ResourceId: DirectoryId
    ): DescribeClientBrandingRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeClientBrandingRequest]
    }
  }

  @js.native
  trait DescribeClientBrandingResult extends js.Object {
    var DeviceTypeAndroid: js.UndefOr[DefaultClientBrandingAttributes]
    var DeviceTypeIos: js.UndefOr[IosClientBrandingAttributes]
    var DeviceTypeLinux: js.UndefOr[DefaultClientBrandingAttributes]
    var DeviceTypeOsx: js.UndefOr[DefaultClientBrandingAttributes]
    var DeviceTypeWeb: js.UndefOr[DefaultClientBrandingAttributes]
    var DeviceTypeWindows: js.UndefOr[DefaultClientBrandingAttributes]
  }

  object DescribeClientBrandingResult {
    @inline
    def apply(
        DeviceTypeAndroid: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined,
        DeviceTypeIos: js.UndefOr[IosClientBrandingAttributes] = js.undefined,
        DeviceTypeLinux: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined,
        DeviceTypeOsx: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined,
        DeviceTypeWeb: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined,
        DeviceTypeWindows: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined
    ): DescribeClientBrandingResult = {
      val __obj = js.Dynamic.literal()
      DeviceTypeAndroid.foreach(__v => __obj.updateDynamic("DeviceTypeAndroid")(__v.asInstanceOf[js.Any]))
      DeviceTypeIos.foreach(__v => __obj.updateDynamic("DeviceTypeIos")(__v.asInstanceOf[js.Any]))
      DeviceTypeLinux.foreach(__v => __obj.updateDynamic("DeviceTypeLinux")(__v.asInstanceOf[js.Any]))
      DeviceTypeOsx.foreach(__v => __obj.updateDynamic("DeviceTypeOsx")(__v.asInstanceOf[js.Any]))
      DeviceTypeWeb.foreach(__v => __obj.updateDynamic("DeviceTypeWeb")(__v.asInstanceOf[js.Any]))
      DeviceTypeWindows.foreach(__v => __obj.updateDynamic("DeviceTypeWindows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClientBrandingResult]
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
  trait DescribeConnectClientAddInsRequest extends js.Object {
    var ResourceId: DirectoryId
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeConnectClientAddInsRequest {
    @inline
    def apply(
        ResourceId: DirectoryId,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeConnectClientAddInsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectClientAddInsRequest]
    }
  }

  @js.native
  trait DescribeConnectClientAddInsResult extends js.Object {
    var AddIns: js.UndefOr[ConnectClientAddInList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeConnectClientAddInsResult {
    @inline
    def apply(
        AddIns: js.UndefOr[ConnectClientAddInList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeConnectClientAddInsResult = {
      val __obj = js.Dynamic.literal()
      AddIns.foreach(__v => __obj.updateDynamic("AddIns")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectClientAddInsResult]
    }
  }

  @js.native
  trait DescribeConnectionAliasPermissionsRequest extends js.Object {
    var AliasId: ConnectionAliasId
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeConnectionAliasPermissionsRequest {
    @inline
    def apply(
        AliasId: ConnectionAliasId,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeConnectionAliasPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionAliasPermissionsRequest]
    }
  }

  @js.native
  trait DescribeConnectionAliasPermissionsResult extends js.Object {
    var AliasId: js.UndefOr[ConnectionAliasId]
    var ConnectionAliasPermissions: js.UndefOr[ConnectionAliasPermissions]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeConnectionAliasPermissionsResult {
    @inline
    def apply(
        AliasId: js.UndefOr[ConnectionAliasId] = js.undefined,
        ConnectionAliasPermissions: js.UndefOr[ConnectionAliasPermissions] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeConnectionAliasPermissionsResult = {
      val __obj = js.Dynamic.literal()
      AliasId.foreach(__v => __obj.updateDynamic("AliasId")(__v.asInstanceOf[js.Any]))
      ConnectionAliasPermissions.foreach(__v => __obj.updateDynamic("ConnectionAliasPermissions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionAliasPermissionsResult]
    }
  }

  @js.native
  trait DescribeConnectionAliasesRequest extends js.Object {
    var AliasIds: js.UndefOr[ConnectionAliasIdList]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
    var ResourceId: js.UndefOr[NonEmptyString]
  }

  object DescribeConnectionAliasesRequest {
    @inline
    def apply(
        AliasIds: js.UndefOr[ConnectionAliasIdList] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceId: js.UndefOr[NonEmptyString] = js.undefined
    ): DescribeConnectionAliasesRequest = {
      val __obj = js.Dynamic.literal()
      AliasIds.foreach(__v => __obj.updateDynamic("AliasIds")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionAliasesRequest]
    }
  }

  @js.native
  trait DescribeConnectionAliasesResult extends js.Object {
    var ConnectionAliases: js.UndefOr[ConnectionAliasList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeConnectionAliasesResult {
    @inline
    def apply(
        ConnectionAliases: js.UndefOr[ConnectionAliasList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeConnectionAliasesResult = {
      val __obj = js.Dynamic.literal()
      ConnectionAliases.foreach(__v => __obj.updateDynamic("ConnectionAliases")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionAliasesResult]
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
  trait DescribeWorkspaceImagePermissionsRequest extends js.Object {
    var ImageId: WorkspaceImageId
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceImagePermissionsRequest {
    @inline
    def apply(
        ImageId: WorkspaceImageId,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceImagePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "ImageId" -> ImageId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspaceImagePermissionsRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceImagePermissionsResult extends js.Object {
    var ImageId: js.UndefOr[WorkspaceImageId]
    var ImagePermissions: js.UndefOr[ImagePermissions]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceImagePermissionsResult {
    @inline
    def apply(
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined,
        ImagePermissions: js.UndefOr[ImagePermissions] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceImagePermissionsResult = {
      val __obj = js.Dynamic.literal()
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      ImagePermissions.foreach(__v => __obj.updateDynamic("ImagePermissions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkspaceImagePermissionsResult]
    }
  }

  @js.native
  trait DescribeWorkspaceImagesRequest extends js.Object {
    var ImageIds: js.UndefOr[WorkspaceImageIdList]
    var ImageType: js.UndefOr[ImageType]
    var MaxResults: js.UndefOr[Limit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object DescribeWorkspaceImagesRequest {
    @inline
    def apply(
        ImageIds: js.UndefOr[WorkspaceImageIdList] = js.undefined,
        ImageType: js.UndefOr[ImageType] = js.undefined,
        MaxResults: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeWorkspaceImagesRequest = {
      val __obj = js.Dynamic.literal()
      ImageIds.foreach(__v => __obj.updateDynamic("ImageIds")(__v.asInstanceOf[js.Any]))
      ImageType.foreach(__v => __obj.updateDynamic("ImageType")(__v.asInstanceOf[js.Any]))
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
      WorkspacesConnectionStatus.foreach(__v => __obj.updateDynamic("WorkspacesConnectionStatus")(__v.asInstanceOf[js.Any]))
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
  trait DisassociateConnectionAliasRequest extends js.Object {
    var AliasId: ConnectionAliasId
  }

  object DisassociateConnectionAliasRequest {
    @inline
    def apply(
        AliasId: ConnectionAliasId
    ): DisassociateConnectionAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateConnectionAliasRequest]
    }
  }

  @js.native
  trait DisassociateConnectionAliasResult extends js.Object

  object DisassociateConnectionAliasResult {
    @inline
    def apply(): DisassociateConnectionAliasResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateConnectionAliasResult]
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
  trait DisassociateIpGroupsResult extends js.Object

  object DisassociateIpGroupsResult {
    @inline
    def apply(): DisassociateIpGroupsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateIpGroupsResult]
    }
  }

  /** Describes the Standby WorkSpace that could not be created.
    */
  @js.native
  trait FailedCreateStandbyWorkspacesRequest extends js.Object {
    var ErrorCode: js.UndefOr[WorkspaceErrorCode]
    var ErrorMessage: js.UndefOr[Description]
    var StandbyWorkspaceRequest: js.UndefOr[StandbyWorkspace]
  }

  object FailedCreateStandbyWorkspacesRequest {
    @inline
    def apply(
        ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        StandbyWorkspaceRequest: js.UndefOr[StandbyWorkspace] = js.undefined
    ): FailedCreateStandbyWorkspacesRequest = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      StandbyWorkspaceRequest.foreach(__v => __obj.updateDynamic("StandbyWorkspaceRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedCreateStandbyWorkspacesRequest]
    }
  }

  /** Describes a WorkSpace that cannot be created.
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

  /** Describes a WorkSpace that could not be rebooted. (<a>RebootWorkspaces</a>), rebuilt (<a>RebuildWorkspaces</a>), restored (<a>RestoreWorkspace</a>), terminated (<a>TerminateWorkspaces</a>), started (<a>StartWorkspaces</a>), or stopped (<a>StopWorkspaces</a>).
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

  /** Describes the Amazon Web Services accounts that have been granted permission to use a shared image. For more information about sharing images, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/share-custom-image.html| Share or Unshare a Custom WorkSpaces Image]].
    */
  @js.native
  trait ImagePermission extends js.Object {
    var SharedAccountId: js.UndefOr[AwsAccount]
  }

  object ImagePermission {
    @inline
    def apply(
        SharedAccountId: js.UndefOr[AwsAccount] = js.undefined
    ): ImagePermission = {
      val __obj = js.Dynamic.literal()
      SharedAccountId.foreach(__v => __obj.updateDynamic("SharedAccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImagePermission]
    }
  }

  @js.native
  trait ImportClientBrandingRequest extends js.Object {
    var ResourceId: DirectoryId
    var DeviceTypeAndroid: js.UndefOr[DefaultImportClientBrandingAttributes]
    var DeviceTypeIos: js.UndefOr[IosImportClientBrandingAttributes]
    var DeviceTypeLinux: js.UndefOr[DefaultImportClientBrandingAttributes]
    var DeviceTypeOsx: js.UndefOr[DefaultImportClientBrandingAttributes]
    var DeviceTypeWeb: js.UndefOr[DefaultImportClientBrandingAttributes]
    var DeviceTypeWindows: js.UndefOr[DefaultImportClientBrandingAttributes]
  }

  object ImportClientBrandingRequest {
    @inline
    def apply(
        ResourceId: DirectoryId,
        DeviceTypeAndroid: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined,
        DeviceTypeIos: js.UndefOr[IosImportClientBrandingAttributes] = js.undefined,
        DeviceTypeLinux: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined,
        DeviceTypeOsx: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined,
        DeviceTypeWeb: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined,
        DeviceTypeWindows: js.UndefOr[DefaultImportClientBrandingAttributes] = js.undefined
    ): ImportClientBrandingRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      DeviceTypeAndroid.foreach(__v => __obj.updateDynamic("DeviceTypeAndroid")(__v.asInstanceOf[js.Any]))
      DeviceTypeIos.foreach(__v => __obj.updateDynamic("DeviceTypeIos")(__v.asInstanceOf[js.Any]))
      DeviceTypeLinux.foreach(__v => __obj.updateDynamic("DeviceTypeLinux")(__v.asInstanceOf[js.Any]))
      DeviceTypeOsx.foreach(__v => __obj.updateDynamic("DeviceTypeOsx")(__v.asInstanceOf[js.Any]))
      DeviceTypeWeb.foreach(__v => __obj.updateDynamic("DeviceTypeWeb")(__v.asInstanceOf[js.Any]))
      DeviceTypeWindows.foreach(__v => __obj.updateDynamic("DeviceTypeWindows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportClientBrandingRequest]
    }
  }

  @js.native
  trait ImportClientBrandingResult extends js.Object {
    var DeviceTypeAndroid: js.UndefOr[DefaultClientBrandingAttributes]
    var DeviceTypeIos: js.UndefOr[IosClientBrandingAttributes]
    var DeviceTypeLinux: js.UndefOr[DefaultClientBrandingAttributes]
    var DeviceTypeOsx: js.UndefOr[DefaultClientBrandingAttributes]
    var DeviceTypeWeb: js.UndefOr[DefaultClientBrandingAttributes]
    var DeviceTypeWindows: js.UndefOr[DefaultClientBrandingAttributes]
  }

  object ImportClientBrandingResult {
    @inline
    def apply(
        DeviceTypeAndroid: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined,
        DeviceTypeIos: js.UndefOr[IosClientBrandingAttributes] = js.undefined,
        DeviceTypeLinux: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined,
        DeviceTypeOsx: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined,
        DeviceTypeWeb: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined,
        DeviceTypeWindows: js.UndefOr[DefaultClientBrandingAttributes] = js.undefined
    ): ImportClientBrandingResult = {
      val __obj = js.Dynamic.literal()
      DeviceTypeAndroid.foreach(__v => __obj.updateDynamic("DeviceTypeAndroid")(__v.asInstanceOf[js.Any]))
      DeviceTypeIos.foreach(__v => __obj.updateDynamic("DeviceTypeIos")(__v.asInstanceOf[js.Any]))
      DeviceTypeLinux.foreach(__v => __obj.updateDynamic("DeviceTypeLinux")(__v.asInstanceOf[js.Any]))
      DeviceTypeOsx.foreach(__v => __obj.updateDynamic("DeviceTypeOsx")(__v.asInstanceOf[js.Any]))
      DeviceTypeWeb.foreach(__v => __obj.updateDynamic("DeviceTypeWeb")(__v.asInstanceOf[js.Any]))
      DeviceTypeWindows.foreach(__v => __obj.updateDynamic("DeviceTypeWindows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportClientBrandingResult]
    }
  }

  @js.native
  trait ImportWorkspaceImageRequest extends js.Object {
    var Ec2ImageId: Ec2ImageId
    var ImageDescription: WorkspaceImageDescription
    var ImageName: WorkspaceImageName
    var IngestionProcess: WorkspaceImageIngestionProcess
    var Applications: js.UndefOr[ApplicationList]
    var Tags: js.UndefOr[TagList]
  }

  object ImportWorkspaceImageRequest {
    @inline
    def apply(
        Ec2ImageId: Ec2ImageId,
        ImageDescription: WorkspaceImageDescription,
        ImageName: WorkspaceImageName,
        IngestionProcess: WorkspaceImageIngestionProcess,
        Applications: js.UndefOr[ApplicationList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ImportWorkspaceImageRequest = {
      val __obj = js.Dynamic.literal(
        "Ec2ImageId" -> Ec2ImageId.asInstanceOf[js.Any],
        "ImageDescription" -> ImageDescription.asInstanceOf[js.Any],
        "ImageName" -> ImageName.asInstanceOf[js.Any],
        "IngestionProcess" -> IngestionProcess.asInstanceOf[js.Any]
      )

      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
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

  /** The client branding attributes for iOS device types. These attributes are displayed on the iOS client login screen only. <important> Client branding attributes are public facing. Ensure you do not include sensitive information. </important>
    */
  @js.native
  trait IosClientBrandingAttributes extends js.Object {
    var ForgotPasswordLink: js.UndefOr[ClientUrl]
    var LoginMessage: js.UndefOr[LoginMessage]
    var Logo2xUrl: js.UndefOr[ClientUrl]
    var Logo3xUrl: js.UndefOr[ClientUrl]
    var LogoUrl: js.UndefOr[ClientUrl]
    var SupportEmail: js.UndefOr[ClientEmail]
    var SupportLink: js.UndefOr[ClientUrl]
  }

  object IosClientBrandingAttributes {
    @inline
    def apply(
        ForgotPasswordLink: js.UndefOr[ClientUrl] = js.undefined,
        LoginMessage: js.UndefOr[LoginMessage] = js.undefined,
        Logo2xUrl: js.UndefOr[ClientUrl] = js.undefined,
        Logo3xUrl: js.UndefOr[ClientUrl] = js.undefined,
        LogoUrl: js.UndefOr[ClientUrl] = js.undefined,
        SupportEmail: js.UndefOr[ClientEmail] = js.undefined,
        SupportLink: js.UndefOr[ClientUrl] = js.undefined
    ): IosClientBrandingAttributes = {
      val __obj = js.Dynamic.literal()
      ForgotPasswordLink.foreach(__v => __obj.updateDynamic("ForgotPasswordLink")(__v.asInstanceOf[js.Any]))
      LoginMessage.foreach(__v => __obj.updateDynamic("LoginMessage")(__v.asInstanceOf[js.Any]))
      Logo2xUrl.foreach(__v => __obj.updateDynamic("Logo2xUrl")(__v.asInstanceOf[js.Any]))
      Logo3xUrl.foreach(__v => __obj.updateDynamic("Logo3xUrl")(__v.asInstanceOf[js.Any]))
      LogoUrl.foreach(__v => __obj.updateDynamic("LogoUrl")(__v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.updateDynamic("SupportEmail")(__v.asInstanceOf[js.Any]))
      SupportLink.foreach(__v => __obj.updateDynamic("SupportLink")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IosClientBrandingAttributes]
    }
  }

  /** The client branding attributes to import for iOS device types. These attributes are displayed on the iOS client login screen. <important> Client branding attributes are public facing. Ensure you do not include sensitive information. </important>
    */
  @js.native
  trait IosImportClientBrandingAttributes extends js.Object {
    var ForgotPasswordLink: js.UndefOr[ClientUrl]
    var LoginMessage: js.UndefOr[LoginMessage]
    var Logo: js.UndefOr[IosLogo]
    var Logo2x: js.UndefOr[Ios2XLogo]
    var Logo3x: js.UndefOr[Ios3XLogo]
    var SupportEmail: js.UndefOr[ClientEmail]
    var SupportLink: js.UndefOr[ClientUrl]
  }

  object IosImportClientBrandingAttributes {
    @inline
    def apply(
        ForgotPasswordLink: js.UndefOr[ClientUrl] = js.undefined,
        LoginMessage: js.UndefOr[LoginMessage] = js.undefined,
        Logo: js.UndefOr[IosLogo] = js.undefined,
        Logo2x: js.UndefOr[Ios2XLogo] = js.undefined,
        Logo3x: js.UndefOr[Ios3XLogo] = js.undefined,
        SupportEmail: js.UndefOr[ClientEmail] = js.undefined,
        SupportLink: js.UndefOr[ClientUrl] = js.undefined
    ): IosImportClientBrandingAttributes = {
      val __obj = js.Dynamic.literal()
      ForgotPasswordLink.foreach(__v => __obj.updateDynamic("ForgotPasswordLink")(__v.asInstanceOf[js.Any]))
      LoginMessage.foreach(__v => __obj.updateDynamic("LoginMessage")(__v.asInstanceOf[js.Any]))
      Logo.foreach(__v => __obj.updateDynamic("Logo")(__v.asInstanceOf[js.Any]))
      Logo2x.foreach(__v => __obj.updateDynamic("Logo2x")(__v.asInstanceOf[js.Any]))
      Logo3x.foreach(__v => __obj.updateDynamic("Logo3x")(__v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.updateDynamic("SupportEmail")(__v.asInstanceOf[js.Any]))
      SupportLink.foreach(__v => __obj.updateDynamic("SupportLink")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IosImportClientBrandingAttributes]
    }
  }

  /** Describes a rule for an IP access control group.
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

  /** Describes a WorkSpace modification.
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
      DedicatedTenancyManagementCidrRange.foreach(__v => __obj.updateDynamic("DedicatedTenancyManagementCidrRange")(__v.asInstanceOf[js.Any]))
      DedicatedTenancySupport.foreach(__v => __obj.updateDynamic("DedicatedTenancySupport")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyAccountRequest]
    }
  }

  @js.native
  trait ModifyAccountResult extends js.Object

  object ModifyAccountResult {
    @inline
    def apply(): ModifyAccountResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifyAccountResult]
    }
  }

  @js.native
  trait ModifyCertificateBasedAuthPropertiesRequest extends js.Object {
    var ResourceId: DirectoryId
    var CertificateBasedAuthProperties: js.UndefOr[CertificateBasedAuthProperties]
    var PropertiesToDelete: js.UndefOr[DeletableCertificateBasedAuthPropertiesList]
  }

  object ModifyCertificateBasedAuthPropertiesRequest {
    @inline
    def apply(
        ResourceId: DirectoryId,
        CertificateBasedAuthProperties: js.UndefOr[CertificateBasedAuthProperties] = js.undefined,
        PropertiesToDelete: js.UndefOr[DeletableCertificateBasedAuthPropertiesList] = js.undefined
    ): ModifyCertificateBasedAuthPropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      CertificateBasedAuthProperties.foreach(__v => __obj.updateDynamic("CertificateBasedAuthProperties")(__v.asInstanceOf[js.Any]))
      PropertiesToDelete.foreach(__v => __obj.updateDynamic("PropertiesToDelete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyCertificateBasedAuthPropertiesRequest]
    }
  }

  @js.native
  trait ModifyCertificateBasedAuthPropertiesResult extends js.Object

  object ModifyCertificateBasedAuthPropertiesResult {
    @inline
    def apply(): ModifyCertificateBasedAuthPropertiesResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifyCertificateBasedAuthPropertiesResult]
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
  trait ModifyClientPropertiesResult extends js.Object

  object ModifyClientPropertiesResult {
    @inline
    def apply(): ModifyClientPropertiesResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifyClientPropertiesResult]
    }
  }

  @js.native
  trait ModifySamlPropertiesRequest extends js.Object {
    var ResourceId: DirectoryId
    var PropertiesToDelete: js.UndefOr[DeletableSamlPropertiesList]
    var SamlProperties: js.UndefOr[SamlProperties]
  }

  object ModifySamlPropertiesRequest {
    @inline
    def apply(
        ResourceId: DirectoryId,
        PropertiesToDelete: js.UndefOr[DeletableSamlPropertiesList] = js.undefined,
        SamlProperties: js.UndefOr[SamlProperties] = js.undefined
    ): ModifySamlPropertiesRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      PropertiesToDelete.foreach(__v => __obj.updateDynamic("PropertiesToDelete")(__v.asInstanceOf[js.Any]))
      SamlProperties.foreach(__v => __obj.updateDynamic("SamlProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifySamlPropertiesRequest]
    }
  }

  @js.native
  trait ModifySamlPropertiesResult extends js.Object

  object ModifySamlPropertiesResult {
    @inline
    def apply(): ModifySamlPropertiesResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifySamlPropertiesResult]
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
  trait ModifySelfservicePermissionsResult extends js.Object

  object ModifySelfservicePermissionsResult {
    @inline
    def apply(): ModifySelfservicePermissionsResult = {
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
  trait ModifyWorkspaceAccessPropertiesResult extends js.Object

  object ModifyWorkspaceAccessPropertiesResult {
    @inline
    def apply(): ModifyWorkspaceAccessPropertiesResult = {
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
  trait ModifyWorkspaceCreationPropertiesResult extends js.Object

  object ModifyWorkspaceCreationPropertiesResult {
    @inline
    def apply(): ModifyWorkspaceCreationPropertiesResult = {
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
  trait ModifyWorkspacePropertiesResult extends js.Object

  object ModifyWorkspacePropertiesResult {
    @inline
    def apply(): ModifyWorkspacePropertiesResult = {
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
  trait ModifyWorkspaceStateResult extends js.Object

  object ModifyWorkspaceStateResult {
    @inline
    def apply(): ModifyWorkspaceStateResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifyWorkspaceStateResult]
    }
  }

  /** The operating system that the image is running.
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

  /** Information about the Standby WorkSpace.
    */
  @js.native
  trait PendingCreateStandbyWorkspacesRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var State: js.UndefOr[WorkspaceState]
    var UserName: js.UndefOr[UserName]
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object PendingCreateStandbyWorkspacesRequest {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        State: js.UndefOr[WorkspaceState] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined,
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): PendingCreateStandbyWorkspacesRequest = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      WorkspaceId.foreach(__v => __obj.updateDynamic("WorkspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingCreateStandbyWorkspacesRequest]
    }
  }

  /** Describes the information used to reboot a WorkSpace.
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

  /** Describes the information used to rebuild a WorkSpace.
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
  trait RegisterWorkspaceDirectoryResult extends js.Object

  object RegisterWorkspaceDirectoryResult {
    @inline
    def apply(): RegisterWorkspaceDirectoryResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterWorkspaceDirectoryResult]
    }
  }

  /** Describes the related WorkSpace. The related WorkSpace could be a Standby WorkSpace or Primary WorkSpace related to the specified WorkSpace.
    */
  @js.native
  trait RelatedWorkspaceProperties extends js.Object {
    var Region: js.UndefOr[Region]
    var State: js.UndefOr[WorkspaceState]
    var Type: js.UndefOr[StandbyWorkspaceRelationshipType]
    var WorkspaceId: js.UndefOr[WorkspaceId]
  }

  object RelatedWorkspaceProperties {
    @inline
    def apply(
        Region: js.UndefOr[Region] = js.undefined,
        State: js.UndefOr[WorkspaceState] = js.undefined,
        Type: js.UndefOr[StandbyWorkspaceRelationshipType] = js.undefined,
        WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    ): RelatedWorkspaceProperties = {
      val __obj = js.Dynamic.literal()
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      WorkspaceId.foreach(__v => __obj.updateDynamic("WorkspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelatedWorkspaceProperties]
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
  trait RestoreWorkspaceResult extends js.Object

  object RestoreWorkspaceResult {
    @inline
    def apply(): RestoreWorkspaceResult = {
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
  trait RevokeIpRulesResult extends js.Object

  object RevokeIpRulesResult {
    @inline
    def apply(): RevokeIpRulesResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevokeIpRulesResult]
    }
  }

  /** Describes the root volume for a WorkSpace bundle.
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

  /** Describes the enablement status, user access URL, and relay state parameter name that are used for configuring federation with an SAML 2.0 identity provider.
    */
  @js.native
  trait SamlProperties extends js.Object {
    var RelayStateParameterName: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[SamlStatusEnum]
    var UserAccessUrl: js.UndefOr[SamlUserAccessUrl]
  }

  object SamlProperties {
    @inline
    def apply(
        RelayStateParameterName: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[SamlStatusEnum] = js.undefined,
        UserAccessUrl: js.UndefOr[SamlUserAccessUrl] = js.undefined
    ): SamlProperties = {
      val __obj = js.Dynamic.literal()
      RelayStateParameterName.foreach(__v => __obj.updateDynamic("RelayStateParameterName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserAccessUrl.foreach(__v => __obj.updateDynamic("UserAccessUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamlProperties]
    }
  }

  /** Describes the self-service permissions for a directory. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/enable-user-self-service-workspace-management.html|Enable Self-Service WorkSpace Management Capabilities for Your Users]].
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

  /** Describes a snapshot.
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

  /** Describes a Standby WorkSpace.
    */
  @js.native
  trait StandbyWorkspace extends js.Object {
    var DirectoryId: DirectoryId
    var PrimaryWorkspaceId: WorkspaceId
    var Tags: js.UndefOr[TagList]
    var VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey]
  }

  object StandbyWorkspace {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        PrimaryWorkspaceId: WorkspaceId,
        Tags: js.UndefOr[TagList] = js.undefined,
        VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey] = js.undefined
    ): StandbyWorkspace = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "PrimaryWorkspaceId" -> PrimaryWorkspaceId.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VolumeEncryptionKey.foreach(__v => __obj.updateDynamic("VolumeEncryptionKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StandbyWorkspace]
    }
  }

  /** Information used to start a WorkSpace.
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

  /** Describes the information used to stop a WorkSpace.
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

  /** Describes a tag.
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

  /** Describes the information used to terminate a WorkSpace.
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
  trait UpdateConnectClientAddInRequest extends js.Object {
    var AddInId: AmazonUuid
    var ResourceId: DirectoryId
    var Name: js.UndefOr[AddInName]
    var URL: js.UndefOr[AddInUrl]
  }

  object UpdateConnectClientAddInRequest {
    @inline
    def apply(
        AddInId: AmazonUuid,
        ResourceId: DirectoryId,
        Name: js.UndefOr[AddInName] = js.undefined,
        URL: js.UndefOr[AddInUrl] = js.undefined
    ): UpdateConnectClientAddInRequest = {
      val __obj = js.Dynamic.literal(
        "AddInId" -> AddInId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      URL.foreach(__v => __obj.updateDynamic("URL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectClientAddInRequest]
    }
  }

  @js.native
  trait UpdateConnectClientAddInResult extends js.Object

  object UpdateConnectClientAddInResult {
    @inline
    def apply(): UpdateConnectClientAddInResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateConnectClientAddInResult]
    }
  }

  @js.native
  trait UpdateConnectionAliasPermissionRequest extends js.Object {
    var AliasId: ConnectionAliasId
    var ConnectionAliasPermission: ConnectionAliasPermission
  }

  object UpdateConnectionAliasPermissionRequest {
    @inline
    def apply(
        AliasId: ConnectionAliasId,
        ConnectionAliasPermission: ConnectionAliasPermission
    ): UpdateConnectionAliasPermissionRequest = {
      val __obj = js.Dynamic.literal(
        "AliasId" -> AliasId.asInstanceOf[js.Any],
        "ConnectionAliasPermission" -> ConnectionAliasPermission.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateConnectionAliasPermissionRequest]
    }
  }

  @js.native
  trait UpdateConnectionAliasPermissionResult extends js.Object

  object UpdateConnectionAliasPermissionResult {
    @inline
    def apply(): UpdateConnectionAliasPermissionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateConnectionAliasPermissionResult]
    }
  }

  /** Describes whether a WorkSpace image needs to be updated with the latest drivers and other components required by Amazon WorkSpaces.
    *
    * '''Note:'''Only Windows 10 WorkSpace images can be programmatically updated at this time.
    */
  @js.native
  trait UpdateResult extends js.Object {
    var Description: js.UndefOr[UpdateDescription]
    var UpdateAvailable: js.UndefOr[BooleanObject]
  }

  object UpdateResult {
    @inline
    def apply(
        Description: js.UndefOr[UpdateDescription] = js.undefined,
        UpdateAvailable: js.UndefOr[BooleanObject] = js.undefined
    ): UpdateResult = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      UpdateAvailable.foreach(__v => __obj.updateDynamic("UpdateAvailable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResult]
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
  trait UpdateRulesOfIpGroupResult extends js.Object

  object UpdateRulesOfIpGroupResult {
    @inline
    def apply(): UpdateRulesOfIpGroupResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateRulesOfIpGroupResult]
    }
  }

  @js.native
  trait UpdateWorkspaceBundleRequest extends js.Object {
    var BundleId: js.UndefOr[BundleId]
    var ImageId: js.UndefOr[WorkspaceImageId]
  }

  object UpdateWorkspaceBundleRequest {
    @inline
    def apply(
        BundleId: js.UndefOr[BundleId] = js.undefined,
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
    ): UpdateWorkspaceBundleRequest = {
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkspaceBundleRequest]
    }
  }

  @js.native
  trait UpdateWorkspaceBundleResult extends js.Object

  object UpdateWorkspaceBundleResult {
    @inline
    def apply(): UpdateWorkspaceBundleResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateWorkspaceBundleResult]
    }
  }

  @js.native
  trait UpdateWorkspaceImagePermissionRequest extends js.Object {
    var AllowCopyImage: BooleanObject
    var ImageId: WorkspaceImageId
    var SharedAccountId: AwsAccount
  }

  object UpdateWorkspaceImagePermissionRequest {
    @inline
    def apply(
        AllowCopyImage: BooleanObject,
        ImageId: WorkspaceImageId,
        SharedAccountId: AwsAccount
    ): UpdateWorkspaceImagePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "AllowCopyImage" -> AllowCopyImage.asInstanceOf[js.Any],
        "ImageId" -> ImageId.asInstanceOf[js.Any],
        "SharedAccountId" -> SharedAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateWorkspaceImagePermissionRequest]
    }
  }

  @js.native
  trait UpdateWorkspaceImagePermissionResult extends js.Object

  object UpdateWorkspaceImagePermissionResult {
    @inline
    def apply(): UpdateWorkspaceImagePermissionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateWorkspaceImagePermissionResult]
    }
  }

  /** Describes the user volume for a WorkSpace bundle.
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

  /** Describes a WorkSpace.
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
    var RelatedWorkspaces: js.UndefOr[RelatedWorkspaces]
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
        RelatedWorkspaces: js.UndefOr[RelatedWorkspaces] = js.undefined,
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
      RelatedWorkspaces.foreach(__v => __obj.updateDynamic("RelatedWorkspaces")(__v.asInstanceOf[js.Any]))
      RootVolumeEncryptionEnabled.foreach(__v => __obj.updateDynamic("RootVolumeEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      UserVolumeEncryptionEnabled.foreach(__v => __obj.updateDynamic("UserVolumeEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      VolumeEncryptionKey.foreach(__v => __obj.updateDynamic("VolumeEncryptionKey")(__v.asInstanceOf[js.Any]))
      WorkspaceId.foreach(__v => __obj.updateDynamic("WorkspaceId")(__v.asInstanceOf[js.Any]))
      WorkspaceProperties.foreach(__v => __obj.updateDynamic("WorkspaceProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workspace]
    }
  }

  /** The device types and operating systems that can be used to access a WorkSpace. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-network-requirements.html|Amazon WorkSpaces Client Network Requirements]].
    */
  @js.native
  trait WorkspaceAccessProperties extends js.Object {
    var DeviceTypeAndroid: js.UndefOr[AccessPropertyValue]
    var DeviceTypeChromeOs: js.UndefOr[AccessPropertyValue]
    var DeviceTypeIos: js.UndefOr[AccessPropertyValue]
    var DeviceTypeLinux: js.UndefOr[AccessPropertyValue]
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
        DeviceTypeLinux: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeOsx: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeWeb: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeWindows: js.UndefOr[AccessPropertyValue] = js.undefined,
        DeviceTypeZeroClient: js.UndefOr[AccessPropertyValue] = js.undefined
    ): WorkspaceAccessProperties = {
      val __obj = js.Dynamic.literal()
      DeviceTypeAndroid.foreach(__v => __obj.updateDynamic("DeviceTypeAndroid")(__v.asInstanceOf[js.Any]))
      DeviceTypeChromeOs.foreach(__v => __obj.updateDynamic("DeviceTypeChromeOs")(__v.asInstanceOf[js.Any]))
      DeviceTypeIos.foreach(__v => __obj.updateDynamic("DeviceTypeIos")(__v.asInstanceOf[js.Any]))
      DeviceTypeLinux.foreach(__v => __obj.updateDynamic("DeviceTypeLinux")(__v.asInstanceOf[js.Any]))
      DeviceTypeOsx.foreach(__v => __obj.updateDynamic("DeviceTypeOsx")(__v.asInstanceOf[js.Any]))
      DeviceTypeWeb.foreach(__v => __obj.updateDynamic("DeviceTypeWeb")(__v.asInstanceOf[js.Any]))
      DeviceTypeWindows.foreach(__v => __obj.updateDynamic("DeviceTypeWindows")(__v.asInstanceOf[js.Any]))
      DeviceTypeZeroClient.foreach(__v => __obj.updateDynamic("DeviceTypeZeroClient")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceAccessProperties]
    }
  }

  /** Describes a WorkSpace bundle.
    */
  @js.native
  trait WorkspaceBundle extends js.Object {
    var BundleId: js.UndefOr[BundleId]
    var BundleType: js.UndefOr[BundleType]
    var ComputeType: js.UndefOr[ComputeType]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var ImageId: js.UndefOr[WorkspaceImageId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NonEmptyString]
    var Owner: js.UndefOr[BundleOwner]
    var RootStorage: js.UndefOr[RootStorage]
    var State: js.UndefOr[WorkspaceBundleState]
    var UserStorage: js.UndefOr[UserStorage]
  }

  object WorkspaceBundle {
    @inline
    def apply(
        BundleId: js.UndefOr[BundleId] = js.undefined,
        BundleType: js.UndefOr[BundleType] = js.undefined,
        ComputeType: js.UndefOr[ComputeType] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Owner: js.UndefOr[BundleOwner] = js.undefined,
        RootStorage: js.UndefOr[RootStorage] = js.undefined,
        State: js.UndefOr[WorkspaceBundleState] = js.undefined,
        UserStorage: js.UndefOr[UserStorage] = js.undefined
    ): WorkspaceBundle = {
      val __obj = js.Dynamic.literal()
      BundleId.foreach(__v => __obj.updateDynamic("BundleId")(__v.asInstanceOf[js.Any]))
      BundleType.foreach(__v => __obj.updateDynamic("BundleType")(__v.asInstanceOf[js.Any]))
      ComputeType.foreach(__v => __obj.updateDynamic("ComputeType")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      RootStorage.foreach(__v => __obj.updateDynamic("RootStorage")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UserStorage.foreach(__v => __obj.updateDynamic("UserStorage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceBundle]
    }
  }

  /** Describes the connection status of a WorkSpace.
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
      ConnectionStateCheckTimestamp.foreach(__v => __obj.updateDynamic("ConnectionStateCheckTimestamp")(__v.asInstanceOf[js.Any]))
      LastKnownUserConnectionTimestamp.foreach(__v => __obj.updateDynamic("LastKnownUserConnectionTimestamp")(__v.asInstanceOf[js.Any]))
      WorkspaceId.foreach(__v => __obj.updateDynamic("WorkspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceConnectionStatus]
    }
  }

  /** Describes the default properties that are used for creating WorkSpaces. For more information, see [[https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html|Update Directory Details for Your WorkSpaces]].
    */
  @js.native
  trait WorkspaceCreationProperties extends js.Object {
    var CustomSecurityGroupId: js.UndefOr[SecurityGroupId]
    var DefaultOu: js.UndefOr[DefaultOu]
    var EnableInternetAccess: js.UndefOr[BooleanObject]
    var EnableMaintenanceMode: js.UndefOr[BooleanObject]
    var EnableWorkDocs: js.UndefOr[BooleanObject]
    var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject]
  }

  object WorkspaceCreationProperties {
    @inline
    def apply(
        CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
        DefaultOu: js.UndefOr[DefaultOu] = js.undefined,
        EnableInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
        EnableMaintenanceMode: js.UndefOr[BooleanObject] = js.undefined,
        EnableWorkDocs: js.UndefOr[BooleanObject] = js.undefined,
        UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.undefined
    ): WorkspaceCreationProperties = {
      val __obj = js.Dynamic.literal()
      CustomSecurityGroupId.foreach(__v => __obj.updateDynamic("CustomSecurityGroupId")(__v.asInstanceOf[js.Any]))
      DefaultOu.foreach(__v => __obj.updateDynamic("DefaultOu")(__v.asInstanceOf[js.Any]))
      EnableInternetAccess.foreach(__v => __obj.updateDynamic("EnableInternetAccess")(__v.asInstanceOf[js.Any]))
      EnableMaintenanceMode.foreach(__v => __obj.updateDynamic("EnableMaintenanceMode")(__v.asInstanceOf[js.Any]))
      EnableWorkDocs.foreach(__v => __obj.updateDynamic("EnableWorkDocs")(__v.asInstanceOf[js.Any]))
      UserEnabledAsLocalAdministrator.foreach(__v => __obj.updateDynamic("UserEnabledAsLocalAdministrator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceCreationProperties]
    }
  }

  /** Describes a directory that is used with Amazon WorkSpaces.
    */
  @js.native
  trait WorkspaceDirectory extends js.Object {
    var Alias: js.UndefOr[Alias]
    var CertificateBasedAuthProperties: js.UndefOr[CertificateBasedAuthProperties]
    var CustomerUserName: js.UndefOr[UserName]
    var DirectoryId: js.UndefOr[DirectoryId]
    var DirectoryName: js.UndefOr[DirectoryName]
    var DirectoryType: js.UndefOr[WorkspaceDirectoryType]
    var DnsIpAddresses: js.UndefOr[DnsIpAddresses]
    var IamRoleId: js.UndefOr[ARN]
    var RegistrationCode: js.UndefOr[RegistrationCode]
    var SamlProperties: js.UndefOr[SamlProperties]
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
        CertificateBasedAuthProperties: js.UndefOr[CertificateBasedAuthProperties] = js.undefined,
        CustomerUserName: js.UndefOr[UserName] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        DirectoryName: js.UndefOr[DirectoryName] = js.undefined,
        DirectoryType: js.UndefOr[WorkspaceDirectoryType] = js.undefined,
        DnsIpAddresses: js.UndefOr[DnsIpAddresses] = js.undefined,
        IamRoleId: js.UndefOr[ARN] = js.undefined,
        RegistrationCode: js.UndefOr[RegistrationCode] = js.undefined,
        SamlProperties: js.UndefOr[SamlProperties] = js.undefined,
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
      CertificateBasedAuthProperties.foreach(__v => __obj.updateDynamic("CertificateBasedAuthProperties")(__v.asInstanceOf[js.Any]))
      CustomerUserName.foreach(__v => __obj.updateDynamic("CustomerUserName")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      DirectoryName.foreach(__v => __obj.updateDynamic("DirectoryName")(__v.asInstanceOf[js.Any]))
      DirectoryType.foreach(__v => __obj.updateDynamic("DirectoryType")(__v.asInstanceOf[js.Any]))
      DnsIpAddresses.foreach(__v => __obj.updateDynamic("DnsIpAddresses")(__v.asInstanceOf[js.Any]))
      IamRoleId.foreach(__v => __obj.updateDynamic("IamRoleId")(__v.asInstanceOf[js.Any]))
      RegistrationCode.foreach(__v => __obj.updateDynamic("RegistrationCode")(__v.asInstanceOf[js.Any]))
      SamlProperties.foreach(__v => __obj.updateDynamic("SamlProperties")(__v.asInstanceOf[js.Any]))
      SelfservicePermissions.foreach(__v => __obj.updateDynamic("SelfservicePermissions")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tenancy.foreach(__v => __obj.updateDynamic("Tenancy")(__v.asInstanceOf[js.Any]))
      WorkspaceAccessProperties.foreach(__v => __obj.updateDynamic("WorkspaceAccessProperties")(__v.asInstanceOf[js.Any]))
      WorkspaceCreationProperties.foreach(__v => __obj.updateDynamic("WorkspaceCreationProperties")(__v.asInstanceOf[js.Any]))
      WorkspaceSecurityGroupId.foreach(__v => __obj.updateDynamic("WorkspaceSecurityGroupId")(__v.asInstanceOf[js.Any]))
      ipGroupIds.foreach(__v => __obj.updateDynamic("ipGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceDirectory]
    }
  }

  /** Describes a WorkSpace image.
    */
  @js.native
  trait WorkspaceImage extends js.Object {
    var Created: js.UndefOr[Timestamp]
    var Description: js.UndefOr[WorkspaceImageDescription]
    var ErrorCode: js.UndefOr[WorkspaceImageErrorCode]
    var ErrorMessage: js.UndefOr[Description]
    var ImageId: js.UndefOr[WorkspaceImageId]
    var Name: js.UndefOr[WorkspaceImageName]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var OwnerAccountId: js.UndefOr[AwsAccount]
    var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy]
    var State: js.UndefOr[WorkspaceImageState]
    var Updates: js.UndefOr[UpdateResult]
  }

  object WorkspaceImage {
    @inline
    def apply(
        Created: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[WorkspaceImageDescription] = js.undefined,
        ErrorCode: js.UndefOr[WorkspaceImageErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[Description] = js.undefined,
        ImageId: js.UndefOr[WorkspaceImageId] = js.undefined,
        Name: js.UndefOr[WorkspaceImageName] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        OwnerAccountId: js.UndefOr[AwsAccount] = js.undefined,
        RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.undefined,
        State: js.UndefOr[WorkspaceImageState] = js.undefined,
        Updates: js.UndefOr[UpdateResult] = js.undefined
    ): WorkspaceImage = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      RequiredTenancy.foreach(__v => __obj.updateDynamic("RequiredTenancy")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Updates.foreach(__v => __obj.updateDynamic("Updates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceImage]
    }
  }

  /** Describes a WorkSpace.
    */
  @js.native
  trait WorkspaceProperties extends js.Object {
    var ComputeTypeName: js.UndefOr[Compute]
    var Protocols: js.UndefOr[ProtocolList]
    var RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib]
    var RunningMode: js.UndefOr[RunningMode]
    var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes]
    var UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib]
  }

  object WorkspaceProperties {
    @inline
    def apply(
        ComputeTypeName: js.UndefOr[Compute] = js.undefined,
        Protocols: js.UndefOr[ProtocolList] = js.undefined,
        RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib] = js.undefined,
        RunningMode: js.UndefOr[RunningMode] = js.undefined,
        RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes] = js.undefined,
        UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib] = js.undefined
    ): WorkspaceProperties = {
      val __obj = js.Dynamic.literal()
      ComputeTypeName.foreach(__v => __obj.updateDynamic("ComputeTypeName")(__v.asInstanceOf[js.Any]))
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      RootVolumeSizeGib.foreach(__v => __obj.updateDynamic("RootVolumeSizeGib")(__v.asInstanceOf[js.Any]))
      RunningMode.foreach(__v => __obj.updateDynamic("RunningMode")(__v.asInstanceOf[js.Any]))
      RunningModeAutoStopTimeoutInMinutes.foreach(__v => __obj.updateDynamic("RunningModeAutoStopTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      UserVolumeSizeGib.foreach(__v => __obj.updateDynamic("UserVolumeSizeGib")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceProperties]
    }
  }

  /** Describes the information used to create a WorkSpace.
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

      RootVolumeEncryptionEnabled.foreach(__v => __obj.updateDynamic("RootVolumeEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserVolumeEncryptionEnabled.foreach(__v => __obj.updateDynamic("UserVolumeEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      VolumeEncryptionKey.foreach(__v => __obj.updateDynamic("VolumeEncryptionKey")(__v.asInstanceOf[js.Any]))
      WorkspaceProperties.foreach(__v => __obj.updateDynamic("WorkspaceProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceRequest]
    }
  }

  /** Describes an IP access control group.
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
