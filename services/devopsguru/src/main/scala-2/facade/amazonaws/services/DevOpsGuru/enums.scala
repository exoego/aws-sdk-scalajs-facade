package facade.amazonaws.services.devopsguru

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AnomalySeverity extends js.Any
object AnomalySeverity {
  val LOW = "LOW".asInstanceOf[AnomalySeverity]
  val MEDIUM = "MEDIUM".asInstanceOf[AnomalySeverity]
  val HIGH = "HIGH".asInstanceOf[AnomalySeverity]

  @inline def values = js.Array(LOW, MEDIUM, HIGH)
}

@js.native
sealed trait AnomalyStatus extends js.Any
object AnomalyStatus {
  val ONGOING = "ONGOING".asInstanceOf[AnomalyStatus]
  val CLOSED = "CLOSED".asInstanceOf[AnomalyStatus]

  @inline def values = js.Array(ONGOING, CLOSED)
}

@js.native
sealed trait CloudWatchMetricsStat extends js.Any
object CloudWatchMetricsStat {
  val Sum = "Sum".asInstanceOf[CloudWatchMetricsStat]
  val Average = "Average".asInstanceOf[CloudWatchMetricsStat]
  val SampleCount = "SampleCount".asInstanceOf[CloudWatchMetricsStat]
  val Minimum = "Minimum".asInstanceOf[CloudWatchMetricsStat]
  val Maximum = "Maximum".asInstanceOf[CloudWatchMetricsStat]
  val p99 = "p99".asInstanceOf[CloudWatchMetricsStat]
  val p90 = "p90".asInstanceOf[CloudWatchMetricsStat]
  val p50 = "p50".asInstanceOf[CloudWatchMetricsStat]

  @inline def values = js.Array(Sum, Average, SampleCount, Minimum, Maximum, p99, p90, p50)
}

@js.native
sealed trait EventClass extends js.Any
object EventClass {
  val INFRASTRUCTURE = "INFRASTRUCTURE".asInstanceOf[EventClass]
  val DEPLOYMENT = "DEPLOYMENT".asInstanceOf[EventClass]
  val SECURITY_CHANGE = "SECURITY_CHANGE".asInstanceOf[EventClass]
  val CONFIG_CHANGE = "CONFIG_CHANGE".asInstanceOf[EventClass]
  val SCHEMA_CHANGE = "SCHEMA_CHANGE".asInstanceOf[EventClass]

  @inline def values = js.Array(INFRASTRUCTURE, DEPLOYMENT, SECURITY_CHANGE, CONFIG_CHANGE, SCHEMA_CHANGE)
}

@js.native
sealed trait EventDataSource extends js.Any
object EventDataSource {
  val AWS_CLOUD_TRAIL = "AWS_CLOUD_TRAIL".asInstanceOf[EventDataSource]
  val AWS_CODE_DEPLOY = "AWS_CODE_DEPLOY".asInstanceOf[EventDataSource]

  @inline def values = js.Array(AWS_CLOUD_TRAIL, AWS_CODE_DEPLOY)
}

@js.native
sealed trait InsightFeedbackOption extends js.Any
object InsightFeedbackOption {
  val VALID_COLLECTION = "VALID_COLLECTION".asInstanceOf[InsightFeedbackOption]
  val RECOMMENDATION_USEFUL = "RECOMMENDATION_USEFUL".asInstanceOf[InsightFeedbackOption]
  val ALERT_TOO_SENSITIVE = "ALERT_TOO_SENSITIVE".asInstanceOf[InsightFeedbackOption]
  val DATA_NOISY_ANOMALY = "DATA_NOISY_ANOMALY".asInstanceOf[InsightFeedbackOption]
  val DATA_INCORRECT = "DATA_INCORRECT".asInstanceOf[InsightFeedbackOption]

  @inline def values = js.Array(VALID_COLLECTION, RECOMMENDATION_USEFUL, ALERT_TOO_SENSITIVE, DATA_NOISY_ANOMALY, DATA_INCORRECT)
}

@js.native
sealed trait InsightSeverity extends js.Any
object InsightSeverity {
  val LOW = "LOW".asInstanceOf[InsightSeverity]
  val MEDIUM = "MEDIUM".asInstanceOf[InsightSeverity]
  val HIGH = "HIGH".asInstanceOf[InsightSeverity]

  @inline def values = js.Array(LOW, MEDIUM, HIGH)
}

@js.native
sealed trait InsightStatus extends js.Any
object InsightStatus {
  val ONGOING = "ONGOING".asInstanceOf[InsightStatus]
  val CLOSED = "CLOSED".asInstanceOf[InsightStatus]

  @inline def values = js.Array(ONGOING, CLOSED)
}

@js.native
sealed trait InsightType extends js.Any
object InsightType {
  val REACTIVE = "REACTIVE".asInstanceOf[InsightType]
  val PROACTIVE = "PROACTIVE".asInstanceOf[InsightType]

  @inline def values = js.Array(REACTIVE, PROACTIVE)
}

/** Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
  */
@js.native
sealed trait OptInStatus extends js.Any
object OptInStatus {
  val ENABLED = "ENABLED".asInstanceOf[OptInStatus]
  val DISABLED = "DISABLED".asInstanceOf[OptInStatus]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait ResourceCollectionType extends js.Any
object ResourceCollectionType {
  val AWS_CLOUD_FORMATION = "AWS_CLOUD_FORMATION".asInstanceOf[ResourceCollectionType]

  @inline def values = js.Array(AWS_CLOUD_FORMATION)
}

@js.native
sealed trait UpdateResourceCollectionAction extends js.Any
object UpdateResourceCollectionAction {
  val ADD = "ADD".asInstanceOf[UpdateResourceCollectionAction]
  val REMOVE = "REMOVE".asInstanceOf[UpdateResourceCollectionAction]

  @inline def values = js.Array(ADD, REMOVE)
}
