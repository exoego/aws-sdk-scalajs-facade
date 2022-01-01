package facade.amazonaws.services.chimesdkmessaging

import scalajs.js

type AllowNotifications = "ALL" | "NONE" | "FILTERED"
object AllowNotifications {
  inline val ALL: "ALL" = "ALL"
  inline val NONE: "NONE" = "NONE"
  inline val FILTERED: "FILTERED" = "FILTERED"

  inline def values: js.Array[AllowNotifications] = js.Array(ALL, NONE, FILTERED)
}

type ChannelMembershipType = "DEFAULT" | "HIDDEN"
object ChannelMembershipType {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val HIDDEN: "HIDDEN" = "HIDDEN"

  inline def values: js.Array[ChannelMembershipType] = js.Array(DEFAULT, HIDDEN)
}

type ChannelMessagePersistenceType = "PERSISTENT" | "NON_PERSISTENT"
object ChannelMessagePersistenceType {
  inline val PERSISTENT: "PERSISTENT" = "PERSISTENT"
  inline val NON_PERSISTENT: "NON_PERSISTENT" = "NON_PERSISTENT"

  inline def values: js.Array[ChannelMessagePersistenceType] = js.Array(PERSISTENT, NON_PERSISTENT)
}

type ChannelMessageStatus = "SENT" | "PENDING" | "FAILED" | "DENIED"
object ChannelMessageStatus {
  inline val SENT: "SENT" = "SENT"
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DENIED: "DENIED" = "DENIED"

  inline def values: js.Array[ChannelMessageStatus] = js.Array(SENT, PENDING, FAILED, DENIED)
}

type ChannelMessageType = "STANDARD" | "CONTROL"
object ChannelMessageType {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val CONTROL: "CONTROL" = "CONTROL"

  inline def values: js.Array[ChannelMessageType] = js.Array(STANDARD, CONTROL)
}

type ChannelMode = "UNRESTRICTED" | "RESTRICTED"
object ChannelMode {
  inline val UNRESTRICTED: "UNRESTRICTED" = "UNRESTRICTED"
  inline val RESTRICTED: "RESTRICTED" = "RESTRICTED"

  inline def values: js.Array[ChannelMode] = js.Array(UNRESTRICTED, RESTRICTED)
}

type ChannelPrivacy = "PUBLIC" | "PRIVATE"
object ChannelPrivacy {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val PRIVATE: "PRIVATE" = "PRIVATE"

  inline def values: js.Array[ChannelPrivacy] = js.Array(PUBLIC, PRIVATE)
}

type ErrorCode = "BadRequest" | "Conflict" | "Forbidden" | "NotFound" | "PreconditionFailed" | "ResourceLimitExceeded" | "ServiceFailure" | "AccessDenied" | "ServiceUnavailable" | "Throttled" | "Throttling" | "Unauthorized" | "Unprocessable" | "VoiceConnectorGroupAssociationsExist" | "PhoneNumberAssociationsExist"
object ErrorCode {
  inline val BadRequest: "BadRequest" = "BadRequest"
  inline val Conflict: "Conflict" = "Conflict"
  inline val Forbidden: "Forbidden" = "Forbidden"
  inline val NotFound: "NotFound" = "NotFound"
  inline val PreconditionFailed: "PreconditionFailed" = "PreconditionFailed"
  inline val ResourceLimitExceeded: "ResourceLimitExceeded" = "ResourceLimitExceeded"
  inline val ServiceFailure: "ServiceFailure" = "ServiceFailure"
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val ServiceUnavailable: "ServiceUnavailable" = "ServiceUnavailable"
  inline val Throttled: "Throttled" = "Throttled"
  inline val Throttling: "Throttling" = "Throttling"
  inline val Unauthorized: "Unauthorized" = "Unauthorized"
  inline val Unprocessable: "Unprocessable" = "Unprocessable"
  inline val VoiceConnectorGroupAssociationsExist: "VoiceConnectorGroupAssociationsExist" = "VoiceConnectorGroupAssociationsExist"
  inline val PhoneNumberAssociationsExist: "PhoneNumberAssociationsExist" = "PhoneNumberAssociationsExist"

  inline def values: js.Array[ErrorCode] = js.Array(
    BadRequest,
    Conflict,
    Forbidden,
    NotFound,
    PreconditionFailed,
    ResourceLimitExceeded,
    ServiceFailure,
    AccessDenied,
    ServiceUnavailable,
    Throttled,
    Throttling,
    Unauthorized,
    Unprocessable,
    VoiceConnectorGroupAssociationsExist,
    PhoneNumberAssociationsExist
  )
}

type FallbackAction = "CONTINUE" | "ABORT"
object FallbackAction {
  inline val CONTINUE: "CONTINUE" = "CONTINUE"
  inline val ABORT: "ABORT" = "ABORT"

  inline def values: js.Array[FallbackAction] = js.Array(CONTINUE, ABORT)
}

type InvocationType = "ASYNC"
object InvocationType {
  inline val ASYNC: "ASYNC" = "ASYNC"

  inline def values: js.Array[InvocationType] = js.Array(ASYNC)
}

type PushNotificationType = "DEFAULT" | "VOIP"
object PushNotificationType {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val VOIP: "VOIP" = "VOIP"

  inline def values: js.Array[PushNotificationType] = js.Array(DEFAULT, VOIP)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}
