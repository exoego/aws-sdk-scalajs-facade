package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object chimesdkmeetings {
  type AmazonResourceName = String
  type Arn = String
  type AttendeeIdsList = js.Array[AttendeeIdItem]
  type AttendeeList = js.Array[Attendee]
  type BatchCreateAttendeeErrorList = js.Array[CreateAttendeeError]
  type ClientRequestToken = String
  type CreateAttendeeRequestItemList = js.Array[CreateAttendeeRequestItem]
  type CreateMeetingWithAttendeesRequestItemList = js.Array[CreateAttendeeRequestItem]
  type ExternalMeetingId = String
  type ExternalUserId = String
  type GuidString = String
  type JoinTokenString = String
  type MediaRegion = String
  type PrimaryMeetingId = String
  type ResultMax = Int
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TenantId = String
  type TenantIdList = js.Array[TenantId]
  type TranscribeLanguageModelName = String
  type TranscribeLanguageOptions = String
  type TranscribePiiEntityTypes = String

  final class ChimeSDKMeetingsOps(private val service: ChimeSDKMeetings) extends AnyVal {

    @inline def batchCreateAttendeeFuture(params: BatchCreateAttendeeRequest): Future[BatchCreateAttendeeResponse] = service.batchCreateAttendee(params).promise().toFuture
    @inline def batchUpdateAttendeeCapabilitiesExceptFuture(params: BatchUpdateAttendeeCapabilitiesExceptRequest): Future[js.Object] = service.batchUpdateAttendeeCapabilitiesExcept(params).promise().toFuture
    @inline def createAttendeeFuture(params: CreateAttendeeRequest): Future[CreateAttendeeResponse] = service.createAttendee(params).promise().toFuture
    @inline def createMeetingFuture(params: CreateMeetingRequest): Future[CreateMeetingResponse] = service.createMeeting(params).promise().toFuture
    @inline def createMeetingWithAttendeesFuture(params: CreateMeetingWithAttendeesRequest): Future[CreateMeetingWithAttendeesResponse] = service.createMeetingWithAttendees(params).promise().toFuture
    @inline def deleteAttendeeFuture(params: DeleteAttendeeRequest): Future[js.Object] = service.deleteAttendee(params).promise().toFuture
    @inline def deleteMeetingFuture(params: DeleteMeetingRequest): Future[js.Object] = service.deleteMeeting(params).promise().toFuture
    @inline def getAttendeeFuture(params: GetAttendeeRequest): Future[GetAttendeeResponse] = service.getAttendee(params).promise().toFuture
    @inline def getMeetingFuture(params: GetMeetingRequest): Future[GetMeetingResponse] = service.getMeeting(params).promise().toFuture
    @inline def listAttendeesFuture(params: ListAttendeesRequest): Future[ListAttendeesResponse] = service.listAttendees(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startMeetingTranscriptionFuture(params: StartMeetingTranscriptionRequest): Future[js.Object] = service.startMeetingTranscription(params).promise().toFuture
    @inline def stopMeetingTranscriptionFuture(params: StopMeetingTranscriptionRequest): Future[js.Object] = service.stopMeetingTranscription(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAttendeeCapabilitiesFuture(params: UpdateAttendeeCapabilitiesRequest): Future[UpdateAttendeeCapabilitiesResponse] = service.updateAttendeeCapabilities(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/chimesdkmeetings", JSImport.Namespace, "AWS.ChimeSDKMeetings")
  class ChimeSDKMeetings() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCreateAttendee(params: BatchCreateAttendeeRequest): Request[BatchCreateAttendeeResponse] = js.native
    def batchUpdateAttendeeCapabilitiesExcept(params: BatchUpdateAttendeeCapabilitiesExceptRequest): Request[js.Object] = js.native
    def createAttendee(params: CreateAttendeeRequest): Request[CreateAttendeeResponse] = js.native
    def createMeeting(params: CreateMeetingRequest): Request[CreateMeetingResponse] = js.native
    def createMeetingWithAttendees(params: CreateMeetingWithAttendeesRequest): Request[CreateMeetingWithAttendeesResponse] = js.native
    def deleteAttendee(params: DeleteAttendeeRequest): Request[js.Object] = js.native
    def deleteMeeting(params: DeleteMeetingRequest): Request[js.Object] = js.native
    def getAttendee(params: GetAttendeeRequest): Request[GetAttendeeResponse] = js.native
    def getMeeting(params: GetMeetingRequest): Request[GetMeetingResponse] = js.native
    def listAttendees(params: ListAttendeesRequest): Request[ListAttendeesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startMeetingTranscription(params: StartMeetingTranscriptionRequest): Request[js.Object] = js.native
    def stopMeetingTranscription(params: StopMeetingTranscriptionRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAttendeeCapabilities(params: UpdateAttendeeCapabilitiesRequest): Request[UpdateAttendeeCapabilitiesResponse] = js.native
  }
  object ChimeSDKMeetings {
    @inline implicit def toOps(service: ChimeSDKMeetings): ChimeSDKMeetingsOps = {
      new ChimeSDKMeetingsOps(service)
    }
  }

  /** An Amazon Chime SDK meeting attendee. Includes a unique <code>AttendeeId</code> and <code>JoinToken</code>. The <code>JoinToken</code> allows a client to authenticate and join as the specified attendee. The <code>JoinToken</code> expires when the meeting ends, or when <a>DeleteAttendee</a> is called. After that, the attendee is unable to join the meeting. We recommend securely transferring each <code>JoinToken</code> from your server application to the client so that no other client has access to the token except for the one authorized to represent the attendee.
    */
  @js.native
  trait Attendee extends js.Object {
    var AttendeeId: js.UndefOr[GuidString]
    var Capabilities: js.UndefOr[AttendeeCapabilities]
    var ExternalUserId: js.UndefOr[ExternalUserId]
    var JoinToken: js.UndefOr[JoinTokenString]
  }

  object Attendee {
    @inline
    def apply(
        AttendeeId: js.UndefOr[GuidString] = js.undefined,
        Capabilities: js.UndefOr[AttendeeCapabilities] = js.undefined,
        ExternalUserId: js.UndefOr[ExternalUserId] = js.undefined,
        JoinToken: js.UndefOr[JoinTokenString] = js.undefined
    ): Attendee = {
      val __obj = js.Dynamic.literal()
      AttendeeId.foreach(__v => __obj.updateDynamic("AttendeeId")(__v.asInstanceOf[js.Any]))
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      ExternalUserId.foreach(__v => __obj.updateDynamic("ExternalUserId")(__v.asInstanceOf[js.Any]))
      JoinToken.foreach(__v => __obj.updateDynamic("JoinToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attendee]
    }
  }

  /** The media capabilities of an attendee: audio, video, or content.
    *
    * '''Note:'''You use the capabilities with a set of values that control what the capabilities can do, such as <code>SendReceive</code> data. For more information about those values, see . When using capabilities, be aware of these corner cases: * You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless you also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you don't set the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request status code. However, you can set your <code>video</code> capability to receive and you set your <code>content</code> capability to not receive. * When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio will flow from the attendee to the other meeting participants. * When you change
    * a <code>video</code> or <code>content</code> capability from <code>None</code> or <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on their video or content streams, remote attendess can receive those streams, but only after media renegotiation between the client and the Amazon Chime back-end server.
    */
  @js.native
  trait AttendeeCapabilities extends js.Object {
    var Audio: MediaCapabilities
    var Content: MediaCapabilities
    var Video: MediaCapabilities
  }

  object AttendeeCapabilities {
    @inline
    def apply(
        Audio: MediaCapabilities,
        Content: MediaCapabilities,
        Video: MediaCapabilities
    ): AttendeeCapabilities = {
      val __obj = js.Dynamic.literal(
        "Audio" -> Audio.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "Video" -> Video.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttendeeCapabilities]
    }
  }

  /** A structure that contains one or more attendee IDs.
    */
  @js.native
  trait AttendeeIdItem extends js.Object {
    var AttendeeId: GuidString
  }

  object AttendeeIdItem {
    @inline
    def apply(
        AttendeeId: GuidString
    ): AttendeeIdItem = {
      val __obj = js.Dynamic.literal(
        "AttendeeId" -> AttendeeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttendeeIdItem]
    }
  }

  /** An optional category of meeting features that contains audio-specific configurations, such as operating parameters for Amazon Voice Focus.
    */
  @js.native
  trait AudioFeatures extends js.Object {
    var EchoReduction: js.UndefOr[MeetingFeatureStatus]
  }

  object AudioFeatures {
    @inline
    def apply(
        EchoReduction: js.UndefOr[MeetingFeatureStatus] = js.undefined
    ): AudioFeatures = {
      val __obj = js.Dynamic.literal()
      EchoReduction.foreach(__v => __obj.updateDynamic("EchoReduction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioFeatures]
    }
  }

  @js.native
  trait BatchCreateAttendeeRequest extends js.Object {
    var Attendees: CreateAttendeeRequestItemList
    var MeetingId: GuidString
  }

  object BatchCreateAttendeeRequest {
    @inline
    def apply(
        Attendees: CreateAttendeeRequestItemList,
        MeetingId: GuidString
    ): BatchCreateAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "Attendees" -> Attendees.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchCreateAttendeeRequest]
    }
  }

  @js.native
  trait BatchCreateAttendeeResponse extends js.Object {
    var Attendees: js.UndefOr[AttendeeList]
    var Errors: js.UndefOr[BatchCreateAttendeeErrorList]
  }

  object BatchCreateAttendeeResponse {
    @inline
    def apply(
        Attendees: js.UndefOr[AttendeeList] = js.undefined,
        Errors: js.UndefOr[BatchCreateAttendeeErrorList] = js.undefined
    ): BatchCreateAttendeeResponse = {
      val __obj = js.Dynamic.literal()
      Attendees.foreach(__v => __obj.updateDynamic("Attendees")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateAttendeeResponse]
    }
  }

  @js.native
  trait BatchUpdateAttendeeCapabilitiesExceptRequest extends js.Object {
    var Capabilities: AttendeeCapabilities
    var ExcludedAttendeeIds: AttendeeIdsList
    var MeetingId: GuidString
  }

  object BatchUpdateAttendeeCapabilitiesExceptRequest {
    @inline
    def apply(
        Capabilities: AttendeeCapabilities,
        ExcludedAttendeeIds: AttendeeIdsList,
        MeetingId: GuidString
    ): BatchUpdateAttendeeCapabilitiesExceptRequest = {
      val __obj = js.Dynamic.literal(
        "Capabilities" -> Capabilities.asInstanceOf[js.Any],
        "ExcludedAttendeeIds" -> ExcludedAttendeeIds.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdateAttendeeCapabilitiesExceptRequest]
    }
  }

  /** The list of errors returned when errors are encountered during the BatchCreateAttendee and CreateAttendee actions. This includes external user IDs, error codes, and error messages.
    */
  @js.native
  trait CreateAttendeeError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var ExternalUserId: js.UndefOr[ExternalUserId]
  }

  object CreateAttendeeError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        ExternalUserId: js.UndefOr[ExternalUserId] = js.undefined
    ): CreateAttendeeError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ExternalUserId.foreach(__v => __obj.updateDynamic("ExternalUserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttendeeError]
    }
  }

  @js.native
  trait CreateAttendeeRequest extends js.Object {
    var ExternalUserId: ExternalUserId
    var MeetingId: GuidString
    var Capabilities: js.UndefOr[AttendeeCapabilities]
  }

  object CreateAttendeeRequest {
    @inline
    def apply(
        ExternalUserId: ExternalUserId,
        MeetingId: GuidString,
        Capabilities: js.UndefOr[AttendeeCapabilities] = js.undefined
    ): CreateAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "ExternalUserId" -> ExternalUserId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )

      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttendeeRequest]
    }
  }

  /** The Amazon Chime SDK attendee fields to create, used with the BatchCreateAttendee action.
    */
  @js.native
  trait CreateAttendeeRequestItem extends js.Object {
    var ExternalUserId: ExternalUserId
    var Capabilities: js.UndefOr[AttendeeCapabilities]
  }

  object CreateAttendeeRequestItem {
    @inline
    def apply(
        ExternalUserId: ExternalUserId,
        Capabilities: js.UndefOr[AttendeeCapabilities] = js.undefined
    ): CreateAttendeeRequestItem = {
      val __obj = js.Dynamic.literal(
        "ExternalUserId" -> ExternalUserId.asInstanceOf[js.Any]
      )

      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttendeeRequestItem]
    }
  }

  @js.native
  trait CreateAttendeeResponse extends js.Object {
    var Attendee: js.UndefOr[Attendee]
  }

  object CreateAttendeeResponse {
    @inline
    def apply(
        Attendee: js.UndefOr[Attendee] = js.undefined
    ): CreateAttendeeResponse = {
      val __obj = js.Dynamic.literal()
      Attendee.foreach(__v => __obj.updateDynamic("Attendee")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttendeeResponse]
    }
  }

  @js.native
  trait CreateMeetingRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var ExternalMeetingId: ExternalMeetingId
    var MediaRegion: MediaRegion
    var MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration]
    var MeetingHostId: js.UndefOr[ExternalUserId]
    var NotificationsConfiguration: js.UndefOr[NotificationsConfiguration]
    var PrimaryMeetingId: js.UndefOr[PrimaryMeetingId]
    var Tags: js.UndefOr[TagList]
    var TenantIds: js.UndefOr[TenantIdList]
  }

  object CreateMeetingRequest {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        ExternalMeetingId: ExternalMeetingId,
        MediaRegion: MediaRegion,
        MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration] = js.undefined,
        MeetingHostId: js.UndefOr[ExternalUserId] = js.undefined,
        NotificationsConfiguration: js.UndefOr[NotificationsConfiguration] = js.undefined,
        PrimaryMeetingId: js.UndefOr[PrimaryMeetingId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TenantIds: js.UndefOr[TenantIdList] = js.undefined
    ): CreateMeetingRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "ExternalMeetingId" -> ExternalMeetingId.asInstanceOf[js.Any],
        "MediaRegion" -> MediaRegion.asInstanceOf[js.Any]
      )

      MeetingFeatures.foreach(__v => __obj.updateDynamic("MeetingFeatures")(__v.asInstanceOf[js.Any]))
      MeetingHostId.foreach(__v => __obj.updateDynamic("MeetingHostId")(__v.asInstanceOf[js.Any]))
      NotificationsConfiguration.foreach(__v => __obj.updateDynamic("NotificationsConfiguration")(__v.asInstanceOf[js.Any]))
      PrimaryMeetingId.foreach(__v => __obj.updateDynamic("PrimaryMeetingId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TenantIds.foreach(__v => __obj.updateDynamic("TenantIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeetingRequest]
    }
  }

  @js.native
  trait CreateMeetingResponse extends js.Object {
    var Meeting: js.UndefOr[Meeting]
  }

  object CreateMeetingResponse {
    @inline
    def apply(
        Meeting: js.UndefOr[Meeting] = js.undefined
    ): CreateMeetingResponse = {
      val __obj = js.Dynamic.literal()
      Meeting.foreach(__v => __obj.updateDynamic("Meeting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeetingResponse]
    }
  }

  @js.native
  trait CreateMeetingWithAttendeesRequest extends js.Object {
    var Attendees: CreateMeetingWithAttendeesRequestItemList
    var ClientRequestToken: ClientRequestToken
    var ExternalMeetingId: ExternalMeetingId
    var MediaRegion: MediaRegion
    var MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration]
    var MeetingHostId: js.UndefOr[ExternalUserId]
    var NotificationsConfiguration: js.UndefOr[NotificationsConfiguration]
    var PrimaryMeetingId: js.UndefOr[PrimaryMeetingId]
    var Tags: js.UndefOr[TagList]
    var TenantIds: js.UndefOr[TenantIdList]
  }

  object CreateMeetingWithAttendeesRequest {
    @inline
    def apply(
        Attendees: CreateMeetingWithAttendeesRequestItemList,
        ClientRequestToken: ClientRequestToken,
        ExternalMeetingId: ExternalMeetingId,
        MediaRegion: MediaRegion,
        MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration] = js.undefined,
        MeetingHostId: js.UndefOr[ExternalUserId] = js.undefined,
        NotificationsConfiguration: js.UndefOr[NotificationsConfiguration] = js.undefined,
        PrimaryMeetingId: js.UndefOr[PrimaryMeetingId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TenantIds: js.UndefOr[TenantIdList] = js.undefined
    ): CreateMeetingWithAttendeesRequest = {
      val __obj = js.Dynamic.literal(
        "Attendees" -> Attendees.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "ExternalMeetingId" -> ExternalMeetingId.asInstanceOf[js.Any],
        "MediaRegion" -> MediaRegion.asInstanceOf[js.Any]
      )

      MeetingFeatures.foreach(__v => __obj.updateDynamic("MeetingFeatures")(__v.asInstanceOf[js.Any]))
      MeetingHostId.foreach(__v => __obj.updateDynamic("MeetingHostId")(__v.asInstanceOf[js.Any]))
      NotificationsConfiguration.foreach(__v => __obj.updateDynamic("NotificationsConfiguration")(__v.asInstanceOf[js.Any]))
      PrimaryMeetingId.foreach(__v => __obj.updateDynamic("PrimaryMeetingId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TenantIds.foreach(__v => __obj.updateDynamic("TenantIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeetingWithAttendeesRequest]
    }
  }

  @js.native
  trait CreateMeetingWithAttendeesResponse extends js.Object {
    var Attendees: js.UndefOr[AttendeeList]
    var Errors: js.UndefOr[BatchCreateAttendeeErrorList]
    var Meeting: js.UndefOr[Meeting]
  }

  object CreateMeetingWithAttendeesResponse {
    @inline
    def apply(
        Attendees: js.UndefOr[AttendeeList] = js.undefined,
        Errors: js.UndefOr[BatchCreateAttendeeErrorList] = js.undefined,
        Meeting: js.UndefOr[Meeting] = js.undefined
    ): CreateMeetingWithAttendeesResponse = {
      val __obj = js.Dynamic.literal()
      Attendees.foreach(__v => __obj.updateDynamic("Attendees")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Meeting.foreach(__v => __obj.updateDynamic("Meeting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeetingWithAttendeesResponse]
    }
  }

  @js.native
  trait DeleteAttendeeRequest extends js.Object {
    var AttendeeId: GuidString
    var MeetingId: GuidString
  }

  object DeleteAttendeeRequest {
    @inline
    def apply(
        AttendeeId: GuidString,
        MeetingId: GuidString
    ): DeleteAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "AttendeeId" -> AttendeeId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAttendeeRequest]
    }
  }

  @js.native
  trait DeleteMeetingRequest extends js.Object {
    var MeetingId: GuidString
  }

  object DeleteMeetingRequest {
    @inline
    def apply(
        MeetingId: GuidString
    ): DeleteMeetingRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMeetingRequest]
    }
  }

  /** Settings specific to the Amazon Transcribe Medical engine.
    */
  @js.native
  trait EngineTranscribeMedicalSettings extends js.Object {
    var LanguageCode: TranscribeMedicalLanguageCode
    var Specialty: TranscribeMedicalSpecialty
    var Type: TranscribeMedicalType
    var ContentIdentificationType: js.UndefOr[TranscribeMedicalContentIdentificationType]
    var Region: js.UndefOr[TranscribeMedicalRegion]
    var VocabularyName: js.UndefOr[String]
  }

  object EngineTranscribeMedicalSettings {
    @inline
    def apply(
        LanguageCode: TranscribeMedicalLanguageCode,
        Specialty: TranscribeMedicalSpecialty,
        Type: TranscribeMedicalType,
        ContentIdentificationType: js.UndefOr[TranscribeMedicalContentIdentificationType] = js.undefined,
        Region: js.UndefOr[TranscribeMedicalRegion] = js.undefined,
        VocabularyName: js.UndefOr[String] = js.undefined
    ): EngineTranscribeMedicalSettings = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Specialty" -> Specialty.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ContentIdentificationType.foreach(__v => __obj.updateDynamic("ContentIdentificationType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineTranscribeMedicalSettings]
    }
  }

  /** Settings specific to the Amazon Transcribe engine.
    */
  @js.native
  trait EngineTranscribeSettings extends js.Object {
    var ContentIdentificationType: js.UndefOr[TranscribeContentIdentificationType]
    var ContentRedactionType: js.UndefOr[TranscribeContentRedactionType]
    var EnablePartialResultsStabilization: js.UndefOr[Boolean]
    var IdentifyLanguage: js.UndefOr[Boolean]
    var LanguageCode: js.UndefOr[TranscribeLanguageCode]
    var LanguageModelName: js.UndefOr[TranscribeLanguageModelName]
    var LanguageOptions: js.UndefOr[TranscribeLanguageOptions]
    var PartialResultsStability: js.UndefOr[TranscribePartialResultsStability]
    var PiiEntityTypes: js.UndefOr[TranscribePiiEntityTypes]
    var PreferredLanguage: js.UndefOr[TranscribeLanguageCode]
    var Region: js.UndefOr[TranscribeRegion]
    var VocabularyFilterMethod: js.UndefOr[TranscribeVocabularyFilterMethod]
    var VocabularyFilterName: js.UndefOr[String]
    var VocabularyName: js.UndefOr[String]
  }

  object EngineTranscribeSettings {
    @inline
    def apply(
        ContentIdentificationType: js.UndefOr[TranscribeContentIdentificationType] = js.undefined,
        ContentRedactionType: js.UndefOr[TranscribeContentRedactionType] = js.undefined,
        EnablePartialResultsStabilization: js.UndefOr[Boolean] = js.undefined,
        IdentifyLanguage: js.UndefOr[Boolean] = js.undefined,
        LanguageCode: js.UndefOr[TranscribeLanguageCode] = js.undefined,
        LanguageModelName: js.UndefOr[TranscribeLanguageModelName] = js.undefined,
        LanguageOptions: js.UndefOr[TranscribeLanguageOptions] = js.undefined,
        PartialResultsStability: js.UndefOr[TranscribePartialResultsStability] = js.undefined,
        PiiEntityTypes: js.UndefOr[TranscribePiiEntityTypes] = js.undefined,
        PreferredLanguage: js.UndefOr[TranscribeLanguageCode] = js.undefined,
        Region: js.UndefOr[TranscribeRegion] = js.undefined,
        VocabularyFilterMethod: js.UndefOr[TranscribeVocabularyFilterMethod] = js.undefined,
        VocabularyFilterName: js.UndefOr[String] = js.undefined,
        VocabularyName: js.UndefOr[String] = js.undefined
    ): EngineTranscribeSettings = {
      val __obj = js.Dynamic.literal()
      ContentIdentificationType.foreach(__v => __obj.updateDynamic("ContentIdentificationType")(__v.asInstanceOf[js.Any]))
      ContentRedactionType.foreach(__v => __obj.updateDynamic("ContentRedactionType")(__v.asInstanceOf[js.Any]))
      EnablePartialResultsStabilization.foreach(__v => __obj.updateDynamic("EnablePartialResultsStabilization")(__v.asInstanceOf[js.Any]))
      IdentifyLanguage.foreach(__v => __obj.updateDynamic("IdentifyLanguage")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageModelName.foreach(__v => __obj.updateDynamic("LanguageModelName")(__v.asInstanceOf[js.Any]))
      LanguageOptions.foreach(__v => __obj.updateDynamic("LanguageOptions")(__v.asInstanceOf[js.Any]))
      PartialResultsStability.foreach(__v => __obj.updateDynamic("PartialResultsStability")(__v.asInstanceOf[js.Any]))
      PiiEntityTypes.foreach(__v => __obj.updateDynamic("PiiEntityTypes")(__v.asInstanceOf[js.Any]))
      PreferredLanguage.foreach(__v => __obj.updateDynamic("PreferredLanguage")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      VocabularyFilterMethod.foreach(__v => __obj.updateDynamic("VocabularyFilterMethod")(__v.asInstanceOf[js.Any]))
      VocabularyFilterName.foreach(__v => __obj.updateDynamic("VocabularyFilterName")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineTranscribeSettings]
    }
  }

  @js.native
  trait GetAttendeeRequest extends js.Object {
    var AttendeeId: GuidString
    var MeetingId: GuidString
  }

  object GetAttendeeRequest {
    @inline
    def apply(
        AttendeeId: GuidString,
        MeetingId: GuidString
    ): GetAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "AttendeeId" -> AttendeeId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAttendeeRequest]
    }
  }

  @js.native
  trait GetAttendeeResponse extends js.Object {
    var Attendee: js.UndefOr[Attendee]
  }

  object GetAttendeeResponse {
    @inline
    def apply(
        Attendee: js.UndefOr[Attendee] = js.undefined
    ): GetAttendeeResponse = {
      val __obj = js.Dynamic.literal()
      Attendee.foreach(__v => __obj.updateDynamic("Attendee")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAttendeeResponse]
    }
  }

  @js.native
  trait GetMeetingRequest extends js.Object {
    var MeetingId: GuidString
  }

  object GetMeetingRequest {
    @inline
    def apply(
        MeetingId: GuidString
    ): GetMeetingRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMeetingRequest]
    }
  }

  @js.native
  trait GetMeetingResponse extends js.Object {
    var Meeting: js.UndefOr[Meeting]
  }

  object GetMeetingResponse {
    @inline
    def apply(
        Meeting: js.UndefOr[Meeting] = js.undefined
    ): GetMeetingResponse = {
      val __obj = js.Dynamic.literal()
      Meeting.foreach(__v => __obj.updateDynamic("Meeting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMeetingResponse]
    }
  }

  @js.native
  trait ListAttendeesRequest extends js.Object {
    var MeetingId: GuidString
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListAttendeesRequest {
    @inline
    def apply(
        MeetingId: GuidString,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAttendeesRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttendeesRequest]
    }
  }

  @js.native
  trait ListAttendeesResponse extends js.Object {
    var Attendees: js.UndefOr[AttendeeList]
    var NextToken: js.UndefOr[String]
  }

  object ListAttendeesResponse {
    @inline
    def apply(
        Attendees: js.UndefOr[AttendeeList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAttendeesResponse = {
      val __obj = js.Dynamic.literal()
      Attendees.foreach(__v => __obj.updateDynamic("Attendees")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttendeesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A set of endpoints used by clients to connect to the media service group for an Amazon Chime SDK meeting.
    */
  @js.native
  trait MediaPlacement extends js.Object {
    var AudioFallbackUrl: js.UndefOr[String]
    var AudioHostUrl: js.UndefOr[String]
    var EventIngestionUrl: js.UndefOr[String]
    var ScreenDataUrl: js.UndefOr[String]
    var ScreenSharingUrl: js.UndefOr[String]
    var ScreenViewingUrl: js.UndefOr[String]
    var SignalingUrl: js.UndefOr[String]
    var TurnControlUrl: js.UndefOr[String]
  }

  object MediaPlacement {
    @inline
    def apply(
        AudioFallbackUrl: js.UndefOr[String] = js.undefined,
        AudioHostUrl: js.UndefOr[String] = js.undefined,
        EventIngestionUrl: js.UndefOr[String] = js.undefined,
        ScreenDataUrl: js.UndefOr[String] = js.undefined,
        ScreenSharingUrl: js.UndefOr[String] = js.undefined,
        ScreenViewingUrl: js.UndefOr[String] = js.undefined,
        SignalingUrl: js.UndefOr[String] = js.undefined,
        TurnControlUrl: js.UndefOr[String] = js.undefined
    ): MediaPlacement = {
      val __obj = js.Dynamic.literal()
      AudioFallbackUrl.foreach(__v => __obj.updateDynamic("AudioFallbackUrl")(__v.asInstanceOf[js.Any]))
      AudioHostUrl.foreach(__v => __obj.updateDynamic("AudioHostUrl")(__v.asInstanceOf[js.Any]))
      EventIngestionUrl.foreach(__v => __obj.updateDynamic("EventIngestionUrl")(__v.asInstanceOf[js.Any]))
      ScreenDataUrl.foreach(__v => __obj.updateDynamic("ScreenDataUrl")(__v.asInstanceOf[js.Any]))
      ScreenSharingUrl.foreach(__v => __obj.updateDynamic("ScreenSharingUrl")(__v.asInstanceOf[js.Any]))
      ScreenViewingUrl.foreach(__v => __obj.updateDynamic("ScreenViewingUrl")(__v.asInstanceOf[js.Any]))
      SignalingUrl.foreach(__v => __obj.updateDynamic("SignalingUrl")(__v.asInstanceOf[js.Any]))
      TurnControlUrl.foreach(__v => __obj.updateDynamic("TurnControlUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaPlacement]
    }
  }

  /** A meeting created using the Amazon Chime SDK.
    */
  @js.native
  trait Meeting extends js.Object {
    var ExternalMeetingId: js.UndefOr[ExternalMeetingId]
    var MediaPlacement: js.UndefOr[MediaPlacement]
    var MediaRegion: js.UndefOr[MediaRegion]
    var MeetingArn: js.UndefOr[AmazonResourceName]
    var MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration]
    var MeetingHostId: js.UndefOr[ExternalUserId]
    var MeetingId: js.UndefOr[GuidString]
    var PrimaryMeetingId: js.UndefOr[PrimaryMeetingId]
    var TenantIds: js.UndefOr[TenantIdList]
  }

  object Meeting {
    @inline
    def apply(
        ExternalMeetingId: js.UndefOr[ExternalMeetingId] = js.undefined,
        MediaPlacement: js.UndefOr[MediaPlacement] = js.undefined,
        MediaRegion: js.UndefOr[MediaRegion] = js.undefined,
        MeetingArn: js.UndefOr[AmazonResourceName] = js.undefined,
        MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration] = js.undefined,
        MeetingHostId: js.UndefOr[ExternalUserId] = js.undefined,
        MeetingId: js.UndefOr[GuidString] = js.undefined,
        PrimaryMeetingId: js.UndefOr[PrimaryMeetingId] = js.undefined,
        TenantIds: js.UndefOr[TenantIdList] = js.undefined
    ): Meeting = {
      val __obj = js.Dynamic.literal()
      ExternalMeetingId.foreach(__v => __obj.updateDynamic("ExternalMeetingId")(__v.asInstanceOf[js.Any]))
      MediaPlacement.foreach(__v => __obj.updateDynamic("MediaPlacement")(__v.asInstanceOf[js.Any]))
      MediaRegion.foreach(__v => __obj.updateDynamic("MediaRegion")(__v.asInstanceOf[js.Any]))
      MeetingArn.foreach(__v => __obj.updateDynamic("MeetingArn")(__v.asInstanceOf[js.Any]))
      MeetingFeatures.foreach(__v => __obj.updateDynamic("MeetingFeatures")(__v.asInstanceOf[js.Any]))
      MeetingHostId.foreach(__v => __obj.updateDynamic("MeetingHostId")(__v.asInstanceOf[js.Any]))
      MeetingId.foreach(__v => __obj.updateDynamic("MeetingId")(__v.asInstanceOf[js.Any]))
      PrimaryMeetingId.foreach(__v => __obj.updateDynamic("PrimaryMeetingId")(__v.asInstanceOf[js.Any]))
      TenantIds.foreach(__v => __obj.updateDynamic("TenantIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Meeting]
    }
  }

  /** The configuration settings of the features available to a meeting.&gt;
    */
  @js.native
  trait MeetingFeaturesConfiguration extends js.Object {
    var Audio: js.UndefOr[AudioFeatures]
  }

  object MeetingFeaturesConfiguration {
    @inline
    def apply(
        Audio: js.UndefOr[AudioFeatures] = js.undefined
    ): MeetingFeaturesConfiguration = {
      val __obj = js.Dynamic.literal()
      Audio.foreach(__v => __obj.updateDynamic("Audio")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeetingFeaturesConfiguration]
    }
  }

  /** The configuration for resource targets to receive notifications when meeting and attendee events occur.
    */
  @js.native
  trait NotificationsConfiguration extends js.Object {
    var LambdaFunctionArn: js.UndefOr[Arn]
    var SnsTopicArn: js.UndefOr[Arn]
    var SqsQueueArn: js.UndefOr[Arn]
  }

  object NotificationsConfiguration {
    @inline
    def apply(
        LambdaFunctionArn: js.UndefOr[Arn] = js.undefined,
        SnsTopicArn: js.UndefOr[Arn] = js.undefined,
        SqsQueueArn: js.UndefOr[Arn] = js.undefined
    ): NotificationsConfiguration = {
      val __obj = js.Dynamic.literal()
      LambdaFunctionArn.foreach(__v => __obj.updateDynamic("LambdaFunctionArn")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SqsQueueArn.foreach(__v => __obj.updateDynamic("SqsQueueArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationsConfiguration]
    }
  }

  @js.native
  trait StartMeetingTranscriptionRequest extends js.Object {
    var MeetingId: GuidString
    var TranscriptionConfiguration: TranscriptionConfiguration
  }

  object StartMeetingTranscriptionRequest {
    @inline
    def apply(
        MeetingId: GuidString,
        TranscriptionConfiguration: TranscriptionConfiguration
    ): StartMeetingTranscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any],
        "TranscriptionConfiguration" -> TranscriptionConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMeetingTranscriptionRequest]
    }
  }

  @js.native
  trait StopMeetingTranscriptionRequest extends js.Object {
    var MeetingId: GuidString
  }

  object StopMeetingTranscriptionRequest {
    @inline
    def apply(
        MeetingId: GuidString
    ): StopMeetingTranscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopMeetingTranscriptionRequest]
    }
  }

  /** A key-value pair that you define.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** The configuration for the current transcription operation. Must contain <code>EngineTranscribeSettings</code> or <code>EngineTranscribeMedicalSettings</code>.
    */
  @js.native
  trait TranscriptionConfiguration extends js.Object {
    var EngineTranscribeMedicalSettings: js.UndefOr[EngineTranscribeMedicalSettings]
    var EngineTranscribeSettings: js.UndefOr[EngineTranscribeSettings]
  }

  object TranscriptionConfiguration {
    @inline
    def apply(
        EngineTranscribeMedicalSettings: js.UndefOr[EngineTranscribeMedicalSettings] = js.undefined,
        EngineTranscribeSettings: js.UndefOr[EngineTranscribeSettings] = js.undefined
    ): TranscriptionConfiguration = {
      val __obj = js.Dynamic.literal()
      EngineTranscribeMedicalSettings.foreach(__v => __obj.updateDynamic("EngineTranscribeMedicalSettings")(__v.asInstanceOf[js.Any]))
      EngineTranscribeSettings.foreach(__v => __obj.updateDynamic("EngineTranscribeSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranscriptionConfiguration]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAttendeeCapabilitiesRequest extends js.Object {
    var AttendeeId: GuidString
    var Capabilities: AttendeeCapabilities
    var MeetingId: GuidString
  }

  object UpdateAttendeeCapabilitiesRequest {
    @inline
    def apply(
        AttendeeId: GuidString,
        Capabilities: AttendeeCapabilities,
        MeetingId: GuidString
    ): UpdateAttendeeCapabilitiesRequest = {
      val __obj = js.Dynamic.literal(
        "AttendeeId" -> AttendeeId.asInstanceOf[js.Any],
        "Capabilities" -> Capabilities.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAttendeeCapabilitiesRequest]
    }
  }

  @js.native
  trait UpdateAttendeeCapabilitiesResponse extends js.Object {
    var Attendee: js.UndefOr[Attendee]
  }

  object UpdateAttendeeCapabilitiesResponse {
    @inline
    def apply(
        Attendee: js.UndefOr[Attendee] = js.undefined
    ): UpdateAttendeeCapabilitiesResponse = {
      val __obj = js.Dynamic.literal()
      Attendee.foreach(__v => __obj.updateDynamic("Attendee")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAttendeeCapabilitiesResponse]
    }
  }
}
