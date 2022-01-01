package facade.amazonaws.services.es

import scalajs.js

/** Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
  */
type AutoTuneDesiredState = "ENABLED" | "DISABLED"
object AutoTuneDesiredState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AutoTuneDesiredState] = js.Array(ENABLED, DISABLED)
}

/** Specifies the Auto-Tune state for the Elasticsearch domain. For valid states see the <a href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html" target="_blank">Developer Guide</a>.
  */
type AutoTuneState = "ENABLED" | "DISABLED" | "ENABLE_IN_PROGRESS" | "DISABLE_IN_PROGRESS" | "DISABLED_AND_ROLLBACK_SCHEDULED" | "DISABLED_AND_ROLLBACK_IN_PROGRESS" | "DISABLED_AND_ROLLBACK_COMPLETE" | "DISABLED_AND_ROLLBACK_ERROR" | "ERROR"
object AutoTuneState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLE_IN_PROGRESS: "ENABLE_IN_PROGRESS" = "ENABLE_IN_PROGRESS"
  inline val DISABLE_IN_PROGRESS: "DISABLE_IN_PROGRESS" = "DISABLE_IN_PROGRESS"
  inline val DISABLED_AND_ROLLBACK_SCHEDULED: "DISABLED_AND_ROLLBACK_SCHEDULED" = "DISABLED_AND_ROLLBACK_SCHEDULED"
  inline val DISABLED_AND_ROLLBACK_IN_PROGRESS: "DISABLED_AND_ROLLBACK_IN_PROGRESS" = "DISABLED_AND_ROLLBACK_IN_PROGRESS"
  inline val DISABLED_AND_ROLLBACK_COMPLETE: "DISABLED_AND_ROLLBACK_COMPLETE" = "DISABLED_AND_ROLLBACK_COMPLETE"
  inline val DISABLED_AND_ROLLBACK_ERROR: "DISABLED_AND_ROLLBACK_ERROR" = "DISABLED_AND_ROLLBACK_ERROR"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[AutoTuneState] = js.Array(
    ENABLED,
    DISABLED,
    ENABLE_IN_PROGRESS,
    DISABLE_IN_PROGRESS,
    DISABLED_AND_ROLLBACK_SCHEDULED,
    DISABLED_AND_ROLLBACK_IN_PROGRESS,
    DISABLED_AND_ROLLBACK_COMPLETE,
    DISABLED_AND_ROLLBACK_ERROR,
    ERROR
  )
}

/** Specifies Auto-Tune type. Valid value is SCHEDULED_ACTION.
  */
type AutoTuneType = "SCHEDULED_ACTION"
object AutoTuneType {
  inline val SCHEDULED_ACTION: "SCHEDULED_ACTION" = "SCHEDULED_ACTION"

  inline def values: js.Array[AutoTuneType] = js.Array(SCHEDULED_ACTION)
}

type DeploymentStatus = "PENDING_UPDATE" | "IN_PROGRESS" | "COMPLETED" | "NOT_ELIGIBLE" | "ELIGIBLE"
object DeploymentStatus {
  inline val PENDING_UPDATE: "PENDING_UPDATE" = "PENDING_UPDATE"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val NOT_ELIGIBLE: "NOT_ELIGIBLE" = "NOT_ELIGIBLE"
  inline val ELIGIBLE: "ELIGIBLE" = "ELIGIBLE"

  inline def values: js.Array[DeploymentStatus] = js.Array(PENDING_UPDATE, IN_PROGRESS, COMPLETED, NOT_ELIGIBLE, ELIGIBLE)
}

type DescribePackagesFilterName = "PackageID" | "PackageName" | "PackageStatus"
object DescribePackagesFilterName {
  inline val PackageID: "PackageID" = "PackageID"
  inline val PackageName: "PackageName" = "PackageName"
  inline val PackageStatus: "PackageStatus" = "PackageStatus"

  inline def values: js.Array[DescribePackagesFilterName] = js.Array(PackageID, PackageName, PackageStatus)
}

