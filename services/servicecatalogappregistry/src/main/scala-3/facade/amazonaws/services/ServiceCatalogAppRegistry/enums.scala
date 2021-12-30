package facade.amazonaws.services.servicecatalogappregistry

import scalajs.js

type ResourceType = "CFN_STACK"
object ResourceType {
  inline val CFN_STACK: "CFN_STACK" = "CFN_STACK"

  inline def values: js.Array[ResourceType] = js.Array(CFN_STACK)
}

type SyncAction = "START_SYNC" | "NO_ACTION"
object SyncAction {
  inline val START_SYNC: "START_SYNC" = "START_SYNC"
  inline val NO_ACTION: "NO_ACTION" = "NO_ACTION"

  inline def values: js.Array[SyncAction] = js.Array(START_SYNC, NO_ACTION)
}
