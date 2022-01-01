package facade.amazonaws.services.timestreamwrite

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
  val DOUBLE = "DOUBLE".asInstanceOf[MeasureValueType]
  val BIGINT = "BIGINT".asInstanceOf[MeasureValueType]
  val VARCHAR = "VARCHAR".asInstanceOf[MeasureValueType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[MeasureValueType]
  val TIMESTAMP = "TIMESTAMP".asInstanceOf[MeasureValueType]
  val MULTI = "MULTI".asInstanceOf[MeasureValueType]

  @inline def values: js.Array[MeasureValueType] = js.Array(DOUBLE, BIGINT, VARCHAR, BOOLEAN, TIMESTAMP, MULTI)
}

@js.native
sealed trait S3EncryptionOption extends js.Any
object S3EncryptionOption {
  val SSE_S3 = "SSE_S3".asInstanceOf[S3EncryptionOption]
  val SSE_KMS = "SSE_KMS".asInstanceOf[S3EncryptionOption]

  @inline def values: js.Array[S3EncryptionOption] = js.Array(SSE_S3, SSE_KMS)
}

@js.native
sealed trait TableStatus extends js.Any
object TableStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[TableStatus]
  val DELETING = "DELETING".asInstanceOf[TableStatus]

  @inline def values: js.Array[TableStatus] = js.Array(ACTIVE, DELETING)
}

@js.native
sealed trait TimeUnit extends js.Any
object TimeUnit {
  val MILLISECONDS = "MILLISECONDS".asInstanceOf[TimeUnit]
  val SECONDS = "SECONDS".asInstanceOf[TimeUnit]
  val MICROSECONDS = "MICROSECONDS".asInstanceOf[TimeUnit]
  val NANOSECONDS = "NANOSECONDS".asInstanceOf[TimeUnit]

  @inline def values: js.Array[TimeUnit] = js.Array(MILLISECONDS, SECONDS, MICROSECONDS, NANOSECONDS)
}
