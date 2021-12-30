package facade.amazonaws.services.codepipeline

import scalajs.js

type ActionCategory = "Source" | "Build" | "Deploy" | "Test" | "Invoke" | "Approval"
object ActionCategory {
  inline val Source: "Source" = "Source"
  inline val Build: "Build" = "Build"
  inline val Deploy: "Deploy" = "Deploy"
  inline val Test: "Test" = "Test"
  inline val Invoke: "Invoke" = "Invoke"
  inline val Approval: "Approval" = "Approval"

  inline def values: js.Array[ActionCategory] = js.Array(Source, Build, Deploy, Test, Invoke, Approval)
}

type ActionConfigurationPropertyType = "String" | "Number" | "Boolean"
object ActionConfigurationPropertyType {
  inline val String: "String" = "String"
  inline val Number: "Number" = "Number"
  inline val Boolean: "Boolean" = "Boolean"

  inline def values: js.Array[ActionConfigurationPropertyType] = js.Array(String, Number, Boolean)
}

type ActionExecutionStatus = "InProgress" | "Abandoned" | "Succeeded" | "Failed"
object ActionExecutionStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Abandoned: "Abandoned" = "Abandoned"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[ActionExecutionStatus] = js.Array(InProgress, Abandoned, Succeeded, Failed)
}

type ActionOwner = "AWS" | "ThirdParty" | "Custom"
object ActionOwner {
  inline val AWS: "AWS" = "AWS"
  inline val ThirdParty: "ThirdParty" = "ThirdParty"
  inline val Custom: "Custom" = "Custom"

  inline def values: js.Array[ActionOwner] = js.Array(AWS, ThirdParty, Custom)
}

type ApprovalStatus = "Approved" | "Rejected"
object ApprovalStatus {
  inline val Approved: "Approved" = "Approved"
  inline val Rejected: "Rejected" = "Rejected"

  inline def values: js.Array[ApprovalStatus] = js.Array(Approved, Rejected)
}

type ArtifactLocationType = "S3"
object ArtifactLocationType {
  inline val S3: "S3" = "S3"

  inline def values: js.Array[ArtifactLocationType] = js.Array(S3)
}

type ArtifactStoreType = "S3"
object ArtifactStoreType {
  inline val S3: "S3" = "S3"

  inline def values: js.Array[ArtifactStoreType] = js.Array(S3)
}

type BlockerType = "Schedule"
object BlockerType {
  inline val Schedule: "Schedule" = "Schedule"

  inline def values: js.Array[BlockerType] = js.Array(Schedule)
}

type EncryptionKeyType = "KMS"
object EncryptionKeyType {
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[EncryptionKeyType] = js.Array(KMS)
}

type ExecutorType = "JobWorker" | "Lambda"
object ExecutorType {
  inline val JobWorker: "JobWorker" = "JobWorker"
  inline val Lambda: "Lambda" = "Lambda"

  inline def values: js.Array[ExecutorType] = js.Array(JobWorker, Lambda)
}

type FailureType = "JobFailed" | "ConfigurationError" | "PermissionError" | "RevisionOutOfSync" | "RevisionUnavailable" | "SystemUnavailable"
object FailureType {
  inline val JobFailed: "JobFailed" = "JobFailed"
  inline val ConfigurationError: "ConfigurationError" = "ConfigurationError"
  inline val PermissionError: "PermissionError" = "PermissionError"
  inline val RevisionOutOfSync: "RevisionOutOfSync" = "RevisionOutOfSync"
  inline val RevisionUnavailable: "RevisionUnavailable" = "RevisionUnavailable"
  inline val SystemUnavailable: "SystemUnavailable" = "SystemUnavailable"

  inline def values: js.Array[FailureType] = js.Array(JobFailed, ConfigurationError, PermissionError, RevisionOutOfSync, RevisionUnavailable, SystemUnavailable)
}

type JobStatus = "Created" | "Queued" | "Dispatched" | "InProgress" | "TimedOut" | "Succeeded" | "Failed"
object JobStatus {
  inline val Created: "Created" = "Created"
  inline val Queued: "Queued" = "Queued"
  inline val Dispatched: "Dispatched" = "Dispatched"
  inline val InProgress: "InProgress" = "InProgress"
  inline val TimedOut: "TimedOut" = "TimedOut"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[JobStatus] = js.Array(Created, Queued, Dispatched, InProgress, TimedOut, Succeeded, Failed)
}

type PipelineExecutionStatus = "Cancelled" | "InProgress" | "Stopped" | "Stopping" | "Succeeded" | "Superseded" | "Failed"
object PipelineExecutionStatus {
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Superseded: "Superseded" = "Superseded"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[PipelineExecutionStatus] = js.Array(Cancelled, InProgress, Stopped, Stopping, Succeeded, Superseded, Failed)
}

type StageExecutionStatus = "Cancelled" | "InProgress" | "Failed" | "Stopped" | "Stopping" | "Succeeded"
object StageExecutionStatus {
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Succeeded: "Succeeded" = "Succeeded"

  inline def values: js.Array[StageExecutionStatus] = js.Array(Cancelled, InProgress, Failed, Stopped, Stopping, Succeeded)
}

type StageRetryMode = "FAILED_ACTIONS"
object StageRetryMode {
  inline val FAILED_ACTIONS: "FAILED_ACTIONS" = "FAILED_ACTIONS"

  inline def values: js.Array[StageRetryMode] = js.Array(FAILED_ACTIONS)
}

type StageTransitionType = "Inbound" | "Outbound"
object StageTransitionType {
  inline val Inbound: "Inbound" = "Inbound"
  inline val Outbound: "Outbound" = "Outbound"

  inline def values: js.Array[StageTransitionType] = js.Array(Inbound, Outbound)
}

type TriggerType = "CreatePipeline" | "StartPipelineExecution" | "PollForSourceChanges" | "Webhook" | "CloudWatchEvent" | "PutActionRevision"
object TriggerType {
  inline val CreatePipeline: "CreatePipeline" = "CreatePipeline"
  inline val StartPipelineExecution: "StartPipelineExecution" = "StartPipelineExecution"
  inline val PollForSourceChanges: "PollForSourceChanges" = "PollForSourceChanges"
  inline val Webhook: "Webhook" = "Webhook"
  inline val CloudWatchEvent: "CloudWatchEvent" = "CloudWatchEvent"
  inline val PutActionRevision: "PutActionRevision" = "PutActionRevision"

  inline def values: js.Array[TriggerType] = js.Array(CreatePipeline, StartPipelineExecution, PollForSourceChanges, Webhook, CloudWatchEvent, PutActionRevision)
}

type WebhookAuthenticationType = "GITHUB_HMAC" | "IP" | "UNAUTHENTICATED"
object WebhookAuthenticationType {
  inline val GITHUB_HMAC: "GITHUB_HMAC" = "GITHUB_HMAC"
  inline val IP: "IP" = "IP"
  inline val UNAUTHENTICATED: "UNAUTHENTICATED" = "UNAUTHENTICATED"

  inline def values: js.Array[WebhookAuthenticationType] = js.Array(GITHUB_HMAC, IP, UNAUTHENTICATED)
}
