package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object fsx {
  type AWSAccountId                        = String
  type ActiveDirectoryFullyQualifiedName   = String
  type ArchivePath                         = String
  type AutomaticBackupRetentionDays        = Int
  type BackupId                            = String
  type BackupIds                           = js.Array[BackupId]
  type Backups                             = js.Array[Backup]
  type ClientRequestToken                  = String
  type CreationTime                        = js.Date
  type DNSName                             = String
  type DailyTime                           = String
  type DataRepositoryTaskFilterValue       = String
  type DataRepositoryTaskFilterValues      = js.Array[DataRepositoryTaskFilterValue]
  type DataRepositoryTaskFilters           = js.Array[DataRepositoryTaskFilter]
  type DataRepositoryTaskPath              = String
  type DataRepositoryTaskPaths             = js.Array[DataRepositoryTaskPath]
  type DataRepositoryTasks                 = js.Array[DataRepositoryTask]
  type DirectoryId                         = String
  type DirectoryPassword                   = String
  type DirectoryUserName                   = String
  type DnsIps                              = js.Array[IpAddress]
  type EndTime                             = js.Date
  type ErrorMessage                        = String
  type FailedCount                         = Double
  type FileSystemAdministratorsGroupName   = String
  type FileSystemId                        = String
  type FileSystemIds                       = js.Array[FileSystemId]
  type FileSystemMaintenanceOperations     = js.Array[FileSystemMaintenanceOperation]
  type FileSystems                         = js.Array[FileSystem]
  type FilterValue                         = String
  type FilterValues                        = js.Array[FilterValue]
  type Filters                             = js.Array[Filter]
  type Flag                                = Boolean
  type IpAddress                           = String
  type KmsKeyId                            = String
  type LastUpdatedTime                     = js.Date
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
  type StartTime                           = js.Date
  type StorageCapacity                     = Int
  type SubnetId                            = String
  type SubnetIds                           = js.Array[SubnetId]
  type SucceededCount                      = Double
  type TagKey                              = String
  type TagKeys                             = js.Array[TagKey]
  type TagValue                            = String
  type Tags                                = js.Array[Tag]
  type TaskId                              = String
  type TaskIds                             = js.Array[TaskId]
  type TotalCount                          = Double
  type VpcId                               = String
  type WeeklyTime                          = String

  implicit final class FSxOps(private val service: FSx) extends AnyVal {

    @inline def cancelDataRepositoryTaskFuture(
        params: CancelDataRepositoryTaskRequest
    ): Future[CancelDataRepositoryTaskResponse] = service.cancelDataRepositoryTask(params).promise().toFuture
    @inline def createBackupFuture(params: CreateBackupRequest): Future[CreateBackupResponse] =
      service.createBackup(params).promise().toFuture
    @inline def createDataRepositoryTaskFuture(
        params: CreateDataRepositoryTaskRequest
    ): Future[CreateDataRepositoryTaskResponse] = service.createDataRepositoryTask(params).promise().toFuture
    @inline def createFileSystemFromBackupFuture(
        params: CreateFileSystemFromBackupRequest
    ): Future[CreateFileSystemFromBackupResponse] = service.createFileSystemFromBackup(params).promise().toFuture
    @inline def createFileSystemFuture(params: CreateFileSystemRequest): Future[CreateFileSystemResponse] =
      service.createFileSystem(params).promise().toFuture
    @inline def deleteBackupFuture(params: DeleteBackupRequest): Future[DeleteBackupResponse] =
      service.deleteBackup(params).promise().toFuture
    @inline def deleteFileSystemFuture(params: DeleteFileSystemRequest): Future[DeleteFileSystemResponse] =
      service.deleteFileSystem(params).promise().toFuture
    @inline def describeBackupsFuture(params: DescribeBackupsRequest): Future[DescribeBackupsResponse] =
      service.describeBackups(params).promise().toFuture
    @inline def describeDataRepositoryTasksFuture(
        params: DescribeDataRepositoryTasksRequest
    ): Future[DescribeDataRepositoryTasksResponse] = service.describeDataRepositoryTasks(params).promise().toFuture
    @inline def describeFileSystemsFuture(params: DescribeFileSystemsRequest): Future[DescribeFileSystemsResponse] =
      service.describeFileSystems(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateFileSystemFuture(params: UpdateFileSystemRequest): Future[UpdateFileSystemResponse] =
      service.updateFileSystem(params).promise().toFuture
  }
}

package fsx {
  @js.native
  @JSImport("aws-sdk", "FSx")
  class FSx() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelDataRepositoryTask(params: CancelDataRepositoryTaskRequest): Request[CancelDataRepositoryTaskResponse] =
      js.native
    def createBackup(params: CreateBackupRequest): Request[CreateBackupResponse] = js.native
    def createDataRepositoryTask(params: CreateDataRepositoryTaskRequest): Request[CreateDataRepositoryTaskResponse] =
      js.native
    def createFileSystem(params: CreateFileSystemRequest): Request[CreateFileSystemResponse] = js.native
    def createFileSystemFromBackup(
        params: CreateFileSystemFromBackupRequest
    ): Request[CreateFileSystemFromBackupResponse]                                           = js.native
    def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse]             = js.native
    def deleteFileSystem(params: DeleteFileSystemRequest): Request[DeleteFileSystemResponse] = js.native
    def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse]    = js.native
    def describeDataRepositoryTasks(
        params: DescribeDataRepositoryTasksRequest
    ): Request[DescribeDataRepositoryTasksResponse]                                                   = js.native
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
  @Factory
  trait ActiveDirectoryBackupAttributes extends js.Object {
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName]
  }

  /**
    * A backup of an Amazon FSx for Windows File Server file system. You can create a new file system from a backup to protect against data loss.
    */
  @js.native
  @Factory
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

  /**
    * If backup creation fails, this structure contains the details of that failure.
    */
  @js.native
  @Factory
  trait BackupFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  /**
    * The lifecycle status of the backup.
    */
  @js.native
  sealed trait BackupLifecycle extends js.Any
  object BackupLifecycle extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[BackupLifecycle]
    val CREATING  = "CREATING".asInstanceOf[BackupLifecycle]
    val DELETED   = "DELETED".asInstanceOf[BackupLifecycle]
    val FAILED    = "FAILED".asInstanceOf[BackupLifecycle]

    val values = js.Object.freeze(js.Array(AVAILABLE, CREATING, DELETED, FAILED))
  }

  /**
    * The type of the backup.
    */
  @js.native
  sealed trait BackupType extends js.Any
  object BackupType extends js.Object {
    val AUTOMATIC      = "AUTOMATIC".asInstanceOf[BackupType]
    val USER_INITIATED = "USER_INITIATED".asInstanceOf[BackupType]

    val values = js.Object.freeze(js.Array(AUTOMATIC, USER_INITIATED))
  }

  /**
    * Cancels a data repository task.
    */
  @js.native
  @Factory
  trait CancelDataRepositoryTaskRequest extends js.Object {
    var TaskId: TaskId
  }

  @js.native
  @Factory
  trait CancelDataRepositoryTaskResponse extends js.Object {
    var Lifecycle: js.UndefOr[DataRepositoryTaskLifecycle]
    var TaskId: js.UndefOr[TaskId]
  }

  /**
    * Provides a report detailing the data repository task results of the files processed that match the criteria specified in the report <code>Scope</code> parameter. FSx delivers the report to the file system's linked data repository in Amazon S3, using the path specified in the report <code>Path</code> parameter. You can specify whether or not a report gets generated for a task using the <code>Enabled</code> parameter.
    */
  @js.native
  @Factory
  trait CompletionReport extends js.Object {
    var Enabled: Flag
    var Format: js.UndefOr[ReportFormat]
    var Path: js.UndefOr[ArchivePath]
    var Scope: js.UndefOr[ReportScope]
  }

  /**
    * The request object for the <code>CreateBackup</code> operation.
    */
  @js.native
  @Factory
  trait CreateBackupRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * The response object for the <code>CreateBackup</code> operation.
    */
  @js.native
  @Factory
  trait CreateBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  @js.native
  @Factory
  trait CreateDataRepositoryTaskRequest extends js.Object {
    var FileSystemId: FileSystemId
    var Report: CompletionReport
    var Type: DataRepositoryTaskType
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Paths: js.UndefOr[DataRepositoryTaskPaths]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateDataRepositoryTaskResponse extends js.Object {
    var DataRepositoryTask: js.UndefOr[DataRepositoryTask]
  }

  /**
    * The request object for the <code>CreateFileSystemFromBackup</code> operation.
    */
  @js.native
  @Factory
  trait CreateFileSystemFromBackupRequest extends js.Object {
    var BackupId: BackupId
    var SubnetIds: SubnetIds
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var Tags: js.UndefOr[Tags]
    var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration]
  }

  /**
    * The response object for the <code>CreateFileSystemFromBackup</code> operation.
    */
  @js.native
  @Factory
  trait CreateFileSystemFromBackupResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  /**
    * The Lustre configuration for the file system being created. This value is required if <code>FileSystemType</code> is set to <code>LUSTRE</code>.
    */
  @js.native
  @Factory
  trait CreateFileSystemLustreConfiguration extends js.Object {
    var ExportPath: js.UndefOr[ArchivePath]
    var ImportPath: js.UndefOr[ArchivePath]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  /**
    * The request object used to create a new Amazon FSx file system.
    */
  @js.native
  @Factory
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

  /**
    * The response object returned after the file system is created.
    */
  @js.native
  @Factory
  trait CreateFileSystemResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  /**
    * The configuration object for the Microsoft Windows file system used in <code>CreateFileSystem</code> and <code>CreateFileSystemFromBackup</code> operations.
    */
  @js.native
  @Factory
  trait CreateFileSystemWindowsConfiguration extends js.Object {
    var ThroughputCapacity: MegabytesPerSecond
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DeploymentType: js.UndefOr[WindowsDeploymentType]
    var PreferredSubnetId: js.UndefOr[SubnetId]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfiguration]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  /**
    * The data repository configuration object for Lustre file systems returned in the response of the <code>CreateFileSystem</code> operation.
    */
  @js.native
  @Factory
  trait DataRepositoryConfiguration extends js.Object {
    var ExportPath: js.UndefOr[ArchivePath]
    var ImportPath: js.UndefOr[ArchivePath]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
  }

  /**
    * A description of the data repository task. You use data repository tasks to perform bulk transfer operations between your Amazon FSx file system and its linked data repository.
    */
  @js.native
  @Factory
  trait DataRepositoryTask extends js.Object {
    var CreationTime: CreationTime
    var FileSystemId: FileSystemId
    var Lifecycle: DataRepositoryTaskLifecycle
    var TaskId: TaskId
    var Type: DataRepositoryTaskType
    var EndTime: js.UndefOr[EndTime]
    var FailureDetails: js.UndefOr[DataRepositoryTaskFailureDetails]
    var Paths: js.UndefOr[DataRepositoryTaskPaths]
    var Report: js.UndefOr[CompletionReport]
    var ResourceARN: js.UndefOr[ResourceARN]
    var StartTime: js.UndefOr[StartTime]
    var Status: js.UndefOr[DataRepositoryTaskStatus]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Provides information about why a data repository task failed. Only populated when the task <code>Lifecycle</code> is set to <code>FAILED</code>.
    */
  @js.native
  @Factory
  trait DataRepositoryTaskFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  /**
    * (Optional) An array of filter objects you can use to filter the response of data repository tasks you will see in the the response. You can filter the tasks returned in the response by one or more file system IDs, task lifecycles, and by task type. A filter object consists of a filter <code>Name</code>, and one or more <code>Values</code> for the filter.
    */
  @js.native
  @Factory
  trait DataRepositoryTaskFilter extends js.Object {
    var Name: js.UndefOr[DataRepositoryTaskFilterName]
    var Values: js.UndefOr[DataRepositoryTaskFilterValues]
  }

  @js.native
  sealed trait DataRepositoryTaskFilterName extends js.Any
  object DataRepositoryTaskFilterName extends js.Object {
    val `file-system-id` = "file-system-id".asInstanceOf[DataRepositoryTaskFilterName]
    val `task-lifecycle` = "task-lifecycle".asInstanceOf[DataRepositoryTaskFilterName]

    val values = js.Object.freeze(js.Array(`file-system-id`, `task-lifecycle`))
  }

  @js.native
  sealed trait DataRepositoryTaskLifecycle extends js.Any
  object DataRepositoryTaskLifecycle extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[DataRepositoryTaskLifecycle]
    val EXECUTING = "EXECUTING".asInstanceOf[DataRepositoryTaskLifecycle]
    val FAILED    = "FAILED".asInstanceOf[DataRepositoryTaskLifecycle]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[DataRepositoryTaskLifecycle]
    val CANCELED  = "CANCELED".asInstanceOf[DataRepositoryTaskLifecycle]
    val CANCELING = "CANCELING".asInstanceOf[DataRepositoryTaskLifecycle]

    val values = js.Object.freeze(js.Array(PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED, CANCELING))
  }

  /**
    * Provides the task status showing a running total of the total number of files to be processed, the number successfully processed, and the number of files the task failed to process.
    */
  @js.native
  @Factory
  trait DataRepositoryTaskStatus extends js.Object {
    var FailedCount: js.UndefOr[FailedCount]
    var LastUpdatedTime: js.UndefOr[LastUpdatedTime]
    var SucceededCount: js.UndefOr[SucceededCount]
    var TotalCount: js.UndefOr[TotalCount]
  }

  @js.native
  sealed trait DataRepositoryTaskType extends js.Any
  object DataRepositoryTaskType extends js.Object {
    val EXPORT_TO_REPOSITORY = "EXPORT_TO_REPOSITORY".asInstanceOf[DataRepositoryTaskType]

    val values = js.Object.freeze(js.Array(EXPORT_TO_REPOSITORY))
  }

  /**
    * The request object for <code>DeleteBackup</code> operation.
    */
  @js.native
  @Factory
  trait DeleteBackupRequest extends js.Object {
    var BackupId: BackupId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  /**
    * The response object for <code>DeleteBackup</code> operation.
    */
  @js.native
  @Factory
  trait DeleteBackupResponse extends js.Object {
    var BackupId: js.UndefOr[BackupId]
    var Lifecycle: js.UndefOr[BackupLifecycle]
  }

  /**
    * The request object for <code>DeleteFileSystem</code> operation.
    */
  @js.native
  @Factory
  trait DeleteFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration]
  }

  /**
    * The response object for the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  @Factory
  trait DeleteFileSystemResponse extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var Lifecycle: js.UndefOr[FileSystemLifecycle]
    var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse]
  }

  /**
    * The configuration object for the Microsoft Windows file system used in the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  @Factory
  trait DeleteFileSystemWindowsConfiguration extends js.Object {
    var FinalBackupTags: js.UndefOr[Tags]
    var SkipFinalBackup: js.UndefOr[Flag]
  }

  /**
    * The response object for the Microsoft Windows file system used in the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  @Factory
  trait DeleteFileSystemWindowsResponse extends js.Object {
    var FinalBackupId: js.UndefOr[BackupId]
    var FinalBackupTags: js.UndefOr[Tags]
  }

  /**
    * The request object for <code>DescribeBackups</code> operation.
    */
  @js.native
  @Factory
  trait DescribeBackupsRequest extends js.Object {
    var BackupIds: js.UndefOr[BackupIds]
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Response object for <code>DescribeBackups</code> operation.
    */
  @js.native
  @Factory
  trait DescribeBackupsResponse extends js.Object {
    var Backups: js.UndefOr[Backups]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeDataRepositoryTasksRequest extends js.Object {
    var Filters: js.UndefOr[DataRepositoryTaskFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TaskIds: js.UndefOr[TaskIds]
  }

  @js.native
  @Factory
  trait DescribeDataRepositoryTasksResponse extends js.Object {
    var DataRepositoryTasks: js.UndefOr[DataRepositoryTasks]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * The request object for <code>DescribeFileSystems</code> operation.
    */
  @js.native
  @Factory
  trait DescribeFileSystemsRequest extends js.Object {
    var FileSystemIds: js.UndefOr[FileSystemIds]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * The response object for <code>DescribeFileSystems</code> operation.
    */
  @js.native
  @Factory
  trait DescribeFileSystemsResponse extends js.Object {
    var FileSystems: js.UndefOr[FileSystems]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * A description of a specific Amazon FSx file system.
    */
  @js.native
  @Factory
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

  /**
    * A structure providing details of any failures that occur when creating the file system has failed.
    */
  @js.native
  @Factory
  trait FileSystemFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  /**
    * The lifecycle status of the file system.
    */
  @js.native
  sealed trait FileSystemLifecycle extends js.Any
  object FileSystemLifecycle extends js.Object {
    val AVAILABLE     = "AVAILABLE".asInstanceOf[FileSystemLifecycle]
    val CREATING      = "CREATING".asInstanceOf[FileSystemLifecycle]
    val FAILED        = "FAILED".asInstanceOf[FileSystemLifecycle]
    val DELETING      = "DELETING".asInstanceOf[FileSystemLifecycle]
    val MISCONFIGURED = "MISCONFIGURED".asInstanceOf[FileSystemLifecycle]
    val UPDATING      = "UPDATING".asInstanceOf[FileSystemLifecycle]

    val values = js.Object.freeze(js.Array(AVAILABLE, CREATING, FAILED, DELETING, MISCONFIGURED, UPDATING))
  }

  /**
    * An enumeration specifying the currently ongoing maintenance operation.
    */
  @js.native
  sealed trait FileSystemMaintenanceOperation extends js.Any
  object FileSystemMaintenanceOperation extends js.Object {
    val PATCHING   = "PATCHING".asInstanceOf[FileSystemMaintenanceOperation]
    val BACKING_UP = "BACKING_UP".asInstanceOf[FileSystemMaintenanceOperation]

    val values = js.Object.freeze(js.Array(PATCHING, BACKING_UP))
  }

  /**
    * The type of file system.
    */
  @js.native
  sealed trait FileSystemType extends js.Any
  object FileSystemType extends js.Object {
    val WINDOWS = "WINDOWS".asInstanceOf[FileSystemType]
    val LUSTRE  = "LUSTRE".asInstanceOf[FileSystemType]

    val values = js.Object.freeze(js.Array(WINDOWS, LUSTRE))
  }

  /**
    * A filter used to restrict the results of describe calls. You can use multiple filters to return results that meet all applied filter requirements.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  /**
    * The name for a filter.
    */
  @js.native
  sealed trait FilterName extends js.Any
  object FilterName extends js.Object {
    val `file-system-id` = "file-system-id".asInstanceOf[FilterName]
    val `backup-type`    = "backup-type".asInstanceOf[FilterName]

    val values = js.Object.freeze(js.Array(`file-system-id`, `backup-type`))
  }

  /**
    * The request object for <code>ListTagsForResource</code> operation.
    */
  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: ResourceARN
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * The response object for <code>ListTagsForResource</code> operation.
    */
  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * The configuration for the Amazon FSx for Lustre file system.
    */
  @js.native
  @Factory
  trait LustreFileSystemConfiguration extends js.Object {
    var DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  @js.native
  sealed trait ReportFormat extends js.Any
  object ReportFormat extends js.Object {
    val REPORT_CSV_20191124 = "REPORT_CSV_20191124".asInstanceOf[ReportFormat]

    val values = js.Object.freeze(js.Array(REPORT_CSV_20191124))
  }

  @js.native
  sealed trait ReportScope extends js.Any
  object ReportScope extends js.Object {
    val FAILED_FILES_ONLY = "FAILED_FILES_ONLY".asInstanceOf[ReportScope]

    val values = js.Object.freeze(js.Array(FAILED_FILES_ONLY))
  }

  /**
    * The configuration of the self-managed Microsoft Active Directory (AD) directory to which the Windows File Server instance is joined.
    */
  @js.native
  @Factory
  trait SelfManagedActiveDirectoryAttributes extends js.Object {
    var DnsIps: js.UndefOr[DnsIps]
    var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName]
    var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName]
    var UserName: js.UndefOr[DirectoryUserName]
  }

  /**
    * The configuration that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory.
    */
  @js.native
  @Factory
  trait SelfManagedActiveDirectoryConfiguration extends js.Object {
    var DnsIps: DnsIps
    var DomainName: ActiveDirectoryFullyQualifiedName
    var Password: DirectoryPassword
    var UserName: DirectoryUserName
    var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName]
  }

  /**
    * The configuration that Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft Active Directory (AD) directory.
    */
  @js.native
  @Factory
  trait SelfManagedActiveDirectoryConfigurationUpdates extends js.Object {
    var DnsIps: js.UndefOr[DnsIps]
    var Password: js.UndefOr[DirectoryPassword]
    var UserName: js.UndefOr[DirectoryUserName]
  }

  /**
    * Specifies a key-value pair for a resource tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  /**
    * The request object for the <code>TagResource</code> operation.
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceARN: ResourceARN
    var Tags: Tags
  }

  /**
    * The response object for the <code>TagResource</code> operation.
    */
  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * The request object for <code>UntagResource</code> action.
    */
  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: ResourceARN
    var TagKeys: TagKeys
  }

  /**
    * The response object for <code>UntagResource</code> action.
    */
  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  /**
    * The configuration object for Amazon FSx for Lustre file systems used in the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  @Factory
  trait UpdateFileSystemLustreConfiguration extends js.Object {
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  /**
    * The request object for the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  @Factory
  trait UpdateFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration]
    var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration]
  }

  /**
    * The response object for the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  @Factory
  trait UpdateFileSystemResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  /**
    * Updates the Microsoft Windows configuration for an existing Amazon FSx for Windows File Server file system. Amazon FSx overwrites existing properties with non-null values provided in the request. If you don't specify a non-null value for a property, that property is not updated.
    */
  @js.native
  @Factory
  trait UpdateFileSystemWindowsConfiguration extends js.Object {
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  @js.native
  sealed trait WindowsDeploymentType extends js.Any
  object WindowsDeploymentType extends js.Object {
    val MULTI_AZ_1  = "MULTI_AZ_1".asInstanceOf[WindowsDeploymentType]
    val SINGLE_AZ_1 = "SINGLE_AZ_1".asInstanceOf[WindowsDeploymentType]

    val values = js.Object.freeze(js.Array(MULTI_AZ_1, SINGLE_AZ_1))
  }

  /**
    * The configuration for this Microsoft Windows file system.
    */
  @js.native
  @Factory
  trait WindowsFileSystemConfiguration extends js.Object {
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DeploymentType: js.UndefOr[WindowsDeploymentType]
    var MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations]
    var PreferredFileServerIp: js.UndefOr[IpAddress]
    var PreferredSubnetId: js.UndefOr[SubnetId]
    var RemoteAdministrationEndpoint: js.UndefOr[DNSName]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes]
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }
}
