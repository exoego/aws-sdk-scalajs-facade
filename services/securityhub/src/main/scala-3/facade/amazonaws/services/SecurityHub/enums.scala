package facade.amazonaws.services.securityhub

import scalajs._

type AdminStatus = "ENABLED" | "DISABLE_IN_PROGRESS"
object AdminStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLE_IN_PROGRESS: "DISABLE_IN_PROGRESS" = "DISABLE_IN_PROGRESS"

  @inline def values = js.Array[AdminStatus](ENABLED, DISABLE_IN_PROGRESS)
}

type AwsIamAccessKeyStatus = "Active" | "Inactive"
object AwsIamAccessKeyStatus {
  val Active: "Active" = "Active"
  val Inactive: "Inactive" = "Inactive"

  @inline def values = js.Array[AwsIamAccessKeyStatus](Active, Inactive)
}

type ComplianceStatus = "PASSED" | "WARNING" | "FAILED" | "NOT_AVAILABLE"
object ComplianceStatus {
  val PASSED: "PASSED" = "PASSED"
  val WARNING: "WARNING" = "WARNING"
  val FAILED: "FAILED" = "FAILED"
  val NOT_AVAILABLE: "NOT_AVAILABLE" = "NOT_AVAILABLE"

  @inline def values = js.Array[ComplianceStatus](PASSED, WARNING, FAILED, NOT_AVAILABLE)
}

type ControlStatus = "ENABLED" | "DISABLED"
object ControlStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ControlStatus](ENABLED, DISABLED)
}

type DateRangeUnit = "DAYS"
object DateRangeUnit {
  val DAYS: "DAYS" = "DAYS"

  @inline def values = js.Array[DateRangeUnit](DAYS)
}

type IntegrationType = "SEND_FINDINGS_TO_SECURITY_HUB" | "RECEIVE_FINDINGS_FROM_SECURITY_HUB" | "UPDATE_FINDINGS_IN_SECURITY_HUB"
object IntegrationType {
  val SEND_FINDINGS_TO_SECURITY_HUB: "SEND_FINDINGS_TO_SECURITY_HUB" = "SEND_FINDINGS_TO_SECURITY_HUB"
  val RECEIVE_FINDINGS_FROM_SECURITY_HUB: "RECEIVE_FINDINGS_FROM_SECURITY_HUB" = "RECEIVE_FINDINGS_FROM_SECURITY_HUB"
  val UPDATE_FINDINGS_IN_SECURITY_HUB: "UPDATE_FINDINGS_IN_SECURITY_HUB" = "UPDATE_FINDINGS_IN_SECURITY_HUB"

  @inline def values = js.Array[IntegrationType](SEND_FINDINGS_TO_SECURITY_HUB, RECEIVE_FINDINGS_FROM_SECURITY_HUB, UPDATE_FINDINGS_IN_SECURITY_HUB)
}

type MalwareState = "OBSERVED" | "REMOVAL_FAILED" | "REMOVED"
object MalwareState {
  val OBSERVED: "OBSERVED" = "OBSERVED"
  val REMOVAL_FAILED: "REMOVAL_FAILED" = "REMOVAL_FAILED"
  val REMOVED: "REMOVED" = "REMOVED"

  @inline def values = js.Array[MalwareState](OBSERVED, REMOVAL_FAILED, REMOVED)
}

