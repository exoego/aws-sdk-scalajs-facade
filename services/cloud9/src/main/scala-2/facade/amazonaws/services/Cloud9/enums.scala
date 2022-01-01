package facade.amazonaws.services.cloud9

import scalajs.js

@js.native
sealed trait ConnectionType extends js.Any
object ConnectionType {
  val CONNECT_SSH = "CONNECT_SSH".asInstanceOf[ConnectionType]
  val CONNECT_SSM = "CONNECT_SSM".asInstanceOf[ConnectionType]

  @inline def values: js.Array[ConnectionType] = js.Array(CONNECT_SSH, CONNECT_SSM)
}

@js.native
sealed trait EnvironmentLifecycleStatus extends js.Any
object EnvironmentLifecycleStatus {
  val CREATING = "CREATING".asInstanceOf[EnvironmentLifecycleStatus]
  val CREATED = "CREATED".asInstanceOf[EnvironmentLifecycleStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[EnvironmentLifecycleStatus]
  val DELETING = "DELETING".asInstanceOf[EnvironmentLifecycleStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[EnvironmentLifecycleStatus]

  @inline def values: js.Array[EnvironmentLifecycleStatus] = js.Array(CREATING, CREATED, CREATE_FAILED, DELETING, DELETE_FAILED)
}

@js.native
sealed trait EnvironmentStatus extends js.Any
object EnvironmentStatus {
  val error = "error".asInstanceOf[EnvironmentStatus]
  val creating = "creating".asInstanceOf[EnvironmentStatus]
  val connecting = "connecting".asInstanceOf[EnvironmentStatus]
  val ready = "ready".asInstanceOf[EnvironmentStatus]
  val stopping = "stopping".asInstanceOf[EnvironmentStatus]
  val stopped = "stopped".asInstanceOf[EnvironmentStatus]
  val deleting = "deleting".asInstanceOf[EnvironmentStatus]

  @inline def values: js.Array[EnvironmentStatus] = js.Array(error, creating, connecting, ready, stopping, stopped, deleting)
}

@js.native
sealed trait EnvironmentType extends js.Any
object EnvironmentType {
  val ssh = "ssh".asInstanceOf[EnvironmentType]
  val ec2 = "ec2".asInstanceOf[EnvironmentType]

  @inline def values: js.Array[EnvironmentType] = js.Array(ssh, ec2)
}

@js.native
sealed trait ManagedCredentialsAction extends js.Any
object ManagedCredentialsAction {
  val ENABLE = "ENABLE".asInstanceOf[ManagedCredentialsAction]
  val DISABLE = "DISABLE".asInstanceOf[ManagedCredentialsAction]

  @inline def values: js.Array[ManagedCredentialsAction] = js.Array(ENABLE, DISABLE)
}

@js.native
sealed trait ManagedCredentialsStatus extends js.Any
object ManagedCredentialsStatus {
  val ENABLED_ON_CREATE = "ENABLED_ON_CREATE".asInstanceOf[ManagedCredentialsStatus]
  val ENABLED_BY_OWNER = "ENABLED_BY_OWNER".asInstanceOf[ManagedCredentialsStatus]
  val DISABLED_BY_DEFAULT = "DISABLED_BY_DEFAULT".asInstanceOf[ManagedCredentialsStatus]
  val DISABLED_BY_OWNER = "DISABLED_BY_OWNER".asInstanceOf[ManagedCredentialsStatus]
  val DISABLED_BY_COLLABORATOR = "DISABLED_BY_COLLABORATOR".asInstanceOf[ManagedCredentialsStatus]
  val PENDING_REMOVAL_BY_COLLABORATOR = "PENDING_REMOVAL_BY_COLLABORATOR".asInstanceOf[ManagedCredentialsStatus]
  val PENDING_START_REMOVAL_BY_COLLABORATOR = "PENDING_START_REMOVAL_BY_COLLABORATOR".asInstanceOf[ManagedCredentialsStatus]
  val PENDING_REMOVAL_BY_OWNER = "PENDING_REMOVAL_BY_OWNER".asInstanceOf[ManagedCredentialsStatus]
  val PENDING_START_REMOVAL_BY_OWNER = "PENDING_START_REMOVAL_BY_OWNER".asInstanceOf[ManagedCredentialsStatus]
  val FAILED_REMOVAL_BY_COLLABORATOR = "FAILED_REMOVAL_BY_COLLABORATOR".asInstanceOf[ManagedCredentialsStatus]
  val FAILED_REMOVAL_BY_OWNER = "FAILED_REMOVAL_BY_OWNER".asInstanceOf[ManagedCredentialsStatus]

  @inline def values: js.Array[ManagedCredentialsStatus] = js.Array(
    ENABLED_ON_CREATE,
    ENABLED_BY_OWNER,
    DISABLED_BY_DEFAULT,
    DISABLED_BY_OWNER,
    DISABLED_BY_COLLABORATOR,
    PENDING_REMOVAL_BY_COLLABORATOR,
    PENDING_START_REMOVAL_BY_COLLABORATOR,
    PENDING_REMOVAL_BY_OWNER,
    PENDING_START_REMOVAL_BY_OWNER,
    FAILED_REMOVAL_BY_COLLABORATOR,
    FAILED_REMOVAL_BY_OWNER
  )
}

@js.native
sealed trait MemberPermissions extends js.Any
object MemberPermissions {
  val `read-write` = "read-write".asInstanceOf[MemberPermissions]
  val `read-only` = "read-only".asInstanceOf[MemberPermissions]

  @inline def values: js.Array[MemberPermissions] = js.Array(`read-write`, `read-only`)
}

@js.native
sealed trait Permissions extends js.Any
object Permissions {
  val owner = "owner".asInstanceOf[Permissions]
  val `read-write` = "read-write".asInstanceOf[Permissions]
  val `read-only` = "read-only".asInstanceOf[Permissions]

  @inline def values: js.Array[Permissions] = js.Array(owner, `read-write`, `read-only`)
}
