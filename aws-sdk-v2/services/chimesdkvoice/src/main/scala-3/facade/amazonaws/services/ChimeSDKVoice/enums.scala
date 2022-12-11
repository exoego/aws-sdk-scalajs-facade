package facade.amazonaws.services.chimesdkvoice

import scalajs.js

type AlexaSkillStatus = "ACTIVE" | "INACTIVE"
object AlexaSkillStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[AlexaSkillStatus] = js.Array(ACTIVE, INACTIVE)
}

type CallingNameStatus = "Unassigned" | "UpdateInProgress" | "UpdateSucceeded" | "UpdateFailed"
object CallingNameStatus {
  inline val Unassigned: "Unassigned" = "Unassigned"
  inline val UpdateInProgress: "UpdateInProgress" = "UpdateInProgress"
  inline val UpdateSucceeded: "UpdateSucceeded" = "UpdateSucceeded"
  inline val UpdateFailed: "UpdateFailed" = "UpdateFailed"

  inline def values: js.Array[CallingNameStatus] = js.Array(Unassigned, UpdateInProgress, UpdateSucceeded, UpdateFailed)
}

type Capability = "Voice" | "SMS"
object Capability {
  inline val Voice: "Voice" = "Voice"
  inline val SMS: "SMS" = "SMS"

  inline def values: js.Array[Capability] = js.Array(Voice, SMS)
}

type ErrorCode = "BadRequest" | "Conflict" | "Forbidden" | "NotFound" | "PreconditionFailed" | "ResourceLimitExceeded" | "ServiceFailure" | "AccessDenied" | "ServiceUnavailable" | "Throttled" | "Throttling" | "Unauthorized" | "Unprocessable" | "VoiceConnectorGroupAssociationsExist" | "PhoneNumberAssociationsExist" | "Gone"
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
  inline val Gone: "Gone" = "Gone"

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
    PhoneNumberAssociationsExist,
    Gone
  )
}

type GeoMatchLevel = "Country" | "AreaCode"
object GeoMatchLevel {
  inline val Country: "Country" = "Country"
  inline val AreaCode: "AreaCode" = "AreaCode"

  inline def values: js.Array[GeoMatchLevel] = js.Array(Country, AreaCode)
}

type NotificationTarget = "EventBridge" | "SNS" | "SQS"
object NotificationTarget {
  inline val EventBridge: "EventBridge" = "EventBridge"
  inline val SNS: "SNS" = "SNS"
  inline val SQS: "SQS" = "SQS"

  inline def values: js.Array[NotificationTarget] = js.Array(EventBridge, SNS, SQS)
}

type NumberSelectionBehavior = "PreferSticky" | "AvoidSticky"
object NumberSelectionBehavior {
  inline val PreferSticky: "PreferSticky" = "PreferSticky"
  inline val AvoidSticky: "AvoidSticky" = "AvoidSticky"

  inline def values: js.Array[NumberSelectionBehavior] = js.Array(PreferSticky, AvoidSticky)
}

type OrderedPhoneNumberStatus = "Processing" | "Acquired" | "Failed"
object OrderedPhoneNumberStatus {
  inline val Processing: "Processing" = "Processing"
  inline val Acquired: "Acquired" = "Acquired"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[OrderedPhoneNumberStatus] = js.Array(Processing, Acquired, Failed)
}

type OriginationRouteProtocol = "TCP" | "UDP"
object OriginationRouteProtocol {
  inline val TCP: "TCP" = "TCP"
  inline val UDP: "UDP" = "UDP"

  inline def values: js.Array[OriginationRouteProtocol] = js.Array(TCP, UDP)
}

type PhoneNumberAssociationName = "VoiceConnectorId" | "VoiceConnectorGroupId" | "SipRuleId"
object PhoneNumberAssociationName {
  inline val VoiceConnectorId: "VoiceConnectorId" = "VoiceConnectorId"
  inline val VoiceConnectorGroupId: "VoiceConnectorGroupId" = "VoiceConnectorGroupId"
  inline val SipRuleId: "SipRuleId" = "SipRuleId"

  inline def values: js.Array[PhoneNumberAssociationName] = js.Array(VoiceConnectorId, VoiceConnectorGroupId, SipRuleId)
}

