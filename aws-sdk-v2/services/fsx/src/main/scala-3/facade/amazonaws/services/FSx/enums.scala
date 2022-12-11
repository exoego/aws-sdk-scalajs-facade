package facade.amazonaws.services.fsx

import scalajs.js

/** Describes the type of administrative action, as follows: * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative action initiated from the Amazon FSx console, API (<code>UpdateFileSystem</code>), or CLI (<code>update-file-system</code>). * <code>STORAGE_OPTIMIZATION</code> - After the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage capacity has been completed successfully, a <code>STORAGE_OPTIMIZATION</code> task starts. <li> For Windows and ONTAP, storage optimization is the process of migrating the file system data to newer larger disks. * For Lustre, storage optimization consists of rebalancing the data across the existing and newly added file servers. You can track the storage-optimization progress using the <code>ProgressPercent</code> property. When <code>STORAGE_OPTIMIZATION</code> has been completed successfully, the parent <code>FILE_SYSTEM_UPDATE</code> action status changes to <code>COMPLETED</code>. For more information, see
  * [[https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html|Managing storage capacity]] in the <i>Amazon FSx for Windows File Server User Guide</i>, [[https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html|Managing storage and throughput capacity]] in the <i>Amazon FSx for Lustre User Guide</i>, and [[https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-storage-capacity.html|Managing storage capacity and provisioned IOPS]] in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. </li> * <code>FILE_SYSTEM_ALIAS_ASSOCIATION</code> - A file system update to associate a new Domain Name System (DNS) alias with the file system. For more information, see [[https://docs.aws.amazon.com/fsx/latest/APIReference/API_AssociateFileSystemAliases.html| AssociateFileSystemAliases]]. * <code>FILE_SYSTEM_ALIAS_DISASSOCIATION</code> - A file system update to disassociate a DNS alias from the file system. For more information, see
  * [[https://docs.aws.amazon.com/fsx/latest/APIReference/API_DisassociateFileSystemAliases.html|DisassociateFileSystemAliases]]. * <code>VOLUME_UPDATE</code> - A volume update to an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume initiated from the Amazon FSx console, API (<code>UpdateVolume</code>), or CLI (<code>update-volume</code>). * <code>VOLUME_RESTORE</code> - An Amazon FSx for OpenZFS volume is returned to the state saved by the specified snapshot, initiated from an API (<code>RestoreVolumeFromSnapshot</code>) or CLI (<code>restore-volume-from-snapshot</code>). * <code>SNAPSHOT_UPDATE</code> - A snapshot update to an Amazon FSx for OpenZFS volume initiated from the Amazon FSx console, API (<code>UpdateSnapshot</code>), or CLI (<code>update-snapshot</code>). * <code>RELEASE_NFS_V3_LOCKS</code> - Tracks the release of Network File System (NFS) V3 locks on an Amazon FSx for OpenZFS file system.
  */
type AdministrativeActionType = "FILE_SYSTEM_UPDATE" | "STORAGE_OPTIMIZATION" | "FILE_SYSTEM_ALIAS_ASSOCIATION" | "FILE_SYSTEM_ALIAS_DISASSOCIATION" | "VOLUME_UPDATE" | "SNAPSHOT_UPDATE" | "RELEASE_NFS_V3_LOCKS" | "VOLUME_RESTORE"
object AdministrativeActionType {
  inline val FILE_SYSTEM_UPDATE: "FILE_SYSTEM_UPDATE" = "FILE_SYSTEM_UPDATE"
  inline val STORAGE_OPTIMIZATION: "STORAGE_OPTIMIZATION" = "STORAGE_OPTIMIZATION"
  inline val FILE_SYSTEM_ALIAS_ASSOCIATION: "FILE_SYSTEM_ALIAS_ASSOCIATION" = "FILE_SYSTEM_ALIAS_ASSOCIATION"
  inline val FILE_SYSTEM_ALIAS_DISASSOCIATION: "FILE_SYSTEM_ALIAS_DISASSOCIATION" = "FILE_SYSTEM_ALIAS_DISASSOCIATION"
  inline val VOLUME_UPDATE: "VOLUME_UPDATE" = "VOLUME_UPDATE"
  inline val SNAPSHOT_UPDATE: "SNAPSHOT_UPDATE" = "SNAPSHOT_UPDATE"
  inline val RELEASE_NFS_V3_LOCKS: "RELEASE_NFS_V3_LOCKS" = "RELEASE_NFS_V3_LOCKS"
  inline val VOLUME_RESTORE: "VOLUME_RESTORE" = "VOLUME_RESTORE"

