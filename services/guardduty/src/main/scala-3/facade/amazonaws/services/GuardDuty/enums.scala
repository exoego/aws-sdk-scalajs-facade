package facade.amazonaws.services.guardduty

import scalajs._

type AdminStatus = "ENABLED" | "DISABLE_IN_PROGRESS"
object AdminStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLE_IN_PROGRESS: "DISABLE_IN_PROGRESS" = "DISABLE_IN_PROGRESS"

  @inline def values = js.Array[AdminStatus](ENABLED, DISABLE_IN_PROGRESS)
}

type DataSource = "FLOW_LOGS" | "CLOUD_TRAIL" | "DNS_LOGS" | "S3_LOGS"
object DataSource {
  val FLOW_LOGS: "FLOW_LOGS" = "FLOW_LOGS"
  val CLOUD_TRAIL: "CLOUD_TRAIL" = "CLOUD_TRAIL"
  val DNS_LOGS: "DNS_LOGS" = "DNS_LOGS"
  val S3_LOGS: "S3_LOGS" = "S3_LOGS"

  @inline def values = js.Array[DataSource](FLOW_LOGS, CLOUD_TRAIL, DNS_LOGS, S3_LOGS)
}

type DataSourceStatus = "ENABLED" | "DISABLED"
object DataSourceStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[DataSourceStatus](ENABLED, DISABLED)
}

type DestinationType = "S3"
object DestinationType {
  val S3: "S3" = "S3"

  @inline def values = js.Array[DestinationType](S3)
}

type DetectorStatus = "ENABLED" | "DISABLED"
object DetectorStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[DetectorStatus](ENABLED, DISABLED)
}

type Feedback = "USEFUL" | "NOT_USEFUL"
object Feedback {
  val USEFUL: "USEFUL" = "USEFUL"
  val NOT_USEFUL: "NOT_USEFUL" = "NOT_USEFUL"

  @inline def values = js.Array[Feedback](USEFUL, NOT_USEFUL)
}

type FilterAction = "NOOP" | "ARCHIVE"
object FilterAction {
  val NOOP: "NOOP" = "NOOP"
  val ARCHIVE: "ARCHIVE" = "ARCHIVE"

  @inline def values = js.Array[FilterAction](NOOP, ARCHIVE)
}

type FindingPublishingFrequency = "FIFTEEN_MINUTES" | "ONE_HOUR" | "SIX_HOURS"
object FindingPublishingFrequency {
  val FIFTEEN_MINUTES: "FIFTEEN_MINUTES" = "FIFTEEN_MINUTES"
  val ONE_HOUR: "ONE_HOUR" = "ONE_HOUR"
  val SIX_HOURS: "SIX_HOURS" = "SIX_HOURS"

  @inline def values = js.Array[FindingPublishingFrequency](FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS)
}

type FindingStatisticType = "COUNT_BY_SEVERITY"
object FindingStatisticType {
  val COUNT_BY_SEVERITY: "COUNT_BY_SEVERITY" = "COUNT_BY_SEVERITY"

  @inline def values = js.Array[FindingStatisticType](COUNT_BY_SEVERITY)
}

type IpSetFormat = "TXT" | "STIX" | "OTX_CSV" | "ALIEN_VAULT" | "PROOF_POINT" | "FIRE_EYE"
object IpSetFormat {
  val TXT: "TXT" = "TXT"
  val STIX: "STIX" = "STIX"
  val OTX_CSV: "OTX_CSV" = "OTX_CSV"
  val ALIEN_VAULT: "ALIEN_VAULT" = "ALIEN_VAULT"
  val PROOF_POINT: "PROOF_POINT" = "PROOF_POINT"
  val FIRE_EYE: "FIRE_EYE" = "FIRE_EYE"

  @inline def values = js.Array[IpSetFormat](TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE)
}

type IpSetStatus = "INACTIVE" | "ACTIVATING" | "ACTIVE" | "DEACTIVATING" | "ERROR" | "DELETE_PENDING" | "DELETED"
object IpSetStatus {
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DEACTIVATING: "DEACTIVATING" = "DEACTIVATING"
  val ERROR: "ERROR" = "ERROR"
  val DELETE_PENDING: "DELETE_PENDING" = "DELETE_PENDING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[IpSetStatus](INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED)
}

type OrderBy = "ASC" | "DESC"
object OrderBy {
  val ASC: "ASC" = "ASC"
  val DESC: "DESC" = "DESC"

  @inline def values = js.Array[OrderBy](ASC, DESC)
}

type PublishingStatus = "PENDING_VERIFICATION" | "PUBLISHING" | "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY" | "STOPPED"
object PublishingStatus {
  val PENDING_VERIFICATION: "PENDING_VERIFICATION" = "PENDING_VERIFICATION"
  val PUBLISHING: "PUBLISHING" = "PUBLISHING"
  val UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY: "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY" = "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[PublishingStatus](PENDING_VERIFICATION, PUBLISHING, UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED)
}

type ThreatIntelSetFormat = "TXT" | "STIX" | "OTX_CSV" | "ALIEN_VAULT" | "PROOF_POINT" | "FIRE_EYE"
object ThreatIntelSetFormat {
  val TXT: "TXT" = "TXT"
  val STIX: "STIX" = "STIX"
  val OTX_CSV: "OTX_CSV" = "OTX_CSV"
  val ALIEN_VAULT: "ALIEN_VAULT" = "ALIEN_VAULT"
  val PROOF_POINT: "PROOF_POINT" = "PROOF_POINT"
  val FIRE_EYE: "FIRE_EYE" = "FIRE_EYE"

  @inline def values = js.Array[ThreatIntelSetFormat](TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE)
}

type ThreatIntelSetStatus = "INACTIVE" | "ACTIVATING" | "ACTIVE" | "DEACTIVATING" | "ERROR" | "DELETE_PENDING" | "DELETED"
object ThreatIntelSetStatus {
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DEACTIVATING: "DEACTIVATING" = "DEACTIVATING"
  val ERROR: "ERROR" = "ERROR"
  val DELETE_PENDING: "DELETE_PENDING" = "DELETE_PENDING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[ThreatIntelSetStatus](INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED)
}

type UsageStatisticType = "SUM_BY_ACCOUNT" | "SUM_BY_DATA_SOURCE" | "SUM_BY_RESOURCE" | "TOP_RESOURCES"
object UsageStatisticType {
  val SUM_BY_ACCOUNT: "SUM_BY_ACCOUNT" = "SUM_BY_ACCOUNT"
  val SUM_BY_DATA_SOURCE: "SUM_BY_DATA_SOURCE" = "SUM_BY_DATA_SOURCE"
  val SUM_BY_RESOURCE: "SUM_BY_RESOURCE" = "SUM_BY_RESOURCE"
  val TOP_RESOURCES: "TOP_RESOURCES" = "TOP_RESOURCES"

  @inline def values = js.Array[UsageStatisticType](SUM_BY_ACCOUNT, SUM_BY_DATA_SOURCE, SUM_BY_RESOURCE, TOP_RESOURCES)
}
