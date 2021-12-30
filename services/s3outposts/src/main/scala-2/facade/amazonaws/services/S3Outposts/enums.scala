package facade.amazonaws.services.s3outposts

import scalajs.js

@js.native
sealed trait EndpointStatus extends js.Any
object EndpointStatus {
  val PENDING = "PENDING".asInstanceOf[EndpointStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[EndpointStatus]

  @inline def values: js.Array[EndpointStatus] = js.Array(PENDING, AVAILABLE)
}
