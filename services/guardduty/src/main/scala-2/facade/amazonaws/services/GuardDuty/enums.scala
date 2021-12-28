package facade.amazonaws.services.guardduty

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AdminStatus extends js.Any
object AdminStatus {
  val ENABLED = "ENABLED".asInstanceOf[AdminStatus]
  val DISABLE_IN_PROGRESS = "DISABLE_IN_PROGRESS".asInstanceOf[AdminStatus]

  @inline def values = js.Array(ENABLED, DISABLE_IN_PROGRESS)
}

@js.native
sealed trait DataSource extends js.Any
object DataSource {
  val FLOW_LOGS = "FLOW_LOGS".asInstanceOf[DataSource]
  val CLOUD_TRAIL = "CLOUD_TRAIL".asInstanceOf[DataSource]
  val DNS_LOGS = "DNS_LOGS".asInstanceOf[DataSource]
  val S3_LOGS = "S3_LOGS".asInstanceOf[DataSource]

  @inline def values = js.Array(FLOW_LOGS, CLOUD_TRAIL, DNS_LOGS, S3_LOGS)
}

@js.native
sealed trait DataSourceStatus extends js.Any
object DataSourceStatus {
  val ENABLED = "ENABLED".asInstanceOf[DataSourceStatus]
  val DISABLED = "DISABLED".asInstanceOf[DataSourceStatus]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait DestinationType extends js.Any
object DestinationType {
  val S3 = "S3".asInstanceOf[DestinationType]

  @inline def values = js.Array(S3)
}

@js.native
sealed trait DetectorStatus extends js.Any
object DetectorStatus {
  val ENABLED = "ENABLED".asInstanceOf[DetectorStatus]
  val DISABLED = "DISABLED".asInstanceOf[DetectorStatus]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait Feedback extends js.Any
object Feedback {
  val USEFUL = "USEFUL".asInstanceOf[Feedback]
  val NOT_USEFUL = "NOT_USEFUL".asInstanceOf[Feedback]

  @inline def values = js.Array(USEFUL, NOT_USEFUL)
}

@js.native
sealed trait FilterAction extends js.Any
object FilterAction {
  val NOOP = "NOOP".asInstanceOf[FilterAction]
  val ARCHIVE = "ARCHIVE".asInstanceOf[FilterAction]

  @inline def values = js.Array(NOOP, ARCHIVE)
}

@js.native
sealed trait FindingPublishingFrequency extends js.Any
object FindingPublishingFrequency {
  val FIFTEEN_MINUTES = "FIFTEEN_MINUTES".asInstanceOf[FindingPublishingFrequency]
  val ONE_HOUR = "ONE_HOUR".asInstanceOf[FindingPublishingFrequency]
  val SIX_HOURS = "SIX_HOURS".asInstanceOf[FindingPublishingFrequency]

  @inline def values = js.Array(FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS)
}

@js.native
sealed trait FindingStatisticType extends js.Any
object FindingStatisticType {
  val COUNT_BY_SEVERITY = "COUNT_BY_SEVERITY".asInstanceOf[FindingStatisticType]

  @inline def values = js.Array(COUNT_BY_SEVERITY)
}

@js.native
sealed trait IpSetFormat extends js.Any
object IpSetFormat {
  val TXT = "TXT".asInstanceOf[IpSetFormat]
  val STIX = "STIX".asInstanceOf[IpSetFormat]
  val OTX_CSV = "OTX_CSV".asInstanceOf[IpSetFormat]
  val ALIEN_VAULT = "ALIEN_VAULT".asInstanceOf[IpSetFormat]
  val PROOF_POINT = "PROOF_POINT".asInstanceOf[IpSetFormat]
  val FIRE_EYE = "FIRE_EYE".asInstanceOf[IpSetFormat]

  @inline def values = js.Array(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE)
}

@js.native
sealed trait IpSetStatus extends js.Any
object IpSetStatus {
  val INACTIVE = "INACTIVE".asInstanceOf[IpSetStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[IpSetStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[IpSetStatus]
  val DEACTIVATING = "DEACTIVATING".asInstanceOf[IpSetStatus]
  val ERROR = "ERROR".asInstanceOf[IpSetStatus]
  val DELETE_PENDING = "DELETE_PENDING".asInstanceOf[IpSetStatus]
  val DELETED = "DELETED".asInstanceOf[IpSetStatus]

  @inline def values = js.Array(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED)
}

@js.native
sealed trait OrderBy extends js.Any
object OrderBy {
  val ASC = "ASC".asInstanceOf[OrderBy]
  val DESC = "DESC".asInstanceOf[OrderBy]

  @inline def values = js.Array(ASC, DESC)
}

@js.native
sealed trait PublishingStatus extends js.Any
object PublishingStatus {
  val PENDING_VERIFICATION = "PENDING_VERIFICATION".asInstanceOf[PublishingStatus]
  val PUBLISHING = "PUBLISHING".asInstanceOf[PublishingStatus]
  val UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY = "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY".asInstanceOf[PublishingStatus]
  val STOPPED = "STOPPED".asInstanceOf[PublishingStatus]

  @inline def values = js.Array(PENDING_VERIFICATION, PUBLISHING, UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED)
}

@js.native
sealed trait ThreatIntelSetFormat extends js.Any
object ThreatIntelSetFormat {
  val TXT = "TXT".asInstanceOf[ThreatIntelSetFormat]
  val STIX = "STIX".asInstanceOf[ThreatIntelSetFormat]
  val OTX_CSV = "OTX_CSV".asInstanceOf[ThreatIntelSetFormat]
  val ALIEN_VAULT = "ALIEN_VAULT".asInstanceOf[ThreatIntelSetFormat]
  val PROOF_POINT = "PROOF_POINT".asInstanceOf[ThreatIntelSetFormat]
  val FIRE_EYE = "FIRE_EYE".asInstanceOf[ThreatIntelSetFormat]

  @inline def values = js.Array(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE)
}

@js.native
sealed trait ThreatIntelSetStatus extends js.Any
object ThreatIntelSetStatus {
  val INACTIVE = "INACTIVE".asInstanceOf[ThreatIntelSetStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[ThreatIntelSetStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ThreatIntelSetStatus]
  val DEACTIVATING = "DEACTIVATING".asInstanceOf[ThreatIntelSetStatus]
  val ERROR = "ERROR".asInstanceOf[ThreatIntelSetStatus]
  val DELETE_PENDING = "DELETE_PENDING".asInstanceOf[ThreatIntelSetStatus]
  val DELETED = "DELETED".asInstanceOf[ThreatIntelSetStatus]

  @inline def values = js.Array(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED)
}

@js.native
sealed trait UsageStatisticType extends js.Any
object UsageStatisticType {
  val SUM_BY_ACCOUNT = "SUM_BY_ACCOUNT".asInstanceOf[UsageStatisticType]
  val SUM_BY_DATA_SOURCE = "SUM_BY_DATA_SOURCE".asInstanceOf[UsageStatisticType]
  val SUM_BY_RESOURCE = "SUM_BY_RESOURCE".asInstanceOf[UsageStatisticType]
  val TOP_RESOURCES = "TOP_RESOURCES".asInstanceOf[UsageStatisticType]

  @inline def values = js.Array(SUM_BY_ACCOUNT, SUM_BY_DATA_SOURCE, SUM_BY_RESOURCE, TOP_RESOURCES)
}
