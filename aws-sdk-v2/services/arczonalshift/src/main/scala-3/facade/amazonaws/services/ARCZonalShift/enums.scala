package facade.amazonaws.services.arczonalshift

import scalajs.js

type AppliedStatus = "APPLIED" | "NOT_APPLIED"
object AppliedStatus {
  inline val APPLIED: "APPLIED" = "APPLIED"
  inline val NOT_APPLIED: "NOT_APPLIED" = "NOT_APPLIED"

  inline def values: js.Array[AppliedStatus] = js.Array(APPLIED, NOT_APPLIED)
}

type ZonalShiftStatus = "ACTIVE" | "EXPIRED" | "CANCELED"
object ZonalShiftStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[ZonalShiftStatus] = js.Array(ACTIVE, EXPIRED, CANCELED)
}
