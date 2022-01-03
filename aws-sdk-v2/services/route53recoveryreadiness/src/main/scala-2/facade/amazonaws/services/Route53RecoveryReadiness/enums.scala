package facade.amazonaws.services.route53recoveryreadiness

import scalajs.js

/** The readiness of an entire ReadinessCheck or an individual resource ARN.
  */
@js.native
sealed trait Readiness extends js.Any
object Readiness {
  val READY = "READY".asInstanceOf[Readiness]
  val NOT_READY = "NOT_READY".asInstanceOf[Readiness]
  val UNKNOWN = "UNKNOWN".asInstanceOf[Readiness]
  val NOT_AUTHORIZED = "NOT_AUTHORIZED".asInstanceOf[Readiness]

  @inline def values: js.Array[Readiness] = js.Array(READY, NOT_READY, UNKNOWN, NOT_AUTHORIZED)
}
