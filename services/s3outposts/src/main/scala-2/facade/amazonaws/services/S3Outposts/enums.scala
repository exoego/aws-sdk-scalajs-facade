package facade.amazonaws.services.s3outposts

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait EndpointStatus extends js.Any
object EndpointStatus {
  val PENDING = "PENDING".asInstanceOf[EndpointStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[EndpointStatus]

  @inline def values = js.Array(PENDING, AVAILABLE)
}

