package facade.amazonaws.services.wellarchitected

import scalajs._

type DifferenceStatus = "UPDATED" | "NEW" | "DELETED"
object DifferenceStatus {
  val UPDATED: "UPDATED" = "UPDATED"
  val NEW: "NEW" = "NEW"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[DifferenceStatus](UPDATED, NEW, DELETED)
}

type LensStatus = "CURRENT" | "NOT_CURRENT" | "DEPRECATED"
object LensStatus {
  val CURRENT: "CURRENT" = "CURRENT"
  val NOT_CURRENT: "NOT_CURRENT" = "NOT_CURRENT"
  val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  @inline def values = js.Array[LensStatus](CURRENT, NOT_CURRENT, DEPRECATED)
}

type NotificationType = "LENS_VERSION_UPGRADED" | "LENS_VERSION_DEPRECATED"
object NotificationType {
  val LENS_VERSION_UPGRADED: "LENS_VERSION_UPGRADED" = "LENS_VERSION_UPGRADED"
  val LENS_VERSION_DEPRECATED: "LENS_VERSION_DEPRECATED" = "LENS_VERSION_DEPRECATED"

  @inline def values = js.Array[NotificationType](LENS_VERSION_UPGRADED, LENS_VERSION_DEPRECATED)
}

/** Permission granted on a workload share.
  */
type PermissionType = "READONLY" | "CONTRIBUTOR"
object PermissionType {
  val READONLY: "READONLY" = "READONLY"
  val CONTRIBUTOR: "CONTRIBUTOR" = "CONTRIBUTOR"

  @inline def values = js.Array[PermissionType](READONLY, CONTRIBUTOR)
}

/** The risk for a given workload, lens review, pillar, or question.
  */
type Risk = "UNANSWERED" | "HIGH" | "MEDIUM" | "NONE" | "NOT_APPLICABLE"
object Risk {
  val UNANSWERED: "UNANSWERED" = "UNANSWERED"
  val HIGH: "HIGH" = "HIGH"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val NONE: "NONE" = "NONE"
  val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"

  @inline def values = js.Array[Risk](UNANSWERED, HIGH, MEDIUM, NONE, NOT_APPLICABLE)
}

/** Share invitation action taken by contributor.
  */
type ShareInvitationAction = "ACCEPT" | "REJECT"
object ShareInvitationAction {
  val ACCEPT: "ACCEPT" = "ACCEPT"
  val REJECT: "REJECT" = "REJECT"

  @inline def values = js.Array[ShareInvitationAction](ACCEPT, REJECT)
}

/** The status of a workload share.
  */
type ShareStatus = "ACCEPTED" | "REJECTED" | "PENDING" | "REVOKED" | "EXPIRED"
object ShareStatus {
  val ACCEPTED: "ACCEPTED" = "ACCEPTED"
  val REJECTED: "REJECTED" = "REJECTED"
  val PENDING: "PENDING" = "PENDING"
  val REVOKED: "REVOKED" = "REVOKED"
  val EXPIRED: "EXPIRED" = "EXPIRED"

  @inline def values = js.Array[ShareStatus](ACCEPTED, REJECTED, PENDING, REVOKED, EXPIRED)
}

/** The environment for the workload.
  */
type WorkloadEnvironment = "PRODUCTION" | "PREPRODUCTION"
object WorkloadEnvironment {
  val PRODUCTION: "PRODUCTION" = "PRODUCTION"
  val PREPRODUCTION: "PREPRODUCTION" = "PREPRODUCTION"

  @inline def values = js.Array[WorkloadEnvironment](PRODUCTION, PREPRODUCTION)
}

/** The improvement status for a workload.
  */
type WorkloadImprovementStatus = "NOT_APPLICABLE" | "NOT_STARTED" | "IN_PROGRESS" | "COMPLETE" | "RISK_ACKNOWLEDGED"
object WorkloadImprovementStatus {
  val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"
  val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val RISK_ACKNOWLEDGED: "RISK_ACKNOWLEDGED" = "RISK_ACKNOWLEDGED"

  @inline def values = js.Array[WorkloadImprovementStatus](NOT_APPLICABLE, NOT_STARTED, IN_PROGRESS, COMPLETE, RISK_ACKNOWLEDGED)
}
