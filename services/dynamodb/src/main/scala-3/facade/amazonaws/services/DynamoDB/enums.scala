package facade.amazonaws.services.dynamodb

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AttributeAction extends js.Any
object AttributeAction {
  val ADD = "ADD".asInstanceOf[AttributeAction]
  val PUT = "PUT".asInstanceOf[AttributeAction]
  val DELETE = "DELETE".asInstanceOf[AttributeAction]

  @inline def values = js.Array(ADD, PUT, DELETE)
}

@js.native
sealed trait BackupStatus extends js.Any
object BackupStatus {
  val CREATING = "CREATING".asInstanceOf[BackupStatus]
  val DELETED = "DELETED".asInstanceOf[BackupStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[BackupStatus]

  @inline def values = js.Array(CREATING, DELETED, AVAILABLE)
}

@js.native
sealed trait BackupType extends js.Any
object BackupType {
  val USER = "USER".asInstanceOf[BackupType]
  val SYSTEM = "SYSTEM".asInstanceOf[BackupType]
  val AWS_BACKUP = "AWS_BACKUP".asInstanceOf[BackupType]

  @inline def values = js.Array(USER, SYSTEM, AWS_BACKUP)
}

@js.native
sealed trait BackupTypeFilter extends js.Any
object BackupTypeFilter {
  val USER = "USER".asInstanceOf[BackupTypeFilter]
  val SYSTEM = "SYSTEM".asInstanceOf[BackupTypeFilter]
  val AWS_BACKUP = "AWS_BACKUP".asInstanceOf[BackupTypeFilter]
  val ALL = "ALL".asInstanceOf[BackupTypeFilter]

  @inline def values = js.Array(USER, SYSTEM, AWS_BACKUP, ALL)
}

@js.native
sealed trait BatchStatementErrorCodeEnum extends js.Any
object BatchStatementErrorCodeEnum {
  val ConditionalCheckFailed = "ConditionalCheckFailed".asInstanceOf[BatchStatementErrorCodeEnum]
  val ItemCollectionSizeLimitExceeded = "ItemCollectionSizeLimitExceeded".asInstanceOf[BatchStatementErrorCodeEnum]
  val RequestLimitExceeded = "RequestLimitExceeded".asInstanceOf[BatchStatementErrorCodeEnum]
  val ValidationError = "ValidationError".asInstanceOf[BatchStatementErrorCodeEnum]
  val ProvisionedThroughputExceeded = "ProvisionedThroughputExceeded".asInstanceOf[BatchStatementErrorCodeEnum]
  val TransactionConflict = "TransactionConflict".asInstanceOf[BatchStatementErrorCodeEnum]
  val ThrottlingError = "ThrottlingError".asInstanceOf[BatchStatementErrorCodeEnum]
  val InternalServerError = "InternalServerError".asInstanceOf[BatchStatementErrorCodeEnum]
  val ResourceNotFound = "ResourceNotFound".asInstanceOf[BatchStatementErrorCodeEnum]
  val AccessDenied = "AccessDenied".asInstanceOf[BatchStatementErrorCodeEnum]
  val DuplicateItem = "DuplicateItem".asInstanceOf[BatchStatementErrorCodeEnum]

  @inline def values = js.Array(
    ConditionalCheckFailed,
    ItemCollectionSizeLimitExceeded,
    RequestLimitExceeded,
    ValidationError,
    ProvisionedThroughputExceeded,
    TransactionConflict,
    ThrottlingError,
    InternalServerError,
    ResourceNotFound,
    AccessDenied,
    DuplicateItem
  )
}

@js.native
sealed trait BillingMode extends js.Any
object BillingMode {
  val PROVISIONED = "PROVISIONED".asInstanceOf[BillingMode]
  val PAY_PER_REQUEST = "PAY_PER_REQUEST".asInstanceOf[BillingMode]

