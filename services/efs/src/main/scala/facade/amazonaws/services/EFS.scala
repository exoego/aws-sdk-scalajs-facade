package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object efs {
  type AwsAccountId                 = String
  type CreationToken                = String
  type Encrypted                    = Boolean
  type FileSystemDescriptions       = js.Array[FileSystemDescription]
  type FileSystemId                 = String
  type FileSystemNullableSizeValue  = Double
  type FileSystemSizeValue          = Double
  type IpAddress                    = String
  type KmsKeyId                     = String
  type LifeCycleState               = String
  type LifecyclePolicies            = js.Array[LifecyclePolicy]
  type Marker                       = String
  type MaxItems                     = Int
  type MountTargetCount             = Int
  type MountTargetDescriptions      = js.Array[MountTargetDescription]
  type MountTargetId                = String
  type NetworkInterfaceId           = String
  type PerformanceMode              = String
  type ProvisionedThroughputInMibps = Double
  type SecurityGroup                = String
  type SecurityGroups               = js.Array[SecurityGroup]
  type SubnetId                     = String
  type TagKey                       = String
  type TagKeys                      = js.Array[TagKey]
  type TagValue                     = String
  type Tags                         = js.Array[Tag]
  type ThroughputMode               = String
  type Timestamp                    = js.Date
  type TransitionToIARules          = String

  implicit final class EFSOps(val service: EFS) extends AnyVal {

    def createFileSystemFuture(params: CreateFileSystemRequest): Future[FileSystemDescription] =
      service.createFileSystem(params).promise.toFuture
    def createMountTargetFuture(params: CreateMountTargetRequest): Future[MountTargetDescription] =
      service.createMountTarget(params).promise.toFuture
    def createTagsFuture(params: CreateTagsRequest): Future[js.Object] = service.createTags(params).promise.toFuture
    def deleteFileSystemFuture(params: DeleteFileSystemRequest): Future[js.Object] =
      service.deleteFileSystem(params).promise.toFuture
    def deleteMountTargetFuture(params: DeleteMountTargetRequest): Future[js.Object] =
      service.deleteMountTarget(params).promise.toFuture
    def deleteTagsFuture(params: DeleteTagsRequest): Future[js.Object] = service.deleteTags(params).promise.toFuture
    def describeFileSystemsFuture(params: DescribeFileSystemsRequest): Future[DescribeFileSystemsResponse] =
      service.describeFileSystems(params).promise.toFuture
    def describeLifecycleConfigurationFuture(
        params: DescribeLifecycleConfigurationRequest
    ): Future[LifecycleConfigurationDescription] = service.describeLifecycleConfiguration(params).promise.toFuture
    def describeMountTargetSecurityGroupsFuture(
        params: DescribeMountTargetSecurityGroupsRequest
    ): Future[DescribeMountTargetSecurityGroupsResponse] =
      service.describeMountTargetSecurityGroups(params).promise.toFuture
    def describeMountTargetsFuture(params: DescribeMountTargetsRequest): Future[DescribeMountTargetsResponse] =
      service.describeMountTargets(params).promise.toFuture
    def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResponse] =
      service.describeTags(params).promise.toFuture
    def modifyMountTargetSecurityGroupsFuture(params: ModifyMountTargetSecurityGroupsRequest): Future[js.Object] =
      service.modifyMountTargetSecurityGroups(params).promise.toFuture
    def putLifecycleConfigurationFuture(
        params: PutLifecycleConfigurationRequest
    ): Future[LifecycleConfigurationDescription] = service.putLifecycleConfiguration(params).promise.toFuture
    def updateFileSystemFuture(params: UpdateFileSystemRequest): Future[FileSystemDescription] =
      service.updateFileSystem(params).promise.toFuture
  }
}

