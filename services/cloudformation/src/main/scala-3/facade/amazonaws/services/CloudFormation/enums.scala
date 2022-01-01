package facade.amazonaws.services.cloudformation

import scalajs.js

type AccountGateStatus = "SUCCEEDED" | "FAILED" | "SKIPPED"
object AccountGateStatus {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SKIPPED: "SKIPPED" = "SKIPPED"

  inline def values: js.Array[AccountGateStatus] = js.Array(SUCCEEDED, FAILED, SKIPPED)
}

type CallAs = "SELF" | "DELEGATED_ADMIN"
object CallAs {
  inline val SELF: "SELF" = "SELF"
  inline val DELEGATED_ADMIN: "DELEGATED_ADMIN" = "DELEGATED_ADMIN"

  inline def values: js.Array[CallAs] = js.Array(SELF, DELEGATED_ADMIN)
}

type Capability = "CAPABILITY_IAM" | "CAPABILITY_NAMED_IAM" | "CAPABILITY_AUTO_EXPAND"
object Capability {
  inline val CAPABILITY_IAM: "CAPABILITY_IAM" = "CAPABILITY_IAM"
  inline val CAPABILITY_NAMED_IAM: "CAPABILITY_NAMED_IAM" = "CAPABILITY_NAMED_IAM"
  inline val CAPABILITY_AUTO_EXPAND: "CAPABILITY_AUTO_EXPAND" = "CAPABILITY_AUTO_EXPAND"

  inline def values: js.Array[Capability] = js.Array(CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_AUTO_EXPAND)
}

type Category = "REGISTERED" | "ACTIVATED" | "THIRD_PARTY" | "AWS_TYPES"
object Category {
  inline val REGISTERED: "REGISTERED" = "REGISTERED"
  inline val ACTIVATED: "ACTIVATED" = "ACTIVATED"
  inline val THIRD_PARTY: "THIRD_PARTY" = "THIRD_PARTY"
  inline val AWS_TYPES: "AWS_TYPES" = "AWS_TYPES"

  inline def values: js.Array[Category] = js.Array(REGISTERED, ACTIVATED, THIRD_PARTY, AWS_TYPES)
}

type ChangeAction = "Add" | "Modify" | "Remove" | "Import" | "Dynamic"
object ChangeAction {
  inline val Add: "Add" = "Add"
  inline val Modify: "Modify" = "Modify"
  inline val Remove: "Remove" = "Remove"
  inline val Import: "Import" = "Import"
  inline val Dynamic: "Dynamic" = "Dynamic"

  inline def values: js.Array[ChangeAction] = js.Array(Add, Modify, Remove, Import, Dynamic)
}

type ChangeSetStatus = "CREATE_PENDING" | "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "DELETE_PENDING" | "DELETE_IN_PROGRESS" | "DELETE_COMPLETE" | "DELETE_FAILED" | "FAILED"
object ChangeSetStatus {
  inline val CREATE_PENDING: "CREATE_PENDING" = "CREATE_PENDING"
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  inline val DELETE_PENDING: "DELETE_PENDING" = "DELETE_PENDING"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ChangeSetStatus] = js.Array(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED, FAILED)
}

type ChangeSetType = "CREATE" | "UPDATE" | "IMPORT"
object ChangeSetType {
  inline val CREATE: "CREATE" = "CREATE"
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val IMPORT: "IMPORT" = "IMPORT"

  inline def values: js.Array[ChangeSetType] = js.Array(CREATE, UPDATE, IMPORT)
}

type ChangeSource = "ResourceReference" | "ParameterReference" | "ResourceAttribute" | "DirectModification" | "Automatic"
object ChangeSource {
  inline val ResourceReference: "ResourceReference" = "ResourceReference"
  inline val ParameterReference: "ParameterReference" = "ParameterReference"
  inline val ResourceAttribute: "ResourceAttribute" = "ResourceAttribute"
  inline val DirectModification: "DirectModification" = "DirectModification"
  inline val Automatic: "Automatic" = "Automatic"

  inline def values: js.Array[ChangeSource] = js.Array(ResourceReference, ParameterReference, ResourceAttribute, DirectModification, Automatic)
}

type ChangeType = "Resource"
object ChangeType {
  inline val Resource: "Resource" = "Resource"

