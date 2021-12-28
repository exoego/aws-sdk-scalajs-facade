package facade.amazonaws.services.es

import scalajs._
import scala.scalajs.js.|

/** Specifies the Auto-Tune desired state. Valid values are ENABLED, DISABLED.
  */
@js.native
sealed trait AutoTuneDesiredState extends js.Any
object AutoTuneDesiredState {
  val ENABLED = "ENABLED".asInstanceOf[AutoTuneDesiredState]
  val DISABLED = "DISABLED".asInstanceOf[AutoTuneDesiredState]

  @inline def values = js.Array(ENABLED, DISABLED)
}

/** Specifies the Auto-Tune state for the Elasticsearch domain. For valid states see the <a href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html" target="_blank">Developer Guide</a>.
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

  @inline def values = js.Array(
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
@js.native
sealed trait AutoTuneType extends js.Any
object AutoTuneType {
  val SCHEDULED_ACTION = "SCHEDULED_ACTION".asInstanceOf[AutoTuneType]

  @inline def values = js.Array(SCHEDULED_ACTION)
}

@js.native
sealed trait DeploymentStatus extends js.Any
object DeploymentStatus {
  val PENDING_UPDATE = "PENDING_UPDATE".asInstanceOf[DeploymentStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeploymentStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[DeploymentStatus]
  val NOT_ELIGIBLE = "NOT_ELIGIBLE".asInstanceOf[DeploymentStatus]
  val ELIGIBLE = "ELIGIBLE".asInstanceOf[DeploymentStatus]

  @inline def values = js.Array(PENDING_UPDATE, IN_PROGRESS, COMPLETED, NOT_ELIGIBLE, ELIGIBLE)
}

@js.native
sealed trait DescribePackagesFilterName extends js.Any
object DescribePackagesFilterName {
  val PackageID = "PackageID".asInstanceOf[DescribePackagesFilterName]
  val PackageName = "PackageName".asInstanceOf[DescribePackagesFilterName]
  val PackageStatus = "PackageStatus".asInstanceOf[DescribePackagesFilterName]

  @inline def values = js.Array(PackageID, PackageName, PackageStatus)
}

@js.native
sealed trait DomainPackageStatus extends js.Any
object DomainPackageStatus {
  val ASSOCIATING = "ASSOCIATING".asInstanceOf[DomainPackageStatus]
  val ASSOCIATION_FAILED = "ASSOCIATION_FAILED".asInstanceOf[DomainPackageStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DomainPackageStatus]
  val DISSOCIATING = "DISSOCIATING".asInstanceOf[DomainPackageStatus]
  val DISSOCIATION_FAILED = "DISSOCIATION_FAILED".asInstanceOf[DomainPackageStatus]

  @inline def values = js.Array(ASSOCIATING, ASSOCIATION_FAILED, ACTIVE, DISSOCIATING, DISSOCIATION_FAILED)
}

@js.native
sealed trait ESPartitionInstanceType extends js.Any
object ESPartitionInstanceType {
  val `m3.medium.elasticsearch` = "m3.medium.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m3.large.elasticsearch` = "m3.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m3.xlarge.elasticsearch` = "m3.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m3.2xlarge.elasticsearch` = "m3.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m4.large.elasticsearch` = "m4.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m4.xlarge.elasticsearch` = "m4.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m4.2xlarge.elasticsearch` = "m4.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m4.4xlarge.elasticsearch` = "m4.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m4.10xlarge.elasticsearch` = "m4.10xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m5.large.elasticsearch` = "m5.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m5.xlarge.elasticsearch` = "m5.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m5.2xlarge.elasticsearch` = "m5.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m5.4xlarge.elasticsearch` = "m5.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `m5.12xlarge.elasticsearch` = "m5.12xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r5.large.elasticsearch` = "r5.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r5.xlarge.elasticsearch` = "r5.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r5.2xlarge.elasticsearch` = "r5.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r5.4xlarge.elasticsearch` = "r5.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r5.12xlarge.elasticsearch` = "r5.12xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c5.large.elasticsearch` = "c5.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c5.xlarge.elasticsearch` = "c5.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c5.2xlarge.elasticsearch` = "c5.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c5.4xlarge.elasticsearch` = "c5.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c5.9xlarge.elasticsearch` = "c5.9xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c5.18xlarge.elasticsearch` = "c5.18xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `ultrawarm1.medium.elasticsearch` = "ultrawarm1.medium.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `ultrawarm1.large.elasticsearch` = "ultrawarm1.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `t2.micro.elasticsearch` = "t2.micro.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `t2.small.elasticsearch` = "t2.small.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `t2.medium.elasticsearch` = "t2.medium.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r3.large.elasticsearch` = "r3.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r3.xlarge.elasticsearch` = "r3.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r3.2xlarge.elasticsearch` = "r3.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r3.4xlarge.elasticsearch` = "r3.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r3.8xlarge.elasticsearch` = "r3.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `i2.xlarge.elasticsearch` = "i2.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `i2.2xlarge.elasticsearch` = "i2.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `d2.xlarge.elasticsearch` = "d2.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `d2.2xlarge.elasticsearch` = "d2.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `d2.4xlarge.elasticsearch` = "d2.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `d2.8xlarge.elasticsearch` = "d2.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c4.large.elasticsearch` = "c4.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c4.xlarge.elasticsearch` = "c4.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c4.2xlarge.elasticsearch` = "c4.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c4.4xlarge.elasticsearch` = "c4.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `c4.8xlarge.elasticsearch` = "c4.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r4.large.elasticsearch` = "r4.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r4.xlarge.elasticsearch` = "r4.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r4.2xlarge.elasticsearch` = "r4.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r4.4xlarge.elasticsearch` = "r4.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r4.8xlarge.elasticsearch` = "r4.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `r4.16xlarge.elasticsearch` = "r4.16xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `i3.large.elasticsearch` = "i3.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `i3.xlarge.elasticsearch` = "i3.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `i3.2xlarge.elasticsearch` = "i3.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `i3.4xlarge.elasticsearch` = "i3.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `i3.8xlarge.elasticsearch` = "i3.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
  val `i3.16xlarge.elasticsearch` = "i3.16xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]

  @inline def values = js.Array(
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

@js.native
sealed trait ESWarmPartitionInstanceType extends js.Any
object ESWarmPartitionInstanceType {
  val `ultrawarm1.medium.elasticsearch` = "ultrawarm1.medium.elasticsearch".asInstanceOf[ESWarmPartitionInstanceType]
  val `ultrawarm1.large.elasticsearch` = "ultrawarm1.large.elasticsearch".asInstanceOf[ESWarmPartitionInstanceType]

  @inline def values = js.Array(`ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch`)
}

@js.native
sealed trait InboundCrossClusterSearchConnectionStatusCode extends js.Any
object InboundCrossClusterSearchConnectionStatusCode {
  val PENDING_ACCEPTANCE = "PENDING_ACCEPTANCE".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
  val APPROVED = "APPROVED".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
  val REJECTING = "REJECTING".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
  val REJECTED = "REJECTED".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
  val DELETING = "DELETING".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
  val DELETED = "DELETED".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]

  @inline def values = js.Array(PENDING_ACCEPTANCE, APPROVED, REJECTING, REJECTED, DELETING, DELETED)
}

/** <p>Type of Log File, it can be one of the following:* INDEX_SLOW_LOGS: Index slow logs contain insert requests that took more time than configured index query log threshold to execute. * SEARCH_SLOW_LOGS: Search slow logs contain search queries that took more time than configured search query log threshold to execute. * ES_APPLICATION_LOGS: Elasticsearch application logs contain information about errors and warnings raised during the operation of the service and can be useful for troubleshooting. * AUDIT_LOGS: Audit logs contain records of user requests for access from the domain. </p>
  */
