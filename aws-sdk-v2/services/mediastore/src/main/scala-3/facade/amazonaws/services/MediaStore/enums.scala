package facade.amazonaws.services.mediastore

import scalajs.js

type ContainerLevelMetrics = "ENABLED" | "DISABLED"
object ContainerLevelMetrics {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ContainerLevelMetrics] = js.Array(ENABLED, DISABLED)
}

type ContainerStatus = "ACTIVE" | "CREATING" | "DELETING"
object ContainerStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ContainerStatus] = js.Array(ACTIVE, CREATING, DELETING)
}

type MethodName = "PUT" | "GET" | "DELETE" | "HEAD"
object MethodName {
  inline val PUT: "PUT" = "PUT"
  inline val GET: "GET" = "GET"
  inline val DELETE: "DELETE" = "DELETE"
  inline val HEAD: "HEAD" = "HEAD"

  inline def values: js.Array[MethodName] = js.Array(PUT, GET, DELETE, HEAD)
}