type MalwareType = "ADWARE" | "BLENDED_THREAT" | "BOTNET_AGENT" | "COIN_MINER" | "EXPLOIT_KIT" | "KEYLOGGER" | "MACRO" | "POTENTIALLY_UNWANTED" | "SPYWARE" | "RANSOMWARE" | "REMOTE_ACCESS" | "ROOTKIT" | "TROJAN" | "VIRUS" | "WORM"
object MalwareType {
  val ADWARE: "ADWARE" = "ADWARE"
  val BLENDED_THREAT: "BLENDED_THREAT" = "BLENDED_THREAT"
  val BOTNET_AGENT: "BOTNET_AGENT" = "BOTNET_AGENT"
  val COIN_MINER: "COIN_MINER" = "COIN_MINER"
  val EXPLOIT_KIT: "EXPLOIT_KIT" = "EXPLOIT_KIT"
  val KEYLOGGER: "KEYLOGGER" = "KEYLOGGER"
  val MACRO: "MACRO" = "MACRO"
  val POTENTIALLY_UNWANTED: "POTENTIALLY_UNWANTED" = "POTENTIALLY_UNWANTED"
  val SPYWARE: "SPYWARE" = "SPYWARE"
  val RANSOMWARE: "RANSOMWARE" = "RANSOMWARE"
  val REMOTE_ACCESS: "REMOTE_ACCESS" = "REMOTE_ACCESS"
  val ROOTKIT: "ROOTKIT" = "ROOTKIT"
  val TROJAN: "TROJAN" = "TROJAN"
  val VIRUS: "VIRUS" = "VIRUS"
  val WORM: "WORM" = "WORM"

  @inline def values = js.Array[MalwareType](
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

type MapFilterComparison = "EQUALS" | "NOT_EQUALS"
object MapFilterComparison {
  val EQUALS: "EQUALS" = "EQUALS"
  val NOT_EQUALS: "NOT_EQUALS" = "NOT_EQUALS"

  @inline def values = js.Array[MapFilterComparison](EQUALS, NOT_EQUALS)
}

type NetworkDirection = "IN" | "OUT"
object NetworkDirection {
  val IN: "IN" = "IN"
  val OUT: "OUT" = "OUT"

  @inline def values = js.Array[NetworkDirection](IN, OUT)
}

type Partition = "aws" | "aws-cn" | "aws-us-gov"
object Partition {
  val aws: "aws" = "aws"
  val `aws-cn`: "aws-cn" = "aws-cn"
  val `aws-us-gov`: "aws-us-gov" = "aws-us-gov"

  @inline def values = js.Array[Partition](aws, `aws-cn`, `aws-us-gov`)
}

type RecordState = "ACTIVE" | "ARCHIVED"
object RecordState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  @inline def values = js.Array[RecordState](ACTIVE, ARCHIVED)
}

type SeverityLabel = "INFORMATIONAL" | "LOW" | "MEDIUM" | "HIGH" | "CRITICAL"
object SeverityLabel {
  val INFORMATIONAL: "INFORMATIONAL" = "INFORMATIONAL"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"
  val CRITICAL: "CRITICAL" = "CRITICAL"

  @inline def values = js.Array[SeverityLabel](INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL)
}

type SeverityRating = "LOW" | "MEDIUM" | "HIGH" | "CRITICAL"
object SeverityRating {
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"
  val CRITICAL: "CRITICAL" = "CRITICAL"

  @inline def values = js.Array[SeverityRating](LOW, MEDIUM, HIGH, CRITICAL)
}

type SortOrder = "asc" | "desc"
object SortOrder {
  val asc: "asc" = "asc"
  val desc: "desc" = "desc"

  @inline def values = js.Array[SortOrder](asc, desc)
}

type StandardsStatus = "PENDING" | "READY" | "FAILED" | "DELETING" | "INCOMPLETE"
object StandardsStatus {
  val PENDING: "PENDING" = "PENDING"
  val READY: "READY" = "READY"
  val FAILED: "FAILED" = "FAILED"
  val DELETING: "DELETING" = "DELETING"
  val INCOMPLETE: "INCOMPLETE" = "INCOMPLETE"

  @inline def values = js.Array[StandardsStatus](PENDING, READY, FAILED, DELETING, INCOMPLETE)
}

type StringFilterComparison = "EQUALS" | "PREFIX" | "NOT_EQUALS" | "PREFIX_NOT_EQUALS"
object StringFilterComparison {
  val EQUALS: "EQUALS" = "EQUALS"
  val PREFIX: "PREFIX" = "PREFIX"
  val NOT_EQUALS: "NOT_EQUALS" = "NOT_EQUALS"
  val PREFIX_NOT_EQUALS: "PREFIX_NOT_EQUALS" = "PREFIX_NOT_EQUALS"