type DomainPackageStatus = "ASSOCIATING" | "ASSOCIATION_FAILED" | "ACTIVE" | "DISSOCIATING" | "DISSOCIATION_FAILED"
object DomainPackageStatus {
  inline val ASSOCIATING: "ASSOCIATING" = "ASSOCIATING"
  inline val ASSOCIATION_FAILED: "ASSOCIATION_FAILED" = "ASSOCIATION_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DISSOCIATING: "DISSOCIATING" = "DISSOCIATING"
  inline val DISSOCIATION_FAILED: "DISSOCIATION_FAILED" = "DISSOCIATION_FAILED"

  inline def values: js.Array[DomainPackageStatus] = js.Array(ASSOCIATING, ASSOCIATION_FAILED, ACTIVE, DISSOCIATING, DISSOCIATION_FAILED)
}

type ESPartitionInstanceType = "m3.medium.elasticsearch" | "m3.large.elasticsearch" | "m3.xlarge.elasticsearch" | "m3.2xlarge.elasticsearch" | "m4.large.elasticsearch" | "m4.xlarge.elasticsearch" | "m4.2xlarge.elasticsearch" | "m4.4xlarge.elasticsearch" | "m4.10xlarge.elasticsearch" | "m5.large.elasticsearch" | "m5.xlarge.elasticsearch" | "m5.2xlarge.elasticsearch" | "m5.4xlarge.elasticsearch" | "m5.12xlarge.elasticsearch" | "r5.large.elasticsearch" | "r5.xlarge.elasticsearch" | "r5.2xlarge.elasticsearch" | "r5.4xlarge.elasticsearch" | "r5.12xlarge.elasticsearch" | "c5.large.elasticsearch" | "c5.xlarge.elasticsearch" | "c5.2xlarge.elasticsearch" | "c5.4xlarge.elasticsearch" | "c5.9xlarge.elasticsearch" | "c5.18xlarge.elasticsearch" | "ultrawarm1.medium.elasticsearch" | "ultrawarm1.large.elasticsearch" | "t2.micro.elasticsearch" | "t2.small.elasticsearch" | "t2.medium.elasticsearch" | "r3.large.elasticsearch" | "r3.xlarge.elasticsearch" | "r3.2xlarge.elasticsearch" |
  "r3.4xlarge.elasticsearch" | "r3.8xlarge.elasticsearch" | "i2.xlarge.elasticsearch" | "i2.2xlarge.elasticsearch" | "d2.xlarge.elasticsearch" | "d2.2xlarge.elasticsearch" | "d2.4xlarge.elasticsearch" | "d2.8xlarge.elasticsearch" | "c4.large.elasticsearch" | "c4.xlarge.elasticsearch" | "c4.2xlarge.elasticsearch" | "c4.4xlarge.elasticsearch" | "c4.8xlarge.elasticsearch" | "r4.large.elasticsearch" | "r4.xlarge.elasticsearch" | "r4.2xlarge.elasticsearch" | "r4.4xlarge.elasticsearch" | "r4.8xlarge.elasticsearch" | "r4.16xlarge.elasticsearch" | "i3.large.elasticsearch" | "i3.xlarge.elasticsearch" | "i3.2xlarge.elasticsearch" | "i3.4xlarge.elasticsearch" | "i3.8xlarge.elasticsearch" | "i3.16xlarge.elasticsearch"
