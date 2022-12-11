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

type EventSourceOptInStatus = "ENABLED" | "DISABLED"
object EventSourceOptInStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[EventSourceOptInStatus] = js.Array(ENABLED, DISABLED)
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

type LogAnomalyType = "KEYWORD" | "KEYWORD_TOKEN" | "FORMAT" | "HTTP_CODE" | "BLOCK_FORMAT" | "NUMERICAL_POINT" | "NUMERICAL_NAN" | "NEW_FIELD_NAME"
object LogAnomalyType {
  inline val KEYWORD: "KEYWORD" = "KEYWORD"
  inline val KEYWORD_TOKEN: "KEYWORD_TOKEN" = "KEYWORD_TOKEN"
  inline val FORMAT: "FORMAT" = "FORMAT"
  inline val HTTP_CODE: "HTTP_CODE" = "HTTP_CODE"
  inline val BLOCK_FORMAT: "BLOCK_FORMAT" = "BLOCK_FORMAT"
  inline val NUMERICAL_POINT: "NUMERICAL_POINT" = "NUMERICAL_POINT"
  inline val NUMERICAL_NAN: "NUMERICAL_NAN" = "NUMERICAL_NAN"
  inline val NEW_FIELD_NAME: "NEW_FIELD_NAME" = "NEW_FIELD_NAME"

  inline def values: js.Array[LogAnomalyType] = js.Array(KEYWORD, KEYWORD_TOKEN, FORMAT, HTTP_CODE, BLOCK_FORMAT, NUMERICAL_POINT, NUMERICAL_NAN, NEW_FIELD_NAME)
}

type NotificationMessageType = "NEW_INSIGHT" | "CLOSED_INSIGHT" | "NEW_ASSOCIATION" | "SEVERITY_UPGRADED" | "NEW_RECOMMENDATION"
object NotificationMessageType {
  inline val NEW_INSIGHT: "NEW_INSIGHT" = "NEW_INSIGHT"
  inline val CLOSED_INSIGHT: "CLOSED_INSIGHT" = "CLOSED_INSIGHT"
  inline val NEW_ASSOCIATION: "NEW_ASSOCIATION" = "NEW_ASSOCIATION"
  inline val SEVERITY_UPGRADED: "SEVERITY_UPGRADED" = "SEVERITY_UPGRADED"
  inline val NEW_RECOMMENDATION: "NEW_RECOMMENDATION" = "NEW_RECOMMENDATION"

  inline def values: js.Array[NotificationMessageType] = js.Array(NEW_INSIGHT, CLOSED_INSIGHT, NEW_ASSOCIATION, SEVERITY_UPGRADED, NEW_RECOMMENDATION)
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

type ResourcePermission = "FULL_PERMISSION" | "MISSING_PERMISSION"
object ResourcePermission {
  inline val FULL_PERMISSION: "FULL_PERMISSION" = "FULL_PERMISSION"
  inline val MISSING_PERMISSION: "MISSING_PERMISSION" = "MISSING_PERMISSION"

