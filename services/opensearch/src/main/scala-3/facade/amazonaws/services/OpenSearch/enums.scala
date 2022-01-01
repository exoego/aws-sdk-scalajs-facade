package facade.amazonaws.services.opensearch

import scalajs.js

/** The Auto-Tune desired state. Valid values are ENABLED and DISABLED.
  */
type AutoTuneDesiredState = "ENABLED" | "DISABLED"
object AutoTuneDesiredState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AutoTuneDesiredState] = js.Array(ENABLED, DISABLED)
}

/** The Auto-Tune state for the domain. For valid states see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank"> Auto-Tune for Amazon OpenSearch Service</a>.
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

/** Specifies the Auto-Tune type. Valid value is SCHEDULED_ACTION.
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

type EngineType = "OpenSearch" | "Elasticsearch"
object EngineType {
  inline val OpenSearch: "OpenSearch" = "OpenSearch"
  inline val Elasticsearch: "Elasticsearch" = "Elasticsearch"

  inline def values: js.Array[EngineType] = js.Array(OpenSearch, Elasticsearch)
}

type InboundConnectionStatusCode = "PENDING_ACCEPTANCE" | "APPROVED" | "PROVISIONING" | "ACTIVE" | "REJECTING" | "REJECTED" | "DELETING" | "DELETED"
object InboundConnectionStatusCode {
  inline val PENDING_ACCEPTANCE: "PENDING_ACCEPTANCE" = "PENDING_ACCEPTANCE"
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val REJECTING: "REJECTING" = "REJECTING"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[InboundConnectionStatusCode] = js.Array(PENDING_ACCEPTANCE, APPROVED, PROVISIONING, ACTIVE, REJECTING, REJECTED, DELETING, DELETED)
}

/** <p>Type of log file. Can be one of the following:* INDEX_SLOW_LOGS: Index slow logs contain insert requests that took more time than configured index query log threshold to execute. * SEARCH_SLOW_LOGS: Search slow logs contain search queries that took more time than configured search query log threshold to execute. * ES_APPLICATION_LOGS: OpenSearch application logs contain information about errors and warnings raised during the operation of the service and can be useful for troubleshooting. * AUDIT_LOGS: Audit logs contain records of user requests for access from the domain. </p>
  */
type LogType = "INDEX_SLOW_LOGS" | "SEARCH_SLOW_LOGS" | "ES_APPLICATION_LOGS" | "AUDIT_LOGS"
object LogType {
  inline val INDEX_SLOW_LOGS: "INDEX_SLOW_LOGS" = "INDEX_SLOW_LOGS"
  inline val SEARCH_SLOW_LOGS: "SEARCH_SLOW_LOGS" = "SEARCH_SLOW_LOGS"
  inline val ES_APPLICATION_LOGS: "ES_APPLICATION_LOGS" = "ES_APPLICATION_LOGS"
  inline val AUDIT_LOGS: "AUDIT_LOGS" = "AUDIT_LOGS"

  inline def values: js.Array[LogType] = js.Array(INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS, AUDIT_LOGS)
}