  inline def values: js.Array[AdministrativeActionType] = js.Array(
    FILE_SYSTEM_UPDATE,
    STORAGE_OPTIMIZATION,
    FILE_SYSTEM_ALIAS_ASSOCIATION,
    FILE_SYSTEM_ALIAS_DISASSOCIATION,
    VOLUME_UPDATE,
    SNAPSHOT_UPDATE,
    RELEASE_NFS_V3_LOCKS,
    VOLUME_RESTORE
  )
}

type AliasLifecycle = "AVAILABLE" | "CREATING" | "DELETING" | "CREATE_FAILED" | "DELETE_FAILED"
object AliasLifecycle {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[AliasLifecycle] = js.Array(AVAILABLE, CREATING, DELETING, CREATE_FAILED, DELETE_FAILED)
}

type AutoImportPolicyType = "NONE" | "NEW" | "NEW_CHANGED" | "NEW_CHANGED_DELETED"
object AutoImportPolicyType {
  inline val NONE: "NONE" = "NONE"
  inline val NEW: "NEW" = "NEW"
  inline val NEW_CHANGED: "NEW_CHANGED" = "NEW_CHANGED"
  inline val NEW_CHANGED_DELETED: "NEW_CHANGED_DELETED" = "NEW_CHANGED_DELETED"

  inline def values: js.Array[AutoImportPolicyType] = js.Array(NONE, NEW, NEW_CHANGED, NEW_CHANGED_DELETED)
}

/** The lifecycle status of the backup. * <code>AVAILABLE</code> - The backup is fully available. * <code>PENDING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx hasn't started creating the backup. * <code>CREATING</code> - Amazon FSx is creating the new user-initiated backup. * <code>TRANSFERRING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx is backing up the file system. * <code>COPYING</code> - Amazon FSx is copying the backup. * <code>DELETED</code> - Amazon FSx deleted the backup and it's no longer available. * <code>FAILED</code> - Amazon FSx couldn't finish the backup.
  */
type BackupLifecycle = "AVAILABLE" | "CREATING" | "TRANSFERRING" | "DELETED" | "FAILED" | "PENDING" | "COPYING"
object BackupLifecycle {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val TRANSFERRING: "TRANSFERRING" = "TRANSFERRING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val COPYING: "COPYING" = "COPYING"

  inline def values: js.Array[BackupLifecycle] = js.Array(AVAILABLE, CREATING, TRANSFERRING, DELETED, FAILED, PENDING, COPYING)
}

/** The type of the backup.
  */
type BackupType = "AUTOMATIC" | "USER_INITIATED" | "AWS_BACKUP"
object BackupType {
  inline val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  inline val USER_INITIATED: "USER_INITIATED" = "USER_INITIATED"
  inline val AWS_BACKUP: "AWS_BACKUP" = "AWS_BACKUP"

  inline def values: js.Array[BackupType] = js.Array(AUTOMATIC, USER_INITIATED, AWS_BACKUP)
}

type DataCompressionType = "NONE" | "LZ4"
object DataCompressionType {
  inline val NONE: "NONE" = "NONE"
  inline val LZ4: "LZ4" = "LZ4"

  inline def values: js.Array[DataCompressionType] = js.Array(NONE, LZ4)
}

type DataRepositoryLifecycle = "CREATING" | "AVAILABLE" | "MISCONFIGURED" | "UPDATING" | "DELETING" | "FAILED"
object DataRepositoryLifecycle {
  inline val CREATING: "CREATING" = "CREATING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val MISCONFIGURED: "MISCONFIGURED" = "MISCONFIGURED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[DataRepositoryLifecycle] = js.Array(CREATING, AVAILABLE, MISCONFIGURED, UPDATING, DELETING, FAILED)
}

