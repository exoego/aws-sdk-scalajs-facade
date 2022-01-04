package facade.amazonaws.services.fsx

import scalajs.js

/** Describes the type of administrative action, as follows: * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative action initiated from the Amazon FSx console, API (<code>UpdateFileSystem</code>), or CLI (<code>update-file-system</code>). * <code>STORAGE_OPTIMIZATION</code> - After the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage capacity has been completed successfully, a <code>STORAGE_OPTIMIZATION</code> task starts. <li> For Windows, storage optimization is the process of migrating the file system data to the new, larger disks. * For Lustre, storage optimization consists of rebalancing the data across the existing and newly added file servers. * For OpenZFS, storage optimization consists of migrating data from the older smaller disks to the newer larger disks. You can track the storage-optimization progress using the <code>ProgressPercent</code> property. When <code>STORAGE_OPTIMIZATION</code> has been completed successfully, the parent
  * <code>FILE_SYSTEM_UPDATE</code> action status changes to <code>COMPLETED</code>. For more information, see [[https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html|Managing storage capacity]] in the <i>Amazon FSx for Windows File Server User Guide</i>, [[https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html|Managing storage and throughput capacity]] in the <i>Amazon FSx for Lustre User Guide</i>, and [[https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-storage-capacity.html|Managing storage capacity]] in the <i>Amazon FSx for OpenZFS User Guide</i>. </li> * <code>FILE_SYSTEM_ALIAS_ASSOCIATION</code> - A file system update to associate a new Domain Name System (DNS) alias with the file system. For more information, see [[https://docs.aws.amazon.com/fsx/latest/APIReference/API_AssociateFileSystemAliases.html| AssociateFileSystemAliases]]. * <code>FILE_SYSTEM_ALIAS_DISASSOCIATION</code> - A file system update to
  * disassociate a DNS alias from the file system. For more information, see [[https://docs.aws.amazon.com/fsx/latest/APIReference/API_DisassociateFileSystemAliases.html|DisassociateFileSystemAliases]]. * <code>VOLUME_UPDATE</code> - A volume update to an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume initiated from the Amazon FSx console, API (<code>UpdateVolume</code>), or CLI (<code>update-volume</code>). * <code>SNAPSHOT_UPDATE</code> - A snapshot update to an Amazon FSx for OpenZFS volume initiated from the Amazon FSx console, API (<code>UpdateSnapshot</code>), or CLI (<code>update-snapshot</code>). * <code>RELEASE_NFS_V3_LOCKS</code> - Tracks the release of Network File System (NFS) V3 locks on an Amazon FSx for OpenZFS file system.
  */
@js.native
sealed trait AdministrativeActionType extends js.Any
object AdministrativeActionType {
  val FILE_SYSTEM_UPDATE = "FILE_SYSTEM_UPDATE".asInstanceOf[AdministrativeActionType]
  val STORAGE_OPTIMIZATION = "STORAGE_OPTIMIZATION".asInstanceOf[AdministrativeActionType]
  val FILE_SYSTEM_ALIAS_ASSOCIATION = "FILE_SYSTEM_ALIAS_ASSOCIATION".asInstanceOf[AdministrativeActionType]
  val FILE_SYSTEM_ALIAS_DISASSOCIATION = "FILE_SYSTEM_ALIAS_DISASSOCIATION".asInstanceOf[AdministrativeActionType]
  val VOLUME_UPDATE = "VOLUME_UPDATE".asInstanceOf[AdministrativeActionType]
  val SNAPSHOT_UPDATE = "SNAPSHOT_UPDATE".asInstanceOf[AdministrativeActionType]
  val RELEASE_NFS_V3_LOCKS = "RELEASE_NFS_V3_LOCKS".asInstanceOf[AdministrativeActionType]

  @inline def values: js.Array[AdministrativeActionType] = js.Array(
    FILE_SYSTEM_UPDATE,
    STORAGE_OPTIMIZATION,
    FILE_SYSTEM_ALIAS_ASSOCIATION,
    FILE_SYSTEM_ALIAS_DISASSOCIATION,
    VOLUME_UPDATE,
    SNAPSHOT_UPDATE,
    RELEASE_NFS_V3_LOCKS
  )
}

