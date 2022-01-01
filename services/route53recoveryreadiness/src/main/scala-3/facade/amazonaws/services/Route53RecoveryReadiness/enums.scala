package facade.amazonaws.services.route53recoveryreadiness

import scalajs.js

/** The readiness of an entire ReadinessCheck or an individual resource ARN.
  */
type Readiness = "READY" | "NOT_READY" | "UNKNOWN" | "NOT_AUTHORIZED"
object Readiness {
  inline val READY: "READY" = "READY"
  inline val NOT_READY: "NOT_READY" = "NOT_READY"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val NOT_AUTHORIZED: "NOT_AUTHORIZED" = "NOT_AUTHORIZED"

  inline def values: js.Array[Readiness] = js.Array(READY, NOT_READY, UNKNOWN, NOT_AUTHORIZED)
}