object ESPartitionInstanceType {
  inline val `m3.medium.elasticsearch`: "m3.medium.elasticsearch" = "m3.medium.elasticsearch"
  inline val `m3.large.elasticsearch`: "m3.large.elasticsearch" = "m3.large.elasticsearch"
  inline val `m3.xlarge.elasticsearch`: "m3.xlarge.elasticsearch" = "m3.xlarge.elasticsearch"
  inline val `m3.2xlarge.elasticsearch`: "m3.2xlarge.elasticsearch" = "m3.2xlarge.elasticsearch"
  inline val `m4.large.elasticsearch`: "m4.large.elasticsearch" = "m4.large.elasticsearch"
  inline val `m4.xlarge.elasticsearch`: "m4.xlarge.elasticsearch" = "m4.xlarge.elasticsearch"
  inline val `m4.2xlarge.elasticsearch`: "m4.2xlarge.elasticsearch" = "m4.2xlarge.elasticsearch"
  inline val `m4.4xlarge.elasticsearch`: "m4.4xlarge.elasticsearch" = "m4.4xlarge.elasticsearch"
  inline val `m4.10xlarge.elasticsearch`: "m4.10xlarge.elasticsearch" = "m4.10xlarge.elasticsearch"
  inline val `m5.large.elasticsearch`: "m5.large.elasticsearch" = "m5.large.elasticsearch"
  inline val `m5.xlarge.elasticsearch`: "m5.xlarge.elasticsearch" = "m5.xlarge.elasticsearch"
  inline val `m5.2xlarge.elasticsearch`: "m5.2xlarge.elasticsearch" = "m5.2xlarge.elasticsearch"
  inline val `m5.4xlarge.elasticsearch`: "m5.4xlarge.elasticsearch" = "m5.4xlarge.elasticsearch"
  inline val `m5.12xlarge.elasticsearch`: "m5.12xlarge.elasticsearch" = "m5.12xlarge.elasticsearch"
  inline val `r5.large.elasticsearch`: "r5.large.elasticsearch" = "r5.large.elasticsearch"
  inline val `r5.xlarge.elasticsearch`: "r5.xlarge.elasticsearch" = "r5.xlarge.elasticsearch"
  inline val `r5.2xlarge.elasticsearch`: "r5.2xlarge.elasticsearch" = "r5.2xlarge.elasticsearch"
  inline val `r5.4xlarge.elasticsearch`: "r5.4xlarge.elasticsearch" = "r5.4xlarge.elasticsearch"
  inline val `r5.12xlarge.elasticsearch`: "r5.12xlarge.elasticsearch" = "r5.12xlarge.elasticsearch"
  inline val `c5.large.elasticsearch`: "c5.large.elasticsearch" = "c5.large.elasticsearch"
  inline val `c5.xlarge.elasticsearch`: "c5.xlarge.elasticsearch" = "c5.xlarge.elasticsearch"
  inline val `c5.2xlarge.elasticsearch`: "c5.2xlarge.elasticsearch" = "c5.2xlarge.elasticsearch"
  inline val `c5.4xlarge.elasticsearch`: "c5.4xlarge.elasticsearch" = "c5.4xlarge.elasticsearch"
  inline val `c5.9xlarge.elasticsearch`: "c5.9xlarge.elasticsearch" = "c5.9xlarge.elasticsearch"
  inline val `c5.18xlarge.elasticsearch`: "c5.18xlarge.elasticsearch" = "c5.18xlarge.elasticsearch"
  inline val `ultrawarm1.medium.elasticsearch`: "ultrawarm1.medium.elasticsearch" = "ultrawarm1.medium.elasticsearch"
  inline val `ultrawarm1.large.elasticsearch`: "ultrawarm1.large.elasticsearch" = "ultrawarm1.large.elasticsearch"
  inline val `t2.micro.elasticsearch`: "t2.micro.elasticsearch" = "t2.micro.elasticsearch"
  inline val `t2.small.elasticsearch`: "t2.small.elasticsearch" = "t2.small.elasticsearch"
  inline val `t2.medium.elasticsearch`: "t2.medium.elasticsearch" = "t2.medium.elasticsearch"
  inline val `r3.large.elasticsearch`: "r3.large.elasticsearch" = "r3.large.elasticsearch"
  inline val `r3.xlarge.elasticsearch`: "r3.xlarge.elasticsearch" = "r3.xlarge.elasticsearch"
  inline val `r3.2xlarge.elasticsearch`: "r3.2xlarge.elasticsearch" = "r3.2xlarge.elasticsearch"
  inline val `r3.4xlarge.elasticsearch`: "r3.4xlarge.elasticsearch" = "r3.4xlarge.elasticsearch"
  inline val `r3.8xlarge.elasticsearch`: "r3.8xlarge.elasticsearch" = "r3.8xlarge.elasticsearch"
  inline val `i2.xlarge.elasticsearch`: "i2.xlarge.elasticsearch" = "i2.xlarge.elasticsearch"
  inline val `i2.2xlarge.elasticsearch`: "i2.2xlarge.elasticsearch" = "i2.2xlarge.elasticsearch"
  inline val `d2.xlarge.elasticsearch`: "d2.xlarge.elasticsearch" = "d2.xlarge.elasticsearch"
  inline val `d2.2xlarge.elasticsearch`: "d2.2xlarge.elasticsearch" = "d2.2xlarge.elasticsearch"
  inline val `d2.4xlarge.elasticsearch`: "d2.4xlarge.elasticsearch" = "d2.4xlarge.elasticsearch"
  inline val `d2.8xlarge.elasticsearch`: "d2.8xlarge.elasticsearch" = "d2.8xlarge.elasticsearch"
  inline val `c4.large.elasticsearch`: "c4.large.elasticsearch" = "c4.large.elasticsearch"
  inline val `c4.xlarge.elasticsearch`: "c4.xlarge.elasticsearch" = "c4.xlarge.elasticsearch"
  inline val `c4.2xlarge.elasticsearch`: "c4.2xlarge.elasticsearch" = "c4.2xlarge.elasticsearch"
  inline val `c4.4xlarge.elasticsearch`: "c4.4xlarge.elasticsearch" = "c4.4xlarge.elasticsearch"
  inline val `c4.8xlarge.elasticsearch`: "c4.8xlarge.elasticsearch" = "c4.8xlarge.elasticsearch"
  inline val `r4.large.elasticsearch`: "r4.large.elasticsearch" = "r4.large.elasticsearch"
  inline val `r4.xlarge.elasticsearch`: "r4.xlarge.elasticsearch" = "r4.xlarge.elasticsearch"
  inline val `r4.2xlarge.elasticsearch`: "r4.2xlarge.elasticsearch" = "r4.2xlarge.elasticsearch"
  inline val `r4.4xlarge.elasticsearch`: "r4.4xlarge.elasticsearch" = "r4.4xlarge.elasticsearch"
  inline val `r4.8xlarge.elasticsearch`: "r4.8xlarge.elasticsearch" = "r4.8xlarge.elasticsearch"
  inline val `r4.16xlarge.elasticsearch`: "r4.16xlarge.elasticsearch" = "r4.16xlarge.elasticsearch"
  inline val `i3.large.elasticsearch`: "i3.large.elasticsearch" = "i3.large.elasticsearch"
  inline val `i3.xlarge.elasticsearch`: "i3.xlarge.elasticsearch" = "i3.xlarge.elasticsearch"
  inline val `i3.2xlarge.elasticsearch`: "i3.2xlarge.elasticsearch" = "i3.2xlarge.elasticsearch"
  inline val `i3.4xlarge.elasticsearch`: "i3.4xlarge.elasticsearch" = "i3.4xlarge.elasticsearch"
  inline val `i3.8xlarge.elasticsearch`: "i3.8xlarge.elasticsearch" = "i3.8xlarge.elasticsearch"
  inline val `i3.16xlarge.elasticsearch`: "i3.16xlarge.elasticsearch" = "i3.16xlarge.elasticsearch"

