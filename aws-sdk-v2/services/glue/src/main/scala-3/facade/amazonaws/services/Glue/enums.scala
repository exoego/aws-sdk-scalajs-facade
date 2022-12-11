package facade.amazonaws.services.glue

import scalajs.js

type AggFunction = "avg" | "countDistinct" | "count" | "first" | "last" | "kurtosis" | "max" | "min" | "skewness" | "stddev_samp" | "stddev_pop" | "sum" | "sumDistinct" | "var_samp" | "var_pop"
object AggFunction {
  inline val avg: "avg" = "avg"
  inline val countDistinct: "countDistinct" = "countDistinct"
  inline val count: "count" = "count"
  inline val first: "first" = "first"
  inline val last: "last" = "last"
  inline val kurtosis: "kurtosis" = "kurtosis"
  inline val max: "max" = "max"
  inline val min: "min" = "min"
  inline val skewness: "skewness" = "skewness"
  inline val stddev_samp: "stddev_samp" = "stddev_samp"
  inline val stddev_pop: "stddev_pop" = "stddev_pop"
  inline val sum: "sum" = "sum"
  inline val sumDistinct: "sumDistinct" = "sumDistinct"
  inline val var_samp: "var_samp" = "var_samp"
  inline val var_pop: "var_pop" = "var_pop"

  inline def values: js.Array[AggFunction] = js.Array(avg, countDistinct, count, first, last, kurtosis, max, min, skewness, stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop)
}

type BackfillErrorCode = "ENCRYPTED_PARTITION_ERROR" | "INTERNAL_ERROR" | "INVALID_PARTITION_TYPE_DATA_ERROR" | "MISSING_PARTITION_VALUE_ERROR" | "UNSUPPORTED_PARTITION_CHARACTER_ERROR"
object BackfillErrorCode {
  inline val ENCRYPTED_PARTITION_ERROR: "ENCRYPTED_PARTITION_ERROR" = "ENCRYPTED_PARTITION_ERROR"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val INVALID_PARTITION_TYPE_DATA_ERROR: "INVALID_PARTITION_TYPE_DATA_ERROR" = "INVALID_PARTITION_TYPE_DATA_ERROR"
  inline val MISSING_PARTITION_VALUE_ERROR: "MISSING_PARTITION_VALUE_ERROR" = "MISSING_PARTITION_VALUE_ERROR"
  inline val UNSUPPORTED_PARTITION_CHARACTER_ERROR: "UNSUPPORTED_PARTITION_CHARACTER_ERROR" = "UNSUPPORTED_PARTITION_CHARACTER_ERROR"

  inline def values: js.Array[BackfillErrorCode] = js.Array(ENCRYPTED_PARTITION_ERROR, INTERNAL_ERROR, INVALID_PARTITION_TYPE_DATA_ERROR, MISSING_PARTITION_VALUE_ERROR, UNSUPPORTED_PARTITION_CHARACTER_ERROR)
}

type BlueprintRunState = "RUNNING" | "SUCCEEDED" | "FAILED" | "ROLLING_BACK"
object BlueprintRunState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val ROLLING_BACK: "ROLLING_BACK" = "ROLLING_BACK"

  inline def values: js.Array[BlueprintRunState] = js.Array(RUNNING, SUCCEEDED, FAILED, ROLLING_BACK)
}

type BlueprintStatus = "CREATING" | "ACTIVE" | "UPDATING" | "FAILED"
object BlueprintStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[BlueprintStatus] = js.Array(CREATING, ACTIVE, UPDATING, FAILED)
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

type CompressionType = "gzip" | "bzip2"
object CompressionType {
  inline val gzip: "gzip" = "gzip"
  inline val bzip2: "bzip2" = "bzip2"

  inline def values: js.Array[CompressionType] = js.Array(gzip, bzip2)
}

