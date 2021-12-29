package facade.amazonaws.services.dynamodb

import scalajs._

type AttributeAction = "ADD" | "PUT" | "DELETE"
object AttributeAction {
  val ADD: "ADD" = "ADD"
  val PUT: "PUT" = "PUT"
  val DELETE: "DELETE" = "DELETE"

  @inline def values = js.Array[AttributeAction](ADD, PUT, DELETE)
}

type BackupStatus = "CREATING" | "DELETED" | "AVAILABLE"
object BackupStatus {
  val CREATING: "CREATING" = "CREATING"
  val DELETED: "DELETED" = "DELETED"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"

  @inline def values = js.Array[BackupStatus](CREATING, DELETED, AVAILABLE)
}

type BackupType = "USER" | "SYSTEM" | "AWS_BACKUP"
object BackupType {
  val USER: "USER" = "USER"
  val SYSTEM: "SYSTEM" = "SYSTEM"
  val AWS_BACKUP: "AWS_BACKUP" = "AWS_BACKUP"

  @inline def values = js.Array[BackupType](USER, SYSTEM, AWS_BACKUP)
}

type BackupTypeFilter = "USER" | "SYSTEM" | "AWS_BACKUP" | "ALL"
object BackupTypeFilter {
  val USER: "USER" = "USER"
  val SYSTEM: "SYSTEM" = "SYSTEM"
  val AWS_BACKUP: "AWS_BACKUP" = "AWS_BACKUP"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[BackupTypeFilter](USER, SYSTEM, AWS_BACKUP, ALL)
}

type BatchStatementErrorCodeEnum = "ConditionalCheckFailed" | "ItemCollectionSizeLimitExceeded" | "RequestLimitExceeded" | "ValidationError" | "ProvisionedThroughputExceeded" | "TransactionConflict" | "ThrottlingError" | "InternalServerError" | "ResourceNotFound" | "AccessDenied" | "DuplicateItem"
object BatchStatementErrorCodeEnum {
  val ConditionalCheckFailed: "ConditionalCheckFailed" = "ConditionalCheckFailed"
  val ItemCollectionSizeLimitExceeded: "ItemCollectionSizeLimitExceeded" = "ItemCollectionSizeLimitExceeded"
  val RequestLimitExceeded: "RequestLimitExceeded" = "RequestLimitExceeded"
  val ValidationError: "ValidationError" = "ValidationError"
  val ProvisionedThroughputExceeded: "ProvisionedThroughputExceeded" = "ProvisionedThroughputExceeded"
  val TransactionConflict: "TransactionConflict" = "TransactionConflict"
  val ThrottlingError: "ThrottlingError" = "ThrottlingError"
  val InternalServerError: "InternalServerError" = "InternalServerError"
  val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  val AccessDenied: "AccessDenied" = "AccessDenied"
  val DuplicateItem: "DuplicateItem" = "DuplicateItem"

  @inline def values = js.Array[BatchStatementErrorCodeEnum](
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

type BillingMode = "PROVISIONED" | "PAY_PER_REQUEST"
object BillingMode {
  val PROVISIONED: "PROVISIONED" = "PROVISIONED"
  val PAY_PER_REQUEST: "PAY_PER_REQUEST" = "PAY_PER_REQUEST"

  @inline def values = js.Array[BillingMode](PROVISIONED, PAY_PER_REQUEST)
}

type ComparisonOperator = "EQ" | "NE" | "IN" | "LE" | "LT" | "GE" | "GT" | "BETWEEN" | "NOT_NULL" | "NULL" | "CONTAINS" | "NOT_CONTAINS" | "BEGINS_WITH"
object ComparisonOperator {
  val EQ: "EQ" = "EQ"
  val NE: "NE" = "NE"
  val IN: "IN" = "IN"
  val LE: "LE" = "LE"
  val LT: "LT" = "LT"
  val GE: "GE" = "GE"
  val GT: "GT" = "GT"
  val BETWEEN: "BETWEEN" = "BETWEEN"
  val NOT_NULL: "NOT_NULL" = "NOT_NULL"
  val NULL: "NULL" = "NULL"
  val CONTAINS: "CONTAINS" = "CONTAINS"
  val NOT_CONTAINS: "NOT_CONTAINS" = "NOT_CONTAINS"
  val BEGINS_WITH: "BEGINS_WITH" = "BEGINS_WITH"

  @inline def values = js.Array[ComparisonOperator](EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH)
}

type ConditionalOperator = "AND" | "OR"
object ConditionalOperator {
  val AND: "AND" = "AND"
  val OR: "OR" = "OR"

  @inline def values = js.Array[ConditionalOperator](AND, OR)
}

type ContinuousBackupsStatus = "ENABLED" | "DISABLED"
object ContinuousBackupsStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ContinuousBackupsStatus](ENABLED, DISABLED)
}

