package facade.amazonaws.services.mediastore

import scalajs._

type ContainerLevelMetrics = "ENABLED" | "DISABLED"
object ContainerLevelMetrics {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ContainerLevelMetrics](ENABLED, DISABLED)
}

type ContainerStatus = "ACTIVE" | "CREATING" | "DELETING"
object ContainerStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[ContainerStatus](ACTIVE, CREATING, DELETING)
}

type MethodName = "PUT" | "GET" | "DELETE" | "HEAD"
object MethodName {
  val PUT: "PUT" = "PUT"
  val GET: "GET" = "GET"
  val DELETE: "DELETE" = "DELETE"
  val HEAD: "HEAD" = "HEAD"

  @inline def values = js.Array[MethodName](PUT, GET, DELETE, HEAD)
}