type ConnectionPropertyKey = "HOST" | "PORT" | "USERNAME" | "PASSWORD" | "ENCRYPTED_PASSWORD" | "JDBC_DRIVER_JAR_URI" | "JDBC_DRIVER_CLASS_NAME" | "JDBC_ENGINE" | "JDBC_ENGINE_VERSION" | "CONFIG_FILES" | "INSTANCE_ID" | "JDBC_CONNECTION_URL" | "JDBC_ENFORCE_SSL" | "CUSTOM_JDBC_CERT" | "SKIP_CUSTOM_JDBC_CERT_VALIDATION" | "CUSTOM_JDBC_CERT_STRING" | "CONNECTION_URL" | "KAFKA_BOOTSTRAP_SERVERS" | "KAFKA_SSL_ENABLED" | "KAFKA_CUSTOM_CERT" | "KAFKA_SKIP_CUSTOM_CERT_VALIDATION" | "KAFKA_CLIENT_KEYSTORE" | "KAFKA_CLIENT_KEYSTORE_PASSWORD" | "KAFKA_CLIENT_KEY_PASSWORD" | "ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD" | "ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD" | "SECRET_ID" | "CONNECTOR_URL" | "CONNECTOR_TYPE" | "CONNECTOR_CLASS_NAME"
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
  inline val KAFKA_CLIENT_KEYSTORE: "KAFKA_CLIENT_KEYSTORE" = "KAFKA_CLIENT_KEYSTORE"
  inline val KAFKA_CLIENT_KEYSTORE_PASSWORD: "KAFKA_CLIENT_KEYSTORE_PASSWORD" = "KAFKA_CLIENT_KEYSTORE_PASSWORD"
  inline val KAFKA_CLIENT_KEY_PASSWORD: "KAFKA_CLIENT_KEY_PASSWORD" = "KAFKA_CLIENT_KEY_PASSWORD"
  inline val ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD: "ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD" = "ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD"
  inline val ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD: "ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD" = "ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD"
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

type CrawlState = "RUNNING" | "CANCELLING" | "CANCELLED" | "SUCCEEDED" | "FAILED" | "ERROR"
object CrawlState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[CrawlState] = js.Array(RUNNING, CANCELLING, CANCELLED, SUCCEEDED, FAILED, ERROR)
}

type CrawlerHistoryState = "RUNNING" | "COMPLETED" | "FAILED" | "STOPPED"
object CrawlerHistoryState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[CrawlerHistoryState] = js.Array(RUNNING, COMPLETED, FAILED, STOPPED)
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

type DQStopJobOnFailureTiming = "Immediate" | "AfterDataLoad"
object DQStopJobOnFailureTiming {
  inline val Immediate: "Immediate" = "Immediate"
  inline val AfterDataLoad: "AfterDataLoad" = "AfterDataLoad"

  inline def values: js.Array[DQStopJobOnFailureTiming] = js.Array(Immediate, AfterDataLoad)
}

type DQTransformOutput = "PrimaryInput" | "EvaluationResults"
object DQTransformOutput {
  inline val PrimaryInput: "PrimaryInput" = "PrimaryInput"
  inline val EvaluationResults: "EvaluationResults" = "EvaluationResults"

  inline def values: js.Array[DQTransformOutput] = js.Array(PrimaryInput, EvaluationResults)
}

type DataFormat = "AVRO" | "JSON" | "PROTOBUF"
object DataFormat {
  inline val AVRO: "AVRO" = "AVRO"
  inline val JSON: "JSON" = "JSON"
  inline val PROTOBUF: "PROTOBUF" = "PROTOBUF"

  inline def values: js.Array[DataFormat] = js.Array(AVRO, JSON, PROTOBUF)
}

type DataQualityRuleResultStatus = "PASS" | "FAIL" | "ERROR"
object DataQualityRuleResultStatus {
  inline val PASS: "PASS" = "PASS"
  inline val FAIL: "FAIL" = "FAIL"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[DataQualityRuleResultStatus] = js.Array(PASS, FAIL, ERROR)
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

type ExecutionClass = "FLEX" | "STANDARD"
object ExecutionClass {
  inline val FLEX: "FLEX" = "FLEX"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[ExecutionClass] = js.Array(FLEX, STANDARD)
}

type ExistCondition = "MUST_EXIST" | "NOT_EXIST" | "NONE"
object ExistCondition {
  inline val MUST_EXIST: "MUST_EXIST" = "MUST_EXIST"
  inline val NOT_EXIST: "NOT_EXIST" = "NOT_EXIST"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ExistCondition] = js.Array(MUST_EXIST, NOT_EXIST, NONE)
}

type FieldName = "CRAWL_ID" | "STATE" | "START_TIME" | "END_TIME" | "DPU_HOUR"
object FieldName {
  inline val CRAWL_ID: "CRAWL_ID" = "CRAWL_ID"
  inline val STATE: "STATE" = "STATE"
  inline val START_TIME: "START_TIME" = "START_TIME"
  inline val END_TIME: "END_TIME" = "END_TIME"
  inline val DPU_HOUR: "DPU_HOUR" = "DPU_HOUR"

