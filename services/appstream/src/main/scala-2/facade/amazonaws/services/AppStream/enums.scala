package facade.amazonaws.services.appstream

import scalajs.js

@js.native
sealed trait AccessEndpointType extends js.Any
object AccessEndpointType {
  val STREAMING = "STREAMING".asInstanceOf[AccessEndpointType]

  @inline def values: js.Array[AccessEndpointType] = js.Array(STREAMING)
}

@js.native
sealed trait Action extends js.Any
object Action {
  val CLIPBOARD_COPY_FROM_LOCAL_DEVICE = "CLIPBOARD_COPY_FROM_LOCAL_DEVICE".asInstanceOf[Action]
  val CLIPBOARD_COPY_TO_LOCAL_DEVICE = "CLIPBOARD_COPY_TO_LOCAL_DEVICE".asInstanceOf[Action]
  val FILE_UPLOAD = "FILE_UPLOAD".asInstanceOf[Action]
  val FILE_DOWNLOAD = "FILE_DOWNLOAD".asInstanceOf[Action]
  val PRINTING_TO_LOCAL_DEVICE = "PRINTING_TO_LOCAL_DEVICE".asInstanceOf[Action]
  val DOMAIN_PASSWORD_SIGNIN = "DOMAIN_PASSWORD_SIGNIN".asInstanceOf[Action]
  val DOMAIN_SMART_CARD_SIGNIN = "DOMAIN_SMART_CARD_SIGNIN".asInstanceOf[Action]

  @inline def values: js.Array[Action] = js.Array(
    CLIPBOARD_COPY_FROM_LOCAL_DEVICE,
    CLIPBOARD_COPY_TO_LOCAL_DEVICE,
    FILE_UPLOAD,
    FILE_DOWNLOAD,
    PRINTING_TO_LOCAL_DEVICE,
    DOMAIN_PASSWORD_SIGNIN,
    DOMAIN_SMART_CARD_SIGNIN
  )
}

@js.native
sealed trait ApplicationAttribute extends js.Any
object ApplicationAttribute {
  val LAUNCH_PARAMETERS = "LAUNCH_PARAMETERS".asInstanceOf[ApplicationAttribute]
  val WORKING_DIRECTORY = "WORKING_DIRECTORY".asInstanceOf[ApplicationAttribute]

  @inline def values: js.Array[ApplicationAttribute] = js.Array(LAUNCH_PARAMETERS, WORKING_DIRECTORY)
}

@js.native
sealed trait AuthenticationType extends js.Any
object AuthenticationType {
  val API = "API".asInstanceOf[AuthenticationType]
  val SAML = "SAML".asInstanceOf[AuthenticationType]
  val USERPOOL = "USERPOOL".asInstanceOf[AuthenticationType]

  @inline def values: js.Array[AuthenticationType] = js.Array(API, SAML, USERPOOL)
}

/** The fleet attribute.
  */
@js.native
sealed trait FleetAttribute extends js.Any
object FleetAttribute {
  val VPC_CONFIGURATION = "VPC_CONFIGURATION".asInstanceOf[FleetAttribute]
  val VPC_CONFIGURATION_SECURITY_GROUP_IDS = "VPC_CONFIGURATION_SECURITY_GROUP_IDS".asInstanceOf[FleetAttribute]
  val DOMAIN_JOIN_INFO = "DOMAIN_JOIN_INFO".asInstanceOf[FleetAttribute]
  val IAM_ROLE_ARN = "IAM_ROLE_ARN".asInstanceOf[FleetAttribute]
  val USB_DEVICE_FILTER_STRINGS = "USB_DEVICE_FILTER_STRINGS".asInstanceOf[FleetAttribute]

  @inline def values: js.Array[FleetAttribute] = js.Array(VPC_CONFIGURATION, VPC_CONFIGURATION_SECURITY_GROUP_IDS, DOMAIN_JOIN_INFO, IAM_ROLE_ARN, USB_DEVICE_FILTER_STRINGS)
}

