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

  implicit final class ApiGatewayManagementApiOps(private val service: ApiGatewayManagementApi) extends AnyVal {

    @inline def postToConnectionFuture(params: PostToConnectionRequest): Future[js.Object] =
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
    @inline
    def apply(
        ConnectionId: __string,
        Data: Data
    ): PostToConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any],
        "Data"         -> Data.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PostToConnectionRequest]
    }
  }
}