  @inline def values = js.Array(PROVISIONED, PAY_PER_REQUEST)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val EQ = "EQ".asInstanceOf[ComparisonOperator]
  val NE = "NE".asInstanceOf[ComparisonOperator]
  val IN = "IN".asInstanceOf[ComparisonOperator]
  val LE = "LE".asInstanceOf[ComparisonOperator]
  val LT = "LT".asInstanceOf[ComparisonOperator]
  val GE = "GE".asInstanceOf[ComparisonOperator]
  val GT = "GT".asInstanceOf[ComparisonOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[ComparisonOperator]
  val NOT_NULL = "NOT_NULL".asInstanceOf[ComparisonOperator]
  val NULL = "NULL".asInstanceOf[ComparisonOperator]
  val CONTAINS = "CONTAINS".asInstanceOf[ComparisonOperator]
  val NOT_CONTAINS = "NOT_CONTAINS".asInstanceOf[ComparisonOperator]
  val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[ComparisonOperator]

  @inline def values = js.Array(EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH)
}

@js.native
sealed trait ConditionalOperator extends js.Any
object ConditionalOperator {
  val AND = "AND".asInstanceOf[ConditionalOperator]
  val OR = "OR".asInstanceOf[ConditionalOperator]

  @inline def values = js.Array(AND, OR)
}

@js.native
sealed trait ContinuousBackupsStatus extends js.Any
object ContinuousBackupsStatus {
  val ENABLED = "ENABLED".asInstanceOf[ContinuousBackupsStatus]
  val DISABLED = "DISABLED".asInstanceOf[ContinuousBackupsStatus]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait ContributorInsightsAction extends js.Any
object ContributorInsightsAction {
  val ENABLE = "ENABLE".asInstanceOf[ContributorInsightsAction]
  val DISABLE = "DISABLE".asInstanceOf[ContributorInsightsAction]

  @inline def values = js.Array(ENABLE, DISABLE)
}

@js.native
sealed trait ContributorInsightsStatus extends js.Any
object ContributorInsightsStatus {
  val ENABLING = "ENABLING".asInstanceOf[ContributorInsightsStatus]
  val ENABLED = "ENABLED".asInstanceOf[ContributorInsightsStatus]
  val DISABLING = "DISABLING".asInstanceOf[ContributorInsightsStatus]
  val DISABLED = "DISABLED".asInstanceOf[ContributorInsightsStatus]
  val FAILED = "FAILED".asInstanceOf[ContributorInsightsStatus]

  @inline def values = js.Array(ENABLING, ENABLED, DISABLING, DISABLED, FAILED)
}

@js.native
sealed trait DestinationStatus extends js.Any
object DestinationStatus {
  val ENABLING = "ENABLING".asInstanceOf[DestinationStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DestinationStatus]
  val DISABLING = "DISABLING".asInstanceOf[DestinationStatus]
  val DISABLED = "DISABLED".asInstanceOf[DestinationStatus]
  val ENABLE_FAILED = "ENABLE_FAILED".asInstanceOf[DestinationStatus]

  @inline def values = js.Array(ENABLING, ACTIVE, DISABLING, DISABLED, ENABLE_FAILED)
}

@js.native
sealed trait ExportFormat extends js.Any
object ExportFormat {
  val DYNAMODB_JSON = "DYNAMODB_JSON".asInstanceOf[ExportFormat]
  val ION = "ION".asInstanceOf[ExportFormat]

  @inline def values = js.Array(DYNAMODB_JSON, ION)
}

@js.native
sealed trait ExportStatus extends js.Any
object ExportStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExportStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ExportStatus]
  val FAILED = "FAILED".asInstanceOf[ExportStatus]

