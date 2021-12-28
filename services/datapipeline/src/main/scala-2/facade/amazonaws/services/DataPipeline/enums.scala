package facade.amazonaws.services.datapipeline

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait OperatorType extends js.Any
object OperatorType {
  val EQ = "EQ".asInstanceOf[OperatorType]
  val REF_EQ = "REF_EQ".asInstanceOf[OperatorType]
  val LE = "LE".asInstanceOf[OperatorType]
  val GE = "GE".asInstanceOf[OperatorType]
  val BETWEEN = "BETWEEN".asInstanceOf[OperatorType]

  @inline def values = js.Array(EQ, REF_EQ, LE, GE, BETWEEN)
}

@js.native
sealed trait TaskStatus extends js.Any
object TaskStatus {
  val FINISHED = "FINISHED".asInstanceOf[TaskStatus]
  val FAILED = "FAILED".asInstanceOf[TaskStatus]
  val FALSE = "FALSE".asInstanceOf[TaskStatus]

  @inline def values = js.Array(FINISHED, FAILED, FALSE)
}
