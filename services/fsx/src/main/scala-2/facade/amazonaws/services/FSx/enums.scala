package facade.amazonaws.services.fsx

import scalajs._
import scala.scalajs.js.|

/** Describes the type of administrative action, as follows:
  * * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative action initiated by the user from the Amazon FSx console, API (UpdateFileSystem), or CLI (update-file-system).
  * * <code>STORAGE_OPTIMIZATION</code> - Once the <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task starts.
  * <li> For Windows, storage optimization is the process of migrating the file system data to the new, larger disks.
  * * For Lustre, storage optimization consists of rebalancing the data across the existing and newly added file servers.
  * You can track the storage optimization progress using the <code>ProgressPercent</code> property. When <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent <code>FILE_SYSTEM_UPDATE</code> action status changes to <code>COMPLETED</code>. For more information, see [[https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html|Managing storage capacity]] in the <i>Amazon FSx for Windows File Server User Guide</i> and [[https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html|Managing storage and throughput capacity]] in the <i>Amazon FSx for Lustre User Guide</i>.
  * </li> * <code>FILE_SYSTEM_ALIAS_ASSOCIATION</code> - A file system update to associate a new DNS alias with the file system. For more information, see .
  * * <code>FILE_SYSTEM_ALIAS_DISASSOCIATION</code> - A file system update to disassociate a DNS alias from the file system. For more information, see .
  */
@js.native
sealed trait AdministrativeActionType extends js.Any
object AdministrativeActionType {
  val FILE_SYSTEM_UPDATE = "FILE_SYSTEM_UPDATE".asInstanceOf[AdministrativeActionType]
  val STORAGE_OPTIMIZATION = "STORAGE_OPTIMIZATION".asInstanceOf[AdministrativeActionType]
  val FILE_SYSTEM_ALIAS_ASSOCIATION = "FILE_SYSTEM_ALIAS_ASSOCIATION".asInstanceOf[AdministrativeActionType]
  val FILE_SYSTEM_ALIAS_DISASSOCIATION = "FILE_SYSTEM_ALIAS_DISASSOCIATION".asInstanceOf[AdministrativeActionType]

  @inline def values = js.Array(FILE_SYSTEM_UPDATE, STORAGE_OPTIMIZATION, FILE_SYSTEM_ALIAS_ASSOCIATION, FILE_SYSTEM_ALIAS_DISASSOCIATION)
}

@js.native
sealed trait AliasLifecycle extends js.Any
object AliasLifecycle {
  val AVAILABLE = "AVAILABLE".asInstanceOf[AliasLifecycle]
  val CREATING = "CREATING".asInstanceOf[AliasLifecycle]
  val DELETING = "DELETING".asInstanceOf[AliasLifecycle]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[AliasLifecycle]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[AliasLifecycle]

  @inline def values = js.Array(AVAILABLE, CREATING, DELETING, CREATE_FAILED, DELETE_FAILED)
}

@js.native
sealed trait AutoImportPolicyType extends js.Any
object AutoImportPolicyType {
  val NONE = "NONE".asInstanceOf[AutoImportPolicyType]
  val NEW = "NEW".asInstanceOf[AutoImportPolicyType]
  val NEW_CHANGED = "NEW_CHANGED".asInstanceOf[AutoImportPolicyType]

  @inline def values = js.Array(NONE, NEW, NEW_CHANGED)
}

/** The lifecycle status of the backup.
  * * <code>AVAILABLE</code> - The backup is fully available.
  * * <code>PENDING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx has not started creating the backup.
  * * <code>CREATING</code> - Amazon FSx is creating the new user-intiated backup
  * * <code>TRANSFERRING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx is backing up the file system.
  * * <code>COPYING</code> - Amazon FSx is copying the backup.
  * * <code>DELETED</code> - Amazon FSx deleted the backup and it is no longer available.
  * * <code>FAILED</code> - Amazon FSx could not complete the backup.
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

  @inline def values = js.Array(AVAILABLE, CREATING, TRANSFERRING, DELETED, FAILED, PENDING, COPYING)
}

/** The type of the backup.
  */
@js.native
sealed trait BackupType extends js.Any
object BackupType {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[BackupType]
  val USER_INITIATED = "USER_INITIATED".asInstanceOf[BackupType]
  val AWS_BACKUP = "AWS_BACKUP".asInstanceOf[BackupType]

  @inline def values = js.Array(AUTOMATIC, USER_INITIATED, AWS_BACKUP)
}

@js.native
sealed trait DataRepositoryLifecycle extends js.Any
object DataRepositoryLifecycle {
  val CREATING = "CREATING".asInstanceOf[DataRepositoryLifecycle]
  val AVAILABLE = "AVAILABLE".asInstanceOf[DataRepositoryLifecycle]
  val MISCONFIGURED = "MISCONFIGURED".asInstanceOf[DataRepositoryLifecycle]
  val UPDATING = "UPDATING".asInstanceOf[DataRepositoryLifecycle]
  val DELETING = "DELETING".asInstanceOf[DataRepositoryLifecycle]

