package facade.amazonaws.services.codepipeline

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ActionCategory extends js.Any
object ActionCategory {
  val Source = "Source".asInstanceOf[ActionCategory]
  val Build = "Build".asInstanceOf[ActionCategory]
  val Deploy = "Deploy".asInstanceOf[ActionCategory]
  val Test = "Test".asInstanceOf[ActionCategory]
  val Invoke = "Invoke".asInstanceOf[ActionCategory]
  val Approval = "Approval".asInstanceOf[ActionCategory]

  @inline def values = js.Array(Source, Build, Deploy, Test, Invoke, Approval)
}

@js.native
sealed trait ActionConfigurationPropertyType extends js.Any
object ActionConfigurationPropertyType {
  val String = "String".asInstanceOf[ActionConfigurationPropertyType]
  val Number = "Number".asInstanceOf[ActionConfigurationPropertyType]
  val Boolean = "Boolean".asInstanceOf[ActionConfigurationPropertyType]

  @inline def values = js.Array(String, Number, Boolean)
}

@js.native
sealed trait ActionExecutionStatus extends js.Any
object ActionExecutionStatus {
  val InProgress = "InProgress".asInstanceOf[ActionExecutionStatus]
  val Abandoned = "Abandoned".asInstanceOf[ActionExecutionStatus]
  val Succeeded = "Succeeded".asInstanceOf[ActionExecutionStatus]
  val Failed = "Failed".asInstanceOf[ActionExecutionStatus]

  @inline def values = js.Array(InProgress, Abandoned, Succeeded, Failed)
}

@js.native
sealed trait ActionOwner extends js.Any
object ActionOwner {
  val AWS = "AWS".asInstanceOf[ActionOwner]
  val ThirdParty = "ThirdParty".asInstanceOf[ActionOwner]
  val Custom = "Custom".asInstanceOf[ActionOwner]

  @inline def values = js.Array(AWS, ThirdParty, Custom)
}

@js.native
sealed trait ApprovalStatus extends js.Any
object ApprovalStatus {
  val Approved = "Approved".asInstanceOf[ApprovalStatus]
  val Rejected = "Rejected".asInstanceOf[ApprovalStatus]

  @inline def values = js.Array(Approved, Rejected)
}

@js.native
sealed trait ArtifactLocationType extends js.Any
object ArtifactLocationType {
  val S3 = "S3".asInstanceOf[ArtifactLocationType]

  @inline def values = js.Array(S3)
}

@js.native
sealed trait ArtifactStoreType extends js.Any
object ArtifactStoreType {
  val S3 = "S3".asInstanceOf[ArtifactStoreType]

  @inline def values = js.Array(S3)
}

@js.native
sealed trait BlockerType extends js.Any
object BlockerType {
  val Schedule = "Schedule".asInstanceOf[BlockerType]

  @inline def values = js.Array(Schedule)
}

@js.native
sealed trait EncryptionKeyType extends js.Any
object EncryptionKeyType {
  val KMS = "KMS".asInstanceOf[EncryptionKeyType]

  @inline def values = js.Array(KMS)
}

@js.native
sealed trait ExecutorType extends js.Any
object ExecutorType {
  val JobWorker = "JobWorker".asInstanceOf[ExecutorType]
  val Lambda = "Lambda".asInstanceOf[ExecutorType]

  @inline def values = js.Array(JobWorker, Lambda)
}

@js.native
sealed trait FailureType extends js.Any
object FailureType {
  val JobFailed = "JobFailed".asInstanceOf[FailureType]
  val ConfigurationError = "ConfigurationError".asInstanceOf[FailureType]
  val PermissionError = "PermissionError".asInstanceOf[FailureType]
  val RevisionOutOfSync = "RevisionOutOfSync".asInstanceOf[FailureType]
  val RevisionUnavailable = "RevisionUnavailable".asInstanceOf[FailureType]
  val SystemUnavailable = "SystemUnavailable".asInstanceOf[FailureType]

