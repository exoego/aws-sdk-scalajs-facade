package facade.amazonaws.services.chime

import scalajs._

type AccountType = "Team" | "EnterpriseDirectory" | "EnterpriseLWA" | "EnterpriseOIDC"
object AccountType {
  val Team: "Team" = "Team"
  val EnterpriseDirectory: "EnterpriseDirectory" = "EnterpriseDirectory"
  val EnterpriseLWA: "EnterpriseLWA" = "EnterpriseLWA"
  val EnterpriseOIDC: "EnterpriseOIDC" = "EnterpriseOIDC"

  @inline def values = js.Array[AccountType](Team, EnterpriseDirectory, EnterpriseLWA, EnterpriseOIDC)
}

type AppInstanceDataType = "Channel" | "ChannelMessage"
object AppInstanceDataType {
  val Channel: "Channel" = "Channel"
  val ChannelMessage: "ChannelMessage" = "ChannelMessage"

  @inline def values = js.Array[AppInstanceDataType](Channel, ChannelMessage)
}

type BotType = "ChatBot"
object BotType {
  val ChatBot: "ChatBot" = "ChatBot"

  @inline def values = js.Array[BotType](ChatBot)
}

type CallingNameStatus = "Unassigned" | "UpdateInProgress" | "UpdateSucceeded" | "UpdateFailed"
object CallingNameStatus {
  val Unassigned: "Unassigned" = "Unassigned"
  val UpdateInProgress: "UpdateInProgress" = "UpdateInProgress"
  val UpdateSucceeded: "UpdateSucceeded" = "UpdateSucceeded"
  val UpdateFailed: "UpdateFailed" = "UpdateFailed"

  @inline def values = js.Array[CallingNameStatus](Unassigned, UpdateInProgress, UpdateSucceeded, UpdateFailed)
}

type Capability = "Voice" | "SMS"
object Capability {
  val Voice: "Voice" = "Voice"
  val SMS: "SMS" = "SMS"

  @inline def values = js.Array[Capability](Voice, SMS)
}

type ChannelMembershipType = "DEFAULT" | "HIDDEN"
object ChannelMembershipType {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val HIDDEN: "HIDDEN" = "HIDDEN"

  @inline def values = js.Array[ChannelMembershipType](DEFAULT, HIDDEN)
}

type ChannelMessagePersistenceType = "PERSISTENT" | "NON_PERSISTENT"
object ChannelMessagePersistenceType {
  val PERSISTENT: "PERSISTENT" = "PERSISTENT"
  val NON_PERSISTENT: "NON_PERSISTENT" = "NON_PERSISTENT"

  @inline def values = js.Array[ChannelMessagePersistenceType](PERSISTENT, NON_PERSISTENT)
}

type ChannelMessageType = "STANDARD" | "CONTROL"
object ChannelMessageType {
  val STANDARD: "STANDARD" = "STANDARD"
  val CONTROL: "CONTROL" = "CONTROL"

  @inline def values = js.Array[ChannelMessageType](STANDARD, CONTROL)
}

type ChannelMode = "UNRESTRICTED" | "RESTRICTED"
object ChannelMode {
  val UNRESTRICTED: "UNRESTRICTED" = "UNRESTRICTED"
  val RESTRICTED: "RESTRICTED" = "RESTRICTED"

  @inline def values = js.Array[ChannelMode](UNRESTRICTED, RESTRICTED)
}

type ChannelPrivacy = "PUBLIC" | "PRIVATE"
object ChannelPrivacy {
  val PUBLIC: "PUBLIC" = "PUBLIC"
  val PRIVATE: "PRIVATE" = "PRIVATE"

  @inline def values = js.Array[ChannelPrivacy](PUBLIC, PRIVATE)
}

type EmailStatus = "NotSent" | "Sent" | "Failed"
object EmailStatus {
  val NotSent: "NotSent" = "NotSent"
  val Sent: "Sent" = "Sent"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[EmailStatus](NotSent, Sent, Failed)
}

