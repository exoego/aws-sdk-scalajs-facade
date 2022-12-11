package facade.amazonaws.services.iotroborunner

import scalajs.js

/** State of the destination.
  */
@js.native
sealed trait DestinationState extends js.Any
object DestinationState {
  val ENABLED = "ENABLED".asInstanceOf[DestinationState]
  val DISABLED = "DISABLED".asInstanceOf[DestinationState]
  val DECOMMISSIONED = "DECOMMISSIONED".asInstanceOf[DestinationState]

  @inline def values: js.Array[DestinationState] = js.Array(ENABLED, DISABLED, DECOMMISSIONED)
}
