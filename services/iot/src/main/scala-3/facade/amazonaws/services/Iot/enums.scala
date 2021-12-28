package facade.amazonaws.services.iot

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AbortAction extends js.Any
object AbortAction {
  val CANCEL = "CANCEL".asInstanceOf[AbortAction]

  @inline def values = js.Array(CANCEL)
}

@js.native
sealed trait ActionType extends js.Any
object ActionType {
  val PUBLISH = "PUBLISH".asInstanceOf[ActionType]
  val SUBSCRIBE = "SUBSCRIBE".asInstanceOf[ActionType]
  val RECEIVE = "RECEIVE".asInstanceOf[ActionType]
  val CONNECT = "CONNECT".asInstanceOf[ActionType]

  @inline def values = js.Array(PUBLISH, SUBSCRIBE, RECEIVE, CONNECT)
}

/** The type of alert target: one of "SNS".
  */
@js.native
sealed trait AlertTargetType extends js.Any
object AlertTargetType {
  val SNS = "SNS".asInstanceOf[AlertTargetType]

  @inline def values = js.Array(SNS)
}

@js.native
sealed trait AuditCheckRunStatus extends js.Any
object AuditCheckRunStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditCheckRunStatus]
  val WAITING_FOR_DATA_COLLECTION = "WAITING_FOR_DATA_COLLECTION".asInstanceOf[AuditCheckRunStatus]
  val CANCELED = "CANCELED".asInstanceOf[AuditCheckRunStatus]
  val COMPLETED_COMPLIANT = "COMPLETED_COMPLIANT".asInstanceOf[AuditCheckRunStatus]
  val COMPLETED_NON_COMPLIANT = "COMPLETED_NON_COMPLIANT".asInstanceOf[AuditCheckRunStatus]
  val FAILED = "FAILED".asInstanceOf[AuditCheckRunStatus]

  @inline def values = js.Array(IN_PROGRESS, WAITING_FOR_DATA_COLLECTION, CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED)
}

@js.native
sealed trait AuditFindingSeverity extends js.Any
object AuditFindingSeverity {
  val CRITICAL = "CRITICAL".asInstanceOf[AuditFindingSeverity]
  val HIGH = "HIGH".asInstanceOf[AuditFindingSeverity]
  val MEDIUM = "MEDIUM".asInstanceOf[AuditFindingSeverity]
  val LOW = "LOW".asInstanceOf[AuditFindingSeverity]

  @inline def values = js.Array(CRITICAL, HIGH, MEDIUM, LOW)
}

@js.native
sealed trait AuditFrequency extends js.Any
object AuditFrequency {
  val DAILY = "DAILY".asInstanceOf[AuditFrequency]
  val WEEKLY = "WEEKLY".asInstanceOf[AuditFrequency]
  val BIWEEKLY = "BIWEEKLY".asInstanceOf[AuditFrequency]
  val MONTHLY = "MONTHLY".asInstanceOf[AuditFrequency]

  @inline def values = js.Array(DAILY, WEEKLY, BIWEEKLY, MONTHLY)
}

@js.native
sealed trait AuditMitigationActionsExecutionStatus extends js.Any
object AuditMitigationActionsExecutionStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditMitigationActionsExecutionStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[AuditMitigationActionsExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[AuditMitigationActionsExecutionStatus]
  val CANCELED = "CANCELED".asInstanceOf[AuditMitigationActionsExecutionStatus]
  val SKIPPED = "SKIPPED".asInstanceOf[AuditMitigationActionsExecutionStatus]
  val PENDING = "PENDING".asInstanceOf[AuditMitigationActionsExecutionStatus]

  @inline def values = js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED, PENDING)
}

