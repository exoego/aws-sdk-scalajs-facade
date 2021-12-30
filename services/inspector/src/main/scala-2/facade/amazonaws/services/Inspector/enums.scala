package facade.amazonaws.services.inspector

import scalajs.js

@js.native
sealed trait AgentHealth extends js.Any
object AgentHealth {
  val HEALTHY = "HEALTHY".asInstanceOf[AgentHealth]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[AgentHealth]
  val UNKNOWN = "UNKNOWN".asInstanceOf[AgentHealth]

  @inline def values: js.Array[AgentHealth] = js.Array(HEALTHY, UNHEALTHY, UNKNOWN)
}

@js.native
sealed trait AgentHealthCode extends js.Any
object AgentHealthCode {
  val IDLE = "IDLE".asInstanceOf[AgentHealthCode]
  val RUNNING = "RUNNING".asInstanceOf[AgentHealthCode]
  val SHUTDOWN = "SHUTDOWN".asInstanceOf[AgentHealthCode]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[AgentHealthCode]
  val THROTTLED = "THROTTLED".asInstanceOf[AgentHealthCode]
  val UNKNOWN = "UNKNOWN".asInstanceOf[AgentHealthCode]

  @inline def values: js.Array[AgentHealthCode] = js.Array(IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, UNKNOWN)
}

@js.native
sealed trait AssessmentRunNotificationSnsStatusCode extends js.Any
object AssessmentRunNotificationSnsStatusCode {
  val SUCCESS = "SUCCESS".asInstanceOf[AssessmentRunNotificationSnsStatusCode]
  val TOPIC_DOES_NOT_EXIST = "TOPIC_DOES_NOT_EXIST".asInstanceOf[AssessmentRunNotificationSnsStatusCode]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[AssessmentRunNotificationSnsStatusCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[AssessmentRunNotificationSnsStatusCode]

  @inline def values: js.Array[AssessmentRunNotificationSnsStatusCode] = js.Array(SUCCESS, TOPIC_DOES_NOT_EXIST, ACCESS_DENIED, INTERNAL_ERROR)
}

@js.native
sealed trait AssessmentRunState extends js.Any
object AssessmentRunState {
  val CREATED = "CREATED".asInstanceOf[AssessmentRunState]
  val START_DATA_COLLECTION_PENDING = "START_DATA_COLLECTION_PENDING".asInstanceOf[AssessmentRunState]
  val START_DATA_COLLECTION_IN_PROGRESS = "START_DATA_COLLECTION_IN_PROGRESS".asInstanceOf[AssessmentRunState]
  val COLLECTING_DATA = "COLLECTING_DATA".asInstanceOf[AssessmentRunState]
  val STOP_DATA_COLLECTION_PENDING = "STOP_DATA_COLLECTION_PENDING".asInstanceOf[AssessmentRunState]
  val DATA_COLLECTED = "DATA_COLLECTED".asInstanceOf[AssessmentRunState]
  val START_EVALUATING_RULES_PENDING = "START_EVALUATING_RULES_PENDING".asInstanceOf[AssessmentRunState]
  val EVALUATING_RULES = "EVALUATING_RULES".asInstanceOf[AssessmentRunState]
  val FAILED = "FAILED".asInstanceOf[AssessmentRunState]
  val ERROR = "ERROR".asInstanceOf[AssessmentRunState]
  val COMPLETED = "COMPLETED".asInstanceOf[AssessmentRunState]
  val COMPLETED_WITH_ERRORS = "COMPLETED_WITH_ERRORS".asInstanceOf[AssessmentRunState]
  val CANCELED = "CANCELED".asInstanceOf[AssessmentRunState]

  @inline def values: js.Array[AssessmentRunState] = js.Array(
    CREATED,
    START_DATA_COLLECTION_PENDING,
    START_DATA_COLLECTION_IN_PROGRESS,
    COLLECTING_DATA,
    STOP_DATA_COLLECTION_PENDING,
    DATA_COLLECTED,
    START_EVALUATING_RULES_PENDING,
    EVALUATING_RULES,
    FAILED,
    ERROR,
    COMPLETED,
    COMPLETED_WITH_ERRORS,
    CANCELED
  )
}

@js.native
sealed trait AssetType extends js.Any
object AssetType {
  val `ec2-instance` = "ec2-instance".asInstanceOf[AssetType]