  inline def values: js.Array[ResourcePermission] = js.Array(FULL_PERMISSION, MISSING_PERMISSION)
}

type ResourceTypeFilter = "LOG_GROUPS" | "CLOUDFRONT_DISTRIBUTION" | "DYNAMODB_TABLE" | "EC2_NAT_GATEWAY" | "ECS_CLUSTER" | "ECS_SERVICE" | "EKS_CLUSTER" | "ELASTIC_BEANSTALK_ENVIRONMENT" | "ELASTIC_LOAD_BALANCER_LOAD_BALANCER" | "ELASTIC_LOAD_BALANCING_V2_LOAD_BALANCER" | "ELASTIC_LOAD_BALANCING_V2_TARGET_GROUP" | "ELASTICACHE_CACHE_CLUSTER" | "ELASTICSEARCH_DOMAIN" | "KINESIS_STREAM" | "LAMBDA_FUNCTION" | "OPEN_SEARCH_SERVICE_DOMAIN" | "RDS_DB_INSTANCE" | "RDS_DB_CLUSTER" | "REDSHIFT_CLUSTER" | "ROUTE53_HOSTED_ZONE" | "ROUTE53_HEALTH_CHECK" | "S3_BUCKET" | "SAGEMAKER_ENDPOINT" | "SNS_TOPIC" | "SQS_QUEUE" | "STEP_FUNCTIONS_ACTIVITY" | "STEP_FUNCTIONS_STATE_MACHINE"
object ResourceTypeFilter {
  inline val LOG_GROUPS: "LOG_GROUPS" = "LOG_GROUPS"
  inline val CLOUDFRONT_DISTRIBUTION: "CLOUDFRONT_DISTRIBUTION" = "CLOUDFRONT_DISTRIBUTION"
  inline val DYNAMODB_TABLE: "DYNAMODB_TABLE" = "DYNAMODB_TABLE"
  inline val EC2_NAT_GATEWAY: "EC2_NAT_GATEWAY" = "EC2_NAT_GATEWAY"
  inline val ECS_CLUSTER: "ECS_CLUSTER" = "ECS_CLUSTER"
  inline val ECS_SERVICE: "ECS_SERVICE" = "ECS_SERVICE"
  inline val EKS_CLUSTER: "EKS_CLUSTER" = "EKS_CLUSTER"
  inline val ELASTIC_BEANSTALK_ENVIRONMENT: "ELASTIC_BEANSTALK_ENVIRONMENT" = "ELASTIC_BEANSTALK_ENVIRONMENT"
  inline val ELASTIC_LOAD_BALANCER_LOAD_BALANCER: "ELASTIC_LOAD_BALANCER_LOAD_BALANCER" = "ELASTIC_LOAD_BALANCER_LOAD_BALANCER"
  inline val ELASTIC_LOAD_BALANCING_V2_LOAD_BALANCER: "ELASTIC_LOAD_BALANCING_V2_LOAD_BALANCER" = "ELASTIC_LOAD_BALANCING_V2_LOAD_BALANCER"
  inline val ELASTIC_LOAD_BALANCING_V2_TARGET_GROUP: "ELASTIC_LOAD_BALANCING_V2_TARGET_GROUP" = "ELASTIC_LOAD_BALANCING_V2_TARGET_GROUP"
  inline val ELASTICACHE_CACHE_CLUSTER: "ELASTICACHE_CACHE_CLUSTER" = "ELASTICACHE_CACHE_CLUSTER"
  inline val ELASTICSEARCH_DOMAIN: "ELASTICSEARCH_DOMAIN" = "ELASTICSEARCH_DOMAIN"
  inline val KINESIS_STREAM: "KINESIS_STREAM" = "KINESIS_STREAM"
  inline val LAMBDA_FUNCTION: "LAMBDA_FUNCTION" = "LAMBDA_FUNCTION"
  inline val OPEN_SEARCH_SERVICE_DOMAIN: "OPEN_SEARCH_SERVICE_DOMAIN" = "OPEN_SEARCH_SERVICE_DOMAIN"
  inline val RDS_DB_INSTANCE: "RDS_DB_INSTANCE" = "RDS_DB_INSTANCE"
  inline val RDS_DB_CLUSTER: "RDS_DB_CLUSTER" = "RDS_DB_CLUSTER"
  inline val REDSHIFT_CLUSTER: "REDSHIFT_CLUSTER" = "REDSHIFT_CLUSTER"
  inline val ROUTE53_HOSTED_ZONE: "ROUTE53_HOSTED_ZONE" = "ROUTE53_HOSTED_ZONE"
  inline val ROUTE53_HEALTH_CHECK: "ROUTE53_HEALTH_CHECK" = "ROUTE53_HEALTH_CHECK"
  inline val S3_BUCKET: "S3_BUCKET" = "S3_BUCKET"
  inline val SAGEMAKER_ENDPOINT: "SAGEMAKER_ENDPOINT" = "SAGEMAKER_ENDPOINT"
  inline val SNS_TOPIC: "SNS_TOPIC" = "SNS_TOPIC"
  inline val SQS_QUEUE: "SQS_QUEUE" = "SQS_QUEUE"
  inline val STEP_FUNCTIONS_ACTIVITY: "STEP_FUNCTIONS_ACTIVITY" = "STEP_FUNCTIONS_ACTIVITY"
  inline val STEP_FUNCTIONS_STATE_MACHINE: "STEP_FUNCTIONS_STATE_MACHINE" = "STEP_FUNCTIONS_STATE_MACHINE"

  inline def values: js.Array[ResourceTypeFilter] = js.Array(
    LOG_GROUPS,
    CLOUDFRONT_DISTRIBUTION,
    DYNAMODB_TABLE,
    EC2_NAT_GATEWAY,
    ECS_CLUSTER,
    ECS_SERVICE,
    EKS_CLUSTER,
    ELASTIC_BEANSTALK_ENVIRONMENT,
    ELASTIC_LOAD_BALANCER_LOAD_BALANCER,
    ELASTIC_LOAD_BALANCING_V2_LOAD_BALANCER,
    ELASTIC_LOAD_BALANCING_V2_TARGET_GROUP,
    ELASTICACHE_CACHE_CLUSTER,
    ELASTICSEARCH_DOMAIN,
    KINESIS_STREAM,
    LAMBDA_FUNCTION,
    OPEN_SEARCH_SERVICE_DOMAIN,
    RDS_DB_INSTANCE,
    RDS_DB_CLUSTER,
    REDSHIFT_CLUSTER,
    ROUTE53_HOSTED_ZONE,
    ROUTE53_HEALTH_CHECK,
    S3_BUCKET,
    SAGEMAKER_ENDPOINT,
    SNS_TOPIC,
    SQS_QUEUE,
    STEP_FUNCTIONS_ACTIVITY,
    STEP_FUNCTIONS_STATE_MACHINE
  )
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
