package facade.amazonaws.services.chimesdkvoice

import scalajs.js

@js.native
sealed trait AlexaSkillStatus extends js.Any
object AlexaSkillStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AlexaSkillStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AlexaSkillStatus]

  @inline def values: js.Array[AlexaSkillStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait CallingNameStatus extends js.Any
object CallingNameStatus {
  val Unassigned = "Unassigned".asInstanceOf[CallingNameStatus]
  val UpdateInProgress = "UpdateInProgress".asInstanceOf[CallingNameStatus]
  val UpdateSucceeded = "UpdateSucceeded".asInstanceOf[CallingNameStatus]
  val UpdateFailed = "UpdateFailed".asInstanceOf[CallingNameStatus]

  @inline def values: js.Array[CallingNameStatus] = js.Array(Unassigned, UpdateInProgress, UpdateSucceeded, UpdateFailed)
}

@js.native
sealed trait Capability extends js.Any
object Capability {
  val Voice = "Voice".asInstanceOf[Capability]
  val SMS = "SMS".asInstanceOf[Capability]

  @inline def values: js.Array[Capability] = js.Array(Voice, SMS)
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
  val Gone = "Gone".asInstanceOf[ErrorCode]

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
    PhoneNumberAssociationsExist,
    Gone
  )
}

@js.native
sealed trait GeoMatchLevel extends js.Any
object GeoMatchLevel {
  val Country = "Country".asInstanceOf[GeoMatchLevel]
  val AreaCode = "AreaCode".asInstanceOf[GeoMatchLevel]

  @inline def values: js.Array[GeoMatchLevel] = js.Array(Country, AreaCode)
}

@js.native
sealed trait NotificationTarget extends js.Any
object NotificationTarget {
  val EventBridge = "EventBridge".asInstanceOf[NotificationTarget]
  val SNS = "SNS".asInstanceOf[NotificationTarget]
  val SQS = "SQS".asInstanceOf[NotificationTarget]

  @inline def values: js.Array[NotificationTarget] = js.Array(EventBridge, SNS, SQS)
}

@js.native
sealed trait NumberSelectionBehavior extends js.Any
object NumberSelectionBehavior {
  val PreferSticky = "PreferSticky".asInstanceOf[NumberSelectionBehavior]
  val AvoidSticky = "AvoidSticky".asInstanceOf[NumberSelectionBehavior]

  @inline def values: js.Array[NumberSelectionBehavior] = js.Array(PreferSticky, AvoidSticky)
}

@js.native
sealed trait OrderedPhoneNumberStatus extends js.Any
object OrderedPhoneNumberStatus {
  val Processing = "Processing".asInstanceOf[OrderedPhoneNumberStatus]
  val Acquired = "Acquired".asInstanceOf[OrderedPhoneNumberStatus]
  val Failed = "Failed".asInstanceOf[OrderedPhoneNumberStatus]

  @inline def values: js.Array[OrderedPhoneNumberStatus] = js.Array(Processing, Acquired, Failed)
}

@js.native
sealed trait OriginationRouteProtocol extends js.Any
object OriginationRouteProtocol {
  val TCP = "TCP".asInstanceOf[OriginationRouteProtocol]
  val UDP = "UDP".asInstanceOf[OriginationRouteProtocol]

  @inline def values: js.Array[OriginationRouteProtocol] = js.Array(TCP, UDP)
}

@js.native
sealed trait PhoneNumberAssociationName extends js.Any
object PhoneNumberAssociationName {
  val VoiceConnectorId = "VoiceConnectorId".asInstanceOf[PhoneNumberAssociationName]
  val VoiceConnectorGroupId = "VoiceConnectorGroupId".asInstanceOf[PhoneNumberAssociationName]
  val SipRuleId = "SipRuleId".asInstanceOf[PhoneNumberAssociationName]

  @inline def values: js.Array[PhoneNumberAssociationName] = js.Array(VoiceConnectorId, VoiceConnectorGroupId, SipRuleId)
}

@js.native
sealed trait PhoneNumberOrderStatus extends js.Any
object PhoneNumberOrderStatus {
  val Processing = "Processing".asInstanceOf[PhoneNumberOrderStatus]
  val Successful = "Successful".asInstanceOf[PhoneNumberOrderStatus]
  val Failed = "Failed".asInstanceOf[PhoneNumberOrderStatus]
  val Partial = "Partial".asInstanceOf[PhoneNumberOrderStatus]
  val PendingDocuments = "PendingDocuments".asInstanceOf[PhoneNumberOrderStatus]
  val Submitted = "Submitted".asInstanceOf[PhoneNumberOrderStatus]
  val FOC = "FOC".asInstanceOf[PhoneNumberOrderStatus]
  val ChangeRequested = "ChangeRequested".asInstanceOf[PhoneNumberOrderStatus]
  val Exception = "Exception".asInstanceOf[PhoneNumberOrderStatus]
  val CancelRequested = "CancelRequested".asInstanceOf[PhoneNumberOrderStatus]
  val Cancelled = "Cancelled".asInstanceOf[PhoneNumberOrderStatus]