  inline def values: js.Array[ESPartitionInstanceType] = js.Array(
    `m3.medium.elasticsearch`,
    `m3.large.elasticsearch`,
    `m3.xlarge.elasticsearch`,
    `m3.2xlarge.elasticsearch`,
    `m4.large.elasticsearch`,
    `m4.xlarge.elasticsearch`,
    `m4.2xlarge.elasticsearch`,
    `m4.4xlarge.elasticsearch`,
    `m4.10xlarge.elasticsearch`,
    `m5.large.elasticsearch`,
    `m5.xlarge.elasticsearch`,
    `m5.2xlarge.elasticsearch`,
    `m5.4xlarge.elasticsearch`,
    `m5.12xlarge.elasticsearch`,
    `r5.large.elasticsearch`,
    `r5.xlarge.elasticsearch`,
    `r5.2xlarge.elasticsearch`,
    `r5.4xlarge.elasticsearch`,
    `r5.12xlarge.elasticsearch`,
    `c5.large.elasticsearch`,
    `c5.xlarge.elasticsearch`,
    `c5.2xlarge.elasticsearch`,
    `c5.4xlarge.elasticsearch`,
    `c5.9xlarge.elasticsearch`,
    `c5.18xlarge.elasticsearch`,
    `ultrawarm1.medium.elasticsearch`,
    `ultrawarm1.large.elasticsearch`,
    `t2.micro.elasticsearch`,
    `t2.small.elasticsearch`,
    `t2.medium.elasticsearch`,
    `r3.large.elasticsearch`,
    `r3.xlarge.elasticsearch`,
    `r3.2xlarge.elasticsearch`,
    `r3.4xlarge.elasticsearch`,
    `r3.8xlarge.elasticsearch`,
    `i2.xlarge.elasticsearch`,
    `i2.2xlarge.elasticsearch`,
    `d2.xlarge.elasticsearch`,
    `d2.2xlarge.elasticsearch`,
    `d2.4xlarge.elasticsearch`,
    `d2.8xlarge.elasticsearch`,
    `c4.large.elasticsearch`,
    `c4.xlarge.elasticsearch`,
    `c4.2xlarge.elasticsearch`,
    `c4.4xlarge.elasticsearch`,
    `c4.8xlarge.elasticsearch`,
    `r4.large.elasticsearch`,
    `r4.xlarge.elasticsearch`,
    `r4.2xlarge.elasticsearch`,
    `r4.4xlarge.elasticsearch`,
    `r4.8xlarge.elasticsearch`,
    `r4.16xlarge.elasticsearch`,
    `i3.large.elasticsearch`,
    `i3.xlarge.elasticsearch`,
    `i3.2xlarge.elasticsearch`,
    `i3.4xlarge.elasticsearch`,
    `i3.8xlarge.elasticsearch`,
    `i3.16xlarge.elasticsearch`
  )
}

