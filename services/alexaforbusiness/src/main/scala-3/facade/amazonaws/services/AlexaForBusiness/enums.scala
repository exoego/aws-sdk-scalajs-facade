package facade.amazonaws.services.alexaforbusiness

import scalajs.js

type BusinessReportFailureCode = "ACCESS_DENIED" | "NO_SUCH_BUCKET" | "INTERNAL_FAILURE"
object BusinessReportFailureCode {
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val NO_SUCH_BUCKET: "NO_SUCH_BUCKET" = "NO_SUCH_BUCKET"
  inline val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"

  inline def values: js.Array[BusinessReportFailureCode] = js.Array(ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE)
}

type BusinessReportFormat = "CSV" | "CSV_ZIP"
object BusinessReportFormat {
  inline val CSV: "CSV" = "CSV"
  inline val CSV_ZIP: "CSV_ZIP" = "CSV_ZIP"

  inline def values: js.Array[BusinessReportFormat] = js.Array(CSV, CSV_ZIP)
}

type BusinessReportInterval = "ONE_DAY" | "ONE_WEEK" | "THIRTY_DAYS"
object BusinessReportInterval {
  inline val ONE_DAY: "ONE_DAY" = "ONE_DAY"
  inline val ONE_WEEK: "ONE_WEEK" = "ONE_WEEK"
  inline val THIRTY_DAYS: "THIRTY_DAYS" = "THIRTY_DAYS"

  inline def values: js.Array[BusinessReportInterval] = js.Array(ONE_DAY, ONE_WEEK, THIRTY_DAYS)
}

type BusinessReportStatus = "RUNNING" | "SUCCEEDED" | "FAILED"
object BusinessReportStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[BusinessReportStatus] = js.Array(RUNNING, SUCCEEDED, FAILED)
}

type CommsProtocol = "SIP" | "SIPS" | "H323"
object CommsProtocol {
  inline val SIP: "SIP" = "SIP"
  inline val SIPS: "SIPS" = "SIPS"
  inline val H323: "H323" = "H323"

  inline def values: js.Array[CommsProtocol] = js.Array(SIP, SIPS, H323)
}

type ConferenceProviderType = "CHIME" | "BLUEJEANS" | "FUZE" | "GOOGLE_HANGOUTS" | "POLYCOM" | "RINGCENTRAL" | "SKYPE_FOR_BUSINESS" | "WEBEX" | "ZOOM" | "CUSTOM"
object ConferenceProviderType {
  inline val CHIME: "CHIME" = "CHIME"
  inline val BLUEJEANS: "BLUEJEANS" = "BLUEJEANS"
  inline val FUZE: "FUZE" = "FUZE"
  inline val GOOGLE_HANGOUTS: "GOOGLE_HANGOUTS" = "GOOGLE_HANGOUTS"
  inline val POLYCOM: "POLYCOM" = "POLYCOM"
  inline val RINGCENTRAL: "RINGCENTRAL" = "RINGCENTRAL"
  inline val SKYPE_FOR_BUSINESS: "SKYPE_FOR_BUSINESS" = "SKYPE_FOR_BUSINESS"
  inline val WEBEX: "WEBEX" = "WEBEX"
  inline val ZOOM: "ZOOM" = "ZOOM"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[ConferenceProviderType] = js.Array(CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM, RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM)
}

type ConnectionStatus = "ONLINE" | "OFFLINE"
object ConnectionStatus {
  inline val ONLINE: "ONLINE" = "ONLINE"
  inline val OFFLINE: "OFFLINE" = "OFFLINE"

  inline def values: js.Array[ConnectionStatus] = js.Array(ONLINE, OFFLINE)
}

type DeviceEventType = "CONNECTION_STATUS" | "DEVICE_STATUS"
object DeviceEventType {
  inline val CONNECTION_STATUS: "CONNECTION_STATUS" = "CONNECTION_STATUS"
  inline val DEVICE_STATUS: "DEVICE_STATUS" = "DEVICE_STATUS"

  inline def values: js.Array[DeviceEventType] = js.Array(CONNECTION_STATUS, DEVICE_STATUS)
}

type DeviceStatus = "READY" | "PENDING" | "WAS_OFFLINE" | "DEREGISTERED" | "FAILED"
object DeviceStatus {
  inline val READY: "READY" = "READY"
  inline val PENDING: "PENDING" = "PENDING"
  inline val WAS_OFFLINE: "WAS_OFFLINE" = "WAS_OFFLINE"
  inline val DEREGISTERED: "DEREGISTERED" = "DEREGISTERED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[DeviceStatus] = js.Array(READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED)
}

