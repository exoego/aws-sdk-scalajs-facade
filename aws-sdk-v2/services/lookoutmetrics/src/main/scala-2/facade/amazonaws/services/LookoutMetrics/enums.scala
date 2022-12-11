package facade.amazonaws.services.lookoutmetrics

import scalajs.js

@js.native
sealed trait AggregationFunction extends js.Any
object AggregationFunction {
  val AVG = "AVG".asInstanceOf[AggregationFunction]
  val SUM = "SUM".asInstanceOf[AggregationFunction]

  @inline def values: js.Array[AggregationFunction] = js.Array(AVG, SUM)
}

@js.native
sealed trait AlertStatus extends js.Any
object AlertStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AlertStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AlertStatus]

  @inline def values: js.Array[AlertStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait AlertType extends js.Any
object AlertType {
  val SNS = "SNS".asInstanceOf[AlertType]
  val LAMBDA = "LAMBDA".asInstanceOf[AlertType]

  @inline def values: js.Array[AlertType] = js.Array(SNS, LAMBDA)
}

@js.native
sealed trait AnomalyDetectionTaskStatus extends js.Any
object AnomalyDetectionTaskStatus {
  val PENDING = "PENDING".asInstanceOf[AnomalyDetectionTaskStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AnomalyDetectionTaskStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[AnomalyDetectionTaskStatus]
  val FAILED = "FAILED".asInstanceOf[AnomalyDetectionTaskStatus]
  val FAILED_TO_SCHEDULE = "FAILED_TO_SCHEDULE".asInstanceOf[AnomalyDetectionTaskStatus]

  @inline def values: js.Array[AnomalyDetectionTaskStatus] = js.Array(PENDING, IN_PROGRESS, COMPLETED, FAILED, FAILED_TO_SCHEDULE)
}

@js.native
sealed trait AnomalyDetectorFailureType extends js.Any
object AnomalyDetectorFailureType {
  val ACTIVATION_FAILURE = "ACTIVATION_FAILURE".asInstanceOf[AnomalyDetectorFailureType]
  val BACK_TEST_ACTIVATION_FAILURE = "BACK_TEST_ACTIVATION_FAILURE".asInstanceOf[AnomalyDetectorFailureType]
  val DELETION_FAILURE = "DELETION_FAILURE".asInstanceOf[AnomalyDetectorFailureType]
  val DEACTIVATION_FAILURE = "DEACTIVATION_FAILURE".asInstanceOf[AnomalyDetectorFailureType]

  @inline def values: js.Array[AnomalyDetectorFailureType] = js.Array(ACTIVATION_FAILURE, BACK_TEST_ACTIVATION_FAILURE, DELETION_FAILURE, DEACTIVATION_FAILURE)
}

@js.native
sealed trait AnomalyDetectorStatus extends js.Any
object AnomalyDetectorStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AnomalyDetectorStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[AnomalyDetectorStatus]
  val DELETING = "DELETING".asInstanceOf[AnomalyDetectorStatus]
  val FAILED = "FAILED".asInstanceOf[AnomalyDetectorStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AnomalyDetectorStatus]
  val LEARNING = "LEARNING".asInstanceOf[AnomalyDetectorStatus]
  val BACK_TEST_ACTIVATING = "BACK_TEST_ACTIVATING".asInstanceOf[AnomalyDetectorStatus]
  val BACK_TEST_ACTIVE = "BACK_TEST_ACTIVE".asInstanceOf[AnomalyDetectorStatus]
  val BACK_TEST_COMPLETE = "BACK_TEST_COMPLETE".asInstanceOf[AnomalyDetectorStatus]
  val DEACTIVATED = "DEACTIVATED".asInstanceOf[AnomalyDetectorStatus]
  val DEACTIVATING = "DEACTIVATING".asInstanceOf[AnomalyDetectorStatus]

  @inline def values: js.Array[AnomalyDetectorStatus] = js.Array(ACTIVE, ACTIVATING, DELETING, FAILED, INACTIVE, LEARNING, BACK_TEST_ACTIVATING, BACK_TEST_ACTIVE, BACK_TEST_COMPLETE, DEACTIVATED, DEACTIVATING)
}

@js.native
sealed trait CSVFileCompression extends js.Any
object CSVFileCompression {
  val NONE = "NONE".asInstanceOf[CSVFileCompression]
  val GZIP = "GZIP".asInstanceOf[CSVFileCompression]

  @inline def values: js.Array[CSVFileCompression] = js.Array(NONE, GZIP)
}

@js.native
sealed trait Confidence extends js.Any
object Confidence {
  val HIGH = "HIGH".asInstanceOf[Confidence]
  val LOW = "LOW".asInstanceOf[Confidence]
  val NONE = "NONE".asInstanceOf[Confidence]

  @inline def values: js.Array[Confidence] = js.Array(HIGH, LOW, NONE)
}

@js.native
sealed trait DataQualityMetricType extends js.Any
object DataQualityMetricType {
  val COLUMN_COMPLETENESS = "COLUMN_COMPLETENESS".asInstanceOf[DataQualityMetricType]
  val DIMENSION_UNIQUENESS = "DIMENSION_UNIQUENESS".asInstanceOf[DataQualityMetricType]
  val TIME_SERIES_COUNT = "TIME_SERIES_COUNT".asInstanceOf[DataQualityMetricType]
  val ROWS_PROCESSED = "ROWS_PROCESSED".asInstanceOf[DataQualityMetricType]
  val ROWS_PARTIAL_COMPLIANCE = "ROWS_PARTIAL_COMPLIANCE".asInstanceOf[DataQualityMetricType]
  val INVALID_ROWS_COMPLIANCE = "INVALID_ROWS_COMPLIANCE".asInstanceOf[DataQualityMetricType]
  val BACKTEST_TRAINING_DATA_START_TIME_STAMP = "BACKTEST_TRAINING_DATA_START_TIME_STAMP".asInstanceOf[DataQualityMetricType]
  val BACKTEST_TRAINING_DATA_END_TIME_STAMP = "BACKTEST_TRAINING_DATA_END_TIME_STAMP".asInstanceOf[DataQualityMetricType]
  val BACKTEST_INFERENCE_DATA_START_TIME_STAMP = "BACKTEST_INFERENCE_DATA_START_TIME_STAMP".asInstanceOf[DataQualityMetricType]
  val BACKTEST_INFERENCE_DATA_END_TIME_STAMP = "BACKTEST_INFERENCE_DATA_END_TIME_STAMP".asInstanceOf[DataQualityMetricType]

  @inline def values: js.Array[DataQualityMetricType] = js.Array(
    COLUMN_COMPLETENESS,
    DIMENSION_UNIQUENESS,
    TIME_SERIES_COUNT,
    ROWS_PROCESSED,
    ROWS_PARTIAL_COMPLIANCE,
    INVALID_ROWS_COMPLIANCE,
    BACKTEST_TRAINING_DATA_START_TIME_STAMP,
    BACKTEST_TRAINING_DATA_END_TIME_STAMP,
    BACKTEST_INFERENCE_DATA_START_TIME_STAMP,
    BACKTEST_INFERENCE_DATA_END_TIME_STAMP
  )
}

@js.native
sealed trait FilterOperation extends js.Any
object FilterOperation {
  val EQUALS = "EQUALS".asInstanceOf[FilterOperation]

  @inline def values: js.Array[FilterOperation] = js.Array(EQUALS)
}

@js.native
sealed trait Frequency extends js.Any
object Frequency {
  val P1D = "P1D".asInstanceOf[Frequency]
  val PT1H = "PT1H".asInstanceOf[Frequency]
  val PT10M = "PT10M".asInstanceOf[Frequency]
  val PT5M = "PT5M".asInstanceOf[Frequency]

  @inline def values: js.Array[Frequency] = js.Array(P1D, PT1H, PT10M, PT5M)
}

@js.native
sealed trait JsonFileCompression extends js.Any
object JsonFileCompression {
  val NONE = "NONE".asInstanceOf[JsonFileCompression]
  val GZIP = "GZIP".asInstanceOf[JsonFileCompression]

  @inline def values: js.Array[JsonFileCompression] = js.Array(NONE, GZIP)
}

@js.native
sealed trait RelationshipType extends js.Any
object RelationshipType {
  val CAUSE_OF_INPUT_ANOMALY_GROUP = "CAUSE_OF_INPUT_ANOMALY_GROUP".asInstanceOf[RelationshipType]
  val EFFECT_OF_INPUT_ANOMALY_GROUP = "EFFECT_OF_INPUT_ANOMALY_GROUP".asInstanceOf[RelationshipType]

  @inline def values: js.Array[RelationshipType] = js.Array(CAUSE_OF_INPUT_ANOMALY_GROUP, EFFECT_OF_INPUT_ANOMALY_GROUP)
}

@js.native
sealed trait SnsFormat extends js.Any
object SnsFormat {
  val LONG_TEXT = "LONG_TEXT".asInstanceOf[SnsFormat]
  val SHORT_TEXT = "SHORT_TEXT".asInstanceOf[SnsFormat]
  val JSON = "JSON".asInstanceOf[SnsFormat]

  @inline def values: js.Array[SnsFormat] = js.Array(LONG_TEXT, SHORT_TEXT, JSON)
}
