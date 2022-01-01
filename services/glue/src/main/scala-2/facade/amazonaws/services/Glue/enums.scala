package facade.amazonaws.services.glue

import scalajs.js

@js.native
sealed trait BackfillErrorCode extends js.Any
object BackfillErrorCode {
  val ENCRYPTED_PARTITION_ERROR = "ENCRYPTED_PARTITION_ERROR".asInstanceOf[BackfillErrorCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[BackfillErrorCode]
  val INVALID_PARTITION_TYPE_DATA_ERROR = "INVALID_PARTITION_TYPE_DATA_ERROR".asInstanceOf[BackfillErrorCode]
  val MISSING_PARTITION_VALUE_ERROR = "MISSING_PARTITION_VALUE_ERROR".asInstanceOf[BackfillErrorCode]
  val UNSUPPORTED_PARTITION_CHARACTER_ERROR = "UNSUPPORTED_PARTITION_CHARACTER_ERROR".asInstanceOf[BackfillErrorCode]

  @inline def values: js.Array[BackfillErrorCode] = js.Array(ENCRYPTED_PARTITION_ERROR, INTERNAL_ERROR, INVALID_PARTITION_TYPE_DATA_ERROR, MISSING_PARTITION_VALUE_ERROR, UNSUPPORTED_PARTITION_CHARACTER_ERROR)
}

@js.native
sealed trait BlueprintRunState extends js.Any
object BlueprintRunState {
  val RUNNING = "RUNNING".asInstanceOf[BlueprintRunState]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[BlueprintRunState]
  val FAILED = "FAILED".asInstanceOf[BlueprintRunState]
  val ROLLING_BACK = "ROLLING_BACK".asInstanceOf[BlueprintRunState]

  @inline def values: js.Array[BlueprintRunState] = js.Array(RUNNING, SUCCEEDED, FAILED, ROLLING_BACK)
}

@js.native
sealed trait BlueprintStatus extends js.Any
object BlueprintStatus {
  val CREATING = "CREATING".asInstanceOf[BlueprintStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[BlueprintStatus]
  val UPDATING = "UPDATING".asInstanceOf[BlueprintStatus]
  val FAILED = "FAILED".asInstanceOf[BlueprintStatus]

  @inline def values: js.Array[BlueprintStatus] = js.Array(CREATING, ACTIVE, UPDATING, FAILED)
}

@js.native
sealed trait CatalogEncryptionMode extends js.Any
object CatalogEncryptionMode {
  val DISABLED = "DISABLED".asInstanceOf[CatalogEncryptionMode]
  val `SSE-KMS` = "SSE-KMS".asInstanceOf[CatalogEncryptionMode]

  @inline def values: js.Array[CatalogEncryptionMode] = js.Array(DISABLED, `SSE-KMS`)
}

@js.native
sealed trait CloudWatchEncryptionMode extends js.Any
object CloudWatchEncryptionMode {
  val DISABLED = "DISABLED".asInstanceOf[CloudWatchEncryptionMode]
  val `SSE-KMS` = "SSE-KMS".asInstanceOf[CloudWatchEncryptionMode]

  @inline def values: js.Array[CloudWatchEncryptionMode] = js.Array(DISABLED, `SSE-KMS`)
}

@js.native
sealed trait ColumnStatisticsType extends js.Any
object ColumnStatisticsType {
  val BOOLEAN = "BOOLEAN".asInstanceOf[ColumnStatisticsType]
  val DATE = "DATE".asInstanceOf[ColumnStatisticsType]
  val DECIMAL = "DECIMAL".asInstanceOf[ColumnStatisticsType]
  val DOUBLE = "DOUBLE".asInstanceOf[ColumnStatisticsType]
  val LONG = "LONG".asInstanceOf[ColumnStatisticsType]
  val STRING = "STRING".asInstanceOf[ColumnStatisticsType]
  val BINARY = "BINARY".asInstanceOf[ColumnStatisticsType]

