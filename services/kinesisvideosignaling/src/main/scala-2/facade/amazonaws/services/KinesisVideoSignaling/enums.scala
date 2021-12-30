package facade.amazonaws.services.kinesisvideosignaling

import scalajs.js

@js.native
sealed trait Service extends js.Any
object Service {
  val TURN = "TURN".asInstanceOf[Service]

  @inline def values: js.Array[Service] = js.Array(TURN)
}
