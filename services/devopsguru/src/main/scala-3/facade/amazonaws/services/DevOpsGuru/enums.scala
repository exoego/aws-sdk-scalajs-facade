package facade.amazonaws.services.devopsguru

import scalajs.js

type AnomalySeverity = "LOW" | "MEDIUM" | "HIGH"
object AnomalySeverity {
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[AnomalySeverity] = js.Array(LOW, MEDIUM, HIGH)
}

type AnomalyStatus = "ONGOING" | "CLOSED"
object AnomalyStatus {
  inline val ONGOING: "ONGOING" = "ONGOING"
  inline val CLOSED: "CLOSED" = "CLOSED"

  inline def values: js.Array[AnomalyStatus] = js.Array(ONGOING, CLOSED)
}

type CloudWatchMetricsStat = "Sum" | "Average" | "SampleCount" | "Minimum" | "Maximum" | "p99" | "p90" | "p50"
object CloudWatchMetricsStat {
  inline val Sum: "Sum" = "Sum"
  inline val Average: "Average" = "Average"
  inline val SampleCount: "SampleCount" = "SampleCount"
  inline val Minimum: "Minimum" = "Minimum"
  inline val Maximum: "Maximum" = "Maximum"
  inline val p99: "p99" = "p99"
  inline val p90: "p90" = "p90"
  inline val p50: "p50" = "p50"

  inline def values: js.Array[CloudWatchMetricsStat] = js.Array(Sum, Average, SampleCount, Minimum, Maximum, p99, p90, p50)
}

type EventClass = "INFRASTRUCTURE" | "DEPLOYMENT" | "SECURITY_CHANGE" | "CONFIG_CHANGE" | "SCHEMA_CHANGE"
object EventClass {
  inline val INFRASTRUCTURE: "INFRASTRUCTURE" = "INFRASTRUCTURE"
  inline val DEPLOYMENT: "DEPLOYMENT" = "DEPLOYMENT"
  inline val SECURITY_CHANGE: "SECURITY_CHANGE" = "SECURITY_CHANGE"
  inline val CONFIG_CHANGE: "CONFIG_CHANGE" = "CONFIG_CHANGE"
  inline val SCHEMA_CHANGE: "SCHEMA_CHANGE" = "SCHEMA_CHANGE"

  inline def values: js.Array[EventClass] = js.Array(INFRASTRUCTURE, DEPLOYMENT, SECURITY_CHANGE, CONFIG_CHANGE, SCHEMA_CHANGE)
}

type EventDataSource = "AWS_CLOUD_TRAIL" | "AWS_CODE_DEPLOY"
object EventDataSource {
  inline val AWS_CLOUD_TRAIL: "AWS_CLOUD_TRAIL" = "AWS_CLOUD_TRAIL"
  inline val AWS_CODE_DEPLOY: "AWS_CODE_DEPLOY" = "AWS_CODE_DEPLOY"

  inline def values: js.Array[EventDataSource] = js.Array(AWS_CLOUD_TRAIL, AWS_CODE_DEPLOY)
}

type InsightFeedbackOption = "VALID_COLLECTION" | "RECOMMENDATION_USEFUL" | "ALERT_TOO_SENSITIVE" | "DATA_NOISY_ANOMALY" | "DATA_INCORRECT"
object InsightFeedbackOption {
  inline val VALID_COLLECTION: "VALID_COLLECTION" = "VALID_COLLECTION"
  inline val RECOMMENDATION_USEFUL: "RECOMMENDATION_USEFUL" = "RECOMMENDATION_USEFUL"
  inline val ALERT_TOO_SENSITIVE: "ALERT_TOO_SENSITIVE" = "ALERT_TOO_SENSITIVE"
  inline val DATA_NOISY_ANOMALY: "DATA_NOISY_ANOMALY" = "DATA_NOISY_ANOMALY"
  inline val DATA_INCORRECT: "DATA_INCORRECT" = "DATA_INCORRECT"

  inline def values: js.Array[InsightFeedbackOption] = js.Array(VALID_COLLECTION, RECOMMENDATION_USEFUL, ALERT_TOO_SENSITIVE, DATA_NOISY_ANOMALY, DATA_INCORRECT)
}

type InsightSeverity = "LOW" | "MEDIUM" | "HIGH"
object InsightSeverity {
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[InsightSeverity] = js.Array(LOW, MEDIUM, HIGH)
}

type InsightStatus = "ONGOING" | "CLOSED"
object InsightStatus {
  inline val ONGOING: "ONGOING" = "ONGOING"
  inline val CLOSED: "CLOSED" = "CLOSED"

  inline def values: js.Array[InsightStatus] = js.Array(ONGOING, CLOSED)
}

type InsightType = "REACTIVE" | "PROACTIVE"
object InsightType {
  inline val REACTIVE: "REACTIVE" = "REACTIVE"
  inline val PROACTIVE: "PROACTIVE" = "PROACTIVE"

  inline def values: js.Array[InsightType] = js.Array(REACTIVE, PROACTIVE)
}

/** Specifies if DevOps Guru is enabled to create an AWS Systems Manager OpsItem for each created insight.
  */
type OptInStatus = "ENABLED" | "DISABLED"
object OptInStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[OptInStatus] = js.Array(ENABLED, DISABLED)
}

type ResourceCollectionType = "AWS_CLOUD_FORMATION"
object ResourceCollectionType {
  inline val AWS_CLOUD_FORMATION: "AWS_CLOUD_FORMATION" = "AWS_CLOUD_FORMATION"

  inline def values: js.Array[ResourceCollectionType] = js.Array(AWS_CLOUD_FORMATION)
}

type UpdateResourceCollectionAction = "ADD" | "REMOVE"
object UpdateResourceCollectionAction {
  inline val ADD: "ADD" = "ADD"
  inline val REMOVE: "REMOVE" = "REMOVE"

  inline def values: js.Array[UpdateResourceCollectionAction] = js.Array(ADD, REMOVE)
}