  @inline def values: js.Array[ColumnStatisticsType] = js.Array(BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING, BINARY)
}

@js.native
sealed trait Comparator extends js.Any
object Comparator {
  val EQUALS = "EQUALS".asInstanceOf[Comparator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[Comparator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[Comparator]
  val GREATER_THAN_EQUALS = "GREATER_THAN_EQUALS".asInstanceOf[Comparator]
  val LESS_THAN_EQUALS = "LESS_THAN_EQUALS".asInstanceOf[Comparator]

  @inline def values: js.Array[Comparator] = js.Array(EQUALS, GREATER_THAN, LESS_THAN, GREATER_THAN_EQUALS, LESS_THAN_EQUALS)
}

@js.native
sealed trait Compatibility extends js.Any
object Compatibility {
  val NONE = "NONE".asInstanceOf[Compatibility]
  val DISABLED = "DISABLED".asInstanceOf[Compatibility]
  val BACKWARD = "BACKWARD".asInstanceOf[Compatibility]
  val BACKWARD_ALL = "BACKWARD_ALL".asInstanceOf[Compatibility]
  val FORWARD = "FORWARD".asInstanceOf[Compatibility]
  val FORWARD_ALL = "FORWARD_ALL".asInstanceOf[Compatibility]
  val FULL = "FULL".asInstanceOf[Compatibility]
  val FULL_ALL = "FULL_ALL".asInstanceOf[Compatibility]

  @inline def values: js.Array[Compatibility] = js.Array(NONE, DISABLED, BACKWARD, BACKWARD_ALL, FORWARD, FORWARD_ALL, FULL, FULL_ALL)
}

@js.native
sealed trait ConnectionPropertyKey extends js.Any
object ConnectionPropertyKey {
  val HOST = "HOST".asInstanceOf[ConnectionPropertyKey]
  val PORT = "PORT".asInstanceOf[ConnectionPropertyKey]
  val USERNAME = "USERNAME".asInstanceOf[ConnectionPropertyKey]
  val PASSWORD = "PASSWORD".asInstanceOf[ConnectionPropertyKey]
  val ENCRYPTED_PASSWORD = "ENCRYPTED_PASSWORD".asInstanceOf[ConnectionPropertyKey]
  val JDBC_DRIVER_JAR_URI = "JDBC_DRIVER_JAR_URI".asInstanceOf[ConnectionPropertyKey]
  val JDBC_DRIVER_CLASS_NAME = "JDBC_DRIVER_CLASS_NAME".asInstanceOf[ConnectionPropertyKey]
  val JDBC_ENGINE = "JDBC_ENGINE".asInstanceOf[ConnectionPropertyKey]
  val JDBC_ENGINE_VERSION = "JDBC_ENGINE_VERSION".asInstanceOf[ConnectionPropertyKey]
  val CONFIG_FILES = "CONFIG_FILES".asInstanceOf[ConnectionPropertyKey]
  val INSTANCE_ID = "INSTANCE_ID".asInstanceOf[ConnectionPropertyKey]
  val JDBC_CONNECTION_URL = "JDBC_CONNECTION_URL".asInstanceOf[ConnectionPropertyKey]
  val JDBC_ENFORCE_SSL = "JDBC_ENFORCE_SSL".asInstanceOf[ConnectionPropertyKey]
  val CUSTOM_JDBC_CERT = "CUSTOM_JDBC_CERT".asInstanceOf[ConnectionPropertyKey]
  val SKIP_CUSTOM_JDBC_CERT_VALIDATION = "SKIP_CUSTOM_JDBC_CERT_VALIDATION".asInstanceOf[ConnectionPropertyKey]
  val CUSTOM_JDBC_CERT_STRING = "CUSTOM_JDBC_CERT_STRING".asInstanceOf[ConnectionPropertyKey]
  val CONNECTION_URL = "CONNECTION_URL".asInstanceOf[ConnectionPropertyKey]
  val KAFKA_BOOTSTRAP_SERVERS = "KAFKA_BOOTSTRAP_SERVERS".asInstanceOf[ConnectionPropertyKey]
  val KAFKA_SSL_ENABLED = "KAFKA_SSL_ENABLED".asInstanceOf[ConnectionPropertyKey]
  val KAFKA_CUSTOM_CERT = "KAFKA_CUSTOM_CERT".asInstanceOf[ConnectionPropertyKey]
  val KAFKA_SKIP_CUSTOM_CERT_VALIDATION = "KAFKA_SKIP_CUSTOM_CERT_VALIDATION".asInstanceOf[ConnectionPropertyKey]
  val KAFKA_CLIENT_KEYSTORE = "KAFKA_CLIENT_KEYSTORE".asInstanceOf[ConnectionPropertyKey]
  val KAFKA_CLIENT_KEYSTORE_PASSWORD = "KAFKA_CLIENT_KEYSTORE_PASSWORD".asInstanceOf[ConnectionPropertyKey]
  val KAFKA_CLIENT_KEY_PASSWORD = "KAFKA_CLIENT_KEY_PASSWORD".asInstanceOf[ConnectionPropertyKey]
  val ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD = "ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD".asInstanceOf[ConnectionPropertyKey]
  val ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD = "ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD".asInstanceOf[ConnectionPropertyKey]
  val SECRET_ID = "SECRET_ID".asInstanceOf[ConnectionPropertyKey]
  val CONNECTOR_URL = "CONNECTOR_URL".asInstanceOf[ConnectionPropertyKey]
  val CONNECTOR_TYPE = "CONNECTOR_TYPE".asInstanceOf[ConnectionPropertyKey]
  val CONNECTOR_CLASS_NAME = "CONNECTOR_CLASS_NAME".asInstanceOf[ConnectionPropertyKey]

  @inline def values: js.Array[ConnectionPropertyKey] = js.Array(
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
    KAFKA_CLIENT_KEYSTORE,
    KAFKA_CLIENT_KEYSTORE_PASSWORD,
    KAFKA_CLIENT_KEY_PASSWORD,
    ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD,
    ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD,
    SECRET_ID,
    CONNECTOR_URL,
    CONNECTOR_TYPE,
    CONNECTOR_CLASS_NAME
  )
}

@js.native
sealed trait ConnectionType extends js.Any
object ConnectionType {
  val JDBC = "JDBC".asInstanceOf[ConnectionType]
  val SFTP = "SFTP".asInstanceOf[ConnectionType]
  val MONGODB = "MONGODB".asInstanceOf[ConnectionType]
  val KAFKA = "KAFKA".asInstanceOf[ConnectionType]
  val NETWORK = "NETWORK".asInstanceOf[ConnectionType]
  val MARKETPLACE = "MARKETPLACE".asInstanceOf[ConnectionType]
  val CUSTOM = "CUSTOM".asInstanceOf[ConnectionType]

  @inline def values: js.Array[ConnectionType] = js.Array(JDBC, SFTP, MONGODB, KAFKA, NETWORK, MARKETPLACE, CUSTOM)
}

@js.native
sealed trait CrawlState extends js.Any
object CrawlState {
  val RUNNING = "RUNNING".asInstanceOf[CrawlState]
  val CANCELLING = "CANCELLING".asInstanceOf[CrawlState]
  val CANCELLED = "CANCELLED".asInstanceOf[CrawlState]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[CrawlState]
  val FAILED = "FAILED".asInstanceOf[CrawlState]

  @inline def values: js.Array[CrawlState] = js.Array(RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED)
}

@js.native
sealed trait CrawlerLineageSettings extends js.Any
object CrawlerLineageSettings {
  val ENABLE = "ENABLE".asInstanceOf[CrawlerLineageSettings]
  val DISABLE = "DISABLE".asInstanceOf[CrawlerLineageSettings]

  @inline def values: js.Array[CrawlerLineageSettings] = js.Array(ENABLE, DISABLE)
}

@js.native
sealed trait CrawlerState extends js.Any
object CrawlerState {
  val READY = "READY".asInstanceOf[CrawlerState]
  val RUNNING = "RUNNING".asInstanceOf[CrawlerState]
  val STOPPING = "STOPPING".asInstanceOf[CrawlerState]

  @inline def values: js.Array[CrawlerState] = js.Array(READY, RUNNING, STOPPING)
}

@js.native
sealed trait CsvHeaderOption extends js.Any
object CsvHeaderOption {
  val UNKNOWN = "UNKNOWN".asInstanceOf[CsvHeaderOption]
  val PRESENT = "PRESENT".asInstanceOf[CsvHeaderOption]
  val ABSENT = "ABSENT".asInstanceOf[CsvHeaderOption]

  @inline def values: js.Array[CsvHeaderOption] = js.Array(UNKNOWN, PRESENT, ABSENT)
}

@js.native
sealed trait DataFormat extends js.Any
object DataFormat {
  val AVRO = "AVRO".asInstanceOf[DataFormat]
  val JSON = "JSON".asInstanceOf[DataFormat]

  @inline def values: js.Array[DataFormat] = js.Array(AVRO, JSON)
}

@js.native
sealed trait DeleteBehavior extends js.Any
object DeleteBehavior {
  val LOG = "LOG".asInstanceOf[DeleteBehavior]
  val DELETE_FROM_DATABASE = "DELETE_FROM_DATABASE".asInstanceOf[DeleteBehavior]
  val DEPRECATE_IN_DATABASE = "DEPRECATE_IN_DATABASE".asInstanceOf[DeleteBehavior]

  @inline def values: js.Array[DeleteBehavior] = js.Array(LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE)
}

@js.native
sealed trait EnableHybridValues extends js.Any
object EnableHybridValues {
  val TRUE = "TRUE".asInstanceOf[EnableHybridValues]
  val FALSE = "FALSE".asInstanceOf[EnableHybridValues]

  @inline def values: js.Array[EnableHybridValues] = js.Array(TRUE, FALSE)
}

@js.native
sealed trait ExistCondition extends js.Any
object ExistCondition {
  val MUST_EXIST = "MUST_EXIST".asInstanceOf[ExistCondition]
  val NOT_EXIST = "NOT_EXIST".asInstanceOf[ExistCondition]
  val NONE = "NONE".asInstanceOf[ExistCondition]

  @inline def values: js.Array[ExistCondition] = js.Array(MUST_EXIST, NOT_EXIST, NONE)
}

@js.native
sealed trait JobBookmarksEncryptionMode extends js.Any
object JobBookmarksEncryptionMode {
  val DISABLED = "DISABLED".asInstanceOf[JobBookmarksEncryptionMode]
  val `CSE-KMS` = "CSE-KMS".asInstanceOf[JobBookmarksEncryptionMode]

  @inline def values: js.Array[JobBookmarksEncryptionMode] = js.Array(DISABLED, `CSE-KMS`)
}

@js.native
sealed trait JobRunState extends js.Any
object JobRunState {
  val STARTING = "STARTING".asInstanceOf[JobRunState]
  val RUNNING = "RUNNING".asInstanceOf[JobRunState]
  val STOPPING = "STOPPING".asInstanceOf[JobRunState]
  val STOPPED = "STOPPED".asInstanceOf[JobRunState]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobRunState]
  val FAILED = "FAILED".asInstanceOf[JobRunState]
  val TIMEOUT = "TIMEOUT".asInstanceOf[JobRunState]

  @inline def values: js.Array[JobRunState] = js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
}

@js.native
sealed trait Language extends js.Any
object Language {
  val PYTHON = "PYTHON".asInstanceOf[Language]
  val SCALA = "SCALA".asInstanceOf[Language]

