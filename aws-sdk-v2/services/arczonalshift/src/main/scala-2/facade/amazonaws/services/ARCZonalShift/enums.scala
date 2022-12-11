package facade.amazonaws.services.arczonalshift

import scalajs.js

@js.native
sealed trait AppliedStatus extends js.Any
object AppliedStatus {
  val APPLIED = "APPLIED".asInstanceOf[AppliedStatus]
  val NOT_APPLIED = "NOT_APPLIED".asInstanceOf[AppliedStatus]

  @inline def values: js.Array[AppliedStatus] = js.Array(APPLIED, NOT_APPLIED)
}

@js.native
sealed trait ZonalShiftStatus extends js.Any
object ZonalShiftStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ZonalShiftStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[ZonalShiftStatus]
  val CANCELED = "CANCELED".asInstanceOf[ZonalShiftStatus]

  @inline def values: js.Array[ZonalShiftStatus] = js.Array(ACTIVE, EXPIRED, CANCELED)
}
