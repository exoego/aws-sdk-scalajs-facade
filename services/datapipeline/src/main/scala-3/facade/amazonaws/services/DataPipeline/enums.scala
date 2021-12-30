package facade.amazonaws.services.datapipeline

import scalajs.js

type OperatorType = "EQ" | "REF_EQ" | "LE" | "GE" | "BETWEEN"
object OperatorType {
  inline val EQ: "EQ" = "EQ"
  inline val REF_EQ: "REF_EQ" = "REF_EQ"
  inline val LE: "LE" = "LE"
  inline val GE: "GE" = "GE"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"

  inline def values: js.Array[OperatorType] = js.Array(EQ, REF_EQ, LE, GE, BETWEEN)
}

type TaskStatus = "FINISHED" | "FAILED" | "FALSE"
object TaskStatus {
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val FALSE: "FALSE" = "FALSE"

  inline def values: js.Array[TaskStatus] = js.Array(FINISHED, FAILED, FALSE)
}