package efs {
  @js.native
  @JSImport("aws-sdk", "EFS")
  class EFS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createFileSystem(params: CreateFileSystemRequest): Request[FileSystemDescription]             = js.native
    def createMountTarget(params: CreateMountTargetRequest): Request[MountTargetDescription]          = js.native
    def createTags(params: CreateTagsRequest): Request[js.Object]                                     = js.native
    def deleteFileSystem(params: DeleteFileSystemRequest): Request[js.Object]                         = js.native
    def deleteMountTarget(params: DeleteMountTargetRequest): Request[js.Object]                       = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object]                                     = js.native
    def describeFileSystems(params: DescribeFileSystemsRequest): Request[DescribeFileSystemsResponse] = js.native
    def describeLifecycleConfiguration(
        params: DescribeLifecycleConfigurationRequest
    ): Request[LifecycleConfigurationDescription] = js.native
    def describeMountTargetSecurityGroups(
        params: DescribeMountTargetSecurityGroupsRequest
    ): Request[DescribeMountTargetSecurityGroupsResponse]                                                   = js.native
    def describeMountTargets(params: DescribeMountTargetsRequest): Request[DescribeMountTargetsResponse]    = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse]                            = js.native
    def modifyMountTargetSecurityGroups(params: ModifyMountTargetSecurityGroupsRequest): Request[js.Object] = js.native
    def putLifecycleConfiguration(
        params: PutLifecycleConfigurationRequest
    ): Request[LifecycleConfigurationDescription]                                         = js.native
    def updateFileSystem(params: UpdateFileSystemRequest): Request[FileSystemDescription] = js.native
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
    def apply(
        CreationToken: CreationToken,
        Encrypted: js.UndefOr[Encrypted] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        PerformanceMode: js.UndefOr[PerformanceMode] = js.undefined,
        ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined
    ): CreateFileSystemRequest = {
      val __obj = js.Dictionary[js.Any](
        "CreationToken" -> CreationToken.asInstanceOf[js.Any]
      )

      Encrypted.foreach(__v => __obj.update("Encrypted", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      PerformanceMode.foreach(__v => __obj.update("PerformanceMode", __v.asInstanceOf[js.Any]))
      ProvisionedThroughputInMibps.foreach(
        __v => __obj.update("ProvisionedThroughputInMibps", __v.asInstanceOf[js.Any])
      )
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      ThroughputMode.foreach(__v => __obj.update("ThroughputMode", __v.asInstanceOf[js.Any]))
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
    def apply(
        FileSystemId: FileSystemId,
        SubnetId: SubnetId,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    ): CreateMountTargetRequest = {
      val __obj = js.Dictionary[js.Any](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "SubnetId"     -> SubnetId.asInstanceOf[js.Any]
      )

      IpAddress.foreach(__v => __obj.update("IpAddress", __v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.update("SecurityGroups", __v.asInstanceOf[js.Any]))
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
    def apply(
        FileSystemId: FileSystemId,
        Tags: Tags
    ): CreateTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTagsRequest]
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
    def apply(
        FileSystemId: FileSystemId
    ): DeleteFileSystemRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        MountTargetId: MountTargetId
    ): DeleteMountTargetRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        FileSystemId: FileSystemId,
        TagKeys: TagKeys
    ): DeleteTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagsRequest]
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
    def apply(
        CreationToken: js.UndefOr[CreationToken] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxItems: js.UndefOr[MaxItems] = js.undefined
    ): DescribeFileSystemsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationToken.foreach(__v => __obj.update("CreationToken", __v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.update("FileSystemId", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
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
    def apply(
        FileSystems: js.UndefOr[FileSystemDescriptions] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeFileSystemsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FileSystems.foreach(__v => __obj.update("FileSystems", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFileSystemsResponse]
    }
  }

  @js.native
  trait DescribeLifecycleConfigurationRequest extends js.Object {
    var FileSystemId: FileSystemId
  }

  object DescribeLifecycleConfigurationRequest {
    def apply(
        FileSystemId: FileSystemId
    ): DescribeLifecycleConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        MountTargetId: MountTargetId
    ): DescribeMountTargetSecurityGroupsRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        SecurityGroups: SecurityGroups
    ): DescribeMountTargetSecurityGroupsResponse = {
      val __obj = js.Dictionary[js.Any](
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
    var FileSystemId: js.UndefOr[FileSystemId]
    var Marker: js.UndefOr[Marker]
    var MaxItems: js.UndefOr[MaxItems]
    var MountTargetId: js.UndefOr[MountTargetId]
  }

  object DescribeMountTargetsRequest {
    def apply(
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        MountTargetId: js.UndefOr[MountTargetId] = js.undefined
    ): DescribeMountTargetsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      FileSystemId.foreach(__v => __obj.update("FileSystemId", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      MountTargetId.foreach(__v => __obj.update("MountTargetId", __v.asInstanceOf[js.Any]))
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
    def apply(
        Marker: js.UndefOr[Marker] = js.undefined,
        MountTargets: js.UndefOr[MountTargetDescriptions] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeMountTargetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MountTargets.foreach(__v => __obj.update("MountTargets", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
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
    def apply(
        FileSystemId: FileSystemId,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxItems: js.UndefOr[MaxItems] = js.undefined
    ): DescribeTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
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
    def apply(
        Tags: Tags,
        Marker: js.UndefOr[Marker] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeTagsResponse = {
      val __obj = js.Dictionary[js.Any](
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
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
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Name: js.UndefOr[TagValue]
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }

  object FileSystemDescription {
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
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Name: js.UndefOr[TagValue] = js.undefined,
        ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
        ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined
    ): FileSystemDescription = {
      val __obj = js.Dictionary[js.Any](
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

      Encrypted.foreach(__v => __obj.update("Encrypted", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProvisionedThroughputInMibps.foreach(
        __v => __obj.update("ProvisionedThroughputInMibps", __v.asInstanceOf[js.Any])
      )
      ThroughputMode.foreach(__v => __obj.update("ThroughputMode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystemDescription]
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
    def apply(
        Value: FileSystemSizeValue,
        Timestamp: js.UndefOr[Timestamp] = js.undefined,
        ValueInIA: js.UndefOr[FileSystemNullableSizeValue] = js.undefined,
        ValueInStandard: js.UndefOr[FileSystemNullableSizeValue] = js.undefined
    ): FileSystemSize = {
      val __obj = js.Dictionary[js.Any](
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Timestamp.foreach(__v => __obj.update("Timestamp", __v.asInstanceOf[js.Any]))
      ValueInIA.foreach(__v => __obj.update("ValueInIA", __v.asInstanceOf[js.Any]))
      ValueInStandard.foreach(__v => __obj.update("ValueInStandard", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystemSize]
    }
  }

  object LifeCycleStateEnum {
    val creating  = "creating"
    val available = "available"
    val updating  = "updating"
    val deleting  = "deleting"
    val deleted   = "deleted"

    val values = js.Object.freeze(js.Array(creating, available, updating, deleting, deleted))
  }

  @js.native
  trait LifecycleConfigurationDescription extends js.Object {
    var LifecyclePolicies: js.UndefOr[LifecyclePolicies]
  }

  object LifecycleConfigurationDescription {
    def apply(
        LifecyclePolicies: js.UndefOr[LifecyclePolicies] = js.undefined
    ): LifecycleConfigurationDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      LifecyclePolicies.foreach(__v => __obj.update("LifecyclePolicies", __v.asInstanceOf[js.Any]))
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
    def apply(
        TransitionToIA: js.UndefOr[TransitionToIARules] = js.undefined
    ): LifecyclePolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      TransitionToIA.foreach(__v => __obj.update("TransitionToIA", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicy]
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
    def apply(
        MountTargetId: MountTargetId,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    ): ModifyMountTargetSecurityGroupsRequest = {
      val __obj = js.Dictionary[js.Any](
        "MountTargetId" -> MountTargetId.asInstanceOf[js.Any]
      )

      SecurityGroups.foreach(__v => __obj.update("SecurityGroups", __v.asInstanceOf[js.Any]))
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
    var IpAddress: js.UndefOr[IpAddress]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var OwnerId: js.UndefOr[AwsAccountId]
  }

  object MountTargetDescription {
    def apply(
        FileSystemId: FileSystemId,
        LifeCycleState: LifeCycleState,
        MountTargetId: MountTargetId,
        SubnetId: SubnetId,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
        OwnerId: js.UndefOr[AwsAccountId] = js.undefined
    ): MountTargetDescription = {
      val __obj = js.Dictionary[js.Any](
        "FileSystemId"   -> FileSystemId.asInstanceOf[js.Any],
        "LifeCycleState" -> LifeCycleState.asInstanceOf[js.Any],
        "MountTargetId"  -> MountTargetId.asInstanceOf[js.Any],
        "SubnetId"       -> SubnetId.asInstanceOf[js.Any]
      )

      IpAddress.foreach(__v => __obj.update("IpAddress", __v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.update("NetworkInterfaceId", __v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.update("OwnerId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MountTargetDescription]
    }
  }

  object PerformanceModeEnum {
    val generalPurpose = "generalPurpose"
    val maxIO          = "maxIO"

    val values = js.Object.freeze(js.Array(generalPurpose, maxIO))
  }

  @js.native
  trait PutLifecycleConfigurationRequest extends js.Object {
    var FileSystemId: FileSystemId
    var LifecyclePolicies: LifecyclePolicies
  }

  object PutLifecycleConfigurationRequest {
    def apply(
        FileSystemId: FileSystemId,
        LifecyclePolicies: LifecyclePolicies
    ): PutLifecycleConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "FileSystemId"      -> FileSystemId.asInstanceOf[js.Any],
        "LifecyclePolicies" -> LifecyclePolicies.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutLifecycleConfigurationRequest]
    }
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
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  object ThroughputModeEnum {
    val bursting    = "bursting"
    val provisioned = "provisioned"

    val values = js.Object.freeze(js.Array(bursting, provisioned))
  }

  object TransitionToIARulesEnum {
    val AFTER_14_DAYS = "AFTER_14_DAYS"
    val AFTER_30_DAYS = "AFTER_30_DAYS"
    val AFTER_60_DAYS = "AFTER_60_DAYS"
    val AFTER_90_DAYS = "AFTER_90_DAYS"

    val values = js.Object.freeze(js.Array(AFTER_14_DAYS, AFTER_30_DAYS, AFTER_60_DAYS, AFTER_90_DAYS))
  }

  @js.native
  trait UpdateFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }

  object UpdateFileSystemRequest {
    def apply(
        FileSystemId: FileSystemId,
        ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
        ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined
    ): UpdateFileSystemRequest = {
      val __obj = js.Dictionary[js.Any](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ProvisionedThroughputInMibps.foreach(
        __v => __obj.update("ProvisionedThroughputInMibps", __v.asInstanceOf[js.Any])
      )
      ThroughputMode.foreach(__v => __obj.update("ThroughputMode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemRequest]
    }
  }
}
