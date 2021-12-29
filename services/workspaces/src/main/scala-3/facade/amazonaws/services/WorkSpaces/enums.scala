package facade.amazonaws.services.workspaces

import scalajs._

type AccessPropertyValue = "ALLOW" | "DENY"
object AccessPropertyValue {
  val ALLOW: "ALLOW" = "ALLOW"
  val DENY: "DENY" = "DENY"

  @inline def values = js.Array[AccessPropertyValue](ALLOW, DENY)
}

type Application = "Microsoft_Office_2016" | "Microsoft_Office_2019"
object Application {
  val Microsoft_Office_2016: "Microsoft_Office_2016" = "Microsoft_Office_2016"
  val Microsoft_Office_2019: "Microsoft_Office_2019" = "Microsoft_Office_2019"

  @inline def values = js.Array[Application](Microsoft_Office_2016, Microsoft_Office_2019)
}

type AssociationStatus = "NOT_ASSOCIATED" | "ASSOCIATED_WITH_OWNER_ACCOUNT" | "ASSOCIATED_WITH_SHARED_ACCOUNT" | "PENDING_ASSOCIATION" | "PENDING_DISASSOCIATION"
object AssociationStatus {
  val NOT_ASSOCIATED: "NOT_ASSOCIATED" = "NOT_ASSOCIATED"
  val ASSOCIATED_WITH_OWNER_ACCOUNT: "ASSOCIATED_WITH_OWNER_ACCOUNT" = "ASSOCIATED_WITH_OWNER_ACCOUNT"
  val ASSOCIATED_WITH_SHARED_ACCOUNT: "ASSOCIATED_WITH_SHARED_ACCOUNT" = "ASSOCIATED_WITH_SHARED_ACCOUNT"
  val PENDING_ASSOCIATION: "PENDING_ASSOCIATION" = "PENDING_ASSOCIATION"
  val PENDING_DISASSOCIATION: "PENDING_DISASSOCIATION" = "PENDING_DISASSOCIATION"

  @inline def values = js.Array[AssociationStatus](NOT_ASSOCIATED, ASSOCIATED_WITH_OWNER_ACCOUNT, ASSOCIATED_WITH_SHARED_ACCOUNT, PENDING_ASSOCIATION, PENDING_DISASSOCIATION)
}

type Compute = "VALUE" | "STANDARD" | "PERFORMANCE" | "POWER" | "GRAPHICS" | "POWERPRO" | "GRAPHICSPRO"
object Compute {
  val VALUE: "VALUE" = "VALUE"
  val STANDARD: "STANDARD" = "STANDARD"
  val PERFORMANCE: "PERFORMANCE" = "PERFORMANCE"
  val POWER: "POWER" = "POWER"
  val GRAPHICS: "GRAPHICS" = "GRAPHICS"
  val POWERPRO: "POWERPRO" = "POWERPRO"
  val GRAPHICSPRO: "GRAPHICSPRO" = "GRAPHICSPRO"

  @inline def values = js.Array[Compute](VALUE, STANDARD, PERFORMANCE, POWER, GRAPHICS, POWERPRO, GRAPHICSPRO)
}

type ConnectionAliasState = "CREATING" | "CREATED" | "DELETING"
object ConnectionAliasState {
  val CREATING: "CREATING" = "CREATING"
  val CREATED: "CREATED" = "CREATED"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[ConnectionAliasState](CREATING, CREATED, DELETING)
}

type ConnectionState = "CONNECTED" | "DISCONNECTED" | "UNKNOWN"
object ConnectionState {
  val CONNECTED: "CONNECTED" = "CONNECTED"
  val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[ConnectionState](CONNECTED, DISCONNECTED, UNKNOWN)
}

type DedicatedTenancyModificationStateEnum = "PENDING" | "COMPLETED" | "FAILED"
object DedicatedTenancyModificationStateEnum {
  val PENDING: "PENDING" = "PENDING"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[DedicatedTenancyModificationStateEnum](PENDING, COMPLETED, FAILED)
}

type DedicatedTenancySupportEnum = "ENABLED"
object DedicatedTenancySupportEnum {
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[DedicatedTenancySupportEnum](ENABLED)
}

type DedicatedTenancySupportResultEnum = "ENABLED" | "DISABLED"
object DedicatedTenancySupportResultEnum {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[DedicatedTenancySupportResultEnum](ENABLED, DISABLED)
}

type ImageType = "OWNED" | "SHARED"
object ImageType {
  val OWNED: "OWNED" = "OWNED"
  val SHARED: "SHARED" = "SHARED"

  @inline def values = js.Array[ImageType](OWNED, SHARED)
}

type ModificationResourceEnum = "ROOT_VOLUME" | "USER_VOLUME" | "COMPUTE_TYPE"
object ModificationResourceEnum {
  val ROOT_VOLUME: "ROOT_VOLUME" = "ROOT_VOLUME"
  val USER_VOLUME: "USER_VOLUME" = "USER_VOLUME"
  val COMPUTE_TYPE: "COMPUTE_TYPE" = "COMPUTE_TYPE"

  @inline def values = js.Array[ModificationResourceEnum](ROOT_VOLUME, USER_VOLUME, COMPUTE_TYPE)
}

type ModificationStateEnum = "UPDATE_INITIATED" | "UPDATE_IN_PROGRESS"
object ModificationStateEnum {
  val UPDATE_INITIATED: "UPDATE_INITIATED" = "UPDATE_INITIATED"
  val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"

