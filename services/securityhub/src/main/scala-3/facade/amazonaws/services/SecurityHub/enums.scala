package facade.amazonaws.services.securityhub

import scalajs._

type AdminStatus = "ENABLED" | "DISABLE_IN_PROGRESS"
object AdminStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLE_IN_PROGRESS: "DISABLE_IN_PROGRESS" = "DISABLE_IN_PROGRESS"

  inline def values: js.Array[AdminStatus] = js.Array(ENABLED, DISABLE_IN_PROGRESS)
}

type AwsIamAccessKeyStatus = "Active" | "Inactive"
object AwsIamAccessKeyStatus {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[AwsIamAccessKeyStatus] = js.Array(Active, Inactive)
}

type ComplianceStatus = "PASSED" | "WARNING" | "FAILED" | "NOT_AVAILABLE"
object ComplianceStatus {
  inline val PASSED: "PASSED" = "PASSED"
  inline val WARNING: "WARNING" = "WARNING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val NOT_AVAILABLE: "NOT_AVAILABLE" = "NOT_AVAILABLE"

  inline def values: js.Array[ComplianceStatus] = js.Array(PASSED, WARNING, FAILED, NOT_AVAILABLE)
}

type ControlStatus = "ENABLED" | "DISABLED"
object ControlStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ControlStatus] = js.Array(ENABLED, DISABLED)
}

type DateRangeUnit = "DAYS"
object DateRangeUnit {
  inline val DAYS: "DAYS" = "DAYS"

  inline def values: js.Array[DateRangeUnit] = js.Array(DAYS)
}

type IntegrationType = "SEND_FINDINGS_TO_SECURITY_HUB" | "RECEIVE_FINDINGS_FROM_SECURITY_HUB" | "UPDATE_FINDINGS_IN_SECURITY_HUB"
object IntegrationType {
  inline val SEND_FINDINGS_TO_SECURITY_HUB: "SEND_FINDINGS_TO_SECURITY_HUB" = "SEND_FINDINGS_TO_SECURITY_HUB"
  inline val RECEIVE_FINDINGS_FROM_SECURITY_HUB: "RECEIVE_FINDINGS_FROM_SECURITY_HUB" = "RECEIVE_FINDINGS_FROM_SECURITY_HUB"
  inline val UPDATE_FINDINGS_IN_SECURITY_HUB: "UPDATE_FINDINGS_IN_SECURITY_HUB" = "UPDATE_FINDINGS_IN_SECURITY_HUB"

  inline def values: js.Array[IntegrationType] = js.Array(SEND_FINDINGS_TO_SECURITY_HUB, RECEIVE_FINDINGS_FROM_SECURITY_HUB, UPDATE_FINDINGS_IN_SECURITY_HUB)
}

type MalwareState = "OBSERVED" | "REMOVAL_FAILED" | "REMOVED"
object MalwareState {
  inline val OBSERVED: "OBSERVED" = "OBSERVED"
  inline val REMOVAL_FAILED: "REMOVAL_FAILED" = "REMOVAL_FAILED"
  inline val REMOVED: "REMOVED" = "REMOVED"

  inline def values: js.Array[MalwareState] = js.Array(OBSERVED, REMOVAL_FAILED, REMOVED)
}

type MalwareType = "ADWARE" | "BLENDED_THREAT" | "BOTNET_AGENT" | "COIN_MINER" | "EXPLOIT_KIT" | "KEYLOGGER" | "MACRO" | "POTENTIALLY_UNWANTED" | "SPYWARE" | "RANSOMWARE" | "REMOTE_ACCESS" | "ROOTKIT" | "TROJAN" | "VIRUS" | "WORM"
object MalwareType {
  inline val ADWARE: "ADWARE" = "ADWARE"
  inline val BLENDED_THREAT: "BLENDED_THREAT" = "BLENDED_THREAT"
  inline val BOTNET_AGENT: "BOTNET_AGENT" = "BOTNET_AGENT"
  inline val COIN_MINER: "COIN_MINER" = "COIN_MINER"
  inline val EXPLOIT_KIT: "EXPLOIT_KIT" = "EXPLOIT_KIT"
  inline val KEYLOGGER: "KEYLOGGER" = "KEYLOGGER"
  inline val MACRO: "MACRO" = "MACRO"
  inline val POTENTIALLY_UNWANTED: "POTENTIALLY_UNWANTED" = "POTENTIALLY_UNWANTED"
  inline val SPYWARE: "SPYWARE" = "SPYWARE"
  inline val RANSOMWARE: "RANSOMWARE" = "RANSOMWARE"
  inline val REMOTE_ACCESS: "REMOTE_ACCESS" = "REMOTE_ACCESS"
  inline val ROOTKIT: "ROOTKIT" = "ROOTKIT"
  inline val TROJAN: "TROJAN" = "TROJAN"
  inline val VIRUS: "VIRUS" = "VIRUS"
  inline val WORM: "WORM" = "WORM"

