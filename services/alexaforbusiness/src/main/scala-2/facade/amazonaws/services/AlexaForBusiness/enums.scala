package facade.amazonaws.services.alexaforbusiness

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait BusinessReportFailureCode extends js.Any
object BusinessReportFailureCode {
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[BusinessReportFailureCode]
  val NO_SUCH_BUCKET = "NO_SUCH_BUCKET".asInstanceOf[BusinessReportFailureCode]
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[BusinessReportFailureCode]

  @inline def values = js.Array(ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE)
}

@js.native
sealed trait BusinessReportFormat extends js.Any
object BusinessReportFormat {
  val CSV = "CSV".asInstanceOf[BusinessReportFormat]
  val CSV_ZIP = "CSV_ZIP".asInstanceOf[BusinessReportFormat]

  @inline def values = js.Array(CSV, CSV_ZIP)
}

@js.native
sealed trait BusinessReportInterval extends js.Any
object BusinessReportInterval {
  val ONE_DAY = "ONE_DAY".asInstanceOf[BusinessReportInterval]
  val ONE_WEEK = "ONE_WEEK".asInstanceOf[BusinessReportInterval]
  val THIRTY_DAYS = "THIRTY_DAYS".asInstanceOf[BusinessReportInterval]

  @inline def values = js.Array(ONE_DAY, ONE_WEEK, THIRTY_DAYS)
}

@js.native
sealed trait BusinessReportStatus extends js.Any
object BusinessReportStatus {
  val RUNNING = "RUNNING".asInstanceOf[BusinessReportStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[BusinessReportStatus]
  val FAILED = "FAILED".asInstanceOf[BusinessReportStatus]

  @inline def values = js.Array(RUNNING, SUCCEEDED, FAILED)
}

@js.native
sealed trait CommsProtocol extends js.Any
object CommsProtocol {
  val SIP = "SIP".asInstanceOf[CommsProtocol]
  val SIPS = "SIPS".asInstanceOf[CommsProtocol]
  val H323 = "H323".asInstanceOf[CommsProtocol]

  @inline def values = js.Array(SIP, SIPS, H323)
}

@js.native
sealed trait ConferenceProviderType extends js.Any
object ConferenceProviderType {
  val CHIME = "CHIME".asInstanceOf[ConferenceProviderType]
  val BLUEJEANS = "BLUEJEANS".asInstanceOf[ConferenceProviderType]
  val FUZE = "FUZE".asInstanceOf[ConferenceProviderType]
  val GOOGLE_HANGOUTS = "GOOGLE_HANGOUTS".asInstanceOf[ConferenceProviderType]
  val POLYCOM = "POLYCOM".asInstanceOf[ConferenceProviderType]
  val RINGCENTRAL = "RINGCENTRAL".asInstanceOf[ConferenceProviderType]
  val SKYPE_FOR_BUSINESS = "SKYPE_FOR_BUSINESS".asInstanceOf[ConferenceProviderType]
  val WEBEX = "WEBEX".asInstanceOf[ConferenceProviderType]
  val ZOOM = "ZOOM".asInstanceOf[ConferenceProviderType]
  val CUSTOM = "CUSTOM".asInstanceOf[ConferenceProviderType]

  @inline def values = js.Array(CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM, RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM)
}

@js.native
sealed trait ConnectionStatus extends js.Any
object ConnectionStatus {
  val ONLINE = "ONLINE".asInstanceOf[ConnectionStatus]
  val OFFLINE = "OFFLINE".asInstanceOf[ConnectionStatus]

  @inline def values = js.Array(ONLINE, OFFLINE)
}

@js.native
sealed trait DeviceEventType extends js.Any
object DeviceEventType {
  val CONNECTION_STATUS = "CONNECTION_STATUS".asInstanceOf[DeviceEventType]
  val DEVICE_STATUS = "DEVICE_STATUS".asInstanceOf[DeviceEventType]

