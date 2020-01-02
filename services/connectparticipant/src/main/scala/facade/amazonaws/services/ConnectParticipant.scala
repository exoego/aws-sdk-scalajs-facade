package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object connectparticipant {
  type ChatContent            = String
  type ChatContentType        = String
  type ChatItemId             = String
  type ChatItemType           = String
  type ClientToken            = String
  type ConnectionType         = String
  type ConnectionTypeList     = js.Array[ConnectionType]
  type ContactId              = String
  type DisplayName            = String
  type ISO8601Datetime        = String
  type Instant                = String
  type MaxResults             = Int
  type MostRecent             = Int
  type NextToken              = String
  type ParticipantId          = String
  type ParticipantRole        = String
  type ParticipantToken       = String
  type PreSignedConnectionUrl = String
  type ScanDirection          = String
  type SortKey                = String
  type Transcript             = js.Array[Item]

  implicit final class ConnectParticipantOps(private val service: ConnectParticipant) extends AnyVal {

    @inline def createParticipantConnectionFuture(
        params: CreateParticipantConnectionRequest
    ): Future[CreateParticipantConnectionResponse] = service.createParticipantConnection(params).promise.toFuture
    @inline def disconnectParticipantFuture(
        params: DisconnectParticipantRequest
    ): Future[DisconnectParticipantResponse] = service.disconnectParticipant(params).promise.toFuture
    @inline def getTranscriptFuture(params: GetTranscriptRequest): Future[GetTranscriptResponse] =
      service.getTranscript(params).promise.toFuture
    @inline def sendEventFuture(params: SendEventRequest): Future[SendEventResponse] =
      service.sendEvent(params).promise.toFuture
    @inline def sendMessageFuture(params: SendMessageRequest): Future[SendMessageResponse] =
      service.sendMessage(params).promise.toFuture
  }
}

