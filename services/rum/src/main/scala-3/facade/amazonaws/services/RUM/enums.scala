package facade.amazonaws.services.rum

import scalajs.js

type StateEnum = "CREATED" | "DELETING" | "ACTIVE"
object StateEnum {
  inline val CREATED: "CREATED" = "CREATED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[StateEnum] = js.Array(CREATED, DELETING, ACTIVE)
}

type Telemetry = "errors" | "performance" | "http"
object Telemetry {
  inline val errors: "errors" = "errors"
  inline val performance: "performance" = "performance"
  inline val http: "http" = "http"

  inline def values: js.Array[Telemetry] = js.Array(errors, performance, http)
}
