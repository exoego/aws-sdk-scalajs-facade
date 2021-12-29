package facade.amazonaws.services.kinesisvideosignaling

import scalajs._

type Service = "TURN"
object Service {
  val TURN: "TURN" = "TURN"

  @inline def values = js.Array[Service](TURN)
}
