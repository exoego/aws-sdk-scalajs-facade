package facade.amazonaws.services.lookoutmetrics

import scalajs._

type AggregationFunction = "AVG" | "SUM"
object AggregationFunction {
  val AVG: "AVG" = "AVG"
  val SUM: "SUM" = "SUM"

  @inline def values = js.Array[AggregationFunction](AVG, SUM)
}

type AlertStatus = "ACTIVE" | "INACTIVE"
object AlertStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[AlertStatus](ACTIVE, INACTIVE)
}

type AlertType = "SNS" | "LAMBDA"
object AlertType {
  val SNS: "SNS" = "SNS"
  val LAMBDA: "LAMBDA" = "LAMBDA"

  @inline def values = js.Array[AlertType](SNS, LAMBDA)
}

type AnomalyDetectionTaskStatus = "PENDING" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "FAILED_TO_SCHEDULE"
object AnomalyDetectionTaskStatus {
  val PENDING: "PENDING" = "PENDING"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val FAILED_TO_SCHEDULE: "FAILED_TO_SCHEDULE" = "FAILED_TO_SCHEDULE"

  @inline def values = js.Array[AnomalyDetectionTaskStatus](PENDING, IN_PROGRESS, COMPLETED, FAILED, FAILED_TO_SCHEDULE)
}

type AnomalyDetectorStatus = "ACTIVE" | "ACTIVATING" | "DELETING" | "FAILED" | "INACTIVE" | "BACK_TEST_ACTIVATING" | "BACK_TEST_ACTIVE" | "BACK_TEST_COMPLETE"
object AnomalyDetectorStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val BACK_TEST_ACTIVATING: "BACK_TEST_ACTIVATING" = "BACK_TEST_ACTIVATING"
  val BACK_TEST_ACTIVE: "BACK_TEST_ACTIVE" = "BACK_TEST_ACTIVE"
  val BACK_TEST_COMPLETE: "BACK_TEST_COMPLETE" = "BACK_TEST_COMPLETE"

  @inline def values = js.Array[AnomalyDetectorStatus](ACTIVE, ACTIVATING, DELETING, FAILED, INACTIVE, BACK_TEST_ACTIVATING, BACK_TEST_ACTIVE, BACK_TEST_COMPLETE)
}

type CSVFileCompression = "NONE" | "GZIP"
object CSVFileCompression {
  val NONE: "NONE" = "NONE"
  val GZIP: "GZIP" = "GZIP"

  @inline def values = js.Array[CSVFileCompression](NONE, GZIP)
}

type Frequency = "P1D" | "PT1H" | "PT10M" | "PT5M"
object Frequency {
  val P1D: "P1D" = "P1D"
  val PT1H: "PT1H" = "PT1H"
  val PT10M: "PT10M" = "PT10M"
  val PT5M: "PT5M" = "PT5M"

  @inline def values = js.Array[Frequency](P1D, PT1H, PT10M, PT5M)
}

type JsonFileCompression = "NONE" | "GZIP"
object JsonFileCompression {
  val NONE: "NONE" = "NONE"
  val GZIP: "GZIP" = "GZIP"

  @inline def values = js.Array[JsonFileCompression](NONE, GZIP)
}
