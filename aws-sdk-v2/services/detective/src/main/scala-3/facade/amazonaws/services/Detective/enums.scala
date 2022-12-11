package facade.amazonaws.services.detective

import scalajs.js

type DatasourcePackage = "DETECTIVE_CORE" | "EKS_AUDIT"
object DatasourcePackage {
  inline val DETECTIVE_CORE: "DETECTIVE_CORE" = "DETECTIVE_CORE"
  inline val EKS_AUDIT: "EKS_AUDIT" = "EKS_AUDIT"

  inline def values: js.Array[DatasourcePackage] = js.Array(DETECTIVE_CORE, EKS_AUDIT)
}

type DatasourcePackageIngestState = "STARTED" | "STOPPED" | "DISABLED"
object DatasourcePackageIngestState {
  inline val STARTED: "STARTED" = "STARTED"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[DatasourcePackageIngestState] = js.Array(STARTED, STOPPED, DISABLED)
}

type InvitationType = "INVITATION" | "ORGANIZATION"
object InvitationType {
  inline val INVITATION: "INVITATION" = "INVITATION"
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"

  inline def values: js.Array[InvitationType] = js.Array(INVITATION, ORGANIZATION)
}

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
