package facade.amazonaws.services.workspaces

import scalajs._

type AccessPropertyValue = "ALLOW" | "DENY"
object AccessPropertyValue {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val DENY: "DENY" = "DENY"

  inline def values: js.Array[AccessPropertyValue] = js.Array(ALLOW, DENY)
}

type Application = "Microsoft_Office_2016" | "Microsoft_Office_2019"
object Application {
  inline val Microsoft_Office_2016: "Microsoft_Office_2016" = "Microsoft_Office_2016"
  inline val Microsoft_Office_2019: "Microsoft_Office_2019" = "Microsoft_Office_2019"

  inline def values: js.Array[Application] = js.Array(Microsoft_Office_2016, Microsoft_Office_2019)
}

type AssociationStatus = "NOT_ASSOCIATED" | "ASSOCIATED_WITH_OWNER_ACCOUNT" | "ASSOCIATED_WITH_SHARED_ACCOUNT" | "PENDING_ASSOCIATION" | "PENDING_DISASSOCIATION"
object AssociationStatus {
  inline val NOT_ASSOCIATED: "NOT_ASSOCIATED" = "NOT_ASSOCIATED"
  inline val ASSOCIATED_WITH_OWNER_ACCOUNT: "ASSOCIATED_WITH_OWNER_ACCOUNT" = "ASSOCIATED_WITH_OWNER_ACCOUNT"
  inline val ASSOCIATED_WITH_SHARED_ACCOUNT: "ASSOCIATED_WITH_SHARED_ACCOUNT" = "ASSOCIATED_WITH_SHARED_ACCOUNT"
  inline val PENDING_ASSOCIATION: "PENDING_ASSOCIATION" = "PENDING_ASSOCIATION"
  inline val PENDING_DISASSOCIATION: "PENDING_DISASSOCIATION" = "PENDING_DISASSOCIATION"

  inline def values: js.Array[AssociationStatus] = js.Array(NOT_ASSOCIATED, ASSOCIATED_WITH_OWNER_ACCOUNT, ASSOCIATED_WITH_SHARED_ACCOUNT, PENDING_ASSOCIATION, PENDING_DISASSOCIATION)
}

type Compute = "VALUE" | "STANDARD" | "PERFORMANCE" | "POWER" | "GRAPHICS" | "POWERPRO" | "GRAPHICSPRO"
object Compute {
  inline val VALUE: "VALUE" = "VALUE"
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val PERFORMANCE: "PERFORMANCE" = "PERFORMANCE"
  inline val POWER: "POWER" = "POWER"
  inline val GRAPHICS: "GRAPHICS" = "GRAPHICS"
  inline val POWERPRO: "POWERPRO" = "POWERPRO"
  inline val GRAPHICSPRO: "GRAPHICSPRO" = "GRAPHICSPRO"

  inline def values: js.Array[Compute] = js.Array(VALUE, STANDARD, PERFORMANCE, POWER, GRAPHICS, POWERPRO, GRAPHICSPRO)
}

type ConnectionAliasState = "CREATING" | "CREATED" | "DELETING"
object ConnectionAliasState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ConnectionAliasState] = js.Array(CREATING, CREATED, DELETING)
}

type ConnectionState = "CONNECTED" | "DISCONNECTED" | "UNKNOWN"
object ConnectionState {
  inline val CONNECTED: "CONNECTED" = "CONNECTED"
  inline val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[ConnectionState] = js.Array(CONNECTED, DISCONNECTED, UNKNOWN)
}

type DedicatedTenancyModificationStateEnum = "PENDING" | "COMPLETED" | "FAILED"
object DedicatedTenancyModificationStateEnum {
  inline val PENDING: "PENDING" = "PENDING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[DedicatedTenancyModificationStateEnum] = js.Array(PENDING, COMPLETED, FAILED)
}

type DedicatedTenancySupportEnum = "ENABLED"
object DedicatedTenancySupportEnum {
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[DedicatedTenancySupportEnum] = js.Array(ENABLED)
}

type DedicatedTenancySupportResultEnum = "ENABLED" | "DISABLED"
object DedicatedTenancySupportResultEnum {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[DedicatedTenancySupportResultEnum] = js.Array(ENABLED, DISABLED)
}

type ImageType = "OWNED" | "SHARED"
object ImageType {
  inline val OWNED: "OWNED" = "OWNED"
  inline val SHARED: "SHARED" = "SHARED"

  inline def values: js.Array[ImageType] = js.Array(OWNED, SHARED)
}

type ModificationResourceEnum = "ROOT_VOLUME" | "USER_VOLUME" | "COMPUTE_TYPE"
object ModificationResourceEnum {
  inline val ROOT_VOLUME: "ROOT_VOLUME" = "ROOT_VOLUME"
  inline val USER_VOLUME: "USER_VOLUME" = "USER_VOLUME"
  inline val COMPUTE_TYPE: "COMPUTE_TYPE" = "COMPUTE_TYPE"

  inline def values: js.Array[ModificationResourceEnum] = js.Array(ROOT_VOLUME, USER_VOLUME, COMPUTE_TYPE)
}

type ModificationStateEnum = "UPDATE_INITIATED" | "UPDATE_IN_PROGRESS"
object ModificationStateEnum {
  inline val UPDATE_INITIATED: "UPDATE_INITIATED" = "UPDATE_INITIATED"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"

  inline def values: js.Array[ModificationStateEnum] = js.Array(UPDATE_INITIATED, UPDATE_IN_PROGRESS)
}

