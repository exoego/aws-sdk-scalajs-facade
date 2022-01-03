package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object chimesdkmeetings {
  type Arn = String
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
  type ResultMax = Int
  type TranscribeLanguageModelName = String
  type TranscribePiiEntityTypes = String

  final class ChimeSDKMeetingsOps(private val service: ChimeSDKMeetings) extends AnyVal {

    @inline def batchCreateAttendeeFuture(params: BatchCreateAttendeeRequest): Future[BatchCreateAttendeeResponse] = service.batchCreateAttendee(params).promise().toFuture
    @inline def createAttendeeFuture(params: CreateAttendeeRequest): Future[CreateAttendeeResponse] = service.createAttendee(params).promise().toFuture
    @inline def createMeetingFuture(params: CreateMeetingRequest): Future[CreateMeetingResponse] = service.createMeeting(params).promise().toFuture
    @inline def createMeetingWithAttendeesFuture(params: CreateMeetingWithAttendeesRequest): Future[CreateMeetingWithAttendeesResponse] = service.createMeetingWithAttendees(params).promise().toFuture
    @inline def deleteAttendeeFuture(params: DeleteAttendeeRequest): Future[js.Object] = service.deleteAttendee(params).promise().toFuture
    @inline def deleteMeetingFuture(params: DeleteMeetingRequest): Future[js.Object] = service.deleteMeeting(params).promise().toFuture
    @inline def getAttendeeFuture(params: GetAttendeeRequest): Future[GetAttendeeResponse] = service.getAttendee(params).promise().toFuture
    @inline def getMeetingFuture(params: GetMeetingRequest): Future[GetMeetingResponse] = service.getMeeting(params).promise().toFuture
    @inline def listAttendeesFuture(params: ListAttendeesRequest): Future[ListAttendeesResponse] = service.listAttendees(params).promise().toFuture
    @inline def startMeetingTranscriptionFuture(params: StartMeetingTranscriptionRequest): Future[js.Object] = service.startMeetingTranscription(params).promise().toFuture
    @inline def stopMeetingTranscriptionFuture(params: StopMeetingTranscriptionRequest): Future[js.Object] = service.stopMeetingTranscription(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/chimesdkmeetings", JSImport.Namespace, "AWS.ChimeSDKMeetings")
  class ChimeSDKMeetings() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCreateAttendee(params: BatchCreateAttendeeRequest): Request[BatchCreateAttendeeResponse] = js.native
    def createAttendee(params: CreateAttendeeRequest): Request[CreateAttendeeResponse] = js.native
    def createMeeting(params: CreateMeetingRequest): Request[CreateMeetingResponse] = js.native
    def createMeetingWithAttendees(params: CreateMeetingWithAttendeesRequest): Request[CreateMeetingWithAttendeesResponse] = js.native
    def deleteAttendee(params: DeleteAttendeeRequest): Request[js.Object] = js.native
    def deleteMeeting(params: DeleteMeetingRequest): Request[js.Object] = js.native
    def getAttendee(params: GetAttendeeRequest): Request[GetAttendeeResponse] = js.native
    def getMeeting(params: GetMeetingRequest): Request[GetMeetingResponse] = js.native
    def listAttendees(params: ListAttendeesRequest): Request[ListAttendeesResponse] = js.native
    def startMeetingTranscription(params: StartMeetingTranscriptionRequest): Request[js.Object] = js.native
    def stopMeetingTranscription(params: StopMeetingTranscriptionRequest): Request[js.Object] = js.native
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
    var ExternalUserId: js.UndefOr[ExternalUserId]
    var JoinToken: js.UndefOr[JoinTokenString]
  }

  object Attendee {
    @inline
    def apply(
        AttendeeId: js.UndefOr[GuidString] = js.undefined,
        ExternalUserId: js.UndefOr[ExternalUserId] = js.undefined,
        JoinToken: js.UndefOr[JoinTokenString] = js.undefined
    ): Attendee = {
      val __obj = js.Dynamic.literal()
      AttendeeId.foreach(__v => __obj.updateDynamic("AttendeeId")(__v.asInstanceOf[js.Any]))
      ExternalUserId.foreach(__v => __obj.updateDynamic("ExternalUserId")(__v.asInstanceOf[js.Any]))
      JoinToken.foreach(__v => __obj.updateDynamic("JoinToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attendee]
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
  }

  object CreateAttendeeRequest {
    @inline
    def apply(
        ExternalUserId: ExternalUserId,
        MeetingId: GuidString
    ): CreateAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "ExternalUserId" -> ExternalUserId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAttendeeRequest]
    }
  }

  /** The Amazon Chime SDK attendee fields to create, used with the BatchCreateAttendee action.
    */
  @js.native
  trait CreateAttendeeRequestItem extends js.Object {
    var ExternalUserId: ExternalUserId
  }

  object CreateAttendeeRequestItem {
    @inline
    def apply(
        ExternalUserId: ExternalUserId
    ): CreateAttendeeRequestItem = {
      val __obj = js.Dynamic.literal(
        "ExternalUserId" -> ExternalUserId.asInstanceOf[js.Any]
      )
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
  }

  object CreateMeetingRequest {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        ExternalMeetingId: ExternalMeetingId,
        MediaRegion: MediaRegion,
        MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration] = js.undefined,
        MeetingHostId: js.UndefOr[ExternalUserId] = js.undefined,
        NotificationsConfiguration: js.UndefOr[NotificationsConfiguration] = js.undefined
    ): CreateMeetingRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "ExternalMeetingId" -> ExternalMeetingId.asInstanceOf[js.Any],
        "MediaRegion" -> MediaRegion.asInstanceOf[js.Any]
      )

      MeetingFeatures.foreach(__v => __obj.updateDynamic("MeetingFeatures")(__v.asInstanceOf[js.Any]))
      MeetingHostId.foreach(__v => __obj.updateDynamic("MeetingHostId")(__v.asInstanceOf[js.Any]))
      NotificationsConfiguration.foreach(__v => __obj.updateDynamic("NotificationsConfiguration")(__v.asInstanceOf[js.Any]))
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
        NotificationsConfiguration: js.UndefOr[NotificationsConfiguration] = js.undefined
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
    var LanguageCode: TranscribeLanguageCode
    var ContentIdentificationType: js.UndefOr[TranscribeContentIdentificationType]
    var ContentRedactionType: js.UndefOr[TranscribeContentRedactionType]
    var EnablePartialResultsStabilization: js.UndefOr[Boolean]
    var LanguageModelName: js.UndefOr[TranscribeLanguageModelName]
    var PartialResultsStability: js.UndefOr[TranscribePartialResultsStability]
    var PiiEntityTypes: js.UndefOr[TranscribePiiEntityTypes]
    var Region: js.UndefOr[TranscribeRegion]
    var VocabularyFilterMethod: js.UndefOr[TranscribeVocabularyFilterMethod]
    var VocabularyFilterName: js.UndefOr[String]
    var VocabularyName: js.UndefOr[String]
  }

  object EngineTranscribeSettings {
    @inline
    def apply(
        LanguageCode: TranscribeLanguageCode,
        ContentIdentificationType: js.UndefOr[TranscribeContentIdentificationType] = js.undefined,
        ContentRedactionType: js.UndefOr[TranscribeContentRedactionType] = js.undefined,
        EnablePartialResultsStabilization: js.UndefOr[Boolean] = js.undefined,
        LanguageModelName: js.UndefOr[TranscribeLanguageModelName] = js.undefined,
        PartialResultsStability: js.UndefOr[TranscribePartialResultsStability] = js.undefined,
        PiiEntityTypes: js.UndefOr[TranscribePiiEntityTypes] = js.undefined,
        Region: js.UndefOr[TranscribeRegion] = js.undefined,
        VocabularyFilterMethod: js.UndefOr[TranscribeVocabularyFilterMethod] = js.undefined,
        VocabularyFilterName: js.UndefOr[String] = js.undefined,
        VocabularyName: js.UndefOr[String] = js.undefined
    ): EngineTranscribeSettings = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any]
      )

      ContentIdentificationType.foreach(__v => __obj.updateDynamic("ContentIdentificationType")(__v.asInstanceOf[js.Any]))
      ContentRedactionType.foreach(__v => __obj.updateDynamic("ContentRedactionType")(__v.asInstanceOf[js.Any]))
      EnablePartialResultsStabilization.foreach(__v => __obj.updateDynamic("EnablePartialResultsStabilization")(__v.asInstanceOf[js.Any]))
      LanguageModelName.foreach(__v => __obj.updateDynamic("LanguageModelName")(__v.asInstanceOf[js.Any]))
      PartialResultsStability.foreach(__v => __obj.updateDynamic("PartialResultsStability")(__v.asInstanceOf[js.Any]))
      PiiEntityTypes.foreach(__v => __obj.updateDynamic("PiiEntityTypes")(__v.asInstanceOf[js.Any]))
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
    var MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration]
    var MeetingHostId: js.UndefOr[ExternalUserId]
    var MeetingId: js.UndefOr[GuidString]
  }

  object Meeting {
    @inline
    def apply(
        ExternalMeetingId: js.UndefOr[ExternalMeetingId] = js.undefined,
        MediaPlacement: js.UndefOr[MediaPlacement] = js.undefined,
        MediaRegion: js.UndefOr[MediaRegion] = js.undefined,
        MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration] = js.undefined,
        MeetingHostId: js.UndefOr[ExternalUserId] = js.undefined,
        MeetingId: js.UndefOr[GuidString] = js.undefined
    ): Meeting = {
      val __obj = js.Dynamic.literal()
      ExternalMeetingId.foreach(__v => __obj.updateDynamic("ExternalMeetingId")(__v.asInstanceOf[js.Any]))
      MediaPlacement.foreach(__v => __obj.updateDynamic("MediaPlacement")(__v.asInstanceOf[js.Any]))
      MediaRegion.foreach(__v => __obj.updateDynamic("MediaRegion")(__v.asInstanceOf[js.Any]))
      MeetingFeatures.foreach(__v => __obj.updateDynamic("MeetingFeatures")(__v.asInstanceOf[js.Any]))
      MeetingHostId.foreach(__v => __obj.updateDynamic("MeetingHostId")(__v.asInstanceOf[js.Any]))
      MeetingId.foreach(__v => __obj.updateDynamic("MeetingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Meeting]
    }
  }

  /** The configuration settings of the features available to a meeting.
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
}