  @inline def values = js.Array(CONNECTION_STATUS, DEVICE_STATUS)
}

@js.native
sealed trait DeviceStatus extends js.Any
object DeviceStatus {
  val READY = "READY".asInstanceOf[DeviceStatus]
  val PENDING = "PENDING".asInstanceOf[DeviceStatus]
  val WAS_OFFLINE = "WAS_OFFLINE".asInstanceOf[DeviceStatus]
  val DEREGISTERED = "DEREGISTERED".asInstanceOf[DeviceStatus]
  val FAILED = "FAILED".asInstanceOf[DeviceStatus]

  @inline def values = js.Array(READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED)
}

@js.native
sealed trait DeviceStatusDetailCode extends js.Any
object DeviceStatusDetailCode {
  val DEVICE_SOFTWARE_UPDATE_NEEDED = "DEVICE_SOFTWARE_UPDATE_NEEDED".asInstanceOf[DeviceStatusDetailCode]
  val DEVICE_WAS_OFFLINE = "DEVICE_WAS_OFFLINE".asInstanceOf[DeviceStatusDetailCode]
  val CREDENTIALS_ACCESS_FAILURE = "CREDENTIALS_ACCESS_FAILURE".asInstanceOf[DeviceStatusDetailCode]
  val TLS_VERSION_MISMATCH = "TLS_VERSION_MISMATCH".asInstanceOf[DeviceStatusDetailCode]
  val ASSOCIATION_REJECTION = "ASSOCIATION_REJECTION".asInstanceOf[DeviceStatusDetailCode]
  val AUTHENTICATION_FAILURE = "AUTHENTICATION_FAILURE".asInstanceOf[DeviceStatusDetailCode]
  val DHCP_FAILURE = "DHCP_FAILURE".asInstanceOf[DeviceStatusDetailCode]
  val INTERNET_UNAVAILABLE = "INTERNET_UNAVAILABLE".asInstanceOf[DeviceStatusDetailCode]
  val DNS_FAILURE = "DNS_FAILURE".asInstanceOf[DeviceStatusDetailCode]
  val UNKNOWN_FAILURE = "UNKNOWN_FAILURE".asInstanceOf[DeviceStatusDetailCode]
  val CERTIFICATE_ISSUING_LIMIT_EXCEEDED = "CERTIFICATE_ISSUING_LIMIT_EXCEEDED".asInstanceOf[DeviceStatusDetailCode]
  val INVALID_CERTIFICATE_AUTHORITY = "INVALID_CERTIFICATE_AUTHORITY".asInstanceOf[DeviceStatusDetailCode]
  val NETWORK_PROFILE_NOT_FOUND = "NETWORK_PROFILE_NOT_FOUND".asInstanceOf[DeviceStatusDetailCode]
  val INVALID_PASSWORD_STATE = "INVALID_PASSWORD_STATE".asInstanceOf[DeviceStatusDetailCode]
  val PASSWORD_NOT_FOUND = "PASSWORD_NOT_FOUND".asInstanceOf[DeviceStatusDetailCode]
  val PASSWORD_MANAGER_ACCESS_DENIED = "PASSWORD_MANAGER_ACCESS_DENIED".asInstanceOf[DeviceStatusDetailCode]
  val CERTIFICATE_AUTHORITY_ACCESS_DENIED = "CERTIFICATE_AUTHORITY_ACCESS_DENIED".asInstanceOf[DeviceStatusDetailCode]

