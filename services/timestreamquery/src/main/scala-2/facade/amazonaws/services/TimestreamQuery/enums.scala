package facade.amazonaws.services.timestreamquery

import scalajs._
import scala.scalajs.js.|

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

  @inline def values = js.Array(VARCHAR, BOOLEAN, BIGINT, DOUBLE, TIMESTAMP, DATE, TIME, INTERVAL_DAY_TO_SECOND, INTERVAL_YEAR_TO_MONTH, UNKNOWN, INTEGER)
}

