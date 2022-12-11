package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ec2instanceconnect {
  type AvailabilityZone = String
  type InstanceId = String
  type InstanceOSUser = String
  type RequestId = String
  type SSHPublicKey = String
  type SerialPort = Int
  type Success = Boolean

  final class EC2InstanceConnectOps(private val service: EC2InstanceConnect) extends AnyVal {

    @inline def sendSSHPublicKeyFuture(params: SendSSHPublicKeyRequest): Future[SendSSHPublicKeyResponse] = service.sendSSHPublicKey(params).promise().toFuture
    @inline def sendSerialConsoleSSHPublicKeyFuture(params: SendSerialConsoleSSHPublicKeyRequest): Future[SendSerialConsoleSSHPublicKeyResponse] = service.sendSerialConsoleSSHPublicKey(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ec2instanceconnect", JSImport.Namespace, "AWS.EC2InstanceConnect")
  class EC2InstanceConnect() extends js.Object {
    def this(config: AWSConfig) = this()

    def sendSSHPublicKey(params: SendSSHPublicKeyRequest): Request[SendSSHPublicKeyResponse] = js.native
    def sendSerialConsoleSSHPublicKey(params: SendSerialConsoleSSHPublicKeyRequest): Request[SendSerialConsoleSSHPublicKeyResponse] = js.native
  }
  object EC2InstanceConnect {
    @inline implicit def toOps(service: EC2InstanceConnect): EC2InstanceConnectOps = {
      new EC2InstanceConnectOps(service)
    }
  }

  @js.native
  trait SendSSHPublicKeyRequest extends js.Object {
    var InstanceId: InstanceId
    var InstanceOSUser: InstanceOSUser
    var SSHPublicKey: SSHPublicKey
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
  }

  object SendSSHPublicKeyRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        InstanceOSUser: InstanceOSUser,
        SSHPublicKey: SSHPublicKey,
        AvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    ): SendSSHPublicKeyRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "InstanceOSUser" -> InstanceOSUser.asInstanceOf[js.Any],
        "SSHPublicKey" -> SSHPublicKey.asInstanceOf[js.Any]
      )

      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait SendSerialConsoleSSHPublicKeyRequest extends js.Object {
    var InstanceId: InstanceId
    var SSHPublicKey: SSHPublicKey
    var SerialPort: js.UndefOr[SerialPort]
  }

  object SendSerialConsoleSSHPublicKeyRequest {
    @inline
    def apply(
        InstanceId: InstanceId,
        SSHPublicKey: SSHPublicKey,
        SerialPort: js.UndefOr[SerialPort] = js.undefined
    ): SendSerialConsoleSSHPublicKeyRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "SSHPublicKey" -> SSHPublicKey.asInstanceOf[js.Any]
      )

      SerialPort.foreach(__v => __obj.updateDynamic("SerialPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendSerialConsoleSSHPublicKeyRequest]
    }
  }

  @js.native
  trait SendSerialConsoleSSHPublicKeyResponse extends js.Object {
    var RequestId: js.UndefOr[RequestId]
    var Success: js.UndefOr[Success]
  }

  object SendSerialConsoleSSHPublicKeyResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[RequestId] = js.undefined,
        Success: js.UndefOr[Success] = js.undefined
    ): SendSerialConsoleSSHPublicKeyResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Success.foreach(__v => __obj.updateDynamic("Success")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendSerialConsoleSSHPublicKeyResponse]
    }
  }
}
