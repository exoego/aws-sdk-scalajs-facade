package facade.amazonaws.services.s3outposts

import scalajs.js

@js.native
sealed trait EndpointAccessType extends js.Any
object EndpointAccessType {
  val Private = "Private".asInstanceOf[EndpointAccessType]
  val CustomerOwnedIp = "CustomerOwnedIp".asInstanceOf[EndpointAccessType]

  @inline def values: js.Array[EndpointAccessType] = js.Array(Private, CustomerOwnedIp)
}

@js.native
sealed trait EndpointStatus extends js.Any
object EndpointStatus {
  val Pending = "Pending".asInstanceOf[EndpointStatus]
  val Available = "Available".asInstanceOf[EndpointStatus]
  val Deleting = "Deleting".asInstanceOf[EndpointStatus]

  @inline def values: js.Array[EndpointStatus] = js.Array(Pending, Available, Deleting)
}
