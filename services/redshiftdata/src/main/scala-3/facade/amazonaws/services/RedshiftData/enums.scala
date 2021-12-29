package facade.amazonaws.services.redshiftdata

import scalajs._

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