  @inline def values: js.Array[Language] = js.Array(PYTHON, SCALA)
}

@js.native
sealed trait LastCrawlStatus extends js.Any
object LastCrawlStatus {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[LastCrawlStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[LastCrawlStatus]
  val FAILED = "FAILED".asInstanceOf[LastCrawlStatus]

  @inline def values: js.Array[LastCrawlStatus] = js.Array(SUCCEEDED, CANCELLED, FAILED)
}

@js.native
sealed trait Logical extends js.Any
object Logical {
  val AND = "AND".asInstanceOf[Logical]
  val ANY = "ANY".asInstanceOf[Logical]

  @inline def values: js.Array[Logical] = js.Array(AND, ANY)
}

@js.native
sealed trait LogicalOperator extends js.Any
object LogicalOperator {
  val EQUALS = "EQUALS".asInstanceOf[LogicalOperator]

  @inline def values: js.Array[LogicalOperator] = js.Array(EQUALS)
}

@js.native
sealed trait MLUserDataEncryptionModeString extends js.Any
object MLUserDataEncryptionModeString {
  val DISABLED = "DISABLED".asInstanceOf[MLUserDataEncryptionModeString]
  val `SSE-KMS` = "SSE-KMS".asInstanceOf[MLUserDataEncryptionModeString]

