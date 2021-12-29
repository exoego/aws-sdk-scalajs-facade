package facade.amazonaws.services.cloudformation

import scalajs._

type AccountGateStatus = "SUCCEEDED" | "FAILED" | "SKIPPED"
object AccountGateStatus {
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val SKIPPED: "SKIPPED" = "SKIPPED"

  @inline def values = js.Array[AccountGateStatus](SUCCEEDED, FAILED, SKIPPED)
}

type CallAs = "SELF" | "DELEGATED_ADMIN"
object CallAs {
  val SELF: "SELF" = "SELF"
  val DELEGATED_ADMIN: "DELEGATED_ADMIN" = "DELEGATED_ADMIN"

  @inline def values = js.Array[CallAs](SELF, DELEGATED_ADMIN)
}

type Capability = "CAPABILITY_IAM" | "CAPABILITY_NAMED_IAM" | "CAPABILITY_AUTO_EXPAND"
object Capability {
  val CAPABILITY_IAM: "CAPABILITY_IAM" = "CAPABILITY_IAM"
  val CAPABILITY_NAMED_IAM: "CAPABILITY_NAMED_IAM" = "CAPABILITY_NAMED_IAM"
  val CAPABILITY_AUTO_EXPAND: "CAPABILITY_AUTO_EXPAND" = "CAPABILITY_AUTO_EXPAND"

  @inline def values = js.Array[Capability](CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_AUTO_EXPAND)
}

type ChangeAction = "Add" | "Modify" | "Remove" | "Import" | "Dynamic"
object ChangeAction {
  val Add: "Add" = "Add"
  val Modify: "Modify" = "Modify"
  val Remove: "Remove" = "Remove"
  val Import: "Import" = "Import"
  val Dynamic: "Dynamic" = "Dynamic"

  @inline def values = js.Array[ChangeAction](Add, Modify, Remove, Import, Dynamic)
}

type ChangeSetStatus = "CREATE_PENDING" | "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "DELETE_PENDING" | "DELETE_IN_PROGRESS" | "DELETE_COMPLETE" | "DELETE_FAILED" | "FAILED"
object ChangeSetStatus {
  val CREATE_PENDING: "CREATE_PENDING" = "CREATE_PENDING"
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  val DELETE_PENDING: "DELETE_PENDING" = "DELETE_PENDING"
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ChangeSetStatus](CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED, FAILED)
}

type ChangeSetType = "CREATE" | "UPDATE" | "IMPORT"
object ChangeSetType {
  val CREATE: "CREATE" = "CREATE"
  val UPDATE: "UPDATE" = "UPDATE"
  val IMPORT: "IMPORT" = "IMPORT"

  @inline def values = js.Array[ChangeSetType](CREATE, UPDATE, IMPORT)
}

type ChangeSource = "ResourceReference" | "ParameterReference" | "ResourceAttribute" | "DirectModification" | "Automatic"
object ChangeSource {
  val ResourceReference: "ResourceReference" = "ResourceReference"
  val ParameterReference: "ParameterReference" = "ParameterReference"
  val ResourceAttribute: "ResourceAttribute" = "ResourceAttribute"
  val DirectModification: "DirectModification" = "DirectModification"
  val Automatic: "Automatic" = "Automatic"

  @inline def values = js.Array[ChangeSource](ResourceReference, ParameterReference, ResourceAttribute, DirectModification, Automatic)
}

type ChangeType = "Resource"
object ChangeType {
  val Resource: "Resource" = "Resource"

  @inline def values = js.Array[ChangeType](Resource)
}

type DeprecatedStatus = "LIVE" | "DEPRECATED"
object DeprecatedStatus {
  val LIVE: "LIVE" = "LIVE"
  val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  @inline def values = js.Array[DeprecatedStatus](LIVE, DEPRECATED)
}

type DifferenceType = "ADD" | "REMOVE" | "NOT_EQUAL"
object DifferenceType {
  val ADD: "ADD" = "ADD"
  val REMOVE: "REMOVE" = "REMOVE"
  val NOT_EQUAL: "NOT_EQUAL" = "NOT_EQUAL"

