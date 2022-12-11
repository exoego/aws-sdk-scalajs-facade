package facade.amazonaws.services.lookoutmetrics

import scalajs.js

type AggregationFunction = "AVG" | "SUM"
object AggregationFunction {
  inline val AVG: "AVG" = "AVG"
  inline val SUM: "SUM" = "SUM"

  inline def values: js.Array[AggregationFunction] = js.Array(AVG, SUM)
}

type AlertStatus = "ACTIVE" | "INACTIVE"
object AlertStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[AlertStatus] = js.Array(ACTIVE, INACTIVE)
}

type AlertType = "SNS" | "LAMBDA"
object AlertType {
  inline val SNS: "SNS" = "SNS"
  inline val LAMBDA: "LAMBDA" = "LAMBDA"

  inline def values: js.Array[AlertType] = js.Array(SNS, LAMBDA)
}

type AnomalyDetectionTaskStatus = "PENDING" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "FAILED_TO_SCHEDULE"
object AnomalyDetectionTaskStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val FAILED_TO_SCHEDULE: "FAILED_TO_SCHEDULE" = "FAILED_TO_SCHEDULE"

  inline def values: js.Array[AnomalyDetectionTaskStatus] = js.Array(PENDING, IN_PROGRESS, COMPLETED, FAILED, FAILED_TO_SCHEDULE)
}

type AnomalyDetectorFailureType = "ACTIVATION_FAILURE" | "BACK_TEST_ACTIVATION_FAILURE" | "DELETION_FAILURE" | "DEACTIVATION_FAILURE"
object AnomalyDetectorFailureType {
  inline val ACTIVATION_FAILURE: "ACTIVATION_FAILURE" = "ACTIVATION_FAILURE"
  inline val BACK_TEST_ACTIVATION_FAILURE: "BACK_TEST_ACTIVATION_FAILURE" = "BACK_TEST_ACTIVATION_FAILURE"
  inline val DELETION_FAILURE: "DELETION_FAILURE" = "DELETION_FAILURE"
  inline val DEACTIVATION_FAILURE: "DEACTIVATION_FAILURE" = "DEACTIVATION_FAILURE"

  inline def values: js.Array[AnomalyDetectorFailureType] = js.Array(ACTIVATION_FAILURE, BACK_TEST_ACTIVATION_FAILURE, DELETION_FAILURE, DEACTIVATION_FAILURE)
}

type AnomalyDetectorStatus = "ACTIVE" | "ACTIVATING" | "DELETING" | "FAILED" | "INACTIVE" | "LEARNING" | "BACK_TEST_ACTIVATING" | "BACK_TEST_ACTIVE" | "BACK_TEST_COMPLETE" | "DEACTIVATED" | "DEACTIVATING"
object AnomalyDetectorStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val LEARNING: "LEARNING" = "LEARNING"
  inline val BACK_TEST_ACTIVATING: "BACK_TEST_ACTIVATING" = "BACK_TEST_ACTIVATING"
  inline val BACK_TEST_ACTIVE: "BACK_TEST_ACTIVE" = "BACK_TEST_ACTIVE"
  inline val BACK_TEST_COMPLETE: "BACK_TEST_COMPLETE" = "BACK_TEST_COMPLETE"
  inline val DEACTIVATED: "DEACTIVATED" = "DEACTIVATED"
  inline val DEACTIVATING: "DEACTIVATING" = "DEACTIVATING"

  inline def values: js.Array[AnomalyDetectorStatus] = js.Array(ACTIVE, ACTIVATING, DELETING, FAILED, INACTIVE, LEARNING, BACK_TEST_ACTIVATING, BACK_TEST_ACTIVE, BACK_TEST_COMPLETE, DEACTIVATED, DEACTIVATING)
}

type CSVFileCompression = "NONE" | "GZIP"
object CSVFileCompression {
  inline val NONE: "NONE" = "NONE"
  inline val GZIP: "GZIP" = "GZIP"

  inline def values: js.Array[CSVFileCompression] = js.Array(NONE, GZIP)
}

type Confidence = "HIGH" | "LOW" | "NONE"
object Confidence {
  inline val HIGH: "HIGH" = "HIGH"
  inline val LOW: "LOW" = "LOW"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[Confidence] = js.Array(HIGH, LOW, NONE)
}

