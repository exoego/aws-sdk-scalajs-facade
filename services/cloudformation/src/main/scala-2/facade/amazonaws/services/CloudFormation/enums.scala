package facade.amazonaws.services.cloudformation

import scalajs.js

@js.native
sealed trait AccountGateStatus extends js.Any
object AccountGateStatus {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[AccountGateStatus]
  val FAILED = "FAILED".asInstanceOf[AccountGateStatus]
  val SKIPPED = "SKIPPED".asInstanceOf[AccountGateStatus]

  @inline def values: js.Array[AccountGateStatus] = js.Array(SUCCEEDED, FAILED, SKIPPED)
}

@js.native
sealed trait CallAs extends js.Any
object CallAs {
  val SELF = "SELF".asInstanceOf[CallAs]
  val DELEGATED_ADMIN = "DELEGATED_ADMIN".asInstanceOf[CallAs]

  @inline def values: js.Array[CallAs] = js.Array(SELF, DELEGATED_ADMIN)
}

@js.native
sealed trait Capability extends js.Any
object Capability {
  val CAPABILITY_IAM = "CAPABILITY_IAM".asInstanceOf[Capability]
  val CAPABILITY_NAMED_IAM = "CAPABILITY_NAMED_IAM".asInstanceOf[Capability]
  val CAPABILITY_AUTO_EXPAND = "CAPABILITY_AUTO_EXPAND".asInstanceOf[Capability]

  @inline def values: js.Array[Capability] = js.Array(CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_AUTO_EXPAND)
}

@js.native
sealed trait ChangeAction extends js.Any
object ChangeAction {
  val Add = "Add".asInstanceOf[ChangeAction]
  val Modify = "Modify".asInstanceOf[ChangeAction]
  val Remove = "Remove".asInstanceOf[ChangeAction]
  val Import = "Import".asInstanceOf[ChangeAction]
  val Dynamic = "Dynamic".asInstanceOf[ChangeAction]

  @inline def values: js.Array[ChangeAction] = js.Array(Add, Modify, Remove, Import, Dynamic)
}

@js.native
sealed trait ChangeSetStatus extends js.Any
object ChangeSetStatus {
  val CREATE_PENDING = "CREATE_PENDING".asInstanceOf[ChangeSetStatus]
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ChangeSetStatus]
  val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[ChangeSetStatus]
  val DELETE_PENDING = "DELETE_PENDING".asInstanceOf[ChangeSetStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ChangeSetStatus]
  val DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[ChangeSetStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ChangeSetStatus]
  val FAILED = "FAILED".asInstanceOf[ChangeSetStatus]

  @inline def values: js.Array[ChangeSetStatus] = js.Array(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED, FAILED)
}

@js.native
sealed trait ChangeSetType extends js.Any
object ChangeSetType {
  val CREATE = "CREATE".asInstanceOf[ChangeSetType]
  val UPDATE = "UPDATE".asInstanceOf[ChangeSetType]
  val IMPORT = "IMPORT".asInstanceOf[ChangeSetType]

  @inline def values: js.Array[ChangeSetType] = js.Array(CREATE, UPDATE, IMPORT)
}

@js.native
sealed trait ChangeSource extends js.Any
object ChangeSource {
  val ResourceReference = "ResourceReference".asInstanceOf[ChangeSource]
  val ParameterReference = "ParameterReference".asInstanceOf[ChangeSource]
  val ResourceAttribute = "ResourceAttribute".asInstanceOf[ChangeSource]
  val DirectModification = "DirectModification".asInstanceOf[ChangeSource]
  val Automatic = "Automatic".asInstanceOf[ChangeSource]

  @inline def values: js.Array[ChangeSource] = js.Array(ResourceReference, ParameterReference, ResourceAttribute, DirectModification, Automatic)
}

@js.native
sealed trait ChangeType extends js.Any
object ChangeType {
  val Resource = "Resource".asInstanceOf[ChangeType]

  @inline def values: js.Array[ChangeType] = js.Array(Resource)
}

@js.native
sealed trait DeprecatedStatus extends js.Any
object DeprecatedStatus {
  val LIVE = "LIVE".asInstanceOf[DeprecatedStatus]
  val DEPRECATED = "DEPRECATED".asInstanceOf[DeprecatedStatus]

