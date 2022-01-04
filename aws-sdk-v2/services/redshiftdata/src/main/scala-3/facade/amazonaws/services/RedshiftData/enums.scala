package facade.amazonaws.services.redshiftdata

import scalajs.js

type StatementStatusString = "SUBMITTED" | "PICKED" | "STARTED" | "FINISHED" | "ABORTED" | "FAILED"
object StatementStatusString {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val PICKED: "PICKED" = "PICKED"
  inline val STARTED: "STARTED" = "STARTED"
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val ABORTED: "ABORTED" = "ABORTED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[StatementStatusString] = js.Array(SUBMITTED, PICKED, STARTED, FINISHED, ABORTED, FAILED)
}

type StatusString = "SUBMITTED" | "PICKED" | "STARTED" | "FINISHED" | "ABORTED" | "FAILED" | "ALL"
object StatusString {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val PICKED: "PICKED" = "PICKED"
  inline val STARTED: "STARTED" = "STARTED"
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val ABORTED: "ABORTED" = "ABORTED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[StatusString] = js.Array(SUBMITTED, PICKED, STARTED, FINISHED, ABORTED, FAILED, ALL)
}
