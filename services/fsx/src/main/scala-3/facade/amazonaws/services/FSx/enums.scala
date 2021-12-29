package facade.amazonaws.services.fsx

import scalajs._

/** Describes the type of administrative action, as follows: * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative action initiated by the user from the Amazon FSx console, API (UpdateFileSystem), or CLI (update-file-system). * <code>STORAGE_OPTIMIZATION</code> - Once the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task starts. <li> For Windows, storage optimization is the process of migrating the file system data to the new, larger disks. * For Lustre, storage optimization consists of rebalancing the data across the existing and newly added file servers. You can track the storage optimization progress using the <code>ProgressPercent</code> property. When <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent <code>FILE_SYSTEM_UPDATE</code> action status changes to <code>COMPLETED</code>. For more information, see
  * [[https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html|Managing storage capacity]] in the <i>Amazon FSx for Windows File Server User Guide</i> and [[https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html|Managing storage and throughput capacity]] in the <i>Amazon FSx for Lustre User Guide</i>. </li> * <code>FILE_SYSTEM_ALIAS_ASSOCIATION</code> - A file system update to associate a new DNS alias with the file system. For more information, see . * <code>FILE_SYSTEM_ALIAS_DISASSOCIATION</code> - A file system update to disassociate a DNS alias from the file system. For more information, see .
  */
type AdministrativeActionType = "FILE_SYSTEM_UPDATE" | "STORAGE_OPTIMIZATION" | "FILE_SYSTEM_ALIAS_ASSOCIATION" | "FILE_SYSTEM_ALIAS_DISASSOCIATION"
object AdministrativeActionType {
  inline val FILE_SYSTEM_UPDATE: "FILE_SYSTEM_UPDATE" = "FILE_SYSTEM_UPDATE"
  inline val STORAGE_OPTIMIZATION: "STORAGE_OPTIMIZATION" = "STORAGE_OPTIMIZATION"
  inline val FILE_SYSTEM_ALIAS_ASSOCIATION: "FILE_SYSTEM_ALIAS_ASSOCIATION" = "FILE_SYSTEM_ALIAS_ASSOCIATION"
  inline val FILE_SYSTEM_ALIAS_DISASSOCIATION: "FILE_SYSTEM_ALIAS_DISASSOCIATION" = "FILE_SYSTEM_ALIAS_DISASSOCIATION"

  inline def values: js.Array[AdministrativeActionType] = js.Array(FILE_SYSTEM_UPDATE, STORAGE_OPTIMIZATION, FILE_SYSTEM_ALIAS_ASSOCIATION, FILE_SYSTEM_ALIAS_DISASSOCIATION)
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

type AutoImportPolicyType = "NONE" | "NEW" | "NEW_CHANGED"
object AutoImportPolicyType {
  inline val NONE: "NONE" = "NONE"
  inline val NEW: "NEW" = "NEW"
  inline val NEW_CHANGED: "NEW_CHANGED" = "NEW_CHANGED"

  inline def values: js.Array[AutoImportPolicyType] = js.Array(NONE, NEW, NEW_CHANGED)
}

/** The lifecycle status of the backup. * <code>AVAILABLE</code> - The backup is fully available. * <code>PENDING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx has not started creating the backup. * <code>CREATING</code> - Amazon FSx is creating the new user-intiated backup * <code>TRANSFERRING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx is backing up the file system. * <code>COPYING</code> - Amazon FSx is copying the backup. * <code>DELETED</code> - Amazon FSx deleted the backup and it is no longer available. * <code>FAILED</code> - Amazon FSx could not complete the backup.
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

type DataRepositoryLifecycle = "CREATING" | "AVAILABLE" | "MISCONFIGURED" | "UPDATING" | "DELETING"
object DataRepositoryLifecycle {
  inline val CREATING: "CREATING" = "CREATING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val MISCONFIGURED: "MISCONFIGURED" = "MISCONFIGURED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[DataRepositoryLifecycle] = js.Array(CREATING, AVAILABLE, MISCONFIGURED, UPDATING, DELETING)
}

type DataRepositoryTaskFilterName = "file-system-id" | "task-lifecycle"
object DataRepositoryTaskFilterName {
  inline val `file-system-id`: "file-system-id" = "file-system-id"
  inline val `task-lifecycle`: "task-lifecycle" = "task-lifecycle"

  inline def values: js.Array[DataRepositoryTaskFilterName] = js.Array(`file-system-id`, `task-lifecycle`)
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

type DataRepositoryTaskType = "EXPORT_TO_REPOSITORY"
object DataRepositoryTaskType {
  inline val EXPORT_TO_REPOSITORY: "EXPORT_TO_REPOSITORY" = "EXPORT_TO_REPOSITORY"

  inline def values: js.Array[DataRepositoryTaskType] = js.Array(EXPORT_TO_REPOSITORY)
}

type DriveCacheType = "NONE" | "READ"
object DriveCacheType {
  inline val NONE: "NONE" = "NONE"
  inline val READ: "READ" = "READ"

  inline def values: js.Array[DriveCacheType] = js.Array(NONE, READ)
}

/** The lifecycle status of the file system.
  */
type FileSystemLifecycle = "AVAILABLE" | "CREATING" | "FAILED" | "DELETING" | "MISCONFIGURED" | "UPDATING"
object FileSystemLifecycle {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val MISCONFIGURED: "MISCONFIGURED" = "MISCONFIGURED"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[FileSystemLifecycle] = js.Array(AVAILABLE, CREATING, FAILED, DELETING, MISCONFIGURED, UPDATING)
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
type FileSystemType = "WINDOWS" | "LUSTRE"
object FileSystemType {
  inline val WINDOWS: "WINDOWS" = "WINDOWS"
  inline val LUSTRE: "LUSTRE" = "LUSTRE"

  inline def values: js.Array[FileSystemType] = js.Array(WINDOWS, LUSTRE)
}

/** The name for a filter.
  */
type FilterName = "file-system-id" | "backup-type" | "file-system-type"
object FilterName {
  inline val `file-system-id`: "file-system-id" = "file-system-id"
  inline val `backup-type`: "backup-type" = "backup-type"
  inline val `file-system-type`: "file-system-type" = "file-system-type"

  inline def values: js.Array[FilterName] = js.Array(`file-system-id`, `backup-type`, `file-system-type`)
}

type LustreDeploymentType = "SCRATCH_1" | "SCRATCH_2" | "PERSISTENT_1"
object LustreDeploymentType {
  inline val SCRATCH_1: "SCRATCH_1" = "SCRATCH_1"
  inline val SCRATCH_2: "SCRATCH_2" = "SCRATCH_2"
  inline val PERSISTENT_1: "PERSISTENT_1" = "PERSISTENT_1"

  inline def values: js.Array[LustreDeploymentType] = js.Array(SCRATCH_1, SCRATCH_2, PERSISTENT_1)
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

type WindowsDeploymentType = "MULTI_AZ_1" | "SINGLE_AZ_1" | "SINGLE_AZ_2"
object WindowsDeploymentType {
  inline val MULTI_AZ_1: "MULTI_AZ_1" = "MULTI_AZ_1"
  inline val SINGLE_AZ_1: "SINGLE_AZ_1" = "SINGLE_AZ_1"
  inline val SINGLE_AZ_2: "SINGLE_AZ_2" = "SINGLE_AZ_2"

  inline def values: js.Array[WindowsDeploymentType] = js.Array(MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2)
}
