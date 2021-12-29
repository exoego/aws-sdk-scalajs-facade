package facade.amazonaws.services.glue

import scalajs._

type BackfillErrorCode = "ENCRYPTED_PARTITION_ERROR" | "INTERNAL_ERROR" | "INVALID_PARTITION_TYPE_DATA_ERROR" | "MISSING_PARTITION_VALUE_ERROR" | "UNSUPPORTED_PARTITION_CHARACTER_ERROR"
object BackfillErrorCode {
  val ENCRYPTED_PARTITION_ERROR: "ENCRYPTED_PARTITION_ERROR" = "ENCRYPTED_PARTITION_ERROR"
  val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  val INVALID_PARTITION_TYPE_DATA_ERROR: "INVALID_PARTITION_TYPE_DATA_ERROR" = "INVALID_PARTITION_TYPE_DATA_ERROR"
  val MISSING_PARTITION_VALUE_ERROR: "MISSING_PARTITION_VALUE_ERROR" = "MISSING_PARTITION_VALUE_ERROR"
  val UNSUPPORTED_PARTITION_CHARACTER_ERROR: "UNSUPPORTED_PARTITION_CHARACTER_ERROR" = "UNSUPPORTED_PARTITION_CHARACTER_ERROR"

  @inline def values = js.Array[BackfillErrorCode](ENCRYPTED_PARTITION_ERROR, INTERNAL_ERROR, INVALID_PARTITION_TYPE_DATA_ERROR, MISSING_PARTITION_VALUE_ERROR, UNSUPPORTED_PARTITION_CHARACTER_ERROR)
}

type CatalogEncryptionMode = "DISABLED" | "SSE-KMS"
object CatalogEncryptionMode {
  val DISABLED: "DISABLED" = "DISABLED"
  val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"

  @inline def values = js.Array[CatalogEncryptionMode](DISABLED, `SSE-KMS`)
}

type CloudWatchEncryptionMode = "DISABLED" | "SSE-KMS"
object CloudWatchEncryptionMode {
  val DISABLED: "DISABLED" = "DISABLED"
  val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"

  @inline def values = js.Array[CloudWatchEncryptionMode](DISABLED, `SSE-KMS`)
}

type ColumnStatisticsType = "BOOLEAN" | "DATE" | "DECIMAL" | "DOUBLE" | "LONG" | "STRING" | "BINARY"
object ColumnStatisticsType {
  val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  val DATE: "DATE" = "DATE"
  val DECIMAL: "DECIMAL" = "DECIMAL"
  val DOUBLE: "DOUBLE" = "DOUBLE"
  val LONG: "LONG" = "LONG"
  val STRING: "STRING" = "STRING"
  val BINARY: "BINARY" = "BINARY"

  @inline def values = js.Array[ColumnStatisticsType](BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING, BINARY)
}

type Comparator = "EQUALS" | "GREATER_THAN" | "LESS_THAN" | "GREATER_THAN_EQUALS" | "LESS_THAN_EQUALS"
object Comparator {
  val EQUALS: "EQUALS" = "EQUALS"
  val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  val GREATER_THAN_EQUALS: "GREATER_THAN_EQUALS" = "GREATER_THAN_EQUALS"
  val LESS_THAN_EQUALS: "LESS_THAN_EQUALS" = "LESS_THAN_EQUALS"

  @inline def values = js.Array[Comparator](EQUALS, GREATER_THAN, LESS_THAN, GREATER_THAN_EQUALS, LESS_THAN_EQUALS)
}

type Compatibility = "NONE" | "DISABLED" | "BACKWARD" | "BACKWARD_ALL" | "FORWARD" | "FORWARD_ALL" | "FULL" | "FULL_ALL"
object Compatibility {
  val NONE: "NONE" = "NONE"
  val DISABLED: "DISABLED" = "DISABLED"
  val BACKWARD: "BACKWARD" = "BACKWARD"
  val BACKWARD_ALL: "BACKWARD_ALL" = "BACKWARD_ALL"
  val FORWARD: "FORWARD" = "FORWARD"
  val FORWARD_ALL: "FORWARD_ALL" = "FORWARD_ALL"
  val FULL: "FULL" = "FULL"
  val FULL_ALL: "FULL_ALL" = "FULL_ALL"

