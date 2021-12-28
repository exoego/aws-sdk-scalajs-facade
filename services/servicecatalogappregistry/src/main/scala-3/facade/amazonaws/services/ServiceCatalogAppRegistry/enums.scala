package facade.amazonaws.services.servicecatalogappregistry

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val CFN_STACK = "CFN_STACK".asInstanceOf[ResourceType]

  @inline def values = js.Array(CFN_STACK)
}

@js.native
sealed trait SyncAction extends js.Any
object SyncAction {
  val START_SYNC = "START_SYNC".asInstanceOf[SyncAction]
  val NO_ACTION = "NO_ACTION".asInstanceOf[SyncAction]

  @inline def values = js.Array(START_SYNC, NO_ACTION)
}
