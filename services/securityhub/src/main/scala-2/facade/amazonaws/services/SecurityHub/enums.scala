package facade.amazonaws.services.securityhub

import scalajs.js

@js.native
sealed trait AdminStatus extends js.Any
object AdminStatus {
  val ENABLED = "ENABLED".asInstanceOf[AdminStatus]
  val DISABLE_IN_PROGRESS = "DISABLE_IN_PROGRESS".asInstanceOf[AdminStatus]

  @inline def values: js.Array[AdminStatus] = js.Array(ENABLED, DISABLE_IN_PROGRESS)
}

@js.native
sealed trait AwsIamAccessKeyStatus extends js.Any
object AwsIamAccessKeyStatus {
  val Active = "Active".asInstanceOf[AwsIamAccessKeyStatus]
  val Inactive = "Inactive".asInstanceOf[AwsIamAccessKeyStatus]

  @inline def values: js.Array[AwsIamAccessKeyStatus] = js.Array(Active, Inactive)
}

@js.native
sealed trait AwsS3BucketNotificationConfigurationS3KeyFilterRuleName extends js.Any
object AwsS3BucketNotificationConfigurationS3KeyFilterRuleName {
  val Prefix = "Prefix".asInstanceOf[AwsS3BucketNotificationConfigurationS3KeyFilterRuleName]
  val Suffix = "Suffix".asInstanceOf[AwsS3BucketNotificationConfigurationS3KeyFilterRuleName]

  @inline def values: js.Array[AwsS3BucketNotificationConfigurationS3KeyFilterRuleName] = js.Array(Prefix, Suffix)
}

@js.native
sealed trait ComplianceStatus extends js.Any
object ComplianceStatus {
  val PASSED = "PASSED".asInstanceOf[ComplianceStatus]
  val WARNING = "WARNING".asInstanceOf[ComplianceStatus]
  val FAILED = "FAILED".asInstanceOf[ComplianceStatus]
  val NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[ComplianceStatus]

  @inline def values: js.Array[ComplianceStatus] = js.Array(PASSED, WARNING, FAILED, NOT_AVAILABLE)
}

@js.native
sealed trait ControlStatus extends js.Any
object ControlStatus {
  val ENABLED = "ENABLED".asInstanceOf[ControlStatus]
  val DISABLED = "DISABLED".asInstanceOf[ControlStatus]

