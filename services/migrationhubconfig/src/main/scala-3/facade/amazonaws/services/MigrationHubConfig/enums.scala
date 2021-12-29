package facade.amazonaws.services.migrationhubconfig

import scalajs._

type TargetType = "ACCOUNT"
object TargetType {
  val ACCOUNT: "ACCOUNT" = "ACCOUNT"

  @inline def values = js.Array[TargetType](ACCOUNT)
}
