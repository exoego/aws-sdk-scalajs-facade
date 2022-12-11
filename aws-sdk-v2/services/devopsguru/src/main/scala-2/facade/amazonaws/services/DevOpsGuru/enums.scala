package facade.amazonaws.services.devopsguru

import scalajs.js

@js.native
sealed trait AnomalySeverity extends js.Any
object AnomalySeverity {
  val LOW = "LOW".asInstanceOf[AnomalySeverity]
  val MEDIUM = "MEDIUM".asInstanceOf[AnomalySeverity]
  val HIGH = "HIGH".asInstanceOf[AnomalySeverity]

  @inline def values: js.Array[AnomalySeverity] = js.Array(LOW, MEDIUM, HIGH)
}

@js.native
sealed trait AnomalyStatus extends js.Any
object AnomalyStatus {
  val ONGOING = "ONGOING".asInstanceOf[AnomalyStatus]
  val CLOSED = "CLOSED".asInstanceOf[AnomalyStatus]

  @inline def values: js.Array[AnomalyStatus] = js.Array(ONGOING, CLOSED)
}

@js.native
sealed trait AnomalyType extends js.Any
object AnomalyType {
  val CAUSAL = "CAUSAL".asInstanceOf[AnomalyType]
  val CONTEXTUAL = "CONTEXTUAL".asInstanceOf[AnomalyType]

  @inline def values: js.Array[AnomalyType] = js.Array(CAUSAL, CONTEXTUAL)
}

@js.native
sealed trait CloudWatchMetricDataStatusCode extends js.Any
object CloudWatchMetricDataStatusCode {
  val Complete = "Complete".asInstanceOf[CloudWatchMetricDataStatusCode]
  val InternalError = "InternalError".asInstanceOf[CloudWatchMetricDataStatusCode]
  val PartialData = "PartialData".asInstanceOf[CloudWatchMetricDataStatusCode]

  @inline def values: js.Array[CloudWatchMetricDataStatusCode] = js.Array(Complete, InternalError, PartialData)
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

  @inline def values: js.Array[CloudWatchMetricsStat] = js.Array(Sum, Average, SampleCount, Minimum, Maximum, p99, p90, p50)
}

@js.native
sealed trait CostEstimationServiceResourceState extends js.Any
object CostEstimationServiceResourceState {
  val ACTIVE = "ACTIVE".asInstanceOf[CostEstimationServiceResourceState]
  val INACTIVE = "INACTIVE".asInstanceOf[CostEstimationServiceResourceState]

  @inline def values: js.Array[CostEstimationServiceResourceState] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait CostEstimationStatus extends js.Any
object CostEstimationStatus {
  val ONGOING = "ONGOING".asInstanceOf[CostEstimationStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[CostEstimationStatus]

  @inline def values: js.Array[CostEstimationStatus] = js.Array(ONGOING, COMPLETED)
}

@js.native
sealed trait EventClass extends js.Any
object EventClass {
  val INFRASTRUCTURE = "INFRASTRUCTURE".asInstanceOf[EventClass]
  val DEPLOYMENT = "DEPLOYMENT".asInstanceOf[EventClass]
  val SECURITY_CHANGE = "SECURITY_CHANGE".asInstanceOf[EventClass]
  val CONFIG_CHANGE = "CONFIG_CHANGE".asInstanceOf[EventClass]
  val SCHEMA_CHANGE = "SCHEMA_CHANGE".asInstanceOf[EventClass]

  @inline def values: js.Array[EventClass] = js.Array(INFRASTRUCTURE, DEPLOYMENT, SECURITY_CHANGE, CONFIG_CHANGE, SCHEMA_CHANGE)
}

@js.native
sealed trait EventDataSource extends js.Any
object EventDataSource {
  val AWS_CLOUD_TRAIL = "AWS_CLOUD_TRAIL".asInstanceOf[EventDataSource]
  val AWS_CODE_DEPLOY = "AWS_CODE_DEPLOY".asInstanceOf[EventDataSource]

  @inline def values: js.Array[EventDataSource] = js.Array(AWS_CLOUD_TRAIL, AWS_CODE_DEPLOY)
}

@js.native
sealed trait EventSourceOptInStatus extends js.Any
object EventSourceOptInStatus {
  val ENABLED = "ENABLED".asInstanceOf[EventSourceOptInStatus]
  val DISABLED = "DISABLED".asInstanceOf[EventSourceOptInStatus]