type ContributorInsightsAction = "ENABLE" | "DISABLE"
object ContributorInsightsAction {
  val ENABLE: "ENABLE" = "ENABLE"
  val DISABLE: "DISABLE" = "DISABLE"

  @inline def values = js.Array[ContributorInsightsAction](ENABLE, DISABLE)
}

type ContributorInsightsStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | "FAILED"
object ContributorInsightsStatus {
  val ENABLING: "ENABLING" = "ENABLING"
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLING: "DISABLING" = "DISABLING"
  val DISABLED: "DISABLED" = "DISABLED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ContributorInsightsStatus](ENABLING, ENABLED, DISABLING, DISABLED, FAILED)
}

type DestinationStatus = "ENABLING" | "ACTIVE" | "DISABLING" | "DISABLED" | "ENABLE_FAILED"
object DestinationStatus {
  val ENABLING: "ENABLING" = "ENABLING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DISABLING: "DISABLING" = "DISABLING"
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLE_FAILED: "ENABLE_FAILED" = "ENABLE_FAILED"

  @inline def values = js.Array[DestinationStatus](ENABLING, ACTIVE, DISABLING, DISABLED, ENABLE_FAILED)
}

type ExportFormat = "DYNAMODB_JSON" | "ION"
object ExportFormat {
  val DYNAMODB_JSON: "DYNAMODB_JSON" = "DYNAMODB_JSON"
  val ION: "ION" = "ION"

  @inline def values = js.Array[ExportFormat](DYNAMODB_JSON, ION)
}

type ExportStatus = "IN_PROGRESS" | "COMPLETED" | "FAILED"
object ExportStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ExportStatus](IN_PROGRESS, COMPLETED, FAILED)
}

type GlobalTableStatus = "CREATING" | "ACTIVE" | "DELETING" | "UPDATING"
object GlobalTableStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[GlobalTableStatus](CREATING, ACTIVE, DELETING, UPDATING)
}

type IndexStatus = "CREATING" | "UPDATING" | "DELETING" | "ACTIVE"
object IndexStatus {
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val ACTIVE: "ACTIVE" = "ACTIVE"

  @inline def values = js.Array[IndexStatus](CREATING, UPDATING, DELETING, ACTIVE)
}

type KeyType = "HASH" | "RANGE"
object KeyType {
  val HASH: "HASH" = "HASH"
  val RANGE: "RANGE" = "RANGE"

  @inline def values = js.Array[KeyType](HASH, RANGE)
}

type PointInTimeRecoveryStatus = "ENABLED" | "DISABLED"
object PointInTimeRecoveryStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[PointInTimeRecoveryStatus](ENABLED, DISABLED)
}

type ProjectionType = "ALL" | "KEYS_ONLY" | "INCLUDE"
object ProjectionType {
  val ALL: "ALL" = "ALL"
  val KEYS_ONLY: "KEYS_ONLY" = "KEYS_ONLY"
  val INCLUDE: "INCLUDE" = "INCLUDE"

  @inline def values = js.Array[ProjectionType](ALL, KEYS_ONLY, INCLUDE)
}

type ReplicaStatus = "CREATING" | "CREATION_FAILED" | "UPDATING" | "DELETING" | "ACTIVE" | "REGION_DISABLED" | "INACCESSIBLE_ENCRYPTION_CREDENTIALS"
object ReplicaStatus {
  val CREATING: "CREATING" = "CREATING"
  val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val REGION_DISABLED: "REGION_DISABLED" = "REGION_DISABLED"
  val INACCESSIBLE_ENCRYPTION_CREDENTIALS: "INACCESSIBLE_ENCRYPTION_CREDENTIALS" = "INACCESSIBLE_ENCRYPTION_CREDENTIALS"

  @inline def values = js.Array[ReplicaStatus](CREATING, CREATION_FAILED, UPDATING, DELETING, ACTIVE, REGION_DISABLED, INACCESSIBLE_ENCRYPTION_CREDENTIALS)
}

/** Determines the level of detail about provisioned throughput consumption that is returned in the response: * <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed. Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s). * <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation. * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.
  */
type ReturnConsumedCapacity = "INDEXES" | "TOTAL" | "NONE"
object ReturnConsumedCapacity {
  val INDEXES: "INDEXES" = "INDEXES"
  val TOTAL: "TOTAL" = "TOTAL"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[ReturnConsumedCapacity](INDEXES, TOTAL, NONE)
}

