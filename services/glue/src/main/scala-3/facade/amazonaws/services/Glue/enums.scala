package facade.amazonaws.services.glue

import scalajs.js

type BackfillErrorCode = "ENCRYPTED_PARTITION_ERROR" | "INTERNAL_ERROR" | "INVALID_PARTITION_TYPE_DATA_ERROR" | "MISSING_PARTITION_VALUE_ERROR" | "UNSUPPORTED_PARTITION_CHARACTER_ERROR"
object BackfillErrorCode {
  inline val ENCRYPTED_PARTITION_ERROR: "ENCRYPTED_PARTITION_ERROR" = "ENCRYPTED_PARTITION_ERROR"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val INVALID_PARTITION_TYPE_DATA_ERROR: "INVALID_PARTITION_TYPE_DATA_ERROR" = "INVALID_PARTITION_TYPE_DATA_ERROR"
  inline val MISSING_PARTITION_VALUE_ERROR: "MISSING_PARTITION_VALUE_ERROR" = "MISSING_PARTITION_VALUE_ERROR"
  inline val UNSUPPORTED_PARTITION_CHARACTER_ERROR: "UNSUPPORTED_PARTITION_CHARACTER_ERROR" = "UNSUPPORTED_PARTITION_CHARACTER_ERROR"

  inline def values: js.Array[BackfillErrorCode] = js.Array(ENCRYPTED_PARTITION_ERROR, INTERNAL_ERROR, INVALID_PARTITION_TYPE_DATA_ERROR, MISSING_PARTITION_VALUE_ERROR, UNSUPPORTED_PARTITION_CHARACTER_ERROR)
}

type CatalogEncryptionMode = "DISABLED" | "SSE-KMS"
object CatalogEncryptionMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"

  inline def values: js.Array[CatalogEncryptionMode] = js.Array(DISABLED, `SSE-KMS`)
}

type CloudWatchEncryptionMode = "DISABLED" | "SSE-KMS"
object CloudWatchEncryptionMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"

  inline def values: js.Array[CloudWatchEncryptionMode] = js.Array(DISABLED, `SSE-KMS`)
}

type ColumnStatisticsType = "BOOLEAN" | "DATE" | "DECIMAL" | "DOUBLE" | "LONG" | "STRING" | "BINARY"
object ColumnStatisticsType {
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val DATE: "DATE" = "DATE"
  inline val DECIMAL: "DECIMAL" = "DECIMAL"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val LONG: "LONG" = "LONG"
  inline val STRING: "STRING" = "STRING"
  inline val BINARY: "BINARY" = "BINARY"

  inline def values: js.Array[ColumnStatisticsType] = js.Array(BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING, BINARY)
}

type Comparator = "EQUALS" | "GREATER_THAN" | "LESS_THAN" | "GREATER_THAN_EQUALS" | "LESS_THAN_EQUALS"
object Comparator {
  inline val EQUALS: "EQUALS" = "EQUALS"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN_EQUALS: "GREATER_THAN_EQUALS" = "GREATER_THAN_EQUALS"
  inline val LESS_THAN_EQUALS: "LESS_THAN_EQUALS" = "LESS_THAN_EQUALS"

  inline def values: js.Array[Comparator] = js.Array(EQUALS, GREATER_THAN, LESS_THAN, GREATER_THAN_EQUALS, LESS_THAN_EQUALS)
}

type Compatibility = "NONE" | "DISABLED" | "BACKWARD" | "BACKWARD_ALL" | "FORWARD" | "FORWARD_ALL" | "FULL" | "FULL_ALL"
object Compatibility {
  inline val NONE: "NONE" = "NONE"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val BACKWARD: "BACKWARD" = "BACKWARD"
  inline val BACKWARD_ALL: "BACKWARD_ALL" = "BACKWARD_ALL"
  inline val FORWARD: "FORWARD" = "FORWARD"
  inline val FORWARD_ALL: "FORWARD_ALL" = "FORWARD_ALL"
  inline val FULL: "FULL" = "FULL"
  inline val FULL_ALL: "FULL_ALL" = "FULL_ALL"

  inline def values: js.Array[Compatibility] = js.Array(NONE, DISABLED, BACKWARD, BACKWARD_ALL, FORWARD, FORWARD_ALL, FULL, FULL_ALL)
}