  @inline def values = js.Array[Compatibility](NONE, DISABLED, BACKWARD, BACKWARD_ALL, FORWARD, FORWARD_ALL, FULL, FULL_ALL)
}

type ConnectionPropertyKey = "HOST" | "PORT" | "USERNAME" | "PASSWORD" | "ENCRYPTED_PASSWORD" | "JDBC_DRIVER_JAR_URI" | "JDBC_DRIVER_CLASS_NAME" | "JDBC_ENGINE" | "JDBC_ENGINE_VERSION" | "CONFIG_FILES" | "INSTANCE_ID" | "JDBC_CONNECTION_URL" | "JDBC_ENFORCE_SSL" | "CUSTOM_JDBC_CERT" | "SKIP_CUSTOM_JDBC_CERT_VALIDATION" | "CUSTOM_JDBC_CERT_STRING" | "CONNECTION_URL" | "KAFKA_BOOTSTRAP_SERVERS" | "KAFKA_SSL_ENABLED" | "KAFKA_CUSTOM_CERT" | "KAFKA_SKIP_CUSTOM_CERT_VALIDATION" | "SECRET_ID" | "CONNECTOR_URL" | "CONNECTOR_TYPE" | "CONNECTOR_CLASS_NAME"
object ConnectionPropertyKey {
  val HOST: "HOST" = "HOST"
  val PORT: "PORT" = "PORT"
  val USERNAME: "USERNAME" = "USERNAME"
  val PASSWORD: "PASSWORD" = "PASSWORD"
  val ENCRYPTED_PASSWORD: "ENCRYPTED_PASSWORD" = "ENCRYPTED_PASSWORD"
  val JDBC_DRIVER_JAR_URI: "JDBC_DRIVER_JAR_URI" = "JDBC_DRIVER_JAR_URI"
  val JDBC_DRIVER_CLASS_NAME: "JDBC_DRIVER_CLASS_NAME" = "JDBC_DRIVER_CLASS_NAME"
  val JDBC_ENGINE: "JDBC_ENGINE" = "JDBC_ENGINE"
  val JDBC_ENGINE_VERSION: "JDBC_ENGINE_VERSION" = "JDBC_ENGINE_VERSION"
  val CONFIG_FILES: "CONFIG_FILES" = "CONFIG_FILES"
  val INSTANCE_ID: "INSTANCE_ID" = "INSTANCE_ID"
  val JDBC_CONNECTION_URL: "JDBC_CONNECTION_URL" = "JDBC_CONNECTION_URL"
  val JDBC_ENFORCE_SSL: "JDBC_ENFORCE_SSL" = "JDBC_ENFORCE_SSL"
  val CUSTOM_JDBC_CERT: "CUSTOM_JDBC_CERT" = "CUSTOM_JDBC_CERT"
  val SKIP_CUSTOM_JDBC_CERT_VALIDATION: "SKIP_CUSTOM_JDBC_CERT_VALIDATION" = "SKIP_CUSTOM_JDBC_CERT_VALIDATION"
  val CUSTOM_JDBC_CERT_STRING: "CUSTOM_JDBC_CERT_STRING" = "CUSTOM_JDBC_CERT_STRING"
  val CONNECTION_URL: "CONNECTION_URL" = "CONNECTION_URL"
  val KAFKA_BOOTSTRAP_SERVERS: "KAFKA_BOOTSTRAP_SERVERS" = "KAFKA_BOOTSTRAP_SERVERS"
  val KAFKA_SSL_ENABLED: "KAFKA_SSL_ENABLED" = "KAFKA_SSL_ENABLED"
  val KAFKA_CUSTOM_CERT: "KAFKA_CUSTOM_CERT" = "KAFKA_CUSTOM_CERT"
  val KAFKA_SKIP_CUSTOM_CERT_VALIDATION: "KAFKA_SKIP_CUSTOM_CERT_VALIDATION" = "KAFKA_SKIP_CUSTOM_CERT_VALIDATION"
  val SECRET_ID: "SECRET_ID" = "SECRET_ID"
  val CONNECTOR_URL: "CONNECTOR_URL" = "CONNECTOR_URL"
  val CONNECTOR_TYPE: "CONNECTOR_TYPE" = "CONNECTOR_TYPE"
  val CONNECTOR_CLASS_NAME: "CONNECTOR_CLASS_NAME" = "CONNECTOR_CLASS_NAME"

