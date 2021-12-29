package facade.amazonaws.services.pinpointsmsvoice

import scalajs._

/** The types of events that are sent to the event destination.
  */
type EventType = "INITIATED_CALL" | "RINGING" | "ANSWERED" | "COMPLETED_CALL" | "BUSY" | "FAILED" | "NO_ANSWER"
object EventType {
  inline val INITIATED_CALL: "INITIATED_CALL" = "INITIATED_CALL"
  inline val RINGING: "RINGING" = "RINGING"
  inline val ANSWERED: "ANSWERED" = "ANSWERED"
  inline val COMPLETED_CALL: "COMPLETED_CALL" = "COMPLETED_CALL"
  inline val BUSY: "BUSY" = "BUSY"
  inline val FAILED: "FAILED" = "FAILED"
  inline val NO_ANSWER: "NO_ANSWER" = "NO_ANSWER"

  inline def values: js.Array[EventType] = js.Array(INITIATED_CALL, RINGING, ANSWERED, COMPLETED_CALL, BUSY, FAILED, NO_ANSWER)
}