type OpenSearchPartitionInstanceType = "m3.medium.search" | "m3.large.search" | "m3.xlarge.search" | "m3.2xlarge.search" | "m4.large.search" | "m4.xlarge.search" | "m4.2xlarge.search" | "m4.4xlarge.search" | "m4.10xlarge.search" | "m5.large.search" | "m5.xlarge.search" | "m5.2xlarge.search" | "m5.4xlarge.search" | "m5.12xlarge.search" | "m5.24xlarge.search" | "r5.large.search" | "r5.xlarge.search" | "r5.2xlarge.search" | "r5.4xlarge.search" | "r5.12xlarge.search" | "r5.24xlarge.search" | "c5.large.search" | "c5.xlarge.search" | "c5.2xlarge.search" | "c5.4xlarge.search" | "c5.9xlarge.search" | "c5.18xlarge.search" | "t3.nano.search" | "t3.micro.search" | "t3.small.search" | "t3.medium.search" | "t3.large.search" | "t3.xlarge.search" | "t3.2xlarge.search" | "ultrawarm1.medium.search" | "ultrawarm1.large.search" | "ultrawarm1.xlarge.search" | "t2.micro.search" | "t2.small.search" | "t2.medium.search" | "r3.large.search" | "r3.xlarge.search" | "r3.2xlarge.search" | "r3.4xlarge.search" |
  "r3.8xlarge.search" | "i2.xlarge.search" | "i2.2xlarge.search" | "d2.xlarge.search" | "d2.2xlarge.search" | "d2.4xlarge.search" | "d2.8xlarge.search" | "c4.large.search" | "c4.xlarge.search" | "c4.2xlarge.search" | "c4.4xlarge.search" | "c4.8xlarge.search" | "r4.large.search" | "r4.xlarge.search" | "r4.2xlarge.search" | "r4.4xlarge.search" | "r4.8xlarge.search" | "r4.16xlarge.search" | "i3.large.search" | "i3.xlarge.search" | "i3.2xlarge.search" | "i3.4xlarge.search" | "i3.8xlarge.search" | "i3.16xlarge.search" | "r6g.large.search" | "r6g.xlarge.search" | "r6g.2xlarge.search" | "r6g.4xlarge.search" | "r6g.8xlarge.search" | "r6g.12xlarge.search" | "m6g.large.search" | "m6g.xlarge.search" | "m6g.2xlarge.search" | "m6g.4xlarge.search" | "m6g.8xlarge.search" | "m6g.12xlarge.search" | "c6g.large.search" | "c6g.xlarge.search" | "c6g.2xlarge.search" | "c6g.4xlarge.search" | "c6g.8xlarge.search" | "c6g.12xlarge.search" | "r6gd.large.search" | "r6gd.xlarge.search" | "r6gd.2xlarge.search" |
  "r6gd.4xlarge.search" | "r6gd.8xlarge.search" | "r6gd.12xlarge.search" | "r6gd.16xlarge.search" | "t4g.small.search" | "t4g.medium.search"
