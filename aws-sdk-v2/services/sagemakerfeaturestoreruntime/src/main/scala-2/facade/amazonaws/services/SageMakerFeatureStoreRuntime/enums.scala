package facade.amazonaws.services.sagemakerfeaturestoreruntime

import scalajs.js

@js.native
sealed trait TargetStore extends js.Any
object TargetStore {
  val OnlineStore = "OnlineStore".asInstanceOf[TargetStore]
  val OfflineStore = "OfflineStore".asInstanceOf[TargetStore]

  @inline def values: js.Array[TargetStore] = js.Array(OnlineStore, OfflineStore)
}