  @inline def values = js.Array(IN_PROGRESS, COMPLETED, FAILED)
}

@js.native
sealed trait GlobalTableStatus extends js.Any
object GlobalTableStatus {
  val CREATING = "CREATING".asInstanceOf[GlobalTableStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[GlobalTableStatus]
  val DELETING = "DELETING".asInstanceOf[GlobalTableStatus]
  val UPDATING = "UPDATING".asInstanceOf[GlobalTableStatus]

  @inline def values = js.Array(CREATING, ACTIVE, DELETING, UPDATING)
}

@js.native
sealed trait IndexStatus extends js.Any
object IndexStatus {
  val CREATING = "CREATING".asInstanceOf[IndexStatus]
  val UPDATING = "UPDATING".asInstanceOf[IndexStatus]
  val DELETING = "DELETING".asInstanceOf[IndexStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[IndexStatus]

  @inline def values = js.Array(CREATING, UPDATING, DELETING, ACTIVE)
}

@js.native
sealed trait KeyType extends js.Any
object KeyType {
  val HASH = "HASH".asInstanceOf[KeyType]
  val RANGE = "RANGE".asInstanceOf[KeyType]

  @inline def values = js.Array(HASH, RANGE)
}

@js.native
sealed trait PointInTimeRecoveryStatus extends js.Any
object PointInTimeRecoveryStatus {
  val ENABLED = "ENABLED".asInstanceOf[PointInTimeRecoveryStatus]
  val DISABLED = "DISABLED".asInstanceOf[PointInTimeRecoveryStatus]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait ProjectionType extends js.Any
object ProjectionType {
  val ALL = "ALL".asInstanceOf[ProjectionType]
  val KEYS_ONLY = "KEYS_ONLY".asInstanceOf[ProjectionType]
  val INCLUDE = "INCLUDE".asInstanceOf[ProjectionType]

  @inline def values = js.Array(ALL, KEYS_ONLY, INCLUDE)
}

@js.native
sealed trait ReplicaStatus extends js.Any
object ReplicaStatus {
  val CREATING = "CREATING".asInstanceOf[ReplicaStatus]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[ReplicaStatus]
  val UPDATING = "UPDATING".asInstanceOf[ReplicaStatus]
  val DELETING = "DELETING".asInstanceOf[ReplicaStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ReplicaStatus]
  val REGION_DISABLED = "REGION_DISABLED".asInstanceOf[ReplicaStatus]
  val INACCESSIBLE_ENCRYPTION_CREDENTIALS = "INACCESSIBLE_ENCRYPTION_CREDENTIALS".asInstanceOf[ReplicaStatus]

  @inline def values = js.Array(CREATING, CREATION_FAILED, UPDATING, DELETING, ACTIVE, REGION_DISABLED, INACCESSIBLE_ENCRYPTION_CREDENTIALS)
}

/** Determines the level of detail about provisioned throughput consumption that is returned in the response: * <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed. Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s). * <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation. * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.
  */
@js.native
sealed trait ReturnConsumedCapacity extends js.Any
object ReturnConsumedCapacity {
  val INDEXES = "INDEXES".asInstanceOf[ReturnConsumedCapacity]
  val TOTAL = "TOTAL".asInstanceOf[ReturnConsumedCapacity]
  val NONE = "NONE".asInstanceOf[ReturnConsumedCapacity]

  @inline def values = js.Array(INDEXES, TOTAL, NONE)
}

@js.native
sealed trait ReturnItemCollectionMetrics extends js.Any
object ReturnItemCollectionMetrics {
  val SIZE = "SIZE".asInstanceOf[ReturnItemCollectionMetrics]
  val NONE = "NONE".asInstanceOf[ReturnItemCollectionMetrics]

  @inline def values = js.Array(SIZE, NONE)
}

@js.native
sealed trait ReturnValue extends js.Any
object ReturnValue {
  val NONE = "NONE".asInstanceOf[ReturnValue]
  val ALL_OLD = "ALL_OLD".asInstanceOf[ReturnValue]
  val UPDATED_OLD = "UPDATED_OLD".asInstanceOf[ReturnValue]
  val ALL_NEW = "ALL_NEW".asInstanceOf[ReturnValue]
  val UPDATED_NEW = "UPDATED_NEW".asInstanceOf[ReturnValue]

  @inline def values = js.Array(NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW)
}

@js.native
sealed trait ReturnValuesOnConditionCheckFailure extends js.Any
object ReturnValuesOnConditionCheckFailure {
  val ALL_OLD = "ALL_OLD".asInstanceOf[ReturnValuesOnConditionCheckFailure]
  val NONE = "NONE".asInstanceOf[ReturnValuesOnConditionCheckFailure]

