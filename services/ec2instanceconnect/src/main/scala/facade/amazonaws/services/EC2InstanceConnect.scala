package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object ec2instanceconnect {
  type AvailabilityZone = String
  type InstanceId       = String
  type InstanceOSUser   = String
  type RequestId        = String
  type SSHPublicKey     = String
  type Success          = Boolean

  implicit final class EC2InstanceConnectOps(private val service: EC2InstanceConnect) extends AnyVal {

    @inline def sendSSHPublicKeyFuture(params: SendSSHPublicKeyRequest): Future[SendSSHPublicKeyResponse] =
      service.sendSSHPublicKey(params).promise().toFuture
  }
}

package ec2instanceconnect {
  @js.native
  @JSImport("aws-sdk", "EC2InstanceConnect")
  class EC2InstanceConnect() extends js.Object {
    def this(config: AWSConfig) = this()

    def sendSSHPublicKey(params: SendSSHPublicKeyRequest): Request[SendSSHPublicKeyResponse] = js.native
  }

  @js.native
  trait SendSSHPublicKeyRequest extends js.Object {
    var AvailabilityZone: AvailabilityZone
    var InstanceId: InstanceId
    var InstanceOSUser: InstanceOSUser
    var SSHPublicKey: SSHPublicKey
  }

  object SendSSHPublicKeyRequest {
    @inline
    def apply(
        AvailabilityZone: AvailabilityZone,
        InstanceId: InstanceId,
        InstanceOSUser: InstanceOSUser,
        SSHPublicKey: SSHPublicKey
    ): SendSSHPublicKeyRequest = {
      val __obj = js.Dynamic.literal(
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "InstanceId"       -> InstanceId.asInstanceOf[js.Any],
        "InstanceOSUser"   -> InstanceOSUser.asInstanceOf[js.Any],
        "SSHPublicKey"     -> SSHPublicKey.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendSSHPublicKeyRequest]
    }
  }

  @js.native
  trait SendSSHPublicKeyResponse extends js.Object {
    var RequestId: js.UndefOr[RequestId]
    var Success: js.UndefOr[Success]
  }

  object SendSSHPublicKeyResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[RequestId] = js.undefined,
        Success: js.UndefOr[Success] = js.undefined
    ): SendSSHPublicKeyResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Success.foreach(__v => __obj.updateDynamic("Success")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendSSHPublicKeyResponse]
    }
  }
}