object OpenSearchPartitionInstanceType {
  inline val `m3.medium.search`: "m3.medium.search" = "m3.medium.search"
  inline val `m3.large.search`: "m3.large.search" = "m3.large.search"
  inline val `m3.xlarge.search`: "m3.xlarge.search" = "m3.xlarge.search"
  inline val `m3.2xlarge.search`: "m3.2xlarge.search" = "m3.2xlarge.search"
  inline val `m4.large.search`: "m4.large.search" = "m4.large.search"
  inline val `m4.xlarge.search`: "m4.xlarge.search" = "m4.xlarge.search"
  inline val `m4.2xlarge.search`: "m4.2xlarge.search" = "m4.2xlarge.search"
  inline val `m4.4xlarge.search`: "m4.4xlarge.search" = "m4.4xlarge.search"
  inline val `m4.10xlarge.search`: "m4.10xlarge.search" = "m4.10xlarge.search"
  inline val `m5.large.search`: "m5.large.search" = "m5.large.search"
  inline val `m5.xlarge.search`: "m5.xlarge.search" = "m5.xlarge.search"
  inline val `m5.2xlarge.search`: "m5.2xlarge.search" = "m5.2xlarge.search"
  inline val `m5.4xlarge.search`: "m5.4xlarge.search" = "m5.4xlarge.search"
  inline val `m5.12xlarge.search`: "m5.12xlarge.search" = "m5.12xlarge.search"
  inline val `m5.24xlarge.search`: "m5.24xlarge.search" = "m5.24xlarge.search"
  inline val `r5.large.search`: "r5.large.search" = "r5.large.search"
  inline val `r5.xlarge.search`: "r5.xlarge.search" = "r5.xlarge.search"
  inline val `r5.2xlarge.search`: "r5.2xlarge.search" = "r5.2xlarge.search"
  inline val `r5.4xlarge.search`: "r5.4xlarge.search" = "r5.4xlarge.search"
  inline val `r5.12xlarge.search`: "r5.12xlarge.search" = "r5.12xlarge.search"
  inline val `r5.24xlarge.search`: "r5.24xlarge.search" = "r5.24xlarge.search"
  inline val `c5.large.search`: "c5.large.search" = "c5.large.search"
  inline val `c5.xlarge.search`: "c5.xlarge.search" = "c5.xlarge.search"
  inline val `c5.2xlarge.search`: "c5.2xlarge.search" = "c5.2xlarge.search"
  inline val `c5.4xlarge.search`: "c5.4xlarge.search" = "c5.4xlarge.search"
  inline val `c5.9xlarge.search`: "c5.9xlarge.search" = "c5.9xlarge.search"
  inline val `c5.18xlarge.search`: "c5.18xlarge.search" = "c5.18xlarge.search"
  inline val `t3.nano.search`: "t3.nano.search" = "t3.nano.search"
  inline val `t3.micro.search`: "t3.micro.search" = "t3.micro.search"
  inline val `t3.small.search`: "t3.small.search" = "t3.small.search"
  inline val `t3.medium.search`: "t3.medium.search" = "t3.medium.search"
  inline val `t3.large.search`: "t3.large.search" = "t3.large.search"
  inline val `t3.xlarge.search`: "t3.xlarge.search" = "t3.xlarge.search"
  inline val `t3.2xlarge.search`: "t3.2xlarge.search" = "t3.2xlarge.search"
  inline val `ultrawarm1.medium.search`: "ultrawarm1.medium.search" = "ultrawarm1.medium.search"
  inline val `ultrawarm1.large.search`: "ultrawarm1.large.search" = "ultrawarm1.large.search"
  inline val `ultrawarm1.xlarge.search`: "ultrawarm1.xlarge.search" = "ultrawarm1.xlarge.search"
  inline val `t2.micro.search`: "t2.micro.search" = "t2.micro.search"
  inline val `t2.small.search`: "t2.small.search" = "t2.small.search"
  inline val `t2.medium.search`: "t2.medium.search" = "t2.medium.search"
  inline val `r3.large.search`: "r3.large.search" = "r3.large.search"
  inline val `r3.xlarge.search`: "r3.xlarge.search" = "r3.xlarge.search"
  inline val `r3.2xlarge.search`: "r3.2xlarge.search" = "r3.2xlarge.search"
  inline val `r3.4xlarge.search`: "r3.4xlarge.search" = "r3.4xlarge.search"
  inline val `r3.8xlarge.search`: "r3.8xlarge.search" = "r3.8xlarge.search"
  inline val `i2.xlarge.search`: "i2.xlarge.search" = "i2.xlarge.search"
  inline val `i2.2xlarge.search`: "i2.2xlarge.search" = "i2.2xlarge.search"
  inline val `d2.xlarge.search`: "d2.xlarge.search" = "d2.xlarge.search"
  inline val `d2.2xlarge.search`: "d2.2xlarge.search" = "d2.2xlarge.search"
  inline val `d2.4xlarge.search`: "d2.4xlarge.search" = "d2.4xlarge.search"
  inline val `d2.8xlarge.search`: "d2.8xlarge.search" = "d2.8xlarge.search"
  inline val `c4.large.search`: "c4.large.search" = "c4.large.search"
  inline val `c4.xlarge.search`: "c4.xlarge.search" = "c4.xlarge.search"
  inline val `c4.2xlarge.search`: "c4.2xlarge.search" = "c4.2xlarge.search"
  inline val `c4.4xlarge.search`: "c4.4xlarge.search" = "c4.4xlarge.search"
  inline val `c4.8xlarge.search`: "c4.8xlarge.search" = "c4.8xlarge.search"
  inline val `r4.large.search`: "r4.large.search" = "r4.large.search"
  inline val `r4.xlarge.search`: "r4.xlarge.search" = "r4.xlarge.search"
  inline val `r4.2xlarge.search`: "r4.2xlarge.search" = "r4.2xlarge.search"
  inline val `r4.4xlarge.search`: "r4.4xlarge.search" = "r4.4xlarge.search"
  inline val `r4.8xlarge.search`: "r4.8xlarge.search" = "r4.8xlarge.search"
  inline val `r4.16xlarge.search`: "r4.16xlarge.search" = "r4.16xlarge.search"
  inline val `i3.large.search`: "i3.large.search" = "i3.large.search"
  inline val `i3.xlarge.search`: "i3.xlarge.search" = "i3.xlarge.search"
  inline val `i3.2xlarge.search`: "i3.2xlarge.search" = "i3.2xlarge.search"
  inline val `i3.4xlarge.search`: "i3.4xlarge.search" = "i3.4xlarge.search"
  inline val `i3.8xlarge.search`: "i3.8xlarge.search" = "i3.8xlarge.search"
  inline val `i3.16xlarge.search`: "i3.16xlarge.search" = "i3.16xlarge.search"
  inline val `r6g.large.search`: "r6g.large.search" = "r6g.large.search"
  inline val `r6g.xlarge.search`: "r6g.xlarge.search" = "r6g.xlarge.search"
  inline val `r6g.2xlarge.search`: "r6g.2xlarge.search" = "r6g.2xlarge.search"
  inline val `r6g.4xlarge.search`: "r6g.4xlarge.search" = "r6g.4xlarge.search"
  inline val `r6g.8xlarge.search`: "r6g.8xlarge.search" = "r6g.8xlarge.search"
  inline val `r6g.12xlarge.search`: "r6g.12xlarge.search" = "r6g.12xlarge.search"
  inline val `m6g.large.search`: "m6g.large.search" = "m6g.large.search"
  inline val `m6g.xlarge.search`: "m6g.xlarge.search" = "m6g.xlarge.search"
  inline val `m6g.2xlarge.search`: "m6g.2xlarge.search" = "m6g.2xlarge.search"
  inline val `m6g.4xlarge.search`: "m6g.4xlarge.search" = "m6g.4xlarge.search"
  inline val `m6g.8xlarge.search`: "m6g.8xlarge.search" = "m6g.8xlarge.search"
  inline val `m6g.12xlarge.search`: "m6g.12xlarge.search" = "m6g.12xlarge.search"
  inline val `c6g.large.search`: "c6g.large.search" = "c6g.large.search"
  inline val `c6g.xlarge.search`: "c6g.xlarge.search" = "c6g.xlarge.search"
  inline val `c6g.2xlarge.search`: "c6g.2xlarge.search" = "c6g.2xlarge.search"
  inline val `c6g.4xlarge.search`: "c6g.4xlarge.search" = "c6g.4xlarge.search"
  inline val `c6g.8xlarge.search`: "c6g.8xlarge.search" = "c6g.8xlarge.search"
  inline val `c6g.12xlarge.search`: "c6g.12xlarge.search" = "c6g.12xlarge.search"
  inline val `r6gd.large.search`: "r6gd.large.search" = "r6gd.large.search"
  inline val `r6gd.xlarge.search`: "r6gd.xlarge.search" = "r6gd.xlarge.search"
  inline val `r6gd.2xlarge.search`: "r6gd.2xlarge.search" = "r6gd.2xlarge.search"
  inline val `r6gd.4xlarge.search`: "r6gd.4xlarge.search" = "r6gd.4xlarge.search"
  inline val `r6gd.8xlarge.search`: "r6gd.8xlarge.search" = "r6gd.8xlarge.search"
  inline val `r6gd.12xlarge.search`: "r6gd.12xlarge.search" = "r6gd.12xlarge.search"
  inline val `r6gd.16xlarge.search`: "r6gd.16xlarge.search" = "r6gd.16xlarge.search"
  inline val `t4g.small.search`: "t4g.small.search" = "t4g.small.search"
  inline val `t4g.medium.search`: "t4g.medium.search" = "t4g.medium.search"

