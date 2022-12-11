package facade.amazonaws.services.servicecatalogappregistry

import scalajs.js

type ResourceGroupState = "CREATING" | "CREATE_COMPLETE" | "CREATE_FAILED" | "UPDATING" | "UPDATE_COMPLETE" | "UPDATE_FAILED"
object ResourceGroupState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[ResourceGroupState] = js.Array(CREATING, CREATE_COMPLETE, CREATE_FAILED, UPDATING, UPDATE_COMPLETE, UPDATE_FAILED)
}

type ResourceType = "CFN_STACK" | "RESOURCE_TAG_VALUE"
object ResourceType {
  inline val CFN_STACK: "CFN_STACK" = "CFN_STACK"
  inline val RESOURCE_TAG_VALUE: "RESOURCE_TAG_VALUE" = "RESOURCE_TAG_VALUE"

  inline def values: js.Array[ResourceType] = js.Array(CFN_STACK, RESOURCE_TAG_VALUE)
}

type SyncAction = "START_SYNC" | "NO_ACTION"
object SyncAction {
  inline val START_SYNC: "START_SYNC" = "START_SYNC"
  inline val NO_ACTION: "NO_ACTION" = "NO_ACTION"

  inline def values: js.Array[SyncAction] = js.Array(START_SYNC, NO_ACTION)
}
