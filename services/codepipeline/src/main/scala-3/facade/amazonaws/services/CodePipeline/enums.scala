package facade.amazonaws.services.codepipeline

import scalajs._

type ActionCategory = "Source" | "Build" | "Deploy" | "Test" | "Invoke" | "Approval"
object ActionCategory {
  val Source: "Source" = "Source"
  val Build: "Build" = "Build"
  val Deploy: "Deploy" = "Deploy"
  val Test: "Test" = "Test"
  val Invoke: "Invoke" = "Invoke"
  val Approval: "Approval" = "Approval"

  @inline def values = js.Array[ActionCategory](Source, Build, Deploy, Test, Invoke, Approval)
}

type ActionConfigurationPropertyType = "String" | "Number" | "Boolean"
object ActionConfigurationPropertyType {
  val String: "String" = "String"
  val Number: "Number" = "Number"
  val Boolean: "Boolean" = "Boolean"

  @inline def values = js.Array[ActionConfigurationPropertyType](String, Number, Boolean)
}

type ActionExecutionStatus = "InProgress" | "Abandoned" | "Succeeded" | "Failed"
object ActionExecutionStatus {
  val InProgress: "InProgress" = "InProgress"
  val Abandoned: "Abandoned" = "Abandoned"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[ActionExecutionStatus](InProgress, Abandoned, Succeeded, Failed)
}

type ActionOwner = "AWS" | "ThirdParty" | "Custom"
object ActionOwner {
  val AWS: "AWS" = "AWS"
  val ThirdParty: "ThirdParty" = "ThirdParty"
  val Custom: "Custom" = "Custom"

  @inline def values = js.Array[ActionOwner](AWS, ThirdParty, Custom)
}

type ApprovalStatus = "Approved" | "Rejected"
object ApprovalStatus {
  val Approved: "Approved" = "Approved"
  val Rejected: "Rejected" = "Rejected"

  @inline def values = js.Array[ApprovalStatus](Approved, Rejected)
}

type ArtifactLocationType = "S3"
object ArtifactLocationType {
  val S3: "S3" = "S3"

  @inline def values = js.Array[ArtifactLocationType](S3)
}

type ArtifactStoreType = "S3"
object ArtifactStoreType {
  val S3: "S3" = "S3"

  @inline def values = js.Array[ArtifactStoreType](S3)
}

type BlockerType = "Schedule"
object BlockerType {
  val Schedule: "Schedule" = "Schedule"

  @inline def values = js.Array[BlockerType](Schedule)
}

type EncryptionKeyType = "KMS"
object EncryptionKeyType {
  val KMS: "KMS" = "KMS"

  @inline def values = js.Array[EncryptionKeyType](KMS)
}

type ExecutorType = "JobWorker" | "Lambda"
object ExecutorType {
  val JobWorker: "JobWorker" = "JobWorker"
  val Lambda: "Lambda" = "Lambda"

  @inline def values = js.Array[ExecutorType](JobWorker, Lambda)
}

type FailureType = "JobFailed" | "ConfigurationError" | "PermissionError" | "RevisionOutOfSync" | "RevisionUnavailable" | "SystemUnavailable"
object FailureType {
  val JobFailed: "JobFailed" = "JobFailed"
  val ConfigurationError: "ConfigurationError" = "ConfigurationError"
  val PermissionError: "PermissionError" = "PermissionError"
  val RevisionOutOfSync: "RevisionOutOfSync" = "RevisionOutOfSync"
  val RevisionUnavailable: "RevisionUnavailable" = "RevisionUnavailable"
  val SystemUnavailable: "SystemUnavailable" = "SystemUnavailable"

  @inline def values = js.Array[FailureType](JobFailed, ConfigurationError, PermissionError, RevisionOutOfSync, RevisionUnavailable, SystemUnavailable)
}

type JobStatus = "Created" | "Queued" | "Dispatched" | "InProgress" | "TimedOut" | "Succeeded" | "Failed"
object JobStatus {
  val Created: "Created" = "Created"
  val Queued: "Queued" = "Queued"
  val Dispatched: "Dispatched" = "Dispatched"
  val InProgress: "InProgress" = "InProgress"
  val TimedOut: "TimedOut" = "TimedOut"
  val Succeeded: "Succeeded" = "Succeeded"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[JobStatus](Created, Queued, Dispatched, InProgress, TimedOut, Succeeded, Failed)
}

type PipelineExecutionStatus = "Cancelled" | "InProgress" | "Stopped" | "Stopping" | "Succeeded" | "Superseded" | "Failed"
object PipelineExecutionStatus {
  val Cancelled: "Cancelled" = "Cancelled"
  val InProgress: "InProgress" = "InProgress"
  val Stopped: "Stopped" = "Stopped"
  val Stopping: "Stopping" = "Stopping"
  val Succeeded: "Succeeded" = "Succeeded"
  val Superseded: "Superseded" = "Superseded"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[PipelineExecutionStatus](Cancelled, InProgress, Stopped, Stopping, Succeeded, Superseded, Failed)
}

type StageExecutionStatus = "Cancelled" | "InProgress" | "Failed" | "Stopped" | "Stopping" | "Succeeded"
object StageExecutionStatus {
  val Cancelled: "Cancelled" = "Cancelled"
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Stopped: "Stopped" = "Stopped"
  val Stopping: "Stopping" = "Stopping"
  val Succeeded: "Succeeded" = "Succeeded"

  @inline def values = js.Array[StageExecutionStatus](Cancelled, InProgress, Failed, Stopped, Stopping, Succeeded)
}

type StageRetryMode = "FAILED_ACTIONS"
object StageRetryMode {
  val FAILED_ACTIONS: "FAILED_ACTIONS" = "FAILED_ACTIONS"

  @inline def values = js.Array[StageRetryMode](FAILED_ACTIONS)
}

type StageTransitionType = "Inbound" | "Outbound"
object StageTransitionType {
  val Inbound: "Inbound" = "Inbound"
  val Outbound: "Outbound" = "Outbound"

  @inline def values = js.Array[StageTransitionType](Inbound, Outbound)
}

type TriggerType = "CreatePipeline" | "StartPipelineExecution" | "PollForSourceChanges" | "Webhook" | "CloudWatchEvent" | "PutActionRevision"
object TriggerType {
  val CreatePipeline: "CreatePipeline" = "CreatePipeline"
  val StartPipelineExecution: "StartPipelineExecution" = "StartPipelineExecution"
  val PollForSourceChanges: "PollForSourceChanges" = "PollForSourceChanges"
  val Webhook: "Webhook" = "Webhook"
  val CloudWatchEvent: "CloudWatchEvent" = "CloudWatchEvent"
  val PutActionRevision: "PutActionRevision" = "PutActionRevision"

  @inline def values = js.Array[TriggerType](CreatePipeline, StartPipelineExecution, PollForSourceChanges, Webhook, CloudWatchEvent, PutActionRevision)
}

type WebhookAuthenticationType = "GITHUB_HMAC" | "IP" | "UNAUTHENTICATED"
object WebhookAuthenticationType {
  val GITHUB_HMAC: "GITHUB_HMAC" = "GITHUB_HMAC"
  val IP: "IP" = "IP"
  val UNAUTHENTICATED: "UNAUTHENTICATED" = "UNAUTHENTICATED"

  @inline def values = js.Array[WebhookAuthenticationType](GITHUB_HMAC, IP, UNAUTHENTICATED)
}
