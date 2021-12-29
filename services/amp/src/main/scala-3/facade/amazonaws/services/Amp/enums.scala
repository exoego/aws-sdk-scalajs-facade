package facade.amazonaws.services.amp

import scalajs._

/** State of a workspace.
  */
type WorkspaceStatusCode = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "CREATION_FAILED"
object WorkspaceStatusCode {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"

  @inline def values = js.Array[WorkspaceStatusCode](CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED)
}
