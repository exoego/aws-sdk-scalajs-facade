package facade.amazonaws.services.chime

import scalajs.js

type AccountStatus = "Suspended" | "Active"
object AccountStatus {
  inline val Suspended: "Suspended" = "Suspended"
  inline val Active: "Active" = "Active"

  inline def values: js.Array[AccountStatus] = js.Array(Suspended, Active)
}

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

type ArtifactsState = "Enabled" | "Disabled"
object ArtifactsState {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ArtifactsState] = js.Array(Enabled, Disabled)
}

type AudioMuxType = "AudioOnly" | "AudioWithActiveSpeakerVideo"
object AudioMuxType {
  inline val AudioOnly: "AudioOnly" = "AudioOnly"
  inline val AudioWithActiveSpeakerVideo: "AudioWithActiveSpeakerVideo" = "AudioWithActiveSpeakerVideo"

  inline def values: js.Array[AudioMuxType] = js.Array(AudioOnly, AudioWithActiveSpeakerVideo)
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

type ContentMuxType = "ContentOnly"
object ContentMuxType {
  inline val ContentOnly: "ContentOnly" = "ContentOnly"

  inline def values: js.Array[ContentMuxType] = js.Array(ContentOnly)
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

type MediaPipelineSinkType = "S3Bucket"
object MediaPipelineSinkType {
  inline val S3Bucket: "S3Bucket" = "S3Bucket"

  inline def values: js.Array[MediaPipelineSinkType] = js.Array(S3Bucket)
}

type MediaPipelineSourceType = "ChimeSdkMeeting"
object MediaPipelineSourceType {
  inline val ChimeSdkMeeting: "ChimeSdkMeeting" = "ChimeSdkMeeting"

  inline def values: js.Array[MediaPipelineSourceType] = js.Array(ChimeSdkMeeting)
}

type MediaPipelineStatus = "Initializing" | "InProgress" | "Failed" | "Stopping" | "Stopped"
object MediaPipelineStatus {
  inline val Initializing: "Initializing" = "Initializing"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[MediaPipelineStatus] = js.Array(Initializing, InProgress, Failed, Stopping, Stopped)
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

type PhoneNumberProductType = "BusinessCalling" | "VoiceConnector" | "SipMediaApplicationDialIn"
object PhoneNumberProductType {
  inline val BusinessCalling: "BusinessCalling" = "BusinessCalling"
  inline val VoiceConnector: "VoiceConnector" = "VoiceConnector"
  inline val SipMediaApplicationDialIn: "SipMediaApplicationDialIn" = "SipMediaApplicationDialIn"

  inline def values: js.Array[PhoneNumberProductType] = js.Array(BusinessCalling, VoiceConnector, SipMediaApplicationDialIn)
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

type TranscribeContentIdentificationType = "PII"
object TranscribeContentIdentificationType {
  inline val PII: "PII" = "PII"

  inline def values: js.Array[TranscribeContentIdentificationType] = js.Array(PII)
}

type TranscribeContentRedactionType = "PII"
object TranscribeContentRedactionType {
  inline val PII: "PII" = "PII"

  inline def values: js.Array[TranscribeContentRedactionType] = js.Array(PII)
}

type TranscribeLanguageCode = "en-US" | "en-GB" | "es-US" | "fr-CA" | "fr-FR" | "en-AU" | "it-IT" | "de-DE" | "pt-BR" | "ja-JP" | "ko-KR" | "zh-CN"
object TranscribeLanguageCode {
  inline val `en-US`: "en-US" = "en-US"
  inline val `en-GB`: "en-GB" = "en-GB"
  inline val `es-US`: "es-US" = "es-US"
  inline val `fr-CA`: "fr-CA" = "fr-CA"
  inline val `fr-FR`: "fr-FR" = "fr-FR"
  inline val `en-AU`: "en-AU" = "en-AU"
  inline val `it-IT`: "it-IT" = "it-IT"
  inline val `de-DE`: "de-DE" = "de-DE"
  inline val `pt-BR`: "pt-BR" = "pt-BR"
  inline val `ja-JP`: "ja-JP" = "ja-JP"
  inline val `ko-KR`: "ko-KR" = "ko-KR"
  inline val `zh-CN`: "zh-CN" = "zh-CN"

  inline def values: js.Array[TranscribeLanguageCode] = js.Array(`en-US`, `en-GB`, `es-US`, `fr-CA`, `fr-FR`, `en-AU`, `it-IT`, `de-DE`, `pt-BR`, `ja-JP`, `ko-KR`, `zh-CN`)
}

type TranscribeMedicalContentIdentificationType = "PHI"
object TranscribeMedicalContentIdentificationType {
  inline val PHI: "PHI" = "PHI"

