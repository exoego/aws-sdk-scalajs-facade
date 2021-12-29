package facade.amazonaws.services.iot

import scalajs._

type AbortAction = "CANCEL"
object AbortAction {
  val CANCEL: "CANCEL" = "CANCEL"

  @inline def values = js.Array[AbortAction](CANCEL)
}

type ActionType = "PUBLISH" | "SUBSCRIBE" | "RECEIVE" | "CONNECT"
object ActionType {
  val PUBLISH: "PUBLISH" = "PUBLISH"
  val SUBSCRIBE: "SUBSCRIBE" = "SUBSCRIBE"
  val RECEIVE: "RECEIVE" = "RECEIVE"
  val CONNECT: "CONNECT" = "CONNECT"

  @inline def values = js.Array[ActionType](PUBLISH, SUBSCRIBE, RECEIVE, CONNECT)
}

/** The type of alert target: one of "SNS".
  */
type AlertTargetType = "SNS"
object AlertTargetType {
  val SNS: "SNS" = "SNS"

  @inline def values = js.Array[AlertTargetType](SNS)
}

type AuditCheckRunStatus = "IN_PROGRESS" | "WAITING_FOR_DATA_COLLECTION" | "CANCELED" | "COMPLETED_COMPLIANT" | "COMPLETED_NON_COMPLIANT" | "FAILED"
object AuditCheckRunStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val WAITING_FOR_DATA_COLLECTION: "WAITING_FOR_DATA_COLLECTION" = "WAITING_FOR_DATA_COLLECTION"
  val CANCELED: "CANCELED" = "CANCELED"
  val COMPLETED_COMPLIANT: "COMPLETED_COMPLIANT" = "COMPLETED_COMPLIANT"
  val COMPLETED_NON_COMPLIANT: "COMPLETED_NON_COMPLIANT" = "COMPLETED_NON_COMPLIANT"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AuditCheckRunStatus](IN_PROGRESS, WAITING_FOR_DATA_COLLECTION, CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED)
}

type AuditFindingSeverity = "CRITICAL" | "HIGH" | "MEDIUM" | "LOW"
object AuditFindingSeverity {
  val CRITICAL: "CRITICAL" = "CRITICAL"
  val HIGH: "HIGH" = "HIGH"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val LOW: "LOW" = "LOW"

  @inline def values = js.Array[AuditFindingSeverity](CRITICAL, HIGH, MEDIUM, LOW)
}

type AuditFrequency = "DAILY" | "WEEKLY" | "BIWEEKLY" | "MONTHLY"
object AuditFrequency {
  val DAILY: "DAILY" = "DAILY"
  val WEEKLY: "WEEKLY" = "WEEKLY"
  val BIWEEKLY: "BIWEEKLY" = "BIWEEKLY"
  val MONTHLY: "MONTHLY" = "MONTHLY"

  @inline def values = js.Array[AuditFrequency](DAILY, WEEKLY, BIWEEKLY, MONTHLY)
}

type AuditMitigationActionsExecutionStatus = "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | "SKIPPED" | "PENDING"
object AuditMitigationActionsExecutionStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELED: "CANCELED" = "CANCELED"
  val SKIPPED: "SKIPPED" = "SKIPPED"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[AuditMitigationActionsExecutionStatus](IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED, PENDING)
}

type AuditMitigationActionsTaskStatus = "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED"
object AuditMitigationActionsTaskStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELED: "CANCELED" = "CANCELED"

  @inline def values = js.Array[AuditMitigationActionsTaskStatus](IN_PROGRESS, COMPLETED, FAILED, CANCELED)
}

type AuditNotificationType = "SNS"
object AuditNotificationType {
  val SNS: "SNS" = "SNS"

  @inline def values = js.Array[AuditNotificationType](SNS)
}

type AuditTaskStatus = "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED"
object AuditTaskStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELED: "CANCELED" = "CANCELED"

  @inline def values = js.Array[AuditTaskStatus](IN_PROGRESS, COMPLETED, FAILED, CANCELED)
}

type AuditTaskType = "ON_DEMAND_AUDIT_TASK" | "SCHEDULED_AUDIT_TASK"
object AuditTaskType {
  val ON_DEMAND_AUDIT_TASK: "ON_DEMAND_AUDIT_TASK" = "ON_DEMAND_AUDIT_TASK"
  val SCHEDULED_AUDIT_TASK: "SCHEDULED_AUDIT_TASK" = "SCHEDULED_AUDIT_TASK"

