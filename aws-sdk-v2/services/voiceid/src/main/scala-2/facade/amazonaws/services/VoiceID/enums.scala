package facade.amazonaws.services.voiceid

import scalajs.js

@js.native
sealed trait AuthenticationDecision extends js.Any
object AuthenticationDecision {
  val ACCEPT = "ACCEPT".asInstanceOf[AuthenticationDecision]
  val REJECT = "REJECT".asInstanceOf[AuthenticationDecision]
  val NOT_ENOUGH_SPEECH = "NOT_ENOUGH_SPEECH".asInstanceOf[AuthenticationDecision]
  val SPEAKER_NOT_ENROLLED = "SPEAKER_NOT_ENROLLED".asInstanceOf[AuthenticationDecision]
  val SPEAKER_OPTED_OUT = "SPEAKER_OPTED_OUT".asInstanceOf[AuthenticationDecision]
  val SPEAKER_ID_NOT_PROVIDED = "SPEAKER_ID_NOT_PROVIDED".asInstanceOf[AuthenticationDecision]
  val SPEAKER_EXPIRED = "SPEAKER_EXPIRED".asInstanceOf[AuthenticationDecision]

  @inline def values: js.Array[AuthenticationDecision] = js.Array(ACCEPT, REJECT, NOT_ENOUGH_SPEECH, SPEAKER_NOT_ENROLLED, SPEAKER_OPTED_OUT, SPEAKER_ID_NOT_PROVIDED, SPEAKER_EXPIRED)
}

@js.native
sealed trait DomainStatus extends js.Any
object DomainStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[DomainStatus]
  val PENDING = "PENDING".asInstanceOf[DomainStatus]
  val SUSPENDED = "SUSPENDED".asInstanceOf[DomainStatus]

  @inline def values: js.Array[DomainStatus] = js.Array(ACTIVE, PENDING, SUSPENDED)
}

@js.native
sealed trait DuplicateRegistrationAction extends js.Any
object DuplicateRegistrationAction {
  val SKIP = "SKIP".asInstanceOf[DuplicateRegistrationAction]
  val REGISTER_AS_NEW = "REGISTER_AS_NEW".asInstanceOf[DuplicateRegistrationAction]

  @inline def values: js.Array[DuplicateRegistrationAction] = js.Array(SKIP, REGISTER_AS_NEW)
}

@js.native
sealed trait ExistingEnrollmentAction extends js.Any
object ExistingEnrollmentAction {
  val SKIP = "SKIP".asInstanceOf[ExistingEnrollmentAction]
  val OVERWRITE = "OVERWRITE".asInstanceOf[ExistingEnrollmentAction]

  @inline def values: js.Array[ExistingEnrollmentAction] = js.Array(SKIP, OVERWRITE)
}

@js.native
sealed trait FraudDetectionAction extends js.Any
object FraudDetectionAction {
  val IGNORE = "IGNORE".asInstanceOf[FraudDetectionAction]
  val FAIL = "FAIL".asInstanceOf[FraudDetectionAction]

  @inline def values: js.Array[FraudDetectionAction] = js.Array(IGNORE, FAIL)
}

@js.native
sealed trait FraudDetectionDecision extends js.Any
object FraudDetectionDecision {
  val HIGH_RISK = "HIGH_RISK".asInstanceOf[FraudDetectionDecision]
  val LOW_RISK = "LOW_RISK".asInstanceOf[FraudDetectionDecision]
  val NOT_ENOUGH_SPEECH = "NOT_ENOUGH_SPEECH".asInstanceOf[FraudDetectionDecision]

  @inline def values: js.Array[FraudDetectionDecision] = js.Array(HIGH_RISK, LOW_RISK, NOT_ENOUGH_SPEECH)
}

@js.native
sealed trait FraudDetectionReason extends js.Any
object FraudDetectionReason {
  val KNOWN_FRAUDSTER = "KNOWN_FRAUDSTER".asInstanceOf[FraudDetectionReason]
  val VOICE_SPOOFING = "VOICE_SPOOFING".asInstanceOf[FraudDetectionReason]

  @inline def values: js.Array[FraudDetectionReason] = js.Array(KNOWN_FRAUDSTER, VOICE_SPOOFING)
}

@js.native
sealed trait FraudsterRegistrationJobStatus extends js.Any
object FraudsterRegistrationJobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[FraudsterRegistrationJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[FraudsterRegistrationJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[FraudsterRegistrationJobStatus]
  val COMPLETED_WITH_ERRORS = "COMPLETED_WITH_ERRORS".asInstanceOf[FraudsterRegistrationJobStatus]
  val FAILED = "FAILED".asInstanceOf[FraudsterRegistrationJobStatus]

  @inline def values: js.Array[FraudsterRegistrationJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, FAILED)
}

@js.native
sealed trait ServerSideEncryptionUpdateStatus extends js.Any
object ServerSideEncryptionUpdateStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ServerSideEncryptionUpdateStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ServerSideEncryptionUpdateStatus]
  val FAILED = "FAILED".asInstanceOf[ServerSideEncryptionUpdateStatus]

  @inline def values: js.Array[ServerSideEncryptionUpdateStatus] = js.Array(IN_PROGRESS, COMPLETED, FAILED)
}

@js.native
sealed trait SpeakerEnrollmentJobStatus extends js.Any
object SpeakerEnrollmentJobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[SpeakerEnrollmentJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[SpeakerEnrollmentJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[SpeakerEnrollmentJobStatus]
  val COMPLETED_WITH_ERRORS = "COMPLETED_WITH_ERRORS".asInstanceOf[SpeakerEnrollmentJobStatus]
  val FAILED = "FAILED".asInstanceOf[SpeakerEnrollmentJobStatus]

  @inline def values: js.Array[SpeakerEnrollmentJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, FAILED)
}

@js.native
sealed trait SpeakerStatus extends js.Any
object SpeakerStatus {
  val ENROLLED = "ENROLLED".asInstanceOf[SpeakerStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[SpeakerStatus]
  val OPTED_OUT = "OPTED_OUT".asInstanceOf[SpeakerStatus]
  val PENDING = "PENDING".asInstanceOf[SpeakerStatus]

  @inline def values: js.Array[SpeakerStatus] = js.Array(ENROLLED, EXPIRED, OPTED_OUT, PENDING)
}

@js.native
sealed trait StreamingStatus extends js.Any
object StreamingStatus {
  val PENDING_CONFIGURATION = "PENDING_CONFIGURATION".asInstanceOf[StreamingStatus]
  val ONGOING = "ONGOING".asInstanceOf[StreamingStatus]
  val ENDED = "ENDED".asInstanceOf[StreamingStatus]

  @inline def values: js.Array[StreamingStatus] = js.Array(PENDING_CONFIGURATION, ONGOING, ENDED)
}
