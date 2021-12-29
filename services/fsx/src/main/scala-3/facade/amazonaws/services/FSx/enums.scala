package facade.amazonaws.services.fsx

import scalajs._

/** Describes the type of administrative action, as follows: * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative action initiated by the user from the Amazon FSx console, API (UpdateFileSystem), or CLI (update-file-system). * <code>STORAGE_OPTIMIZATION</code> - Once the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task starts. <li> For Windows, storage optimization is the process of migrating the file system data to the new, larger disks. * For Lustre, storage optimization consists of rebalancing the data across the existing and newly added file servers. You can track the storage optimization progress using the <code>ProgressPercent</code> property. When <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent <code>FILE_SYSTEM_UPDATE</code> action status changes to <code>COMPLETED</code>. For more information, see
  * [[https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html|Managing storage capacity]] in the <i>Amazon FSx for Windows File Server User Guide</i> and [[https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html|Managing storage and throughput capacity]] in the <i>Amazon FSx for Lustre User Guide</i>. </li> * <code>FILE_SYSTEM_ALIAS_ASSOCIATION</code> - A file system update to associate a new DNS alias with the file system. For more information, see . * <code>FILE_SYSTEM_ALIAS_DISASSOCIATION</code> - A file system update to disassociate a DNS alias from the file system. For more information, see .
  */
type AdministrativeActionType = "FILE_SYSTEM_UPDATE" | "STORAGE_OPTIMIZATION" | "FILE_SYSTEM_ALIAS_ASSOCIATION" | "FILE_SYSTEM_ALIAS_DISASSOCIATION"
object AdministrativeActionType {
  val FILE_SYSTEM_UPDATE: "FILE_SYSTEM_UPDATE" = "FILE_SYSTEM_UPDATE"
  val STORAGE_OPTIMIZATION: "STORAGE_OPTIMIZATION" = "STORAGE_OPTIMIZATION"
  val FILE_SYSTEM_ALIAS_ASSOCIATION: "FILE_SYSTEM_ALIAS_ASSOCIATION" = "FILE_SYSTEM_ALIAS_ASSOCIATION"
  val FILE_SYSTEM_ALIAS_DISASSOCIATION: "FILE_SYSTEM_ALIAS_DISASSOCIATION" = "FILE_SYSTEM_ALIAS_DISASSOCIATION"

  @inline def values = js.Array[AdministrativeActionType](FILE_SYSTEM_UPDATE, STORAGE_OPTIMIZATION, FILE_SYSTEM_ALIAS_ASSOCIATION, FILE_SYSTEM_ALIAS_DISASSOCIATION)
}

type AliasLifecycle = "AVAILABLE" | "CREATING" | "DELETING" | "CREATE_FAILED" | "DELETE_FAILED"
object AliasLifecycle {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  @inline def values = js.Array[AliasLifecycle](AVAILABLE, CREATING, DELETING, CREATE_FAILED, DELETE_FAILED)
}

type AutoImportPolicyType = "NONE" | "NEW" | "NEW_CHANGED"
object AutoImportPolicyType {
  val NONE: "NONE" = "NONE"
  val NEW: "NEW" = "NEW"
  val NEW_CHANGED: "NEW_CHANGED" = "NEW_CHANGED"

  @inline def values = js.Array[AutoImportPolicyType](NONE, NEW, NEW_CHANGED)
}

/** The lifecycle status of the backup. * <code>AVAILABLE</code> - The backup is fully available. * <code>PENDING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx has not started creating the backup. * <code>CREATING</code> - Amazon FSx is creating the new user-intiated backup * <code>TRANSFERRING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx is backing up the file system. * <code>COPYING</code> - Amazon FSx is copying the backup. * <code>DELETED</code> - Amazon FSx deleted the backup and it is no longer available. * <code>FAILED</code> - Amazon FSx could not complete the backup.
  */
type BackupLifecycle = "AVAILABLE" | "CREATING" | "TRANSFERRING" | "DELETED" | "FAILED" | "PENDING" | "COPYING"
object BackupLifecycle {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val CREATING: "CREATING" = "CREATING"
  val TRANSFERRING: "TRANSFERRING" = "TRANSFERRING"
  val DELETED: "DELETED" = "DELETED"
  val FAILED: "FAILED" = "FAILED"
  val PENDING: "PENDING" = "PENDING"
  val COPYING: "COPYING" = "COPYING"

  @inline def values = js.Array[BackupLifecycle](AVAILABLE, CREATING, TRANSFERRING, DELETED, FAILED, PENDING, COPYING)
}

/** The type of the backup.
  */
type BackupType = "AUTOMATIC" | "USER_INITIATED" | "AWS_BACKUP"
object BackupType {
  val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  val USER_INITIATED: "USER_INITIATED" = "USER_INITIATED"
  val AWS_BACKUP: "AWS_BACKUP" = "AWS_BACKUP"

  @inline def values = js.Array[BackupType](AUTOMATIC, USER_INITIATED, AWS_BACKUP)
}

type DataRepositoryLifecycle = "CREATING" | "AVAILABLE" | "MISCONFIGURED" | "UPDATING" | "DELETING"
object DataRepositoryLifecycle {
  val CREATING: "CREATING" = "CREATING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val MISCONFIGURED: "MISCONFIGURED" = "MISCONFIGURED"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[DataRepositoryLifecycle](CREATING, AVAILABLE, MISCONFIGURED, UPDATING, DELETING)
}

type DataRepositoryTaskFilterName = "file-system-id" | "task-lifecycle"
object DataRepositoryTaskFilterName {
  val `file-system-id`: "file-system-id" = "file-system-id"
  val `task-lifecycle`: "task-lifecycle" = "task-lifecycle"

