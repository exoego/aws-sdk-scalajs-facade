package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object connectparticipant {
  type ChatContent            = String
  type ChatContentType        = String
  type ChatItemId             = String
  type ClientToken            = String
  type ConnectionTypeList     = js.Array[ConnectionType]
  type ContactId              = String
  type DisplayName            = String
  type ISO8601Datetime        = String
  type Instant                = String
  type MaxResults             = Int
  type MostRecent             = Int
  type NextToken              = String
  type ParticipantId          = String
  type ParticipantToken       = String
  type PreSignedConnectionUrl = String
  type Transcript             = js.Array[Item]

  implicit final class ConnectParticipantOps(private val service: ConnectParticipant) extends AnyVal {

    @inline def createParticipantConnectionFuture(
        params: CreateParticipantConnectionRequest
    ): Future[CreateParticipantConnectionResponse] = service.createParticipantConnection(params).promise().toFuture
    @inline def disconnectParticipantFuture(
        params: DisconnectParticipantRequest
    ): Future[DisconnectParticipantResponse] = service.disconnectParticipant(params).promise().toFuture
    @inline def getTranscriptFuture(params: GetTranscriptRequest): Future[GetTranscriptResponse] =
      service.getTranscript(params).promise().toFuture
    @inline def sendEventFuture(params: SendEventRequest): Future[SendEventResponse] =
      service.sendEvent(params).promise().toFuture
    @inline def sendMessageFuture(params: SendMessageRequest): Future[SendMessageResponse] =
      service.sendMessage(params).promise().toFuture
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

  @js.native
  sealed trait ChatItemType extends js.Any
  object ChatItemType extends js.Object {
    val MESSAGE        = "MESSAGE".asInstanceOf[ChatItemType]
    val EVENT          = "EVENT".asInstanceOf[ChatItemType]
    val CONNECTION_ACK = "CONNECTION_ACK".asInstanceOf[ChatItemType]

    val values = js.Object.freeze(js.Array(MESSAGE, EVENT, CONNECTION_ACK))
  }

  /**
    * Connection credentials.
    */
  @js.native
  @Factory
  trait ConnectionCredentials extends js.Object {
    var ConnectionToken: js.UndefOr[ParticipantToken]
    var Expiry: js.UndefOr[ISO8601Datetime]
  }

  @js.native
  sealed trait ConnectionType extends js.Any
  object ConnectionType extends js.Object {
    val WEBSOCKET              = "WEBSOCKET".asInstanceOf[ConnectionType]
    val CONNECTION_CREDENTIALS = "CONNECTION_CREDENTIALS".asInstanceOf[ConnectionType]

    val values = js.Object.freeze(js.Array(WEBSOCKET, CONNECTION_CREDENTIALS))
  }

  @js.native
  @Factory
  trait CreateParticipantConnectionRequest extends js.Object {
    var ParticipantToken: ParticipantToken
    var Type: ConnectionTypeList
  }

  @js.native
  @Factory
  trait CreateParticipantConnectionResponse extends js.Object {
    var ConnectionCredentials: js.UndefOr[ConnectionCredentials]
    var Websocket: js.UndefOr[Websocket]
  }

  @js.native
  @Factory
  trait DisconnectParticipantRequest extends js.Object {
    var ConnectionToken: ParticipantToken
    var ClientToken: js.UndefOr[ClientToken]
  }

  @js.native
  @Factory
  trait DisconnectParticipantResponse extends js.Object {}

  @js.native
  @Factory
  trait GetTranscriptRequest extends js.Object {
    var ConnectionToken: ParticipantToken
    var ContactId: js.UndefOr[ContactId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ScanDirection: js.UndefOr[ScanDirection]
    var SortOrder: js.UndefOr[SortKey]
    var StartPosition: js.UndefOr[StartPosition]
  }

  @js.native
  @Factory
  trait GetTranscriptResponse extends js.Object {
    var InitialContactId: js.UndefOr[ContactId]
    var NextToken: js.UndefOr[NextToken]
    var Transcript: js.UndefOr[Transcript]
  }

  /**
    * An item - message or event - that has been sent.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ParticipantRole extends js.Any
  object ParticipantRole extends js.Object {
    val AGENT    = "AGENT".asInstanceOf[ParticipantRole]
    val CUSTOMER = "CUSTOMER".asInstanceOf[ParticipantRole]
    val SYSTEM   = "SYSTEM".asInstanceOf[ParticipantRole]

    val values = js.Object.freeze(js.Array(AGENT, CUSTOMER, SYSTEM))
  }

  @js.native
  sealed trait ScanDirection extends js.Any
  object ScanDirection extends js.Object {
    val FORWARD  = "FORWARD".asInstanceOf[ScanDirection]
    val BACKWARD = "BACKWARD".asInstanceOf[ScanDirection]

    val values = js.Object.freeze(js.Array(FORWARD, BACKWARD))
  }

  @js.native
  @Factory
  trait SendEventRequest extends js.Object {
    var ConnectionToken: ParticipantToken
    var ContentType: ChatContentType
    var ClientToken: js.UndefOr[ClientToken]
    var Content: js.UndefOr[ChatContent]
  }

  @js.native
  @Factory
  trait SendEventResponse extends js.Object {
    var AbsoluteTime: js.UndefOr[Instant]
    var Id: js.UndefOr[ChatItemId]
  }

  @js.native
  @Factory
  trait SendMessageRequest extends js.Object {
    var ConnectionToken: ParticipantToken
    var Content: ChatContent
    var ContentType: ChatContentType
    var ClientToken: js.UndefOr[ClientToken]
  }

  @js.native
  @Factory
  trait SendMessageResponse extends js.Object {
    var AbsoluteTime: js.UndefOr[Instant]
    var Id: js.UndefOr[ChatItemId]
  }

  @js.native
  sealed trait SortKey extends js.Any
  object SortKey extends js.Object {
    val DESCENDING = "DESCENDING".asInstanceOf[SortKey]
    val ASCENDING  = "ASCENDING".asInstanceOf[SortKey]

    val values = js.Object.freeze(js.Array(DESCENDING, ASCENDING))
  }

  /**
    * A filtering option for where to start. For example, if you sent 100 messages, start with message 50.
    */
  @js.native
  @Factory
  trait StartPosition extends js.Object {
    var AbsoluteTime: js.UndefOr[Instant]
    var Id: js.UndefOr[ChatItemId]
    var MostRecent: js.UndefOr[MostRecent]
  }

  /**
    * The websocket for the participant's connection.
    */
  @js.native
  @Factory
  trait Websocket extends js.Object {
    var ConnectionExpiry: js.UndefOr[ISO8601Datetime]
    var Url: js.UndefOr[PreSignedConnectionUrl]
  }
}
