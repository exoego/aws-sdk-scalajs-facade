package facade.amazonaws.services.servicecatalogappregistry

import scalajs._

type ResourceType = "CFN_STACK"
object ResourceType {
  val CFN_STACK: "CFN_STACK" = "CFN_STACK"

  @inline def values = js.Array[ResourceType](CFN_STACK)
}

type SyncAction = "START_SYNC" | "NO_ACTION"
object SyncAction {
  val START_SYNC: "START_SYNC" = "START_SYNC"
  val NO_ACTION: "NO_ACTION" = "NO_ACTION"

  @inline def values = js.Array[SyncAction](START_SYNC, NO_ACTION)
}