@js.native
sealed trait AliasLifecycle extends js.Any
object AliasLifecycle {
  val AVAILABLE = "AVAILABLE".asInstanceOf[AliasLifecycle]
  val CREATING = "CREATING".asInstanceOf[AliasLifecycle]
  val DELETING = "DELETING".asInstanceOf[AliasLifecycle]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[AliasLifecycle]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[AliasLifecycle]

  @inline def values: js.Array[AliasLifecycle] = js.Array(AVAILABLE, CREATING, DELETING, CREATE_FAILED, DELETE_FAILED)
}

@js.native
sealed trait AutoImportPolicyType extends js.Any
object AutoImportPolicyType {
  val NONE = "NONE".asInstanceOf[AutoImportPolicyType]
  val NEW = "NEW".asInstanceOf[AutoImportPolicyType]
  val NEW_CHANGED = "NEW_CHANGED".asInstanceOf[AutoImportPolicyType]
  val NEW_CHANGED_DELETED = "NEW_CHANGED_DELETED".asInstanceOf[AutoImportPolicyType]

  @inline def values: js.Array[AutoImportPolicyType] = js.Array(NONE, NEW, NEW_CHANGED, NEW_CHANGED_DELETED)
}

/** The lifecycle status of the backup. * <code>AVAILABLE</code> - The backup is fully available. * <code>PENDING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx hasn't started creating the backup. * <code>CREATING</code> - Amazon FSx is creating the new user-initiated backup. * <code>TRANSFERRING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx is backing up the file system. * <code>COPYING</code> - Amazon FSx is copying the backup. * <code>DELETED</code> - Amazon FSx deleted the backup and it's no longer available. * <code>FAILED</code> - Amazon FSx couldn't finish the backup.
  */
@js.native
sealed trait BackupLifecycle extends js.Any
object BackupLifecycle {
  val AVAILABLE = "AVAILABLE".asInstanceOf[BackupLifecycle]
  val CREATING = "CREATING".asInstanceOf[BackupLifecycle]
  val TRANSFERRING = "TRANSFERRING".asInstanceOf[BackupLifecycle]
  val DELETED = "DELETED".asInstanceOf[BackupLifecycle]
  val FAILED = "FAILED".asInstanceOf[BackupLifecycle]
  val PENDING = "PENDING".asInstanceOf[BackupLifecycle]
  val COPYING = "COPYING".asInstanceOf[BackupLifecycle]

  @inline def values: js.Array[BackupLifecycle] = js.Array(AVAILABLE, CREATING, TRANSFERRING, DELETED, FAILED, PENDING, COPYING)
}

/** The type of the backup.
  */
@js.native
sealed trait BackupType extends js.Any
object BackupType {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[BackupType]
  val USER_INITIATED = "USER_INITIATED".asInstanceOf[BackupType]
  val AWS_BACKUP = "AWS_BACKUP".asInstanceOf[BackupType]

  @inline def values: js.Array[BackupType] = js.Array(AUTOMATIC, USER_INITIATED, AWS_BACKUP)
}

@js.native
sealed trait DataCompressionType extends js.Any
object DataCompressionType {
  val NONE = "NONE".asInstanceOf[DataCompressionType]
  val LZ4 = "LZ4".asInstanceOf[DataCompressionType]

  @inline def values: js.Array[DataCompressionType] = js.Array(NONE, LZ4)
}

@js.native
sealed trait DataRepositoryLifecycle extends js.Any
object DataRepositoryLifecycle {
  val CREATING = "CREATING".asInstanceOf[DataRepositoryLifecycle]
  val AVAILABLE = "AVAILABLE".asInstanceOf[DataRepositoryLifecycle]
  val MISCONFIGURED = "MISCONFIGURED".asInstanceOf[DataRepositoryLifecycle]
  val UPDATING = "UPDATING".asInstanceOf[DataRepositoryLifecycle]
  val DELETING = "DELETING".asInstanceOf[DataRepositoryLifecycle]
  val FAILED = "FAILED".asInstanceOf[DataRepositoryLifecycle]

