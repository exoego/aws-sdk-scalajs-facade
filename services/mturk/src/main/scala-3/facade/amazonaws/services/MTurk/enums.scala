package facade.amazonaws.services.mturk

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AssignmentStatus extends js.Any
object AssignmentStatus {
  val Submitted = "Submitted".asInstanceOf[AssignmentStatus]
  val Approved = "Approved".asInstanceOf[AssignmentStatus]
  val Rejected = "Rejected".asInstanceOf[AssignmentStatus]

  @inline def values = js.Array(Submitted, Approved, Rejected)
}

@js.native
sealed trait Comparator extends js.Any
object Comparator {
  val LessThan = "LessThan".asInstanceOf[Comparator]
  val LessThanOrEqualTo = "LessThanOrEqualTo".asInstanceOf[Comparator]
  val GreaterThan = "GreaterThan".asInstanceOf[Comparator]
  val GreaterThanOrEqualTo = "GreaterThanOrEqualTo".asInstanceOf[Comparator]
  val EqualTo = "EqualTo".asInstanceOf[Comparator]
  val NotEqualTo = "NotEqualTo".asInstanceOf[Comparator]
  val Exists = "Exists".asInstanceOf[Comparator]
  val DoesNotExist = "DoesNotExist".asInstanceOf[Comparator]
  val In = "In".asInstanceOf[Comparator]
  val NotIn = "NotIn".asInstanceOf[Comparator]

  @inline def values = js.Array(LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, NotEqualTo, Exists, DoesNotExist, In, NotIn)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val AssignmentAccepted = "AssignmentAccepted".asInstanceOf[EventType]
  val AssignmentAbandoned = "AssignmentAbandoned".asInstanceOf[EventType]
  val AssignmentReturned = "AssignmentReturned".asInstanceOf[EventType]
  val AssignmentSubmitted = "AssignmentSubmitted".asInstanceOf[EventType]
  val AssignmentRejected = "AssignmentRejected".asInstanceOf[EventType]
  val AssignmentApproved = "AssignmentApproved".asInstanceOf[EventType]
  val HITCreated = "HITCreated".asInstanceOf[EventType]
  val HITExpired = "HITExpired".asInstanceOf[EventType]
  val HITReviewable = "HITReviewable".asInstanceOf[EventType]
  val HITExtended = "HITExtended".asInstanceOf[EventType]
  val HITDisposed = "HITDisposed".asInstanceOf[EventType]
  val Ping = "Ping".asInstanceOf[EventType]

  @inline def values = js.Array(
    AssignmentAccepted,
    AssignmentAbandoned,
    AssignmentReturned,
    AssignmentSubmitted,
    AssignmentRejected,
    AssignmentApproved,
    HITCreated,
    HITExpired,
    HITReviewable,
    HITExtended,
    HITDisposed,
    Ping
  )
}

@js.native
sealed trait HITAccessActions extends js.Any
object HITAccessActions {
  val Accept = "Accept".asInstanceOf[HITAccessActions]
  val PreviewAndAccept = "PreviewAndAccept".asInstanceOf[HITAccessActions]
  val DiscoverPreviewAndAccept = "DiscoverPreviewAndAccept".asInstanceOf[HITAccessActions]

  @inline def values = js.Array(Accept, PreviewAndAccept, DiscoverPreviewAndAccept)
}

@js.native
sealed trait HITReviewStatus extends js.Any
object HITReviewStatus {
  val NotReviewed = "NotReviewed".asInstanceOf[HITReviewStatus]
  val MarkedForReview = "MarkedForReview".asInstanceOf[HITReviewStatus]
  val ReviewedAppropriate = "ReviewedAppropriate".asInstanceOf[HITReviewStatus]
  val ReviewedInappropriate = "ReviewedInappropriate".asInstanceOf[HITReviewStatus]

  @inline def values = js.Array(NotReviewed, MarkedForReview, ReviewedAppropriate, ReviewedInappropriate)
}

@js.native
sealed trait HITStatus extends js.Any
object HITStatus {
  val Assignable = "Assignable".asInstanceOf[HITStatus]
  val Unassignable = "Unassignable".asInstanceOf[HITStatus]
  val Reviewable = "Reviewable".asInstanceOf[HITStatus]
  val Reviewing = "Reviewing".asInstanceOf[HITStatus]
  val Disposed = "Disposed".asInstanceOf[HITStatus]

  @inline def values = js.Array(Assignable, Unassignable, Reviewable, Reviewing, Disposed)
}

@js.native
sealed trait NotificationTransport extends js.Any
object NotificationTransport {
  val Email = "Email".asInstanceOf[NotificationTransport]
  val SQS = "SQS".asInstanceOf[NotificationTransport]
  val SNS = "SNS".asInstanceOf[NotificationTransport]

  @inline def values = js.Array(Email, SQS, SNS)
}

@js.native
sealed trait NotifyWorkersFailureCode extends js.Any
object NotifyWorkersFailureCode {
  val SoftFailure = "SoftFailure".asInstanceOf[NotifyWorkersFailureCode]
  val HardFailure = "HardFailure".asInstanceOf[NotifyWorkersFailureCode]

  @inline def values = js.Array(SoftFailure, HardFailure)
}

@js.native
sealed trait QualificationStatus extends js.Any
object QualificationStatus {
  val Granted = "Granted".asInstanceOf[QualificationStatus]
  val Revoked = "Revoked".asInstanceOf[QualificationStatus]

  @inline def values = js.Array(Granted, Revoked)
}

@js.native
sealed trait QualificationTypeStatus extends js.Any
object QualificationTypeStatus {
  val Active = "Active".asInstanceOf[QualificationTypeStatus]
  val Inactive = "Inactive".asInstanceOf[QualificationTypeStatus]

  @inline def values = js.Array(Active, Inactive)
}

@js.native
sealed trait ReviewActionStatus extends js.Any
object ReviewActionStatus {
  val Intended = "Intended".asInstanceOf[ReviewActionStatus]
  val Succeeded = "Succeeded".asInstanceOf[ReviewActionStatus]
  val Failed = "Failed".asInstanceOf[ReviewActionStatus]
  val Cancelled = "Cancelled".asInstanceOf[ReviewActionStatus]

  @inline def values = js.Array(Intended, Succeeded, Failed, Cancelled)
}

@js.native
sealed trait ReviewPolicyLevel extends js.Any
object ReviewPolicyLevel {
  val Assignment = "Assignment".asInstanceOf[ReviewPolicyLevel]
  val HIT = "HIT".asInstanceOf[ReviewPolicyLevel]

  @inline def values = js.Array(Assignment, HIT)
}

@js.native
sealed trait ReviewableHITStatus extends js.Any
object ReviewableHITStatus {
  val Reviewable = "Reviewable".asInstanceOf[ReviewableHITStatus]
  val Reviewing = "Reviewing".asInstanceOf[ReviewableHITStatus]

  @inline def values = js.Array(Reviewable, Reviewing)
}
