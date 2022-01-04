package facade.amazonaws.services.dynamodb

import scalajs.js

type AttributeAction = "ADD" | "PUT" | "DELETE"
object AttributeAction {
  inline val ADD: "ADD" = "ADD"
  inline val PUT: "PUT" = "PUT"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[AttributeAction] = js.Array(ADD, PUT, DELETE)
}

type BackupStatus = "CREATING" | "DELETED" | "AVAILABLE"
object BackupStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"

  inline def values: js.Array[BackupStatus] = js.Array(CREATING, DELETED, AVAILABLE)
}

type BackupType = "USER" | "SYSTEM" | "AWS_BACKUP"
object BackupType {
  inline val USER: "USER" = "USER"
  inline val SYSTEM: "SYSTEM" = "SYSTEM"
  inline val AWS_BACKUP: "AWS_BACKUP" = "AWS_BACKUP"

  inline def values: js.Array[BackupType] = js.Array(USER, SYSTEM, AWS_BACKUP)
}

type BackupTypeFilter = "USER" | "SYSTEM" | "AWS_BACKUP" | "ALL"
object BackupTypeFilter {
  inline val USER: "USER" = "USER"
  inline val SYSTEM: "SYSTEM" = "SYSTEM"
  inline val AWS_BACKUP: "AWS_BACKUP" = "AWS_BACKUP"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[BackupTypeFilter] = js.Array(USER, SYSTEM, AWS_BACKUP, ALL)
}

type BatchStatementErrorCodeEnum = "ConditionalCheckFailed" | "ItemCollectionSizeLimitExceeded" | "RequestLimitExceeded" | "ValidationError" | "ProvisionedThroughputExceeded" | "TransactionConflict" | "ThrottlingError" | "InternalServerError" | "ResourceNotFound" | "AccessDenied" | "DuplicateItem"
object BatchStatementErrorCodeEnum {
  inline val ConditionalCheckFailed: "ConditionalCheckFailed" = "ConditionalCheckFailed"
  inline val ItemCollectionSizeLimitExceeded: "ItemCollectionSizeLimitExceeded" = "ItemCollectionSizeLimitExceeded"
  inline val RequestLimitExceeded: "RequestLimitExceeded" = "RequestLimitExceeded"
  inline val ValidationError: "ValidationError" = "ValidationError"
  inline val ProvisionedThroughputExceeded: "ProvisionedThroughputExceeded" = "ProvisionedThroughputExceeded"
  inline val TransactionConflict: "TransactionConflict" = "TransactionConflict"
  inline val ThrottlingError: "ThrottlingError" = "ThrottlingError"
  inline val InternalServerError: "InternalServerError" = "InternalServerError"
  inline val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val DuplicateItem: "DuplicateItem" = "DuplicateItem"

  inline def values: js.Array[BatchStatementErrorCodeEnum] = js.Array(
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
  inline val PROVISIONED: "PROVISIONED" = "PROVISIONED"
  inline val PAY_PER_REQUEST: "PAY_PER_REQUEST" = "PAY_PER_REQUEST"

  inline def values: js.Array[BillingMode] = js.Array(PROVISIONED, PAY_PER_REQUEST)
}

type ComparisonOperator = "EQ" | "NE" | "IN" | "LE" | "LT" | "GE" | "GT" | "BETWEEN" | "NOT_NULL" | "NULL" | "CONTAINS" | "NOT_CONTAINS" | "BEGINS_WITH"
object ComparisonOperator {
  inline val EQ: "EQ" = "EQ"
  inline val NE: "NE" = "NE"
  inline val IN: "IN" = "IN"
  inline val LE: "LE" = "LE"
  inline val LT: "LT" = "LT"
  inline val GE: "GE" = "GE"
  inline val GT: "GT" = "GT"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val NOT_NULL: "NOT_NULL" = "NOT_NULL"
  inline val NULL: "NULL" = "NULL"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val NOT_CONTAINS: "NOT_CONTAINS" = "NOT_CONTAINS"
  inline val BEGINS_WITH: "BEGINS_WITH" = "BEGINS_WITH"

  inline def values: js.Array[ComparisonOperator] = js.Array(EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH)
}

type ConditionalOperator = "AND" | "OR"
object ConditionalOperator {
  inline val AND: "AND" = "AND"
  inline val OR: "OR" = "OR"

  inline def values: js.Array[ConditionalOperator] = js.Array(AND, OR)
}

type ContinuousBackupsStatus = "ENABLED" | "DISABLED"
object ContinuousBackupsStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ContinuousBackupsStatus] = js.Array(ENABLED, DISABLED)
}

