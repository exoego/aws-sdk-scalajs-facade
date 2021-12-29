package facade.amazonaws.services.lookoutequipment

import scalajs._

type DataUploadFrequency = "PT5M" | "PT10M" | "PT15M" | "PT30M" | "PT1H"
object DataUploadFrequency {
  val PT5M: "PT5M" = "PT5M"
  val PT10M: "PT10M" = "PT10M"
  val PT15M: "PT15M" = "PT15M"
  val PT30M: "PT30M" = "PT30M"
  val PT1H: "PT1H" = "PT1H"

  @inline def values = js.Array[DataUploadFrequency](PT5M, PT10M, PT15M, PT30M, PT1H)
}

type DatasetStatus = "CREATED" | "INGESTION_IN_PROGRESS" | "ACTIVE"
object DatasetStatus {
  val CREATED: "CREATED" = "CREATED"
  val INGESTION_IN_PROGRESS: "INGESTION_IN_PROGRESS" = "INGESTION_IN_PROGRESS"
  val ACTIVE: "ACTIVE" = "ACTIVE"

  @inline def values = js.Array[DatasetStatus](CREATED, INGESTION_IN_PROGRESS, ACTIVE)
}

type InferenceExecutionStatus = "IN_PROGRESS" | "SUCCESS" | "FAILED"
object InferenceExecutionStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[InferenceExecutionStatus](IN_PROGRESS, SUCCESS, FAILED)
}

type InferenceSchedulerStatus = "PENDING" | "RUNNING" | "STOPPING" | "STOPPED"
object InferenceSchedulerStatus {
  val PENDING: "PENDING" = "PENDING"
  val RUNNING: "RUNNING" = "RUNNING"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[InferenceSchedulerStatus](PENDING, RUNNING, STOPPING, STOPPED)
}

type IngestionJobStatus = "IN_PROGRESS" | "SUCCESS" | "FAILED"
object IngestionJobStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[IngestionJobStatus](IN_PROGRESS, SUCCESS, FAILED)
}

type ModelStatus = "IN_PROGRESS" | "SUCCESS" | "FAILED"
object ModelStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ModelStatus](IN_PROGRESS, SUCCESS, FAILED)
}

type TargetSamplingRate = "PT1S" | "PT5S" | "PT10S" | "PT15S" | "PT30S" | "PT1M" | "PT5M" | "PT10M" | "PT15M" | "PT30M" | "PT1H"
object TargetSamplingRate {
  val PT1S: "PT1S" = "PT1S"
  val PT5S: "PT5S" = "PT5S"
  val PT10S: "PT10S" = "PT10S"
  val PT15S: "PT15S" = "PT15S"
  val PT30S: "PT30S" = "PT30S"
  val PT1M: "PT1M" = "PT1M"
  val PT5M: "PT5M" = "PT5M"
  val PT10M: "PT10M" = "PT10M"
  val PT15M: "PT15M" = "PT15M"
  val PT30M: "PT30M" = "PT30M"
  val PT1H: "PT1H" = "PT1H"

  @inline def values = js.Array[TargetSamplingRate](PT1S, PT5S, PT10S, PT15S, PT30S, PT1M, PT5M, PT10M, PT15M, PT30M, PT1H)
}
