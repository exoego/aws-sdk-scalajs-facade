package facade.amazonaws.services.frauddetector

import scalajs.js

@js.native
sealed trait AsyncJobStatus extends js.Any
object AsyncJobStatus {
  val IN_PROGRESS_INITIALIZING = "IN_PROGRESS_INITIALIZING".asInstanceOf[AsyncJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AsyncJobStatus]
  val CANCEL_IN_PROGRESS = "CANCEL_IN_PROGRESS".asInstanceOf[AsyncJobStatus]
  val CANCELED = "CANCELED".asInstanceOf[AsyncJobStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[AsyncJobStatus]
  val FAILED = "FAILED".asInstanceOf[AsyncJobStatus]

  @inline def values: js.Array[AsyncJobStatus] = js.Array(IN_PROGRESS_INITIALIZING, IN_PROGRESS, CANCEL_IN_PROGRESS, CANCELED, COMPLETE, FAILED)
}

@js.native
sealed trait DataSource extends js.Any
object DataSource {
  val EVENT = "EVENT".asInstanceOf[DataSource]
  val MODEL_SCORE = "MODEL_SCORE".asInstanceOf[DataSource]
  val EXTERNAL_MODEL_SCORE = "EXTERNAL_MODEL_SCORE".asInstanceOf[DataSource]

  @inline def values: js.Array[DataSource] = js.Array(EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE)
}

@js.native
sealed trait DataType extends js.Any
object DataType {
  val STRING = "STRING".asInstanceOf[DataType]
  val INTEGER = "INTEGER".asInstanceOf[DataType]
  val FLOAT = "FLOAT".asInstanceOf[DataType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[DataType]

  @inline def values: js.Array[DataType] = js.Array(STRING, INTEGER, FLOAT, BOOLEAN)
}

@js.native
sealed trait DetectorVersionStatus extends js.Any
object DetectorVersionStatus {
  val DRAFT = "DRAFT".asInstanceOf[DetectorVersionStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DetectorVersionStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[DetectorVersionStatus]

  @inline def values: js.Array[DetectorVersionStatus] = js.Array(DRAFT, ACTIVE, INACTIVE)
}

@js.native
sealed trait EventIngestion extends js.Any
object EventIngestion {
  val ENABLED = "ENABLED".asInstanceOf[EventIngestion]
  val DISABLED = "DISABLED".asInstanceOf[EventIngestion]

  @inline def values: js.Array[EventIngestion] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait Language extends js.Any
object Language {
  val DETECTORPL = "DETECTORPL".asInstanceOf[Language]

  @inline def values: js.Array[Language] = js.Array(DETECTORPL)
}

@js.native
sealed trait ModelEndpointStatus extends js.Any
object ModelEndpointStatus {
  val ASSOCIATED = "ASSOCIATED".asInstanceOf[ModelEndpointStatus]
  val DISSOCIATED = "DISSOCIATED".asInstanceOf[ModelEndpointStatus]

  @inline def values: js.Array[ModelEndpointStatus] = js.Array(ASSOCIATED, DISSOCIATED)
}

@js.native
sealed trait ModelInputDataFormat extends js.Any
object ModelInputDataFormat {
  val TEXT_CSV = "TEXT_CSV".asInstanceOf[ModelInputDataFormat]
  val APPLICATION_JSON = "APPLICATION_JSON".asInstanceOf[ModelInputDataFormat]

  @inline def values: js.Array[ModelInputDataFormat] = js.Array(TEXT_CSV, APPLICATION_JSON)
}

@js.native
sealed trait ModelOutputDataFormat extends js.Any
object ModelOutputDataFormat {
  val TEXT_CSV = "TEXT_CSV".asInstanceOf[ModelOutputDataFormat]
  val APPLICATION_JSONLINES = "APPLICATION_JSONLINES".asInstanceOf[ModelOutputDataFormat]

  @inline def values: js.Array[ModelOutputDataFormat] = js.Array(TEXT_CSV, APPLICATION_JSONLINES)
}

@js.native
sealed trait ModelSource extends js.Any
object ModelSource {
  val SAGEMAKER = "SAGEMAKER".asInstanceOf[ModelSource]

  @inline def values: js.Array[ModelSource] = js.Array(SAGEMAKER)
}

@js.native
sealed trait ModelTypeEnum extends js.Any
object ModelTypeEnum {
  val ONLINE_FRAUD_INSIGHTS = "ONLINE_FRAUD_INSIGHTS".asInstanceOf[ModelTypeEnum]
  val TRANSACTION_FRAUD_INSIGHTS = "TRANSACTION_FRAUD_INSIGHTS".asInstanceOf[ModelTypeEnum]

  @inline def values: js.Array[ModelTypeEnum] = js.Array(ONLINE_FRAUD_INSIGHTS, TRANSACTION_FRAUD_INSIGHTS)
}

@js.native
sealed trait ModelVersionStatus extends js.Any
object ModelVersionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ModelVersionStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[ModelVersionStatus]
  val TRAINING_CANCELLED = "TRAINING_CANCELLED".asInstanceOf[ModelVersionStatus]

  @inline def values: js.Array[ModelVersionStatus] = js.Array(ACTIVE, INACTIVE, TRAINING_CANCELLED)
}

@js.native
sealed trait RuleExecutionMode extends js.Any
object RuleExecutionMode {
  val ALL_MATCHED = "ALL_MATCHED".asInstanceOf[RuleExecutionMode]
  val FIRST_MATCHED = "FIRST_MATCHED".asInstanceOf[RuleExecutionMode]

  @inline def values: js.Array[RuleExecutionMode] = js.Array(ALL_MATCHED, FIRST_MATCHED)
}

@js.native
sealed trait TrainingDataSourceEnum extends js.Any
object TrainingDataSourceEnum {
  val EXTERNAL_EVENTS = "EXTERNAL_EVENTS".asInstanceOf[TrainingDataSourceEnum]
  val INGESTED_EVENTS = "INGESTED_EVENTS".asInstanceOf[TrainingDataSourceEnum]

  @inline def values: js.Array[TrainingDataSourceEnum] = js.Array(EXTERNAL_EVENTS, INGESTED_EVENTS)
}

@js.native
sealed trait UnlabeledEventsTreatment extends js.Any
object UnlabeledEventsTreatment {
  val IGNORE = "IGNORE".asInstanceOf[UnlabeledEventsTreatment]
  val FRAUD = "FRAUD".asInstanceOf[UnlabeledEventsTreatment]
  val LEGIT = "LEGIT".asInstanceOf[UnlabeledEventsTreatment]

  @inline def values: js.Array[UnlabeledEventsTreatment] = js.Array(IGNORE, FRAUD, LEGIT)
}