type ErrorCode = "BadRequest" | "Conflict" | "Forbidden" | "NotFound" | "PreconditionFailed" | "ResourceLimitExceeded" | "ServiceFailure" | "AccessDenied" | "ServiceUnavailable" | "Throttled" | "Throttling" | "Unauthorized" | "Unprocessable" | "VoiceConnectorGroupAssociationsExist" | "PhoneNumberAssociationsExist"
object ErrorCode {
  val BadRequest: "BadRequest" = "BadRequest"
  val Conflict: "Conflict" = "Conflict"
  val Forbidden: "Forbidden" = "Forbidden"
  val NotFound: "NotFound" = "NotFound"
  val PreconditionFailed: "PreconditionFailed" = "PreconditionFailed"
  val ResourceLimitExceeded: "ResourceLimitExceeded" = "ResourceLimitExceeded"
  val ServiceFailure: "ServiceFailure" = "ServiceFailure"
  val AccessDenied: "AccessDenied" = "AccessDenied"
  val ServiceUnavailable: "ServiceUnavailable" = "ServiceUnavailable"
  val Throttled: "Throttled" = "Throttled"
  val Throttling: "Throttling" = "Throttling"
  val Unauthorized: "Unauthorized" = "Unauthorized"
  val Unprocessable: "Unprocessable" = "Unprocessable"
  val VoiceConnectorGroupAssociationsExist: "VoiceConnectorGroupAssociationsExist" = "VoiceConnectorGroupAssociationsExist"
  val PhoneNumberAssociationsExist: "PhoneNumberAssociationsExist" = "PhoneNumberAssociationsExist"

  @inline def values = js.Array[ErrorCode](
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
  val Country: "Country" = "Country"
  val AreaCode: "AreaCode" = "AreaCode"

  @inline def values = js.Array[GeoMatchLevel](Country, AreaCode)
}

type InviteStatus = "Pending" | "Accepted" | "Failed"
object InviteStatus {
  val Pending: "Pending" = "Pending"
  val Accepted: "Accepted" = "Accepted"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[InviteStatus](Pending, Accepted, Failed)
}

type License = "Basic" | "Plus" | "Pro" | "ProTrial"
object License {
  val Basic: "Basic" = "Basic"
  val Plus: "Plus" = "Plus"
  val Pro: "Pro" = "Pro"
  val ProTrial: "ProTrial" = "ProTrial"

  @inline def values = js.Array[License](Basic, Plus, Pro, ProTrial)
}

type MemberType = "User" | "Bot" | "Webhook"
object MemberType {
  val User: "User" = "User"
  val Bot: "Bot" = "Bot"
  val Webhook: "Webhook" = "Webhook"

  @inline def values = js.Array[MemberType](User, Bot, Webhook)
}

type NotificationTarget = "EventBridge" | "SNS" | "SQS"
object NotificationTarget {
  val EventBridge: "EventBridge" = "EventBridge"
  val SNS: "SNS" = "SNS"
  val SQS: "SQS" = "SQS"

  @inline def values = js.Array[NotificationTarget](EventBridge, SNS, SQS)
}

type NumberSelectionBehavior = "PreferSticky" | "AvoidSticky"
object NumberSelectionBehavior {
  val PreferSticky: "PreferSticky" = "PreferSticky"
  val AvoidSticky: "AvoidSticky" = "AvoidSticky"

  @inline def values = js.Array[NumberSelectionBehavior](PreferSticky, AvoidSticky)
}

type OrderedPhoneNumberStatus = "Processing" | "Acquired" | "Failed"
object OrderedPhoneNumberStatus {
  val Processing: "Processing" = "Processing"
  val Acquired: "Acquired" = "Acquired"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[OrderedPhoneNumberStatus](Processing, Acquired, Failed)
}

type OriginationRouteProtocol = "TCP" | "UDP"
object OriginationRouteProtocol {
  val TCP: "TCP" = "TCP"
  val UDP: "UDP" = "UDP"

  @inline def values = js.Array[OriginationRouteProtocol](TCP, UDP)
}

type PhoneNumberAssociationName = "AccountId" | "UserId" | "VoiceConnectorId" | "VoiceConnectorGroupId" | "SipRuleId"
object PhoneNumberAssociationName {
  val AccountId: "AccountId" = "AccountId"
  val UserId: "UserId" = "UserId"
  val VoiceConnectorId: "VoiceConnectorId" = "VoiceConnectorId"
  val VoiceConnectorGroupId: "VoiceConnectorGroupId" = "VoiceConnectorGroupId"
  val SipRuleId: "SipRuleId" = "SipRuleId"