  inline def values: js.Array[ChangeType] = js.Array(Resource)
}

type DeprecatedStatus = "LIVE" | "DEPRECATED"
object DeprecatedStatus {
  inline val LIVE: "LIVE" = "LIVE"
  inline val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  inline def values: js.Array[DeprecatedStatus] = js.Array(LIVE, DEPRECATED)
}

type DifferenceType = "ADD" | "REMOVE" | "NOT_EQUAL"
object DifferenceType {
  inline val ADD: "ADD" = "ADD"
  inline val REMOVE: "REMOVE" = "REMOVE"
  inline val NOT_EQUAL: "NOT_EQUAL" = "NOT_EQUAL"

  inline def values: js.Array[DifferenceType] = js.Array(ADD, REMOVE, NOT_EQUAL)
}

type EvaluationType = "Static" | "Dynamic"
object EvaluationType {
  inline val Static: "Static" = "Static"
  inline val Dynamic: "Dynamic" = "Dynamic"

  inline def values: js.Array[EvaluationType] = js.Array(Static, Dynamic)
}

type ExecutionStatus = "UNAVAILABLE" | "AVAILABLE" | "EXECUTE_IN_PROGRESS" | "EXECUTE_COMPLETE" | "EXECUTE_FAILED" | "OBSOLETE"
object ExecutionStatus {
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val EXECUTE_IN_PROGRESS: "EXECUTE_IN_PROGRESS" = "EXECUTE_IN_PROGRESS"
  inline val EXECUTE_COMPLETE: "EXECUTE_COMPLETE" = "EXECUTE_COMPLETE"
  inline val EXECUTE_FAILED: "EXECUTE_FAILED" = "EXECUTE_FAILED"
  inline val OBSOLETE: "OBSOLETE" = "OBSOLETE"

  inline def values: js.Array[ExecutionStatus] = js.Array(UNAVAILABLE, AVAILABLE, EXECUTE_IN_PROGRESS, EXECUTE_COMPLETE, EXECUTE_FAILED, OBSOLETE)
}

type HandlerErrorCode = "NotUpdatable" | "InvalidRequest" | "AccessDenied" | "InvalidCredentials" | "AlreadyExists" | "NotFound" | "ResourceConflict" | "Throttling" | "ServiceLimitExceeded" | "NotStabilized" | "GeneralServiceException" | "ServiceInternalError" | "NetworkFailure" | "InternalFailure" | "InvalidTypeConfiguration"
object HandlerErrorCode {
  inline val NotUpdatable: "NotUpdatable" = "NotUpdatable"
  inline val InvalidRequest: "InvalidRequest" = "InvalidRequest"
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val InvalidCredentials: "InvalidCredentials" = "InvalidCredentials"
  inline val AlreadyExists: "AlreadyExists" = "AlreadyExists"
  inline val NotFound: "NotFound" = "NotFound"
  inline val ResourceConflict: "ResourceConflict" = "ResourceConflict"
  inline val Throttling: "Throttling" = "Throttling"
  inline val ServiceLimitExceeded: "ServiceLimitExceeded" = "ServiceLimitExceeded"
  inline val NotStabilized: "NotStabilized" = "NotStabilized"
  inline val GeneralServiceException: "GeneralServiceException" = "GeneralServiceException"
  inline val ServiceInternalError: "ServiceInternalError" = "ServiceInternalError"
  inline val NetworkFailure: "NetworkFailure" = "NetworkFailure"
  inline val InternalFailure: "InternalFailure" = "InternalFailure"
  inline val InvalidTypeConfiguration: "InvalidTypeConfiguration" = "InvalidTypeConfiguration"

  inline def values: js.Array[HandlerErrorCode] = js.Array(
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
    InternalFailure,
    InvalidTypeConfiguration
  )
}

type IdentityProvider = "AWS_Marketplace" | "GitHub" | "Bitbucket"
object IdentityProvider {
  inline val AWS_Marketplace: "AWS_Marketplace" = "AWS_Marketplace"
  inline val GitHub: "GitHub" = "GitHub"
  inline val Bitbucket: "Bitbucket" = "Bitbucket"

  inline def values: js.Array[IdentityProvider] = js.Array(AWS_Marketplace, GitHub, Bitbucket)
}

