package facade.amazonaws.services.redshiftdata

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait StatusString extends js.Any
object StatusString {
  val SUBMITTED = "SUBMITTED".asInstanceOf[StatusString]
  val PICKED = "PICKED".asInstanceOf[StatusString]
  val STARTED = "STARTED".asInstanceOf[StatusString]
  val FINISHED = "FINISHED".asInstanceOf[StatusString]
  val ABORTED = "ABORTED".asInstanceOf[StatusString]
  val FAILED = "FAILED".asInstanceOf[StatusString]
  val ALL = "ALL".asInstanceOf[StatusString]

  @inline def values = js.Array(SUBMITTED, PICKED, STARTED, FINISHED, ABORTED, FAILED, ALL)
}
