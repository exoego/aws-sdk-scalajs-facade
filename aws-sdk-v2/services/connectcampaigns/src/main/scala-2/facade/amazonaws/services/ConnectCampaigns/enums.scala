package facade.amazonaws.services.connectcampaigns

import scalajs.js

/** State of a campaign
  */
@js.native
sealed trait CampaignState extends js.Any
object CampaignState {
  val Initialized = "Initialized".asInstanceOf[CampaignState]
  val Running = "Running".asInstanceOf[CampaignState]
  val Paused = "Paused".asInstanceOf[CampaignState]
  val Stopped = "Stopped".asInstanceOf[CampaignState]
  val Failed = "Failed".asInstanceOf[CampaignState]

  @inline def values: js.Array[CampaignState] = js.Array(Initialized, Running, Paused, Stopped, Failed)
}

/** Server-side encryption type.
  */
@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val KMS = "KMS".asInstanceOf[EncryptionType]

  @inline def values: js.Array[EncryptionType] = js.Array(KMS)
}

/** A predefined code indicating the error that caused the failure.
  */
@js.native
sealed trait FailureCode extends js.Any
object FailureCode {
  val InvalidInput = "InvalidInput".asInstanceOf[FailureCode]
  val RequestThrottled = "RequestThrottled".asInstanceOf[FailureCode]
  val UnknownError = "UnknownError".asInstanceOf[FailureCode]

  @inline def values: js.Array[FailureCode] = js.Array(InvalidInput, RequestThrottled, UnknownError)
}

/** A predefined code indicating the error that caused the failure in getting state of campaigns
  */
@js.native
sealed trait GetCampaignStateBatchFailureCode extends js.Any
object GetCampaignStateBatchFailureCode {
  val ResourceNotFound = "ResourceNotFound".asInstanceOf[GetCampaignStateBatchFailureCode]
  val UnknownError = "UnknownError".asInstanceOf[GetCampaignStateBatchFailureCode]

  @inline def values: js.Array[GetCampaignStateBatchFailureCode] = js.Array(ResourceNotFound, UnknownError)
}

/** Operators for Connect instance identifier filter
  */
@js.native
sealed trait InstanceIdFilterOperator extends js.Any
object InstanceIdFilterOperator {
  val Eq = "Eq".asInstanceOf[InstanceIdFilterOperator]

  @inline def values: js.Array[InstanceIdFilterOperator] = js.Array(Eq)
}

/** Enumeration of the possible failure codes for instance onboarding job
  */
@js.native
sealed trait InstanceOnboardingJobFailureCode extends js.Any
object InstanceOnboardingJobFailureCode {
  val EVENT_BRIDGE_ACCESS_DENIED = "EVENT_BRIDGE_ACCESS_DENIED".asInstanceOf[InstanceOnboardingJobFailureCode]
  val EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED = "EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED".asInstanceOf[InstanceOnboardingJobFailureCode]
  val IAM_ACCESS_DENIED = "IAM_ACCESS_DENIED".asInstanceOf[InstanceOnboardingJobFailureCode]
  val KMS_ACCESS_DENIED = "KMS_ACCESS_DENIED".asInstanceOf[InstanceOnboardingJobFailureCode]
  val KMS_KEY_NOT_FOUND = "KMS_KEY_NOT_FOUND".asInstanceOf[InstanceOnboardingJobFailureCode]
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[InstanceOnboardingJobFailureCode]

  @inline def values: js.Array[InstanceOnboardingJobFailureCode] = js.Array(EVENT_BRIDGE_ACCESS_DENIED, EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED, IAM_ACCESS_DENIED, KMS_ACCESS_DENIED, KMS_KEY_NOT_FOUND, INTERNAL_FAILURE)
}

/** Enumeration of the possible states for instance onboarding job
  */
@js.native
sealed trait InstanceOnboardingJobStatusCode extends js.Any
object InstanceOnboardingJobStatusCode {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[InstanceOnboardingJobStatusCode]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[InstanceOnboardingJobStatusCode]
  val FAILED = "FAILED".asInstanceOf[InstanceOnboardingJobStatusCode]

  @inline def values: js.Array[InstanceOnboardingJobStatusCode] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}
