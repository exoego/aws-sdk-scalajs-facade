package facade.amazonaws.services.lookoutmetrics

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AggregationFunction extends js.Any
object AggregationFunction {
  val AVG = "AVG".asInstanceOf[AggregationFunction]
  val SUM = "SUM".asInstanceOf[AggregationFunction]

  @inline def values = js.Array(AVG, SUM)
}

@js.native
sealed trait AlertStatus extends js.Any
object AlertStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AlertStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AlertStatus]

  @inline def values = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait AlertType extends js.Any
object AlertType {
  val SNS = "SNS".asInstanceOf[AlertType]
  val LAMBDA = "LAMBDA".asInstanceOf[AlertType]

  @inline def values = js.Array(SNS, LAMBDA)
}

@js.native
sealed trait AnomalyDetectionTaskStatus extends js.Any
object AnomalyDetectionTaskStatus {
  val PENDING = "PENDING".asInstanceOf[AnomalyDetectionTaskStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AnomalyDetectionTaskStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[AnomalyDetectionTaskStatus]
  val FAILED = "FAILED".asInstanceOf[AnomalyDetectionTaskStatus]
  val FAILED_TO_SCHEDULE = "FAILED_TO_SCHEDULE".asInstanceOf[AnomalyDetectionTaskStatus]

  @inline def values = js.Array(PENDING, IN_PROGRESS, COMPLETED, FAILED, FAILED_TO_SCHEDULE)
}

@js.native
sealed trait AnomalyDetectorStatus extends js.Any
object AnomalyDetectorStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AnomalyDetectorStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[AnomalyDetectorStatus]
  val DELETING = "DELETING".asInstanceOf[AnomalyDetectorStatus]
  val FAILED = "FAILED".asInstanceOf[AnomalyDetectorStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AnomalyDetectorStatus]
  val BACK_TEST_ACTIVATING = "BACK_TEST_ACTIVATING".asInstanceOf[AnomalyDetectorStatus]
  val BACK_TEST_ACTIVE = "BACK_TEST_ACTIVE".asInstanceOf[AnomalyDetectorStatus]
  val BACK_TEST_COMPLETE = "BACK_TEST_COMPLETE".asInstanceOf[AnomalyDetectorStatus]

  @inline def values = js.Array(ACTIVE, ACTIVATING, DELETING, FAILED, INACTIVE, BACK_TEST_ACTIVATING, BACK_TEST_ACTIVE, BACK_TEST_COMPLETE)
}

@js.native
sealed trait CSVFileCompression extends js.Any
object CSVFileCompression {
  val NONE = "NONE".asInstanceOf[CSVFileCompression]
  val GZIP = "GZIP".asInstanceOf[CSVFileCompression]

  @inline def values = js.Array(NONE, GZIP)
}

@js.native
sealed trait Frequency extends js.Any
object Frequency {
  val P1D = "P1D".asInstanceOf[Frequency]
  val PT1H = "PT1H".asInstanceOf[Frequency]
  val PT10M = "PT10M".asInstanceOf[Frequency]
  val PT5M = "PT5M".asInstanceOf[Frequency]

  @inline def values = js.Array(P1D, PT1H, PT10M, PT5M)
}

@js.native
sealed trait JsonFileCompression extends js.Any
object JsonFileCompression {
  val NONE = "NONE".asInstanceOf[JsonFileCompression]
  val GZIP = "GZIP".asInstanceOf[JsonFileCompression]

  @inline def values = js.Array(NONE, GZIP)
}