  @inline def values = js.Array[DifferenceType](ADD, REMOVE, NOT_EQUAL)
}

type EvaluationType = "Static" | "Dynamic"
object EvaluationType {
  val Static: "Static" = "Static"
  val Dynamic: "Dynamic" = "Dynamic"

  @inline def values = js.Array[EvaluationType](Static, Dynamic)
}

type ExecutionStatus = "UNAVAILABLE" | "AVAILABLE" | "EXECUTE_IN_PROGRESS" | "EXECUTE_COMPLETE" | "EXECUTE_FAILED" | "OBSOLETE"
object ExecutionStatus {
  val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val EXECUTE_IN_PROGRESS: "EXECUTE_IN_PROGRESS" = "EXECUTE_IN_PROGRESS"
  val EXECUTE_COMPLETE: "EXECUTE_COMPLETE" = "EXECUTE_COMPLETE"
  val EXECUTE_FAILED: "EXECUTE_FAILED" = "EXECUTE_FAILED"
  val OBSOLETE: "OBSOLETE" = "OBSOLETE"

  @inline def values = js.Array[ExecutionStatus](UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS, EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE)
}

type HandlerErrorCode = "NotUpdatable" | "InvalidRequest" | "AccessDenied" | "InvalidCredentials" | "AlreadyExists" | "NotFound" | "ResourceConflict" | "Throttling" | "ServiceLimitExceeded" | "NotStabilized" | "GeneralServiceException" | "ServiceInternalError" | "NetworkFailure" | "InternalFailure"
object HandlerErrorCode {
  val NotUpdatable: "NotUpdatable" = "NotUpdatable"
  val InvalidRequest: "InvalidRequest" = "InvalidRequest"
  val AccessDenied: "AccessDenied" = "AccessDenied"
  val InvalidCredentials: "InvalidCredentials" = "InvalidCredentials"
  val AlreadyExists: "AlreadyExists" = "AlreadyExists"
  val NotFound: "NotFound" = "NotFound"
  val ResourceConflict: "ResourceConflict" = "ResourceConflict"
  val Throttling: "Throttling" = "Throttling"
  val ServiceLimitExceeded: "ServiceLimitExceeded" = "ServiceLimitExceeded"
  val NotStabilized: "NotStabilized" = "NotStabilized"
  val GeneralServiceException: "GeneralServiceException" = "GeneralServiceException"
  val ServiceInternalError: "ServiceInternalError" = "ServiceInternalError"
  val NetworkFailure: "NetworkFailure" = "NetworkFailure"
  val InternalFailure: "InternalFailure" = "InternalFailure"