  inline def values: js.Array[FieldName] = js.Array(CRAWL_ID, STATE, START_TIME, END_TIME, DPU_HOUR)
}

type FilterLogicalOperator = "AND" | "OR"
object FilterLogicalOperator {
  inline val AND: "AND" = "AND"
  inline val OR: "OR" = "OR"

  inline def values: js.Array[FilterLogicalOperator] = js.Array(AND, OR)
}

type FilterOperation = "EQ" | "LT" | "GT" | "LTE" | "GTE" | "REGEX" | "ISNULL"
object FilterOperation {
  inline val EQ: "EQ" = "EQ"
  inline val LT: "LT" = "LT"
  inline val GT: "GT" = "GT"
  inline val LTE: "LTE" = "LTE"
  inline val GTE: "GTE" = "GTE"
  inline val REGEX: "REGEX" = "REGEX"
  inline val ISNULL: "ISNULL" = "ISNULL"

  inline def values: js.Array[FilterOperation] = js.Array(EQ, LT, GT, LTE, GTE, REGEX, ISNULL)
}

type FilterOperator = "GT" | "GE" | "LT" | "LE" | "EQ" | "NE"
object FilterOperator {
  inline val GT: "GT" = "GT"
  inline val GE: "GE" = "GE"
  inline val LT: "LT" = "LT"
  inline val LE: "LE" = "LE"
  inline val EQ: "EQ" = "EQ"
  inline val NE: "NE" = "NE"

  inline def values: js.Array[FilterOperator] = js.Array(GT, GE, LT, LE, EQ, NE)
}

type FilterValueType = "COLUMNEXTRACTED" | "CONSTANT"
object FilterValueType {
  inline val COLUMNEXTRACTED: "COLUMNEXTRACTED" = "COLUMNEXTRACTED"
  inline val CONSTANT: "CONSTANT" = "CONSTANT"

  inline def values: js.Array[FilterValueType] = js.Array(COLUMNEXTRACTED, CONSTANT)
}

type GlueRecordType = "DATE" | "STRING" | "TIMESTAMP" | "INT" | "FLOAT" | "LONG" | "BIGDECIMAL" | "BYTE" | "SHORT" | "DOUBLE"
object GlueRecordType {
  inline val DATE: "DATE" = "DATE"
  inline val STRING: "STRING" = "STRING"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"
  inline val INT: "INT" = "INT"
  inline val FLOAT: "FLOAT" = "FLOAT"
  inline val LONG: "LONG" = "LONG"
  inline val BIGDECIMAL: "BIGDECIMAL" = "BIGDECIMAL"
  inline val BYTE: "BYTE" = "BYTE"
  inline val SHORT: "SHORT" = "SHORT"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"

  inline def values: js.Array[GlueRecordType] = js.Array(DATE, STRING, TIMESTAMP, INT, FLOAT, LONG, BIGDECIMAL, BYTE, SHORT, DOUBLE)
}

