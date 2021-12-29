package facade.amazonaws.services.cloudhsm

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ClientVersion extends js.Any
object ClientVersion {
  val `5.1` = "5.1".asInstanceOf[ClientVersion]
  val `5.3` = "5.3".asInstanceOf[ClientVersion]

  @inline def values = js.Array(`5.1`, `5.3`)
}

@js.native
sealed trait CloudHsmObjectState extends js.Any
object CloudHsmObjectState {
  val READY = "READY".asInstanceOf[CloudHsmObjectState]
  val UPDATING = "UPDATING".asInstanceOf[CloudHsmObjectState]
  val DEGRADED = "DEGRADED".asInstanceOf[CloudHsmObjectState]

  @inline def values = js.Array(READY, UPDATING, DEGRADED)
}

@js.native
sealed trait HsmStatus extends js.Any
object HsmStatus {
  val PENDING = "PENDING".asInstanceOf[HsmStatus]
  val RUNNING = "RUNNING".asInstanceOf[HsmStatus]
  val UPDATING = "UPDATING".asInstanceOf[HsmStatus]
  val SUSPENDED = "SUSPENDED".asInstanceOf[HsmStatus]
  val TERMINATING = "TERMINATING".asInstanceOf[HsmStatus]
  val TERMINATED = "TERMINATED".asInstanceOf[HsmStatus]
  val DEGRADED = "DEGRADED".asInstanceOf[HsmStatus]

  @inline def values = js.Array(PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED)
}

/** Specifies the type of subscription for the HSM.
  * * ```PRODUCTION``` - The HSM is being used in a production environment.
  * * ```TRIAL``` - The HSM is being used in a product trial.
  */
@js.native
sealed trait SubscriptionType extends js.Any
object SubscriptionType {
  val PRODUCTION = "PRODUCTION".asInstanceOf[SubscriptionType]

  @inline def values = js.Array(PRODUCTION)
}

