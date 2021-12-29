package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object fsx {
  type AWSAccountId = String
  type ActiveDirectoryFullyQualifiedName = String
  type AdministrativeActions = js.Array[AdministrativeAction]
  type Aliases = js.Array[Alias]
  type AlternateDNSName = String
  type AlternateDNSNames = js.Array[AlternateDNSName]
  type ArchivePath = String
  type AutomaticBackupRetentionDays = Int
  type BackupId = String
  type BackupIds = js.Array[BackupId]
  type Backups = js.Array[Backup]
  type ClientRequestToken = String
  type CreationTime = js.Date
  type DNSName = String
  type DailyTime = String
  type DataRepositoryTaskFilterValue = String
  type DataRepositoryTaskFilterValues = js.Array[DataRepositoryTaskFilterValue]
  type DataRepositoryTaskFilters = js.Array[DataRepositoryTaskFilter]
  type DataRepositoryTaskPath = String
  type DataRepositoryTaskPaths = js.Array[DataRepositoryTaskPath]
  type DataRepositoryTasks = js.Array[DataRepositoryTask]
  type DirectoryId = String
  type DirectoryPassword = String
  type DirectoryUserName = String
  type DnsIps = js.Array[IpAddress]
  type EndTime = js.Date
  type ErrorMessage = String
  type FailedCount = Double
  type FileSystemAdministratorsGroupName = String
  type FileSystemId = String
  type FileSystemIds = js.Array[FileSystemId]
  type FileSystemMaintenanceOperations = js.Array[FileSystemMaintenanceOperation]
  type FileSystems = js.Array[FileSystem]
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Flag = Boolean
  type IpAddress = String
  type KmsKeyId = String
  type LastUpdatedTime = js.Date
  type LustreFileSystemMountName = String
  type MaxResults = Int
  type Megabytes = Int
  type MegabytesPerSecond = Int
  type NetworkInterfaceId = String
  type NetworkInterfaceIds = js.Array[NetworkInterfaceId]
  type NextToken = String
  type OrganizationalUnitDistinguishedName = String
  type PerUnitStorageThroughput = Int
  type ProgressPercent = Int
  type Region = String
  type RequestTime = js.Date
  type ResourceARN = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SourceBackupId = String
  type StartTime = js.Date
  type StorageCapacity = Int
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type SucceededCount = Double
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TaskId = String
  type TaskIds = js.Array[TaskId]
  type TotalCount = Double
  type VpcId = String
  type WeeklyTime = String

  final class FSxOps(private val service: FSx) extends AnyVal {

    @inline def associateFileSystemAliasesFuture(params: AssociateFileSystemAliasesRequest): Future[AssociateFileSystemAliasesResponse] = service.associateFileSystemAliases(params).promise().toFuture
    @inline def cancelDataRepositoryTaskFuture(params: CancelDataRepositoryTaskRequest): Future[CancelDataRepositoryTaskResponse] = service.cancelDataRepositoryTask(params).promise().toFuture
    @inline def copyBackupFuture(params: CopyBackupRequest): Future[CopyBackupResponse] = service.copyBackup(params).promise().toFuture
    @inline def createBackupFuture(params: CreateBackupRequest): Future[CreateBackupResponse] = service.createBackup(params).promise().toFuture
    @inline def createDataRepositoryTaskFuture(params: CreateDataRepositoryTaskRequest): Future[CreateDataRepositoryTaskResponse] = service.createDataRepositoryTask(params).promise().toFuture
    @inline def createFileSystemFromBackupFuture(params: CreateFileSystemFromBackupRequest): Future[CreateFileSystemFromBackupResponse] = service.createFileSystemFromBackup(params).promise().toFuture
    @inline def createFileSystemFuture(params: CreateFileSystemRequest): Future[CreateFileSystemResponse] = service.createFileSystem(params).promise().toFuture
    @inline def deleteBackupFuture(params: DeleteBackupRequest): Future[DeleteBackupResponse] = service.deleteBackup(params).promise().toFuture
    @inline def deleteFileSystemFuture(params: DeleteFileSystemRequest): Future[DeleteFileSystemResponse] = service.deleteFileSystem(params).promise().toFuture
    @inline def describeBackupsFuture(params: DescribeBackupsRequest): Future[DescribeBackupsResponse] = service.describeBackups(params).promise().toFuture
    @inline def describeDataRepositoryTasksFuture(params: DescribeDataRepositoryTasksRequest): Future[DescribeDataRepositoryTasksResponse] = service.describeDataRepositoryTasks(params).promise().toFuture
    @inline def describeFileSystemAliasesFuture(params: DescribeFileSystemAliasesRequest): Future[DescribeFileSystemAliasesResponse] = service.describeFileSystemAliases(params).promise().toFuture
    @inline def describeFileSystemsFuture(params: DescribeFileSystemsRequest): Future[DescribeFileSystemsResponse] = service.describeFileSystems(params).promise().toFuture
    @inline def disassociateFileSystemAliasesFuture(params: DisassociateFileSystemAliasesRequest): Future[DisassociateFileSystemAliasesResponse] = service.disassociateFileSystemAliases(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateFileSystemFuture(params: UpdateFileSystemRequest): Future[UpdateFileSystemResponse] = service.updateFileSystem(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/fsx", JSImport.Namespace, "AWS.FSx")
  class FSx() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateFileSystemAliases(params: AssociateFileSystemAliasesRequest): Request[AssociateFileSystemAliasesResponse] = js.native
    def cancelDataRepositoryTask(params: CancelDataRepositoryTaskRequest): Request[CancelDataRepositoryTaskResponse] = js.native
    def copyBackup(params: CopyBackupRequest): Request[CopyBackupResponse] = js.native
    def createBackup(params: CreateBackupRequest): Request[CreateBackupResponse] = js.native
    def createDataRepositoryTask(params: CreateDataRepositoryTaskRequest): Request[CreateDataRepositoryTaskResponse] = js.native
    def createFileSystem(params: CreateFileSystemRequest): Request[CreateFileSystemResponse] = js.native
    def createFileSystemFromBackup(params: CreateFileSystemFromBackupRequest): Request[CreateFileSystemFromBackupResponse] = js.native
    def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse] = js.native
    def deleteFileSystem(params: DeleteFileSystemRequest): Request[DeleteFileSystemResponse] = js.native
    def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse] = js.native
    def describeDataRepositoryTasks(params: DescribeDataRepositoryTasksRequest): Request[DescribeDataRepositoryTasksResponse] = js.native
    def describeFileSystemAliases(params: DescribeFileSystemAliasesRequest): Request[DescribeFileSystemAliasesResponse] = js.native
    def describeFileSystems(params: DescribeFileSystemsRequest): Request[DescribeFileSystemsResponse] = js.native
    def disassociateFileSystemAliases(params: DisassociateFileSystemAliasesRequest): Request[DisassociateFileSystemAliasesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateFileSystem(params: UpdateFileSystemRequest): Request[UpdateFileSystemResponse] = js.native
  }
  object FSx {
    @inline implicit def toOps(service: FSx): FSxOps = {
      new FSxOps(service)
    }
  }

  /** The Microsoft AD attributes of the Amazon FSx for Windows File Server file system.
    */
  @js.native
  trait ActiveDirectoryBackupAttributes extends js.Object {
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName]
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object ActiveDirectoryBackupAttributes {
    @inline
    def apply(
        ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    ): ActiveDirectoryBackupAttributes = {
      val __obj = js.Dynamic.literal()
      ActiveDirectoryId.foreach(__v => __obj.updateDynamic("ActiveDirectoryId")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveDirectoryBackupAttributes]
    }
  }

  /** Describes a specific Amazon FSx administrative action for the current Windows or Lustre file system.
    */
  @js.native
  trait AdministrativeAction extends js.Object {
    var AdministrativeActionType: js.UndefOr[AdministrativeActionType]
    var FailureDetails: js.UndefOr[AdministrativeActionFailureDetails]
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var RequestTime: js.UndefOr[RequestTime]
    var Status: js.UndefOr[Status]
    var TargetFileSystemValues: js.UndefOr[FileSystem]
  }

  object AdministrativeAction {
    @inline
    def apply(
        AdministrativeActionType: js.UndefOr[AdministrativeActionType] = js.undefined,
        FailureDetails: js.UndefOr[AdministrativeActionFailureDetails] = js.undefined,
        ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
        RequestTime: js.UndefOr[RequestTime] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TargetFileSystemValues: js.UndefOr[FileSystem] = js.undefined
    ): AdministrativeAction = {
      val __obj = js.Dynamic.literal()
      AdministrativeActionType.foreach(__v => __obj.updateDynamic("AdministrativeActionType")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      ProgressPercent.foreach(__v => __obj.updateDynamic("ProgressPercent")(__v.asInstanceOf[js.Any]))
      RequestTime.foreach(__v => __obj.updateDynamic("RequestTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetFileSystemValues.foreach(__v => __obj.updateDynamic("TargetFileSystemValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdministrativeAction]
    }
  }

  /** Provides information about a failed administrative action.
    */
  @js.native
  trait AdministrativeActionFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  object AdministrativeActionFailureDetails {
    @inline
    def apply(
        Message: js.UndefOr[ErrorMessage] = js.undefined
    ): AdministrativeActionFailureDetails = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdministrativeActionFailureDetails]
    }
  }

  /** A DNS alias that is associated with the file system. You can use a DNS alias to access a file system using user-defined DNS names, in addition to the default DNS name that Amazon FSx assigns to the file system. For more information, see [[https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html|DNS aliases]] in the <i>FSx for Windows File Server User Guide</i>.
    */
  @js.native
  trait Alias extends js.Object {
    var Lifecycle: js.UndefOr[AliasLifecycle]
    var Name: js.UndefOr[AlternateDNSName]
  }

  object Alias {
    @inline
    def apply(
        Lifecycle: js.UndefOr[AliasLifecycle] = js.undefined,
        Name: js.UndefOr[AlternateDNSName] = js.undefined
    ): Alias = {
      val __obj = js.Dynamic.literal()
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alias]
    }
  }

  /** The request object specifying one or more DNS alias names to associate with an Amazon FSx for Windows File Server file system.
    */
  @js.native
  trait AssociateFileSystemAliasesRequest extends js.Object {
    var Aliases: AlternateDNSNames
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object AssociateFileSystemAliasesRequest {
    @inline
    def apply(
        Aliases: AlternateDNSNames,
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): AssociateFileSystemAliasesRequest = {
      val __obj = js.Dynamic.literal(
        "Aliases" -> Aliases.asInstanceOf[js.Any],
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateFileSystemAliasesRequest]
    }
  }

  /** The system generated response showing the DNS aliases that Amazon FSx is attempting to associate with the file system. Use the API operation to monitor the status of the aliases Amazon FSx is associating with the file system. It can take up to 2.5 minutes for the alias status to change from <code>CREATING</code> to <code>AVAILABLE</code>.
    */
  @js.native
  trait AssociateFileSystemAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[Aliases]
  }

  object AssociateFileSystemAliasesResponse {
    @inline
    def apply(
        Aliases: js.UndefOr[Aliases] = js.undefined
    ): AssociateFileSystemAliasesResponse = {
      val __obj = js.Dynamic.literal()
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateFileSystemAliasesResponse]
    }
  }

  /** A backup of an Amazon FSx file system.
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
    var OwnerId: js.UndefOr[AWSAccountId]
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var ResourceARN: js.UndefOr[ResourceARN]
    var SourceBackupId: js.UndefOr[BackupId]
    var SourceBackupRegion: js.UndefOr[Region]
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
        OwnerId: js.UndefOr[AWSAccountId] = js.undefined,
        ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        SourceBackupId: js.UndefOr[BackupId] = js.undefined,
        SourceBackupRegion: js.UndefOr[Region] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): Backup = {
      val __obj = js.Dynamic.literal(
        "BackupId" -> BackupId.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "FileSystem" -> FileSystem.asInstanceOf[js.Any],
        "Lifecycle" -> Lifecycle.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DirectoryInformation.foreach(__v => __obj.updateDynamic("DirectoryInformation")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      ProgressPercent.foreach(__v => __obj.updateDynamic("ProgressPercent")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      SourceBackupId.foreach(__v => __obj.updateDynamic("SourceBackupId")(__v.asInstanceOf[js.Any]))
      SourceBackupRegion.foreach(__v => __obj.updateDynamic("SourceBackupRegion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Backup]
    }
  }

  /** If backup creation fails, this structure contains the details of that failure.
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

  /** Cancels a data repository task.
    */
  @js.native
  trait CancelDataRepositoryTaskRequest extends js.Object {
    var TaskId: TaskId
  }

  object CancelDataRepositoryTaskRequest {
    @inline
    def apply(
        TaskId: TaskId
    ): CancelDataRepositoryTaskRequest = {
      val __obj = js.Dynamic.literal(
        "TaskId" -> TaskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelDataRepositoryTaskRequest]
    }
  }

  @js.native
  trait CancelDataRepositoryTaskResponse extends js.Object {
    var Lifecycle: js.UndefOr[DataRepositoryTaskLifecycle]
    var TaskId: js.UndefOr[TaskId]
  }

  object CancelDataRepositoryTaskResponse {
    @inline
    def apply(
        Lifecycle: js.UndefOr[DataRepositoryTaskLifecycle] = js.undefined,
        TaskId: js.UndefOr[TaskId] = js.undefined
    ): CancelDataRepositoryTaskResponse = {
      val __obj = js.Dynamic.literal()
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      TaskId.foreach(__v => __obj.updateDynamic("TaskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelDataRepositoryTaskResponse]
    }
  }

  /** Provides a report detailing the data repository task results of the files processed that match the criteria specified in the report <code>Scope</code> parameter. FSx delivers the report to the file system's linked data repository in Amazon S3, using the path specified in the report <code>Path</code> parameter. You can specify whether or not a report gets generated for a task using the <code>Enabled</code> parameter.
    */
  @js.native
  trait CompletionReport extends js.Object {
    var Enabled: Flag
    var Format: js.UndefOr[ReportFormat]
    var Path: js.UndefOr[ArchivePath]
    var Scope: js.UndefOr[ReportScope]
  }

  object CompletionReport {
    @inline
    def apply(
        Enabled: Flag,
        Format: js.UndefOr[ReportFormat] = js.undefined,
        Path: js.UndefOr[ArchivePath] = js.undefined,
        Scope: js.UndefOr[ReportScope] = js.undefined
    ): CompletionReport = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompletionReport]
    }
  }

  @js.native
  trait CopyBackupRequest extends js.Object {
    var SourceBackupId: SourceBackupId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var CopyTags: js.UndefOr[Flag]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var SourceRegion: js.UndefOr[Region]
    var Tags: js.UndefOr[Tags]
  }

  object CopyBackupRequest {
    @inline
    def apply(
        SourceBackupId: SourceBackupId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        CopyTags: js.UndefOr[Flag] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        SourceRegion: js.UndefOr[Region] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CopyBackupRequest = {
      val __obj = js.Dynamic.literal(
        "SourceBackupId" -> SourceBackupId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      CopyTags.foreach(__v => __obj.updateDynamic("CopyTags")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyBackupRequest]
    }
  }

  @js.native
  trait CopyBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  object CopyBackupResponse {
    @inline
    def apply(
        Backup: js.UndefOr[Backup] = js.undefined
    ): CopyBackupResponse = {
      val __obj = js.Dynamic.literal()
      Backup.foreach(__v => __obj.updateDynamic("Backup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyBackupResponse]
    }
  }

  /** The request object for the <code>CreateBackup</code> operation.
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

  /** The response object for the <code>CreateBackup</code> operation.
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

  @js.native
  trait CreateDataRepositoryTaskRequest extends js.Object {
    var FileSystemId: FileSystemId
    var Report: CompletionReport
    var Type: DataRepositoryTaskType
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Paths: js.UndefOr[DataRepositoryTaskPaths]
    var Tags: js.UndefOr[Tags]
  }

  object CreateDataRepositoryTaskRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        Report: CompletionReport,
        Type: DataRepositoryTaskType,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Paths: js.UndefOr[DataRepositoryTaskPaths] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDataRepositoryTaskRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "Report" -> Report.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Paths.foreach(__v => __obj.updateDynamic("Paths")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataRepositoryTaskRequest]
    }
  }

  @js.native
  trait CreateDataRepositoryTaskResponse extends js.Object {
    var DataRepositoryTask: js.UndefOr[DataRepositoryTask]
  }

  object CreateDataRepositoryTaskResponse {
    @inline
    def apply(
        DataRepositoryTask: js.UndefOr[DataRepositoryTask] = js.undefined
    ): CreateDataRepositoryTaskResponse = {
      val __obj = js.Dynamic.literal()
      DataRepositoryTask.foreach(__v => __obj.updateDynamic("DataRepositoryTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataRepositoryTaskResponse]
    }
  }

  /** The request object for the <code>CreateFileSystemFromBackup</code> operation.
    */
  @js.native
  trait CreateFileSystemFromBackupRequest extends js.Object {
    var BackupId: BackupId
    var SubnetIds: SubnetIds
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var StorageType: js.UndefOr[StorageType]
    var Tags: js.UndefOr[Tags]
    var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration]
  }

  object CreateFileSystemFromBackupRequest {
    @inline
    def apply(
        BackupId: BackupId,
        SubnetIds: SubnetIds,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        StorageType: js.UndefOr[StorageType] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
    ): CreateFileSystemFromBackupRequest = {
      val __obj = js.Dynamic.literal(
        "BackupId" -> BackupId.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemFromBackupRequest]
    }
  }

  /** The response object for the <code>CreateFileSystemFromBackup</code> operation.
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

  /** The Lustre configuration for the file system being created.
    */
  @js.native
  trait CreateFileSystemLustreConfiguration extends js.Object {
    var AutoImportPolicy: js.UndefOr[AutoImportPolicyType]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DeploymentType: js.UndefOr[LustreDeploymentType]
    var DriveCacheType: js.UndefOr[DriveCacheType]
    var ExportPath: js.UndefOr[ArchivePath]
    var ImportPath: js.UndefOr[ArchivePath]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
    var PerUnitStorageThroughput: js.UndefOr[PerUnitStorageThroughput]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object CreateFileSystemLustreConfiguration {
    @inline
    def apply(
        AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.undefined,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DeploymentType: js.UndefOr[LustreDeploymentType] = js.undefined,
        DriveCacheType: js.UndefOr[DriveCacheType] = js.undefined,
        ExportPath: js.UndefOr[ArchivePath] = js.undefined,
        ImportPath: js.UndefOr[ArchivePath] = js.undefined,
        ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined,
        PerUnitStorageThroughput: js.UndefOr[PerUnitStorageThroughput] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): CreateFileSystemLustreConfiguration = {
      val __obj = js.Dynamic.literal()
      AutoImportPolicy.foreach(__v => __obj.updateDynamic("AutoImportPolicy")(__v.asInstanceOf[js.Any]))
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      DriveCacheType.foreach(__v => __obj.updateDynamic("DriveCacheType")(__v.asInstanceOf[js.Any]))
      ExportPath.foreach(__v => __obj.updateDynamic("ExportPath")(__v.asInstanceOf[js.Any]))
      ImportPath.foreach(__v => __obj.updateDynamic("ImportPath")(__v.asInstanceOf[js.Any]))
      ImportedFileChunkSize.foreach(__v => __obj.updateDynamic("ImportedFileChunkSize")(__v.asInstanceOf[js.Any]))
      PerUnitStorageThroughput.foreach(__v => __obj.updateDynamic("PerUnitStorageThroughput")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemLustreConfiguration]
    }
  }

  /** The request object used to create a new Amazon FSx file system.
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
    var StorageType: js.UndefOr[StorageType]
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
        StorageType: js.UndefOr[StorageType] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
    ): CreateFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemType" -> FileSystemType.asInstanceOf[js.Any],
        "StorageCapacity" -> StorageCapacity.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemRequest]
    }
  }

  /** The response object returned after the file system is created.
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

  /** The configuration object for the Microsoft Windows file system used in <code>CreateFileSystem</code> and <code>CreateFileSystemFromBackup</code> operations.
    */
  @js.native
  trait CreateFileSystemWindowsConfiguration extends js.Object {
    var ThroughputCapacity: MegabytesPerSecond
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var Aliases: js.UndefOr[AlternateDNSNames]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DeploymentType: js.UndefOr[WindowsDeploymentType]
    var PreferredSubnetId: js.UndefOr[SubnetId]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfiguration]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object CreateFileSystemWindowsConfiguration {
    @inline
    def apply(
        ThroughputCapacity: MegabytesPerSecond,
        ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Aliases: js.UndefOr[AlternateDNSNames] = js.undefined,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DeploymentType: js.UndefOr[WindowsDeploymentType] = js.undefined,
        PreferredSubnetId: js.UndefOr[SubnetId] = js.undefined,
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfiguration] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): CreateFileSystemWindowsConfiguration = {
      val __obj = js.Dynamic.literal(
        "ThroughputCapacity" -> ThroughputCapacity.asInstanceOf[js.Any]
      )

      ActiveDirectoryId.foreach(__v => __obj.updateDynamic("ActiveDirectoryId")(__v.asInstanceOf[js.Any]))
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      PreferredSubnetId.foreach(__v => __obj.updateDynamic("PreferredSubnetId")(__v.asInstanceOf[js.Any]))
      SelfManagedActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemWindowsConfiguration]
    }
  }

  /** The data repository configuration object for Lustre file systems returned in the response of the <code>CreateFileSystem</code> operation.
    */
  @js.native
  trait DataRepositoryConfiguration extends js.Object {
    var AutoImportPolicy: js.UndefOr[AutoImportPolicyType]
    var ExportPath: js.UndefOr[ArchivePath]
    var FailureDetails: js.UndefOr[DataRepositoryFailureDetails]
    var ImportPath: js.UndefOr[ArchivePath]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
    var Lifecycle: js.UndefOr[DataRepositoryLifecycle]
  }

  object DataRepositoryConfiguration {
    @inline
    def apply(
        AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.undefined,
        ExportPath: js.UndefOr[ArchivePath] = js.undefined,
        FailureDetails: js.UndefOr[DataRepositoryFailureDetails] = js.undefined,
        ImportPath: js.UndefOr[ArchivePath] = js.undefined,
        ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined,
        Lifecycle: js.UndefOr[DataRepositoryLifecycle] = js.undefined
    ): DataRepositoryConfiguration = {
      val __obj = js.Dynamic.literal()
      AutoImportPolicy.foreach(__v => __obj.updateDynamic("AutoImportPolicy")(__v.asInstanceOf[js.Any]))
      ExportPath.foreach(__v => __obj.updateDynamic("ExportPath")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      ImportPath.foreach(__v => __obj.updateDynamic("ImportPath")(__v.asInstanceOf[js.Any]))
      ImportedFileChunkSize.foreach(__v => __obj.updateDynamic("ImportedFileChunkSize")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRepositoryConfiguration]
    }
  }

  /** Provides detailed information about the data respository if its <code>Lifecycle</code> is set to <code>MISCONFIGURED</code>.
    */
  @js.native
  trait DataRepositoryFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  object DataRepositoryFailureDetails {
    @inline
    def apply(
        Message: js.UndefOr[ErrorMessage] = js.undefined
    ): DataRepositoryFailureDetails = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRepositoryFailureDetails]
    }
  }

  /** A description of the data repository task. You use data repository tasks to perform bulk transfer operations between your Amazon FSx file system and its linked data repository.
    */
  @js.native
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

  object DataRepositoryTask {
    @inline
    def apply(
        CreationTime: CreationTime,
        FileSystemId: FileSystemId,
        Lifecycle: DataRepositoryTaskLifecycle,
        TaskId: TaskId,
        Type: DataRepositoryTaskType,
        EndTime: js.UndefOr[EndTime] = js.undefined,
        FailureDetails: js.UndefOr[DataRepositoryTaskFailureDetails] = js.undefined,
        Paths: js.UndefOr[DataRepositoryTaskPaths] = js.undefined,
        Report: js.UndefOr[CompletionReport] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        StartTime: js.UndefOr[StartTime] = js.undefined,
        Status: js.UndefOr[DataRepositoryTaskStatus] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DataRepositoryTask = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "Lifecycle" -> Lifecycle.asInstanceOf[js.Any],
        "TaskId" -> TaskId.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      Paths.foreach(__v => __obj.updateDynamic("Paths")(__v.asInstanceOf[js.Any]))
      Report.foreach(__v => __obj.updateDynamic("Report")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRepositoryTask]
    }
  }

  /** Provides information about why a data repository task failed. Only populated when the task <code>Lifecycle</code> is set to <code>FAILED</code>.
    */
  @js.native
  trait DataRepositoryTaskFailureDetails extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  object DataRepositoryTaskFailureDetails {
    @inline
    def apply(
        Message: js.UndefOr[ErrorMessage] = js.undefined
    ): DataRepositoryTaskFailureDetails = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRepositoryTaskFailureDetails]
    }
  }

  /** (Optional) An array of filter objects you can use to filter the response of data repository tasks you will see in the the response. You can filter the tasks returned in the response by one or more file system IDs, task lifecycles, and by task type. A filter object consists of a filter <code>Name</code>, and one or more <code>Values</code> for the filter.
    */
  @js.native
  trait DataRepositoryTaskFilter extends js.Object {
    var Name: js.UndefOr[DataRepositoryTaskFilterName]
    var Values: js.UndefOr[DataRepositoryTaskFilterValues]
  }

  object DataRepositoryTaskFilter {
    @inline
    def apply(
        Name: js.UndefOr[DataRepositoryTaskFilterName] = js.undefined,
        Values: js.UndefOr[DataRepositoryTaskFilterValues] = js.undefined
    ): DataRepositoryTaskFilter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRepositoryTaskFilter]
    }
  }

  /** Provides the task status showing a running total of the total number of files to be processed, the number successfully processed, and the number of files the task failed to process.
    */
  @js.native
  trait DataRepositoryTaskStatus extends js.Object {
    var FailedCount: js.UndefOr[FailedCount]
    var LastUpdatedTime: js.UndefOr[LastUpdatedTime]
    var SucceededCount: js.UndefOr[SucceededCount]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object DataRepositoryTaskStatus {
    @inline
    def apply(
        FailedCount: js.UndefOr[FailedCount] = js.undefined,
        LastUpdatedTime: js.UndefOr[LastUpdatedTime] = js.undefined,
        SucceededCount: js.UndefOr[SucceededCount] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): DataRepositoryTaskStatus = {
      val __obj = js.Dynamic.literal()
      FailedCount.foreach(__v => __obj.updateDynamic("FailedCount")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      SucceededCount.foreach(__v => __obj.updateDynamic("SucceededCount")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRepositoryTaskStatus]
    }
  }

  /** The request object for <code>DeleteBackup</code> operation.
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

  /** The response object for <code>DeleteBackup</code> operation.
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

  /** The configuration object for the Amazon FSx for Lustre file system being deleted in the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemLustreConfiguration extends js.Object {
    var FinalBackupTags: js.UndefOr[Tags]
    var SkipFinalBackup: js.UndefOr[Flag]
  }

  object DeleteFileSystemLustreConfiguration {
    @inline
    def apply(
        FinalBackupTags: js.UndefOr[Tags] = js.undefined,
        SkipFinalBackup: js.UndefOr[Flag] = js.undefined
    ): DeleteFileSystemLustreConfiguration = {
      val __obj = js.Dynamic.literal()
      FinalBackupTags.foreach(__v => __obj.updateDynamic("FinalBackupTags")(__v.asInstanceOf[js.Any]))
      SkipFinalBackup.foreach(__v => __obj.updateDynamic("SkipFinalBackup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemLustreConfiguration]
    }
  }

  /** The response object for the Amazon FSx for Lustre file system being deleted in the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemLustreResponse extends js.Object {
    var FinalBackupId: js.UndefOr[BackupId]
    var FinalBackupTags: js.UndefOr[Tags]
  }

  object DeleteFileSystemLustreResponse {
    @inline
    def apply(
        FinalBackupId: js.UndefOr[BackupId] = js.undefined,
        FinalBackupTags: js.UndefOr[Tags] = js.undefined
    ): DeleteFileSystemLustreResponse = {
      val __obj = js.Dynamic.literal()
      FinalBackupId.foreach(__v => __obj.updateDynamic("FinalBackupId")(__v.asInstanceOf[js.Any]))
      FinalBackupTags.foreach(__v => __obj.updateDynamic("FinalBackupTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemLustreResponse]
    }
  }

  /** The request object for <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var LustreConfiguration: js.UndefOr[DeleteFileSystemLustreConfiguration]
    var WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration]
  }

  object DeleteFileSystemRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        LustreConfiguration: js.UndefOr[DeleteFileSystemLustreConfiguration] = js.undefined,
        WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration] = js.undefined
    ): DeleteFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemRequest]
    }
  }

  /** The response object for the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemResponse extends js.Object {
    var FileSystemId: js.UndefOr[FileSystemId]
    var Lifecycle: js.UndefOr[FileSystemLifecycle]
    var LustreResponse: js.UndefOr[DeleteFileSystemLustreResponse]
    var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse]
  }

  object DeleteFileSystemResponse {
    @inline
    def apply(
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined,
        LustreResponse: js.UndefOr[DeleteFileSystemLustreResponse] = js.undefined,
        WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.undefined
    ): DeleteFileSystemResponse = {
      val __obj = js.Dynamic.literal()
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      LustreResponse.foreach(__v => __obj.updateDynamic("LustreResponse")(__v.asInstanceOf[js.Any]))
      WindowsResponse.foreach(__v => __obj.updateDynamic("WindowsResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemResponse]
    }
  }

  /** The configuration object for the Microsoft Windows file system used in the <code>DeleteFileSystem</code> operation.
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

  /** The response object for the Microsoft Windows file system used in the <code>DeleteFileSystem</code> operation.
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

  /** The request object for <code>DescribeBackups</code> operation.
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

  /** Response object for <code>DescribeBackups</code> operation.
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

  @js.native
  trait DescribeDataRepositoryTasksRequest extends js.Object {
    var Filters: js.UndefOr[DataRepositoryTaskFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TaskIds: js.UndefOr[TaskIds]
  }

  object DescribeDataRepositoryTasksRequest {
    @inline
    def apply(
        Filters: js.UndefOr[DataRepositoryTaskFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TaskIds: js.UndefOr[TaskIds] = js.undefined
    ): DescribeDataRepositoryTasksRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TaskIds.foreach(__v => __obj.updateDynamic("TaskIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataRepositoryTasksRequest]
    }
  }

  @js.native
  trait DescribeDataRepositoryTasksResponse extends js.Object {
    var DataRepositoryTasks: js.UndefOr[DataRepositoryTasks]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDataRepositoryTasksResponse {
    @inline
    def apply(
        DataRepositoryTasks: js.UndefOr[DataRepositoryTasks] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDataRepositoryTasksResponse = {
      val __obj = js.Dynamic.literal()
      DataRepositoryTasks.foreach(__v => __obj.updateDynamic("DataRepositoryTasks")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataRepositoryTasksResponse]
    }
  }

  /** The request object for <code>DescribeFileSystemAliases</code> operation.
    */
  @js.native
  trait DescribeFileSystemAliasesRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeFileSystemAliasesRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeFileSystemAliasesRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFileSystemAliasesRequest]
    }
  }

  /** The response object for <code>DescribeFileSystemAliases</code> operation.
    */
  @js.native
  trait DescribeFileSystemAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[Aliases]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeFileSystemAliasesResponse {
    @inline
    def apply(
        Aliases: js.UndefOr[Aliases] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeFileSystemAliasesResponse = {
      val __obj = js.Dynamic.literal()
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFileSystemAliasesResponse]
    }
  }

  /** The request object for <code>DescribeFileSystems</code> operation.
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

  /** The response object for <code>DescribeFileSystems</code> operation.
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

  /** The request object of DNS aliases to disassociate from an Amazon FSx for Windows File Server file system.
    */
  @js.native
  trait DisassociateFileSystemAliasesRequest extends js.Object {
    var Aliases: AlternateDNSNames
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object DisassociateFileSystemAliasesRequest {
    @inline
    def apply(
        Aliases: AlternateDNSNames,
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): DisassociateFileSystemAliasesRequest = {
      val __obj = js.Dynamic.literal(
        "Aliases" -> Aliases.asInstanceOf[js.Any],
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateFileSystemAliasesRequest]
    }
  }

  /** The system generated response showing the DNS aliases that Amazon FSx is attempting to disassociate from the file system. Use the API operation to monitor the status of the aliases Amazon FSx is removing from the file system.
    */
  @js.native
  trait DisassociateFileSystemAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[Aliases]
  }

  object DisassociateFileSystemAliasesResponse {
    @inline
    def apply(
        Aliases: js.UndefOr[Aliases] = js.undefined
    ): DisassociateFileSystemAliasesResponse = {
      val __obj = js.Dynamic.literal()
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateFileSystemAliasesResponse]
    }
  }

  /** A description of a specific Amazon FSx file system.
    */
  @js.native
  trait FileSystem extends js.Object {
    var AdministrativeActions: js.UndefOr[AdministrativeActions]
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
    var StorageType: js.UndefOr[StorageType]
    var SubnetIds: js.UndefOr[SubnetIds]
    var Tags: js.UndefOr[Tags]
    var VpcId: js.UndefOr[VpcId]
    var WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration]
  }

  object FileSystem {
    @inline
    def apply(
        AdministrativeActions: js.UndefOr[AdministrativeActions] = js.undefined,
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
        StorageType: js.UndefOr[StorageType] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined,
        WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration] = js.undefined
    ): FileSystem = {
      val __obj = js.Dynamic.literal()
      AdministrativeActions.foreach(__v => __obj.updateDynamic("AdministrativeActions")(__v.asInstanceOf[js.Any]))
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
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystem]
    }
  }

  /** A structure providing details of any failures that occur when creating the file system has failed.
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

  /** A filter used to restrict the results of describe calls. You can use multiple filters to return results that meet all applied filter requirements.
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

  /** The request object for <code>ListTagsForResource</code> operation.
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

  /** The response object for <code>ListTagsForResource</code> operation.
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

  /** The configuration for the Amazon FSx for Lustre file system.
    */
  @js.native
  trait LustreFileSystemConfiguration extends js.Object {
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration]
    var DeploymentType: js.UndefOr[LustreDeploymentType]
    var DriveCacheType: js.UndefOr[DriveCacheType]
    var MountName: js.UndefOr[LustreFileSystemMountName]
    var PerUnitStorageThroughput: js.UndefOr[PerUnitStorageThroughput]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object LustreFileSystemConfiguration {
    @inline
    def apply(
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration] = js.undefined,
        DeploymentType: js.UndefOr[LustreDeploymentType] = js.undefined,
        DriveCacheType: js.UndefOr[DriveCacheType] = js.undefined,
        MountName: js.UndefOr[LustreFileSystemMountName] = js.undefined,
        PerUnitStorageThroughput: js.UndefOr[PerUnitStorageThroughput] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): LustreFileSystemConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DataRepositoryConfiguration.foreach(__v => __obj.updateDynamic("DataRepositoryConfiguration")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      DriveCacheType.foreach(__v => __obj.updateDynamic("DriveCacheType")(__v.asInstanceOf[js.Any]))
      MountName.foreach(__v => __obj.updateDynamic("MountName")(__v.asInstanceOf[js.Any]))
      PerUnitStorageThroughput.foreach(__v => __obj.updateDynamic("PerUnitStorageThroughput")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LustreFileSystemConfiguration]
    }
  }

  /** The configuration of the self-managed Microsoft Active Directory (AD) directory to which the Windows File Server instance is joined.
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
      FileSystemAdministratorsGroup.foreach(__v => __obj.updateDynamic("FileSystemAdministratorsGroup")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitDistinguishedName.foreach(__v => __obj.updateDynamic("OrganizationalUnitDistinguishedName")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelfManagedActiveDirectoryAttributes]
    }
  }

  /** The configuration that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. For more information, see [[https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html| Using Amazon FSx with your self-managed Microsoft Active Directory]].
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
        "DnsIps" -> DnsIps.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      FileSystemAdministratorsGroup.foreach(__v => __obj.updateDynamic("FileSystemAdministratorsGroup")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitDistinguishedName.foreach(__v => __obj.updateDynamic("OrganizationalUnitDistinguishedName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelfManagedActiveDirectoryConfiguration]
    }
  }

  /** The configuration that Amazon FSx uses to join the Windows File Server instance to a self-managed Microsoft Active Directory (AD) directory.
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

  /** Specifies a key-value pair for a resource tag.
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
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  /** The request object for the <code>TagResource</code> operation.
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
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** The response object for the <code>TagResource</code> operation.
    */
  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** The request object for <code>UntagResource</code> action.
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
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /** The response object for <code>UntagResource</code> action.
    */
  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** The configuration object for Amazon FSx for Lustre file systems used in the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  trait UpdateFileSystemLustreConfiguration extends js.Object {
    var AutoImportPolicy: js.UndefOr[AutoImportPolicyType]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object UpdateFileSystemLustreConfiguration {
    @inline
    def apply(
        AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.undefined,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): UpdateFileSystemLustreConfiguration = {
      val __obj = js.Dynamic.literal()
      AutoImportPolicy.foreach(__v => __obj.updateDynamic("AutoImportPolicy")(__v.asInstanceOf[js.Any]))
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemLustreConfiguration]
    }
  }

  /** The request object for the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  trait UpdateFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration]
    var StorageCapacity: js.UndefOr[StorageCapacity]
    var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration]
  }

  object UpdateFileSystemRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.undefined,
        StorageCapacity: js.UndefOr[StorageCapacity] = js.undefined,
        WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.undefined
    ): UpdateFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      StorageCapacity.foreach(__v => __obj.updateDynamic("StorageCapacity")(__v.asInstanceOf[js.Any]))
      WindowsConfiguration.foreach(__v => __obj.updateDynamic("WindowsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemRequest]
    }
  }

  /** The response object for the <code>UpdateFileSystem</code> operation.
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

  /** Updates the configuration for an existing Amazon FSx for Windows File Server file system. Amazon FSx only overwrites existing properties with non-null values provided in the request.
    */
  @js.native
  trait UpdateFileSystemWindowsConfiguration extends js.Object {
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates]
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object UpdateFileSystemWindowsConfiguration {
    @inline
    def apply(
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] = js.undefined,
        ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): UpdateFileSystemWindowsConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      SelfManagedActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      ThroughputCapacity.foreach(__v => __obj.updateDynamic("ThroughputCapacity")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemWindowsConfiguration]
    }
  }

  /** The configuration for this Microsoft Windows file system.
    */
  @js.native
  trait WindowsFileSystemConfiguration extends js.Object {
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var Aliases: js.UndefOr[Aliases]
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

  object WindowsFileSystemConfiguration {
    @inline
    def apply(
        ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Aliases: js.UndefOr[Aliases] = js.undefined,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DeploymentType: js.UndefOr[WindowsDeploymentType] = js.undefined,
        MaintenanceOperationsInProgress: js.UndefOr[FileSystemMaintenanceOperations] = js.undefined,
        PreferredFileServerIp: js.UndefOr[IpAddress] = js.undefined,
        PreferredSubnetId: js.UndefOr[SubnetId] = js.undefined,
        RemoteAdministrationEndpoint: js.UndefOr[DNSName] = js.undefined,
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes] = js.undefined,
        ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): WindowsFileSystemConfiguration = {
      val __obj = js.Dynamic.literal()
      ActiveDirectoryId.foreach(__v => __obj.updateDynamic("ActiveDirectoryId")(__v.asInstanceOf[js.Any]))
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      MaintenanceOperationsInProgress.foreach(__v => __obj.updateDynamic("MaintenanceOperationsInProgress")(__v.asInstanceOf[js.Any]))
      PreferredFileServerIp.foreach(__v => __obj.updateDynamic("PreferredFileServerIp")(__v.asInstanceOf[js.Any]))
      PreferredSubnetId.foreach(__v => __obj.updateDynamic("PreferredSubnetId")(__v.asInstanceOf[js.Any]))
      RemoteAdministrationEndpoint.foreach(__v => __obj.updateDynamic("RemoteAdministrationEndpoint")(__v.asInstanceOf[js.Any]))
      SelfManagedActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      ThroughputCapacity.foreach(__v => __obj.updateDynamic("ThroughputCapacity")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WindowsFileSystemConfiguration]
    }
  }
}