  @inline def values = js.Array(JobFailed, ConfigurationError, PermissionError, RevisionOutOfSync, RevisionUnavailable, SystemUnavailable)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val Created = "Created".asInstanceOf[JobStatus]
  val Queued = "Queued".asInstanceOf[JobStatus]
  val Dispatched = "Dispatched".asInstanceOf[JobStatus]
  val InProgress = "InProgress".asInstanceOf[JobStatus]
  val TimedOut = "TimedOut".asInstanceOf[JobStatus]
  val Succeeded = "Succeeded".asInstanceOf[JobStatus]
  val Failed = "Failed".asInstanceOf[JobStatus]

  @inline def values = js.Array(Created, Queued, Dispatched, InProgress, TimedOut, Succeeded, Failed)
}

@js.native
sealed trait PipelineExecutionStatus extends js.Any
object PipelineExecutionStatus {
  val Cancelled = "Cancelled".asInstanceOf[PipelineExecutionStatus]
  val InProgress = "InProgress".asInstanceOf[PipelineExecutionStatus]
  val Stopped = "Stopped".asInstanceOf[PipelineExecutionStatus]
  val Stopping = "Stopping".asInstanceOf[PipelineExecutionStatus]
  val Succeeded = "Succeeded".asInstanceOf[PipelineExecutionStatus]
  val Superseded = "Superseded".asInstanceOf[PipelineExecutionStatus]
  val Failed = "Failed".asInstanceOf[PipelineExecutionStatus]

  @inline def values = js.Array(Cancelled, InProgress, Stopped, Stopping, Succeeded, Superseded, Failed)
}

@js.native
sealed trait StageExecutionStatus extends js.Any
object StageExecutionStatus {
  val Cancelled = "Cancelled".asInstanceOf[StageExecutionStatus]
  val InProgress = "InProgress".asInstanceOf[StageExecutionStatus]
  val Failed = "Failed".asInstanceOf[StageExecutionStatus]
  val Stopped = "Stopped".asInstanceOf[StageExecutionStatus]
  val Stopping = "Stopping".asInstanceOf[StageExecutionStatus]
  val Succeeded = "Succeeded".asInstanceOf[StageExecutionStatus]

  @inline def values = js.Array(Cancelled, InProgress, Failed, Stopped, Stopping, Succeeded)
}

@js.native
sealed trait StageRetryMode extends js.Any
object StageRetryMode {
  val FAILED_ACTIONS = "FAILED_ACTIONS".asInstanceOf[StageRetryMode]

  @inline def values = js.Array(FAILED_ACTIONS)
}

@js.native
sealed trait StageTransitionType extends js.Any
object StageTransitionType {
  val Inbound = "Inbound".asInstanceOf[StageTransitionType]
  val Outbound = "Outbound".asInstanceOf[StageTransitionType]

  @inline def values = js.Array(Inbound, Outbound)
}

@js.native
sealed trait TriggerType extends js.Any
object TriggerType {
  val CreatePipeline = "CreatePipeline".asInstanceOf[TriggerType]
  val StartPipelineExecution = "StartPipelineExecution".asInstanceOf[TriggerType]
  val PollForSourceChanges = "PollForSourceChanges".asInstanceOf[TriggerType]
  val Webhook = "Webhook".asInstanceOf[TriggerType]
  val CloudWatchEvent = "CloudWatchEvent".asInstanceOf[TriggerType]
  val PutActionRevision = "PutActionRevision".asInstanceOf[TriggerType]

  @inline def values = js.Array(CreatePipeline, StartPipelineExecution, PollForSourceChanges, Webhook, CloudWatchEvent, PutActionRevision)
}

@js.native
sealed trait WebhookAuthenticationType extends js.Any
object WebhookAuthenticationType {
  val GITHUB_HMAC = "GITHUB_HMAC".asInstanceOf[WebhookAuthenticationType]
  val IP = "IP".asInstanceOf[WebhookAuthenticationType]
  val UNAUTHENTICATED = "UNAUTHENTICATED".asInstanceOf[WebhookAuthenticationType]

  @inline def values = js.Array(GITHUB_HMAC, IP, UNAUTHENTICATED)
}