@js.native
sealed trait FleetErrorCode extends js.Any
object FleetErrorCode {
  val IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION = "IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION".asInstanceOf[FleetErrorCode]
  val IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION = "IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION".asInstanceOf[FleetErrorCode]
  val IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION = "IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION".asInstanceOf[FleetErrorCode]
  val NETWORK_INTERFACE_LIMIT_EXCEEDED = "NETWORK_INTERFACE_LIMIT_EXCEEDED".asInstanceOf[FleetErrorCode]
  val INTERNAL_SERVICE_ERROR = "INTERNAL_SERVICE_ERROR".asInstanceOf[FleetErrorCode]
  val IAM_SERVICE_ROLE_IS_MISSING = "IAM_SERVICE_ROLE_IS_MISSING".asInstanceOf[FleetErrorCode]
  val MACHINE_ROLE_IS_MISSING = "MACHINE_ROLE_IS_MISSING".asInstanceOf[FleetErrorCode]
  val STS_DISABLED_IN_REGION = "STS_DISABLED_IN_REGION".asInstanceOf[FleetErrorCode]
  val SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES = "SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES".asInstanceOf[FleetErrorCode]
  val IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION = "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION".asInstanceOf[FleetErrorCode]
  val SUBNET_NOT_FOUND = "SUBNET_NOT_FOUND".asInstanceOf[FleetErrorCode]
  val IMAGE_NOT_FOUND = "IMAGE_NOT_FOUND".asInstanceOf[FleetErrorCode]
  val INVALID_SUBNET_CONFIGURATION = "INVALID_SUBNET_CONFIGURATION".asInstanceOf[FleetErrorCode]
  val SECURITY_GROUPS_NOT_FOUND = "SECURITY_GROUPS_NOT_FOUND".asInstanceOf[FleetErrorCode]
  val IGW_NOT_ATTACHED = "IGW_NOT_ATTACHED".asInstanceOf[FleetErrorCode]
  val IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION = "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION".asInstanceOf[FleetErrorCode]
  val FLEET_STOPPED = "FLEET_STOPPED".asInstanceOf[FleetErrorCode]
  val FLEET_INSTANCE_PROVISIONING_FAILURE = "FLEET_INSTANCE_PROVISIONING_FAILURE".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_ERROR_FILE_NOT_FOUND = "DOMAIN_JOIN_ERROR_FILE_NOT_FOUND".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_ERROR_ACCESS_DENIED = "DOMAIN_JOIN_ERROR_ACCESS_DENIED".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_ERROR_LOGON_FAILURE = "DOMAIN_JOIN_ERROR_LOGON_FAILURE".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_ERROR_INVALID_PARAMETER = "DOMAIN_JOIN_ERROR_INVALID_PARAMETER".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_ERROR_MORE_DATA = "DOMAIN_JOIN_ERROR_MORE_DATA".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN = "DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_ERROR_NOT_SUPPORTED = "DOMAIN_JOIN_ERROR_NOT_SUPPORTED".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME = "DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED = "DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED = "DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_NERR_PASSWORD_EXPIRED = "DOMAIN_JOIN_NERR_PASSWORD_EXPIRED".asInstanceOf[FleetErrorCode]
  val DOMAIN_JOIN_INTERNAL_SERVICE_ERROR = "DOMAIN_JOIN_INTERNAL_SERVICE_ERROR".asInstanceOf[FleetErrorCode]

  @inline def values: js.Array[FleetErrorCode] = js.Array(
    IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION,
    IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION,
    IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION,
    NETWORK_INTERFACE_LIMIT_EXCEEDED,
    INTERNAL_SERVICE_ERROR,
    IAM_SERVICE_ROLE_IS_MISSING,
    MACHINE_ROLE_IS_MISSING,
    STS_DISABLED_IN_REGION,
    SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES,
    IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION,
    SUBNET_NOT_FOUND,
    IMAGE_NOT_FOUND,
    INVALID_SUBNET_CONFIGURATION,
    SECURITY_GROUPS_NOT_FOUND,
    IGW_NOT_ATTACHED,
    IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION,
    FLEET_STOPPED,
    FLEET_INSTANCE_PROVISIONING_FAILURE,
    DOMAIN_JOIN_ERROR_FILE_NOT_FOUND,
    DOMAIN_JOIN_ERROR_ACCESS_DENIED,
    DOMAIN_JOIN_ERROR_LOGON_FAILURE,
    DOMAIN_JOIN_ERROR_INVALID_PARAMETER,
    DOMAIN_JOIN_ERROR_MORE_DATA,
    DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN,
    DOMAIN_JOIN_ERROR_NOT_SUPPORTED,
    DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME,
    DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED,
    DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED,
    DOMAIN_JOIN_NERR_PASSWORD_EXPIRED,
    DOMAIN_JOIN_INTERNAL_SERVICE_ERROR
  )
}

