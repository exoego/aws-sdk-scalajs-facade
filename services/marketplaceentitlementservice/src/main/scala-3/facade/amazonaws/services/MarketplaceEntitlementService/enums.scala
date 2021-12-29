package facade.amazonaws.services.marketplaceentitlementservice

import scalajs._

type GetEntitlementFilterName = "CUSTOMER_IDENTIFIER" | "DIMENSION"
object GetEntitlementFilterName {
  val CUSTOMER_IDENTIFIER: "CUSTOMER_IDENTIFIER" = "CUSTOMER_IDENTIFIER"
  val DIMENSION: "DIMENSION" = "DIMENSION"

  @inline def values = js.Array[GetEntitlementFilterName](CUSTOMER_IDENTIFIER, DIMENSION)
}
