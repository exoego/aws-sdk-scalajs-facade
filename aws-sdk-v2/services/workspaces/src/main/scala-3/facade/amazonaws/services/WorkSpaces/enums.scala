package facade.amazonaws.services.workspaces

import scalajs.js

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

type BundleType = "REGULAR" | "STANDBY"
object BundleType {
  inline val REGULAR: "REGULAR" = "REGULAR"
  inline val STANDBY: "STANDBY" = "STANDBY"

  inline def values: js.Array[BundleType] = js.Array(REGULAR, STANDBY)
}

type CertificateBasedAuthStatusEnum = "DISABLED" | "ENABLED"
object CertificateBasedAuthStatusEnum {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[CertificateBasedAuthStatusEnum] = js.Array(DISABLED, ENABLED)
}

type ClientDeviceType = "DeviceTypeWindows" | "DeviceTypeOsx" | "DeviceTypeAndroid" | "DeviceTypeIos" | "DeviceTypeLinux" | "DeviceTypeWeb"
object ClientDeviceType {
  inline val DeviceTypeWindows: "DeviceTypeWindows" = "DeviceTypeWindows"
  inline val DeviceTypeOsx: "DeviceTypeOsx" = "DeviceTypeOsx"
  inline val DeviceTypeAndroid: "DeviceTypeAndroid" = "DeviceTypeAndroid"
  inline val DeviceTypeIos: "DeviceTypeIos" = "DeviceTypeIos"
  inline val DeviceTypeLinux: "DeviceTypeLinux" = "DeviceTypeLinux"
  inline val DeviceTypeWeb: "DeviceTypeWeb" = "DeviceTypeWeb"

  inline def values: js.Array[ClientDeviceType] = js.Array(DeviceTypeWindows, DeviceTypeOsx, DeviceTypeAndroid, DeviceTypeIos, DeviceTypeLinux, DeviceTypeWeb)
}

type Compute = "VALUE" | "STANDARD" | "PERFORMANCE" | "POWER" | "GRAPHICS" | "POWERPRO" | "GRAPHICSPRO" | "GRAPHICS_G4DN" | "GRAPHICSPRO_G4DN"
object Compute {
  inline val VALUE: "VALUE" = "VALUE"
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val PERFORMANCE: "PERFORMANCE" = "PERFORMANCE"
  inline val POWER: "POWER" = "POWER"
  inline val GRAPHICS: "GRAPHICS" = "GRAPHICS"
  inline val POWERPRO: "POWERPRO" = "POWERPRO"
  inline val GRAPHICSPRO: "GRAPHICSPRO" = "GRAPHICSPRO"
  inline val GRAPHICS_G4DN: "GRAPHICS_G4DN" = "GRAPHICS_G4DN"
  inline val GRAPHICSPRO_G4DN: "GRAPHICSPRO_G4DN" = "GRAPHICSPRO_G4DN"

  inline def values: js.Array[Compute] = js.Array(VALUE, STANDARD, PERFORMANCE, POWER, GRAPHICS, POWERPRO, GRAPHICSPRO, GRAPHICS_G4DN, GRAPHICSPRO_G4DN)
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

type DeletableCertificateBasedAuthProperty = "CERTIFICATE_BASED_AUTH_PROPERTIES_CERTIFICATE_AUTHORITY_ARN"
object DeletableCertificateBasedAuthProperty {
  inline val CERTIFICATE_BASED_AUTH_PROPERTIES_CERTIFICATE_AUTHORITY_ARN: "CERTIFICATE_BASED_AUTH_PROPERTIES_CERTIFICATE_AUTHORITY_ARN" = "CERTIFICATE_BASED_AUTH_PROPERTIES_CERTIFICATE_AUTHORITY_ARN"

  inline def values: js.Array[DeletableCertificateBasedAuthProperty] = js.Array(CERTIFICATE_BASED_AUTH_PROPERTIES_CERTIFICATE_AUTHORITY_ARN)
}

type DeletableSamlProperty = "SAML_PROPERTIES_USER_ACCESS_URL" | "SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME"
object DeletableSamlProperty {
  inline val SAML_PROPERTIES_USER_ACCESS_URL: "SAML_PROPERTIES_USER_ACCESS_URL" = "SAML_PROPERTIES_USER_ACCESS_URL"
  inline val SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME: "SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME" = "SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME"

