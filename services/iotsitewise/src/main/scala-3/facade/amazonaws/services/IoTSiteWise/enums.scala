package facade.amazonaws.services.iotsitewise

import scalajs.js

type AggregateType = "AVERAGE" | "COUNT" | "MAXIMUM" | "MINIMUM" | "SUM" | "STANDARD_DEVIATION"
object AggregateType {
  inline val AVERAGE: "AVERAGE" = "AVERAGE"
  inline val COUNT: "COUNT" = "COUNT"
  inline val MAXIMUM: "MAXIMUM" = "MAXIMUM"
  inline val MINIMUM: "MINIMUM" = "MINIMUM"
  inline val SUM: "SUM" = "SUM"
  inline val STANDARD_DEVIATION: "STANDARD_DEVIATION" = "STANDARD_DEVIATION"

  inline def values: js.Array[AggregateType] = js.Array(AVERAGE, COUNT, MAXIMUM, MINIMUM, SUM, STANDARD_DEVIATION)
}

type AssetErrorCode = "INTERNAL_FAILURE"
object AssetErrorCode {
  inline val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"

  inline def values: js.Array[AssetErrorCode] = js.Array(INTERNAL_FAILURE)
}

type AssetModelState = "CREATING" | "ACTIVE" | "UPDATING" | "PROPAGATING" | "DELETING" | "FAILED"
object AssetModelState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val PROPAGATING: "PROPAGATING" = "PROPAGATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AssetModelState] = js.Array(CREATING, ACTIVE, UPDATING, PROPAGATING, DELETING, FAILED)
}

type AssetRelationshipType = "HIERARCHY"
object AssetRelationshipType {
  inline val HIERARCHY: "HIERARCHY" = "HIERARCHY"

  inline def values: js.Array[AssetRelationshipType] = js.Array(HIERARCHY)
}

type AssetState = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "FAILED"
object AssetState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AssetState] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, FAILED)
}

type AuthMode = "IAM" | "SSO"
object AuthMode {
  inline val IAM: "IAM" = "IAM"
  inline val SSO: "SSO" = "SSO"

  inline def values: js.Array[AuthMode] = js.Array(IAM, SSO)
}

type BatchPutAssetPropertyValueErrorCode = "ResourceNotFoundException" | "InvalidRequestException" | "InternalFailureException" | "ServiceUnavailableException" | "ThrottlingException" | "LimitExceededException" | "ConflictingOperationException" | "TimestampOutOfRangeException" | "AccessDeniedException"
object BatchPutAssetPropertyValueErrorCode {
  inline val ResourceNotFoundException: "ResourceNotFoundException" = "ResourceNotFoundException"
  inline val InvalidRequestException: "InvalidRequestException" = "InvalidRequestException"
  inline val InternalFailureException: "InternalFailureException" = "InternalFailureException"
  inline val ServiceUnavailableException: "ServiceUnavailableException" = "ServiceUnavailableException"
  inline val ThrottlingException: "ThrottlingException" = "ThrottlingException"
  inline val LimitExceededException: "LimitExceededException" = "LimitExceededException"
  inline val ConflictingOperationException: "ConflictingOperationException" = "ConflictingOperationException"
  inline val TimestampOutOfRangeException: "TimestampOutOfRangeException" = "TimestampOutOfRangeException"
  inline val AccessDeniedException: "AccessDeniedException" = "AccessDeniedException"

  inline def values: js.Array[BatchPutAssetPropertyValueErrorCode] = js.Array(
    ResourceNotFoundException,
    InvalidRequestException,
    InternalFailureException,
    ServiceUnavailableException,
    ThrottlingException,
    LimitExceededException,
    ConflictingOperationException,
    TimestampOutOfRangeException,
    AccessDeniedException
  )
}

type CapabilitySyncStatus = "IN_SYNC" | "OUT_OF_SYNC" | "SYNC_FAILED"
object CapabilitySyncStatus {
  inline val IN_SYNC: "IN_SYNC" = "IN_SYNC"
  inline val OUT_OF_SYNC: "OUT_OF_SYNC" = "OUT_OF_SYNC"
  inline val SYNC_FAILED: "SYNC_FAILED" = "SYNC_FAILED"

  inline def values: js.Array[CapabilitySyncStatus] = js.Array(IN_SYNC, OUT_OF_SYNC, SYNC_FAILED)
}

type ConfigurationState = "ACTIVE" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED"
object ConfigurationState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[ConfigurationState] = js.Array(ACTIVE, UPDATE_IN_PROGRESS, UPDATE_FAILED)
}

type EncryptionType = "SITEWISE_DEFAULT_ENCRYPTION" | "KMS_BASED_ENCRYPTION"
object EncryptionType {
  inline val SITEWISE_DEFAULT_ENCRYPTION: "SITEWISE_DEFAULT_ENCRYPTION" = "SITEWISE_DEFAULT_ENCRYPTION"
  inline val KMS_BASED_ENCRYPTION: "KMS_BASED_ENCRYPTION" = "KMS_BASED_ENCRYPTION"

