package facade.amazonaws.services.alexaforbusiness

import scalajs._

type BusinessReportFailureCode = "ACCESS_DENIED" | "NO_SUCH_BUCKET" | "INTERNAL_FAILURE"
object BusinessReportFailureCode {
  val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  val NO_SUCH_BUCKET: "NO_SUCH_BUCKET" = "NO_SUCH_BUCKET"
  val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"

  @inline def values = js.Array[BusinessReportFailureCode](ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE)
}

type BusinessReportFormat = "CSV" | "CSV_ZIP"
object BusinessReportFormat {
  val CSV: "CSV" = "CSV"
  val CSV_ZIP: "CSV_ZIP" = "CSV_ZIP"

  @inline def values = js.Array[BusinessReportFormat](CSV, CSV_ZIP)
}

type BusinessReportInterval = "ONE_DAY" | "ONE_WEEK" | "THIRTY_DAYS"
object BusinessReportInterval {
  val ONE_DAY: "ONE_DAY" = "ONE_DAY"
  val ONE_WEEK: "ONE_WEEK" = "ONE_WEEK"
  val THIRTY_DAYS: "THIRTY_DAYS" = "THIRTY_DAYS"

  @inline def values = js.Array[BusinessReportInterval](ONE_DAY, ONE_WEEK, THIRTY_DAYS)
}

type BusinessReportStatus = "RUNNING" | "SUCCEEDED" | "FAILED"
object BusinessReportStatus {
  val RUNNING: "RUNNING" = "RUNNING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[BusinessReportStatus](RUNNING, SUCCEEDED, FAILED)
}

type CommsProtocol = "SIP" | "SIPS" | "H323"
object CommsProtocol {
  val SIP: "SIP" = "SIP"
  val SIPS: "SIPS" = "SIPS"
  val H323: "H323" = "H323"

  @inline def values = js.Array[CommsProtocol](SIP, SIPS, H323)
}

type ConferenceProviderType = "CHIME" | "BLUEJEANS" | "FUZE" | "GOOGLE_HANGOUTS" | "POLYCOM" | "RINGCENTRAL" | "SKYPE_FOR_BUSINESS" | "WEBEX" | "ZOOM" | "CUSTOM"
object ConferenceProviderType {
  val CHIME: "CHIME" = "CHIME"
  val BLUEJEANS: "BLUEJEANS" = "BLUEJEANS"
  val FUZE: "FUZE" = "FUZE"
  val GOOGLE_HANGOUTS: "GOOGLE_HANGOUTS" = "GOOGLE_HANGOUTS"
  val POLYCOM: "POLYCOM" = "POLYCOM"
  val RINGCENTRAL: "RINGCENTRAL" = "RINGCENTRAL"
  val SKYPE_FOR_BUSINESS: "SKYPE_FOR_BUSINESS" = "SKYPE_FOR_BUSINESS"
  val WEBEX: "WEBEX" = "WEBEX"
  val ZOOM: "ZOOM" = "ZOOM"
  val CUSTOM: "CUSTOM" = "CUSTOM"

  @inline def values = js.Array[ConferenceProviderType](CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM, RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM)
}

type ConnectionStatus = "ONLINE" | "OFFLINE"
object ConnectionStatus {
  val ONLINE: "ONLINE" = "ONLINE"
  val OFFLINE: "OFFLINE" = "OFFLINE"

  @inline def values = js.Array[ConnectionStatus](ONLINE, OFFLINE)
}

type DeviceEventType = "CONNECTION_STATUS" | "DEVICE_STATUS"
object DeviceEventType {
  val CONNECTION_STATUS: "CONNECTION_STATUS" = "CONNECTION_STATUS"
  val DEVICE_STATUS: "DEVICE_STATUS" = "DEVICE_STATUS"

  @inline def values = js.Array[DeviceEventType](CONNECTION_STATUS, DEVICE_STATUS)
}

type DeviceStatus = "READY" | "PENDING" | "WAS_OFFLINE" | "DEREGISTERED" | "FAILED"
object DeviceStatus {
  val READY: "READY" = "READY"
  val PENDING: "PENDING" = "PENDING"
  val WAS_OFFLINE: "WAS_OFFLINE" = "WAS_OFFLINE"
  val DEREGISTERED: "DEREGISTERED" = "DEREGISTERED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[DeviceStatus](READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED)
}

