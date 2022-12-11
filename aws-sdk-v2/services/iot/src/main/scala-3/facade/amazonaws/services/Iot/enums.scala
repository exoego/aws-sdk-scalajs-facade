package facade.amazonaws.services.iot

import scalajs.js

type AbortAction = "CANCEL"
object AbortAction {
  inline val CANCEL: "CANCEL" = "CANCEL"

  inline def values: js.Array[AbortAction] = js.Array(CANCEL)
}

type ActionType = "PUBLISH" | "SUBSCRIBE" | "RECEIVE" | "CONNECT"
object ActionType {
  inline val PUBLISH: "PUBLISH" = "PUBLISH"
  inline val SUBSCRIBE: "SUBSCRIBE" = "SUBSCRIBE"
  inline val RECEIVE: "RECEIVE" = "RECEIVE"
  inline val CONNECT: "CONNECT" = "CONNECT"

  inline def values: js.Array[ActionType] = js.Array(PUBLISH, SUBSCRIBE, RECEIVE, CONNECT)
}

type AggregationTypeName = "Statistics" | "Percentiles" | "Cardinality"
object AggregationTypeName {
  inline val Statistics: "Statistics" = "Statistics"
  inline val Percentiles: "Percentiles" = "Percentiles"
  inline val Cardinality: "Cardinality" = "Cardinality"

  inline def values: js.Array[AggregationTypeName] = js.Array(Statistics, Percentiles, Cardinality)
}

/** The type of alert target: one of "SNS".
  */
type AlertTargetType = "SNS"
object AlertTargetType {
  inline val SNS: "SNS" = "SNS"

  inline def values: js.Array[AlertTargetType] = js.Array(SNS)
}

type AuditCheckRunStatus = "IN_PROGRESS" | "WAITING_FOR_DATA_COLLECTION" | "CANCELED" | "COMPLETED_COMPLIANT" | "COMPLETED_NON_COMPLIANT" | "FAILED"
object AuditCheckRunStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val WAITING_FOR_DATA_COLLECTION: "WAITING_FOR_DATA_COLLECTION" = "WAITING_FOR_DATA_COLLECTION"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val COMPLETED_COMPLIANT: "COMPLETED_COMPLIANT" = "COMPLETED_COMPLIANT"
  inline val COMPLETED_NON_COMPLIANT: "COMPLETED_NON_COMPLIANT" = "COMPLETED_NON_COMPLIANT"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AuditCheckRunStatus] = js.Array(IN_PROGRESS, WAITING_FOR_DATA_COLLECTION, CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED)
}

type AuditFindingSeverity = "CRITICAL" | "HIGH" | "MEDIUM" | "LOW"
object AuditFindingSeverity {
  inline val CRITICAL: "CRITICAL" = "CRITICAL"
  inline val HIGH: "HIGH" = "HIGH"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val LOW: "LOW" = "LOW"

  inline def values: js.Array[AuditFindingSeverity] = js.Array(CRITICAL, HIGH, MEDIUM, LOW)
}

type AuditFrequency = "DAILY" | "WEEKLY" | "BIWEEKLY" | "MONTHLY"
object AuditFrequency {
  inline val DAILY: "DAILY" = "DAILY"
  inline val WEEKLY: "WEEKLY" = "WEEKLY"
  inline val BIWEEKLY: "BIWEEKLY" = "BIWEEKLY"
  inline val MONTHLY: "MONTHLY" = "MONTHLY"

  inline def values: js.Array[AuditFrequency] = js.Array(DAILY, WEEKLY, BIWEEKLY, MONTHLY)
}

type AuditMitigationActionsExecutionStatus = "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | "SKIPPED" | "PENDING"
object AuditMitigationActionsExecutionStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val SKIPPED: "SKIPPED" = "SKIPPED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[AuditMitigationActionsExecutionStatus] = js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED, SKIPPED, PENDING)
}

type AuditMitigationActionsTaskStatus = "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED"
object AuditMitigationActionsTaskStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[AuditMitigationActionsTaskStatus] = js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED)
}