  @inline def values = js.Array[StringFilterComparison](EQUALS, PREFIX, NOT_EQUALS, PREFIX_NOT_EQUALS)
}

type ThreatIntelIndicatorCategory = "BACKDOOR" | "CARD_STEALER" | "COMMAND_AND_CONTROL" | "DROP_SITE" | "EXPLOIT_SITE" | "KEYLOGGER"
object ThreatIntelIndicatorCategory {
  val BACKDOOR: "BACKDOOR" = "BACKDOOR"
  val CARD_STEALER: "CARD_STEALER" = "CARD_STEALER"
  val COMMAND_AND_CONTROL: "COMMAND_AND_CONTROL" = "COMMAND_AND_CONTROL"
  val DROP_SITE: "DROP_SITE" = "DROP_SITE"
  val EXPLOIT_SITE: "EXPLOIT_SITE" = "EXPLOIT_SITE"
  val KEYLOGGER: "KEYLOGGER" = "KEYLOGGER"

  @inline def values = js.Array[ThreatIntelIndicatorCategory](BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL, DROP_SITE, EXPLOIT_SITE, KEYLOGGER)
}

type ThreatIntelIndicatorType = "DOMAIN" | "EMAIL_ADDRESS" | "HASH_MD5" | "HASH_SHA1" | "HASH_SHA256" | "HASH_SHA512" | "IPV4_ADDRESS" | "IPV6_ADDRESS" | "MUTEX" | "PROCESS" | "URL"
object ThreatIntelIndicatorType {
  val DOMAIN: "DOMAIN" = "DOMAIN"
  val EMAIL_ADDRESS: "EMAIL_ADDRESS" = "EMAIL_ADDRESS"
  val HASH_MD5: "HASH_MD5" = "HASH_MD5"
  val HASH_SHA1: "HASH_SHA1" = "HASH_SHA1"
  val HASH_SHA256: "HASH_SHA256" = "HASH_SHA256"
  val HASH_SHA512: "HASH_SHA512" = "HASH_SHA512"
  val IPV4_ADDRESS: "IPV4_ADDRESS" = "IPV4_ADDRESS"
  val IPV6_ADDRESS: "IPV6_ADDRESS" = "IPV6_ADDRESS"
  val MUTEX: "MUTEX" = "MUTEX"
  val PROCESS: "PROCESS" = "PROCESS"
  val URL: "URL" = "URL"

  @inline def values = js.Array[ThreatIntelIndicatorType](DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1, HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL)
}

type VerificationState = "UNKNOWN" | "TRUE_POSITIVE" | "FALSE_POSITIVE" | "BENIGN_POSITIVE"
object VerificationState {
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  val TRUE_POSITIVE: "TRUE_POSITIVE" = "TRUE_POSITIVE"
  val FALSE_POSITIVE: "FALSE_POSITIVE" = "FALSE_POSITIVE"
  val BENIGN_POSITIVE: "BENIGN_POSITIVE" = "BENIGN_POSITIVE"

  @inline def values = js.Array[VerificationState](UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE, BENIGN_POSITIVE)
}

@deprecated("This field is deprecated, use Workflow.Status instead.", "forever")
type WorkflowState = "NEW" | "ASSIGNED" | "IN_PROGRESS" | "DEFERRED" | "RESOLVED"
object WorkflowState {
  val NEW: "NEW" = "NEW"
  val ASSIGNED: "ASSIGNED" = "ASSIGNED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val DEFERRED: "DEFERRED" = "DEFERRED"
  val RESOLVED: "RESOLVED" = "RESOLVED"

  @inline def values = js.Array[WorkflowState](NEW, ASSIGNED, IN_PROGRESS, DEFERRED, RESOLVED)
}

type WorkflowStatus = "NEW" | "NOTIFIED" | "RESOLVED" | "SUPPRESSED"
object WorkflowStatus {
  val NEW: "NEW" = "NEW"
  val NOTIFIED: "NOTIFIED" = "NOTIFIED"
  val RESOLVED: "RESOLVED" = "RESOLVED"
  val SUPPRESSED: "SUPPRESSED" = "SUPPRESSED"

  @inline def values = js.Array[WorkflowStatus](NEW, NOTIFIED, RESOLVED, SUPPRESSED)
}
