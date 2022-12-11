package facade.amazonaws.services.voiceid

import scalajs.js

type AuthenticationDecision = "ACCEPT" | "REJECT" | "NOT_ENOUGH_SPEECH" | "SPEAKER_NOT_ENROLLED" | "SPEAKER_OPTED_OUT" | "SPEAKER_ID_NOT_PROVIDED" | "SPEAKER_EXPIRED"
object AuthenticationDecision {
  inline val ACCEPT: "ACCEPT" = "ACCEPT"
  inline val REJECT: "REJECT" = "REJECT"
  inline val NOT_ENOUGH_SPEECH: "NOT_ENOUGH_SPEECH" = "NOT_ENOUGH_SPEECH"
  inline val SPEAKER_NOT_ENROLLED: "SPEAKER_NOT_ENROLLED" = "SPEAKER_NOT_ENROLLED"
  inline val SPEAKER_OPTED_OUT: "SPEAKER_OPTED_OUT" = "SPEAKER_OPTED_OUT"
  inline val SPEAKER_ID_NOT_PROVIDED: "SPEAKER_ID_NOT_PROVIDED" = "SPEAKER_ID_NOT_PROVIDED"
  inline val SPEAKER_EXPIRED: "SPEAKER_EXPIRED" = "SPEAKER_EXPIRED"

  inline def values: js.Array[AuthenticationDecision] = js.Array(ACCEPT, REJECT, NOT_ENOUGH_SPEECH, SPEAKER_NOT_ENROLLED, SPEAKER_OPTED_OUT, SPEAKER_ID_NOT_PROVIDED, SPEAKER_EXPIRED)
}

type DomainStatus = "ACTIVE" | "PENDING" | "SUSPENDED"
object DomainStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"

  inline def values: js.Array[DomainStatus] = js.Array(ACTIVE, PENDING, SUSPENDED)
}

type DuplicateRegistrationAction = "SKIP" | "REGISTER_AS_NEW"
object DuplicateRegistrationAction {
  inline val SKIP: "SKIP" = "SKIP"
  inline val REGISTER_AS_NEW: "REGISTER_AS_NEW" = "REGISTER_AS_NEW"

  inline def values: js.Array[DuplicateRegistrationAction] = js.Array(SKIP, REGISTER_AS_NEW)
}

type ExistingEnrollmentAction = "SKIP" | "OVERWRITE"
object ExistingEnrollmentAction {
  inline val SKIP: "SKIP" = "SKIP"
  inline val OVERWRITE: "OVERWRITE" = "OVERWRITE"

  inline def values: js.Array[ExistingEnrollmentAction] = js.Array(SKIP, OVERWRITE)
}

type FraudDetectionAction = "IGNORE" | "FAIL"
object FraudDetectionAction {
  inline val IGNORE: "IGNORE" = "IGNORE"
  inline val FAIL: "FAIL" = "FAIL"

  inline def values: js.Array[FraudDetectionAction] = js.Array(IGNORE, FAIL)
}

type FraudDetectionDecision = "HIGH_RISK" | "LOW_RISK" | "NOT_ENOUGH_SPEECH"
object FraudDetectionDecision {
  inline val HIGH_RISK: "HIGH_RISK" = "HIGH_RISK"
  inline val LOW_RISK: "LOW_RISK" = "LOW_RISK"
  inline val NOT_ENOUGH_SPEECH: "NOT_ENOUGH_SPEECH" = "NOT_ENOUGH_SPEECH"

  inline def values: js.Array[FraudDetectionDecision] = js.Array(HIGH_RISK, LOW_RISK, NOT_ENOUGH_SPEECH)
}

type FraudDetectionReason = "KNOWN_FRAUDSTER" | "VOICE_SPOOFING"
object FraudDetectionReason {
  inline val KNOWN_FRAUDSTER: "KNOWN_FRAUDSTER" = "KNOWN_FRAUDSTER"
  inline val VOICE_SPOOFING: "VOICE_SPOOFING" = "VOICE_SPOOFING"

  inline def values: js.Array[FraudDetectionReason] = js.Array(KNOWN_FRAUDSTER, VOICE_SPOOFING)
}

type FraudsterRegistrationJobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERRORS" | "FAILED"
object FraudsterRegistrationJobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val COMPLETED_WITH_ERRORS: "COMPLETED_WITH_ERRORS" = "COMPLETED_WITH_ERRORS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[FraudsterRegistrationJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, FAILED)
}

type ServerSideEncryptionUpdateStatus = "IN_PROGRESS" | "COMPLETED" | "FAILED"
object ServerSideEncryptionUpdateStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ServerSideEncryptionUpdateStatus] = js.Array(IN_PROGRESS, COMPLETED, FAILED)
}

type SpeakerEnrollmentJobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERRORS" | "FAILED"
object SpeakerEnrollmentJobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val COMPLETED_WITH_ERRORS: "COMPLETED_WITH_ERRORS" = "COMPLETED_WITH_ERRORS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[SpeakerEnrollmentJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, FAILED)
}

type SpeakerStatus = "ENROLLED" | "EXPIRED" | "OPTED_OUT" | "PENDING"
object SpeakerStatus {
  inline val ENROLLED: "ENROLLED" = "ENROLLED"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val OPTED_OUT: "OPTED_OUT" = "OPTED_OUT"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[SpeakerStatus] = js.Array(ENROLLED, EXPIRED, OPTED_OUT, PENDING)
}

type StreamingStatus = "PENDING_CONFIGURATION" | "ONGOING" | "ENDED"
object StreamingStatus {
  inline val PENDING_CONFIGURATION: "PENDING_CONFIGURATION" = "PENDING_CONFIGURATION"
  inline val ONGOING: "ONGOING" = "ONGOING"
  inline val ENDED: "ENDED" = "ENDED"

  inline def values: js.Array[StreamingStatus] = js.Array(PENDING_CONFIGURATION, ONGOING, ENDED)
}
