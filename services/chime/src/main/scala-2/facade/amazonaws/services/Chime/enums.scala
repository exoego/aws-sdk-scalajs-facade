package facade.amazonaws.services.chime

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AccountType extends js.Any
object AccountType {
  val Team = "Team".asInstanceOf[AccountType]
  val EnterpriseDirectory = "EnterpriseDirectory".asInstanceOf[AccountType]
  val EnterpriseLWA = "EnterpriseLWA".asInstanceOf[AccountType]
  val EnterpriseOIDC = "EnterpriseOIDC".asInstanceOf[AccountType]

  @inline def values = js.Array(Team, EnterpriseDirectory, EnterpriseLWA, EnterpriseOIDC)
}

@js.native
sealed trait AppInstanceDataType extends js.Any
object AppInstanceDataType {
  val Channel = "Channel".asInstanceOf[AppInstanceDataType]
  val ChannelMessage = "ChannelMessage".asInstanceOf[AppInstanceDataType]

  @inline def values = js.Array(Channel, ChannelMessage)
}

@js.native
sealed trait BotType extends js.Any
object BotType {
  val ChatBot = "ChatBot".asInstanceOf[BotType]

  @inline def values = js.Array(ChatBot)
}

@js.native
sealed trait CallingNameStatus extends js.Any
object CallingNameStatus {
  val Unassigned = "Unassigned".asInstanceOf[CallingNameStatus]
  val UpdateInProgress = "UpdateInProgress".asInstanceOf[CallingNameStatus]
  val UpdateSucceeded = "UpdateSucceeded".asInstanceOf[CallingNameStatus]
  val UpdateFailed = "UpdateFailed".asInstanceOf[CallingNameStatus]

  @inline def values = js.Array(Unassigned, UpdateInProgress, UpdateSucceeded, UpdateFailed)
}

@js.native
sealed trait Capability extends js.Any
object Capability {
  val Voice = "Voice".asInstanceOf[Capability]
  val SMS = "SMS".asInstanceOf[Capability]

  @inline def values = js.Array(Voice, SMS)
}

@js.native
sealed trait ChannelMembershipType extends js.Any
object ChannelMembershipType {
  val DEFAULT = "DEFAULT".asInstanceOf[ChannelMembershipType]
  val HIDDEN = "HIDDEN".asInstanceOf[ChannelMembershipType]

  @inline def values = js.Array(DEFAULT, HIDDEN)
}

@js.native
sealed trait ChannelMessagePersistenceType extends js.Any
object ChannelMessagePersistenceType {
  val PERSISTENT = "PERSISTENT".asInstanceOf[ChannelMessagePersistenceType]
  val NON_PERSISTENT = "NON_PERSISTENT".asInstanceOf[ChannelMessagePersistenceType]

  @inline def values = js.Array(PERSISTENT, NON_PERSISTENT)
}

@js.native
sealed trait ChannelMessageType extends js.Any
object ChannelMessageType {
  val STANDARD = "STANDARD".asInstanceOf[ChannelMessageType]
  val CONTROL = "CONTROL".asInstanceOf[ChannelMessageType]

  @inline def values = js.Array(STANDARD, CONTROL)
}

@js.native
sealed trait ChannelMode extends js.Any
object ChannelMode {
  val UNRESTRICTED = "UNRESTRICTED".asInstanceOf[ChannelMode]
  val RESTRICTED = "RESTRICTED".asInstanceOf[ChannelMode]

  @inline def values = js.Array(UNRESTRICTED, RESTRICTED)
}

@js.native
sealed trait ChannelPrivacy extends js.Any
object ChannelPrivacy {
  val PUBLIC = "PUBLIC".asInstanceOf[ChannelPrivacy]
  val PRIVATE = "PRIVATE".asInstanceOf[ChannelPrivacy]

  @inline def values = js.Array(PUBLIC, PRIVATE)
}

@js.native
sealed trait EmailStatus extends js.Any
object EmailStatus {
  val NotSent = "NotSent".asInstanceOf[EmailStatus]
  val Sent = "Sent".asInstanceOf[EmailStatus]
  val Failed = "Failed".asInstanceOf[EmailStatus]