  @inline def values: js.Array[DataRepositoryLifecycle] = js.Array(CREATING, AVAILABLE, MISCONFIGURED, UPDATING, DELETING, FAILED)
}

@js.native
sealed trait DataRepositoryTaskFilterName extends js.Any
object DataRepositoryTaskFilterName {
  val `file-system-id` = "file-system-id".asInstanceOf[DataRepositoryTaskFilterName]
  val `task-lifecycle` = "task-lifecycle".asInstanceOf[DataRepositoryTaskFilterName]
  val `data-repository-association-id` = "data-repository-association-id".asInstanceOf[DataRepositoryTaskFilterName]

  @inline def values: js.Array[DataRepositoryTaskFilterName] = js.Array(`file-system-id`, `task-lifecycle`, `data-repository-association-id`)
}

@js.native
sealed trait DataRepositoryTaskLifecycle extends js.Any
object DataRepositoryTaskLifecycle {
  val PENDING = "PENDING".asInstanceOf[DataRepositoryTaskLifecycle]
  val EXECUTING = "EXECUTING".asInstanceOf[DataRepositoryTaskLifecycle]
  val FAILED = "FAILED".asInstanceOf[DataRepositoryTaskLifecycle]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[DataRepositoryTaskLifecycle]
  val CANCELED = "CANCELED".asInstanceOf[DataRepositoryTaskLifecycle]
  val CANCELING = "CANCELING".asInstanceOf[DataRepositoryTaskLifecycle]

  @inline def values: js.Array[DataRepositoryTaskLifecycle] = js.Array(PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED, CANCELING)
}

@js.native
sealed trait DataRepositoryTaskType extends js.Any
object DataRepositoryTaskType {
  val EXPORT_TO_REPOSITORY = "EXPORT_TO_REPOSITORY".asInstanceOf[DataRepositoryTaskType]
  val IMPORT_METADATA_FROM_REPOSITORY = "IMPORT_METADATA_FROM_REPOSITORY".asInstanceOf[DataRepositoryTaskType]

  @inline def values: js.Array[DataRepositoryTaskType] = js.Array(EXPORT_TO_REPOSITORY, IMPORT_METADATA_FROM_REPOSITORY)
}

@js.native
sealed trait DeleteOpenZFSVolumeOption extends js.Any
object DeleteOpenZFSVolumeOption {
  val DELETE_CHILD_VOLUMES_AND_SNAPSHOTS = "DELETE_CHILD_VOLUMES_AND_SNAPSHOTS".asInstanceOf[DeleteOpenZFSVolumeOption]

  @inline def values: js.Array[DeleteOpenZFSVolumeOption] = js.Array(DELETE_CHILD_VOLUMES_AND_SNAPSHOTS)
}

@js.native
sealed trait DiskIopsConfigurationMode extends js.Any
object DiskIopsConfigurationMode {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[DiskIopsConfigurationMode]
  val USER_PROVISIONED = "USER_PROVISIONED".asInstanceOf[DiskIopsConfigurationMode]

  @inline def values: js.Array[DiskIopsConfigurationMode] = js.Array(AUTOMATIC, USER_PROVISIONED)
}

@js.native
sealed trait DriveCacheType extends js.Any
object DriveCacheType {
  val NONE = "NONE".asInstanceOf[DriveCacheType]
  val READ = "READ".asInstanceOf[DriveCacheType]

  @inline def values: js.Array[DriveCacheType] = js.Array(NONE, READ)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val NEW = "NEW".asInstanceOf[EventType]
  val CHANGED = "CHANGED".asInstanceOf[EventType]
  val DELETED = "DELETED".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(NEW, CHANGED, DELETED)
}

/** The lifecycle status of the file system.
  */