  @inline def values = js.Array[AuditTaskType](ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK)
}

type AuthDecision = "ALLOWED" | "EXPLICIT_DENY" | "IMPLICIT_DENY"
object AuthDecision {
  val ALLOWED: "ALLOWED" = "ALLOWED"
  val EXPLICIT_DENY: "EXPLICIT_DENY" = "EXPLICIT_DENY"
  val IMPLICIT_DENY: "IMPLICIT_DENY" = "IMPLICIT_DENY"

  @inline def values = js.Array[AuthDecision](ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY)
}

type AuthorizerStatus = "ACTIVE" | "INACTIVE"
object AuthorizerStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[AuthorizerStatus](ACTIVE, INACTIVE)
}

type AutoRegistrationStatus = "ENABLE" | "DISABLE"
object AutoRegistrationStatus {
  val ENABLE: "ENABLE" = "ENABLE"
  val DISABLE: "DISABLE" = "DISABLE"

  @inline def values = js.Array[AutoRegistrationStatus](ENABLE, DISABLE)
}

type AwsJobAbortCriteriaAbortAction = "CANCEL"
object AwsJobAbortCriteriaAbortAction {
  val CANCEL: "CANCEL" = "CANCEL"

  @inline def values = js.Array[AwsJobAbortCriteriaAbortAction](CANCEL)
}

type AwsJobAbortCriteriaFailureType = "FAILED" | "REJECTED" | "TIMED_OUT" | "ALL"
object AwsJobAbortCriteriaFailureType {
  val FAILED: "FAILED" = "FAILED"
  val REJECTED: "REJECTED" = "REJECTED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[AwsJobAbortCriteriaFailureType](FAILED, REJECTED, TIMED_OUT, ALL)
}

type BehaviorCriteriaType = "STATIC" | "STATISTICAL" | "MACHINE_LEARNING"
object BehaviorCriteriaType {
  val STATIC: "STATIC" = "STATIC"
  val STATISTICAL: "STATISTICAL" = "STATISTICAL"
  val MACHINE_LEARNING: "MACHINE_LEARNING" = "MACHINE_LEARNING"

  @inline def values = js.Array[BehaviorCriteriaType](STATIC, STATISTICAL, MACHINE_LEARNING)
}

type CACertificateStatus = "ACTIVE" | "INACTIVE"
object CACertificateStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[CACertificateStatus](ACTIVE, INACTIVE)
}

type CACertificateUpdateAction = "DEACTIVATE"
object CACertificateUpdateAction {
  val DEACTIVATE: "DEACTIVATE" = "DEACTIVATE"

  @inline def values = js.Array[CACertificateUpdateAction](DEACTIVATE)
}

type CannedAccessControlList = "private" | "public-read" | "public-read-write" | "aws-exec-read" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "log-delivery-write"
object CannedAccessControlList {
  val `private`: "private" = "private"
  val `public-read`: "public-read" = "public-read"
  val `public-read-write`: "public-read-write" = "public-read-write"
  val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"
  val `authenticated-read`: "authenticated-read" = "authenticated-read"
  val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"
  val `log-delivery-write`: "log-delivery-write" = "log-delivery-write"

  @inline def values = js.Array[CannedAccessControlList](`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`, `log-delivery-write`)
}

type CertificateMode = "DEFAULT" | "SNI_ONLY"
object CertificateMode {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val SNI_ONLY: "SNI_ONLY" = "SNI_ONLY"

  @inline def values = js.Array[CertificateMode](DEFAULT, SNI_ONLY)
}

type CertificateStatus = "ACTIVE" | "INACTIVE" | "REVOKED" | "PENDING_TRANSFER" | "REGISTER_INACTIVE" | "PENDING_ACTIVATION"
object CertificateStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val REVOKED: "REVOKED" = "REVOKED"
  val PENDING_TRANSFER: "PENDING_TRANSFER" = "PENDING_TRANSFER"
  val REGISTER_INACTIVE: "REGISTER_INACTIVE" = "REGISTER_INACTIVE"
  val PENDING_ACTIVATION: "PENDING_ACTIVATION" = "PENDING_ACTIVATION"

  @inline def values = js.Array[CertificateStatus](ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, REGISTER_INACTIVE, PENDING_ACTIVATION)
}

