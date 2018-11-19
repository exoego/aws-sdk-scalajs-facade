package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object efs {
  type AwsAccountId = String
  type CreationToken = String
  type Encrypted = Boolean
  type ErrorCode = String
  type ErrorMessage = String
  type FileSystemDescriptions = js.Array[FileSystemDescription]
  type FileSystemId = String
  type FileSystemSizeValue = Double
  type IpAddress = String
  type KmsKeyId = String
  type LifeCycleState = String
  type Marker = String
  type MaxItems = Int
  type MountTargetCount = Int
  type MountTargetDescriptions = js.Array[MountTargetDescription]
  type MountTargetId = String
  type NetworkInterfaceId = String
  type PerformanceMode = String
  type ProvisionedThroughputInMibps = Double
  type SecurityGroup = String
  type SecurityGroups = js.Array[SecurityGroup]
  type SubnetId = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type ThroughputMode = String
  type Timestamp = js.Date
}

package efs {
  @js.native
  @JSImport("aws-sdk", "EFS")
  class EFS(config: AWSConfig) extends js.Object {
    def createFileSystem(params: CreateFileSystemRequest): Request[FileSystemDescription] = js.native
    def createMountTarget(params: CreateMountTargetRequest): Request[MountTargetDescription] = js.native
    def createTags(params: CreateTagsRequest): Request[js.Object] = js.native
    def deleteFileSystem(params: DeleteFileSystemRequest): Request[js.Object] = js.native
    def deleteMountTarget(params: DeleteMountTargetRequest): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object] = js.native
    def describeFileSystems(params: DescribeFileSystemsRequest): Request[DescribeFileSystemsResponse] = js.native
    def describeMountTargetSecurityGroups(params: DescribeMountTargetSecurityGroupsRequest): Request[DescribeMountTargetSecurityGroupsResponse] = js.native
    def describeMountTargets(params: DescribeMountTargetsRequest): Request[DescribeMountTargetsResponse] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse] = js.native
    def modifyMountTargetSecurityGroups(params: ModifyMountTargetSecurityGroupsRequest): Request[js.Object] = js.native
    def updateFileSystem(params: UpdateFileSystemRequest): Request[FileSystemDescription] = js.native
  }

  /**
   * <p>Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter.</p>
   */
  @js.native
  trait BadRequestException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  @js.native
  trait CreateFileSystemRequest extends js.Object {
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var ThroughputMode: js.UndefOr[ThroughputMode]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Encrypted: js.UndefOr[Encrypted]
    var PerformanceMode: js.UndefOr[PerformanceMode]
    var CreationToken: js.UndefOr[CreationToken]
  }

  object CreateFileSystemRequest {
    def apply(
      ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
      ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      Encrypted: js.UndefOr[Encrypted] = js.undefined,
      PerformanceMode: js.UndefOr[PerformanceMode] = js.undefined,
      CreationToken: js.UndefOr[CreationToken] = js.undefined): CreateFileSystemRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProvisionedThroughputInMibps" -> ProvisionedThroughputInMibps.map { x => x.asInstanceOf[js.Any] },
        "ThroughputMode" -> ThroughputMode.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "PerformanceMode" -> PerformanceMode.map { x => x.asInstanceOf[js.Any] },
        "CreationToken" -> CreationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFileSystemRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateMountTargetRequest extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var SubnetId: js.UndefOr[SubnetId]
    var IpAddress: js.UndefOr[IpAddress]
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  object CreateMountTargetRequest {
    def apply(
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined): CreateMountTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMountTargetRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateTagsRequest extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var Tags: js.UndefOr[Tags]
  }

  object CreateTagsRequest {
    def apply(
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteFileSystemRequest extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
  }

  object DeleteFileSystemRequest {
    def apply(
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined): DeleteFileSystemRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileSystemRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteMountTargetRequest extends js.Object {
    var MountTargetId: js.UndefOr[MountTargetId]
  }

  object DeleteMountTargetRequest {
    def apply(
      MountTargetId: js.UndefOr[MountTargetId] = js.undefined): DeleteMountTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MountTargetId" -> MountTargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMountTargetRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteTagsRequest extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var TagKeys: js.UndefOr[TagKeys]
  }

  object DeleteTagsRequest {
    def apply(
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      TagKeys: js.UndefOr[TagKeys] = js.undefined): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  /**
   * <p>The service timed out trying to fulfill the request, and the client should try the call again.</p>
   */
  @js.native
  trait DependencyTimeoutException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeFileSystemsRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var Marker: js.UndefOr[Marker]
    var CreationToken: js.UndefOr[CreationToken]
    var FileSystemId: js.UndefOr[FileSystemId]
  }

  object DescribeFileSystemsRequest {
    def apply(
      MaxItems: js.UndefOr[MaxItems] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      CreationToken: js.UndefOr[CreationToken] = js.undefined,
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined): DescribeFileSystemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "CreationToken" -> CreationToken.map { x => x.asInstanceOf[js.Any] },
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFileSystemsRequest]
    }
  }

  @js.native
  trait DescribeFileSystemsResponse extends js.Object {
    var Marker: js.UndefOr[Marker]
    var FileSystems: js.UndefOr[FileSystemDescriptions]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeFileSystemsResponse {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      FileSystems: js.UndefOr[FileSystemDescriptions] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeFileSystemsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "FileSystems" -> FileSystems.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFileSystemsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeMountTargetSecurityGroupsRequest extends js.Object {
    var MountTargetId: js.UndefOr[MountTargetId]
  }

  object DescribeMountTargetSecurityGroupsRequest {
    def apply(
      MountTargetId: js.UndefOr[MountTargetId] = js.undefined): DescribeMountTargetSecurityGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MountTargetId" -> MountTargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMountTargetSecurityGroupsRequest]
    }
  }

  @js.native
  trait DescribeMountTargetSecurityGroupsResponse extends js.Object {
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  object DescribeMountTargetSecurityGroupsResponse {
    def apply(
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined): DescribeMountTargetSecurityGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMountTargetSecurityGroupsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeMountTargetsRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var Marker: js.UndefOr[Marker]
    var FileSystemId: js.UndefOr[FileSystemId]
    var MountTargetId: js.UndefOr[MountTargetId]
  }

  object DescribeMountTargetsRequest {
    def apply(
      MaxItems: js.UndefOr[MaxItems] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      MountTargetId: js.UndefOr[MountTargetId] = js.undefined): DescribeMountTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "MountTargetId" -> MountTargetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMountTargetsRequest]
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
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeMountTargetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MountTargets" -> MountTargets.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMountTargetsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTagsRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var Marker: js.UndefOr[Marker]
    var FileSystemId: js.UndefOr[FileSystemId]
  }

  object DescribeTagsRequest {
    def apply(
      MaxItems: js.UndefOr[MaxItems] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTagsResponse extends js.Object {
    var Marker: js.UndefOr[Marker]
    var Tags: js.UndefOr[Tags]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeTagsResponse {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResponse]
    }
  }

  /**
   * <p>Returned if the file system you are trying to create already exists, with the creation token you provided.</p>
   */
  @js.native
  trait FileSystemAlreadyExistsException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
    val FileSystemId: FileSystemId
  }

  /**
   * <p>Description of the file system.</p>
   */
  @js.native
  trait FileSystemDescription extends js.Object {
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var Name: js.UndefOr[TagValue]
    var ThroughputMode: js.UndefOr[ThroughputMode]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var FileSystemId: js.UndefOr[FileSystemId]
    var SizeInBytes: js.UndefOr[FileSystemSize]
    var Encrypted: js.UndefOr[Encrypted]
    var PerformanceMode: js.UndefOr[PerformanceMode]
    var CreationToken: js.UndefOr[CreationToken]
    var OwnerId: js.UndefOr[AwsAccountId]
    var NumberOfMountTargets: js.UndefOr[MountTargetCount]
    var LifeCycleState: js.UndefOr[LifeCycleState]
    var CreationTime: js.UndefOr[Timestamp]
  }

  object FileSystemDescription {
    def apply(
      ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
      Name: js.UndefOr[TagValue] = js.undefined,
      ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      SizeInBytes: js.UndefOr[FileSystemSize] = js.undefined,
      Encrypted: js.UndefOr[Encrypted] = js.undefined,
      PerformanceMode: js.UndefOr[PerformanceMode] = js.undefined,
      CreationToken: js.UndefOr[CreationToken] = js.undefined,
      OwnerId: js.UndefOr[AwsAccountId] = js.undefined,
      NumberOfMountTargets: js.UndefOr[MountTargetCount] = js.undefined,
      LifeCycleState: js.UndefOr[LifeCycleState] = js.undefined,
      CreationTime: js.UndefOr[Timestamp] = js.undefined): FileSystemDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProvisionedThroughputInMibps" -> ProvisionedThroughputInMibps.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ThroughputMode" -> ThroughputMode.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "SizeInBytes" -> SizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "PerformanceMode" -> PerformanceMode.map { x => x.asInstanceOf[js.Any] },
        "CreationToken" -> CreationToken.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "NumberOfMountTargets" -> NumberOfMountTargets.map { x => x.asInstanceOf[js.Any] },
        "LifeCycleState" -> LifeCycleState.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileSystemDescription]
    }
  }

  /**
   * <p>Returned if a file system has mount targets.</p>
   */
  @js.native
  trait FileSystemInUseException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Returned if the AWS account has already created the maximum number of file systems allowed per account.</p>
   */
  @js.native
  trait FileSystemLimitExceededException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.</p>
   */
  @js.native
  trait FileSystemNotFoundException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code> field, and the time at which that size was determined in its <code>Timestamp</code> field. Note that the value does not represent the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to the file system. That is, the value will represent the actual size only if the file system is not modified for a period longer than a couple of hours. Otherwise, the value is not necessarily the exact size the file system was at any instant in time.</p>
   */
  @js.native
  trait FileSystemSize extends js.Object {
    var Value: js.UndefOr[FileSystemSizeValue]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object FileSystemSize {
    def apply(
      Value: js.UndefOr[FileSystemSizeValue] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined): FileSystemSize = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileSystemSize]
    }
  }

  /**
   * <p>Returned if the file system's lifecycle state is not "available".</p>
   */
  @js.native
  trait IncorrectFileSystemLifeCycleStateException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Returned if the mount target is not in the correct state for the operation.</p>
   */
  @js.native
  trait IncorrectMountTargetStateException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Returned if there's not enough capacity to provision additional throughput. This value might be returned when you try to create a file system in provisioned throughput mode, when you attempt to increase the provisioned throughput of an existing file system, or when you attempt to change an existing file system from bursting to provisioned throughput mode.</p>
   */
  @js.native
  trait InsufficientThroughputCapacityException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Returned if an error occurred on the server side.</p>
   */
  @js.native
  trait InternalServerErrorException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Returned if the request specified an <code>IpAddress</code> that is already in use in the subnet.</p>
   */
  @js.native
  trait IpAddressInUseException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  object LifeCycleStateEnum {
    val creating = "creating"
    val available = "available"
    val updating = "updating"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(creating, available, updating, deleting, deleted)
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyMountTargetSecurityGroupsRequest extends js.Object {
    var MountTargetId: js.UndefOr[MountTargetId]
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  object ModifyMountTargetSecurityGroupsRequest {
    def apply(
      MountTargetId: js.UndefOr[MountTargetId] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined): ModifyMountTargetSecurityGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MountTargetId" -> MountTargetId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyMountTargetSecurityGroupsRequest]
    }
  }

  /**
   * <p>Returned if the mount target would violate one of the specified restrictions based on the file system's existing mount targets.</p>
   */
  @js.native
  trait MountTargetConflictException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Provides a description of a mount target.</p>
   */
  @js.native
  trait MountTargetDescription extends js.Object {
    var MountTargetId: js.UndefOr[MountTargetId]
    var IpAddress: js.UndefOr[IpAddress]
    var FileSystemId: js.UndefOr[FileSystemId]
    var OwnerId: js.UndefOr[AwsAccountId]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var LifeCycleState: js.UndefOr[LifeCycleState]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object MountTargetDescription {
    def apply(
      MountTargetId: js.UndefOr[MountTargetId] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined,
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      OwnerId: js.UndefOr[AwsAccountId] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      LifeCycleState: js.UndefOr[LifeCycleState] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): MountTargetDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MountTargetId" -> MountTargetId.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "LifeCycleState" -> LifeCycleState.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MountTargetDescription]
    }
  }

  /**
   * <p>Returned if there is no mount target with the specified ID found in the caller's account.</p>
   */
  @js.native
  trait MountTargetNotFoundException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>The calling account has reached the limit for elastic network interfaces for the specific AWS Region. The client should try to delete some elastic network interfaces or get the account limit raised. For more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Appendix_Limits.html">Amazon VPC Limits</a> in the <i>Amazon VPC User Guide </i> (see the Network interfaces per VPC entry in the table). </p>
   */
  @js.native
  trait NetworkInterfaceLimitExceededException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Returned if <code>IpAddress</code> was not specified in the request and there are no free IP addresses in the subnet.</p>
   */
  @js.native
  trait NoFreeAddressesInSubnetException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  object PerformanceModeEnum {
    val generalPurpose = "generalPurpose"
    val maxIO = "maxIO"

    val values = IndexedSeq(generalPurpose, maxIO)
  }

  /**
   * <p>Returned if the size of <code>SecurityGroups</code> specified in the request is greater than five.</p>
   */
  @js.native
  trait SecurityGroupLimitExceededException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Returned if one of the specified security groups doesn't exist in the subnet's VPC.</p>
   */
  @js.native
  trait SecurityGroupNotFoundException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>Returned if there is no subnet with ID <code>SubnetId</code> provided in the request.</p>
   */
  @js.native
  trait SubnetNotFoundException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p>A tag is a key-value pair. Allowed characters: letters, whitespace, and numbers, representable in UTF-8, and the following characters:<code> + - = . _ : /</code> </p>
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

  /**
   * <p>Returned if the throughput mode or amount of provisioned throughput can't be changed because the throughput limit of 1024 MiB/s has been reached.</p>
   */
  @js.native
  trait ThroughputLimitExceededException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  object ThroughputModeEnum {
    val bursting = "bursting"
    val provisioned = "provisioned"

    val values = IndexedSeq(bursting, provisioned)
  }

  /**
   * <p>Returned if you don’t wait at least 24 hours before changing the throughput mode, or decreasing the Provisioned Throughput value.</p>
   */
  @js.native
  trait TooManyRequestsException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * <p/>
   */
  @js.native
  trait UnsupportedAvailabilityZoneException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  @js.native
  trait UpdateFileSystemRequest extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var ThroughputMode: js.UndefOr[ThroughputMode]
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
  }

  object UpdateFileSystemRequest {
    def apply(
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined,
      ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined): UpdateFileSystemRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "ThroughputMode" -> ThroughputMode.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughputInMibps" -> ProvisionedThroughputInMibps.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFileSystemRequest]
    }
  }
}