  @inline def values = js.Array(ALL_OLD, NONE)
}

@js.native
sealed trait S3SseAlgorithm extends js.Any
object S3SseAlgorithm {
  val AES256 = "AES256".asInstanceOf[S3SseAlgorithm]
  val KMS = "KMS".asInstanceOf[S3SseAlgorithm]

  @inline def values = js.Array(AES256, KMS)
}

@js.native
sealed trait SSEStatus extends js.Any
object SSEStatus {
  val ENABLING = "ENABLING".asInstanceOf[SSEStatus]
  val ENABLED = "ENABLED".asInstanceOf[SSEStatus]
  val DISABLING = "DISABLING".asInstanceOf[SSEStatus]
  val DISABLED = "DISABLED".asInstanceOf[SSEStatus]
  val UPDATING = "UPDATING".asInstanceOf[SSEStatus]

  @inline def values = js.Array(ENABLING, ENABLED, DISABLING, DISABLED, UPDATING)
}

@js.native
sealed trait SSEType extends js.Any
object SSEType {
  val AES256 = "AES256".asInstanceOf[SSEType]
  val KMS = "KMS".asInstanceOf[SSEType]

  @inline def values = js.Array(AES256, KMS)
}

@js.native
sealed trait ScalarAttributeType extends js.Any
object ScalarAttributeType {
  val S = "S".asInstanceOf[ScalarAttributeType]
  val N = "N".asInstanceOf[ScalarAttributeType]
  val B = "B".asInstanceOf[ScalarAttributeType]

  @inline def values = js.Array(S, N, B)
}

@js.native
sealed trait Select extends js.Any
object Select {
  val ALL_ATTRIBUTES = "ALL_ATTRIBUTES".asInstanceOf[Select]
  val ALL_PROJECTED_ATTRIBUTES = "ALL_PROJECTED_ATTRIBUTES".asInstanceOf[Select]
  val SPECIFIC_ATTRIBUTES = "SPECIFIC_ATTRIBUTES".asInstanceOf[Select]
  val COUNT = "COUNT".asInstanceOf[Select]

  @inline def values = js.Array(ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT)
}

@js.native
sealed trait StreamViewType extends js.Any
object StreamViewType {
  val NEW_IMAGE = "NEW_IMAGE".asInstanceOf[StreamViewType]
  val OLD_IMAGE = "OLD_IMAGE".asInstanceOf[StreamViewType]
  val NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES".asInstanceOf[StreamViewType]
  val KEYS_ONLY = "KEYS_ONLY".asInstanceOf[StreamViewType]

  @inline def values = js.Array(NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
}

@js.native
sealed trait TableStatus extends js.Any
object TableStatus {
  val CREATING = "CREATING".asInstanceOf[TableStatus]
  val UPDATING = "UPDATING".asInstanceOf[TableStatus]
  val DELETING = "DELETING".asInstanceOf[TableStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[TableStatus]
  val INACCESSIBLE_ENCRYPTION_CREDENTIALS = "INACCESSIBLE_ENCRYPTION_CREDENTIALS".asInstanceOf[TableStatus]
  val ARCHIVING = "ARCHIVING".asInstanceOf[TableStatus]
  val ARCHIVED = "ARCHIVED".asInstanceOf[TableStatus]

  @inline def values = js.Array(CREATING, UPDATING, DELETING, ACTIVE, INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED)
}

@js.native
sealed trait TimeToLiveStatus extends js.Any
object TimeToLiveStatus {
  val ENABLING = "ENABLING".asInstanceOf[TimeToLiveStatus]
  val DISABLING = "DISABLING".asInstanceOf[TimeToLiveStatus]
  val ENABLED = "ENABLED".asInstanceOf[TimeToLiveStatus]
  val DISABLED = "DISABLED".asInstanceOf[TimeToLiveStatus]

  @inline def values = js.Array(ENABLING, DISABLING, ENABLED, DISABLED)
}