  inline def values: js.Array[OpenSearchPartitionInstanceType] = js.Array(
    `m3.medium.search`,
    `m3.large.search`,
    `m3.xlarge.search`,
    `m3.2xlarge.search`,
    `m4.large.search`,
    `m4.xlarge.search`,
    `m4.2xlarge.search`,
    `m4.4xlarge.search`,
    `m4.10xlarge.search`,
    `m5.large.search`,
    `m5.xlarge.search`,
    `m5.2xlarge.search`,
    `m5.4xlarge.search`,
    `m5.12xlarge.search`,
    `m5.24xlarge.search`,
    `r5.large.search`,
    `r5.xlarge.search`,
    `r5.2xlarge.search`,
    `r5.4xlarge.search`,
    `r5.12xlarge.search`,
    `r5.24xlarge.search`,
    `c5.large.search`,
    `c5.xlarge.search`,
    `c5.2xlarge.search`,
    `c5.4xlarge.search`,
    `c5.9xlarge.search`,
    `c5.18xlarge.search`,
    `t3.nano.search`,
    `t3.micro.search`,
    `t3.small.search`,
    `t3.medium.search`,
    `t3.large.search`,
    `t3.xlarge.search`,
    `t3.2xlarge.search`,
    `ultrawarm1.medium.search`,
    `ultrawarm1.large.search`,
    `ultrawarm1.xlarge.search`,
    `t2.micro.search`,
    `t2.small.search`,
    `t2.medium.search`,
    `r3.large.search`,
    `r3.xlarge.search`,
    `r3.2xlarge.search`,
    `r3.4xlarge.search`,
    `r3.8xlarge.search`,
    `i2.xlarge.search`,
    `i2.2xlarge.search`,
    `d2.xlarge.search`,
    `d2.2xlarge.search`,
    `d2.4xlarge.search`,
    `d2.8xlarge.search`,
    `c4.large.search`,
    `c4.xlarge.search`,
    `c4.2xlarge.search`,
    `c4.4xlarge.search`,
    `c4.8xlarge.search`,
    `r4.large.search`,
    `r4.xlarge.search`,
    `r4.2xlarge.search`,
    `r4.4xlarge.search`,
    `r4.8xlarge.search`,
    `r4.16xlarge.search`,
    `i3.large.search`,
    `i3.xlarge.search`,
    `i3.2xlarge.search`,
    `i3.4xlarge.search`,
    `i3.8xlarge.search`,
    `i3.16xlarge.search`,
    `r6g.large.search`,
    `r6g.xlarge.search`,
    `r6g.2xlarge.search`,
    `r6g.4xlarge.search`,
    `r6g.8xlarge.search`,
    `r6g.12xlarge.search`,
    `m6g.large.search`,
    `m6g.xlarge.search`,
    `m6g.2xlarge.search`,
    `m6g.4xlarge.search`,
    `m6g.8xlarge.search`,
    `m6g.12xlarge.search`,
    `c6g.large.search`,
    `c6g.xlarge.search`,
    `c6g.2xlarge.search`,
    `c6g.4xlarge.search`,
    `c6g.8xlarge.search`,
    `c6g.12xlarge.search`,
    `r6gd.large.search`,
    `r6gd.xlarge.search`,
    `r6gd.2xlarge.search`,
    `r6gd.4xlarge.search`,
    `r6gd.8xlarge.search`,
    `r6gd.12xlarge.search`,
    `r6gd.16xlarge.search`,
    `t4g.small.search`,
    `t4g.medium.search`
  )
}

