package facade.amazonaws.services.timestreamquery

import scalajs.js

@js.native
sealed trait DimensionValueType extends js.Any
object DimensionValueType {
  val VARCHAR = "VARCHAR".asInstanceOf[DimensionValueType]

  @inline def values: js.Array[DimensionValueType] = js.Array(VARCHAR)
}

@js.native
sealed trait MeasureValueType extends js.Any
object MeasureValueType {
  val BIGINT = "BIGINT".asInstanceOf[MeasureValueType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[MeasureValueType]
  val DOUBLE = "DOUBLE".asInstanceOf[MeasureValueType]
  val VARCHAR = "VARCHAR".asInstanceOf[MeasureValueType]
  val MULTI = "MULTI".asInstanceOf[MeasureValueType]

  @inline def values: js.Array[MeasureValueType] = js.Array(BIGINT, BOOLEAN, DOUBLE, VARCHAR, MULTI)
}

@js.native
sealed trait S3EncryptionOption extends js.Any
object S3EncryptionOption {
  val SSE_S3 = "SSE_S3".asInstanceOf[S3EncryptionOption]
  val SSE_KMS = "SSE_KMS".asInstanceOf[S3EncryptionOption]

  @inline def values: js.Array[S3EncryptionOption] = js.Array(SSE_S3, SSE_KMS)
}

@js.native
sealed trait ScalarMeasureValueType extends js.Any
object ScalarMeasureValueType {
  val BIGINT = "BIGINT".asInstanceOf[ScalarMeasureValueType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[ScalarMeasureValueType]
  val DOUBLE = "DOUBLE".asInstanceOf[ScalarMeasureValueType]
  val VARCHAR = "VARCHAR".asInstanceOf[ScalarMeasureValueType]

  @inline def values: js.Array[ScalarMeasureValueType] = js.Array(BIGINT, BOOLEAN, DOUBLE, VARCHAR)
}

@js.native
sealed trait ScalarType extends js.Any
object ScalarType {
  val VARCHAR = "VARCHAR".asInstanceOf[ScalarType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[ScalarType]
  val BIGINT = "BIGINT".asInstanceOf[ScalarType]
  val DOUBLE = "DOUBLE".asInstanceOf[ScalarType]
  val TIMESTAMP = "TIMESTAMP".asInstanceOf[ScalarType]
  val DATE = "DATE".asInstanceOf[ScalarType]
  val TIME = "TIME".asInstanceOf[ScalarType]
  val INTERVAL_DAY_TO_SECOND = "INTERVAL_DAY_TO_SECOND".asInstanceOf[ScalarType]
  val INTERVAL_YEAR_TO_MONTH = "INTERVAL_YEAR_TO_MONTH".asInstanceOf[ScalarType]
  val UNKNOWN = "UNKNOWN".asInstanceOf[ScalarType]
  val INTEGER = "INTEGER".asInstanceOf[ScalarType]

  @inline def values: js.Array[ScalarType] = js.Array(VARCHAR, BOOLEAN, BIGINT, DOUBLE, TIMESTAMP, DATE, TIME, INTERVAL_DAY_TO_SECOND, INTERVAL_YEAR_TO_MONTH, UNKNOWN, INTEGER)
}

@js.native
sealed trait ScheduledQueryRunStatus extends js.Any
object ScheduledQueryRunStatus {
  val AUTO_TRIGGER_SUCCESS = "AUTO_TRIGGER_SUCCESS".asInstanceOf[ScheduledQueryRunStatus]
  val AUTO_TRIGGER_FAILURE = "AUTO_TRIGGER_FAILURE".asInstanceOf[ScheduledQueryRunStatus]
  val MANUAL_TRIGGER_SUCCESS = "MANUAL_TRIGGER_SUCCESS".asInstanceOf[ScheduledQueryRunStatus]
  val MANUAL_TRIGGER_FAILURE = "MANUAL_TRIGGER_FAILURE".asInstanceOf[ScheduledQueryRunStatus]

  @inline def values: js.Array[ScheduledQueryRunStatus] = js.Array(AUTO_TRIGGER_SUCCESS, AUTO_TRIGGER_FAILURE, MANUAL_TRIGGER_SUCCESS, MANUAL_TRIGGER_FAILURE)
}

@js.native
sealed trait ScheduledQueryState extends js.Any
object ScheduledQueryState {
  val ENABLED = "ENABLED".asInstanceOf[ScheduledQueryState]
  val DISABLED = "DISABLED".asInstanceOf[ScheduledQueryState]

  @inline def values: js.Array[ScheduledQueryState] = js.Array(ENABLED, DISABLED)
}