type JDBCDataType = "ARRAY" | "BIGINT" | "BINARY" | "BIT" | "BLOB" | "BOOLEAN" | "CHAR" | "CLOB" | "DATALINK" | "DATE" | "DECIMAL" | "DISTINCT" | "DOUBLE" | "FLOAT" | "INTEGER" | "JAVA_OBJECT" | "LONGNVARCHAR" | "LONGVARBINARY" | "LONGVARCHAR" | "NCHAR" | "NCLOB" | "NULL" | "NUMERIC" | "NVARCHAR" | "OTHER" | "REAL" | "REF" | "REF_CURSOR" | "ROWID" | "SMALLINT" | "SQLXML" | "STRUCT" | "TIME" | "TIME_WITH_TIMEZONE" | "TIMESTAMP" | "TIMESTAMP_WITH_TIMEZONE" | "TINYINT" | "VARBINARY" | "VARCHAR"
object JDBCDataType {
  inline val ARRAY: "ARRAY" = "ARRAY"
  inline val BIGINT: "BIGINT" = "BIGINT"
  inline val BINARY: "BINARY" = "BINARY"
  inline val BIT: "BIT" = "BIT"
  inline val BLOB: "BLOB" = "BLOB"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val CHAR: "CHAR" = "CHAR"
  inline val CLOB: "CLOB" = "CLOB"
  inline val DATALINK: "DATALINK" = "DATALINK"
  inline val DATE: "DATE" = "DATE"
  inline val DECIMAL: "DECIMAL" = "DECIMAL"
  inline val DISTINCT: "DISTINCT" = "DISTINCT"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val FLOAT: "FLOAT" = "FLOAT"
  inline val INTEGER: "INTEGER" = "INTEGER"
  inline val JAVA_OBJECT: "JAVA_OBJECT" = "JAVA_OBJECT"
  inline val LONGNVARCHAR: "LONGNVARCHAR" = "LONGNVARCHAR"
  inline val LONGVARBINARY: "LONGVARBINARY" = "LONGVARBINARY"
  inline val LONGVARCHAR: "LONGVARCHAR" = "LONGVARCHAR"
  inline val NCHAR: "NCHAR" = "NCHAR"
  inline val NCLOB: "NCLOB" = "NCLOB"
  inline val NULL: "NULL" = "NULL"
  inline val NUMERIC: "NUMERIC" = "NUMERIC"
  inline val NVARCHAR: "NVARCHAR" = "NVARCHAR"
  inline val OTHER: "OTHER" = "OTHER"
  inline val REAL: "REAL" = "REAL"
  inline val REF: "REF" = "REF"
  inline val REF_CURSOR: "REF_CURSOR" = "REF_CURSOR"
  inline val ROWID: "ROWID" = "ROWID"
  inline val SMALLINT: "SMALLINT" = "SMALLINT"
  inline val SQLXML: "SQLXML" = "SQLXML"
  inline val STRUCT: "STRUCT" = "STRUCT"
  inline val TIME: "TIME" = "TIME"
  inline val TIME_WITH_TIMEZONE: "TIME_WITH_TIMEZONE" = "TIME_WITH_TIMEZONE"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"
  inline val TIMESTAMP_WITH_TIMEZONE: "TIMESTAMP_WITH_TIMEZONE" = "TIMESTAMP_WITH_TIMEZONE"
  inline val TINYINT: "TINYINT" = "TINYINT"
  inline val VARBINARY: "VARBINARY" = "VARBINARY"
  inline val VARCHAR: "VARCHAR" = "VARCHAR"

  inline def values: js.Array[JDBCDataType] = js.Array(
    ARRAY,
    BIGINT,
    BINARY,
    BIT,
    BLOB,
    BOOLEAN,
    CHAR,
    CLOB,
    DATALINK,
    DATE,
    DECIMAL,
    DISTINCT,
    DOUBLE,
    FLOAT,
    INTEGER,
    JAVA_OBJECT,
    LONGNVARCHAR,
    LONGVARBINARY,
    LONGVARCHAR,
    NCHAR,
    NCLOB,
    NULL,
    NUMERIC,
    NVARCHAR,
    OTHER,
    REAL,
    REF,
    REF_CURSOR,
    ROWID,
    SMALLINT,
    SQLXML,
    STRUCT,
    TIME,
    TIME_WITH_TIMEZONE,
    TIMESTAMP,
    TIMESTAMP_WITH_TIMEZONE,
    TINYINT,
    VARBINARY,
    VARCHAR
  )
}

type JdbcMetadataEntry = "COMMENTS" | "RAWTYPES"
object JdbcMetadataEntry {
  inline val COMMENTS: "COMMENTS" = "COMMENTS"
  inline val RAWTYPES: "RAWTYPES" = "RAWTYPES"

  inline def values: js.Array[JdbcMetadataEntry] = js.Array(COMMENTS, RAWTYPES)
}

type JobBookmarksEncryptionMode = "DISABLED" | "CSE-KMS"
object JobBookmarksEncryptionMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val `CSE-KMS`: "CSE-KMS" = "CSE-KMS"

  inline def values: js.Array[JobBookmarksEncryptionMode] = js.Array(DISABLED, `CSE-KMS`)
}

type JobRunState = "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT" | "ERROR" | "WAITING"
object JobRunState {
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMEOUT: "TIMEOUT" = "TIMEOUT"
  inline val ERROR: "ERROR" = "ERROR"
  inline val WAITING: "WAITING" = "WAITING"

  inline def values: js.Array[JobRunState] = js.Array(STARTING, RUNNING, STOPPING, STOPPED, SUCCEEDED, FAILED, TIMEOUT, ERROR, WAITING)
}

type JoinType = "equijoin" | "left" | "right" | "outer" | "leftsemi" | "leftanti"
object JoinType {
  inline val equijoin: "equijoin" = "equijoin"
  inline val left: "left" = "left"
  inline val right: "right" = "right"
  inline val outer: "outer" = "outer"
  inline val leftsemi: "leftsemi" = "leftsemi"
  inline val leftanti: "leftanti" = "leftanti"