type ComparisonOperator = "less-than" | "less-than-equals" | "greater-than" | "greater-than-equals" | "in-cidr-set" | "not-in-cidr-set" | "in-port-set" | "not-in-port-set" | "in-set" | "not-in-set"
object ComparisonOperator {
  val `less-than`: "less-than" = "less-than"
  val `less-than-equals`: "less-than-equals" = "less-than-equals"
  val `greater-than`: "greater-than" = "greater-than"
  val `greater-than-equals`: "greater-than-equals" = "greater-than-equals"
  val `in-cidr-set`: "in-cidr-set" = "in-cidr-set"
  val `not-in-cidr-set`: "not-in-cidr-set" = "not-in-cidr-set"
  val `in-port-set`: "in-port-set" = "in-port-set"
  val `not-in-port-set`: "not-in-port-set" = "not-in-port-set"
  val `in-set`: "in-set" = "in-set"
  val `not-in-set`: "not-in-set" = "not-in-set"

  @inline def values = js.Array[ComparisonOperator](
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

type ConfidenceLevel = "LOW" | "MEDIUM" | "HIGH"
object ConfidenceLevel {
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"

  @inline def values = js.Array[ConfidenceLevel](LOW, MEDIUM, HIGH)
}

type CustomMetricType = "string-list" | "ip-address-list" | "number-list" | "number"
object CustomMetricType {
  val `string-list`: "string-list" = "string-list"
  val `ip-address-list`: "ip-address-list" = "ip-address-list"
  val `number-list`: "number-list" = "number-list"
  val number: "number" = "number"

  @inline def values = js.Array[CustomMetricType](`string-list`, `ip-address-list`, `number-list`, number)
}

type DayOfWeek = "SUN" | "MON" | "TUE" | "WED" | "THU" | "FRI" | "SAT"
object DayOfWeek {
  val SUN: "SUN" = "SUN"
  val MON: "MON" = "MON"
  val TUE: "TUE" = "TUE"
  val WED: "WED" = "WED"
  val THU: "THU" = "THU"
  val FRI: "FRI" = "FRI"
  val SAT: "SAT" = "SAT"

  @inline def values = js.Array[DayOfWeek](SUN, MON, TUE, WED, THU, FRI, SAT)
}

type DetectMitigationActionExecutionStatus = "IN_PROGRESS" | "SUCCESSFUL" | "FAILED" | "SKIPPED"
object DetectMitigationActionExecutionStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCESSFUL: "SUCCESSFUL" = "SUCCESSFUL"
  val FAILED: "FAILED" = "FAILED"
  val SKIPPED: "SKIPPED" = "SKIPPED"

  @inline def values = js.Array[DetectMitigationActionExecutionStatus](IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED)
}

type DetectMitigationActionsTaskStatus = "IN_PROGRESS" | "SUCCESSFUL" | "FAILED" | "CANCELED"
object DetectMitigationActionsTaskStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCESSFUL: "SUCCESSFUL" = "SUCCESSFUL"
  val FAILED: "FAILED" = "FAILED"
  val CANCELED: "CANCELED" = "CANCELED"

  @inline def values = js.Array[DetectMitigationActionsTaskStatus](IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED)
}

type DeviceCertificateUpdateAction = "DEACTIVATE"
object DeviceCertificateUpdateAction {
  val DEACTIVATE: "DEACTIVATE" = "DEACTIVATE"

  @inline def values = js.Array[DeviceCertificateUpdateAction](DEACTIVATE)
}

type DimensionType = "TOPIC_FILTER"
object DimensionType {
  val TOPIC_FILTER: "TOPIC_FILTER" = "TOPIC_FILTER"

  @inline def values = js.Array[DimensionType](TOPIC_FILTER)
}

type DimensionValueOperator = "IN" | "NOT_IN"
object DimensionValueOperator {
  val IN: "IN" = "IN"
  val NOT_IN: "NOT_IN" = "NOT_IN"

  @inline def values = js.Array[DimensionValueOperator](IN, NOT_IN)
}

type DomainConfigurationStatus = "ENABLED" | "DISABLED"
object DomainConfigurationStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[DomainConfigurationStatus](ENABLED, DISABLED)
}