type ConnectionPropertyKey = "HOST" | "PORT" | "USERNAME" | "PASSWORD" | "ENCRYPTED_PASSWORD" | "JDBC_DRIVER_JAR_URI" | "JDBC_DRIVER_CLASS_NAME" | "JDBC_ENGINE" | "JDBC_ENGINE_VERSION" | "CONFIG_FILES" | "INSTANCE_ID" | "JDBC_CONNECTION_URL" | "JDBC_ENFORCE_SSL" | "CUSTOM_JDBC_CERT" | "SKIP_CUSTOM_JDBC_CERT_VALIDATION" | "CUSTOM_JDBC_CERT_STRING" | "CONNECTION_URL" | "KAFKA_BOOTSTRAP_SERVERS" | "KAFKA_SSL_ENABLED" | "KAFKA_CUSTOM_CERT" | "KAFKA_SKIP_CUSTOM_CERT_VALIDATION" | "SECRET_ID" | "CONNECTOR_URL" | "CONNECTOR_TYPE" | "CONNECTOR_CLASS_NAME"
object ConnectionPropertyKey {
  inline val HOST: "HOST" = "HOST"
  inline val PORT: "PORT" = "PORT"
  inline val USERNAME: "USERNAME" = "USERNAME"
  inline val PASSWORD: "PASSWORD" = "PASSWORD"
  inline val ENCRYPTED_PASSWORD: "ENCRYPTED_PASSWORD" = "ENCRYPTED_PASSWORD"
  inline val JDBC_DRIVER_JAR_URI: "JDBC_DRIVER_JAR_URI" = "JDBC_DRIVER_JAR_URI"
  inline val JDBC_DRIVER_CLASS_NAME: "JDBC_DRIVER_CLASS_NAME" = "JDBC_DRIVER_CLASS_NAME"
  inline val JDBC_ENGINE: "JDBC_ENGINE" = "JDBC_ENGINE"
  inline val JDBC_ENGINE_VERSION: "JDBC_ENGINE_VERSION" = "JDBC_ENGINE_VERSION"
  inline val CONFIG_FILES: "CONFIG_FILES" = "CONFIG_FILES"
  inline val INSTANCE_ID: "INSTANCE_ID" = "INSTANCE_ID"
  inline val JDBC_CONNECTION_URL: "JDBC_CONNECTION_URL" = "JDBC_CONNECTION_URL"
  inline val JDBC_ENFORCE_SSL: "JDBC_ENFORCE_SSL" = "JDBC_ENFORCE_SSL"
  inline val CUSTOM_JDBC_CERT: "CUSTOM_JDBC_CERT" = "CUSTOM_JDBC_CERT"
  inline val SKIP_CUSTOM_JDBC_CERT_VALIDATION: "SKIP_CUSTOM_JDBC_CERT_VALIDATION" = "SKIP_CUSTOM_JDBC_CERT_VALIDATION"
  inline val CUSTOM_JDBC_CERT_STRING: "CUSTOM_JDBC_CERT_STRING" = "CUSTOM_JDBC_CERT_STRING"
  inline val CONNECTION_URL: "CONNECTION_URL" = "CONNECTION_URL"
  inline val KAFKA_BOOTSTRAP_SERVERS: "KAFKA_BOOTSTRAP_SERVERS" = "KAFKA_BOOTSTRAP_SERVERS"
  inline val KAFKA_SSL_ENABLED: "KAFKA_SSL_ENABLED" = "KAFKA_SSL_ENABLED"
  inline val KAFKA_CUSTOM_CERT: "KAFKA_CUSTOM_CERT" = "KAFKA_CUSTOM_CERT"
  inline val KAFKA_SKIP_CUSTOM_CERT_VALIDATION: "KAFKA_SKIP_CUSTOM_CERT_VALIDATION" = "KAFKA_SKIP_CUSTOM_CERT_VALIDATION"
  inline val SECRET_ID: "SECRET_ID" = "SECRET_ID"
  inline val CONNECTOR_URL: "CONNECTOR_URL" = "CONNECTOR_URL"
  inline val CONNECTOR_TYPE: "CONNECTOR_TYPE" = "CONNECTOR_TYPE"
  inline val CONNECTOR_CLASS_NAME: "CONNECTOR_CLASS_NAME" = "CONNECTOR_CLASS_NAME"