package connectparticipant {
  @js.native
  @JSImport("aws-sdk", "ConnectParticipant")
  class ConnectParticipant() extends js.Object {
    def this(config: AWSConfig) = this()

    def createParticipantConnection(
        params: CreateParticipantConnectionRequest
    ): Request[CreateParticipantConnectionResponse]                                                         = js.native
    def disconnectParticipant(params: DisconnectParticipantRequest): Request[DisconnectParticipantResponse] = js.native
    def getTranscript(params: GetTranscriptRequest): Request[GetTranscriptResponse]                         = js.native
    def sendEvent(params: SendEventRequest): Request[SendEventResponse]                                     = js.native
    def sendMessage(params: SendMessageRequest): Request[SendMessageResponse]                               = js.native
  }

  object ChatItemTypeEnum {
    val MESSAGE        = "MESSAGE"
    val EVENT          = "EVENT"
    val CONNECTION_ACK = "CONNECTION_ACK"

    val values = js.Object.freeze(js.Array(MESSAGE, EVENT, CONNECTION_ACK))
  }

  /**
    * Connection credentials.
    */
  @js.native
  trait ConnectionCredentials extends js.Object {
    var ConnectionToken: js.UndefOr[ParticipantToken]
    var Expiry: js.UndefOr[ISO8601Datetime]
  }

  object ConnectionCredentials {
    @inline
    def apply(
        ConnectionToken: js.UndefOr[ParticipantToken] = js.undefined,
        Expiry: js.UndefOr[ISO8601Datetime] = js.undefined
    ): ConnectionCredentials = {
      val __obj = js.Dynamic.literal()
      ConnectionToken.foreach(__v => __obj.updateDynamic("ConnectionToken")(__v.asInstanceOf[js.Any]))
      Expiry.foreach(__v => __obj.updateDynamic("Expiry")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionCredentials]
    }
  }

  object ConnectionTypeEnum {
    val WEBSOCKET              = "WEBSOCKET"
    val CONNECTION_CREDENTIALS = "CONNECTION_CREDENTIALS"

    val values = js.Object.freeze(js.Array(WEBSOCKET, CONNECTION_CREDENTIALS))
  }

  @js.native
  trait CreateParticipantConnectionRequest extends js.Object {
    var ParticipantToken: ParticipantToken
    var Type: ConnectionTypeList
  }

  object CreateParticipantConnectionRequest {
    @inline
    def apply(
        ParticipantToken: ParticipantToken,
        Type: ConnectionTypeList
    ): CreateParticipantConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ParticipantToken" -> ParticipantToken.asInstanceOf[js.Any],
        "Type"             -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateParticipantConnectionRequest]
    }
  }

  @js.native
  trait CreateParticipantConnectionResponse extends js.Object {
    var ConnectionCredentials: js.UndefOr[ConnectionCredentials]
    var Websocket: js.UndefOr[Websocket]
  }

  object CreateParticipantConnectionResponse {
    @inline
    def apply(
        ConnectionCredentials: js.UndefOr[ConnectionCredentials] = js.undefined,
        Websocket: js.UndefOr[Websocket] = js.undefined
    ): CreateParticipantConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionCredentials.foreach(__v => __obj.updateDynamic("ConnectionCredentials")(__v.asInstanceOf[js.Any]))
      Websocket.foreach(__v => __obj.updateDynamic("Websocket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateParticipantConnectionResponse]
    }
  }

  @js.native
  trait DisconnectParticipantRequest extends js.Object {
    var ConnectionToken: ParticipantToken
    var ClientToken: js.UndefOr[ClientToken]
  }

  object DisconnectParticipantRequest {
    @inline
    def apply(
        ConnectionToken: ParticipantToken,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): DisconnectParticipantRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionToken" -> ConnectionToken.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisconnectParticipantRequest]
    }
  }

  @js.native
  trait DisconnectParticipantResponse extends js.Object {}

  object DisconnectParticipantResponse {
    @inline
    def apply(
        ): DisconnectParticipantResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisconnectParticipantResponse]
    }
  }

  @js.native
  trait GetTranscriptRequest extends js.Object {
    var ConnectionToken: ParticipantToken
    var ContactId: js.UndefOr[ContactId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ScanDirection: js.UndefOr[ScanDirection]
    var SortOrder: js.UndefOr[SortKey]
    var StartPosition: js.UndefOr[StartPosition]
  }

  object GetTranscriptRequest {
    @inline
    def apply(
        ConnectionToken: ParticipantToken,
        ContactId: js.UndefOr[ContactId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScanDirection: js.UndefOr[ScanDirection] = js.undefined,
        SortOrder: js.UndefOr[SortKey] = js.undefined,
        StartPosition: js.UndefOr[StartPosition] = js.undefined
    ): GetTranscriptRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionToken" -> ConnectionToken.asInstanceOf[js.Any]
      )

      ContactId.foreach(__v => __obj.updateDynamic("ContactId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScanDirection.foreach(__v => __obj.updateDynamic("ScanDirection")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      StartPosition.foreach(__v => __obj.updateDynamic("StartPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTranscriptRequest]
    }
  }

  @js.native
  trait GetTranscriptResponse extends js.Object {
    var InitialContactId: js.UndefOr[ContactId]
    var NextToken: js.UndefOr[NextToken]
    var Transcript: js.UndefOr[Transcript]
  }

  object GetTranscriptResponse {
    @inline
    def apply(
        InitialContactId: js.UndefOr[ContactId] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Transcript: js.UndefOr[Transcript] = js.undefined
    ): GetTranscriptResponse = {
      val __obj = js.Dynamic.literal()
      InitialContactId.foreach(__v => __obj.updateDynamic("InitialContactId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Transcript.foreach(__v => __obj.updateDynamic("Transcript")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTranscriptResponse]
    }
  }

  /**
    * An item - message or event - that has been sent.
    */
  @js.native
  trait Item extends js.Object {
    var AbsoluteTime: js.UndefOr[Instant]
    var Content: js.UndefOr[ChatContent]
    var ContentType: js.UndefOr[ChatContentType]
    var DisplayName: js.UndefOr[DisplayName]
    var Id: js.UndefOr[ChatItemId]
    var ParticipantId: js.UndefOr[ParticipantId]
    var ParticipantRole: js.UndefOr[ParticipantRole]
    var Type: js.UndefOr[ChatItemType]
  }

  object Item {
    @inline
    def apply(
        AbsoluteTime: js.UndefOr[Instant] = js.undefined,
        Content: js.UndefOr[ChatContent] = js.undefined,
        ContentType: js.UndefOr[ChatContentType] = js.undefined,
        DisplayName: js.UndefOr[DisplayName] = js.undefined,
        Id: js.UndefOr[ChatItemId] = js.undefined,
        ParticipantId: js.UndefOr[ParticipantId] = js.undefined,
        ParticipantRole: js.UndefOr[ParticipantRole] = js.undefined,
        Type: js.UndefOr[ChatItemType] = js.undefined
    ): Item = {
      val __obj = js.Dynamic.literal()
      AbsoluteTime.foreach(__v => __obj.updateDynamic("AbsoluteTime")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ParticipantId.foreach(__v => __obj.updateDynamic("ParticipantId")(__v.asInstanceOf[js.Any]))
      ParticipantRole.foreach(__v => __obj.updateDynamic("ParticipantRole")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Item]
    }
  }

  object ParticipantRoleEnum {
    val AGENT    = "AGENT"
    val CUSTOMER = "CUSTOMER"
    val SYSTEM   = "SYSTEM"

    val values = js.Object.freeze(js.Array(AGENT, CUSTOMER, SYSTEM))
  }

  object ScanDirectionEnum {
    val FORWARD  = "FORWARD"
    val BACKWARD = "BACKWARD"

    val values = js.Object.freeze(js.Array(FORWARD, BACKWARD))
  }

  @js.native
  trait SendEventRequest extends js.Object {
    var ConnectionToken: ParticipantToken
    var ContentType: ChatContentType
    var ClientToken: js.UndefOr[ClientToken]
    var Content: js.UndefOr[ChatContent]
  }

  object SendEventRequest {
    @inline
    def apply(
        ConnectionToken: ParticipantToken,
        ContentType: ChatContentType,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Content: js.UndefOr[ChatContent] = js.undefined
    ): SendEventRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionToken" -> ConnectionToken.asInstanceOf[js.Any],
        "ContentType"     -> ContentType.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendEventRequest]
    }
  }

  @js.native
  trait SendEventResponse extends js.Object {
    var AbsoluteTime: js.UndefOr[Instant]
    var Id: js.UndefOr[ChatItemId]
  }

  object SendEventResponse {
    @inline
    def apply(
        AbsoluteTime: js.UndefOr[Instant] = js.undefined,
        Id: js.UndefOr[ChatItemId] = js.undefined
    ): SendEventResponse = {
      val __obj = js.Dynamic.literal()
      AbsoluteTime.foreach(__v => __obj.updateDynamic("AbsoluteTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendEventResponse]
    }
  }

  @js.native
  trait SendMessageRequest extends js.Object {
    var ConnectionToken: ParticipantToken
    var Content: ChatContent
    var ContentType: ChatContentType
    var ClientToken: js.UndefOr[ClientToken]
  }

  object SendMessageRequest {
    @inline
    def apply(
        ConnectionToken: ParticipantToken,
        Content: ChatContent,
        ContentType: ChatContentType,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): SendMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionToken" -> ConnectionToken.asInstanceOf[js.Any],
        "Content"         -> Content.asInstanceOf[js.Any],
        "ContentType"     -> ContentType.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendMessageRequest]
    }
  }

  @js.native
  trait SendMessageResponse extends js.Object {
    var AbsoluteTime: js.UndefOr[Instant]
    var Id: js.UndefOr[ChatItemId]
  }

  object SendMessageResponse {
    @inline
    def apply(
        AbsoluteTime: js.UndefOr[Instant] = js.undefined,
        Id: js.UndefOr[ChatItemId] = js.undefined
    ): SendMessageResponse = {
      val __obj = js.Dynamic.literal()
      AbsoluteTime.foreach(__v => __obj.updateDynamic("AbsoluteTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendMessageResponse]
    }
  }

  object SortKeyEnum {
    val DESCENDING = "DESCENDING"
    val ASCENDING  = "ASCENDING"

    val values = js.Object.freeze(js.Array(DESCENDING, ASCENDING))
  }

  /**
    * A filtering option for where to start. For example, if you sent 100 messages, start with message 50.
    */
  @js.native
  trait StartPosition extends js.Object {
    var AbsoluteTime: js.UndefOr[Instant]
    var Id: js.UndefOr[ChatItemId]
    var MostRecent: js.UndefOr[MostRecent]
  }

  object StartPosition {
    @inline
    def apply(
        AbsoluteTime: js.UndefOr[Instant] = js.undefined,
        Id: js.UndefOr[ChatItemId] = js.undefined,
        MostRecent: js.UndefOr[MostRecent] = js.undefined
    ): StartPosition = {
      val __obj = js.Dynamic.literal()
      AbsoluteTime.foreach(__v => __obj.updateDynamic("AbsoluteTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MostRecent.foreach(__v => __obj.updateDynamic("MostRecent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPosition]
    }
  }

  /**
    * The websocket for the participant's connection.
    */
  @js.native
  trait Websocket extends js.Object {
    var ConnectionExpiry: js.UndefOr[ISO8601Datetime]
    var Url: js.UndefOr[PreSignedConnectionUrl]
  }

  object Websocket {
    @inline
    def apply(
        ConnectionExpiry: js.UndefOr[ISO8601Datetime] = js.undefined,
        Url: js.UndefOr[PreSignedConnectionUrl] = js.undefined
    ): Websocket = {
      val __obj = js.Dynamic.literal()
      ConnectionExpiry.foreach(__v => __obj.updateDynamic("ConnectionExpiry")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Websocket]
    }
  }
}
