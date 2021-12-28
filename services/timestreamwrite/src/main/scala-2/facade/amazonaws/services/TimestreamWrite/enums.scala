package facade.amazonaws.services.timestreamwrite

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait DimensionValueType extends js.Any
object DimensionValueType {
  val VARCHAR = "VARCHAR".asInstanceOf[DimensionValueType]

  @inline def values = js.Array(VARCHAR)
}

@js.native
sealed trait MeasureValueType extends js.Any
object MeasureValueType {
  val DOUBLE = "DOUBLE".asInstanceOf[MeasureValueType]
  val BIGINT = "BIGINT".asInstanceOf[MeasureValueType]
  val VARCHAR = "VARCHAR".asInstanceOf[MeasureValueType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[MeasureValueType]

  @inline def values = js.Array(DOUBLE, BIGINT, VARCHAR, BOOLEAN)
}

@js.native
sealed trait TableStatus extends js.Any
object TableStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[TableStatus]
  val DELETING = "DELETING".asInstanceOf[TableStatus]

  @inline def values = js.Array(ACTIVE, DELETING)
}

@js.native
sealed trait TimeUnit extends js.Any
object TimeUnit {
  val MILLISECONDS = "MILLISECONDS".asInstanceOf[TimeUnit]
  val SECONDS = "SECONDS".asInstanceOf[TimeUnit]
  val MICROSECONDS = "MICROSECONDS".asInstanceOf[TimeUnit]
  val NANOSECONDS = "NANOSECONDS".asInstanceOf[TimeUnit]

  @inline def values = js.Array(MILLISECONDS, SECONDS, MICROSECONDS, NANOSECONDS)
}