  @inline def values = js.Array[ModificationStateEnum](UPDATE_INITIATED, UPDATE_IN_PROGRESS)
}

type OperatingSystemType = "WINDOWS" | "LINUX"
object OperatingSystemType {
  val WINDOWS: "WINDOWS" = "WINDOWS"
  val LINUX: "LINUX" = "LINUX"

  @inline def values = js.Array[OperatingSystemType](WINDOWS, LINUX)
}

type ReconnectEnum = "ENABLED" | "DISABLED"
object ReconnectEnum {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ReconnectEnum](ENABLED, DISABLED)
}

type RunningMode = "AUTO_STOP" | "ALWAYS_ON"
object RunningMode {
  val AUTO_STOP: "AUTO_STOP" = "AUTO_STOP"
  val ALWAYS_ON: "ALWAYS_ON" = "ALWAYS_ON"

  @inline def values = js.Array[RunningMode](AUTO_STOP, ALWAYS_ON)
}

type TargetWorkspaceState = "AVAILABLE" | "ADMIN_MAINTENANCE"
object TargetWorkspaceState {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val ADMIN_MAINTENANCE: "ADMIN_MAINTENANCE" = "ADMIN_MAINTENANCE"

  @inline def values = js.Array[TargetWorkspaceState](AVAILABLE, ADMIN_MAINTENANCE)
}

type Tenancy = "DEDICATED" | "SHARED"
object Tenancy {
  val DEDICATED: "DEDICATED" = "DEDICATED"
  val SHARED: "SHARED" = "SHARED"

  @inline def values = js.Array[Tenancy](DEDICATED, SHARED)
}

type WorkspaceDirectoryState = "REGISTERING" | "REGISTERED" | "DEREGISTERING" | "DEREGISTERED" | "ERROR"
object WorkspaceDirectoryState {
  val REGISTERING: "REGISTERING" = "REGISTERING"
  val REGISTERED: "REGISTERED" = "REGISTERED"
  val DEREGISTERING: "DEREGISTERING" = "DEREGISTERING"
  val DEREGISTERED: "DEREGISTERED" = "DEREGISTERED"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[WorkspaceDirectoryState](REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR)
}

type WorkspaceDirectoryType = "SIMPLE_AD" | "AD_CONNECTOR"
object WorkspaceDirectoryType {
  val SIMPLE_AD: "SIMPLE_AD" = "SIMPLE_AD"
  val AD_CONNECTOR: "AD_CONNECTOR" = "AD_CONNECTOR"

  @inline def values = js.Array[WorkspaceDirectoryType](SIMPLE_AD, AD_CONNECTOR)
}

type WorkspaceImageIngestionProcess = "BYOL_REGULAR" | "BYOL_GRAPHICS" | "BYOL_GRAPHICSPRO" | "BYOL_REGULAR_WSP"
object WorkspaceImageIngestionProcess {
  val BYOL_REGULAR: "BYOL_REGULAR" = "BYOL_REGULAR"
  val BYOL_GRAPHICS: "BYOL_GRAPHICS" = "BYOL_GRAPHICS"
  val BYOL_GRAPHICSPRO: "BYOL_GRAPHICSPRO" = "BYOL_GRAPHICSPRO"
  val BYOL_REGULAR_WSP: "BYOL_REGULAR_WSP" = "BYOL_REGULAR_WSP"

  @inline def values = js.Array[WorkspaceImageIngestionProcess](BYOL_REGULAR, BYOL_GRAPHICS, BYOL_GRAPHICSPRO, BYOL_REGULAR_WSP)
}

type WorkspaceImageRequiredTenancy = "DEFAULT" | "DEDICATED"
object WorkspaceImageRequiredTenancy {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val DEDICATED: "DEDICATED" = "DEDICATED"

  @inline def values = js.Array[WorkspaceImageRequiredTenancy](DEFAULT, DEDICATED)
}

type WorkspaceImageState = "AVAILABLE" | "PENDING" | "ERROR"
object WorkspaceImageState {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val PENDING: "PENDING" = "PENDING"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[WorkspaceImageState](AVAILABLE, PENDING, ERROR)
}

type WorkspaceState = "PENDING" | "AVAILABLE" | "IMPAIRED" | "UNHEALTHY" | "REBOOTING" | "STARTING" | "REBUILDING" | "RESTORING" | "MAINTENANCE" | "ADMIN_MAINTENANCE" | "TERMINATING" | "TERMINATED" | "SUSPENDED" | "UPDATING" | "STOPPING" | "STOPPED" | "ERROR"
object WorkspaceState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val IMPAIRED: "IMPAIRED" = "IMPAIRED"
  val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  val REBOOTING: "REBOOTING" = "REBOOTING"
  val STARTING: "STARTING" = "STARTING"
  val REBUILDING: "REBUILDING" = "REBUILDING"
  val RESTORING: "RESTORING" = "RESTORING"
  val MAINTENANCE: "MAINTENANCE" = "MAINTENANCE"
  val ADMIN_MAINTENANCE: "ADMIN_MAINTENANCE" = "ADMIN_MAINTENANCE"
  val TERMINATING: "TERMINATING" = "TERMINATING"
  val TERMINATED: "TERMINATED" = "TERMINATED"
  val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  val UPDATING: "UPDATING" = "UPDATING"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[WorkspaceState](
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