  @inline def values = js.Array[HandlerErrorCode](
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

type OnFailure = "DO_NOTHING" | "ROLLBACK" | "DELETE"
object OnFailure {
  val DO_NOTHING: "DO_NOTHING" = "DO_NOTHING"
  val ROLLBACK: "ROLLBACK" = "ROLLBACK"
  val DELETE: "DELETE" = "DELETE"

  @inline def values = js.Array[OnFailure](DO_NOTHING, ROLLBACK, DELETE)
}

type OperationStatus = "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED"
object OperationStatus {
  val PENDING: "PENDING" = "PENDING"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[OperationStatus](PENDING, IN_PROGRESS, SUCCESS, FAILED)
}

type PermissionModels = "SERVICE_MANAGED" | "SELF_MANAGED"
object PermissionModels {
  val SERVICE_MANAGED: "SERVICE_MANAGED" = "SERVICE_MANAGED"
  val SELF_MANAGED: "SELF_MANAGED" = "SELF_MANAGED"

  @inline def values = js.Array[PermissionModels](SERVICE_MANAGED, SELF_MANAGED)
}

type ProvisioningType = "NON_PROVISIONABLE" | "IMMUTABLE" | "FULLY_MUTABLE"
object ProvisioningType {
  val NON_PROVISIONABLE: "NON_PROVISIONABLE" = "NON_PROVISIONABLE"
  val IMMUTABLE: "IMMUTABLE" = "IMMUTABLE"
  val FULLY_MUTABLE: "FULLY_MUTABLE" = "FULLY_MUTABLE"

  @inline def values = js.Array[ProvisioningType](NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE)
}

type RegionConcurrencyType = "SEQUENTIAL" | "PARALLEL"
object RegionConcurrencyType {
  val SEQUENTIAL: "SEQUENTIAL" = "SEQUENTIAL"
  val PARALLEL: "PARALLEL" = "PARALLEL"

  @inline def values = js.Array[RegionConcurrencyType](SEQUENTIAL, PARALLEL)
}

type RegistrationStatus = "COMPLETE" | "IN_PROGRESS" | "FAILED"
object RegistrationStatus {
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[RegistrationStatus](COMPLETE, IN_PROGRESS, FAILED)
}

type RegistryType = "RESOURCE" | "MODULE"
object RegistryType {
  val RESOURCE: "RESOURCE" = "RESOURCE"
  val MODULE: "MODULE" = "MODULE"

  @inline def values = js.Array[RegistryType](RESOURCE, MODULE)
}

type Replacement = "True" | "False" | "Conditional"
object Replacement {
  val True: "True" = "True"
  val False: "False" = "False"
  val Conditional: "Conditional" = "Conditional"

  @inline def values = js.Array[Replacement](True, False, Conditional)
}

type RequiresRecreation = "Never" | "Conditionally" | "Always"
object RequiresRecreation {
  val Never: "Never" = "Never"
  val Conditionally: "Conditionally" = "Conditionally"
  val Always: "Always" = "Always"

  @inline def values = js.Array[RequiresRecreation](Never, Conditionally, Always)
}

type ResourceAttribute = "Properties" | "Metadata" | "CreationPolicy" | "UpdatePolicy" | "DeletionPolicy" | "Tags"
object ResourceAttribute {
  val Properties: "Properties" = "Properties"
  val Metadata: "Metadata" = "Metadata"
  val CreationPolicy: "CreationPolicy" = "CreationPolicy"
  val UpdatePolicy: "UpdatePolicy" = "UpdatePolicy"
  val DeletionPolicy: "DeletionPolicy" = "DeletionPolicy"
  val Tags: "Tags" = "Tags"

  @inline def values = js.Array[ResourceAttribute](Properties, Metadata, CreationPolicy, UpdatePolicy, DeletionPolicy, Tags)
}

type ResourceSignalStatus = "SUCCESS" | "FAILURE"
object ResourceSignalStatus {
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILURE: "FAILURE" = "FAILURE"

  @inline def values = js.Array[ResourceSignalStatus](SUCCESS, FAILURE)
}

type ResourceStatus = "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "DELETE_SKIPPED" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | "UPDATE_COMPLETE" | "IMPORT_FAILED" | "IMPORT_COMPLETE" | "IMPORT_IN_PROGRESS" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE"
object ResourceStatus {
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  val DELETE_SKIPPED: "DELETE_SKIPPED" = "DELETE_SKIPPED"
  val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  val IMPORT_FAILED: "IMPORT_FAILED" = "IMPORT_FAILED"
  val IMPORT_COMPLETE: "IMPORT_COMPLETE" = "IMPORT_COMPLETE"
  val IMPORT_IN_PROGRESS: "IMPORT_IN_PROGRESS" = "IMPORT_IN_PROGRESS"
  val IMPORT_ROLLBACK_IN_PROGRESS: "IMPORT_ROLLBACK_IN_PROGRESS" = "IMPORT_ROLLBACK_IN_PROGRESS"
  val IMPORT_ROLLBACK_FAILED: "IMPORT_ROLLBACK_FAILED" = "IMPORT_ROLLBACK_FAILED"
  val IMPORT_ROLLBACK_COMPLETE: "IMPORT_ROLLBACK_COMPLETE" = "IMPORT_ROLLBACK_COMPLETE"

  @inline def values = js.Array[ResourceStatus](
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

type StackDriftDetectionStatus = "DETECTION_IN_PROGRESS" | "DETECTION_FAILED" | "DETECTION_COMPLETE"
object StackDriftDetectionStatus {
  val DETECTION_IN_PROGRESS: "DETECTION_IN_PROGRESS" = "DETECTION_IN_PROGRESS"
  val DETECTION_FAILED: "DETECTION_FAILED" = "DETECTION_FAILED"
  val DETECTION_COMPLETE: "DETECTION_COMPLETE" = "DETECTION_COMPLETE"

  @inline def values = js.Array[StackDriftDetectionStatus](DETECTION_IN_PROGRESS, DETECTION_FAILED, DETECTION_COMPLETE)
}

type StackDriftStatus = "DRIFTED" | "IN_SYNC" | "UNKNOWN" | "NOT_CHECKED"
object StackDriftStatus {
  val DRIFTED: "DRIFTED" = "DRIFTED"
  val IN_SYNC: "IN_SYNC" = "IN_SYNC"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  val NOT_CHECKED: "NOT_CHECKED" = "NOT_CHECKED"

  @inline def values = js.Array[StackDriftStatus](DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED)
}

type StackInstanceDetailedStatus = "PENDING" | "RUNNING" | "SUCCEEDED" | "FAILED" | "CANCELLED" | "INOPERABLE"
object StackInstanceDetailedStatus {
  val PENDING: "PENDING" = "PENDING"
  val RUNNING: "RUNNING" = "RUNNING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val INOPERABLE: "INOPERABLE" = "INOPERABLE"

  @inline def values = js.Array[StackInstanceDetailedStatus](PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED, INOPERABLE)
}

type StackInstanceFilterName = "DETAILED_STATUS"
object StackInstanceFilterName {
  val DETAILED_STATUS: "DETAILED_STATUS" = "DETAILED_STATUS"

  @inline def values = js.Array[StackInstanceFilterName](DETAILED_STATUS)
}

type StackInstanceStatus = "CURRENT" | "OUTDATED" | "INOPERABLE"
object StackInstanceStatus {
  val CURRENT: "CURRENT" = "CURRENT"
  val OUTDATED: "OUTDATED" = "OUTDATED"
  val INOPERABLE: "INOPERABLE" = "INOPERABLE"

  @inline def values = js.Array[StackInstanceStatus](CURRENT, OUTDATED, INOPERABLE)
}

type StackResourceDriftStatus = "IN_SYNC" | "MODIFIED" | "DELETED" | "NOT_CHECKED"
object StackResourceDriftStatus {
  val IN_SYNC: "IN_SYNC" = "IN_SYNC"
  val MODIFIED: "MODIFIED" = "MODIFIED"
  val DELETED: "DELETED" = "DELETED"
  val NOT_CHECKED: "NOT_CHECKED" = "NOT_CHECKED"

  @inline def values = js.Array[StackResourceDriftStatus](IN_SYNC, MODIFIED, DELETED, NOT_CHECKED)
}

type StackSetDriftDetectionStatus = "COMPLETED" | "FAILED" | "PARTIAL_SUCCESS" | "IN_PROGRESS" | "STOPPED"
object StackSetDriftDetectionStatus {
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val PARTIAL_SUCCESS: "PARTIAL_SUCCESS" = "PARTIAL_SUCCESS"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[StackSetDriftDetectionStatus](COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS, STOPPED)
}

type StackSetDriftStatus = "DRIFTED" | "IN_SYNC" | "NOT_CHECKED"
object StackSetDriftStatus {
  val DRIFTED: "DRIFTED" = "DRIFTED"
  val IN_SYNC: "IN_SYNC" = "IN_SYNC"
  val NOT_CHECKED: "NOT_CHECKED" = "NOT_CHECKED"

  @inline def values = js.Array[StackSetDriftStatus](DRIFTED, IN_SYNC, NOT_CHECKED)
}

type StackSetOperationAction = "CREATE" | "UPDATE" | "DELETE" | "DETECT_DRIFT"
object StackSetOperationAction {
  val CREATE: "CREATE" = "CREATE"
  val UPDATE: "UPDATE" = "UPDATE"
  val DELETE: "DELETE" = "DELETE"
  val DETECT_DRIFT: "DETECT_DRIFT" = "DETECT_DRIFT"

  @inline def values = js.Array[StackSetOperationAction](CREATE, UPDATE, DELETE, DETECT_DRIFT)
}

type StackSetOperationResultStatus = "PENDING" | "RUNNING" | "SUCCEEDED" | "FAILED" | "CANCELLED"
object StackSetOperationResultStatus {
  val PENDING: "PENDING" = "PENDING"
  val RUNNING: "RUNNING" = "RUNNING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELLED: "CANCELLED" = "CANCELLED"

  @inline def values = js.Array[StackSetOperationResultStatus](PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED)
}

type StackSetOperationStatus = "RUNNING" | "SUCCEEDED" | "FAILED" | "STOPPING" | "STOPPED" | "QUEUED"
object StackSetOperationStatus {
  val RUNNING: "RUNNING" = "RUNNING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"
  val QUEUED: "QUEUED" = "QUEUED"

  @inline def values = js.Array[StackSetOperationStatus](RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED, QUEUED)
}

type StackSetStatus = "ACTIVE" | "DELETED"
object StackSetStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[StackSetStatus](ACTIVE, DELETED)
}

type StackStatus = "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "ROLLBACK_IN_PROGRESS" | "ROLLBACK_FAILED" | "ROLLBACK_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "UPDATE_IN_PROGRESS" | "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_COMPLETE" | "UPDATE_ROLLBACK_IN_PROGRESS" | "UPDATE_ROLLBACK_FAILED" | "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_ROLLBACK_COMPLETE" | "REVIEW_IN_PROGRESS" | "IMPORT_IN_PROGRESS" | "IMPORT_COMPLETE" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE"
object StackStatus {
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  val ROLLBACK_IN_PROGRESS: "ROLLBACK_IN_PROGRESS" = "ROLLBACK_IN_PROGRESS"
  val ROLLBACK_FAILED: "ROLLBACK_FAILED" = "ROLLBACK_FAILED"
  val ROLLBACK_COMPLETE: "ROLLBACK_COMPLETE" = "ROLLBACK_COMPLETE"
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  val UPDATE_COMPLETE_CLEANUP_IN_PROGRESS: "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" = "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS"
  val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  val UPDATE_ROLLBACK_IN_PROGRESS: "UPDATE_ROLLBACK_IN_PROGRESS" = "UPDATE_ROLLBACK_IN_PROGRESS"
  val UPDATE_ROLLBACK_FAILED: "UPDATE_ROLLBACK_FAILED" = "UPDATE_ROLLBACK_FAILED"
  val UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS: "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" = "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS"
  val UPDATE_ROLLBACK_COMPLETE: "UPDATE_ROLLBACK_COMPLETE" = "UPDATE_ROLLBACK_COMPLETE"
  val REVIEW_IN_PROGRESS: "REVIEW_IN_PROGRESS" = "REVIEW_IN_PROGRESS"
  val IMPORT_IN_PROGRESS: "IMPORT_IN_PROGRESS" = "IMPORT_IN_PROGRESS"
  val IMPORT_COMPLETE: "IMPORT_COMPLETE" = "IMPORT_COMPLETE"
  val IMPORT_ROLLBACK_IN_PROGRESS: "IMPORT_ROLLBACK_IN_PROGRESS" = "IMPORT_ROLLBACK_IN_PROGRESS"
  val IMPORT_ROLLBACK_FAILED: "IMPORT_ROLLBACK_FAILED" = "IMPORT_ROLLBACK_FAILED"
  val IMPORT_ROLLBACK_COMPLETE: "IMPORT_ROLLBACK_COMPLETE" = "IMPORT_ROLLBACK_COMPLETE"

  @inline def values = js.Array[StackStatus](
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

type TemplateStage = "Original" | "Processed"
object TemplateStage {
  val Original: "Original" = "Original"
  val Processed: "Processed" = "Processed"

  @inline def values = js.Array[TemplateStage](Original, Processed)
}

type Visibility = "PUBLIC" | "PRIVATE"
object Visibility {
  val PUBLIC: "PUBLIC" = "PUBLIC"
  val PRIVATE: "PRIVATE" = "PRIVATE"

  @inline def values = js.Array[Visibility](PUBLIC, PRIVATE)
}
