package facade.amazonaws.services.inspector

import scalajs._

type AgentHealth = "HEALTHY" | "UNHEALTHY" | "UNKNOWN"
object AgentHealth {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[AgentHealth] = js.Array(HEALTHY, UNHEALTHY, UNKNOWN)
}

type AgentHealthCode = "IDLE" | "RUNNING" | "SHUTDOWN" | "UNHEALTHY" | "THROTTLED" | "UNKNOWN"
object AgentHealthCode {
  inline val IDLE: "IDLE" = "IDLE"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SHUTDOWN: "SHUTDOWN" = "SHUTDOWN"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  inline val THROTTLED: "THROTTLED" = "THROTTLED"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[AgentHealthCode] = js.Array(IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, UNKNOWN)
}

type AssessmentRunNotificationSnsStatusCode = "SUCCESS" | "TOPIC_DOES_NOT_EXIST" | "ACCESS_DENIED" | "INTERNAL_ERROR"
object AssessmentRunNotificationSnsStatusCode {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val TOPIC_DOES_NOT_EXIST: "TOPIC_DOES_NOT_EXIST" = "TOPIC_DOES_NOT_EXIST"
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"

  inline def values: js.Array[AssessmentRunNotificationSnsStatusCode] = js.Array(SUCCESS, TOPIC_DOES_NOT_EXIST, ACCESS_DENIED, INTERNAL_ERROR)
}

