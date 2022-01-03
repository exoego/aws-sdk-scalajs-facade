package facade.amazonaws.services.finspacedata

import scalajs.js

/** Indicates how the given change will be applied to the dataset.
  */
type ChangeType = "REPLACE" | "APPEND" | "MODIFY"
object ChangeType {
  inline val REPLACE: "REPLACE" = "REPLACE"
  inline val APPEND: "APPEND" = "APPEND"
  inline val MODIFY: "MODIFY" = "MODIFY"

  inline def values: js.Array[ChangeType] = js.Array(REPLACE, APPEND, MODIFY)
}

/** Data type of a column.
  */
type ColumnDataType = "STRING" | "CHAR" | "INTEGER" | "TINYINT" | "SMALLINT" | "BIGINT" | "FLOAT" | "DOUBLE" | "DATE" | "DATETIME" | "BOOLEAN" | "BINARY"
object ColumnDataType {
  inline val STRING: "STRING" = "STRING"
  inline val CHAR: "CHAR" = "CHAR"
  inline val INTEGER: "INTEGER" = "INTEGER"
  inline val TINYINT: "TINYINT" = "TINYINT"
  inline val SMALLINT: "SMALLINT" = "SMALLINT"
  inline val BIGINT: "BIGINT" = "BIGINT"
  inline val FLOAT: "FLOAT" = "FLOAT"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val DATE: "DATE" = "DATE"
  inline val DATETIME: "DATETIME" = "DATETIME"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val BINARY: "BINARY" = "BINARY"

  inline def values: js.Array[ColumnDataType] = js.Array(STRING, CHAR, INTEGER, TINYINT, SMALLINT, BIGINT, FLOAT, DOUBLE, DATE, DATETIME, BOOLEAN, BINARY)
}

/** Status of a DataView
  */
type DataViewStatus = "RUNNING" | "STARTING" | "FAILED" | "CANCELLED" | "TIMEOUT" | "SUCCESS" | "PENDING" | "FAILED_CLEANUP_FAILED"
object DataViewStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val TIMEOUT: "TIMEOUT" = "TIMEOUT"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILED_CLEANUP_FAILED: "FAILED_CLEANUP_FAILED" = "FAILED_CLEANUP_FAILED"

  inline def values: js.Array[DataViewStatus] = js.Array(RUNNING, STARTING, FAILED, CANCELLED, TIMEOUT, SUCCESS, PENDING, FAILED_CLEANUP_FAILED)
}

/** Dataset Kind
  */
type DatasetKind = "TABULAR" | "NON_TABULAR"
object DatasetKind {
  inline val TABULAR: "TABULAR" = "TABULAR"
  inline val NON_TABULAR: "NON_TABULAR" = "NON_TABULAR"

  inline def values: js.Array[DatasetKind] = js.Array(TABULAR, NON_TABULAR)
}

/** Status of the dataset process returned from scheduler service.
  */
type DatasetStatus = "PENDING" | "FAILED" | "SUCCESS" | "RUNNING"
object DatasetStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val RUNNING: "RUNNING" = "RUNNING"

  inline def values: js.Array[DatasetStatus] = js.Array(PENDING, FAILED, SUCCESS, RUNNING)
}

/** Changeset Error Category
  */
type ErrorCategory = "VALIDATION" | "SERVICE_QUOTA_EXCEEDED" | "ACCESS_DENIED" | "RESOURCE_NOT_FOUND" | "THROTTLING" | "INTERNAL_SERVICE_EXCEPTION" | "CANCELLED" | "USER_RECOVERABLE"
object ErrorCategory {
  inline val VALIDATION: "VALIDATION" = "VALIDATION"
  inline val SERVICE_QUOTA_EXCEEDED: "SERVICE_QUOTA_EXCEEDED" = "SERVICE_QUOTA_EXCEEDED"
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val RESOURCE_NOT_FOUND: "RESOURCE_NOT_FOUND" = "RESOURCE_NOT_FOUND"
  inline val THROTTLING: "THROTTLING" = "THROTTLING"
  inline val INTERNAL_SERVICE_EXCEPTION: "INTERNAL_SERVICE_EXCEPTION" = "INTERNAL_SERVICE_EXCEPTION"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val USER_RECOVERABLE: "USER_RECOVERABLE" = "USER_RECOVERABLE"

  inline def values: js.Array[ErrorCategory] = js.Array(VALIDATION, SERVICE_QUOTA_EXCEEDED, ACCESS_DENIED, RESOURCE_NOT_FOUND, THROTTLING, INTERNAL_SERVICE_EXCEPTION, CANCELLED, USER_RECOVERABLE)
}

/** Data View Export File Format
  */
type ExportFileFormat = "PARQUET" | "DELIMITED_TEXT"
object ExportFileFormat {
  inline val PARQUET: "PARQUET" = "PARQUET"
  inline val DELIMITED_TEXT: "DELIMITED_TEXT" = "DELIMITED_TEXT"

  inline def values: js.Array[ExportFileFormat] = js.Array(PARQUET, DELIMITED_TEXT)
}

/** Status of the ingestion process returned from scheduler service.
  */
type IngestionStatus = "PENDING" | "FAILED" | "SUCCESS" | "RUNNING" | "STOP_REQUESTED"
object IngestionStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOP_REQUESTED: "STOP_REQUESTED" = "STOP_REQUESTED"

  inline def values: js.Array[IngestionStatus] = js.Array(PENDING, FAILED, SUCCESS, RUNNING, STOP_REQUESTED)
}

type locationType = "INGESTION" | "SAGEMAKER"
object locationType {
  inline val INGESTION: "INGESTION" = "INGESTION"
  inline val SAGEMAKER: "SAGEMAKER" = "SAGEMAKER"

  inline def values: js.Array[locationType] = js.Array(INGESTION, SAGEMAKER)
}