type ContributorInsightsAction = "ENABLE" | "DISABLE"
object ContributorInsightsAction {
  inline val ENABLE: "ENABLE" = "ENABLE"
  inline val DISABLE: "DISABLE" = "DISABLE"

  inline def values: js.Array[ContributorInsightsAction] = js.Array(ENABLE, DISABLE)
}

type ContributorInsightsStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | "FAILED"
object ContributorInsightsStatus {
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ContributorInsightsStatus] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED, FAILED)
}

type DestinationStatus = "ENABLING" | "ACTIVE" | "DISABLING" | "DISABLED" | "ENABLE_FAILED"
object DestinationStatus {
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLE_FAILED: "ENABLE_FAILED" = "ENABLE_FAILED"

  inline def values: js.Array[DestinationStatus] = js.Array(ENABLING, ACTIVE, DISABLING, DISABLED, ENABLE_FAILED)
}

type ExportFormat = "DYNAMODB_JSON" | "ION"
object ExportFormat {
  inline val DYNAMODB_JSON: "DYNAMODB_JSON" = "DYNAMODB_JSON"
  inline val ION: "ION" = "ION"

  inline def values: js.Array[ExportFormat] = js.Array(DYNAMODB_JSON, ION)
}

type ExportStatus = "IN_PROGRESS" | "COMPLETED" | "FAILED"
object ExportStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ExportStatus] = js.Array(IN_PROGRESS, COMPLETED, FAILED)
}

type GlobalTableStatus = "CREATING" | "ACTIVE" | "DELETING" | "UPDATING"
object GlobalTableStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[GlobalTableStatus] = js.Array(CREATING, ACTIVE, DELETING, UPDATING)
}

type IndexStatus = "CREATING" | "UPDATING" | "DELETING" | "ACTIVE"
object IndexStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[IndexStatus] = js.Array(CREATING, UPDATING, DELETING, ACTIVE)
}

type KeyType = "HASH" | "RANGE"
object KeyType {
  inline val HASH: "HASH" = "HASH"
  inline val RANGE: "RANGE" = "RANGE"

  inline def values: js.Array[KeyType] = js.Array(HASH, RANGE)
}

type PointInTimeRecoveryStatus = "ENABLED" | "DISABLED"
object PointInTimeRecoveryStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[PointInTimeRecoveryStatus] = js.Array(ENABLED, DISABLED)
}

type ProjectionType = "ALL" | "KEYS_ONLY" | "INCLUDE"
object ProjectionType {
  inline val ALL: "ALL" = "ALL"
  inline val KEYS_ONLY: "KEYS_ONLY" = "KEYS_ONLY"
  inline val INCLUDE: "INCLUDE" = "INCLUDE"

  inline def values: js.Array[ProjectionType] = js.Array(ALL, KEYS_ONLY, INCLUDE)
}

type ReplicaStatus = "CREATING" | "CREATION_FAILED" | "UPDATING" | "DELETING" | "ACTIVE" | "REGION_DISABLED" | "INACCESSIBLE_ENCRYPTION_CREDENTIALS"
object ReplicaStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val REGION_DISABLED: "REGION_DISABLED" = "REGION_DISABLED"
  inline val INACCESSIBLE_ENCRYPTION_CREDENTIALS: "INACCESSIBLE_ENCRYPTION_CREDENTIALS" = "INACCESSIBLE_ENCRYPTION_CREDENTIALS"

  inline def values: js.Array[ReplicaStatus] = js.Array(CREATING, CREATION_FAILED, UPDATING, DELETING, ACTIVE, REGION_DISABLED, INACCESSIBLE_ENCRYPTION_CREDENTIALS)
}

/** Determines the level of detail about either provisioned or on-demand throughput consumption that is returned in the response: * <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed. Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s). * <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation. * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.
  */
type ReturnConsumedCapacity = "INDEXES" | "TOTAL" | "NONE"
object ReturnConsumedCapacity {
  inline val INDEXES: "INDEXES" = "INDEXES"
  inline val TOTAL: "TOTAL" = "TOTAL"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ReturnConsumedCapacity] = js.Array(INDEXES, TOTAL, NONE)
}

type ReturnItemCollectionMetrics = "SIZE" | "NONE"
object ReturnItemCollectionMetrics {
  inline val SIZE: "SIZE" = "SIZE"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ReturnItemCollectionMetrics] = js.Array(SIZE, NONE)
}