type OnFailure = "DO_NOTHING" | "ROLLBACK" | "DELETE"
object OnFailure {
  inline val DO_NOTHING: "DO_NOTHING" = "DO_NOTHING"
  inline val ROLLBACK: "ROLLBACK" = "ROLLBACK"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[OnFailure] = js.Array(DO_NOTHING, ROLLBACK, DELETE)
}

type OperationStatus = "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED"
object OperationStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[OperationStatus] = js.Array(PENDING, IN_PROGRESS, SUCCESS, FAILED)
}

type PermissionModels = "SERVICE_MANAGED" | "SELF_MANAGED"
object PermissionModels {
  inline val SERVICE_MANAGED: "SERVICE_MANAGED" = "SERVICE_MANAGED"
  inline val SELF_MANAGED: "SELF_MANAGED" = "SELF_MANAGED"

  inline def values: js.Array[PermissionModels] = js.Array(SERVICE_MANAGED, SELF_MANAGED)
}

type ProvisioningType = "NON_PROVISIONABLE" | "IMMUTABLE" | "FULLY_MUTABLE"
object ProvisioningType {
  inline val NON_PROVISIONABLE: "NON_PROVISIONABLE" = "NON_PROVISIONABLE"
  inline val IMMUTABLE: "IMMUTABLE" = "IMMUTABLE"
  inline val FULLY_MUTABLE: "FULLY_MUTABLE" = "FULLY_MUTABLE"

  inline def values: js.Array[ProvisioningType] = js.Array(NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE)
}

type PublisherStatus = "VERIFIED" | "UNVERIFIED"
object PublisherStatus {
  inline val VERIFIED: "VERIFIED" = "VERIFIED"
  inline val UNVERIFIED: "UNVERIFIED" = "UNVERIFIED"

  inline def values: js.Array[PublisherStatus] = js.Array(VERIFIED, UNVERIFIED)
}

type RegionConcurrencyType = "SEQUENTIAL" | "PARALLEL"
object RegionConcurrencyType {
  inline val SEQUENTIAL: "SEQUENTIAL" = "SEQUENTIAL"
  inline val PARALLEL: "PARALLEL" = "PARALLEL"

  inline def values: js.Array[RegionConcurrencyType] = js.Array(SEQUENTIAL, PARALLEL)
}

type RegistrationStatus = "COMPLETE" | "IN_PROGRESS" | "FAILED"
object RegistrationStatus {
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[RegistrationStatus] = js.Array(COMPLETE, IN_PROGRESS, FAILED)
}

type RegistryType = "RESOURCE" | "MODULE"
object RegistryType {
  inline val RESOURCE: "RESOURCE" = "RESOURCE"
  inline val MODULE: "MODULE" = "MODULE"

  inline def values: js.Array[RegistryType] = js.Array(RESOURCE, MODULE)
}

type Replacement = "True" | "False" | "Conditional"
object Replacement {
  inline val True: "True" = "True"
  inline val False: "False" = "False"
  inline val Conditional: "Conditional" = "Conditional"

  inline def values: js.Array[Replacement] = js.Array(True, False, Conditional)
}

type RequiresRecreation = "Never" | "Conditionally" | "Always"
object RequiresRecreation {
  inline val Never: "Never" = "Never"
  inline val Conditionally: "Conditionally" = "Conditionally"
  inline val Always: "Always" = "Always"

  inline def values: js.Array[RequiresRecreation] = js.Array(Never, Conditionally, Always)
}

type ResourceAttribute = "Properties" | "Metadata" | "CreationPolicy" | "UpdatePolicy" | "DeletionPolicy" | "Tags"
object ResourceAttribute {
  inline val Properties: "Properties" = "Properties"
  inline val Metadata: "Metadata" = "Metadata"
  inline val CreationPolicy: "CreationPolicy" = "CreationPolicy"
  inline val UpdatePolicy: "UpdatePolicy" = "UpdatePolicy"
  inline val DeletionPolicy: "DeletionPolicy" = "DeletionPolicy"
  inline val Tags: "Tags" = "Tags"

  inline def values: js.Array[ResourceAttribute] = js.Array(Properties, Metadata, CreationPolicy, UpdatePolicy, DeletionPolicy, Tags)
}