type ESWarmPartitionInstanceType = "ultrawarm1.medium.elasticsearch" | "ultrawarm1.large.elasticsearch"
object ESWarmPartitionInstanceType {
  inline val `ultrawarm1.medium.elasticsearch`: "ultrawarm1.medium.elasticsearch" = "ultrawarm1.medium.elasticsearch"
  inline val `ultrawarm1.large.elasticsearch`: "ultrawarm1.large.elasticsearch" = "ultrawarm1.large.elasticsearch"

  inline def values: js.Array[ESWarmPartitionInstanceType] = js.Array(`ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch`)
}

type EngineType = "OpenSearch" | "Elasticsearch"
object EngineType {
  inline val OpenSearch: "OpenSearch" = "OpenSearch"
  inline val Elasticsearch: "Elasticsearch" = "Elasticsearch"

  inline def values: js.Array[EngineType] = js.Array(OpenSearch, Elasticsearch)
}

type InboundCrossClusterSearchConnectionStatusCode = "PENDING_ACCEPTANCE" | "APPROVED" | "REJECTING" | "REJECTED" | "DELETING" | "DELETED"
object InboundCrossClusterSearchConnectionStatusCode {
  inline val PENDING_ACCEPTANCE: "PENDING_ACCEPTANCE" = "PENDING_ACCEPTANCE"
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val REJECTING: "REJECTING" = "REJECTING"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[InboundCrossClusterSearchConnectionStatusCode] = js.Array(PENDING_ACCEPTANCE, APPROVED, REJECTING, REJECTED, DELETING, DELETED)
}

/** <p>Type of Log File, it can be one of the following:* INDEX_SLOW_LOGS: Index slow logs contain insert requests that took more time than configured index query log threshold to execute. * SEARCH_SLOW_LOGS: Search slow logs contain search queries that took more time than configured search query log threshold to execute. * ES_APPLICATION_LOGS: Elasticsearch application logs contain information about errors and warnings raised during the operation of the service and can be useful for troubleshooting. * AUDIT_LOGS: Audit logs contain records of user requests for access from the domain. </p>
  */