@js.native
sealed trait FileSystemLifecycle extends js.Any
object FileSystemLifecycle {
  val AVAILABLE = "AVAILABLE".asInstanceOf[FileSystemLifecycle]
  val CREATING = "CREATING".asInstanceOf[FileSystemLifecycle]
  val FAILED = "FAILED".asInstanceOf[FileSystemLifecycle]
  val DELETING = "DELETING".asInstanceOf[FileSystemLifecycle]
  val MISCONFIGURED = "MISCONFIGURED".asInstanceOf[FileSystemLifecycle]
  val UPDATING = "UPDATING".asInstanceOf[FileSystemLifecycle]

  @inline def values: js.Array[FileSystemLifecycle] = js.Array(AVAILABLE, CREATING, FAILED, DELETING, MISCONFIGURED, UPDATING)
}

/** An enumeration specifying the currently ongoing maintenance operation.
  */
@js.native
sealed trait FileSystemMaintenanceOperation extends js.Any
object FileSystemMaintenanceOperation {
  val PATCHING = "PATCHING".asInstanceOf[FileSystemMaintenanceOperation]
  val BACKING_UP = "BACKING_UP".asInstanceOf[FileSystemMaintenanceOperation]

  @inline def values: js.Array[FileSystemMaintenanceOperation] = js.Array(PATCHING, BACKING_UP)
}

/** The type of file system.
  */
@js.native
sealed trait FileSystemType extends js.Any
object FileSystemType {
  val WINDOWS = "WINDOWS".asInstanceOf[FileSystemType]
  val LUSTRE = "LUSTRE".asInstanceOf[FileSystemType]
  val ONTAP = "ONTAP".asInstanceOf[FileSystemType]
  val OPENZFS = "OPENZFS".asInstanceOf[FileSystemType]

  @inline def values: js.Array[FileSystemType] = js.Array(WINDOWS, LUSTRE, ONTAP, OPENZFS)
}

/** The name for a filter.
  */
@js.native
sealed trait FilterName extends js.Any
object FilterName {
  val `file-system-id` = "file-system-id".asInstanceOf[FilterName]
  val `backup-type` = "backup-type".asInstanceOf[FilterName]
  val `file-system-type` = "file-system-type".asInstanceOf[FilterName]
  val `volume-id` = "volume-id".asInstanceOf[FilterName]
  val `data-repository-type` = "data-repository-type".asInstanceOf[FilterName]

  @inline def values: js.Array[FilterName] = js.Array(`file-system-id`, `backup-type`, `file-system-type`, `volume-id`, `data-repository-type`)
}

@js.native
sealed trait FlexCacheEndpointType extends js.Any
object FlexCacheEndpointType {
  val NONE = "NONE".asInstanceOf[FlexCacheEndpointType]
  val ORIGIN = "ORIGIN".asInstanceOf[FlexCacheEndpointType]
  val CACHE = "CACHE".asInstanceOf[FlexCacheEndpointType]

  @inline def values: js.Array[FlexCacheEndpointType] = js.Array(NONE, ORIGIN, CACHE)
}

@js.native
sealed trait LustreAccessAuditLogLevel extends js.Any
object LustreAccessAuditLogLevel {
  val DISABLED = "DISABLED".asInstanceOf[LustreAccessAuditLogLevel]
  val WARN_ONLY = "WARN_ONLY".asInstanceOf[LustreAccessAuditLogLevel]
  val ERROR_ONLY = "ERROR_ONLY".asInstanceOf[LustreAccessAuditLogLevel]
  val WARN_ERROR = "WARN_ERROR".asInstanceOf[LustreAccessAuditLogLevel]

  @inline def values: js.Array[LustreAccessAuditLogLevel] = js.Array(DISABLED, WARN_ONLY, ERROR_ONLY, WARN_ERROR)
}

@js.native
sealed trait LustreDeploymentType extends js.Any
object LustreDeploymentType {
  val SCRATCH_1 = "SCRATCH_1".asInstanceOf[LustreDeploymentType]
  val SCRATCH_2 = "SCRATCH_2".asInstanceOf[LustreDeploymentType]
  val PERSISTENT_1 = "PERSISTENT_1".asInstanceOf[LustreDeploymentType]
  val PERSISTENT_2 = "PERSISTENT_2".asInstanceOf[LustreDeploymentType]

