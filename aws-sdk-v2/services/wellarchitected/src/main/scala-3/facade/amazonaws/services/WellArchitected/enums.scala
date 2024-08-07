package facade.amazonaws.services.wellarchitected

import scalajs.js

type AnswerReason = "OUT_OF_SCOPE" | "BUSINESS_PRIORITIES" | "ARCHITECTURE_CONSTRAINTS" | "OTHER" | "NONE"
object AnswerReason {
  inline val OUT_OF_SCOPE: "OUT_OF_SCOPE" = "OUT_OF_SCOPE"
  inline val BUSINESS_PRIORITIES: "BUSINESS_PRIORITIES" = "BUSINESS_PRIORITIES"
  inline val ARCHITECTURE_CONSTRAINTS: "ARCHITECTURE_CONSTRAINTS" = "ARCHITECTURE_CONSTRAINTS"
  inline val OTHER: "OTHER" = "OTHER"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[AnswerReason] = js.Array(OUT_OF_SCOPE, BUSINESS_PRIORITIES, ARCHITECTURE_CONSTRAINTS, OTHER, NONE)
}

type ChoiceReason = "OUT_OF_SCOPE" | "BUSINESS_PRIORITIES" | "ARCHITECTURE_CONSTRAINTS" | "OTHER" | "NONE"
object ChoiceReason {
  inline val OUT_OF_SCOPE: "OUT_OF_SCOPE" = "OUT_OF_SCOPE"
  inline val BUSINESS_PRIORITIES: "BUSINESS_PRIORITIES" = "BUSINESS_PRIORITIES"
  inline val ARCHITECTURE_CONSTRAINTS: "ARCHITECTURE_CONSTRAINTS" = "ARCHITECTURE_CONSTRAINTS"
  inline val OTHER: "OTHER" = "OTHER"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ChoiceReason] = js.Array(OUT_OF_SCOPE, BUSINESS_PRIORITIES, ARCHITECTURE_CONSTRAINTS, OTHER, NONE)
}

type ChoiceStatus = "SELECTED" | "NOT_APPLICABLE" | "UNSELECTED"
object ChoiceStatus {
  inline val SELECTED: "SELECTED" = "SELECTED"
  inline val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"
  inline val UNSELECTED: "UNSELECTED" = "UNSELECTED"

  inline def values: js.Array[ChoiceStatus] = js.Array(SELECTED, NOT_APPLICABLE, UNSELECTED)
}

type DifferenceStatus = "UPDATED" | "NEW" | "DELETED"
object DifferenceStatus {
  inline val UPDATED: "UPDATED" = "UPDATED"
  inline val NEW: "NEW" = "NEW"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[DifferenceStatus] = js.Array(UPDATED, NEW, DELETED)
}

type ImportLensStatus = "IN_PROGRESS" | "COMPLETE" | "ERROR"
object ImportLensStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[ImportLensStatus] = js.Array(IN_PROGRESS, COMPLETE, ERROR)
}

type LensStatus = "CURRENT" | "NOT_CURRENT" | "DEPRECATED" | "DELETED" | "UNSHARED"
object LensStatus {
  inline val CURRENT: "CURRENT" = "CURRENT"
  inline val NOT_CURRENT: "NOT_CURRENT" = "NOT_CURRENT"
  inline val DEPRECATED: "DEPRECATED" = "DEPRECATED"
  inline val DELETED: "DELETED" = "DELETED"
  inline val UNSHARED: "UNSHARED" = "UNSHARED"

  inline def values: js.Array[LensStatus] = js.Array(CURRENT, NOT_CURRENT, DEPRECATED, DELETED, UNSHARED)
}

type LensStatusType = "ALL" | "DRAFT" | "PUBLISHED"
object LensStatusType {
  inline val ALL: "ALL" = "ALL"
  inline val DRAFT: "DRAFT" = "DRAFT"
  inline val PUBLISHED: "PUBLISHED" = "PUBLISHED"

  inline def values: js.Array[LensStatusType] = js.Array(ALL, DRAFT, PUBLISHED)
}

type LensType = "AWS_OFFICIAL" | "CUSTOM_SHARED" | "CUSTOM_SELF"
object LensType {
  inline val AWS_OFFICIAL: "AWS_OFFICIAL" = "AWS_OFFICIAL"
  inline val CUSTOM_SHARED: "CUSTOM_SHARED" = "CUSTOM_SHARED"
  inline val CUSTOM_SELF: "CUSTOM_SELF" = "CUSTOM_SELF"

  inline def values: js.Array[LensType] = js.Array(AWS_OFFICIAL, CUSTOM_SHARED, CUSTOM_SELF)
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

type ShareResourceType = "WORKLOAD" | "LENS"
object ShareResourceType {
  inline val WORKLOAD: "WORKLOAD" = "WORKLOAD"
  inline val LENS: "LENS" = "LENS"

  inline def values: js.Array[ShareResourceType] = js.Array(WORKLOAD, LENS)
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
