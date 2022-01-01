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

type AnomalyType = "CAUSAL" | "CONTEXTUAL"
object AnomalyType {
  inline val CAUSAL: "CAUSAL" = "CAUSAL"
  inline val CONTEXTUAL: "CONTEXTUAL" = "CONTEXTUAL"

  inline def values: js.Array[AnomalyType] = js.Array(CAUSAL, CONTEXTUAL)
}

type CloudWatchMetricDataStatusCode = "Complete" | "InternalError" | "PartialData"
object CloudWatchMetricDataStatusCode {
  inline val Complete: "Complete" = "Complete"
  inline val InternalError: "InternalError" = "InternalError"
  inline val PartialData: "PartialData" = "PartialData"

  inline def values: js.Array[CloudWatchMetricDataStatusCode] = js.Array(Complete, InternalError, PartialData)
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

type CostEstimationServiceResourceState = "ACTIVE" | "INACTIVE"
object CostEstimationServiceResourceState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[CostEstimationServiceResourceState] = js.Array(ACTIVE, INACTIVE)
}

type CostEstimationStatus = "ONGOING" | "COMPLETED"
object CostEstimationStatus {
  inline val ONGOING: "ONGOING" = "ONGOING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[CostEstimationStatus] = js.Array(ONGOING, COMPLETED)
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

type Locale = "DE_DE" | "EN_US" | "EN_GB" | "ES_ES" | "FR_FR" | "IT_IT" | "JA_JP" | "KO_KR" | "PT_BR" | "ZH_CN" | "ZH_TW"
object Locale {
  inline val DE_DE: "DE_DE" = "DE_DE"
  inline val EN_US: "EN_US" = "EN_US"
  inline val EN_GB: "EN_GB" = "EN_GB"
  inline val ES_ES: "ES_ES" = "ES_ES"
  inline val FR_FR: "FR_FR" = "FR_FR"
  inline val IT_IT: "IT_IT" = "IT_IT"
  inline val JA_JP: "JA_JP" = "JA_JP"
  inline val KO_KR: "KO_KR" = "KO_KR"
  inline val PT_BR: "PT_BR" = "PT_BR"
  inline val ZH_CN: "ZH_CN" = "ZH_CN"
  inline val ZH_TW: "ZH_TW" = "ZH_TW"

  inline def values: js.Array[Locale] = js.Array(DE_DE, EN_US, EN_GB, ES_ES, FR_FR, IT_IT, JA_JP, KO_KR, PT_BR, ZH_CN, ZH_TW)
}

/** Specifies if DevOps Guru is enabled to create an Amazon Web Services Systems Manager OpsItem for each created insight.
  */
type OptInStatus = "ENABLED" | "DISABLED"
object OptInStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[OptInStatus] = js.Array(ENABLED, DISABLED)
}

type OrganizationResourceCollectionType = "AWS_CLOUD_FORMATION" | "AWS_SERVICE" | "AWS_ACCOUNT" | "AWS_TAGS"
object OrganizationResourceCollectionType {
  inline val AWS_CLOUD_FORMATION: "AWS_CLOUD_FORMATION" = "AWS_CLOUD_FORMATION"
  inline val AWS_SERVICE: "AWS_SERVICE" = "AWS_SERVICE"
  inline val AWS_ACCOUNT: "AWS_ACCOUNT" = "AWS_ACCOUNT"
  inline val AWS_TAGS: "AWS_TAGS" = "AWS_TAGS"

  inline def values: js.Array[OrganizationResourceCollectionType] = js.Array(AWS_CLOUD_FORMATION, AWS_SERVICE, AWS_ACCOUNT, AWS_TAGS)
}

type ResourceCollectionType = "AWS_CLOUD_FORMATION" | "AWS_SERVICE" | "AWS_TAGS"
object ResourceCollectionType {
  inline val AWS_CLOUD_FORMATION: "AWS_CLOUD_FORMATION" = "AWS_CLOUD_FORMATION"
  inline val AWS_SERVICE: "AWS_SERVICE" = "AWS_SERVICE"
  inline val AWS_TAGS: "AWS_TAGS" = "AWS_TAGS"