  @inline def values = js.Array(NotSent, Sent, Failed)
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

  @inline def values = js.Array(BadRequest, Conflict, Forbidden, NotFound, PreconditionFailed, ResourceLimitExceeded, ServiceFailure, AccessDenied, ServiceUnavailable, Throttled, Throttling, Unauthorized, Unprocessable, VoiceConnectorGroupAssociationsExist, PhoneNumberAssociationsExist)
}

@js.native
sealed trait GeoMatchLevel extends js.Any
object GeoMatchLevel {
  val Country = "Country".asInstanceOf[GeoMatchLevel]
  val AreaCode = "AreaCode".asInstanceOf[GeoMatchLevel]

  @inline def values = js.Array(Country, AreaCode)
}

@js.native
sealed trait InviteStatus extends js.Any
object InviteStatus {
  val Pending = "Pending".asInstanceOf[InviteStatus]
  val Accepted = "Accepted".asInstanceOf[InviteStatus]
  val Failed = "Failed".asInstanceOf[InviteStatus]

  @inline def values = js.Array(Pending, Accepted, Failed)
}

@js.native
sealed trait License extends js.Any
object License {
  val Basic = "Basic".asInstanceOf[License]
  val Plus = "Plus".asInstanceOf[License]
  val Pro = "Pro".asInstanceOf[License]
  val ProTrial = "ProTrial".asInstanceOf[License]

  @inline def values = js.Array(Basic, Plus, Pro, ProTrial)
}

@js.native
sealed trait MemberType extends js.Any
object MemberType {
  val User = "User".asInstanceOf[MemberType]
  val Bot = "Bot".asInstanceOf[MemberType]
  val Webhook = "Webhook".asInstanceOf[MemberType]

  @inline def values = js.Array(User, Bot, Webhook)
}

@js.native
sealed trait NotificationTarget extends js.Any
object NotificationTarget {
  val EventBridge = "EventBridge".asInstanceOf[NotificationTarget]
  val SNS = "SNS".asInstanceOf[NotificationTarget]
  val SQS = "SQS".asInstanceOf[NotificationTarget]

  @inline def values = js.Array(EventBridge, SNS, SQS)
}

@js.native
sealed trait NumberSelectionBehavior extends js.Any
object NumberSelectionBehavior {
  val PreferSticky = "PreferSticky".asInstanceOf[NumberSelectionBehavior]
  val AvoidSticky = "AvoidSticky".asInstanceOf[NumberSelectionBehavior]

  @inline def values = js.Array(PreferSticky, AvoidSticky)
}

@js.native
sealed trait OrderedPhoneNumberStatus extends js.Any
object OrderedPhoneNumberStatus {
  val Processing = "Processing".asInstanceOf[OrderedPhoneNumberStatus]
  val Acquired = "Acquired".asInstanceOf[OrderedPhoneNumberStatus]
  val Failed = "Failed".asInstanceOf[OrderedPhoneNumberStatus]

  @inline def values = js.Array(Processing, Acquired, Failed)
}

@js.native
sealed trait OriginationRouteProtocol extends js.Any
object OriginationRouteProtocol {
  val TCP = "TCP".asInstanceOf[OriginationRouteProtocol]
  val UDP = "UDP".asInstanceOf[OriginationRouteProtocol]

  @inline def values = js.Array(TCP, UDP)
}

@js.native
sealed trait PhoneNumberAssociationName extends js.Any
object PhoneNumberAssociationName {
  val AccountId = "AccountId".asInstanceOf[PhoneNumberAssociationName]
  val UserId = "UserId".asInstanceOf[PhoneNumberAssociationName]
  val VoiceConnectorId = "VoiceConnectorId".asInstanceOf[PhoneNumberAssociationName]
  val VoiceConnectorGroupId = "VoiceConnectorGroupId".asInstanceOf[PhoneNumberAssociationName]
  val SipRuleId = "SipRuleId".asInstanceOf[PhoneNumberAssociationName]

  @inline def values = js.Array(AccountId, UserId, VoiceConnectorId, VoiceConnectorGroupId, SipRuleId)
}