type DataRepositoryTaskFilterName = "file-system-id" | "task-lifecycle" | "data-repository-association-id" | "file-cache-id"
object DataRepositoryTaskFilterName {
  inline val `file-system-id`: "file-system-id" = "file-system-id"
  inline val `task-lifecycle`: "task-lifecycle" = "task-lifecycle"
  inline val `data-repository-association-id`: "data-repository-association-id" = "data-repository-association-id"
  inline val `file-cache-id`: "file-cache-id" = "file-cache-id"

  inline def values: js.Array[DataRepositoryTaskFilterName] = js.Array(`file-system-id`, `task-lifecycle`, `data-repository-association-id`, `file-cache-id`)
}

type DataRepositoryTaskLifecycle = "PENDING" | "EXECUTING" | "FAILED" | "SUCCEEDED" | "CANCELED" | "CANCELING"
object DataRepositoryTaskLifecycle {
  inline val PENDING: "PENDING" = "PENDING"
  inline val EXECUTING: "EXECUTING" = "EXECUTING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val CANCELING: "CANCELING" = "CANCELING"

  inline def values: js.Array[DataRepositoryTaskLifecycle] = js.Array(PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED, CANCELING)
}

type DataRepositoryTaskType = "EXPORT_TO_REPOSITORY" | "IMPORT_METADATA_FROM_REPOSITORY" | "RELEASE_DATA_FROM_FILESYSTEM" | "AUTO_RELEASE_DATA"
object DataRepositoryTaskType {
  inline val EXPORT_TO_REPOSITORY: "EXPORT_TO_REPOSITORY" = "EXPORT_TO_REPOSITORY"
  inline val IMPORT_METADATA_FROM_REPOSITORY: "IMPORT_METADATA_FROM_REPOSITORY" = "IMPORT_METADATA_FROM_REPOSITORY"
  inline val RELEASE_DATA_FROM_FILESYSTEM: "RELEASE_DATA_FROM_FILESYSTEM" = "RELEASE_DATA_FROM_FILESYSTEM"
  inline val AUTO_RELEASE_DATA: "AUTO_RELEASE_DATA" = "AUTO_RELEASE_DATA"

  inline def values: js.Array[DataRepositoryTaskType] = js.Array(EXPORT_TO_REPOSITORY, IMPORT_METADATA_FROM_REPOSITORY, RELEASE_DATA_FROM_FILESYSTEM, AUTO_RELEASE_DATA)
}

type DeleteFileSystemOpenZFSOption = "DELETE_CHILD_VOLUMES_AND_SNAPSHOTS"
object DeleteFileSystemOpenZFSOption {
  inline val DELETE_CHILD_VOLUMES_AND_SNAPSHOTS: "DELETE_CHILD_VOLUMES_AND_SNAPSHOTS" = "DELETE_CHILD_VOLUMES_AND_SNAPSHOTS"

  inline def values: js.Array[DeleteFileSystemOpenZFSOption] = js.Array(DELETE_CHILD_VOLUMES_AND_SNAPSHOTS)
}

type DeleteOpenZFSVolumeOption = "DELETE_CHILD_VOLUMES_AND_SNAPSHOTS"
object DeleteOpenZFSVolumeOption {
  inline val DELETE_CHILD_VOLUMES_AND_SNAPSHOTS: "DELETE_CHILD_VOLUMES_AND_SNAPSHOTS" = "DELETE_CHILD_VOLUMES_AND_SNAPSHOTS"

  inline def values: js.Array[DeleteOpenZFSVolumeOption] = js.Array(DELETE_CHILD_VOLUMES_AND_SNAPSHOTS)
}

type DiskIopsConfigurationMode = "AUTOMATIC" | "USER_PROVISIONED"
object DiskIopsConfigurationMode {
  inline val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  inline val USER_PROVISIONED: "USER_PROVISIONED" = "USER_PROVISIONED"

  inline def values: js.Array[DiskIopsConfigurationMode] = js.Array(AUTOMATIC, USER_PROVISIONED)
}

type DriveCacheType = "NONE" | "READ"
object DriveCacheType {
  inline val NONE: "NONE" = "NONE"
  inline val READ: "READ" = "READ"