  inline def values: js.Array[MalwareType] = js.Array(
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
  inline val EQUALS: "EQUALS" = "EQUALS"
  inline val NOT_EQUALS: "NOT_EQUALS" = "NOT_EQUALS"

  inline def values: js.Array[MapFilterComparison] = js.Array(EQUALS, NOT_EQUALS)
}

type NetworkDirection = "IN" | "OUT"
object NetworkDirection {
  inline val IN: "IN" = "IN"
  inline val OUT: "OUT" = "OUT"

  inline def values: js.Array[NetworkDirection] = js.Array(IN, OUT)
}

type Partition = "aws" | "aws-cn" | "aws-us-gov"
object Partition {
  inline val aws: "aws" = "aws"
  inline val `aws-cn`: "aws-cn" = "aws-cn"
  inline val `aws-us-gov`: "aws-us-gov" = "aws-us-gov"

  inline def values: js.Array[Partition] = js.Array(aws, `aws-cn`, `aws-us-gov`)
}

type RecordState = "ACTIVE" | "ARCHIVED"
object RecordState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  inline def values: js.Array[RecordState] = js.Array(ACTIVE, ARCHIVED)
}

type SeverityLabel = "INFORMATIONAL" | "LOW" | "MEDIUM" | "HIGH" | "CRITICAL"
object SeverityLabel {
  inline val INFORMATIONAL: "INFORMATIONAL" = "INFORMATIONAL"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"
  inline val CRITICAL: "CRITICAL" = "CRITICAL"

  inline def values: js.Array[SeverityLabel] = js.Array(INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL)
}

type SeverityRating = "LOW" | "MEDIUM" | "HIGH" | "CRITICAL"
object SeverityRating {
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"
  inline val CRITICAL: "CRITICAL" = "CRITICAL"

  inline def values: js.Array[SeverityRating] = js.Array(LOW, MEDIUM, HIGH, CRITICAL)
}

type SortOrder = "asc" | "desc"
object SortOrder {
  inline val asc: "asc" = "asc"
  inline val desc: "desc" = "desc"

  inline def values: js.Array[SortOrder] = js.Array(asc, desc)
}

type StandardsStatus = "PENDING" | "READY" | "FAILED" | "DELETING" | "INCOMPLETE"
object StandardsStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val READY: "READY" = "READY"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val INCOMPLETE: "INCOMPLETE" = "INCOMPLETE"

  inline def values: js.Array[StandardsStatus] = js.Array(PENDING, READY, FAILED, DELETING, INCOMPLETE)
}

type StringFilterComparison = "EQUALS" | "PREFIX" | "NOT_EQUALS" | "PREFIX_NOT_EQUALS"
object StringFilterComparison {
  inline val EQUALS: "EQUALS" = "EQUALS"
  inline val PREFIX: "PREFIX" = "PREFIX"
  inline val NOT_EQUALS: "NOT_EQUALS" = "NOT_EQUALS"
  inline val PREFIX_NOT_EQUALS: "PREFIX_NOT_EQUALS" = "PREFIX_NOT_EQUALS"

  inline def values: js.Array[StringFilterComparison] = js.Array(EQUALS, PREFIX, NOT_EQUALS, PREFIX_NOT_EQUALS)
}