type DataQualityMetricType = "COLUMN_COMPLETENESS" | "DIMENSION_UNIQUENESS" | "TIME_SERIES_COUNT" | "ROWS_PROCESSED" | "ROWS_PARTIAL_COMPLIANCE" | "INVALID_ROWS_COMPLIANCE" | "BACKTEST_TRAINING_DATA_START_TIME_STAMP" | "BACKTEST_TRAINING_DATA_END_TIME_STAMP" | "BACKTEST_INFERENCE_DATA_START_TIME_STAMP" | "BACKTEST_INFERENCE_DATA_END_TIME_STAMP"
object DataQualityMetricType {
  inline val COLUMN_COMPLETENESS: "COLUMN_COMPLETENESS" = "COLUMN_COMPLETENESS"
  inline val DIMENSION_UNIQUENESS: "DIMENSION_UNIQUENESS" = "DIMENSION_UNIQUENESS"
  inline val TIME_SERIES_COUNT: "TIME_SERIES_COUNT" = "TIME_SERIES_COUNT"
  inline val ROWS_PROCESSED: "ROWS_PROCESSED" = "ROWS_PROCESSED"
  inline val ROWS_PARTIAL_COMPLIANCE: "ROWS_PARTIAL_COMPLIANCE" = "ROWS_PARTIAL_COMPLIANCE"
  inline val INVALID_ROWS_COMPLIANCE: "INVALID_ROWS_COMPLIANCE" = "INVALID_ROWS_COMPLIANCE"
  inline val BACKTEST_TRAINING_DATA_START_TIME_STAMP: "BACKTEST_TRAINING_DATA_START_TIME_STAMP" = "BACKTEST_TRAINING_DATA_START_TIME_STAMP"
  inline val BACKTEST_TRAINING_DATA_END_TIME_STAMP: "BACKTEST_TRAINING_DATA_END_TIME_STAMP" = "BACKTEST_TRAINING_DATA_END_TIME_STAMP"
  inline val BACKTEST_INFERENCE_DATA_START_TIME_STAMP: "BACKTEST_INFERENCE_DATA_START_TIME_STAMP" = "BACKTEST_INFERENCE_DATA_START_TIME_STAMP"
  inline val BACKTEST_INFERENCE_DATA_END_TIME_STAMP: "BACKTEST_INFERENCE_DATA_END_TIME_STAMP" = "BACKTEST_INFERENCE_DATA_END_TIME_STAMP"

  inline def values: js.Array[DataQualityMetricType] = js.Array(
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

type FilterOperation = "EQUALS"
object FilterOperation {
  inline val EQUALS: "EQUALS" = "EQUALS"

  inline def values: js.Array[FilterOperation] = js.Array(EQUALS)
}

type Frequency = "P1D" | "PT1H" | "PT10M" | "PT5M"
object Frequency {
  inline val P1D: "P1D" = "P1D"
  inline val PT1H: "PT1H" = "PT1H"
  inline val PT10M: "PT10M" = "PT10M"
  inline val PT5M: "PT5M" = "PT5M"

  inline def values: js.Array[Frequency] = js.Array(P1D, PT1H, PT10M, PT5M)
}

type JsonFileCompression = "NONE" | "GZIP"
object JsonFileCompression {
  inline val NONE: "NONE" = "NONE"
  inline val GZIP: "GZIP" = "GZIP"

  inline def values: js.Array[JsonFileCompression] = js.Array(NONE, GZIP)
}

type RelationshipType = "CAUSE_OF_INPUT_ANOMALY_GROUP" | "EFFECT_OF_INPUT_ANOMALY_GROUP"
object RelationshipType {
  inline val CAUSE_OF_INPUT_ANOMALY_GROUP: "CAUSE_OF_INPUT_ANOMALY_GROUP" = "CAUSE_OF_INPUT_ANOMALY_GROUP"
  inline val EFFECT_OF_INPUT_ANOMALY_GROUP: "EFFECT_OF_INPUT_ANOMALY_GROUP" = "EFFECT_OF_INPUT_ANOMALY_GROUP"

  inline def values: js.Array[RelationshipType] = js.Array(CAUSE_OF_INPUT_ANOMALY_GROUP, EFFECT_OF_INPUT_ANOMALY_GROUP)
}

type SnsFormat = "LONG_TEXT" | "SHORT_TEXT" | "JSON"
object SnsFormat {
  inline val LONG_TEXT: "LONG_TEXT" = "LONG_TEXT"
  inline val SHORT_TEXT: "SHORT_TEXT" = "SHORT_TEXT"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[SnsFormat] = js.Array(LONG_TEXT, SHORT_TEXT, JSON)
}
