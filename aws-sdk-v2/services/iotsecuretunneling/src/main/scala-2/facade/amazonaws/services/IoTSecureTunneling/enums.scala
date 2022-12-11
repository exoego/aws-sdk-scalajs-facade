package facade.amazonaws.services.iotsecuretunneling

import scalajs.js

@js.native
sealed trait ClientMode extends js.Any
object ClientMode {
  val SOURCE = "SOURCE".asInstanceOf[ClientMode]
  val DESTINATION = "DESTINATION".asInstanceOf[ClientMode]
  val ALL = "ALL".asInstanceOf[ClientMode]

  @inline def values: js.Array[ClientMode] = js.Array(SOURCE, DESTINATION, ALL)
}

@js.native
sealed trait ConnectionStatus extends js.Any
object ConnectionStatus {
  val CONNECTED = "CONNECTED".asInstanceOf[ConnectionStatus]
  val DISCONNECTED = "DISCONNECTED".asInstanceOf[ConnectionStatus]

  @inline def values: js.Array[ConnectionStatus] = js.Array(CONNECTED, DISCONNECTED)
}

@js.native
sealed trait TunnelStatus extends js.Any
object TunnelStatus {
  val OPEN = "OPEN".asInstanceOf[TunnelStatus]
  val CLOSED = "CLOSED".asInstanceOf[TunnelStatus]

  @inline def values: js.Array[TunnelStatus] = js.Array(OPEN, CLOSED)
}
