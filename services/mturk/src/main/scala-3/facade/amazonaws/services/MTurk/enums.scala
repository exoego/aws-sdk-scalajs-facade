package facade.amazonaws.services.mturk

import scalajs.js

type AssignmentStatus = "Submitted" | "Approved" | "Rejected"
object AssignmentStatus {
  inline val Submitted: "Submitted" = "Submitted"
  inline val Approved: "Approved" = "Approved"
  inline val Rejected: "Rejected" = "Rejected"

  inline def values: js.Array[AssignmentStatus] = js.Array(Submitted, Approved, Rejected)
}

type Comparator = "LessThan" | "LessThanOrEqualTo" | "GreaterThan" | "GreaterThanOrEqualTo" | "EqualTo" | "NotEqualTo" | "Exists" | "DoesNotExist" | "In" | "NotIn"
object Comparator {
  inline val LessThan: "LessThan" = "LessThan"
  inline val LessThanOrEqualTo: "LessThanOrEqualTo" = "LessThanOrEqualTo"
  inline val GreaterThan: "GreaterThan" = "GreaterThan"
  inline val GreaterThanOrEqualTo: "GreaterThanOrEqualTo" = "GreaterThanOrEqualTo"
  inline val EqualTo: "EqualTo" = "EqualTo"
  inline val NotEqualTo: "NotEqualTo" = "NotEqualTo"
  inline val Exists: "Exists" = "Exists"
  inline val DoesNotExist: "DoesNotExist" = "DoesNotExist"
  inline val In: "In" = "In"
  inline val NotIn: "NotIn" = "NotIn"

  inline def values: js.Array[Comparator] = js.Array(LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, NotEqualTo, Exists, DoesNotExist, In, NotIn)
}

type EventType = "AssignmentAccepted" | "AssignmentAbandoned" | "AssignmentReturned" | "AssignmentSubmitted" | "AssignmentRejected" | "AssignmentApproved" | "HITCreated" | "HITExpired" | "HITReviewable" | "HITExtended" | "HITDisposed" | "Ping"
object EventType {
  inline val AssignmentAccepted: "AssignmentAccepted" = "AssignmentAccepted"
  inline val AssignmentAbandoned: "AssignmentAbandoned" = "AssignmentAbandoned"
  inline val AssignmentReturned: "AssignmentReturned" = "AssignmentReturned"
  inline val AssignmentSubmitted: "AssignmentSubmitted" = "AssignmentSubmitted"
  inline val AssignmentRejected: "AssignmentRejected" = "AssignmentRejected"
  inline val AssignmentApproved: "AssignmentApproved" = "AssignmentApproved"
  inline val HITCreated: "HITCreated" = "HITCreated"
  inline val HITExpired: "HITExpired" = "HITExpired"
  inline val HITReviewable: "HITReviewable" = "HITReviewable"
  inline val HITExtended: "HITExtended" = "HITExtended"
  inline val HITDisposed: "HITDisposed" = "HITDisposed"
  inline val Ping: "Ping" = "Ping"

  inline def values: js.Array[EventType] = js.Array(
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
  inline val Accept: "Accept" = "Accept"
  inline val PreviewAndAccept: "PreviewAndAccept" = "PreviewAndAccept"
  inline val DiscoverPreviewAndAccept: "DiscoverPreviewAndAccept" = "DiscoverPreviewAndAccept"

  inline def values: js.Array[HITAccessActions] = js.Array(Accept, PreviewAndAccept, DiscoverPreviewAndAccept)
}

type HITReviewStatus = "NotReviewed" | "MarkedForReview" | "ReviewedAppropriate" | "ReviewedInappropriate"
object HITReviewStatus {
  inline val NotReviewed: "NotReviewed" = "NotReviewed"
  inline val MarkedForReview: "MarkedForReview" = "MarkedForReview"
  inline val ReviewedAppropriate: "ReviewedAppropriate" = "ReviewedAppropriate"
  inline val ReviewedInappropriate: "ReviewedInappropriate" = "ReviewedInappropriate"

  inline def values: js.Array[HITReviewStatus] = js.Array(NotReviewed, MarkedForReview, ReviewedAppropriate, ReviewedInappropriate)
}

type HITStatus = "Assignable" | "Unassignable" | "Reviewable" | "Reviewing" | "Disposed"
object HITStatus {
  inline val Assignable: "Assignable" = "Assignable"
  inline val Unassignable: "Unassignable" = "Unassignable"
  inline val Reviewable: "Reviewable" = "Reviewable"
  inline val Reviewing: "Reviewing" = "Reviewing"
  inline val Disposed: "Disposed" = "Disposed"

  inline def values: js.Array[HITStatus] = js.Array(Assignable, Unassignable, Reviewable, Reviewing, Disposed)
}

type NotificationTransport = "Email" | "SQS" | "SNS"
object NotificationTransport {
  inline val Email: "Email" = "Email"
  inline val SQS: "SQS" = "SQS"
  inline val SNS: "SNS" = "SNS"

  inline def values: js.Array[NotificationTransport] = js.Array(Email, SQS, SNS)
}

type NotifyWorkersFailureCode = "SoftFailure" | "HardFailure"
object NotifyWorkersFailureCode {
  inline val SoftFailure: "SoftFailure" = "SoftFailure"
  inline val HardFailure: "HardFailure" = "HardFailure"

  inline def values: js.Array[NotifyWorkersFailureCode] = js.Array(SoftFailure, HardFailure)
}

type QualificationStatus = "Granted" | "Revoked"
object QualificationStatus {
  inline val Granted: "Granted" = "Granted"
  inline val Revoked: "Revoked" = "Revoked"

  inline def values: js.Array[QualificationStatus] = js.Array(Granted, Revoked)
}

type QualificationTypeStatus = "Active" | "Inactive"
object QualificationTypeStatus {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[QualificationTypeStatus] = js.Array(Active, Inactive)
}

type ReviewActionStatus = "Intended" | "Succeeded" | "Failed" | "Cancelled"
object ReviewActionStatus {
  inline val Intended: "Intended" = "Intended"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"
  inline val Cancelled: "Cancelled" = "Cancelled"

  inline def values: js.Array[ReviewActionStatus] = js.Array(Intended, Succeeded, Failed, Cancelled)
}

type ReviewPolicyLevel = "Assignment" | "HIT"
object ReviewPolicyLevel {
  inline val Assignment: "Assignment" = "Assignment"
  inline val HIT: "HIT" = "HIT"

  inline def values: js.Array[ReviewPolicyLevel] = js.Array(Assignment, HIT)
}

type ReviewableHITStatus = "Reviewable" | "Reviewing"
object ReviewableHITStatus {
  inline val Reviewable: "Reviewable" = "Reviewable"
  inline val Reviewing: "Reviewing" = "Reviewing"

  inline def values: js.Array[ReviewableHITStatus] = js.Array(Reviewable, Reviewing)
}
