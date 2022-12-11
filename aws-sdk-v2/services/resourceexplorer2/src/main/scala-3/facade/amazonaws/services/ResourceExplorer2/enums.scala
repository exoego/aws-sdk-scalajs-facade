package facade.amazonaws.services.resourceexplorer2

import scalajs.js

type IndexState = "CREATING" | "ACTIVE" | "DELETING" | "DELETED" | "UPDATING"
object IndexState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[IndexState] = js.Array(CREATING, ACTIVE, DELETING, DELETED, UPDATING)
}

type IndexType = "LOCAL" | "AGGREGATOR"
object IndexType {
  inline val LOCAL: "LOCAL" = "LOCAL"
  inline val AGGREGATOR: "AGGREGATOR" = "AGGREGATOR"

  inline def values: js.Array[IndexType] = js.Array(LOCAL, AGGREGATOR)
}
