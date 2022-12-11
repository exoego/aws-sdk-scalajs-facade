package facade.amazonaws.services.resourceexplorer2

import scalajs.js

@js.native
sealed trait IndexState extends js.Any
object IndexState {
  val CREATING = "CREATING".asInstanceOf[IndexState]
  val ACTIVE = "ACTIVE".asInstanceOf[IndexState]
  val DELETING = "DELETING".asInstanceOf[IndexState]
  val DELETED = "DELETED".asInstanceOf[IndexState]
  val UPDATING = "UPDATING".asInstanceOf[IndexState]

  @inline def values: js.Array[IndexState] = js.Array(CREATING, ACTIVE, DELETING, DELETED, UPDATING)
}

@js.native
sealed trait IndexType extends js.Any
object IndexType {
  val LOCAL = "LOCAL".asInstanceOf[IndexType]
  val AGGREGATOR = "AGGREGATOR".asInstanceOf[IndexType]

  @inline def values: js.Array[IndexType] = js.Array(LOCAL, AGGREGATOR)
}
