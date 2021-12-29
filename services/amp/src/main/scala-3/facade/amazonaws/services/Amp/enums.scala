package facade.amazonaws.services.amp

import scalajs._
import scala.scalajs.js.|

/** State of a workspace.
  */
@js.native
sealed trait WorkspaceStatusCode extends js.Any
object WorkspaceStatusCode {
  val CREATING = "CREATING".asInstanceOf[WorkspaceStatusCode]
  val ACTIVE = "ACTIVE".asInstanceOf[WorkspaceStatusCode]
  val UPDATING = "UPDATING".asInstanceOf[WorkspaceStatusCode]
  val DELETING = "DELETING".asInstanceOf[WorkspaceStatusCode]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[WorkspaceStatusCode]

  @inline def values = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATION_FAILED)
}
