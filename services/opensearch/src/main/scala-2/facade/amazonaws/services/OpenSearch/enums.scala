package facade.amazonaws.services.opensearch

import scalajs.js

/** The Auto-Tune desired state. Valid values are ENABLED and DISABLED.
  */
@js.native
sealed trait AutoTuneDesiredState extends js.Any
object AutoTuneDesiredState {
  val ENABLED = "ENABLED".asInstanceOf[AutoTuneDesiredState]
  val DISABLED = "DISABLED".asInstanceOf[AutoTuneDesiredState]

  @inline def values: js.Array[AutoTuneDesiredState] = js.Array(ENABLED, DISABLED)
}

/** The Auto-Tune state for the domain. For valid states see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank"> Auto-Tune for Amazon OpenSearch Service</a>.
  */
@js.native
sealed trait AutoTuneState extends js.Any
object AutoTuneState {
  val ENABLED = "ENABLED".asInstanceOf[AutoTuneState]
  val DISABLED = "DISABLED".asInstanceOf[AutoTuneState]
  val ENABLE_IN_PROGRESS = "ENABLE_IN_PROGRESS".asInstanceOf[AutoTuneState]
  val DISABLE_IN_PROGRESS = "DISABLE_IN_PROGRESS".asInstanceOf[AutoTuneState]
  val DISABLED_AND_ROLLBACK_SCHEDULED = "DISABLED_AND_ROLLBACK_SCHEDULED".asInstanceOf[AutoTuneState]
  val DISABLED_AND_ROLLBACK_IN_PROGRESS = "DISABLED_AND_ROLLBACK_IN_PROGRESS".asInstanceOf[AutoTuneState]
  val DISABLED_AND_ROLLBACK_COMPLETE = "DISABLED_AND_ROLLBACK_COMPLETE".asInstanceOf[AutoTuneState]
  val DISABLED_AND_ROLLBACK_ERROR = "DISABLED_AND_ROLLBACK_ERROR".asInstanceOf[AutoTuneState]
  val ERROR = "ERROR".asInstanceOf[AutoTuneState]