  inline def values: js.Array[ConnectionPropertyKey] = js.Array(
    HOST,
    PORT,
    USERNAME,
    PASSWORD,
    ENCRYPTED_PASSWORD,
    JDBC_DRIVER_JAR_URI,
    JDBC_DRIVER_CLASS_NAME,
    JDBC_ENGINE,
    JDBC_ENGINE_VERSION,
    CONFIG_FILES,
    INSTANCE_ID,
    JDBC_CONNECTION_URL,
    JDBC_ENFORCE_SSL,
    CUSTOM_JDBC_CERT,
    SKIP_CUSTOM_JDBC_CERT_VALIDATION,
    CUSTOM_JDBC_CERT_STRING,
    CONNECTION_URL,
    KAFKA_BOOTSTRAP_SERVERS,
    KAFKA_SSL_ENABLED,
    KAFKA_CUSTOM_CERT,
    KAFKA_SKIP_CUSTOM_CERT_VALIDATION,
    SECRET_ID,
    CONNECTOR_URL,
    CONNECTOR_TYPE,
    CONNECTOR_CLASS_NAME
  )
}

type ConnectionType = "JDBC" | "SFTP" | "MONGODB" | "KAFKA" | "NETWORK" | "MARKETPLACE" | "CUSTOM"
object ConnectionType {
  inline val JDBC: "JDBC" = "JDBC"
  inline val SFTP: "SFTP" = "SFTP"
  inline val MONGODB: "MONGODB" = "MONGODB"
  inline val KAFKA: "KAFKA" = "KAFKA"
  inline val NETWORK: "NETWORK" = "NETWORK"
  inline val MARKETPLACE: "MARKETPLACE" = "MARKETPLACE"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[ConnectionType] = js.Array(JDBC, SFTP, MONGODB, KAFKA, NETWORK, MARKETPLACE, CUSTOM)
}

type CrawlState = "RUNNING" | "CANCELLING" | "CANCELLED" | "SUCCEEDED" | "FAILED"
object CrawlState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CrawlState] = js.Array(RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED)
}

type CrawlerLineageSettings = "ENABLE" | "DISABLE"
object CrawlerLineageSettings {
  inline val ENABLE: "ENABLE" = "ENABLE"
  inline val DISABLE: "DISABLE" = "DISABLE"

  inline def values: js.Array[CrawlerLineageSettings] = js.Array(ENABLE, DISABLE)
}

type CrawlerState = "READY" | "RUNNING" | "STOPPING"
object CrawlerState {
  inline val READY: "READY" = "READY"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"

  inline def values: js.Array[CrawlerState] = js.Array(READY, RUNNING, STOPPING)
}

type CsvHeaderOption = "UNKNOWN" | "PRESENT" | "ABSENT"
object CsvHeaderOption {
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val PRESENT: "PRESENT" = "PRESENT"
  inline val ABSENT: "ABSENT" = "ABSENT"

  inline def values: js.Array[CsvHeaderOption] = js.Array(UNKNOWN, PRESENT, ABSENT)
}

type DataFormat = "AVRO"
object DataFormat {
  inline val AVRO: "AVRO" = "AVRO"

  inline def values: js.Array[DataFormat] = js.Array(AVRO)
}

type DeleteBehavior = "LOG" | "DELETE_FROM_DATABASE" | "DEPRECATE_IN_DATABASE"
object DeleteBehavior {
  inline val LOG: "LOG" = "LOG"
  inline val DELETE_FROM_DATABASE: "DELETE_FROM_DATABASE" = "DELETE_FROM_DATABASE"
  inline val DEPRECATE_IN_DATABASE: "DEPRECATE_IN_DATABASE" = "DEPRECATE_IN_DATABASE"

  inline def values: js.Array[DeleteBehavior] = js.Array(LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE)
}

type EnableHybridValues = "TRUE" | "FALSE"
object EnableHybridValues {
  inline val TRUE: "TRUE" = "TRUE"
  inline val FALSE: "FALSE" = "FALSE"