  @inline def values: js.Array[MLUserDataEncryptionModeString] = js.Array(DISABLED, `SSE-KMS`)
}

@js.native
sealed trait NodeType extends js.Any
object NodeType {
  val CRAWLER = "CRAWLER".asInstanceOf[NodeType]
  val JOB = "JOB".asInstanceOf[NodeType]
  val TRIGGER = "TRIGGER".asInstanceOf[NodeType]

  @inline def values: js.Array[NodeType] = js.Array(CRAWLER, JOB, TRIGGER)
}

@js.native
sealed trait PartitionIndexStatus extends js.Any
object PartitionIndexStatus {
  val CREATING = "CREATING".asInstanceOf[PartitionIndexStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[PartitionIndexStatus]
  val DELETING = "DELETING".asInstanceOf[PartitionIndexStatus]
  val FAILED = "FAILED".asInstanceOf[PartitionIndexStatus]

  @inline def values: js.Array[PartitionIndexStatus] = js.Array(CREATING, ACTIVE, DELETING, FAILED)
}

@js.native
sealed trait Permission extends js.Any
object Permission {
  val ALL = "ALL".asInstanceOf[Permission]
  val SELECT = "SELECT".asInstanceOf[Permission]
  val ALTER = "ALTER".asInstanceOf[Permission]
  val DROP = "DROP".asInstanceOf[Permission]
  val DELETE = "DELETE".asInstanceOf[Permission]
  val INSERT = "INSERT".asInstanceOf[Permission]
  val CREATE_DATABASE = "CREATE_DATABASE".asInstanceOf[Permission]
  val CREATE_TABLE = "CREATE_TABLE".asInstanceOf[Permission]
  val DATA_LOCATION_ACCESS = "DATA_LOCATION_ACCESS".asInstanceOf[Permission]

