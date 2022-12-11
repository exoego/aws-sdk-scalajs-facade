package facade.amazonaws.services.backup

import scalajs.js

@js.native
sealed trait BackupJobState extends js.Any
object BackupJobState {
  val CREATED = "CREATED".asInstanceOf[BackupJobState]
  val PENDING = "PENDING".asInstanceOf[BackupJobState]
  val RUNNING = "RUNNING".asInstanceOf[BackupJobState]
  val ABORTING = "ABORTING".asInstanceOf[BackupJobState]
  val ABORTED = "ABORTED".asInstanceOf[BackupJobState]
  val COMPLETED = "COMPLETED".asInstanceOf[BackupJobState]
  val FAILED = "FAILED".asInstanceOf[BackupJobState]
  val EXPIRED = "EXPIRED".asInstanceOf[BackupJobState]
  val PARTIAL = "PARTIAL".asInstanceOf[BackupJobState]

  @inline def values: js.Array[BackupJobState] = js.Array(CREATED, PENDING, RUNNING, ABORTING, ABORTED, COMPLETED, FAILED, EXPIRED, PARTIAL)
}

@js.native
sealed trait BackupVaultEvent extends js.Any
object BackupVaultEvent {
  val BACKUP_JOB_STARTED = "BACKUP_JOB_STARTED".asInstanceOf[BackupVaultEvent]
  val BACKUP_JOB_COMPLETED = "BACKUP_JOB_COMPLETED".asInstanceOf[BackupVaultEvent]
  val BACKUP_JOB_SUCCESSFUL = "BACKUP_JOB_SUCCESSFUL".asInstanceOf[BackupVaultEvent]
  val BACKUP_JOB_FAILED = "BACKUP_JOB_FAILED".asInstanceOf[BackupVaultEvent]
  val BACKUP_JOB_EXPIRED = "BACKUP_JOB_EXPIRED".asInstanceOf[BackupVaultEvent]
  val RESTORE_JOB_STARTED = "RESTORE_JOB_STARTED".asInstanceOf[BackupVaultEvent]
  val RESTORE_JOB_COMPLETED = "RESTORE_JOB_COMPLETED".asInstanceOf[BackupVaultEvent]
  val RESTORE_JOB_SUCCESSFUL = "RESTORE_JOB_SUCCESSFUL".asInstanceOf[BackupVaultEvent]
  val RESTORE_JOB_FAILED = "RESTORE_JOB_FAILED".asInstanceOf[BackupVaultEvent]
  val COPY_JOB_STARTED = "COPY_JOB_STARTED".asInstanceOf[BackupVaultEvent]
  val COPY_JOB_SUCCESSFUL = "COPY_JOB_SUCCESSFUL".asInstanceOf[BackupVaultEvent]
  val COPY_JOB_FAILED = "COPY_JOB_FAILED".asInstanceOf[BackupVaultEvent]
  val RECOVERY_POINT_MODIFIED = "RECOVERY_POINT_MODIFIED".asInstanceOf[BackupVaultEvent]
  val BACKUP_PLAN_CREATED = "BACKUP_PLAN_CREATED".asInstanceOf[BackupVaultEvent]
  val BACKUP_PLAN_MODIFIED = "BACKUP_PLAN_MODIFIED".asInstanceOf[BackupVaultEvent]
  val S3_BACKUP_OBJECT_FAILED = "S3_BACKUP_OBJECT_FAILED".asInstanceOf[BackupVaultEvent]
  val S3_RESTORE_OBJECT_FAILED = "S3_RESTORE_OBJECT_FAILED".asInstanceOf[BackupVaultEvent]

  @inline def values: js.Array[BackupVaultEvent] = js.Array(
    BACKUP_JOB_STARTED,
    BACKUP_JOB_COMPLETED,
    BACKUP_JOB_SUCCESSFUL,
    BACKUP_JOB_FAILED,
    BACKUP_JOB_EXPIRED,
    RESTORE_JOB_STARTED,
    RESTORE_JOB_COMPLETED,
    RESTORE_JOB_SUCCESSFUL,
    RESTORE_JOB_FAILED,
    COPY_JOB_STARTED,
    COPY_JOB_SUCCESSFUL,
    COPY_JOB_FAILED,
    RECOVERY_POINT_MODIFIED,
    BACKUP_PLAN_CREATED,
    BACKUP_PLAN_MODIFIED,
    S3_BACKUP_OBJECT_FAILED,
    S3_RESTORE_OBJECT_FAILED
  )
}

@js.native
sealed trait ConditionType extends js.Any
object ConditionType {
  val STRINGEQUALS = "STRINGEQUALS".asInstanceOf[ConditionType]

  @inline def values: js.Array[ConditionType] = js.Array(STRINGEQUALS)
}

@js.native
sealed trait CopyJobState extends js.Any
object CopyJobState {
  val CREATED = "CREATED".asInstanceOf[CopyJobState]
  val RUNNING = "RUNNING".asInstanceOf[CopyJobState]
  val COMPLETED = "COMPLETED".asInstanceOf[CopyJobState]
  val FAILED = "FAILED".asInstanceOf[CopyJobState]
  val PARTIAL = "PARTIAL".asInstanceOf[CopyJobState]

  @inline def values: js.Array[CopyJobState] = js.Array(CREATED, RUNNING, COMPLETED, FAILED, PARTIAL)
}

@js.native
sealed trait LegalHoldStatus extends js.Any
object LegalHoldStatus {
  val CREATING = "CREATING".asInstanceOf[LegalHoldStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[LegalHoldStatus]
  val CANCELING = "CANCELING".asInstanceOf[LegalHoldStatus]
  val CANCELED = "CANCELED".asInstanceOf[LegalHoldStatus]

  @inline def values: js.Array[LegalHoldStatus] = js.Array(CREATING, ACTIVE, CANCELING, CANCELED)
}

@js.native
sealed trait RecoveryPointStatus extends js.Any
object RecoveryPointStatus {
  val COMPLETED = "COMPLETED".asInstanceOf[RecoveryPointStatus]
  val PARTIAL = "PARTIAL".asInstanceOf[RecoveryPointStatus]
  val DELETING = "DELETING".asInstanceOf[RecoveryPointStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[RecoveryPointStatus]

  @inline def values: js.Array[RecoveryPointStatus] = js.Array(COMPLETED, PARTIAL, DELETING, EXPIRED)
}

@js.native
sealed trait RestoreJobStatus extends js.Any
object RestoreJobStatus {
  val PENDING = "PENDING".asInstanceOf[RestoreJobStatus]
  val RUNNING = "RUNNING".asInstanceOf[RestoreJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[RestoreJobStatus]
  val ABORTED = "ABORTED".asInstanceOf[RestoreJobStatus]
  val FAILED = "FAILED".asInstanceOf[RestoreJobStatus]

  @inline def values: js.Array[RestoreJobStatus] = js.Array(PENDING, RUNNING, COMPLETED, ABORTED, FAILED)
}

@js.native
sealed trait StorageClass extends js.Any
object StorageClass {
  val WARM = "WARM".asInstanceOf[StorageClass]
  val COLD = "COLD".asInstanceOf[StorageClass]
  val DELETED = "DELETED".asInstanceOf[StorageClass]

  @inline def values: js.Array[StorageClass] = js.Array(WARM, COLD, DELETED)
}
