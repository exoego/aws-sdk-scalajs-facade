package facade.amazonaws.services.wellarchitected

import scalajs.js

@js.native
sealed trait AnswerReason extends js.Any
object AnswerReason {
  val OUT_OF_SCOPE = "OUT_OF_SCOPE".asInstanceOf[AnswerReason]
  val BUSINESS_PRIORITIES = "BUSINESS_PRIORITIES".asInstanceOf[AnswerReason]
  val ARCHITECTURE_CONSTRAINTS = "ARCHITECTURE_CONSTRAINTS".asInstanceOf[AnswerReason]
  val OTHER = "OTHER".asInstanceOf[AnswerReason]
  val NONE = "NONE".asInstanceOf[AnswerReason]

  @inline def values: js.Array[AnswerReason] = js.Array(OUT_OF_SCOPE, BUSINESS_PRIORITIES, ARCHITECTURE_CONSTRAINTS, OTHER, NONE)
}

@js.native
sealed trait ChoiceReason extends js.Any
object ChoiceReason {
  val OUT_OF_SCOPE = "OUT_OF_SCOPE".asInstanceOf[ChoiceReason]
  val BUSINESS_PRIORITIES = "BUSINESS_PRIORITIES".asInstanceOf[ChoiceReason]
  val ARCHITECTURE_CONSTRAINTS = "ARCHITECTURE_CONSTRAINTS".asInstanceOf[ChoiceReason]
  val OTHER = "OTHER".asInstanceOf[ChoiceReason]
  val NONE = "NONE".asInstanceOf[ChoiceReason]

  @inline def values: js.Array[ChoiceReason] = js.Array(OUT_OF_SCOPE, BUSINESS_PRIORITIES, ARCHITECTURE_CONSTRAINTS, OTHER, NONE)
}

@js.native
sealed trait ChoiceStatus extends js.Any
object ChoiceStatus {
  val SELECTED = "SELECTED".asInstanceOf[ChoiceStatus]
  val NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[ChoiceStatus]
  val UNSELECTED = "UNSELECTED".asInstanceOf[ChoiceStatus]

  @inline def values: js.Array[ChoiceStatus] = js.Array(SELECTED, NOT_APPLICABLE, UNSELECTED)
}

@js.native
sealed trait DifferenceStatus extends js.Any
object DifferenceStatus {
  val UPDATED = "UPDATED".asInstanceOf[DifferenceStatus]
  val NEW = "NEW".asInstanceOf[DifferenceStatus]
  val DELETED = "DELETED".asInstanceOf[DifferenceStatus]

  @inline def values: js.Array[DifferenceStatus] = js.Array(UPDATED, NEW, DELETED)
}

@js.native
sealed trait ImportLensStatus extends js.Any
object ImportLensStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ImportLensStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[ImportLensStatus]
  val ERROR = "ERROR".asInstanceOf[ImportLensStatus]

  @inline def values: js.Array[ImportLensStatus] = js.Array(IN_PROGRESS, COMPLETE, ERROR)
}

@js.native
sealed trait LensStatus extends js.Any
object LensStatus {
  val CURRENT = "CURRENT".asInstanceOf[LensStatus]
  val NOT_CURRENT = "NOT_CURRENT".asInstanceOf[LensStatus]
  val DEPRECATED = "DEPRECATED".asInstanceOf[LensStatus]
  val DELETED = "DELETED".asInstanceOf[LensStatus]
  val UNSHARED = "UNSHARED".asInstanceOf[LensStatus]

  @inline def values: js.Array[LensStatus] = js.Array(CURRENT, NOT_CURRENT, DEPRECATED, DELETED, UNSHARED)
}

@js.native
sealed trait LensStatusType extends js.Any
object LensStatusType {
  val ALL = "ALL".asInstanceOf[LensStatusType]
  val DRAFT = "DRAFT".asInstanceOf[LensStatusType]
  val PUBLISHED = "PUBLISHED".asInstanceOf[LensStatusType]

  @inline def values: js.Array[LensStatusType] = js.Array(ALL, DRAFT, PUBLISHED)
}

@js.native
sealed trait LensType extends js.Any
object LensType {
  val AWS_OFFICIAL = "AWS_OFFICIAL".asInstanceOf[LensType]
  val CUSTOM_SHARED = "CUSTOM_SHARED".asInstanceOf[LensType]
  val CUSTOM_SELF = "CUSTOM_SELF".asInstanceOf[LensType]