  @inline def values = js.Array(
    DEVICE_SOFTWARE_UPDATE_NEEDED,
    DEVICE_WAS_OFFLINE,
    CREDENTIALS_ACCESS_FAILURE,
    TLS_VERSION_MISMATCH,
    ASSOCIATION_REJECTION,
    AUTHENTICATION_FAILURE,
    DHCP_FAILURE,
    INTERNET_UNAVAILABLE,
    DNS_FAILURE,
    UNKNOWN_FAILURE,
    CERTIFICATE_ISSUING_LIMIT_EXCEEDED,
    INVALID_CERTIFICATE_AUTHORITY,
    NETWORK_PROFILE_NOT_FOUND,
    INVALID_PASSWORD_STATE,
    PASSWORD_NOT_FOUND,
    PASSWORD_MANAGER_ACCESS_DENIED,
    CERTIFICATE_AUTHORITY_ACCESS_DENIED
  )
}

@js.native
sealed trait DeviceUsageType extends js.Any
object DeviceUsageType {
  val VOICE = "VOICE".asInstanceOf[DeviceUsageType]

  @inline def values = js.Array(VOICE)
}

@js.native
sealed trait DistanceUnit extends js.Any
object DistanceUnit {
  val METRIC = "METRIC".asInstanceOf[DistanceUnit]
  val IMPERIAL = "IMPERIAL".asInstanceOf[DistanceUnit]

  @inline def values = js.Array(METRIC, IMPERIAL)
}

@js.native
sealed trait EnablementType extends js.Any
object EnablementType {
  val ENABLED = "ENABLED".asInstanceOf[EnablementType]
  val PENDING = "PENDING".asInstanceOf[EnablementType]

  @inline def values = js.Array(ENABLED, PENDING)
}

@js.native
sealed trait EnablementTypeFilter extends js.Any
object EnablementTypeFilter {
  val ENABLED = "ENABLED".asInstanceOf[EnablementTypeFilter]
  val PENDING = "PENDING".asInstanceOf[EnablementTypeFilter]

  @inline def values = js.Array(ENABLED, PENDING)
}

@js.native
sealed trait EndOfMeetingReminderType extends js.Any
object EndOfMeetingReminderType {
  val ANNOUNCEMENT_TIME_CHECK = "ANNOUNCEMENT_TIME_CHECK".asInstanceOf[EndOfMeetingReminderType]
  val ANNOUNCEMENT_VARIABLE_TIME_LEFT = "ANNOUNCEMENT_VARIABLE_TIME_LEFT".asInstanceOf[EndOfMeetingReminderType]
  val CHIME = "CHIME".asInstanceOf[EndOfMeetingReminderType]
  val KNOCK = "KNOCK".asInstanceOf[EndOfMeetingReminderType]

  @inline def values = js.Array(ANNOUNCEMENT_TIME_CHECK, ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK)
}

@js.native
sealed trait EnrollmentStatus extends js.Any
object EnrollmentStatus {
  val INITIALIZED = "INITIALIZED".asInstanceOf[EnrollmentStatus]
  val PENDING = "PENDING".asInstanceOf[EnrollmentStatus]
  val REGISTERED = "REGISTERED".asInstanceOf[EnrollmentStatus]
  val DISASSOCIATING = "DISASSOCIATING".asInstanceOf[EnrollmentStatus]
  val DEREGISTERING = "DEREGISTERING".asInstanceOf[EnrollmentStatus]

  @inline def values = js.Array(INITIALIZED, PENDING, REGISTERED, DISASSOCIATING, DEREGISTERING)
}

@js.native
sealed trait Feature extends js.Any
object Feature {
  val BLUETOOTH = "BLUETOOTH".asInstanceOf[Feature]
  val VOLUME = "VOLUME".asInstanceOf[Feature]
  val NOTIFICATIONS = "NOTIFICATIONS".asInstanceOf[Feature]
  val LISTS = "LISTS".asInstanceOf[Feature]
  val SKILLS = "SKILLS".asInstanceOf[Feature]
  val NETWORK_PROFILE = "NETWORK_PROFILE".asInstanceOf[Feature]
  val SETTINGS = "SETTINGS".asInstanceOf[Feature]
  val ALL = "ALL".asInstanceOf[Feature]