  @inline def values: js.Array[Permission] = js.Array(ALL, SELECT, ALTER, DROP, DELETE, INSERT, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
}

@js.native
sealed trait PrincipalType extends js.Any
object PrincipalType {
  val USER = "USER".asInstanceOf[PrincipalType]
  val ROLE = "ROLE".asInstanceOf[PrincipalType]
  val GROUP = "GROUP".asInstanceOf[PrincipalType]

  @inline def values: js.Array[PrincipalType] = js.Array(USER, ROLE, GROUP)
}

@js.native
sealed trait RecrawlBehavior extends js.Any
object RecrawlBehavior {
  val CRAWL_EVERYTHING = "CRAWL_EVERYTHING".asInstanceOf[RecrawlBehavior]
  val CRAWL_NEW_FOLDERS_ONLY = "CRAWL_NEW_FOLDERS_ONLY".asInstanceOf[RecrawlBehavior]
  val CRAWL_EVENT_MODE = "CRAWL_EVENT_MODE".asInstanceOf[RecrawlBehavior]

  @inline def values: js.Array[RecrawlBehavior] = js.Array(CRAWL_EVERYTHING, CRAWL_NEW_FOLDERS_ONLY, CRAWL_EVENT_MODE)
}

@js.native
sealed trait RegistryStatus extends js.Any
object RegistryStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[RegistryStatus]
  val DELETING = "DELETING".asInstanceOf[RegistryStatus]

  @inline def values: js.Array[RegistryStatus] = js.Array(AVAILABLE, DELETING)
}

@js.native
sealed trait ResourceShareType extends js.Any
object ResourceShareType {
  val FOREIGN = "FOREIGN".asInstanceOf[ResourceShareType]
  val ALL = "ALL".asInstanceOf[ResourceShareType]

  @inline def values: js.Array[ResourceShareType] = js.Array(FOREIGN, ALL)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val JAR = "JAR".asInstanceOf[ResourceType]
  val FILE = "FILE".asInstanceOf[ResourceType]
  val ARCHIVE = "ARCHIVE".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(JAR, FILE, ARCHIVE)
}

@js.native
sealed trait S3EncryptionMode extends js.Any
object S3EncryptionMode {
  val DISABLED = "DISABLED".asInstanceOf[S3EncryptionMode]
  val `SSE-KMS` = "SSE-KMS".asInstanceOf[S3EncryptionMode]
  val `SSE-S3` = "SSE-S3".asInstanceOf[S3EncryptionMode]