  @inline def values: js.Array[LensType] = js.Array(AWS_OFFICIAL, CUSTOM_SHARED, CUSTOM_SELF)
}

@js.native
sealed trait NotificationType extends js.Any
object NotificationType {
  val LENS_VERSION_UPGRADED = "LENS_VERSION_UPGRADED".asInstanceOf[NotificationType]
  val LENS_VERSION_DEPRECATED = "LENS_VERSION_DEPRECATED".asInstanceOf[NotificationType]

  @inline def values: js.Array[NotificationType] = js.Array(LENS_VERSION_UPGRADED, LENS_VERSION_DEPRECATED)
}

/** Permission granted on a workload share.
  */
@js.native
sealed trait PermissionType extends js.Any
object PermissionType {
  val READONLY = "READONLY".asInstanceOf[PermissionType]
  val CONTRIBUTOR = "CONTRIBUTOR".asInstanceOf[PermissionType]

  @inline def values: js.Array[PermissionType] = js.Array(READONLY, CONTRIBUTOR)
}

/** The risk for a given workload, lens review, pillar, or question.
  */
@js.native
sealed trait Risk extends js.Any
object Risk {
  val UNANSWERED = "UNANSWERED".asInstanceOf[Risk]
  val HIGH = "HIGH".asInstanceOf[Risk]
  val MEDIUM = "MEDIUM".asInstanceOf[Risk]
  val NONE = "NONE".asInstanceOf[Risk]
  val NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[Risk]

  @inline def values: js.Array[Risk] = js.Array(UNANSWERED, HIGH, MEDIUM, NONE, NOT_APPLICABLE)
}

/** Share invitation action taken by contributor.
  */
@js.native
sealed trait ShareInvitationAction extends js.Any
object ShareInvitationAction {
  val ACCEPT = "ACCEPT".asInstanceOf[ShareInvitationAction]
  val REJECT = "REJECT".asInstanceOf[ShareInvitationAction]

  @inline def values: js.Array[ShareInvitationAction] = js.Array(ACCEPT, REJECT)
}

@js.native
sealed trait ShareResourceType extends js.Any
object ShareResourceType {
  val WORKLOAD = "WORKLOAD".asInstanceOf[ShareResourceType]
  val LENS = "LENS".asInstanceOf[ShareResourceType]

  @inline def values: js.Array[ShareResourceType] = js.Array(WORKLOAD, LENS)
}

/** The status of a workload share.
  */
@js.native
sealed trait ShareStatus extends js.Any
object ShareStatus {
  val ACCEPTED = "ACCEPTED".asInstanceOf[ShareStatus]
  val REJECTED = "REJECTED".asInstanceOf[ShareStatus]
  val PENDING = "PENDING".asInstanceOf[ShareStatus]
  val REVOKED = "REVOKED".asInstanceOf[ShareStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[ShareStatus]

  @inline def values: js.Array[ShareStatus] = js.Array(ACCEPTED, REJECTED, PENDING, REVOKED, EXPIRED)
}

/** The environment for the workload.
  */
@js.native
sealed trait WorkloadEnvironment extends js.Any
object WorkloadEnvironment {
  val PRODUCTION = "PRODUCTION".asInstanceOf[WorkloadEnvironment]
  val PREPRODUCTION = "PREPRODUCTION".asInstanceOf[WorkloadEnvironment]

  @inline def values: js.Array[WorkloadEnvironment] = js.Array(PRODUCTION, PREPRODUCTION)
}

/** The improvement status for a workload.
  */
@js.native
sealed trait WorkloadImprovementStatus extends js.Any
object WorkloadImprovementStatus {
  val NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[WorkloadImprovementStatus]
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[WorkloadImprovementStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[WorkloadImprovementStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[WorkloadImprovementStatus]
  val RISK_ACKNOWLEDGED = "RISK_ACKNOWLEDGED".asInstanceOf[WorkloadImprovementStatus]

  @inline def values: js.Array[WorkloadImprovementStatus] = js.Array(NOT_APPLICABLE, NOT_STARTED, IN_PROGRESS, COMPLETE, RISK_ACKNOWLEDGED)
}
