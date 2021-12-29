package facade.amazonaws.services.iotsitewise

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AggregateType extends js.Any
object AggregateType {
  val AVERAGE = "AVERAGE".asInstanceOf[AggregateType]
  val COUNT = "COUNT".asInstanceOf[AggregateType]
  val MAXIMUM = "MAXIMUM".asInstanceOf[AggregateType]
  val MINIMUM = "MINIMUM".asInstanceOf[AggregateType]
  val SUM = "SUM".asInstanceOf[AggregateType]
  val STANDARD_DEVIATION = "STANDARD_DEVIATION".asInstanceOf[AggregateType]

  @inline def values = js.Array(AVERAGE, COUNT, MAXIMUM, MINIMUM, SUM, STANDARD_DEVIATION)
}

@js.native
sealed trait AssetErrorCode extends js.Any
object AssetErrorCode {
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[AssetErrorCode]

  @inline def values = js.Array(INTERNAL_FAILURE)
}

@js.native
sealed trait AssetModelState extends js.Any
object AssetModelState {
  val CREATING = "CREATING".asInstanceOf[AssetModelState]
  val ACTIVE = "ACTIVE".asInstanceOf[AssetModelState]
  val UPDATING = "UPDATING".asInstanceOf[AssetModelState]
  val PROPAGATING = "PROPAGATING".asInstanceOf[AssetModelState]
  val DELETING = "DELETING".asInstanceOf[AssetModelState]
  val FAILED = "FAILED".asInstanceOf[AssetModelState]

  @inline def values = js.Array(CREATING, ACTIVE, UPDATING, PROPAGATING, DELETING, FAILED)
}

@js.native
sealed trait AssetRelationshipType extends js.Any
object AssetRelationshipType {
  val HIERARCHY = "HIERARCHY".asInstanceOf[AssetRelationshipType]

  @inline def values = js.Array(HIERARCHY)
}

@js.native
sealed trait AssetState extends js.Any
object AssetState {
  val CREATING = "CREATING".asInstanceOf[AssetState]
  val ACTIVE = "ACTIVE".asInstanceOf[AssetState]
  val UPDATING = "UPDATING".asInstanceOf[AssetState]
  val DELETING = "DELETING".asInstanceOf[AssetState]
  val FAILED = "FAILED".asInstanceOf[AssetState]

  @inline def values = js.Array(CREATING, ACTIVE, UPDATING, DELETING, FAILED)
}

@js.native
sealed trait AuthMode extends js.Any
object AuthMode {
  val IAM = "IAM".asInstanceOf[AuthMode]
  val SSO = "SSO".asInstanceOf[AuthMode]

  @inline def values = js.Array(IAM, SSO)
}

@js.native
sealed trait BatchPutAssetPropertyValueErrorCode extends js.Any
object BatchPutAssetPropertyValueErrorCode {
  val ResourceNotFoundException = "ResourceNotFoundException".asInstanceOf[BatchPutAssetPropertyValueErrorCode]
  val InvalidRequestException = "InvalidRequestException".asInstanceOf[BatchPutAssetPropertyValueErrorCode]
  val InternalFailureException = "InternalFailureException".asInstanceOf[BatchPutAssetPropertyValueErrorCode]
  val ServiceUnavailableException = "ServiceUnavailableException".asInstanceOf[BatchPutAssetPropertyValueErrorCode]
  val ThrottlingException = "ThrottlingException".asInstanceOf[BatchPutAssetPropertyValueErrorCode]
  val LimitExceededException = "LimitExceededException".asInstanceOf[BatchPutAssetPropertyValueErrorCode]
  val ConflictingOperationException = "ConflictingOperationException".asInstanceOf[BatchPutAssetPropertyValueErrorCode]
  val TimestampOutOfRangeException = "TimestampOutOfRangeException".asInstanceOf[BatchPutAssetPropertyValueErrorCode]
  val AccessDeniedException = "AccessDeniedException".asInstanceOf[BatchPutAssetPropertyValueErrorCode]

  @inline def values = js.Array(ResourceNotFoundException, InvalidRequestException, InternalFailureException, ServiceUnavailableException, ThrottlingException, LimitExceededException, ConflictingOperationException, TimestampOutOfRangeException, AccessDeniedException)
}

@js.native
sealed trait CapabilitySyncStatus extends js.Any
object CapabilitySyncStatus {
  val IN_SYNC = "IN_SYNC".asInstanceOf[CapabilitySyncStatus]
  val OUT_OF_SYNC = "OUT_OF_SYNC".asInstanceOf[CapabilitySyncStatus]
  val SYNC_FAILED = "SYNC_FAILED".asInstanceOf[CapabilitySyncStatus]

  @inline def values = js.Array(IN_SYNC, OUT_OF_SYNC, SYNC_FAILED)
}

@js.native
sealed trait ConfigurationState extends js.Any
object ConfigurationState {
  val ACTIVE = "ACTIVE".asInstanceOf[ConfigurationState]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[ConfigurationState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ConfigurationState]

  @inline def values = js.Array(ACTIVE, UPDATE_IN_PROGRESS, UPDATE_FAILED)
}