  inline def values: js.Array[DeletableSamlProperty] = js.Array(SAML_PROPERTIES_USER_ACCESS_URL, SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME)
}

type ImageType = "OWNED" | "SHARED"
object ImageType {
  inline val OWNED: "OWNED" = "OWNED"
  inline val SHARED: "SHARED" = "SHARED"

  inline def values: js.Array[ImageType] = js.Array(OWNED, SHARED)
}

type LogUploadEnum = "ENABLED" | "DISABLED"
object LogUploadEnum {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[LogUploadEnum] = js.Array(ENABLED, DISABLED)
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

type Protocol = "PCOIP" | "WSP"
object Protocol {
  inline val PCOIP: "PCOIP" = "PCOIP"
  inline val WSP: "WSP" = "WSP"

  inline def values: js.Array[Protocol] = js.Array(PCOIP, WSP)
}

type ReconnectEnum = "ENABLED" | "DISABLED"
object ReconnectEnum {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ReconnectEnum] = js.Array(ENABLED, DISABLED)
}

type RunningMode = "AUTO_STOP" | "ALWAYS_ON" | "MANUAL"
object RunningMode {
  inline val AUTO_STOP: "AUTO_STOP" = "AUTO_STOP"
  inline val ALWAYS_ON: "ALWAYS_ON" = "ALWAYS_ON"
  inline val MANUAL: "MANUAL" = "MANUAL"

  inline def values: js.Array[RunningMode] = js.Array(AUTO_STOP, ALWAYS_ON, MANUAL)
}

type SamlStatusEnum = "DISABLED" | "ENABLED" | "ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK"
object SamlStatusEnum {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK: "ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK" = "ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK"

  inline def values: js.Array[SamlStatusEnum] = js.Array(DISABLED, ENABLED, ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK)
}

type StandbyWorkspaceRelationshipType = "PRIMARY" | "STANDBY"
object StandbyWorkspaceRelationshipType {
  inline val PRIMARY: "PRIMARY" = "PRIMARY"
  inline val STANDBY: "STANDBY" = "STANDBY"

  inline def values: js.Array[StandbyWorkspaceRelationshipType] = js.Array(PRIMARY, STANDBY)
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

type WorkspaceBundleState = "AVAILABLE" | "PENDING" | "ERROR"
object WorkspaceBundleState {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[WorkspaceBundleState] = js.Array(AVAILABLE, PENDING, ERROR)
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

type WorkspaceImageIngestionProcess = "BYOL_REGULAR" | "BYOL_GRAPHICS" | "BYOL_GRAPHICSPRO" | "BYOL_GRAPHICS_G4DN" | "BYOL_REGULAR_WSP" | "BYOL_REGULAR_BYOP" | "BYOL_GRAPHICS_G4DN_BYOP"
object WorkspaceImageIngestionProcess {
  inline val BYOL_REGULAR: "BYOL_REGULAR" = "BYOL_REGULAR"
  inline val BYOL_GRAPHICS: "BYOL_GRAPHICS" = "BYOL_GRAPHICS"
  inline val BYOL_GRAPHICSPRO: "BYOL_GRAPHICSPRO" = "BYOL_GRAPHICSPRO"
  inline val BYOL_GRAPHICS_G4DN: "BYOL_GRAPHICS_G4DN" = "BYOL_GRAPHICS_G4DN"
  inline val BYOL_REGULAR_WSP: "BYOL_REGULAR_WSP" = "BYOL_REGULAR_WSP"
  inline val BYOL_REGULAR_BYOP: "BYOL_REGULAR_BYOP" = "BYOL_REGULAR_BYOP"
  inline val BYOL_GRAPHICS_G4DN_BYOP: "BYOL_GRAPHICS_G4DN_BYOP" = "BYOL_GRAPHICS_G4DN_BYOP"

  inline def values: js.Array[WorkspaceImageIngestionProcess] = js.Array(BYOL_REGULAR, BYOL_GRAPHICS, BYOL_GRAPHICSPRO, BYOL_GRAPHICS_G4DN, BYOL_REGULAR_WSP, BYOL_REGULAR_BYOP, BYOL_GRAPHICS_G4DN_BYOP)
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
