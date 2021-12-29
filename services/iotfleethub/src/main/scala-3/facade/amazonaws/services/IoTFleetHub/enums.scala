package facade.amazonaws.services.iotfleethub

import scalajs._

type ApplicationState = "CREATING" | "DELETING" | "ACTIVE" | "CREATE_FAILED" | "DELETE_FAILED"
object ApplicationState {
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  @inline def values = js.Array[ApplicationState](CREATING, DELETING, ACTIVE, CREATE_FAILED, DELETE_FAILED)
}
