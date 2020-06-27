package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object kinesisvideosignaling {
  type Answer         = String
  type ClientId       = String
  type IceServerList  = js.Array[IceServer]
  type MessagePayload = String
  type Password       = String
  type ResourceARN    = String
  type Ttl            = Int
  type Uri            = String
  type Uris           = js.Array[Uri]
  type Username       = String

  implicit final class KinesisVideoSignalingOps(private val service: KinesisVideoSignaling) extends AnyVal {

    @inline def getIceServerConfigFuture(params: GetIceServerConfigRequest): Future[GetIceServerConfigResponse] =
      service.getIceServerConfig(params).promise().toFuture
    @inline def sendAlexaOfferToMasterFuture(
        params: SendAlexaOfferToMasterRequest
    ): Future[SendAlexaOfferToMasterResponse] = service.sendAlexaOfferToMaster(params).promise().toFuture
  }
}

package kinesisvideosignaling {
  @js.native
  @JSImport("aws-sdk", "KinesisVideoSignalingChannels")
  class KinesisVideoSignaling() extends js.Object {
    def this(config: AWSConfig) = this()

    def getIceServerConfig(params: GetIceServerConfigRequest): Request[GetIceServerConfigResponse] = js.native
    def sendAlexaOfferToMaster(params: SendAlexaOfferToMasterRequest): Request[SendAlexaOfferToMasterResponse] =
      js.native
  }

  @js.native
  @Factory
  trait GetIceServerConfigRequest extends js.Object {
    var ChannelARN: ResourceARN
    var ClientId: js.UndefOr[ClientId]
    var Service: js.UndefOr[Service]
    var Username: js.UndefOr[Username]
  }

  @js.native
  @Factory
  trait GetIceServerConfigResponse extends js.Object {
    var IceServerList: js.UndefOr[IceServerList]
  }

  /**
    * A structure for the ICE server connection data.
    */
  @js.native
  @Factory
  trait IceServer extends js.Object {
    var Password: js.UndefOr[Password]
    var Ttl: js.UndefOr[Ttl]
    var Uris: js.UndefOr[Uris]
    var Username: js.UndefOr[Username]
  }

  @js.native
  @Factory
  trait SendAlexaOfferToMasterRequest extends js.Object {
    var ChannelARN: ResourceARN
    var MessagePayload: MessagePayload
    var SenderClientId: ClientId
  }

  @js.native
  @Factory
  trait SendAlexaOfferToMasterResponse extends js.Object {
    var Answer: js.UndefOr[Answer]
  }

  @js.native
  sealed trait Service extends js.Any
  object Service extends js.Object {
    val TURN = "TURN".asInstanceOf[Service]

    val values = js.Object.freeze(js.Array(TURN))
  }
}