  inline def values: js.Array[EncryptionType] = js.Array(SITEWISE_DEFAULT_ENCRYPTION, KMS_BASED_ENCRYPTION)
}

type ErrorCode = "VALIDATION_ERROR" | "INTERNAL_FAILURE"
object ErrorCode {
  inline val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  inline val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"

  inline def values: js.Array[ErrorCode] = js.Array(VALIDATION_ERROR, INTERNAL_FAILURE)
}

type IdentityType = "USER" | "GROUP" | "IAM"
object IdentityType {
  inline val USER: "USER" = "USER"
  inline val GROUP: "GROUP" = "GROUP"
  inline val IAM: "IAM" = "IAM"

  inline def values: js.Array[IdentityType] = js.Array(USER, GROUP, IAM)
}

type ImageFileType = "PNG"
object ImageFileType {
  inline val PNG: "PNG" = "PNG"

  inline def values: js.Array[ImageFileType] = js.Array(PNG)
}

type ListAssetsFilter = "ALL" | "TOP_LEVEL"
object ListAssetsFilter {
  inline val ALL: "ALL" = "ALL"
  inline val TOP_LEVEL: "TOP_LEVEL" = "TOP_LEVEL"

  inline def values: js.Array[ListAssetsFilter] = js.Array(ALL, TOP_LEVEL)
}

type LoggingLevel = "ERROR" | "INFO" | "OFF"
object LoggingLevel {
  inline val ERROR: "ERROR" = "ERROR"
  inline val INFO: "INFO" = "INFO"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[LoggingLevel] = js.Array(ERROR, INFO, OFF)
}

type MonitorErrorCode = "INTERNAL_FAILURE" | "VALIDATION_ERROR" | "LIMIT_EXCEEDED"
object MonitorErrorCode {
  inline val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"
  inline val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  inline val LIMIT_EXCEEDED: "LIMIT_EXCEEDED" = "LIMIT_EXCEEDED"

  inline def values: js.Array[MonitorErrorCode] = js.Array(INTERNAL_FAILURE, VALIDATION_ERROR, LIMIT_EXCEEDED)
}

type Permission = "ADMINISTRATOR" | "VIEWER"
object Permission {
  inline val ADMINISTRATOR: "ADMINISTRATOR" = "ADMINISTRATOR"
  inline val VIEWER: "VIEWER" = "VIEWER"

  inline def values: js.Array[Permission] = js.Array(ADMINISTRATOR, VIEWER)
}

type PortalState = "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | "FAILED"
object PortalState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[PortalState] = js.Array(CREATING, UPDATING, DELETING, ACTIVE, FAILED)
}

type PropertyDataType = "STRING" | "INTEGER" | "DOUBLE" | "BOOLEAN" | "STRUCT"
object PropertyDataType {
  inline val STRING: "STRING" = "STRING"
  inline val INTEGER: "INTEGER" = "INTEGER"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val STRUCT: "STRUCT" = "STRUCT"

  inline def values: js.Array[PropertyDataType] = js.Array(STRING, INTEGER, DOUBLE, BOOLEAN, STRUCT)
}

type PropertyNotificationState = "ENABLED" | "DISABLED"
object PropertyNotificationState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[PropertyNotificationState] = js.Array(ENABLED, DISABLED)
}

type Quality = "GOOD" | "BAD" | "UNCERTAIN"
object Quality {
  inline val GOOD: "GOOD" = "GOOD"
  inline val BAD: "BAD" = "BAD"
  inline val UNCERTAIN: "UNCERTAIN" = "UNCERTAIN"

  inline def values: js.Array[Quality] = js.Array(GOOD, BAD, UNCERTAIN)
}

type ResourceType = "PORTAL" | "PROJECT"
object ResourceType {
  inline val PORTAL: "PORTAL" = "PORTAL"
  inline val PROJECT: "PROJECT" = "PROJECT"

  inline def values: js.Array[ResourceType] = js.Array(PORTAL, PROJECT)
}

type TimeOrdering = "ASCENDING" | "DESCENDING"
object TimeOrdering {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[TimeOrdering] = js.Array(ASCENDING, DESCENDING)
}

type TraversalDirection = "PARENT" | "CHILD"
object TraversalDirection {
  inline val PARENT: "PARENT" = "PARENT"
  inline val CHILD: "CHILD" = "CHILD"

  inline def values: js.Array[TraversalDirection] = js.Array(PARENT, CHILD)
}

type TraversalType = "PATH_TO_ROOT"
object TraversalType {
  inline val PATH_TO_ROOT: "PATH_TO_ROOT" = "PATH_TO_ROOT"

  inline def values: js.Array[TraversalType] = js.Array(PATH_TO_ROOT)
}
