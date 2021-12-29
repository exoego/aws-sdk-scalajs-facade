package facade.amazonaws.services.detective

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait MemberDisabledReason extends js.Any
object MemberDisabledReason {
  val VOLUME_TOO_HIGH = "VOLUME_TOO_HIGH".asInstanceOf[MemberDisabledReason]
  val VOLUME_UNKNOWN = "VOLUME_UNKNOWN".asInstanceOf[MemberDisabledReason]

  @inline def values = js.Array(VOLUME_TOO_HIGH, VOLUME_UNKNOWN)
}

@js.native
sealed trait MemberStatus extends js.Any
object MemberStatus {
  val INVITED = "INVITED".asInstanceOf[MemberStatus]
  val VERIFICATION_IN_PROGRESS = "VERIFICATION_IN_PROGRESS".asInstanceOf[MemberStatus]
  val VERIFICATION_FAILED = "VERIFICATION_FAILED".asInstanceOf[MemberStatus]
  val ENABLED = "ENABLED".asInstanceOf[MemberStatus]
  val ACCEPTED_BUT_DISABLED = "ACCEPTED_BUT_DISABLED".asInstanceOf[MemberStatus]

  @inline def values = js.Array(INVITED, VERIFICATION_IN_PROGRESS, VERIFICATION_FAILED, ENABLED, ACCEPTED_BUT_DISABLED)
}

