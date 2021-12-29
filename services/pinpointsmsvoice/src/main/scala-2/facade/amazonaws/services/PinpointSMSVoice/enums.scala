package facade.amazonaws.services.pinpointsmsvoice

import scalajs._
import scala.scalajs.js.|

/** The types of events that are sent to the event destination.
  */
@js.native
sealed trait EventType extends js.Any
object EventType {
  val INITIATED_CALL = "INITIATED_CALL".asInstanceOf[EventType]
  val RINGING = "RINGING".asInstanceOf[EventType]
  val ANSWERED = "ANSWERED".asInstanceOf[EventType]
  val COMPLETED_CALL = "COMPLETED_CALL".asInstanceOf[EventType]
  val BUSY = "BUSY".asInstanceOf[EventType]
  val FAILED = "FAILED".asInstanceOf[EventType]
  val NO_ANSWER = "NO_ANSWER".asInstanceOf[EventType]

  @inline def values = js.Array(INITIATED_CALL, RINGING, ANSWERED, COMPLETED_CALL, BUSY, FAILED, NO_ANSWER)
}
