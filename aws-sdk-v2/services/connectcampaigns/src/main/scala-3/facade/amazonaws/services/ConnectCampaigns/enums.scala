package facade.amazonaws.services.connectcampaigns

import scalajs.js

/** State of a campaign
  */
type CampaignState = "Initialized" | "Running" | "Paused" | "Stopped" | "Failed"
object CampaignState {
  inline val Initialized: "Initialized" = "Initialized"
  inline val Running: "Running" = "Running"
  inline val Paused: "Paused" = "Paused"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[CampaignState] = js.Array(Initialized, Running, Paused, Stopped, Failed)
}

/** Server-side encryption type.
  */
type EncryptionType = "KMS"
object EncryptionType {
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[EncryptionType] = js.Array(KMS)
}

/** A predefined code indicating the error that caused the failure.
  */
type FailureCode = "InvalidInput" | "RequestThrottled" | "UnknownError"
object FailureCode {
  inline val InvalidInput: "InvalidInput" = "InvalidInput"
  inline val RequestThrottled: "RequestThrottled" = "RequestThrottled"
  inline val UnknownError: "UnknownError" = "UnknownError"

  inline def values: js.Array[FailureCode] = js.Array(InvalidInput, RequestThrottled, UnknownError)
}

/** A predefined code indicating the error that caused the failure in getting state of campaigns
  */
type GetCampaignStateBatchFailureCode = "ResourceNotFound" | "UnknownError"
object GetCampaignStateBatchFailureCode {
  inline val ResourceNotFound: "ResourceNotFound" = "ResourceNotFound"
  inline val UnknownError: "UnknownError" = "UnknownError"

  inline def values: js.Array[GetCampaignStateBatchFailureCode] = js.Array(ResourceNotFound, UnknownError)
}

/** Operators for Connect instance identifier filter
  */
type InstanceIdFilterOperator = "Eq"
object InstanceIdFilterOperator {
  inline val Eq: "Eq" = "Eq"

  inline def values: js.Array[InstanceIdFilterOperator] = js.Array(Eq)
}

/** Enumeration of the possible failure codes for instance onboarding job
  */
type InstanceOnboardingJobFailureCode = "EVENT_BRIDGE_ACCESS_DENIED" | "EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED" | "IAM_ACCESS_DENIED" | "KMS_ACCESS_DENIED" | "KMS_KEY_NOT_FOUND" | "INTERNAL_FAILURE"
object InstanceOnboardingJobFailureCode {
  inline val EVENT_BRIDGE_ACCESS_DENIED: "EVENT_BRIDGE_ACCESS_DENIED" = "EVENT_BRIDGE_ACCESS_DENIED"
  inline val EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED: "EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED" = "EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED"
  inline val IAM_ACCESS_DENIED: "IAM_ACCESS_DENIED" = "IAM_ACCESS_DENIED"
  inline val KMS_ACCESS_DENIED: "KMS_ACCESS_DENIED" = "KMS_ACCESS_DENIED"
  inline val KMS_KEY_NOT_FOUND: "KMS_KEY_NOT_FOUND" = "KMS_KEY_NOT_FOUND"
  inline val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"

  inline def values: js.Array[InstanceOnboardingJobFailureCode] = js.Array(EVENT_BRIDGE_ACCESS_DENIED, EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED, IAM_ACCESS_DENIED, KMS_ACCESS_DENIED, KMS_KEY_NOT_FOUND, INTERNAL_FAILURE)
}

/** Enumeration of the possible states for instance onboarding job
  */
type InstanceOnboardingJobStatusCode = "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object InstanceOnboardingJobStatusCode {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[InstanceOnboardingJobStatusCode] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}
