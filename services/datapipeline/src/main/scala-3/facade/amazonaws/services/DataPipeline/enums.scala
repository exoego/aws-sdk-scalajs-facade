package facade.amazonaws.services.datapipeline

import scalajs._

type OperatorType = "EQ" | "REF_EQ" | "LE" | "GE" | "BETWEEN"
object OperatorType {
  val EQ: "EQ" = "EQ"
  val REF_EQ: "REF_EQ" = "REF_EQ"
  val LE: "LE" = "LE"
  val GE: "GE" = "GE"
  val BETWEEN: "BETWEEN" = "BETWEEN"

  @inline def values = js.Array[OperatorType](EQ, REF_EQ, LE, GE, BETWEEN)
}

type TaskStatus = "FINISHED" | "FAILED" | "FALSE"
object TaskStatus {
  val FINISHED: "FINISHED" = "FINISHED"
  val FAILED: "FAILED" = "FAILED"
  val FALSE: "FALSE" = "FALSE"

  @inline def values = js.Array[TaskStatus](FINISHED, FAILED, FALSE)
}
