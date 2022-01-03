package facade.amazonaws.services.marketplaceentitlementservice

import scalajs.js

@js.native
sealed trait GetEntitlementFilterName extends js.Any
object GetEntitlementFilterName {
  val CUSTOMER_IDENTIFIER = "CUSTOMER_IDENTIFIER".asInstanceOf[GetEntitlementFilterName]
  val DIMENSION = "DIMENSION".asInstanceOf[GetEntitlementFilterName]

  @inline def values: js.Array[GetEntitlementFilterName] = js.Array(CUSTOMER_IDENTIFIER, DIMENSION)
}