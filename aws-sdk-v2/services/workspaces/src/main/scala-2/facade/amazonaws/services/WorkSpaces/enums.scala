package facade.amazonaws.services.workspaces

import scalajs.js

@js.native
sealed trait AccessPropertyValue extends js.Any
object AccessPropertyValue {
  val ALLOW = "ALLOW".asInstanceOf[AccessPropertyValue]
  val DENY = "DENY".asInstanceOf[AccessPropertyValue]

  @inline def values: js.Array[AccessPropertyValue] = js.Array(ALLOW, DENY)
}

@js.native
sealed trait Application extends js.Any
object Application {
  val Microsoft_Office_2016 = "Microsoft_Office_2016".asInstanceOf[Application]
  val Microsoft_Office_2019 = "Microsoft_Office_2019".asInstanceOf[Application]

  @inline def values: js.Array[Application] = js.Array(Microsoft_Office_2016, Microsoft_Office_2019)
}

@js.native
sealed trait AssociationStatus extends js.Any
object AssociationStatus {
  val NOT_ASSOCIATED = "NOT_ASSOCIATED".asInstanceOf[AssociationStatus]
  val ASSOCIATED_WITH_OWNER_ACCOUNT = "ASSOCIATED_WITH_OWNER_ACCOUNT".asInstanceOf[AssociationStatus]
  val ASSOCIATED_WITH_SHARED_ACCOUNT = "ASSOCIATED_WITH_SHARED_ACCOUNT".asInstanceOf[AssociationStatus]
  val PENDING_ASSOCIATION = "PENDING_ASSOCIATION".asInstanceOf[AssociationStatus]
  val PENDING_DISASSOCIATION = "PENDING_DISASSOCIATION".asInstanceOf[AssociationStatus]

  @inline def values: js.Array[AssociationStatus] = js.Array(NOT_ASSOCIATED, ASSOCIATED_WITH_OWNER_ACCOUNT, ASSOCIATED_WITH_SHARED_ACCOUNT, PENDING_ASSOCIATION, PENDING_DISASSOCIATION)
}

@js.native
sealed trait BundleType extends js.Any
object BundleType {
  val REGULAR = "REGULAR".asInstanceOf[BundleType]
  val STANDBY = "STANDBY".asInstanceOf[BundleType]

  @inline def values: js.Array[BundleType] = js.Array(REGULAR, STANDBY)
}

@js.native
sealed trait CertificateBasedAuthStatusEnum extends js.Any
object CertificateBasedAuthStatusEnum {
  val DISABLED = "DISABLED".asInstanceOf[CertificateBasedAuthStatusEnum]
  val ENABLED = "ENABLED".asInstanceOf[CertificateBasedAuthStatusEnum]

  @inline def values: js.Array[CertificateBasedAuthStatusEnum] = js.Array(DISABLED, ENABLED)
}

@js.native
sealed trait ClientDeviceType extends js.Any
object ClientDeviceType {
  val DeviceTypeWindows = "DeviceTypeWindows".asInstanceOf[ClientDeviceType]
  val DeviceTypeOsx = "DeviceTypeOsx".asInstanceOf[ClientDeviceType]
  val DeviceTypeAndroid = "DeviceTypeAndroid".asInstanceOf[ClientDeviceType]
  val DeviceTypeIos = "DeviceTypeIos".asInstanceOf[ClientDeviceType]
  val DeviceTypeLinux = "DeviceTypeLinux".asInstanceOf[ClientDeviceType]
  val DeviceTypeWeb = "DeviceTypeWeb".asInstanceOf[ClientDeviceType]

  @inline def values: js.Array[ClientDeviceType] = js.Array(DeviceTypeWindows, DeviceTypeOsx, DeviceTypeAndroid, DeviceTypeIos, DeviceTypeLinux, DeviceTypeWeb)
}

@js.native
sealed trait Compute extends js.Any
object Compute {
  val VALUE = "VALUE".asInstanceOf[Compute]
  val STANDARD = "STANDARD".asInstanceOf[Compute]
  val PERFORMANCE = "PERFORMANCE".asInstanceOf[Compute]
  val POWER = "POWER".asInstanceOf[Compute]
  val GRAPHICS = "GRAPHICS".asInstanceOf[Compute]
  val POWERPRO = "POWERPRO".asInstanceOf[Compute]
  val GRAPHICSPRO = "GRAPHICSPRO".asInstanceOf[Compute]
  val GRAPHICS_G4DN = "GRAPHICS_G4DN".asInstanceOf[Compute]
  val GRAPHICSPRO_G4DN = "GRAPHICSPRO_G4DN".asInstanceOf[Compute]

