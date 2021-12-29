package facade.amazonaws.services.devopsguru

import scalajs._

type AnomalySeverity = "LOW" | "MEDIUM" | "HIGH"
object AnomalySeverity {
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"

  @inline def values = js.Array[AnomalySeverity](LOW, MEDIUM, HIGH)
}

type AnomalyStatus = "ONGOING" | "CLOSED"
object AnomalyStatus {
  val ONGOING: "ONGOING" = "ONGOING"
  val CLOSED: "CLOSED" = "CLOSED"

  @inline def values = js.Array[AnomalyStatus](ONGOING, CLOSED)
}

type CloudWatchMetricsStat = "Sum" | "Average" | "SampleCount" | "Minimum" | "Maximum" | "p99" | "p90" | "p50"
object CloudWatchMetricsStat {
  val Sum: "Sum" = "Sum"
  val Average: "Average" = "Average"
  val SampleCount: "SampleCount" = "SampleCount"
  val Minimum: "Minimum" = "Minimum"
  val Maximum: "Maximum" = "Maximum"
  val p99: "p99" = "p99"
  val p90: "p90" = "p90"
  val p50: "p50" = "p50"

  @inline def values = js.Array[CloudWatchMetricsStat](Sum, Average, SampleCount, Minimum, Maximum, p99, p90, p50)
}

type EventClass = "INFRASTRUCTURE" | "DEPLOYMENT" | "SECURITY_CHANGE" | "CONFIG_CHANGE" | "SCHEMA_CHANGE"
object EventClass {
  val INFRASTRUCTURE: "INFRASTRUCTURE" = "INFRASTRUCTURE"
  val DEPLOYMENT: "DEPLOYMENT" = "DEPLOYMENT"
  val SECURITY_CHANGE: "SECURITY_CHANGE" = "SECURITY_CHANGE"
  val CONFIG_CHANGE: "CONFIG_CHANGE" = "CONFIG_CHANGE"
  val SCHEMA_CHANGE: "SCHEMA_CHANGE" = "SCHEMA_CHANGE"

  @inline def values = js.Array[EventClass](INFRASTRUCTURE, DEPLOYMENT, SECURITY_CHANGE, CONFIG_CHANGE, SCHEMA_CHANGE)
}

type EventDataSource = "AWS_CLOUD_TRAIL" | "AWS_CODE_DEPLOY"
object EventDataSource {
  val AWS_CLOUD_TRAIL: "AWS_CLOUD_TRAIL" = "AWS_CLOUD_TRAIL"
  val AWS_CODE_DEPLOY: "AWS_CODE_DEPLOY" = "AWS_CODE_DEPLOY"

  @inline def values = js.Array[EventDataSource](AWS_CLOUD_TRAIL, AWS_CODE_DEPLOY)
}

type InsightFeedbackOption = "VALID_COLLECTION" | "RECOMMENDATION_USEFUL" | "ALERT_TOO_SENSITIVE" | "DATA_NOISY_ANOMALY" | "DATA_INCORRECT"
object InsightFeedbackOption {
  val VALID_COLLECTION: "VALID_COLLECTION" = "VALID_COLLECTION"
  val RECOMMENDATION_USEFUL: "RECOMMENDATION_USEFUL" = "RECOMMENDATION_USEFUL"
  val ALERT_TOO_SENSITIVE: "ALERT_TOO_SENSITIVE" = "ALERT_TOO_SENSITIVE"
  val DATA_NOISY_ANOMALY: "DATA_NOISY_ANOMALY" = "DATA_NOISY_ANOMALY"
  val DATA_INCORRECT: "DATA_INCORRECT" = "DATA_INCORRECT"

  @inline def values = js.Array[InsightFeedbackOption](VALID_COLLECTION, RECOMMENDATION_USEFUL, ALERT_TOO_SENSITIVE, DATA_NOISY_ANOMALY, DATA_INCORRECT)
}

type InsightSeverity = "LOW" | "MEDIUM" | "HIGH"
object InsightSeverity {
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"

  @inline def values = js.Array[InsightSeverity](LOW, MEDIUM, HIGH)
}

type InsightStatus = "ONGOING" | "CLOSED"
object InsightStatus {
  val ONGOING: "ONGOING" = "ONGOING"
  val CLOSED: "CLOSED" = "CLOSED"

  @inline def values = js.Array[InsightStatus](ONGOING, CLOSED)
}

type InsightType = "REACTIVE" | "PROACTIVE"
object InsightType {
  val REACTIVE: "REACTIVE" = "REACTIVE"
  val PROACTIVE: "PROACTIVE" = "PROACTIVE"

  @inline def values = js.Array[InsightType](REACTIVE, PROACTIVE)
}

/** Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
  */
type OptInStatus = "ENABLED" | "DISABLED"
object OptInStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[OptInStatus](ENABLED, DISABLED)
}

type ResourceCollectionType = "AWS_CLOUD_FORMATION"
object ResourceCollectionType {
  val AWS_CLOUD_FORMATION: "AWS_CLOUD_FORMATION" = "AWS_CLOUD_FORMATION"

  @inline def values = js.Array[ResourceCollectionType](AWS_CLOUD_FORMATION)
}

type UpdateResourceCollectionAction = "ADD" | "REMOVE"
object UpdateResourceCollectionAction {
  val ADD: "ADD" = "ADD"
  val REMOVE: "REMOVE" = "REMOVE"

  @inline def values = js.Array[UpdateResourceCollectionAction](ADD, REMOVE)
}
