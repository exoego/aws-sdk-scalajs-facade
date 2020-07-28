package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object kinesisvideosignaling {
  type Answer = String
  type ClientId = String
  type IceServerList = js.Array[IceServer]
  type MessagePayload = String
  type Password = String
  type ResourceARN = String
  type Ttl = Int
  type Uri = String
  type Uris = js.Array[Uri]
  type Username = String

  implicit final class KinesisVideoSignalingOps(private val service: KinesisVideoSignaling) extends AnyVal {

    @inline def getIceServerConfigFuture(params: GetIceServerConfigRequest): Future[GetIceServerConfigResponse] = service.getIceServerConfig(params).promise().toFuture
    @inline def sendAlexaOfferToMasterFuture(params: SendAlexaOfferToMasterRequest): Future[SendAlexaOfferToMasterResponse] = service.sendAlexaOfferToMaster(params).promise().toFuture
  }
}

package kinesisvideosignaling {
  @js.native
  @JSImport("aws-sdk", "KinesisVideoSignalingChannels", "AWS.KinesisVideoSignalingChannels")
  class KinesisVideoSignaling() extends js.Object {
    def this(config: AWSConfig) = this()

    def getIceServerConfig(params: GetIceServerConfigRequest): Request[GetIceServerConfigResponse] = js.native
    def sendAlexaOfferToMaster(params: SendAlexaOfferToMasterRequest): Request[SendAlexaOfferToMasterResponse] = js.native
  }

  @js.native
  trait GetIceServerConfigRequest extends js.Object {
    var ChannelARN: ResourceARN
    var ClientId: js.UndefOr[ClientId]
    var Service: js.UndefOr[Service]
    var Username: js.UndefOr[Username]
  }

  object GetIceServerConfigRequest {
    @inline
    def apply(
        ChannelARN: ResourceARN,
        ClientId: js.UndefOr[ClientId] = js.undefined,
        Service: js.UndefOr[Service] = js.undefined,
        Username: js.UndefOr[Username] = js.undefined
    ): GetIceServerConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelARN" -> ChannelARN.asInstanceOf[js.Any]
      )

      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIceServerConfigRequest]
    }
  }

  @js.native
  trait GetIceServerConfigResponse extends js.Object {
    var IceServerList: js.UndefOr[IceServerList]
  }

  object GetIceServerConfigResponse {
    @inline
    def apply(
        IceServerList: js.UndefOr[IceServerList] = js.undefined
    ): GetIceServerConfigResponse = {
      val __obj = js.Dynamic.literal()
      IceServerList.foreach(__v => __obj.updateDynamic("IceServerList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIceServerConfigResponse]
    }
  }

  /**
    * A structure for the ICE server connection data.
    */
  @js.native
  trait IceServer extends js.Object {
    var Password: js.UndefOr[Password]
    var Ttl: js.UndefOr[Ttl]
    var Uris: js.UndefOr[Uris]
    var Username: js.UndefOr[Username]
  }

  object IceServer {
    @inline
    def apply(
        Password: js.UndefOr[Password] = js.undefined,
        Ttl: js.UndefOr[Ttl] = js.undefined,
        Uris: js.UndefOr[Uris] = js.undefined,
        Username: js.UndefOr[Username] = js.undefined
    ): IceServer = {
      val __obj = js.Dynamic.literal()
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Ttl.foreach(__v => __obj.updateDynamic("Ttl")(__v.asInstanceOf[js.Any]))
      Uris.foreach(__v => __obj.updateDynamic("Uris")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IceServer]
    }
  }

  @js.native
  trait SendAlexaOfferToMasterRequest extends js.Object {
    var ChannelARN: ResourceARN
    var MessagePayload: MessagePayload
    var SenderClientId: ClientId
  }

  object SendAlexaOfferToMasterRequest {
    @inline
    def apply(
        ChannelARN: ResourceARN,
        MessagePayload: MessagePayload,
        SenderClientId: ClientId
    ): SendAlexaOfferToMasterRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelARN" -> ChannelARN.asInstanceOf[js.Any],
        "MessagePayload" -> MessagePayload.asInstanceOf[js.Any],
        "SenderClientId" -> SenderClientId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendAlexaOfferToMasterRequest]
    }
  }

  @js.native
  trait SendAlexaOfferToMasterResponse extends js.Object {
    var Answer: js.UndefOr[Answer]
  }

  object SendAlexaOfferToMasterResponse {
    @inline
    def apply(
        Answer: js.UndefOr[Answer] = js.undefined
    ): SendAlexaOfferToMasterResponse = {
      val __obj = js.Dynamic.literal()
      Answer.foreach(__v => __obj.updateDynamic("Answer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendAlexaOfferToMasterResponse]
    }
  }

  @js.native
  sealed trait Service extends js.Any
  object Service extends js.Object {
    val TURN = "TURN".asInstanceOf[Service]

    val values = js.Object.freeze(js.Array(TURN))
  }
}