  inline def values: js.Array[DriveCacheType] = js.Array(NONE, READ)
}

type EventType = "NEW" | "CHANGED" | "DELETED"
object EventType {
  inline val NEW: "NEW" = "NEW"
  inline val CHANGED: "CHANGED" = "CHANGED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[EventType] = js.Array(NEW, CHANGED, DELETED)
}

type FileCacheLifecycle = "AVAILABLE" | "CREATING" | "DELETING" | "UPDATING" | "FAILED"
object FileCacheLifecycle {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[FileCacheLifecycle] = js.Array(AVAILABLE, CREATING, DELETING, UPDATING, FAILED)
}

type FileCacheLustreDeploymentType = "CACHE_1"
object FileCacheLustreDeploymentType {
  inline val CACHE_1: "CACHE_1" = "CACHE_1"

  inline def values: js.Array[FileCacheLustreDeploymentType] = js.Array(CACHE_1)
}

type FileCacheType = "LUSTRE"
object FileCacheType {
  inline val LUSTRE: "LUSTRE" = "LUSTRE"

  inline def values: js.Array[FileCacheType] = js.Array(LUSTRE)
}

/** The lifecycle status of the file system.
  */
type FileSystemLifecycle = "AVAILABLE" | "CREATING" | "FAILED" | "DELETING" | "MISCONFIGURED" | "UPDATING" | "MISCONFIGURED_UNAVAILABLE"
object FileSystemLifecycle {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val MISCONFIGURED: "MISCONFIGURED" = "MISCONFIGURED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val MISCONFIGURED_UNAVAILABLE: "MISCONFIGURED_UNAVAILABLE" = "MISCONFIGURED_UNAVAILABLE"

  inline def values: js.Array[FileSystemLifecycle] = js.Array(AVAILABLE, CREATING, FAILED, DELETING, MISCONFIGURED, UPDATING, MISCONFIGURED_UNAVAILABLE)
}

/** An enumeration specifying the currently ongoing maintenance operation.
  */
type FileSystemMaintenanceOperation = "PATCHING" | "BACKING_UP"
object FileSystemMaintenanceOperation {
  inline val PATCHING: "PATCHING" = "PATCHING"
  inline val BACKING_UP: "BACKING_UP" = "BACKING_UP"

  inline def values: js.Array[FileSystemMaintenanceOperation] = js.Array(PATCHING, BACKING_UP)
}

/** The type of file system.
  */
type FileSystemType = "WINDOWS" | "LUSTRE" | "ONTAP" | "OPENZFS"
object FileSystemType {
  inline val WINDOWS: "WINDOWS" = "WINDOWS"
  inline val LUSTRE: "LUSTRE" = "LUSTRE"
  inline val ONTAP: "ONTAP" = "ONTAP"
  inline val OPENZFS: "OPENZFS" = "OPENZFS"

  inline def values: js.Array[FileSystemType] = js.Array(WINDOWS, LUSTRE, ONTAP, OPENZFS)
}

/** The name for a filter.
  */
type FilterName = "file-system-id" | "backup-type" | "file-system-type" | "volume-id" | "data-repository-type" | "file-cache-id" | "file-cache-type"
object FilterName {
  inline val `file-system-id`: "file-system-id" = "file-system-id"
  inline val `backup-type`: "backup-type" = "backup-type"
  inline val `file-system-type`: "file-system-type" = "file-system-type"
  inline val `volume-id`: "volume-id" = "volume-id"
  inline val `data-repository-type`: "data-repository-type" = "data-repository-type"
  inline val `file-cache-id`: "file-cache-id" = "file-cache-id"
  inline val `file-cache-type`: "file-cache-type" = "file-cache-type"

  inline def values: js.Array[FilterName] = js.Array(`file-system-id`, `backup-type`, `file-system-type`, `volume-id`, `data-repository-type`, `file-cache-id`, `file-cache-type`)
}

type FlexCacheEndpointType = "NONE" | "ORIGIN" | "CACHE"
object FlexCacheEndpointType {
  inline val NONE: "NONE" = "NONE"
  inline val ORIGIN: "ORIGIN" = "ORIGIN"
  inline val CACHE: "CACHE" = "CACHE"

