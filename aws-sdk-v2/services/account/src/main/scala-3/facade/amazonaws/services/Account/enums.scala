package facade.amazonaws.services.account

import scalajs.js

type AlternateContactType = "BILLING" | "OPERATIONS" | "SECURITY"
object AlternateContactType {
  inline val BILLING: "BILLING" = "BILLING"
  inline val OPERATIONS: "OPERATIONS" = "OPERATIONS"
  inline val SECURITY: "SECURITY" = "SECURITY"

  inline def values: js.Array[AlternateContactType] = js.Array(BILLING, OPERATIONS, SECURITY)
}
