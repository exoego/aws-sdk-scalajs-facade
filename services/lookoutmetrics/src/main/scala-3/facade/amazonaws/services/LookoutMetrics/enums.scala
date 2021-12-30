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

type AnomalyDetectorStatus = "ACTIVE" | "ACTIVATING" | "DELETING" | "FAILED" | "INACTIVE" | "BACK_TEST_ACTIVATING" | "BACK_TEST_ACTIVE" | "BACK_TEST_COMPLETE"
object AnomalyDetectorStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val BACK_TEST_ACTIVATING: "BACK_TEST_ACTIVATING" = "BACK_TEST_ACTIVATING"
  inline val BACK_TEST_ACTIVE: "BACK_TEST_ACTIVE" = "BACK_TEST_ACTIVE"
  inline val BACK_TEST_COMPLETE: "BACK_TEST_COMPLETE" = "BACK_TEST_COMPLETE"

  inline def values: js.Array[AnomalyDetectorStatus] = js.Array(ACTIVE, ACTIVATING, DELETING, FAILED, INACTIVE, BACK_TEST_ACTIVATING, BACK_TEST_ACTIVE, BACK_TEST_COMPLETE)
}

type CSVFileCompression = "NONE" | "GZIP"
object CSVFileCompression {
  inline val NONE: "NONE" = "NONE"
  inline val GZIP: "GZIP" = "GZIP"

  inline def values: js.Array[CSVFileCompression] = js.Array(NONE, GZIP)
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
