package facade.amazonaws.services.finspacedata

import scalajs.js

/** Indicates how the given change will be applied to the dataset.
  */
@js.native
sealed trait ChangeType extends js.Any
object ChangeType {
  val REPLACE = "REPLACE".asInstanceOf[ChangeType]
  val APPEND = "APPEND".asInstanceOf[ChangeType]
  val MODIFY = "MODIFY".asInstanceOf[ChangeType]

  @inline def values: js.Array[ChangeType] = js.Array(REPLACE, APPEND, MODIFY)
}

/** Data type of a column.
  */
@js.native
sealed trait ColumnDataType extends js.Any
object ColumnDataType {
  val STRING = "STRING".asInstanceOf[ColumnDataType]
  val CHAR = "CHAR".asInstanceOf[ColumnDataType]
  val INTEGER = "INTEGER".asInstanceOf[ColumnDataType]
  val TINYINT = "TINYINT".asInstanceOf[ColumnDataType]
  val SMALLINT = "SMALLINT".asInstanceOf[ColumnDataType]
  val BIGINT = "BIGINT".asInstanceOf[ColumnDataType]
  val FLOAT = "FLOAT".asInstanceOf[ColumnDataType]
  val DOUBLE = "DOUBLE".asInstanceOf[ColumnDataType]
  val DATE = "DATE".asInstanceOf[ColumnDataType]
  val DATETIME = "DATETIME".asInstanceOf[ColumnDataType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[ColumnDataType]
  val BINARY = "BINARY".asInstanceOf[ColumnDataType]

  @inline def values: js.Array[ColumnDataType] = js.Array(STRING, CHAR, INTEGER, TINYINT, SMALLINT, BIGINT, FLOAT, DOUBLE, DATE, DATETIME, BOOLEAN, BINARY)
}

/** Status of a DataView
  */
@js.native
sealed trait DataViewStatus extends js.Any
object DataViewStatus {
  val RUNNING = "RUNNING".asInstanceOf[DataViewStatus]
  val STARTING = "STARTING".asInstanceOf[DataViewStatus]
  val FAILED = "FAILED".asInstanceOf[DataViewStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[DataViewStatus]
  val TIMEOUT = "TIMEOUT".asInstanceOf[DataViewStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[DataViewStatus]
  val PENDING = "PENDING".asInstanceOf[DataViewStatus]
  val FAILED_CLEANUP_FAILED = "FAILED_CLEANUP_FAILED".asInstanceOf[DataViewStatus]

  @inline def values: js.Array[DataViewStatus] = js.Array(RUNNING, STARTING, FAILED, CANCELLED, TIMEOUT, SUCCESS, PENDING, FAILED_CLEANUP_FAILED)
}

/** Dataset Kind
  */
@js.native
sealed trait DatasetKind extends js.Any
object DatasetKind {
  val TABULAR = "TABULAR".asInstanceOf[DatasetKind]
  val NON_TABULAR = "NON_TABULAR".asInstanceOf[DatasetKind]

  @inline def values: js.Array[DatasetKind] = js.Array(TABULAR, NON_TABULAR)
}

/** Status of the dataset process returned from scheduler service.
  */
@js.native
sealed trait DatasetStatus extends js.Any
object DatasetStatus {
  val PENDING = "PENDING".asInstanceOf[DatasetStatus]
  val FAILED = "FAILED".asInstanceOf[DatasetStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[DatasetStatus]
  val RUNNING = "RUNNING".asInstanceOf[DatasetStatus]

  @inline def values: js.Array[DatasetStatus] = js.Array(PENDING, FAILED, SUCCESS, RUNNING)
}

/** Changeset Error Category
  */
@js.native
sealed trait ErrorCategory extends js.Any
object ErrorCategory {
  val VALIDATION = "VALIDATION".asInstanceOf[ErrorCategory]
  val SERVICE_QUOTA_EXCEEDED = "SERVICE_QUOTA_EXCEEDED".asInstanceOf[ErrorCategory]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ErrorCategory]
  val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND".asInstanceOf[ErrorCategory]
  val THROTTLING = "THROTTLING".asInstanceOf[ErrorCategory]
  val INTERNAL_SERVICE_EXCEPTION = "INTERNAL_SERVICE_EXCEPTION".asInstanceOf[ErrorCategory]
  val CANCELLED = "CANCELLED".asInstanceOf[ErrorCategory]
  val USER_RECOVERABLE = "USER_RECOVERABLE".asInstanceOf[ErrorCategory]

  @inline def values: js.Array[ErrorCategory] = js.Array(VALIDATION, SERVICE_QUOTA_EXCEEDED, ACCESS_DENIED, RESOURCE_NOT_FOUND, THROTTLING, INTERNAL_SERVICE_EXCEPTION, CANCELLED, USER_RECOVERABLE)
}

/** Data View Export File Format
  */
@js.native
sealed trait ExportFileFormat extends js.Any
object ExportFileFormat {
  val PARQUET = "PARQUET".asInstanceOf[ExportFileFormat]
  val DELIMITED_TEXT = "DELIMITED_TEXT".asInstanceOf[ExportFileFormat]

  @inline def values: js.Array[ExportFileFormat] = js.Array(PARQUET, DELIMITED_TEXT)
}

/** Status of the ingestion process returned from scheduler service.
  */
@js.native
sealed trait IngestionStatus extends js.Any
object IngestionStatus {
  val PENDING = "PENDING".asInstanceOf[IngestionStatus]
  val FAILED = "FAILED".asInstanceOf[IngestionStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[IngestionStatus]
  val RUNNING = "RUNNING".asInstanceOf[IngestionStatus]
  val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[IngestionStatus]

  @inline def values: js.Array[IngestionStatus] = js.Array(PENDING, FAILED, SUCCESS, RUNNING, STOP_REQUESTED)
}

@js.native
sealed trait locationType extends js.Any
object locationType {
  val INGESTION = "INGESTION".asInstanceOf[locationType]
  val SAGEMAKER = "SAGEMAKER".asInstanceOf[locationType]

  @inline def values: js.Array[locationType] = js.Array(INGESTION, SAGEMAKER)
}