  @inline def values: js.Array[AutoTuneState] = js.Array(
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
@js.native
sealed trait AutoTuneType extends js.Any
object AutoTuneType {
  val SCHEDULED_ACTION = "SCHEDULED_ACTION".asInstanceOf[AutoTuneType]

  @inline def values: js.Array[AutoTuneType] = js.Array(SCHEDULED_ACTION)
}

@js.native
sealed trait DeploymentStatus extends js.Any
object DeploymentStatus {
  val PENDING_UPDATE = "PENDING_UPDATE".asInstanceOf[DeploymentStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeploymentStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[DeploymentStatus]
  val NOT_ELIGIBLE = "NOT_ELIGIBLE".asInstanceOf[DeploymentStatus]
  val ELIGIBLE = "ELIGIBLE".asInstanceOf[DeploymentStatus]

  @inline def values: js.Array[DeploymentStatus] = js.Array(PENDING_UPDATE, IN_PROGRESS, COMPLETED, NOT_ELIGIBLE, ELIGIBLE)
}

@js.native
sealed trait DescribePackagesFilterName extends js.Any
object DescribePackagesFilterName {
  val PackageID = "PackageID".asInstanceOf[DescribePackagesFilterName]
  val PackageName = "PackageName".asInstanceOf[DescribePackagesFilterName]
  val PackageStatus = "PackageStatus".asInstanceOf[DescribePackagesFilterName]

  @inline def values: js.Array[DescribePackagesFilterName] = js.Array(PackageID, PackageName, PackageStatus)
}

@js.native
sealed trait DomainPackageStatus extends js.Any
object DomainPackageStatus {
  val ASSOCIATING = "ASSOCIATING".asInstanceOf[DomainPackageStatus]
  val ASSOCIATION_FAILED = "ASSOCIATION_FAILED".asInstanceOf[DomainPackageStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DomainPackageStatus]
  val DISSOCIATING = "DISSOCIATING".asInstanceOf[DomainPackageStatus]
  val DISSOCIATION_FAILED = "DISSOCIATION_FAILED".asInstanceOf[DomainPackageStatus]

  @inline def values: js.Array[DomainPackageStatus] = js.Array(ASSOCIATING, ASSOCIATION_FAILED, ACTIVE, DISSOCIATING, DISSOCIATION_FAILED)
}

@js.native
sealed trait EngineType extends js.Any
object EngineType {
  val OpenSearch = "OpenSearch".asInstanceOf[EngineType]
  val Elasticsearch = "Elasticsearch".asInstanceOf[EngineType]

  @inline def values: js.Array[EngineType] = js.Array(OpenSearch, Elasticsearch)
}

@js.native
sealed trait InboundConnectionStatusCode extends js.Any
object InboundConnectionStatusCode {
  val PENDING_ACCEPTANCE = "PENDING_ACCEPTANCE".asInstanceOf[InboundConnectionStatusCode]
  val APPROVED = "APPROVED".asInstanceOf[InboundConnectionStatusCode]
  val PROVISIONING = "PROVISIONING".asInstanceOf[InboundConnectionStatusCode]
  val ACTIVE = "ACTIVE".asInstanceOf[InboundConnectionStatusCode]
  val REJECTING = "REJECTING".asInstanceOf[InboundConnectionStatusCode]
  val REJECTED = "REJECTED".asInstanceOf[InboundConnectionStatusCode]
  val DELETING = "DELETING".asInstanceOf[InboundConnectionStatusCode]
  val DELETED = "DELETED".asInstanceOf[InboundConnectionStatusCode]

  @inline def values: js.Array[InboundConnectionStatusCode] = js.Array(PENDING_ACCEPTANCE, APPROVED, PROVISIONING, ACTIVE, REJECTING, REJECTED, DELETING, DELETED)
}

/** <p>Type of log file. Can be one of the following:* INDEX_SLOW_LOGS: Index slow logs contain insert requests that took more time than configured index query log threshold to execute. * SEARCH_SLOW_LOGS: Search slow logs contain search queries that took more time than configured search query log threshold to execute. * ES_APPLICATION_LOGS: OpenSearch application logs contain information about errors and warnings raised during the operation of the service and can be useful for troubleshooting. * AUDIT_LOGS: Audit logs contain records of user requests for access from the domain. </p>
  */
@js.native
sealed trait LogType extends js.Any
object LogType {
  val INDEX_SLOW_LOGS = "INDEX_SLOW_LOGS".asInstanceOf[LogType]
  val SEARCH_SLOW_LOGS = "SEARCH_SLOW_LOGS".asInstanceOf[LogType]
  val ES_APPLICATION_LOGS = "ES_APPLICATION_LOGS".asInstanceOf[LogType]
  val AUDIT_LOGS = "AUDIT_LOGS".asInstanceOf[LogType]

  @inline def values: js.Array[LogType] = js.Array(INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS, AUDIT_LOGS)
}

@js.native
sealed trait OpenSearchPartitionInstanceType extends js.Any
object OpenSearchPartitionInstanceType {
  val `m3.medium.search` = "m3.medium.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m3.large.search` = "m3.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m3.xlarge.search` = "m3.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m3.2xlarge.search` = "m3.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m4.large.search` = "m4.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m4.xlarge.search` = "m4.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m4.2xlarge.search` = "m4.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m4.4xlarge.search` = "m4.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m4.10xlarge.search` = "m4.10xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m5.large.search` = "m5.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m5.xlarge.search` = "m5.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m5.2xlarge.search` = "m5.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m5.4xlarge.search` = "m5.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m5.12xlarge.search` = "m5.12xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m5.24xlarge.search` = "m5.24xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r5.large.search` = "r5.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r5.xlarge.search` = "r5.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r5.2xlarge.search` = "r5.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r5.4xlarge.search` = "r5.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r5.12xlarge.search` = "r5.12xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r5.24xlarge.search` = "r5.24xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c5.large.search` = "c5.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c5.xlarge.search` = "c5.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c5.2xlarge.search` = "c5.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c5.4xlarge.search` = "c5.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c5.9xlarge.search` = "c5.9xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c5.18xlarge.search` = "c5.18xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t3.nano.search` = "t3.nano.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t3.micro.search` = "t3.micro.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t3.small.search` = "t3.small.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t3.medium.search` = "t3.medium.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t3.large.search` = "t3.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t3.xlarge.search` = "t3.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t3.2xlarge.search` = "t3.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `ultrawarm1.medium.search` = "ultrawarm1.medium.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `ultrawarm1.large.search` = "ultrawarm1.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `ultrawarm1.xlarge.search` = "ultrawarm1.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t2.micro.search` = "t2.micro.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t2.small.search` = "t2.small.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t2.medium.search` = "t2.medium.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r3.large.search` = "r3.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r3.xlarge.search` = "r3.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r3.2xlarge.search` = "r3.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r3.4xlarge.search` = "r3.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r3.8xlarge.search` = "r3.8xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `i2.xlarge.search` = "i2.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `i2.2xlarge.search` = "i2.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `d2.xlarge.search` = "d2.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `d2.2xlarge.search` = "d2.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `d2.4xlarge.search` = "d2.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `d2.8xlarge.search` = "d2.8xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c4.large.search` = "c4.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c4.xlarge.search` = "c4.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c4.2xlarge.search` = "c4.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c4.4xlarge.search` = "c4.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c4.8xlarge.search` = "c4.8xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r4.large.search` = "r4.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r4.xlarge.search` = "r4.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r4.2xlarge.search` = "r4.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r4.4xlarge.search` = "r4.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r4.8xlarge.search` = "r4.8xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r4.16xlarge.search` = "r4.16xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `i3.large.search` = "i3.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `i3.xlarge.search` = "i3.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `i3.2xlarge.search` = "i3.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `i3.4xlarge.search` = "i3.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `i3.8xlarge.search` = "i3.8xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `i3.16xlarge.search` = "i3.16xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6g.large.search` = "r6g.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6g.xlarge.search` = "r6g.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6g.2xlarge.search` = "r6g.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6g.4xlarge.search` = "r6g.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6g.8xlarge.search` = "r6g.8xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6g.12xlarge.search` = "r6g.12xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m6g.large.search` = "m6g.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m6g.xlarge.search` = "m6g.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m6g.2xlarge.search` = "m6g.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m6g.4xlarge.search` = "m6g.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m6g.8xlarge.search` = "m6g.8xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `m6g.12xlarge.search` = "m6g.12xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c6g.large.search` = "c6g.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c6g.xlarge.search` = "c6g.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c6g.2xlarge.search` = "c6g.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c6g.4xlarge.search` = "c6g.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c6g.8xlarge.search` = "c6g.8xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `c6g.12xlarge.search` = "c6g.12xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6gd.large.search` = "r6gd.large.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6gd.xlarge.search` = "r6gd.xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6gd.2xlarge.search` = "r6gd.2xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6gd.4xlarge.search` = "r6gd.4xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6gd.8xlarge.search` = "r6gd.8xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6gd.12xlarge.search` = "r6gd.12xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `r6gd.16xlarge.search` = "r6gd.16xlarge.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t4g.small.search` = "t4g.small.search".asInstanceOf[OpenSearchPartitionInstanceType]
  val `t4g.medium.search` = "t4g.medium.search".asInstanceOf[OpenSearchPartitionInstanceType]

  @inline def values: js.Array[OpenSearchPartitionInstanceType] = js.Array(
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

@js.native
sealed trait OpenSearchWarmPartitionInstanceType extends js.Any
object OpenSearchWarmPartitionInstanceType {
  val `ultrawarm1.medium.search` = "ultrawarm1.medium.search".asInstanceOf[OpenSearchWarmPartitionInstanceType]
  val `ultrawarm1.large.search` = "ultrawarm1.large.search".asInstanceOf[OpenSearchWarmPartitionInstanceType]
  val `ultrawarm1.xlarge.search` = "ultrawarm1.xlarge.search".asInstanceOf[OpenSearchWarmPartitionInstanceType]

  @inline def values: js.Array[OpenSearchWarmPartitionInstanceType] = js.Array(`ultrawarm1.medium.search`, `ultrawarm1.large.search`, `ultrawarm1.xlarge.search`)
}

/** The state of a requested change. One of the following: * Processing: The request change is still in progress. * Active: The request change is processed and deployed to the domain.
  */
@js.native
sealed trait OptionState extends js.Any
object OptionState {
  val RequiresIndexDocuments = "RequiresIndexDocuments".asInstanceOf[OptionState]
  val Processing = "Processing".asInstanceOf[OptionState]
  val Active = "Active".asInstanceOf[OptionState]

  @inline def values: js.Array[OptionState] = js.Array(RequiresIndexDocuments, Processing, Active)
}

@js.native
sealed trait OutboundConnectionStatusCode extends js.Any
object OutboundConnectionStatusCode {
  val VALIDATING = "VALIDATING".asInstanceOf[OutboundConnectionStatusCode]
  val VALIDATION_FAILED = "VALIDATION_FAILED".asInstanceOf[OutboundConnectionStatusCode]
  val PENDING_ACCEPTANCE = "PENDING_ACCEPTANCE".asInstanceOf[OutboundConnectionStatusCode]
  val APPROVED = "APPROVED".asInstanceOf[OutboundConnectionStatusCode]
  val PROVISIONING = "PROVISIONING".asInstanceOf[OutboundConnectionStatusCode]
  val ACTIVE = "ACTIVE".asInstanceOf[OutboundConnectionStatusCode]
  val REJECTING = "REJECTING".asInstanceOf[OutboundConnectionStatusCode]
  val REJECTED = "REJECTED".asInstanceOf[OutboundConnectionStatusCode]
  val DELETING = "DELETING".asInstanceOf[OutboundConnectionStatusCode]
  val DELETED = "DELETED".asInstanceOf[OutboundConnectionStatusCode]

  @inline def values: js.Array[OutboundConnectionStatusCode] = js.Array(VALIDATING, VALIDATION_FAILED, PENDING_ACCEPTANCE, APPROVED, PROVISIONING, ACTIVE, REJECTING, REJECTED, DELETING, DELETED)
}

@js.native
sealed trait PackageStatus extends js.Any
object PackageStatus {
  val COPYING = "COPYING".asInstanceOf[PackageStatus]
  val COPY_FAILED = "COPY_FAILED".asInstanceOf[PackageStatus]
  val VALIDATING = "VALIDATING".asInstanceOf[PackageStatus]
  val VALIDATION_FAILED = "VALIDATION_FAILED".asInstanceOf[PackageStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[PackageStatus]
  val DELETING = "DELETING".asInstanceOf[PackageStatus]
  val DELETED = "DELETED".asInstanceOf[PackageStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[PackageStatus]

  @inline def values: js.Array[PackageStatus] = js.Array(COPYING, COPY_FAILED, VALIDATING, VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED)
}

@js.native
sealed trait PackageType extends js.Any
object PackageType {
  val `TXT-DICTIONARY` = "TXT-DICTIONARY".asInstanceOf[PackageType]

  @inline def values: js.Array[PackageType] = js.Array(`TXT-DICTIONARY`)
}

@js.native
sealed trait ReservedInstancePaymentOption extends js.Any
object ReservedInstancePaymentOption {
  val ALL_UPFRONT = "ALL_UPFRONT".asInstanceOf[ReservedInstancePaymentOption]
  val PARTIAL_UPFRONT = "PARTIAL_UPFRONT".asInstanceOf[ReservedInstancePaymentOption]
  val NO_UPFRONT = "NO_UPFRONT".asInstanceOf[ReservedInstancePaymentOption]

  @inline def values: js.Array[ReservedInstancePaymentOption] = js.Array(ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT)
}

/** The rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK and DEFAULT_ROLLBACK.
  */
@js.native
sealed trait RollbackOnDisable extends js.Any
object RollbackOnDisable {
  val NO_ROLLBACK = "NO_ROLLBACK".asInstanceOf[RollbackOnDisable]
  val DEFAULT_ROLLBACK = "DEFAULT_ROLLBACK".asInstanceOf[RollbackOnDisable]

  @inline def values: js.Array[RollbackOnDisable] = js.Array(NO_ROLLBACK, DEFAULT_ROLLBACK)
}

/** The Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING, and JVM_YOUNG_GEN_TUNING.
  */
@js.native
sealed trait ScheduledAutoTuneActionType extends js.Any
object ScheduledAutoTuneActionType {
  val JVM_HEAP_SIZE_TUNING = "JVM_HEAP_SIZE_TUNING".asInstanceOf[ScheduledAutoTuneActionType]
  val JVM_YOUNG_GEN_TUNING = "JVM_YOUNG_GEN_TUNING".asInstanceOf[ScheduledAutoTuneActionType]

  @inline def values: js.Array[ScheduledAutoTuneActionType] = js.Array(JVM_HEAP_SIZE_TUNING, JVM_YOUNG_GEN_TUNING)
}

/** The Auto-Tune action severity. Valid values are LOW, MEDIUM, and HIGH.
  */
@js.native
sealed trait ScheduledAutoTuneSeverityType extends js.Any
object ScheduledAutoTuneSeverityType {
  val LOW = "LOW".asInstanceOf[ScheduledAutoTuneSeverityType]
  val MEDIUM = "MEDIUM".asInstanceOf[ScheduledAutoTuneSeverityType]
  val HIGH = "HIGH".asInstanceOf[ScheduledAutoTuneSeverityType]

  @inline def values: js.Array[ScheduledAutoTuneSeverityType] = js.Array(LOW, MEDIUM, HIGH)
}

@js.native
sealed trait TLSSecurityPolicy extends js.Any
object TLSSecurityPolicy {
  val `Policy-Min-TLS-1-0-2019-07` = "Policy-Min-TLS-1-0-2019-07".asInstanceOf[TLSSecurityPolicy]
  val `Policy-Min-TLS-1-2-2019-07` = "Policy-Min-TLS-1-2-2019-07".asInstanceOf[TLSSecurityPolicy]

  @inline def values: js.Array[TLSSecurityPolicy] = js.Array(`Policy-Min-TLS-1-0-2019-07`, `Policy-Min-TLS-1-2-2019-07`)
}

/** The unit of a maintenance schedule duration. Valid value is HOUR. See <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank"> Auto-Tune for Amazon OpenSearch Service </a> for more information.
  */
@js.native
sealed trait TimeUnit extends js.Any
object TimeUnit {
  val HOURS = "HOURS".asInstanceOf[TimeUnit]

  @inline def values: js.Array[TimeUnit] = js.Array(HOURS)
}

@js.native
sealed trait UpgradeStatus extends js.Any
object UpgradeStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[UpgradeStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[UpgradeStatus]
  val SUCCEEDED_WITH_ISSUES = "SUCCEEDED_WITH_ISSUES".asInstanceOf[UpgradeStatus]
  val FAILED = "FAILED".asInstanceOf[UpgradeStatus]

  @inline def values: js.Array[UpgradeStatus] = js.Array(IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES, FAILED)
}

@js.native
sealed trait UpgradeStep extends js.Any
object UpgradeStep {
  val PRE_UPGRADE_CHECK = "PRE_UPGRADE_CHECK".asInstanceOf[UpgradeStep]
  val SNAPSHOT = "SNAPSHOT".asInstanceOf[UpgradeStep]
  val UPGRADE = "UPGRADE".asInstanceOf[UpgradeStep]

  @inline def values: js.Array[UpgradeStep] = js.Array(PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE)
}

/** The type of EBS volume, standard, gp2, or io1. See <a href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/opensearch-createupdatedomains.html#opensearch-createdomain-configure-ebs" target="_blank">Configuring EBS-based Storage</a> for more information.
  */
@js.native
sealed trait VolumeType extends js.Any
object VolumeType {
  val standard = "standard".asInstanceOf[VolumeType]
  val gp2 = "gp2".asInstanceOf[VolumeType]
  val io1 = "io1".asInstanceOf[VolumeType]

  @inline def values: js.Array[VolumeType] = js.Array(standard, gp2, io1)
}