  @inline def values: js.Array[ControlStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait DateRangeUnit extends js.Any
object DateRangeUnit {
  val DAYS = "DAYS".asInstanceOf[DateRangeUnit]

  @inline def values: js.Array[DateRangeUnit] = js.Array(DAYS)
}

@js.native
sealed trait IntegrationType extends js.Any
object IntegrationType {
  val SEND_FINDINGS_TO_SECURITY_HUB = "SEND_FINDINGS_TO_SECURITY_HUB".asInstanceOf[IntegrationType]
  val RECEIVE_FINDINGS_FROM_SECURITY_HUB = "RECEIVE_FINDINGS_FROM_SECURITY_HUB".asInstanceOf[IntegrationType]
  val UPDATE_FINDINGS_IN_SECURITY_HUB = "UPDATE_FINDINGS_IN_SECURITY_HUB".asInstanceOf[IntegrationType]

  @inline def values: js.Array[IntegrationType] = js.Array(SEND_FINDINGS_TO_SECURITY_HUB, RECEIVE_FINDINGS_FROM_SECURITY_HUB, UPDATE_FINDINGS_IN_SECURITY_HUB)
}

@js.native
sealed trait MalwareState extends js.Any
object MalwareState {
  val OBSERVED = "OBSERVED".asInstanceOf[MalwareState]
  val REMOVAL_FAILED = "REMOVAL_FAILED".asInstanceOf[MalwareState]
  val REMOVED = "REMOVED".asInstanceOf[MalwareState]

  @inline def values: js.Array[MalwareState] = js.Array(OBSERVED, REMOVAL_FAILED, REMOVED)
}

@js.native
sealed trait MalwareType extends js.Any
object MalwareType {
  val ADWARE = "ADWARE".asInstanceOf[MalwareType]
  val BLENDED_THREAT = "BLENDED_THREAT".asInstanceOf[MalwareType]
  val BOTNET_AGENT = "BOTNET_AGENT".asInstanceOf[MalwareType]
  val COIN_MINER = "COIN_MINER".asInstanceOf[MalwareType]
  val EXPLOIT_KIT = "EXPLOIT_KIT".asInstanceOf[MalwareType]
  val KEYLOGGER = "KEYLOGGER".asInstanceOf[MalwareType]
  val MACRO = "MACRO".asInstanceOf[MalwareType]
  val POTENTIALLY_UNWANTED = "POTENTIALLY_UNWANTED".asInstanceOf[MalwareType]
  val SPYWARE = "SPYWARE".asInstanceOf[MalwareType]
  val RANSOMWARE = "RANSOMWARE".asInstanceOf[MalwareType]
  val REMOTE_ACCESS = "REMOTE_ACCESS".asInstanceOf[MalwareType]
  val ROOTKIT = "ROOTKIT".asInstanceOf[MalwareType]
  val TROJAN = "TROJAN".asInstanceOf[MalwareType]
  val VIRUS = "VIRUS".asInstanceOf[MalwareType]
  val WORM = "WORM".asInstanceOf[MalwareType]

  @inline def values: js.Array[MalwareType] = js.Array(
    ADWARE,
    BLENDED_THREAT,
    BOTNET_AGENT,
    COIN_MINER,
    EXPLOIT_KIT,
    KEYLOGGER,
    MACRO,
    POTENTIALLY_UNWANTED,
    SPYWARE,
    RANSOMWARE,
    REMOTE_ACCESS,
    ROOTKIT,
    TROJAN,
    VIRUS,
    WORM
  )
}

@js.native
sealed trait MapFilterComparison extends js.Any
object MapFilterComparison {
  val EQUALS = "EQUALS".asInstanceOf[MapFilterComparison]
  val NOT_EQUALS = "NOT_EQUALS".asInstanceOf[MapFilterComparison]

  @inline def values: js.Array[MapFilterComparison] = js.Array(EQUALS, NOT_EQUALS)
}

@js.native
sealed trait NetworkDirection extends js.Any
object NetworkDirection {
  val IN = "IN".asInstanceOf[NetworkDirection]
  val OUT = "OUT".asInstanceOf[NetworkDirection]

  @inline def values: js.Array[NetworkDirection] = js.Array(IN, OUT)
}

@js.native
sealed trait Partition extends js.Any
object Partition {
  val aws = "aws".asInstanceOf[Partition]
  val `aws-cn` = "aws-cn".asInstanceOf[Partition]
  val `aws-us-gov` = "aws-us-gov".asInstanceOf[Partition]

  @inline def values: js.Array[Partition] = js.Array(aws, `aws-cn`, `aws-us-gov`)
}

@js.native
sealed trait RecordState extends js.Any
object RecordState {
  val ACTIVE = "ACTIVE".asInstanceOf[RecordState]
  val ARCHIVED = "ARCHIVED".asInstanceOf[RecordState]

  @inline def values: js.Array[RecordState] = js.Array(ACTIVE, ARCHIVED)
}

@js.native
sealed trait SeverityLabel extends js.Any
object SeverityLabel {
  val INFORMATIONAL = "INFORMATIONAL".asInstanceOf[SeverityLabel]
  val LOW = "LOW".asInstanceOf[SeverityLabel]
  val MEDIUM = "MEDIUM".asInstanceOf[SeverityLabel]
  val HIGH = "HIGH".asInstanceOf[SeverityLabel]
  val CRITICAL = "CRITICAL".asInstanceOf[SeverityLabel]

  @inline def values: js.Array[SeverityLabel] = js.Array(INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL)
}

@js.native
sealed trait SeverityRating extends js.Any
object SeverityRating {
  val LOW = "LOW".asInstanceOf[SeverityRating]
  val MEDIUM = "MEDIUM".asInstanceOf[SeverityRating]
  val HIGH = "HIGH".asInstanceOf[SeverityRating]
  val CRITICAL = "CRITICAL".asInstanceOf[SeverityRating]

  @inline def values: js.Array[SeverityRating] = js.Array(LOW, MEDIUM, HIGH, CRITICAL)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val asc = "asc".asInstanceOf[SortOrder]
  val desc = "desc".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(asc, desc)
}

@js.native
sealed trait StandardsStatus extends js.Any
object StandardsStatus {
  val PENDING = "PENDING".asInstanceOf[StandardsStatus]
  val READY = "READY".asInstanceOf[StandardsStatus]
  val FAILED = "FAILED".asInstanceOf[StandardsStatus]
  val DELETING = "DELETING".asInstanceOf[StandardsStatus]
  val INCOMPLETE = "INCOMPLETE".asInstanceOf[StandardsStatus]

  @inline def values: js.Array[StandardsStatus] = js.Array(PENDING, READY, FAILED, DELETING, INCOMPLETE)
}

@js.native
sealed trait StatusReasonCode extends js.Any
object StatusReasonCode {
  val NO_AVAILABLE_CONFIGURATION_RECORDER = "NO_AVAILABLE_CONFIGURATION_RECORDER".asInstanceOf[StatusReasonCode]
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[StatusReasonCode]

  @inline def values: js.Array[StatusReasonCode] = js.Array(NO_AVAILABLE_CONFIGURATION_RECORDER, INTERNAL_ERROR)
}

@js.native
sealed trait StringFilterComparison extends js.Any
object StringFilterComparison {
  val EQUALS = "EQUALS".asInstanceOf[StringFilterComparison]
  val PREFIX = "PREFIX".asInstanceOf[StringFilterComparison]
  val NOT_EQUALS = "NOT_EQUALS".asInstanceOf[StringFilterComparison]
  val PREFIX_NOT_EQUALS = "PREFIX_NOT_EQUALS".asInstanceOf[StringFilterComparison]

  @inline def values: js.Array[StringFilterComparison] = js.Array(EQUALS, PREFIX, NOT_EQUALS, PREFIX_NOT_EQUALS)
}

@js.native
sealed trait ThreatIntelIndicatorCategory extends js.Any
object ThreatIntelIndicatorCategory {
  val BACKDOOR = "BACKDOOR".asInstanceOf[ThreatIntelIndicatorCategory]
  val CARD_STEALER = "CARD_STEALER".asInstanceOf[ThreatIntelIndicatorCategory]
  val COMMAND_AND_CONTROL = "COMMAND_AND_CONTROL".asInstanceOf[ThreatIntelIndicatorCategory]
  val DROP_SITE = "DROP_SITE".asInstanceOf[ThreatIntelIndicatorCategory]
  val EXPLOIT_SITE = "EXPLOIT_SITE".asInstanceOf[ThreatIntelIndicatorCategory]
  val KEYLOGGER = "KEYLOGGER".asInstanceOf[ThreatIntelIndicatorCategory]

  @inline def values: js.Array[ThreatIntelIndicatorCategory] = js.Array(BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL, DROP_SITE, EXPLOIT_SITE, KEYLOGGER)
}

@js.native
sealed trait ThreatIntelIndicatorType extends js.Any
object ThreatIntelIndicatorType {
  val DOMAIN = "DOMAIN".asInstanceOf[ThreatIntelIndicatorType]
  val EMAIL_ADDRESS = "EMAIL_ADDRESS".asInstanceOf[ThreatIntelIndicatorType]
  val HASH_MD5 = "HASH_MD5".asInstanceOf[ThreatIntelIndicatorType]
  val HASH_SHA1 = "HASH_SHA1".asInstanceOf[ThreatIntelIndicatorType]
  val HASH_SHA256 = "HASH_SHA256".asInstanceOf[ThreatIntelIndicatorType]
  val HASH_SHA512 = "HASH_SHA512".asInstanceOf[ThreatIntelIndicatorType]
  val IPV4_ADDRESS = "IPV4_ADDRESS".asInstanceOf[ThreatIntelIndicatorType]
  val IPV6_ADDRESS = "IPV6_ADDRESS".asInstanceOf[ThreatIntelIndicatorType]
  val MUTEX = "MUTEX".asInstanceOf[ThreatIntelIndicatorType]
  val PROCESS = "PROCESS".asInstanceOf[ThreatIntelIndicatorType]
  val URL = "URL".asInstanceOf[ThreatIntelIndicatorType]

  @inline def values: js.Array[ThreatIntelIndicatorType] = js.Array(DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1, HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL)
}

@js.native
sealed trait VerificationState extends js.Any
object VerificationState {
  val UNKNOWN = "UNKNOWN".asInstanceOf[VerificationState]
  val TRUE_POSITIVE = "TRUE_POSITIVE".asInstanceOf[VerificationState]
  val FALSE_POSITIVE = "FALSE_POSITIVE".asInstanceOf[VerificationState]
  val BENIGN_POSITIVE = "BENIGN_POSITIVE".asInstanceOf[VerificationState]

  @inline def values: js.Array[VerificationState] = js.Array(UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE, BENIGN_POSITIVE)
}

@deprecated("This filter is deprecated. Instead, use SeverityLabel or FindingProviderFieldsSeverityLabel.", "forever")
@js.native
sealed trait WorkflowState extends js.Any
object WorkflowState {
  val NEW = "NEW".asInstanceOf[WorkflowState]
  val ASSIGNED = "ASSIGNED".asInstanceOf[WorkflowState]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[WorkflowState]
  val DEFERRED = "DEFERRED".asInstanceOf[WorkflowState]
  val RESOLVED = "RESOLVED".asInstanceOf[WorkflowState]

  @inline def values: js.Array[WorkflowState] = js.Array(NEW, ASSIGNED, IN_PROGRESS, DEFERRED, RESOLVED)
}

@js.native
sealed trait WorkflowStatus extends js.Any
object WorkflowStatus {
  val NEW = "NEW".asInstanceOf[WorkflowStatus]
  val NOTIFIED = "NOTIFIED".asInstanceOf[WorkflowStatus]
  val RESOLVED = "RESOLVED".asInstanceOf[WorkflowStatus]
  val SUPPRESSED = "SUPPRESSED".asInstanceOf[WorkflowStatus]

  @inline def values: js.Array[WorkflowStatus] = js.Array(NEW, NOTIFIED, RESOLVED, SUPPRESSED)
}