type AuditNotificationType = "SNS"
object AuditNotificationType {
  inline val SNS: "SNS" = "SNS"

  inline def values: js.Array[AuditNotificationType] = js.Array(SNS)
}

type AuditTaskStatus = "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED"
object AuditTaskStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[AuditTaskStatus] = js.Array(IN_PROGRESS, COMPLETED, FAILED, CANCELED)
}

type AuditTaskType = "ON_DEMAND_AUDIT_TASK" | "SCHEDULED_AUDIT_TASK"
object AuditTaskType {
  inline val ON_DEMAND_AUDIT_TASK: "ON_DEMAND_AUDIT_TASK" = "ON_DEMAND_AUDIT_TASK"
  inline val SCHEDULED_AUDIT_TASK: "SCHEDULED_AUDIT_TASK" = "SCHEDULED_AUDIT_TASK"

  inline def values: js.Array[AuditTaskType] = js.Array(ON_DEMAND_AUDIT_TASK, SCHEDULED_AUDIT_TASK)
}

type AuthDecision = "ALLOWED" | "EXPLICIT_DENY" | "IMPLICIT_DENY"
object AuthDecision {
  inline val ALLOWED: "ALLOWED" = "ALLOWED"
  inline val EXPLICIT_DENY: "EXPLICIT_DENY" = "EXPLICIT_DENY"
  inline val IMPLICIT_DENY: "IMPLICIT_DENY" = "IMPLICIT_DENY"

  inline def values: js.Array[AuthDecision] = js.Array(ALLOWED, EXPLICIT_DENY, IMPLICIT_DENY)
}

type AuthorizerStatus = "ACTIVE" | "INACTIVE"
object AuthorizerStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[AuthorizerStatus] = js.Array(ACTIVE, INACTIVE)
}

type AutoRegistrationStatus = "ENABLE" | "DISABLE"
object AutoRegistrationStatus {
  inline val ENABLE: "ENABLE" = "ENABLE"
  inline val DISABLE: "DISABLE" = "DISABLE"

  inline def values: js.Array[AutoRegistrationStatus] = js.Array(ENABLE, DISABLE)
}

type AwsJobAbortCriteriaAbortAction = "CANCEL"
object AwsJobAbortCriteriaAbortAction {
  inline val CANCEL: "CANCEL" = "CANCEL"

  inline def values: js.Array[AwsJobAbortCriteriaAbortAction] = js.Array(CANCEL)
}

type AwsJobAbortCriteriaFailureType = "FAILED" | "REJECTED" | "TIMED_OUT" | "ALL"
object AwsJobAbortCriteriaFailureType {
  inline val FAILED: "FAILED" = "FAILED"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[AwsJobAbortCriteriaFailureType] = js.Array(FAILED, REJECTED, TIMED_OUT, ALL)
}

type BehaviorCriteriaType = "STATIC" | "STATISTICAL" | "MACHINE_LEARNING"
object BehaviorCriteriaType {
  inline val STATIC: "STATIC" = "STATIC"
  inline val STATISTICAL: "STATISTICAL" = "STATISTICAL"
  inline val MACHINE_LEARNING: "MACHINE_LEARNING" = "MACHINE_LEARNING"

  inline def values: js.Array[BehaviorCriteriaType] = js.Array(STATIC, STATISTICAL, MACHINE_LEARNING)
}

type CACertificateStatus = "ACTIVE" | "INACTIVE"
object CACertificateStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[CACertificateStatus] = js.Array(ACTIVE, INACTIVE)
}

type CACertificateUpdateAction = "DEACTIVATE"
object CACertificateUpdateAction {
  inline val DEACTIVATE: "DEACTIVATE" = "DEACTIVATE"

  inline def values: js.Array[CACertificateUpdateAction] = js.Array(DEACTIVATE)
}