  @inline def values: js.Array[Compute] = js.Array(VALUE, STANDARD, PERFORMANCE, POWER, GRAPHICS, POWERPRO, GRAPHICSPRO, GRAPHICS_G4DN, GRAPHICSPRO_G4DN)
}

@js.native
sealed trait ConnectionAliasState extends js.Any
object ConnectionAliasState {
  val CREATING = "CREATING".asInstanceOf[ConnectionAliasState]
  val CREATED = "CREATED".asInstanceOf[ConnectionAliasState]
  val DELETING = "DELETING".asInstanceOf[ConnectionAliasState]

  @inline def values: js.Array[ConnectionAliasState] = js.Array(CREATING, CREATED, DELETING)
}

@js.native
sealed trait ConnectionState extends js.Any
object ConnectionState {
  val CONNECTED = "CONNECTED".asInstanceOf[ConnectionState]
  val DISCONNECTED = "DISCONNECTED".asInstanceOf[ConnectionState]
  val UNKNOWN = "UNKNOWN".asInstanceOf[ConnectionState]

  @inline def values: js.Array[ConnectionState] = js.Array(CONNECTED, DISCONNECTED, UNKNOWN)
}

@js.native
sealed trait DedicatedTenancyModificationStateEnum extends js.Any
object DedicatedTenancyModificationStateEnum {
  val PENDING = "PENDING".asInstanceOf[DedicatedTenancyModificationStateEnum]
  val COMPLETED = "COMPLETED".asInstanceOf[DedicatedTenancyModificationStateEnum]
  val FAILED = "FAILED".asInstanceOf[DedicatedTenancyModificationStateEnum]

  @inline def values: js.Array[DedicatedTenancyModificationStateEnum] = js.Array(PENDING, COMPLETED, FAILED)
}

@js.native
sealed trait DedicatedTenancySupportEnum extends js.Any
object DedicatedTenancySupportEnum {
  val ENABLED = "ENABLED".asInstanceOf[DedicatedTenancySupportEnum]

  @inline def values: js.Array[DedicatedTenancySupportEnum] = js.Array(ENABLED)
}

@js.native
sealed trait DedicatedTenancySupportResultEnum extends js.Any
object DedicatedTenancySupportResultEnum {
  val ENABLED = "ENABLED".asInstanceOf[DedicatedTenancySupportResultEnum]
  val DISABLED = "DISABLED".asInstanceOf[DedicatedTenancySupportResultEnum]

  @inline def values: js.Array[DedicatedTenancySupportResultEnum] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait DeletableCertificateBasedAuthProperty extends js.Any
object DeletableCertificateBasedAuthProperty {
  val CERTIFICATE_BASED_AUTH_PROPERTIES_CERTIFICATE_AUTHORITY_ARN = "CERTIFICATE_BASED_AUTH_PROPERTIES_CERTIFICATE_AUTHORITY_ARN".asInstanceOf[DeletableCertificateBasedAuthProperty]

  @inline def values: js.Array[DeletableCertificateBasedAuthProperty] = js.Array(CERTIFICATE_BASED_AUTH_PROPERTIES_CERTIFICATE_AUTHORITY_ARN)
}

@js.native
sealed trait DeletableSamlProperty extends js.Any
object DeletableSamlProperty {
  val SAML_PROPERTIES_USER_ACCESS_URL = "SAML_PROPERTIES_USER_ACCESS_URL".asInstanceOf[DeletableSamlProperty]
  val SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME = "SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME".asInstanceOf[DeletableSamlProperty]

  @inline def values: js.Array[DeletableSamlProperty] = js.Array(SAML_PROPERTIES_USER_ACCESS_URL, SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME)
}

@js.native
sealed trait ImageType extends js.Any
object ImageType {
  val OWNED = "OWNED".asInstanceOf[ImageType]
  val SHARED = "SHARED".asInstanceOf[ImageType]

  @inline def values: js.Array[ImageType] = js.Array(OWNED, SHARED)
}

@js.native
sealed trait LogUploadEnum extends js.Any
object LogUploadEnum {
  val ENABLED = "ENABLED".asInstanceOf[LogUploadEnum]
  val DISABLED = "DISABLED".asInstanceOf[LogUploadEnum]

  @inline def values: js.Array[LogUploadEnum] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait ModificationResourceEnum extends js.Any
object ModificationResourceEnum {
  val ROOT_VOLUME = "ROOT_VOLUME".asInstanceOf[ModificationResourceEnum]
  val USER_VOLUME = "USER_VOLUME".asInstanceOf[ModificationResourceEnum]
  val COMPUTE_TYPE = "COMPUTE_TYPE".asInstanceOf[ModificationResourceEnum]

