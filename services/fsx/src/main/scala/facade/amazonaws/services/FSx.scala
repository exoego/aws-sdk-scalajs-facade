package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object fsx {
  type AWSAccountId = String
  type ActiveDirectoryFullyQualifiedName = String
  type AdminPassword = String
  type AdministrativeActions = js.Array[AdministrativeAction]
  type Aliases = js.Array[Alias]
  type AlternateDNSName = String
  type AlternateDNSNames = js.Array[AlternateDNSName]
  type ArchivePath = String
  type AutomaticBackupRetentionDays = Int
  type BackupId = String
  type BackupIds = js.Array[BackupId]
  type Backups = js.Array[Backup]
  type BatchImportMetaDataOnCreate = Boolean
  type ClientRequestToken = String
  type CoolingPeriod = Int
  type CreationTime = js.Date
  type DNSName = String
  type DailyTime = String
  type DataRepositoryAssociationId = String
  type DataRepositoryAssociationIds = js.Array[DataRepositoryAssociationId]
  type DataRepositoryAssociations = js.Array[DataRepositoryAssociation]
  type DataRepositoryTaskFilterValue = String
  type DataRepositoryTaskFilterValues = js.Array[DataRepositoryTaskFilterValue]
  type DataRepositoryTaskFilters = js.Array[DataRepositoryTaskFilter]
  type DataRepositoryTaskPath = String
  type DataRepositoryTaskPaths = js.Array[DataRepositoryTaskPath]
  type DataRepositoryTasks = js.Array[DataRepositoryTask]
  type DeleteDataInFileSystem = Boolean
  type DeleteOpenZFSVolumeOptions = js.Array[DeleteOpenZFSVolumeOption]
  type DirectoryId = String
  type DirectoryPassword = String
  type DirectoryUserName = String
  type DnsIps = js.Array[IpAddress]
  type EndTime = js.Date
  type ErrorMessage = String
  type EventTypes = js.Array[EventType]
  type FailedCount = Double
  type FileSystemAdministratorsGroupName = String
  type FileSystemId = String
  type FileSystemIds = js.Array[FileSystemId]
  type FileSystemMaintenanceOperations = js.Array[FileSystemMaintenanceOperation]
  type FileSystemTypeVersion = String
  type FileSystems = js.Array[FileSystem]
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Flag = Boolean
  type GeneralARN = String
  type IntegerNoMax = Int
  type Iops = Double
  type IpAddress = String
  type IpAddressRange = String
  type JunctionPath = String
  type KmsKeyId = String
  type LastUpdatedTime = js.Date
  type LimitedMaxResults = Int
  type LustreFileSystemMountName = String
  type MaxResults = Int
  type Megabytes = Int
  type MegabytesPerSecond = Int
  type Namespace = String
  type NetBiosAlias = String
  type NetworkInterfaceId = String
  type NetworkInterfaceIds = js.Array[NetworkInterfaceId]
  type NextToken = String
  type OntapEndpointIpAddresses = js.Array[IpAddress]
  type OpenZFSClientConfigurations = js.Array[OpenZFSClientConfiguration]
  type OpenZFSClients = String
  type OpenZFSNfsExportOption = String
  type OpenZFSNfsExportOptions = js.Array[OpenZFSNfsExportOption]
  type OpenZFSNfsExports = js.Array[OpenZFSNfsExport]
  type OpenZFSUserAndGroupQuotas = js.Array[OpenZFSUserOrGroupQuota]
  type OrganizationalUnitDistinguishedName = String
  type PerUnitStorageThroughput = Int
  type ProgressPercent = Int
  type ReadOnly = Boolean
  type Region = String
  type RequestTime = js.Date
  type ResourceARN = String
  type RestoreOpenZFSVolumeOptions = js.Array[RestoreOpenZFSVolumeOption]
  type RouteTableId = String
  type RouteTableIds = js.Array[RouteTableId]
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SnapshotFilterValue = String
  type SnapshotFilterValues = js.Array[SnapshotFilterValue]
  type SnapshotFilters = js.Array[SnapshotFilter]
  type SnapshotId = String
  type SnapshotIds = js.Array[SnapshotId]
  type SnapshotName = String
  type Snapshots = js.Array[Snapshot]
  type SourceBackupId = String
  type StartTime = js.Date
  type StorageCapacity = Int
  type StorageVirtualMachineFilterValue = String
  type StorageVirtualMachineFilterValues = js.Array[StorageVirtualMachineFilterValue]
  type StorageVirtualMachineFilters = js.Array[StorageVirtualMachineFilter]
  type StorageVirtualMachineId = String
  type StorageVirtualMachineIds = js.Array[StorageVirtualMachineId]
  type StorageVirtualMachineName = String
  type StorageVirtualMachines = js.Array[StorageVirtualMachine]
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
  type UUID = String
  type VolumeCapacity = Int
  type VolumeFilterValue = String
  type VolumeFilterValues = js.Array[VolumeFilterValue]
  type VolumeFilters = js.Array[VolumeFilter]
  type VolumeId = String
  type VolumeIds = js.Array[VolumeId]
  type VolumeName = String
  type VolumePath = String
  type Volumes = js.Array[Volume]
  type VpcId = String
  type WeeklyTime = String

  final class FSxOps(private val service: FSx) extends AnyVal {

    @inline def associateFileSystemAliasesFuture(params: AssociateFileSystemAliasesRequest): Future[AssociateFileSystemAliasesResponse] = service.associateFileSystemAliases(params).promise().toFuture
    @inline def cancelDataRepositoryTaskFuture(params: CancelDataRepositoryTaskRequest): Future[CancelDataRepositoryTaskResponse] = service.cancelDataRepositoryTask(params).promise().toFuture
    @inline def copyBackupFuture(params: CopyBackupRequest): Future[CopyBackupResponse] = service.copyBackup(params).promise().toFuture
    @inline def createBackupFuture(params: CreateBackupRequest): Future[CreateBackupResponse] = service.createBackup(params).promise().toFuture
    @inline def createDataRepositoryAssociationFuture(params: CreateDataRepositoryAssociationRequest): Future[CreateDataRepositoryAssociationResponse] = service.createDataRepositoryAssociation(params).promise().toFuture
    @inline def createDataRepositoryTaskFuture(params: CreateDataRepositoryTaskRequest): Future[CreateDataRepositoryTaskResponse] = service.createDataRepositoryTask(params).promise().toFuture
    @inline def createFileSystemFromBackupFuture(params: CreateFileSystemFromBackupRequest): Future[CreateFileSystemFromBackupResponse] = service.createFileSystemFromBackup(params).promise().toFuture
    @inline def createFileSystemFuture(params: CreateFileSystemRequest): Future[CreateFileSystemResponse] = service.createFileSystem(params).promise().toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotRequest): Future[CreateSnapshotResponse] = service.createSnapshot(params).promise().toFuture
    @inline def createStorageVirtualMachineFuture(params: CreateStorageVirtualMachineRequest): Future[CreateStorageVirtualMachineResponse] = service.createStorageVirtualMachine(params).promise().toFuture
    @inline def createVolumeFromBackupFuture(params: CreateVolumeFromBackupRequest): Future[CreateVolumeFromBackupResponse] = service.createVolumeFromBackup(params).promise().toFuture
    @inline def createVolumeFuture(params: CreateVolumeRequest): Future[CreateVolumeResponse] = service.createVolume(params).promise().toFuture
    @inline def deleteBackupFuture(params: DeleteBackupRequest): Future[DeleteBackupResponse] = service.deleteBackup(params).promise().toFuture
    @inline def deleteDataRepositoryAssociationFuture(params: DeleteDataRepositoryAssociationRequest): Future[DeleteDataRepositoryAssociationResponse] = service.deleteDataRepositoryAssociation(params).promise().toFuture
    @inline def deleteFileSystemFuture(params: DeleteFileSystemRequest): Future[DeleteFileSystemResponse] = service.deleteFileSystem(params).promise().toFuture
    @inline def deleteSnapshotFuture(params: DeleteSnapshotRequest): Future[DeleteSnapshotResponse] = service.deleteSnapshot(params).promise().toFuture
    @inline def deleteStorageVirtualMachineFuture(params: DeleteStorageVirtualMachineRequest): Future[DeleteStorageVirtualMachineResponse] = service.deleteStorageVirtualMachine(params).promise().toFuture
    @inline def deleteVolumeFuture(params: DeleteVolumeRequest): Future[DeleteVolumeResponse] = service.deleteVolume(params).promise().toFuture
    @inline def describeBackupsFuture(params: DescribeBackupsRequest): Future[DescribeBackupsResponse] = service.describeBackups(params).promise().toFuture
    @inline def describeDataRepositoryAssociationsFuture(params: DescribeDataRepositoryAssociationsRequest): Future[DescribeDataRepositoryAssociationsResponse] = service.describeDataRepositoryAssociations(params).promise().toFuture
    @inline def describeDataRepositoryTasksFuture(params: DescribeDataRepositoryTasksRequest): Future[DescribeDataRepositoryTasksResponse] = service.describeDataRepositoryTasks(params).promise().toFuture
    @inline def describeFileSystemAliasesFuture(params: DescribeFileSystemAliasesRequest): Future[DescribeFileSystemAliasesResponse] = service.describeFileSystemAliases(params).promise().toFuture
    @inline def describeFileSystemsFuture(params: DescribeFileSystemsRequest): Future[DescribeFileSystemsResponse] = service.describeFileSystems(params).promise().toFuture
    @inline def describeSnapshotsFuture(params: DescribeSnapshotsRequest): Future[DescribeSnapshotsResponse] = service.describeSnapshots(params).promise().toFuture
    @inline def describeStorageVirtualMachinesFuture(params: DescribeStorageVirtualMachinesRequest): Future[DescribeStorageVirtualMachinesResponse] = service.describeStorageVirtualMachines(params).promise().toFuture
    @inline def describeVolumesFuture(params: DescribeVolumesRequest): Future[DescribeVolumesResponse] = service.describeVolumes(params).promise().toFuture
    @inline def disassociateFileSystemAliasesFuture(params: DisassociateFileSystemAliasesRequest): Future[DisassociateFileSystemAliasesResponse] = service.disassociateFileSystemAliases(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def releaseFileSystemNfsV3LocksFuture(params: ReleaseFileSystemNfsV3LocksRequest): Future[ReleaseFileSystemNfsV3LocksResponse] = service.releaseFileSystemNfsV3Locks(params).promise().toFuture
    @inline def restoreVolumeFromSnapshotFuture(params: RestoreVolumeFromSnapshotRequest): Future[RestoreVolumeFromSnapshotResponse] = service.restoreVolumeFromSnapshot(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDataRepositoryAssociationFuture(params: UpdateDataRepositoryAssociationRequest): Future[UpdateDataRepositoryAssociationResponse] = service.updateDataRepositoryAssociation(params).promise().toFuture
    @inline def updateFileSystemFuture(params: UpdateFileSystemRequest): Future[UpdateFileSystemResponse] = service.updateFileSystem(params).promise().toFuture
    @inline def updateSnapshotFuture(params: UpdateSnapshotRequest): Future[UpdateSnapshotResponse] = service.updateSnapshot(params).promise().toFuture
    @inline def updateStorageVirtualMachineFuture(params: UpdateStorageVirtualMachineRequest): Future[UpdateStorageVirtualMachineResponse] = service.updateStorageVirtualMachine(params).promise().toFuture
    @inline def updateVolumeFuture(params: UpdateVolumeRequest): Future[UpdateVolumeResponse] = service.updateVolume(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/fsx", JSImport.Namespace, "AWS.FSx")
  class FSx() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateFileSystemAliases(params: AssociateFileSystemAliasesRequest): Request[AssociateFileSystemAliasesResponse] = js.native
    def cancelDataRepositoryTask(params: CancelDataRepositoryTaskRequest): Request[CancelDataRepositoryTaskResponse] = js.native
    def copyBackup(params: CopyBackupRequest): Request[CopyBackupResponse] = js.native
    def createBackup(params: CreateBackupRequest): Request[CreateBackupResponse] = js.native
    def createDataRepositoryAssociation(params: CreateDataRepositoryAssociationRequest): Request[CreateDataRepositoryAssociationResponse] = js.native
    def createDataRepositoryTask(params: CreateDataRepositoryTaskRequest): Request[CreateDataRepositoryTaskResponse] = js.native
    def createFileSystem(params: CreateFileSystemRequest): Request[CreateFileSystemResponse] = js.native
    def createFileSystemFromBackup(params: CreateFileSystemFromBackupRequest): Request[CreateFileSystemFromBackupResponse] = js.native
    def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResponse] = js.native
    def createStorageVirtualMachine(params: CreateStorageVirtualMachineRequest): Request[CreateStorageVirtualMachineResponse] = js.native
    def createVolume(params: CreateVolumeRequest): Request[CreateVolumeResponse] = js.native
    def createVolumeFromBackup(params: CreateVolumeFromBackupRequest): Request[CreateVolumeFromBackupResponse] = js.native
    def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse] = js.native
    def deleteDataRepositoryAssociation(params: DeleteDataRepositoryAssociationRequest): Request[DeleteDataRepositoryAssociationResponse] = js.native
    def deleteFileSystem(params: DeleteFileSystemRequest): Request[DeleteFileSystemResponse] = js.native
    def deleteSnapshot(params: DeleteSnapshotRequest): Request[DeleteSnapshotResponse] = js.native
    def deleteStorageVirtualMachine(params: DeleteStorageVirtualMachineRequest): Request[DeleteStorageVirtualMachineResponse] = js.native
    def deleteVolume(params: DeleteVolumeRequest): Request[DeleteVolumeResponse] = js.native
    def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse] = js.native
    def describeDataRepositoryAssociations(params: DescribeDataRepositoryAssociationsRequest): Request[DescribeDataRepositoryAssociationsResponse] = js.native
    def describeDataRepositoryTasks(params: DescribeDataRepositoryTasksRequest): Request[DescribeDataRepositoryTasksResponse] = js.native
    def describeFileSystemAliases(params: DescribeFileSystemAliasesRequest): Request[DescribeFileSystemAliasesResponse] = js.native
    def describeFileSystems(params: DescribeFileSystemsRequest): Request[DescribeFileSystemsResponse] = js.native
    def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResponse] = js.native
    def describeStorageVirtualMachines(params: DescribeStorageVirtualMachinesRequest): Request[DescribeStorageVirtualMachinesResponse] = js.native
    def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResponse] = js.native
    def disassociateFileSystemAliases(params: DisassociateFileSystemAliasesRequest): Request[DisassociateFileSystemAliasesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def releaseFileSystemNfsV3Locks(params: ReleaseFileSystemNfsV3LocksRequest): Request[ReleaseFileSystemNfsV3LocksResponse] = js.native
    def restoreVolumeFromSnapshot(params: RestoreVolumeFromSnapshotRequest): Request[RestoreVolumeFromSnapshotResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDataRepositoryAssociation(params: UpdateDataRepositoryAssociationRequest): Request[UpdateDataRepositoryAssociationResponse] = js.native
    def updateFileSystem(params: UpdateFileSystemRequest): Request[UpdateFileSystemResponse] = js.native
    def updateSnapshot(params: UpdateSnapshotRequest): Request[UpdateSnapshotResponse] = js.native
    def updateStorageVirtualMachine(params: UpdateStorageVirtualMachineRequest): Request[UpdateStorageVirtualMachineResponse] = js.native
    def updateVolume(params: UpdateVolumeRequest): Request[UpdateVolumeResponse] = js.native
  }
  object FSx {
    @inline implicit def toOps(service: FSx): FSxOps = {
      new FSxOps(service)
    }
  }

  /** The Microsoft Active Directory attributes of the Amazon FSx for Windows File Server file system.
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

  /** Describes a specific Amazon FSx administrative action for the current Windows, Lustre, or OpenZFS file system.
    */
  @js.native
  trait AdministrativeAction extends js.Object {
    var AdministrativeActionType: js.UndefOr[AdministrativeActionType]
    var FailureDetails: js.UndefOr[AdministrativeActionFailureDetails]
    var ProgressPercent: js.UndefOr[ProgressPercent]
    var RequestTime: js.UndefOr[RequestTime]
    var Status: js.UndefOr[Status]
    var TargetFileSystemValues: js.UndefOr[FileSystem]
    var TargetSnapshotValues: js.UndefOr[Snapshot]
    var TargetVolumeValues: js.UndefOr[Volume]
  }

  object AdministrativeAction {
    @inline
    def apply(
        AdministrativeActionType: js.UndefOr[AdministrativeActionType] = js.undefined,
        FailureDetails: js.UndefOr[AdministrativeActionFailureDetails] = js.undefined,
        ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
        RequestTime: js.UndefOr[RequestTime] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TargetFileSystemValues: js.UndefOr[FileSystem] = js.undefined,
        TargetSnapshotValues: js.UndefOr[Snapshot] = js.undefined,
        TargetVolumeValues: js.UndefOr[Volume] = js.undefined
    ): AdministrativeAction = {
      val __obj = js.Dynamic.literal()
      AdministrativeActionType.foreach(__v => __obj.updateDynamic("AdministrativeActionType")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      ProgressPercent.foreach(__v => __obj.updateDynamic("ProgressPercent")(__v.asInstanceOf[js.Any]))
      RequestTime.foreach(__v => __obj.updateDynamic("RequestTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetFileSystemValues.foreach(__v => __obj.updateDynamic("TargetFileSystemValues")(__v.asInstanceOf[js.Any]))
      TargetSnapshotValues.foreach(__v => __obj.updateDynamic("TargetSnapshotValues")(__v.asInstanceOf[js.Any]))
      TargetVolumeValues.foreach(__v => __obj.updateDynamic("TargetVolumeValues")(__v.asInstanceOf[js.Any]))
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

  /** Describes a data repository association's automatic export policy. The <code>AutoExportPolicy</code> defines the types of updated objects on the file system that will be automatically exported to the data repository. As you create, modify, or delete files, Amazon FSx automatically exports the defined changes asynchronously once your application finishes modifying the file. This <code>AutoExportPolicy</code> is supported only for file systems with the <code>Persistent_2</code> deployment type.
    */
  @js.native
  trait AutoExportPolicy extends js.Object {
    var Events: js.UndefOr[EventTypes]
  }

  object AutoExportPolicy {
    @inline
    def apply(
        Events: js.UndefOr[EventTypes] = js.undefined
    ): AutoExportPolicy = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoExportPolicy]
    }
  }

  /** Describes the data repository association's automatic import policy. The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings up to date by importing changes to your file system as you modify objects in a linked S3 bucket. This <code>AutoImportPolicy</code> is supported only for file systems with the <code>Persistent_2</code> deployment type.
    */
  @js.native
  trait AutoImportPolicy extends js.Object {
    var Events: js.UndefOr[EventTypes]
  }

  object AutoImportPolicy {
    @inline
    def apply(
        Events: js.UndefOr[EventTypes] = js.undefined
    ): AutoImportPolicy = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoImportPolicy]
    }
  }

  /** A backup of an Amazon FSx for Windows File Server, Amazon FSx for Lustre file system, Amazon FSx for NetApp ONTAP volume, or Amazon FSx for OpenZFS file system.
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
    var ResourceType: js.UndefOr[ResourceType]
    var SourceBackupId: js.UndefOr[BackupId]
    var SourceBackupRegion: js.UndefOr[Region]
    var Tags: js.UndefOr[Tags]
    var Volume: js.UndefOr[Volume]
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
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        SourceBackupId: js.UndefOr[BackupId] = js.undefined,
        SourceBackupRegion: js.UndefOr[Region] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Volume: js.UndefOr[Volume] = js.undefined
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
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SourceBackupId.foreach(__v => __obj.updateDynamic("SourceBackupId")(__v.asInstanceOf[js.Any]))
      SourceBackupRegion.foreach(__v => __obj.updateDynamic("SourceBackupRegion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Volume.foreach(__v => __obj.updateDynamic("Volume")(__v.asInstanceOf[js.Any]))
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
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var FileSystemId: js.UndefOr[FileSystemId]
    var Tags: js.UndefOr[Tags]
    var VolumeId: js.UndefOr[VolumeId]
  }

  object CreateBackupRequest {
    @inline
    def apply(
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VolumeId: js.UndefOr[VolumeId] = js.undefined
    ): CreateBackupRequest = {
      val __obj = js.Dynamic.literal()
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.updateDynamic("VolumeId")(__v.asInstanceOf[js.Any]))
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
  trait CreateDataRepositoryAssociationRequest extends js.Object {
    var DataRepositoryPath: ArchivePath
    var FileSystemId: FileSystemId
    var FileSystemPath: Namespace
    var BatchImportMetaDataOnCreate: js.UndefOr[BatchImportMetaDataOnCreate]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
    var S3: js.UndefOr[S3DataRepositoryConfiguration]
    var Tags: js.UndefOr[Tags]
  }

  object CreateDataRepositoryAssociationRequest {
    @inline
    def apply(
        DataRepositoryPath: ArchivePath,
        FileSystemId: FileSystemId,
        FileSystemPath: Namespace,
        BatchImportMetaDataOnCreate: js.UndefOr[BatchImportMetaDataOnCreate] = js.undefined,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined,
        S3: js.UndefOr[S3DataRepositoryConfiguration] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDataRepositoryAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "DataRepositoryPath" -> DataRepositoryPath.asInstanceOf[js.Any],
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "FileSystemPath" -> FileSystemPath.asInstanceOf[js.Any]
      )

      BatchImportMetaDataOnCreate.foreach(__v => __obj.updateDynamic("BatchImportMetaDataOnCreate")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      ImportedFileChunkSize.foreach(__v => __obj.updateDynamic("ImportedFileChunkSize")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataRepositoryAssociationRequest]
    }
  }

  @js.native
  trait CreateDataRepositoryAssociationResponse extends js.Object {
    var Association: js.UndefOr[DataRepositoryAssociation]
  }

  object CreateDataRepositoryAssociationResponse {
    @inline
    def apply(
        Association: js.UndefOr[DataRepositoryAssociation] = js.undefined
    ): CreateDataRepositoryAssociationResponse = {
      val __obj = js.Dynamic.literal()
      Association.foreach(__v => __obj.updateDynamic("Association")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataRepositoryAssociationResponse]
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
    var FileSystemTypeVersion: js.UndefOr[FileSystemTypeVersion]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration]
    var OpenZFSConfiguration: js.UndefOr[CreateFileSystemOpenZFSConfiguration]
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
        FileSystemTypeVersion: js.UndefOr[FileSystemTypeVersion] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.undefined,
        OpenZFSConfiguration: js.UndefOr[CreateFileSystemOpenZFSConfiguration] = js.undefined,
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
      FileSystemTypeVersion.foreach(__v => __obj.updateDynamic("FileSystemTypeVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      OpenZFSConfiguration.foreach(__v => __obj.updateDynamic("OpenZFSConfiguration")(__v.asInstanceOf[js.Any]))
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
    *
    * '''Note:'''The following parameters are not supported for file systems with the <code>Persistent_2</code> deployment type. Instead, use <code>CreateDataRepositoryAssociation</code> to create a data repository association to link your Lustre file system to a data repository. * <code>AutoImportPolicy</code> * <code>ExportPath</code> * <code>ImportedChunkSize</code> * <code>ImportPath</code>
    */
  @js.native
  trait CreateFileSystemLustreConfiguration extends js.Object {
    var AutoImportPolicy: js.UndefOr[AutoImportPolicyType]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DataCompressionType: js.UndefOr[DataCompressionType]
    var DeploymentType: js.UndefOr[LustreDeploymentType]
    var DriveCacheType: js.UndefOr[DriveCacheType]
    var ExportPath: js.UndefOr[ArchivePath]
    var ImportPath: js.UndefOr[ArchivePath]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
    var LogConfiguration: js.UndefOr[LustreLogCreateConfiguration]
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
        DataCompressionType: js.UndefOr[DataCompressionType] = js.undefined,
        DeploymentType: js.UndefOr[LustreDeploymentType] = js.undefined,
        DriveCacheType: js.UndefOr[DriveCacheType] = js.undefined,
        ExportPath: js.UndefOr[ArchivePath] = js.undefined,
        ImportPath: js.UndefOr[ArchivePath] = js.undefined,
        ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined,
        LogConfiguration: js.UndefOr[LustreLogCreateConfiguration] = js.undefined,
        PerUnitStorageThroughput: js.UndefOr[PerUnitStorageThroughput] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): CreateFileSystemLustreConfiguration = {
      val __obj = js.Dynamic.literal()
      AutoImportPolicy.foreach(__v => __obj.updateDynamic("AutoImportPolicy")(__v.asInstanceOf[js.Any]))
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DataCompressionType.foreach(__v => __obj.updateDynamic("DataCompressionType")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      DriveCacheType.foreach(__v => __obj.updateDynamic("DriveCacheType")(__v.asInstanceOf[js.Any]))
      ExportPath.foreach(__v => __obj.updateDynamic("ExportPath")(__v.asInstanceOf[js.Any]))
      ImportPath.foreach(__v => __obj.updateDynamic("ImportPath")(__v.asInstanceOf[js.Any]))
      ImportedFileChunkSize.foreach(__v => __obj.updateDynamic("ImportedFileChunkSize")(__v.asInstanceOf[js.Any]))
      LogConfiguration.foreach(__v => __obj.updateDynamic("LogConfiguration")(__v.asInstanceOf[js.Any]))
      PerUnitStorageThroughput.foreach(__v => __obj.updateDynamic("PerUnitStorageThroughput")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemLustreConfiguration]
    }
  }

  /** The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
    */
  @js.native
  trait CreateFileSystemOntapConfiguration extends js.Object {
    var DeploymentType: OntapDeploymentType
    var ThroughputCapacity: MegabytesPerSecond
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration]
    var EndpointIpAddressRange: js.UndefOr[IpAddressRange]
    var FsxAdminPassword: js.UndefOr[AdminPassword]
    var PreferredSubnetId: js.UndefOr[SubnetId]
    var RouteTableIds: js.UndefOr[RouteTableIds]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object CreateFileSystemOntapConfiguration {
    @inline
    def apply(
        DeploymentType: OntapDeploymentType,
        ThroughputCapacity: MegabytesPerSecond,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration] = js.undefined,
        EndpointIpAddressRange: js.UndefOr[IpAddressRange] = js.undefined,
        FsxAdminPassword: js.UndefOr[AdminPassword] = js.undefined,
        PreferredSubnetId: js.UndefOr[SubnetId] = js.undefined,
        RouteTableIds: js.UndefOr[RouteTableIds] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): CreateFileSystemOntapConfiguration = {
      val __obj = js.Dynamic.literal(
        "DeploymentType" -> DeploymentType.asInstanceOf[js.Any],
        "ThroughputCapacity" -> ThroughputCapacity.asInstanceOf[js.Any]
      )

      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DiskIopsConfiguration.foreach(__v => __obj.updateDynamic("DiskIopsConfiguration")(__v.asInstanceOf[js.Any]))
      EndpointIpAddressRange.foreach(__v => __obj.updateDynamic("EndpointIpAddressRange")(__v.asInstanceOf[js.Any]))
      FsxAdminPassword.foreach(__v => __obj.updateDynamic("FsxAdminPassword")(__v.asInstanceOf[js.Any]))
      PreferredSubnetId.foreach(__v => __obj.updateDynamic("PreferredSubnetId")(__v.asInstanceOf[js.Any]))
      RouteTableIds.foreach(__v => __obj.updateDynamic("RouteTableIds")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemOntapConfiguration]
    }
  }

  /** The OpenZFS configuration properties for the file system that you are creating.
    */
  @js.native
  trait CreateFileSystemOpenZFSConfiguration extends js.Object {
    var DeploymentType: OpenZFSDeploymentType
    var ThroughputCapacity: MegabytesPerSecond
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var CopyTagsToVolumes: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration]
    var RootVolumeConfiguration: js.UndefOr[OpenZFSCreateRootVolumeConfiguration]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object CreateFileSystemOpenZFSConfiguration {
    @inline
    def apply(
        DeploymentType: OpenZFSDeploymentType,
        ThroughputCapacity: MegabytesPerSecond,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
        CopyTagsToVolumes: js.UndefOr[Flag] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration] = js.undefined,
        RootVolumeConfiguration: js.UndefOr[OpenZFSCreateRootVolumeConfiguration] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): CreateFileSystemOpenZFSConfiguration = {
      val __obj = js.Dynamic.literal(
        "DeploymentType" -> DeploymentType.asInstanceOf[js.Any],
        "ThroughputCapacity" -> ThroughputCapacity.asInstanceOf[js.Any]
      )

      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      CopyTagsToVolumes.foreach(__v => __obj.updateDynamic("CopyTagsToVolumes")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DiskIopsConfiguration.foreach(__v => __obj.updateDynamic("DiskIopsConfiguration")(__v.asInstanceOf[js.Any]))
      RootVolumeConfiguration.foreach(__v => __obj.updateDynamic("RootVolumeConfiguration")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFileSystemOpenZFSConfiguration]
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
    var FileSystemTypeVersion: js.UndefOr[FileSystemTypeVersion]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration]
    var OntapConfiguration: js.UndefOr[CreateFileSystemOntapConfiguration]
    var OpenZFSConfiguration: js.UndefOr[CreateFileSystemOpenZFSConfiguration]
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
        FileSystemTypeVersion: js.UndefOr[FileSystemTypeVersion] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.undefined,
        OntapConfiguration: js.UndefOr[CreateFileSystemOntapConfiguration] = js.undefined,
        OpenZFSConfiguration: js.UndefOr[CreateFileSystemOpenZFSConfiguration] = js.undefined,
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
      FileSystemTypeVersion.foreach(__v => __obj.updateDynamic("FileSystemTypeVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      OntapConfiguration.foreach(__v => __obj.updateDynamic("OntapConfiguration")(__v.asInstanceOf[js.Any]))
      OpenZFSConfiguration.foreach(__v => __obj.updateDynamic("OpenZFSConfiguration")(__v.asInstanceOf[js.Any]))
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
    var AuditLogConfiguration: js.UndefOr[WindowsAuditLogCreateConfiguration]
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
        AuditLogConfiguration: js.UndefOr[WindowsAuditLogCreateConfiguration] = js.undefined,
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
      AuditLogConfiguration.foreach(__v => __obj.updateDynamic("AuditLogConfiguration")(__v.asInstanceOf[js.Any]))
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

  /** Specifies the configuration of the ONTAP volume that you are creating.
    */
  @js.native
  trait CreateOntapVolumeConfiguration extends js.Object {
    var JunctionPath: JunctionPath
    var SizeInMegabytes: VolumeCapacity
    var StorageEfficiencyEnabled: Flag
    var StorageVirtualMachineId: StorageVirtualMachineId
    var SecurityStyle: js.UndefOr[SecurityStyle]
    var TieringPolicy: js.UndefOr[TieringPolicy]
  }

  object CreateOntapVolumeConfiguration {
    @inline
    def apply(
        JunctionPath: JunctionPath,
        SizeInMegabytes: VolumeCapacity,
        StorageEfficiencyEnabled: Flag,
        StorageVirtualMachineId: StorageVirtualMachineId,
        SecurityStyle: js.UndefOr[SecurityStyle] = js.undefined,
        TieringPolicy: js.UndefOr[TieringPolicy] = js.undefined
    ): CreateOntapVolumeConfiguration = {
      val __obj = js.Dynamic.literal(
        "JunctionPath" -> JunctionPath.asInstanceOf[js.Any],
        "SizeInMegabytes" -> SizeInMegabytes.asInstanceOf[js.Any],
        "StorageEfficiencyEnabled" -> StorageEfficiencyEnabled.asInstanceOf[js.Any],
        "StorageVirtualMachineId" -> StorageVirtualMachineId.asInstanceOf[js.Any]
      )

      SecurityStyle.foreach(__v => __obj.updateDynamic("SecurityStyle")(__v.asInstanceOf[js.Any]))
      TieringPolicy.foreach(__v => __obj.updateDynamic("TieringPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOntapVolumeConfiguration]
    }
  }

  /** The snapshot configuration to use when creating an OpenZFS volume from a snapshot.
    */
  @js.native
  trait CreateOpenZFSOriginSnapshotConfiguration extends js.Object {
    var CopyStrategy: OpenZFSCopyStrategy
    var SnapshotARN: ResourceARN
  }

  object CreateOpenZFSOriginSnapshotConfiguration {
    @inline
    def apply(
        CopyStrategy: OpenZFSCopyStrategy,
        SnapshotARN: ResourceARN
    ): CreateOpenZFSOriginSnapshotConfiguration = {
      val __obj = js.Dynamic.literal(
        "CopyStrategy" -> CopyStrategy.asInstanceOf[js.Any],
        "SnapshotARN" -> SnapshotARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateOpenZFSOriginSnapshotConfiguration]
    }
  }

  /** Specifies the configuration of the OpenZFS volume that you are creating.
    */
  @js.native
  trait CreateOpenZFSVolumeConfiguration extends js.Object {
    var ParentVolumeId: VolumeId
    var CopyTagsToSnapshots: js.UndefOr[Flag]
    var DataCompressionType: js.UndefOr[OpenZFSDataCompressionType]
    var NfsExports: js.UndefOr[OpenZFSNfsExports]
    var OriginSnapshot: js.UndefOr[CreateOpenZFSOriginSnapshotConfiguration]
    var ReadOnly: js.UndefOr[ReadOnly]
    var StorageCapacityQuotaGiB: js.UndefOr[IntegerNoMax]
    var StorageCapacityReservationGiB: js.UndefOr[IntegerNoMax]
    var UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas]
  }

  object CreateOpenZFSVolumeConfiguration {
    @inline
    def apply(
        ParentVolumeId: VolumeId,
        CopyTagsToSnapshots: js.UndefOr[Flag] = js.undefined,
        DataCompressionType: js.UndefOr[OpenZFSDataCompressionType] = js.undefined,
        NfsExports: js.UndefOr[OpenZFSNfsExports] = js.undefined,
        OriginSnapshot: js.UndefOr[CreateOpenZFSOriginSnapshotConfiguration] = js.undefined,
        ReadOnly: js.UndefOr[ReadOnly] = js.undefined,
        StorageCapacityQuotaGiB: js.UndefOr[IntegerNoMax] = js.undefined,
        StorageCapacityReservationGiB: js.UndefOr[IntegerNoMax] = js.undefined,
        UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas] = js.undefined
    ): CreateOpenZFSVolumeConfiguration = {
      val __obj = js.Dynamic.literal(
        "ParentVolumeId" -> ParentVolumeId.asInstanceOf[js.Any]
      )

      CopyTagsToSnapshots.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshots")(__v.asInstanceOf[js.Any]))
      DataCompressionType.foreach(__v => __obj.updateDynamic("DataCompressionType")(__v.asInstanceOf[js.Any]))
      NfsExports.foreach(__v => __obj.updateDynamic("NfsExports")(__v.asInstanceOf[js.Any]))
      OriginSnapshot.foreach(__v => __obj.updateDynamic("OriginSnapshot")(__v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.updateDynamic("ReadOnly")(__v.asInstanceOf[js.Any]))
      StorageCapacityQuotaGiB.foreach(__v => __obj.updateDynamic("StorageCapacityQuotaGiB")(__v.asInstanceOf[js.Any]))
      StorageCapacityReservationGiB.foreach(__v => __obj.updateDynamic("StorageCapacityReservationGiB")(__v.asInstanceOf[js.Any]))
      UserAndGroupQuotas.foreach(__v => __obj.updateDynamic("UserAndGroupQuotas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOpenZFSVolumeConfiguration]
    }
  }

  @js.native
  trait CreateSnapshotRequest extends js.Object {
    var Name: SnapshotName
    var VolumeId: VolumeId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[Tags]
  }

  object CreateSnapshotRequest {
    @inline
    def apply(
        Name: SnapshotName,
        VolumeId: VolumeId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "VolumeId" -> VolumeId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotRequest]
    }
  }

  @js.native
  trait CreateSnapshotResponse extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object CreateSnapshotResponse {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CreateSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotResponse]
    }
  }

  @js.native
  trait CreateStorageVirtualMachineRequest extends js.Object {
    var FileSystemId: FileSystemId
    var Name: StorageVirtualMachineName
    var ActiveDirectoryConfiguration: js.UndefOr[CreateSvmActiveDirectoryConfiguration]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var RootVolumeSecurityStyle: js.UndefOr[StorageVirtualMachineRootVolumeSecurityStyle]
    var SvmAdminPassword: js.UndefOr[AdminPassword]
    var Tags: js.UndefOr[Tags]
  }

  object CreateStorageVirtualMachineRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        Name: StorageVirtualMachineName,
        ActiveDirectoryConfiguration: js.UndefOr[CreateSvmActiveDirectoryConfiguration] = js.undefined,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        RootVolumeSecurityStyle: js.UndefOr[StorageVirtualMachineRootVolumeSecurityStyle] = js.undefined,
        SvmAdminPassword: js.UndefOr[AdminPassword] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateStorageVirtualMachineRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("ActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      RootVolumeSecurityStyle.foreach(__v => __obj.updateDynamic("RootVolumeSecurityStyle")(__v.asInstanceOf[js.Any]))
      SvmAdminPassword.foreach(__v => __obj.updateDynamic("SvmAdminPassword")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStorageVirtualMachineRequest]
    }
  }

  @js.native
  trait CreateStorageVirtualMachineResponse extends js.Object {
    var StorageVirtualMachine: js.UndefOr[StorageVirtualMachine]
  }

  object CreateStorageVirtualMachineResponse {
    @inline
    def apply(
        StorageVirtualMachine: js.UndefOr[StorageVirtualMachine] = js.undefined
    ): CreateStorageVirtualMachineResponse = {
      val __obj = js.Dynamic.literal()
      StorageVirtualMachine.foreach(__v => __obj.updateDynamic("StorageVirtualMachine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStorageVirtualMachineResponse]
    }
  }

  /** The configuration that Amazon FSx uses to join the ONTAP storage virtual machine (SVM) to your self-managed (including on-premises) Microsoft Active Directory (AD) directory.
    */
  @js.native
  trait CreateSvmActiveDirectoryConfiguration extends js.Object {
    var NetBiosName: NetBiosAlias
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfiguration]
  }

  object CreateSvmActiveDirectoryConfiguration {
    @inline
    def apply(
        NetBiosName: NetBiosAlias,
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfiguration] = js.undefined
    ): CreateSvmActiveDirectoryConfiguration = {
      val __obj = js.Dynamic.literal(
        "NetBiosName" -> NetBiosName.asInstanceOf[js.Any]
      )

      SelfManagedActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSvmActiveDirectoryConfiguration]
    }
  }

  @js.native
  trait CreateVolumeFromBackupRequest extends js.Object {
    var BackupId: BackupId
    var Name: VolumeName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var OntapConfiguration: js.UndefOr[CreateOntapVolumeConfiguration]
    var Tags: js.UndefOr[Tags]
  }

  object CreateVolumeFromBackupRequest {
    @inline
    def apply(
        BackupId: BackupId,
        Name: VolumeName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        OntapConfiguration: js.UndefOr[CreateOntapVolumeConfiguration] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateVolumeFromBackupRequest = {
      val __obj = js.Dynamic.literal(
        "BackupId" -> BackupId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      OntapConfiguration.foreach(__v => __obj.updateDynamic("OntapConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVolumeFromBackupRequest]
    }
  }

  @js.native
  trait CreateVolumeFromBackupResponse extends js.Object {
    var Volume: js.UndefOr[Volume]
  }

  object CreateVolumeFromBackupResponse {
    @inline
    def apply(
        Volume: js.UndefOr[Volume] = js.undefined
    ): CreateVolumeFromBackupResponse = {
      val __obj = js.Dynamic.literal()
      Volume.foreach(__v => __obj.updateDynamic("Volume")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVolumeFromBackupResponse]
    }
  }

  @js.native
  trait CreateVolumeRequest extends js.Object {
    var Name: VolumeName
    var VolumeType: VolumeType
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var OntapConfiguration: js.UndefOr[CreateOntapVolumeConfiguration]
    var OpenZFSConfiguration: js.UndefOr[CreateOpenZFSVolumeConfiguration]
    var Tags: js.UndefOr[Tags]
  }

  object CreateVolumeRequest {
    @inline
    def apply(
        Name: VolumeName,
        VolumeType: VolumeType,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        OntapConfiguration: js.UndefOr[CreateOntapVolumeConfiguration] = js.undefined,
        OpenZFSConfiguration: js.UndefOr[CreateOpenZFSVolumeConfiguration] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateVolumeRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "VolumeType" -> VolumeType.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      OntapConfiguration.foreach(__v => __obj.updateDynamic("OntapConfiguration")(__v.asInstanceOf[js.Any]))
      OpenZFSConfiguration.foreach(__v => __obj.updateDynamic("OpenZFSConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVolumeRequest]
    }
  }

  @js.native
  trait CreateVolumeResponse extends js.Object {
    var Volume: js.UndefOr[Volume]
  }

  object CreateVolumeResponse {
    @inline
    def apply(
        Volume: js.UndefOr[Volume] = js.undefined
    ): CreateVolumeResponse = {
      val __obj = js.Dynamic.literal()
      Volume.foreach(__v => __obj.updateDynamic("Volume")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVolumeResponse]
    }
  }

  /** The configuration of a data repository association that links an Amazon FSx for Lustre file system to an Amazon S3 bucket. The data repository association configuration object is returned in the response of the following operations: * <code>CreateDataRepositoryAssociation</code> * <code>UpdateDataRepositoryAssociation</code> * <code>DescribeDataRepositoryAssociations</code> Data repository associations are supported only for file systems with the <code>Persistent_2</code> deployment type.
    */
  @js.native
  trait DataRepositoryAssociation extends js.Object {
    var AssociationId: js.UndefOr[DataRepositoryAssociationId]
    var BatchImportMetaDataOnCreate: js.UndefOr[BatchImportMetaDataOnCreate]
    var CreationTime: js.UndefOr[CreationTime]
    var DataRepositoryPath: js.UndefOr[ArchivePath]
    var FailureDetails: js.UndefOr[DataRepositoryFailureDetails]
    var FileSystemId: js.UndefOr[FileSystemId]
    var FileSystemPath: js.UndefOr[Namespace]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
    var Lifecycle: js.UndefOr[DataRepositoryLifecycle]
    var ResourceARN: js.UndefOr[ResourceARN]
    var S3: js.UndefOr[S3DataRepositoryConfiguration]
    var Tags: js.UndefOr[Tags]
  }

  object DataRepositoryAssociation {
    @inline
    def apply(
        AssociationId: js.UndefOr[DataRepositoryAssociationId] = js.undefined,
        BatchImportMetaDataOnCreate: js.UndefOr[BatchImportMetaDataOnCreate] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        DataRepositoryPath: js.UndefOr[ArchivePath] = js.undefined,
        FailureDetails: js.UndefOr[DataRepositoryFailureDetails] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        FileSystemPath: js.UndefOr[Namespace] = js.undefined,
        ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined,
        Lifecycle: js.UndefOr[DataRepositoryLifecycle] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        S3: js.UndefOr[S3DataRepositoryConfiguration] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DataRepositoryAssociation = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      BatchImportMetaDataOnCreate.foreach(__v => __obj.updateDynamic("BatchImportMetaDataOnCreate")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DataRepositoryPath.foreach(__v => __obj.updateDynamic("DataRepositoryPath")(__v.asInstanceOf[js.Any]))
      FailureDetails.foreach(__v => __obj.updateDynamic("FailureDetails")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      FileSystemPath.foreach(__v => __obj.updateDynamic("FileSystemPath")(__v.asInstanceOf[js.Any]))
      ImportedFileChunkSize.foreach(__v => __obj.updateDynamic("ImportedFileChunkSize")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataRepositoryAssociation]
    }
  }

  /** The data repository configuration object for Lustre file systems returned in the response of the <code>CreateFileSystem</code> operation. This data type is not supported for file systems with the <code>Persistent_2</code> deployment type. Instead, use .
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

  /** Provides detailed information about the data respository if its <code>Lifecycle</code> is set to <code>MISCONFIGURED</code> or <code>FAILED</code>.
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

  /** A description of the data repository task. You use data repository tasks to perform bulk transfer operations between your Amazon FSx file system and a linked data repository.
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

  /** The request object for the <code>DeleteBackup</code> operation.
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

  /** The response object for the <code>DeleteBackup</code> operation.
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

  @js.native
  trait DeleteDataRepositoryAssociationRequest extends js.Object {
    var AssociationId: DataRepositoryAssociationId
    var DeleteDataInFileSystem: DeleteDataInFileSystem
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object DeleteDataRepositoryAssociationRequest {
    @inline
    def apply(
        AssociationId: DataRepositoryAssociationId,
        DeleteDataInFileSystem: DeleteDataInFileSystem,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): DeleteDataRepositoryAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any],
        "DeleteDataInFileSystem" -> DeleteDataInFileSystem.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDataRepositoryAssociationRequest]
    }
  }

  @js.native
  trait DeleteDataRepositoryAssociationResponse extends js.Object {
    var AssociationId: js.UndefOr[DataRepositoryAssociationId]
    var DeleteDataInFileSystem: js.UndefOr[DeleteDataInFileSystem]
    var Lifecycle: js.UndefOr[DataRepositoryLifecycle]
  }

  object DeleteDataRepositoryAssociationResponse {
    @inline
    def apply(
        AssociationId: js.UndefOr[DataRepositoryAssociationId] = js.undefined,
        DeleteDataInFileSystem: js.UndefOr[DeleteDataInFileSystem] = js.undefined,
        Lifecycle: js.UndefOr[DataRepositoryLifecycle] = js.undefined
    ): DeleteDataRepositoryAssociationResponse = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      DeleteDataInFileSystem.foreach(__v => __obj.updateDynamic("DeleteDataInFileSystem")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDataRepositoryAssociationResponse]
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

  /** The configuration object for the OpenZFS file system used in the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemOpenZFSConfiguration extends js.Object {
    var FinalBackupTags: js.UndefOr[Tags]
    var SkipFinalBackup: js.UndefOr[Flag]
  }

  object DeleteFileSystemOpenZFSConfiguration {
    @inline
    def apply(
        FinalBackupTags: js.UndefOr[Tags] = js.undefined,
        SkipFinalBackup: js.UndefOr[Flag] = js.undefined
    ): DeleteFileSystemOpenZFSConfiguration = {
      val __obj = js.Dynamic.literal()
      FinalBackupTags.foreach(__v => __obj.updateDynamic("FinalBackupTags")(__v.asInstanceOf[js.Any]))
      SkipFinalBackup.foreach(__v => __obj.updateDynamic("SkipFinalBackup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemOpenZFSConfiguration]
    }
  }

  /** The response object for the Amazon FSx for OpenZFS file system that's being deleted in the <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemOpenZFSResponse extends js.Object {
    var FinalBackupId: js.UndefOr[BackupId]
    var FinalBackupTags: js.UndefOr[Tags]
  }

  object DeleteFileSystemOpenZFSResponse {
    @inline
    def apply(
        FinalBackupId: js.UndefOr[BackupId] = js.undefined,
        FinalBackupTags: js.UndefOr[Tags] = js.undefined
    ): DeleteFileSystemOpenZFSResponse = {
      val __obj = js.Dynamic.literal()
      FinalBackupId.foreach(__v => __obj.updateDynamic("FinalBackupId")(__v.asInstanceOf[js.Any]))
      FinalBackupTags.foreach(__v => __obj.updateDynamic("FinalBackupTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileSystemOpenZFSResponse]
    }
  }

  /** The request object for <code>DeleteFileSystem</code> operation.
    */
  @js.native
  trait DeleteFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var LustreConfiguration: js.UndefOr[DeleteFileSystemLustreConfiguration]
    var OpenZFSConfiguration: js.UndefOr[DeleteFileSystemOpenZFSConfiguration]
    var WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration]
  }

  object DeleteFileSystemRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        LustreConfiguration: js.UndefOr[DeleteFileSystemLustreConfiguration] = js.undefined,
        OpenZFSConfiguration: js.UndefOr[DeleteFileSystemOpenZFSConfiguration] = js.undefined,
        WindowsConfiguration: js.UndefOr[DeleteFileSystemWindowsConfiguration] = js.undefined
    ): DeleteFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      OpenZFSConfiguration.foreach(__v => __obj.updateDynamic("OpenZFSConfiguration")(__v.asInstanceOf[js.Any]))
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
    var OpenZFSResponse: js.UndefOr[DeleteFileSystemOpenZFSResponse]
    var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse]
  }

  object DeleteFileSystemResponse {
    @inline
    def apply(
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined,
        LustreResponse: js.UndefOr[DeleteFileSystemLustreResponse] = js.undefined,
        OpenZFSResponse: js.UndefOr[DeleteFileSystemOpenZFSResponse] = js.undefined,
        WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.undefined
    ): DeleteFileSystemResponse = {
      val __obj = js.Dynamic.literal()
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      LustreResponse.foreach(__v => __obj.updateDynamic("LustreResponse")(__v.asInstanceOf[js.Any]))
      OpenZFSResponse.foreach(__v => __obj.updateDynamic("OpenZFSResponse")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait DeleteSnapshotRequest extends js.Object {
    var SnapshotId: SnapshotId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object DeleteSnapshotRequest {
    @inline
    def apply(
        SnapshotId: SnapshotId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): DeleteSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSnapshotRequest]
    }
  }

  @js.native
  trait DeleteSnapshotResponse extends js.Object {
    var Lifecycle: js.UndefOr[SnapshotLifecycle]
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object DeleteSnapshotResponse {
    @inline
    def apply(
        Lifecycle: js.UndefOr[SnapshotLifecycle] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): DeleteSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSnapshotResponse]
    }
  }

  @js.native
  trait DeleteStorageVirtualMachineRequest extends js.Object {
    var StorageVirtualMachineId: StorageVirtualMachineId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object DeleteStorageVirtualMachineRequest {
    @inline
    def apply(
        StorageVirtualMachineId: StorageVirtualMachineId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): DeleteStorageVirtualMachineRequest = {
      val __obj = js.Dynamic.literal(
        "StorageVirtualMachineId" -> StorageVirtualMachineId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStorageVirtualMachineRequest]
    }
  }

  @js.native
  trait DeleteStorageVirtualMachineResponse extends js.Object {
    var Lifecycle: js.UndefOr[StorageVirtualMachineLifecycle]
    var StorageVirtualMachineId: js.UndefOr[StorageVirtualMachineId]
  }

  object DeleteStorageVirtualMachineResponse {
    @inline
    def apply(
        Lifecycle: js.UndefOr[StorageVirtualMachineLifecycle] = js.undefined,
        StorageVirtualMachineId: js.UndefOr[StorageVirtualMachineId] = js.undefined
    ): DeleteStorageVirtualMachineResponse = {
      val __obj = js.Dynamic.literal()
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      StorageVirtualMachineId.foreach(__v => __obj.updateDynamic("StorageVirtualMachineId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStorageVirtualMachineResponse]
    }
  }

  /** Use to specify skipping a final backup, or to add tags to a final backup.
    */
  @js.native
  trait DeleteVolumeOntapConfiguration extends js.Object {
    var FinalBackupTags: js.UndefOr[Tags]
    var SkipFinalBackup: js.UndefOr[Flag]
  }

  object DeleteVolumeOntapConfiguration {
    @inline
    def apply(
        FinalBackupTags: js.UndefOr[Tags] = js.undefined,
        SkipFinalBackup: js.UndefOr[Flag] = js.undefined
    ): DeleteVolumeOntapConfiguration = {
      val __obj = js.Dynamic.literal()
      FinalBackupTags.foreach(__v => __obj.updateDynamic("FinalBackupTags")(__v.asInstanceOf[js.Any]))
      SkipFinalBackup.foreach(__v => __obj.updateDynamic("SkipFinalBackup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVolumeOntapConfiguration]
    }
  }

  /** The response object for the Amazon FSx for NetApp ONTAP volume being deleted in the <code>DeleteVolume</code> operation.
    */
  @js.native
  trait DeleteVolumeOntapResponse extends js.Object {
    var FinalBackupId: js.UndefOr[BackupId]
    var FinalBackupTags: js.UndefOr[Tags]
  }

  object DeleteVolumeOntapResponse {
    @inline
    def apply(
        FinalBackupId: js.UndefOr[BackupId] = js.undefined,
        FinalBackupTags: js.UndefOr[Tags] = js.undefined
    ): DeleteVolumeOntapResponse = {
      val __obj = js.Dynamic.literal()
      FinalBackupId.foreach(__v => __obj.updateDynamic("FinalBackupId")(__v.asInstanceOf[js.Any]))
      FinalBackupTags.foreach(__v => __obj.updateDynamic("FinalBackupTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVolumeOntapResponse]
    }
  }

  /** A value that specifies whether to delete all child volumes and snapshots.
    */
  @js.native
  trait DeleteVolumeOpenZFSConfiguration extends js.Object {
    var Options: js.UndefOr[DeleteOpenZFSVolumeOptions]
  }

  object DeleteVolumeOpenZFSConfiguration {
    @inline
    def apply(
        Options: js.UndefOr[DeleteOpenZFSVolumeOptions] = js.undefined
    ): DeleteVolumeOpenZFSConfiguration = {
      val __obj = js.Dynamic.literal()
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVolumeOpenZFSConfiguration]
    }
  }

  @js.native
  trait DeleteVolumeRequest extends js.Object {
    var VolumeId: VolumeId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var OntapConfiguration: js.UndefOr[DeleteVolumeOntapConfiguration]
    var OpenZFSConfiguration: js.UndefOr[DeleteVolumeOpenZFSConfiguration]
  }

  object DeleteVolumeRequest {
    @inline
    def apply(
        VolumeId: VolumeId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        OntapConfiguration: js.UndefOr[DeleteVolumeOntapConfiguration] = js.undefined,
        OpenZFSConfiguration: js.UndefOr[DeleteVolumeOpenZFSConfiguration] = js.undefined
    ): DeleteVolumeRequest = {
      val __obj = js.Dynamic.literal(
        "VolumeId" -> VolumeId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      OntapConfiguration.foreach(__v => __obj.updateDynamic("OntapConfiguration")(__v.asInstanceOf[js.Any]))
      OpenZFSConfiguration.foreach(__v => __obj.updateDynamic("OpenZFSConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVolumeRequest]
    }
  }

  @js.native
  trait DeleteVolumeResponse extends js.Object {
    var Lifecycle: js.UndefOr[VolumeLifecycle]
    var OntapResponse: js.UndefOr[DeleteVolumeOntapResponse]
    var VolumeId: js.UndefOr[VolumeId]
  }

  object DeleteVolumeResponse {
    @inline
    def apply(
        Lifecycle: js.UndefOr[VolumeLifecycle] = js.undefined,
        OntapResponse: js.UndefOr[DeleteVolumeOntapResponse] = js.undefined,
        VolumeId: js.UndefOr[VolumeId] = js.undefined
    ): DeleteVolumeResponse = {
      val __obj = js.Dynamic.literal()
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      OntapResponse.foreach(__v => __obj.updateDynamic("OntapResponse")(__v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.updateDynamic("VolumeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVolumeResponse]
    }
  }

  /** The request object for the <code>DescribeBackups</code> operation.
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

  /** Response object for the <code>DescribeBackups</code> operation.
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
  trait DescribeDataRepositoryAssociationsRequest extends js.Object {
    var AssociationIds: js.UndefOr[DataRepositoryAssociationIds]
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[LimitedMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDataRepositoryAssociationsRequest {
    @inline
    def apply(
        AssociationIds: js.UndefOr[DataRepositoryAssociationIds] = js.undefined,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[LimitedMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDataRepositoryAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      AssociationIds.foreach(__v => __obj.updateDynamic("AssociationIds")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataRepositoryAssociationsRequest]
    }
  }

  @js.native
  trait DescribeDataRepositoryAssociationsResponse extends js.Object {
    var Associations: js.UndefOr[DataRepositoryAssociations]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDataRepositoryAssociationsResponse {
    @inline
    def apply(
        Associations: js.UndefOr[DataRepositoryAssociations] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDataRepositoryAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      Associations.foreach(__v => __obj.updateDynamic("Associations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataRepositoryAssociationsResponse]
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

  @js.native
  trait DescribeSnapshotsRequest extends js.Object {
    var Filters: js.UndefOr[SnapshotFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SnapshotIds: js.UndefOr[SnapshotIds]
  }

  object DescribeSnapshotsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[SnapshotFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SnapshotIds: js.UndefOr[SnapshotIds] = js.undefined
    ): DescribeSnapshotsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SnapshotIds.foreach(__v => __obj.updateDynamic("SnapshotIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotsRequest]
    }
  }

  @js.native
  trait DescribeSnapshotsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Snapshots: js.UndefOr[Snapshots]
  }

  object DescribeSnapshotsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Snapshots: js.UndefOr[Snapshots] = js.undefined
    ): DescribeSnapshotsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Snapshots.foreach(__v => __obj.updateDynamic("Snapshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotsResponse]
    }
  }

  @js.native
  trait DescribeStorageVirtualMachinesRequest extends js.Object {
    var Filters: js.UndefOr[StorageVirtualMachineFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StorageVirtualMachineIds: js.UndefOr[StorageVirtualMachineIds]
  }

  object DescribeStorageVirtualMachinesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[StorageVirtualMachineFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StorageVirtualMachineIds: js.UndefOr[StorageVirtualMachineIds] = js.undefined
    ): DescribeStorageVirtualMachinesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StorageVirtualMachineIds.foreach(__v => __obj.updateDynamic("StorageVirtualMachineIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStorageVirtualMachinesRequest]
    }
  }

  @js.native
  trait DescribeStorageVirtualMachinesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StorageVirtualMachines: js.UndefOr[StorageVirtualMachines]
  }

  object DescribeStorageVirtualMachinesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StorageVirtualMachines: js.UndefOr[StorageVirtualMachines] = js.undefined
    ): DescribeStorageVirtualMachinesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StorageVirtualMachines.foreach(__v => __obj.updateDynamic("StorageVirtualMachines")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStorageVirtualMachinesResponse]
    }
  }

  @js.native
  trait DescribeVolumesRequest extends js.Object {
    var Filters: js.UndefOr[VolumeFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var VolumeIds: js.UndefOr[VolumeIds]
  }

  object DescribeVolumesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[VolumeFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        VolumeIds: js.UndefOr[VolumeIds] = js.undefined
    ): DescribeVolumesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VolumeIds.foreach(__v => __obj.updateDynamic("VolumeIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVolumesRequest]
    }
  }

  @js.native
  trait DescribeVolumesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Volumes: js.UndefOr[Volumes]
  }

  object DescribeVolumesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Volumes: js.UndefOr[Volumes] = js.undefined
    ): DescribeVolumesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Volumes.foreach(__v => __obj.updateDynamic("Volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVolumesResponse]
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

  /** The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS file system. The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The configuration consists of the total number of provisioned SSD IOPS and how the amount was provisioned (by the customer or by the system).
    */
  @js.native
  trait DiskIopsConfiguration extends js.Object {
    var Iops: js.UndefOr[Iops]
    var Mode: js.UndefOr[DiskIopsConfigurationMode]
  }

  object DiskIopsConfiguration {
    @inline
    def apply(
        Iops: js.UndefOr[Iops] = js.undefined,
        Mode: js.UndefOr[DiskIopsConfigurationMode] = js.undefined
    ): DiskIopsConfiguration = {
      val __obj = js.Dynamic.literal()
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiskIopsConfiguration]
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
    var FileSystemTypeVersion: js.UndefOr[FileSystemTypeVersion]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var Lifecycle: js.UndefOr[FileSystemLifecycle]
    var LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration]
    var NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIds]
    var OntapConfiguration: js.UndefOr[OntapFileSystemConfiguration]
    var OpenZFSConfiguration: js.UndefOr[OpenZFSFileSystemConfiguration]
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
        FileSystemTypeVersion: js.UndefOr[FileSystemTypeVersion] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        Lifecycle: js.UndefOr[FileSystemLifecycle] = js.undefined,
        LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration] = js.undefined,
        NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIds] = js.undefined,
        OntapConfiguration: js.UndefOr[OntapFileSystemConfiguration] = js.undefined,
        OpenZFSConfiguration: js.UndefOr[OpenZFSFileSystemConfiguration] = js.undefined,
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
      FileSystemTypeVersion.foreach(__v => __obj.updateDynamic("FileSystemTypeVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceIds.foreach(__v => __obj.updateDynamic("NetworkInterfaceIds")(__v.asInstanceOf[js.Any]))
      OntapConfiguration.foreach(__v => __obj.updateDynamic("OntapConfiguration")(__v.asInstanceOf[js.Any]))
      OpenZFSConfiguration.foreach(__v => __obj.updateDynamic("OpenZFSConfiguration")(__v.asInstanceOf[js.Any]))
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

  /** An Amazon FSx for NetApp ONTAP file system has two endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. They are the <code>Management</code> and <code>Intercluster</code> endpoints.
    */
  @js.native
  trait FileSystemEndpoint extends js.Object {
    var DNSName: js.UndefOr[DNSName]
    var IpAddresses: js.UndefOr[OntapEndpointIpAddresses]
  }

  object FileSystemEndpoint {
    @inline
    def apply(
        DNSName: js.UndefOr[DNSName] = js.undefined,
        IpAddresses: js.UndefOr[OntapEndpointIpAddresses] = js.undefined
    ): FileSystemEndpoint = {
      val __obj = js.Dynamic.literal()
      DNSName.foreach(__v => __obj.updateDynamic("DNSName")(__v.asInstanceOf[js.Any]))
      IpAddresses.foreach(__v => __obj.updateDynamic("IpAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystemEndpoint]
    }
  }

  /** An Amazon FSx for NetApp ONTAP file system has the following endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
    */
  @js.native
  trait FileSystemEndpoints extends js.Object {
    var Intercluster: js.UndefOr[FileSystemEndpoint]
    var Management: js.UndefOr[FileSystemEndpoint]
  }

  object FileSystemEndpoints {
    @inline
    def apply(
        Intercluster: js.UndefOr[FileSystemEndpoint] = js.undefined,
        Management: js.UndefOr[FileSystemEndpoint] = js.undefined
    ): FileSystemEndpoints = {
      val __obj = js.Dynamic.literal()
      Intercluster.foreach(__v => __obj.updateDynamic("Intercluster")(__v.asInstanceOf[js.Any]))
      Management.foreach(__v => __obj.updateDynamic("Management")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSystemEndpoints]
    }
  }

  /** A structure providing details of any failures that occurred when creating a file system.
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

  /** Describes why a resource lifecycle state changed.
    */
  @js.native
  trait LifecycleTransitionReason extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
  }

  object LifecycleTransitionReason {
    @inline
    def apply(
        Message: js.UndefOr[ErrorMessage] = js.undefined
    ): LifecycleTransitionReason = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecycleTransitionReason]
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
    var DataCompressionType: js.UndefOr[DataCompressionType]
    var DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration]
    var DeploymentType: js.UndefOr[LustreDeploymentType]
    var DriveCacheType: js.UndefOr[DriveCacheType]
    var LogConfiguration: js.UndefOr[LustreLogConfiguration]
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
        DataCompressionType: js.UndefOr[DataCompressionType] = js.undefined,
        DataRepositoryConfiguration: js.UndefOr[DataRepositoryConfiguration] = js.undefined,
        DeploymentType: js.UndefOr[LustreDeploymentType] = js.undefined,
        DriveCacheType: js.UndefOr[DriveCacheType] = js.undefined,
        LogConfiguration: js.UndefOr[LustreLogConfiguration] = js.undefined,
        MountName: js.UndefOr[LustreFileSystemMountName] = js.undefined,
        PerUnitStorageThroughput: js.UndefOr[PerUnitStorageThroughput] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): LustreFileSystemConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DataCompressionType.foreach(__v => __obj.updateDynamic("DataCompressionType")(__v.asInstanceOf[js.Any]))
      DataRepositoryConfiguration.foreach(__v => __obj.updateDynamic("DataRepositoryConfiguration")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      DriveCacheType.foreach(__v => __obj.updateDynamic("DriveCacheType")(__v.asInstanceOf[js.Any]))
      LogConfiguration.foreach(__v => __obj.updateDynamic("LogConfiguration")(__v.asInstanceOf[js.Any]))
      MountName.foreach(__v => __obj.updateDynamic("MountName")(__v.asInstanceOf[js.Any]))
      PerUnitStorageThroughput.foreach(__v => __obj.updateDynamic("PerUnitStorageThroughput")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LustreFileSystemConfiguration]
    }
  }

  /** The configuration for Lustre logging used to write the enabled logging events for your file system to Amazon CloudWatch Logs. When logging is enabled, Lustre logs error and warning events from data repository operations such as automatic export and data repository tasks. To learn more about Lustre logging, see [[https://docs.aws.amazon.com/fsx/latest/LustreGuide/cw-event-logging.html|Logging with Amazon CloudWatch Logs]].
    */
  @js.native
  trait LustreLogConfiguration extends js.Object {
    var Level: LustreAccessAuditLogLevel
    var Destination: js.UndefOr[GeneralARN]
  }

  object LustreLogConfiguration {
    @inline
    def apply(
        Level: LustreAccessAuditLogLevel,
        Destination: js.UndefOr[GeneralARN] = js.undefined
    ): LustreLogConfiguration = {
      val __obj = js.Dynamic.literal(
        "Level" -> Level.asInstanceOf[js.Any]
      )

      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LustreLogConfiguration]
    }
  }

  /** The Lustre logging configuration used when creating or updating an Amazon FSx for Lustre file system. Lustre logging writes the enabled logging events for your file system to Amazon CloudWatch Logs. Error and warning events can be logged from the following data repository operations: * Automatic export * Data repository tasks To learn more about Lustre logging, see [[https://docs.aws.amazon.com/fsx/latest/LustreGuide/cw-event-logging.html|Logging to Amazon CloudWatch Logs]].
    */
  @js.native
  trait LustreLogCreateConfiguration extends js.Object {
    var Level: LustreAccessAuditLogLevel
    var Destination: js.UndefOr[GeneralARN]
  }

  object LustreLogCreateConfiguration {
    @inline
    def apply(
        Level: LustreAccessAuditLogLevel,
        Destination: js.UndefOr[GeneralARN] = js.undefined
    ): LustreLogCreateConfiguration = {
      val __obj = js.Dynamic.literal(
        "Level" -> Level.asInstanceOf[js.Any]
      )

      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LustreLogCreateConfiguration]
    }
  }

  /** Configuration for the FSx for NetApp ONTAP file system.
    */
  @js.native
  trait OntapFileSystemConfiguration extends js.Object {
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DeploymentType: js.UndefOr[OntapDeploymentType]
    var DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration]
    var EndpointIpAddressRange: js.UndefOr[IpAddressRange]
    var Endpoints: js.UndefOr[FileSystemEndpoints]
    var PreferredSubnetId: js.UndefOr[SubnetId]
    var RouteTableIds: js.UndefOr[RouteTableIds]
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object OntapFileSystemConfiguration {
    @inline
    def apply(
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DeploymentType: js.UndefOr[OntapDeploymentType] = js.undefined,
        DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration] = js.undefined,
        EndpointIpAddressRange: js.UndefOr[IpAddressRange] = js.undefined,
        Endpoints: js.UndefOr[FileSystemEndpoints] = js.undefined,
        PreferredSubnetId: js.UndefOr[SubnetId] = js.undefined,
        RouteTableIds: js.UndefOr[RouteTableIds] = js.undefined,
        ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): OntapFileSystemConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      DiskIopsConfiguration.foreach(__v => __obj.updateDynamic("DiskIopsConfiguration")(__v.asInstanceOf[js.Any]))
      EndpointIpAddressRange.foreach(__v => __obj.updateDynamic("EndpointIpAddressRange")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      PreferredSubnetId.foreach(__v => __obj.updateDynamic("PreferredSubnetId")(__v.asInstanceOf[js.Any]))
      RouteTableIds.foreach(__v => __obj.updateDynamic("RouteTableIds")(__v.asInstanceOf[js.Any]))
      ThroughputCapacity.foreach(__v => __obj.updateDynamic("ThroughputCapacity")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OntapFileSystemConfiguration]
    }
  }

  /** The configuration of an Amazon FSx for NetApp ONTAP volume.
    */
  @js.native
  trait OntapVolumeConfiguration extends js.Object {
    var FlexCacheEndpointType: js.UndefOr[FlexCacheEndpointType]
    var JunctionPath: js.UndefOr[JunctionPath]
    var OntapVolumeType: js.UndefOr[OntapVolumeType]
    var SecurityStyle: js.UndefOr[SecurityStyle]
    var SizeInMegabytes: js.UndefOr[VolumeCapacity]
    var StorageEfficiencyEnabled: js.UndefOr[Flag]
    var StorageVirtualMachineId: js.UndefOr[StorageVirtualMachineId]
    var StorageVirtualMachineRoot: js.UndefOr[Flag]
    var TieringPolicy: js.UndefOr[TieringPolicy]
    var UUID: js.UndefOr[UUID]
  }

  object OntapVolumeConfiguration {
    @inline
    def apply(
        FlexCacheEndpointType: js.UndefOr[FlexCacheEndpointType] = js.undefined,
        JunctionPath: js.UndefOr[JunctionPath] = js.undefined,
        OntapVolumeType: js.UndefOr[OntapVolumeType] = js.undefined,
        SecurityStyle: js.UndefOr[SecurityStyle] = js.undefined,
        SizeInMegabytes: js.UndefOr[VolumeCapacity] = js.undefined,
        StorageEfficiencyEnabled: js.UndefOr[Flag] = js.undefined,
        StorageVirtualMachineId: js.UndefOr[StorageVirtualMachineId] = js.undefined,
        StorageVirtualMachineRoot: js.UndefOr[Flag] = js.undefined,
        TieringPolicy: js.UndefOr[TieringPolicy] = js.undefined,
        UUID: js.UndefOr[UUID] = js.undefined
    ): OntapVolumeConfiguration = {
      val __obj = js.Dynamic.literal()
      FlexCacheEndpointType.foreach(__v => __obj.updateDynamic("FlexCacheEndpointType")(__v.asInstanceOf[js.Any]))
      JunctionPath.foreach(__v => __obj.updateDynamic("JunctionPath")(__v.asInstanceOf[js.Any]))
      OntapVolumeType.foreach(__v => __obj.updateDynamic("OntapVolumeType")(__v.asInstanceOf[js.Any]))
      SecurityStyle.foreach(__v => __obj.updateDynamic("SecurityStyle")(__v.asInstanceOf[js.Any]))
      SizeInMegabytes.foreach(__v => __obj.updateDynamic("SizeInMegabytes")(__v.asInstanceOf[js.Any]))
      StorageEfficiencyEnabled.foreach(__v => __obj.updateDynamic("StorageEfficiencyEnabled")(__v.asInstanceOf[js.Any]))
      StorageVirtualMachineId.foreach(__v => __obj.updateDynamic("StorageVirtualMachineId")(__v.asInstanceOf[js.Any]))
      StorageVirtualMachineRoot.foreach(__v => __obj.updateDynamic("StorageVirtualMachineRoot")(__v.asInstanceOf[js.Any]))
      TieringPolicy.foreach(__v => __obj.updateDynamic("TieringPolicy")(__v.asInstanceOf[js.Any]))
      UUID.foreach(__v => __obj.updateDynamic("UUID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OntapVolumeConfiguration]
    }
  }

  /** Specifies who can mount the file system and the options that can be used while mounting the file system.
    */
  @js.native
  trait OpenZFSClientConfiguration extends js.Object {
    var Clients: OpenZFSClients
    var Options: OpenZFSNfsExportOptions
  }

  object OpenZFSClientConfiguration {
    @inline
    def apply(
        Clients: OpenZFSClients,
        Options: OpenZFSNfsExportOptions
    ): OpenZFSClientConfiguration = {
      val __obj = js.Dynamic.literal(
        "Clients" -> Clients.asInstanceOf[js.Any],
        "Options" -> Options.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpenZFSClientConfiguration]
    }
  }

  /** The configuration of an Amazon FSx for OpenZFS root volume.
    */
  @js.native
  trait OpenZFSCreateRootVolumeConfiguration extends js.Object {
    var CopyTagsToSnapshots: js.UndefOr[Flag]
    var DataCompressionType: js.UndefOr[OpenZFSDataCompressionType]
    var NfsExports: js.UndefOr[OpenZFSNfsExports]
    var ReadOnly: js.UndefOr[ReadOnly]
    var UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas]
  }

  object OpenZFSCreateRootVolumeConfiguration {
    @inline
    def apply(
        CopyTagsToSnapshots: js.UndefOr[Flag] = js.undefined,
        DataCompressionType: js.UndefOr[OpenZFSDataCompressionType] = js.undefined,
        NfsExports: js.UndefOr[OpenZFSNfsExports] = js.undefined,
        ReadOnly: js.UndefOr[ReadOnly] = js.undefined,
        UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas] = js.undefined
    ): OpenZFSCreateRootVolumeConfiguration = {
      val __obj = js.Dynamic.literal()
      CopyTagsToSnapshots.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshots")(__v.asInstanceOf[js.Any]))
      DataCompressionType.foreach(__v => __obj.updateDynamic("DataCompressionType")(__v.asInstanceOf[js.Any]))
      NfsExports.foreach(__v => __obj.updateDynamic("NfsExports")(__v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.updateDynamic("ReadOnly")(__v.asInstanceOf[js.Any]))
      UserAndGroupQuotas.foreach(__v => __obj.updateDynamic("UserAndGroupQuotas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenZFSCreateRootVolumeConfiguration]
    }
  }

  /** The configuration for the Amazon FSx for OpenZFS file system.
    */
  @js.native
  trait OpenZFSFileSystemConfiguration extends js.Object {
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var CopyTagsToVolumes: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DeploymentType: js.UndefOr[OpenZFSDeploymentType]
    var DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration]
    var RootVolumeId: js.UndefOr[VolumeId]
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object OpenZFSFileSystemConfiguration {
    @inline
    def apply(
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
        CopyTagsToVolumes: js.UndefOr[Flag] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DeploymentType: js.UndefOr[OpenZFSDeploymentType] = js.undefined,
        DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration] = js.undefined,
        RootVolumeId: js.UndefOr[VolumeId] = js.undefined,
        ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): OpenZFSFileSystemConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      CopyTagsToVolumes.foreach(__v => __obj.updateDynamic("CopyTagsToVolumes")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      DiskIopsConfiguration.foreach(__v => __obj.updateDynamic("DiskIopsConfiguration")(__v.asInstanceOf[js.Any]))
      RootVolumeId.foreach(__v => __obj.updateDynamic("RootVolumeId")(__v.asInstanceOf[js.Any]))
      ThroughputCapacity.foreach(__v => __obj.updateDynamic("ThroughputCapacity")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenZFSFileSystemConfiguration]
    }
  }

  /** The Network File System NFS) configurations for mounting an Amazon FSx for OpenZFS file system.
    */
  @js.native
  trait OpenZFSNfsExport extends js.Object {
    var ClientConfigurations: OpenZFSClientConfigurations
  }

  object OpenZFSNfsExport {
    @inline
    def apply(
        ClientConfigurations: OpenZFSClientConfigurations
    ): OpenZFSNfsExport = {
      val __obj = js.Dynamic.literal(
        "ClientConfigurations" -> ClientConfigurations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpenZFSNfsExport]
    }
  }

  /** The snapshot configuration to use when creating an OpenZFS volume from a snapshot.
    */
  @js.native
  trait OpenZFSOriginSnapshotConfiguration extends js.Object {
    var CopyStrategy: js.UndefOr[OpenZFSCopyStrategy]
    var SnapshotARN: js.UndefOr[ResourceARN]
  }

  object OpenZFSOriginSnapshotConfiguration {
    @inline
    def apply(
        CopyStrategy: js.UndefOr[OpenZFSCopyStrategy] = js.undefined,
        SnapshotARN: js.UndefOr[ResourceARN] = js.undefined
    ): OpenZFSOriginSnapshotConfiguration = {
      val __obj = js.Dynamic.literal()
      CopyStrategy.foreach(__v => __obj.updateDynamic("CopyStrategy")(__v.asInstanceOf[js.Any]))
      SnapshotARN.foreach(__v => __obj.updateDynamic("SnapshotARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenZFSOriginSnapshotConfiguration]
    }
  }

  /** The configuration for how much storage a user or group can use on the volume.
    */
  @js.native
  trait OpenZFSUserOrGroupQuota extends js.Object {
    var Id: IntegerNoMax
    var StorageCapacityQuotaGiB: IntegerNoMax
    var Type: OpenZFSQuotaType
  }

  object OpenZFSUserOrGroupQuota {
    @inline
    def apply(
        Id: IntegerNoMax,
        StorageCapacityQuotaGiB: IntegerNoMax,
        Type: OpenZFSQuotaType
    ): OpenZFSUserOrGroupQuota = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "StorageCapacityQuotaGiB" -> StorageCapacityQuotaGiB.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OpenZFSUserOrGroupQuota]
    }
  }

  /** The configuration of an Amazon FSx for OpenZFS volume.
    */
  @js.native
  trait OpenZFSVolumeConfiguration extends js.Object {
    var CopyTagsToSnapshots: js.UndefOr[Flag]
    var DataCompressionType: js.UndefOr[OpenZFSDataCompressionType]
    var NfsExports: js.UndefOr[OpenZFSNfsExports]
    var OriginSnapshot: js.UndefOr[OpenZFSOriginSnapshotConfiguration]
    var ParentVolumeId: js.UndefOr[VolumeId]
    var ReadOnly: js.UndefOr[ReadOnly]
    var StorageCapacityQuotaGiB: js.UndefOr[IntegerNoMax]
    var StorageCapacityReservationGiB: js.UndefOr[IntegerNoMax]
    var UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas]
    var VolumePath: js.UndefOr[VolumePath]
  }

  object OpenZFSVolumeConfiguration {
    @inline
    def apply(
        CopyTagsToSnapshots: js.UndefOr[Flag] = js.undefined,
        DataCompressionType: js.UndefOr[OpenZFSDataCompressionType] = js.undefined,
        NfsExports: js.UndefOr[OpenZFSNfsExports] = js.undefined,
        OriginSnapshot: js.UndefOr[OpenZFSOriginSnapshotConfiguration] = js.undefined,
        ParentVolumeId: js.UndefOr[VolumeId] = js.undefined,
        ReadOnly: js.UndefOr[ReadOnly] = js.undefined,
        StorageCapacityQuotaGiB: js.UndefOr[IntegerNoMax] = js.undefined,
        StorageCapacityReservationGiB: js.UndefOr[IntegerNoMax] = js.undefined,
        UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas] = js.undefined,
        VolumePath: js.UndefOr[VolumePath] = js.undefined
    ): OpenZFSVolumeConfiguration = {
      val __obj = js.Dynamic.literal()
      CopyTagsToSnapshots.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshots")(__v.asInstanceOf[js.Any]))
      DataCompressionType.foreach(__v => __obj.updateDynamic("DataCompressionType")(__v.asInstanceOf[js.Any]))
      NfsExports.foreach(__v => __obj.updateDynamic("NfsExports")(__v.asInstanceOf[js.Any]))
      OriginSnapshot.foreach(__v => __obj.updateDynamic("OriginSnapshot")(__v.asInstanceOf[js.Any]))
      ParentVolumeId.foreach(__v => __obj.updateDynamic("ParentVolumeId")(__v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.updateDynamic("ReadOnly")(__v.asInstanceOf[js.Any]))
      StorageCapacityQuotaGiB.foreach(__v => __obj.updateDynamic("StorageCapacityQuotaGiB")(__v.asInstanceOf[js.Any]))
      StorageCapacityReservationGiB.foreach(__v => __obj.updateDynamic("StorageCapacityReservationGiB")(__v.asInstanceOf[js.Any]))
      UserAndGroupQuotas.foreach(__v => __obj.updateDynamic("UserAndGroupQuotas")(__v.asInstanceOf[js.Any]))
      VolumePath.foreach(__v => __obj.updateDynamic("VolumePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenZFSVolumeConfiguration]
    }
  }

  @js.native
  trait ReleaseFileSystemNfsV3LocksRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object ReleaseFileSystemNfsV3LocksRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): ReleaseFileSystemNfsV3LocksRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReleaseFileSystemNfsV3LocksRequest]
    }
  }

  @js.native
  trait ReleaseFileSystemNfsV3LocksResponse extends js.Object {
    var FileSystem: js.UndefOr[FileSystem]
  }

  object ReleaseFileSystemNfsV3LocksResponse {
    @inline
    def apply(
        FileSystem: js.UndefOr[FileSystem] = js.undefined
    ): ReleaseFileSystemNfsV3LocksResponse = {
      val __obj = js.Dynamic.literal()
      FileSystem.foreach(__v => __obj.updateDynamic("FileSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReleaseFileSystemNfsV3LocksResponse]
    }
  }

  @js.native
  trait RestoreVolumeFromSnapshotRequest extends js.Object {
    var SnapshotId: SnapshotId
    var VolumeId: VolumeId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Options: js.UndefOr[RestoreOpenZFSVolumeOptions]
  }

  object RestoreVolumeFromSnapshotRequest {
    @inline
    def apply(
        SnapshotId: SnapshotId,
        VolumeId: VolumeId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Options: js.UndefOr[RestoreOpenZFSVolumeOptions] = js.undefined
    ): RestoreVolumeFromSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any],
        "VolumeId" -> VolumeId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreVolumeFromSnapshotRequest]
    }
  }

  @js.native
  trait RestoreVolumeFromSnapshotResponse extends js.Object {
    var Lifecycle: js.UndefOr[VolumeLifecycle]
    var VolumeId: js.UndefOr[VolumeId]
  }

  object RestoreVolumeFromSnapshotResponse {
    @inline
    def apply(
        Lifecycle: js.UndefOr[VolumeLifecycle] = js.undefined,
        VolumeId: js.UndefOr[VolumeId] = js.undefined
    ): RestoreVolumeFromSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.updateDynamic("VolumeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreVolumeFromSnapshotResponse]
    }
  }

  /** The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data repository association. The configuration consists of an <code>AutoImportPolicy</code> that defines file events on the data repository are automatically imported to the file system and an <code>AutoExportPolicy</code> that defines which file events on the file system are automatically exported to the data repository. File events are when files or directories are added, changed, or deleted on the file system or the data repository.
    */
  @js.native
  trait S3DataRepositoryConfiguration extends js.Object {
    var AutoExportPolicy: js.UndefOr[AutoExportPolicy]
    var AutoImportPolicy: js.UndefOr[AutoImportPolicy]
  }

  object S3DataRepositoryConfiguration {
    @inline
    def apply(
        AutoExportPolicy: js.UndefOr[AutoExportPolicy] = js.undefined,
        AutoImportPolicy: js.UndefOr[AutoImportPolicy] = js.undefined
    ): S3DataRepositoryConfiguration = {
      val __obj = js.Dynamic.literal()
      AutoExportPolicy.foreach(__v => __obj.updateDynamic("AutoExportPolicy")(__v.asInstanceOf[js.Any]))
      AutoImportPolicy.foreach(__v => __obj.updateDynamic("AutoImportPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DataRepositoryConfiguration]
    }
  }

  /** The configuration of the self-managed Microsoft Active Directory (AD) directory to which the Windows File Server or ONTAP storage virtual machine (SVM) instance is joined.
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

  /** The configuration that Amazon FSx uses to join a FSx for Windows File Server file system or an ONTAP storage virtual machine (SVM) to a self-managed (including on-premises) Microsoft Active Directory (AD) directory. For more information, see [[https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html| Using Amazon FSx with your self-managed Microsoft Active Directory]] or [[https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html|Managing SVMs]].
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

  /** A snapshot of an Amazon FSx for OpenZFS volume.
    */
  @js.native
  trait Snapshot extends js.Object {
    var AdministrativeActions: js.UndefOr[AdministrativeActions]
    var CreationTime: js.UndefOr[CreationTime]
    var Lifecycle: js.UndefOr[SnapshotLifecycle]
    var Name: js.UndefOr[SnapshotName]
    var ResourceARN: js.UndefOr[ResourceARN]
    var SnapshotId: js.UndefOr[SnapshotId]
    var Tags: js.UndefOr[Tags]
    var VolumeId: js.UndefOr[VolumeId]
  }

  object Snapshot {
    @inline
    def apply(
        AdministrativeActions: js.UndefOr[AdministrativeActions] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        Lifecycle: js.UndefOr[SnapshotLifecycle] = js.undefined,
        Name: js.UndefOr[SnapshotName] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VolumeId: js.UndefOr[VolumeId] = js.undefined
    ): Snapshot = {
      val __obj = js.Dynamic.literal()
      AdministrativeActions.foreach(__v => __obj.updateDynamic("AdministrativeActions")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.updateDynamic("VolumeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Snapshot]
    }
  }

  /** A filter used to restrict the results of <code>DescribeSnapshots</code> calls. You can use multiple filters to return results that meet all applied filter requirements.
    */
  @js.native
  trait SnapshotFilter extends js.Object {
    var Name: js.UndefOr[SnapshotFilterName]
    var Values: js.UndefOr[SnapshotFilterValues]
  }

  object SnapshotFilter {
    @inline
    def apply(
        Name: js.UndefOr[SnapshotFilterName] = js.undefined,
        Values: js.UndefOr[SnapshotFilterValues] = js.undefined
    ): SnapshotFilter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotFilter]
    }
  }

  /** Describes the Amazon FSx for NetApp ONTAP storage virtual machine (SVM) configuraton.
    */
  @js.native
  trait StorageVirtualMachine extends js.Object {
    var ActiveDirectoryConfiguration: js.UndefOr[SvmActiveDirectoryConfiguration]
    var CreationTime: js.UndefOr[CreationTime]
    var Endpoints: js.UndefOr[SvmEndpoints]
    var FileSystemId: js.UndefOr[FileSystemId]
    var Lifecycle: js.UndefOr[StorageVirtualMachineLifecycle]
    var LifecycleTransitionReason: js.UndefOr[LifecycleTransitionReason]
    var Name: js.UndefOr[StorageVirtualMachineName]
    var ResourceARN: js.UndefOr[ResourceARN]
    var RootVolumeSecurityStyle: js.UndefOr[StorageVirtualMachineRootVolumeSecurityStyle]
    var StorageVirtualMachineId: js.UndefOr[StorageVirtualMachineId]
    var Subtype: js.UndefOr[StorageVirtualMachineSubtype]
    var Tags: js.UndefOr[Tags]
    var UUID: js.UndefOr[UUID]
  }

  object StorageVirtualMachine {
    @inline
    def apply(
        ActiveDirectoryConfiguration: js.UndefOr[SvmActiveDirectoryConfiguration] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        Endpoints: js.UndefOr[SvmEndpoints] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Lifecycle: js.UndefOr[StorageVirtualMachineLifecycle] = js.undefined,
        LifecycleTransitionReason: js.UndefOr[LifecycleTransitionReason] = js.undefined,
        Name: js.UndefOr[StorageVirtualMachineName] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        RootVolumeSecurityStyle: js.UndefOr[StorageVirtualMachineRootVolumeSecurityStyle] = js.undefined,
        StorageVirtualMachineId: js.UndefOr[StorageVirtualMachineId] = js.undefined,
        Subtype: js.UndefOr[StorageVirtualMachineSubtype] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UUID: js.UndefOr[UUID] = js.undefined
    ): StorageVirtualMachine = {
      val __obj = js.Dynamic.literal()
      ActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("ActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      LifecycleTransitionReason.foreach(__v => __obj.updateDynamic("LifecycleTransitionReason")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      RootVolumeSecurityStyle.foreach(__v => __obj.updateDynamic("RootVolumeSecurityStyle")(__v.asInstanceOf[js.Any]))
      StorageVirtualMachineId.foreach(__v => __obj.updateDynamic("StorageVirtualMachineId")(__v.asInstanceOf[js.Any]))
      Subtype.foreach(__v => __obj.updateDynamic("Subtype")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UUID.foreach(__v => __obj.updateDynamic("UUID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageVirtualMachine]
    }
  }

  /** A filter used to restrict the results of describe calls for Amazon FSx for NetApp ONTAP storage virtual machines (SVMs). You can use multiple filters to return results that meet all applied filter requirements.
    */
  @js.native
  trait StorageVirtualMachineFilter extends js.Object {
    var Name: js.UndefOr[StorageVirtualMachineFilterName]
    var Values: js.UndefOr[StorageVirtualMachineFilterValues]
  }

  object StorageVirtualMachineFilter {
    @inline
    def apply(
        Name: js.UndefOr[StorageVirtualMachineFilterName] = js.undefined,
        Values: js.UndefOr[StorageVirtualMachineFilterValues] = js.undefined
    ): StorageVirtualMachineFilter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageVirtualMachineFilter]
    }
  }

  /** Describes the configuration of the Microsoft Active Directory (AD) directory to which the Amazon FSx for ONTAP storage virtual machine (SVM) is joined. Pleae note, account credentials are not returned in the response payload.
    */
  @js.native
  trait SvmActiveDirectoryConfiguration extends js.Object {
    var NetBiosName: js.UndefOr[NetBiosAlias]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes]
  }

  object SvmActiveDirectoryConfiguration {
    @inline
    def apply(
        NetBiosName: js.UndefOr[NetBiosAlias] = js.undefined,
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes] = js.undefined
    ): SvmActiveDirectoryConfiguration = {
      val __obj = js.Dynamic.literal()
      NetBiosName.foreach(__v => __obj.updateDynamic("NetBiosName")(__v.asInstanceOf[js.Any]))
      SelfManagedActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SvmActiveDirectoryConfiguration]
    }
  }

  /** An Amazon FSx for NetApp ONTAP storage virtual machine (SVM) has four endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or NetApp CloudManager. They are the <code>Iscsi</code>, <code>Management</code>, <code>Nfs</code>, and <code>Smb</code> endpoints.
    */
  @js.native
  trait SvmEndpoint extends js.Object {
    var DNSName: js.UndefOr[DNSName]
    var IpAddresses: js.UndefOr[OntapEndpointIpAddresses]
  }

  object SvmEndpoint {
    @inline
    def apply(
        DNSName: js.UndefOr[DNSName] = js.undefined,
        IpAddresses: js.UndefOr[OntapEndpointIpAddresses] = js.undefined
    ): SvmEndpoint = {
      val __obj = js.Dynamic.literal()
      DNSName.foreach(__v => __obj.updateDynamic("DNSName")(__v.asInstanceOf[js.Any]))
      IpAddresses.foreach(__v => __obj.updateDynamic("IpAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SvmEndpoint]
    }
  }

  /** An Amazon FSx for NetApp ONTAP storage virtual machine (SVM) has the following endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or NetApp CloudManager.
    */
  @js.native
  trait SvmEndpoints extends js.Object {
    var Iscsi: js.UndefOr[SvmEndpoint]
    var Management: js.UndefOr[SvmEndpoint]
    var Nfs: js.UndefOr[SvmEndpoint]
    var Smb: js.UndefOr[SvmEndpoint]
  }

  object SvmEndpoints {
    @inline
    def apply(
        Iscsi: js.UndefOr[SvmEndpoint] = js.undefined,
        Management: js.UndefOr[SvmEndpoint] = js.undefined,
        Nfs: js.UndefOr[SvmEndpoint] = js.undefined,
        Smb: js.UndefOr[SvmEndpoint] = js.undefined
    ): SvmEndpoints = {
      val __obj = js.Dynamic.literal()
      Iscsi.foreach(__v => __obj.updateDynamic("Iscsi")(__v.asInstanceOf[js.Any]))
      Management.foreach(__v => __obj.updateDynamic("Management")(__v.asInstanceOf[js.Any]))
      Nfs.foreach(__v => __obj.updateDynamic("Nfs")(__v.asInstanceOf[js.Any]))
      Smb.foreach(__v => __obj.updateDynamic("Smb")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SvmEndpoints]
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

  /** Describes the data tiering policy for an ONTAP volume. When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a volume's data between the file system's primary storage and capacity pool storage based on your access patterns.
    */
  @js.native
  trait TieringPolicy extends js.Object {
    var CoolingPeriod: js.UndefOr[CoolingPeriod]
    var Name: js.UndefOr[TieringPolicyName]
  }

  object TieringPolicy {
    @inline
    def apply(
        CoolingPeriod: js.UndefOr[CoolingPeriod] = js.undefined,
        Name: js.UndefOr[TieringPolicyName] = js.undefined
    ): TieringPolicy = {
      val __obj = js.Dynamic.literal()
      CoolingPeriod.foreach(__v => __obj.updateDynamic("CoolingPeriod")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TieringPolicy]
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

  @js.native
  trait UpdateDataRepositoryAssociationRequest extends js.Object {
    var AssociationId: DataRepositoryAssociationId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var ImportedFileChunkSize: js.UndefOr[Megabytes]
    var S3: js.UndefOr[S3DataRepositoryConfiguration]
  }

  object UpdateDataRepositoryAssociationRequest {
    @inline
    def apply(
        AssociationId: DataRepositoryAssociationId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined,
        S3: js.UndefOr[S3DataRepositoryConfiguration] = js.undefined
    ): UpdateDataRepositoryAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationId" -> AssociationId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      ImportedFileChunkSize.foreach(__v => __obj.updateDynamic("ImportedFileChunkSize")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataRepositoryAssociationRequest]
    }
  }

  @js.native
  trait UpdateDataRepositoryAssociationResponse extends js.Object {
    var Association: js.UndefOr[DataRepositoryAssociation]
  }

  object UpdateDataRepositoryAssociationResponse {
    @inline
    def apply(
        Association: js.UndefOr[DataRepositoryAssociation] = js.undefined
    ): UpdateDataRepositoryAssociationResponse = {
      val __obj = js.Dynamic.literal()
      Association.foreach(__v => __obj.updateDynamic("Association")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataRepositoryAssociationResponse]
    }
  }

  /** The configuration object for Amazon FSx for Lustre file systems used in the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  trait UpdateFileSystemLustreConfiguration extends js.Object {
    var AutoImportPolicy: js.UndefOr[AutoImportPolicyType]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DataCompressionType: js.UndefOr[DataCompressionType]
    var LogConfiguration: js.UndefOr[LustreLogCreateConfiguration]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object UpdateFileSystemLustreConfiguration {
    @inline
    def apply(
        AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.undefined,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DataCompressionType: js.UndefOr[DataCompressionType] = js.undefined,
        LogConfiguration: js.UndefOr[LustreLogCreateConfiguration] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): UpdateFileSystemLustreConfiguration = {
      val __obj = js.Dynamic.literal()
      AutoImportPolicy.foreach(__v => __obj.updateDynamic("AutoImportPolicy")(__v.asInstanceOf[js.Any]))
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DataCompressionType.foreach(__v => __obj.updateDynamic("DataCompressionType")(__v.asInstanceOf[js.Any]))
      LogConfiguration.foreach(__v => __obj.updateDynamic("LogConfiguration")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemLustreConfiguration]
    }
  }

  /** The configuration updates for an Amazon FSx for NetApp ONTAP file system.
    */
  @js.native
  trait UpdateFileSystemOntapConfiguration extends js.Object {
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var FsxAdminPassword: js.UndefOr[AdminPassword]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object UpdateFileSystemOntapConfiguration {
    @inline
    def apply(
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        FsxAdminPassword: js.UndefOr[AdminPassword] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): UpdateFileSystemOntapConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      FsxAdminPassword.foreach(__v => __obj.updateDynamic("FsxAdminPassword")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemOntapConfiguration]
    }
  }

  /** The configuration updates for an Amazon FSx for OpenZFS file system.
    */
  @js.native
  trait UpdateFileSystemOpenZFSConfiguration extends js.Object {
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var CopyTagsToBackups: js.UndefOr[Flag]
    var CopyTagsToVolumes: js.UndefOr[Flag]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration]
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object UpdateFileSystemOpenZFSConfiguration {
    @inline
    def apply(
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        CopyTagsToBackups: js.UndefOr[Flag] = js.undefined,
        CopyTagsToVolumes: js.UndefOr[Flag] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        DiskIopsConfiguration: js.UndefOr[DiskIopsConfiguration] = js.undefined,
        ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): UpdateFileSystemOpenZFSConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      CopyTagsToBackups.foreach(__v => __obj.updateDynamic("CopyTagsToBackups")(__v.asInstanceOf[js.Any]))
      CopyTagsToVolumes.foreach(__v => __obj.updateDynamic("CopyTagsToVolumes")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      DiskIopsConfiguration.foreach(__v => __obj.updateDynamic("DiskIopsConfiguration")(__v.asInstanceOf[js.Any]))
      ThroughputCapacity.foreach(__v => __obj.updateDynamic("ThroughputCapacity")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemOpenZFSConfiguration]
    }
  }

  /** The request object for the <code>UpdateFileSystem</code> operation.
    */
  @js.native
  trait UpdateFileSystemRequest extends js.Object {
    var FileSystemId: FileSystemId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration]
    var OntapConfiguration: js.UndefOr[UpdateFileSystemOntapConfiguration]
    var OpenZFSConfiguration: js.UndefOr[UpdateFileSystemOpenZFSConfiguration]
    var StorageCapacity: js.UndefOr[StorageCapacity]
    var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration]
  }

  object UpdateFileSystemRequest {
    @inline
    def apply(
        FileSystemId: FileSystemId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.undefined,
        OntapConfiguration: js.UndefOr[UpdateFileSystemOntapConfiguration] = js.undefined,
        OpenZFSConfiguration: js.UndefOr[UpdateFileSystemOpenZFSConfiguration] = js.undefined,
        StorageCapacity: js.UndefOr[StorageCapacity] = js.undefined,
        WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.undefined
    ): UpdateFileSystemRequest = {
      val __obj = js.Dynamic.literal(
        "FileSystemId" -> FileSystemId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      LustreConfiguration.foreach(__v => __obj.updateDynamic("LustreConfiguration")(__v.asInstanceOf[js.Any]))
      OntapConfiguration.foreach(__v => __obj.updateDynamic("OntapConfiguration")(__v.asInstanceOf[js.Any]))
      OpenZFSConfiguration.foreach(__v => __obj.updateDynamic("OpenZFSConfiguration")(__v.asInstanceOf[js.Any]))
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
    var AuditLogConfiguration: js.UndefOr[WindowsAuditLogCreateConfiguration]
    var AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays]
    var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime]
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates]
    var ThroughputCapacity: js.UndefOr[MegabytesPerSecond]
    var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime]
  }

  object UpdateFileSystemWindowsConfiguration {
    @inline
    def apply(
        AuditLogConfiguration: js.UndefOr[WindowsAuditLogCreateConfiguration] = js.undefined,
        AutomaticBackupRetentionDays: js.UndefOr[AutomaticBackupRetentionDays] = js.undefined,
        DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined,
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] = js.undefined,
        ThroughputCapacity: js.UndefOr[MegabytesPerSecond] = js.undefined,
        WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
    ): UpdateFileSystemWindowsConfiguration = {
      val __obj = js.Dynamic.literal()
      AuditLogConfiguration.foreach(__v => __obj.updateDynamic("AuditLogConfiguration")(__v.asInstanceOf[js.Any]))
      AutomaticBackupRetentionDays.foreach(__v => __obj.updateDynamic("AutomaticBackupRetentionDays")(__v.asInstanceOf[js.Any]))
      DailyAutomaticBackupStartTime.foreach(__v => __obj.updateDynamic("DailyAutomaticBackupStartTime")(__v.asInstanceOf[js.Any]))
      SelfManagedActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      ThroughputCapacity.foreach(__v => __obj.updateDynamic("ThroughputCapacity")(__v.asInstanceOf[js.Any]))
      WeeklyMaintenanceStartTime.foreach(__v => __obj.updateDynamic("WeeklyMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFileSystemWindowsConfiguration]
    }
  }

  /** Used to specify changes to the ONTAP configuration for the volume you are updating.
    */
  @js.native
  trait UpdateOntapVolumeConfiguration extends js.Object {
    var JunctionPath: js.UndefOr[JunctionPath]
    var SecurityStyle: js.UndefOr[SecurityStyle]
    var SizeInMegabytes: js.UndefOr[VolumeCapacity]
    var StorageEfficiencyEnabled: js.UndefOr[Flag]
    var TieringPolicy: js.UndefOr[TieringPolicy]
  }

  object UpdateOntapVolumeConfiguration {
    @inline
    def apply(
        JunctionPath: js.UndefOr[JunctionPath] = js.undefined,
        SecurityStyle: js.UndefOr[SecurityStyle] = js.undefined,
        SizeInMegabytes: js.UndefOr[VolumeCapacity] = js.undefined,
        StorageEfficiencyEnabled: js.UndefOr[Flag] = js.undefined,
        TieringPolicy: js.UndefOr[TieringPolicy] = js.undefined
    ): UpdateOntapVolumeConfiguration = {
      val __obj = js.Dynamic.literal()
      JunctionPath.foreach(__v => __obj.updateDynamic("JunctionPath")(__v.asInstanceOf[js.Any]))
      SecurityStyle.foreach(__v => __obj.updateDynamic("SecurityStyle")(__v.asInstanceOf[js.Any]))
      SizeInMegabytes.foreach(__v => __obj.updateDynamic("SizeInMegabytes")(__v.asInstanceOf[js.Any]))
      StorageEfficiencyEnabled.foreach(__v => __obj.updateDynamic("StorageEfficiencyEnabled")(__v.asInstanceOf[js.Any]))
      TieringPolicy.foreach(__v => __obj.updateDynamic("TieringPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOntapVolumeConfiguration]
    }
  }

  /** Used to specify changes to the OpenZFS configuration for the volume that you are updating.
    */
  @js.native
  trait UpdateOpenZFSVolumeConfiguration extends js.Object {
    var DataCompressionType: js.UndefOr[OpenZFSDataCompressionType]
    var NfsExports: js.UndefOr[OpenZFSNfsExports]
    var ReadOnly: js.UndefOr[ReadOnly]
    var StorageCapacityQuotaGiB: js.UndefOr[IntegerNoMax]
    var StorageCapacityReservationGiB: js.UndefOr[IntegerNoMax]
    var UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas]
  }

  object UpdateOpenZFSVolumeConfiguration {
    @inline
    def apply(
        DataCompressionType: js.UndefOr[OpenZFSDataCompressionType] = js.undefined,
        NfsExports: js.UndefOr[OpenZFSNfsExports] = js.undefined,
        ReadOnly: js.UndefOr[ReadOnly] = js.undefined,
        StorageCapacityQuotaGiB: js.UndefOr[IntegerNoMax] = js.undefined,
        StorageCapacityReservationGiB: js.UndefOr[IntegerNoMax] = js.undefined,
        UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas] = js.undefined
    ): UpdateOpenZFSVolumeConfiguration = {
      val __obj = js.Dynamic.literal()
      DataCompressionType.foreach(__v => __obj.updateDynamic("DataCompressionType")(__v.asInstanceOf[js.Any]))
      NfsExports.foreach(__v => __obj.updateDynamic("NfsExports")(__v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.updateDynamic("ReadOnly")(__v.asInstanceOf[js.Any]))
      StorageCapacityQuotaGiB.foreach(__v => __obj.updateDynamic("StorageCapacityQuotaGiB")(__v.asInstanceOf[js.Any]))
      StorageCapacityReservationGiB.foreach(__v => __obj.updateDynamic("StorageCapacityReservationGiB")(__v.asInstanceOf[js.Any]))
      UserAndGroupQuotas.foreach(__v => __obj.updateDynamic("UserAndGroupQuotas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOpenZFSVolumeConfiguration]
    }
  }

  @js.native
  trait UpdateSnapshotRequest extends js.Object {
    var Name: SnapshotName
    var SnapshotId: SnapshotId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object UpdateSnapshotRequest {
    @inline
    def apply(
        Name: SnapshotName,
        SnapshotId: SnapshotId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): UpdateSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSnapshotRequest]
    }
  }

  @js.native
  trait UpdateSnapshotResponse extends js.Object {
    var Snapshot: js.UndefOr[Snapshot]
  }

  object UpdateSnapshotResponse {
    @inline
    def apply(
        Snapshot: js.UndefOr[Snapshot] = js.undefined
    ): UpdateSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSnapshotResponse]
    }
  }

  @js.native
  trait UpdateStorageVirtualMachineRequest extends js.Object {
    var StorageVirtualMachineId: StorageVirtualMachineId
    var ActiveDirectoryConfiguration: js.UndefOr[UpdateSvmActiveDirectoryConfiguration]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var SvmAdminPassword: js.UndefOr[AdminPassword]
  }

  object UpdateStorageVirtualMachineRequest {
    @inline
    def apply(
        StorageVirtualMachineId: StorageVirtualMachineId,
        ActiveDirectoryConfiguration: js.UndefOr[UpdateSvmActiveDirectoryConfiguration] = js.undefined,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        SvmAdminPassword: js.UndefOr[AdminPassword] = js.undefined
    ): UpdateStorageVirtualMachineRequest = {
      val __obj = js.Dynamic.literal(
        "StorageVirtualMachineId" -> StorageVirtualMachineId.asInstanceOf[js.Any]
      )

      ActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("ActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      SvmAdminPassword.foreach(__v => __obj.updateDynamic("SvmAdminPassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStorageVirtualMachineRequest]
    }
  }

  @js.native
  trait UpdateStorageVirtualMachineResponse extends js.Object {
    var StorageVirtualMachine: js.UndefOr[StorageVirtualMachine]
  }

  object UpdateStorageVirtualMachineResponse {
    @inline
    def apply(
        StorageVirtualMachine: js.UndefOr[StorageVirtualMachine] = js.undefined
    ): UpdateStorageVirtualMachineResponse = {
      val __obj = js.Dynamic.literal()
      StorageVirtualMachine.foreach(__v => __obj.updateDynamic("StorageVirtualMachine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStorageVirtualMachineResponse]
    }
  }

  /** Updates the Microsoft Active Directory (AD) configuration of an SVM joined to an AD. Please note, account credentials are not returned in the response payload.
    */
  @js.native
  trait UpdateSvmActiveDirectoryConfiguration extends js.Object {
    var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates]
  }

  object UpdateSvmActiveDirectoryConfiguration {
    @inline
    def apply(
        SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] = js.undefined
    ): UpdateSvmActiveDirectoryConfiguration = {
      val __obj = js.Dynamic.literal()
      SelfManagedActiveDirectoryConfiguration.foreach(__v => __obj.updateDynamic("SelfManagedActiveDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSvmActiveDirectoryConfiguration]
    }
  }

  @js.native
  trait UpdateVolumeRequest extends js.Object {
    var VolumeId: VolumeId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Name: js.UndefOr[VolumeName]
    var OntapConfiguration: js.UndefOr[UpdateOntapVolumeConfiguration]
    var OpenZFSConfiguration: js.UndefOr[UpdateOpenZFSVolumeConfiguration]
  }

  object UpdateVolumeRequest {
    @inline
    def apply(
        VolumeId: VolumeId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Name: js.UndefOr[VolumeName] = js.undefined,
        OntapConfiguration: js.UndefOr[UpdateOntapVolumeConfiguration] = js.undefined,
        OpenZFSConfiguration: js.UndefOr[UpdateOpenZFSVolumeConfiguration] = js.undefined
    ): UpdateVolumeRequest = {
      val __obj = js.Dynamic.literal(
        "VolumeId" -> VolumeId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OntapConfiguration.foreach(__v => __obj.updateDynamic("OntapConfiguration")(__v.asInstanceOf[js.Any]))
      OpenZFSConfiguration.foreach(__v => __obj.updateDynamic("OpenZFSConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVolumeRequest]
    }
  }

  @js.native
  trait UpdateVolumeResponse extends js.Object {
    var Volume: js.UndefOr[Volume]
  }

  object UpdateVolumeResponse {
    @inline
    def apply(
        Volume: js.UndefOr[Volume] = js.undefined
    ): UpdateVolumeResponse = {
      val __obj = js.Dynamic.literal()
      Volume.foreach(__v => __obj.updateDynamic("Volume")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVolumeResponse]
    }
  }

  /** Describes an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
    */
  @js.native
  trait Volume extends js.Object {
    var AdministrativeActions: js.UndefOr[AdministrativeActions]
    var CreationTime: js.UndefOr[CreationTime]
    var FileSystemId: js.UndefOr[FileSystemId]
    var Lifecycle: js.UndefOr[VolumeLifecycle]
    var LifecycleTransitionReason: js.UndefOr[LifecycleTransitionReason]
    var Name: js.UndefOr[VolumeName]
    var OntapConfiguration: js.UndefOr[OntapVolumeConfiguration]
    var OpenZFSConfiguration: js.UndefOr[OpenZFSVolumeConfiguration]
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[Tags]
    var VolumeId: js.UndefOr[VolumeId]
    var VolumeType: js.UndefOr[VolumeType]
  }

  object Volume {
    @inline
    def apply(
        AdministrativeActions: js.UndefOr[AdministrativeActions] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        FileSystemId: js.UndefOr[FileSystemId] = js.undefined,
        Lifecycle: js.UndefOr[VolumeLifecycle] = js.undefined,
        LifecycleTransitionReason: js.UndefOr[LifecycleTransitionReason] = js.undefined,
        Name: js.UndefOr[VolumeName] = js.undefined,
        OntapConfiguration: js.UndefOr[OntapVolumeConfiguration] = js.undefined,
        OpenZFSConfiguration: js.UndefOr[OpenZFSVolumeConfiguration] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VolumeId: js.UndefOr[VolumeId] = js.undefined,
        VolumeType: js.UndefOr[VolumeType] = js.undefined
    ): Volume = {
      val __obj = js.Dynamic.literal()
      AdministrativeActions.foreach(__v => __obj.updateDynamic("AdministrativeActions")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      LifecycleTransitionReason.foreach(__v => __obj.updateDynamic("LifecycleTransitionReason")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OntapConfiguration.foreach(__v => __obj.updateDynamic("OntapConfiguration")(__v.asInstanceOf[js.Any]))
      OpenZFSConfiguration.foreach(__v => __obj.updateDynamic("OpenZFSConfiguration")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.updateDynamic("VolumeId")(__v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.updateDynamic("VolumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Volume]
    }
  }

  /** A filter used to restrict the results of describe calls for Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volumes. You can use multiple filters to return results that meet all applied filter requirements.
    */
  @js.native
  trait VolumeFilter extends js.Object {
    var Name: js.UndefOr[VolumeFilterName]
    var Values: js.UndefOr[VolumeFilterValues]
  }

  object VolumeFilter {
    @inline
    def apply(
        Name: js.UndefOr[VolumeFilterName] = js.undefined,
        Values: js.UndefOr[VolumeFilterValues] = js.undefined
    ): VolumeFilter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeFilter]
    }
  }

  /** The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders, and file shares on the Amazon FSx for Windows File Server file system. For more information, see [[https://docs.aws.amazon.com/fsx/latest/WindowsGuide/file-access-auditing.html| File access auditing]].
    */
  @js.native
  trait WindowsAuditLogConfiguration extends js.Object {
    var FileAccessAuditLogLevel: WindowsAccessAuditLogLevel
    var FileShareAccessAuditLogLevel: WindowsAccessAuditLogLevel
    var AuditLogDestination: js.UndefOr[GeneralARN]
  }

  object WindowsAuditLogConfiguration {
    @inline
    def apply(
        FileAccessAuditLogLevel: WindowsAccessAuditLogLevel,
        FileShareAccessAuditLogLevel: WindowsAccessAuditLogLevel,
        AuditLogDestination: js.UndefOr[GeneralARN] = js.undefined
    ): WindowsAuditLogConfiguration = {
      val __obj = js.Dynamic.literal(
        "FileAccessAuditLogLevel" -> FileAccessAuditLogLevel.asInstanceOf[js.Any],
        "FileShareAccessAuditLogLevel" -> FileShareAccessAuditLogLevel.asInstanceOf[js.Any]
      )

      AuditLogDestination.foreach(__v => __obj.updateDynamic("AuditLogDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WindowsAuditLogConfiguration]
    }
  }

  /** The Windows file access auditing configuration used when creating or updating an Amazon FSx for Windows File Server file system.
    */
  @js.native
  trait WindowsAuditLogCreateConfiguration extends js.Object {
    var FileAccessAuditLogLevel: WindowsAccessAuditLogLevel
    var FileShareAccessAuditLogLevel: WindowsAccessAuditLogLevel
    var AuditLogDestination: js.UndefOr[GeneralARN]
  }

  object WindowsAuditLogCreateConfiguration {
    @inline
    def apply(
        FileAccessAuditLogLevel: WindowsAccessAuditLogLevel,
        FileShareAccessAuditLogLevel: WindowsAccessAuditLogLevel,
        AuditLogDestination: js.UndefOr[GeneralARN] = js.undefined
    ): WindowsAuditLogCreateConfiguration = {
      val __obj = js.Dynamic.literal(
        "FileAccessAuditLogLevel" -> FileAccessAuditLogLevel.asInstanceOf[js.Any],
        "FileShareAccessAuditLogLevel" -> FileShareAccessAuditLogLevel.asInstanceOf[js.Any]
      )

      AuditLogDestination.foreach(__v => __obj.updateDynamic("AuditLogDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WindowsAuditLogCreateConfiguration]
    }
  }

  /** The configuration for this Microsoft Windows file system.
    */
  @js.native
  trait WindowsFileSystemConfiguration extends js.Object {
    var ActiveDirectoryId: js.UndefOr[DirectoryId]
    var Aliases: js.UndefOr[Aliases]
    var AuditLogConfiguration: js.UndefOr[WindowsAuditLogConfiguration]
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
        AuditLogConfiguration: js.UndefOr[WindowsAuditLogConfiguration] = js.undefined,
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
      AuditLogConfiguration.foreach(__v => __obj.updateDynamic("AuditLogConfiguration")(__v.asInstanceOf[js.Any]))
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