  inline def values: js.Array[EnableHybridValues] = js.Array(TRUE, FALSE)
}

type ExistCondition = "MUST_EXIST" | "NOT_EXIST" | "NONE"
object ExistCondition {
  inline val MUST_EXIST: "MUST_EXIST" = "MUST_EXIST"
  inline val NOT_EXIST: "NOT_EXIST" = "NOT_EXIST"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ExistCondition] = js.Array(MUST_EXIST, NOT_EXIST, NONE)
}

type JobBookmarksEncryptionMode = "DISABLED" | "CSE-KMS"
object JobBookmarksEncryptionMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val `CSE-KMS`: "CSE-KMS" = "CSE-KMS"

  inline def values: js.Array[JobBookmarksEncryptionMode] = js.Array(DISABLED, `CSE-KMS`)
}

type JobRunState = "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT"
object JobRunState {
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMEOUT: "TIMEOUT" = "TIMEOUT"

  inline def values: js.Array[JobRunState] = js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
}

type Language = "PYTHON" | "SCALA"
object Language {
  inline val PYTHON: "PYTHON" = "PYTHON"
  inline val SCALA: "SCALA" = "SCALA"

  inline def values: js.Array[Language] = js.Array(PYTHON, SCALA)
}

type LastCrawlStatus = "SUCCEEDED" | "CANCELLED" | "FAILED"
object LastCrawlStatus {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[LastCrawlStatus] = js.Array(SUCCEEDED, CANCELLED, FAILED)
}

type Logical = "AND" | "ANY"
object Logical {
  inline val AND: "AND" = "AND"
  inline val ANY: "ANY" = "ANY"

  inline def values: js.Array[Logical] = js.Array(AND, ANY)
}

type LogicalOperator = "EQUALS"
object LogicalOperator {
  inline val EQUALS: "EQUALS" = "EQUALS"

  inline def values: js.Array[LogicalOperator] = js.Array(EQUALS)
}

type MLUserDataEncryptionModeString = "DISABLED" | "SSE-KMS"
object MLUserDataEncryptionModeString {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"

  inline def values: js.Array[MLUserDataEncryptionModeString] = js.Array(DISABLED, `SSE-KMS`)
}

type NodeType = "CRAWLER" | "JOB" | "TRIGGER"
object NodeType {
  inline val CRAWLER: "CRAWLER" = "CRAWLER"
  inline val JOB: "JOB" = "JOB"
  inline val TRIGGER: "TRIGGER" = "TRIGGER"

  inline def values: js.Array[NodeType] = js.Array(CRAWLER, JOB, TRIGGER)
}

type PartitionIndexStatus = "CREATING" | "ACTIVE" | "DELETING" | "FAILED"
object PartitionIndexStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[PartitionIndexStatus] = js.Array(CREATING, ACTIVE, DELETING, FAILED)
}

type Permission = "ALL" | "SELECT" | "ALTER" | "DROP" | "DELETE" | "INSERT" | "CREATE_DATABASE" | "CREATE_TABLE" | "DATA_LOCATION_ACCESS"
object Permission {
  inline val ALL: "ALL" = "ALL"
  inline val SELECT: "SELECT" = "SELECT"
  inline val ALTER: "ALTER" = "ALTER"
  inline val DROP: "DROP" = "DROP"
  inline val DELETE: "DELETE" = "DELETE"
  inline val INSERT: "INSERT" = "INSERT"
  inline val CREATE_DATABASE: "CREATE_DATABASE" = "CREATE_DATABASE"
  inline val CREATE_TABLE: "CREATE_TABLE" = "CREATE_TABLE"
  inline val DATA_LOCATION_ACCESS: "DATA_LOCATION_ACCESS" = "DATA_LOCATION_ACCESS"

  inline def values: js.Array[Permission] = js.Array(ALL, SELECT, ALTER, DROP, DELETE, INSERT, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
}

type PrincipalType = "USER" | "ROLE" | "GROUP"
object PrincipalType {
  inline val USER: "USER" = "USER"
  inline val ROLE: "ROLE" = "ROLE"
  inline val GROUP: "GROUP" = "GROUP"