  @inline def values: js.Array[LustreDeploymentType] = js.Array(SCRATCH_1, SCRATCH_2, PERSISTENT_1, PERSISTENT_2)
}

@js.native
sealed trait OntapDeploymentType extends js.Any
object OntapDeploymentType {
  val MULTI_AZ_1 = "MULTI_AZ_1".asInstanceOf[OntapDeploymentType]

  @inline def values: js.Array[OntapDeploymentType] = js.Array(MULTI_AZ_1)
}

@js.native
sealed trait OntapVolumeType extends js.Any
object OntapVolumeType {
  val RW = "RW".asInstanceOf[OntapVolumeType]
  val DP = "DP".asInstanceOf[OntapVolumeType]
  val LS = "LS".asInstanceOf[OntapVolumeType]

  @inline def values: js.Array[OntapVolumeType] = js.Array(RW, DP, LS)
}

@js.native
sealed trait OpenZFSCopyStrategy extends js.Any
object OpenZFSCopyStrategy {
  val CLONE = "CLONE".asInstanceOf[OpenZFSCopyStrategy]
  val FULL_COPY = "FULL_COPY".asInstanceOf[OpenZFSCopyStrategy]

  @inline def values: js.Array[OpenZFSCopyStrategy] = js.Array(CLONE, FULL_COPY)
}

@js.native
sealed trait OpenZFSDataCompressionType extends js.Any
object OpenZFSDataCompressionType {
  val NONE = "NONE".asInstanceOf[OpenZFSDataCompressionType]
  val ZSTD = "ZSTD".asInstanceOf[OpenZFSDataCompressionType]

  @inline def values: js.Array[OpenZFSDataCompressionType] = js.Array(NONE, ZSTD)
}

@js.native
sealed trait OpenZFSDeploymentType extends js.Any
object OpenZFSDeploymentType {
  val SINGLE_AZ_1 = "SINGLE_AZ_1".asInstanceOf[OpenZFSDeploymentType]

  @inline def values: js.Array[OpenZFSDeploymentType] = js.Array(SINGLE_AZ_1)
}

@js.native
sealed trait OpenZFSQuotaType extends js.Any
object OpenZFSQuotaType {
  val USER = "USER".asInstanceOf[OpenZFSQuotaType]
  val GROUP = "GROUP".asInstanceOf[OpenZFSQuotaType]

  @inline def values: js.Array[OpenZFSQuotaType] = js.Array(USER, GROUP)
}

@js.native
sealed trait ReportFormat extends js.Any
object ReportFormat {
  val REPORT_CSV_20191124 = "REPORT_CSV_20191124".asInstanceOf[ReportFormat]

  @inline def values: js.Array[ReportFormat] = js.Array(REPORT_CSV_20191124)
}

@js.native
sealed trait ReportScope extends js.Any
object ReportScope {
  val FAILED_FILES_ONLY = "FAILED_FILES_ONLY".asInstanceOf[ReportScope]

  @inline def values: js.Array[ReportScope] = js.Array(FAILED_FILES_ONLY)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val FILE_SYSTEM = "FILE_SYSTEM".asInstanceOf[ResourceType]
  val VOLUME = "VOLUME".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(FILE_SYSTEM, VOLUME)
}

@js.native
sealed trait RestoreOpenZFSVolumeOption extends js.Any
object RestoreOpenZFSVolumeOption {
  val DELETE_INTERMEDIATE_SNAPSHOTS = "DELETE_INTERMEDIATE_SNAPSHOTS".asInstanceOf[RestoreOpenZFSVolumeOption]
  val DELETE_CLONED_VOLUMES = "DELETE_CLONED_VOLUMES".asInstanceOf[RestoreOpenZFSVolumeOption]

  @inline def values: js.Array[RestoreOpenZFSVolumeOption] = js.Array(DELETE_INTERMEDIATE_SNAPSHOTS, DELETE_CLONED_VOLUMES)
}

@js.native
sealed trait SecurityStyle extends js.Any
object SecurityStyle {
  val UNIX = "UNIX".asInstanceOf[SecurityStyle]
  val NTFS = "NTFS".asInstanceOf[SecurityStyle]
  val MIXED = "MIXED".asInstanceOf[SecurityStyle]

