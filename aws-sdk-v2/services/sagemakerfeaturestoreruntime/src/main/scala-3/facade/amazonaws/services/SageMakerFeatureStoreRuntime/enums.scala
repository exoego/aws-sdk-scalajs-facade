package facade.amazonaws.services.sagemakerfeaturestoreruntime

import scalajs.js

type TargetStore = "OnlineStore" | "OfflineStore"
object TargetStore {
  inline val OnlineStore: "OnlineStore" = "OnlineStore"
  inline val OfflineStore: "OfflineStore" = "OfflineStore"

  inline def values: js.Array[TargetStore] = js.Array(OnlineStore, OfflineStore)
}
