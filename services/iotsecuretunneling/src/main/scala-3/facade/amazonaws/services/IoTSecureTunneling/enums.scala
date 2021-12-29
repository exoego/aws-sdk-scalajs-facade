package facade.amazonaws.services.iotsecuretunneling

import scalajs._

type ConnectionStatus = "CONNECTED" | "DISCONNECTED"
object ConnectionStatus {
  val CONNECTED: "CONNECTED" = "CONNECTED"
  val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"

  @inline def values = js.Array[ConnectionStatus](CONNECTED, DISCONNECTED)
}

type TunnelStatus = "OPEN" | "CLOSED"
object TunnelStatus {
  val OPEN: "OPEN" = "OPEN"
  val CLOSED: "CLOSED" = "CLOSED"

  @inline def values = js.Array[TunnelStatus](OPEN, CLOSED)
}