  inline def values: js.Array[FlexCacheEndpointType] = js.Array(NONE, ORIGIN, CACHE)
}

type InputOntapVolumeType = "RW" | "DP"
object InputOntapVolumeType {
  inline val RW: "RW" = "RW"
  inline val DP: "DP" = "DP"

  inline def values: js.Array[InputOntapVolumeType] = js.Array(RW, DP)
}

type LustreAccessAuditLogLevel = "DISABLED" | "WARN_ONLY" | "ERROR_ONLY" | "WARN_ERROR"
object LustreAccessAuditLogLevel {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val WARN_ONLY: "WARN_ONLY" = "WARN_ONLY"
  inline val ERROR_ONLY: "ERROR_ONLY" = "ERROR_ONLY"
  inline val WARN_ERROR: "WARN_ERROR" = "WARN_ERROR"

  inline def values: js.Array[LustreAccessAuditLogLevel] = js.Array(DISABLED, WARN_ONLY, ERROR_ONLY, WARN_ERROR)
}

type LustreDeploymentType = "SCRATCH_1" | "SCRATCH_2" | "PERSISTENT_1" | "PERSISTENT_2"
object LustreDeploymentType {
  inline val SCRATCH_1: "SCRATCH_1" = "SCRATCH_1"
  inline val SCRATCH_2: "SCRATCH_2" = "SCRATCH_2"
  inline val PERSISTENT_1: "PERSISTENT_1" = "PERSISTENT_1"
  inline val PERSISTENT_2: "PERSISTENT_2" = "PERSISTENT_2"

  inline def values: js.Array[LustreDeploymentType] = js.Array(SCRATCH_1, SCRATCH_2, PERSISTENT_1, PERSISTENT_2)
}

type NfsVersion = "NFS3"
object NfsVersion {
  inline val NFS3: "NFS3" = "NFS3"

  inline def values: js.Array[NfsVersion] = js.Array(NFS3)
}

type OntapDeploymentType = "MULTI_AZ_1" | "SINGLE_AZ_1"
object OntapDeploymentType {
  inline val MULTI_AZ_1: "MULTI_AZ_1" = "MULTI_AZ_1"
  inline val SINGLE_AZ_1: "SINGLE_AZ_1" = "SINGLE_AZ_1"

  inline def values: js.Array[OntapDeploymentType] = js.Array(MULTI_AZ_1, SINGLE_AZ_1)
}

type OntapVolumeType = "RW" | "DP" | "LS"
object OntapVolumeType {
  inline val RW: "RW" = "RW"
  inline val DP: "DP" = "DP"
  inline val LS: "LS" = "LS"

  inline def values: js.Array[OntapVolumeType] = js.Array(RW, DP, LS)
}

type OpenZFSCopyStrategy = "CLONE" | "FULL_COPY"
object OpenZFSCopyStrategy {
  inline val CLONE: "CLONE" = "CLONE"
  inline val FULL_COPY: "FULL_COPY" = "FULL_COPY"

  inline def values: js.Array[OpenZFSCopyStrategy] = js.Array(CLONE, FULL_COPY)
}

type OpenZFSDataCompressionType = "NONE" | "ZSTD" | "LZ4"
object OpenZFSDataCompressionType {
  inline val NONE: "NONE" = "NONE"
  inline val ZSTD: "ZSTD" = "ZSTD"
  inline val LZ4: "LZ4" = "LZ4"

  inline def values: js.Array[OpenZFSDataCompressionType] = js.Array(NONE, ZSTD, LZ4)
}

type OpenZFSDeploymentType = "SINGLE_AZ_1" | "SINGLE_AZ_2"
object OpenZFSDeploymentType {
  inline val SINGLE_AZ_1: "SINGLE_AZ_1" = "SINGLE_AZ_1"
  inline val SINGLE_AZ_2: "SINGLE_AZ_2" = "SINGLE_AZ_2"

  inline def values: js.Array[OpenZFSDeploymentType] = js.Array(SINGLE_AZ_1, SINGLE_AZ_2)
}