@js.native
sealed trait FleetState extends js.Any
object FleetState {
  val STARTING = "STARTING".asInstanceOf[FleetState]
  val RUNNING = "RUNNING".asInstanceOf[FleetState]
  val STOPPING = "STOPPING".asInstanceOf[FleetState]
  val STOPPED = "STOPPED".asInstanceOf[FleetState]

  @inline def values: js.Array[FleetState] = js.Array(STARTING, RUNNING, STOPPING, STOPPED)
}

@js.native
sealed trait FleetType extends js.Any
object FleetType {
  val ALWAYS_ON = "ALWAYS_ON".asInstanceOf[FleetType]
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[FleetType]
  val ELASTIC = "ELASTIC".asInstanceOf[FleetType]

  @inline def values: js.Array[FleetType] = js.Array(ALWAYS_ON, ON_DEMAND, ELASTIC)
}

@js.native
sealed trait ImageBuilderState extends js.Any
object ImageBuilderState {
  val PENDING = "PENDING".asInstanceOf[ImageBuilderState]
  val UPDATING_AGENT = "UPDATING_AGENT".asInstanceOf[ImageBuilderState]
  val RUNNING = "RUNNING".asInstanceOf[ImageBuilderState]
  val STOPPING = "STOPPING".asInstanceOf[ImageBuilderState]
  val STOPPED = "STOPPED".asInstanceOf[ImageBuilderState]
  val REBOOTING = "REBOOTING".asInstanceOf[ImageBuilderState]
  val SNAPSHOTTING = "SNAPSHOTTING".asInstanceOf[ImageBuilderState]
  val DELETING = "DELETING".asInstanceOf[ImageBuilderState]
  val FAILED = "FAILED".asInstanceOf[ImageBuilderState]
  val UPDATING = "UPDATING".asInstanceOf[ImageBuilderState]
  val PENDING_QUALIFICATION = "PENDING_QUALIFICATION".asInstanceOf[ImageBuilderState]

  @inline def values: js.Array[ImageBuilderState] = js.Array(PENDING, UPDATING_AGENT, RUNNING, STOPPING, STOPPED, REBOOTING, SNAPSHOTTING, DELETING, FAILED, UPDATING, PENDING_QUALIFICATION)
}

@js.native
sealed trait ImageBuilderStateChangeReasonCode extends js.Any
object ImageBuilderStateChangeReasonCode {
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ImageBuilderStateChangeReasonCode]
  val IMAGE_UNAVAILABLE = "IMAGE_UNAVAILABLE".asInstanceOf[ImageBuilderStateChangeReasonCode]

  @inline def values: js.Array[ImageBuilderStateChangeReasonCode] = js.Array(INTERNAL_ERROR, IMAGE_UNAVAILABLE)
}

@js.native
sealed trait ImageState extends js.Any
object ImageState {
  val PENDING = "PENDING".asInstanceOf[ImageState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ImageState]
  val FAILED = "FAILED".asInstanceOf[ImageState]
  val COPYING = "COPYING".asInstanceOf[ImageState]
  val DELETING = "DELETING".asInstanceOf[ImageState]
  val CREATING = "CREATING".asInstanceOf[ImageState]
  val IMPORTING = "IMPORTING".asInstanceOf[ImageState]

  @inline def values: js.Array[ImageState] = js.Array(PENDING, AVAILABLE, FAILED, COPYING, DELETING, CREATING, IMPORTING)
}

