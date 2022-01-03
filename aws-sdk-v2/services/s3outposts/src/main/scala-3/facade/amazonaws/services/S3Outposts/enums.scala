package facade.amazonaws.services.s3outposts

import scalajs.js

type EndpointAccessType = "Private" | "CustomerOwnedIp"
object EndpointAccessType {
  inline val Private: "Private" = "Private"
  inline val CustomerOwnedIp: "CustomerOwnedIp" = "CustomerOwnedIp"

  inline def values: js.Array[EndpointAccessType] = js.Array(Private, CustomerOwnedIp)
}

type EndpointStatus = "Pending" | "Available" | "Deleting"
object EndpointStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Available: "Available" = "Available"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[EndpointStatus] = js.Array(Pending, Available, Deleting)
}