type DomainType = "ENDPOINT" | "AWS_MANAGED" | "CUSTOMER_MANAGED"
object DomainType {
  val ENDPOINT: "ENDPOINT" = "ENDPOINT"
  val AWS_MANAGED: "AWS_MANAGED" = "AWS_MANAGED"
  val CUSTOMER_MANAGED: "CUSTOMER_MANAGED" = "CUSTOMER_MANAGED"

  @inline def values = js.Array[DomainType](ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED)
}

type DynamicGroupStatus = "ACTIVE" | "BUILDING" | "REBUILDING"
object DynamicGroupStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val BUILDING: "BUILDING" = "BUILDING"
  val REBUILDING: "REBUILDING" = "REBUILDING"

  @inline def values = js.Array[DynamicGroupStatus](ACTIVE, BUILDING, REBUILDING)
}

type DynamoKeyType = "STRING" | "NUMBER"
object DynamoKeyType {
  val STRING: "STRING" = "STRING"
  val NUMBER: "NUMBER" = "NUMBER"

  @inline def values = js.Array[DynamoKeyType](STRING, NUMBER)
}

type EventType = "THING" | "THING_GROUP" | "THING_TYPE" | "THING_GROUP_MEMBERSHIP" | "THING_GROUP_HIERARCHY" | "THING_TYPE_ASSOCIATION" | "JOB" | "JOB_EXECUTION" | "POLICY" | "CERTIFICATE" | "CA_CERTIFICATE"
object EventType {
  val THING: "THING" = "THING"
  val THING_GROUP: "THING_GROUP" = "THING_GROUP"
  val THING_TYPE: "THING_TYPE" = "THING_TYPE"
  val THING_GROUP_MEMBERSHIP: "THING_GROUP_MEMBERSHIP" = "THING_GROUP_MEMBERSHIP"
  val THING_GROUP_HIERARCHY: "THING_GROUP_HIERARCHY" = "THING_GROUP_HIERARCHY"
  val THING_TYPE_ASSOCIATION: "THING_TYPE_ASSOCIATION" = "THING_TYPE_ASSOCIATION"
  val JOB: "JOB" = "JOB"
  val JOB_EXECUTION: "JOB_EXECUTION" = "JOB_EXECUTION"
  val POLICY: "POLICY" = "POLICY"
  val CERTIFICATE: "CERTIFICATE" = "CERTIFICATE"
  val CA_CERTIFICATE: "CA_CERTIFICATE" = "CA_CERTIFICATE"

  @inline def values = js.Array[EventType](THING, THING_GROUP, THING_TYPE, THING_GROUP_MEMBERSHIP, THING_GROUP_HIERARCHY, THING_TYPE_ASSOCIATION, JOB, JOB_EXECUTION, POLICY, CERTIFICATE, CA_CERTIFICATE)
}

type FieldType = "Number" | "String" | "Boolean"
object FieldType {
  val Number: "Number" = "Number"
  val String: "String" = "String"
  val Boolean: "Boolean" = "Boolean"

  @inline def values = js.Array[FieldType](Number, String, Boolean)
}

type IndexStatus = "ACTIVE" | "BUILDING" | "REBUILDING"
object IndexStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val BUILDING: "BUILDING" = "BUILDING"
  val REBUILDING: "REBUILDING" = "REBUILDING"

  @inline def values = js.Array[IndexStatus](ACTIVE, BUILDING, REBUILDING)
}

type JobExecutionFailureType = "FAILED" | "REJECTED" | "TIMED_OUT" | "ALL"
object JobExecutionFailureType {
  val FAILED: "FAILED" = "FAILED"
  val REJECTED: "REJECTED" = "REJECTED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[JobExecutionFailureType](FAILED, REJECTED, TIMED_OUT, ALL)
}

type JobExecutionStatus = "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED"
object JobExecutionStatus {
  val QUEUED: "QUEUED" = "QUEUED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val REJECTED: "REJECTED" = "REJECTED"
  val REMOVED: "REMOVED" = "REMOVED"
  val CANCELED: "CANCELED" = "CANCELED"

  @inline def values = js.Array[JobExecutionStatus](QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
}

type JobStatus = "IN_PROGRESS" | "CANCELED" | "COMPLETED" | "DELETION_IN_PROGRESS"
object JobStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val CANCELED: "CANCELED" = "CANCELED"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val DELETION_IN_PROGRESS: "DELETION_IN_PROGRESS" = "DELETION_IN_PROGRESS"