type ResourceSignalStatus = "SUCCESS" | "FAILURE"
object ResourceSignalStatus {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILURE: "FAILURE" = "FAILURE"

  inline def values: js.Array[ResourceSignalStatus] = js.Array(SUCCESS, FAILURE)
}

type ResourceStatus = "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "DELETE_SKIPPED" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | "UPDATE_COMPLETE" | "IMPORT_FAILED" | "IMPORT_COMPLETE" | "IMPORT_IN_PROGRESS" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE" | "UPDATE_ROLLBACK_IN_PROGRESS" | "UPDATE_ROLLBACK_COMPLETE" | "UPDATE_ROLLBACK_FAILED" | "ROLLBACK_IN_PROGRESS" | "ROLLBACK_COMPLETE" | "ROLLBACK_FAILED"
object ResourceStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  inline val DELETE_SKIPPED: "DELETE_SKIPPED" = "DELETE_SKIPPED"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  inline val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  inline val IMPORT_FAILED: "IMPORT_FAILED" = "IMPORT_FAILED"
  inline val IMPORT_COMPLETE: "IMPORT_COMPLETE" = "IMPORT_COMPLETE"
  inline val IMPORT_IN_PROGRESS: "IMPORT_IN_PROGRESS" = "IMPORT_IN_PROGRESS"
  inline val IMPORT_ROLLBACK_IN_PROGRESS: "IMPORT_ROLLBACK_IN_PROGRESS" = "IMPORT_ROLLBACK_IN_PROGRESS"
  inline val IMPORT_ROLLBACK_FAILED: "IMPORT_ROLLBACK_FAILED" = "IMPORT_ROLLBACK_FAILED"
  inline val IMPORT_ROLLBACK_COMPLETE: "IMPORT_ROLLBACK_COMPLETE" = "IMPORT_ROLLBACK_COMPLETE"
  inline val UPDATE_ROLLBACK_IN_PROGRESS: "UPDATE_ROLLBACK_IN_PROGRESS" = "UPDATE_ROLLBACK_IN_PROGRESS"
  inline val UPDATE_ROLLBACK_COMPLETE: "UPDATE_ROLLBACK_COMPLETE" = "UPDATE_ROLLBACK_COMPLETE"
  inline val UPDATE_ROLLBACK_FAILED: "UPDATE_ROLLBACK_FAILED" = "UPDATE_ROLLBACK_FAILED"
  inline val ROLLBACK_IN_PROGRESS: "ROLLBACK_IN_PROGRESS" = "ROLLBACK_IN_PROGRESS"
  inline val ROLLBACK_COMPLETE: "ROLLBACK_COMPLETE" = "ROLLBACK_COMPLETE"
  inline val ROLLBACK_FAILED: "ROLLBACK_FAILED" = "ROLLBACK_FAILED"

  inline def values: js.Array[ResourceStatus] = js.Array(
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
    IMPORT_ROLLBACK_COMPLETE,
    UPDATE_ROLLBACK_IN_PROGRESS,
    UPDATE_ROLLBACK_COMPLETE,
    UPDATE_ROLLBACK_FAILED,
    ROLLBACK_IN_PROGRESS,
    ROLLBACK_COMPLETE,
    ROLLBACK_FAILED
  )
}

type StackDriftDetectionStatus = "DETECTION_IN_PROGRESS" | "DETECTION_FAILED" | "DETECTION_COMPLETE"
object StackDriftDetectionStatus {
  inline val DETECTION_IN_PROGRESS: "DETECTION_IN_PROGRESS" = "DETECTION_IN_PROGRESS"
  inline val DETECTION_FAILED: "DETECTION_FAILED" = "DETECTION_FAILED"
  inline val DETECTION_COMPLETE: "DETECTION_COMPLETE" = "DETECTION_COMPLETE"

  inline def values: js.Array[StackDriftDetectionStatus] = js.Array(DETECTION_IN_PROGRESS, DETECTION_FAILED, DETECTION_COMPLETE)
}

type StackDriftStatus = "DRIFTED" | "IN_SYNC" | "UNKNOWN" | "NOT_CHECKED"
object StackDriftStatus {
  inline val DRIFTED: "DRIFTED" = "DRIFTED"
  inline val IN_SYNC: "IN_SYNC" = "IN_SYNC"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val NOT_CHECKED: "NOT_CHECKED" = "NOT_CHECKED"