  @inline def values: js.Array[SecurityStyle] = js.Array(UNIX, NTFS, MIXED)
}

@js.native
sealed trait SnapshotFilterName extends js.Any
object SnapshotFilterName {
  val `file-system-id` = "file-system-id".asInstanceOf[SnapshotFilterName]
  val `volume-id` = "volume-id".asInstanceOf[SnapshotFilterName]

  @inline def values: js.Array[SnapshotFilterName] = js.Array(`file-system-id`, `volume-id`)
}

@js.native
sealed trait SnapshotLifecycle extends js.Any
object SnapshotLifecycle {
  val PENDING = "PENDING".asInstanceOf[SnapshotLifecycle]
  val CREATING = "CREATING".asInstanceOf[SnapshotLifecycle]
  val DELETING = "DELETING".asInstanceOf[SnapshotLifecycle]
  val AVAILABLE = "AVAILABLE".asInstanceOf[SnapshotLifecycle]

  @inline def values: js.Array[SnapshotLifecycle] = js.Array(PENDING, CREATING, DELETING, AVAILABLE)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val FAILED = "FAILED".asInstanceOf[Status]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[Status]
  val PENDING = "PENDING".asInstanceOf[Status]
  val COMPLETED = "COMPLETED".asInstanceOf[Status]
  val UPDATED_OPTIMIZING = "UPDATED_OPTIMIZING".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(FAILED, IN_PROGRESS, PENDING, COMPLETED, UPDATED_OPTIMIZING)
}

/** The storage type for your Amazon FSx file system.
  */
@js.native
sealed trait StorageType extends js.Any
object StorageType {
  val SSD = "SSD".asInstanceOf[StorageType]
  val HDD = "HDD".asInstanceOf[StorageType]

  @inline def values: js.Array[StorageType] = js.Array(SSD, HDD)
}

@js.native
sealed trait StorageVirtualMachineFilterName extends js.Any
object StorageVirtualMachineFilterName {
  val `file-system-id` = "file-system-id".asInstanceOf[StorageVirtualMachineFilterName]

  @inline def values: js.Array[StorageVirtualMachineFilterName] = js.Array(`file-system-id`)
}

@js.native
sealed trait StorageVirtualMachineLifecycle extends js.Any
object StorageVirtualMachineLifecycle {
  val CREATED = "CREATED".asInstanceOf[StorageVirtualMachineLifecycle]
  val CREATING = "CREATING".asInstanceOf[StorageVirtualMachineLifecycle]
  val DELETING = "DELETING".asInstanceOf[StorageVirtualMachineLifecycle]
  val FAILED = "FAILED".asInstanceOf[StorageVirtualMachineLifecycle]
  val MISCONFIGURED = "MISCONFIGURED".asInstanceOf[StorageVirtualMachineLifecycle]
  val PENDING = "PENDING".asInstanceOf[StorageVirtualMachineLifecycle]

  @inline def values: js.Array[StorageVirtualMachineLifecycle] = js.Array(CREATED, CREATING, DELETING, FAILED, MISCONFIGURED, PENDING)
}

@js.native
sealed trait StorageVirtualMachineRootVolumeSecurityStyle extends js.Any
object StorageVirtualMachineRootVolumeSecurityStyle {
  val UNIX = "UNIX".asInstanceOf[StorageVirtualMachineRootVolumeSecurityStyle]
  val NTFS = "NTFS".asInstanceOf[StorageVirtualMachineRootVolumeSecurityStyle]
  val MIXED = "MIXED".asInstanceOf[StorageVirtualMachineRootVolumeSecurityStyle]

  @inline def values: js.Array[StorageVirtualMachineRootVolumeSecurityStyle] = js.Array(UNIX, NTFS, MIXED)
}

@js.native
sealed trait StorageVirtualMachineSubtype extends js.Any
object StorageVirtualMachineSubtype {
  val DEFAULT = "DEFAULT".asInstanceOf[StorageVirtualMachineSubtype]
  val DP_DESTINATION = "DP_DESTINATION".asInstanceOf[StorageVirtualMachineSubtype]
  val SYNC_DESTINATION = "SYNC_DESTINATION".asInstanceOf[StorageVirtualMachineSubtype]
  val SYNC_SOURCE = "SYNC_SOURCE".asInstanceOf[StorageVirtualMachineSubtype]