  @inline def values: js.Array[S3EncryptionMode] = js.Array(DISABLED, `SSE-KMS`, `SSE-S3`)
}

@js.native
sealed trait ScheduleState extends js.Any
object ScheduleState {
  val SCHEDULED = "SCHEDULED".asInstanceOf[ScheduleState]
  val NOT_SCHEDULED = "NOT_SCHEDULED".asInstanceOf[ScheduleState]
  val TRANSITIONING = "TRANSITIONING".asInstanceOf[ScheduleState]

  @inline def values: js.Array[ScheduleState] = js.Array(SCHEDULED, NOT_SCHEDULED, TRANSITIONING)
}

@js.native
sealed trait SchemaDiffType extends js.Any
object SchemaDiffType {
  val SYNTAX_DIFF = "SYNTAX_DIFF".asInstanceOf[SchemaDiffType]

  @inline def values: js.Array[SchemaDiffType] = js.Array(SYNTAX_DIFF)
}

@js.native
sealed trait SchemaStatus extends js.Any
object SchemaStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[SchemaStatus]
  val PENDING = "PENDING".asInstanceOf[SchemaStatus]
  val DELETING = "DELETING".asInstanceOf[SchemaStatus]

  @inline def values: js.Array[SchemaStatus] = js.Array(AVAILABLE, PENDING, DELETING)
}

@js.native
sealed trait SchemaVersionStatus extends js.Any
object SchemaVersionStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[SchemaVersionStatus]
  val PENDING = "PENDING".asInstanceOf[SchemaVersionStatus]
  val FAILURE = "FAILURE".asInstanceOf[SchemaVersionStatus]
  val DELETING = "DELETING".asInstanceOf[SchemaVersionStatus]

  @inline def values: js.Array[SchemaVersionStatus] = js.Array(AVAILABLE, PENDING, FAILURE, DELETING)
}

@js.native
sealed trait Sort extends js.Any
object Sort {
  val ASC = "ASC".asInstanceOf[Sort]
  val DESC = "DESC".asInstanceOf[Sort]

  @inline def values: js.Array[Sort] = js.Array(ASC, DESC)
}

@js.native
sealed trait SortDirectionType extends js.Any
object SortDirectionType {
  val DESCENDING = "DESCENDING".asInstanceOf[SortDirectionType]
  val ASCENDING = "ASCENDING".asInstanceOf[SortDirectionType]

  @inline def values: js.Array[SortDirectionType] = js.Array(DESCENDING, ASCENDING)
}

@js.native
sealed trait TaskRunSortColumnType extends js.Any
object TaskRunSortColumnType {
  val TASK_RUN_TYPE = "TASK_RUN_TYPE".asInstanceOf[TaskRunSortColumnType]
  val STATUS = "STATUS".asInstanceOf[TaskRunSortColumnType]
  val STARTED = "STARTED".asInstanceOf[TaskRunSortColumnType]

  @inline def values: js.Array[TaskRunSortColumnType] = js.Array(TASK_RUN_TYPE, STATUS, STARTED)
}

@js.native
sealed trait TaskStatusType extends js.Any
object TaskStatusType {
  val STARTING = "STARTING".asInstanceOf[TaskStatusType]
  val RUNNING = "RUNNING".asInstanceOf[TaskStatusType]
  val STOPPING = "STOPPING".asInstanceOf[TaskStatusType]
  val STOPPED = "STOPPED".asInstanceOf[TaskStatusType]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[TaskStatusType]
  val FAILED = "FAILED".asInstanceOf[TaskStatusType]
  val TIMEOUT = "TIMEOUT".asInstanceOf[TaskStatusType]

  @inline def values: js.Array[TaskStatusType] = js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT)
}

@js.native
sealed trait TaskType extends js.Any
object TaskType {
  val EVALUATION = "EVALUATION".asInstanceOf[TaskType]
  val LABELING_SET_GENERATION = "LABELING_SET_GENERATION".asInstanceOf[TaskType]
  val IMPORT_LABELS = "IMPORT_LABELS".asInstanceOf[TaskType]
  val EXPORT_LABELS = "EXPORT_LABELS".asInstanceOf[TaskType]
  val FIND_MATCHES = "FIND_MATCHES".asInstanceOf[TaskType]

