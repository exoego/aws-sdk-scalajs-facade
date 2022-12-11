package facade.amazonaws.services.guardduty

import scalajs.js

type AdminStatus = "ENABLED" | "DISABLE_IN_PROGRESS"
object AdminStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLE_IN_PROGRESS: "DISABLE_IN_PROGRESS" = "DISABLE_IN_PROGRESS"

  inline def values: js.Array[AdminStatus] = js.Array(ENABLED, DISABLE_IN_PROGRESS)
}

type CriterionKey = "EC2_INSTANCE_ARN" | "SCAN_ID" | "ACCOUNT_ID" | "GUARDDUTY_FINDING_ID" | "SCAN_START_TIME" | "SCAN_STATUS"
object CriterionKey {
  inline val EC2_INSTANCE_ARN: "EC2_INSTANCE_ARN" = "EC2_INSTANCE_ARN"
  inline val SCAN_ID: "SCAN_ID" = "SCAN_ID"
  inline val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  inline val GUARDDUTY_FINDING_ID: "GUARDDUTY_FINDING_ID" = "GUARDDUTY_FINDING_ID"
  inline val SCAN_START_TIME: "SCAN_START_TIME" = "SCAN_START_TIME"
  inline val SCAN_STATUS: "SCAN_STATUS" = "SCAN_STATUS"

  inline def values: js.Array[CriterionKey] = js.Array(EC2_INSTANCE_ARN, SCAN_ID, ACCOUNT_ID, GUARDDUTY_FINDING_ID, SCAN_START_TIME, SCAN_STATUS)
}

type DataSource = "FLOW_LOGS" | "CLOUD_TRAIL" | "DNS_LOGS" | "S3_LOGS" | "KUBERNETES_AUDIT_LOGS" | "EC2_MALWARE_SCAN"
object DataSource {
  inline val FLOW_LOGS: "FLOW_LOGS" = "FLOW_LOGS"
  inline val CLOUD_TRAIL: "CLOUD_TRAIL" = "CLOUD_TRAIL"
  inline val DNS_LOGS: "DNS_LOGS" = "DNS_LOGS"
  inline val S3_LOGS: "S3_LOGS" = "S3_LOGS"
  inline val KUBERNETES_AUDIT_LOGS: "KUBERNETES_AUDIT_LOGS" = "KUBERNETES_AUDIT_LOGS"
  inline val EC2_MALWARE_SCAN: "EC2_MALWARE_SCAN" = "EC2_MALWARE_SCAN"

  inline def values: js.Array[DataSource] = js.Array(FLOW_LOGS, CLOUD_TRAIL, DNS_LOGS, S3_LOGS, KUBERNETES_AUDIT_LOGS, EC2_MALWARE_SCAN)
}

type DataSourceStatus = "ENABLED" | "DISABLED"
object DataSourceStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[DataSourceStatus] = js.Array(ENABLED, DISABLED)
}

type DestinationType = "S3"
object DestinationType {
  inline val S3: "S3" = "S3"

  inline def values: js.Array[DestinationType] = js.Array(S3)
}

type DetectorStatus = "ENABLED" | "DISABLED"
object DetectorStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[DetectorStatus] = js.Array(ENABLED, DISABLED)
}

type EbsSnapshotPreservation = "NO_RETENTION" | "RETENTION_WITH_FINDING"
object EbsSnapshotPreservation {
  inline val NO_RETENTION: "NO_RETENTION" = "NO_RETENTION"
  inline val RETENTION_WITH_FINDING: "RETENTION_WITH_FINDING" = "RETENTION_WITH_FINDING"

  inline def values: js.Array[EbsSnapshotPreservation] = js.Array(NO_RETENTION, RETENTION_WITH_FINDING)
}

type Feedback = "USEFUL" | "NOT_USEFUL"
object Feedback {
  inline val USEFUL: "USEFUL" = "USEFUL"
  inline val NOT_USEFUL: "NOT_USEFUL" = "NOT_USEFUL"

  inline def values: js.Array[Feedback] = js.Array(USEFUL, NOT_USEFUL)
}

type FilterAction = "NOOP" | "ARCHIVE"
object FilterAction {
  inline val NOOP: "NOOP" = "NOOP"
  inline val ARCHIVE: "ARCHIVE" = "ARCHIVE"

  inline def values: js.Array[FilterAction] = js.Array(NOOP, ARCHIVE)
}

type FindingPublishingFrequency = "FIFTEEN_MINUTES" | "ONE_HOUR" | "SIX_HOURS"
object FindingPublishingFrequency {
  inline val FIFTEEN_MINUTES: "FIFTEEN_MINUTES" = "FIFTEEN_MINUTES"
  inline val ONE_HOUR: "ONE_HOUR" = "ONE_HOUR"
  inline val SIX_HOURS: "SIX_HOURS" = "SIX_HOURS"

  inline def values: js.Array[FindingPublishingFrequency] = js.Array(FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS)
}

type FindingStatisticType = "COUNT_BY_SEVERITY"
object FindingStatisticType {
  inline val COUNT_BY_SEVERITY: "COUNT_BY_SEVERITY" = "COUNT_BY_SEVERITY"

