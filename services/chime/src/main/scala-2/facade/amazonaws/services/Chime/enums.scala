package facade.amazonaws.services.chime

import scalajs.js

@js.native
sealed trait AccountStatus extends js.Any
object AccountStatus {
  val Suspended = "Suspended".asInstanceOf[AccountStatus]
  val Active = "Active".asInstanceOf[AccountStatus]

  @inline def values: js.Array[AccountStatus] = js.Array(Suspended, Active)
}

@js.native
sealed trait AccountType extends js.Any
object AccountType {
  val Team = "Team".asInstanceOf[AccountType]
  val EnterpriseDirectory = "EnterpriseDirectory".asInstanceOf[AccountType]
  val EnterpriseLWA = "EnterpriseLWA".asInstanceOf[AccountType]
  val EnterpriseOIDC = "EnterpriseOIDC".asInstanceOf[AccountType]

  @inline def values: js.Array[AccountType] = js.Array(Team, EnterpriseDirectory, EnterpriseLWA, EnterpriseOIDC)
}

@js.native
sealed trait AppInstanceDataType extends js.Any
object AppInstanceDataType {
  val Channel = "Channel".asInstanceOf[AppInstanceDataType]
  val ChannelMessage = "ChannelMessage".asInstanceOf[AppInstanceDataType]

  @inline def values: js.Array[AppInstanceDataType] = js.Array(Channel, ChannelMessage)
}

@js.native
sealed trait ArtifactsState extends js.Any
object ArtifactsState {
  val Enabled = "Enabled".asInstanceOf[ArtifactsState]
  val Disabled = "Disabled".asInstanceOf[ArtifactsState]

  @inline def values: js.Array[ArtifactsState] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait AudioMuxType extends js.Any
object AudioMuxType {
  val AudioOnly = "AudioOnly".asInstanceOf[AudioMuxType]
  val AudioWithActiveSpeakerVideo = "AudioWithActiveSpeakerVideo".asInstanceOf[AudioMuxType]

  @inline def values: js.Array[AudioMuxType] = js.Array(AudioOnly, AudioWithActiveSpeakerVideo)
}

@js.native
sealed trait BotType extends js.Any
object BotType {
  val ChatBot = "ChatBot".asInstanceOf[BotType]

  @inline def values: js.Array[BotType] = js.Array(ChatBot)
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
sealed trait ContentMuxType extends js.Any
object ContentMuxType {
  val ContentOnly = "ContentOnly".asInstanceOf[ContentMuxType]

  @inline def values: js.Array[ContentMuxType] = js.Array(ContentOnly)
}

@js.native
sealed trait EmailStatus extends js.Any
object EmailStatus {
  val NotSent = "NotSent".asInstanceOf[EmailStatus]
  val Sent = "Sent".asInstanceOf[EmailStatus]
  val Failed = "Failed".asInstanceOf[EmailStatus]

  @inline def values: js.Array[EmailStatus] = js.Array(NotSent, Sent, Failed)
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
sealed trait GeoMatchLevel extends js.Any
object GeoMatchLevel {
  val Country = "Country".asInstanceOf[GeoMatchLevel]
  val AreaCode = "AreaCode".asInstanceOf[GeoMatchLevel]

  @inline def values: js.Array[GeoMatchLevel] = js.Array(Country, AreaCode)
}

@js.native
sealed trait InviteStatus extends js.Any
object InviteStatus {
  val Pending = "Pending".asInstanceOf[InviteStatus]
  val Accepted = "Accepted".asInstanceOf[InviteStatus]
  val Failed = "Failed".asInstanceOf[InviteStatus]

  @inline def values: js.Array[InviteStatus] = js.Array(Pending, Accepted, Failed)
}

@js.native
sealed trait License extends js.Any
object License {
  val Basic = "Basic".asInstanceOf[License]
  val Plus = "Plus".asInstanceOf[License]
  val Pro = "Pro".asInstanceOf[License]
  val ProTrial = "ProTrial".asInstanceOf[License]

  @inline def values: js.Array[License] = js.Array(Basic, Plus, Pro, ProTrial)
}

@js.native
sealed trait MediaPipelineSinkType extends js.Any
object MediaPipelineSinkType {
  val S3Bucket = "S3Bucket".asInstanceOf[MediaPipelineSinkType]