  @inline def values = js.Array(CREATING, AVAILABLE, MISCONFIGURED, UPDATING, DELETING)
}

@js.native
sealed trait DataRepositoryTaskFilterName extends js.Any
object DataRepositoryTaskFilterName {
  val `file-system-id` = "file-system-id".asInstanceOf[DataRepositoryTaskFilterName]
  val `task-lifecycle` = "task-lifecycle".asInstanceOf[DataRepositoryTaskFilterName]

  @inline def values = js.Array(`file-system-id`, `task-lifecycle`)
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

  @inline def values = js.Array(PENDING, EXECUTING, FAILED, SUCCEEDED, CANCELED, CANCELING)
}

@js.native
sealed trait DataRepositoryTaskType extends js.Any
object DataRepositoryTaskType {
  val EXPORT_TO_REPOSITORY = "EXPORT_TO_REPOSITORY".asInstanceOf[DataRepositoryTaskType]

  @inline def values = js.Array(EXPORT_TO_REPOSITORY)
}

@js.native
sealed trait DriveCacheType extends js.Any
object DriveCacheType {
  val NONE = "NONE".asInstanceOf[DriveCacheType]
  val READ = "READ".asInstanceOf[DriveCacheType]

  @inline def values = js.Array(NONE, READ)
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

  @inline def values = js.Array(AVAILABLE, CREATING, FAILED, DELETING, MISCONFIGURED, UPDATING)
}

/** An enumeration specifying the currently ongoing maintenance operation.
  */
@js.native
sealed trait FileSystemMaintenanceOperation extends js.Any
object FileSystemMaintenanceOperation {
  val PATCHING = "PATCHING".asInstanceOf[FileSystemMaintenanceOperation]
  val BACKING_UP = "BACKING_UP".asInstanceOf[FileSystemMaintenanceOperation]

  @inline def values = js.Array(PATCHING, BACKING_UP)
}

/** The type of file system.
  */
@js.native
sealed trait FileSystemType extends js.Any
object FileSystemType {
  val WINDOWS = "WINDOWS".asInstanceOf[FileSystemType]
  val LUSTRE = "LUSTRE".asInstanceOf[FileSystemType]

  @inline def values = js.Array(WINDOWS, LUSTRE)
}

/** The name for a filter.
  */
@js.native
sealed trait FilterName extends js.Any
object FilterName {
  val `file-system-id` = "file-system-id".asInstanceOf[FilterName]
  val `backup-type` = "backup-type".asInstanceOf[FilterName]
  val `file-system-type` = "file-system-type".asInstanceOf[FilterName]

  @inline def values = js.Array(`file-system-id`, `backup-type`, `file-system-type`)
}

@js.native
sealed trait LustreDeploymentType extends js.Any
object LustreDeploymentType {
  val SCRATCH_1 = "SCRATCH_1".asInstanceOf[LustreDeploymentType]
  val SCRATCH_2 = "SCRATCH_2".asInstanceOf[LustreDeploymentType]
  val PERSISTENT_1 = "PERSISTENT_1".asInstanceOf[LustreDeploymentType]

  @inline def values = js.Array(SCRATCH_1, SCRATCH_2, PERSISTENT_1)
}

@js.native
sealed trait ReportFormat extends js.Any
object ReportFormat {
  val REPORT_CSV_20191124 = "REPORT_CSV_20191124".asInstanceOf[ReportFormat]

  @inline def values = js.Array(REPORT_CSV_20191124)
}

@js.native
sealed trait ReportScope extends js.Any
object ReportScope {
  val FAILED_FILES_ONLY = "FAILED_FILES_ONLY".asInstanceOf[ReportScope]

  @inline def values = js.Array(FAILED_FILES_ONLY)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val FAILED = "FAILED".asInstanceOf[Status]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[Status]
  val PENDING = "PENDING".asInstanceOf[Status]
  val COMPLETED = "COMPLETED".asInstanceOf[Status]
  val UPDATED_OPTIMIZING = "UPDATED_OPTIMIZING".asInstanceOf[Status]

  @inline def values = js.Array(FAILED, IN_PROGRESS, PENDING, COMPLETED, UPDATED_OPTIMIZING)
}

/** The storage type for your Amazon FSx file system.
  */
@js.native
sealed trait StorageType extends js.Any
object StorageType {
  val SSD = "SSD".asInstanceOf[StorageType]
  val HDD = "HDD".asInstanceOf[StorageType]

  @inline def values = js.Array(SSD, HDD)
}

@js.native
sealed trait WindowsDeploymentType extends js.Any
object WindowsDeploymentType {
  val MULTI_AZ_1 = "MULTI_AZ_1".asInstanceOf[WindowsDeploymentType]
  val SINGLE_AZ_1 = "SINGLE_AZ_1".asInstanceOf[WindowsDeploymentType]
  val SINGLE_AZ_2 = "SINGLE_AZ_2".asInstanceOf[WindowsDeploymentType]

  @inline def values = js.Array(MULTI_AZ_1, SINGLE_AZ_1, SINGLE_AZ_2)
}

