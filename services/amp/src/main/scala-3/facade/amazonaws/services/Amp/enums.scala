package facade.amazonaws.services.amp

import scalajs.js

/** State of a workspace.
  */
type WorkspaceStatusCode = "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "CREATION_FAILED"
object WorkspaceStatusCode {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"

  inline def values: js.Array[WorkspaceStatusCode] = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED)
}