  @inline def values: js.Array[MediaPipelineSinkType] = js.Array(S3Bucket)
}

@js.native
sealed trait MediaPipelineSourceType extends js.Any
object MediaPipelineSourceType {
  val ChimeSdkMeeting = "ChimeSdkMeeting".asInstanceOf[MediaPipelineSourceType]

  @inline def values: js.Array[MediaPipelineSourceType] = js.Array(ChimeSdkMeeting)
}

@js.native
sealed trait MediaPipelineStatus extends js.Any
object MediaPipelineStatus {
  val Initializing = "Initializing".asInstanceOf[MediaPipelineStatus]
  val InProgress = "InProgress".asInstanceOf[MediaPipelineStatus]
  val Failed = "Failed".asInstanceOf[MediaPipelineStatus]
  val Stopping = "Stopping".asInstanceOf[MediaPipelineStatus]
  val Stopped = "Stopped".asInstanceOf[MediaPipelineStatus]

  @inline def values: js.Array[MediaPipelineStatus] = js.Array(Initializing, InProgress, Failed, Stopping, Stopped)
}

@js.native
sealed trait MemberType extends js.Any
object MemberType {
  val User = "User".asInstanceOf[MemberType]
  val Bot = "Bot".asInstanceOf[MemberType]
  val Webhook = "Webhook".asInstanceOf[MemberType]

  @inline def values: js.Array[MemberType] = js.Array(User, Bot, Webhook)
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
  val AccountId = "AccountId".asInstanceOf[PhoneNumberAssociationName]
  val UserId = "UserId".asInstanceOf[PhoneNumberAssociationName]
  val VoiceConnectorId = "VoiceConnectorId".asInstanceOf[PhoneNumberAssociationName]
  val VoiceConnectorGroupId = "VoiceConnectorGroupId".asInstanceOf[PhoneNumberAssociationName]
  val SipRuleId = "SipRuleId".asInstanceOf[PhoneNumberAssociationName]

  @inline def values: js.Array[PhoneNumberAssociationName] = js.Array(AccountId, UserId, VoiceConnectorId, VoiceConnectorGroupId, SipRuleId)
}

@js.native
sealed trait PhoneNumberOrderStatus extends js.Any
object PhoneNumberOrderStatus {
  val Processing = "Processing".asInstanceOf[PhoneNumberOrderStatus]
  val Successful = "Successful".asInstanceOf[PhoneNumberOrderStatus]
  val Failed = "Failed".asInstanceOf[PhoneNumberOrderStatus]
  val Partial = "Partial".asInstanceOf[PhoneNumberOrderStatus]

  @inline def values: js.Array[PhoneNumberOrderStatus] = js.Array(Processing, Successful, Failed, Partial)
}

@js.native
sealed trait PhoneNumberProductType extends js.Any
object PhoneNumberProductType {
  val BusinessCalling = "BusinessCalling".asInstanceOf[PhoneNumberProductType]
  val VoiceConnector = "VoiceConnector".asInstanceOf[PhoneNumberProductType]
  val SipMediaApplicationDialIn = "SipMediaApplicationDialIn".asInstanceOf[PhoneNumberProductType]

  @inline def values: js.Array[PhoneNumberProductType] = js.Array(BusinessCalling, VoiceConnector, SipMediaApplicationDialIn)
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

  @inline def values: js.Array[PhoneNumberStatus] = js.Array(AcquireInProgress, AcquireFailed, Unassigned, Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed, DeleteFailed)
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
sealed trait RegistrationStatus extends js.Any
object RegistrationStatus {
  val Unregistered = "Unregistered".asInstanceOf[RegistrationStatus]
  val Registered = "Registered".asInstanceOf[RegistrationStatus]
  val Suspended = "Suspended".asInstanceOf[RegistrationStatus]

  @inline def values: js.Array[RegistrationStatus] = js.Array(Unregistered, Registered, Suspended)
}

@js.native
sealed trait RoomMembershipRole extends js.Any
object RoomMembershipRole {
  val Administrator = "Administrator".asInstanceOf[RoomMembershipRole]
  val Member = "Member".asInstanceOf[RoomMembershipRole]