  @inline def values = js.Array[DataRepositoryTaskFilterName](`file-system-id`, `task-lifecycle`)
}

type DataRepositoryTaskLifecycle = "PENDING" | "EXECUTING" | "FAILED" | "SUCCEEDED" | "CANCELED" | "CANCELING"
object DataRepositoryTaskLifecycle {
  val PENDING: "PENDING" = "PENDING"
  val EXECUTING: "EXECUTING" = "EXECUTING"
  val FAILED: "FAILED" = "FAILED"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val CANCELED: "CANCELED" = "CANCELED"
  val CANCELING: "CANCELING" = "CANCELING"

  @inline def values = js.Array[DataRepositoryTaskLifecycle](PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED, CANCELING)
}

type DataRepositoryTaskType = "EXPORT_TO_REPOSITORY"
object DataRepositoryTaskType {
  val EXPORT_TO_REPOSITORY: "EXPORT_TO_REPOSITORY" = "EXPORT_TO_REPOSITORY"

  @inline def values = js.Array[DataRepositoryTaskType](EXPORT_TO_REPOSITORY)
}

type DriveCacheType = "NONE" | "READ"
object DriveCacheType {
  val NONE: "NONE" = "NONE"
  val READ: "READ" = "READ"

  @inline def values = js.Array[DriveCacheType](NONE, READ)
}

/** The lifecycle status of the file system.
  */
type FileSystemLifecycle = "AVAILABLE" | "CREATING" | "FAILED" | "DELETING" | "MISCONFIGURED" | "UPDATING"
object FileSystemLifecycle {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val CREATING: "CREATING" = "CREATING"
  val FAILED: "FAILED" = "FAILED"
  val DELETING: "DELETING" = "DELETING"
  val MISCONFIGURED: "MISCONFIGURED" = "MISCONFIGURED"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[FileSystemLifecycle](AVAILABLE, CREATING, FAILED, DELETING, MISCONFIGURED, UPDATING)
}

/** An enumeration specifying the currently ongoing maintenance operation.
  */
type FileSystemMaintenanceOperation = "PATCHING" | "BACKING_UP"
object FileSystemMaintenanceOperation {
  val PATCHING: "PATCHING" = "PATCHING"
  val BACKING_UP: "BACKING_UP" = "BACKING_UP"

  @inline def values = js.Array[FileSystemMaintenanceOperation](PATCHING, BACKING_UP)
}

/** The type of file system.
  */
type FileSystemType = "WINDOWS" | "LUSTRE"
object FileSystemType {
  val WINDOWS: "WINDOWS" = "WINDOWS"
  val LUSTRE: "LUSTRE" = "LUSTRE"

  @inline def values = js.Array[FileSystemType](WINDOWS, LUSTRE)
}

/** The name for a filter.
  */
type FilterName = "file-system-id" | "backup-type" | "file-system-type"
object FilterName {
  val `file-system-id`: "file-system-id" = "file-system-id"
  val `backup-type`: "backup-type" = "backup-type"
  val `file-system-type`: "file-system-type" = "file-system-type"

  @inline def values = js.Array[FilterName](`file-system-id`, `backup-type`, `file-system-type`)
}

type LustreDeploymentType = "SCRATCH_1" | "SCRATCH_2" | "PERSISTENT_1"
object LustreDeploymentType {
  val SCRATCH_1: "SCRATCH_1" = "SCRATCH_1"
  val SCRATCH_2: "SCRATCH_2" = "SCRATCH_2"
  val PERSISTENT_1: "PERSISTENT_1" = "PERSISTENT_1"

  @inline def values = js.Array[LustreDeploymentType](SCRATCH_1, SCRATCH_2, PERSISTENT_1)
}

type ReportFormat = "REPORT_CSV_20191124"
object ReportFormat {
  val REPORT_CSV_20191124: "REPORT_CSV_20191124" = "REPORT_CSV_20191124"

  @inline def values = js.Array[ReportFormat](REPORT_CSV_20191124)
}

type ReportScope = "FAILED_FILES_ONLY"
object ReportScope {
  val FAILED_FILES_ONLY: "FAILED_FILES_ONLY" = "FAILED_FILES_ONLY"

  @inline def values = js.Array[ReportScope](FAILED_FILES_ONLY)
}

type Status = "FAILED" | "IN_PROGRESS" | "PENDING" | "COMPLETED" | "UPDATED_OPTIMIZING"
object Status {
  val FAILED: "FAILED" = "FAILED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val PENDING: "PENDING" = "PENDING"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val UPDATED_OPTIMIZING: "UPDATED_OPTIMIZING" = "UPDATED_OPTIMIZING"

  @inline def values = js.Array[Status](FAILED, IN_PROGRESS, PENDING, COMPLETED, UPDATED_OPTIMIZING)
}

/** The storage type for your Amazon FSx file system.
  */
type StorageType = "SSD" | "HDD"
object StorageType {
  val SSD: "SSD" = "SSD"
  val HDD: "HDD" = "HDD"

  @inline def values = js.Array[StorageType](SSD, HDD)
}

type WindowsDeploymentType = "MULTI_AZ_1" | "SINGLE_AZ_1" | "SINGLE_AZ_2"
object WindowsDeploymentType {
  val MULTI_AZ_1: "MULTI_AZ_1" = "MULTI_AZ_1"
  val SINGLE_AZ_1: "SINGLE_AZ_1" = "SINGLE_AZ_1"
  val SINGLE_AZ_2: "SINGLE_AZ_2" = "SINGLE_AZ_2"

  @inline def values = js.Array[WindowsDeploymentType](MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2)
}