type ReturnValue = "NONE" | "ALL_OLD" | "UPDATED_OLD" | "ALL_NEW" | "UPDATED_NEW"
object ReturnValue {
  inline val NONE: "NONE" = "NONE"
  inline val ALL_OLD: "ALL_OLD" = "ALL_OLD"
  inline val UPDATED_OLD: "UPDATED_OLD" = "UPDATED_OLD"
  inline val ALL_NEW: "ALL_NEW" = "ALL_NEW"
  inline val UPDATED_NEW: "UPDATED_NEW" = "UPDATED_NEW"

  inline def values: js.Array[ReturnValue] = js.Array(NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW)
}

type ReturnValuesOnConditionCheckFailure = "ALL_OLD" | "NONE"
object ReturnValuesOnConditionCheckFailure {
  inline val ALL_OLD: "ALL_OLD" = "ALL_OLD"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ReturnValuesOnConditionCheckFailure] = js.Array(ALL_OLD, NONE)
}

type S3SseAlgorithm = "AES256" | "KMS"
object S3SseAlgorithm {
  inline val AES256: "AES256" = "AES256"
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[S3SseAlgorithm] = js.Array(AES256, KMS)
}

type SSEStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | "UPDATING"
object SSEStatus {
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[SSEStatus] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED, UPDATING)
}

type SSEType = "AES256" | "KMS"
object SSEType {
  inline val AES256: "AES256" = "AES256"
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[SSEType] = js.Array(AES256, KMS)
}

type ScalarAttributeType = "S" | "N" | "B"
object ScalarAttributeType {
  inline val S: "S" = "S"
  inline val N: "N" = "N"
  inline val B: "B" = "B"

  inline def values: js.Array[ScalarAttributeType] = js.Array(S, N, B)
}

type Select = "ALL_ATTRIBUTES" | "ALL_PROJECTED_ATTRIBUTES" | "SPECIFIC_ATTRIBUTES" | "COUNT"
object Select {
  inline val ALL_ATTRIBUTES: "ALL_ATTRIBUTES" = "ALL_ATTRIBUTES"
  inline val ALL_PROJECTED_ATTRIBUTES: "ALL_PROJECTED_ATTRIBUTES" = "ALL_PROJECTED_ATTRIBUTES"
  inline val SPECIFIC_ATTRIBUTES: "SPECIFIC_ATTRIBUTES" = "SPECIFIC_ATTRIBUTES"
  inline val COUNT: "COUNT" = "COUNT"

  inline def values: js.Array[Select] = js.Array(ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT)
}

type StreamViewType = "NEW_IMAGE" | "OLD_IMAGE" | "NEW_AND_OLD_IMAGES" | "KEYS_ONLY"
object StreamViewType {
  inline val NEW_IMAGE: "NEW_IMAGE" = "NEW_IMAGE"
  inline val OLD_IMAGE: "OLD_IMAGE" = "OLD_IMAGE"
  inline val NEW_AND_OLD_IMAGES: "NEW_AND_OLD_IMAGES" = "NEW_AND_OLD_IMAGES"
  inline val KEYS_ONLY: "KEYS_ONLY" = "KEYS_ONLY"

  inline def values: js.Array[StreamViewType] = js.Array(NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY)
}

type TableClass = "STANDARD" | "STANDARD_INFREQUENT_ACCESS"
object TableClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val STANDARD_INFREQUENT_ACCESS: "STANDARD_INFREQUENT_ACCESS" = "STANDARD_INFREQUENT_ACCESS"

  inline def values: js.Array[TableClass] = js.Array(STANDARD, STANDARD_INFREQUENT_ACCESS)
}

type TableStatus = "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | "INACCESSIBLE_ENCRYPTION_CREDENTIALS" | "ARCHIVING" | "ARCHIVED"
object TableStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACCESSIBLE_ENCRYPTION_CREDENTIALS: "INACCESSIBLE_ENCRYPTION_CREDENTIALS" = "INACCESSIBLE_ENCRYPTION_CREDENTIALS"
  inline val ARCHIVING: "ARCHIVING" = "ARCHIVING"
  inline val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  inline def values: js.Array[TableStatus] = js.Array(CREATING, UPDATING, DELETING, ACTIVE, INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED)
}

type TimeToLiveStatus = "ENABLING" | "DISABLING" | "ENABLED" | "DISABLED"
object TimeToLiveStatus {
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[TimeToLiveStatus] = js.Array(ENABLING, DISABLING, ENABLED, DISABLED)
}
