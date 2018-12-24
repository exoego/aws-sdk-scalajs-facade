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
  class EFS() extends js.Object {
    def this(config: AWSConfig) = this()

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
   * Returned if the request is malformed or contains an error such as an invalid parameter value or a missing required parameter.
   */
  @js.native
  trait BadRequestException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  @js.native
  trait CreateFileSystemRequest extends js.Object {
    var CreationToken: CreationToken
    var Encrypted: js.UndefOr[Encrypted]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var PerformanceMode: js.UndefOr[PerformanceMode]
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }

  object CreateFileSystemRequest {
    def apply(
      CreationToken: CreationToken,
      Encrypted: js.UndefOr[Encrypted] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      PerformanceMode: js.UndefOr[PerformanceMode] = js.undefined,
      ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
      ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined): CreateFileSystemRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationToken" -> CreationToken.asInstanceOf[js.Any],
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "PerformanceMode" -> PerformanceMode.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughputInMibps" -> ProvisionedThroughputInMibps.map { x => x.asInstanceOf[js.Any] },
        "ThroughputMode" -> ThroughputMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFileSystemRequest]
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
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined): CreateMountTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any],
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
    var FileSystemId: FileSystemId
    var Tags: Tags
  }

  object CreateTagsRequest {
    def apply(
      FileSystemId: FileSystemId,
      Tags: Tags): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
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
      FileSystemId: FileSystemId): DeleteFileSystemRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileSystemRequest]
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
      MountTargetId: MountTargetId): DeleteMountTargetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MountTargetId" -> MountTargetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMountTargetRequest]
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
      TagKeys: TagKeys): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  /**
   * The service timed out trying to fulfill the request, and the client should try the call again.
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
      MaxItems: js.UndefOr[MaxItems] = js.undefined): DescribeFileSystemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationToken" -> CreationToken.map { x => x.asInstanceOf[js.Any] },
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFileSystemsRequest]
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
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeFileSystemsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystems" -> FileSystems.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFileSystemsResponse]
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
      MountTargetId: MountTargetId): DescribeMountTargetSecurityGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MountTargetId" -> MountTargetId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMountTargetSecurityGroupsRequest]
    }
  }

  @js.native
  trait DescribeMountTargetSecurityGroupsResponse extends js.Object {
    var SecurityGroups: SecurityGroups
  }

  object DescribeMountTargetSecurityGroupsResponse {
    def apply(
      SecurityGroups: SecurityGroups): DescribeMountTargetSecurityGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroups" -> SecurityGroups.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMountTargetSecurityGroupsResponse]
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
      MountTargetId: js.UndefOr[MountTargetId] = js.undefined): DescribeMountTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
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
    var FileSystemId: FileSystemId
    var Marker: js.UndefOr[Marker]
    var MaxItems: js.UndefOr[MaxItems]
  }

  object DescribeTagsRequest {
    def apply(
      FileSystemId: FileSystemId,
      Marker: js.UndefOr[Marker] = js.undefined,
      MaxItems: js.UndefOr[MaxItems] = js.undefined): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
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
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResponse]
    }
  }

  /**
   * Returned if the file system you are trying to create already exists, with the creation token you provided.
   */
  @js.native
  trait FileSystemAlreadyExistsException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
    val FileSystemId: FileSystemId
  }

  /**
   * Description of the file system.
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
      Encrypted: js.UndefOr[Encrypted] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      Name: js.UndefOr[TagValue] = js.undefined,
      ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
      ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined): FileSystemDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "CreationToken" -> CreationToken.asInstanceOf[js.Any],
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "LifeCycleState" -> LifeCycleState.asInstanceOf[js.Any],
        "NumberOfMountTargets" -> NumberOfMountTargets.asInstanceOf[js.Any],
        "OwnerId" -> OwnerId.asInstanceOf[js.Any],
        "PerformanceMode" -> PerformanceMode.asInstanceOf[js.Any],
        "SizeInBytes" -> SizeInBytes.asInstanceOf[js.Any],
        "Encrypted" -> Encrypted.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedThroughputInMibps" -> ProvisionedThroughputInMibps.map { x => x.asInstanceOf[js.Any] },
        "ThroughputMode" -> ThroughputMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileSystemDescription]
    }
  }

  /**
   * Returned if a file system has mount targets.
   */
  @js.native
  trait FileSystemInUseException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Returned if the AWS account has already created the maximum number of file systems allowed per account.
   */
  @js.native
  trait FileSystemLimitExceededException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Returned if the specified <code>FileSystemId</code> value doesn't exist in the requester's AWS account.
   */
  @js.native
  trait FileSystemNotFoundException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code> field, and the time at which that size was determined in its <code>Timestamp</code> field. Note that the value does not represent the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to the file system. That is, the value will represent the actual size only if the file system is not modified for a period longer than a couple of hours. Otherwise, the value is not necessarily the exact size the file system was at any instant in time.
   */
  @js.native
  trait FileSystemSize extends js.Object {
    var Value: FileSystemSizeValue
    var Timestamp: js.UndefOr[Timestamp]
  }

  object FileSystemSize {
    def apply(
      Value: FileSystemSizeValue,
      Timestamp: js.UndefOr[Timestamp] = js.undefined): FileSystemSize = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileSystemSize]
    }
  }

  /**
   * Returned if the file system's lifecycle state is not "available".
   */
  @js.native
  trait IncorrectFileSystemLifeCycleStateException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Returned if the mount target is not in the correct state for the operation.
   */
  @js.native
  trait IncorrectMountTargetStateException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Returned if there's not enough capacity to provision additional throughput. This value might be returned when you try to create a file system in provisioned throughput mode, when you attempt to increase the provisioned throughput of an existing file system, or when you attempt to change an existing file system from bursting to provisioned throughput mode.
   */
  @js.native
  trait InsufficientThroughputCapacityException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Returned if an error occurred on the server side.
   */
  @js.native
  trait InternalServerErrorException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Returned if the request specified an <code>IpAddress</code> that is already in use in the subnet.
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
    var MountTargetId: MountTargetId
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  object ModifyMountTargetSecurityGroupsRequest {
    def apply(
      MountTargetId: MountTargetId,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined): ModifyMountTargetSecurityGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MountTargetId" -> MountTargetId.asInstanceOf[js.Any],
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyMountTargetSecurityGroupsRequest]
    }
  }

  /**
   * Returned if the mount target would violate one of the specified restrictions based on the file system's existing mount targets.
   */
  @js.native
  trait MountTargetConflictException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
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
      OwnerId: js.UndefOr[AwsAccountId] = js.undefined): MountTargetDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "LifeCycleState" -> LifeCycleState.asInstanceOf[js.Any],
        "MountTargetId" -> MountTargetId.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any],
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MountTargetDescription]
    }
  }

  /**
   * Returned if there is no mount target with the specified ID found in the caller's account.
   */
  @js.native
  trait MountTargetNotFoundException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * The calling account has reached the limit for elastic network interfaces for the specific AWS Region. The client should try to delete some elastic network interfaces or get the account limit raised. For more information, see <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Appendix_Limits.html">Amazon VPC Limits</a> in the <i>Amazon VPC User Guide </i> (see the Network interfaces per VPC entry in the table).
   */
  @js.native
  trait NetworkInterfaceLimitExceededException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Returned if <code>IpAddress</code> was not specified in the request and there are no free IP addresses in the subnet.
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
   * Returned if the size of <code>SecurityGroups</code> specified in the request is greater than five.
   */
  @js.native
  trait SecurityGroupLimitExceededException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Returned if one of the specified security groups doesn't exist in the subnet's VPC.
   */
  @js.native
  trait SecurityGroupNotFoundException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * Returned if there is no subnet with ID <code>SubnetId</code> provided in the request.
   */
  @js.native
  trait SubnetNotFoundException extends js.Object {
    val ErrorCode: ErrorCode
    val Message: ErrorMessage
  }

  /**
   * A tag is a key-value pair. Allowed characters: letters, whitespace, and numbers, representable in UTF-8, and the following characters:<code> + - = . _ : /</code>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: TagValue): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * Returned if the throughput mode or amount of provisioned throughput can't be changed because the throughput limit of 1024 MiB/s has been reached.
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
   * Returned if you don�ft wait at least 24 hours before changing the throughput mode, or decreasing the Provisioned Throughput value.
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
    var FileSystemId: FileSystemId
    var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps]
    var ThroughputMode: js.UndefOr[ThroughputMode]
  }

  object UpdateFileSystemRequest {
    def apply(
      FileSystemId: FileSystemId,
      ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
      ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined): UpdateFileSystemRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "ProvisionedThroughputInMibps" -> ProvisionedThroughputInMibps.map { x => x.asInstanceOf[js.Any] },
        "ThroughputMode" -> ThroughputMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFileSystemRequest]
    }
  }
}
