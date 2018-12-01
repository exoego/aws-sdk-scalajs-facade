package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object fsx {
  type AWSAccountId = String
  type ArchivePath = String
  type AutomaticBackupRetentionDays = Int
  type BackupId = String
  type BackupIds = js.Array[BackupId]
  type BackupLifecycle = String
  type BackupType = String
  type Backups = js.Array[Backup]
  type ClientRequestToken = String
  type CreationTime = js.Date
  type DNSName = String
  type DailyTime = String
  type DirectoryId = String
  type ErrorMessage = String
  type FileSystemId = String
  type FileSystemIds = js.Array[FileSystemId]
  type FileSystemLifecycle = String
  type FileSystemMaintenanceOperation = String
  type FileSystemMaintenanceOperations = js.Array[FileSystemMaintenanceOperation]
  type FileSystemType = String
  type FileSystems = js.Array[FileSystem]
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Flag = Boolean
  type KmsKeyId = String
  type MaxResults = Int
  type Megabytes = Int
  type MegabytesPerSecond = Int
  type NetworkInterfaceId = String
  type NetworkInterfaceIds = js.Array[NetworkInterfaceId]
  type NextToken = String
  type ProgressPercent = Int
  type ResourceARN = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type StorageCapacity = Int
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type VpcId = String
  type WeeklyTime = String
}