  @inline def values = js.Array[ConnectionPropertyKey](
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
  val JDBC: "JDBC" = "JDBC"
  val SFTP: "SFTP" = "SFTP"
  val MONGODB: "MONGODB" = "MONGODB"
  val KAFKA: "KAFKA" = "KAFKA"
  val NETWORK: "NETWORK" = "NETWORK"
  val MARKETPLACE: "MARKETPLACE" = "MARKETPLACE"
  val CUSTOM: "CUSTOM" = "CUSTOM"

  @inline def values = js.Array[ConnectionType](JDBC, SFTP, MONGODB, KAFKA, NETWORK, MARKETPLACE, CUSTOM)
}

type CrawlState = "RUNNING" | "CANCELLING" | "CANCELLED" | "SUCCEEDED" | "FAILED"
object CrawlState {
  val RUNNING: "RUNNING" = "RUNNING"
  val CANCELLING: "CANCELLING" = "CANCELLING"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[CrawlState](RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED)
}

type CrawlerLineageSettings = "ENABLE" | "DISABLE"
object CrawlerLineageSettings {
  val ENABLE: "ENABLE" = "ENABLE"
  val DISABLE: "DISABLE" = "DISABLE"

  @inline def values = js.Array[CrawlerLineageSettings](ENABLE, DISABLE)
}

type CrawlerState = "READY" | "RUNNING" | "STOPPING"
object CrawlerState {
  val READY: "READY" = "READY"
  val RUNNING: "RUNNING" = "RUNNING"
  val STOPPING: "STOPPING" = "STOPPING"

  @inline def values = js.Array[CrawlerState](READY, RUNNING, STOPPING)
}

type CsvHeaderOption = "UNKNOWN" | "PRESENT" | "ABSENT"
object CsvHeaderOption {
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  val PRESENT: "PRESENT" = "PRESENT"
  val ABSENT: "ABSENT" = "ABSENT"

  @inline def values = js.Array[CsvHeaderOption](UNKNOWN, PRESENT, ABSENT)
}

type DataFormat = "AVRO"
object DataFormat {
  val AVRO: "AVRO" = "AVRO"

  @inline def values = js.Array[DataFormat](AVRO)
}

type DeleteBehavior = "LOG" | "DELETE_FROM_DATABASE" | "DEPRECATE_IN_DATABASE"
object DeleteBehavior {
  val LOG: "LOG" = "LOG"
  val DELETE_FROM_DATABASE: "DELETE_FROM_DATABASE" = "DELETE_FROM_DATABASE"
  val DEPRECATE_IN_DATABASE: "DEPRECATE_IN_DATABASE" = "DEPRECATE_IN_DATABASE"

  @inline def values = js.Array[DeleteBehavior](LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE)
}

type EnableHybridValues = "TRUE" | "FALSE"
object EnableHybridValues {
  val TRUE: "TRUE" = "TRUE"
  val FALSE: "FALSE" = "FALSE"

  @inline def values = js.Array[EnableHybridValues](TRUE, FALSE)
}

type ExistCondition = "MUST_EXIST" | "NOT_EXIST" | "NONE"
object ExistCondition {
  val MUST_EXIST: "MUST_EXIST" = "MUST_EXIST"
  val NOT_EXIST: "NOT_EXIST" = "NOT_EXIST"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[ExistCondition](MUST_EXIST, NOT_EXIST, NONE)
}

type JobBookmarksEncryptionMode = "DISABLED" | "CSE-KMS"
object JobBookmarksEncryptionMode {
  val DISABLED: "DISABLED" = "DISABLED"
  val `CSE-KMS`: "CSE-KMS" = "CSE-KMS"