type DeviceStatusDetailCode = "DEVICE_SOFTWARE_UPDATE_NEEDED" | "DEVICE_WAS_OFFLINE" | "CREDENTIALS_ACCESS_FAILURE" | "TLS_VERSION_MISMATCH" | "ASSOCIATION_REJECTION" | "AUTHENTICATION_FAILURE" | "DHCP_FAILURE" | "INTERNET_UNAVAILABLE" | "DNS_FAILURE" | "UNKNOWN_FAILURE" | "CERTIFICATE_ISSUING_LIMIT_EXCEEDED" | "INVALID_CERTIFICATE_AUTHORITY" | "NETWORK_PROFILE_NOT_FOUND" | "INVALID_PASSWORD_STATE" | "PASSWORD_NOT_FOUND" | "PASSWORD_MANAGER_ACCESS_DENIED" | "CERTIFICATE_AUTHORITY_ACCESS_DENIED"
object DeviceStatusDetailCode {
  val DEVICE_SOFTWARE_UPDATE_NEEDED: "DEVICE_SOFTWARE_UPDATE_NEEDED" = "DEVICE_SOFTWARE_UPDATE_NEEDED"
  val DEVICE_WAS_OFFLINE: "DEVICE_WAS_OFFLINE" = "DEVICE_WAS_OFFLINE"
  val CREDENTIALS_ACCESS_FAILURE: "CREDENTIALS_ACCESS_FAILURE" = "CREDENTIALS_ACCESS_FAILURE"
  val TLS_VERSION_MISMATCH: "TLS_VERSION_MISMATCH" = "TLS_VERSION_MISMATCH"
  val ASSOCIATION_REJECTION: "ASSOCIATION_REJECTION" = "ASSOCIATION_REJECTION"
  val AUTHENTICATION_FAILURE: "AUTHENTICATION_FAILURE" = "AUTHENTICATION_FAILURE"
  val DHCP_FAILURE: "DHCP_FAILURE" = "DHCP_FAILURE"
  val INTERNET_UNAVAILABLE: "INTERNET_UNAVAILABLE" = "INTERNET_UNAVAILABLE"
  val DNS_FAILURE: "DNS_FAILURE" = "DNS_FAILURE"
  val UNKNOWN_FAILURE: "UNKNOWN_FAILURE" = "UNKNOWN_FAILURE"
  val CERTIFICATE_ISSUING_LIMIT_EXCEEDED: "CERTIFICATE_ISSUING_LIMIT_EXCEEDED" = "CERTIFICATE_ISSUING_LIMIT_EXCEEDED"
  val INVALID_CERTIFICATE_AUTHORITY: "INVALID_CERTIFICATE_AUTHORITY" = "INVALID_CERTIFICATE_AUTHORITY"
  val NETWORK_PROFILE_NOT_FOUND: "NETWORK_PROFILE_NOT_FOUND" = "NETWORK_PROFILE_NOT_FOUND"
  val INVALID_PASSWORD_STATE: "INVALID_PASSWORD_STATE" = "INVALID_PASSWORD_STATE"
  val PASSWORD_NOT_FOUND: "PASSWORD_NOT_FOUND" = "PASSWORD_NOT_FOUND"
  val PASSWORD_MANAGER_ACCESS_DENIED: "PASSWORD_MANAGER_ACCESS_DENIED" = "PASSWORD_MANAGER_ACCESS_DENIED"
  val CERTIFICATE_AUTHORITY_ACCESS_DENIED: "CERTIFICATE_AUTHORITY_ACCESS_DENIED" = "CERTIFICATE_AUTHORITY_ACCESS_DENIED"