type PhoneNumberOrderStatus = "Processing" | "Successful" | "Failed" | "Partial" | "PendingDocuments" | "Submitted" | "FOC" | "ChangeRequested" | "Exception" | "CancelRequested" | "Cancelled"
object PhoneNumberOrderStatus {
  inline val Processing: "Processing" = "Processing"
  inline val Successful: "Successful" = "Successful"
  inline val Failed: "Failed" = "Failed"
  inline val Partial: "Partial" = "Partial"
  inline val PendingDocuments: "PendingDocuments" = "PendingDocuments"
  inline val Submitted: "Submitted" = "Submitted"
  inline val FOC: "FOC" = "FOC"
  inline val ChangeRequested: "ChangeRequested" = "ChangeRequested"
  inline val Exception: "Exception" = "Exception"
  inline val CancelRequested: "CancelRequested" = "CancelRequested"
  inline val Cancelled: "Cancelled" = "Cancelled"

  inline def values: js.Array[PhoneNumberOrderStatus] = js.Array(Processing, Successful, Failed, Partial, PendingDocuments, Submitted, FOC, ChangeRequested, Exception, CancelRequested, Cancelled)
}

type PhoneNumberOrderType = "New" | "Porting"
object PhoneNumberOrderType {
  inline val New: "New" = "New"
  inline val Porting: "Porting" = "Porting"

  inline def values: js.Array[PhoneNumberOrderType] = js.Array(New, Porting)
}

type PhoneNumberProductType = "VoiceConnector" | "SipMediaApplicationDialIn"
object PhoneNumberProductType {
  inline val VoiceConnector: "VoiceConnector" = "VoiceConnector"
  inline val SipMediaApplicationDialIn: "SipMediaApplicationDialIn" = "SipMediaApplicationDialIn"

  inline def values: js.Array[PhoneNumberProductType] = js.Array(VoiceConnector, SipMediaApplicationDialIn)
}

type PhoneNumberStatus = "Cancelled" | "PortinCancelRequested" | "PortinInProgress" | "AcquireInProgress" | "AcquireFailed" | "Unassigned" | "Assigned" | "ReleaseInProgress" | "DeleteInProgress" | "ReleaseFailed" | "DeleteFailed"
object PhoneNumberStatus {
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val PortinCancelRequested: "PortinCancelRequested" = "PortinCancelRequested"
  inline val PortinInProgress: "PortinInProgress" = "PortinInProgress"
  inline val AcquireInProgress: "AcquireInProgress" = "AcquireInProgress"
  inline val AcquireFailed: "AcquireFailed" = "AcquireFailed"
  inline val Unassigned: "Unassigned" = "Unassigned"
  inline val Assigned: "Assigned" = "Assigned"
  inline val ReleaseInProgress: "ReleaseInProgress" = "ReleaseInProgress"
  inline val DeleteInProgress: "DeleteInProgress" = "DeleteInProgress"
  inline val ReleaseFailed: "ReleaseFailed" = "ReleaseFailed"
  inline val DeleteFailed: "DeleteFailed" = "DeleteFailed"

  inline def values: js.Array[PhoneNumberStatus] = js.Array(
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

type PhoneNumberType = "Local" | "TollFree"
object PhoneNumberType {
  inline val Local: "Local" = "Local"
  inline val TollFree: "TollFree" = "TollFree"

  inline def values: js.Array[PhoneNumberType] = js.Array(Local, TollFree)
}

type ProxySessionStatus = "Open" | "InProgress" | "Closed"
object ProxySessionStatus {
  inline val Open: "Open" = "Open"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Closed: "Closed" = "Closed"

  inline def values: js.Array[ProxySessionStatus] = js.Array(Open, InProgress, Closed)
}

type SipRuleTriggerType = "ToPhoneNumber" | "RequestUriHostname"
object SipRuleTriggerType {
  inline val ToPhoneNumber: "ToPhoneNumber" = "ToPhoneNumber"
  inline val RequestUriHostname: "RequestUriHostname" = "RequestUriHostname"

  inline def values: js.Array[SipRuleTriggerType] = js.Array(ToPhoneNumber, RequestUriHostname)
}

type VoiceConnectorAwsRegion = "us-east-1" | "us-west-2" | "ca-central-1" | "eu-central-1" | "eu-west-1" | "eu-west-2" | "ap-northeast-2" | "ap-northeast-1" | "ap-southeast-1" | "ap-southeast-2"
object VoiceConnectorAwsRegion {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `eu-west-2`: "eu-west-2" = "eu-west-2"
  inline val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"

  inline def values: js.Array[VoiceConnectorAwsRegion] = js.Array(`us-east-1`, `us-west-2`, `ca-central-1`, `eu-central-1`, `eu-west-1`, `eu-west-2`, `ap-northeast-2`, `ap-northeast-1`, `ap-southeast-1`, `ap-southeast-2`)
}
