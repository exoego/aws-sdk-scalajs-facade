package facade.amazonaws.services.lookoutequipment

import scalajs.js

type DataUploadFrequency = "PT5M" | "PT10M" | "PT15M" | "PT30M" | "PT1H"
object DataUploadFrequency {
  inline val PT5M: "PT5M" = "PT5M"
  inline val PT10M: "PT10M" = "PT10M"
  inline val PT15M: "PT15M" = "PT15M"
  inline val PT30M: "PT30M" = "PT30M"
  inline val PT1H: "PT1H" = "PT1H"

  inline def values: js.Array[DataUploadFrequency] = js.Array(PT5M, PT10M, PT15M, PT30M, PT1H)
}

type DatasetStatus = "CREATED" | "INGESTION_IN_PROGRESS" | "ACTIVE"
object DatasetStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val INGESTION_IN_PROGRESS: "INGESTION_IN_PROGRESS" = "INGESTION_IN_PROGRESS"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[DatasetStatus] = js.Array(CREATED, INGESTION_IN_PROGRESS, ACTIVE)
}

type InferenceExecutionStatus = "IN_PROGRESS" | "SUCCESS" | "FAILED"
object InferenceExecutionStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[InferenceExecutionStatus] = js.Array(IN_PROGRESS, SUCCESS, FAILED)
}

type InferenceSchedulerStatus = "PENDING" | "RUNNING" | "STOPPING" | "STOPPED"
object InferenceSchedulerStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[InferenceSchedulerStatus] = js.Array(PENDING, RUNNING, STOPPING, STOPPED)
}

type IngestionJobStatus = "IN_PROGRESS" | "SUCCESS" | "FAILED"
object IngestionJobStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[IngestionJobStatus] = js.Array(IN_PROGRESS, SUCCESS, FAILED)
}

type LabelRating = "ANOMALY" | "NO_ANOMALY" | "NEUTRAL"
object LabelRating {
  inline val ANOMALY: "ANOMALY" = "ANOMALY"
  inline val NO_ANOMALY: "NO_ANOMALY" = "NO_ANOMALY"
  inline val NEUTRAL: "NEUTRAL" = "NEUTRAL"

  inline def values: js.Array[LabelRating] = js.Array(ANOMALY, NO_ANOMALY, NEUTRAL)
}

type LatestInferenceResult = "ANOMALOUS" | "NORMAL"
object LatestInferenceResult {
  inline val ANOMALOUS: "ANOMALOUS" = "ANOMALOUS"
  inline val NORMAL: "NORMAL" = "NORMAL"

  inline def values: js.Array[LatestInferenceResult] = js.Array(ANOMALOUS, NORMAL)
}

type ModelStatus = "IN_PROGRESS" | "SUCCESS" | "FAILED"
object ModelStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ModelStatus] = js.Array(IN_PROGRESS, SUCCESS, FAILED)
}

type Monotonicity = "DECREASING" | "INCREASING" | "STATIC"
object Monotonicity {
  inline val DECREASING: "DECREASING" = "DECREASING"
  inline val INCREASING: "INCREASING" = "INCREASING"
  inline val STATIC: "STATIC" = "STATIC"

  inline def values: js.Array[Monotonicity] = js.Array(DECREASING, INCREASING, STATIC)
}

type StatisticalIssueStatus = "POTENTIAL_ISSUE_DETECTED" | "NO_ISSUE_DETECTED"
object StatisticalIssueStatus {
  inline val POTENTIAL_ISSUE_DETECTED: "POTENTIAL_ISSUE_DETECTED" = "POTENTIAL_ISSUE_DETECTED"
  inline val NO_ISSUE_DETECTED: "NO_ISSUE_DETECTED" = "NO_ISSUE_DETECTED"

  inline def values: js.Array[StatisticalIssueStatus] = js.Array(POTENTIAL_ISSUE_DETECTED, NO_ISSUE_DETECTED)
}

type TargetSamplingRate = "PT1S" | "PT5S" | "PT10S" | "PT15S" | "PT30S" | "PT1M" | "PT5M" | "PT10M" | "PT15M" | "PT30M" | "PT1H"
object TargetSamplingRate {
  inline val PT1S: "PT1S" = "PT1S"
  inline val PT5S: "PT5S" = "PT5S"
  inline val PT10S: "PT10S" = "PT10S"
  inline val PT15S: "PT15S" = "PT15S"
  inline val PT30S: "PT30S" = "PT30S"
  inline val PT1M: "PT1M" = "PT1M"
  inline val PT5M: "PT5M" = "PT5M"
  inline val PT10M: "PT10M" = "PT10M"
  inline val PT15M: "PT15M" = "PT15M"
  inline val PT30M: "PT30M" = "PT30M"
  inline val PT1H: "PT1H" = "PT1H"

  inline def values: js.Array[TargetSamplingRate] = js.Array(PT1S, PT5S, PT10S, PT15S, PT30S, PT1M, PT5M, PT10M, PT15M, PT30M, PT1H)
}