type AssessmentRunState = "CREATED" | "START_DATA_COLLECTION_PENDING" | "START_DATA_COLLECTION_IN_PROGRESS" | "COLLECTING_DATA" | "STOP_DATA_COLLECTION_PENDING" | "DATA_COLLECTED" | "START_EVALUATING_RULES_PENDING" | "EVALUATING_RULES" | "FAILED" | "ERROR" | "COMPLETED" | "COMPLETED_WITH_ERRORS" | "CANCELED"
object AssessmentRunState {
  inline val CREATED: "CREATED" = "CREATED"
  inline val START_DATA_COLLECTION_PENDING: "START_DATA_COLLECTION_PENDING" = "START_DATA_COLLECTION_PENDING"
  inline val START_DATA_COLLECTION_IN_PROGRESS: "START_DATA_COLLECTION_IN_PROGRESS" = "START_DATA_COLLECTION_IN_PROGRESS"
  inline val COLLECTING_DATA: "COLLECTING_DATA" = "COLLECTING_DATA"
  inline val STOP_DATA_COLLECTION_PENDING: "STOP_DATA_COLLECTION_PENDING" = "STOP_DATA_COLLECTION_PENDING"
  inline val DATA_COLLECTED: "DATA_COLLECTED" = "DATA_COLLECTED"
  inline val START_EVALUATING_RULES_PENDING: "START_EVALUATING_RULES_PENDING" = "START_EVALUATING_RULES_PENDING"
  inline val EVALUATING_RULES: "EVALUATING_RULES" = "EVALUATING_RULES"
  inline val FAILED: "FAILED" = "FAILED"
  inline val ERROR: "ERROR" = "ERROR"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val COMPLETED_WITH_ERRORS: "COMPLETED_WITH_ERRORS" = "COMPLETED_WITH_ERRORS"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[AssessmentRunState] = js.Array(
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

type AssetType = "ec2-instance"
object AssetType {
  inline val `ec2-instance`: "ec2-instance" = "ec2-instance"

  inline def values: js.Array[AssetType] = js.Array(`ec2-instance`)
}

type FailedItemErrorCode = "INVALID_ARN" | "DUPLICATE_ARN" | "ITEM_DOES_NOT_EXIST" | "ACCESS_DENIED" | "LIMIT_EXCEEDED" | "INTERNAL_ERROR"
object FailedItemErrorCode {
  inline val INVALID_ARN: "INVALID_ARN" = "INVALID_ARN"
  inline val DUPLICATE_ARN: "DUPLICATE_ARN" = "DUPLICATE_ARN"
  inline val ITEM_DOES_NOT_EXIST: "ITEM_DOES_NOT_EXIST" = "ITEM_DOES_NOT_EXIST"
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val LIMIT_EXCEEDED: "LIMIT_EXCEEDED" = "LIMIT_EXCEEDED"
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"

  inline def values: js.Array[FailedItemErrorCode] = js.Array(INVALID_ARN, DUPLICATE_ARN, ITEM_DOES_NOT_EXIST, ACCESS_DENIED, LIMIT_EXCEEDED, INTERNAL_ERROR)
}

type InspectorEvent = "ASSESSMENT_RUN_STARTED" | "ASSESSMENT_RUN_COMPLETED" | "ASSESSMENT_RUN_STATE_CHANGED" | "FINDING_REPORTED" | "OTHER"
object InspectorEvent {
  inline val ASSESSMENT_RUN_STARTED: "ASSESSMENT_RUN_STARTED" = "ASSESSMENT_RUN_STARTED"
  inline val ASSESSMENT_RUN_COMPLETED: "ASSESSMENT_RUN_COMPLETED" = "ASSESSMENT_RUN_COMPLETED"
  inline val ASSESSMENT_RUN_STATE_CHANGED: "ASSESSMENT_RUN_STATE_CHANGED" = "ASSESSMENT_RUN_STATE_CHANGED"
  inline val FINDING_REPORTED: "FINDING_REPORTED" = "FINDING_REPORTED"
  inline val OTHER: "OTHER" = "OTHER"

  inline def values: js.Array[InspectorEvent] = js.Array(ASSESSMENT_RUN_STARTED, ASSESSMENT_RUN_COMPLETED, ASSESSMENT_RUN_STATE_CHANGED, FINDING_REPORTED, OTHER)
}

type Locale = "EN_US"
object Locale {
  inline val EN_US: "EN_US" = "EN_US"

  inline def values: js.Array[Locale] = js.Array(EN_US)
}

type PreviewStatus = "WORK_IN_PROGRESS" | "COMPLETED"
object PreviewStatus {
  inline val WORK_IN_PROGRESS: "WORK_IN_PROGRESS" = "WORK_IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[PreviewStatus] = js.Array(WORK_IN_PROGRESS, COMPLETED)
}

type ReportFileFormat = "HTML" | "PDF"
object ReportFileFormat {
  inline val HTML: "HTML" = "HTML"
  inline val PDF: "PDF" = "PDF"

  inline def values: js.Array[ReportFileFormat] = js.Array(HTML, PDF)
}

type ReportStatus = "WORK_IN_PROGRESS" | "FAILED" | "COMPLETED"
object ReportStatus {
  inline val WORK_IN_PROGRESS: "WORK_IN_PROGRESS" = "WORK_IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[ReportStatus] = js.Array(WORK_IN_PROGRESS, FAILED, COMPLETED)
}

type ReportType = "FINDING" | "FULL"
object ReportType {
  inline val FINDING: "FINDING" = "FINDING"
  inline val FULL: "FULL" = "FULL"

  inline def values: js.Array[ReportType] = js.Array(FINDING, FULL)
}

type ScopeType = "INSTANCE_ID" | "RULES_PACKAGE_ARN"
object ScopeType {
  inline val INSTANCE_ID: "INSTANCE_ID" = "INSTANCE_ID"
  inline val RULES_PACKAGE_ARN: "RULES_PACKAGE_ARN" = "RULES_PACKAGE_ARN"

  inline def values: js.Array[ScopeType] = js.Array(INSTANCE_ID, RULES_PACKAGE_ARN)
}

type Severity = "Low" | "Medium" | "High" | "Informational" | "Undefined"
object Severity {
  inline val Low: "Low" = "Low"
  inline val Medium: "Medium" = "Medium"
  inline val High: "High" = "High"
  inline val Informational: "Informational" = "Informational"
  inline val Undefined: "Undefined" = "Undefined"

  inline def values: js.Array[Severity] = js.Array(Low, Medium, High, Informational, Undefined)
}

type StopAction = "START_EVALUATION" | "SKIP_EVALUATION"
object StopAction {
  inline val START_EVALUATION: "START_EVALUATION" = "START_EVALUATION"
  inline val SKIP_EVALUATION: "SKIP_EVALUATION" = "SKIP_EVALUATION"

  inline def values: js.Array[StopAction] = js.Array(START_EVALUATION, SKIP_EVALUATION)
}