  @inline def values: js.Array[RoomMembershipRole] = js.Array(Administrator, Member)
}

@js.native
sealed trait SipRuleTriggerType extends js.Any
object SipRuleTriggerType {
  val ToPhoneNumber = "ToPhoneNumber".asInstanceOf[SipRuleTriggerType]
  val RequestUriHostname = "RequestUriHostname".asInstanceOf[SipRuleTriggerType]

  @inline def values: js.Array[SipRuleTriggerType] = js.Array(ToPhoneNumber, RequestUriHostname)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait TranscribeContentIdentificationType extends js.Any
object TranscribeContentIdentificationType {
  val PII = "PII".asInstanceOf[TranscribeContentIdentificationType]

  @inline def values: js.Array[TranscribeContentIdentificationType] = js.Array(PII)
}

@js.native
sealed trait TranscribeContentRedactionType extends js.Any
object TranscribeContentRedactionType {
  val PII = "PII".asInstanceOf[TranscribeContentRedactionType]

  @inline def values: js.Array[TranscribeContentRedactionType] = js.Array(PII)
}

@js.native
sealed trait TranscribeLanguageCode extends js.Any
object TranscribeLanguageCode {
  val `en-US` = "en-US".asInstanceOf[TranscribeLanguageCode]
  val `en-GB` = "en-GB".asInstanceOf[TranscribeLanguageCode]
  val `es-US` = "es-US".asInstanceOf[TranscribeLanguageCode]
  val `fr-CA` = "fr-CA".asInstanceOf[TranscribeLanguageCode]
  val `fr-FR` = "fr-FR".asInstanceOf[TranscribeLanguageCode]
  val `en-AU` = "en-AU".asInstanceOf[TranscribeLanguageCode]
  val `it-IT` = "it-IT".asInstanceOf[TranscribeLanguageCode]
  val `de-DE` = "de-DE".asInstanceOf[TranscribeLanguageCode]
  val `pt-BR` = "pt-BR".asInstanceOf[TranscribeLanguageCode]
  val `ja-JP` = "ja-JP".asInstanceOf[TranscribeLanguageCode]
  val `ko-KR` = "ko-KR".asInstanceOf[TranscribeLanguageCode]
  val `zh-CN` = "zh-CN".asInstanceOf[TranscribeLanguageCode]

  @inline def values: js.Array[TranscribeLanguageCode] = js.Array(`en-US`, `en-GB`, `es-US`, `fr-CA`, `fr-FR`, `en-AU`, `it-IT`, `de-DE`, `pt-BR`, `ja-JP`, `ko-KR`, `zh-CN`)
}

@js.native
sealed trait TranscribeMedicalContentIdentificationType extends js.Any
object TranscribeMedicalContentIdentificationType {
  val PHI = "PHI".asInstanceOf[TranscribeMedicalContentIdentificationType]

  @inline def values: js.Array[TranscribeMedicalContentIdentificationType] = js.Array(PHI)
}

@js.native
sealed trait TranscribeMedicalLanguageCode extends js.Any
object TranscribeMedicalLanguageCode {
  val `en-US` = "en-US".asInstanceOf[TranscribeMedicalLanguageCode]