type OpenZFSQuotaType = "USER" | "GROUP"
object OpenZFSQuotaType {
  inline val USER: "USER" = "USER"
  inline val GROUP: "GROUP" = "GROUP"

  inline def values: js.Array[OpenZFSQuotaType] = js.Array(USER, GROUP)
}

type ReportFormat = "REPORT_CSV_20191124"
object ReportFormat {
  inline val REPORT_CSV_20191124: "REPORT_CSV_20191124" = "REPORT_CSV_20191124"

  inline def values: js.Array[ReportFormat] = js.Array(REPORT_CSV_20191124)
}

type ReportScope = "FAILED_FILES_ONLY"
object ReportScope {
  inline val FAILED_FILES_ONLY: "FAILED_FILES_ONLY" = "FAILED_FILES_ONLY"

  inline def values: js.Array[ReportScope] = js.Array(FAILED_FILES_ONLY)
}

type ResourceType = "FILE_SYSTEM" | "VOLUME"
object ResourceType {
  inline val FILE_SYSTEM: "FILE_SYSTEM" = "FILE_SYSTEM"
  inline val VOLUME: "VOLUME" = "VOLUME"

  inline def values: js.Array[ResourceType] = js.Array(FILE_SYSTEM, VOLUME)
}

type RestoreOpenZFSVolumeOption = "DELETE_INTERMEDIATE_SNAPSHOTS" | "DELETE_CLONED_VOLUMES"
object RestoreOpenZFSVolumeOption {
  inline val DELETE_INTERMEDIATE_SNAPSHOTS: "DELETE_INTERMEDIATE_SNAPSHOTS" = "DELETE_INTERMEDIATE_SNAPSHOTS"
  inline val DELETE_CLONED_VOLUMES: "DELETE_CLONED_VOLUMES" = "DELETE_CLONED_VOLUMES"

  inline def values: js.Array[RestoreOpenZFSVolumeOption] = js.Array(DELETE_INTERMEDIATE_SNAPSHOTS, DELETE_CLONED_VOLUMES)
}

type SecurityStyle = "UNIX" | "NTFS" | "MIXED"
object SecurityStyle {
  inline val UNIX: "UNIX" = "UNIX"
  inline val NTFS: "NTFS" = "NTFS"
  inline val MIXED: "MIXED" = "MIXED"

  inline def values: js.Array[SecurityStyle] = js.Array(UNIX, NTFS, MIXED)
}

type SnapshotFilterName = "file-system-id" | "volume-id"
object SnapshotFilterName {
  inline val `file-system-id`: "file-system-id" = "file-system-id"
  inline val `volume-id`: "volume-id" = "volume-id"

  inline def values: js.Array[SnapshotFilterName] = js.Array(`file-system-id`, `volume-id`)
}

type SnapshotLifecycle = "PENDING" | "CREATING" | "DELETING" | "AVAILABLE"
object SnapshotLifecycle {
  inline val PENDING: "PENDING" = "PENDING"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"

  inline def values: js.Array[SnapshotLifecycle] = js.Array(PENDING, CREATING, DELETING, AVAILABLE)
}

type Status = "FAILED" | "IN_PROGRESS" | "PENDING" | "COMPLETED" | "UPDATED_OPTIMIZING"
object Status {
  inline val FAILED: "FAILED" = "FAILED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val PENDING: "PENDING" = "PENDING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val UPDATED_OPTIMIZING: "UPDATED_OPTIMIZING" = "UPDATED_OPTIMIZING"

  inline def values: js.Array[Status] = js.Array(FAILED, IN_PROGRESS, PENDING, COMPLETED, UPDATED_OPTIMIZING)
}

/** The storage type for your Amazon FSx file system.
  */
type StorageType = "SSD" | "HDD"
object StorageType {
  inline val SSD: "SSD" = "SSD"
  inline val HDD: "HDD" = "HDD"

  inline def values: js.Array[StorageType] = js.Array(SSD, HDD)
}

type StorageVirtualMachineFilterName = "file-system-id"
object StorageVirtualMachineFilterName {
  inline val `file-system-id`: "file-system-id" = "file-system-id"