type OperatingSystemType = "WINDOWS" | "LINUX"
object OperatingSystemType {
  inline val WINDOWS: "WINDOWS" = "WINDOWS"
  inline val LINUX: "LINUX" = "LINUX"

  inline def values: js.Array[OperatingSystemType] = js.Array(WINDOWS, LINUX)
}

type ReconnectEnum = "ENABLED" | "DISABLED"
object ReconnectEnum {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ReconnectEnum] = js.Array(ENABLED, DISABLED)
}

type RunningMode = "AUTO_STOP" | "ALWAYS_ON"
object RunningMode {
  inline val AUTO_STOP: "AUTO_STOP" = "AUTO_STOP"
  inline val ALWAYS_ON: "ALWAYS_ON" = "ALWAYS_ON"

  inline def values: js.Array[RunningMode] = js.Array(AUTO_STOP, ALWAYS_ON)
}

type TargetWorkspaceState = "AVAILABLE" | "ADMIN_MAINTENANCE"
object TargetWorkspaceState {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val ADMIN_MAINTENANCE: "ADMIN_MAINTENANCE" = "ADMIN_MAINTENANCE"

  inline def values: js.Array[TargetWorkspaceState] = js.Array(AVAILABLE, ADMIN_MAINTENANCE)
}

type Tenancy = "DEDICATED" | "SHARED"
object Tenancy {
  inline val DEDICATED: "DEDICATED" = "DEDICATED"
  inline val SHARED: "SHARED" = "SHARED"

  inline def values: js.Array[Tenancy] = js.Array(DEDICATED, SHARED)
}

type WorkspaceDirectoryState = "REGISTERING" | "REGISTERED" | "DEREGISTERING" | "DEREGISTERED" | "ERROR"
object WorkspaceDirectoryState {
  inline val REGISTERING: "REGISTERING" = "REGISTERING"
  inline val REGISTERED: "REGISTERED" = "REGISTERED"
  inline val DEREGISTERING: "DEREGISTERING" = "DEREGISTERING"
  inline val DEREGISTERED: "DEREGISTERED" = "DEREGISTERED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[WorkspaceDirectoryState] = js.Array(REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR)
}

type WorkspaceDirectoryType = "SIMPLE_AD" | "AD_CONNECTOR"
object WorkspaceDirectoryType {
  inline val SIMPLE_AD: "SIMPLE_AD" = "SIMPLE_AD"
  inline val AD_CONNECTOR: "AD_CONNECTOR" = "AD_CONNECTOR"

  inline def values: js.Array[WorkspaceDirectoryType] = js.Array(SIMPLE_AD, AD_CONNECTOR)
}

type WorkspaceImageIngestionProcess = "BYOL_REGULAR" | "BYOL_GRAPHICS" | "BYOL_GRAPHICSPRO" | "BYOL_REGULAR_WSP"
object WorkspaceImageIngestionProcess {
  inline val BYOL_REGULAR: "BYOL_REGULAR" = "BYOL_REGULAR"
  inline val BYOL_GRAPHICS: "BYOL_GRAPHICS" = "BYOL_GRAPHICS"
  inline val BYOL_GRAPHICSPRO: "BYOL_GRAPHICSPRO" = "BYOL_GRAPHICSPRO"
  inline val BYOL_REGULAR_WSP: "BYOL_REGULAR_WSP" = "BYOL_REGULAR_WSP"

  inline def values: js.Array[WorkspaceImageIngestionProcess] = js.Array(BYOL_REGULAR, BYOL_GRAPHICS, BYOL_GRAPHICSPRO, BYOL_REGULAR_WSP)
}

type WorkspaceImageRequiredTenancy = "DEFAULT" | "DEDICATED"
object WorkspaceImageRequiredTenancy {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val DEDICATED: "DEDICATED" = "DEDICATED"

  inline def values: js.Array[WorkspaceImageRequiredTenancy] = js.Array(DEFAULT, DEDICATED)
}

type WorkspaceImageState = "AVAILABLE" | "PENDING" | "ERROR"
object WorkspaceImageState {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[WorkspaceImageState] = js.Array(AVAILABLE, PENDING, ERROR)
}

type WorkspaceState = "PENDING" | "AVAILABLE" | "IMPAIRED" | "UNHEALTHY" | "REBOOTING" | "STARTING" | "REBUILDING" | "RESTORING" | "MAINTENANCE" | "ADMIN_MAINTENANCE" | "TERMINATING" | "TERMINATED" | "SUSPENDED" | "UPDATING" | "STOPPING" | "STOPPED" | "ERROR"
object WorkspaceState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val IMPAIRED: "IMPAIRED" = "IMPAIRED"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  inline val REBOOTING: "REBOOTING" = "REBOOTING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val REBUILDING: "REBUILDING" = "REBUILDING"
  inline val RESTORING: "RESTORING" = "RESTORING"
  inline val MAINTENANCE: "MAINTENANCE" = "MAINTENANCE"
  inline val ADMIN_MAINTENANCE: "ADMIN_MAINTENANCE" = "ADMIN_MAINTENANCE"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[WorkspaceState] = js.Array(
    PENDING,
    AVAILABLE,
    IMPAIRED,
    UNHEALTHY,
    REBOOTING,
    STARTING,
    REBUILDING,
    RESTORING,
    MAINTENANCE,
    ADMIN_MAINTENANCE,
    TERMINATING,
    TERMINATED,
    SUSPENDED,
    UPDATING,
    STOPPING,
    STOPPED,
    ERROR
  )
}
