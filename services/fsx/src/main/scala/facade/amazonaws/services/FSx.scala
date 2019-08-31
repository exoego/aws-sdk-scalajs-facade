package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object fsx {
  type AWSAccountId                        = String
  type ActiveDirectoryFullyQualifiedName   = String
  type ArchivePath                         = String
  type AutomaticBackupRetentionDays        = Int
  type BackupId                            = String
  type BackupIds                           = js.Array[BackupId]
  type BackupLifecycle                     = String
  type BackupType                          = String
  type Backups                             = js.Array[Backup]
  type ClientRequestToken                  = String
  type CreationTime                        = js.Date
  type DNSName                             = String
  type DailyTime                           = String
  type DirectoryId                         = String
  type DirectoryPassword                   = String
  type DirectoryUserName                   = String
  type DnsIps                              = js.Array[IpAddress]
  type ErrorMessage                        = String
  type FileSystemAdministratorsGroupName   = String
  type FileSystemId                        = String
  type FileSystemIds                       = js.Array[FileSystemId]
  type FileSystemLifecycle                 = String
  type FileSystemMaintenanceOperation      = String
  type FileSystemMaintenanceOperations     = js.Array[FileSystemMaintenanceOperation]
  type FileSystemType                      = String
  type FileSystems                         = js.Array[FileSystem]
  type FilterName                          = String
  type FilterValue                         = String
  type FilterValues                        = js.Array[FilterValue]
  type Filters                             = js.Array[Filter]
  type Flag                                = Boolean
  type IpAddress                           = String
  type KmsKeyId                            = String
  type MaxResults                          = Int
  type Megabytes                           = Int
  type MegabytesPerSecond                  = Int
  type NetworkInterfaceId                  = String
  type NetworkInterfaceIds                 = js.Array[NetworkInterfaceId]
  type NextToken                           = String
  type OrganizationalUnitDistinguishedName = String
  type ProgressPercent                     = Int
  type ResourceARN                         = String
  type SecurityGroupId                     = String
  type SecurityGroupIds                    = js.Array[SecurityGroupId]
  type StorageCapacity                     = Int
  type SubnetId                            = String
  type SubnetIds                           = js.Array[SubnetId]
  type TagKey                              = String
  type TagKeys                             = js.Array[TagKey]
  type TagValue                            = String
  type Tags                                = js.Array[Tag]
  type VpcId                               = String
  type WeeklyTime                          = String

  implicit final class FSxOps(private val service: FSx) extends AnyVal {

    def createBackupFuture(params: CreateBackupRequest): Future[CreateBackupResponse] =
      service.createBackup(params).promise.toFuture
    def createFileSystemFromBackupFuture(
        params: CreateFileSystemFromBackupRequest
    ): Future[CreateFileSystemFromBackupResponse] = service.createFileSystemFromBackup(params).promise.toFuture
    def createFileSystemFuture(params: CreateFileSystemRequest): Future[CreateFileSystemResponse] =
      service.createFileSystem(params).promise.toFuture
    def deleteBackupFuture(params: DeleteBackupRequest): Future[DeleteBackupResponse] =
      service.deleteBackup(params).promise.toFuture
    def deleteFileSystemFuture(params: DeleteFileSystemRequest): Future[DeleteFileSystemResponse] =
      service.deleteFileSystem(params).promise.toFuture
    def describeBackupsFuture(params: DescribeBackupsRequest): Future[DescribeBackupsResponse] =
      service.describeBackups(params).promise.toFuture
    def describeFileSystemsFuture(params: DescribeFileSystemsRequest): Future[DescribeFileSystemsResponse] =
      service.describeFileSystems(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateFileSystemFuture(params: UpdateFileSystemRequest): Future[UpdateFileSystemResponse] =
      service.updateFileSystem(params).promise.toFuture
  }
}

package fsx {
  @js.native
  @JSImport("aws-sdk", "FSx")
  class FSx() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBackup(params: CreateBackupRequest): Request[CreateBackupResponse]             = js.native
    def createFileSystem(params: CreateFileSystemRequest): Request[CreateFileSystemResponse] = js.native
    def createFileSystemFromBackup(
        params: CreateFileSystemFromBackupRequest
    ): Request[CreateFileSystemFromBackupResponse]                                                    = js.native
    def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse]                      = js.native
    def deleteFileSystem(params: DeleteFileSystemRequest): Request[DeleteFileSystemResponse]          = js.native
    def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse]             = js.native
    def describeFileSystems(params: DescribeFileSystemsRequest): Request[DescribeFileSystemsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateFileSystem(params: UpdateFileSystemRequest): Request[UpdateFileSystemResponse]          = js.native
  }

  /**
    * The Microsoft AD attributes of the Amazon FSx for Windows File Server file system.
    */
  @js.native
  trait ActiveDirectoryBackupAttributes extends js.Object {
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName]
  }

  object ActiveDirectoryBackupAttributes {
    @inline
    def apply(
        ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.undefined
    ): ActiveDirectoryBackupAttributes = {
      val __obj = js.Dynamic.literal()
      ActiveDirectoryId.foreach(__v => __obj.updateDynamic("ActiveDirectoryId")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveDirectoryBackupAttributes]
    }
  }

  /**
    * A backup of an Amazon FSx for Windows File Server file system. You can create a new file system from a backup to protect against data loss.
    */
  @js.native
  trait Backup extends js.Object {
    var BackupId: BackupId
    var CreationTime: CreationTime
    var FileSystem: FileSystem
    var Lifecycle: BackupLifecycle
    var Type: BackupType
    var DirectoryInformation: js.UndefOr[ActiveDirectoryBackupAttributes]
    var FailureDetails: js.UndefOr[BackupFailureDetails]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[Tags]
  }

  object Backup {
    @inline
    def apply(
        BackupId: BackupId,
        CreationTime: CreationTime,
        FileSystem: FileSystem,
        Lifecycle: BackupLifecycle,
        Type: BackupType,
        DirectoryInformation: js.UndefOr[ActiveDirectoryBackupAttributes] = js.undefined,
        FailureDetails: js.UndefOr[BackupFailureDetails] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): Backup = {
      val __obj = js.Dynamic.literal(
        "BackupId"     -> BackupId.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "FileSystem"   -> FileSystem.asInstanceOf[js.Any],
        "Lifecycle"    -> Lifecycle.asInstanceOf[js.Any],
        "Type"         -> Type.asInstanceOf[js.Any]
      )

      DirectoryInformation.foreach(__v => __obj.updateDynamic("DirectoryInformation")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      ProgressPercent.foreach(__v => __obj.updateDynamic("ProgressPercent")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Backup]
    }
  }

  /**
    * If backup creation fails, this structure contains the details of that failure.
    */
  @js.native
  trait BackupFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  object BackupFailureDetails {
    @inline
    def apply(
        Message: js.UndefOr[ErrorMessage] = js.undefined
    ): BackupFailureDetails = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupFailureDetails]
    }
  }

  /**
    * The lifecycle status of the backup.
    */
  object BackupLifecycleEnum {
    val AVAILABLE = "AVAILABLE"
    val CREATING  = "CREATING"
    val DELETED   = "DELETED"
    val FAILED    = "FAILED"

    val values = js.Object.freeze(js.Array(AVAILABLE, CREATING, DELETED, FAILED))
  }

  /**
    * The type of the backup.
    */
  object BackupTypeEnum {
    val AUTOMATIC      = "AUTOMATIC"
    val USER_INITIATED = "USER_INITIATED"

    val values = js.Object.freeze(js.Array(AUTOMATIC, USER_INITIATED))
  }

  /**
    * The request object for the <code>CreateBackup</code> operation.
    */
  @js.native
  trait CreateBackupRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[Tags]
  }

  object CreateBackupRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateBackupRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupRequest]
    }
  }

  /**
    * The response object for the <code>CreateBackup</code> operation.
    */
  @js.native
  trait CreateBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  object CreateBackupResponse {
    @inline
    def apply(
        Backup: js.UndefOr[Backup] = js.undefined
    ): CreateBackupResponse = {
      val __obj = js.Dynamic.literal()
      Backup.foreach(__v => __obj.updateDynamic("Backup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupResponse]
    }
  }

  /**
    * The request object for the <code>CreateFileSystemFromBackup</code> operation.
    */
  @js.native
  trait CreateFileSystemFromBackupRequest extends js.Object {
    var BackupId: BackupId
    var SubnetIds: SubnetIds
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var Tags: js.UndefOr[Tags]
    var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration]
  }

  object CreateFileSystemFromBackupRequest {
    @inline
    def apply(
        BackupId: BackupId,
        SubnetIds: SubnetIds,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
    ): CreateFileSystemFromBackupRequest = {
      val __obj = js.Dynamic.literal(
        "BackupId"  -> BackupId.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemFromBackupRequest]
    }
  }

  /**
    * The response object for the <code>CreateFileSystemFromBackup</code> operation.
    */
  @js.native
  trait CreateFileSystemFromBackupResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  object CreateFileSystemFromBackupResponse {
    @inline
    def apply(
        FileSystem: js.UndefOr[FileSystem] = js.undefined
    ): CreateFileSystemFromBackupResponse = {
      val __obj = js.Dynamic.literal()
      FileSystem.foreach(__v => __obj.updateDynamic("FileSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemFromBackupResponse]
    }
  }

  /**
    * The Lustre configuration for the file system being created. This value is required if <code>FileSystemType</code> is set to <code>LUSTRE</code>.
    */
  @js.native
  trait CreateFileSystemLustreConfiguration extends js.Object {
    var ExportPath: js.UndefOr[ArchivePath]
    var ImportPath: js.UndefOr[ArchivePath]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object CreateFileSystemLustreConfiguration {
    @inline
    def apply(
        ExportPath: js.UndefOr[ArchivePath] = js.undefined,
        ImportPath: js.UndefOr[ArchivePath] = js.undefined,
        ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): CreateFileSystemLustreConfiguration = {
      val __obj = js.Dynamic.literal()
      ExportPath.foreach(__v => __obj.updateDynamic("ExportPath")(__v.asInstanceOf[js.Any]))
      ImportPath.foreach(__v => __obj.updateDynamic("ImportPath")(__v.asInstanceOf[js.Any]))
      ImportedFileChunkSize.foreach(__v => __obj.updateDynamic("ImportedFileChunkSize")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(
        __v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateFileSystemLustreConfiguration]
    }
  }

  /**
    * The request object used to create a new Amazon FSx file system.
    */
  @js.native
  trait CreateFileSystemRequest extends js.Object {
    var FileSystemType: FileSystemType
    var StorageCapacity: StorageCapacity
    var SubnetIds: SubnetIds
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var Tags: js.UndefOr[Tags]
    var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration]
  }

  object CreateFileSystemRequest {
    @inline
    def apply(
        FileSystemType: FileSystemType,
        StorageCapacity: StorageCapacity,
        SubnetIds: SubnetIds,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
    ): CreateFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemType"  -> FileSystemType.asInstanceOf[js.Any],
        "StorageCapacity" -> StorageCapacity.asInstanceOf[js.Any],
        "SubnetIds"       -> SubnetIds.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemRequest]
    }
  }

  /**
    * The response object returned after the file system is created.
    */
  @js.native
  trait CreateFileSystemResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  object CreateFileSystemResponse {
    @inline
    def apply(
        FileSystem: js.UndefOr[FileSystem] = js.undefined
    ): CreateFileSystemResponse = {
      val __obj = js.Dynamic.literal()
      FileSystem.foreach(__v => __obj.updateDynamic("FileSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemResponse]
    }
  }

  /**
    * The configuration object for the Microsoft Windows file system used in <code>CreateFileSystem</code> and <code>CreateFileSystemFromBackup</code> operations.
    */
  @js.native
  trait CreateFileSystemWindowsConfiguration extends js.Object {
    var ThroughputCapacity: MegabytesPerSecond
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfiguration]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object CreateFileSystemWindowsConfiguration {
    @inline
    def apply(
        ThroughputCapacity: MegabytesPerSecond,
        ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfiguration] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): CreateFileSystemWindowsConfiguration = {
      val __obj = js.Dynamic.literal(
        "ThroughputCapacity" -> ThroughputCapacity.asInstanceOf[js.Any]
      )

      ActiveDirectoryId.foreach(__v => __obj.updateDynamic("ActiveDirectoryId")(__v.asInstanceOf[js.Any]))
      AutomaticBackupRetentionDays.foreach(
        __v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any])
      )
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(
        __v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any])
      )
      SelfManagedActiveDirectoryConfiguration.foreach(
        __v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any])
      )
      WeeklyMaintenanceStartTime.foreach(
        __v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateFileSystemWindowsConfiguration]
    }
  }

  /**
    * The data repository configuration object for Lustre file systems returned in the response of the <code>CreateFileSystem</code> operation.
    */
  @js.native
  trait DataRepositoryConfiguration extends js.Object {
    var ExportPath: js.UndefOr[ArchivePath]
    var ImportPath: js.UndefOr[ArchivePath]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
  }

  object DataRepositoryConfiguration {
    @inline
    def apply(
        ExportPath: js.UndefOr[ArchivePath] = js.undefined,
        ImportPath: js.UndefOr[ArchivePath] = js.undefined,
        ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined
    ): DataRepositoryConfiguration = {
      val __obj = js.Dynamic.literal()
      ExportPath.foreach(__v => __obj.updateDynamic("ExportPath")(__v.asInstanceOf[js.Any]))
      ImportPath.foreach(__v => __obj.updateDynamic("ImportPath")(__v.asInstanceOf[js.Any]))
      ImportedFileChunkSize.foreach(__v => __obj.updateDynamic("ImportedFileChunkSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRepositoryConfiguration]
    }
  }

  /**
    * The request object for <code>DeleteBackup</code> operation.
    */
  @js.native
  trait DeleteBackupRequest extends js.Object {
    var BackupId: BackupId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object DeleteBackupRequest {
    @inline
    def apply(
        BackupId: BackupId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): DeleteBackupRequest = {
      val __obj = js.Dynamic.literal(
        "BackupId" -> BackupId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBackupRequest]
    }
  }

  /**
    * The response object for <code>DeleteBackup</code> operation.
    */
  @js.native
  trait DeleteBackupResponse extends js.Object {
    var BackupId: js.UndefOr[BackupId]
    var Lifecycle: js.UndefOr[BackupLifecycle]
  }

  object DeleteBackupResponse {
    @inline
    def apply(
        BackupId: js.UndefOr[BackupId] = js.undefined,
        Lifecycle: js.UndefOr[BackupLifecycle] = js.undefined
    ): DeleteBackupResponse = {
      val __obj = js.Dynamic.literal()
      BackupId.foreach(__v => __obj.updateDynamic("BackupId")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBackupResponse]
    }
  }

  /**
    * The request object for <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration]
  }

  object DeleteFileSystemRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration] = js.undefined
    ): DeleteFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemRequest]
    }
  }

  /**
    * The response object for the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemResponse extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var Lifecycle: js.UndefOr[FileSystemLifecycle]
    var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse]
  }

  object DeleteFileSystemResponse {
    @inline
    def apply(
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined,
        WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.undefined
    ): DeleteFileSystemResponse = {
      val __obj = js.Dynamic.literal()
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      WindowsResponse.foreach(__v => __obj.updateDynamic("WindowsResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemResponse]
    }
  }

  /**
    * The configuration object for the Microsoft Windows file system used in the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemWindowsConfiguration extends js.Object {
    var FinalBackupTags: js.UndefOr[Tags]
    var SkipFinalBackup: js.UndefOr[Flag]
  }

  object DeleteFileSystemWindowsConfiguration {
    @inline
    def apply(
        FinalBackupTags: js.UndefOr[Tags] = js.undefined,
        SkipFinalBackup: js.UndefOr[Flag] = js.undefined
    ): DeleteFileSystemWindowsConfiguration = {
      val __obj = js.Dynamic.literal()
      FinalBackupTags.foreach(__v => __obj.updateDynamic("FinalBackupTags")(__v.asInstanceOf[js.Any]))
      SkipFinalBackup.foreach(__v => __obj.updateDynamic("SkipFinalBackup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemWindowsConfiguration]
    }
  }

  /**
    * The response object for the Microsoft Windows file system used in the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemWindowsResponse extends js.Object {
    var FinalBackupId: js.UndefOr[BackupId]
    var FinalBackupTags: js.UndefOr[Tags]
  }

  object DeleteFileSystemWindowsResponse {
    @inline
    def apply(
        FinalBackupId: js.UndefOr[BackupId] = js.undefined,
        FinalBackupTags: js.UndefOr[Tags] = js.undefined
    ): DeleteFileSystemWindowsResponse = {
      val __obj = js.Dynamic.literal()
      FinalBackupId.foreach(__v => __obj.updateDynamic("FinalBackupId")(__v.asInstanceOf[js.Any]))
      FinalBackupTags.foreach(__v => __obj.updateDynamic("FinalBackupTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemWindowsResponse]
    }
  }

  /**
    * The request object for <code>DescribeBackups</code> operation.
    */
  @js.native
  trait DescribeBackupsRequest extends js.Object {
    var BackupIds: js.UndefOr[BackupIds]
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeBackupsRequest {
    @inline
    def apply(
        BackupIds: js.UndefOr[BackupIds] = js.undefined,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeBackupsRequest = {
      val __obj = js.Dynamic.literal()
      BackupIds.foreach(__v => __obj.updateDynamic("BackupIds")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBackupsRequest]
    }
  }

  /**
    * Response object for <code>DescribeBackups</code> operation.
    */
  @js.native
  trait DescribeBackupsResponse extends js.Object {
    var Backups: js.UndefOr[Backups]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeBackupsResponse {
    @inline
    def apply(
        Backups: js.UndefOr[Backups] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeBackupsResponse = {
      val __obj = js.Dynamic.literal()
      Backups.foreach(__v => __obj.updateDynamic("Backups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBackupsResponse]
    }
  }

  /**
    * The request object for <code>DescribeFileSystems</code> operation.
    */
  @js.native
  trait DescribeFileSystemsRequest extends js.Object {
    var FileSystemIds: js.UndefOr[FileSystemIds]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeFileSystemsRequest {
    @inline
    def apply(
        FileSystemIds: js.UndefOr[FileSystemIds] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeFileSystemsRequest = {
      val __obj = js.Dynamic.literal()
      FileSystemIds.foreach(__v => __obj.updateDynamic("FileSystemIds")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFileSystemsRequest]
    }
  }

  /**
    * The response object for <code>DescribeFileSystems</code> operation.
    */
  @js.native
  trait DescribeFileSystemsResponse extends js.Object {
    var FileSystems: js.UndefOr[FileSystems]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeFileSystemsResponse {
    @inline
    def apply(
        FileSystems: js.UndefOr[FileSystems] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeFileSystemsResponse = {
      val __obj = js.Dynamic.literal()
      FileSystems.foreach(__v => __obj.updateDynamic("FileSystems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFileSystemsResponse]
    }
  }

  /**
    * A description of a specific Amazon FSx file system.
    */
  @js.native
  trait FileSystem extends js.Object {
    var CreationTime: js.UndefOr[CreationTime]
    var DNSName: js.UndefOr[DNSName]
    var FailureDetails: js.UndefOr[FileSystemFailureDetails]
    var FileSystemId: js.UndefOr[FileSystemId]
    var FileSystemType: js.UndefOr[FileSystemType]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Lifecycle: js.UndefOr[FileSystemLifecycle]
    var LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration]
    var NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIds]
    var OwnerId: js.UndefOr[AWSAccountId]
    var ResourceARN: js.UndefOr[ResourceARN]
    var StorageCapacity: js.UndefOr[StorageCapacity]
    var SubnetIds: js.UndefOr[SubnetIds]
    var Tags: js.UndefOr[Tags]
    var VpcId: js.UndefOr[VpcId]
    var WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration]
  }

  object FileSystem {
    @inline
    def apply(
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        DNSName: js.UndefOr[DNSName] = js.undefined,
        FailureDetails: js.UndefOr[FileSystemFailureDetails] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        FileSystemType: js.UndefOr[FileSystemType] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined,
        LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration] = js.undefined,
        NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIds] = js.undefined,
        OwnerId: js.UndefOr[AWSAccountId] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        StorageCapacity: js.UndefOr[StorageCapacity] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined,
        WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration] = js.undefined
    ): FileSystem = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DNSName.foreach(__v => __obj.updateDynamic("DNSName")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      FileSystemType.foreach(__v => __obj.updateDynamic("FileSystemType")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceIds.foreach(__v => __obj.updateDynamic("NetworkInterfaceIds")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      StorageCapacity.foreach(__v => __obj.updateDynamic("StorageCapacity")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystem]
    }
  }

  /**
    * A structure providing details of any failures that occur when creating the file system has failed.
    */
  @js.native
  trait FileSystemFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  object FileSystemFailureDetails {
    @inline
    def apply(
        Message: js.UndefOr[ErrorMessage] = js.undefined
    ): FileSystemFailureDetails = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystemFailureDetails]
    }
  }

  /**
    * The lifecycle status of the file system.
    */
  object FileSystemLifecycleEnum {
    val AVAILABLE     = "AVAILABLE"
    val CREATING      = "CREATING"
    val FAILED        = "FAILED"
    val DELETING      = "DELETING"
    val MISCONFIGURED = "MISCONFIGURED"
    val UPDATING      = "UPDATING"

    val values = js.Object.freeze(js.Array(AVAILABLE, CREATING, FAILED, DELETING, MISCONFIGURED, UPDATING))
  }

  /**
    * An enumeration specifying the currently ongoing maintenance operation.
    */
  object FileSystemMaintenanceOperationEnum {
    val PATCHING   = "PATCHING"
    val BACKING_UP = "BACKING_UP"

    val values = js.Object.freeze(js.Array(PATCHING, BACKING_UP))
  }

  /**
    * The type of file system.
    */
  object FileSystemTypeEnum {
    val WINDOWS = "WINDOWS"
    val LUSTRE  = "LUSTRE"

    val values = js.Object.freeze(js.Array(WINDOWS, LUSTRE))
  }

  /**
    * A filter used to restrict the results of describe calls. You can use multiple filters to return results that meet all applied filter requirements.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  object Filter {
    @inline
    def apply(
        Name: js.UndefOr[FilterName] = js.undefined,
        Values: js.UndefOr[FilterValues] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /**
    * The name for a filter.
    */
  object FilterNameEnum {
    val `file-system-id` = "file-system-id"
    val `backup-type`    = "backup-type"

    val values = js.Object.freeze(js.Array(`file-system-id`, `backup-type`))
  }

  /**
    * The request object for <code>ListTagsForResource</code> operation.
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: ResourceARN
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
    * The response object for <code>ListTagsForResource</code> operation.
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * The configuration for the Amazon FSx for Lustre file system.
    */
  @js.native
  trait LustreFileSystemConfiguration extends js.Object {
    var DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object LustreFileSystemConfiguration {
    @inline
    def apply(
        DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): LustreFileSystemConfiguration = {
      val __obj = js.Dynamic.literal()
      DataRepositoryConfiguration.foreach(
        __v => __obj.updateDynamic("DataRepositoryConfiguration")(__v.asInstanceOf[js.Any])
      )
      WeeklyMaintenanceStartTime.foreach(
        __v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[LustreFileSystemConfiguration]
    }
  }

  /**
    * The configuration of the self-managed Microsoft Active Directory (AD) directory to which the Windows File Server instance is joined.
    */
  @js.native
  trait SelfManagedActiveDirectoryAttributes extends js.Object {
    var DnsIps: js.UndefOr[DnsIps]
    var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName]
    var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName]
    var UserName: js.UndefOr[DirectoryUserName]
  }

  object SelfManagedActiveDirectoryAttributes {
    @inline
    def apply(
        DnsIps: js.UndefOr[DnsIps] = js.undefined,
        DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.undefined,
        FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName] = js.undefined,
        OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName] = js.undefined,
        UserName: js.UndefOr[DirectoryUserName] = js.undefined
    ): SelfManagedActiveDirectoryAttributes = {
      val __obj = js.Dynamic.literal()
      DnsIps.foreach(__v => __obj.updateDynamic("DnsIps")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      FileSystemAdministratorsGroup.foreach(
        __v => __obj.updateDynamic("FileSystemAdministratorsGroup")(__v.asInstanceOf[js.Any])
      )
      OrganizationalUnitDistinguishedName.foreach(
        __v => __obj.updateDynamic("OrganizationalUnitDistinguishedName")(__v.asInstanceOf[js.Any])
      )
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelfManagedActiveDirectoryAttributes]
    }
  }

  /**
    * The configuration that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory.
    */
  @js.native
  trait SelfManagedActiveDirectoryConfiguration extends js.Object {
    var DnsIps: DnsIps
    var DomainName: ActiveDirectoryFullyQualifiedName
    var Password: DirectoryPassword
    var UserName: DirectoryUserName
    var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName]
  }

  object SelfManagedActiveDirectoryConfiguration {
    @inline
    def apply(
        DnsIps: DnsIps,
        DomainName: ActiveDirectoryFullyQualifiedName,
        Password: DirectoryPassword,
        UserName: DirectoryUserName,
        FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName] = js.undefined,
        OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName] = js.undefined
    ): SelfManagedActiveDirectoryConfiguration = {
      val __obj = js.Dynamic.literal(
        "DnsIps"     -> DnsIps.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Password"   -> Password.asInstanceOf[js.Any],
        "UserName"   -> UserName.asInstanceOf[js.Any]
      )

      FileSystemAdministratorsGroup.foreach(
        __v => __obj.updateDynamic("FileSystemAdministratorsGroup")(__v.asInstanceOf[js.Any])
      )
      OrganizationalUnitDistinguishedName.foreach(
        __v => __obj.updateDynamic("OrganizationalUnitDistinguishedName")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[SelfManagedActiveDirectoryConfiguration]
    }
  }

  /**
    * The configuration that Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft Active Directory (AD) directory.
    */
  @js.native
  trait SelfManagedActiveDirectoryConfigurationUpdates extends js.Object {
    var DnsIps: js.UndefOr[DnsIps]
    var Password: js.UndefOr[DirectoryPassword]
    var UserName: js.UndefOr[DirectoryUserName]
  }

  object SelfManagedActiveDirectoryConfigurationUpdates {
    @inline
    def apply(
        DnsIps: js.UndefOr[DnsIps] = js.undefined,
        Password: js.UndefOr[DirectoryPassword] = js.undefined,
        UserName: js.UndefOr[DirectoryUserName] = js.undefined
    ): SelfManagedActiveDirectoryConfigurationUpdates = {
      val __obj = js.Dynamic.literal()
      DnsIps.foreach(__v => __obj.updateDynamic("DnsIps")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelfManagedActiveDirectoryConfigurationUpdates]
    }
  }

  /**
    * Specifies a key-value pair for a resource tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * The request object for the <code>TagResource</code> operation.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: ResourceARN
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * The response object for the <code>TagResource</code> operation.
    */
  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * The request object for <code>UntagResource</code> action.
    */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: ResourceARN
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        TagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * The response object for <code>UntagResource</code> action.
    */
  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /**
    * The configuration object for Amazon FSx for Lustre file systems used in the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  trait UpdateFileSystemLustreConfiguration extends js.Object {
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object UpdateFileSystemLustreConfiguration {
    @inline
    def apply(
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): UpdateFileSystemLustreConfiguration = {
      val __obj = js.Dynamic.literal()
      WeeklyMaintenanceStartTime.foreach(
        __v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateFileSystemLustreConfiguration]
    }
  }

  /**
    * The request object for the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  trait UpdateFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration]
    var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration]
  }

  object UpdateFileSystemRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.undefined,
        WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.undefined
    ): UpdateFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemRequest]
    }
  }

  /**
    * The response object for the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  trait UpdateFileSystemResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  object UpdateFileSystemResponse {
    @inline
    def apply(
        FileSystem: js.UndefOr[FileSystem] = js.undefined
    ): UpdateFileSystemResponse = {
      val __obj = js.Dynamic.literal()
      FileSystem.foreach(__v => __obj.updateDynamic("FileSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemResponse]
    }
  }

  /**
    * Updates the Microsoft Windows configuration for an existing Amazon FSx for Windows File Server file system. Amazon FSx overwrites existing properties with non-null values provided in the request. If you don't specify a non-null value for a property, that property is not updated.
    */
  @js.native
  trait UpdateFileSystemWindowsConfiguration extends js.Object {
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object UpdateFileSystemWindowsConfiguration {
    @inline
    def apply(
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] =
          js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): UpdateFileSystemWindowsConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomaticBackupRetentionDays.foreach(
        __v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any])
      )
      DailyAutomaticBackupStartTime.foreach(
        __v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any])
      )
      SelfManagedActiveDirectoryConfiguration.foreach(
        __v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any])
      )
      WeeklyMaintenanceStartTime.foreach(
        __v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateFileSystemWindowsConfiguration]
    }
  }

  /**
    * The configuration for this Microsoft Windows file system.
    */
  @js.native
  trait WindowsFileSystemConfiguration extends js.Object {
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes]
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object WindowsFileSystemConfiguration {
    @inline
    def apply(
        ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations] = js.undefined,
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes] = js.undefined,
        ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): WindowsFileSystemConfiguration = {
      val __obj = js.Dynamic.literal()
      ActiveDirectoryId.foreach(__v => __obj.updateDynamic("ActiveDirectoryId")(__v.asInstanceOf[js.Any]))
      AutomaticBackupRetentionDays.foreach(
        __v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any])
      )
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(
        __v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any])
      )
      MaintenanceOperationsInProgress.foreach(
        __v => __obj.updateDynamic("MaintenanceOperationsInProgress")(__v.asInstanceOf[js.Any])
      )
      SelfManagedActiveDirectoryConfiguration.foreach(
        __v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any])
      )
      ThroughputCapacity.foreach(__v => __obj.updateDynamic("ThroughputCapacity")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(
        __v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[WindowsFileSystemConfiguration]
    }
  }
}