  @inline def values: js.Array[PhoneNumberOrderStatus] = js.Array(Processing, Successful, Failed, Partial, PendingDocuments, Submitted, FOC, ChangeRequested, Exception, CancelRequested, Cancelled)
}

@js.native
sealed trait PhoneNumberOrderType extends js.Any
object PhoneNumberOrderType {
  val New = "New".asInstanceOf[PhoneNumberOrderType]
  val Porting = "Porting".asInstanceOf[PhoneNumberOrderType]

  @inline def values: js.Array[PhoneNumberOrderType] = js.Array(New, Porting)
}

@js.native
sealed trait PhoneNumberProductType extends js.Any
object PhoneNumberProductType {
  val VoiceConnector = "VoiceConnector".asInstanceOf[PhoneNumberProductType]
  val SipMediaApplicationDialIn = "SipMediaApplicationDialIn".asInstanceOf[PhoneNumberProductType]

  @inline def values: js.Array[PhoneNumberProductType] = js.Array(VoiceConnector, SipMediaApplicationDialIn)
}

@js.native
sealed trait PhoneNumberStatus extends js.Any
object PhoneNumberStatus {
  val Cancelled = "Cancelled".asInstanceOf[PhoneNumberStatus]
  val PortinCancelRequested = "PortinCancelRequested".asInstanceOf[PhoneNumberStatus]
  val PortinInProgress = "PortinInProgress".asInstanceOf[PhoneNumberStatus]
  val AcquireInProgress = "AcquireInProgress".asInstanceOf[PhoneNumberStatus]
  val AcquireFailed = "AcquireFailed".asInstanceOf[PhoneNumberStatus]
  val Unassigned = "Unassigned".asInstanceOf[PhoneNumberStatus]
  val Assigned = "Assigned".asInstanceOf[PhoneNumberStatus]
  val ReleaseInProgress = "ReleaseInProgress".asInstanceOf[PhoneNumberStatus]
  val DeleteInProgress = "DeleteInProgress".asInstanceOf[PhoneNumberStatus]
  val ReleaseFailed = "ReleaseFailed".asInstanceOf[PhoneNumberStatus]
  val DeleteFailed = "DeleteFailed".asInstanceOf[PhoneNumberStatus]

  @inline def values: js.Array[PhoneNumberStatus] = js.Array(
    Cancelled,
    PortinCancelRequested,
    PortinInProgress,
    AcquireInProgress,
    AcquireFailed,
    Unassigned,
    Assigned,
    ReleaseInProgress,
    DeleteInProgress,
    ReleaseFailed,
    DeleteFailed
  )
}

@js.native
sealed trait PhoneNumberType extends js.Any
object PhoneNumberType {
  val Local = "Local".asInstanceOf[PhoneNumberType]
  val TollFree = "TollFree".asInstanceOf[PhoneNumberType]

  @inline def values: js.Array[PhoneNumberType] = js.Array(Local, TollFree)
}

@js.native
sealed trait ProxySessionStatus extends js.Any
object ProxySessionStatus {
  val Open = "Open".asInstanceOf[ProxySessionStatus]
  val InProgress = "InProgress".asInstanceOf[ProxySessionStatus]
  val Closed = "Closed".asInstanceOf[ProxySessionStatus]

  @inline def values: js.Array[ProxySessionStatus] = js.Array(Open, InProgress, Closed)
}

@js.native
sealed trait SipRuleTriggerType extends js.Any
object SipRuleTriggerType {
  val ToPhoneNumber = "ToPhoneNumber".asInstanceOf[SipRuleTriggerType]
  val RequestUriHostname = "RequestUriHostname".asInstanceOf[SipRuleTriggerType]

  @inline def values: js.Array[SipRuleTriggerType] = js.Array(ToPhoneNumber, RequestUriHostname)
}

@js.native
sealed trait VoiceConnectorAwsRegion extends js.Any
object VoiceConnectorAwsRegion {
  val `us-east-1` = "us-east-1".asInstanceOf[VoiceConnectorAwsRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[VoiceConnectorAwsRegion]
  val `ca-central-1` = "ca-central-1".asInstanceOf[VoiceConnectorAwsRegion]
  val `eu-central-1` = "eu-central-1".asInstanceOf[VoiceConnectorAwsRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[VoiceConnectorAwsRegion]
  val `eu-west-2` = "eu-west-2".asInstanceOf[VoiceConnectorAwsRegion]
  val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[VoiceConnectorAwsRegion]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[VoiceConnectorAwsRegion]
  val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[VoiceConnectorAwsRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[VoiceConnectorAwsRegion]

  @inline def values: js.Array[VoiceConnectorAwsRegion] = js.Array(`us-east-1`, `us-west-2`, `ca-central-1`, `eu-central-1`, `eu-west-1`, `eu-west-2`, `ap-northeast-2`, `ap-northeast-1`, `ap-southeast-1`, `ap-southeast-2`)
}
