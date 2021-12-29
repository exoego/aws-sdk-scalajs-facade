package facade.amazonaws.services.frauddetector

import scalajs._

type AsyncJobStatus = "IN_PROGRESS_INITIALIZING" | "IN_PROGRESS" | "CANCEL_IN_PROGRESS" | "CANCELED" | "COMPLETE" | "FAILED"
object AsyncJobStatus {
  val IN_PROGRESS_INITIALIZING: "IN_PROGRESS_INITIALIZING" = "IN_PROGRESS_INITIALIZING"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val CANCEL_IN_PROGRESS: "CANCEL_IN_PROGRESS" = "CANCEL_IN_PROGRESS"
  val CANCELED: "CANCELED" = "CANCELED"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AsyncJobStatus](IN_PROGRESS_INITIALIZING, IN_PROGRESS, CANCEL_IN_PROGRESS, CANCELED, COMPLETE, FAILED)
}

type DataSource = "EVENT" | "MODEL_SCORE" | "EXTERNAL_MODEL_SCORE"
object DataSource {
  val EVENT: "EVENT" = "EVENT"
  val MODEL_SCORE: "MODEL_SCORE" = "MODEL_SCORE"
  val EXTERNAL_MODEL_SCORE: "EXTERNAL_MODEL_SCORE" = "EXTERNAL_MODEL_SCORE"

  @inline def values = js.Array[DataSource](EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE)
}

type DataType = "STRING" | "INTEGER" | "FLOAT" | "BOOLEAN"
object DataType {
  val STRING: "STRING" = "STRING"
  val INTEGER: "INTEGER" = "INTEGER"
  val FLOAT: "FLOAT" = "FLOAT"
  val BOOLEAN: "BOOLEAN" = "BOOLEAN"

  @inline def values = js.Array[DataType](STRING, INTEGER, FLOAT, BOOLEAN)
}

type DetectorVersionStatus = "DRAFT" | "ACTIVE" | "INACTIVE"
object DetectorVersionStatus {
  val DRAFT: "DRAFT" = "DRAFT"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[DetectorVersionStatus](DRAFT, ACTIVE, INACTIVE)
}

type Language = "DETECTORPL"
object Language {
  val DETECTORPL: "DETECTORPL" = "DETECTORPL"

  @inline def values = js.Array[Language](DETECTORPL)
}

type ModelEndpointStatus = "ASSOCIATED" | "DISSOCIATED"
object ModelEndpointStatus {
  val ASSOCIATED: "ASSOCIATED" = "ASSOCIATED"
  val DISSOCIATED: "DISSOCIATED" = "DISSOCIATED"

  @inline def values = js.Array[ModelEndpointStatus](ASSOCIATED, DISSOCIATED)
}

type ModelInputDataFormat = "TEXT_CSV" | "APPLICATION_JSON"
object ModelInputDataFormat {
  val TEXT_CSV: "TEXT_CSV" = "TEXT_CSV"
  val APPLICATION_JSON: "APPLICATION_JSON" = "APPLICATION_JSON"

  @inline def values = js.Array[ModelInputDataFormat](TEXT_CSV, APPLICATION_JSON)
}

type ModelOutputDataFormat = "TEXT_CSV" | "APPLICATION_JSONLINES"
object ModelOutputDataFormat {
  val TEXT_CSV: "TEXT_CSV" = "TEXT_CSV"
  val APPLICATION_JSONLINES: "APPLICATION_JSONLINES" = "APPLICATION_JSONLINES"

  @inline def values = js.Array[ModelOutputDataFormat](TEXT_CSV, APPLICATION_JSONLINES)
}

type ModelSource = "SAGEMAKER"
object ModelSource {
  val SAGEMAKER: "SAGEMAKER" = "SAGEMAKER"

  @inline def values = js.Array[ModelSource](SAGEMAKER)
}

type ModelTypeEnum = "ONLINE_FRAUD_INSIGHTS"
object ModelTypeEnum {
  val ONLINE_FRAUD_INSIGHTS: "ONLINE_FRAUD_INSIGHTS" = "ONLINE_FRAUD_INSIGHTS"

  @inline def values = js.Array[ModelTypeEnum](ONLINE_FRAUD_INSIGHTS)
}

type ModelVersionStatus = "ACTIVE" | "INACTIVE" | "TRAINING_CANCELLED"
object ModelVersionStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val TRAINING_CANCELLED: "TRAINING_CANCELLED" = "TRAINING_CANCELLED"

  @inline def values = js.Array[ModelVersionStatus](ACTIVE, INACTIVE, TRAINING_CANCELLED)
}

type RuleExecutionMode = "ALL_MATCHED" | "FIRST_MATCHED"
object RuleExecutionMode {
  val ALL_MATCHED: "ALL_MATCHED" = "ALL_MATCHED"
  val FIRST_MATCHED: "FIRST_MATCHED" = "FIRST_MATCHED"

  @inline def values = js.Array[RuleExecutionMode](ALL_MATCHED, FIRST_MATCHED)
}

type TrainingDataSourceEnum = "EXTERNAL_EVENTS"
object TrainingDataSourceEnum {
  val EXTERNAL_EVENTS: "EXTERNAL_EVENTS" = "EXTERNAL_EVENTS"

  @inline def values = js.Array[TrainingDataSourceEnum](EXTERNAL_EVENTS)
}