  @inline def values = js.Array[JobStatus](IN_PROGRESS, CANCELED, COMPLETED, DELETION_IN_PROGRESS)
}

type LogLevel = "DEBUG" | "INFO" | "ERROR" | "WARN" | "DISABLED"
object LogLevel {
  val DEBUG: "DEBUG" = "DEBUG"
  val INFO: "INFO" = "INFO"
  val ERROR: "ERROR" = "ERROR"
  val WARN: "WARN" = "WARN"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[LogLevel](DEBUG, INFO, ERROR, WARN, DISABLED)
}

type LogTargetType = "DEFAULT" | "THING_GROUP"
object LogTargetType {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val THING_GROUP: "THING_GROUP" = "THING_GROUP"

  @inline def values = js.Array[LogTargetType](DEFAULT, THING_GROUP)
}

type MessageFormat = "RAW" | "JSON"
object MessageFormat {
  val RAW: "RAW" = "RAW"
  val JSON: "JSON" = "JSON"

  @inline def values = js.Array[MessageFormat](RAW, JSON)
}

type MitigationActionType = "UPDATE_DEVICE_CERTIFICATE" | "UPDATE_CA_CERTIFICATE" | "ADD_THINGS_TO_THING_GROUP" | "REPLACE_DEFAULT_POLICY_VERSION" | "ENABLE_IOT_LOGGING" | "PUBLISH_FINDING_TO_SNS"
object MitigationActionType {
  val UPDATE_DEVICE_CERTIFICATE: "UPDATE_DEVICE_CERTIFICATE" = "UPDATE_DEVICE_CERTIFICATE"
  val UPDATE_CA_CERTIFICATE: "UPDATE_CA_CERTIFICATE" = "UPDATE_CA_CERTIFICATE"
  val ADD_THINGS_TO_THING_GROUP: "ADD_THINGS_TO_THING_GROUP" = "ADD_THINGS_TO_THING_GROUP"
  val REPLACE_DEFAULT_POLICY_VERSION: "REPLACE_DEFAULT_POLICY_VERSION" = "REPLACE_DEFAULT_POLICY_VERSION"
  val ENABLE_IOT_LOGGING: "ENABLE_IOT_LOGGING" = "ENABLE_IOT_LOGGING"
  val PUBLISH_FINDING_TO_SNS: "PUBLISH_FINDING_TO_SNS" = "PUBLISH_FINDING_TO_SNS"

  @inline def values = js.Array[MitigationActionType](UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE, ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION, ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS)
}

type ModelStatus = "PENDING_BUILD" | "ACTIVE" | "EXPIRED"
object ModelStatus {
  val PENDING_BUILD: "PENDING_BUILD" = "PENDING_BUILD"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val EXPIRED: "EXPIRED" = "EXPIRED"

  @inline def values = js.Array[ModelStatus](PENDING_BUILD, ACTIVE, EXPIRED)
}

type OTAUpdateStatus = "CREATE_PENDING" | "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED"
object OTAUpdateStatus {
  val CREATE_PENDING: "CREATE_PENDING" = "CREATE_PENDING"
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"

  @inline def values = js.Array[OTAUpdateStatus](CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED)
}

type PolicyTemplateName = "BLANK_POLICY"
object PolicyTemplateName {
  val BLANK_POLICY: "BLANK_POLICY" = "BLANK_POLICY"

  @inline def values = js.Array[PolicyTemplateName](BLANK_POLICY)
}

type Protocol = "MQTT" | "HTTP"
object Protocol {
  val MQTT: "MQTT" = "MQTT"
  val HTTP: "HTTP" = "HTTP"

  @inline def values = js.Array[Protocol](MQTT, HTTP)
}

type ReportType = "ERRORS" | "RESULTS"
object ReportType {
  val ERRORS: "ERRORS" = "ERRORS"
  val RESULTS: "RESULTS" = "RESULTS"

  @inline def values = js.Array[ReportType](ERRORS, RESULTS)
}

