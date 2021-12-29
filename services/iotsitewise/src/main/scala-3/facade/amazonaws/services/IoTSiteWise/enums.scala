package facade.amazonaws.services.iotsitewise

import scalajs._

type AggregateType = "AVERAGE" | "COUNT" | "MAXIMUM" | "MINIMUM" | "SUM" | "STANDARD_DEVIATION"
object AggregateType {
  val AVERAGE: "AVERAGE" = "AVERAGE"
  val COUNT: "COUNT" = "COUNT"
  val MAXIMUM: "MAXIMUM" = "MAXIMUM"
  val MINIMUM: "MINIMUM" = "MINIMUM"
  val SUM: "SUM" = "SUM"
  val STANDARD_DEVIATION: "STANDARD_DEVIATION" = "STANDARD_DEVIATION"

  @inline def values = js.Array[AggregateType](AVERAGE, COUNT, MAXIMUM, MINIMUM, SUM, STANDARD_DEVIATION)
}

type AssetErrorCode = "INTERNAL_FAILURE"
object AssetErrorCode {
  val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"

  @inline def values = js.Array[AssetErrorCode](INTERNAL_FAILURE)
}

type AssetModelState = "CREATING" | "ACTIVE" | "UPDATING" | "PROPAGATING" | "DELETING" | "FAILED"
object AssetModelState {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UPDATING: "UPDATING" = "UPDATING"
  val PROPAGATING: "PROPAGATING" = "PROPAGATING"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AssetModelState](CREATING, ACTIVE, UPDATING, PROPAGATING, DELETING, FAILED)
}

type AssetRelationshipType = "HIERARCHY"
object AssetRelationshipType {
  val HIERARCHY: "HIERARCHY" = "HIERARCHY"

  @inline def values = js.Array[AssetRelationshipType](HIERARCHY)
}

type AssetState = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "FAILED"
object AssetState {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AssetState](CREATING, ACTIVE, UPDATING, DELETING, FAILED)
}

type AuthMode = "IAM" | "SSO"
object AuthMode {
  val IAM: "IAM" = "IAM"
  val SSO: "SSO" = "SSO"

  @inline def values = js.Array[AuthMode](IAM, SSO)
}

type BatchPutAssetPropertyValueErrorCode = "ResourceNotFoundException" | "InvalidRequestException" | "InternalFailureException" | "ServiceUnavailableException" | "ThrottlingException" | "LimitExceededException" | "ConflictingOperationException" | "TimestampOutOfRangeException" | "AccessDeniedException"
object BatchPutAssetPropertyValueErrorCode {
  val ResourceNotFoundException: "ResourceNotFoundException" = "ResourceNotFoundException"
  val InvalidRequestException: "InvalidRequestException" = "InvalidRequestException"
  val InternalFailureException: "InternalFailureException" = "InternalFailureException"
  val ServiceUnavailableException: "ServiceUnavailableException" = "ServiceUnavailableException"
  val ThrottlingException: "ThrottlingException" = "ThrottlingException"
  val LimitExceededException: "LimitExceededException" = "LimitExceededException"
  val ConflictingOperationException: "ConflictingOperationException" = "ConflictingOperationException"
  val TimestampOutOfRangeException: "TimestampOutOfRangeException" = "TimestampOutOfRangeException"
  val AccessDeniedException: "AccessDeniedException" = "AccessDeniedException"

  @inline def values = js.Array[BatchPutAssetPropertyValueErrorCode](
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
  val IN_SYNC: "IN_SYNC" = "IN_SYNC"
  val OUT_OF_SYNC: "OUT_OF_SYNC" = "OUT_OF_SYNC"
  val SYNC_FAILED: "SYNC_FAILED" = "SYNC_FAILED"

  @inline def values = js.Array[CapabilitySyncStatus](IN_SYNC, OUT_OF_SYNC, SYNC_FAILED)
}

type ConfigurationState = "ACTIVE" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED"
object ConfigurationState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[ConfigurationState](ACTIVE, UPDATE_IN_PROGRESS, UPDATE_FAILED)
}

type EncryptionType = "SITEWISE_DEFAULT_ENCRYPTION" | "KMS_BASED_ENCRYPTION"
object EncryptionType {
  val SITEWISE_DEFAULT_ENCRYPTION: "SITEWISE_DEFAULT_ENCRYPTION" = "SITEWISE_DEFAULT_ENCRYPTION"
  val KMS_BASED_ENCRYPTION: "KMS_BASED_ENCRYPTION" = "KMS_BASED_ENCRYPTION"

