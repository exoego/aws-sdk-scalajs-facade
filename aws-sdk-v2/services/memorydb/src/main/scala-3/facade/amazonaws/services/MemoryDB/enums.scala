package facade.amazonaws.services.memorydb

import scalajs.js

type AZStatus = "singleaz" | "multiaz"
object AZStatus {
  inline val singleaz: "singleaz" = "singleaz"
  inline val multiaz: "multiaz" = "multiaz"

  inline def values: js.Array[AZStatus] = js.Array(singleaz, multiaz)
}

type AuthenticationType = "password" | "no-password"
object AuthenticationType {
  inline val password: "password" = "password"
  inline val `no-password`: "no-password" = "no-password"

  inline def values: js.Array[AuthenticationType] = js.Array(password, `no-password`)
}

type DataTieringStatus = "true" | "false"
object DataTieringStatus {
  inline val `true`: "true" = "true"
  inline val `false`: "false" = "false"

  inline def values: js.Array[DataTieringStatus] = js.Array(`true`, `false`)
}

type InputAuthenticationType = "password"
object InputAuthenticationType {
  inline val password: "password" = "password"

  inline def values: js.Array[InputAuthenticationType] = js.Array(password)
}

type ServiceUpdateStatus = "available" | "in-progress" | "complete" | "scheduled"
object ServiceUpdateStatus {
  inline val available: "available" = "available"
  inline val `in-progress`: "in-progress" = "in-progress"
  inline val complete: "complete" = "complete"
  inline val scheduled: "scheduled" = "scheduled"

  inline def values: js.Array[ServiceUpdateStatus] = js.Array(available, `in-progress`, complete, scheduled)
}

type ServiceUpdateType = "security-update"
object ServiceUpdateType {
  inline val `security-update`: "security-update" = "security-update"

  inline def values: js.Array[ServiceUpdateType] = js.Array(`security-update`)
}

type SourceType = "node" | "parameter-group" | "subnet-group" | "cluster" | "user" | "acl"
object SourceType {
  inline val node: "node" = "node"
  inline val `parameter-group`: "parameter-group" = "parameter-group"
  inline val `subnet-group`: "subnet-group" = "subnet-group"
  inline val cluster: "cluster" = "cluster"
  inline val user: "user" = "user"
  inline val acl: "acl" = "acl"

  inline def values: js.Array[SourceType] = js.Array(node, `parameter-group`, `subnet-group`, cluster, user, acl)
}