  @inline def values = js.Array(BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS, NETWORK_PROFILE, SETTINGS, ALL)
}

@js.native
sealed trait Locale extends js.Any
object Locale {
  val `en-US` = "en-US".asInstanceOf[Locale]

  @inline def values = js.Array(`en-US`)
}

@js.native
sealed trait NetworkEapMethod extends js.Any
object NetworkEapMethod {
  val EAP_TLS = "EAP_TLS".asInstanceOf[NetworkEapMethod]

  @inline def values = js.Array(EAP_TLS)
}

@js.native
sealed trait NetworkSecurityType extends js.Any
object NetworkSecurityType {
  val OPEN = "OPEN".asInstanceOf[NetworkSecurityType]
  val WEP = "WEP".asInstanceOf[NetworkSecurityType]
  val WPA_PSK = "WPA_PSK".asInstanceOf[NetworkSecurityType]
  val WPA2_PSK = "WPA2_PSK".asInstanceOf[NetworkSecurityType]
  val WPA2_ENTERPRISE = "WPA2_ENTERPRISE".asInstanceOf[NetworkSecurityType]

  @inline def values = js.Array(OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE)
}

@js.native
sealed trait PhoneNumberType extends js.Any
object PhoneNumberType {
  val MOBILE = "MOBILE".asInstanceOf[PhoneNumberType]
  val WORK = "WORK".asInstanceOf[PhoneNumberType]
  val HOME = "HOME".asInstanceOf[PhoneNumberType]

  @inline def values = js.Array(MOBILE, WORK, HOME)
}

@js.native
sealed trait RequirePin extends js.Any
object RequirePin {
  val YES = "YES".asInstanceOf[RequirePin]
  val NO = "NO".asInstanceOf[RequirePin]
  val OPTIONAL = "OPTIONAL".asInstanceOf[RequirePin]

  @inline def values = js.Array(YES, NO, OPTIONAL)
}

@js.native
sealed trait SipType extends js.Any
object SipType {
  val WORK = "WORK".asInstanceOf[SipType]

  @inline def values = js.Array(WORK)
}

@js.native
sealed trait SkillType extends js.Any
object SkillType {
  val PUBLIC = "PUBLIC".asInstanceOf[SkillType]
  val PRIVATE = "PRIVATE".asInstanceOf[SkillType]

  @inline def values = js.Array(PUBLIC, PRIVATE)
}

@js.native
sealed trait SkillTypeFilter extends js.Any
object SkillTypeFilter {
  val PUBLIC = "PUBLIC".asInstanceOf[SkillTypeFilter]
  val PRIVATE = "PRIVATE".asInstanceOf[SkillTypeFilter]
  val ALL = "ALL".asInstanceOf[SkillTypeFilter]

  @inline def values = js.Array(PUBLIC, PRIVATE, ALL)
}

@js.native
sealed trait SortValue extends js.Any
object SortValue {
  val ASC = "ASC".asInstanceOf[SortValue]
  val DESC = "DESC".asInstanceOf[SortValue]

  @inline def values = js.Array(ASC, DESC)
}

@js.native
sealed trait TemperatureUnit extends js.Any
object TemperatureUnit {
  val FAHRENHEIT = "FAHRENHEIT".asInstanceOf[TemperatureUnit]
  val CELSIUS = "CELSIUS".asInstanceOf[TemperatureUnit]

  @inline def values = js.Array(FAHRENHEIT, CELSIUS)
}

@js.native
sealed trait WakeWord extends js.Any
object WakeWord {
  val ALEXA = "ALEXA".asInstanceOf[WakeWord]
  val AMAZON = "AMAZON".asInstanceOf[WakeWord]
  val ECHO = "ECHO".asInstanceOf[WakeWord]
  val COMPUTER = "COMPUTER".asInstanceOf[WakeWord]

  @inline def values = js.Array(ALEXA, AMAZON, ECHO, COMPUTER)
}