@js.native
sealed trait AuditMitigationActionsTaskStatus extends js.Any
object AuditMitigationActionsTaskStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditMitigationActionsTaskStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[AuditMitigationActionsTaskStatus]
  val FAILED = "FAILED".asInstanceOf[AuditMitigationActionsTaskStatus]
  val CANCELED = "CANCELED".asInstanceOf[AuditMitigationActionsTaskStatus]

  @inline def values = js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED)
}

@js.native
sealed trait AuditNotificationType extends js.Any
object AuditNotificationType {
  val SNS = "SNS".asInstanceOf[AuditNotificationType]

  @inline def values = js.Array(SNS)
}

@js.native
sealed trait AuditTaskStatus extends js.Any
object AuditTaskStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AuditTaskStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[AuditTaskStatus]
  val FAILED = "FAILED".asInstanceOf[AuditTaskStatus]
  val CANCELED = "CANCELED".asInstanceOf[AuditTaskStatus]

  @inline def values = js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED)
}

@js.native
sealed trait AuditTaskType extends js.Any
object AuditTaskType {
  val ON_DEMAND_AUDIT_TASK = "ON_DEMAND_AUDIT_TASK".asInstanceOf[AuditTaskType]
  val SCHEDULED_AUDIT_TASK = "SCHEDULED_AUDIT_TASK".asInstanceOf[AuditTaskType]

  @inline def values = js.Array(ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK)
}

@js.native
sealed trait AuthDecision extends js.Any
object AuthDecision {
  val ALLOWED = "ALLOWED".asInstanceOf[AuthDecision]
  val EXPLICIT_DENY = "EXPLICIT_DENY".asInstanceOf[AuthDecision]
  val IMPLICIT_DENY = "IMPLICIT_DENY".asInstanceOf[AuthDecision]

  @inline def values = js.Array(ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY)
}

@js.native
sealed trait AuthorizerStatus extends js.Any
object AuthorizerStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AuthorizerStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AuthorizerStatus]

  @inline def values = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait AutoRegistrationStatus extends js.Any
object AutoRegistrationStatus {
  val ENABLE = "ENABLE".asInstanceOf[AutoRegistrationStatus]
  val DISABLE = "DISABLE".asInstanceOf[AutoRegistrationStatus]

  @inline def values = js.Array(ENABLE, DISABLE)
}

@js.native
sealed trait AwsJobAbortCriteriaAbortAction extends js.Any
object AwsJobAbortCriteriaAbortAction {
  val CANCEL = "CANCEL".asInstanceOf[AwsJobAbortCriteriaAbortAction]

  @inline def values = js.Array(CANCEL)
}

@js.native
sealed trait AwsJobAbortCriteriaFailureType extends js.Any
object AwsJobAbortCriteriaFailureType {
  val FAILED = "FAILED".asInstanceOf[AwsJobAbortCriteriaFailureType]
  val REJECTED = "REJECTED".asInstanceOf[AwsJobAbortCriteriaFailureType]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[AwsJobAbortCriteriaFailureType]
  val ALL = "ALL".asInstanceOf[AwsJobAbortCriteriaFailureType]

  @inline def values = js.Array(FAILED, REJECTED, TIMED_OUT, ALL)
}

@js.native
sealed trait BehaviorCriteriaType extends js.Any
object BehaviorCriteriaType {
  val STATIC = "STATIC".asInstanceOf[BehaviorCriteriaType]
  val STATISTICAL = "STATISTICAL".asInstanceOf[BehaviorCriteriaType]
  val MACHINE_LEARNING = "MACHINE_LEARNING".asInstanceOf[BehaviorCriteriaType]

  @inline def values = js.Array(STATIC, STATISTICAL, MACHINE_LEARNING)
}