  inline def values: js.Array[StackDriftStatus] = js.Array(DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED)
}

type StackInstanceDetailedStatus = "PENDING" | "RUNNING" | "SUCCEEDED" | "FAILED" | "CANCELLED" | "INOPERABLE"
object StackInstanceDetailedStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val INOPERABLE: "INOPERABLE" = "INOPERABLE"

  inline def values: js.Array[StackInstanceDetailedStatus] = js.Array(PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED, INOPERABLE)
}

type StackInstanceFilterName = "DETAILED_STATUS"
object StackInstanceFilterName {
  inline val DETAILED_STATUS: "DETAILED_STATUS" = "DETAILED_STATUS"

  inline def values: js.Array[StackInstanceFilterName] = js.Array(DETAILED_STATUS)
}

type StackInstanceStatus = "CURRENT" | "OUTDATED" | "INOPERABLE"
object StackInstanceStatus {
  inline val CURRENT: "CURRENT" = "CURRENT"
  inline val OUTDATED: "OUTDATED" = "OUTDATED"
  inline val INOPERABLE: "INOPERABLE" = "INOPERABLE"

  inline def values: js.Array[StackInstanceStatus] = js.Array(CURRENT, OUTDATED, INOPERABLE)
}

type StackResourceDriftStatus = "IN_SYNC" | "MODIFIED" | "DELETED" | "NOT_CHECKED"
object StackResourceDriftStatus {
  inline val IN_SYNC: "IN_SYNC" = "IN_SYNC"
  inline val MODIFIED: "MODIFIED" = "MODIFIED"
  inline val DELETED: "DELETED" = "DELETED"
  inline val NOT_CHECKED: "NOT_CHECKED" = "NOT_CHECKED"

  inline def values: js.Array[StackResourceDriftStatus] = js.Array(IN_SYNC, MODIFIED, DELETED, NOT_CHECKED)
}

type StackSetDriftDetectionStatus = "COMPLETED" | "FAILED" | "PARTIAL_SUCCESS" | "IN_PROGRESS" | "STOPPED"
object StackSetDriftDetectionStatus {
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PARTIAL_SUCCESS: "PARTIAL_SUCCESS" = "PARTIAL_SUCCESS"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[StackSetDriftDetectionStatus] = js.Array(COMPLETED, FAILED, PARTIAL_SUCCESS, IN_PROGRESS, STOPPED)
}

type StackSetDriftStatus = "DRIFTED" | "IN_SYNC" | "NOT_CHECKED"
object StackSetDriftStatus {
  inline val DRIFTED: "DRIFTED" = "DRIFTED"
  inline val IN_SYNC: "IN_SYNC" = "IN_SYNC"
  inline val NOT_CHECKED: "NOT_CHECKED" = "NOT_CHECKED"

  inline def values: js.Array[StackSetDriftStatus] = js.Array(DRIFTED, IN_SYNC, NOT_CHECKED)
}

type StackSetOperationAction = "CREATE" | "UPDATE" | "DELETE" | "DETECT_DRIFT"
object StackSetOperationAction {
  inline val CREATE: "CREATE" = "CREATE"
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"
  inline val DETECT_DRIFT: "DETECT_DRIFT" = "DETECT_DRIFT"

  inline def values: js.Array[StackSetOperationAction] = js.Array(CREATE, UPDATE, DELETE, DETECT_DRIFT)
}

type StackSetOperationResultStatus = "PENDING" | "RUNNING" | "SUCCEEDED" | "FAILED" | "CANCELLED"
object StackSetOperationResultStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[StackSetOperationResultStatus] = js.Array(PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED)
}

type StackSetOperationStatus = "RUNNING" | "SUCCEEDED" | "FAILED" | "STOPPING" | "STOPPED" | "QUEUED"
object StackSetOperationStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val QUEUED: "QUEUED" = "QUEUED"

  inline def values: js.Array[StackSetOperationStatus] = js.Array(RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED, QUEUED)
}

type StackSetStatus = "ACTIVE" | "DELETED"
object StackSetStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[StackSetStatus] = js.Array(ACTIVE, DELETED)
}