  @inline def values: js.Array[AssetType] = js.Array(`ec2-instance`)
}

@js.native
sealed trait FailedItemErrorCode extends js.Any
object FailedItemErrorCode {
  val INVALID_ARN = "INVALID_ARN".asInstanceOf[FailedItemErrorCode]
  val DUPLICATE_ARN = "DUPLICATE_ARN".asInstanceOf[FailedItemErrorCode]
  val ITEM_DOES_NOT_EXIST = "ITEM_DOES_NOT_EXIST".asInstanceOf[FailedItemErrorCode]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[FailedItemErrorCode]
  val LIMIT_EXCEEDED = "LIMIT_EXCEEDED".asInstanceOf[FailedItemErrorCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[FailedItemErrorCode]

  @inline def values: js.Array[FailedItemErrorCode] = js.Array(INVALID_ARN, DUPLICATE_ARN, ITEM_DOES_NOT_EXIST, ACCESS_DENIED, LIMIT_EXCEEDED, INTERNAL_ERROR)
}

@js.native
sealed trait InspectorEvent extends js.Any
object InspectorEvent {
  val ASSESSMENT_RUN_STARTED = "ASSESSMENT_RUN_STARTED".asInstanceOf[InspectorEvent]
  val ASSESSMENT_RUN_COMPLETED = "ASSESSMENT_RUN_COMPLETED".asInstanceOf[InspectorEvent]
  val ASSESSMENT_RUN_STATE_CHANGED = "ASSESSMENT_RUN_STATE_CHANGED".asInstanceOf[InspectorEvent]
  val FINDING_REPORTED = "FINDING_REPORTED".asInstanceOf[InspectorEvent]
  val OTHER = "OTHER".asInstanceOf[InspectorEvent]

  @inline def values: js.Array[InspectorEvent] = js.Array(ASSESSMENT_RUN_STARTED, ASSESSMENT_RUN_COMPLETED, ASSESSMENT_RUN_STATE_CHANGED, FINDING_REPORTED, OTHER)
}

@js.native
sealed trait Locale extends js.Any
object Locale {
  val EN_US = "EN_US".asInstanceOf[Locale]

  @inline def values: js.Array[Locale] = js.Array(EN_US)
}

@js.native
sealed trait PreviewStatus extends js.Any
object PreviewStatus {
  val WORK_IN_PROGRESS = "WORK_IN_PROGRESS".asInstanceOf[PreviewStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[PreviewStatus]

  @inline def values: js.Array[PreviewStatus] = js.Array(WORK_IN_PROGRESS, COMPLETED)
}

@js.native
sealed trait ReportFileFormat extends js.Any
object ReportFileFormat {
  val HTML = "HTML".asInstanceOf[ReportFileFormat]
  val PDF = "PDF".asInstanceOf[ReportFileFormat]

  @inline def values: js.Array[ReportFileFormat] = js.Array(HTML, PDF)
}

@js.native
sealed trait ReportStatus extends js.Any
object ReportStatus {
  val WORK_IN_PROGRESS = "WORK_IN_PROGRESS".asInstanceOf[ReportStatus]
  val FAILED = "FAILED".asInstanceOf[ReportStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ReportStatus]

  @inline def values: js.Array[ReportStatus] = js.Array(WORK_IN_PROGRESS, FAILED, COMPLETED)
}

@js.native
sealed trait ReportType extends js.Any
object ReportType {
  val FINDING = "FINDING".asInstanceOf[ReportType]
  val FULL = "FULL".asInstanceOf[ReportType]

  @inline def values: js.Array[ReportType] = js.Array(FINDING, FULL)
}

@js.native
sealed trait ScopeType extends js.Any
object ScopeType {
  val INSTANCE_ID = "INSTANCE_ID".asInstanceOf[ScopeType]
  val RULES_PACKAGE_ARN = "RULES_PACKAGE_ARN".asInstanceOf[ScopeType]

  @inline def values: js.Array[ScopeType] = js.Array(INSTANCE_ID, RULES_PACKAGE_ARN)
}

@js.native
sealed trait Severity extends js.Any
object Severity {
  val Low = "Low".asInstanceOf[Severity]
  val Medium = "Medium".asInstanceOf[Severity]
  val High = "High".asInstanceOf[Severity]
  val Informational = "Informational".asInstanceOf[Severity]
  val Undefined = "Undefined".asInstanceOf[Severity]

  @inline def values: js.Array[Severity] = js.Array(Low, Medium, High, Informational, Undefined)
}

@js.native
sealed trait StopAction extends js.Any
object StopAction {
  val START_EVALUATION = "START_EVALUATION".asInstanceOf[StopAction]
  val SKIP_EVALUATION = "SKIP_EVALUATION".asInstanceOf[StopAction]

  @inline def values: js.Array[StopAction] = js.Array(START_EVALUATION, SKIP_EVALUATION)
}