type LogType = "INDEX_SLOW_LOGS" | "SEARCH_SLOW_LOGS" | "ES_APPLICATION_LOGS" | "AUDIT_LOGS"
object LogType {
  inline val INDEX_SLOW_LOGS: "INDEX_SLOW_LOGS" = "INDEX_SLOW_LOGS"
  inline val SEARCH_SLOW_LOGS: "SEARCH_SLOW_LOGS" = "SEARCH_SLOW_LOGS"
  inline val ES_APPLICATION_LOGS: "ES_APPLICATION_LOGS" = "ES_APPLICATION_LOGS"
  inline val AUDIT_LOGS: "AUDIT_LOGS" = "AUDIT_LOGS"

  inline def values: js.Array[LogType] = js.Array(INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS, AUDIT_LOGS)
}

/** The state of a requested change. One of the following: * Processing: The request change is still in-process. * Active: The request change is processed and deployed to the Elasticsearch domain.
  */
type OptionState = "RequiresIndexDocuments" | "Processing" | "Active"
object OptionState {
  inline val RequiresIndexDocuments: "RequiresIndexDocuments" = "RequiresIndexDocuments"
  inline val Processing: "Processing" = "Processing"
  inline val Active: "Active" = "Active"

  inline def values: js.Array[OptionState] = js.Array(RequiresIndexDocuments, Processing, Active)
}

type OutboundCrossClusterSearchConnectionStatusCode = "PENDING_ACCEPTANCE" | "VALIDATING" | "VALIDATION_FAILED" | "PROVISIONING" | "ACTIVE" | "REJECTED" | "DELETING" | "DELETED"
object OutboundCrossClusterSearchConnectionStatusCode {
  inline val PENDING_ACCEPTANCE: "PENDING_ACCEPTANCE" = "PENDING_ACCEPTANCE"
  inline val VALIDATING: "VALIDATING" = "VALIDATING"
  inline val VALIDATION_FAILED: "VALIDATION_FAILED" = "VALIDATION_FAILED"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[OutboundCrossClusterSearchConnectionStatusCode] = js.Array(PENDING_ACCEPTANCE, VALIDATING, VALIDATION_FAILED, PROVISIONING, ACTIVE, REJECTED, DELETING, DELETED)
}

type PackageStatus = "COPYING" | "COPY_FAILED" | "VALIDATING" | "VALIDATION_FAILED" | "AVAILABLE" | "DELETING" | "DELETED" | "DELETE_FAILED"
object PackageStatus {
  inline val COPYING: "COPYING" = "COPYING"
  inline val COPY_FAILED: "COPY_FAILED" = "COPY_FAILED"
  inline val VALIDATING: "VALIDATING" = "VALIDATING"
  inline val VALIDATION_FAILED: "VALIDATION_FAILED" = "VALIDATION_FAILED"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[PackageStatus] = js.Array(COPYING, COPY_FAILED, VALIDATING, VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED)
}

type PackageType = "TXT-DICTIONARY"
object PackageType {
  inline val `TXT-DICTIONARY`: "TXT-DICTIONARY" = "TXT-DICTIONARY"

  inline def values: js.Array[PackageType] = js.Array(`TXT-DICTIONARY`)
}

type ReservedElasticsearchInstancePaymentOption = "ALL_UPFRONT" | "PARTIAL_UPFRONT" | "NO_UPFRONT"
object ReservedElasticsearchInstancePaymentOption {
  inline val ALL_UPFRONT: "ALL_UPFRONT" = "ALL_UPFRONT"
  inline val PARTIAL_UPFRONT: "PARTIAL_UPFRONT" = "PARTIAL_UPFRONT"
  inline val NO_UPFRONT: "NO_UPFRONT" = "NO_UPFRONT"

  inline def values: js.Array[ReservedElasticsearchInstancePaymentOption] = js.Array(ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT)
}

/** Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK, DEFAULT_ROLLBACK.
  */
type RollbackOnDisable = "NO_ROLLBACK" | "DEFAULT_ROLLBACK"
object RollbackOnDisable {
  inline val NO_ROLLBACK: "NO_ROLLBACK" = "NO_ROLLBACK"
  inline val DEFAULT_ROLLBACK: "DEFAULT_ROLLBACK" = "DEFAULT_ROLLBACK"

  inline def values: js.Array[RollbackOnDisable] = js.Array(NO_ROLLBACK, DEFAULT_ROLLBACK)
}

/** Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
  */
type ScheduledAutoTuneActionType = "JVM_HEAP_SIZE_TUNING" | "JVM_YOUNG_GEN_TUNING"
object ScheduledAutoTuneActionType {
  inline val JVM_HEAP_SIZE_TUNING: "JVM_HEAP_SIZE_TUNING" = "JVM_HEAP_SIZE_TUNING"
  inline val JVM_YOUNG_GEN_TUNING: "JVM_YOUNG_GEN_TUNING" = "JVM_YOUNG_GEN_TUNING"

  inline def values: js.Array[ScheduledAutoTuneActionType] = js.Array(JVM_HEAP_SIZE_TUNING, JVM_YOUNG_GEN_TUNING)
}

/** Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
  */
type ScheduledAutoTuneSeverityType = "LOW" | "MEDIUM" | "HIGH"
object ScheduledAutoTuneSeverityType {
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[ScheduledAutoTuneSeverityType] = js.Array(LOW, MEDIUM, HIGH)
}

type TLSSecurityPolicy = "Policy-Min-TLS-1-0-2019-07" | "Policy-Min-TLS-1-2-2019-07"
object TLSSecurityPolicy {
  inline val `Policy-Min-TLS-1-0-2019-07`: "Policy-Min-TLS-1-0-2019-07" = "Policy-Min-TLS-1-0-2019-07"
  inline val `Policy-Min-TLS-1-2-2019-07`: "Policy-Min-TLS-1-2-2019-07" = "Policy-Min-TLS-1-2-2019-07"

  inline def values: js.Array[TLSSecurityPolicy] = js.Array(`Policy-Min-TLS-1-0-2019-07`, `Policy-Min-TLS-1-2-2019-07`)
}

/** Specifies the unit of a maintenance schedule duration. Valid value is HOUR. See the <a href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html" target="_blank">Developer Guide</a> for more information.
  */
type TimeUnit = "HOURS"
object TimeUnit {
  inline val HOURS: "HOURS" = "HOURS"

  inline def values: js.Array[TimeUnit] = js.Array(HOURS)
}

type UpgradeStatus = "IN_PROGRESS" | "SUCCEEDED" | "SUCCEEDED_WITH_ISSUES" | "FAILED"
object UpgradeStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val SUCCEEDED_WITH_ISSUES: "SUCCEEDED_WITH_ISSUES" = "SUCCEEDED_WITH_ISSUES"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[UpgradeStatus] = js.Array(IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES, FAILED)
}

type UpgradeStep = "PRE_UPGRADE_CHECK" | "SNAPSHOT" | "UPGRADE"
object UpgradeStep {
  inline val PRE_UPGRADE_CHECK: "PRE_UPGRADE_CHECK" = "PRE_UPGRADE_CHECK"
  inline val SNAPSHOT: "SNAPSHOT" = "SNAPSHOT"
  inline val UPGRADE: "UPGRADE" = "UPGRADE"

  inline def values: js.Array[UpgradeStep] = js.Array(PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE)
}

/** The type of EBS volume, standard, gp2, or io1. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank">Configuring EBS-based Storage</a>for more information.
  */
type VolumeType = "standard" | "gp2" | "io1"
object VolumeType {
  inline val standard: "standard" = "standard"
  inline val gp2: "gp2" = "gp2"
  inline val io1: "io1" = "io1"

  inline def values: js.Array[VolumeType] = js.Array(standard, gp2, io1)
}
