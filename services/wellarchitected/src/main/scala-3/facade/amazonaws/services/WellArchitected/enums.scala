package facade.amazonaws.services.wellarchitected

import scalajs._

type DifferenceStatus = "UPDATED" | "NEW" | "DELETED"
object DifferenceStatus {
  inline val UPDATED: "UPDATED" = "UPDATED"
  inline val NEW: "NEW" = "NEW"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[DifferenceStatus] = js.Array(UPDATED, NEW, DELETED)
}

type LensStatus = "CURRENT" | "NOT_CURRENT" | "DEPRECATED"
object LensStatus {
  inline val CURRENT: "CURRENT" = "CURRENT"
  inline val NOT_CURRENT: "NOT_CURRENT" = "NOT_CURRENT"
  inline val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  inline def values: js.Array[LensStatus] = js.Array(CURRENT, NOT_CURRENT, DEPRECATED)
}

type NotificationType = "LENS_VERSION_UPGRADED" | "LENS_VERSION_DEPRECATED"
object NotificationType {
  inline val LENS_VERSION_UPGRADED: "LENS_VERSION_UPGRADED" = "LENS_VERSION_UPGRADED"
  inline val LENS_VERSION_DEPRECATED: "LENS_VERSION_DEPRECATED" = "LENS_VERSION_DEPRECATED"

  inline def values: js.Array[NotificationType] = js.Array(LENS_VERSION_UPGRADED, LENS_VERSION_DEPRECATED)
}

/** Permission granted on a workload share.
  */
type PermissionType = "READONLY" | "CONTRIBUTOR"
object PermissionType {
  inline val READONLY: "READONLY" = "READONLY"
  inline val CONTRIBUTOR: "CONTRIBUTOR" = "CONTRIBUTOR"

  inline def values: js.Array[PermissionType] = js.Array(READONLY, CONTRIBUTOR)
}

/** The risk for a given workload, lens review, pillar, or question.
  */
type Risk = "UNANSWERED" | "HIGH" | "MEDIUM" | "NONE" | "NOT_APPLICABLE"
object Risk {
  inline val UNANSWERED: "UNANSWERED" = "UNANSWERED"
  inline val HIGH: "HIGH" = "HIGH"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val NONE: "NONE" = "NONE"
  inline val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"

  inline def values: js.Array[Risk] = js.Array(UNANSWERED, HIGH, MEDIUM, NONE, NOT_APPLICABLE)
}

/** Share invitation action taken by contributor.
  */
type ShareInvitationAction = "ACCEPT" | "REJECT"
object ShareInvitationAction {
  inline val ACCEPT: "ACCEPT" = "ACCEPT"
  inline val REJECT: "REJECT" = "REJECT"

  inline def values: js.Array[ShareInvitationAction] = js.Array(ACCEPT, REJECT)
}

/** The status of a workload share.
  */
type ShareStatus = "ACCEPTED" | "REJECTED" | "PENDING" | "REVOKED" | "EXPIRED"
object ShareStatus {
  inline val ACCEPTED: "ACCEPTED" = "ACCEPTED"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val REVOKED: "REVOKED" = "REVOKED"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"

  inline def values: js.Array[ShareStatus] = js.Array(ACCEPTED, REJECTED, PENDING, REVOKED, EXPIRED)
}

/** The environment for the workload.
  */
type WorkloadEnvironment = "PRODUCTION" | "PREPRODUCTION"
object WorkloadEnvironment {
  inline val PRODUCTION: "PRODUCTION" = "PRODUCTION"
  inline val PREPRODUCTION: "PREPRODUCTION" = "PREPRODUCTION"

  inline def values: js.Array[WorkloadEnvironment] = js.Array(PRODUCTION, PREPRODUCTION)
}

/** The improvement status for a workload.
  */
type WorkloadImprovementStatus = "NOT_APPLICABLE" | "NOT_STARTED" | "IN_PROGRESS" | "COMPLETE" | "RISK_ACKNOWLEDGED"
object WorkloadImprovementStatus {
  inline val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val RISK_ACKNOWLEDGED: "RISK_ACKNOWLEDGED" = "RISK_ACKNOWLEDGED"

  inline def values: js.Array[WorkloadImprovementStatus] = js.Array(NOT_APPLICABLE, NOT_STARTED, IN_PROGRESS, COMPLETE, RISK_ACKNOWLEDGED)
}