type OpenSearchWarmPartitionInstanceType = "ultrawarm1.medium.search" | "ultrawarm1.large.search" | "ultrawarm1.xlarge.search"
object OpenSearchWarmPartitionInstanceType {
  inline val `ultrawarm1.medium.search`: "ultrawarm1.medium.search" = "ultrawarm1.medium.search"
  inline val `ultrawarm1.large.search`: "ultrawarm1.large.search" = "ultrawarm1.large.search"
  inline val `ultrawarm1.xlarge.search`: "ultrawarm1.xlarge.search" = "ultrawarm1.xlarge.search"

  inline def values: js.Array[OpenSearchWarmPartitionInstanceType] = js.Array(`ultrawarm1.medium.search`, `ultrawarm1.large.search`, `ultrawarm1.xlarge.search`)
}

/** The state of a requested change. One of the following: * Processing: The request change is still in progress. * Active: The request change is processed and deployed to the domain.
  */
type OptionState = "RequiresIndexDocuments" | "Processing" | "Active"
object OptionState {
  inline val RequiresIndexDocuments: "RequiresIndexDocuments" = "RequiresIndexDocuments"
  inline val Processing: "Processing" = "Processing"
  inline val Active: "Active" = "Active"

  inline def values: js.Array[OptionState] = js.Array(RequiresIndexDocuments, Processing, Active)
}