type DeviceStatusDetailCode = "DEVICE_SOFTWARE_UPDATE_NEEDED" | "DEVICE_WAS_OFFLINE" | "CREDENTIALS_ACCESS_FAILURE" | "TLS_VERSION_MISMATCH" | "ASSOCIATION_REJECTION" | "AUTHENTICATION_FAILURE" | "DHCP_FAILURE" | "INTERNET_UNAVAILABLE" | "DNS_FAILURE" | "UNKNOWN_FAILURE" | "CERTIFICATE_ISSUING_LIMIT_EXCEEDED" | "INVALID_CERTIFICATE_AUTHORITY" | "NETWORK_PROFILE_NOT_FOUND" | "INVALID_PASSWORD_STATE" | "PASSWORD_NOT_FOUND" | "PASSWORD_MANAGER_ACCESS_DENIED" | "CERTIFICATE_AUTHORITY_ACCESS_DENIED"
object DeviceStatusDetailCode {
  inline val DEVICE_SOFTWARE_UPDATE_NEEDED: "DEVICE_SOFTWARE_UPDATE_NEEDED" = "DEVICE_SOFTWARE_UPDATE_NEEDED"
  inline val DEVICE_WAS_OFFLINE: "DEVICE_WAS_OFFLINE" = "DEVICE_WAS_OFFLINE"
  inline val CREDENTIALS_ACCESS_FAILURE: "CREDENTIALS_ACCESS_FAILURE" = "CREDENTIALS_ACCESS_FAILURE"
  inline val TLS_VERSION_MISMATCH: "TLS_VERSION_MISMATCH" = "TLS_VERSION_MISMATCH"
  inline val ASSOCIATION_REJECTION: "ASSOCIATION_REJECTION" = "ASSOCIATION_REJECTION"
  inline val AUTHENTICATION_FAILURE: "AUTHENTICATION_FAILURE" = "AUTHENTICATION_FAILURE"
  inline val DHCP_FAILURE: "DHCP_FAILURE" = "DHCP_FAILURE"
  inline val INTERNET_UNAVAILABLE: "INTERNET_UNAVAILABLE" = "INTERNET_UNAVAILABLE"
  inline val DNS_FAILURE: "DNS_FAILURE" = "DNS_FAILURE"
  inline val UNKNOWN_FAILURE: "UNKNOWN_FAILURE" = "UNKNOWN_FAILURE"
  inline val CERTIFICATE_ISSUING_LIMIT_EXCEEDED: "CERTIFICATE_ISSUING_LIMIT_EXCEEDED" = "CERTIFICATE_ISSUING_LIMIT_EXCEEDED"
  inline val INVALID_CERTIFICATE_AUTHORITY: "INVALID_CERTIFICATE_AUTHORITY" = "INVALID_CERTIFICATE_AUTHORITY"
  inline val NETWORK_PROFILE_NOT_FOUND: "NETWORK_PROFILE_NOT_FOUND" = "NETWORK_PROFILE_NOT_FOUND"
  inline val INVALID_PASSWORD_STATE: "INVALID_PASSWORD_STATE" = "INVALID_PASSWORD_STATE"
  inline val PASSWORD_NOT_FOUND: "PASSWORD_NOT_FOUND" = "PASSWORD_NOT_FOUND"
  inline val PASSWORD_MANAGER_ACCESS_DENIED: "PASSWORD_MANAGER_ACCESS_DENIED" = "PASSWORD_MANAGER_ACCESS_DENIED"
  inline val CERTIFICATE_AUTHORITY_ACCESS_DENIED: "CERTIFICATE_AUTHORITY_ACCESS_DENIED" = "CERTIFICATE_AUTHORITY_ACCESS_DENIED"

  inline def values: js.Array[DeviceStatusDetailCode] = js.Array(
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
  inline val VOICE: "VOICE" = "VOICE"

  inline def values: js.Array[DeviceUsageType] = js.Array(VOICE)
}

type DistanceUnit = "METRIC" | "IMPERIAL"
object DistanceUnit {
  inline val METRIC: "METRIC" = "METRIC"
  inline val IMPERIAL: "IMPERIAL" = "IMPERIAL"

  inline def values: js.Array[DistanceUnit] = js.Array(METRIC, IMPERIAL)
}

type EnablementType = "ENABLED" | "PENDING"
object EnablementType {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[EnablementType] = js.Array(ENABLED, PENDING)
}

type EnablementTypeFilter = "ENABLED" | "PENDING"
object EnablementTypeFilter {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[EnablementTypeFilter] = js.Array(ENABLED, PENDING)
}

type EndOfMeetingReminderType = "ANNOUNCEMENT_TIME_CHECK" | "ANNOUNCEMENT_VARIABLE_TIME_LEFT" | "CHIME" | "KNOCK"
object EndOfMeetingReminderType {
  inline val ANNOUNCEMENT_TIME_CHECK: "ANNOUNCEMENT_TIME_CHECK" = "ANNOUNCEMENT_TIME_CHECK"
  inline val ANNOUNCEMENT_VARIABLE_TIME_LEFT: "ANNOUNCEMENT_VARIABLE_TIME_LEFT" = "ANNOUNCEMENT_VARIABLE_TIME_LEFT"
  inline val CHIME: "CHIME" = "CHIME"
  inline val KNOCK: "KNOCK" = "KNOCK"

