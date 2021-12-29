package facade.amazonaws.services.serverlessapplicationrepository

import scalajs._
import scala.scalajs.js.|

/** Values that must be specified in order to deploy some applications.
  */
@js.native
sealed trait Capability extends js.Any
object Capability {
  val CAPABILITY_IAM = "CAPABILITY_IAM".asInstanceOf[Capability]
  val CAPABILITY_NAMED_IAM = "CAPABILITY_NAMED_IAM".asInstanceOf[Capability]
  val CAPABILITY_AUTO_EXPAND = "CAPABILITY_AUTO_EXPAND".asInstanceOf[Capability]
  val CAPABILITY_RESOURCE_POLICY = "CAPABILITY_RESOURCE_POLICY".asInstanceOf[Capability]

  @inline def values = js.Array(CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_AUTO_EXPAND, CAPABILITY_RESOURCE_POLICY)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val PREPARING = "PREPARING".asInstanceOf[Status]
  val ACTIVE = "ACTIVE".asInstanceOf[Status]
  val EXPIRED = "EXPIRED".asInstanceOf[Status]

  @inline def values = js.Array(PREPARING, ACTIVE, EXPIRED)
}

