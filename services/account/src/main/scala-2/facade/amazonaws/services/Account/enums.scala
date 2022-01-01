package facade.amazonaws.services.account

import scalajs.js

@js.native
sealed trait AlternateContactType extends js.Any
object AlternateContactType {
  val BILLING = "BILLING".asInstanceOf[AlternateContactType]
  val OPERATIONS = "OPERATIONS".asInstanceOf[AlternateContactType]
  val SECURITY = "SECURITY".asInstanceOf[AlternateContactType]

  @inline def values: js.Array[AlternateContactType] = js.Array(BILLING, OPERATIONS, SECURITY)
}