  inline def values: js.Array[JoinType] = js.Array(equijoin, left, right, outer, leftsemi, leftanti)
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

type ParamType = "str" | "int" | "float" | "complex" | "bool" | "list" | "null"
object ParamType {
  inline val str: "str" = "str"
  inline val int: "int" = "int"
  inline val float: "float" = "float"
  inline val complex: "complex" = "complex"
  inline val bool: "bool" = "bool"
  inline val list: "list" = "list"
  inline val `null`: "null" = "null"

  inline def values: js.Array[ParamType] = js.Array(str, int, float, complex, bool, list, `null`)
}

type ParquetCompressionType = "snappy" | "lzo" | "gzip" | "uncompressed" | "none"
object ParquetCompressionType {
  inline val snappy: "snappy" = "snappy"
  inline val lzo: "lzo" = "lzo"
  inline val gzip: "gzip" = "gzip"
  inline val uncompressed: "uncompressed" = "uncompressed"
  inline val none: "none" = "none"

  inline def values: js.Array[ParquetCompressionType] = js.Array(snappy, lzo, gzip, uncompressed, none)
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

type PermissionType = "COLUMN_PERMISSION" | "CELL_FILTER_PERMISSION"
object PermissionType {
  inline val COLUMN_PERMISSION: "COLUMN_PERMISSION" = "COLUMN_PERMISSION"
  inline val CELL_FILTER_PERMISSION: "CELL_FILTER_PERMISSION" = "CELL_FILTER_PERMISSION"

  inline def values: js.Array[PermissionType] = js.Array(COLUMN_PERMISSION, CELL_FILTER_PERMISSION)
}

type PiiType = "RowAudit" | "RowMasking" | "ColumnAudit" | "ColumnMasking"
object PiiType {
  inline val RowAudit: "RowAudit" = "RowAudit"
  inline val RowMasking: "RowMasking" = "RowMasking"
  inline val ColumnAudit: "ColumnAudit" = "ColumnAudit"
  inline val ColumnMasking: "ColumnMasking" = "ColumnMasking"

  inline def values: js.Array[PiiType] = js.Array(RowAudit, RowMasking, ColumnAudit, ColumnMasking)
}

type PrincipalType = "USER" | "ROLE" | "GROUP"
object PrincipalType {
  inline val USER: "USER" = "USER"
  inline val ROLE: "ROLE" = "ROLE"
  inline val GROUP: "GROUP" = "GROUP"

  inline def values: js.Array[PrincipalType] = js.Array(USER, ROLE, GROUP)
}

type QuoteChar = "quote" | "quillemet" | "single_quote" | "disabled"
object QuoteChar {
  inline val quote: "quote" = "quote"
  inline val quillemet: "quillemet" = "quillemet"
  inline val single_quote: "single_quote" = "single_quote"
  inline val disabled: "disabled" = "disabled"

  inline def values: js.Array[QuoteChar] = js.Array(quote, quillemet, single_quote, disabled)
}

type RecrawlBehavior = "CRAWL_EVERYTHING" | "CRAWL_NEW_FOLDERS_ONLY" | "CRAWL_EVENT_MODE"
object RecrawlBehavior {
  inline val CRAWL_EVERYTHING: "CRAWL_EVERYTHING" = "CRAWL_EVERYTHING"
  inline val CRAWL_NEW_FOLDERS_ONLY: "CRAWL_NEW_FOLDERS_ONLY" = "CRAWL_NEW_FOLDERS_ONLY"
  inline val CRAWL_EVENT_MODE: "CRAWL_EVENT_MODE" = "CRAWL_EVENT_MODE"

  inline def values: js.Array[RecrawlBehavior] = js.Array(CRAWL_EVERYTHING, CRAWL_NEW_FOLDERS_ONLY, CRAWL_EVENT_MODE)
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

type Separator = "comma" | "ctrla" | "pipe" | "semicolon" | "tab"
object Separator {
  inline val comma: "comma" = "comma"
  inline val ctrla: "ctrla" = "ctrla"
  inline val pipe: "pipe" = "pipe"
  inline val semicolon: "semicolon" = "semicolon"
  inline val tab: "tab" = "tab"

