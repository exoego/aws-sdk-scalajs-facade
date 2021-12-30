package facade.amazonaws.services.marketplaceentitlementservice

import scalajs.js

type GetEntitlementFilterName = "CUSTOMER_IDENTIFIER" | "DIMENSION"
object GetEntitlementFilterName {
  inline val CUSTOMER_IDENTIFIER: "CUSTOMER_IDENTIFIER" = "CUSTOMER_IDENTIFIER"
  inline val DIMENSION: "DIMENSION" = "DIMENSION"

  inline def values: js.Array[GetEntitlementFilterName] = js.Array(CUSTOMER_IDENTIFIER, DIMENSION)
}