type ThreatIntelIndicatorCategory = "BACKDOOR" | "CARD_STEALER" | "COMMAND_AND_CONTROL" | "DROP_SITE" | "EXPLOIT_SITE" | "KEYLOGGER"
object ThreatIntelIndicatorCategory {
  inline val BACKDOOR: "BACKDOOR" = "BACKDOOR"
  inline val CARD_STEALER: "CARD_STEALER" = "CARD_STEALER"
  inline val COMMAND_AND_CONTROL: "COMMAND_AND_CONTROL" = "COMMAND_AND_CONTROL"
  inline val DROP_SITE: "DROP_SITE" = "DROP_SITE"
  inline val EXPLOIT_SITE: "EXPLOIT_SITE" = "EXPLOIT_SITE"
  inline val KEYLOGGER: "KEYLOGGER" = "KEYLOGGER"

  inline def values: js.Array[ThreatIntelIndicatorCategory] = js.Array(BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL, DROP_SITE, EXPLOIT_SITE, KEYLOGGER)
}

type ThreatIntelIndicatorType = "DOMAIN" | "EMAIL_ADDRESS" | "HASH_MD5" | "HASH_SHA1" | "HASH_SHA256" | "HASH_SHA512" | "IPV4_ADDRESS" | "IPV6_ADDRESS" | "MUTEX" | "PROCESS" | "URL"
object ThreatIntelIndicatorType {
  inline val DOMAIN: "DOMAIN" = "DOMAIN"
  inline val EMAIL_ADDRESS: "EMAIL_ADDRESS" = "EMAIL_ADDRESS"
  inline val HASH_MD5: "HASH_MD5" = "HASH_MD5"
  inline val HASH_SHA1: "HASH_SHA1" = "HASH_SHA1"
  inline val HASH_SHA256: "HASH_SHA256" = "HASH_SHA256"
  inline val HASH_SHA512: "HASH_SHA512" = "HASH_SHA512"
  inline val IPV4_ADDRESS: "IPV4_ADDRESS" = "IPV4_ADDRESS"
  inline val IPV6_ADDRESS: "IPV6_ADDRESS" = "IPV6_ADDRESS"
  inline val MUTEX: "MUTEX" = "MUTEX"
  inline val PROCESS: "PROCESS" = "PROCESS"
  inline val URL: "URL" = "URL"

  inline def values: js.Array[ThreatIntelIndicatorType] = js.Array(DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1, HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL)
}

type VerificationState = "UNKNOWN" | "TRUE_POSITIVE" | "FALSE_POSITIVE" | "BENIGN_POSITIVE"
object VerificationState {
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val TRUE_POSITIVE: "TRUE_POSITIVE" = "TRUE_POSITIVE"
  inline val FALSE_POSITIVE: "FALSE_POSITIVE" = "FALSE_POSITIVE"
  inline val BENIGN_POSITIVE: "BENIGN_POSITIVE" = "BENIGN_POSITIVE"

  inline def values: js.Array[VerificationState] = js.Array(UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE, BENIGN_POSITIVE)
}

@deprecated("This field is deprecated, use Workflow.Status instead.", "forever")
type WorkflowState = "NEW" | "ASSIGNED" | "IN_PROGRESS" | "DEFERRED" | "RESOLVED"
object WorkflowState {
  inline val NEW: "NEW" = "NEW"
  inline val ASSIGNED: "ASSIGNED" = "ASSIGNED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val DEFERRED: "DEFERRED" = "DEFERRED"
  inline val RESOLVED: "RESOLVED" = "RESOLVED"

  inline def values: js.Array[WorkflowState] = js.Array(NEW, ASSIGNED, IN_PROGRESS, DEFERRED, RESOLVED)
}

type WorkflowStatus = "NEW" | "NOTIFIED" | "RESOLVED" | "SUPPRESSED"
object WorkflowStatus {
  inline val NEW: "NEW" = "NEW"
  inline val NOTIFIED: "NOTIFIED" = "NOTIFIED"
  inline val RESOLVED: "RESOLVED" = "RESOLVED"
  inline val SUPPRESSED: "SUPPRESSED" = "SUPPRESSED"

  inline def values: js.Array[WorkflowStatus] = js.Array(NEW, NOTIFIED, RESOLVED, SUPPRESSED)
}