@js.native
sealed trait ImageStateChangeReasonCode extends js.Any
object ImageStateChangeReasonCode {
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ImageStateChangeReasonCode]
  val IMAGE_BUILDER_NOT_AVAILABLE = "IMAGE_BUILDER_NOT_AVAILABLE".asInstanceOf[ImageStateChangeReasonCode]
  val IMAGE_COPY_FAILURE = "IMAGE_COPY_FAILURE".asInstanceOf[ImageStateChangeReasonCode]

  @inline def values: js.Array[ImageStateChangeReasonCode] = js.Array(INTERNAL_ERROR, IMAGE_BUILDER_NOT_AVAILABLE, IMAGE_COPY_FAILURE)
}

@js.native
sealed trait MessageAction extends js.Any
object MessageAction {
  val SUPPRESS = "SUPPRESS".asInstanceOf[MessageAction]
  val RESEND = "RESEND".asInstanceOf[MessageAction]

  @inline def values: js.Array[MessageAction] = js.Array(SUPPRESS, RESEND)
}

@js.native
sealed trait Permission extends js.Any
object Permission {
  val ENABLED = "ENABLED".asInstanceOf[Permission]
  val DISABLED = "DISABLED".asInstanceOf[Permission]

  @inline def values: js.Array[Permission] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait PlatformType extends js.Any
object PlatformType {
  val WINDOWS = "WINDOWS".asInstanceOf[PlatformType]
  val WINDOWS_SERVER_2016 = "WINDOWS_SERVER_2016".asInstanceOf[PlatformType]
  val WINDOWS_SERVER_2019 = "WINDOWS_SERVER_2019".asInstanceOf[PlatformType]
  val AMAZON_LINUX2 = "AMAZON_LINUX2".asInstanceOf[PlatformType]

  @inline def values: js.Array[PlatformType] = js.Array(WINDOWS, WINDOWS_SERVER_2016, WINDOWS_SERVER_2019, AMAZON_LINUX2)
}

@js.native
sealed trait SessionConnectionState extends js.Any
object SessionConnectionState {
  val CONNECTED = "CONNECTED".asInstanceOf[SessionConnectionState]
  val NOT_CONNECTED = "NOT_CONNECTED".asInstanceOf[SessionConnectionState]

  @inline def values: js.Array[SessionConnectionState] = js.Array(CONNECTED, NOT_CONNECTED)
}

/** Possible values for the state of a streaming session.
  */
@js.native
sealed trait SessionState extends js.Any
object SessionState {
  val ACTIVE = "ACTIVE".asInstanceOf[SessionState]
  val PENDING = "PENDING".asInstanceOf[SessionState]
  val EXPIRED = "EXPIRED".asInstanceOf[SessionState]

  @inline def values: js.Array[SessionState] = js.Array(ACTIVE, PENDING, EXPIRED)
}

@js.native
sealed trait StackAttribute extends js.Any
object StackAttribute {
  val STORAGE_CONNECTORS = "STORAGE_CONNECTORS".asInstanceOf[StackAttribute]
  val STORAGE_CONNECTOR_HOMEFOLDERS = "STORAGE_CONNECTOR_HOMEFOLDERS".asInstanceOf[StackAttribute]
  val STORAGE_CONNECTOR_GOOGLE_DRIVE = "STORAGE_CONNECTOR_GOOGLE_DRIVE".asInstanceOf[StackAttribute]
  val STORAGE_CONNECTOR_ONE_DRIVE = "STORAGE_CONNECTOR_ONE_DRIVE".asInstanceOf[StackAttribute]
  val REDIRECT_URL = "REDIRECT_URL".asInstanceOf[StackAttribute]
  val FEEDBACK_URL = "FEEDBACK_URL".asInstanceOf[StackAttribute]
  val THEME_NAME = "THEME_NAME".asInstanceOf[StackAttribute]
  val USER_SETTINGS = "USER_SETTINGS".asInstanceOf[StackAttribute]
  val EMBED_HOST_DOMAINS = "EMBED_HOST_DOMAINS".asInstanceOf[StackAttribute]
  val IAM_ROLE_ARN = "IAM_ROLE_ARN".asInstanceOf[StackAttribute]
  val ACCESS_ENDPOINTS = "ACCESS_ENDPOINTS".asInstanceOf[StackAttribute]