  @inline def values: js.Array[StorageVirtualMachineSubtype] = js.Array(DEFAULT, DP_DESTINATION, SYNC_DESTINATION, SYNC_SOURCE)
}

@js.native
sealed trait TieringPolicyName extends js.Any
object TieringPolicyName {
  val SNAPSHOT_ONLY = "SNAPSHOT_ONLY".asInstanceOf[TieringPolicyName]
  val AUTO = "AUTO".asInstanceOf[TieringPolicyName]
  val ALL = "ALL".asInstanceOf[TieringPolicyName]
  val NONE = "NONE".asInstanceOf[TieringPolicyName]

  @inline def values: js.Array[TieringPolicyName] = js.Array(SNAPSHOT_ONLY, AUTO, ALL, NONE)
}

@js.native
sealed trait VolumeFilterName extends js.Any
object VolumeFilterName {
  val `file-system-id` = "file-system-id".asInstanceOf[VolumeFilterName]
  val `storage-virtual-machine-id` = "storage-virtual-machine-id".asInstanceOf[VolumeFilterName]

  @inline def values: js.Array[VolumeFilterName] = js.Array(`file-system-id`, `storage-virtual-machine-id`)
}

@js.native
sealed trait VolumeLifecycle extends js.Any
object VolumeLifecycle {
  val CREATING = "CREATING".asInstanceOf[VolumeLifecycle]
  val CREATED = "CREATED".asInstanceOf[VolumeLifecycle]
  val DELETING = "DELETING".asInstanceOf[VolumeLifecycle]
  val FAILED = "FAILED".asInstanceOf[VolumeLifecycle]
  val MISCONFIGURED = "MISCONFIGURED".asInstanceOf[VolumeLifecycle]
  val PENDING = "PENDING".asInstanceOf[VolumeLifecycle]
  val AVAILABLE = "AVAILABLE".asInstanceOf[VolumeLifecycle]

  @inline def values: js.Array[VolumeLifecycle] = js.Array(CREATING, CREATED, DELETING, FAILED, MISCONFIGURED, PENDING, AVAILABLE)
}

@js.native
sealed trait VolumeType extends js.Any
object VolumeType {
  val ONTAP = "ONTAP".asInstanceOf[VolumeType]
  val OPENZFS = "OPENZFS".asInstanceOf[VolumeType]

  @inline def values: js.Array[VolumeType] = js.Array(ONTAP, OPENZFS)
}

@js.native
sealed trait WindowsAccessAuditLogLevel extends js.Any
object WindowsAccessAuditLogLevel {
  val DISABLED = "DISABLED".asInstanceOf[WindowsAccessAuditLogLevel]
  val SUCCESS_ONLY = "SUCCESS_ONLY".asInstanceOf[WindowsAccessAuditLogLevel]
  val FAILURE_ONLY = "FAILURE_ONLY".asInstanceOf[WindowsAccessAuditLogLevel]
  val SUCCESS_AND_FAILURE = "SUCCESS_AND_FAILURE".asInstanceOf[WindowsAccessAuditLogLevel]

  @inline def values: js.Array[WindowsAccessAuditLogLevel] = js.Array(DISABLED, SUCCESS_ONLY, FAILURE_ONLY, SUCCESS_AND_FAILURE)
}

@js.native
sealed trait WindowsDeploymentType extends js.Any
object WindowsDeploymentType {
  val MULTI_AZ_1 = "MULTI_AZ_1".asInstanceOf[WindowsDeploymentType]
  val SINGLE_AZ_1 = "SINGLE_AZ_1".asInstanceOf[WindowsDeploymentType]
  val SINGLE_AZ_2 = "SINGLE_AZ_2".asInstanceOf[WindowsDeploymentType]

  @inline def values: js.Array[WindowsDeploymentType] = js.Array(MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2)
}
