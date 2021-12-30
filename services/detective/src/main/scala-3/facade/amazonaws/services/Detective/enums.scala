package facade.amazonaws.services.detective

import scalajs.js

type MemberDisabledReason = "VOLUME_TOO_HIGH" | "VOLUME_UNKNOWN"
object MemberDisabledReason {
  inline val VOLUME_TOO_HIGH: "VOLUME_TOO_HIGH" = "VOLUME_TOO_HIGH"
  inline val VOLUME_UNKNOWN: "VOLUME_UNKNOWN" = "VOLUME_UNKNOWN"

  inline def values: js.Array[MemberDisabledReason] = js.Array(VOLUME_TOO_HIGH, VOLUME_UNKNOWN)
}

type MemberStatus = "INVITED" | "VERIFICATION_IN_PROGRESS" | "VERIFICATION_FAILED" | "ENABLED" | "ACCEPTED_BUT_DISABLED"
object MemberStatus {
  inline val INVITED: "INVITED" = "INVITED"
  inline val VERIFICATION_IN_PROGRESS: "VERIFICATION_IN_PROGRESS" = "VERIFICATION_IN_PROGRESS"
  inline val VERIFICATION_FAILED: "VERIFICATION_FAILED" = "VERIFICATION_FAILED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val ACCEPTED_BUT_DISABLED: "ACCEPTED_BUT_DISABLED" = "ACCEPTED_BUT_DISABLED"

  inline def values: js.Array[MemberStatus] = js.Array(INVITED, VERIFICATION_IN_PROGRESS, VERIFICATION_FAILED, ENABLED, ACCEPTED_BUT_DISABLED)
}