type OutboundConnectionStatusCode = "VALIDATING" | "VALIDATION_FAILED" | "PENDING_ACCEPTANCE" | "APPROVED" | "PROVISIONING" | "ACTIVE" | "REJECTING" | "REJECTED" | "DELETING" | "DELETED"
object OutboundConnectionStatusCode {
  inline val VALIDATING: "VALIDATING" = "VALIDATING"
  inline val VALIDATION_FAILED: "VALIDATION_FAILED" = "VALIDATION_FAILED"
  inline val PENDING_ACCEPTANCE: "PENDING_ACCEPTANCE" = "PENDING_ACCEPTANCE"
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val REJECTING: "REJECTING" = "REJECTING"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[OutboundConnectionStatusCode] = js.Array(VALIDATING, VALIDATION_FAILED, PENDING_ACCEPTANCE, APPROVED, PROVISIONING, ACTIVE, REJECTING, REJECTED, DELETING, DELETED)
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

type ReservedInstancePaymentOption = "ALL_UPFRONT" | "PARTIAL_UPFRONT" | "NO_UPFRONT"
object ReservedInstancePaymentOption {
  inline val ALL_UPFRONT: "ALL_UPFRONT" = "ALL_UPFRONT"
  inline val PARTIAL_UPFRONT: "PARTIAL_UPFRONT" = "PARTIAL_UPFRONT"
  inline val NO_UPFRONT: "NO_UPFRONT" = "NO_UPFRONT"

  inline def values: js.Array[ReservedInstancePaymentOption] = js.Array(ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT)
}

/** The rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK and DEFAULT_ROLLBACK.
  */
type RollbackOnDisable = "NO_ROLLBACK" | "DEFAULT_ROLLBACK"
object RollbackOnDisable {
  inline val NO_ROLLBACK: "NO_ROLLBACK" = "NO_ROLLBACK"
  inline val DEFAULT_ROLLBACK: "DEFAULT_ROLLBACK" = "DEFAULT_ROLLBACK"

  inline def values: js.Array[RollbackOnDisable] = js.Array(NO_ROLLBACK, DEFAULT_ROLLBACK)
}

/** The Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING, and JVM_YOUNG_GEN_TUNING.
  */
type ScheduledAutoTuneActionType = "JVM_HEAP_SIZE_TUNING" | "JVM_YOUNG_GEN_TUNING"
object ScheduledAutoTuneActionType {
  inline val JVM_HEAP_SIZE_TUNING: "JVM_HEAP_SIZE_TUNING" = "JVM_HEAP_SIZE_TUNING"
  inline val JVM_YOUNG_GEN_TUNING: "JVM_YOUNG_GEN_TUNING" = "JVM_YOUNG_GEN_TUNING"

  inline def values: js.Array[ScheduledAutoTuneActionType] = js.Array(JVM_HEAP_SIZE_TUNING, JVM_YOUNG_GEN_TUNING)
}

/** The Auto-Tune action severity. Valid values are LOW, MEDIUM, and HIGH.
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

/** The unit of a maintenance schedule duration. Valid value is HOUR. See <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank"> Auto-Tune for Amazon OpenSearch Service </a> for more information.
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

/** The type of EBS volume, standard, gp2, or io1. See <a href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/opensearch-createupdatedomains.html#opensearch-createdomain-configure-ebs" target="_blank">Configuring EBS-based Storage</a> for more information.
  */
type VolumeType = "standard" | "gp2" | "io1"
object VolumeType {
  inline val standard: "standard" = "standard"
  inline val gp2: "gp2" = "gp2"
  inline val io1: "io1" = "io1"

  inline def values: js.Array[VolumeType] = js.Array(standard, gp2, io1)
}
