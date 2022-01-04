package facade.amazonaws.services.route53recoverycluster

import scalajs.js

type RoutingControlState = "On" | "Off"
object RoutingControlState {
  inline val On: "On" = "On"
  inline val Off: "Off" = "Off"

  inline def values: js.Array[RoutingControlState] = js.Array(On, Off)
}
