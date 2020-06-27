package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  @Factory
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

  @js.native
  @Factory
  trait CreateAccessPointRequest extends js.Object {
    var ClientToken: ClientToken
    var FileSystemId: FileSystemId
    var PosixUser: js.UndefOr[PosixUser]
    var RootDirectory: js.UndefOr[RootDirectory]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateFileSystemRequest extends js.Object {
    var CreationToken: CreationToken
    var Encrypted: js.UndefOr[Encrypted]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var PerformanceMode: js.UndefOr[PerformanceMode]
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var Tags: js.UndefOr[Tags]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateMountTargetRequest extends js.Object {
    var FileSystemId: FileSystemId
    var SubnetId: SubnetId
    var IpAddress: js.UndefOr[IpAddress]
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateTagsRequest extends js.Object {
    var FileSystemId: FileSystemId
    var Tags: Tags
  }

  /**
    * Required if the <code>RootDirectory</code> &gt; <code>Path</code> specified does not exist. Specifies the POSIX IDs and permissions to apply to the access point's <code>RootDirectory</code> &gt; <code>Path</code>. If the access point root directory does not exist, EFS creates it with these settings when a client connects to the access point. When specifying <code>CreationInfo</code>, you must include values for all properties.
    *  <important> If you do not provide <code>CreationInfo</code> and the specified <code>RootDirectory</code> does not exist, attempts to mount the file system using the access point will fail.
    *  </important>
    */
  @js.native
  @Factory
  trait CreationInfo extends js.Object {
    var OwnerGid: OwnerGid
    var OwnerUid: OwnerUid
    var Permissions: Permissions
  }

  @js.native
  @Factory
  trait DeleteAccessPointRequest extends js.Object {
    var AccessPointId: AccessPointId
  }

  @js.native
  @Factory
  trait DeleteFileSystemPolicyRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteMountTargetRequest extends js.Object {
    var MountTargetId: MountTargetId
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteTagsRequest extends js.Object {
    var FileSystemId: FileSystemId
    var TagKeys: TagKeys
  }

  @js.native
  @Factory
  trait DescribeAccessPointsRequest extends js.Object {
    var AccessPointId: js.UndefOr[AccessPointId]
    var FileSystemId: js.UndefOr[FileSystemId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait DescribeAccessPointsResponse extends js.Object {
    var AccessPoints: js.UndefOr[AccessPointDescriptions]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait DescribeFileSystemPolicyRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeFileSystemsRequest extends js.Object {
    var CreationToken: js.UndefOr[CreationToken]
    var FileSystemId: js.UndefOr[FileSystemId]
    var Marker: js.UndefOr[Marker]
    var MaxItems: js.UndefOr[MaxItems]
  }

  @js.native
  @Factory
  trait DescribeFileSystemsResponse extends js.Object {
    var FileSystems: js.UndefOr[FileSystemDescriptions]
    var Marker: js.UndefOr[Marker]
    var NextMarker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait DescribeLifecycleConfigurationRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeMountTargetSecurityGroupsRequest extends js.Object {
    var MountTargetId: MountTargetId
  }

  @js.native
  @Factory
  trait DescribeMountTargetSecurityGroupsResponse extends js.Object {
    var SecurityGroups: SecurityGroups
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeMountTargetsRequest extends js.Object {
    var AccessPointId: js.UndefOr[AccessPointId]
    var FileSystemId: js.UndefOr[FileSystemId]
    var Marker: js.UndefOr[Marker]
    var MaxItems: js.UndefOr[MaxItems]
    var MountTargetId: js.UndefOr[MountTargetId]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeMountTargetsResponse extends js.Object {
    var Marker: js.UndefOr[Marker]
    var MountTargets: js.UndefOr[MountTargetDescriptions]
    var NextMarker: js.UndefOr[Marker]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeTagsRequest extends js.Object {
    var FileSystemId: FileSystemId
    var Marker: js.UndefOr[Marker]
    var MaxItems: js.UndefOr[MaxItems]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeTagsResponse extends js.Object {
    var Tags: Tags
    var Marker: js.UndefOr[Marker]
    var NextMarker: js.UndefOr[Marker]
  }

  /**
    * A description of the file system.
    */
  @js.native
  @Factory
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
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Name: js.UndefOr[TagValue]
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }

  @js.native
  @Factory
  trait FileSystemPolicyDescription extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var Policy: js.UndefOr[Policy]
  }

  /**
    * The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code> field, and the time at which that size was determined in its <code>Timestamp</code> field. The value doesn't represent the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to the file system. That is, the value represents the actual size only if the file system is not modified for a period longer than a couple of hours. Otherwise, the value is not necessarily the exact size the file system was at any instant in time.
    */
  @js.native
  @Factory
  trait FileSystemSize extends js.Object {
    var Value: FileSystemSizeValue
    var Timestamp: js.UndefOr[Timestamp]
    var ValueInIA: js.UndefOr[FileSystemNullableSizeValue]
    var ValueInStandard: js.UndefOr[FileSystemNullableSizeValue]
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
  @Factory
  trait LifecycleConfigurationDescription extends js.Object {
    var LifecyclePolicies: js.UndefOr[LifecyclePolicies]
  }

  /**
    * Describes a policy used by EFS lifecycle management to transition files to the Infrequent Access (IA) storage class.
    */
  @js.native
  @Factory
  trait LifecyclePolicy extends js.Object {
    var TransitionToIA: js.UndefOr[TransitionToIARules]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyMountTargetSecurityGroupsRequest extends js.Object {
    var MountTargetId: MountTargetId
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  /**
    * Provides a description of a mount target.
    */
  @js.native
  @Factory
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
  @Factory
  trait PosixUser extends js.Object {
    var Gid: Gid
    var Uid: Uid
    var SecondaryGids: js.UndefOr[SecondaryGids]
  }

  @js.native
  @Factory
  trait PutFileSystemPolicyRequest extends js.Object {
    var FileSystemId: FileSystemId
    var Policy: Policy
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BypassPolicyLockoutSafetyCheck]
  }

  @js.native
  @Factory
  trait PutLifecycleConfigurationRequest extends js.Object {
    var FileSystemId: FileSystemId
    var LifecyclePolicies: LifecyclePolicies
  }

  /**
    * Specifies the directory on the Amazon EFS file system that the access point provides access to. The access point exposes the specified file system path as the root directory of your file system to applications using the access point. NFS clients using the access point can only access data in the access point's <code>RootDirectory</code> and it's subdirectories.
    */
  @js.native
  @Factory
  trait RootDirectory extends js.Object {
    var CreationInfo: js.UndefOr[CreationInfo]
    var Path: js.UndefOr[Path]
  }

  /**
    * A tag is a key-value pair. Allowed characters are letters, white space, and numbers that can be represented in UTF-8, and the following characters:<code> + - = . _ : /</code>
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var Tags: Tags
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
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var TagKeys: js.UndefOr[TagKeys]
  }

  @js.native
  @Factory
  trait UpdateFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }
}
