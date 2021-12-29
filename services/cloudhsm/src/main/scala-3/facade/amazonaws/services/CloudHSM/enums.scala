package facade.amazonaws.services.cloudhsm

import scalajs._

type ClientVersion = "5.1" | "5.3"
object ClientVersion {
  val `5.1`: "5.1" = "5.1"
  val `5.3`: "5.3" = "5.3"

  @inline def values = js.Array[ClientVersion](`5.1`, `5.3`)
}

type CloudHsmObjectState = "READY" | "UPDATING" | "DEGRADED"
object CloudHsmObjectState {
  val READY: "READY" = "READY"
  val UPDATING: "UPDATING" = "UPDATING"
  val DEGRADED: "DEGRADED" = "DEGRADED"

  @inline def values = js.Array[CloudHsmObjectState](READY, UPDATING, DEGRADED)
}

type HsmStatus = "PENDING" | "RUNNING" | "UPDATING" | "SUSPENDED" | "TERMINATING" | "TERMINATED" | "DEGRADED"
object HsmStatus {
  val PENDING: "PENDING" = "PENDING"
  val RUNNING: "RUNNING" = "RUNNING"
  val UPDATING: "UPDATING" = "UPDATING"
  val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  val TERMINATING: "TERMINATING" = "TERMINATING"
  val TERMINATED: "TERMINATED" = "TERMINATED"
  val DEGRADED: "DEGRADED" = "DEGRADED"

  @inline def values = js.Array[HsmStatus](PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED)
}

/** Specifies the type of subscription for the HSM. * ```PRODUCTION``` - The HSM is being used in a production environment. * ```TRIAL``` - The HSM is being used in a product trial.
  */
type SubscriptionType = "PRODUCTION"
object SubscriptionType {
  val PRODUCTION: "PRODUCTION" = "PRODUCTION"

  @inline def values = js.Array[SubscriptionType](PRODUCTION)
}
