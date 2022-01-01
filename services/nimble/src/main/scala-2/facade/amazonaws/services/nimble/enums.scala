package facade.amazonaws.services.nimble

import scalajs.js

@js.native
sealed trait LaunchProfilePersona extends js.Any
object LaunchProfilePersona {
  val USER = "USER".asInstanceOf[LaunchProfilePersona]

  @inline def values: js.Array[LaunchProfilePersona] = js.Array(USER)
}

@js.native
sealed trait LaunchProfilePlatform extends js.Any
object LaunchProfilePlatform {
  val LINUX = "LINUX".asInstanceOf[LaunchProfilePlatform]
  val WINDOWS = "WINDOWS".asInstanceOf[LaunchProfilePlatform]

  @inline def values: js.Array[LaunchProfilePlatform] = js.Array(LINUX, WINDOWS)
}

@js.native
sealed trait LaunchProfileState extends js.Any
object LaunchProfileState {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[LaunchProfileState]
  val READY = "READY".asInstanceOf[LaunchProfileState]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[LaunchProfileState]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[LaunchProfileState]
  val DELETED = "DELETED".asInstanceOf[LaunchProfileState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[LaunchProfileState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[LaunchProfileState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[LaunchProfileState]

  @inline def values: js.Array[LaunchProfileState] = js.Array(CREATE_IN_PROGRESS, READY, UPDATE_IN_PROGRESS, DELETE_IN_PROGRESS, DELETED, DELETE_FAILED, CREATE_FAILED, UPDATE_FAILED)
}

@js.native
sealed trait LaunchProfileStatusCode extends js.Any
object LaunchProfileStatusCode {
  val LAUNCH_PROFILE_CREATED = "LAUNCH_PROFILE_CREATED".asInstanceOf[LaunchProfileStatusCode]
  val LAUNCH_PROFILE_UPDATED = "LAUNCH_PROFILE_UPDATED".asInstanceOf[LaunchProfileStatusCode]
  val LAUNCH_PROFILE_DELETED = "LAUNCH_PROFILE_DELETED".asInstanceOf[LaunchProfileStatusCode]
  val LAUNCH_PROFILE_CREATE_IN_PROGRESS = "LAUNCH_PROFILE_CREATE_IN_PROGRESS".asInstanceOf[LaunchProfileStatusCode]
  val LAUNCH_PROFILE_UPDATE_IN_PROGRESS = "LAUNCH_PROFILE_UPDATE_IN_PROGRESS".asInstanceOf[LaunchProfileStatusCode]
  val LAUNCH_PROFILE_DELETE_IN_PROGRESS = "LAUNCH_PROFILE_DELETE_IN_PROGRESS".asInstanceOf[LaunchProfileStatusCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[LaunchProfileStatusCode]
  val STREAMING_IMAGE_NOT_FOUND = "STREAMING_IMAGE_NOT_FOUND".asInstanceOf[LaunchProfileStatusCode]
  val STREAMING_IMAGE_NOT_READY = "STREAMING_IMAGE_NOT_READY".asInstanceOf[LaunchProfileStatusCode]
  val LAUNCH_PROFILE_WITH_STREAM_SESSIONS_NOT_DELETED = "LAUNCH_PROFILE_WITH_STREAM_SESSIONS_NOT_DELETED".asInstanceOf[LaunchProfileStatusCode]
  val ENCRYPTION_KEY_ACCESS_DENIED = "ENCRYPTION_KEY_ACCESS_DENIED".asInstanceOf[LaunchProfileStatusCode]
  val ENCRYPTION_KEY_NOT_FOUND = "ENCRYPTION_KEY_NOT_FOUND".asInstanceOf[LaunchProfileStatusCode]
  val INVALID_SUBNETS_PROVIDED = "INVALID_SUBNETS_PROVIDED".asInstanceOf[LaunchProfileStatusCode]

  @inline def values: js.Array[LaunchProfileStatusCode] = js.Array(
    LAUNCH_PROFILE_CREATED,
    LAUNCH_PROFILE_UPDATED,
    LAUNCH_PROFILE_DELETED,
    LAUNCH_PROFILE_CREATE_IN_PROGRESS,
    LAUNCH_PROFILE_UPDATE_IN_PROGRESS,
    LAUNCH_PROFILE_DELETE_IN_PROGRESS,
    INTERNAL_ERROR,
    STREAMING_IMAGE_NOT_FOUND,
    STREAMING_IMAGE_NOT_READY,
    LAUNCH_PROFILE_WITH_STREAM_SESSIONS_NOT_DELETED,
    ENCRYPTION_KEY_ACCESS_DENIED,
    ENCRYPTION_KEY_NOT_FOUND,
    INVALID_SUBNETS_PROVIDED
  )
}

@js.native
sealed trait StreamingClipboardMode extends js.Any
object StreamingClipboardMode {
  val ENABLED = "ENABLED".asInstanceOf[StreamingClipboardMode]
  val DISABLED = "DISABLED".asInstanceOf[StreamingClipboardMode]

  @inline def values: js.Array[StreamingClipboardMode] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait StreamingImageEncryptionConfigurationKeyType extends js.Any
object StreamingImageEncryptionConfigurationKeyType {
  val CUSTOMER_MANAGED_KEY = "CUSTOMER_MANAGED_KEY".asInstanceOf[StreamingImageEncryptionConfigurationKeyType]

  @inline def values: js.Array[StreamingImageEncryptionConfigurationKeyType] = js.Array(CUSTOMER_MANAGED_KEY)
}

@js.native
sealed trait StreamingImageState extends js.Any
object StreamingImageState {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[StreamingImageState]
  val READY = "READY".asInstanceOf[StreamingImageState]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[StreamingImageState]
  val DELETED = "DELETED".asInstanceOf[StreamingImageState]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[StreamingImageState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[StreamingImageState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[StreamingImageState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[StreamingImageState]

  @inline def values: js.Array[StreamingImageState] = js.Array(CREATE_IN_PROGRESS, READY, DELETE_IN_PROGRESS, DELETED, UPDATE_IN_PROGRESS, UPDATE_FAILED, CREATE_FAILED, DELETE_FAILED)
}

/** The status code.
  */
@js.native
sealed trait StreamingImageStatusCode extends js.Any
object StreamingImageStatusCode {
  val STREAMING_IMAGE_CREATE_IN_PROGRESS = "STREAMING_IMAGE_CREATE_IN_PROGRESS".asInstanceOf[StreamingImageStatusCode]
  val STREAMING_IMAGE_READY = "STREAMING_IMAGE_READY".asInstanceOf[StreamingImageStatusCode]
  val STREAMING_IMAGE_DELETE_IN_PROGRESS = "STREAMING_IMAGE_DELETE_IN_PROGRESS".asInstanceOf[StreamingImageStatusCode]
  val STREAMING_IMAGE_DELETED = "STREAMING_IMAGE_DELETED".asInstanceOf[StreamingImageStatusCode]
  val STREAMING_IMAGE_UPDATE_IN_PROGRESS = "STREAMING_IMAGE_UPDATE_IN_PROGRESS".asInstanceOf[StreamingImageStatusCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[StreamingImageStatusCode]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[StreamingImageStatusCode]

  @inline def values: js.Array[StreamingImageStatusCode] = js.Array(
    STREAMING_IMAGE_CREATE_IN_PROGRESS,
    STREAMING_IMAGE_READY,
    STREAMING_IMAGE_DELETE_IN_PROGRESS,
    STREAMING_IMAGE_DELETED,
    STREAMING_IMAGE_UPDATE_IN_PROGRESS,
    INTERNAL_ERROR,
    ACCESS_DENIED
  )
}

@js.native
sealed trait StreamingInstanceType extends js.Any
object StreamingInstanceType {
  val `g4dn.xlarge` = "g4dn.xlarge".asInstanceOf[StreamingInstanceType]
  val `g4dn.2xlarge` = "g4dn.2xlarge".asInstanceOf[StreamingInstanceType]
  val `g4dn.4xlarge` = "g4dn.4xlarge".asInstanceOf[StreamingInstanceType]
  val `g4dn.8xlarge` = "g4dn.8xlarge".asInstanceOf[StreamingInstanceType]
  val `g4dn.12xlarge` = "g4dn.12xlarge".asInstanceOf[StreamingInstanceType]
  val `g4dn.16xlarge` = "g4dn.16xlarge".asInstanceOf[StreamingInstanceType]

  @inline def values: js.Array[StreamingInstanceType] = js.Array(`g4dn.xlarge`, `g4dn.2xlarge`, `g4dn.4xlarge`, `g4dn.8xlarge`, `g4dn.12xlarge`, `g4dn.16xlarge`)
}

/** The streaming session state.
  */
@js.native
sealed trait StreamingSessionState extends js.Any
object StreamingSessionState {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[StreamingSessionState]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[StreamingSessionState]
  val READY = "READY".asInstanceOf[StreamingSessionState]
  val DELETED = "DELETED".asInstanceOf[StreamingSessionState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[StreamingSessionState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[StreamingSessionState]
  val STOP_IN_PROGRESS = "STOP_IN_PROGRESS".asInstanceOf[StreamingSessionState]
  val START_IN_PROGRESS = "START_IN_PROGRESS".asInstanceOf[StreamingSessionState]
  val STOPPED = "STOPPED".asInstanceOf[StreamingSessionState]
  val STOP_FAILED = "STOP_FAILED".asInstanceOf[StreamingSessionState]
  val START_FAILED = "START_FAILED".asInstanceOf[StreamingSessionState]

  @inline def values: js.Array[StreamingSessionState] = js.Array(CREATE_IN_PROGRESS, DELETE_IN_PROGRESS, READY, DELETED, CREATE_FAILED, DELETE_FAILED, STOP_IN_PROGRESS, START_IN_PROGRESS, STOPPED, STOP_FAILED, START_FAILED)
}

@js.native
sealed trait StreamingSessionStatusCode extends js.Any
object StreamingSessionStatusCode {
  val STREAMING_SESSION_READY = "STREAMING_SESSION_READY".asInstanceOf[StreamingSessionStatusCode]
  val STREAMING_SESSION_DELETED = "STREAMING_SESSION_DELETED".asInstanceOf[StreamingSessionStatusCode]
  val STREAMING_SESSION_CREATE_IN_PROGRESS = "STREAMING_SESSION_CREATE_IN_PROGRESS".asInstanceOf[StreamingSessionStatusCode]
  val STREAMING_SESSION_DELETE_IN_PROGRESS = "STREAMING_SESSION_DELETE_IN_PROGRESS".asInstanceOf[StreamingSessionStatusCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[StreamingSessionStatusCode]
  val INSUFFICIENT_CAPACITY = "INSUFFICIENT_CAPACITY".asInstanceOf[StreamingSessionStatusCode]
  val ACTIVE_DIRECTORY_DOMAIN_JOIN_ERROR = "ACTIVE_DIRECTORY_DOMAIN_JOIN_ERROR".asInstanceOf[StreamingSessionStatusCode]
  val NETWORK_CONNECTION_ERROR = "NETWORK_CONNECTION_ERROR".asInstanceOf[StreamingSessionStatusCode]
  val INITIALIZATION_SCRIPT_ERROR = "INITIALIZATION_SCRIPT_ERROR".asInstanceOf[StreamingSessionStatusCode]
  val DECRYPT_STREAMING_IMAGE_ERROR = "DECRYPT_STREAMING_IMAGE_ERROR".asInstanceOf[StreamingSessionStatusCode]
  val NETWORK_INTERFACE_ERROR = "NETWORK_INTERFACE_ERROR".asInstanceOf[StreamingSessionStatusCode]
  val STREAMING_SESSION_STOPPED = "STREAMING_SESSION_STOPPED".asInstanceOf[StreamingSessionStatusCode]
  val STREAMING_SESSION_STARTED = "STREAMING_SESSION_STARTED".asInstanceOf[StreamingSessionStatusCode]
  val STREAMING_SESSION_STOP_IN_PROGRESS = "STREAMING_SESSION_STOP_IN_PROGRESS".asInstanceOf[StreamingSessionStatusCode]
  val STREAMING_SESSION_START_IN_PROGRESS = "STREAMING_SESSION_START_IN_PROGRESS".asInstanceOf[StreamingSessionStatusCode]

  @inline def values: js.Array[StreamingSessionStatusCode] = js.Array(
    STREAMING_SESSION_READY,
    STREAMING_SESSION_DELETED,
    STREAMING_SESSION_CREATE_IN_PROGRESS,
    STREAMING_SESSION_DELETE_IN_PROGRESS,
    INTERNAL_ERROR,
    INSUFFICIENT_CAPACITY,
    ACTIVE_DIRECTORY_DOMAIN_JOIN_ERROR,
    NETWORK_CONNECTION_ERROR,
    INITIALIZATION_SCRIPT_ERROR,
    DECRYPT_STREAMING_IMAGE_ERROR,
    NETWORK_INTERFACE_ERROR,
    STREAMING_SESSION_STOPPED,
    STREAMING_SESSION_STARTED,
    STREAMING_SESSION_STOP_IN_PROGRESS,
    STREAMING_SESSION_START_IN_PROGRESS
  )
}

@js.native
sealed trait StreamingSessionStorageMode extends js.Any
object StreamingSessionStorageMode {
  val UPLOAD = "UPLOAD".asInstanceOf[StreamingSessionStorageMode]

  @inline def values: js.Array[StreamingSessionStorageMode] = js.Array(UPLOAD)
}

@js.native
sealed trait StreamingSessionStreamState extends js.Any
object StreamingSessionStreamState {
  val READY = "READY".asInstanceOf[StreamingSessionStreamState]
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[StreamingSessionStreamState]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[StreamingSessionStreamState]
  val DELETED = "DELETED".asInstanceOf[StreamingSessionStreamState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[StreamingSessionStreamState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[StreamingSessionStreamState]

  @inline def values: js.Array[StreamingSessionStreamState] = js.Array(READY, CREATE_IN_PROGRESS, DELETE_IN_PROGRESS, DELETED, CREATE_FAILED, DELETE_FAILED)
}

@js.native
sealed trait StreamingSessionStreamStatusCode extends js.Any
object StreamingSessionStreamStatusCode {
  val STREAM_CREATE_IN_PROGRESS = "STREAM_CREATE_IN_PROGRESS".asInstanceOf[StreamingSessionStreamStatusCode]
  val STREAM_READY = "STREAM_READY".asInstanceOf[StreamingSessionStreamStatusCode]
  val STREAM_DELETE_IN_PROGRESS = "STREAM_DELETE_IN_PROGRESS".asInstanceOf[StreamingSessionStreamStatusCode]
  val STREAM_DELETED = "STREAM_DELETED".asInstanceOf[StreamingSessionStreamStatusCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[StreamingSessionStreamStatusCode]
  val NETWORK_CONNECTION_ERROR = "NETWORK_CONNECTION_ERROR".asInstanceOf[StreamingSessionStreamStatusCode]

  @inline def values: js.Array[StreamingSessionStreamStatusCode] = js.Array(STREAM_CREATE_IN_PROGRESS, STREAM_READY, STREAM_DELETE_IN_PROGRESS, STREAM_DELETED, INTERNAL_ERROR, NETWORK_CONNECTION_ERROR)
}

@js.native
sealed trait StudioComponentInitializationScriptRunContext extends js.Any
object StudioComponentInitializationScriptRunContext {
  val SYSTEM_INITIALIZATION = "SYSTEM_INITIALIZATION".asInstanceOf[StudioComponentInitializationScriptRunContext]
  val USER_INITIALIZATION = "USER_INITIALIZATION".asInstanceOf[StudioComponentInitializationScriptRunContext]

  @inline def values: js.Array[StudioComponentInitializationScriptRunContext] = js.Array(SYSTEM_INITIALIZATION, USER_INITIALIZATION)
}

/** The current state of the studio component resource. While a studio component is being created, modified, or deleted, its state will equal "CREATE_IN_PROGRESS", "UPDATE_IN_PROGRESS", or "DELETE_IN_PROGRESS" These are called 'transition states'. No modifications may be made to the studio component while it is in a transition state. If creation of the resource fails, the state will change to `CREATE_FAILED`. The resource StatusCode and StatusMessage will provide more information of why creation failed. The resource in this state will automatically be deleted from your account after a period of time. If updating the resource fails, the state will change to `UPDATE_FAILED`. The resource StatusCode and StatusMessage will provide more information of why the update failed. The resource will be returned to the state it was in when the update request was invoked. If deleting the resource fails, the state will change to `DELETE_FAILED`. The resource StatusCode and StatusMessage will provide
  * more information of why the update failed. The resource will be returned to the state it was in when the update request was invoked. After the resource is deleted successfully, it will change to the "DELETED" state. The resource will no longer count against service quotas and cannot be used or acted upon any futher. It will be removed from your account after a period of time.
  */
@js.native
sealed trait StudioComponentState extends js.Any
object StudioComponentState {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[StudioComponentState]
  val READY = "READY".asInstanceOf[StudioComponentState]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[StudioComponentState]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[StudioComponentState]
  val DELETED = "DELETED".asInstanceOf[StudioComponentState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[StudioComponentState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[StudioComponentState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[StudioComponentState]

  @inline def values: js.Array[StudioComponentState] = js.Array(CREATE_IN_PROGRESS, READY, UPDATE_IN_PROGRESS, DELETE_IN_PROGRESS, DELETED, DELETE_FAILED, CREATE_FAILED, UPDATE_FAILED)
}

/** The current status of the studio component resource. When the resource is in the 'READY' state, the status code signals what the last mutation made to the resource was. When the resource is in a CREATE_FAILED/UPDATE_FAILED/DELETE_FAILED state, the status code signals what went wrong and why the mutation failed.
  */
@js.native
sealed trait StudioComponentStatusCode extends js.Any
object StudioComponentStatusCode {
  val ACTIVE_DIRECTORY_ALREADY_EXISTS = "ACTIVE_DIRECTORY_ALREADY_EXISTS".asInstanceOf[StudioComponentStatusCode]
  val STUDIO_COMPONENT_CREATED = "STUDIO_COMPONENT_CREATED".asInstanceOf[StudioComponentStatusCode]
  val STUDIO_COMPONENT_UPDATED = "STUDIO_COMPONENT_UPDATED".asInstanceOf[StudioComponentStatusCode]
  val STUDIO_COMPONENT_DELETED = "STUDIO_COMPONENT_DELETED".asInstanceOf[StudioComponentStatusCode]
  val ENCRYPTION_KEY_ACCESS_DENIED = "ENCRYPTION_KEY_ACCESS_DENIED".asInstanceOf[StudioComponentStatusCode]
  val ENCRYPTION_KEY_NOT_FOUND = "ENCRYPTION_KEY_NOT_FOUND".asInstanceOf[StudioComponentStatusCode]
  val STUDIO_COMPONENT_CREATE_IN_PROGRESS = "STUDIO_COMPONENT_CREATE_IN_PROGRESS".asInstanceOf[StudioComponentStatusCode]
  val STUDIO_COMPONENT_UPDATE_IN_PROGRESS = "STUDIO_COMPONENT_UPDATE_IN_PROGRESS".asInstanceOf[StudioComponentStatusCode]
  val STUDIO_COMPONENT_DELETE_IN_PROGRESS = "STUDIO_COMPONENT_DELETE_IN_PROGRESS".asInstanceOf[StudioComponentStatusCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[StudioComponentStatusCode]

  @inline def values: js.Array[StudioComponentStatusCode] = js.Array(
    ACTIVE_DIRECTORY_ALREADY_EXISTS,
    STUDIO_COMPONENT_CREATED,
    STUDIO_COMPONENT_UPDATED,
    STUDIO_COMPONENT_DELETED,
    ENCRYPTION_KEY_ACCESS_DENIED,
    ENCRYPTION_KEY_NOT_FOUND,
    STUDIO_COMPONENT_CREATE_IN_PROGRESS,
    STUDIO_COMPONENT_UPDATE_IN_PROGRESS,
    STUDIO_COMPONENT_DELETE_IN_PROGRESS,
    INTERNAL_ERROR
  )
}

@js.native
sealed trait StudioComponentSubtype extends js.Any
object StudioComponentSubtype {
  val AWS_MANAGED_MICROSOFT_AD = "AWS_MANAGED_MICROSOFT_AD".asInstanceOf[StudioComponentSubtype]
  val AMAZON_FSX_FOR_WINDOWS = "AMAZON_FSX_FOR_WINDOWS".asInstanceOf[StudioComponentSubtype]
  val AMAZON_FSX_FOR_LUSTRE = "AMAZON_FSX_FOR_LUSTRE".asInstanceOf[StudioComponentSubtype]
  val CUSTOM = "CUSTOM".asInstanceOf[StudioComponentSubtype]

  @inline def values: js.Array[StudioComponentSubtype] = js.Array(AWS_MANAGED_MICROSOFT_AD, AMAZON_FSX_FOR_WINDOWS, AMAZON_FSX_FOR_LUSTRE, CUSTOM)
}

@js.native
sealed trait StudioComponentType extends js.Any
object StudioComponentType {
  val ACTIVE_DIRECTORY = "ACTIVE_DIRECTORY".asInstanceOf[StudioComponentType]
  val SHARED_FILE_SYSTEM = "SHARED_FILE_SYSTEM".asInstanceOf[StudioComponentType]
  val COMPUTE_FARM = "COMPUTE_FARM".asInstanceOf[StudioComponentType]
  val LICENSE_SERVICE = "LICENSE_SERVICE".asInstanceOf[StudioComponentType]
  val CUSTOM = "CUSTOM".asInstanceOf[StudioComponentType]

  @inline def values: js.Array[StudioComponentType] = js.Array(ACTIVE_DIRECTORY, SHARED_FILE_SYSTEM, COMPUTE_FARM, LICENSE_SERVICE, CUSTOM)
}

/** The type of KMS key that is used to encrypt studio data.
  */
@js.native
sealed trait StudioEncryptionConfigurationKeyType extends js.Any
object StudioEncryptionConfigurationKeyType {
  val AWS_OWNED_KEY = "AWS_OWNED_KEY".asInstanceOf[StudioEncryptionConfigurationKeyType]
  val CUSTOMER_MANAGED_KEY = "CUSTOMER_MANAGED_KEY".asInstanceOf[StudioEncryptionConfigurationKeyType]

  @inline def values: js.Array[StudioEncryptionConfigurationKeyType] = js.Array(AWS_OWNED_KEY, CUSTOMER_MANAGED_KEY)
}

@js.native
sealed trait StudioPersona extends js.Any
object StudioPersona {
  val ADMINISTRATOR = "ADMINISTRATOR".asInstanceOf[StudioPersona]

  @inline def values: js.Array[StudioPersona] = js.Array(ADMINISTRATOR)
}

@js.native
sealed trait StudioState extends js.Any
object StudioState {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[StudioState]
  val READY = "READY".asInstanceOf[StudioState]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[StudioState]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[StudioState]
  val DELETED = "DELETED".asInstanceOf[StudioState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[StudioState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[StudioState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[StudioState]

  @inline def values: js.Array[StudioState] = js.Array(CREATE_IN_PROGRESS, READY, UPDATE_IN_PROGRESS, DELETE_IN_PROGRESS, DELETED, DELETE_FAILED, CREATE_FAILED, UPDATE_FAILED)
}

/** The status code.
  */
@js.native
sealed trait StudioStatusCode extends js.Any
object StudioStatusCode {
  val STUDIO_CREATED = "STUDIO_CREATED".asInstanceOf[StudioStatusCode]
  val STUDIO_DELETED = "STUDIO_DELETED".asInstanceOf[StudioStatusCode]
  val STUDIO_UPDATED = "STUDIO_UPDATED".asInstanceOf[StudioStatusCode]
  val STUDIO_CREATE_IN_PROGRESS = "STUDIO_CREATE_IN_PROGRESS".asInstanceOf[StudioStatusCode]
  val STUDIO_UPDATE_IN_PROGRESS = "STUDIO_UPDATE_IN_PROGRESS".asInstanceOf[StudioStatusCode]
  val STUDIO_DELETE_IN_PROGRESS = "STUDIO_DELETE_IN_PROGRESS".asInstanceOf[StudioStatusCode]
  val STUDIO_WITH_LAUNCH_PROFILES_NOT_DELETED = "STUDIO_WITH_LAUNCH_PROFILES_NOT_DELETED".asInstanceOf[StudioStatusCode]
  val STUDIO_WITH_STUDIO_COMPONENTS_NOT_DELETED = "STUDIO_WITH_STUDIO_COMPONENTS_NOT_DELETED".asInstanceOf[StudioStatusCode]
  val STUDIO_WITH_STREAMING_IMAGES_NOT_DELETED = "STUDIO_WITH_STREAMING_IMAGES_NOT_DELETED".asInstanceOf[StudioStatusCode]
  val AWS_SSO_NOT_ENABLED = "AWS_SSO_NOT_ENABLED".asInstanceOf[StudioStatusCode]
  val AWS_SSO_ACCESS_DENIED = "AWS_SSO_ACCESS_DENIED".asInstanceOf[StudioStatusCode]
  val ROLE_NOT_OWNED_BY_STUDIO_OWNER = "ROLE_NOT_OWNED_BY_STUDIO_OWNER".asInstanceOf[StudioStatusCode]
  val ROLE_COULD_NOT_BE_ASSUMED = "ROLE_COULD_NOT_BE_ASSUMED".asInstanceOf[StudioStatusCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[StudioStatusCode]
  val ENCRYPTION_KEY_NOT_FOUND = "ENCRYPTION_KEY_NOT_FOUND".asInstanceOf[StudioStatusCode]
  val ENCRYPTION_KEY_ACCESS_DENIED = "ENCRYPTION_KEY_ACCESS_DENIED".asInstanceOf[StudioStatusCode]
  val AWS_SSO_CONFIGURATION_REPAIRED = "AWS_SSO_CONFIGURATION_REPAIRED".asInstanceOf[StudioStatusCode]
  val AWS_SSO_CONFIGURATION_REPAIR_IN_PROGRESS = "AWS_SSO_CONFIGURATION_REPAIR_IN_PROGRESS".asInstanceOf[StudioStatusCode]

  @inline def values: js.Array[StudioStatusCode] = js.Array(
    STUDIO_CREATED,
    STUDIO_DELETED,
    STUDIO_UPDATED,
    STUDIO_CREATE_IN_PROGRESS,
    STUDIO_UPDATE_IN_PROGRESS,
    STUDIO_DELETE_IN_PROGRESS,
    STUDIO_WITH_LAUNCH_PROFILES_NOT_DELETED,
    STUDIO_WITH_STUDIO_COMPONENTS_NOT_DELETED,
    STUDIO_WITH_STREAMING_IMAGES_NOT_DELETED,
    AWS_SSO_NOT_ENABLED,
    AWS_SSO_ACCESS_DENIED,
    ROLE_NOT_OWNED_BY_STUDIO_OWNER,
    ROLE_COULD_NOT_BE_ASSUMED,
    INTERNAL_ERROR,
    ENCRYPTION_KEY_NOT_FOUND,
    ENCRYPTION_KEY_ACCESS_DENIED,
    AWS_SSO_CONFIGURATION_REPAIRED,
    AWS_SSO_CONFIGURATION_REPAIR_IN_PROGRESS
  )
}