  @inline def values: js.Array[StackAttribute] = js.Array(
    STORAGE_CONNECTORS,
    STORAGE_CONNECTOR_HOMEFOLDERS,
    STORAGE_CONNECTOR_GOOGLE_DRIVE,
    STORAGE_CONNECTOR_ONE_DRIVE,
    REDIRECT_URL,
    FEEDBACK_URL,
    THEME_NAME,
    USER_SETTINGS,
    EMBED_HOST_DOMAINS,
    IAM_ROLE_ARN,
    ACCESS_ENDPOINTS
  )
}

@js.native
sealed trait StackErrorCode extends js.Any
object StackErrorCode {
  val STORAGE_CONNECTOR_ERROR = "STORAGE_CONNECTOR_ERROR".asInstanceOf[StackErrorCode]
  val INTERNAL_SERVICE_ERROR = "INTERNAL_SERVICE_ERROR".asInstanceOf[StackErrorCode]

  @inline def values: js.Array[StackErrorCode] = js.Array(STORAGE_CONNECTOR_ERROR, INTERNAL_SERVICE_ERROR)
}

/** The type of storage connector.
  */
@js.native
sealed trait StorageConnectorType extends js.Any
object StorageConnectorType {
  val HOMEFOLDERS = "HOMEFOLDERS".asInstanceOf[StorageConnectorType]
  val GOOGLE_DRIVE = "GOOGLE_DRIVE".asInstanceOf[StorageConnectorType]
  val ONE_DRIVE = "ONE_DRIVE".asInstanceOf[StorageConnectorType]

  @inline def values: js.Array[StorageConnectorType] = js.Array(HOMEFOLDERS, GOOGLE_DRIVE, ONE_DRIVE)
}

@js.native
sealed trait StreamView extends js.Any
object StreamView {
  val APP = "APP".asInstanceOf[StreamView]
  val DESKTOP = "DESKTOP".asInstanceOf[StreamView]

  @inline def values: js.Array[StreamView] = js.Array(APP, DESKTOP)
}

@js.native
sealed trait UsageReportExecutionErrorCode extends js.Any
object UsageReportExecutionErrorCode {
  val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND".asInstanceOf[UsageReportExecutionErrorCode]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[UsageReportExecutionErrorCode]
  val INTERNAL_SERVICE_ERROR = "INTERNAL_SERVICE_ERROR".asInstanceOf[UsageReportExecutionErrorCode]

  @inline def values: js.Array[UsageReportExecutionErrorCode] = js.Array(RESOURCE_NOT_FOUND, ACCESS_DENIED, INTERNAL_SERVICE_ERROR)
}

@js.native
sealed trait UsageReportSchedule extends js.Any
object UsageReportSchedule {
  val DAILY = "DAILY".asInstanceOf[UsageReportSchedule]

  @inline def values: js.Array[UsageReportSchedule] = js.Array(DAILY)
}

@js.native
sealed trait UserStackAssociationErrorCode extends js.Any
object UserStackAssociationErrorCode {
  val STACK_NOT_FOUND = "STACK_NOT_FOUND".asInstanceOf[UserStackAssociationErrorCode]
  val USER_NAME_NOT_FOUND = "USER_NAME_NOT_FOUND".asInstanceOf[UserStackAssociationErrorCode]
  val DIRECTORY_NOT_FOUND = "DIRECTORY_NOT_FOUND".asInstanceOf[UserStackAssociationErrorCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[UserStackAssociationErrorCode]

  @inline def values: js.Array[UserStackAssociationErrorCode] = js.Array(STACK_NOT_FOUND, USER_NAME_NOT_FOUND, DIRECTORY_NOT_FOUND, INTERNAL_ERROR)
}

@js.native
sealed trait VisibilityType extends js.Any
object VisibilityType {
  val PUBLIC = "PUBLIC".asInstanceOf[VisibilityType]
  val PRIVATE = "PRIVATE".asInstanceOf[VisibilityType]
  val SHARED = "SHARED".asInstanceOf[VisibilityType]

  @inline def values: js.Array[VisibilityType] = js.Array(PUBLIC, PRIVATE, SHARED)
}