@js.native
sealed trait PhoneNumberOrderStatus extends js.Any
object PhoneNumberOrderStatus {
  val Processing = "Processing".asInstanceOf[PhoneNumberOrderStatus]
  val Successful = "Successful".asInstanceOf[PhoneNumberOrderStatus]
  val Failed = "Failed".asInstanceOf[PhoneNumberOrderStatus]
  val Partial = "Partial".asInstanceOf[PhoneNumberOrderStatus]

  @inline def values = js.Array(Processing, Successful, Failed, Partial)
}

@js.native
sealed trait PhoneNumberProductType extends js.Any
object PhoneNumberProductType {
  val BusinessCalling = "BusinessCalling".asInstanceOf[PhoneNumberProductType]
  val VoiceConnector = "VoiceConnector".asInstanceOf[PhoneNumberProductType]

  @inline def values = js.Array(BusinessCalling, VoiceConnector)
}

@js.native
sealed trait PhoneNumberStatus extends js.Any
object PhoneNumberStatus {
  val AcquireInProgress = "AcquireInProgress".asInstanceOf[PhoneNumberStatus]
  val AcquireFailed = "AcquireFailed".asInstanceOf[PhoneNumberStatus]
  val Unassigned = "Unassigned".asInstanceOf[PhoneNumberStatus]
  val Assigned = "Assigned".asInstanceOf[PhoneNumberStatus]
  val ReleaseInProgress = "ReleaseInProgress".asInstanceOf[PhoneNumberStatus]
  val DeleteInProgress = "DeleteInProgress".asInstanceOf[PhoneNumberStatus]
  val ReleaseFailed = "ReleaseFailed".asInstanceOf[PhoneNumberStatus]
  val DeleteFailed = "DeleteFailed".asInstanceOf[PhoneNumberStatus]

  @inline def values = js.Array(AcquireInProgress, AcquireFailed, Unassigned, Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed, DeleteFailed)
}

@js.native
sealed trait PhoneNumberType extends js.Any
object PhoneNumberType {
  val Local = "Local".asInstanceOf[PhoneNumberType]
  val TollFree = "TollFree".asInstanceOf[PhoneNumberType]

  @inline def values = js.Array(Local, TollFree)
}

@js.native
sealed trait ProxySessionStatus extends js.Any
object ProxySessionStatus {
  val Open = "Open".asInstanceOf[ProxySessionStatus]
  val InProgress = "InProgress".asInstanceOf[ProxySessionStatus]
  val Closed = "Closed".asInstanceOf[ProxySessionStatus]

  @inline def values = js.Array(Open, InProgress, Closed)
}

@js.native
sealed trait RegistrationStatus extends js.Any
object RegistrationStatus {
  val Unregistered = "Unregistered".asInstanceOf[RegistrationStatus]
  val Registered = "Registered".asInstanceOf[RegistrationStatus]
  val Suspended = "Suspended".asInstanceOf[RegistrationStatus]

  @inline def values = js.Array(Unregistered, Registered, Suspended)
}

@js.native
sealed trait RoomMembershipRole extends js.Any
object RoomMembershipRole {
  val Administrator = "Administrator".asInstanceOf[RoomMembershipRole]
  val Member = "Member".asInstanceOf[RoomMembershipRole]

  @inline def values = js.Array(Administrator, Member)
}

@js.native
sealed trait SipRuleTriggerType extends js.Any
object SipRuleTriggerType {
  val ToPhoneNumber = "ToPhoneNumber".asInstanceOf[SipRuleTriggerType]
  val RequestUriHostname = "RequestUriHostname".asInstanceOf[SipRuleTriggerType]

  @inline def values = js.Array(ToPhoneNumber, RequestUriHostname)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait UserType extends js.Any
object UserType {
  val PrivateUser = "PrivateUser".asInstanceOf[UserType]
  val SharedDevice = "SharedDevice".asInstanceOf[UserType]

  @inline def values = js.Array(PrivateUser, SharedDevice)
}

@js.native
sealed trait VoiceConnectorAwsRegion extends js.Any
object VoiceConnectorAwsRegion {
  val `us-east-1` = "us-east-1".asInstanceOf[VoiceConnectorAwsRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[VoiceConnectorAwsRegion]

  @inline def values = js.Array(`us-east-1`, `us-west-2`)
}

