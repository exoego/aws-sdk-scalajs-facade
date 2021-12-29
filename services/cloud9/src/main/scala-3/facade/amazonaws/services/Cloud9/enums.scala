package facade.amazonaws.services.cloud9

import scalajs._

type ConnectionType = "CONNECT_SSH" | "CONNECT_SSM"
object ConnectionType {
  inline val CONNECT_SSH: "CONNECT_SSH" = "CONNECT_SSH"
  inline val CONNECT_SSM: "CONNECT_SSM" = "CONNECT_SSM"

  inline def values: js.Array[ConnectionType] = js.Array(CONNECT_SSH, CONNECT_SSM)
}

type EnvironmentLifecycleStatus = "CREATING" | "CREATED" | "CREATE_FAILED" | "DELETING" | "DELETE_FAILED"
object EnvironmentLifecycleStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[EnvironmentLifecycleStatus] = js.Array(CREATING, CREATED, CREATE_FAILED, DELETING, DELETE_FAILED)
}

type EnvironmentStatus = "error" | "creating" | "connecting" | "ready" | "stopping" | "stopped" | "deleting"
object EnvironmentStatus {
  inline val error: "error" = "error"
  inline val creating: "creating" = "creating"
  inline val connecting: "connecting" = "connecting"
  inline val ready: "ready" = "ready"
  inline val stopping: "stopping" = "stopping"
  inline val stopped: "stopped" = "stopped"
  inline val deleting: "deleting" = "deleting"

  inline def values: js.Array[EnvironmentStatus] = js.Array(error, creating, connecting, ready, stopping, stopped, deleting)
}

type EnvironmentType = "ssh" | "ec2"
object EnvironmentType {
  inline val ssh: "ssh" = "ssh"
  inline val ec2: "ec2" = "ec2"

  inline def values: js.Array[EnvironmentType] = js.Array(ssh, ec2)
}

type ManagedCredentialsStatus = "ENABLED_ON_CREATE" | "ENABLED_BY_OWNER" | "DISABLED_BY_DEFAULT" | "DISABLED_BY_OWNER" | "DISABLED_BY_COLLABORATOR" | "PENDING_REMOVAL_BY_COLLABORATOR" | "PENDING_START_REMOVAL_BY_COLLABORATOR" | "PENDING_REMOVAL_BY_OWNER" | "PENDING_START_REMOVAL_BY_OWNER" | "FAILED_REMOVAL_BY_COLLABORATOR" | "FAILED_REMOVAL_BY_OWNER"
object ManagedCredentialsStatus {
  inline val ENABLED_ON_CREATE: "ENABLED_ON_CREATE" = "ENABLED_ON_CREATE"
  inline val ENABLED_BY_OWNER: "ENABLED_BY_OWNER" = "ENABLED_BY_OWNER"
  inline val DISABLED_BY_DEFAULT: "DISABLED_BY_DEFAULT" = "DISABLED_BY_DEFAULT"
  inline val DISABLED_BY_OWNER: "DISABLED_BY_OWNER" = "DISABLED_BY_OWNER"
  inline val DISABLED_BY_COLLABORATOR: "DISABLED_BY_COLLABORATOR" = "DISABLED_BY_COLLABORATOR"
  inline val PENDING_REMOVAL_BY_COLLABORATOR: "PENDING_REMOVAL_BY_COLLABORATOR" = "PENDING_REMOVAL_BY_COLLABORATOR"
  inline val PENDING_START_REMOVAL_BY_COLLABORATOR: "PENDING_START_REMOVAL_BY_COLLABORATOR" = "PENDING_START_REMOVAL_BY_COLLABORATOR"
  inline val PENDING_REMOVAL_BY_OWNER: "PENDING_REMOVAL_BY_OWNER" = "PENDING_REMOVAL_BY_OWNER"
  inline val PENDING_START_REMOVAL_BY_OWNER: "PENDING_START_REMOVAL_BY_OWNER" = "PENDING_START_REMOVAL_BY_OWNER"
  inline val FAILED_REMOVAL_BY_COLLABORATOR: "FAILED_REMOVAL_BY_COLLABORATOR" = "FAILED_REMOVAL_BY_COLLABORATOR"
  inline val FAILED_REMOVAL_BY_OWNER: "FAILED_REMOVAL_BY_OWNER" = "FAILED_REMOVAL_BY_OWNER"

  inline def values: js.Array[ManagedCredentialsStatus] = js.Array(
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
  inline val `read-write`: "read-write" = "read-write"
  inline val `read-only`: "read-only" = "read-only"

  inline def values: js.Array[MemberPermissions] = js.Array(`read-write`, `read-only`)
}

type Permissions = "owner" | "read-write" | "read-only"
object Permissions {
  inline val owner: "owner" = "owner"
  inline val `read-write`: "read-write" = "read-write"
  inline val `read-only`: "read-only" = "read-only"

  inline def values: js.Array[Permissions] = js.Array(owner, `read-write`, `read-only`)
}