  inline def values: js.Array[PrincipalType] = js.Array(USER, ROLE, GROUP)
}

type RecrawlBehavior = "CRAWL_EVERYTHING" | "CRAWL_NEW_FOLDERS_ONLY"
object RecrawlBehavior {
  inline val CRAWL_EVERYTHING: "CRAWL_EVERYTHING" = "CRAWL_EVERYTHING"
  inline val CRAWL_NEW_FOLDERS_ONLY: "CRAWL_NEW_FOLDERS_ONLY" = "CRAWL_NEW_FOLDERS_ONLY"

  inline def values: js.Array[RecrawlBehavior] = js.Array(CRAWL_EVERYTHING, CRAWL_NEW_FOLDERS_ONLY)
}

type RegistryStatus = "AVAILABLE" | "DELETING"
object RegistryStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[RegistryStatus] = js.Array(AVAILABLE, DELETING)
}

type ResourceShareType = "FOREIGN" | "ALL"
object ResourceShareType {
  inline val FOREIGN: "FOREIGN" = "FOREIGN"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[ResourceShareType] = js.Array(FOREIGN, ALL)
}

type ResourceType = "JAR" | "FILE" | "ARCHIVE"
object ResourceType {
  inline val JAR: "JAR" = "JAR"
  inline val FILE: "FILE" = "FILE"
  inline val ARCHIVE: "ARCHIVE" = "ARCHIVE"

  inline def values: js.Array[ResourceType] = js.Array(JAR, FILE, ARCHIVE)
}

type S3EncryptionMode = "DISABLED" | "SSE-KMS" | "SSE-S3"
object S3EncryptionMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"
  inline val `SSE-S3`: "SSE-S3" = "SSE-S3"

  inline def values: js.Array[S3EncryptionMode] = js.Array(DISABLED, `SSE-KMS`, `SSE-S3`)
}

type ScheduleState = "SCHEDULED" | "NOT_SCHEDULED" | "TRANSITIONING"
object ScheduleState {
  inline val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  inline val NOT_SCHEDULED: "NOT_SCHEDULED" = "NOT_SCHEDULED"
  inline val TRANSITIONING: "TRANSITIONING" = "TRANSITIONING"

  inline def values: js.Array[ScheduleState] = js.Array(SCHEDULED, NOT_SCHEDULED, TRANSITIONING)
}

type SchemaDiffType = "SYNTAX_DIFF"
object SchemaDiffType {
  inline val SYNTAX_DIFF: "SYNTAX_DIFF" = "SYNTAX_DIFF"

  inline def values: js.Array[SchemaDiffType] = js.Array(SYNTAX_DIFF)
}

type SchemaStatus = "AVAILABLE" | "PENDING" | "DELETING"
object SchemaStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[SchemaStatus] = js.Array(AVAILABLE, PENDING, DELETING)
}

type SchemaVersionStatus = "AVAILABLE" | "PENDING" | "FAILURE" | "DELETING"
object SchemaVersionStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILURE: "FAILURE" = "FAILURE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[SchemaVersionStatus] = js.Array(AVAILABLE, PENDING, FAILURE, DELETING)
}

type Sort = "ASC" | "DESC"
object Sort {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[Sort] = js.Array(ASC, DESC)
}

type SortDirectionType = "DESCENDING" | "ASCENDING"
object SortDirectionType {
  inline val DESCENDING: "DESCENDING" = "DESCENDING"
  inline val ASCENDING: "ASCENDING" = "ASCENDING"

  inline def values: js.Array[SortDirectionType] = js.Array(DESCENDING, ASCENDING)
}

type TaskRunSortColumnType = "TASK_RUN_TYPE" | "STATUS" | "STARTED"
object TaskRunSortColumnType {
  inline val TASK_RUN_TYPE: "TASK_RUN_TYPE" = "TASK_RUN_TYPE"
  inline val STATUS: "STATUS" = "STATUS"
  inline val STARTED: "STARTED" = "STARTED"

  inline def values: js.Array[TaskRunSortColumnType] = js.Array(TASK_RUN_TYPE, STATUS, STARTED)
}

type TaskStatusType = "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT"
object TaskStatusType {
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMEOUT: "TIMEOUT" = "TIMEOUT"

  inline def values: js.Array[TaskStatusType] = js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
}