  inline def values: js.Array[ResourceCollectionType] = js.Array(AWS_CLOUD_FORMATION, AWS_SERVICE, AWS_TAGS)
}

type ServiceName = "API_GATEWAY" | "APPLICATION_ELB" | "AUTO_SCALING_GROUP" | "CLOUD_FRONT" | "DYNAMO_DB" | "EC2" | "ECS" | "EKS" | "ELASTIC_BEANSTALK" | "ELASTI_CACHE" | "ELB" | "ES" | "KINESIS" | "LAMBDA" | "NAT_GATEWAY" | "NETWORK_ELB" | "RDS" | "REDSHIFT" | "ROUTE_53" | "S3" | "SAGE_MAKER" | "SNS" | "SQS" | "STEP_FUNCTIONS" | "SWF"
object ServiceName {
  inline val API_GATEWAY: "API_GATEWAY" = "API_GATEWAY"
  inline val APPLICATION_ELB: "APPLICATION_ELB" = "APPLICATION_ELB"
  inline val AUTO_SCALING_GROUP: "AUTO_SCALING_GROUP" = "AUTO_SCALING_GROUP"
  inline val CLOUD_FRONT: "CLOUD_FRONT" = "CLOUD_FRONT"
  inline val DYNAMO_DB: "DYNAMO_DB" = "DYNAMO_DB"
  inline val EC2: "EC2" = "EC2"
  inline val ECS: "ECS" = "ECS"
  inline val EKS: "EKS" = "EKS"
  inline val ELASTIC_BEANSTALK: "ELASTIC_BEANSTALK" = "ELASTIC_BEANSTALK"
  inline val ELASTI_CACHE: "ELASTI_CACHE" = "ELASTI_CACHE"
  inline val ELB: "ELB" = "ELB"
  inline val ES: "ES" = "ES"
  inline val KINESIS: "KINESIS" = "KINESIS"
  inline val LAMBDA: "LAMBDA" = "LAMBDA"
  inline val NAT_GATEWAY: "NAT_GATEWAY" = "NAT_GATEWAY"
  inline val NETWORK_ELB: "NETWORK_ELB" = "NETWORK_ELB"
  inline val RDS: "RDS" = "RDS"
  inline val REDSHIFT: "REDSHIFT" = "REDSHIFT"
  inline val ROUTE_53: "ROUTE_53" = "ROUTE_53"
  inline val S3: "S3" = "S3"
  inline val SAGE_MAKER: "SAGE_MAKER" = "SAGE_MAKER"
  inline val SNS: "SNS" = "SNS"
  inline val SQS: "SQS" = "SQS"
  inline val STEP_FUNCTIONS: "STEP_FUNCTIONS" = "STEP_FUNCTIONS"
  inline val SWF: "SWF" = "SWF"

  inline def values: js.Array[ServiceName] = js.Array(
    API_GATEWAY,
    APPLICATION_ELB,
    AUTO_SCALING_GROUP,
    CLOUD_FRONT,
    DYNAMO_DB,
    EC2,
    ECS,
    EKS,
    ELASTIC_BEANSTALK,
    ELASTI_CACHE,
    ELB,
    ES,
    KINESIS,
    LAMBDA,
    NAT_GATEWAY,
    NETWORK_ELB,
    RDS,
    REDSHIFT,
    ROUTE_53,
    S3,
    SAGE_MAKER,
    SNS,
    SQS,
    STEP_FUNCTIONS,
    SWF
  )
}

type UpdateResourceCollectionAction = "ADD" | "REMOVE"
object UpdateResourceCollectionAction {
  inline val ADD: "ADD" = "ADD"
  inline val REMOVE: "REMOVE" = "REMOVE"

  inline def values: js.Array[UpdateResourceCollectionAction] = js.Array(ADD, REMOVE)
}
