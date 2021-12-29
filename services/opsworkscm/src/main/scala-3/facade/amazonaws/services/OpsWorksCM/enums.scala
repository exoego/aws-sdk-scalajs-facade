package facade.amazonaws.services.opsworkscm

import scalajs._

type BackupStatus = "IN_PROGRESS" | "OK" | "FAILED" | "DELETING"
object BackupStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val OK: "OK" = "OK"
  val FAILED: "FAILED" = "FAILED"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[BackupStatus](IN_PROGRESS, OK, FAILED, DELETING)
}

type BackupType = "AUTOMATED" | "MANUAL"
object BackupType {
  val AUTOMATED: "AUTOMATED" = "AUTOMATED"
  val MANUAL: "MANUAL" = "MANUAL"

  @inline def values = js.Array[BackupType](AUTOMATED, MANUAL)
}

type MaintenanceStatus = "SUCCESS" | "FAILED"
object MaintenanceStatus {
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[MaintenanceStatus](SUCCESS, FAILED)
}

/** The status of the association or disassociation request. <p class="title"> ```Possible values:``` </p>* <code>SUCCESS</code>: The association or disassociation succeeded. * <code>FAILED</code>: The association or disassociation failed. * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
  */
type NodeAssociationStatus = "SUCCESS" | "FAILED" | "IN_PROGRESS"
object NodeAssociationStatus {
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  @inline def values = js.Array[NodeAssociationStatus](SUCCESS, FAILED, IN_PROGRESS)
}

type ServerStatus = "BACKING_UP" | "CONNECTION_LOST" | "CREATING" | "DELETING" | "MODIFYING" | "FAILED" | "HEALTHY" | "RUNNING" | "RESTORING" | "SETUP" | "UNDER_MAINTENANCE" | "UNHEALTHY" | "TERMINATED"
object ServerStatus {
  val BACKING_UP: "BACKING_UP" = "BACKING_UP"
  val CONNECTION_LOST: "CONNECTION_LOST" = "CONNECTION_LOST"
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val MODIFYING: "MODIFYING" = "MODIFYING"
  val FAILED: "FAILED" = "FAILED"
  val HEALTHY: "HEALTHY" = "HEALTHY"
  val RUNNING: "RUNNING" = "RUNNING"
  val RESTORING: "RESTORING" = "RESTORING"
  val SETUP: "SETUP" = "SETUP"
  val UNDER_MAINTENANCE: "UNDER_MAINTENANCE" = "UNDER_MAINTENANCE"
  val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  val TERMINATED: "TERMINATED" = "TERMINATED"

  @inline def values = js.Array[ServerStatus](BACKING_UP, CONNECTION_LOST, CREATING, DELETING, MODIFYING, FAILED, HEALTHY, RUNNING, RESTORING, SETUP, UNDER_MAINTENANCE, UNHEALTHY, TERMINATED)
}