  @inline def values = js.Array[JobBookmarksEncryptionMode](DISABLED, `CSE-KMS`)
}

type JobRunState = "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT"
object JobRunState {
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val TIMEOUT: "TIMEOUT" = "TIMEOUT"

  @inline def values = js.Array[JobRunState](STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
}

type Language = "PYTHON" | "SCALA"
object Language {
  val PYTHON: "PYTHON" = "PYTHON"
  val SCALA: "SCALA" = "SCALA"

  @inline def values = js.Array[Language](PYTHON, SCALA)
}

type LastCrawlStatus = "SUCCEEDED" | "CANCELLED" | "FAILED"
object LastCrawlStatus {
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[LastCrawlStatus](SUCCEEDED, CANCELLED, FAILED)
}

type Logical = "AND" | "ANY"
object Logical {
  val AND: "AND" = "AND"
  val ANY: "ANY" = "ANY"

  @inline def values = js.Array[Logical](AND, ANY)
}

type LogicalOperator = "EQUALS"
object LogicalOperator {
  val EQUALS: "EQUALS" = "EQUALS"

  @inline def values = js.Array[LogicalOperator](EQUALS)
}

type MLUserDataEncryptionModeString = "DISABLED" | "SSE-KMS"
object MLUserDataEncryptionModeString {
  val DISABLED: "DISABLED" = "DISABLED"
  val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"

  @inline def values = js.Array[MLUserDataEncryptionModeString](DISABLED, `SSE-KMS`)
}

type NodeType = "CRAWLER" | "JOB" | "TRIGGER"
object NodeType {
  val CRAWLER: "CRAWLER" = "CRAWLER"
  val JOB: "JOB" = "JOB"
  val TRIGGER: "TRIGGER" = "TRIGGER"

  @inline def values = js.Array[NodeType](CRAWLER, JOB, TRIGGER)
}

type PartitionIndexStatus = "CREATING" | "ACTIVE" | "DELETING" | "FAILED"
object PartitionIndexStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[PartitionIndexStatus](CREATING, ACTIVE, DELETING, FAILED)
}

type Permission = "ALL" | "SELECT" | "ALTER" | "DROP" | "DELETE" | "INSERT" | "CREATE_DATABASE" | "CREATE_TABLE" | "DATA_LOCATION_ACCESS"
object Permission {
  val ALL: "ALL" = "ALL"
  val SELECT: "SELECT" = "SELECT"
  val ALTER: "ALTER" = "ALTER"
  val DROP: "DROP" = "DROP"
  val DELETE: "DELETE" = "DELETE"
  val INSERT: "INSERT" = "INSERT"
  val CREATE_DATABASE: "CREATE_DATABASE" = "CREATE_DATABASE"
  val CREATE_TABLE: "CREATE_TABLE" = "CREATE_TABLE"
  val DATA_LOCATION_ACCESS: "DATA_LOCATION_ACCESS" = "DATA_LOCATION_ACCESS"

  @inline def values = js.Array[Permission](ALL, SELECT, ALTER, DROP, DELETE, INSERT, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
}

type PrincipalType = "USER" | "ROLE" | "GROUP"
object PrincipalType {
  val USER: "USER" = "USER"
  val ROLE: "ROLE" = "ROLE"
  val GROUP: "GROUP" = "GROUP"

  @inline def values = js.Array[PrincipalType](USER, ROLE, GROUP)
}

type RecrawlBehavior = "CRAWL_EVERYTHING" | "CRAWL_NEW_FOLDERS_ONLY"
object RecrawlBehavior {
  val CRAWL_EVERYTHING: "CRAWL_EVERYTHING" = "CRAWL_EVERYTHING"
  val CRAWL_NEW_FOLDERS_ONLY: "CRAWL_NEW_FOLDERS_ONLY" = "CRAWL_NEW_FOLDERS_ONLY"

