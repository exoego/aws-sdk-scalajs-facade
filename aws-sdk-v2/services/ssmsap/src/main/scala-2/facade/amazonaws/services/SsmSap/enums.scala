package facade.amazonaws.services.ssmsap

import scalajs.js

@js.native
sealed trait ApplicationStatus extends js.Any
object ApplicationStatus {
  val ACTIVATED = "ACTIVATED".asInstanceOf[ApplicationStatus]
  val STARTING = "STARTING".asInstanceOf[ApplicationStatus]
  val STOPPED = "STOPPED".asInstanceOf[ApplicationStatus]
  val STOPPING = "STOPPING".asInstanceOf[ApplicationStatus]
  val FAILED = "FAILED".asInstanceOf[ApplicationStatus]
  val REGISTERING = "REGISTERING".asInstanceOf[ApplicationStatus]
  val DELETING = "DELETING".asInstanceOf[ApplicationStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[ApplicationStatus]

  @inline def values: js.Array[ApplicationStatus] = js.Array(ACTIVATED, STARTING, STOPPED, STOPPING, FAILED, REGISTERING, DELETING, UNKNOWN)
}

@js.native
sealed trait ApplicationType extends js.Any
object ApplicationType {
  val HANA = "HANA".asInstanceOf[ApplicationType]

  @inline def values: js.Array[ApplicationType] = js.Array(HANA)
}

@js.native
sealed trait ComponentStatus extends js.Any
object ComponentStatus {
  val ACTIVATED = "ACTIVATED".asInstanceOf[ComponentStatus]

  @inline def values: js.Array[ComponentStatus] = js.Array(ACTIVATED)
}

@js.native
sealed trait ComponentType extends js.Any
object ComponentType {
  val HANA = "HANA".asInstanceOf[ComponentType]

  @inline def values: js.Array[ComponentType] = js.Array(HANA)
}

@js.native
sealed trait CredentialType extends js.Any
object CredentialType {
  val ADMIN = "ADMIN".asInstanceOf[CredentialType]

  @inline def values: js.Array[CredentialType] = js.Array(ADMIN)
}

@js.native
sealed trait DatabaseStatus extends js.Any
object DatabaseStatus {
  val RUNNING = "RUNNING".asInstanceOf[DatabaseStatus]
  val STARTING = "STARTING".asInstanceOf[DatabaseStatus]
  val STOPPED = "STOPPED".asInstanceOf[DatabaseStatus]
  val WARNING = "WARNING".asInstanceOf[DatabaseStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[DatabaseStatus]

  @inline def values: js.Array[DatabaseStatus] = js.Array(RUNNING, STARTING, STOPPED, WARNING, UNKNOWN)
}

@js.native
sealed trait DatabaseType extends js.Any
object DatabaseType {
  val SYSTEM = "SYSTEM".asInstanceOf[DatabaseType]
  val TENANT = "TENANT".asInstanceOf[DatabaseType]

  @inline def values: js.Array[DatabaseType] = js.Array(SYSTEM, TENANT)
}

@js.native
sealed trait HostRole extends js.Any
object HostRole {
  val LEADER = "LEADER".asInstanceOf[HostRole]
  val WORKER = "WORKER".asInstanceOf[HostRole]
  val STANDBY = "STANDBY".asInstanceOf[HostRole]
  val UNKNOWN = "UNKNOWN".asInstanceOf[HostRole]

  @inline def values: js.Array[HostRole] = js.Array(LEADER, WORKER, STANDBY, UNKNOWN)
}

@js.native
sealed trait OperationStatus extends js.Any
object OperationStatus {
  val INPROGRESS = "INPROGRESS".asInstanceOf[OperationStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[OperationStatus]
  val ERROR = "ERROR".asInstanceOf[OperationStatus]

  @inline def values: js.Array[OperationStatus] = js.Array(INPROGRESS, SUCCESS, ERROR)
}

@js.native
sealed trait PermissionActionType extends js.Any
object PermissionActionType {
  val RESTORE = "RESTORE".asInstanceOf[PermissionActionType]

  @inline def values: js.Array[PermissionActionType] = js.Array(RESTORE)
}
