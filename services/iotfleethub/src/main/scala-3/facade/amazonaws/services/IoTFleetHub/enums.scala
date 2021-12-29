package facade.amazonaws.services.iotfleethub

import scalajs._

type ApplicationState = "CREATING" | "DELETING" | "ACTIVE" | "CREATE_FAILED" | "DELETE_FAILED"
object ApplicationState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[ApplicationState] = js.Array(CREATING, DELETING, ACTIVE, CREATE_FAILED, DELETE_FAILED)
}