type TaskType = "EVALUATION" | "LABELING_SET_GENERATION" | "IMPORT_LABELS" | "EXPORT_LABELS" | "FIND_MATCHES"
object TaskType {
  inline val EVALUATION: "EVALUATION" = "EVALUATION"
  inline val LABELING_SET_GENERATION: "LABELING_SET_GENERATION" = "LABELING_SET_GENERATION"
  inline val IMPORT_LABELS: "IMPORT_LABELS" = "IMPORT_LABELS"
  inline val EXPORT_LABELS: "EXPORT_LABELS" = "EXPORT_LABELS"
  inline val FIND_MATCHES: "FIND_MATCHES" = "FIND_MATCHES"

  inline def values: js.Array[TaskType] = js.Array(EVALUATION, LABELING_SET_GENERATION, IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES)
}

type TransformSortColumnType = "NAME" | "TRANSFORM_TYPE" | "STATUS" | "CREATED" | "LAST_MODIFIED"
object TransformSortColumnType {
  inline val NAME: "NAME" = "NAME"
  inline val TRANSFORM_TYPE: "TRANSFORM_TYPE" = "TRANSFORM_TYPE"
  inline val STATUS: "STATUS" = "STATUS"
  inline val CREATED: "CREATED" = "CREATED"
  inline val LAST_MODIFIED: "LAST_MODIFIED" = "LAST_MODIFIED"

  inline def values: js.Array[TransformSortColumnType] = js.Array(NAME, TRANSFORM_TYPE, STATUS, CREATED, LAST_MODIFIED)
}

type TransformStatusType = "NOT_READY" | "READY" | "DELETING"
object TransformStatusType {
  inline val NOT_READY: "NOT_READY" = "NOT_READY"
  inline val READY: "READY" = "READY"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[TransformStatusType] = js.Array(NOT_READY, READY, DELETING)
}

type TransformType = "FIND_MATCHES"
object TransformType {
  inline val FIND_MATCHES: "FIND_MATCHES" = "FIND_MATCHES"

  inline def values: js.Array[TransformType] = js.Array(FIND_MATCHES)
}

type TriggerState = "CREATING" | "CREATED" | "ACTIVATING" | "ACTIVATED" | "DEACTIVATING" | "DEACTIVATED" | "DELETING" | "UPDATING"
object TriggerState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val ACTIVATED: "ACTIVATED" = "ACTIVATED"
  inline val DEACTIVATING: "DEACTIVATING" = "DEACTIVATING"
  inline val DEACTIVATED: "DEACTIVATED" = "DEACTIVATED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[TriggerState] = js.Array(CREATING, CREATED, ACTIVATING, ACTIVATED, DEACTIVATING, DEACTIVATED, DELETING, UPDATING)
}

type TriggerType = "SCHEDULED" | "CONDITIONAL" | "ON_DEMAND"
object TriggerType {
  inline val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  inline val CONDITIONAL: "CONDITIONAL" = "CONDITIONAL"
  inline val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"

  inline def values: js.Array[TriggerType] = js.Array(SCHEDULED, CONDITIONAL, ON_DEMAND)
}

type UpdateBehavior = "LOG" | "UPDATE_IN_DATABASE"
object UpdateBehavior {
  inline val LOG: "LOG" = "LOG"
  inline val UPDATE_IN_DATABASE: "UPDATE_IN_DATABASE" = "UPDATE_IN_DATABASE"

  inline def values: js.Array[UpdateBehavior] = js.Array(LOG, UPDATE_IN_DATABASE)
}

type WorkerType = "Standard" | "G.1X" | "G.2X"
object WorkerType {
  inline val Standard: "Standard" = "Standard"
  inline val `G.1X`: "G.1X" = "G.1X"
  inline val `G.2X`: "G.2X" = "G.2X"

  inline def values: js.Array[WorkerType] = js.Array(Standard, `G.1X`, `G.2X`)
}

type WorkflowRunStatus = "RUNNING" | "COMPLETED" | "STOPPING" | "STOPPED" | "ERROR"
object WorkflowRunStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[WorkflowRunStatus] = js.Array(RUNNING, COMPLETED, STOPPING, STOPPED, ERROR)
}