  @inline def values = js.Array[DeviceStatusDetailCode](
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

type DeviceUsageType = "VOICE"
object DeviceUsageType {
  val VOICE: "VOICE" = "VOICE"

  @inline def values = js.Array[DeviceUsageType](VOICE)
}

type DistanceUnit = "METRIC" | "IMPERIAL"
object DistanceUnit {
  val METRIC: "METRIC" = "METRIC"
  val IMPERIAL: "IMPERIAL" = "IMPERIAL"

  @inline def values = js.Array[DistanceUnit](METRIC, IMPERIAL)
}

type EnablementType = "ENABLED" | "PENDING"
object EnablementType {
  val ENABLED: "ENABLED" = "ENABLED"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[EnablementType](ENABLED, PENDING)
}

type EnablementTypeFilter = "ENABLED" | "PENDING"
object EnablementTypeFilter {
  val ENABLED: "ENABLED" = "ENABLED"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[EnablementTypeFilter](ENABLED, PENDING)
}

type EndOfMeetingReminderType = "ANNOUNCEMENT_TIME_CHECK" | "ANNOUNCEMENT_VARIABLE_TIME_LEFT" | "CHIME" | "KNOCK"
object EndOfMeetingReminderType {
  val ANNOUNCEMENT_TIME_CHECK: "ANNOUNCEMENT_TIME_CHECK" = "ANNOUNCEMENT_TIME_CHECK"
  val ANNOUNCEMENT_VARIABLE_TIME_LEFT: "ANNOUNCEMENT_VARIABLE_TIME_LEFT" = "ANNOUNCEMENT_VARIABLE_TIME_LEFT"
  val CHIME: "CHIME" = "CHIME"
  val KNOCK: "KNOCK" = "KNOCK"

  @inline def values = js.Array[EndOfMeetingReminderType](ANNOUNCEMENT_TIME_CHECK, ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK)
}

type EnrollmentStatus = "INITIALIZED" | "PENDING" | "REGISTERED" | "DISASSOCIATING" | "DEREGISTERING"
object EnrollmentStatus {
  val INITIALIZED: "INITIALIZED" = "INITIALIZED"
  val PENDING: "PENDING" = "PENDING"
  val REGISTERED: "REGISTERED" = "REGISTERED"
  val DISASSOCIATING: "DISASSOCIATING" = "DISASSOCIATING"
  val DEREGISTERING: "DEREGISTERING" = "DEREGISTERING"

  @inline def values = js.Array[EnrollmentStatus](INITIALIZED, PENDING, REGISTERED, DISASSOCIATING, DEREGISTERING)
}

type Feature = "BLUETOOTH" | "VOLUME" | "NOTIFICATIONS" | "LISTS" | "SKILLS" | "NETWORK_PROFILE" | "SETTINGS" | "ALL"
object Feature {
  val BLUETOOTH: "BLUETOOTH" = "BLUETOOTH"
  val VOLUME: "VOLUME" = "VOLUME"
  val NOTIFICATIONS: "NOTIFICATIONS" = "NOTIFICATIONS"
  val LISTS: "LISTS" = "LISTS"
  val SKILLS: "SKILLS" = "SKILLS"
  val NETWORK_PROFILE: "NETWORK_PROFILE" = "NETWORK_PROFILE"
  val SETTINGS: "SETTINGS" = "SETTINGS"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[Feature](BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS, NETWORK_PROFILE, SETTINGS, ALL)
}

type Locale = "en-US"
object Locale {
  val `en-US`: "en-US" = "en-US"

  @inline def values = js.Array[Locale](`en-US`)
}

type NetworkEapMethod = "EAP_TLS"
object NetworkEapMethod {
  val EAP_TLS: "EAP_TLS" = "EAP_TLS"

  @inline def values = js.Array[NetworkEapMethod](EAP_TLS)
}

type NetworkSecurityType = "OPEN" | "WEP" | "WPA_PSK" | "WPA2_PSK" | "WPA2_ENTERPRISE"
object NetworkSecurityType {
  val OPEN: "OPEN" = "OPEN"
  val WEP: "WEP" = "WEP"
  val WPA_PSK: "WPA_PSK" = "WPA_PSK"
  val WPA2_PSK: "WPA2_PSK" = "WPA2_PSK"
  val WPA2_ENTERPRISE: "WPA2_ENTERPRISE" = "WPA2_ENTERPRISE"

  @inline def values = js.Array[NetworkSecurityType](OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE)
}

type PhoneNumberType = "MOBILE" | "WORK" | "HOME"
object PhoneNumberType {
  val MOBILE: "MOBILE" = "MOBILE"
  val WORK: "WORK" = "WORK"
  val HOME: "HOME" = "HOME"

  @inline def values = js.Array[PhoneNumberType](MOBILE, WORK, HOME)
}

type RequirePin = "YES" | "NO" | "OPTIONAL"
object RequirePin {
  val YES: "YES" = "YES"
  val NO: "NO" = "NO"
  val OPTIONAL: "OPTIONAL" = "OPTIONAL"

  @inline def values = js.Array[RequirePin](YES, NO, OPTIONAL)
}

type SipType = "WORK"
object SipType {
  val WORK: "WORK" = "WORK"

  @inline def values = js.Array[SipType](WORK)
}

type SkillType = "PUBLIC" | "PRIVATE"
object SkillType {
  val PUBLIC: "PUBLIC" = "PUBLIC"
  val PRIVATE: "PRIVATE" = "PRIVATE"

  @inline def values = js.Array[SkillType](PUBLIC, PRIVATE)
}

type SkillTypeFilter = "PUBLIC" | "PRIVATE" | "ALL"
object SkillTypeFilter {
  val PUBLIC: "PUBLIC" = "PUBLIC"
  val PRIVATE: "PRIVATE" = "PRIVATE"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[SkillTypeFilter](PUBLIC, PRIVATE, ALL)
}

type SortValue = "ASC" | "DESC"
object SortValue {
  val ASC: "ASC" = "ASC"
  val DESC: "DESC" = "DESC"

  @inline def values = js.Array[SortValue](ASC, DESC)
}

type TemperatureUnit = "FAHRENHEIT" | "CELSIUS"
object TemperatureUnit {
  val FAHRENHEIT: "FAHRENHEIT" = "FAHRENHEIT"
  val CELSIUS: "CELSIUS" = "CELSIUS"

  @inline def values = js.Array[TemperatureUnit](FAHRENHEIT, CELSIUS)
}

type WakeWord = "ALEXA" | "AMAZON" | "ECHO" | "COMPUTER"
object WakeWord {
  val ALEXA: "ALEXA" = "ALEXA"
  val AMAZON: "AMAZON" = "AMAZON"
  val ECHO: "ECHO" = "ECHO"
  val COMPUTER: "COMPUTER" = "COMPUTER"

  @inline def values = js.Array[WakeWord](ALEXA, AMAZON, ECHO, COMPUTER)
}