  @inline def values: js.Array[TranscribeMedicalLanguageCode] = js.Array(`en-US`)
}

@js.native
sealed trait TranscribeMedicalRegion extends js.Any
object TranscribeMedicalRegion {
  val `us-east-1` = "us-east-1".asInstanceOf[TranscribeMedicalRegion]
  val `us-east-2` = "us-east-2".asInstanceOf[TranscribeMedicalRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[TranscribeMedicalRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[TranscribeMedicalRegion]
  val `ca-central-1` = "ca-central-1".asInstanceOf[TranscribeMedicalRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[TranscribeMedicalRegion]
  val auto = "auto".asInstanceOf[TranscribeMedicalRegion]

  @inline def values: js.Array[TranscribeMedicalRegion] = js.Array(`us-east-1`, `us-east-2`, `us-west-2`, `ap-southeast-2`, `ca-central-1`, `eu-west-1`, auto)
}

@js.native
sealed trait TranscribeMedicalSpecialty extends js.Any
object TranscribeMedicalSpecialty {
  val PRIMARYCARE = "PRIMARYCARE".asInstanceOf[TranscribeMedicalSpecialty]
  val CARDIOLOGY = "CARDIOLOGY".asInstanceOf[TranscribeMedicalSpecialty]
  val NEUROLOGY = "NEUROLOGY".asInstanceOf[TranscribeMedicalSpecialty]
  val ONCOLOGY = "ONCOLOGY".asInstanceOf[TranscribeMedicalSpecialty]
  val RADIOLOGY = "RADIOLOGY".asInstanceOf[TranscribeMedicalSpecialty]
  val UROLOGY = "UROLOGY".asInstanceOf[TranscribeMedicalSpecialty]

  @inline def values: js.Array[TranscribeMedicalSpecialty] = js.Array(PRIMARYCARE, CARDIOLOGY, NEUROLOGY, ONCOLOGY, RADIOLOGY, UROLOGY)
}

@js.native
sealed trait TranscribeMedicalType extends js.Any
object TranscribeMedicalType {
  val CONVERSATION = "CONVERSATION".asInstanceOf[TranscribeMedicalType]
  val DICTATION = "DICTATION".asInstanceOf[TranscribeMedicalType]

  @inline def values: js.Array[TranscribeMedicalType] = js.Array(CONVERSATION, DICTATION)
}

@js.native
sealed trait TranscribePartialResultsStability extends js.Any
object TranscribePartialResultsStability {
  val low = "low".asInstanceOf[TranscribePartialResultsStability]
  val medium = "medium".asInstanceOf[TranscribePartialResultsStability]
  val high = "high".asInstanceOf[TranscribePartialResultsStability]

  @inline def values: js.Array[TranscribePartialResultsStability] = js.Array(low, medium, high)
}

@js.native
sealed trait TranscribeRegion extends js.Any
object TranscribeRegion {
  val `us-east-2` = "us-east-2".asInstanceOf[TranscribeRegion]
  val `us-east-1` = "us-east-1".asInstanceOf[TranscribeRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[TranscribeRegion]
  val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[TranscribeRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[TranscribeRegion]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[TranscribeRegion]
  val `ca-central-1` = "ca-central-1".asInstanceOf[TranscribeRegion]
  val `eu-central-1` = "eu-central-1".asInstanceOf[TranscribeRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[TranscribeRegion]
  val `eu-west-2` = "eu-west-2".asInstanceOf[TranscribeRegion]
  val `sa-east-1` = "sa-east-1".asInstanceOf[TranscribeRegion]
  val auto = "auto".asInstanceOf[TranscribeRegion]

  @inline def values: js.Array[TranscribeRegion] = js.Array(
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

@js.native
sealed trait TranscribeVocabularyFilterMethod extends js.Any
object TranscribeVocabularyFilterMethod {
  val remove = "remove".asInstanceOf[TranscribeVocabularyFilterMethod]
  val mask = "mask".asInstanceOf[TranscribeVocabularyFilterMethod]
  val tag = "tag".asInstanceOf[TranscribeVocabularyFilterMethod]

  @inline def values: js.Array[TranscribeVocabularyFilterMethod] = js.Array(remove, mask, tag)
}

@js.native
sealed trait UserType extends js.Any
object UserType {
  val PrivateUser = "PrivateUser".asInstanceOf[UserType]
  val SharedDevice = "SharedDevice".asInstanceOf[UserType]

  @inline def values: js.Array[UserType] = js.Array(PrivateUser, SharedDevice)
}

@js.native
sealed trait VideoMuxType extends js.Any
object VideoMuxType {
  val VideoOnly = "VideoOnly".asInstanceOf[VideoMuxType]

  @inline def values: js.Array[VideoMuxType] = js.Array(VideoOnly)
}

@js.native
sealed trait VoiceConnectorAwsRegion extends js.Any
object VoiceConnectorAwsRegion {
  val `us-east-1` = "us-east-1".asInstanceOf[VoiceConnectorAwsRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[VoiceConnectorAwsRegion]

  @inline def values: js.Array[VoiceConnectorAwsRegion] = js.Array(`us-east-1`, `us-west-2`)
}