  @inline def values: js.Array[ModificationResourceEnum] = js.Array(ROOT_VOLUME, USER_VOLUME, COMPUTE_TYPE)
}

@js.native
sealed trait ModificationStateEnum extends js.Any
object ModificationStateEnum {
  val UPDATE_INITIATED = "UPDATE_INITIATED".asInstanceOf[ModificationStateEnum]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[ModificationStateEnum]

  @inline def values: js.Array[ModificationStateEnum] = js.Array(UPDATE_INITIATED, UPDATE_IN_PROGRESS)
}

@js.native
sealed trait OperatingSystemType extends js.Any
object OperatingSystemType {
  val WINDOWS = "WINDOWS".asInstanceOf[OperatingSystemType]
  val LINUX = "LINUX".asInstanceOf[OperatingSystemType]

  @inline def values: js.Array[OperatingSystemType] = js.Array(WINDOWS, LINUX)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val PCOIP = "PCOIP".asInstanceOf[Protocol]
  val WSP = "WSP".asInstanceOf[Protocol]

  @inline def values: js.Array[Protocol] = js.Array(PCOIP, WSP)
}

@js.native
sealed trait ReconnectEnum extends js.Any
object ReconnectEnum {
  val ENABLED = "ENABLED".asInstanceOf[ReconnectEnum]
  val DISABLED = "DISABLED".asInstanceOf[ReconnectEnum]

  @inline def values: js.Array[ReconnectEnum] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait RunningMode extends js.Any
object RunningMode {
  val AUTO_STOP = "AUTO_STOP".asInstanceOf[RunningMode]
  val ALWAYS_ON = "ALWAYS_ON".asInstanceOf[RunningMode]
  val MANUAL = "MANUAL".asInstanceOf[RunningMode]

  @inline def values: js.Array[RunningMode] = js.Array(AUTO_STOP, ALWAYS_ON, MANUAL)
}

@js.native
sealed trait SamlStatusEnum extends js.Any
object SamlStatusEnum {
  val DISABLED = "DISABLED".asInstanceOf[SamlStatusEnum]
  val ENABLED = "ENABLED".asInstanceOf[SamlStatusEnum]
  val ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK = "ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK".asInstanceOf[SamlStatusEnum]

  @inline def values: js.Array[SamlStatusEnum] = js.Array(DISABLED, ENABLED, ENABLED_WITH_DIRECTORY_LOGIN_FALLBACK)
}

@js.native
sealed trait StandbyWorkspaceRelationshipType extends js.Any
object StandbyWorkspaceRelationshipType {
  val PRIMARY = "PRIMARY".asInstanceOf[StandbyWorkspaceRelationshipType]
  val STANDBY = "STANDBY".asInstanceOf[StandbyWorkspaceRelationshipType]

  @inline def values: js.Array[StandbyWorkspaceRelationshipType] = js.Array(PRIMARY, STANDBY)
}

@js.native
sealed trait TargetWorkspaceState extends js.Any
object TargetWorkspaceState {
  val AVAILABLE = "AVAILABLE".asInstanceOf[TargetWorkspaceState]
  val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE".asInstanceOf[TargetWorkspaceState]

  @inline def values: js.Array[TargetWorkspaceState] = js.Array(AVAILABLE, ADMIN_MAINTENANCE)
}

@js.native
sealed trait Tenancy extends js.Any
object Tenancy {
  val DEDICATED = "DEDICATED".asInstanceOf[Tenancy]
  val SHARED = "SHARED".asInstanceOf[Tenancy]

  @inline def values: js.Array[Tenancy] = js.Array(DEDICATED, SHARED)
}

@js.native
sealed trait WorkspaceBundleState extends js.Any
object WorkspaceBundleState {
  val AVAILABLE = "AVAILABLE".asInstanceOf[WorkspaceBundleState]
  val PENDING = "PENDING".asInstanceOf[WorkspaceBundleState]
  val ERROR = "ERROR".asInstanceOf[WorkspaceBundleState]

  @inline def values: js.Array[WorkspaceBundleState] = js.Array(AVAILABLE, PENDING, ERROR)
}

@js.native
sealed trait WorkspaceDirectoryState extends js.Any
object WorkspaceDirectoryState {
  val REGISTERING = "REGISTERING".asInstanceOf[WorkspaceDirectoryState]
  val REGISTERED = "REGISTERED".asInstanceOf[WorkspaceDirectoryState]
  val DEREGISTERING = "DEREGISTERING".asInstanceOf[WorkspaceDirectoryState]
  val DEREGISTERED = "DEREGISTERED".asInstanceOf[WorkspaceDirectoryState]
  val ERROR = "ERROR".asInstanceOf[WorkspaceDirectoryState]

