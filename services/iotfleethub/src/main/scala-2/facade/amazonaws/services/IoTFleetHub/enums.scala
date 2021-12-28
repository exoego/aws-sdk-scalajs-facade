package facade.amazonaws.services.iotfleethub

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ApplicationState extends js.Any
object ApplicationState {
  val CREATING = "CREATING".asInstanceOf[ApplicationState]
  val DELETING = "DELETING".asInstanceOf[ApplicationState]
  val ACTIVE = "ACTIVE".asInstanceOf[ApplicationState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ApplicationState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ApplicationState]

  @inline def values = js.Array(CREATING, DELETING, ACTIVE, CREATE_FAILED, DELETE_FAILED)
}
