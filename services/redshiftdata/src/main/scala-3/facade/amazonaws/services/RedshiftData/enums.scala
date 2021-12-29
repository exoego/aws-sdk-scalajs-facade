package facade.amazonaws.services.redshiftdata

import scalajs._

type StatusString = "SUBMITTED" | "PICKED" | "STARTED" | "FINISHED" | "ABORTED" | "FAILED" | "ALL"
object StatusString {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val PICKED: "PICKED" = "PICKED"
  val STARTED: "STARTED" = "STARTED"
  val FINISHED: "FINISHED" = "FINISHED"
  val ABORTED: "ABORTED" = "ABORTED"
  val FAILED: "FAILED" = "FAILED"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[StatusString](SUBMITTED, PICKED, STARTED, FINISHED, ABORTED, FAILED, ALL)
}