  @inline def values: js.Array[TaskType] = js.Array(EVALUATION, LABELING_SET_GENERATION, IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES)
}

@js.native
sealed trait TransformSortColumnType extends js.Any
object TransformSortColumnType {
  val NAME = "NAME".asInstanceOf[TransformSortColumnType]
  val TRANSFORM_TYPE = "TRANSFORM_TYPE".asInstanceOf[TransformSortColumnType]
  val STATUS = "STATUS".asInstanceOf[TransformSortColumnType]
  val CREATED = "CREATED".asInstanceOf[TransformSortColumnType]
  val LAST_MODIFIED = "LAST_MODIFIED".asInstanceOf[TransformSortColumnType]

  @inline def values: js.Array[TransformSortColumnType] = js.Array(NAME, TRANSFORM_TYPE, STATUS, CREATED, LAST_MODIFIED)
}

@js.native
sealed trait TransformStatusType extends js.Any
object TransformStatusType {
  val NOT_READY = "NOT_READY".asInstanceOf[TransformStatusType]
  val READY = "READY".asInstanceOf[TransformStatusType]
  val DELETING = "DELETING".asInstanceOf[TransformStatusType]

  @inline def values: js.Array[TransformStatusType] = js.Array(NOT_READY, READY, DELETING)
}

@js.native
sealed trait TransformType extends js.Any
object TransformType {
  val FIND_MATCHES = "FIND_MATCHES".asInstanceOf[TransformType]

  @inline def values: js.Array[TransformType] = js.Array(FIND_MATCHES)
}

@js.native
sealed trait TriggerState extends js.Any
object TriggerState {
  val CREATING = "CREATING".asInstanceOf[TriggerState]
  val CREATED = "CREATED".asInstanceOf[TriggerState]
  val ACTIVATING = "ACTIVATING".asInstanceOf[TriggerState]
  val ACTIVATED = "ACTIVATED".asInstanceOf[TriggerState]
  val DEACTIVATING = "DEACTIVATING".asInstanceOf[TriggerState]
  val DEACTIVATED = "DEACTIVATED".asInstanceOf[TriggerState]
  val DELETING = "DELETING".asInstanceOf[TriggerState]
  val UPDATING = "UPDATING".asInstanceOf[TriggerState]

  @inline def values: js.Array[TriggerState] = js.Array(CREATING, CREATED, ACTIVATING, ACTIVATED, DEACTIVATING, DEACTIVATED, DELETING, UPDATING)
}

@js.native
sealed trait TriggerType extends js.Any
object TriggerType {
  val SCHEDULED = "SCHEDULED".asInstanceOf[TriggerType]
  val CONDITIONAL = "CONDITIONAL".asInstanceOf[TriggerType]
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[TriggerType]
  val EVENT = "EVENT".asInstanceOf[TriggerType]

  @inline def values: js.Array[TriggerType] = js.Array(SCHEDULED, CONDITIONAL, ON_DEMAND, EVENT)
}

@js.native
sealed trait UpdateBehavior extends js.Any
object UpdateBehavior {
  val LOG = "LOG".asInstanceOf[UpdateBehavior]
  val UPDATE_IN_DATABASE = "UPDATE_IN_DATABASE".asInstanceOf[UpdateBehavior]

  @inline def values: js.Array[UpdateBehavior] = js.Array(LOG, UPDATE_IN_DATABASE)
}

@js.native
sealed trait WorkerType extends js.Any
object WorkerType {
  val Standard = "Standard".asInstanceOf[WorkerType]
  val `G.1X` = "G.1X".asInstanceOf[WorkerType]
  val `G.2X` = "G.2X".asInstanceOf[WorkerType]

  @inline def values: js.Array[WorkerType] = js.Array(Standard, `G.1X`, `G.2X`)
}

@js.native
sealed trait WorkflowRunStatus extends js.Any
object WorkflowRunStatus {
  val RUNNING = "RUNNING".asInstanceOf[WorkflowRunStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[WorkflowRunStatus]
  val STOPPING = "STOPPING".asInstanceOf[WorkflowRunStatus]
  val STOPPED = "STOPPED".asInstanceOf[WorkflowRunStatus]
  val ERROR = "ERROR".asInstanceOf[WorkflowRunStatus]

  @inline def values: js.Array[WorkflowRunStatus] = js.Array(RUNNING, COMPLETED, STOPPING, STOPPED, ERROR)
}