@js.native
sealed trait LogType extends js.Any
object LogType {
  val INDEX_SLOW_LOGS = "INDEX_SLOW_LOGS".asInstanceOf[LogType]
  val SEARCH_SLOW_LOGS = "SEARCH_SLOW_LOGS".asInstanceOf[LogType]
  val ES_APPLICATION_LOGS = "ES_APPLICATION_LOGS".asInstanceOf[LogType]
  val AUDIT_LOGS = "AUDIT_LOGS".asInstanceOf[LogType]

  @inline def values = js.Array(INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS, AUDIT_LOGS)
}

/** The state of a requested change. One of the following: * Processing: The request change is still in-process. * Active: The request change is processed and deployed to the Elasticsearch domain.
  */
@js.native
sealed trait OptionState extends js.Any
object OptionState {
  val RequiresIndexDocuments = "RequiresIndexDocuments".asInstanceOf[OptionState]
  val Processing = "Processing".asInstanceOf[OptionState]
  val Active = "Active".asInstanceOf[OptionState]

  @inline def values = js.Array(RequiresIndexDocuments, Processing, Active)
}

@js.native
sealed trait OutboundCrossClusterSearchConnectionStatusCode extends js.Any
object OutboundCrossClusterSearchConnectionStatusCode {
  val PENDING_ACCEPTANCE = "PENDING_ACCEPTANCE".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
  val VALIDATING = "VALIDATING".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
  val VALIDATION_FAILED = "VALIDATION_FAILED".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
  val PROVISIONING = "PROVISIONING".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
  val ACTIVE = "ACTIVE".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
  val REJECTED = "REJECTED".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
  val DELETING = "DELETING".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
  val DELETED = "DELETED".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]

  @inline def values = js.Array(PENDING_ACCEPTANCE, VALIDATING, VALIDATION_FAILED, PROVISIONING, ACTIVE, REJECTED, DELETING, DELETED)
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

  @inline def values = js.Array(COPYING, COPY_FAILED, VALIDATING, VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED)
}

@js.native
sealed trait PackageType extends js.Any
object PackageType {
  val `TXT-DICTIONARY` = "TXT-DICTIONARY".asInstanceOf[PackageType]