  @inline def values = js.Array[EncryptionType](SITEWISE_DEFAULT_ENCRYPTION, KMS_BASED_ENCRYPTION)
}

type ErrorCode = "VALIDATION_ERROR" | "INTERNAL_FAILURE"
object ErrorCode {
  val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"

  @inline def values = js.Array[ErrorCode](VALIDATION_ERROR, INTERNAL_FAILURE)
}

type IdentityType = "USER" | "GROUP" | "IAM"
object IdentityType {
  val USER: "USER" = "USER"
  val GROUP: "GROUP" = "GROUP"
  val IAM: "IAM" = "IAM"

  @inline def values = js.Array[IdentityType](USER, GROUP, IAM)
}

type ImageFileType = "PNG"
object ImageFileType {
  val PNG: "PNG" = "PNG"

  @inline def values = js.Array[ImageFileType](PNG)
}

type ListAssetsFilter = "ALL" | "TOP_LEVEL"
object ListAssetsFilter {
  val ALL: "ALL" = "ALL"
  val TOP_LEVEL: "TOP_LEVEL" = "TOP_LEVEL"

  @inline def values = js.Array[ListAssetsFilter](ALL, TOP_LEVEL)
}

type LoggingLevel = "ERROR" | "INFO" | "OFF"
object LoggingLevel {
  val ERROR: "ERROR" = "ERROR"
  val INFO: "INFO" = "INFO"
  val OFF: "OFF" = "OFF"

  @inline def values = js.Array[LoggingLevel](ERROR, INFO, OFF)
}

type MonitorErrorCode = "INTERNAL_FAILURE" | "VALIDATION_ERROR" | "LIMIT_EXCEEDED"
object MonitorErrorCode {
  val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"
  val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  val LIMIT_EXCEEDED: "LIMIT_EXCEEDED" = "LIMIT_EXCEEDED"

  @inline def values = js.Array[MonitorErrorCode](INTERNAL_FAILURE, VALIDATION_ERROR, LIMIT_EXCEEDED)
}

type Permission = "ADMINISTRATOR" | "VIEWER"
object Permission {
  val ADMINISTRATOR: "ADMINISTRATOR" = "ADMINISTRATOR"
  val VIEWER: "VIEWER" = "VIEWER"

  @inline def values = js.Array[Permission](ADMINISTRATOR, VIEWER)
}

type PortalState = "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | "FAILED"
object PortalState {
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[PortalState](CREATING, UPDATING, DELETING, ACTIVE, FAILED)
}

type PropertyDataType = "STRING" | "INTEGER" | "DOUBLE" | "BOOLEAN" | "STRUCT"
object PropertyDataType {
  val STRING: "STRING" = "STRING"
  val INTEGER: "INTEGER" = "INTEGER"
  val DOUBLE: "DOUBLE" = "DOUBLE"
  val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  val STRUCT: "STRUCT" = "STRUCT"

  @inline def values = js.Array[PropertyDataType](STRING, INTEGER, DOUBLE, BOOLEAN, STRUCT)
}

type PropertyNotificationState = "ENABLED" | "DISABLED"
object PropertyNotificationState {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[PropertyNotificationState](ENABLED, DISABLED)
}

type Quality = "GOOD" | "BAD" | "UNCERTAIN"
object Quality {
  val GOOD: "GOOD" = "GOOD"
  val BAD: "BAD" = "BAD"
  val UNCERTAIN: "UNCERTAIN" = "UNCERTAIN"

  @inline def values = js.Array[Quality](GOOD, BAD, UNCERTAIN)
}

type ResourceType = "PORTAL" | "PROJECT"
object ResourceType {
  val PORTAL: "PORTAL" = "PORTAL"
  val PROJECT: "PROJECT" = "PROJECT"

  @inline def values = js.Array[ResourceType](PORTAL, PROJECT)
}

type TimeOrdering = "ASCENDING" | "DESCENDING"
object TimeOrdering {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[TimeOrdering](ASCENDING, DESCENDING)
}

type TraversalDirection = "PARENT" | "CHILD"
object TraversalDirection {
  val PARENT: "PARENT" = "PARENT"
  val CHILD: "CHILD" = "CHILD"

  @inline def values = js.Array[TraversalDirection](PARENT, CHILD)
}

type TraversalType = "PATH_TO_ROOT"
object TraversalType {
  val PATH_TO_ROOT: "PATH_TO_ROOT" = "PATH_TO_ROOT"

  @inline def values = js.Array[TraversalType](PATH_TO_ROOT)
}
