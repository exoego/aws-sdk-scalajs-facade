package facade.amazonaws.services.kinesisvideosignaling

import scalajs.js

type Service = "TURN"
object Service {
  inline val TURN: "TURN" = "TURN"

  inline def values: js.Array[Service] = js.Array(TURN)
}