  @inline def values = js.Array[PhoneNumberAssociationName](AccountId, UserId, VoiceConnectorId, VoiceConnectorGroupId, SipRuleId)
}

type PhoneNumberOrderStatus = "Processing" | "Successful" | "Failed" | "Partial"
object PhoneNumberOrderStatus {
  val Processing: "Processing" = "Processing"
  val Successful: "Successful" = "Successful"
  val Failed: "Failed" = "Failed"
  val Partial: "Partial" = "Partial"

  @inline def values = js.Array[PhoneNumberOrderStatus](Processing, Successful, Failed, Partial)
}

type PhoneNumberProductType = "BusinessCalling" | "VoiceConnector"
object PhoneNumberProductType {
  val BusinessCalling: "BusinessCalling" = "BusinessCalling"
  val VoiceConnector: "VoiceConnector" = "VoiceConnector"

  @inline def values = js.Array[PhoneNumberProductType](BusinessCalling, VoiceConnector)
}

type PhoneNumberStatus = "AcquireInProgress" | "AcquireFailed" | "Unassigned" | "Assigned" | "ReleaseInProgress" | "DeleteInProgress" | "ReleaseFailed" | "DeleteFailed"
object PhoneNumberStatus {
  val AcquireInProgress: "AcquireInProgress" = "AcquireInProgress"
  val AcquireFailed: "AcquireFailed" = "AcquireFailed"
  val Unassigned: "Unassigned" = "Unassigned"
  val Assigned: "Assigned" = "Assigned"
  val ReleaseInProgress: "ReleaseInProgress" = "ReleaseInProgress"
  val DeleteInProgress: "DeleteInProgress" = "DeleteInProgress"
  val ReleaseFailed: "ReleaseFailed" = "ReleaseFailed"
  val DeleteFailed: "DeleteFailed" = "DeleteFailed"

  @inline def values = js.Array[PhoneNumberStatus](AcquireInProgress, AcquireFailed, Unassigned, Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed, DeleteFailed)
}

type PhoneNumberType = "Local" | "TollFree"
object PhoneNumberType {
  val Local: "Local" = "Local"
  val TollFree: "TollFree" = "TollFree"

  @inline def values = js.Array[PhoneNumberType](Local, TollFree)
}

type ProxySessionStatus = "Open" | "InProgress" | "Closed"
object ProxySessionStatus {
  val Open: "Open" = "Open"
  val InProgress: "InProgress" = "InProgress"
  val Closed: "Closed" = "Closed"

  @inline def values = js.Array[ProxySessionStatus](Open, InProgress, Closed)
}

type RegistrationStatus = "Unregistered" | "Registered" | "Suspended"
object RegistrationStatus {
  val Unregistered: "Unregistered" = "Unregistered"
  val Registered: "Registered" = "Registered"
  val Suspended: "Suspended" = "Suspended"

  @inline def values = js.Array[RegistrationStatus](Unregistered, Registered, Suspended)
}

type RoomMembershipRole = "Administrator" | "Member"
object RoomMembershipRole {
  val Administrator: "Administrator" = "Administrator"
  val Member: "Member" = "Member"

  @inline def values = js.Array[RoomMembershipRole](Administrator, Member)
}

type SipRuleTriggerType = "ToPhoneNumber" | "RequestUriHostname"
object SipRuleTriggerType {
  val ToPhoneNumber: "ToPhoneNumber" = "ToPhoneNumber"
  val RequestUriHostname: "RequestUriHostname" = "RequestUriHostname"

  @inline def values = js.Array[SipRuleTriggerType](ToPhoneNumber, RequestUriHostname)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[SortOrder](ASCENDING, DESCENDING)
}

type UserType = "PrivateUser" | "SharedDevice"
object UserType {
  val PrivateUser: "PrivateUser" = "PrivateUser"
  val SharedDevice: "SharedDevice" = "SharedDevice"

  @inline def values = js.Array[UserType](PrivateUser, SharedDevice)
}

type VoiceConnectorAwsRegion = "us-east-1" | "us-west-2"
object VoiceConnectorAwsRegion {
  val `us-east-1`: "us-east-1" = "us-east-1"
  val `us-west-2`: "us-west-2" = "us-west-2"

  @inline def values = js.Array[VoiceConnectorAwsRegion](`us-east-1`, `us-west-2`)
}
