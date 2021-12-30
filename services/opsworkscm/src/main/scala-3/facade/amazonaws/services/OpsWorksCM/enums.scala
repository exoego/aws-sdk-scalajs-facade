package facade.amazonaws.services.opsworkscm

import scalajs.js

type BackupStatus = "IN_PROGRESS" | "OK" | "FAILED" | "DELETING"
object BackupStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val OK: "OK" = "OK"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[BackupStatus] = js.Array(IN_PROGRESS, OK, FAILED, DELETING)
}

type BackupType = "AUTOMATED" | "MANUAL"
object BackupType {
  inline val AUTOMATED: "AUTOMATED" = "AUTOMATED"
  inline val MANUAL: "MANUAL" = "MANUAL"

  inline def values: js.Array[BackupType] = js.Array(AUTOMATED, MANUAL)
}

type MaintenanceStatus = "SUCCESS" | "FAILED"
object MaintenanceStatus {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[MaintenanceStatus] = js.Array(SUCCESS, FAILED)
}

/** The status of the association or disassociation request. <p class="title"> ```Possible values:``` </p>* <code>SUCCESS</code>: The association or disassociation succeeded. * <code>FAILED</code>: The association or disassociation failed. * <code>IN_PROGRESS</code>: The association or disassociation is still in progress.
  */
type NodeAssociationStatus = "SUCCESS" | "FAILED" | "IN_PROGRESS"
object NodeAssociationStatus {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  inline def values: js.Array[NodeAssociationStatus] = js.Array(SUCCESS, FAILED, IN_PROGRESS)
}

type ServerStatus = "BACKING_UP" | "CONNECTION_LOST" | "CREATING" | "DELETING" | "MODIFYING" | "FAILED" | "HEALTHY" | "RUNNING" | "RESTORING" | "SETUP" | "UNDER_MAINTENANCE" | "UNHEALTHY" | "TERMINATED"
object ServerStatus {
  inline val BACKING_UP: "BACKING_UP" = "BACKING_UP"
  inline val CONNECTION_LOST: "CONNECTION_LOST" = "CONNECTION_LOST"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val MODIFYING: "MODIFYING" = "MODIFYING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val RESTORING: "RESTORING" = "RESTORING"
  inline val SETUP: "SETUP" = "SETUP"
  inline val UNDER_MAINTENANCE: "UNDER_MAINTENANCE" = "UNDER_MAINTENANCE"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"

  inline def values: js.Array[ServerStatus] = js.Array(BACKING_UP, CONNECTION_LOST, CREATING, DELETING, MODIFYING, FAILED, HEALTHY, RUNNING, RESTORING, SETUP, UNDER_MAINTENANCE, UNHEALTHY, TERMINATED)
}
