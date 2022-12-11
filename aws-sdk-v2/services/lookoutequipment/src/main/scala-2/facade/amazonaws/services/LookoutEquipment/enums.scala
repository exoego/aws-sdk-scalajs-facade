package facade.amazonaws.services.lookoutequipment

import scalajs.js

@js.native
sealed trait DataUploadFrequency extends js.Any
object DataUploadFrequency {
  val PT5M = "PT5M".asInstanceOf[DataUploadFrequency]
  val PT10M = "PT10M".asInstanceOf[DataUploadFrequency]
  val PT15M = "PT15M".asInstanceOf[DataUploadFrequency]
  val PT30M = "PT30M".asInstanceOf[DataUploadFrequency]
  val PT1H = "PT1H".asInstanceOf[DataUploadFrequency]

  @inline def values: js.Array[DataUploadFrequency] = js.Array(PT5M, PT10M, PT15M, PT30M, PT1H)
}

@js.native
sealed trait DatasetStatus extends js.Any
object DatasetStatus {
  val CREATED = "CREATED".asInstanceOf[DatasetStatus]
  val INGESTION_IN_PROGRESS = "INGESTION_IN_PROGRESS".asInstanceOf[DatasetStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DatasetStatus]

  @inline def values: js.Array[DatasetStatus] = js.Array(CREATED, INGESTION_IN_PROGRESS, ACTIVE)
}

@js.native
sealed trait InferenceExecutionStatus extends js.Any
object InferenceExecutionStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[InferenceExecutionStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[InferenceExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[InferenceExecutionStatus]

  @inline def values: js.Array[InferenceExecutionStatus] = js.Array(IN_PROGRESS, SUCCESS, FAILED)
}

@js.native
sealed trait InferenceSchedulerStatus extends js.Any
object InferenceSchedulerStatus {
  val PENDING = "PENDING".asInstanceOf[InferenceSchedulerStatus]
  val RUNNING = "RUNNING".asInstanceOf[InferenceSchedulerStatus]
  val STOPPING = "STOPPING".asInstanceOf[InferenceSchedulerStatus]
  val STOPPED = "STOPPED".asInstanceOf[InferenceSchedulerStatus]

  @inline def values: js.Array[InferenceSchedulerStatus] = js.Array(PENDING, RUNNING, STOPPING, STOPPED)
}

@js.native
sealed trait IngestionJobStatus extends js.Any
object IngestionJobStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[IngestionJobStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[IngestionJobStatus]
  val FAILED = "FAILED".asInstanceOf[IngestionJobStatus]

  @inline def values: js.Array[IngestionJobStatus] = js.Array(IN_PROGRESS, SUCCESS, FAILED)
}

@js.native
sealed trait LabelRating extends js.Any
object LabelRating {
  val ANOMALY = "ANOMALY".asInstanceOf[LabelRating]
  val NO_ANOMALY = "NO_ANOMALY".asInstanceOf[LabelRating]
  val NEUTRAL = "NEUTRAL".asInstanceOf[LabelRating]

  @inline def values: js.Array[LabelRating] = js.Array(ANOMALY, NO_ANOMALY, NEUTRAL)
}

@js.native
sealed trait LatestInferenceResult extends js.Any
object LatestInferenceResult {
  val ANOMALOUS = "ANOMALOUS".asInstanceOf[LatestInferenceResult]
  val NORMAL = "NORMAL".asInstanceOf[LatestInferenceResult]

  @inline def values: js.Array[LatestInferenceResult] = js.Array(ANOMALOUS, NORMAL)
}

@js.native
sealed trait ModelStatus extends js.Any
object ModelStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ModelStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[ModelStatus]
  val FAILED = "FAILED".asInstanceOf[ModelStatus]

  @inline def values: js.Array[ModelStatus] = js.Array(IN_PROGRESS, SUCCESS, FAILED)
}

@js.native
sealed trait Monotonicity extends js.Any
object Monotonicity {
  val DECREASING = "DECREASING".asInstanceOf[Monotonicity]
  val INCREASING = "INCREASING".asInstanceOf[Monotonicity]
  val STATIC = "STATIC".asInstanceOf[Monotonicity]

  @inline def values: js.Array[Monotonicity] = js.Array(DECREASING, INCREASING, STATIC)
}

@js.native
sealed trait StatisticalIssueStatus extends js.Any
object StatisticalIssueStatus {
  val POTENTIAL_ISSUE_DETECTED = "POTENTIAL_ISSUE_DETECTED".asInstanceOf[StatisticalIssueStatus]
  val NO_ISSUE_DETECTED = "NO_ISSUE_DETECTED".asInstanceOf[StatisticalIssueStatus]

  @inline def values: js.Array[StatisticalIssueStatus] = js.Array(POTENTIAL_ISSUE_DETECTED, NO_ISSUE_DETECTED)
}

@js.native
sealed trait TargetSamplingRate extends js.Any
object TargetSamplingRate {
  val PT1S = "PT1S".asInstanceOf[TargetSamplingRate]
  val PT5S = "PT5S".asInstanceOf[TargetSamplingRate]
  val PT10S = "PT10S".asInstanceOf[TargetSamplingRate]
  val PT15S = "PT15S".asInstanceOf[TargetSamplingRate]
  val PT30S = "PT30S".asInstanceOf[TargetSamplingRate]
  val PT1M = "PT1M".asInstanceOf[TargetSamplingRate]
  val PT5M = "PT5M".asInstanceOf[TargetSamplingRate]
  val PT10M = "PT10M".asInstanceOf[TargetSamplingRate]
  val PT15M = "PT15M".asInstanceOf[TargetSamplingRate]
  val PT30M = "PT30M".asInstanceOf[TargetSamplingRate]
  val PT1H = "PT1H".asInstanceOf[TargetSamplingRate]

  @inline def values: js.Array[TargetSamplingRate] = js.Array(PT1S, PT5S, PT10S, PT15S, PT30S, PT1M, PT5M, PT10M, PT15M, PT30M, PT1H)
}
