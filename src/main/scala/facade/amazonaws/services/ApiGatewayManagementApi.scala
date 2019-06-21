package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object apigatewaymanagementapi {
  type Data     = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type __string = String

  implicit final class ApiGatewayManagementApiOps(val service: ApiGatewayManagementApi) extends AnyVal {

    def postToConnectionFuture(params: PostToConnectionRequest): Future[js.Object] =
      service.postToConnection(params).promise.toFuture
  }
}

package apigatewaymanagementapi {
  @js.native
  @JSImport("aws-sdk", "ApiGatewayManagementApi")
  class ApiGatewayManagementApi() extends js.Object {
    def this(config: AWSConfig) = this()

    def postToConnection(params: PostToConnectionRequest): Request[js.Object] = js.native
  }

  @js.native
  trait PostToConnectionRequest extends js.Object {
    var ConnectionId: __string
    var Data: Data
  }

  object PostToConnectionRequest {
    def apply(
        ConnectionId: __string,
        Data: Data
    ): PostToConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any],
        "Data"         -> Data.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PostToConnectionRequest]
    }
  }
}
