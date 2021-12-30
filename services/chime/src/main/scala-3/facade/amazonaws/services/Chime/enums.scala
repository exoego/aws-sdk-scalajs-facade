package facade.amazonaws.services.chime

import scalajs.js

type AccountType = "Team" | "EnterpriseDirectory" | "EnterpriseLWA" | "EnterpriseOIDC"
object AccountType {
  inline val Team: "Team" = "Team"
  inline val EnterpriseDirectory: "EnterpriseDirectory" = "EnterpriseDirectory"
  inline val EnterpriseLWA: "EnterpriseLWA" = "EnterpriseLWA"
  inline val EnterpriseOIDC: "EnterpriseOIDC" = "EnterpriseOIDC"

  inline def values: js.Array[AccountType] = js.Array(Team, EnterpriseDirectory, EnterpriseLWA, EnterpriseOIDC)
}

type AppInstanceDataType = "Channel" | "ChannelMessage"
object AppInstanceDataType {
  inline val Channel: "Channel" = "Channel"
  inline val ChannelMessage: "ChannelMessage" = "ChannelMessage"

  inline def values: js.Array[AppInstanceDataType] = js.Array(Channel, ChannelMessage)
}

type BotType = "ChatBot"
object BotType {
  inline val ChatBot: "ChatBot" = "ChatBot"

  inline def values: js.Array[BotType] = js.Array(ChatBot)
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

type EmailStatus = "NotSent" | "Sent" | "Failed"
object EmailStatus {
  inline val NotSent: "NotSent" = "NotSent"
  inline val Sent: "Sent" = "Sent"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[EmailStatus] = js.Array(NotSent, Sent, Failed)
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

type GeoMatchLevel = "Country" | "AreaCode"
object GeoMatchLevel {
  inline val Country: "Country" = "Country"
  inline val AreaCode: "AreaCode" = "AreaCode"

  inline def values: js.Array[GeoMatchLevel] = js.Array(Country, AreaCode)
}

type InviteStatus = "Pending" | "Accepted" | "Failed"
object InviteStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Accepted: "Accepted" = "Accepted"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[InviteStatus] = js.Array(Pending, Accepted, Failed)
}

type License = "Basic" | "Plus" | "Pro" | "ProTrial"
object License {
  inline val Basic: "Basic" = "Basic"
  inline val Plus: "Plus" = "Plus"
  inline val Pro: "Pro" = "Pro"
  inline val ProTrial: "ProTrial" = "ProTrial"

  inline def values: js.Array[License] = js.Array(Basic, Plus, Pro, ProTrial)
}

type MemberType = "User" | "Bot" | "Webhook"
object MemberType {
  inline val User: "User" = "User"
  inline val Bot: "Bot" = "Bot"
  inline val Webhook: "Webhook" = "Webhook"

  inline def values: js.Array[MemberType] = js.Array(User, Bot, Webhook)
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

type PhoneNumberAssociationName = "AccountId" | "UserId" | "VoiceConnectorId" | "VoiceConnectorGroupId" | "SipRuleId"
object PhoneNumberAssociationName {
  inline val AccountId: "AccountId" = "AccountId"
  inline val UserId: "UserId" = "UserId"
  inline val VoiceConnectorId: "VoiceConnectorId" = "VoiceConnectorId"
  inline val VoiceConnectorGroupId: "VoiceConnectorGroupId" = "VoiceConnectorGroupId"
  inline val SipRuleId: "SipRuleId" = "SipRuleId"

  inline def values: js.Array[PhoneNumberAssociationName] = js.Array(AccountId, UserId, VoiceConnectorId, VoiceConnectorGroupId, SipRuleId)
}

type PhoneNumberOrderStatus = "Processing" | "Successful" | "Failed" | "Partial"
object PhoneNumberOrderStatus {
  inline val Processing: "Processing" = "Processing"
  inline val Successful: "Successful" = "Successful"
  inline val Failed: "Failed" = "Failed"
  inline val Partial: "Partial" = "Partial"

  inline def values: js.Array[PhoneNumberOrderStatus] = js.Array(Processing, Successful, Failed, Partial)
}

type PhoneNumberProductType = "BusinessCalling" | "VoiceConnector"
object PhoneNumberProductType {
  inline val BusinessCalling: "BusinessCalling" = "BusinessCalling"
  inline val VoiceConnector: "VoiceConnector" = "VoiceConnector"

  inline def values: js.Array[PhoneNumberProductType] = js.Array(BusinessCalling, VoiceConnector)
}

type PhoneNumberStatus = "AcquireInProgress" | "AcquireFailed" | "Unassigned" | "Assigned" | "ReleaseInProgress" | "DeleteInProgress" | "ReleaseFailed" | "DeleteFailed"
object PhoneNumberStatus {
  inline val AcquireInProgress: "AcquireInProgress" = "AcquireInProgress"
  inline val AcquireFailed: "AcquireFailed" = "AcquireFailed"
  inline val Unassigned: "Unassigned" = "Unassigned"
  inline val Assigned: "Assigned" = "Assigned"
  inline val ReleaseInProgress: "ReleaseInProgress" = "ReleaseInProgress"
  inline val DeleteInProgress: "DeleteInProgress" = "DeleteInProgress"
  inline val ReleaseFailed: "ReleaseFailed" = "ReleaseFailed"
  inline val DeleteFailed: "DeleteFailed" = "DeleteFailed"

  inline def values: js.Array[PhoneNumberStatus] = js.Array(AcquireInProgress, AcquireFailed, Unassigned, Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed, DeleteFailed)
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

type RegistrationStatus = "Unregistered" | "Registered" | "Suspended"
object RegistrationStatus {
  inline val Unregistered: "Unregistered" = "Unregistered"
  inline val Registered: "Registered" = "Registered"
  inline val Suspended: "Suspended" = "Suspended"

  inline def values: js.Array[RegistrationStatus] = js.Array(Unregistered, Registered, Suspended)
}

type RoomMembershipRole = "Administrator" | "Member"
object RoomMembershipRole {
  inline val Administrator: "Administrator" = "Administrator"
  inline val Member: "Member" = "Member"

  inline def values: js.Array[RoomMembershipRole] = js.Array(Administrator, Member)
}

type SipRuleTriggerType = "ToPhoneNumber" | "RequestUriHostname"
object SipRuleTriggerType {
  inline val ToPhoneNumber: "ToPhoneNumber" = "ToPhoneNumber"
  inline val RequestUriHostname: "RequestUriHostname" = "RequestUriHostname"

  inline def values: js.Array[SipRuleTriggerType] = js.Array(ToPhoneNumber, RequestUriHostname)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

type UserType = "PrivateUser" | "SharedDevice"
object UserType {
  inline val PrivateUser: "PrivateUser" = "PrivateUser"
  inline val SharedDevice: "SharedDevice" = "SharedDevice"

  inline def values: js.Array[UserType] = js.Array(PrivateUser, SharedDevice)
}

type VoiceConnectorAwsRegion = "us-east-1" | "us-west-2"
object VoiceConnectorAwsRegion {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"

  inline def values: js.Array[VoiceConnectorAwsRegion] = js.Array(`us-east-1`, `us-west-2`)
}