@js.native
sealed trait CACertificateStatus extends js.Any
object CACertificateStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[CACertificateStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[CACertificateStatus]

  @inline def values = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait CACertificateUpdateAction extends js.Any
object CACertificateUpdateAction {
  val DEACTIVATE = "DEACTIVATE".asInstanceOf[CACertificateUpdateAction]

  @inline def values = js.Array(DEACTIVATE)
}

@js.native
sealed trait CannedAccessControlList extends js.Any
object CannedAccessControlList {
  val `private` = "private".asInstanceOf[CannedAccessControlList]
  val `public-read` = "public-read".asInstanceOf[CannedAccessControlList]
  val `public-read-write` = "public-read-write".asInstanceOf[CannedAccessControlList]
  val `aws-exec-read` = "aws-exec-read".asInstanceOf[CannedAccessControlList]
  val `authenticated-read` = "authenticated-read".asInstanceOf[CannedAccessControlList]
  val `bucket-owner-read` = "bucket-owner-read".asInstanceOf[CannedAccessControlList]
  val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[CannedAccessControlList]
  val `log-delivery-write` = "log-delivery-write".asInstanceOf[CannedAccessControlList]

  @inline def values = js.Array(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`, `log-delivery-write`)
}

@js.native
sealed trait CertificateMode extends js.Any
object CertificateMode {
  val DEFAULT = "DEFAULT".asInstanceOf[CertificateMode]
  val SNI_ONLY = "SNI_ONLY".asInstanceOf[CertificateMode]

  @inline def values = js.Array(DEFAULT, SNI_ONLY)
}

@js.native
sealed trait CertificateStatus extends js.Any
object CertificateStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[CertificateStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[CertificateStatus]
  val REVOKED = "REVOKED".asInstanceOf[CertificateStatus]
  val PENDING_TRANSFER = "PENDING_TRANSFER".asInstanceOf[CertificateStatus]
  val REGISTER_INACTIVE = "REGISTER_INACTIVE".asInstanceOf[CertificateStatus]
  val PENDING_ACTIVATION = "PENDING_ACTIVATION".asInstanceOf[CertificateStatus]

  @inline def values = js.Array(ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, REGISTER_INACTIVE, PENDING_ACTIVATION)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val `less-than` = "less-than".asInstanceOf[ComparisonOperator]
  val `less-than-equals` = "less-than-equals".asInstanceOf[ComparisonOperator]
  val `greater-than` = "greater-than".asInstanceOf[ComparisonOperator]
  val `greater-than-equals` = "greater-than-equals".asInstanceOf[ComparisonOperator]
  val `in-cidr-set` = "in-cidr-set".asInstanceOf[ComparisonOperator]
  val `not-in-cidr-set` = "not-in-cidr-set".asInstanceOf[ComparisonOperator]
  val `in-port-set` = "in-port-set".asInstanceOf[ComparisonOperator]
  val `not-in-port-set` = "not-in-port-set".asInstanceOf[ComparisonOperator]
  val `in-set` = "in-set".asInstanceOf[ComparisonOperator]
  val `not-in-set` = "not-in-set".asInstanceOf[ComparisonOperator]

  @inline def values = js.Array(
    `less-than`,
    `less-than-equals`,
    `greater-than`,
    `greater-than-equals`,
    `in-cidr-set`,
    `not-in-cidr-set`,
    `in-port-set`,
    `not-in-port-set`,
    `in-set`,
    `not-in-set`
  )
}

@js.native
sealed trait ConfidenceLevel extends js.Any
object ConfidenceLevel {
  val LOW = "LOW".asInstanceOf[ConfidenceLevel]
  val MEDIUM = "MEDIUM".asInstanceOf[ConfidenceLevel]
  val HIGH = "HIGH".asInstanceOf[ConfidenceLevel]

  @inline def values = js.Array(LOW, MEDIUM, HIGH)
}

@js.native
sealed trait CustomMetricType extends js.Any
object CustomMetricType {
  val `string-list` = "string-list".asInstanceOf[CustomMetricType]
  val `ip-address-list` = "ip-address-list".asInstanceOf[CustomMetricType]
  val `number-list` = "number-list".asInstanceOf[CustomMetricType]
  val number = "number".asInstanceOf[CustomMetricType]

  @inline def values = js.Array(`string-list`, `ip-address-list`, `number-list`, number)
}

@js.native
sealed trait DayOfWeek extends js.Any
object DayOfWeek {
  val SUN = "SUN".asInstanceOf[DayOfWeek]
  val MON = "MON".asInstanceOf[DayOfWeek]
  val TUE = "TUE".asInstanceOf[DayOfWeek]
  val WED = "WED".asInstanceOf[DayOfWeek]
  val THU = "THU".asInstanceOf[DayOfWeek]
  val FRI = "FRI".asInstanceOf[DayOfWeek]
  val SAT = "SAT".asInstanceOf[DayOfWeek]

  @inline def values = js.Array(SUN, MON, TUE, WED, THU, FRI, SAT)
}

@js.native
sealed trait DetectMitigationActionExecutionStatus extends js.Any
object DetectMitigationActionExecutionStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DetectMitigationActionExecutionStatus]
  val SUCCESSFUL = "SUCCESSFUL".asInstanceOf[DetectMitigationActionExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[DetectMitigationActionExecutionStatus]
  val SKIPPED = "SKIPPED".asInstanceOf[DetectMitigationActionExecutionStatus]

  @inline def values = js.Array(IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED)
}

@js.native
sealed trait DetectMitigationActionsTaskStatus extends js.Any
object DetectMitigationActionsTaskStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DetectMitigationActionsTaskStatus]
  val SUCCESSFUL = "SUCCESSFUL".asInstanceOf[DetectMitigationActionsTaskStatus]
  val FAILED = "FAILED".asInstanceOf[DetectMitigationActionsTaskStatus]
  val CANCELED = "CANCELED".asInstanceOf[DetectMitigationActionsTaskStatus]

  @inline def values = js.Array(IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED)
}

@js.native
sealed trait DeviceCertificateUpdateAction extends js.Any
object DeviceCertificateUpdateAction {
  val DEACTIVATE = "DEACTIVATE".asInstanceOf[DeviceCertificateUpdateAction]

  @inline def values = js.Array(DEACTIVATE)
}

@js.native
sealed trait DimensionType extends js.Any
object DimensionType {
  val TOPIC_FILTER = "TOPIC_FILTER".asInstanceOf[DimensionType]

  @inline def values = js.Array(TOPIC_FILTER)
}

@js.native
sealed trait DimensionValueOperator extends js.Any
object DimensionValueOperator {
  val IN = "IN".asInstanceOf[DimensionValueOperator]
  val NOT_IN = "NOT_IN".asInstanceOf[DimensionValueOperator]

  @inline def values = js.Array(IN, NOT_IN)
}

@js.native
sealed trait DomainConfigurationStatus extends js.Any
object DomainConfigurationStatus {
  val ENABLED = "ENABLED".asInstanceOf[DomainConfigurationStatus]
  val DISABLED = "DISABLED".asInstanceOf[DomainConfigurationStatus]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait DomainType extends js.Any
object DomainType {
  val ENDPOINT = "ENDPOINT".asInstanceOf[DomainType]
  val AWS_MANAGED = "AWS_MANAGED".asInstanceOf[DomainType]
  val CUSTOMER_MANAGED = "CUSTOMER_MANAGED".asInstanceOf[DomainType]

  @inline def values = js.Array(ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED)
}

@js.native
sealed trait DynamicGroupStatus extends js.Any
object DynamicGroupStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[DynamicGroupStatus]
  val BUILDING = "BUILDING".asInstanceOf[DynamicGroupStatus]
  val REBUILDING = "REBUILDING".asInstanceOf[DynamicGroupStatus]

  @inline def values = js.Array(ACTIVE, BUILDING, REBUILDING)
}

@js.native
sealed trait DynamoKeyType extends js.Any
object DynamoKeyType {
  val STRING = "STRING".asInstanceOf[DynamoKeyType]
  val NUMBER = "NUMBER".asInstanceOf[DynamoKeyType]

  @inline def values = js.Array(STRING, NUMBER)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val THING = "THING".asInstanceOf[EventType]
  val THING_GROUP = "THING_GROUP".asInstanceOf[EventType]
  val THING_TYPE = "THING_TYPE".asInstanceOf[EventType]
  val THING_GROUP_MEMBERSHIP = "THING_GROUP_MEMBERSHIP".asInstanceOf[EventType]
  val THING_GROUP_HIERARCHY = "THING_GROUP_HIERARCHY".asInstanceOf[EventType]
  val THING_TYPE_ASSOCIATION = "THING_TYPE_ASSOCIATION".asInstanceOf[EventType]
  val JOB = "JOB".asInstanceOf[EventType]
  val JOB_EXECUTION = "JOB_EXECUTION".asInstanceOf[EventType]
  val POLICY = "POLICY".asInstanceOf[EventType]
  val CERTIFICATE = "CERTIFICATE".asInstanceOf[EventType]
  val CA_CERTIFICATE = "CA_CERTIFICATE".asInstanceOf[EventType]

  @inline def values = js.Array(THING, THING_GROUP, THING_TYPE, THING_GROUP_MEMBERSHIP, THING_GROUP_HIERARCHY, THING_TYPE_ASSOCIATION, JOB, JOB_EXECUTION, POLICY, CERTIFICATE, CA_CERTIFICATE)
}

@js.native
sealed trait FieldType extends js.Any
object FieldType {
  val Number = "Number".asInstanceOf[FieldType]
  val String = "String".asInstanceOf[FieldType]
  val Boolean = "Boolean".asInstanceOf[FieldType]

  @inline def values = js.Array(Number, String, Boolean)
}

@js.native
sealed trait IndexStatus extends js.Any
object IndexStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[IndexStatus]
  val BUILDING = "BUILDING".asInstanceOf[IndexStatus]
  val REBUILDING = "REBUILDING".asInstanceOf[IndexStatus]

  @inline def values = js.Array(ACTIVE, BUILDING, REBUILDING)
}

@js.native
sealed trait JobExecutionFailureType extends js.Any
object JobExecutionFailureType {
  val FAILED = "FAILED".asInstanceOf[JobExecutionFailureType]
  val REJECTED = "REJECTED".asInstanceOf[JobExecutionFailureType]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[JobExecutionFailureType]
  val ALL = "ALL".asInstanceOf[JobExecutionFailureType]

  @inline def values = js.Array(FAILED, REJECTED, TIMED_OUT, ALL)
}

@js.native
sealed trait JobExecutionStatus extends js.Any
object JobExecutionStatus {
  val QUEUED = "QUEUED".asInstanceOf[JobExecutionStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobExecutionStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[JobExecutionStatus]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[JobExecutionStatus]
  val REJECTED = "REJECTED".asInstanceOf[JobExecutionStatus]
  val REMOVED = "REMOVED".asInstanceOf[JobExecutionStatus]
  val CANCELED = "CANCELED".asInstanceOf[JobExecutionStatus]

  @inline def values = js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val CANCELED = "CANCELED".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS".asInstanceOf[JobStatus]

  @inline def values = js.Array(IN_PROGRESS, CANCELED, COMPLETED, DELETION_IN_PROGRESS)
}

@js.native
sealed trait LogLevel extends js.Any
object LogLevel {
  val DEBUG = "DEBUG".asInstanceOf[LogLevel]
  val INFO = "INFO".asInstanceOf[LogLevel]
  val ERROR = "ERROR".asInstanceOf[LogLevel]
  val WARN = "WARN".asInstanceOf[LogLevel]
  val DISABLED = "DISABLED".asInstanceOf[LogLevel]

  @inline def values = js.Array(DEBUG, INFO, ERROR, WARN, DISABLED)
}

@js.native
sealed trait LogTargetType extends js.Any
object LogTargetType {
  val DEFAULT = "DEFAULT".asInstanceOf[LogTargetType]
  val THING_GROUP = "THING_GROUP".asInstanceOf[LogTargetType]

  @inline def values = js.Array(DEFAULT, THING_GROUP)
}

@js.native
sealed trait MessageFormat extends js.Any
object MessageFormat {
  val RAW = "RAW".asInstanceOf[MessageFormat]
  val JSON = "JSON".asInstanceOf[MessageFormat]

  @inline def values = js.Array(RAW, JSON)
}

@js.native
sealed trait MitigationActionType extends js.Any
object MitigationActionType {
  val UPDATE_DEVICE_CERTIFICATE = "UPDATE_DEVICE_CERTIFICATE".asInstanceOf[MitigationActionType]
  val UPDATE_CA_CERTIFICATE = "UPDATE_CA_CERTIFICATE".asInstanceOf[MitigationActionType]
  val ADD_THINGS_TO_THING_GROUP = "ADD_THINGS_TO_THING_GROUP".asInstanceOf[MitigationActionType]
  val REPLACE_DEFAULT_POLICY_VERSION = "REPLACE_DEFAULT_POLICY_VERSION".asInstanceOf[MitigationActionType]
  val ENABLE_IOT_LOGGING = "ENABLE_IOT_LOGGING".asInstanceOf[MitigationActionType]
  val PUBLISH_FINDING_TO_SNS = "PUBLISH_FINDING_TO_SNS".asInstanceOf[MitigationActionType]

  @inline def values = js.Array(UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE, ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION, ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS)
}

@js.native
sealed trait ModelStatus extends js.Any
object ModelStatus {
  val PENDING_BUILD = "PENDING_BUILD".asInstanceOf[ModelStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ModelStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[ModelStatus]

  @inline def values = js.Array(PENDING_BUILD, ACTIVE, EXPIRED)
}

@js.native
sealed trait OTAUpdateStatus extends js.Any
object OTAUpdateStatus {
  val CREATE_PENDING = "CREATE_PENDING".asInstanceOf[OTAUpdateStatus]
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[OTAUpdateStatus]
  val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[OTAUpdateStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[OTAUpdateStatus]

  @inline def values = js.Array(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED)
}

@js.native
sealed trait PolicyTemplateName extends js.Any
object PolicyTemplateName {
  val BLANK_POLICY = "BLANK_POLICY".asInstanceOf[PolicyTemplateName]

  @inline def values = js.Array(BLANK_POLICY)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val MQTT = "MQTT".asInstanceOf[Protocol]
  val HTTP = "HTTP".asInstanceOf[Protocol]

  @inline def values = js.Array(MQTT, HTTP)
}

@js.native
sealed trait ReportType extends js.Any
object ReportType {
  val ERRORS = "ERRORS".asInstanceOf[ReportType]
  val RESULTS = "RESULTS".asInstanceOf[ReportType]

  @inline def values = js.Array(ERRORS, RESULTS)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val DEVICE_CERTIFICATE = "DEVICE_CERTIFICATE".asInstanceOf[ResourceType]
  val CA_CERTIFICATE = "CA_CERTIFICATE".asInstanceOf[ResourceType]
  val IOT_POLICY = "IOT_POLICY".asInstanceOf[ResourceType]
  val COGNITO_IDENTITY_POOL = "COGNITO_IDENTITY_POOL".asInstanceOf[ResourceType]
  val CLIENT_ID = "CLIENT_ID".asInstanceOf[ResourceType]
  val ACCOUNT_SETTINGS = "ACCOUNT_SETTINGS".asInstanceOf[ResourceType]
  val ROLE_ALIAS = "ROLE_ALIAS".asInstanceOf[ResourceType]
  val IAM_ROLE = "IAM_ROLE".asInstanceOf[ResourceType]

  @inline def values = js.Array(DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY, COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS, ROLE_ALIAS, IAM_ROLE)
}

@js.native
sealed trait ServerCertificateStatus extends js.Any
object ServerCertificateStatus {
  val INVALID = "INVALID".asInstanceOf[ServerCertificateStatus]
  val VALID = "VALID".asInstanceOf[ServerCertificateStatus]

  @inline def values = js.Array(INVALID, VALID)
}

@js.native
sealed trait ServiceType extends js.Any
object ServiceType {
  val DATA = "DATA".asInstanceOf[ServiceType]
  val CREDENTIAL_PROVIDER = "CREDENTIAL_PROVIDER".asInstanceOf[ServiceType]
  val JOBS = "JOBS".asInstanceOf[ServiceType]

  @inline def values = js.Array(DATA, CREDENTIAL_PROVIDER, JOBS)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val InProgress = "InProgress".asInstanceOf[Status]
  val Completed = "Completed".asInstanceOf[Status]
  val Failed = "Failed".asInstanceOf[Status]
  val Cancelled = "Cancelled".asInstanceOf[Status]
  val Cancelling = "Cancelling".asInstanceOf[Status]

  @inline def values = js.Array(InProgress, Completed, Failed, Cancelled, Cancelling)
}

@js.native
sealed trait TargetSelection extends js.Any
object TargetSelection {
  val CONTINUOUS = "CONTINUOUS".asInstanceOf[TargetSelection]
  val SNAPSHOT = "SNAPSHOT".asInstanceOf[TargetSelection]

  @inline def values = js.Array(CONTINUOUS, SNAPSHOT)
}

@js.native
sealed trait ThingConnectivityIndexingMode extends js.Any
object ThingConnectivityIndexingMode {
  val OFF = "OFF".asInstanceOf[ThingConnectivityIndexingMode]
  val STATUS = "STATUS".asInstanceOf[ThingConnectivityIndexingMode]

  @inline def values = js.Array(OFF, STATUS)
}

@js.native
sealed trait ThingGroupIndexingMode extends js.Any
object ThingGroupIndexingMode {
  val OFF = "OFF".asInstanceOf[ThingGroupIndexingMode]
  val ON = "ON".asInstanceOf[ThingGroupIndexingMode]

  @inline def values = js.Array(OFF, ON)
}

@js.native
sealed trait ThingIndexingMode extends js.Any
object ThingIndexingMode {
  val OFF = "OFF".asInstanceOf[ThingIndexingMode]
  val REGISTRY = "REGISTRY".asInstanceOf[ThingIndexingMode]
  val REGISTRY_AND_SHADOW = "REGISTRY_AND_SHADOW".asInstanceOf[ThingIndexingMode]

  @inline def values = js.Array(OFF, REGISTRY, REGISTRY_AND_SHADOW)
}

@js.native
sealed trait TopicRuleDestinationStatus extends js.Any
object TopicRuleDestinationStatus {
  val ENABLED = "ENABLED".asInstanceOf[TopicRuleDestinationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TopicRuleDestinationStatus]
  val DISABLED = "DISABLED".asInstanceOf[TopicRuleDestinationStatus]
  val ERROR = "ERROR".asInstanceOf[TopicRuleDestinationStatus]
  val DELETING = "DELETING".asInstanceOf[TopicRuleDestinationStatus]

  @inline def values = js.Array(ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING)
}

@js.native
sealed trait ViolationEventType extends js.Any
object ViolationEventType {
  val `in-alarm` = "in-alarm".asInstanceOf[ViolationEventType]
  val `alarm-cleared` = "alarm-cleared".asInstanceOf[ViolationEventType]
  val `alarm-invalidated` = "alarm-invalidated".asInstanceOf[ViolationEventType]

  @inline def values = js.Array(`in-alarm`, `alarm-cleared`, `alarm-invalidated`)
}