  inline def values: js.Array[FindingStatisticType] = js.Array(COUNT_BY_SEVERITY)
}

type IpSetFormat = "TXT" | "STIX" | "OTX_CSV" | "ALIEN_VAULT" | "PROOF_POINT" | "FIRE_EYE"
object IpSetFormat {
  inline val TXT: "TXT" = "TXT"
  inline val STIX: "STIX" = "STIX"
  inline val OTX_CSV: "OTX_CSV" = "OTX_CSV"
  inline val ALIEN_VAULT: "ALIEN_VAULT" = "ALIEN_VAULT"
  inline val PROOF_POINT: "PROOF_POINT" = "PROOF_POINT"
  inline val FIRE_EYE: "FIRE_EYE" = "FIRE_EYE"

  inline def values: js.Array[IpSetFormat] = js.Array(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE)
}

type IpSetStatus = "INACTIVE" | "ACTIVATING" | "ACTIVE" | "DEACTIVATING" | "ERROR" | "DELETE_PENDING" | "DELETED"
object IpSetStatus {
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DEACTIVATING: "DEACTIVATING" = "DEACTIVATING"
  inline val ERROR: "ERROR" = "ERROR"
  inline val DELETE_PENDING: "DELETE_PENDING" = "DELETE_PENDING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[IpSetStatus] = js.Array(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED)
}

type OrderBy = "ASC" | "DESC"
object OrderBy {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[OrderBy] = js.Array(ASC, DESC)
}

type PublishingStatus = "PENDING_VERIFICATION" | "PUBLISHING" | "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY" | "STOPPED"
object PublishingStatus {
  inline val PENDING_VERIFICATION: "PENDING_VERIFICATION" = "PENDING_VERIFICATION"
  inline val PUBLISHING: "PUBLISHING" = "PUBLISHING"
  inline val UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY: "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY" = "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[PublishingStatus] = js.Array(PENDING_VERIFICATION, PUBLISHING, UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED)
}

/** An enum value representing possible resource properties to match with given scan condition.
  */
type ScanCriterionKey = "EC2_INSTANCE_TAG"
object ScanCriterionKey {
  inline val EC2_INSTANCE_TAG: "EC2_INSTANCE_TAG" = "EC2_INSTANCE_TAG"

  inline def values: js.Array[ScanCriterionKey] = js.Array(EC2_INSTANCE_TAG)
}

type ScanResult = "CLEAN" | "INFECTED"
object ScanResult {
  inline val CLEAN: "CLEAN" = "CLEAN"
  inline val INFECTED: "INFECTED" = "INFECTED"

  inline def values: js.Array[ScanResult] = js.Array(CLEAN, INFECTED)
}

type ScanStatus = "RUNNING" | "COMPLETED" | "FAILED"
object ScanStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ScanStatus] = js.Array(RUNNING, COMPLETED, FAILED)
}

type ThreatIntelSetFormat = "TXT" | "STIX" | "OTX_CSV" | "ALIEN_VAULT" | "PROOF_POINT" | "FIRE_EYE"
object ThreatIntelSetFormat {
  inline val TXT: "TXT" = "TXT"
  inline val STIX: "STIX" = "STIX"
  inline val OTX_CSV: "OTX_CSV" = "OTX_CSV"
  inline val ALIEN_VAULT: "ALIEN_VAULT" = "ALIEN_VAULT"
  inline val PROOF_POINT: "PROOF_POINT" = "PROOF_POINT"
  inline val FIRE_EYE: "FIRE_EYE" = "FIRE_EYE"

  inline def values: js.Array[ThreatIntelSetFormat] = js.Array(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE)
}

type ThreatIntelSetStatus = "INACTIVE" | "ACTIVATING" | "ACTIVE" | "DEACTIVATING" | "ERROR" | "DELETE_PENDING" | "DELETED"
object ThreatIntelSetStatus {
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DEACTIVATING: "DEACTIVATING" = "DEACTIVATING"
  inline val ERROR: "ERROR" = "ERROR"
  inline val DELETE_PENDING: "DELETE_PENDING" = "DELETE_PENDING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[ThreatIntelSetStatus] = js.Array(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED)
}

type UsageStatisticType = "SUM_BY_ACCOUNT" | "SUM_BY_DATA_SOURCE" | "SUM_BY_RESOURCE" | "TOP_RESOURCES"
object UsageStatisticType {
  inline val SUM_BY_ACCOUNT: "SUM_BY_ACCOUNT" = "SUM_BY_ACCOUNT"
  inline val SUM_BY_DATA_SOURCE: "SUM_BY_DATA_SOURCE" = "SUM_BY_DATA_SOURCE"
  inline val SUM_BY_RESOURCE: "SUM_BY_RESOURCE" = "SUM_BY_RESOURCE"
  inline val TOP_RESOURCES: "TOP_RESOURCES" = "TOP_RESOURCES"

  inline def values: js.Array[UsageStatisticType] = js.Array(SUM_BY_ACCOUNT, SUM_BY_DATA_SOURCE, SUM_BY_RESOURCE, TOP_RESOURCES)
}
