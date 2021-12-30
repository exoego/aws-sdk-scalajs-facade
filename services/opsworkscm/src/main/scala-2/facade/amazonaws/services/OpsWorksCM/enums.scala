package facade.amazonaws.services.opsworkscm

import scalajs.js

@js.native
sealed trait BackupStatus extends js.Any
object BackupStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[BackupStatus]
  val OK = "OK".asInstanceOf[BackupStatus]
  val FAILED = "FAILED".asInstanceOf[BackupStatus]
  val DELETING = "DELETING".asInstanceOf[BackupStatus]

  @inline def values: js.Array[BackupStatus] = js.Array(IN_PROGRESS, OK, FAILED, DELETING)
}

@js.native
sealed trait BackupType extends js.Any
object BackupType {
  val AUTOMATED = "AUTOMATED".asInstanceOf[BackupType]
  val MANUAL = "MANUAL".asInstanceOf[BackupType]

  @inline def values: js.Array[BackupType] = js.Array(AUTOMATED, MANUAL)
}

@js.native
sealed trait MaintenanceStatus extends js.Any
object MaintenanceStatus {
  val SUCCESS = "SUCCESS".asInstanceOf[MaintenanceStatus]
  val FAILED = "FAILED".asInstanceOf[MaintenanceStatus]

  @inline def values: js.Array[MaintenanceStatus] = js.Array(SUCCESS, FAILED)
}

/** The status of the association or disassociation request. <p class="title"> ```Possible values:``` </p>* <code>SUCCESS</code>: The association or disassociation succeeded. * <code>FAILED</code>: The association or disassociation failed. * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
  */
@js.native
sealed trait NodeAssociationStatus extends js.Any
object NodeAssociationStatus {
  val SUCCESS = "SUCCESS".asInstanceOf[NodeAssociationStatus]
  val FAILED = "FAILED".asInstanceOf[NodeAssociationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[NodeAssociationStatus]

  @inline def values: js.Array[NodeAssociationStatus] = js.Array(SUCCESS, FAILED, IN_PROGRESS)
}

@js.native
sealed trait ServerStatus extends js.Any
object ServerStatus {
  val BACKING_UP = "BACKING_UP".asInstanceOf[ServerStatus]
  val CONNECTION_LOST = "CONNECTION_LOST".asInstanceOf[ServerStatus]
  val CREATING = "CREATING".asInstanceOf[ServerStatus]
  val DELETING = "DELETING".asInstanceOf[ServerStatus]
  val MODIFYING = "MODIFYING".asInstanceOf[ServerStatus]
  val FAILED = "FAILED".asInstanceOf[ServerStatus]
  val HEALTHY = "HEALTHY".asInstanceOf[ServerStatus]
  val RUNNING = "RUNNING".asInstanceOf[ServerStatus]
  val RESTORING = "RESTORING".asInstanceOf[ServerStatus]
  val SETUP = "SETUP".asInstanceOf[ServerStatus]
  val UNDER_MAINTENANCE = "UNDER_MAINTENANCE".asInstanceOf[ServerStatus]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[ServerStatus]
  val TERMINATED = "TERMINATED".asInstanceOf[ServerStatus]

  @inline def values: js.Array[ServerStatus] = js.Array(BACKING_UP, CONNECTION_LOST, CREATING, DELETING, MODIFYING, FAILED, HEALTHY, RUNNING, RESTORING, SETUP, UNDER_MAINTENANCE, UNHEALTHY, TERMINATED)
}
