package facade.amazonaws.services.iotsecuretunneling

import scalajs.js

type ClientMode = "SOURCE" | "DESTINATION" | "ALL"
object ClientMode {
  inline val SOURCE: "SOURCE" = "SOURCE"
  inline val DESTINATION: "DESTINATION" = "DESTINATION"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[ClientMode] = js.Array(SOURCE, DESTINATION, ALL)
}

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