  @inline def values: js.Array[DeprecatedStatus] = js.Array(LIVE, DEPRECATED)
}

@js.native
sealed trait DifferenceType extends js.Any
object DifferenceType {
  val ADD = "ADD".asInstanceOf[DifferenceType]
  val REMOVE = "REMOVE".asInstanceOf[DifferenceType]
  val NOT_EQUAL = "NOT_EQUAL".asInstanceOf[DifferenceType]

  @inline def values: js.Array[DifferenceType] = js.Array(ADD, REMOVE, NOT_EQUAL)
}

@js.native
sealed trait EvaluationType extends js.Any
object EvaluationType {
  val Static = "Static".asInstanceOf[EvaluationType]
  val Dynamic = "Dynamic".asInstanceOf[EvaluationType]

  @inline def values: js.Array[EvaluationType] = js.Array(Static, Dynamic)
}

@js.native
sealed trait ExecutionStatus extends js.Any
object ExecutionStatus {
  val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[ExecutionStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ExecutionStatus]
  val EXECUTE_IN_PROGRESS = "EXECUTE_IN_PROGRESS".asInstanceOf[ExecutionStatus]
  val EXECUTE_COMPLETE = "EXECUTE_COMPLETE".asInstanceOf[ExecutionStatus]
  val EXECUTE_FAILED = "EXECUTE_FAILED".asInstanceOf[ExecutionStatus]
  val OBSOLETE = "OBSOLETE".asInstanceOf[ExecutionStatus]

  @inline def values: js.Array[ExecutionStatus] = js.Array(UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS, EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE)
}

@js.native
sealed trait HandlerErrorCode extends js.Any
object HandlerErrorCode {
  val NotUpdatable = "NotUpdatable".asInstanceOf[HandlerErrorCode]
  val InvalidRequest = "InvalidRequest".asInstanceOf[HandlerErrorCode]
  val AccessDenied = "AccessDenied".asInstanceOf[HandlerErrorCode]
  val InvalidCredentials = "InvalidCredentials".asInstanceOf[HandlerErrorCode]
  val AlreadyExists = "AlreadyExists".asInstanceOf[HandlerErrorCode]
  val NotFound = "NotFound".asInstanceOf[HandlerErrorCode]
  val ResourceConflict = "ResourceConflict".asInstanceOf[HandlerErrorCode]
  val Throttling = "Throttling".asInstanceOf[HandlerErrorCode]
  val ServiceLimitExceeded = "ServiceLimitExceeded".asInstanceOf[HandlerErrorCode]
  val NotStabilized = "NotStabilized".asInstanceOf[HandlerErrorCode]
  val GeneralServiceException = "GeneralServiceException".asInstanceOf[HandlerErrorCode]
  val ServiceInternalError = "ServiceInternalError".asInstanceOf[HandlerErrorCode]
  val NetworkFailure = "NetworkFailure".asInstanceOf[HandlerErrorCode]
  val InternalFailure = "InternalFailure".asInstanceOf[HandlerErrorCode]

  @inline def values: js.Array[HandlerErrorCode] = js.Array(
    NotUpdatable,
    InvalidRequest,
    AccessDenied,
    InvalidCredentials,
    AlreadyExists,
    NotFound,
    ResourceConflict,
    Throttling,
    ServiceLimitExceeded,
    NotStabilized,
    GeneralServiceException,
    ServiceInternalError,
    NetworkFailure,
    InternalFailure
  )
}

@js.native
sealed trait OnFailure extends js.Any
object OnFailure {
  val DO_NOTHING = "DO_NOTHING".asInstanceOf[OnFailure]
  val ROLLBACK = "ROLLBACK".asInstanceOf[OnFailure]
  val DELETE = "DELETE".asInstanceOf[OnFailure]

  @inline def values: js.Array[OnFailure] = js.Array(DO_NOTHING, ROLLBACK, DELETE)
}