@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val SITEWISE_DEFAULT_ENCRYPTION = "SITEWISE_DEFAULT_ENCRYPTION".asInstanceOf[EncryptionType]
  val KMS_BASED_ENCRYPTION = "KMS_BASED_ENCRYPTION".asInstanceOf[EncryptionType]

  @inline def values = js.Array(SITEWISE_DEFAULT_ENCRYPTION, KMS_BASED_ENCRYPTION)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[ErrorCode]
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[ErrorCode]

  @inline def values = js.Array(VALIDATION_ERROR, INTERNAL_FAILURE)
}

@js.native
sealed trait IdentityType extends js.Any
object IdentityType {
  val USER = "USER".asInstanceOf[IdentityType]
  val GROUP = "GROUP".asInstanceOf[IdentityType]
  val IAM = "IAM".asInstanceOf[IdentityType]

  @inline def values = js.Array(USER, GROUP, IAM)
}

@js.native
sealed trait ImageFileType extends js.Any
object ImageFileType {
  val PNG = "PNG".asInstanceOf[ImageFileType]

  @inline def values = js.Array(PNG)
}

@js.native
sealed trait ListAssetsFilter extends js.Any
object ListAssetsFilter {
  val ALL = "ALL".asInstanceOf[ListAssetsFilter]
  val TOP_LEVEL = "TOP_LEVEL".asInstanceOf[ListAssetsFilter]

  @inline def values = js.Array(ALL, TOP_LEVEL)
}

@js.native
sealed trait LoggingLevel extends js.Any
object LoggingLevel {
  val ERROR = "ERROR".asInstanceOf[LoggingLevel]
  val INFO = "INFO".asInstanceOf[LoggingLevel]
  val OFF = "OFF".asInstanceOf[LoggingLevel]

  @inline def values = js.Array(ERROR, INFO, OFF)
}

@js.native
sealed trait MonitorErrorCode extends js.Any
object MonitorErrorCode {
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[MonitorErrorCode]
  val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[MonitorErrorCode]
  val LIMIT_EXCEEDED = "LIMIT_EXCEEDED".asInstanceOf[MonitorErrorCode]

  @inline def values = js.Array(INTERNAL_FAILURE, VALIDATION_ERROR, LIMIT_EXCEEDED)
}

@js.native
sealed trait Permission extends js.Any
object Permission {
  val ADMINISTRATOR = "ADMINISTRATOR".asInstanceOf[Permission]
  val VIEWER = "VIEWER".asInstanceOf[Permission]

  @inline def values = js.Array(ADMINISTRATOR, VIEWER)
}

@js.native
sealed trait PortalState extends js.Any
object PortalState {
  val CREATING = "CREATING".asInstanceOf[PortalState]
  val UPDATING = "UPDATING".asInstanceOf[PortalState]
  val DELETING = "DELETING".asInstanceOf[PortalState]
  val ACTIVE = "ACTIVE".asInstanceOf[PortalState]
  val FAILED = "FAILED".asInstanceOf[PortalState]

  @inline def values = js.Array(CREATING, UPDATING, DELETING, ACTIVE, FAILED)
}

@js.native
sealed trait PropertyDataType extends js.Any
object PropertyDataType {
  val STRING = "STRING".asInstanceOf[PropertyDataType]
  val INTEGER = "INTEGER".asInstanceOf[PropertyDataType]
  val DOUBLE = "DOUBLE".asInstanceOf[PropertyDataType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[PropertyDataType]
  val STRUCT = "STRUCT".asInstanceOf[PropertyDataType]

  @inline def values = js.Array(STRING, INTEGER, DOUBLE, BOOLEAN, STRUCT)
}

@js.native
sealed trait PropertyNotificationState extends js.Any
object PropertyNotificationState {
  val ENABLED = "ENABLED".asInstanceOf[PropertyNotificationState]
  val DISABLED = "DISABLED".asInstanceOf[PropertyNotificationState]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait Quality extends js.Any
object Quality {
  val GOOD = "GOOD".asInstanceOf[Quality]
  val BAD = "BAD".asInstanceOf[Quality]
  val UNCERTAIN = "UNCERTAIN".asInstanceOf[Quality]

  @inline def values = js.Array(GOOD, BAD, UNCERTAIN)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val PORTAL = "PORTAL".asInstanceOf[ResourceType]
  val PROJECT = "PROJECT".asInstanceOf[ResourceType]

  @inline def values = js.Array(PORTAL, PROJECT)
}

@js.native
sealed trait TimeOrdering extends js.Any
object TimeOrdering {
  val ASCENDING = "ASCENDING".asInstanceOf[TimeOrdering]
  val DESCENDING = "DESCENDING".asInstanceOf[TimeOrdering]

  @inline def values = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait TraversalDirection extends js.Any
object TraversalDirection {
  val PARENT = "PARENT".asInstanceOf[TraversalDirection]
  val CHILD = "CHILD".asInstanceOf[TraversalDirection]

  @inline def values = js.Array(PARENT, CHILD)
}

@js.native
sealed trait TraversalType extends js.Any
object TraversalType {
  val PATH_TO_ROOT = "PATH_TO_ROOT".asInstanceOf[TraversalType]

  @inline def values = js.Array(PATH_TO_ROOT)
}

