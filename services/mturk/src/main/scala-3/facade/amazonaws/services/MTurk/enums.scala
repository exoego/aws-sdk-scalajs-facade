package facade.amazonaws.services.mturk

import scalajs._

type AssignmentStatus = "Submitted" | "Approved" | "Rejected"
object AssignmentStatus {
  val Submitted: "Submitted" = "Submitted"
  val Approved: "Approved" = "Approved"
  val Rejected: "Rejected" = "Rejected"

  @inline def values = js.Array[AssignmentStatus](Submitted, Approved, Rejected)
}

type Comparator = "LessThan" | "LessThanOrEqualTo" | "GreaterThan" | "GreaterThanOrEqualTo" | "EqualTo" | "NotEqualTo" | "Exists" | "DoesNotExist" | "In" | "NotIn"
object Comparator {
  val LessThan: "LessThan" = "LessThan"
  val LessThanOrEqualTo: "LessThanOrEqualTo" = "LessThanOrEqualTo"
  val GreaterThan: "GreaterThan" = "GreaterThan"
  val GreaterThanOrEqualTo: "GreaterThanOrEqualTo" = "GreaterThanOrEqualTo"
  val EqualTo: "EqualTo" = "EqualTo"
  val NotEqualTo: "NotEqualTo" = "NotEqualTo"
  val Exists: "Exists" = "Exists"
  val DoesNotExist: "DoesNotExist" = "DoesNotExist"
  val In: "In" = "In"
  val NotIn: "NotIn" = "NotIn"

  @inline def values = js.Array[Comparator](LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, NotEqualTo, Exists, DoesNotExist, In, NotIn)
}

type EventType = "AssignmentAccepted" | "AssignmentAbandoned" | "AssignmentReturned" | "AssignmentSubmitted" | "AssignmentRejected" | "AssignmentApproved" | "HITCreated" | "HITExpired" | "HITReviewable" | "HITExtended" | "HITDisposed" | "Ping"
object EventType {
  val AssignmentAccepted: "AssignmentAccepted" = "AssignmentAccepted"
  val AssignmentAbandoned: "AssignmentAbandoned" = "AssignmentAbandoned"
  val AssignmentReturned: "AssignmentReturned" = "AssignmentReturned"
  val AssignmentSubmitted: "AssignmentSubmitted" = "AssignmentSubmitted"
  val AssignmentRejected: "AssignmentRejected" = "AssignmentRejected"
  val AssignmentApproved: "AssignmentApproved" = "AssignmentApproved"
  val HITCreated: "HITCreated" = "HITCreated"
  val HITExpired: "HITExpired" = "HITExpired"
  val HITReviewable: "HITReviewable" = "HITReviewable"
  val HITExtended: "HITExtended" = "HITExtended"
  val HITDisposed: "HITDisposed" = "HITDisposed"
  val Ping: "Ping" = "Ping"

  @inline def values = js.Array[EventType](
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

type HITAccessActions = "Accept" | "PreviewAndAccept" | "DiscoverPreviewAndAccept"
object HITAccessActions {
  val Accept: "Accept" = "Accept"
  val PreviewAndAccept: "PreviewAndAccept" = "PreviewAndAccept"
  val DiscoverPreviewAndAccept: "DiscoverPreviewAndAccept" = "DiscoverPreviewAndAccept"

  @inline def values = js.Array[HITAccessActions](Accept, PreviewAndAccept, DiscoverPreviewAndAccept)
}

type HITReviewStatus = "NotReviewed" | "MarkedForReview" | "ReviewedAppropriate" | "ReviewedInappropriate"
object HITReviewStatus {
  val NotReviewed: "NotReviewed" = "NotReviewed"
  val MarkedForReview: "MarkedForReview" = "MarkedForReview"
  val ReviewedAppropriate: "ReviewedAppropriate" = "ReviewedAppropriate"
  val ReviewedInappropriate: "ReviewedInappropriate" = "ReviewedInappropriate"

  @inline def values = js.Array[HITReviewStatus](NotReviewed, MarkedForReview, ReviewedAppropriate, ReviewedInappropriate)
}

type HITStatus = "Assignable" | "Unassignable" | "Reviewable" | "Reviewing" | "Disposed"
object HITStatus {
  val Assignable: "Assignable" = "Assignable"
  val Unassignable: "Unassignable" = "Unassignable"
  val Reviewable: "Reviewable" = "Reviewable"
  val Reviewing: "Reviewing" = "Reviewing"
  val Disposed: "Disposed" = "Disposed"

  @inline def values = js.Array[HITStatus](Assignable, Unassignable, Reviewable, Reviewing, Disposed)
}

type NotificationTransport = "Email" | "SQS" | "SNS"
object NotificationTransport {
  val Email: "Email" = "Email"
  val SQS: "SQS" = "SQS"
  val SNS: "SNS" = "SNS"

  @inline def values = js.Array[NotificationTransport](Email, SQS, SNS)
}

type NotifyWorkersFailureCode = "SoftFailure" | "HardFailure"
object NotifyWorkersFailureCode {
  val SoftFailure: "SoftFailure" = "SoftFailure"
  val HardFailure: "HardFailure" = "HardFailure"

  @inline def values = js.Array[NotifyWorkersFailureCode](SoftFailure, HardFailure)
}

type QualificationStatus = "Granted" | "Revoked"
object QualificationStatus {
  val Granted: "Granted" = "Granted"
  val Revoked: "Revoked" = "Revoked"

  @inline def values = js.Array[QualificationStatus](Granted, Revoked)
}

type QualificationTypeStatus = "Active" | "Inactive"
object QualificationTypeStatus {
  val Active: "Active" = "Active"
  val Inactive: "Inactive" = "Inactive"

  @inline def values = js.Array[QualificationTypeStatus](Active, Inactive)
}

type ReviewActionStatus = "Intended" | "Succeeded" | "Failed" | "Cancelled"
object ReviewActionStatus {
  val Intended: "Intended" = "Intended"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"
  val Cancelled: "Cancelled" = "Cancelled"

  @inline def values = js.Array[ReviewActionStatus](Intended, Succeeded, Failed, Cancelled)
}

type ReviewPolicyLevel = "Assignment" | "HIT"
object ReviewPolicyLevel {
  val Assignment: "Assignment" = "Assignment"
  val HIT: "HIT" = "HIT"

  @inline def values = js.Array[ReviewPolicyLevel](Assignment, HIT)
}

type ReviewableHITStatus = "Reviewable" | "Reviewing"
object ReviewableHITStatus {
  val Reviewable: "Reviewable" = "Reviewable"
  val Reviewing: "Reviewing" = "Reviewing"

  @inline def values = js.Array[ReviewableHITStatus](Reviewable, Reviewing)
}