  @inline def values = js.Array(`TXT-DICTIONARY`)
}

@js.native
sealed trait ReservedElasticsearchInstancePaymentOption extends js.Any
object ReservedElasticsearchInstancePaymentOption {
  val ALL_UPFRONT = "ALL_UPFRONT".asInstanceOf[ReservedElasticsearchInstancePaymentOption]
  val PARTIAL_UPFRONT = "PARTIAL_UPFRONT".asInstanceOf[ReservedElasticsearchInstancePaymentOption]
  val NO_UPFRONT = "NO_UPFRONT".asInstanceOf[ReservedElasticsearchInstancePaymentOption]

  @inline def values = js.Array(ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT)
}

/** Specifies the rollback state while disabling Auto-Tune for the domain. Valid values are NO_ROLLBACK, DEFAULT_ROLLBACK.
  */
@js.native
sealed trait RollbackOnDisable extends js.Any
object RollbackOnDisable {
  val NO_ROLLBACK = "NO_ROLLBACK".asInstanceOf[RollbackOnDisable]
  val DEFAULT_ROLLBACK = "DEFAULT_ROLLBACK".asInstanceOf[RollbackOnDisable]

  @inline def values = js.Array(NO_ROLLBACK, DEFAULT_ROLLBACK)
}

/** Specifies Auto-Tune action type. Valid values are JVM_HEAP_SIZE_TUNING and JVM_YOUNG_GEN_TUNING.
  */
@js.native
sealed trait ScheduledAutoTuneActionType extends js.Any
object ScheduledAutoTuneActionType {
  val JVM_HEAP_SIZE_TUNING = "JVM_HEAP_SIZE_TUNING".asInstanceOf[ScheduledAutoTuneActionType]
  val JVM_YOUNG_GEN_TUNING = "JVM_YOUNG_GEN_TUNING".asInstanceOf[ScheduledAutoTuneActionType]

  @inline def values = js.Array(JVM_HEAP_SIZE_TUNING, JVM_YOUNG_GEN_TUNING)
}

/** Specifies Auto-Tune action severity. Valid values are LOW, MEDIUM and HIGH.
  */
@js.native
sealed trait ScheduledAutoTuneSeverityType extends js.Any
object ScheduledAutoTuneSeverityType {
  val LOW = "LOW".asInstanceOf[ScheduledAutoTuneSeverityType]
  val MEDIUM = "MEDIUM".asInstanceOf[ScheduledAutoTuneSeverityType]
  val HIGH = "HIGH".asInstanceOf[ScheduledAutoTuneSeverityType]

  @inline def values = js.Array(LOW, MEDIUM, HIGH)
}

@js.native
sealed trait TLSSecurityPolicy extends js.Any
object TLSSecurityPolicy {
  val `Policy-Min-TLS-1-0-2019-07` = "Policy-Min-TLS-1-0-2019-07".asInstanceOf[TLSSecurityPolicy]
  val `Policy-Min-TLS-1-2-2019-07` = "Policy-Min-TLS-1-2-2019-07".asInstanceOf[TLSSecurityPolicy]

  @inline def values = js.Array(`Policy-Min-TLS-1-0-2019-07`, `Policy-Min-TLS-1-2-2019-07`)
}

/** Specifies the unit of a maintenance schedule duration. Valid value is HOUR. See the <a href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html" target="_blank">Developer Guide</a> for more information.
  */
@js.native
sealed trait TimeUnit extends js.Any
object TimeUnit {
  val HOURS = "HOURS".asInstanceOf[TimeUnit]

  @inline def values = js.Array(HOURS)
}

@js.native
sealed trait UpgradeStatus extends js.Any
object UpgradeStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[UpgradeStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[UpgradeStatus]
  val SUCCEEDED_WITH_ISSUES = "SUCCEEDED_WITH_ISSUES".asInstanceOf[UpgradeStatus]
  val FAILED = "FAILED".asInstanceOf[UpgradeStatus]

  @inline def values = js.Array(IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES, FAILED)
}

@js.native
sealed trait UpgradeStep extends js.Any
object UpgradeStep {
  val PRE_UPGRADE_CHECK = "PRE_UPGRADE_CHECK".asInstanceOf[UpgradeStep]
  val SNAPSHOT = "SNAPSHOT".asInstanceOf[UpgradeStep]
  val UPGRADE = "UPGRADE".asInstanceOf[UpgradeStep]

  @inline def values = js.Array(PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE)
}

/** The type of EBS volume, standard, gp2, or io1. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank">Configuring EBS-based Storage</a>for more information.
  */
@js.native
sealed trait VolumeType extends js.Any
object VolumeType {
  val standard = "standard".asInstanceOf[VolumeType]
  val gp2 = "gp2".asInstanceOf[VolumeType]
  val io1 = "io1".asInstanceOf[VolumeType]

  @inline def values = js.Array(standard, gp2, io1)
}
