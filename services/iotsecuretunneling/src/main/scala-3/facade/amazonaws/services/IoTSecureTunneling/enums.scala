package facade.amazonaws.services.iotsecuretunneling

import scalajs._

type ConnectionStatus = "CONNECTED" | "DISCONNECTED"
object ConnectionStatus {
  inline val CONNECTED: "CONNECTED" = "CONNECTED"
  inline val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"

  inline def values: js.Array[ConnectionStatus] = js.Array(CONNECTED, DISCONNECTED)
}

type TunnelStatus = "OPEN" | "CLOSED"
object TunnelStatus {
  inline val OPEN: "OPEN" = "OPEN"
  inline val CLOSED: "CLOSED" = "CLOSED"

  inline def values: js.Array[TunnelStatus] = js.Array(OPEN, CLOSED)
}
