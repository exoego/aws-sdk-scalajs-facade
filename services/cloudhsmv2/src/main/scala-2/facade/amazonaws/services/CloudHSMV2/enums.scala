package facade.amazonaws.services.cloudhsmv2

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait BackupPolicy extends js.Any
object BackupPolicy {
  val DEFAULT = "DEFAULT".asInstanceOf[BackupPolicy]

  @inline def values = js.Array(DEFAULT)
}

@js.native
sealed trait BackupRetentionType extends js.Any
object BackupRetentionType {
  val DAYS = "DAYS".asInstanceOf[BackupRetentionType]

  @inline def values = js.Array(DAYS)
}

@js.native
sealed trait BackupState extends js.Any
object BackupState {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[BackupState]
  val READY = "READY".asInstanceOf[BackupState]
  val DELETED = "DELETED".asInstanceOf[BackupState]
  val PENDING_DELETION = "PENDING_DELETION".asInstanceOf[BackupState]

  @inline def values = js.Array(CREATE_IN_PROGRESS, READY, DELETED, PENDING_DELETION)
}

@js.native
sealed trait ClusterState extends js.Any
object ClusterState {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ClusterState]
  val UNINITIALIZED = "UNINITIALIZED".asInstanceOf[ClusterState]
  val INITIALIZE_IN_PROGRESS = "INITIALIZE_IN_PROGRESS".asInstanceOf[ClusterState]
  val INITIALIZED = "INITIALIZED".asInstanceOf[ClusterState]
  val ACTIVE = "ACTIVE".asInstanceOf[ClusterState]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[ClusterState]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ClusterState]
  val DELETED = "DELETED".asInstanceOf[ClusterState]
  val DEGRADED = "DEGRADED".asInstanceOf[ClusterState]

  @inline def values = js.Array(CREATE_IN_PROGRESS, UNINITIALIZED, INITIALIZE_IN_PROGRESS, INITIALIZED, ACTIVE, UPDATE_IN_PROGRESS, DELETE_IN_PROGRESS, DELETED, DEGRADED)
}

@js.native
sealed trait HsmState extends js.Any
object HsmState {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[HsmState]
  val ACTIVE = "ACTIVE".asInstanceOf[HsmState]
  val DEGRADED = "DEGRADED".asInstanceOf[HsmState]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[HsmState]
  val DELETED = "DELETED".asInstanceOf[HsmState]

  @inline def values = js.Array(CREATE_IN_PROGRESS, ACTIVE, DEGRADED, DELETE_IN_PROGRESS, DELETED)
}