@js.native
sealed trait OperationStatus extends js.Any
object OperationStatus {
  val PENDING = "PENDING".asInstanceOf[OperationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[OperationStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[OperationStatus]
  val FAILED = "FAILED".asInstanceOf[OperationStatus]

  @inline def values: js.Array[OperationStatus] = js.Array(PENDING, IN_PROGRESS, SUCCESS, FAILED)
}

@js.native
sealed trait PermissionModels extends js.Any
object PermissionModels {
  val SERVICE_MANAGED = "SERVICE_MANAGED".asInstanceOf[PermissionModels]
  val SELF_MANAGED = "SELF_MANAGED".asInstanceOf[PermissionModels]

  @inline def values: js.Array[PermissionModels] = js.Array(SERVICE_MANAGED, SELF_MANAGED)
}

@js.native
sealed trait ProvisioningType extends js.Any
object ProvisioningType {
  val NON_PROVISIONABLE = "NON_PROVISIONABLE".asInstanceOf[ProvisioningType]
  val IMMUTABLE = "IMMUTABLE".asInstanceOf[ProvisioningType]
  val FULLY_MUTABLE = "FULLY_MUTABLE".asInstanceOf[ProvisioningType]

  @inline def values: js.Array[ProvisioningType] = js.Array(NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE)
}

@js.native
sealed trait RegionConcurrencyType extends js.Any
object RegionConcurrencyType {
  val SEQUENTIAL = "SEQUENTIAL".asInstanceOf[RegionConcurrencyType]
  val PARALLEL = "PARALLEL".asInstanceOf[RegionConcurrencyType]

  @inline def values: js.Array[RegionConcurrencyType] = js.Array(SEQUENTIAL, PARALLEL)
}

@js.native
sealed trait RegistrationStatus extends js.Any
object RegistrationStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[RegistrationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[RegistrationStatus]
  val FAILED = "FAILED".asInstanceOf[RegistrationStatus]

  @inline def values: js.Array[RegistrationStatus] = js.Array(COMPLETE, IN_PROGRESS, FAILED)
}

@js.native
sealed trait RegistryType extends js.Any
object RegistryType {
  val RESOURCE = "RESOURCE".asInstanceOf[RegistryType]
  val MODULE = "MODULE".asInstanceOf[RegistryType]

  @inline def values: js.Array[RegistryType] = js.Array(RESOURCE, MODULE)
}

@js.native
sealed trait Replacement extends js.Any
object Replacement {
  val True = "True".asInstanceOf[Replacement]
  val False = "False".asInstanceOf[Replacement]
  val Conditional = "Conditional".asInstanceOf[Replacement]

  @inline def values: js.Array[Replacement] = js.Array(True, False, Conditional)
}

@js.native
sealed trait RequiresRecreation extends js.Any
object RequiresRecreation {
  val Never = "Never".asInstanceOf[RequiresRecreation]
  val Conditionally = "Conditionally".asInstanceOf[RequiresRecreation]
  val Always = "Always".asInstanceOf[RequiresRecreation]

  @inline def values: js.Array[RequiresRecreation] = js.Array(Never, Conditionally, Always)
}

@js.native
sealed trait ResourceAttribute extends js.Any
object ResourceAttribute {
  val Properties = "Properties".asInstanceOf[ResourceAttribute]
  val Metadata = "Metadata".asInstanceOf[ResourceAttribute]
  val CreationPolicy = "CreationPolicy".asInstanceOf[ResourceAttribute]
  val UpdatePolicy = "UpdatePolicy".asInstanceOf[ResourceAttribute]
  val DeletionPolicy = "DeletionPolicy".asInstanceOf[ResourceAttribute]
  val Tags = "Tags".asInstanceOf[ResourceAttribute]

  @inline def values: js.Array[ResourceAttribute] = js.Array(Properties, Metadata, CreationPolicy, UpdatePolicy, DeletionPolicy, Tags)
}

@js.native
sealed trait ResourceSignalStatus extends js.Any
object ResourceSignalStatus {
  val SUCCESS = "SUCCESS".asInstanceOf[ResourceSignalStatus]
  val FAILURE = "FAILURE".asInstanceOf[ResourceSignalStatus]

  @inline def values: js.Array[ResourceSignalStatus] = js.Array(SUCCESS, FAILURE)
}

@js.native
sealed trait ResourceStatus extends js.Any
object ResourceStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ResourceStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ResourceStatus]
  val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[ResourceStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ResourceStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ResourceStatus]
  val DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[ResourceStatus]
  val DELETE_SKIPPED = "DELETE_SKIPPED".asInstanceOf[ResourceStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[ResourceStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ResourceStatus]
  val UPDATE_COMPLETE = "UPDATE_COMPLETE".asInstanceOf[ResourceStatus]
  val IMPORT_FAILED = "IMPORT_FAILED".asInstanceOf[ResourceStatus]
  val IMPORT_COMPLETE = "IMPORT_COMPLETE".asInstanceOf[ResourceStatus]
  val IMPORT_IN_PROGRESS = "IMPORT_IN_PROGRESS".asInstanceOf[ResourceStatus]
  val IMPORT_ROLLBACK_IN_PROGRESS = "IMPORT_ROLLBACK_IN_PROGRESS".asInstanceOf[ResourceStatus]
  val IMPORT_ROLLBACK_FAILED = "IMPORT_ROLLBACK_FAILED".asInstanceOf[ResourceStatus]
  val IMPORT_ROLLBACK_COMPLETE = "IMPORT_ROLLBACK_COMPLETE".asInstanceOf[ResourceStatus]

  @inline def values: js.Array[ResourceStatus] = js.Array(
    CREATE_IN_PROGRESS,
    CREATE_FAILED,
    CREATE_COMPLETE,
    DELETE_IN_PROGRESS,
    DELETE_FAILED,
    DELETE_COMPLETE,
    DELETE_SKIPPED,
    UPDATE_IN_PROGRESS,
    UPDATE_FAILED,
    UPDATE_COMPLETE,
    IMPORT_FAILED,
    IMPORT_COMPLETE,
    IMPORT_IN_PROGRESS,
    IMPORT_ROLLBACK_IN_PROGRESS,
    IMPORT_ROLLBACK_FAILED,
    IMPORT_ROLLBACK_COMPLETE
  )
}

@js.native
sealed trait StackDriftDetectionStatus extends js.Any
object StackDriftDetectionStatus {
  val DETECTION_IN_PROGRESS = "DETECTION_IN_PROGRESS".asInstanceOf[StackDriftDetectionStatus]
  val DETECTION_FAILED = "DETECTION_FAILED".asInstanceOf[StackDriftDetectionStatus]
  val DETECTION_COMPLETE = "DETECTION_COMPLETE".asInstanceOf[StackDriftDetectionStatus]

