package facade.amazonaws.services.kinesisvideosignaling

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait Service extends js.Any
object Service {
  val TURN = "TURN".asInstanceOf[Service]

  @inline def values = js.Array(TURN)
}
