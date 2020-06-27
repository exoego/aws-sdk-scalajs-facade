package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  @Factory
  trait SendSSHPublicKeyRequest extends js.Object {
    var AvailabilityZone: AvailabilityZone
    var InstanceId: InstanceId
    var InstanceOSUser: InstanceOSUser
    var SSHPublicKey: SSHPublicKey
  }

  @js.native
  @Factory
  trait SendSSHPublicKeyResponse extends js.Object {
    var RequestId: js.UndefOr[RequestId]
    var Success: js.UndefOr[Success]
  }
}