  @inline def values: js.Array[StackDriftDetectionStatus] = js.Array(DETECTION_IN_PROGRESS, DETECTION_FAILED, DETECTION_COMPLETE)
}

@js.native
sealed trait StackDriftStatus extends js.Any
object StackDriftStatus {
  val DRIFTED = "DRIFTED".asInstanceOf[StackDriftStatus]
  val IN_SYNC = "IN_SYNC".asInstanceOf[StackDriftStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[StackDriftStatus]
  val NOT_CHECKED = "NOT_CHECKED".asInstanceOf[StackDriftStatus]

  @inline def values: js.Array[StackDriftStatus] = js.Array(DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED)
}

@js.native
sealed trait StackInstanceDetailedStatus extends js.Any
object StackInstanceDetailedStatus {
  val PENDING = "PENDING".asInstanceOf[StackInstanceDetailedStatus]
  val RUNNING = "RUNNING".asInstanceOf[StackInstanceDetailedStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[StackInstanceDetailedStatus]
  val FAILED = "FAILED".asInstanceOf[StackInstanceDetailedStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[StackInstanceDetailedStatus]
  val INOPERABLE = "INOPERABLE".asInstanceOf[StackInstanceDetailedStatus]

  @inline def values: js.Array[StackInstanceDetailedStatus] = js.Array(PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED, INOPERABLE)
}

@js.native
sealed trait StackInstanceFilterName extends js.Any
object StackInstanceFilterName {
  val DETAILED_STATUS = "DETAILED_STATUS".asInstanceOf[StackInstanceFilterName]

  @inline def values: js.Array[StackInstanceFilterName] = js.Array(DETAILED_STATUS)
}

@js.native
sealed trait StackInstanceStatus extends js.Any
object StackInstanceStatus {
  val CURRENT = "CURRENT".asInstanceOf[StackInstanceStatus]
  val OUTDATED = "OUTDATED".asInstanceOf[StackInstanceStatus]
  val INOPERABLE = "INOPERABLE".asInstanceOf[StackInstanceStatus]

  @inline def values: js.Array[StackInstanceStatus] = js.Array(CURRENT, OUTDATED, INOPERABLE)
}

@js.native
sealed trait StackResourceDriftStatus extends js.Any
object StackResourceDriftStatus {
  val IN_SYNC = "IN_SYNC".asInstanceOf[StackResourceDriftStatus]
  val MODIFIED = "MODIFIED".asInstanceOf[StackResourceDriftStatus]
  val DELETED = "DELETED".asInstanceOf[StackResourceDriftStatus]
  val NOT_CHECKED = "NOT_CHECKED".asInstanceOf[StackResourceDriftStatus]

  @inline def values: js.Array[StackResourceDriftStatus] = js.Array(IN_SYNC, MODIFIED, DELETED, NOT_CHECKED)
}

@js.native
sealed trait StackSetDriftDetectionStatus extends js.Any
object StackSetDriftDetectionStatus {
  val COMPLETED = "COMPLETED".asInstanceOf[StackSetDriftDetectionStatus]
  val FAILED = "FAILED".asInstanceOf[StackSetDriftDetectionStatus]
  val PARTIAL_SUCCESS = "PARTIAL_SUCCESS".asInstanceOf[StackSetDriftDetectionStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[StackSetDriftDetectionStatus]
  val STOPPED = "STOPPED".asInstanceOf[StackSetDriftDetectionStatus]

  @inline def values: js.Array[StackSetDriftDetectionStatus] = js.Array(COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS, STOPPED)
}

@js.native
sealed trait StackSetDriftStatus extends js.Any
object StackSetDriftStatus {
  val DRIFTED = "DRIFTED".asInstanceOf[StackSetDriftStatus]
  val IN_SYNC = "IN_SYNC".asInstanceOf[StackSetDriftStatus]
  val NOT_CHECKED = "NOT_CHECKED".asInstanceOf[StackSetDriftStatus]

  @inline def values: js.Array[StackSetDriftStatus] = js.Array(DRIFTED, IN_SYNC, NOT_CHECKED)
}

@js.native
sealed trait StackSetOperationAction extends js.Any
object StackSetOperationAction {
  val CREATE = "CREATE".asInstanceOf[StackSetOperationAction]
  val UPDATE = "UPDATE".asInstanceOf[StackSetOperationAction]
  val DELETE = "DELETE".asInstanceOf[StackSetOperationAction]
  val DETECT_DRIFT = "DETECT_DRIFT".asInstanceOf[StackSetOperationAction]

  @inline def values: js.Array[StackSetOperationAction] = js.Array(CREATE, UPDATE, DELETE, DETECT_DRIFT)
}

@js.native
sealed trait StackSetOperationResultStatus extends js.Any
object StackSetOperationResultStatus {
  val PENDING = "PENDING".asInstanceOf[StackSetOperationResultStatus]
  val RUNNING = "RUNNING".asInstanceOf[StackSetOperationResultStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[StackSetOperationResultStatus]
  val FAILED = "FAILED".asInstanceOf[StackSetOperationResultStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[StackSetOperationResultStatus]

  @inline def values: js.Array[StackSetOperationResultStatus] = js.Array(PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED)
}

@js.native
sealed trait StackSetOperationStatus extends js.Any
object StackSetOperationStatus {
  val RUNNING = "RUNNING".asInstanceOf[StackSetOperationStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[StackSetOperationStatus]
  val FAILED = "FAILED".asInstanceOf[StackSetOperationStatus]
  val STOPPING = "STOPPING".asInstanceOf[StackSetOperationStatus]
  val STOPPED = "STOPPED".asInstanceOf[StackSetOperationStatus]
  val QUEUED = "QUEUED".asInstanceOf[StackSetOperationStatus]

  @inline def values: js.Array[StackSetOperationStatus] = js.Array(RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED, QUEUED)
}

@js.native
sealed trait StackSetStatus extends js.Any
object StackSetStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[StackSetStatus]
  val DELETED = "DELETED".asInstanceOf[StackSetStatus]

  @inline def values: js.Array[StackSetStatus] = js.Array(ACTIVE, DELETED)
}

@js.native
sealed trait StackStatus extends js.Any
object StackStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[StackStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[StackStatus]
  val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[StackStatus]
  val ROLLBACK_IN_PROGRESS = "ROLLBACK_IN_PROGRESS".asInstanceOf[StackStatus]
  val ROLLBACK_FAILED = "ROLLBACK_FAILED".asInstanceOf[StackStatus]
  val ROLLBACK_COMPLETE = "ROLLBACK_COMPLETE".asInstanceOf[StackStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[StackStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[StackStatus]
  val DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[StackStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[StackStatus]
  val UPDATE_COMPLETE_CLEANUP_IN_PROGRESS = "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS".asInstanceOf[StackStatus]
  val UPDATE_COMPLETE = "UPDATE_COMPLETE".asInstanceOf[StackStatus]
  val UPDATE_ROLLBACK_IN_PROGRESS = "UPDATE_ROLLBACK_IN_PROGRESS".asInstanceOf[StackStatus]
  val UPDATE_ROLLBACK_FAILED = "UPDATE_ROLLBACK_FAILED".asInstanceOf[StackStatus]
  val UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS = "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS".asInstanceOf[StackStatus]
  val UPDATE_ROLLBACK_COMPLETE = "UPDATE_ROLLBACK_COMPLETE".asInstanceOf[StackStatus]
  val REVIEW_IN_PROGRESS = "REVIEW_IN_PROGRESS".asInstanceOf[StackStatus]
  val IMPORT_IN_PROGRESS = "IMPORT_IN_PROGRESS".asInstanceOf[StackStatus]
  val IMPORT_COMPLETE = "IMPORT_COMPLETE".asInstanceOf[StackStatus]
  val IMPORT_ROLLBACK_IN_PROGRESS = "IMPORT_ROLLBACK_IN_PROGRESS".asInstanceOf[StackStatus]
  val IMPORT_ROLLBACK_FAILED = "IMPORT_ROLLBACK_FAILED".asInstanceOf[StackStatus]
  val IMPORT_ROLLBACK_COMPLETE = "IMPORT_ROLLBACK_COMPLETE".asInstanceOf[StackStatus]

  @inline def values: js.Array[StackStatus] = js.Array(
    CREATE_IN_PROGRESS,
    CREATE_FAILED,
    CREATE_COMPLETE,
    ROLLBACK_IN_PROGRESS,
    ROLLBACK_FAILED,
    ROLLBACK_COMPLETE,
    DELETE_IN_PROGRESS,
    DELETE_FAILED,
    DELETE_COMPLETE,
    UPDATE_IN_PROGRESS,
    UPDATE_COMPLETE_CLEANUP_IN_PROGRESS,
    UPDATE_COMPLETE,
    UPDATE_ROLLBACK_IN_PROGRESS,
    UPDATE_ROLLBACK_FAILED,
    UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS,
    UPDATE_ROLLBACK_COMPLETE,
    REVIEW_IN_PROGRESS,
    IMPORT_IN_PROGRESS,
    IMPORT_COMPLETE,
    IMPORT_ROLLBACK_IN_PROGRESS,
    IMPORT_ROLLBACK_FAILED,
    IMPORT_ROLLBACK_COMPLETE
  )
}

@js.native
sealed trait TemplateStage extends js.Any
object TemplateStage {
  val Original = "Original".asInstanceOf[TemplateStage]
  val Processed = "Processed".asInstanceOf[TemplateStage]

  @inline def values: js.Array[TemplateStage] = js.Array(Original, Processed)
}

@js.native
sealed trait Visibility extends js.Any
object Visibility {
  val PUBLIC = "PUBLIC".asInstanceOf[Visibility]
  val PRIVATE = "PRIVATE".asInstanceOf[Visibility]

  @inline def values: js.Array[Visibility] = js.Array(PUBLIC, PRIVATE)
}
