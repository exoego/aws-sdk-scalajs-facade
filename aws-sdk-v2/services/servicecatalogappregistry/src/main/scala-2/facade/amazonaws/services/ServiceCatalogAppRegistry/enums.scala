package facade.amazonaws.services.servicecatalogappregistry

import scalajs.js

@js.native
sealed trait ResourceGroupState extends js.Any
object ResourceGroupState {
  val CREATING = "CREATING".asInstanceOf[ResourceGroupState]
  val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[ResourceGroupState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ResourceGroupState]
  val UPDATING = "UPDATING".asInstanceOf[ResourceGroupState]
  val UPDATE_COMPLETE = "UPDATE_COMPLETE".asInstanceOf[ResourceGroupState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ResourceGroupState]

  @inline def values: js.Array[ResourceGroupState] = js.Array(CREATING, CREATE_COMPLETE, CREATE_FAILED, UPDATING, UPDATE_COMPLETE, UPDATE_FAILED)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val CFN_STACK = "CFN_STACK".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(CFN_STACK)
}

@js.native
sealed trait SyncAction extends js.Any
object SyncAction {
  val START_SYNC = "START_SYNC".asInstanceOf[SyncAction]
  val NO_ACTION = "NO_ACTION".asInstanceOf[SyncAction]

  @inline def values: js.Array[SyncAction] = js.Array(START_SYNC, NO_ACTION)
}