  inline def values: js.Array[Separator] = js.Array(comma, ctrla, pipe, semicolon, tab)
}

type SessionStatus = "PROVISIONING" | "READY" | "FAILED" | "TIMEOUT" | "STOPPING" | "STOPPED"
object SessionStatus {
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val READY: "READY" = "READY"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMEOUT: "TIMEOUT" = "TIMEOUT"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[SessionStatus] = js.Array(PROVISIONING, READY, FAILED, TIMEOUT, STOPPING, STOPPED)
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

type SourceControlAuthStrategy = "PERSONAL_ACCESS_TOKEN" | "AWS_SECRETS_MANAGER"
object SourceControlAuthStrategy {
  inline val PERSONAL_ACCESS_TOKEN: "PERSONAL_ACCESS_TOKEN" = "PERSONAL_ACCESS_TOKEN"
  inline val AWS_SECRETS_MANAGER: "AWS_SECRETS_MANAGER" = "AWS_SECRETS_MANAGER"

  inline def values: js.Array[SourceControlAuthStrategy] = js.Array(PERSONAL_ACCESS_TOKEN, AWS_SECRETS_MANAGER)
}

type SourceControlProvider = "GITHUB" | "AWS_CODE_COMMIT"
object SourceControlProvider {
  inline val GITHUB: "GITHUB" = "GITHUB"
  inline val AWS_CODE_COMMIT: "AWS_CODE_COMMIT" = "AWS_CODE_COMMIT"

  inline def values: js.Array[SourceControlProvider] = js.Array(GITHUB, AWS_CODE_COMMIT)
}

type StartingPosition = "latest" | "trim_horizon" | "earliest"
object StartingPosition {
  inline val latest: "latest" = "latest"
  inline val trim_horizon: "trim_horizon" = "trim_horizon"
  inline val earliest: "earliest" = "earliest"

  inline def values: js.Array[StartingPosition] = js.Array(latest, trim_horizon, earliest)
}

type StatementState = "WAITING" | "RUNNING" | "AVAILABLE" | "CANCELLING" | "CANCELLED" | "ERROR"
object StatementState {
  inline val WAITING: "WAITING" = "WAITING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[StatementState] = js.Array(WAITING, RUNNING, AVAILABLE, CANCELLING, CANCELLED, ERROR)
}

type TargetFormat = "json" | "csv" | "avro" | "orc" | "parquet"
object TargetFormat {
  inline val json: "json" = "json"
  inline val csv: "csv" = "csv"
  inline val avro: "avro" = "avro"
  inline val orc: "orc" = "orc"
  inline val parquet: "parquet" = "parquet"

  inline def values: js.Array[TargetFormat] = js.Array(json, csv, avro, orc, parquet)
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

type TriggerType = "SCHEDULED" | "CONDITIONAL" | "ON_DEMAND" | "EVENT"
object TriggerType {
  inline val SCHEDULED: "SCHEDULED" = "SCHEDULED"
  inline val CONDITIONAL: "CONDITIONAL" = "CONDITIONAL"
  inline val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  inline val EVENT: "EVENT" = "EVENT"

  inline def values: js.Array[TriggerType] = js.Array(SCHEDULED, CONDITIONAL, ON_DEMAND, EVENT)
}

type UnionType = "ALL" | "DISTINCT"
object UnionType {
  inline val ALL: "ALL" = "ALL"
  inline val DISTINCT: "DISTINCT" = "DISTINCT"

  inline def values: js.Array[UnionType] = js.Array(ALL, DISTINCT)
}

type UpdateBehavior = "LOG" | "UPDATE_IN_DATABASE"
object UpdateBehavior {
  inline val LOG: "LOG" = "LOG"
  inline val UPDATE_IN_DATABASE: "UPDATE_IN_DATABASE" = "UPDATE_IN_DATABASE"

  inline def values: js.Array[UpdateBehavior] = js.Array(LOG, UPDATE_IN_DATABASE)
}

type UpdateCatalogBehavior = "UPDATE_IN_DATABASE" | "LOG"
object UpdateCatalogBehavior {
  inline val UPDATE_IN_DATABASE: "UPDATE_IN_DATABASE" = "UPDATE_IN_DATABASE"
  inline val LOG: "LOG" = "LOG"

  inline def values: js.Array[UpdateCatalogBehavior] = js.Array(UPDATE_IN_DATABASE, LOG)
}

type WorkerType = "Standard" | "G.1X" | "G.2X" | "G.025X"
object WorkerType {
  inline val Standard: "Standard" = "Standard"
  inline val `G.1X`: "G.1X" = "G.1X"
  inline val `G.2X`: "G.2X" = "G.2X"
  inline val `G.025X`: "G.025X" = "G.025X"

  inline def values: js.Array[WorkerType] = js.Array(Standard, `G.1X`, `G.2X`, `G.025X`)
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
