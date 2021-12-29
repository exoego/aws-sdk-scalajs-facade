package facade.amazonaws.services.pinpointsmsvoice

import scalajs._

/** The types of events that are sent to the event destination.
  */
type EventType = "INITIATED_CALL" | "RINGING" | "ANSWERED" | "COMPLETED_CALL" | "BUSY" | "FAILED" | "NO_ANSWER"
object EventType {
  val INITIATED_CALL: "INITIATED_CALL" = "INITIATED_CALL"
  val RINGING: "RINGING" = "RINGING"
  val ANSWERED: "ANSWERED" = "ANSWERED"
  val COMPLETED_CALL: "COMPLETED_CALL" = "COMPLETED_CALL"
  val BUSY: "BUSY" = "BUSY"
  val FAILED: "FAILED" = "FAILED"
  val NO_ANSWER: "NO_ANSWER" = "NO_ANSWER"

  @inline def values = js.Array[EventType](INITIATED_CALL, RINGING, ANSWERED, COMPLETED_CALL, BUSY, FAILED, NO_ANSWER)
}
