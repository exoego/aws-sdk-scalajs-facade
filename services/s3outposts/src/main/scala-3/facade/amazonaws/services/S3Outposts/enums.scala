package facade.amazonaws.services.s3outposts

import scalajs._

type EndpointStatus = "PENDING" | "AVAILABLE"
object EndpointStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"

  inline def values: js.Array[EndpointStatus] = js.Array(PENDING, AVAILABLE)
}
