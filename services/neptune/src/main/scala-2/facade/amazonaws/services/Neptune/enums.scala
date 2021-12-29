package facade.amazonaws.services.neptune

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ApplyMethod extends js.Any
object ApplyMethod {
  val immediate = "immediate".asInstanceOf[ApplyMethod]
  val `pending-reboot` = "pending-reboot".asInstanceOf[ApplyMethod]

  @inline def values = js.Array(immediate, `pending-reboot`)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val `db-instance` = "db-instance".asInstanceOf[SourceType]
  val `db-parameter-group` = "db-parameter-group".asInstanceOf[SourceType]
  val `db-security-group` = "db-security-group".asInstanceOf[SourceType]
  val `db-snapshot` = "db-snapshot".asInstanceOf[SourceType]
  val `db-cluster` = "db-cluster".asInstanceOf[SourceType]
  val `db-cluster-snapshot` = "db-cluster-snapshot".asInstanceOf[SourceType]

  @inline def values = js.Array(`db-instance`, `db-parameter-group`, `db-security-group`, `db-snapshot`, `db-cluster`, `db-cluster-snapshot`)
}