package fsx {
  @js.native
  @JSImport("aws-sdk", "FSx")
  class FSx(config: AWSConfig) extends js.Object {
    def createBackup(params: CreateBackupRequest): Request[CreateBackupResponse] = js.native
    def createFileSystem(params: CreateFileSystemRequest): Request[CreateFileSystemResponse] = js.native
    def createFileSystemFromBackup(params: CreateFileSystemFromBackupRequest): Request[CreateFileSystemFromBackupResponse] = js.native
    def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse] = js.native
    def deleteFileSystem(params: DeleteFileSystemRequest): Request[DeleteFileSystemResponse] = js.native
    def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse] = js.native
    def describeFileSystems(params: DescribeFileSystemsRequest): Request[DescribeFileSystemsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateFileSystem(params: UpdateFileSystemRequest): Request[UpdateFileSystemResponse] = js.native
  }

  /**
   * <p>A backup of an Amazon FSx for Windows File Server file system. You can create a new file system from a backup to protect against data loss.</p>
   */
  @js.native
  trait Backup extends js.Object {
    var Lifecycle: js.UndefOr[BackupLifecycle]
    var FileSystem: js.UndefOr[FileSystem]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var ResourceARN: js.UndefOr[ResourceARN]
    var BackupId: js.UndefOr[BackupId]
    var Tags: js.UndefOr[Tags]
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var FailureDetails: js.UndefOr[BackupFailureDetails]
    var Type: js.UndefOr[BackupType]
    var CreationTime: js.UndefOr[CreationTime]
  }

  object Backup {
    def apply(
      Lifecycle: js.UndefOr[BackupLifecycle] = js.undefined,
      FileSystem: js.UndefOr[FileSystem] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      BackupId: js.UndefOr[BackupId] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
      FailureDetails: js.UndefOr[BackupFailureDetails] = js.undefined,
      Type: js.UndefOr[BackupType] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined): Backup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Lifecycle" -> Lifecycle.map { x => x.asInstanceOf[js.Any] },
        "FileSystem" -> FileSystem.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ProgressPercent" -> ProgressPercent.map { x => x.asInstanceOf[js.Any] },
        "FailureDetails" -> FailureDetails.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Backup]
    }
  }

  /**
   * <p>If backup creation fails, this structure contains the details of that failure.</p>
   */
  @js.native
  trait BackupFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  object BackupFailureDetails {
    def apply(
      Message: js.UndefOr[ErrorMessage] = js.undefined): BackupFailureDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackupFailureDetails]
    }
  }

  /**
   * <p>The lifecycle status of the backup.</p>
   */
  object BackupLifecycleEnum {
    val AVAILABLE = "AVAILABLE"
    val CREATING = "CREATING"
    val DELETED = "DELETED"
    val FAILED = "FAILED"

    val values = IndexedSeq(AVAILABLE, CREATING, DELETED, FAILED)
  }

  /**
   * <p>The type of the backup.</p>
   */
  object BackupTypeEnum {
    val AUTOMATIC = "AUTOMATIC"
    val USER_INITIATED = "USER_INITIATED"

    val values = IndexedSeq(AUTOMATIC, USER_INITIATED)
  }

  /**
   * <p>The request object for the <code>CreateBackup</code> operation.</p>
   */
  @js.native
  trait CreateBackupRequest extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[Tags]
  }

  object CreateBackupRequest {
    def apply(
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): CreateBackupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBackupRequest]
    }
  }

  /**
   * <p>The response object for the <code>CreateBackup</code> operation.</p>
   */
  @js.native
  trait CreateBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  object CreateBackupResponse {
    def apply(
      Backup: js.UndefOr[Backup] = js.undefined): CreateBackupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Backup" -> Backup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBackupResponse]
    }
  }

  /**
   * <p>The request object for the <code>CreateFileSystemFromBackup</code> operation.</p>
   */
  @js.native
  trait CreateFileSystemFromBackupRequest extends js.Object {
    var BackupId: js.UndefOr[BackupId]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[Tags]
    var SubnetIds: js.UndefOr[SubnetIds]
    var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration]
  }

  object CreateFileSystemFromBackupRequest {
    def apply(
      BackupId: js.UndefOr[BackupId] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined): CreateFileSystemFromBackupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "WindowsConfiguration" -> WindowsConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFileSystemFromBackupRequest]
    }
  }

  /**
   * <p>The response object for the <code>CreateFileSystemFromBackup</code> operation.</p>
   */
  @js.native
  trait CreateFileSystemFromBackupResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  object CreateFileSystemFromBackupResponse {
    def apply(
      FileSystem: js.UndefOr[FileSystem] = js.undefined): CreateFileSystemFromBackupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystem" -> FileSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFileSystemFromBackupResponse]
    }
  }

  /**
   * <p>The configuration object for Lustre file systems used in the <code>CreateFileSystem</code> operation.</p>
   */
  @js.native
  trait CreateFileSystemLustreConfiguration extends js.Object {
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
    var ImportPath: js.UndefOr[ArchivePath]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
  }

  object CreateFileSystemLustreConfiguration {
    def apply(
      WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined,
      ImportPath: js.UndefOr[ArchivePath] = js.undefined,
      ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined): CreateFileSystemLustreConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WeeklyMaintenanceStartTime" -> WeeklyMaintenanceStartTime.map { x => x.asInstanceOf[js.Any] },
        "ImportPath" -> ImportPath.map { x => x.asInstanceOf[js.Any] },
        "ImportedFileChunkSize" -> ImportedFileChunkSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFileSystemLustreConfiguration]
    }
  }

  /**
   * <p>The request object for the <code>CreateFileSystem</code> operation.</p>
   */
  @js.native
  trait CreateFileSystemRequest extends js.Object {
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var StorageCapacity: js.UndefOr[StorageCapacity]
    var FileSystemType: js.UndefOr[FileSystemType]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[Tags]
    var SubnetIds: js.UndefOr[SubnetIds]
    var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration]
  }

  object CreateFileSystemRequest {
    def apply(
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      StorageCapacity: js.UndefOr[StorageCapacity] = js.undefined,
      FileSystemType: js.UndefOr[FileSystemType] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
      LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined): CreateFileSystemRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "StorageCapacity" -> StorageCapacity.map { x => x.asInstanceOf[js.Any] },
        "FileSystemType" -> FileSystemType.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "LustreConfiguration" -> LustreConfiguration.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "WindowsConfiguration" -> WindowsConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFileSystemRequest]
    }
  }

  /**
   * <p>The response object for the <code>CreateFileSystem</code> operation.</p>
   */
  @js.native
  trait CreateFileSystemResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  object CreateFileSystemResponse {
    def apply(
      FileSystem: js.UndefOr[FileSystem] = js.undefined): CreateFileSystemResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystem" -> FileSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFileSystemResponse]
    }
  }

  /**
   * <p>The configuration object for the Microsoft Windows file system used in <code>CreateFileSystem</code> and <code>CreateFileSystemFromBackup</code> operations.</p>
   */
  @js.native
  trait CreateFileSystemWindowsConfiguration extends js.Object {
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
  }

  object CreateFileSystemWindowsConfiguration {
    def apply(
      WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined,
      ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
      AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
      ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
      DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined): CreateFileSystemWindowsConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WeeklyMaintenanceStartTime" -> WeeklyMaintenanceStartTime.map { x => x.asInstanceOf[js.Any] },
        "ActiveDirectoryId" -> ActiveDirectoryId.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToBackups" -> CopyTagsToBackups.map { x => x.asInstanceOf[js.Any] },
        "AutomaticBackupRetentionDays" -> AutomaticBackupRetentionDays.map { x => x.asInstanceOf[js.Any] },
        "ThroughputCapacity" -> ThroughputCapacity.map { x => x.asInstanceOf[js.Any] },
        "DailyAutomaticBackupStartTime" -> DailyAutomaticBackupStartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFileSystemWindowsConfiguration]
    }
  }

  /**
   * <p>The data repository configuration object for Lustre file systems returned in the response of the <code>CreateFileSystem</code> operation.</p>
   */
  @js.native
  trait DataRepositoryConfiguration extends js.Object {
    var ImportPath: js.UndefOr[ArchivePath]
    var ExportPath: js.UndefOr[ArchivePath]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
  }

  object DataRepositoryConfiguration {
    def apply(
      ImportPath: js.UndefOr[ArchivePath] = js.undefined,
      ExportPath: js.UndefOr[ArchivePath] = js.undefined,
      ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined): DataRepositoryConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImportPath" -> ImportPath.map { x => x.asInstanceOf[js.Any] },
        "ExportPath" -> ExportPath.map { x => x.asInstanceOf[js.Any] },
        "ImportedFileChunkSize" -> ImportedFileChunkSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataRepositoryConfiguration]
    }
  }

  /**
   * <p>The request object for <code>DeleteBackup</code> operation.</p>
   */
  @js.native
  trait DeleteBackupRequest extends js.Object {
    var BackupId: js.UndefOr[BackupId]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object DeleteBackupRequest {
    def apply(
      BackupId: js.UndefOr[BackupId] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined): DeleteBackupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupRequest]
    }
  }

  /**
   * <p>The response object for <code>DeleteBackup</code> operation.</p>
   */
  @js.native
  trait DeleteBackupResponse extends js.Object {
    var BackupId: js.UndefOr[BackupId]
    var Lifecycle: js.UndefOr[BackupLifecycle]
  }

  object DeleteBackupResponse {
    def apply(
      BackupId: js.UndefOr[BackupId] = js.undefined,
      Lifecycle: js.UndefOr[BackupLifecycle] = js.undefined): DeleteBackupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] },
        "Lifecycle" -> Lifecycle.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupResponse]
    }
  }

  /**
   * <p>The request object for <code>DeleteFileSystem</code> operation.</p>
   */
  @js.native
  trait DeleteFileSystemRequest extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration]
  }

  object DeleteFileSystemRequest {
    def apply(
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration] = js.undefined): DeleteFileSystemRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "WindowsConfiguration" -> WindowsConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileSystemRequest]
    }
  }

  /**
   * <p>The response object for the <code>DeleteFileSystem</code> operation.</p>
   */
  @js.native
  trait DeleteFileSystemResponse extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var Lifecycle: js.UndefOr[FileSystemLifecycle]
    var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse]
  }

  object DeleteFileSystemResponse {
    def apply(
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined,
      WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.undefined): DeleteFileSystemResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "Lifecycle" -> Lifecycle.map { x => x.asInstanceOf[js.Any] },
        "WindowsResponse" -> WindowsResponse.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileSystemResponse]
    }
  }

  /**
   * <p>The configuration object for the Microsoft Windows file system used in the <code>DeleteFileSystem</code> operation.</p>
   */
  @js.native
  trait DeleteFileSystemWindowsConfiguration extends js.Object {
    var SkipFinalBackup: js.UndefOr[Flag]
    var FinalBackupTags: js.UndefOr[Tags]
  }

  object DeleteFileSystemWindowsConfiguration {
    def apply(
      SkipFinalBackup: js.UndefOr[Flag] = js.undefined,
      FinalBackupTags: js.UndefOr[Tags] = js.undefined): DeleteFileSystemWindowsConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkipFinalBackup" -> SkipFinalBackup.map { x => x.asInstanceOf[js.Any] },
        "FinalBackupTags" -> FinalBackupTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileSystemWindowsConfiguration]
    }
  }

  /**
   * <p>The response object for the Microsoft Windows file system used in the <code>DeleteFileSystem</code> operation.</p>
   */
  @js.native
  trait DeleteFileSystemWindowsResponse extends js.Object {
    var FinalBackupId: js.UndefOr[BackupId]
    var FinalBackupTags: js.UndefOr[Tags]
  }

  object DeleteFileSystemWindowsResponse {
    def apply(
      FinalBackupId: js.UndefOr[BackupId] = js.undefined,
      FinalBackupTags: js.UndefOr[Tags] = js.undefined): DeleteFileSystemWindowsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FinalBackupId" -> FinalBackupId.map { x => x.asInstanceOf[js.Any] },
        "FinalBackupTags" -> FinalBackupTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileSystemWindowsResponse]
    }
  }

  /**
   * <p>The request object for <code>DescribeBackups</code> operation.</p>
   */
  @js.native
  trait DescribeBackupsRequest extends js.Object {
    var BackupIds: js.UndefOr[BackupIds]
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeBackupsRequest {
    def apply(
      BackupIds: js.UndefOr[BackupIds] = js.undefined,
      Filters: js.UndefOr[Filters] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeBackupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupIds" -> BackupIds.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupsRequest]
    }
  }

  /**
   * <p>Response object for <code>DescribeBackups</code> operation.</p>
   */
  @js.native
  trait DescribeBackupsResponse extends js.Object {
    var Backups: js.UndefOr[Backups]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeBackupsResponse {
    def apply(
      Backups: js.UndefOr[Backups] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeBackupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Backups" -> Backups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupsResponse]
    }
  }

  /**
   * <p>The request object for <code>DescribeFileSystems</code> operation.</p>
   */
  @js.native
  trait DescribeFileSystemsRequest extends js.Object {
    var FileSystemIds: js.UndefOr[FileSystemIds]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeFileSystemsRequest {
    def apply(
      FileSystemIds: js.UndefOr[FileSystemIds] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeFileSystemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemIds" -> FileSystemIds.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFileSystemsRequest]
    }
  }

  /**
   * <p>The response object for <code>DescribeFileSystems</code> operation.</p>
   */
  @js.native
  trait DescribeFileSystemsResponse extends js.Object {
    var FileSystems: js.UndefOr[FileSystems]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeFileSystemsResponse {
    def apply(
      FileSystems: js.UndefOr[FileSystems] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeFileSystemsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystems" -> FileSystems.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFileSystemsResponse]
    }
  }

  /**
   * <p>A description of a specific Amazon FSx file system.</p>
   */
  @js.native
  trait FileSystem extends js.Object {
    var Lifecycle: js.UndefOr[FileSystemLifecycle]
    var NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIds]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var ResourceARN: js.UndefOr[ResourceARN]
    var FileSystemId: js.UndefOr[FileSystemId]
    var StorageCapacity: js.UndefOr[StorageCapacity]
    var FileSystemType: js.UndefOr[FileSystemType]
    var OwnerId: js.UndefOr[AWSAccountId]
    var LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration]
    var Tags: js.UndefOr[Tags]
    var SubnetIds: js.UndefOr[SubnetIds]
    var WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration]
    var DNSName: js.UndefOr[DNSName]
    var FailureDetails: js.UndefOr[FileSystemFailureDetails]
    var CreationTime: js.UndefOr[CreationTime]
    var VpcId: js.UndefOr[VpcId]
  }

  object FileSystem {
    def apply(
      Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined,
      NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIds] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      StorageCapacity: js.UndefOr[StorageCapacity] = js.undefined,
      FileSystemType: js.UndefOr[FileSystemType] = js.undefined,
      OwnerId: js.UndefOr[AWSAccountId] = js.undefined,
      LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration] = js.undefined,
      DNSName: js.UndefOr[DNSName] = js.undefined,
      FailureDetails: js.UndefOr[FileSystemFailureDetails] = js.undefined,
      CreationTime: js.UndefOr[CreationTime] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined): FileSystem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Lifecycle" -> Lifecycle.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceIds" -> NetworkInterfaceIds.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "StorageCapacity" -> StorageCapacity.map { x => x.asInstanceOf[js.Any] },
        "FileSystemType" -> FileSystemType.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] },
        "LustreConfiguration" -> LustreConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "WindowsConfiguration" -> WindowsConfiguration.map { x => x.asInstanceOf[js.Any] },
        "DNSName" -> DNSName.map { x => x.asInstanceOf[js.Any] },
        "FailureDetails" -> FailureDetails.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileSystem]
    }
  }

  /**
   * <p>Structure providing details of any failures that occur when creating the file system has failed.</p>
   */
  @js.native
  trait FileSystemFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  object FileSystemFailureDetails {
    def apply(
      Message: js.UndefOr[ErrorMessage] = js.undefined): FileSystemFailureDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileSystemFailureDetails]
    }
  }

  /**
   * <p>The lifecycle status of the file system.</p>
   */
  object FileSystemLifecycleEnum {
    val AVAILABLE = "AVAILABLE"
    val CREATING = "CREATING"
    val FAILED = "FAILED"
    val DELETING = "DELETING"

    val values = IndexedSeq(AVAILABLE, CREATING, FAILED, DELETING)
  }

  /**
   * <p>An enumeration specifying the currently ongoing maintenance operation.</p>
   */
  object FileSystemMaintenanceOperationEnum {
    val PATCHING = "PATCHING"
    val BACKING_UP = "BACKING_UP"

    val values = IndexedSeq(PATCHING, BACKING_UP)
  }

  /**
   * <p>The type of file system.</p>
   */
  object FileSystemTypeEnum {
    val WINDOWS = "WINDOWS"
    val LUSTRE = "LUSTRE"

    val values = IndexedSeq(WINDOWS, LUSTRE)
  }

  /**
   * <p>A filter used to restrict the results of describe calls. You can use multiple filters to return results that meet all applied filter requirements.</p>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  object Filter {
    def apply(
      Name: js.UndefOr[FilterName] = js.undefined,
      Values: js.UndefOr[FilterValues] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  /**
   * <p>The name for a filter.</p>
   */
  object FilterNameEnum {
    val `file-system-id` = "file-system-id"
    val `backup-type` = "backup-type"

    val values = IndexedSeq(`file-system-id`, `backup-type`)
  }

  /**
   * <p>The request object for <code>ListTagsForResource</code> operation.</p>
   */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
   * <p>The response object for <code>ListTagsForResource</code> operation.</p>
   */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceResponse {
    def apply(
      Tags: js.UndefOr[Tags] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
   * <p>The configuration for the Amazon FSx for Lustre file system.</p>
   */
  @js.native
  trait LustreFileSystemConfiguration extends js.Object {
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
    var DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration]
  }

  object LustreFileSystemConfiguration {
    def apply(
      WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined,
      DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration] = js.undefined): LustreFileSystemConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WeeklyMaintenanceStartTime" -> WeeklyMaintenanceStartTime.map { x => x.asInstanceOf[js.Any] },
        "DataRepositoryConfiguration" -> DataRepositoryConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LustreFileSystemConfiguration]
    }
  }

  /**
   * <p>Specifies a key-value pair for a resource tag.</p>
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
   * <p>The request object for the <code>TagResource</code> operation.</p>
   */
  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[Tags]
  }

  object TagResourceRequest {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  /**
   * <p>The response object for the <code>TagResource</code> operation.</p>
   */
  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  /**
   * <p>The request object for <code>UntagResource</code> action.</p>
   */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var TagKeys: js.UndefOr[TagKeys]
  }

  object UntagResourceRequest {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      TagKeys: js.UndefOr[TagKeys] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  /**
   * <p>The response object for <code>UntagResource</code> action.</p>
   */
  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  /**
   * <p>The configuration object for Amazon FSx for Lustre file systems used in the <code>UpdateFileSystem</code> operation.</p>
   */
  @js.native
  trait UpdateFileSystemLustreConfiguration extends js.Object {
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object UpdateFileSystemLustreConfiguration {
    def apply(
      WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined): UpdateFileSystemLustreConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WeeklyMaintenanceStartTime" -> WeeklyMaintenanceStartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFileSystemLustreConfiguration]
    }
  }

  /**
   * <p>The request object for the <code>UpdateFileSystem</code> operation.</p>
   */
  @js.native
  trait UpdateFileSystemRequest extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration]
    var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration]
  }

  object UpdateFileSystemRequest {
    def apply(
      FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.undefined,
      LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.undefined): UpdateFileSystemRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystemId" -> FileSystemId.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "WindowsConfiguration" -> WindowsConfiguration.map { x => x.asInstanceOf[js.Any] },
        "LustreConfiguration" -> LustreConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFileSystemRequest]
    }
  }

  /**
   * <p>The response object for the <code>UpdateFileSystem</code> operation.</p>
   */
  @js.native
  trait UpdateFileSystemResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  object UpdateFileSystemResponse {
    def apply(
      FileSystem: js.UndefOr[FileSystem] = js.undefined): UpdateFileSystemResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileSystem" -> FileSystem.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFileSystemResponse]
    }
  }

  /**
   * <p>The configuration object for the Microsoft Windows file system used in the <code>UpdateFileSystem</code> operation.</p>
   */
  @js.native
  trait UpdateFileSystemWindowsConfiguration extends js.Object {
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
  }

  object UpdateFileSystemWindowsConfiguration {
    def apply(
      WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined,
      DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
      AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined): UpdateFileSystemWindowsConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WeeklyMaintenanceStartTime" -> WeeklyMaintenanceStartTime.map { x => x.asInstanceOf[js.Any] },
        "DailyAutomaticBackupStartTime" -> DailyAutomaticBackupStartTime.map { x => x.asInstanceOf[js.Any] },
        "AutomaticBackupRetentionDays" -> AutomaticBackupRetentionDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFileSystemWindowsConfiguration]
    }
  }

  /**
   * <p>The configuration for this Microsoft Windows file system.</p>
   */
  @js.native
  trait WindowsFileSystemConfiguration extends js.Object {
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations]
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
  }

  object WindowsFileSystemConfiguration {
    def apply(
      WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined,
      ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
      CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
      AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
      MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations] = js.undefined,
      ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
      DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined): WindowsFileSystemConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "WeeklyMaintenanceStartTime" -> WeeklyMaintenanceStartTime.map { x => x.asInstanceOf[js.Any] },
        "ActiveDirectoryId" -> ActiveDirectoryId.map { x => x.asInstanceOf[js.Any] },
        "CopyTagsToBackups" -> CopyTagsToBackups.map { x => x.asInstanceOf[js.Any] },
        "AutomaticBackupRetentionDays" -> AutomaticBackupRetentionDays.map { x => x.asInstanceOf[js.Any] },
        "MaintenanceOperationsInProgress" -> MaintenanceOperationsInProgress.map { x => x.asInstanceOf[js.Any] },
        "ThroughputCapacity" -> ThroughputCapacity.map { x => x.asInstanceOf[js.Any] },
        "DailyAutomaticBackupStartTime" -> DailyAutomaticBackupStartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WindowsFileSystemConfiguration]
    }
  }
}