type CannedAccessControlList = "private" | "public-read" | "public-read-write" | "aws-exec-read" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "log-delivery-write"
object CannedAccessControlList {
  inline val `private`: "private" = "private"
  inline val `public-read`: "public-read" = "public-read"
  inline val `public-read-write`: "public-read-write" = "public-read-write"
  inline val `aws-exec-read`: "aws-exec-read" = "aws-exec-read"
  inline val `authenticated-read`: "authenticated-read" = "authenticated-read"
  inline val `bucket-owner-read`: "bucket-owner-read" = "bucket-owner-read"
  inline val `bucket-owner-full-control`: "bucket-owner-full-control" = "bucket-owner-full-control"
  inline val `log-delivery-write`: "log-delivery-write" = "log-delivery-write"

  inline def values: js.Array[CannedAccessControlList] = js.Array(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`, `log-delivery-write`)
}

type CertificateMode = "DEFAULT" | "SNI_ONLY"
object CertificateMode {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val SNI_ONLY: "SNI_ONLY" = "SNI_ONLY"

  inline def values: js.Array[CertificateMode] = js.Array(DEFAULT, SNI_ONLY)
}

type CertificateStatus = "ACTIVE" | "INACTIVE" | "REVOKED" | "PENDING_TRANSFER" | "REGISTER_INACTIVE" | "PENDING_ACTIVATION"
object CertificateStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val REVOKED: "REVOKED" = "REVOKED"
  inline val PENDING_TRANSFER: "PENDING_TRANSFER" = "PENDING_TRANSFER"
  inline val REGISTER_INACTIVE: "REGISTER_INACTIVE" = "REGISTER_INACTIVE"
  inline val PENDING_ACTIVATION: "PENDING_ACTIVATION" = "PENDING_ACTIVATION"

  inline def values: js.Array[CertificateStatus] = js.Array(ACTIVE, INACTIVE, REVOKED, PENDING_TRANSFER, REGISTER_INACTIVE, PENDING_ACTIVATION)
}

type ComparisonOperator = "less-than" | "less-than-equals" | "greater-than" | "greater-than-equals" | "in-cidr-set" | "not-in-cidr-set" | "in-port-set" | "not-in-port-set" | "in-set" | "not-in-set"
object ComparisonOperator {
  inline val `less-than`: "less-than" = "less-than"
  inline val `less-than-equals`: "less-than-equals" = "less-than-equals"
  inline val `greater-than`: "greater-than" = "greater-than"
  inline val `greater-than-equals`: "greater-than-equals" = "greater-than-equals"
  inline val `in-cidr-set`: "in-cidr-set" = "in-cidr-set"
  inline val `not-in-cidr-set`: "not-in-cidr-set" = "not-in-cidr-set"
  inline val `in-port-set`: "in-port-set" = "in-port-set"
  inline val `not-in-port-set`: "not-in-port-set" = "not-in-port-set"
  inline val `in-set`: "in-set" = "in-set"
  inline val `not-in-set`: "not-in-set" = "not-in-set"

  inline def values: js.Array[ComparisonOperator] = js.Array(
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
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[ConfidenceLevel] = js.Array(LOW, MEDIUM, HIGH)
}

type CustomMetricType = "string-list" | "ip-address-list" | "number-list" | "number"
object CustomMetricType {
  inline val `string-list`: "string-list" = "string-list"
  inline val `ip-address-list`: "ip-address-list" = "ip-address-list"
  inline val `number-list`: "number-list" = "number-list"
  inline val number: "number" = "number"

  inline def values: js.Array[CustomMetricType] = js.Array(`string-list`, `ip-address-list`, `number-list`, number)
}

type DayOfWeek = "SUN" | "MON" | "TUE" | "WED" | "THU" | "FRI" | "SAT"
object DayOfWeek {
  inline val SUN: "SUN" = "SUN"
  inline val MON: "MON" = "MON"
  inline val TUE: "TUE" = "TUE"
  inline val WED: "WED" = "WED"
  inline val THU: "THU" = "THU"
  inline val FRI: "FRI" = "FRI"
  inline val SAT: "SAT" = "SAT"

  inline def values: js.Array[DayOfWeek] = js.Array(SUN, MON, TUE, WED, THU, FRI, SAT)
}

type DetectMitigationActionExecutionStatus = "IN_PROGRESS" | "SUCCESSFUL" | "FAILED" | "SKIPPED"
object DetectMitigationActionExecutionStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESSFUL: "SUCCESSFUL" = "SUCCESSFUL"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SKIPPED: "SKIPPED" = "SKIPPED"

  inline def values: js.Array[DetectMitigationActionExecutionStatus] = js.Array(IN_PROGRESS, SUCCESSFUL, FAILED, SKIPPED)
}

type DetectMitigationActionsTaskStatus = "IN_PROGRESS" | "SUCCESSFUL" | "FAILED" | "CANCELED"
object DetectMitigationActionsTaskStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESSFUL: "SUCCESSFUL" = "SUCCESSFUL"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[DetectMitigationActionsTaskStatus] = js.Array(IN_PROGRESS, SUCCESSFUL, FAILED, CANCELED)
}

type DeviceCertificateUpdateAction = "DEACTIVATE"
object DeviceCertificateUpdateAction {
  inline val DEACTIVATE: "DEACTIVATE" = "DEACTIVATE"

  inline def values: js.Array[DeviceCertificateUpdateAction] = js.Array(DEACTIVATE)
}

type DeviceDefenderIndexingMode = "OFF" | "VIOLATIONS"
object DeviceDefenderIndexingMode {
  inline val OFF: "OFF" = "OFF"
  inline val VIOLATIONS: "VIOLATIONS" = "VIOLATIONS"

  inline def values: js.Array[DeviceDefenderIndexingMode] = js.Array(OFF, VIOLATIONS)
}

type DimensionType = "TOPIC_FILTER"
object DimensionType {
  inline val TOPIC_FILTER: "TOPIC_FILTER" = "TOPIC_FILTER"

  inline def values: js.Array[DimensionType] = js.Array(TOPIC_FILTER)
}

type DimensionValueOperator = "IN" | "NOT_IN"
object DimensionValueOperator {
  inline val IN: "IN" = "IN"
  inline val NOT_IN: "NOT_IN" = "NOT_IN"

  inline def values: js.Array[DimensionValueOperator] = js.Array(IN, NOT_IN)
}

type DomainConfigurationStatus = "ENABLED" | "DISABLED"
object DomainConfigurationStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[DomainConfigurationStatus] = js.Array(ENABLED, DISABLED)
}

type DomainType = "ENDPOINT" | "AWS_MANAGED" | "CUSTOMER_MANAGED"
object DomainType {
  inline val ENDPOINT: "ENDPOINT" = "ENDPOINT"
  inline val AWS_MANAGED: "AWS_MANAGED" = "AWS_MANAGED"
  inline val CUSTOMER_MANAGED: "CUSTOMER_MANAGED" = "CUSTOMER_MANAGED"

  inline def values: js.Array[DomainType] = js.Array(ENDPOINT, AWS_MANAGED, CUSTOMER_MANAGED)
}

type DynamicGroupStatus = "ACTIVE" | "BUILDING" | "REBUILDING"
object DynamicGroupStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val BUILDING: "BUILDING" = "BUILDING"
  inline val REBUILDING: "REBUILDING" = "REBUILDING"

  inline def values: js.Array[DynamicGroupStatus] = js.Array(ACTIVE, BUILDING, REBUILDING)
}

type DynamoKeyType = "STRING" | "NUMBER"
object DynamoKeyType {
  inline val STRING: "STRING" = "STRING"
  inline val NUMBER: "NUMBER" = "NUMBER"

  inline def values: js.Array[DynamoKeyType] = js.Array(STRING, NUMBER)
}

type EventType = "THING" | "THING_GROUP" | "THING_TYPE" | "THING_GROUP_MEMBERSHIP" | "THING_GROUP_HIERARCHY" | "THING_TYPE_ASSOCIATION" | "JOB" | "JOB_EXECUTION" | "POLICY" | "CERTIFICATE" | "CA_CERTIFICATE"
object EventType {
  inline val THING: "THING" = "THING"
  inline val THING_GROUP: "THING_GROUP" = "THING_GROUP"
  inline val THING_TYPE: "THING_TYPE" = "THING_TYPE"
  inline val THING_GROUP_MEMBERSHIP: "THING_GROUP_MEMBERSHIP" = "THING_GROUP_MEMBERSHIP"
  inline val THING_GROUP_HIERARCHY: "THING_GROUP_HIERARCHY" = "THING_GROUP_HIERARCHY"
  inline val THING_TYPE_ASSOCIATION: "THING_TYPE_ASSOCIATION" = "THING_TYPE_ASSOCIATION"
  inline val JOB: "JOB" = "JOB"
  inline val JOB_EXECUTION: "JOB_EXECUTION" = "JOB_EXECUTION"
  inline val POLICY: "POLICY" = "POLICY"
  inline val CERTIFICATE: "CERTIFICATE" = "CERTIFICATE"
  inline val CA_CERTIFICATE: "CA_CERTIFICATE" = "CA_CERTIFICATE"

  inline def values: js.Array[EventType] = js.Array(THING, THING_GROUP, THING_TYPE, THING_GROUP_MEMBERSHIP, THING_GROUP_HIERARCHY, THING_TYPE_ASSOCIATION, JOB, JOB_EXECUTION, POLICY, CERTIFICATE, CA_CERTIFICATE)
}

type FieldType = "Number" | "String" | "Boolean"
object FieldType {
  inline val Number: "Number" = "Number"
  inline val String: "String" = "String"
  inline val Boolean: "Boolean" = "Boolean"

  inline def values: js.Array[FieldType] = js.Array(Number, String, Boolean)
}

type FleetMetricUnit = "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None"
object FleetMetricUnit {
  inline val Seconds: "Seconds" = "Seconds"
  inline val Microseconds: "Microseconds" = "Microseconds"
  inline val Milliseconds: "Milliseconds" = "Milliseconds"
  inline val Bytes: "Bytes" = "Bytes"
  inline val Kilobytes: "Kilobytes" = "Kilobytes"
  inline val Megabytes: "Megabytes" = "Megabytes"
  inline val Gigabytes: "Gigabytes" = "Gigabytes"
  inline val Terabytes: "Terabytes" = "Terabytes"
  inline val Bits: "Bits" = "Bits"
  inline val Kilobits: "Kilobits" = "Kilobits"
  inline val Megabits: "Megabits" = "Megabits"
  inline val Gigabits: "Gigabits" = "Gigabits"
  inline val Terabits: "Terabits" = "Terabits"
  inline val Percent: "Percent" = "Percent"
  inline val Count: "Count" = "Count"
  inline val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  inline val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  inline val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  inline val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  inline val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  inline val `Bits/Second`: "Bits/Second" = "Bits/Second"
  inline val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  inline val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  inline val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  inline val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  inline val `Count/Second`: "Count/Second" = "Count/Second"
  inline val None: "None" = "None"

  inline def values: js.Array[FleetMetricUnit] = js.Array(
    Seconds,
    Microseconds,
    Milliseconds,
    Bytes,
    Kilobytes,
    Megabytes,
    Gigabytes,
    Terabytes,
    Bits,
    Kilobits,
    Megabits,
    Gigabits,
    Terabits,
    Percent,
    Count,
    `Bytes/Second`,
    `Kilobytes/Second`,
    `Megabytes/Second`,
    `Gigabytes/Second`,
    `Terabytes/Second`,
    `Bits/Second`,
    `Kilobits/Second`,
    `Megabits/Second`,
    `Gigabits/Second`,
    `Terabits/Second`,
    `Count/Second`,
    None
  )
}

type IndexStatus = "ACTIVE" | "BUILDING" | "REBUILDING"
object IndexStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val BUILDING: "BUILDING" = "BUILDING"
  inline val REBUILDING: "REBUILDING" = "REBUILDING"

  inline def values: js.Array[IndexStatus] = js.Array(ACTIVE, BUILDING, REBUILDING)
}

type JobEndBehavior = "STOP_ROLLOUT" | "CANCEL" | "FORCE_CANCEL"
object JobEndBehavior {
  inline val STOP_ROLLOUT: "STOP_ROLLOUT" = "STOP_ROLLOUT"
  inline val CANCEL: "CANCEL" = "CANCEL"
  inline val FORCE_CANCEL: "FORCE_CANCEL" = "FORCE_CANCEL"

  inline def values: js.Array[JobEndBehavior] = js.Array(STOP_ROLLOUT, CANCEL, FORCE_CANCEL)
}

type JobExecutionFailureType = "FAILED" | "REJECTED" | "TIMED_OUT" | "ALL"
object JobExecutionFailureType {
  inline val FAILED: "FAILED" = "FAILED"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[JobExecutionFailureType] = js.Array(FAILED, REJECTED, TIMED_OUT, ALL)
}

type JobExecutionStatus = "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED"
object JobExecutionStatus {
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val REMOVED: "REMOVED" = "REMOVED"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[JobExecutionStatus] = js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
}

type JobStatus = "IN_PROGRESS" | "CANCELED" | "COMPLETED" | "DELETION_IN_PROGRESS" | "SCHEDULED"
object JobStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val DELETION_IN_PROGRESS: "DELETION_IN_PROGRESS" = "DELETION_IN_PROGRESS"
  inline val SCHEDULED: "SCHEDULED" = "SCHEDULED"

  inline def values: js.Array[JobStatus] = js.Array(IN_PROGRESS, CANCELED, COMPLETED, DELETION_IN_PROGRESS, SCHEDULED)
}

type LogLevel = "DEBUG" | "INFO" | "ERROR" | "WARN" | "DISABLED"
object LogLevel {
  inline val DEBUG: "DEBUG" = "DEBUG"
  inline val INFO: "INFO" = "INFO"
  inline val ERROR: "ERROR" = "ERROR"
  inline val WARN: "WARN" = "WARN"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[LogLevel] = js.Array(DEBUG, INFO, ERROR, WARN, DISABLED)
}

type LogTargetType = "DEFAULT" | "THING_GROUP" | "CLIENT_ID" | "SOURCE_IP" | "PRINCIPAL_ID"
object LogTargetType {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val THING_GROUP: "THING_GROUP" = "THING_GROUP"
  inline val CLIENT_ID: "CLIENT_ID" = "CLIENT_ID"
  inline val SOURCE_IP: "SOURCE_IP" = "SOURCE_IP"
  inline val PRINCIPAL_ID: "PRINCIPAL_ID" = "PRINCIPAL_ID"

  inline def values: js.Array[LogTargetType] = js.Array(DEFAULT, THING_GROUP, CLIENT_ID, SOURCE_IP, PRINCIPAL_ID)
}

type MessageFormat = "RAW" | "JSON"
object MessageFormat {
  inline val RAW: "RAW" = "RAW"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[MessageFormat] = js.Array(RAW, JSON)
}

type MitigationActionType = "UPDATE_DEVICE_CERTIFICATE" | "UPDATE_CA_CERTIFICATE" | "ADD_THINGS_TO_THING_GROUP" | "REPLACE_DEFAULT_POLICY_VERSION" | "ENABLE_IOT_LOGGING" | "PUBLISH_FINDING_TO_SNS"
object MitigationActionType {
  inline val UPDATE_DEVICE_CERTIFICATE: "UPDATE_DEVICE_CERTIFICATE" = "UPDATE_DEVICE_CERTIFICATE"
  inline val UPDATE_CA_CERTIFICATE: "UPDATE_CA_CERTIFICATE" = "UPDATE_CA_CERTIFICATE"
  inline val ADD_THINGS_TO_THING_GROUP: "ADD_THINGS_TO_THING_GROUP" = "ADD_THINGS_TO_THING_GROUP"
  inline val REPLACE_DEFAULT_POLICY_VERSION: "REPLACE_DEFAULT_POLICY_VERSION" = "REPLACE_DEFAULT_POLICY_VERSION"
  inline val ENABLE_IOT_LOGGING: "ENABLE_IOT_LOGGING" = "ENABLE_IOT_LOGGING"
  inline val PUBLISH_FINDING_TO_SNS: "PUBLISH_FINDING_TO_SNS" = "PUBLISH_FINDING_TO_SNS"

  inline def values: js.Array[MitigationActionType] = js.Array(UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE, ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION, ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS)
}

type ModelStatus = "PENDING_BUILD" | "ACTIVE" | "EXPIRED"
object ModelStatus {
  inline val PENDING_BUILD: "PENDING_BUILD" = "PENDING_BUILD"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"

  inline def values: js.Array[ModelStatus] = js.Array(PENDING_BUILD, ACTIVE, EXPIRED)
}

type NamedShadowIndexingMode = "OFF" | "ON"
object NamedShadowIndexingMode {
  inline val OFF: "OFF" = "OFF"
  inline val ON: "ON" = "ON"

  inline def values: js.Array[NamedShadowIndexingMode] = js.Array(OFF, ON)
}

type OTAUpdateStatus = "CREATE_PENDING" | "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED"
object OTAUpdateStatus {
  inline val CREATE_PENDING: "CREATE_PENDING" = "CREATE_PENDING"
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"

  inline def values: js.Array[OTAUpdateStatus] = js.Array(CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED)
}

type PolicyTemplateName = "BLANK_POLICY"
object PolicyTemplateName {
  inline val BLANK_POLICY: "BLANK_POLICY" = "BLANK_POLICY"

  inline def values: js.Array[PolicyTemplateName] = js.Array(BLANK_POLICY)
}

type Protocol = "MQTT" | "HTTP"
object Protocol {
  inline val MQTT: "MQTT" = "MQTT"
  inline val HTTP: "HTTP" = "HTTP"

  inline def values: js.Array[Protocol] = js.Array(MQTT, HTTP)
}

type ReportType = "ERRORS" | "RESULTS"
object ReportType {
  inline val ERRORS: "ERRORS" = "ERRORS"
  inline val RESULTS: "RESULTS" = "RESULTS"

  inline def values: js.Array[ReportType] = js.Array(ERRORS, RESULTS)
}

type ResourceType = "DEVICE_CERTIFICATE" | "CA_CERTIFICATE" | "IOT_POLICY" | "COGNITO_IDENTITY_POOL" | "CLIENT_ID" | "ACCOUNT_SETTINGS" | "ROLE_ALIAS" | "IAM_ROLE" | "ISSUER_CERTIFICATE"
object ResourceType {
  inline val DEVICE_CERTIFICATE: "DEVICE_CERTIFICATE" = "DEVICE_CERTIFICATE"
  inline val CA_CERTIFICATE: "CA_CERTIFICATE" = "CA_CERTIFICATE"
  inline val IOT_POLICY: "IOT_POLICY" = "IOT_POLICY"
  inline val COGNITO_IDENTITY_POOL: "COGNITO_IDENTITY_POOL" = "COGNITO_IDENTITY_POOL"
  inline val CLIENT_ID: "CLIENT_ID" = "CLIENT_ID"
  inline val ACCOUNT_SETTINGS: "ACCOUNT_SETTINGS" = "ACCOUNT_SETTINGS"
  inline val ROLE_ALIAS: "ROLE_ALIAS" = "ROLE_ALIAS"
  inline val IAM_ROLE: "IAM_ROLE" = "IAM_ROLE"
  inline val ISSUER_CERTIFICATE: "ISSUER_CERTIFICATE" = "ISSUER_CERTIFICATE"

  inline def values: js.Array[ResourceType] = js.Array(DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY, COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS, ROLE_ALIAS, IAM_ROLE, ISSUER_CERTIFICATE)
}

type RetryableFailureType = "FAILED" | "TIMED_OUT" | "ALL"
object RetryableFailureType {
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[RetryableFailureType] = js.Array(FAILED, TIMED_OUT, ALL)
}

type ServerCertificateStatus = "INVALID" | "VALID"
object ServerCertificateStatus {
  inline val INVALID: "INVALID" = "INVALID"
  inline val VALID: "VALID" = "VALID"

  inline def values: js.Array[ServerCertificateStatus] = js.Array(INVALID, VALID)
}

type ServiceType = "DATA" | "CREDENTIAL_PROVIDER" | "JOBS"
object ServiceType {
  inline val DATA: "DATA" = "DATA"
  inline val CREDENTIAL_PROVIDER: "CREDENTIAL_PROVIDER" = "CREDENTIAL_PROVIDER"
  inline val JOBS: "JOBS" = "JOBS"

  inline def values: js.Array[ServiceType] = js.Array(DATA, CREDENTIAL_PROVIDER, JOBS)
}

type Status = "InProgress" | "Completed" | "Failed" | "Cancelled" | "Cancelling"
object Status {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Cancelling: "Cancelling" = "Cancelling"

  inline def values: js.Array[Status] = js.Array(InProgress, Completed, Failed, Cancelled, Cancelling)
}

type TargetSelection = "CONTINUOUS" | "SNAPSHOT"
object TargetSelection {
  inline val CONTINUOUS: "CONTINUOUS" = "CONTINUOUS"
  inline val SNAPSHOT: "SNAPSHOT" = "SNAPSHOT"

  inline def values: js.Array[TargetSelection] = js.Array(CONTINUOUS, SNAPSHOT)
}

type TemplateType = "FLEET_PROVISIONING" | "JITP"
object TemplateType {
  inline val FLEET_PROVISIONING: "FLEET_PROVISIONING" = "FLEET_PROVISIONING"
  inline val JITP: "JITP" = "JITP"

  inline def values: js.Array[TemplateType] = js.Array(FLEET_PROVISIONING, JITP)
}

type ThingConnectivityIndexingMode = "OFF" | "STATUS"
object ThingConnectivityIndexingMode {
  inline val OFF: "OFF" = "OFF"
  inline val STATUS: "STATUS" = "STATUS"

  inline def values: js.Array[ThingConnectivityIndexingMode] = js.Array(OFF, STATUS)
}

type ThingGroupIndexingMode = "OFF" | "ON"
object ThingGroupIndexingMode {
  inline val OFF: "OFF" = "OFF"
  inline val ON: "ON" = "ON"

  inline def values: js.Array[ThingGroupIndexingMode] = js.Array(OFF, ON)
}

type ThingIndexingMode = "OFF" | "REGISTRY" | "REGISTRY_AND_SHADOW"
object ThingIndexingMode {
  inline val OFF: "OFF" = "OFF"
  inline val REGISTRY: "REGISTRY" = "REGISTRY"
  inline val REGISTRY_AND_SHADOW: "REGISTRY_AND_SHADOW" = "REGISTRY_AND_SHADOW"

  inline def values: js.Array[ThingIndexingMode] = js.Array(OFF, REGISTRY, REGISTRY_AND_SHADOW)
}

type TopicRuleDestinationStatus = "ENABLED" | "IN_PROGRESS" | "DISABLED" | "ERROR" | "DELETING"
object TopicRuleDestinationStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ERROR: "ERROR" = "ERROR"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[TopicRuleDestinationStatus] = js.Array(ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING)
}

type VerificationState = "FALSE_POSITIVE" | "BENIGN_POSITIVE" | "TRUE_POSITIVE" | "UNKNOWN"
object VerificationState {
  inline val FALSE_POSITIVE: "FALSE_POSITIVE" = "FALSE_POSITIVE"
  inline val BENIGN_POSITIVE: "BENIGN_POSITIVE" = "BENIGN_POSITIVE"
  inline val TRUE_POSITIVE: "TRUE_POSITIVE" = "TRUE_POSITIVE"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[VerificationState] = js.Array(FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE, UNKNOWN)
}

type ViolationEventType = "in-alarm" | "alarm-cleared" | "alarm-invalidated"
object ViolationEventType {
  inline val `in-alarm`: "in-alarm" = "in-alarm"
  inline val `alarm-cleared`: "alarm-cleared" = "alarm-cleared"
  inline val `alarm-invalidated`: "alarm-invalidated" = "alarm-invalidated"

  inline def values: js.Array[ViolationEventType] = js.Array(`in-alarm`, `alarm-cleared`, `alarm-invalidated`)
}