type ReturnItemCollectionMetrics = "SIZE" | "NONE"
object ReturnItemCollectionMetrics {
  val SIZE: "SIZE" = "SIZE"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[ReturnItemCollectionMetrics](SIZE, NONE)
}

type ReturnValue = "NONE" | "ALL_OLD" | "UPDATED_OLD" | "ALL_NEW" | "UPDATED_NEW"
object ReturnValue {
  val NONE: "NONE" = "NONE"
  val ALL_OLD: "ALL_OLD" = "ALL_OLD"
  val UPDATED_OLD: "UPDATED_OLD" = "UPDATED_OLD"
  val ALL_NEW: "ALL_NEW" = "ALL_NEW"
  val UPDATED_NEW: "UPDATED_NEW" = "UPDATED_NEW"

  @inline def values = js.Array[ReturnValue](NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW)
}

type ReturnValuesOnConditionCheckFailure = "ALL_OLD" | "NONE"
object ReturnValuesOnConditionCheckFailure {
  val ALL_OLD: "ALL_OLD" = "ALL_OLD"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[ReturnValuesOnConditionCheckFailure](ALL_OLD, NONE)
}

type S3SseAlgorithm = "AES256" | "KMS"
object S3SseAlgorithm {
  val AES256: "AES256" = "AES256"
  val KMS: "KMS" = "KMS"

  @inline def values = js.Array[S3SseAlgorithm](AES256, KMS)
}

type SSEStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | "UPDATING"
object SSEStatus {
  val ENABLING: "ENABLING" = "ENABLING"
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLING: "DISABLING" = "DISABLING"
  val DISABLED: "DISABLED" = "DISABLED"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[SSEStatus](ENABLING, ENABLED, DISABLING, DISABLED, UPDATING)
}

type SSEType = "AES256" | "KMS"
object SSEType {
  val AES256: "AES256" = "AES256"
  val KMS: "KMS" = "KMS"

  @inline def values = js.Array[SSEType](AES256, KMS)
}

type ScalarAttributeType = "S" | "N" | "B"
object ScalarAttributeType {
  val S: "S" = "S"
  val N: "N" = "N"
  val B: "B" = "B"

  @inline def values = js.Array[ScalarAttributeType](S, N, B)
}

type Select = "ALL_ATTRIBUTES" | "ALL_PROJECTED_ATTRIBUTES" | "SPECIFIC_ATTRIBUTES" | "COUNT"
object Select {
  val ALL_ATTRIBUTES: "ALL_ATTRIBUTES" = "ALL_ATTRIBUTES"
  val ALL_PROJECTED_ATTRIBUTES: "ALL_PROJECTED_ATTRIBUTES" = "ALL_PROJECTED_ATTRIBUTES"
  val SPECIFIC_ATTRIBUTES: "SPECIFIC_ATTRIBUTES" = "SPECIFIC_ATTRIBUTES"
  val COUNT: "COUNT" = "COUNT"

  @inline def values = js.Array[Select](ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT)
}

type StreamViewType = "NEW_IMAGE" | "OLD_IMAGE" | "NEW_AND_OLD_IMAGES" | "KEYS_ONLY"
object StreamViewType {
  val NEW_IMAGE: "NEW_IMAGE" = "NEW_IMAGE"
  val OLD_IMAGE: "OLD_IMAGE" = "OLD_IMAGE"
  val NEW_AND_OLD_IMAGES: "NEW_AND_OLD_IMAGES" = "NEW_AND_OLD_IMAGES"
  val KEYS_ONLY: "KEYS_ONLY" = "KEYS_ONLY"

  @inline def values = js.Array[StreamViewType](NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
}

type TableStatus = "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | "INACCESSIBLE_ENCRYPTION_CREDENTIALS" | "ARCHIVING" | "ARCHIVED"
object TableStatus {
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACCESSIBLE_ENCRYPTION_CREDENTIALS: "INACCESSIBLE_ENCRYPTION_CREDENTIALS" = "INACCESSIBLE_ENCRYPTION_CREDENTIALS"
  val ARCHIVING: "ARCHIVING" = "ARCHIVING"
  val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  @inline def values = js.Array[TableStatus](CREATING, UPDATING, DELETING, ACTIVE, INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED)
}

type TimeToLiveStatus = "ENABLING" | "DISABLING" | "ENABLED" | "DISABLED"
object TimeToLiveStatus {
  val ENABLING: "ENABLING" = "ENABLING"
  val DISABLING: "DISABLING" = "DISABLING"
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[TimeToLiveStatus](ENABLING, DISABLING, ENABLED, DISABLED)
}