type StackStatus = "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "ROLLBACK_IN_PROGRESS" | "ROLLBACK_FAILED" | "ROLLBACK_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "UPDATE_IN_PROGRESS" | "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_COMPLETE" | "UPDATE_FAILED" | "UPDATE_ROLLBACK_IN_PROGRESS" | "UPDATE_ROLLBACK_FAILED" | "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_ROLLBACK_COMPLETE" | "REVIEW_IN_PROGRESS" | "IMPORT_IN_PROGRESS" | "IMPORT_COMPLETE" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE"
object StackStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  inline val ROLLBACK_IN_PROGRESS: "ROLLBACK_IN_PROGRESS" = "ROLLBACK_IN_PROGRESS"
  inline val ROLLBACK_FAILED: "ROLLBACK_FAILED" = "ROLLBACK_FAILED"
  inline val ROLLBACK_COMPLETE: "ROLLBACK_COMPLETE" = "ROLLBACK_COMPLETE"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_COMPLETE_CLEANUP_IN_PROGRESS: "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" = "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS"
  inline val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  inline val UPDATE_ROLLBACK_IN_PROGRESS: "UPDATE_ROLLBACK_IN_PROGRESS" = "UPDATE_ROLLBACK_IN_PROGRESS"
  inline val UPDATE_ROLLBACK_FAILED: "UPDATE_ROLLBACK_FAILED" = "UPDATE_ROLLBACK_FAILED"
  inline val UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS: "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" = "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS"
  inline val UPDATE_ROLLBACK_COMPLETE: "UPDATE_ROLLBACK_COMPLETE" = "UPDATE_ROLLBACK_COMPLETE"
  inline val REVIEW_IN_PROGRESS: "REVIEW_IN_PROGRESS" = "REVIEW_IN_PROGRESS"
  inline val IMPORT_IN_PROGRESS: "IMPORT_IN_PROGRESS" = "IMPORT_IN_PROGRESS"
  inline val IMPORT_COMPLETE: "IMPORT_COMPLETE" = "IMPORT_COMPLETE"
  inline val IMPORT_ROLLBACK_IN_PROGRESS: "IMPORT_ROLLBACK_IN_PROGRESS" = "IMPORT_ROLLBACK_IN_PROGRESS"
  inline val IMPORT_ROLLBACK_FAILED: "IMPORT_ROLLBACK_FAILED" = "IMPORT_ROLLBACK_FAILED"
  inline val IMPORT_ROLLBACK_COMPLETE: "IMPORT_ROLLBACK_COMPLETE" = "IMPORT_ROLLBACK_COMPLETE"

  inline def values: js.Array[StackStatus] = js.Array(
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
    UPDATE_FAILED,
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
  inline val Original: "Original" = "Original"
  inline val Processed: "Processed" = "Processed"

  inline def values: js.Array[TemplateStage] = js.Array(Original, Processed)
}

type ThirdPartyType = "RESOURCE" | "MODULE"
object ThirdPartyType {
  inline val RESOURCE: "RESOURCE" = "RESOURCE"
  inline val MODULE: "MODULE" = "MODULE"

  inline def values: js.Array[ThirdPartyType] = js.Array(RESOURCE, MODULE)
}

type TypeTestsStatus = "PASSED" | "FAILED" | "IN_PROGRESS" | "NOT_TESTED"
object TypeTestsStatus {
  inline val PASSED: "PASSED" = "PASSED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val NOT_TESTED: "NOT_TESTED" = "NOT_TESTED"

  inline def values: js.Array[TypeTestsStatus] = js.Array(PASSED, FAILED, IN_PROGRESS, NOT_TESTED)
}

type VersionBump = "MAJOR" | "MINOR"
object VersionBump {
  inline val MAJOR: "MAJOR" = "MAJOR"
  inline val MINOR: "MINOR" = "MINOR"

  inline def values: js.Array[VersionBump] = js.Array(MAJOR, MINOR)
}

type Visibility = "PUBLIC" | "PRIVATE"
object Visibility {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val PRIVATE: "PRIVATE" = "PRIVATE"

  inline def values: js.Array[Visibility] = js.Array(PUBLIC, PRIVATE)
}
