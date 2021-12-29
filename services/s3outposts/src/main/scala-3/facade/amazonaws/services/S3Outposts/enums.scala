package facade.amazonaws.services.s3outposts

import scalajs._

type EndpointStatus = "PENDING" | "AVAILABLE"
object EndpointStatus {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"

  @inline def values = js.Array[EndpointStatus](PENDING, AVAILABLE)
}