  inline def values: js.Array[EndOfMeetingReminderType] = js.Array(ANNOUNCEMENT_TIME_CHECK, ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK)
}

type EnrollmentStatus = "INITIALIZED" | "PENDING" | "REGISTERED" | "DISASSOCIATING" | "DEREGISTERING"
object EnrollmentStatus {
  inline val INITIALIZED: "INITIALIZED" = "INITIALIZED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val REGISTERED: "REGISTERED" = "REGISTERED"
  inline val DISASSOCIATING: "DISASSOCIATING" = "DISASSOCIATING"
  inline val DEREGISTERING: "DEREGISTERING" = "DEREGISTERING"

  inline def values: js.Array[EnrollmentStatus] = js.Array(INITIALIZED, PENDING, REGISTERED, DISASSOCIATING, DEREGISTERING)
}

type Feature = "BLUETOOTH" | "VOLUME" | "NOTIFICATIONS" | "LISTS" | "SKILLS" | "NETWORK_PROFILE" | "SETTINGS" | "ALL"
object Feature {
  inline val BLUETOOTH: "BLUETOOTH" = "BLUETOOTH"
  inline val VOLUME: "VOLUME" = "VOLUME"
  inline val NOTIFICATIONS: "NOTIFICATIONS" = "NOTIFICATIONS"
  inline val LISTS: "LISTS" = "LISTS"
  inline val SKILLS: "SKILLS" = "SKILLS"
  inline val NETWORK_PROFILE: "NETWORK_PROFILE" = "NETWORK_PROFILE"
  inline val SETTINGS: "SETTINGS" = "SETTINGS"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[Feature] = js.Array(BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS, NETWORK_PROFILE, SETTINGS, ALL)
}

type Locale = "en-US"
object Locale {
  inline val `en-US`: "en-US" = "en-US"

  inline def values: js.Array[Locale] = js.Array(`en-US`)
}

type NetworkEapMethod = "EAP_TLS"
object NetworkEapMethod {
  inline val EAP_TLS: "EAP_TLS" = "EAP_TLS"

  inline def values: js.Array[NetworkEapMethod] = js.Array(EAP_TLS)
}

type NetworkSecurityType = "OPEN" | "WEP" | "WPA_PSK" | "WPA2_PSK" | "WPA2_ENTERPRISE"
object NetworkSecurityType {
  inline val OPEN: "OPEN" = "OPEN"
  inline val WEP: "WEP" = "WEP"
  inline val WPA_PSK: "WPA_PSK" = "WPA_PSK"
  inline val WPA2_PSK: "WPA2_PSK" = "WPA2_PSK"
  inline val WPA2_ENTERPRISE: "WPA2_ENTERPRISE" = "WPA2_ENTERPRISE"

  inline def values: js.Array[NetworkSecurityType] = js.Array(OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE)
}

type PhoneNumberType = "MOBILE" | "WORK" | "HOME"
object PhoneNumberType {
  inline val MOBILE: "MOBILE" = "MOBILE"
  inline val WORK: "WORK" = "WORK"
  inline val HOME: "HOME" = "HOME"

  inline def values: js.Array[PhoneNumberType] = js.Array(MOBILE, WORK, HOME)
}

type RequirePin = "YES" | "NO" | "OPTIONAL"
object RequirePin {
  inline val YES: "YES" = "YES"
  inline val NO: "NO" = "NO"
  inline val OPTIONAL: "OPTIONAL" = "OPTIONAL"

  inline def values: js.Array[RequirePin] = js.Array(YES, NO, OPTIONAL)
}

type SipType = "WORK"
object SipType {
  inline val WORK: "WORK" = "WORK"

  inline def values: js.Array[SipType] = js.Array(WORK)
}

type SkillType = "PUBLIC" | "PRIVATE"
object SkillType {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val PRIVATE: "PRIVATE" = "PRIVATE"

  inline def values: js.Array[SkillType] = js.Array(PUBLIC, PRIVATE)
}

type SkillTypeFilter = "PUBLIC" | "PRIVATE" | "ALL"
object SkillTypeFilter {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val PRIVATE: "PRIVATE" = "PRIVATE"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[SkillTypeFilter] = js.Array(PUBLIC, PRIVATE, ALL)
}

type SortValue = "ASC" | "DESC"
object SortValue {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[SortValue] = js.Array(ASC, DESC)
}

type TemperatureUnit = "FAHRENHEIT" | "CELSIUS"
object TemperatureUnit {
  inline val FAHRENHEIT: "FAHRENHEIT" = "FAHRENHEIT"
  inline val CELSIUS: "CELSIUS" = "CELSIUS"

  inline def values: js.Array[TemperatureUnit] = js.Array(FAHRENHEIT, CELSIUS)
}

type WakeWord = "ALEXA" | "AMAZON" | "ECHO" | "COMPUTER"
object WakeWord {
  inline val ALEXA: "ALEXA" = "ALEXA"
  inline val AMAZON: "AMAZON" = "AMAZON"
  inline val ECHO: "ECHO" = "ECHO"
  inline val COMPUTER: "COMPUTER" = "COMPUTER"

  inline def values: js.Array[WakeWord] = js.Array(ALEXA, AMAZON, ECHO, COMPUTER)
}
