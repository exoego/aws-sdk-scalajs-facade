package facade.amazonaws.services.cloudhsm

import scalajs.js

type ClientVersion = "5.1" | "5.3"
object ClientVersion {
  inline val `5.1`: "5.1" = "5.1"
  inline val `5.3`: "5.3" = "5.3"

  inline def values: js.Array[ClientVersion] = js.Array(`5.1`, `5.3`)
}

type CloudHsmObjectState = "READY" | "UPDATING" | "DEGRADED"
object CloudHsmObjectState {
  inline val READY: "READY" = "READY"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DEGRADED: "DEGRADED" = "DEGRADED"

  inline def values: js.Array[CloudHsmObjectState] = js.Array(READY, UPDATING, DEGRADED)
}

type HsmStatus = "PENDING" | "RUNNING" | "UPDATING" | "SUSPENDED" | "TERMINATING" | "TERMINATED" | "DEGRADED"
object HsmStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val DEGRADED: "DEGRADED" = "DEGRADED"

  inline def values: js.Array[HsmStatus] = js.Array(PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED)
}

/** Specifies the type of subscription for the HSM. * ```PRODUCTION``` - The HSM is being used in a production environment. * ```TRIAL``` - The HSM is being used in a product trial.
  */
type SubscriptionType = "PRODUCTION"
object SubscriptionType {
  inline val PRODUCTION: "PRODUCTION" = "PRODUCTION"

  inline def values: js.Array[SubscriptionType] = js.Array(PRODUCTION)
}
