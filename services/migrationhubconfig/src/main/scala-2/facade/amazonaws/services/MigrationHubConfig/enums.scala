package facade.amazonaws.services.migrationhubconfig

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait TargetType extends js.Any
object TargetType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[TargetType]

  @inline def values = js.Array(ACCOUNT)
}

