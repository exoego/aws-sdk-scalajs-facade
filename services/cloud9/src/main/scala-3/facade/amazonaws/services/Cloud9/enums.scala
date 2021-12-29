package facade.amazonaws.services.cloud9

import scalajs._

type ConnectionType = "CONNECT_SSH" | "CONNECT_SSM"
object ConnectionType {
  val CONNECT_SSH: "CONNECT_SSH" = "CONNECT_SSH"
  val CONNECT_SSM: "CONNECT_SSM" = "CONNECT_SSM"

  @inline def values = js.Array[ConnectionType](CONNECT_SSH, CONNECT_SSM)
}

type EnvironmentLifecycleStatus = "CREATING" | "CREATED" | "CREATE_FAILED" | "DELETING" | "DELETE_FAILED"
object EnvironmentLifecycleStatus {
  val CREATING: "CREATING" = "CREATING"
  val CREATED: "CREATED" = "CREATED"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETING: "DELETING" = "DELETING"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  @inline def values = js.Array[EnvironmentLifecycleStatus](CREATING, CREATED, CREATE_FAILED, DELETING, DELETE_FAILED)
}

type EnvironmentStatus = "error" | "creating" | "connecting" | "ready" | "stopping" | "stopped" | "deleting"
object EnvironmentStatus {
  val error: "error" = "error"
  val creating: "creating" = "creating"
  val connecting: "connecting" = "connecting"
  val ready: "ready" = "ready"
  val stopping: "stopping" = "stopping"
  val stopped: "stopped" = "stopped"
  val deleting: "deleting" = "deleting"

  @inline def values = js.Array[EnvironmentStatus](error, creating, connecting, ready, stopping, stopped, deleting)
}

type EnvironmentType = "ssh" | "ec2"
object EnvironmentType {
  val ssh: "ssh" = "ssh"
  val ec2: "ec2" = "ec2"

  @inline def values = js.Array[EnvironmentType](ssh, ec2)
}

type ManagedCredentialsStatus = "ENABLED_ON_CREATE" | "ENABLED_BY_OWNER" | "DISABLED_BY_DEFAULT" | "DISABLED_BY_OWNER" | "DISABLED_BY_COLLABORATOR" | "PENDING_REMOVAL_BY_COLLABORATOR" | "PENDING_START_REMOVAL_BY_COLLABORATOR" | "PENDING_REMOVAL_BY_OWNER" | "PENDING_START_REMOVAL_BY_OWNER" | "FAILED_REMOVAL_BY_COLLABORATOR" | "FAILED_REMOVAL_BY_OWNER"
object ManagedCredentialsStatus {
  val ENABLED_ON_CREATE: "ENABLED_ON_CREATE" = "ENABLED_ON_CREATE"
  val ENABLED_BY_OWNER: "ENABLED_BY_OWNER" = "ENABLED_BY_OWNER"
  val DISABLED_BY_DEFAULT: "DISABLED_BY_DEFAULT" = "DISABLED_BY_DEFAULT"
  val DISABLED_BY_OWNER: "DISABLED_BY_OWNER" = "DISABLED_BY_OWNER"
  val DISABLED_BY_COLLABORATOR: "DISABLED_BY_COLLABORATOR" = "DISABLED_BY_COLLABORATOR"
  val PENDING_REMOVAL_BY_COLLABORATOR: "PENDING_REMOVAL_BY_COLLABORATOR" = "PENDING_REMOVAL_BY_COLLABORATOR"
  val PENDING_START_REMOVAL_BY_COLLABORATOR: "PENDING_START_REMOVAL_BY_COLLABORATOR" = "PENDING_START_REMOVAL_BY_COLLABORATOR"
  val PENDING_REMOVAL_BY_OWNER: "PENDING_REMOVAL_BY_OWNER" = "PENDING_REMOVAL_BY_OWNER"
  val PENDING_START_REMOVAL_BY_OWNER: "PENDING_START_REMOVAL_BY_OWNER" = "PENDING_START_REMOVAL_BY_OWNER"
  val FAILED_REMOVAL_BY_COLLABORATOR: "FAILED_REMOVAL_BY_COLLABORATOR" = "FAILED_REMOVAL_BY_COLLABORATOR"
  val FAILED_REMOVAL_BY_OWNER: "FAILED_REMOVAL_BY_OWNER" = "FAILED_REMOVAL_BY_OWNER"

  @inline def values = js.Array[ManagedCredentialsStatus](
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

type MemberPermissions = "read-write" | "read-only"
object MemberPermissions {
  val `read-write`: "read-write" = "read-write"
  val `read-only`: "read-only" = "read-only"

  @inline def values = js.Array[MemberPermissions](`read-write`, `read-only`)
}

type Permissions = "owner" | "read-write" | "read-only"
object Permissions {
  val owner: "owner" = "owner"
  val `read-write`: "read-write" = "read-write"
  val `read-only`: "read-only" = "read-only"

  @inline def values = js.Array[Permissions](owner, `read-write`, `read-only`)
}