type ResourceType = "DEVICE_CERTIFICATE" | "CA_CERTIFICATE" | "IOT_POLICY" | "COGNITO_IDENTITY_POOL" | "CLIENT_ID" | "ACCOUNT_SETTINGS" | "ROLE_ALIAS" | "IAM_ROLE"
object ResourceType {
  val DEVICE_CERTIFICATE: "DEVICE_CERTIFICATE" = "DEVICE_CERTIFICATE"
  val CA_CERTIFICATE: "CA_CERTIFICATE" = "CA_CERTIFICATE"
  val IOT_POLICY: "IOT_POLICY" = "IOT_POLICY"
  val COGNITO_IDENTITY_POOL: "COGNITO_IDENTITY_POOL" = "COGNITO_IDENTITY_POOL"
  val CLIENT_ID: "CLIENT_ID" = "CLIENT_ID"
  val ACCOUNT_SETTINGS: "ACCOUNT_SETTINGS" = "ACCOUNT_SETTINGS"
  val ROLE_ALIAS: "ROLE_ALIAS" = "ROLE_ALIAS"
  val IAM_ROLE: "IAM_ROLE" = "IAM_ROLE"

  @inline def values = js.Array[ResourceType](DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY, COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS, ROLE_ALIAS, IAM_ROLE)
}

type ServerCertificateStatus = "INVALID" | "VALID"
object ServerCertificateStatus {
  val INVALID: "INVALID" = "INVALID"
  val VALID: "VALID" = "VALID"

  @inline def values = js.Array[ServerCertificateStatus](INVALID, VALID)
}

type ServiceType = "DATA" | "CREDENTIAL_PROVIDER" | "JOBS"
object ServiceType {
  val DATA: "DATA" = "DATA"
  val CREDENTIAL_PROVIDER: "CREDENTIAL_PROVIDER" = "CREDENTIAL_PROVIDER"
  val JOBS: "JOBS" = "JOBS"

  @inline def values = js.Array[ServiceType](DATA, CREDENTIAL_PROVIDER, JOBS)
}

type Status = "InProgress" | "Completed" | "Failed" | "Cancelled" | "Cancelling"
object Status {
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Cancelled: "Cancelled" = "Cancelled"
  val Cancelling: "Cancelling" = "Cancelling"

  @inline def values = js.Array[Status](InProgress, Completed, Failed, Cancelled, Cancelling)
}

type TargetSelection = "CONTINUOUS" | "SNAPSHOT"
object TargetSelection {
  val CONTINUOUS: "CONTINUOUS" = "CONTINUOUS"
  val SNAPSHOT: "SNAPSHOT" = "SNAPSHOT"

  @inline def values = js.Array[TargetSelection](CONTINUOUS, SNAPSHOT)
}

type ThingConnectivityIndexingMode = "OFF" | "STATUS"
object ThingConnectivityIndexingMode {
  val OFF: "OFF" = "OFF"
  val STATUS: "STATUS" = "STATUS"

  @inline def values = js.Array[ThingConnectivityIndexingMode](OFF, STATUS)
}

type ThingGroupIndexingMode = "OFF" | "ON"
object ThingGroupIndexingMode {
  val OFF: "OFF" = "OFF"
  val ON: "ON" = "ON"

  @inline def values = js.Array[ThingGroupIndexingMode](OFF, ON)
}

type ThingIndexingMode = "OFF" | "REGISTRY" | "REGISTRY_AND_SHADOW"
object ThingIndexingMode {
  val OFF: "OFF" = "OFF"
  val REGISTRY: "REGISTRY" = "REGISTRY"
  val REGISTRY_AND_SHADOW: "REGISTRY_AND_SHADOW" = "REGISTRY_AND_SHADOW"

  @inline def values = js.Array[ThingIndexingMode](OFF, REGISTRY, REGISTRY_AND_SHADOW)
}

type TopicRuleDestinationStatus = "ENABLED" | "IN_PROGRESS" | "DISABLED" | "ERROR" | "DELETING"
object TopicRuleDestinationStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val DISABLED: "DISABLED" = "DISABLED"
  val ERROR: "ERROR" = "ERROR"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[TopicRuleDestinationStatus](ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING)
}

type ViolationEventType = "in-alarm" | "alarm-cleared" | "alarm-invalidated"
object ViolationEventType {
  val `in-alarm`: "in-alarm" = "in-alarm"
  val `alarm-cleared`: "alarm-cleared" = "alarm-cleared"
  val `alarm-invalidated`: "alarm-invalidated" = "alarm-invalidated"

  @inline def values = js.Array[ViolationEventType](`in-alarm`, `alarm-cleared`, `alarm-invalidated`)
}