  @inline def values = js.Array[RecrawlBehavior](CRAWL_EVERYTHING, CRAWL_NEW_FOLDERS_ONLY)
}

type RegistryStatus = "AVAILABLE" | "DELETING"
object RegistryStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[RegistryStatus](AVAILABLE, DELETING)
}

type ResourceShareType = "FOREIGN" | "ALL"
object ResourceShareType {
  val FOREIGN: "FOREIGN" = "FOREIGN"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[ResourceShareType](FOREIGN, ALL)
}

type ResourceType = "JAR" | "FILE" | "ARCHIVE"
object ResourceType {
  val JAR: "JAR" = "JAR"
  val FILE: "FILE" = "FILE"
  val ARCHIVE: "ARCHIVE" = "ARCHIVE"

  @inline def values = js.Array[ResourceType](JAR, FILE, ARCHIVE)
}

type S3EncryptionMode = "DISABLED" | "SSE-KMS" | "SSE-S3"
object S3EncryptionMode {
  val DISABLED: "DISABLED" = "DISABLED"
  val `SSE-KMS`: "SSE-KMS" = "SSE-KMS"
  val `SSE-S3`: "SSE-S3" = "SSE-S3"

  @inline def values = js.Array[S3EncryptionMode](DISABLED, `SSE-KMS`, `SSE-S3`)
}

type ScheduleState = "SCHEDULED" | "NOT_SCHEDULED" | "TRANSITIONING"
object ScheduleState {
  val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  val NOT_SCHEDULED: "NOT_SCHEDULED" = "NOT_SCHEDULED"
  val TRANSITIONING: "TRANSITIONING" = "TRANSITIONING"

  @inline def values = js.Array[ScheduleState](SCHEDULED, NOT_SCHEDULED, TRANSITIONING)
}

type SchemaDiffType = "SYNTAX_DIFF"
object SchemaDiffType {
  val SYNTAX_DIFF: "SYNTAX_DIFF" = "SYNTAX_DIFF"

  @inline def values = js.Array[SchemaDiffType](SYNTAX_DIFF)
}

type SchemaStatus = "AVAILABLE" | "PENDING" | "DELETING"
object SchemaStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val PENDING: "PENDING" = "PENDING"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[SchemaStatus](AVAILABLE, PENDING, DELETING)
}

type SchemaVersionStatus = "AVAILABLE" | "PENDING" | "FAILURE" | "DELETING"
object SchemaVersionStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val PENDING: "PENDING" = "PENDING"
  val FAILURE: "FAILURE" = "FAILURE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[SchemaVersionStatus](AVAILABLE, PENDING, FAILURE, DELETING)
}

type Sort = "ASC" | "DESC"
object Sort {
  val ASC: "ASC" = "ASC"
  val DESC: "DESC" = "DESC"

  @inline def values = js.Array[Sort](ASC, DESC)
}

type SortDirectionType = "DESCENDING" | "ASCENDING"
object SortDirectionType {
  val DESCENDING: "DESCENDING" = "DESCENDING"
  val ASCENDING: "ASCENDING" = "ASCENDING"

  @inline def values = js.Array[SortDirectionType](DESCENDING, ASCENDING)
}

type TaskRunSortColumnType = "TASK_RUN_TYPE" | "STATUS" | "STARTED"
object TaskRunSortColumnType {
  val TASK_RUN_TYPE: "TASK_RUN_TYPE" = "TASK_RUN_TYPE"
  val STATUS: "STATUS" = "STATUS"
  val STARTED: "STARTED" = "STARTED"

  @inline def values = js.Array[TaskRunSortColumnType](TASK_RUN_TYPE, STATUS, STARTED)
}

type TaskStatusType = "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT"
object TaskStatusType {
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val TIMEOUT: "TIMEOUT" = "TIMEOUT"