  inline def values: js.Array[StorageVirtualMachineFilterName] = js.Array(`file-system-id`)
}

type StorageVirtualMachineLifecycle = "CREATED" | "CREATING" | "DELETING" | "FAILED" | "MISCONFIGURED" | "PENDING"
object StorageVirtualMachineLifecycle {
  inline val CREATED: "CREATED" = "CREATED"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val MISCONFIGURED: "MISCONFIGURED" = "MISCONFIGURED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[StorageVirtualMachineLifecycle] = js.Array(CREATED, CREATING, DELETING, FAILED, MISCONFIGURED, PENDING)
}

type StorageVirtualMachineRootVolumeSecurityStyle = "UNIX" | "NTFS" | "MIXED"
object StorageVirtualMachineRootVolumeSecurityStyle {
  inline val UNIX: "UNIX" = "UNIX"
  inline val NTFS: "NTFS" = "NTFS"
  inline val MIXED: "MIXED" = "MIXED"

  inline def values: js.Array[StorageVirtualMachineRootVolumeSecurityStyle] = js.Array(UNIX, NTFS, MIXED)
}

type TieringPolicyName = "SNAPSHOT_ONLY" | "AUTO" | "ALL" | "NONE"
object TieringPolicyName {
  inline val SNAPSHOT_ONLY: "SNAPSHOT_ONLY" = "SNAPSHOT_ONLY"
  inline val AUTO: "AUTO" = "AUTO"
  inline val ALL: "ALL" = "ALL"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[TieringPolicyName] = js.Array(SNAPSHOT_ONLY, AUTO, ALL, NONE)
}

type VolumeFilterName = "file-system-id" | "storage-virtual-machine-id"
object VolumeFilterName {
  inline val `file-system-id`: "file-system-id" = "file-system-id"
  inline val `storage-virtual-machine-id`: "storage-virtual-machine-id" = "storage-virtual-machine-id"

  inline def values: js.Array[VolumeFilterName] = js.Array(`file-system-id`, `storage-virtual-machine-id`)
}

type VolumeLifecycle = "CREATING" | "CREATED" | "DELETING" | "FAILED" | "MISCONFIGURED" | "PENDING" | "AVAILABLE"
object VolumeLifecycle {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val MISCONFIGURED: "MISCONFIGURED" = "MISCONFIGURED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"

  inline def values: js.Array[VolumeLifecycle] = js.Array(CREATING, CREATED, DELETING, FAILED, MISCONFIGURED, PENDING, AVAILABLE)
}

type VolumeType = "ONTAP" | "OPENZFS"
object VolumeType {
  inline val ONTAP: "ONTAP" = "ONTAP"
  inline val OPENZFS: "OPENZFS" = "OPENZFS"

  inline def values: js.Array[VolumeType] = js.Array(ONTAP, OPENZFS)
}

type WindowsAccessAuditLogLevel = "DISABLED" | "SUCCESS_ONLY" | "FAILURE_ONLY" | "SUCCESS_AND_FAILURE"
object WindowsAccessAuditLogLevel {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val SUCCESS_ONLY: "SUCCESS_ONLY" = "SUCCESS_ONLY"
  inline val FAILURE_ONLY: "FAILURE_ONLY" = "FAILURE_ONLY"
  inline val SUCCESS_AND_FAILURE: "SUCCESS_AND_FAILURE" = "SUCCESS_AND_FAILURE"

  inline def values: js.Array[WindowsAccessAuditLogLevel] = js.Array(DISABLED, SUCCESS_ONLY, FAILURE_ONLY, SUCCESS_AND_FAILURE)
}

type WindowsDeploymentType = "MULTI_AZ_1" | "SINGLE_AZ_1" | "SINGLE_AZ_2"
object WindowsDeploymentType {
  inline val MULTI_AZ_1: "MULTI_AZ_1" = "MULTI_AZ_1"
  inline val SINGLE_AZ_1: "SINGLE_AZ_1" = "SINGLE_AZ_1"
  inline val SINGLE_AZ_2: "SINGLE_AZ_2" = "SINGLE_AZ_2"

  inline def values: js.Array[WindowsDeploymentType] = js.Array(MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2)
}
