package facade.amazonaws.services.frauddetector

import scalajs.js

type AsyncJobStatus = "IN_PROGRESS_INITIALIZING" | "IN_PROGRESS" | "CANCEL_IN_PROGRESS" | "CANCELED" | "COMPLETE" | "FAILED"
object AsyncJobStatus {
  inline val IN_PROGRESS_INITIALIZING: "IN_PROGRESS_INITIALIZING" = "IN_PROGRESS_INITIALIZING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCEL_IN_PROGRESS: "CANCEL_IN_PROGRESS" = "CANCEL_IN_PROGRESS"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AsyncJobStatus] = js.Array(IN_PROGRESS_INITIALIZING, IN_PROGRESS, CANCEL_IN_PROGRESS, CANCELED, COMPLETE, FAILED)
}

type DataSource = "EVENT" | "MODEL_SCORE" | "EXTERNAL_MODEL_SCORE"
object DataSource {
  inline val EVENT: "EVENT" = "EVENT"
  inline val MODEL_SCORE: "MODEL_SCORE" = "MODEL_SCORE"
  inline val EXTERNAL_MODEL_SCORE: "EXTERNAL_MODEL_SCORE" = "EXTERNAL_MODEL_SCORE"

  inline def values: js.Array[DataSource] = js.Array(EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE)
}

type DataType = "STRING" | "INTEGER" | "FLOAT" | "BOOLEAN"
object DataType {
  inline val STRING: "STRING" = "STRING"
  inline val INTEGER: "INTEGER" = "INTEGER"
  inline val FLOAT: "FLOAT" = "FLOAT"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"

  inline def values: js.Array[DataType] = js.Array(STRING, INTEGER, FLOAT, BOOLEAN)
}

type DetectorVersionStatus = "DRAFT" | "ACTIVE" | "INACTIVE"
object DetectorVersionStatus {
  inline val DRAFT: "DRAFT" = "DRAFT"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[DetectorVersionStatus] = js.Array(DRAFT, ACTIVE, INACTIVE)
}

type Language = "DETECTORPL"
object Language {
  inline val DETECTORPL: "DETECTORPL" = "DETECTORPL"

  inline def values: js.Array[Language] = js.Array(DETECTORPL)
}

type ModelEndpointStatus = "ASSOCIATED" | "DISSOCIATED"
object ModelEndpointStatus {
  inline val ASSOCIATED: "ASSOCIATED" = "ASSOCIATED"
  inline val DISSOCIATED: "DISSOCIATED" = "DISSOCIATED"

  inline def values: js.Array[ModelEndpointStatus] = js.Array(ASSOCIATED, DISSOCIATED)
}

type ModelInputDataFormat = "TEXT_CSV" | "APPLICATION_JSON"
object ModelInputDataFormat {
  inline val TEXT_CSV: "TEXT_CSV" = "TEXT_CSV"
  inline val APPLICATION_JSON: "APPLICATION_JSON" = "APPLICATION_JSON"

  inline def values: js.Array[ModelInputDataFormat] = js.Array(TEXT_CSV, APPLICATION_JSON)
}

type ModelOutputDataFormat = "TEXT_CSV" | "APPLICATION_JSONLINES"
object ModelOutputDataFormat {
  inline val TEXT_CSV: "TEXT_CSV" = "TEXT_CSV"
  inline val APPLICATION_JSONLINES: "APPLICATION_JSONLINES" = "APPLICATION_JSONLINES"

  inline def values: js.Array[ModelOutputDataFormat] = js.Array(TEXT_CSV, APPLICATION_JSONLINES)
}

type ModelSource = "SAGEMAKER"
object ModelSource {
  inline val SAGEMAKER: "SAGEMAKER" = "SAGEMAKER"

  inline def values: js.Array[ModelSource] = js.Array(SAGEMAKER)
}

type ModelTypeEnum = "ONLINE_FRAUD_INSIGHTS"
object ModelTypeEnum {
  inline val ONLINE_FRAUD_INSIGHTS: "ONLINE_FRAUD_INSIGHTS" = "ONLINE_FRAUD_INSIGHTS"

  inline def values: js.Array[ModelTypeEnum] = js.Array(ONLINE_FRAUD_INSIGHTS)
}

type ModelVersionStatus = "ACTIVE" | "INACTIVE" | "TRAINING_CANCELLED"
object ModelVersionStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val TRAINING_CANCELLED: "TRAINING_CANCELLED" = "TRAINING_CANCELLED"

  inline def values: js.Array[ModelVersionStatus] = js.Array(ACTIVE, INACTIVE, TRAINING_CANCELLED)
}

type RuleExecutionMode = "ALL_MATCHED" | "FIRST_MATCHED"
object RuleExecutionMode {
  inline val ALL_MATCHED: "ALL_MATCHED" = "ALL_MATCHED"
  inline val FIRST_MATCHED: "FIRST_MATCHED" = "FIRST_MATCHED"

  inline def values: js.Array[RuleExecutionMode] = js.Array(ALL_MATCHED, FIRST_MATCHED)
}

type TrainingDataSourceEnum = "EXTERNAL_EVENTS"
object TrainingDataSourceEnum {
  inline val EXTERNAL_EVENTS: "EXTERNAL_EVENTS" = "EXTERNAL_EVENTS"

  inline def values: js.Array[TrainingDataSourceEnum] = js.Array(EXTERNAL_EVENTS)
}