  inline def values: js.Array[TranscribeMedicalContentIdentificationType] = js.Array(PHI)
}

type TranscribeMedicalLanguageCode = "en-US"
object TranscribeMedicalLanguageCode {
  inline val `en-US`: "en-US" = "en-US"

  inline def values: js.Array[TranscribeMedicalLanguageCode] = js.Array(`en-US`)
}

type TranscribeMedicalRegion = "us-east-1" | "us-east-2" | "us-west-2" | "ap-southeast-2" | "ca-central-1" | "eu-west-1" | "auto"
object TranscribeMedicalRegion {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val auto: "auto" = "auto"

  inline def values: js.Array[TranscribeMedicalRegion] = js.Array(`us-east-1`, `us-east-2`, `us-west-2`, `ap-southeast-2`, `ca-central-1`, `eu-west-1`, auto)
}

type TranscribeMedicalSpecialty = "PRIMARYCARE" | "CARDIOLOGY" | "NEUROLOGY" | "ONCOLOGY" | "RADIOLOGY" | "UROLOGY"
object TranscribeMedicalSpecialty {
  inline val PRIMARYCARE: "PRIMARYCARE" = "PRIMARYCARE"
  inline val CARDIOLOGY: "CARDIOLOGY" = "CARDIOLOGY"
  inline val NEUROLOGY: "NEUROLOGY" = "NEUROLOGY"
  inline val ONCOLOGY: "ONCOLOGY" = "ONCOLOGY"
  inline val RADIOLOGY: "RADIOLOGY" = "RADIOLOGY"
  inline val UROLOGY: "UROLOGY" = "UROLOGY"

  inline def values: js.Array[TranscribeMedicalSpecialty] = js.Array(PRIMARYCARE, CARDIOLOGY, NEUROLOGY, ONCOLOGY, RADIOLOGY, UROLOGY)
}

type TranscribeMedicalType = "CONVERSATION" | "DICTATION"
object TranscribeMedicalType {
  inline val CONVERSATION: "CONVERSATION" = "CONVERSATION"
  inline val DICTATION: "DICTATION" = "DICTATION"

  inline def values: js.Array[TranscribeMedicalType] = js.Array(CONVERSATION, DICTATION)
}

type TranscribePartialResultsStability = "low" | "medium" | "high"
object TranscribePartialResultsStability {
  inline val low: "low" = "low"
  inline val medium: "medium" = "medium"
  inline val high: "high" = "high"

  inline def values: js.Array[TranscribePartialResultsStability] = js.Array(low, medium, high)
}

type TranscribeRegion = "us-east-2" | "us-east-1" | "us-west-2" | "ap-northeast-2" | "ap-southeast-2" | "ap-northeast-1" | "ca-central-1" | "eu-central-1" | "eu-west-1" | "eu-west-2" | "sa-east-1" | "auto"
object TranscribeRegion {
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `eu-west-2`: "eu-west-2" = "eu-west-2"
  inline val `sa-east-1`: "sa-east-1" = "sa-east-1"
  inline val auto: "auto" = "auto"

  inline def values: js.Array[TranscribeRegion] = js.Array(
    `us-east-2`,
    `us-east-1`,
    `us-west-2`,
    `ap-northeast-2`,
    `ap-southeast-2`,
    `ap-northeast-1`,
    `ca-central-1`,
    `eu-central-1`,
    `eu-west-1`,
    `eu-west-2`,
    `sa-east-1`,
    auto
  )
}

type TranscribeVocabularyFilterMethod = "remove" | "mask" | "tag"
object TranscribeVocabularyFilterMethod {
  inline val remove: "remove" = "remove"
  inline val mask: "mask" = "mask"
  inline val tag: "tag" = "tag"

  inline def values: js.Array[TranscribeVocabularyFilterMethod] = js.Array(remove, mask, tag)
}

type UserType = "PrivateUser" | "SharedDevice"
object UserType {
  inline val PrivateUser: "PrivateUser" = "PrivateUser"
  inline val SharedDevice: "SharedDevice" = "SharedDevice"

  inline def values: js.Array[UserType] = js.Array(PrivateUser, SharedDevice)
}

type VideoMuxType = "VideoOnly"
object VideoMuxType {
  inline val VideoOnly: "VideoOnly" = "VideoOnly"

  inline def values: js.Array[VideoMuxType] = js.Array(VideoOnly)
}

type VoiceConnectorAwsRegion = "us-east-1" | "us-west-2"
object VoiceConnectorAwsRegion {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"

  inline def values: js.Array[VoiceConnectorAwsRegion] = js.Array(`us-east-1`, `us-west-2`)
}