  @inline def values: js.Array[WorkspaceDirectoryState] = js.Array(REGISTERING, REGISTERED, DEREGISTERING, DEREGISTERED, ERROR)
}

@js.native
sealed trait WorkspaceDirectoryType extends js.Any
object WorkspaceDirectoryType {
  val SIMPLE_AD = "SIMPLE_AD".asInstanceOf[WorkspaceDirectoryType]
  val AD_CONNECTOR = "AD_CONNECTOR".asInstanceOf[WorkspaceDirectoryType]

  @inline def values: js.Array[WorkspaceDirectoryType] = js.Array(SIMPLE_AD, AD_CONNECTOR)
}

@js.native
sealed trait WorkspaceImageIngestionProcess extends js.Any
object WorkspaceImageIngestionProcess {
  val BYOL_REGULAR = "BYOL_REGULAR".asInstanceOf[WorkspaceImageIngestionProcess]
  val BYOL_GRAPHICS = "BYOL_GRAPHICS".asInstanceOf[WorkspaceImageIngestionProcess]
  val BYOL_GRAPHICSPRO = "BYOL_GRAPHICSPRO".asInstanceOf[WorkspaceImageIngestionProcess]
  val BYOL_GRAPHICS_G4DN = "BYOL_GRAPHICS_G4DN".asInstanceOf[WorkspaceImageIngestionProcess]
  val BYOL_REGULAR_WSP = "BYOL_REGULAR_WSP".asInstanceOf[WorkspaceImageIngestionProcess]
  val BYOL_REGULAR_BYOP = "BYOL_REGULAR_BYOP".asInstanceOf[WorkspaceImageIngestionProcess]
  val BYOL_GRAPHICS_G4DN_BYOP = "BYOL_GRAPHICS_G4DN_BYOP".asInstanceOf[WorkspaceImageIngestionProcess]

  @inline def values: js.Array[WorkspaceImageIngestionProcess] = js.Array(BYOL_REGULAR, BYOL_GRAPHICS, BYOL_GRAPHICSPRO, BYOL_GRAPHICS_G4DN, BYOL_REGULAR_WSP, BYOL_REGULAR_BYOP, BYOL_GRAPHICS_G4DN_BYOP)
}

@js.native
sealed trait WorkspaceImageRequiredTenancy extends js.Any
object WorkspaceImageRequiredTenancy {
  val DEFAULT = "DEFAULT".asInstanceOf[WorkspaceImageRequiredTenancy]
  val DEDICATED = "DEDICATED".asInstanceOf[WorkspaceImageRequiredTenancy]

  @inline def values: js.Array[WorkspaceImageRequiredTenancy] = js.Array(DEFAULT, DEDICATED)
}

@js.native
sealed trait WorkspaceImageState extends js.Any
object WorkspaceImageState {
  val AVAILABLE = "AVAILABLE".asInstanceOf[WorkspaceImageState]
  val PENDING = "PENDING".asInstanceOf[WorkspaceImageState]
  val ERROR = "ERROR".asInstanceOf[WorkspaceImageState]

  @inline def values: js.Array[WorkspaceImageState] = js.Array(AVAILABLE, PENDING, ERROR)
}

@js.native
sealed trait WorkspaceState extends js.Any
object WorkspaceState {
  val PENDING = "PENDING".asInstanceOf[WorkspaceState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[WorkspaceState]
  val IMPAIRED = "IMPAIRED".asInstanceOf[WorkspaceState]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[WorkspaceState]
  val REBOOTING = "REBOOTING".asInstanceOf[WorkspaceState]
  val STARTING = "STARTING".asInstanceOf[WorkspaceState]
  val REBUILDING = "REBUILDING".asInstanceOf[WorkspaceState]
  val RESTORING = "RESTORING".asInstanceOf[WorkspaceState]
  val MAINTENANCE = "MAINTENANCE".asInstanceOf[WorkspaceState]
  val ADMIN_MAINTENANCE = "ADMIN_MAINTENANCE".asInstanceOf[WorkspaceState]
  val TERMINATING = "TERMINATING".asInstanceOf[WorkspaceState]
  val TERMINATED = "TERMINATED".asInstanceOf[WorkspaceState]
  val SUSPENDED = "SUSPENDED".asInstanceOf[WorkspaceState]
  val UPDATING = "UPDATING".asInstanceOf[WorkspaceState]
  val STOPPING = "STOPPING".asInstanceOf[WorkspaceState]
  val STOPPED = "STOPPED".asInstanceOf[WorkspaceState]
  val ERROR = "ERROR".asInstanceOf[WorkspaceState]

  @inline def values: js.Array[WorkspaceState] = js.Array(
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
