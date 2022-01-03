package facade.amazonaws.services.chimesdkmessaging

import scalajs.js

@js.native
sealed trait AllowNotifications extends js.Any
object AllowNotifications {
  val ALL = "ALL".asInstanceOf[AllowNotifications]
  val NONE = "NONE".asInstanceOf[AllowNotifications]
  val FILTERED = "FILTERED".asInstanceOf[AllowNotifications]

  @inline def values: js.Array[AllowNotifications] = js.Array(ALL, NONE, FILTERED)
}

@js.native
sealed trait ChannelMembershipType extends js.Any
object ChannelMembershipType {
  val DEFAULT = "DEFAULT".asInstanceOf[ChannelMembershipType]
  val HIDDEN = "HIDDEN".asInstanceOf[ChannelMembershipType]

  @inline def values: js.Array[ChannelMembershipType] = js.Array(DEFAULT, HIDDEN)
}

@js.native
sealed trait ChannelMessagePersistenceType extends js.Any
object ChannelMessagePersistenceType {
  val PERSISTENT = "PERSISTENT".asInstanceOf[ChannelMessagePersistenceType]
  val NON_PERSISTENT = "NON_PERSISTENT".asInstanceOf[ChannelMessagePersistenceType]

  @inline def values: js.Array[ChannelMessagePersistenceType] = js.Array(PERSISTENT, NON_PERSISTENT)
}

@js.native
sealed trait ChannelMessageStatus extends js.Any
object ChannelMessageStatus {
  val SENT = "SENT".asInstanceOf[ChannelMessageStatus]
  val PENDING = "PENDING".asInstanceOf[ChannelMessageStatus]
  val FAILED = "FAILED".asInstanceOf[ChannelMessageStatus]
  val DENIED = "DENIED".asInstanceOf[ChannelMessageStatus]

  @inline def values: js.Array[ChannelMessageStatus] = js.Array(SENT, PENDING, FAILED, DENIED)
}

@js.native
sealed trait ChannelMessageType extends js.Any
object ChannelMessageType {
  val STANDARD = "STANDARD".asInstanceOf[ChannelMessageType]
  val CONTROL = "CONTROL".asInstanceOf[ChannelMessageType]

  @inline def values: js.Array[ChannelMessageType] = js.Array(STANDARD, CONTROL)
}

@js.native
sealed trait ChannelMode extends js.Any
object ChannelMode {
  val UNRESTRICTED = "UNRESTRICTED".asInstanceOf[ChannelMode]
  val RESTRICTED = "RESTRICTED".asInstanceOf[ChannelMode]

  @inline def values: js.Array[ChannelMode] = js.Array(UNRESTRICTED, RESTRICTED)
}

@js.native
sealed trait ChannelPrivacy extends js.Any
object ChannelPrivacy {
  val PUBLIC = "PUBLIC".asInstanceOf[ChannelPrivacy]
  val PRIVATE = "PRIVATE".asInstanceOf[ChannelPrivacy]

  @inline def values: js.Array[ChannelPrivacy] = js.Array(PUBLIC, PRIVATE)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val BadRequest = "BadRequest".asInstanceOf[ErrorCode]
  val Conflict = "Conflict".asInstanceOf[ErrorCode]
  val Forbidden = "Forbidden".asInstanceOf[ErrorCode]
  val NotFound = "NotFound".asInstanceOf[ErrorCode]
  val PreconditionFailed = "PreconditionFailed".asInstanceOf[ErrorCode]
  val ResourceLimitExceeded = "ResourceLimitExceeded".asInstanceOf[ErrorCode]
  val ServiceFailure = "ServiceFailure".asInstanceOf[ErrorCode]
  val AccessDenied = "AccessDenied".asInstanceOf[ErrorCode]
  val ServiceUnavailable = "ServiceUnavailable".asInstanceOf[ErrorCode]
  val Throttled = "Throttled".asInstanceOf[ErrorCode]
  val Throttling = "Throttling".asInstanceOf[ErrorCode]
  val Unauthorized = "Unauthorized".asInstanceOf[ErrorCode]
  val Unprocessable = "Unprocessable".asInstanceOf[ErrorCode]
  val VoiceConnectorGroupAssociationsExist = "VoiceConnectorGroupAssociationsExist".asInstanceOf[ErrorCode]
  val PhoneNumberAssociationsExist = "PhoneNumberAssociationsExist".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(
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

@js.native
sealed trait FallbackAction extends js.Any
object FallbackAction {
  val CONTINUE = "CONTINUE".asInstanceOf[FallbackAction]
  val ABORT = "ABORT".asInstanceOf[FallbackAction]

  @inline def values: js.Array[FallbackAction] = js.Array(CONTINUE, ABORT)
}

@js.native
sealed trait InvocationType extends js.Any
object InvocationType {
  val ASYNC = "ASYNC".asInstanceOf[InvocationType]

  @inline def values: js.Array[InvocationType] = js.Array(ASYNC)
}

@js.native
sealed trait PushNotificationType extends js.Any
object PushNotificationType {
  val DEFAULT = "DEFAULT".asInstanceOf[PushNotificationType]
  val VOIP = "VOIP".asInstanceOf[PushNotificationType]

  @inline def values: js.Array[PushNotificationType] = js.Array(DEFAULT, VOIP)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}