  @inline def values: js.Array[EventSourceOptInStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait InsightFeedbackOption extends js.Any
object InsightFeedbackOption {
  val VALID_COLLECTION = "VALID_COLLECTION".asInstanceOf[InsightFeedbackOption]
  val RECOMMENDATION_USEFUL = "RECOMMENDATION_USEFUL".asInstanceOf[InsightFeedbackOption]
  val ALERT_TOO_SENSITIVE = "ALERT_TOO_SENSITIVE".asInstanceOf[InsightFeedbackOption]
  val DATA_NOISY_ANOMALY = "DATA_NOISY_ANOMALY".asInstanceOf[InsightFeedbackOption]
  val DATA_INCORRECT = "DATA_INCORRECT".asInstanceOf[InsightFeedbackOption]

  @inline def values: js.Array[InsightFeedbackOption] = js.Array(VALID_COLLECTION, RECOMMENDATION_USEFUL, ALERT_TOO_SENSITIVE, DATA_NOISY_ANOMALY, DATA_INCORRECT)
}

@js.native
sealed trait InsightSeverity extends js.Any
object InsightSeverity {
  val LOW = "LOW".asInstanceOf[InsightSeverity]
  val MEDIUM = "MEDIUM".asInstanceOf[InsightSeverity]
  val HIGH = "HIGH".asInstanceOf[InsightSeverity]

  @inline def values: js.Array[InsightSeverity] = js.Array(LOW, MEDIUM, HIGH)
}

@js.native
sealed trait InsightStatus extends js.Any
object InsightStatus {
  val ONGOING = "ONGOING".asInstanceOf[InsightStatus]
  val CLOSED = "CLOSED".asInstanceOf[InsightStatus]

  @inline def values: js.Array[InsightStatus] = js.Array(ONGOING, CLOSED)
}

@js.native
sealed trait InsightType extends js.Any
object InsightType {
  val REACTIVE = "REACTIVE".asInstanceOf[InsightType]
  val PROACTIVE = "PROACTIVE".asInstanceOf[InsightType]

  @inline def values: js.Array[InsightType] = js.Array(REACTIVE, PROACTIVE)
}

@js.native
sealed trait Locale extends js.Any
object Locale {
  val DE_DE = "DE_DE".asInstanceOf[Locale]
  val EN_US = "EN_US".asInstanceOf[Locale]
  val EN_GB = "EN_GB".asInstanceOf[Locale]
  val ES_ES = "ES_ES".asInstanceOf[Locale]
  val FR_FR = "FR_FR".asInstanceOf[Locale]
  val IT_IT = "IT_IT".asInstanceOf[Locale]
  val JA_JP = "JA_JP".asInstanceOf[Locale]
  val KO_KR = "KO_KR".asInstanceOf[Locale]
  val PT_BR = "PT_BR".asInstanceOf[Locale]
  val ZH_CN = "ZH_CN".asInstanceOf[Locale]
  val ZH_TW = "ZH_TW".asInstanceOf[Locale]

  @inline def values: js.Array[Locale] = js.Array(DE_DE, EN_US, EN_GB, ES_ES, FR_FR, IT_IT, JA_JP, KO_KR, PT_BR, ZH_CN, ZH_TW)
}

@js.native
sealed trait LogAnomalyType extends js.Any
object LogAnomalyType {
  val KEYWORD = "KEYWORD".asInstanceOf[LogAnomalyType]
  val KEYWORD_TOKEN = "KEYWORD_TOKEN".asInstanceOf[LogAnomalyType]
  val FORMAT = "FORMAT".asInstanceOf[LogAnomalyType]
  val HTTP_CODE = "HTTP_CODE".asInstanceOf[LogAnomalyType]
  val BLOCK_FORMAT = "BLOCK_FORMAT".asInstanceOf[LogAnomalyType]
  val NUMERICAL_POINT = "NUMERICAL_POINT".asInstanceOf[LogAnomalyType]
  val NUMERICAL_NAN = "NUMERICAL_NAN".asInstanceOf[LogAnomalyType]
  val NEW_FIELD_NAME = "NEW_FIELD_NAME".asInstanceOf[LogAnomalyType]

  @inline def values: js.Array[LogAnomalyType] = js.Array(KEYWORD, KEYWORD_TOKEN, FORMAT, HTTP_CODE, BLOCK_FORMAT, NUMERICAL_POINT, NUMERICAL_NAN, NEW_FIELD_NAME)
}

@js.native
sealed trait NotificationMessageType extends js.Any
object NotificationMessageType {
  val NEW_INSIGHT = "NEW_INSIGHT".asInstanceOf[NotificationMessageType]
  val CLOSED_INSIGHT = "CLOSED_INSIGHT".asInstanceOf[NotificationMessageType]
  val NEW_ASSOCIATION = "NEW_ASSOCIATION".asInstanceOf[NotificationMessageType]
  val SEVERITY_UPGRADED = "SEVERITY_UPGRADED".asInstanceOf[NotificationMessageType]
  val NEW_RECOMMENDATION = "NEW_RECOMMENDATION".asInstanceOf[NotificationMessageType]

  @inline def values: js.Array[NotificationMessageType] = js.Array(NEW_INSIGHT, CLOSED_INSIGHT, NEW_ASSOCIATION, SEVERITY_UPGRADED, NEW_RECOMMENDATION)
}

/** Specifies if DevOps Guru is enabled to create an Amazon Web Services Systems Manager OpsItem for each created insight.
  */
@js.native
sealed trait OptInStatus extends js.Any
object OptInStatus {
  val ENABLED = "ENABLED".asInstanceOf[OptInStatus]
  val DISABLED = "DISABLED".asInstanceOf[OptInStatus]

  @inline def values: js.Array[OptInStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait OrganizationResourceCollectionType extends js.Any
object OrganizationResourceCollectionType {
  val AWS_CLOUD_FORMATION = "AWS_CLOUD_FORMATION".asInstanceOf[OrganizationResourceCollectionType]
  val AWS_SERVICE = "AWS_SERVICE".asInstanceOf[OrganizationResourceCollectionType]
  val AWS_ACCOUNT = "AWS_ACCOUNT".asInstanceOf[OrganizationResourceCollectionType]
  val AWS_TAGS = "AWS_TAGS".asInstanceOf[OrganizationResourceCollectionType]

  @inline def values: js.Array[OrganizationResourceCollectionType] = js.Array(AWS_CLOUD_FORMATION, AWS_SERVICE, AWS_ACCOUNT, AWS_TAGS)
}

@js.native
sealed trait ResourceCollectionType extends js.Any
object ResourceCollectionType {
  val AWS_CLOUD_FORMATION = "AWS_CLOUD_FORMATION".asInstanceOf[ResourceCollectionType]
  val AWS_SERVICE = "AWS_SERVICE".asInstanceOf[ResourceCollectionType]
  val AWS_TAGS = "AWS_TAGS".asInstanceOf[ResourceCollectionType]

  @inline def values: js.Array[ResourceCollectionType] = js.Array(AWS_CLOUD_FORMATION, AWS_SERVICE, AWS_TAGS)
}

@js.native
sealed trait ResourcePermission extends js.Any
object ResourcePermission {
  val FULL_PERMISSION = "FULL_PERMISSION".asInstanceOf[ResourcePermission]
  val MISSING_PERMISSION = "MISSING_PERMISSION".asInstanceOf[ResourcePermission]

  @inline def values: js.Array[ResourcePermission] = js.Array(FULL_PERMISSION, MISSING_PERMISSION)
}

@js.native
sealed trait ResourceTypeFilter extends js.Any
object ResourceTypeFilter {
  val LOG_GROUPS = "LOG_GROUPS".asInstanceOf[ResourceTypeFilter]
  val CLOUDFRONT_DISTRIBUTION = "CLOUDFRONT_DISTRIBUTION".asInstanceOf[ResourceTypeFilter]
  val DYNAMODB_TABLE = "DYNAMODB_TABLE".asInstanceOf[ResourceTypeFilter]
  val EC2_NAT_GATEWAY = "EC2_NAT_GATEWAY".asInstanceOf[ResourceTypeFilter]
  val ECS_CLUSTER = "ECS_CLUSTER".asInstanceOf[ResourceTypeFilter]
  val ECS_SERVICE = "ECS_SERVICE".asInstanceOf[ResourceTypeFilter]
  val EKS_CLUSTER = "EKS_CLUSTER".asInstanceOf[ResourceTypeFilter]
  val ELASTIC_BEANSTALK_ENVIRONMENT = "ELASTIC_BEANSTALK_ENVIRONMENT".asInstanceOf[ResourceTypeFilter]
  val ELASTIC_LOAD_BALANCER_LOAD_BALANCER = "ELASTIC_LOAD_BALANCER_LOAD_BALANCER".asInstanceOf[ResourceTypeFilter]
  val ELASTIC_LOAD_BALANCING_V2_LOAD_BALANCER = "ELASTIC_LOAD_BALANCING_V2_LOAD_BALANCER".asInstanceOf[ResourceTypeFilter]
  val ELASTIC_LOAD_BALANCING_V2_TARGET_GROUP = "ELASTIC_LOAD_BALANCING_V2_TARGET_GROUP".asInstanceOf[ResourceTypeFilter]
  val ELASTICACHE_CACHE_CLUSTER = "ELASTICACHE_CACHE_CLUSTER".asInstanceOf[ResourceTypeFilter]
  val ELASTICSEARCH_DOMAIN = "ELASTICSEARCH_DOMAIN".asInstanceOf[ResourceTypeFilter]
  val KINESIS_STREAM = "KINESIS_STREAM".asInstanceOf[ResourceTypeFilter]
  val LAMBDA_FUNCTION = "LAMBDA_FUNCTION".asInstanceOf[ResourceTypeFilter]
  val OPEN_SEARCH_SERVICE_DOMAIN = "OPEN_SEARCH_SERVICE_DOMAIN".asInstanceOf[ResourceTypeFilter]
  val RDS_DB_INSTANCE = "RDS_DB_INSTANCE".asInstanceOf[ResourceTypeFilter]
  val RDS_DB_CLUSTER = "RDS_DB_CLUSTER".asInstanceOf[ResourceTypeFilter]
  val REDSHIFT_CLUSTER = "REDSHIFT_CLUSTER".asInstanceOf[ResourceTypeFilter]
  val ROUTE53_HOSTED_ZONE = "ROUTE53_HOSTED_ZONE".asInstanceOf[ResourceTypeFilter]
  val ROUTE53_HEALTH_CHECK = "ROUTE53_HEALTH_CHECK".asInstanceOf[ResourceTypeFilter]
  val S3_BUCKET = "S3_BUCKET".asInstanceOf[ResourceTypeFilter]
  val SAGEMAKER_ENDPOINT = "SAGEMAKER_ENDPOINT".asInstanceOf[ResourceTypeFilter]
  val SNS_TOPIC = "SNS_TOPIC".asInstanceOf[ResourceTypeFilter]
  val SQS_QUEUE = "SQS_QUEUE".asInstanceOf[ResourceTypeFilter]
  val STEP_FUNCTIONS_ACTIVITY = "STEP_FUNCTIONS_ACTIVITY".asInstanceOf[ResourceTypeFilter]
  val STEP_FUNCTIONS_STATE_MACHINE = "STEP_FUNCTIONS_STATE_MACHINE".asInstanceOf[ResourceTypeFilter]

  @inline def values: js.Array[ResourceTypeFilter] = js.Array(
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

@js.native
sealed trait ServiceName extends js.Any
object ServiceName {
  val API_GATEWAY = "API_GATEWAY".asInstanceOf[ServiceName]
  val APPLICATION_ELB = "APPLICATION_ELB".asInstanceOf[ServiceName]
  val AUTO_SCALING_GROUP = "AUTO_SCALING_GROUP".asInstanceOf[ServiceName]
  val CLOUD_FRONT = "CLOUD_FRONT".asInstanceOf[ServiceName]
  val DYNAMO_DB = "DYNAMO_DB".asInstanceOf[ServiceName]
  val EC2 = "EC2".asInstanceOf[ServiceName]
  val ECS = "ECS".asInstanceOf[ServiceName]
  val EKS = "EKS".asInstanceOf[ServiceName]
  val ELASTIC_BEANSTALK = "ELASTIC_BEANSTALK".asInstanceOf[ServiceName]
  val ELASTI_CACHE = "ELASTI_CACHE".asInstanceOf[ServiceName]
  val ELB = "ELB".asInstanceOf[ServiceName]
  val ES = "ES".asInstanceOf[ServiceName]
  val KINESIS = "KINESIS".asInstanceOf[ServiceName]
  val LAMBDA = "LAMBDA".asInstanceOf[ServiceName]
  val NAT_GATEWAY = "NAT_GATEWAY".asInstanceOf[ServiceName]
  val NETWORK_ELB = "NETWORK_ELB".asInstanceOf[ServiceName]
  val RDS = "RDS".asInstanceOf[ServiceName]
  val REDSHIFT = "REDSHIFT".asInstanceOf[ServiceName]
  val ROUTE_53 = "ROUTE_53".asInstanceOf[ServiceName]
  val S3 = "S3".asInstanceOf[ServiceName]
  val SAGE_MAKER = "SAGE_MAKER".asInstanceOf[ServiceName]
  val SNS = "SNS".asInstanceOf[ServiceName]
  val SQS = "SQS".asInstanceOf[ServiceName]
  val STEP_FUNCTIONS = "STEP_FUNCTIONS".asInstanceOf[ServiceName]
  val SWF = "SWF".asInstanceOf[ServiceName]

  @inline def values: js.Array[ServiceName] = js.Array(
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

@js.native
sealed trait UpdateResourceCollectionAction extends js.Any
object UpdateResourceCollectionAction {
  val ADD = "ADD".asInstanceOf[UpdateResourceCollectionAction]
  val REMOVE = "REMOVE".asInstanceOf[UpdateResourceCollectionAction]

  @inline def values: js.Array[UpdateResourceCollectionAction] = js.Array(ADD, REMOVE)
}
