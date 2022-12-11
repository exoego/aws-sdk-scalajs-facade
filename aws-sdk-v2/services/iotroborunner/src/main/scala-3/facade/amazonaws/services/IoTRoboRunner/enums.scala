package facade.amazonaws.services.iotroborunner

import scalajs.js

/** State of the destination.
  */
type DestinationState = "ENABLED" | "DISABLED" | "DECOMMISSIONED"
object DestinationState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val DECOMMISSIONED: "DECOMMISSIONED" = "DECOMMISSIONED"

  inline def values: js.Array[DestinationState] = js.Array(ENABLED, DISABLED, DECOMMISSIONED)
}