  @inline def values = js.Array[TaskStatusType](STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
}

type TaskType = "EVALUATION" | "LABELING_SET_GENERATION" | "IMPORT_LABELS" | "EXPORT_LABELS" | "FIND_MATCHES"
object TaskType {
  val EVALUATION: "EVALUATION" = "EVALUATION"
  val LABELING_SET_GENERATION: "LABELING_SET_GENERATION" = "LABELING_SET_GENERATION"
  val IMPORT_LABELS: "IMPORT_LABELS" = "IMPORT_LABELS"
  val EXPORT_LABELS: "EXPORT_LABELS" = "EXPORT_LABELS"
  val FIND_MATCHES: "FIND_MATCHES" = "FIND_MATCHES"

  @inline def values = js.Array[TaskType](EVALUATION, LABELING_SET_GENERATION, IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES)
}

type TransformSortColumnType = "NAME" | "TRANSFORM_TYPE" | "STATUS" | "CREATED" | "LAST_MODIFIED"
object TransformSortColumnType {
  val NAME: "NAME" = "NAME"
  val TRANSFORM_TYPE: "TRANSFORM_TYPE" = "TRANSFORM_TYPE"
  val STATUS: "STATUS" = "STATUS"
  val CREATED: "CREATED" = "CREATED"
  val LAST_MODIFIED: "LAST_MODIFIED" = "LAST_MODIFIED"

  @inline def values = js.Array[TransformSortColumnType](NAME, TRANSFORM_TYPE, STATUS, CREATED, LAST_MODIFIED)
}

type TransformStatusType = "NOT_READY" | "READY" | "DELETING"
object TransformStatusType {
  val NOT_READY: "NOT_READY" = "NOT_READY"
  val READY: "READY" = "READY"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[TransformStatusType](NOT_READY, READY, DELETING)
}

type TransformType = "FIND_MATCHES"
object TransformType {
  val FIND_MATCHES: "FIND_MATCHES" = "FIND_MATCHES"

  @inline def values = js.Array[TransformType](FIND_MATCHES)
}

type TriggerState = "CREATING" | "CREATED" | "ACTIVATING" | "ACTIVATED" | "DEACTIVATING" | "DEACTIVATED" | "DELETING" | "UPDATING"
object TriggerState {
  val CREATING: "CREATING" = "CREATING"
  val CREATED: "CREATED" = "CREATED"
  val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  val ACTIVATED: "ACTIVATED" = "ACTIVATED"
  val DEACTIVATING: "DEACTIVATING" = "DEACTIVATING"
  val DEACTIVATED: "DEACTIVATED" = "DEACTIVATED"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[TriggerState](CREATING, CREATED, ACTIVATING, ACTIVATED, DEACTIVATING, DEACTIVATED, DELETING, UPDATING)
}

type TriggerType = "SCHEDULED" | "CONDITIONAL" | "ON_DEMAND"
object TriggerType {
  val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  val CONDITIONAL: "CONDITIONAL" = "CONDITIONAL"
  val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"

  @inline def values = js.Array[TriggerType](SCHEDULED, CONDITIONAL, ON_DEMAND)
}

type UpdateBehavior = "LOG" | "UPDATE_IN_DATABASE"
object UpdateBehavior {
  val LOG: "LOG" = "LOG"
  val UPDATE_IN_DATABASE: "UPDATE_IN_DATABASE" = "UPDATE_IN_DATABASE"

  @inline def values = js.Array[UpdateBehavior](LOG, UPDATE_IN_DATABASE)
}

type WorkerType = "Standard" | "G.1X" | "G.2X"
object WorkerType {
  val Standard: "Standard" = "Standard"
  val `G.1X`: "G.1X" = "G.1X"
  val `G.2X`: "G.2X" = "G.2X"

  @inline def values = js.Array[WorkerType](Standard, `G.1X`, `G.2X`)
}

type WorkflowRunStatus = "RUNNING" | "COMPLETED" | "STOPPING" | "STOPPED" | "ERROR"
object WorkflowRunStatus {
  val RUNNING: "RUNNING" = "RUNNING"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[WorkflowRunStatus](RUNNING, COMPLETED, STOPPING, STOPPED, ERROR)
}
