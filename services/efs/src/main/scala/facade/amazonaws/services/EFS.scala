package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object efs {
  type AccessPointArn                 = String
  type AccessPointDescriptions        = js.Array[AccessPointDescription]
  type AccessPointId                  = String
  type AvailabilityZoneId             = String
  type AvailabilityZoneName           = String
  type AwsAccountId                   = String
  type BypassPolicyLockoutSafetyCheck = Boolean
  type ClientToken                    = String
  type CreationToken                  = String
  type Encrypted                      = Boolean
  type FileSystemArn                  = String
  type FileSystemDescriptions         = js.Array[FileSystemDescription]
  type FileSystemId                   = String
  type FileSystemNullableSizeValue    = Double
  type FileSystemSizeValue            = Double
  type Gid                            = Double
  type IpAddress                      = String
  type KmsKeyId                       = String
  type LifecyclePolicies              = js.Array[LifecyclePolicy]
  type Marker                         = String
  type MaxItems                       = Int
  type MaxResults                     = Int
  type MountTargetCount               = Int
  type MountTargetDescriptions        = js.Array[MountTargetDescription]
  type MountTargetId                  = String
  type Name                           = String
  type NetworkInterfaceId             = String
  type OwnerGid                       = Double
  type OwnerUid                       = Double
  type Path                           = String
  type Permissions                    = String
  type Policy                         = String
  type ProvisionedThroughputInMibps   = Double
  type ResourceId                     = String
  type SecondaryGids                  = js.Array[Gid]
  type SecurityGroup                  = String
  type SecurityGroups                 = js.Array[SecurityGroup]
  type SubnetId                       = String
  type TagKey                         = String
  type TagKeys                        = js.Array[TagKey]
  type TagValue                       = String
  type Tags                           = js.Array[Tag]
  type Timestamp                      = js.Date
  type Token                          = String
  type Uid                            = Double
  type VpcId                          = String

  implicit final class EFSOps(private val service: EFS) extends AnyVal {

    @inline def createAccessPointFuture(params: CreateAccessPointRequest): Future[AccessPointDescription] =
      service.createAccessPoint(params).promise().toFuture
    @inline def createFileSystemFuture(params: CreateFileSystemRequest): Future[FileSystemDescription] =
      service.createFileSystem(params).promise().toFuture
    @inline def createMountTargetFuture(params: CreateMountTargetRequest): Future[MountTargetDescription] =
      service.createMountTarget(params).promise().toFuture
    @inline def deleteAccessPointFuture(params: DeleteAccessPointRequest): Future[js.Object] =
      service.deleteAccessPoint(params).promise().toFuture
    @inline def deleteFileSystemFuture(params: DeleteFileSystemRequest): Future[js.Object] =
      service.deleteFileSystem(params).promise().toFuture
    @inline def deleteFileSystemPolicyFuture(params: DeleteFileSystemPolicyRequest): Future[js.Object] =
      service.deleteFileSystemPolicy(params).promise().toFuture
    @inline def deleteMountTargetFuture(params: DeleteMountTargetRequest): Future[js.Object] =
      service.deleteMountTarget(params).promise().toFuture
    @inline def describeAccessPointsFuture(params: DescribeAccessPointsRequest): Future[DescribeAccessPointsResponse] =
      service.describeAccessPoints(params).promise().toFuture
    @inline def describeBackupPolicyFuture(params: DescribeBackupPolicyRequest): Future[BackupPolicyDescription] =
      service.describeBackupPolicy(params).promise().toFuture
    @inline def describeFileSystemPolicyFuture(
        params: DescribeFileSystemPolicyRequest
    ): Future[FileSystemPolicyDescription] = service.describeFileSystemPolicy(params).promise().toFuture
    @inline def describeFileSystemsFuture(params: DescribeFileSystemsRequest): Future[DescribeFileSystemsResponse] =
      service.describeFileSystems(params).promise().toFuture
    @inline def describeLifecycleConfigurationFuture(
        params: DescribeLifecycleConfigurationRequest
    ): Future[LifecycleConfigurationDescription] = service.describeLifecycleConfiguration(params).promise().toFuture
    @inline def describeMountTargetSecurityGroupsFuture(
        params: DescribeMountTargetSecurityGroupsRequest
    ): Future[DescribeMountTargetSecurityGroupsResponse] =
      service.describeMountTargetSecurityGroups(params).promise().toFuture
    @inline def describeMountTargetsFuture(params: DescribeMountTargetsRequest): Future[DescribeMountTargetsResponse] =
      service.describeMountTargets(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def modifyMountTargetSecurityGroupsFuture(
        params: ModifyMountTargetSecurityGroupsRequest
    ): Future[js.Object] = service.modifyMountTargetSecurityGroups(params).promise().toFuture
    @inline def putBackupPolicyFuture(params: PutBackupPolicyRequest): Future[BackupPolicyDescription] =
      service.putBackupPolicy(params).promise().toFuture
    @inline def putFileSystemPolicyFuture(params: PutFileSystemPolicyRequest): Future[FileSystemPolicyDescription] =
      service.putFileSystemPolicy(params).promise().toFuture
    @inline def putLifecycleConfigurationFuture(
        params: PutLifecycleConfigurationRequest
    ): Future[LifecycleConfigurationDescription] = service.putLifecycleConfiguration(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateFileSystemFuture(params: UpdateFileSystemRequest): Future[FileSystemDescription] =
      service.updateFileSystem(params).promise().toFuture
  }
}

package efs {
  @js.native
  @JSImport("aws-sdk", "EFS")
  class EFS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAccessPoint(params: CreateAccessPointRequest): Request[AccessPointDescription]             = js.native
    def createFileSystem(params: CreateFileSystemRequest): Request[FileSystemDescription]                = js.native
    def createMountTarget(params: CreateMountTargetRequest): Request[MountTargetDescription]             = js.native
    def deleteAccessPoint(params: DeleteAccessPointRequest): Request[js.Object]                          = js.native
    def deleteFileSystem(params: DeleteFileSystemRequest): Request[js.Object]                            = js.native
    def deleteFileSystemPolicy(params: DeleteFileSystemPolicyRequest): Request[js.Object]                = js.native
    def deleteMountTarget(params: DeleteMountTargetRequest): Request[js.Object]                          = js.native
    def describeAccessPoints(params: DescribeAccessPointsRequest): Request[DescribeAccessPointsResponse] = js.native
    def describeBackupPolicy(params: DescribeBackupPolicyRequest): Request[BackupPolicyDescription]      = js.native
    def describeFileSystemPolicy(params: DescribeFileSystemPolicyRequest): Request[FileSystemPolicyDescription] =
      js.native
    def describeFileSystems(params: DescribeFileSystemsRequest): Request[DescribeFileSystemsResponse] = js.native
    def describeLifecycleConfiguration(
        params: DescribeLifecycleConfigurationRequest
    ): Request[LifecycleConfigurationDescription] = js.native
    def describeMountTargetSecurityGroups(
        params: DescribeMountTargetSecurityGroupsRequest
    ): Request[DescribeMountTargetSecurityGroupsResponse]                                                   = js.native
    def describeMountTargets(params: DescribeMountTargetsRequest): Request[DescribeMountTargetsResponse]    = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def modifyMountTargetSecurityGroups(params: ModifyMountTargetSecurityGroupsRequest): Request[js.Object] = js.native
    def putBackupPolicy(params: PutBackupPolicyRequest): Request[BackupPolicyDescription]                   = js.native
    def putFileSystemPolicy(params: PutFileSystemPolicyRequest): Request[FileSystemPolicyDescription]       = js.native
    def putLifecycleConfiguration(
        params: PutLifecycleConfigurationRequest
    ): Request[LifecycleConfigurationDescription]                                         = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                       = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                   = js.native
    def updateFileSystem(params: UpdateFileSystemRequest): Request[FileSystemDescription] = js.native
    @deprecated("Use ListTagsForResource.", "forever") def describeTags(
        params: DescribeTagsRequest
    ): Request[DescribeTagsResponse]                                                                         = js.native
    @deprecated("Use TagResource.", "forever") def createTags(params: CreateTagsRequest): Request[js.Object] = js.native
    @deprecated("Use UntagResource.", "forever") def deleteTags(params: DeleteTagsRequest): Request[js.Object] =
      js.native
  }

  /**
    * Provides a description of an EFS file system access point.
    */
  @js.native
  trait AccessPointDescription extends js.Object {
    var AccessPointArn: js.UndefOr[AccessPointArn]
    var AccessPointId: js.UndefOr[AccessPointId]
    var ClientToken: js.UndefOr[ClientToken]
    var FileSystemId: js.UndefOr[FileSystemId]
    var LifeCycleState: js.UndefOr[LifeCycleState]
    var Name: js.UndefOr[Name]
    var OwnerId: js.UndefOr[AwsAccountId]
    var PosixUser: js.UndefOr[PosixUser]
    var RootDirectory: js.UndefOr[RootDirectory]
    var Tags: js.UndefOr[Tags]
  }

  object AccessPointDescription {
    @inline
    def apply(
        AccessPointArn: js.UndefOr[AccessPointArn] = js.undefined,
        AccessPointId: js.UndefOr[AccessPointId] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        LifeCycleState: js.UndefOr[LifeCycleState] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        OwnerId: js.UndefOr[AwsAccountId] = js.undefined,
        PosixUser: js.UndefOr[PosixUser] = js.undefined,
        RootDirectory: js.UndefOr[RootDirectory] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): AccessPointDescription = {
      val __obj = js.Dynamic.literal()
      AccessPointArn.foreach(__v => __obj.updateDynamic("AccessPointArn")(__v.asInstanceOf[js.Any]))
      AccessPointId.foreach(__v => __obj.updateDynamic("AccessPointId")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      LifeCycleState.foreach(__v => __obj.updateDynamic("LifeCycleState")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      PosixUser.foreach(__v => __obj.updateDynamic("PosixUser")(__v.asInstanceOf[js.Any]))
      RootDirectory.foreach(__v => __obj.updateDynamic("RootDirectory")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessPointDescription]
    }
  }

  /**
    * The backup policy for the file system, showing the curent status. If <code>ENABLED</code>, the file system is being backed up.
    */
  @js.native
  trait BackupPolicy extends js.Object {
    var Status: Status
  }

  object BackupPolicy {
    @inline
    def apply(
        Status: Status
    ): BackupPolicy = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BackupPolicy]
    }
  }

  @js.native
  trait BackupPolicyDescription extends js.Object {
    var BackupPolicy: js.UndefOr[BackupPolicy]
  }

  object BackupPolicyDescription {
    @inline
    def apply(
        BackupPolicy: js.UndefOr[BackupPolicy] = js.undefined
    ): BackupPolicyDescription = {
      val __obj = js.Dynamic.literal()
      BackupPolicy.foreach(__v => __obj.updateDynamic("BackupPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupPolicyDescription]
    }
  }

  @js.native
  trait CreateAccessPointRequest extends js.Object {
    var ClientToken: ClientToken
    var FileSystemId: FileSystemId
    var PosixUser: js.UndefOr[PosixUser]
    var RootDirectory: js.UndefOr[RootDirectory]
    var Tags: js.UndefOr[Tags]
  }

  object CreateAccessPointRequest {
    @inline
    def apply(
        ClientToken: ClientToken,
        FileSystemId: FileSystemId,
        PosixUser: js.UndefOr[PosixUser] = js.undefined,
        RootDirectory: js.UndefOr[RootDirectory] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateAccessPointRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken"  -> ClientToken.asInstanceOf[js.Any],
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      PosixUser.foreach(__v => __obj.updateDynamic("PosixUser")(__v.asInstanceOf[js.Any]))
      RootDirectory.foreach(__v => __obj.updateDynamic("RootDirectory")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessPointRequest]
    }
  }

  @js.native
  trait CreateFileSystemRequest extends js.Object {
    var CreationToken: CreationToken
    var Encrypted: js.UndefOr[Encrypted]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var PerformanceMode: js.UndefOr[PerformanceMode]
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var Tags: js.UndefOr[Tags]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }

  object CreateFileSystemRequest {
    @inline
    def apply(
        CreationToken: CreationToken,
        Encrypted: js.UndefOr[Encrypted] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        PerformanceMode: js.UndefOr[PerformanceMode] = js.undefined,
        ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined
    ): CreateFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "CreationToken" -> CreationToken.asInstanceOf[js.Any]
      )

      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      PerformanceMode.foreach(__v => __obj.updateDynamic("PerformanceMode")(__v.asInstanceOf[js.Any]))
      ProvisionedThroughputInMibps.foreach(__v =>
        __obj.updateDynamic("ProvisionedThroughputInMibps")(__v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      ThroughputMode.foreach(__v => __obj.updateDynamic("ThroughputMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateMountTargetRequest extends js.Object {
    var FileSystemId: FileSystemId
    var SubnetId: SubnetId
    var IpAddress: js.UndefOr[IpAddress]
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  object CreateMountTargetRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        SubnetId: SubnetId,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    ): CreateMountTargetRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "SubnetId"     -> SubnetId.asInstanceOf[js.Any]
      )

      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMountTargetRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CreateTagsRequest extends js.Object {
    var FileSystemId: FileSystemId
    var Tags: Tags
  }

  object CreateTagsRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        Tags: Tags
    ): CreateTagsRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTagsRequest]
    }
  }

  /**
    * Required if the <code>RootDirectory</code> &gt; <code>Path</code> specified does not exist. Specifies the POSIX IDs and permissions to apply to the access point's <code>RootDirectory</code> &gt; <code>Path</code>. If the access point root directory does not exist, EFS creates it with these settings when a client connects to the access point. When specifying <code>CreationInfo</code>, you must include values for all properties.
    *  <important> If you do not provide <code>CreationInfo</code> and the specified <code>RootDirectory</code> does not exist, attempts to mount the file system using the access point will fail.
    *  </important>
    */
  @js.native
  trait CreationInfo extends js.Object {
    var OwnerGid: OwnerGid
    var OwnerUid: OwnerUid
    var Permissions: Permissions
  }

  object CreationInfo {
    @inline
    def apply(
        OwnerGid: OwnerGid,
        OwnerUid: OwnerUid,
        Permissions: Permissions
    ): CreationInfo = {
      val __obj = js.Dynamic.literal(
        "OwnerGid"    -> OwnerGid.asInstanceOf[js.Any],
        "OwnerUid"    -> OwnerUid.asInstanceOf[js.Any],
        "Permissions" -> Permissions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreationInfo]
    }
  }

  @js.native
  trait DeleteAccessPointRequest extends js.Object {
    var AccessPointId: AccessPointId
  }

  object DeleteAccessPointRequest {
    @inline
    def apply(
        AccessPointId: AccessPointId
    ): DeleteAccessPointRequest = {
      val __obj = js.Dynamic.literal(
        "AccessPointId" -> AccessPointId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAccessPointRequest]
    }
  }

  @js.native
  trait DeleteFileSystemPolicyRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  object DeleteFileSystemPolicyRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId
    ): DeleteFileSystemPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFileSystemPolicyRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  object DeleteFileSystemRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId
    ): DeleteFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFileSystemRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteMountTargetRequest extends js.Object {
    var MountTargetId: MountTargetId
  }

  object DeleteMountTargetRequest {
    @inline
    def apply(
        MountTargetId: MountTargetId
    ): DeleteMountTargetRequest = {
      val __obj = js.Dynamic.literal(
        "MountTargetId" -> MountTargetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMountTargetRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DeleteTagsRequest extends js.Object {
    var FileSystemId: FileSystemId
    var TagKeys: TagKeys
  }

  object DeleteTagsRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        TagKeys: TagKeys
    ): DeleteTagsRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagsRequest]
    }
  }

  @js.native
  trait DescribeAccessPointsRequest extends js.Object {
    var AccessPointId: js.UndefOr[AccessPointId]
    var FileSystemId: js.UndefOr[FileSystemId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeAccessPointsRequest {
    @inline
    def apply(
        AccessPointId: js.UndefOr[AccessPointId] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeAccessPointsRequest = {
      val __obj = js.Dynamic.literal()
      AccessPointId.foreach(__v => __obj.updateDynamic("AccessPointId")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccessPointsRequest]
    }
  }

  @js.native
  trait DescribeAccessPointsResponse extends js.Object {
    var AccessPoints: js.UndefOr[AccessPointDescriptions]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeAccessPointsResponse {
    @inline
    def apply(
        AccessPoints: js.UndefOr[AccessPointDescriptions] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeAccessPointsResponse = {
      val __obj = js.Dynamic.literal()
      AccessPoints.foreach(__v => __obj.updateDynamic("AccessPoints")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccessPointsResponse]
    }
  }

  @js.native
  trait DescribeBackupPolicyRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  object DescribeBackupPolicyRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId
    ): DescribeBackupPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeBackupPolicyRequest]
    }
  }

  @js.native
  trait DescribeFileSystemPolicyRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  object DescribeFileSystemPolicyRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId
    ): DescribeFileSystemPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeFileSystemPolicyRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeFileSystemsRequest extends js.Object {
    var CreationToken: js.UndefOr[CreationToken]
    var FileSystemId: js.UndefOr[FileSystemId]
    var Marker: js.UndefOr[Marker]
    var MaxItems: js.UndefOr[MaxItems]
  }

  object DescribeFileSystemsRequest {
    @inline
    def apply(
        CreationToken: js.UndefOr[CreationToken] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxItems: js.UndefOr[MaxItems] = js.undefined
    ): DescribeFileSystemsRequest = {
      val __obj = js.Dynamic.literal()
      CreationToken.foreach(__v => __obj.updateDynamic("CreationToken")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFileSystemsRequest]
    }
  }

  @js.native
  trait DescribeFileSystemsResponse extends js.Object {
    var FileSystems: js.UndefOr[FileSystemDescriptions]
    var Marker: js.UndefOr[Marker]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeFileSystemsResponse {
    @inline
    def apply(
        FileSystems: js.UndefOr[FileSystemDescriptions] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeFileSystemsResponse = {
      val __obj = js.Dynamic.literal()
      FileSystems.foreach(__v => __obj.updateDynamic("FileSystems")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFileSystemsResponse]
    }
  }

  @js.native
  trait DescribeLifecycleConfigurationRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  object DescribeLifecycleConfigurationRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId
    ): DescribeLifecycleConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeLifecycleConfigurationRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeMountTargetSecurityGroupsRequest extends js.Object {
    var MountTargetId: MountTargetId
  }

  object DescribeMountTargetSecurityGroupsRequest {
    @inline
    def apply(
        MountTargetId: MountTargetId
    ): DescribeMountTargetSecurityGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "MountTargetId" -> MountTargetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeMountTargetSecurityGroupsRequest]
    }
  }

  @js.native
  trait DescribeMountTargetSecurityGroupsResponse extends js.Object {
    var SecurityGroups: SecurityGroups
  }

  object DescribeMountTargetSecurityGroupsResponse {
    @inline
    def apply(
        SecurityGroups: SecurityGroups
    ): DescribeMountTargetSecurityGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "SecurityGroups" -> SecurityGroups.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeMountTargetSecurityGroupsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeMountTargetsRequest extends js.Object {
    var AccessPointId: js.UndefOr[AccessPointId]
    var FileSystemId: js.UndefOr[FileSystemId]
    var Marker: js.UndefOr[Marker]
    var MaxItems: js.UndefOr[MaxItems]
    var MountTargetId: js.UndefOr[MountTargetId]
  }

  object DescribeMountTargetsRequest {
    @inline
    def apply(
        AccessPointId: js.UndefOr[AccessPointId] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        MountTargetId: js.UndefOr[MountTargetId] = js.undefined
    ): DescribeMountTargetsRequest = {
      val __obj = js.Dynamic.literal()
      AccessPointId.foreach(__v => __obj.updateDynamic("AccessPointId")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      MountTargetId.foreach(__v => __obj.updateDynamic("MountTargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMountTargetsRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeMountTargetsResponse extends js.Object {
    var Marker: js.UndefOr[Marker]
    var MountTargets: js.UndefOr[MountTargetDescriptions]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeMountTargetsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[Marker] = js.undefined,
        MountTargets: js.UndefOr[MountTargetDescriptions] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeMountTargetsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MountTargets.foreach(__v => __obj.updateDynamic("MountTargets")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMountTargetsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeTagsRequest extends js.Object {
    var FileSystemId: FileSystemId
    var Marker: js.UndefOr[Marker]
    var MaxItems: js.UndefOr[MaxItems]
  }

  object DescribeTagsRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxItems: js.UndefOr[MaxItems] = js.undefined
    ): DescribeTagsRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsRequest]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeTagsResponse extends js.Object {
    var Tags: Tags
    var Marker: js.UndefOr[Marker]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeTagsResponse {
    @inline
    def apply(
        Tags: Tags,
        Marker: js.UndefOr[Marker] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeTagsResponse = {
      val __obj = js.Dynamic.literal(
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsResponse]
    }
  }

  /**
    * A description of the file system.
    */
  @js.native
  trait FileSystemDescription extends js.Object {
    var CreationTime: Timestamp
    var CreationToken: CreationToken
    var FileSystemId: FileSystemId
    var LifeCycleState: LifeCycleState
    var NumberOfMountTargets: MountTargetCount
    var OwnerId: AwsAccountId
    var PerformanceMode: PerformanceMode
    var SizeInBytes: FileSystemSize
    var Tags: Tags
    var Encrypted: js.UndefOr[Encrypted]
    var FileSystemArn: js.UndefOr[FileSystemArn]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Name: js.UndefOr[TagValue]
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }

  object FileSystemDescription {
    @inline
    def apply(
        CreationTime: Timestamp,
        CreationToken: CreationToken,
        FileSystemId: FileSystemId,
        LifeCycleState: LifeCycleState,
        NumberOfMountTargets: MountTargetCount,
        OwnerId: AwsAccountId,
        PerformanceMode: PerformanceMode,
        SizeInBytes: FileSystemSize,
        Tags: Tags,
        Encrypted: js.UndefOr[Encrypted] = js.undefined,
        FileSystemArn: js.UndefOr[FileSystemArn] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
        ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined
    ): FileSystemDescription = {
      val __obj = js.Dynamic.literal(
        "CreationTime"         -> CreationTime.asInstanceOf[js.Any],
        "CreationToken"        -> CreationToken.asInstanceOf[js.Any],
        "FileSystemId"         -> FileSystemId.asInstanceOf[js.Any],
        "LifeCycleState"       -> LifeCycleState.asInstanceOf[js.Any],
        "NumberOfMountTargets" -> NumberOfMountTargets.asInstanceOf[js.Any],
        "OwnerId"              -> OwnerId.asInstanceOf[js.Any],
        "PerformanceMode"      -> PerformanceMode.asInstanceOf[js.Any],
        "SizeInBytes"          -> SizeInBytes.asInstanceOf[js.Any],
        "Tags"                 -> Tags.asInstanceOf[js.Any]
      )

      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      FileSystemArn.foreach(__v => __obj.updateDynamic("FileSystemArn")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProvisionedThroughputInMibps.foreach(__v =>
        __obj.updateDynamic("ProvisionedThroughputInMibps")(__v.asInstanceOf[js.Any])
      )
      ThroughputMode.foreach(__v => __obj.updateDynamic("ThroughputMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystemDescription]
    }
  }

  @js.native
  trait FileSystemPolicyDescription extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var Policy: js.UndefOr[Policy]
  }

  object FileSystemPolicyDescription {
    @inline
    def apply(
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Policy: js.UndefOr[Policy] = js.undefined
    ): FileSystemPolicyDescription = {
      val __obj = js.Dynamic.literal()
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystemPolicyDescription]
    }
  }

  /**
    * The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code> field, and the time at which that size was determined in its <code>Timestamp</code> field. The value doesn't represent the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to the file system. That is, the value represents the actual size only if the file system is not modified for a period longer than a couple of hours. Otherwise, the value is not necessarily the exact size the file system was at any instant in time.
    */
  @js.native
  trait FileSystemSize extends js.Object {
    var Value: FileSystemSizeValue
    var Timestamp: js.UndefOr[Timestamp]
    var ValueInIA: js.UndefOr[FileSystemNullableSizeValue]
    var ValueInStandard: js.UndefOr[FileSystemNullableSizeValue]
  }

  object FileSystemSize {
    @inline
    def apply(
        Value: FileSystemSizeValue,
        Timestamp: js.UndefOr[Timestamp] = js.undefined,
        ValueInIA: js.UndefOr[FileSystemNullableSizeValue] = js.undefined,
        ValueInStandard: js.UndefOr[FileSystemNullableSizeValue] = js.undefined
    ): FileSystemSize = {
      val __obj = js.Dynamic.literal(
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      ValueInIA.foreach(__v => __obj.updateDynamic("ValueInIA")(__v.asInstanceOf[js.Any]))
      ValueInStandard.foreach(__v => __obj.updateDynamic("ValueInStandard")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystemSize]
    }
  }

  @js.native
  sealed trait LifeCycleState extends js.Any
  object LifeCycleState extends js.Object {
    val creating  = "creating".asInstanceOf[LifeCycleState]
    val available = "available".asInstanceOf[LifeCycleState]
    val updating  = "updating".asInstanceOf[LifeCycleState]
    val deleting  = "deleting".asInstanceOf[LifeCycleState]
    val deleted   = "deleted".asInstanceOf[LifeCycleState]

    val values = js.Object.freeze(js.Array(creating, available, updating, deleting, deleted))
  }

  @js.native
  trait LifecycleConfigurationDescription extends js.Object {
    var LifecyclePolicies: js.UndefOr[LifecyclePolicies]
  }

  object LifecycleConfigurationDescription {
    @inline
    def apply(
        LifecyclePolicies: js.UndefOr[LifecyclePolicies] = js.undefined
    ): LifecycleConfigurationDescription = {
      val __obj = js.Dynamic.literal()
      LifecyclePolicies.foreach(__v => __obj.updateDynamic("LifecyclePolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleConfigurationDescription]
    }
  }

  /**
    * Describes a policy used by EFS lifecycle management to transition files to the Infrequent Access (IA) storage class.
    */
  @js.native
  trait LifecyclePolicy extends js.Object {
    var TransitionToIA: js.UndefOr[TransitionToIARules]
  }

  object LifecyclePolicy {
    @inline
    def apply(
        TransitionToIA: js.UndefOr[TransitionToIARules] = js.undefined
    ): LifecyclePolicy = {
      val __obj = js.Dynamic.literal()
      TransitionToIA.foreach(__v => __obj.updateDynamic("TransitionToIA")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicy]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ModifyMountTargetSecurityGroupsRequest extends js.Object {
    var MountTargetId: MountTargetId
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  object ModifyMountTargetSecurityGroupsRequest {
    @inline
    def apply(
        MountTargetId: MountTargetId,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    ): ModifyMountTargetSecurityGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "MountTargetId" -> MountTargetId.asInstanceOf[js.Any]
      )

      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyMountTargetSecurityGroupsRequest]
    }
  }

  /**
    * Provides a description of a mount target.
    */
  @js.native
  trait MountTargetDescription extends js.Object {
    var FileSystemId: FileSystemId
    var LifeCycleState: LifeCycleState
    var MountTargetId: MountTargetId
    var SubnetId: SubnetId
    var AvailabilityZoneId: js.UndefOr[AvailabilityZoneId]
    var AvailabilityZoneName: js.UndefOr[AvailabilityZoneName]
    var IpAddress: js.UndefOr[IpAddress]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var OwnerId: js.UndefOr[AwsAccountId]
    var VpcId: js.UndefOr[VpcId]
  }

  object MountTargetDescription {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        LifeCycleState: LifeCycleState,
        MountTargetId: MountTargetId,
        SubnetId: SubnetId,
        AvailabilityZoneId: js.UndefOr[AvailabilityZoneId] = js.undefined,
        AvailabilityZoneName: js.UndefOr[AvailabilityZoneName] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
        OwnerId: js.UndefOr[AwsAccountId] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): MountTargetDescription = {
      val __obj = js.Dynamic.literal(
        "FileSystemId"   -> FileSystemId.asInstanceOf[js.Any],
        "LifeCycleState" -> LifeCycleState.asInstanceOf[js.Any],
        "MountTargetId"  -> MountTargetId.asInstanceOf[js.Any],
        "SubnetId"       -> SubnetId.asInstanceOf[js.Any]
      )

      AvailabilityZoneId.foreach(__v => __obj.updateDynamic("AvailabilityZoneId")(__v.asInstanceOf[js.Any]))
      AvailabilityZoneName.foreach(__v => __obj.updateDynamic("AvailabilityZoneName")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.updateDynamic("NetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MountTargetDescription]
    }
  }

  @js.native
  sealed trait PerformanceMode extends js.Any
  object PerformanceMode extends js.Object {
    val generalPurpose = "generalPurpose".asInstanceOf[PerformanceMode]
    val maxIO          = "maxIO".asInstanceOf[PerformanceMode]

    val values = js.Object.freeze(js.Array(generalPurpose, maxIO))
  }

  /**
    * The full POSIX identity, including the user ID, group ID, and any secondary group IDs, on the access point that is used for all file system operations performed by NFS clients using the access point.
    */
  @js.native
  trait PosixUser extends js.Object {
    var Gid: Gid
    var Uid: Uid
    var SecondaryGids: js.UndefOr[SecondaryGids]
  }

  object PosixUser {
    @inline
    def apply(
        Gid: Gid,
        Uid: Uid,
        SecondaryGids: js.UndefOr[SecondaryGids] = js.undefined
    ): PosixUser = {
      val __obj = js.Dynamic.literal(
        "Gid" -> Gid.asInstanceOf[js.Any],
        "Uid" -> Uid.asInstanceOf[js.Any]
      )

      SecondaryGids.foreach(__v => __obj.updateDynamic("SecondaryGids")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PosixUser]
    }
  }

  @js.native
  trait PutBackupPolicyRequest extends js.Object {
    var BackupPolicy: BackupPolicy
    var FileSystemId: FileSystemId
  }

  object PutBackupPolicyRequest {
    @inline
    def apply(
        BackupPolicy: BackupPolicy,
        FileSystemId: FileSystemId
    ): PutBackupPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "BackupPolicy" -> BackupPolicy.asInstanceOf[js.Any],
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutBackupPolicyRequest]
    }
  }

  @js.native
  trait PutFileSystemPolicyRequest extends js.Object {
    var FileSystemId: FileSystemId
    var Policy: Policy
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BypassPolicyLockoutSafetyCheck]
  }

  object PutFileSystemPolicyRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        Policy: Policy,
        BypassPolicyLockoutSafetyCheck: js.UndefOr[BypassPolicyLockoutSafetyCheck] = js.undefined
    ): PutFileSystemPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "Policy"       -> Policy.asInstanceOf[js.Any]
      )

      BypassPolicyLockoutSafetyCheck.foreach(__v =>
        __obj.updateDynamic("BypassPolicyLockoutSafetyCheck")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutFileSystemPolicyRequest]
    }
  }

  @js.native
  trait PutLifecycleConfigurationRequest extends js.Object {
    var FileSystemId: FileSystemId
    var LifecyclePolicies: LifecyclePolicies
  }

  object PutLifecycleConfigurationRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        LifecyclePolicies: LifecyclePolicies
    ): PutLifecycleConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId"      -> FileSystemId.asInstanceOf[js.Any],
        "LifecyclePolicies" -> LifecyclePolicies.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutLifecycleConfigurationRequest]
    }
  }

  /**
    * Specifies the directory on the Amazon EFS file system that the access point provides access to. The access point exposes the specified file system path as the root directory of your file system to applications using the access point. NFS clients using the access point can only access data in the access point's <code>RootDirectory</code> and it's subdirectories.
    */
  @js.native
  trait RootDirectory extends js.Object {
    var CreationInfo: js.UndefOr[CreationInfo]
    var Path: js.UndefOr[Path]
  }

  object RootDirectory {
    @inline
    def apply(
        CreationInfo: js.UndefOr[CreationInfo] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined
    ): RootDirectory = {
      val __obj = js.Dynamic.literal()
      CreationInfo.foreach(__v => __obj.updateDynamic("CreationInfo")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RootDirectory]
    }
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val ENABLED   = "ENABLED".asInstanceOf[Status]
    val ENABLING  = "ENABLING".asInstanceOf[Status]
    val DISABLED  = "DISABLED".asInstanceOf[Status]
    val DISABLING = "DISABLING".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(ENABLED, ENABLING, DISABLED, DISABLING))
  }

  /**
    * A tag is a key-value pair. Allowed characters are letters, white space, and numbers that can be represented in UTF-8, and the following characters:<code> + - = . _ : /</code>
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Tags"       -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  sealed trait ThroughputMode extends js.Any
  object ThroughputMode extends js.Object {
    val bursting    = "bursting".asInstanceOf[ThroughputMode]
    val provisioned = "provisioned".asInstanceOf[ThroughputMode]

    val values = js.Object.freeze(js.Array(bursting, provisioned))
  }

  @js.native
  sealed trait TransitionToIARules extends js.Any
  object TransitionToIARules extends js.Object {
    val AFTER_7_DAYS  = "AFTER_7_DAYS".asInstanceOf[TransitionToIARules]
    val AFTER_14_DAYS = "AFTER_14_DAYS".asInstanceOf[TransitionToIARules]
    val AFTER_30_DAYS = "AFTER_30_DAYS".asInstanceOf[TransitionToIARules]
    val AFTER_60_DAYS = "AFTER_60_DAYS".asInstanceOf[TransitionToIARules]
    val AFTER_90_DAYS = "AFTER_90_DAYS".asInstanceOf[TransitionToIARules]

    val values = js.Object.freeze(js.Array(AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS, AFTER_60_DAYS, AFTER_90_DAYS))
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagKeys"    -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }

  object UpdateFileSystemRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
        ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined
    ): UpdateFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ProvisionedThroughputInMibps.foreach(__v =>
        __obj.updateDynamic("ProvisionedThroughputInMibps")(__v.asInstanceOf[js.Any])
      )
      ThroughputMode.foreach(__v => __obj.updateDynamic("ThroughputMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemRequest]
    }
  }
}
