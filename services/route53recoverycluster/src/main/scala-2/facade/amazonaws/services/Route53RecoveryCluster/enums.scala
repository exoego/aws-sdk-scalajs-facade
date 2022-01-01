package facade.amazonaws.services.route53recoverycluster

import scalajs.js

@js.native
sealed trait RoutingControlState extends js.Any
object RoutingControlState {
  val On = "On".asInstanceOf[RoutingControlState]
  val Off = "Off".asInstanceOf[RoutingControlState]

  @inline def values: js.Array[RoutingControlState] = js.Array(On, Off)
}
